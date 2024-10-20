package deob;

@ObfuscatedName("cu")
public class class89 {

    @ObfuscatedName("cu.c")
    public class457[] field1228;

    @ObfuscatedName("cu.s")
    public int[] field1213 = new int[256];

    @ObfuscatedName("cu.q")
    public int field1217 = 0;

    @ObfuscatedName("cu.m")
    public int[] field1218;

    @ObfuscatedName("cu.x")
    public int[] field1219;

    @ObfuscatedName("cu.j")
    public int[] field1220;

    @ObfuscatedName("cu.v")
    public int[] field1221;

    @ObfuscatedName("cu.h")
    public int field1214 = 0;

    @ObfuscatedName("cu.t")
    public int field1223 = 0;

    @ObfuscatedName("cu.u")
    public int[] field1224;

    @ObfuscatedName("cu.d")
    public int[] field1225;

    @ObfuscatedName("cu.b")
    public int[] field1215;

    @ObfuscatedName("cu.a")
    public int[] field1216;

    @ObfuscatedName("cu.l")
    public int field1222 = 0;

    @ObfuscatedName("cu.e")
    public int field1229 = 0;

    @ObfuscatedName("cu.g")
    public int field1230 = 0;

    public class89(class457[] arg0) {
        this.field1228 = arg0;
        this.method2247();
    }

    @ObfuscatedName("cu.c(S)V")
    public void method2247() {
        this.field1219 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1219[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1219[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1219[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1219[var4 + 192] = 16777215;
        }
        this.field1220 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1220[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1220[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1220[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1220[var8 + 192] = 16777215;
        }
        this.field1221 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1221[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1221[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1221[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1221[var12 + 192] = 16777215;
        }
        this.field1218 = new int[256];
        this.field1222 = 0;
        this.field1215 = new int[32768];
        this.field1216 = new int[32768];
        this.method2249((class457) null);
        this.field1224 = new int[32768];
        this.field1225 = new int[32768];
    }

    @ObfuscatedName("cu.p(B)V")
    public void method2248() {
        this.field1219 = null;
        this.field1220 = null;
        this.field1221 = null;
        this.field1218 = null;
        this.field1215 = null;
        this.field1216 = null;
        this.field1224 = null;
        this.field1225 = null;
        this.field1222 = 0;
        this.field1229 = 0;
    }

    @ObfuscatedName("cu.f(III)V")
    public void method2246(int arg0, int arg1) {
        if (this.field1224 == null) {
            this.method2247();
        }
        if (this.field1230 == 0) {
            this.field1230 = arg1;
        }
        int var3 = arg1 - this.field1230;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1230 = arg1;
        if (var3 > 0) {
            this.method2250(var3);
        }
        this.method2274(arg0);
    }

    @ObfuscatedName("cu.n(IB)V")
    public final void method2250(int arg0) {
        this.field1222 += arg0 * 128;
        if (this.field1222 > this.field1215.length) {
            this.field1222 -= this.field1215.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method2249(this.field1228[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1224[var3 + var4] - this.field1215[this.field1222 + var3 & this.field1215.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1224[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1224[var11 + var12] = 255;
                } else {
                    this.field1224[var11 + var12] = 0;
                }
            }
        }
        if (this.field1214 > 0) {
            this.field1214 -= arg0 * 4;
        }
        if (this.field1223 > 0) {
            this.field1223 -= arg0 * 4;
        }
        if (this.field1214 == 0 && this.field1223 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1214 = 1024;
            }
            if (var14 == 1) {
                this.field1223 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1213[var15] = this.field1213[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1213[var16] = (int) (Math.sin((double) this.field1217 / 14.0D) * 16.0D + Math.sin((double) this.field1217 / 15.0D) * 14.0D + Math.sin((double) this.field1217 / 16.0D) * 12.0D);
            this.field1217++;
        }
        this.field1229 += arg0;
        int var17 = ((client.field504 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1229 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1224[(var23 << 7) + var22] = 192;
        }
        this.field1229 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1224[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1224[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1225[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1225[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1225[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1224[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cu.k(IIII)I")
    public final int method2251(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("cu.w(IB)V")
    public final void method2274(int arg0) {
        int var2 = this.field1218.length;
        if (this.field1214 > 0) {
            this.method2252(this.field1214, this.field1220);
        } else if (this.field1223 > 0) {
            this.method2252(this.field1223, this.field1221);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1218[var3] = this.field1219[var3];
            }
        }
        this.method2253(arg0);
    }

    @ObfuscatedName("cu.s(I[IB)V")
    public final void method2252(int arg0, int[] arg1) {
        int var3 = this.field1218.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1218[var4] = this.method2251(this.field1219[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1218[var4] = arg1[var4];
            } else {
                this.field1218[var4] = this.method2251(arg1[var4], this.field1219[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("cu.q(IB)V")
    public final void method2253(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1213[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field114.field4807) {
                var7 = Statics.field114.field4807 - var5;
            }
            int var8 = Statics.field114.field4807 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1224[var9++];
                int var12 = var8 % Statics.field4800;
                if (var11 == 0 || var12 < class454.field4799 || var12 >= class454.field4805) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1218[var11];
                    int var16 = Statics.field114.field4808[var8];
                    Statics.field114.field4808[var8++] = 0xFF000000 | ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("cu.m(Lqu;I)V")
    public final void method2249(class457 arg0) {
        for (int var2 = 0; var2 < this.field1215.length; var2++) {
            this.field1215[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1215[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1216[var8] = (this.field1215[var8 - 1] + this.field1215[var8 + 1] + this.field1215[var8 - 128] + this.field1215[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1215;
            this.field1215 = this.field1216;
            this.field1216 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field4819; var11++) {
            for (int var12 = 0; var12 < arg0.field4818; var12++) {
                if (arg0.field4821[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field4822;
                    int var14 = var11 + 16 + arg0.field4816;
                    int var15 = (var14 << 7) + var13;
                    this.field1215[var15] = 0;
                }
            }
        }
    }
}
