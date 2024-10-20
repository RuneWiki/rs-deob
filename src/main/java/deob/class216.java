package deob;

@ObfuscatedName("hr")
public class class216 extends class119 {

    @ObfuscatedName("hr.b")
    public class212 field2670;

    @ObfuscatedName("hr.s")
    public class201 field2669 = new class201();

    @ObfuscatedName("hr.r")
    public class102 field2668 = new class102();

    public class216(class212 arg0) {
        this.field2670 = arg0;
    }

    @ObfuscatedName("hr.f()Ldk;")
    public class119 method1761() {
        class213 var1 = (class213) this.field2669.method3405();
        if (var1 == null) {
            return null;
        } else if (var1.field2643 == null) {
            return this.method1745();
        } else {
            return var1.field2643;
        }
    }

    @ObfuscatedName("hr.u()Ldk;")
    public class119 method1745() {
        class213 var1;
        do {
            var1 = (class213) this.field2669.method3414();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2643 == null);
        return var1.field2643;
    }

    @ObfuscatedName("hr.t()I")
    public int method1739() {
        return 0;
    }

    @ObfuscatedName("hr.k([III)V")
    public void method1744(int[] arg0, int arg1, int arg2) {
        this.field2668.method1744(arg0, arg1, arg2);
        for (class213 var4 = (class213) this.field2669.method3405(); var4 != null; var4 = (class213) this.field2669.method3414()) {
            if (!this.field2670.method3516(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2639) {
                        this.method3659(var4, arg0, var5, var6, var5 + var6);
                        var4.field2639 -= var6;
                        break;
                    }
                    this.method3659(var4, arg0, var5, var4.field2639, var5 + var6);
                    var5 += var4.field2639;
                    var6 -= var4.field2639;
                } while (!this.field2670.method3517(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hr.d(I)V")
    public void method1748(int arg0) {
        this.field2668.method1748(arg0);
        for (class213 var2 = (class213) this.field2669.method3405(); var2 != null; var2 = (class213) this.field2669.method3414()) {
            if (!this.field2670.method3516(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2639) {
                        this.method3660(var2, var3);
                        var2.field2639 -= var3;
                        break;
                    }
                    this.method3660(var2, var2.field2639);
                    var3 -= var2.field2639;
                } while (!this.field2670.method3517(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hr.b(Lhp;[IIIIB)V")
    public void method3659(class213 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2670.field2610[arg0.field2625] & 0x4) != 0 && arg0.field2641 < 0) {
            int var6 = this.field2670.field2615[arg0.field2625] / Statics.field1556;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2645) / var6;
                if (var7 > arg3) {
                    arg0.field2645 += arg3 * var6;
                    break;
                }
                arg0.field2643.method1744(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2645 += var6 * var7 - 1048576;
                int var8 = Statics.field1556 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class117 var10 = arg0.field2643;
                if (this.field2670.field2613[arg0.field2625] == 0) {
                    arg0.field2643 = class117.method1967(arg0.field2627, var10.method1980(), var10.method1983(), var10.method2066());
                } else {
                    arg0.field2643 = class117.method1967(arg0.field2627, var10.method1980(), 0, var10.method2066());
                    this.field2670.method3499(arg0, arg0.field2626.field2662[arg0.field2630] < 0);
                    arg0.field2643.method2083(var8, var10.method1983());
                }
                if (arg0.field2626.field2662[arg0.field2630] < 0) {
                    arg0.field2643.method2012(-1);
                }
                var10.method1998(var8);
                var10.method1744(arg1, arg2, arg4 - arg2);
                if (var10.method2003()) {
                    this.field2668.method1774(var10);
                }
            }
        }
        arg0.field2643.method1744(arg1, arg2, arg3);
    }

    @ObfuscatedName("hr.s(Lhp;II)V")
    public void method3660(class213 arg0, int arg1) {
        if ((this.field2670.field2610[arg0.field2625] & 0x4) != 0 && arg0.field2641 < 0) {
            int var3 = this.field2670.field2615[arg0.field2625] / Statics.field1556;
            int var4 = (var3 + 1048575 - arg0.field2645) / var3;
            arg0.field2645 = arg0.field2645 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2670.field2613[arg0.field2625] == 0) {
                    arg0.field2643 = class117.method1967(arg0.field2627, arg0.field2643.method1980(), arg0.field2643.method1983(), arg0.field2643.method2066());
                } else {
                    arg0.field2643 = class117.method1967(arg0.field2627, arg0.field2643.method1980(), 0, arg0.field2643.method2066());
                    this.field2670.method3499(arg0, arg0.field2626.field2662[arg0.field2630] < 0);
                }
                if (arg0.field2626.field2662[arg0.field2630] < 0) {
                    arg0.field2643.method2012(-1);
                }
                arg1 = arg0.field2645 / var3;
            }
        }
        arg0.field2643.method1748(arg1);
    }
}
