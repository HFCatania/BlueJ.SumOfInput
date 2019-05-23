/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your number here.");
        int num = input.nextInt(), sum = 0;
        
        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }
        
        System.out.println("Sum = " + sum);
    }
}

