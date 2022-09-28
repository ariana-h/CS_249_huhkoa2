package edu.huhkoa2.Exercises_08;

public class Stats {
    public static void main(String [] args){
        final int COUNT = 100;
        final double MAX_VAL = 78.0;
        double [] nums = new double[COUNT];
        for (int i = 0; i < nums.length; i++){
            nums[i] = Math.random()*MAX_VAL;
        }

        double ave = 0;
        for (double x: nums){
            ave+=x;
        }

        ave /= COUNT;

        System.out.println("AVERAGE: " + ave);
    }
}
