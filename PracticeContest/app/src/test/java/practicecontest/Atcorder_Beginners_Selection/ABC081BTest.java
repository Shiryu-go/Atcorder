package practicecontest.Atcorder_Beginners_Selection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import 出力関係.StandardInputStream;
import 出力関係.StandardOutputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class ABC081BTest {
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
        in.inputln("3" );
        in.inputln("8 12 40");
        ABC081B.main(null);
        assertThat(out.readLine()).isEqualTo("2");
    }
    @Test
    public void main02(){
        in.inputln("4" );
        in.inputln("5 6 8 10");
        ABC081B.main(null);
        assertThat(out.readLine()).isEqualTo("0");
    }
    @Test
    public void main03(){
        in.inputln("6" );
        in.inputln("382253568 723152896 37802240 379425024 404894720 471526144");
        ABC081B.main(null);
        assertThat(out.readLine()).isEqualTo("8");
    }
}
