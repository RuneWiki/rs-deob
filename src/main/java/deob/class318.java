package deob;

import java.util.HashMap;

@ObfuscatedName("lk")
public class class318 {

    @ObfuscatedName("lk.c")
    public final HashMap field3970 = new HashMap();

    @ObfuscatedName("lk.l")
    public class368 field3967 = new class368(0, 0);

    @ObfuscatedName("lk.s")
    public int[] field3969 = new int[2048];

    @ObfuscatedName("lk.e")
    public int[] field3971 = new int[2048];

    @ObfuscatedName("lk.r")
    public int field3968 = 0;

    public class318() {
        method4291();
    }

    @ObfuscatedName("hn.c(I)V")
    public static void method4291() {
        Statics.field1885 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class223.method97((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field1885[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field1885.length) {
            int var6 = var0 * 2;
            int var7 = class223.method97((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field1885.length) {
                Statics.field1885[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("lk.l(II)V")
    public void method5204(int arg0) {
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
        class434 var26 = new class434(var21, var2, var2);
        this.field3970.put(arg0, var26);
    }

    @ObfuscatedName("lk.s(IB)Lpt;")
    public class434 method5223(int arg0) {
        if (!this.field3970.containsKey(arg0)) {
            this.method5204(arg0);
        }
        return (class434) this.field3970.get(arg0);
    }

    @ObfuscatedName("lk.e(III)V")
    public final void method5206(int arg0, int arg1) {
        if (this.field3968 < this.field3969.length) {
            this.field3969[this.field3968] = arg0;
            this.field3971[this.field3968] = arg1;
            this.field3968++;
        }
    }

    @ObfuscatedName("lk.r(S)V")
    public final void method5207() {
        this.field3968 = 0;
    }

    @ObfuscatedName("lk.o(IILpt;FI)V")
    public final void method5208(int arg0, int arg1, class434 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class434 var6 = this.method5223(var5);
        int var7 = var5 * 2 + 1;
        class368 var8 = new class368(0, 0, arg2.field4602, arg2.field4603);
        class368 var9 = new class368(0, 0);
        this.field3967.method5941(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3968; var10++) {
            int var11 = this.field3969[var10];
            int var12 = this.field3971[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4603 - (float) (var12 - arg1) * arg3) - var5;
            this.field3967.method5937(var13, var14);
            this.field3967.method5940(var8, var9);
            this.method5209(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4606.length; var15++) {
            if (arg2.field4606[var15] == 0) {
                arg2.field4606[var15] = -16777216;
            } else {
                int var16 = (arg2.field4606[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4606[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1885.length) {
                        var16 = Statics.field1885.length;
                    }
                    int var17 = Statics.field1885[var16 - 1];
                    arg2.field4606[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("lk.i(Lpt;Lpt;Lna;B)V")
    public void method5209(class434 arg0, class434 arg1, class368 arg2) {
        if (arg2.field4223 == 0 || arg2.field4224 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4225 == 0) {
            var4 = arg0.field4602 - arg2.field4223;
        }
        if (arg2.field4222 == 0) {
            var5 = arg0.field4603 - arg2.field4224;
        }
        int var6 = arg0.field4602 * var5 + var4;
        int var7 = arg2.field4222 * arg1.field4602 + arg2.field4225;
        for (int var8 = 0; var8 < arg2.field4224; var8++) {
            for (int var9 = 0; var9 < arg2.field4223; var9++) {
                int var10001 = var7++;
                arg1.field4606[var10001] += arg0.field4606[var6++];
            }
            var6 += arg0.field4602 - arg2.field4223;
            var7 += arg1.field4602 - arg2.field4223;
        }
    }
}
