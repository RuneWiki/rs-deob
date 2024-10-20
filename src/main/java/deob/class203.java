package deob;

@ObfuscatedName("ge")
public class class203 {

    @ObfuscatedName("ge.i")
    public int field2227;

    @ObfuscatedName("ge.w")
    public byte[][][] field2225;

    public class203(int arg0) {
        this.field2227 = arg0;
    }

    @ObfuscatedName("ge.i(IIIIIIIII)V")
    public void method3634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field2227 != 0 && this.field2225 != null) {
            int var9 = this.method3632(arg7, arg6);
            int var10 = this.method3613(arg6);
            class410.method6529(arg0, arg1, arg4, arg5, arg2, arg3, this.field2225[var10 - 1][var9], this.field2227, true);
        }
    }

    @ObfuscatedName("ge.w(IIB)I")
    public int method3632(int arg0, int arg1) {
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

    @ObfuscatedName("ge.s(II)I")
    public int method3613(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ge.a(I)V")
    public void method3647() {
        if (this.field2225 != null) {
            return;
        }
        this.field2225 = new byte[8][4][];
        this.method3612();
        this.method3611();
        this.method3614();
        this.method3615();
        this.method3616();
        this.method3617();
        this.method3618();
        this.method3619();
    }

    @ObfuscatedName("ge.o(S)V")
    public void method3612() {
        byte[] var1 = new byte[this.field2227 * this.field2227];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2227; var3++) {
            for (int var4 = 0; var4 < this.field2227; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2225[0][0] = var1;
        byte[] var5 = new byte[this.field2227 * this.field2227];
        int var6 = 0;
        for (int var7 = this.field2227 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2227; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2225[0][1] = var5;
        byte[] var9 = new byte[this.field2227 * this.field2227];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2227; var11++) {
            for (int var12 = 0; var12 < this.field2227; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2225[0][2] = var9;
        byte[] var13 = new byte[this.field2227 * this.field2227];
        int var14 = 0;
        for (int var15 = this.field2227 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field2227; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2225[0][3] = var13;
    }

    @ObfuscatedName("ge.g(I)V")
    public void method3611() {
        byte[] var1 = new byte[this.field2227 * this.field2227];
        int var2 = 0;
        for (int var3 = this.field2227 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2227; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2225[1][0] = var1;
        byte[] var5 = new byte[this.field2227 * this.field2227];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2227; var7++) {
            for (int var8 = 0; var8 < this.field2227; var8++) {
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
        this.field2225[1][1] = var5;
        byte[] var9 = new byte[this.field2227 * this.field2227];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2227; var11++) {
            for (int var12 = this.field2227 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2225[1][2] = var9;
        byte[] var13 = new byte[this.field2227 * this.field2227];
        int var14 = 0;
        for (int var15 = this.field2227 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field2227 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2225[1][3] = var13;
    }

    @ObfuscatedName("ge.e(I)V")
    public void method3614() {
        byte[] var1 = new byte[this.field2227 * this.field2227];
        int var2 = 0;
        for (int var3 = this.field2227 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field2227 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2225[2][0] = var1;
        byte[] var5 = new byte[this.field2227 * this.field2227];
        int var6 = 0;
        for (int var7 = this.field2227 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2227; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2225[2][1] = var5;
        byte[] var9 = new byte[this.field2227 * this.field2227];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2227; var11++) {
            for (int var12 = 0; var12 < this.field2227; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2225[2][2] = var9;
        byte[] var13 = new byte[this.field2227 * this.field2227];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field2227; var15++) {
            for (int var16 = this.field2227 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2225[2][3] = var13;
    }

    @ObfuscatedName("ge.p(B)V")
    public void method3615() {
        byte[] var1 = new byte[this.field2227 * this.field2227];
        int var2 = 0;
        for (int var3 = this.field2227 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2227; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2225[3][0] = var1;
        byte[] var5 = new byte[this.field2227 * this.field2227];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2227; var7++) {
            for (int var8 = 0; var8 < this.field2227; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2225[3][1] = var5;
        byte[] var9 = new byte[this.field2227 * this.field2227];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2227; var11++) {
            for (int var12 = this.field2227 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2225[3][2] = var9;
        byte[] var13 = new byte[this.field2227 * this.field2227];
        int var14 = 0;
        for (int var15 = this.field2227 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field2227 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2225[3][3] = var13;
    }

    @ObfuscatedName("ge.j(I)V")
    public void method3616() {
        byte[] var1 = new byte[this.field2227 * this.field2227];
        int var2 = 0;
        for (int var3 = this.field2227 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field2227 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2225[4][0] = var1;
        byte[] var5 = new byte[this.field2227 * this.field2227];
        int var6 = 0;
        for (int var7 = this.field2227 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2227; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2225[4][1] = var5;
        byte[] var9 = new byte[this.field2227 * this.field2227];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2227; var11++) {
            for (int var12 = 0; var12 < this.field2227; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2225[4][2] = var9;
        byte[] var13 = new byte[this.field2227 * this.field2227];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field2227; var15++) {
            for (int var16 = this.field2227 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2225[4][3] = var13;
    }

    @ObfuscatedName("ge.b(I)V")
    public void method3617() {
        byte[] var1 = new byte[this.field2227 * this.field2227];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2227 * this.field2227];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2227; var5++) {
            for (int var6 = 0; var6 < this.field2227; var6++) {
                if (var6 <= this.field2227 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2225[5][0] = var3;
        byte[] var7 = new byte[this.field2227 * this.field2227];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2227; var9++) {
            for (int var10 = 0; var10 < this.field2227; var10++) {
                if (var9 <= this.field2227 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2225[5][1] = var7;
        byte[] var11 = new byte[this.field2227 * this.field2227];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field2227; var13++) {
            for (int var14 = 0; var14 < this.field2227; var14++) {
                if (var14 >= this.field2227 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2225[5][2] = var11;
        byte[] var15 = new byte[this.field2227 * this.field2227];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2227; var17++) {
            for (int var18 = 0; var18 < this.field2227; var18++) {
                if (var17 >= this.field2227 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2225[5][3] = var15;
    }

    @ObfuscatedName("ge.x(B)V")
    public void method3618() {
        byte[] var1 = new byte[this.field2227 * this.field2227];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2227 * this.field2227];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2227; var5++) {
            for (int var6 = 0; var6 < this.field2227; var6++) {
                if (var6 <= var5 - this.field2227 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2225[6][0] = var3;
        byte[] var7 = new byte[this.field2227 * this.field2227];
        int var8 = 0;
        for (int var9 = this.field2227 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field2227; var10++) {
                if (var10 <= var9 - this.field2227 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2225[6][1] = var7;
        byte[] var11 = new byte[this.field2227 * this.field2227];
        int var12 = 0;
        for (int var13 = this.field2227 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field2227 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field2227 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2225[6][2] = var11;
        byte[] var15 = new byte[this.field2227 * this.field2227];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2227; var17++) {
            for (int var18 = this.field2227 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field2227 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2225[6][3] = var15;
    }

    @ObfuscatedName("ge.y(I)V")
    public void method3619() {
        byte[] var1 = new byte[this.field2227 * this.field2227];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2227 * this.field2227];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2227; var5++) {
            for (int var6 = 0; var6 < this.field2227; var6++) {
                if (var6 >= var5 - this.field2227 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2225[7][0] = var3;
        byte[] var7 = new byte[this.field2227 * this.field2227];
        int var8 = 0;
        for (int var9 = this.field2227 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field2227; var10++) {
                if (var10 >= var9 - this.field2227 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2225[7][1] = var7;
        byte[] var11 = new byte[this.field2227 * this.field2227];
        int var12 = 0;
        for (int var13 = this.field2227 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field2227 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field2227 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2225[7][2] = var11;
        byte[] var15 = new byte[this.field2227 * this.field2227];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2227; var17++) {
            for (int var18 = this.field2227 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field2227 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2225[7][3] = var15;
    }
}
