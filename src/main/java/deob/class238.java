package deob;

import java.util.HashMap;

@ObfuscatedName("ic")
public class class238 {

    @ObfuscatedName("ic.f")
    public final HashMap field3166 = new HashMap();

    @ObfuscatedName("ic.i")
    public class319 field3160 = new class319(0, 0);

    @ObfuscatedName("ic.y")
    public int[] field3161 = new int[2048];

    @ObfuscatedName("ic.w")
    public int[] field3162 = new int[2048];

    @ObfuscatedName("ic.p")
    public int field3163 = 0;

    public class238() {
        Statics.field3165 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class15.method980((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field3165[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field3165.length) {
            int var7 = var1 * 2;
            int var8 = class15.method980((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field3165.length) {
                Statics.field3165[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("ic.f(II)V")
    public void method3919(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class320.method4908(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class325 var11 = new class325(var6, var2, var2);
        this.field3166.put(arg0, var11);
    }

    @ObfuscatedName("ic.i(IB)Lls;")
    public class325 method3920(int arg0) {
        if (!this.field3166.containsKey(arg0)) {
            this.method3919(arg0);
        }
        return (class325) this.field3166.get(arg0);
    }

    @ObfuscatedName("ic.y(III)V")
    public final void method3921(int arg0, int arg1) {
        if (this.field3163 < this.field3161.length) {
            this.field3161[this.field3163] = arg0;
            this.field3162[this.field3163] = arg1;
            this.field3163++;
        }
    }

    @ObfuscatedName("ic.w(I)V")
    public final void method3922() {
        this.field3163 = 0;
    }

    @ObfuscatedName("ic.p(IILls;FI)V")
    public final void method3936(int arg0, int arg1, class325 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class325 var6 = this.method3920(var5);
        int var7 = var5 * 2 + 1;
        class319 var8 = new class319(0, 0, arg2.field3875, arg2.field3865);
        class319 var9 = new class319(0, 0);
        this.field3160.method5515(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3163; var10++) {
            int var11 = this.field3161[var10];
            int var12 = this.field3162[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3865 - (float) (var12 - arg1) * arg3) - var5;
            this.field3160.method5509(var13, var14);
            this.field3160.method5511(var8, var9);
            this.method3924(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3873.length; var15++) {
            if (arg2.field3873[var15] == 0) {
                arg2.field3873[var15] = -16777216;
            } else {
                int var16 = (arg2.field3873[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3873[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3165.length) {
                        var16 = Statics.field3165.length;
                    }
                    int var17 = Statics.field3165[var16 - 1];
                    arg2.field3873[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ic.b(Lls;Lls;Llh;I)V")
    public void method3924(class325 arg0, class325 arg1, class319 arg2) {
        if (arg2.field3835 == 0 || arg2.field3838 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3837 == 0) {
            var4 = arg0.field3875 - arg2.field3835;
        }
        if (arg2.field3836 == 0) {
            var5 = arg0.field3865 - arg2.field3838;
        }
        int var6 = arg0.field3875 * var5 + var4;
        int var7 = arg2.field3836 * arg1.field3875 + arg2.field3837;
        for (int var8 = 0; var8 < arg2.field3838; var8++) {
            for (int var9 = 0; var9 < arg2.field3835; var9++) {
                int var10001 = var7++;
                arg1.field3873[var10001] += arg0.field3873[var6++];
            }
            var6 += arg0.field3875 - arg2.field3835;
            var7 += arg1.field3875 - arg2.field3835;
        }
    }
}
