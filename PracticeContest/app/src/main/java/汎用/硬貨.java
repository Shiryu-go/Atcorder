package 汎用;

public enum 硬貨 {
    五百円硬貨(500),
    百円硬貨(100),
    五十円硬貨(100),
    ;
    private final Integer 金額;

    硬貨(int i) {
        金額 = i;
    }
};
