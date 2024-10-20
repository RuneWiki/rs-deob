package deob;

@ObfuscatedName("ce")
public class class87 extends class212 {

    @ObfuscatedName("ce.v")
    public int field1502;

    @ObfuscatedName("ce.j")
    public boolean field1509;

    @ObfuscatedName("ce.m")
    public int[] field1503;

    @ObfuscatedName("ce.y")
    public int[] field1504;

    @ObfuscatedName("ce.u")
    public int[] field1508;

    @ObfuscatedName("ce.h")
    public int[] field1506;

    @ObfuscatedName("ce.l")
    public int field1507;

    @ObfuscatedName("ce.b")
    public int field1497;

    @ObfuscatedName("ce.g")
    public int[] field1505;

    @ObfuscatedName("ce.e")
    public boolean field1501 = false;

    public class87(class123 arg0) {
        this.field1502 = arg0.method2547();
        this.field1509 = arg0.method2427() == 1;
        int var2 = arg0.method2427();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1503 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1503[var3] = arg0.method2547();
        }
        if (var2 > 1) {
            this.field1504 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1504[var4] = arg0.method2427();
            }
        }
        if (var2 > 1) {
            this.field1508 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1508[var5] = arg0.method2427();
            }
        }
        this.field1506 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1506[var6] = arg0.method2432();
        }
        this.field1507 = arg0.method2427();
        this.field1497 = arg0.method2427();
        this.field1505 = null;
    }

    @ObfuscatedName("ce.k(DILfo;)Z")
    public boolean method1824(double arg0, int arg1, class171 arg2) {
        for (int var5 = 0; var5 < this.field1503.length; var5++) {
            if (arg2.method3079(this.field1503[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1505 = new int[var6];
        for (int var7 = 0; var7 < this.field1503.length; var7++) {
            class84 var8 = class80.method2344(arg2, this.field1503[var7]);
            var8.method1818();
            byte[] var9 = var8.field1479;
            int[] var10 = var8.field1475;
            int var11 = this.field1506[var7];
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
                var10[var17] = class95.method2085(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1504[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1477 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1505[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1477 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1505[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1477 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1505[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ce.q()V")
    public void method1826() {
        this.field1505 = null;
    }

    @ObfuscatedName("ce.f(I)V")
    public void method1825(int arg0) {
        if (this.field1505 == null) {
            return;
        }
        if (this.field1507 == 1 || this.field1507 == 3) {
            if (Statics.field1511 == null || Statics.field1511.length < this.field1505.length) {
                Statics.field1511 = new int[this.field1505.length];
            }
            short var2;
            if (this.field1505.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1505.length;
            int var4 = arg0 * var2 * this.field1497;
            int var5 = var3 - 1;
            if (this.field1507 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1511[var6] = this.field1505[var7];
            }
            int[] var8 = this.field1505;
            this.field1505 = Statics.field1511;
            Statics.field1511 = var8;
        }
        if (this.field1507 != 2 && this.field1507 != 4) {
            return;
        }
        if (Statics.field1511 == null || Statics.field1511.length < this.field1505.length) {
            Statics.field1511 = new int[this.field1505.length];
        }
        short var9;
        if (this.field1505.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1505.length;
        int var11 = this.field1497 * arg0;
        int var12 = var9 - 1;
        if (this.field1507 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1511[var15] = this.field1505[var16];
            }
        }
        int[] var17 = this.field1505;
        this.field1505 = Statics.field1511;
        Statics.field1511 = var17;
    }
}
