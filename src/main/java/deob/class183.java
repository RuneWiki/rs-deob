package deob;

@ObfuscatedName("gp")
public class class183 {

    @ObfuscatedName("gp.m")
    public int[] field2976;

    @ObfuscatedName("gp.w")
    public int[] field2964;

    @ObfuscatedName("gp.e")
    public boolean field2975;

    @ObfuscatedName("gp.o")
    public int field2967;

    @ObfuscatedName("gp.g")
    public long field2963;

    @ObfuscatedName("gp.l")
    public long field2966;

    @ObfuscatedName("gp.v")
    public static final int[] field2971 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("gp.h")
    public static class197 field2972 = new class197(260);

    @ObfuscatedName("gp.m([I[IZIB)V")
    public void method3313(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1059; var6++) {
                    class47 var7 = class47.method3279(var6);
                    if (var7 != null && !var7.field1056 && var5 + (arg2 ? 7 : 0) == var7.field1049) {
                        arg0[field2971[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2976 = arg0;
        this.field2964 = arg1;
        this.field2975 = arg2;
        this.field2967 = arg3;
        this.method3318();
    }

    @ObfuscatedName("gp.w(IZI)V")
    public void method3312(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2975) {
            return;
        }
        int var3 = this.field2976[field2971[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class47 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1059) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1059 - 1;
                }
            }
            var4 = class47.method3279(var3);
        } while (var4 == null || var4.field1056 || arg0 + (this.field2975 ? 7 : 0) != var4.field1049);
        this.field2976[field2971[arg0]] = var3 + 256;
        this.method3318();
    }

    @ObfuscatedName("gp.e(IZI)V")
    public void method3333(int arg0, boolean arg1) {
        int var3 = this.field2964[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2970[arg0].length) {
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
                    var3 = Statics.field2970[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2964[arg0] = var3;
        this.method3318();
    }

    @ObfuscatedName("gp.o(ZI)V")
    public void method3315(boolean arg0) {
        if (this.field2975 != arg0) {
            this.method3313((int[]) null, this.field2964, arg0, -1);
        }
    }

    @ObfuscatedName("gp.g(Ldj;B)V")
    public void method3341(class123 arg0) {
        arg0.method2399(this.field2975 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2976[field2971[var2]];
            if (var3 == 0) {
                arg0.method2399(-1);
            } else {
                arg0.method2399(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2399(this.field2964[var4]);
        }
    }

    @ObfuscatedName("gp.l(B)V")
    public void method3318() {
        long var1 = this.field2963;
        int var3 = this.field2976[5];
        int var4 = this.field2976[9];
        this.field2976[5] = var4;
        this.field2976[9] = var3;
        this.field2963 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2963 <<= 0x4;
            if (this.field2976[var5] >= 256) {
                this.field2963 += (long) (this.field2976[var5] - 256);
            }
        }
        if (this.field2976[0] >= 256) {
            this.field2963 += (long) (this.field2976[0] - 256 >> 4);
        }
        if (this.field2976[1] >= 256) {
            this.field2963 += (long) (this.field2976[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2963 <<= 0x3;
            this.field2963 += (long) this.field2964[var6];
        }
        this.field2963 <<= 0x1;
        this.field2963 += (long) (this.field2975 ? 1 : 0);
        this.field2976[5] = var3;
        this.field2976[9] = var4;
        if (var1 != 0L && this.field2963 != var1) {
            field2972.method3552(var1);
        }
    }

    @ObfuscatedName("gp.j(Lac;ILac;II)Ldg;")
    public class109 method3319(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field2967 != -1) {
            return class42.method8(this.field2967).method761(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2963;
        int[] var7 = this.field2976;
        if (arg0 != null && (arg0.field1018 >= 0 || arg0.field1019 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2976[var8];
            }
            if (arg0.field1018 >= 0) {
                var5 += (long) (arg0.field1018 - this.field2976[5] << 40);
                var7[5] = arg0.field1018;
            }
            if (arg0.field1019 >= 0) {
                var5 += (long) (arg0.field1019 - this.field2976[3] << 48);
                var7[3] = arg0.field1019;
            }
        }
        class109 var9 = (class109) field2972.method3556(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class47.method3279(var12 - 256).method925()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class56.method43(var12 - 512).method1126(this.field2975)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2966 != -1L) {
                    var9 = (class109) field2972.method3556(this.field2966);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class104[] var13 = new class104[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class104 var17 = class47.method3279(var16 - 256).method929();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class104 var18 = class56.method43(var16 - 512).method1128(this.field2975);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class104 var19 = new class104(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2964[var20] < Statics.field2970[var20].length) {
                        var19.method2171(Statics.field2969[var20], Statics.field2970[var20][this.field2964[var20]]);
                    }
                    if (this.field2964[var20] < Statics.field226[var20].length) {
                        var19.method2171(Statics.field1112[var20], Statics.field226[var20][this.field2964[var20]]);
                    }
                }
                var9 = var19.method2159(64, 850, -30, -50, -30);
                field2972.method3562(var9, var5);
                this.field2966 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class109 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method872(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method876(var9, arg3);
        } else {
            var21 = arg0.method876(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("gp.r(I)Lcj;")
    public class104 method3320() {
        if (this.field2967 != -1) {
            return class42.method8(this.field2967).method780();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2976[var2];
            if (var3 >= 256 && var3 < 512 && !class47.method3279(var3 - 256).method931()) {
                var1 = true;
            }
            if (var3 >= 512 && !class56.method43(var3 - 512).method1110(this.field2975)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class104[] var4 = new class104[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2976[var6];
            if (var7 >= 256 && var7 < 512) {
                class104 var8 = class47.method3279(var7 - 256).method933();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class104 var9 = class56.method43(var7 - 512).method1111(this.field2975);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class104 var10 = new class104(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2964[var11] < Statics.field2970[var11].length) {
                var10.method2171(Statics.field2969[var11], Statics.field2970[var11][this.field2964[var11]]);
            }
            if (this.field2964[var11] < Statics.field226[var11].length) {
                var10.method2171(Statics.field1112[var11], Statics.field226[var11][this.field2964[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("gp.x(I)I")
    public int method3321() {
        return this.field2967 == -1 ? (this.field2976[11] << 5) + (this.field2976[8] << 10) + (this.field2976[0] << 15) + (this.field2964[0] << 25) + (this.field2964[4] << 20) + this.field2976[1] : 305419896 + class42.method8(this.field2967).field909;
    }
}
