import java.util.Scanner;

/**
 * CheckPrimeNumber
 */
public class CheckPrimeNumber {

    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = obj.nextInt();
        int count = 0;
        for(int i=2; i<n; i++){
                     if (n % i ==0) 
                count++;
                break;
            }
            if (count==0) {
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
    }
}