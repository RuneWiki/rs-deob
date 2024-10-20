package deob;

@ObfuscatedName("au")
public class class36 {

    @ObfuscatedName("au.y")
    public int field329;

    @ObfuscatedName("au.c")
    public byte[][][] field328;

    public class36(int arg0) {
        this.field329 = arg0;
    }

    @ObfuscatedName("au.y(IIIIIIIII)V")
    public void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field329 != 0 && this.field328 != null) {
            int var9 = this.method554(arg7, arg6);
            int var10 = this.method565(arg6);
            class320.method5375(arg0, arg1, arg4, arg5, arg2, arg3, this.field328[var10 - 1][var9], this.field329, true);
        }
    }

    @ObfuscatedName("au.c(IIB)I")
    public int method554(int arg0, int arg1) {
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

    @ObfuscatedName("au.n(II)I")
    public int method565(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("au.u(I)V")
    public void method556() {
        if (this.field328 != null) {
            return;
        }
        this.field328 = new byte[8][4][];
        this.method557();
        this.method558();
        this.method555();
        this.method592();
        this.method561();
        this.method562();
        this.method563();
        this.method564();
    }

    @ObfuscatedName("au.i(B)V")
    public void method557() {
        byte[] var1 = new byte[this.field329 * this.field329];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field329; var3++) {
            for (int var4 = 0; var4 < this.field329; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field328[0][0] = var1;
        byte[] var5 = new byte[this.field329 * this.field329];
        int var6 = 0;
        for (int var7 = this.field329 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field329; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field328[0][1] = var5;
        byte[] var9 = new byte[this.field329 * this.field329];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field329; var11++) {
            for (int var12 = 0; var12 < this.field329; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field328[0][2] = var9;
        byte[] var13 = new byte[this.field329 * this.field329];
        int var14 = 0;
        for (int var15 = this.field329 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field329; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field328[0][3] = var13;
    }

    @ObfuscatedName("au.p(I)V")
    public void method558() {
        byte[] var1 = new byte[this.field329 * this.field329];
        int var2 = 0;
        for (int var3 = this.field329 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field329; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field328[1][0] = var1;
        byte[] var5 = new byte[this.field329 * this.field329];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field329; var7++) {
            for (int var8 = 0; var8 < this.field329; var8++) {
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
        this.field328[1][1] = var5;
        byte[] var9 = new byte[this.field329 * this.field329];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field329; var11++) {
            for (int var12 = this.field329 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field328[1][2] = var9;
        byte[] var13 = new byte[this.field329 * this.field329];
        int var14 = 0;
        for (int var15 = this.field329 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field329 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field328[1][3] = var13;
    }

    @ObfuscatedName("au.e(I)V")
    public void method555() {
        byte[] var1 = new byte[this.field329 * this.field329];
        int var2 = 0;
        for (int var3 = this.field329 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field329 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field328[2][0] = var1;
        byte[] var5 = new byte[this.field329 * this.field329];
        int var6 = 0;
        for (int var7 = this.field329 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field329; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field328[2][1] = var5;
        byte[] var9 = new byte[this.field329 * this.field329];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field329; var11++) {
            for (int var12 = 0; var12 < this.field329; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field328[2][2] = var9;
        byte[] var13 = new byte[this.field329 * this.field329];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field329; var15++) {
            for (int var16 = this.field329 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field328[2][3] = var13;
    }

    @ObfuscatedName("au.s(I)V")
    public void method592() {
        byte[] var1 = new byte[this.field329 * this.field329];
        int var2 = 0;
        for (int var3 = this.field329 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field329; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field328[3][0] = var1;
        byte[] var5 = new byte[this.field329 * this.field329];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field329; var7++) {
            for (int var8 = 0; var8 < this.field329; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field328[3][1] = var5;
        byte[] var9 = new byte[this.field329 * this.field329];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field329; var11++) {
            for (int var12 = this.field329 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field328[3][2] = var9;
        byte[] var13 = new byte[this.field329 * this.field329];
        int var14 = 0;
        for (int var15 = this.field329 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field329 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field328[3][3] = var13;
    }

    @ObfuscatedName("au.v(I)V")
    public void method561() {
        byte[] var1 = new byte[this.field329 * this.field329];
        int var2 = 0;
        for (int var3 = this.field329 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field329 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field328[4][0] = var1;
        byte[] var5 = new byte[this.field329 * this.field329];
        int var6 = 0;
        for (int var7 = this.field329 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field329; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field328[4][1] = var5;
        byte[] var9 = new byte[this.field329 * this.field329];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field329; var11++) {
            for (int var12 = 0; var12 < this.field329; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field328[4][2] = var9;
        byte[] var13 = new byte[this.field329 * this.field329];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field329; var15++) {
            for (int var16 = this.field329 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field328[4][3] = var13;
    }

    @ObfuscatedName("au.k(I)V")
    public void method562() {
        byte[] var1 = new byte[this.field329 * this.field329];
        boolean var2 = false;
        byte[] var3 = new byte[this.field329 * this.field329];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field329; var5++) {
            for (int var6 = 0; var6 < this.field329; var6++) {
                if (var6 <= this.field329 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field328[5][0] = var3;
        byte[] var7 = new byte[this.field329 * this.field329];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field329; var9++) {
            for (int var10 = 0; var10 < this.field329; var10++) {
                if (var9 <= this.field329 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field328[5][1] = var7;
        byte[] var11 = new byte[this.field329 * this.field329];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field329; var13++) {
            for (int var14 = 0; var14 < this.field329; var14++) {
                if (var14 >= this.field329 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field328[5][2] = var11;
        byte[] var15 = new byte[this.field329 * this.field329];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field329; var17++) {
            for (int var18 = 0; var18 < this.field329; var18++) {
                if (var17 >= this.field329 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field328[5][3] = var15;
    }

    @ObfuscatedName("au.o(I)V")
    public void method563() {
        byte[] var1 = new byte[this.field329 * this.field329];
        boolean var2 = false;
        byte[] var3 = new byte[this.field329 * this.field329];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field329; var5++) {
            for (int var6 = 0; var6 < this.field329; var6++) {
                if (var6 <= var5 - this.field329 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field328[6][0] = var3;
        byte[] var7 = new byte[this.field329 * this.field329];
        int var8 = 0;
        for (int var9 = this.field329 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field329; var10++) {
                if (var10 <= var9 - this.field329 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field328[6][1] = var7;
        byte[] var11 = new byte[this.field329 * this.field329];
        int var12 = 0;
        for (int var13 = this.field329 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field329 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field329 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field328[6][2] = var11;
        byte[] var15 = new byte[this.field329 * this.field329];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field329; var17++) {
            for (int var18 = this.field329 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field329 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field328[6][3] = var15;
    }

    @ObfuscatedName("au.q(I)V")
    public void method564() {
        byte[] var1 = new byte[this.field329 * this.field329];
        boolean var2 = false;
        byte[] var3 = new byte[this.field329 * this.field329];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field329; var5++) {
            for (int var6 = 0; var6 < this.field329; var6++) {
                if (var6 >= var5 - this.field329 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field328[7][0] = var3;
        byte[] var7 = new byte[this.field329 * this.field329];
        int var8 = 0;
        for (int var9 = this.field329 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field329; var10++) {
                if (var10 >= var9 - this.field329 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field328[7][1] = var7;
        byte[] var11 = new byte[this.field329 * this.field329];
        int var12 = 0;
        for (int var13 = this.field329 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field329 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field329 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field328[7][2] = var11;
        byte[] var15 = new byte[this.field329 * this.field329];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field329; var17++) {
            for (int var18 = this.field329 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field329 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field328[7][3] = var15;
    }
}
