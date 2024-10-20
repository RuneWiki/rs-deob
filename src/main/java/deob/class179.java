package deob;

@ObfuscatedName("fn")
public class class179 {

    @ObfuscatedName("fn.h")
    public int[] field2910;

    @ObfuscatedName("fn.m")
    public int[] field2908;

    @ObfuscatedName("fn.i")
    public boolean field2904;

    @ObfuscatedName("fn.q")
    public int field2907;

    @ObfuscatedName("fn.p")
    public long field2906;

    @ObfuscatedName("fn.c")
    public long field2909;

    @ObfuscatedName("fn.v")
    public static final int[] field2912 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fn.k")
    public static class193 field2911 = new class193(260);

    @ObfuscatedName("fn.h([I[IZII)V")
    public void method3230(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1033; var6++) {
                    class45 var7 = class45.method2716(var6);
                    if (var7 != null && !var7.field1040 && var7.field1036 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2912[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2910 = arg0;
        this.field2908 = arg1;
        this.field2904 = arg2;
        this.field2907 = arg3;
        this.method3256();
    }

    @ObfuscatedName("fn.m(IZI)V")
    public void method3231(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2904) {
            return;
        }
        int var3 = this.field2910[field2912[arg0]];
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
            var4 = class45.method2716(var3);
        } while (var4 == null || var4.field1040 || (this.field2904 ? 7 : 0) + arg0 != var4.field1036);
        this.field2910[field2912[arg0]] = var3 + 256;
        this.method3256();
    }

    @ObfuscatedName("fn.i(IZB)V")
    public void method3232(int arg0, boolean arg1) {
        int var3 = this.field2908[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field160[arg0].length) {
                    var3 = 0;
                }
            } while (!class174.method2109(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field160[arg0].length - 1;
                }
            } while (!class174.method2109(arg0, var3));
        }
        this.field2908[arg0] = var3;
        this.method3256();
    }

    @ObfuscatedName("fn.q(ZI)V")
    public void method3255(boolean arg0) {
        if (this.field2904 != arg0) {
            this.method3230((int[]) null, this.field2908, arg0, -1);
        }
    }

    @ObfuscatedName("fn.p(Ldp;B)V")
    public void method3234(class119 arg0) {
        arg0.method2305(this.field2904 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2910[field2912[var2]];
            if (var3 == 0) {
                arg0.method2305(-1);
            } else {
                arg0.method2305(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2305(this.field2908[var4]);
        }
    }

    @ObfuscatedName("fn.c(B)V")
    public void method3256() {
        long var1 = this.field2906;
        int var3 = this.field2910[5];
        int var4 = this.field2910[9];
        this.field2910[5] = var4;
        this.field2910[9] = var3;
        this.field2906 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2906 <<= 0x4;
            if (this.field2910[var5] >= 256) {
                this.field2906 += (long) (this.field2910[var5] - 256);
            }
        }
        if (this.field2910[0] >= 256) {
            this.field2906 += (long) (this.field2910[0] - 256 >> 4);
        }
        if (this.field2910[1] >= 256) {
            this.field2906 += (long) (this.field2910[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2906 <<= 0x3;
            this.field2906 += (long) this.field2908[var6];
        }
        this.field2906 <<= 0x1;
        this.field2906 += (long) (this.field2904 ? 1 : 0);
        this.field2910[5] = var3;
        this.field2910[9] = var4;
        if (var1 != 0L && this.field2906 != var1) {
            field2911.method3475(var1);
        }
    }

    @ObfuscatedName("fn.f(Laz;ILaz;II)Ldb;")
    public class105 method3246(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2907 != -1) {
            return class40.method2608(this.field2907).method747(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2906;
        int[] var7 = this.field2910;
        if (arg0 != null && (arg0.field1001 >= 0 || arg0.field1002 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2910[var8];
            }
            if (arg0.field1001 >= 0) {
                var5 += (long) (arg0.field1001 - this.field2910[5] << 40);
                var7[5] = arg0.field1001;
            }
            if (arg0.field1002 >= 0) {
                var5 += (long) (arg0.field1002 - this.field2910[3] << 48);
                var7[3] = arg0.field1002;
            }
        }
        class105 var9 = (class105) field2911.method3472(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method2716(var12 - 256).method892()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method2933(var12 - 512).method1014(this.field2904)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2909 != -1L) {
                    var9 = (class105) field2911.method3472(this.field2909);
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
                        class100 var17 = class45.method2716(var16 - 256).method884();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method2933(var16 - 512).method1022(this.field2904);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2908[var20] < Statics.field160[var20].length) {
                        var19.method2098(Statics.field1997[var20], Statics.field160[var20][this.field2908[var20]]);
                    }
                    if (this.field2908[var20] < Statics.field2062[var20].length) {
                        var19.method2098(Statics.field2725[var20], Statics.field2062[var20][this.field2908[var20]]);
                    }
                }
                var9 = var19.method2067(64, 850, -30, -50, -30);
                field2911.method3474(var9, var5);
                this.field2909 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method829(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method826(var9, arg3);
        } else {
            var21 = arg0.method826(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fn.y(B)Lcl;")
    public class100 method3229() {
        if (this.field2907 != -1) {
            return class40.method2608(this.field2907).method730();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2910[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method2716(var3 - 256).method885()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method2933(var3 - 512).method993(this.field2904)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2910[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method2716(var7 - 256).method886();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method2933(var7 - 512).method998(this.field2904);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2908[var11] < Statics.field160[var11].length) {
                var10.method2098(Statics.field1997[var11], Statics.field160[var11][this.field2908[var11]]);
            }
            if (this.field2908[var11] < Statics.field2062[var11].length) {
                var10.method2098(Statics.field2725[var11], Statics.field2062[var11][this.field2908[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fn.w(B)I")
    public int method3233() {
        return this.field2907 == -1 ? (this.field2910[11] << 5) + (this.field2910[8] << 10) + (this.field2910[0] << 15) + (this.field2908[4] << 20) + (this.field2908[0] << 25) + this.field2910[1] : 305419896 + class40.method2608(this.field2907).field892;
    }

    @ObfuscatedName("g.l(B)V")
    public static void method176() {
        field2911.method3483();
    }
}
