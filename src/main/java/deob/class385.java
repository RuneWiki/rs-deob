package deob;

import java.util.HashMap;

@ObfuscatedName("ow")
public class class385 {

    @ObfuscatedName("ow.ac")
    public final HashMap field4417 = new HashMap();

    @ObfuscatedName("ow.al")
    public class461 field4413 = new class461(0, 0);

    @ObfuscatedName("ow.ak")
    public int[] field4408 = new int[2048];

    @ObfuscatedName("ow.ax")
    public int[] field4411 = new int[2048];

    @ObfuscatedName("ow.ao")
    public int field4412 = 0;

    public class385() {
        Statics.field4409 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class276.method8690((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field4409[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field4409.length) {
            int var7 = var1 * 2;
            int var8 = class276.method8690((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field4409.length) {
                Statics.field4409[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("ow.ac(II)V")
    public void method6469(int arg0) {
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
        class544 var26 = new class544(var21, var2, var2);
        this.field4417.put(arg0, var26);
    }

    @ObfuscatedName("ow.al(II)Lud;")
    public class544 method6487(int arg0) {
        if (!this.field4417.containsKey(arg0)) {
            this.method6469(arg0);
        }
        return (class544) this.field4417.get(arg0);
    }

    @ObfuscatedName("ow.ak(III)V")
    public final void method6471(int arg0, int arg1) {
        if (this.field4412 < this.field4408.length) {
            this.field4408[this.field4412] = arg0;
            this.field4411[this.field4412] = arg1;
            this.field4412++;
        }
    }

    @ObfuscatedName("ow.ax(I)V")
    public final void method6472() {
        this.field4412 = 0;
    }

    @ObfuscatedName("ow.ao(IILud;FI)V")
    public final void method6473(int arg0, int arg1, class544 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class544 var6 = this.method6487(var5);
        int var7 = var5 * 2 + 1;
        class461 var8 = new class461(0, 0, arg2.field5237, arg2.field5239);
        class461 var9 = new class461(0, 0);
        this.field4413.method7519(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4412; var10++) {
            int var11 = this.field4408[var10];
            int var12 = this.field4411[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5239 - (float) (var12 - arg1) * arg3) - var5;
            this.field4413.method7518(var13, var14);
            this.field4413.method7552(var8, var9);
            this.method6478(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5235.length; var15++) {
            if (arg2.field5235[var15] == 0) {
                arg2.field5235[var15] = -16777216;
            } else {
                int var16 = (arg2.field5235[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5235[var15] = -16777216;
                } else {
                    if (var16 > Statics.field4409.length) {
                        var16 = Statics.field4409.length;
                    }
                    int var17 = Statics.field4409[var16 - 1];
                    arg2.field5235[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ow.ah(Lud;Lud;Lrx;I)V")
    public void method6478(class544 arg0, class544 arg1, class461 arg2) {
        if (arg2.field4763 == 0 || arg2.field4765 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4764 == 0) {
            var4 = arg0.field5237 - arg2.field4763;
        }
        if (arg2.field4766 == 0) {
            var5 = arg0.field5239 - arg2.field4765;
        }
        int var6 = arg0.field5237 * var5 + var4;
        int var7 = arg2.field4766 * arg1.field5237 + arg2.field4764;
        for (int var8 = 0; var8 < arg2.field4765; var8++) {
            for (int var9 = 0; var9 < arg2.field4763; var9++) {
                int var10001 = var7++;
                arg1.field5235[var10001] += arg0.field5235[var6++];
            }
            var6 += arg0.field5237 - arg2.field4763;
            var7 += arg1.field5237 - arg2.field4763;
        }
    }
}
