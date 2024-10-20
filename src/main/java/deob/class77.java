package deob;

@ObfuscatedName("bj")
public class class77 extends class189 {

    @ObfuscatedName("bj.k")
    public int field1334;

    @ObfuscatedName("bj.c")
    public boolean field1335;

    @ObfuscatedName("bj.w")
    public int[] field1336;

    @ObfuscatedName("bj.l")
    public int[] field1330;

    @ObfuscatedName("bj.n")
    public int[] field1342;

    @ObfuscatedName("bj.d")
    public int[] field1338;

    @ObfuscatedName("bj.h")
    public int field1343;

    @ObfuscatedName("bj.y")
    public int field1341;

    @ObfuscatedName("bj.p")
    public int[] field1337;

    @ObfuscatedName("bj.i")
    public boolean field1339 = false;

    public class77(class108 arg0) {
        this.field1334 = arg0.method2263();
        this.field1335 = arg0.method2083() == 1;
        int var2 = arg0.method2083();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1336 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1336[var3] = arg0.method2263();
        }
        if (var2 > 1) {
            this.field1330 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1330[var4] = arg0.method2083();
            }
        }
        if (var2 > 1) {
            this.field1342 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1342[var5] = arg0.method2083();
            }
        }
        this.field1338 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1338[var6] = arg0.method2117();
        }
        this.field1343 = arg0.method2083();
        this.field1341 = arg0.method2083();
        this.field1337 = null;
    }

    @ObfuscatedName("bj.g(DILei;)Z")
    public boolean method1542(double arg0, int arg1, class149 arg2) {
        for (int var5 = 0; var5 < this.field1336.length; var5++) {
            if (arg2.method2713(this.field1336[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1337 = new int[var6];
        for (int var7 = 0; var7 < this.field1336.length; var7++) {
            int var8 = this.field1336[var7];
            byte[] var9 = arg2.method2665(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class71.method739(var9);
                var10 = true;
            }
            class75 var11;
            if (var10) {
                var11 = class71.method1320();
            } else {
                var11 = null;
            }
            var11.method1523();
            byte[] var13 = var11.field1321;
            int[] var14 = var11.field1322;
            int var15 = this.field1338[var7];
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
                var14[var21] = class85.method1808(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1330[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var11.field1323 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1337[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field1323 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1337[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1323 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1337[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("bj.j()V")
    public void method1543() {
        this.field1337 = null;
    }

    @ObfuscatedName("bj.z(I)V")
    public void method1544(int arg0) {
        if (this.field1337 == null) {
            return;
        }
        if (this.field1343 == 1 || this.field1343 == 3) {
            if (Statics.field1344 == null || Statics.field1344.length < this.field1337.length) {
                Statics.field1344 = new int[this.field1337.length];
            }
            short var2;
            if (this.field1337.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1337.length;
            int var4 = arg0 * var2 * this.field1341;
            int var5 = var3 - 1;
            if (this.field1343 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1344[var6] = this.field1337[var7];
            }
            int[] var8 = this.field1337;
            this.field1337 = Statics.field1344;
            Statics.field1344 = var8;
        }
        if (this.field1343 != 2 && this.field1343 != 4) {
            return;
        }
        if (Statics.field1344 == null || Statics.field1344.length < this.field1337.length) {
            Statics.field1344 = new int[this.field1337.length];
        }
        short var9;
        if (this.field1337.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1337.length;
        int var11 = this.field1341 * arg0;
        int var12 = var9 - 1;
        if (this.field1343 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1344[var15] = this.field1337[var16];
            }
        }
        int[] var17 = this.field1337;
        this.field1337 = Statics.field1344;
        Statics.field1344 = var17;
    }
}
