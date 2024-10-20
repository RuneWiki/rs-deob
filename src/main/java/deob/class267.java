package deob;

@ObfuscatedName("ka")
public class class267 extends class489 {

    @ObfuscatedName("ka.aq")
    public int field2757;

    @ObfuscatedName("ka.ar")
    public boolean field2764;

    @ObfuscatedName("ka.ag")
    public int[] field2759;

    @ObfuscatedName("ka.ao")
    public int[] field2760;

    @ObfuscatedName("ka.ae")
    public int[] field2761;

    @ObfuscatedName("ka.aa")
    public int[] field2753;

    @ObfuscatedName("ka.au")
    public int field2763;

    @ObfuscatedName("ka.an")
    public int field2755;

    @ObfuscatedName("ka.ad")
    public int[] field2758;

    @ObfuscatedName("ka.ax")
    public boolean field2766 = false;

    public class267(class531 arg0) {
        this.field2757 = arg0.method8775();
        this.field2764 = arg0.method8561() == 1;
        int var2 = arg0.method8561();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2759 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2759[var3] = arg0.method8775();
        }
        if (var2 > 1) {
            this.field2760 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2760[var4] = arg0.method8561();
            }
        }
        if (var2 > 1) {
            this.field2761 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2761[var5] = arg0.method8561();
            }
        }
        this.field2753 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2753[var6] = arg0.method8566();
        }
        this.field2763 = arg0.method8561();
        this.field2755 = arg0.method8561();
        this.field2758 = null;
    }

    @ObfuscatedName("ka.am(DILow;)Z")
    public boolean method4734(double arg0, int arg1, class375 arg2) {
        for (int var5 = 0; var5 < this.field2759.length; var5++) {
            if (arg2.method6401(this.field2759[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2758 = new int[var6];
        for (int var7 = 0; var7 < this.field2759.length; var7++) {
            class544 var8 = class546.method2340(arg2, this.field2759[var7]);
            var8.method8976();
            byte[] var9 = var8.field5267;
            int[] var10 = var8.field5268;
            int var11 = this.field2753[var7];
            if ((var11 & 0xFF000000) == 16777216) {
            }
            if ((var11 & 0xFF000000) == 33554432) {
            }
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class270.method4749(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2760[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field5269 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2758[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field5269 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2758[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field5269 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2758[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var18 == 1) {
            }
            if (var18 == 2) {
            }
            if (var18 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("ka.ap()V")
    public void method4735() {
        this.field2758 = null;
    }

    @ObfuscatedName("ka.af(I)V")
    public void method4739(int arg0) {
        if (this.field2758 == null) {
            return;
        }
        if (this.field2763 == 1 || this.field2763 == 3) {
            if (Statics.field2765 == null || Statics.field2765.length < this.field2758.length) {
                Statics.field2765 = new int[this.field2758.length];
            }
            short var2;
            if (this.field2758.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2758.length;
            int var4 = arg0 * var2 * this.field2755;
            int var5 = var3 - 1;
            if (this.field2763 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2765[var6] = this.field2758[var7];
            }
            int[] var8 = this.field2758;
            this.field2758 = Statics.field2765;
            Statics.field2765 = var8;
        }
        if (this.field2763 != 2 && this.field2763 != 4) {
            return;
        }
        if (Statics.field2765 == null || Statics.field2765.length < this.field2758.length) {
            Statics.field2765 = new int[this.field2758.length];
        }
        short var9;
        if (this.field2758.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2758.length;
        int var11 = this.field2755 * arg0;
        int var12 = var9 - 1;
        if (this.field2763 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2765[var15] = this.field2758[var16];
            }
        }
        int[] var17 = this.field2758;
        this.field2758 = Statics.field2765;
        Statics.field2765 = var17;
    }
}
