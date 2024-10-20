package deob;

@ObfuscatedName("ih")
public class class216 extends class449 {

    @ObfuscatedName("ih.au")
    public int field2467;

    @ObfuscatedName("ih.ab")
    public boolean field2474;

    @ObfuscatedName("ih.aq")
    public int[] field2468;

    @ObfuscatedName("ih.al")
    public int[] field2469;

    @ObfuscatedName("ih.at")
    public int[] field2471;

    @ObfuscatedName("ih.aa")
    public int[] field2472;

    @ObfuscatedName("ih.ay")
    public int field2473;

    @ObfuscatedName("ih.ao")
    public int field2463;

    @ObfuscatedName("ih.ax")
    public int[] field2475;

    @ObfuscatedName("ih.ai")
    public boolean field2477 = false;

    public class216(class489 arg0) {
        this.field2467 = arg0.method8250();
        this.field2474 = arg0.method8248() == 1;
        int var2 = arg0.method8248();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2468 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2468[var3] = arg0.method8250();
        }
        if (var2 > 1) {
            this.field2469 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2469[var4] = arg0.method8248();
            }
        }
        if (var2 > 1) {
            this.field2471 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2471[var5] = arg0.method8248();
            }
        }
        this.field2472 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2472[var6] = arg0.method8254();
        }
        this.field2473 = arg0.method8248();
        this.field2463 = arg0.method8248();
        this.field2475 = null;
    }

    @ObfuscatedName("ih.af(DILnm;)Z")
    public boolean method4049(double arg0, int arg1, class344 arg2) {
        for (int var5 = 0; var5 < this.field2468.length; var5++) {
            if (arg2.method6079(this.field2468[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2475 = new int[var6];
        for (int var7 = 0; var7 < this.field2468.length; var7++) {
            class502 var8 = class504.method7681(arg2, this.field2468[var7]);
            var8.method8672();
            byte[] var9 = var8.field5083;
            int[] var10 = var8.field5080;
            int var11 = this.field2472[var7];
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
                var10[var17] = class219.method2709(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2469[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field5081 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2475[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field5081 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2475[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field5081 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2475[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ih.an()V")
    public void method4050() {
        this.field2475 = null;
    }

    @ObfuscatedName("ih.aw(I)V")
    public void method4051(int arg0) {
        if (this.field2475 == null) {
            return;
        }
        if (this.field2473 == 1 || this.field2473 == 3) {
            if (Statics.field2470 == null || Statics.field2470.length < this.field2475.length) {
                Statics.field2470 = new int[this.field2475.length];
            }
            short var2;
            if (this.field2475.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2475.length;
            int var4 = arg0 * var2 * this.field2463;
            int var5 = var3 - 1;
            if (this.field2473 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2470[var6] = this.field2475[var7];
            }
            int[] var8 = this.field2475;
            this.field2475 = Statics.field2470;
            Statics.field2470 = var8;
        }
        if (this.field2473 != 2 && this.field2473 != 4) {
            return;
        }
        if (Statics.field2470 == null || Statics.field2470.length < this.field2475.length) {
            Statics.field2470 = new int[this.field2475.length];
        }
        short var9;
        if (this.field2475.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2475.length;
        int var11 = this.field2463 * arg0;
        int var12 = var9 - 1;
        if (this.field2473 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2470[var15] = this.field2475[var16];
            }
        }
        int[] var17 = this.field2475;
        this.field2475 = Statics.field2470;
        Statics.field2470 = var17;
    }
}
