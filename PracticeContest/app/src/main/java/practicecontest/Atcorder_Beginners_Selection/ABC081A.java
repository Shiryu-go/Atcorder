package practicecontest.Atcorder_Beginners_Selection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ABC081A {
    public static  void main(String[] args){
        int count=0;
        try(Scanner sc = new Scanner(System.in)){
            String digit = sc.nextLine();
            char[] list = digit.toCharArray();
            for(int i = 0; i < 3; i++) {
                if (Character.getNumericValue(list[i]) == 1) {
                    count++;
                    System.out.println(list[i]);
                }
            }
            System.out.print(count);
        }
    }
}
