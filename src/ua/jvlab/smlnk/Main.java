package ua.jvlab.smlnk;

import ua.jvlab.smlnk.usrobjsm.Calc;

/**# Application: Console Calc. #**/

public class Main {

    public static void main(String[] args) {

        System.out.println(Calc.NAME_CLC + "\n");

        // Build instance of a Class Calc;
        Calc clc = new Calc();

        // Input x(n);
        clc.plusCacl(5);
        clc.plusCacl(3);
        clc.minusCalc(1);

        // Output n:
        System.out.println(clc.getN() + "\n"); // 5+3-1 = 7;

        // Clean display Calc;
        clc.clearCalc();
        System.out.println(clc.getValue()); // 0; getters new name;

    }
}
