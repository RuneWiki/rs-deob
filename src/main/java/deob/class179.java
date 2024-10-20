package deob;

@ObfuscatedName("fd")
public class class179 {

    @ObfuscatedName("fd.a")
    public int[] field2903;

    @ObfuscatedName("fd.r")
    public int[] field2904;

    @ObfuscatedName("fd.f")
    public boolean field2905;

    @ObfuscatedName("fd.s")
    public int field2906;

    @ObfuscatedName("fd.y")
    public long field2907;

    @ObfuscatedName("fd.e")
    public long field2908;

    @ObfuscatedName("fd.l")
    public static final int[] field2910 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fd.h")
    public static class193 field2914 = new class193(260);

    @ObfuscatedName("fd.a([I[IZIB)V")
    public void method3251(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1028; var6++) {
                    class45 var7 = class45.method696(var6);
                    if (var7 != null && !var7.field1037 && var7.field1030 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2910[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2903 = arg0;
        this.field2904 = arg1;
        this.field2905 = arg2;
        this.field2906 = arg3;
        this.method3256();
    }

    @ObfuscatedName("fd.r(IZB)V")
    public void method3259(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2905) {
            return;
        }
        int var3 = this.field2903[field2910[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1028) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1028 - 1;
                }
            }
            var4 = class45.method696(var3);
        } while (var4 == null || var4.field1037 || (this.field2905 ? 7 : 0) + arg0 != var4.field1030);
        this.field2903[field2910[arg0]] = var3 + 256;
        this.method3256();
    }

    @ObfuscatedName("fd.f(IZB)V")
    public void method3253(int arg0, boolean arg1) {
        int var3 = this.field2904[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2028[arg0].length) {
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
                    var3 = Statics.field2028[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2904[arg0] = var3;
        this.method3256();
    }

    @ObfuscatedName("fd.s(ZI)V")
    public void method3252(boolean arg0) {
        if (this.field2905 != arg0) {
            this.method3251((int[]) null, this.field2904, arg0, -1);
        }
    }

    @ObfuscatedName("fd.y(Lds;I)V")
    public void method3255(class119 arg0) {
        arg0.method2330(this.field2905 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2903[field2910[var2]];
            if (var3 == 0) {
                arg0.method2330(-1);
            } else {
                arg0.method2330(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2330(this.field2904[var4]);
        }
    }

    @ObfuscatedName("fd.e(I)V")
    public void method3256() {
        long var1 = this.field2907;
        int var3 = this.field2903[5];
        int var4 = this.field2903[9];
        this.field2903[5] = var4;
        this.field2903[9] = var3;
        this.field2907 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2907 <<= 0x4;
            if (this.field2903[var5] >= 256) {
                this.field2907 += (long) (this.field2903[var5] - 256);
            }
        }
        if (this.field2903[0] >= 256) {
            this.field2907 += (long) (this.field2903[0] - 256 >> 4);
        }
        if (this.field2903[1] >= 256) {
            this.field2907 += (long) (this.field2903[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2907 <<= 0x3;
            this.field2907 += (long) this.field2904[var6];
        }
        this.field2907 <<= 0x1;
        this.field2907 += (long) (this.field2905 ? 1 : 0);
        this.field2903[5] = var3;
        this.field2903[9] = var4;
        if (var1 != 0L && this.field2907 != var1) {
            field2914.method3508(var1);
        }
    }

    @ObfuscatedName("fd.g(Lan;ILan;IB)Ldn;")
    public class105 method3257(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2906 != -1) {
            return class40.method586(this.field2906).method747(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2907;
        int[] var7 = this.field2903;
        if (arg0 != null && (arg0.field997 >= 0 || arg0.field996 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2903[var8];
            }
            if (arg0.field997 >= 0) {
                var5 += (long) (arg0.field997 - this.field2903[5] << 40);
                var7[5] = arg0.field997;
            }
            if (arg0.field996 >= 0) {
                var5 += (long) (arg0.field996 - this.field2903[3] << 48);
                var7[3] = arg0.field996;
            }
        }
        class105 var9 = (class105) field2914.method3507(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method696(var12 - 256).method905()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method1531(var12 - 512).method1025(this.field2905)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2908 != -1L) {
                    var9 = (class105) field2914.method3507(this.field2908);
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
                        class100 var17 = class45.method696(var16 - 256).method916();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method1531(var16 - 512).method1026(this.field2905);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2904[var20] < Statics.field2028[var20].length) {
                        var19.method2101(Statics.field1866[var20], Statics.field2028[var20][this.field2904[var20]]);
                    }
                    if (this.field2904[var20] < Statics.field2915[var20].length) {
                        var19.method2101(Statics.field2909[var20], Statics.field2915[var20][this.field2904[var20]]);
                    }
                }
                var9 = var19.method2086(64, 850, -30, -50, -30);
                field2914.method3509(var9, var5);
                this.field2908 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method878(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method848(var9, arg3);
        } else {
            var21 = arg0.method848(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fd.m(I)Lch;")
    public class100 method3258() {
        if (this.field2906 != -1) {
            return class40.method586(this.field2906).method745();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2903[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method696(var3 - 256).method907()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method1531(var3 - 512).method1027(this.field2905)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2903[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method696(var7 - 256).method930();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method1531(var7 - 512).method1028(this.field2905);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2904[var11] < Statics.field2028[var11].length) {
                var10.method2101(Statics.field1866[var11], Statics.field2028[var11][this.field2904[var11]]);
            }
            if (this.field2904[var11] < Statics.field2915[var11].length) {
                var10.method2101(Statics.field2909[var11], Statics.field2915[var11][this.field2904[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fd.j(I)I")
    public int method3276() {
        return this.field2906 == -1 ? (this.field2903[11] << 5) + (this.field2903[8] << 10) + (this.field2903[0] << 15) + (this.field2904[4] << 20) + (this.field2904[0] << 25) + this.field2903[1] : 305419896 + class40.method586(this.field2906).field912;
    }

    @ObfuscatedName("ak.n(I)V")
    public static void method651() {
        field2914.method3515();
    }
}
