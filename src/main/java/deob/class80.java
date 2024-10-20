package deob;

@ObfuscatedName("ch")
public class class80 extends class128 {

    @ObfuscatedName("ch.w")
    public int field1305;

    @ObfuscatedName("ch.j")
    public boolean field1307;

    @ObfuscatedName("ch.q")
    public int[] field1308;

    @ObfuscatedName("ch.d")
    public int[] field1302;

    @ObfuscatedName("ch.n")
    public int[] field1310;

    @ObfuscatedName("ch.c")
    public int[] field1306;

    @ObfuscatedName("ch.s")
    public int field1312;

    @ObfuscatedName("ch.g")
    public int field1313;

    @ObfuscatedName("ch.i")
    public int[] field1314;

    @ObfuscatedName("ch.v")
    public boolean field1309 = false;

    public class80(class161 arg0) {
        this.field1305 = arg0.method2735();
        this.field1307 = arg0.method2733() == 1;
        int var2 = arg0.method2733();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1308 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1308[var3] = arg0.method2735();
        }
        if (var2 > 1) {
            this.field1302 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1302[var4] = arg0.method2733();
            }
        }
        if (var2 > 1) {
            this.field1310 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1310[var5] = arg0.method2733();
            }
        }
        this.field1306 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1306[var6] = arg0.method2868();
        }
        this.field1312 = arg0.method2733();
        this.field1313 = arg0.method2733();
        this.field1314 = null;
    }

    @ObfuscatedName("ch.k(DILgh;)Z")
    public boolean method1470(double arg0, int arg1, class183 arg2) {
        for (int var5 = 0; var5 < this.field1308.length; var5++) {
            if (arg2.method3072(this.field1308[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1314 = new int[var6];
        for (int var7 = 0; var7 < this.field1308.length; var7++) {
            class223 var8 = class226.method3737(arg2, this.field1308[var7]);
            var8.method3831();
            byte[] var9 = var8.field3196;
            int[] var10 = var8.field3195;
            int var11 = this.field1306[var7];
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
                var10[var17] = class85.method1564(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1302[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field3191 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1314[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3191 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1314[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3191 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1314[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ch.y()V")
    public void method1464() {
        this.field1314 = null;
    }

    @ObfuscatedName("ch.o(I)V")
    public void method1465(int arg0) {
        if (this.field1314 == null) {
            return;
        }
        if (this.field1312 == 1 || this.field1312 == 3) {
            if (Statics.field1316 == null || Statics.field1316.length < this.field1314.length) {
                Statics.field1316 = new int[this.field1314.length];
            }
            short var2;
            if (this.field1314.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1314.length;
            int var4 = arg0 * var2 * this.field1313;
            int var5 = var3 - 1;
            if (this.field1312 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1316[var6] = this.field1314[var7];
            }
            int[] var8 = this.field1314;
            this.field1314 = Statics.field1316;
            Statics.field1316 = var8;
        }
        if (this.field1312 != 2 && this.field1312 != 4) {
            return;
        }
        if (Statics.field1316 == null || Statics.field1316.length < this.field1314.length) {
            Statics.field1316 = new int[this.field1314.length];
        }
        short var9;
        if (this.field1314.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1314.length;
        int var11 = this.field1313 * arg0;
        int var12 = var9 - 1;
        if (this.field1312 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1316[var15] = this.field1314[var16];
            }
        }
        int[] var17 = this.field1314;
        this.field1314 = Statics.field1316;
        Statics.field1316 = var17;
    }
}
