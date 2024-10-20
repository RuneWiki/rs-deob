package deob;

import java.util.HashMap;

@ObfuscatedName("po")
public class class403 {

    @ObfuscatedName("po.ap")
    public final HashMap field4681 = new HashMap();

    @ObfuscatedName("po.aw")
    public class424 field4678 = new class424(0, 0);

    @ObfuscatedName("po.ak")
    public int[] field4679 = new int[2048];

    @ObfuscatedName("po.aj")
    public int[] field4680 = new int[2048];

    @ObfuscatedName("po.ai")
    public int field4686 = 0;

    public class403() {
        Statics.field4684 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class290.method4238((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field4684[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field4684.length) {
            int var7 = var1 * 2;
            int var8 = class290.method4238((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field4684.length) {
                Statics.field4684[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("po.ap(IB)V")
    public void method7208(int arg0) {
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
        class572 var26 = new class572(var21, var2, var2);
        this.field4681.put(arg0, var26);
    }

    @ObfuscatedName("po.aw(II)Lvv;")
    public class572 method7188(int arg0) {
        if (!this.field4681.containsKey(arg0)) {
            this.method7208(arg0);
        }
        return (class572) this.field4681.get(arg0);
    }

    @ObfuscatedName("po.ak(IIB)V")
    public final void method7189(int arg0, int arg1) {
        if (this.field4686 < this.field4679.length) {
            this.field4679[this.field4686] = arg0;
            this.field4680[this.field4686] = arg1;
            this.field4686++;
        }
    }

    @ObfuscatedName("po.aj(B)V")
    public final void method7190() {
        this.field4686 = 0;
    }

    @ObfuscatedName("po.ai(IILvv;FB)V")
    public final void method7191(int arg0, int arg1, class572 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class572 var6 = this.method7188(var5);
        int var7 = var5 * 2 + 1;
        class424 var8 = new class424(0, 0, arg2.field5558, arg2.field5559);
        class424 var9 = new class424(0, 0);
        this.field4678.method7507(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4686; var10++) {
            int var11 = this.field4679[var10];
            int var12 = this.field4680[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5559 - (float) (var12 - arg1) * arg3) - var5;
            this.field4678.method7506(var13, var14);
            this.field4678.method7520(var8, var9);
            this.method7192(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5567.length; var15++) {
            if (arg2.field5567[var15] == 0) {
                arg2.field5567[var15] = -16777216;
            } else {
                int var16 = (arg2.field5567[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5567[var15] = -16777216;
                } else {
                    if (var16 > Statics.field4684.length) {
                        var16 = Statics.field4684.length;
                    }
                    int var17 = Statics.field4684[var16 - 1];
                    arg2.field5567[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("po.ay(Lvv;Lvv;Lqg;I)V")
    public void method7192(class572 arg0, class572 arg1, class424 arg2) {
        if (arg2.field4760 == 0 || arg2.field4761 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4758 == 0) {
            var4 = arg0.field5558 - arg2.field4760;
        }
        if (arg2.field4759 == 0) {
            var5 = arg0.field5559 - arg2.field4761;
        }
        int var6 = arg0.field5558 * var5 + var4;
        int var7 = arg2.field4759 * arg1.field5558 + arg2.field4758;
        for (int var8 = 0; var8 < arg2.field4761; var8++) {
            for (int var9 = 0; var9 < arg2.field4760; var9++) {
                int var10001 = var7++;
                arg1.field5567[var10001] += arg0.field5567[var6++];
            }
            var6 += arg0.field5558 - arg2.field4760;
            var7 += arg1.field5558 - arg2.field4760;
        }
    }
}
