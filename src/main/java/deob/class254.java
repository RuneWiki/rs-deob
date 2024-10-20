package deob;

import java.util.HashMap;

@ObfuscatedName("ia")
public class class254 {

    @ObfuscatedName("ia.y")
    public final HashMap field3266 = new HashMap();

    @ObfuscatedName("ia.c")
    public class316 field3259 = new class316(0, 0);

    @ObfuscatedName("ia.n")
    public int[] field3260 = new int[2048];

    @ObfuscatedName("ia.u")
    public int[] field3261 = new int[2048];

    @ObfuscatedName("ia.i")
    public int field3263 = 0;

    public class254() {
        method963();
    }

    @ObfuscatedName("as.y(S)V")
    public static void method963() {
        Statics.field3258 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class10.method279((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3258[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3258.length) {
            int var6 = var0 * 2;
            int var7 = class10.method279((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3258.length) {
                Statics.field3258[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("ia.c(IB)V")
    public void method4407(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class317.method618(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        this.field3266.put(arg0, var11);
    }

    @ObfuscatedName("ia.n(II)Llu;")
    public class324 method4421(int arg0) {
        if (!this.field3266.containsKey(arg0)) {
            this.method4407(arg0);
        }
        return (class324) this.field3266.get(arg0);
    }

    @ObfuscatedName("ia.u(III)V")
    public final void method4418(int arg0, int arg1) {
        if (this.field3263 < this.field3260.length) {
            this.field3260[this.field3263] = arg0;
            this.field3261[this.field3263] = arg1;
            this.field3263++;
        }
    }

    @ObfuscatedName("ia.i(I)V")
    public final void method4410() {
        this.field3263 = 0;
    }

    @ObfuscatedName("ia.p(IILlu;FI)V")
    public final void method4411(int arg0, int arg1, class324 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class324 var6 = this.method4421(var5);
        int var7 = var5 * 2 + 1;
        class316 var8 = new class316(0, 0, arg2.field3845, arg2.field3847);
        class316 var9 = new class316(0, 0);
        this.field3259.method5321(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3263; var10++) {
            int var11 = this.field3260[var10];
            int var12 = this.field3261[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3847 - (float) (var12 - arg1) * arg3) - var5;
            this.field3259.method5348(var13, var14);
            this.field3259.method5323(var8, var9);
            this.method4409(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3851.length; var15++) {
            if (arg2.field3851[var15] == 0) {
                arg2.field3851[var15] = -16777216;
            } else {
                int var16 = (arg2.field3851[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3851[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3258.length) {
                        var16 = Statics.field3258.length;
                    }
                    int var17 = Statics.field3258[var16 - 1];
                    arg2.field3851[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ia.e(Llu;Llu;Llj;I)V")
    public void method4409(class324 arg0, class324 arg1, class316 arg2) {
        if (arg2.field3804 == 0 || arg2.field3807 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3805 == 0) {
            var4 = arg0.field3845 - arg2.field3804;
        }
        if (arg2.field3806 == 0) {
            var5 = arg0.field3847 - arg2.field3807;
        }
        int var6 = arg0.field3845 * var5 + var4;
        int var7 = arg2.field3806 * arg1.field3845 + arg2.field3805;
        for (int var8 = 0; var8 < arg2.field3807; var8++) {
            for (int var9 = 0; var9 < arg2.field3804; var9++) {
                int var10001 = var7++;
                arg1.field3851[var10001] += arg0.field3851[var6++];
            }
            var6 += arg0.field3845 - arg2.field3804;
            var7 += arg1.field3845 - arg2.field3804;
        }
    }
}
