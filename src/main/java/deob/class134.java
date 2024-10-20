package deob;

@ObfuscatedName("ep")
public class class134 extends class190 {

    @ObfuscatedName("ep.y")
    public int field1636;

    @ObfuscatedName("ep.h")
    public boolean field1640;

    @ObfuscatedName("ep.z")
    public int[] field1641;

    @ObfuscatedName("ep.e")
    public int[] field1642;

    @ObfuscatedName("ep.q")
    public int[] field1643;

    @ObfuscatedName("ep.l")
    public int[] field1649;

    @ObfuscatedName("ep.s")
    public int field1645;

    @ObfuscatedName("ep.b")
    public int field1646;

    @ObfuscatedName("ep.a")
    public int[] field1647;

    @ObfuscatedName("ep.w")
    public boolean field1648 = false;

    public class134(class311 arg0) {
        this.field1636 = arg0.method5247();
        this.field1640 = arg0.method5310() == 1;
        int var2 = arg0.method5310();
        if (var2 < 1 || var2 > 4) {
            throw new RuntimeException();
        }
        this.field1641 = new int[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            this.field1641[var3] = arg0.method5247();
        }
        if (var2 > 1) {
            this.field1642 = new int[var2 - 1];
            for (int var4 = 0; var4 < var2 - 1; var4++) {
                this.field1642[var4] = arg0.method5310();
            }
        }
        if (var2 > 1) {
            this.field1643 = new int[var2 - 1];
            for (int var5 = 0; var5 < var2 - 1; var5++) {
                this.field1643[var5] = arg0.method5310();
            }
        }
        this.field1649 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1649[var6] = arg0.method5455();
        }
        this.field1645 = arg0.method5310();
        this.field1646 = arg0.method5310();
        this.field1647 = null;
    }

    @ObfuscatedName("ep.n(DILig;)Z")
    public boolean method2782(double arg0, int arg1, class245 arg2) {
        for (int var5 = 0; var5 < this.field1641.length; var5++) {
            if (arg2.method3992(this.field1641[var5]) == null) {
                return false;
            }
        }
        int var6 = arg1 * arg1;
        this.field1647 = new int[var6];
        for (int var7 = 0; var7 < this.field1641.length; var7++) {
            int var8 = this.field1641[var7];
            class335 var9;
            if (class337.method189(arg2, var8)) {
                var9 = class337.method1166();
            } else {
                var9 = null;
            }
            var9.method5821();
            byte[] var11 = var9.field3902;
            int[] var12 = var9.field3904;
            int var13 = this.field1649[var7];
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
                var12[var19] = class140.method2925(var12[var19], arg0);
            }
            int var20;
            if (var7 == 0) {
                var20 = 0;
            } else {
                var20 = this.field1642[var7 - 1];
            }
            if (var20 == 0) {
                if (var9.field3908 == arg1) {
                    for (int var21 = 0; var21 < var6; var21++) {
                        this.field1647[var21] = var12[var11[var21] & 0xFF];
                    }
                } else if (var9.field3908 == 64 && arg1 == 128) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < arg1; var23++) {
                        for (int var24 = 0; var24 < arg1; var24++) {
                            this.field1647[var22++] = var12[var11[(var23 >> 1 << 6) + (var24 >> 1)] & 0xFF];
                        }
                    }
                } else if (var9.field3908 == 128 && arg1 == 64) {
                    int var25 = 0;
                    for (int var26 = 0; var26 < arg1; var26++) {
                        for (int var27 = 0; var27 < arg1; var27++) {
                            this.field1647[var25++] = var12[var11[(var26 << 1 << 7) + (var27 << 1)] & 0xFF];
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

    @ObfuscatedName("ep.v()V")
    public void method2784() {
        this.field1647 = null;
    }

    @ObfuscatedName("ep.d(I)V")
    public void method2785(int arg0) {
        if (this.field1647 == null) {
            return;
        }
        if (this.field1645 == 1 || this.field1645 == 3) {
            if (Statics.field1635 == null || Statics.field1635.length < this.field1647.length) {
                Statics.field1635 = new int[this.field1647.length];
            }
            short var2;
            if (this.field1647.length == 4096) {
                var2 = 64;
            } else {
                var2 = 128;
            }
            int var3 = this.field1647.length;
            int var4 = arg0 * var2 * this.field1646;
            int var5 = var3 - 1;
            if (this.field1645 == 1) {
                var4 = -var4;
            }
            for (int var6 = 0; var6 < var3; var6++) {
                int var7 = var4 + var6 & var5;
                Statics.field1635[var6] = this.field1647[var7];
            }
            int[] var8 = this.field1647;
            this.field1647 = Statics.field1635;
            Statics.field1635 = var8;
        }
        if (this.field1645 != 2 && this.field1645 != 4) {
            return;
        }
        if (Statics.field1635 == null || Statics.field1635.length < this.field1647.length) {
            Statics.field1635 = new int[this.field1647.length];
        }
        short var9;
        if (this.field1647.length == 4096) {
            var9 = 64;
        } else {
            var9 = 128;
        }
        int var10 = this.field1647.length;
        int var11 = this.field1646 * arg0;
        int var12 = var9 - 1;
        if (this.field1645 == 2) {
            var11 = -var11;
        }
        for (int var13 = 0; var13 < var10; var13 += var9) {
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = var13 + var14;
                int var16 = (var11 + var14 & var12) + var13;
                Statics.field1635[var15] = this.field1647[var16];
            }
        }
        int[] var17 = this.field1647;
        this.field1647 = Statics.field1635;
        Statics.field1635 = var17;
    }
}
