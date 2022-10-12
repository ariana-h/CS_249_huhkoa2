package edu.huhkoa2.Exercises_10;

public class MethodDance {
    private int idata = 5;
    private static int sdata = 7;

    public int getInstanceData(){
        int x = idata + sdata;
        return idata;
    }

    public static int getStaticData(){
        //CANNOT: int y = sdata + idata;
        return sdata;
    }

    public static void main(String [] args){
        int s = MethodDance.getStaticData();

        MethodDance m = new MethodDance();
        int d = m.getInstanceData();
    }
}