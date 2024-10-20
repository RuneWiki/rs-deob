package deob;

@ObfuscatedName("hz")
public class class212 extends class125 {

    @ObfuscatedName("hz.f")
    public class208 field2516;

    @ObfuscatedName("hz.b")
    public class273 field2515 = new class273();

    @ObfuscatedName("hz.l")
    public class108 field2518 = new class108();

    public class212(class208 arg0) {
        this.field2516 = arg0;
    }

    @ObfuscatedName("hz.q()Lde;")
    public class125 method2226() {
        class209 var1 = (class209) this.field2515.method4638();
        if (var1 == null) {
            return null;
        } else if (var1.field2483 == null) {
            return this.method2227();
        } else {
            return var1.field2483;
        }
    }

    @ObfuscatedName("hz.k()Lde;")
    public class125 method2227() {
        class209 var1;
        do {
            var1 = (class209) this.field2515.method4640();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2483 == null);
        return var1.field2483;
    }

    @ObfuscatedName("hz.c()I")
    public int method2237() {
        return 0;
    }

    @ObfuscatedName("hz.u([III)V")
    public void method2229(int[] arg0, int arg1, int arg2) {
        this.field2518.method2229(arg0, arg1, arg2);
        for (class209 var4 = (class209) this.field2515.method4638(); var4 != null; var4 = (class209) this.field2515.method4640()) {
            if (!this.field2516.method3544(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2484) {
                        this.method3687(var4, arg0, var5, var6, var5 + var6);
                        var4.field2484 -= var6;
                        break;
                    }
                    this.method3687(var4, arg0, var5, var4.field2484, var5 + var6);
                    var5 += var4.field2484;
                    var6 -= var4.field2484;
                } while (!this.field2516.method3537(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hz.e(I)V")
    public void method2231(int arg0) {
        this.field2518.method2231(arg0);
        for (class209 var2 = (class209) this.field2515.method4638(); var2 != null; var2 = (class209) this.field2515.method4640()) {
            if (!this.field2516.method3544(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2484) {
                        this.method3688(var2, var3);
                        var2.field2484 -= var3;
                        break;
                    }
                    this.method3688(var2, var2.field2484);
                    var3 -= var2.field2484;
                } while (!this.field2516.method3537(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hz.f(Lhl;[IIIII)V")
    public void method3687(class209 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2516.field2450[arg0.field2480] & 0x4) != 0 && arg0.field2474 < 0) {
            int var6 = this.field2516.field2455[arg0.field2480] / Statics.field1443;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2485) / var6;
                if (var7 > arg3) {
                    arg0.field2485 += arg3 * var6;
                    break;
                }
                arg0.field2483.method2229(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2485 += var6 * var7 - 1048576;
                int var8 = Statics.field1443 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class123 var10 = arg0.field2483;
                if (this.field2516.field2453[arg0.field2480] == 0) {
                    arg0.field2483 = class123.method2455(arg0.field2472, var10.method2461(), var10.method2452(), var10.method2453());
                } else {
                    arg0.field2483 = class123.method2455(arg0.field2472, var10.method2461(), 0, var10.method2453());
                    this.field2516.method3528(arg0, arg0.field2479.field2505[arg0.field2467] < 0);
                    arg0.field2483.method2484(var8, var10.method2452());
                }
                if (arg0.field2479.field2505[arg0.field2467] < 0) {
                    arg0.field2483.method2553(-1);
                }
                var10.method2459(var8);
                var10.method2229(arg1, arg2, arg4 - arg2);
                if (var10.method2542()) {
                    this.field2518.method2222(var10);
                }
            }
        }
        arg0.field2483.method2229(arg1, arg2, arg3);
    }

    @ObfuscatedName("hz.b(Lhl;IB)V")
    public void method3688(class209 arg0, int arg1) {
        if ((this.field2516.field2450[arg0.field2480] & 0x4) != 0 && arg0.field2474 < 0) {
            int var3 = this.field2516.field2455[arg0.field2480] / Statics.field1443;
            int var4 = (var3 + 1048575 - arg0.field2485) / var3;
            arg0.field2485 = arg0.field2485 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2516.field2453[arg0.field2480] == 0) {
                    arg0.field2483 = class123.method2455(arg0.field2472, arg0.field2483.method2461(), arg0.field2483.method2452(), arg0.field2483.method2453());
                } else {
                    arg0.field2483 = class123.method2455(arg0.field2472, arg0.field2483.method2461(), 0, arg0.field2483.method2453());
                    this.field2516.method3528(arg0, arg0.field2479.field2505[arg0.field2467] < 0);
                }
                if (arg0.field2479.field2505[arg0.field2467] < 0) {
                    arg0.field2483.method2553(-1);
                }
                arg1 = arg0.field2485 / var3;
            }
        }
        arg0.field2483.method2231(arg1);
    }
}
