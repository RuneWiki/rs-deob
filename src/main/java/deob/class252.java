package deob;

import java.util.HashMap;

@ObfuscatedName("in")
public class class252 {

    @ObfuscatedName("in.z")
    public final HashMap field3221 = new HashMap();

    @ObfuscatedName("in.w")
    public class311 field3220 = new class311(0, 0);

    @ObfuscatedName("in.s")
    public int[] field3219 = new int[2048];

    @ObfuscatedName("in.l")
    public int[] field3217 = new int[2048];

    @ObfuscatedName("in.u")
    public int field3218 = 0;

    public class252() {
        method1453();
    }

    @ObfuscatedName("bn.z(B)V")
    public static void method1453() {
        Statics.field2555 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class10.method2937((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field2555[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field2555.length) {
            int var6 = var0 * 2;
            int var7 = class10.method2937((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field2555.length) {
                Statics.field2555[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("in.w(II)V")
    public void method4383(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class312.method4595(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class319 var11 = new class319(var6, var2, var2);
        this.field3221.put(arg0, var11);
    }

    @ObfuscatedName("in.s(IB)Lll;")
    public class319 method4384(int arg0) {
        if (!this.field3221.containsKey(arg0)) {
            this.method4383(arg0);
        }
        return (class319) this.field3221.get(arg0);
    }

    @ObfuscatedName("in.l(III)V")
    public final void method4385(int arg0, int arg1) {
        if (this.field3218 < this.field3219.length) {
            this.field3219[this.field3218] = arg0;
            this.field3217[this.field3218] = arg1;
            this.field3218++;
        }
    }

    @ObfuscatedName("in.u(I)V")
    public final void method4386() {
        this.field3218 = 0;
    }

    @ObfuscatedName("in.q(IILll;FI)V")
    public final void method4388(int arg0, int arg1, class319 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class319 var6 = this.method4384(var5);
        int var7 = var5 * 2 + 1;
        class311 var8 = new class311(0, 0, arg2.field3788, arg2.field3789);
        class311 var9 = new class311(0, 0);
        this.field3220.method5248(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3218; var10++) {
            int var11 = this.field3219[var10];
            int var12 = this.field3217[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3789 - (float) (var12 - arg1) * arg3) - var5;
            this.field3220.method5247(var13, var14);
            this.field3220.method5249(var8, var9);
            this.method4402(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3792.length; var15++) {
            if (arg2.field3792[var15] == 0) {
                arg2.field3792[var15] = -16777216;
            } else {
                int var16 = (arg2.field3792[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3792[var15] = -16777216;
                } else {
                    if (var16 > Statics.field2555.length) {
                        var16 = Statics.field2555.length;
                    }
                    int var17 = Statics.field2555[var16 - 1];
                    arg2.field3792[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("in.i(Lll;Lll;Lkg;B)V")
    public void method4402(class319 arg0, class319 arg1, class311 arg2) {
        if (arg2.field3748 == 0 || arg2.field3746 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3747 == 0) {
            var4 = arg0.field3788 - arg2.field3748;
        }
        if (arg2.field3744 == 0) {
            var5 = arg0.field3789 - arg2.field3746;
        }
        int var6 = arg0.field3788 * var5 + var4;
        int var7 = arg2.field3744 * arg1.field3788 + arg2.field3747;
        for (int var8 = 0; var8 < arg2.field3746; var8++) {
            for (int var9 = 0; var9 < arg2.field3748; var9++) {
                int var10001 = var7++;
                arg1.field3792[var10001] += arg0.field3792[var6++];
            }
            var6 += arg0.field3788 - arg2.field3748;
            var7 += arg1.field3788 - arg2.field3748;
        }
    }
}
