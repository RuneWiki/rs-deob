package deob;

@ObfuscatedName("ci")
public class class83 extends class208 {

    @ObfuscatedName("ci.p")
    public int field1425;

    @ObfuscatedName("ci.s")
    public boolean field1419;

    @ObfuscatedName("ci.y")
    public int[] field1424;

    @ObfuscatedName("ci.t")
    public int[] field1422;

    @ObfuscatedName("ci.w")
    public int[] field1426;

    @ObfuscatedName("ci.h")
    public int[] field1427;

    @ObfuscatedName("ci.d")
    public int field1428;

    @ObfuscatedName("ci.l")
    public int field1429;

    @ObfuscatedName("ci.n")
    public int[] field1430;

    @ObfuscatedName("ci.q")
    public boolean field1423 = false;

    public class83(class119 arg0) {
        this.field1425 = arg0.method2339();
        this.field1419 = arg0.method2427() == 1;
        int var2 = arg0.method2427();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1424 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1424[var3] = arg0.method2339();
        }
        if (var2 > 1) {
            this.field1422 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1422[var4] = arg0.method2427();
            }
        }
        if (var2 > 1) {
            this.field1426 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1426[var5] = arg0.method2427();
            }
        }
        this.field1427 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1427[var6] = arg0.method2342();
        }
        this.field1428 = arg0.method2427();
        this.field1429 = arg0.method2427();
        this.field1430 = null;
    }

    @ObfuscatedName("ci.o(DILfq;)Z")
    public boolean method1729(double arg0, int arg1, class167 arg2) {
        for (int var5 = 0; var5 < this.field1424.length; var5++) {
            if (arg2.method3064(this.field1424[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1430 = new int[var6];
        for (int var7 = 0; var7 < this.field1424.length; var7++) {
            int var8 = this.field1424[var7];
            class81 var9;
            if (class77.method2282(arg2, var8)) {
                var9 = class77.method622();
            } else {
                var9 = null;
            }
            var9.method1721();
            byte[] var11 = var9.field1414;
            int[] var12 = var9.field1413;
            int var13 = this.field1427[var7];
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
                var12[var19] = class91.method1947(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1422[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var20 == 0) {
                if (var9.field1411 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1430[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field1411 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1430[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field1411 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1430[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("ci.e()V")
    public void method1734() {
        this.field1430 = null;
    }

    @ObfuscatedName("ci.u(I)V")
    public void method1731(int arg0) {
        if (this.field1430 == null) {
            return;
        }
        if (this.field1428 == 1 || this.field1428 == 3) {
            if (Statics.field1432 == null || Statics.field1432.length < this.field1430.length) {
                Statics.field1432 = new int[this.field1430.length];
            }
            short var2;
            if (this.field1430.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1430.length;
            int var4 = arg0 * var2 * this.field1429;
            int var5 = var3 - 1;
            if (this.field1428 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1432[var6] = this.field1430[var7];
            }
            int[] var8 = this.field1430;
            this.field1430 = Statics.field1432;
            Statics.field1432 = var8;
        }
        if (this.field1428 != 2 && this.field1428 != 4) {
            return;
        }
        if (Statics.field1432 == null || Statics.field1432.length < this.field1430.length) {
            Statics.field1432 = new int[this.field1430.length];
        }
        short var9;
        if (this.field1430.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1430.length;
        int var11 = this.field1429 * arg0;
        int var12 = var9 - 1;
        if (this.field1428 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1432[var15] = this.field1430[var16];
            }
        }
        int[] var17 = this.field1430;
        this.field1430 = Statics.field1432;
        Statics.field1432 = var17;
    }
}
