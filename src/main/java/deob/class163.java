package deob;

@ObfuscatedName("fp")
public class class163 {

    @ObfuscatedName("fp.g")
    public int[] field2723;

    @ObfuscatedName("fp.m")
    public int[] field2713;

    @ObfuscatedName("fp.v")
    public boolean field2714;

    @ObfuscatedName("fp.r")
    public int field2712;

    @ObfuscatedName("fp.n")
    public long field2715;

    @ObfuscatedName("fp.i")
    public long field2716;

    @ObfuscatedName("fp.f")
    public static final int[] field2722 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fp.b")
    public static class170 field2721 = new class170(260);

    @ObfuscatedName("fp.g([I[IZIS)V")
    public void method3156(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field919; var6++) {
                    class36 var7 = class36.method792(var6);
                    if (var7 != null && !var7.field924 && var7.field909 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2722[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2723 = arg0;
        this.field2713 = arg1;
        this.field2714 = arg2;
        this.field2712 = arg3;
        this.method3167();
    }

    @ObfuscatedName("fp.m(IZI)V")
    public void method3157(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2714) {
            return;
        }
        int var3 = this.field2723[field2722[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field919) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field919 - 1;
                }
            }
            var4 = class36.method792(var3);
        } while (var4 == null || var4.field924 || var4.field909 != arg0 + (this.field2714 ? 7 : 0));
        this.field2723[field2722[arg0]] = var3 + 256;
        this.method3167();
    }

    @ObfuscatedName("fp.v(IZB)V")
    public void method3177(int arg0, boolean arg1) {
        int var3 = this.field2713[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2719[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2719[arg0].length - 1;
            }
        }
        this.field2713[arg0] = var3;
        this.method3167();
    }

    @ObfuscatedName("fp.r(ZI)V")
    public void method3174(boolean arg0) {
        if (this.field2714 != arg0) {
            this.method3156((int[]) null, this.field2713, arg0, -1);
        }
    }

    @ObfuscatedName("fp.n(Ldr;I)V")
    public void method3159(class127 arg0) {
        arg0.method2498(this.field2714 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2723[field2722[var2]];
            if (var3 == 0) {
                arg0.method2498(-1);
            } else {
                arg0.method2498(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2498(this.field2713[var4]);
        }
    }

    @ObfuscatedName("fp.i(I)V")
    public void method3167() {
        long var1 = this.field2715;
        int var3 = this.field2723[5];
        int var4 = this.field2723[9];
        this.field2723[5] = var4;
        this.field2723[9] = var3;
        this.field2715 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2715 <<= 0x4;
            if (this.field2723[var5] >= 256) {
                this.field2715 += (long) (this.field2723[var5] - 256);
            }
        }
        if (this.field2723[0] >= 256) {
            this.field2715 += (long) (this.field2723[0] - 256 >> 4);
        }
        if (this.field2723[1] >= 256) {
            this.field2715 += (long) (this.field2723[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2715 <<= 0x3;
            this.field2715 += (long) this.field2713[var6];
        }
        this.field2715 <<= 0x1;
        this.field2715 += (long) (this.field2714 ? 1 : 0);
        this.field2723[5] = var3;
        this.field2723[9] = var4;
        if (var1 != 0L && this.field2715 != var1) {
            field2721.method3242(var1);
        }
    }

    @ObfuscatedName("fp.s(Lak;ILak;II)Ldf;")
    public class112 method3161(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2712 != -1) {
            return class31.method44(this.field2712).method601(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2715;
        int[] var7 = this.field2723;
        if (arg0 != null && (arg0.field877 >= 0 || arg0.field878 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2723[var8];
            }
            if (arg0.field877 >= 0) {
                var5 += (long) (arg0.field877 - this.field2723[5] << 40);
                var7[5] = arg0.field877;
            }
            if (arg0.field878 >= 0) {
                var5 += (long) (arg0.field878 - this.field2723[3] << 48);
                var7[3] = arg0.field878;
            }
        }
        class112 var9 = (class112) field2721.method3245(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method792(var12 - 256).method762()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method41(var12 - 512).method824(this.field2714)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2716 != -1L) {
                    var9 = (class112) field2721.method3245(this.field2716);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class101[] var13 = new class101[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class101 var17 = class36.method792(var16 - 256).method763();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method41(var16 - 512).method825(this.field2714);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2713[var20] < Statics.field2719[var20].length) {
                        var19.method2031(Statics.field2717[var20], Statics.field2719[var20][this.field2713[var20]]);
                    }
                    if (this.field2713[var20] < Statics.field2342[var20].length) {
                        var19.method2031(Statics.field2711[var20], Statics.field2342[var20][this.field2713[var20]]);
                    }
                }
                var9 = var19.method2039(64, 850, -30, -50, -30);
                field2721.method3249(var9, var5);
                this.field2716 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method703(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method701(var9, arg3);
        } else {
            var21 = arg0.method701(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fp.w(B)Lck;")
    public class101 method3164() {
        if (this.field2712 != -1) {
            return class31.method44(this.field2712).method627();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2723[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method792(var3 - 256).method764()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method41(var3 - 512).method826(this.field2714)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2723[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method792(var7 - 256).method765();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method41(var7 - 512).method827(this.field2714);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2713[var11] < Statics.field2719[var11].length) {
                var10.method2031(Statics.field2717[var11], Statics.field2719[var11][this.field2713[var11]]);
            }
            if (this.field2713[var11] < Statics.field2342[var11].length) {
                var10.method2031(Statics.field2711[var11], Statics.field2342[var11][this.field2713[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fp.d(I)I")
    public int method3163() {
        return this.field2712 == -1 ? (this.field2723[11] << 5) + (this.field2723[8] << 10) + (this.field2723[0] << 15) + (this.field2713[4] << 20) + (this.field2713[0] << 25) + this.field2723[1] : 305419896 + class31.method44(this.field2712).field770;
    }
}
