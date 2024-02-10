package practicecontest.kashima2024;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import 出力関係.StandardInputStream;
import 出力関係.StandardOutputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class BTest {
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
    public void 入力チェック_入力例1(){
        in.inputln("5");
        in.inputln("1 20");
        in.inputln("1 30");
        in.inputln("2 1");
        in.inputln("1 40");
        in.inputln("2 3");
        B.main(null);
        assertThat(out.readLine()).isEqualTo("30\n" +
                "20");
    }


}