package deob;

@ObfuscatedName("fw")
public class class160 {

    @ObfuscatedName("fw.c")
    public int[] field2688;

    @ObfuscatedName("fw.j")
    public int[] field2682;

    @ObfuscatedName("fw.y")
    public boolean field2683;

    @ObfuscatedName("fw.r")
    public int field2684;

    @ObfuscatedName("fw.f")
    public long field2681;

    @ObfuscatedName("fw.l")
    public long field2689;

    @ObfuscatedName("fw.i")
    public static final int[] field2694 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fw.x")
    public static class174 field2685 = new class174(260);

    @ObfuscatedName("fw.c([I[IZII)V")
    public void method2946(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field944; var6++) {
                    class41 var7 = class41.method2416(var6);
                    if (var7 != null && !var7.field942 && var7.field946 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2694[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2688 = arg0;
        this.field2682 = arg1;
        this.field2683 = arg2;
        this.field2684 = arg3;
        this.method2951();
    }

    @ObfuscatedName("fw.j(IZB)V")
    public void method2945(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2683) {
            return;
        }
        int var3 = this.field2688[field2694[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class41 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field944) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field944 - 1;
                }
            }
            var4 = class41.method2416(var3);
        } while (var4 == null || var4.field942 || var4.field946 != arg0 + (this.field2683 ? 7 : 0));
        this.field2688[field2694[arg0]] = var3 + 256;
        this.method2951();
    }

    @ObfuscatedName("fw.y(IZI)V")
    public void method2948(int arg0, boolean arg1) {
        int var3 = this.field2682[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2406[arg0].length) {
                    var3 = 0;
                }
            } while (!class156.method1898(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2406[arg0].length - 1;
                }
            } while (!class156.method1898(arg0, var3));
        }
        this.field2682[arg0] = var3;
        this.method2951();
    }

    @ObfuscatedName("fw.r(ZB)V")
    public void method2949(boolean arg0) {
        if (this.field2683 != arg0) {
            this.method2946((int[]) null, this.field2682, arg0, -1);
        }
    }

    @ObfuscatedName("fw.f(Ldx;I)V")
    public void method2950(class108 arg0) {
        arg0.method2120(this.field2683 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2688[field2694[var2]];
            if (var3 == 0) {
                arg0.method2120(-1);
            } else {
                arg0.method2120(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2120(this.field2682[var4]);
        }
    }

    @ObfuscatedName("fw.l(I)V")
    public void method2951() {
        long var1 = this.field2681;
        int var3 = this.field2688[5];
        int var4 = this.field2688[9];
        this.field2688[5] = var4;
        this.field2688[9] = var3;
        this.field2681 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2681 <<= 0x4;
            if (this.field2688[var5] >= 256) {
                this.field2681 += (long) (this.field2688[var5] - 256);
            }
        }
        if (this.field2688[0] >= 256) {
            this.field2681 += (long) (this.field2688[0] - 256 >> 4);
        }
        if (this.field2688[1] >= 256) {
            this.field2681 += (long) (this.field2688[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2681 <<= 0x3;
            this.field2681 += (long) this.field2682[var6];
        }
        this.field2681 <<= 0x1;
        this.field2681 += (long) (this.field2683 ? 1 : 0);
        this.field2688[5] = var3;
        this.field2688[9] = var4;
        if (var1 != 0L && this.field2681 != var1) {
            field2685.method3171(var1);
        }
    }

    @ObfuscatedName("fw.b(Lad;ILad;II)Lcl;")
    public class99 method2952(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field2684 != -1) {
            return class36.method2072(this.field2684).method602(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2681;
        int[] var7 = this.field2688;
        if (arg0 != null && (arg0.field912 >= 0 || arg0.field904 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2688[var8];
            }
            if (arg0.field912 >= 0) {
                var5 += (long) (arg0.field912 - this.field2688[5] << 40);
                var7[5] = arg0.field912;
            }
            if (arg0.field904 >= 0) {
                var5 += (long) (arg0.field904 - this.field2688[3] << 48);
                var7[3] = arg0.field904;
            }
        }
        class99 var9 = (class99) field2685.method3178(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class41.method2416(var12 - 256).method750()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class46.method114(var12 - 512).method840(this.field2683)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2689 != -1L) {
                    var9 = (class99) field2685.method3178(this.field2689);
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
                        class94 var17 = class41.method2416(var16 - 256).method768();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class94 var18 = class46.method114(var16 - 512).method841(this.field2683);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class94 var19 = new class94(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2682[var20] < Statics.field2406[var20].length) {
                        var19.method1914(Statics.field2080[var20], Statics.field2406[var20][this.field2682[var20]]);
                    }
                    if (this.field2682[var20] < Statics.field2686[var20].length) {
                        var19.method1914(Statics.field702[var20], Statics.field2686[var20][this.field2682[var20]]);
                    }
                }
                var9 = var19.method1922(64, 850, -30, -50, -30);
                field2685.method3167(var9, var5);
                this.field2689 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class99 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method701(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method695(var9, arg3);
        } else {
            var21 = arg0.method695(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fw.k(B)Lce;")
    public class94 method2953() {
        if (this.field2684 != -1) {
            return class36.method2072(this.field2684).method616();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2688[var2];
            if (var3 >= 256 && var3 < 512 && !class41.method2416(var3 - 256).method752()) {
                var1 = true;
            }
            if (var3 >= 512 && !class46.method114(var3 - 512).method842(this.field2683)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class94[] var4 = new class94[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2688[var6];
            if (var7 >= 256 && var7 < 512) {
                class94 var8 = class41.method2416(var7 - 256).method753();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class94 var9 = class46.method114(var7 - 512).method858(this.field2683);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class94 var10 = new class94(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2682[var11] < Statics.field2406[var11].length) {
                var10.method1914(Statics.field2080[var11], Statics.field2406[var11][this.field2682[var11]]);
            }
            if (this.field2682[var11] < Statics.field2686[var11].length) {
                var10.method1914(Statics.field702[var11], Statics.field2686[var11][this.field2682[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fw.g(B)I")
    public int method2954() {
        return this.field2684 == -1 ? (this.field2688[11] << 5) + (this.field2688[8] << 10) + (this.field2688[0] << 15) + (this.field2682[4] << 20) + (this.field2682[0] << 25) + this.field2688[1] : 305419896 + class36.method2072(this.field2684).field819;
    }
}
