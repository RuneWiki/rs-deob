package deob;

@ObfuscatedName("hg")
public class class215 {

    @ObfuscatedName("hg.j")
    public int[] field2624;

    @ObfuscatedName("hg.h")
    public int[] field2615;

    @ObfuscatedName("hg.f")
    public boolean field2616;

    @ObfuscatedName("hg.p")
    public int field2628;

    @ObfuscatedName("hg.x")
    public long field2618;

    @ObfuscatedName("hg.g")
    public long field2623;

    @ObfuscatedName("hg.o")
    public static final int[] field2625 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hg.m")
    public static class191 field2621 = new class191(260);

    @ObfuscatedName("hg.j([I[IZII)V")
    public void method3670(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3338; var6++) {
                    class249 var7 = class249.method3951(var6);
                    if (var7 != null && !var7.field3346 && var7.field3339 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2625[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2624 = arg0;
        this.field2615 = arg1;
        this.field2616 = arg2;
        this.field2628 = arg3;
        this.method3643();
    }

    @ObfuscatedName("hg.h(IZS)V")
    public void method3639(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2616) {
            return;
        }
        int var3 = this.field2624[field2625[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class249 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3338) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3338 - 1;
                }
            }
            var4 = class249.method3951(var3);
        } while (var4 == null || var4.field3346 || var4.field3339 != (this.field2616 ? 7 : 0) + arg0);
        this.field2624[field2625[arg0]] = var3 + 256;
        this.method3643();
    }

    @ObfuscatedName("hg.f(IZI)V")
    public void method3657(int arg0, boolean arg1) {
        int var3 = this.field2615[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2617[arg0].length) {
                    var3 = 0;
                }
            } while (!class216.method721(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2617[arg0].length - 1;
                }
            } while (!class216.method721(arg0, var3));
        }
        this.field2615[arg0] = var3;
        this.method3643();
    }

    @ObfuscatedName("hg.p(ZI)V")
    public void method3641(boolean arg0) {
        if (this.field2616 != arg0) {
            this.method3670((int[]) null, this.field2615, arg0, -1);
        }
    }

    @ObfuscatedName("hg.x(Lfb;I)V")
    public void method3652(class175 arg0) {
        arg0.method2888(this.field2616 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2624[field2625[var2]];
            if (var3 == 0) {
                arg0.method2888(-1);
            } else {
                arg0.method2888(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2888(this.field2615[var4]);
        }
    }

    @ObfuscatedName("hg.g(B)V")
    public void method3643() {
        long var1 = this.field2618;
        int var3 = this.field2624[5];
        int var4 = this.field2624[9];
        this.field2624[5] = var4;
        this.field2624[9] = var3;
        this.field2618 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2618 <<= 0x4;
            if (this.field2624[var5] >= 256) {
                this.field2618 += (long) (this.field2624[var5] - 256);
            }
        }
        if (this.field2624[0] >= 256) {
            this.field2618 += (long) (this.field2624[0] - 256 >> 4);
        }
        if (this.field2624[1] >= 256) {
            this.field2618 += (long) (this.field2624[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2618 <<= 0x3;
            this.field2618 += (long) this.field2615[var6];
        }
        this.field2618 <<= 0x1;
        this.field2618 += (long) (this.field2616 ? 1 : 0);
        this.field2624[5] = var3;
        this.field2624[9] = var4;
        if (var1 != 0L && this.field2618 != var1) {
            field2621.method3261(var1);
        }
    }

    @ObfuscatedName("hg.c(Ljf;ILjf;II)Leo;")
    public class135 method3650(class262 arg0, int arg1, class262 arg2, int arg3) {
        if (this.field2628 != -1) {
            return class260.method3178(this.field2628).method4309(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2618;
        int[] var7 = this.field2624;
        if (arg0 != null && (arg0.field3591 >= 0 || arg0.field3594 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2624[var8];
            }
            if (arg0.field3591 >= 0) {
                var5 += (long) (arg0.field3591 - this.field2624[5] << 40);
                var7[5] = arg0.field3591;
            }
            if (arg0.field3594 >= 0) {
                var5 += (long) (arg0.field3594 - this.field2624[3] << 48);
                var7[3] = arg0.field3594;
            }
        }
        class135 var9 = (class135) field2621.method3271(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class249.method3951(var12 - 256).method4047()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class258.method1923(var12 - 512).method4248(this.field2616)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2623 != -1L) {
                    var9 = (class135) field2621.method3271(this.field2623);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class129[] var13 = new class129[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class129 var17 = class249.method3951(var16 - 256).method4048();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class129 var18 = class258.method1923(var16 - 512).method4249(this.field2616);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class129 var19 = new class129(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2615[var20] < Statics.field2617[var20].length) {
                        var19.method2241(Statics.field2620[var20], Statics.field2617[var20][this.field2615[var20]]);
                    }
                    if (this.field2615[var20] < Statics.field2614[var20].length) {
                        var19.method2241(Statics.field2622[var20], Statics.field2614[var20][this.field2615[var20]]);
                    }
                }
                var9 = var19.method2229(64, 850, -30, -50, -30);
                field2621.method3270(var9, var5);
                this.field2623 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class135 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4374(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4361(var9, arg3);
        } else {
            var21 = arg0.method4361(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hg.l(I)Ldi;")
    public class129 method3645() {
        if (this.field2628 != -1) {
            return class260.method3178(this.field2628).method4310();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2624[var2];
            if (var3 >= 256 && var3 < 512 && !class249.method3951(var3 - 256).method4061()) {
                var1 = true;
            }
            if (var3 >= 512 && !class258.method1923(var3 - 512).method4250(this.field2616)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class129[] var4 = new class129[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2624[var6];
            if (var7 >= 256 && var7 < 512) {
                class129 var8 = class249.method3951(var7 - 256).method4049();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class129 var9 = class258.method1923(var7 - 512).method4251(this.field2616);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class129 var10 = new class129(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2615[var11] < Statics.field2617[var11].length) {
                var10.method2241(Statics.field2620[var11], Statics.field2617[var11][this.field2615[var11]]);
            }
            if (this.field2615[var11] < Statics.field2614[var11].length) {
                var10.method2241(Statics.field2622[var11], Statics.field2614[var11][this.field2615[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hg.w(I)I")
    public int method3646() {
        return this.field2628 == -1 ? (this.field2624[11] << 5) + (this.field2624[8] << 10) + (this.field2624[0] << 15) + (this.field2615[4] << 20) + (this.field2615[0] << 25) + this.field2624[1] : 305419896 + class260.method3178(this.field2628).field3542;
    }
}
