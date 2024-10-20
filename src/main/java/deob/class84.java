package deob;

@ObfuscatedName("cl")
public class class84 extends class209 {

    @ObfuscatedName("cl.x")
    public int field1412;

    @ObfuscatedName("cl.y")
    public boolean field1413;

    @ObfuscatedName("cl.r")
    public int[] field1414;

    @ObfuscatedName("cl.c")
    public int[] field1421;

    @ObfuscatedName("cl.l")
    public int[] field1416;

    @ObfuscatedName("cl.u")
    public int[] field1417;

    @ObfuscatedName("cl.p")
    public int field1415;

    @ObfuscatedName("cl.n")
    public int field1419;

    @ObfuscatedName("cl.w")
    public int[] field1420;

    @ObfuscatedName("cl.z")
    public boolean field1409 = false;

    public class84(class120 arg0) {
        this.field1412 = arg0.method2346();
        this.field1413 = arg0.method2344() == 1;
        int var2 = arg0.method2344();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1414 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1414[var3] = arg0.method2346();
        }
        if (var2 > 1) {
            this.field1421 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1421[var4] = arg0.method2344();
            }
        }
        if (var2 > 1) {
            this.field1416 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1416[var5] = arg0.method2344();
            }
        }
        this.field1417 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1417[var6] = arg0.method2349();
        }
        this.field1415 = arg0.method2344();
        this.field1419 = arg0.method2344();
        this.field1420 = null;
    }

    @ObfuscatedName("cl.b(DILfl;)Z")
    public boolean method1757(double arg0, int arg1, class168 arg2) {
        for (int var5 = 0; var5 < this.field1414.length; var5++) {
            if (arg2.method3044(this.field1414[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1420 = new int[var6];
        for (int var7 = 0; var7 < this.field1414.length; var7++) {
            int var8 = this.field1414[var7];
            class81 var9;
            if (class77.method2857(arg2, var8)) {
                class81 var10 = new class81();
                var10.field1394 = Statics.field1891;
                var10.field1389 = Statics.field1352;
                var10.field1393 = Statics.field1354[0];
                var10.field1396 = Statics.field2049[0];
                var10.field1391 = Statics.field1355[0];
                var10.field1392 = Statics.field675[0];
                var10.field1390 = Statics.field136;
                var10.field1395 = Statics.field1356[0];
                Statics.method94();
                var9 = var10;
            } else {
                var9 = null;
            }
            var9.method1741();
            byte[] var13 = var9.field1395;
            int[] var14 = var9.field1390;
            int var15 = this.field1417[var7];
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
                var14[var21] = class92.method1956(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1421[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var22 == 0) {
                if (var9.field1391 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1420[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var9.field1391 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1420[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1391 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1420[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("cl.g()V")
    public void method1758() {
        this.field1420 = null;
    }

    @ObfuscatedName("cl.j(I)V")
    public void method1759(int arg0) {
        if (this.field1420 == null) {
            return;
        }
        if (this.field1415 == 1 || this.field1415 == 3) {
            if (Statics.field1422 == null || Statics.field1422.length < this.field1420.length) {
                Statics.field1422 = new int[this.field1420.length];
            }
            short var2;
            if (this.field1420.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1420.length;
            int var4 = arg0 * var2 * this.field1419;
            int var5 = var3 - 1;
            if (this.field1415 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1422[var6] = this.field1420[var7];
            }
            int[] var8 = this.field1420;
            this.field1420 = Statics.field1422;
            Statics.field1422 = var8;
        }
        if (this.field1415 != 2 && this.field1415 != 4) {
            return;
        }
        if (Statics.field1422 == null || Statics.field1422.length < this.field1420.length) {
            Statics.field1422 = new int[this.field1420.length];
        }
        short var9;
        if (this.field1420.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1420.length;
        int var11 = this.field1419 * arg0;
        int var12 = var9 - 1;
        if (this.field1415 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1422[var15] = this.field1420[var16];
            }
        }
        int[] var17 = this.field1420;
        this.field1420 = Statics.field1422;
        Statics.field1422 = var17;
    }
}
