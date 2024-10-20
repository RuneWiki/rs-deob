package deob;

@ObfuscatedName("az")
public class class41 {

    @ObfuscatedName("az.u")
    public int field352;

    @ObfuscatedName("az.f")
    public byte[][][] field345;

    public class41(int arg0) {
        this.field352 = arg0;
    }

    @ObfuscatedName("az.u(IIIIIIIII)V")
    public void method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field352 != 0 && this.field345 != null) {
            int var9 = this.method614(arg7, arg6);
            int var10 = this.method623(arg6);
            class321.method5598(arg0, arg1, arg4, arg5, arg2, arg3, this.field345[var10 - 1][var9], this.field352, true);
        }
    }

    @ObfuscatedName("az.f(III)I")
    public int method614(int arg0, int arg1) {
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

    @ObfuscatedName("az.b(II)I")
    public int method623(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("az.g(I)V")
    public void method634() {
        if (this.field345 != null) {
            return;
        }
        this.field345 = new byte[8][4][];
        this.method645();
        this.method617();
        this.method622();
        this.method619();
        this.method620();
        this.method621();
        this.method648();
        this.method639();
    }

    @ObfuscatedName("az.z(B)V")
    public void method645() {
        byte[] var1 = new byte[this.field352 * this.field352];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field352; var3++) {
            for (int var4 = 0; var4 < this.field352; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field345[0][0] = var1;
        byte[] var5 = new byte[this.field352 * this.field352];
        int var6 = 0;
        for (int var7 = this.field352 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field352; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field345[0][1] = var5;
        byte[] var9 = new byte[this.field352 * this.field352];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field352; var11++) {
            for (int var12 = 0; var12 < this.field352; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field345[0][2] = var9;
        byte[] var13 = new byte[this.field352 * this.field352];
        int var14 = 0;
        for (int var15 = this.field352 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field352; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field345[0][3] = var13;
    }

    @ObfuscatedName("az.p(I)V")
    public void method617() {
        byte[] var1 = new byte[this.field352 * this.field352];
        int var2 = 0;
        for (int var3 = this.field352 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field352; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field345[1][0] = var1;
        byte[] var5 = new byte[this.field352 * this.field352];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field352; var7++) {
            for (int var8 = 0; var8 < this.field352; var8++) {
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
        this.field345[1][1] = var5;
        byte[] var9 = new byte[this.field352 * this.field352];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field352; var11++) {
            for (int var12 = this.field352 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field345[1][2] = var9;
        byte[] var13 = new byte[this.field352 * this.field352];
        int var14 = 0;
        for (int var15 = this.field352 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field352 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field345[1][3] = var13;
    }

    @ObfuscatedName("az.h(S)V")
    public void method622() {
        byte[] var1 = new byte[this.field352 * this.field352];
        int var2 = 0;
        for (int var3 = this.field352 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field352 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field345[2][0] = var1;
        byte[] var5 = new byte[this.field352 * this.field352];
        int var6 = 0;
        for (int var7 = this.field352 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field352; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field345[2][1] = var5;
        byte[] var9 = new byte[this.field352 * this.field352];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field352; var11++) {
            for (int var12 = 0; var12 < this.field352; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field345[2][2] = var9;
        byte[] var13 = new byte[this.field352 * this.field352];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field352; var15++) {
            for (int var16 = this.field352 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field345[2][3] = var13;
    }

    @ObfuscatedName("az.y(I)V")
    public void method619() {
        byte[] var1 = new byte[this.field352 * this.field352];
        int var2 = 0;
        for (int var3 = this.field352 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field352; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field345[3][0] = var1;
        byte[] var5 = new byte[this.field352 * this.field352];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field352; var7++) {
            for (int var8 = 0; var8 < this.field352; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field345[3][1] = var5;
        byte[] var9 = new byte[this.field352 * this.field352];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field352; var11++) {
            for (int var12 = this.field352 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field345[3][2] = var9;
        byte[] var13 = new byte[this.field352 * this.field352];
        int var14 = 0;
        for (int var15 = this.field352 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field352 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field345[3][3] = var13;
    }

    @ObfuscatedName("az.w(I)V")
    public void method620() {
        byte[] var1 = new byte[this.field352 * this.field352];
        int var2 = 0;
        for (int var3 = this.field352 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field352 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field345[4][0] = var1;
        byte[] var5 = new byte[this.field352 * this.field352];
        int var6 = 0;
        for (int var7 = this.field352 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field352; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field345[4][1] = var5;
        byte[] var9 = new byte[this.field352 * this.field352];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field352; var11++) {
            for (int var12 = 0; var12 < this.field352; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field345[4][2] = var9;
        byte[] var13 = new byte[this.field352 * this.field352];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field352; var15++) {
            for (int var16 = this.field352 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field345[4][3] = var13;
    }

    @ObfuscatedName("az.i(I)V")
    public void method621() {
        byte[] var1 = new byte[this.field352 * this.field352];
        boolean var2 = false;
        byte[] var3 = new byte[this.field352 * this.field352];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field352; var5++) {
            for (int var6 = 0; var6 < this.field352; var6++) {
                if (var6 <= this.field352 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field345[5][0] = var3;
        byte[] var7 = new byte[this.field352 * this.field352];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field352; var9++) {
            for (int var10 = 0; var10 < this.field352; var10++) {
                if (var9 <= this.field352 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field345[5][1] = var7;
        byte[] var11 = new byte[this.field352 * this.field352];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field352; var13++) {
            for (int var14 = 0; var14 < this.field352; var14++) {
                if (var14 >= this.field352 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field345[5][2] = var11;
        byte[] var15 = new byte[this.field352 * this.field352];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field352; var17++) {
            for (int var18 = 0; var18 < this.field352; var18++) {
                if (var17 >= this.field352 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field345[5][3] = var15;
    }

    @ObfuscatedName("az.k(I)V")
    public void method648() {
        byte[] var1 = new byte[this.field352 * this.field352];
        boolean var2 = false;
        byte[] var3 = new byte[this.field352 * this.field352];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field352; var5++) {
            for (int var6 = 0; var6 < this.field352; var6++) {
                if (var6 <= var5 - this.field352 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field345[6][0] = var3;
        byte[] var7 = new byte[this.field352 * this.field352];
        int var8 = 0;
        for (int var9 = this.field352 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field352; var10++) {
                if (var10 <= var9 - this.field352 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field345[6][1] = var7;
        byte[] var11 = new byte[this.field352 * this.field352];
        int var12 = 0;
        for (int var13 = this.field352 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field352 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field352 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field345[6][2] = var11;
        byte[] var15 = new byte[this.field352 * this.field352];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field352; var17++) {
            for (int var18 = this.field352 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field352 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field345[6][3] = var15;
    }

    @ObfuscatedName("az.x(B)V")
    public void method639() {
        byte[] var1 = new byte[this.field352 * this.field352];
        boolean var2 = false;
        byte[] var3 = new byte[this.field352 * this.field352];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field352; var5++) {
            for (int var6 = 0; var6 < this.field352; var6++) {
                if (var6 >= var5 - this.field352 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field345[7][0] = var3;
        byte[] var7 = new byte[this.field352 * this.field352];
        int var8 = 0;
        for (int var9 = this.field352 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field352; var10++) {
                if (var10 >= var9 - this.field352 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field345[7][1] = var7;
        byte[] var11 = new byte[this.field352 * this.field352];
        int var12 = 0;
        for (int var13 = this.field352 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field352 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field352 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field345[7][2] = var11;
        byte[] var15 = new byte[this.field352 * this.field352];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field352; var17++) {
            for (int var18 = this.field352 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field352 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field345[7][3] = var15;
    }
}
