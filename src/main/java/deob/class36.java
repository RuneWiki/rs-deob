package deob;

@ObfuscatedName("aj")
public class class36 {

    @ObfuscatedName("aj.v")
    public int field324;

    @ObfuscatedName("aj.s")
    public byte[][][] field318;

    public class36(int arg0) {
        this.field324 = arg0;
    }

    @ObfuscatedName("aj.v(IIIIIIIII)V")
    public void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field324 != 0 && this.field318 != null) {
            int var9 = this.method603(arg7, arg6);
            int var10 = this.method579(arg6);
            class318.method5392(arg0, arg1, arg4, arg5, arg2, arg3, this.field318[var10 - 1][var9], this.field324, true);
        }
    }

    @ObfuscatedName("aj.s(III)I")
    public int method603(int arg0, int arg1) {
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

    @ObfuscatedName("aj.o(II)I")
    public int method579(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("aj.k(I)V")
    public void method580() {
        if (this.field318 != null) {
            return;
        }
        this.field318 = new byte[8][4][];
        this.method581();
        this.method582();
        this.method598();
        this.method584();
        this.method585();
        this.method586();
        this.method587();
        this.method577();
    }

    @ObfuscatedName("aj.u(B)V")
    public void method581() {
        byte[] var1 = new byte[this.field324 * this.field324];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field324; var3++) {
            for (int var4 = 0; var4 < this.field324; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field318[0][0] = var1;
        byte[] var5 = new byte[this.field324 * this.field324];
        int var6 = 0;
        for (int var7 = this.field324 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field324; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field318[0][1] = var5;
        byte[] var9 = new byte[this.field324 * this.field324];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field324; var11++) {
            for (int var12 = 0; var12 < this.field324; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field318[0][2] = var9;
        byte[] var13 = new byte[this.field324 * this.field324];
        int var14 = 0;
        for (int var15 = this.field324 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field324; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field318[0][3] = var13;
    }

    @ObfuscatedName("aj.i(I)V")
    public void method582() {
        byte[] var1 = new byte[this.field324 * this.field324];
        int var2 = 0;
        for (int var3 = this.field324 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field324; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field318[1][0] = var1;
        byte[] var5 = new byte[this.field324 * this.field324];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field324; var7++) {
            for (int var8 = 0; var8 < this.field324; var8++) {
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
        this.field318[1][1] = var5;
        byte[] var9 = new byte[this.field324 * this.field324];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field324; var11++) {
            for (int var12 = this.field324 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field318[1][2] = var9;
        byte[] var13 = new byte[this.field324 * this.field324];
        int var14 = 0;
        for (int var15 = this.field324 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field324 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field318[1][3] = var13;
    }

    @ObfuscatedName("aj.t(I)V")
    public void method598() {
        byte[] var1 = new byte[this.field324 * this.field324];
        int var2 = 0;
        for (int var3 = this.field324 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field324 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field318[2][0] = var1;
        byte[] var5 = new byte[this.field324 * this.field324];
        int var6 = 0;
        for (int var7 = this.field324 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field324; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field318[2][1] = var5;
        byte[] var9 = new byte[this.field324 * this.field324];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field324; var11++) {
            for (int var12 = 0; var12 < this.field324; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field318[2][2] = var9;
        byte[] var13 = new byte[this.field324 * this.field324];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field324; var15++) {
            for (int var16 = this.field324 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field318[2][3] = var13;
    }

    @ObfuscatedName("aj.c(I)V")
    public void method584() {
        byte[] var1 = new byte[this.field324 * this.field324];
        int var2 = 0;
        for (int var3 = this.field324 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field324; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field318[3][0] = var1;
        byte[] var5 = new byte[this.field324 * this.field324];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field324; var7++) {
            for (int var8 = 0; var8 < this.field324; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field318[3][1] = var5;
        byte[] var9 = new byte[this.field324 * this.field324];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field324; var11++) {
            for (int var12 = this.field324 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field318[3][2] = var9;
        byte[] var13 = new byte[this.field324 * this.field324];
        int var14 = 0;
        for (int var15 = this.field324 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field324 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field318[3][3] = var13;
    }

    @ObfuscatedName("aj.w(I)V")
    public void method585() {
        byte[] var1 = new byte[this.field324 * this.field324];
        int var2 = 0;
        for (int var3 = this.field324 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field324 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field318[4][0] = var1;
        byte[] var5 = new byte[this.field324 * this.field324];
        int var6 = 0;
        for (int var7 = this.field324 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field324; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field318[4][1] = var5;
        byte[] var9 = new byte[this.field324 * this.field324];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field324; var11++) {
            for (int var12 = 0; var12 < this.field324; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field318[4][2] = var9;
        byte[] var13 = new byte[this.field324 * this.field324];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field324; var15++) {
            for (int var16 = this.field324 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field318[4][3] = var13;
    }

    @ObfuscatedName("aj.a(I)V")
    public void method586() {
        byte[] var1 = new byte[this.field324 * this.field324];
        boolean var2 = false;
        byte[] var3 = new byte[this.field324 * this.field324];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field324; var5++) {
            for (int var6 = 0; var6 < this.field324; var6++) {
                if (var6 <= this.field324 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field318[5][0] = var3;
        byte[] var7 = new byte[this.field324 * this.field324];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field324; var9++) {
            for (int var10 = 0; var10 < this.field324; var10++) {
                if (var9 <= this.field324 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field318[5][1] = var7;
        byte[] var11 = new byte[this.field324 * this.field324];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field324; var13++) {
            for (int var14 = 0; var14 < this.field324; var14++) {
                if (var14 >= this.field324 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field318[5][2] = var11;
        byte[] var15 = new byte[this.field324 * this.field324];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field324; var17++) {
            for (int var18 = 0; var18 < this.field324; var18++) {
                if (var17 >= this.field324 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field318[5][3] = var15;
    }

    @ObfuscatedName("aj.z(B)V")
    public void method587() {
        byte[] var1 = new byte[this.field324 * this.field324];
        boolean var2 = false;
        byte[] var3 = new byte[this.field324 * this.field324];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field324; var5++) {
            for (int var6 = 0; var6 < this.field324; var6++) {
                if (var6 <= var5 - this.field324 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field318[6][0] = var3;
        byte[] var7 = new byte[this.field324 * this.field324];
        int var8 = 0;
        for (int var9 = this.field324 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field324; var10++) {
                if (var10 <= var9 - this.field324 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field318[6][1] = var7;
        byte[] var11 = new byte[this.field324 * this.field324];
        int var12 = 0;
        for (int var13 = this.field324 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field324 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field324 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field318[6][2] = var11;
        byte[] var15 = new byte[this.field324 * this.field324];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field324; var17++) {
            for (int var18 = this.field324 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field324 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field318[6][3] = var15;
    }

    @ObfuscatedName("aj.e(I)V")
    public void method577() {
        byte[] var1 = new byte[this.field324 * this.field324];
        boolean var2 = false;
        byte[] var3 = new byte[this.field324 * this.field324];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field324; var5++) {
            for (int var6 = 0; var6 < this.field324; var6++) {
                if (var6 >= var5 - this.field324 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field318[7][0] = var3;
        byte[] var7 = new byte[this.field324 * this.field324];
        int var8 = 0;
        for (int var9 = this.field324 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field324; var10++) {
                if (var10 >= var9 - this.field324 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field318[7][1] = var7;
        byte[] var11 = new byte[this.field324 * this.field324];
        int var12 = 0;
        for (int var13 = this.field324 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field324 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field324 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field318[7][2] = var11;
        byte[] var15 = new byte[this.field324 * this.field324];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field324; var17++) {
            for (int var18 = this.field324 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field324 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field318[7][3] = var15;
    }
}
