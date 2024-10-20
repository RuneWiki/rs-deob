package deob;

@ObfuscatedName("bg")
public class class78 extends class199 {

    @ObfuscatedName("bg.p")
    public int field1365;

    @ObfuscatedName("bg.l")
    public boolean field1359;

    @ObfuscatedName("bg.u")
    public int[] field1360;

    @ObfuscatedName("bg.o")
    public int[] field1366;

    @ObfuscatedName("bg.m")
    public int[] field1364;

    @ObfuscatedName("bg.q")
    public int[] field1368;

    @ObfuscatedName("bg.v")
    public int field1369;

    @ObfuscatedName("bg.n")
    public int field1370;

    @ObfuscatedName("bg.z")
    public int[] field1371;

    @ObfuscatedName("bg.r")
    public boolean field1372 = false;

    public class78(class111 arg0) {
        this.field1365 = arg0.method2129();
        this.field1359 = arg0.method2127() == 1;
        int var2 = arg0.method2127();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1360 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1360[var3] = arg0.method2129();
        }
        if (var2 > 1) {
            this.field1366 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1366[var4] = arg0.method2127();
            }
        }
        if (var2 > 1) {
            this.field1364 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1364[var5] = arg0.method2127();
            }
        }
        this.field1368 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1368[var6] = arg0.method2194();
        }
        this.field1369 = arg0.method2127();
        this.field1370 = arg0.method2127();
        this.field1371 = null;
    }

    @ObfuscatedName("bg.b(DILfj;)Z")
    public boolean method1572(double arg0, int arg1, class158 arg2) {
        for (int var5 = 0; var5 < this.field1360.length; var5++) {
            if (arg2.method2879(this.field1360[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1371 = new int[var6];
        for (int var7 = 0; var7 < this.field1360.length; var7++) {
            int var8 = this.field1360[var7];
            byte[] var9 = arg2.method2860(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class72.method2587(var9);
                var10 = true;
            }
            class76 var11;
            if (var10) {
                class76 var12 = new class76();
                var12.field1356 = Statics.field1940;
                var12.field1354 = Statics.field2073;
                var12.field1351 = Statics.field2846[0];
                var12.field1357 = Statics.field1317[0];
                var12.field1352 = Statics.field992[0];
                var12.field1353 = Statics.field1321[0];
                var12.field1355 = Statics.field2940;
                var12.field1350 = Statics.field1319[0];
                class72.method2736();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1559();
            byte[] var15 = var11.field1350;
            int[] var16 = var11.field1355;
            int var17 = this.field1368[var7];
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
                var16[var23] = class86.method1784(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1366[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1352 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1371[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1352 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1371[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1352 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1371[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("bg.e()V")
    public void method1579() {
        this.field1371 = null;
    }

    @ObfuscatedName("bg.a(I)V")
    public void method1573(int arg0) {
        if (this.field1371 == null) {
            return;
        }
        if (this.field1369 == 1 || this.field1369 == 3) {
            if (Statics.field1373 == null || Statics.field1373.length < this.field1371.length) {
                Statics.field1373 = new int[this.field1371.length];
            }
            short var2;
            if (this.field1371.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1371.length;
            int var4 = arg0 * var2 * this.field1370;
            int var5 = var3 - 1;
            if (this.field1369 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1373[var6] = this.field1371[var7];
            }
            int[] var8 = this.field1371;
            this.field1371 = Statics.field1373;
            Statics.field1373 = var8;
        }
        if (this.field1369 != 2 && this.field1369 != 4) {
            return;
        }
        if (Statics.field1373 == null || Statics.field1373.length < this.field1371.length) {
            Statics.field1373 = new int[this.field1371.length];
        }
        short var9;
        if (this.field1371.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1371.length;
        int var11 = this.field1370 * arg0;
        int var12 = var9 - 1;
        if (this.field1369 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1373[var15] = this.field1371[var16];
            }
        }
        int[] var17 = this.field1371;
        this.field1371 = Statics.field1373;
        Statics.field1373 = var17;
    }
}
