package deob;

import java.util.HashMap;

@ObfuscatedName("oq")
public class class389 {

    @ObfuscatedName("oq.aq")
    public final HashMap field4469 = new HashMap();

    @ObfuscatedName("oq.aw")
    public class465 field4470 = new class465(0, 0);

    @ObfuscatedName("oq.al")
    public int[] field4474 = new int[2048];

    @ObfuscatedName("oq.ai")
    public int[] field4471 = new int[2048];

    @ObfuscatedName("oq.ar")
    public int field4473 = 0;

    public class389() {
        Statics.field1458 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class247.method2623((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field1458[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field1458.length) {
            int var7 = var1 * 2;
            int var8 = class247.method2623((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field1458.length) {
                Statics.field1458[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("oq.aq(IB)V")
    public void method6640(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class466.method5302(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class548 var11 = new class548(var6, var2, var2);
        this.field4469.put(arg0, var11);
    }

    @ObfuscatedName("oq.aw(II)Lvd;")
    public class548 method6630(int arg0) {
        if (!this.field4469.containsKey(arg0)) {
            this.method6640(arg0);
        }
        return (class548) this.field4469.get(arg0);
    }

    @ObfuscatedName("oq.al(IIB)V")
    public final void method6622(int arg0, int arg1) {
        if (this.field4473 < this.field4474.length) {
            this.field4474[this.field4473] = arg0;
            this.field4471[this.field4473] = arg1;
            this.field4473++;
        }
    }

    @ObfuscatedName("oq.ai(I)V")
    public final void method6624() {
        this.field4473 = 0;
    }

    @ObfuscatedName("oq.ar(IILvd;FB)V")
    public final void method6625(int arg0, int arg1, class548 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class548 var6 = this.method6630(var5);
        int var7 = var5 * 2 + 1;
        class465 var8 = new class465(0, 0, arg2.field5304, arg2.field5298);
        class465 var9 = new class465(0, 0);
        this.field4470.method7744(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4473; var10++) {
            int var11 = this.field4474[var10];
            int var12 = this.field4471[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5298 - (float) (var12 - arg1) * arg3) - var5;
            this.field4470.method7747(var13, var14);
            this.field4470.method7743(var8, var9);
            this.method6626(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5296.length; var15++) {
            if (arg2.field5296[var15] == 0) {
                arg2.field5296[var15] = -16777216;
            } else {
                int var16 = (arg2.field5296[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5296[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1458.length) {
                        var16 = Statics.field1458.length;
                    }
                    int var17 = Statics.field1458[var16 - 1];
                    arg2.field5296[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("oq.as(Lvd;Lvd;Lrc;I)V")
    public void method6626(class548 arg0, class548 arg1, class465 arg2) {
        if (arg2.field4826 == 0 || arg2.field4824 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4827 == 0) {
            var4 = arg0.field5304 - arg2.field4826;
        }
        if (arg2.field4825 == 0) {
            var5 = arg0.field5298 - arg2.field4824;
        }
        int var6 = arg0.field5304 * var5 + var4;
        int var7 = arg2.field4825 * arg1.field5304 + arg2.field4827;
        for (int var8 = 0; var8 < arg2.field4824; var8++) {
            for (int var9 = 0; var9 < arg2.field4826; var9++) {
                int var10001 = var7++;
                arg1.field5296[var10001] += arg0.field5296[var6++];
            }
            var6 += arg0.field5304 - arg2.field4826;
            var7 += arg1.field5304 - arg2.field4826;
        }
    }
}
