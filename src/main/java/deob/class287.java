package deob;

import java.util.HashMap;

@ObfuscatedName("ku")
public class class287 {

    @ObfuscatedName("ku.f")
    public final HashMap field3671 = new HashMap();

    @ObfuscatedName("ku.e")
    public class338 field3669 = new class338(0, 0);

    @ObfuscatedName("ku.v")
    public int[] field3665 = new int[2048];

    @ObfuscatedName("ku.y")
    public int[] field3666 = new int[2048];

    @ObfuscatedName("ku.j")
    public int field3664 = 0;

    public class287() {
        Statics.field4146 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = Statics.method1925((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field4146[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field4146.length) {
            int var7 = var1 * 2;
            int var8 = Statics.method1925((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field4146.length) {
                Statics.field4146[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("ku.f(II)V")
    public void method4676(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class339.method3273(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class397 var11 = new class397(var6, var2, var2);
        this.field3671.put(arg0, var11);
    }

    @ObfuscatedName("ku.e(IB)Loa;")
    public class397 method4670(int arg0) {
        if (!this.field3671.containsKey(arg0)) {
            this.method4676(arg0);
        }
        return (class397) this.field3671.get(arg0);
    }

    @ObfuscatedName("ku.v(III)V")
    public final void method4671(int arg0, int arg1) {
        if (this.field3664 < this.field3665.length) {
            this.field3665[this.field3664] = arg0;
            this.field3666[this.field3664] = arg1;
            this.field3664++;
        }
    }

    @ObfuscatedName("ku.y(I)V")
    public final void method4672() {
        this.field3664 = 0;
    }

    @ObfuscatedName("ku.j(IILoa;FB)V")
    public final void method4673(int arg0, int arg1, class397 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class397 var6 = this.method4670(var5);
        int var7 = var5 * 2 + 1;
        class338 var8 = new class338(0, 0, arg2.field4262, arg2.field4254);
        class338 var9 = new class338(0, 0);
        this.field3669.method5334(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3664; var10++) {
            int var11 = this.field3665[var10];
            int var12 = this.field3666[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4254 - (float) (var12 - arg1) * arg3) - var5;
            this.field3669.method5355(var13, var14);
            this.field3669.method5336(var8, var9);
            this.method4669(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4263.length; var15++) {
            if (arg2.field4263[var15] == 0) {
                arg2.field4263[var15] = -16777216;
            } else {
                int var16 = (arg2.field4263[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4263[var15] = -16777216;
                } else {
                    if (var16 > Statics.field4146.length) {
                        var16 = Statics.field4146.length;
                    }
                    int var17 = Statics.field4146[var16 - 1];
                    arg2.field4263[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ku.o(Loa;Loa;Llw;I)V")
    public void method4669(class397 arg0, class397 arg1, class338 arg2) {
        if (arg2.field3907 == 0 || arg2.field3905 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3906 == 0) {
            var4 = arg0.field4262 - arg2.field3907;
        }
        if (arg2.field3908 == 0) {
            var5 = arg0.field4254 - arg2.field3905;
        }
        int var6 = arg0.field4262 * var5 + var4;
        int var7 = arg2.field3908 * arg1.field4262 + arg2.field3906;
        for (int var8 = 0; var8 < arg2.field3905; var8++) {
            for (int var9 = 0; var9 < arg2.field3907; var9++) {
                int var10001 = var7++;
                arg1.field4263[var10001] += arg0.field4263[var6++];
            }
            var6 += arg0.field4262 - arg2.field3907;
            var7 += arg1.field4262 - arg2.field3907;
        }
    }
}
