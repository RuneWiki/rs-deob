package deob;

@ObfuscatedName("is")
public class class235 {

    @ObfuscatedName("is.n")
    public int[] field2640;

    @ObfuscatedName("is.h")
    public int[] field2641;

    @ObfuscatedName("is.l")
    public boolean field2642;

    @ObfuscatedName("is.g")
    public int field2651;

    @ObfuscatedName("is.b")
    public long field2644;

    @ObfuscatedName("is.a")
    public long field2648;

    @ObfuscatedName("is.t")
    public static final int[] field2649 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("is.f")
    public static class208 field2650 = new class208(260);

    @ObfuscatedName("is.n([I[IZII)V")
    public void method4332(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3371; var6++) {
                    class266 var7 = class266.method3075(var6);
                    if (var7 != null && !var7.field3372 && (arg2 ? 7 : 0) + var5 == var7.field3365) {
                        arg0[field2649[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2640 = arg0;
        this.field2641 = arg1;
        this.field2642 = arg2;
        this.field2651 = arg3;
        this.method4337();
    }

    @ObfuscatedName("is.h(IZI)V")
    public void method4333(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2642) {
            return;
        }
        int var3 = this.field2640[field2649[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class266 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3371) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3371 - 1;
                }
            }
            var4 = class266.method3075(var3);
        } while (var4 == null || var4.field3372 || var4.field3365 != (this.field2642 ? 7 : 0) + arg0);
        this.field2640[field2649[arg0]] = var3 + 256;
        this.method4337();
    }

    @ObfuscatedName("is.l(IZI)V")
    public void method4338(int arg0, boolean arg1) {
        int var3 = this.field2641[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2647[arg0].length) {
                    var3 = 0;
                }
            } while (!class236.method3481(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2647[arg0].length - 1;
                }
            } while (!class236.method3481(arg0, var3));
        }
        this.field2641[arg0] = var3;
        this.method4337();
    }

    @ObfuscatedName("is.g(ZB)V")
    public void method4335(boolean arg0) {
        if (this.field2642 != arg0) {
            this.method4332((int[]) null, this.field2641, arg0, -1);
        }
    }

    @ObfuscatedName("is.b(Lgc;I)V")
    public void method4340(class190 arg0) {
        arg0.method3646(this.field2642 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2640[field2649[var2]];
            if (var3 == 0) {
                arg0.method3646(-1);
            } else {
                arg0.method3646(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3646(this.field2641[var4]);
        }
    }

    @ObfuscatedName("is.a(I)V")
    public void method4337() {
        long var1 = this.field2644;
        int var3 = this.field2640[5];
        int var4 = this.field2640[9];
        this.field2640[5] = var4;
        this.field2640[9] = var3;
        this.field2644 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2644 <<= 0x4;
            if (this.field2640[var5] >= 256) {
                this.field2644 += (long) (this.field2640[var5] - 256);
            }
        }
        if (this.field2640[0] >= 256) {
            this.field2644 += (long) (this.field2640[0] - 256 >> 4);
        }
        if (this.field2640[1] >= 256) {
            this.field2644 += (long) (this.field2640[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2644 <<= 0x3;
            this.field2644 += (long) this.field2641[var6];
        }
        this.field2644 <<= 0x1;
        this.field2644 += (long) (this.field2642 ? 1 : 0);
        this.field2640[5] = var3;
        this.field2640[9] = var4;
        if (var1 != 0L && this.field2644 != var1) {
            field2650.method3901(var1);
        }
    }

    @ObfuscatedName("is.c(Ljt;ILjt;II)Ldq;")
    public class127 method4348(class279 arg0, int arg1, class279 arg2, int arg3) {
        if (this.field2651 != -1) {
            return class277.method17(this.field2651).method4974(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2644;
        int[] var7 = this.field2640;
        if (arg0 != null && (arg0.field3611 >= 0 || arg0.field3598 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2640[var8];
            }
            if (arg0.field3611 >= 0) {
                var5 += (long) (arg0.field3611 - this.field2640[5] << 40);
                var7[5] = arg0.field3611;
            }
            if (arg0.field3598 >= 0) {
                var5 += (long) (arg0.field3598 - this.field2640[3] << 48);
                var7[3] = arg0.field3598;
            }
        }
        class127 var9 = (class127) field2650.method3902(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class266.method3075(var12 - 256).method4735()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class275.method4283(var12 - 512).method4918(this.field2642)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2648 != -1L) {
                    var9 = (class127) field2650.method3902(this.field2648);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class121[] var13 = new class121[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class121 var17 = class266.method3075(var16 - 256).method4720();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class121 var18 = class275.method4283(var16 - 512).method4919(this.field2642);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class121 var19 = new class121(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2641[var20] < Statics.field2647[var20].length) {
                        var19.method2648(Statics.field2646[var20], Statics.field2647[var20][this.field2641[var20]]);
                    }
                    if (this.field2641[var20] < Statics.field1964[var20].length) {
                        var19.method2648(Statics.field2643[var20], Statics.field1964[var20][this.field2641[var20]]);
                    }
                }
                var9 = var19.method2611(64, 850, -30, -50, -30);
                field2650.method3908(var9, var5);
                this.field2648 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class127 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method5040(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method5043(var9, arg3);
        } else {
            var21 = arg0.method5043(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("is.z(B)Lde;")
    public class121 method4339() {
        if (this.field2651 != -1) {
            return class277.method17(this.field2651).method4970();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2640[var2];
            if (var3 >= 256 && var3 < 512 && !class266.method3075(var3 - 256).method4721()) {
                var1 = true;
            }
            if (var3 >= 512 && !class275.method4283(var3 - 512).method4920(this.field2642)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class121[] var4 = new class121[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2640[var6];
            if (var7 >= 256 && var7 < 512) {
                class121 var8 = class266.method3075(var7 - 256).method4722();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class121 var9 = class275.method4283(var7 - 512).method4921(this.field2642);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class121 var10 = new class121(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2641[var11] < Statics.field2647[var11].length) {
                var10.method2648(Statics.field2646[var11], Statics.field2647[var11][this.field2641[var11]]);
            }
            if (this.field2641[var11] < Statics.field1964[var11].length) {
                var10.method2648(Statics.field2643[var11], Statics.field1964[var11][this.field2641[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("is.j(I)I")
    public int method4358() {
        return this.field2651 == -1 ? (this.field2640[11] << 5) + (this.field2640[8] << 10) + (this.field2640[0] << 15) + (this.field2641[0] << 25) + (this.field2641[4] << 20) + this.field2640[1] : 305419896 + class277.method17(this.field2651).field3573;
    }

    @ObfuscatedName("ho.d(I)V")
    public static void method4327() {
        field2650.method3899();
    }
}
