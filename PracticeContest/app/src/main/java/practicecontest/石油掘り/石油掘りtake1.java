package practicecontest.石油掘り;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"NonAsciiCharacters", "ClassEscapesDefinedScope"})
public class 石油掘りtake1 {
    static int 操作コスト;
    static List<List<Integer>> 座標リスト = null;
    //座標リストの中身は石油埋蔵量
    static int n = 0;

    public static void main(String[] args){

    }

    public static void 座標リストの初期化(int n){
        for(int a = 0 ; a <= n ; a++){
            List<Integer> 初期化用リスト = new ArrayList<>();
            for(int b = 0 ; b <= n ; b++){
                初期化用リスト.add(0);
            }
            座標リスト.add(初期化用リスト);
        }
    }
    public static void 座標リストの更新(座標 Local_座標){
        座標リスト.get(Local_座標.横方向()).set(Local_座標.縦方向(), Local_座標.石油埋蔵量());
    }
    public static List<座標> 座標リストから石油が存在する座標を取得(){
        List<座標> 戻り値 = new ArrayList<>();
        for(int a = 0 ; a <= n ; a++){
            for(int b = 0 ; b <= n ; b++){
                if(座標リスト.get(a).get(b)>0){
                    戻り値.add(new 座標(a,b,座標リスト.get(a).get(b)));
                }
            }
        }
        return 戻り値;
    }
}

@SuppressWarnings("NonAsciiCharacters")
record 座標(
        int 横方向,
        int 縦方向,
        int 石油埋蔵量
){}
