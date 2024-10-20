package deob;

import java.util.HashMap;

@ObfuscatedName("pi")
public class class400 {

    @ObfuscatedName("pi.ab")
    public final HashMap field4574 = new HashMap();

    @ObfuscatedName("pi.ay")
    public class421 field4575 = new class421(0, 0);

    @ObfuscatedName("pi.an")
    public int[] field4576 = new int[2048];

    @ObfuscatedName("pi.au")
    public int[] field4579 = new int[2048];

    @ObfuscatedName("pi.ax")
    public int field4578 = 0;

    public class400() {
        method5599();
    }

    @ObfuscatedName("mg.ab(I)V")
    public static void method5599() {
        Statics.field1084 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = Statics.method3533((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field1084[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field1084.length) {
            int var6 = var0 * 2;
            int var7 = Statics.method3533((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field1084.length) {
                Statics.field1084[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("pi.ay(II)V")
    public void method6836(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class422.method1033(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class563 var11 = new class563(var6, var2, var2);
        this.field4574.put(arg0, var11);
    }

    @ObfuscatedName("pi.an(IB)Lvc;")
    public class563 method6837(int arg0) {
        if (!this.field4574.containsKey(arg0)) {
            this.method6836(arg0);
        }
        return (class563) this.field4574.get(arg0);
    }

    @ObfuscatedName("pi.au(III)V")
    public final void method6839(int arg0, int arg1) {
        if (this.field4578 < this.field4576.length) {
            this.field4576[this.field4578] = arg0;
            this.field4579[this.field4578] = arg1;
            this.field4578++;
        }
    }

    @ObfuscatedName("pi.ax(I)V")
    public final void method6846() {
        this.field4578 = 0;
    }

    @ObfuscatedName("pi.ao(IILvc;FI)V")
    public final void method6853(int arg0, int arg1, class563 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class563 var6 = this.method6837(var5);
        int var7 = var5 * 2 + 1;
        class421 var8 = new class421(0, 0, arg2.field5478, arg2.field5479);
        class421 var9 = new class421(0, 0);
        this.field4575.method7169(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4578; var10++) {
            int var11 = this.field4576[var10];
            int var12 = this.field4579[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5479 - (float) (var12 - arg1) * arg3) - var5;
            this.field4575.method7142(var13, var14);
            this.field4575.method7146(var8, var9);
            this.method6840(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5481.length; var15++) {
            if (arg2.field5481[var15] == 0) {
                arg2.field5481[var15] = -16777216;
            } else {
                int var16 = (arg2.field5481[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5481[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1084.length) {
                        var16 = Statics.field1084.length;
                    }
                    int var17 = Statics.field1084[var16 - 1];
                    arg2.field5481[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("pi.am(Lvc;Lvc;Lqw;I)V")
    public void method6840(class563 arg0, class563 arg1, class421 arg2) {
        if (arg2.field4661 == 0 || arg2.field4664 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4663 == 0) {
            var4 = arg0.field5478 - arg2.field4661;
        }
        if (arg2.field4662 == 0) {
            var5 = arg0.field5479 - arg2.field4664;
        }
        int var6 = arg0.field5478 * var5 + var4;
        int var7 = arg2.field4662 * arg1.field5478 + arg2.field4663;
        for (int var8 = 0; var8 < arg2.field4664; var8++) {
            for (int var9 = 0; var9 < arg2.field4661; var9++) {
                int var10001 = var7++;
                arg1.field5481[var10001] += arg0.field5481[var6++];
            }
            var6 += arg0.field5478 - arg2.field4661;
            var7 += arg1.field5478 - arg2.field4661;
        }
    }
}
