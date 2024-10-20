package deob;

@ObfuscatedName("cc")
public class class87 {

    @ObfuscatedName("cc.c")
    public class433[] field1210;

    @ObfuscatedName("cc.i")
    public int[] field1194 = new int[256];

    @ObfuscatedName("cc.w")
    public int field1195 = 0;

    @ObfuscatedName("cc.v")
    public int[] field1196;

    @ObfuscatedName("cc.a")
    public int[] field1197;

    @ObfuscatedName("cc.y")
    public int[] field1192;

    @ObfuscatedName("cc.u")
    public int[] field1209;

    @ObfuscatedName("cc.h")
    public int field1199 = 0;

    @ObfuscatedName("cc.q")
    public int field1198 = 0;

    @ObfuscatedName("cc.x")
    public int[] field1202;

    @ObfuscatedName("cc.p")
    public int[] field1203;

    @ObfuscatedName("cc.n")
    public int[] field1204;

    @ObfuscatedName("cc.m")
    public int[] field1205;

    @ObfuscatedName("cc.d")
    public int field1206 = 0;

    @ObfuscatedName("cc.j")
    public int field1207 = 0;

    @ObfuscatedName("cc.f")
    public int field1190 = 0;

    public class87(class433[] arg0) {
        this.field1210 = arg0;
        this.method2075();
    }

    @ObfuscatedName("cc.c(I)V")
    public void method2075() {
        this.field1197 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1197[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1197[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1197[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1197[var4 + 192] = 16777215;
        }
        this.field1192 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1192[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1192[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1192[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1192[var8 + 192] = 16777215;
        }
        this.field1209 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1209[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1209[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1209[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1209[var12 + 192] = 16777215;
        }
        this.field1196 = new int[256];
        this.field1206 = 0;
        this.field1204 = new int[32768];
        this.field1205 = new int[32768];
        this.method2095((class433) null);
        this.field1202 = new int[32768];
        this.field1203 = new int[32768];
    }

    @ObfuscatedName("cc.l(I)V")
    public void method2099() {
        this.field1197 = null;
        this.field1192 = null;
        this.field1209 = null;
        this.field1196 = null;
        this.field1204 = null;
        this.field1205 = null;
        this.field1202 = null;
        this.field1203 = null;
        this.field1206 = 0;
        this.field1207 = 0;
    }

    @ObfuscatedName("cc.s(IIB)V")
    public void method2077(int arg0, int arg1) {
        if (this.field1202 == null) {
            this.method2075();
        }
        if (this.field1190 == 0) {
            this.field1190 = arg1;
        }
        int var3 = arg1 - this.field1190;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1190 = arg1;
        if (var3 > 0) {
            this.method2078(var3);
        }
        this.method2100(arg0);
    }

    @ObfuscatedName("cc.e(IB)V")
    public final void method2078(int arg0) {
        this.field1206 += arg0 * 128;
        if (this.field1206 > this.field1204.length) {
            this.field1206 -= this.field1204.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2095(this.field1210[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1202[var3 + var4] - this.field1204[this.field1206 + var3 & this.field1204.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1202[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1202[var11 + var12] = 255;
                } else {
                    this.field1202[var11 + var12] = 0;
                }
            }
        }
        if (this.field1199 > 0) {
            this.field1199 -= arg0 * 4;
        }
        if (this.field1198 > 0) {
            this.field1198 -= arg0 * 4;
        }
        if (this.field1199 == 0 && this.field1198 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1199 = 1024;
            }
            if (var14 == 1) {
                this.field1198 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1194[var15] = this.field1194[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1194[var16] = (int) (Math.sin((double) this.field1195 / 14.0D) * 16.0D + Math.sin((double) this.field1195 / 15.0D) * 14.0D + Math.sin((double) this.field1195 / 16.0D) * 12.0D);
            this.field1195++;
        }
        this.field1207 += arg0;
        int var17 = ((client.field682 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1207 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1202[(var23 << 7) + var22] = 192;
        }
        this.field1207 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1202[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1202[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1203[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1203[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1203[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1202[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cc.r(IIII)I")
    public final int method2079(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("cc.o(II)V")
    public final void method2100(int arg0) {
        int var2 = this.field1196.length;
        if (this.field1199 > 0) {
            this.method2097(this.field1199, this.field1192);
        } else if (this.field1198 > 0) {
            this.method2097(this.field1198, this.field1209);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1196[var3] = this.field1197[var3];
            }
        }
        this.method2083(arg0);
    }

    @ObfuscatedName("cc.i(I[II)V")
    public final void method2097(int arg0, int[] arg1) {
        int var3 = this.field1196.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1196[var4] = this.method2079(this.field1197[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1196[var4] = arg1[var4];
            } else {
                this.field1196[var4] = this.method2079(arg1[var4], this.field1197[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("cc.w(IB)V")
    public final void method2083(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1194[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field309.field4585) {
                var7 = Statics.field309.field4585 - var5;
            }
            int var8 = Statics.field309.field4585 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1202[var9++];
                int var12 = var8 % Statics.field4579;
                if (var11 == 0 || var12 < class430.field4583 || var12 >= class430.field4584) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1196[var11];
                    int var16 = Statics.field309.field4587[var8];
                    Statics.field309.field4587[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("cc.v(Lpg;I)V")
    public final void method2095(class433 arg0) {
        for (int var2 = 0; var2 < this.field1204.length; var2++) {
            this.field1204[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1204[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1205[var8] = (this.field1204[var8 - 1] + this.field1204[var8 + 1] + this.field1204[var8 - 128] + this.field1204[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1204;
            this.field1204 = this.field1205;
            this.field1205 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field4600; var11++) {
            for (int var12 = 0; var12 < arg0.field4595; var12++) {
                if (arg0.field4596[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field4597;
                    int var14 = var11 + 16 + arg0.field4598;
                    int var15 = (var14 << 7) + var13;
                    this.field1204[var15] = 0;
                }
            }
        }
    }
}
