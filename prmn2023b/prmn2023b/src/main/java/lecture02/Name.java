package lecture02;
import java.util.Scanner;
public class Name {
    Scanner input = new Scanner(System.in);
    int search(String[][] a) {
        String bangou = input.next();
        for (int i = 0; i < 5; i++) {
            if (bangou.equals(a[i][0])) {
                return i;
            }
        }
        System.out.println("error!!");
        System.exit(0);
        return 0;
    }

    void access(String[][] b,int x){
        System.out.print("パスワードを入力してください：");
        String pass = input.next();
        if(pass.equals(b[x][1])) {
            System.out.println("ログイン完了");
            System.exit(0);
        }
        else{
            System.out.println("不正なアクセス");
            System.exit(0);
        }
    }
}
