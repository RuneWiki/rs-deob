package deob;

@ObfuscatedName("if")
public class class240 {

    @ObfuscatedName("if.t")
    public int[] field2787;

    @ObfuscatedName("if.q")
    public int[] field2783;

    @ObfuscatedName("if.i")
    public boolean field2784;

    @ObfuscatedName("if.a")
    public int field2782;

    @ObfuscatedName("if.l")
    public long field2786;

    @ObfuscatedName("if.b")
    public long field2788;

    @ObfuscatedName("if.n")
    public static final int[] field2791 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("if.o")
    public static class213 field2792 = new class213(260);

    @ObfuscatedName("if.t([I[IZIB)V")
    public void method4067(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3514; var6++) {
                    class275 var7 = class275.method512(var6);
                    if (var7 != null && !var7.field3523 && var7.field3516 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2791[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2787 = arg0;
        this.field2783 = arg1;
        this.field2784 = arg2;
        this.field2782 = arg3;
        this.method4061();
    }

    @ObfuscatedName("if.q(IZI)V")
    public void method4066(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2784) {
            return;
        }
        int var3 = this.field2787[field2791[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class275 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3514) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3514 - 1;
                }
            }
            var4 = class275.method512(var3);
        } while (var4 == null || var4.field3523 || arg0 + (this.field2784 ? 7 : 0) != var4.field3516);
        this.field2787[field2791[arg0]] = var3 + 256;
        this.method4061();
    }

    @ObfuscatedName("if.i(IZB)V")
    public void method4058(int arg0, boolean arg1) {
        int var3 = this.field2783[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2789[arg0].length) {
                    var3 = 0;
                }
            } while (!class241.method3208(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2789[arg0].length - 1;
                }
            } while (!class241.method3208(arg0, var3));
        }
        this.field2783[arg0] = var3;
        this.method4061();
    }

    @ObfuscatedName("if.a(ZI)V")
    public void method4057(boolean arg0) {
        if (this.field2784 != arg0) {
            this.method4067((int[]) null, this.field2783, arg0, -1);
        }
    }

    @ObfuscatedName("if.l(Lgb;I)V")
    public void method4060(class195 arg0) {
        arg0.method3220(this.field2784 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2787[field2791[var2]];
            if (var3 == 0) {
                arg0.method3220(-1);
            } else {
                arg0.method3220(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3220(this.field2783[var4]);
        }
    }

    @ObfuscatedName("if.b(B)V")
    public void method4061() {
        long var1 = this.field2786;
        int var3 = this.field2787[5];
        int var4 = this.field2787[9];
        this.field2787[5] = var4;
        this.field2787[9] = var3;
        this.field2786 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2786 <<= 0x4;
            if (this.field2787[var5] >= 256) {
                this.field2786 += (long) (this.field2787[var5] - 256);
            }
        }
        if (this.field2787[0] >= 256) {
            this.field2786 += (long) (this.field2787[0] - 256 >> 4);
        }
        if (this.field2787[1] >= 256) {
            this.field2786 += (long) (this.field2787[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2786 <<= 0x3;
            this.field2786 += (long) this.field2783[var6];
        }
        this.field2786 <<= 0x1;
        this.field2786 += (long) (this.field2784 ? 1 : 0);
        this.field2787[5] = var3;
        this.field2787[9] = var4;
        if (var1 != 0L && this.field2786 != var1) {
            field2792.method3626(var1);
        }
    }

    @ObfuscatedName("if.e(Lkf;ILkf;IB)Lek;")
    public class132 method4069(class288 arg0, int arg1, class288 arg2, int arg3) {
        if (this.field2782 != -1) {
            return class286.method4012(this.field2782).method4749(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2786;
        int[] var7 = this.field2787;
        if (arg0 != null && (arg0.field3768 >= 0 || arg0.field3769 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2787[var8];
            }
            if (arg0.field3768 >= 0) {
                var5 += (long) (arg0.field3768 - this.field2787[5] << 40);
                var7[5] = arg0.field3768;
            }
            if (arg0.field3769 >= 0) {
                var5 += (long) (arg0.field3769 - this.field2787[3] << 48);
                var7[3] = arg0.field3769;
            }
        }
        class132 var9 = (class132) field2792.method3625(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class275.method512(var12 - 256).method4455()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class284.method1694(var12 - 512).method4660(this.field2784)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2788 != -1L) {
                    var9 = (class132) field2792.method3625(this.field2788);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class126[] var13 = new class126[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class126 var17 = class275.method512(var16 - 256).method4447();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class126 var18 = class284.method1694(var16 - 512).method4661(this.field2784);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class126 var19 = new class126(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2783[var20] < Statics.field2789[var20].length) {
                        var19.method2435(Statics.field2785[var20], Statics.field2789[var20][this.field2783[var20]]);
                    }
                    if (this.field2783[var20] < Statics.field2790[var20].length) {
                        var19.method2435(Statics.field261[var20], Statics.field2790[var20][this.field2783[var20]]);
                    }
                }
                var9 = var19.method2395(64, 850, -30, -50, -30);
                field2792.method3627(var9, var5);
                this.field2788 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class132 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4781(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4778(var9, arg3);
        } else {
            var21 = arg0.method4778(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("if.x(I)Ldi;")
    public class126 method4063() {
        if (this.field2782 != -1) {
            return class286.method4012(this.field2782).method4723();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2787[var2];
            if (var3 >= 256 && var3 < 512 && !class275.method512(var3 - 256).method4450()) {
                var1 = true;
            }
            if (var3 >= 512 && !class284.method1694(var3 - 512).method4658(this.field2784)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class126[] var4 = new class126[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2787[var6];
            if (var7 >= 256 && var7 < 512) {
                class126 var8 = class275.method512(var7 - 256).method4449();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class126 var9 = class284.method1694(var7 - 512).method4663(this.field2784);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class126 var10 = new class126(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2783[var11] < Statics.field2789[var11].length) {
                var10.method2435(Statics.field2785[var11], Statics.field2789[var11][this.field2783[var11]]);
            }
            if (this.field2783[var11] < Statics.field2790[var11].length) {
                var10.method2435(Statics.field261[var11], Statics.field2790[var11][this.field2783[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("if.p(I)I")
    public int method4064() {
        return this.field2782 == -1 ? (this.field2787[11] << 5) + (this.field2787[8] << 10) + (this.field2787[0] << 15) + (this.field2783[0] << 25) + (this.field2783[4] << 20) + this.field2787[1] : 305419896 + class286.method4012(this.field2782).field3710;
    }

    @ObfuscatedName("gt.o(I)V")
    public static void method3474() {
        field2792.method3632();
    }
}
