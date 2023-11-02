package lecture02;

import java.util.Objects;

public class Gakuseki {
     void Hantei(String num, String gaku) {
        if (Objects.equals(num, gaku)) {
            System.out.print("complete!!");
        } else {
            System.out.print("error!!");
        }
    }
}


