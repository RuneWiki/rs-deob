package deob;

@ObfuscatedName("af")
public class class47 {

    @ObfuscatedName("af.d")
    public int field569;

    @ObfuscatedName("af.x")
    public byte[][][] field566;

    public class47(int arg0) {
        this.field569 = arg0;
    }

    @ObfuscatedName("af.d(IIIIIIIII)V")
    public void method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field569 != 0 && this.field566 != null) {
            int var9 = this.method595(arg7, arg6);
            int var10 = this.method596(arg6);
            class291.method4834(arg0, arg1, arg4, arg5, arg2, arg3, this.field566[var10 - 1][var9], this.field569, true);
        }
    }

    @ObfuscatedName("af.x(III)I")
    public int method595(int arg0, int arg1) {
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

    @ObfuscatedName("af.k(IB)I")
    public int method596(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("af.z(I)V")
    public void method634() {
        if (this.field566 != null) {
            return;
        }
        this.field566 = new byte[8][4][];
        this.method598();
        this.method627();
        this.method600();
        this.method601();
        this.method613();
        this.method603();
        this.method604();
        this.method608();
    }

    @ObfuscatedName("af.v(I)V")
    public void method598() {
        byte[] var1 = new byte[this.field569 * this.field569];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field569; var3++) {
            for (int var4 = 0; var4 < this.field569; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field566[0][0] = var1;
        byte[] var5 = new byte[this.field569 * this.field569];
        int var6 = 0;
        for (int var7 = this.field569 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field569; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field566[0][1] = var5;
        byte[] var9 = new byte[this.field569 * this.field569];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field569; var11++) {
            for (int var12 = 0; var12 < this.field569; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field566[0][2] = var9;
        byte[] var13 = new byte[this.field569 * this.field569];
        int var14 = 0;
        for (int var15 = this.field569 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field569; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field566[0][3] = var13;
    }

    @ObfuscatedName("af.m(B)V")
    public void method627() {
        byte[] var1 = new byte[this.field569 * this.field569];
        int var2 = 0;
        for (int var3 = this.field569 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field569; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field566[1][0] = var1;
        byte[] var5 = new byte[this.field569 * this.field569];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field569; var7++) {
            for (int var8 = 0; var8 < this.field569; var8++) {
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
        this.field566[1][1] = var5;
        byte[] var9 = new byte[this.field569 * this.field569];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field569; var11++) {
            for (int var12 = this.field569 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field566[1][2] = var9;
        byte[] var13 = new byte[this.field569 * this.field569];
        int var14 = 0;
        for (int var15 = this.field569 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field569 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field566[1][3] = var13;
    }

    @ObfuscatedName("af.b(I)V")
    public void method600() {
        byte[] var1 = new byte[this.field569 * this.field569];
        int var2 = 0;
        for (int var3 = this.field569 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field569 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field566[2][0] = var1;
        byte[] var5 = new byte[this.field569 * this.field569];
        int var6 = 0;
        for (int var7 = this.field569 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field569; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field566[2][1] = var5;
        byte[] var9 = new byte[this.field569 * this.field569];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field569; var11++) {
            for (int var12 = 0; var12 < this.field569; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field566[2][2] = var9;
        byte[] var13 = new byte[this.field569 * this.field569];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field569; var15++) {
            for (int var16 = this.field569 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field566[2][3] = var13;
    }

    @ObfuscatedName("af.t(I)V")
    public void method601() {
        byte[] var1 = new byte[this.field569 * this.field569];
        int var2 = 0;
        for (int var3 = this.field569 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field569; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field566[3][0] = var1;
        byte[] var5 = new byte[this.field569 * this.field569];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field569; var7++) {
            for (int var8 = 0; var8 < this.field569; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field566[3][1] = var5;
        byte[] var9 = new byte[this.field569 * this.field569];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field569; var11++) {
            for (int var12 = this.field569 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field566[3][2] = var9;
        byte[] var13 = new byte[this.field569 * this.field569];
        int var14 = 0;
        for (int var15 = this.field569 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field569 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field566[3][3] = var13;
    }

    @ObfuscatedName("af.p(I)V")
    public void method613() {
        byte[] var1 = new byte[this.field569 * this.field569];
        int var2 = 0;
        for (int var3 = this.field569 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field569 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field566[4][0] = var1;
        byte[] var5 = new byte[this.field569 * this.field569];
        int var6 = 0;
        for (int var7 = this.field569 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field569; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field566[4][1] = var5;
        byte[] var9 = new byte[this.field569 * this.field569];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field569; var11++) {
            for (int var12 = 0; var12 < this.field569; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field566[4][2] = var9;
        byte[] var13 = new byte[this.field569 * this.field569];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field569; var15++) {
            for (int var16 = this.field569 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field566[4][3] = var13;
    }

    @ObfuscatedName("af.r(I)V")
    public void method603() {
        byte[] var1 = new byte[this.field569 * this.field569];
        boolean var2 = false;
        byte[] var3 = new byte[this.field569 * this.field569];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field569; var5++) {
            for (int var6 = 0; var6 < this.field569; var6++) {
                if (var6 <= this.field569 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field566[5][0] = var3;
        byte[] var7 = new byte[this.field569 * this.field569];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field569; var9++) {
            for (int var10 = 0; var10 < this.field569; var10++) {
                if (var9 <= this.field569 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field566[5][1] = var7;
        byte[] var11 = new byte[this.field569 * this.field569];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field569; var13++) {
            for (int var14 = 0; var14 < this.field569; var14++) {
                if (var14 >= this.field569 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field566[5][2] = var11;
        byte[] var15 = new byte[this.field569 * this.field569];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field569; var17++) {
            for (int var18 = 0; var18 < this.field569; var18++) {
                if (var17 >= this.field569 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field566[5][3] = var15;
    }

    @ObfuscatedName("af.l(B)V")
    public void method604() {
        byte[] var1 = new byte[this.field569 * this.field569];
        boolean var2 = false;
        byte[] var3 = new byte[this.field569 * this.field569];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field569; var5++) {
            for (int var6 = 0; var6 < this.field569; var6++) {
                if (var6 <= var5 - this.field569 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field566[6][0] = var3;
        byte[] var7 = new byte[this.field569 * this.field569];
        int var8 = 0;
        for (int var9 = this.field569 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field569; var10++) {
                if (var10 <= var9 - this.field569 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field566[6][1] = var7;
        byte[] var11 = new byte[this.field569 * this.field569];
        int var12 = 0;
        for (int var13 = this.field569 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field569 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field569 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field566[6][2] = var11;
        byte[] var15 = new byte[this.field569 * this.field569];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field569; var17++) {
            for (int var18 = this.field569 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field569 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field566[6][3] = var15;
    }

    @ObfuscatedName("af.u(B)V")
    public void method608() {
        byte[] var1 = new byte[this.field569 * this.field569];
        boolean var2 = false;
        byte[] var3 = new byte[this.field569 * this.field569];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field569; var5++) {
            for (int var6 = 0; var6 < this.field569; var6++) {
                if (var6 >= var5 - this.field569 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field566[7][0] = var3;
        byte[] var7 = new byte[this.field569 * this.field569];
        int var8 = 0;
        for (int var9 = this.field569 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field569; var10++) {
                if (var10 >= var9 - this.field569 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field566[7][1] = var7;
        byte[] var11 = new byte[this.field569 * this.field569];
        int var12 = 0;
        for (int var13 = this.field569 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field569 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field569 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field566[7][2] = var11;
        byte[] var15 = new byte[this.field569 * this.field569];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field569; var17++) {
            for (int var18 = this.field569 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field569 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field566[7][3] = var15;
    }
}
