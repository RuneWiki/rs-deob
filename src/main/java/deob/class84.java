package deob;

@ObfuscatedName("ch")
public class class84 extends class209 {

    @ObfuscatedName("ch.l")
    public int field1450;

    @ObfuscatedName("ch.d")
    public boolean field1452;

    @ObfuscatedName("ch.n")
    public int[] field1457;

    @ObfuscatedName("ch.m")
    public int[] field1453;

    @ObfuscatedName("ch.g")
    public int[] field1454;

    @ObfuscatedName("ch.s")
    public int[] field1455;

    @ObfuscatedName("ch.r")
    public int field1456;

    @ObfuscatedName("ch.k")
    public int field1446;

    @ObfuscatedName("ch.o")
    public int[] field1458;

    @ObfuscatedName("ch.q")
    public boolean field1459 = false;

    public class84(class120 arg0) {
        this.field1450 = arg0.method2387();
        this.field1452 = arg0.method2385() == 1;
        int var2 = arg0.method2385();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1457 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1457[var3] = arg0.method2387();
        }
        if (var2 > 1) {
            this.field1453 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1453[var4] = arg0.method2385();
            }
        }
        if (var2 > 1) {
            this.field1454 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1454[var5] = arg0.method2385();
            }
        }
        this.field1455 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1455[var6] = arg0.method2527();
        }
        this.field1456 = arg0.method2385();
        this.field1446 = arg0.method2385();
        this.field1458 = null;
    }

    @ObfuscatedName("ch.f(DILfl;)Z")
    public boolean method1809(double arg0, int arg1, class168 arg2) {
        for (int var5 = 0; var5 < this.field1457.length; var5++) {
            if (arg2.method3121(this.field1457[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1458 = new int[var6];
        for (int var7 = 0; var7 < this.field1457.length; var7++) {
            int var8 = this.field1457[var7];
            byte[] var9 = arg2.method3066(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class77.method2678(var9);
                var10 = true;
            }
            class81 var11;
            if (var10) {
                class81 var12 = new class81();
                var12.field1427 = Statics.field1397;
                var12.field1433 = Statics.field1399;
                var12.field1434 = Statics.field1398[0];
                var12.field1432 = Statics.field1179[0];
                var12.field1429 = Statics.field691[0];
                var12.field1430 = Statics.field745[0];
                var12.field1428 = Statics.field136;
                var12.field1431 = Statics.field1401[0];
                class77.method734();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1798();
            byte[] var15 = var11.field1431;
            int[] var16 = var11.field1428;
            int var17 = this.field1455[var7];
            if ((var17 & 0xFF000000) == 16777216) {
            }
            if ((var17 & 0xFF000000) == 33554432) {
            }
            if ((var17 & 0xFF000000) == 50331648) {
                int var18 = var17 & 0xFF00FF;
                int var19 = var17 >> 8 & 0xFF;
                for (int var20 = 0; var20 < var16.length; var20++) {
                    int var21 = var16[var20];
                    if (var21 >> 8 == (var21 & 0xFFFF)) {
                        int var22 = var21 & 0xFF;
                        var16[var20] = var18 * var22 >> 8 & 0xFF00FF | var19 * var22 & 0xFF00;
                    }
                }
            }
            for (int var23 = 0; var23 < var16.length; var23++) {
                var16[var23] = class92.method2015(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1453[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1429 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1458[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1429 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1458[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1429 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1458[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var24 == 1) {
            }
            if (var24 == 2) {
            }
            if (var24 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("ch.u()V")
    public void method1808() {
        this.field1458 = null;
    }

    @ObfuscatedName("ch.x(I)V")
    public void method1810(int arg0) {
        if (this.field1458 == null) {
            return;
        }
        if (this.field1456 == 1 || this.field1456 == 3) {
            if (Statics.field1460 == null || Statics.field1460.length < this.field1458.length) {
                Statics.field1460 = new int[this.field1458.length];
            }
            short var2;
            if (this.field1458.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1458.length;
            int var4 = arg0 * var2 * this.field1446;
            int var5 = var3 - 1;
            if (this.field1456 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1460[var6] = this.field1458[var7];
            }
            int[] var8 = this.field1458;
            this.field1458 = Statics.field1460;
            Statics.field1460 = var8;
        }
        if (this.field1456 != 2 && this.field1456 != 4) {
            return;
        }
        if (Statics.field1460 == null || Statics.field1460.length < this.field1458.length) {
            Statics.field1460 = new int[this.field1458.length];
        }
        short var9;
        if (this.field1458.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1458.length;
        int var11 = this.field1446 * arg0;
        int var12 = var9 - 1;
        if (this.field1456 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1460[var15] = this.field1458[var16];
            }
        }
        int[] var17 = this.field1458;
        this.field1458 = Statics.field1460;
        Statics.field1460 = var17;
    }
}
