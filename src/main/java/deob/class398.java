package deob;

import java.util.HashMap;

@ObfuscatedName("pr")
public class class398 {

    @ObfuscatedName("pr.ak")
    public final HashMap field4586 = new HashMap();

    @ObfuscatedName("pr.al")
    public class419 field4580 = new class419(0, 0);

    @ObfuscatedName("pr.aj")
    public int[] field4581 = new int[2048];

    @ObfuscatedName("pr.az")
    public int[] field4582 = new int[2048];

    @ObfuscatedName("pr.af")
    public int field4583 = 0;

    public class398() {
        Statics.field1723 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class286.method6453((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field1723[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field1723.length) {
            int var7 = var1 * 2;
            int var8 = class286.method6453((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field1723.length) {
                Statics.field1723[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("pr.ak(II)V")
    public void method6780(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class420.method2201(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class560 var11 = new class560(var6, var2, var2);
        this.field4586.put(arg0, var11);
    }

    @ObfuscatedName("pr.al(II)Lvc;")
    public class560 method6777(int arg0) {
        if (!this.field4586.containsKey(arg0)) {
            this.method6780(arg0);
        }
        return (class560) this.field4586.get(arg0);
    }

    @ObfuscatedName("pr.aj(III)V")
    public final void method6778(int arg0, int arg1) {
        if (this.field4583 < this.field4581.length) {
            this.field4581[this.field4583] = arg0;
            this.field4582[this.field4583] = arg1;
            this.field4583++;
        }
    }

    @ObfuscatedName("pr.az(B)V")
    public final void method6791() {
        this.field4583 = 0;
    }

    @ObfuscatedName("pr.af(IILvc;FI)V")
    public final void method6788(int arg0, int arg1, class560 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class560 var6 = this.method6777(var5);
        int var7 = var5 * 2 + 1;
        class419 var8 = new class419(0, 0, arg2.field5441, arg2.field5442);
        class419 var9 = new class419(0, 0);
        this.field4580.method7089(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4583; var10++) {
            int var11 = this.field4581[var10];
            int var12 = this.field4582[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5442 - (float) (var12 - arg1) * arg3) - var5;
            this.field4580.method7088(var13, var14);
            this.field4580.method7091(var8, var9);
            this.method6781(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5445.length; var15++) {
            if (arg2.field5445[var15] == 0) {
                arg2.field5445[var15] = -16777216;
            } else {
                int var16 = (arg2.field5445[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5445[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1723.length) {
                        var16 = Statics.field1723.length;
                    }
                    int var17 = Statics.field1723[var16 - 1];
                    arg2.field5445[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("pr.aa(Lvc;Lvc;Lqi;I)V")
    public void method6781(class560 arg0, class560 arg1, class419 arg2) {
        if (arg2.field4673 == 0 || arg2.field4671 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4674 == 0) {
            var4 = arg0.field5441 - arg2.field4673;
        }
        if (arg2.field4672 == 0) {
            var5 = arg0.field5442 - arg2.field4671;
        }
        int var6 = arg0.field5441 * var5 + var4;
        int var7 = arg2.field4672 * arg1.field5441 + arg2.field4674;
        for (int var8 = 0; var8 < arg2.field4671; var8++) {
            for (int var9 = 0; var9 < arg2.field4673; var9++) {
                int var10001 = var7++;
                arg1.field5445[var10001] += arg0.field5445[var6++];
            }
            var6 += arg0.field5441 - arg2.field4673;
            var7 += arg1.field5441 - arg2.field4673;
        }
    }
}
