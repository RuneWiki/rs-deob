package deob;

@ObfuscatedName("hp")
public class class214 {

    @ObfuscatedName("hp.c")
    public int[] field2586;

    @ObfuscatedName("hp.o")
    public int[] field2593;

    @ObfuscatedName("hp.i")
    public boolean field2585;

    @ObfuscatedName("hp.u")
    public int field2587;

    @ObfuscatedName("hp.g")
    public long field2588;

    @ObfuscatedName("hp.m")
    public long field2589;

    @ObfuscatedName("hp.r")
    public static final int[] field2590 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hp.w")
    public static class190 field2594 = new class190(260);

    @ObfuscatedName("hp.c([I[IZII)V")
    public void method3597(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3324; var6++) {
                    class248 var7 = class248.method4432(var6);
                    if (var7 != null && !var7.field3326 && var7.field3328 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2590[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2586 = arg0;
        this.field2593 = arg1;
        this.field2585 = arg2;
        this.field2587 = arg3;
        this.method3602();
    }

    @ObfuscatedName("hp.o(IZB)V")
    public void method3598(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2585) {
            return;
        }
        int var3 = this.field2586[field2590[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class248 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3324) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3324 - 1;
                }
            }
            var4 = class248.method4432(var3);
        } while (var4 == null || var4.field3326 || (this.field2585 ? 7 : 0) + arg0 != var4.field3328);
        this.field2586[field2590[arg0]] = var3 + 256;
        this.method3602();
    }

    @ObfuscatedName("hp.i(IZI)V")
    public void method3618(int arg0, boolean arg1) {
        int var3 = this.field2593[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2591[arg0].length) {
                    var3 = 0;
                }
            } while (!class215.method3686(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2591[arg0].length - 1;
                }
            } while (!class215.method3686(arg0, var3));
        }
        this.field2593[arg0] = var3;
        this.method3602();
    }

    @ObfuscatedName("hp.u(ZI)V")
    public void method3600(boolean arg0) {
        if (this.field2585 != arg0) {
            this.method3597((int[]) null, this.field2593, arg0, -1);
        }
    }

    @ObfuscatedName("hp.g(Lfp;I)V")
    public void method3601(class174 arg0) {
        arg0.method2922(this.field2585 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2586[field2590[var2]];
            if (var3 == 0) {
                arg0.method2922(-1);
            } else {
                arg0.method2922(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2922(this.field2593[var4]);
        }
    }

    @ObfuscatedName("hp.m(I)V")
    public void method3602() {
        long var1 = this.field2588;
        int var3 = this.field2586[5];
        int var4 = this.field2586[9];
        this.field2586[5] = var4;
        this.field2586[9] = var3;
        this.field2588 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2588 <<= 0x4;
            if (this.field2586[var5] >= 256) {
                this.field2588 += (long) (this.field2586[var5] - 256);
            }
        }
        if (this.field2586[0] >= 256) {
            this.field2588 += (long) (this.field2586[0] - 256 >> 4);
        }
        if (this.field2586[1] >= 256) {
            this.field2588 += (long) (this.field2586[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2588 <<= 0x3;
            this.field2588 += (long) this.field2593[var6];
        }
        this.field2588 <<= 0x1;
        this.field2588 += (long) (this.field2585 ? 1 : 0);
        this.field2586[5] = var3;
        this.field2586[9] = var4;
        if (var1 != 0L && this.field2588 != var1) {
            field2594.method3222(var1);
        }
    }

    @ObfuscatedName("hp.s(Ljc;ILjc;II)Leo;")
    public class134 method3603(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field2587 != -1) {
            return class259.method200(this.field2587).method4205(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2588;
        int[] var7 = this.field2586;
        if (arg0 != null && (arg0.field3592 >= 0 || arg0.field3593 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2586[var8];
            }
            if (arg0.field3592 >= 0) {
                var5 += (long) (arg0.field3592 - this.field2586[5] << 40);
                var7[5] = arg0.field3592;
            }
            if (arg0.field3593 >= 0) {
                var5 += (long) (arg0.field3593 - this.field2586[3] << 48);
                var7[3] = arg0.field3593;
            }
        }
        class134 var9 = (class134) field2594.method3220(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class248.method4432(var12 - 256).method3961()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class257.method44(var12 - 512).method4145(this.field2585)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2589 != -1L) {
                    var9 = (class134) field2594.method3220(this.field2589);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class128[] var13 = new class128[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class128 var17 = class248.method4432(var16 - 256).method3955();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class128 var18 = class257.method44(var16 - 512).method4146(this.field2585);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class128 var19 = new class128(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2593[var20] < Statics.field2591[var20].length) {
                        var19.method2153(Statics.field2584[var20], Statics.field2591[var20][this.field2593[var20]]);
                    }
                    if (this.field2593[var20] < Statics.field2592[var20].length) {
                        var19.method2153(Statics.field3297[var20], Statics.field2592[var20][this.field2593[var20]]);
                    }
                }
                var9 = var19.method2142(64, 850, -30, -50, -30);
                field2594.method3233(var9, var5);
                this.field2589 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class134 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4273(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4274(var9, arg3);
        } else {
            var21 = arg0.method4274(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hp.x(I)Ldj;")
    public class128 method3604() {
        if (this.field2587 != -1) {
            return class259.method200(this.field2587).method4206();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2586[var2];
            if (var3 >= 256 && var3 < 512 && !class248.method4432(var3 - 256).method3951()) {
                var1 = true;
            }
            if (var3 >= 512 && !class257.method44(var3 - 512).method4190(this.field2585)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class128[] var4 = new class128[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2586[var6];
            if (var7 >= 256 && var7 < 512) {
                class128 var8 = class248.method4432(var7 - 256).method3954();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class128 var9 = class257.method44(var7 - 512).method4148(this.field2585);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class128 var10 = new class128(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2593[var11] < Statics.field2591[var11].length) {
                var10.method2153(Statics.field2584[var11], Statics.field2591[var11][this.field2593[var11]]);
            }
            if (this.field2593[var11] < Statics.field2592[var11].length) {
                var10.method2153(Statics.field3297[var11], Statics.field2592[var11][this.field2593[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hp.p(I)I")
    public int method3612() {
        return this.field2587 == -1 ? (this.field2586[11] << 5) + (this.field2586[8] << 10) + (this.field2586[0] << 15) + (this.field2593[0] << 25) + (this.field2593[4] << 20) + this.field2586[1] : 305419896 + class259.method200(this.field2587).field3544;
    }

    @ObfuscatedName("bg.k(S)V")
    public static void method691() {
        field2594.method3223();
    }
}
