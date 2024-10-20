package deob;

@ObfuscatedName("cg")
public class class80 extends class128 {

    @ObfuscatedName("cg.a")
    public int field1309;

    @ObfuscatedName("cg.g")
    public boolean field1310;

    @ObfuscatedName("cg.k")
    public int[] field1307;

    @ObfuscatedName("cg.u")
    public int[] field1312;

    @ObfuscatedName("cg.b")
    public int[] field1306;

    @ObfuscatedName("cg.x")
    public int[] field1314;

    @ObfuscatedName("cg.r")
    public int field1315;

    @ObfuscatedName("cg.n")
    public int field1316;

    @ObfuscatedName("cg.m")
    public int[] field1319;

    @ObfuscatedName("cg.j")
    public boolean field1318 = false;

    public class80(class154 arg0) {
        this.field1309 = arg0.method2541();
        this.field1310 = arg0.method2545() == 1;
        int var2 = arg0.method2545();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1307 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1307[var3] = arg0.method2541();
        }
        if (var2 > 1) {
            this.field1312 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1312[var4] = arg0.method2545();
            }
        }
        if (var2 > 1) {
            this.field1306 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1306[var5] = arg0.method2545();
            }
        }
        this.field1314 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1314[var6] = arg0.method2550();
        }
        this.field1315 = arg0.method2545();
        this.field1316 = arg0.method2545();
        this.field1319 = null;
    }

    @ObfuscatedName("cg.s(DILgp;)Z")
    public boolean method1432(double arg0, int arg1, class183 arg2) {
        for (int var5 = 0; var5 < this.field1307.length; var5++) {
            if (arg2.method2993(this.field1307[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1319 = new int[var6];
        for (int var7 = 0; var7 < this.field1307.length; var7++) {
            int var8 = this.field1307[var7];
            class223 var9;
            if (class226.method2745(arg2, var8)) {
                class223 var10 = new class223();
                var10.field3196 = Statics.field3219;
                var10.field3203 = Statics.field3220;
                var10.field3200 = Statics.field2711[0];
                var10.field3201 = Statics.field3221[0];
                var10.field3198 = Statics.field1866[0];
                var10.field3199 = Statics.field1743[0];
                var10.field3197 = Statics.field3218;
                var10.field3202 = Statics.field889[0];
                class226.method646();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method3703();
            byte[] var13 = var9.field3202;
            int[] var14 = var9.field3197;
            int var15 = this.field1314[var7];
            if ((var15 & 0xFF000000) == 16777216) {
            }
            if ((var15 & 0xFF000000) == 33554432) {
            }
            if ((var15 & 0xFF000000) == 50331648) {
                int var16 = var15 & 0xFF00FF;
                int var17 = var15 >> 8 & 0xFF;
                for (int var18 = 0; var18 < var14.length; var18++) {
                    int var19 = var14[var18];
                    if (var19 >> 8 == (var19 & 0xFFFF)) {
                        int var20 = var19 & 0xFF;
                        var14[var18] = var16 * var20 >> 8 & 0xFF00FF | var17 * var20 & 0xFF00;
                    }
                }
            }
            for (int var21 = 0; var21 < var14.length; var21++) {
                var14[var21] = class85.method1525(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1312[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var9.field3198 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1319[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field3198 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1319[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3198 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1319[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var22 == 1) {
            }
            if (var22 == 2) {
            }
            if (var22 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("cg.c()V")
    public void method1434() {
        this.field1319 = null;
    }

    @ObfuscatedName("cg.f(I)V")
    public void method1431(int arg0) {
        if (this.field1319 == null) {
            return;
        }
        if (this.field1315 == 1 || this.field1315 == 3) {
            if (Statics.field1313 == null || Statics.field1313.length < this.field1319.length) {
                Statics.field1313 = new int[this.field1319.length];
            }
            short var2;
            if (this.field1319.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1319.length;
            int var4 = arg0 * var2 * this.field1316;
            int var5 = var3 - 1;
            if (this.field1315 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1313[var6] = this.field1319[var7];
            }
            int[] var8 = this.field1319;
            this.field1319 = Statics.field1313;
            Statics.field1313 = var8;
        }
        if (this.field1315 != 2 && this.field1315 != 4) {
            return;
        }
        if (Statics.field1313 == null || Statics.field1313.length < this.field1319.length) {
            Statics.field1313 = new int[this.field1319.length];
        }
        short var9;
        if (this.field1319.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1319.length;
        int var11 = this.field1316 * arg0;
        int var12 = var9 - 1;
        if (this.field1315 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1313[var15] = this.field1319[var16];
            }
        }
        int[] var17 = this.field1319;
        this.field1319 = Statics.field1313;
        Statics.field1313 = var17;
    }
}
