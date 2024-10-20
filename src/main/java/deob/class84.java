package deob;

@ObfuscatedName("cr")
public class class84 extends class209 {

    @ObfuscatedName("cr.y")
    public int field1445;

    @ObfuscatedName("cr.k")
    public boolean field1451;

    @ObfuscatedName("cr.r")
    public int[] field1455;

    @ObfuscatedName("cr.p")
    public int[] field1448;

    @ObfuscatedName("cr.q")
    public int[] field1449;

    @ObfuscatedName("cr.m")
    public int[] field1450;

    @ObfuscatedName("cr.e")
    public int field1454;

    @ObfuscatedName("cr.x")
    public int field1452;

    @ObfuscatedName("cr.z")
    public int[] field1442;

    @ObfuscatedName("cr.i")
    public boolean field1453 = false;

    public class84(class120 arg0) {
        this.field1445 = arg0.method2464();
        this.field1451 = arg0.method2462() == 1;
        int var2 = arg0.method2462();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1455 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1455[var3] = arg0.method2464();
        }
        if (var2 > 1) {
            this.field1448 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1448[var4] = arg0.method2462();
            }
        }
        if (var2 > 1) {
            this.field1449 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1449[var5] = arg0.method2462();
            }
        }
        this.field1450 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1450[var6] = arg0.method2467();
        }
        this.field1454 = arg0.method2462();
        this.field1452 = arg0.method2462();
        this.field1442 = null;
    }

    @ObfuscatedName("cr.a(DILft;)Z")
    public boolean method1859(double arg0, int arg1, class168 arg2) {
        for (int var5 = 0; var5 < this.field1455.length; var5++) {
            if (arg2.method3154(this.field1455[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1442 = new int[var6];
        for (int var7 = 0; var7 < this.field1455.length; var7++) {
            class81 var8 = class77.method1169(arg2, this.field1455[var7]);
            var8.method1855();
            byte[] var9 = var8.field1423;
            int[] var10 = var8.field1424;
            int var11 = this.field1450[var7];
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
                var10[var17] = class92.method2047(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1448[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1420 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1442[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1420 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1442[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1420 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1442[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("cr.w()V")
    public void method1858() {
        this.field1442 = null;
    }

    @ObfuscatedName("cr.d(I)V")
    public void method1860(int arg0) {
        if (this.field1442 == null) {
            return;
        }
        if (this.field1454 == 1 || this.field1454 == 3) {
            if (Statics.field1446 == null || Statics.field1446.length < this.field1442.length) {
                Statics.field1446 = new int[this.field1442.length];
            }
            short var2;
            if (this.field1442.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1442.length;
            int var4 = arg0 * var2 * this.field1452;
            int var5 = var3 - 1;
            if (this.field1454 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1446[var6] = this.field1442[var7];
            }
            int[] var8 = this.field1442;
            this.field1442 = Statics.field1446;
            Statics.field1446 = var8;
        }
        if (this.field1454 != 2 && this.field1454 != 4) {
            return;
        }
        if (Statics.field1446 == null || Statics.field1446.length < this.field1442.length) {
            Statics.field1446 = new int[this.field1442.length];
        }
        short var9;
        if (this.field1442.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1442.length;
        int var11 = this.field1452 * arg0;
        int var12 = var9 - 1;
        if (this.field1454 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1446[var15] = this.field1442[var16];
            }
        }
        int[] var17 = this.field1442;
        this.field1442 = Statics.field1446;
        Statics.field1446 = var17;
    }
}
