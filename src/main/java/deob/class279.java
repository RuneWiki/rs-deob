package deob;

@ObfuscatedName("ku")
public class class279 {

    @ObfuscatedName("ku.au")
    public int field3074;

    @ObfuscatedName("ku.ae")
    public byte[][][] field3075;

    public class279(int arg0) {
        this.field3074 = arg0;
    }

    @ObfuscatedName("ku.au(IIIIIIIIS)V")
    public void method5133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field3074 != 0 && this.field3075 != null) {
            int var9 = this.method5106(arg7, arg6);
            int var10 = this.method5100(arg6);
            class525.method8675(arg0, arg1, arg4, arg5, arg2, arg3, this.field3075[var10 - 1][var9], this.field3074, true);
        }
    }

    @ObfuscatedName("ku.ae(IIB)I")
    public int method5106(int arg0, int arg1) {
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

    @ObfuscatedName("ku.ao(II)I")
    public int method5100(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ku.at(I)V")
    public void method5119() {
        if (this.field3075 != null) {
            return;
        }
        this.field3075 = new byte[8][4][];
        this.method5101();
        this.method5114();
        this.method5103();
        this.method5128();
        this.method5105();
        this.method5131();
        this.method5107();
        this.method5104();
    }

    @ObfuscatedName("ku.ac(I)V")
    public void method5101() {
        byte[] var1 = new byte[this.field3074 * this.field3074];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3074; var3++) {
            for (int var4 = 0; var4 < this.field3074; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3075[0][0] = var1;
        byte[] var5 = new byte[this.field3074 * this.field3074];
        int var6 = 0;
        for (int var7 = this.field3074 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3074; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3075[0][1] = var5;
        byte[] var9 = new byte[this.field3074 * this.field3074];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3074; var11++) {
            for (int var12 = 0; var12 < this.field3074; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3075[0][2] = var9;
        byte[] var13 = new byte[this.field3074 * this.field3074];
        int var14 = 0;
        for (int var15 = this.field3074 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field3074; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3075[0][3] = var13;
    }

    @ObfuscatedName("ku.ai(I)V")
    public void method5114() {
        byte[] var1 = new byte[this.field3074 * this.field3074];
        int var2 = 0;
        for (int var3 = this.field3074 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3074; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3075[1][0] = var1;
        byte[] var5 = new byte[this.field3074 * this.field3074];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3074; var7++) {
            for (int var8 = 0; var8 < this.field3074; var8++) {
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
        this.field3075[1][1] = var5;
        byte[] var9 = new byte[this.field3074 * this.field3074];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3074; var11++) {
            for (int var12 = this.field3074 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3075[1][2] = var9;
        byte[] var13 = new byte[this.field3074 * this.field3074];
        int var14 = 0;
        for (int var15 = this.field3074 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field3074 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3075[1][3] = var13;
    }

    @ObfuscatedName("ku.az(B)V")
    public void method5103() {
        byte[] var1 = new byte[this.field3074 * this.field3074];
        int var2 = 0;
        for (int var3 = this.field3074 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field3074 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3075[2][0] = var1;
        byte[] var5 = new byte[this.field3074 * this.field3074];
        int var6 = 0;
        for (int var7 = this.field3074 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3074; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3075[2][1] = var5;
        byte[] var9 = new byte[this.field3074 * this.field3074];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3074; var11++) {
            for (int var12 = 0; var12 < this.field3074; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3075[2][2] = var9;
        byte[] var13 = new byte[this.field3074 * this.field3074];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field3074; var15++) {
            for (int var16 = this.field3074 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3075[2][3] = var13;
    }

    @ObfuscatedName("ku.ap(I)V")
    public void method5128() {
        byte[] var1 = new byte[this.field3074 * this.field3074];
        int var2 = 0;
        for (int var3 = this.field3074 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3074; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3075[3][0] = var1;
        byte[] var5 = new byte[this.field3074 * this.field3074];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3074; var7++) {
            for (int var8 = 0; var8 < this.field3074; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3075[3][1] = var5;
        byte[] var9 = new byte[this.field3074 * this.field3074];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3074; var11++) {
            for (int var12 = this.field3074 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3075[3][2] = var9;
        byte[] var13 = new byte[this.field3074 * this.field3074];
        int var14 = 0;
        for (int var15 = this.field3074 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field3074 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3075[3][3] = var13;
    }

    @ObfuscatedName("ku.aa(I)V")
    public void method5105() {
        byte[] var1 = new byte[this.field3074 * this.field3074];
        int var2 = 0;
        for (int var3 = this.field3074 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field3074 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3075[4][0] = var1;
        byte[] var5 = new byte[this.field3074 * this.field3074];
        int var6 = 0;
        for (int var7 = this.field3074 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3074; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3075[4][1] = var5;
        byte[] var9 = new byte[this.field3074 * this.field3074];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3074; var11++) {
            for (int var12 = 0; var12 < this.field3074; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3075[4][2] = var9;
        byte[] var13 = new byte[this.field3074 * this.field3074];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field3074; var15++) {
            for (int var16 = this.field3074 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3075[4][3] = var13;
    }

    @ObfuscatedName("ku.af(I)V")
    public void method5131() {
        byte[] var1 = new byte[this.field3074 * this.field3074];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3074 * this.field3074];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3074; var5++) {
            for (int var6 = 0; var6 < this.field3074; var6++) {
                if (var6 <= this.field3074 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3075[5][0] = var3;
        byte[] var7 = new byte[this.field3074 * this.field3074];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3074; var9++) {
            for (int var10 = 0; var10 < this.field3074; var10++) {
                if (var9 <= this.field3074 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3075[5][1] = var7;
        byte[] var11 = new byte[this.field3074 * this.field3074];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field3074; var13++) {
            for (int var14 = 0; var14 < this.field3074; var14++) {
                if (var14 >= this.field3074 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3075[5][2] = var11;
        byte[] var15 = new byte[this.field3074 * this.field3074];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3074; var17++) {
            for (int var18 = 0; var18 < this.field3074; var18++) {
                if (var17 >= this.field3074 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3075[5][3] = var15;
    }

    @ObfuscatedName("ku.ad(S)V")
    public void method5107() {
        byte[] var1 = new byte[this.field3074 * this.field3074];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3074 * this.field3074];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3074; var5++) {
            for (int var6 = 0; var6 < this.field3074; var6++) {
                if (var6 <= var5 - this.field3074 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3075[6][0] = var3;
        byte[] var7 = new byte[this.field3074 * this.field3074];
        int var8 = 0;
        for (int var9 = this.field3074 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field3074; var10++) {
                if (var10 <= var9 - this.field3074 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3075[6][1] = var7;
        byte[] var11 = new byte[this.field3074 * this.field3074];
        int var12 = 0;
        for (int var13 = this.field3074 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field3074 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field3074 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3075[6][2] = var11;
        byte[] var15 = new byte[this.field3074 * this.field3074];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3074; var17++) {
            for (int var18 = this.field3074 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field3074 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3075[6][3] = var15;
    }

    @ObfuscatedName("ku.aq(B)V")
    public void method5104() {
        byte[] var1 = new byte[this.field3074 * this.field3074];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3074 * this.field3074];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3074; var5++) {
            for (int var6 = 0; var6 < this.field3074; var6++) {
                if (var6 >= var5 - this.field3074 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3075[7][0] = var3;
        byte[] var7 = new byte[this.field3074 * this.field3074];
        int var8 = 0;
        for (int var9 = this.field3074 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field3074; var10++) {
                if (var10 >= var9 - this.field3074 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3075[7][1] = var7;
        byte[] var11 = new byte[this.field3074 * this.field3074];
        int var12 = 0;
        for (int var13 = this.field3074 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field3074 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field3074 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3075[7][2] = var11;
        byte[] var15 = new byte[this.field3074 * this.field3074];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3074; var17++) {
            for (int var18 = this.field3074 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field3074 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3075[7][3] = var15;
    }
}
