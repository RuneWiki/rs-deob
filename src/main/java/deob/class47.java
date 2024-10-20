package deob;

@ObfuscatedName("ap")
public class class47 {

    @ObfuscatedName("ap.e")
    public int field594;

    @ObfuscatedName("ap.n")
    public byte[][][] field589;

    public class47(int arg0) {
        this.field594 = arg0;
    }

    @ObfuscatedName("ap.e(IIIIIIIIB)V")
    public void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field594 != 0 && this.field589 != null) {
            int var9 = this.method624(arg7, arg6);
            int var10 = this.method588(arg6);
            class283.method4655(arg0, arg1, arg4, arg5, arg2, arg3, this.field589[var10 - 1][var9], this.field594, true);
        }
    }

    @ObfuscatedName("ap.n(IIB)I")
    public int method624(int arg0, int arg1) {
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

    @ObfuscatedName("ap.g(II)I")
    public int method588(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ap.y(I)V")
    public void method589() {
        if (this.field589 != null) {
            return;
        }
        this.field589 = new byte[8][4][];
        this.method617();
        this.method591();
        this.method606();
        this.method593();
        this.method594();
        this.method595();
        this.method596();
        this.method597();
    }

    @ObfuscatedName("ap.w(B)V")
    public void method617() {
        byte[] var1 = new byte[this.field594 * this.field594];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field594; var3++) {
            for (int var4 = 0; var4 < this.field594; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field589[0][0] = var1;
        byte[] var5 = new byte[this.field594 * this.field594];
        int var6 = 0;
        for (int var7 = this.field594 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field594; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field589[0][1] = var5;
        byte[] var9 = new byte[this.field594 * this.field594];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field594; var11++) {
            for (int var12 = 0; var12 < this.field594; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field589[0][2] = var9;
        byte[] var13 = new byte[this.field594 * this.field594];
        int var14 = 0;
        for (int var15 = this.field594 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field594; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field589[0][3] = var13;
    }

    @ObfuscatedName("ap.k(I)V")
    public void method591() {
        byte[] var1 = new byte[this.field594 * this.field594];
        int var2 = 0;
        for (int var3 = this.field594 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field594; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field589[1][0] = var1;
        byte[] var5 = new byte[this.field594 * this.field594];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field594; var7++) {
            for (int var8 = 0; var8 < this.field594; var8++) {
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
        this.field589[1][1] = var5;
        byte[] var9 = new byte[this.field594 * this.field594];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field594; var11++) {
            for (int var12 = this.field594 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field589[1][2] = var9;
        byte[] var13 = new byte[this.field594 * this.field594];
        int var14 = 0;
        for (int var15 = this.field594 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field594 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field589[1][3] = var13;
    }

    @ObfuscatedName("ap.v(I)V")
    public void method606() {
        byte[] var1 = new byte[this.field594 * this.field594];
        int var2 = 0;
        for (int var3 = this.field594 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field594 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field589[2][0] = var1;
        byte[] var5 = new byte[this.field594 * this.field594];
        int var6 = 0;
        for (int var7 = this.field594 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field594; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field589[2][1] = var5;
        byte[] var9 = new byte[this.field594 * this.field594];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field594; var11++) {
            for (int var12 = 0; var12 < this.field594; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field589[2][2] = var9;
        byte[] var13 = new byte[this.field594 * this.field594];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field594; var15++) {
            for (int var16 = this.field594 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field589[2][3] = var13;
    }

    @ObfuscatedName("ap.z(B)V")
    public void method593() {
        byte[] var1 = new byte[this.field594 * this.field594];
        int var2 = 0;
        for (int var3 = this.field594 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field594; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field589[3][0] = var1;
        byte[] var5 = new byte[this.field594 * this.field594];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field594; var7++) {
            for (int var8 = 0; var8 < this.field594; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field589[3][1] = var5;
        byte[] var9 = new byte[this.field594 * this.field594];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field594; var11++) {
            for (int var12 = this.field594 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field589[3][2] = var9;
        byte[] var13 = new byte[this.field594 * this.field594];
        int var14 = 0;
        for (int var15 = this.field594 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field594 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field589[3][3] = var13;
    }

    @ObfuscatedName("ap.r(S)V")
    public void method594() {
        byte[] var1 = new byte[this.field594 * this.field594];
        int var2 = 0;
        for (int var3 = this.field594 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field594 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field589[4][0] = var1;
        byte[] var5 = new byte[this.field594 * this.field594];
        int var6 = 0;
        for (int var7 = this.field594 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field594; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field589[4][1] = var5;
        byte[] var9 = new byte[this.field594 * this.field594];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field594; var11++) {
            for (int var12 = 0; var12 < this.field594; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field589[4][2] = var9;
        byte[] var13 = new byte[this.field594 * this.field594];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field594; var15++) {
            for (int var16 = this.field594 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field589[4][3] = var13;
    }

    @ObfuscatedName("ap.u(I)V")
    public void method595() {
        byte[] var1 = new byte[this.field594 * this.field594];
        boolean var2 = false;
        byte[] var3 = new byte[this.field594 * this.field594];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field594; var5++) {
            for (int var6 = 0; var6 < this.field594; var6++) {
                if (var6 <= this.field594 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field589[5][0] = var3;
        byte[] var7 = new byte[this.field594 * this.field594];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field594; var9++) {
            for (int var10 = 0; var10 < this.field594; var10++) {
                if (var9 <= this.field594 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field589[5][1] = var7;
        byte[] var11 = new byte[this.field594 * this.field594];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field594; var13++) {
            for (int var14 = 0; var14 < this.field594; var14++) {
                if (var14 >= this.field594 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field589[5][2] = var11;
        byte[] var15 = new byte[this.field594 * this.field594];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field594; var17++) {
            for (int var18 = 0; var18 < this.field594; var18++) {
                if (var17 >= this.field594 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field589[5][3] = var15;
    }

    @ObfuscatedName("ap.d(I)V")
    public void method596() {
        byte[] var1 = new byte[this.field594 * this.field594];
        boolean var2 = false;
        byte[] var3 = new byte[this.field594 * this.field594];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field594; var5++) {
            for (int var6 = 0; var6 < this.field594; var6++) {
                if (var6 <= var5 - this.field594 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field589[6][0] = var3;
        byte[] var7 = new byte[this.field594 * this.field594];
        int var8 = 0;
        for (int var9 = this.field594 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field594; var10++) {
                if (var10 <= var9 - this.field594 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field589[6][1] = var7;
        byte[] var11 = new byte[this.field594 * this.field594];
        int var12 = 0;
        for (int var13 = this.field594 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field594 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field594 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field589[6][2] = var11;
        byte[] var15 = new byte[this.field594 * this.field594];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field594; var17++) {
            for (int var18 = this.field594 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field594 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field589[6][3] = var15;
    }

    @ObfuscatedName("ap.o(B)V")
    public void method597() {
        byte[] var1 = new byte[this.field594 * this.field594];
        boolean var2 = false;
        byte[] var3 = new byte[this.field594 * this.field594];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field594; var5++) {
            for (int var6 = 0; var6 < this.field594; var6++) {
                if (var6 >= var5 - this.field594 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field589[7][0] = var3;
        byte[] var7 = new byte[this.field594 * this.field594];
        int var8 = 0;
        for (int var9 = this.field594 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field594; var10++) {
                if (var10 >= var9 - this.field594 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field589[7][1] = var7;
        byte[] var11 = new byte[this.field594 * this.field594];
        int var12 = 0;
        for (int var13 = this.field594 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field594 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field594 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field589[7][2] = var11;
        byte[] var15 = new byte[this.field594 * this.field594];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field594; var17++) {
            for (int var18 = this.field594 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field594 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field589[7][3] = var15;
    }
}
