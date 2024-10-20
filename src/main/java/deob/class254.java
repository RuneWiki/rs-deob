package deob;

import java.util.HashMap;

@ObfuscatedName("iv")
public class class254 {

    @ObfuscatedName("iv.v")
    public final HashMap field3244 = new HashMap();

    @ObfuscatedName("iv.s")
    public class314 field3247 = new class314(0, 0);

    @ObfuscatedName("iv.o")
    public int[] field3245 = new int[2048];

    @ObfuscatedName("iv.k")
    public int[] field3246 = new int[2048];

    @ObfuscatedName("iv.u")
    public int field3243 = 0;

    public class254() {
        method4007();
    }

    @ObfuscatedName("hz.v(B)V")
    public static void method4007() {
        Statics.field1936 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class10.method2908((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field1936[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field1936.length) {
            int var6 = var0 * 2;
            int var7 = class10.method2908((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field1936.length) {
                Statics.field1936[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("iv.s(II)V")
    public void method4433(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class315.method108(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class322 var11 = new class322(var6, var2, var2);
        this.field3244.put(arg0, var11);
    }

    @ObfuscatedName("iv.o(IB)Llh;")
    public class322 method4423(int arg0) {
        if (!this.field3244.containsKey(arg0)) {
            this.method4433(arg0);
        }
        return (class322) this.field3244.get(arg0);
    }

    @ObfuscatedName("iv.k(IIB)V")
    public final void method4424(int arg0, int arg1) {
        if (this.field3243 < this.field3245.length) {
            this.field3245[this.field3243] = arg0;
            this.field3246[this.field3243] = arg1;
            this.field3243++;
        }
    }

    @ObfuscatedName("iv.u(B)V")
    public final void method4425() {
        this.field3243 = 0;
    }

    @ObfuscatedName("iv.i(IILlh;FI)V")
    public final void method4443(int arg0, int arg1, class322 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class322 var6 = this.method4423(var5);
        int var7 = var5 * 2 + 1;
        class314 var8 = new class314(0, 0, arg2.field3823, arg2.field3825);
        class314 var9 = new class314(0, 0);
        this.field3247.method5329(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3243; var10++) {
            int var11 = this.field3245[var10];
            int var12 = this.field3246[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3825 - (float) (var12 - arg1) * arg3) - var5;
            this.field3247.method5336(var13, var14);
            this.field3247.method5325(var8, var9);
            this.method4429(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3826.length; var15++) {
            if (arg2.field3826[var15] == 0) {
                arg2.field3826[var15] = -16777216;
            } else {
                int var16 = (arg2.field3826[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3826[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1936.length) {
                        var16 = Statics.field1936.length;
                    }
                    int var17 = Statics.field1936[var16 - 1];
                    arg2.field3826[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("iv.t(Llh;Llh;Llw;B)V")
    public void method4429(class322 arg0, class322 arg1, class314 arg2) {
        if (arg2.field3783 == 0 || arg2.field3784 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3781 == 0) {
            var4 = arg0.field3823 - arg2.field3783;
        }
        if (arg2.field3782 == 0) {
            var5 = arg0.field3825 - arg2.field3784;
        }
        int var6 = arg0.field3823 * var5 + var4;
        int var7 = arg2.field3782 * arg1.field3823 + arg2.field3781;
        for (int var8 = 0; var8 < arg2.field3784; var8++) {
            for (int var9 = 0; var9 < arg2.field3783; var9++) {
                int var10001 = var7++;
                arg1.field3826[var10001] += arg0.field3826[var6++];
            }
            var6 += arg0.field3823 - arg2.field3783;
            var7 += arg1.field3823 - arg2.field3783;
        }
    }
}
