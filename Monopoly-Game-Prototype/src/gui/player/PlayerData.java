package gui.player;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayerData {
    public int currentSquareNumber = 0; // where player is currently located on (0 - 19). initially zero
    private ArrayList<Integer> titleDeeds = new ArrayList<Integer>(); // squares that the player has
    private int wallet = 3200; // initial money

    public int getCurrentSquareNumber() {
        return currentSquareNumber;
    }

    public void setCurrentSquareNumber(int currentSquareNumber) {
        this.currentSquareNumber = currentSquareNumber;
    }

    public ArrayList<Integer> getTitleDeeds() {
        return titleDeeds;
    }

    public void setTitleDeeds(ArrayList<Integer> titleDeeds) {
        this.titleDeeds = titleDeeds;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
}
