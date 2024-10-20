package deob;

import java.util.HashMap;

@ObfuscatedName("kv")
public class class301 {

    @ObfuscatedName("kv.i")
    public final HashMap field3760 = new HashMap();

    @ObfuscatedName("kv.w")
    public class351 field3764 = new class351(0, 0);

    @ObfuscatedName("kv.s")
    public int[] field3762 = new int[2048];

    @ObfuscatedName("kv.a")
    public int[] field3761 = new int[2048];

    @ObfuscatedName("kv.o")
    public int field3763 = 0;

    public class301() {
        method2378();
    }

    @ObfuscatedName("dc.i(I)V")
    public static void method2378() {
        Statics.field3766 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class186.method3143((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3766[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3766.length) {
            int var6 = var0 * 2;
            int var7 = class186.method3143((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3766.length) {
                Statics.field3766[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("kv.w(II)V")
    public void method4918(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            var6[var8] = class352.method2290((double) var7, 0.0D, var3);
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
        class414 var18 = new class414(var13, var2, var2);
        this.field3760.put(arg0, var18);
    }

    @ObfuscatedName("kv.s(II)Low;")
    public class414 method4919(int arg0) {
        if (!this.field3760.containsKey(arg0)) {
            this.method4918(arg0);
        }
        return (class414) this.field3760.get(arg0);
    }

    @ObfuscatedName("kv.a(III)V")
    public final void method4929(int arg0, int arg1) {
        if (this.field3763 < this.field3762.length) {
            this.field3762[this.field3763] = arg0;
            this.field3761[this.field3763] = arg1;
            this.field3763++;
        }
    }

    @ObfuscatedName("kv.o(I)V")
    public final void method4921() {
        this.field3763 = 0;
    }

    @ObfuscatedName("kv.g(IILow;FB)V")
    public final void method4922(int arg0, int arg1, class414 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class414 var6 = this.method4919(var5);
        int var7 = var5 * 2 + 1;
        class351 var8 = new class351(0, 0, arg2.field4394, arg2.field4395);
        class351 var9 = new class351(0, 0);
        this.field3764.method5661(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3763; var10++) {
            int var11 = this.field3762[var10];
            int var12 = this.field3761[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4395 - (float) (var12 - arg1) * arg3) - var5;
            this.field3764.method5660(var13, var14);
            this.field3764.method5674(var8, var9);
            this.method4925(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4396.length; var15++) {
            if (arg2.field4396[var15] == 0) {
                arg2.field4396[var15] = -16777216;
            } else {
                int var16 = (arg2.field4396[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4396[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3766.length) {
                        var16 = Statics.field3766.length;
                    }
                    int var17 = Statics.field3766[var16 - 1];
                    arg2.field4396[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("kv.e(Low;Low;Lmo;B)V")
    public void method4925(class414 arg0, class414 arg1, class351 arg2) {
        if (arg2.field4022 == 0 || arg2.field4020 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4021 == 0) {
            var4 = arg0.field4394 - arg2.field4022;
        }
        if (arg2.field4023 == 0) {
            var5 = arg0.field4395 - arg2.field4020;
        }
        int var6 = arg0.field4394 * var5 + var4;
        int var7 = arg2.field4023 * arg1.field4394 + arg2.field4021;
        for (int var8 = 0; var8 < arg2.field4020; var8++) {
            for (int var9 = 0; var9 < arg2.field4022; var9++) {
                int var10001 = var7++;
                arg1.field4396[var10001] += arg0.field4396[var6++];
            }
            var6 += arg0.field4394 - arg2.field4022;
            var7 += arg1.field4394 - arg2.field4022;
        }
    }
}
