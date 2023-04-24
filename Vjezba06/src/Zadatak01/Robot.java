package Zadatak01;

import java.util.Comparator;

public class Robot implements Comparator<Robot> {
    private String name;
    private int id;
    private static int cntID = 10;
    private static final int minl = 3;
    private static final int maxl = 15;
    private static final String alph = "abcdefghijklmnprstuvzxywabcdefghijklmnoprsxyw123456789";

    public Robot(String name){
        this.name = name;
        this.id = cntID++;
    }

    @Override
    public int compare(Robot o1, Robot o2) {
        return 0;
    }

    private String genrateName(){
        String name = "";
        int lng_chars = (int) Math.random()*(maxl-minl) + minl;

        return name;
    }
}
