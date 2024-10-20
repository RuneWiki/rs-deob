package deob;

@ObfuscatedName("eo")
public class class134 extends class190 {

    @ObfuscatedName("eo.i")
    public int field1647;

    @ObfuscatedName("eo.o")
    public boolean field1648;

    @ObfuscatedName("eo.x")
    public int[] field1649;

    @ObfuscatedName("eo.w")
    public int[] field1650;

    @ObfuscatedName("eo.g")
    public int[] field1651;

    @ObfuscatedName("eo.m")
    public int[] field1652;

    @ObfuscatedName("eo.n")
    public int field1644;

    @ObfuscatedName("eo.d")
    public int field1654;

    @ObfuscatedName("eo.h")
    public int[] field1655;

    @ObfuscatedName("eo.a")
    public boolean field1656 = false;

    public class134(class310 arg0) {
        this.field1647 = arg0.method5195();
        this.field1648 = arg0.method5193() == 1;
        int var2 = arg0.method5193();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1649 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1649[var3] = arg0.method5195();
        }
        if (var2 > 1) {
            this.field1650 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1650[var4] = arg0.method5193();
            }
        }
        if (var2 > 1) {
            this.field1651 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1651[var5] = arg0.method5193();
            }
        }
        this.field1652 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1652[var6] = arg0.method5270();
        }
        this.field1644 = arg0.method5193();
        this.field1654 = arg0.method5193();
        this.field1655 = null;
    }

    @ObfuscatedName("eo.z(DILic;)Z")
    public boolean method2732(double arg0, int arg1, class244 arg2) {
        for (int var5 = 0; var5 < this.field1649.length; var5++) {
            if (arg2.method3928(this.field1649[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1655 = new int[var6];
        for (int var7 = 0; var7 < this.field1649.length; var7++) {
            int var8 = this.field1649[var7];
            class334 var9;
            if (class336.method3448(arg2, var8)) {
                var9 = class336.method4064();
            } else {
                var9 = null;
            }
            var9.method5733();
            byte[] var11 = var9.field3899;
            int[] var12 = var9.field3894;
            int var13 = this.field1652[var7];
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
                var12[var19] = class140.method2877(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1650[var7 - 1];
            }
            if (var20 == 0) {
                if (var9.field3893 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1655[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field3893 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1655[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3893 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1655[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("eo.k()V")
    public void method2731() {
        this.field1655 = null;
    }

    @ObfuscatedName("eo.s(I)V")
    public void method2737(int arg0) {
        if (this.field1655 == null) {
            return;
        }
        if (this.field1644 == 1 || this.field1644 == 3) {
            if (Statics.field1653 == null || Statics.field1653.length < this.field1655.length) {
                Statics.field1653 = new int[this.field1655.length];
            }
            short var2;
            if (this.field1655.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1655.length;
            int var4 = arg0 * var2 * this.field1654;
            int var5 = var3 - 1;
            if (this.field1644 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1653[var6] = this.field1655[var7];
            }
            int[] var8 = this.field1655;
            this.field1655 = Statics.field1653;
            Statics.field1653 = var8;
        }
        if (this.field1644 != 2 && this.field1644 != 4) {
            return;
        }
        if (Statics.field1653 == null || Statics.field1653.length < this.field1655.length) {
            Statics.field1653 = new int[this.field1655.length];
        }
        short var9;
        if (this.field1655.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1655.length;
        int var11 = this.field1654 * arg0;
        int var12 = var9 - 1;
        if (this.field1644 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1653[var15] = this.field1655[var16];
            }
        }
        int[] var17 = this.field1655;
        this.field1655 = Statics.field1653;
        Statics.field1653 = var17;
    }
}
