package deob;

@ObfuscatedName("ht")
public class class223 {

    @ObfuscatedName("ht.f")
    public int[] field2605;

    @ObfuscatedName("ht.o")
    public int[] field2607;

    @ObfuscatedName("ht.u")
    public boolean field2598;

    @ObfuscatedName("ht.p")
    public int field2599;

    @ObfuscatedName("ht.b")
    public long field2600;

    @ObfuscatedName("ht.e")
    public long field2601;

    @ObfuscatedName("ht.l")
    public static final int[] field2604 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ht.m")
    public static class199 field2596 = new class199(260);

    @ObfuscatedName("ht.f([I[IZII)V")
    public void method3704(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3432; var6++) {
                    class282 var7 = class282.method3652(var6);
                    if (var7 != null && !var7.field3441 && var7.field3435 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2604[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2605 = arg0;
        this.field2607 = arg1;
        this.field2598 = arg2;
        this.field2599 = arg3;
        this.method3693();
    }

    @ObfuscatedName("ht.o(IZB)V")
    public void method3699(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2598) {
            return;
        }
        int var3 = this.field2605[field2604[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class282 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3432) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3432 - 1;
                }
            }
            var4 = class282.method3652(var3);
        } while (var4 == null || var4.field3441 || var4.field3435 != (this.field2598 ? 7 : 0) + arg0);
        this.field2605[field2604[arg0]] = var3 + 256;
        this.method3693();
    }

    @ObfuscatedName("ht.u(IZI)V")
    public void method3690(int arg0, boolean arg1) {
        int var3 = this.field2607[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1087[arg0].length) {
                    var3 = 0;
                }
            } while (!class224.method5198(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1087[arg0].length - 1;
                }
            } while (!class224.method5198(arg0, var3));
        }
        this.field2607[arg0] = var3;
        this.method3693();
    }

    @ObfuscatedName("ht.p(ZI)V")
    public void method3711(boolean arg0) {
        if (this.field2598 != arg0) {
            this.method3704((int[]) null, this.field2607, arg0, -1);
        }
    }

    @ObfuscatedName("ht.b(Lnu;I)V")
    public void method3692(class382 arg0) {
        arg0.method5839(this.field2598 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2605[field2604[var2]];
            if (var3 == 0) {
                arg0.method5839(-1);
            } else {
                arg0.method5839(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5839(this.field2607[var4]);
        }
    }

    @ObfuscatedName("ht.e(I)V")
    public void method3693() {
        long var1 = this.field2600;
        int var3 = this.field2605[5];
        int var4 = this.field2605[9];
        this.field2605[5] = var4;
        this.field2605[9] = var3;
        this.field2600 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2600 <<= 0x4;
            if (this.field2605[var5] >= 256) {
                this.field2600 += (long) (this.field2605[var5] - 256);
            }
        }
        if (this.field2605[0] >= 256) {
            this.field2600 += (long) (this.field2605[0] - 256 >> 4);
        }
        if (this.field2605[1] >= 256) {
            this.field2600 += (long) (this.field2605[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2600 <<= 0x3;
            this.field2600 += (long) this.field2607[var6];
        }
        this.field2600 <<= 0x1;
        this.field2600 += (long) (this.field2598 ? 1 : 0);
        this.field2605[5] = var3;
        this.field2605[9] = var4;
        if (var1 != 0L && this.field2600 != var1) {
            field2596.method3390(var1);
        }
    }

    @ObfuscatedName("ht.k(Lkw;ILkw;II)Lgv;")
    public class183 method3694(class298 arg0, int arg1, class298 arg2, int arg3) {
        if (this.field2599 != -1) {
            return class287.method1652(this.field2599).method4462(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2600;
        int[] var7 = this.field2605;
        if (arg0 != null && (arg0.field3716 >= 0 || arg0.field3721 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2605[var8];
            }
            if (arg0.field3716 >= 0) {
                var5 += (long) (arg0.field3716 - this.field2605[5] << 40);
                var7[5] = arg0.field3716;
            }
            if (arg0.field3721 >= 0) {
                var5 += (long) (arg0.field3721 - this.field2605[3] << 48);
                var7[3] = arg0.field3721;
            }
        }
        class183 var9 = (class183) field2596.method3398(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class282.method3652(var12 - 256).method4380()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class296.method194(var12 - 512).method4692(this.field2598)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2601 != -1L) {
                    var9 = (class183) field2596.method3398(this.field2601);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class169[] var13 = new class169[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class169 var17 = class282.method3652(var16 - 256).method4400();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class169 var18 = class296.method194(var16 - 512).method4707(this.field2598);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class169 var19 = new class169(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2607[var20] < Statics.field1087[var20].length) {
                        var19.method2852(Statics.field2602[var20], Statics.field1087[var20][this.field2607[var20]]);
                    }
                    if (this.field2607[var20] < Statics.field2597[var20].length) {
                        var19.method2852(Statics.field1754[var20], Statics.field2597[var20][this.field2607[var20]]);
                    }
                }
                var9 = var19.method2860(64, 850, -30, -50, -30);
                field2596.method3400(var9, var5);
                this.field2601 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class183 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4745(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4754(var9, arg3);
        } else {
            var21 = arg0.method4754(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ht.g(I)Lfs;")
    public class169 method3695() {
        if (this.field2599 != -1) {
            return class287.method1652(this.field2599).method4436();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2605[var2];
            if (var3 >= 256 && var3 < 512 && !class282.method3652(var3 - 256).method4385()) {
                var1 = true;
            }
            if (var3 >= 512 && !class296.method194(var3 - 512).method4664(this.field2598)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class169[] var4 = new class169[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2605[var6];
            if (var7 >= 256 && var7 < 512) {
                class169 var8 = class282.method3652(var7 - 256).method4377();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class169 var9 = class296.method194(var7 - 512).method4665(this.field2598);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class169 var10 = new class169(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2607[var11] < Statics.field1087[var11].length) {
                var10.method2852(Statics.field2602[var11], Statics.field1087[var11][this.field2607[var11]]);
            }
            if (this.field2607[var11] < Statics.field2597[var11].length) {
                var10.method2852(Statics.field1754[var11], Statics.field2597[var11][this.field2607[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ht.h(B)I")
    public int method3689() {
        return this.field2599 == -1 ? (this.field2605[11] << 5) + (this.field2605[8] << 10) + (this.field2605[0] << 15) + (this.field2607[4] << 20) + (this.field2607[0] << 25) + this.field2605[1] : 305419896 + class287.method1652(this.field2599).field3478;
    }
}
