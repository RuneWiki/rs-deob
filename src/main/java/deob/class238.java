package deob;

import java.util.HashMap;

@ObfuscatedName("if")
public class class238 {

    @ObfuscatedName("if.a")
    public final HashMap field3171 = new HashMap();

    @ObfuscatedName("if.t")
    public class319 field3177 = new class319(0, 0);

    @ObfuscatedName("if.n")
    public int[] field3179 = new int[2048];

    @ObfuscatedName("if.q")
    public int[] field3173 = new int[2048];

    @ObfuscatedName("if.v")
    public int field3170 = 0;

    public class238() {
        method3456();
    }

    @ObfuscatedName("gp.a(I)V")
    public static void method3456() {
        Statics.field3175 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class15.method393((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3175[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3175.length) {
            int var6 = var0 * 2;
            int var7 = class15.method393((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3175.length) {
                Statics.field3175[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("if.t(II)V")
    public void method4033(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class320.method91(0.0D, (double) ((float) arg0 / 3.0F), arg0);
        double var4 = var3[arg0] * var3[arg0];
        int[] var6 = new int[var2 * var2];
        boolean var7 = false;
        for (int var8 = 0; var8 < var2; var8++) {
            for (int var9 = 0; var9 < var2; var9++) {
                int var10 = var6[var2 * var8 + var9] = (int) (var3[var8] * var3[var9] / var4 * 256.0D);
                if (!var7 && var10 > 0) {
                    var7 = true;
                }
            }
        }
        class325 var11 = new class325(var6, var2, var2);
        this.field3171.put(arg0, var11);
    }

    @ObfuscatedName("if.n(II)Llx;")
    public class325 method4034(int arg0) {
        if (!this.field3171.containsKey(arg0)) {
            this.method4033(arg0);
        }
        return (class325) this.field3171.get(arg0);
    }

    @ObfuscatedName("if.q(IIB)V")
    public final void method4035(int arg0, int arg1) {
        if (this.field3170 < this.field3179.length) {
            this.field3179[this.field3170] = arg0;
            this.field3173[this.field3170] = arg1;
            this.field3170++;
        }
    }

    @ObfuscatedName("if.v(I)V")
    public final void method4041() {
        this.field3170 = 0;
    }

    @ObfuscatedName("if.l(IILlx;FI)V")
    public final void method4037(int arg0, int arg1, class325 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class325 var6 = this.method4034(var5);
        int var7 = var5 * 2 + 1;
        class319 var8 = new class319(0, 0, arg2.field3863, arg2.field3870);
        class319 var9 = new class319(0, 0);
        this.field3177.method5563(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3170; var10++) {
            int var11 = this.field3179[var10];
            int var12 = this.field3173[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3870 - (float) (var12 - arg1) * arg3) - var5;
            this.field3177.method5542(var13, var14);
            this.field3177.method5541(var8, var9);
            this.method4040(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3866.length; var15++) {
            if (arg2.field3866[var15] == 0) {
                arg2.field3866[var15] = -16777216;
            } else {
                int var16 = (arg2.field3866[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3866[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3175.length) {
                        var16 = Statics.field3175.length;
                    }
                    int var17 = Statics.field3175[var16 - 1];
                    arg2.field3866[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("if.c(Llx;Llx;Lls;B)V")
    public void method4040(class325 arg0, class325 arg1, class319 arg2) {
        if (arg2.field3828 == 0 || arg2.field3826 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3830 == 0) {
            var4 = arg0.field3863 - arg2.field3828;
        }
        if (arg2.field3827 == 0) {
            var5 = arg0.field3870 - arg2.field3826;
        }
        int var6 = arg0.field3863 * var5 + var4;
        int var7 = arg2.field3827 * arg1.field3863 + arg2.field3830;
        for (int var8 = 0; var8 < arg2.field3826; var8++) {
            for (int var9 = 0; var9 < arg2.field3828; var9++) {
                int var10001 = var7++;
                arg1.field3866[var10001] += arg0.field3866[var6++];
            }
            var6 += arg0.field3863 - arg2.field3828;
            var7 += arg1.field3863 - arg2.field3828;
        }
    }
}
