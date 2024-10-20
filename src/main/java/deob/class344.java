package deob;

import java.util.HashMap;

@ObfuscatedName("ms")
public class class344 {

    @ObfuscatedName("ms.h")
    public final HashMap field4286 = new HashMap();

    @ObfuscatedName("ms.e")
    public class407 field4280 = new class407(0, 0);

    @ObfuscatedName("ms.v")
    public int[] field4281 = new int[2048];

    @ObfuscatedName("ms.x")
    public int[] field4282 = new int[2048];

    @ObfuscatedName("ms.m")
    public int field4283 = 0;

    public class344() {
        method3394();
    }

    @ObfuscatedName("gq.h(I)V")
    public static void method3394() {
        Statics.field2123 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class243.method3741((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field2123[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field2123.length) {
            int var6 = var0 * 2;
            int var7 = class243.method3741((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field2123.length) {
                Statics.field2123[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("ms.e(IB)V")
    public void method6026(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            var6[var8] = class408.method5770((double) var7, 0.0D, var3);
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
        class481 var18 = new class481(var13, var2, var2);
        this.field4286.put(arg0, var18);
    }

    @ObfuscatedName("ms.v(II)Lrx;")
    public class481 method6027(int arg0) {
        if (!this.field4286.containsKey(arg0)) {
            this.method6026(arg0);
        }
        return (class481) this.field4286.get(arg0);
    }

    @ObfuscatedName("ms.x(III)V")
    public final void method6028(int arg0, int arg1) {
        if (this.field4283 < this.field4281.length) {
            this.field4281[this.field4283] = arg0;
            this.field4282[this.field4283] = arg1;
            this.field4283++;
        }
    }

    @ObfuscatedName("ms.m(I)V")
    public final void method6039() {
        this.field4283 = 0;
    }

    @ObfuscatedName("ms.q(IILrx;FI)V")
    public final void method6044(int arg0, int arg1, class481 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class481 var6 = this.method6027(var5);
        int var7 = var5 * 2 + 1;
        class407 var8 = new class407(0, 0, arg2.field5011, arg2.field5010);
        class407 var9 = new class407(0, 0);
        this.field4280.method7020(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4283; var10++) {
            int var11 = this.field4281[var10];
            int var12 = this.field4282[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5010 - (float) (var12 - arg1) * arg3) - var5;
            this.field4280.method7021(var13, var14);
            this.field4280.method7034(var8, var9);
            this.method6031(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5021.length; var15++) {
            if (arg2.field5021[var15] == 0) {
                arg2.field5021[var15] = -16777216;
            } else {
                int var16 = (arg2.field5021[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5021[var15] = -16777216;
                } else {
                    if (var16 > Statics.field2123.length) {
                        var16 = Statics.field2123.length;
                    }
                    int var17 = Statics.field2123[var16 - 1];
                    arg2.field5021[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ms.f(Lrx;Lrx;Lok;I)V")
    public void method6031(class481 arg0, class481 arg1, class407 arg2) {
        if (arg2.field4597 == 0 || arg2.field4594 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4596 == 0) {
            var4 = arg0.field5011 - arg2.field4597;
        }
        if (arg2.field4595 == 0) {
            var5 = arg0.field5010 - arg2.field4594;
        }
        int var6 = arg0.field5011 * var5 + var4;
        int var7 = arg2.field4595 * arg1.field5011 + arg2.field4596;
        for (int var8 = 0; var8 < arg2.field4594; var8++) {
            for (int var9 = 0; var9 < arg2.field4597; var9++) {
                int var10001 = var7++;
                arg1.field5021[var10001] += arg0.field5021[var6++];
            }
            var6 += arg0.field5011 - arg2.field4597;
            var7 += arg1.field5011 - arg2.field4597;
        }
    }
}
