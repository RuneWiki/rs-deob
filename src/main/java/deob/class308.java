package deob;

@ObfuscatedName("lo")
public class class308 {

    @ObfuscatedName("lo.ac")
    public int field3272;

    @ObfuscatedName("lo.ae")
    public byte[][][] field3271;

    public class308(int arg0) {
        this.field3272 = arg0;
    }

    @ObfuscatedName("lo.ac(IIIIIIIIB)V")
    public void method5686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field3272 != 0 && this.field3271 != null) {
            int var9 = this.method5646(arg7, arg6);
            int var10 = this.method5647(arg6);
            class561.method9305(arg0, arg1, arg4, arg5, arg2, arg3, this.field3271[var10 - 1][var9], this.field3272, true);
        }
    }

    @ObfuscatedName("lo.ae(III)I")
    public int method5646(int arg0, int arg1) {
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

    @ObfuscatedName("lo.ag(II)I")
    public int method5647(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("lo.am(I)V")
    public void method5667() {
        if (this.field3271 != null) {
            return;
        }
        this.field3271 = new byte[8][4][];
        this.method5649();
        this.method5650();
        this.method5689();
        this.method5652();
        this.method5669();
        this.method5681();
        this.method5666();
        this.method5656();
    }

    @ObfuscatedName("lo.ax(I)V")
    public void method5649() {
        byte[] var1 = new byte[this.field3272 * this.field3272];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3272; var3++) {
            for (int var4 = 0; var4 < this.field3272; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3271[0][0] = var1;
        byte[] var5 = new byte[this.field3272 * this.field3272];
        int var6 = 0;
        for (int var7 = this.field3272 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3272; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3271[0][1] = var5;
        byte[] var9 = new byte[this.field3272 * this.field3272];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3272; var11++) {
            for (int var12 = 0; var12 < this.field3272; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3271[0][2] = var9;
        byte[] var13 = new byte[this.field3272 * this.field3272];
        int var14 = 0;
        for (int var15 = this.field3272 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field3272; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3271[0][3] = var13;
    }

    @ObfuscatedName("lo.aq(I)V")
    public void method5650() {
        byte[] var1 = new byte[this.field3272 * this.field3272];
        int var2 = 0;
        for (int var3 = this.field3272 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3272; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3271[1][0] = var1;
        byte[] var5 = new byte[this.field3272 * this.field3272];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3272; var7++) {
            for (int var8 = 0; var8 < this.field3272; var8++) {
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
        this.field3271[1][1] = var5;
        byte[] var9 = new byte[this.field3272 * this.field3272];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3272; var11++) {
            for (int var12 = this.field3272 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3271[1][2] = var9;
        byte[] var13 = new byte[this.field3272 * this.field3272];
        int var14 = 0;
        for (int var15 = this.field3272 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field3272 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3271[1][3] = var13;
    }

    @ObfuscatedName("lo.af(B)V")
    public void method5689() {
        byte[] var1 = new byte[this.field3272 * this.field3272];
        int var2 = 0;
        for (int var3 = this.field3272 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field3272 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3271[2][0] = var1;
        byte[] var5 = new byte[this.field3272 * this.field3272];
        int var6 = 0;
        for (int var7 = this.field3272 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3272; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3271[2][1] = var5;
        byte[] var9 = new byte[this.field3272 * this.field3272];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3272; var11++) {
            for (int var12 = 0; var12 < this.field3272; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3271[2][2] = var9;
        byte[] var13 = new byte[this.field3272 * this.field3272];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field3272; var15++) {
            for (int var16 = this.field3272 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3271[2][3] = var13;
    }

    @ObfuscatedName("lo.at(I)V")
    public void method5652() {
        byte[] var1 = new byte[this.field3272 * this.field3272];
        int var2 = 0;
        for (int var3 = this.field3272 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3272; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3271[3][0] = var1;
        byte[] var5 = new byte[this.field3272 * this.field3272];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3272; var7++) {
            for (int var8 = 0; var8 < this.field3272; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3271[3][1] = var5;
        byte[] var9 = new byte[this.field3272 * this.field3272];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3272; var11++) {
            for (int var12 = this.field3272 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3271[3][2] = var9;
        byte[] var13 = new byte[this.field3272 * this.field3272];
        int var14 = 0;
        for (int var15 = this.field3272 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field3272 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3271[3][3] = var13;
    }

    @ObfuscatedName("lo.au(I)V")
    public void method5669() {
        byte[] var1 = new byte[this.field3272 * this.field3272];
        int var2 = 0;
        for (int var3 = this.field3272 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field3272 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3271[4][0] = var1;
        byte[] var5 = new byte[this.field3272 * this.field3272];
        int var6 = 0;
        for (int var7 = this.field3272 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3272; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3271[4][1] = var5;
        byte[] var9 = new byte[this.field3272 * this.field3272];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3272; var11++) {
            for (int var12 = 0; var12 < this.field3272; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3271[4][2] = var9;
        byte[] var13 = new byte[this.field3272 * this.field3272];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field3272; var15++) {
            for (int var16 = this.field3272 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3271[4][3] = var13;
    }

    @ObfuscatedName("lo.ar(S)V")
    public void method5681() {
        byte[] var1 = new byte[this.field3272 * this.field3272];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3272 * this.field3272];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3272; var5++) {
            for (int var6 = 0; var6 < this.field3272; var6++) {
                if (var6 <= this.field3272 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3271[5][0] = var3;
        byte[] var7 = new byte[this.field3272 * this.field3272];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3272; var9++) {
            for (int var10 = 0; var10 < this.field3272; var10++) {
                if (var9 <= this.field3272 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3271[5][1] = var7;
        byte[] var11 = new byte[this.field3272 * this.field3272];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field3272; var13++) {
            for (int var14 = 0; var14 < this.field3272; var14++) {
                if (var14 >= this.field3272 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3271[5][2] = var11;
        byte[] var15 = new byte[this.field3272 * this.field3272];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3272; var17++) {
            for (int var18 = 0; var18 < this.field3272; var18++) {
                if (var17 >= this.field3272 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3271[5][3] = var15;
    }

    @ObfuscatedName("lo.al(B)V")
    public void method5666() {
        byte[] var1 = new byte[this.field3272 * this.field3272];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3272 * this.field3272];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3272; var5++) {
            for (int var6 = 0; var6 < this.field3272; var6++) {
                if (var6 <= var5 - this.field3272 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3271[6][0] = var3;
        byte[] var7 = new byte[this.field3272 * this.field3272];
        int var8 = 0;
        for (int var9 = this.field3272 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field3272; var10++) {
                if (var10 <= var9 - this.field3272 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3271[6][1] = var7;
        byte[] var11 = new byte[this.field3272 * this.field3272];
        int var12 = 0;
        for (int var13 = this.field3272 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field3272 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field3272 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3271[6][2] = var11;
        byte[] var15 = new byte[this.field3272 * this.field3272];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3272; var17++) {
            for (int var18 = this.field3272 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field3272 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3271[6][3] = var15;
    }

    @ObfuscatedName("lo.ad(I)V")
    public void method5656() {
        byte[] var1 = new byte[this.field3272 * this.field3272];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3272 * this.field3272];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3272; var5++) {
            for (int var6 = 0; var6 < this.field3272; var6++) {
                if (var6 >= var5 - this.field3272 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3271[7][0] = var3;
        byte[] var7 = new byte[this.field3272 * this.field3272];
        int var8 = 0;
        for (int var9 = this.field3272 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field3272; var10++) {
                if (var10 >= var9 - this.field3272 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3271[7][1] = var7;
        byte[] var11 = new byte[this.field3272 * this.field3272];
        int var12 = 0;
        for (int var13 = this.field3272 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field3272 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field3272 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3271[7][2] = var11;
        byte[] var15 = new byte[this.field3272 * this.field3272];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3272; var17++) {
            for (int var18 = this.field3272 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field3272 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3271[7][3] = var15;
    }
}
