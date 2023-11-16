package practicecontest.Atcorder_Beginners_Selection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
https://atcoder.jp/contests/abs/tasks/abc081_b
 */
public class ABC081B {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        int 数字を2で割れる回数 = 0;
        boolean 繰り返し = true;
        try(Scanner sc = new Scanner(System.in)){
            int 数字を読み込む回数 = sc.nextInt();
            for(int i = 0 ; i <= 数字を読み込む回数 ; i++){
                list.add(sc.nextInt());
            }
            while(繰り返し){
                for(int i = 0 ; i <= list.size() ; i++){
                    if(list.get(i)%2 == 0){
                        list.set(i,list.get(i)/2);
                    }else{
                        繰り返し = false;
                        break;
                    }
                }
                数字を2で割れる回数++;
            }
            System.out.println(数字を2で割れる回数);
        }
    }

}
