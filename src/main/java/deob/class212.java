package deob;

@ObfuscatedName("hj")
public class class212 extends class125 {

    @ObfuscatedName("hj.m")
    public class208 field2527;

    @ObfuscatedName("hj.o")
    public class272 field2525 = new class272();

    @ObfuscatedName("hj.q")
    public class108 field2528 = new class108();

    public class212(class208 arg0) {
        this.field2527 = arg0;
    }

    @ObfuscatedName("hj.g()Ldf;")
    public class125 method2198() {
        class209 var1 = (class209) this.field2525.method4651();
        if (var1 == null) {
            return null;
        } else if (var1.field2495 == null) {
            return this.method2199();
        } else {
            return var1.field2495;
        }
    }

    @ObfuscatedName("hj.n()Ldf;")
    public class125 method2199() {
        class209 var1;
        do {
            var1 = (class209) this.field2525.method4656();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2495 == null);
        return var1.field2495;
    }

    @ObfuscatedName("hj.u()I")
    public int method2200() {
        return 0;
    }

    @ObfuscatedName("hj.a([III)V")
    public void method2206(int[] arg0, int arg1, int arg2) {
        this.field2528.method2206(arg0, arg1, arg2);
        for (class209 var4 = (class209) this.field2525.method4651(); var4 != null; var4 = (class209) this.field2525.method4656()) {
            if (!this.field2527.method3500(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2496) {
                        this.method3657(var4, arg0, var5, var6, var5 + var6);
                        var4.field2496 -= var6;
                        break;
                    }
                    this.method3657(var4, arg0, var5, var4.field2496, var5 + var6);
                    var5 += var4.field2496;
                    var6 -= var4.field2496;
                } while (!this.field2527.method3520(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hj.w(I)V")
    public void method2203(int arg0) {
        this.field2528.method2203(arg0);
        for (class209 var2 = (class209) this.field2525.method4651(); var2 != null; var2 = (class209) this.field2525.method4656()) {
            if (!this.field2527.method3500(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2496) {
                        this.method3658(var2, var3);
                        var2.field2496 -= var3;
                        break;
                    }
                    this.method3658(var2, var2.field2496);
                    var3 -= var2.field2496;
                } while (!this.field2527.method3520(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hj.m(Lhm;[IIIIB)V")
    public void method3657(class209 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2527.field2461[arg0.field2480] & 0x4) != 0 && arg0.field2491 < 0) {
            int var6 = this.field2527.field2455[arg0.field2480] / Statics.field3114;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2479) / var6;
                if (var7 > arg3) {
                    arg0.field2479 += arg3 * var6;
                    break;
                }
                arg0.field2495.method2206(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2479 += var6 * var7 - 1048576;
                int var8 = Statics.field3114 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class123 var10 = arg0.field2495;
                if (this.field2527.field2464[arg0.field2480] == 0) {
                    arg0.field2495 = class123.method2420(arg0.field2488, var10.method2484(), var10.method2426(), var10.method2454());
                } else {
                    arg0.field2495 = class123.method2420(arg0.field2488, var10.method2484(), 0, var10.method2454());
                    this.field2527.method3488(arg0, arg0.field2483.field2522[arg0.field2482] < 0);
                    arg0.field2495.method2431(var8, var10.method2426());
                }
                if (arg0.field2483.field2522[arg0.field2482] < 0) {
                    arg0.field2495.method2422(-1);
                }
                var10.method2470(var8);
                var10.method2206(arg1, arg2, arg4 - arg2);
                if (var10.method2437()) {
                    this.field2528.method2193(var10);
                }
            }
        }
        arg0.field2495.method2206(arg1, arg2, arg3);
    }

    @ObfuscatedName("hj.o(Lhm;II)V")
    public void method3658(class209 arg0, int arg1) {
        if ((this.field2527.field2461[arg0.field2480] & 0x4) != 0 && arg0.field2491 < 0) {
            int var3 = this.field2527.field2455[arg0.field2480] / Statics.field3114;
            int var4 = (var3 + 1048575 - arg0.field2479) / var3;
            arg0.field2479 = arg0.field2479 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2527.field2464[arg0.field2480] == 0) {
                    arg0.field2495 = class123.method2420(arg0.field2488, arg0.field2495.method2484(), arg0.field2495.method2426(), arg0.field2495.method2454());
                } else {
                    arg0.field2495 = class123.method2420(arg0.field2488, arg0.field2495.method2484(), 0, arg0.field2495.method2454());
                    this.field2527.method3488(arg0, arg0.field2483.field2522[arg0.field2482] < 0);
                }
                if (arg0.field2483.field2522[arg0.field2482] < 0) {
                    arg0.field2495.method2422(-1);
                }
                arg1 = arg0.field2479 / var3;
            }
        }
        arg0.field2495.method2203(arg1);
    }
}
