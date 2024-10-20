package deob;

@ObfuscatedName("ar")
public class class50 {

    @ObfuscatedName("ar.h")
    public int field372;

    @ObfuscatedName("ar.v")
    public byte[][][] field369;

    public class50(int arg0) {
        this.field372 = arg0;
    }

    @ObfuscatedName("ar.h(IIIIIIIIB)V")
    public void method674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field372 != 0 && this.field369 != null) {
            int var9 = this.method698(arg7, arg6);
            int var10 = this.method664(arg6);
            class332.method5571(arg0, arg1, arg4, arg5, arg2, arg3, this.field369[var10 - 1][var9], this.field372, true);
        }
    }

    @ObfuscatedName("ar.v(III)I")
    public int method698(int arg0, int arg1) {
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

    @ObfuscatedName("ar.x(IB)I")
    public int method664(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ar.w(I)V")
    public void method687() {
        if (this.field369 != null) {
            return;
        }
        this.field369 = new byte[8][4][];
        this.method666();
        this.method667();
        this.method668();
        this.method685();
        this.method670();
        this.method671();
        this.method672();
        this.method673();
    }

    @ObfuscatedName("ar.t(I)V")
    public void method666() {
        byte[] var1 = new byte[this.field372 * this.field372];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field372; var3++) {
            for (int var4 = 0; var4 < this.field372; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field369[0][0] = var1;
        byte[] var5 = new byte[this.field372 * this.field372];
        int var6 = 0;
        for (int var7 = this.field372 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field372; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field369[0][1] = var5;
        byte[] var9 = new byte[this.field372 * this.field372];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field372; var11++) {
            for (int var12 = 0; var12 < this.field372; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field369[0][2] = var9;
        byte[] var13 = new byte[this.field372 * this.field372];
        int var14 = 0;
        for (int var15 = this.field372 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field372; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field369[0][3] = var13;
    }

    @ObfuscatedName("ar.j(I)V")
    public void method667() {
        byte[] var1 = new byte[this.field372 * this.field372];
        int var2 = 0;
        for (int var3 = this.field372 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field372; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field369[1][0] = var1;
        byte[] var5 = new byte[this.field372 * this.field372];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field372; var7++) {
            for (int var8 = 0; var8 < this.field372; var8++) {
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
        this.field369[1][1] = var5;
        byte[] var9 = new byte[this.field372 * this.field372];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field372; var11++) {
            for (int var12 = this.field372 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field369[1][2] = var9;
        byte[] var13 = new byte[this.field372 * this.field372];
        int var14 = 0;
        for (int var15 = this.field372 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field372 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field369[1][3] = var13;
    }

    @ObfuscatedName("ar.n(I)V")
    public void method668() {
        byte[] var1 = new byte[this.field372 * this.field372];
        int var2 = 0;
        for (int var3 = this.field372 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field372 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field369[2][0] = var1;
        byte[] var5 = new byte[this.field372 * this.field372];
        int var6 = 0;
        for (int var7 = this.field372 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field372; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field369[2][1] = var5;
        byte[] var9 = new byte[this.field372 * this.field372];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field372; var11++) {
            for (int var12 = 0; var12 < this.field372; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field369[2][2] = var9;
        byte[] var13 = new byte[this.field372 * this.field372];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field372; var15++) {
            for (int var16 = this.field372 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field369[2][3] = var13;
    }

    @ObfuscatedName("ar.p(I)V")
    public void method685() {
        byte[] var1 = new byte[this.field372 * this.field372];
        int var2 = 0;
        for (int var3 = this.field372 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field372; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field369[3][0] = var1;
        byte[] var5 = new byte[this.field372 * this.field372];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field372; var7++) {
            for (int var8 = 0; var8 < this.field372; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field369[3][1] = var5;
        byte[] var9 = new byte[this.field372 * this.field372];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field372; var11++) {
            for (int var12 = this.field372 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field369[3][2] = var9;
        byte[] var13 = new byte[this.field372 * this.field372];
        int var14 = 0;
        for (int var15 = this.field372 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field372 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field369[3][3] = var13;
    }

    @ObfuscatedName("ar.l(I)V")
    public void method670() {
        byte[] var1 = new byte[this.field372 * this.field372];
        int var2 = 0;
        for (int var3 = this.field372 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field372 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field369[4][0] = var1;
        byte[] var5 = new byte[this.field372 * this.field372];
        int var6 = 0;
        for (int var7 = this.field372 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field372; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field369[4][1] = var5;
        byte[] var9 = new byte[this.field372 * this.field372];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field372; var11++) {
            for (int var12 = 0; var12 < this.field372; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field369[4][2] = var9;
        byte[] var13 = new byte[this.field372 * this.field372];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field372; var15++) {
            for (int var16 = this.field372 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field369[4][3] = var13;
    }

    @ObfuscatedName("ar.z(I)V")
    public void method671() {
        byte[] var1 = new byte[this.field372 * this.field372];
        boolean var2 = false;
        byte[] var3 = new byte[this.field372 * this.field372];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field372; var5++) {
            for (int var6 = 0; var6 < this.field372; var6++) {
                if (var6 <= this.field372 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field369[5][0] = var3;
        byte[] var7 = new byte[this.field372 * this.field372];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field372; var9++) {
            for (int var10 = 0; var10 < this.field372; var10++) {
                if (var9 <= this.field372 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field369[5][1] = var7;
        byte[] var11 = new byte[this.field372 * this.field372];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field372; var13++) {
            for (int var14 = 0; var14 < this.field372; var14++) {
                if (var14 >= this.field372 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field369[5][2] = var11;
        byte[] var15 = new byte[this.field372 * this.field372];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field372; var17++) {
            for (int var18 = 0; var18 < this.field372; var18++) {
                if (var17 >= this.field372 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field369[5][3] = var15;
    }

    @ObfuscatedName("ar.u(I)V")
    public void method672() {
        byte[] var1 = new byte[this.field372 * this.field372];
        boolean var2 = false;
        byte[] var3 = new byte[this.field372 * this.field372];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field372; var5++) {
            for (int var6 = 0; var6 < this.field372; var6++) {
                if (var6 <= var5 - this.field372 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field369[6][0] = var3;
        byte[] var7 = new byte[this.field372 * this.field372];
        int var8 = 0;
        for (int var9 = this.field372 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field372; var10++) {
                if (var10 <= var9 - this.field372 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field369[6][1] = var7;
        byte[] var11 = new byte[this.field372 * this.field372];
        int var12 = 0;
        for (int var13 = this.field372 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field372 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field372 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field369[6][2] = var11;
        byte[] var15 = new byte[this.field372 * this.field372];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field372; var17++) {
            for (int var18 = this.field372 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field372 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field369[6][3] = var15;
    }

    @ObfuscatedName("ar.e(I)V")
    public void method673() {
        byte[] var1 = new byte[this.field372 * this.field372];
        boolean var2 = false;
        byte[] var3 = new byte[this.field372 * this.field372];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field372; var5++) {
            for (int var6 = 0; var6 < this.field372; var6++) {
                if (var6 >= var5 - this.field372 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field369[7][0] = var3;
        byte[] var7 = new byte[this.field372 * this.field372];
        int var8 = 0;
        for (int var9 = this.field372 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field372; var10++) {
                if (var10 >= var9 - this.field372 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field369[7][1] = var7;
        byte[] var11 = new byte[this.field372 * this.field372];
        int var12 = 0;
        for (int var13 = this.field372 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field372 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field372 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field369[7][2] = var11;
        byte[] var15 = new byte[this.field372 * this.field372];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field372; var17++) {
            for (int var18 = this.field372 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field372 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field369[7][3] = var15;
    }
}
