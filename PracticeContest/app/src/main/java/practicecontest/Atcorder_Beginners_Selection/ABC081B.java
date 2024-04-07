package practicecontest.Atcorder_Beginners_Selection;

import java.util.ArrayList;

public class ABC081B {
    public static void main(String[] args) {

    }
}

record Domain(
    int size,
    NumberList numberList

){
    private Domain(int size, NumberList array){
        // sizeがIntegerに変換できることを確認する
        this.size = size;
        this.numberList = new NumberList(array);
    }
}

class NumberList{
    ArrayList<Integer> numberList;

    public NumberList(ArrayList<String> numberList){
        this.numberList = new ArrayList<>();
        for(String number : numberList){
            this.numberList.add(Integer.parseInt(number));
        }
    }
    public NumberList(String[] array){
        this.numberList = new ArrayList<>();
        for(String number : array){
            this.numberList.add(Integer.parseInt(number));
        }
    }
}
