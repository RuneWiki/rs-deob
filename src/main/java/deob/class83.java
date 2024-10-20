package deob;

@ObfuscatedName("cs")
public class class83 extends class208 {

    @ObfuscatedName("cs.a")
    public int field1430;

    @ObfuscatedName("cs.s")
    public boolean field1433;

    @ObfuscatedName("cs.p")
    public int[] field1436;

    @ObfuscatedName("cs.r")
    public int[] field1435;

    @ObfuscatedName("cs.k")
    public int[] field1432;

    @ObfuscatedName("cs.d")
    public int[] field1440;

    @ObfuscatedName("cs.n")
    public int field1438;

    @ObfuscatedName("cs.z")
    public int field1439;

    @ObfuscatedName("cs.c")
    public int[] field1434;

    @ObfuscatedName("cs.b")
    public boolean field1441 = false;

    public class83(class119 arg0) {
        this.field1430 = arg0.method2312();
        this.field1433 = arg0.method2310() == 1;
        int var2 = arg0.method2310();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1436 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1436[var3] = arg0.method2312();
        }
        if (var2 > 1) {
            this.field1435 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1435[var4] = arg0.method2310();
            }
        }
        if (var2 > 1) {
            this.field1432 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1432[var5] = arg0.method2310();
            }
        }
        this.field1440 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1440[var6] = arg0.method2315();
        }
        this.field1438 = arg0.method2310();
        this.field1439 = arg0.method2310();
        this.field1434 = null;
    }

    @ObfuscatedName("cs.i(DILfn;)Z")
    public boolean method1706(double arg0, int arg1, class167 arg2) {
        for (int var5 = 0; var5 < this.field1436.length; var5++) {
            if (arg2.method3025(this.field1436[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1434 = new int[var6];
        for (int var7 = 0; var7 < this.field1436.length; var7++) {
            int var8 = this.field1436[var7];
            byte[] var9 = arg2.method3023(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class77.method147(var9);
                var10 = true;
            }
            class81 var11;
            if (var10) {
                class81 var12 = new class81();
                var12.field1425 = Statics.field1389;
                var12.field1426 = Statics.field1384;
                var12.field1424 = Statics.field3146[0];
                var12.field1419 = Statics.field1383[0];
                var12.field1421 = Statics.field1382[0];
                var12.field1422 = Statics.field1385[0];
                var12.field1423 = Statics.field1942;
                var12.field1420 = Statics.field1386[0];
                class77.method2978();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1699();
            byte[] var15 = var11.field1420;
            int[] var16 = var11.field1423;
            int var17 = this.field1440[var7];
            if ((var17 & 0xFF000000) == 16777216) {
            }
            if ((var17 & 0xFF000000) == 33554432) {
            }
            if ((var17 & 0xFF000000) == 50331648) {
                int var18 = var17 & 0xFF00FF;
                int var19 = var17 >> 8 & 0xFF;
                for (int var20 = 0; var20 < var16.length; var20++) {
                    int var21 = var16[var20];
                    if (var21 >> 8 == (var21 & 0xFFFF)) {
                        int var22 = var21 & 0xFF;
                        var16[var20] = var18 * var22 >> 8 & 0xFF00FF | var19 * var22 & 0xFF00;
                    }
                }
            }
            for (int var23 = 0; var23 < var16.length; var23++) {
                var16[var23] = class91.method1923(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1435[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1421 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1434[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1421 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1434[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1421 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1434[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var24 == 1) {
            }
            if (var24 == 2) {
            }
            if (var24 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("cs.v()V")
    public void method1708() {
        this.field1434 = null;
    }

    @ObfuscatedName("cs.f(I)V")
    public void method1714(int arg0) {
        if (this.field1434 == null) {
            return;
        }
        if (this.field1438 == 1 || this.field1438 == 3) {
            if (Statics.field1442 == null || Statics.field1442.length < this.field1434.length) {
                Statics.field1442 = new int[this.field1434.length];
            }
            short var2;
            if (this.field1434.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1434.length;
            int var4 = arg0 * var2 * this.field1439;
            int var5 = var3 - 1;
            if (this.field1438 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1442[var6] = this.field1434[var7];
            }
            int[] var8 = this.field1434;
            this.field1434 = Statics.field1442;
            Statics.field1442 = var8;
        }
        if (this.field1438 != 2 && this.field1438 != 4) {
            return;
        }
        if (Statics.field1442 == null || Statics.field1442.length < this.field1434.length) {
            Statics.field1442 = new int[this.field1434.length];
        }
        short var9;
        if (this.field1434.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1434.length;
        int var11 = this.field1439 * arg0;
        int var12 = var9 - 1;
        if (this.field1438 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1442[var15] = this.field1434[var16];
            }
        }
        int[] var17 = this.field1434;
        this.field1434 = Statics.field1442;
        Statics.field1442 = var17;
    }
}
