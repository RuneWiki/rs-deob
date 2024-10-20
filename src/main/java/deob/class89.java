package deob;

@ObfuscatedName("cx")
public class class89 extends class177 {

    @ObfuscatedName("cx.c")
    public int field1488;

    @ObfuscatedName("cx.e")
    public boolean field1485;

    @ObfuscatedName("cx.s")
    public int[] field1486;

    @ObfuscatedName("cx.i")
    public int[] field1487;

    @ObfuscatedName("cx.g")
    public int[] field1490;

    @ObfuscatedName("cx.q")
    public int[] field1489;

    @ObfuscatedName("cx.w")
    public int field1494;

    @ObfuscatedName("cx.k")
    public int field1491;

    @ObfuscatedName("cx.v")
    public int[] field1480;

    @ObfuscatedName("cx.o")
    public boolean field1493 = false;

    public class89(class126 arg0) {
        this.field1488 = arg0.method2405();
        this.field1485 = arg0.method2399() == 1;
        int var2 = arg0.method2399();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1486 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1486[var3] = arg0.method2405();
        }
        if (var2 > 1) {
            this.field1487 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1487[var4] = arg0.method2399();
            }
        }
        if (var2 > 1) {
            this.field1490 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1490[var5] = arg0.method2399();
            }
        }
        this.field1489 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1489[var6] = arg0.method2387();
        }
        this.field1494 = arg0.method2399();
        this.field1491 = arg0.method2399();
        this.field1480 = null;
    }

    @ObfuscatedName("cx.j(DILeh;)Z")
    public boolean method1804(double arg0, int arg1, class150 arg2) {
        for (int var5 = 0; var5 < this.field1486.length; var5++) {
            if (arg2.method2910(this.field1486[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1480 = new int[var6];
        for (int var7 = 0; var7 < this.field1486.length; var7++) {
            int var8 = this.field1486[var7];
            byte[] var9 = arg2.method2908(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class83.method2303(var9);
                var10 = true;
            }
            class86 var11;
            if (var10) {
                var11 = class83.method1551();
            } else {
                var11 = null;
            }
            var11.method1740();
            byte[] var13 = var11.field1465;
            int[] var14 = var11.field1471;
            int var15 = this.field1489[var7];
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
                var14[var21] = class103.method2120(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1487[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var11.field1466 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1480[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field1466 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1480[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1466 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1480[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("cx.y()V")
    public void method1815() {
        this.field1480 = null;
    }

    @ObfuscatedName("cx.x(I)V")
    public void method1806(int arg0) {
        if (this.field1480 == null) {
            return;
        }
        if (this.field1494 == 1 || this.field1494 == 3) {
            if (Statics.field1484 == null || Statics.field1484.length < this.field1480.length) {
                Statics.field1484 = new int[this.field1480.length];
            }
            short var2;
            if (this.field1480.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1480.length;
            int var4 = arg0 * var2 * this.field1491;
            int var5 = var3 - 1;
            if (this.field1494 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1484[var6] = this.field1480[var7];
            }
            int[] var8 = this.field1480;
            this.field1480 = Statics.field1484;
            Statics.field1484 = var8;
        }
        if (this.field1494 != 2 && this.field1494 != 4) {
            return;
        }
        if (Statics.field1484 == null || Statics.field1484.length < this.field1480.length) {
            Statics.field1484 = new int[this.field1480.length];
        }
        short var9;
        if (this.field1480.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1480.length;
        int var11 = this.field1491 * arg0;
        int var12 = var9 - 1;
        if (this.field1494 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1484[var15] = this.field1480[var16];
            }
        }
        int[] var17 = this.field1480;
        this.field1480 = Statics.field1484;
        Statics.field1484 = var17;
    }
}
