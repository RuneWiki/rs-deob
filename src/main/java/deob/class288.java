package deob;

import java.util.HashMap;

@ObfuscatedName("ki")
public class class288 {

    @ObfuscatedName("ki.s")
    public final HashMap field3670 = new HashMap();

    @ObfuscatedName("ki.t")
    public class337 field3666 = new class337(0, 0);

    @ObfuscatedName("ki.v")
    public int[] field3667 = new int[2048];

    @ObfuscatedName("ki.j")
    public int[] field3671 = new int[2048];

    @ObfuscatedName("ki.l")
    public int field3669 = 0;

    public class288() {
        Statics.field376 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class173.method2275((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field376[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field376.length) {
            int var7 = var1 * 2;
            int var8 = class173.method2275((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field376.length) {
                Statics.field376[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("ki.s(II)V")
    public void method4640(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            double var11 = (double) (var7) / var3;
            double var13 = Math.exp(-var11 * var11 / 2.0D) / Math.sqrt(6.283185307179586D);
            double var15 = var13 / var3;
            var6[var8] = var15;
            var7++;
            var8++;
        }
        double[] var18 = var6;
        double var19 = var6[arg0] * var6[arg0];
        int[] var21 = new int[var2 * var2];
        boolean var22 = false;
        for (int var23 = 0; var23 < var2; var23++) {
            for (int var24 = 0; var24 < var2; var24++) {
                int var25 = var21[var2 * var23 + var24] = (int) (var18[var23] * var18[var24] / var19 * 256.0D);
                if (!var22 && var25 > 0) {
                    var22 = true;
                }
            }
        }
        class398 var26 = new class398(var21, var2, var2);
        this.field3670.put(arg0, var26);
    }

    @ObfuscatedName("ki.t(IB)Lom;")
    public class398 method4634(int arg0) {
        if (!this.field3670.containsKey(arg0)) {
            this.method4640(arg0);
        }
        return (class398) this.field3670.get(arg0);
    }

    @ObfuscatedName("ki.v(III)V")
    public final void method4635(int arg0, int arg1) {
        if (this.field3669 < this.field3667.length) {
            this.field3667[this.field3669] = arg0;
            this.field3671[this.field3669] = arg1;
            this.field3669++;
        }
    }

    @ObfuscatedName("ki.j(B)V")
    public final void method4636() {
        this.field3669 = 0;
    }

    @ObfuscatedName("ki.l(IILom;FS)V")
    public final void method4637(int arg0, int arg1, class398 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class398 var6 = this.method4634(var5);
        int var7 = var5 * 2 + 1;
        class337 var8 = new class337(0, 0, arg2.field4270, arg2.field4271);
        class337 var9 = new class337(0, 0);
        this.field3666.method5375(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3669; var10++) {
            int var11 = this.field3667[var10];
            int var12 = this.field3671[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4271 - (float) (var12 - arg1) * arg3) - var5;
            this.field3666.method5374(var13, var14);
            this.field3666.method5376(var8, var9);
            this.method4652(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4280.length; var15++) {
            if (arg2.field4280[var15] == 0) {
                arg2.field4280[var15] = -16777216;
            } else {
                int var16 = (arg2.field4280[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4280[var15] = -16777216;
                } else {
                    if (var16 > Statics.field376.length) {
                        var16 = Statics.field376.length;
                    }
                    int var17 = Statics.field376[var16 - 1];
                    arg2.field4280[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ki.n(Lom;Lom;Llo;B)V")
    public void method4652(class398 arg0, class398 arg1, class337 arg2) {
        if (arg2.field3923 == 0 || arg2.field3921 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3925 == 0) {
            var4 = arg0.field4270 - arg2.field3923;
        }
        if (arg2.field3922 == 0) {
            var5 = arg0.field4271 - arg2.field3921;
        }
        int var6 = arg0.field4270 * var5 + var4;
        int var7 = arg2.field3922 * arg1.field4270 + arg2.field3925;
        for (int var8 = 0; var8 < arg2.field3921; var8++) {
            for (int var9 = 0; var9 < arg2.field3923; var9++) {
                int var10001 = var7++;
                arg1.field4280[var10001] += arg0.field4280[var6++];
            }
            var6 += arg0.field4270 - arg2.field3923;
            var7 += arg1.field4270 - arg2.field3923;
        }
    }
}
