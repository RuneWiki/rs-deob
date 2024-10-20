package deob;

import java.util.HashMap;

@ObfuscatedName("is")
public class class254 {

    @ObfuscatedName("is.g")
    public final HashMap field3285 = new HashMap();

    @ObfuscatedName("is.r")
    public class316 field3283 = new class316(0, 0);

    @ObfuscatedName("is.e")
    public int[] field3282 = new int[2048];

    @ObfuscatedName("is.q")
    public int[] field3287 = new int[2048];

    @ObfuscatedName("is.c")
    public int field3286 = 0;

    public class254() {
        Statics.field210 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class10.method80((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field210[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field210.length) {
            int var7 = var1 * 2;
            int var8 = class10.method80((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field210.length) {
                Statics.field210[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("is.g(II)V")
    public void method4578(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class317.method5523(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class324 var11 = new class324(var6, var2, var2);
        this.field3285.put(arg0, var11);
    }

    @ObfuscatedName("is.r(IS)Lls;")
    public class324 method4579(int arg0) {
        if (!this.field3285.containsKey(arg0)) {
            this.method4578(arg0);
        }
        return (class324) this.field3285.get(arg0);
    }

    @ObfuscatedName("is.e(III)V")
    public final void method4580(int arg0, int arg1) {
        if (this.field3286 < this.field3282.length) {
            this.field3282[this.field3286] = arg0;
            this.field3287[this.field3286] = arg1;
            this.field3286++;
        }
    }

    @ObfuscatedName("is.q(I)V")
    public final void method4581() {
        this.field3286 = 0;
    }

    @ObfuscatedName("is.c(IILls;FB)V")
    public final void method4582(int arg0, int arg1, class324 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class324 var6 = this.method4579(var5);
        int var7 = var5 * 2 + 1;
        class316 var8 = new class316(0, 0, arg2.field3880, arg2.field3888);
        class316 var9 = new class316(0, 0);
        this.field3283.method5527(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3286; var10++) {
            int var11 = this.field3282[var10];
            int var12 = this.field3287[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3888 - (float) (var12 - arg1) * arg3) - var5;
            this.field3283.method5526(var13, var14);
            this.field3283.method5529(var8, var9);
            this.method4586(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3890.length; var15++) {
            if (arg2.field3890[var15] == 0) {
                arg2.field3890[var15] = -16777216;
            } else {
                int var16 = (arg2.field3890[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3890[var15] = -16777216;
                } else {
                    if (var16 > Statics.field210.length) {
                        var16 = Statics.field210.length;
                    }
                    int var17 = Statics.field210[var16 - 1];
                    arg2.field3890[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("is.i(Lls;Lls;Llc;I)V")
    public void method4586(class324 arg0, class324 arg1, class316 arg2) {
        if (arg2.field3838 == 0 || arg2.field3839 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3837 == 0) {
            var4 = arg0.field3880 - arg2.field3838;
        }
        if (arg2.field3836 == 0) {
            var5 = arg0.field3888 - arg2.field3839;
        }
        int var6 = arg0.field3880 * var5 + var4;
        int var7 = arg2.field3836 * arg1.field3880 + arg2.field3837;
        for (int var8 = 0; var8 < arg2.field3839; var8++) {
            for (int var9 = 0; var9 < arg2.field3838; var9++) {
                int var10001 = var7++;
                arg1.field3890[var10001] += arg0.field3890[var6++];
            }
            var6 += arg0.field3880 - arg2.field3838;
            var7 += arg1.field3880 - arg2.field3838;
        }
    }
}
