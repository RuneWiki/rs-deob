package deob;

@ObfuscatedName("hb")
public class class212 extends class125 {

    @ObfuscatedName("hb.z")
    public class208 field2516;

    @ObfuscatedName("hb.k")
    public class272 field2517 = new class272();

    @ObfuscatedName("hb.s")
    public class108 field2518 = new class108();

    public class212(class208 arg0) {
        this.field2516 = arg0;
    }

    @ObfuscatedName("hb.o()Ldc;")
    public class125 method2199() {
        class209 var1 = (class209) this.field2517.method4621();
        if (var1 == null) {
            return null;
        } else if (var1.field2477 == null) {
            return this.method2201();
        } else {
            return var1.field2477;
        }
    }

    @ObfuscatedName("hb.x()Ldc;")
    public class125 method2201() {
        class209 var1;
        do {
            var1 = (class209) this.field2517.method4641();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2477 == null);
        return var1.field2477;
    }

    @ObfuscatedName("hb.w()I")
    public int method2202() {
        return 0;
    }

    @ObfuscatedName("hb.g([III)V")
    public void method2203(int[] arg0, int arg1, int arg2) {
        this.field2518.method2203(arg0, arg1, arg2);
        for (class209 var4 = (class209) this.field2517.method4621(); var4 != null; var4 = (class209) this.field2517.method4641()) {
            if (!this.field2516.method3522(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2489) {
                        this.method3658(var4, arg0, var5, var6, var5 + var6);
                        var4.field2489 -= var6;
                        break;
                    }
                    this.method3658(var4, arg0, var5, var4.field2489, var5 + var6);
                    var5 += var4.field2489;
                    var6 -= var4.field2489;
                } while (!this.field2516.method3523(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hb.n(I)V")
    public void method2214(int arg0) {
        this.field2518.method2214(arg0);
        for (class209 var2 = (class209) this.field2517.method4621(); var2 != null; var2 = (class209) this.field2517.method4641()) {
            if (!this.field2516.method3522(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2489) {
                        this.method3659(var2, var3);
                        var2.field2489 -= var3;
                        break;
                    }
                    this.method3659(var2, var2.field2489);
                    var3 -= var2.field2489;
                } while (!this.field2516.method3523(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hb.z(Lhe;[IIIII)V")
    public void method3658(class209 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2516.field2454[arg0.field2485] & 0x4) != 0 && arg0.field2484 < 0) {
            int var6 = this.field2516.field2443[arg0.field2485] / Statics.field1448;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2487) / var6;
                if (var7 > arg3) {
                    arg0.field2487 += arg3 * var6;
                    break;
                }
                arg0.field2477.method2203(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2487 += var6 * var7 - 1048576;
                int var8 = Statics.field1448 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class123 var10 = arg0.field2477;
                if (this.field2516.field2442[arg0.field2485] == 0) {
                    arg0.field2477 = class123.method2425(arg0.field2472, var10.method2465(), var10.method2430(), var10.method2458());
                } else {
                    arg0.field2477 = class123.method2425(arg0.field2472, var10.method2465(), 0, var10.method2458());
                    this.field2516.method3504(arg0, arg0.field2471.field2511[arg0.field2475] < 0);
                    arg0.field2477.method2519(var8, var10.method2430());
                }
                if (arg0.field2471.field2511[arg0.field2475] < 0) {
                    arg0.field2477.method2443(-1);
                }
                var10.method2463(var8);
                var10.method2203(arg1, arg2, arg4 - arg2);
                if (var10.method2441()) {
                    this.field2518.method2195(var10);
                }
            }
        }
        arg0.field2477.method2203(arg1, arg2, arg3);
    }

    @ObfuscatedName("hb.k(Lhe;II)V")
    public void method3659(class209 arg0, int arg1) {
        if ((this.field2516.field2454[arg0.field2485] & 0x4) != 0 && arg0.field2484 < 0) {
            int var3 = this.field2516.field2443[arg0.field2485] / Statics.field1448;
            int var4 = (var3 + 1048575 - arg0.field2487) / var3;
            arg0.field2487 = arg0.field2487 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2516.field2442[arg0.field2485] == 0) {
                    arg0.field2477 = class123.method2425(arg0.field2472, arg0.field2477.method2465(), arg0.field2477.method2430(), arg0.field2477.method2458());
                } else {
                    arg0.field2477 = class123.method2425(arg0.field2472, arg0.field2477.method2465(), 0, arg0.field2477.method2458());
                    this.field2516.method3504(arg0, arg0.field2471.field2511[arg0.field2475] < 0);
                }
                if (arg0.field2471.field2511[arg0.field2475] < 0) {
                    arg0.field2477.method2443(-1);
                }
                arg1 = arg0.field2487 / var3;
            }
        }
        arg0.field2477.method2214(arg1);
    }
}
