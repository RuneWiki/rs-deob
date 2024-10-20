package deob;

import java.util.HashMap;

@ObfuscatedName("lw")
public class class313 {

    @ObfuscatedName("lw.c")
    public final HashMap field3915 = new HashMap();

    @ObfuscatedName("lw.b")
    public class363 field3909 = new class363(0, 0);

    @ObfuscatedName("lw.p")
    public int[] field3910 = new int[2048];

    @ObfuscatedName("lw.m")
    public int[] field3911 = new int[2048];

    @ObfuscatedName("lw.t")
    public int field3912 = 0;

    public class313() {
        Statics.field1349 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class223.method5686((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field1349[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field1349.length) {
            int var7 = var1 * 2;
            int var8 = class223.method5686((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field1349.length) {
                Statics.field1349[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("lw.c(IB)V")
    public void method5255(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            double var11 = class364.method400((double) (var7) / var3) / var3;
            var6[var8] = var11;
            var7++;
            var8++;
        }
        double[] var14 = var6;
        double var15 = var6[arg0] * var6[arg0];
        int[] var17 = new int[var2 * var2];
        boolean var18 = false;
        for (int var19 = 0; var19 < var2; var19++) {
            for (int var20 = 0; var20 < var2; var20++) {
                int var21 = var17[var2 * var19 + var20] = (int) (var14[var19] * var14[var20] / var15 * 256.0D);
                if (!var18 && var21 > 0) {
                    var18 = true;
                }
            }
        }
        class432 var22 = new class432(var17, var2, var2);
        this.field3915.put(arg0, var22);
    }

    @ObfuscatedName("lw.b(II)Lpl;")
    public class432 method5249(int arg0) {
        if (!this.field3915.containsKey(arg0)) {
            this.method5255(arg0);
        }
        return (class432) this.field3915.get(arg0);
    }

    @ObfuscatedName("lw.p(IIB)V")
    public final void method5258(int arg0, int arg1) {
        if (this.field3912 < this.field3910.length) {
            this.field3910[this.field3912] = arg0;
            this.field3911[this.field3912] = arg1;
            this.field3912++;
        }
    }

    @ObfuscatedName("lw.m(B)V")
    public final void method5247() {
        this.field3912 = 0;
    }

    @ObfuscatedName("lw.t(IILpl;FB)V")
    public final void method5252(int arg0, int arg1, class432 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class432 var6 = this.method5249(var5);
        int var7 = var5 * 2 + 1;
        class363 var8 = new class363(0, 0, arg2.field4566, arg2.field4567);
        class363 var9 = new class363(0, 0);
        this.field3909.method5933(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3912; var10++) {
            int var11 = this.field3910[var10];
            int var12 = this.field3911[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4567 - (float) (var12 - arg1) * arg3) - var5;
            this.field3909.method5948(var13, var14);
            this.field3909.method5935(var8, var9);
            this.method5253(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4571.length; var15++) {
            if (arg2.field4571[var15] == 0) {
                arg2.field4571[var15] = -16777216;
            } else {
                int var16 = (arg2.field4571[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4571[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1349.length) {
                        var16 = Statics.field1349.length;
                    }
                    int var17 = Statics.field1349[var16 - 1];
                    arg2.field4571[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("lw.s(Lpl;Lpl;Lme;I)V")
    public void method5253(class432 arg0, class432 arg1, class363 arg2) {
        if (arg2.field4177 == 0 || arg2.field4175 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4178 == 0) {
            var4 = arg0.field4566 - arg2.field4177;
        }
        if (arg2.field4176 == 0) {
            var5 = arg0.field4567 - arg2.field4175;
        }
        int var6 = arg0.field4566 * var5 + var4;
        int var7 = arg2.field4176 * arg1.field4566 + arg2.field4178;
        for (int var8 = 0; var8 < arg2.field4175; var8++) {
            for (int var9 = 0; var9 < arg2.field4177; var9++) {
                int var10001 = var7++;
                arg1.field4571[var10001] += arg0.field4571[var6++];
            }
            var6 += arg0.field4566 - arg2.field4177;
            var7 += arg1.field4566 - arg2.field4177;
        }
    }
}
