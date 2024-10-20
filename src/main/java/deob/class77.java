package deob;

@ObfuscatedName("bd")
public class class77 extends class189 {

    @ObfuscatedName("bd.q")
    public int field1350;

    @ObfuscatedName("bd.l")
    public boolean field1351;

    @ObfuscatedName("bd.a")
    public int[] field1359;

    @ObfuscatedName("bd.b")
    public int[] field1353;

    @ObfuscatedName("bd.z")
    public int[] field1346;

    @ObfuscatedName("bd.w")
    public int[] field1355;

    @ObfuscatedName("bd.j")
    public int field1356;

    @ObfuscatedName("bd.p")
    public int field1357;

    @ObfuscatedName("bd.n")
    public int[] field1358;

    @ObfuscatedName("bd.r")
    public boolean field1352 = false;

    public class77(class108 arg0) {
        this.field1350 = arg0.method2124();
        this.field1351 = arg0.method2122() == 1;
        int var2 = arg0.method2122();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1359 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1359[var3] = arg0.method2124();
        }
        if (var2 > 1) {
            this.field1353 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1353[var4] = arg0.method2122();
            }
        }
        if (var2 > 1) {
            this.field1346 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1346[var5] = arg0.method2122();
            }
        }
        this.field1355 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1355[var6] = arg0.method2127();
        }
        this.field1356 = arg0.method2122();
        this.field1357 = arg0.method2122();
        this.field1358 = null;
    }

    @ObfuscatedName("bd.e(DILep;)Z")
    public boolean method1577(double arg0, int arg1, class149 arg2) {
        for (int var5 = 0; var5 < this.field1359.length; var5++) {
            if (arg2.method2727(this.field1359[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1358 = new int[var6];
        for (int var7 = 0; var7 < this.field1359.length; var7++) {
            class75 var8 = class71.method2698(arg2, this.field1359[var7]);
            var8.method1568();
            byte[] var9 = var8.field1344;
            int[] var10 = var8.field1340;
            int var11 = this.field1355[var7];
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
                var10[var17] = class85.method1785(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1353[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1339 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1358[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1339 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1358[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1339 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1358[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("bd.v()V")
    public void method1584() {
        this.field1358 = null;
    }

    @ObfuscatedName("bd.k(I)V")
    public void method1578(int arg0) {
        if (this.field1358 == null) {
            return;
        }
        if (this.field1356 == 1 || this.field1356 == 3) {
            if (Statics.field1360 == null || Statics.field1360.length < this.field1358.length) {
                Statics.field1360 = new int[this.field1358.length];
            }
            short var2;
            if (this.field1358.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1358.length;
            int var4 = arg0 * var2 * this.field1357;
            int var5 = var3 - 1;
            if (this.field1356 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1360[var6] = this.field1358[var7];
            }
            int[] var8 = this.field1358;
            this.field1358 = Statics.field1360;
            Statics.field1360 = var8;
        }
        if (this.field1356 != 2 && this.field1356 != 4) {
            return;
        }
        if (Statics.field1360 == null || Statics.field1360.length < this.field1358.length) {
            Statics.field1360 = new int[this.field1358.length];
        }
        short var9;
        if (this.field1358.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1358.length;
        int var11 = this.field1357 * arg0;
        int var12 = var9 - 1;
        if (this.field1356 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1360[var15] = this.field1358[var16];
            }
        }
        int[] var17 = this.field1358;
        this.field1358 = Statics.field1360;
        Statics.field1360 = var17;
    }
}
