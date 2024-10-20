package deob;

@ObfuscatedName("cp")
public class class89 extends class177 {

    @ObfuscatedName("cp.x")
    public int field1470;

    @ObfuscatedName("cp.e")
    public boolean field1480;

    @ObfuscatedName("cp.m")
    public int[] field1472;

    @ObfuscatedName("cp.s")
    public int[] field1473;

    @ObfuscatedName("cp.p")
    public int[] field1474;

    @ObfuscatedName("cp.w")
    public int[] field1475;

    @ObfuscatedName("cp.r")
    public int field1476;

    @ObfuscatedName("cp.n")
    public int field1477;

    @ObfuscatedName("cp.b")
    public int[] field1478;

    @ObfuscatedName("cp.z")
    public boolean field1479 = false;

    public class89(class125 arg0) {
        this.field1470 = arg0.method2328();
        this.field1480 = arg0.method2326() == 1;
        int var2 = arg0.method2326();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1472 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1472[var3] = arg0.method2328();
        }
        if (var2 > 1) {
            this.field1473 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1473[var4] = arg0.method2326();
            }
        }
        if (var2 > 1) {
            this.field1474 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1474[var5] = arg0.method2326();
            }
        }
        this.field1475 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1475[var6] = arg0.method2489();
        }
        this.field1476 = arg0.method2326();
        this.field1477 = arg0.method2326();
        this.field1478 = null;
    }

    @ObfuscatedName("cp.c(DILew;)Z")
    public boolean method1749(double arg0, int arg1, class150 arg2) {
        for (int var5 = 0; var5 < this.field1472.length; var5++) {
            if (arg2.method2828(this.field1472[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1478 = new int[var6];
        for (int var7 = 0; var7 < this.field1472.length; var7++) {
            int var8 = this.field1472[var7];
            class86 var9;
            if (class83.method127(arg2, var8)) {
                class86 var10 = new class86();
                var10.field1456 = Statics.field2447;
                var10.field1454 = Statics.field1412;
                var10.field1455 = Statics.field1424[0];
                var10.field1457 = Statics.field1414[0];
                var10.field1452 = Statics.field1418[0];
                var10.field1450 = Statics.field1416[0];
                var10.field1451 = Statics.field1417;
                var10.field1453 = Statics.field1421[0];
                Statics.field1424 = null;
                Statics.field1414 = null;
                Statics.field1418 = null;
                Statics.field1416 = null;
                Statics.field1417 = null;
                Statics.field1421 = (byte[][]) null;
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method1688();
            byte[] var13 = var9.field1453;
            int[] var14 = var9.field1451;
            int var15 = this.field1475[var7];
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
                var14[var21] = class103.method2019(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1473[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var9.field1452 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1478[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field1452 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1478[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1452 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1478[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("cp.j()V")
    public void method1746() {
        this.field1478 = null;
    }

    @ObfuscatedName("cp.f(I)V")
    public void method1747(int arg0) {
        if (this.field1478 == null) {
            return;
        }
        if (this.field1476 == 1 || this.field1476 == 3) {
            if (Statics.field1467 == null || Statics.field1467.length < this.field1478.length) {
                Statics.field1467 = new int[this.field1478.length];
            }
            short var2;
            if (this.field1478.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1478.length;
            int var4 = arg0 * var2 * this.field1477;
            int var5 = var3 - 1;
            if (this.field1476 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1467[var6] = this.field1478[var7];
            }
            int[] var8 = this.field1478;
            this.field1478 = Statics.field1467;
            Statics.field1467 = var8;
        }
        if (this.field1476 != 2 && this.field1476 != 4) {
            return;
        }
        if (Statics.field1467 == null || Statics.field1467.length < this.field1478.length) {
            Statics.field1467 = new int[this.field1478.length];
        }
        short var9;
        if (this.field1478.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1478.length;
        int var11 = this.field1477 * arg0;
        int var12 = var9 - 1;
        if (this.field1476 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1467[var15] = this.field1478[var16];
            }
        }
        int[] var17 = this.field1478;
        this.field1478 = Statics.field1467;
        Statics.field1467 = var17;
    }
}
