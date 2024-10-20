package deob;

@ObfuscatedName("hy")
public class class215 {

    @ObfuscatedName("hy.s")
    public int[] field2518;

    @ObfuscatedName("hy.j")
    public int[] field2519;

    @ObfuscatedName("hy.i")
    public boolean field2522;

    @ObfuscatedName("hy.k")
    public int field2521;

    @ObfuscatedName("hy.u")
    public long field2520;

    @ObfuscatedName("hy.n")
    public long field2523;

    @ObfuscatedName("hy.f")
    public static final int[] field2525 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hy.c")
    public static class146 field2526 = new class146(260);

    @ObfuscatedName("hy.s([I[IZIB)V")
    public void method3665(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3248; var6++) {
                    class246 var7 = class246.method855(var6);
                    if (var7 != null && !var7.field3250 && var7.field3247 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2525[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2518 = arg0;
        this.field2519 = arg1;
        this.field2522 = arg2;
        this.field2521 = arg3;
        this.method3647();
    }

    @ObfuscatedName("hy.j(IZI)V")
    public void method3643(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2522) {
            return;
        }
        int var3 = this.field2518[field2525[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class246 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3248) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3248 - 1;
                }
            }
            var4 = class246.method855(var3);
        } while (var4 == null || var4.field3250 || arg0 + (this.field2522 ? 7 : 0) != var4.field3247);
        this.field2518[field2525[arg0]] = var3 + 256;
        this.method3647();
    }

    @ObfuscatedName("hy.i(IZI)V")
    public void method3644(int arg0, boolean arg1) {
        int var3 = this.field2519[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field3652[arg0].length) {
                    var3 = 0;
                }
            } while (!class216.method671(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3652[arg0].length - 1;
                }
            } while (!class216.method671(arg0, var3));
        }
        this.field2519[arg0] = var3;
        this.method3647();
    }

    @ObfuscatedName("hy.k(ZI)V")
    public void method3651(boolean arg0) {
        if (this.field2522 != arg0) {
            this.method3665((int[]) null, this.field2519, arg0, -1);
        }
    }

    @ObfuscatedName("hy.u(Lky;I)V")
    public void method3662(class300 arg0) {
        arg0.method5083(this.field2522 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2518[field2525[var2]];
            if (var3 == 0) {
                arg0.method5083(-1);
            } else {
                arg0.method5083(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5083(this.field2519[var4]);
        }
    }

    @ObfuscatedName("hy.n(I)V")
    public void method3647() {
        long var1 = this.field2520;
        int var3 = this.field2518[5];
        int var4 = this.field2518[9];
        this.field2518[5] = var4;
        this.field2518[9] = var3;
        this.field2520 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2520 <<= 0x4;
            if (this.field2518[var5] >= 256) {
                this.field2520 += (long) (this.field2518[var5] - 256);
            }
        }
        if (this.field2518[0] >= 256) {
            this.field2520 += (long) (this.field2518[0] - 256 >> 4);
        }
        if (this.field2518[1] >= 256) {
            this.field2520 += (long) (this.field2518[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2520 <<= 0x3;
            this.field2520 += (long) this.field2519[var6];
        }
        this.field2520 <<= 0x1;
        this.field2520 += (long) (this.field2522 ? 1 : 0);
        this.field2518[5] = var3;
        this.field2518[9] = var4;
        if (var1 != 0L && this.field2520 != var1) {
            field2526.method3066(var1);
        }
    }

    @ObfuscatedName("hy.t(Lij;ILij;II)Ldo;")
    public class128 method3661(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field2521 != -1) {
            return class257.method2739(this.field2521).method4321(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2520;
        int[] var7 = this.field2518;
        if (arg0 != null && (arg0.field3504 >= 0 || arg0.field3505 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2518[var8];
            }
            if (arg0.field3504 >= 0) {
                var5 += (long) (arg0.field3504 - this.field2518[5] << 40);
                var7[5] = arg0.field3504;
            }
            if (arg0.field3505 >= 0) {
                var5 += (long) (arg0.field3505 - this.field2518[3] << 48);
                var7[3] = arg0.field3505;
            }
        }
        class128 var9 = (class128) field2526.method3065(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class246.method855(var12 - 256).method4045()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class255.method144(var12 - 512).method4243(this.field2522)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2523 != -1L) {
                    var9 = (class128) field2526.method3065(this.field2523);
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
                        class122 var17 = class246.method855(var16 - 256).method4046();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class122 var18 = class255.method144(var16 - 512).method4244(this.field2522);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class122 var19 = new class122(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2519[var20] < Statics.field3652[var20].length) {
                        var19.method2534(Statics.field388[var20], Statics.field3652[var20][this.field2519[var20]]);
                    }
                    if (this.field2519[var20] < Statics.field1419[var20].length) {
                        var19.method2534(Statics.field2524[var20], Statics.field1419[var20][this.field2519[var20]]);
                    }
                }
                var9 = var19.method2542(64, 850, -30, -50, -30);
                field2526.method3067(var9, var5);
                this.field2523 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class128 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4366(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4368(var9, arg3);
        } else {
            var21 = arg0.method4368(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hy.q(I)Ldq;")
    public class122 method3649() {
        if (this.field2521 != -1) {
            return class257.method2739(this.field2521).method4324();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2518[var2];
            if (var3 >= 256 && var3 < 512 && !class246.method855(var3 - 256).method4047()) {
                var1 = true;
            }
            if (var3 >= 512 && !class255.method144(var3 - 512).method4245(this.field2522)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class122[] var4 = new class122[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2518[var6];
            if (var7 >= 256 && var7 < 512) {
                class122 var8 = class246.method855(var7 - 256).method4048();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class122 var9 = class255.method144(var7 - 512).method4246(this.field2522);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class122 var10 = new class122(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2519[var11] < Statics.field3652[var11].length) {
                var10.method2534(Statics.field388[var11], Statics.field3652[var11][this.field2519[var11]]);
            }
            if (this.field2519[var11] < Statics.field1419[var11].length) {
                var10.method2534(Statics.field2524[var11], Statics.field1419[var11][this.field2519[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hy.x(I)I")
    public int method3650() {
        return this.field2521 == -1 ? (this.field2518[11] << 5) + (this.field2518[8] << 10) + (this.field2518[0] << 15) + (this.field2519[0] << 25) + (this.field2519[4] << 20) + this.field2518[1] : 305419896 + class257.method2739(this.field2521).field3445;
    }
}
