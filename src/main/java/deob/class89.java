package deob;

@ObfuscatedName("cq")
public class class89 extends class177 {

    @ObfuscatedName("cq.i")
    public int field1486;

    @ObfuscatedName("cq.o")
    public boolean field1487;

    @ObfuscatedName("cq.l")
    public int[] field1496;

    @ObfuscatedName("cq.p")
    public int[] field1489;

    @ObfuscatedName("cq.t")
    public int[] field1483;

    @ObfuscatedName("cq.w")
    public int[] field1482;

    @ObfuscatedName("cq.r")
    public int field1492;

    @ObfuscatedName("cq.a")
    public int field1484;

    @ObfuscatedName("cq.q")
    public int[] field1494;

    @ObfuscatedName("cq.z")
    public boolean field1495 = false;

    public class89(class126 arg0) {
        this.field1486 = arg0.method2487();
        this.field1487 = arg0.method2485() == 1;
        int var2 = arg0.method2485();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1496 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1496[var3] = arg0.method2487();
        }
        if (var2 > 1) {
            this.field1489 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1489[var4] = arg0.method2485();
            }
        }
        if (var2 > 1) {
            this.field1483 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1483[var5] = arg0.method2485();
            }
        }
        this.field1482 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1482[var6] = arg0.method2593();
        }
        this.field1492 = arg0.method2485();
        this.field1484 = arg0.method2485();
        this.field1494 = null;
    }

    @ObfuscatedName("cq.g(DILez;)Z")
    public boolean method1854(double arg0, int arg1, class150 arg2) {
        for (int var5 = 0; var5 < this.field1496.length; var5++) {
            if (arg2.method3019(this.field1496[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1494 = new int[var6];
        for (int var7 = 0; var7 < this.field1496.length; var7++) {
            int var8 = this.field1496[var7];
            class86 var9;
            if (class83.method215(arg2, var8)) {
                var9 = class83.method1400();
            } else {
                var9 = null;
            }
            var9.method1774();
            byte[] var11 = var9.field1470;
            int[] var12 = var9.field1466;
            int var13 = this.field1482[var7];
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
                var12[var19] = class103.method2173(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1489[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var20 == 0) {
                if (var9.field1468 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1494[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field1468 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1494[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1468 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1494[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("cq.e()V")
    public void method1862() {
        this.field1494 = null;
    }

    @ObfuscatedName("cq.n(I)V")
    public void method1864(int arg0) {
        if (this.field1494 == null) {
            return;
        }
        if (this.field1492 == 1 || this.field1492 == 3) {
            if (Statics.field1491 == null || Statics.field1491.length < this.field1494.length) {
                Statics.field1491 = new int[this.field1494.length];
            }
            short var2;
            if (this.field1494.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1494.length;
            int var4 = arg0 * var2 * this.field1484;
            int var5 = var3 - 1;
            if (this.field1492 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1491[var6] = this.field1494[var7];
            }
            int[] var8 = this.field1494;
            this.field1494 = Statics.field1491;
            Statics.field1491 = var8;
        }
        if (this.field1492 != 2 && this.field1492 != 4) {
            return;
        }
        if (Statics.field1491 == null || Statics.field1491.length < this.field1494.length) {
            Statics.field1491 = new int[this.field1494.length];
        }
        short var9;
        if (this.field1494.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1494.length;
        int var11 = this.field1484 * arg0;
        int var12 = var9 - 1;
        if (this.field1492 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1491[var15] = this.field1494[var16];
            }
        }
        int[] var17 = this.field1494;
        this.field1494 = Statics.field1491;
        Statics.field1491 = var17;
    }
}
