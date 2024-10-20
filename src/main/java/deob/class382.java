package deob;

import java.util.HashMap;

@ObfuscatedName("os")
public class class382 {

    @ObfuscatedName("os.at")
    public final HashMap field4390 = new HashMap();

    @ObfuscatedName("os.ah")
    public class458 field4385 = new class458(0, 0);

    @ObfuscatedName("os.ar")
    public int[] field4386 = new int[2048];

    @ObfuscatedName("os.ao")
    public int[] field4387 = new int[2048];

    @ObfuscatedName("os.ab")
    public int field4389 = 0;

    public class382() {
        method3170();
    }

    @ObfuscatedName("gp.at(B)V")
    public static void method3170() {
        Statics.field997 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class242.method2212((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field997[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field997.length) {
            int var6 = var0 * 2;
            int var7 = class242.method2212((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field997.length) {
                Statics.field997[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("os.ah(II)V")
    public void method6479(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class459.method6506(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class541 var11 = new class541(var6, var2, var2);
        this.field4390.put(arg0, var11);
    }

    @ObfuscatedName("os.ar(II)Luz;")
    public class541 method6497(int arg0) {
        if (!this.field4390.containsKey(arg0)) {
            this.method6479(arg0);
        }
        return (class541) this.field4390.get(arg0);
    }

    @ObfuscatedName("os.ao(III)V")
    public final void method6481(int arg0, int arg1) {
        if (this.field4389 < this.field4386.length) {
            this.field4386[this.field4389] = arg0;
            this.field4387[this.field4389] = arg1;
            this.field4389++;
        }
    }

    @ObfuscatedName("os.ab(S)V")
    public final void method6485() {
        this.field4389 = 0;
    }

    @ObfuscatedName("os.au(IILuz;FB)V")
    public final void method6482(int arg0, int arg1, class541 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class541 var6 = this.method6497(var5);
        int var7 = var5 * 2 + 1;
        class458 var8 = new class458(0, 0, arg2.field5236, arg2.field5239);
        class458 var9 = new class458(0, 0);
        this.field4385.method7601(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4389; var10++) {
            int var11 = this.field4386[var10];
            int var12 = this.field4387[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5239 - (float) (var12 - arg1) * arg3) - var5;
            this.field4385.method7600(var13, var14);
            this.field4385.method7604(var8, var9);
            this.method6483(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5244.length; var15++) {
            if (arg2.field5244[var15] == 0) {
                arg2.field5244[var15] = -16777216;
            } else {
                int var16 = (arg2.field5244[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5244[var15] = -16777216;
                } else {
                    if (var16 > Statics.field997.length) {
                        var16 = Statics.field997.length;
                    }
                    int var17 = Statics.field997[var16 - 1];
                    arg2.field5244[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("os.aa(Luz;Luz;Lrv;I)V")
    public void method6483(class541 arg0, class541 arg1, class458 arg2) {
        if (arg2.field4755 == 0 || arg2.field4757 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4756 == 0) {
            var4 = arg0.field5236 - arg2.field4755;
        }
        if (arg2.field4753 == 0) {
            var5 = arg0.field5239 - arg2.field4757;
        }
        int var6 = arg0.field5236 * var5 + var4;
        int var7 = arg2.field4753 * arg1.field5236 + arg2.field4756;
        for (int var8 = 0; var8 < arg2.field4757; var8++) {
            for (int var9 = 0; var9 < arg2.field4755; var9++) {
                int var10001 = var7++;
                arg1.field5244[var10001] += arg0.field5244[var6++];
            }
            var6 += arg0.field5236 - arg2.field4755;
            var7 += arg1.field5236 - arg2.field4755;
        }
    }
}
