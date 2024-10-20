package deob;

import java.util.HashMap;

@ObfuscatedName("nb")
public class class351 {

    @ObfuscatedName("nb.aj")
    public final HashMap field4273 = new HashMap();

    @ObfuscatedName("nb.al")
    public class417 field4272 = new class417(0, 0);

    @ObfuscatedName("nb.ac")
    public int[] field4271 = new int[2048];

    @ObfuscatedName("nb.ab")
    public int[] field4274 = new int[2048];

    @ObfuscatedName("nb.an")
    public int field4275 = 0;

    public class351() {
        method5744();
    }

    @ObfuscatedName("md.aj(I)V")
    public static void method5744() {
        Statics.field1681 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class250.method2685((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            Statics.field1681[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < Statics.field1681.length) {
            int var6 = var0 * 2;
            int var7 = class250.method2685((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < Statics.field1681.length) {
                Statics.field1681[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("nb.al(II)V")
    public void method6021(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class418.method5006(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class492 var11 = new class492(var6, var2, var2);
        this.field4273.put(arg0, var11);
    }

    @ObfuscatedName("nb.ac(II)Lsn;")
    public class492 method6022(int arg0) {
        if (!this.field4273.containsKey(arg0)) {
            this.method6021(arg0);
        }
        return (class492) this.field4273.get(arg0);
    }

    @ObfuscatedName("nb.ab(III)V")
    public final void method6023(int arg0, int arg1) {
        if (this.field4275 < this.field4271.length) {
            this.field4271[this.field4275] = arg0;
            this.field4274[this.field4275] = arg1;
            this.field4275++;
        }
    }

    @ObfuscatedName("nb.an(I)V")
    public final void method6038() {
        this.field4275 = 0;
    }

    @ObfuscatedName("nb.ao(IILsn;FI)V")
    public final void method6033(int arg0, int arg1, class492 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class492 var6 = this.method6022(var5);
        int var7 = var5 * 2 + 1;
        class417 var8 = new class417(0, 0, arg2.field5006, arg2.field4996);
        class417 var9 = new class417(0, 0);
        this.field4272.method7108(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4275; var10++) {
            int var11 = this.field4271[var10];
            int var12 = this.field4274[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field4996 - (float) (var12 - arg1) * arg3) - var5;
            this.field4272.method7107(var13, var14);
            this.field4272.method7132(var8, var9);
            this.method6026(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field4997.length; var15++) {
            if (arg2.field4997[var15] == 0) {
                arg2.field4997[var15] = -16777216;
            } else {
                int var16 = (arg2.field4997[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field4997[var15] = -16777216;
                } else {
                    if (var16 > Statics.field1681.length) {
                        var16 = Statics.field1681.length;
                    }
                    int var17 = Statics.field1681[var16 - 1];
                    arg2.field4997[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("nb.av(Lsn;Lsn;Lqy;I)V")
    public void method6026(class492 arg0, class492 arg1, class417 arg2) {
        if (arg2.field4589 == 0 || arg2.field4588 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4587 == 0) {
            var4 = arg0.field5006 - arg2.field4589;
        }
        if (arg2.field4586 == 0) {
            var5 = arg0.field4996 - arg2.field4588;
        }
        int var6 = arg0.field5006 * var5 + var4;
        int var7 = arg2.field4586 * arg1.field5006 + arg2.field4587;
        for (int var8 = 0; var8 < arg2.field4588; var8++) {
            for (int var9 = 0; var9 < arg2.field4589; var9++) {
                int var10001 = var7++;
                arg1.field4997[var10001] += arg0.field4997[var6++];
            }
            var6 += arg0.field5006 - arg2.field4589;
            var7 += arg1.field5006 - arg2.field4589;
        }
    }
}
