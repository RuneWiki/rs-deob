package deob;

@ObfuscatedName("ih")
public class class260 {

    @ObfuscatedName("ih.h")
    public int field3015;

    @ObfuscatedName("ih.e")
    public byte[][][] field3016;

    public class260(int arg0) {
        this.field3015 = arg0;
    }

    @ObfuscatedName("ih.h(IIIIIIIII)V")
    public void method4834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field3015 != 0 && this.field3016 != null) {
            int var9 = this.method4835(arg7, arg6);
            int var10 = this.method4861(arg6);
            class477.method8146(arg0, arg1, arg4, arg5, arg2, arg3, this.field3016[var10 - 1][var9], this.field3015, true);
        }
    }

    @ObfuscatedName("ih.e(III)I")
    public int method4835(int arg0, int arg1) {
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

    @ObfuscatedName("ih.v(II)I")
    public int method4861(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ih.x(I)V")
    public void method4837() {
        if (this.field3016 != null) {
            return;
        }
        this.field3016 = new byte[8][4][];
        this.method4856();
        this.method4839();
        this.method4864();
        this.method4853();
        this.method4862();
        this.method4863();
        this.method4844();
        this.method4845();
    }

    @ObfuscatedName("ih.m(I)V")
    public void method4856() {
        byte[] var1 = new byte[this.field3015 * this.field3015];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3015; var3++) {
            for (int var4 = 0; var4 < this.field3015; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3016[0][0] = var1;
        byte[] var5 = new byte[this.field3015 * this.field3015];
        int var6 = 0;
        for (int var7 = this.field3015 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3015; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3016[0][1] = var5;
        byte[] var9 = new byte[this.field3015 * this.field3015];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3015; var11++) {
            for (int var12 = 0; var12 < this.field3015; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3016[0][2] = var9;
        byte[] var13 = new byte[this.field3015 * this.field3015];
        int var14 = 0;
        for (int var15 = this.field3015 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field3015; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3016[0][3] = var13;
    }

    @ObfuscatedName("ih.q(I)V")
    public void method4839() {
        byte[] var1 = new byte[this.field3015 * this.field3015];
        int var2 = 0;
        for (int var3 = this.field3015 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3015; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3016[1][0] = var1;
        byte[] var5 = new byte[this.field3015 * this.field3015];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3015; var7++) {
            for (int var8 = 0; var8 < this.field3015; var8++) {
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
        this.field3016[1][1] = var5;
        byte[] var9 = new byte[this.field3015 * this.field3015];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3015; var11++) {
            for (int var12 = this.field3015 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3016[1][2] = var9;
        byte[] var13 = new byte[this.field3015 * this.field3015];
        int var14 = 0;
        for (int var15 = this.field3015 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field3015 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3016[1][3] = var13;
    }

    @ObfuscatedName("ih.f(I)V")
    public void method4864() {
        byte[] var1 = new byte[this.field3015 * this.field3015];
        int var2 = 0;
        for (int var3 = this.field3015 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field3015 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3016[2][0] = var1;
        byte[] var5 = new byte[this.field3015 * this.field3015];
        int var6 = 0;
        for (int var7 = this.field3015 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3015; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3016[2][1] = var5;
        byte[] var9 = new byte[this.field3015 * this.field3015];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3015; var11++) {
            for (int var12 = 0; var12 < this.field3015; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3016[2][2] = var9;
        byte[] var13 = new byte[this.field3015 * this.field3015];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field3015; var15++) {
            for (int var16 = this.field3015 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3016[2][3] = var13;
    }

    @ObfuscatedName("ih.r(I)V")
    public void method4853() {
        byte[] var1 = new byte[this.field3015 * this.field3015];
        int var2 = 0;
        for (int var3 = this.field3015 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3015; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3016[3][0] = var1;
        byte[] var5 = new byte[this.field3015 * this.field3015];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3015; var7++) {
            for (int var8 = 0; var8 < this.field3015; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3016[3][1] = var5;
        byte[] var9 = new byte[this.field3015 * this.field3015];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3015; var11++) {
            for (int var12 = this.field3015 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3016[3][2] = var9;
        byte[] var13 = new byte[this.field3015 * this.field3015];
        int var14 = 0;
        for (int var15 = this.field3015 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field3015 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3016[3][3] = var13;
    }

    @ObfuscatedName("ih.u(B)V")
    public void method4862() {
        byte[] var1 = new byte[this.field3015 * this.field3015];
        int var2 = 0;
        for (int var3 = this.field3015 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field3015 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3016[4][0] = var1;
        byte[] var5 = new byte[this.field3015 * this.field3015];
        int var6 = 0;
        for (int var7 = this.field3015 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3015; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3016[4][1] = var5;
        byte[] var9 = new byte[this.field3015 * this.field3015];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3015; var11++) {
            for (int var12 = 0; var12 < this.field3015; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3016[4][2] = var9;
        byte[] var13 = new byte[this.field3015 * this.field3015];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field3015; var15++) {
            for (int var16 = this.field3015 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3016[4][3] = var13;
    }

    @ObfuscatedName("ih.b(I)V")
    public void method4863() {
        byte[] var1 = new byte[this.field3015 * this.field3015];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3015 * this.field3015];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3015; var5++) {
            for (int var6 = 0; var6 < this.field3015; var6++) {
                if (var6 <= this.field3015 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3016[5][0] = var3;
        byte[] var7 = new byte[this.field3015 * this.field3015];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3015; var9++) {
            for (int var10 = 0; var10 < this.field3015; var10++) {
                if (var9 <= this.field3015 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3016[5][1] = var7;
        byte[] var11 = new byte[this.field3015 * this.field3015];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field3015; var13++) {
            for (int var14 = 0; var14 < this.field3015; var14++) {
                if (var14 >= this.field3015 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3016[5][2] = var11;
        byte[] var15 = new byte[this.field3015 * this.field3015];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3015; var17++) {
            for (int var18 = 0; var18 < this.field3015; var18++) {
                if (var17 >= this.field3015 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3016[5][3] = var15;
    }

    @ObfuscatedName("ih.j(I)V")
    public void method4844() {
        byte[] var1 = new byte[this.field3015 * this.field3015];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3015 * this.field3015];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3015; var5++) {
            for (int var6 = 0; var6 < this.field3015; var6++) {
                if (var6 <= var5 - this.field3015 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3016[6][0] = var3;
        byte[] var7 = new byte[this.field3015 * this.field3015];
        int var8 = 0;
        for (int var9 = this.field3015 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field3015; var10++) {
                if (var10 <= var9 - this.field3015 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3016[6][1] = var7;
        byte[] var11 = new byte[this.field3015 * this.field3015];
        int var12 = 0;
        for (int var13 = this.field3015 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field3015 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field3015 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3016[6][2] = var11;
        byte[] var15 = new byte[this.field3015 * this.field3015];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3015; var17++) {
            for (int var18 = this.field3015 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field3015 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3016[6][3] = var15;
    }

    @ObfuscatedName("ih.g(I)V")
    public void method4845() {
        byte[] var1 = new byte[this.field3015 * this.field3015];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3015 * this.field3015];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3015; var5++) {
            for (int var6 = 0; var6 < this.field3015; var6++) {
                if (var6 >= var5 - this.field3015 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3016[7][0] = var3;
        byte[] var7 = new byte[this.field3015 * this.field3015];
        int var8 = 0;
        for (int var9 = this.field3015 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field3015; var10++) {
                if (var10 >= var9 - this.field3015 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3016[7][1] = var7;
        byte[] var11 = new byte[this.field3015 * this.field3015];
        int var12 = 0;
        for (int var13 = this.field3015 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field3015 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field3015 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3016[7][2] = var11;
        byte[] var15 = new byte[this.field3015 * this.field3015];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3015; var17++) {
            for (int var18 = this.field3015 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field3015 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3016[7][3] = var15;
    }
}
