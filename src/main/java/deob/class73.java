package deob;

@ObfuscatedName("bv")
public class class73 {

    @ObfuscatedName("bv.a")
    public class324[] field1024;

    @ObfuscatedName("bv.c")
    public int[] field1014 = new int[256];

    @ObfuscatedName("bv.o")
    public int field1012 = 0;

    @ObfuscatedName("bv.i")
    public int[] field1016;

    @ObfuscatedName("bv.d")
    public int[] field1017;

    @ObfuscatedName("bv.m")
    public int[] field1011;

    @ObfuscatedName("bv.p")
    public int[] field1020;

    @ObfuscatedName("bv.h")
    public int field1031 = 0;

    @ObfuscatedName("bv.k")
    public int field1021 = 0;

    @ObfuscatedName("bv.x")
    public int[] field1022;

    @ObfuscatedName("bv.j")
    public int[] field1023;

    @ObfuscatedName("bv.r")
    public int[] field1015;

    @ObfuscatedName("bv.e")
    public int[] field1025;

    @ObfuscatedName("bv.s")
    public int field1026 = 0;

    @ObfuscatedName("bv.b")
    public int field1027 = 0;

    @ObfuscatedName("bv.z")
    public int field1019 = 0;

    public class73(class324[] arg0) {
        this.field1024 = arg0;
        this.method1716();
    }

    @ObfuscatedName("bv.a(I)V")
    public void method1716() {
        this.field1017 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1017[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1017[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1017[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1017[var4 + 192] = 16777215;
        }
        this.field1011 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1011[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1011[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1011[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1011[var8 + 192] = 16777215;
        }
        this.field1020 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1020[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1020[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1020[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1020[var12 + 192] = 16777215;
        }
        this.field1016 = new int[256];
        this.field1026 = 0;
        this.field1015 = new int[32768];
        this.field1025 = new int[32768];
        this.method1724((class324) null);
        this.field1022 = new int[32768];
        this.field1023 = new int[32768];
    }

    @ObfuscatedName("bv.t(B)V")
    public void method1747() {
        this.field1017 = null;
        this.field1011 = null;
        this.field1020 = null;
        this.field1016 = null;
        this.field1015 = null;
        this.field1025 = null;
        this.field1022 = null;
        this.field1023 = null;
        this.field1026 = 0;
        this.field1027 = 0;
    }

    @ObfuscatedName("bv.n(III)V")
    public void method1718(int arg0, int arg1) {
        if (this.field1022 == null) {
            this.method1716();
        }
        if (this.field1019 == 0) {
            this.field1019 = arg1;
        }
        int var3 = arg1 - this.field1019;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1019 = arg1;
        if (var3 > 0) {
            this.method1719(var3);
        }
        this.method1721(arg0);
    }

    @ObfuscatedName("bv.q(IB)V")
    public final void method1719(int arg0) {
        this.field1026 += arg0 * 128;
        if (this.field1026 > this.field1015.length) {
            this.field1026 -= this.field1015.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method1724(this.field1024[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1022[var3 + var4] - this.field1015[this.field1026 + var3 & this.field1015.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1022[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1022[var11 + var12] = 255;
                } else {
                    this.field1022[var11 + var12] = 0;
                }
            }
        }
        if (this.field1031 > 0) {
            this.field1031 -= arg0 * 4;
        }
        if (this.field1021 > 0) {
            this.field1021 -= arg0 * 4;
        }
        if (this.field1031 == 0 && this.field1021 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1031 = 1024;
            }
            if (var14 == 1) {
                this.field1021 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1014[var15] = this.field1014[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1014[var16] = (int) (Math.sin((double) this.field1012 / 14.0D) * 16.0D + Math.sin((double) this.field1012 / 15.0D) * 14.0D + Math.sin((double) this.field1012 / 16.0D) * 12.0D);
            this.field1012++;
        }
        this.field1027 += arg0;
        int var17 = ((client.field643 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1027 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1022[(var23 << 7) + var22] = 192;
        }
        this.field1027 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1022[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1022[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1023[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1023[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1023[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1022[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bv.v(IIII)I")
    public final int method1720(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("bv.l(IS)V")
    public final void method1721(int arg0) {
        int var2 = this.field1016.length;
        if (this.field1031 > 0) {
            this.method1722(this.field1031, this.field1011);
        } else if (this.field1021 > 0) {
            this.method1722(this.field1021, this.field1020);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1016[var3] = this.field1017[var3];
            }
        }
        this.method1723(arg0);
    }

    @ObfuscatedName("bv.c(I[II)V")
    public final void method1722(int arg0, int[] arg1) {
        int var3 = this.field1016.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1016[var4] = this.method1720(this.field1017[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1016[var4] = arg1[var4];
            } else {
                this.field1016[var4] = this.method1720(arg1[var4], this.field1017[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("bv.o(II)V")
    public final void method1723(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1014[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field155.field3843) {
                var7 = Statics.field155.field3843 - var5;
            }
            int var8 = Statics.field155.field3843 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1022[var9++];
                int var12 = var8 % Statics.field3835;
                if (var11 == 0 || var12 < class321.field3836 || var12 >= class321.field3840) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1016[var11];
                    int var16 = Statics.field155.field3847[var8];
                    Statics.field155.field3847[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("bv.i(Llw;I)V")
    public final void method1724(class324 arg0) {
        for (int var2 = 0; var2 < this.field1015.length; var2++) {
            this.field1015[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1015[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1025[var8] = (this.field1015[var8 - 1] + this.field1015[var8 + 1] + this.field1015[var8 - 128] + this.field1015[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1015;
            this.field1015 = this.field1025;
            this.field1025 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3857; var11++) {
            for (int var12 = 0; var12 < arg0.field3854; var12++) {
                if (arg0.field3855[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3858;
                    int var14 = var11 + 16 + arg0.field3859;
                    int var15 = (var14 << 7) + var13;
                    this.field1015[var15] = 0;
                }
            }
        }
    }
}
