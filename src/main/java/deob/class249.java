package deob;

import java.util.HashMap;

@ObfuscatedName("iz")
public class class249 {

    @ObfuscatedName("iz.h")
    public final HashMap field3224 = new HashMap();

    @ObfuscatedName("iz.v")
    public class330 field3218 = new class330(0, 0);

    @ObfuscatedName("iz.x")
    public int[] field3219 = new int[2048];

    @ObfuscatedName("iz.w")
    public int[] field3217 = new int[2048];

    @ObfuscatedName("iz.t")
    public int field3221 = 0;

    public class249() {
        method3382();
    }

    @ObfuscatedName("gk.h(I)V")
    public static void method3382() {
        Statics.field3220 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class24.method14((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3220[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3220.length) {
            int var6 = var0 * 2;
            int var7 = class24.method14((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3220.length) {
                Statics.field3220[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("iz.v(II)V")
    public void method3976(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class331.method3935(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        this.field3224.put(arg0, var11);
    }

    @ObfuscatedName("iz.x(II)Llm;")
    public class336 method3977(int arg0) {
        if (!this.field3224.containsKey(arg0)) {
            this.method3976(arg0);
        }
        return (class336) this.field3224.get(arg0);
    }

    @ObfuscatedName("iz.w(III)V")
    public final void method3978(int arg0, int arg1) {
        if (this.field3221 < this.field3219.length) {
            this.field3219[this.field3221] = arg0;
            this.field3217[this.field3221] = arg1;
            this.field3221++;
        }
    }

    @ObfuscatedName("iz.t(I)V")
    public final void method3979() {
        this.field3221 = 0;
    }

    @ObfuscatedName("iz.j(IILlm;FB)V")
    public final void method3980(int arg0, int arg1, class336 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class336 var6 = this.method3977(var5);
        int var7 = var5 * 2 + 1;
        class330 var8 = new class330(0, 0, arg2.field3914, arg2.field3912);
        class330 var9 = new class330(0, 0);
        this.field3218.method5545(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3221; var10++) {
            int var11 = this.field3219[var10];
            int var12 = this.field3217[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3912 - (float) (var12 - arg1) * arg3) - var5;
            this.field3218.method5544(var13, var14);
            this.field3218.method5546(var8, var9);
            this.method3981(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3918.length; var15++) {
            if (arg2.field3918[var15] == 0) {
                arg2.field3918[var15] = -16777216;
            } else {
                int var16 = (arg2.field3918[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3918[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3220.length) {
                        var16 = Statics.field3220.length;
                    }
                    int var17 = Statics.field3220[var16 - 1];
                    arg2.field3918[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("iz.n(Llm;Llm;Llc;B)V")
    public void method3981(class336 arg0, class336 arg1, class330 arg2) {
        if (arg2.field3880 == 0 || arg2.field3881 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3882 == 0) {
            var4 = arg0.field3914 - arg2.field3880;
        }
        if (arg2.field3879 == 0) {
            var5 = arg0.field3912 - arg2.field3881;
        }
        int var6 = arg0.field3914 * var5 + var4;
        int var7 = arg2.field3879 * arg1.field3914 + arg2.field3882;
        for (int var8 = 0; var8 < arg2.field3881; var8++) {
            for (int var9 = 0; var9 < arg2.field3880; var9++) {
                int var10001 = var7++;
                arg1.field3918[var10001] += arg0.field3918[var6++];
            }
            var6 += arg0.field3914 - arg2.field3880;
            var7 += arg1.field3914 - arg2.field3880;
        }
    }
}
