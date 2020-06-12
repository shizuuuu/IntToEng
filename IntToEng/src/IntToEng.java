
import java.util.Scanner;
public class IntToEng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }
    static String translateEng(int n) {
        return zeroToTen(n);
    }
    static String zeroToTen (int n) {
    	if (n == 1) return "one";
    	if (n == 2) return "two";
    	if (n == 3) return "three";
    	if (n == 4) return "four";
    	if (n == 5) return "five";
    	if (n == 6) return "six";
    	if (n == 7) return "seven";
    	if (n == 8) return "eight";
    	if (n == 9) return "nine";
    	if (n<10 && n==0) return "zero";
    }
}
