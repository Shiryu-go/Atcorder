package practicecontest.Atcorder_Beginners_Selection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import 出力関係.StandardInputStream;
import 出力関係.StandardOutputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class ABC081ATest {
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
    public void main01() {
        in.inputln("101" );
        ABC086A.main(null);
        assertThat(out.readLine()).isEqualTo("2");
    }
    @Test
    public void main02() {
        in.inputln("000" );
        ABC086A.main(null);
        assertThat(out.readLine()).isEqualTo("0");
    }
}
