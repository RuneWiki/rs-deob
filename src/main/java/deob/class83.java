package deob;

@ObfuscatedName("ck")
public class class83 extends class208 {

    @ObfuscatedName("ck.y")
    public int field1430;

    @ObfuscatedName("ck.w")
    public boolean field1428;

    @ObfuscatedName("ck.u")
    public int[] field1432;

    @ObfuscatedName("ck.a")
    public int[] field1433;

    @ObfuscatedName("ck.e")
    public int[] field1434;

    @ObfuscatedName("ck.b")
    public int[] field1435;

    @ObfuscatedName("ck.o")
    public int field1440;

    @ObfuscatedName("ck.m")
    public int field1437;

    @ObfuscatedName("ck.x")
    public int[] field1438;

    @ObfuscatedName("ck.k")
    public boolean field1439 = false;

    public class83(class119 arg0) {
        this.field1430 = arg0.method2359();
        this.field1428 = arg0.method2357() == 1;
        int var2 = arg0.method2357();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1432 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1432[var3] = arg0.method2359();
        }
        if (var2 > 1) {
            this.field1433 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1433[var4] = arg0.method2357();
            }
        }
        if (var2 > 1) {
            this.field1434 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1434[var5] = arg0.method2357();
            }
        }
        this.field1435 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1435[var6] = arg0.method2362();
        }
        this.field1440 = arg0.method2357();
        this.field1437 = arg0.method2357();
        this.field1438 = null;
    }

    @ObfuscatedName("ck.d(DILfn;)Z")
    public boolean method1758(double arg0, int arg1, class167 arg2) {
        for (int var5 = 0; var5 < this.field1432.length; var5++) {
            if (arg2.method3135(this.field1432[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1438 = new int[var6];
        for (int var7 = 0; var7 < this.field1432.length; var7++) {
            class81 var8 = class77.method2733(arg2, this.field1432[var7]);
            var8.method1745();
            byte[] var9 = var8.field1418;
            int[] var10 = var8.field1417;
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
                var10[var17] = class91.method1968(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1433[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1419 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1438[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1419 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1438[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1419 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1438[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ck.p()V")
    public void method1753() {
        this.field1438 = null;
    }

    @ObfuscatedName("ck.v(I)V")
    public void method1754(int arg0) {
        if (this.field1438 == null) {
            return;
        }
        if (this.field1440 == 1 || this.field1440 == 3) {
            if (Statics.field1426 == null || Statics.field1426.length < this.field1438.length) {
                Statics.field1426 = new int[this.field1438.length];
            }
            short var2;
            if (this.field1438.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1438.length;
            int var4 = arg0 * var2 * this.field1437;
            int var5 = var3 - 1;
            if (this.field1440 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1426[var6] = this.field1438[var7];
            }
            int[] var8 = this.field1438;
            this.field1438 = Statics.field1426;
            Statics.field1426 = var8;
        }
        if (this.field1440 != 2 && this.field1440 != 4) {
            return;
        }
        if (Statics.field1426 == null || Statics.field1426.length < this.field1438.length) {
            Statics.field1426 = new int[this.field1438.length];
        }
        short var9;
        if (this.field1438.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1438.length;
        int var11 = this.field1437 * arg0;
        int var12 = var9 - 1;
        if (this.field1440 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1426[var15] = this.field1438[var16];
            }
        }
        int[] var17 = this.field1438;
        this.field1438 = Statics.field1426;
        Statics.field1426 = var17;
    }
}
