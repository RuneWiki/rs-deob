package deob;

@ObfuscatedName("hj")
public class class225 {

    @ObfuscatedName("hj.p")
    public int[] field2707;

    @ObfuscatedName("hj.i")
    public int[] field2703;

    @ObfuscatedName("hj.w")
    public boolean field2704;

    @ObfuscatedName("hj.s")
    public int field2706;

    @ObfuscatedName("hj.j")
    public long field2705;

    @ObfuscatedName("hj.a")
    public long field2710;

    @ObfuscatedName("hj.o")
    public static final int[] field2708 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hj.x")
    public static class201 field2709 = new class201(260);

    @ObfuscatedName("hj.p([I[IZII)V")
    public void method3889(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3407; var6++) {
                    class259 var7 = class259.method548(var6);
                    if (var7 != null && !var7.field3418 && var7.field3411 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2708[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2707 = arg0;
        this.field2703 = arg1;
        this.field2704 = arg2;
        this.field2706 = arg3;
        this.method3894();
    }

    @ObfuscatedName("hj.i(IZI)V")
    public void method3890(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2704) {
            return;
        }
        int var3 = this.field2707[field2708[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class259 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3407) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3407 - 1;
                }
            }
            var4 = class259.method548(var3);
        } while (var4 == null || var4.field3418 || (this.field2704 ? 7 : 0) + arg0 != var4.field3411);
        this.field2707[field2708[arg0]] = var3 + 256;
        this.method3894();
    }

    @ObfuscatedName("hj.w(IZS)V")
    public void method3903(int arg0, boolean arg1) {
        int var3 = this.field2703[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field785[arg0].length) {
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
                    var3 = Statics.field785[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2703[arg0] = var3;
        this.method3894();
    }

    @ObfuscatedName("hj.s(ZS)V")
    public void method3892(boolean arg0) {
        if (this.field2704 != arg0) {
            this.method3889((int[]) null, this.field2703, arg0, -1);
        }
    }

    @ObfuscatedName("hj.j(Lgj;S)V")
    public void method3893(class185 arg0) {
        arg0.method3107(this.field2704 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2707[field2708[var2]];
            if (var3 == 0) {
                arg0.method3107(-1);
            } else {
                arg0.method3107(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3107(this.field2703[var4]);
        }
    }

    @ObfuscatedName("hj.a(I)V")
    public void method3894() {
        long var1 = this.field2705;
        int var3 = this.field2707[5];
        int var4 = this.field2707[9];
        this.field2707[5] = var4;
        this.field2707[9] = var3;
        this.field2705 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2705 <<= 0x4;
            if (this.field2707[var5] >= 256) {
                this.field2705 += (long) (this.field2707[var5] - 256);
            }
        }
        if (this.field2707[0] >= 256) {
            this.field2705 += (long) (this.field2707[0] - 256 >> 4);
        }
        if (this.field2707[1] >= 256) {
            this.field2705 += (long) (this.field2707[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2705 <<= 0x3;
            this.field2705 += (long) this.field2703[var6];
        }
        this.field2705 <<= 0x1;
        this.field2705 += (long) (this.field2704 ? 1 : 0);
        this.field2707[5] = var3;
        this.field2707[9] = var4;
        if (var1 != 0L && this.field2705 != var1) {
            field2709.method3515(var1);
        }
    }

    @ObfuscatedName("hj.t(Ljm;ILjm;II)Len;")
    public class131 method3895(class272 arg0, int arg1, class272 arg2, int arg3) {
        if (this.field2706 != -1) {
            return class270.method4001(this.field2706).method4574(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2705;
        int[] var7 = this.field2707;
        if (arg0 != null && (arg0.field3655 >= 0 || arg0.field3656 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2707[var8];
            }
            if (arg0.field3655 >= 0) {
                var5 += (long) (arg0.field3655 - this.field2707[5] << 40);
                var7[5] = arg0.field3655;
            }
            if (arg0.field3656 >= 0) {
                var5 += (long) (arg0.field3656 - this.field2707[3] << 48);
                var7[3] = arg0.field3656;
            }
        }
        class131 var9 = (class131) field2709.method3504(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class259.method548(var12 - 256).method4281()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class268.method1489(var12 - 512).method4523(this.field2704)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2710 != -1L) {
                    var9 = (class131) field2709.method3504(this.field2710);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class125[] var13 = new class125[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class125 var17 = class259.method548(var16 - 256).method4282();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class125 var18 = class268.method1489(var16 - 512).method4488(this.field2704);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class125 var19 = new class125(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2703[var20] < Statics.field785[var20].length) {
                        var19.method2383(Statics.field420[var20], Statics.field785[var20][this.field2703[var20]]);
                    }
                    if (this.field2703[var20] < Statics.field3891[var20].length) {
                        var19.method2383(Statics.field246[var20], Statics.field3891[var20][this.field2703[var20]]);
                    }
                }
                var9 = var19.method2391(64, 850, -30, -50, -30);
                field2709.method3506(var9, var5);
                this.field2710 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class131 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4601(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4605(var9, arg3);
        } else {
            var21 = arg0.method4605(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hj.r(B)Ldy;")
    public class125 method3922() {
        if (this.field2706 != -1) {
            return class270.method4001(this.field2706).method4576();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2707[var2];
            if (var3 >= 256 && var3 < 512 && !class259.method548(var3 - 256).method4283()) {
                var1 = true;
            }
            if (var3 >= 512 && !class268.method1489(var3 - 512).method4487(this.field2704)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class125[] var4 = new class125[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2707[var6];
            if (var7 >= 256 && var7 < 512) {
                class125 var8 = class259.method548(var7 - 256).method4294();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class125 var9 = class268.method1489(var7 - 512).method4510(this.field2704);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class125 var10 = new class125(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2703[var11] < Statics.field785[var11].length) {
                var10.method2383(Statics.field420[var11], Statics.field785[var11][this.field2703[var11]]);
            }
            if (this.field2703[var11] < Statics.field3891[var11].length) {
                var10.method2383(Statics.field246[var11], Statics.field3891[var11][this.field2703[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hj.m(I)I")
    public int method3897() {
        return this.field2706 == -1 ? (this.field2707[11] << 5) + (this.field2707[8] << 10) + (this.field2707[0] << 15) + (this.field2703[0] << 25) + (this.field2703[4] << 20) + this.field2707[1] : 305419896 + class270.method4001(this.field2706).field3610;
    }

    @ObfuscatedName("ac.h(I)V")
    public static void method566() {
        field2709.method3513();
    }
}
