package deob;

@ObfuscatedName("cy")
public class class90 extends class179 {

    @ObfuscatedName("cy.e")
    public int field1475;

    @ObfuscatedName("cy.d")
    public boolean field1478;

    @ObfuscatedName("cy.y")
    public int[] field1479;

    @ObfuscatedName("cy.x")
    public int[] field1480;

    @ObfuscatedName("cy.t")
    public int[] field1476;

    @ObfuscatedName("cy.i")
    public int[] field1482;

    @ObfuscatedName("cy.z")
    public int field1483;

    @ObfuscatedName("cy.o")
    public int field1486;

    @ObfuscatedName("cy.u")
    public int[] field1485;

    @ObfuscatedName("cy.f")
    public boolean field1473 = false;

    public class90(class127 arg0) {
        this.field1475 = arg0.method2609();
        this.field1478 = arg0.method2441() == 1;
        int var2 = arg0.method2441();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1479 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1479[var3] = arg0.method2609();
        }
        if (var2 > 1) {
            this.field1480 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1480[var4] = arg0.method2441();
            }
        }
        if (var2 > 1) {
            this.field1476 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1476[var5] = arg0.method2441();
            }
        }
        this.field1482 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1482[var6] = arg0.method2446();
        }
        this.field1483 = arg0.method2441();
        this.field1486 = arg0.method2441();
        this.field1485 = null;
    }

    @ObfuscatedName("cy.j(DILez;)Z")
    public boolean method1841(double arg0, int arg1, class152 arg2) {
        for (int var5 = 0; var5 < this.field1479.length; var5++) {
            if (arg2.method3032(this.field1479[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1485 = new int[var6];
        for (int var7 = 0; var7 < this.field1479.length; var7++) {
            class87 var8 = class84.method2129(arg2, this.field1479[var7]);
            var8.method1763();
            byte[] var9 = var8.field1460;
            int[] var10 = var8.field1464;
            int var11 = this.field1482[var7];
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
                var10[var17] = class104.method2158(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1480[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1459 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1485[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1459 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1485[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1459 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1485[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("cy.r()V")
    public void method1838() {
        this.field1485 = null;
    }

    @ObfuscatedName("cy.v(I)V")
    public void method1839(int arg0) {
        if (this.field1485 == null) {
            return;
        }
        if (this.field1483 == 1 || this.field1483 == 3) {
            if (Statics.field1487 == null || Statics.field1487.length < this.field1485.length) {
                Statics.field1487 = new int[this.field1485.length];
            }
            short var2;
            if (this.field1485.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1485.length;
            int var4 = arg0 * var2 * this.field1486;
            int var5 = var3 - 1;
            if (this.field1483 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1487[var6] = this.field1485[var7];
            }
            int[] var8 = this.field1485;
            this.field1485 = Statics.field1487;
            Statics.field1487 = var8;
        }
        if (this.field1483 != 2 && this.field1483 != 4) {
            return;
        }
        if (Statics.field1487 == null || Statics.field1487.length < this.field1485.length) {
            Statics.field1487 = new int[this.field1485.length];
        }
        short var9;
        if (this.field1485.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1485.length;
        int var11 = this.field1486 * arg0;
        int var12 = var9 - 1;
        if (this.field1483 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1487[var15] = this.field1485[var16];
            }
        }
        int[] var17 = this.field1485;
        this.field1485 = Statics.field1487;
        Statics.field1487 = var17;
    }
}
