package deob;

@ObfuscatedName("hv")
public class class215 extends class59 {

    @ObfuscatedName("hv.f")
    public class212 field2544;

    @ObfuscatedName("hv.o")
    public class272 field2543 = new class272();

    @ObfuscatedName("hv.u")
    public class49 field2542 = new class49();

    public class215(class212 arg0) {
        this.field2544 = arg0;
    }

    @ObfuscatedName("hv.e()Lbt;")
    public class59 method557() {
        class217 var1 = (class217) this.field2543.method4160();
        if (var1 == null) {
            return null;
        } else if (var1.field2566 == null) {
            return this.method558();
        } else {
            return var1.field2566;
        }
    }

    @ObfuscatedName("hv.k()Lbt;")
    public class59 method558() {
        class217 var1;
        do {
            var1 = (class217) this.field2543.method4182();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2566 == null);
        return var1.field2566;
    }

    @ObfuscatedName("hv.g()I")
    public int method575() {
        return 0;
    }

    @ObfuscatedName("hv.h([III)V")
    public void method585(int[] arg0, int arg1, int arg2) {
        this.field2542.method585(arg0, arg1, arg2);
        for (class217 var4 = (class217) this.field2543.method4160(); var4 != null; var4 = (class217) this.field2543.method4182()) {
            if (!this.field2544.method3476(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2567) {
                        this.method3626(var4, arg0, var5, var6, var5 + var6);
                        var4.field2567 -= var6;
                        break;
                    }
                    this.method3626(var4, arg0, var5, var4.field2567, var5 + var6);
                    var5 += var4.field2567;
                    var6 -= var4.field2567;
                } while (!this.field2544.method3477(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hv.l(I)V")
    public void method560(int arg0) {
        this.field2542.method560(arg0);
        for (class217 var2 = (class217) this.field2543.method4160(); var2 != null; var2 = (class217) this.field2543.method4182()) {
            if (!this.field2544.method3476(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2567) {
                        this.method3627(var2, var3);
                        var2.field2567 -= var3;
                        break;
                    }
                    this.method3627(var2, var2.field2567);
                    var3 -= var2.field2567;
                } while (!this.field2544.method3477(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hv.f(Lhj;[IIIIS)V")
    public void method3626(class217 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2544.field2517[arg0.field2555] & 0x4) != 0 && arg0.field2562 < 0) {
            int var6 = this.field2544.field2491[arg0.field2555] / Statics.field395;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2568) / var6;
                if (var7 > arg3) {
                    arg0.field2568 += arg3 * var6;
                    break;
                }
                arg0.field2566.method585(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2568 += var6 * var7 - 1048576;
                int var8 = Statics.field395 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2566;
                if (this.field2544.field2504[arg0.field2555] == 0) {
                    arg0.field2566 = class58.method701(arg0.field2550, var10.method772(), var10.method707(), var10.method708());
                } else {
                    arg0.field2566 = class58.method701(arg0.field2550, var10.method772(), 0, var10.method708());
                    this.field2544.method3451(arg0, arg0.field2549.field2534[arg0.field2548] < 0);
                    arg0.field2566.method712(var8, var10.method707());
                }
                if (arg0.field2549.field2534[arg0.field2548] < 0) {
                    arg0.field2566.method703(-1);
                }
                var10.method720(var8);
                var10.method585(arg1, arg2, arg4 - arg2);
                if (var10.method741()) {
                    this.field2542.method583(var10);
                }
            }
        }
        arg0.field2566.method585(arg1, arg2, arg3);
    }

    @ObfuscatedName("hv.o(Lhj;IB)V")
    public void method3627(class217 arg0, int arg1) {
        if ((this.field2544.field2517[arg0.field2555] & 0x4) != 0 && arg0.field2562 < 0) {
            int var3 = this.field2544.field2491[arg0.field2555] / Statics.field395;
            int var4 = (var3 + 1048575 - arg0.field2568) / var3;
            arg0.field2568 = arg0.field2568 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2544.field2504[arg0.field2555] == 0) {
                    arg0.field2566 = class58.method701(arg0.field2550, arg0.field2566.method772(), arg0.field2566.method707(), arg0.field2566.method708());
                } else {
                    arg0.field2566 = class58.method701(arg0.field2550, arg0.field2566.method772(), 0, arg0.field2566.method708());
                    this.field2544.method3451(arg0, arg0.field2549.field2534[arg0.field2548] < 0);
                }
                if (arg0.field2549.field2534[arg0.field2548] < 0) {
                    arg0.field2566.method703(-1);
                }
                arg1 = arg0.field2568 / var3;
            }
        }
        arg0.field2566.method560(arg1);
    }
}
