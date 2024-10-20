package deob;

@ObfuscatedName("hl")
public class class225 {

    @ObfuscatedName("hl.n")
    public int[] field2739;

    @ObfuscatedName("hl.v")
    public int[] field2733;

    @ObfuscatedName("hl.y")
    public boolean field2738;

    @ObfuscatedName("hl.r")
    public int field2734;

    @ObfuscatedName("hl.h")
    public long field2736;

    @ObfuscatedName("hl.d")
    public long field2737;

    @ObfuscatedName("hl.z")
    public static final int[] field2732 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hl.u")
    public static class201 field2735 = new class201(260);

    @ObfuscatedName("hl.n([I[IZII)V")
    public void method3793(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3448; var6++) {
                    class259 var7 = class259.method2990(var6);
                    if (var7 != null && !var7.field3451 && var7.field3444 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2732[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2739 = arg0;
        this.field2733 = arg1;
        this.field2738 = arg2;
        this.field2734 = arg3;
        this.method3804();
    }

    @ObfuscatedName("hl.v(IZI)V")
    public void method3794(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2738) {
            return;
        }
        int var3 = this.field2739[field2732[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class259 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3448) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3448 - 1;
                }
            }
            var4 = class259.method2990(var3);
        } while (var4 == null || var4.field3451 || (this.field2738 ? 7 : 0) + arg0 != var4.field3444);
        this.field2739[field2732[arg0]] = var3 + 256;
        this.method3804();
    }

    @ObfuscatedName("hl.y(IZS)V")
    public void method3795(int arg0, boolean arg1) {
        int var3 = this.field2733[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2464[arg0].length) {
                    var3 = 0;
                }
            } while (!class226.method2244(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2464[arg0].length - 1;
                }
            } while (!class226.method2244(arg0, var3));
        }
        this.field2733[arg0] = var3;
        this.method3804();
    }

    @ObfuscatedName("hl.r(ZI)V")
    public void method3796(boolean arg0) {
        if (this.field2738 != arg0) {
            this.method3793((int[]) null, this.field2733, arg0, -1);
        }
    }

    @ObfuscatedName("hl.h(Lgv;B)V")
    public void method3797(class185 arg0) {
        arg0.method3157(this.field2738 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2739[field2732[var2]];
            if (var3 == 0) {
                arg0.method3157(-1);
            } else {
                arg0.method3157(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3157(this.field2733[var4]);
        }
    }

    @ObfuscatedName("hl.d(B)V")
    public void method3804() {
        long var1 = this.field2736;
        int var3 = this.field2739[5];
        int var4 = this.field2739[9];
        this.field2739[5] = var4;
        this.field2739[9] = var3;
        this.field2736 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2736 <<= 0x4;
            if (this.field2739[var5] >= 256) {
                this.field2736 += (long) (this.field2739[var5] - 256);
            }
        }
        if (this.field2739[0] >= 256) {
            this.field2736 += (long) (this.field2739[0] - 256 >> 4);
        }
        if (this.field2739[1] >= 256) {
            this.field2736 += (long) (this.field2739[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2736 <<= 0x3;
            this.field2736 += (long) this.field2733[var6];
        }
        this.field2736 <<= 0x1;
        this.field2736 += (long) (this.field2738 ? 1 : 0);
        this.field2739[5] = var3;
        this.field2739[9] = var4;
        if (var1 != 0L && this.field2736 != var1) {
            field2735.method3412(var1);
        }
    }

    @ObfuscatedName("hl.s(Ljs;ILjs;II)Les;")
    public class133 method3799(class272 arg0, int arg1, class272 arg2, int arg3) {
        if (this.field2734 != -1) {
            return class270.method564(this.field2734).method4453(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2736;
        int[] var7 = this.field2739;
        if (arg0 != null && (arg0.field3696 >= 0 || arg0.field3697 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2739[var8];
            }
            if (arg0.field3696 >= 0) {
                var5 += (long) (arg0.field3696 - this.field2739[5] << 40);
                var7[5] = arg0.field3696;
            }
            if (arg0.field3697 >= 0) {
                var5 += (long) (arg0.field3697 - this.field2739[3] << 48);
                var7[3] = arg0.field3697;
            }
        }
        class133 var9 = (class133) field2735.method3407(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class259.method2990(var12 - 256).method4155()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class268.method1985(var12 - 512).method4367(this.field2738)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2737 != -1L) {
                    var9 = (class133) field2735.method3407(this.field2737);
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
                        class127 var17 = class259.method2990(var16 - 256).method4176();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class127 var18 = class268.method1985(var16 - 512).method4368(this.field2738);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class127 var19 = new class127(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2733[var20] < Statics.field2464[var20].length) {
                        var19.method2258(Statics.field2118[var20], Statics.field2464[var20][this.field2733[var20]]);
                    }
                    if (this.field2733[var20] < Statics.field1400[var20].length) {
                        var19.method2258(Statics.field2044[var20], Statics.field1400[var20][this.field2733[var20]]);
                    }
                }
                var9 = var19.method2331(64, 850, -30, -50, -30);
                field2735.method3408(var9, var5);
                this.field2737 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class133 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4490(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4512(var9, arg3);
        } else {
            var21 = arg0.method4512(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hl.b(B)Ldh;")
    public class127 method3802() {
        if (this.field2734 != -1) {
            return class270.method564(this.field2734).method4423();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2739[var2];
            if (var3 >= 256 && var3 < 512 && !class259.method2990(var3 - 256).method4167()) {
                var1 = true;
            }
            if (var3 >= 512 && !class268.method1985(var3 - 512).method4375(this.field2738)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class127[] var4 = new class127[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2739[var6];
            if (var7 >= 256 && var7 < 512) {
                class127 var8 = class259.method2990(var7 - 256).method4153();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class127 var9 = class268.method1985(var7 - 512).method4385(this.field2738);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class127 var10 = new class127(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2733[var11] < Statics.field2464[var11].length) {
                var10.method2258(Statics.field2118[var11], Statics.field2464[var11][this.field2733[var11]]);
            }
            if (this.field2733[var11] < Statics.field1400[var11].length) {
                var10.method2258(Statics.field2044[var11], Statics.field1400[var11][this.field2733[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hl.e(I)I")
    public int method3812() {
        return this.field2734 == -1 ? (this.field2739[11] << 5) + (this.field2739[8] << 10) + (this.field2739[0] << 15) + (this.field2733[4] << 20) + (this.field2733[0] << 25) + this.field2739[1] : 305419896 + class270.method564(this.field2734).field3638;
    }

    @ObfuscatedName("g.f(S)V")
    public static void method159() {
        field2735.method3409();
    }
}
