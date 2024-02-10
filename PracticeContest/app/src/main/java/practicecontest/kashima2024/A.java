package practicecontest.kashima2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class A {
    static 入力 入力_record;

    public static List<Integer> 等差数列の計算(入力 in){
        List<Integer> 回答 = new ArrayList<>();
        回答.add(3);
        回答.add(5);
        回答.add(7);
        回答.add(9);
        return 回答;
    }

    public static void 内容の出力(List<Integer> list){

        for (Integer number : list) {
            System.out.print(number);
            if(!Objects.equals(number, list.get(list.size() - 1))){
                System.out.print(" ");
            };
        }
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            入力_record = new 入力(sc.nextInt(), sc.nextInt(),sc.nextInt());
        }
        内容の出力(等差数列の計算(入力_record));

    }
    record 入力(
            int 初項,
            int 末項,
            int 公差
    ){}
}
