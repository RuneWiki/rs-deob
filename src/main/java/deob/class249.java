package deob;

import java.util.HashMap;

@ObfuscatedName("io")
public class class249 {

    @ObfuscatedName("io.n")
    public final HashMap field3231 = new HashMap();

    @ObfuscatedName("io.v")
    public class330 field3226 = new class330(0, 0);

    @ObfuscatedName("io.d")
    public int[] field3225 = new int[2048];

    @ObfuscatedName("io.c")
    public int[] field3229 = new int[2048];

    @ObfuscatedName("io.y")
    public int field3227 = 0;

    public class249() {
        method3954();
    }

    @ObfuscatedName("hi.n(B)V")
    public static void method3954() {
        Statics.field2561 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class24.method3951((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field2561[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field2561.length) {
            int var6 = var0 * 2;
            int var7 = class24.method3951((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field2561.length) {
                Statics.field2561[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("io.v(II)V")
    public void method4117(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            var6[var8] = class331.method4263((double) var7, 0.0D, var3);
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
        class336 var18 = new class336(var13, var2, var2);
        this.field3231.put(arg0, var18);
    }

    @ObfuscatedName("io.d(II)Llm;")
    public class336 method4137(int arg0) {
        if (!this.field3231.containsKey(arg0)) {
            this.method4117(arg0);
        }
        return (class336) this.field3231.get(arg0);
    }

    @ObfuscatedName("io.c(III)V")
    public final void method4119(int arg0, int arg1) {
        if (this.field3227 < this.field3225.length) {
            this.field3225[this.field3227] = arg0;
            this.field3229[this.field3227] = arg1;
            this.field3227++;
        }
    }

    @ObfuscatedName("io.y(I)V")
    public final void method4120() {
        this.field3227 = 0;
    }

    @ObfuscatedName("io.h(IILlm;FI)V")
    public final void method4121(int arg0, int arg1, class336 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class336 var6 = this.method4137(var5);
        int var7 = var5 * 2 + 1;
        class330 var8 = new class330(0, 0, arg2.field3913, arg2.field3912);
        class330 var9 = new class330(0, 0);
        this.field3226.method5693(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3227; var10++) {
            int var11 = this.field3225[var10];
            int var12 = this.field3229[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3912 - (float) (var12 - arg1) * arg3) - var5;
            this.field3226.method5697(var13, var14);
            this.field3226.method5695(var8, var9);
            this.method4116(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3915.length; var15++) {
            if (arg2.field3915[var15] == 0) {
                arg2.field3915[var15] = -16777216;
            } else {
                int var16 = (arg2.field3915[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3915[var15] = -16777216;
                } else {
                    if (var16 > Statics.field2561.length) {
                        var16 = Statics.field2561.length;
                    }
                    int var17 = Statics.field2561[var16 - 1];
                    arg2.field3915[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("io.z(Llm;Llm;Lli;I)V")
    public void method4116(class336 arg0, class336 arg1, class330 arg2) {
        if (arg2.field3881 == 0 || arg2.field3877 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3879 == 0) {
            var4 = arg0.field3913 - arg2.field3881;
        }
        if (arg2.field3878 == 0) {
            var5 = arg0.field3912 - arg2.field3877;
        }
        int var6 = arg0.field3913 * var5 + var4;
        int var7 = arg2.field3878 * arg1.field3913 + arg2.field3879;
        for (int var8 = 0; var8 < arg2.field3877; var8++) {
            for (int var9 = 0; var9 < arg2.field3881; var9++) {
                int var10001 = var7++;
                arg1.field3915[var10001] += arg0.field3915[var6++];
            }
            var6 += arg0.field3913 - arg2.field3881;
            var7 += arg1.field3913 - arg2.field3881;
        }
    }
}
