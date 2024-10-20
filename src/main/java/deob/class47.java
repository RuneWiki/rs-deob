package deob;

@ObfuscatedName("aa")
public class class47 {

    @ObfuscatedName("aa.b")
    public int field550;

    @ObfuscatedName("aa.q")
    public byte[][][] field547;

    public class47(int arg0) {
        this.field550 = arg0;
    }

    @ObfuscatedName("aa.b(IIIIIIIII)V")
    public void method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field550 != 0 && this.field547 != null) {
            int var9 = this.method608(arg7, arg6);
            int var10 = this.method612(arg6);
            class319.method5226(arg0, arg1, arg4, arg5, arg2, arg3, this.field547[var10 - 1][var9], this.field550, true);
        }
    }

    @ObfuscatedName("aa.q(III)I")
    public int method608(int arg0, int arg1) {
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

    @ObfuscatedName("aa.o(II)I")
    public int method612(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("aa.p(B)V")
    public void method610() {
        if (this.field547 != null) {
            return;
        }
        this.field547 = new byte[8][4][];
        this.method640();
        this.method616();
        this.method613();
        this.method606();
        this.method615();
        this.method628();
        this.method645();
        this.method618();
    }

    @ObfuscatedName("aa.a(I)V")
    public void method640() {
        byte[] var1 = new byte[this.field550 * this.field550];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field550; var3++) {
            for (int var4 = 0; var4 < this.field550; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field547[0][0] = var1;
        byte[] var5 = new byte[this.field550 * this.field550];
        int var6 = 0;
        for (int var7 = this.field550 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field550; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field547[0][1] = var5;
        byte[] var9 = new byte[this.field550 * this.field550];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field550; var11++) {
            for (int var12 = 0; var12 < this.field550; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field547[0][2] = var9;
        byte[] var13 = new byte[this.field550 * this.field550];
        int var14 = 0;
        for (int var15 = this.field550 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field550; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field547[0][3] = var13;
    }

    @ObfuscatedName("aa.h(I)V")
    public void method616() {
        byte[] var1 = new byte[this.field550 * this.field550];
        int var2 = 0;
        for (int var3 = this.field550 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field550; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field547[1][0] = var1;
        byte[] var5 = new byte[this.field550 * this.field550];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field550; var7++) {
            for (int var8 = 0; var8 < this.field550; var8++) {
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
        this.field547[1][1] = var5;
        byte[] var9 = new byte[this.field550 * this.field550];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field550; var11++) {
            for (int var12 = this.field550 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field547[1][2] = var9;
        byte[] var13 = new byte[this.field550 * this.field550];
        int var14 = 0;
        for (int var15 = this.field550 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field550 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field547[1][3] = var13;
    }

    @ObfuscatedName("aa.l(I)V")
    public void method613() {
        byte[] var1 = new byte[this.field550 * this.field550];
        int var2 = 0;
        for (int var3 = this.field550 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field550 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field547[2][0] = var1;
        byte[] var5 = new byte[this.field550 * this.field550];
        int var6 = 0;
        for (int var7 = this.field550 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field550; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field547[2][1] = var5;
        byte[] var9 = new byte[this.field550 * this.field550];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field550; var11++) {
            for (int var12 = 0; var12 < this.field550; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field547[2][2] = var9;
        byte[] var13 = new byte[this.field550 * this.field550];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field550; var15++) {
            for (int var16 = this.field550 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field547[2][3] = var13;
    }

    @ObfuscatedName("aa.y(B)V")
    public void method606() {
        byte[] var1 = new byte[this.field550 * this.field550];
        int var2 = 0;
        for (int var3 = this.field550 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field550; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field547[3][0] = var1;
        byte[] var5 = new byte[this.field550 * this.field550];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field550; var7++) {
            for (int var8 = 0; var8 < this.field550; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field547[3][1] = var5;
        byte[] var9 = new byte[this.field550 * this.field550];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field550; var11++) {
            for (int var12 = this.field550 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field547[3][2] = var9;
        byte[] var13 = new byte[this.field550 * this.field550];
        int var14 = 0;
        for (int var15 = this.field550 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field550 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field547[3][3] = var13;
    }

    @ObfuscatedName("aa.g(B)V")
    public void method615() {
        byte[] var1 = new byte[this.field550 * this.field550];
        int var2 = 0;
        for (int var3 = this.field550 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field550 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field547[4][0] = var1;
        byte[] var5 = new byte[this.field550 * this.field550];
        int var6 = 0;
        for (int var7 = this.field550 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field550; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field547[4][1] = var5;
        byte[] var9 = new byte[this.field550 * this.field550];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field550; var11++) {
            for (int var12 = 0; var12 < this.field550; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field547[4][2] = var9;
        byte[] var13 = new byte[this.field550 * this.field550];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field550; var15++) {
            for (int var16 = this.field550 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field547[4][3] = var13;
    }

    @ObfuscatedName("aa.c(I)V")
    public void method628() {
        byte[] var1 = new byte[this.field550 * this.field550];
        boolean var2 = false;
        byte[] var3 = new byte[this.field550 * this.field550];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field550; var5++) {
            for (int var6 = 0; var6 < this.field550; var6++) {
                if (var6 <= this.field550 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field547[5][0] = var3;
        byte[] var7 = new byte[this.field550 * this.field550];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field550; var9++) {
            for (int var10 = 0; var10 < this.field550; var10++) {
                if (var9 <= this.field550 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field547[5][1] = var7;
        byte[] var11 = new byte[this.field550 * this.field550];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field550; var13++) {
            for (int var14 = 0; var14 < this.field550; var14++) {
                if (var14 >= this.field550 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field547[5][2] = var11;
        byte[] var15 = new byte[this.field550 * this.field550];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field550; var17++) {
            for (int var18 = 0; var18 < this.field550; var18++) {
                if (var17 >= this.field550 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field547[5][3] = var15;
    }

    @ObfuscatedName("aa.u(I)V")
    public void method645() {
        byte[] var1 = new byte[this.field550 * this.field550];
        boolean var2 = false;
        byte[] var3 = new byte[this.field550 * this.field550];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field550; var5++) {
            for (int var6 = 0; var6 < this.field550; var6++) {
                if (var6 <= var5 - this.field550 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field547[6][0] = var3;
        byte[] var7 = new byte[this.field550 * this.field550];
        int var8 = 0;
        for (int var9 = this.field550 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field550; var10++) {
                if (var10 <= var9 - this.field550 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field547[6][1] = var7;
        byte[] var11 = new byte[this.field550 * this.field550];
        int var12 = 0;
        for (int var13 = this.field550 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field550 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field550 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field547[6][2] = var11;
        byte[] var15 = new byte[this.field550 * this.field550];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field550; var17++) {
            for (int var18 = this.field550 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field550 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field547[6][3] = var15;
    }

    @ObfuscatedName("aa.t(I)V")
    public void method618() {
        byte[] var1 = new byte[this.field550 * this.field550];
        boolean var2 = false;
        byte[] var3 = new byte[this.field550 * this.field550];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field550; var5++) {
            for (int var6 = 0; var6 < this.field550; var6++) {
                if (var6 >= var5 - this.field550 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field547[7][0] = var3;
        byte[] var7 = new byte[this.field550 * this.field550];
        int var8 = 0;
        for (int var9 = this.field550 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field550; var10++) {
                if (var10 >= var9 - this.field550 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field547[7][1] = var7;
        byte[] var11 = new byte[this.field550 * this.field550];
        int var12 = 0;
        for (int var13 = this.field550 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field550 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field550 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field547[7][2] = var11;
        byte[] var15 = new byte[this.field550 * this.field550];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field550; var17++) {
            for (int var18 = this.field550 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field550 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field547[7][3] = var15;
    }
}
