package deob;

@ObfuscatedName("ez")
public class class134 extends class190 {

    @ObfuscatedName("ez.z")
    public int field1650;

    @ObfuscatedName("ez.q")
    public boolean field1656;

    @ObfuscatedName("ez.k")
    public int[] field1652;

    @ObfuscatedName("ez.c")
    public int[] field1653;

    @ObfuscatedName("ez.u")
    public int[] field1654;

    @ObfuscatedName("ez.t")
    public int[] field1659;

    @ObfuscatedName("ez.e")
    public int field1646;

    @ObfuscatedName("ez.o")
    public int field1657;

    @ObfuscatedName("ez.n")
    public int[] field1658;

    @ObfuscatedName("ez.x")
    public boolean field1649 = false;

    public class134(class311 arg0) {
        this.field1650 = arg0.method5163();
        this.field1656 = arg0.method5276() == 1;
        int var2 = arg0.method5276();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1652 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1652[var3] = arg0.method5163();
        }
        if (var2 > 1) {
            this.field1653 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1653[var4] = arg0.method5276();
            }
        }
        if (var2 > 1) {
            this.field1654 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1654[var5] = arg0.method5276();
            }
        }
        this.field1659 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1659[var6] = arg0.method5330();
        }
        this.field1646 = arg0.method5276();
        this.field1657 = arg0.method5276();
        this.field1658 = null;
    }

    @ObfuscatedName("ez.f(DILiw;)Z")
    public boolean method2732(double arg0, int arg1, class245 arg2) {
        for (int var5 = 0; var5 < this.field1652.length; var5++) {
            if (arg2.method3914(this.field1652[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1658 = new int[var6];
        for (int var7 = 0; var7 < this.field1652.length; var7++) {
            class335 var8 = class337.method4960(arg2, this.field1652[var7]);
            var8.method5723();
            byte[] var9 = var8.field3906;
            int[] var10 = var8.field3901;
            int var11 = this.field1659[var7];
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
                var10[var17] = class140.method2880(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1653[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3902 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1658[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3902 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1658[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3902 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1658[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("ez.b()V")
    public void method2725() {
        this.field1658 = null;
    }

    @ObfuscatedName("ez.l(I)V")
    public void method2726(int arg0) {
        if (this.field1658 == null) {
            return;
        }
        if (this.field1646 == 1 || this.field1646 == 3) {
            if (Statics.field1660 == null || Statics.field1660.length < this.field1658.length) {
                Statics.field1660 = new int[this.field1658.length];
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
            if (this.field1646 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1660[var6] = this.field1658[var7];
            }
            int[] var8 = this.field1658;
            this.field1658 = Statics.field1660;
            Statics.field1660 = var8;
        }
        if (this.field1646 != 2 && this.field1646 != 4) {
            return;
        }
        if (Statics.field1660 == null || Statics.field1660.length < this.field1658.length) {
            Statics.field1660 = new int[this.field1658.length];
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
        if (this.field1646 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1660[var15] = this.field1658[var16];
            }
        }
        int[] var17 = this.field1658;
        this.field1658 = Statics.field1660;
        Statics.field1660 = var17;
    }
}
