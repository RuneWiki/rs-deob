package deob;

import java.util.HashMap;

@ObfuscatedName("id")
public class class248 {

    @ObfuscatedName("id.z")
    public final HashMap field3216 = new HashMap();

    @ObfuscatedName("id.k")
    public class329 field3219 = new class329(0, 0);

    @ObfuscatedName("id.s")
    public int[] field3215 = new int[2048];

    @ObfuscatedName("id.t")
    public int[] field3214 = new int[2048];

    @ObfuscatedName("id.i")
    public int field3217 = 0;

    public class248() {
        Statics.field40 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class24.method3148((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field40[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field40.length) {
            int var7 = var1 * 2;
            int var8 = class24.method3148((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field40.length) {
                Statics.field40[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("id.z(IB)V")
    public void method4037(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class330.method1219(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class335 var11 = new class335(var6, var2, var2);
        this.field3216.put(arg0, var11);
    }

    @ObfuscatedName("id.k(II)Llp;")
    public class335 method4034(int arg0) {
        if (!this.field3216.containsKey(arg0)) {
            this.method4037(arg0);
        }
        return (class335) this.field3216.get(arg0);
    }

    @ObfuscatedName("id.s(IIB)V")
    public final void method4045(int arg0, int arg1) {
        if (this.field3217 < this.field3215.length) {
            this.field3215[this.field3217] = arg0;
            this.field3214[this.field3217] = arg1;
            this.field3217++;
        }
    }

    @ObfuscatedName("id.t(I)V")
    public final void method4036() {
        this.field3217 = 0;
    }

    @ObfuscatedName("id.i(IILlp;FB)V")
    public final void method4032(int arg0, int arg1, class335 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class335 var6 = this.method4034(var5);
        int var7 = var5 * 2 + 1;
        class329 var8 = new class329(0, 0, arg2.field3905, arg2.field3907);
        class329 var9 = new class329(0, 0);
        this.field3219.method5620(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3217; var10++) {
            int var11 = this.field3215[var10];
            int var12 = this.field3214[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3907 - (float) (var12 - arg1) * arg3) - var5;
            this.field3219.method5618(var13, var14);
            this.field3219.method5621(var8, var9);
            this.method4038(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3906.length; var15++) {
            if (arg2.field3906[var15] == 0) {
                arg2.field3906[var15] = -16777216;
            } else {
                int var16 = (arg2.field3906[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3906[var15] = -16777216;
                } else {
                    if (var16 > Statics.field40.length) {
                        var16 = Statics.field40.length;
                    }
                    int var17 = Statics.field40[var16 - 1];
                    arg2.field3906[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("id.o(Llp;Llp;Llr;B)V")
    public void method4038(class335 arg0, class335 arg1, class329 arg2) {
        if (arg2.field3871 == 0 || arg2.field3873 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3874 == 0) {
            var4 = arg0.field3905 - arg2.field3871;
        }
        if (arg2.field3872 == 0) {
            var5 = arg0.field3907 - arg2.field3873;
        }
        int var6 = arg0.field3905 * var5 + var4;
        int var7 = arg2.field3872 * arg1.field3905 + arg2.field3874;
        for (int var8 = 0; var8 < arg2.field3873; var8++) {
            for (int var9 = 0; var9 < arg2.field3871; var9++) {
                int var10001 = var7++;
                arg1.field3906[var10001] += arg0.field3906[var6++];
            }
            var6 += arg0.field3905 - arg2.field3871;
            var7 += arg1.field3905 - arg2.field3871;
        }
    }
}
