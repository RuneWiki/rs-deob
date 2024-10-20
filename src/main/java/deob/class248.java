package deob;

import java.util.HashMap;

@ObfuscatedName("ix")
public class class248 {

    @ObfuscatedName("ix.m")
    public final HashMap field3224 = new HashMap();

    @ObfuscatedName("ix.o")
    public class329 field3218 = new class329(0, 0);

    @ObfuscatedName("ix.q")
    public int[] field3219 = new int[2048];

    @ObfuscatedName("ix.j")
    public int[] field3223 = new int[2048];

    @ObfuscatedName("ix.p")
    public int field3220 = 0;

    public class248() {
        method986();
    }

    @ObfuscatedName("bc.m(I)V")
    public static void method986() {
        Statics.field3221 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class24.method1067((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3221[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3221.length) {
            int var6 = var0 * 2;
            int var7 = class24.method1067((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3221.length) {
                Statics.field3221[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("ix.o(II)V")
    public void method4060(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class330.method1080(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        this.field3224.put(arg0, var11);
    }

    @ObfuscatedName("ix.q(II)Llz;")
    public class335 method4061(int arg0) {
        if (!this.field3224.containsKey(arg0)) {
            this.method4060(arg0);
        }
        return (class335) this.field3224.get(arg0);
    }

    @ObfuscatedName("ix.j(III)V")
    public final void method4078(int arg0, int arg1) {
        if (this.field3220 < this.field3219.length) {
            this.field3219[this.field3220] = arg0;
            this.field3223[this.field3220] = arg1;
            this.field3220++;
        }
    }

    @ObfuscatedName("ix.p(I)V")
    public final void method4063() {
        this.field3220 = 0;
    }

    @ObfuscatedName("ix.g(IILlz;FI)V")
    public final void method4064(int arg0, int arg1, class335 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class335 var6 = this.method4061(var5);
        int var7 = var5 * 2 + 1;
        class329 var8 = new class329(0, 0, arg2.field3897, arg2.field3895);
        class329 var9 = new class329(0, 0);
        this.field3218.method5653(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3220; var10++) {
            int var11 = this.field3219[var10];
            int var12 = this.field3223[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3895 - (float) (var12 - arg1) * arg3) - var5;
            this.field3218.method5656(var13, var14);
            this.field3218.method5663(var8, var9);
            this.method4086(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3896.length; var15++) {
            if (arg2.field3896[var15] == 0) {
                arg2.field3896[var15] = -16777216;
            } else {
                int var16 = (arg2.field3896[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3896[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3221.length) {
                        var16 = Statics.field3221.length;
                    }
                    int var17 = Statics.field3221[var16 - 1];
                    arg2.field3896[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ix.n(Llz;Llz;Llv;B)V")
    public void method4086(class335 arg0, class335 arg1, class329 arg2) {
        if (arg2.field3867 == 0 || arg2.field3864 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3866 == 0) {
            var4 = arg0.field3897 - arg2.field3867;
        }
        if (arg2.field3865 == 0) {
            var5 = arg0.field3895 - arg2.field3864;
        }
        int var6 = arg0.field3897 * var5 + var4;
        int var7 = arg2.field3865 * arg1.field3897 + arg2.field3866;
        for (int var8 = 0; var8 < arg2.field3864; var8++) {
            for (int var9 = 0; var9 < arg2.field3867; var9++) {
                int var10001 = var7++;
                arg1.field3896[var10001] += arg0.field3896[var6++];
            }
            var6 += arg0.field3897 - arg2.field3867;
            var7 += arg1.field3897 - arg2.field3867;
        }
    }
}
