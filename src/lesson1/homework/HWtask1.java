package lesson1.homework;
public class HWtask1 {
    public static void hwTask1(int a) {

        int sum = 0;
        while(a > 0){
            sum += a;
            a--;
        }
        System.out.println("n-ое треугольное число = "+ sum);
    }
}
