package deob;

import java.util.HashMap;

@ObfuscatedName("iu")
public class class249 {

    @ObfuscatedName("iu.m")
    public final HashMap field3268 = new HashMap();

    @ObfuscatedName("iu.f")
    public class320 field3264 = new class320(0, 0);

    @ObfuscatedName("iu.q")
    public int[] field3272 = new int[2048];

    @ObfuscatedName("iu.w")
    public int[] field3263 = new int[2048];

    @ObfuscatedName("iu.o")
    public int field3267 = 0;

    public class249() {
        method1878();
    }

    @ObfuscatedName("cu.m(I)V")
    public static void method1878() {
        Statics.field3270 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class15.method4938((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3270[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3270.length) {
            int var6 = var0 * 2;
            int var7 = class15.method4938((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3270.length) {
                Statics.field3270[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("iu.f(II)V")
    public void method4305(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class321.method5437(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class328 var11 = new class328(var6, var2, var2);
        this.field3268.put(arg0, var11);
    }

    @ObfuscatedName("iu.q(II)Lln;")
    public class328 method4307(int arg0) {
        if (!this.field3268.containsKey(arg0)) {
            this.method4305(arg0);
        }
        return (class328) this.field3268.get(arg0);
    }

    @ObfuscatedName("iu.w(III)V")
    public final void method4327(int arg0, int arg1) {
        if (this.field3267 < this.field3272.length) {
            this.field3272[this.field3267] = arg0;
            this.field3263[this.field3267] = arg1;
            this.field3267++;
        }
    }

    @ObfuscatedName("iu.o(I)V")
    public final void method4308() {
        this.field3267 = 0;
    }

    @ObfuscatedName("iu.u(IILln;FI)V")
    public final void method4309(int arg0, int arg1, class328 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class328 var6 = this.method4307(var5);
        int var7 = var5 * 2 + 1;
        class320 var8 = new class320(0, 0, arg2.field3897, arg2.field3904);
        class320 var9 = new class320(0, 0);
        this.field3264.method5429(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3267; var10++) {
            int var11 = this.field3272[var10];
            int var12 = this.field3263[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3904 - (float) (var12 - arg1) * arg3) - var5;
            this.field3264.method5428(var13, var14);
            this.field3264.method5432(var8, var9);
            this.method4310(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3900.length; var15++) {
            if (arg2.field3900[var15] == 0) {
                arg2.field3900[var15] = -16777216;
            } else {
                int var16 = (arg2.field3900[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3900[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3270.length) {
                        var16 = Statics.field3270.length;
                    }
                    int var17 = Statics.field3270[var16 - 1];
                    arg2.field3900[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("iu.g(Lln;Lln;Lla;B)V")
    public void method4310(class328 arg0, class328 arg1, class320 arg2) {
        if (arg2.field3855 == 0 || arg2.field3853 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3856 == 0) {
            var4 = arg0.field3897 - arg2.field3855;
        }
        if (arg2.field3854 == 0) {
            var5 = arg0.field3904 - arg2.field3853;
        }
        int var6 = arg0.field3897 * var5 + var4;
        int var7 = arg2.field3854 * arg1.field3897 + arg2.field3856;
        for (int var8 = 0; var8 < arg2.field3853; var8++) {
            for (int var9 = 0; var9 < arg2.field3855; var9++) {
                int var10001 = var7++;
                arg1.field3900[var10001] += arg0.field3900[var6++];
            }
            var6 += arg0.field3897 - arg2.field3855;
            var7 += arg1.field3897 - arg2.field3855;
        }
    }
}
