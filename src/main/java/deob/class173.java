package deob;

@ObfuscatedName("fp")
public class class173 {

    @ObfuscatedName("fp.j")
    public int[] field2848;

    @ObfuscatedName("fp.y")
    public int[] field2839;

    @ObfuscatedName("fp.z")
    public boolean field2840;

    @ObfuscatedName("fp.l")
    public int field2841;

    @ObfuscatedName("fp.w")
    public long field2842;

    @ObfuscatedName("fp.d")
    public long field2850;

    @ObfuscatedName("fp.u")
    public static final int[] field2838 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fp.m")
    public static class187 field2849 = new class187(260);

    @ObfuscatedName("fp.j([I[IZIB)V")
    public void method3192(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2114; var6++) {
                    class43 var7 = class43.method2730(var6);
                    if (var7 != null && !var7.field1012 && (arg2 ? 7 : 0) + var5 == var7.field1013) {
                        arg0[field2838[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2848 = arg0;
        this.field2839 = arg1;
        this.field2840 = arg2;
        this.field2841 = arg3;
        this.method3197();
    }

    @ObfuscatedName("fp.y(IZI)V")
    public void method3193(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2840) {
            return;
        }
        int var3 = this.field2848[field2838[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class43 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2114) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2114 - 1;
                }
            }
            var4 = class43.method2730(var3);
        } while (var4 == null || var4.field1012 || var4.field1013 != arg0 + (this.field2840 ? 7 : 0));
        this.field2848[field2838[arg0]] = var3 + 256;
        this.method3197();
    }

    @ObfuscatedName("fp.z(IZI)V")
    public void method3194(int arg0, boolean arg1) {
        int var3 = this.field2839[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2845[arg0].length) {
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
                    var3 = Statics.field2845[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2839[arg0] = var3;
        this.method3197();
    }

    @ObfuscatedName("fp.l(ZI)V")
    public void method3191(boolean arg0) {
        if (this.field2840 != arg0) {
            this.method3192((int[]) null, this.field2839, arg0, -1);
        }
    }

    @ObfuscatedName("fp.w(Lde;I)V")
    public void method3196(class114 arg0) {
        arg0.method2307(this.field2840 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2848[field2838[var2]];
            if (var3 == 0) {
                arg0.method2307(-1);
            } else {
                arg0.method2307(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2307(this.field2839[var4]);
        }
    }

    @ObfuscatedName("fp.d(I)V")
    public void method3197() {
        long var1 = this.field2842;
        int var3 = this.field2848[5];
        int var4 = this.field2848[9];
        this.field2848[5] = var4;
        this.field2848[9] = var3;
        this.field2842 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2842 <<= 0x4;
            if (this.field2848[var5] >= 256) {
                this.field2842 += (long) (this.field2848[var5] - 256);
            }
        }
        if (this.field2848[0] >= 256) {
            this.field2842 += (long) (this.field2848[0] - 256 >> 4);
        }
        if (this.field2848[1] >= 256) {
            this.field2842 += (long) (this.field2848[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2842 <<= 0x3;
            this.field2842 += (long) this.field2839[var6];
        }
        this.field2842 <<= 0x1;
        this.field2842 += (long) (this.field2840 ? 1 : 0);
        this.field2848[5] = var3;
        this.field2848[9] = var4;
        if (var1 != 0L && this.field2842 != var1) {
            field2849.method3439(var1);
        }
    }

    @ObfuscatedName("fp.f(Lax;ILax;IB)Lcw;")
    public class103 method3198(class41 arg0, int arg1, class41 arg2, int arg3) {
        if (this.field2841 != -1) {
            return class38.method564(this.field2841).method748(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2842;
        int[] var7 = this.field2848;
        if (arg0 != null && (arg0.field976 >= 0 || arg0.field977 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2848[var8];
            }
            if (arg0.field976 >= 0) {
                var5 += (long) (arg0.field976 - this.field2848[5] << 40);
                var7[5] = arg0.field976;
            }
            if (arg0.field977 >= 0) {
                var5 += (long) (arg0.field977 - this.field2848[3] << 48);
                var7[3] = arg0.field977;
            }
        }
        class103 var9 = (class103) field2849.method3432(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class43.method2730(var12 - 256).method905()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class50.method1088(var12 - 512).method1040(this.field2840)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2850 != -1L) {
                    var9 = (class103) field2849.method3432(this.field2850);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class98[] var13 = new class98[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class98 var17 = class43.method2730(var16 - 256).method909();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class98 var18 = class50.method1088(var16 - 512).method1033(this.field2840);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class98 var19 = new class98(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2839[var20] < Statics.field2845[var20].length) {
                        var19.method2140(Statics.field2844[var20], Statics.field2845[var20][this.field2839[var20]]);
                    }
                    if (this.field2839[var20] < Statics.field2846[var20].length) {
                        var19.method2140(Statics.field2068[var20], Statics.field2846[var20][this.field2839[var20]]);
                    }
                }
                var9 = var19.method2094(64, 850, -30, -50, -30);
                field2849.method3434(var9, var5);
                this.field2850 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class103 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method854(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method851(var9, arg3);
        } else {
            var21 = arg0.method851(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fp.i(I)Lcd;")
    public class98 method3199() {
        if (this.field2841 != -1) {
            return class38.method564(this.field2841).method736();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2848[var2];
            if (var3 >= 256 && var3 < 512 && !class43.method2730(var3 - 256).method910()) {
                var1 = true;
            }
            if (var3 >= 512 && !class50.method1088(var3 - 512).method1044(this.field2840)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class98[] var4 = new class98[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2848[var6];
            if (var7 >= 256 && var7 < 512) {
                class98 var8 = class43.method2730(var7 - 256).method911();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class98 var9 = class50.method1088(var7 - 512).method1043(this.field2840);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class98 var10 = new class98(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2839[var11] < Statics.field2845[var11].length) {
                var10.method2140(Statics.field2844[var11], Statics.field2845[var11][this.field2839[var11]]);
            }
            if (this.field2839[var11] < Statics.field2846[var11].length) {
                var10.method2140(Statics.field2068[var11], Statics.field2846[var11][this.field2839[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fp.a(I)I")
    public int method3200() {
        return this.field2841 == -1 ? (this.field2848[11] << 5) + (this.field2848[8] << 10) + (this.field2848[0] << 15) + (this.field2839[0] << 25) + (this.field2839[4] << 20) + this.field2848[1] : 305419896 + class38.method564(this.field2841).field866;
    }

    @ObfuscatedName("av.o(I)V")
    public static void method728() {
        field2849.method3435();
    }
}
