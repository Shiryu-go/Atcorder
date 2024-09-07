package practicecontest.Atcorder_Beginners_Selection;

import java.util.Scanner;
import 汎用.硬貨;
public class ABC087B {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            System.out.println(number);
        }
    }
}


record 金(
    硬貨 coin
    ,int number
){}