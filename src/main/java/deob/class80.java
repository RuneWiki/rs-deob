package deob;

@ObfuscatedName("ci")
public class class80 extends class128 {

    @ObfuscatedName("ci.y")
    public int field1313;

    @ObfuscatedName("ci.p")
    public boolean field1318;

    @ObfuscatedName("ci.j")
    public int[] field1315;

    @ObfuscatedName("ci.m")
    public int[] field1320;

    @ObfuscatedName("ci.a")
    public int[] field1321;

    @ObfuscatedName("ci.i")
    public int[] field1322;

    @ObfuscatedName("ci.s")
    public int field1314;

    @ObfuscatedName("ci.k")
    public int field1324;

    @ObfuscatedName("ci.f")
    public int[] field1325;

    @ObfuscatedName("ci.o")
    public boolean field1316 = false;

    public class80(class154 arg0) {
        this.field1313 = arg0.method2833();
        this.field1318 = arg0.method2878() == 1;
        int var2 = arg0.method2878();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1315 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1315[var3] = arg0.method2833();
        }
        if (var2 > 1) {
            this.field1320 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1320[var4] = arg0.method2878();
            }
        }
        if (var2 > 1) {
            this.field1321 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1321[var5] = arg0.method2878();
            }
        }
        this.field1322 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1322[var6] = arg0.method2803();
        }
        this.field1314 = arg0.method2878();
        this.field1324 = arg0.method2878();
        this.field1325 = null;
    }

    @ObfuscatedName("ci.x(DILgo;)Z")
    public boolean method1550(double arg0, int arg1, class183 arg2) {
        for (int var5 = 0; var5 < this.field1315.length; var5++) {
            if (arg2.method3160(this.field1315[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1325 = new int[var6];
        for (int var7 = 0; var7 < this.field1315.length; var7++) {
            int var8 = this.field1315[var7];
            byte[] var9 = arg2.method3158(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                Statics.method2061(var9);
                var10 = true;
            }
            class223 var11;
            if (var10) {
                class223 var12 = new class223();
                var12.field3216 = Statics.field3235;
                var12.field3210 = Statics.field3;
                var12.field3214 = Statics.field3237[0];
                var12.field3215 = Statics.field2014[0];
                var12.field3217 = Statics.field2776[0];
                var12.field3213 = Statics.field3236[0];
                var12.field3211 = Statics.field3238;
                var12.field3212 = Statics.field212[0];
                class226.method1899();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method3886();
            byte[] var15 = var11.field3212;
            int[] var16 = var11.field3211;
            int var17 = this.field1322[var7];
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
                var16[var23] = class85.method1652(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1320[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field3217 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1325[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field3217 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1325[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field3217 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1325[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
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

    @ObfuscatedName("ci.n()V")
    public void method1557() {
        this.field1325 = null;
    }

    @ObfuscatedName("ci.g(I)V")
    public void method1552(int arg0) {
        if (this.field1325 == null) {
            return;
        }
        if (this.field1314 == 1 || this.field1314 == 3) {
            if (Statics.field1327 == null || Statics.field1327.length < this.field1325.length) {
                Statics.field1327 = new int[this.field1325.length];
            }
            short var2;
            if (this.field1325.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1325.length;
            int var4 = arg0 * var2 * this.field1324;
            int var5 = var3 - 1;
            if (this.field1314 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1327[var6] = this.field1325[var7];
            }
            int[] var8 = this.field1325;
            this.field1325 = Statics.field1327;
            Statics.field1327 = var8;
        }
        if (this.field1314 != 2 && this.field1314 != 4) {
            return;
        }
        if (Statics.field1327 == null || Statics.field1327.length < this.field1325.length) {
            Statics.field1327 = new int[this.field1325.length];
        }
        short var9;
        if (this.field1325.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1325.length;
        int var11 = this.field1324 * arg0;
        int var12 = var9 - 1;
        if (this.field1314 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1327[var15] = this.field1325[var16];
            }
        }
        int[] var17 = this.field1325;
        this.field1325 = Statics.field1327;
        Statics.field1327 = var17;
    }
}
