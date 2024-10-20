package deob;

@ObfuscatedName("he")
public class class212 extends class125 {

    @ObfuscatedName("he.n")
    public class208 field2516;

    @ObfuscatedName("he.v")
    public class273 field2519 = new class273();

    @ObfuscatedName("he.d")
    public class108 field2518 = new class108();

    public class212(class208 arg0) {
        this.field2516 = arg0;
    }

    @ObfuscatedName("he.h()Ldw;")
    public class125 method2280() {
        class209 var1 = (class209) this.field2519.method4721();
        if (var1 == null) {
            return null;
        } else if (var1.field2486 == null) {
            return this.method2281();
        } else {
            return var1.field2486;
        }
    }

    @ObfuscatedName("he.z()Ldw;")
    public class125 method2281() {
        class209 var1;
        do {
            var1 = (class209) this.field2519.method4706();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2486 == null);
        return var1.field2486;
    }

    @ObfuscatedName("he.e()I")
    public int method2282() {
        return 0;
    }

    @ObfuscatedName("he.q([III)V")
    public void method2283(int[] arg0, int arg1, int arg2) {
        this.field2518.method2283(arg0, arg1, arg2);
        for (class209 var4 = (class209) this.field2519.method4721(); var4 != null; var4 = (class209) this.field2519.method4706()) {
            if (!this.field2516.method3596(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2485) {
                        this.method3753(var4, arg0, var5, var6, var5 + var6);
                        var4.field2485 -= var6;
                        break;
                    }
                    this.method3753(var4, arg0, var5, var4.field2485, var5 + var6);
                    var5 += var4.field2485;
                    var6 -= var4.field2485;
                } while (!this.field2516.method3612(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("he.s(I)V")
    public void method2305(int arg0) {
        this.field2518.method2305(arg0);
        for (class209 var2 = (class209) this.field2519.method4721(); var2 != null; var2 = (class209) this.field2519.method4706()) {
            if (!this.field2516.method3596(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2485) {
                        this.method3754(var2, var3);
                        var2.field2485 -= var3;
                        break;
                    }
                    this.method3754(var2, var2.field2485);
                    var3 -= var2.field2485;
                } while (!this.field2516.method3612(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("he.n(Lhq;[IIIIS)V")
    public void method3753(class209 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2516.field2459[arg0.field2472] & 0x4) != 0 && arg0.field2487 < 0) {
            int var6 = this.field2516.field2469[arg0.field2472] / Statics.field3339;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2480) / var6;
                if (var7 > arg3) {
                    arg0.field2480 += arg3 * var6;
                    break;
                }
                arg0.field2486.method2283(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2480 += var6 * var7 - 1048576;
                int var8 = Statics.field3339 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class123 var10 = arg0.field2486;
                if (this.field2516.field2461[arg0.field2472] == 0) {
                    arg0.field2486 = class123.method2624(arg0.field2491, var10.method2520(), var10.method2512(), var10.method2553());
                } else {
                    arg0.field2486 = class123.method2624(arg0.field2491, var10.method2520(), 0, var10.method2553());
                    this.field2516.method3592(arg0, arg0.field2490.field2514[arg0.field2476] < 0);
                    arg0.field2486.method2529(var8, var10.method2512());
                }
                if (arg0.field2490.field2514[arg0.field2476] < 0) {
                    arg0.field2486.method2572(-1);
                }
                var10.method2583(var8);
                var10.method2283(arg1, arg2, arg4 - arg2);
                if (var10.method2522()) {
                    this.field2518.method2304(var10);
                }
            }
        }
        arg0.field2486.method2283(arg1, arg2, arg3);
    }

    @ObfuscatedName("he.v(Lhq;II)V")
    public void method3754(class209 arg0, int arg1) {
        if ((this.field2516.field2459[arg0.field2472] & 0x4) != 0 && arg0.field2487 < 0) {
            int var3 = this.field2516.field2469[arg0.field2472] / Statics.field3339;
            int var4 = (var3 + 1048575 - arg0.field2480) / var3;
            arg0.field2480 = arg0.field2480 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2516.field2461[arg0.field2472] == 0) {
                    arg0.field2486 = class123.method2624(arg0.field2491, arg0.field2486.method2520(), arg0.field2486.method2512(), arg0.field2486.method2553());
                } else {
                    arg0.field2486 = class123.method2624(arg0.field2491, arg0.field2486.method2520(), 0, arg0.field2486.method2553());
                    this.field2516.method3592(arg0, arg0.field2490.field2514[arg0.field2476] < 0);
                }
                if (arg0.field2490.field2514[arg0.field2476] < 0) {
                    arg0.field2486.method2572(-1);
                }
                arg1 = arg0.field2480 / var3;
            }
        }
        arg0.field2486.method2305(arg1);
    }
}
