package deob;

@ObfuscatedName("ko")
public class class278 {

    @ObfuscatedName("ko.at")
    public int field3061;

    @ObfuscatedName("ko.an")
    public byte[][][] field3060;

    public class278(int arg0) {
        this.field3061 = arg0;
    }

    @ObfuscatedName("ko.at(IIIIIIIIB)V")
    public void method5044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0 && this.field3061 != 0 && this.field3060 != null) {
            int var9 = this.method5041(arg7, arg6);
            int var10 = this.method5042(arg6);
            class511.method8470(arg0, arg1, arg4, arg5, arg2, arg3, this.field3060[var10 - 1][var9], this.field3061, true);
        }
    }

    @ObfuscatedName("ko.an(III)I")
    public int method5041(int arg0, int arg1) {
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

    @ObfuscatedName("ko.av(II)I")
    public int method5042(int arg0) {
        if (arg0 == 9 || arg0 == 10) {
            return 1;
        } else if (arg0 == 11) {
            return 8;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ko.as(B)V")
    public void method5048() {
        if (this.field3060 != null) {
            return;
        }
        this.field3060 = new byte[8][4][];
        this.method5052();
        this.method5045();
        this.method5040();
        this.method5047();
        this.method5067();
        this.method5049();
        this.method5050();
        this.method5051();
    }

    @ObfuscatedName("ko.ax(B)V")
    public void method5052() {
        byte[] var1 = new byte[this.field3061 * this.field3061];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3061; var3++) {
            for (int var4 = 0; var4 < this.field3061; var4++) {
                if (var4 <= var3) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3060[0][0] = var1;
        byte[] var5 = new byte[this.field3061 * this.field3061];
        int var6 = 0;
        for (int var7 = this.field3061 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3061; var8++) {
                if (var8 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3060[0][1] = var5;
        byte[] var9 = new byte[this.field3061 * this.field3061];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3061; var11++) {
            for (int var12 = 0; var12 < this.field3061; var12++) {
                if (var12 >= var11) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3060[0][2] = var9;
        byte[] var13 = new byte[this.field3061 * this.field3061];
        int var14 = 0;
        for (int var15 = this.field3061 - 1; var15 >= 0; var15--) {
            for (int var16 = 0; var16 < this.field3061; var16++) {
                if (var16 >= var15) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3060[0][3] = var13;
    }

    @ObfuscatedName("ko.ap(B)V")
    public void method5045() {
        byte[] var1 = new byte[this.field3061 * this.field3061];
        int var2 = 0;
        for (int var3 = this.field3061 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3061; var4++) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3060[1][0] = var1;
        byte[] var5 = new byte[this.field3061 * this.field3061];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3061; var7++) {
            for (int var8 = 0; var8 < this.field3061; var8++) {
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
        this.field3060[1][1] = var5;
        byte[] var9 = new byte[this.field3061 * this.field3061];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3061; var11++) {
            for (int var12 = this.field3061 - 1; var12 >= 0; var12--) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3060[1][2] = var9;
        byte[] var13 = new byte[this.field3061 * this.field3061];
        int var14 = 0;
        for (int var15 = this.field3061 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field3061 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3060[1][3] = var13;
    }

    @ObfuscatedName("ko.ab(I)V")
    public void method5040() {
        byte[] var1 = new byte[this.field3061 * this.field3061];
        int var2 = 0;
        for (int var3 = this.field3061 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field3061 - 1; var4 >= 0; var4--) {
                if (var4 <= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3060[2][0] = var1;
        byte[] var5 = new byte[this.field3061 * this.field3061];
        int var6 = 0;
        for (int var7 = this.field3061 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3061; var8++) {
                if (var8 >= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3060[2][1] = var5;
        byte[] var9 = new byte[this.field3061 * this.field3061];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3061; var11++) {
            for (int var12 = 0; var12 < this.field3061; var12++) {
                if (var12 <= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3060[2][2] = var9;
        byte[] var13 = new byte[this.field3061 * this.field3061];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field3061; var15++) {
            for (int var16 = this.field3061 - 1; var16 >= 0; var16--) {
                if (var16 >= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3060[2][3] = var13;
    }

    @ObfuscatedName("ko.ak(I)V")
    public void method5047() {
        byte[] var1 = new byte[this.field3061 * this.field3061];
        int var2 = 0;
        for (int var3 = this.field3061 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3061; var4++) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3060[3][0] = var1;
        byte[] var5 = new byte[this.field3061 * this.field3061];
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3061; var7++) {
            for (int var8 = 0; var8 < this.field3061; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3060[3][1] = var5;
        byte[] var9 = new byte[this.field3061 * this.field3061];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3061; var11++) {
            for (int var12 = this.field3061 - 1; var12 >= 0; var12--) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3060[3][2] = var9;
        byte[] var13 = new byte[this.field3061 * this.field3061];
        int var14 = 0;
        for (int var15 = this.field3061 - 1; var15 >= 0; var15--) {
            for (int var16 = this.field3061 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3060[3][3] = var13;
    }

    @ObfuscatedName("ko.ae(I)V")
    public void method5067() {
        byte[] var1 = new byte[this.field3061 * this.field3061];
        int var2 = 0;
        for (int var3 = this.field3061 - 1; var3 >= 0; var3--) {
            for (int var4 = this.field3061 - 1; var4 >= 0; var4--) {
                if (var4 >= var3 >> 1) {
                    var1[var2] = -1;
                }
                var2++;
            }
        }
        this.field3060[4][0] = var1;
        byte[] var5 = new byte[this.field3061 * this.field3061];
        int var6 = 0;
        for (int var7 = this.field3061 - 1; var7 >= 0; var7--) {
            for (int var8 = 0; var8 < this.field3061; var8++) {
                if (var8 <= var7 << 1) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        this.field3060[4][1] = var5;
        byte[] var9 = new byte[this.field3061 * this.field3061];
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3061; var11++) {
            for (int var12 = 0; var12 < this.field3061; var12++) {
                if (var12 >= var11 >> 1) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        this.field3060[4][2] = var9;
        byte[] var13 = new byte[this.field3061 * this.field3061];
        int var14 = 0;
        for (int var15 = 0; var15 < this.field3061; var15++) {
            for (int var16 = this.field3061 - 1; var16 >= 0; var16--) {
                if (var16 <= var15 << 1) {
                    var13[var14] = -1;
                }
                var14++;
            }
        }
        this.field3060[4][3] = var13;
    }

    @ObfuscatedName("ko.af(B)V")
    public void method5049() {
        byte[] var1 = new byte[this.field3061 * this.field3061];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3061 * this.field3061];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3061; var5++) {
            for (int var6 = 0; var6 < this.field3061; var6++) {
                if (var6 <= this.field3061 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3060[5][0] = var3;
        byte[] var7 = new byte[this.field3061 * this.field3061];
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3061; var9++) {
            for (int var10 = 0; var10 < this.field3061; var10++) {
                if (var9 <= this.field3061 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3060[5][1] = var7;
        byte[] var11 = new byte[this.field3061 * this.field3061];
        int var12 = 0;
        for (int var13 = 0; var13 < this.field3061; var13++) {
            for (int var14 = 0; var14 < this.field3061; var14++) {
                if (var14 >= this.field3061 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3060[5][2] = var11;
        byte[] var15 = new byte[this.field3061 * this.field3061];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3061; var17++) {
            for (int var18 = 0; var18 < this.field3061; var18++) {
                if (var17 >= this.field3061 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3060[5][3] = var15;
    }

    @ObfuscatedName("ko.ao(I)V")
    public void method5050() {
        byte[] var1 = new byte[this.field3061 * this.field3061];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3061 * this.field3061];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3061; var5++) {
            for (int var6 = 0; var6 < this.field3061; var6++) {
                if (var6 <= var5 - this.field3061 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3060[6][0] = var3;
        byte[] var7 = new byte[this.field3061 * this.field3061];
        int var8 = 0;
        for (int var9 = this.field3061 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field3061; var10++) {
                if (var10 <= var9 - this.field3061 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3060[6][1] = var7;
        byte[] var11 = new byte[this.field3061 * this.field3061];
        int var12 = 0;
        for (int var13 = this.field3061 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field3061 - 1; var14 >= 0; var14--) {
                if (var14 <= var13 - this.field3061 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3060[6][2] = var11;
        byte[] var15 = new byte[this.field3061 * this.field3061];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3061; var17++) {
            for (int var18 = this.field3061 - 1; var18 >= 0; var18--) {
                if (var18 <= var17 - this.field3061 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3060[6][3] = var15;
    }

    @ObfuscatedName("ko.aa(B)V")
    public void method5051() {
        byte[] var1 = new byte[this.field3061 * this.field3061];
        boolean var2 = false;
        byte[] var3 = new byte[this.field3061 * this.field3061];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3061; var5++) {
            for (int var6 = 0; var6 < this.field3061; var6++) {
                if (var6 >= var5 - this.field3061 / 2) {
                    var3[var4] = -1;
                }
                var4++;
            }
        }
        this.field3060[7][0] = var3;
        byte[] var7 = new byte[this.field3061 * this.field3061];
        int var8 = 0;
        for (int var9 = this.field3061 - 1; var9 >= 0; var9--) {
            for (int var10 = 0; var10 < this.field3061; var10++) {
                if (var10 >= var9 - this.field3061 / 2) {
                    var7[var8] = -1;
                }
                var8++;
            }
        }
        this.field3060[7][1] = var7;
        byte[] var11 = new byte[this.field3061 * this.field3061];
        int var12 = 0;
        for (int var13 = this.field3061 - 1; var13 >= 0; var13--) {
            for (int var14 = this.field3061 - 1; var14 >= 0; var14--) {
                if (var14 >= var13 - this.field3061 / 2) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        this.field3060[7][2] = var11;
        byte[] var15 = new byte[this.field3061 * this.field3061];
        int var16 = 0;
        for (int var17 = 0; var17 < this.field3061; var17++) {
            for (int var18 = this.field3061 - 1; var18 >= 0; var18--) {
                if (var18 >= var17 - this.field3061 / 2) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        this.field3060[7][3] = var15;
    }
}
