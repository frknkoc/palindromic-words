import java.util.Scanner;
public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Yeni kelime giriniz...");
            str = input.nextLine();
            System.out.println(isPalindrome(str));
            if (isPalindrome(str)){
                System.out.println("Girdiğiniz kelime palindromik");
            } else {
                System.out.println("Girdiğiniz kelime palindromik değil!!!");
            }
        }
    }
}