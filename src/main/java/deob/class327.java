package deob;

import java.util.HashMap;

@ObfuscatedName("le")
public class class327 {

    @ObfuscatedName("le.s")
    public final HashMap field4083 = new HashMap();

    @ObfuscatedName("le.h")
    public class385 field4080 = new class385(0, 0);

    @ObfuscatedName("le.w")
    public int[] field4081 = new int[2048];

    @ObfuscatedName("le.v")
    public int[] field4082 = new int[2048];

    @ObfuscatedName("le.c")
    public int field4086 = 0;

    public class327() {
        Statics.field4085 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class230.method661((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field4085[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field4085.length) {
            int var7 = var1 * 2;
            int var8 = class230.method661((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field4085.length) {
                Statics.field4085[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("le.s(IS)V")
    public void method5392(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class386.method3889(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class457 var11 = new class457(var6, var2, var2);
        this.field4083.put(arg0, var11);
    }

    @ObfuscatedName("le.h(IS)Lqn;")
    public class457 method5378(int arg0) {
        if (!this.field4083.containsKey(arg0)) {
            this.method5392(arg0);
        }
        return (class457) this.field4083.get(arg0);
    }

    @ObfuscatedName("le.w(III)V")
    public final void method5380(int arg0, int arg1) {
        if (this.field4086 < this.field4081.length) {
            this.field4081[this.field4086] = arg0;
            this.field4082[this.field4086] = arg1;
            this.field4086++;
        }
    }

    @ObfuscatedName("le.v(B)V")
    public final void method5393() {
        this.field4086 = 0;
    }

    @ObfuscatedName("le.c(IILqn;FI)V")
    public final void method5381(int arg0, int arg1, class457 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class457 var6 = this.method5378(var5);
        int var7 = var5 * 2 + 1;
        class385 var8 = new class385(0, 0, arg2.field4799, arg2.field4797);
        class385 var9 = new class385(0, 0);
        this.field4080.method6198(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4086; var10++) {
            int var11 = this.field4081[var10];
            int var12 = this.field4082[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4797 - (float) (var12 - arg1) * arg3) - var5;
            this.field4080.method6186(var13, var14);
            this.field4080.method6188(var8, var9);
            this.method5383(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4803.length; var15++) {
            if (arg2.field4803[var15] == 0) {
                arg2.field4803[var15] = -16777216;
            } else {
                int var16 = (arg2.field4803[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4803[var15] = -16777216;
                } else {
                    if (var16 > Statics.field4085.length) {
                        var16 = Statics.field4085.length;
                    }
                    int var17 = Statics.field4085[var16 - 1];
                    arg2.field4803[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("le.q(Lqn;Lqn;Lnh;I)V")
    public void method5383(class457 arg0, class457 arg1, class385 arg2) {
        if (arg2.field4382 == 0 || arg2.field4381 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4378 == 0) {
            var4 = arg0.field4799 - arg2.field4382;
        }
        if (arg2.field4379 == 0) {
            var5 = arg0.field4797 - arg2.field4381;
        }
        int var6 = arg0.field4799 * var5 + var4;
        int var7 = arg2.field4379 * arg1.field4799 + arg2.field4378;
        for (int var8 = 0; var8 < arg2.field4381; var8++) {
            for (int var9 = 0; var9 < arg2.field4382; var9++) {
                int var10001 = var7++;
                arg1.field4803[var10001] += arg0.field4803[var6++];
            }
            var6 += arg0.field4799 - arg2.field4382;
            var7 += arg1.field4799 - arg2.field4382;
        }
    }
}
