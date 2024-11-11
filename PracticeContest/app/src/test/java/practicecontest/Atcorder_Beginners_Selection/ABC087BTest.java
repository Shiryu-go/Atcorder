package practicecontest.Atcorder_Beginners_Selection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import 出力関係.StandardInputStream;
import 出力関係.StandardOutputStream;

import static org.assertj.core.api.Assertions.assertThat;

// https://atcoder.jp/contests/abs/tasks/abc087_b
public class ABC087BTest {
    private final StandardInputStream in = new StandardInputStream();
    private final StandardOutputStream out = new StandardOutputStream();

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
    public void ABC087BTestSampleInput01() {
        in.inputln("2");
        in.inputln("2");
        in.inputln("2");
        in.inputln("100");
        ABC087B.main(null);
        assertThat(out.readLine()).isEqualTo("2");
    }

    @Test
    public void ABC087BTestSampleInput02() {
        in.inputln("5");
        in.inputln("1");
        in.inputln("0");
        in.inputln("150");
        ABC087B.main(null);
        assertThat(out.readLine()).isEqualTo("0");
    }

    @Test
    public void ABC087BTestSampleInput03() {
        in.inputln("30");
        in.inputln("40");
        in.inputln("50");
        in.inputln("6000");
        ABC087B.main(null);
        assertThat(out.readLine()).isEqualTo("213");

    }
}