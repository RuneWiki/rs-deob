package deob;

@ObfuscatedName("fy")
public class class158 {

    @ObfuscatedName("fy.k")
    public int[] field2692;

    @ObfuscatedName("fy.y")
    public int[] field2682;

    @ObfuscatedName("fy.s")
    public boolean field2688;

    @ObfuscatedName("fy.g")
    public int field2684;

    @ObfuscatedName("fy.h")
    public long field2685;

    @ObfuscatedName("fy.l")
    public long field2690;

    @ObfuscatedName("fy.d")
    public static final int[] field2689 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fy.v")
    public static class172 field2691 = new class172(260);

    @ObfuscatedName("fy.k([I[IZII)V")
    public void method2948(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field926; var6++) {
                    class40 var7 = class40.method675(var6);
                    if (var7 != null && !var7.field936 && var7.field929 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2689[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2692 = arg0;
        this.field2682 = arg1;
        this.field2688 = arg2;
        this.field2684 = arg3;
        this.method2953();
    }

    @ObfuscatedName("fy.y(IZI)V")
    public void method2949(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2688) {
            return;
        }
        int var3 = this.field2692[field2689[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field926) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field926 - 1;
                }
            }
            var4 = class40.method675(var3);
        } while (var4 == null || var4.field936 || var4.field929 != (this.field2688 ? 7 : 0) + arg0);
        this.field2692[field2689[arg0]] = var3 + 256;
        this.method2953();
    }

    @ObfuscatedName("fy.s(IZI)V")
    public void method2950(int arg0, boolean arg1) {
        int var3 = this.field2682[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2687[arg0].length) {
                    var3 = 0;
                }
            } while (!class154.method1406(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2687[arg0].length - 1;
                }
            } while (!class154.method1406(arg0, var3));
        }
        this.field2682[arg0] = var3;
        this.method2953();
    }

    @ObfuscatedName("fy.g(ZI)V")
    public void method2951(boolean arg0) {
        if (this.field2688 != arg0) {
            this.method2948((int[]) null, this.field2682, arg0, -1);
        }
    }

    @ObfuscatedName("fy.h(Ldy;I)V")
    public void method2971(class107 arg0) {
        arg0.method2124(this.field2688 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2692[field2689[var2]];
            if (var3 == 0) {
                arg0.method2124(-1);
            } else {
                arg0.method2124(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2124(this.field2682[var4]);
        }
    }

    @ObfuscatedName("fy.l(B)V")
    public void method2953() {
        long var1 = this.field2685;
        int var3 = this.field2692[5];
        int var4 = this.field2692[9];
        this.field2692[5] = var4;
        this.field2692[9] = var3;
        this.field2685 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2685 <<= 0x4;
            if (this.field2692[var5] >= 256) {
                this.field2685 += (long) (this.field2692[var5] - 256);
            }
        }
        if (this.field2692[0] >= 256) {
            this.field2685 += (long) (this.field2692[0] - 256 >> 4);
        }
        if (this.field2692[1] >= 256) {
            this.field2685 += (long) (this.field2692[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2685 <<= 0x3;
            this.field2685 += (long) this.field2682[var6];
        }
        this.field2685 <<= 0x1;
        this.field2685 += (long) (this.field2688 ? 1 : 0);
        this.field2692[5] = var3;
        this.field2692[9] = var4;
        if (var1 != 0L && this.field2685 != var1) {
            field2691.method3203(var1);
        }
    }

    @ObfuscatedName("fy.e(Lac;ILac;II)Lck;")
    public class98 method2954(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2684 != -1) {
            return class35.method2397(this.field2684).method578(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2685;
        int[] var7 = this.field2692;
        if (arg0 != null && (arg0.field906 >= 0 || arg0.field886 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2692[var8];
            }
            if (arg0.field906 >= 0) {
                var5 += (long) (arg0.field906 - this.field2692[5] << 40);
                var7[5] = arg0.field906;
            }
            if (arg0.field886 >= 0) {
                var5 += (long) (arg0.field886 - this.field2692[3] << 48);
                var7[3] = arg0.field886;
            }
        }
        class98 var9 = (class98) field2691.method3202(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method675(var12 - 256).method739()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method114(var12 - 512).method863(this.field2688)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2690 != -1L) {
                    var9 = (class98) field2691.method3202(this.field2690);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class93[] var13 = new class93[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class93 var17 = class40.method675(var16 - 256).method766();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method114(var16 - 512).method864(this.field2688);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2682[var20] < Statics.field2687[var20].length) {
                        var19.method1905(Statics.field2022[var20], Statics.field2687[var20][this.field2682[var20]]);
                    }
                    if (this.field2682[var20] < Statics.field2686[var20].length) {
                        var19.method1905(Statics.field2681[var20], Statics.field2686[var20][this.field2682[var20]]);
                    }
                }
                var9 = var19.method1913(64, 850, -30, -50, -30);
                field2691.method3204(var9, var5);
                this.field2690 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method685(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method682(var9, arg3);
        } else {
            var21 = arg0.method682(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fy.u(I)Lcf;")
    public class93 method2952() {
        if (this.field2684 != -1) {
            return class35.method2397(this.field2684).method579();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2692[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method675(var3 - 256).method740()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method114(var3 - 512).method844(this.field2688)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2692[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method675(var7 - 256).method742();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method114(var7 - 512).method842(this.field2688);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2682[var11] < Statics.field2687[var11].length) {
                var10.method1905(Statics.field2022[var11], Statics.field2687[var11][this.field2682[var11]]);
            }
            if (this.field2682[var11] < Statics.field2686[var11].length) {
                var10.method1905(Statics.field2681[var11], Statics.field2686[var11][this.field2682[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fy.j(B)I")
    public int method2957() {
        return this.field2684 == -1 ? (this.field2692[11] << 5) + (this.field2692[8] << 10) + (this.field2692[0] << 15) + (this.field2682[0] << 25) + (this.field2682[4] << 20) + this.field2692[1] : 305419896 + class35.method2397(this.field2684).field788;
    }
}
