package deob;

@ObfuscatedName("jo")
public class class284 {

    @ObfuscatedName("jo.c")
    public int[] field3236;

    @ObfuscatedName("jo.l")
    public int[] field3245;

    @ObfuscatedName("jo.s")
    public boolean field3235;

    @ObfuscatedName("jo.e")
    public int field3238;

    @ObfuscatedName("jo.r")
    public long field3239;

    @ObfuscatedName("jo.o")
    public long field3240;

    @ObfuscatedName("jo.i")
    public class161[] field3243;

    @ObfuscatedName("jo.w")
    public boolean field3242 = false;

    @ObfuscatedName("jo.h")
    public static final int[] field3244 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("jo.q")
    public static class249 field3241 = new class249(260);

    @ObfuscatedName("jo.c([I[Lff;Z[IZII)V")
    public void method4830(int[] arg0, class161[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field3243 = arg1;
        this.field3242 = arg2;
        this.method4856(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("jo.l([I[IZIB)V")
    public void method4856(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1371; var6++) {
                    class166 var7 = class166.method2735(var6);
                    if (var7 != null && !var7.field1797 && var7.field1796 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field3244[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3236 = arg0;
        this.field3245 = arg1;
        this.field3235 = arg2;
        this.field3238 = arg3;
        this.method4865();
    }

    @ObfuscatedName("jo.s(IZB)V")
    public void method4832(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3235) {
            return;
        }
        int var3 = this.field3236[field3244[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class166 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1371) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1371 - 1;
                }
            }
            var4 = class166.method2735(var3);
        } while (var4 == null || var4.field1797 || var4.field1796 != (this.field3235 ? 7 : 0) + arg0);
        this.field3236[field3244[arg0]] = var3 + 256;
        this.method4865();
    }

    @ObfuscatedName("jo.e(IZI)V")
    public void method4862(int arg0, boolean arg1) {
        int var3 = this.field3245[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field9[arg0].length) {
                    var3 = 0;
                }
            } while (!class285.method2389(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field9[arg0].length - 1;
                }
            } while (!class285.method2389(arg0, var3));
        }
        this.field3245[arg0] = var3;
        this.method4865();
    }

    @ObfuscatedName("jo.r(ZB)V")
    public void method4833(boolean arg0) {
        if (this.field3235 != arg0) {
            this.method4856((int[]) null, this.field3245, arg0, -1);
        }
    }

