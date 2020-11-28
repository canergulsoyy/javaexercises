import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int dec_num,rem;
        String hexdec_num="";

        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F',};
        Scanner input=new Scanner(System.in);
        System.out.println("Input a decimal number: ");
        dec_num=input.nextInt();

        while (dec_num>0)
        {
            rem= dec_num%16;
            hexdec_num= hex[rem] + hexdec_num;
            dec_num= dec_num/16;

        }
        System.out.println("Hexadecimal number is: " +hexdec_num+"\n");
    }
}
