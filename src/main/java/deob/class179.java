package deob;

@ObfuscatedName("fg")
public class class179 {

    @ObfuscatedName("fg.v")
    public int[] field2918;

    @ObfuscatedName("fg.f")
    public int[] field2916;

    @ObfuscatedName("fg.i")
    public boolean field2922;

    @ObfuscatedName("fg.d")
    public int field2925;

    @ObfuscatedName("fg.o")
    public long field2920;

    @ObfuscatedName("fg.c")
    public long field2921;

    @ObfuscatedName("fg.h")
    public static final int[] field2923 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fg.z")
    public static class193 field2924 = new class193(260);

    @ObfuscatedName("fg.v([I[IZII)V")
    public void method3242(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1028; var6++) {
                    class45 var7 = class45.method99(var6);
                    if (var7 != null && !var7.field1029 && var7.field1022 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2923[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2918 = arg0;
        this.field2916 = arg1;
        this.field2922 = arg2;
        this.field2925 = arg3;
        this.method3247();
    }

    @ObfuscatedName("fg.f(IZI)V")
    public void method3243(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2922) {
            return;
        }
        int var3 = this.field2918[field2923[arg0]];
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
            var4 = class45.method99(var3);
        } while (var4 == null || var4.field1029 || var4.field1022 != (this.field2922 ? 7 : 0) + arg0);
        this.field2918[field2923[arg0]] = var3 + 256;
        this.method3247();
    }

    @ObfuscatedName("fg.i(IZI)V")
    public void method3264(int arg0, boolean arg1) {
        int var3 = this.field2916[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field133[arg0].length) {
                    var3 = 0;
                }
            } while (!class174.method1776(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field133[arg0].length - 1;
                }
            } while (!class174.method1776(arg0, var3));
        }
        this.field2916[arg0] = var3;
        this.method3247();
    }

    @ObfuscatedName("fg.d(ZI)V")
    public void method3252(boolean arg0) {
        if (this.field2922 != arg0) {
            this.method3242((int[]) null, this.field2916, arg0, -1);
        }
    }

    @ObfuscatedName("fg.o(Ldx;I)V")
    public void method3246(class119 arg0) {
        arg0.method2398(this.field2922 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2918[field2923[var2]];
            if (var3 == 0) {
                arg0.method2398(-1);
            } else {
                arg0.method2398(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2398(this.field2916[var4]);
        }
    }

    @ObfuscatedName("fg.c(I)V")
    public void method3247() {
        long var1 = this.field2920;
        int var3 = this.field2918[5];
        int var4 = this.field2918[9];
        this.field2918[5] = var4;
        this.field2918[9] = var3;
        this.field2920 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2920 <<= 0x4;
            if (this.field2918[var5] >= 256) {
                this.field2920 += (long) (this.field2918[var5] - 256);
            }
        }
        if (this.field2918[0] >= 256) {
            this.field2920 += (long) (this.field2918[0] - 256 >> 4);
        }
        if (this.field2918[1] >= 256) {
            this.field2920 += (long) (this.field2918[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2920 <<= 0x3;
            this.field2920 += (long) this.field2916[var6];
        }
        this.field2920 <<= 0x1;
        this.field2920 += (long) (this.field2922 ? 1 : 0);
        this.field2918[5] = var3;
        this.field2918[9] = var4;
        if (var1 != 0L && this.field2920 != var1) {
            field2924.method3491(var1);
        }
    }

    @ObfuscatedName("fg.p(Lav;ILav;IB)Ldq;")
    public class105 method3248(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2925 != -1) {
            return class40.method706(this.field2925).method749(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2920;
        int[] var7 = this.field2918;
        if (arg0 != null && (arg0.field989 >= 0 || arg0.field986 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2918[var8];
            }
            if (arg0.field989 >= 0) {
                var5 += (long) (arg0.field989 - this.field2918[5] << 40);
                var7[5] = arg0.field989;
            }
            if (arg0.field986 >= 0) {
                var5 += (long) (arg0.field986 - this.field2918[3] << 48);
                var7[3] = arg0.field986;
            }
        }
        class105 var9 = (class105) field2924.method3490(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method99(var12 - 256).method921()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method36(var12 - 512).method1007(this.field2922)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2921 != -1L) {
                    var9 = (class105) field2924.method3490(this.field2921);
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
                        class100 var17 = class45.method99(var16 - 256).method894();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method36(var16 - 512).method1008(this.field2922);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2916[var20] < Statics.field133[var20].length) {
                        var19.method2123(Statics.field1748[var20], Statics.field133[var20][this.field2916[var20]]);
                    }
                    if (this.field2916[var20] < Statics.field29[var20].length) {
                        var19.method2123(Statics.field2917[var20], Statics.field29[var20][this.field2916[var20]]);
                    }
                }
                var9 = var19.method2074(64, 850, -30, -50, -30);
                field2924.method3502(var9, var5);
                this.field2921 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method847(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method844(var9, arg3);
        } else {
            var21 = arg0.method844(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fg.j(B)Lca;")
    public class100 method3249() {
        if (this.field2925 != -1) {
            return class40.method706(this.field2925).method750();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2918[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method99(var3 - 256).method895()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method36(var3 - 512).method1009(this.field2922)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2918[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method99(var7 - 256).method920();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method36(var7 - 512).method1010(this.field2922);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2916[var11] < Statics.field133[var11].length) {
                var10.method2123(Statics.field1748[var11], Statics.field133[var11][this.field2916[var11]]);
            }
            if (this.field2916[var11] < Statics.field29[var11].length) {
                var10.method2123(Statics.field2917[var11], Statics.field29[var11][this.field2916[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fg.a(I)I")
    public int method3250() {
        return this.field2925 == -1 ? (this.field2918[11] << 5) + (this.field2918[8] << 10) + (this.field2918[0] << 15) + (this.field2916[4] << 20) + (this.field2916[0] << 25) + this.field2918[1] : 305419896 + class40.method706(this.field2925).field877;
    }

    @ObfuscatedName("cg.y(B)V")
    public static void method1954() {
        field2924.method3496();
    }
}
