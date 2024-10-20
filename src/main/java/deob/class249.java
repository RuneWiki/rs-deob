package deob;

import java.util.HashMap;

@ObfuscatedName("iq")
public class class249 {

    @ObfuscatedName("iq.f")
    public final HashMap field3219 = new HashMap();

    @ObfuscatedName("iq.b")
    public class330 field3212 = new class330(0, 0);

    @ObfuscatedName("iq.l")
    public int[] field3211 = new int[2048];

    @ObfuscatedName("iq.m")
    public int[] field3213 = new int[2048];

    @ObfuscatedName("iq.z")
    public int field3215 = 0;

    public class249() {
        method3445();
    }

    @ObfuscatedName("gk.f(I)V")
    public static void method3445() {
        Statics.field3217 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class24.method1166((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3217[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3217.length) {
            int var6 = var0 * 2;
            int var7 = class24.method1166((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3217.length) {
                Statics.field3217[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("iq.b(II)V")
    public void method4068(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class331.method4041(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class336 var11 = new class336(var6, var2, var2);
        this.field3219.put(arg0, var11);
    }

    @ObfuscatedName("iq.l(II)Llc;")
    public class336 method4058(int arg0) {
        if (!this.field3219.containsKey(arg0)) {
            this.method4068(arg0);
        }
        return (class336) this.field3219.get(arg0);
    }

    @ObfuscatedName("iq.m(III)V")
    public final void method4061(int arg0, int arg1) {
        if (this.field3215 < this.field3211.length) {
            this.field3211[this.field3215] = arg0;
            this.field3213[this.field3215] = arg1;
            this.field3215++;
        }
    }

    @ObfuscatedName("iq.z(I)V")
    public final void method4062() {
        this.field3215 = 0;
    }

    @ObfuscatedName("iq.q(IILlc;FB)V")
    public final void method4071(int arg0, int arg1, class336 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class336 var6 = this.method4058(var5);
        int var7 = var5 * 2 + 1;
        class330 var8 = new class330(0, 0, arg2.field3909, arg2.field3915);
        class330 var9 = new class330(0, 0);
        this.field3212.method5607(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3215; var10++) {
            int var11 = this.field3211[var10];
            int var12 = this.field3213[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3915 - (float) (var12 - arg1) * arg3) - var5;
            this.field3212.method5608(var13, var14);
            this.field3212.method5621(var8, var9);
            this.method4064(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3910.length; var15++) {
            if (arg2.field3910[var15] == 0) {
                arg2.field3910[var15] = -16777216;
            } else {
                int var16 = (arg2.field3910[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3910[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3217.length) {
                        var16 = Statics.field3217.length;
                    }
                    int var17 = Statics.field3217[var16 - 1];
                    arg2.field3910[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("iq.k(Llc;Llc;Llw;I)V")
    public void method4064(class336 arg0, class336 arg1, class330 arg2) {
        if (arg2.field3878 == 0 || arg2.field3880 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3877 == 0) {
            var4 = arg0.field3909 - arg2.field3878;
        }
        if (arg2.field3879 == 0) {
            var5 = arg0.field3915 - arg2.field3880;
        }
        int var6 = arg0.field3909 * var5 + var4;
        int var7 = arg2.field3879 * arg1.field3909 + arg2.field3877;
        for (int var8 = 0; var8 < arg2.field3880; var8++) {
            for (int var9 = 0; var9 < arg2.field3878; var9++) {
                int var10001 = var7++;
                arg1.field3910[var10001] += arg0.field3910[var6++];
            }
            var6 += arg0.field3909 - arg2.field3878;
            var7 += arg1.field3909 - arg2.field3878;
        }
    }
}
