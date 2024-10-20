package deob;

@ObfuscatedName("cc")
public class class90 extends class179 {

    @ObfuscatedName("cc.q")
    public int field1507;

    @ObfuscatedName("cc.b")
    public boolean field1506;

    @ObfuscatedName("cc.u")
    public int[] field1509;

    @ObfuscatedName("cc.d")
    public int[] field1510;

    @ObfuscatedName("cc.m")
    public int[] field1511;

    @ObfuscatedName("cc.v")
    public int[] field1514;

    @ObfuscatedName("cc.j")
    public int field1513;

    @ObfuscatedName("cc.f")
    public int field1512;

    @ObfuscatedName("cc.h")
    public int[] field1505;

    @ObfuscatedName("cc.o")
    public boolean field1516 = false;

    public class90(class127 arg0) {
        this.field1507 = arg0.method2413();
        this.field1506 = arg0.method2411() == 1;
        int var2 = arg0.method2411();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1509 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1509[var3] = arg0.method2413();
        }
        if (var2 > 1) {
            this.field1510 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1510[var4] = arg0.method2411();
            }
        }
        if (var2 > 1) {
            this.field1511 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1511[var5] = arg0.method2411();
            }
        }
        this.field1514 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1514[var6] = arg0.method2416();
        }
        this.field1513 = arg0.method2411();
        this.field1512 = arg0.method2411();
        this.field1505 = null;
    }

    @ObfuscatedName("cc.i(DILef;)Z")
    public boolean method1774(double arg0, int arg1, class152 arg2) {
        for (int var5 = 0; var5 < this.field1509.length; var5++) {
            if (arg2.method2942(this.field1509[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1505 = new int[var6];
        for (int var7 = 0; var7 < this.field1509.length; var7++) {
            int var8 = this.field1509[var7];
            byte[] var9 = arg2.method2940(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class84.method214(var9);
                var10 = true;
            }
            class87 var11;
            if (var10) {
                class87 var12 = new class87();
                var12.field1493 = Statics.field1271;
                var12.field1491 = Statics.field1462;
                var12.field1488 = Statics.field1468[0];
                var12.field1492 = Statics.field1464[0];
                var12.field1494 = Statics.field1465[0];
                var12.field1490 = Statics.field1466[0];
                var12.field1487 = Statics.field2732;
                var12.field1489 = Statics.field1467[0];
                class84.method875();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1706();
            byte[] var15 = var11.field1489;
            int[] var16 = var11.field1487;
            int var17 = this.field1514[var7];
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
                var16[var23] = class104.method2069(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1510[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1494 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1505[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1494 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1505[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1494 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1505[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("cc.p()V")
    public void method1782() {
        this.field1505 = null;
    }

    @ObfuscatedName("cc.a(I)V")
    public void method1776(int arg0) {
        if (this.field1505 == null) {
            return;
        }
        if (this.field1513 == 1 || this.field1513 == 3) {
            if (Statics.field1517 == null || Statics.field1517.length < this.field1505.length) {
                Statics.field1517 = new int[this.field1505.length];
            }
            short var2;
            if (this.field1505.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1505.length;
            int var4 = arg0 * var2 * this.field1512;
            int var5 = var3 - 1;
            if (this.field1513 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1517[var6] = this.field1505[var7];
            }
            int[] var8 = this.field1505;
            this.field1505 = Statics.field1517;
            Statics.field1517 = var8;
        }
        if (this.field1513 != 2 && this.field1513 != 4) {
            return;
        }
        if (Statics.field1517 == null || Statics.field1517.length < this.field1505.length) {
            Statics.field1517 = new int[this.field1505.length];
        }
        short var9;
        if (this.field1505.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1505.length;
        int var11 = this.field1512 * arg0;
        int var12 = var9 - 1;
        if (this.field1513 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1517[var15] = this.field1505[var16];
            }
        }
        int[] var17 = this.field1505;
        this.field1505 = Statics.field1517;
        Statics.field1517 = var17;
    }
}
