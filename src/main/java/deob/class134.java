package deob;

@ObfuscatedName("eo")
public class class134 extends class190 {

    @ObfuscatedName("eo.p")
    public int field1648;

    @ObfuscatedName("eo.g")
    public boolean field1651;

    @ObfuscatedName("eo.n")
    public int[] field1652;

    @ObfuscatedName("eo.u")
    public int[] field1653;

    @ObfuscatedName("eo.a")
    public int[] field1654;

    @ObfuscatedName("eo.z")
    public int[] field1655;

    @ObfuscatedName("eo.w")
    public int field1649;

    @ObfuscatedName("eo.y")
    public int field1657;

    @ObfuscatedName("eo.c")
    public int[] field1658;

    @ObfuscatedName("eo.h")
    public boolean field1659 = false;

    public class134(class310 arg0) {
        this.field1648 = arg0.method5283();
        this.field1651 = arg0.method5227() == 1;
        int var2 = arg0.method5227();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1652 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1652[var3] = arg0.method5283();
        }
        if (var2 > 1) {
            this.field1653 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1653[var4] = arg0.method5227();
            }
        }
        if (var2 > 1) {
            this.field1654 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1654[var5] = arg0.method5227();
            }
        }
        this.field1655 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1655[var6] = arg0.method5209();
        }
        this.field1649 = arg0.method5227();
        this.field1657 = arg0.method5227();
        this.field1658 = null;
    }

    @ObfuscatedName("eo.m(DILic;)Z")
    public boolean method2693(double arg0, int arg1, class244 arg2) {
        for (int var5 = 0; var5 < this.field1652.length; var5++) {
            if (arg2.method3969(this.field1652[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1658 = new int[var6];
        for (int var7 = 0; var7 < this.field1652.length; var7++) {
            int var8 = this.field1652[var7];
            byte[] var9 = arg2.method3955(var8);
            boolean var10;
            if (var9 == null) {
                var10 = false;
            } else {
                class336.method31(var9);
                var10 = true;
            }
            class334 var11;
            if (var10) {
                var11 = class336.method1966();
            } else {
                var11 = null;
            }
            var11.method5769();
            byte[] var13 = var11.field3887;
            int[] var14 = var11.field3885;
            int var15 = this.field1655[var7];
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
                var14[var21] = class140.method2834(var14[var21], arg0);
            }
            int var22;
            if (var7 == 0) {
                var22 = 0;
            } else {
                var22 = this.field1653[var7 - 1];
            }
            if (var22 == 0) {
                if (var11.field3886 == arg1) {
                    for (int var23 = 0; var23 < var6; var23++) {
                        this.field1658[var23] = var14[var13[var23] & 0xFF];
                    }
                } else if (var11.field3886 == 64 && arg1 == 128) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < arg1; var25++) {
                        for (int var26 = 0; var26 < arg1; var26++) {
                            this.field1658[var24++] = var14[var13[(var25 >> 1 << 6) + (var26 >> 1)] & 0xFF];
                        }
                    }
                } else if (var11.field3886 == 128 && arg1 == 64) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < arg1; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            this.field1658[var27++] = var14[var13[(var28 << 1 << 7) + (var29 << 1)] & 0xFF];
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

    @ObfuscatedName("eo.o()V")
    public void method2694() {
        this.field1658 = null;
    }

    @ObfuscatedName("eo.q(I)V")
    public void method2695(int arg0) {
        if (this.field1658 == null) {
            return;
        }
        if (this.field1649 == 1 || this.field1649 == 3) {
            if (Statics.field1650 == null || Statics.field1650.length < this.field1658.length) {
                Statics.field1650 = new int[this.field1658.length];
            }
            short var2;
            if (this.field1658.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1658.length;
            int var4 = arg0 * var2 * this.field1657;
            int var5 = var3 - 1;
            if (this.field1649 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1650[var6] = this.field1658[var7];
            }
            int[] var8 = this.field1658;
            this.field1658 = Statics.field1650;
            Statics.field1650 = var8;
        }
        if (this.field1649 != 2 && this.field1649 != 4) {
            return;
        }
        if (Statics.field1650 == null || Statics.field1650.length < this.field1658.length) {
            Statics.field1650 = new int[this.field1658.length];
        }
        short var9;
        if (this.field1658.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1658.length;
        int var11 = this.field1657 * arg0;
        int var12 = var9 - 1;
        if (this.field1649 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1650[var15] = this.field1658[var16];
            }
        }
        int[] var17 = this.field1658;
        this.field1658 = Statics.field1650;
        Statics.field1650 = var17;
    }
}
