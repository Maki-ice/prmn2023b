package lecture02;

import java.util.Objects;
import java.util.Scanner;

public class Gakusei {
    String[][] x = new String[5][2];
    String num;
    String pass;

    void def() {
        x[0][0] = "B2001000";
        x[0][1] = "Apple";
        x[1][0] = "B2002000";
        x[1][1] = "Banana";
        x[2][0] = "B2003000";
        x[2][1] = "Orange";
        x[3][0] = "B2004000";
        x[3][1] = "Grape";
        x[4][0] = "B2005000";
        x[4][1] = "Peach";
    }
    void input_num(){
        Scanner scan = new Scanner(System.in);
        System.out.print("学績番号を入力");
        num = scan.next();
        for(int i=0;i<5;i++){
            if(Objects.equals(num,x[i][0])){
                input_name(i);
            }
        }
        System.out.print("error!");
        System.exit(0);
    }

    void input_name(int value){
        Scanner scan = new Scanner(System.in);
        System.out.print("パスワードを入力");
        pass = scan.next();
        if(Objects.equals(pass,x[value][1])) {
            System.out.print("ログイン完了");
            System.exit(0);
        }else{
            System.out.print("不正なアクセス");
            System.exit(0);
        }
    }
}



