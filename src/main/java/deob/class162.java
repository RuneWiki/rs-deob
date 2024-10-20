package deob;

@ObfuscatedName("ff")
public class class162 {

    @ObfuscatedName("ff.a")
    public int[] field2717;

    @ObfuscatedName("ff.v")
    public int[] field2715;

    @ObfuscatedName("ff.i")
    public boolean field2711;

    @ObfuscatedName("ff.b")
    public int field2712;

    @ObfuscatedName("ff.l")
    public long field2713;

    @ObfuscatedName("ff.m")
    public long field2709;

    @ObfuscatedName("ff.k")
    public static final int[] field2714 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ff.f")
    public static class176 field2716 = new class176(260);

    @ObfuscatedName("ff.a([I[IZIB)V")
    public void method2953(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field946; var6++) {
                    class41 var7 = class41.method1870(var6);
                    if (var7 != null && !var7.field955 && var7.field957 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2714[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2717 = arg0;
        this.field2715 = arg1;
        this.field2711 = arg2;
        this.field2712 = arg3;
        this.method2943();
    }

    @ObfuscatedName("ff.v(IZI)V")
    public void method2942(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2711) {
            return;
        }
        int var3 = this.field2717[field2714[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class41 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field946) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field946 - 1;
                }
            }
            var4 = class41.method1870(var3);
        } while (var4 == null || var4.field955 || (this.field2711 ? 7 : 0) + arg0 != var4.field957);
        this.field2717[field2714[arg0]] = var3 + 256;
        this.method2943();
    }

    @ObfuscatedName("ff.i(IZI)V")
    public void method2949(int arg0, boolean arg1) {
        int var3 = this.field2715[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2697[arg0].length) {
                    var3 = 0;
                }
            } while (!class158.method1313(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2697[arg0].length - 1;
                }
            } while (!class158.method1313(arg0, var3));
        }
        this.field2715[arg0] = var3;
        this.method2943();
    }

    @ObfuscatedName("ff.b(ZB)V")
    public void method2932(boolean arg0) {
        if (this.field2711 != arg0) {
            this.method2953((int[]) null, this.field2715, arg0, -1);
        }
    }

    @ObfuscatedName("ff.l(Ldi;I)V")
    public void method2933(class110 arg0) {
        arg0.method2117(this.field2711 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2717[field2714[var2]];
            if (var3 == 0) {
                arg0.method2117(-1);
            } else {
                arg0.method2117(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2117(this.field2715[var4]);
        }
    }

    @ObfuscatedName("ff.m(B)V")
    public void method2943() {
        long var1 = this.field2713;
        int var3 = this.field2717[5];
        int var4 = this.field2717[9];
        this.field2717[5] = var4;
        this.field2717[9] = var3;
        this.field2713 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2713 <<= 0x4;
            if (this.field2717[var5] >= 256) {
                this.field2713 += (long) (this.field2717[var5] - 256);
            }
        }
        if (this.field2717[0] >= 256) {
            this.field2713 += (long) (this.field2717[0] - 256 >> 4);
        }
        if (this.field2717[1] >= 256) {
            this.field2713 += (long) (this.field2717[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2713 <<= 0x3;
            this.field2713 += (long) this.field2715[var6];
        }
        this.field2713 <<= 0x1;
        this.field2713 += (long) (this.field2711 ? 1 : 0);
        this.field2717[5] = var3;
        this.field2717[9] = var4;
        if (var1 != 0L && this.field2713 != var1) {
            field2716.method3182(var1);
        }
    }

    @ObfuscatedName("ff.w(Laa;ILaa;IB)Lcl;")
    public class99 method2935(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field2712 != -1) {
            return class36.method1074(this.field2712).method633(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2713;
        int[] var7 = this.field2717;
        if (arg0 != null && (arg0.field918 >= 0 || arg0.field919 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2717[var8];
            }
            if (arg0.field918 >= 0) {
                var5 += (long) (arg0.field918 - this.field2717[5] << 40);
                var7[5] = arg0.field918;
            }
            if (arg0.field919 >= 0) {
                var5 += (long) (arg0.field919 - this.field2717[3] << 48);
                var7[3] = arg0.field919;
            }
        }
        class99 var9 = (class99) field2716.method3181(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class41.method1870(var12 - 256).method796()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class46.method740(var12 - 512).method864(this.field2711)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2709 != -1L) {
                    var9 = (class99) field2716.method3181(this.field2709);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class94[] var13 = new class94[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class94 var17 = class41.method1870(var16 - 256).method786();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class94 var18 = class46.method740(var16 - 512).method871(this.field2711);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class94 var19 = new class94(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2715[var20] < Statics.field2697[var20].length) {
                        var19.method1892(Statics.field1071[var20], Statics.field2697[var20][this.field2715[var20]]);
                    }
                    if (this.field2715[var20] < Statics.field616[var20].length) {
                        var19.method1892(Statics.field1010[var20], Statics.field616[var20][this.field2715[var20]]);
                    }
                }
                var9 = var19.method1879(64, 850, -30, -50, -30);
                field2716.method3183(var9, var5);
                this.field2709 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class99 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method744(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method763(var9, arg3);
        } else {
            var21 = arg0.method763(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ff.e(I)Lcy;")
    public class94 method2936() {
        if (this.field2712 != -1) {
            return class36.method1074(this.field2712).method634();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2717[var2];
            if (var3 >= 256 && var3 < 512 && !class41.method1870(var3 - 256).method802()) {
                var1 = true;
            }
            if (var3 >= 512 && !class46.method740(var3 - 512).method888(this.field2711)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class94[] var4 = new class94[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2717[var6];
            if (var7 >= 256 && var7 < 512) {
                class94 var8 = class41.method1870(var7 - 256).method788();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class94 var9 = class46.method740(var7 - 512).method873(this.field2711);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class94 var10 = new class94(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2715[var11] < Statics.field2697[var11].length) {
                var10.method1892(Statics.field1071[var11], Statics.field2697[var11][this.field2715[var11]]);
            }
            if (this.field2715[var11] < Statics.field616[var11].length) {
                var10.method1892(Statics.field1010[var11], Statics.field616[var11][this.field2715[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ff.n(I)I")
    public int method2937() {
        return this.field2712 == -1 ? (this.field2717[11] << 5) + (this.field2717[8] << 10) + (this.field2717[0] << 15) + (this.field2715[0] << 25) + (this.field2715[4] << 20) + this.field2717[1] : 305419896 + class36.method1074(this.field2712).field807;
    }
}
