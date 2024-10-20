package deob;

@ObfuscatedName("ab")
public class class47 {

    @ObfuscatedName("ab.b")
    public int field550;

    @ObfuscatedName("ab.s")
    public byte[][][] field551;

    public class47(int arg0) {
        this.field550 = arg0;
    }

    @ObfuscatedName("ab.b(IIIIIIIII)V")
    public void method560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field550 != 0 && this.field551 != null) {
            int var9 = this.method561(arg7, arg6);
            int var10 = this.method562(arg6);
            class291.method4677(arg0, arg1, arg4, arg5, arg2, arg3, this.field551[var10 - 1][var9], this.field550, true);
        }
    }

    @ObfuscatedName("ab.s(III)I")
    public int method561(int arg0, int arg1) {
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

    @ObfuscatedName("ab.r(IB)I")
    public int method562(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ab.g(I)V")
    public void method576() {
        if (this.field551 != null) {
            return;
        }
        this.field551 = new byte[8][4][];
        this.method584();
        this.method564();
        this.method574();
        this.method573();
        this.method567();
        this.method571();
        this.method569();
        this.method565();
    }

    @ObfuscatedName("ab.x(I)V")
    public void method584() {
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
        this.field551[0][0] = var1;
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
        this.field551[0][1] = var5;
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
        this.field551[0][2] = var9;
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
        this.field551[0][3] = var13;
    }

    @ObfuscatedName("ab.f(I)V")
    public void method564() {
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
        this.field551[1][0] = var1;
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
        this.field551[1][1] = var5;
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
        this.field551[1][2] = var9;
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
        this.field551[1][3] = var13;
    }

    @ObfuscatedName("ab.u(I)V")
    public void method574() {
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
        this.field551[2][0] = var1;
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
        this.field551[2][1] = var5;
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
        this.field551[2][2] = var9;
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
        this.field551[2][3] = var13;
    }

    @ObfuscatedName("ab.t(I)V")
    public void method573() {
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
        this.field551[3][0] = var1;
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
        this.field551[3][1] = var5;
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
        this.field551[3][2] = var9;
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
        this.field551[3][3] = var13;
    }

    @ObfuscatedName("ab.k(I)V")
    public void method567() {
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
        this.field551[4][0] = var1;
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
        this.field551[4][1] = var5;
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
        this.field551[4][2] = var9;
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
        this.field551[4][3] = var13;
    }

    @ObfuscatedName("ab.n(I)V")
    public void method571() {
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
        this.field551[5][0] = var3;
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
        this.field551[5][1] = var7;
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
        this.field551[5][2] = var11;
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
        this.field551[5][3] = var15;
    }

    @ObfuscatedName("ab.d(B)V")
    public void method569() {
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
        this.field551[6][0] = var3;
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
        this.field551[6][1] = var7;
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
        this.field551[6][2] = var11;
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
        this.field551[6][3] = var15;
    }

    @ObfuscatedName("ab.o(I)V")
    public void method565() {
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
        this.field551[7][0] = var3;
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
        this.field551[7][1] = var7;
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
        this.field551[7][2] = var11;
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
        this.field551[7][3] = var15;
    }
}
