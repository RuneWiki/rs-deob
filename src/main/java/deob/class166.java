package deob;

@ObfuscatedName("fw")
public class class166 {

    @ObfuscatedName("fw.f")
    public int field1774;

    @ObfuscatedName("fw.o")
    public byte[][][] field1773;

    public class166(int arg0) {
        this.field1774 = arg0;
    }

    @ObfuscatedName("fw.f(IIIIIIIII)V")
    public void method2787(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field1774 != 0 && this.field1773 != null) {
            int var9 = this.method2788(arg7, arg6);
            int var10 = this.method2789(arg6);
            class391.method6130(arg0, arg1, arg4, arg5, arg2, arg3, this.field1773[var10 - 1][var9], this.field1774, true);
        }
    }

    @ObfuscatedName("fw.o(III)I")
    public int method2788(int arg0, int arg1) {
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

    @ObfuscatedName("fw.u(II)I")
    public int method2789(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("fw.p(I)V")
    public void method2790() {
        if (this.field1773 != null) {
            return;
        }
        this.field1773 = new byte[8][4][];
        this.method2821();
        this.method2792();
        this.method2793();
        this.method2796();
        this.method2795();
        this.method2812();
        this.method2797();
        this.method2798();
    }

    @ObfuscatedName("fw.b(B)V")
    public void method2821() {
        byte[] var1 = new byte[this.field1774 * this.field1774];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1774; var3++) {
            for (int var4 = 0; var4 < this.field1774; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field1773[0][0] = var1;
        byte[] var5 = new byte[this.field1774 * this.field1774];
        int var6 = 0;
        for (int var7 = this.field1774 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field1774; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field1773[0][1] = var5;
        byte[] var9 = new byte[this.field1774 * this.field1774];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field1774; var11++) {
            for (int var12 = 0; var12 < this.field1774; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field1773[0][2] = var9;
        byte[] var13 = new byte[this.field1774 * this.field1774];
        int var14 = 0;
        for (int var15 = this.field1774 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field1774; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field1773[0][3] = var13;
    }

    @ObfuscatedName("fw.e(B)V")
    public void method2792() {
        byte[] var1 = new byte[this.field1774 * this.field1774];
        int var2 = 0;
        for (int var3 = this.field1774 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field1774; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field1773[1][0] = var1;
        byte[] var5 = new byte[this.field1774 * this.field1774];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field1774; var7++) {
            for (int var8 = 0; var8 < this.field1774; var8++) {
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
        this.field1773[1][1] = var5;
        byte[] var9 = new byte[this.field1774 * this.field1774];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field1774; var11++) {
            for (int var12 = this.field1774 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field1773[1][2] = var9;
        byte[] var13 = new byte[this.field1774 * this.field1774];
        int var14 = 0;
        for (int var15 = this.field1774 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field1774 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field1773[1][3] = var13;
    }

    @ObfuscatedName("fw.k(I)V")
    public void method2793() {
        byte[] var1 = new byte[this.field1774 * this.field1774];
        int var2 = 0;
        for (int var3 = this.field1774 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field1774 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field1773[2][0] = var1;
        byte[] var5 = new byte[this.field1774 * this.field1774];
        int var6 = 0;
        for (int var7 = this.field1774 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field1774; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field1773[2][1] = var5;
        byte[] var9 = new byte[this.field1774 * this.field1774];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field1774; var11++) {
            for (int var12 = 0; var12 < this.field1774; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field1773[2][2] = var9;
        byte[] var13 = new byte[this.field1774 * this.field1774];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field1774; var15++) {
            for (int var16 = this.field1774 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field1773[2][3] = var13;
    }

    @ObfuscatedName("fw.g(B)V")
    public void method2796() {
        byte[] var1 = new byte[this.field1774 * this.field1774];
        int var2 = 0;
        for (int var3 = this.field1774 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field1774; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field1773[3][0] = var1;
        byte[] var5 = new byte[this.field1774 * this.field1774];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field1774; var7++) {
            for (int var8 = 0; var8 < this.field1774; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field1773[3][1] = var5;
        byte[] var9 = new byte[this.field1774 * this.field1774];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field1774; var11++) {
            for (int var12 = this.field1774 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field1773[3][2] = var9;
        byte[] var13 = new byte[this.field1774 * this.field1774];
        int var14 = 0;
        for (int var15 = this.field1774 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field1774 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field1773[3][3] = var13;
    }

    @ObfuscatedName("fw.h(I)V")
    public void method2795() {
        byte[] var1 = new byte[this.field1774 * this.field1774];
        int var2 = 0;
        for (int var3 = this.field1774 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field1774 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field1773[4][0] = var1;
        byte[] var5 = new byte[this.field1774 * this.field1774];
        int var6 = 0;
        for (int var7 = this.field1774 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field1774; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field1773[4][1] = var5;
        byte[] var9 = new byte[this.field1774 * this.field1774];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field1774; var11++) {
            for (int var12 = 0; var12 < this.field1774; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field1773[4][2] = var9;
        byte[] var13 = new byte[this.field1774 * this.field1774];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field1774; var15++) {
            for (int var16 = this.field1774 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field1773[4][3] = var13;
    }

    @ObfuscatedName("fw.n(I)V")
    public void method2812() {
        byte[] var1 = new byte[this.field1774 * this.field1774];
        boolean var2 = false;
        byte[] var3 = new byte[this.field1774 * this.field1774];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1774; var5++) {
            for (int var6 = 0; var6 < this.field1774; var6++) {
                if (var6 <= this.field1774 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field1773[5][0] = var3;
        byte[] var7 = new byte[this.field1774 * this.field1774];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field1774; var9++) {
            for (int var10 = 0; var10 < this.field1774; var10++) {
                if (var9 <= this.field1774 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field1773[5][1] = var7;
        byte[] var11 = new byte[this.field1774 * this.field1774];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field1774; var13++) {
            for (int var14 = 0; var14 < this.field1774; var14++) {
                if (var14 >= this.field1774 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field1773[5][2] = var11;
        byte[] var15 = new byte[this.field1774 * this.field1774];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field1774; var17++) {
            for (int var18 = 0; var18 < this.field1774; var18++) {
                if (var17 >= this.field1774 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field1773[5][3] = var15;
    }

    @ObfuscatedName("fw.l(B)V")
    public void method2797() {
        byte[] var1 = new byte[this.field1774 * this.field1774];
        boolean var2 = false;
        byte[] var3 = new byte[this.field1774 * this.field1774];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1774; var5++) {
            for (int var6 = 0; var6 < this.field1774; var6++) {
                if (var6 <= var5 - this.field1774 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field1773[6][0] = var3;
        byte[] var7 = new byte[this.field1774 * this.field1774];
        int var8 = 0;
        for (int var9 = this.field1774 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field1774; var10++) {
                if (var10 <= var9 - this.field1774 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field1773[6][1] = var7;
        byte[] var11 = new byte[this.field1774 * this.field1774];
        int var12 = 0;
        for (int var13 = this.field1774 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field1774 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field1774 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field1773[6][2] = var11;
        byte[] var15 = new byte[this.field1774 * this.field1774];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field1774; var17++) {
            for (int var18 = this.field1774 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field1774 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field1773[6][3] = var15;
    }

    @ObfuscatedName("fw.m(B)V")
    public void method2798() {
        byte[] var1 = new byte[this.field1774 * this.field1774];
        boolean var2 = false;
        byte[] var3 = new byte[this.field1774 * this.field1774];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1774; var5++) {
            for (int var6 = 0; var6 < this.field1774; var6++) {
                if (var6 >= var5 - this.field1774 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field1773[7][0] = var3;
        byte[] var7 = new byte[this.field1774 * this.field1774];
        int var8 = 0;
        for (int var9 = this.field1774 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field1774; var10++) {
                if (var10 >= var9 - this.field1774 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field1773[7][1] = var7;
        byte[] var11 = new byte[this.field1774 * this.field1774];
        int var12 = 0;
        for (int var13 = this.field1774 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field1774 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field1774 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field1773[7][2] = var11;
        byte[] var15 = new byte[this.field1774 * this.field1774];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field1774; var17++) {
            for (int var18 = this.field1774 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field1774 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field1773[7][3] = var15;
    }
}
