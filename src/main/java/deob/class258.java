package deob;

import java.util.HashMap;

@ObfuscatedName("io")
public class class258 {

    @ObfuscatedName("io.n")
    public final HashMap field3286 = new HashMap();

    @ObfuscatedName("io.h")
    public class319 field3282 = new class319(0, 0);

    @ObfuscatedName("io.l")
    public int[] field3283 = new int[2048];

    @ObfuscatedName("io.g")
    public int[] field3288 = new int[2048];

    @ObfuscatedName("io.b")
    public int field3281 = 0;

    public class258() {
        method2019();
    }

    @ObfuscatedName("cd.n(I)V")
    public static void method2019() {
        Statics.field3285 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class15.method5502((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3285[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3285.length) {
            int var6 = var0 * 2;
            int var7 = class15.method5502((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3285.length) {
                Statics.field3285[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("io.h(IB)V")
    public void method4606(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            double var11 = class320.method3308((double) (var7) / var3) / var3;
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
        class327 var22 = new class327(var17, var2, var2);
        this.field3286.put(arg0, var22);
    }

    @ObfuscatedName("io.l(II)Llu;")
    public class327 method4605(int arg0) {
        if (!this.field3286.containsKey(arg0)) {
            this.method4606(arg0);
        }
        return (class327) this.field3286.get(arg0);
    }

    @ObfuscatedName("io.g(III)V")
    public final void method4624(int arg0, int arg1) {
        if (this.field3281 < this.field3283.length) {
            this.field3283[this.field3281] = arg0;
            this.field3288[this.field3281] = arg1;
            this.field3281++;
        }
    }

    @ObfuscatedName("io.b(S)V")
    public final void method4607() {
        this.field3281 = 0;
    }

    @ObfuscatedName("io.a(IILlu;FB)V")
    public final void method4614(int arg0, int arg1, class327 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class327 var6 = this.method4605(var5);
        int var7 = var5 * 2 + 1;
        class319 var8 = new class319(0, 0, arg2.field3878, arg2.field3880);
        class319 var9 = new class319(0, 0);
        this.field3282.method5552(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3281; var10++) {
            int var11 = this.field3283[var10];
            int var12 = this.field3288[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3880 - (float) (var12 - arg1) * arg3) - var5;
            this.field3282.method5557(var13, var14);
            this.field3282.method5553(var8, var9);
            this.method4609(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3883.length; var15++) {
            if (arg2.field3883[var15] == 0) {
                arg2.field3883[var15] = -16777216;
            } else {
                int var16 = (arg2.field3883[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3883[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3285.length) {
                        var16 = Statics.field3285.length;
                    }
                    int var17 = Statics.field3285[var16 - 1];
                    arg2.field3883[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("io.c(Llu;Llu;Llb;I)V")
    public void method4609(class327 arg0, class327 arg1, class319 arg2) {
        if (arg2.field3835 == 0 || arg2.field3836 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3834 == 0) {
            var4 = arg0.field3878 - arg2.field3835;
        }
        if (arg2.field3837 == 0) {
            var5 = arg0.field3880 - arg2.field3836;
        }
        int var6 = arg0.field3878 * var5 + var4;
        int var7 = arg2.field3837 * arg1.field3878 + arg2.field3834;
        for (int var8 = 0; var8 < arg2.field3836; var8++) {
            for (int var9 = 0; var9 < arg2.field3835; var9++) {
                int var10001 = var7++;
                arg1.field3883[var10001] += arg0.field3883[var6++];
            }
            var6 += arg0.field3878 - arg2.field3835;
            var7 += arg1.field3878 - arg2.field3835;
        }
    }
}
