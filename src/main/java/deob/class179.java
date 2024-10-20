package deob;

@ObfuscatedName("fv")
public class class179 {

    @ObfuscatedName("fv.i")
    public int[] field2901;

    @ObfuscatedName("fv.v")
    public int[] field2894;

    @ObfuscatedName("fv.r")
    public boolean field2902;

    @ObfuscatedName("fv.n")
    public int field2896;

    @ObfuscatedName("fv.x")
    public long field2897;

    @ObfuscatedName("fv.q")
    public long field2898;

    @ObfuscatedName("fv.m")
    public static final int[] field2900 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fv.e")
    public static class193 field2903 = new class193(260);

    @ObfuscatedName("fv.i([I[IZII)V")
    public void method3269(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1024; var6++) {
                    class45 var7 = class45.method766(var6);
                    if (var7 != null && !var7.field1029 && var7.field1028 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2900[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2901 = arg0;
        this.field2894 = arg1;
        this.field2902 = arg2;
        this.field2896 = arg3;
        this.method3241();
    }

    @ObfuscatedName("fv.v(IZB)V")
    public void method3237(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2902) {
            return;
        }
        int var3 = this.field2901[field2900[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1024) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1024 - 1;
                }
            }
            var4 = class45.method766(var3);
        } while (var4 == null || var4.field1029 || (this.field2902 ? 7 : 0) + arg0 != var4.field1028);
        this.field2901[field2900[arg0]] = var3 + 256;
        this.method3241();
    }

    @ObfuscatedName("fv.r(IZB)V")
    public void method3238(int arg0, boolean arg1) {
        int var3 = this.field2894[arg0];
        boolean var4;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2895[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2895[arg0].length - 1;
                }
            } while (!class174.method1083(arg0, var3));
        }
        this.field2894[arg0] = var3;
        this.method3241();
    }

    @ObfuscatedName("fv.n(ZB)V")
    public void method3260(boolean arg0) {
        if (this.field2902 != arg0) {
            this.method3269((int[]) null, this.field2894, arg0, -1);
        }
    }

    @ObfuscatedName("fv.x(Ldx;I)V")
    public void method3240(class119 arg0) {
        arg0.method2436(this.field2902 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2901[field2900[var2]];
            if (var3 == 0) {
                arg0.method2436(-1);
            } else {
                arg0.method2436(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2436(this.field2894[var4]);
        }
    }

    @ObfuscatedName("fv.q(B)V")
    public void method3241() {
        long var1 = this.field2897;
        int var3 = this.field2901[5];
        int var4 = this.field2901[9];
        this.field2901[5] = var4;
        this.field2901[9] = var3;
        this.field2897 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2897 <<= 0x4;
            if (this.field2901[var5] >= 256) {
                this.field2897 += (long) (this.field2901[var5] - 256);
            }
        }
        if (this.field2901[0] >= 256) {
            this.field2897 += (long) (this.field2901[0] - 256 >> 4);
        }
        if (this.field2901[1] >= 256) {
            this.field2897 += (long) (this.field2901[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2897 <<= 0x3;
            this.field2897 += (long) this.field2894[var6];
        }
        this.field2897 <<= 0x1;
        this.field2897 += (long) (this.field2902 ? 1 : 0);
        this.field2901[5] = var3;
        this.field2901[9] = var4;
        if (var1 != 0L && this.field2897 != var1) {
            field2903.method3463(var1);
        }
    }

    @ObfuscatedName("fv.h(Laa;ILaa;II)Ldj;")
    public class105 method3242(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2896 != -1) {
            return class40.method2940(this.field2896).method774(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2897;
        int[] var7 = this.field2901;
        if (arg0 != null && (arg0.field991 >= 0 || arg0.field992 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2901[var8];
            }
            if (arg0.field991 >= 0) {
                var5 += (long) (arg0.field991 - this.field2901[5] << 40);
                var7[5] = arg0.field991;
            }
            if (arg0.field992 >= 0) {
                var5 += (long) (arg0.field992 - this.field2901[3] << 48);
                var7[3] = arg0.field992;
            }
        }
        class105 var9 = (class105) field2903.method3464(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method766(var12 - 256).method914()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method970(var12 - 512).method1024(this.field2902)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2898 != -1L) {
                    var9 = (class105) field2903.method3464(this.field2898);
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
                        class100 var17 = class45.method766(var16 - 256).method915();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method970(var16 - 512).method1025(this.field2902);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2894[var20] < Statics.field2895[var20].length) {
                        var19.method2054(Statics.field2899[var20], Statics.field2895[var20][this.field2894[var20]]);
                    }
                    if (this.field2894[var20] < Statics.field1375[var20].length) {
                        var19.method2054(Statics.field2286[var20], Statics.field1375[var20][this.field2894[var20]]);
                    }
                }
                var9 = var19.method2062(64, 850, -30, -50, -30);
                field2903.method3466(var9, var5);
                this.field2898 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method870(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method867(var9, arg3);
        } else {
            var21 = arg0.method867(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fv.d(I)Lcx;")
    public class100 method3261() {
        if (this.field2896 != -1) {
            return class40.method2940(this.field2896).method775();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2901[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method766(var3 - 256).method918()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method970(var3 - 512).method1064(this.field2902)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2901[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method766(var7 - 256).method917();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method970(var7 - 512).method1027(this.field2902);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2894[var11] < Statics.field2895[var11].length) {
                var10.method2054(Statics.field2899[var11], Statics.field2895[var11][this.field2894[var11]]);
            }
            if (this.field2894[var11] < Statics.field1375[var11].length) {
                var10.method2054(Statics.field2286[var11], Statics.field1375[var11][this.field2894[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fv.c(I)I")
    public int method3244() {
        return this.field2896 == -1 ? (this.field2901[11] << 5) + (this.field2901[8] << 10) + (this.field2901[0] << 15) + (this.field2894[0] << 25) + (this.field2894[4] << 20) + this.field2901[1] : 305419896 + class40.method2940(this.field2896).field885;
    }
}
