package practicecontest.Atcorder_Beginners_Selection;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import 出力関係.StandardInputStream;
import 出力関係.StandardOutputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class ABC086ATest {
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
        in.inputln("3 4" );
        ABC086A.main(null);
        assertThat(out.readLine()).isEqualTo("Even");
    }
    @Test
    public void main02(){
        in.inputln("1 21");
        ABC086A.main(null);
        assertThat(out.readLine()).isEqualTo("Odd");
    }

}
