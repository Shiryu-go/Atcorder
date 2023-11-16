package practicecontest.Atcorder_Beginners_Selection;

import java.util.Scanner;

public class ABC081A {
    public static  void main(String[] args){
        int number = 0;
        try(Scanner sc = new Scanner(System.in)){
            if(sc.nextInt() == 1){
                number++;
            }
            if(sc.nextInt() == 1){
                number++;
            }
            if(sc.nextInt() == 1){
                number++;
            }
            System.out.print(number);
        }
    }
}
