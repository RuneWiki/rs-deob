package deob;

@ObfuscatedName("hh")
public class class215 {

    @ObfuscatedName("hh.f")
    public int[] field2529;

    @ObfuscatedName("hh.i")
    public int[] field2524;

    @ObfuscatedName("hh.y")
    public boolean field2522;

    @ObfuscatedName("hh.w")
    public int field2523;

    @ObfuscatedName("hh.p")
    public long field2520;

    @ObfuscatedName("hh.b")
    public long field2528;

    @ObfuscatedName("hh.c")
    public static final int[] field2527 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hh.o")
    public static class155 field2525 = new class155(260);

    @ObfuscatedName("hh.f([I[IZII)V")
    public void method3631(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field67; var6++) {
                    class246 var7 = class246.method3328(var6);
                    if (var7 != null && !var7.field3244 && (arg2 ? 7 : 0) + var5 == var7.field3237) {
                        arg0[field2527[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2529 = arg0;
        this.field2524 = arg1;
        this.field2522 = arg2;
        this.field2523 = arg3;
        this.method3623();
    }

    @ObfuscatedName("hh.i(IZI)V")
    public void method3637(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2522) {
            return;
        }
        int var3 = this.field2529[field2527[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class246 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field67) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field67 - 1;
                }
            }
            var4 = class246.method3328(var3);
        } while (var4 == null || var4.field3244 || var4.field3237 != arg0 + (this.field2522 ? 7 : 0));
        this.field2529[field2527[arg0]] = var3 + 256;
        this.method3623();
    }

    @ObfuscatedName("hh.y(IZB)V")
    public void method3620(int arg0, boolean arg1) {
        int var3 = this.field2524[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field270[arg0].length) {
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
                    var3 = Statics.field270[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2524[arg0] = var3;
        this.method3623();
    }

    @ObfuscatedName("hh.w(ZB)V")
    public void method3621(boolean arg0) {
        if (this.field2522 != arg0) {
            this.method3631((int[]) null, this.field2524, arg0, -1);
        }
    }

    @ObfuscatedName("hh.p(Lkq;B)V")
    public void method3622(class300 arg0) {
        arg0.method5094(this.field2522 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2529[field2527[var2]];
            if (var3 == 0) {
                arg0.method5094(-1);
            } else {
                arg0.method5094(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5094(this.field2524[var4]);
        }
    }

    @ObfuscatedName("hh.b(I)V")
    public void method3623() {
        long var1 = this.field2520;
        int var3 = this.field2529[5];
        int var4 = this.field2529[9];
        this.field2529[5] = var4;
        this.field2529[9] = var3;
        this.field2520 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2520 <<= 0x4;
            if (this.field2529[var5] >= 256) {
                this.field2520 += (long) (this.field2529[var5] - 256);
            }
        }
        if (this.field2529[0] >= 256) {
            this.field2520 += (long) (this.field2529[0] - 256 >> 4);
        }
        if (this.field2529[1] >= 256) {
            this.field2520 += (long) (this.field2529[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2520 <<= 0x3;
            this.field2520 += (long) this.field2524[var6];
        }
        this.field2520 <<= 0x1;
        this.field2520 += (long) (this.field2522 ? 1 : 0);
        this.field2529[5] = var3;
        this.field2529[9] = var4;
        if (var1 != 0L && this.field2520 != var1) {
            field2525.method3100(var1);
        }
    }

    @ObfuscatedName("hh.e(Liv;ILiv;II)Ldw;")
    public class128 method3624(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field2523 != -1) {
            return class257.method4706(this.field2523).method4351(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2520;
        int[] var7 = this.field2529;
        if (arg0 != null && (arg0.field3491 >= 0 || arg0.field3492 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2529[var8];
            }
            if (arg0.field3491 >= 0) {
                var5 += (long) (arg0.field3491 - this.field2529[5] << 40);
                var7[5] = arg0.field3491;
            }
            if (arg0.field3492 >= 0) {
                var5 += (long) (arg0.field3492 - this.field2529[3] << 48);
                var7[3] = arg0.field3492;
            }
        }
        class128 var9 = (class128) field2525.method3099(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class246.method3328(var12 - 256).method4044()) {
                    var10 = true;
                }
                if (var12 >= 512 && !Statics.method3278(var12 - 512).method4302(this.field2522)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2528 != -1L) {
                    var9 = (class128) field2525.method3099(this.field2528);
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
                        class122 var17 = class246.method3328(var16 - 256).method4046();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class122 var18 = Statics.method3278(var16 - 512).method4316(this.field2522);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class122 var19 = new class122(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2524[var20] < Statics.field270[var20].length) {
                        var19.method2602(Statics.field2526[var20], Statics.field270[var20][this.field2524[var20]]);
                    }
                    if (this.field2524[var20] < Statics.field2067[var20].length) {
                        var19.method2602(Statics.field4011[var20], Statics.field2067[var20][this.field2524[var20]]);
                    }
                }
                var9 = var19.method2603(64, 850, -30, -50, -30);
                field2525.method3101(var9, var5);
                this.field2528 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class128 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4404(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4417(var9, arg3);
        } else {
            var21 = arg0.method4417(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hh.x(B)Ldd;")
    public class122 method3634() {
        if (this.field2523 != -1) {
            return class257.method4706(this.field2523).method4354();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2529[var2];
            if (var3 >= 256 && var3 < 512 && !class246.method3328(var3 - 256).method4043()) {
                var1 = true;
            }
            if (var3 >= 512 && !Statics.method3278(var3 - 512).method4305(this.field2522)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class122[] var4 = new class122[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2529[var6];
            if (var7 >= 256 && var7 < 512) {
                class122 var8 = class246.method3328(var7 - 256).method4047();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class122 var9 = Statics.method3278(var7 - 512).method4274(this.field2522);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class122 var10 = new class122(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2524[var11] < Statics.field270[var11].length) {
                var10.method2602(Statics.field2526[var11], Statics.field270[var11][this.field2524[var11]]);
            }
            if (this.field2524[var11] < Statics.field2067[var11].length) {
                var10.method2602(Statics.field4011[var11], Statics.field2067[var11][this.field2524[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hh.a(B)I")
    public int method3626() {
        return this.field2523 == -1 ? (this.field2529[11] << 5) + (this.field2529[8] << 10) + (this.field2529[0] << 15) + (this.field2524[4] << 20) + (this.field2524[0] << 25) + this.field2529[1] : 305419896 + class257.method4706(this.field2523).field3436;
    }

    @ObfuscatedName("s.d(I)V")
    public static void method135() {
        field2525.method3102();
    }
}
