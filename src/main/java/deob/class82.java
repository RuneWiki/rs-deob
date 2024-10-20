package deob;

@ObfuscatedName("cr")
public class class82 {

    @ObfuscatedName("cr.x")
    public class334[] field1068;

    @ObfuscatedName("cr.q")
    public int[] field1060 = new int[256];

    @ObfuscatedName("cr.z")
    public int field1061 = 0;

    @ObfuscatedName("cr.t")
    public int[] field1075;

    @ObfuscatedName("cr.e")
    public int[] field1063;

    @ObfuscatedName("cr.s")
    public int[] field1066;

    @ObfuscatedName("cr.p")
    public int[] field1065;

    @ObfuscatedName("cr.n")
    public int field1064 = 0;

    @ObfuscatedName("cr.u")
    public int field1067 = 0;

    @ObfuscatedName("cr.h")
    public int[] field1058;

    @ObfuscatedName("cr.g")
    public int[] field1069;

    @ObfuscatedName("cr.i")
    public int[] field1070;

    @ObfuscatedName("cr.a")
    public int[] field1071;

    @ObfuscatedName("cr.b")
    public int field1056 = 0;

    @ObfuscatedName("cr.l")
    public int field1073 = 0;

    @ObfuscatedName("cr.r")
    public int field1074 = 0;

    public class82(class334[] arg0) {
        this.field1068 = arg0;
        this.method1753();
    }

    @ObfuscatedName("cr.x(I)V")
    public void method1753() {
        this.field1063 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1063[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1063[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1063[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1063[var4 + 192] = 16777215;
        }
        this.field1066 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1066[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1066[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1066[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1066[var8 + 192] = 16777215;
        }
        this.field1065 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1065[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1065[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1065[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1065[var12 + 192] = 16777215;
        }
        this.field1075 = new int[256];
        this.field1056 = 0;
        this.field1070 = new int[32768];
        this.field1071 = new int[32768];
        this.method1735((class334) null);
        this.field1058 = new int[32768];
        this.field1069 = new int[32768];
    }

    @ObfuscatedName("cr.m(I)V")
    public void method1727() {
        this.field1063 = null;
        this.field1066 = null;
        this.field1065 = null;
        this.field1075 = null;
        this.field1070 = null;
        this.field1071 = null;
        this.field1058 = null;
        this.field1069 = null;
        this.field1056 = 0;
        this.field1073 = 0;
    }

    @ObfuscatedName("cr.k(IIB)V")
    public void method1750(int arg0, int arg1) {
        if (this.field1058 == null) {
            this.method1753();
        }
        if (this.field1074 == 0) {
            this.field1074 = arg1;
        }
        int var3 = arg1 - this.field1074;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1074 = arg1;
        if (var3 > 0) {
            this.method1730(var3);
        }
        this.method1737(arg0);
    }

    @ObfuscatedName("cr.d(II)V")
    public final void method1730(int arg0) {
        this.field1056 += arg0 * 128;
        if (this.field1056 > this.field1070.length) {
            this.field1056 -= this.field1070.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method1735(this.field1068[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1058[var3 + var4] - this.field1070[this.field1056 + var3 & this.field1070.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1058[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1058[var11 + var12] = 255;
                } else {
                    this.field1058[var11 + var12] = 0;
                }
            }
        }
        if (this.field1064 > 0) {
            this.field1064 -= arg0 * 4;
        }
        if (this.field1067 > 0) {
            this.field1067 -= arg0 * 4;
        }
        if (this.field1064 == 0 && this.field1067 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1064 = 1024;
            }
            if (var14 == 1) {
                this.field1067 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1060[var15] = this.field1060[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1060[var16] = (int) (Math.sin((double) this.field1061 / 14.0D) * 16.0D + Math.sin((double) this.field1061 / 15.0D) * 14.0D + Math.sin((double) this.field1061 / 16.0D) * 12.0D);
            this.field1061++;
        }
        this.field1073 += arg0;
        int var17 = ((client.field690 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1073 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1058[(var23 << 7) + var22] = 192;
        }
        this.field1073 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1058[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1058[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1069[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1069[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1069[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1058[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cr.w(IIII)I")
    public final int method1758(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("cr.v(II)V")
    public final void method1737(int arg0) {
        int var2 = this.field1075.length;
        if (this.field1064 > 0) {
            this.method1733(this.field1064, this.field1066);
        } else if (this.field1067 > 0) {
            this.method1733(this.field1067, this.field1065);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1075[var3] = this.field1063[var3];
            }
        }
        this.method1734(arg0);
    }

    @ObfuscatedName("cr.q(I[II)V")
    public final void method1733(int arg0, int[] arg1) {
        int var3 = this.field1075.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1075[var4] = this.method1758(this.field1063[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1075[var4] = arg1[var4];
            } else {
                this.field1075[var4] = this.method1758(arg1[var4], this.field1063[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("cr.z(II)V")
    public final void method1734(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1060[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field2412.field3871) {
                var7 = Statics.field2412.field3871 - var5;
            }
            int var8 = Statics.field2412.field3871 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1058[var9++];
                int var12 = var8 % Statics.field3866;
                if (var11 == 0 || var12 < class331.field3868 || var12 >= class331.field3869) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1075[var11];
                    int var16 = Statics.field2412.field3873[var8];
                    Statics.field2412.field3873[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("cr.t(Lle;I)V")
    public final void method1735(class334 arg0) {
        for (int var2 = 0; var2 < this.field1070.length; var2++) {
            this.field1070[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1070[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1071[var8] = (this.field1070[var8 - 1] + this.field1070[var8 + 1] + this.field1070[var8 - 128] + this.field1070[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1070;
            this.field1070 = this.field1071;
            this.field1071 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3886; var11++) {
            for (int var12 = 0; var12 < arg0.field3884; var12++) {
                if (arg0.field3887[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3885;
                    int var14 = var11 + 16 + arg0.field3881;
                    int var15 = (var14 << 7) + var13;
                    this.field1070[var15] = 0;
                }
            }
        }
    }
}
