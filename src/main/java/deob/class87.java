package deob;

@ObfuscatedName("co")
public class class87 extends class212 {

    @ObfuscatedName("co.p")
    public int field1486;

    @ObfuscatedName("co.g")
    public boolean field1491;

    @ObfuscatedName("co.m")
    public int[] field1489;

    @ObfuscatedName("co.f")
    public int[] field1488;

    @ObfuscatedName("co.k")
    public int[] field1481;

    @ObfuscatedName("co.h")
    public int[] field1490;

    @ObfuscatedName("co.r")
    public int field1493;

    @ObfuscatedName("co.w")
    public int field1492;

    @ObfuscatedName("co.u")
    public int[] field1482;

    @ObfuscatedName("co.n")
    public boolean field1494 = false;

    public class87(class123 arg0) {
        this.field1486 = arg0.method2550();
        this.field1491 = arg0.method2363() == 1;
        int var2 = arg0.method2363();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1489 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1489[var3] = arg0.method2550();
        }
        if (var2 > 1) {
            this.field1488 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1488[var4] = arg0.method2363();
            }
        }
        if (var2 > 1) {
            this.field1481 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1481[var5] = arg0.method2363();
            }
        }
        this.field1490 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1490[var6] = arg0.method2408();
        }
        this.field1493 = arg0.method2363();
        this.field1492 = arg0.method2363();
        this.field1482 = null;
    }

    @ObfuscatedName("co.s(DILfu;)Z")
    public boolean method1803(double arg0, int arg1, class171 arg2) {
        for (int var5 = 0; var5 < this.field1489.length; var5++) {
            if (arg2.method3076(this.field1489[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1482 = new int[var6];
        for (int var7 = 0; var7 < this.field1489.length; var7++) {
            int var8 = this.field1489[var7];
            byte[] var9 = arg2.method3121(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                Statics.method1(var9);
                var10 = true;
            }
            class84 var11;
            if (var10) {
                var11 = class80.method2162();
            } else {
                var11 = null;
            }
            var11.method1788();
            byte[] var13 = var11.field1463;
            int[] var14 = var11.field1460;
            int var15 = this.field1490[var7];
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
                var14[var21] = class95.method2003(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1488[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var11.field1462 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1482[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field1462 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1482[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1462 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1482[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("co.z()V")
    public void method1807() {
        this.field1482 = null;
    }

    @ObfuscatedName("co.t(I)V")
    public void method1805(int arg0) {
        if (this.field1482 == null) {
            return;
        }
        if (this.field1493 == 1 || this.field1493 == 3) {
            if (Statics.field1495 == null || Statics.field1495.length < this.field1482.length) {
                Statics.field1495 = new int[this.field1482.length];
            }
            short var2;
            if (this.field1482.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1482.length;
            int var4 = arg0 * var2 * this.field1492;
            int var5 = var3 - 1;
            if (this.field1493 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1495[var6] = this.field1482[var7];
            }
            int[] var8 = this.field1482;
            this.field1482 = Statics.field1495;
            Statics.field1495 = var8;
        }
        if (this.field1493 != 2 && this.field1493 != 4) {
            return;
        }
        if (Statics.field1495 == null || Statics.field1495.length < this.field1482.length) {
            Statics.field1495 = new int[this.field1482.length];
        }
        short var9;
        if (this.field1482.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1482.length;
        int var11 = this.field1492 * arg0;
        int var12 = var9 - 1;
        if (this.field1493 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1495[var15] = this.field1482[var16];
            }
        }
        int[] var17 = this.field1482;
        this.field1482 = Statics.field1495;
        Statics.field1495 = var17;
    }
}
