package deob;

import java.util.HashMap;

@ObfuscatedName("od")
public class class370 {

    @ObfuscatedName("od.au")
    public final HashMap field4365 = new HashMap();

    @ObfuscatedName("od.ae")
    public class446 field4364 = new class446(0, 0);

    @ObfuscatedName("od.ao")
    public int[] field4362 = new int[2048];

    @ObfuscatedName("od.at")
    public int[] field4363 = new int[2048];

    @ObfuscatedName("od.ac")
    public int field4366 = 0;

    public class370() {
        method6080();
    }

    @ObfuscatedName("ny.au(I)V")
    public static void method6080() {
        Statics.field2286 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class262.method2157((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field2286[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field2286.length) {
            int var6 = var0 * 2;
            int var7 = class262.method2157((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field2286.length) {
                Statics.field2286[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("od.ae(II)V")
    public void method6338(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = Statics.method3263(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class529 var11 = new class529(var6, var2, var2);
        this.field4365.put(arg0, var11);
    }

    @ObfuscatedName("od.ao(IB)Lui;")
    public class529 method6320(int arg0) {
        if (!this.field4365.containsKey(arg0)) {
            this.method6338(arg0);
        }
        return (class529) this.field4365.get(arg0);
    }

    @ObfuscatedName("od.at(III)V")
    public final void method6321(int arg0, int arg1) {
        if (this.field4366 < this.field4362.length) {
            this.field4362[this.field4366] = arg0;
            this.field4363[this.field4366] = arg1;
            this.field4366++;
        }
    }

    @ObfuscatedName("od.ac(I)V")
    public final void method6322() {
        this.field4366 = 0;
    }

    @ObfuscatedName("od.ai(IILui;FI)V")
    public final void method6326(int arg0, int arg1, class529 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class529 var6 = this.method6320(var5);
        int var7 = var5 * 2 + 1;
        class446 var8 = new class446(0, 0, arg2.field5218, arg2.field5209);
        class446 var9 = new class446(0, 0);
        this.field4364.method7447(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4366; var10++) {
            int var11 = this.field4362[var10];
            int var12 = this.field4363[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5209 - (float) (var12 - arg1) * arg3) - var5;
            this.field4364.method7446(var13, var14);
            this.field4364.method7449(var8, var9);
            this.method6347(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5216.length; var15++) {
            if (arg2.field5216[var15] == 0) {
                arg2.field5216[var15] = -16777216;
            } else {
                int var16 = (arg2.field5216[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5216[var15] = -16777216;
                } else {
                    if (var16 > Statics.field2286.length) {
                        var16 = Statics.field2286.length;
                    }
                    int var17 = Statics.field2286[var16 - 1];
                    arg2.field5216[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("od.az(Lui;Lui;Lrb;I)V")
    public void method6347(class529 arg0, class529 arg1, class446 arg2) {
        if (arg2.field4719 == 0 || arg2.field4717 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4720 == 0) {
            var4 = arg0.field5218 - arg2.field4719;
        }
        if (arg2.field4718 == 0) {
            var5 = arg0.field5209 - arg2.field4717;
        }
        int var6 = arg0.field5218 * var5 + var4;
        int var7 = arg2.field4718 * arg1.field5218 + arg2.field4720;
        for (int var8 = 0; var8 < arg2.field4717; var8++) {
            for (int var9 = 0; var9 < arg2.field4719; var9++) {
                int var10001 = var7++;
                arg1.field5216[var10001] += arg0.field5216[var6++];
            }
            var6 += arg0.field5218 - arg2.field4719;
            var7 += arg1.field5218 - arg2.field4719;
        }
    }
}
