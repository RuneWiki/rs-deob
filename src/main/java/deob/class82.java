package deob;

@ObfuscatedName("cw")
public class class82 {

    @ObfuscatedName("cw.m")
    public class334[] field1077;

    @ObfuscatedName("cw.n")
    public int[] field1076 = new int[256];

    @ObfuscatedName("cw.u")
    public int field1071 = 0;

    @ObfuscatedName("cw.a")
    public int[] field1063;

    @ObfuscatedName("cw.z")
    public int[] field1064;

    @ObfuscatedName("cw.w")
    public int[] field1062;

    @ObfuscatedName("cw.y")
    public int[] field1066;

    @ObfuscatedName("cw.c")
    public int field1067 = 0;

    @ObfuscatedName("cw.h")
    public int field1065 = 0;

    @ObfuscatedName("cw.k")
    public int[] field1057;

    @ObfuscatedName("cw.r")
    public int[] field1070;

    @ObfuscatedName("cw.s")
    public int[] field1068;

    @ObfuscatedName("cw.v")
    public int[] field1072;

    @ObfuscatedName("cw.d")
    public int field1069 = 0;

    @ObfuscatedName("cw.e")
    public int field1074 = 0;

    @ObfuscatedName("cw.l")
    public int field1075 = 0;

    public class82(class334[] arg0) {
        this.field1077 = arg0;
        this.method1705();
    }

    @ObfuscatedName("cw.m(B)V")
    public void method1705() {
        this.field1064 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1064[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1064[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1064[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1064[var4 + 192] = 16777215;
        }
        this.field1062 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1062[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1062[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1062[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1062[var8 + 192] = 16777215;
        }
        this.field1066 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1066[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1066[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1066[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1066[var12 + 192] = 16777215;
        }
        this.field1063 = new int[256];
        this.field1069 = 0;
        this.field1068 = new int[32768];
        this.field1072 = new int[32768];
        this.method1691((class334) null);
        this.field1057 = new int[32768];
        this.field1070 = new int[32768];
    }

    @ObfuscatedName("cw.o(I)V")
    public void method1684() {
        this.field1064 = null;
        this.field1062 = null;
        this.field1066 = null;
        this.field1063 = null;
        this.field1068 = null;
        this.field1072 = null;
        this.field1057 = null;
        this.field1070 = null;
        this.field1069 = 0;
        this.field1074 = 0;
    }

    @ObfuscatedName("cw.q(III)V")
    public void method1715(int arg0, int arg1) {
        if (this.field1057 == null) {
            this.method1705();
        }
        if (this.field1075 == 0) {
            this.field1075 = arg1;
        }
        int var3 = arg1 - this.field1075;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1075 = arg1;
        if (var3 > 0) {
            this.method1686(var3);
        }
        this.method1688(arg0);
    }

    @ObfuscatedName("cw.j(II)V")
    public final void method1686(int arg0) {
        this.field1069 += arg0 * 128;
        if (this.field1069 > this.field1068.length) {
            this.field1069 -= this.field1068.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method1691(this.field1077[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1057[var3 + var4] - this.field1068[this.field1069 + var3 & this.field1068.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1057[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1057[var11 + var12] = 255;
                } else {
                    this.field1057[var11 + var12] = 0;
                }
            }
        }
        if (this.field1067 > 0) {
            this.field1067 -= arg0 * 4;
        }
        if (this.field1065 > 0) {
            this.field1065 -= arg0 * 4;
        }
        if (this.field1067 == 0 && this.field1065 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1067 = 1024;
            }
            if (var14 == 1) {
                this.field1065 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1076[var15] = this.field1076[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1076[var16] = (int) (Math.sin((double) this.field1071 / 14.0D) * 16.0D + Math.sin((double) this.field1071 / 15.0D) * 14.0D + Math.sin((double) this.field1071 / 16.0D) * 12.0D);
            this.field1071++;
        }
        this.field1074 += arg0;
        int var17 = ((client.field671 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1074 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1057[(var23 << 7) + var22] = 192;
        }
        this.field1074 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1057[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1057[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1070[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1070[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1070[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1057[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cw.p(IIII)I")
    public final int method1697(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("cw.g(II)V")
    public final void method1688(int arg0) {
        int var2 = this.field1063.length;
        if (this.field1067 > 0) {
            this.method1692(this.field1067, this.field1062);
        } else if (this.field1065 > 0) {
            this.method1692(this.field1065, this.field1066);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1063[var3] = this.field1064[var3];
            }
        }
        this.method1690(arg0);
    }

    @ObfuscatedName("cw.n(I[IB)V")
    public final void method1692(int arg0, int[] arg1) {
        int var3 = this.field1063.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1063[var4] = this.method1697(this.field1064[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1063[var4] = arg1[var4];
            } else {
                this.field1063[var4] = this.method1697(arg1[var4], this.field1064[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("cw.u(II)V")
    public final void method1690(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1076[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field554.field3878) {
                var7 = Statics.field554.field3878 - var5;
            }
            int var8 = Statics.field554.field3878 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1057[var9++];
                int var12 = var8 % Statics.field3871;
                if (var11 == 0 || var12 < class331.field3875 || var12 >= class331.field3876) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1063[var11];
                    int var16 = Statics.field554.field3879[var8];
                    Statics.field554.field3879[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("cw.a(Llh;I)V")
    public final void method1691(class334 arg0) {
        for (int var2 = 0; var2 < this.field1068.length; var2++) {
            this.field1068[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1068[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1072[var8] = (this.field1068[var8 - 1] + this.field1068[var8 + 1] + this.field1068[var8 - 128] + this.field1068[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1068;
            this.field1068 = this.field1072;
            this.field1072 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3888; var11++) {
            for (int var12 = 0; var12 < arg0.field3886; var12++) {
                if (arg0.field3887[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3889;
                    int var14 = var11 + 16 + arg0.field3890;
                    int var15 = (var14 << 7) + var13;
                    this.field1068[var15] = 0;
                }
            }
        }
    }
}
