package deob;

@ObfuscatedName("bc")
public class class76 extends class184 {

    @ObfuscatedName("bc.r")
    public int field1331;

    @ObfuscatedName("bc.e")
    public boolean field1340;

    @ObfuscatedName("bc.k")
    public int[] field1337;

    @ObfuscatedName("bc.b")
    public int[] field1338;

    @ObfuscatedName("bc.n")
    public int[] field1339;

    @ObfuscatedName("bc.a")
    public int[] field1334;

    @ObfuscatedName("bc.q")
    public int field1336;

    @ObfuscatedName("bc.i")
    public int field1342;

    @ObfuscatedName("bc.f")
    public int[] field1343;

    @ObfuscatedName("bc.o")
    public boolean field1344 = false;

    public class76(class107 arg0) {
        this.field1331 = arg0.method2132();
        this.field1340 = arg0.method2130() == 1;
        int var2 = arg0.method2130();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1337 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1337[var3] = arg0.method2132();
        }
        if (var2 > 1) {
            this.field1338 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1338[var4] = arg0.method2130();
            }
        }
        if (var2 > 1) {
            this.field1339 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1339[var5] = arg0.method2130();
            }
        }
        this.field1334 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1334[var6] = arg0.method2135();
        }
        this.field1336 = arg0.method2130();
        this.field1342 = arg0.method2130();
        this.field1343 = null;
    }

    @ObfuscatedName("bc.j(DILeg;)Z")
    public boolean method1589(double arg0, int arg1, class146 arg2) {
        for (int var5 = 0; var5 < this.field1337.length; var5++) {
            if (arg2.method2746(this.field1337[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1343 = new int[var6];
        for (int var7 = 0; var7 < this.field1337.length; var7++) {
            class74 var8 = class70.method2456(arg2, this.field1337[var7]);
            var8.method1576();
            byte[] var9 = var8.field1325;
            int[] var10 = var8.field1323;
            int var11 = this.field1334[var7];
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
                var10[var17] = class84.method1817(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1338[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1324 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1343[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1324 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1343[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1324 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1343[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("bc.z()V")
    public void method1595() {
        this.field1343 = null;
    }

    @ObfuscatedName("bc.y(I)V")
    public void method1590(int arg0) {
        if (this.field1343 == null) {
            return;
        }
        if (this.field1336 == 1 || this.field1336 == 3) {
            if (Statics.field1341 == null || Statics.field1341.length < this.field1343.length) {
                Statics.field1341 = new int[this.field1343.length];
            }
            short var2;
            if (this.field1343.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1343.length;
            int var4 = arg0 * var2 * this.field1342;
            int var5 = var3 - 1;
            if (this.field1336 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1341[var6] = this.field1343[var7];
            }
            int[] var8 = this.field1343;
            this.field1343 = Statics.field1341;
            Statics.field1341 = var8;
        }
        if (this.field1336 != 2 && this.field1336 != 4) {
            return;
        }
        if (Statics.field1341 == null || Statics.field1341.length < this.field1343.length) {
            Statics.field1341 = new int[this.field1343.length];
        }
        short var9;
        if (this.field1343.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1343.length;
        int var11 = this.field1342 * arg0;
        int var12 = var9 - 1;
        if (this.field1336 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1341[var15] = this.field1343[var16];
            }
        }
        int[] var17 = this.field1343;
        this.field1343 = Statics.field1341;
        Statics.field1341 = var17;
    }
}
