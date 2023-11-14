package practicecontest.Atcorder_Beginners_Selection;

import java.util.Scanner;

public class ABC086A {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            number += sc.nextInt();
            if(number %2 == 0){
                System.out.println("Even");
            } else if (number %2==1) {
                System.out.println("Odd");
            }
            else{
                System.out.println("Error");
            }
        }
    }
}
