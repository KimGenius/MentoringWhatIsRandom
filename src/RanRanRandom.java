import java.util.Random;

public class RanRanRandom {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextLong());
        /*
            -1722874644
            false
            0.8459281808889022
            0.20337558
            -2619405380161169206
         */
        System.out.println(random.nextInt(10));
        //0~9
        System.out.println(random.nextInt(10) + 1);
        //1~10
        System.out.println(random.nextInt(10) + 5);
        //5~14
        System.out.println(random.nextInt(7) + 2);
        //2~8
    }
}