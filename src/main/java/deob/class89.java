package deob;

@ObfuscatedName("cf")
public class class89 {

    @ObfuscatedName("cf.c")
    public class455[] field1224;

    @ObfuscatedName("cf.g")
    public int[] field1235 = new int[256];

    @ObfuscatedName("cf.w")
    public int field1219 = 0;

    @ObfuscatedName("cf.y")
    public int[] field1220;

    @ObfuscatedName("cf.i")
    public int[] field1221;

    @ObfuscatedName("cf.s")
    public int[] field1218;

    @ObfuscatedName("cf.t")
    public int[] field1223;

    @ObfuscatedName("cf.z")
    public int field1236 = 0;

    @ObfuscatedName("cf.r")
    public int field1225 = 0;

    @ObfuscatedName("cf.u")
    public int[] field1226;

    @ObfuscatedName("cf.k")
    public int[] field1215;

    @ObfuscatedName("cf.h")
    public int[] field1234;

    @ObfuscatedName("cf.x")
    public int[] field1231;

    @ObfuscatedName("cf.l")
    public int field1230 = 0;

    @ObfuscatedName("cf.a")
    public int field1227 = 0;

    @ObfuscatedName("cf.p")
    public int field1232 = 0;

    public class89(class455[] arg0) {
        this.field1224 = arg0;
        this.method2103();
    }

    @ObfuscatedName("cf.c(B)V")
    public void method2103() {
        this.field1221 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1221[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1221[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1221[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1221[var4 + 192] = 16777215;
        }
        this.field1218 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1218[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1218[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1218[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1218[var8 + 192] = 16777215;
        }
        this.field1223 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1223[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1223[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1223[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1223[var12 + 192] = 16777215;
        }
        this.field1220 = new int[256];
        this.field1230 = 0;
        this.field1234 = new int[32768];
        this.field1231 = new int[32768];
        this.method2107((class455) null);
        this.field1226 = new int[32768];
        this.field1215 = new int[32768];
    }

    @ObfuscatedName("cf.v(I)V")
    public void method2101() {
        this.field1221 = null;
        this.field1218 = null;
        this.field1223 = null;
        this.field1220 = null;
        this.field1234 = null;
        this.field1231 = null;
        this.field1226 = null;
        this.field1215 = null;
        this.field1230 = 0;
        this.field1227 = 0;
    }

    @ObfuscatedName("cf.q(III)V")
    public void method2102(int arg0, int arg1) {
        if (this.field1226 == null) {
            this.method2103();
        }
        if (this.field1232 == 0) {
            this.field1232 = arg1;
        }
        int var3 = arg1 - this.field1232;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1232 = arg1;
        if (var3 > 0) {
            this.method2099(var3);
        }
        this.method2105(arg0);
    }

    @ObfuscatedName("cf.f(IB)V")
    public final void method2099(int arg0) {
        this.field1230 += arg0 * 128;
        if (this.field1230 > this.field1234.length) {
            this.field1230 -= this.field1234.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2107(this.field1224[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1226[var3 + var4] - this.field1234[this.field1230 + var3 & this.field1234.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1226[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1226[var11 + var12] = 255;
                } else {
                    this.field1226[var11 + var12] = 0;
                }
            }
        }
        if (this.field1236 > 0) {
            this.field1236 -= arg0 * 4;
        }
        if (this.field1225 > 0) {
            this.field1225 -= arg0 * 4;
        }
        if (this.field1236 == 0 && this.field1225 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1236 = 1024;
            }
            if (var14 == 1) {
                this.field1225 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1235[var15] = this.field1235[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1235[var16] = (int) (Math.sin((double) this.field1219 / 14.0D) * 16.0D + Math.sin((double) this.field1219 / 15.0D) * 14.0D + Math.sin((double) this.field1219 / 16.0D) * 12.0D);
            this.field1219++;
        }
        this.field1227 += arg0;
        int var17 = ((client.field552 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1227 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1226[(var23 << 7) + var22] = 192;
        }
        this.field1227 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1226[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1226[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1215[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1215[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1215[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1226[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cf.j(IIII)I")
    public final int method2104(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("cf.e(IB)V")
    public final void method2105(int arg0) {
        int var2 = this.field1220.length;
        if (this.field1236 > 0) {
            this.method2116(this.field1236, this.field1218);
        } else if (this.field1225 > 0) {
            this.method2116(this.field1225, this.field1223);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1220[var3] = this.field1221[var3];
            }
        }
        this.method2106(arg0);
    }

    @ObfuscatedName("cf.g(I[II)V")
    public final void method2116(int arg0, int[] arg1) {
        int var3 = this.field1220.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1220[var4] = this.method2104(this.field1221[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1220[var4] = arg1[var4];
            } else {
                this.field1220[var4] = this.method2104(arg1[var4], this.field1221[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("cf.w(IB)V")
    public final void method2106(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1235[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field458.field4776) {
                var7 = Statics.field458.field4776 - var5;
            }
            int var8 = Statics.field458.field4776 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1226[var9++];
                int var12 = var8 % Statics.field4773;
                if (var11 == 0 || var12 < class452.field4768 || var12 >= class452.field4774) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1220[var11];
                    int var16 = Statics.field458.field4778[var8];
                    Statics.field458.field4778[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("cf.y(Lqu;I)V")
    public final void method2107(class455 arg0) {
        for (int var2 = 0; var2 < this.field1234.length; var2++) {
            this.field1234[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1234[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1231[var8] = (this.field1234[var8 - 1] + this.field1234[var8 + 1] + this.field1234[var8 - 128] + this.field1234[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1234;
            this.field1234 = this.field1231;
            this.field1231 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field4790; var11++) {
            for (int var12 = 0; var12 < arg0.field4789; var12++) {
                if (arg0.field4793[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field4788;
                    int var14 = var11 + 16 + arg0.field4791;
                    int var15 = (var14 << 7) + var13;
                    this.field1234[var15] = 0;
                }
            }
        }
    }
}
