package deob;

@ObfuscatedName("ct")
public class class89 extends class178 {

    @ObfuscatedName("ct.n")
    public int field1474;

    @ObfuscatedName("ct.q")
    public boolean field1475;

    @ObfuscatedName("ct.a")
    public int[] field1470;

    @ObfuscatedName("ct.g")
    public int[] field1477;

    @ObfuscatedName("ct.j")
    public int[] field1478;

    @ObfuscatedName("ct.l")
    public int[] field1479;

    @ObfuscatedName("ct.w")
    public int field1484;

    @ObfuscatedName("ct.z")
    public int field1481;

    @ObfuscatedName("ct.e")
    public int[] field1480;

    @ObfuscatedName("ct.b")
    public boolean field1483 = false;

    public class89(class126 arg0) {
        this.field1474 = arg0.method2450();
        this.field1475 = arg0.method2559() == 1;
        int var2 = arg0.method2559();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1470 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1470[var3] = arg0.method2450();
        }
        if (var2 > 1) {
            this.field1477 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1477[var4] = arg0.method2559();
            }
        }
        if (var2 > 1) {
            this.field1478 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1478[var5] = arg0.method2559();
            }
        }
        this.field1479 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1479[var6] = arg0.method2526();
        }
        this.field1484 = arg0.method2559();
        this.field1481 = arg0.method2559();
        this.field1480 = null;
    }

    @ObfuscatedName("ct.u(DILeb;)Z")
    public boolean method1846(double arg0, int arg1, class151 arg2) {
        for (int var5 = 0; var5 < this.field1470.length; var5++) {
            if (arg2.method2972(this.field1470[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1480 = new int[var6];
        for (int var7 = 0; var7 < this.field1470.length; var7++) {
            int var8 = this.field1470[var7];
            byte[] var9 = arg2.method3003(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class83.method204(var9);
                var10 = true;
            }
            class86 var11;
            if (var10) {
                class86 var12 = new class86();
                var12.field1460 = Statics.field1425;
                var12.field1458 = Statics.field1426;
                var12.field1461 = Statics.field1427[0];
                var12.field1459 = Statics.field1432[0];
                var12.field1456 = Statics.field1428[0];
                var12.field1457 = Statics.field1429[0];
                var12.field1454 = Statics.field863;
                var12.field1455 = Statics.field120[0];
                Statics.field1427 = null;
                Statics.field1432 = null;
                Statics.field1428 = null;
                Statics.field1429 = null;
                Statics.field863 = null;
                Statics.field120 = (byte[][]) null;
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1774();
            byte[] var15 = var11.field1455;
            int[] var16 = var11.field1454;
            int var17 = this.field1479[var7];
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
                var16[var23] = class103.method2138(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1477[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1456 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1480[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1456 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1480[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1456 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1480[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("ct.k()V")
    public void method1847() {
        this.field1480 = null;
    }

    @ObfuscatedName("ct.x(I)V")
    public void method1848(int arg0) {
        if (this.field1480 == null) {
            return;
        }
        if (this.field1484 == 1 || this.field1484 == 3) {
            if (Statics.field1471 == null || Statics.field1471.length < this.field1480.length) {
                Statics.field1471 = new int[this.field1480.length];
            }
            short var2;
            if (this.field1480.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1480.length;
            int var4 = arg0 * var2 * this.field1481;
            int var5 = var3 - 1;
            if (this.field1484 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1471[var6] = this.field1480[var7];
            }
            int[] var8 = this.field1480;
            this.field1480 = Statics.field1471;
            Statics.field1471 = var8;
        }
        if (this.field1484 != 2 && this.field1484 != 4) {
            return;
        }
        if (Statics.field1471 == null || Statics.field1471.length < this.field1480.length) {
            Statics.field1471 = new int[this.field1480.length];
        }
        short var9;
        if (this.field1480.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1480.length;
        int var11 = this.field1481 * arg0;
        int var12 = var9 - 1;
        if (this.field1484 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1471[var15] = this.field1480[var16];
            }
        }
        int[] var17 = this.field1480;
        this.field1480 = Statics.field1471;
        Statics.field1471 = var17;
    }
}
