package deob;

@ObfuscatedName("ak")
public class class47 {

    @ObfuscatedName("ak.i")
    public int field611;

    @ObfuscatedName("ak.j")
    public byte[][][] field606;

    public class47(int arg0) {
        this.field611 = arg0;
    }

    @ObfuscatedName("ak.i(IIIIIIIII)V")
    public void method610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field611 != 0 && this.field606 != null) {
            int var9 = this.method611(arg7, arg6);
            int var10 = this.method619(arg6);
            class283.method4563(arg0, arg1, arg4, arg5, arg2, arg3, this.field606[var10 - 1][var9], this.field611, true);
        }
    }

    @ObfuscatedName("ak.j(IIB)I")
    public int method611(int arg0, int arg1) {
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

    @ObfuscatedName("ak.a(II)I")
    public int method619(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ak.r(I)V")
    public void method618() {
        if (this.field606 != null) {
            return;
        }
        this.field606 = new byte[8][4][];
        this.method614();
        this.method615();
        this.method616();
        this.method613();
        this.method629();
        this.method612();
        this.method620();
        this.method626();
    }

    @ObfuscatedName("ak.o(B)V")
    public void method614() {
        byte[] var1 = new byte[this.field611 * this.field611];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field611; var3++) {
            for (int var4 = 0; var4 < this.field611; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field606[0][0] = var1;
        byte[] var5 = new byte[this.field611 * this.field611];
        int var6 = 0;
        for (int var7 = this.field611 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field611; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field606[0][1] = var5;
        byte[] var9 = new byte[this.field611 * this.field611];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field611; var11++) {
            for (int var12 = 0; var12 < this.field611; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field606[0][2] = var9;
        byte[] var13 = new byte[this.field611 * this.field611];
        int var14 = 0;
        for (int var15 = this.field611 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field611; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field606[0][3] = var13;
    }

    @ObfuscatedName("ak.n(B)V")
    public void method615() {
        byte[] var1 = new byte[this.field611 * this.field611];
        int var2 = 0;
        for (int var3 = this.field611 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field611; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field606[1][0] = var1;
        byte[] var5 = new byte[this.field611 * this.field611];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field611; var7++) {
            for (int var8 = 0; var8 < this.field611; var8++) {
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
        this.field606[1][1] = var5;
        byte[] var9 = new byte[this.field611 * this.field611];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field611; var11++) {
            for (int var12 = this.field611 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field606[1][2] = var9;
        byte[] var13 = new byte[this.field611 * this.field611];
        int var14 = 0;
        for (int var15 = this.field611 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field611 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field606[1][3] = var13;
    }

    @ObfuscatedName("ak.q(I)V")
    public void method616() {
        byte[] var1 = new byte[this.field611 * this.field611];
        int var2 = 0;
        for (int var3 = this.field611 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field611 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field606[2][0] = var1;
        byte[] var5 = new byte[this.field611 * this.field611];
        int var6 = 0;
        for (int var7 = this.field611 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field611; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field606[2][1] = var5;
        byte[] var9 = new byte[this.field611 * this.field611];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field611; var11++) {
            for (int var12 = 0; var12 < this.field611; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field606[2][2] = var9;
        byte[] var13 = new byte[this.field611 * this.field611];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field611; var15++) {
            for (int var16 = this.field611 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field606[2][3] = var13;
    }

    @ObfuscatedName("ak.b(I)V")
    public void method613() {
        byte[] var1 = new byte[this.field611 * this.field611];
        int var2 = 0;
        for (int var3 = this.field611 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field611; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field606[3][0] = var1;
        byte[] var5 = new byte[this.field611 * this.field611];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field611; var7++) {
            for (int var8 = 0; var8 < this.field611; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field606[3][1] = var5;
        byte[] var9 = new byte[this.field611 * this.field611];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field611; var11++) {
            for (int var12 = this.field611 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field606[3][2] = var9;
        byte[] var13 = new byte[this.field611 * this.field611];
        int var14 = 0;
        for (int var15 = this.field611 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field611 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field606[3][3] = var13;
    }

    @ObfuscatedName("ak.k(I)V")
    public void method629() {
        byte[] var1 = new byte[this.field611 * this.field611];
        int var2 = 0;
        for (int var3 = this.field611 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field611 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field606[4][0] = var1;
        byte[] var5 = new byte[this.field611 * this.field611];
        int var6 = 0;
        for (int var7 = this.field611 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field611; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field606[4][1] = var5;
        byte[] var9 = new byte[this.field611 * this.field611];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field611; var11++) {
            for (int var12 = 0; var12 < this.field611; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field606[4][2] = var9;
        byte[] var13 = new byte[this.field611 * this.field611];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field611; var15++) {
            for (int var16 = this.field611 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field606[4][3] = var13;
    }

    @ObfuscatedName("ak.s(S)V")
    public void method612() {
        byte[] var1 = new byte[this.field611 * this.field611];
        boolean var2 = false;
        byte[] var3 = new byte[this.field611 * this.field611];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field611; var5++) {
            for (int var6 = 0; var6 < this.field611; var6++) {
                if (var6 <= this.field611 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field606[5][0] = var3;
        byte[] var7 = new byte[this.field611 * this.field611];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field611; var9++) {
            for (int var10 = 0; var10 < this.field611; var10++) {
                if (var9 <= this.field611 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field606[5][1] = var7;
        byte[] var11 = new byte[this.field611 * this.field611];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field611; var13++) {
            for (int var14 = 0; var14 < this.field611; var14++) {
                if (var14 >= this.field611 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field606[5][2] = var11;
        byte[] var15 = new byte[this.field611 * this.field611];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field611; var17++) {
            for (int var18 = 0; var18 < this.field611; var18++) {
                if (var17 >= this.field611 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field606[5][3] = var15;
    }

    @ObfuscatedName("ak.d(I)V")
    public void method620() {
        byte[] var1 = new byte[this.field611 * this.field611];
        boolean var2 = false;
        byte[] var3 = new byte[this.field611 * this.field611];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field611; var5++) {
            for (int var6 = 0; var6 < this.field611; var6++) {
                if (var6 <= var5 - this.field611 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field606[6][0] = var3;
        byte[] var7 = new byte[this.field611 * this.field611];
        int var8 = 0;
        for (int var9 = this.field611 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field611; var10++) {
                if (var10 <= var9 - this.field611 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field606[6][1] = var7;
        byte[] var11 = new byte[this.field611 * this.field611];
        int var12 = 0;
        for (int var13 = this.field611 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field611 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field611 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field606[6][2] = var11;
        byte[] var15 = new byte[this.field611 * this.field611];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field611; var17++) {
            for (int var18 = this.field611 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field611 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field606[6][3] = var15;
    }

    @ObfuscatedName("ak.l(I)V")
    public void method626() {
        byte[] var1 = new byte[this.field611 * this.field611];
        boolean var2 = false;
        byte[] var3 = new byte[this.field611 * this.field611];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field611; var5++) {
            for (int var6 = 0; var6 < this.field611; var6++) {
                if (var6 >= var5 - this.field611 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field606[7][0] = var3;
        byte[] var7 = new byte[this.field611 * this.field611];
        int var8 = 0;
        for (int var9 = this.field611 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field611; var10++) {
                if (var10 >= var9 - this.field611 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field606[7][1] = var7;
        byte[] var11 = new byte[this.field611 * this.field611];
        int var12 = 0;
        for (int var13 = this.field611 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field611 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field611 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field606[7][2] = var11;
        byte[] var15 = new byte[this.field611 * this.field611];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field611; var17++) {
            for (int var18 = this.field611 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field611 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field606[7][3] = var15;
    }
}
