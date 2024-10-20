package deob;

@ObfuscatedName("bi")
public class class74 {

    @ObfuscatedName("bi.s")
    public class397[] field1097;

    @ObfuscatedName("bi.w")
    public int[] field1092 = new int[256];

    @ObfuscatedName("bi.f")
    public int field1093 = 0;

    @ObfuscatedName("bi.o")
    public int[] field1102;

    @ObfuscatedName("bi.x")
    public int[] field1095;

    @ObfuscatedName("bi.r")
    public int[] field1096;

    @ObfuscatedName("bi.p")
    public int[] field1103;

    @ObfuscatedName("bi.h")
    public int field1098 = 0;

    @ObfuscatedName("bi.k")
    public int field1099 = 0;

    @ObfuscatedName("bi.a")
    public int[] field1100;

    @ObfuscatedName("bi.q")
    public int[] field1101;

    @ObfuscatedName("bi.u")
    public int[] field1105;

    @ObfuscatedName("bi.e")
    public int[] field1087;

    @ObfuscatedName("bi.c")
    public int field1094 = 0;

    @ObfuscatedName("bi.i")
    public int field1088 = 0;

    @ObfuscatedName("bi.m")
    public int field1106 = 0;

    public class74(class397[] arg0) {
        this.field1097 = arg0;
        this.method1797();
    }

    @ObfuscatedName("bi.s(I)V")
    public void method1797() {
        this.field1095 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1095[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1095[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1095[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1095[var4 + 192] = 16777215;
        }
        this.field1096 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1096[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1096[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1096[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1096[var8 + 192] = 16777215;
        }
        this.field1103 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1103[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1103[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1103[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1103[var12 + 192] = 16777215;
        }
        this.field1102 = new int[256];
        this.field1094 = 0;
        this.field1105 = new int[32768];
        this.field1087 = new int[32768];
        this.method1805((class397) null);
        this.field1100 = new int[32768];
        this.field1101 = new int[32768];
    }

    @ObfuscatedName("bi.t(I)V")
    public void method1818() {
        this.field1095 = null;
        this.field1096 = null;
        this.field1103 = null;
        this.field1102 = null;
        this.field1105 = null;
        this.field1087 = null;
        this.field1100 = null;
        this.field1101 = null;
        this.field1094 = 0;
        this.field1088 = 0;
    }

    @ObfuscatedName("bi.v(III)V")
    public void method1799(int arg0, int arg1) {
        if (this.field1100 == null) {
            this.method1797();
        }
        if (this.field1106 == 0) {
            this.field1106 = arg1;
        }
        int var3 = arg1 - this.field1106;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1106 = arg1;
        if (var3 > 0) {
            this.method1800(var3);
        }
        this.method1802(arg0);
    }

    @ObfuscatedName("bi.j(II)V")
    public final void method1800(int arg0) {
        this.field1094 += arg0 * 128;
        if (this.field1094 > this.field1105.length) {
            this.field1094 -= this.field1105.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method1805(this.field1097[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1100[var3 + var4] - this.field1105[this.field1094 + var3 & this.field1105.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1100[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1100[var11 + var12] = 255;
                } else {
                    this.field1100[var11 + var12] = 0;
                }
            }
        }
        if (this.field1098 > 0) {
            this.field1098 -= arg0 * 4;
        }
        if (this.field1099 > 0) {
            this.field1099 -= arg0 * 4;
        }
        if (this.field1098 == 0 && this.field1099 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1098 = 1024;
            }
            if (var14 == 1) {
                this.field1099 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1092[var15] = this.field1092[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1092[var16] = (int) (Math.sin((double) this.field1093 / 14.0D) * 16.0D + Math.sin((double) this.field1093 / 15.0D) * 14.0D + Math.sin((double) this.field1093 / 16.0D) * 12.0D);
            this.field1093++;
        }
        this.field1088 += arg0;
        int var17 = ((client.field452 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1088 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1100[(var23 << 7) + var22] = 192;
        }
        this.field1088 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1100[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1100[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1101[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1101[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1101[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1100[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("bi.l(IIII)I")
    public final int method1801(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("bi.n(II)V")
    public final void method1802(int arg0) {
        int var2 = this.field1102.length;
        if (this.field1098 > 0) {
            this.method1803(this.field1098, this.field1096);
        } else if (this.field1099 > 0) {
            this.method1803(this.field1099, this.field1103);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1102[var3] = this.field1095[var3];
            }
        }
        this.method1822(arg0);
    }

    @ObfuscatedName("bi.w(I[IS)V")
    public final void method1803(int arg0, int[] arg1) {
        int var3 = this.field1102.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1102[var4] = this.method1801(this.field1095[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1102[var4] = arg1[var4];
            } else {
                this.field1102[var4] = this.method1801(arg1[var4], this.field1095[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("bi.f(II)V")
    public final void method1822(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1092[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field3194.field4254) {
                var7 = Statics.field3194.field4254 - var5;
            }
            int var8 = Statics.field3194.field4254 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1100[var9++];
                int var12 = var8 % Statics.field4245;
                if (var11 == 0 || var12 < class394.field4249 || var12 >= class394.field4248) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1102[var11];
                    int var16 = Statics.field3194.field4252[var8];
                    Statics.field3194.field4252[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("bi.o(Lof;I)V")
    public final void method1805(class397 arg0) {
        for (int var2 = 0; var2 < this.field1105.length; var2++) {
            this.field1105[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1105[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1087[var8] = (this.field1105[var8 - 1] + this.field1105[var8 + 1] + this.field1105[var8 - 128] + this.field1105[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1105;
            this.field1105 = this.field1087;
            this.field1087 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field4264; var11++) {
            for (int var12 = 0; var12 < arg0.field4263; var12++) {
                if (arg0.field4262[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field4265;
                    int var14 = var11 + 16 + arg0.field4266;
                    int var15 = (var14 << 7) + var13;
                    this.field1105[var15] = 0;
                }
            }
        }
    }
}
