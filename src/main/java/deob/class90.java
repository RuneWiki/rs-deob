package deob;

@ObfuscatedName("cs")
public class class90 extends class179 {

    @ObfuscatedName("cs.l")
    public int field1511;

    @ObfuscatedName("cs.v")
    public boolean field1500;

    @ObfuscatedName("cs.g")
    public int[] field1503;

    @ObfuscatedName("cs.x")
    public int[] field1502;

    @ObfuscatedName("cs.c")
    public int[] field1505;

    @ObfuscatedName("cs.f")
    public int[] field1506;

    @ObfuscatedName("cs.r")
    public int field1507;

    @ObfuscatedName("cs.d")
    public int field1508;

    @ObfuscatedName("cs.a")
    public int[] field1497;

    @ObfuscatedName("cs.q")
    public boolean field1510 = false;

    public class90(class127 arg0) {
        this.field1511 = arg0.method2652();
        this.field1500 = arg0.method2659() == 1;
        int var2 = arg0.method2659();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1503 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1503[var3] = arg0.method2652();
        }
        if (var2 > 1) {
            this.field1502 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1502[var4] = arg0.method2659();
            }
        }
        if (var2 > 1) {
            this.field1505 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1505[var5] = arg0.method2659();
            }
        }
        this.field1506 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1506[var6] = arg0.method2551();
        }
        this.field1507 = arg0.method2659();
        this.field1508 = arg0.method2659();
        this.field1497 = null;
    }

    @ObfuscatedName("cs.p(DILep;)Z")
    public boolean method1903(double arg0, int arg1, class152 arg2) {
        for (int var5 = 0; var5 < this.field1503.length; var5++) {
            if (arg2.method3032(this.field1503[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1497 = new int[var6];
        for (int var7 = 0; var7 < this.field1503.length; var7++) {
            int var8 = this.field1503[var7];
            byte[] var9 = arg2.method3070(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class84.method151(var9);
                var10 = true;
            }
            class87 var11;
            if (var10) {
                var11 = class84.method1218();
            } else {
                var11 = null;
            }
            var11.method1819();
            byte[] var13 = var11.field1487;
            int[] var14 = var11.field1482;
            int var15 = this.field1506[var7];
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
                var14[var21] = class104.method2168(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1502[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var11.field1485 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1497[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field1485 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1497[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1485 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1497[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("cs.i()V")
    public void method1905() {
        this.field1497 = null;
    }

    @ObfuscatedName("cs.o(I)V")
    public void method1904(int arg0) {
        if (this.field1497 == null) {
            return;
        }
        if (this.field1507 == 1 || this.field1507 == 3) {
            if (Statics.field1509 == null || Statics.field1509.length < this.field1497.length) {
                Statics.field1509 = new int[this.field1497.length];
            }
            short var2;
            if (this.field1497.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1497.length;
            int var4 = arg0 * var2 * this.field1508;
            int var5 = var3 - 1;
            if (this.field1507 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1509[var6] = this.field1497[var7];
            }
            int[] var8 = this.field1497;
            this.field1497 = Statics.field1509;
            Statics.field1509 = var8;
        }
        if (this.field1507 != 2 && this.field1507 != 4) {
            return;
        }
        if (Statics.field1509 == null || Statics.field1509.length < this.field1497.length) {
            Statics.field1509 = new int[this.field1497.length];
        }
        short var9;
        if (this.field1497.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1497.length;
        int var11 = this.field1508 * arg0;
        int var12 = var9 - 1;
        if (this.field1507 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1509[var15] = this.field1497[var16];
            }
        }
        int[] var17 = this.field1497;
        this.field1497 = Statics.field1509;
        Statics.field1509 = var17;
    }
}
