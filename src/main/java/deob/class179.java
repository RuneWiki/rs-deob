package deob;

@ObfuscatedName("fp")
public class class179 {

    @ObfuscatedName("fp.c")
    public int[] field2902;

    @ObfuscatedName("fp.h")
    public int[] field2899;

    @ObfuscatedName("fp.k")
    public boolean field2900;

    @ObfuscatedName("fp.t")
    public int field2901;

    @ObfuscatedName("fp.g")
    public long field2903;

    @ObfuscatedName("fp.o")
    public long field2908;

    @ObfuscatedName("fp.y")
    public static final int[] field2906 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fp.q")
    public static class193 field2907 = new class193(260);

    @ObfuscatedName("fp.c([I[IZII)V")
    public void method3265(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1033; var6++) {
                    class45 var7 = class45.method91(var6);
                    if (var7 != null && !var7.field1028 && var7.field1027 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2906[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2902 = arg0;
        this.field2899 = arg1;
        this.field2900 = arg2;
        this.field2901 = arg3;
        this.method3244();
    }

    @ObfuscatedName("fp.h(IZS)V")
    public void method3240(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2900) {
            return;
        }
        int var3 = this.field2902[field2906[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1033) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1033 - 1;
                }
            }
            var4 = class45.method91(var3);
        } while (var4 == null || var4.field1028 || arg0 + (this.field2900 ? 7 : 0) != var4.field1027);
        this.field2902[field2906[arg0]] = var3 + 256;
        this.method3244();
    }

    @ObfuscatedName("fp.k(IZI)V")
    public void method3248(int arg0, boolean arg1) {
        int var3 = this.field2899[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2905[arg0].length) {
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
                    var3 = Statics.field2905[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2899[arg0] = var3;
        this.method3244();
    }

    @ObfuscatedName("fp.t(ZI)V")
    public void method3239(boolean arg0) {
        if (this.field2900 != arg0) {
            this.method3265((int[]) null, this.field2899, arg0, -1);
        }
    }

    @ObfuscatedName("fp.g(Ldf;B)V")
    public void method3274(class119 arg0) {
        arg0.method2276(this.field2900 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2902[field2906[var2]];
            if (var3 == 0) {
                arg0.method2276(-1);
            } else {
                arg0.method2276(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2276(this.field2899[var4]);
        }
    }

    @ObfuscatedName("fp.o(I)V")
    public void method3244() {
        long var1 = this.field2903;
        int var3 = this.field2902[5];
        int var4 = this.field2902[9];
        this.field2902[5] = var4;
        this.field2902[9] = var3;
        this.field2903 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2903 <<= 0x4;
            if (this.field2902[var5] >= 256) {
                this.field2903 += (long) (this.field2902[var5] - 256);
            }
        }
        if (this.field2902[0] >= 256) {
            this.field2903 += (long) (this.field2902[0] - 256 >> 4);
        }
        if (this.field2902[1] >= 256) {
            this.field2903 += (long) (this.field2902[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2903 <<= 0x3;
            this.field2903 += (long) this.field2899[var6];
        }
        this.field2903 <<= 0x1;
        this.field2903 += (long) (this.field2900 ? 1 : 0);
        this.field2902[5] = var3;
        this.field2902[9] = var4;
        if (var1 != 0L && this.field2903 != var1) {
            field2907.method3496(var1);
        }
    }

    @ObfuscatedName("fp.i(Lar;ILar;II)Ldt;")
    public class105 method3245(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2901 != -1) {
            return Statics.method618(this.field2901).method742(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2903;
        int[] var7 = this.field2902;
        if (arg0 != null && (arg0.field999 >= 0 || arg0.field998 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2902[var8];
            }
            if (arg0.field999 >= 0) {
                var5 += (long) (arg0.field999 - this.field2902[5] << 40);
                var7[5] = arg0.field999;
            }
            if (arg0.field998 >= 0) {
                var5 += (long) (arg0.field998 - this.field2902[3] << 48);
                var7[3] = arg0.field998;
            }
        }
        class105 var9 = (class105) field2907.method3485(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method91(var12 - 256).method886()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method971(var12 - 512).method994(this.field2900)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2908 != -1L) {
                    var9 = (class105) field2907.method3485(this.field2908);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class100[] var13 = new class100[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class100 var17 = class45.method91(var16 - 256).method887();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method971(var16 - 512).method995(this.field2900);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2899[var20] < Statics.field2905[var20].length) {
                        var19.method2019(Statics.field2904[var20], Statics.field2905[var20][this.field2899[var20]]);
                    }
                    if (this.field2899[var20] < Statics.field1931[var20].length) {
                        var19.method2019(Statics.field2037[var20], Statics.field1931[var20][this.field2899[var20]]);
                    }
                }
                var9 = var19.method2027(64, 850, -30, -50, -30);
                field2907.method3487(var9, var5);
                this.field2908 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method822(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method845(var9, arg3);
        } else {
            var21 = arg0.method845(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fp.w(S)Lch;")
    public class100 method3246() {
        if (this.field2901 != -1) {
            return Statics.method618(this.field2901).method727();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2902[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method91(var3 - 256).method888()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method971(var3 - 512).method996(this.field2900)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2902[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method91(var7 - 256).method889();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method971(var7 - 512).method1024(this.field2900);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2899[var11] < Statics.field2905[var11].length) {
                var10.method2019(Statics.field2904[var11], Statics.field2905[var11][this.field2899[var11]]);
            }
            if (this.field2899[var11] < Statics.field1931[var11].length) {
                var10.method2019(Statics.field2037[var11], Statics.field1931[var11][this.field2899[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fp.m(B)I")
    public int method3272() {
        return this.field2901 == -1 ? (this.field2902[11] << 5) + (this.field2902[8] << 10) + (this.field2902[0] << 15) + (this.field2899[0] << 25) + (this.field2899[4] << 20) + this.field2902[1] : 305419896 + Statics.method618(this.field2901).field919;
    }

    @ObfuscatedName("cc.r(I)V")
    public static void method1997() {
        field2907.method3488();
    }
}
