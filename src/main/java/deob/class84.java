package deob;

@ObfuscatedName("ci")
public class class84 extends class209 {

    @ObfuscatedName("ci.z")
    public int field1448;

    @ObfuscatedName("ci.r")
    public boolean field1449;

    @ObfuscatedName("ci.f")
    public int[] field1444;

    @ObfuscatedName("ci.s")
    public int[] field1452;

    @ObfuscatedName("ci.d")
    public int[] field1451;

    @ObfuscatedName("ci.l")
    public int[] field1453;

    @ObfuscatedName("ci.y")
    public int field1450;

    @ObfuscatedName("ci.p")
    public int field1454;

    @ObfuscatedName("ci.k")
    public int[] field1456;

    @ObfuscatedName("ci.o")
    public boolean field1457 = false;

    public class84(class120 arg0) {
        this.field1448 = arg0.method2310();
        this.field1449 = arg0.method2334() == 1;
        int var2 = arg0.method2334();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1444 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1444[var3] = arg0.method2310();
        }
        if (var2 > 1) {
            this.field1452 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1452[var4] = arg0.method2334();
            }
        }
        if (var2 > 1) {
            this.field1451 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1451[var5] = arg0.method2334();
            }
        }
        this.field1453 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1453[var6] = arg0.method2345();
        }
        this.field1450 = arg0.method2334();
        this.field1454 = arg0.method2334();
        this.field1456 = null;
    }

    @ObfuscatedName("ci.t(DILfp;)Z")
    public boolean method1713(double arg0, int arg1, class168 arg2) {
        for (int var5 = 0; var5 < this.field1444.length; var5++) {
            if (arg2.method3072(this.field1444[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1456 = new int[var6];
        for (int var7 = 0; var7 < this.field1444.length; var7++) {
            class81 var8 = class77.method2099(arg2, this.field1444[var7]);
            var8.method1701();
            byte[] var9 = var8.field1429;
            int[] var10 = var8.field1424;
            int var11 = this.field1453[var7];
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
                var10[var17] = class92.method1918(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1452[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1425 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1456[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1425 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1456[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1425 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1456[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ci.i()V")
    public void method1714() {
        this.field1456 = null;
    }

    @ObfuscatedName("ci.g(I)V")
    public void method1715(int arg0) {
        if (this.field1456 == null) {
            return;
        }
        if (this.field1450 == 1 || this.field1450 == 3) {
            if (Statics.field1455 == null || Statics.field1455.length < this.field1456.length) {
                Statics.field1455 = new int[this.field1456.length];
            }
            short var2;
            if (this.field1456.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1456.length;
            int var4 = arg0 * var2 * this.field1454;
            int var5 = var3 - 1;
            if (this.field1450 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1455[var6] = this.field1456[var7];
            }
            int[] var8 = this.field1456;
            this.field1456 = Statics.field1455;
            Statics.field1455 = var8;
        }
        if (this.field1450 != 2 && this.field1450 != 4) {
            return;
        }
        if (Statics.field1455 == null || Statics.field1455.length < this.field1456.length) {
            Statics.field1455 = new int[this.field1456.length];
        }
        short var9;
        if (this.field1456.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1456.length;
        int var11 = this.field1454 * arg0;
        int var12 = var9 - 1;
        if (this.field1450 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1455[var15] = this.field1456[var16];
            }
        }
        int[] var17 = this.field1456;
        this.field1456 = Statics.field1455;
        Statics.field1455 = var17;
    }
}
