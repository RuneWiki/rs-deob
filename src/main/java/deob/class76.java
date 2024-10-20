package deob;

@ObfuscatedName("bs")
public class class76 extends class183 {

    @ObfuscatedName("bs.u")
    public int field1317;

    @ObfuscatedName("bs.k")
    public boolean field1328;

    @ObfuscatedName("bs.m")
    public int[] field1321;

    @ObfuscatedName("bs.t")
    public int[] field1324;

    @ObfuscatedName("bs.l")
    public int[] field1325;

    @ObfuscatedName("bs.f")
    public int[] field1318;

    @ObfuscatedName("bs.c")
    public int field1327;

    @ObfuscatedName("bs.i")
    public int field1323;

    @ObfuscatedName("bs.o")
    public int[] field1329;

    @ObfuscatedName("bs.d")
    public boolean field1326 = false;

    public class76(class107 arg0) {
        this.field1317 = arg0.method2182();
        this.field1328 = arg0.method2125() == 1;
        int var2 = arg0.method2125();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1321 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1321[var3] = arg0.method2182();
        }
        if (var2 > 1) {
            this.field1324 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1324[var4] = arg0.method2125();
            }
        }
        if (var2 > 1) {
            this.field1325 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1325[var5] = arg0.method2125();
            }
        }
        this.field1318 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1318[var6] = arg0.method2146();
        }
        this.field1327 = arg0.method2125();
        this.field1323 = arg0.method2125();
        this.field1329 = null;
    }

    @ObfuscatedName("bs.e(DILec;)Z")
    public boolean method1600(double arg0, int arg1, class145 arg2) {
        for (int var5 = 0; var5 < this.field1321.length; var5++) {
            if (arg2.method2746(this.field1321[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1329 = new int[var6];
        for (int var7 = 0; var7 < this.field1321.length; var7++) {
            int var8 = this.field1321[var7];
            class74 var9;
            if (class70.method835(arg2, var8)) {
                var9 = class70.method846();
            } else {
                var9 = null;
            }
            var9.method1577();
            byte[] var11 = var9.field1311;
            int[] var12 = var9.field1309;
            int var13 = this.field1318[var7];
            if ((var13 & 0xFF000000) == 16777216) {
            }
            if ((var13 & 0xFF000000) == 33554432) {
            }
            if ((var13 & 0xFF000000) == 50331648) {
                int var14 = var13 & 0xFF00FF;
                int var15 = var13 >> 8 & 0xFF;
                for (int var16 = 0; var16 < var12.length; var16++) {
                    int var17 = var12[var16];
                    if (var17 >> 8 == (var17 & 0xFFFF)) {
                        int var18 = var17 & 0xFF;
                        var12[var16] = var14 * var18 >> 8 & 0xFF00FF | var15 * var18 & 0xFF00;
                    }
                }
            }
            for (int var19 = 0; var19 < var12.length; var19++) {
                var12[var19] = class84.method1839(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1324[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var20 == 0) {
                if (var9.field1308 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1329[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field1308 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1329[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1308 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1329[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var20 == 1) {
            }
            if (var20 == 2) {
            }
            if (var20 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("bs.p()V")
    public void method1594() {
        this.field1329 = null;
    }

    @ObfuscatedName("bs.a(I)V")
    public void method1595(int arg0) {
        if (this.field1329 == null) {
            return;
        }
        if (this.field1327 == 1 || this.field1327 == 3) {
            if (Statics.field1330 == null || Statics.field1330.length < this.field1329.length) {
                Statics.field1330 = new int[this.field1329.length];
            }
            short var2;
            if (this.field1329.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1329.length;
            int var4 = arg0 * var2 * this.field1323;
            int var5 = var3 - 1;
            if (this.field1327 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1330[var6] = this.field1329[var7];
            }
            int[] var8 = this.field1329;
            this.field1329 = Statics.field1330;
            Statics.field1330 = var8;
        }
        if (this.field1327 != 2 && this.field1327 != 4) {
            return;
        }
        if (Statics.field1330 == null || Statics.field1330.length < this.field1329.length) {
            Statics.field1330 = new int[this.field1329.length];
        }
        short var9;
        if (this.field1329.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1329.length;
        int var11 = this.field1323 * arg0;
        int var12 = var9 - 1;
        if (this.field1327 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1330[var15] = this.field1329[var16];
            }
        }
        int[] var17 = this.field1329;
        this.field1329 = Statics.field1330;
        Statics.field1330 = var17;
    }
}
