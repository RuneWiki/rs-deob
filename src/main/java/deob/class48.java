package deob;

@ObfuscatedName("am")
public class class48 {

    @ObfuscatedName("am.d")
    public int field591;

    @ObfuscatedName("am.z")
    public byte[][][] field588;

    public class48(int arg0) {
        this.field591 = arg0;
    }

    @ObfuscatedName("am.d(IIIIIIIII)V")
    public void method587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field591 != 0 && this.field588 != null) {
            int var9 = this.method589(arg7, arg6);
            int var10 = this.method590(arg6);
            class328.method5354(arg0, arg1, arg4, arg5, arg2, arg3, this.field588[var10 - 1][var9], this.field591, true);
        }
    }

    @ObfuscatedName("am.z(IIB)I")
    public int method589(int arg0, int arg1) {
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

    @ObfuscatedName("am.n(II)I")
    public int method590(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("am.r(B)V")
    public void method591() {
        if (this.field588 != null) {
            return;
        }
        this.field588 = new byte[8][4][];
        this.method604();
        this.method593();
        this.method594();
        this.method595();
        this.method624();
        this.method600();
        this.method588();
        this.method599();
    }

    @ObfuscatedName("am.e(I)V")
    public void method604() {
        byte[] var1 = new byte[this.field591 * this.field591];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field591; var3++) {
            for (int var4 = 0; var4 < this.field591; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field588[0][0] = var1;
        byte[] var5 = new byte[this.field591 * this.field591];
        int var6 = 0;
        for (int var7 = this.field591 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field591; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field588[0][1] = var5;
        byte[] var9 = new byte[this.field591 * this.field591];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field591; var11++) {
            for (int var12 = 0; var12 < this.field591; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field588[0][2] = var9;
        byte[] var13 = new byte[this.field591 * this.field591];
        int var14 = 0;
        for (int var15 = this.field591 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field591; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field588[0][3] = var13;
    }

    @ObfuscatedName("am.y(I)V")
    public void method593() {
        byte[] var1 = new byte[this.field591 * this.field591];
        int var2 = 0;
        for (int var3 = this.field591 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field591; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field588[1][0] = var1;
        byte[] var5 = new byte[this.field591 * this.field591];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field591; var7++) {
            for (int var8 = 0; var8 < this.field591; var8++) {
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
        this.field588[1][1] = var5;
        byte[] var9 = new byte[this.field591 * this.field591];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field591; var11++) {
            for (int var12 = this.field591 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field588[1][2] = var9;
        byte[] var13 = new byte[this.field591 * this.field591];
        int var14 = 0;
        for (int var15 = this.field591 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field591 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field588[1][3] = var13;
    }

    @ObfuscatedName("am.k(I)V")
    public void method594() {
        byte[] var1 = new byte[this.field591 * this.field591];
        int var2 = 0;
        for (int var3 = this.field591 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field591 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field588[2][0] = var1;
        byte[] var5 = new byte[this.field591 * this.field591];
        int var6 = 0;
        for (int var7 = this.field591 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field591; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field588[2][1] = var5;
        byte[] var9 = new byte[this.field591 * this.field591];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field591; var11++) {
            for (int var12 = 0; var12 < this.field591; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field588[2][2] = var9;
        byte[] var13 = new byte[this.field591 * this.field591];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field591; var15++) {
            for (int var16 = this.field591 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field588[2][3] = var13;
    }

    @ObfuscatedName("am.s(B)V")
    public void method595() {
        byte[] var1 = new byte[this.field591 * this.field591];
        int var2 = 0;
        for (int var3 = this.field591 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field591; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field588[3][0] = var1;
        byte[] var5 = new byte[this.field591 * this.field591];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field591; var7++) {
            for (int var8 = 0; var8 < this.field591; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field588[3][1] = var5;
        byte[] var9 = new byte[this.field591 * this.field591];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field591; var11++) {
            for (int var12 = this.field591 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field588[3][2] = var9;
        byte[] var13 = new byte[this.field591 * this.field591];
        int var14 = 0;
        for (int var15 = this.field591 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field591 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field588[3][3] = var13;
    }

    @ObfuscatedName("am.x(B)V")
    public void method624() {
        byte[] var1 = new byte[this.field591 * this.field591];
        int var2 = 0;
        for (int var3 = this.field591 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field591 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field588[4][0] = var1;
        byte[] var5 = new byte[this.field591 * this.field591];
        int var6 = 0;
        for (int var7 = this.field591 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field591; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field588[4][1] = var5;
        byte[] var9 = new byte[this.field591 * this.field591];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field591; var11++) {
            for (int var12 = 0; var12 < this.field591; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field588[4][2] = var9;
        byte[] var13 = new byte[this.field591 * this.field591];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field591; var15++) {
            for (int var16 = this.field591 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field588[4][3] = var13;
    }

    @ObfuscatedName("am.h(S)V")
    public void method600() {
        byte[] var1 = new byte[this.field591 * this.field591];
        boolean var2 = false;
        byte[] var3 = new byte[this.field591 * this.field591];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field591; var5++) {
            for (int var6 = 0; var6 < this.field591; var6++) {
                if (var6 <= this.field591 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field588[5][0] = var3;
        byte[] var7 = new byte[this.field591 * this.field591];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field591; var9++) {
            for (int var10 = 0; var10 < this.field591; var10++) {
                if (var9 <= this.field591 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field588[5][1] = var7;
        byte[] var11 = new byte[this.field591 * this.field591];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field591; var13++) {
            for (int var14 = 0; var14 < this.field591; var14++) {
                if (var14 >= this.field591 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field588[5][2] = var11;
        byte[] var15 = new byte[this.field591 * this.field591];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field591; var17++) {
            for (int var18 = 0; var18 < this.field591; var18++) {
                if (var17 >= this.field591 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field588[5][3] = var15;
    }

    @ObfuscatedName("am.t(S)V")
    public void method588() {
        byte[] var1 = new byte[this.field591 * this.field591];
        boolean var2 = false;
        byte[] var3 = new byte[this.field591 * this.field591];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field591; var5++) {
            for (int var6 = 0; var6 < this.field591; var6++) {
                if (var6 <= var5 - this.field591 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field588[6][0] = var3;
        byte[] var7 = new byte[this.field591 * this.field591];
        int var8 = 0;
        for (int var9 = this.field591 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field591; var10++) {
                if (var10 <= var9 - this.field591 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field588[6][1] = var7;
        byte[] var11 = new byte[this.field591 * this.field591];
        int var12 = 0;
        for (int var13 = this.field591 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field591 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field591 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field588[6][2] = var11;
        byte[] var15 = new byte[this.field591 * this.field591];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field591; var17++) {
            for (int var18 = this.field591 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field591 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field588[6][3] = var15;
    }

    @ObfuscatedName("am.i(I)V")
    public void method599() {
        byte[] var1 = new byte[this.field591 * this.field591];
        boolean var2 = false;
        byte[] var3 = new byte[this.field591 * this.field591];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field591; var5++) {
            for (int var6 = 0; var6 < this.field591; var6++) {
                if (var6 >= var5 - this.field591 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field588[7][0] = var3;
        byte[] var7 = new byte[this.field591 * this.field591];
        int var8 = 0;
        for (int var9 = this.field591 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field591; var10++) {
                if (var10 >= var9 - this.field591 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field588[7][1] = var7;
        byte[] var11 = new byte[this.field591 * this.field591];
        int var12 = 0;
        for (int var13 = this.field591 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field591 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field591 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field588[7][2] = var11;
        byte[] var15 = new byte[this.field591 * this.field591];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field591; var17++) {
            for (int var18 = this.field591 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field591 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field588[7][3] = var15;
    }
}
