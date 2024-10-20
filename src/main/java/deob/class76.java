package deob;

@ObfuscatedName("bj")
public class class76 extends class183 {

    @ObfuscatedName("bj.l")
    public int field1326;

    @ObfuscatedName("bj.g")
    public boolean field1321;

    @ObfuscatedName("bj.a")
    public int[] field1318;

    @ObfuscatedName("bj.x")
    public int[] field1323;

    @ObfuscatedName("bj.r")
    public int[] field1320;

    @ObfuscatedName("bj.w")
    public int[] field1316;

    @ObfuscatedName("bj.c")
    public int field1328;

    @ObfuscatedName("bj.f")
    public int field1327;

    @ObfuscatedName("bj.o")
    public int[] field1324;

    @ObfuscatedName("bj.p")
    public boolean field1329 = false;

    public class76(class107 arg0) {
        this.field1326 = arg0.method2111();
        this.field1321 = arg0.method2109() == 1;
        int var2 = arg0.method2109();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1318 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1318[var3] = arg0.method2111();
        }
        if (var2 > 1) {
            this.field1323 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1323[var4] = arg0.method2109();
            }
        }
        if (var2 > 1) {
            this.field1320 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1320[var5] = arg0.method2109();
            }
        }
        this.field1316 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1316[var6] = arg0.method2114();
        }
        this.field1328 = arg0.method2109();
        this.field1327 = arg0.method2109();
        this.field1324 = null;
    }

    @ObfuscatedName("bj.y(DILev;)Z")
    public boolean method1580(double arg0, int arg1, class145 arg2) {
        for (int var5 = 0; var5 < this.field1318.length; var5++) {
            if (arg2.method2711(this.field1318[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1324 = new int[var6];
        for (int var7 = 0; var7 < this.field1318.length; var7++) {
            class74 var8 = class70.method492(arg2, this.field1318[var7]);
            var8.method1565();
            byte[] var9 = var8.field1312;
            int[] var10 = var8.field1308;
            int var11 = this.field1316[var7];
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
                var10[var17] = class84.method1778(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1323[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1307 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1324[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1307 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1324[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1307 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1324[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("bj.u()V")
    public void method1581() {
        this.field1324 = null;
    }

    @ObfuscatedName("bj.k(I)V")
    public void method1579(int arg0) {
        if (this.field1324 == null) {
            return;
        }
        if (this.field1328 == 1 || this.field1328 == 3) {
            if (Statics.field1330 == null || Statics.field1330.length < this.field1324.length) {
                Statics.field1330 = new int[this.field1324.length];
            }
            short var2;
            if (this.field1324.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1324.length;
            int var4 = arg0 * var2 * this.field1327;
            int var5 = var3 - 1;
            if (this.field1328 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1330[var6] = this.field1324[var7];
            }
            int[] var8 = this.field1324;
            this.field1324 = Statics.field1330;
            Statics.field1330 = var8;
        }
        if (this.field1328 != 2 && this.field1328 != 4) {
            return;
        }
        if (Statics.field1330 == null || Statics.field1330.length < this.field1324.length) {
            Statics.field1330 = new int[this.field1324.length];
        }
        short var9;
        if (this.field1324.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1324.length;
        int var11 = this.field1327 * arg0;
        int var12 = var9 - 1;
        if (this.field1328 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1330[var15] = this.field1324[var16];
            }
        }
        int[] var17 = this.field1324;
        this.field1324 = Statics.field1330;
        Statics.field1330 = var17;
    }
}
