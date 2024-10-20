package deob;

@ObfuscatedName("bp")
public class class73 {

    @ObfuscatedName("bp.m")
    public class327[] field999;

    @ObfuscatedName("bp.g")
    public int[] field1016 = new int[256];

    @ObfuscatedName("bp.l")
    public int field1009 = 0;

    @ObfuscatedName("bp.e")
    public int[] field1014;

    @ObfuscatedName("bp.x")
    public int[] field1007;

    @ObfuscatedName("bp.d")
    public int[] field1008;

    @ObfuscatedName("bp.k")
    public int[] field1015;

    @ObfuscatedName("bp.n")
    public int field1010 = 0;

    @ObfuscatedName("bp.i")
    public int field1006 = 0;

    @ObfuscatedName("bp.a")
    public int[] field1012;

    @ObfuscatedName("bp.z")
    public int[] field1013;

    @ObfuscatedName("bp.j")
    public int[] field1005;

    @ObfuscatedName("bp.s")
    public int[] field1019;

    @ObfuscatedName("bp.t")
    public int field1011 = 0;

    @ObfuscatedName("bp.y")
    public int field1017 = 0;

    @ObfuscatedName("bp.h")
    public int field1018 = 0;

    public class73(class327[] arg0) {
        this.field999 = arg0;
        this.method1607();
    }

    @ObfuscatedName("bp.m(I)V")
    public void method1607() {
        this.field1007 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1007[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1007[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1007[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1007[var4 + 192] = 16777215;
        }
        this.field1008 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1008[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1008[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1008[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1008[var8 + 192] = 16777215;
        }
        this.field1015 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1015[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1015[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1015[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1015[var12 + 192] = 16777215;
        }
        this.field1014 = new int[256];
        this.field1011 = 0;
        this.field1005 = new int[32768];
        this.field1019 = new int[32768];
        this.method1614((class327) null);
        this.field1012 = new int[32768];
        this.field1013 = new int[32768];
    }

    @ObfuscatedName("bp.f(I)V")
    public void method1597() {
        this.field1007 = null;
        this.field1008 = null;
        this.field1015 = null;
        this.field1014 = null;
        this.field1005 = null;
        this.field1019 = null;
        this.field1012 = null;
        this.field1013 = null;
        this.field1011 = 0;
        this.field1017 = 0;
    }

    @ObfuscatedName("bp.q(III)V")
    public void method1617(int arg0, int arg1) {
        if (this.field1012 == null) {
            this.method1607();
        }
        if (this.field1018 == 0) {
            this.field1018 = arg1;
        }
        int var3 = arg1 - this.field1018;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1018 = arg1;
        if (var3 > 0) {
            this.method1626(var3);
        }
        this.method1622(arg0);
    }

    @ObfuscatedName("bp.w(IB)V")
    public final void method1626(int arg0) {
        this.field1011 += arg0 * 128;
        if (this.field1011 > this.field1005.length) {
            this.field1011 -= this.field1005.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method1614(this.field999[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1012[var3 + var4] - this.field1005[this.field1011 + var3 & this.field1005.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1012[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1012[var11 + var12] = 255;
                } else {
                    this.field1012[var11 + var12] = 0;
                }
            }
        }
        if (this.field1010 > 0) {
            this.field1010 -= arg0 * 4;
        }
        if (this.field1006 > 0) {
            this.field1006 -= arg0 * 4;
        }
        if (this.field1010 == 0 && this.field1006 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1010 = 1024;
            }
            if (var14 == 1) {
                this.field1006 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1016[var15] = this.field1016[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1016[var16] = (int) (Math.sin((double) this.field1009 / 14.0D) * 16.0D + Math.sin((double) this.field1009 / 15.0D) * 14.0D + Math.sin((double) this.field1009 / 16.0D) * 12.0D);
            this.field1009++;
        }
        this.field1017 += arg0;
        int var17 = ((client.field633 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1017 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1012[(var23 << 7) + var22] = 192;
        }
        this.field1017 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1012[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1012[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1013[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1013[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1013[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1012[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bp.o(IIII)I")
    public final int method1600(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("bp.u(II)V")
    public final void method1622(int arg0) {
        int var2 = this.field1014.length;
        if (this.field1010 > 0) {
            this.method1601(this.field1010, this.field1008);
        } else if (this.field1006 > 0) {
            this.method1601(this.field1006, this.field1015);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1014[var3] = this.field1007[var3];
            }
        }
        this.method1602(arg0);
    }

    @ObfuscatedName("bp.g(I[II)V")
    public final void method1601(int arg0, int[] arg1) {
        int var3 = this.field1014.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1014[var4] = this.method1600(this.field1007[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1014[var4] = arg1[var4];
            } else {
                this.field1014[var4] = this.method1600(arg1[var4], this.field1007[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("bp.l(II)V")
    public final void method1602(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1016[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field2396.field3879) {
                var7 = Statics.field2396.field3879 - var5;
            }
            int var8 = Statics.field2396.field3879 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1012[var9++];
                int var12 = var8 % Statics.field3873;
                if (var11 == 0 || var12 < class324.field3876 || var12 >= class324.field3877) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1014[var11];
                    int var16 = Statics.field2396.field3881[var8];
                    Statics.field2396.field3881[var8++] = 0xFF000000 | ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) + ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("bp.e(Llq;I)V")
    public final void method1614(class327 arg0) {
        for (int var2 = 0; var2 < this.field1005.length; var2++) {
            this.field1005[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1005[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1019[var8] = (this.field1005[var8 - 1] + this.field1005[var8 + 1] + this.field1005[var8 - 128] + this.field1005[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1005;
            this.field1005 = this.field1019;
            this.field1019 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3888; var11++) {
            for (int var12 = 0; var12 < arg0.field3892; var12++) {
                if (arg0.field3891[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3895;
                    int var14 = var11 + 16 + arg0.field3893;
                    int var15 = (var14 << 7) + var13;
                    this.field1005[var15] = 0;
                }
            }
        }
    }
}
