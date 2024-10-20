package deob;

@ObfuscatedName("ii")
public class class217 extends class444 {

    @ObfuscatedName("ii.an")
    public int field2421;

    @ObfuscatedName("ii.ao")
    public boolean field2424;

    @ObfuscatedName("ii.av")
    public int[] field2426;

    @ObfuscatedName("ii.aq")
    public int[] field2425;

    @ObfuscatedName("ii.ap")
    public int[] field2423;

    @ObfuscatedName("ii.ar")
    public int[] field2430;

    @ObfuscatedName("ii.ak")
    public int field2427;

    @ObfuscatedName("ii.ax")
    public int field2428;

    @ObfuscatedName("ii.as")
    public int[] field2429;

    @ObfuscatedName("ii.ay")
    public boolean field2417 = false;

    public class217(class478 arg0) {
        this.field2421 = arg0.method7905();
        this.field2424 = arg0.method7909() == 1;
        int var2 = arg0.method7909();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2426 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2426[var3] = arg0.method7905();
        }
        if (var2 > 1) {
            this.field2425 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2425[var4] = arg0.method7909();
            }
        }
        if (var2 > 1) {
            this.field2423 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2423[var5] = arg0.method7909();
            }
        }
        this.field2430 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2430[var6] = arg0.method7908();
        }
        this.field2427 = arg0.method7909();
        this.field2428 = arg0.method7909();
        this.field2429 = null;
    }

    @ObfuscatedName("ii.aj(DILne;)Z")
    public boolean method3897(double arg0, int arg1, class340 arg2) {
        for (int var5 = 0; var5 < this.field2426.length; var5++) {
            if (arg2.method5941(this.field2426[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2429 = new int[var6];
        for (int var7 = 0; var7 < this.field2426.length; var7++) {
            class491 var8 = class493.method824(arg2, this.field2426[var7]);
            var8.method8295();
            byte[] var9 = var8.field4990;
            int[] var10 = var8.field4988;
            int var11 = this.field2430[var7];
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
                var10[var17] = class220.method3915(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field2425[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field4992 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field2429[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field4992 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field2429[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field4992 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field2429[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ii.al()V")
    public void method3898() {
        this.field2429 = null;
    }

    @ObfuscatedName("ii.ac(I)V")
    public void method3899(int arg0) {
        if (this.field2429 == null) {
            return;
        }
        if (this.field2427 == 1 || this.field2427 == 3) {
            if (Statics.field2431 == null || Statics.field2431.length < this.field2429.length) {
                Statics.field2431 = new int[this.field2429.length];
            }
            short var2;
            if (this.field2429.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2429.length;
            int var4 = arg0 * var2 * this.field2428;
            int var5 = var3 - 1;
            if (this.field2427 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2431[var6] = this.field2429[var7];
            }
            int[] var8 = this.field2429;
            this.field2429 = Statics.field2431;
            Statics.field2431 = var8;
        }
        if (this.field2427 != 2 && this.field2427 != 4) {
            return;
        }
        if (Statics.field2431 == null || Statics.field2431.length < this.field2429.length) {
            Statics.field2431 = new int[this.field2429.length];
        }
        short var9;
        if (this.field2429.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2429.length;
        int var11 = this.field2428 * arg0;
        int var12 = var9 - 1;
        if (this.field2427 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2431[var15] = this.field2429[var16];
            }
        }
        int[] var17 = this.field2429;
        this.field2429 = Statics.field2431;
        Statics.field2431 = var17;
    }
}
