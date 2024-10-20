package deob;

@ObfuscatedName("lr")
public class class303 {

    @ObfuscatedName("lr.ak")
    public int field3246;

    @ObfuscatedName("lr.al")
    public byte[][][] field3245;

    public class303(int arg0) {
        this.field3246 = arg0;
    }

    @ObfuscatedName("lr.ak(IIIIIIIIB)V")
    public void method5500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field3246 != 0 && this.field3245 != null) {
            int var9 = this.method5471(arg7, arg6);
            int var10 = this.method5472(arg6);
            class556.method9101(arg0, arg1, arg4, arg5, arg2, arg3, this.field3245[var10 - 1][var9], this.field3246, true);
        }
    }

    @ObfuscatedName("lr.al(IIB)I")
    public int method5471(int arg0, int arg1) {
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

    @ObfuscatedName("lr.aj(IB)I")
    public int method5472(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("lr.az(I)V")
    public void method5488() {
        if (this.field3245 != null) {
            return;
        }
        this.field3245 = new byte[8][4][];
        this.method5477();
        this.method5475();
        this.method5491();
        this.method5487();
        this.method5501();
        this.method5479();
        this.method5511();
        this.method5481();
    }

    @ObfuscatedName("lr.af(I)V")
    public void method5477() {
        byte[] var1 = new byte[this.field3246 * this.field3246];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3246; var3++) {
            for (int var4 = 0; var4 < this.field3246; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3245[0][0] = var1;
        byte[] var5 = new byte[this.field3246 * this.field3246];
        int var6 = 0;
        for (int var7 = this.field3246 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3246; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3245[0][1] = var5;
        byte[] var9 = new byte[this.field3246 * this.field3246];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3246; var11++) {
            for (int var12 = 0; var12 < this.field3246; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3245[0][2] = var9;
        byte[] var13 = new byte[this.field3246 * this.field3246];
        int var14 = 0;
        for (int var15 = this.field3246 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field3246; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3245[0][3] = var13;
    }

    @ObfuscatedName("lr.aa(I)V")
    public void method5475() {
        byte[] var1 = new byte[this.field3246 * this.field3246];
        int var2 = 0;
        for (int var3 = this.field3246 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3246; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3245[1][0] = var1;
        byte[] var5 = new byte[this.field3246 * this.field3246];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3246; var7++) {
            for (int var8 = 0; var8 < this.field3246; var8++) {
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
        this.field3245[1][1] = var5;
        byte[] var9 = new byte[this.field3246 * this.field3246];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3246; var11++) {
            for (int var12 = this.field3246 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3245[1][2] = var9;
        byte[] var13 = new byte[this.field3246 * this.field3246];
        int var14 = 0;
        for (int var15 = this.field3246 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field3246 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3245[1][3] = var13;
    }

    @ObfuscatedName("lr.at(I)V")
    public void method5491() {
        byte[] var1 = new byte[this.field3246 * this.field3246];
        int var2 = 0;
        for (int var3 = this.field3246 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field3246 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3245[2][0] = var1;
        byte[] var5 = new byte[this.field3246 * this.field3246];
        int var6 = 0;
        for (int var7 = this.field3246 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3246; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3245[2][1] = var5;
        byte[] var9 = new byte[this.field3246 * this.field3246];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3246; var11++) {
            for (int var12 = 0; var12 < this.field3246; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3245[2][2] = var9;
        byte[] var13 = new byte[this.field3246 * this.field3246];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field3246; var15++) {
            for (int var16 = this.field3246 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3245[2][3] = var13;
    }

    @ObfuscatedName("lr.ab(I)V")
    public void method5487() {
        byte[] var1 = new byte[this.field3246 * this.field3246];
        int var2 = 0;
        for (int var3 = this.field3246 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3246; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3245[3][0] = var1;
        byte[] var5 = new byte[this.field3246 * this.field3246];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3246; var7++) {
            for (int var8 = 0; var8 < this.field3246; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3245[3][1] = var5;
        byte[] var9 = new byte[this.field3246 * this.field3246];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3246; var11++) {
            for (int var12 = this.field3246 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3245[3][2] = var9;
        byte[] var13 = new byte[this.field3246 * this.field3246];
        int var14 = 0;
        for (int var15 = this.field3246 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field3246 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3245[3][3] = var13;
    }

    @ObfuscatedName("lr.ac(I)V")
    public void method5501() {
        byte[] var1 = new byte[this.field3246 * this.field3246];
        int var2 = 0;
        for (int var3 = this.field3246 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field3246 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3245[4][0] = var1;
        byte[] var5 = new byte[this.field3246 * this.field3246];
        int var6 = 0;
        for (int var7 = this.field3246 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3246; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3245[4][1] = var5;
        byte[] var9 = new byte[this.field3246 * this.field3246];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3246; var11++) {
            for (int var12 = 0; var12 < this.field3246; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3245[4][2] = var9;
        byte[] var13 = new byte[this.field3246 * this.field3246];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field3246; var15++) {
            for (int var16 = this.field3246 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3245[4][3] = var13;
    }

    @ObfuscatedName("lr.ao(S)V")
    public void method5479() {
        byte[] var1 = new byte[this.field3246 * this.field3246];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3246 * this.field3246];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3246; var5++) {
            for (int var6 = 0; var6 < this.field3246; var6++) {
                if (var6 <= this.field3246 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3245[5][0] = var3;
        byte[] var7 = new byte[this.field3246 * this.field3246];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3246; var9++) {
            for (int var10 = 0; var10 < this.field3246; var10++) {
                if (var9 <= this.field3246 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3245[5][1] = var7;
        byte[] var11 = new byte[this.field3246 * this.field3246];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field3246; var13++) {
            for (int var14 = 0; var14 < this.field3246; var14++) {
                if (var14 >= this.field3246 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3245[5][2] = var11;
        byte[] var15 = new byte[this.field3246 * this.field3246];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3246; var17++) {
            for (int var18 = 0; var18 < this.field3246; var18++) {
                if (var17 >= this.field3246 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3245[5][3] = var15;
    }

    @ObfuscatedName("lr.ah(S)V")
    public void method5511() {
        byte[] var1 = new byte[this.field3246 * this.field3246];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3246 * this.field3246];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3246; var5++) {
            for (int var6 = 0; var6 < this.field3246; var6++) {
                if (var6 <= var5 - this.field3246 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3245[6][0] = var3;
        byte[] var7 = new byte[this.field3246 * this.field3246];
        int var8 = 0;
        for (int var9 = this.field3246 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field3246; var10++) {
                if (var10 <= var9 - this.field3246 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3245[6][1] = var7;
        byte[] var11 = new byte[this.field3246 * this.field3246];
        int var12 = 0;
        for (int var13 = this.field3246 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field3246 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field3246 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3245[6][2] = var11;
        byte[] var15 = new byte[this.field3246 * this.field3246];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3246; var17++) {
            for (int var18 = this.field3246 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field3246 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3245[6][3] = var15;
    }

    @ObfuscatedName("lr.av(I)V")
    public void method5481() {
        byte[] var1 = new byte[this.field3246 * this.field3246];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3246 * this.field3246];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3246; var5++) {
            for (int var6 = 0; var6 < this.field3246; var6++) {
                if (var6 >= var5 - this.field3246 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3245[7][0] = var3;
        byte[] var7 = new byte[this.field3246 * this.field3246];
        int var8 = 0;
        for (int var9 = this.field3246 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field3246; var10++) {
                if (var10 >= var9 - this.field3246 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3245[7][1] = var7;
        byte[] var11 = new byte[this.field3246 * this.field3246];
        int var12 = 0;
        for (int var13 = this.field3246 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field3246 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field3246 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3245[7][2] = var11;
        byte[] var15 = new byte[this.field3246 * this.field3246];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3246; var17++) {
            for (int var18 = this.field3246 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field3246 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3245[7][3] = var15;
    }
}
