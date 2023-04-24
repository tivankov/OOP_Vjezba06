import Zadatak01.Robot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestRobot {
    public static void main(String[] args) {
//        String test = "gjflkjghgLETTEERRR";
//        System.out.println(test);
//        System.out.println(test.length());
//        System.out.println(test.charAt(3));
//        int pos = (int) (Math.random()*(test.length())-1);
////        System.out.println("Position: " + pos + " ch: " + test.charAt(pos));
//        Robot robi1 = new Robot();
//        System.out.println(robi1);
//        Robot robi2 = new Robot();
//        System.out.println(robi2);
//        System.out.println(robi1.compare(robi1,robi2));
        ArrayList<Robot> robots = generateListOfRobots(7);
        System.out.println(robots);

    }

    private static ArrayList<Robot> generateListOfRobots(int numRobots){
        ArrayList<Robot> robots = new ArrayList<>(numRobots);
        for (int k =0; k < numRobots; k++){
            robots.add(new Robot());
        }
        return robots;
    }

    static class RobotBatteryComparator implements Comparator<Robot>{

        @Override
        public int compare(Robot o1, Robot o2) {
            return 0;
        }
    }
    private static void changeStatus(ArrayList<Robot> robots){
        for(Robot robi : robots){
//            robi.setStatus(true);
        }
    }
}
