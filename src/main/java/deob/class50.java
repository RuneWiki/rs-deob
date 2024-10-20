package deob;

@ObfuscatedName("ay")
public class class50 {

    @ObfuscatedName("ay.m")
    public int field369;

    @ObfuscatedName("ay.o")
    public byte[][][] field366;

    public class50(int arg0) {
        this.field369 = arg0;
    }

    @ObfuscatedName("ay.m(IIIIIIIII)V")
    public void method654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field369 != 0 && this.field366 != null) {
            int var9 = this.method650(arg7, arg6);
            int var10 = this.method651(arg6);
            class331.method5704(arg0, arg1, arg4, arg5, arg2, arg3, this.field366[var10 - 1][var9], this.field369, true);
        }
    }

    @ObfuscatedName("ay.o(III)I")
    public int method650(int arg0, int arg1) {
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

    @ObfuscatedName("ay.q(II)I")
    public int method651(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ay.j(I)V")
    public void method652() {
        if (this.field366 != null) {
            return;
        }
        this.field366 = new byte[8][4][];
        this.method667();
        this.method663();
        this.method655();
        this.method656();
        this.method657();
        this.method658();
        this.method659();
        this.method690();
    }

    @ObfuscatedName("ay.p(I)V")
    public void method667() {
        byte[] var1 = new byte[this.field369 * this.field369];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field369; var3++) {
            for (int var4 = 0; var4 < this.field369; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field366[0][0] = var1;
        byte[] var5 = new byte[this.field369 * this.field369];
        int var6 = 0;
        for (int var7 = this.field369 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field369; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field366[0][1] = var5;
        byte[] var9 = new byte[this.field369 * this.field369];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field369; var11++) {
            for (int var12 = 0; var12 < this.field369; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field366[0][2] = var9;
        byte[] var13 = new byte[this.field369 * this.field369];
        int var14 = 0;
        for (int var15 = this.field369 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field369; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field366[0][3] = var13;
    }

    @ObfuscatedName("ay.g(B)V")
    public void method663() {
        byte[] var1 = new byte[this.field369 * this.field369];
        int var2 = 0;
        for (int var3 = this.field369 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field369; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field366[1][0] = var1;
        byte[] var5 = new byte[this.field369 * this.field369];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field369; var7++) {
            for (int var8 = 0; var8 < this.field369; var8++) {
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
        this.field366[1][1] = var5;
        byte[] var9 = new byte[this.field369 * this.field369];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field369; var11++) {
            for (int var12 = this.field369 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field366[1][2] = var9;
        byte[] var13 = new byte[this.field369 * this.field369];
        int var14 = 0;
        for (int var15 = this.field369 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field369 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field366[1][3] = var13;
    }

    @ObfuscatedName("ay.n(I)V")
    public void method655() {
        byte[] var1 = new byte[this.field369 * this.field369];
        int var2 = 0;
        for (int var3 = this.field369 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field369 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field366[2][0] = var1;
        byte[] var5 = new byte[this.field369 * this.field369];
        int var6 = 0;
        for (int var7 = this.field369 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field369; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field366[2][1] = var5;
        byte[] var9 = new byte[this.field369 * this.field369];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field369; var11++) {
            for (int var12 = 0; var12 < this.field369; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field366[2][2] = var9;
        byte[] var13 = new byte[this.field369 * this.field369];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field369; var15++) {
            for (int var16 = this.field369 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field366[2][3] = var13;
    }

    @ObfuscatedName("ay.u(I)V")
    public void method656() {
        byte[] var1 = new byte[this.field369 * this.field369];
        int var2 = 0;
        for (int var3 = this.field369 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field369; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field366[3][0] = var1;
        byte[] var5 = new byte[this.field369 * this.field369];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field369; var7++) {
            for (int var8 = 0; var8 < this.field369; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field366[3][1] = var5;
        byte[] var9 = new byte[this.field369 * this.field369];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field369; var11++) {
            for (int var12 = this.field369 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field366[3][2] = var9;
        byte[] var13 = new byte[this.field369 * this.field369];
        int var14 = 0;
        for (int var15 = this.field369 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field369 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field366[3][3] = var13;
    }

    @ObfuscatedName("ay.a(I)V")
    public void method657() {
        byte[] var1 = new byte[this.field369 * this.field369];
        int var2 = 0;
        for (int var3 = this.field369 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field369 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field366[4][0] = var1;
        byte[] var5 = new byte[this.field369 * this.field369];
        int var6 = 0;
        for (int var7 = this.field369 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field369; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field366[4][1] = var5;
        byte[] var9 = new byte[this.field369 * this.field369];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field369; var11++) {
            for (int var12 = 0; var12 < this.field369; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field366[4][2] = var9;
        byte[] var13 = new byte[this.field369 * this.field369];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field369; var15++) {
            for (int var16 = this.field369 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field366[4][3] = var13;
    }

    @ObfuscatedName("ay.z(B)V")
    public void method658() {
        byte[] var1 = new byte[this.field369 * this.field369];
        boolean var2 = false;
        byte[] var3 = new byte[this.field369 * this.field369];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field369; var5++) {
            for (int var6 = 0; var6 < this.field369; var6++) {
                if (var6 <= this.field369 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field366[5][0] = var3;
        byte[] var7 = new byte[this.field369 * this.field369];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field369; var9++) {
            for (int var10 = 0; var10 < this.field369; var10++) {
                if (var9 <= this.field369 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field366[5][1] = var7;
        byte[] var11 = new byte[this.field369 * this.field369];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field369; var13++) {
            for (int var14 = 0; var14 < this.field369; var14++) {
                if (var14 >= this.field369 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field366[5][2] = var11;
        byte[] var15 = new byte[this.field369 * this.field369];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field369; var17++) {
            for (int var18 = 0; var18 < this.field369; var18++) {
                if (var17 >= this.field369 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field366[5][3] = var15;
    }

    @ObfuscatedName("ay.w(I)V")
    public void method659() {
        byte[] var1 = new byte[this.field369 * this.field369];
        boolean var2 = false;
        byte[] var3 = new byte[this.field369 * this.field369];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field369; var5++) {
            for (int var6 = 0; var6 < this.field369; var6++) {
                if (var6 <= var5 - this.field369 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field366[6][0] = var3;
        byte[] var7 = new byte[this.field369 * this.field369];
        int var8 = 0;
        for (int var9 = this.field369 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field369; var10++) {
                if (var10 <= var9 - this.field369 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field366[6][1] = var7;
        byte[] var11 = new byte[this.field369 * this.field369];
        int var12 = 0;
        for (int var13 = this.field369 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field369 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field369 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field366[6][2] = var11;
        byte[] var15 = new byte[this.field369 * this.field369];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field369; var17++) {
            for (int var18 = this.field369 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field369 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field366[6][3] = var15;
    }

    @ObfuscatedName("ay.y(I)V")
    public void method690() {
        byte[] var1 = new byte[this.field369 * this.field369];
        boolean var2 = false;
        byte[] var3 = new byte[this.field369 * this.field369];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field369; var5++) {
            for (int var6 = 0; var6 < this.field369; var6++) {
                if (var6 >= var5 - this.field369 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field366[7][0] = var3;
        byte[] var7 = new byte[this.field369 * this.field369];
        int var8 = 0;
        for (int var9 = this.field369 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field369; var10++) {
                if (var10 >= var9 - this.field369 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field366[7][1] = var7;
        byte[] var11 = new byte[this.field369 * this.field369];
        int var12 = 0;
        for (int var13 = this.field369 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field369 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field369 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field366[7][2] = var11;
        byte[] var15 = new byte[this.field369 * this.field369];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field369; var17++) {
            for (int var18 = this.field369 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field369 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field366[7][3] = var15;
    }
}
