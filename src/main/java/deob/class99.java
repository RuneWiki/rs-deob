package deob;

@ObfuscatedName("dh")
public class class99 {

    @ObfuscatedName("dh.az")
    public class548[] field1298;

    @ObfuscatedName("dh.ab")
    public int[] field1289 = new int[256];

    @ObfuscatedName("dh.aw")
    public int field1290 = 0;

    @ObfuscatedName("dh.ad")
    public int[] field1291;

    @ObfuscatedName("dh.al")
    public int[] field1292;

    @ObfuscatedName("dh.as")
    public int[] field1293;

    @ObfuscatedName("dh.ag")
    public int[] field1287;

    @ObfuscatedName("dh.ai")
    public int field1302 = 0;

    @ObfuscatedName("dh.ax")
    public int field1284 = 0;

    @ObfuscatedName("dh.ar")
    public int[] field1295;

    @ObfuscatedName("dh.aj")
    public int[] field1301;

    @ObfuscatedName("dh.au")
    public int[] field1299;

    @ObfuscatedName("dh.ay")
    public int[] field1300;

    @ObfuscatedName("dh.ap")
    public int field1294 = 0;

    @ObfuscatedName("dh.av")
    public int field1296 = 0;

    @ObfuscatedName("dh.aa")
    public int field1303 = 0;

    public class99(class548[] arg0) {
        this.field1298 = arg0;
        this.method2341();
    }

    @ObfuscatedName("dh.az(I)V")
    public void method2341() {
        this.field1292 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1292[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1292[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1292[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1292[var4 + 192] = 16777215;
        }
        this.field1293 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1293[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1293[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1293[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1293[var8 + 192] = 16777215;
        }
        this.field1287 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1287[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1287[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1287[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1287[var12 + 192] = 16777215;
        }
        this.field1291 = new int[256];
        this.field1294 = 0;
        this.field1299 = new int[32768];
        this.field1300 = new int[32768];
        this.method2328((class548) null);
        this.field1295 = new int[32768];
        this.field1301 = new int[32768];
    }

    @ObfuscatedName("dh.ah(S)V")
    public void method2321() {
        this.field1292 = null;
        this.field1293 = null;
        this.field1287 = null;
        this.field1291 = null;
        this.field1299 = null;
        this.field1300 = null;
        this.field1295 = null;
        this.field1301 = null;
        this.field1294 = 0;
        this.field1296 = 0;
    }

    @ObfuscatedName("dh.af(III)V")
    public void method2323(int arg0, int arg1) {
        if (this.field1295 == null) {
            this.method2341();
        }
        if (this.field1303 == 0) {
            this.field1303 = arg1;
        }
        int var3 = arg1 - this.field1303;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1303 = arg1;
        if (var3 > 0) {
            this.method2322(var3);
        }
        this.method2325(arg0);
    }

    @ObfuscatedName("dh.at(IB)V")
    public final void method2322(int arg0) {
        this.field1294 += arg0 * 128;
        if (this.field1294 > this.field1299.length) {
            this.field1294 -= this.field1299.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2328(this.field1298[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1295[var3 + var4] - this.field1299[this.field1294 + var3 & this.field1299.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1295[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1295[var11 + var12] = 255;
                } else {
                    this.field1295[var11 + var12] = 0;
                }
            }
        }
        if (this.field1302 > 0) {
            this.field1302 -= arg0 * 4;
        }
        if (this.field1284 > 0) {
            this.field1284 -= arg0 * 4;
        }
        if (this.field1302 == 0 && this.field1284 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1302 = 1024;
            }
            if (var14 == 1) {
                this.field1284 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1289[var15] = this.field1289[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1289[var16] = (int) (Math.sin((double) this.field1290 / 14.0D) * 16.0D + Math.sin((double) this.field1290 / 15.0D) * 14.0D + Math.sin((double) this.field1290 / 16.0D) * 12.0D);
            this.field1290++;
        }
        this.field1296 += arg0;
        int var17 = ((client.field523 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1296 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1295[(var23 << 7) + var22] = 192;
        }
        this.field1296 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1295[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1295[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1301[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1301[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1301[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1295[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dh.an(IIII)I")
    public final int method2324(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("dh.ao(IB)V")
    public final void method2325(int arg0) {
        int var2 = this.field1291.length;
        if (this.field1302 > 0) {
            this.method2320(this.field1302, this.field1293);
        } else if (this.field1284 > 0) {
            this.method2320(this.field1284, this.field1287);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1291[var3] = this.field1292[var3];
            }
        }
        this.method2326(arg0);
    }

    @ObfuscatedName("dh.ab(I[II)V")
    public final void method2320(int arg0, int[] arg1) {
        int var3 = this.field1291.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1291[var4] = this.method2324(this.field1292[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1291[var4] = arg1[var4];
            } else {
                this.field1291[var4] = this.method2324(arg1[var4], this.field1292[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("dh.aw(II)V")
    public final void method2326(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1289[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field1496.field5312) {
                var7 = Statics.field1496.field5312 - var5;
            }
            int var8 = Statics.field1496.field5312 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1295[var9++];
                int var12 = var8 % Statics.field5303;
                if (var11 == 0 || var12 < class545.field5309 || var12 >= class545.field5306) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1291[var11];
                    int var16 = Statics.field1496.field5314[var8];
                    Statics.field1496.field5314[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("dh.ad(Lvl;S)V")
    public final void method2328(class548 arg0) {
        for (int var2 = 0; var2 < this.field1299.length; var2++) {
            this.field1299[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1299[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1300[var8] = (this.field1299[var8 - 1] + this.field1299[var8 + 1] + this.field1299[var8 - 128] + this.field1299[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1299;
            this.field1299 = this.field1300;
            this.field1300 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field5324; var11++) {
            for (int var12 = 0; var12 < arg0.field5321; var12++) {
                if (arg0.field5328[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field5325;
                    int var14 = var11 + 16 + arg0.field5323;
                    int var15 = (var14 << 7) + var13;
                    this.field1299[var15] = 0;
                }
            }
        }
    }
}
