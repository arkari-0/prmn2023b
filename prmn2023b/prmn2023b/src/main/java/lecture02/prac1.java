package lecture02;
import java.util.Scanner;
public class prac1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("学籍番号を入力してください。：");
        String gakuseki = input.next();
        Gakuseki gaku = new Gakuseki();
        gaku.hantei(gakuseki);
    }
}
