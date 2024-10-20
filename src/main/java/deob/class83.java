package deob;

@ObfuscatedName("ce")
public class class83 extends class208 {

    @ObfuscatedName("ce.p")
    public int field1447;

    @ObfuscatedName("ce.c")
    public boolean field1443;

    @ObfuscatedName("ce.f")
    public int[] field1449;

    @ObfuscatedName("ce.y")
    public int[] field1445;

    @ObfuscatedName("ce.w")
    public int[] field1446;

    @ObfuscatedName("ce.l")
    public int[] field1438;

    @ObfuscatedName("ce.v")
    public int field1448;

    @ObfuscatedName("ce.k")
    public int field1451;

    @ObfuscatedName("ce.o")
    public int[] field1450;

    @ObfuscatedName("ce.u")
    public boolean field1442 = false;

    public class83(class119 arg0) {
        this.field1447 = arg0.method2322();
        this.field1443 = arg0.method2320() == 1;
        int var2 = arg0.method2320();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1449 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1449[var3] = arg0.method2322();
        }
        if (var2 > 1) {
            this.field1445 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1445[var4] = arg0.method2320();
            }
        }
        if (var2 > 1) {
            this.field1446 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1446[var5] = arg0.method2320();
            }
        }
        this.field1438 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1438[var6] = arg0.method2324();
        }
        this.field1448 = arg0.method2320();
        this.field1451 = arg0.method2320();
        this.field1450 = null;
    }

    @ObfuscatedName("ce.h(DILfv;)Z")
    public boolean method1739(double arg0, int arg1, class167 arg2) {
        for (int var5 = 0; var5 < this.field1449.length; var5++) {
            if (arg2.method3018(this.field1449[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1450 = new int[var6];
        for (int var7 = 0; var7 < this.field1449.length; var7++) {
            int var8 = this.field1449[var7];
            byte[] var9 = arg2.method3012(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class77.method627(var9);
                var10 = true;
            }
            class81 var11;
            if (var10) {
                var11 = class77.method550();
            } else {
                var11 = null;
            }
            var11.method1719();
            byte[] var13 = var11.field1430;
            int[] var14 = var11.field1434;
            int var15 = this.field1438[var7];
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
                var14[var21] = class91.method1951(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1445[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var11.field1431 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1450[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field1431 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1450[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1431 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1450[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("ce.m()V")
    public void method1735() {
        this.field1450 = null;
    }

    @ObfuscatedName("ce.i(I)V")
    public void method1734(int arg0) {
        if (this.field1450 == null) {
            return;
        }
        if (this.field1448 == 1 || this.field1448 == 3) {
            if (Statics.field1452 == null || Statics.field1452.length < this.field1450.length) {
                Statics.field1452 = new int[this.field1450.length];
            }
            short var2;
            if (this.field1450.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1450.length;
            int var4 = arg0 * var2 * this.field1451;
            int var5 = var3 - 1;
            if (this.field1448 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1452[var6] = this.field1450[var7];
            }
            int[] var8 = this.field1450;
            this.field1450 = Statics.field1452;
            Statics.field1452 = var8;
        }
        if (this.field1448 != 2 && this.field1448 != 4) {
            return;
        }
        if (Statics.field1452 == null || Statics.field1452.length < this.field1450.length) {
            Statics.field1452 = new int[this.field1450.length];
        }
        short var9;
        if (this.field1450.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1450.length;
        int var11 = this.field1451 * arg0;
        int var12 = var9 - 1;
        if (this.field1448 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1452[var15] = this.field1450[var16];
            }
        }
        int[] var17 = this.field1450;
        this.field1450 = Statics.field1452;
        Statics.field1452 = var17;
    }
}
