package practicecontest.Atcorder_Beginners_Selection;

import java.util.Scanner;
import 汎用.硬貨;
public class ABC087B {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            入力値 input = new 入力値(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            System.out.println(input.五百円玉の枚数());
        }
    }
}
record 入力値(
  int 五百円玉の枚数,
  int 百円玉の枚数,
  int 五十円玉の枚数,
  int 合計金額
){}

record 金(
    硬貨 coin
    ,int number
){}