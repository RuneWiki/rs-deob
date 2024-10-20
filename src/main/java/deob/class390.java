package deob;

import java.util.HashMap;

@ObfuscatedName("ol")
public class class390 {

    @ObfuscatedName("ol.az")
    public final HashMap field4496 = new HashMap();

    @ObfuscatedName("ol.ah")
    public class466 field4498 = new class466(0, 0);

    @ObfuscatedName("ol.af")
    public int[] field4497 = new int[2048];

    @ObfuscatedName("ol.at")
    public int[] field4502 = new int[2048];

    @ObfuscatedName("ol.an")
    public int field4499 = 0;

    public class390() {
        Statics.field4495 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class278.method5714((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field4495[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field4495.length) {
            int var7 = var1 * 2;
            int var8 = class278.method5714((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field4495.length) {
                Statics.field4495[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("ol.az(II)V")
    public void method6537(int arg0) {
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
        class549 var26 = new class549(var21, var2, var2);
        this.field4496.put(arg0, var26);
    }

    @ObfuscatedName("ol.ah(IS)Lvg;")
    public class549 method6527(int arg0) {
        if (!this.field4496.containsKey(arg0)) {
            this.method6537(arg0);
        }
        return (class549) this.field4496.get(arg0);
    }

    @ObfuscatedName("ol.af(III)V")
    public final void method6531(int arg0, int arg1) {
        if (this.field4499 < this.field4497.length) {
            this.field4497[this.field4499] = arg0;
            this.field4502[this.field4499] = arg1;
            this.field4499++;
        }
    }

    @ObfuscatedName("ol.at(I)V")
    public final void method6529() {
        this.field4499 = 0;
    }

    @ObfuscatedName("ol.an(IILvg;FB)V")
    public final void method6530(int arg0, int arg1, class549 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class549 var6 = this.method6527(var5);
        int var7 = var5 * 2 + 1;
        class466 var8 = new class466(0, 0, arg2.field5330, arg2.field5331);
        class466 var9 = new class466(0, 0);
        this.field4498.method7621(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4499; var10++) {
            int var11 = this.field4497[var10];
            int var12 = this.field4502[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5331 - (float) (var12 - arg1) * arg3) - var5;
            this.field4498.method7624(var13, var14);
            this.field4498.method7634(var8, var9);
            this.method6525(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5336.length; var15++) {
            if (arg2.field5336[var15] == 0) {
                arg2.field5336[var15] = -16777216;
            } else {
                int var16 = (arg2.field5336[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5336[var15] = -16777216;
                } else {
                    if (var16 > Statics.field4495.length) {
                        var16 = Statics.field4495.length;
                    }
                    int var17 = Statics.field4495[var16 - 1];
                    arg2.field5336[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ol.ao(Lvg;Lvg;Lrz;I)V")
    public void method6525(class549 arg0, class549 arg1, class466 arg2) {
        if (arg2.field4855 == 0 || arg2.field4856 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4857 == 0) {
            var4 = arg0.field5330 - arg2.field4855;
        }
        if (arg2.field4854 == 0) {
            var5 = arg0.field5331 - arg2.field4856;
        }
        int var6 = arg0.field5330 * var5 + var4;
        int var7 = arg2.field4854 * arg1.field5330 + arg2.field4857;
        for (int var8 = 0; var8 < arg2.field4856; var8++) {
            for (int var9 = 0; var9 < arg2.field4855; var9++) {
                int var10001 = var7++;
                arg1.field5336[var10001] += arg0.field5336[var6++];
            }
            var6 += arg0.field5330 - arg2.field4855;
            var7 += arg1.field5330 - arg2.field4855;
        }
    }
}
