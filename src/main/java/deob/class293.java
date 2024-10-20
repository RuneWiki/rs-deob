package deob;

@ObfuscatedName("lf")
public class class293 {

    @ObfuscatedName("lf.ac")
    public int field3103;

    @ObfuscatedName("lf.al")
    public byte[][][] field3102;

    public class293(int arg0) {
        this.field3103 = arg0;
    }

    @ObfuscatedName("lf.ac(IIIIIIIII)V")
    public void method5243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field3103 != 0 && this.field3102 != null) {
            int var9 = this.method5206(arg7, arg6);
            int var10 = this.method5211(arg6);
            class540.method8705(arg0, arg1, arg4, arg5, arg2, arg3, this.field3102[var10 - 1][var9], this.field3103, true);
        }
    }

    @ObfuscatedName("lf.al(III)I")
    public int method5206(int arg0, int arg1) {
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

    @ObfuscatedName("lf.ak(II)I")
    public int method5211(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("lf.ax(I)V")
    public void method5208() {
        if (this.field3102 != null) {
            return;
        }
        this.field3102 = new byte[8][4][];
        this.method5237();
        this.method5217();
        this.method5223();
        this.method5212();
        this.method5213();
        this.method5214();
        this.method5229();
        this.method5216();
    }

    @ObfuscatedName("lf.ao(B)V")
    public void method5237() {
        byte[] var1 = new byte[this.field3103 * this.field3103];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3103; var3++) {
            for (int var4 = 0; var4 < this.field3103; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3102[0][0] = var1;
        byte[] var5 = new byte[this.field3103 * this.field3103];
        int var6 = 0;
        for (int var7 = this.field3103 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3103; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3102[0][1] = var5;
        byte[] var9 = new byte[this.field3103 * this.field3103];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3103; var11++) {
            for (int var12 = 0; var12 < this.field3103; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3102[0][2] = var9;
        byte[] var13 = new byte[this.field3103 * this.field3103];
        int var14 = 0;
        for (int var15 = this.field3103 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field3103; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3102[0][3] = var13;
    }

    @ObfuscatedName("lf.ah(I)V")
    public void method5217() {
        byte[] var1 = new byte[this.field3103 * this.field3103];
        int var2 = 0;
        for (int var3 = this.field3103 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3103; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3102[1][0] = var1;
        byte[] var5 = new byte[this.field3103 * this.field3103];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3103; var7++) {
            for (int var8 = 0; var8 < this.field3103; var8++) {
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
        this.field3102[1][1] = var5;
        byte[] var9 = new byte[this.field3103 * this.field3103];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3103; var11++) {
            for (int var12 = this.field3103 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3102[1][2] = var9;
        byte[] var13 = new byte[this.field3103 * this.field3103];
        int var14 = 0;
        for (int var15 = this.field3103 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field3103 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3102[1][3] = var13;
    }

    @ObfuscatedName("lf.ar(I)V")
    public void method5223() {
        byte[] var1 = new byte[this.field3103 * this.field3103];
        int var2 = 0;
        for (int var3 = this.field3103 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field3103 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3102[2][0] = var1;
        byte[] var5 = new byte[this.field3103 * this.field3103];
        int var6 = 0;
        for (int var7 = this.field3103 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3103; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3102[2][1] = var5;
        byte[] var9 = new byte[this.field3103 * this.field3103];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3103; var11++) {
            for (int var12 = 0; var12 < this.field3103; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3102[2][2] = var9;
        byte[] var13 = new byte[this.field3103 * this.field3103];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field3103; var15++) {
            for (int var16 = this.field3103 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3102[2][3] = var13;
    }

    @ObfuscatedName("lf.ab(I)V")
    public void method5212() {
        byte[] var1 = new byte[this.field3103 * this.field3103];
        int var2 = 0;
        for (int var3 = this.field3103 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3103; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3102[3][0] = var1;
        byte[] var5 = new byte[this.field3103 * this.field3103];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3103; var7++) {
            for (int var8 = 0; var8 < this.field3103; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3102[3][1] = var5;
        byte[] var9 = new byte[this.field3103 * this.field3103];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3103; var11++) {
            for (int var12 = this.field3103 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3102[3][2] = var9;
        byte[] var13 = new byte[this.field3103 * this.field3103];
        int var14 = 0;
        for (int var15 = this.field3103 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field3103 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3102[3][3] = var13;
    }

    @ObfuscatedName("lf.am(I)V")
    public void method5213() {
        byte[] var1 = new byte[this.field3103 * this.field3103];
        int var2 = 0;
        for (int var3 = this.field3103 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field3103 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3102[4][0] = var1;
        byte[] var5 = new byte[this.field3103 * this.field3103];
        int var6 = 0;
        for (int var7 = this.field3103 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3103; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3102[4][1] = var5;
        byte[] var9 = new byte[this.field3103 * this.field3103];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3103; var11++) {
            for (int var12 = 0; var12 < this.field3103; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3102[4][2] = var9;
        byte[] var13 = new byte[this.field3103 * this.field3103];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field3103; var15++) {
            for (int var16 = this.field3103 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3102[4][3] = var13;
    }

    @ObfuscatedName("lf.av(I)V")
    public void method5214() {
        byte[] var1 = new byte[this.field3103 * this.field3103];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3103 * this.field3103];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3103; var5++) {
            for (int var6 = 0; var6 < this.field3103; var6++) {
                if (var6 <= this.field3103 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3102[5][0] = var3;
        byte[] var7 = new byte[this.field3103 * this.field3103];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3103; var9++) {
            for (int var10 = 0; var10 < this.field3103; var10++) {
                if (var9 <= this.field3103 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3102[5][1] = var7;
        byte[] var11 = new byte[this.field3103 * this.field3103];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field3103; var13++) {
            for (int var14 = 0; var14 < this.field3103; var14++) {
                if (var14 >= this.field3103 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3102[5][2] = var11;
        byte[] var15 = new byte[this.field3103 * this.field3103];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3103; var17++) {
            for (int var18 = 0; var18 < this.field3103; var18++) {
                if (var17 >= this.field3103 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3102[5][3] = var15;
    }

    @ObfuscatedName("lf.ag(I)V")
    public void method5229() {
        byte[] var1 = new byte[this.field3103 * this.field3103];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3103 * this.field3103];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3103; var5++) {
            for (int var6 = 0; var6 < this.field3103; var6++) {
                if (var6 <= var5 - this.field3103 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3102[6][0] = var3;
        byte[] var7 = new byte[this.field3103 * this.field3103];
        int var8 = 0;
        for (int var9 = this.field3103 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field3103; var10++) {
                if (var10 <= var9 - this.field3103 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3102[6][1] = var7;
        byte[] var11 = new byte[this.field3103 * this.field3103];
        int var12 = 0;
        for (int var13 = this.field3103 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field3103 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field3103 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3102[6][2] = var11;
        byte[] var15 = new byte[this.field3103 * this.field3103];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3103; var17++) {
            for (int var18 = this.field3103 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field3103 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3102[6][3] = var15;
    }

    @ObfuscatedName("lf.aa(I)V")
    public void method5216() {
        byte[] var1 = new byte[this.field3103 * this.field3103];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3103 * this.field3103];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3103; var5++) {
            for (int var6 = 0; var6 < this.field3103; var6++) {
                if (var6 >= var5 - this.field3103 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3102[7][0] = var3;
        byte[] var7 = new byte[this.field3103 * this.field3103];
        int var8 = 0;
        for (int var9 = this.field3103 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field3103; var10++) {
                if (var10 >= var9 - this.field3103 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3102[7][1] = var7;
        byte[] var11 = new byte[this.field3103 * this.field3103];
        int var12 = 0;
        for (int var13 = this.field3103 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field3103 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field3103 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3102[7][2] = var11;
        byte[] var15 = new byte[this.field3103 * this.field3103];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3103; var17++) {
            for (int var18 = this.field3103 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field3103 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3102[7][3] = var15;
    }
}