    @ObfuscatedName("jo.o(Lpi;I)V")
    public void method4835(class421 arg0) {
        arg0.method6644(this.field3235 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3236[field3244[var2]];
            if (var3 == 0) {
                arg0.method6644(-1);
            } else {
                arg0.method6644(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method6644(this.field3245[var4]);
        }
    }

    @ObfuscatedName("jo.i(I)V")
    public void method4865() {
        long var1 = this.field3239;
        int var3 = this.field3236[5];
        int var4 = this.field3236[9];
        this.field3236[5] = var4;
        this.field3236[9] = var3;
        this.field3239 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3239 <<= 0x4;
            if (this.field3236[var5] >= 256) {
                this.field3239 += (long) (this.field3236[var5] - 256);
            }
        }
        if (this.field3236[0] >= 256) {
            this.field3239 += (long) (this.field3236[0] - 256 >> 4);
        }
        if (this.field3236[1] >= 256) {
            this.field3239 += (long) (this.field3236[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3239 <<= 0x3;
            this.field3239 += (long) this.field3245[var6];
        }
        this.field3239 <<= 0x1;
        this.field3239 += (long) (this.field3235 ? 1 : 0);
        this.field3236[5] = var3;
        this.field3236[9] = var4;
        if (var1 != 0L && this.field3239 != var1 || this.field3242) {
            field3241.method4473(var1);
        }
    }

    @ObfuscatedName("jo.w(Lgm;ILgm;IB)Lgf;")
    public class204 method4837(class183 arg0, int arg1, class183 arg2, int arg3) {
        if (this.field3238 != -1) {
            return class171.method2378(this.field3238).method2971(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field3239;
        int[] var7 = this.field3236;
        if (arg0 != null && (arg0.field2105 >= 0 || arg0.field2099 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3236[var8];
            }
            if (arg0.field2105 >= 0) {
                var5 += (long) (arg0.field2105 - this.field3236[5] << 40);
                var7[5] = arg0.field2105;
            }
            if (arg0.field2099 >= 0) {
                var5 += (long) (arg0.field2099 - this.field3236[3] << 48);
                var7[3] = arg0.field2099;
            }
        }
        class204 var9 = (class204) field3241.method4472(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class166.method2735(var12 - 256).method2896()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class181.method1538(var12 - 512).method3202(this.field3235)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3240 != -1L) {
                    var9 = (class204) field3241.method4472(this.field3240);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class189[] var13 = new class189[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class189 var17 = class166.method2735(var16 - 256).method2912();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class181 var18 = class181.method1538(var16 - 512);
                        class189 var19 = var18.method3203(this.field3235);
                        if (var19 != null) {
                            if (this.field3243 != null) {
                                class161 var20 = this.field3243[var15];
                                if (var20 != null) {
                                    if (var20.field1746 != null && var18.field2029 != null && var18.field2030.length == var20.field1746.length) {
                                        for (int var21 = 0; var21 < var18.field2029.length; var21++) {
                                            var19.method3380(var18.field2030[var21], var20.field1746[var21]);
                                        }
                                    }
                                    if (var20.field1747 != null && var18.field2031 != null && var18.field2067.length == var20.field1747.length) {
                                        for (int var22 = 0; var22 < var18.field2031.length; var22++) {
                                            var19.method3404(var18.field2067[var22], var20.field1747[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class189 var23 = new class189(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3245[var24] < Statics.field9[var24].length) {
                        var23.method3380(Statics.field3237[var24], Statics.field9[var24][this.field3245[var24]]);
                    }
                    if (this.field3245[var24] < Statics.field41[var24].length) {
                        var23.method3380(Statics.field121[var24], Statics.field41[var24][this.field3245[var24]]);
                    }
                }
                var9 = var23.method3396(64, 850, -30, -50, -30);
                field3241.method4482(var9, var5);
                this.field3240 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class204 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method3281(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3306(var9, arg3);
        } else {
            var25 = arg0.method3306(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("jo.v(I)Lgq;")
    public class189 method4838() {
        if (this.field3238 != -1) {
            return class171.method2378(this.field3238).method2972();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3236[var2];
            if (var3 >= 256 && var3 < 512 && !class166.method2735(var3 - 256).method2901()) {
                var1 = true;
            }
            if (var3 >= 512 && !class181.method1538(var3 - 512).method3193(this.field3235)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class189[] var4 = new class189[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3236[var6];
            if (var7 >= 256 && var7 < 512) {
                class189 var8 = class166.method2735(var7 - 256).method2905();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class189 var9 = class181.method1538(var7 - 512).method3205(this.field3235);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class189 var10 = new class189(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3245[var11] < Statics.field9[var11].length) {
                var10.method3380(Statics.field3237[var11], Statics.field9[var11][this.field3245[var11]]);
            }
            if (this.field3245[var11] < Statics.field41[var11].length) {
                var10.method3380(Statics.field121[var11], Statics.field41[var11][this.field3245[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("jo.a(B)I")
    public int method4834() {
        return this.field3238 == -1 ? (this.field3236[11] << 5) + (this.field3236[8] << 10) + (this.field3236[0] << 15) + (this.field3245[4] << 20) + (this.field3245[0] << 25) + this.field3236[1] : 305419896 + class171.method2378(this.field3238).field1852;
    }

    @ObfuscatedName("lu.y(B)V")
    public static void method5248() {
        field3241.method4475();
    }
}
