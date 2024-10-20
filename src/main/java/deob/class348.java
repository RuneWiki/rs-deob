package deob;

import java.util.HashMap;

@ObfuscatedName("mu")
public class class348 {

    @ObfuscatedName("mu.f")
    public final HashMap field4306 = new HashMap();

    @ObfuscatedName("mu.w")
    public class414 field4304 = new class414(0, 0);

    @ObfuscatedName("mu.v")
    public int[] field4303 = new int[2048];

    @ObfuscatedName("mu.s")
    public int[] field4305 = new int[2048];

    @ObfuscatedName("mu.z")
    public int field4302 = 0;

    public class348() {
        Statics.field4308 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class247.method2180((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field4308[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field4308.length) {
            int var7 = var1 * 2;
            int var8 = class247.method2180((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field4308.length) {
                Statics.field4308[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("mu.f(IB)V")
    public void method6181(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            double var11 = class415.method41((double) (var7) / var3) / var3;
            var6[var8] = var11;
            var7++;
            var8++;
        }
        double[] var14 = var6;
        double var15 = var6[arg0] * var6[arg0];
        int[] var17 = new int[var2 * var2];
        boolean var18 = false;
        for (int var19 = 0; var19 < var2; var19++) {
            for (int var20 = 0; var20 < var2; var20++) {
                int var21 = var17[var2 * var19 + var20] = (int) (var14[var19] * var14[var20] / var15 * 256.0D);
                if (!var18 && var21 > 0) {
                    var18 = true;
                }
            }
        }
        class488 var22 = new class488(var17, var2, var2);
        this.field4306.put(arg0, var22);
    }

    @ObfuscatedName("mu.w(IB)Lrs;")
    public class488 method6183(int arg0) {
        if (!this.field4306.containsKey(arg0)) {
            this.method6181(arg0);
        }
        return (class488) this.field4306.get(arg0);
    }

    @ObfuscatedName("mu.v(III)V")
    public final void method6185(int arg0, int arg1) {
        if (this.field4302 < this.field4303.length) {
            this.field4303[this.field4302] = arg0;
            this.field4305[this.field4302] = arg1;
            this.field4302++;
        }
    }

    @ObfuscatedName("mu.s(I)V")
    public final void method6200() {
        this.field4302 = 0;
    }

    @ObfuscatedName("mu.z(IILrs;FI)V")
    public final void method6201(int arg0, int arg1, class488 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class488 var6 = this.method6183(var5);
        int var7 = var5 * 2 + 1;
        class414 var8 = new class414(0, 0, arg2.field5034, arg2.field5032);
        class414 var9 = new class414(0, 0);
        this.field4304.method7219(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4302; var10++) {
            int var11 = this.field4303[var10];
            int var12 = this.field4305[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5032 - (float) (var12 - arg1) * arg3) - var5;
            this.field4304.method7220(var13, var14);
            this.field4304.method7224(var8, var9);
            this.method6186(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5041.length; var15++) {
            if (arg2.field5041[var15] == 0) {
                arg2.field5041[var15] = -16777216;
            } else {
                int var16 = (arg2.field5041[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5041[var15] = -16777216;
                } else {
                    if (var16 > Statics.field4308.length) {
                        var16 = Statics.field4308.length;
                    }
                    int var17 = Statics.field4308[var16 - 1];
                    arg2.field5041[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("mu.j(Lrs;Lrs;Loj;B)V")
    public void method6186(class488 arg0, class488 arg1, class414 arg2) {
        if (arg2.field4626 == 0 || arg2.field4629 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4628 == 0) {
            var4 = arg0.field5034 - arg2.field4626;
        }
        if (arg2.field4627 == 0) {
            var5 = arg0.field5032 - arg2.field4629;
        }
        int var6 = arg0.field5034 * var5 + var4;
        int var7 = arg2.field4627 * arg1.field5034 + arg2.field4628;
        for (int var8 = 0; var8 < arg2.field4629; var8++) {
            for (int var9 = 0; var9 < arg2.field4626; var9++) {
                int var10001 = var7++;
                arg1.field5041[var10001] += arg0.field5041[var6++];
            }
            var6 += arg0.field5034 - arg2.field4626;
            var7 += arg1.field5034 - arg2.field4626;
        }
    }
}
