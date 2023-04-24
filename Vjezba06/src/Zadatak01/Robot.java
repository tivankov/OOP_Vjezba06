package Zadatak01;

import java.util.Comparator;

public class Robot implements Comparator<Robot> {
    private String name;
    private int id;
    private static int cntID = 10;
    private static final int minl = 3;
    private static final int maxl = 15;
    private static final String alph = "abcdefghijklmnprstuvzxywabcdefghijklmnoprsxyw123456789";

    public Robot(){
        this.name = name;
        this.id = cntID++;
    }

    @Override
    public int compare(Robot o1, Robot o2) {
        if(o1.getName().length() > o2.getName().length()){
            return 1;
        }else if (o1.getName().length() < o2.getName().length()){
            return -1;
        }else {
            return 0;
        }
    }

    private String genrateName(){
        String name = "";
        int lng_chars = (int) Math.random()*(maxl-minl) + minl;
        for (int k = 0; k< lng_chars; k++){
            int pos = (int) Math.random()+(alph.length()-1);
            name += alph.charAt(pos);
        }

        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCntID() {
        return cntID;
    }

    public static void setCntID(int cntID) {
        Robot.cntID = cntID;
    }

    @Override
    public String toString() {
        return "name='" + name;
    }
}
