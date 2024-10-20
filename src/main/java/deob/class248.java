package deob;

import java.util.HashMap;

@ObfuscatedName("in")
public class class248 {

    @ObfuscatedName("in.x")
    public final HashMap field3190 = new HashMap();

    @ObfuscatedName("in.m")
    public class329 field3186 = new class329(0, 0);

    @ObfuscatedName("in.k")
    public int[] field3187 = new int[2048];

    @ObfuscatedName("in.d")
    public int[] field3185 = new int[2048];

    @ObfuscatedName("in.w")
    public int field3189 = 0;

    public class248() {
        method1121();
    }

    @ObfuscatedName("bp.x(I)V")
    public static void method1121() {
        Statics.field4035 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class24.method1955((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field4035[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field4035.length) {
            int var6 = var0 * 2;
            int var7 = class24.method1955((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field4035.length) {
                Statics.field4035[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("in.m(IB)V")
    public void method4023(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class330.method2191(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        this.field3190.put(arg0, var11);
    }

    @ObfuscatedName("in.k(II)Lla;")
    public class335 method4014(int arg0) {
        if (!this.field3190.containsKey(arg0)) {
            this.method4023(arg0);
        }
        return (class335) this.field3190.get(arg0);
    }

    @ObfuscatedName("in.d(III)V")
    public final void method4017(int arg0, int arg1) {
        if (this.field3189 < this.field3187.length) {
            this.field3187[this.field3189] = arg0;
            this.field3185[this.field3189] = arg1;
            this.field3189++;
        }
    }

    @ObfuscatedName("in.w(I)V")
    public final void method4018() {
        this.field3189 = 0;
    }

    @ObfuscatedName("in.v(IILla;FI)V")
    public final void method4019(int arg0, int arg1, class335 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class335 var6 = this.method4014(var5);
        int var7 = var5 * 2 + 1;
        class329 var8 = new class329(0, 0, arg2.field3890, arg2.field3900);
        class329 var9 = new class329(0, 0);
        this.field3186.method5566(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3189; var10++) {
            int var11 = this.field3187[var10];
            int var12 = this.field3185[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3900 - (float) (var12 - arg1) * arg3) - var5;
            this.field3186.method5565(var13, var14);
            this.field3186.method5564(var8, var9);
            this.method4038(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3897.length; var15++) {
            if (arg2.field3897[var15] == 0) {
                arg2.field3897[var15] = -16777216;
            } else {
                int var16 = (arg2.field3897[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3897[var15] = -16777216;
                } else {
                    if (var16 > Statics.field4035.length) {
                        var16 = Statics.field4035.length;
                    }
                    int var17 = Statics.field4035[var16 - 1];
                    arg2.field3897[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("in.q(Lla;Lla;Lld;I)V")
    public void method4038(class335 arg0, class335 arg1, class329 arg2) {
        if (arg2.field3856 == 0 || arg2.field3857 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3858 == 0) {
            var4 = arg0.field3890 - arg2.field3856;
        }
        if (arg2.field3854 == 0) {
            var5 = arg0.field3900 - arg2.field3857;
        }
        int var6 = arg0.field3890 * var5 + var4;
        int var7 = arg2.field3854 * arg1.field3890 + arg2.field3858;
        for (int var8 = 0; var8 < arg2.field3857; var8++) {
            for (int var9 = 0; var9 < arg2.field3856; var9++) {
                int var10001 = var7++;
                arg1.field3897[var10001] += arg0.field3897[var6++];
            }
            var6 += arg0.field3890 - arg2.field3856;
            var7 += arg1.field3890 - arg2.field3856;
        }
    }
}
