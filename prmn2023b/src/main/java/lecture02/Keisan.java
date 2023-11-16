package lecture02;

public class Keisan {
    int ans=0;
    void sum(int[] x){
        for (int j : x) {
            ans += j;
        }
        System.out.println("合計:"+ans);
    }
    void output(){
        if(ans<=49){
            System.out.print("small");
        }else if(ans<=99){
            System.out.print("big");
        }else {
            System.out.print("great!");
        }
    }
}

