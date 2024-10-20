package deob;

@ObfuscatedName("bz")
public class class73 {

    @ObfuscatedName("bz.c")
    public class325[] field1023;

    @ObfuscatedName("bz.d")
    public int[] field1026 = new int[256];

    @ObfuscatedName("bz.l")
    public int field1032 = 0;

    @ObfuscatedName("bz.j")
    public int[] field1028;

    @ObfuscatedName("bz.m")
    public int[] field1029;

    @ObfuscatedName("bz.p")
    public int[] field1034;

    @ObfuscatedName("bz.h")
    public int[] field1030;

    @ObfuscatedName("bz.v")
    public int field1022 = 0;

    @ObfuscatedName("bz.n")
    public int field1033 = 0;

    @ObfuscatedName("bz.x")
    public int[] field1041;

    @ObfuscatedName("bz.w")
    public int[] field1035;

    @ObfuscatedName("bz.k")
    public int[] field1036;

    @ObfuscatedName("bz.q")
    public int[] field1031;

    @ObfuscatedName("bz.z")
    public int field1038 = 0;

    @ObfuscatedName("bz.y")
    public int field1039 = 0;

    @ObfuscatedName("bz.f")
    public int field1040 = 0;

    public class73(class325[] arg0) {
        this.field1023 = arg0;
        this.method1633();
    }

    @ObfuscatedName("bz.c(I)V")
    public void method1633() {
        this.field1029 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1029[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1029[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1029[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1029[var4 + 192] = 16777215;
        }
        this.field1034 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1034[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1034[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1034[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1034[var8 + 192] = 16777215;
        }
        this.field1030 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1030[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1030[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1030[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1030[var12 + 192] = 16777215;
        }
        this.field1028 = new int[256];
        this.field1038 = 0;
        this.field1036 = new int[32768];
        this.field1031 = new int[32768];
        this.method1641((class325) null);
        this.field1041 = new int[32768];
        this.field1035 = new int[32768];
    }

    @ObfuscatedName("bz.t(I)V")
    public void method1664() {
        this.field1029 = null;
        this.field1034 = null;
        this.field1030 = null;
        this.field1028 = null;
        this.field1036 = null;
        this.field1031 = null;
        this.field1041 = null;
        this.field1035 = null;
        this.field1038 = 0;
        this.field1039 = 0;
    }

    @ObfuscatedName("bz.o(III)V")
    public void method1635(int arg0, int arg1) {
        if (this.field1041 == null) {
            this.method1633();
        }
        if (this.field1040 == 0) {
            this.field1040 = arg1;
        }
        int var3 = arg1 - this.field1040;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1040 = arg1;
        if (var3 > 0) {
            this.method1636(var3);
        }
        this.method1668(arg0);
    }

    @ObfuscatedName("bz.e(IB)V")
    public final void method1636(int arg0) {
        this.field1038 += arg0 * 128;
        if (this.field1038 > this.field1036.length) {
            this.field1038 -= this.field1036.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method1641(this.field1023[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1041[var3 + var4] - this.field1036[this.field1038 + var3 & this.field1036.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1041[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1041[var11 + var12] = 255;
                } else {
                    this.field1041[var11 + var12] = 0;
                }
            }
        }
        if (this.field1022 > 0) {
            this.field1022 -= arg0 * 4;
        }
        if (this.field1033 > 0) {
            this.field1033 -= arg0 * 4;
        }
        if (this.field1022 == 0 && this.field1033 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1022 = 1024;
            }
            if (var14 == 1) {
                this.field1033 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1026[var15] = this.field1026[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1026[var16] = (int) (Math.sin((double) this.field1032 / 14.0D) * 16.0D + Math.sin((double) this.field1032 / 15.0D) * 14.0D + Math.sin((double) this.field1032 / 16.0D) * 12.0D);
            this.field1032++;
        }
        this.field1039 += arg0;
        int var17 = ((client.field656 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1039 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1041[(var23 << 7) + var22] = 192;
        }
        this.field1039 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1041[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1041[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1035[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1035[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1035[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1041[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bz.i(IIII)I")
    public final int method1637(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("bz.g(IB)V")
    public final void method1668(int arg0) {
        int var2 = this.field1028.length;
        if (this.field1022 > 0) {
            this.method1639(this.field1022, this.field1034);
        } else if (this.field1033 > 0) {
            this.method1639(this.field1033, this.field1030);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1028[var3] = this.field1029[var3];
            }
        }
        this.method1646(arg0);
    }

    @ObfuscatedName("bz.d(I[II)V")
    public final void method1639(int arg0, int[] arg1) {
        int var3 = this.field1028.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1028[var4] = this.method1637(this.field1029[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1028[var4] = arg1[var4];
            } else {
                this.field1028[var4] = this.method1637(arg1[var4], this.field1029[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("bz.l(II)V")
    public final void method1646(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1026[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field418.field3852) {
                var7 = Statics.field418.field3852 - var5;
            }
            int var8 = Statics.field418.field3852 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1041[var9++];
                int var12 = var8 % Statics.field3845;
                if (var11 == 0 || var12 < class322.field3844 || var12 >= class322.field3850) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1028[var11];
                    int var16 = Statics.field418.field3853[var8];
                    Statics.field418.field3853[var8++] = 0xFF000000 | ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) + ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("bz.j(Lli;I)V")
    public final void method1641(class325 arg0) {
        for (int var2 = 0; var2 < this.field1036.length; var2++) {
            this.field1036[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1036[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1031[var8] = (this.field1036[var8 - 1] + this.field1036[var8 + 1] + this.field1036[var8 - 128] + this.field1036[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1036;
            this.field1036 = this.field1031;
            this.field1031 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3864; var11++) {
            for (int var12 = 0; var12 < arg0.field3863; var12++) {
                if (arg0.field3861[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3865;
                    int var14 = var11 + 16 + arg0.field3866;
                    int var15 = (var14 << 7) + var13;
                    this.field1036[var15] = 0;
                }
            }
        }
    }
}
