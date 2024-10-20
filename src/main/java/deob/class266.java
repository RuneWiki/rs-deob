package deob;

import java.util.HashMap;

@ObfuscatedName("jd")
public class class266 {

    @ObfuscatedName("jd.g")
    public final HashMap field3426 = new HashMap();

    @ObfuscatedName("jd.e")
    public class324 field3427 = new class324(0, 0);

    @ObfuscatedName("jd.b")
    public int[] field3428 = new int[2048];

    @ObfuscatedName("jd.z")
    public int[] field3429 = new int[2048];

    @ObfuscatedName("jd.n")
    public int field3430 = 0;

    public class266() {
        Statics.field2515 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class22.method72((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field2515[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field2515.length) {
            int var7 = var1 * 2;
            int var8 = class22.method72((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field2515.length) {
                Statics.field2515[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("jd.g(II)V")
    public void method4426(int arg0) {
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
        this.field3426.put(arg0, var26);
    }

    @ObfuscatedName("jd.e(II)Llv;")
    public class332 method4424(int arg0) {
        if (!this.field3426.containsKey(arg0)) {
            this.method4426(arg0);
        }
        return (class332) this.field3426.get(arg0);
    }

    @ObfuscatedName("jd.b(III)V")
    public final void method4425(int arg0, int arg1) {
        if (this.field3430 < this.field3428.length) {
            this.field3428[this.field3430] = arg0;
            this.field3429[this.field3430] = arg1;
            this.field3430++;
        }
    }

    @ObfuscatedName("jd.z(I)V")
    public final void method4433() {
        this.field3430 = 0;
    }

    @ObfuscatedName("jd.n(IILlv;FB)V")
    public final void method4436(int arg0, int arg1, class332 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class332 var6 = this.method4424(var5);
        int var7 = var5 * 2 + 1;
        class324 var8 = new class324(0, 0, arg2.field3991, arg2.field3988);
        class324 var9 = new class324(0, 0);
        this.field3427.method5318(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3430; var10++) {
            int var11 = this.field3428[var10];
            int var12 = this.field3429[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3988 - (float) (var12 - arg1) * arg3) - var5;
            this.field3427.method5322(var13, var14);
            this.field3427.method5319(var8, var9);
            this.method4427(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3986.length; var15++) {
            if (arg2.field3986[var15] == 0) {
                arg2.field3986[var15] = -16777216;
            } else {
                int var16 = (arg2.field3986[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3986[var15] = -16777216;
                } else {
                    if (var16 > Statics.field2515.length) {
                        var16 = Statics.field2515.length;
                    }
                    int var17 = Statics.field2515[var16 - 1];
                    arg2.field3986[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("jd.l(Llv;Llv;Lls;S)V")
    public void method4427(class332 arg0, class332 arg1, class324 arg2) {
        if (arg2.field3947 == 0 || arg2.field3945 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3948 == 0) {
            var4 = arg0.field3991 - arg2.field3947;
        }
        if (arg2.field3946 == 0) {
            var5 = arg0.field3988 - arg2.field3945;
        }
        int var6 = arg0.field3991 * var5 + var4;
        int var7 = arg2.field3946 * arg1.field3991 + arg2.field3948;
        for (int var8 = 0; var8 < arg2.field3945; var8++) {
            for (int var9 = 0; var9 < arg2.field3947; var9++) {
                int var10001 = var7++;
                arg1.field3986[var10001] += arg0.field3986[var6++];
            }
            var6 += arg0.field3991 - arg2.field3947;
            var7 += arg1.field3991 - arg2.field3947;
        }
    }
}
