package deob;

@ObfuscatedName("bn")
public class class77 extends class191 {

    @ObfuscatedName("bn.h")
    public int field1335;

    @ObfuscatedName("bn.p")
    public boolean field1344;

    @ObfuscatedName("bn.n")
    public int[] field1337;

    @ObfuscatedName("bn.o")
    public int[] field1342;

    @ObfuscatedName("bn.g")
    public int[] field1339;

    @ObfuscatedName("bn.z")
    public int[] field1340;

    @ObfuscatedName("bn.t")
    public int field1341;

    @ObfuscatedName("bn.y")
    public int field1334;

    @ObfuscatedName("bn.w")
    public int[] field1336;

    @ObfuscatedName("bn.x")
    public boolean field1331 = false;

    public class77(class110 arg0) {
        this.field1335 = arg0.method2292();
        this.field1344 = arg0.method2142() == 1;
        int var2 = arg0.method2142();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1337 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1337[var3] = arg0.method2292();
        }
        if (var2 > 1) {
            this.field1342 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1342[var4] = arg0.method2142();
            }
        }
        if (var2 > 1) {
            this.field1339 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1339[var5] = arg0.method2142();
            }
        }
        this.field1340 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1340[var6] = arg0.method2195();
        }
        this.field1341 = arg0.method2142();
        this.field1334 = arg0.method2142();
        this.field1336 = null;
    }

    @ObfuscatedName("bn.b(DILex;)Z")
    public boolean method1587(double arg0, int arg1, class151 arg2) {
        for (int var5 = 0; var5 < this.field1337.length; var5++) {
            if (arg2.method2769(this.field1337[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1336 = new int[var6];
        for (int var7 = 0; var7 < this.field1337.length; var7++) {
            int var8 = this.field1337[var7];
            class75 var9;
            if (class71.method1955(arg2, var8)) {
                var9 = class71.method898();
            } else {
                var9 = null;
            }
            var9.method1572();
            byte[] var11 = var9.field1327;
            int[] var12 = var9.field1323;
            int var13 = this.field1340[var7];
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
                var12[var19] = class85.method1833(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1342[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var20 == 0) {
                if (var9.field1324 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1336[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field1324 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1336[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1324 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1336[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("bn.e()V")
    public void method1585() {
        this.field1336 = null;
    }

    @ObfuscatedName("bn.i(I)V")
    public void method1588(int arg0) {
        if (this.field1336 == null) {
            return;
        }
        if (this.field1341 == 1 || this.field1341 == 3) {
            if (Statics.field1345 == null || Statics.field1345.length < this.field1336.length) {
                Statics.field1345 = new int[this.field1336.length];
            }
            short var2;
            if (this.field1336.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1336.length;
            int var4 = arg0 * var2 * this.field1334;
            int var5 = var3 - 1;
            if (this.field1341 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1345[var6] = this.field1336[var7];
            }
            int[] var8 = this.field1336;
            this.field1336 = Statics.field1345;
            Statics.field1345 = var8;
        }
        if (this.field1341 != 2 && this.field1341 != 4) {
            return;
        }
        if (Statics.field1345 == null || Statics.field1345.length < this.field1336.length) {
            Statics.field1345 = new int[this.field1336.length];
        }
        short var9;
        if (this.field1336.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1336.length;
        int var11 = this.field1334 * arg0;
        int var12 = var9 - 1;
        if (this.field1341 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1345[var15] = this.field1336[var16];
            }
        }
        int[] var17 = this.field1336;
        this.field1336 = Statics.field1345;
        Statics.field1345 = var17;
    }
}
