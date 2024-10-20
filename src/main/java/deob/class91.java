package deob;

@ObfuscatedName("cu")
public class class91 extends class181 {

    @ObfuscatedName("cu.s")
    public int field1520;

    @ObfuscatedName("cu.d")
    public boolean field1517;

    @ObfuscatedName("cu.e")
    public int[] field1518;

    @ObfuscatedName("cu.u")
    public int[] field1519;

    @ObfuscatedName("cu.q")
    public int[] field1523;

    @ObfuscatedName("cu.o")
    public int[] field1521;

    @ObfuscatedName("cu.v")
    public int field1522;

    @ObfuscatedName("cu.m")
    public int field1514;

    @ObfuscatedName("cu.x")
    public int[] field1524;

    @ObfuscatedName("cu.w")
    public boolean field1525 = false;

    public class91(class128 arg0) {
        this.field1520 = arg0.method2473();
        this.field1517 = arg0.method2531() == 1;
        int var2 = arg0.method2531();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1518 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1518[var3] = arg0.method2473();
        }
        if (var2 > 1) {
            this.field1519 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1519[var4] = arg0.method2531();
            }
        }
        if (var2 > 1) {
            this.field1523 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1523[var5] = arg0.method2531();
            }
        }
        this.field1521 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1521[var6] = arg0.method2468();
        }
        this.field1522 = arg0.method2531();
        this.field1514 = arg0.method2531();
        this.field1524 = null;
    }

    @ObfuscatedName("cu.i(DILeg;)Z")
    public boolean method1857(double arg0, int arg1, class155 arg2) {
        for (int var5 = 0; var5 < this.field1518.length; var5++) {
            if (arg2.method3050(this.field1518[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1524 = new int[var6];
        for (int var7 = 0; var7 < this.field1518.length; var7++) {
            int var8 = this.field1518[var7];
            class88 var9;
            if (class85.method1359(arg2, var8)) {
                class88 var10 = new class88();
                var10.field1497 = Statics.field1475;
                var10.field1503 = Statics.field1469;
                var10.field1500 = Statics.field1470[0];
                var10.field1501 = Statics.field276[0];
                var10.field1498 = Statics.field1289[0];
                var10.field1502 = Statics.field1467[0];
                var10.field1496 = Statics.field967;
                var10.field1499 = Statics.field244[0];
                Statics.field1470 = null;
                Statics.field276 = null;
                Statics.field1289 = null;
                Statics.field1467 = null;
                Statics.field967 = null;
                Statics.field244 = (byte[][]) null;
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method1791();
            byte[] var13 = var9.field1499;
            int[] var14 = var9.field1496;
            int var15 = this.field1521[var7];
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
                var14[var21] = class105.method2163(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1519[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var9.field1498 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1524[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field1498 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1524[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1498 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1524[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("cu.b()V")
    public void method1858() {
        this.field1524 = null;
    }

    @ObfuscatedName("cu.r(I)V")
    public void method1859(int arg0) {
        if (this.field1524 == null) {
            return;
        }
        if (this.field1522 == 1 || this.field1522 == 3) {
            if (Statics.field1526 == null || Statics.field1526.length < this.field1524.length) {
                Statics.field1526 = new int[this.field1524.length];
            }
            short var2;
            if (this.field1524.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1524.length;
            int var4 = arg0 * var2 * this.field1514;
            int var5 = var3 - 1;
            if (this.field1522 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1526[var6] = this.field1524[var7];
            }
            int[] var8 = this.field1524;
            this.field1524 = Statics.field1526;
            Statics.field1526 = var8;
        }
        if (this.field1522 != 2 && this.field1522 != 4) {
            return;
        }
        if (Statics.field1526 == null || Statics.field1526.length < this.field1524.length) {
            Statics.field1526 = new int[this.field1524.length];
        }
        short var9;
        if (this.field1524.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1524.length;
        int var11 = this.field1514 * arg0;
        int var12 = var9 - 1;
        if (this.field1522 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1526[var15] = this.field1524[var16];
            }
        }
        int[] var17 = this.field1524;
        this.field1524 = Statics.field1526;
        Statics.field1526 = var17;
    }
}
