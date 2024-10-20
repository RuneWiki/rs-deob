package deob;

@ObfuscatedName("aw")
public class class47 {

    @ObfuscatedName("aw.j")
    public int field601;

    @ObfuscatedName("aw.h")
    public byte[][][] field599;

    public class47(int arg0) {
        this.field601 = arg0;
    }

    @ObfuscatedName("aw.j(IIIIIIIII)V")
    public void method605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field601 != 0 && this.field599 != null) {
            int var9 = this.method606(arg7, arg6);
            int var10 = this.method607(arg6);
            class283.method4607(arg0, arg1, arg4, arg5, arg2, arg3, this.field599[var10 - 1][var9], this.field601, true);
        }
    }

    @ObfuscatedName("aw.h(IIB)I")
    public int method606(int arg0, int arg1) {
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

    @ObfuscatedName("aw.f(IB)I")
    public int method607(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("aw.p(I)V")
    public void method619() {
        if (this.field599 != null) {
            return;
        }
        this.field599 = new byte[8][4][];
        this.method609();
        this.method610();
        this.method611();
        this.method612();
        this.method613();
        this.method614();
        this.method628();
        this.method647();
    }

    @ObfuscatedName("aw.x(I)V")
    public void method609() {
        byte[] var1 = new byte[this.field601 * this.field601];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field601; var3++) {
            for (int var4 = 0; var4 < this.field601; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field599[0][0] = var1;
        byte[] var5 = new byte[this.field601 * this.field601];
        int var6 = 0;
        for (int var7 = this.field601 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field601; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field599[0][1] = var5;
        byte[] var9 = new byte[this.field601 * this.field601];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field601; var11++) {
            for (int var12 = 0; var12 < this.field601; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field599[0][2] = var9;
        byte[] var13 = new byte[this.field601 * this.field601];
        int var14 = 0;
        for (int var15 = this.field601 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field601; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field599[0][3] = var13;
    }

    @ObfuscatedName("aw.g(I)V")
    public void method610() {
        byte[] var1 = new byte[this.field601 * this.field601];
        int var2 = 0;
        for (int var3 = this.field601 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field601; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field599[1][0] = var1;
        byte[] var5 = new byte[this.field601 * this.field601];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field601; var7++) {
            for (int var8 = 0; var8 < this.field601; var8++) {
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
        this.field599[1][1] = var5;
        byte[] var9 = new byte[this.field601 * this.field601];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field601; var11++) {
            for (int var12 = this.field601 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field599[1][2] = var9;
        byte[] var13 = new byte[this.field601 * this.field601];
        int var14 = 0;
        for (int var15 = this.field601 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field601 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field599[1][3] = var13;
    }

    @ObfuscatedName("aw.c(B)V")
    public void method611() {
        byte[] var1 = new byte[this.field601 * this.field601];
        int var2 = 0;
        for (int var3 = this.field601 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field601 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field599[2][0] = var1;
        byte[] var5 = new byte[this.field601 * this.field601];
        int var6 = 0;
        for (int var7 = this.field601 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field601; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field599[2][1] = var5;
        byte[] var9 = new byte[this.field601 * this.field601];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field601; var11++) {
            for (int var12 = 0; var12 < this.field601; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field599[2][2] = var9;
        byte[] var13 = new byte[this.field601 * this.field601];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field601; var15++) {
            for (int var16 = this.field601 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field599[2][3] = var13;
    }

    @ObfuscatedName("aw.l(I)V")
    public void method612() {
        byte[] var1 = new byte[this.field601 * this.field601];
        int var2 = 0;
        for (int var3 = this.field601 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field601; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field599[3][0] = var1;
        byte[] var5 = new byte[this.field601 * this.field601];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field601; var7++) {
            for (int var8 = 0; var8 < this.field601; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field599[3][1] = var5;
        byte[] var9 = new byte[this.field601 * this.field601];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field601; var11++) {
            for (int var12 = this.field601 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field599[3][2] = var9;
        byte[] var13 = new byte[this.field601 * this.field601];
        int var14 = 0;
        for (int var15 = this.field601 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field601 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field599[3][3] = var13;
    }

    @ObfuscatedName("aw.w(B)V")
    public void method613() {
        byte[] var1 = new byte[this.field601 * this.field601];
        int var2 = 0;
        for (int var3 = this.field601 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field601 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field599[4][0] = var1;
        byte[] var5 = new byte[this.field601 * this.field601];
        int var6 = 0;
        for (int var7 = this.field601 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field601; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field599[4][1] = var5;
        byte[] var9 = new byte[this.field601 * this.field601];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field601; var11++) {
            for (int var12 = 0; var12 < this.field601; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field599[4][2] = var9;
        byte[] var13 = new byte[this.field601 * this.field601];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field601; var15++) {
            for (int var16 = this.field601 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field599[4][3] = var13;
    }

    @ObfuscatedName("aw.b(B)V")
    public void method614() {
        byte[] var1 = new byte[this.field601 * this.field601];
        boolean var2 = false;
        byte[] var3 = new byte[this.field601 * this.field601];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field601; var5++) {
            for (int var6 = 0; var6 < this.field601; var6++) {
                if (var6 <= this.field601 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field599[5][0] = var3;
        byte[] var7 = new byte[this.field601 * this.field601];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field601; var9++) {
            for (int var10 = 0; var10 < this.field601; var10++) {
                if (var9 <= this.field601 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field599[5][1] = var7;
        byte[] var11 = new byte[this.field601 * this.field601];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field601; var13++) {
            for (int var14 = 0; var14 < this.field601; var14++) {
                if (var14 >= this.field601 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field599[5][2] = var11;
        byte[] var15 = new byte[this.field601 * this.field601];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field601; var17++) {
            for (int var18 = 0; var18 < this.field601; var18++) {
                if (var17 >= this.field601 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field599[5][3] = var15;
    }

    @ObfuscatedName("aw.o(I)V")
    public void method628() {
        byte[] var1 = new byte[this.field601 * this.field601];
        boolean var2 = false;
        byte[] var3 = new byte[this.field601 * this.field601];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field601; var5++) {
            for (int var6 = 0; var6 < this.field601; var6++) {
                if (var6 <= var5 - this.field601 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field599[6][0] = var3;
        byte[] var7 = new byte[this.field601 * this.field601];
        int var8 = 0;
        for (int var9 = this.field601 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field601; var10++) {
                if (var10 <= var9 - this.field601 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field599[6][1] = var7;
        byte[] var11 = new byte[this.field601 * this.field601];
        int var12 = 0;
        for (int var13 = this.field601 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field601 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field601 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field599[6][2] = var11;
        byte[] var15 = new byte[this.field601 * this.field601];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field601; var17++) {
            for (int var18 = this.field601 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field601 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field599[6][3] = var15;
    }

    @ObfuscatedName("aw.m(I)V")
    public void method647() {
        byte[] var1 = new byte[this.field601 * this.field601];
        boolean var2 = false;
        byte[] var3 = new byte[this.field601 * this.field601];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field601; var5++) {
            for (int var6 = 0; var6 < this.field601; var6++) {
                if (var6 >= var5 - this.field601 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field599[7][0] = var3;
        byte[] var7 = new byte[this.field601 * this.field601];
        int var8 = 0;
        for (int var9 = this.field601 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field601; var10++) {
                if (var10 >= var9 - this.field601 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field599[7][1] = var7;
        byte[] var11 = new byte[this.field601 * this.field601];
        int var12 = 0;
        for (int var13 = this.field601 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field601 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field601 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field599[7][2] = var11;
        byte[] var15 = new byte[this.field601 * this.field601];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field601; var17++) {
            for (int var18 = this.field601 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field601 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field599[7][3] = var15;
    }
}
