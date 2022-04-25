import java.util.Arrays;
import java.util.Random;

// Как можно оптимизировать процесс вывода наибольшего по модулю числа?), кажется что выглядит костыльно
public class task14 {
    public static void main(String[] args) {
        int [] ar = new int[15];
        int x = 0;
        Random random = new Random();
        for (int i = 0;i<15;i++){
            ar[i] = random.nextInt(41)-20;
        }
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        if(Math.abs(ar[0])>Math.abs(ar[14]))
            System.out.println(ar[0]);
        else
            System.out.println(ar[14]);
    }
}
