package deob;

@ObfuscatedName("hz")
public class class209 extends class120 {

    @ObfuscatedName("hz.i")
    public class205 field2582;

    @ObfuscatedName("hz.h")
    public class194 field2583 = new class194();

    @ObfuscatedName("hz.u")
    public class103 field2584 = new class103();

    public class209(class205 arg0) {
        this.field2582 = arg0;
    }

    @ObfuscatedName("hz.v()Ldw;")
    public class120 method1784() {
        class206 var1 = (class206) this.field2583.method3376();
        if (var1 == null) {
            return null;
        } else if (var1.field2553 == null) {
            return this.method1760();
        } else {
            return var1.field2553;
        }
    }

    @ObfuscatedName("hz.t()Ldw;")
    public class120 method1760() {
        class206 var1;
        do {
            var1 = (class206) this.field2583.method3377();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2553 == null);
        return var1.field2553;
    }

    @ObfuscatedName("hz.p()I")
    public int method1761() {
        return 0;
    }

    @ObfuscatedName("hz.l([III)V")
    public void method1762(int[] arg0, int arg1, int arg2) {
        this.field2584.method1762(arg0, arg1, arg2);
        for (class206 var4 = (class206) this.field2583.method3376(); var4 != null; var4 = (class206) this.field2583.method3377()) {
            if (!this.field2582.method3501(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2554) {
                        this.method3644(var4, arg0, var5, var6, var5 + var6);
                        var4.field2554 -= var6;
                        break;
                    }
                    this.method3644(var4, arg0, var5, var4.field2554, var5 + var6);
                    var5 += var4.field2554;
                    var6 -= var4.field2554;
                } while (!this.field2582.method3502(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hz.k(I)V")
    public void method1757(int arg0) {
        this.field2584.method1757(arg0);
        for (class206 var2 = (class206) this.field2583.method3376(); var2 != null; var2 = (class206) this.field2583.method3377()) {
            if (!this.field2582.method3501(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2554) {
                        this.method3642(var2, var3);
                        var2.field2554 -= var3;
                        break;
                    }
                    this.method3642(var2, var2.field2554);
                    var3 -= var2.field2554;
                } while (!this.field2582.method3502(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hz.i(Lgp;[IIIII)V")
    public void method3644(class206 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2582.field2519[arg0.field2545] & 0x4) != 0 && arg0.field2542 < 0) {
            int var6 = this.field2582.field2528[arg0.field2545] / Statics.field1629;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2555) / var6;
                if (var7 > arg3) {
                    arg0.field2555 += arg3 * var6;
                    break;
                }
                arg0.field2553.method1762(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2555 += var6 * var7 - 1048576;
                int var8 = Statics.field1629 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class118 var10 = arg0.field2553;
                if (this.field2582.field2515[arg0.field2545] == 0) {
                    arg0.field2553 = class118.method2075(arg0.field2538, var10.method1991(), var10.method2018(), var10.method1983());
                } else {
                    arg0.field2553 = class118.method2075(arg0.field2538, var10.method1991(), 0, var10.method1983());
                    this.field2582.method3561(arg0, arg0.field2536.field2572[arg0.field2535] < 0);
                    arg0.field2553.method1987(var8, var10.method2018());
                }
                if (arg0.field2536.field2572[arg0.field2535] < 0) {
                    arg0.field2553.method1980(-1);
                }
                var10.method1989(var8);
                var10.method1762(arg1, arg2, arg4 - arg2);
                if (var10.method1993()) {
                    this.field2584.method1781(var10);
                }
            }
        }
        arg0.field2553.method1762(arg1, arg2, arg3);
    }

    @ObfuscatedName("hz.h(Lgp;IB)V")
    public void method3642(class206 arg0, int arg1) {
        if ((this.field2582.field2519[arg0.field2545] & 0x4) != 0 && arg0.field2542 < 0) {
            int var3 = this.field2582.field2528[arg0.field2545] / Statics.field1629;
            int var4 = (var3 + 1048575 - arg0.field2555) / var3;
            arg0.field2555 = arg0.field2555 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2582.field2515[arg0.field2545] == 0) {
                    arg0.field2553 = class118.method2075(arg0.field2538, arg0.field2553.method1991(), arg0.field2553.method2018(), arg0.field2553.method1983());
                } else {
                    arg0.field2553 = class118.method2075(arg0.field2538, arg0.field2553.method1991(), 0, arg0.field2553.method1983());
                    this.field2582.method3561(arg0, arg0.field2536.field2572[arg0.field2535] < 0);
                }
                if (arg0.field2536.field2572[arg0.field2535] < 0) {
                    arg0.field2553.method1980(-1);
                }
                arg1 = arg0.field2555 / var3;
            }
        }
        arg0.field2553.method1757(arg1);
    }
}
