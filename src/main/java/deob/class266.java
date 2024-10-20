package deob;

import java.util.HashMap;

@ObfuscatedName("jo")
public class class266 {

    @ObfuscatedName("jo.t")
    public final HashMap field3435 = new HashMap();

    @ObfuscatedName("jo.q")
    public class324 field3433 = new class324(0, 0);

    @ObfuscatedName("jo.i")
    public int[] field3434 = new int[2048];

    @ObfuscatedName("jo.a")
    public int[] field3432 = new int[2048];

    @ObfuscatedName("jo.l")
    public int field3436 = 0;

    public class266() {
        Statics.field3437 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class22.method50((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field3437[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field3437.length) {
            int var7 = var1 * 2;
            int var8 = class22.method50((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field3437.length) {
                Statics.field3437[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("jo.t(II)V")
    public void method4350(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class325.method3540(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class332 var11 = new class332(var6, var2, var2);
        this.field3435.put(arg0, var11);
    }

    @ObfuscatedName("jo.q(II)Lla;")
    public class332 method4340(int arg0) {
        if (!this.field3435.containsKey(arg0)) {
            this.method4350(arg0);
        }
        return (class332) this.field3435.get(arg0);
    }

    @ObfuscatedName("jo.i(IIB)V")
    public final void method4355(int arg0, int arg1) {
        if (this.field3436 < this.field3434.length) {
            this.field3434[this.field3436] = arg0;
            this.field3432[this.field3436] = arg1;
            this.field3436++;
        }
    }

    @ObfuscatedName("jo.a(I)V")
    public final void method4342() {
        this.field3436 = 0;
    }

    @ObfuscatedName("jo.l(IILla;FI)V")
    public final void method4343(int arg0, int arg1, class332 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class332 var6 = this.method4340(var5);
        int var7 = var5 * 2 + 1;
        class324 var8 = new class324(0, 0, arg2.field3984, arg2.field3985);
        class324 var9 = new class324(0, 0);
        this.field3433.method5237(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3436; var10++) {
            int var11 = this.field3434[var10];
            int var12 = this.field3432[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3985 - (float) (var12 - arg1) * arg3) - var5;
            this.field3433.method5246(var13, var14);
            this.field3433.method5233(var8, var9);
            this.method4344(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3986.length; var15++) {
            if (arg2.field3986[var15] == 0) {
                arg2.field3986[var15] = -16777216;
            } else {
                int var16 = (arg2.field3986[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3986[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3437.length) {
                        var16 = Statics.field3437.length;
                    }
                    int var17 = Statics.field3437[var16 - 1];
                    arg2.field3986[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("jo.b(Lla;Lla;Llb;B)V")
    public void method4344(class332 arg0, class332 arg1, class324 arg2) {
        if (arg2.field3944 == 0 || arg2.field3945 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3942 == 0) {
            var4 = arg0.field3984 - arg2.field3944;
        }
        if (arg2.field3943 == 0) {
            var5 = arg0.field3985 - arg2.field3945;
        }
        int var6 = arg0.field3984 * var5 + var4;
        int var7 = arg2.field3943 * arg1.field3984 + arg2.field3942;
        for (int var8 = 0; var8 < arg2.field3945; var8++) {
            for (int var9 = 0; var9 < arg2.field3944; var9++) {
                int var10001 = var7++;
                arg1.field3986[var10001] += arg0.field3986[var6++];
            }
            var6 += arg0.field3984 - arg2.field3944;
            var7 += arg1.field3984 - arg2.field3944;
        }
    }
}
