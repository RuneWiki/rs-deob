package deob;

import java.util.Arrays;

@ObfuscatedName("mk")
public class class327 {

    @ObfuscatedName("mk.at")
    public int[] field3545;

    @ObfuscatedName("mk.an")
    public int[] field3540;

    @ObfuscatedName("mk.av")
    public int[] field3543;

    @ObfuscatedName("mk.as")
    public int field3542 = -1;

    @ObfuscatedName("mk.ax")
    public int field3541 = 0;

    @ObfuscatedName("mk.ap")
    public int field3544;

    @ObfuscatedName("mk.ab")
    public long field3539;

    @ObfuscatedName("mk.ak")
    public long field3546;

    @ObfuscatedName("mk.ae")
    public class183[] field3547;

    @ObfuscatedName("mk.af")
    public boolean field3548 = false;

    @ObfuscatedName("mk.ac")
    public static final int[] field3549 = new int[] { class209.field2305.field2316, class209.field2313.field2316, class209.field2302.field2316, class209.field2308.field2316, class209.field2310.field2316, class209.field2309.field2316, class209.field2312.field2316 };

    @ObfuscatedName("mk.ah")
    public static class287 field3550 = new class287(260);

    public class327() {
    }

    public class327(class327 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3540, arg0.field3540.length);
        int[] var3 = Arrays.copyOf(arg0.field3545, arg0.field3545.length);
        class183[] var4 = (class183[]) (arg0.field3547 == null ? null : (class183[]) Arrays.copyOf(arg0.field3547, arg0.field3547.length));
        int[] var5 = Arrays.copyOf(arg0.field3543, arg0.field3543.length);
        this.method5433(var3, var2, var4, false, var5, arg0.field3541, arg0.field3544, arg0.field3542);
    }

    @ObfuscatedName("mk.at([I[I[Lhe;Z[IIIII)V")
    public void method5433(int[] arg0, int[] arg1, class183[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3547 = arg2;
        this.field3548 = arg3;
        this.field3542 = arg7;
        this.method5434(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("mk.an([I[I[IIIB)V")
    public void method5434(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method5435(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method5435(arg3);
        }
        this.field3545 = arg0;
        this.field3540 = arg1;
        this.field3543 = arg2;
        this.field3541 = arg3;
        this.field3544 = arg4;
        this.method5440();
    }

    @ObfuscatedName("mk.av(II)[I")
    public int[] method5435(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            method1048(arg0, var2, var3);
        }
        return var2;
    }

    @ObfuscatedName("cy.as(I[III)V")
    public static void method1048(int arg0, int[] arg1, int arg2) {
        for (int var3 = 0; var3 < Statics.field1940; var3++) {
            class189 var4 = class189.method3043(var3);
            if (var4 != null && !var4.field1949 && var4.field1942 == (arg0 == 1 ? 7 : 0) + arg2) {
                arg1[field3549[arg2]] = var3 + 256;
                break;
            }
        }
    }

    @ObfuscatedName("mk.ax(IZI)V")
    public void method5436(int arg0, boolean arg1) {
        int var3 = this.field3540[field3549[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class189 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1940) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1940 - 1;
                }
            }
            var4 = class189.method3043(var3);
        } while (var4 == null || var4.field1949 || var4.field1942 != (this.field3541 == 1 ? 7 : 0) + arg0);
        this.field3540[field3549[arg0]] = var3 + 256;
        this.method5440();
    }

    @ObfuscatedName("mk.ap(IZB)V")
    public void method5437(int arg0, boolean arg1) {
        int var3 = this.field3543[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field66[arg0].length) {
                    var3 = 0;
                }
            } while (!class329.method2708(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field66[arg0].length - 1;
                }
            } while (!class329.method2708(arg0, var3));
        }
        this.field3543[arg0] = var3;
        this.method5440();
    }

    @ObfuscatedName("mk.ab(IS)V")
    public void method5438(int arg0) {
        if (this.field3541 != arg0) {
            this.method5434((int[]) null, (int[]) null, this.field3543, arg0, -1);
        }
    }

    @ObfuscatedName("mk.ak(Ltz;I)V")
    public void method5439(class501 arg0) {
        arg0.method8113(this.field3541);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3540[field3549[var2]];
            if (var3 == 0) {
                arg0.method8113(-1);
            } else {
                arg0.method8113(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method8113(this.field3543[var4]);
        }
    }

    @ObfuscatedName("mk.ae(I)V")
    public void method5440() {
        long var1 = this.field3539;
        int var3 = this.field3540[5];
        int var4 = this.field3540[9];
        this.field3540[5] = var4;
        this.field3540[9] = var3;
        this.field3539 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3539 <<= 0x4;
            if (this.field3540[var5] >= 256) {
                this.field3539 += (long) (this.field3540[var5] - 256);
            }
        }
        if (this.field3540[0] >= 256) {
            this.field3539 += (long) (this.field3540[0] - 256 >> 4);
        }
        if (this.field3540[1] >= 256) {
            this.field3539 += (long) (this.field3540[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3539 <<= 0x3;
            this.field3539 += (long) this.field3543[var6];
        }
        this.field3539 <<= 0x1;
        this.field3539 += (long) (this.field3541 * 1749033639) * -838376169L;
        this.field3540[5] = var3;
        this.field3540[9] = var4;
        if (var1 != 0L && this.field3539 != var1 || this.field3548) {
            field3550.method5122(var1);
        }
    }

    @ObfuscatedName("mk.af(Lhy;ILhy;IB)Ljd;")
    public class239 method5441(class208 arg0, int arg1, class208 arg2, int arg3) {
        if (this.field3544 != -1) {
            return class195.method7336(this.field3544).method3370(arg0, arg1, arg2, arg3, (class194) null);
        }
        long var5 = this.field3539;
        int[] var7 = this.field3540;
        if (arg0 != null && (arg0.field2294 >= 0 || arg0.field2295 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3540[var8];
            }
            if (arg0.field2294 >= 0) {
                var5 += (long) (arg0.field2294 - this.field3540[5] << 40);
                var7[5] = arg0.field2294;
            }
            if (arg0.field2295 >= 0) {
                var5 += (long) (arg0.field2295 - this.field3540[3] << 48);
                var7[3] = arg0.field2295;
            }
        }
        class239 var9 = (class239) field3550.method5121(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class189.method3043(var12 - 256).method3307()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class206.method5155(var12 - 512).method3630(this.field3541)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3546 != -1L) {
                    var9 = (class239) field3550.method5121(this.field3546);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class221[] var13 = new class221[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class221 var17 = class189.method3043(var16 - 256).method3308();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class206 var18 = class206.method5155(var16 - 512);
                        class221 var19 = var18.method3659(this.field3541);
                        if (var19 != null) {
                            if (this.field3547 != null) {
                                class183 var20 = this.field3547[var15];
                                if (var20 != null) {
                                    if (var20.field1891 != null && var18.field2209 != null && var18.field2210.length == var20.field1891.length) {
                                        for (int var21 = 0; var21 < var18.field2209.length; var21++) {
                                            var19.method3995(var18.field2210[var21], var20.field1891[var21]);
                                        }
                                    }
                                    if (var20.field1889 != null && var18.field2211 != null && var18.field2245.length == var20.field1889.length) {
                                        for (int var22 = 0; var22 < var18.field2211.length; var22++) {
                                            var19.method3965(var18.field2245[var22], var20.field1889[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class221 var23 = new class221(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3543[var24] < Statics.field66[var24].length) {
                        var23.method3995(Statics.field3037[var24], Statics.field66[var24][this.field3543[var24]]);
                    }
                    if (this.field3543[var24] < Statics.field2327[var24].length) {
                        var23.method3995(Statics.field4313[var24], Statics.field2327[var24][this.field3543[var24]]);
                    }
                }
                var9 = var23.method3934(64, 850, -30, -50, -30);
                field3550.method5123(var9, var5);
                this.field3546 = var5;
            }
        }
        class239 var25;
        if (arg0 == null && arg2 == null) {
            var25 = var9.method4411(true);
        } else if (arg0 != null && arg2 != null) {
            var25 = arg0.method3724(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3721(var9, arg3);
        } else {
            var25 = arg0.method3721(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("mk.ao(B)Lit;")
    public class221 method5442() {
        if (this.field3544 != -1) {
            return class195.method7336(this.field3544).method3371((class194) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3540[var2];
            if (var3 >= 256 && var3 < 512 && !class189.method3043(var3 - 256).method3304()) {
                var1 = true;
            }
            if (var3 >= 512 && !class206.method5155(var3 - 512).method3632(this.field3541)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class221[] var4 = new class221[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3540[var6];
            if (var7 >= 256 && var7 < 512) {
                class221 var8 = class189.method3043(var7 - 256).method3309();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class221 var9 = class206.method5155(var7 - 512).method3633(this.field3541);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class221 var10 = new class221(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3543[var11] < Statics.field66[var11].length) {
                var10.method3995(Statics.field3037[var11], Statics.field66[var11][this.field3543[var11]]);
            }
            if (this.field3543[var11] < Statics.field2327[var11].length) {
                var10.method3995(Statics.field4313[var11], Statics.field2327[var11][this.field3543[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("mk.aa(I)I")
    public int method5443() {
        return this.field3544 == -1 ? (this.field3540[11] << 5) + (this.field3540[8] << 10) + (this.field3540[0] << 15) + (this.field3543[0] << 25) + (this.field3543[4] << 20) + this.field3540[1] : 305419896 + class195.method7336(this.field3544).field1999;
    }

    @ObfuscatedName("mk.aj(I)V")
    public void method5444() {
        this.method5434(this.field3545, this.field3540, this.field3543, this.field3541, this.field3544);
    }
}
