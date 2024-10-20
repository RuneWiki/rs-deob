package deob;

@ObfuscatedName("if")
public class class224 extends class473 {

    @ObfuscatedName("if.ac")
    public int field2482;

    @ObfuscatedName("if.ai")
    public boolean field2487;

    @ObfuscatedName("if.az")
    public int[] field2488;

    @ObfuscatedName("if.ap")
    public int[] field2489;

    @ObfuscatedName("if.aa")
    public int[] field2490;

    @ObfuscatedName("if.af")
    public int[] field2491;

    @ObfuscatedName("if.ad")
    public int field2492;

    @ObfuscatedName("if.aq")
    public int field2495;

    @ObfuscatedName("if.al")
    public int[] field2494;

    @ObfuscatedName("if.an")
    public boolean field2493 = false;

    public class224(class515 arg0) {
        this.field2482 = arg0.method8448();
        this.field2487 = arg0.method8300() == 1;
        int var2 = arg0.method8300();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field2488 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field2488[var3] = arg0.method8448();
        }
        if (var2 > 1) {
            this.field2489 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field2489[var4] = arg0.method8300();
            }
        }
        if (var2 > 1) {
            this.field2490 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field2490[var5] = arg0.method8300();
            }
        }
        this.field2491 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2491[var6] = arg0.method8306();
        }
        this.field2492 = arg0.method8300();
        this.field2495 = arg0.method8300();
        this.field2494 = null;
    }

    @ObfuscatedName("if.au(DILnu;)Z")
    public boolean method4045(double arg0, int arg1, class359 arg2) {
        for (int var5 = 0; var5 < this.field2488.length; var5++) {
            if (arg2.method6136(this.field2488[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field2494 = new int[var6];
        for (int var7 = 0; var7 < this.field2488.length; var7++) {
            int var8 = this.field2488[var7];
            class528 var9;
            if (class530.method1069(arg2, var8)) {
                var9 = class530.method8073();
            } else {
                var9 = null;
            }
            var9.method8694();
            byte[] var11 = var9.field5203;
            int[] var12 = var9.field5206;
            int var13 = this.field2491[var7];
            if ((var13 & 0xFF000000) == 16777216) {
            }
            if ((var13 & 0xFF000000) == 33554432) {
            }
            if ((var13 & 0xFF000000) == 50331648) {
                int var14 = var13 & 0xFF00FF;
                int var15 = var13 >> 8 & 0xFF;
                for (int var16 = 0; var16 < var12.length; var16++) {
                    int var17 = var12[var16];
                    if (var17 >> 8 == (var17 & 0xFFFF)) {
                        int var18 = var17 & 0xFF;
                        var12[var16] = var14 * var18 >> 8 & 0xFF00FF | var15 * var18 & 0xFF00;
                    }
                }
            }
            for (int var19 = 0; var19 < var12.length; var19++) {
                var12[var19] = class227.method4080(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field2489[var7 - 1];
            }
            if (var20 == 0) {
                if (var9.field5201 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field2494[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field5201 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field2494[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field5201 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field2494[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var20 == 1) {
            }
            if (var20 == 2) {
            }
            if (var20 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("if.ae()V")
    public void method4036() {
        this.field2494 = null;
    }

    @ObfuscatedName("if.ao(I)V")
    public void method4038(int arg0) {
        if (this.field2494 == null) {
            return;
        }
        if (this.field2492 == 1 || this.field2492 == 3) {
            if (Statics.field2496 == null || Statics.field2496.length < this.field2494.length) {
                Statics.field2496 = new int[this.field2494.length];
            }
            short var2;
            if (this.field2494.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field2494.length;
            int var4 = arg0 * var2 * this.field2495;
            int var5 = var3 - 1;
            if (this.field2492 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field2496[var6] = this.field2494[var7];
            }
            int[] var8 = this.field2494;
            this.field2494 = Statics.field2496;
            Statics.field2496 = var8;
        }
        if (this.field2492 != 2 && this.field2492 != 4) {
            return;
        }
        if (Statics.field2496 == null || Statics.field2496.length < this.field2494.length) {
            Statics.field2496 = new int[this.field2494.length];
        }
        short var9;
        if (this.field2494.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field2494.length;
        int var11 = this.field2495 * arg0;
        int var12 = var9 - 1;
        if (this.field2492 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field2496[var15] = this.field2494[var16];
            }
        }
        int[] var17 = this.field2494;
        this.field2494 = Statics.field2496;
        Statics.field2496 = var17;
    }
}
