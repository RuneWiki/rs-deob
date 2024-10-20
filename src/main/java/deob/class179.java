package deob;

@ObfuscatedName("fa")
public class class179 {

    @ObfuscatedName("fa.h")
    public int[] field2895;

    @ObfuscatedName("fa.q")
    public int[] field2893;

    @ObfuscatedName("fa.v")
    public boolean field2888;

    @ObfuscatedName("fa.n")
    public int field2889;

    @ObfuscatedName("fa.f")
    public long field2890;

    @ObfuscatedName("fa.g")
    public long field2891;

    @ObfuscatedName("fa.c")
    public static final int[] field2894 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fa.l")
    public static class193 field2887 = new class193(260);

    @ObfuscatedName("fa.h([I[IZIB)V")
    public void method3303(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1037; var6++) {
                    class45 var7 = class45.method672(var6);
                    if (var7 != null && !var7.field1035 && var7.field1034 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2894[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2895 = arg0;
        this.field2893 = arg1;
        this.field2888 = arg2;
        this.field2889 = arg3;
        this.method3308();
    }

    @ObfuscatedName("fa.q(IZB)V")
    public void method3304(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2888) {
            return;
        }
        int var3 = this.field2895[field2894[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1037) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1037 - 1;
                }
            }
            var4 = class45.method672(var3);
        } while (var4 == null || var4.field1035 || arg0 + (this.field2888 ? 7 : 0) != var4.field1034);
        this.field2895[field2894[arg0]] = var3 + 256;
        this.method3308();
    }

    @ObfuscatedName("fa.v(IZI)V")
    public void method3305(int arg0, boolean arg1) {
        int var3 = this.field2893[arg0];
        boolean var4;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2286[arg0].length) {
                    var3 = 0;
                }
            } while (!class174.method2628(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2286[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2893[arg0] = var3;
        this.method3308();
    }

    @ObfuscatedName("fa.n(ZB)V")
    public void method3306(boolean arg0) {
        if (this.field2888 != arg0) {
            this.method3303((int[]) null, this.field2893, arg0, -1);
        }
    }

    @ObfuscatedName("fa.f(Ldm;S)V")
    public void method3324(class119 arg0) {
        arg0.method2499(this.field2888 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2895[field2894[var2]];
            if (var3 == 0) {
                arg0.method2499(-1);
            } else {
                arg0.method2499(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2499(this.field2893[var4]);
        }
    }

    @ObfuscatedName("fa.g(I)V")
    public void method3308() {
        long var1 = this.field2890;
        int var3 = this.field2895[5];
        int var4 = this.field2895[9];
        this.field2895[5] = var4;
        this.field2895[9] = var3;
        this.field2890 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2890 <<= 0x4;
            if (this.field2895[var5] >= 256) {
                this.field2890 += (long) (this.field2895[var5] - 256);
            }
        }
        if (this.field2895[0] >= 256) {
            this.field2890 += (long) (this.field2895[0] - 256 >> 4);
        }
        if (this.field2895[1] >= 256) {
            this.field2890 += (long) (this.field2895[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2890 <<= 0x3;
            this.field2890 += (long) this.field2893[var6];
        }
        this.field2890 <<= 0x1;
        this.field2890 += (long) (this.field2888 ? 1 : 0);
        this.field2895[5] = var3;
        this.field2895[9] = var4;
        if (var1 != 0L && this.field2890 != var1) {
            field2887.method3542(var1);
        }
    }

    @ObfuscatedName("fa.o(Laz;ILaz;II)Ldg;")
    public class105 method3335(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2889 != -1) {
            return class40.method3(this.field2889).method740(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2890;
        int[] var7 = this.field2895;
        if (arg0 != null && (arg0.field989 >= 0 || arg0.field1002 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2895[var8];
            }
            if (arg0.field989 >= 0) {
                var5 += (long) (arg0.field989 - this.field2895[5] << 40);
                var7[5] = arg0.field989;
            }
            if (arg0.field1002 >= 0) {
                var5 += (long) (arg0.field1002 - this.field2895[3] << 48);
                var7[3] = arg0.field1002;
            }
        }
        class105 var9 = (class105) field2887.method3538(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method672(var12 - 256).method894()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method588(var12 - 512).method1030(this.field2888)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2891 != -1L) {
                    var9 = (class105) field2887.method3538(this.field2891);
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
                        class100 var17 = class45.method672(var16 - 256).method892();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method588(var16 - 512).method1045(this.field2888);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2893[var20] < Statics.field2286[var20].length) {
                        var19.method2097(Statics.field2892[var20], Statics.field2286[var20][this.field2893[var20]]);
                    }
                    if (this.field2893[var20] < Statics.field1549[var20].length) {
                        var19.method2097(Statics.field2886[var20], Statics.field1549[var20][this.field2893[var20]]);
                    }
                }
                var9 = var19.method2112(64, 850, -30, -50, -30);
                field2887.method3540(var9, var5);
                this.field2891 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method840(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method837(var9, arg3);
        } else {
            var21 = arg0.method837(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fa.s(I)Lch;")
    public class100 method3319() {
        if (this.field2889 != -1) {
            return class40.method3(this.field2889).method741();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2895[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method672(var3 - 256).method896()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method588(var3 - 512).method1032(this.field2888)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2895[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method672(var7 - 256).method897();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method588(var7 - 512).method1013(this.field2888);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2893[var11] < Statics.field2286[var11].length) {
                var10.method2097(Statics.field2892[var11], Statics.field2286[var11][this.field2893[var11]]);
            }
            if (this.field2893[var11] < Statics.field1549[var11].length) {
                var10.method2097(Statics.field2886[var11], Statics.field1549[var11][this.field2893[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fa.k(I)I")
    public int method3330() {
        return this.field2889 == -1 ? (this.field2895[11] << 5) + (this.field2895[8] << 10) + (this.field2895[0] << 15) + (this.field2893[4] << 20) + (this.field2893[0] << 25) + this.field2895[1] : 305419896 + class40.method3(this.field2889).field893;
    }
}
