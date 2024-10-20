package deob;

@ObfuscatedName("af")
public class class48 {

    @ObfuscatedName("af.t")
    public int field565;

    @ObfuscatedName("af.q")
    public byte[][][] field568;

    public class48(int arg0) {
        this.field565 = arg0;
    }

    @ObfuscatedName("af.t(IIIIIIIIB)V")
    public void method663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field565 != 0 && this.field568 != null) {
            int var9 = this.method633(arg7, arg6);
            int var10 = this.method634(arg6);
            class328.method5281(arg0, arg1, arg4, arg5, arg2, arg3, this.field568[var10 - 1][var9], this.field565, true);
        }
    }

    @ObfuscatedName("af.q(III)I")
    public int method633(int arg0, int arg1) {
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

    @ObfuscatedName("af.i(II)I")
    public int method634(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("af.a(I)V")
    public void method635() {
        if (this.field568 != null) {
            return;
        }
        this.field568 = new byte[8][4][];
        this.method631();
        this.method637();
        this.method638();
        this.method649();
        this.method640();
        this.method655();
        this.method642();
        this.method654();
    }

    @ObfuscatedName("af.l(I)V")
    public void method631() {
        byte[] var1 = new byte[this.field565 * this.field565];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field565; var3++) {
            for (int var4 = 0; var4 < this.field565; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field568[0][0] = var1;
        byte[] var5 = new byte[this.field565 * this.field565];
        int var6 = 0;
        for (int var7 = this.field565 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field565; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field568[0][1] = var5;
        byte[] var9 = new byte[this.field565 * this.field565];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field565; var11++) {
            for (int var12 = 0; var12 < this.field565; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field568[0][2] = var9;
        byte[] var13 = new byte[this.field565 * this.field565];
        int var14 = 0;
        for (int var15 = this.field565 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field565; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field568[0][3] = var13;
    }

    @ObfuscatedName("af.b(S)V")
    public void method637() {
        byte[] var1 = new byte[this.field565 * this.field565];
        int var2 = 0;
        for (int var3 = this.field565 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field565; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field568[1][0] = var1;
        byte[] var5 = new byte[this.field565 * this.field565];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field565; var7++) {
            for (int var8 = 0; var8 < this.field565; var8++) {
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
        this.field568[1][1] = var5;
        byte[] var9 = new byte[this.field565 * this.field565];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field565; var11++) {
            for (int var12 = this.field565 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field568[1][2] = var9;
        byte[] var13 = new byte[this.field565 * this.field565];
        int var14 = 0;
        for (int var15 = this.field565 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field565 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field568[1][3] = var13;
    }

    @ObfuscatedName("af.e(I)V")
    public void method638() {
        byte[] var1 = new byte[this.field565 * this.field565];
        int var2 = 0;
        for (int var3 = this.field565 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field565 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field568[2][0] = var1;
        byte[] var5 = new byte[this.field565 * this.field565];
        int var6 = 0;
        for (int var7 = this.field565 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field565; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field568[2][1] = var5;
        byte[] var9 = new byte[this.field565 * this.field565];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field565; var11++) {
            for (int var12 = 0; var12 < this.field565; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field568[2][2] = var9;
        byte[] var13 = new byte[this.field565 * this.field565];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field565; var15++) {
            for (int var16 = this.field565 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field568[2][3] = var13;
    }

    @ObfuscatedName("af.x(B)V")
    public void method649() {
        byte[] var1 = new byte[this.field565 * this.field565];
        int var2 = 0;
        for (int var3 = this.field565 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field565; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field568[3][0] = var1;
        byte[] var5 = new byte[this.field565 * this.field565];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field565; var7++) {
            for (int var8 = 0; var8 < this.field565; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field568[3][1] = var5;
        byte[] var9 = new byte[this.field565 * this.field565];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field565; var11++) {
            for (int var12 = this.field565 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field568[3][2] = var9;
        byte[] var13 = new byte[this.field565 * this.field565];
        int var14 = 0;
        for (int var15 = this.field565 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field565 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field568[3][3] = var13;
    }

    @ObfuscatedName("af.p(I)V")
    public void method640() {
        byte[] var1 = new byte[this.field565 * this.field565];
        int var2 = 0;
        for (int var3 = this.field565 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field565 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field568[4][0] = var1;
        byte[] var5 = new byte[this.field565 * this.field565];
        int var6 = 0;
        for (int var7 = this.field565 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field565; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field568[4][1] = var5;
        byte[] var9 = new byte[this.field565 * this.field565];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field565; var11++) {
            for (int var12 = 0; var12 < this.field565; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field568[4][2] = var9;
        byte[] var13 = new byte[this.field565 * this.field565];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field565; var15++) {
            for (int var16 = this.field565 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field568[4][3] = var13;
    }

    @ObfuscatedName("af.o(B)V")
    public void method655() {
        byte[] var1 = new byte[this.field565 * this.field565];
        boolean var2 = false;
        byte[] var3 = new byte[this.field565 * this.field565];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field565; var5++) {
            for (int var6 = 0; var6 < this.field565; var6++) {
                if (var6 <= this.field565 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field568[5][0] = var3;
        byte[] var7 = new byte[this.field565 * this.field565];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field565; var9++) {
            for (int var10 = 0; var10 < this.field565; var10++) {
                if (var9 <= this.field565 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field568[5][1] = var7;
        byte[] var11 = new byte[this.field565 * this.field565];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field565; var13++) {
            for (int var14 = 0; var14 < this.field565; var14++) {
                if (var14 >= this.field565 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field568[5][2] = var11;
        byte[] var15 = new byte[this.field565 * this.field565];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field565; var17++) {
            for (int var18 = 0; var18 < this.field565; var18++) {
                if (var17 >= this.field565 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field568[5][3] = var15;
    }

    @ObfuscatedName("af.c(I)V")
    public void method642() {
        byte[] var1 = new byte[this.field565 * this.field565];
        boolean var2 = false;
        byte[] var3 = new byte[this.field565 * this.field565];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field565; var5++) {
            for (int var6 = 0; var6 < this.field565; var6++) {
                if (var6 <= var5 - this.field565 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field568[6][0] = var3;
        byte[] var7 = new byte[this.field565 * this.field565];
        int var8 = 0;
        for (int var9 = this.field565 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field565; var10++) {
                if (var10 <= var9 - this.field565 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field568[6][1] = var7;
        byte[] var11 = new byte[this.field565 * this.field565];
        int var12 = 0;
        for (int var13 = this.field565 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field565 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field565 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field568[6][2] = var11;
        byte[] var15 = new byte[this.field565 * this.field565];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field565; var17++) {
            for (int var18 = this.field565 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field565 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field568[6][3] = var15;
    }

    @ObfuscatedName("af.u(I)V")
    public void method654() {
        byte[] var1 = new byte[this.field565 * this.field565];
        boolean var2 = false;
        byte[] var3 = new byte[this.field565 * this.field565];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field565; var5++) {
            for (int var6 = 0; var6 < this.field565; var6++) {
                if (var6 >= var5 - this.field565 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field568[7][0] = var3;
        byte[] var7 = new byte[this.field565 * this.field565];
        int var8 = 0;
        for (int var9 = this.field565 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field565; var10++) {
                if (var10 >= var9 - this.field565 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field568[7][1] = var7;
        byte[] var11 = new byte[this.field565 * this.field565];
        int var12 = 0;
        for (int var13 = this.field565 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field565 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field565 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field568[7][2] = var11;
        byte[] var15 = new byte[this.field565 * this.field565];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field565; var17++) {
            for (int var18 = this.field565 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field565 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field568[7][3] = var15;
    }
}
