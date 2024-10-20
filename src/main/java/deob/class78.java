package deob;

@ObfuscatedName("bu")
public class class78 extends class199 {

    @ObfuscatedName("bu.s")
    public int field1389;

    @ObfuscatedName("bu.j")
    public boolean field1384;

    @ObfuscatedName("bu.f")
    public int[] field1390;

    @ObfuscatedName("bu.b")
    public int[] field1386;

    @ObfuscatedName("bu.t")
    public int[] field1388;

    @ObfuscatedName("bu.i")
    public int[] field1393;

    @ObfuscatedName("bu.c")
    public int field1394;

    @ObfuscatedName("bu.k")
    public int field1392;

    @ObfuscatedName("bu.x")
    public int[] field1396;

    @ObfuscatedName("bu.e")
    public boolean field1397 = false;

    public class78(class111 arg0) {
        this.field1389 = arg0.method2395();
        this.field1384 = arg0.method2211() == 1;
        int var2 = arg0.method2211();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1390 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1390[var3] = arg0.method2395();
        }
        if (var2 > 1) {
            this.field1386 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1386[var4] = arg0.method2211();
            }
        }
        if (var2 > 1) {
            this.field1388 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1388[var5] = arg0.method2211();
            }
        }
        this.field1393 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1393[var6] = arg0.method2366();
        }
        this.field1394 = arg0.method2211();
        this.field1392 = arg0.method2211();
        this.field1396 = null;
    }

    @ObfuscatedName("bu.n(DILfi;)Z")
    public boolean method1674(double arg0, int arg1, class158 arg2) {
        for (int var5 = 0; var5 < this.field1390.length; var5++) {
            if (arg2.method2916(this.field1390[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1396 = new int[var6];
        for (int var7 = 0; var7 < this.field1390.length; var7++) {
            int var8 = this.field1390[var7];
            class76 var9;
            if (class72.method509(arg2, var8)) {
                var9 = class72.method851();
            } else {
                var9 = null;
            }
            var9.method1671();
            byte[] var11 = var9.field1375;
            int[] var12 = var9.field1380;
            int var13 = this.field1393[var7];
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
                var12[var19] = class86.method1924(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1386[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var20 == 0) {
                if (var9.field1379 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1396[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field1379 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1396[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1379 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1396[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("bu.g()V")
    public void method1675() {
        this.field1396 = null;
    }

    @ObfuscatedName("bu.a(I)V")
    public void method1676(int arg0) {
        if (this.field1396 == null) {
            return;
        }
        if (this.field1394 == 1 || this.field1394 == 3) {
            if (Statics.field1395 == null || Statics.field1395.length < this.field1396.length) {
                Statics.field1395 = new int[this.field1396.length];
            }
            short var2;
            if (this.field1396.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1396.length;
            int var4 = arg0 * var2 * this.field1392;
            int var5 = var3 - 1;
            if (this.field1394 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1395[var6] = this.field1396[var7];
            }
            int[] var8 = this.field1396;
            this.field1396 = Statics.field1395;
            Statics.field1395 = var8;
        }
        if (this.field1394 != 2 && this.field1394 != 4) {
            return;
        }
        if (Statics.field1395 == null || Statics.field1395.length < this.field1396.length) {
            Statics.field1395 = new int[this.field1396.length];
        }
        short var9;
        if (this.field1396.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1396.length;
        int var11 = this.field1392 * arg0;
        int var12 = var9 - 1;
        if (this.field1394 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1395[var15] = this.field1396[var16];
            }
        }
        int[] var17 = this.field1396;
        this.field1396 = Statics.field1395;
        Statics.field1395 = var17;
    }
}
