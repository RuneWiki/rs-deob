package deob;

@ObfuscatedName("cb")
public class class82 {

    @ObfuscatedName("cb.n")
    public class335[] field1056;

    @ObfuscatedName("cb.z")
    public int[] field1046 = new int[256];

    @ObfuscatedName("cb.e")
    public int field1047 = 0;

    @ObfuscatedName("cb.q")
    public int[] field1048;

    @ObfuscatedName("cb.l")
    public int[] field1049;

    @ObfuscatedName("cb.s")
    public int[] field1050;

    @ObfuscatedName("cb.b")
    public int[] field1058;

    @ObfuscatedName("cb.a")
    public int field1052 = 0;

    @ObfuscatedName("cb.w")
    public int field1053 = 0;

    @ObfuscatedName("cb.k")
    public int[] field1054;

    @ObfuscatedName("cb.i")
    public int[] field1055;

    @ObfuscatedName("cb.x")
    public int[] field1065;

    @ObfuscatedName("cb.f")
    public int[] field1057;

    @ObfuscatedName("cb.g")
    public int field1051 = 0;

    @ObfuscatedName("cb.u")
    public int field1059 = 0;

    @ObfuscatedName("cb.t")
    public int field1060 = 0;

    public class82(class335[] arg0) {
        this.field1056 = arg0;
        this.method1795();
    }

    @ObfuscatedName("cb.n(S)V")
    public void method1795() {
        this.field1049 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1049[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1049[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1049[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1049[var4 + 192] = 16777215;
        }
        this.field1050 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1050[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1050[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1050[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1050[var8 + 192] = 16777215;
        }
        this.field1058 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1058[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1058[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1058[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1058[var12 + 192] = 16777215;
        }
        this.field1048 = new int[256];
        this.field1051 = 0;
        this.field1065 = new int[32768];
        this.field1057 = new int[32768];
        this.method1766((class335) null);
        this.field1054 = new int[32768];
        this.field1055 = new int[32768];
    }

    @ObfuscatedName("cb.v(I)V")
    public void method1764() {
        this.field1049 = null;
        this.field1050 = null;
        this.field1058 = null;
        this.field1048 = null;
        this.field1065 = null;
        this.field1057 = null;
        this.field1054 = null;
        this.field1055 = null;
        this.field1051 = 0;
        this.field1059 = 0;
    }

    @ObfuscatedName("cb.d(IIB)V")
    public void method1767(int arg0, int arg1) {
        if (this.field1054 == null) {
            this.method1795();
        }
        if (this.field1060 == 0) {
            this.field1060 = arg1;
        }
        int var3 = arg1 - this.field1060;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1060 = arg1;
        if (var3 > 0) {
            this.method1768(var3);
        }
        this.method1797(arg0);
    }

    @ObfuscatedName("cb.c(II)V")
    public final void method1768(int arg0) {
        this.field1051 += arg0 * 128;
        if (this.field1051 > this.field1065.length) {
            this.field1051 -= this.field1065.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method1766(this.field1056[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1054[var3 + var4] - this.field1065[this.field1051 + var3 & this.field1065.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1054[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1054[var11 + var12] = 255;
                } else {
                    this.field1054[var11 + var12] = 0;
                }
            }
        }
        if (this.field1052 > 0) {
            this.field1052 -= arg0 * 4;
        }
        if (this.field1053 > 0) {
            this.field1053 -= arg0 * 4;
        }
        if (this.field1052 == 0 && this.field1053 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1052 = 1024;
            }
            if (var14 == 1) {
                this.field1053 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1046[var15] = this.field1046[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1046[var16] = (int) (Math.sin((double) this.field1047 / 14.0D) * 16.0D + Math.sin((double) this.field1047 / 15.0D) * 14.0D + Math.sin((double) this.field1047 / 16.0D) * 12.0D);
            this.field1047++;
        }
        this.field1059 += arg0;
        int var17 = ((client.field729 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1059 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1054[(var23 << 7) + var22] = 192;
        }
        this.field1059 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1054[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1054[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1055[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1055[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1055[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1054[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cb.y(IIII)I")
    public final int method1769(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("cb.h(II)V")
    public final void method1797(int arg0) {
        int var2 = this.field1048.length;
        if (this.field1052 > 0) {
            this.method1771(this.field1052, this.field1050);
        } else if (this.field1053 > 0) {
            this.method1771(this.field1053, this.field1058);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1048[var3] = this.field1049[var3];
            }
        }
        this.method1772(arg0);
    }

    @ObfuscatedName("cb.z(I[II)V")
    public final void method1771(int arg0, int[] arg1) {
        int var3 = this.field1048.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1048[var4] = this.method1769(this.field1049[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1048[var4] = arg1[var4];
            } else {
                this.field1048[var4] = this.method1769(arg1[var4], this.field1049[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("cb.e(IB)V")
    public final void method1772(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1046[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field2072.field3894) {
                var7 = Statics.field2072.field3894 - var5;
            }
            int var8 = Statics.field2072.field3894 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1054[var9++];
                int var12 = var8 % Statics.field3886;
                if (var11 == 0 || var12 < class332.field3890 || var12 >= class332.field3891) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1048[var11];
                    int var16 = Statics.field2072.field3893[var8];
                    Statics.field2072.field3893[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("cb.q(Lly;B)V")
    public final void method1766(class335 arg0) {
        for (int var2 = 0; var2 < this.field1065.length; var2++) {
            this.field1065[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1065[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1057[var8] = (this.field1065[var8 - 1] + this.field1065[var8 + 1] + this.field1065[var8 - 128] + this.field1065[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1065;
            this.field1065 = this.field1057;
            this.field1057 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3905; var11++) {
            for (int var12 = 0; var12 < arg0.field3908; var12++) {
                if (arg0.field3902[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3906;
                    int var14 = var11 + 16 + arg0.field3907;
                    int var15 = (var14 << 7) + var13;
                    this.field1065[var15] = 0;
                }
            }
        }
    }
}
