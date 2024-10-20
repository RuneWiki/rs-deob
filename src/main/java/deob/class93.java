package deob;

@ObfuscatedName("dp")
public class class93 {

    @ObfuscatedName("dp.af")
    public class502[] field1225;

    @ObfuscatedName("dp.aq")
    public int[] field1227 = new int[256];

    @ObfuscatedName("dp.al")
    public int field1228 = 0;

    @ObfuscatedName("dp.at")
    public int[] field1229;

    @ObfuscatedName("dp.aa")
    public int[] field1243;

    @ObfuscatedName("dp.ay")
    public int[] field1231;

    @ObfuscatedName("dp.ao")
    public int[] field1222;

    @ObfuscatedName("dp.ax")
    public int field1246 = 0;

    @ObfuscatedName("dp.ai")
    public int field1234 = 0;

    @ObfuscatedName("dp.ag")
    public int[] field1235;

    @ObfuscatedName("dp.ah")
    public int[] field1230;

    @ObfuscatedName("dp.av")
    public int[] field1237;

    @ObfuscatedName("dp.ar")
    public int[] field1232;

    @ObfuscatedName("dp.am")
    public int field1241 = 0;

    @ObfuscatedName("dp.as")
    public int field1240 = 0;

    @ObfuscatedName("dp.aj")
    public int field1238 = 0;

    public class93(class502[] arg0) {
        this.field1225 = arg0;
        this.method2287();
    }

    @ObfuscatedName("dp.af(I)V")
    public void method2287() {
        this.field1243 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1243[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1243[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1243[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1243[var4 + 192] = 16777215;
        }
        this.field1231 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1231[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1231[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1231[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1231[var8 + 192] = 16777215;
        }
        this.field1222 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1222[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1222[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1222[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1222[var12 + 192] = 16777215;
        }
        this.field1229 = new int[256];
        this.field1241 = 0;
        this.field1237 = new int[32768];
        this.field1232 = new int[32768];
        this.method2296((class502) null);
        this.field1235 = new int[32768];
        this.field1230 = new int[32768];
    }

    @ObfuscatedName("dp.an(I)V")
    public void method2320() {
        this.field1243 = null;
        this.field1231 = null;
        this.field1222 = null;
        this.field1229 = null;
        this.field1237 = null;
        this.field1232 = null;
        this.field1235 = null;
        this.field1230 = null;
        this.field1241 = 0;
        this.field1240 = 0;
    }

    @ObfuscatedName("dp.aw(III)V")
    public void method2290(int arg0, int arg1) {
        if (this.field1235 == null) {
            this.method2287();
        }
        if (this.field1238 == 0) {
            this.field1238 = arg1;
        }
        int var3 = arg1 - this.field1238;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1238 = arg1;
        if (var3 > 0) {
            this.method2294(var3);
        }
        this.method2293(arg0);
    }

    @ObfuscatedName("dp.ac(II)V")
    public final void method2294(int arg0) {
        this.field1241 += arg0 * 128;
        if (this.field1241 > this.field1237.length) {
            this.field1241 -= this.field1237.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2296(this.field1225[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1235[var3 + var4] - this.field1237[this.field1241 + var3 & this.field1237.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1235[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1235[var11 + var12] = 255;
                } else {
                    this.field1235[var11 + var12] = 0;
                }
            }
        }
        if (this.field1246 > 0) {
            this.field1246 -= arg0 * 4;
        }
        if (this.field1234 > 0) {
            this.field1234 -= arg0 * 4;
        }
        if (this.field1246 == 0 && this.field1234 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1246 = 1024;
            }
            if (var14 == 1) {
                this.field1234 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1227[var15] = this.field1227[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1227[var16] = (int) (Math.sin((double) this.field1228 / 14.0D) * 16.0D + Math.sin((double) this.field1228 / 15.0D) * 14.0D + Math.sin((double) this.field1228 / 16.0D) * 12.0D);
            this.field1228++;
        }
        this.field1240 += arg0;
        int var17 = ((client.field602 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1240 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1235[(var23 << 7) + var22] = 192;
        }
        this.field1240 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1235[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1235[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1230[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1230[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1230[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1235[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dp.au(IIII)I")
    public final int method2288(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("dp.ab(IB)V")
    public final void method2293(int arg0) {
        int var2 = this.field1229.length;
        if (this.field1246 > 0) {
            this.method2298(this.field1246, this.field1231);
        } else if (this.field1234 > 0) {
            this.method2298(this.field1234, this.field1222);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1229[var3] = this.field1243[var3];
            }
        }
        this.method2295(arg0);
    }

    @ObfuscatedName("dp.aq(I[II)V")
    public final void method2298(int arg0, int[] arg1) {
        int var3 = this.field1229.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1229[var4] = this.method2288(this.field1243[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1229[var4] = arg1[var4];
            } else {
                this.field1229[var4] = this.method2288(arg1[var4], this.field1243[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("dp.al(IS)V")
    public final void method2295(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1227[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field2381.field5069) {
                var7 = Statics.field2381.field5069 - var5;
            }
            int var8 = Statics.field2381.field5069 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1235[var9++];
                int var12 = var8 % Statics.field5061;
                if (var11 == 0 || var12 < class499.field5064 || var12 >= class499.field5068) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1229[var11];
                    int var16 = Statics.field2381.field5070[var8];
                    Statics.field2381.field5070[var8++] = 0xFF000000 | ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) + ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("dp.at(Ltc;I)V")
    public final void method2296(class502 arg0) {
        for (int var2 = 0; var2 < this.field1237.length; var2++) {
            this.field1237[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1237[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1232[var8] = (this.field1237[var8 - 1] + this.field1237[var8 + 1] + this.field1237[var8 - 128] + this.field1237[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1237;
            this.field1237 = this.field1232;
            this.field1232 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field5082; var11++) {
            for (int var12 = 0; var12 < arg0.field5081; var12++) {
                if (arg0.field5083[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field5086;
                    int var14 = var11 + 16 + arg0.field5084;
                    int var15 = (var14 << 7) + var13;
                    this.field1237[var15] = 0;
                }
            }
        }
    }
}
