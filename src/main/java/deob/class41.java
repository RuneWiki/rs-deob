package deob;

@ObfuscatedName("ak")
public class class41 {

    @ObfuscatedName("ak.z")
    public int field325;

    @ObfuscatedName("ak.n")
    public byte[][][] field326;

    public class41(int arg0) {
        this.field325 = arg0;
    }

    @ObfuscatedName("ak.z(IIIIIIIII)V")
    public void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field325 != 0 && this.field326 != null) {
            int var9 = this.method619(arg7, arg6);
            int var10 = this.method620(arg6);
            class321.method5449(arg0, arg1, arg4, arg5, arg2, arg3, this.field326[var10 - 1][var9], this.field325, true);
        }
    }

    @ObfuscatedName("ak.n(IIB)I")
    public int method619(int arg0, int arg1) {
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

    @ObfuscatedName("ak.v(IB)I")
    public int method620(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ak.u(S)V")
    public void method631() {
        if (this.field326 != null) {
            return;
        }
        this.field326 = new byte[8][4][];
        this.method622();
        this.method623();
        this.method624();
        this.method625();
        this.method626();
        this.method627();
        this.method639();
        this.method643();
    }

    @ObfuscatedName("ak.r(B)V")
    public void method622() {
        byte[] var1 = new byte[this.field325 * this.field325];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field325; var3++) {
            for (int var4 = 0; var4 < this.field325; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field326[0][0] = var1;
        byte[] var5 = new byte[this.field325 * this.field325];
        int var6 = 0;
        for (int var7 = this.field325 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field325; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field326[0][1] = var5;
        byte[] var9 = new byte[this.field325 * this.field325];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field325; var11++) {
            for (int var12 = 0; var12 < this.field325; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field326[0][2] = var9;
        byte[] var13 = new byte[this.field325 * this.field325];
        int var14 = 0;
        for (int var15 = this.field325 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field325; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field326[0][3] = var13;
    }

    @ObfuscatedName("ak.p(I)V")
    public void method623() {
        byte[] var1 = new byte[this.field325 * this.field325];
        int var2 = 0;
        for (int var3 = this.field325 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field325; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field326[1][0] = var1;
        byte[] var5 = new byte[this.field325 * this.field325];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field325; var7++) {
            for (int var8 = 0; var8 < this.field325; var8++) {
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
        this.field326[1][1] = var5;
        byte[] var9 = new byte[this.field325 * this.field325];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field325; var11++) {
            for (int var12 = this.field325 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field326[1][2] = var9;
        byte[] var13 = new byte[this.field325 * this.field325];
        int var14 = 0;
        for (int var15 = this.field325 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field325 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field326[1][3] = var13;
    }

    @ObfuscatedName("ak.q(I)V")
    public void method624() {
        byte[] var1 = new byte[this.field325 * this.field325];
        int var2 = 0;
        for (int var3 = this.field325 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field325 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field326[2][0] = var1;
        byte[] var5 = new byte[this.field325 * this.field325];
        int var6 = 0;
        for (int var7 = this.field325 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field325; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field326[2][1] = var5;
        byte[] var9 = new byte[this.field325 * this.field325];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field325; var11++) {
            for (int var12 = 0; var12 < this.field325; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field326[2][2] = var9;
        byte[] var13 = new byte[this.field325 * this.field325];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field325; var15++) {
            for (int var16 = this.field325 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field326[2][3] = var13;
    }

    @ObfuscatedName("ak.m(B)V")
    public void method625() {
        byte[] var1 = new byte[this.field325 * this.field325];
        int var2 = 0;
        for (int var3 = this.field325 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field325; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field326[3][0] = var1;
        byte[] var5 = new byte[this.field325 * this.field325];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field325; var7++) {
            for (int var8 = 0; var8 < this.field325; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field326[3][1] = var5;
        byte[] var9 = new byte[this.field325 * this.field325];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field325; var11++) {
            for (int var12 = this.field325 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field326[3][2] = var9;
        byte[] var13 = new byte[this.field325 * this.field325];
        int var14 = 0;
        for (int var15 = this.field325 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field325 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field326[3][3] = var13;
    }

    @ObfuscatedName("ak.y(I)V")
    public void method626() {
        byte[] var1 = new byte[this.field325 * this.field325];
        int var2 = 0;
        for (int var3 = this.field325 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field325 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field326[4][0] = var1;
        byte[] var5 = new byte[this.field325 * this.field325];
        int var6 = 0;
        for (int var7 = this.field325 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field325; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field326[4][1] = var5;
        byte[] var9 = new byte[this.field325 * this.field325];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field325; var11++) {
            for (int var12 = 0; var12 < this.field325; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field326[4][2] = var9;
        byte[] var13 = new byte[this.field325 * this.field325];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field325; var15++) {
            for (int var16 = this.field325 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field326[4][3] = var13;
    }

    @ObfuscatedName("ak.i(I)V")
    public void method627() {
        byte[] var1 = new byte[this.field325 * this.field325];
        boolean var2 = false;
        byte[] var3 = new byte[this.field325 * this.field325];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field325; var5++) {
            for (int var6 = 0; var6 < this.field325; var6++) {
                if (var6 <= this.field325 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field326[5][0] = var3;
        byte[] var7 = new byte[this.field325 * this.field325];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field325; var9++) {
            for (int var10 = 0; var10 < this.field325; var10++) {
                if (var9 <= this.field325 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field326[5][1] = var7;
        byte[] var11 = new byte[this.field325 * this.field325];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field325; var13++) {
            for (int var14 = 0; var14 < this.field325; var14++) {
                if (var14 >= this.field325 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field326[5][2] = var11;
        byte[] var15 = new byte[this.field325 * this.field325];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field325; var17++) {
            for (int var18 = 0; var18 < this.field325; var18++) {
                if (var17 >= this.field325 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field326[5][3] = var15;
    }

    @ObfuscatedName("ak.c(I)V")
    public void method639() {
        byte[] var1 = new byte[this.field325 * this.field325];
        boolean var2 = false;
        byte[] var3 = new byte[this.field325 * this.field325];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field325; var5++) {
            for (int var6 = 0; var6 < this.field325; var6++) {
                if (var6 <= var5 - this.field325 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field326[6][0] = var3;
        byte[] var7 = new byte[this.field325 * this.field325];
        int var8 = 0;
        for (int var9 = this.field325 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field325; var10++) {
                if (var10 <= var9 - this.field325 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field326[6][1] = var7;
        byte[] var11 = new byte[this.field325 * this.field325];
        int var12 = 0;
        for (int var13 = this.field325 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field325 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field325 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field326[6][2] = var11;
        byte[] var15 = new byte[this.field325 * this.field325];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field325; var17++) {
            for (int var18 = this.field325 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field325 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field326[6][3] = var15;
    }

    @ObfuscatedName("ak.b(I)V")
    public void method643() {
        byte[] var1 = new byte[this.field325 * this.field325];
        boolean var2 = false;
        byte[] var3 = new byte[this.field325 * this.field325];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field325; var5++) {
            for (int var6 = 0; var6 < this.field325; var6++) {
                if (var6 >= var5 - this.field325 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field326[7][0] = var3;
        byte[] var7 = new byte[this.field325 * this.field325];
        int var8 = 0;
        for (int var9 = this.field325 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field325; var10++) {
                if (var10 >= var9 - this.field325 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field326[7][1] = var7;
        byte[] var11 = new byte[this.field325 * this.field325];
        int var12 = 0;
        for (int var13 = this.field325 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field325 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field325 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field326[7][2] = var11;
        byte[] var15 = new byte[this.field325 * this.field325];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field325; var17++) {
            for (int var18 = this.field325 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field325 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field326[7][3] = var15;
    }
}
