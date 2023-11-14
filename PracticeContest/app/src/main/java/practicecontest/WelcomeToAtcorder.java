package practicecontest;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://atcoder.jp/contests/practice/tasks/practice_1
/*
高橋君はデータの加工が行いたいです。

整数 a,b,cと、文字列 s が与えられます。 a+b+c の計算結果と、文字列 s を並べて表示しなさい。

制約
1≤a,b,c≤1,000
1≤∣s∣≤100
入力
入力は以下の形式で与えられる。

a
b c
s
出力
a+b+c と s を空白区切りで 1 行に出力せよ。
 */
//TODO 回答は後ほど行う。
public class WelcomeToAtcorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> intlist = new ArrayList<>();
        int number = 0;
        intlist.add(sc.nextInt());
        intlist.add(sc.nextInt());
        intlist.add(sc.nextInt());
        String string = sc.next();
        for(int i : intlist){
            number+= i;
        }
        System.out.print(number + " " + string);
    }
    public static void main2(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            r += sc.nextInt();
            r += sc.nextInt();
            String s = sc.next();
            System.out.println(r + " " + s);
        }
    }
}