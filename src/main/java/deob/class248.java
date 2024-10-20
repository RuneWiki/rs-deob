package deob;

@ObfuscatedName("iw")
public class class248 {

    @ObfuscatedName("iw.c")
    public int field2908;

    @ObfuscatedName("iw.p")
    public byte[][][] field2907;

    public class248(int arg0) {
        this.field2908 = arg0;
    }

    @ObfuscatedName("iw.c(IIIIIIIII)V")
    public void method4717(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field2908 != 0 && this.field2907 != null) {
            int var9 = this.method4696(arg7, arg6);
            int var10 = this.method4697(arg6);
            class454.method7498(arg0, arg1, arg4, arg5, arg2, arg3, this.field2907[var10 - 1][var9], this.field2908, true);
        }
    }

    @ObfuscatedName("iw.p(III)I")
    public int method4696(int arg0, int arg1) {
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

    @ObfuscatedName("iw.f(II)I")
    public int method4697(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("iw.n(B)V")
    public void method4702() {
        if (this.field2907 != null) {
            return;
        }
        this.field2907 = new byte[8][4][];
        this.method4699();
        this.method4700();
        this.method4715();
        this.method4730();
        this.method4703();
        this.method4723();
        this.method4701();
        this.method4705();
    }

    @ObfuscatedName("iw.k(B)V")
    public void method4699() {
        byte[] var1 = new byte[this.field2908 * this.field2908];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2908; var3++) {
            for (int var4 = 0; var4 < this.field2908; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2907[0][0] = var1;
        byte[] var5 = new byte[this.field2908 * this.field2908];
        int var6 = 0;
        for (int var7 = this.field2908 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2908; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2907[0][1] = var5;
        byte[] var9 = new byte[this.field2908 * this.field2908];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2908; var11++) {
            for (int var12 = 0; var12 < this.field2908; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2907[0][2] = var9;
        byte[] var13 = new byte[this.field2908 * this.field2908];
        int var14 = 0;
        for (int var15 = this.field2908 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field2908; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2907[0][3] = var13;
    }

    @ObfuscatedName("iw.w(I)V")
    public void method4700() {
        byte[] var1 = new byte[this.field2908 * this.field2908];
        int var2 = 0;
        for (int var3 = this.field2908 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2908; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2907[1][0] = var1;
        byte[] var5 = new byte[this.field2908 * this.field2908];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2908; var7++) {
            for (int var8 = 0; var8 < this.field2908; var8++) {
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
        this.field2907[1][1] = var5;
        byte[] var9 = new byte[this.field2908 * this.field2908];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2908; var11++) {
            for (int var12 = this.field2908 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2907[1][2] = var9;
        byte[] var13 = new byte[this.field2908 * this.field2908];
        int var14 = 0;
        for (int var15 = this.field2908 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field2908 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2907[1][3] = var13;
    }

    @ObfuscatedName("iw.s(I)V")
    public void method4715() {
        byte[] var1 = new byte[this.field2908 * this.field2908];
        int var2 = 0;
        for (int var3 = this.field2908 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field2908 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2907[2][0] = var1;
        byte[] var5 = new byte[this.field2908 * this.field2908];
        int var6 = 0;
        for (int var7 = this.field2908 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2908; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2907[2][1] = var5;
        byte[] var9 = new byte[this.field2908 * this.field2908];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2908; var11++) {
            for (int var12 = 0; var12 < this.field2908; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2907[2][2] = var9;
        byte[] var13 = new byte[this.field2908 * this.field2908];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field2908; var15++) {
            for (int var16 = this.field2908 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2907[2][3] = var13;
    }

    @ObfuscatedName("iw.q(B)V")
    public void method4730() {
        byte[] var1 = new byte[this.field2908 * this.field2908];
        int var2 = 0;
        for (int var3 = this.field2908 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2908; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2907[3][0] = var1;
        byte[] var5 = new byte[this.field2908 * this.field2908];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2908; var7++) {
            for (int var8 = 0; var8 < this.field2908; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2907[3][1] = var5;
        byte[] var9 = new byte[this.field2908 * this.field2908];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2908; var11++) {
            for (int var12 = this.field2908 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2907[3][2] = var9;
        byte[] var13 = new byte[this.field2908 * this.field2908];
        int var14 = 0;
        for (int var15 = this.field2908 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field2908 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2907[3][3] = var13;
    }

    @ObfuscatedName("iw.m(B)V")
    public void method4703() {
        byte[] var1 = new byte[this.field2908 * this.field2908];
        int var2 = 0;
        for (int var3 = this.field2908 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field2908 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2907[4][0] = var1;
        byte[] var5 = new byte[this.field2908 * this.field2908];
        int var6 = 0;
        for (int var7 = this.field2908 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2908; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2907[4][1] = var5;
        byte[] var9 = new byte[this.field2908 * this.field2908];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2908; var11++) {
            for (int var12 = 0; var12 < this.field2908; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2907[4][2] = var9;
        byte[] var13 = new byte[this.field2908 * this.field2908];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field2908; var15++) {
            for (int var16 = this.field2908 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2907[4][3] = var13;
    }

    @ObfuscatedName("iw.x(I)V")
    public void method4723() {
        byte[] var1 = new byte[this.field2908 * this.field2908];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2908 * this.field2908];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2908; var5++) {
            for (int var6 = 0; var6 < this.field2908; var6++) {
                if (var6 <= this.field2908 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2907[5][0] = var3;
        byte[] var7 = new byte[this.field2908 * this.field2908];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2908; var9++) {
            for (int var10 = 0; var10 < this.field2908; var10++) {
                if (var9 <= this.field2908 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2907[5][1] = var7;
        byte[] var11 = new byte[this.field2908 * this.field2908];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field2908; var13++) {
            for (int var14 = 0; var14 < this.field2908; var14++) {
                if (var14 >= this.field2908 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2907[5][2] = var11;
        byte[] var15 = new byte[this.field2908 * this.field2908];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2908; var17++) {
            for (int var18 = 0; var18 < this.field2908; var18++) {
                if (var17 >= this.field2908 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2907[5][3] = var15;
    }

    @ObfuscatedName("iw.j(I)V")
    public void method4701() {
        byte[] var1 = new byte[this.field2908 * this.field2908];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2908 * this.field2908];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2908; var5++) {
            for (int var6 = 0; var6 < this.field2908; var6++) {
                if (var6 <= var5 - this.field2908 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2907[6][0] = var3;
        byte[] var7 = new byte[this.field2908 * this.field2908];
        int var8 = 0;
        for (int var9 = this.field2908 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field2908; var10++) {
                if (var10 <= var9 - this.field2908 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2907[6][1] = var7;
        byte[] var11 = new byte[this.field2908 * this.field2908];
        int var12 = 0;
        for (int var13 = this.field2908 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field2908 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field2908 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2907[6][2] = var11;
        byte[] var15 = new byte[this.field2908 * this.field2908];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2908; var17++) {
            for (int var18 = this.field2908 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field2908 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2907[6][3] = var15;
    }

    @ObfuscatedName("iw.v(I)V")
    public void method4705() {
        byte[] var1 = new byte[this.field2908 * this.field2908];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2908 * this.field2908];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2908; var5++) {
            for (int var6 = 0; var6 < this.field2908; var6++) {
                if (var6 >= var5 - this.field2908 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2907[7][0] = var3;
        byte[] var7 = new byte[this.field2908 * this.field2908];
        int var8 = 0;
        for (int var9 = this.field2908 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field2908; var10++) {
                if (var10 >= var9 - this.field2908 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2907[7][1] = var7;
        byte[] var11 = new byte[this.field2908 * this.field2908];
        int var12 = 0;
        for (int var13 = this.field2908 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field2908 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field2908 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2907[7][2] = var11;
        byte[] var15 = new byte[this.field2908 * this.field2908];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2908; var17++) {
            for (int var18 = this.field2908 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field2908 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2907[7][3] = var15;
    }
}
