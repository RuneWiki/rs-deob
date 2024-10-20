package deob;

@ObfuscatedName("ha")
public class class221 {

    @ObfuscatedName("ha.b")
    public int[] field2694;

    @ObfuscatedName("ha.s")
    public int[] field2689;

    @ObfuscatedName("ha.r")
    public boolean field2688;

    @ObfuscatedName("ha.g")
    public int field2691;

    @ObfuscatedName("ha.x")
    public long field2692;

    @ObfuscatedName("ha.f")
    public long field2690;

    @ObfuscatedName("ha.d")
    public static final int[] field2695 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ha.o")
    public static class197 field2696 = new class197(260);

    @ObfuscatedName("ha.b([I[IZIB)V")
    public void method3701(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2592; var6++) {
                    class255 var7 = Statics.method3684(var6);
                    if (var7 != null && !var7.field3406 && var5 + (arg2 ? 7 : 0) == var7.field3403) {
                        arg0[field2695[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2694 = arg0;
        this.field2689 = arg1;
        this.field2688 = arg2;
        this.field2691 = arg3;
        this.method3706();
    }

    @ObfuscatedName("ha.s(IZS)V")
    public void method3702(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2688) {
            return;
        }
        int var3 = this.field2694[field2695[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class255 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2592) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2592 - 1;
                }
            }
            var4 = Statics.method3684(var3);
        } while (var4 == null || var4.field3406 || var4.field3403 != (this.field2688 ? 7 : 0) + arg0);
        this.field2694[field2695[arg0]] = var3 + 256;
        this.method3706();
    }

    @ObfuscatedName("ha.r(IZI)V")
    public void method3703(int arg0, boolean arg1) {
        int var3 = this.field2689[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2693[arg0].length) {
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
                    var3 = Statics.field2693[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2689[arg0] = var3;
        this.method3706();
    }

    @ObfuscatedName("ha.g(ZS)V")
    public void method3704(boolean arg0) {
        if (this.field2688 != arg0) {
            this.method3701((int[]) null, this.field2689, arg0, -1);
        }
    }

    @ObfuscatedName("ha.x(Lfs;I)V")
    public void method3705(class181 arg0) {
        arg0.method2929(this.field2688 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2694[field2695[var2]];
            if (var3 == 0) {
                arg0.method2929(-1);
            } else {
                arg0.method2929(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2929(this.field2689[var4]);
        }
    }

    @ObfuscatedName("ha.f(I)V")
    public void method3706() {
        long var1 = this.field2692;
        int var3 = this.field2694[5];
        int var4 = this.field2694[9];
        this.field2694[5] = var4;
        this.field2694[9] = var3;
        this.field2692 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2692 <<= 0x4;
            if (this.field2694[var5] >= 256) {
                this.field2692 += (long) (this.field2694[var5] - 256);
            }
        }
        if (this.field2694[0] >= 256) {
            this.field2692 += (long) (this.field2694[0] - 256 >> 4);
        }
        if (this.field2694[1] >= 256) {
            this.field2692 += (long) (this.field2694[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2692 <<= 0x3;
            this.field2692 += (long) this.field2689[var6];
        }
        this.field2692 <<= 0x1;
        this.field2692 += (long) (this.field2688 ? 1 : 0);
        this.field2694[5] = var3;
        this.field2694[9] = var4;
        if (var1 != 0L && this.field2692 != var1) {
            field2696.method3331(var1);
        }
    }

    @ObfuscatedName("ha.u(Ljh;ILjh;II)Lev;")
    public class133 method3718(class268 arg0, int arg1, class268 arg2, int arg3) {
        if (this.field2691 != -1) {
            return class266.method3591(this.field2691).method4331(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2692;
        int[] var7 = this.field2694;
        if (arg0 != null && (arg0.field3662 >= 0 || arg0.field3663 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2694[var8];
            }
            if (arg0.field3662 >= 0) {
                var5 += (long) (arg0.field3662 - this.field2694[5] << 40);
                var7[5] = arg0.field3662;
            }
            if (arg0.field3663 >= 0) {
                var5 += (long) (arg0.field3663 - this.field2694[3] << 48);
                var7[3] = arg0.field3663;
            }
        }
        class133 var9 = (class133) field2696.method3330(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !Statics.method3684(var12 - 256).method4054()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class264.method2662(var12 - 512).method4304(this.field2688)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2690 != -1L) {
                    var9 = (class133) field2696.method3330(this.field2690);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class127[] var13 = new class127[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class127 var17 = Statics.method3684(var16 - 256).method4055();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class127 var18 = class264.method2662(var16 - 512).method4276(this.field2688);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class127 var19 = new class127(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2689[var20] < Statics.field2693[var20].length) {
                        var19.method2232(Statics.field1344[var20], Statics.field2693[var20][this.field2689[var20]]);
                    }
                    if (this.field2689[var20] < Statics.field27[var20].length) {
                        var19.method2232(Statics.field1911[var20], Statics.field27[var20][this.field2689[var20]]);
                    }
                }
                var9 = var19.method2240(64, 850, -30, -50, -30);
                field2696.method3332(var9, var5);
                this.field2690 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class133 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4399(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4394(var9, arg3);
        } else {
            var21 = arg0.method4394(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ha.t(I)Lda;")
    public class127 method3708() {
        if (this.field2691 != -1) {
            return class266.method3591(this.field2691).method4332();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2694[var2];
            if (var3 >= 256 && var3 < 512 && !Statics.method3684(var3 - 256).method4056()) {
                var1 = true;
            }
            if (var3 >= 512 && !class264.method2662(var3 - 512).method4277(this.field2688)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class127[] var4 = new class127[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2694[var6];
            if (var7 >= 256 && var7 < 512) {
                class127 var8 = Statics.method3684(var7 - 256).method4057();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class127 var9 = class264.method2662(var7 - 512).method4278(this.field2688);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class127 var10 = new class127(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2689[var11] < Statics.field2693[var11].length) {
                var10.method2232(Statics.field1344[var11], Statics.field2693[var11][this.field2689[var11]]);
            }
            if (this.field2689[var11] < Statics.field27[var11].length) {
                var10.method2232(Statics.field1911[var11], Statics.field27[var11][this.field2689[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ha.k(I)I")
    public int method3709() {
        return this.field2691 == -1 ? (this.field2694[11] << 5) + (this.field2694[8] << 10) + (this.field2694[0] << 15) + (this.field2689[0] << 25) + (this.field2689[4] << 20) + this.field2694[1] : 305419896 + class266.method3591(this.field2691).field3605;
    }
}
