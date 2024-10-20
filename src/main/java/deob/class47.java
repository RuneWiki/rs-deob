package deob;

@ObfuscatedName("av")
public class class47 {

    @ObfuscatedName("av.w")
    public int field625;

    @ObfuscatedName("av.o")
    public byte[][][] field616;

    public class47(int arg0) {
        this.field625 = arg0;
    }

    @ObfuscatedName("av.w(IIIIIIIIB)V")
    public void method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field625 != 0 && this.field616 != null) {
            int var9 = this.method585(arg7, arg6);
            int var10 = this.method586(arg6);
            class285.method4588(arg0, arg1, arg4, arg5, arg2, arg3, this.field616[var10 - 1][var9], this.field625, true);
        }
    }

    @ObfuscatedName("av.o(IIB)I")
    public int method585(int arg0, int arg1) {
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

    @ObfuscatedName("av.x(IB)I")
    public int method586(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("av.k(I)V")
    public void method587() {
        if (this.field616 != null) {
            return;
        }
        this.field616 = new byte[8][4][];
        this.method588();
        this.method589();
        this.method590();
        this.method584();
        this.method592();
        this.method618();
        this.method594();
        this.method616();
    }

    @ObfuscatedName("av.f(I)V")
    public void method588() {
        byte[] var1 = new byte[this.field625 * this.field625];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field625; var3++) {
            for (int var4 = 0; var4 < this.field625; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field616[0][0] = var1;
        byte[] var5 = new byte[this.field625 * this.field625];
        int var6 = 0;
        for (int var7 = this.field625 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field625; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field616[0][1] = var5;
        byte[] var9 = new byte[this.field625 * this.field625];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field625; var11++) {
            for (int var12 = 0; var12 < this.field625; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field616[0][2] = var9;
        byte[] var13 = new byte[this.field625 * this.field625];
        int var14 = 0;
        for (int var15 = this.field625 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field625; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field616[0][3] = var13;
    }

    @ObfuscatedName("av.i(I)V")
    public void method589() {
        byte[] var1 = new byte[this.field625 * this.field625];
        int var2 = 0;
        for (int var3 = this.field625 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field625; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field616[1][0] = var1;
        byte[] var5 = new byte[this.field625 * this.field625];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field625; var7++) {
            for (int var8 = 0; var8 < this.field625; var8++) {
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
        this.field616[1][1] = var5;
        byte[] var9 = new byte[this.field625 * this.field625];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field625; var11++) {
            for (int var12 = this.field625 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field616[1][2] = var9;
        byte[] var13 = new byte[this.field625 * this.field625];
        int var14 = 0;
        for (int var15 = this.field625 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field625 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field616[1][3] = var13;
    }

    @ObfuscatedName("av.j(I)V")
    public void method590() {
        byte[] var1 = new byte[this.field625 * this.field625];
        int var2 = 0;
        for (int var3 = this.field625 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field625 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field616[2][0] = var1;
        byte[] var5 = new byte[this.field625 * this.field625];
        int var6 = 0;
        for (int var7 = this.field625 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field625; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field616[2][1] = var5;
        byte[] var9 = new byte[this.field625 * this.field625];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field625; var11++) {
            for (int var12 = 0; var12 < this.field625; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field616[2][2] = var9;
        byte[] var13 = new byte[this.field625 * this.field625];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field625; var15++) {
            for (int var16 = this.field625 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field616[2][3] = var13;
    }

    @ObfuscatedName("av.m(B)V")
    public void method584() {
        byte[] var1 = new byte[this.field625 * this.field625];
        int var2 = 0;
        for (int var3 = this.field625 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field625; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field616[3][0] = var1;
        byte[] var5 = new byte[this.field625 * this.field625];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field625; var7++) {
            for (int var8 = 0; var8 < this.field625; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field616[3][1] = var5;
        byte[] var9 = new byte[this.field625 * this.field625];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field625; var11++) {
            for (int var12 = this.field625 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field616[3][2] = var9;
        byte[] var13 = new byte[this.field625 * this.field625];
        int var14 = 0;
        for (int var15 = this.field625 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field625 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field616[3][3] = var13;
    }

    @ObfuscatedName("av.u(I)V")
    public void method592() {
        byte[] var1 = new byte[this.field625 * this.field625];
        int var2 = 0;
        for (int var3 = this.field625 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field625 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field616[4][0] = var1;
        byte[] var5 = new byte[this.field625 * this.field625];
        int var6 = 0;
        for (int var7 = this.field625 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field625; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field616[4][1] = var5;
        byte[] var9 = new byte[this.field625 * this.field625];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field625; var11++) {
            for (int var12 = 0; var12 < this.field625; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field616[4][2] = var9;
        byte[] var13 = new byte[this.field625 * this.field625];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field625; var15++) {
            for (int var16 = this.field625 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field616[4][3] = var13;
    }

    @ObfuscatedName("av.h(I)V")
    public void method618() {
        byte[] var1 = new byte[this.field625 * this.field625];
        boolean var2 = false;
        byte[] var3 = new byte[this.field625 * this.field625];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field625; var5++) {
            for (int var6 = 0; var6 < this.field625; var6++) {
                if (var6 <= this.field625 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field616[5][0] = var3;
        byte[] var7 = new byte[this.field625 * this.field625];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field625; var9++) {
            for (int var10 = 0; var10 < this.field625; var10++) {
                if (var9 <= this.field625 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field616[5][1] = var7;
        byte[] var11 = new byte[this.field625 * this.field625];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field625; var13++) {
            for (int var14 = 0; var14 < this.field625; var14++) {
                if (var14 >= this.field625 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field616[5][2] = var11;
        byte[] var15 = new byte[this.field625 * this.field625];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field625; var17++) {
            for (int var18 = 0; var18 < this.field625; var18++) {
                if (var17 >= this.field625 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field616[5][3] = var15;
    }

    @ObfuscatedName("av.a(I)V")
    public void method594() {
        byte[] var1 = new byte[this.field625 * this.field625];
        boolean var2 = false;
        byte[] var3 = new byte[this.field625 * this.field625];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field625; var5++) {
            for (int var6 = 0; var6 < this.field625; var6++) {
                if (var6 <= var5 - this.field625 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field616[6][0] = var3;
        byte[] var7 = new byte[this.field625 * this.field625];
        int var8 = 0;
        for (int var9 = this.field625 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field625; var10++) {
                if (var10 <= var9 - this.field625 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field616[6][1] = var7;
        byte[] var11 = new byte[this.field625 * this.field625];
        int var12 = 0;
        for (int var13 = this.field625 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field625 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field625 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field616[6][2] = var11;
        byte[] var15 = new byte[this.field625 * this.field625];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field625; var17++) {
            for (int var18 = this.field625 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field625 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field616[6][3] = var15;
    }

    @ObfuscatedName("av.p(S)V")
    public void method616() {
        byte[] var1 = new byte[this.field625 * this.field625];
        boolean var2 = false;
        byte[] var3 = new byte[this.field625 * this.field625];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field625; var5++) {
            for (int var6 = 0; var6 < this.field625; var6++) {
                if (var6 >= var5 - this.field625 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field616[7][0] = var3;
        byte[] var7 = new byte[this.field625 * this.field625];
        int var8 = 0;
        for (int var9 = this.field625 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field625; var10++) {
                if (var10 >= var9 - this.field625 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field616[7][1] = var7;
        byte[] var11 = new byte[this.field625 * this.field625];
        int var12 = 0;
        for (int var13 = this.field625 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field625 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field625 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field616[7][2] = var11;
        byte[] var15 = new byte[this.field625 * this.field625];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field625; var17++) {
            for (int var18 = this.field625 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field625 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field616[7][3] = var15;
    }
}
