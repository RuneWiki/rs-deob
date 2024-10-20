package deob;

@ObfuscatedName("cl")
public class class87 {

    @ObfuscatedName("cl.l")
    public class413[] field1185;

    @ObfuscatedName("cl.t")
    public int[] field1178 = new int[256];

    @ObfuscatedName("cl.a")
    public int field1182 = 0;

    @ObfuscatedName("cl.e")
    public int[] field1191;

    @ObfuscatedName("cl.i")
    public int[] field1180;

    @ObfuscatedName("cl.y")
    public int[] field1181;

    @ObfuscatedName("cl.w")
    public int[] field1183;

    @ObfuscatedName("cl.g")
    public int field1184 = 0;

    @ObfuscatedName("cl.v")
    public int field1192 = 0;

    @ObfuscatedName("cl.s")
    public int[] field1176;

    @ObfuscatedName("cl.c")
    public int[] field1187;

    @ObfuscatedName("cl.b")
    public int[] field1188;

    @ObfuscatedName("cl.x")
    public int[] field1189;

    @ObfuscatedName("cl.p")
    public int field1190 = 0;

    @ObfuscatedName("cl.z")
    public int field1179 = 0;

    @ObfuscatedName("cl.h")
    public int field1177 = 0;

    public class87(class413[] arg0) {
        this.field1185 = arg0;
        this.method2067();
    }

    @ObfuscatedName("cl.l(I)V")
    public void method2067() {
        this.field1180 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1180[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1180[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1180[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1180[var4 + 192] = 16777215;
        }
        this.field1181 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1181[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1181[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1181[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1181[var8 + 192] = 16777215;
        }
        this.field1183 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1183[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1183[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1183[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1183[var12 + 192] = 16777215;
        }
        this.field1191 = new int[256];
        this.field1190 = 0;
        this.field1188 = new int[32768];
        this.field1189 = new int[32768];
        this.method2097((class413) null);
        this.field1176 = new int[32768];
        this.field1187 = new int[32768];
    }

    @ObfuscatedName("cl.q(I)V")
    public void method2068() {
        this.field1180 = null;
        this.field1181 = null;
        this.field1183 = null;
        this.field1191 = null;
        this.field1188 = null;
        this.field1189 = null;
        this.field1176 = null;
        this.field1187 = null;
        this.field1190 = 0;
        this.field1179 = 0;
    }

    @ObfuscatedName("cl.f(III)V")
    public void method2070(int arg0, int arg1) {
        if (this.field1176 == null) {
            this.method2067();
        }
        if (this.field1177 == 0) {
            this.field1177 = arg1;
        }
        int var3 = arg1 - this.field1177;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1177 = arg1;
        if (var3 > 0) {
            this.method2084(var3);
        }
        this.method2072(arg0);
    }

    @ObfuscatedName("cl.j(II)V")
    public final void method2084(int arg0) {
        this.field1190 += arg0 * 128;
        if (this.field1190 > this.field1188.length) {
            this.field1190 -= this.field1188.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2097(this.field1185[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1176[var3 + var4] - this.field1188[this.field1190 + var3 & this.field1188.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1176[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1176[var11 + var12] = 255;
                } else {
                    this.field1176[var11 + var12] = 0;
                }
            }
        }
        if (this.field1184 > 0) {
            this.field1184 -= arg0 * 4;
        }
        if (this.field1192 > 0) {
            this.field1192 -= arg0 * 4;
        }
        if (this.field1184 == 0 && this.field1192 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1184 = 1024;
            }
            if (var14 == 1) {
                this.field1192 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1178[var15] = this.field1178[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1178[var16] = (int) (Math.sin((double) this.field1182 / 14.0D) * 16.0D + Math.sin((double) this.field1182 / 15.0D) * 14.0D + Math.sin((double) this.field1182 / 16.0D) * 12.0D);
            this.field1182++;
        }
        this.field1179 += arg0;
        int var17 = ((client.field494 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1179 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1176[(var23 << 7) + var22] = 192;
        }
        this.field1179 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1176[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1176[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1187[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1187[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1187[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1176[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cl.m(IIII)I")
    public final int method2071(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("cl.k(IB)V")
    public final void method2072(int arg0) {
        int var2 = this.field1191.length;
        if (this.field1184 > 0) {
            this.method2073(this.field1184, this.field1181);
        } else if (this.field1192 > 0) {
            this.method2073(this.field1192, this.field1183);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1191[var3] = this.field1180[var3];
            }
        }
        this.method2074(arg0);
    }

    @ObfuscatedName("cl.t(I[II)V")
    public final void method2073(int arg0, int[] arg1) {
        int var3 = this.field1191.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1191[var4] = this.method2071(this.field1180[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1191[var4] = arg1[var4];
            } else {
                this.field1191[var4] = this.method2071(arg1[var4], this.field1180[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("cl.a(II)V")
    public final void method2074(int arg0) {
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
            if (var5 + 128 >= Statics.field2895.field4364) {
                var7 = Statics.field2895.field4364 - var5;
            }
            int var8 = Statics.field2895.field4364 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1176[var9++];
                int var12 = var8 % Statics.field4358;
                if (var11 == 0 || var12 < class410.field4362 || var12 >= class410.field4363) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1191[var11];
                    int var16 = Statics.field2895.field4366[var8];
                    Statics.field2895.field4366[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("cl.e(Loz;I)V")
    public final void method2097(class413 arg0) {
        for (int var2 = 0; var2 < this.field1188.length; var2++) {
            this.field1188[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1188[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1189[var8] = (this.field1188[var8 - 1] + this.field1188[var8 + 1] + this.field1188[var8 - 128] + this.field1188[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1188;
            this.field1188 = this.field1189;
            this.field1189 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field4375; var11++) {
            for (int var12 = 0; var12 < arg0.field4373; var12++) {
                if (arg0.field4380[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field4376;
                    int var14 = var11 + 16 + arg0.field4378;
                    int var15 = (var14 << 7) + var13;
                    this.field1188[var15] = 0;
                }
            }
        }
    }
}
