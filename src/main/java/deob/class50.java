package deob;

@ObfuscatedName("af")
public class class50 {

    @ObfuscatedName("af.n")
    public int field375;

    @ObfuscatedName("af.v")
    public byte[][][] field372;

    public class50(int arg0) {
        this.field375 = arg0;
    }

    @ObfuscatedName("af.n(IIIIIIIII)V")
    public void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field375 != 0 && this.field372 != null) {
            int var9 = this.method708(arg7, arg6);
            int var10 = this.method697(arg6);
            class332.method5740(arg0, arg1, arg4, arg5, arg2, arg3, this.field372[var10 - 1][var9], this.field375, true);
        }
    }

    @ObfuscatedName("af.v(III)I")
    public int method708(int arg0, int arg1) {
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

    @ObfuscatedName("af.d(II)I")
    public int method697(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("af.c(I)V")
    public void method710() {
        if (this.field372 != null) {
            return;
        }
        this.field372 = new byte[8][4][];
        this.method699();
        this.method715();
        this.method701();
        this.method702();
        this.method703();
        this.method704();
        this.method705();
        this.method694();
    }

    @ObfuscatedName("af.y(I)V")
    public void method699() {
        byte[] var1 = new byte[this.field375 * this.field375];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field375; var3++) {
            for (int var4 = 0; var4 < this.field375; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field372[0][0] = var1;
        byte[] var5 = new byte[this.field375 * this.field375];
        int var6 = 0;
        for (int var7 = this.field375 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field375; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field372[0][1] = var5;
        byte[] var9 = new byte[this.field375 * this.field375];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field375; var11++) {
            for (int var12 = 0; var12 < this.field375; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field372[0][2] = var9;
        byte[] var13 = new byte[this.field375 * this.field375];
        int var14 = 0;
        for (int var15 = this.field375 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field375; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field372[0][3] = var13;
    }

    @ObfuscatedName("af.h(I)V")
    public void method715() {
        byte[] var1 = new byte[this.field375 * this.field375];
        int var2 = 0;
        for (int var3 = this.field375 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field375; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field372[1][0] = var1;
        byte[] var5 = new byte[this.field375 * this.field375];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field375; var7++) {
            for (int var8 = 0; var8 < this.field375; var8++) {
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
        this.field372[1][1] = var5;
        byte[] var9 = new byte[this.field375 * this.field375];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field375; var11++) {
            for (int var12 = this.field375 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field372[1][2] = var9;
        byte[] var13 = new byte[this.field375 * this.field375];
        int var14 = 0;
        for (int var15 = this.field375 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field375 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field372[1][3] = var13;
    }

    @ObfuscatedName("af.z(B)V")
    public void method701() {
        byte[] var1 = new byte[this.field375 * this.field375];
        int var2 = 0;
        for (int var3 = this.field375 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field375 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field372[2][0] = var1;
        byte[] var5 = new byte[this.field375 * this.field375];
        int var6 = 0;
        for (int var7 = this.field375 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field375; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field372[2][1] = var5;
        byte[] var9 = new byte[this.field375 * this.field375];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field375; var11++) {
            for (int var12 = 0; var12 < this.field375; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field372[2][2] = var9;
        byte[] var13 = new byte[this.field375 * this.field375];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field375; var15++) {
            for (int var16 = this.field375 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field372[2][3] = var13;
    }

    @ObfuscatedName("af.e(B)V")
    public void method702() {
        byte[] var1 = new byte[this.field375 * this.field375];
        int var2 = 0;
        for (int var3 = this.field375 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field375; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field372[3][0] = var1;
        byte[] var5 = new byte[this.field375 * this.field375];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field375; var7++) {
            for (int var8 = 0; var8 < this.field375; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field372[3][1] = var5;
        byte[] var9 = new byte[this.field375 * this.field375];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field375; var11++) {
            for (int var12 = this.field375 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field372[3][2] = var9;
        byte[] var13 = new byte[this.field375 * this.field375];
        int var14 = 0;
        for (int var15 = this.field375 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field375 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field372[3][3] = var13;
    }

    @ObfuscatedName("af.q(I)V")
    public void method703() {
        byte[] var1 = new byte[this.field375 * this.field375];
        int var2 = 0;
        for (int var3 = this.field375 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field375 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field372[4][0] = var1;
        byte[] var5 = new byte[this.field375 * this.field375];
        int var6 = 0;
        for (int var7 = this.field375 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field375; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field372[4][1] = var5;
        byte[] var9 = new byte[this.field375 * this.field375];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field375; var11++) {
            for (int var12 = 0; var12 < this.field375; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field372[4][2] = var9;
        byte[] var13 = new byte[this.field375 * this.field375];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field375; var15++) {
            for (int var16 = this.field375 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field372[4][3] = var13;
    }

    @ObfuscatedName("af.l(I)V")
    public void method704() {
        byte[] var1 = new byte[this.field375 * this.field375];
        boolean var2 = false;
        byte[] var3 = new byte[this.field375 * this.field375];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field375; var5++) {
            for (int var6 = 0; var6 < this.field375; var6++) {
                if (var6 <= this.field375 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field372[5][0] = var3;
        byte[] var7 = new byte[this.field375 * this.field375];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field375; var9++) {
            for (int var10 = 0; var10 < this.field375; var10++) {
                if (var9 <= this.field375 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field372[5][1] = var7;
        byte[] var11 = new byte[this.field375 * this.field375];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field375; var13++) {
            for (int var14 = 0; var14 < this.field375; var14++) {
                if (var14 >= this.field375 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field372[5][2] = var11;
        byte[] var15 = new byte[this.field375 * this.field375];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field375; var17++) {
            for (int var18 = 0; var18 < this.field375; var18++) {
                if (var17 >= this.field375 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field372[5][3] = var15;
    }

    @ObfuscatedName("af.s(B)V")
    public void method705() {
        byte[] var1 = new byte[this.field375 * this.field375];
        boolean var2 = false;
        byte[] var3 = new byte[this.field375 * this.field375];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field375; var5++) {
            for (int var6 = 0; var6 < this.field375; var6++) {
                if (var6 <= var5 - this.field375 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field372[6][0] = var3;
        byte[] var7 = new byte[this.field375 * this.field375];
        int var8 = 0;
        for (int var9 = this.field375 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field375; var10++) {
                if (var10 <= var9 - this.field375 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field372[6][1] = var7;
        byte[] var11 = new byte[this.field375 * this.field375];
        int var12 = 0;
        for (int var13 = this.field375 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field375 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field375 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field372[6][2] = var11;
        byte[] var15 = new byte[this.field375 * this.field375];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field375; var17++) {
            for (int var18 = this.field375 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field375 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field372[6][3] = var15;
    }

    @ObfuscatedName("af.b(I)V")
    public void method694() {
        byte[] var1 = new byte[this.field375 * this.field375];
        boolean var2 = false;
        byte[] var3 = new byte[this.field375 * this.field375];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field375; var5++) {
            for (int var6 = 0; var6 < this.field375; var6++) {
                if (var6 >= var5 - this.field375 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field372[7][0] = var3;
        byte[] var7 = new byte[this.field375 * this.field375];
        int var8 = 0;
        for (int var9 = this.field375 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field375; var10++) {
                if (var10 >= var9 - this.field375 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field372[7][1] = var7;
        byte[] var11 = new byte[this.field375 * this.field375];
        int var12 = 0;
        for (int var13 = this.field375 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field375 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field375 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field372[7][2] = var11;
        byte[] var15 = new byte[this.field375 * this.field375];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field375; var17++) {
            for (int var18 = this.field375 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field375 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field372[7][3] = var15;
    }
}
