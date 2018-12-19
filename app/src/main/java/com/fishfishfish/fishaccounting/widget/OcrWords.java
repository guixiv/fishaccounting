package com.fishfishfish.fishaccounting.widget;

import java.util.ArrayList;

public class OcrWords {
    private long log_id;
    private ArrayList<words> words_result = new ArrayList<>();
    private int words_result_num;
    private int direction;

    public ArrayList<words> getWords_result() {
        return words_result;
    }

    public void setWords_result(ArrayList<words> words_result) {
        this.words_result = words_result;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getWords_result_num() {
        return words_result_num;
    }

    public void setWords_result_num(int words_result_num) {
        this.words_result_num = words_result_num;
    }

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }
}
