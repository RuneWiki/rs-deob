package deob;

@ObfuscatedName("ks")
public class class264 extends class485 {

    @ObfuscatedName("ks.ab")
    public int field2720;

    @ObfuscatedName("ks.au")
    public boolean field2726;

    @ObfuscatedName("ks.aa")
    public int[] field2722;

    @ObfuscatedName("ks.ac")
    public int[] field2721;

    @ObfuscatedName("ks.al")
    public int[] field2716;

    @ObfuscatedName("ks.az")
    public int[] field2727;

    @ObfuscatedName("ks.ap")
    public int field2724;

    @ObfuscatedName("ks.av")
    public int field2723;

    @ObfuscatedName("ks.ax")
    public int[] field2728;

    @ObfuscatedName("ks.as")
    public boolean field2729 = false;

    public class264(class527 arg0) {
        this.field2720 = arg0.method8412();
        this.field2726 = arg0.method8410() == 1;
        int var2 = arg0.method8410();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2722 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2722[var3] = arg0.method8412();
        }
        if (var2 > 1) {
            this.field2721 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2721[var4] = arg0.method8410();
            }
        }
        if (var2 > 1) {
            this.field2716 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2716[var5] = arg0.method8410();
            }
        }
        this.field2727 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2727[var6] = arg0.method8416();
        }
        this.field2724 = arg0.method8410();
        this.field2723 = arg0.method8410();
        this.field2728 = null;
    }

    @ObfuscatedName("ks.at(DILol;)Z")
    public boolean method4651(double arg0, int arg1, class371 arg2) {
        for (int var5 = 0; var5 < this.field2722.length; var5++) {
            if (arg2.method6292(this.field2722[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2728 = new int[var6];
        for (int var7 = 0; var7 < this.field2722.length; var7++) {
            int var8 = this.field2722[var7];
            class540 var9;
            if (class542.method3368(arg2, var8)) {
                class540 var10 = new class540();
                var10.field5227 = Statics.field5247;
                var10.field5234 = Statics.field4360;
                var10.field5231 = Statics.field5248[0];
                var10.field5233 = Statics.field5250[0];
                var10.field5229 = Statics.field5251[0];
                var10.field5230 = Statics.field5090[0];
                var10.field5228 = Statics.field5252;
                var10.field5232 = Statics.field4452[0];
                Statics.field5248 = null;
                Statics.field5250 = null;
                Statics.field5251 = null;
                Statics.field5090 = null;
                Statics.field5252 = null;
                Statics.field4452 = (byte[][]) null;
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method8851();
            byte[] var13 = var9.field5232;
            int[] var14 = var9.field5228;
            int var15 = this.field2727[var7];
            if ((var15 & 0xFF000000) == 16777216) {
            }
            if ((var15 & 0xFF000000) == 33554432) {
            }
            if ((var15 & 0xFF000000) == 50331648) {
                int var16 = var15 & 0xFF00FF;
                int var17 = var15 >> 8 & 0xFF;
                for (int var18 = 0; var18 < var14.length; var18++) {
                    int var19 = var14[var18];
                    if (var19 >> 8 == (var19 & 0xFFFF)) {
                        int var20 = var19 & 0xFF;
                        var14[var18] = var16 * var20 >> 8 & 0xFF00FF | var17 * var20 & 0xFF00;
                    }
                }
            }
            for (int var21 = 0; var21 < var14.length; var21++) {
                var14[var21] = class267.method4659(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field2721[var7 - 1];
            }
            if (var22 == 0) {
                if (var9.field5229 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field2728[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field5229 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field2728[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field5229 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field2728[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var22 == 1) {
            }
            if (var22 == 2) {
            }
            if (var22 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("ks.ah()V")
    public void method4652() {
        this.field2728 = null;
    }

    @ObfuscatedName("ks.ar(I)V")
    public void method4654(int arg0) {
        if (this.field2728 == null) {
            return;
        }
        if (this.field2724 == 1 || this.field2724 == 3) {
            if (Statics.field2730 == null || Statics.field2730.length < this.field2728.length) {
                Statics.field2730 = new int[this.field2728.length];
            }
            short var2;
            if (this.field2728.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2728.length;
            int var4 = arg0 * var2 * this.field2723;
            int var5 = var3 - 1;
            if (this.field2724 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2730[var6] = this.field2728[var7];
            }
            int[] var8 = this.field2728;
            this.field2728 = Statics.field2730;
            Statics.field2730 = var8;
        }
        if (this.field2724 != 2 && this.field2724 != 4) {
            return;
        }
        if (Statics.field2730 == null || Statics.field2730.length < this.field2728.length) {
            Statics.field2730 = new int[this.field2728.length];
        }
        short var9;
        if (this.field2728.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2728.length;
        int var11 = this.field2723 * arg0;
        int var12 = var9 - 1;
        if (this.field2724 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2730[var15] = this.field2728[var16];
            }
        }
        int[] var17 = this.field2728;
        this.field2728 = Statics.field2730;
        Statics.field2730 = var17;
    }
}
