package deob;

@ObfuscatedName("bi")
public class class77 extends class189 {

    @ObfuscatedName("bi.h")
    public int field1333;

    @ObfuscatedName("bi.p")
    public boolean field1335;

    @ObfuscatedName("bi.j")
    public int[] field1336;

    @ObfuscatedName("bi.i")
    public int[] field1337;

    @ObfuscatedName("bi.u")
    public int[] field1338;

    @ObfuscatedName("bi.l")
    public int[] field1342;

    @ObfuscatedName("bi.k")
    public int field1341;

    @ObfuscatedName("bi.q")
    public int field1330;

    @ObfuscatedName("bi.b")
    public int[] field1339;

    @ObfuscatedName("bi.w")
    public boolean field1343 = false;

    public class77(class108 arg0) {
        this.field1333 = arg0.method2129();
        this.field1335 = arg0.method2299() == 1;
        int var2 = arg0.method2299();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1336 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1336[var3] = arg0.method2129();
        }
        if (var2 > 1) {
            this.field1337 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1337[var4] = arg0.method2299();
            }
        }
        if (var2 > 1) {
            this.field1338 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1338[var5] = arg0.method2299();
            }
        }
        this.field1342 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1342[var6] = arg0.method2132();
        }
        this.field1341 = arg0.method2299();
        this.field1330 = arg0.method2299();
        this.field1339 = null;
    }

    @ObfuscatedName("bi.x(DILey;)Z")
    public boolean method1608(double arg0, int arg1, class149 arg2) {
        for (int var5 = 0; var5 < this.field1336.length; var5++) {
            if (arg2.method2742(this.field1336[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1339 = new int[var6];
        for (int var7 = 0; var7 < this.field1336.length; var7++) {
            int var8 = this.field1336[var7];
            class75 var9;
            if (class71.method23(arg2, var8)) {
                var9 = class71.method2591();
            } else {
                var9 = null;
            }
            var9.method1596();
            byte[] var11 = var9.field1326;
            int[] var12 = var9.field1322;
            int var13 = this.field1342[var7];
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
                var12[var19] = class85.method1803(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1337[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var20 == 0) {
                if (var9.field1323 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1339[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field1323 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1339[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1323 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1339[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("bi.v()V")
    public void method1609() {
        this.field1339 = null;
    }

    @ObfuscatedName("bi.m(I)V")
    public void method1611(int arg0) {
        if (this.field1339 == null) {
            return;
        }
        if (this.field1341 == 1 || this.field1341 == 3) {
            if (Statics.field1344 == null || Statics.field1344.length < this.field1339.length) {
                Statics.field1344 = new int[this.field1339.length];
            }
            short var2;
            if (this.field1339.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1339.length;
            int var4 = arg0 * var2 * this.field1330;
            int var5 = var3 - 1;
            if (this.field1341 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1344[var6] = this.field1339[var7];
            }
            int[] var8 = this.field1339;
            this.field1339 = Statics.field1344;
            Statics.field1344 = var8;
        }
        if (this.field1341 != 2 && this.field1341 != 4) {
            return;
        }
        if (Statics.field1344 == null || Statics.field1344.length < this.field1339.length) {
            Statics.field1344 = new int[this.field1339.length];
        }
        short var9;
        if (this.field1339.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1339.length;
        int var11 = this.field1330 * arg0;
        int var12 = var9 - 1;
        if (this.field1341 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1344[var15] = this.field1339[var16];
            }
        }
        int[] var17 = this.field1339;
        this.field1339 = Statics.field1344;
        Statics.field1344 = var17;
    }
}
