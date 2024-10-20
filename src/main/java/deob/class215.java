package deob;

@ObfuscatedName("hg")
public class class215 {

    @ObfuscatedName("hg.i")
    public int[] field2633;

    @ObfuscatedName("hg.j")
    public int[] field2632;

    @ObfuscatedName("hg.a")
    public boolean field2634;

    @ObfuscatedName("hg.r")
    public int field2626;

    @ObfuscatedName("hg.o")
    public long field2627;

    @ObfuscatedName("hg.n")
    public long field2623;

    @ObfuscatedName("hg.d")
    public static final int[] field2625 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hg.l")
    public static class191 field2628 = new class191(260);

    @ObfuscatedName("hg.i([I[IZII)V")
    public void method3703(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3362; var6++) {
                    class249 var7 = class249.method3794(var6);
                    if (var7 != null && !var7.field3361 && (arg2 ? 7 : 0) + var5 == var7.field3354) {
                        arg0[field2625[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2633 = arg0;
        this.field2632 = arg1;
        this.field2634 = arg2;
        this.field2626 = arg3;
        this.method3712();
    }

    @ObfuscatedName("hg.j(IZB)V")
    public void method3714(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2634) {
            return;
        }
        int var3 = this.field2633[field2625[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class249 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3362) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3362 - 1;
                }
            }
            var4 = class249.method3794(var3);
        } while (var4 == null || var4.field3361 || var4.field3354 != (this.field2634 ? 7 : 0) + arg0);
        this.field2633[field2625[arg0]] = var3 + 256;
        this.method3712();
    }

    @ObfuscatedName("hg.a(IZB)V")
    public void method3706(int arg0, boolean arg1) {
        int var3 = this.field2632[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2629[arg0].length) {
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
                    var3 = Statics.field2629[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2632[arg0] = var3;
        this.method3712();
    }

    @ObfuscatedName("hg.r(ZB)V")
    public void method3713(boolean arg0) {
        if (this.field2634 != arg0) {
            this.method3703((int[]) null, this.field2632, arg0, -1);
        }
    }

    @ObfuscatedName("hg.o(Lfp;I)V")
    public void method3705(class175 arg0) {
        arg0.method3102(this.field2634 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2633[field2625[var2]];
            if (var3 == 0) {
                arg0.method3102(-1);
            } else {
                arg0.method3102(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3102(this.field2632[var4]);
        }
    }

    @ObfuscatedName("hg.n(B)V")
    public void method3712() {
        long var1 = this.field2627;
        int var3 = this.field2633[5];
        int var4 = this.field2633[9];
        this.field2633[5] = var4;
        this.field2633[9] = var3;
        this.field2627 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2627 <<= 0x4;
            if (this.field2633[var5] >= 256) {
                this.field2627 += (long) (this.field2633[var5] - 256);
            }
        }
        if (this.field2633[0] >= 256) {
            this.field2627 += (long) (this.field2633[0] - 256 >> 4);
        }
        if (this.field2633[1] >= 256) {
            this.field2627 += (long) (this.field2633[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2627 <<= 0x3;
            this.field2627 += (long) this.field2632[var6];
        }
        this.field2627 <<= 0x1;
        this.field2627 += (long) (this.field2634 ? 1 : 0);
        this.field2633[5] = var3;
        this.field2633[9] = var4;
        if (var1 != 0L && this.field2627 != var1) {
            field2628.method3348(var1);
        }
    }

    @ObfuscatedName("hg.q(Ljw;ILjw;II)Lem;")
    public class133 method3720(class262 arg0, int arg1, class262 arg2, int arg3) {
        if (this.field2626 != -1) {
            return class260.method2968(this.field2626).method4293(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2627;
        int[] var7 = this.field2633;
        if (arg0 != null && (arg0.field3610 >= 0 || arg0.field3612 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2633[var8];
            }
            if (arg0.field3610 >= 0) {
                var5 += (long) (arg0.field3610 - this.field2633[5] << 40);
                var7[5] = arg0.field3610;
            }
            if (arg0.field3612 >= 0) {
                var5 += (long) (arg0.field3612 - this.field2633[3] << 48);
                var7[3] = arg0.field3612;
            }
        }
        class133 var9 = (class133) field2628.method3347(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class249.method3794(var12 - 256).method4061()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class258.method2955(var12 - 512).method4278(this.field2634)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2623 != -1L) {
                    var9 = (class133) field2628.method3347(this.field2623);
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
                        class127 var17 = class249.method3794(var16 - 256).method4066();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class127 var18 = class258.method2955(var16 - 512).method4272(this.field2634);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class127 var19 = new class127(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2632[var20] < Statics.field2629[var20].length) {
                        var19.method2258(Statics.field248[var20], Statics.field2629[var20][this.field2632[var20]]);
                    }
                    if (this.field2632[var20] < Statics.field2630[var20].length) {
                        var19.method2258(Statics.field799[var20], Statics.field2630[var20][this.field2632[var20]]);
                    }
                }
                var9 = var19.method2264(64, 850, -30, -50, -30);
                field2628.method3346(var9, var5);
                this.field2623 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class133 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4344(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4341(var9, arg3);
        } else {
            var21 = arg0.method4341(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hg.b(I)Lde;")
    public class127 method3710() {
        if (this.field2626 != -1) {
            return class260.method2968(this.field2626).method4294();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2633[var2];
            if (var3 >= 256 && var3 < 512 && !class249.method3794(var3 - 256).method4050()) {
                var1 = true;
            }
            if (var3 >= 512 && !class258.method2955(var3 - 512).method4237(this.field2634)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class127[] var4 = new class127[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2633[var6];
            if (var7 >= 256 && var7 < 512) {
                class127 var8 = class249.method3794(var7 - 256).method4051();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class127 var9 = class258.method2955(var7 - 512).method4242(this.field2634);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class127 var10 = new class127(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2632[var11] < Statics.field2629[var11].length) {
                var10.method2258(Statics.field248[var11], Statics.field2629[var11][this.field2632[var11]]);
            }
            if (this.field2632[var11] < Statics.field2630[var11].length) {
                var10.method2258(Statics.field799[var11], Statics.field2630[var11][this.field2632[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hg.k(I)I")
    public int method3711() {
        return this.field2626 == -1 ? (this.field2633[11] << 5) + (this.field2633[8] << 10) + (this.field2633[0] << 15) + (this.field2632[0] << 25) + (this.field2632[4] << 20) + this.field2633[1] : 305419896 + class260.method2968(this.field2626).field3551;
    }

    @ObfuscatedName("al.s(I)V")
    public static void method245() {
        field2628.method3355();
    }
}
