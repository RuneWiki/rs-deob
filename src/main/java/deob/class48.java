package deob;

@ObfuscatedName("az")
public class class48 {

    @ObfuscatedName("az.c")
    public int field568;

    @ObfuscatedName("az.i")
    public byte[][][] field571;

    public class48(int arg0) {
        this.field568 = arg0;
    }

    @ObfuscatedName("az.c(IIIIIIIIB)V")
    public void method617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field568 != 0 && this.field571 != null) {
            int var9 = this.method618(arg7, arg6);
            int var10 = this.method619(arg6);
            class328.method5329(arg0, arg1, arg4, arg5, arg2, arg3, this.field571[var10 - 1][var9], this.field568, true);
        }
    }

    @ObfuscatedName("az.i(III)I")
    public int method618(int arg0, int arg1) {
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

    @ObfuscatedName("az.o(II)I")
    public int method619(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("az.j(B)V")
    public void method658() {
        if (this.field571 != null) {
            return;
        }
        this.field571 = new byte[8][4][];
        this.method641();
        this.method637();
        this.method623();
        this.method624();
        this.method625();
        this.method626();
        this.method654();
        this.method627();
    }

    @ObfuscatedName("az.k(I)V")
    public void method641() {
        byte[] var1 = new byte[this.field568 * this.field568];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field568; var3++) {
            for (int var4 = 0; var4 < this.field568; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field571[0][0] = var1;
        byte[] var5 = new byte[this.field568 * this.field568];
        int var6 = 0;
        for (int var7 = this.field568 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field568; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field571[0][1] = var5;
        byte[] var9 = new byte[this.field568 * this.field568];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field568; var11++) {
            for (int var12 = 0; var12 < this.field568; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field571[0][2] = var9;
        byte[] var13 = new byte[this.field568 * this.field568];
        int var14 = 0;
        for (int var15 = this.field568 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field568; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field571[0][3] = var13;
    }

    @ObfuscatedName("az.x(I)V")
    public void method637() {
        byte[] var1 = new byte[this.field568 * this.field568];
        int var2 = 0;
        for (int var3 = this.field568 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field568; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field571[1][0] = var1;
        byte[] var5 = new byte[this.field568 * this.field568];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field568; var7++) {
            for (int var8 = 0; var8 < this.field568; var8++) {
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
        this.field571[1][1] = var5;
        byte[] var9 = new byte[this.field568 * this.field568];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field568; var11++) {
            for (int var12 = this.field568 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field571[1][2] = var9;
        byte[] var13 = new byte[this.field568 * this.field568];
        int var14 = 0;
        for (int var15 = this.field568 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field568 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field571[1][3] = var13;
    }

    @ObfuscatedName("az.z(I)V")
    public void method623() {
        byte[] var1 = new byte[this.field568 * this.field568];
        int var2 = 0;
        for (int var3 = this.field568 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field568 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field571[2][0] = var1;
        byte[] var5 = new byte[this.field568 * this.field568];
        int var6 = 0;
        for (int var7 = this.field568 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field568; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field571[2][1] = var5;
        byte[] var9 = new byte[this.field568 * this.field568];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field568; var11++) {
            for (int var12 = 0; var12 < this.field568; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field571[2][2] = var9;
        byte[] var13 = new byte[this.field568 * this.field568];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field568; var15++) {
            for (int var16 = this.field568 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field571[2][3] = var13;
    }

    @ObfuscatedName("az.p(B)V")
    public void method624() {
        byte[] var1 = new byte[this.field568 * this.field568];
        int var2 = 0;
        for (int var3 = this.field568 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field568; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field571[3][0] = var1;
        byte[] var5 = new byte[this.field568 * this.field568];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field568; var7++) {
            for (int var8 = 0; var8 < this.field568; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field571[3][1] = var5;
        byte[] var9 = new byte[this.field568 * this.field568];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field568; var11++) {
            for (int var12 = this.field568 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field571[3][2] = var9;
        byte[] var13 = new byte[this.field568 * this.field568];
        int var14 = 0;
        for (int var15 = this.field568 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field568 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field571[3][3] = var13;
    }

    @ObfuscatedName("az.w(B)V")
    public void method625() {
        byte[] var1 = new byte[this.field568 * this.field568];
        int var2 = 0;
        for (int var3 = this.field568 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field568 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field571[4][0] = var1;
        byte[] var5 = new byte[this.field568 * this.field568];
        int var6 = 0;
        for (int var7 = this.field568 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field568; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field571[4][1] = var5;
        byte[] var9 = new byte[this.field568 * this.field568];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field568; var11++) {
            for (int var12 = 0; var12 < this.field568; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field571[4][2] = var9;
        byte[] var13 = new byte[this.field568 * this.field568];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field568; var15++) {
            for (int var16 = this.field568 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field571[4][3] = var13;
    }

    @ObfuscatedName("az.r(I)V")
    public void method626() {
        byte[] var1 = new byte[this.field568 * this.field568];
        boolean var2 = false;
        byte[] var3 = new byte[this.field568 * this.field568];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field568; var5++) {
            for (int var6 = 0; var6 < this.field568; var6++) {
                if (var6 <= this.field568 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field571[5][0] = var3;
        byte[] var7 = new byte[this.field568 * this.field568];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field568; var9++) {
            for (int var10 = 0; var10 < this.field568; var10++) {
                if (var9 <= this.field568 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field571[5][1] = var7;
        byte[] var11 = new byte[this.field568 * this.field568];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field568; var13++) {
            for (int var14 = 0; var14 < this.field568; var14++) {
                if (var14 >= this.field568 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field571[5][2] = var11;
        byte[] var15 = new byte[this.field568 * this.field568];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field568; var17++) {
            for (int var18 = 0; var18 < this.field568; var18++) {
                if (var17 >= this.field568 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field571[5][3] = var15;
    }

    @ObfuscatedName("az.d(I)V")
    public void method654() {
        byte[] var1 = new byte[this.field568 * this.field568];
        boolean var2 = false;
        byte[] var3 = new byte[this.field568 * this.field568];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field568; var5++) {
            for (int var6 = 0; var6 < this.field568; var6++) {
                if (var6 <= var5 - this.field568 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field571[6][0] = var3;
        byte[] var7 = new byte[this.field568 * this.field568];
        int var8 = 0;
        for (int var9 = this.field568 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field568; var10++) {
                if (var10 <= var9 - this.field568 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field571[6][1] = var7;
        byte[] var11 = new byte[this.field568 * this.field568];
        int var12 = 0;
        for (int var13 = this.field568 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field568 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field568 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field571[6][2] = var11;
        byte[] var15 = new byte[this.field568 * this.field568];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field568; var17++) {
            for (int var18 = this.field568 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field568 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field571[6][3] = var15;
    }

    @ObfuscatedName("az.a(B)V")
    public void method627() {
        byte[] var1 = new byte[this.field568 * this.field568];
        boolean var2 = false;
        byte[] var3 = new byte[this.field568 * this.field568];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field568; var5++) {
            for (int var6 = 0; var6 < this.field568; var6++) {
                if (var6 >= var5 - this.field568 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field571[7][0] = var3;
        byte[] var7 = new byte[this.field568 * this.field568];
        int var8 = 0;
        for (int var9 = this.field568 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field568; var10++) {
                if (var10 >= var9 - this.field568 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field571[7][1] = var7;
        byte[] var11 = new byte[this.field568 * this.field568];
        int var12 = 0;
        for (int var13 = this.field568 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field568 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field568 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field571[7][2] = var11;
        byte[] var15 = new byte[this.field568 * this.field568];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field568; var17++) {
            for (int var18 = this.field568 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field568 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field571[7][3] = var15;
    }
}
