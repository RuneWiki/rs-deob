package deob;

@ObfuscatedName("hx")
public class class225 extends class108 {

    @ObfuscatedName("hx.c")
    public class221 field2584;

    @ObfuscatedName("hx.q")
    public class208 field2582 = new class208();

    @ObfuscatedName("hx.m")
    public class91 field2583 = new class91();

    public class225(class221 arg0) {
        this.field2584 = arg0;
    }

    @ObfuscatedName("hx.i()Ldd;")
    public class108 method1879() {
        class222 var1 = (class222) this.field2582.method3746();
        if (var1 == null) {
            return null;
        } else if (var1.field2553 == null) {
            return this.method1874();
        } else {
            return var1.field2553;
        }
    }

    @ObfuscatedName("hx.h()Ldd;")
    public class108 method1874() {
        class222 var1;
        do {
            var1 = (class222) this.field2582.method3747();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2553 == null);
        return var1.field2553;
    }

    @ObfuscatedName("hx.l()I")
    public int method1875() {
        return 0;
    }

    @ObfuscatedName("hx.o([III)V")
    public void method1893(int[] arg0, int arg1, int arg2) {
        this.field2583.method1893(arg0, arg1, arg2);
        for (class222 var4 = (class222) this.field2582.method3746(); var4 != null; var4 = (class222) this.field2582.method3747()) {
            if (!this.field2584.method3879(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2554) {
                        this.method4012(var4, arg0, var5, var6, var5 + var6);
                        var4.field2554 -= var6;
                        break;
                    }
                    this.method4012(var4, arg0, var5, var4.field2554, var5 + var6);
                    var5 += var4.field2554;
                    var6 -= var4.field2554;
                } while (!this.field2584.method3868(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hx.v(I)V")
    public void method1872(int arg0) {
        this.field2583.method1872(arg0);
        for (class222 var2 = (class222) this.field2582.method3746(); var2 != null; var2 = (class222) this.field2582.method3747()) {
            if (!this.field2584.method3879(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2554) {
                        this.method4013(var2, var3);
                        var2.field2554 -= var3;
                        break;
                    }
                    this.method4013(var2, var2.field2554);
                    var3 -= var2.field2554;
                } while (!this.field2584.method3868(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hx.c(Lhb;[IIIIB)V")
    public void method4012(class222 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2584.field2520[arg0.field2546] & 0x4) != 0 && arg0.field2550 < 0) {
            int var6 = this.field2584.field2510[arg0.field2546] / Statics.field2434;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2555) / var6;
                if (var7 > arg3) {
                    arg0.field2555 += arg3 * var6;
                    break;
                }
                arg0.field2553.method1893(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2555 += var6 * var7 - 1048576;
                int var8 = Statics.field2434 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class106 var10 = arg0.field2553;
                if (this.field2584.field2523[arg0.field2546] == 0) {
                    arg0.field2553 = class106.method2111(arg0.field2545, var10.method2171(), var10.method2095(), var10.method2146());
                } else {
                    arg0.field2553 = class106.method2111(arg0.field2545, var10.method2171(), 0, var10.method2146());
                    this.field2584.method3857(arg0, arg0.field2551.field2574[arg0.field2540] < 0);
                    arg0.field2553.method2100(var8, var10.method2095());
                }
                if (arg0.field2551.field2574[arg0.field2540] < 0) {
                    arg0.field2553.method2091(-1);
                }
                var10.method2148(var8);
                var10.method1893(arg1, arg2, arg4 - arg2);
                if (var10.method2106()) {
                    this.field2583.method1891(var10);
                }
            }
        }
        arg0.field2553.method1893(arg1, arg2, arg3);
    }

    @ObfuscatedName("hx.q(Lhb;IB)V")
    public void method4013(class222 arg0, int arg1) {
        if ((this.field2584.field2520[arg0.field2546] & 0x4) != 0 && arg0.field2550 < 0) {
            int var3 = this.field2584.field2510[arg0.field2546] / Statics.field2434;
            int var4 = (var3 + 1048575 - arg0.field2555) / var3;
            arg0.field2555 = arg0.field2555 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2584.field2523[arg0.field2546] == 0) {
                    arg0.field2553 = class106.method2111(arg0.field2545, arg0.field2553.method2171(), arg0.field2553.method2095(), arg0.field2553.method2146());
                } else {
                    arg0.field2553 = class106.method2111(arg0.field2545, arg0.field2553.method2171(), 0, arg0.field2553.method2146());
                    this.field2584.method3857(arg0, arg0.field2551.field2574[arg0.field2540] < 0);
                }
                if (arg0.field2551.field2574[arg0.field2540] < 0) {
                    arg0.field2553.method2091(-1);
                }
                arg1 = arg0.field2555 / var3;
            }
        }
        arg0.field2553.method1872(arg1);
    }
}
