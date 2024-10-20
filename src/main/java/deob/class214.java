package deob;

@ObfuscatedName("hu")
public class class214 {

    @ObfuscatedName("hu.a")
    public int[] field2623;

    @ObfuscatedName("hu.j")
    public int[] field2620;

    @ObfuscatedName("hu.n")
    public boolean field2621;

    @ObfuscatedName("hu.r")
    public int field2619;

    @ObfuscatedName("hu.v")
    public long field2627;

    @ObfuscatedName("hu.e")
    public long field2624;

    @ObfuscatedName("hu.m")
    public static final int[] field2625 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hu.u")
    public static class190 field2628 = new class190(260);

    @ObfuscatedName("hu.a([I[IZII)V")
    public void method3624(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3353; var6++) {
                    class248 var7 = class248.method3986(var6);
                    if (var7 != null && !var7.field3360 && var7.field3355 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2625[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2623 = arg0;
        this.field2620 = arg1;
        this.field2621 = arg2;
        this.field2619 = arg3;
        this.method3627();
    }

    @ObfuscatedName("hu.j(IZI)V")
    public void method3625(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2621) {
            return;
        }
        int var3 = this.field2623[field2625[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class248 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3353) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3353 - 1;
                }
            }
            var4 = class248.method3986(var3);
        } while (var4 == null || var4.field3360 || var4.field3355 != (this.field2621 ? 7 : 0) + arg0);
        this.field2623[field2625[arg0]] = var3 + 256;
        this.method3627();
    }

    @ObfuscatedName("hu.n(IZI)V")
    public void method3629(int arg0, boolean arg1) {
        int var3 = this.field2620[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2508[arg0].length) {
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
                    var3 = Statics.field2508[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2620[arg0] = var3;
        this.method3627();
    }

    @ObfuscatedName("hu.r(ZB)V")
    public void method3641(boolean arg0) {
        if (this.field2621 != arg0) {
            this.method3624((int[]) null, this.field2620, arg0, -1);
        }
    }

    @ObfuscatedName("hu.v(Lfe;I)V")
    public void method3628(class174 arg0) {
        arg0.method2908(this.field2621 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2623[field2625[var2]];
            if (var3 == 0) {
                arg0.method2908(-1);
            } else {
                arg0.method2908(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2908(this.field2620[var4]);
        }
    }

    @ObfuscatedName("hu.e(I)V")
    public void method3627() {
        long var1 = this.field2627;
        int var3 = this.field2623[5];
        int var4 = this.field2623[9];
        this.field2623[5] = var4;
        this.field2623[9] = var3;
        this.field2627 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2627 <<= 0x4;
            if (this.field2623[var5] >= 256) {
                this.field2627 += (long) (this.field2623[var5] - 256);
            }
        }
        if (this.field2623[0] >= 256) {
            this.field2627 += (long) (this.field2623[0] - 256 >> 4);
        }
        if (this.field2623[1] >= 256) {
            this.field2627 += (long) (this.field2623[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2627 <<= 0x3;
            this.field2627 += (long) this.field2620[var6];
        }
        this.field2627 <<= 0x1;
        this.field2627 += (long) (this.field2621 ? 1 : 0);
        this.field2623[5] = var3;
        this.field2623[9] = var4;
        if (var1 != 0L && this.field2627 != var1) {
            field2628.method3246(var1);
        }
    }

    @ObfuscatedName("hu.l(Ljg;ILjg;IB)Lej;")
    public class134 method3630(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field2619 != -1) {
            return class259.method3748(this.field2619).method4239(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2627;
        int[] var7 = this.field2623;
        if (arg0 != null && (arg0.field3609 >= 0 || arg0.field3615 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2623[var8];
            }
            if (arg0.field3609 >= 0) {
                var5 += (long) (arg0.field3609 - this.field2623[5] << 40);
                var7[5] = arg0.field3609;
            }
            if (arg0.field3615 >= 0) {
                var5 += (long) (arg0.field3615 - this.field2623[3] << 48);
                var7[3] = arg0.field3615;
            }
        }
        class134 var9 = (class134) field2628.method3245(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class248.method3986(var12 - 256).method3990()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class257.method1498(var12 - 512).method4219(this.field2621)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2624 != -1L) {
                    var9 = (class134) field2628.method3245(this.field2624);
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
                        class128 var17 = class248.method3986(var16 - 256).method3991();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class128 var18 = class257.method1498(var16 - 512).method4187(this.field2621);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class128 var19 = new class128(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2620[var20] < Statics.field2508[var20].length) {
                        var19.method2186(Statics.field2626[var20], Statics.field2508[var20][this.field2620[var20]]);
                    }
                    if (this.field2620[var20] < Statics.field1415[var20].length) {
                        var19.method2186(Statics.field2622[var20], Statics.field1415[var20][this.field2620[var20]]);
                    }
                }
                var9 = var19.method2194(64, 850, -30, -50, -30);
                field2628.method3247(var9, var5);
                this.field2624 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class134 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4289(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4286(var9, arg3);
        } else {
            var21 = arg0.method4286(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hu.s(B)Ldv;")
    public class128 method3637() {
        if (this.field2619 != -1) {
            return class259.method3748(this.field2619).method4240();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2623[var2];
            if (var3 >= 256 && var3 < 512 && !class248.method3986(var3 - 256).method4006()) {
                var1 = true;
            }
            if (var3 >= 512 && !class257.method1498(var3 - 512).method4188(this.field2621)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class128[] var4 = new class128[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2623[var6];
            if (var7 >= 256 && var7 < 512) {
                class128 var8 = class248.method3986(var7 - 256).method3988();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class128 var9 = class257.method1498(var7 - 512).method4189(this.field2621);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class128 var10 = new class128(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2620[var11] < Statics.field2508[var11].length) {
                var10.method2186(Statics.field2626[var11], Statics.field2508[var11][this.field2620[var11]]);
            }
            if (this.field2620[var11] < Statics.field1415[var11].length) {
                var10.method2186(Statics.field2622[var11], Statics.field1415[var11][this.field2620[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hu.w(I)I")
    public int method3631() {
        return this.field2619 == -1 ? (this.field2623[11] << 5) + (this.field2623[8] << 10) + (this.field2623[0] << 15) + (this.field2620[0] << 25) + (this.field2620[4] << 20) + this.field2623[1] : 305419896 + class259.method3748(this.field2619).field3556;
    }
}
