package deob;

@ObfuscatedName("cp")
public class class83 extends class208 {

    @ObfuscatedName("cp.z")
    public int field1434;

    @ObfuscatedName("cp.l")
    public boolean field1430;

    @ObfuscatedName("cp.m")
    public int[] field1431;

    @ObfuscatedName("cp.p")
    public int[] field1439;

    @ObfuscatedName("cp.u")
    public int[] field1433;

    @ObfuscatedName("cp.c")
    public int[] field1436;

    @ObfuscatedName("cp.v")
    public int field1432;

    @ObfuscatedName("cp.o")
    public int field1435;

    @ObfuscatedName("cp.n")
    public int[] field1437;

    @ObfuscatedName("cp.k")
    public boolean field1438 = false;

    public class83(class119 arg0) {
        this.field1434 = arg0.method2376();
        this.field1430 = arg0.method2362() == 1;
        int var2 = arg0.method2362();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1431 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1431[var3] = arg0.method2376();
        }
        if (var2 > 1) {
            this.field1439 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1439[var4] = arg0.method2362();
            }
        }
        if (var2 > 1) {
            this.field1433 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1433[var5] = arg0.method2362();
            }
        }
        this.field1436 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1436[var6] = arg0.method2367();
        }
        this.field1432 = arg0.method2362();
        this.field1435 = arg0.method2362();
        this.field1437 = null;
    }

    @ObfuscatedName("cp.g(DILfc;)Z")
    public boolean method1776(double arg0, int arg1, class167 arg2) {
        for (int var5 = 0; var5 < this.field1431.length; var5++) {
            if (arg2.method3110(this.field1431[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1437 = new int[var6];
        for (int var7 = 0; var7 < this.field1431.length; var7++) {
            int var8 = this.field1431[var7];
            class81 var9;
            if (class77.method2(arg2, var8)) {
                class81 var10 = new class81();
                var10.field1422 = Statics.field1376;
                var10.field1423 = Statics.field1374;
                var10.field1420 = Statics.field1373[0];
                var10.field1418 = Statics.field1378[0];
                var10.field1421 = Statics.field1619[0];
                var10.field1419 = Statics.field1377[0];
                var10.field1417 = Statics.field1382;
                var10.field1416 = Statics.field1380[0];
                class77.method669();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method1762();
            byte[] var13 = var9.field1416;
            int[] var14 = var9.field1417;
            int var15 = this.field1436[var7];
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
                var14[var21] = class91.method1992(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1439[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var9.field1421 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1437[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field1421 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1437[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1421 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1437[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("cp.b()V")
    public void method1779() {
        this.field1437 = null;
    }

    @ObfuscatedName("cp.w(I)V")
    public void method1778(int arg0) {
        if (this.field1437 == null) {
            return;
        }
        if (this.field1432 == 1 || this.field1432 == 3) {
            if (Statics.field1425 == null || Statics.field1425.length < this.field1437.length) {
                Statics.field1425 = new int[this.field1437.length];
            }
            short var2;
            if (this.field1437.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1437.length;
            int var4 = arg0 * var2 * this.field1435;
            int var5 = var3 - 1;
            if (this.field1432 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1425[var6] = this.field1437[var7];
            }
            int[] var8 = this.field1437;
            this.field1437 = Statics.field1425;
            Statics.field1425 = var8;
        }
        if (this.field1432 != 2 && this.field1432 != 4) {
            return;
        }
        if (Statics.field1425 == null || Statics.field1425.length < this.field1437.length) {
            Statics.field1425 = new int[this.field1437.length];
        }
        short var9;
        if (this.field1437.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1437.length;
        int var11 = this.field1435 * arg0;
        int var12 = var9 - 1;
        if (this.field1432 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1425[var15] = this.field1437[var16];
            }
        }
        int[] var17 = this.field1437;
        this.field1437 = Statics.field1425;
        Statics.field1425 = var17;
    }
}
