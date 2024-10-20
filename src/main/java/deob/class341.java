package deob;

import java.util.HashMap;

@ObfuscatedName("mj")
public class class341 {

    @ObfuscatedName("mj.a")
    public final HashMap field4223 = new HashMap();

    @ObfuscatedName("mj.f")
    public class404 field4224 = new class404(0, 0);

    @ObfuscatedName("mj.c")
    public int[] field4225 = new int[2048];

    @ObfuscatedName("mj.x")
    public int[] field4226 = new int[2048];

    @ObfuscatedName("mj.h")
    public int field4227 = 0;

    public class341() {
        method2531();
    }

    @ObfuscatedName("df.a(B)V")
    public static void method2531() {
        Statics.field1863 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class240.method67((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field1863[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field1863.length) {
            int var6 = var0 * 2;
            int var7 = class240.method67((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field1863.length) {
                Statics.field1863[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("mj.f(II)V")
    public void method5961(int arg0) {
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
        class477 var26 = new class477(var21, var2, var2);
        this.field4223.put(arg0, var26);
    }

    @ObfuscatedName("mj.c(II)Lri;")
    public class477 method5966(int arg0) {
        if (!this.field4223.containsKey(arg0)) {
            this.method5961(arg0);
        }
        return (class477) this.field4223.get(arg0);
    }

    @ObfuscatedName("mj.x(III)V")
    public final void method5963(int arg0, int arg1) {
        if (this.field4227 < this.field4225.length) {
            this.field4225[this.field4227] = arg0;
            this.field4226[this.field4227] = arg1;
            this.field4227++;
        }
    }

    @ObfuscatedName("mj.h(B)V")
    public final void method5964() {
        this.field4227 = 0;
    }

    @ObfuscatedName("mj.j(IILri;FI)V")
    public final void method5965(int arg0, int arg1, class477 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class477 var6 = this.method5966(var5);
        int var7 = var5 * 2 + 1;
        class404 var8 = new class404(0, 0, arg2.field4966, arg2.field4958);
        class404 var9 = new class404(0, 0);
        this.field4224.method6933(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4227; var10++) {
            int var11 = this.field4225[var10];
            int var12 = this.field4226[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4958 - (float) (var12 - arg1) * arg3) - var5;
            this.field4224.method6932(var13, var14);
            this.field4224.method6935(var8, var9);
            this.method5973(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4959.length; var15++) {
            if (arg2.field4959[var15] == 0) {
                arg2.field4959[var15] = -16777216;
            } else {
                int var16 = (arg2.field4959[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4959[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1863.length) {
                        var16 = Statics.field1863.length;
                    }
                    int var17 = Statics.field1863[var16 - 1];
                    arg2.field4959[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("mj.y(Lri;Lri;Loq;B)V")
    public void method5973(class477 arg0, class477 arg1, class404 arg2) {
        if (arg2.field4549 == 0 || arg2.field4546 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4547 == 0) {
            var4 = arg0.field4966 - arg2.field4549;
        }
        if (arg2.field4548 == 0) {
            var5 = arg0.field4958 - arg2.field4546;
        }
        int var6 = arg0.field4966 * var5 + var4;
        int var7 = arg2.field4548 * arg1.field4966 + arg2.field4547;
        for (int var8 = 0; var8 < arg2.field4546; var8++) {
            for (int var9 = 0; var9 < arg2.field4549; var9++) {
                int var10001 = var7++;
                arg1.field4959[var10001] += arg0.field4959[var6++];
            }
            var6 += arg0.field4966 - arg2.field4549;
            var7 += arg1.field4966 - arg2.field4549;
        }
    }
}
