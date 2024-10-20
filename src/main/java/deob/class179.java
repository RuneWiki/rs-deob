package deob;

@ObfuscatedName("fy")
public class class179 {

    @ObfuscatedName("fy.o")
    public int[] field2913;

    @ObfuscatedName("fy.f")
    public int[] field2911;

    @ObfuscatedName("fy.i")
    public boolean field2912;

    @ObfuscatedName("fy.h")
    public int field2914;

    @ObfuscatedName("fy.q")
    public long field2915;

    @ObfuscatedName("fy.u")
    public long field2916;

    @ObfuscatedName("fy.g")
    public static final int[] field2917 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fy.v")
    public static class193 field2918 = new class193(260);

    @ObfuscatedName("fy.o([I[IZIS)V")
    public void method3190(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1017; var6++) {
                    class45 var7 = class45.method628(var6);
                    if (var7 != null && !var7.field1026 && var5 + (arg2 ? 7 : 0) == var7.field1023) {
                        arg0[field2917[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2913 = arg0;
        this.field2911 = arg1;
        this.field2912 = arg2;
        this.field2914 = arg3;
        this.method3212();
    }

    @ObfuscatedName("fy.f(IZB)V")
    public void method3218(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2912) {
            return;
        }
        int var3 = this.field2913[field2917[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1017) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1017 - 1;
                }
            }
            var4 = class45.method628(var3);
        } while (var4 == null || var4.field1026 || var4.field1023 != arg0 + (this.field2912 ? 7 : 0));
        this.field2913[field2917[arg0]] = var3 + 256;
        this.method3212();
    }

    @ObfuscatedName("fy.i(IZI)V")
    public void method3192(int arg0, boolean arg1) {
        int var3 = this.field2911[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2215[arg0].length) {
                    var3 = 0;
                }
            } while (!class174.method715(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2215[arg0].length - 1;
                }
            } while (!class174.method715(arg0, var3));
        }
        this.field2911[arg0] = var3;
        this.method3212();
    }

    @ObfuscatedName("fy.h(ZI)V")
    public void method3206(boolean arg0) {
        if (this.field2912 != arg0) {
            this.method3190((int[]) null, this.field2911, arg0, -1);
        }
    }

    @ObfuscatedName("fy.q(Ldc;B)V")
    public void method3194(class119 arg0) {
        arg0.method2347(this.field2912 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2913[field2917[var2]];
            if (var3 == 0) {
                arg0.method2347(-1);
            } else {
                arg0.method2347(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2347(this.field2911[var4]);
        }
    }

    @ObfuscatedName("fy.u(I)V")
    public void method3212() {
        long var1 = this.field2915;
        int var3 = this.field2913[5];
        int var4 = this.field2913[9];
        this.field2913[5] = var4;
        this.field2913[9] = var3;
        this.field2915 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2915 <<= 0x4;
            if (this.field2913[var5] >= 256) {
                this.field2915 += (long) (this.field2913[var5] - 256);
            }
        }
        if (this.field2913[0] >= 256) {
            this.field2915 += (long) (this.field2913[0] - 256 >> 4);
        }
        if (this.field2913[1] >= 256) {
            this.field2915 += (long) (this.field2913[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2915 <<= 0x3;
            this.field2915 += (long) this.field2911[var6];
        }
        this.field2915 <<= 0x1;
        this.field2915 += (long) (this.field2912 ? 1 : 0);
        this.field2913[5] = var3;
        this.field2913[9] = var4;
        if (var1 != 0L && this.field2915 != var1) {
            field2918.method3450(var1);
        }
    }

    @ObfuscatedName("fy.m(Lau;ILau;II)Ldm;")
    public class105 method3204(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2914 != -1) {
            return class40.method3100(this.field2914).method738(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2915;
        int[] var7 = this.field2913;
        if (arg0 != null && (arg0.field986 >= 0 || arg0.field979 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2913[var8];
            }
            if (arg0.field986 >= 0) {
                var5 += (long) (arg0.field986 - this.field2913[5] << 40);
                var7[5] = arg0.field986;
            }
            if (arg0.field979 >= 0) {
                var5 += (long) (arg0.field979 - this.field2913[3] << 48);
                var7[3] = arg0.field979;
            }
        }
        class105 var9 = (class105) field2918.method3456(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method628(var12 - 256).method866()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method1979(var12 - 512).method976(this.field2912)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2916 != -1L) {
                    var9 = (class105) field2918.method3456(this.field2916);
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
                        class100 var17 = class45.method628(var16 - 256).method867();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method1979(var16 - 512).method977(this.field2912);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2911[var20] < Statics.field2215[var20].length) {
                        var19.method2013(Statics.field2644[var20], Statics.field2215[var20][this.field2911[var20]]);
                    }
                    if (this.field2911[var20] < Statics.field1968[var20].length) {
                        var19.method2013(Statics.field572[var20], Statics.field1968[var20][this.field2911[var20]]);
                    }
                }
                var9 = var19.method2036(64, 850, -30, -50, -30);
                field2918.method3451(var9, var5);
                this.field2916 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method812(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method817(var9, arg3);
        } else {
            var21 = arg0.method817(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fy.y(B)Lck;")
    public class100 method3197() {
        if (this.field2914 != -1) {
            return class40.method3100(this.field2914).method737();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2913[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method628(var3 - 256).method864()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method1979(var3 - 512).method978(this.field2912)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2913[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method628(var7 - 256).method870();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method1979(var7 - 512).method979(this.field2912);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2911[var11] < Statics.field2215[var11].length) {
                var10.method2013(Statics.field2644[var11], Statics.field2215[var11][this.field2911[var11]]);
            }
            if (this.field2911[var11] < Statics.field1968[var11].length) {
                var10.method2013(Statics.field572[var11], Statics.field1968[var11][this.field2911[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fy.p(S)I")
    public int method3198() {
        return this.field2914 == -1 ? (this.field2913[11] << 5) + (this.field2913[8] << 10) + (this.field2913[0] << 15) + (this.field2911[4] << 20) + (this.field2911[0] << 25) + this.field2913[1] : 305419896 + class40.method3100(this.field2914).field876;
    }

    @ObfuscatedName("z.t(I)V")
    public static void method177() {
        field2918.method3452();
    }
}
