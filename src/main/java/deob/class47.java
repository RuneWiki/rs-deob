package deob;

@ObfuscatedName("af")
public class class47 {

    @ObfuscatedName("af.m")
    public int field573;

    @ObfuscatedName("af.p")
    public byte[][][] field572;

    public class47(int arg0) {
        this.field573 = arg0;
    }

    @ObfuscatedName("af.m(IIIIIIIIB)V")
    public void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field573 != 0 && this.field572 != null) {
            int var9 = this.method629(arg7, arg6);
            int var10 = this.method630(arg6);
            class291.method4795(arg0, arg1, arg4, arg5, arg2, arg3, this.field572[var10 - 1][var9], this.field573, true);
        }
    }

    @ObfuscatedName("af.p(III)I")
    public int method629(int arg0, int arg1) {
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

    @ObfuscatedName("af.i(II)I")
    public int method630(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("af.j(B)V")
    public void method646() {
        if (this.field572 != null) {
            return;
        }
        this.field572 = new byte[8][4][];
        this.method632();
        this.method633();
        this.method675();
        this.method653();
        this.method652();
        this.method637();
        this.method638();
        this.method639();
    }

    @ObfuscatedName("af.v(I)V")
    public void method632() {
        byte[] var1 = new byte[this.field573 * this.field573];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field573; var3++) {
            for (int var4 = 0; var4 < this.field573; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field572[0][0] = var1;
        byte[] var5 = new byte[this.field573 * this.field573];
        int var6 = 0;
        for (int var7 = this.field573 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field573; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field572[0][1] = var5;
        byte[] var9 = new byte[this.field573 * this.field573];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field573; var11++) {
            for (int var12 = 0; var12 < this.field573; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field572[0][2] = var9;
        byte[] var13 = new byte[this.field573 * this.field573];
        int var14 = 0;
        for (int var15 = this.field573 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field573; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field572[0][3] = var13;
    }

    @ObfuscatedName("af.x(I)V")
    public void method633() {
        byte[] var1 = new byte[this.field573 * this.field573];
        int var2 = 0;
        for (int var3 = this.field573 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field573; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field572[1][0] = var1;
        byte[] var5 = new byte[this.field573 * this.field573];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field573; var7++) {
            for (int var8 = 0; var8 < this.field573; var8++) {
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
        this.field572[1][1] = var5;
        byte[] var9 = new byte[this.field573 * this.field573];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field573; var11++) {
            for (int var12 = this.field573 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field572[1][2] = var9;
        byte[] var13 = new byte[this.field573 * this.field573];
        int var14 = 0;
        for (int var15 = this.field573 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field573 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field572[1][3] = var13;
    }

    @ObfuscatedName("af.e(I)V")
    public void method675() {
        byte[] var1 = new byte[this.field573 * this.field573];
        int var2 = 0;
        for (int var3 = this.field573 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field573 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field572[2][0] = var1;
        byte[] var5 = new byte[this.field573 * this.field573];
        int var6 = 0;
        for (int var7 = this.field573 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field573; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field572[2][1] = var5;
        byte[] var9 = new byte[this.field573 * this.field573];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field573; var11++) {
            for (int var12 = 0; var12 < this.field573; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field572[2][2] = var9;
        byte[] var13 = new byte[this.field573 * this.field573];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field573; var15++) {
            for (int var16 = this.field573 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field572[2][3] = var13;
    }

    @ObfuscatedName("af.l(B)V")
    public void method653() {
        byte[] var1 = new byte[this.field573 * this.field573];
        int var2 = 0;
        for (int var3 = this.field573 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field573; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field572[3][0] = var1;
        byte[] var5 = new byte[this.field573 * this.field573];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field573; var7++) {
            for (int var8 = 0; var8 < this.field573; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field572[3][1] = var5;
        byte[] var9 = new byte[this.field573 * this.field573];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field573; var11++) {
            for (int var12 = this.field573 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field572[3][2] = var9;
        byte[] var13 = new byte[this.field573 * this.field573];
        int var14 = 0;
        for (int var15 = this.field573 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field573 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field572[3][3] = var13;
    }

    @ObfuscatedName("af.b(I)V")
    public void method652() {
        byte[] var1 = new byte[this.field573 * this.field573];
        int var2 = 0;
        for (int var3 = this.field573 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field573 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field572[4][0] = var1;
        byte[] var5 = new byte[this.field573 * this.field573];
        int var6 = 0;
        for (int var7 = this.field573 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field573; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field572[4][1] = var5;
        byte[] var9 = new byte[this.field573 * this.field573];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field573; var11++) {
            for (int var12 = 0; var12 < this.field573; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field572[4][2] = var9;
        byte[] var13 = new byte[this.field573 * this.field573];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field573; var15++) {
            for (int var16 = this.field573 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field572[4][3] = var13;
    }

    @ObfuscatedName("af.n(B)V")
    public void method637() {
        byte[] var1 = new byte[this.field573 * this.field573];
        boolean var2 = false;
        byte[] var3 = new byte[this.field573 * this.field573];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field573; var5++) {
            for (int var6 = 0; var6 < this.field573; var6++) {
                if (var6 <= this.field573 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field572[5][0] = var3;
        byte[] var7 = new byte[this.field573 * this.field573];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field573; var9++) {
            for (int var10 = 0; var10 < this.field573; var10++) {
                if (var9 <= this.field573 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field572[5][1] = var7;
        byte[] var11 = new byte[this.field573 * this.field573];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field573; var13++) {
            for (int var14 = 0; var14 < this.field573; var14++) {
                if (var14 >= this.field573 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field572[5][2] = var11;
        byte[] var15 = new byte[this.field573 * this.field573];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field573; var17++) {
            for (int var18 = 0; var18 < this.field573; var18++) {
                if (var17 >= this.field573 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field572[5][3] = var15;
    }

    @ObfuscatedName("af.c(B)V")
    public void method638() {
        byte[] var1 = new byte[this.field573 * this.field573];
        boolean var2 = false;
        byte[] var3 = new byte[this.field573 * this.field573];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field573; var5++) {
            for (int var6 = 0; var6 < this.field573; var6++) {
                if (var6 <= var5 - this.field573 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field572[6][0] = var3;
        byte[] var7 = new byte[this.field573 * this.field573];
        int var8 = 0;
        for (int var9 = this.field573 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field573; var10++) {
                if (var10 <= var9 - this.field573 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field572[6][1] = var7;
        byte[] var11 = new byte[this.field573 * this.field573];
        int var12 = 0;
        for (int var13 = this.field573 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field573 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field573 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field572[6][2] = var11;
        byte[] var15 = new byte[this.field573 * this.field573];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field573; var17++) {
            for (int var18 = this.field573 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field573 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field572[6][3] = var15;
    }

    @ObfuscatedName("af.a(B)V")
    public void method639() {
        byte[] var1 = new byte[this.field573 * this.field573];
        boolean var2 = false;
        byte[] var3 = new byte[this.field573 * this.field573];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field573; var5++) {
            for (int var6 = 0; var6 < this.field573; var6++) {
                if (var6 >= var5 - this.field573 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field572[7][0] = var3;
        byte[] var7 = new byte[this.field573 * this.field573];
        int var8 = 0;
        for (int var9 = this.field573 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field573; var10++) {
                if (var10 >= var9 - this.field573 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field572[7][1] = var7;
        byte[] var11 = new byte[this.field573 * this.field573];
        int var12 = 0;
        for (int var13 = this.field573 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field573 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field573 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field572[7][2] = var11;
        byte[] var15 = new byte[this.field573 * this.field573];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field573; var17++) {
            for (int var18 = this.field573 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field573 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field572[7][3] = var15;
    }
}
