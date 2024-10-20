package deob;

@ObfuscatedName("ja")
public class class259 {

    @ObfuscatedName("ja.at")
    public int field2644;

    @ObfuscatedName("ja.ah")
    public byte[][][] field2646;

    public class259(int arg0) {
        this.field2644 = arg0;
    }

    @ObfuscatedName("ja.at(IIIIIIIIB)V")
    public void method4519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field2644 != 0 && this.field2646 != null) {
            int var9 = this.method4520(arg7, arg6);
            int var10 = this.method4521(arg6);
            class537.method8766(arg0, arg1, arg4, arg5, arg2, arg3, this.field2646[var10 - 1][var9], this.field2644, true);
        }
    }

    @ObfuscatedName("ja.ah(III)I")
    public int method4520(int arg0, int arg1) {
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

    @ObfuscatedName("ja.ar(II)I")
    public int method4521(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ja.ao(B)V")
    public void method4555() {
        if (this.field2646 != null) {
            return;
        }
        this.field2646 = new byte[8][4][];
        this.method4566();
        this.method4524();
        this.method4525();
        this.method4526();
        this.method4527();
        this.method4528();
        this.method4560();
        this.method4518();
    }

    @ObfuscatedName("ja.ab(I)V")
    public void method4566() {
        byte[] var1 = new byte[this.field2644 * this.field2644];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2644; var3++) {
            for (int var4 = 0; var4 < this.field2644; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2646[0][0] = var1;
        byte[] var5 = new byte[this.field2644 * this.field2644];
        int var6 = 0;
        for (int var7 = this.field2644 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2644; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2646[0][1] = var5;
        byte[] var9 = new byte[this.field2644 * this.field2644];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2644; var11++) {
            for (int var12 = 0; var12 < this.field2644; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2646[0][2] = var9;
        byte[] var13 = new byte[this.field2644 * this.field2644];
        int var14 = 0;
        for (int var15 = this.field2644 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field2644; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2646[0][3] = var13;
    }

    @ObfuscatedName("ja.au(I)V")
    public void method4524() {
        byte[] var1 = new byte[this.field2644 * this.field2644];
        int var2 = 0;
        for (int var3 = this.field2644 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2644; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2646[1][0] = var1;
        byte[] var5 = new byte[this.field2644 * this.field2644];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2644; var7++) {
            for (int var8 = 0; var8 < this.field2644; var8++) {
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
        this.field2646[1][1] = var5;
        byte[] var9 = new byte[this.field2644 * this.field2644];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2644; var11++) {
            for (int var12 = this.field2644 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2646[1][2] = var9;
        byte[] var13 = new byte[this.field2644 * this.field2644];
        int var14 = 0;
        for (int var15 = this.field2644 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field2644 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2646[1][3] = var13;
    }

    @ObfuscatedName("ja.aa(B)V")
    public void method4525() {
        byte[] var1 = new byte[this.field2644 * this.field2644];
        int var2 = 0;
        for (int var3 = this.field2644 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field2644 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2646[2][0] = var1;
        byte[] var5 = new byte[this.field2644 * this.field2644];
        int var6 = 0;
        for (int var7 = this.field2644 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2644; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2646[2][1] = var5;
        byte[] var9 = new byte[this.field2644 * this.field2644];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2644; var11++) {
            for (int var12 = 0; var12 < this.field2644; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2646[2][2] = var9;
        byte[] var13 = new byte[this.field2644 * this.field2644];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field2644; var15++) {
            for (int var16 = this.field2644 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2646[2][3] = var13;
    }

    @ObfuscatedName("ja.ac(I)V")
    public void method4526() {
        byte[] var1 = new byte[this.field2644 * this.field2644];
        int var2 = 0;
        for (int var3 = this.field2644 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2644; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2646[3][0] = var1;
        byte[] var5 = new byte[this.field2644 * this.field2644];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2644; var7++) {
            for (int var8 = 0; var8 < this.field2644; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2646[3][1] = var5;
        byte[] var9 = new byte[this.field2644 * this.field2644];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2644; var11++) {
            for (int var12 = this.field2644 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2646[3][2] = var9;
        byte[] var13 = new byte[this.field2644 * this.field2644];
        int var14 = 0;
        for (int var15 = this.field2644 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field2644 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2646[3][3] = var13;
    }

    @ObfuscatedName("ja.al(B)V")
    public void method4527() {
        byte[] var1 = new byte[this.field2644 * this.field2644];
        int var2 = 0;
        for (int var3 = this.field2644 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field2644 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field2646[4][0] = var1;
        byte[] var5 = new byte[this.field2644 * this.field2644];
        int var6 = 0;
        for (int var7 = this.field2644 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field2644; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field2646[4][1] = var5;
        byte[] var9 = new byte[this.field2644 * this.field2644];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field2644; var11++) {
            for (int var12 = 0; var12 < this.field2644; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field2646[4][2] = var9;
        byte[] var13 = new byte[this.field2644 * this.field2644];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field2644; var15++) {
            for (int var16 = this.field2644 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field2646[4][3] = var13;
    }

    @ObfuscatedName("ja.az(B)V")
    public void method4528() {
        byte[] var1 = new byte[this.field2644 * this.field2644];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2644 * this.field2644];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2644; var5++) {
            for (int var6 = 0; var6 < this.field2644; var6++) {
                if (var6 <= this.field2644 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2646[5][0] = var3;
        byte[] var7 = new byte[this.field2644 * this.field2644];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field2644; var9++) {
            for (int var10 = 0; var10 < this.field2644; var10++) {
                if (var9 <= this.field2644 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2646[5][1] = var7;
        byte[] var11 = new byte[this.field2644 * this.field2644];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field2644; var13++) {
            for (int var14 = 0; var14 < this.field2644; var14++) {
                if (var14 >= this.field2644 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2646[5][2] = var11;
        byte[] var15 = new byte[this.field2644 * this.field2644];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2644; var17++) {
            for (int var18 = 0; var18 < this.field2644; var18++) {
                if (var17 >= this.field2644 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2646[5][3] = var15;
    }

    @ObfuscatedName("ja.ap(B)V")
    public void method4560() {
        byte[] var1 = new byte[this.field2644 * this.field2644];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2644 * this.field2644];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2644; var5++) {
            for (int var6 = 0; var6 < this.field2644; var6++) {
                if (var6 <= var5 - this.field2644 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2646[6][0] = var3;
        byte[] var7 = new byte[this.field2644 * this.field2644];
        int var8 = 0;
        for (int var9 = this.field2644 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field2644; var10++) {
                if (var10 <= var9 - this.field2644 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2646[6][1] = var7;
        byte[] var11 = new byte[this.field2644 * this.field2644];
        int var12 = 0;
        for (int var13 = this.field2644 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field2644 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field2644 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2646[6][2] = var11;
        byte[] var15 = new byte[this.field2644 * this.field2644];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2644; var17++) {
            for (int var18 = this.field2644 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field2644 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2646[6][3] = var15;
    }

    @ObfuscatedName("ja.av(I)V")
    public void method4518() {
        byte[] var1 = new byte[this.field2644 * this.field2644];
        boolean var2 = false;
        byte[] var3 = new byte[this.field2644 * this.field2644];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field2644; var5++) {
            for (int var6 = 0; var6 < this.field2644; var6++) {
                if (var6 >= var5 - this.field2644 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field2646[7][0] = var3;
        byte[] var7 = new byte[this.field2644 * this.field2644];
        int var8 = 0;
        for (int var9 = this.field2644 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field2644; var10++) {
                if (var10 >= var9 - this.field2644 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field2646[7][1] = var7;
        byte[] var11 = new byte[this.field2644 * this.field2644];
        int var12 = 0;
        for (int var13 = this.field2644 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field2644 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field2644 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field2646[7][2] = var11;
        byte[] var15 = new byte[this.field2644 * this.field2644];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field2644; var17++) {
            for (int var18 = this.field2644 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field2644 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field2646[7][3] = var15;
    }
}
