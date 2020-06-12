
import java.util.Scanner;
public class IntToEng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }
    static String translateEng(int n) {
    	if (n == 0) {
    		return "zero";
    	} else if (n < 100) {
    		return zeroToNinetyNine(n);
    	}
    	return "";

    }
    static String zeroToNine (int n) {
    	if (n == 1) return "one";
    	if (n == 2) return "two";
    	if (n == 3) return "three";
    	if (n == 4) return "four";
    	if (n == 5) return "five";
    	if (n == 6) return "six";
    	if (n == 7) return "seven";
    	if (n == 8) return "eight";
    	if (n == 9) return "nine";
    	return "";
    }
    static String tenToNinetyNine(int n) {

    	int nike = (n%100)/10;
    	if (nike == 0) return zeroToNine(n);
    	else if (nike == 1) return tenToNineteen(n);
    	else if (nike == 2) return "twenty " + zeroToNine(n%10);
    	else if (nike == 3) return "thity " + zeroToNine(n%10);
    	else if (nike == 4) return "forty " + zeroToNine(n%10);
    	else if (nike == 5) return "fifty " + zeroToNine(n%10);
    	else if (nike == 6) return "sixty " + zeroToNine(n%10);
    	else if (nike == 7) return "seventy " + zeroToNine(n%10);
    	else if (nike == 8) return "eighty " + zeroToNine(n%10);
    	else if (nike == 9) return "ninety " + zeroToNine(n%10);
    }
    static String tenToNineteen(int n) {
    	if (n == 10) return "ten";
    	if (n == 11) return "eleven";
    	if (n == 12) return "twelve";
    	if (n == 13) return "thirteen";
    	if (n == 14) return "fourteen";
    	if (n == 15) return "fifteen";
    	if (n == 16) return "sixteen";
    	if (n == 17) return "seventeen";
    	if (n == 18) return "eighteen";
    	if (n == 19) return "nineteen";
    	return "";
    }
}
