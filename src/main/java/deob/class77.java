package deob;

@ObfuscatedName("bv")
public class class77 extends class191 {

    @ObfuscatedName("bv.r")
    public int field1326;

    @ObfuscatedName("bv.f")
    public boolean field1327;

    @ObfuscatedName("bv.z")
    public int[] field1328;

    @ObfuscatedName("bv.o")
    public int[] field1324;

    @ObfuscatedName("bv.k")
    public int[] field1330;

    @ObfuscatedName("bv.s")
    public int[] field1331;

    @ObfuscatedName("bv.h")
    public int field1322;

    @ObfuscatedName("bv.m")
    public int field1333;

    @ObfuscatedName("bv.w")
    public int[] field1334;

    @ObfuscatedName("bv.q")
    public boolean field1335 = false;

    public class77(class110 arg0) {
        this.field1326 = arg0.method2243();
        this.field1327 = arg0.method2309() == 1;
        int var2 = arg0.method2309();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1328 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1328[var3] = arg0.method2243();
        }
        if (var2 > 1) {
            this.field1324 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1324[var4] = arg0.method2309();
            }
        }
        if (var2 > 1) {
            this.field1330 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1330[var5] = arg0.method2309();
            }
        }
        this.field1331 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1331[var6] = arg0.method2164();
        }
        this.field1322 = arg0.method2309();
        this.field1333 = arg0.method2309();
        this.field1334 = null;
    }

    @ObfuscatedName("bv.p(DILen;)Z")
    public boolean method1606(double arg0, int arg1, class151 arg2) {
        for (int var5 = 0; var5 < this.field1328.length; var5++) {
            if (arg2.method2755(this.field1328[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1334 = new int[var6];
        for (int var7 = 0; var7 < this.field1328.length; var7++) {
            int var8 = this.field1328[var7];
            class75 var9;
            if (class71.method1980(arg2, var8)) {
                class75 var10 = new class75();
                var10.field1314 = Statics.field1278;
                var10.field1320 = Statics.field1279;
                var10.field1317 = Statics.field1280[0];
                var10.field1319 = Statics.field1287[0];
                var10.field1315 = Statics.field1107[0];
                var10.field1313 = Statics.field3029[0];
                var10.field1318 = Statics.field1282;
                var10.field1316 = Statics.field1283[0];
                class71.method1379();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method1597();
            byte[] var13 = var9.field1316;
            int[] var14 = var9.field1318;
            int var15 = this.field1331[var7];
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
                var14[var21] = class85.method1809(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1324[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var9.field1315 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1334[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field1315 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1334[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1315 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1334[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("bv.y()V")
    public void method1607() {
        this.field1334 = null;
    }

    @ObfuscatedName("bv.d(I)V")
    public void method1613(int arg0) {
        if (this.field1334 == null) {
            return;
        }
        if (this.field1322 == 1 || this.field1322 == 3) {
            if (Statics.field1329 == null || Statics.field1329.length < this.field1334.length) {
                Statics.field1329 = new int[this.field1334.length];
            }
            short var2;
            if (this.field1334.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1334.length;
            int var4 = arg0 * var2 * this.field1333;
            int var5 = var3 - 1;
            if (this.field1322 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1329[var6] = this.field1334[var7];
            }
            int[] var8 = this.field1334;
            this.field1334 = Statics.field1329;
            Statics.field1329 = var8;
        }
        if (this.field1322 != 2 && this.field1322 != 4) {
            return;
        }
        if (Statics.field1329 == null || Statics.field1329.length < this.field1334.length) {
            Statics.field1329 = new int[this.field1334.length];
        }
        short var9;
        if (this.field1334.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1334.length;
        int var11 = this.field1333 * arg0;
        int var12 = var9 - 1;
        if (this.field1322 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1329[var15] = this.field1334[var16];
            }
        }
        int[] var17 = this.field1334;
        this.field1334 = Statics.field1329;
        Statics.field1329 = var17;
    }
}
