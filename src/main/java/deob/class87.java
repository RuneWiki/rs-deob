package deob;

@ObfuscatedName("cj")
public class class87 {

    @ObfuscatedName("cj.i")
    public class413[] field1166;

    @ObfuscatedName("cj.e")
    public int[] field1161 = new int[256];

    @ObfuscatedName("cj.p")
    public int field1159 = 0;

    @ObfuscatedName("cj.j")
    public int[] field1160;

    @ObfuscatedName("cj.b")
    public int[] field1176;

    @ObfuscatedName("cj.x")
    public int[] field1172;

    @ObfuscatedName("cj.y")
    public int[] field1163;

    @ObfuscatedName("cj.k")
    public int field1164 = 0;

    @ObfuscatedName("cj.t")
    public int field1165 = 0;

    @ObfuscatedName("cj.l")
    public int[] field1158;

    @ObfuscatedName("cj.u")
    public int[] field1162;

    @ObfuscatedName("cj.n")
    public int[] field1167;

    @ObfuscatedName("cj.z")
    public int[] field1169;

    @ObfuscatedName("cj.q")
    public int field1170 = 0;

    @ObfuscatedName("cj.d")
    public int field1171 = 0;

    @ObfuscatedName("cj.r")
    public int field1173 = 0;

    public class87(class413[] arg0) {
        this.field1166 = arg0;
        this.method2071();
    }

    @ObfuscatedName("cj.i(I)V")
    public void method2071() {
        this.field1176 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1176[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1176[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1176[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1176[var4 + 192] = 16777215;
        }
        this.field1172 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1172[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1172[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1172[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1172[var8 + 192] = 16777215;
        }
        this.field1163 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1163[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1163[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1163[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1163[var12 + 192] = 16777215;
        }
        this.field1160 = new int[256];
        this.field1170 = 0;
        this.field1167 = new int[32768];
        this.field1169 = new int[32768];
        this.method2073((class413) null);
        this.field1158 = new int[32768];
        this.field1162 = new int[32768];
    }

    @ObfuscatedName("cj.w(B)V")
    public void method2077() {
        this.field1176 = null;
        this.field1172 = null;
        this.field1163 = null;
        this.field1160 = null;
        this.field1167 = null;
        this.field1169 = null;
        this.field1158 = null;
        this.field1162 = null;
        this.field1170 = 0;
        this.field1171 = 0;
    }

    @ObfuscatedName("cj.s(III)V")
    public void method2103(int arg0, int arg1) {
        if (this.field1158 == null) {
            this.method2071();
        }
        if (this.field1173 == 0) {
            this.field1173 = arg1;
        }
        int var3 = arg1 - this.field1173;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1173 = arg1;
        if (var3 > 0) {
            this.method2074(var3);
        }
        this.method2076(arg0);
    }

    @ObfuscatedName("cj.a(II)V")
    public final void method2074(int arg0) {
        this.field1170 += arg0 * 128;
        if (this.field1170 > this.field1167.length) {
            this.field1170 -= this.field1167.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2073(this.field1166[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1158[var3 + var4] - this.field1167[this.field1170 + var3 & this.field1167.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1158[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1158[var11 + var12] = 255;
                } else {
                    this.field1158[var11 + var12] = 0;
                }
            }
        }
        if (this.field1164 > 0) {
            this.field1164 -= arg0 * 4;
        }
        if (this.field1165 > 0) {
            this.field1165 -= arg0 * 4;
        }
        if (this.field1164 == 0 && this.field1165 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1164 = 1024;
            }
            if (var14 == 1) {
                this.field1165 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1161[var15] = this.field1161[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1161[var16] = (int) (Math.sin((double) this.field1159 / 14.0D) * 16.0D + Math.sin((double) this.field1159 / 15.0D) * 14.0D + Math.sin((double) this.field1159 / 16.0D) * 12.0D);
            this.field1159++;
        }
        this.field1171 += arg0;
        int var17 = ((client.field555 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1171 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1158[(var23 << 7) + var22] = 192;
        }
        this.field1171 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1158[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1158[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1162[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1162[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1162[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1158[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cj.o(IIII)I")
    public final int method2105(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("cj.g(II)V")
    public final void method2076(int arg0) {
        int var2 = this.field1160.length;
        if (this.field1164 > 0) {
            this.method2079(this.field1164, this.field1172);
        } else if (this.field1165 > 0) {
            this.method2079(this.field1165, this.field1163);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1160[var3] = this.field1176[var3];
            }
        }
        this.method2078(arg0);
    }

    @ObfuscatedName("cj.e(I[II)V")
    public final void method2079(int arg0, int[] arg1) {
        int var3 = this.field1160.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1160[var4] = this.method2105(this.field1176[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1160[var4] = arg1[var4];
            } else {
                this.field1160[var4] = this.method2105(arg1[var4], this.field1176[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("cj.p(II)V")
    public final void method2078(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1161[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field146.field4374) {
                var7 = Statics.field146.field4374 - var5;
            }
            int var8 = Statics.field146.field4374 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1158[var9++];
                int var12 = var8 % Statics.field4367;
                if (var11 == 0 || var12 < class410.field4371 || var12 >= class410.field4372) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1160[var11];
                    int var16 = Statics.field146.field4376[var8];
                    Statics.field146.field4376[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("cj.j(Loe;I)V")
    public final void method2073(class413 arg0) {
        for (int var2 = 0; var2 < this.field1167.length; var2++) {
            this.field1167[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1167[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1169[var8] = (this.field1167[var8 - 1] + this.field1167[var8 + 1] + this.field1167[var8 - 128] + this.field1167[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1167;
            this.field1167 = this.field1169;
            this.field1169 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field4388; var11++) {
            for (int var12 = 0; var12 < arg0.field4387; var12++) {
                if (arg0.field4386[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field4389;
                    int var14 = var11 + 16 + arg0.field4390;
                    int var15 = (var14 << 7) + var13;
                    this.field1167[var15] = 0;
                }
            }
        }
    }
}
