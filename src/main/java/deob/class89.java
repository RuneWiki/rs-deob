package deob;

@ObfuscatedName("co")
public class class89 {

    @ObfuscatedName("co.v")
    public class450[] field1194;

    @ObfuscatedName("co.s")
    public int[] field1197 = new int[256];

    @ObfuscatedName("co.l")
    public int field1198 = 0;

    @ObfuscatedName("co.q")
    public int[] field1207;

    @ObfuscatedName("co.o")
    public int[] field1200;

    @ObfuscatedName("co.r")
    public int[] field1201;

    @ObfuscatedName("co.p")
    public int[] field1208;

    @ObfuscatedName("co.w")
    public int field1203 = 0;

    @ObfuscatedName("co.k")
    public int field1202 = 0;

    @ObfuscatedName("co.d")
    public int[] field1205;

    @ObfuscatedName("co.m")
    public int[] field1199;

    @ObfuscatedName("co.u")
    public int[] field1206;

    @ObfuscatedName("co.t")
    public int[] field1192;

    @ObfuscatedName("co.g")
    public int field1209 = 0;

    @ObfuscatedName("co.x")
    public int field1210 = 0;

    @ObfuscatedName("co.a")
    public int field1211 = 0;

    public class89(class450[] arg0) {
        this.field1194 = arg0;
        this.method2088();
    }

    @ObfuscatedName("co.v(I)V")
    public void method2088() {
        this.field1200 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1200[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1200[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1200[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1200[var4 + 192] = 16777215;
        }
        this.field1201 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1201[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1201[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1201[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1201[var8 + 192] = 16777215;
        }
        this.field1208 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1208[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1208[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1208[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1208[var12 + 192] = 16777215;
        }
        this.field1207 = new int[256];
        this.field1209 = 0;
        this.field1206 = new int[32768];
        this.field1192 = new int[32768];
        this.method2096((class450) null);
        this.field1205 = new int[32768];
        this.field1199 = new int[32768];
    }

    @ObfuscatedName("co.c(I)V")
    public void method2089() {
        this.field1200 = null;
        this.field1201 = null;
        this.field1208 = null;
        this.field1207 = null;
        this.field1206 = null;
        this.field1192 = null;
        this.field1205 = null;
        this.field1199 = null;
        this.field1209 = 0;
        this.field1210 = 0;
    }

    @ObfuscatedName("co.i(III)V")
    public void method2105(int arg0, int arg1) {
        if (this.field1205 == null) {
            this.method2088();
        }
        if (this.field1211 == 0) {
            this.field1211 = arg1;
        }
        int var3 = arg1 - this.field1211;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1211 = arg1;
        if (var3 > 0) {
            this.method2091(var3);
        }
        this.method2118(arg0);
    }

    @ObfuscatedName("co.f(IB)V")
    public final void method2091(int arg0) {
        this.field1209 += arg0 * 128;
        if (this.field1209 > this.field1206.length) {
            this.field1209 -= this.field1206.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2096(this.field1194[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1205[var3 + var4] - this.field1206[this.field1209 + var3 & this.field1206.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1205[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1205[var11 + var12] = 255;
                } else {
                    this.field1205[var11 + var12] = 0;
                }
            }
        }
        if (this.field1203 > 0) {
            this.field1203 -= arg0 * 4;
        }
        if (this.field1202 > 0) {
            this.field1202 -= arg0 * 4;
        }
        if (this.field1203 == 0 && this.field1202 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1203 = 1024;
            }
            if (var14 == 1) {
                this.field1202 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1197[var15] = this.field1197[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1197[var16] = (int) (Math.sin((double) this.field1198 / 14.0D) * 16.0D + Math.sin((double) this.field1198 / 15.0D) * 14.0D + Math.sin((double) this.field1198 / 16.0D) * 12.0D);
            this.field1198++;
        }
        this.field1210 += arg0;
        int var17 = ((client.field507 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1210 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1205[(var23 << 7) + var22] = 192;
        }
        this.field1210 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1205[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1205[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1199[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1199[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1199[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1205[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("co.b(IIII)I")
    public final int method2092(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("co.n(IB)V")
    public final void method2118(int arg0) {
        int var2 = this.field1207.length;
        if (this.field1203 > 0) {
            this.method2094(this.field1203, this.field1201);
        } else if (this.field1202 > 0) {
            this.method2094(this.field1202, this.field1208);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1207[var3] = this.field1200[var3];
            }
        }
        this.method2095(arg0);
    }

    @ObfuscatedName("co.s(I[II)V")
    public final void method2094(int arg0, int[] arg1) {
        int var3 = this.field1207.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1207[var4] = this.method2092(this.field1200[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1207[var4] = arg1[var4];
            } else {
                this.field1207[var4] = this.method2092(arg1[var4], this.field1200[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("co.l(II)V")
    public final void method2095(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1197[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field4530.field4694) {
                var7 = Statics.field4530.field4694 - var5;
            }
            int var8 = Statics.field4530.field4694 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1205[var9++];
                int var12 = var8 % Statics.field4689;
                if (var11 == 0 || var12 < class447.field4690 || var12 >= class447.field4691) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1207[var11];
                    int var16 = Statics.field4530.field4693[var8];
                    Statics.field4530.field4693[var8++] = 0xFF000000 | ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) + ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("co.q(Lqq;B)V")
    public final void method2096(class450 arg0) {
        for (int var2 = 0; var2 < this.field1206.length; var2++) {
            this.field1206[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1206[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1192[var8] = (this.field1206[var8 - 1] + this.field1206[var8 + 1] + this.field1206[var8 - 128] + this.field1206[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1206;
            this.field1206 = this.field1192;
            this.field1192 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field4704; var11++) {
            for (int var12 = 0; var12 < arg0.field4703; var12++) {
                if (arg0.field4708[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field4705;
                    int var14 = var11 + 16 + arg0.field4706;
                    int var15 = (var14 << 7) + var13;
                    this.field1206[var15] = 0;
                }
            }
        }
    }
}
