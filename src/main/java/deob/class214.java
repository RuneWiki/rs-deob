package deob;

@ObfuscatedName("hk")
public class class214 {

    @ObfuscatedName("hk.n")
    public int[] field2626;

    @ObfuscatedName("hk.p")
    public int[] field2623;

    @ObfuscatedName("hk.i")
    public boolean field2624;

    @ObfuscatedName("hk.j")
    public int field2632;

    @ObfuscatedName("hk.f")
    public long field2629;

    @ObfuscatedName("hk.m")
    public long field2627;

    @ObfuscatedName("hk.e")
    public static final int[] field2630 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hk.o")
    public static class190 field2631 = new class190(260);

    @ObfuscatedName("hk.n([I[IZII)V")
    public void method3711(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3354; var6++) {
                    class248 var7 = class248.method1040(var6);
                    if (var7 != null && !var7.field3355 && (arg2 ? 7 : 0) + var5 == var7.field3356) {
                        arg0[field2630[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2626 = arg0;
        this.field2623 = arg1;
        this.field2624 = arg2;
        this.field2632 = arg3;
        this.method3697();
    }

    @ObfuscatedName("hk.p(IZI)V")
    public void method3693(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2624) {
            return;
        }
        int var3 = this.field2626[field2630[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class248 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3354) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3354 - 1;
                }
            }
            var4 = class248.method1040(var3);
        } while (var4 == null || var4.field3355 || var4.field3356 != arg0 + (this.field2624 ? 7 : 0));
        this.field2626[field2630[arg0]] = var3 + 256;
        this.method3697();
    }

    @ObfuscatedName("hk.i(IZB)V")
    public void method3706(int arg0, boolean arg1) {
        int var3 = this.field2623[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2622[arg0].length) {
                    var3 = 0;
                }
            } while (!class215.method3134(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2622[arg0].length - 1;
                }
            } while (!class215.method3134(arg0, var3));
        }
        this.field2623[arg0] = var3;
        this.method3697();
    }

    @ObfuscatedName("hk.j(ZB)V")
    public void method3695(boolean arg0) {
        if (this.field2624 != arg0) {
            this.method3711((int[]) null, this.field2623, arg0, -1);
        }
    }

    @ObfuscatedName("hk.f(Lfl;I)V")
    public void method3696(class174 arg0) {
        arg0.method2906(this.field2624 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2626[field2630[var2]];
            if (var3 == 0) {
                arg0.method2906(-1);
            } else {
                arg0.method2906(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2906(this.field2623[var4]);
        }
    }

    @ObfuscatedName("hk.m(S)V")
    public void method3697() {
        long var1 = this.field2629;
        int var3 = this.field2626[5];
        int var4 = this.field2626[9];
        this.field2626[5] = var4;
        this.field2626[9] = var3;
        this.field2629 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2629 <<= 0x4;
            if (this.field2626[var5] >= 256) {
                this.field2629 += (long) (this.field2626[var5] - 256);
            }
        }
        if (this.field2626[0] >= 256) {
            this.field2629 += (long) (this.field2626[0] - 256 >> 4);
        }
        if (this.field2626[1] >= 256) {
            this.field2629 += (long) (this.field2626[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2629 <<= 0x3;
            this.field2629 += (long) this.field2623[var6];
        }
        this.field2629 <<= 0x1;
        this.field2629 += (long) (this.field2624 ? 1 : 0);
        this.field2626[5] = var3;
        this.field2626[9] = var4;
        if (var1 != 0L && this.field2629 != var1) {
            field2631.method3279(var1);
        }
    }

    @ObfuscatedName("hk.c(Ljd;ILjd;II)Lek;")
    public class134 method3698(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field2632 != -1) {
            return Statics.method3798(this.field2632).method4352(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2629;
        int[] var7 = this.field2626;
        if (arg0 != null && (arg0.field3621 >= 0 || arg0.field3622 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2626[var8];
            }
            if (arg0.field3621 >= 0) {
                var5 += (long) (arg0.field3621 - this.field2626[5] << 40);
                var7[5] = arg0.field3621;
            }
            if (arg0.field3622 >= 0) {
                var5 += (long) (arg0.field3622 - this.field2626[3] << 48);
                var7[3] = arg0.field3622;
            }
        }
        class134 var9 = (class134) field2631.method3280(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class248.method1040(var12 - 256).method4084()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class257.method4344(var12 - 512).method4294(this.field2624)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2627 != -1L) {
                    var9 = (class134) field2631.method3280(this.field2627);
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
                        class128 var17 = class248.method1040(var16 - 256).method4095();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class128 var18 = class257.method4344(var16 - 512).method4295(this.field2624);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class128 var19 = new class128(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2623[var20] < Statics.field2622[var20].length) {
                        var19.method2299(Statics.field2628[var20], Statics.field2622[var20][this.field2623[var20]]);
                    }
                    if (this.field2623[var20] < Statics.field3672[var20].length) {
                        var19.method2299(Statics.field2612[var20], Statics.field3672[var20][this.field2623[var20]]);
                    }
                }
                var9 = var19.method2246(64, 850, -30, -50, -30);
                field2631.method3282(var9, var5);
                this.field2627 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class134 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4408(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4405(var9, arg3);
        } else {
            var21 = arg0.method4405(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hk.z(B)Ldu;")
    public class128 method3692() {
        if (this.field2632 != -1) {
            return Statics.method3798(this.field2632).method4362();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2626[var2];
            if (var3 >= 256 && var3 < 512 && !class248.method1040(var3 - 256).method4088()) {
                var1 = true;
            }
            if (var3 >= 512 && !class257.method4344(var3 - 512).method4296(this.field2624)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class128[] var4 = new class128[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2626[var6];
            if (var7 >= 256 && var7 < 512) {
                class128 var8 = class248.method1040(var7 - 256).method4091();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class128 var9 = class257.method4344(var7 - 512).method4300(this.field2624);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class128 var10 = new class128(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2623[var11] < Statics.field2622[var11].length) {
                var10.method2299(Statics.field2628[var11], Statics.field2622[var11][this.field2623[var11]]);
            }
            if (this.field2623[var11] < Statics.field3672[var11].length) {
                var10.method2299(Statics.field2612[var11], Statics.field3672[var11][this.field2623[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hk.h(I)I")
    public int method3700() {
        return this.field2632 == -1 ? (this.field2626[11] << 5) + (this.field2626[8] << 10) + (this.field2626[0] << 15) + (this.field2623[0] << 25) + (this.field2623[4] << 20) + this.field2626[1] : 305419896 + Statics.method3798(this.field2632).field3563;
    }
}
