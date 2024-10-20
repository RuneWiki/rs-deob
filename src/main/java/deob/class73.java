package deob;

@ObfuscatedName("br")
public class class73 {

    @ObfuscatedName("br.q")
    public class325[] field1037;

    @ObfuscatedName("br.b")
    public int[] field1043 = new int[256];

    @ObfuscatedName("br.i")
    public int field1059 = 0;

    @ObfuscatedName("br.c")
    public int[] field1045;

    @ObfuscatedName("br.f")
    public int[] field1046;

    @ObfuscatedName("br.m")
    public int[] field1047;

    @ObfuscatedName("br.u")
    public int[] field1048;

    @ObfuscatedName("br.x")
    public int field1049 = 0;

    @ObfuscatedName("br.r")
    public int field1050 = 0;

    @ObfuscatedName("br.v")
    public int[] field1040;

    @ObfuscatedName("br.y")
    public int[] field1044;

    @ObfuscatedName("br.g")
    public int[] field1042;

    @ObfuscatedName("br.a")
    public int[] field1054;

    @ObfuscatedName("br.j")
    public int field1055 = 0;

    @ObfuscatedName("br.t")
    public int field1056 = 0;

    @ObfuscatedName("br.h")
    public int field1057 = 0;

    public class73(class325[] arg0) {
        this.field1037 = arg0;
        this.method1556();
    }

    @ObfuscatedName("br.q(I)V")
    public void method1556() {
        this.field1046 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1046[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1046[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1046[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1046[var4 + 192] = 16777215;
        }
        this.field1047 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1047[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1047[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1047[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1047[var8 + 192] = 16777215;
        }
        this.field1048 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1048[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1048[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1048[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1048[var12 + 192] = 16777215;
        }
        this.field1045 = new int[256];
        this.field1055 = 0;
        this.field1042 = new int[32768];
        this.field1054 = new int[32768];
        this.method1558((class325) null);
        this.field1040 = new int[32768];
        this.field1044 = new int[32768];
    }

    @ObfuscatedName("br.w(B)V")
    public void method1555() {
        this.field1046 = null;
        this.field1047 = null;
        this.field1048 = null;
        this.field1045 = null;
        this.field1042 = null;
        this.field1054 = null;
        this.field1040 = null;
        this.field1044 = null;
        this.field1055 = 0;
        this.field1056 = 0;
    }

    @ObfuscatedName("br.e(IIB)V")
    public void method1570(int arg0, int arg1) {
        if (this.field1040 == null) {
            this.method1556();
        }
        if (this.field1057 == 0) {
            this.field1057 = arg1;
        }
        int var3 = arg1 - this.field1057;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1057 = arg1;
        if (var3 > 0) {
            this.method1557(var3);
        }
        this.method1561(arg0);
    }

    @ObfuscatedName("br.p(II)V")
    public final void method1557(int arg0) {
        this.field1055 += arg0 * 128;
        if (this.field1055 > this.field1042.length) {
            this.field1055 -= this.field1042.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method1558(this.field1037[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1040[var3 + var4] - this.field1042[this.field1055 + var3 & this.field1042.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1040[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1040[var11 + var12] = 255;
                } else {
                    this.field1040[var11 + var12] = 0;
                }
            }
        }
        if (this.field1049 > 0) {
            this.field1049 -= arg0 * 4;
        }
        if (this.field1050 > 0) {
            this.field1050 -= arg0 * 4;
        }
        if (this.field1049 == 0 && this.field1050 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1049 = 1024;
            }
            if (var14 == 1) {
                this.field1050 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1043[var15] = this.field1043[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1043[var16] = (int) (Math.sin((double) this.field1059 / 14.0D) * 16.0D + Math.sin((double) this.field1059 / 15.0D) * 14.0D + Math.sin((double) this.field1059 / 16.0D) * 12.0D);
            this.field1059++;
        }
        this.field1056 += arg0;
        int var17 = ((client.field882 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1056 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1040[(var23 << 7) + var22] = 192;
        }
        this.field1056 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1040[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1040[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1044[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1044[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1044[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1040[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("br.k(IIII)I")
    public final int method1560(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("br.l(II)V")
    public final void method1561(int arg0) {
        int var2 = this.field1045.length;
        if (this.field1049 > 0) {
            this.method1562(this.field1049, this.field1047);
        } else if (this.field1050 > 0) {
            this.method1562(this.field1050, this.field1048);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1045[var3] = this.field1046[var3];
            }
        }
        this.method1563(arg0);
    }

    @ObfuscatedName("br.b(I[IB)V")
    public final void method1562(int arg0, int[] arg1) {
        int var3 = this.field1045.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1045[var4] = this.method1560(this.field1046[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1045[var4] = arg1[var4];
            } else {
                this.field1045[var4] = this.method1560(arg1[var4], this.field1046[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("br.i(II)V")
    public final void method1563(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1043[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field2487.field3878) {
                var7 = Statics.field2487.field3878 - var5;
            }
            int var8 = Statics.field2487.field3878 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1040[var9++];
                int var12 = var8 % Statics.field3876;
                if (var11 == 0 || var12 < class322.field3875 || var12 >= class322.field3873) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1045[var11];
                    int var16 = Statics.field2487.field3877[var8];
                    Statics.field2487.field3877[var8++] = 0xFF000000 | ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) + ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("br.c(Llx;I)V")
    public final void method1558(class325 arg0) {
        for (int var2 = 0; var2 < this.field1042.length; var2++) {
            this.field1042[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1042[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1054[var8] = (this.field1042[var8 - 1] + this.field1042[var8 + 1] + this.field1042[var8 - 128] + this.field1042[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1042;
            this.field1042 = this.field1054;
            this.field1054 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3894; var11++) {
            for (int var12 = 0; var12 < arg0.field3898; var12++) {
                if (arg0.field3896[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3891;
                    int var14 = var11 + 16 + arg0.field3892;
                    int var15 = (var14 << 7) + var13;
                    this.field1042[var15] = 0;
                }
            }
        }
    }
}
