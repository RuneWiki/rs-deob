package deob;

@ObfuscatedName("bg")
public class class78 extends class198 {

    @ObfuscatedName("bg.u")
    public int field1303;

    @ObfuscatedName("bg.w")
    public boolean field1304;

    @ObfuscatedName("bg.i")
    public int[] field1305;

    @ObfuscatedName("bg.r")
    public int[] field1311;

    @ObfuscatedName("bg.f")
    public int[] field1301;

    @ObfuscatedName("bg.g")
    public int[] field1308;

    @ObfuscatedName("bg.o")
    public int field1309;

    @ObfuscatedName("bg.h")
    public int field1310;

    @ObfuscatedName("bg.s")
    public int[] field1300;

    @ObfuscatedName("bg.j")
    public boolean field1312 = false;

    public class78(class111 arg0) {
        this.field1303 = arg0.method2178();
        this.field1304 = arg0.method2176() == 1;
        int var2 = arg0.method2176();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1305 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1305[var3] = arg0.method2178();
        }
        if (var2 > 1) {
            this.field1311 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1311[var4] = arg0.method2176();
            }
        }
        if (var2 > 1) {
            this.field1301 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1301[var5] = arg0.method2176();
            }
        }
        this.field1308 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1308[var6] = arg0.method2378();
        }
        this.field1309 = arg0.method2176();
        this.field1310 = arg0.method2176();
        this.field1300 = null;
    }

    @ObfuscatedName("bg.e(DILfv;)Z")
    public boolean method1644(double arg0, int arg1, class158 arg2) {
        for (int var5 = 0; var5 < this.field1305.length; var5++) {
            if (arg2.method2850(this.field1305[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1300 = new int[var6];
        for (int var7 = 0; var7 < this.field1305.length; var7++) {
            int var8 = this.field1305[var7];
            byte[] var9 = arg2.method2873(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class72.method131(var9);
                var10 = true;
            }
            class76 var11;
            if (var10) {
                class76 var12 = new class76();
                var12.field1296 = Statics.field1257;
                var12.field1292 = Statics.field1259;
                var12.field1294 = Statics.field3019[0];
                var12.field1295 = Statics.field2500[0];
                var12.field1297 = Statics.field1256[0];
                var12.field1293 = Statics.field1262[0];
                var12.field1291 = Statics.field1502;
                var12.field1290 = Statics.field971[0];
                class72.method620();
                var11 = var12;
            } else {
                var11 = null;
            }
            var11.method1634();
            byte[] var15 = var11.field1290;
            int[] var16 = var11.field1291;
            int var17 = this.field1308[var7];
            if ((var17 & 0xFF000000) == 16777216) {
            }
            if ((var17 & 0xFF000000) == 33554432) {
            }
            if ((var17 & 0xFF000000) == 50331648) {
                int var18 = var17 & 0xFF00FF;
                int var19 = var17 >> 8 & 0xFF;
                for (int var20 = 0; var20 < var16.length; var20++) {
                    int var21 = var16[var20];
                    if (var21 >> 8 == (var21 & 0xFFFF)) {
                        int var22 = var21 & 0xFF;
                        var16[var20] = var18 * var22 >> 8 & 0xFF00FF | var19 * var22 & 0xFF00;
                    }
                }
            }
            for (int var23 = 0; var23 < var16.length; var23++) {
                var16[var23] = class86.method1842(var16[var23], arg0);
            }
            int var24;
            if (var7 == 0) {
                var24 = 0;
            } else {
                var24 = this.field1311[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var24 == 0) {
                if (var11.field1297 == arg1) {
                    for (int var25 = 0; var25 < var6; var25++) {
                        this.field1300[var25] = var16[var15[var25] & 0xFF];
                    }
                } else if (var11.field1297 == 64 && arg1 == 128) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < arg1; var27++) {
                        for (int var28 = 0; var28 < arg1; var28++) {
                            this.field1300[var26++] = var16[var15[(var27 >> 1 << 6) + (var28 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1297 == 128 && arg1 == 64) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < arg1; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            this.field1300[var29++] = var16[var15[(var30 << 1 << 7) + (var31 << 1)] & 0xFF];
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (var24 == 1) {
            }
            if (var24 == 2) {
            }
            if (var24 == 3) {
            }
        }
        return true;
    }

    @ObfuscatedName("bg.a()V")
    public void method1646() {
        this.field1300 = null;
    }

    @ObfuscatedName("bg.l(I)V")
    public void method1647(int arg0) {
        if (this.field1300 == null) {
            return;
        }
        if (this.field1309 == 1 || this.field1309 == 3) {
            if (Statics.field1313 == null || Statics.field1313.length < this.field1300.length) {
                Statics.field1313 = new int[this.field1300.length];
            }
            short var2;
            if (this.field1300.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1300.length;
            int var4 = arg0 * var2 * this.field1310;
            int var5 = var3 - 1;
            if (this.field1309 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1313[var6] = this.field1300[var7];
            }
            int[] var8 = this.field1300;
            this.field1300 = Statics.field1313;
            Statics.field1313 = var8;
        }
        if (this.field1309 != 2 && this.field1309 != 4) {
            return;
        }
        if (Statics.field1313 == null || Statics.field1313.length < this.field1300.length) {
            Statics.field1313 = new int[this.field1300.length];
        }
        short var9;
        if (this.field1300.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1300.length;
        int var11 = this.field1310 * arg0;
        int var12 = var9 - 1;
        if (this.field1309 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1313[var15] = this.field1300[var16];
            }
        }
        int[] var17 = this.field1300;
        this.field1300 = Statics.field1313;
        Statics.field1313 = var17;
    }
}
