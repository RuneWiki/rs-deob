package deob;

@ObfuscatedName("ba")
public class class73 {

    @ObfuscatedName("ba.c")
    public class324[] field1020;

    @ObfuscatedName("ba.j")
    public int[] field1006 = new int[256];

    @ObfuscatedName("ba.v")
    public int field1007 = 0;

    @ObfuscatedName("ba.d")
    public int[] field1018;

    @ObfuscatedName("ba.z")
    public int[] field1009;

    @ObfuscatedName("ba.n")
    public int[] field1010;

    @ObfuscatedName("ba.h")
    public int[] field1005;

    @ObfuscatedName("ba.f")
    public int field1012 = 0;

    @ObfuscatedName("ba.s")
    public int field1013 = 0;

    @ObfuscatedName("ba.p")
    public int[] field1011;

    @ObfuscatedName("ba.e")
    public int[] field1002;

    @ObfuscatedName("ba.i")
    public int[] field1016;

    @ObfuscatedName("ba.q")
    public int[] field1017;

    @ObfuscatedName("ba.y")
    public int field1015 = 0;

    @ObfuscatedName("ba.r")
    public int field1019 = 0;

    @ObfuscatedName("ba.k")
    public int field1008 = 0;

    public class73(class324[] arg0) {
        this.field1020 = arg0;
        this.method1634();
    }

