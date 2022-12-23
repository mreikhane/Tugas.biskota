import java.util.ArrayList;

public class biskota {
    public static void main(String[] args) {
        ArrayList<int[]> StopGo = new ArrayList<int[]>();
        //Array pertama orang naik bus, Array kedua orang turun dari bus
        StopGo.add(new int[]{10, 0});
        StopGo.add(new int[]{3, 5});
        StopGo.add(new int[]{2, 5});
        System.out.println(getPassanger(StopGo));
    }

    public static int getPassanger (ArrayList<int []> biskota){
        return biskota.get(0)[0]-biskota.get(0)[1]+biskota.get(1)[0]-biskota.get(1)[1]+biskota.get(2)[0]-biskota.get(2)[1];

    }
}
