package deob;

@ObfuscatedName("bo")
public class class76 extends class187 {

    @ObfuscatedName("bo.k")
    public int field1337;

    @ObfuscatedName("bo.m")
    public boolean field1342;

    @ObfuscatedName("bo.i")
    public int[] field1340;

    @ObfuscatedName("bo.t")
    public int[] field1333;

    @ObfuscatedName("bo.l")
    public int[] field1341;

    @ObfuscatedName("bo.p")
    public int[] field1339;

    @ObfuscatedName("bo.r")
    public int field1343;

    @ObfuscatedName("bo.j")
    public int field1344;

    @ObfuscatedName("bo.c")
    public int[] field1345;

    @ObfuscatedName("bo.q")
    public boolean field1346 = false;

    public class76(class107 arg0) {
        this.field1337 = arg0.method2094();
        this.field1342 = arg0.method2116() == 1;
        int var2 = arg0.method2116();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1340 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1340[var3] = arg0.method2094();
        }
        if (var2 > 1) {
            this.field1333 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1333[var4] = arg0.method2116();
            }
        }
        if (var2 > 1) {
            this.field1341 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1341[var5] = arg0.method2116();
            }
        }
        this.field1339 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1339[var6] = arg0.method2097();
        }
        this.field1343 = arg0.method2116();
        this.field1344 = arg0.method2116();
        this.field1345 = null;
    }

    @ObfuscatedName("bo.g(DILet;)Z")
    public boolean method1558(double arg0, int arg1, class147 arg2) {
        for (int var5 = 0; var5 < this.field1340.length; var5++) {
            if (arg2.method2666(this.field1340[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1345 = new int[var6];
        for (int var7 = 0; var7 < this.field1340.length; var7++) {
            int var8 = this.field1340[var7];
            byte[] var9 = arg2.method2691(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class70.method1843(var9);
                var10 = true;
            }
            class74 var11;
            if (var10) {
                var11 = class70.method476();
            } else {
                var11 = null;
            }
            var11.method1552();
            byte[] var13 = var11.field1329;
            int[] var14 = var11.field1331;
            int var15 = this.field1339[var7];
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
                var14[var21] = class84.method1748(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1333[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var11.field1326 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1345[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field1326 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1345[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1326 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1345[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("bo.s()V")
    public void method1559() {
        this.field1345 = null;
    }

    @ObfuscatedName("bo.v(I)V")
    public void method1566(int arg0) {
        if (this.field1345 == null) {
            return;
        }
        if (this.field1343 == 1 || this.field1343 == 3) {
            if (Statics.field1347 == null || Statics.field1347.length < this.field1345.length) {
                Statics.field1347 = new int[this.field1345.length];
            }
            short var2;
            if (this.field1345.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1345.length;
            int var4 = arg0 * var2 * this.field1344;
            int var5 = var3 - 1;
            if (this.field1343 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1347[var6] = this.field1345[var7];
            }
            int[] var8 = this.field1345;
            this.field1345 = Statics.field1347;
            Statics.field1347 = var8;
        }
        if (this.field1343 != 2 && this.field1343 != 4) {
            return;
        }
        if (Statics.field1347 == null || Statics.field1347.length < this.field1345.length) {
            Statics.field1347 = new int[this.field1345.length];
        }
        short var9;
        if (this.field1345.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1345.length;
        int var11 = this.field1344 * arg0;
        int var12 = var9 - 1;
        if (this.field1343 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1347[var15] = this.field1345[var16];
            }
        }
        int[] var17 = this.field1345;
        this.field1345 = Statics.field1347;
        Statics.field1347 = var17;
    }
}
