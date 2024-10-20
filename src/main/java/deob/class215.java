package deob;

@ObfuscatedName("hr")
public class class215 {

    @ObfuscatedName("hr.z")
    public int[] field2525;

    @ObfuscatedName("hr.n")
    public int[] field2521;

    @ObfuscatedName("hr.v")
    public boolean field2522;

    @ObfuscatedName("hr.u")
    public int field2524;

    @ObfuscatedName("hr.r")
    public long field2527;

    @ObfuscatedName("hr.p")
    public long field2523;

    @ObfuscatedName("hr.c")
    public static final int[] field2528 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hr.b")
    public static class146 field2529 = new class146(260);

    @ObfuscatedName("hr.z([I[IZII)V")
    public void method3625(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field390; var6++) {
                    class246 var7 = class246.method3638(var6);
                    if (var7 != null && !var7.field3248 && var5 + (arg2 ? 7 : 0) == var7.field3251) {
                        arg0[field2528[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2525 = arg0;
        this.field2521 = arg1;
        this.field2522 = arg2;
        this.field2524 = arg3;
        this.method3604();
    }

    @ObfuscatedName("hr.n(IZI)V")
    public void method3633(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2522) {
            return;
        }
        int var3 = this.field2525[field2528[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class246 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field390) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field390 - 1;
                }
            }
            var4 = class246.method3638(var3);
        } while (var4 == null || var4.field3248 || var4.field3251 != arg0 + (this.field2522 ? 7 : 0));
        this.field2525[field2528[arg0]] = var3 + 256;
        this.method3604();
    }

    @ObfuscatedName("hr.v(IZI)V")
    public void method3599(int arg0, boolean arg1) {
        int var3 = this.field2521[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2520[arg0].length) {
                    var3 = 0;
                }
            } while (!class216.method3896(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2520[arg0].length - 1;
                }
            } while (!class216.method3896(arg0, var3));
        }
        this.field2521[arg0] = var3;
        this.method3604();
    }

    @ObfuscatedName("hr.u(ZI)V")
    public void method3602(boolean arg0) {
        if (this.field2522 != arg0) {
            this.method3625((int[]) null, this.field2521, arg0, -1);
        }
    }

    @ObfuscatedName("hr.r(Lkl;I)V")
    public void method3603(class300 arg0) {
        arg0.method5065(this.field2522 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2525[field2528[var2]];
            if (var3 == 0) {
                arg0.method5065(-1);
            } else {
                arg0.method5065(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5065(this.field2521[var4]);
        }
    }

    @ObfuscatedName("hr.p(I)V")
    public void method3604() {
        long var1 = this.field2527;
        int var3 = this.field2525[5];
        int var4 = this.field2525[9];
        this.field2525[5] = var4;
        this.field2525[9] = var3;
        this.field2527 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2527 <<= 0x4;
            if (this.field2525[var5] >= 256) {
                this.field2527 += (long) (this.field2525[var5] - 256);
            }
        }
        if (this.field2525[0] >= 256) {
            this.field2527 += (long) (this.field2525[0] - 256 >> 4);
        }
        if (this.field2525[1] >= 256) {
            this.field2527 += (long) (this.field2525[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2527 <<= 0x3;
            this.field2527 += (long) this.field2521[var6];
        }
        this.field2527 <<= 0x1;
        this.field2527 += (long) (this.field2522 ? 1 : 0);
        this.field2525[5] = var3;
        this.field2525[9] = var4;
        if (var1 != 0L && this.field2527 != var1) {
            field2529.method2993(var1);
        }
    }

    @ObfuscatedName("hr.q(Lix;ILix;IB)Ldh;")
    public class128 method3629(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field2524 != -1) {
            return class257.method3280(this.field2524).method4271(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2527;
        int[] var7 = this.field2525;
        if (arg0 != null && (arg0.field3513 >= 0 || arg0.field3514 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2525[var8];
            }
            if (arg0.field3513 >= 0) {
                var5 += (long) (arg0.field3513 - this.field2525[5] << 40);
                var7[5] = arg0.field3513;
            }
            if (arg0.field3514 >= 0) {
                var5 += (long) (arg0.field3514 - this.field2525[3] << 48);
                var7[3] = arg0.field3514;
            }
        }
        class128 var9 = (class128) field2529.method2992(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class246.method3638(var12 - 256).method4023()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class255.method2964(var12 - 512).method4200(this.field2522)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2523 != -1L) {
                    var9 = (class128) field2529.method2992(this.field2523);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class122[] var13 = new class122[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class122 var17 = class246.method3638(var16 - 256).method4008();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class122 var18 = class255.method2964(var16 - 512).method4201(this.field2522);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class122 var19 = new class122(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2521[var20] < Statics.field2520[var20].length) {
                        var19.method2507(Statics.field3448[var20], Statics.field2520[var20][this.field2521[var20]]);
                    }
                    if (this.field2521[var20] < Statics.field391[var20].length) {
                        var19.method2507(Statics.field2526[var20], Statics.field391[var20][this.field2521[var20]]);
                    }
                }
                var9 = var19.method2515(64, 850, -30, -50, -30);
                field2529.method2994(var9, var5);
                this.field2523 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class128 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4317(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4318(var9, arg3);
        } else {
            var21 = arg0.method4318(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hr.m(B)Ldw;")
    public class122 method3606() {
        if (this.field2524 != -1) {
            return class257.method3280(this.field2524).method4272();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2525[var2];
            if (var3 >= 256 && var3 < 512 && !class246.method3638(var3 - 256).method4019()) {
                var1 = true;
            }
            if (var3 >= 512 && !class255.method2964(var3 - 512).method4219(this.field2522)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class122[] var4 = new class122[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2525[var6];
            if (var7 >= 256 && var7 < 512) {
                class122 var8 = class246.method3638(var7 - 256).method4021();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class122 var9 = class255.method2964(var7 - 512).method4203(this.field2522);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class122 var10 = new class122(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2521[var11] < Statics.field2520[var11].length) {
                var10.method2507(Statics.field3448[var11], Statics.field2520[var11][this.field2521[var11]]);
            }
            if (this.field2521[var11] < Statics.field391[var11].length) {
                var10.method2507(Statics.field2526[var11], Statics.field391[var11][this.field2521[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hr.y(I)I")
    public int method3607() {
        return this.field2524 == -1 ? (this.field2525[11] << 5) + (this.field2525[8] << 10) + (this.field2525[0] << 15) + (this.field2521[0] << 25) + (this.field2521[4] << 20) + this.field2525[1] : 305419896 + class257.method3280(this.field2524).field3453;
    }

    @ObfuscatedName("lw.i(I)V")
    public static void method5341() {
        field2529.method2995();
    }
}
