package practicecontest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import 出力関係.StandardInputStream;
import 出力関係.StandardOutputStream;

import static org.assertj.core.api.Assertions.*;

//TODO 詳細について調べる
// https://qiita.com/aky100200/items/f4f7d6279524774610fc

public class WelcomeToAtcorderTest {
    private StandardInputStream in = new StandardInputStream();
    private StandardOutputStream out = new StandardOutputStream();

    @BeforeEach
    public void before() {
        System.setIn(in);
        System.setOut(out);
    }

    @AfterEach
    public void after() {
        System.setIn(null);
        System.setOut(null);
    }

    @Test
    public void main01() {
        in.inputln("1");
        in.inputln("2 3");
        in.inputln("hoge");
        assertThat("A").isEqualTo("A");
    }
}
