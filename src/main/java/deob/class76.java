package deob;

@ObfuscatedName("bj")
public class class76 extends class186 {

    @ObfuscatedName("bj.t")
    public int field1339;

    @ObfuscatedName("bj.z")
    public boolean field1337;

    @ObfuscatedName("bj.g")
    public int[] field1344;

    @ObfuscatedName("bj.c")
    public int[] field1341;

    @ObfuscatedName("bj.o")
    public int[] field1342;

    @ObfuscatedName("bj.q")
    public int[] field1343;

    @ObfuscatedName("bj.w")
    public int field1334;

    @ObfuscatedName("bj.y")
    public int field1345;

    @ObfuscatedName("bj.p")
    public int[] field1336;

    @ObfuscatedName("bj.m")
    public boolean field1347 = false;

    public class76(class107 arg0) {
        this.field1339 = arg0.method2117();
        this.field1337 = arg0.method2115() == 1;
        int var2 = arg0.method2115();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1344 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1344[var3] = arg0.method2117();
        }
        if (var2 > 1) {
            this.field1341 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1341[var4] = arg0.method2115();
            }
        }
        if (var2 > 1) {
            this.field1342 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1342[var5] = arg0.method2115();
            }
        }
        this.field1343 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1343[var6] = arg0.method2120();
        }
        this.field1334 = arg0.method2115();
        this.field1345 = arg0.method2115();
        this.field1336 = null;
    }

    @ObfuscatedName("bj.k(DILey;)Z")
    public boolean method1579(double arg0, int arg1, class146 arg2) {
        for (int var5 = 0; var5 < this.field1344.length; var5++) {
            if (arg2.method2737(this.field1344[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1336 = new int[var6];
        for (int var7 = 0; var7 < this.field1344.length; var7++) {
            class74 var8 = class70.method2818(arg2, this.field1344[var7]);
            var8.method1562();
            byte[] var9 = var8.field1329;
            int[] var10 = var8.field1326;
            int var11 = this.field1343[var7];
            if ((var11 & 0xFF000000) == 16777216) {
            }
            if ((var11 & 0xFF000000) == 33554432) {
            }
            if ((var11 & 0xFF000000) == 50331648) {
                int var12 = var11 & 0xFF00FF;
                int var13 = var11 >> 8 & 0xFF;
                for (int var14 = 0; var14 < var10.length; var14++) {
                    int var15 = var10[var14];
                    if (var15 >> 8 == (var15 & 0xFFFF)) {
                        int var16 = var15 & 0xFF;
                        var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
                    }
                }
            }
            for (int var17 = 0; var17 < var10.length; var17++) {
                var10[var17] = class84.method1783(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1341[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1327 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1336[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1327 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1336[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1327 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1336[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var18 == 1) {
            }
            if (var18 == 2) {
            }
            if (var18 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("bj.b()V")
    public void method1578() {
        this.field1336 = null;
    }

    @ObfuscatedName("bj.e(I)V")
    public void method1580(int arg0) {
        if (this.field1336 == null) {
            return;
        }
        if (this.field1334 == 1 || this.field1334 == 3) {
            if (Statics.field1348 == null || Statics.field1348.length < this.field1336.length) {
                Statics.field1348 = new int[this.field1336.length];
            }
            short var2;
            if (this.field1336.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1336.length;
            int var4 = arg0 * var2 * this.field1345;
            int var5 = var3 - 1;
            if (this.field1334 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1348[var6] = this.field1336[var7];
            }
            int[] var8 = this.field1336;
            this.field1336 = Statics.field1348;
            Statics.field1348 = var8;
        }
        if (this.field1334 != 2 && this.field1334 != 4) {
            return;
        }
        if (Statics.field1348 == null || Statics.field1348.length < this.field1336.length) {
            Statics.field1348 = new int[this.field1336.length];
        }
        short var9;
        if (this.field1336.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1336.length;
        int var11 = this.field1345 * arg0;
        int var12 = var9 - 1;
        if (this.field1334 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1348[var15] = this.field1336[var16];
            }
        }
        int[] var17 = this.field1336;
        this.field1336 = Statics.field1348;
        Statics.field1348 = var17;
    }
}
