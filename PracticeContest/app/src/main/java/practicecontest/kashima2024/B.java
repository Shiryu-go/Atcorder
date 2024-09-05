package practicecontest.kashima2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
    static List<Integer> 空の配列 = new ArrayList<>();
    static int クエリの数;
    static List<String> クエリリスト = new ArrayList<>();
    static List<Integer> 回答 = new ArrayList<>();

    public static void 計算x(int number){
        空の配列.add(number);
    }
    public static void 計算k(int number){
        回答.add(空の配列.get(number));
    }
    public static void 計算チェック(String str){
       if(str.charAt(0) == '1'){
           String[] parts = str.split(" ");
           計算x(Integer.parseInt(parts[1]));
       }else if(str.charAt(0)=='2'){
           String[] parts = str.split(" ");
           計算k(空の配列.size()- Integer.parseInt(parts[1]));
       }
    }
    //後ろから取るやり方わからんくて草
    //list.size()-number
    public static void 出力(List<Integer> list){
        list.forEach(System.out::println);
    }
    public static void main(String[] args){
        入力B_record 入力;
        try(Scanner sc = new Scanner(System.in)){
            クエリの数 = Integer.parseInt(sc.nextLine());
            while(sc.hasNextLine()){
                クエリリスト.add(sc.nextLine());
            }
           入力= new 入力B_record(クエリの数,クエリリスト);
        }
        for(String a : 入力.クエリリスト){
            計算チェック(a);
        }
        出力(回答);
    }
    record 入力B_record(
            int クエリの数,
            List<String> クエリリスト
    ){}
}
