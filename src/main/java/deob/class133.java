package deob;

@ObfuscatedName("eh")
public class class133 extends class107 {

    @ObfuscatedName("eh.d")
    public int field1682;

    @ObfuscatedName("eh.k")
    public boolean field1683;

    @ObfuscatedName("eh.u")
    public int[] field1692;

    @ObfuscatedName("eh.v")
    public int[] field1679;

    @ObfuscatedName("eh.f")
    public int[] field1686;

    @ObfuscatedName("eh.s")
    public int[] field1687;

    @ObfuscatedName("eh.j")
    public int field1688;

    @ObfuscatedName("eh.e")
    public int field1678;

    @ObfuscatedName("eh.t")
    public int[] field1690;

    @ObfuscatedName("eh.y")
    public boolean field1691 = false;

    public class133(class136 arg0) {
        this.field1682 = arg0.method1712();
        this.field1683 = arg0.method1602() == 1;
        int var2 = arg0.method1602();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1692 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1692[var3] = arg0.method1712();
        }
        if (var2 > 1) {
            this.field1679 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1679[var4] = arg0.method1602();
            }
        }
        if (var2 > 1) {
            this.field1686 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1686[var5] = arg0.method1602();
            }
        }
        this.field1687 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1687[var6] = arg0.method1607();
        }
        this.field1688 = arg0.method1602();
        this.field1678 = arg0.method1602();
        this.field1690 = null;
    }

    @ObfuscatedName("eh.r(DILcv;)Z")
    public boolean method1575(double arg0, int arg1, class87 arg2) {
        for (int var5 = 0; var5 < this.field1692.length; var5++) {
            if (arg2.method1027(this.field1692[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1690 = new int[var6];
        for (int var7 = 0; var7 < this.field1692.length; var7++) {
            class172 var8 = class40.method2581(arg2, this.field1692[var7]);
            var8.method2747();
            byte[] var9 = var8.field2514;
            int[] var10 = var8.field2518;
            int var11 = this.field1687[var7];
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
                var10[var17] = class173.method2766(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1679[var7 - 1];
            }
            if (var7 == 0) {
            }
            if (var18 == 0) {
                if (var8.field2513 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1690[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field2513 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1690[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field2513 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1690[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("eh.d()V")
    public void method1576() {
        this.field1690 = null;
    }

    @ObfuscatedName("eh.k(I)V")
    public void method1580(int arg0) {
        if (this.field1690 == null) {
            return;
        }
        if (this.field1688 == 1 || this.field1688 == 3) {
            if (Statics.field1685 == null || Statics.field1685.length < this.field1690.length) {
                Statics.field1685 = new int[this.field1690.length];
            }
            short var2;
            if (this.field1690.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1690.length;
            int var4 = arg0 * var2 * this.field1678;
            int var5 = var3 - 1;
            if (this.field1688 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1685[var6] = this.field1690[var7];
            }
            int[] var8 = this.field1690;
            this.field1690 = Statics.field1685;
            Statics.field1685 = var8;
        }
        if (this.field1688 != 2 && this.field1688 != 4) {
            return;
        }
        if (Statics.field1685 == null || Statics.field1685.length < this.field1690.length) {
            Statics.field1685 = new int[this.field1690.length];
        }
        short var9;
        if (this.field1690.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1690.length;
        int var11 = this.field1678 * arg0;
        int var12 = var9 - 1;
        if (this.field1688 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1685[var15] = this.field1690[var16];
            }
        }
        int[] var17 = this.field1690;
        this.field1690 = Statics.field1685;
        Statics.field1685 = var17;
    }
}
