package deob;

@ObfuscatedName("bl")
public class class78 extends class199 {

    @ObfuscatedName("bl.e")
    public int field1367;

    @ObfuscatedName("bl.g")
    public boolean field1368;

    @ObfuscatedName("bl.f")
    public int[] field1372;

    @ObfuscatedName("bl.m")
    public int[] field1370;

    @ObfuscatedName("bl.a")
    public int[] field1366;

    @ObfuscatedName("bl.h")
    public int[] field1374;

    @ObfuscatedName("bl.l")
    public int field1373;

    @ObfuscatedName("bl.u")
    public int field1371;

    @ObfuscatedName("bl.q")
    public int[] field1375;

    @ObfuscatedName("bl.k")
    public boolean field1376 = false;

    public class78(class111 arg0) {
        this.field1367 = arg0.method2231();
        this.field1368 = arg0.method2228() == 1;
        int var2 = arg0.method2228();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1372 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1372[var3] = arg0.method2231();
        }
        if (var2 > 1) {
            this.field1370 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1370[var4] = arg0.method2228();
            }
        }
        if (var2 > 1) {
            this.field1366 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1366[var5] = arg0.method2228();
            }
        }
        this.field1374 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1374[var6] = arg0.method2233();
        }
        this.field1373 = arg0.method2228();
        this.field1371 = arg0.method2228();
        this.field1375 = null;
    }

    @ObfuscatedName("bl.n(DILfs;)Z")
    public boolean method1656(double arg0, int arg1, class158 arg2) {
        for (int var5 = 0; var5 < this.field1372.length; var5++) {
            if (arg2.method3021(this.field1372[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1375 = new int[var6];
        for (int var7 = 0; var7 < this.field1372.length; var7++) {
            class76 var8 = class72.method161(arg2, this.field1372[var7]);
            var8.method1645();
            byte[] var9 = var8.field1354;
            int[] var10 = var8.field1361;
            int var11 = this.field1374[var7];
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
                var10[var17] = class86.method1880(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1370[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1356 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1375[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1356 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1375[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1356 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1375[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("bl.d()V")
    public void method1657() {
        this.field1375 = null;
    }

    @ObfuscatedName("bl.z(I)V")
    public void method1663(int arg0) {
        if (this.field1375 == null) {
            return;
        }
        if (this.field1373 == 1 || this.field1373 == 3) {
            if (Statics.field1377 == null || Statics.field1377.length < this.field1375.length) {
                Statics.field1377 = new int[this.field1375.length];
            }
            short var2;
            if (this.field1375.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1375.length;
            int var4 = arg0 * var2 * this.field1371;
            int var5 = var3 - 1;
            if (this.field1373 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1377[var6] = this.field1375[var7];
            }
            int[] var8 = this.field1375;
            this.field1375 = Statics.field1377;
            Statics.field1377 = var8;
        }
        if (this.field1373 != 2 && this.field1373 != 4) {
            return;
        }
        if (Statics.field1377 == null || Statics.field1377.length < this.field1375.length) {
            Statics.field1377 = new int[this.field1375.length];
        }
        short var9;
        if (this.field1375.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1375.length;
        int var11 = this.field1371 * arg0;
        int var12 = var9 - 1;
        if (this.field1373 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1377[var15] = this.field1375[var16];
            }
        }
        int[] var17 = this.field1375;
        this.field1375 = Statics.field1377;
        Statics.field1377 = var17;
    }
}
