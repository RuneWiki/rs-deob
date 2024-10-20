package deob;

@ObfuscatedName("cl")
public class class84 extends class209 {

    @ObfuscatedName("cl.e")
    public int field1447;

    @ObfuscatedName("cl.y")
    public boolean field1448;

    @ObfuscatedName("cl.m")
    public int[] field1455;

    @ObfuscatedName("cl.c")
    public int[] field1446;

    @ObfuscatedName("cl.v")
    public int[] field1450;

    @ObfuscatedName("cl.l")
    public int[] field1451;

    @ObfuscatedName("cl.z")
    public int field1452;

    @ObfuscatedName("cl.s")
    public int field1453;

    @ObfuscatedName("cl.j")
    public int[] field1454;

    @ObfuscatedName("cl.q")
    public boolean field1445 = false;

    public class84(class120 arg0) {
        this.field1447 = arg0.method2365();
        this.field1448 = arg0.method2363() == 1;
        int var2 = arg0.method2363();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1455 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1455[var3] = arg0.method2365();
        }
        if (var2 > 1) {
            this.field1446 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1446[var4] = arg0.method2363();
            }
        }
        if (var2 > 1) {
            this.field1450 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1450[var5] = arg0.method2363();
            }
        }
        this.field1451 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1451[var6] = arg0.method2368();
        }
        this.field1452 = arg0.method2363();
        this.field1453 = arg0.method2363();
        this.field1454 = null;
    }

    @ObfuscatedName("cl.w(DILfx;)Z")
    public boolean method1768(double arg0, int arg1, class168 arg2) {
        for (int var5 = 0; var5 < this.field1455.length; var5++) {
            if (arg2.method3087(this.field1455[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1454 = new int[var6];
        for (int var7 = 0; var7 < this.field1455.length; var7++) {
            class81 var8 = class77.method178(arg2, this.field1455[var7]);
            var8.method1745();
            byte[] var9 = var8.field1428;
            int[] var10 = var8.field1422;
            int var11 = this.field1451[var7];
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
                var10[var17] = class92.method1968(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1446[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field1426 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1454[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field1426 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1454[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field1426 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1454[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("cl.x()V")
    public void method1770() {
        this.field1454 = null;
    }

    @ObfuscatedName("cl.t(I)V")
    public void method1775(int arg0) {
        if (this.field1454 == null) {
            return;
        }
        if (this.field1452 == 1 || this.field1452 == 3) {
            if (Statics.field1456 == null || Statics.field1456.length < this.field1454.length) {
                Statics.field1456 = new int[this.field1454.length];
            }
            short var2;
            if (this.field1454.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1454.length;
            int var4 = arg0 * var2 * this.field1453;
            int var5 = var3 - 1;
            if (this.field1452 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1456[var6] = this.field1454[var7];
            }
            int[] var8 = this.field1454;
            this.field1454 = Statics.field1456;
            Statics.field1456 = var8;
        }
        if (this.field1452 != 2 && this.field1452 != 4) {
            return;
        }
        if (Statics.field1456 == null || Statics.field1456.length < this.field1454.length) {
            Statics.field1456 = new int[this.field1454.length];
        }
        short var9;
        if (this.field1454.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1454.length;
        int var11 = this.field1453 * arg0;
        int var12 = var9 - 1;
        if (this.field1452 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1456[var15] = this.field1454[var16];
            }
        }
        int[] var17 = this.field1454;
        this.field1454 = Statics.field1456;
        Statics.field1456 = var17;
    }
}
