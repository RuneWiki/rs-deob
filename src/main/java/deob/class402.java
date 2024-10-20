package deob;

import java.util.HashMap;

@ObfuscatedName("pn")
public class class402 {

    @ObfuscatedName("pn.ac")
    public final HashMap field4633 = new HashMap();

    @ObfuscatedName("pn.ae")
    public class423 field4630 = new class423(0, 0);

    @ObfuscatedName("pn.ag")
    public int[] field4632 = new int[2048];

    @ObfuscatedName("pn.am")
    public int[] field4629 = new int[2048];

    @ObfuscatedName("pn.ax")
    public int field4631 = 0;

    public class402() {
        method3408();
    }

    @ObfuscatedName("gc.ac(I)V")
    public static void method3408() {
        Statics.field2921 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class291.method870((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field2921[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field2921.length) {
            int var6 = var0 * 2;
            int var7 = class291.method870((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field2921.length) {
                Statics.field2921[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("pn.ae(IB)V")
    public void method6969(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class424.method1125(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class565 var11 = new class565(var6, var2, var2);
        this.field4633.put(arg0, var11);
    }

    @ObfuscatedName("pn.ag(IB)Lvv;")
    public class565 method6976(int arg0) {
        if (!this.field4633.containsKey(arg0)) {
            this.method6969(arg0);
        }
        return (class565) this.field4633.get(arg0);
    }

    @ObfuscatedName("pn.am(IIB)V")
    public final void method6971(int arg0, int arg1) {
        if (this.field4631 < this.field4632.length) {
            this.field4632[this.field4631] = arg0;
            this.field4629[this.field4631] = arg1;
            this.field4631++;
        }
    }

    @ObfuscatedName("pn.ax(I)V")
    public final void method6972() {
        this.field4631 = 0;
    }

    @ObfuscatedName("pn.aq(IILvv;FI)V")
    public final void method6983(int arg0, int arg1, class565 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class565 var6 = this.method6976(var5);
        int var7 = var5 * 2 + 1;
        class423 var8 = new class423(0, 0, arg2.field5518, arg2.field5511);
        class423 var9 = new class423(0, 0);
        this.field4630.method7264(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4631; var10++) {
            int var11 = this.field4632[var10];
            int var12 = this.field4629[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5511 - (float) (var12 - arg1) * arg3) - var5;
            this.field4630.method7269(var13, var14);
            this.field4630.method7266(var8, var9);
            this.method6982(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5513.length; var15++) {
            if (arg2.field5513[var15] == 0) {
                arg2.field5513[var15] = -16777216;
            } else {
                int var16 = (arg2.field5513[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5513[var15] = -16777216;
                } else {
                    if (var16 > Statics.field2921.length) {
                        var16 = Statics.field2921.length;
                    }
                    int var17 = Statics.field2921[var16 - 1];
                    arg2.field5513[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("pn.af(Lvv;Lvv;Lqy;I)V")
    public void method6982(class565 arg0, class565 arg1, class423 arg2) {
        if (arg2.field4711 == 0 || arg2.field4713 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4715 == 0) {
            var4 = arg0.field5518 - arg2.field4711;
        }
        if (arg2.field4710 == 0) {
            var5 = arg0.field5511 - arg2.field4713;
        }
        int var6 = arg0.field5518 * var5 + var4;
        int var7 = arg2.field4710 * arg1.field5518 + arg2.field4715;
        for (int var8 = 0; var8 < arg2.field4713; var8++) {
            for (int var9 = 0; var9 < arg2.field4711; var9++) {
                int var10001 = var7++;
                arg1.field5513[var10001] += arg0.field5513[var6++];
            }
            var6 += arg0.field5518 - arg2.field4711;
            var7 += arg1.field5518 - arg2.field4711;
        }
    }
}
