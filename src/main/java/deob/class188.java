package deob;

@ObfuscatedName("gb")
public class class188 {

    @ObfuscatedName("gb.v")
    public int field2144;

    @ObfuscatedName("gb.n")
    public byte[][][] field2147;

    public class188(int arg0) {
        this.field2144 = arg0;
    }

    @ObfuscatedName("gb.v(IIIIIIIIB)V")
    public void method3365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field2144 != 0 && this.field2147 != null) {
            int var9 = this.method3377(arg7, arg6);
            int var10 = this.method3367(arg6);
            class392.method6253(arg0, arg1, arg4, arg5, arg2, arg3, this.field2147[var10 - 1][var9], this.field2144, true);
        }
    }

    @ObfuscatedName("gb.n(III)I")
    public int method3377(int arg0, int arg1) {
        if (arg1 == 9) {
            arg0 = arg0 + 1 & 0x3;
        }
        if (arg1 == 10) {
            arg0 = arg0 + 3 & 0x3;
        }
        if (arg1 == 11) {
            arg0 = arg0 + 3 & 0x3;
        }
        return arg0;
    }

    @ObfuscatedName("gb.f(IB)I")
    public int method3367(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("gb.y(B)V")
    public void method3391() {
        if (this.field2147 != null) {
            return;
        }
        this.field2147 = new byte[8][4][];
        this.method3364();
        this.method3369();
        this.method3370();
        this.method3372();
        this.method3368();
        this.method3373();
        this.method3366();
        this.method3375();
    }

    @ObfuscatedName("gb.p(I)V")
    public void method3364() {
        byte[] var1 = new byte[this.field2144 * this.field2144];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2144; var3++) {
            for (int var4 = 0; var4 < this.field2144; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2147[0][0] = var1;
        byte[] var5 = new byte[this.field2144 * this.field2144];
        int var6 = 0;
        for (int var7 = this.field2144 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2144; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2147[0][1] = var5;
        byte[] var9 = new byte[this.field2144 * this.field2144];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2144; var11++) {
            for (int var12 = 0; var12 < this.field2144; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2147[0][2] = var9;
        byte[] var13 = new byte[this.field2144 * this.field2144];
        int var14 = 0;
        for (int var15 = this.field2144 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field2144; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2147[0][3] = var13;
    }

    @ObfuscatedName("gb.j(I)V")
    public void method3369() {
        byte[] var1 = new byte[this.field2144 * this.field2144];
        int var2 = 0;
        for (int var3 = this.field2144 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2144; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2147[1][0] = var1;
        byte[] var5 = new byte[this.field2144 * this.field2144];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2144; var7++) {
            for (int var8 = 0; var8 < this.field2144; var8++) {
                if (var6 >= 0 && var6 < var5.length) {
                    if (var8 >= var7 << 1) {
                        var5[var6] = -1;
                    }
                    var6++;
                } else {
                    var6++;
                }
            }
        }
        this.field2147[1][1] = var5;
        byte[] var9 = new byte[this.field2144 * this.field2144];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2144; var11++) {
            for (int var12 = this.field2144 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2147[1][2] = var9;
        byte[] var13 = new byte[this.field2144 * this.field2144];
        int var14 = 0;
        for (int var15 = this.field2144 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field2144 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2147[1][3] = var13;
    }

    @ObfuscatedName("gb.r(I)V")
    public void method3370() {
        byte[] var1 = new byte[this.field2144 * this.field2144];
        int var2 = 0;
        for (int var3 = this.field2144 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field2144 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2147[2][0] = var1;
        byte[] var5 = new byte[this.field2144 * this.field2144];
        int var6 = 0;
        for (int var7 = this.field2144 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2144; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2147[2][1] = var5;
        byte[] var9 = new byte[this.field2144 * this.field2144];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2144; var11++) {
            for (int var12 = 0; var12 < this.field2144; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2147[2][2] = var9;
        byte[] var13 = new byte[this.field2144 * this.field2144];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field2144; var15++) {
            for (int var16 = this.field2144 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2147[2][3] = var13;
    }

    @ObfuscatedName("gb.b(I)V")
    public void method3372() {
        byte[] var1 = new byte[this.field2144 * this.field2144];
        int var2 = 0;
        for (int var3 = this.field2144 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2144; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2147[3][0] = var1;
        byte[] var5 = new byte[this.field2144 * this.field2144];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2144; var7++) {
            for (int var8 = 0; var8 < this.field2144; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2147[3][1] = var5;
        byte[] var9 = new byte[this.field2144 * this.field2144];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2144; var11++) {
            for (int var12 = this.field2144 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2147[3][2] = var9;
        byte[] var13 = new byte[this.field2144 * this.field2144];
        int var14 = 0;
        for (int var15 = this.field2144 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field2144 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2147[3][3] = var13;
    }

    @ObfuscatedName("gb.d(I)V")
    public void method3368() {
        byte[] var1 = new byte[this.field2144 * this.field2144];
        int var2 = 0;
        for (int var3 = this.field2144 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field2144 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2147[4][0] = var1;
        byte[] var5 = new byte[this.field2144 * this.field2144];
        int var6 = 0;
        for (int var7 = this.field2144 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2144; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2147[4][1] = var5;
        byte[] var9 = new byte[this.field2144 * this.field2144];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2144; var11++) {
            for (int var12 = 0; var12 < this.field2144; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2147[4][2] = var9;
        byte[] var13 = new byte[this.field2144 * this.field2144];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field2144; var15++) {
            for (int var16 = this.field2144 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2147[4][3] = var13;
    }

    @ObfuscatedName("gb.s(I)V")
    public void method3373() {
        byte[] var1 = new byte[this.field2144 * this.field2144];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2144 * this.field2144];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2144; var5++) {
            for (int var6 = 0; var6 < this.field2144; var6++) {
                if (var6 <= this.field2144 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2147[5][0] = var3;
        byte[] var7 = new byte[this.field2144 * this.field2144];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2144; var9++) {
            for (int var10 = 0; var10 < this.field2144; var10++) {
                if (var9 <= this.field2144 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2147[5][1] = var7;
        byte[] var11 = new byte[this.field2144 * this.field2144];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field2144; var13++) {
            for (int var14 = 0; var14 < this.field2144; var14++) {
                if (var14 >= this.field2144 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2147[5][2] = var11;
        byte[] var15 = new byte[this.field2144 * this.field2144];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2144; var17++) {
            for (int var18 = 0; var18 < this.field2144; var18++) {
                if (var17 >= this.field2144 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2147[5][3] = var15;
    }

    @ObfuscatedName("gb.u(I)V")
    public void method3366() {
        byte[] var1 = new byte[this.field2144 * this.field2144];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2144 * this.field2144];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2144; var5++) {
            for (int var6 = 0; var6 < this.field2144; var6++) {
                if (var6 <= var5 - this.field2144 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2147[6][0] = var3;
        byte[] var7 = new byte[this.field2144 * this.field2144];
        int var8 = 0;
        for (int var9 = this.field2144 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field2144; var10++) {
                if (var10 <= var9 - this.field2144 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2147[6][1] = var7;
        byte[] var11 = new byte[this.field2144 * this.field2144];
        int var12 = 0;
        for (int var13 = this.field2144 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field2144 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field2144 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2147[6][2] = var11;
        byte[] var15 = new byte[this.field2144 * this.field2144];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2144; var17++) {
            for (int var18 = this.field2144 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field2144 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2147[6][3] = var15;
    }

    @ObfuscatedName("gb.l(B)V")
    public void method3375() {
        byte[] var1 = new byte[this.field2144 * this.field2144];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2144 * this.field2144];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2144; var5++) {
            for (int var6 = 0; var6 < this.field2144; var6++) {
                if (var6 >= var5 - this.field2144 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2147[7][0] = var3;
        byte[] var7 = new byte[this.field2144 * this.field2144];
        int var8 = 0;
        for (int var9 = this.field2144 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field2144; var10++) {
                if (var10 >= var9 - this.field2144 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2147[7][1] = var7;
        byte[] var11 = new byte[this.field2144 * this.field2144];
        int var12 = 0;
        for (int var13 = this.field2144 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field2144 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field2144 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2147[7][2] = var11;
        byte[] var15 = new byte[this.field2144 * this.field2144];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2144; var17++) {
            for (int var18 = this.field2144 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field2144 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2147[7][3] = var15;
    }
}
