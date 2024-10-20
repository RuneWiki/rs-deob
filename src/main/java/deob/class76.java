package deob;

@ObfuscatedName("bb")
public class class76 extends class186 {

    @ObfuscatedName("bb.k")
    public int field1326;

    @ObfuscatedName("bb.l")
    public boolean field1328;

    @ObfuscatedName("bb.e")
    public int[] field1329;

    @ObfuscatedName("bb.j")
    public int[] field1330;

    @ObfuscatedName("bb.n")
    public int[] field1331;

    @ObfuscatedName("bb.f")
    public int[] field1332;

    @ObfuscatedName("bb.a")
    public int field1333;

    @ObfuscatedName("bb.i")
    public int field1334;

    @ObfuscatedName("bb.y")
    public int[] field1323;

    @ObfuscatedName("bb.p")
    public boolean field1327 = false;

    public class76(class107 arg0) {
        this.field1326 = arg0.method2141();
        this.field1328 = arg0.method2139() == 1;
        int var2 = arg0.method2139();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1329 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1329[var3] = arg0.method2141();
        }
        if (var2 > 1) {
            this.field1330 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1330[var4] = arg0.method2139();
            }
        }
        if (var2 > 1) {
            this.field1331 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1331[var5] = arg0.method2139();
            }
        }
        this.field1332 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1332[var6] = arg0.method2144();
        }
        this.field1333 = arg0.method2139();
        this.field1334 = arg0.method2139();
        this.field1323 = null;
    }

    @ObfuscatedName("bb.g(DILec;)Z")
    public boolean method1611(double arg0, int arg1, class146 arg2) {
        for (int var5 = 0; var5 < this.field1329.length; var5++) {
            if (arg2.method2716(this.field1329[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1323 = new int[var6];
        for (int var7 = 0; var7 < this.field1329.length; var7++) {
            int var8 = this.field1329[var7];
            byte[] var9 = arg2.method2713(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class70.method1874(var9);
                var10 = true;
            }
            class74 var11;
            if (var10) {
                var11 = class70.method102();
            } else {
                var11 = null;
            }
            var11.method1608();
            byte[] var13 = var11.field1320;
            int[] var14 = var11.field1319;
            int var15 = this.field1332[var7];
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
                var14[var21] = class84.method1816(var14[var21], arg0);
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
                if (var11.field1316 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1323[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field1316 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1323[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1316 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1323[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("bb.v()V")
    public void method1609() {
        this.field1323 = null;
    }

    @ObfuscatedName("bb.z(I)V")
    public void method1610(int arg0) {
        if (this.field1323 == null) {
            return;
        }
        if (this.field1333 == 1 || this.field1333 == 3) {
            if (Statics.field1337 == null || Statics.field1337.length < this.field1323.length) {
                Statics.field1337 = new int[this.field1323.length];
            }
            short var2;
            if (this.field1323.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1323.length;
            int var4 = arg0 * var2 * this.field1334;
            int var5 = var3 - 1;
            if (this.field1333 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1337[var6] = this.field1323[var7];
            }
            int[] var8 = this.field1323;
            this.field1323 = Statics.field1337;
            Statics.field1337 = var8;
        }
        if (this.field1333 != 2 && this.field1333 != 4) {
            return;
        }
        if (Statics.field1337 == null || Statics.field1337.length < this.field1323.length) {
            Statics.field1337 = new int[this.field1323.length];
        }
        short var9;
        if (this.field1323.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1323.length;
        int var11 = this.field1334 * arg0;
        int var12 = var9 - 1;
        if (this.field1333 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1337[var15] = this.field1323[var16];
            }
        }
        int[] var17 = this.field1323;
        this.field1323 = Statics.field1337;
        Statics.field1337 = var17;
    }
}
