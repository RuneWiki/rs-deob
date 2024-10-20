package deob;

@ObfuscatedName("af")
public class class50 {

    @ObfuscatedName("af.z")
    public int field374;

    @ObfuscatedName("af.k")
    public byte[][][] field367;

    public class50(int arg0) {
        this.field374 = arg0;
    }

    @ObfuscatedName("af.z(IIIIIIIII)V")
    public void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field374 != 0 && this.field367 != null) {
            int var9 = this.method665(arg7, arg6);
            int var10 = this.method702(arg6);
            class331.method5664(arg0, arg1, arg4, arg5, arg2, arg3, this.field367[var10 - 1][var9], this.field374, true);
        }
    }

    @ObfuscatedName("af.k(III)I")
    public int method665(int arg0, int arg1) {
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

    @ObfuscatedName("af.s(IB)I")
    public int method702(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("af.t(I)V")
    public void method663() {
        if (this.field367 != null) {
            return;
        }
        this.field367 = new byte[8][4][];
        this.method664();
        this.method693();
        this.method666();
        this.method667();
        this.method668();
        this.method669();
        this.method670();
        this.method671();
    }

    @ObfuscatedName("af.i(B)V")
    public void method664() {
        byte[] var1 = new byte[this.field374 * this.field374];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field374; var3++) {
            for (int var4 = 0; var4 < this.field374; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field367[0][0] = var1;
        byte[] var5 = new byte[this.field374 * this.field374];
        int var6 = 0;
        for (int var7 = this.field374 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field374; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field367[0][1] = var5;
        byte[] var9 = new byte[this.field374 * this.field374];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field374; var11++) {
            for (int var12 = 0; var12 < this.field374; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field367[0][2] = var9;
        byte[] var13 = new byte[this.field374 * this.field374];
        int var14 = 0;
        for (int var15 = this.field374 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field374; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field367[0][3] = var13;
    }

    @ObfuscatedName("af.o(I)V")
    public void method693() {
        byte[] var1 = new byte[this.field374 * this.field374];
        int var2 = 0;
        for (int var3 = this.field374 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field374; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field367[1][0] = var1;
        byte[] var5 = new byte[this.field374 * this.field374];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field374; var7++) {
            for (int var8 = 0; var8 < this.field374; var8++) {
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
        this.field367[1][1] = var5;
        byte[] var9 = new byte[this.field374 * this.field374];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field374; var11++) {
            for (int var12 = this.field374 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field367[1][2] = var9;
        byte[] var13 = new byte[this.field374 * this.field374];
        int var14 = 0;
        for (int var15 = this.field374 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field374 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field367[1][3] = var13;
    }

    @ObfuscatedName("af.x(I)V")
    public void method666() {
        byte[] var1 = new byte[this.field374 * this.field374];
        int var2 = 0;
        for (int var3 = this.field374 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field374 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field367[2][0] = var1;
        byte[] var5 = new byte[this.field374 * this.field374];
        int var6 = 0;
        for (int var7 = this.field374 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field374; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field367[2][1] = var5;
        byte[] var9 = new byte[this.field374 * this.field374];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field374; var11++) {
            for (int var12 = 0; var12 < this.field374; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field367[2][2] = var9;
        byte[] var13 = new byte[this.field374 * this.field374];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field374; var15++) {
            for (int var16 = this.field374 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field367[2][3] = var13;
    }

    @ObfuscatedName("af.w(I)V")
    public void method667() {
        byte[] var1 = new byte[this.field374 * this.field374];
        int var2 = 0;
        for (int var3 = this.field374 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field374; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field367[3][0] = var1;
        byte[] var5 = new byte[this.field374 * this.field374];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field374; var7++) {
            for (int var8 = 0; var8 < this.field374; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field367[3][1] = var5;
        byte[] var9 = new byte[this.field374 * this.field374];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field374; var11++) {
            for (int var12 = this.field374 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field367[3][2] = var9;
        byte[] var13 = new byte[this.field374 * this.field374];
        int var14 = 0;
        for (int var15 = this.field374 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field374 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field367[3][3] = var13;
    }

    @ObfuscatedName("af.g(I)V")
    public void method668() {
        byte[] var1 = new byte[this.field374 * this.field374];
        int var2 = 0;
        for (int var3 = this.field374 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field374 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field367[4][0] = var1;
        byte[] var5 = new byte[this.field374 * this.field374];
        int var6 = 0;
        for (int var7 = this.field374 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field374; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field367[4][1] = var5;
        byte[] var9 = new byte[this.field374 * this.field374];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field374; var11++) {
            for (int var12 = 0; var12 < this.field374; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field367[4][2] = var9;
        byte[] var13 = new byte[this.field374 * this.field374];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field374; var15++) {
            for (int var16 = this.field374 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field367[4][3] = var13;
    }

    @ObfuscatedName("af.m(I)V")
    public void method669() {
        byte[] var1 = new byte[this.field374 * this.field374];
        boolean var2 = false;
        byte[] var3 = new byte[this.field374 * this.field374];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field374; var5++) {
            for (int var6 = 0; var6 < this.field374; var6++) {
                if (var6 <= this.field374 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field367[5][0] = var3;
        byte[] var7 = new byte[this.field374 * this.field374];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field374; var9++) {
            for (int var10 = 0; var10 < this.field374; var10++) {
                if (var9 <= this.field374 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field367[5][1] = var7;
        byte[] var11 = new byte[this.field374 * this.field374];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field374; var13++) {
            for (int var14 = 0; var14 < this.field374; var14++) {
                if (var14 >= this.field374 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field367[5][2] = var11;
        byte[] var15 = new byte[this.field374 * this.field374];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field374; var17++) {
            for (int var18 = 0; var18 < this.field374; var18++) {
                if (var17 >= this.field374 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field367[5][3] = var15;
    }

    @ObfuscatedName("af.n(I)V")
    public void method670() {
        byte[] var1 = new byte[this.field374 * this.field374];
        boolean var2 = false;
        byte[] var3 = new byte[this.field374 * this.field374];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field374; var5++) {
            for (int var6 = 0; var6 < this.field374; var6++) {
                if (var6 <= var5 - this.field374 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field367[6][0] = var3;
        byte[] var7 = new byte[this.field374 * this.field374];
        int var8 = 0;
        for (int var9 = this.field374 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field374; var10++) {
                if (var10 <= var9 - this.field374 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field367[6][1] = var7;
        byte[] var11 = new byte[this.field374 * this.field374];
        int var12 = 0;
        for (int var13 = this.field374 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field374 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field374 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field367[6][2] = var11;
        byte[] var15 = new byte[this.field374 * this.field374];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field374; var17++) {
            for (int var18 = this.field374 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field374 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field367[6][3] = var15;
    }

    @ObfuscatedName("af.d(I)V")
    public void method671() {
        byte[] var1 = new byte[this.field374 * this.field374];
        boolean var2 = false;
        byte[] var3 = new byte[this.field374 * this.field374];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field374; var5++) {
            for (int var6 = 0; var6 < this.field374; var6++) {
                if (var6 >= var5 - this.field374 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field367[7][0] = var3;
        byte[] var7 = new byte[this.field374 * this.field374];
        int var8 = 0;
        for (int var9 = this.field374 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field374; var10++) {
                if (var10 >= var9 - this.field374 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field367[7][1] = var7;
        byte[] var11 = new byte[this.field374 * this.field374];
        int var12 = 0;
        for (int var13 = this.field374 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field374 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field374 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field367[7][2] = var11;
        byte[] var15 = new byte[this.field374 * this.field374];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field374; var17++) {
            for (int var18 = this.field374 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field374 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field367[7][3] = var15;
    }
}
