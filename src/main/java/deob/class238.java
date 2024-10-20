package deob;

import java.util.HashMap;

@ObfuscatedName("ic")
public class class238 {

    @ObfuscatedName("ic.s")
    public final HashMap field3168 = new HashMap();

    @ObfuscatedName("ic.j")
    public class319 field3167 = new class319(0, 0);

    @ObfuscatedName("ic.i")
    public int[] field3169 = new int[2048];

    @ObfuscatedName("ic.k")
    public int[] field3171 = new int[2048];

    @ObfuscatedName("ic.u")
    public int field3170 = 0;

    public class238() {
        Statics.field3172 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class15.method2302((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field3172[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field3172.length) {
            int var7 = var1 * 2;
            int var8 = class15.method2302((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field3172.length) {
                Statics.field3172[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("ic.s(IB)V")
    public void method3929(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class320.method3024(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        this.field3168.put(arg0, var11);
    }

    @ObfuscatedName("ic.j(II)Lls;")
    public class325 method3931(int arg0) {
        if (!this.field3168.containsKey(arg0)) {
            this.method3929(arg0);
        }
        return (class325) this.field3168.get(arg0);
    }

    @ObfuscatedName("ic.i(IIB)V")
    public final void method3928(int arg0, int arg1) {
        if (this.field3170 < this.field3169.length) {
            this.field3169[this.field3170] = arg0;
            this.field3171[this.field3170] = arg1;
            this.field3170++;
        }
    }

    @ObfuscatedName("ic.k(I)V")
    public final void method3932() {
        this.field3170 = 0;
    }

    @ObfuscatedName("ic.u(IILls;FB)V")
    public final void method3933(int arg0, int arg1, class325 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class325 var6 = this.method3931(var5);
        int var7 = var5 * 2 + 1;
        class319 var8 = new class319(0, 0, arg2.field3878, arg2.field3875);
        class319 var9 = new class319(0, 0);
        this.field3167.method5464(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3170; var10++) {
            int var11 = this.field3169[var10];
            int var12 = this.field3171[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3875 - (float) (var12 - arg1) * arg3) - var5;
            this.field3167.method5443(var13, var14);
            this.field3167.method5446(var8, var9);
            this.method3934(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3874.length; var15++) {
            if (arg2.field3874[var15] == 0) {
                arg2.field3874[var15] = -16777216;
            } else {
                int var16 = (arg2.field3874[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3874[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3172.length) {
                        var16 = Statics.field3172.length;
                    }
                    int var17 = Statics.field3172[var16 - 1];
                    arg2.field3874[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ic.n(Lls;Lls;Llh;I)V")
    public void method3934(class325 arg0, class325 arg1, class319 arg2) {
        if (arg2.field3842 == 0 || arg2.field3840 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3843 == 0) {
            var4 = arg0.field3878 - arg2.field3842;
        }
        if (arg2.field3841 == 0) {
            var5 = arg0.field3875 - arg2.field3840;
        }
        int var6 = arg0.field3878 * var5 + var4;
        int var7 = arg2.field3841 * arg1.field3878 + arg2.field3843;
        for (int var8 = 0; var8 < arg2.field3840; var8++) {
            for (int var9 = 0; var9 < arg2.field3842; var9++) {
                int var10001 = var7++;
                arg1.field3874[var10001] += arg0.field3874[var6++];
            }
            var6 += arg0.field3878 - arg2.field3842;
            var7 += arg1.field3878 - arg2.field3842;
        }
    }
}
