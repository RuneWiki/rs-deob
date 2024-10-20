package deob;

import java.util.HashMap;

@ObfuscatedName("kp")
public class class301 {

    @ObfuscatedName("kp.n")
    public final HashMap field3776 = new HashMap();

    @ObfuscatedName("kp.c")
    public class350 field3774 = new class350(0, 0);

    @ObfuscatedName("kp.m")
    public int[] field3778 = new int[2048];

    @ObfuscatedName("kp.k")
    public int[] field3777 = new int[2048];

    @ObfuscatedName("kp.o")
    public int field3779 = 0;

    public class301() {
        method4449();
    }

    @ObfuscatedName("ia.n(I)V")
    public static void method4449() {
        Statics.field3770 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class186.method2585((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3770[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3770.length) {
            int var6 = var0 * 2;
            int var7 = class186.method2585((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3770.length) {
                Statics.field3770[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("kp.c(II)V")
    public void method4907(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class351.method2417(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class413 var11 = new class413(var6, var2, var2);
        this.field3776.put(arg0, var11);
    }

    @ObfuscatedName("kp.m(II)Loc;")
    public class413 method4909(int arg0) {
        if (!this.field3776.containsKey(arg0)) {
            this.method4907(arg0);
        }
        return (class413) this.field3776.get(arg0);
    }

    @ObfuscatedName("kp.k(III)V")
    public final void method4910(int arg0, int arg1) {
        if (this.field3779 < this.field3778.length) {
            this.field3778[this.field3779] = arg0;
            this.field3777[this.field3779] = arg1;
            this.field3779++;
        }
    }

    @ObfuscatedName("kp.o(B)V")
    public final void method4911() {
        this.field3779 = 0;
    }

    @ObfuscatedName("kp.g(IILoc;FI)V")
    public final void method4912(int arg0, int arg1, class413 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class413 var6 = this.method4909(var5);
        int var7 = var5 * 2 + 1;
        class350 var8 = new class350(0, 0, arg2.field4375, arg2.field4378);
        class350 var9 = new class350(0, 0);
        this.field3774.method5636(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3779; var10++) {
            int var11 = this.field3778[var10];
            int var12 = this.field3777[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4378 - (float) (var12 - arg1) * arg3) - var5;
            this.field3774.method5645(var13, var14);
            this.field3774.method5639(var8, var9);
            this.method4928(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4369.length; var15++) {
            if (arg2.field4369[var15] == 0) {
                arg2.field4369[var15] = -16777216;
            } else {
                int var16 = (arg2.field4369[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4369[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3770.length) {
                        var16 = Statics.field3770.length;
                    }
                    int var17 = Statics.field3770[var16 - 1];
                    arg2.field4369[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("kp.z(Loc;Loc;Lmt;I)V")
    public void method4928(class413 arg0, class413 arg1, class350 arg2) {
        if (arg2.field4015 == 0 || arg2.field4012 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4013 == 0) {
            var4 = arg0.field4375 - arg2.field4015;
        }
        if (arg2.field4014 == 0) {
            var5 = arg0.field4378 - arg2.field4012;
        }
        int var6 = arg0.field4375 * var5 + var4;
        int var7 = arg2.field4014 * arg1.field4375 + arg2.field4013;
        for (int var8 = 0; var8 < arg2.field4012; var8++) {
            for (int var9 = 0; var9 < arg2.field4015; var9++) {
                int var10001 = var7++;
                arg1.field4369[var10001] += arg0.field4369[var6++];
            }
            var6 += arg0.field4375 - arg2.field4015;
            var7 += arg1.field4375 - arg2.field4015;
        }
    }
}
