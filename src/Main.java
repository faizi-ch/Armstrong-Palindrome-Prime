import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num=in.nextLong();
        checkArmstrong(num);
        checkPalindrome(num);
        checkPrime(num);
    }
    public static void checkArmstrong(long n) {
        long temp=n,sum=0,r;
        while (temp!=0) {
            r=temp%10;
            temp=temp/10;
            sum=sum+(r*r*r);
        }
        if (sum==n)
            System.out.println(n + " is an armstong number");
        else
            System.out.println(n + " is not an armstong number");
    }
    public static void checkPalindrome(long n) {
        long  temp=n,reverse=0;
        while (temp!=0) {
            reverse=reverse*10;
            reverse=reverse+temp%10;
            temp=temp/10;
        }
        if (reverse==n) {
            System.out.println(n + " is a palindrome number");
        }
        else {
            System.out.println(n + " is not a palindrome number");
        }
    }
    public static void checkPrime(long n) {
        //int temp=0;
        for (int i = 2; i <= n; i++) {
            if (n%i==0)
            {
                System.out.print(n + " is not a prime number");
            }
        }

        //else
        //System.out.println(a + " is not a prime number");
    }
}

