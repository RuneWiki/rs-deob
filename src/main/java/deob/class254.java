package deob;

import java.util.HashMap;

@ObfuscatedName("ij")
public class class254 {

    @ObfuscatedName("ij.c")
    public final HashMap field3254 = new HashMap();

    @ObfuscatedName("ij.q")
    public class316 field3249 = new class316(0, 0);

    @ObfuscatedName("ij.m")
    public int[] field3248 = new int[2048];

    @ObfuscatedName("ij.j")
    public int[] field3251 = new int[2048];

    @ObfuscatedName("ij.g")
    public int field3250 = 0;

    public class254() {
        method469();
    }

    @ObfuscatedName("ay.c(I)V")
    public static void method469() {
        Statics.field3777 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class10.method1470((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3777[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3777.length) {
            int var6 = var0 * 2;
            int var7 = class10.method1470((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3777.length) {
                Statics.field3777[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("ij.q(II)V")
    public void method4387(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            var6[var8] = class317.method3827((double) var7, 0.0D, var3);
            var7++;
            var8++;
        }
        double[] var10 = var6;
        double var11 = var6[arg0] * var6[arg0];
        int[] var13 = new int[var2 * var2];
        boolean var14 = false;
        for (int var15 = 0; var15 < var2; var15++) {
            for (int var16 = 0; var16 < var2; var16++) {
                int var17 = var13[var2 * var15 + var16] = (int) (var10[var15] * var10[var16] / var11 * 256.0D);
                if (!var14 && var17 > 0) {
                    var14 = true;
                }
            }
        }
        class324 var18 = new class324(var13, var2, var2);
        this.field3254.put(arg0, var18);
    }

    @ObfuscatedName("ij.m(II)Llt;")
    public class324 method4369(int arg0) {
        if (!this.field3254.containsKey(arg0)) {
            this.method4387(arg0);
        }
        return (class324) this.field3254.get(arg0);
    }

    @ObfuscatedName("ij.j(IIS)V")
    public final void method4373(int arg0, int arg1) {
        if (this.field3250 < this.field3248.length) {
            this.field3248[this.field3250] = arg0;
            this.field3251[this.field3250] = arg1;
            this.field3250++;
        }
    }

    @ObfuscatedName("ij.g(I)V")
    public final void method4371() {
        this.field3250 = 0;
    }

    @ObfuscatedName("ij.i(IILlt;FI)V")
    public final void method4372(int arg0, int arg1, class324 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class324 var6 = this.method4369(var5);
        int var7 = var5 * 2 + 1;
        class316 var8 = new class316(0, 0, arg2.field3852, arg2.field3862);
        class316 var9 = new class316(0, 0);
        this.field3249.method5337(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3250; var10++) {
            int var11 = this.field3248[var10];
            int var12 = this.field3251[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3862 - (float) (var12 - arg1) * arg3) - var5;
            this.field3249.method5324(var13, var14);
            this.field3249.method5327(var8, var9);
            this.method4379(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3853.length; var15++) {
            if (arg2.field3853[var15] == 0) {
                arg2.field3853[var15] = -16777216;
            } else {
                int var16 = (arg2.field3853[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3853[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3777.length) {
                        var16 = Statics.field3777.length;
                    }
                    int var17 = Statics.field3777[var16 - 1];
                    arg2.field3853[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ij.h(Llt;Llt;Lll;B)V")
    public void method4379(class324 arg0, class324 arg1, class316 arg2) {
        if (arg2.field3808 == 0 || arg2.field3803 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3805 == 0) {
            var4 = arg0.field3852 - arg2.field3808;
        }
        if (arg2.field3804 == 0) {
            var5 = arg0.field3862 - arg2.field3803;
        }
        int var6 = arg0.field3852 * var5 + var4;
        int var7 = arg2.field3804 * arg1.field3852 + arg2.field3805;
        for (int var8 = 0; var8 < arg2.field3803; var8++) {
            for (int var9 = 0; var9 < arg2.field3808; var9++) {
                int var10001 = var7++;
                arg1.field3853[var10001] += arg0.field3853[var6++];
            }
            var6 += arg0.field3852 - arg2.field3808;
            var7 += arg1.field3852 - arg2.field3808;
        }
    }
}
