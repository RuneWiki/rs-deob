package deob;

import java.util.HashMap;

@ObfuscatedName("kj")
public class class301 {

    @ObfuscatedName("kj.l")
    public final HashMap field3774 = new HashMap();

    @ObfuscatedName("kj.q")
    public class351 field3773 = new class351(0, 0);

    @ObfuscatedName("kj.f")
    public int[] field3775 = new int[2048];

    @ObfuscatedName("kj.j")
    public int[] field3776 = new int[2048];

    @ObfuscatedName("kj.m")
    public int field3777 = 0;

    public class301() {
        method4661();
    }

    @ObfuscatedName("ja.l(I)V")
    public static void method4661() {
        Statics.field146 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class186.method2507((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field146[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field146.length) {
            int var6 = var0 * 2;
            int var7 = class186.method2507((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field146.length) {
                Statics.field146[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("kj.q(II)V")
    public void method4979(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            double var11 = class352.method3181((double) (var7) / var3) / var3;
            var6[var8] = var11;
            var7++;
            var8++;
        }
        double[] var14 = var6;
        double var15 = var6[arg0] * var6[arg0];
        int[] var17 = new int[var2 * var2];
        boolean var18 = false;
        for (int var19 = 0; var19 < var2; var19++) {
            for (int var20 = 0; var20 < var2; var20++) {
                int var21 = var17[var2 * var19 + var20] = (int) (var14[var19] * var14[var20] / var15 * 256.0D);
                if (!var18 && var21 > 0) {
                    var18 = true;
                }
            }
        }
        class414 var22 = new class414(var17, var2, var2);
        this.field3774.put(arg0, var22);
    }

    @ObfuscatedName("kj.f(II)Lon;")
    public class414 method4958(int arg0) {
        if (!this.field3774.containsKey(arg0)) {
            this.method4979(arg0);
        }
        return (class414) this.field3774.get(arg0);
    }

    @ObfuscatedName("kj.j(III)V")
    public final void method4959(int arg0, int arg1) {
        if (this.field3777 < this.field3775.length) {
            this.field3775[this.field3777] = arg0;
            this.field3776[this.field3777] = arg1;
            this.field3777++;
        }
    }

    @ObfuscatedName("kj.m(I)V")
    public final void method4960() {
        this.field3777 = 0;
    }

    @ObfuscatedName("kj.k(IILon;FI)V")
    public final void method4982(int arg0, int arg1, class414 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class414 var6 = this.method4958(var5);
        int var7 = var5 * 2 + 1;
        class351 var8 = new class351(0, 0, arg2.field4390, arg2.field4383);
        class351 var9 = new class351(0, 0);
        this.field3773.method5676(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3777; var10++) {
            int var11 = this.field3775[var10];
            int var12 = this.field3776[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4383 - (float) (var12 - arg1) * arg3) - var5;
            this.field3773.method5693(var13, var14);
            this.field3773.method5678(var8, var9);
            this.method4963(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4385.length; var15++) {
            if (arg2.field4385[var15] == 0) {
                arg2.field4385[var15] = -16777216;
            } else {
                int var16 = (arg2.field4385[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4385[var15] = -16777216;
                } else {
                    if (var16 > Statics.field146.length) {
                        var16 = Statics.field146.length;
                    }
                    int var17 = Statics.field146[var16 - 1];
                    arg2.field4385[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("kj.t(Lon;Lon;Lme;B)V")
    public void method4963(class414 arg0, class414 arg1, class351 arg2) {
        if (arg2.field4030 == 0 || arg2.field4029 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4028 == 0) {
            var4 = arg0.field4390 - arg2.field4030;
        }
        if (arg2.field4027 == 0) {
            var5 = arg0.field4383 - arg2.field4029;
        }
        int var6 = arg0.field4390 * var5 + var4;
        int var7 = arg2.field4027 * arg1.field4390 + arg2.field4028;
        for (int var8 = 0; var8 < arg2.field4029; var8++) {
            for (int var9 = 0; var9 < arg2.field4030; var9++) {
                int var10001 = var7++;
                arg1.field4385[var10001] += arg0.field4385[var6++];
            }
            var6 += arg0.field4390 - arg2.field4030;
            var7 += arg1.field4390 - arg2.field4030;
        }
    }
}
