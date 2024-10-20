package deob;

@ObfuscatedName("fz")
public class class179 {

    @ObfuscatedName("fz.i")
    public int[] field2911;

    @ObfuscatedName("fz.v")
    public int[] field2906;

    @ObfuscatedName("fz.f")
    public boolean field2905;

    @ObfuscatedName("fz.h")
    public int field2904;

    @ObfuscatedName("fz.a")
    public long field2907;

    @ObfuscatedName("fz.s")
    public long field2908;

    @ObfuscatedName("fz.n")
    public static final int[] field2903 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fz.z")
    public static class193 field2912 = new class193(260);

    @ObfuscatedName("fz.i([I[IZII)V")
    public void method3227(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1051; var6++) {
                    class45 var7 = class45.method515(var6);
                    if (var7 != null && !var7.field1043 && var7.field1044 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2903[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2911 = arg0;
        this.field2906 = arg1;
        this.field2905 = arg2;
        this.field2904 = arg3;
        this.method3232();
    }

    @ObfuscatedName("fz.v(IZI)V")
    public void method3228(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2905) {
            return;
        }
        int var3 = this.field2911[field2903[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1051) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1051 - 1;
                }
            }
            var4 = class45.method515(var3);
        } while (var4 == null || var4.field1043 || var4.field1044 != arg0 + (this.field2905 ? 7 : 0));
        this.field2911[field2903[arg0]] = var3 + 256;
        this.method3232();
    }

    @ObfuscatedName("fz.f(IZI)V")
    public void method3229(int arg0, boolean arg1) {
        int var3 = this.field2906[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2253[arg0].length) {
                    var3 = 0;
                }
            } while (!Statics.method1719(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2253[arg0].length - 1;
                }
            } while (!Statics.method1719(arg0, var3));
        }
        this.field2906[arg0] = var3;
        this.method3232();
    }

    @ObfuscatedName("fz.h(ZB)V")
    public void method3230(boolean arg0) {
        if (this.field2905 != arg0) {
            this.method3227((int[]) null, this.field2906, arg0, -1);
        }
    }

    @ObfuscatedName("fz.a(Ldj;I)V")
    public void method3231(class119 arg0) {
        arg0.method2296(this.field2905 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2911[field2903[var2]];
            if (var3 == 0) {
                arg0.method2296(-1);
            } else {
                arg0.method2296(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2296(this.field2906[var4]);
        }
    }

    @ObfuscatedName("fz.s(I)V")
    public void method3232() {
        long var1 = this.field2907;
        int var3 = this.field2911[5];
        int var4 = this.field2911[9];
        this.field2911[5] = var4;
        this.field2911[9] = var3;
        this.field2907 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2907 <<= 0x4;
            if (this.field2911[var5] >= 256) {
                this.field2907 += (long) (this.field2911[var5] - 256);
            }
        }
        if (this.field2911[0] >= 256) {
            this.field2907 += (long) (this.field2911[0] - 256 >> 4);
        }
        if (this.field2911[1] >= 256) {
            this.field2907 += (long) (this.field2911[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2907 <<= 0x3;
            this.field2907 += (long) this.field2906[var6];
        }
        this.field2907 <<= 0x1;
        this.field2907 += (long) (this.field2905 ? 1 : 0);
        this.field2911[5] = var3;
        this.field2911[9] = var4;
        if (var1 != 0L && this.field2907 != var1) {
            field2912.method3476(var1);
        }
    }

    @ObfuscatedName("fz.p(Lag;ILag;II)Ldo;")
    public class105 method3233(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2904 != -1) {
            return class40.method151(this.field2904).method729(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2907;
        int[] var7 = this.field2911;
        if (arg0 != null && (arg0.field1008 >= 0 || arg0.field1009 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2911[var8];
            }
            if (arg0.field1008 >= 0) {
                var5 += (long) (arg0.field1008 - this.field2911[5] << 40);
                var7[5] = arg0.field1008;
            }
            if (arg0.field1009 >= 0) {
                var5 += (long) (arg0.field1009 - this.field2911[3] << 48);
                var7[3] = arg0.field1009;
            }
        }
        class105 var9 = (class105) field2912.method3467(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method515(var12 - 256).method861()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method2618(var12 - 512).method983(this.field2905)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2908 != -1L) {
                    var9 = (class105) field2912.method3467(this.field2908);
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
                        class100 var17 = class45.method515(var16 - 256).method854();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method2618(var16 - 512).method987(this.field2905);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2906[var20] < Statics.field2253[var20].length) {
                        var19.method2019(Statics.field2909[var20], Statics.field2253[var20][this.field2906[var20]]);
                    }
                    if (this.field2906[var20] < Statics.field2952[var20].length) {
                        var19.method2019(Statics.field2910[var20], Statics.field2952[var20][this.field2906[var20]]);
                    }
                }
                var9 = var19.method2036(64, 850, -30, -50, -30);
                field2912.method3466(var9, var5);
                this.field2908 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method809(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method805(var9, arg3);
        } else {
            var21 = arg0.method805(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fz.r(B)Lcg;")
    public class100 method3238() {
        if (this.field2904 != -1) {
            return class40.method151(this.field2904).method718();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2911[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method515(var3 - 256).method855()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method2618(var3 - 512).method985(this.field2905)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2911[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method515(var7 - 256).method857();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method2618(var7 - 512).method986(this.field2905);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2906[var11] < Statics.field2253[var11].length) {
                var10.method2019(Statics.field2909[var11], Statics.field2253[var11][this.field2906[var11]]);
            }
            if (this.field2906[var11] < Statics.field2952[var11].length) {
                var10.method2019(Statics.field2910[var11], Statics.field2952[var11][this.field2906[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fz.k(I)I")
    public int method3235() {
        return this.field2904 == -1 ? (this.field2911[11] << 5) + (this.field2911[8] << 10) + (this.field2911[0] << 15) + (this.field2906[4] << 20) + (this.field2906[0] << 25) + this.field2911[1] : 305419896 + class40.method151(this.field2904).field911;
    }
}
