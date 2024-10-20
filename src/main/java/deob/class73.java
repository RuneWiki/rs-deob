package deob;

@ObfuscatedName("bh")
public class class73 extends class176 {

    @ObfuscatedName("bh.r")
    public int field1303;

    @ObfuscatedName("bh.i")
    public boolean field1297;

    @ObfuscatedName("bh.f")
    public int[] field1296;

    @ObfuscatedName("bh.a")
    public int[] field1299;

    @ObfuscatedName("bh.w")
    public int[] field1300;

    @ObfuscatedName("bh.u")
    public int[] field1301;

    @ObfuscatedName("bh.d")
    public int field1302;

    @ObfuscatedName("bh.t")
    public int field1292;

    @ObfuscatedName("bh.j")
    public int[] field1304;

    @ObfuscatedName("bh.q")
    public boolean field1298 = false;

    public class73(class104 arg0) {
        this.field1303 = arg0.method2132();
        this.field1297 = arg0.method2190() == 1;
        int var2 = arg0.method2190();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1296 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1296[var3] = arg0.method2132();
        }
        if (var2 > 1) {
            this.field1299 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1299[var4] = arg0.method2190();
            }
        }
        if (var2 > 1) {
            this.field1300 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1300[var5] = arg0.method2190();
            }
        }
        this.field1301 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1301[var6] = arg0.method2135();
        }
        this.field1302 = arg0.method2190();
        this.field1292 = arg0.method2190();
        this.field1304 = null;
    }

    @ObfuscatedName("bh.m(DILek;)Z")
    public boolean method1567(double arg0, int arg1, class142 arg2) {
        for (int var5 = 0; var5 < this.field1296.length; var5++) {
            if (arg2.method2702(this.field1296[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1304 = new int[var6];
        for (int var7 = 0; var7 < this.field1296.length; var7++) {
            int var8 = this.field1296[var7];
            byte[] var9 = arg2.method2700(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class67.method610(var9);
                var10 = true;
            }
            class71 var11;
            if (var10) {
                class71 var12 = new class71();
                var12.field1289 = Statics.field1236;
                var12.field1290 = Statics.field1251;
                var12.field1287 = Statics.field1249[0];
                var12.field1283 = Statics.field1250[0];
                var12.field1285 = Statics.field972[0];
                var12.field1288 = Statics.field950[0];
                var12.field1284 = Statics.field1247;
                var12.field1286 = Statics.field1252[0];
                class67.method793();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1553();
            byte[] var15 = var11.field1286;
            int[] var16 = var11.field1284;
            int var17 = this.field1301[var7];
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
                var16[var23] = class81.method1773(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1299[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1285 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1304[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1285 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1304[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1285 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1304[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("bh.k()V")
    public void method1569() {
        this.field1304 = null;
    }

    @ObfuscatedName("bh.y(I)V")
    public void method1566(int arg0) {
        if (this.field1304 == null) {
            return;
        }
        if (this.field1302 == 1 || this.field1302 == 3) {
            if (Statics.field1306 == null || Statics.field1306.length < this.field1304.length) {
                Statics.field1306 = new int[this.field1304.length];
            }
            short var2;
            if (this.field1304.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1304.length;
            int var4 = arg0 * var2 * this.field1292;
            int var5 = var3 - 1;
            if (this.field1302 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1306[var6] = this.field1304[var7];
            }
            int[] var8 = this.field1304;
            this.field1304 = Statics.field1306;
            Statics.field1306 = var8;
        }
        if (this.field1302 != 2 && this.field1302 != 4) {
            return;
        }
        if (Statics.field1306 == null || Statics.field1306.length < this.field1304.length) {
            Statics.field1306 = new int[this.field1304.length];
        }
        short var9;
        if (this.field1304.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1304.length;
        int var11 = this.field1292 * arg0;
        int var12 = var9 - 1;
        if (this.field1302 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1306[var15] = this.field1304[var16];
            }
        }
        int[] var17 = this.field1304;
        this.field1304 = Statics.field1306;
        Statics.field1306 = var17;
    }
}
