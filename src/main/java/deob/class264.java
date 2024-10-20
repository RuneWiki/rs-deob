package deob;

import java.util.HashMap;

@ObfuscatedName("jf")
public class class264 {

    @ObfuscatedName("jf.f")
    public final HashMap field3338 = new HashMap();

    @ObfuscatedName("jf.o")
    public class336 field3333 = new class336(0, 0);

    @ObfuscatedName("jf.u")
    public int[] field3335 = new int[2048];

    @ObfuscatedName("jf.p")
    public int[] field3336 = new int[2048];

    @ObfuscatedName("jf.b")
    public int field3337 = 0;

    public class264() {
        method3190();
    }

    @ObfuscatedName("fm.f(I)V")
    public static void method3190() {
        Statics.field1312 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class149.method2141((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field1312[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field1312.length) {
            int var6 = var0 * 2;
            int var7 = class149.method2141((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field1312.length) {
                Statics.field1312[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("jf.o(II)V")
    public void method4101(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class337.method3200(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class395 var11 = new class395(var6, var2, var2);
        this.field3338.put(arg0, var11);
    }

    @ObfuscatedName("jf.u(II)Loh;")
    public class395 method4112(int arg0) {
        if (!this.field3338.containsKey(arg0)) {
            this.method4101(arg0);
        }
        return (class395) this.field3338.get(arg0);
    }

    @ObfuscatedName("jf.p(III)V")
    public final void method4103(int arg0, int arg1) {
        if (this.field3337 < this.field3335.length) {
            this.field3335[this.field3337] = arg0;
            this.field3336[this.field3337] = arg1;
            this.field3337++;
        }
    }

    @ObfuscatedName("jf.b(I)V")
    public final void method4104() {
        this.field3337 = 0;
    }

    @ObfuscatedName("jf.e(IILoh;FI)V")
    public final void method4105(int arg0, int arg1, class395 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class395 var6 = this.method4112(var5);
        int var7 = var5 * 2 + 1;
        class336 var8 = new class336(0, 0, arg2.field4245, arg2.field4244);
        class336 var9 = new class336(0, 0);
        this.field3333.method5286(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3337; var10++) {
            int var11 = this.field3335[var10];
            int var12 = this.field3336[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4244 - (float) (var12 - arg1) * arg3) - var5;
            this.field3333.method5297(var13, var14);
            this.field3333.method5287(var8, var9);
            this.method4106(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4247.length; var15++) {
            if (arg2.field4247[var15] == 0) {
                arg2.field4247[var15] = -16777216;
            } else {
                int var16 = (arg2.field4247[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4247[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1312.length) {
                        var16 = Statics.field1312.length;
                    }
                    int var17 = Statics.field1312[var16 - 1];
                    arg2.field4247[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("jf.k(Loh;Loh;Llj;I)V")
    public void method4106(class395 arg0, class395 arg1, class336 arg2) {
        if (arg2.field3911 == 0 || arg2.field3913 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3916 == 0) {
            var4 = arg0.field4245 - arg2.field3911;
        }
        if (arg2.field3912 == 0) {
            var5 = arg0.field4244 - arg2.field3913;
        }
        int var6 = arg0.field4245 * var5 + var4;
        int var7 = arg2.field3912 * arg1.field4245 + arg2.field3916;
        for (int var8 = 0; var8 < arg2.field3913; var8++) {
            for (int var9 = 0; var9 < arg2.field3911; var9++) {
                int var10001 = var7++;
                arg1.field4247[var10001] += arg0.field4247[var6++];
            }
            var6 += arg0.field4245 - arg2.field3911;
            var7 += arg1.field4245 - arg2.field3911;
        }
    }
}
