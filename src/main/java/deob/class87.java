package deob;

@ObfuscatedName("cw")
public class class87 extends class212 {

    @ObfuscatedName("cw.i")
    public int field1482;

    @ObfuscatedName("cw.b")
    public boolean field1484;

    @ObfuscatedName("cw.l")
    public int[] field1490;

    @ObfuscatedName("cw.m")
    public int[] field1483;

    @ObfuscatedName("cw.p")
    public int[] field1486;

    @ObfuscatedName("cw.f")
    public int[] field1485;

    @ObfuscatedName("cw.d")
    public int field1487;

    @ObfuscatedName("cw.v")
    public int field1488;

    @ObfuscatedName("cw.q")
    public int[] field1489;

    @ObfuscatedName("cw.t")
    public boolean field1491 = false;

    public class87(class123 arg0) {
        this.field1482 = arg0.method2403();
        this.field1484 = arg0.method2408() == 1;
        int var2 = arg0.method2408();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1490 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1490[var3] = arg0.method2403();
        }
        if (var2 > 1) {
            this.field1483 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1483[var4] = arg0.method2408();
            }
        }
        if (var2 > 1) {
            this.field1486 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1486[var5] = arg0.method2408();
            }
        }
        this.field1485 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1485[var6] = arg0.method2413();
        }
        this.field1487 = arg0.method2408();
        this.field1488 = arg0.method2408();
        this.field1489 = null;
    }

    @ObfuscatedName("cw.x(DILfp;)Z")
    public boolean method1809(double arg0, int arg1, class171 arg2) {
        for (int var5 = 0; var5 < this.field1490.length; var5++) {
            if (arg2.method3116(this.field1490[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1489 = new int[var6];
        for (int var7 = 0; var7 < this.field1490.length; var7++) {
            int var8 = this.field1490[var7];
            byte[] var9 = arg2.method3141(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class80.method827(var9);
                var10 = true;
            }
            class84 var11;
            if (var10) {
                class84 var12 = new class84();
                var12.field1461 = Statics.field1423;
                var12.field1456 = Statics.field1420;
                var12.field1462 = Statics.field1422[0];
                var12.field1460 = Statics.field1424[0];
                var12.field1459 = Statics.field568[0];
                var12.field1458 = Statics.field1425[0];
                var12.field1457 = Statics.field1426;
                var12.field1455 = Statics.field192[0];
                class80.method186();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1792();
            byte[] var15 = var11.field1455;
            int[] var16 = var11.field1457;
            int var17 = this.field1485[var7];
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
                var16[var23] = class95.method2015(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1483[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1459 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1489[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1459 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1489[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1459 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1489[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("cw.r()V")
    public void method1810() {
        this.field1489 = null;
    }

    @ObfuscatedName("cw.j(I)V")
    public void method1816(int arg0) {
        if (this.field1489 == null) {
            return;
        }
        if (this.field1487 == 1 || this.field1487 == 3) {
            if (Statics.field1492 == null || Statics.field1492.length < this.field1489.length) {
                Statics.field1492 = new int[this.field1489.length];
            }
            short var2;
            if (this.field1489.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1489.length;
            int var4 = arg0 * var2 * this.field1488;
            int var5 = var3 - 1;
            if (this.field1487 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1492[var6] = this.field1489[var7];
            }
            int[] var8 = this.field1489;
            this.field1489 = Statics.field1492;
            Statics.field1492 = var8;
        }
        if (this.field1487 != 2 && this.field1487 != 4) {
            return;
        }
        if (Statics.field1492 == null || Statics.field1492.length < this.field1489.length) {
            Statics.field1492 = new int[this.field1489.length];
        }
        short var9;
        if (this.field1489.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1489.length;
        int var11 = this.field1488 * arg0;
        int var12 = var9 - 1;
        if (this.field1487 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1492[var15] = this.field1489[var16];
            }
        }
        int[] var17 = this.field1489;
        this.field1489 = Statics.field1492;
        Statics.field1492 = var17;
    }
}
