package lecture02;

import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {

        String number = "B2001000";

        Scanner scan = new Scanner(System.in);
        System.out.print("学績番号を入力してください。:");
        String gakuseki = scan.next();

        Gakuseki han = new Gakuseki();
        han.Hantei(number,gakuseki);

    }
}
