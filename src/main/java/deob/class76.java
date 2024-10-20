package deob;

@ObfuscatedName("bp")
public class class76 extends class187 {

    @ObfuscatedName("bp.d")
    public int field1320;

    @ObfuscatedName("bp.q")
    public boolean field1321;

    @ObfuscatedName("bp.m")
    public int[] field1322;

    @ObfuscatedName("bp.a")
    public int[] field1329;

    @ObfuscatedName("bp.w")
    public int[] field1324;

    @ObfuscatedName("bp.e")
    public int[] field1325;

    @ObfuscatedName("bp.o")
    public int field1327;

    @ObfuscatedName("bp.v")
    public int field1316;

    @ObfuscatedName("bp.z")
    public int[] field1328;

    @ObfuscatedName("bp.j")
    public boolean field1326 = false;

    public class76(class107 arg0) {
        this.field1320 = arg0.method2140();
        this.field1321 = arg0.method2148() == 1;
        int var2 = arg0.method2148();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1322 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1322[var3] = arg0.method2140();
        }
        if (var2 > 1) {
            this.field1329 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1329[var4] = arg0.method2148();
            }
        }
        if (var2 > 1) {
            this.field1324 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1324[var5] = arg0.method2148();
            }
        }
        this.field1325 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1325[var6] = arg0.method2183();
        }
        this.field1327 = arg0.method2148();
        this.field1316 = arg0.method2148();
        this.field1328 = null;
    }

    @ObfuscatedName("bp.n(DILej;)Z")
    public boolean method1597(double arg0, int arg1, class147 arg2) {
        for (int var5 = 0; var5 < this.field1322.length; var5++) {
            if (arg2.method2681(this.field1322[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1328 = new int[var6];
        for (int var7 = 0; var7 < this.field1322.length; var7++) {
            int var8 = this.field1322[var7];
            class74 var9;
            if (class70.method1858(arg2, var8)) {
                var9 = class70.method803();
            } else {
                var9 = null;
            }
            var9.method1595();
            byte[] var11 = var9.field1312;
            int[] var12 = var9.field1313;
            int var13 = this.field1325[var7];
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
                var12[var19] = class84.method1791(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1329[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var20 == 0) {
                if (var9.field1307 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1328[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field1307 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1328[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1307 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1328[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("bp.x()V")
    public void method1596() {
        this.field1328 = null;
    }

    @ObfuscatedName("bp.k(I)V")
    public void method1598(int arg0) {
        if (this.field1328 == null) {
            return;
        }
        if (this.field1327 == 1 || this.field1327 == 3) {
            if (Statics.field1330 == null || Statics.field1330.length < this.field1328.length) {
                Statics.field1330 = new int[this.field1328.length];
            }
            short var2;
            if (this.field1328.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1328.length;
            int var4 = arg0 * var2 * this.field1316;
            int var5 = var3 - 1;
            if (this.field1327 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1330[var6] = this.field1328[var7];
            }
            int[] var8 = this.field1328;
            this.field1328 = Statics.field1330;
            Statics.field1330 = var8;
        }
        if (this.field1327 != 2 && this.field1327 != 4) {
            return;
        }
        if (Statics.field1330 == null || Statics.field1330.length < this.field1328.length) {
            Statics.field1330 = new int[this.field1328.length];
        }
        short var9;
        if (this.field1328.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1328.length;
        int var11 = this.field1316 * arg0;
        int var12 = var9 - 1;
        if (this.field1327 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1330[var15] = this.field1328[var16];
            }
        }
        int[] var17 = this.field1328;
        this.field1328 = Statics.field1330;
        Statics.field1330 = var17;
    }
}
