package deob;

@ObfuscatedName("bm")
public class class76 extends class186 {

    @ObfuscatedName("bm.m")
    public int field1330;

    @ObfuscatedName("bm.j")
    public boolean field1333;

    @ObfuscatedName("bm.g")
    public int[] field1332;

    @ObfuscatedName("bm.p")
    public int[] field1331;

    @ObfuscatedName("bm.o")
    public int[] field1334;

    @ObfuscatedName("bm.b")
    public int[] field1335;

    @ObfuscatedName("bm.x")
    public int field1336;

    @ObfuscatedName("bm.n")
    public int field1337;

    @ObfuscatedName("bm.d")
    public int[] field1338;

    @ObfuscatedName("bm.s")
    public boolean field1339 = false;

    public class76(class107 arg0) {
        this.field1330 = arg0.method2232();
        this.field1333 = arg0.method2111() == 1;
        int var2 = arg0.method2111();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1332 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1332[var3] = arg0.method2232();
        }
        if (var2 > 1) {
            this.field1331 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1331[var4] = arg0.method2111();
            }
        }
        if (var2 > 1) {
            this.field1334 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1334[var5] = arg0.method2111();
            }
        }
        this.field1335 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1335[var6] = arg0.method2116();
        }
        this.field1336 = arg0.method2111();
        this.field1337 = arg0.method2111();
        this.field1338 = null;
    }

    @ObfuscatedName("bm.k(DILee;)Z")
    public boolean method1590(double arg0, int arg1, class146 arg2) {
        for (int var5 = 0; var5 < this.field1332.length; var5++) {
            if (arg2.method2685(this.field1332[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1338 = new int[var6];
        for (int var7 = 0; var7 < this.field1332.length; var7++) {
            int var8 = this.field1332[var7];
            byte[] var9 = arg2.method2683(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class70.method3124(var9);
                var10 = true;
            }
            class74 var11;
            if (var10) {
                var11 = class70.method1355();
            } else {
                var11 = null;
            }
            var11.method1573();
            byte[] var13 = var11.field1324;
            int[] var14 = var11.field1319;
            int var15 = this.field1335[var7];
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
                var14[var21] = class84.method1796(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1331[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var11.field1317 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1338[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field1317 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1338[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1317 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1338[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("bm.r()V")
    public void method1591() {
        this.field1338 = null;
    }

    @ObfuscatedName("bm.y(I)V")
    public void method1592(int arg0) {
        if (this.field1338 == null) {
            return;
        }
        if (this.field1336 == 1 || this.field1336 == 3) {
            if (Statics.field1327 == null || Statics.field1327.length < this.field1338.length) {
                Statics.field1327 = new int[this.field1338.length];
            }
            short var2;
            if (this.field1338.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1338.length;
            int var4 = arg0 * var2 * this.field1337;
            int var5 = var3 - 1;
            if (this.field1336 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1327[var6] = this.field1338[var7];
            }
            int[] var8 = this.field1338;
            this.field1338 = Statics.field1327;
            Statics.field1327 = var8;
        }
        if (this.field1336 != 2 && this.field1336 != 4) {
            return;
        }
        if (Statics.field1327 == null || Statics.field1327.length < this.field1338.length) {
            Statics.field1327 = new int[this.field1338.length];
        }
        short var9;
        if (this.field1338.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1338.length;
        int var11 = this.field1337 * arg0;
        int var12 = var9 - 1;
        if (this.field1336 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1327[var15] = this.field1338[var16];
            }
        }
        int[] var17 = this.field1338;
        this.field1338 = Statics.field1327;
        Statics.field1327 = var17;
    }
}
