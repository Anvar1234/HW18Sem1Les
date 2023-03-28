package lesson1.homework;
public class HWtask2 {
    public static void hwTask2(int a2) {

        int fact = 1;
        while(a2 > 0){
            fact *= a2;
            a2 --;
        }
        System.out.println("Факториал n = "+ fact);
    }
}
