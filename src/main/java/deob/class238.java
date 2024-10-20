package deob;

import java.util.HashMap;

@ObfuscatedName("if")
public class class238 {

    @ObfuscatedName("if.u")
    public final HashMap field3196 = new HashMap();

    @ObfuscatedName("if.f")
    public class319 field3195 = new class319(0, 0);

    @ObfuscatedName("if.b")
    public int[] field3193 = new int[2048];

    @ObfuscatedName("if.g")
    public int[] field3194 = new int[2048];

    @ObfuscatedName("if.z")
    public int field3197 = 0;

    public class238() {
        method242();
    }

    @ObfuscatedName("t.u(I)V")
    public static void method242() {
        Statics.field1789 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class15.method3644((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field1789[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field1789.length) {
            int var6 = var0 * 2;
            int var7 = class15.method3644((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field1789.length) {
                Statics.field1789[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("if.f(II)V")
    public void method4004(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            double var11 = (double) (var7) / var3;
            double var13 = Math.exp(-var11 * var11 / 2.0D) / Math.sqrt(6.283185307179586D);
            double var15 = var13 / var3;
            var6[var8] = var15;
            var7++;
            var8++;
        }
        double[] var18 = var6;
        double var19 = var6[arg0] * var6[arg0];
        int[] var21 = new int[var2 * var2];
        boolean var22 = false;
        for (int var23 = 0; var23 < var2; var23++) {
            for (int var24 = 0; var24 < var2; var24++) {
                int var25 = var21[var2 * var23 + var24] = (int) (var18[var23] * var18[var24] / var19 * 256.0D);
                if (!var22 && var25 > 0) {
                    var22 = true;
                }
            }
        }
        class325 var26 = new class325(var21, var2, var2);
        this.field3196.put(arg0, var26);
    }

    @ObfuscatedName("if.b(IS)Lln;")
    public class325 method4005(int arg0) {
        if (!this.field3196.containsKey(arg0)) {
            this.method4004(arg0);
        }
        return (class325) this.field3196.get(arg0);
    }

    @ObfuscatedName("if.g(IIB)V")
    public final void method4006(int arg0, int arg1) {
        if (this.field3197 < this.field3193.length) {
            this.field3193[this.field3197] = arg0;
            this.field3194[this.field3197] = arg1;
            this.field3197++;
        }
    }

    @ObfuscatedName("if.z(I)V")
    public final void method4003() {
        this.field3197 = 0;
    }

    @ObfuscatedName("if.p(IILln;FI)V")
    public final void method4008(int arg0, int arg1, class325 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class325 var6 = this.method4005(var5);
        int var7 = var5 * 2 + 1;
        class319 var8 = new class319(0, 0, arg2.field3869, arg2.field3872);
        class319 var9 = new class319(0, 0);
        this.field3195.method5562(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3197; var10++) {
            int var11 = this.field3193[var10];
            int var12 = this.field3194[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3872 - (float) (var12 - arg1) * arg3) - var5;
            this.field3195.method5561(var13, var14);
            this.field3195.method5563(var8, var9);
            this.method4009(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3877.length; var15++) {
            if (arg2.field3877[var15] == 0) {
                arg2.field3877[var15] = -16777216;
            } else {
                int var16 = (arg2.field3877[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3877[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1789.length) {
                        var16 = Statics.field1789.length;
                    }
                    int var17 = Statics.field1789[var16 - 1];
                    arg2.field3877[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("if.h(Lln;Lln;Llw;I)V")
    public void method4009(class325 arg0, class325 arg1, class319 arg2) {
        if (arg2.field3840 == 0 || arg2.field3838 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3841 == 0) {
            var4 = arg0.field3869 - arg2.field3840;
        }
        if (arg2.field3839 == 0) {
            var5 = arg0.field3872 - arg2.field3838;
        }
        int var6 = arg0.field3869 * var5 + var4;
        int var7 = arg2.field3839 * arg1.field3869 + arg2.field3841;
        for (int var8 = 0; var8 < arg2.field3838; var8++) {
            for (int var9 = 0; var9 < arg2.field3840; var9++) {
                int var10001 = var7++;
                arg1.field3877[var10001] += arg0.field3877[var6++];
            }
            var6 += arg0.field3869 - arg2.field3840;
            var7 += arg1.field3869 - arg2.field3840;
        }
    }
}
