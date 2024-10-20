package deob;

@ObfuscatedName("hp")
public class class225 extends class108 {

    @ObfuscatedName("hp.f")
    public class221 field2614;

    @ObfuscatedName("hp.l")
    public class208 field2613 = new class208();

    @ObfuscatedName("hp.s")
    public class91 field2615 = new class91();

    public class225(class221 arg0) {
        this.field2614 = arg0;
    }

    @ObfuscatedName("hp.c()Ldm;")
    public class108 method1972() {
        class222 var1 = (class222) this.field2613.method3827();
        if (var1 == null) {
            return null;
        } else if (var1.field2581 == null) {
            return this.method1982();
        } else {
            return var1.field2581;
        }
    }

    @ObfuscatedName("hp.p()Ldm;")
    public class108 method1982() {
        class222 var1;
        do {
            var1 = (class222) this.field2613.method3829();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2581 == null);
        return var1.field2581;
    }

    @ObfuscatedName("hp.r()I")
    public int method1974() {
        return 0;
    }

    @ObfuscatedName("hp.m([III)V")
    public void method1975(int[] arg0, int arg1, int arg2) {
        this.field2615.method1975(arg0, arg1, arg2);
        for (class222 var4 = (class222) this.field2613.method3827(); var4 != null; var4 = (class222) this.field2613.method3829()) {
            if (!this.field2614.method3968(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2569) {
                        this.method4100(var4, arg0, var5, var6, var5 + var6);
                        var4.field2569 -= var6;
                        break;
                    }
                    this.method4100(var4, arg0, var5, var4.field2569, var5 + var6);
                    var5 += var4.field2569;
                    var6 -= var4.field2569;
                } while (!this.field2614.method4027(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hp.z(I)V")
    public void method1977(int arg0) {
        this.field2615.method1977(arg0);
        for (class222 var2 = (class222) this.field2613.method3827(); var2 != null; var2 = (class222) this.field2613.method3829()) {
            if (!this.field2614.method3968(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2569) {
                        this.method4102(var2, var3);
                        var2.field2569 -= var3;
                        break;
                    }
                    this.method4102(var2, var2.field2569);
                    var3 -= var2.field2569;
                } while (!this.field2614.method4027(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hp.f(Lhz;[IIIII)V")
    public void method4100(class222 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2614.field2551[arg0.field2572] & 0x4) != 0 && arg0.field2580 < 0) {
            int var6 = this.field2614.field2556[arg0.field2572] / Statics.field1356;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2586) / var6;
                if (var7 > arg3) {
                    arg0.field2586 += arg3 * var6;
                    break;
                }
                arg0.field2581.method1975(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2586 += var6 * var7 - 1048576;
                int var8 = Statics.field1356 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class106 var10 = arg0.field2581;
                if (this.field2614.field2554[arg0.field2572] == 0) {
                    arg0.field2581 = class106.method2182(arg0.field2568, var10.method2196(), var10.method2187(), var10.method2269());
                } else {
                    arg0.field2581 = class106.method2182(arg0.field2568, var10.method2196(), 0, var10.method2269());
                    this.field2614.method3951(arg0, arg0.field2573.field2602[arg0.field2571] < 0);
                    arg0.field2581.method2192(var8, var10.method2187());
                }
                if (arg0.field2573.field2602[arg0.field2571] < 0) {
                    arg0.field2581.method2183(-1);
                }
                var10.method2194(var8);
                var10.method1975(arg1, arg2, arg4 - arg2);
                if (var10.method2255()) {
                    this.field2615.method1967(var10);
                }
            }
        }
        arg0.field2581.method1975(arg1, arg2, arg3);
    }

    @ObfuscatedName("hp.l(Lhz;IB)V")
    public void method4102(class222 arg0, int arg1) {
        if ((this.field2614.field2551[arg0.field2572] & 0x4) != 0 && arg0.field2580 < 0) {
            int var3 = this.field2614.field2556[arg0.field2572] / Statics.field1356;
            int var4 = (var3 + 1048575 - arg0.field2586) / var3;
            arg0.field2586 = arg0.field2586 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2614.field2554[arg0.field2572] == 0) {
                    arg0.field2581 = class106.method2182(arg0.field2568, arg0.field2581.method2196(), arg0.field2581.method2187(), arg0.field2581.method2269());
                } else {
                    arg0.field2581 = class106.method2182(arg0.field2568, arg0.field2581.method2196(), 0, arg0.field2581.method2269());
                    this.field2614.method3951(arg0, arg0.field2573.field2602[arg0.field2571] < 0);
                }
                if (arg0.field2573.field2602[arg0.field2571] < 0) {
                    arg0.field2581.method2183(-1);
                }
                arg1 = arg0.field2586 / var3;
            }
        }
        arg0.field2581.method1977(arg1);
    }
}
