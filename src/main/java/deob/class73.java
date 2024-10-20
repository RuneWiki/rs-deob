package deob;

@ObfuscatedName("bv")
public class class73 {

    @ObfuscatedName("bv.u")
    public class324[] field1024;

    @ObfuscatedName("bv.h")
    public int[] field1025 = new int[256];

    @ObfuscatedName("bv.y")
    public int field1026 = 0;

    @ObfuscatedName("bv.w")
    public int[] field1027;

    @ObfuscatedName("bv.i")
    public int[] field1043;

    @ObfuscatedName("bv.k")
    public int[] field1029;

    @ObfuscatedName("bv.x")
    public int[] field1044;

    @ObfuscatedName("bv.o")
    public int field1031 = 0;

    @ObfuscatedName("bv.e")
    public int field1032 = 0;

    @ObfuscatedName("bv.n")
    public int[] field1037;

    @ObfuscatedName("bv.r")
    public int[] field1034;

    @ObfuscatedName("bv.c")
    public int[] field1030;

    @ObfuscatedName("bv.a")
    public int[] field1036;

    @ObfuscatedName("bv.d")
    public int field1021 = 0;

    @ObfuscatedName("bv.s")
    public int field1038 = 0;

    @ObfuscatedName("bv.t")
    public int field1035 = 0;

    public class73(class324[] arg0) {
        this.field1024 = arg0;
        this.method1649();
    }

    @ObfuscatedName("bv.u(I)V")
    public void method1649() {
        this.field1043 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1043[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1043[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1043[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1043[var4 + 192] = 16777215;
        }
        this.field1029 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1029[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1029[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1029[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1029[var8 + 192] = 16777215;
        }
        this.field1044 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1044[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1044[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1044[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1044[var12 + 192] = 16777215;
        }
        this.field1027 = new int[256];
        this.field1021 = 0;
        this.field1030 = new int[32768];
        this.field1036 = new int[32768];
        this.method1654((class324) null);
        this.field1037 = new int[32768];
        this.field1034 = new int[32768];
    }

    @ObfuscatedName("bv.f(B)V")
    public void method1648() {
        this.field1043 = null;
        this.field1029 = null;
        this.field1044 = null;
        this.field1027 = null;
        this.field1030 = null;
        this.field1036 = null;
        this.field1037 = null;
        this.field1034 = null;
        this.field1021 = 0;
        this.field1038 = 0;
    }

    @ObfuscatedName("bv.b(III)V")
    public void method1647(int arg0, int arg1) {
        if (this.field1037 == null) {
            this.method1649();
        }
        if (this.field1035 == 0) {
            this.field1035 = arg1;
        }
        int var3 = arg1 - this.field1035;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1035 = arg1;
        if (var3 > 0) {
            this.method1650(var3);
        }
        this.method1659(arg0);
    }

    @ObfuscatedName("bv.g(II)V")
    public final void method1650(int arg0) {
        this.field1021 += arg0 * 128;
        if (this.field1021 > this.field1030.length) {
            this.field1021 -= this.field1030.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method1654(this.field1024[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1037[var3 + var4] - this.field1030[this.field1021 + var3 & this.field1030.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1037[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1037[var11 + var12] = 255;
                } else {
                    this.field1037[var11 + var12] = 0;
                }
            }
        }
        if (this.field1031 > 0) {
            this.field1031 -= arg0 * 4;
        }
        if (this.field1032 > 0) {
            this.field1032 -= arg0 * 4;
        }
        if (this.field1031 == 0 && this.field1032 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1031 = 1024;
            }
            if (var14 == 1) {
                this.field1032 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1025[var15] = this.field1025[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1025[var16] = (int) (Math.sin((double) this.field1026 / 14.0D) * 16.0D + Math.sin((double) this.field1026 / 15.0D) * 14.0D + Math.sin((double) this.field1026 / 16.0D) * 12.0D);
            this.field1026++;
        }
        this.field1038 += arg0;
        int var17 = ((client.field655 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1038 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1037[(var23 << 7) + var22] = 192;
        }
        this.field1038 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1037[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1037[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1034[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1034[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1034[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1037[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bv.z(IIII)I")
    public final int method1651(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("bv.p(II)V")
    public final void method1659(int arg0) {
        int var2 = this.field1027.length;
        if (this.field1031 > 0) {
            this.method1664(this.field1031, this.field1029);
        } else if (this.field1032 > 0) {
            this.method1664(this.field1032, this.field1044);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1027[var3] = this.field1043[var3];
            }
        }
        this.method1653(arg0);
    }

    @ObfuscatedName("bv.h(I[IS)V")
    public final void method1664(int arg0, int[] arg1) {
        int var3 = this.field1027.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1027[var4] = this.method1651(this.field1043[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1027[var4] = arg1[var4];
            } else {
                this.field1027[var4] = this.method1651(arg1[var4], this.field1043[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("bv.y(II)V")
    public final void method1653(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1025[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field2507.field3851) {
                var7 = Statics.field2507.field3851 - var5;
            }
            int var8 = Statics.field2507.field3851 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1037[var9++];
                int var12 = var8 % Statics.field3848;
                if (var11 == 0 || var12 < class321.field3844 || var12 >= class321.field3850) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1027[var11];
                    int var16 = Statics.field2507.field3852[var8];
                    Statics.field2507.field3852[var8++] = 0xFF000000 | ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) + ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("bv.w(Llm;I)V")
    public final void method1654(class324 arg0) {
        for (int var2 = 0; var2 < this.field1030.length; var2++) {
            this.field1030[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1030[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1036[var8] = (this.field1030[var8 - 1] + this.field1030[var8 + 1] + this.field1030[var8 - 128] + this.field1030[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1030;
            this.field1030 = this.field1036;
            this.field1036 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3862; var11++) {
            for (int var12 = 0; var12 < arg0.field3863; var12++) {
                if (arg0.field3864[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3865;
                    int var14 = var11 + 16 + arg0.field3866;
                    int var15 = (var14 << 7) + var13;
                    this.field1030[var15] = 0;
                }
            }
        }
    }
}
