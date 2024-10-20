package deob;

import java.util.HashMap;

@ObfuscatedName("oq")
public class class371 {

    @ObfuscatedName("oq.aw")
    public final HashMap field4364 = new HashMap();

    @ObfuscatedName("oq.ay")
    public class447 field4362 = new class447(0, 0);

    @ObfuscatedName("oq.ar")
    public int[] field4361 = new int[2048];

    @ObfuscatedName("oq.am")
    public int[] field4367 = new int[2048];

    @ObfuscatedName("oq.as")
    public int field4363 = 0;

    public class371() {
        Statics.field2805 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class263.method6110((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field2805[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field2805.length) {
            int var7 = var1 * 2;
            int var8 = class263.method6110((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field2805.length) {
                Statics.field2805[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("oq.aw(IB)V")
    public void method6318(int arg0) {
        int var2 = arg0 * 2 + 1;
        double var3 = (double) ((float) arg0 / 3.0F);
        int var5 = arg0 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg0;
        int var8 = 0;
        while (var7 <= arg0) {
            var6[var8] = class448.method183((double) var7, 0.0D, var3);
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
        class528 var18 = new class528(var13, var2, var2);
        this.field4364.put(arg0, var18);
    }

    @ObfuscatedName("oq.ay(II)Lud;")
    public class528 method6319(int arg0) {
        if (!this.field4364.containsKey(arg0)) {
            this.method6318(arg0);
        }
        return (class528) this.field4364.get(arg0);
    }

    @ObfuscatedName("oq.ar(III)V")
    public final void method6320(int arg0, int arg1) {
        if (this.field4363 < this.field4361.length) {
            this.field4361[this.field4363] = arg0;
            this.field4367[this.field4363] = arg1;
            this.field4363++;
        }
    }

    @ObfuscatedName("oq.am(I)V")
    public final void method6321() {
        this.field4363 = 0;
    }

    @ObfuscatedName("oq.as(IILud;FI)V")
    public final void method6322(int arg0, int arg1, class528 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class528 var6 = this.method6319(var5);
        int var7 = var5 * 2 + 1;
        class447 var8 = new class447(0, 0, arg2.field5169, arg2.field5174);
        class447 var9 = new class447(0, 0);
        this.field4362.method7423(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4363; var10++) {
            int var11 = this.field4361[var10];
            int var12 = this.field4367[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5174 - (float) (var12 - arg1) * arg3) - var5;
            this.field4362.method7422(var13, var14);
            this.field4362.method7435(var8, var9);
            this.method6323(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5168.length; var15++) {
            if (arg2.field5168[var15] == 0) {
                arg2.field5168[var15] = -16777216;
            } else {
                int var16 = (arg2.field5168[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5168[var15] = -16777216;
                } else {
                    if (var16 > Statics.field2805.length) {
                        var16 = Statics.field2805.length;
                    }
                    int var17 = Statics.field2805[var16 - 1];
                    arg2.field5168[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("oq.aj(Lud;Lud;Lrk;S)V")
    public void method6323(class528 arg0, class528 arg1, class447 arg2) {
        if (arg2.field4724 == 0 || arg2.field4722 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4723 == 0) {
            var4 = arg0.field5169 - arg2.field4724;
        }
        if (arg2.field4721 == 0) {
            var5 = arg0.field5174 - arg2.field4722;
        }
        int var6 = arg0.field5169 * var5 + var4;
        int var7 = arg2.field4721 * arg1.field5169 + arg2.field4723;
        for (int var8 = 0; var8 < arg2.field4722; var8++) {
            for (int var9 = 0; var9 < arg2.field4724; var9++) {
                int var10001 = var7++;
                arg1.field5168[var10001] += arg0.field5168[var6++];
            }
            var6 += arg0.field5169 - arg2.field4724;
            var7 += arg1.field5169 - arg2.field4724;
        }
    }
}
