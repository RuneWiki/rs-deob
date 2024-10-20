package deob;

@ObfuscatedName("cq")
public class class90 extends class179 {

    @ObfuscatedName("cq.k")
    public int field1473;

    @ObfuscatedName("cq.x")
    public boolean field1474;

    @ObfuscatedName("cq.v")
    public int[] field1476;

    @ObfuscatedName("cq.g")
    public int[] field1469;

    @ObfuscatedName("cq.n")
    public int[] field1477;

    @ObfuscatedName("cq.q")
    public int[] field1478;

    @ObfuscatedName("cq.i")
    public int field1479;

    @ObfuscatedName("cq.p")
    public int field1480;

    @ObfuscatedName("cq.e")
    public int[] field1472;

    @ObfuscatedName("cq.o")
    public boolean field1482 = false;

    public class90(class126 arg0) {
        this.field1473 = arg0.method2373();
        this.field1474 = arg0.method2481() == 1;
        int var2 = arg0.method2481();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1476 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1476[var3] = arg0.method2373();
        }
        if (var2 > 1) {
            this.field1469 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1469[var4] = arg0.method2481();
            }
        }
        if (var2 > 1) {
            this.field1477 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1477[var5] = arg0.method2481();
            }
        }
        this.field1478 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1478[var6] = arg0.method2383();
        }
        this.field1479 = arg0.method2481();
        this.field1480 = arg0.method2481();
        this.field1472 = null;
    }

    @ObfuscatedName("cq.a(DILev;)Z")
    public boolean method1784(double arg0, int arg1, class152 arg2) {
        for (int var5 = 0; var5 < this.field1476.length; var5++) {
            if (arg2.method2950(this.field1476[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1472 = new int[var6];
        for (int var7 = 0; var7 < this.field1476.length; var7++) {
            int var8 = this.field1476[var7];
            class87 var9;
            if (class84.method28(arg2, var8)) {
                class87 var10 = new class87();
                var10.field1455 = Statics.field375;
                var10.field1460 = Statics.field1901;
                var10.field1457 = Statics.field1424[0];
                var10.field1458 = Statics.field1425[0];
                var10.field1459 = Statics.field1430[0];
                var10.field1453 = Statics.field1413[0];
                var10.field1456 = Statics.field1427;
                var10.field1454 = Statics.field1428[0];
                Statics.field1424 = null;
                Statics.field1425 = null;
                Statics.field1430 = null;
                Statics.field1413 = null;
                Statics.field1427 = null;
                Statics.field1428 = (byte[][]) null;
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method1710();
            byte[] var13 = var9.field1454;
            int[] var14 = var9.field1456;
            int var15 = this.field1478[var7];
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
                var14[var21] = class104.method2087(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1469[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var9.field1459 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1472[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field1459 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1472[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1459 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1472[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("cq.r()V")
    public void method1785() {
        this.field1472 = null;
    }

    @ObfuscatedName("cq.u(I)V")
    public void method1786(int arg0) {
        if (this.field1472 == null) {
            return;
        }
        if (this.field1479 == 1 || this.field1479 == 3) {
            if (Statics.field1483 == null || Statics.field1483.length < this.field1472.length) {
                Statics.field1483 = new int[this.field1472.length];
            }
            short var2;
            if (this.field1472.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1472.length;
            int var4 = arg0 * var2 * this.field1480;
            int var5 = var3 - 1;
            if (this.field1479 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1483[var6] = this.field1472[var7];
            }
            int[] var8 = this.field1472;
            this.field1472 = Statics.field1483;
            Statics.field1483 = var8;
        }
        if (this.field1479 != 2 && this.field1479 != 4) {
            return;
        }
        if (Statics.field1483 == null || Statics.field1483.length < this.field1472.length) {
            Statics.field1483 = new int[this.field1472.length];
        }
        short var9;
        if (this.field1472.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1472.length;
        int var11 = this.field1480 * arg0;
        int var12 = var9 - 1;
        if (this.field1479 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1483[var15] = this.field1472[var16];
            }
        }
        int[] var17 = this.field1472;
        this.field1472 = Statics.field1483;
        Statics.field1483 = var17;
    }
}
