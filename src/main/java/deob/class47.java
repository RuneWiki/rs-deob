package deob;

@ObfuscatedName("am")
public class class47 {

    @ObfuscatedName("am.a")
    public int field555;

    @ObfuscatedName("am.w")
    public byte[][][] field554;

    public class47(int arg0) {
        this.field555 = arg0;
    }

    @ObfuscatedName("am.a(IIIIIIIII)V")
    public void method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field555 != 0 && this.field554 != null) {
            int var9 = this.method583(arg7, arg6);
            int var10 = this.method615(arg6);
            class295.method4713(arg0, arg1, arg4, arg5, arg2, arg3, this.field554[var10 - 1][var9], this.field555, true);
        }
    }

    @ObfuscatedName("am.w(III)I")
    public int method583(int arg0, int arg1) {
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

    @ObfuscatedName("am.e(II)I")
    public int method615(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("am.k(I)V")
    public void method585() {
        if (this.field554 != null) {
            return;
        }
        this.field554 = new byte[8][4][];
        this.method604();
        this.method587();
        this.method614();
        this.method589();
        this.method590();
        this.method591();
        this.method588();
        this.method586();
    }

    @ObfuscatedName("am.u(B)V")
    public void method604() {
        byte[] var1 = new byte[this.field555 * this.field555];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field555; var3++) {
            for (int var4 = 0; var4 < this.field555; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field554[0][0] = var1;
        byte[] var5 = new byte[this.field555 * this.field555];
        int var6 = 0;
        for (int var7 = this.field555 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field555; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field554[0][1] = var5;
        byte[] var9 = new byte[this.field555 * this.field555];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field555; var11++) {
            for (int var12 = 0; var12 < this.field555; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field554[0][2] = var9;
        byte[] var13 = new byte[this.field555 * this.field555];
        int var14 = 0;
        for (int var15 = this.field555 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field555; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field554[0][3] = var13;
    }

    @ObfuscatedName("am.z(I)V")
    public void method587() {
        byte[] var1 = new byte[this.field555 * this.field555];
        int var2 = 0;
        for (int var3 = this.field555 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field555; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field554[1][0] = var1;
        byte[] var5 = new byte[this.field555 * this.field555];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field555; var7++) {
            for (int var8 = 0; var8 < this.field555; var8++) {
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
        this.field554[1][1] = var5;
        byte[] var9 = new byte[this.field555 * this.field555];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field555; var11++) {
            for (int var12 = this.field555 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field554[1][2] = var9;
        byte[] var13 = new byte[this.field555 * this.field555];
        int var14 = 0;
        for (int var15 = this.field555 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field555 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field554[1][3] = var13;
    }

    @ObfuscatedName("am.t(I)V")
    public void method614() {
        byte[] var1 = new byte[this.field555 * this.field555];
        int var2 = 0;
        for (int var3 = this.field555 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field555 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field554[2][0] = var1;
        byte[] var5 = new byte[this.field555 * this.field555];
        int var6 = 0;
        for (int var7 = this.field555 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field555; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field554[2][1] = var5;
        byte[] var9 = new byte[this.field555 * this.field555];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field555; var11++) {
            for (int var12 = 0; var12 < this.field555; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field554[2][2] = var9;
        byte[] var13 = new byte[this.field555 * this.field555];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field555; var15++) {
            for (int var16 = this.field555 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field554[2][3] = var13;
    }

    @ObfuscatedName("am.f(B)V")
    public void method589() {
        byte[] var1 = new byte[this.field555 * this.field555];
        int var2 = 0;
        for (int var3 = this.field555 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field555; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field554[3][0] = var1;
        byte[] var5 = new byte[this.field555 * this.field555];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field555; var7++) {
            for (int var8 = 0; var8 < this.field555; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field554[3][1] = var5;
        byte[] var9 = new byte[this.field555 * this.field555];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field555; var11++) {
            for (int var12 = this.field555 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field554[3][2] = var9;
        byte[] var13 = new byte[this.field555 * this.field555];
        int var14 = 0;
        for (int var15 = this.field555 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field555 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field554[3][3] = var13;
    }

    @ObfuscatedName("am.g(B)V")
    public void method590() {
        byte[] var1 = new byte[this.field555 * this.field555];
        int var2 = 0;
        for (int var3 = this.field555 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field555 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field554[4][0] = var1;
        byte[] var5 = new byte[this.field555 * this.field555];
        int var6 = 0;
        for (int var7 = this.field555 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field555; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field554[4][1] = var5;
        byte[] var9 = new byte[this.field555 * this.field555];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field555; var11++) {
            for (int var12 = 0; var12 < this.field555; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field554[4][2] = var9;
        byte[] var13 = new byte[this.field555 * this.field555];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field555; var15++) {
            for (int var16 = this.field555 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field554[4][3] = var13;
    }

    @ObfuscatedName("am.x(I)V")
    public void method591() {
        byte[] var1 = new byte[this.field555 * this.field555];
        boolean var2 = false;
        byte[] var3 = new byte[this.field555 * this.field555];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field555; var5++) {
            for (int var6 = 0; var6 < this.field555; var6++) {
                if (var6 <= this.field555 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field554[5][0] = var3;
        byte[] var7 = new byte[this.field555 * this.field555];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field555; var9++) {
            for (int var10 = 0; var10 < this.field555; var10++) {
                if (var9 <= this.field555 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field554[5][1] = var7;
        byte[] var11 = new byte[this.field555 * this.field555];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field555; var13++) {
            for (int var14 = 0; var14 < this.field555; var14++) {
                if (var14 >= this.field555 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field554[5][2] = var11;
        byte[] var15 = new byte[this.field555 * this.field555];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field555; var17++) {
            for (int var18 = 0; var18 < this.field555; var18++) {
                if (var17 >= this.field555 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field554[5][3] = var15;
    }

    @ObfuscatedName("am.c(B)V")
    public void method588() {
        byte[] var1 = new byte[this.field555 * this.field555];
        boolean var2 = false;
        byte[] var3 = new byte[this.field555 * this.field555];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field555; var5++) {
            for (int var6 = 0; var6 < this.field555; var6++) {
                if (var6 <= var5 - this.field555 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field554[6][0] = var3;
        byte[] var7 = new byte[this.field555 * this.field555];
        int var8 = 0;
        for (int var9 = this.field555 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field555; var10++) {
                if (var10 <= var9 - this.field555 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field554[6][1] = var7;
        byte[] var11 = new byte[this.field555 * this.field555];
        int var12 = 0;
        for (int var13 = this.field555 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field555 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field555 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field554[6][2] = var11;
        byte[] var15 = new byte[this.field555 * this.field555];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field555; var17++) {
            for (int var18 = this.field555 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field555 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field554[6][3] = var15;
    }

    @ObfuscatedName("am.n(I)V")
    public void method586() {
        byte[] var1 = new byte[this.field555 * this.field555];
        boolean var2 = false;
        byte[] var3 = new byte[this.field555 * this.field555];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field555; var5++) {
            for (int var6 = 0; var6 < this.field555; var6++) {
                if (var6 >= var5 - this.field555 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field554[7][0] = var3;
        byte[] var7 = new byte[this.field555 * this.field555];
        int var8 = 0;
        for (int var9 = this.field555 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field555; var10++) {
                if (var10 >= var9 - this.field555 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field554[7][1] = var7;
        byte[] var11 = new byte[this.field555 * this.field555];
        int var12 = 0;
        for (int var13 = this.field555 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field555 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field555 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field554[7][2] = var11;
        byte[] var15 = new byte[this.field555 * this.field555];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field555; var17++) {
            for (int var18 = this.field555 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field555 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field554[7][3] = var15;
    }
}
