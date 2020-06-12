
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
    	} else if (n < 100000) {
    		return tenthousandTo99999(n);
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
    	else if (nike == 1) return tenToNineteen(n%100);
    	else if (nike == 2) return "twenty " + zeroToNine(n%10);
    	else if (nike == 3) return "thirty " + zeroToNine(n%10);
    	else if (nike == 4) return "forty " + zeroToNine(n%10);
    	else if (nike == 5) return "fifty " + zeroToNine(n%10);
    	else if (nike == 6) return "sixty " + zeroToNine(n%10);
    	else if (nike == 7) return "seventy " + zeroToNine(n%10);
    	else if (nike == 8) return "eighty " + zeroToNine(n%10);
    	else if (nike == 9) return "ninety " + zeroToNine(n%10);
    	return "";
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
    
    static String hundredTo999 (int n) {
    	int sanketa = (n%1000) / 100;
    	if (sanketa == 0) return tenToNinetyNine(n%1000);
    	if (sanketa == 1) return "one hundred " + tenToNinetyNine(n%100);
    	if (sanketa == 2) return "two hundred " + tenToNinetyNine(n%100);
    	if (sanketa == 3) return "three hundred " + tenToNinetyNine(n%100);
    	if (sanketa == 4) return "four hundred " + tenToNinetyNine(n%100);
    	if (sanketa == 5) return "five hundred " + tenToNinetyNine(n%100);
    	if (sanketa == 6) return "six hundred " + tenToNinetyNine(n%100);
    	if (sanketa == 7) return "seven hundred " + tenToNinetyNine(n%100);
    	if (sanketa == 8) return "eight hundred " + tenToNinetyNine(n%100);
    	if (sanketa == 9) return "nine hundred " + tenToNinetyNine(n%100);
    	return "";
    }
    
    static String thousandTo9999(int n) {
    	int yonketa = (n%10000) / 1000;
    	if (yonketa == 0) return hundredTo999(n%10000);
    	if (yonketa == 1) return "one thousand " + hundredTo999(n%1000);
    	if (yonketa == 2) return "two thousand " + hundredTo999(n%1000);
    	if (yonketa == 3) return "three thousand " + hundredTo999(n%1000);
    	if (yonketa == 4) return "fory thousand " + hundredTo999(n%1000);
    	if (yonketa == 5) return "five thousand " + hundredTo999(n%1000);
    	if (yonketa == 6) return "six thousand " + hundredTo999(n%1000);
    	if (yonketa == 7) return "seven thousand " + hundredTo999(n%1000);
    	if (yonketa == 8) return "eight thousand " + hundredTo999(n%1000);
    	if (yonketa == 9) return "nine thousand " + hundredTo999(n%1000);
    	return "";
    }
    
    static String tenthousandTo99999(int n) {
    	int goketa = (n%100000) / 10000;
    	if (goketa == 0) return thousandTo9999(n%100000);
    	if (goketa == 1) return tenToNineteen((n%100000)/1000) + " thousand  " + hundredTo999(n%10000);
    	if (goketa == 2) return "twenty " + thousandTo9999(n%10000);
    	if (goketa == 3) return "thirty " + thousandTo9999(n%10000);
    	if (goketa == 4) return "forty " + thousandTo9999(n%10000);
    	if (goketa == 5) return "fifty " + thousandTo9999(n%10000);
    	if (goketa == 6) return "sixty " + thousandTo9999(n%10000);
    	if (goketa == 7) return "seventy " + thousandTo9999(n%10000);
    	if (goketa == 8) return "eighty " + thousandTo9999(n%10000);
    	if (goketa == 9) return "ninety " + thousandTo9999(n%10000);
    	return "";
    }
}
