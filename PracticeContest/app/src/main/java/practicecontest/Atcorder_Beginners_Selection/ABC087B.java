package practicecontest.Atcorder_Beginners_Selection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import 汎用.硬貨;

import static 汎用.硬貨.*;

public class ABC087B {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            入力値 input = new 入力値(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            回答のリスト 全回答=全件網羅(input);
            long result = 全回答.回答List().stream().filter(x ->合計金額が予定通りの件数をカウント(input,x)).count();
            System.out.println(result);
        }
    }

    public static 回答のリスト 全件網羅(入力値 input) {
        List<計算結果と内容> list = new ArrayList<>();
        for(int 五十円玉枚数=0 ; 五十円玉枚数 <= input.五十円玉の枚数();五十円玉枚数++){
            金 五十円分 = new 金(五十円硬貨,五十円玉枚数);
            for(int 百円玉枚数 = 0 ; 百円玉枚数 <= input.百円玉の枚数();百円玉枚数++){
                金 百円分 = new 金(百円硬貨,百円玉枚数);
                for(int 五百円玉枚数 = 0 ;五百円玉枚数 <= input.五百円玉の枚数();五百円玉枚数++){
                    金 五百円分 = new 金(五百円硬貨,五百円玉枚数);
                    list.add(new 計算結果と内容(五百円分,百円分,五十円分));
                }
            }
        }
        回答のリスト result = new 回答のリスト(list);
        return result;
    }

    public static boolean 合計金額が予定通りの件数をカウント(入力値 input , 計算結果と内容 value){
        return input.合計金額() == value.合計金額の取得();
    }
}


record 入力値(
  int 五百円玉の枚数,
  int 百円玉の枚数,
  int 五十円玉の枚数,
  int 合計金額
){}

record 回答のリスト(
  List<計算結果と内容> 回答List
){}

record 計算結果と内容(
        金 五百円玉の枚数,
        金 百円玉の枚数,
        金 五十円玉の枚数
){
    public int 合計金額の取得(){
        return 五百円玉の枚数.合計金額の取得() + 百円玉の枚数.合計金額の取得() + 五十円玉の枚数.合計金額の取得();
    }
}



record 金(
    硬貨 coin
    ,int 枚数
){
    public int 合計金額の取得(){
        return coin.get金額()*枚数;
    }
}