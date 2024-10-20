package deob;

@ObfuscatedName("ap")
public class class36 {

    @ObfuscatedName("ap.f")
    public int field303;

    @ObfuscatedName("ap.h")
    public byte[][][] field305;

    public class36(int arg0) {
        this.field303 = arg0;
    }

    @ObfuscatedName("ap.f(IIIIIIIIB)V")
    public void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field303 != 0 && this.field305 != null) {
            int var9 = this.method566(arg7, arg6);
            int var10 = this.method587(arg6);
            class320.method5347(arg0, arg1, arg4, arg5, arg2, arg3, this.field305[var10 - 1][var9], this.field303, true);
        }
    }

    @ObfuscatedName("ap.h(III)I")
    public int method566(int arg0, int arg1) {
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

    @ObfuscatedName("ap.e(II)I")
    public int method587(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ap.b(B)V")
    public void method574() {
        if (this.field305 != null) {
            return;
        }
        this.field305 = new byte[8][4][];
        this.method571();
        this.method569();
        this.method585();
        this.method578();
        this.method572();
        this.method573();
        this.method592();
        this.method575();
    }

    @ObfuscatedName("ap.l(I)V")
    public void method571() {
        byte[] var1 = new byte[this.field303 * this.field303];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field303; var3++) {
            for (int var4 = 0; var4 < this.field303; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field305[0][0] = var1;
        byte[] var5 = new byte[this.field303 * this.field303];
        int var6 = 0;
        for (int var7 = this.field303 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field303; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field305[0][1] = var5;
        byte[] var9 = new byte[this.field303 * this.field303];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field303; var11++) {
            for (int var12 = 0; var12 < this.field303; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field305[0][2] = var9;
        byte[] var13 = new byte[this.field303 * this.field303];
        int var14 = 0;
        for (int var15 = this.field303 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field303; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field305[0][3] = var13;
    }

    @ObfuscatedName("ap.w(B)V")
    public void method569() {
        byte[] var1 = new byte[this.field303 * this.field303];
        int var2 = 0;
        for (int var3 = this.field303 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field303; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field305[1][0] = var1;
        byte[] var5 = new byte[this.field303 * this.field303];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field303; var7++) {
            for (int var8 = 0; var8 < this.field303; var8++) {
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
        byte[] var9 = new byte[this.field303 * this.field303];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field303; var11++) {
            for (int var12 = this.field303 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field305[1][2] = var9;
        byte[] var13 = new byte[this.field303 * this.field303];
        int var14 = 0;
        for (int var15 = this.field303 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field303 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field305[1][3] = var13;
    }

    @ObfuscatedName("ap.d(I)V")
    public void method585() {
        byte[] var1 = new byte[this.field303 * this.field303];
        int var2 = 0;
        for (int var3 = this.field303 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field303 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field305[2][0] = var1;
        byte[] var5 = new byte[this.field303 * this.field303];
        int var6 = 0;
        for (int var7 = this.field303 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field303; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field305[2][1] = var5;
        byte[] var9 = new byte[this.field303 * this.field303];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field303; var11++) {
            for (int var12 = 0; var12 < this.field303; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field305[2][2] = var9;
        byte[] var13 = new byte[this.field303 * this.field303];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field303; var15++) {
            for (int var16 = this.field303 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field305[2][3] = var13;
    }

    @ObfuscatedName("ap.n(I)V")
    public void method578() {
        byte[] var1 = new byte[this.field303 * this.field303];
        int var2 = 0;
        for (int var3 = this.field303 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field303; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field305[3][0] = var1;
        byte[] var5 = new byte[this.field303 * this.field303];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field303; var7++) {
            for (int var8 = 0; var8 < this.field303; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field305[3][1] = var5;
        byte[] var9 = new byte[this.field303 * this.field303];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field303; var11++) {
            for (int var12 = this.field303 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field305[3][2] = var9;
        byte[] var13 = new byte[this.field303 * this.field303];
        int var14 = 0;
        for (int var15 = this.field303 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field303 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field305[3][3] = var13;
    }

    @ObfuscatedName("ap.s(B)V")
    public void method572() {
        byte[] var1 = new byte[this.field303 * this.field303];
        int var2 = 0;
        for (int var3 = this.field303 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field303 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field305[4][0] = var1;
        byte[] var5 = new byte[this.field303 * this.field303];
        int var6 = 0;
        for (int var7 = this.field303 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field303; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field305[4][1] = var5;
        byte[] var9 = new byte[this.field303 * this.field303];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field303; var11++) {
            for (int var12 = 0; var12 < this.field303; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field305[4][2] = var9;
        byte[] var13 = new byte[this.field303 * this.field303];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field303; var15++) {
            for (int var16 = this.field303 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field305[4][3] = var13;
    }

    @ObfuscatedName("ap.g(I)V")
    public void method573() {
        byte[] var1 = new byte[this.field303 * this.field303];
        boolean var2 = false;
        byte[] var3 = new byte[this.field303 * this.field303];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field303; var5++) {
            for (int var6 = 0; var6 < this.field303; var6++) {
                if (var6 <= this.field303 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field305[5][0] = var3;
        byte[] var7 = new byte[this.field303 * this.field303];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field303; var9++) {
            for (int var10 = 0; var10 < this.field303; var10++) {
                if (var9 <= this.field303 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field305[5][1] = var7;
        byte[] var11 = new byte[this.field303 * this.field303];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field303; var13++) {
            for (int var14 = 0; var14 < this.field303; var14++) {
                if (var14 >= this.field303 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field305[5][2] = var11;
        byte[] var15 = new byte[this.field303 * this.field303];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field303; var17++) {
            for (int var18 = 0; var18 < this.field303; var18++) {
                if (var17 >= this.field303 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field305[5][3] = var15;
    }

    @ObfuscatedName("ap.k(B)V")
    public void method592() {
        byte[] var1 = new byte[this.field303 * this.field303];
        boolean var2 = false;
        byte[] var3 = new byte[this.field303 * this.field303];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field303; var5++) {
            for (int var6 = 0; var6 < this.field303; var6++) {
                if (var6 <= var5 - this.field303 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field305[6][0] = var3;
        byte[] var7 = new byte[this.field303 * this.field303];
        int var8 = 0;
        for (int var9 = this.field303 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field303; var10++) {
                if (var10 <= var9 - this.field303 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field305[6][1] = var7;
        byte[] var11 = new byte[this.field303 * this.field303];
        int var12 = 0;
        for (int var13 = this.field303 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field303 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field303 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field305[6][2] = var11;
        byte[] var15 = new byte[this.field303 * this.field303];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field303; var17++) {
            for (int var18 = this.field303 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field303 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field305[6][3] = var15;
    }

    @ObfuscatedName("ap.m(I)V")
    public void method575() {
        byte[] var1 = new byte[this.field303 * this.field303];
        boolean var2 = false;
        byte[] var3 = new byte[this.field303 * this.field303];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field303; var5++) {
            for (int var6 = 0; var6 < this.field303; var6++) {
                if (var6 >= var5 - this.field303 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field305[7][0] = var3;
        byte[] var7 = new byte[this.field303 * this.field303];
        int var8 = 0;
        for (int var9 = this.field303 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field303; var10++) {
                if (var10 >= var9 - this.field303 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field305[7][1] = var7;
        byte[] var11 = new byte[this.field303 * this.field303];
        int var12 = 0;
        for (int var13 = this.field303 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field303 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field303 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field305[7][2] = var11;
        byte[] var15 = new byte[this.field303 * this.field303];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field303; var17++) {
            for (int var18 = this.field303 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field303 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field305[7][3] = var15;
    }
}
