package deob;

import java.util.HashMap;

@ObfuscatedName("pb")
public class class399 {

    @ObfuscatedName("pb.aq")
    public final HashMap field4611 = new HashMap();

    @ObfuscatedName("pb.ad")
    public class420 field4606 = new class420(0, 0);

    @ObfuscatedName("pb.ag")
    public int[] field4610 = new int[2048];

    @ObfuscatedName("pb.ak")
    public int[] field4608 = new int[2048];

    @ObfuscatedName("pb.ap")
    public int field4609 = 0;

    public class399() {
        Statics.field303 = new int[2000];
        int var1 = 0;
        int var2 = 240;
        byte var3 = 12;
        while (var1 < 16) {
            int var4 = class253.method5547((double) ((float) var2 / 360.0F), 0.9998999834060669D, (double) ((float) var1 * 0.425F / 16.0F + 0.075F));
            Statics.field303[var1] = var4;
            var1++;
            var2 -= var3;
        }
        int var5 = 48;
        int var6 = var5 / 6;
        while (var1 < Statics.field303.length) {
            int var7 = var1 * 2;
            int var8 = class253.method5547((double) ((float) var5 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var1 < var7 && var1 < Statics.field303.length) {
                Statics.field303[var1] = var8;
                var1++;
            }
            var5 -= var6;
        }
    }

    @ObfuscatedName("pb.aq(II)V")
    public void method6731(int arg0) {
        int var2 = arg0 * 2 + 1;
        double[] var3 = class421.method2865(0.0D, (double) ((float) arg0 / 3.0F), arg0);
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
        class561 var11 = new class561(var6, var2, var2);
        this.field4611.put(arg0, var11);
    }

    @ObfuscatedName("pb.ad(II)Lvg;")
    public class561 method6732(int arg0) {
        if (!this.field4611.containsKey(arg0)) {
            this.method6731(arg0);
        }
        return (class561) this.field4611.get(arg0);
    }

    @ObfuscatedName("pb.ag(III)V")
    public final void method6733(int arg0, int arg1) {
        if (this.field4609 < this.field4610.length) {
            this.field4610[this.field4609] = arg0;
            this.field4608[this.field4609] = arg1;
            this.field4609++;
        }
    }

    @ObfuscatedName("pb.ak(I)V")
    public final void method6730() {
        this.field4609 = 0;
    }

    @ObfuscatedName("pb.ap(IILvg;FB)V")
    public final void method6739(int arg0, int arg1, class561 arg2, float arg3) {
        int var5 = (int) (arg3 * 18.0F);
        class561 var6 = this.method6732(var5);
        int var7 = var5 * 2 + 1;
        class420 var8 = new class420(0, 0, arg2.field5458, arg2.field5461);
        class420 var9 = new class420(0, 0);
        this.field4606.method7022(var7, var7);
        System.nanoTime();
        for (int var10 = 0; var10 < this.field4609; var10++) {
            int var11 = this.field4610[var10];
            int var12 = this.field4608[var10];
            int var13 = (int) ((float) (var11 - arg0) * arg3) - var5;
            int var14 = (int) ((float) arg2.field5461 - (float) (var12 - arg1) * arg3) - var5;
            this.field4606.method7021(var13, var14);
            this.field4606.method7019(var8, var9);
            this.method6745(var6, arg2, var9);
        }
        System.nanoTime();
        System.nanoTime();
        for (int var15 = 0; var15 < arg2.field5466.length; var15++) {
            if (arg2.field5466[var15] == 0) {
                arg2.field5466[var15] = -16777216;
            } else {
                int var16 = (arg2.field5466[var15] + 64 - 1) / 256;
                if (var16 <= 0) {
                    arg2.field5466[var15] = -16777216;
                } else {
                    if (var16 > Statics.field303.length) {
                        var16 = Statics.field303.length;
                    }
                    int var17 = Statics.field303[var16 - 1];
                    arg2.field5466[var15] = 0xFF000000 | var17;
                }
            }
        }
        System.nanoTime();
    }

    @ObfuscatedName("pb.an(Lvg;Lvg;Lqa;I)V")
    public void method6745(class561 arg0, class561 arg1, class420 arg2) {
        if (arg2.field4686 == 0 || arg2.field4689 == 0) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg2.field4688 == 0) {
            var4 = arg0.field5458 - arg2.field4686;
        }
        if (arg2.field4687 == 0) {
            var5 = arg0.field5461 - arg2.field4689;
        }
        int var6 = arg0.field5458 * var5 + var4;
        int var7 = arg2.field4687 * arg1.field5458 + arg2.field4688;
        for (int var8 = 0; var8 < arg2.field4689; var8++) {
            for (int var9 = 0; var9 < arg2.field4686; var9++) {
                int var10001 = var7++;
                arg1.field5466[var10001] += arg0.field5466[var6++];
            }
            var6 += arg0.field5458 - arg2.field4686;
            var7 += arg1.field5458 - arg2.field4686;
        }
    }
}
