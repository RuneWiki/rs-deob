package deob;

@ObfuscatedName("ks")
public class class300 {

    @ObfuscatedName("ks.a")
    public int[] field3431;

    @ObfuscatedName("ks.f")
    public int[] field3422;

    @ObfuscatedName("ks.c")
    public int field3426 = -1;

    @ObfuscatedName("ks.x")
    public int field3424 = 0;

    @ObfuscatedName("ks.h")
    public int field3425;

    @ObfuscatedName("ks.j")
    public long field3423;

    @ObfuscatedName("ks.y")
    public long field3421;

    @ObfuscatedName("ks.d")
    public class175[] field3428;

    @ObfuscatedName("ks.n")
    public boolean field3429 = false;

    @ObfuscatedName("ks.b")
    public static final int[] field3427 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ks.o")
    public static class266 field3430 = new class266(260);

    @ObfuscatedName("ks.a([I[Lfw;Z[IIIII)V")
    public void method5183(int[] arg0, class175[] arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6) {
        this.field3428 = arg1;
        this.field3429 = arg2;
        this.field3426 = arg6;
        this.method5184(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("ks.f([I[IIII)V")
    public void method5184(int[] arg0, int[] arg1, int arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1908; var6++) {
                    class180 var7 = class180.method2038(var6);
                    if (var7 != null && !var7.field1912 && var5 + (arg2 == 1 ? 7 : 0) == var7.field1905) {
                        arg0[field3427[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3431 = arg0;
        this.field3422 = arg1;
        this.field3424 = arg2;
        this.field3425 = arg3;
        this.method5188();
    }

    @ObfuscatedName("ks.c(IZB)V")
    public void method5186(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3424 == 1) {
            return;
        }
        int var3 = this.field3431[field3427[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class180 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1908) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1908 - 1;
                }
            }
            var4 = class180.method2038(var3);
        } while (var4 == null || var4.field1912 || arg0 + (this.field3424 == 1 ? 7 : 0) != var4.field1905);
        this.field3431[field3427[arg0]] = var3 + 256;
        this.method5188();
    }

    @ObfuscatedName("ks.x(IZI)V")
    public void method5198(int arg0, boolean arg1) {
        int var3 = this.field3422[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field194[arg0].length) {
                    var3 = 0;
                }
            } while (!class302.method2825(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field194[arg0].length - 1;
                }
            } while (!class302.method2825(arg0, var3));
        }
        this.field3422[arg0] = var3;
        this.method5188();
    }

    @ObfuscatedName("ks.h(IB)V")
    public void method5185(int arg0) {
        if (this.field3424 != arg0) {
            this.method5184((int[]) null, this.field3422, arg0, -1);
        }
    }

