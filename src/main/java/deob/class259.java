package deob;

import java.util.HashMap;

@ObfuscatedName("iq")
public class class259 {

    @ObfuscatedName("iq.a")
    public final HashMap field3299 = new HashMap();

    @ObfuscatedName("iq.s")
    public class320 field3296 = new class320(0, 0);

    @ObfuscatedName("iq.g")
    public int[] field3297 = new int[2048];

    @ObfuscatedName("iq.x")
    public int[] field3298 = new int[2048];

    @ObfuscatedName("iq.h")
    public int field3300 = 0;

    public class259() {
        method1046();
    }

    @ObfuscatedName("bv.a(I)V")
    public static void method1046() {
        Statics.field1978 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class15.method106((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field1978[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field1978.length) {
            int var6 = var0 * 2;
            int var7 = class15.method106((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field1978.length) {
                Statics.field1978[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("iq.s(II)V")
    public void method4560(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            var6[var8] = class321.method1929((double) var7, 0.0D, var3);
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
        class328 var18 = new class328(var13, var2, var2);
        this.field3299.put(arg0, var18);
    }

    @ObfuscatedName("iq.g(IB)Lld;")
    public class328 method4561(int arg0) {
        if (!this.field3299.containsKey(arg0)) {
            this.method4560(arg0);
        }
        return (class328) this.field3299.get(arg0);
    }

    @ObfuscatedName("iq.x(III)V")
    public final void method4562(int arg0, int arg1) {
        if (this.field3300 < this.field3297.length) {
            this.field3297[this.field3300] = arg0;
            this.field3298[this.field3300] = arg1;
            this.field3300++;
        }
    }

    @ObfuscatedName("iq.h(I)V")
    public final void method4569() {
        this.field3300 = 0;
    }

    @ObfuscatedName("iq.f(IILld;FI)V")
    public final void method4563(int arg0, int arg1, class328 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class328 var6 = this.method4561(var5);
        int var7 = var5 * 2 + 1;
        class320 var8 = new class320(0, 0, arg2.field3899, arg2.field3890);
        class320 var9 = new class320(0, 0);
        this.field3296.method5497(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3300; var10++) {
            int var11 = this.field3297[var10];
            int var12 = this.field3298[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3890 - (float) (var12 - arg1) * arg3) - var5;
            this.field3296.method5498(var13, var14);
            this.field3296.method5518(var8, var9);
            this.method4564(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3895.length; var15++) {
            if (arg2.field3895[var15] == 0) {
                arg2.field3895[var15] = -16777216;
            } else {
                int var16 = (arg2.field3895[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3895[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1978.length) {
                        var16 = Statics.field1978.length;
                    }
                    int var17 = Statics.field1978[var16 - 1];
                    arg2.field3895[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("iq.p(Lld;Lld;Llh;B)V")
    public void method4564(class328 arg0, class328 arg1, class320 arg2) {
        if (arg2.field3847 == 0 || arg2.field3848 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3845 == 0) {
            var4 = arg0.field3899 - arg2.field3847;
        }
        if (arg2.field3846 == 0) {
            var5 = arg0.field3890 - arg2.field3848;
        }
        int var6 = arg0.field3899 * var5 + var4;
        int var7 = arg2.field3846 * arg1.field3899 + arg2.field3845;
        for (int var8 = 0; var8 < arg2.field3848; var8++) {
            for (int var9 = 0; var9 < arg2.field3847; var9++) {
                int var10001 = var7++;
                arg1.field3895[var10001] += arg0.field3895[var6++];
            }
            var6 += arg0.field3899 - arg2.field3847;
            var7 += arg1.field3899 - arg2.field3847;
        }
    }
}
