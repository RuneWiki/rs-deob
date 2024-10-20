package deob;

import java.util.HashMap;

@ObfuscatedName("jj")
public class class266 {

    @ObfuscatedName("jj.d")
    public final HashMap field3430 = new HashMap();

    @ObfuscatedName("jj.z")
    public class324 field3427 = new class324(0, 0);

    @ObfuscatedName("jj.n")
    public int[] field3428 = new int[2048];

    @ObfuscatedName("jj.r")
    public int[] field3432 = new int[2048];

    @ObfuscatedName("jj.e")
    public int field3429 = 0;

    public class266() {
        method70();
    }

    @ObfuscatedName("i.d(B)V")
    public static void method70() {
        Statics.field3426 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class22.method1711((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3426[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3426.length) {
            int var6 = var0 * 2;
            int var7 = class22.method1711((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3426.length) {
                Statics.field3426[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("jj.z(II)V")
    public void method4417(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class325.method909(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class332 var11 = new class332(var6, var2, var2);
        this.field3430.put(arg0, var11);
    }

    @ObfuscatedName("jj.n(II)Lly;")
    public class332 method4439(int arg0) {
        if (!this.field3430.containsKey(arg0)) {
            this.method4417(arg0);
        }
        return (class332) this.field3430.get(arg0);
    }

    @ObfuscatedName("jj.r(III)V")
    public final void method4418(int arg0, int arg1) {
        if (this.field3429 < this.field3428.length) {
            this.field3428[this.field3429] = arg0;
            this.field3432[this.field3429] = arg1;
            this.field3429++;
        }
    }

    @ObfuscatedName("jj.e(I)V")
    public final void method4419() {
        this.field3429 = 0;
    }

    @ObfuscatedName("jj.y(IILly;FI)V")
    public final void method4436(int arg0, int arg1, class332 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class332 var6 = this.method4439(var5);
        int var7 = var5 * 2 + 1;
        class324 var8 = new class324(0, 0, arg2.field3981, arg2.field3988);
        class324 var9 = new class324(0, 0);
        this.field3427.method5299(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3429; var10++) {
            int var11 = this.field3428[var10];
            int var12 = this.field3432[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3988 - (float) (var12 - arg1) * arg3) - var5;
            this.field3427.method5303(var13, var14);
            this.field3427.method5301(var8, var9);
            this.method4421(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3983.length; var15++) {
            if (arg2.field3983[var15] == 0) {
                arg2.field3983[var15] = -16777216;
            } else {
                int var16 = (arg2.field3983[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3983[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3426.length) {
                        var16 = Statics.field3426.length;
                    }
                    int var17 = Statics.field3426[var16 - 1];
                    arg2.field3983[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("jj.k(Lly;Lly;Llj;I)V")
    public void method4421(class332 arg0, class332 arg1, class324 arg2) {
        if (arg2.field3938 == 0 || arg2.field3937 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3940 == 0) {
            var4 = arg0.field3981 - arg2.field3938;
        }
        if (arg2.field3936 == 0) {
            var5 = arg0.field3988 - arg2.field3937;
        }
        int var6 = arg0.field3981 * var5 + var4;
        int var7 = arg2.field3936 * arg1.field3981 + arg2.field3940;
        for (int var8 = 0; var8 < arg2.field3937; var8++) {
            for (int var9 = 0; var9 < arg2.field3938; var9++) {
                int var10001 = var7++;
                arg1.field3983[var10001] += arg0.field3983[var6++];
            }
            var6 += arg0.field3981 - arg2.field3938;
            var7 += arg1.field3981 - arg2.field3938;
        }
    }
}
