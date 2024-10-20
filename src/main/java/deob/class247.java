package deob;

@ObfuscatedName("if")
public class class247 {

    @ObfuscatedName("if.c")
    public int field2877;

    @ObfuscatedName("if.v")
    public byte[][][] field2875;

    public class247(int arg0) {
        this.field2877 = arg0;
    }

    @ObfuscatedName("if.c(IIIIIIIIB)V")
    public void method4641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field2877 != 0 && this.field2875 != null) {
            int var9 = this.method4618(arg7, arg6);
            int var10 = this.method4619(arg6);
            class452.method7354(arg0, arg1, arg4, arg5, arg2, arg3, this.field2875[var10 - 1][var9], this.field2877, true);
        }
    }

    @ObfuscatedName("if.v(III)I")
    public int method4618(int arg0, int arg1) {
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

    @ObfuscatedName("if.q(II)I")
    public int method4619(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("if.f(I)V")
    public void method4646() {
        if (this.field2875 != null) {
            return;
        }
        this.field2875 = new byte[8][4][];
        this.method4623();
        this.method4621();
        this.method4643();
        this.method4635();
        this.method4624();
        this.method4632();
        this.method4626();
        this.method4627();
    }

    @ObfuscatedName("if.j(I)V")
    public void method4623() {
        byte[] var1 = new byte[this.field2877 * this.field2877];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2877; var3++) {
            for (int var4 = 0; var4 < this.field2877; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2875[0][0] = var1;
        byte[] var5 = new byte[this.field2877 * this.field2877];
        int var6 = 0;
        for (int var7 = this.field2877 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2877; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2875[0][1] = var5;
        byte[] var9 = new byte[this.field2877 * this.field2877];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2877; var11++) {
            for (int var12 = 0; var12 < this.field2877; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2875[0][2] = var9;
        byte[] var13 = new byte[this.field2877 * this.field2877];
        int var14 = 0;
        for (int var15 = this.field2877 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field2877; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2875[0][3] = var13;
    }

    @ObfuscatedName("if.e(I)V")
    public void method4621() {
        byte[] var1 = new byte[this.field2877 * this.field2877];
        int var2 = 0;
        for (int var3 = this.field2877 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2877; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2875[1][0] = var1;
        byte[] var5 = new byte[this.field2877 * this.field2877];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2877; var7++) {
            for (int var8 = 0; var8 < this.field2877; var8++) {
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
        this.field2875[1][1] = var5;
        byte[] var9 = new byte[this.field2877 * this.field2877];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2877; var11++) {
            for (int var12 = this.field2877 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2875[1][2] = var9;
        byte[] var13 = new byte[this.field2877 * this.field2877];
        int var14 = 0;
        for (int var15 = this.field2877 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field2877 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2875[1][3] = var13;
    }

    @ObfuscatedName("if.g(S)V")
    public void method4643() {
        byte[] var1 = new byte[this.field2877 * this.field2877];
        int var2 = 0;
        for (int var3 = this.field2877 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field2877 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2875[2][0] = var1;
        byte[] var5 = new byte[this.field2877 * this.field2877];
        int var6 = 0;
        for (int var7 = this.field2877 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2877; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2875[2][1] = var5;
        byte[] var9 = new byte[this.field2877 * this.field2877];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2877; var11++) {
            for (int var12 = 0; var12 < this.field2877; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2875[2][2] = var9;
        byte[] var13 = new byte[this.field2877 * this.field2877];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field2877; var15++) {
            for (int var16 = this.field2877 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2875[2][3] = var13;
    }

    @ObfuscatedName("if.w(B)V")
    public void method4635() {
        byte[] var1 = new byte[this.field2877 * this.field2877];
        int var2 = 0;
        for (int var3 = this.field2877 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2877; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2875[3][0] = var1;
        byte[] var5 = new byte[this.field2877 * this.field2877];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2877; var7++) {
            for (int var8 = 0; var8 < this.field2877; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2875[3][1] = var5;
        byte[] var9 = new byte[this.field2877 * this.field2877];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2877; var11++) {
            for (int var12 = this.field2877 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2875[3][2] = var9;
        byte[] var13 = new byte[this.field2877 * this.field2877];
        int var14 = 0;
        for (int var15 = this.field2877 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field2877 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2875[3][3] = var13;
    }

    @ObfuscatedName("if.y(I)V")
    public void method4624() {
        byte[] var1 = new byte[this.field2877 * this.field2877];
        int var2 = 0;
        for (int var3 = this.field2877 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field2877 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2875[4][0] = var1;
        byte[] var5 = new byte[this.field2877 * this.field2877];
        int var6 = 0;
        for (int var7 = this.field2877 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2877; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2875[4][1] = var5;
        byte[] var9 = new byte[this.field2877 * this.field2877];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2877; var11++) {
            for (int var12 = 0; var12 < this.field2877; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2875[4][2] = var9;
        byte[] var13 = new byte[this.field2877 * this.field2877];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field2877; var15++) {
            for (int var16 = this.field2877 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2875[4][3] = var13;
    }

    @ObfuscatedName("if.i(I)V")
    public void method4632() {
        byte[] var1 = new byte[this.field2877 * this.field2877];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2877 * this.field2877];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2877; var5++) {
            for (int var6 = 0; var6 < this.field2877; var6++) {
                if (var6 <= this.field2877 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2875[5][0] = var3;
        byte[] var7 = new byte[this.field2877 * this.field2877];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2877; var9++) {
            for (int var10 = 0; var10 < this.field2877; var10++) {
                if (var9 <= this.field2877 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2875[5][1] = var7;
        byte[] var11 = new byte[this.field2877 * this.field2877];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field2877; var13++) {
            for (int var14 = 0; var14 < this.field2877; var14++) {
                if (var14 >= this.field2877 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2875[5][2] = var11;
        byte[] var15 = new byte[this.field2877 * this.field2877];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2877; var17++) {
            for (int var18 = 0; var18 < this.field2877; var18++) {
                if (var17 >= this.field2877 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2875[5][3] = var15;
    }

    @ObfuscatedName("if.s(B)V")
    public void method4626() {
        byte[] var1 = new byte[this.field2877 * this.field2877];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2877 * this.field2877];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2877; var5++) {
            for (int var6 = 0; var6 < this.field2877; var6++) {
                if (var6 <= var5 - this.field2877 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2875[6][0] = var3;
        byte[] var7 = new byte[this.field2877 * this.field2877];
        int var8 = 0;
        for (int var9 = this.field2877 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field2877; var10++) {
                if (var10 <= var9 - this.field2877 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2875[6][1] = var7;
        byte[] var11 = new byte[this.field2877 * this.field2877];
        int var12 = 0;
        for (int var13 = this.field2877 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field2877 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field2877 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2875[6][2] = var11;
        byte[] var15 = new byte[this.field2877 * this.field2877];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2877; var17++) {
            for (int var18 = this.field2877 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field2877 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2875[6][3] = var15;
    }

    @ObfuscatedName("if.t(B)V")
    public void method4627() {
        byte[] var1 = new byte[this.field2877 * this.field2877];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2877 * this.field2877];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2877; var5++) {
            for (int var6 = 0; var6 < this.field2877; var6++) {
                if (var6 >= var5 - this.field2877 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2875[7][0] = var3;
        byte[] var7 = new byte[this.field2877 * this.field2877];
        int var8 = 0;
        for (int var9 = this.field2877 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field2877; var10++) {
                if (var10 >= var9 - this.field2877 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2875[7][1] = var7;
        byte[] var11 = new byte[this.field2877 * this.field2877];
        int var12 = 0;
        for (int var13 = this.field2877 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field2877 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field2877 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2875[7][2] = var11;
        byte[] var15 = new byte[this.field2877 * this.field2877];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2877; var17++) {
            for (int var18 = this.field2877 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field2877 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2875[7][3] = var15;
    }
}
