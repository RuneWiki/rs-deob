package deob;

import java.util.HashMap;

@ObfuscatedName("ir")
public class class252 {

    @ObfuscatedName("ir.w")
    public final HashMap field3241 = new HashMap();

    @ObfuscatedName("ir.m")
    public class311 field3232 = new class311(0, 0);

    @ObfuscatedName("ir.q")
    public int[] field3238 = new int[2048];

    @ObfuscatedName("ir.b")
    public int[] field3233 = new int[2048];

    @ObfuscatedName("ir.f")
    public int field3234 = 0;

    public class252() {
        method2864();
    }

    @ObfuscatedName("ec.w(I)V")
    public static void method2864() {
        Statics.field3230 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class10.method16((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field3230[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field3230.length) {
            int var6 = var0 * 2;
            int var7 = class10.method16((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field3230.length) {
                Statics.field3230[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("ir.m(II)V")
    public void method4401(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            var6[var8] = class312.method3058((double) var7, 0.0D, var3);
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
        class319 var18 = new class319(var13, var2, var2);
        this.field3241.put(arg0, var18);
    }

    @ObfuscatedName("ir.q(IB)Llc;")
    public class319 method4403(int arg0) {
        if (!this.field3241.containsKey(arg0)) {
            this.method4401(arg0);
        }
        return (class319) this.field3241.get(arg0);
    }

    @ObfuscatedName("ir.x(III)V")
    public final void method4411(int arg0, int arg1) {
        if (this.field3234 < this.field3238.length) {
            this.field3238[this.field3234] = arg0;
            this.field3233[this.field3234] = arg1;
            this.field3234++;
        }
    }

    @ObfuscatedName("ir.j(B)V")
    public final void method4408() {
        this.field3234 = 0;
    }

    @ObfuscatedName("ir.a(IILlc;FI)V")
    public final void method4404(int arg0, int arg1, class319 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class319 var6 = this.method4403(var5);
        int var7 = var5 * 2 + 1;
        class311 var8 = new class311(0, 0, arg2.field3795, arg2.field3802);
        class311 var9 = new class311(0, 0);
        this.field3232.method5294(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field3234; var10++) {
            int var11 = this.field3238[var10];
            int var12 = this.field3233[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field3802 - (float) (var12 - arg1) * arg3) - var5;
            this.field3232.method5295(var13, var14);
            this.field3232.method5307(var8, var9);
            this.method4405(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field3799.length; var15++) {
            if (arg2.field3799[var15] == 0) {
                arg2.field3799[var15] = -16777216;
            } else {
                int var16 = (arg2.field3799[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field3799[var15] = -16777216;
                } else {
                    if (var16 > Statics.field3230.length) {
                        var16 = Statics.field3230.length;
                    }
                    int var17 = Statics.field3230[var16 - 1];
                    arg2.field3799[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ir.l(Llc;Llc;Lka;I)V")
    public void method4405(class319 arg0, class319 arg1, class311 arg2) {
        if (arg2.field3751 == 0 || arg2.field3752 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field3753 == 0) {
            var4 = arg0.field3795 - arg2.field3751;
        }
        if (arg2.field3750 == 0) {
            var5 = arg0.field3802 - arg2.field3752;
        }
        int var6 = arg0.field3795 * var5 + var4;
        int var7 = arg2.field3750 * arg1.field3795 + arg2.field3753;
        for (int var8 = 0; var8 < arg2.field3752; var8++) {
            for (int var9 = 0; var9 < arg2.field3751; var9++) {
                int var10001 = var7++;
                arg1.field3799[var10001] += arg0.field3799[var6++];
            }
            var6 += arg0.field3795 - arg2.field3751;
            var7 += arg1.field3795 - arg2.field3751;
        }
    }
}
