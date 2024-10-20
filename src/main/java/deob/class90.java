package deob;

@ObfuscatedName("ca")
public class class90 extends class179 {

    @ObfuscatedName("ca.o")
    public int field1491;

    @ObfuscatedName("ca.a")
    public boolean field1492;

    @ObfuscatedName("ca.w")
    public int[] field1493;

    @ObfuscatedName("ca.i")
    public int[] field1494;

    @ObfuscatedName("ca.y")
    public int[] field1495;

    @ObfuscatedName("ca.m")
    public int[] field1496;

    @ObfuscatedName("ca.u")
    public int field1488;

    @ObfuscatedName("ca.s")
    public int field1497;

    @ObfuscatedName("ca.e")
    public int[] field1499;

    @ObfuscatedName("ca.r")
    public boolean field1501 = false;

    public class90(class127 arg0) {
        this.field1491 = arg0.method2581();
        this.field1492 = arg0.method2498() == 1;
        int var2 = arg0.method2498();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1493 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1493[var3] = arg0.method2581();
        }
        if (var2 > 1) {
            this.field1494 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1494[var4] = arg0.method2498();
            }
        }
        if (var2 > 1) {
            this.field1495 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1495[var5] = arg0.method2498();
            }
        }
        this.field1496 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1496[var6] = arg0.method2489();
        }
        this.field1488 = arg0.method2498();
        this.field1497 = arg0.method2498();
        this.field1499 = null;
    }

    @ObfuscatedName("ca.p(DILeh;)Z")
    public boolean method1883(double arg0, int arg1, class153 arg2) {
        for (int var5 = 0; var5 < this.field1493.length; var5++) {
            if (arg2.method3085(this.field1493[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1499 = new int[var6];
        for (int var7 = 0; var7 < this.field1493.length; var7++) {
            int var8 = this.field1493[var7];
            class87 var9;
            if (class84.method1627(arg2, var8)) {
                class87 var10 = new class87();
                var10.field1477 = Statics.field1449;
                var10.field1478 = Statics.field1440;
                var10.field1471 = Statics.field1441[0];
                var10.field1473 = Statics.field1442[0];
                var10.field1474 = Statics.field1443[0];
                var10.field1475 = Statics.field1444[0];
                var10.field1472 = Statics.field1445;
                var10.field1476 = Statics.field1439[0];
                class84.method828();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method1813();
            byte[] var13 = var9.field1476;
            int[] var14 = var9.field1472;
            int var15 = this.field1496[var7];
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
                var14[var21] = class104.method2207(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1494[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var9.field1474 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1499[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field1474 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1499[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1474 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1499[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("ca.l()V")
    public void method1884() {
        this.field1499 = null;
    }

    @ObfuscatedName("ca.d(I)V")
    public void method1885(int arg0) {
        if (this.field1499 == null) {
            return;
        }
        if (this.field1488 == 1 || this.field1488 == 3) {
            if (Statics.field1498 == null || Statics.field1498.length < this.field1499.length) {
                Statics.field1498 = new int[this.field1499.length];
            }
            short var2;
            if (this.field1499.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1499.length;
            int var4 = arg0 * var2 * this.field1497;
            int var5 = var3 - 1;
            if (this.field1488 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1498[var6] = this.field1499[var7];
            }
            int[] var8 = this.field1499;
            this.field1499 = Statics.field1498;
            Statics.field1498 = var8;
        }
        if (this.field1488 != 2 && this.field1488 != 4) {
            return;
        }
        if (Statics.field1498 == null || Statics.field1498.length < this.field1499.length) {
            Statics.field1498 = new int[this.field1499.length];
        }
        short var9;
        if (this.field1499.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1499.length;
        int var11 = this.field1497 * arg0;
        int var12 = var9 - 1;
        if (this.field1488 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1498[var15] = this.field1499[var16];
            }
        }
        int[] var17 = this.field1499;
        this.field1499 = Statics.field1498;
        Statics.field1498 = var17;
    }
}
