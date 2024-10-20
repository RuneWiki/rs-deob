package deob;

@ObfuscatedName("cf")
public class class84 extends class209 {

    @ObfuscatedName("cf.x")
    public int field1429;

    @ObfuscatedName("cf.e")
    public boolean field1430;

    @ObfuscatedName("cf.i")
    public int[] field1427;

    @ObfuscatedName("cf.c")
    public int[] field1432;

    @ObfuscatedName("cf.n")
    public int[] field1433;

    @ObfuscatedName("cf.l")
    public int[] field1435;

    @ObfuscatedName("cf.u")
    public int field1434;

    @ObfuscatedName("cf.r")
    public int field1436;

    @ObfuscatedName("cf.a")
    public int[] field1437;

    @ObfuscatedName("cf.d")
    public boolean field1428 = false;

    public class84(class120 arg0) {
        this.field1429 = arg0.method2363();
        this.field1430 = arg0.method2361() == 1;
        int var2 = arg0.method2361();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1427 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1427[var3] = arg0.method2363();
        }
        if (var2 > 1) {
            this.field1432 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1432[var4] = arg0.method2361();
            }
        }
        if (var2 > 1) {
            this.field1433 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1433[var5] = arg0.method2361();
            }
        }
        this.field1435 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1435[var6] = arg0.method2366();
        }
        this.field1434 = arg0.method2361();
        this.field1436 = arg0.method2361();
        this.field1437 = null;
    }

    @ObfuscatedName("cf.j(DILfy;)Z")
    public boolean method1770(double arg0, int arg1, class168 arg2) {
        for (int var5 = 0; var5 < this.field1427.length; var5++) {
            if (arg2.method3018(this.field1427[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1437 = new int[var6];
        for (int var7 = 0; var7 < this.field1427.length; var7++) {
            class81 var8 = class77.method1055(arg2, this.field1427[var7]);
            var8.method1756();
            byte[] var9 = var8.field1403;
            int[] var10 = var8.field1406;
            int var11 = this.field1435[var7];
            if ((var11 & 0xFF000000) == 16777216) {
            }
            if ((var11 & 0xFF000000) == 33554432) {
            }
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class92.method1980(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1432[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1404 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1437[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1404 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1437[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1404 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1437[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var18 == 1) {
            }
            if (var18 == 2) {
            }
            if (var18 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("cf.h()V")
    public void method1772() {
        this.field1437 = null;
    }

    @ObfuscatedName("cf.m(I)V")
    public void method1773(int arg0) {
        if (this.field1437 == null) {
            return;
        }
        if (this.field1434 == 1 || this.field1434 == 3) {
            if (Statics.field1439 == null || Statics.field1439.length < this.field1437.length) {
                Statics.field1439 = new int[this.field1437.length];
            }
            short var2;
            if (this.field1437.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1437.length;
            int var4 = arg0 * var2 * this.field1436;
            int var5 = var3 - 1;
            if (this.field1434 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1439[var6] = this.field1437[var7];
            }
            int[] var8 = this.field1437;
            this.field1437 = Statics.field1439;
            Statics.field1439 = var8;
        }
        if (this.field1434 != 2 && this.field1434 != 4) {
            return;
        }
        if (Statics.field1439 == null || Statics.field1439.length < this.field1437.length) {
            Statics.field1439 = new int[this.field1437.length];
        }
        short var9;
        if (this.field1437.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1437.length;
        int var11 = this.field1436 * arg0;
        int var12 = var9 - 1;
        if (this.field1434 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1439[var15] = this.field1437[var16];
            }
        }
        int[] var17 = this.field1437;
        this.field1437 = Statics.field1439;
        Statics.field1439 = var17;
    }
}
