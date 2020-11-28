import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int dec_num, rem, quot, i=1, j;
        int oct_num[]=new int[100];
        Scanner input= new Scanner(System.in);

        System.out.println("Input a decimal number: ");
        dec_num= input.nextInt();

        quot=dec_num;

        while (quot != 0)
        {
            oct_num[i++] = quot%8;
            quot= quot/8;
        }
        System.out.println("Octal number is: ");
        for(j=i-1;j>0;j--)
        {
            System.out.print(oct_num[j]);
        }
        System.out.print("\n");
    }
}
