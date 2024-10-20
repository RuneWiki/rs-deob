package deob;

@ObfuscatedName("gb")
public class class190 {

    @ObfuscatedName("gb.s")
    public int field2128;

    @ObfuscatedName("gb.t")
    public byte[][][] field2129;

    public class190(int arg0) {
        this.field2128 = arg0;
    }

    @ObfuscatedName("gb.s(IIIIIIIII)V")
    public void method3321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field2128 != 0 && this.field2129 != null) {
            int var9 = this.method3312(arg7, arg6);
            int var10 = this.method3334(arg6);
            class394.method6275(arg0, arg1, arg4, arg5, arg2, arg3, this.field2129[var10 - 1][var9], this.field2128, true);
        }
    }

    @ObfuscatedName("gb.t(III)I")
    public int method3312(int arg0, int arg1) {
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

    @ObfuscatedName("gb.v(II)I")
    public int method3334(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("gb.j(I)V")
    public void method3314() {
        if (this.field2129 != null) {
            return;
        }
        this.field2129 = new byte[8][4][];
        this.method3315();
        this.method3316();
        this.method3318();
        this.method3322();
        this.method3319();
        this.method3320();
        this.method3346();
        this.method3347();
    }

    @ObfuscatedName("gb.l(I)V")
    public void method3315() {
        byte[] var1 = new byte[this.field2128 * this.field2128];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2128; var3++) {
            for (int var4 = 0; var4 < this.field2128; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2129[0][0] = var1;
        byte[] var5 = new byte[this.field2128 * this.field2128];
        int var6 = 0;
        for (int var7 = this.field2128 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2128; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2129[0][1] = var5;
        byte[] var9 = new byte[this.field2128 * this.field2128];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2128; var11++) {
            for (int var12 = 0; var12 < this.field2128; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2129[0][2] = var9;
        byte[] var13 = new byte[this.field2128 * this.field2128];
        int var14 = 0;
        for (int var15 = this.field2128 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field2128; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2129[0][3] = var13;
    }

    @ObfuscatedName("gb.n(I)V")
    public void method3316() {
        byte[] var1 = new byte[this.field2128 * this.field2128];
        int var2 = 0;
        for (int var3 = this.field2128 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2128; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2129[1][0] = var1;
        byte[] var5 = new byte[this.field2128 * this.field2128];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2128; var7++) {
            for (int var8 = 0; var8 < this.field2128; var8++) {
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
        this.field2129[1][1] = var5;
        byte[] var9 = new byte[this.field2128 * this.field2128];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2128; var11++) {
            for (int var12 = this.field2128 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2129[1][2] = var9;
        byte[] var13 = new byte[this.field2128 * this.field2128];
        int var14 = 0;
        for (int var15 = this.field2128 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field2128 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2129[1][3] = var13;
    }

    @ObfuscatedName("gb.w(I)V")
    public void method3318() {
        byte[] var1 = new byte[this.field2128 * this.field2128];
        int var2 = 0;
        for (int var3 = this.field2128 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field2128 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2129[2][0] = var1;
        byte[] var5 = new byte[this.field2128 * this.field2128];
        int var6 = 0;
        for (int var7 = this.field2128 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2128; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2129[2][1] = var5;
        byte[] var9 = new byte[this.field2128 * this.field2128];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2128; var11++) {
            for (int var12 = 0; var12 < this.field2128; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2129[2][2] = var9;
        byte[] var13 = new byte[this.field2128 * this.field2128];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field2128; var15++) {
            for (int var16 = this.field2128 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2129[2][3] = var13;
    }

    @ObfuscatedName("gb.f(I)V")
    public void method3322() {
        byte[] var1 = new byte[this.field2128 * this.field2128];
        int var2 = 0;
        for (int var3 = this.field2128 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2128; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2129[3][0] = var1;
        byte[] var5 = new byte[this.field2128 * this.field2128];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2128; var7++) {
            for (int var8 = 0; var8 < this.field2128; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2129[3][1] = var5;
        byte[] var9 = new byte[this.field2128 * this.field2128];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2128; var11++) {
            for (int var12 = this.field2128 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2129[3][2] = var9;
        byte[] var13 = new byte[this.field2128 * this.field2128];
        int var14 = 0;
        for (int var15 = this.field2128 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field2128 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2129[3][3] = var13;
    }

    @ObfuscatedName("gb.o(I)V")
    public void method3319() {
        byte[] var1 = new byte[this.field2128 * this.field2128];
        int var2 = 0;
        for (int var3 = this.field2128 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field2128 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2129[4][0] = var1;
        byte[] var5 = new byte[this.field2128 * this.field2128];
        int var6 = 0;
        for (int var7 = this.field2128 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2128; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2129[4][1] = var5;
        byte[] var9 = new byte[this.field2128 * this.field2128];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2128; var11++) {
            for (int var12 = 0; var12 < this.field2128; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2129[4][2] = var9;
        byte[] var13 = new byte[this.field2128 * this.field2128];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field2128; var15++) {
            for (int var16 = this.field2128 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2129[4][3] = var13;
    }

    @ObfuscatedName("gb.x(I)V")
    public void method3320() {
        byte[] var1 = new byte[this.field2128 * this.field2128];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2128 * this.field2128];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2128; var5++) {
            for (int var6 = 0; var6 < this.field2128; var6++) {
                if (var6 <= this.field2128 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2129[5][0] = var3;
        byte[] var7 = new byte[this.field2128 * this.field2128];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2128; var9++) {
            for (int var10 = 0; var10 < this.field2128; var10++) {
                if (var9 <= this.field2128 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2129[5][1] = var7;
        byte[] var11 = new byte[this.field2128 * this.field2128];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field2128; var13++) {
            for (int var14 = 0; var14 < this.field2128; var14++) {
                if (var14 >= this.field2128 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2129[5][2] = var11;
        byte[] var15 = new byte[this.field2128 * this.field2128];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2128; var17++) {
            for (int var18 = 0; var18 < this.field2128; var18++) {
                if (var17 >= this.field2128 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2129[5][3] = var15;
    }

    @ObfuscatedName("gb.r(I)V")
    public void method3346() {
        byte[] var1 = new byte[this.field2128 * this.field2128];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2128 * this.field2128];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2128; var5++) {
            for (int var6 = 0; var6 < this.field2128; var6++) {
                if (var6 <= var5 - this.field2128 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2129[6][0] = var3;
        byte[] var7 = new byte[this.field2128 * this.field2128];
        int var8 = 0;
        for (int var9 = this.field2128 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field2128; var10++) {
                if (var10 <= var9 - this.field2128 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2129[6][1] = var7;
        byte[] var11 = new byte[this.field2128 * this.field2128];
        int var12 = 0;
        for (int var13 = this.field2128 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field2128 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field2128 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2129[6][2] = var11;
        byte[] var15 = new byte[this.field2128 * this.field2128];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2128; var17++) {
            for (int var18 = this.field2128 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field2128 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2129[6][3] = var15;
    }

    @ObfuscatedName("gb.p(I)V")
    public void method3347() {
        byte[] var1 = new byte[this.field2128 * this.field2128];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2128 * this.field2128];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2128; var5++) {
            for (int var6 = 0; var6 < this.field2128; var6++) {
                if (var6 >= var5 - this.field2128 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2129[7][0] = var3;
        byte[] var7 = new byte[this.field2128 * this.field2128];
        int var8 = 0;
        for (int var9 = this.field2128 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field2128; var10++) {
                if (var10 >= var9 - this.field2128 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2129[7][1] = var7;
        byte[] var11 = new byte[this.field2128 * this.field2128];
        int var12 = 0;
        for (int var13 = this.field2128 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field2128 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field2128 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2129[7][2] = var11;
        byte[] var15 = new byte[this.field2128 * this.field2128];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2128; var17++) {
            for (int var18 = this.field2128 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field2128 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2129[7][3] = var15;
    }
}
