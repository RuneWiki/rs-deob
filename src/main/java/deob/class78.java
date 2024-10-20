package deob;

@ObfuscatedName("bu")
public class class78 extends class199 {

    @ObfuscatedName("bu.w")
    public int field1366;

    @ObfuscatedName("bu.t")
    public boolean field1371;

    @ObfuscatedName("bu.s")
    public int[] field1372;

    @ObfuscatedName("bu.c")
    public int[] field1370;

    @ObfuscatedName("bu.d")
    public int[] field1374;

    @ObfuscatedName("bu.v")
    public int[] field1375;

    @ObfuscatedName("bu.m")
    public int field1376;

    @ObfuscatedName("bu.h")
    public int field1380;

    @ObfuscatedName("bu.n")
    public int[] field1377;

    @ObfuscatedName("bu.x")
    public boolean field1379 = false;

    public class78(class111 arg0) {
        this.field1366 = arg0.method2177();
        this.field1371 = arg0.method2314() == 1;
        int var2 = arg0.method2314();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1372 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1372[var3] = arg0.method2177();
        }
        if (var2 > 1) {
            this.field1370 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1370[var4] = arg0.method2314();
            }
        }
        if (var2 > 1) {
            this.field1374 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1374[var5] = arg0.method2314();
            }
        }
        this.field1375 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1375[var6] = arg0.method2350();
        }
        this.field1376 = arg0.method2314();
        this.field1380 = arg0.method2314();
        this.field1377 = null;
    }

    @ObfuscatedName("bu.p(DILff;)Z")
    public boolean method1613(double arg0, int arg1, class158 arg2) {
        for (int var5 = 0; var5 < this.field1372.length; var5++) {
            if (arg2.method2903(this.field1372[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1377 = new int[var6];
        for (int var7 = 0; var7 < this.field1372.length; var7++) {
            int var8 = this.field1372[var7];
            byte[] var9 = arg2.method2901(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class72.method127(var9);
                var10 = true;
            }
            class76 var11;
            if (var10) {
                var11 = class72.method652();
            } else {
                var11 = null;
            }
            var11.method1596();
            byte[] var13 = var11.field1364;
            int[] var14 = var11.field1358;
            int var15 = this.field1375[var7];
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
                var14[var21] = class86.method1811(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1370[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var11.field1359 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1377[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field1359 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1377[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1359 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1377[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("bu.k()V")
    public void method1611() {
        this.field1377 = null;
    }

    @ObfuscatedName("bu.e(I)V")
    public void method1612(int arg0) {
        if (this.field1377 == null) {
            return;
        }
        if (this.field1376 == 1 || this.field1376 == 3) {
            if (Statics.field1369 == null || Statics.field1369.length < this.field1377.length) {
                Statics.field1369 = new int[this.field1377.length];
            }
            short var2;
            if (this.field1377.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1377.length;
            int var4 = arg0 * var2 * this.field1380;
            int var5 = var3 - 1;
            if (this.field1376 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1369[var6] = this.field1377[var7];
            }
            int[] var8 = this.field1377;
            this.field1377 = Statics.field1369;
            Statics.field1369 = var8;
        }
        if (this.field1376 != 2 && this.field1376 != 4) {
            return;
        }
        if (Statics.field1369 == null || Statics.field1369.length < this.field1377.length) {
            Statics.field1369 = new int[this.field1377.length];
        }
        short var9;
        if (this.field1377.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1377.length;
        int var11 = this.field1380 * arg0;
        int var12 = var9 - 1;
        if (this.field1376 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1369[var15] = this.field1377[var16];
            }
        }
        int[] var17 = this.field1377;
        this.field1377 = Statics.field1369;
        Statics.field1369 = var17;
    }
}
