package deob;

@ObfuscatedName("gr")
public class class203 extends class116 {

    @ObfuscatedName("gr.u")
    public class199 field2496;

    @ObfuscatedName("gr.f")
    public class262 field2497 = new class262();

    @ObfuscatedName("gr.b")
    public class99 field2498 = new class99();

    public class203(class199 arg0) {
        this.field2496 = arg0;
    }

    @ObfuscatedName("gr.p()Ldt;")
    public class116 method2116() {
        class200 var1 = (class200) this.field2497.method4568();
        if (var1 == null) {
            return null;
        } else if (var1.field2468 == null) {
            return this.method2117();
        } else {
            return var1.field2468;
        }
    }

    @ObfuscatedName("gr.h()Ldt;")
    public class116 method2117() {
        class200 var1;
        do {
            var1 = (class200) this.field2497.method4561();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2468 == null);
        return var1.field2468;
    }

    @ObfuscatedName("gr.y()I")
    public int method2110() {
        return 0;
    }

    @ObfuscatedName("gr.w([III)V")
    public void method2119(int[] arg0, int arg1, int arg2) {
        this.field2498.method2119(arg0, arg1, arg2);
        for (class200 var4 = (class200) this.field2497.method4568(); var4 != null; var4 = (class200) this.field2497.method4561()) {
            if (!this.field2496.method3457(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2465) {
                        this.method3603(var4, arg0, var5, var6, var5 + var6);
                        var4.field2465 -= var6;
                        break;
                    }
                    this.method3603(var4, arg0, var5, var4.field2465, var5 + var6);
                    var5 += var4.field2465;
                    var6 -= var4.field2465;
                } while (!this.field2496.method3458(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gr.k(I)V")
    public void method2121(int arg0) {
        this.field2498.method2121(arg0);
        for (class200 var2 = (class200) this.field2497.method4568(); var2 != null; var2 = (class200) this.field2497.method4561()) {
            if (!this.field2496.method3457(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2465) {
                        this.method3602(var2, var3);
                        var2.field2465 -= var3;
                        break;
                    }
                    this.method3602(var2, var2.field2465);
                    var3 -= var2.field2465;
                } while (!this.field2496.method3458(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gr.u(Lge;[IIIII)V")
    public void method3603(class200 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2496.field2429[arg0.field2450] & 0x4) != 0 && arg0.field2460 < 0) {
            int var6 = this.field2496.field2434[arg0.field2450] / Statics.field1275;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2464) / var6;
                if (var7 > arg3) {
                    arg0.field2464 += arg3 * var6;
                    break;
                }
                arg0.field2468.method2119(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2464 += var6 * var7 - 1048576;
                int var8 = Statics.field1275 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class114 var10 = arg0.field2468;
                if (this.field2496.field2442[arg0.field2450] == 0) {
                    arg0.field2468 = class114.method2338(arg0.field2454, var10.method2459(), var10.method2345(), var10.method2346());
                } else {
                    arg0.field2468 = class114.method2338(arg0.field2454, var10.method2459(), 0, var10.method2346());
                    this.field2496.method3439(arg0, arg0.field2447.field2486[arg0.field2451] < 0);
                    arg0.field2468.method2350(var8, var10.method2345());
                }
                if (arg0.field2447.field2486[arg0.field2451] < 0) {
                    arg0.field2468.method2341(-1);
                }
                var10.method2352(var8);
                var10.method2119(arg1, arg2, arg4 - arg2);
                if (var10.method2444()) {
                    this.field2498.method2113(var10);
                }
            }
        }
        arg0.field2468.method2119(arg1, arg2, arg3);
    }

    @ObfuscatedName("gr.f(Lge;II)V")
    public void method3602(class200 arg0, int arg1) {
        if ((this.field2496.field2429[arg0.field2450] & 0x4) != 0 && arg0.field2460 < 0) {
            int var3 = this.field2496.field2434[arg0.field2450] / Statics.field1275;
            int var4 = (var3 + 1048575 - arg0.field2464) / var3;
            arg0.field2464 = arg0.field2464 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2496.field2442[arg0.field2450] == 0) {
                    arg0.field2468 = class114.method2338(arg0.field2454, arg0.field2468.method2459(), arg0.field2468.method2345(), arg0.field2468.method2346());
                } else {
                    arg0.field2468 = class114.method2338(arg0.field2454, arg0.field2468.method2459(), 0, arg0.field2468.method2346());
                    this.field2496.method3439(arg0, arg0.field2447.field2486[arg0.field2451] < 0);
                }
                if (arg0.field2447.field2486[arg0.field2451] < 0) {
                    arg0.field2468.method2341(-1);
                }
                arg1 = arg0.field2464 / var3;
            }
        }
        arg0.field2468.method2121(arg1);
    }
}
