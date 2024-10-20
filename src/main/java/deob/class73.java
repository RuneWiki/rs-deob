package deob;

@ObfuscatedName("br")
public class class73 {

    @ObfuscatedName("br.z")
    public class324[] field1014;

    @ObfuscatedName("br.q")
    public int[] field1018 = new int[256];

    @ObfuscatedName("br.m")
    public int field1019 = 0;

    @ObfuscatedName("br.y")
    public int[] field1020;

    @ObfuscatedName("br.i")
    public int[] field1031;

    @ObfuscatedName("br.c")
    public int[] field1022;

    @ObfuscatedName("br.b")
    public int[] field1023;

    @ObfuscatedName("br.o")
    public int field1024 = 0;

    @ObfuscatedName("br.a")
    public int field1015 = 0;

    @ObfuscatedName("br.e")
    public int[] field1021;

    @ObfuscatedName("br.w")
    public int[] field1028;

    @ObfuscatedName("br.t")
    public int[] field1032;

    @ObfuscatedName("br.g")
    public int[] field1016;

    @ObfuscatedName("br.x")
    public int field1030 = 0;

    @ObfuscatedName("br.h")
    public int field1025 = 0;

    @ObfuscatedName("br.s")
    public int field1026 = 0;

    public class73(class324[] arg0) {
        this.field1014 = arg0;
        this.method1635();
    }

    @ObfuscatedName("br.z(I)V")
    public void method1635() {
        this.field1031 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1031[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1031[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1031[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1031[var4 + 192] = 16777215;
        }
        this.field1022 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1022[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1022[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1022[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1022[var8 + 192] = 16777215;
        }
        this.field1023 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1023[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1023[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1023[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1023[var12 + 192] = 16777215;
        }
        this.field1020 = new int[256];
        this.field1030 = 0;
        this.field1032 = new int[32768];
        this.field1016 = new int[32768];
        this.method1643((class324) null);
        this.field1021 = new int[32768];
        this.field1028 = new int[32768];
    }

    @ObfuscatedName("br.n(I)V")
    public void method1636() {
        this.field1031 = null;
        this.field1022 = null;
        this.field1023 = null;
        this.field1020 = null;
        this.field1032 = null;
        this.field1016 = null;
        this.field1021 = null;
        this.field1028 = null;
        this.field1030 = 0;
        this.field1025 = 0;
    }

    @ObfuscatedName("br.v(III)V")
    public void method1637(int arg0, int arg1) {
        if (this.field1021 == null) {
            this.method1635();
        }
        if (this.field1026 == 0) {
            this.field1026 = arg1;
        }
        int var3 = arg1 - this.field1026;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1026 = arg1;
        if (var3 > 0) {
            this.method1638(var3);
        }
        this.method1655(arg0);
    }

    @ObfuscatedName("br.u(II)V")
    public final void method1638(int arg0) {
        this.field1030 += arg0 * 128;
        if (this.field1030 > this.field1032.length) {
            this.field1030 -= this.field1032.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method1643(this.field1014[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1021[var3 + var4] - this.field1032[this.field1030 + var3 & this.field1032.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1021[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1021[var11 + var12] = 255;
                } else {
                    this.field1021[var11 + var12] = 0;
                }
            }
        }
        if (this.field1024 > 0) {
            this.field1024 -= arg0 * 4;
        }
        if (this.field1015 > 0) {
            this.field1015 -= arg0 * 4;
        }
        if (this.field1024 == 0 && this.field1015 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1024 = 1024;
            }
            if (var14 == 1) {
                this.field1015 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1018[var15] = this.field1018[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1018[var16] = (int) (Math.sin((double) this.field1019 / 14.0D) * 16.0D + Math.sin((double) this.field1019 / 15.0D) * 14.0D + Math.sin((double) this.field1019 / 16.0D) * 12.0D);
            this.field1019++;
        }
        this.field1025 += arg0;
        int var17 = ((client.field645 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1025 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1021[(var23 << 7) + var22] = 192;
        }
        this.field1025 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1021[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1021[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1028[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1028[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1028[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1021[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("br.r(IIII)I")
    public final int method1639(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("br.p(IB)V")
    public final void method1655(int arg0) {
        int var2 = this.field1020.length;
        if (this.field1024 > 0) {
            this.method1641(this.field1024, this.field1022);
        } else if (this.field1015 > 0) {
            this.method1641(this.field1015, this.field1023);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1020[var3] = this.field1031[var3];
            }
        }
        this.method1642(arg0);
    }

    @ObfuscatedName("br.q(I[II)V")
    public final void method1641(int arg0, int[] arg1) {
        int var3 = this.field1020.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1020[var4] = this.method1639(this.field1031[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1020[var4] = arg1[var4];
            } else {
                this.field1020[var4] = this.method1639(arg1[var4], this.field1031[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("br.m(II)V")
    public final void method1642(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1018[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field349.field3853) {
                var7 = Statics.field349.field3853 - var5;
            }
            int var8 = Statics.field349.field3853 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1021[var9++];
                int var12 = var8 % Statics.field3846;
                if (var11 == 0 || var12 < class321.field3849 || var12 >= class321.field3851) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1020[var11];
                    int var16 = Statics.field349.field3855[var8];
                    Statics.field349.field3855[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("br.y(Llp;I)V")
    public final void method1643(class324 arg0) {
        for (int var2 = 0; var2 < this.field1032.length; var2++) {
            this.field1032[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1032[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1016[var8] = (this.field1032[var8 - 1] + this.field1032[var8 + 1] + this.field1032[var8 - 128] + this.field1032[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1032;
            this.field1032 = this.field1016;
            this.field1016 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3864; var11++) {
            for (int var12 = 0; var12 < arg0.field3863; var12++) {
                if (arg0.field3868[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3865;
                    int var14 = var11 + 16 + arg0.field3866;
                    int var15 = (var14 << 7) + var13;
                    this.field1032[var15] = 0;
                }
            }
        }
    }
}
