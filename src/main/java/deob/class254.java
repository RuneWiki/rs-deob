package deob;

import java.util.HashMap;

@ObfuscatedName("ip")
public class class254 {

    @ObfuscatedName("ip.f")
    public final HashMap field3277 = new HashMap();

    @ObfuscatedName("ip.l")
    public class316 field3284 = new class316(0, 0);

    @ObfuscatedName("ip.w")
    public int[] field3278 = new int[2048];

    @ObfuscatedName("ip.s")
    public int[] field3276 = new int[2048];

    @ObfuscatedName("ip.e")
    public int field3280 = 0;

    public class254() {
        method3018();
    }

    @ObfuscatedName("ev.f(I)V")
    public static void method3018() {
        Statics.field3283 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class10.method2954((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3283[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3283.length) {
            int var6 = var0 * 2;
            int var7 = class10.method2954((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3283.length) {
                Statics.field3283[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("ip.l(II)V")
    public void method4452(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class317.method3040(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class324 var11 = new class324(var6, var2, var2);
        this.field3277.put(arg0, var11);
    }

    @ObfuscatedName("ip.w(IB)Llp;")
    public class324 method4435(int arg0) {
        if (!this.field3277.containsKey(arg0)) {
            this.method4452(arg0);
        }
        return (class324) this.field3277.get(arg0);
    }

    @ObfuscatedName("ip.s(III)V")
    public final void method4454(int arg0, int arg1) {
        if (this.field3280 < this.field3278.length) {
            this.field3278[this.field3280] = arg0;
            this.field3276[this.field3280] = arg1;
            this.field3280++;
        }
    }

    @ObfuscatedName("ip.e(B)V")
    public final void method4434() {
        this.field3280 = 0;
    }

    @ObfuscatedName("ip.c(IILlp;FI)V")
    public final void method4437(int arg0, int arg1, class324 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class324 var6 = this.method4435(var5);
        int var7 = var5 * 2 + 1;
        class316 var8 = new class316(0, 0, arg2.field3872, arg2.field3871);
        class316 var9 = new class316(0, 0);
        this.field3284.method5406(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3280; var10++) {
            int var11 = this.field3278[var10];
            int var12 = this.field3276[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3871 - (float) (var12 - arg1) * arg3) - var5;
            this.field3284.method5405(var13, var14);
            this.field3284.method5428(var8, var9);
            this.method4438(var6, arg2, var9);
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
                    if (var16 > Statics.field3283.length) {
                        var16 = Statics.field3283.length;
                    }
                    int var17 = Statics.field3283[var16 - 1];
                    arg2.field3873[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ip.p(Llp;Llp;Llo;B)V")
    public void method4438(class324 arg0, class324 arg1, class316 arg2) {
        if (arg2.field3830 == 0 || arg2.field3831 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3828 == 0) {
            var4 = arg0.field3872 - arg2.field3830;
        }
        if (arg2.field3829 == 0) {
            var5 = arg0.field3871 - arg2.field3831;
        }
        int var6 = arg0.field3872 * var5 + var4;
        int var7 = arg2.field3829 * arg1.field3872 + arg2.field3828;
        for (int var8 = 0; var8 < arg2.field3831; var8++) {
            for (int var9 = 0; var9 < arg2.field3830; var9++) {
                int var10001 = var7++;
                arg1.field3873[var10001] += arg0.field3873[var6++];
            }
            var6 += arg0.field3872 - arg2.field3830;
            var7 += arg1.field3872 - arg2.field3830;
        }
    }
}
