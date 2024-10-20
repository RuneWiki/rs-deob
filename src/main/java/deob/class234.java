package deob;

@ObfuscatedName("hy")
public class class234 {

    @ObfuscatedName("hy.b")
    public int[] field2753;

    @ObfuscatedName("hy.q")
    public int[] field2745;

    @ObfuscatedName("hy.o")
    public boolean field2752;

    @ObfuscatedName("hy.p")
    public int field2747;

    @ObfuscatedName("hy.a")
    public long field2754;

    @ObfuscatedName("hy.h")
    public long field2748;

    @ObfuscatedName("hy.u")
    public static final int[] field2750 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hy.r")
    public static class210 field2755 = new class210(260);

    @ObfuscatedName("hy.b([I[IZII)V")
    public void method4044(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3444; var6++) {
                    class268 var7 = class268.method3448(var6);
                    if (var7 != null && !var7.field3453 && var7.field3446 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2750[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2753 = arg0;
        this.field2745 = arg1;
        this.field2752 = arg2;
        this.field2747 = arg3;
        this.method4049();
    }

    @ObfuscatedName("hy.q(IZI)V")
    public void method4045(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2752) {
            return;
        }
        int var3 = this.field2753[field2750[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class268 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3444) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3444 - 1;
                }
            }
            var4 = class268.method3448(var3);
        } while (var4 == null || var4.field3453 || var4.field3446 != (this.field2752 ? 7 : 0) + arg0);
        this.field2753[field2750[arg0]] = var3 + 256;
        this.method4049();
    }

    @ObfuscatedName("hy.o(IZB)V")
    public void method4053(int arg0, boolean arg1) {
        int var3 = this.field2745[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2751[arg0].length) {
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
                    var3 = Statics.field2751[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2745[arg0] = var3;
        this.method4049();
    }

    @ObfuscatedName("hy.p(ZB)V")
    public void method4066(boolean arg0) {
        if (this.field2752 != arg0) {
            this.method4044((int[]) null, this.field2745, arg0, -1);
        }
    }

    @ObfuscatedName("hy.a(Lgn;I)V")
    public void method4048(class194 arg0) {
        arg0.method3232(this.field2752 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2753[field2750[var2]];
            if (var3 == 0) {
                arg0.method3232(-1);
            } else {
                arg0.method3232(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3232(this.field2745[var4]);
        }
    }

    @ObfuscatedName("hy.h(I)V")
    public void method4049() {
        long var1 = this.field2754;
        int var3 = this.field2753[5];
        int var4 = this.field2753[9];
        this.field2753[5] = var4;
        this.field2753[9] = var3;
        this.field2754 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2754 <<= 0x4;
            if (this.field2753[var5] >= 256) {
                this.field2754 += (long) (this.field2753[var5] - 256);
            }
        }
        if (this.field2753[0] >= 256) {
            this.field2754 += (long) (this.field2753[0] - 256 >> 4);
        }
        if (this.field2753[1] >= 256) {
            this.field2754 += (long) (this.field2753[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2754 <<= 0x3;
            this.field2754 += (long) this.field2745[var6];
        }
        this.field2754 <<= 0x1;
        this.field2754 += (long) (this.field2752 ? 1 : 0);
        this.field2753[5] = var3;
        this.field2753[9] = var4;
        if (var1 != 0L && this.field2754 != var1) {
            field2755.method3657(var1);
        }
    }

    @ObfuscatedName("hy.l(Ljo;ILjo;II)Lee;")
    public class131 method4050(class281 arg0, int arg1, class281 arg2, int arg3) {
        if (this.field2747 != -1) {
            return class279.method2487(this.field2747).method4689(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2754;
        int[] var7 = this.field2753;
        if (arg0 != null && (arg0.field3681 >= 0 || arg0.field3692 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2753[var8];
            }
            if (arg0.field3681 >= 0) {
                var5 += (long) (arg0.field3681 - this.field2753[5] << 40);
                var7[5] = arg0.field3681;
            }
            if (arg0.field3692 >= 0) {
                var5 += (long) (arg0.field3692 - this.field2753[3] << 48);
                var7[3] = arg0.field3692;
            }
        }
        class131 var9 = (class131) field2755.method3658(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class268.method3448(var12 - 256).method4420()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class277.method1730(var12 - 512).method4611(this.field2752)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2748 != -1L) {
                    var9 = (class131) field2755.method3658(this.field2748);
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
                        class125 var17 = class268.method3448(var16 - 256).method4433();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class125 var18 = class277.method1730(var16 - 512).method4658(this.field2752);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class125 var19 = new class125(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2745[var20] < Statics.field2751[var20].length) {
                        var19.method2401(Statics.field2746[var20], Statics.field2751[var20][this.field2745[var20]]);
                    }
                    if (this.field2745[var20] < Statics.field2749[var20].length) {
                        var19.method2401(Statics.field2744[var20], Statics.field2749[var20][this.field2745[var20]]);
                    }
                }
                var9 = var19.method2409(64, 850, -30, -50, -30);
                field2755.method3659(var9, var5);
                this.field2748 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class131 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4731(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4733(var9, arg3);
        } else {
            var21 = arg0.method4733(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hy.y(B)Ldy;")
    public class125 method4051() {
        if (this.field2747 != -1) {
            return class279.method2487(this.field2747).method4670();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2753[var2];
            if (var3 >= 256 && var3 < 512 && !class268.method3448(var3 - 256).method4430()) {
                var1 = true;
            }
            if (var3 >= 512 && !class277.method1730(var3 - 512).method4613(this.field2752)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class125[] var4 = new class125[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2753[var6];
            if (var7 >= 256 && var7 < 512) {
                class125 var8 = class268.method3448(var7 - 256).method4418();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class125 var9 = class277.method1730(var7 - 512).method4614(this.field2752);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class125 var10 = new class125(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2745[var11] < Statics.field2751[var11].length) {
                var10.method2401(Statics.field2746[var11], Statics.field2751[var11][this.field2745[var11]]);
            }
            if (this.field2745[var11] < Statics.field2749[var11].length) {
                var10.method2401(Statics.field2744[var11], Statics.field2749[var11][this.field2745[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hy.g(I)I")
    public int method4052() {
        return this.field2747 == -1 ? (this.field2753[11] << 5) + (this.field2753[8] << 10) + (this.field2753[0] << 15) + (this.field2745[4] << 20) + (this.field2745[0] << 25) + this.field2753[1] : 305419896 + class279.method2487(this.field2747).field3632;
    }
}
