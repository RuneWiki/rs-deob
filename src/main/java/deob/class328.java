package deob;

import java.util.HashMap;

@ObfuscatedName("lm")
public class class328 {

    @ObfuscatedName("lm.c")
    public final HashMap field4125 = new HashMap();

    @ObfuscatedName("lm.p")
    public class386 field4121 = new class386(0, 0);

    @ObfuscatedName("lm.f")
    public int[] field4126 = new int[2048];

    @ObfuscatedName("lm.n")
    public int[] field4123 = new int[2048];

    @ObfuscatedName("lm.k")
    public int field4124 = 0;

    public class328() {
        Statics.field1041 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class231.method115((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field1041[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field1041.length) {
            int var7 = var1 * 2;
            int var8 = class231.method115((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field1041.length) {
                Statics.field1041[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("lm.c(II)V")
    public void method5596(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class387.method2164(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class458 var11 = new class458(var6, var2, var2);
        this.field4125.put(arg0, var11);
    }

    @ObfuscatedName("lm.p(II)Lqi;")
    public class458 method5597(int arg0) {
        if (!this.field4125.containsKey(arg0)) {
            this.method5596(arg0);
        }
        return (class458) this.field4125.get(arg0);
    }

    @ObfuscatedName("lm.f(III)V")
    public final void method5598(int arg0, int arg1) {
        if (this.field4124 < this.field4126.length) {
            this.field4126[this.field4124] = arg0;
            this.field4123[this.field4124] = arg1;
            this.field4124++;
        }
    }

    @ObfuscatedName("lm.n(B)V")
    public final void method5604() {
        this.field4124 = 0;
    }

    @ObfuscatedName("lm.k(IILqi;FI)V")
    public final void method5600(int arg0, int arg1, class458 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class458 var6 = this.method5597(var5);
        int var7 = var5 * 2 + 1;
        class386 var8 = new class386(0, 0, arg2.field4825, arg2.field4829);
        class386 var9 = new class386(0, 0);
        this.field4121.method6422(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4124; var10++) {
            int var11 = this.field4126[var10];
            int var12 = this.field4123[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4829 - (float) (var12 - arg1) * arg3) - var5;
            this.field4121.method6421(var13, var14);
            this.field4121.method6425(var8, var9);
            this.method5601(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4826.length; var15++) {
            if (arg2.field4826[var15] == 0) {
                arg2.field4826[var15] = -16777216;
            } else {
                int var16 = (arg2.field4826[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4826[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1041.length) {
                        var16 = Statics.field1041.length;
                    }
                    int var17 = Statics.field1041[var16 - 1];
                    arg2.field4826[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("lm.w(Lqi;Lqi;Lnk;I)V")
    public void method5601(class458 arg0, class458 arg1, class386 arg2) {
        if (arg2.field4422 == 0 || arg2.field4419 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4421 == 0) {
            var4 = arg0.field4825 - arg2.field4422;
        }
        if (arg2.field4420 == 0) {
            var5 = arg0.field4829 - arg2.field4419;
        }
        int var6 = arg0.field4825 * var5 + var4;
        int var7 = arg2.field4420 * arg1.field4825 + arg2.field4421;
        for (int var8 = 0; var8 < arg2.field4419; var8++) {
            for (int var9 = 0; var9 < arg2.field4422; var9++) {
                int var10001 = var7++;
                arg1.field4826[var10001] += arg0.field4826[var6++];
            }
            var6 += arg0.field4825 - arg2.field4422;
            var7 += arg1.field4825 - arg2.field4422;
        }
    }
}
