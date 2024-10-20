package deob;

import java.util.HashMap;

@ObfuscatedName("jh")
public class class266 {

    @ObfuscatedName("jh.o")
    public final HashMap field3439 = new HashMap();

    @ObfuscatedName("jh.k")
    public class324 field3438 = new class324(0, 0);

    @ObfuscatedName("jh.t")
    public int[] field3435 = new int[2048];

    @ObfuscatedName("jh.d")
    public int[] field3434 = new int[2048];

    @ObfuscatedName("jh.h")
    public int field3437 = 0;

    public class266() {
        method3176();
    }

    @ObfuscatedName("gr.o(I)V")
    public static void method3176() {
        Statics.field1450 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class22.method236((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field1450[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field1450.length) {
            int var6 = var0 * 2;
            int var7 = class22.method236((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field1450.length) {
                Statics.field1450[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("jh.k(II)V")
    public void method4301(int arg0) {
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
        class332 var26 = new class332(var21, var2, var2);
        this.field3439.put(arg0, var26);
    }

    @ObfuscatedName("jh.t(IB)Lld;")
    public class332 method4302(int arg0) {
        if (!this.field3439.containsKey(arg0)) {
            this.method4301(arg0);
        }
        return (class332) this.field3439.get(arg0);
    }

    @ObfuscatedName("jh.d(III)V")
    public final void method4319(int arg0, int arg1) {
        if (this.field3437 < this.field3435.length) {
            this.field3435[this.field3437] = arg0;
            this.field3434[this.field3437] = arg1;
            this.field3437++;
        }
    }

    @ObfuscatedName("jh.h(B)V")
    public final void method4304() {
        this.field3437 = 0;
    }

    @ObfuscatedName("jh.m(IILld;FI)V")
    public final void method4305(int arg0, int arg1, class332 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class332 var6 = this.method4302(var5);
        int var7 = var5 * 2 + 1;
        class324 var8 = new class324(0, 0, arg2.field3983, arg2.field3988);
        class324 var9 = new class324(0, 0);
        this.field3438.method5249(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3437; var10++) {
            int var11 = this.field3435[var10];
            int var12 = this.field3434[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3988 - (float) (var12 - arg1) * arg3) - var5;
            this.field3438.method5248(var13, var14);
            this.field3438.method5253(var8, var9);
            this.method4306(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3984.length; var15++) {
            if (arg2.field3984[var15] == 0) {
                arg2.field3984[var15] = -16777216;
            } else {
                int var16 = (arg2.field3984[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3984[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1450.length) {
                        var16 = Statics.field1450.length;
                    }
                    int var17 = Statics.field1450[var16 - 1];
                    arg2.field3984[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("jh.z(Lld;Lld;Llx;I)V")
    public void method4306(class332 arg0, class332 arg1, class324 arg2) {
        if (arg2.field3943 == 0 || arg2.field3945 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3944 == 0) {
            var4 = arg0.field3983 - arg2.field3943;
        }
        if (arg2.field3942 == 0) {
            var5 = arg0.field3988 - arg2.field3945;
        }
        int var6 = arg0.field3983 * var5 + var4;
        int var7 = arg2.field3942 * arg1.field3983 + arg2.field3944;
        for (int var8 = 0; var8 < arg2.field3945; var8++) {
            for (int var9 = 0; var9 < arg2.field3943; var9++) {
                int var10001 = var7++;
                arg1.field3984[var10001] += arg0.field3984[var6++];
            }
            var6 += arg0.field3983 - arg2.field3943;
            var7 += arg1.field3983 - arg2.field3943;
        }
    }
}
