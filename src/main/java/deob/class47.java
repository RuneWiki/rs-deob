package deob;

@ObfuscatedName("au")
public class class47 {

    @ObfuscatedName("au.e")
    public int field600;

    @ObfuscatedName("au.o")
    public byte[][][] field596;

    public class47(int arg0) {
        this.field600 = arg0;
    }

    @ObfuscatedName("au.e(IIIIIIIII)V")
    public void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field600 != 0 && this.field596 != null) {
            int var9 = this.method581(arg7, arg6);
            int var10 = this.method582(arg6);
            class282.method4578(arg0, arg1, arg4, arg5, arg2, arg3, this.field596[var10 - 1][var9], this.field600, true);
        }
    }

    @ObfuscatedName("au.o(III)I")
    public int method581(int arg0, int arg1) {
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

    @ObfuscatedName("au.m(II)I")
    public int method582(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("au.g(I)V")
    public void method583() {
        if (this.field596 != null) {
            return;
        }
        this.field596 = new byte[8][4][];
        this.method584();
        this.method611();
        this.method605();
        this.method587();
        this.method588();
        this.method589();
        this.method590();
        this.method591();
    }

    @ObfuscatedName("au.d(B)V")
    public void method584() {
        byte[] var1 = new byte[this.field600 * this.field600];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field600; var3++) {
            for (int var4 = 0; var4 < this.field600; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field596[0][0] = var1;
        byte[] var5 = new byte[this.field600 * this.field600];
        int var6 = 0;
        for (int var7 = this.field600 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field600; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field596[0][1] = var5;
        byte[] var9 = new byte[this.field600 * this.field600];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field600; var11++) {
            for (int var12 = 0; var12 < this.field600; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field596[0][2] = var9;
        byte[] var13 = new byte[this.field600 * this.field600];
        int var14 = 0;
        for (int var15 = this.field600 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field600; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field596[0][3] = var13;
    }

    @ObfuscatedName("au.b(I)V")
    public void method611() {
        byte[] var1 = new byte[this.field600 * this.field600];
        int var2 = 0;
        for (int var3 = this.field600 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field600; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field596[1][0] = var1;
        byte[] var5 = new byte[this.field600 * this.field600];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field600; var7++) {
            for (int var8 = 0; var8 < this.field600; var8++) {
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
        this.field596[1][1] = var5;
        byte[] var9 = new byte[this.field600 * this.field600];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field600; var11++) {
            for (int var12 = this.field600 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field596[1][2] = var9;
        byte[] var13 = new byte[this.field600 * this.field600];
        int var14 = 0;
        for (int var15 = this.field600 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field600 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field596[1][3] = var13;
    }

    @ObfuscatedName("au.k(I)V")
    public void method605() {
        byte[] var1 = new byte[this.field600 * this.field600];
        int var2 = 0;
        for (int var3 = this.field600 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field600 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field596[2][0] = var1;
        byte[] var5 = new byte[this.field600 * this.field600];
        int var6 = 0;
        for (int var7 = this.field600 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field600; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field596[2][1] = var5;
        byte[] var9 = new byte[this.field600 * this.field600];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field600; var11++) {
            for (int var12 = 0; var12 < this.field600; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field596[2][2] = var9;
        byte[] var13 = new byte[this.field600 * this.field600];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field600; var15++) {
            for (int var16 = this.field600 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field596[2][3] = var13;
    }

    @ObfuscatedName("au.q(I)V")
    public void method587() {
        byte[] var1 = new byte[this.field600 * this.field600];
        int var2 = 0;
        for (int var3 = this.field600 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field600; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field596[3][0] = var1;
        byte[] var5 = new byte[this.field600 * this.field600];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field600; var7++) {
            for (int var8 = 0; var8 < this.field600; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field596[3][1] = var5;
        byte[] var9 = new byte[this.field600 * this.field600];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field600; var11++) {
            for (int var12 = this.field600 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field596[3][2] = var9;
        byte[] var13 = new byte[this.field600 * this.field600];
        int var14 = 0;
        for (int var15 = this.field600 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field600 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field596[3][3] = var13;
    }

    @ObfuscatedName("au.h(I)V")
    public void method588() {
        byte[] var1 = new byte[this.field600 * this.field600];
        int var2 = 0;
        for (int var3 = this.field600 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field600 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field596[4][0] = var1;
        byte[] var5 = new byte[this.field600 * this.field600];
        int var6 = 0;
        for (int var7 = this.field600 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field600; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field596[4][1] = var5;
        byte[] var9 = new byte[this.field600 * this.field600];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field600; var11++) {
            for (int var12 = 0; var12 < this.field600; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field596[4][2] = var9;
        byte[] var13 = new byte[this.field600 * this.field600];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field600; var15++) {
            for (int var16 = this.field600 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field596[4][3] = var13;
    }

    @ObfuscatedName("au.i(I)V")
    public void method589() {
        byte[] var1 = new byte[this.field600 * this.field600];
        boolean var2 = false;
        byte[] var3 = new byte[this.field600 * this.field600];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field600; var5++) {
            for (int var6 = 0; var6 < this.field600; var6++) {
                if (var6 <= this.field600 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field596[5][0] = var3;
        byte[] var7 = new byte[this.field600 * this.field600];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field600; var9++) {
            for (int var10 = 0; var10 < this.field600; var10++) {
                if (var9 <= this.field600 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field596[5][1] = var7;
        byte[] var11 = new byte[this.field600 * this.field600];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field600; var13++) {
            for (int var14 = 0; var14 < this.field600; var14++) {
                if (var14 >= this.field600 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field596[5][2] = var11;
        byte[] var15 = new byte[this.field600 * this.field600];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field600; var17++) {
            for (int var18 = 0; var18 < this.field600; var18++) {
                if (var17 >= this.field600 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field596[5][3] = var15;
    }

    @ObfuscatedName("au.s(B)V")
    public void method590() {
        byte[] var1 = new byte[this.field600 * this.field600];
        boolean var2 = false;
        byte[] var3 = new byte[this.field600 * this.field600];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field600; var5++) {
            for (int var6 = 0; var6 < this.field600; var6++) {
                if (var6 <= var5 - this.field600 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field596[6][0] = var3;
        byte[] var7 = new byte[this.field600 * this.field600];
        int var8 = 0;
        for (int var9 = this.field600 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field600; var10++) {
                if (var10 <= var9 - this.field600 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field596[6][1] = var7;
        byte[] var11 = new byte[this.field600 * this.field600];
        int var12 = 0;
        for (int var13 = this.field600 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field600 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field600 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field596[6][2] = var11;
        byte[] var15 = new byte[this.field600 * this.field600];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field600; var17++) {
            for (int var18 = this.field600 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field600 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field596[6][3] = var15;
    }

    @ObfuscatedName("au.n(I)V")
    public void method591() {
        byte[] var1 = new byte[this.field600 * this.field600];
        boolean var2 = false;
        byte[] var3 = new byte[this.field600 * this.field600];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field600; var5++) {
            for (int var6 = 0; var6 < this.field600; var6++) {
                if (var6 >= var5 - this.field600 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field596[7][0] = var3;
        byte[] var7 = new byte[this.field600 * this.field600];
        int var8 = 0;
        for (int var9 = this.field600 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field600; var10++) {
                if (var10 >= var9 - this.field600 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field596[7][1] = var7;
        byte[] var11 = new byte[this.field600 * this.field600];
        int var12 = 0;
        for (int var13 = this.field600 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field600 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field600 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field596[7][2] = var11;
        byte[] var15 = new byte[this.field600 * this.field600];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field600; var17++) {
            for (int var18 = this.field600 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field600 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field596[7][3] = var15;
    }
}
