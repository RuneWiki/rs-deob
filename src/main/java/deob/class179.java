package deob;

@ObfuscatedName("fa")
public class class179 {

    @ObfuscatedName("fa.j")
    public int[] field2916;

    @ObfuscatedName("fa.l")
    public int[] field2915;

    @ObfuscatedName("fa.a")
    public boolean field2923;

    @ObfuscatedName("fa.i")
    public int field2917;

    @ObfuscatedName("fa.f")
    public long field2918;

    @ObfuscatedName("fa.m")
    public long field2914;

    @ObfuscatedName("fa.r")
    public static final int[] field2922 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fa.b")
    public static class193 field2919 = new class193(260);

    @ObfuscatedName("fa.j([I[IZII)V")
    public void method3216(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1033; var6++) {
                    class45 var7 = class45.method2262(var6);
                    if (var7 != null && !var7.field1024 && var7.field1028 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2922[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2916 = arg0;
        this.field2915 = arg1;
        this.field2923 = arg2;
        this.field2917 = arg3;
        this.method3215();
    }

    @ObfuscatedName("fa.l(IZB)V")
    public void method3219(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2923) {
            return;
        }
        int var3 = this.field2916[field2922[arg0]];
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
            var4 = class45.method2262(var3);
        } while (var4 == null || var4.field1024 || var4.field1028 != (this.field2923 ? 7 : 0) + arg0);
        this.field2916[field2922[arg0]] = var3 + 256;
        this.method3215();
    }

    @ObfuscatedName("fa.a(IZI)V")
    public void method3217(int arg0, boolean arg1) {
        int var3 = this.field2915[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2080[arg0].length) {
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
                    var3 = Statics.field2080[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2915[arg0] = var3;
        this.method3215();
    }

    @ObfuscatedName("fa.i(ZI)V")
    public void method3224(boolean arg0) {
        if (this.field2923 != arg0) {
            this.method3216((int[]) null, this.field2915, arg0, -1);
        }
    }

    @ObfuscatedName("fa.f(Ldc;I)V")
    public void method3237(class119 arg0) {
        arg0.method2301(this.field2923 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2916[field2922[var2]];
            if (var3 == 0) {
                arg0.method2301(-1);
            } else {
                arg0.method2301(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2301(this.field2915[var4]);
        }
    }

    @ObfuscatedName("fa.m(I)V")
    public void method3215() {
        long var1 = this.field2918;
        int var3 = this.field2916[5];
        int var4 = this.field2916[9];
        this.field2916[5] = var4;
        this.field2916[9] = var3;
        this.field2918 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2918 <<= 0x4;
            if (this.field2916[var5] >= 256) {
                this.field2918 += (long) (this.field2916[var5] - 256);
            }
        }
        if (this.field2916[0] >= 256) {
            this.field2918 += (long) (this.field2916[0] - 256 >> 4);
        }
        if (this.field2916[1] >= 256) {
            this.field2918 += (long) (this.field2916[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2918 <<= 0x3;
            this.field2918 += (long) this.field2915[var6];
        }
        this.field2918 <<= 0x1;
        this.field2918 += (long) (this.field2923 ? 1 : 0);
        this.field2916[5] = var3;
        this.field2916[9] = var4;
        if (var1 != 0L && this.field2918 != var1) {
            field2919.method3467(var1);
        }
    }

    @ObfuscatedName("fa.o(Lal;ILal;IB)Ldd;")
    public class105 method3221(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2917 != -1) {
            return class40.method159(this.field2917).method754(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2918;
        int[] var7 = this.field2916;
        if (arg0 != null && (arg0.field995 >= 0 || arg0.field1005 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2916[var8];
            }
            if (arg0.field995 >= 0) {
                var5 += (long) (arg0.field995 - this.field2916[5] << 40);
                var7[5] = arg0.field995;
            }
            if (arg0.field1005 >= 0) {
                var5 += (long) (arg0.field1005 - this.field2916[3] << 48);
                var7[3] = arg0.field1005;
            }
        }
        class105 var9 = (class105) field2919.method3466(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method2262(var12 - 256).method902()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method578(var12 - 512).method1018(this.field2923)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2914 != -1L) {
                    var9 = (class105) field2919.method3466(this.field2914);
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
                        class100 var17 = class45.method2262(var16 - 256).method903();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method578(var16 - 512).method1060(this.field2923);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2915[var20] < Statics.field2080[var20].length) {
                        var19.method2061(Statics.field2920[var20], Statics.field2080[var20][this.field2915[var20]]);
                    }
                    if (this.field2915[var20] < Statics.field1174[var20].length) {
                        var19.method2061(Statics.field2921[var20], Statics.field1174[var20][this.field2915[var20]]);
                    }
                }
                var9 = var19.method2041(64, 850, -30, -50, -30);
                field2919.method3468(var9, var5);
                this.field2914 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method855(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method851(var9, arg3);
        } else {
            var21 = arg0.method851(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fa.h(B)Lcb;")
    public class100 method3222() {
        if (this.field2917 != -1) {
            return class40.method159(this.field2917).method755();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2916[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method2262(var3 - 256).method904()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method578(var3 - 512).method1012(this.field2923)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2916[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method2262(var7 - 256).method905();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method578(var7 - 512).method1030(this.field2923);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2915[var11] < Statics.field2080[var11].length) {
                var10.method2061(Statics.field2920[var11], Statics.field2080[var11][this.field2915[var11]]);
            }
            if (this.field2915[var11] < Statics.field1174[var11].length) {
                var10.method2061(Statics.field2921[var11], Statics.field1174[var11][this.field2915[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fa.n(B)I")
    public int method3228() {
        return this.field2917 == -1 ? (this.field2916[11] << 5) + (this.field2916[8] << 10) + (this.field2916[0] << 15) + (this.field2915[0] << 25) + (this.field2915[4] << 20) + this.field2916[1] : 305419896 + class40.method159(this.field2917).field897;
    }
}
