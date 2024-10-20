package deob;

@ObfuscatedName("bv")
public class class73 extends class176 {

    @ObfuscatedName("bv.e")
    public int field1303;

    @ObfuscatedName("bv.a")
    public boolean field1299;

    @ObfuscatedName("bv.l")
    public int[] field1300;

    @ObfuscatedName("bv.v")
    public int[] field1301;

    @ObfuscatedName("bv.j")
    public int[] field1302;

    @ObfuscatedName("bv.k")
    public int[] field1306;

    @ObfuscatedName("bv.g")
    public int field1298;

    @ObfuscatedName("bv.d")
    public int field1305;

    @ObfuscatedName("bv.b")
    public int[] field1296;

    @ObfuscatedName("bv.i")
    public boolean field1304 = false;

    public class73(class104 arg0) {
        this.field1303 = arg0.method2206();
        this.field1299 = arg0.method2257() == 1;
        int var2 = arg0.method2257();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1300 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1300[var3] = arg0.method2206();
        }
        if (var2 > 1) {
            this.field1301 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1301[var4] = arg0.method2257();
            }
        }
        if (var2 > 1) {
            this.field1302 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1302[var5] = arg0.method2257();
            }
        }
        this.field1306 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1306[var6] = arg0.method2130();
        }
        this.field1298 = arg0.method2257();
        this.field1305 = arg0.method2257();
        this.field1296 = null;
    }

    @ObfuscatedName("bv.z(DILel;)Z")
    public boolean method1595(double arg0, int arg1, class142 arg2) {
        for (int var5 = 0; var5 < this.field1300.length; var5++) {
            if (arg2.method2772(this.field1300[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1296 = new int[var6];
        for (int var7 = 0; var7 < this.field1300.length; var7++) {
            class71 var8 = class67.method151(arg2, this.field1300[var7]);
            var8.method1574();
            byte[] var9 = var8.field1289;
            int[] var10 = var8.field1286;
            int var11 = this.field1306[var7];
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
                var10[var17] = class81.method1793(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1301[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1287 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1296[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1287 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1296[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1287 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1296[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("bv.n()V")
    public void method1589() {
        this.field1296 = null;
    }

    @ObfuscatedName("bv.u(I)V")
    public void method1591(int arg0) {
        if (this.field1296 == null) {
            return;
        }
        if (this.field1298 == 1 || this.field1298 == 3) {
            if (Statics.field1307 == null || Statics.field1307.length < this.field1296.length) {
                Statics.field1307 = new int[this.field1296.length];
            }
            short var2;
            if (this.field1296.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1296.length;
            int var4 = arg0 * var2 * this.field1305;
            int var5 = var3 - 1;
            if (this.field1298 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1307[var6] = this.field1296[var7];
            }
            int[] var8 = this.field1296;
            this.field1296 = Statics.field1307;
            Statics.field1307 = var8;
        }
        if (this.field1298 != 2 && this.field1298 != 4) {
            return;
        }
        if (Statics.field1307 == null || Statics.field1307.length < this.field1296.length) {
            Statics.field1307 = new int[this.field1296.length];
        }
        short var9;
        if (this.field1296.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1296.length;
        int var11 = this.field1305 * arg0;
        int var12 = var9 - 1;
        if (this.field1298 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1307[var15] = this.field1296[var16];
            }
        }
        int[] var17 = this.field1296;
        this.field1296 = Statics.field1307;
        Statics.field1307 = var17;
    }
}
