package deob;

@ObfuscatedName("an")
public class class48 {

    @ObfuscatedName("an.g")
    public int field581;

    @ObfuscatedName("an.e")
    public byte[][][] field580;

    public class48(int arg0) {
        this.field581 = arg0;
    }

    @ObfuscatedName("an.g(IIIIIIIII)V")
    public void method654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field581 != 0 && this.field580 != null) {
            int var9 = this.method638(arg7, arg6);
            int var10 = this.method644(arg6);
            class328.method5367(arg0, arg1, arg4, arg5, arg2, arg3, this.field580[var10 - 1][var9], this.field581, true);
        }
    }

    @ObfuscatedName("an.e(III)I")
    public int method638(int arg0, int arg1) {
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

    @ObfuscatedName("an.b(IB)I")
    public int method644(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("an.z(I)V")
    public void method643() {
        if (this.field580 != null) {
            return;
        }
        this.field580 = new byte[8][4][];
        this.method655();
        this.method645();
        this.method666();
        this.method637();
        this.method670();
        this.method646();
        this.method647();
        this.method648();
    }

    @ObfuscatedName("an.n(I)V")
    public void method655() {
        byte[] var1 = new byte[this.field581 * this.field581];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field581; var3++) {
            for (int var4 = 0; var4 < this.field581; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field580[0][0] = var1;
        byte[] var5 = new byte[this.field581 * this.field581];
        int var6 = 0;
        for (int var7 = this.field581 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field581; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field580[0][1] = var5;
        byte[] var9 = new byte[this.field581 * this.field581];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field581; var11++) {
            for (int var12 = 0; var12 < this.field581; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field580[0][2] = var9;
        byte[] var13 = new byte[this.field581 * this.field581];
        int var14 = 0;
        for (int var15 = this.field581 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field581; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field580[0][3] = var13;
    }

    @ObfuscatedName("an.l(I)V")
    public void method645() {
        byte[] var1 = new byte[this.field581 * this.field581];
        int var2 = 0;
        for (int var3 = this.field581 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field581; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field580[1][0] = var1;
        byte[] var5 = new byte[this.field581 * this.field581];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field581; var7++) {
            for (int var8 = 0; var8 < this.field581; var8++) {
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
        this.field580[1][1] = var5;
        byte[] var9 = new byte[this.field581 * this.field581];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field581; var11++) {
            for (int var12 = this.field581 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field580[1][2] = var9;
        byte[] var13 = new byte[this.field581 * this.field581];
        int var14 = 0;
        for (int var15 = this.field581 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field581 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field580[1][3] = var13;
    }

    @ObfuscatedName("an.s(I)V")
    public void method666() {
        byte[] var1 = new byte[this.field581 * this.field581];
        int var2 = 0;
        for (int var3 = this.field581 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field581 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field580[2][0] = var1;
        byte[] var5 = new byte[this.field581 * this.field581];
        int var6 = 0;
        for (int var7 = this.field581 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field581; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field580[2][1] = var5;
        byte[] var9 = new byte[this.field581 * this.field581];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field581; var11++) {
            for (int var12 = 0; var12 < this.field581; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field580[2][2] = var9;
        byte[] var13 = new byte[this.field581 * this.field581];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field581; var15++) {
            for (int var16 = this.field581 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field580[2][3] = var13;
    }

    @ObfuscatedName("an.y(I)V")
    public void method637() {
        byte[] var1 = new byte[this.field581 * this.field581];
        int var2 = 0;
        for (int var3 = this.field581 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field581; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field580[3][0] = var1;
        byte[] var5 = new byte[this.field581 * this.field581];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field581; var7++) {
            for (int var8 = 0; var8 < this.field581; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field580[3][1] = var5;
        byte[] var9 = new byte[this.field581 * this.field581];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field581; var11++) {
            for (int var12 = this.field581 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field580[3][2] = var9;
        byte[] var13 = new byte[this.field581 * this.field581];
        int var14 = 0;
        for (int var15 = this.field581 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field581 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field580[3][3] = var13;
    }

    @ObfuscatedName("an.c(I)V")
    public void method670() {
        byte[] var1 = new byte[this.field581 * this.field581];
        int var2 = 0;
        for (int var3 = this.field581 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field581 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field580[4][0] = var1;
        byte[] var5 = new byte[this.field581 * this.field581];
        int var6 = 0;
        for (int var7 = this.field581 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field581; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field580[4][1] = var5;
        byte[] var9 = new byte[this.field581 * this.field581];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field581; var11++) {
            for (int var12 = 0; var12 < this.field581; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field580[4][2] = var9;
        byte[] var13 = new byte[this.field581 * this.field581];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field581; var15++) {
            for (int var16 = this.field581 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field580[4][3] = var13;
    }

    @ObfuscatedName("an.o(I)V")
    public void method646() {
        byte[] var1 = new byte[this.field581 * this.field581];
        boolean var2 = false;
        byte[] var3 = new byte[this.field581 * this.field581];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field581; var5++) {
            for (int var6 = 0; var6 < this.field581; var6++) {
                if (var6 <= this.field581 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field580[5][0] = var3;
        byte[] var7 = new byte[this.field581 * this.field581];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field581; var9++) {
            for (int var10 = 0; var10 < this.field581; var10++) {
                if (var9 <= this.field581 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field580[5][1] = var7;
        byte[] var11 = new byte[this.field581 * this.field581];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field581; var13++) {
            for (int var14 = 0; var14 < this.field581; var14++) {
                if (var14 >= this.field581 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field580[5][2] = var11;
        byte[] var15 = new byte[this.field581 * this.field581];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field581; var17++) {
            for (int var18 = 0; var18 < this.field581; var18++) {
                if (var17 >= this.field581 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field580[5][3] = var15;
    }

    @ObfuscatedName("an.d(I)V")
    public void method647() {
        byte[] var1 = new byte[this.field581 * this.field581];
        boolean var2 = false;
        byte[] var3 = new byte[this.field581 * this.field581];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field581; var5++) {
            for (int var6 = 0; var6 < this.field581; var6++) {
                if (var6 <= var5 - this.field581 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field580[6][0] = var3;
        byte[] var7 = new byte[this.field581 * this.field581];
        int var8 = 0;
        for (int var9 = this.field581 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field581; var10++) {
                if (var10 <= var9 - this.field581 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field580[6][1] = var7;
        byte[] var11 = new byte[this.field581 * this.field581];
        int var12 = 0;
        for (int var13 = this.field581 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field581 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field581 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field580[6][2] = var11;
        byte[] var15 = new byte[this.field581 * this.field581];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field581; var17++) {
            for (int var18 = this.field581 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field581 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field580[6][3] = var15;
    }

    @ObfuscatedName("an.r(I)V")
    public void method648() {
        byte[] var1 = new byte[this.field581 * this.field581];
        boolean var2 = false;
        byte[] var3 = new byte[this.field581 * this.field581];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field581; var5++) {
            for (int var6 = 0; var6 < this.field581; var6++) {
                if (var6 >= var5 - this.field581 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field580[7][0] = var3;
        byte[] var7 = new byte[this.field581 * this.field581];
        int var8 = 0;
        for (int var9 = this.field581 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field581; var10++) {
                if (var10 >= var9 - this.field581 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field580[7][1] = var7;
        byte[] var11 = new byte[this.field581 * this.field581];
        int var12 = 0;
        for (int var13 = this.field581 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field581 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field581 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field580[7][2] = var11;
        byte[] var15 = new byte[this.field581 * this.field581];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field581; var17++) {
            for (int var18 = this.field581 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field581 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field580[7][3] = var15;
    }
}
