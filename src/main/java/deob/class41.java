package deob;

@ObfuscatedName("ae")
public class class41 {

    @ObfuscatedName("ae.a")
    public int field341;

    @ObfuscatedName("ae.t")
    public byte[][][] field343;

    public class41(int arg0) {
        this.field341 = arg0;
    }

    @ObfuscatedName("ae.a(IIIIIIIII)V")
    public void method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field341 != 0 && this.field343 != null) {
            int var9 = this.method651(arg7, arg6);
            int var10 = this.method690(arg6);
            class321.method5575(arg0, arg1, arg4, arg5, arg2, arg3, this.field343[var10 - 1][var9], this.field341, true);
        }
    }

    @ObfuscatedName("ae.t(III)I")
    public int method651(int arg0, int arg1) {
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

    @ObfuscatedName("ae.n(II)I")
    public int method690(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ae.q(I)V")
    public void method683() {
        if (this.field343 != null) {
            return;
        }
        this.field343 = new byte[8][4][];
        this.method654();
        this.method656();
        this.method655();
        this.method663();
        this.method653();
        this.method658();
        this.method659();
        this.method660();
    }

    @ObfuscatedName("ae.v(I)V")
    public void method654() {
        byte[] var1 = new byte[this.field341 * this.field341];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field341; var3++) {
            for (int var4 = 0; var4 < this.field341; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field343[0][0] = var1;
        byte[] var5 = new byte[this.field341 * this.field341];
        int var6 = 0;
        for (int var7 = this.field341 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field341; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field343[0][1] = var5;
        byte[] var9 = new byte[this.field341 * this.field341];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field341; var11++) {
            for (int var12 = 0; var12 < this.field341; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field343[0][2] = var9;
        byte[] var13 = new byte[this.field341 * this.field341];
        int var14 = 0;
        for (int var15 = this.field341 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field341; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field343[0][3] = var13;
    }

    @ObfuscatedName("ae.l(I)V")
    public void method656() {
        byte[] var1 = new byte[this.field341 * this.field341];
        int var2 = 0;
        for (int var3 = this.field341 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field341; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field343[1][0] = var1;
        byte[] var5 = new byte[this.field341 * this.field341];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field341; var7++) {
            for (int var8 = 0; var8 < this.field341; var8++) {
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
        this.field343[1][1] = var5;
        byte[] var9 = new byte[this.field341 * this.field341];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field341; var11++) {
            for (int var12 = this.field341 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field343[1][2] = var9;
        byte[] var13 = new byte[this.field341 * this.field341];
        int var14 = 0;
        for (int var15 = this.field341 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field341 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field343[1][3] = var13;
    }

    @ObfuscatedName("ae.c(I)V")
    public void method655() {
        byte[] var1 = new byte[this.field341 * this.field341];
        int var2 = 0;
        for (int var3 = this.field341 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field341 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field343[2][0] = var1;
        byte[] var5 = new byte[this.field341 * this.field341];
        int var6 = 0;
        for (int var7 = this.field341 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field341; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field343[2][1] = var5;
        byte[] var9 = new byte[this.field341 * this.field341];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field341; var11++) {
            for (int var12 = 0; var12 < this.field341; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field343[2][2] = var9;
        byte[] var13 = new byte[this.field341 * this.field341];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field341; var15++) {
            for (int var16 = this.field341 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field343[2][3] = var13;
    }

    @ObfuscatedName("ae.o(I)V")
    public void method663() {
        byte[] var1 = new byte[this.field341 * this.field341];
        int var2 = 0;
        for (int var3 = this.field341 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field341; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field343[3][0] = var1;
        byte[] var5 = new byte[this.field341 * this.field341];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field341; var7++) {
            for (int var8 = 0; var8 < this.field341; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field343[3][1] = var5;
        byte[] var9 = new byte[this.field341 * this.field341];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field341; var11++) {
            for (int var12 = this.field341 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field343[3][2] = var9;
        byte[] var13 = new byte[this.field341 * this.field341];
        int var14 = 0;
        for (int var15 = this.field341 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field341 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field343[3][3] = var13;
    }

    @ObfuscatedName("ae.i(B)V")
    public void method653() {
        byte[] var1 = new byte[this.field341 * this.field341];
        int var2 = 0;
        for (int var3 = this.field341 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field341 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field343[4][0] = var1;
        byte[] var5 = new byte[this.field341 * this.field341];
        int var6 = 0;
        for (int var7 = this.field341 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field341; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field343[4][1] = var5;
        byte[] var9 = new byte[this.field341 * this.field341];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field341; var11++) {
            for (int var12 = 0; var12 < this.field341; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field343[4][2] = var9;
        byte[] var13 = new byte[this.field341 * this.field341];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field341; var15++) {
            for (int var16 = this.field341 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field343[4][3] = var13;
    }

    @ObfuscatedName("ae.d(I)V")
    public void method658() {
        byte[] var1 = new byte[this.field341 * this.field341];
        boolean var2 = false;
        byte[] var3 = new byte[this.field341 * this.field341];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field341; var5++) {
            for (int var6 = 0; var6 < this.field341; var6++) {
                if (var6 <= this.field341 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field343[5][0] = var3;
        byte[] var7 = new byte[this.field341 * this.field341];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field341; var9++) {
            for (int var10 = 0; var10 < this.field341; var10++) {
                if (var9 <= this.field341 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field343[5][1] = var7;
        byte[] var11 = new byte[this.field341 * this.field341];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field341; var13++) {
            for (int var14 = 0; var14 < this.field341; var14++) {
                if (var14 >= this.field341 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field343[5][2] = var11;
        byte[] var15 = new byte[this.field341 * this.field341];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field341; var17++) {
            for (int var18 = 0; var18 < this.field341; var18++) {
                if (var17 >= this.field341 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field343[5][3] = var15;
    }

    @ObfuscatedName("ae.m(I)V")
    public void method659() {
        byte[] var1 = new byte[this.field341 * this.field341];
        boolean var2 = false;
        byte[] var3 = new byte[this.field341 * this.field341];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field341; var5++) {
            for (int var6 = 0; var6 < this.field341; var6++) {
                if (var6 <= var5 - this.field341 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field343[6][0] = var3;
        byte[] var7 = new byte[this.field341 * this.field341];
        int var8 = 0;
        for (int var9 = this.field341 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field341; var10++) {
                if (var10 <= var9 - this.field341 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field343[6][1] = var7;
        byte[] var11 = new byte[this.field341 * this.field341];
        int var12 = 0;
        for (int var13 = this.field341 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field341 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field341 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field343[6][2] = var11;
        byte[] var15 = new byte[this.field341 * this.field341];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field341; var17++) {
            for (int var18 = this.field341 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field341 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field343[6][3] = var15;
    }

    @ObfuscatedName("ae.p(I)V")
    public void method660() {
        byte[] var1 = new byte[this.field341 * this.field341];
        boolean var2 = false;
        byte[] var3 = new byte[this.field341 * this.field341];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field341; var5++) {
            for (int var6 = 0; var6 < this.field341; var6++) {
                if (var6 >= var5 - this.field341 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field343[7][0] = var3;
        byte[] var7 = new byte[this.field341 * this.field341];
        int var8 = 0;
        for (int var9 = this.field341 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field341; var10++) {
                if (var10 >= var9 - this.field341 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field343[7][1] = var7;
        byte[] var11 = new byte[this.field341 * this.field341];
        int var12 = 0;
        for (int var13 = this.field341 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field341 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field341 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field343[7][2] = var11;
        byte[] var15 = new byte[this.field341 * this.field341];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field341; var17++) {
            for (int var18 = this.field341 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field341 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field343[7][3] = var15;
    }
}
