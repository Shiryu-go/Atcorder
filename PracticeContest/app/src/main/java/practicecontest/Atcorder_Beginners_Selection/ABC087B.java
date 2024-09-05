package practicecontest.Atcorder_Beginners_Selection;

import java.util.Scanner;

public class ABC087B {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            System.out.println(number);
        }
    }
}

enum 硬貨{
    五百円硬貨(500),
    百円硬貨(100),
    五十円硬貨(100),
        ;
    private final Integer 金額;

    硬貨(int i) {
        金額 = i;
    }
};

record 金(
    硬貨 coin
    ,int number
){}