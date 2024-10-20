package deob;

import java.util.HashMap;

@ObfuscatedName("lf")
public class class327 {

    @ObfuscatedName("lf.v")
    public final HashMap field4037 = new HashMap();

    @ObfuscatedName("lf.c")
    public class384 field4036 = new class384(0, 0);

    @ObfuscatedName("lf.i")
    public int[] field4035 = new int[2048];

    @ObfuscatedName("lf.f")
    public int[] field4038 = new int[2048];

    @ObfuscatedName("lf.b")
    public int field4039 = 0;

    public class327() {
        method3614();
    }

    @ObfuscatedName("ga.v(B)V")
    public static void method3614() {
        Statics.field4042 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class206.method3008((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field4042[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field4042.length) {
            int var6 = var0 * 2;
            int var7 = class206.method3008((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field4042.length) {
                Statics.field4042[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("lf.c(II)V")
    public void method5465(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            var6[var8] = class385.method3965((double) var7, 0.0D, var3);
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
        class451 var18 = new class451(var13, var2, var2);
        this.field4037.put(arg0, var18);
    }

    @ObfuscatedName("lf.i(IS)Lqi;")
    public class451 method5466(int arg0) {
        if (!this.field4037.containsKey(arg0)) {
            this.method5465(arg0);
        }
        return (class451) this.field4037.get(arg0);
    }

    @ObfuscatedName("lf.f(IIB)V")
    public final void method5467(int arg0, int arg1) {
        if (this.field4039 < this.field4035.length) {
            this.field4035[this.field4039] = arg0;
            this.field4038[this.field4039] = arg1;
            this.field4039++;
        }
    }

    @ObfuscatedName("lf.b(I)V")
    public final void method5480() {
        this.field4039 = 0;
    }

    @ObfuscatedName("lf.n(IILqi;FI)V")
    public final void method5468(int arg0, int arg1, class451 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class451 var6 = this.method5466(var5);
        int var7 = var5 * 2 + 1;
        class384 var8 = new class384(0, 0, arg2.field4719, arg2.field4710);
        class384 var9 = new class384(0, 0);
        this.field4036.method6296(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4039; var10++) {
            int var11 = this.field4035[var10];
            int var12 = this.field4038[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4710 - (float) (var12 - arg1) * arg3) - var5;
            this.field4036.method6281(var13, var14);
            this.field4036.method6284(var8, var9);
            this.method5469(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4717.length; var15++) {
            if (arg2.field4717[var15] == 0) {
                arg2.field4717[var15] = -16777216;
            } else {
                int var16 = (arg2.field4717[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4717[var15] = -16777216;
                } else {
                    if (var16 > Statics.field4042.length) {
                        var16 = Statics.field4042.length;
                    }
                    int var17 = Statics.field4042[var16 - 1];
                    arg2.field4717[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("lf.s(Lqi;Lqi;Lnm;I)V")
    public void method5469(class451 arg0, class451 arg1, class384 arg2) {
        if (arg2.field4329 == 0 || arg2.field4327 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4330 == 0) {
            var4 = arg0.field4719 - arg2.field4329;
        }
        if (arg2.field4328 == 0) {
            var5 = arg0.field4710 - arg2.field4327;
        }
        int var6 = arg0.field4719 * var5 + var4;
        int var7 = arg2.field4328 * arg1.field4719 + arg2.field4330;
        for (int var8 = 0; var8 < arg2.field4327; var8++) {
            for (int var9 = 0; var9 < arg2.field4329; var9++) {
                int var10001 = var7++;
                arg1.field4717[var10001] += arg0.field4717[var6++];
            }
            var6 += arg0.field4719 - arg2.field4329;
            var7 += arg1.field4719 - arg2.field4329;
        }
    }
}
