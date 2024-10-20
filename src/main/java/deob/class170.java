package deob;

@ObfuscatedName("fx")
public class class170 {

    @ObfuscatedName("fx.t")
    public int[] field2807;

    @ObfuscatedName("fx.b")
    public int[] field2802;

    @ObfuscatedName("fx.p")
    public boolean field2814;

    @ObfuscatedName("fx.e")
    public int field2805;

    @ObfuscatedName("fx.i")
    public long field2806;

    @ObfuscatedName("fx.o")
    public long field2812;

    @ObfuscatedName("fx.v")
    public static final int[] field2810 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fx.a")
    public static class184 field2811 = new class184(260);

    @ObfuscatedName("fx.t([I[IZIB)V")
    public void method3086(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field961; var6++) {
                    class42 var7 = class42.method181(var6);
                    if (var7 != null && !var7.field969 && var5 + (arg2 ? 7 : 0) == var7.field959) {
                        arg0[field2810[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2807 = arg0;
        this.field2802 = arg1;
        this.field2814 = arg2;
        this.field2805 = arg3;
        this.method3091();
    }

    @ObfuscatedName("fx.b(IZB)V")
    public void method3112(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2814) {
            return;
        }
        int var3 = this.field2807[field2810[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class42 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field961) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field961 - 1;
                }
            }
            var4 = class42.method181(var3);
        } while (var4 == null || var4.field969 || var4.field959 != (this.field2814 ? 7 : 0) + arg0);
        this.field2807[field2810[arg0]] = var3 + 256;
        this.method3091();
    }

    @ObfuscatedName("fx.p(IZI)V")
    public void method3088(int arg0, boolean arg1) {
        int var3 = this.field2802[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2587[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 == 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2587[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2802[arg0] = var3;
        this.method3091();
    }

    @ObfuscatedName("fx.e(ZI)V")
    public void method3085(boolean arg0) {
        if (this.field2814 != arg0) {
            this.method3086((int[]) null, this.field2802, arg0, -1);
        }
    }

    @ObfuscatedName("fx.i(Ldc;I)V")
    public void method3090(class111 arg0) {
        arg0.method2158(this.field2814 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2807[field2810[var2]];
            if (var3 == 0) {
                arg0.method2158(-1);
            } else {
                arg0.method2158(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2158(this.field2802[var4]);
        }
    }

    @ObfuscatedName("fx.o(S)V")
    public void method3091() {
        long var1 = this.field2806;
        int var3 = this.field2807[5];
        int var4 = this.field2807[9];
        this.field2807[5] = var4;
        this.field2807[9] = var3;
        this.field2806 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2806 <<= 0x4;
            if (this.field2807[var5] >= 256) {
                this.field2806 += (long) (this.field2807[var5] - 256);
            }
        }
        if (this.field2807[0] >= 256) {
            this.field2806 += (long) (this.field2807[0] - 256 >> 4);
        }
        if (this.field2807[1] >= 256) {
            this.field2806 += (long) (this.field2807[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2806 <<= 0x3;
            this.field2806 += (long) this.field2802[var6];
        }
        this.field2806 <<= 0x1;
        this.field2806 += (long) (this.field2814 ? 1 : 0);
        this.field2807[5] = var3;
        this.field2807[9] = var4;
        if (var1 != 0L && this.field2806 != var1) {
            field2811.method3340(var1);
        }
    }

    @ObfuscatedName("fx.f(Laj;ILaj;IS)Lcs;")
    public class100 method3092(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field2805 != -1) {
            return class37.method2676(this.field2805).method689(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2806;
        int[] var7 = this.field2807;
        if (arg0 != null && (arg0.field926 >= 0 || arg0.field927 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2807[var8];
            }
            if (arg0.field926 >= 0) {
                var5 += (long) (arg0.field926 - this.field2807[5] << 40);
                var7[5] = arg0.field926;
            }
            if (arg0.field927 >= 0) {
                var5 += (long) (arg0.field927 - this.field2807[3] << 48);
                var7[3] = arg0.field927;
            }
        }
        class100 var9 = (class100) field2811.method3339(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class42.method181(var12 - 256).method844()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class47.method2(var12 - 512).method937(this.field2814)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2812 != -1L) {
                    var9 = (class100) field2811.method3339(this.field2812);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class95[] var13 = new class95[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class95 var17 = class42.method181(var16 - 256).method849();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class95 var18 = class47.method2(var16 - 512).method967(this.field2814);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class95 var19 = new class95(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2802[var20] < Statics.field2587[var20].length) {
                        var19.method1995(Statics.field2772[var20], Statics.field2587[var20][this.field2802[var20]]);
                    }
                    if (this.field2802[var20] < Statics.field2803[var20].length) {
                        var19.method1995(Statics.field2808[var20], Statics.field2803[var20][this.field2802[var20]]);
                    }
                }
                var9 = var19.method1950(64, 850, -30, -50, -30);
                field2811.method3341(var9, var5);
                this.field2812 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class100 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method794(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method787(var9, arg3);
        } else {
            var21 = arg0.method787(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fx.d(I)Lcg;")
    public class95 method3107() {
        if (this.field2805 != -1) {
            return class37.method2676(this.field2805).method690();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2807[var2];
            if (var3 >= 256 && var3 < 512 && !class42.method181(var3 - 256).method874()) {
                var1 = true;
            }
            if (var3 >= 512 && !class47.method2(var3 - 512).method939(this.field2814)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class95[] var4 = new class95[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2807[var6];
            if (var7 >= 256 && var7 < 512) {
                class95 var8 = class42.method181(var7 - 256).method847();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class95 var9 = class47.method2(var7 - 512).method941(this.field2814);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class95 var10 = new class95(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2802[var11] < Statics.field2587[var11].length) {
                var10.method1995(Statics.field2772[var11], Statics.field2587[var11][this.field2802[var11]]);
            }
            if (this.field2802[var11] < Statics.field2803[var11].length) {
                var10.method1995(Statics.field2808[var11], Statics.field2803[var11][this.field2802[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fx.j(I)I")
    public int method3094() {
        return this.field2805 == -1 ? (this.field2807[11] << 5) + (this.field2807[8] << 10) + (this.field2807[0] << 15) + (this.field2802[4] << 20) + (this.field2802[0] << 25) + this.field2807[1] : 305419896 + class37.method2676(this.field2805).field810;
    }
}
