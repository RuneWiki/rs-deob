package deob;

@ObfuscatedName("hh")
public class class224 {

    @ObfuscatedName("hh.h")
    public int[] field2561;

    @ObfuscatedName("hh.v")
    public int[] field2551;

    @ObfuscatedName("hh.x")
    public boolean field2553;

    @ObfuscatedName("hh.w")
    public int field2554;

    @ObfuscatedName("hh.t")
    public long field2555;

    @ObfuscatedName("hh.j")
    public long field2556;

    @ObfuscatedName("hh.u")
    public static final int[] field2559 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hh.e")
    public static class155 field2560 = new class155(260);

    @ObfuscatedName("hh.h([I[IZII)V")
    public void method3691(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3296; var6++) {
                    class257 var7 = class257.method660(var6);
                    if (var7 != null && !var7.field3305 && var7.field3302 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2559[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2561 = arg0;
        this.field2551 = arg1;
        this.field2553 = arg2;
        this.field2554 = arg3;
        this.method3696();
    }

    @ObfuscatedName("hh.v(IZI)V")
    public void method3702(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2553) {
            return;
        }
        int var3 = this.field2561[field2559[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class257 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3296) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3296 - 1;
                }
            }
            var4 = class257.method660(var3);
        } while (var4 == null || var4.field3305 || var4.field3302 != (this.field2553 ? 7 : 0) + arg0);
        this.field2561[field2559[arg0]] = var3 + 256;
        this.method3696();
    }

    @ObfuscatedName("hh.x(IZI)V")
    public void method3693(int arg0, boolean arg1) {
        int var3 = this.field2551[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field367[arg0].length) {
                    var3 = 0;
                }
            } while (!class225.method3257(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field367[arg0].length - 1;
                }
            } while (!class225.method3257(arg0, var3));
        }
        this.field2551[arg0] = var3;
        this.method3696();
    }

    @ObfuscatedName("hh.w(ZB)V")
    public void method3704(boolean arg0) {
        if (this.field2553 != arg0) {
            this.method3691((int[]) null, this.field2551, arg0, -1);
        }
    }

    @ObfuscatedName("hh.t(Lkj;I)V")
    public void method3695(class311 arg0) {
        arg0.method5095(this.field2553 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2561[field2559[var2]];
            if (var3 == 0) {
                arg0.method5095(-1);
            } else {
                arg0.method5095(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5095(this.field2551[var4]);
        }
    }

    @ObfuscatedName("hh.j(I)V")
    public void method3696() {
        long var1 = this.field2555;
        int var3 = this.field2561[5];
        int var4 = this.field2561[9];
        this.field2561[5] = var4;
        this.field2561[9] = var3;
        this.field2555 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2555 <<= 0x4;
            if (this.field2561[var5] >= 256) {
                this.field2555 += (long) (this.field2561[var5] - 256);
            }
        }
        if (this.field2561[0] >= 256) {
            this.field2555 += (long) (this.field2561[0] - 256 >> 4);
        }
        if (this.field2561[1] >= 256) {
            this.field2555 += (long) (this.field2561[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2555 <<= 0x3;
            this.field2555 += (long) this.field2551[var6];
        }
        this.field2555 <<= 0x1;
        this.field2555 += (long) (this.field2553 ? 1 : 0);
        this.field2561[5] = var3;
        this.field2561[9] = var4;
        if (var1 != 0L && this.field2555 != var1) {
            field2560.method3149(var1);
        }
    }

    @ObfuscatedName("hh.n(Ljy;ILjy;II)Leh;")
    public class137 method3697(class270 arg0, int arg1, class270 arg2, int arg3) {
        if (this.field2554 != -1) {
            return class268.method250(this.field2554).method4365(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2555;
        int[] var7 = this.field2561;
        if (arg0 != null && (arg0.field3564 >= 0 || arg0.field3560 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2561[var8];
            }
            if (arg0.field3564 >= 0) {
                var5 += (long) (arg0.field3564 - this.field2561[5] << 40);
                var7[5] = arg0.field3564;
            }
            if (arg0.field3560 >= 0) {
                var5 += (long) (arg0.field3560 - this.field2561[3] << 48);
                var7[3] = arg0.field3560;
            }
        }
        class137 var9 = (class137) field2560.method3147(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class257.method660(var12 - 256).method4095()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class266.method1102(var12 - 512).method4299(this.field2553)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2556 != -1L) {
                    var9 = (class137) field2560.method3147(this.field2556);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class131[] var13 = new class131[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class131 var17 = class257.method660(var16 - 256).method4096();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class131 var18 = class266.method1102(var16 - 512).method4300(this.field2553);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class131 var19 = new class131(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2551[var20] < Statics.field367[var20].length) {
                        var19.method2635(Statics.field2552[var20], Statics.field367[var20][this.field2551[var20]]);
                    }
                    if (this.field2551[var20] < Statics.field332[var20].length) {
                        var19.method2635(Statics.field2558[var20], Statics.field332[var20][this.field2551[var20]]);
                    }
                }
                var9 = var19.method2674(64, 850, -30, -50, -30);
                field2560.method3145(var9, var5);
                this.field2556 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class137 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4442(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4422(var9, arg3);
        } else {
            var21 = arg0.method4422(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hh.p(I)Les;")
    public class131 method3698() {
        if (this.field2554 != -1) {
            return class268.method250(this.field2554).method4364();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2561[var2];
            if (var3 >= 256 && var3 < 512 && !class257.method660(var3 - 256).method4119()) {
                var1 = true;
            }
            if (var3 >= 512 && !class266.method1102(var3 - 512).method4291(this.field2553)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class131[] var4 = new class131[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2561[var6];
            if (var7 >= 256 && var7 < 512) {
                class131 var8 = class257.method660(var7 - 256).method4098();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class131 var9 = class266.method1102(var7 - 512).method4302(this.field2553);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class131 var10 = new class131(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2551[var11] < Statics.field367[var11].length) {
                var10.method2635(Statics.field2552[var11], Statics.field367[var11][this.field2551[var11]]);
            }
            if (this.field2551[var11] < Statics.field332[var11].length) {
                var10.method2635(Statics.field2558[var11], Statics.field332[var11][this.field2551[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hh.l(I)I")
    public int method3699() {
        return this.field2554 == -1 ? (this.field2561[11] << 5) + (this.field2561[8] << 10) + (this.field2561[0] << 15) + (this.field2551[4] << 20) + (this.field2551[0] << 25) + this.field2561[1] : 305419896 + class268.method250(this.field2554).field3532;
    }
}
