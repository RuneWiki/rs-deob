package deob;

@ObfuscatedName("cs")
public class class81 extends class202 {

    @ObfuscatedName("cs.w")
    public int field1402;

    @ObfuscatedName("cs.d")
    public boolean field1404;

    @ObfuscatedName("cs.f")
    public int[] field1401;

    @ObfuscatedName("cs.i")
    public int[] field1403;

    @ObfuscatedName("cs.a")
    public int[] field1406;

    @ObfuscatedName("cs.o")
    public int[] field1405;

    @ObfuscatedName("cs.u")
    public int field1408;

    @ObfuscatedName("cs.m")
    public int field1409;

    @ObfuscatedName("cs.e")
    public int[] field1398;

    @ObfuscatedName("cs.v")
    public boolean field1411 = false;

    public class81(class114 arg0) {
        this.field1402 = arg0.method2324();
        this.field1404 = arg0.method2322() == 1;
        int var2 = arg0.method2322();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1401 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1401[var3] = arg0.method2324();
        }
        if (var2 > 1) {
            this.field1403 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1403[var4] = arg0.method2322();
            }
        }
        if (var2 > 1) {
            this.field1406 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1406[var5] = arg0.method2322();
            }
        }
        this.field1405 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1405[var6] = arg0.method2327();
        }
        this.field1408 = arg0.method2322();
        this.field1409 = arg0.method2322();
        this.field1398 = null;
    }

    @ObfuscatedName("cs.j(DILfh;)Z")
    public boolean method1782(double arg0, int arg1, class161 arg2) {
        for (int var5 = 0; var5 < this.field1401.length; var5++) {
            if (arg2.method2986(this.field1401[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1398 = new int[var6];
        for (int var7 = 0; var7 < this.field1401.length; var7++) {
            class79 var8 = class75.method818(arg2, this.field1401[var7]);
            var8.method1768();
            byte[] var9 = var8.field1393;
            int[] var10 = var8.field1395;
            int var11 = this.field1405[var7];
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
                var10[var17] = class89.method1985(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1403[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1391 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1398[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1391 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1398[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1391 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1398[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("cs.y()V")
    public void method1783() {
        this.field1398 = null;
    }

    @ObfuscatedName("cs.z(I)V")
    public void method1784(int arg0) {
        if (this.field1398 == null) {
            return;
        }
        if (this.field1408 == 1 || this.field1408 == 3) {
            if (Statics.field1412 == null || Statics.field1412.length < this.field1398.length) {
                Statics.field1412 = new int[this.field1398.length];
            }
            short var2;
            if (this.field1398.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1398.length;
            int var4 = arg0 * var2 * this.field1409;
            int var5 = var3 - 1;
            if (this.field1408 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1412[var6] = this.field1398[var7];
            }
            int[] var8 = this.field1398;
            this.field1398 = Statics.field1412;
            Statics.field1412 = var8;
        }
        if (this.field1408 != 2 && this.field1408 != 4) {
            return;
        }
        if (Statics.field1412 == null || Statics.field1412.length < this.field1398.length) {
            Statics.field1412 = new int[this.field1398.length];
        }
        short var9;
        if (this.field1398.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1398.length;
        int var11 = this.field1409 * arg0;
        int var12 = var9 - 1;
        if (this.field1408 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1412[var15] = this.field1398[var16];
            }
        }
        int[] var17 = this.field1398;
        this.field1398 = Statics.field1412;
        Statics.field1412 = var17;
    }
}
