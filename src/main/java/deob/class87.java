package deob;

@ObfuscatedName("cv")
public class class87 {

    @ObfuscatedName("cv.c")
    public class431[] field1173;

    @ObfuscatedName("cv.j")
    public int[] field1178 = new int[256];

    @ObfuscatedName("cv.w")
    public int field1183 = 0;

    @ObfuscatedName("cv.n")
    public int[] field1171;

    @ObfuscatedName("cv.r")
    public int[] field1172;

    @ObfuscatedName("cv.o")
    public int[] field1175;

    @ObfuscatedName("cv.v")
    public int[] field1174;

    @ObfuscatedName("cv.d")
    public int field1176 = 0;

    @ObfuscatedName("cv.h")
    public int field1170 = 0;

    @ObfuscatedName("cv.g")
    public int[] field1177;

    @ObfuscatedName("cv.e")
    public int[] field1184;

    @ObfuscatedName("cv.a")
    public int[] field1179;

    @ObfuscatedName("cv.u")
    public int[] field1180;

    @ObfuscatedName("cv.k")
    public int field1169 = 0;

    @ObfuscatedName("cv.f")
    public int field1182 = 0;

    @ObfuscatedName("cv.l")
    public int field1165 = 0;

    public class87(class431[] arg0) {
        this.field1173 = arg0;
        this.method2147();
    }

    @ObfuscatedName("cv.c(I)V")
    public void method2147() {
        this.field1172 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1172[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1172[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1172[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1172[var4 + 192] = 16777215;
        }
        this.field1175 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1175[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1175[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1175[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1175[var8 + 192] = 16777215;
        }
        this.field1174 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1174[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1174[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1174[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1174[var12 + 192] = 16777215;
        }
        this.field1171 = new int[256];
        this.field1169 = 0;
        this.field1179 = new int[32768];
        this.field1180 = new int[32768];
        this.method2155((class431) null);
        this.field1177 = new int[32768];
        this.field1184 = new int[32768];
    }

    @ObfuscatedName("cv.b(B)V")
    public void method2175() {
        this.field1172 = null;
        this.field1175 = null;
        this.field1174 = null;
        this.field1171 = null;
        this.field1179 = null;
        this.field1180 = null;
        this.field1177 = null;
        this.field1184 = null;
        this.field1169 = 0;
        this.field1182 = 0;
    }

    @ObfuscatedName("cv.p(IIB)V")
    public void method2149(int arg0, int arg1) {
        if (this.field1177 == null) {
            this.method2147();
        }
        if (this.field1165 == 0) {
            this.field1165 = arg1;
        }
        int var3 = arg1 - this.field1165;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1165 = arg1;
        if (var3 > 0) {
            this.method2150(var3);
        }
        this.method2152(arg0);
    }

    @ObfuscatedName("cv.m(II)V")
    public final void method2150(int arg0) {
        this.field1169 += arg0 * 128;
        if (this.field1169 > this.field1179.length) {
            this.field1169 -= this.field1179.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2155(this.field1173[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1177[var3 + var4] - this.field1179[this.field1169 + var3 & this.field1179.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1177[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1177[var11 + var12] = 255;
                } else {
                    this.field1177[var11 + var12] = 0;
                }
            }
        }
        if (this.field1176 > 0) {
            this.field1176 -= arg0 * 4;
        }
        if (this.field1170 > 0) {
            this.field1170 -= arg0 * 4;
        }
        if (this.field1176 == 0 && this.field1170 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1176 = 1024;
            }
            if (var14 == 1) {
                this.field1170 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1178[var15] = this.field1178[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1178[var16] = (int) (Math.sin((double) this.field1183 / 14.0D) * 16.0D + Math.sin((double) this.field1183 / 15.0D) * 14.0D + Math.sin((double) this.field1183 / 16.0D) * 12.0D);
            this.field1183++;
        }
        this.field1182 += arg0;
        int var17 = ((client.field481 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1182 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1177[(var23 << 7) + var22] = 192;
        }
        this.field1182 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1177[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1177[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1184[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1184[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1184[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1177[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cv.t(IIIB)I")
    public final int method2151(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("cv.s(IB)V")
    public final void method2152(int arg0) {
        int var2 = this.field1171.length;
        if (this.field1176 > 0) {
            this.method2153(this.field1176, this.field1175);
        } else if (this.field1170 > 0) {
            this.method2153(this.field1170, this.field1174);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1171[var3] = this.field1172[var3];
            }
        }
        this.method2171(arg0);
    }

    @ObfuscatedName("cv.j(I[II)V")
    public final void method2153(int arg0, int[] arg1) {
        int var3 = this.field1171.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1171[var4] = this.method2151(this.field1172[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1171[var4] = arg1[var4];
            } else {
                this.field1171[var4] = this.method2151(arg1[var4], this.field1172[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("cv.w(II)V")
    public final void method2171(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1178[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field107.field4551) {
                var7 = Statics.field107.field4551 - var5;
            }
            int var8 = Statics.field107.field4551 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1177[var9++];
                int var12 = var8 % Statics.field4542;
                if (var11 == 0 || var12 < class428.field4545 || var12 >= class428.field4544) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1171[var11];
                    int var16 = Statics.field107.field4548[var8];
                    Statics.field107.field4548[var8++] = 0xFF000000 | ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) + ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("cv.n(Lpa;I)V")
    public final void method2155(class431 arg0) {
        for (int var2 = 0; var2 < this.field1179.length; var2++) {
            this.field1179[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1179[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1180[var8] = (this.field1179[var8 - 1] + this.field1179[var8 + 1] + this.field1179[var8 - 128] + this.field1179[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1179;
            this.field1179 = this.field1180;
            this.field1180 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field4560; var11++) {
            for (int var12 = 0; var12 < arg0.field4559; var12++) {
                if (arg0.field4557[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field4558;
                    int var14 = var11 + 16 + arg0.field4562;
                    int var15 = (var14 << 7) + var13;
                    this.field1179[var15] = 0;
                }
            }
        }
    }
}
