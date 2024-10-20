package deob;

@ObfuscatedName("cx")
public class class83 extends class208 {

    @ObfuscatedName("cx.k")
    public int field1386;

    @ObfuscatedName("cx.j")
    public boolean field1387;

    @ObfuscatedName("cx.i")
    public int[] field1392;

    @ObfuscatedName("cx.x")
    public int[] field1389;

    @ObfuscatedName("cx.g")
    public int[] field1390;

    @ObfuscatedName("cx.e")
    public int[] field1391;

    @ObfuscatedName("cx.p")
    public int field1384;

    @ObfuscatedName("cx.a")
    public int field1382;

    @ObfuscatedName("cx.v")
    public int[] field1394;

    @ObfuscatedName("cx.c")
    public boolean field1393 = false;

    public class83(class119 arg0) {
        this.field1386 = arg0.method2541();
        this.field1387 = arg0.method2562() == 1;
        int var2 = arg0.method2562();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1392 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1392[var3] = arg0.method2541();
        }
        if (var2 > 1) {
            this.field1389 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1389[var4] = arg0.method2562();
            }
        }
        if (var2 > 1) {
            this.field1390 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1390[var5] = arg0.method2562();
            }
        }
        this.field1391 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1391[var6] = arg0.method2386();
        }
        this.field1384 = arg0.method2562();
        this.field1382 = arg0.method2562();
        this.field1394 = null;
    }

    @ObfuscatedName("cx.m(DILfx;)Z")
    public boolean method1803(double arg0, int arg1, class167 arg2) {
        for (int var5 = 0; var5 < this.field1392.length; var5++) {
            if (arg2.method3151(this.field1392[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1394 = new int[var6];
        for (int var7 = 0; var7 < this.field1392.length; var7++) {
            int var8 = this.field1392[var7];
            byte[] var9 = arg2.method3094(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class77.method574(var9);
                var10 = true;
            }
            class81 var11;
            if (var10) {
                var11 = class77.method589();
            } else {
                var11 = null;
            }
            var11.method1791();
            byte[] var13 = var11.field1380;
            int[] var14 = var11.field1373;
            int var15 = this.field1391[var7];
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
                var14[var21] = class91.method2008(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1389[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var11.field1376 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1394[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field1376 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1394[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field1376 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1394[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("cx.l()V")
    public void method1806() {
        this.field1394 = null;
    }

    @ObfuscatedName("cx.y(I)V")
    public void method1805(int arg0) {
        if (this.field1394 == null) {
            return;
        }
        if (this.field1384 == 1 || this.field1384 == 3) {
            if (Statics.field1396 == null || Statics.field1396.length < this.field1394.length) {
                Statics.field1396 = new int[this.field1394.length];
            }
            short var2;
            if (this.field1394.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1394.length;
            int var4 = arg0 * var2 * this.field1382;
            int var5 = var3 - 1;
            if (this.field1384 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1396[var6] = this.field1394[var7];
            }
            int[] var8 = this.field1394;
            this.field1394 = Statics.field1396;
            Statics.field1396 = var8;
        }
        if (this.field1384 != 2 && this.field1384 != 4) {
            return;
        }
        if (Statics.field1396 == null || Statics.field1396.length < this.field1394.length) {
            Statics.field1396 = new int[this.field1394.length];
        }
        short var9;
        if (this.field1394.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1394.length;
        int var11 = this.field1382 * arg0;
        int var12 = var9 - 1;
        if (this.field1384 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1396[var15] = this.field1394[var16];
            }
        }
        int[] var17 = this.field1394;
        this.field1394 = Statics.field1396;
        Statics.field1396 = var17;
    }
}
