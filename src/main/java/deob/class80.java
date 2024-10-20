package deob;

@ObfuscatedName("ci")
public class class80 extends class128 {

    @ObfuscatedName("ci.f")
    public int field1302;

    @ObfuscatedName("ci.c")
    public boolean field1307;

    @ObfuscatedName("ci.d")
    public int[] field1305;

    @ObfuscatedName("ci.l")
    public int[] field1308;

    @ObfuscatedName("ci.g")
    public int[] field1310;

    @ObfuscatedName("ci.z")
    public int[] field1311;

    @ObfuscatedName("ci.t")
    public int field1312;

    @ObfuscatedName("ci.m")
    public int field1313;

    @ObfuscatedName("ci.q")
    public int[] field1314;

    @ObfuscatedName("ci.e")
    public boolean field1315 = false;

    public class80(class154 arg0) {
        this.field1302 = arg0.method2581();
        this.field1307 = arg0.method2708() == 1;
        int var2 = arg0.method2708();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1305 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1305[var3] = arg0.method2581();
        }
        if (var2 > 1) {
            this.field1308 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1308[var4] = arg0.method2708();
            }
        }
        if (var2 > 1) {
            this.field1310 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1310[var5] = arg0.method2708();
            }
        }
        this.field1311 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1311[var6] = arg0.method2593();
        }
        this.field1312 = arg0.method2708();
        this.field1313 = arg0.method2708();
        this.field1314 = null;
    }

    @ObfuscatedName("ci.u(DILgt;)Z")
    public boolean method1434(double arg0, int arg1, class183 arg2) {
        for (int var5 = 0; var5 < this.field1305.length; var5++) {
            if (arg2.method3110(this.field1305[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1314 = new int[var6];
        for (int var7 = 0; var7 < this.field1305.length; var7++) {
            int var8 = this.field1305[var7];
            class223 var9;
            if (class226.method2556(arg2, var8)) {
                var9 = class226.method3051();
            } else {
                var9 = null;
            }
            var9.method3836();
            byte[] var11 = var9.field3194;
            int[] var12 = var9.field3192;
            int var13 = this.field1311[var7];
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
                var12[var19] = class85.method1538(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1308[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var20 == 0) {
                if (var9.field3196 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1314[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field3196 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1314[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3196 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1314[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("ci.x()V")
    public void method1432() {
        this.field1314 = null;
    }

    @ObfuscatedName("ci.i(I)V")
    public void method1433(int arg0) {
        if (this.field1314 == null) {
            return;
        }
        if (this.field1312 == 1 || this.field1312 == 3) {
            if (Statics.field1316 == null || Statics.field1316.length < this.field1314.length) {
                Statics.field1316 = new int[this.field1314.length];
            }
            short var2;
            if (this.field1314.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1314.length;
            int var4 = arg0 * var2 * this.field1313;
            int var5 = var3 - 1;
            if (this.field1312 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1316[var6] = this.field1314[var7];
            }
            int[] var8 = this.field1314;
            this.field1314 = Statics.field1316;
            Statics.field1316 = var8;
        }
        if (this.field1312 != 2 && this.field1312 != 4) {
            return;
        }
        if (Statics.field1316 == null || Statics.field1316.length < this.field1314.length) {
            Statics.field1316 = new int[this.field1314.length];
        }
        short var9;
        if (this.field1314.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1314.length;
        int var11 = this.field1313 * arg0;
        int var12 = var9 - 1;
        if (this.field1312 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1316[var15] = this.field1314[var16];
            }
        }
        int[] var17 = this.field1314;
        this.field1314 = Statics.field1316;
        Statics.field1316 = var17;
    }
}
