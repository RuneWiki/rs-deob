package deob;

@ObfuscatedName("ah")
public class class50 {

    @ObfuscatedName("ah.x")
    public int field383;

    @ObfuscatedName("ah.m")
    public byte[][][] field380;

    public class50(int arg0) {
        this.field383 = arg0;
    }

    @ObfuscatedName("ah.x(IIIIIIIIB)V")
    public void method685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field383 != 0 && this.field380 != null) {
            int var9 = this.method686(arg7, arg6);
            int var10 = this.method704(arg6);
            class331.method5608(arg0, arg1, arg4, arg5, arg2, arg3, this.field380[var10 - 1][var9], this.field383, true);
        }
    }

    @ObfuscatedName("ah.m(III)I")
    public int method686(int arg0, int arg1) {
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

    @ObfuscatedName("ah.k(IB)I")
    public int method704(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ah.d(B)V")
    public void method688() {
        if (this.field380 != null) {
            return;
        }
        this.field380 = new byte[8][4][];
        this.method689();
        this.method690();
        this.method691();
        this.method684();
        this.method693();
        this.method727();
        this.method695();
        this.method696();
    }

    @ObfuscatedName("ah.w(I)V")
    public void method689() {
        byte[] var1 = new byte[this.field383 * this.field383];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field383; var3++) {
            for (int var4 = 0; var4 < this.field383; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field380[0][0] = var1;
        byte[] var5 = new byte[this.field383 * this.field383];
        int var6 = 0;
        for (int var7 = this.field383 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field383; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field380[0][1] = var5;
        byte[] var9 = new byte[this.field383 * this.field383];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field383; var11++) {
            for (int var12 = 0; var12 < this.field383; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field380[0][2] = var9;
        byte[] var13 = new byte[this.field383 * this.field383];
        int var14 = 0;
        for (int var15 = this.field383 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field383; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field380[0][3] = var13;
    }

    @ObfuscatedName("ah.v(I)V")
    public void method690() {
        byte[] var1 = new byte[this.field383 * this.field383];
        int var2 = 0;
        for (int var3 = this.field383 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field383; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field380[1][0] = var1;
        byte[] var5 = new byte[this.field383 * this.field383];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field383; var7++) {
            for (int var8 = 0; var8 < this.field383; var8++) {
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
        this.field380[1][1] = var5;
        byte[] var9 = new byte[this.field383 * this.field383];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field383; var11++) {
            for (int var12 = this.field383 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field380[1][2] = var9;
        byte[] var13 = new byte[this.field383 * this.field383];
        int var14 = 0;
        for (int var15 = this.field383 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field383 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field380[1][3] = var13;
    }

    @ObfuscatedName("ah.q(I)V")
    public void method691() {
        byte[] var1 = new byte[this.field383 * this.field383];
        int var2 = 0;
        for (int var3 = this.field383 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field383 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field380[2][0] = var1;
        byte[] var5 = new byte[this.field383 * this.field383];
        int var6 = 0;
        for (int var7 = this.field383 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field383; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field380[2][1] = var5;
        byte[] var9 = new byte[this.field383 * this.field383];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field383; var11++) {
            for (int var12 = 0; var12 < this.field383; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field380[2][2] = var9;
        byte[] var13 = new byte[this.field383 * this.field383];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field383; var15++) {
            for (int var16 = this.field383 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field380[2][3] = var13;
    }

    @ObfuscatedName("ah.z(I)V")
    public void method684() {
        byte[] var1 = new byte[this.field383 * this.field383];
        int var2 = 0;
        for (int var3 = this.field383 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field383; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field380[3][0] = var1;
        byte[] var5 = new byte[this.field383 * this.field383];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field383; var7++) {
            for (int var8 = 0; var8 < this.field383; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field380[3][1] = var5;
        byte[] var9 = new byte[this.field383 * this.field383];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field383; var11++) {
            for (int var12 = this.field383 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field380[3][2] = var9;
        byte[] var13 = new byte[this.field383 * this.field383];
        int var14 = 0;
        for (int var15 = this.field383 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field383 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field380[3][3] = var13;
    }

    @ObfuscatedName("ah.t(B)V")
    public void method693() {
        byte[] var1 = new byte[this.field383 * this.field383];
        int var2 = 0;
        for (int var3 = this.field383 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field383 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field380[4][0] = var1;
        byte[] var5 = new byte[this.field383 * this.field383];
        int var6 = 0;
        for (int var7 = this.field383 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field383; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field380[4][1] = var5;
        byte[] var9 = new byte[this.field383 * this.field383];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field383; var11++) {
            for (int var12 = 0; var12 < this.field383; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field380[4][2] = var9;
        byte[] var13 = new byte[this.field383 * this.field383];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field383; var15++) {
            for (int var16 = this.field383 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field380[4][3] = var13;
    }

    @ObfuscatedName("ah.e(B)V")
    public void method727() {
        byte[] var1 = new byte[this.field383 * this.field383];
        boolean var2 = false;
        byte[] var3 = new byte[this.field383 * this.field383];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field383; var5++) {
            for (int var6 = 0; var6 < this.field383; var6++) {
                if (var6 <= this.field383 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field380[5][0] = var3;
        byte[] var7 = new byte[this.field383 * this.field383];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field383; var9++) {
            for (int var10 = 0; var10 < this.field383; var10++) {
                if (var9 <= this.field383 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field380[5][1] = var7;
        byte[] var11 = new byte[this.field383 * this.field383];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field383; var13++) {
            for (int var14 = 0; var14 < this.field383; var14++) {
                if (var14 >= this.field383 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field380[5][2] = var11;
        byte[] var15 = new byte[this.field383 * this.field383];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field383; var17++) {
            for (int var18 = 0; var18 < this.field383; var18++) {
                if (var17 >= this.field383 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field380[5][3] = var15;
    }

    @ObfuscatedName("ah.s(B)V")
    public void method695() {
        byte[] var1 = new byte[this.field383 * this.field383];
        boolean var2 = false;
        byte[] var3 = new byte[this.field383 * this.field383];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field383; var5++) {
            for (int var6 = 0; var6 < this.field383; var6++) {
                if (var6 <= var5 - this.field383 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field380[6][0] = var3;
        byte[] var7 = new byte[this.field383 * this.field383];
        int var8 = 0;
        for (int var9 = this.field383 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field383; var10++) {
                if (var10 <= var9 - this.field383 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field380[6][1] = var7;
        byte[] var11 = new byte[this.field383 * this.field383];
        int var12 = 0;
        for (int var13 = this.field383 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field383 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field383 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field380[6][2] = var11;
        byte[] var15 = new byte[this.field383 * this.field383];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field383; var17++) {
            for (int var18 = this.field383 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field383 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field380[6][3] = var15;
    }

    @ObfuscatedName("ah.p(I)V")
    public void method696() {
        byte[] var1 = new byte[this.field383 * this.field383];
        boolean var2 = false;
        byte[] var3 = new byte[this.field383 * this.field383];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field383; var5++) {
            for (int var6 = 0; var6 < this.field383; var6++) {
                if (var6 >= var5 - this.field383 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field380[7][0] = var3;
        byte[] var7 = new byte[this.field383 * this.field383];
        int var8 = 0;
        for (int var9 = this.field383 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field383; var10++) {
                if (var10 >= var9 - this.field383 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field380[7][1] = var7;
        byte[] var11 = new byte[this.field383 * this.field383];
        int var12 = 0;
        for (int var13 = this.field383 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field383 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field383 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field380[7][2] = var11;
        byte[] var15 = new byte[this.field383 * this.field383];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field383; var17++) {
            for (int var18 = this.field383 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field383 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field380[7][3] = var15;
    }
}
