package deob;

@ObfuscatedName("bc")
public class class78 extends class199 {

    @ObfuscatedName("bc.i")
    public int field1354;

    @ObfuscatedName("bc.o")
    public boolean field1347;

    @ObfuscatedName("bc.f")
    public int[] field1351;

    @ObfuscatedName("bc.d")
    public int[] field1349;

    @ObfuscatedName("bc.j")
    public int[] field1355;

    @ObfuscatedName("bc.x")
    public int[] field1342;

    @ObfuscatedName("bc.v")
    public int field1352;

    @ObfuscatedName("bc.a")
    public int field1353;

    @ObfuscatedName("bc.l")
    public int[] field1350;

    @ObfuscatedName("bc.h")
    public boolean field1346 = false;

    public class78(class111 arg0) {
        this.field1354 = arg0.method2255();
        this.field1347 = arg0.method2172() == 1;
        int var2 = arg0.method2172();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1351 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1351[var3] = arg0.method2255();
        }
        if (var2 > 1) {
            this.field1349 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1349[var4] = arg0.method2172();
            }
        }
        if (var2 > 1) {
            this.field1355 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1355[var5] = arg0.method2172();
            }
        }
        this.field1342 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1342[var6] = arg0.method2177();
        }
        this.field1352 = arg0.method2172();
        this.field1353 = arg0.method2172();
        this.field1350 = null;
    }

    @ObfuscatedName("bc.t(DILfj;)Z")
    public boolean method1630(double arg0, int arg1, class158 arg2) {
        for (int var5 = 0; var5 < this.field1351.length; var5++) {
            if (arg2.method2888(this.field1351[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1350 = new int[var6];
        for (int var7 = 0; var7 < this.field1351.length; var7++) {
            class76 var8 = class72.method1905(arg2, this.field1351[var7]);
            var8.method1621();
            byte[] var9 = var8.field1338;
            int[] var10 = var8.field1334;
            int var11 = this.field1342[var7];
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
                var10[var17] = class86.method1837(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1349[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1335 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1350[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1335 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1350[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1335 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1350[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("bc.b()V")
    public void method1631() {
        this.field1350 = null;
    }

    @ObfuscatedName("bc.p(I)V")
    public void method1634(int arg0) {
        if (this.field1350 == null) {
            return;
        }
        if (this.field1352 == 1 || this.field1352 == 3) {
            if (Statics.field1356 == null || Statics.field1356.length < this.field1350.length) {
                Statics.field1356 = new int[this.field1350.length];
            }
            short var2;
            if (this.field1350.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1350.length;
            int var4 = arg0 * var2 * this.field1353;
            int var5 = var3 - 1;
            if (this.field1352 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1356[var6] = this.field1350[var7];
            }
            int[] var8 = this.field1350;
            this.field1350 = Statics.field1356;
            Statics.field1356 = var8;
        }
        if (this.field1352 != 2 && this.field1352 != 4) {
            return;
        }
        if (Statics.field1356 == null || Statics.field1356.length < this.field1350.length) {
            Statics.field1356 = new int[this.field1350.length];
        }
        short var9;
        if (this.field1350.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1350.length;
        int var11 = this.field1353 * arg0;
        int var12 = var9 - 1;
        if (this.field1352 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1356[var15] = this.field1350[var16];
            }
        }
        int[] var17 = this.field1350;
        this.field1350 = Statics.field1356;
        Statics.field1356 = var17;
    }
}
