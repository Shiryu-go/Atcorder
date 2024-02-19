package practicecontest.石油掘り;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import 出力関係.StandardInputStream;
import 出力関係.StandardOutputStream;

public class 石油掘りtake1Test {
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
    public void 入力へのテスト(){

    }
    @Test
    public void 油田の形の保持ができているかの確認(){
        in.inputln("10 2 0.1");
        in.inputln("");
    }
}
