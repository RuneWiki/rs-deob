package deob;

@ObfuscatedName("by")
public class class77 extends class189 {

    @ObfuscatedName("by.w")
    public int field1318;

    @ObfuscatedName("by.c")
    public boolean field1320;

    @ObfuscatedName("by.x")
    public int[] field1322;

    @ObfuscatedName("by.f")
    public int[] field1314;

    @ObfuscatedName("by.t")
    public int[] field1321;

    @ObfuscatedName("by.n")
    public int[] field1323;

    @ObfuscatedName("by.p")
    public int field1324;

    @ObfuscatedName("by.a")
    public int field1325;

    @ObfuscatedName("by.o")
    public int[] field1326;

    @ObfuscatedName("by.b")
    public boolean field1315 = false;

    public class77(class108 arg0) {
        this.field1318 = arg0.method2163();
        this.field1320 = arg0.method2291() == 1;
        int var2 = arg0.method2291();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1322 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1322[var3] = arg0.method2163();
        }
        if (var2 > 1) {
            this.field1314 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1314[var4] = arg0.method2291();
            }
        }
        if (var2 > 1) {
            this.field1321 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1321[var5] = arg0.method2291();
            }
        }
        this.field1323 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1323[var6] = arg0.method2297();
        }
        this.field1324 = arg0.method2291();
        this.field1325 = arg0.method2291();
        this.field1326 = null;
    }

    @ObfuscatedName("by.l(DILeo;)Z")
    public boolean method1605(double arg0, int arg1, class149 arg2) {
        for (int var5 = 0; var5 < this.field1322.length; var5++) {
            if (arg2.method2809(this.field1322[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1326 = new int[var6];
        for (int var7 = 0; var7 < this.field1322.length; var7++) {
            class75 var8 = class71.method106(arg2, this.field1322[var7]);
            var8.method1586();
            byte[] var9 = var8.field1309;
            int[] var10 = var8.field1306;
            int var11 = this.field1323[var7];
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
                var10[var17] = class85.method1841(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1314[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1308 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1326[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1308 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1326[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1308 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1326[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("by.y()V")
    public void method1601() {
        this.field1326 = null;
    }

    @ObfuscatedName("by.g(I)V")
    public void method1599(int arg0) {
        if (this.field1326 == null) {
            return;
        }
        if (this.field1324 == 1 || this.field1324 == 3) {
            if (Statics.field1328 == null || Statics.field1328.length < this.field1326.length) {
                Statics.field1328 = new int[this.field1326.length];
            }
            short var2;
            if (this.field1326.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1326.length;
            int var4 = arg0 * var2 * this.field1325;
            int var5 = var3 - 1;
            if (this.field1324 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1328[var6] = this.field1326[var7];
            }
            int[] var8 = this.field1326;
            this.field1326 = Statics.field1328;
            Statics.field1328 = var8;
        }
        if (this.field1324 != 2 && this.field1324 != 4) {
            return;
        }
        if (Statics.field1328 == null || Statics.field1328.length < this.field1326.length) {
            Statics.field1328 = new int[this.field1326.length];
        }
        short var9;
        if (this.field1326.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1326.length;
        int var11 = this.field1325 * arg0;
        int var12 = var9 - 1;
        if (this.field1324 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1328[var15] = this.field1326[var16];
            }
        }
        int[] var17 = this.field1326;
        this.field1326 = Statics.field1328;
        Statics.field1328 = var17;
    }
}
