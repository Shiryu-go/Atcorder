package practicecontest.Atcorder_Beginners_Selection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import 汎用.硬貨;
public class ABC087B {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            入力値 input = new 入力値(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            System.out.println(input.五百円玉の枚数());
        }
    }

    public 回答のリスト 全件網羅() {
        List<回答> list = new ArrayList<>();
        return new 回答のリスト(list);
    }
}


record 入力値(
  int 五百円玉の枚数,
  int 百円玉の枚数,
  int 五十円玉の枚数,
  int 合計金額
){}

record 回答のリスト(
  List<回答> 回答List
){}

record 回答(
        int 五百円玉の枚数,
        int 百円玉の枚数,
        int 五十円玉の枚数
){}



record 金(
    硬貨 coin
    ,int number
){}