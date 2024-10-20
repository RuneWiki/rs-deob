package deob;

@ObfuscatedName("cr")
public class class80 extends class128 {

    @ObfuscatedName("cr.k")
    public int field1291;

    @ObfuscatedName("cr.h")
    public boolean field1292;

    @ObfuscatedName("cr.n")
    public int[] field1293;

    @ObfuscatedName("cr.f")
    public int[] field1294;

    @ObfuscatedName("cr.a")
    public int[] field1301;

    @ObfuscatedName("cr.r")
    public int[] field1296;

    @ObfuscatedName("cr.x")
    public int field1300;

    @ObfuscatedName("cr.z")
    public int field1298;

    @ObfuscatedName("cr.p")
    public int[] field1299;

    @ObfuscatedName("cr.s")
    public boolean field1295 = false;

    public class80(class154 arg0) {
        this.field1291 = arg0.method2801();
        this.field1292 = arg0.method2678() == 1;
        int var2 = arg0.method2678();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1293 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1293[var3] = arg0.method2801();
        }
        if (var2 > 1) {
            this.field1294 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1294[var4] = arg0.method2678();
            }
        }
        if (var2 > 1) {
            this.field1301 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1301[var5] = arg0.method2678();
            }
        }
        this.field1296 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1296[var6] = arg0.method2683();
        }
        this.field1300 = arg0.method2678();
        this.field1298 = arg0.method2678();
        this.field1299 = null;
    }

    @ObfuscatedName("cr.b(DILgj;)Z")
    public boolean method1527(double arg0, int arg1, class183 arg2) {
        for (int var5 = 0; var5 < this.field1293.length; var5++) {
            if (arg2.method3157(this.field1293[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1299 = new int[var6];
        for (int var7 = 0; var7 < this.field1293.length; var7++) {
            class223 var8 = class226.method3595(arg2, this.field1293[var7]);
            var8.method3953();
            byte[] var9 = var8.field3209;
            int[] var10 = var8.field3206;
            int var11 = this.field1296[var7];
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
                var10[var17] = class85.method1625(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1294[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field3205 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1299[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3205 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1299[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3205 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1299[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("cr.l()V")
    public void method1526() {
        this.field1299 = null;
    }

    @ObfuscatedName("cr.i(I)V")
    public void method1525(int arg0) {
        if (this.field1299 == null) {
            return;
        }
        if (this.field1300 == 1 || this.field1300 == 3) {
            if (Statics.field1287 == null || Statics.field1287.length < this.field1299.length) {
                Statics.field1287 = new int[this.field1299.length];
            }
            short var2;
            if (this.field1299.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1299.length;
            int var4 = arg0 * var2 * this.field1298;
            int var5 = var3 - 1;
            if (this.field1300 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1287[var6] = this.field1299[var7];
            }
            int[] var8 = this.field1299;
            this.field1299 = Statics.field1287;
            Statics.field1287 = var8;
        }
        if (this.field1300 != 2 && this.field1300 != 4) {
            return;
        }
        if (Statics.field1287 == null || Statics.field1287.length < this.field1299.length) {
            Statics.field1287 = new int[this.field1299.length];
        }
        short var9;
        if (this.field1299.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1299.length;
        int var11 = this.field1298 * arg0;
        int var12 = var9 - 1;
        if (this.field1300 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1287[var15] = this.field1299[var16];
            }
        }
        int[] var17 = this.field1299;
        this.field1299 = Statics.field1287;
        Statics.field1287 = var17;
    }
}
