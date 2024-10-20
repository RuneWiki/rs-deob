package deob;

@ObfuscatedName("he")
public class class215 {

    @ObfuscatedName("he.a")
    public int[] field2524;

    @ObfuscatedName("he.t")
    public int[] field2515;

    @ObfuscatedName("he.n")
    public boolean field2516;

    @ObfuscatedName("he.q")
    public int field2517;

    @ObfuscatedName("he.v")
    public long field2518;

    @ObfuscatedName("he.l")
    public long field2519;

    @ObfuscatedName("he.m")
    public static final int[] field2522 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("he.p")
    public static class146 field2523 = new class146(260);

    @ObfuscatedName("he.a([I[IZII)V")
    public void method3737(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3252; var6++) {
                    class246 var7 = class246.method5455(var6);
                    if (var7 != null && !var7.field3260 && var7.field3256 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2522[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2524 = arg0;
        this.field2515 = arg1;
        this.field2516 = arg2;
        this.field2517 = arg3;
        this.method3742();
    }

    @ObfuscatedName("he.t(IZI)V")
    public void method3738(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2516) {
            return;
        }
        int var3 = this.field2524[field2522[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class246 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3252) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3252 - 1;
                }
            }
            var4 = class246.method5455(var3);
        } while (var4 == null || var4.field3260 || arg0 + (this.field2516 ? 7 : 0) != var4.field3256);
        this.field2524[field2522[arg0]] = var3 + 256;
        this.method3742();
    }

    @ObfuscatedName("he.n(IZB)V")
    public void method3739(int arg0, boolean arg1) {
        int var3 = this.field2515[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2521[arg0].length) {
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
                    var3 = Statics.field2521[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2515[arg0] = var3;
        this.method3742();
    }

    @ObfuscatedName("he.q(ZI)V")
    public void method3740(boolean arg0) {
        if (this.field2516 != arg0) {
            this.method3737((int[]) null, this.field2515, arg0, -1);
        }
    }

    @ObfuscatedName("he.v(Lkc;I)V")
    public void method3741(class300 arg0) {
        arg0.method5253(this.field2516 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2524[field2522[var2]];
            if (var3 == 0) {
                arg0.method5253(-1);
            } else {
                arg0.method5253(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5253(this.field2515[var4]);
        }
    }

    @ObfuscatedName("he.l(I)V")
    public void method3742() {
        long var1 = this.field2518;
        int var3 = this.field2524[5];
        int var4 = this.field2524[9];
        this.field2524[5] = var4;
        this.field2524[9] = var3;
        this.field2518 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2518 <<= 0x4;
            if (this.field2524[var5] >= 256) {
                this.field2518 += (long) (this.field2524[var5] - 256);
            }
        }
        if (this.field2524[0] >= 256) {
            this.field2518 += (long) (this.field2524[0] - 256 >> 4);
        }
        if (this.field2524[1] >= 256) {
            this.field2518 += (long) (this.field2524[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2518 <<= 0x3;
            this.field2518 += (long) this.field2515[var6];
        }
        this.field2518 <<= 0x1;
        this.field2518 += (long) (this.field2516 ? 1 : 0);
        this.field2524[5] = var3;
        this.field2524[9] = var4;
        if (var1 != 0L && this.field2518 != var1) {
            field2523.method3119(var1);
        }
    }

    @ObfuscatedName("he.c(Liv;ILiv;II)Ldv;")
    public class128 method3753(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field2517 != -1) {
            return class257.method1054(this.field2517).method4406(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2518;
        int[] var7 = this.field2524;
        if (arg0 != null && (arg0.field3517 >= 0 || arg0.field3518 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2524[var8];
            }
            if (arg0.field3517 >= 0) {
                var5 += (long) (arg0.field3517 - this.field2524[5] << 40);
                var7[5] = arg0.field3517;
            }
            if (arg0.field3518 >= 0) {
                var5 += (long) (arg0.field3518 - this.field2524[3] << 48);
                var7[3] = arg0.field3518;
            }
        }
        class128 var9 = (class128) field2523.method3120(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class246.method5455(var12 - 256).method4155()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class255.method3852(var12 - 512).method4344(this.field2516)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2519 != -1L) {
                    var9 = (class128) field2523.method3120(this.field2519);
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
                        class122 var17 = class246.method5455(var16 - 256).method4156();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class122 var18 = class255.method3852(var16 - 512).method4345(this.field2516);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class122 var19 = new class122(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2515[var20] < Statics.field2521[var20].length) {
                        var19.method2640(Statics.field2520[var20], Statics.field2521[var20][this.field2515[var20]]);
                    }
                    if (this.field2515[var20] < Statics.field2360[var20].length) {
                        var19.method2640(Statics.field3882[var20], Statics.field2360[var20][this.field2515[var20]]);
                    }
                }
                var9 = var19.method2660(64, 850, -30, -50, -30);
                field2523.method3122(var9, var5);
                this.field2519 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class128 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4468(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4454(var9, arg3);
        } else {
            var21 = arg0.method4454(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("he.o(B)Ldu;")
    public class122 method3744() {
        if (this.field2517 != -1) {
            return class257.method1054(this.field2517).method4407();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2524[var2];
            if (var3 >= 256 && var3 < 512 && !class246.method5455(var3 - 256).method4157()) {
                var1 = true;
            }
            if (var3 >= 512 && !class255.method3852(var3 - 512).method4346(this.field2516)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class122[] var4 = new class122[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2524[var6];
            if (var7 >= 256 && var7 < 512) {
                class122 var8 = class246.method5455(var7 - 256).method4158();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class122 var9 = class255.method3852(var7 - 512).method4347(this.field2516);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class122 var10 = new class122(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2515[var11] < Statics.field2521[var11].length) {
                var10.method2640(Statics.field2520[var11], Statics.field2521[var11][this.field2515[var11]]);
            }
            if (this.field2515[var11] < Statics.field2360[var11].length) {
                var10.method2640(Statics.field3882[var11], Statics.field2360[var11][this.field2515[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("he.i(I)I")
    public int method3750() {
        return this.field2517 == -1 ? (this.field2524[11] << 5) + (this.field2524[8] << 10) + (this.field2524[0] << 15) + (this.field2515[0] << 25) + (this.field2515[4] << 20) + this.field2524[1] : 305419896 + class257.method1054(this.field2517).field3465;
    }

    @ObfuscatedName("gv.d(B)V")
    public static void method3684() {
        field2523.method3123();
    }
}
