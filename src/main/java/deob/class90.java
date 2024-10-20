package deob;

@ObfuscatedName("cp")
public class class90 extends class179 {

    @ObfuscatedName("cp.q")
    public int field1470;

    @ObfuscatedName("cp.j")
    public boolean field1473;

    @ObfuscatedName("cp.v")
    public int[] field1474;

    @ObfuscatedName("cp.w")
    public int[] field1475;

    @ObfuscatedName("cp.l")
    public int[] field1476;

    @ObfuscatedName("cp.s")
    public int[] field1477;

    @ObfuscatedName("cp.n")
    public int field1478;

    @ObfuscatedName("cp.c")
    public int field1472;

    @ObfuscatedName("cp.h")
    public int[] field1471;

    @ObfuscatedName("cp.u")
    public boolean field1480 = false;

    public class90(class127 arg0) {
        this.field1470 = arg0.method2539();
        this.field1473 = arg0.method2484() == 1;
        int var2 = arg0.method2484();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1474 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1474[var3] = arg0.method2539();
        }
        if (var2 > 1) {
            this.field1475 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1475[var4] = arg0.method2484();
            }
        }
        if (var2 > 1) {
            this.field1476 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1476[var5] = arg0.method2484();
            }
        }
        this.field1477 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1477[var6] = arg0.method2415();
        }
        this.field1478 = arg0.method2484();
        this.field1472 = arg0.method2484();
        this.field1471 = null;
    }

    @ObfuscatedName("cp.x(DILej;)Z")
    public boolean method1799(double arg0, int arg1, class152 arg2) {
        for (int var5 = 0; var5 < this.field1474.length; var5++) {
            if (arg2.method2927(this.field1474[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1471 = new int[var6];
        for (int var7 = 0; var7 < this.field1474.length; var7++) {
            int var8 = this.field1474[var7];
            byte[] var9 = arg2.method2925(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class84.method16(var9);
                var10 = true;
            }
            class87 var11;
            if (var10) {
                class87 var12 = new class87();
                var12.field1457 = Statics.field1420;
                var12.field1459 = Statics.field1421;
                var12.field1456 = Statics.field1422[0];
                var12.field1458 = Statics.field1424[0];
                var12.field1454 = Statics.field1426[0];
                var12.field1452 = Statics.field253[0];
                var12.field1455 = Statics.field1425;
                var12.field1453 = Statics.field1419[0];
                class84.method95();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1717();
            byte[] var15 = var11.field1453;
            int[] var16 = var11.field1455;
            int var17 = this.field1477[var7];
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
                var16[var23] = class104.method2093(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1475[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1454 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1471[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1454 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1471[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1454 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1471[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("cp.p()V")
    public void method1804() {
        this.field1471 = null;
    }

    @ObfuscatedName("cp.k(I)V")
    public void method1801(int arg0) {
        if (this.field1471 == null) {
            return;
        }
        if (this.field1478 == 1 || this.field1478 == 3) {
            if (Statics.field1468 == null || Statics.field1468.length < this.field1471.length) {
                Statics.field1468 = new int[this.field1471.length];
            }
            short var2;
            if (this.field1471.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1471.length;
            int var4 = arg0 * var2 * this.field1472;
            int var5 = var3 - 1;
            if (this.field1478 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1468[var6] = this.field1471[var7];
            }
            int[] var8 = this.field1471;
            this.field1471 = Statics.field1468;
            Statics.field1468 = var8;
        }
        if (this.field1478 != 2 && this.field1478 != 4) {
            return;
        }
        if (Statics.field1468 == null || Statics.field1468.length < this.field1471.length) {
            Statics.field1468 = new int[this.field1471.length];
        }
        short var9;
        if (this.field1471.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1471.length;
        int var11 = this.field1472 * arg0;
        int var12 = var9 - 1;
        if (this.field1478 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1468[var15] = this.field1471[var16];
            }
        }
        int[] var17 = this.field1471;
        this.field1471 = Statics.field1468;
        Statics.field1468 = var17;
    }
}
