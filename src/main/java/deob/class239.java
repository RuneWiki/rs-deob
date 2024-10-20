package deob;

import java.util.HashMap;

@ObfuscatedName("in")
public class class239 {

    @ObfuscatedName("in.c")
    public final HashMap field3189 = new HashMap();

    @ObfuscatedName("in.t")
    public class320 field3192 = new class320(0, 0);

    @ObfuscatedName("in.o")
    public int[] field3190 = new int[2048];

    @ObfuscatedName("in.e")
    public int[] field3188 = new int[2048];

    @ObfuscatedName("in.i")
    public int field3191 = 0;

    public class239() {
        Statics.field2719 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class15.method2378((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field2719[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field2719.length) {
            int var7 = var1 * 2;
            int var8 = class15.method2378((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field2719.length) {
                Statics.field2719[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("in.c(II)V")
    public void method3997(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class321.method5419(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class326 var11 = new class326(var6, var2, var2);
        this.field3189.put(arg0, var11);
    }

    @ObfuscatedName("in.t(IB)Llt;")
    public class326 method4000(int arg0) {
        if (!this.field3189.containsKey(arg0)) {
            this.method3997(arg0);
        }
        return (class326) this.field3189.get(arg0);
    }

    @ObfuscatedName("in.o(IIB)V")
    public final void method4012(int arg0, int arg1) {
        if (this.field3191 < this.field3190.length) {
            this.field3190[this.field3191] = arg0;
            this.field3188[this.field3191] = arg1;
            this.field3191++;
        }
    }

    @ObfuscatedName("in.e(B)V")
    public final void method3999() {
        this.field3191 = 0;
    }

    @ObfuscatedName("in.i(IILlt;FB)V")
    public final void method4008(int arg0, int arg1, class326 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class326 var6 = this.method4000(var5);
        int var7 = var5 * 2 + 1;
        class320 var8 = new class320(0, 0, arg2.field3870, arg2.field3872);
        class320 var9 = new class320(0, 0);
        this.field3192.method5544(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3191; var10++) {
            int var11 = this.field3190[var10];
            int var12 = this.field3188[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3872 - (float) (var12 - arg1) * arg3) - var5;
            this.field3192.method5543(var13, var14);
            this.field3192.method5545(var8, var9);
            this.method4001(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3875.length; var15++) {
            if (arg2.field3875[var15] == 0) {
                arg2.field3875[var15] = -16777216;
            } else {
                int var16 = (arg2.field3875[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3875[var15] = -16777216;
                } else {
                    if (var16 > Statics.field2719.length) {
                        var16 = Statics.field2719.length;
                    }
                    int var17 = Statics.field2719[var16 - 1];
                    arg2.field3875[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("in.g(Llt;Llt;Lll;I)V")
    public void method4001(class326 arg0, class326 arg1, class320 arg2) {
        if (arg2.field3838 == 0 || arg2.field3839 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3837 == 0) {
            var4 = arg0.field3870 - arg2.field3838;
        }
        if (arg2.field3836 == 0) {
            var5 = arg0.field3872 - arg2.field3839;
        }
        int var6 = arg0.field3870 * var5 + var4;
        int var7 = arg2.field3836 * arg1.field3870 + arg2.field3837;
        for (int var8 = 0; var8 < arg2.field3839; var8++) {
            for (int var9 = 0; var9 < arg2.field3838; var9++) {
                int var10001 = var7++;
                arg1.field3875[var10001] += arg0.field3875[var6++];
            }
            var6 += arg0.field3870 - arg2.field3838;
            var7 += arg1.field3870 - arg2.field3838;
        }
    }
}
