package deob;

import java.util.HashMap;

@ObfuscatedName("oc")
public class class368 {

    @ObfuscatedName("oc.at")
    public final HashMap field4330 = new HashMap();

    @ObfuscatedName("oc.an")
    public class434 field4326 = new class434(0, 0);

    @ObfuscatedName("oc.av")
    public int[] field4325 = new int[2048];

    @ObfuscatedName("oc.as")
    public int[] field4327 = new int[2048];

    @ObfuscatedName("oc.ax")
    public int field4329 = 0;

    public class368() {
        Statics.field4328 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class261.method1067((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field4328[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field4328.length) {
            int var7 = var1 * 2;
            int var8 = class261.method1067((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field4328.length) {
                Statics.field4328[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("oc.at(II)V")
    public void method6251(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class435.method4554(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class515 var11 = new class515(var6, var2, var2);
        this.field4330.put(arg0, var11);
    }

    @ObfuscatedName("oc.an(IB)Ltm;")
    public class515 method6263(int arg0) {
        if (!this.field4330.containsKey(arg0)) {
            this.method6251(arg0);
        }
        return (class515) this.field4330.get(arg0);
    }

    @ObfuscatedName("oc.av(III)V")
    public final void method6250(int arg0, int arg1) {
        if (this.field4329 < this.field4325.length) {
            this.field4325[this.field4329] = arg0;
            this.field4327[this.field4329] = arg1;
            this.field4329++;
        }
    }

    @ObfuscatedName("oc.as(I)V")
    public final void method6261() {
        this.field4329 = 0;
    }

    @ObfuscatedName("oc.ax(IILtm;FI)V")
    public final void method6252(int arg0, int arg1, class515 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class515 var6 = this.method6263(var5);
        int var7 = var5 * 2 + 1;
        class434 var8 = new class434(0, 0, arg2.field5115, arg2.field5120);
        class434 var9 = new class434(0, 0);
        this.field4326.method7351(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4329; var10++) {
            int var11 = this.field4325[var10];
            int var12 = this.field4327[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5120 - (float) (var12 - arg1) * arg3) - var5;
            this.field4326.method7329(var13, var14);
            this.field4326.method7333(var8, var9);
            this.method6249(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5123.length; var15++) {
            if (arg2.field5123[var15] == 0) {
                arg2.field5123[var15] = -16777216;
            } else {
                int var16 = (arg2.field5123[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5123[var15] = -16777216;
                } else {
                    if (var16 > Statics.field4328.length) {
                        var16 = Statics.field4328.length;
                    }
                    int var17 = Statics.field4328[var16 - 1];
                    arg2.field5123[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("oc.ap(Ltm;Ltm;Lqs;S)V")
    public void method6249(class515 arg0, class515 arg1, class434 arg2) {
        if (arg2.field4667 == 0 || arg2.field4665 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4668 == 0) {
            var4 = arg0.field5115 - arg2.field4667;
        }
        if (arg2.field4666 == 0) {
            var5 = arg0.field5120 - arg2.field4665;
        }
        int var6 = arg0.field5115 * var5 + var4;
        int var7 = arg2.field4666 * arg1.field5115 + arg2.field4668;
        for (int var8 = 0; var8 < arg2.field4665; var8++) {
            for (int var9 = 0; var9 < arg2.field4667; var9++) {
                int var10001 = var7++;
                arg1.field5123[var10001] += arg0.field5123[var6++];
            }
            var6 += arg0.field5115 - arg2.field4667;
            var7 += arg1.field5115 - arg2.field4667;
        }
    }
}
