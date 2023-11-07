package lecture02;
import java.util.Scanner;
public class Keisan {
    Scanner input = new Scanner(System.in);
    int[] a = new int[5];
    int goukei(){
        int sum = 0;
        for(int i=0;i<5;i++) {
            System.out.printf("数字%dつ目",i);
            a[i] = input.nextInt();
            sum = sum + a[i];
            System.out.println("");
        }
        return sum;
    }

    void hantei(int sum){
        System.out.println("合計値："+sum);
        if(sum>=100) {
            System.out.println("great!!");
        }
        else if(sum>=50) {
            System.out.println("big");
        }
        else {
            System.out.println("small");
        }
    }
}
