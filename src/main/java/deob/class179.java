package deob;

@ObfuscatedName("fj")
public class class179 {

    @ObfuscatedName("fj.o")
    public int[] field2919;

    @ObfuscatedName("fj.e")
    public int[] field2913;

    @ObfuscatedName("fj.u")
    public boolean field2912;

    @ObfuscatedName("fj.b")
    public int field2915;

    @ObfuscatedName("fj.p")
    public long field2920;

    @ObfuscatedName("fj.s")
    public long field2917;

    @ObfuscatedName("fj.d")
    public static final int[] field2916 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fj.l")
    public static class193 field2914 = new class193(260);

    @ObfuscatedName("fj.o([I[IZIB)V")
    public void method3264(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1958; var6++) {
                    class45 var7 = Statics.method735(var6);
                    if (var7 != null && !var7.field1020 && (arg2 ? 7 : 0) + var5 == var7.field1022) {
                        arg0[field2916[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2919 = arg0;
        this.field2913 = arg1;
        this.field2912 = arg2;
        this.field2915 = arg3;
        this.method3268();
    }

    @ObfuscatedName("fj.e(IZI)V")
    public void method3265(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2912) {
            return;
        }
        int var3 = this.field2919[field2916[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1958) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1958 - 1;
                }
            }
            var4 = Statics.method735(var3);
        } while (var4 == null || var4.field1020 || arg0 + (this.field2912 ? 7 : 0) != var4.field1022);
        this.field2919[field2916[arg0]] = var3 + 256;
        this.method3268();
    }

    @ObfuscatedName("fj.u(IZI)V")
    public void method3278(int arg0, boolean arg1) {
        int var3 = this.field2913[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field623[arg0].length) {
                    var3 = 0;
                }
            } while (!class174.method51(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field623[arg0].length - 1;
                }
            } while (!class174.method51(arg0, var3));
        }
        this.field2913[arg0] = var3;
        this.method3268();
    }

    @ObfuscatedName("fj.b(ZI)V")
    public void method3266(boolean arg0) {
        if (this.field2912 != arg0) {
            this.method3264((int[]) null, this.field2913, arg0, -1);
        }
    }

    @ObfuscatedName("fj.p(Ldi;I)V")
    public void method3267(class119 arg0) {
        arg0.method2322(this.field2912 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2919[field2916[var2]];
            if (var3 == 0) {
                arg0.method2322(-1);
            } else {
                arg0.method2322(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2322(this.field2913[var4]);
        }
    }

    @ObfuscatedName("fj.s(B)V")
    public void method3268() {
        long var1 = this.field2920;
        int var3 = this.field2919[5];
        int var4 = this.field2919[9];
        this.field2919[5] = var4;
        this.field2919[9] = var3;
        this.field2920 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2920 <<= 0x4;
            if (this.field2919[var5] >= 256) {
                this.field2920 += (long) (this.field2919[var5] - 256);
            }
        }
        if (this.field2919[0] >= 256) {
            this.field2920 += (long) (this.field2919[0] - 256 >> 4);
        }
        if (this.field2919[1] >= 256) {
            this.field2920 += (long) (this.field2919[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2920 <<= 0x3;
            this.field2920 += (long) this.field2913[var6];
        }
        this.field2920 <<= 0x1;
        this.field2920 += (long) (this.field2912 ? 1 : 0);
        this.field2919[5] = var3;
        this.field2919[9] = var4;
        if (var1 != 0L && this.field2920 != var1) {
            field2914.method3509(var1);
        }
    }

    @ObfuscatedName("fj.y(Lac;ILac;II)Ldk;")
    public class105 method3285(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2915 != -1) {
            return class40.method3484(this.field2915).method770(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2920;
        int[] var7 = this.field2919;
        if (arg0 != null && (arg0.field998 >= 0 || arg0.field993 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2919[var8];
            }
            if (arg0.field998 >= 0) {
                var5 += (long) (arg0.field998 - this.field2919[5] << 40);
                var7[5] = arg0.field998;
            }
            if (arg0.field993 >= 0) {
                var5 += (long) (arg0.field993 - this.field2919[3] << 48);
                var7[3] = arg0.field993;
            }
        }
        class105 var9 = (class105) field2914.method3510(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !Statics.method735(var12 - 256).method901()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method1933(var12 - 512).method1002(this.field2912)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2917 != -1L) {
                    var9 = (class105) field2914.method3510(this.field2917);
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
                        class100 var17 = Statics.method735(var16 - 256).method903();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method1933(var16 - 512).method999(this.field2912);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2913[var20] < Statics.field623[var20].length) {
                        var19.method2062(Statics.field3149[var20], Statics.field623[var20][this.field2913[var20]]);
                    }
                    if (this.field2913[var20] < Statics.field1941[var20].length) {
                        var19.method2062(Statics.field2918[var20], Statics.field1941[var20][this.field2913[var20]]);
                    }
                }
                var9 = var19.method2059(64, 850, -30, -50, -30);
                field2914.method3512(var9, var5);
                this.field2917 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method872(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method846(var9, arg3);
        } else {
            var21 = arg0.method846(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fj.t(B)Lcf;")
    public class100 method3270() {
        if (this.field2915 != -1) {
            return class40.method3484(this.field2915).method760();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2919[var2];
            if (var3 >= 256 && var3 < 512 && !Statics.method735(var3 - 256).method900()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method1933(var3 - 512).method998(this.field2912)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2919[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = Statics.method735(var7 - 256).method920();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method1933(var7 - 512).method1030(this.field2912);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2913[var11] < Statics.field623[var11].length) {
                var10.method2062(Statics.field3149[var11], Statics.field623[var11][this.field2913[var11]]);
            }
            if (this.field2913[var11] < Statics.field1941[var11].length) {
                var10.method2062(Statics.field2918[var11], Statics.field1941[var11][this.field2913[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fj.w(I)I")
    public int method3271() {
        return this.field2915 == -1 ? (this.field2919[11] << 5) + (this.field2919[8] << 10) + (this.field2919[0] << 15) + (this.field2913[4] << 20) + (this.field2913[0] << 25) + this.field2919[1] : 305419896 + class40.method3484(this.field2915).field881;
    }
}
