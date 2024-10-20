package deob;

@ObfuscatedName("ch")
public class class87 extends class212 {

    @ObfuscatedName("ch.g")
    public int field1517;

    @ObfuscatedName("ch.l")
    public boolean field1518;

    @ObfuscatedName("ch.j")
    public int[] field1519;

    @ObfuscatedName("ch.r")
    public int[] field1520;

    @ObfuscatedName("ch.x")
    public int[] field1521;

    @ObfuscatedName("ch.k")
    public int[] field1522;

    @ObfuscatedName("ch.v")
    public int field1523;

    @ObfuscatedName("ch.h")
    public int field1524;

    @ObfuscatedName("ch.u")
    public int[] field1525;

    @ObfuscatedName("ch.y")
    public boolean field1516 = false;

    public class87(class123 arg0) {
        this.field1517 = arg0.method2548();
        this.field1518 = arg0.method2398() == 1;
        int var2 = arg0.method2398();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1519 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1519[var3] = arg0.method2548();
        }
        if (var2 > 1) {
            this.field1520 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1520[var4] = arg0.method2398();
            }
        }
        if (var2 > 1) {
            this.field1521 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1521[var5] = arg0.method2398();
            }
        }
        this.field1522 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1522[var6] = arg0.method2419();
        }
        this.field1523 = arg0.method2398();
        this.field1524 = arg0.method2398();
        this.field1525 = null;
    }

    @ObfuscatedName("ch.m(DILfa;)Z")
    public boolean method1851(double arg0, int arg1, class171 arg2) {
        for (int var5 = 0; var5 < this.field1519.length; var5++) {
            if (arg2.method3145(this.field1519[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1525 = new int[var6];
        for (int var7 = 0; var7 < this.field1519.length; var7++) {
            int var8 = this.field1519[var7];
            class84 var9;
            if (class80.method44(arg2, var8)) {
                var9 = class80.method1587();
            } else {
                var9 = null;
            }
            var9.method1836();
            byte[] var11 = var9.field1495;
            int[] var12 = var9.field1496;
            int var13 = this.field1522[var7];
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
                var12[var19] = class95.method2043(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1520[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var20 == 0) {
                if (var9.field1501 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1525[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field1501 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1525[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1501 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1525[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("ch.w()V")
    public void method1852() {
        this.field1525 = null;
    }

    @ObfuscatedName("ch.e(I)V")
    public void method1853(int arg0) {
        if (this.field1525 == null) {
            return;
        }
        if (this.field1523 == 1 || this.field1523 == 3) {
            if (Statics.field1527 == null || Statics.field1527.length < this.field1525.length) {
                Statics.field1527 = new int[this.field1525.length];
            }
            short var2;
            if (this.field1525.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1525.length;
            int var4 = arg0 * var2 * this.field1524;
            int var5 = var3 - 1;
            if (this.field1523 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1527[var6] = this.field1525[var7];
            }
            int[] var8 = this.field1525;
            this.field1525 = Statics.field1527;
            Statics.field1527 = var8;
        }
        if (this.field1523 != 2 && this.field1523 != 4) {
            return;
        }
        if (Statics.field1527 == null || Statics.field1527.length < this.field1525.length) {
            Statics.field1527 = new int[this.field1525.length];
        }
        short var9;
        if (this.field1525.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1525.length;
        int var11 = this.field1524 * arg0;
        int var12 = var9 - 1;
        if (this.field1523 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1527[var15] = this.field1525[var16];
            }
        }
        int[] var17 = this.field1525;
        this.field1525 = Statics.field1527;
        Statics.field1527 = var17;
    }
}
