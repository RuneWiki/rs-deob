package deob;

import java.util.HashMap;

@ObfuscatedName("iz")
public class class254 {

    @ObfuscatedName("iz.f")
    public final HashMap field3267 = new HashMap();

    @ObfuscatedName("iz.h")
    public class316 field3268 = new class316(0, 0);

    @ObfuscatedName("iz.e")
    public int[] field3266 = new int[2048];

    @ObfuscatedName("iz.b")
    public int[] field3269 = new int[2048];

    @ObfuscatedName("iz.l")
    public int field3270 = 0;

    public class254() {
        Statics.field3271 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class10.method3547((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field3271[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field3271.length) {
            int var7 = var1 * 2;
            int var8 = class10.method3547((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field3271.length) {
                Statics.field3271[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("iz.f(II)V")
    public void method4412(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class317.method4394(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        this.field3267.put(arg0, var11);
    }

    @ObfuscatedName("iz.h(IB)Lly;")
    public class324 method4418(int arg0) {
        if (!this.field3267.containsKey(arg0)) {
            this.method4412(arg0);
        }
        return (class324) this.field3267.get(arg0);
    }

    @ObfuscatedName("iz.e(III)V")
    public final void method4413(int arg0, int arg1) {
        if (this.field3270 < this.field3266.length) {
            this.field3266[this.field3270] = arg0;
            this.field3269[this.field3270] = arg1;
            this.field3270++;
        }
    }

    @ObfuscatedName("iz.b(I)V")
    public final void method4425() {
        this.field3270 = 0;
    }

    @ObfuscatedName("iz.l(IILly;FI)V")
    public final void method4415(int arg0, int arg1, class324 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class324 var6 = this.method4418(var5);
        int var7 = var5 * 2 + 1;
        class316 var8 = new class316(0, 0, arg2.field3870, arg2.field3878);
        class316 var9 = new class316(0, 0);
        this.field3268.method5296(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3270; var10++) {
            int var11 = this.field3266[var10];
            int var12 = this.field3269[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3878 - (float) (var12 - arg1) * arg3) - var5;
            this.field3268.method5294(var13, var14);
            this.field3268.method5307(var8, var9);
            this.method4416(var6, arg2, var9);
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
                    if (var16 > Statics.field3271.length) {
                        var16 = Statics.field3271.length;
                    }
                    int var17 = Statics.field3271[var16 - 1];
                    arg2.field3873[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("iz.w(Lly;Lly;Llo;I)V")
    public void method4416(class324 arg0, class324 arg1, class316 arg2) {
        if (arg2.field3832 == 0 || arg2.field3828 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3830 == 0) {
            var4 = arg0.field3870 - arg2.field3832;
        }
        if (arg2.field3831 == 0) {
            var5 = arg0.field3878 - arg2.field3828;
        }
        int var6 = arg0.field3870 * var5 + var4;
        int var7 = arg2.field3831 * arg1.field3870 + arg2.field3830;
        for (int var8 = 0; var8 < arg2.field3828; var8++) {
            for (int var9 = 0; var9 < arg2.field3832; var9++) {
                int var10001 = var7++;
                arg1.field3873[var10001] += arg0.field3873[var6++];
            }
            var6 += arg0.field3870 - arg2.field3832;
            var7 += arg1.field3870 - arg2.field3832;
        }
    }
}
