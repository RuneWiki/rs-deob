package deob;

@ObfuscatedName("ac")
public class class36 {

    @ObfuscatedName("ac.c")
    public int field322;

    @ObfuscatedName("ac.q")
    public byte[][][] field323;

    public class36(int arg0) {
        this.field322 = arg0;
    }

    @ObfuscatedName("ac.c(IIIIIIIIB)V")
    public void method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field322 != 0 && this.field323 != null) {
            int var9 = this.method577(arg7, arg6);
            int var10 = this.method578(arg6);
            class320.method5382(arg0, arg1, arg4, arg5, arg2, arg3, this.field323[var10 - 1][var9], this.field322, true);
        }
    }

    @ObfuscatedName("ac.q(III)I")
    public int method577(int arg0, int arg1) {
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

    @ObfuscatedName("ac.m(II)I")
    public int method578(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ac.j(B)V")
    public void method579() {
        if (this.field323 != null) {
            return;
        }
        this.field323 = new byte[8][4][];
        this.method580();
        this.method581();
        this.method604();
        this.method596();
        this.method584();
        this.method606();
        this.method586();
        this.method599();
    }

    @ObfuscatedName("ac.g(S)V")
    public void method580() {
        byte[] var1 = new byte[this.field322 * this.field322];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field322; var3++) {
            for (int var4 = 0; var4 < this.field322; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field323[0][0] = var1;
        byte[] var5 = new byte[this.field322 * this.field322];
        int var6 = 0;
        for (int var7 = this.field322 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field322; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field323[0][1] = var5;
        byte[] var9 = new byte[this.field322 * this.field322];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field322; var11++) {
            for (int var12 = 0; var12 < this.field322; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field323[0][2] = var9;
        byte[] var13 = new byte[this.field322 * this.field322];
        int var14 = 0;
        for (int var15 = this.field322 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field322; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field323[0][3] = var13;
    }

    @ObfuscatedName("ac.i(S)V")
    public void method581() {
        byte[] var1 = new byte[this.field322 * this.field322];
        int var2 = 0;
        for (int var3 = this.field322 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field322; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field323[1][0] = var1;
        byte[] var5 = new byte[this.field322 * this.field322];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field322; var7++) {
            for (int var8 = 0; var8 < this.field322; var8++) {
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
        this.field323[1][1] = var5;
        byte[] var9 = new byte[this.field322 * this.field322];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field322; var11++) {
            for (int var12 = this.field322 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field323[1][2] = var9;
        byte[] var13 = new byte[this.field322 * this.field322];
        int var14 = 0;
        for (int var15 = this.field322 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field322 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field323[1][3] = var13;
    }

    @ObfuscatedName("ac.h(I)V")
    public void method604() {
        byte[] var1 = new byte[this.field322 * this.field322];
        int var2 = 0;
        for (int var3 = this.field322 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field322 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field323[2][0] = var1;
        byte[] var5 = new byte[this.field322 * this.field322];
        int var6 = 0;
        for (int var7 = this.field322 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field322; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field323[2][1] = var5;
        byte[] var9 = new byte[this.field322 * this.field322];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field322; var11++) {
            for (int var12 = 0; var12 < this.field322; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field323[2][2] = var9;
        byte[] var13 = new byte[this.field322 * this.field322];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field322; var15++) {
            for (int var16 = this.field322 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field323[2][3] = var13;
    }

    @ObfuscatedName("ac.l(I)V")
    public void method596() {
        byte[] var1 = new byte[this.field322 * this.field322];
        int var2 = 0;
        for (int var3 = this.field322 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field322; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field323[3][0] = var1;
        byte[] var5 = new byte[this.field322 * this.field322];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field322; var7++) {
            for (int var8 = 0; var8 < this.field322; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field323[3][1] = var5;
        byte[] var9 = new byte[this.field322 * this.field322];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field322; var11++) {
            for (int var12 = this.field322 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field323[3][2] = var9;
        byte[] var13 = new byte[this.field322 * this.field322];
        int var14 = 0;
        for (int var15 = this.field322 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field322 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field323[3][3] = var13;
    }

    @ObfuscatedName("ac.o(I)V")
    public void method584() {
        byte[] var1 = new byte[this.field322 * this.field322];
        int var2 = 0;
        for (int var3 = this.field322 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field322 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field323[4][0] = var1;
        byte[] var5 = new byte[this.field322 * this.field322];
        int var6 = 0;
        for (int var7 = this.field322 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field322; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field323[4][1] = var5;
        byte[] var9 = new byte[this.field322 * this.field322];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field322; var11++) {
            for (int var12 = 0; var12 < this.field322; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field323[4][2] = var9;
        byte[] var13 = new byte[this.field322 * this.field322];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field322; var15++) {
            for (int var16 = this.field322 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field323[4][3] = var13;
    }

    @ObfuscatedName("ac.k(I)V")
    public void method606() {
        byte[] var1 = new byte[this.field322 * this.field322];
        boolean var2 = false;
        byte[] var3 = new byte[this.field322 * this.field322];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field322; var5++) {
            for (int var6 = 0; var6 < this.field322; var6++) {
                if (var6 <= this.field322 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field323[5][0] = var3;
        byte[] var7 = new byte[this.field322 * this.field322];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field322; var9++) {
            for (int var10 = 0; var10 < this.field322; var10++) {
                if (var9 <= this.field322 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field323[5][1] = var7;
        byte[] var11 = new byte[this.field322 * this.field322];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field322; var13++) {
            for (int var14 = 0; var14 < this.field322; var14++) {
                if (var14 >= this.field322 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field323[5][2] = var11;
        byte[] var15 = new byte[this.field322 * this.field322];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field322; var17++) {
            for (int var18 = 0; var18 < this.field322; var18++) {
                if (var17 >= this.field322 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field323[5][3] = var15;
    }

    @ObfuscatedName("ac.v(I)V")
    public void method586() {
        byte[] var1 = new byte[this.field322 * this.field322];
        boolean var2 = false;
        byte[] var3 = new byte[this.field322 * this.field322];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field322; var5++) {
            for (int var6 = 0; var6 < this.field322; var6++) {
                if (var6 <= var5 - this.field322 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field323[6][0] = var3;
        byte[] var7 = new byte[this.field322 * this.field322];
        int var8 = 0;
        for (int var9 = this.field322 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field322; var10++) {
                if (var10 <= var9 - this.field322 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field323[6][1] = var7;
        byte[] var11 = new byte[this.field322 * this.field322];
        int var12 = 0;
        for (int var13 = this.field322 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field322 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field322 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field323[6][2] = var11;
        byte[] var15 = new byte[this.field322 * this.field322];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field322; var17++) {
            for (int var18 = this.field322 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field322 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field323[6][3] = var15;
    }

    @ObfuscatedName("ac.p(B)V")
    public void method599() {
        byte[] var1 = new byte[this.field322 * this.field322];
        boolean var2 = false;
        byte[] var3 = new byte[this.field322 * this.field322];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field322; var5++) {
            for (int var6 = 0; var6 < this.field322; var6++) {
                if (var6 >= var5 - this.field322 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field323[7][0] = var3;
        byte[] var7 = new byte[this.field322 * this.field322];
        int var8 = 0;
        for (int var9 = this.field322 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field322; var10++) {
                if (var10 >= var9 - this.field322 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field323[7][1] = var7;
        byte[] var11 = new byte[this.field322 * this.field322];
        int var12 = 0;
        for (int var13 = this.field322 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field322 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field322 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field323[7][2] = var11;
        byte[] var15 = new byte[this.field322 * this.field322];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field322; var17++) {
            for (int var18 = this.field322 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field322 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field323[7][3] = var15;
    }
}
