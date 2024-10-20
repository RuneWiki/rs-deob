package deob;

@ObfuscatedName("aq")
public class class47 {

    @ObfuscatedName("aq.c")
    public int field598;

    @ObfuscatedName("aq.o")
    public byte[][][] field592;

    public class47(int arg0) {
        this.field598 = arg0;
    }

    @ObfuscatedName("aq.c(IIIIIIIII)V")
    public void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field598 != 0 && this.field592 != null) {
            int var9 = this.method565(arg7, arg6);
            int var10 = this.method576(arg6);
            class282.method4516(arg0, arg1, arg4, arg5, arg2, arg3, this.field592[var10 - 1][var9], this.field598, true);
        }
    }

    @ObfuscatedName("aq.o(III)I")
    public int method565(int arg0, int arg1) {
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

    @ObfuscatedName("aq.i(IB)I")
    public int method576(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("aq.u(B)V")
    public void method577() {
        if (this.field592 != null) {
            return;
        }
        this.field592 = new byte[8][4][];
        this.method561();
        this.method562();
        this.method563();
        this.method587();
        this.method560();
        this.method566();
        this.method567();
        this.method568();
    }

    @ObfuscatedName("aq.g(I)V")
    public void method561() {
        byte[] var1 = new byte[this.field598 * this.field598];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field598; var3++) {
            for (int var4 = 0; var4 < this.field598; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field592[0][0] = var1;
        byte[] var5 = new byte[this.field598 * this.field598];
        int var6 = 0;
        for (int var7 = this.field598 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field598; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field592[0][1] = var5;
        byte[] var9 = new byte[this.field598 * this.field598];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field598; var11++) {
            for (int var12 = 0; var12 < this.field598; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field592[0][2] = var9;
        byte[] var13 = new byte[this.field598 * this.field598];
        int var14 = 0;
        for (int var15 = this.field598 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field598; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field592[0][3] = var13;
    }

    @ObfuscatedName("aq.m(B)V")
    public void method562() {
        byte[] var1 = new byte[this.field598 * this.field598];
        int var2 = 0;
        for (int var3 = this.field598 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field598; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field592[1][0] = var1;
        byte[] var5 = new byte[this.field598 * this.field598];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field598; var7++) {
            for (int var8 = 0; var8 < this.field598; var8++) {
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
        this.field592[1][1] = var5;
        byte[] var9 = new byte[this.field598 * this.field598];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field598; var11++) {
            for (int var12 = this.field598 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field592[1][2] = var9;
        byte[] var13 = new byte[this.field598 * this.field598];
        int var14 = 0;
        for (int var15 = this.field598 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field598 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field592[1][3] = var13;
    }

    @ObfuscatedName("aq.s(I)V")
    public void method563() {
        byte[] var1 = new byte[this.field598 * this.field598];
        int var2 = 0;
        for (int var3 = this.field598 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field598 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field592[2][0] = var1;
        byte[] var5 = new byte[this.field598 * this.field598];
        int var6 = 0;
        for (int var7 = this.field598 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field598; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field592[2][1] = var5;
        byte[] var9 = new byte[this.field598 * this.field598];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field598; var11++) {
            for (int var12 = 0; var12 < this.field598; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field592[2][2] = var9;
        byte[] var13 = new byte[this.field598 * this.field598];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field598; var15++) {
            for (int var16 = this.field598 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field592[2][3] = var13;
    }

    @ObfuscatedName("aq.x(I)V")
    public void method587() {
        byte[] var1 = new byte[this.field598 * this.field598];
        int var2 = 0;
        for (int var3 = this.field598 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field598; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field592[3][0] = var1;
        byte[] var5 = new byte[this.field598 * this.field598];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field598; var7++) {
            for (int var8 = 0; var8 < this.field598; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field592[3][1] = var5;
        byte[] var9 = new byte[this.field598 * this.field598];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field598; var11++) {
            for (int var12 = this.field598 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field592[3][2] = var9;
        byte[] var13 = new byte[this.field598 * this.field598];
        int var14 = 0;
        for (int var15 = this.field598 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field598 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field592[3][3] = var13;
    }

    @ObfuscatedName("aq.p(I)V")
    public void method560() {
        byte[] var1 = new byte[this.field598 * this.field598];
        int var2 = 0;
        for (int var3 = this.field598 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field598 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field592[4][0] = var1;
        byte[] var5 = new byte[this.field598 * this.field598];
        int var6 = 0;
        for (int var7 = this.field598 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field598; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field592[4][1] = var5;
        byte[] var9 = new byte[this.field598 * this.field598];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field598; var11++) {
            for (int var12 = 0; var12 < this.field598; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field592[4][2] = var9;
        byte[] var13 = new byte[this.field598 * this.field598];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field598; var15++) {
            for (int var16 = this.field598 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field592[4][3] = var13;
    }

    @ObfuscatedName("aq.k(I)V")
    public void method566() {
        byte[] var1 = new byte[this.field598 * this.field598];
        boolean var2 = false;
        byte[] var3 = new byte[this.field598 * this.field598];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field598; var5++) {
            for (int var6 = 0; var6 < this.field598; var6++) {
                if (var6 <= this.field598 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field592[5][0] = var3;
        byte[] var7 = new byte[this.field598 * this.field598];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field598; var9++) {
            for (int var10 = 0; var10 < this.field598; var10++) {
                if (var9 <= this.field598 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field592[5][1] = var7;
        byte[] var11 = new byte[this.field598 * this.field598];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field598; var13++) {
            for (int var14 = 0; var14 < this.field598; var14++) {
                if (var14 >= this.field598 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field592[5][2] = var11;
        byte[] var15 = new byte[this.field598 * this.field598];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field598; var17++) {
            for (int var18 = 0; var18 < this.field598; var18++) {
                if (var17 >= this.field598 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field592[5][3] = var15;
    }

    @ObfuscatedName("aq.r(I)V")
    public void method567() {
        byte[] var1 = new byte[this.field598 * this.field598];
        boolean var2 = false;
        byte[] var3 = new byte[this.field598 * this.field598];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field598; var5++) {
            for (int var6 = 0; var6 < this.field598; var6++) {
                if (var6 <= var5 - this.field598 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field592[6][0] = var3;
        byte[] var7 = new byte[this.field598 * this.field598];
        int var8 = 0;
        for (int var9 = this.field598 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field598; var10++) {
                if (var10 <= var9 - this.field598 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field592[6][1] = var7;
        byte[] var11 = new byte[this.field598 * this.field598];
        int var12 = 0;
        for (int var13 = this.field598 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field598 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field598 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field592[6][2] = var11;
        byte[] var15 = new byte[this.field598 * this.field598];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field598; var17++) {
            for (int var18 = this.field598 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field598 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field592[6][3] = var15;
    }

    @ObfuscatedName("aq.w(B)V")
    public void method568() {
        byte[] var1 = new byte[this.field598 * this.field598];
        boolean var2 = false;
        byte[] var3 = new byte[this.field598 * this.field598];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field598; var5++) {
            for (int var6 = 0; var6 < this.field598; var6++) {
                if (var6 >= var5 - this.field598 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field592[7][0] = var3;
        byte[] var7 = new byte[this.field598 * this.field598];
        int var8 = 0;
        for (int var9 = this.field598 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field598; var10++) {
                if (var10 >= var9 - this.field598 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field592[7][1] = var7;
        byte[] var11 = new byte[this.field598 * this.field598];
        int var12 = 0;
        for (int var13 = this.field598 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field598 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field598 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field592[7][2] = var11;
        byte[] var15 = new byte[this.field598 * this.field598];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field598; var17++) {
            for (int var18 = this.field598 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field598 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field592[7][3] = var15;
    }
}
