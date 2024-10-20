package deob;

import java.util.HashMap;

@ObfuscatedName("ir")
public class class238 {

    @ObfuscatedName("ir.c")
    public final HashMap field3169 = new HashMap();

    @ObfuscatedName("ir.x")
    public class319 field3163 = new class319(0, 0);

    @ObfuscatedName("ir.t")
    public int[] field3164 = new int[2048];

    @ObfuscatedName("ir.g")
    public int[] field3165 = new int[2048];

    @ObfuscatedName("ir.l")
    public int field3166 = 0;

    public class238() {
        method3487();
    }

    @ObfuscatedName("gt.c(I)V")
    public static void method3487() {
        Statics.field68 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class15.method4930((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field68[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field68.length) {
            int var6 = var0 * 2;
            int var7 = class15.method4930((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field68.length) {
                Statics.field68[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("ir.x(II)V")
    public void method3986(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            var6[var8] = class320.method894((double) var7, 0.0D, var3);
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
        class325 var18 = new class325(var13, var2, var2);
        this.field3169.put(arg0, var18);
    }

    @ObfuscatedName("ir.t(II)Lli;")
    public class325 method3968(int arg0) {
        if (!this.field3169.containsKey(arg0)) {
            this.method3986(arg0);
        }
        return (class325) this.field3169.get(arg0);
    }

    @ObfuscatedName("ir.g(III)V")
    public final void method3994(int arg0, int arg1) {
        if (this.field3166 < this.field3164.length) {
            this.field3164[this.field3166] = arg0;
            this.field3165[this.field3166] = arg1;
            this.field3166++;
        }
    }

    @ObfuscatedName("ir.l(I)V")
    public final void method3970() {
        this.field3166 = 0;
    }

    @ObfuscatedName("ir.u(IILli;FI)V")
    public final void method3971(int arg0, int arg1, class325 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class325 var6 = this.method3968(var5);
        int var7 = var5 * 2 + 1;
        class319 var8 = new class319(0, 0, arg2.field3867, arg2.field3868);
        class319 var9 = new class319(0, 0);
        this.field3163.method5527(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3166; var10++) {
            int var11 = this.field3164[var10];
            int var12 = this.field3165[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3868 - (float) (var12 - arg1) * arg3) - var5;
            this.field3163.method5526(var13, var14);
            this.field3163.method5543(var8, var9);
            this.method3972(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3873.length; var15++) {
            if (arg2.field3873[var15] == 0) {
                arg2.field3873[var15] = -16777216;
            } else {
                int var16 = (arg2.field3873[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3873[var15] = -16777216;
                } else {
                    if (var16 > Statics.field68.length) {
                        var16 = Statics.field68.length;
                    }
                    int var17 = Statics.field68[var16 - 1];
                    arg2.field3873[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ir.j(Lli;Lli;Llr;I)V")
    public void method3972(class325 arg0, class325 arg1, class319 arg2) {
        if (arg2.field3835 == 0 || arg2.field3836 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3833 == 0) {
            var4 = arg0.field3867 - arg2.field3835;
        }
        if (arg2.field3834 == 0) {
            var5 = arg0.field3868 - arg2.field3836;
        }
        int var6 = arg0.field3867 * var5 + var4;
        int var7 = arg2.field3834 * arg1.field3867 + arg2.field3833;
        for (int var8 = 0; var8 < arg2.field3836; var8++) {
            for (int var9 = 0; var9 < arg2.field3835; var9++) {
                int var10001 = var7++;
                arg1.field3873[var10001] += arg0.field3873[var6++];
            }
            var6 += arg0.field3867 - arg2.field3835;
            var7 += arg1.field3867 - arg2.field3835;
        }
    }
}
