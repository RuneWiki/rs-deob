package deob;

@ObfuscatedName("de")
public class class99 {

    @ObfuscatedName("de.aq")
    public class547[] field1303;

    @ObfuscatedName("de.aa")
    public int[] field1294 = new int[256];

    @ObfuscatedName("de.az")
    public int field1295 = 0;

    @ObfuscatedName("de.ao")
    public int[] field1292;

    @ObfuscatedName("de.au")
    public int[] field1297;

    @ObfuscatedName("de.ak")
    public int[] field1302;

    @ObfuscatedName("de.ah")
    public int[] field1291;

    @ObfuscatedName("de.aj")
    public int field1298 = 0;

    @ObfuscatedName("de.af")
    public int field1301 = 0;

    @ObfuscatedName("de.ax")
    public int[] field1300;

    @ObfuscatedName("de.an")
    public int[] field1293;

    @ObfuscatedName("de.ag")
    public int[] field1304;

    @ObfuscatedName("de.am")
    public int[] field1305;

    @ObfuscatedName("de.ad")
    public int field1306 = 0;

    @ObfuscatedName("de.at")
    public int field1307 = 0;

    @ObfuscatedName("de.ay")
    public int field1299 = 0;

    public class99(class547[] arg0) {
        this.field1303 = arg0;
        this.method2380();
    }

    @ObfuscatedName("de.aq(I)V")
    public void method2380() {
        this.field1297 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1297[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1297[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1297[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1297[var4 + 192] = 16777215;
        }
        this.field1302 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1302[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1302[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1302[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1302[var8 + 192] = 16777215;
        }
        this.field1291 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1291[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1291[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1291[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1291[var12 + 192] = 16777215;
        }
        this.field1292 = new int[256];
        this.field1306 = 0;
        this.field1304 = new int[32768];
        this.field1305 = new int[32768];
        this.method2388((class547) null);
        this.field1300 = new int[32768];
        this.field1293 = new int[32768];
    }

    @ObfuscatedName("de.aw(B)V")
    public void method2397() {
        this.field1297 = null;
        this.field1302 = null;
        this.field1291 = null;
        this.field1292 = null;
        this.field1304 = null;
        this.field1305 = null;
        this.field1300 = null;
        this.field1293 = null;
        this.field1306 = 0;
        this.field1307 = 0;
    }

    @ObfuscatedName("de.al(III)V")
    public void method2396(int arg0, int arg1) {
        if (this.field1300 == null) {
            this.method2380();
        }
        if (this.field1299 == 0) {
            this.field1299 = arg1;
        }
        int var3 = arg1 - this.field1299;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1299 = arg1;
        if (var3 > 0) {
            this.method2382(var3);
        }
        this.method2385(arg0);
    }

    @ObfuscatedName("de.ai(IB)V")
    public final void method2382(int arg0) {
        this.field1306 += arg0 * 128;
        if (this.field1306 > this.field1304.length) {
            this.field1306 -= this.field1304.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2388(this.field1303[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1300[var3 + var4] - this.field1304[this.field1306 + var3 & this.field1304.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1300[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1300[var11 + var12] = 255;
                } else {
                    this.field1300[var11 + var12] = 0;
                }
            }
        }
        if (this.field1298 > 0) {
            this.field1298 -= arg0 * 4;
        }
        if (this.field1301 > 0) {
            this.field1301 -= arg0 * 4;
        }
        if (this.field1298 == 0 && this.field1301 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1298 = 1024;
            }
            if (var14 == 1) {
                this.field1301 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1294[var15] = this.field1294[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1294[var16] = (int) (Math.sin((double) this.field1295 / 14.0D) * 16.0D + Math.sin((double) this.field1295 / 15.0D) * 14.0D + Math.sin((double) this.field1295 / 16.0D) * 12.0D);
            this.field1295++;
        }
        this.field1307 += arg0;
        int var17 = ((client.field536 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1307 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1300[(var23 << 7) + var22] = 192;
        }
        this.field1307 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1300[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1300[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1293[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1293[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1293[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1300[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("de.ar(IIIB)I")
    public final int method2401(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("de.as(II)V")
    public final void method2385(int arg0) {
        int var2 = this.field1292.length;
        if (this.field1298 > 0) {
            this.method2386(this.field1298, this.field1302);
        } else if (this.field1301 > 0) {
            this.method2386(this.field1301, this.field1291);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1292[var3] = this.field1297[var3];
            }
        }
        this.method2387(arg0);
    }

    @ObfuscatedName("de.aa(I[II)V")
    public final void method2386(int arg0, int[] arg1) {
        int var3 = this.field1292.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1292[var4] = this.method2401(this.field1297[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1292[var4] = arg1[var4];
            } else {
                this.field1292[var4] = this.method2401(arg1[var4], this.field1297[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("de.az(II)V")
    public final void method2387(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1294[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field1455.field5279) {
                var7 = Statics.field1455.field5279 - var5;
            }
            int var8 = Statics.field1455.field5279 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1300[var9++];
                int var12 = var8 % Statics.field5271;
                if (var11 == 0 || var12 < class544.field5273 || var12 >= class544.field5278) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1292[var11];
                    int var16 = Statics.field1455.field5282[var8];
                    Statics.field1455.field5282[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("de.ao(Lvg;I)V")
    public final void method2388(class547 arg0) {
        for (int var2 = 0; var2 < this.field1304.length; var2++) {
            this.field1304[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1304[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1305[var8] = (this.field1304[var8 - 1] + this.field1304[var8 + 1] + this.field1304[var8 - 128] + this.field1304[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1304;
            this.field1304 = this.field1305;
            this.field1305 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field5295; var11++) {
            for (int var12 = 0; var12 < arg0.field5290; var12++) {
                if (arg0.field5288[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field5292;
                    int var14 = var11 + 16 + arg0.field5293;
                    int var15 = (var14 << 7) + var13;
                    this.field1304[var15] = 0;
                }
            }
        }
    }
}
