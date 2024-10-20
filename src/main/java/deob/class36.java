package deob;

@ObfuscatedName("ai")
public class class36 {

    @ObfuscatedName("ai.z")
    public int field304;

    @ObfuscatedName("ai.w")
    public byte[][][] field305;

    public class36(int arg0) {
        this.field304 = arg0;
    }

    @ObfuscatedName("ai.z(IIIIIIIII)V")
    public void method547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field304 != 0 && this.field305 != null) {
            int var9 = this.method531(arg7, arg6);
            int var10 = this.method532(arg6);
            class315.method5301(arg0, arg1, arg4, arg5, arg2, arg3, this.field305[var10 - 1][var9], this.field304, true);
        }
    }

    @ObfuscatedName("ai.w(IIB)I")
    public int method531(int arg0, int arg1) {
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

    @ObfuscatedName("ai.s(II)I")
    public int method532(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ai.l(I)V")
    public void method533() {
        if (this.field305 != null) {
            return;
        }
        this.field305 = new byte[8][4][];
        this.method534();
        this.method566();
        this.method548();
        this.method537();
        this.method553();
        this.method539();
        this.method570();
        this.method536();
    }

    @ObfuscatedName("ai.u(I)V")
    public void method534() {
        byte[] var1 = new byte[this.field304 * this.field304];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field304; var3++) {
            for (int var4 = 0; var4 < this.field304; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field305[0][0] = var1;
        byte[] var5 = new byte[this.field304 * this.field304];
        int var6 = 0;
        for (int var7 = this.field304 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field304; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field305[0][1] = var5;
        byte[] var9 = new byte[this.field304 * this.field304];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field304; var11++) {
            for (int var12 = 0; var12 < this.field304; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field305[0][2] = var9;
        byte[] var13 = new byte[this.field304 * this.field304];
        int var14 = 0;
        for (int var15 = this.field304 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field304; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field305[0][3] = var13;
    }

    @ObfuscatedName("ai.q(I)V")
    public void method566() {
        byte[] var1 = new byte[this.field304 * this.field304];
        int var2 = 0;
        for (int var3 = this.field304 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field304; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field305[1][0] = var1;
        byte[] var5 = new byte[this.field304 * this.field304];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field304; var7++) {
            for (int var8 = 0; var8 < this.field304; var8++) {
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
        this.field305[1][1] = var5;
        byte[] var9 = new byte[this.field304 * this.field304];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field304; var11++) {
            for (int var12 = this.field304 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field305[1][2] = var9;
        byte[] var13 = new byte[this.field304 * this.field304];
        int var14 = 0;
        for (int var15 = this.field304 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field304 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field305[1][3] = var13;
    }

    @ObfuscatedName("ai.i(B)V")
    public void method548() {
        byte[] var1 = new byte[this.field304 * this.field304];
        int var2 = 0;
        for (int var3 = this.field304 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field304 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field305[2][0] = var1;
        byte[] var5 = new byte[this.field304 * this.field304];
        int var6 = 0;
        for (int var7 = this.field304 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field304; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field305[2][1] = var5;
        byte[] var9 = new byte[this.field304 * this.field304];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field304; var11++) {
            for (int var12 = 0; var12 < this.field304; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field305[2][2] = var9;
        byte[] var13 = new byte[this.field304 * this.field304];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field304; var15++) {
            for (int var16 = this.field304 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field305[2][3] = var13;
    }

    @ObfuscatedName("ai.x(I)V")
    public void method537() {
        byte[] var1 = new byte[this.field304 * this.field304];
        int var2 = 0;
        for (int var3 = this.field304 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field304; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field305[3][0] = var1;
        byte[] var5 = new byte[this.field304 * this.field304];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field304; var7++) {
            for (int var8 = 0; var8 < this.field304; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field305[3][1] = var5;
        byte[] var9 = new byte[this.field304 * this.field304];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field304; var11++) {
            for (int var12 = this.field304 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field305[3][2] = var9;
        byte[] var13 = new byte[this.field304 * this.field304];
        int var14 = 0;
        for (int var15 = this.field304 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field304 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field305[3][3] = var13;
    }

    @ObfuscatedName("ai.e(B)V")
    public void method553() {
        byte[] var1 = new byte[this.field304 * this.field304];
        int var2 = 0;
        for (int var3 = this.field304 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field304 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field305[4][0] = var1;
        byte[] var5 = new byte[this.field304 * this.field304];
        int var6 = 0;
        for (int var7 = this.field304 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field304; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field305[4][1] = var5;
        byte[] var9 = new byte[this.field304 * this.field304];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field304; var11++) {
            for (int var12 = 0; var12 < this.field304; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field305[4][2] = var9;
        byte[] var13 = new byte[this.field304 * this.field304];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field304; var15++) {
            for (int var16 = this.field304 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field305[4][3] = var13;
    }

    @ObfuscatedName("ai.p(I)V")
    public void method539() {
        byte[] var1 = new byte[this.field304 * this.field304];
        boolean var2 = false;
        byte[] var3 = new byte[this.field304 * this.field304];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field304; var5++) {
            for (int var6 = 0; var6 < this.field304; var6++) {
                if (var6 <= this.field304 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field305[5][0] = var3;
        byte[] var7 = new byte[this.field304 * this.field304];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field304; var9++) {
            for (int var10 = 0; var10 < this.field304; var10++) {
                if (var9 <= this.field304 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field305[5][1] = var7;
        byte[] var11 = new byte[this.field304 * this.field304];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field304; var13++) {
            for (int var14 = 0; var14 < this.field304; var14++) {
                if (var14 >= this.field304 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field305[5][2] = var11;
        byte[] var15 = new byte[this.field304 * this.field304];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field304; var17++) {
            for (int var18 = 0; var18 < this.field304; var18++) {
                if (var17 >= this.field304 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field305[5][3] = var15;
    }

    @ObfuscatedName("ai.b(I)V")
    public void method570() {
        byte[] var1 = new byte[this.field304 * this.field304];
        boolean var2 = false;
        byte[] var3 = new byte[this.field304 * this.field304];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field304; var5++) {
            for (int var6 = 0; var6 < this.field304; var6++) {
                if (var6 <= var5 - this.field304 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field305[6][0] = var3;
        byte[] var7 = new byte[this.field304 * this.field304];
        int var8 = 0;
        for (int var9 = this.field304 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field304; var10++) {
                if (var10 <= var9 - this.field304 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field305[6][1] = var7;
        byte[] var11 = new byte[this.field304 * this.field304];
        int var12 = 0;
        for (int var13 = this.field304 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field304 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field304 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field305[6][2] = var11;
        byte[] var15 = new byte[this.field304 * this.field304];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field304; var17++) {
            for (int var18 = this.field304 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field304 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field305[6][3] = var15;
    }

    @ObfuscatedName("ai.n(I)V")
    public void method536() {
        byte[] var1 = new byte[this.field304 * this.field304];
        boolean var2 = false;
        byte[] var3 = new byte[this.field304 * this.field304];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field304; var5++) {
            for (int var6 = 0; var6 < this.field304; var6++) {
                if (var6 >= var5 - this.field304 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field305[7][0] = var3;
        byte[] var7 = new byte[this.field304 * this.field304];
        int var8 = 0;
        for (int var9 = this.field304 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field304; var10++) {
                if (var10 >= var9 - this.field304 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field305[7][1] = var7;
        byte[] var11 = new byte[this.field304 * this.field304];
        int var12 = 0;
        for (int var13 = this.field304 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field304 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field304 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field305[7][2] = var11;
        byte[] var15 = new byte[this.field304 * this.field304];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field304; var17++) {
            for (int var18 = this.field304 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field304 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field305[7][3] = var15;
    }
}
