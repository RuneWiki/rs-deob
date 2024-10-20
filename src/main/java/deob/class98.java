package deob;

@ObfuscatedName("dx")
public class class98 {

    @ObfuscatedName("dx.am")
    public class544[] field1271;

    @ObfuscatedName("dx.ag")
    public int[] field1260 = new int[256];

    @ObfuscatedName("dx.ao")
    public int field1256 = 0;

    @ObfuscatedName("dx.ae")
    public int[] field1262;

    @ObfuscatedName("dx.aa")
    public int[] field1263;

    @ObfuscatedName("dx.au")
    public int[] field1264;

    @ObfuscatedName("dx.an")
    public int[] field1265;

    @ObfuscatedName("dx.ad")
    public int field1270 = 0;

    @ObfuscatedName("dx.ax")
    public int field1267 = 0;

    @ObfuscatedName("dx.aw")
    public int[] field1268;

    @ObfuscatedName("dx.az")
    public int[] field1269;

    @ObfuscatedName("dx.av")
    public int[] field1272;

    @ObfuscatedName("dx.ak")
    public int[] field1259;

    @ObfuscatedName("dx.ay")
    public int field1266 = 0;

    @ObfuscatedName("dx.as")
    public int field1257 = 0;

    @ObfuscatedName("dx.ab")
    public int field1274 = 0;

    public class98(class544[] arg0) {
        this.field1271 = arg0;
        this.method2398();
    }

    @ObfuscatedName("dx.am(I)V")
    public void method2398() {
        this.field1263 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1263[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1263[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1263[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1263[var4 + 192] = 16777215;
        }
        this.field1264 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1264[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1264[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1264[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1264[var8 + 192] = 16777215;
        }
        this.field1265 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1265[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1265[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1265[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1265[var12 + 192] = 16777215;
        }
        this.field1262 = new int[256];
        this.field1266 = 0;
        this.field1272 = new int[32768];
        this.field1259 = new int[32768];
        this.method2416((class544) null);
        this.field1268 = new int[32768];
        this.field1269 = new int[32768];
    }

    @ObfuscatedName("dx.ap(I)V")
    public void method2408() {
        this.field1263 = null;
        this.field1264 = null;
        this.field1265 = null;
        this.field1262 = null;
        this.field1272 = null;
        this.field1259 = null;
        this.field1268 = null;
        this.field1269 = null;
        this.field1266 = 0;
        this.field1257 = 0;
    }

    @ObfuscatedName("dx.af(III)V")
    public void method2407(int arg0, int arg1) {
        if (this.field1268 == null) {
            this.method2398();
        }
        if (this.field1274 == 0) {
            this.field1274 = arg1;
        }
        int var3 = arg1 - this.field1274;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1274 = arg1;
        if (var3 > 0) {
            this.method2401(var3);
        }
        this.method2403(arg0);
    }

    @ObfuscatedName("dx.aj(II)V")
    public final void method2401(int arg0) {
        this.field1266 += arg0 * 128;
        if (this.field1266 > this.field1272.length) {
            this.field1266 -= this.field1272.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2416(this.field1271[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1268[var3 + var4] - this.field1272[this.field1266 + var3 & this.field1272.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1268[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1268[var11 + var12] = 255;
                } else {
                    this.field1268[var11 + var12] = 0;
                }
            }
        }
        if (this.field1270 > 0) {
            this.field1270 -= arg0 * 4;
        }
        if (this.field1267 > 0) {
            this.field1267 -= arg0 * 4;
        }
        if (this.field1270 == 0 && this.field1267 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1270 = 1024;
            }
            if (var14 == 1) {
                this.field1267 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1260[var15] = this.field1260[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1260[var16] = (int) (Math.sin((double) this.field1256 / 14.0D) * 16.0D + Math.sin((double) this.field1256 / 15.0D) * 14.0D + Math.sin((double) this.field1256 / 16.0D) * 12.0D);
            this.field1256++;
        }
        this.field1257 += arg0;
        int var17 = ((client.field677 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1257 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1268[(var23 << 7) + var22] = 192;
        }
        this.field1257 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1268[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1268[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1269[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1269[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1269[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1268[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dx.aq(IIII)I")
    public final int method2426(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("dx.ar(IB)V")
    public final void method2403(int arg0) {
        int var2 = this.field1262.length;
        if (this.field1270 > 0) {
            this.method2404(this.field1270, this.field1264);
        } else if (this.field1267 > 0) {
            this.method2404(this.field1267, this.field1265);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1262[var3] = this.field1263[var3];
            }
        }
        this.method2405(arg0);
    }

    @ObfuscatedName("dx.ag(I[II)V")
    public final void method2404(int arg0, int[] arg1) {
        int var3 = this.field1262.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1262[var4] = this.method2426(this.field1263[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1262[var4] = arg1[var4];
            } else {
                this.field1262[var4] = this.method2426(arg1[var4], this.field1263[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("dx.ao(II)V")
    public final void method2405(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1260[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field2556.field5259) {
                var7 = Statics.field2556.field5259 - var5;
            }
            int var8 = Statics.field2556.field5259 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1268[var9++];
                int var12 = var8 % Statics.field5249;
                if (var11 == 0 || var12 < class541.field5251 || var12 >= class541.field5256) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1262[var11];
                    int var16 = Statics.field2556.field5258[var8];
                    Statics.field2556.field5258[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("dx.ae(Lut;I)V")
    public final void method2416(class544 arg0) {
        for (int var2 = 0; var2 < this.field1272.length; var2++) {
            this.field1272[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1272[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1259[var8] = (this.field1272[var8 - 1] + this.field1272[var8 + 1] + this.field1272[var8 - 128] + this.field1272[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1272;
            this.field1272 = this.field1259;
            this.field1259 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field5270; var11++) {
            for (int var12 = 0; var12 < arg0.field5269; var12++) {
                if (arg0.field5267[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field5271;
                    int var14 = var11 + 16 + arg0.field5273;
                    int var15 = (var14 << 7) + var13;
                    this.field1272[var15] = 0;
                }
            }
        }
    }
}
