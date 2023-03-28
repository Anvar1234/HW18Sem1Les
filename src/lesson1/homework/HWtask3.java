package lesson1.homework;

public class HWtask3 {
    public static void hwTask3(int a3) {
        int count = 0;
        for (int i = 2; i <= a3; i++) {
            count = 0;
            for (int j = 2; j <= a3-1; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(i);
            }
        }
    }
}
