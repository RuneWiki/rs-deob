package deob;

@ObfuscatedName("ct")
public class class87 extends class212 {

    @ObfuscatedName("ct.r")
    public int field1510;

    @ObfuscatedName("ct.a")
    public boolean field1511;

    @ObfuscatedName("ct.b")
    public int[] field1517;

    @ObfuscatedName("ct.u")
    public int[] field1513;

    @ObfuscatedName("ct.o")
    public int[] field1514;

    @ObfuscatedName("ct.p")
    public int[] field1515;

    @ObfuscatedName("ct.i")
    public int field1516;

    @ObfuscatedName("ct.q")
    public int field1520;

    @ObfuscatedName("ct.g")
    public int[] field1518;

    @ObfuscatedName("ct.j")
    public boolean field1519 = false;

    public class87(class123 arg0) {
        this.field1510 = arg0.method2466();
        this.field1511 = arg0.method2464() == 1;
        int var2 = arg0.method2464();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1517 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1517[var3] = arg0.method2466();
        }
        if (var2 > 1) {
            this.field1513 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1513[var4] = arg0.method2464();
            }
        }
        if (var2 > 1) {
            this.field1514 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1514[var5] = arg0.method2464();
            }
        }
        this.field1515 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1515[var6] = arg0.method2468();
        }
        this.field1516 = arg0.method2464();
        this.field1520 = arg0.method2464();
        this.field1518 = null;
    }

    @ObfuscatedName("ct.e(DILfe;)Z")
    public boolean method1876(double arg0, int arg1, class171 arg2) {
        for (int var5 = 0; var5 < this.field1517.length; var5++) {
            if (arg2.method3139(this.field1517[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1518 = new int[var6];
        for (int var7 = 0; var7 < this.field1517.length; var7++) {
            int var8 = this.field1517[var7];
            class84 var9;
            if (class80.method554(arg2, var8)) {
                class84 var10 = new class84();
                var10.field1486 = Statics.field1459;
                var10.field1485 = Statics.field1453;
                var10.field1489 = Statics.field1450[0];
                var10.field1492 = Statics.field193[0];
                var10.field1487 = Statics.field2135[0];
                var10.field1490 = Statics.field2704[0];
                var10.field1488 = Statics.field2942;
                var10.field1491 = Statics.field1627[0];
                class80.method1102();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method1853();
            byte[] var13 = var9.field1491;
            int[] var14 = var9.field1488;
            int var15 = this.field1515[var7];
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
                var14[var21] = class95.method2070(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1513[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var9.field1487 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1518[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field1487 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1518[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1487 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1518[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("ct.l()V")
    public void method1871() {
        this.field1518 = null;
    }

    @ObfuscatedName("ct.c(I)V")
    public void method1872(int arg0) {
        if (this.field1518 == null) {
            return;
        }
        if (this.field1516 == 1 || this.field1516 == 3) {
            if (Statics.field1507 == null || Statics.field1507.length < this.field1518.length) {
                Statics.field1507 = new int[this.field1518.length];
            }
            short var2;
            if (this.field1518.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1518.length;
            int var4 = arg0 * var2 * this.field1520;
            int var5 = var3 - 1;
            if (this.field1516 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1507[var6] = this.field1518[var7];
            }
            int[] var8 = this.field1518;
            this.field1518 = Statics.field1507;
            Statics.field1507 = var8;
        }
        if (this.field1516 != 2 && this.field1516 != 4) {
            return;
        }
        if (Statics.field1507 == null || Statics.field1507.length < this.field1518.length) {
            Statics.field1507 = new int[this.field1518.length];
        }
        short var9;
        if (this.field1518.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1518.length;
        int var11 = this.field1520 * arg0;
        int var12 = var9 - 1;
        if (this.field1516 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1507[var15] = this.field1518[var16];
            }
        }
        int[] var17 = this.field1518;
        this.field1518 = Statics.field1507;
        Statics.field1507 = var17;
    }
}
