import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N =sc.nextDouble();
        int Rounded = (int)Math.ceil(N);
        System.out.print(Rounded);
    }
}