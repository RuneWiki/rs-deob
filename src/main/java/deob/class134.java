package deob;

@ObfuscatedName("et")
public class class134 extends class190 {

    @ObfuscatedName("et.w")
    public int field1642;

    @ObfuscatedName("et.v")
    public boolean field1639;

    @ObfuscatedName("et.q")
    public int[] field1640;

    @ObfuscatedName("et.z")
    public int[] field1641;

    @ObfuscatedName("et.t")
    public int[] field1634;

    @ObfuscatedName("et.e")
    public int[] field1635;

    @ObfuscatedName("et.s")
    public int field1644;

    @ObfuscatedName("et.p")
    public int field1645;

    @ObfuscatedName("et.n")
    public int[] field1638;

    @ObfuscatedName("et.u")
    public boolean field1647 = false;

    public class134(class310 arg0) {
        this.field1642 = arg0.method5139();
        this.field1639 = arg0.method5137() == 1;
        int var2 = arg0.method5137();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1640 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1640[var3] = arg0.method5139();
        }
        if (var2 > 1) {
            this.field1641 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1641[var4] = arg0.method5137();
            }
        }
        if (var2 > 1) {
            this.field1634 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1634[var5] = arg0.method5137();
            }
        }
        this.field1635 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1635[var6] = arg0.method5142();
        }
        this.field1644 = arg0.method5137();
        this.field1645 = arg0.method5137();
        this.field1638 = null;
    }

    @ObfuscatedName("et.x(DILiy;)Z")
    public boolean method2690(double arg0, int arg1, class244 arg2) {
        for (int var5 = 0; var5 < this.field1640.length; var5++) {
            if (arg2.method3870(this.field1640[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1638 = new int[var6];
        for (int var7 = 0; var7 < this.field1640.length; var7++) {
            class334 var8 = class336.method5492(arg2, this.field1640[var7]);
            var8.method5700();
            byte[] var9 = var8.field3887;
            int[] var10 = var8.field3882;
            int var11 = this.field1635[var7];
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
                var10[var17] = class140.method2839(var10[var17], arg0);
            }
            int var18;
            if (var7 == 0) {
                var18 = 0;
            } else {
                var18 = this.field1641[var7 - 1];
            }
            if (var18 == 0) {
                if (var8.field3884 == arg1) {
                    for (int var19 = 0; var19 < var6; var19++) {
                        this.field1638[var19] = var10[var9[var19] & 0xFF];
                    }
                } else if (var8.field3884 == 64 && arg1 == 128) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < arg1; var21++) {
                        for (int var22 = 0; var22 < arg1; var22++) {
                            this.field1638[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
                        }
                    }
                } else if (var8.field3884 == 128 && arg1 == 64) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < arg1; var24++) {
                        for (int var25 = 0; var25 < arg1; var25++) {
                            this.field1638[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
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

    @ObfuscatedName("et.m()V")
    public void method2691() {
        this.field1638 = null;
    }

    @ObfuscatedName("et.k(I)V")
    public void method2692(int arg0) {
        if (this.field1638 == null) {
            return;
        }
        if (this.field1644 == 1 || this.field1644 == 3) {
            if (Statics.field1648 == null || Statics.field1648.length < this.field1638.length) {
                Statics.field1648 = new int[this.field1638.length];
            }
            short var2;
            if (this.field1638.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1638.length;
            int var4 = arg0 * var2 * this.field1645;
            int var5 = var3 - 1;
            if (this.field1644 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1648[var6] = this.field1638[var7];
            }
            int[] var8 = this.field1638;
            this.field1638 = Statics.field1648;
            Statics.field1648 = var8;
        }
        if (this.field1644 != 2 && this.field1644 != 4) {
            return;
        }
        if (Statics.field1648 == null || Statics.field1648.length < this.field1638.length) {
            Statics.field1648 = new int[this.field1638.length];
        }
        short var9;
        if (this.field1638.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1638.length;
        int var11 = this.field1645 * arg0;
        int var12 = var9 - 1;
        if (this.field1644 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1648[var15] = this.field1638[var16];
            }
        }
        int[] var17 = this.field1638;
        this.field1638 = Statics.field1648;
        Statics.field1648 = var17;
    }
}
