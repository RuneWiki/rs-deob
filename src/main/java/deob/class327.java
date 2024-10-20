package deob;

import java.util.HashMap;

@ObfuscatedName("lh")
public class class327 {

    @ObfuscatedName("lh.o")
    public final HashMap field4101 = new HashMap();

    @ObfuscatedName("lh.q")
    public class385 field4102 = new class385(0, 0);

    @ObfuscatedName("lh.l")
    public int[] field4100 = new int[2048];

    @ObfuscatedName("lh.k")
    public int[] field4103 = new int[2048];

    @ObfuscatedName("lh.a")
    public int field4104 = 0;

    public class327() {
        method1969();
    }

    @ObfuscatedName("cr.o(I)V")
    public static void method1969() {
        Statics.field1073 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class231.method2644((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field1073[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field1073.length) {
            int var6 = var0 * 2;
            int var7 = class231.method2644((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field1073.length) {
                Statics.field1073[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("lh.q(II)V")
    public void method5367(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            double var11 = class386.method4442((double) (var7) / var3) / var3;
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
        class453 var22 = new class453(var17, var2, var2);
        this.field4101.put(arg0, var22);
    }

    @ObfuscatedName("lh.l(IB)Lqr;")
    public class453 method5384(int arg0) {
        if (!this.field4101.containsKey(arg0)) {
            this.method5367(arg0);
        }
        return (class453) this.field4101.get(arg0);
    }

    @ObfuscatedName("lh.k(III)V")
    public final void method5366(int arg0, int arg1) {
        if (this.field4104 < this.field4100.length) {
            this.field4100[this.field4104] = arg0;
            this.field4103[this.field4104] = arg1;
            this.field4104++;
        }
    }

    @ObfuscatedName("lh.a(I)V")
    public final void method5369() {
        this.field4104 = 0;
    }

    @ObfuscatedName("lh.m(IILqr;FB)V")
    public final void method5370(int arg0, int arg1, class453 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class453 var6 = this.method5384(var5);
        int var7 = var5 * 2 + 1;
        class385 var8 = new class385(0, 0, arg2.field4768, arg2.field4770);
        class385 var9 = new class385(0, 0);
        this.field4102.method6189(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4104; var10++) {
            int var11 = this.field4100[var10];
            int var12 = this.field4103[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4770 - (float) (var12 - arg1) * arg3) - var5;
            this.field4102.method6175(var13, var14);
            this.field4102.method6185(var8, var9);
            this.method5371(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4767.length; var15++) {
            if (arg2.field4767[var15] == 0) {
                arg2.field4767[var15] = -16777216;
            } else {
                int var16 = (arg2.field4767[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4767[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1073.length) {
                        var16 = Statics.field1073.length;
                    }
                    int var17 = Statics.field1073[var16 - 1];
                    arg2.field4767[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("lh.p(Lqr;Lqr;Lne;B)V")
    public void method5371(class453 arg0, class453 arg1, class385 arg2) {
        if (arg2.field4387 == 0 || arg2.field4388 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4385 == 0) {
            var4 = arg0.field4768 - arg2.field4387;
        }
        if (arg2.field4386 == 0) {
            var5 = arg0.field4770 - arg2.field4388;
        }
        int var6 = arg0.field4768 * var5 + var4;
        int var7 = arg2.field4386 * arg1.field4768 + arg2.field4385;
        for (int var8 = 0; var8 < arg2.field4388; var8++) {
            for (int var9 = 0; var9 < arg2.field4387; var9++) {
                int var10001 = var7++;
                arg1.field4767[var10001] += arg0.field4767[var6++];
            }
            var6 += arg0.field4768 - arg2.field4387;
            var7 += arg1.field4768 - arg2.field4387;
        }
    }
}
