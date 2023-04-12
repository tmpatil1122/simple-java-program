
//Bill of differnt items with simple java code 
import java.util.*;

public class simpletax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Total Bill is= " + total);

        // Tax calculation of 18% on a bill
        float tax = total + (0.18f * total);
        System.out.println("Bill with 18% tax is= " + tax);
    }
}