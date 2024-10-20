package deob;

@ObfuscatedName("ff")
public class class157 {

    @ObfuscatedName("ff.g")
    public int[] field2679;

    @ObfuscatedName("ff.v")
    public int[] field2673;

    @ObfuscatedName("ff.z")
    public boolean field2674;

    @ObfuscatedName("ff.h")
    public int field2682;

    @ObfuscatedName("ff.k")
    public long field2676;

    @ObfuscatedName("ff.l")
    public long field2672;

    @ObfuscatedName("ff.a")
    public static final int[] field2680 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ff.i")
    public static class171 field2681 = new class171(260);

    @ObfuscatedName("ff.g([I[IZII)V")
    public void method2935(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field939; var6++) {
                    class40 var7 = class40.method2088(var6);
                    if (var7 != null && !var7.field937 && var7.field948 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2680[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2679 = arg0;
        this.field2673 = arg1;
        this.field2674 = arg2;
        this.field2682 = arg3;
        this.method2943();
    }

    @ObfuscatedName("ff.v(IZI)V")
    public void method2912(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2674) {
            return;
        }
        int var3 = this.field2679[field2680[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field939) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field939 - 1;
                }
            }
            var4 = class40.method2088(var3);
        } while (var4 == null || var4.field937 || var4.field948 != (this.field2674 ? 7 : 0) + arg0);
        this.field2679[field2680[arg0]] = var3 + 256;
        this.method2943();
    }

    @ObfuscatedName("ff.z(IZB)V")
    public void method2938(int arg0, boolean arg1) {
        int var3 = this.field2673[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2678[arg0].length) {
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
                    var3 = Statics.field2678[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2673[arg0] = var3;
        this.method2943();
    }

    @ObfuscatedName("ff.h(ZB)V")
    public void method2913(boolean arg0) {
        if (this.field2674 != arg0) {
            this.method2935((int[]) null, this.field2673, arg0, -1);
        }
    }

    @ObfuscatedName("ff.k(Ldm;I)V")
    public void method2914(class107 arg0) {
        arg0.method2126(this.field2674 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2679[field2680[var2]];
            if (var3 == 0) {
                arg0.method2126(-1);
            } else {
                arg0.method2126(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2126(this.field2673[var4]);
        }
    }

    @ObfuscatedName("ff.l(B)V")
    public void method2943() {
        long var1 = this.field2676;
        int var3 = this.field2679[5];
        int var4 = this.field2679[9];
        this.field2679[5] = var4;
        this.field2679[9] = var3;
        this.field2676 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2676 <<= 0x4;
            if (this.field2679[var5] >= 256) {
                this.field2676 += (long) (this.field2679[var5] - 256);
            }
        }
        if (this.field2679[0] >= 256) {
            this.field2676 += (long) (this.field2679[0] - 256 >> 4);
        }
        if (this.field2679[1] >= 256) {
            this.field2676 += (long) (this.field2679[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2676 <<= 0x3;
            this.field2676 += (long) this.field2673[var6];
        }
        this.field2676 <<= 0x1;
        this.field2676 += (long) (this.field2674 ? 1 : 0);
        this.field2679[5] = var3;
        this.field2679[9] = var4;
        if (var1 != 0L && this.field2676 != var1) {
            field2681.method3168(var1);
        }
    }

    @ObfuscatedName("ff.e(Lao;ILao;II)Lce;")
    public class98 method2916(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2682 != -1) {
            return class35.method143(this.field2682).method616(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2676;
        int[] var7 = this.field2679;
        if (arg0 != null && (arg0.field909 >= 0 || arg0.field912 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2679[var8];
            }
            if (arg0.field909 >= 0) {
                var5 += (long) (arg0.field909 - this.field2679[5] << 40);
                var7[5] = arg0.field909;
            }
            if (arg0.field912 >= 0) {
                var5 += (long) (arg0.field912 - this.field2679[3] << 48);
                var7[3] = arg0.field912;
            }
        }
        class98 var9 = (class98) field2681.method3166(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method2088(var12 - 256).method802()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method744(var12 - 512).method893(this.field2674)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2672 != -1L) {
                    var9 = (class98) field2681.method3166(this.field2672);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class93[] var13 = new class93[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class93 var17 = class40.method2088(var16 - 256).method798();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method744(var16 - 512).method870(this.field2674);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2673[var20] < Statics.field2678[var20].length) {
                        var19.method1916(Statics.field2663[var20], Statics.field2678[var20][this.field2673[var20]]);
                    }
                    if (this.field2673[var20] < Statics.field2677[var20].length) {
                        var19.method1916(Statics.field567[var20], Statics.field2677[var20][this.field2673[var20]]);
                    }
                }
                var9 = var19.method1963(64, 850, -30, -50, -30);
                field2681.method3167(var9, var5);
                this.field2672 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method747(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method711(var9, arg3);
        } else {
            var21 = arg0.method711(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ff.j(B)Lcv;")
    public class93 method2919() {
        if (this.field2682 != -1) {
            return class35.method143(this.field2682).method614();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2679[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method2088(var3 - 256).method775()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method744(var3 - 512).method871(this.field2674)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2679[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method2088(var7 - 256).method776();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method744(var7 - 512).method877(this.field2674);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2673[var11] < Statics.field2678[var11].length) {
                var10.method1916(Statics.field2663[var11], Statics.field2678[var11][this.field2673[var11]]);
            }
            if (this.field2673[var11] < Statics.field2677[var11].length) {
                var10.method1916(Statics.field567[var11], Statics.field2677[var11][this.field2673[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ff.n(I)I")
    public int method2911() {
        return this.field2682 == -1 ? (this.field2679[11] << 5) + (this.field2679[8] << 10) + (this.field2679[0] << 15) + (this.field2673[0] << 25) + (this.field2673[4] << 20) + this.field2679[1] : 305419896 + class35.method143(this.field2682).field793;
    }
}
