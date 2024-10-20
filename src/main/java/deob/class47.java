package deob;

@ObfuscatedName("ax")
public class class47 {

    @ObfuscatedName("ax.d")
    public int field620;

    @ObfuscatedName("ax.k")
    public byte[][][] field610;

    public class47(int arg0) {
        this.field620 = arg0;
    }

    @ObfuscatedName("ax.d(IIIIIIIIB)V")
    public void method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field620 != 0 && this.field610 != null) {
            int var9 = this.method593(arg7, arg6);
            int var10 = this.method594(arg6);
            class283.method4726(arg0, arg1, arg4, arg5, arg2, arg3, this.field610[var10 - 1][var9], this.field620, true);
        }
    }

    @ObfuscatedName("ax.k(III)I")
    public int method593(int arg0, int arg1) {
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

    @ObfuscatedName("ax.e(IB)I")
    public int method594(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ax.p(I)V")
    public void method628() {
        if (this.field610 != null) {
            return;
        }
        this.field610 = new byte[8][4][];
        this.method596();
        this.method597();
        this.method598();
        this.method599();
        this.method611();
        this.method638();
        this.method602();
        this.method603();
    }

    @ObfuscatedName("ax.q(B)V")
    public void method596() {
        byte[] var1 = new byte[this.field620 * this.field620];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field620; var3++) {
            for (int var4 = 0; var4 < this.field620; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field610[0][0] = var1;
        byte[] var5 = new byte[this.field620 * this.field620];
        int var6 = 0;
        for (int var7 = this.field620 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field620; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field610[0][1] = var5;
        byte[] var9 = new byte[this.field620 * this.field620];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field620; var11++) {
            for (int var12 = 0; var12 < this.field620; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field610[0][2] = var9;
        byte[] var13 = new byte[this.field620 * this.field620];
        int var14 = 0;
        for (int var15 = this.field620 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field620; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field610[0][3] = var13;
    }

    @ObfuscatedName("ax.s(I)V")
    public void method597() {
        byte[] var1 = new byte[this.field620 * this.field620];
        int var2 = 0;
        for (int var3 = this.field620 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field620; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field610[1][0] = var1;
        byte[] var5 = new byte[this.field620 * this.field620];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field620; var7++) {
            for (int var8 = 0; var8 < this.field620; var8++) {
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
        this.field610[1][1] = var5;
        byte[] var9 = new byte[this.field620 * this.field620];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field620; var11++) {
            for (int var12 = this.field620 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field610[1][2] = var9;
        byte[] var13 = new byte[this.field620 * this.field620];
        int var14 = 0;
        for (int var15 = this.field620 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field620 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field610[1][3] = var13;
    }

    @ObfuscatedName("ax.r(I)V")
    public void method598() {
        byte[] var1 = new byte[this.field620 * this.field620];
        int var2 = 0;
        for (int var3 = this.field620 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field620 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field610[2][0] = var1;
        byte[] var5 = new byte[this.field620 * this.field620];
        int var6 = 0;
        for (int var7 = this.field620 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field620; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field610[2][1] = var5;
        byte[] var9 = new byte[this.field620 * this.field620];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field620; var11++) {
            for (int var12 = 0; var12 < this.field620; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field610[2][2] = var9;
        byte[] var13 = new byte[this.field620 * this.field620];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field620; var15++) {
            for (int var16 = this.field620 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field610[2][3] = var13;
    }

    @ObfuscatedName("ax.g(I)V")
    public void method599() {
        byte[] var1 = new byte[this.field620 * this.field620];
        int var2 = 0;
        for (int var3 = this.field620 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field620; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field610[3][0] = var1;
        byte[] var5 = new byte[this.field620 * this.field620];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field620; var7++) {
            for (int var8 = 0; var8 < this.field620; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field610[3][1] = var5;
        byte[] var9 = new byte[this.field620 * this.field620];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field620; var11++) {
            for (int var12 = this.field620 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field610[3][2] = var9;
        byte[] var13 = new byte[this.field620 * this.field620];
        int var14 = 0;
        for (int var15 = this.field620 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field620 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field610[3][3] = var13;
    }

    @ObfuscatedName("ax.v(I)V")
    public void method611() {
        byte[] var1 = new byte[this.field620 * this.field620];
        int var2 = 0;
        for (int var3 = this.field620 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field620 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field610[4][0] = var1;
        byte[] var5 = new byte[this.field620 * this.field620];
        int var6 = 0;
        for (int var7 = this.field620 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field620; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field610[4][1] = var5;
        byte[] var9 = new byte[this.field620 * this.field620];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field620; var11++) {
            for (int var12 = 0; var12 < this.field620; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field610[4][2] = var9;
        byte[] var13 = new byte[this.field620 * this.field620];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field620; var15++) {
            for (int var16 = this.field620 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field610[4][3] = var13;
    }

    @ObfuscatedName("ax.t(I)V")
    public void method638() {
        byte[] var1 = new byte[this.field620 * this.field620];
        boolean var2 = false;
        byte[] var3 = new byte[this.field620 * this.field620];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field620; var5++) {
            for (int var6 = 0; var6 < this.field620; var6++) {
                if (var6 <= this.field620 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field610[5][0] = var3;
        byte[] var7 = new byte[this.field620 * this.field620];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field620; var9++) {
            for (int var10 = 0; var10 < this.field620; var10++) {
                if (var9 <= this.field620 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field610[5][1] = var7;
        byte[] var11 = new byte[this.field620 * this.field620];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field620; var13++) {
            for (int var14 = 0; var14 < this.field620; var14++) {
                if (var14 >= this.field620 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field610[5][2] = var11;
        byte[] var15 = new byte[this.field620 * this.field620];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field620; var17++) {
            for (int var18 = 0; var18 < this.field620; var18++) {
                if (var17 >= this.field620 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field610[5][3] = var15;
    }

    @ObfuscatedName("ax.y(I)V")
    public void method602() {
        byte[] var1 = new byte[this.field620 * this.field620];
        boolean var2 = false;
        byte[] var3 = new byte[this.field620 * this.field620];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field620; var5++) {
            for (int var6 = 0; var6 < this.field620; var6++) {
                if (var6 <= var5 - this.field620 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field610[6][0] = var3;
        byte[] var7 = new byte[this.field620 * this.field620];
        int var8 = 0;
        for (int var9 = this.field620 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field620; var10++) {
                if (var10 <= var9 - this.field620 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field610[6][1] = var7;
        byte[] var11 = new byte[this.field620 * this.field620];
        int var12 = 0;
        for (int var13 = this.field620 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field620 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field620 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field610[6][2] = var11;
        byte[] var15 = new byte[this.field620 * this.field620];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field620; var17++) {
            for (int var18 = this.field620 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field620 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field610[6][3] = var15;
    }

    @ObfuscatedName("ax.o(I)V")
    public void method603() {
        byte[] var1 = new byte[this.field620 * this.field620];
        boolean var2 = false;
        byte[] var3 = new byte[this.field620 * this.field620];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field620; var5++) {
            for (int var6 = 0; var6 < this.field620; var6++) {
                if (var6 >= var5 - this.field620 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field610[7][0] = var3;
        byte[] var7 = new byte[this.field620 * this.field620];
        int var8 = 0;
        for (int var9 = this.field620 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field620; var10++) {
                if (var10 >= var9 - this.field620 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field610[7][1] = var7;
        byte[] var11 = new byte[this.field620 * this.field620];
        int var12 = 0;
        for (int var13 = this.field620 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field620 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field620 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field610[7][2] = var11;
        byte[] var15 = new byte[this.field620 * this.field620];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field620; var17++) {
            for (int var18 = this.field620 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field620 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field610[7][3] = var15;
    }
}
