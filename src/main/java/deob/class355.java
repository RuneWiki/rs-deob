package deob;

import java.util.HashMap;

@ObfuscatedName("nf")
public class class355 {

    @ObfuscatedName("nf.af")
    public final HashMap field4304 = new HashMap();

    @ObfuscatedName("nf.an")
    public class421 field4302 = new class421(0, 0);

    @ObfuscatedName("nf.aw")
    public int[] field4303 = new int[2048];

    @ObfuscatedName("nf.ac")
    public int[] field4306 = new int[2048];

    @ObfuscatedName("nf.au")
    public int field4305 = 0;

    public class355() {
        Statics.field1074 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class254.method2762((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field1074[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field1074.length) {
            int var7 = var1 * 2;
            int var8 = class254.method2762((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field1074.length) {
                Statics.field1074[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("nf.af(IB)V")
    public void method6266(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            var6[var8] = class422.method383((double) var7, 0.0D, var3);
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
        class503 var18 = new class503(var13, var2, var2);
        this.field4304.put(arg0, var18);
    }

    @ObfuscatedName("nf.an(II)Ltq;")
    public class503 method6267(int arg0) {
        if (!this.field4304.containsKey(arg0)) {
            this.method6266(arg0);
        }
        return (class503) this.field4304.get(arg0);
    }

    @ObfuscatedName("nf.aw(IIS)V")
    public final void method6268(int arg0, int arg1) {
        if (this.field4305 < this.field4303.length) {
            this.field4303[this.field4305] = arg0;
            this.field4306[this.field4305] = arg1;
            this.field4305++;
        }
    }

    @ObfuscatedName("nf.ac(I)V")
    public final void method6273() {
        this.field4305 = 0;
    }

    @ObfuscatedName("nf.au(IILtq;FI)V")
    public final void method6272(int arg0, int arg1, class503 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class503 var6 = this.method6267(var5);
        int var7 = var5 * 2 + 1;
        class421 var8 = new class421(0, 0, arg2.field5088, arg2.field5093);
        class421 var9 = new class421(0, 0);
        this.field4302.method7369(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4305; var10++) {
            int var11 = this.field4303[var10];
            int var12 = this.field4306[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5093 - (float) (var12 - arg1) * arg3) - var5;
            this.field4302.method7371(var13, var14);
            this.field4302.method7388(var8, var9);
            this.method6269(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5089.length; var15++) {
            if (arg2.field5089[var15] == 0) {
                arg2.field5089[var15] = -16777216;
            } else {
                int var16 = (arg2.field5089[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5089[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1074.length) {
                        var16 = Statics.field1074.length;
                    }
                    int var17 = Statics.field1074[var16 - 1];
                    arg2.field5089[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("nf.ab(Ltq;Ltq;Lqu;B)V")
    public void method6269(class503 arg0, class503 arg1, class421 arg2) {
        if (arg2.field4648 == 0 || arg2.field4651 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4650 == 0) {
            var4 = arg0.field5088 - arg2.field4648;
        }
        if (arg2.field4649 == 0) {
            var5 = arg0.field5093 - arg2.field4651;
        }
        int var6 = arg0.field5088 * var5 + var4;
        int var7 = arg2.field4649 * arg1.field5088 + arg2.field4650;
        for (int var8 = 0; var8 < arg2.field4651; var8++) {
            for (int var9 = 0; var9 < arg2.field4648; var9++) {
                int var10001 = var7++;
                arg1.field5089[var10001] += arg0.field5089[var6++];
            }
            var6 += arg0.field5088 - arg2.field4648;
            var7 += arg1.field5088 - arg2.field4648;
        }
    }
}
