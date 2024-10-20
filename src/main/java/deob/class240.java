package deob;

@ObfuscatedName("ig")
public class class240 {

    @ObfuscatedName("ig.g")
    public int[] field2800;

    @ObfuscatedName("ig.e")
    public int[] field2796;

    @ObfuscatedName("ig.b")
    public boolean field2797;

    @ObfuscatedName("ig.z")
    public int field2798;

    @ObfuscatedName("ig.n")
    public long field2795;

    @ObfuscatedName("ig.l")
    public long field2801;

    @ObfuscatedName("ig.i")
    public static final int[] field2802 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ig.o")
    public static class213 field2803 = new class213(260);

    @ObfuscatedName("ig.g([I[IZII)V")
    public void method4157(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3515; var6++) {
                    class275 var7 = class275.method1172(var6);
                    if (var7 != null && !var7.field3512 && var7.field3513 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2802[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2800 = arg0;
        this.field2796 = arg1;
        this.field2797 = arg2;
        this.field2798 = arg3;
        this.method4147();
    }

    @ObfuscatedName("ig.e(IZI)V")
    public void method4133(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2797) {
            return;
        }
        int var3 = this.field2800[field2802[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class275 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3515) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3515 - 1;
                }
            }
            var4 = class275.method1172(var3);
        } while (var4 == null || var4.field3512 || var4.field3513 != arg0 + (this.field2797 ? 7 : 0));
        this.field2800[field2802[arg0]] = var3 + 256;
        this.method4147();
    }

    @ObfuscatedName("ig.b(IZI)V")
    public void method4134(int arg0, boolean arg1) {
        int var3 = this.field2796[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2700[arg0].length) {
                    var3 = 0;
                }
            } while (!class241.method508(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2700[arg0].length - 1;
                }
            } while (!class241.method508(arg0, var3));
        }
        this.field2796[arg0] = var3;
        this.method4147();
    }

    @ObfuscatedName("ig.z(ZI)V")
    public void method4131(boolean arg0) {
        if (this.field2797 != arg0) {
            this.method4157((int[]) null, this.field2796, arg0, -1);
        }
    }

    @ObfuscatedName("ig.n(Lgg;I)V")
    public void method4136(class195 arg0) {
        arg0.method3363(this.field2797 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2800[field2802[var2]];
            if (var3 == 0) {
                arg0.method3363(-1);
            } else {
                arg0.method3363(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3363(this.field2796[var4]);
        }
    }

    @ObfuscatedName("ig.l(B)V")
    public void method4147() {
        long var1 = this.field2795;
        int var3 = this.field2800[5];
        int var4 = this.field2800[9];
        this.field2800[5] = var4;
        this.field2800[9] = var3;
        this.field2795 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2795 <<= 0x4;
            if (this.field2800[var5] >= 256) {
                this.field2795 += (long) (this.field2800[var5] - 256);
            }
        }
        if (this.field2800[0] >= 256) {
            this.field2795 += (long) (this.field2800[0] - 256 >> 4);
        }
        if (this.field2800[1] >= 256) {
            this.field2795 += (long) (this.field2800[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2795 <<= 0x3;
            this.field2795 += (long) this.field2796[var6];
        }
        this.field2795 <<= 0x1;
        this.field2795 += (long) (this.field2797 ? 1 : 0);
        this.field2800[5] = var3;
        this.field2800[9] = var4;
        if (var1 != 0L && this.field2795 != var1) {
            field2803.method3705(var1);
        }
    }

    @ObfuscatedName("ig.s(Lkc;ILkc;IB)Lee;")
    public class132 method4138(class288 arg0, int arg1, class288 arg2, int arg3) {
        if (this.field2798 != -1) {
            return Statics.method2738(this.field2798).method4797(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2795;
        int[] var7 = this.field2800;
        if (arg0 != null && (arg0.field3763 >= 0 || arg0.field3771 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2800[var8];
            }
            if (arg0.field3763 >= 0) {
                var5 += (long) (arg0.field3763 - this.field2800[5] << 40);
                var7[5] = arg0.field3763;
            }
            if (arg0.field3771 >= 0) {
                var5 += (long) (arg0.field3771 - this.field2800[3] << 48);
                var7[3] = arg0.field3771;
            }
        }
        class132 var9 = (class132) field2803.method3706(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class275.method1172(var12 - 256).method4544()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class284.method2027(var12 - 512).method4746(this.field2797)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2801 != -1L) {
                    var9 = (class132) field2803.method3706(this.field2801);
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
                        class126 var17 = class275.method1172(var16 - 256).method4564();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class126 var18 = class284.method2027(var16 - 512).method4747(this.field2797);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class126 var19 = new class126(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2796[var20] < Statics.field2700[var20].length) {
                        var19.method2534(Statics.field2799[var20], Statics.field2700[var20][this.field2796[var20]]);
                    }
                    if (this.field2796[var20] < Statics.field2122[var20].length) {
                        var19.method2534(Statics.field2592[var20], Statics.field2122[var20][this.field2796[var20]]);
                    }
                }
                var9 = var19.method2505(64, 850, -30, -50, -30);
                field2803.method3712(var9, var5);
                this.field2801 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class132 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4847(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4844(var9, arg3);
        } else {
            var21 = arg0.method4844(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ig.y(B)Ldi;")
    public class126 method4139() {
        if (this.field2798 != -1) {
            return Statics.method2738(this.field2798).method4804();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2800[var2];
            if (var3 >= 256 && var3 < 512 && !class275.method1172(var3 - 256).method4545()) {
                var1 = true;
            }
            if (var3 >= 512 && !class284.method2027(var3 - 512).method4748(this.field2797)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class126[] var4 = new class126[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2800[var6];
            if (var7 >= 256 && var7 < 512) {
                class126 var8 = class275.method1172(var7 - 256).method4546();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class126 var9 = class284.method2027(var7 - 512).method4749(this.field2797);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class126 var10 = new class126(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2796[var11] < Statics.field2700[var11].length) {
                var10.method2534(Statics.field2799[var11], Statics.field2700[var11][this.field2796[var11]]);
            }
            if (this.field2796[var11] < Statics.field2122[var11].length) {
                var10.method2534(Statics.field2592[var11], Statics.field2122[var11][this.field2796[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ig.c(I)I")
    public int method4140() {
        return this.field2798 == -1 ? (this.field2800[11] << 5) + (this.field2800[8] << 10) + (this.field2800[0] << 15) + (this.field2796[4] << 20) + (this.field2796[0] << 25) + this.field2800[1] : 305419896 + Statics.method2738(this.field2798).field3737;
    }
}
