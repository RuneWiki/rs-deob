package deob;

@ObfuscatedName("dz")
public class class98 {

    @ObfuscatedName("dz.at")
    public class540[] field1262;

    @ObfuscatedName("dz.aa")
    public int[] field1261 = new int[256];

    @ObfuscatedName("dz.ac")
    public int field1260 = 0;

    @ObfuscatedName("dz.al")
    public int[] field1259;

    @ObfuscatedName("dz.az")
    public int[] field1264;

    @ObfuscatedName("dz.ap")
    public int[] field1265;

    @ObfuscatedName("dz.av")
    public int[] field1269;

    @ObfuscatedName("dz.ax")
    public int field1267 = 0;

    @ObfuscatedName("dz.as")
    public int field1268 = 0;

    @ObfuscatedName("dz.ay")
    public int[] field1257;

    @ObfuscatedName("dz.ak")
    public int[] field1270;

    @ObfuscatedName("dz.aj")
    public int[] field1271;

    @ObfuscatedName("dz.am")
    public int[] field1272;

    @ObfuscatedName("dz.aq")
    public int field1273 = 0;

    @ObfuscatedName("dz.ai")
    public int field1274 = 0;

    @ObfuscatedName("dz.aw")
    public int field1275 = 0;

    public class98(class540[] arg0) {
        this.field1262 = arg0;
        this.method2375();
    }

    @ObfuscatedName("dz.at(B)V")
    public void method2375() {
        this.field1264 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1264[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1264[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1264[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1264[var4 + 192] = 16777215;
        }
        this.field1265 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1265[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1265[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1265[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1265[var8 + 192] = 16777215;
        }
        this.field1269 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1269[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1269[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1269[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1269[var12 + 192] = 16777215;
        }
        this.field1259 = new int[256];
        this.field1273 = 0;
        this.field1271 = new int[32768];
        this.field1272 = new int[32768];
        this.method2383((class540) null);
        this.field1257 = new int[32768];
        this.field1270 = new int[32768];
    }

    @ObfuscatedName("dz.ah(I)V")
    public void method2378() {
        this.field1264 = null;
        this.field1265 = null;
        this.field1269 = null;
        this.field1259 = null;
        this.field1271 = null;
        this.field1272 = null;
        this.field1257 = null;
        this.field1270 = null;
        this.field1273 = 0;
        this.field1274 = 0;
    }

    @ObfuscatedName("dz.ar(III)V")
    public void method2377(int arg0, int arg1) {
        if (this.field1257 == null) {
            this.method2375();
        }
        if (this.field1275 == 0) {
            this.field1275 = arg1;
        }
        int var3 = arg1 - this.field1275;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1275 = arg1;
        if (var3 > 0) {
            this.method2391(var3);
        }
        this.method2380(arg0);
    }

    @ObfuscatedName("dz.ao(IB)V")
    public final void method2391(int arg0) {
        this.field1273 += arg0 * 128;
        if (this.field1273 > this.field1271.length) {
            this.field1273 -= this.field1271.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2383(this.field1262[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1257[var3 + var4] - this.field1271[this.field1273 + var3 & this.field1271.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1257[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1257[var11 + var12] = 255;
                } else {
                    this.field1257[var11 + var12] = 0;
                }
            }
        }
        if (this.field1267 > 0) {
            this.field1267 -= arg0 * 4;
        }
        if (this.field1268 > 0) {
            this.field1268 -= arg0 * 4;
        }
        if (this.field1267 == 0 && this.field1268 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1267 = 1024;
            }
            if (var14 == 1) {
                this.field1268 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1261[var15] = this.field1261[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1261[var16] = (int) (Math.sin((double) this.field1260 / 14.0D) * 16.0D + Math.sin((double) this.field1260 / 15.0D) * 14.0D + Math.sin((double) this.field1260 / 16.0D) * 12.0D);
            this.field1260++;
        }
        this.field1274 += arg0;
        int var17 = ((client.field500 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1274 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1257[(var23 << 7) + var22] = 192;
        }
        this.field1274 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1257[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1257[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1270[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1270[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1270[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1257[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dz.ab(IIII)I")
    public final int method2379(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("dz.au(II)V")
    public final void method2380(int arg0) {
        int var2 = this.field1259.length;
        if (this.field1267 > 0) {
            this.method2381(this.field1267, this.field1265);
        } else if (this.field1268 > 0) {
            this.method2381(this.field1268, this.field1269);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1259[var3] = this.field1264[var3];
            }
        }
        this.method2405(arg0);
    }

    @ObfuscatedName("dz.aa(I[II)V")
    public final void method2381(int arg0, int[] arg1) {
        int var3 = this.field1259.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1259[var4] = this.method2379(this.field1264[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1259[var4] = arg1[var4];
            } else {
                this.field1259[var4] = this.method2379(arg1[var4], this.field1264[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("dz.ac(II)V")
    public final void method2405(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1261[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field3588.field5217) {
                var7 = Statics.field3588.field5217 - var5;
            }
            int var8 = Statics.field3588.field5217 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1257[var9++];
                int var12 = var8 % Statics.field5208;
                if (var11 == 0 || var12 < class537.field5214 || var12 >= class537.field5211) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1259[var11];
                    int var16 = Statics.field3588.field5219[var8];
                    Statics.field3588.field5219[var8++] = 0xFF000000 | ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) + ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("dz.al(Lup;I)V")
    public final void method2383(class540 arg0) {
        for (int var2 = 0; var2 < this.field1271.length; var2++) {
            this.field1271[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1271[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1272[var8] = (this.field1271[var8 - 1] + this.field1271[var8 + 1] + this.field1271[var8 - 128] + this.field1271[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1271;
            this.field1271 = this.field1272;
            this.field1272 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field5230; var11++) {
            for (int var12 = 0; var12 < arg0.field5229; var12++) {
                if (arg0.field5232[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field5231;
                    int var14 = var11 + 16 + arg0.field5233;
                    int var15 = (var14 << 7) + var13;
                    this.field1271[var15] = 0;
                }
            }
        }
    }
}
