package deob;

@ObfuscatedName("ic")
public class class225 extends class474 {

    @ObfuscatedName("ic.as")
    public int field2460;

    @ObfuscatedName("ic.aj")
    public boolean field2456;

    @ObfuscatedName("ic.ag")
    public int[] field2461;

    @ObfuscatedName("ic.az")
    public int[] field2462;

    @ObfuscatedName("ic.av")
    public int[] field2463;

    @ObfuscatedName("ic.ap")
    public int[] field2464;

    @ObfuscatedName("ic.aq")
    public int field2459;

    @ObfuscatedName("ic.at")
    public int field2466;

    @ObfuscatedName("ic.ah")
    public int[] field2467;

    @ObfuscatedName("ic.ax")
    public boolean field2465 = false;

    public class225(class514 arg0) {
        this.field2460 = arg0.method8246();
        this.field2456 = arg0.method8244() == 1;
        int var2 = arg0.method8244();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2461 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2461[var3] = arg0.method8246();
        }
        if (var2 > 1) {
            this.field2462 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2462[var4] = arg0.method8244();
            }
        }
        if (var2 > 1) {
            this.field2463 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2463[var5] = arg0.method8244();
            }
        }
        this.field2464 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2464[var6] = arg0.method8496();
        }
        this.field2459 = arg0.method8244();
        this.field2466 = arg0.method8244();
        this.field2467 = null;
    }

    @ObfuscatedName("ic.aw(DILnd;)Z")
    public boolean method4027(double arg0, int arg1, class360 arg2) {
        for (int var5 = 0; var5 < this.field2461.length; var5++) {
            if (arg2.method6125(this.field2461[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2467 = new int[var6];
        for (int var7 = 0; var7 < this.field2461.length; var7++) {
            class527 var8 = class529.method8015(arg2, this.field2461[var7]);
            var8.method8671();
            byte[] var9 = var8.field5161;
            int[] var10 = var8.field5156;
            int var11 = this.field2464[var7];
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
                var10[var17] = class228.method4050(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2462[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field5157 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2467[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field5157 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2467[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field5157 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2467[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ic.ay()V")
    public void method4022() {
        this.field2467 = null;
    }

    @ObfuscatedName("ic.ar(I)V")
    public void method4023(int arg0) {
        if (this.field2467 == null) {
            return;
        }
        if (this.field2459 == 1 || this.field2459 == 3) {
            if (Statics.field2469 == null || Statics.field2469.length < this.field2467.length) {
                Statics.field2469 = new int[this.field2467.length];
            }
            short var2;
            if (this.field2467.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2467.length;
            int var4 = arg0 * var2 * this.field2466;
            int var5 = var3 - 1;
            if (this.field2459 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2469[var6] = this.field2467[var7];
            }
            int[] var8 = this.field2467;
            this.field2467 = Statics.field2469;
            Statics.field2469 = var8;
        }
        if (this.field2459 != 2 && this.field2459 != 4) {
            return;
        }
        if (Statics.field2469 == null || Statics.field2469.length < this.field2467.length) {
            Statics.field2469 = new int[this.field2467.length];
        }
        short var9;
        if (this.field2467.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2467.length;
        int var11 = this.field2466 * arg0;
        int var12 = var9 - 1;
        if (this.field2459 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2469[var15] = this.field2467[var16];
            }
        }
        int[] var17 = this.field2467;
        this.field2467 = Statics.field2469;
        Statics.field2469 = var17;
    }
}
