package practicecontest.Atcorder_Beginners_Selection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
https://atcoder.jp/contests/abs/tasks/abc081_b
 */
public class ABC081B {
import java.util.Scanner;

public class ABC081B {
    public static void main(String[] args) {
        NumberList numbers = LoadInput.Load();
        int result = divideUntilOdd(numbers);
        System.out.println(result);
    }

    private static int divideUntilOdd(NumberList numbers) {
        if (numbers.isNotAllEven()) {
            return numbers.count;
        }
        return divideUntilOdd(numbers.Divide());
    }
}

class LoadInput{
    static NumberList Load(){
        int size;
        String[] array;
        try(Scanner sc = new Scanner(System.in)){
            String digit = sc.nextLine();
            size=Integer.parseInt(digit);
            // 配列のサイズを確保
            array = new String[size];
            //一行から空白で区切られた数字を読み込む
            array = sc.nextLine().split(" ");
        }
        return new NumberList(0,array);
    }

}

class NumberList{
    int count=0;
    ArrayList<Integer> numberList;

    public NumberList(int count, String[] array){
        this.numberList = new ArrayList<>();
        this.count = count;
        for(String number : array){
            this.numberList.add(Integer.valueOf(number));
        }
    }
    public NumberList(int count, ArrayList<Integer> numberList){
        this.count = count;
        this.numberList = numberList;
    }
    // 全ての数が偶数であることを確認するメソッド
    public boolean isNotAllEven(){
        for(int number : this.numberList){
            if(number%2==1){
                return true;
            }
        }
        return false;
    }
    // 全ての数が偶数であることを確認し、2で割った数を返す
    public NumberList Divide(){
        ArrayList<Integer> newNumberList = new ArrayList<>();
        for(int number : this.numberList){
            newNumberList.add(number/2);
        }
        return new NumberList(this.count+1,newNumberList);
    }

    
}
