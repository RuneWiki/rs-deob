package deob;

@ObfuscatedName("ah")
public class class36 {

    @ObfuscatedName("ah.w")
    public int field302;

    @ObfuscatedName("ah.m")
    public byte[][][] field300;

    public class36(int arg0) {
        this.field302 = arg0;
    }

    @ObfuscatedName("ah.w(IIIIIIIII)V")
    public void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field302 != 0 && this.field300 != null) {
            int var9 = this.method612(arg7, arg6);
            int var10 = this.method570(arg6);
            class315.method5350(arg0, arg1, arg4, arg5, arg2, arg3, this.field300[var10 - 1][var9], this.field302, true);
        }
    }

    @ObfuscatedName("ah.m(III)I")
    public int method612(int arg0, int arg1) {
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

    @ObfuscatedName("ah.q(IS)I")
    public int method570(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ah.x(I)V")
    public void method572() {
        if (this.field300 != null) {
            return;
        }
        this.field300 = new byte[8][4][];
        this.method605();
        this.method587();
        this.method575();
        this.method576();
        this.method577();
        this.method578();
        this.method579();
        this.method580();
    }

    @ObfuscatedName("ah.j(B)V")
    public void method605() {
        byte[] var1 = new byte[this.field302 * this.field302];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field302; var3++) {
            for (int var4 = 0; var4 < this.field302; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field300[0][0] = var1;
        byte[] var5 = new byte[this.field302 * this.field302];
        int var6 = 0;
        for (int var7 = this.field302 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field302; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field300[0][1] = var5;
        byte[] var9 = new byte[this.field302 * this.field302];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field302; var11++) {
            for (int var12 = 0; var12 < this.field302; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field300[0][2] = var9;
        byte[] var13 = new byte[this.field302 * this.field302];
        int var14 = 0;
        for (int var15 = this.field302 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field302; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field300[0][3] = var13;
    }

    @ObfuscatedName("ah.a(B)V")
    public void method587() {
        byte[] var1 = new byte[this.field302 * this.field302];
        int var2 = 0;
        for (int var3 = this.field302 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field302; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field300[1][0] = var1;
        byte[] var5 = new byte[this.field302 * this.field302];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field302; var7++) {
            for (int var8 = 0; var8 < this.field302; var8++) {
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
        this.field300[1][1] = var5;
        byte[] var9 = new byte[this.field302 * this.field302];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field302; var11++) {
            for (int var12 = this.field302 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field300[1][2] = var9;
        byte[] var13 = new byte[this.field302 * this.field302];
        int var14 = 0;
        for (int var15 = this.field302 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field302 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field300[1][3] = var13;
    }

    @ObfuscatedName("ah.l(I)V")
    public void method575() {
        byte[] var1 = new byte[this.field302 * this.field302];
        int var2 = 0;
        for (int var3 = this.field302 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field302 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field300[2][0] = var1;
        byte[] var5 = new byte[this.field302 * this.field302];
        int var6 = 0;
        for (int var7 = this.field302 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field302; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field300[2][1] = var5;
        byte[] var9 = new byte[this.field302 * this.field302];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field302; var11++) {
            for (int var12 = 0; var12 < this.field302; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field300[2][2] = var9;
        byte[] var13 = new byte[this.field302 * this.field302];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field302; var15++) {
            for (int var16 = this.field302 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field300[2][3] = var13;
    }

    @ObfuscatedName("ah.d(I)V")
    public void method576() {
        byte[] var1 = new byte[this.field302 * this.field302];
        int var2 = 0;
        for (int var3 = this.field302 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field302; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field300[3][0] = var1;
        byte[] var5 = new byte[this.field302 * this.field302];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field302; var7++) {
            for (int var8 = 0; var8 < this.field302; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field300[3][1] = var5;
        byte[] var9 = new byte[this.field302 * this.field302];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field302; var11++) {
            for (int var12 = this.field302 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field300[3][2] = var9;
        byte[] var13 = new byte[this.field302 * this.field302];
        int var14 = 0;
        for (int var15 = this.field302 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field302 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field300[3][3] = var13;
    }

    @ObfuscatedName("ah.s(B)V")
    public void method577() {
        byte[] var1 = new byte[this.field302 * this.field302];
        int var2 = 0;
        for (int var3 = this.field302 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field302 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field300[4][0] = var1;
        byte[] var5 = new byte[this.field302 * this.field302];
        int var6 = 0;
        for (int var7 = this.field302 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field302; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field300[4][1] = var5;
        byte[] var9 = new byte[this.field302 * this.field302];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field302; var11++) {
            for (int var12 = 0; var12 < this.field302; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field300[4][2] = var9;
        byte[] var13 = new byte[this.field302 * this.field302];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field302; var15++) {
            for (int var16 = this.field302 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field300[4][3] = var13;
    }

    @ObfuscatedName("ah.p(I)V")
    public void method578() {
        byte[] var1 = new byte[this.field302 * this.field302];
        boolean var2 = false;
        byte[] var3 = new byte[this.field302 * this.field302];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field302; var5++) {
            for (int var6 = 0; var6 < this.field302; var6++) {
                if (var6 <= this.field302 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field300[5][0] = var3;
        byte[] var7 = new byte[this.field302 * this.field302];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field302; var9++) {
            for (int var10 = 0; var10 < this.field302; var10++) {
                if (var9 <= this.field302 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field300[5][1] = var7;
        byte[] var11 = new byte[this.field302 * this.field302];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field302; var13++) {
            for (int var14 = 0; var14 < this.field302; var14++) {
                if (var14 >= this.field302 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field300[5][2] = var11;
        byte[] var15 = new byte[this.field302 * this.field302];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field302; var17++) {
            for (int var18 = 0; var18 < this.field302; var18++) {
                if (var17 >= this.field302 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field300[5][3] = var15;
    }

    @ObfuscatedName("ah.g(I)V")
    public void method579() {
        byte[] var1 = new byte[this.field302 * this.field302];
        boolean var2 = false;
        byte[] var3 = new byte[this.field302 * this.field302];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field302; var5++) {
            for (int var6 = 0; var6 < this.field302; var6++) {
                if (var6 <= var5 - this.field302 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field300[6][0] = var3;
        byte[] var7 = new byte[this.field302 * this.field302];
        int var8 = 0;
        for (int var9 = this.field302 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field302; var10++) {
                if (var10 <= var9 - this.field302 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field300[6][1] = var7;
        byte[] var11 = new byte[this.field302 * this.field302];
        int var12 = 0;
        for (int var13 = this.field302 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field302 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field302 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field300[6][2] = var11;
        byte[] var15 = new byte[this.field302 * this.field302];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field302; var17++) {
            for (int var18 = this.field302 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field302 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field300[6][3] = var15;
    }

    @ObfuscatedName("ah.y(I)V")
    public void method580() {
        byte[] var1 = new byte[this.field302 * this.field302];
        boolean var2 = false;
        byte[] var3 = new byte[this.field302 * this.field302];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field302; var5++) {
            for (int var6 = 0; var6 < this.field302; var6++) {
                if (var6 >= var5 - this.field302 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field300[7][0] = var3;
        byte[] var7 = new byte[this.field302 * this.field302];
        int var8 = 0;
        for (int var9 = this.field302 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field302; var10++) {
                if (var10 >= var9 - this.field302 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field300[7][1] = var7;
        byte[] var11 = new byte[this.field302 * this.field302];
        int var12 = 0;
        for (int var13 = this.field302 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field302 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field302 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field300[7][2] = var11;
        byte[] var15 = new byte[this.field302 * this.field302];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field302; var17++) {
            for (int var18 = this.field302 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field302 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field300[7][3] = var15;
    }
}
