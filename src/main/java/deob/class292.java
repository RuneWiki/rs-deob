package deob;

@ObfuscatedName("kt")
public class class292 {

    @ObfuscatedName("kt.c")
    public int[] field3348;

    @ObfuscatedName("kt.v")
    public int[] field3339;

    @ObfuscatedName("kt.q")
    public boolean field3336;

    @ObfuscatedName("kt.f")
    public int field3337;

    @ObfuscatedName("kt.j")
    public long field3338;

    @ObfuscatedName("kt.e")
    public long field3346;

    @ObfuscatedName("kt.g")
    public class168[] field3340;

    @ObfuscatedName("kt.w")
    public boolean field3342 = false;

    @ObfuscatedName("kt.z")
    public static final int[] field3345 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("kt.r")
    public static class256 field3341 = new class256(260);

    @ObfuscatedName("kt.c([I[Lfy;Z[IZII)V")
    public void method5036(int[] arg0, class168[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field3340 = arg1;
        this.field3342 = arg2;
        this.method5068(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("kt.v([I[IZII)V")
    public void method5068(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1856; var6++) {
                    class173 var7 = class173.method1870(var6);
                    if (var7 != null && !var7.field1867 && var5 + (arg2 ? 7 : 0) == var7.field1859) {
                        arg0[field3345[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3348 = arg0;
        this.field3339 = arg1;
        this.field3336 = arg2;
        this.field3337 = arg3;
        this.method5042();
    }

    @ObfuscatedName("kt.q(IZI)V")
    public void method5038(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3336) {
            return;
        }
        int var3 = this.field3348[field3345[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class173 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1856) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1856 - 1;
                }
            }
            var4 = class173.method1870(var3);
        } while (var4 == null || var4.field1867 || (this.field3336 ? 7 : 0) + arg0 != var4.field1859);
        this.field3348[field3345[arg0]] = var3 + 256;
        this.method5042();
    }

    @ObfuscatedName("kt.f(IZI)V")
    public void method5043(int arg0, boolean arg1) {
        int var3 = this.field3339[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field3343[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3343[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3339[arg0] = var3;
        this.method5042();
    }

    @ObfuscatedName("kt.j(ZI)V")
    public void method5040(boolean arg0) {
        if (this.field3336 != arg0) {
            this.method5068((int[]) null, this.field3339, arg0, -1);
        }
    }

    @ObfuscatedName("kt.e(Lqt;I)V")
    public void method5041(class443 arg0) {
        arg0.method7031(this.field3336 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3348[field3345[var2]];
            if (var3 == 0) {
                arg0.method7031(-1);
            } else {
                arg0.method7031(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method7031(this.field3339[var4]);
        }
    }

    @ObfuscatedName("kt.g(I)V")
    public void method5042() {
        long var1 = this.field3338;
        int var3 = this.field3348[5];
        int var4 = this.field3348[9];
        this.field3348[5] = var4;
        this.field3348[9] = var3;
        this.field3338 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3338 <<= 0x4;
            if (this.field3348[var5] >= 256) {
                this.field3338 += (long) (this.field3348[var5] - 256);
            }
        }
        if (this.field3348[0] >= 256) {
            this.field3338 += (long) (this.field3348[0] - 256 >> 4);
        }
        if (this.field3348[1] >= 256) {
            this.field3338 += (long) (this.field3348[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3338 <<= 0x3;
            this.field3338 += (long) this.field3339[var6];
        }
        this.field3338 <<= 0x1;
        this.field3338 += (long) (this.field3336 ? 1 : 0);
        this.field3348[5] = var3;
        this.field3348[9] = var4;
        if (var1 != 0L && this.field3338 != var1 || this.field3342) {
            field3341.method4692(var1);
        }
    }

    @ObfuscatedName("kt.w(Lgc;ILgc;II)Lhy;")
    public class211 method5064(class190 arg0, int arg1, class190 arg2, int arg3) {
        if (this.field3337 != -1) {
            return class178.method2492(this.field3337).method3176(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field3338;
        int[] var7 = this.field3348;
        if (arg0 != null && (arg0.field2185 >= 0 || arg0.field2186 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3348[var8];
            }
            if (arg0.field2185 >= 0) {
                var5 += (long) (arg0.field2185 - this.field3348[5] << 40);
                var7[5] = arg0.field2185;
            }
            if (arg0.field2186 >= 0) {
                var5 += (long) (arg0.field2186 - this.field3348[3] << 48);
                var7[3] = arg0.field2186;
            }
        }
        class211 var9 = (class211) field3341.method4691(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class173.method1870(var12 - 256).method3096()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class188.method3161(var12 - 512).method3450(this.field3336)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3346 != -1L) {
                    var9 = (class211) field3341.method4691(this.field3346);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class196[] var13 = new class196[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class196 var17 = class173.method1870(var16 - 256).method3100();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class188 var18 = class188.method3161(var16 - 512);
                        class196 var19 = var18.method3396(this.field3336);
                        if (var19 != null) {
                            if (this.field3340 != null) {
                                class168 var20 = this.field3340[var15];
                                if (var20 != null) {
                                    if (var20.field1815 != null && var18.field2115 != null && var18.field2105.length == var20.field1815.length) {
                                        for (int var21 = 0; var21 < var18.field2115.length; var21++) {
                                            var19.method3606(var18.field2105[var21], var20.field1815[var21]);
                                        }
                                    }
                                    if (var20.field1816 != null && var18.field2106 != null && var18.field2107.length == var20.field1816.length) {
                                        for (int var22 = 0; var22 < var18.field2106.length; var22++) {
                                            var19.method3626(var18.field2107[var22], var20.field1816[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class196 var23 = new class196(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3339[var24] < Statics.field3343[var24].length) {
                        var23.method3606(Statics.field3344[var24], Statics.field3343[var24][this.field3339[var24]]);
                    }
                    if (this.field3339[var24] < Statics.field3335[var24].length) {
                        var23.method3606(Statics.field2794[var24], Statics.field3335[var24][this.field3339[var24]]);
                    }
                }
                var9 = var23.method3658(64, 850, -30, -50, -30);
                field3341.method4693(var9, var5);
                this.field3346 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class211 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method3540(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3531(var9, arg3);
        } else {
            var25 = arg0.method3531(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("kt.y(B)Lgw;")
    public class196 method5057() {
        if (this.field3337 != -1) {
            return class178.method2492(this.field3337).method3196();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3348[var2];
            if (var3 >= 256 && var3 < 512 && !class173.method1870(var3 - 256).method3098()) {
                var1 = true;
            }
            if (var3 >= 512 && !class188.method3161(var3 - 512).method3421(this.field3336)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class196[] var4 = new class196[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3348[var6];
            if (var7 >= 256 && var7 < 512) {
                class196 var8 = class173.method1870(var7 - 256).method3099();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class196 var9 = class188.method3161(var7 - 512).method3398(this.field3336);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class196 var10 = new class196(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3339[var11] < Statics.field3343[var11].length) {
                var10.method3606(Statics.field3344[var11], Statics.field3343[var11][this.field3339[var11]]);
            }
            if (this.field3339[var11] < Statics.field3335[var11].length) {
                var10.method3606(Statics.field2794[var11], Statics.field3335[var11][this.field3339[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("kt.i(I)I")
    public int method5045() {
        return this.field3337 == -1 ? (this.field3348[11] << 5) + (this.field3348[8] << 10) + (this.field3348[0] << 15) + (this.field3339[4] << 20) + (this.field3339[0] << 25) + this.field3348[1] : 305419896 + class178.method2492(this.field3337).field1938;
    }

    @ObfuscatedName("u.s(B)V")
    public static void method143() {
        field3341.method4695();
    }
}
