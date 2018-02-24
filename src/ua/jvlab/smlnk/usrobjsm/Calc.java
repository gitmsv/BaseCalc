package ua.jvlab.smlnk.usrobjsm;

/**
 * This Class is model 'Console calculate'
 */

/**
 * @author $.m.lnk
 * @version 1.0
 * @date 2018-02-25
 */

public class Calc {

    public static final String NAME_CLC = " ==> console Calc / ver. 1.0";

    private int n; // 0;

    public int getN() {
        return n;
    }

    public Calc() {
        super();
    }

    public Calc(int n) {
        super();
        this.n = n;
    }

    // methods Calculate:

    public void plusCacl(int x) {
        n += x;
    }

    public void minusCalc(int x) {
        n -= x;
    }

    public void clearCalc() {
        n = 0;
    }

    // getter, new name method;
    public int getValue() {
        return n;
    }
}
