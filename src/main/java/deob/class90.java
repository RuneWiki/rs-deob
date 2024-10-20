package deob;

@ObfuscatedName("cx")
public class class90 extends class179 {

    @ObfuscatedName("cx.g")
    public int field1521;

    @ObfuscatedName("cx.x")
    public boolean field1519;

    @ObfuscatedName("cx.u")
    public int[] field1530;

    @ObfuscatedName("cx.l")
    public int[] field1524;

    @ObfuscatedName("cx.a")
    public int[] field1526;

    @ObfuscatedName("cx.h")
    public int[] field1523;

    @ObfuscatedName("cx.t")
    public int field1527;

    @ObfuscatedName("cx.m")
    public int field1528;

    @ObfuscatedName("cx.s")
    public int[] field1529;

    @ObfuscatedName("cx.j")
    public boolean field1525 = false;

    public class90(class127 arg0) {
        this.field1521 = arg0.method2327();
        this.field1519 = arg0.method2383() == 1;
        int var2 = arg0.method2383();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1530 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1530[var3] = arg0.method2327();
        }
        if (var2 > 1) {
            this.field1524 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1524[var4] = arg0.method2383();
            }
        }
        if (var2 > 1) {
            this.field1526 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1526[var5] = arg0.method2383();
            }
        }
        this.field1523 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1523[var6] = arg0.method2323();
        }
        this.field1527 = arg0.method2383();
        this.field1528 = arg0.method2383();
        this.field1529 = null;
    }

    @ObfuscatedName("cx.c(DILey;)Z")
    public boolean method1767(double arg0, int arg1, class153 arg2) {
        for (int var5 = 0; var5 < this.field1530.length; var5++) {
            if (arg2.method2947(this.field1530[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1529 = new int[var6];
        for (int var7 = 0; var7 < this.field1530.length; var7++) {
            int var8 = this.field1530[var7];
            byte[] var9 = arg2.method2936(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class84.method1319(var9);
                var10 = true;
            }
            class87 var11;
            if (var10) {
                class87 var12 = new class87();
                var12.field1507 = Statics.field1463;
                var12.field1508 = Statics.field79;
                var12.field1506 = Statics.field1464[0];
                var12.field1501 = Statics.field1465[0];
                var12.field1503 = Statics.field1466[0];
                var12.field1504 = Statics.field1467[0];
                var12.field1502 = Statics.field1462;
                var12.field1505 = Statics.field257[0];
                class84.method2113();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1691();
            byte[] var15 = var11.field1505;
            int[] var16 = var11.field1502;
            int var17 = this.field1523[var7];
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
                var16[var23] = class104.method2039(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1524[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1503 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1529[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1503 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1529[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1503 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1529[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("cx.q()V")
    public void method1768() {
        this.field1529 = null;
    }

    @ObfuscatedName("cx.y(I)V")
    public void method1766(int arg0) {
        if (this.field1529 == null) {
            return;
        }
        if (this.field1527 == 1 || this.field1527 == 3) {
            if (Statics.field1531 == null || Statics.field1531.length < this.field1529.length) {
                Statics.field1531 = new int[this.field1529.length];
            }
            short var2;
            if (this.field1529.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1529.length;
            int var4 = arg0 * var2 * this.field1528;
            int var5 = var3 - 1;
            if (this.field1527 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1531[var6] = this.field1529[var7];
            }
            int[] var8 = this.field1529;
            this.field1529 = Statics.field1531;
            Statics.field1531 = var8;
        }
        if (this.field1527 != 2 && this.field1527 != 4) {
            return;
        }
        if (Statics.field1531 == null || Statics.field1531.length < this.field1529.length) {
            Statics.field1531 = new int[this.field1529.length];
        }
        short var9;
        if (this.field1529.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1529.length;
        int var11 = this.field1528 * arg0;
        int var12 = var9 - 1;
        if (this.field1527 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1531[var15] = this.field1529[var16];
            }
        }
        int[] var17 = this.field1529;
        this.field1529 = Statics.field1531;
        Statics.field1531 = var17;
    }
}
