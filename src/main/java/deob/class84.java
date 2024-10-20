package deob;

@ObfuscatedName("cf")
public class class84 extends class209 {

    @ObfuscatedName("cf.p")
    public int field1418;

    @ObfuscatedName("cf.h")
    public boolean field1419;

    @ObfuscatedName("cf.g")
    public int[] field1415;

    @ObfuscatedName("cf.a")
    public int[] field1416;

    @ObfuscatedName("cf.r")
    public int[] field1422;

    @ObfuscatedName("cf.k")
    public int[] field1423;

    @ObfuscatedName("cf.m")
    public int field1424;

    @ObfuscatedName("cf.n")
    public int field1425;

    @ObfuscatedName("cf.y")
    public int[] field1426;

    @ObfuscatedName("cf.i")
    public boolean field1427 = false;

    public class84(class120 arg0) {
        this.field1418 = arg0.method2532();
        this.field1419 = arg0.method2355() == 1;
        int var2 = arg0.method2355();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1415 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1415[var3] = arg0.method2532();
        }
        if (var2 > 1) {
            this.field1416 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1416[var4] = arg0.method2355();
            }
        }
        if (var2 > 1) {
            this.field1422 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1422[var5] = arg0.method2355();
            }
        }
        this.field1423 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1423[var6] = arg0.method2360();
        }
        this.field1424 = arg0.method2355();
        this.field1425 = arg0.method2355();
        this.field1426 = null;
    }

    @ObfuscatedName("cf.e(DILft;)Z")
    public boolean method1766(double arg0, int arg1, class168 arg2) {
        for (int var5 = 0; var5 < this.field1415.length; var5++) {
            if (arg2.method3030(this.field1415[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1426 = new int[var6];
        for (int var7 = 0; var7 < this.field1415.length; var7++) {
            int var8 = this.field1415[var7];
            byte[] var9 = arg2.method3028(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class77.method2579(var9);
                var10 = true;
            }
            class81 var11;
            if (var10) {
                class81 var12 = new class81();
                var12.field1396 = Statics.field1357;
                var12.field1393 = Statics.field1355;
                var12.field1394 = Statics.field1358[0];
                var12.field1395 = Statics.field1438[0];
                var12.field1391 = Statics.field87[0];
                var12.field1392 = Statics.field1356[0];
                var12.field1397 = Statics.field3153;
                var12.field1390 = Statics.field1353[0];
                class77.method655();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1744();
            byte[] var15 = var11.field1390;
            int[] var16 = var11.field1397;
            int var17 = this.field1423[var7];
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
                var16[var23] = class92.method1964(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1416[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1391 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1426[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1391 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1426[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1391 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1426[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("cf.w()V")
    public void method1765() {
        this.field1426 = null;
    }

    @ObfuscatedName("cf.f(I)V")
    public void method1768(int arg0) {
        if (this.field1426 == null) {
            return;
        }
        if (this.field1424 == 1 || this.field1424 == 3) {
            if (Statics.field1420 == null || Statics.field1420.length < this.field1426.length) {
                Statics.field1420 = new int[this.field1426.length];
            }
            short var2;
            if (this.field1426.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1426.length;
            int var4 = arg0 * var2 * this.field1425;
            int var5 = var3 - 1;
            if (this.field1424 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1420[var6] = this.field1426[var7];
            }
            int[] var8 = this.field1426;
            this.field1426 = Statics.field1420;
            Statics.field1420 = var8;
        }
        if (this.field1424 != 2 && this.field1424 != 4) {
            return;
        }
        if (Statics.field1420 == null || Statics.field1420.length < this.field1426.length) {
            Statics.field1420 = new int[this.field1426.length];
        }
        short var9;
        if (this.field1426.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1426.length;
        int var11 = this.field1425 * arg0;
        int var12 = var9 - 1;
        if (this.field1424 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1420[var15] = this.field1426[var16];
            }
        }
        int[] var17 = this.field1426;
        this.field1426 = Statics.field1420;
        Statics.field1420 = var17;
    }
}
