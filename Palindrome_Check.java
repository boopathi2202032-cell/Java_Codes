import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S=sc.nextLine();
        String rev=new StringBuilder(S).reverse().toString();
        if(S.equals(rev)){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}