package deob;

import java.util.HashMap;

@ObfuscatedName("jp")
public class class266 {

    @ObfuscatedName("jp.c")
    public final HashMap field3427 = new HashMap();

    @ObfuscatedName("jp.i")
    public class324 field3431 = new class324(0, 0);

    @ObfuscatedName("jp.o")
    public int[] field3426 = new int[2048];

    @ObfuscatedName("jp.j")
    public int[] field3428 = new int[2048];

    @ObfuscatedName("jp.k")
    public int field3429 = 0;

    public class266() {
        method2856();
    }

    @ObfuscatedName("ex.c(I)V")
    public static void method2856() {
        Statics.field2147 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class22.method4398((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field2147[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field2147.length) {
            int var6 = var0 * 2;
            int var7 = class22.method4398((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field2147.length) {
                Statics.field2147[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("jp.i(IB)V")
    public void method4337(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            double var11 = class325.method4301((double) (var7) / var3) / var3;
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
        class332 var22 = new class332(var17, var2, var2);
        this.field3427.put(arg0, var22);
    }

    @ObfuscatedName("jp.o(IB)Lla;")
    public class332 method4336(int arg0) {
        if (!this.field3427.containsKey(arg0)) {
            this.method4337(arg0);
        }
        return (class332) this.field3427.get(arg0);
    }

    @ObfuscatedName("jp.j(III)V")
    public final void method4339(int arg0, int arg1) {
        if (this.field3429 < this.field3426.length) {
            this.field3426[this.field3429] = arg0;
            this.field3428[this.field3429] = arg1;
            this.field3429++;
        }
    }

    @ObfuscatedName("jp.k(I)V")
    public final void method4340() {
        this.field3429 = 0;
    }

    @ObfuscatedName("jp.x(IILla;FI)V")
    public final void method4341(int arg0, int arg1, class332 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class332 var6 = this.method4336(var5);
        int var7 = var5 * 2 + 1;
        class324 var8 = new class324(0, 0, arg2.field3979, arg2.field3980);
        class324 var9 = new class324(0, 0);
        this.field3431.method5276(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3429; var10++) {
            int var11 = this.field3426[var10];
            int var12 = this.field3428[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3980 - (float) (var12 - arg1) * arg3) - var5;
            this.field3431.method5298(var13, var14);
            this.field3431.method5275(var8, var9);
            this.method4342(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3987.length; var15++) {
            if (arg2.field3987[var15] == 0) {
                arg2.field3987[var15] = -16777216;
            } else {
                int var16 = (arg2.field3987[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3987[var15] = -16777216;
                } else {
                    if (var16 > Statics.field2147.length) {
                        var16 = Statics.field2147.length;
                    }
                    int var17 = Statics.field2147[var16 - 1];
                    arg2.field3987[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("jp.z(Lla;Lla;Llg;I)V")
    public void method4342(class332 arg0, class332 arg1, class324 arg2) {
        if (arg2.field3937 == 0 || arg2.field3938 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3940 == 0) {
            var4 = arg0.field3979 - arg2.field3937;
        }
        if (arg2.field3939 == 0) {
            var5 = arg0.field3980 - arg2.field3938;
        }
        int var6 = arg0.field3979 * var5 + var4;
        int var7 = arg2.field3939 * arg1.field3979 + arg2.field3940;
        for (int var8 = 0; var8 < arg2.field3938; var8++) {
            for (int var9 = 0; var9 < arg2.field3937; var9++) {
                int var10001 = var7++;
                arg1.field3987[var10001] += arg0.field3987[var6++];
            }
            var6 += arg0.field3979 - arg2.field3937;
            var7 += arg1.field3979 - arg2.field3937;
        }
    }
}