    @ObfuscatedName("ba.c(I)V")
    public void method1634() {
        this.field1009 = new int[256];
        for (int var1 = 0; var1 < 64; var1++) {
            this.field1009[var1] = var1 * 262144;
        }
        for (int var2 = 0; var2 < 64; var2++) {
            this.field1009[var2 + 64] = var2 * 1024 + 16711680;
        }
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1009[var3 + 128] = var3 * 4 + 16776960;
        }
        for (int var4 = 0; var4 < 64; var4++) {
            this.field1009[var4 + 192] = 16777215;
        }
        this.field1010 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1010[var5] = var5 * 1024;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            this.field1010[var6 + 64] = var6 * 4 + 65280;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            this.field1010[var7 + 128] = var7 * 262144 + 65535;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            this.field1010[var8 + 192] = 16777215;
        }
        this.field1005 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            this.field1005[var9] = var9 * 4;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            this.field1005[var10 + 64] = var10 * 262144 + 255;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            this.field1005[var11 + 128] = var11 * 1024 + 16711935;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            this.field1005[var12 + 192] = 16777215;
        }
        this.field1018 = new int[256];
        this.field1015 = 0;
        this.field1016 = new int[32768];
        this.field1017 = new int[32768];
        this.method1662((class324) null);
        this.field1011 = new int[32768];
        this.field1002 = new int[32768];
    }

    @ObfuscatedName("ba.x(I)V")
    public void method1664() {
        this.field1009 = null;
        this.field1010 = null;
        this.field1005 = null;
        this.field1018 = null;
        this.field1016 = null;
        this.field1017 = null;
        this.field1011 = null;
        this.field1002 = null;
        this.field1015 = 0;
        this.field1019 = 0;
    }

    @ObfuscatedName("ba.t(III)V")
    public void method1636(int arg0, int arg1) {
        if (this.field1011 == null) {
            this.method1634();
        }
        if (this.field1008 == 0) {
            this.field1008 = arg1;
        }
        int var3 = arg1 - this.field1008;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1008 = arg1;
        if (var3 > 0) {
            this.method1637(var3);
        }
        this.method1670(arg0);
    }

    @ObfuscatedName("ba.g(II)V")
    public final void method1637(int arg0) {
        this.field1015 += arg0 * 128;
        if (this.field1015 > this.field1016.length) {
            this.field1015 -= this.field1016.length;
            int var2 = (int) (Math.random() * 12.0D);
            this.method1662(this.field1020[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (256 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field1011[var3 + var4] - this.field1016[this.field1015 + var3 & this.field1016.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            this.field1011[var3++] = var7;
        }
        byte var8 = 10;
        int var9 = 128 - var8;
        for (int var10 = 256 - arg0; var10 < 256; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > var8 && var12 < var9) {
                    this.field1011[var11 + var12] = 255;
                } else {
                    this.field1011[var11 + var12] = 0;
                }
            }
        }
        if (this.field1012 > 0) {
            this.field1012 -= arg0 * 4;
        }
        if (this.field1013 > 0) {
            this.field1013 -= arg0 * 4;
        }
        if (this.field1012 == 0 && this.field1013 == 0) {
            int var14 = (int) (Math.random() * (double) (2000 / arg0));
            if (var14 == 0) {
                this.field1012 = 1024;
            }
            if (var14 == 1) {
                this.field1013 = 1024;
            }
        }
        for (int var15 = 0; var15 < 256 - arg0; var15++) {
            this.field1006[var15] = this.field1006[arg0 + var15];
        }
        for (int var16 = 256 - arg0; var16 < 256; var16++) {
            this.field1006[var16] = (int) (Math.sin((double) this.field1007 / 14.0D) * 16.0D + Math.sin((double) this.field1007 / 15.0D) * 14.0D + Math.sin((double) this.field1007 / 16.0D) * 12.0D);
            this.field1007++;
        }
        this.field1019 += arg0;
        int var17 = ((client.field628 & 0x1) + arg0) / 2;
        if (var17 <= 0) {
            return;
        }
        short var18 = 128;
        byte var19 = 2;
        int var20 = 128 - var19 - var19;
        for (int var21 = 0; var21 < this.field1019 * 100; var21++) {
            int var22 = (int) (Math.random() * (double) var20) + var19;
            int var23 = (int) (Math.random() * (double) var18) + var18;
            this.field1011[(var23 << 7) + var22] = 192;
        }
        this.field1019 = 0;
        for (int var24 = 0; var24 < 256; var24++) {
            int var25 = 0;
            int var26 = var24 * 128;
            for (int var27 = -var17; var27 < 128; var27++) {
                if (var17 + var27 < 128) {
                    var25 += this.field1011[var26 + var27 + var17];
                }
                if (var27 - (var17 + 1) >= 0) {
                    var25 -= this.field1011[var26 + var27 - (var17 + 1)];
                }
                if (var27 >= 0) {
                    this.field1002[var26 + var27] = var25 / (var17 * 2 + 1);
                }
            }
        }
        for (int var28 = 0; var28 < 128; var28++) {
            int var29 = 0;
            for (int var30 = -var17; var30 < 256; var30++) {
                int var31 = var30 * 128;
                if (var17 + var30 < 256) {
                    var29 += this.field1002[var17 * 128 + var28 + var31];
                }
                if (var30 - (var17 + 1) >= 0) {
                    var29 -= this.field1002[var28 + var31 - (var17 + 1) * 128];
                }
                if (var30 >= 0) {
                    this.field1011[var28 + var31] = var29 / (var17 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("ba.l(IIIS)I")
    public final int method1638(int arg0, int arg1, int arg2) {
        int var4 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ba.u(II)V")
    public final void method1670(int arg0) {
        int var2 = this.field1018.length;
        if (this.field1012 > 0) {
            this.method1640(this.field1012, this.field1010);
        } else if (this.field1013 > 0) {
            this.method1640(this.field1013, this.field1005);
        } else {
            for (int var3 = 0; var3 < var2; var3++) {
                this.field1018[var3] = this.field1009[var3];
            }
        }
        this.method1639(arg0);
    }

    @ObfuscatedName("ba.j(I[IB)V")
    public final void method1640(int arg0, int[] arg1) {
        int var3 = this.field1018.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 > 768) {
                this.field1018[var4] = this.method1638(this.field1009[var4], arg1[var4], 1024 - arg0);
            } else if (arg0 > 256) {
                this.field1018[var4] = arg1[var4];
            } else {
                this.field1018[var4] = this.method1638(arg1[var4], this.field1009[var4], 256 - arg0);
            }
        }
    }

    @ObfuscatedName("ba.v(IB)V")
    public final void method1639(int arg0) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; var3++) {
            int var4 = (256 - var3) * this.field1006[var3] / 256;
            int var5 = arg0 + var4;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if (var5 + 128 >= Statics.field394.field3849) {
                var7 = Statics.field394.field3849 - var5;
            }
            int var8 = Statics.field394.field3849 * (var3 + 8) + var5;
            int var9 = var2 + var6;
            for (int var10 = var6; var10 < var7; var10++) {
                int var11 = this.field1011[var9++];
                int var12 = var8 % Statics.field3842;
                if (var11 == 0 || var12 < class321.field3846 || var12 >= class321.field3841) {
                    var8++;
                } else {
                    int var14 = 256 - var11;
                    int var15 = this.field1018[var11];
                    int var16 = Statics.field394.field3848[var8];
                    Statics.field394.field3848[var8++] = 0xFF000000 | ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) + ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) >> 8;
                }
            }
            var2 = 128 - var7 + var9;
        }
    }

    @ObfuscatedName("ba.d(Llt;I)V")
    public final void method1662(class324 arg0) {
        for (int var2 = 0; var2 < this.field1016.length; var2++) {
            this.field1016[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * 256.0D);
            this.field1016[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < 255; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    this.field1017[var8] = (this.field1016[var8 - 1] + this.field1016[var8 + 1] + this.field1016[var8 - 128] + this.field1016[var8 + 128]) / 4;
                }
            }
            int[] var9 = this.field1016;
            this.field1016 = this.field1017;
            this.field1017 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3861; var11++) {
            for (int var12 = 0; var12 < arg0.field3865; var12++) {
                if (arg0.field3858[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3862;
                    int var14 = var11 + 16 + arg0.field3863;
                    int var15 = (var14 << 7) + var13;
                    this.field1016[var15] = 0;
                }
            }
        }
    }
}
