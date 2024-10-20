package deob;

import java.util.HashMap;

@ObfuscatedName("ll")
public class class326 {

    @ObfuscatedName("ll.c")
    public final HashMap field4078 = new HashMap();

    @ObfuscatedName("ll.v")
    public class384 field4074 = new class384(0, 0);

    @ObfuscatedName("ll.q")
    public int[] field4076 = new int[2048];

    @ObfuscatedName("ll.f")
    public int[] field4075 = new int[2048];

    @ObfuscatedName("ll.j")
    public int field4077 = 0;

    public class326() {
        Statics.field4153 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class230.method3291((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field4153[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field4153.length) {
            int var7 = var1 * 2;
            int var8 = class230.method3291((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field4153.length) {
                Statics.field4153[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("ll.c(II)V")
    public void method5476(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class385.method4652(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class456 var11 = new class456(var6, var2, var2);
        this.field4078.put(arg0, var11);
    }

    @ObfuscatedName("ll.v(IB)Lqe;")
    public class456 method5477(int arg0) {
        if (!this.field4078.containsKey(arg0)) {
            this.method5476(arg0);
        }
        return (class456) this.field4078.get(arg0);
    }

    @ObfuscatedName("ll.q(III)V")
    public final void method5491(int arg0, int arg1) {
        if (this.field4077 < this.field4076.length) {
            this.field4076[this.field4077] = arg0;
            this.field4075[this.field4077] = arg1;
            this.field4077++;
        }
    }

    @ObfuscatedName("ll.f(I)V")
    public final void method5478() {
        this.field4077 = 0;
    }

    @ObfuscatedName("ll.j(IILqe;FI)V")
    public final void method5489(int arg0, int arg1, class456 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class456 var6 = this.method5477(var5);
        int var7 = var5 * 2 + 1;
        class384 var8 = new class384(0, 0, arg2.field4796, arg2.field4795);
        class384 var9 = new class384(0, 0);
        this.field4074.method6265(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4077; var10++) {
            int var11 = this.field4076[var10];
            int var12 = this.field4075[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4795 - (float) (var12 - arg1) * arg3) - var5;
            this.field4074.method6264(var13, var14);
            this.field4074.method6267(var8, var9);
            this.method5480(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4804.length; var15++) {
            if (arg2.field4804[var15] == 0) {
                arg2.field4804[var15] = -16777216;
            } else {
                int var16 = (arg2.field4804[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4804[var15] = -16777216;
                } else {
                    if (var16 > Statics.field4153.length) {
                        var16 = Statics.field4153.length;
                    }
                    int var17 = Statics.field4153[var16 - 1];
                    arg2.field4804[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("ll.e(Lqe;Lqe;Lns;I)V")
    public void method5480(class456 arg0, class456 arg1, class384 arg2) {
        if (arg2.field4380 == 0 || arg2.field4381 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4382 == 0) {
            var4 = arg0.field4796 - arg2.field4380;
        }
        if (arg2.field4379 == 0) {
            var5 = arg0.field4795 - arg2.field4381;
        }
        int var6 = arg0.field4796 * var5 + var4;
        int var7 = arg2.field4379 * arg1.field4796 + arg2.field4382;
        for (int var8 = 0; var8 < arg2.field4381; var8++) {
            for (int var9 = 0; var9 < arg2.field4380; var9++) {
                int var10001 = var7++;
                arg1.field4804[var10001] += arg0.field4804[var6++];
            }
            var6 += arg0.field4796 - arg2.field4380;
            var7 += arg1.field4796 - arg2.field4380;
        }
    }
}
