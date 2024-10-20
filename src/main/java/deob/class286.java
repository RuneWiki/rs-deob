package deob;

import java.util.HashMap;

@ObfuscatedName("je")
public class class286 {

    @ObfuscatedName("je.v")
    public final HashMap field3664 = new HashMap();

    @ObfuscatedName("je.n")
    public class337 field3663 = new class337(0, 0);

    @ObfuscatedName("je.f")
    public int[] field3665 = new int[2048];

    @ObfuscatedName("je.y")
    public int[] field3666 = new int[2048];

    @ObfuscatedName("je.p")
    public int field3667 = 0;

    public class286() {
        Statics.field2113 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class171.method3192((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field2113[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field2113.length) {
            int var7 = var1 * 2;
            int var8 = class171.method3192((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field2113.length) {
                Statics.field2113[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("je.v(II)V")
    public void method4657(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            var6[var8] = class338.method145((double) var7, 0.0D, var3);
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
        class396 var18 = new class396(var13, var2, var2);
        this.field3664.put(arg0, var18);
    }

    @ObfuscatedName("je.n(II)Loh;")
    public class396 method4659(int arg0) {
        if (!this.field3664.containsKey(arg0)) {
            this.method4657(arg0);
        }
        return (class396) this.field3664.get(arg0);
    }

    @ObfuscatedName("je.f(IIB)V")
    public final void method4661(int arg0, int arg1) {
        if (this.field3667 < this.field3665.length) {
            this.field3665[this.field3667] = arg0;
            this.field3666[this.field3667] = arg1;
            this.field3667++;
        }
    }

    @ObfuscatedName("je.y(I)V")
    public final void method4670() {
        this.field3667 = 0;
    }

    @ObfuscatedName("je.p(IILoh;FI)V")
    public final void method4660(int arg0, int arg1, class396 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class396 var6 = this.method4659(var5);
        int var7 = var5 * 2 + 1;
        class337 var8 = new class337(0, 0, arg2.field4253, arg2.field4245);
        class337 var9 = new class337(0, 0);
        this.field3663.method5421(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3667; var10++) {
            int var11 = this.field3665[var10];
            int var12 = this.field3666[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4245 - (float) (var12 - arg1) * arg3) - var5;
            this.field3663.method5420(var13, var14);
            this.field3663.method5419(var8, var9);
            this.method4662(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4247.length; var15++) {
            if (arg2.field4247[var15] == 0) {
                arg2.field4247[var15] = -16777216;
            } else {
                int var16 = (arg2.field4247[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4247[var15] = -16777216;
                } else {
                    if (var16 > Statics.field2113.length) {
                        var16 = Statics.field2113.length;
                    }
                    int var17 = Statics.field2113[var16 - 1];
                    arg2.field4247[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("je.j(Loh;Loh;Lli;I)V")
    public void method4662(class396 arg0, class396 arg1, class337 arg2) {
        if (arg2.field3911 == 0 || arg2.field3912 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3910 == 0) {
            var4 = arg0.field4253 - arg2.field3911;
        }
        if (arg2.field3909 == 0) {
            var5 = arg0.field4245 - arg2.field3912;
        }
        int var6 = arg0.field4253 * var5 + var4;
        int var7 = arg2.field3909 * arg1.field4253 + arg2.field3910;
        for (int var8 = 0; var8 < arg2.field3912; var8++) {
            for (int var9 = 0; var9 < arg2.field3911; var9++) {
                int var10001 = var7++;
                arg1.field4247[var10001] += arg0.field4247[var6++];
            }
            var6 += arg0.field4253 - arg2.field3911;
            var7 += arg1.field4253 - arg2.field3911;
        }
    }
}
