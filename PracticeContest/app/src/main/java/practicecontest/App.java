/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package practicecontest;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Consumer ラムダ式 = (a)->System.out.print("ラムダ式");
        System.out.println(new App().getGreeting());
    }
}