    @ObfuscatedName("ks.j(Lqr;B)V")
    public void method5202(class464 arg0) {
        arg0.method7698(this.field3424);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3431[field3427[var2]];
            if (var3 == 0) {
                arg0.method7698(-1);
            } else {
                arg0.method7698(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method7698(this.field3422[var4]);
        }
    }

    @ObfuscatedName("ks.y(I)V")
    public void method5188() {
        long var1 = this.field3423;
        int var3 = this.field3431[5];
        int var4 = this.field3431[9];
        this.field3431[5] = var4;
        this.field3431[9] = var3;
        this.field3423 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3423 <<= 0x4;
            if (this.field3431[var5] >= 256) {
                this.field3423 += (long) (this.field3431[var5] - 256);
            }
        }
        if (this.field3431[0] >= 256) {
            this.field3423 += (long) (this.field3431[0] - 256 >> 4);
        }
        if (this.field3431[1] >= 256) {
            this.field3423 += (long) (this.field3431[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3423 <<= 0x3;
            this.field3423 += (long) this.field3422[var6];
        }
        this.field3423 <<= 0x1;
        this.field3423 += (long) (this.field3424 * 568602533) * 1040392237L;
        this.field3431[5] = var3;
        this.field3431[9] = var4;
        if (var1 != 0L && this.field3423 != var1 || this.field3429) {
            field3430.method4841(var1);
        }
    }

    @ObfuscatedName("ks.d(Lgg;ILgg;II)Lha;")
    public class221 method5189(class197 arg0, int arg1, class197 arg2, int arg3) {
        if (this.field3425 != -1) {
            return class185.method3209(this.field3425).method3240(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field3423;
        int[] var7 = this.field3431;
        if (arg0 != null && (arg0.field2216 >= 0 || arg0.field2210 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3431[var8];
            }
            if (arg0.field2216 >= 0) {
                var5 += (long) (arg0.field2216 - this.field3431[5] << 40);
                var7[5] = arg0.field2216;
            }
            if (arg0.field2210 >= 0) {
                var5 += (long) (arg0.field2210 - this.field3431[3] << 48);
                var7[3] = arg0.field2210;
            }
        }
        class221 var9 = (class221) field3430.method4839(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class180.method2038(var12 - 256).method3162()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class195.method5052(var12 - 512).method3516(this.field3424)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3421 != -1L) {
                    var9 = (class221) field3430.method4839(this.field3421);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class206[] var13 = new class206[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class206 var17 = class180.method2038(var16 - 256).method3177();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class195 var18 = class195.method5052(var16 - 512);
                        class206 var19 = var18.method3469(this.field3424);
                        if (var19 != null) {
                            if (this.field3428 != null) {
                                class175 var20 = this.field3428[var15];
                                if (var20 != null) {
                                    if (var20.field1859 != null && var18.field2145 != null && var18.field2146.length == var20.field1859.length) {
                                        for (int var21 = 0; var21 < var18.field2145.length; var21++) {
                                            var19.method3726(var18.field2146[var21], var20.field1859[var21]);
                                        }
                                    }
                                    if (var20.field1856 != null && var18.field2173 != null && var18.field2148.length == var20.field1856.length) {
                                        for (int var22 = 0; var22 < var18.field2173.length; var22++) {
                                            var19.method3727(var18.field2148[var22], var20.field1856[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class206 var23 = new class206(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3422[var24] < Statics.field194[var24].length) {
                        var23.method3726(Statics.field1781[var24], Statics.field194[var24][this.field3422[var24]]);
                    }
                    if (this.field3422[var24] < Statics.field1017[var24].length) {
                        var23.method3726(Statics.field115[var24], Statics.field1017[var24][this.field3422[var24]]);
                    }
                }
                var9 = var23.method3732(64, 850, -30, -50, -30);
                field3430.method4834(var9, var5);
                this.field3421 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class221 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method3562(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3569(var9, arg3);
        } else {
            var25 = arg0.method3569(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("ks.n(B)Lgs;")
    public class206 method5190() {
        if (this.field3425 != -1) {
            return class185.method3209(this.field3425).method3270();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3431[var2];
            if (var3 >= 256 && var3 < 512 && !class180.method2038(var3 - 256).method3164()) {
                var1 = true;
            }
            if (var3 >= 512 && !class195.method5052(var3 - 512).method3514(this.field3424)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class206[] var4 = new class206[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3431[var6];
            if (var7 >= 256 && var7 < 512) {
                class206 var8 = class180.method2038(var7 - 256).method3166();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class206 var9 = class195.method5052(var7 - 512).method3477(this.field3424);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class206 var10 = new class206(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3422[var11] < Statics.field194[var11].length) {
                var10.method3726(Statics.field1781[var11], Statics.field194[var11][this.field3422[var11]]);
            }
            if (this.field3422[var11] < Statics.field1017[var11].length) {
                var10.method3726(Statics.field115[var11], Statics.field1017[var11][this.field3422[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ks.r(B)I")
    public int method5215() {
        return this.field3425 == -1 ? (this.field3431[11] << 5) + (this.field3431[8] << 10) + (this.field3431[0] << 15) + (this.field3422[0] << 25) + (this.field3422[4] << 20) + this.field3431[1] : 305419896 + class185.method3209(this.field3425).field1959;
    }

    @ObfuscatedName("gl.l(I)V")
    public static void method3235() {
        field3430.method4837();
    }
}
