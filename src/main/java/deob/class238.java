package deob;

import java.util.HashMap;

@ObfuscatedName("ih")
public class class238 {

    @ObfuscatedName("ih.q")
    public final HashMap field3184 = new HashMap();

    @ObfuscatedName("ih.w")
    public class320 field3187 = new class320(0, 0);

    @ObfuscatedName("ih.e")
    public int[] field3185 = new int[2048];

    @ObfuscatedName("ih.p")
    public int[] field3183 = new int[2048];

    @ObfuscatedName("ih.k")
    public int field3191 = 0;

    public class238() {
        Statics.field3190 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class15.method4810((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field3190[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field3190.length) {
            int var7 = var1 * 2;
            int var8 = class15.method4810((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field3190.length) {
                Statics.field3190[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("ih.q(II)V")
    public void method3936(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class321.method4607(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        this.field3184.put(arg0, var11);
    }

    @ObfuscatedName("ih.w(II)Lly;")
    public class326 method3937(int arg0) {
        if (!this.field3184.containsKey(arg0)) {
            this.method3936(arg0);
        }
        return (class326) this.field3184.get(arg0);
    }

    @ObfuscatedName("ih.e(IIB)V")
    public final void method3935(int arg0, int arg1) {
        if (this.field3191 < this.field3185.length) {
            this.field3185[this.field3191] = arg0;
            this.field3183[this.field3191] = arg1;
            this.field3191++;
        }
    }

    @ObfuscatedName("ih.p(B)V")
    public final void method3939() {
        this.field3191 = 0;
    }

    @ObfuscatedName("ih.k(IILly;FI)V")
    public final void method3940(int arg0, int arg1, class326 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class326 var6 = this.method3937(var5);
        int var7 = var5 * 2 + 1;
        class320 var8 = new class320(0, 0, arg2.field3900, arg2.field3901);
        class320 var9 = new class320(0, 0);
        this.field3187.method5488(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3191; var10++) {
            int var11 = this.field3185[var10];
            int var12 = this.field3183[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3901 - (float) (var12 - arg1) * arg3) - var5;
            this.field3187.method5487(var13, var14);
            this.field3187.method5507(var8, var9);
            this.method3941(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3909.length; var15++) {
            if (arg2.field3909[var15] == 0) {
                arg2.field3909[var15] = -16777216;
            } else {
                int var16 = (arg2.field3909[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3909[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3190.length) {
                        var16 = Statics.field3190.length;
                    }
                    int var17 = Statics.field3190[var16 - 1];
                    arg2.field3909[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ih.l(Lly;Lly;Lls;I)V")
    public void method3941(class326 arg0, class326 arg1, class320 arg2) {
        if (arg2.field3866 == 0 || arg2.field3867 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3864 == 0) {
            var4 = arg0.field3900 - arg2.field3866;
        }
        if (arg2.field3865 == 0) {
            var5 = arg0.field3901 - arg2.field3867;
        }
        int var6 = arg0.field3900 * var5 + var4;
        int var7 = arg2.field3865 * arg1.field3900 + arg2.field3864;
        for (int var8 = 0; var8 < arg2.field3867; var8++) {
            for (int var9 = 0; var9 < arg2.field3866; var9++) {
                int var10001 = var7++;
                arg1.field3909[var10001] += arg0.field3909[var6++];
            }
            var6 += arg0.field3900 - arg2.field3866;
            var7 += arg1.field3900 - arg2.field3866;
        }
    }
}
