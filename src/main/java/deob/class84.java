package deob;

@ObfuscatedName("co")
public class class84 extends class209 {

    @ObfuscatedName("co.d")
    public int field1448;

    @ObfuscatedName("co.u")
    public boolean field1449;

    @ObfuscatedName("co.o")
    public int[] field1444;

    @ObfuscatedName("co.b")
    public int[] field1450;

    @ObfuscatedName("co.k")
    public int[] field1452;

    @ObfuscatedName("co.c")
    public int[] field1454;

    @ObfuscatedName("co.l")
    public int field1447;

    @ObfuscatedName("co.t")
    public int field1455;

    @ObfuscatedName("co.i")
    public int[] field1456;

    @ObfuscatedName("co.r")
    public boolean field1446 = false;

    public class84(class120 arg0) {
        this.field1448 = arg0.method2430();
        this.field1449 = arg0.method2338() == 1;
        int var2 = arg0.method2338();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1444 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1444[var3] = arg0.method2430();
        }
        if (var2 > 1) {
            this.field1450 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1450[var4] = arg0.method2338();
            }
        }
        if (var2 > 1) {
            this.field1452 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1452[var5] = arg0.method2338();
            }
        }
        this.field1454 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1454[var6] = arg0.method2343();
        }
        this.field1447 = arg0.method2338();
        this.field1455 = arg0.method2338();
        this.field1456 = null;
    }

    @ObfuscatedName("co.s(DILfa;)Z")
    public boolean method1761(double arg0, int arg1, class168 arg2) {
        for (int var5 = 0; var5 < this.field1444.length; var5++) {
            if (arg2.method3065(this.field1444[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1456 = new int[var6];
        for (int var7 = 0; var7 < this.field1444.length; var7++) {
            int var8 = this.field1444[var7];
            byte[] var9 = arg2.method3019(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class77.method3197(var9);
                var10 = true;
            }
            class81 var11;
            if (var10) {
                class81 var12 = new class81();
                var12.field1426 = Statics.field3215;
                var12.field1433 = Statics.field1387;
                var12.field1429 = Statics.field1388[0];
                var12.field1432 = Statics.field1391[0];
                var12.field1428 = Statics.field1390[0];
                var12.field1430 = Statics.field160[0];
                var12.field1427 = Statics.field1397;
                var12.field1431 = Statics.field576[0];
                class77.method628();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1738();
            byte[] var15 = var11.field1431;
            int[] var16 = var11.field1427;
            int var17 = this.field1454[var7];
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
                var16[var23] = class92.method1944(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1450[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1428 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1456[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1428 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1456[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1428 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1456[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("co.j()V")
    public void method1749() {
        this.field1456 = null;
    }

    @ObfuscatedName("co.p(I)V")
    public void method1750(int arg0) {
        if (this.field1456 == null) {
            return;
        }
        if (this.field1447 == 1 || this.field1447 == 3) {
            if (Statics.field1458 == null || Statics.field1458.length < this.field1456.length) {
                Statics.field1458 = new int[this.field1456.length];
            }
            short var2;
            if (this.field1456.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1456.length;
            int var4 = arg0 * var2 * this.field1455;
            int var5 = var3 - 1;
            if (this.field1447 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1458[var6] = this.field1456[var7];
            }
            int[] var8 = this.field1456;
            this.field1456 = Statics.field1458;
            Statics.field1458 = var8;
        }
        if (this.field1447 != 2 && this.field1447 != 4) {
            return;
        }
        if (Statics.field1458 == null || Statics.field1458.length < this.field1456.length) {
            Statics.field1458 = new int[this.field1456.length];
        }
        short var9;
        if (this.field1456.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1456.length;
        int var11 = this.field1455 * arg0;
        int var12 = var9 - 1;
        if (this.field1447 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1458[var15] = this.field1456[var16];
            }
        }
        int[] var17 = this.field1456;
        this.field1456 = Statics.field1458;
        Statics.field1458 = var17;
    }
}
