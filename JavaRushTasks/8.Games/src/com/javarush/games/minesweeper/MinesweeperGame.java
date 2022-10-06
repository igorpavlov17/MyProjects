package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 12;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField = 0;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private int countFlags;
    private boolean isGameStopped;
    private int countClosedTiles = SIDE * SIDE;
    private int score = 0;

    @Override
    public void initialize() {//  Тут выполняем все действия по инициализации игры и ее объектов
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame(){
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean mine = getRandomNumber(20) < 1;
                if (mine == true)
                    countMinesOnField++;
                gameField[y][x] = new GameObject(x, y, mine);
                setCellValueEx(x, y, Color.TAN, "");
            }
        }
        countFlags = countMinesOnField;
        countMineNeighbors();
    }

    private void countMineNeighbors(){
        List<GameObject> list = new ArrayList<>();
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                if (!gameField[y][x].isMine) {
                    list = getNeighbors(gameField[y][x]);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).isMine)
                            gameField[y][x].countMineNeighbors++;
                    }
                }
            }
        }
    }

    private List<GameObject> getNeighbors(GameObject gameObject){
        List<GameObject> list = new ArrayList<>();
        for (int i = gameObject.y-1; i <= gameObject.y+1; i++) {
            for (int j = gameObject.x - 1; j <= gameObject.x + 1; j++) {
                if ((j != gameObject.x || i != gameObject.y) && (j >= 0 && i >= 0 && j < SIDE && i < SIDE)) {
                    list.add(gameField[i][j]);
                }
            }
        }
        return list;
    }

    private void openTile(int x, int y){
        if (!isGameStopped && !gameField[y][x].isOpen && !gameField[y][x].isFlag) {
            gameField[y][x].isOpen = true;
            countClosedTiles--;
            setCellColor(x, y, Color.WHITESMOKE);
            if (!gameField[y][x].isMine) {
                if (countClosedTiles == countMinesOnField)
                    win();
                score += 5;
                setScore(score);
                if (gameField[y][x].countMineNeighbors > 0)
                    setCellNumber(x, y, gameField[y][x].countMineNeighbors);
                else {
                    setCellValue(x, y, "");
                    List<GameObject> list = getNeighbors(gameField[y][x]);
                    for (int i = 0; i < list.size(); i++) {
                        if (!list.get(i).isOpen)
                            openTile(list.get(i).x, list.get(i).y);
                    }
                }
            } else {
                setCellValueEx(x, y, Color.RED, MINE);
                gameOver();
            }
        }
    }

    private void markTile(int x, int y){
        if (!isGameStopped) {
            if (!gameField[y][x].isOpen && !gameField[y][x].isFlag) {
                if (countFlags == 0)
                    return;
                gameField[y][x].isFlag = true;
                setCellValueEx(x, y, Color.YELLOW, FLAG);
                countFlags--;
            } else if (gameField[y][x].isFlag) {
                gameField[y][x].isFlag = false;
                countFlags++;
                setCellValueEx(x, y, Color.TAN, "");
            }
        }
    }

    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "Сапер ошибается\nтолько один раз☠", Color.RED, 50);
    }

    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.SKYBLUE, "А ты хорош!\uD83C\uDFC6", Color.BLACK, 60);
    }

    private void restart(){
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        countMinesOnField = 0;
        score = 0;
        setScore(score);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        super.onMouseLeftClick(x, y);
        if (!isGameStopped){
            openTile(x, y);
        }
        else{
            restart();
            return;
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        super.onMouseRightClick(x, y);
        markTile(x, y);
    }
}