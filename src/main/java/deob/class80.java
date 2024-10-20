package deob;

@ObfuscatedName("ce")
public class class80 extends class128 {

    @ObfuscatedName("ce.h")
    public int field1302;

    @ObfuscatedName("ce.v")
    public boolean field1303;

    @ObfuscatedName("ce.l")
    public int[] field1304;

    @ObfuscatedName("ce.c")
    public int[] field1311;

    @ObfuscatedName("ce.u")
    public int[] field1306;

    @ObfuscatedName("ce.k")
    public int[] field1307;

    @ObfuscatedName("ce.z")
    public int field1308;

    @ObfuscatedName("ce.y")
    public int field1309;

    @ObfuscatedName("ce.j")
    public int[] field1310;

    @ObfuscatedName("ce.f")
    public boolean field1305 = false;

    public class80(class154 arg0) {
        this.field1302 = arg0.method2554();
        this.field1303 = arg0.method2552() == 1;
        int var2 = arg0.method2552();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1304 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1304[var3] = arg0.method2554();
        }
        if (var2 > 1) {
            this.field1311 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1311[var4] = arg0.method2552();
            }
        }
        if (var2 > 1) {
            this.field1306 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1306[var5] = arg0.method2552();
            }
        }
        this.field1307 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1307[var6] = arg0.method2557();
        }
        this.field1308 = arg0.method2552();
        this.field1309 = arg0.method2552();
        this.field1310 = null;
    }

    @ObfuscatedName("ce.o(DILgl;)Z")
    public boolean method1433(double arg0, int arg1, class183 arg2) {
        for (int var5 = 0; var5 < this.field1304.length; var5++) {
            if (arg2.method3090(this.field1304[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1310 = new int[var6];
        for (int var7 = 0; var7 < this.field1304.length; var7++) {
            int var8 = this.field1304[var7];
            class223 var9;
            if (class226.method1756(arg2, var8)) {
                class223 var10 = new class223();
                var10.field3198 = Statics.field3078;
                var10.field3193 = Statics.field3217;
                var10.field3196 = Statics.field3126[0];
                var10.field3197 = Statics.field3218[0];
                var10.field3194 = Statics.field1558[0];
                var10.field3199 = Statics.field1200[0];
                var10.field3192 = Statics.field3216;
                var10.field3195 = Statics.field37[0];
                class226.method2997();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method3773();
            byte[] var13 = var9.field3195;
            int[] var14 = var9.field3192;
            int var15 = this.field1307[var7];
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
                var14[var21] = class85.method1573(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1311[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var9.field3194 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1310[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field3194 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1310[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3194 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1310[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("ce.m()V")
    public void method1440() {
        this.field1310 = null;
    }

    @ObfuscatedName("ce.b(I)V")
    public void method1435(int arg0) {
        if (this.field1310 == null) {
            return;
        }
        if (this.field1308 == 1 || this.field1308 == 3) {
            if (Statics.field1312 == null || Statics.field1312.length < this.field1310.length) {
                Statics.field1312 = new int[this.field1310.length];
            }
            short var2;
            if (this.field1310.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1310.length;
            int var4 = arg0 * var2 * this.field1309;
            int var5 = var3 - 1;
            if (this.field1308 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1312[var6] = this.field1310[var7];
            }
            int[] var8 = this.field1310;
            this.field1310 = Statics.field1312;
            Statics.field1312 = var8;
        }
        if (this.field1308 != 2 && this.field1308 != 4) {
            return;
        }
        if (Statics.field1312 == null || Statics.field1312.length < this.field1310.length) {
            Statics.field1312 = new int[this.field1310.length];
        }
        short var9;
        if (this.field1310.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1310.length;
        int var11 = this.field1309 * arg0;
        int var12 = var9 - 1;
        if (this.field1308 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1312[var15] = this.field1310[var16];
            }
        }
        int[] var17 = this.field1310;
        this.field1310 = Statics.field1312;
        Statics.field1312 = var17;
    }
}
