package deob;

import java.util.HashMap;

@ObfuscatedName("oj")
public class class386 {

    @ObfuscatedName("oj.am")
    public final HashMap field4435 = new HashMap();

    @ObfuscatedName("oj.ap")
    public class462 field4434 = new class462(0, 0);

    @ObfuscatedName("oj.af")
    public int[] field4436 = new int[2048];

    @ObfuscatedName("oj.aj")
    public int[] field4437 = new int[2048];

    @ObfuscatedName("oj.aq")
    public int field4438 = 0;

    public class386() {
        Statics.method4578();
    }

    @ObfuscatedName("oj.ap(II)V")
    public void method6619(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            double var11 = class463.method4819((double) (var7) / var3) / var3;
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
        class545 var22 = new class545(var17, var2, var2);
        this.field4435.put(arg0, var22);
    }

    @ObfuscatedName("oj.af(II)Luc;")
    public class545 method6607(int arg0) {
        if (!this.field4435.containsKey(arg0)) {
            this.method6619(arg0);
        }
        return (class545) this.field4435.get(arg0);
    }

    @ObfuscatedName("oj.aj(III)V")
    public final void method6608(int arg0, int arg1) {
        if (this.field4438 < this.field4436.length) {
            this.field4436[this.field4438] = arg0;
            this.field4437[this.field4438] = arg1;
            this.field4438++;
        }
    }

    @ObfuscatedName("oj.aq(B)V")
    public final void method6620() {
        this.field4438 = 0;
    }

    @ObfuscatedName("oj.ar(IILuc;FB)V")
    public final void method6610(int arg0, int arg1, class545 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class545 var6 = this.method6607(var5);
        int var7 = var5 * 2 + 1;
        class462 var8 = new class462(0, 0, arg2.field5276, arg2.field5277);
        class462 var9 = new class462(0, 0);
        this.field4434.method7735(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4438; var10++) {
            int var11 = this.field4436[var10];
            int var12 = this.field4437[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5277 - (float) (var12 - arg1) * arg3) - var5;
            this.field4434.method7754(var13, var14);
            this.field4434.method7740(var8, var9);
            this.method6611(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5281.length; var15++) {
            if (arg2.field5281[var15] == 0) {
                arg2.field5281[var15] = -16777216;
            } else {
                int var16 = (arg2.field5281[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5281[var15] = -16777216;
                } else {
                    if (var16 > Statics.field2296.length) {
                        var16 = Statics.field2296.length;
                    }
                    int var17 = Statics.field2296[var16 - 1];
                    arg2.field5281[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("oj.ag(Luc;Luc;Lry;B)V")
    public void method6611(class545 arg0, class545 arg1, class462 arg2) {
        if (arg2.field4791 == 0 || arg2.field4792 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4789 == 0) {
            var4 = arg0.field5276 - arg2.field4791;
        }
        if (arg2.field4790 == 0) {
            var5 = arg0.field5277 - arg2.field4792;
        }
        int var6 = arg0.field5276 * var5 + var4;
        int var7 = arg2.field4790 * arg1.field5276 + arg2.field4789;
        for (int var8 = 0; var8 < arg2.field4792; var8++) {
            for (int var9 = 0; var9 < arg2.field4791; var9++) {
                int var10001 = var7++;
                arg1.field5281[var10001] += arg0.field5281[var6++];
            }
            var6 += arg0.field5276 - arg2.field4791;
            var7 += arg1.field5276 - arg2.field4791;
        }
    }
}
