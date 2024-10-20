package deob;

@ObfuscatedName("cu")
public class class90 extends class179 {

    @ObfuscatedName("cu.n")
    public int field1491;

    @ObfuscatedName("cu.s")
    public boolean field1498;

    @ObfuscatedName("cu.x")
    public int[] field1493;

    @ObfuscatedName("cu.b")
    public int[] field1494;

    @ObfuscatedName("cu.j")
    public int[] field1495;

    @ObfuscatedName("cu.p")
    public int[] field1496;

    @ObfuscatedName("cu.l")
    public int field1497;

    @ObfuscatedName("cu.i")
    public int field1489;

    @ObfuscatedName("cu.r")
    public int[] field1499;

    @ObfuscatedName("cu.o")
    public boolean field1500 = false;

    public class90(class127 arg0) {
        this.field1491 = arg0.method2460();
        this.field1498 = arg0.method2534() == 1;
        int var2 = arg0.method2534();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1493 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1493[var3] = arg0.method2460();
        }
        if (var2 > 1) {
            this.field1494 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1494[var4] = arg0.method2534();
            }
        }
        if (var2 > 1) {
            this.field1495 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1495[var5] = arg0.method2534();
            }
        }
        this.field1496 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1496[var6] = arg0.method2628();
        }
        this.field1497 = arg0.method2534();
        this.field1489 = arg0.method2534();
        this.field1499 = null;
    }

    @ObfuscatedName("cu.y(DILel;)Z")
    public boolean method1860(double arg0, int arg1, class152 arg2) {
        for (int var5 = 0; var5 < this.field1493.length; var5++) {
            if (arg2.method2998(this.field1493[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1499 = new int[var6];
        for (int var7 = 0; var7 < this.field1493.length; var7++) {
            int var8 = this.field1493[var7];
            class87 var9;
            if (class84.method1422(arg2, var8)) {
                var9 = class84.method215();
            } else {
                var9 = null;
            }
            var9.method1782();
            byte[] var11 = var9.field1477;
            int[] var12 = var9.field1472;
            int var13 = this.field1496[var7];
            if ((var13 & 0xFF000000) == 16777216) {
            }
            if ((var13 & 0xFF000000) == 33554432) {
            }
            if ((var13 & 0xFF000000) == 50331648) {
                int var14 = var13 & 0xFF00FF;
                int var15 = var13 >> 8 & 0xFF;
                for (int var16 = 0; var16 < var12.length; var16++) {
                    int var17 = var12[var16];
                    if (var17 >> 8 == (var17 & 0xFFFF)) {
                        int var18 = var17 & 0xFF;
                        var12[var16] = var14 * var18 >> 8 & 0xFF00FF | var15 * var18 & 0xFF00;
                    }
                }
            }
            for (int var19 = 0; var19 < var12.length; var19++) {
                var12[var19] = class104.method2151(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1494[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var20 == 0) {
                if (var9.field1473 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1499[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field1473 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1499[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1473 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1499[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var20 == 1) {
            }
            if (var20 == 2) {
            }
            if (var20 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("cu.m()V")
    public void method1861() {
        this.field1499 = null;
    }

    @ObfuscatedName("cu.d(I)V")
    public void method1862(int arg0) {
        if (this.field1499 == null) {
            return;
        }
        if (this.field1497 == 1 || this.field1497 == 3) {
            if (Statics.field1501 == null || Statics.field1501.length < this.field1499.length) {
                Statics.field1501 = new int[this.field1499.length];
            }
            short var2;
            if (this.field1499.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1499.length;
            int var4 = arg0 * var2 * this.field1489;
            int var5 = var3 - 1;
            if (this.field1497 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1501[var6] = this.field1499[var7];
            }
            int[] var8 = this.field1499;
            this.field1499 = Statics.field1501;
            Statics.field1501 = var8;
        }
        if (this.field1497 != 2 && this.field1497 != 4) {
            return;
        }
        if (Statics.field1501 == null || Statics.field1501.length < this.field1499.length) {
            Statics.field1501 = new int[this.field1499.length];
        }
        short var9;
        if (this.field1499.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1499.length;
        int var11 = this.field1489 * arg0;
        int var12 = var9 - 1;
        if (this.field1497 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1501[var15] = this.field1499[var16];
            }
        }
        int[] var17 = this.field1499;
        this.field1499 = Statics.field1501;
        Statics.field1501 = var17;
    }
}
