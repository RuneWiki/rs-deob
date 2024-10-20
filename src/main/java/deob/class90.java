package deob;

@ObfuscatedName("co")
public class class90 extends class180 {

    @ObfuscatedName("co.r")
    public int field1489;

    @ObfuscatedName("co.k")
    public boolean field1497;

    @ObfuscatedName("co.z")
    public int[] field1496;

    @ObfuscatedName("co.g")
    public int[] field1492;

    @ObfuscatedName("co.n")
    public int[] field1493;

    @ObfuscatedName("co.j")
    public int[] field1494;

    @ObfuscatedName("co.c")
    public int field1495;

    @ObfuscatedName("co.m")
    public int field1486;

    @ObfuscatedName("co.a")
    public int[] field1487;

    @ObfuscatedName("co.e")
    public boolean field1498 = false;

    public class90(class127 arg0) {
        this.field1489 = arg0.method2442();
        this.field1497 = arg0.method2440() == 1;
        int var2 = arg0.method2440();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1496 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1496[var3] = arg0.method2442();
        }
        if (var2 > 1) {
            this.field1492 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1492[var4] = arg0.method2440();
            }
        }
        if (var2 > 1) {
            this.field1493 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1493[var5] = arg0.method2440();
            }
        }
        this.field1494 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1494[var6] = arg0.method2586();
        }
        this.field1495 = arg0.method2440();
        this.field1486 = arg0.method2440();
        this.field1487 = null;
    }

    @ObfuscatedName("co.l(DILem;)Z")
    public boolean method1827(double arg0, int arg1, class154 arg2) {
        for (int var5 = 0; var5 < this.field1496.length; var5++) {
            if (arg2.method3036(this.field1496[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1487 = new int[var6];
        for (int var7 = 0; var7 < this.field1496.length; var7++) {
            class87 var8 = class84.method1370(arg2, this.field1496[var7]);
            var8.method1763();
            byte[] var9 = var8.field1475;
            int[] var10 = var8.field1470;
            int var11 = this.field1494[var7];
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
                var10[var17] = class104.method2123(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1492[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1473 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1487[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1473 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1487[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1473 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1487[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("co.b()V")
    public void method1828() {
        this.field1487 = null;
    }

    @ObfuscatedName("co.o(I)V")
    public void method1829(int arg0) {
        if (this.field1487 == null) {
            return;
        }
        if (this.field1495 == 1 || this.field1495 == 3) {
            if (Statics.field1499 == null || Statics.field1499.length < this.field1487.length) {
                Statics.field1499 = new int[this.field1487.length];
            }
            short var2;
            if (this.field1487.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1487.length;
            int var4 = arg0 * var2 * this.field1486;
            int var5 = var3 - 1;
            if (this.field1495 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1499[var6] = this.field1487[var7];
            }
            int[] var8 = this.field1487;
            this.field1487 = Statics.field1499;
            Statics.field1499 = var8;
        }
        if (this.field1495 != 2 && this.field1495 != 4) {
            return;
        }
        if (Statics.field1499 == null || Statics.field1499.length < this.field1487.length) {
            Statics.field1499 = new int[this.field1487.length];
        }
        short var9;
        if (this.field1487.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1487.length;
        int var11 = this.field1486 * arg0;
        int var12 = var9 - 1;
        if (this.field1495 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1499[var15] = this.field1487[var16];
            }
        }
        int[] var17 = this.field1487;
        this.field1487 = Statics.field1499;
        Statics.field1499 = var17;
    }
}
