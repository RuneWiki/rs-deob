package deob;

@ObfuscatedName("cg")
public class class80 extends class128 {

    @ObfuscatedName("cg.w")
    public int field1321;

    @ObfuscatedName("cg.h")
    public boolean field1326;

    @ObfuscatedName("cg.u")
    public int[] field1318;

    @ObfuscatedName("cg.k")
    public int[] field1320;

    @ObfuscatedName("cg.g")
    public int[] field1325;

    @ObfuscatedName("cg.y")
    public int[] field1322;

    @ObfuscatedName("cg.e")
    public int field1323;

    @ObfuscatedName("cg.q")
    public int field1324;

    @ObfuscatedName("cg.v")
    public int[] field1319;

    @ObfuscatedName("cg.l")
    public boolean field1313 = false;

    public class80(class154 arg0) {
        this.field1321 = arg0.method2745();
        this.field1326 = arg0.method2701() == 1;
        int var2 = arg0.method2701();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1318 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1318[var3] = arg0.method2745();
        }
        if (var2 > 1) {
            this.field1320 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1320[var4] = arg0.method2701();
            }
        }
        if (var2 > 1) {
            this.field1325 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1325[var5] = arg0.method2701();
            }
        }
        this.field1322 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1322[var6] = arg0.method2644();
        }
        this.field1323 = arg0.method2701();
        this.field1324 = arg0.method2701();
        this.field1319 = null;
    }

    @ObfuscatedName("cg.x(DILgk;)Z")
    public boolean method1514(double arg0, int arg1, class183 arg2) {
        for (int var5 = 0; var5 < this.field1318.length; var5++) {
            if (arg2.method3143(this.field1318[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1319 = new int[var6];
        for (int var7 = 0; var7 < this.field1318.length; var7++) {
            class223 var8 = class226.method3070(arg2, this.field1318[var7]);
            var8.method3853();
            byte[] var9 = var8.field3212;
            int[] var10 = var8.field3209;
            int var11 = this.field1322[var7];
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
                var10[var17] = class85.method1619(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1320[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field3210 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1319[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3210 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1319[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3210 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1319[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("cg.j()V")
    public void method1516() {
        this.field1319 = null;
    }

    @ObfuscatedName("cg.c(I)V")
    public void method1522(int arg0) {
        if (this.field1319 == null) {
            return;
        }
        if (this.field1323 == 1 || this.field1323 == 3) {
            if (Statics.field1327 == null || Statics.field1327.length < this.field1319.length) {
                Statics.field1327 = new int[this.field1319.length];
            }
            short var2;
            if (this.field1319.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1319.length;
            int var4 = arg0 * var2 * this.field1324;
            int var5 = var3 - 1;
            if (this.field1323 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1327[var6] = this.field1319[var7];
            }
            int[] var8 = this.field1319;
            this.field1319 = Statics.field1327;
            Statics.field1327 = var8;
        }
        if (this.field1323 != 2 && this.field1323 != 4) {
            return;
        }
        if (Statics.field1327 == null || Statics.field1327.length < this.field1319.length) {
            Statics.field1327 = new int[this.field1319.length];
        }
        short var9;
        if (this.field1319.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1319.length;
        int var11 = this.field1324 * arg0;
        int var12 = var9 - 1;
        if (this.field1323 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1327[var15] = this.field1319[var16];
            }
        }
        int[] var17 = this.field1319;
        this.field1319 = Statics.field1327;
        Statics.field1327 = var17;
    }
}
