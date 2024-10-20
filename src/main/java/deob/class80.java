package deob;

@ObfuscatedName("cd")
public class class80 extends class128 {

    @ObfuscatedName("cd.w")
    public int field1303;

    @ObfuscatedName("cd.r")
    public boolean field1300;

    @ObfuscatedName("cd.c")
    public int[] field1301;

    @ObfuscatedName("cd.p")
    public int[] field1302;

    @ObfuscatedName("cd.g")
    public int[] field1296;

    @ObfuscatedName("cd.z")
    public int[] field1304;

    @ObfuscatedName("cd.q")
    public int field1305;

    @ObfuscatedName("cd.l")
    public int field1307;

    @ObfuscatedName("cd.y")
    public int[] field1299;

    @ObfuscatedName("cd.e")
    public boolean field1308 = false;

    public class80(class161 arg0) {
        this.field1303 = arg0.method2887();
        this.field1300 = arg0.method2823() == 1;
        int var2 = arg0.method2823();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1301 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1301[var3] = arg0.method2887();
        }
        if (var2 > 1) {
            this.field1302 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1302[var4] = arg0.method2823();
            }
        }
        if (var2 > 1) {
            this.field1296 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1296[var5] = arg0.method2823();
            }
        }
        this.field1304 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1304[var6] = arg0.method2785();
        }
        this.field1305 = arg0.method2823();
        this.field1307 = arg0.method2823();
        this.field1299 = null;
    }

    @ObfuscatedName("cd.n(DILgj;)Z")
    public boolean method1482(double arg0, int arg1, class183 arg2) {
        for (int var5 = 0; var5 < this.field1301.length; var5++) {
            if (arg2.method3100(this.field1301[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1299 = new int[var6];
        for (int var7 = 0; var7 < this.field1301.length; var7++) {
            int var8 = this.field1301[var7];
            class223 var9;
            if (class226.method1399(arg2, var8)) {
                var9 = class226.method3585();
            } else {
                var9 = null;
            }
            var9.method3865();
            byte[] var11 = var9.field3189;
            int[] var12 = var9.field3186;
            int var13 = this.field1304[var7];
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
                var12[var19] = class85.method1583(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1302[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var20 == 0) {
                if (var9.field3187 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1299[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field3187 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1299[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3187 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1299[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("cd.d()V")
    public void method1483() {
        this.field1299 = null;
    }

    @ObfuscatedName("cd.m(I)V")
    public void method1484(int arg0) {
        if (this.field1299 == null) {
            return;
        }
        if (this.field1305 == 1 || this.field1305 == 3) {
            if (Statics.field1309 == null || Statics.field1309.length < this.field1299.length) {
                Statics.field1309 = new int[this.field1299.length];
            }
            short var2;
            if (this.field1299.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1299.length;
            int var4 = arg0 * var2 * this.field1307;
            int var5 = var3 - 1;
            if (this.field1305 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1309[var6] = this.field1299[var7];
            }
            int[] var8 = this.field1299;
            this.field1299 = Statics.field1309;
            Statics.field1309 = var8;
        }
        if (this.field1305 != 2 && this.field1305 != 4) {
            return;
        }
        if (Statics.field1309 == null || Statics.field1309.length < this.field1299.length) {
            Statics.field1309 = new int[this.field1299.length];
        }
        short var9;
        if (this.field1299.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1299.length;
        int var11 = this.field1307 * arg0;
        int var12 = var9 - 1;
        if (this.field1305 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1309[var15] = this.field1299[var16];
            }
        }
        int[] var17 = this.field1299;
        this.field1299 = Statics.field1309;
        Statics.field1309 = var17;
    }
}
