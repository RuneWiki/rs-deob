package deob;

@ObfuscatedName("ic")
public class class240 {

    @ObfuscatedName("ic.o")
    public int[] field2796;

    @ObfuscatedName("ic.k")
    public int[] field2790;

    @ObfuscatedName("ic.t")
    public boolean field2791;

    @ObfuscatedName("ic.d")
    public int field2789;

    @ObfuscatedName("ic.h")
    public long field2793;

    @ObfuscatedName("ic.m")
    public long field2794;

    @ObfuscatedName("ic.y")
    public static final int[] field2797 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ic.a")
    public static class213 field2798 = new class213(260);

    @ObfuscatedName("ic.o([I[IZII)V")
    public void method4035(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3520; var6++) {
                    class275 var7 = class275.method3062(var6);
                    if (var7 != null && !var7.field3522 && var7.field3511 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2797[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2796 = arg0;
        this.field2790 = arg1;
        this.field2791 = arg2;
        this.field2789 = arg3;
        this.method4021();
    }

    @ObfuscatedName("ic.k(IZB)V")
    public void method4018(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2791) {
            return;
        }
        int var3 = this.field2796[field2797[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class275 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3520) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3520 - 1;
                }
            }
            var4 = class275.method3062(var3);
        } while (var4 == null || var4.field3522 || (this.field2791 ? 7 : 0) + arg0 != var4.field3511);
        this.field2796[field2797[arg0]] = var3 + 256;
        this.method4021();
    }

    @ObfuscatedName("ic.t(IZI)V")
    public void method4045(int arg0, boolean arg1) {
        int var3 = this.field2790[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2792[arg0].length) {
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
                    var3 = Statics.field2792[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2790[arg0] = var3;
        this.method4021();
    }

    @ObfuscatedName("ic.d(ZI)V")
    public void method4025(boolean arg0) {
        if (this.field2791 != arg0) {
            this.method4035((int[]) null, this.field2790, arg0, -1);
        }
    }

    @ObfuscatedName("ic.h(Lgc;I)V")
    public void method4037(class195 arg0) {
        arg0.method3189(this.field2791 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2796[field2797[var2]];
            if (var3 == 0) {
                arg0.method3189(-1);
            } else {
                arg0.method3189(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3189(this.field2790[var4]);
        }
    }

    @ObfuscatedName("ic.m(I)V")
    public void method4021() {
        long var1 = this.field2793;
        int var3 = this.field2796[5];
        int var4 = this.field2796[9];
        this.field2796[5] = var4;
        this.field2796[9] = var3;
        this.field2793 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2793 <<= 0x4;
            if (this.field2796[var5] >= 256) {
                this.field2793 += (long) (this.field2796[var5] - 256);
            }
        }
        if (this.field2796[0] >= 256) {
            this.field2793 += (long) (this.field2796[0] - 256 >> 4);
        }
        if (this.field2796[1] >= 256) {
            this.field2793 += (long) (this.field2796[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2793 <<= 0x3;
            this.field2793 += (long) this.field2790[var6];
        }
        this.field2793 <<= 0x1;
        this.field2793 += (long) (this.field2791 ? 1 : 0);
        this.field2796[5] = var3;
        this.field2796[9] = var4;
        if (var1 != 0L && this.field2793 != var1) {
            field2798.method3602(var1);
        }
    }

    @ObfuscatedName("ic.z(Lke;ILke;II)Lei;")
    public class132 method4022(class288 arg0, int arg1, class288 arg2, int arg3) {
        if (this.field2789 != -1) {
            return class286.method3973(this.field2789).method4732(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2793;
        int[] var7 = this.field2796;
        if (arg0 != null && (arg0.field3763 >= 0 || arg0.field3767 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2796[var8];
            }
            if (arg0.field3763 >= 0) {
                var5 += (long) (arg0.field3763 - this.field2796[5] << 40);
                var7[5] = arg0.field3763;
            }
            if (arg0.field3767 >= 0) {
                var5 += (long) (arg0.field3767 - this.field2796[3] << 48);
                var7[3] = arg0.field3767;
            }
        }
        class132 var9 = (class132) field2798.method3601(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class275.method3062(var12 - 256).method4455()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class284.method660(var12 - 512).method4681(this.field2791)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2794 != -1L) {
                    var9 = (class132) field2798.method3601(this.field2794);
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
                        class126 var17 = class275.method3062(var16 - 256).method4452();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class126 var18 = class284.method660(var16 - 512).method4707(this.field2791);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class126 var19 = new class126(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2790[var20] < Statics.field2792[var20].length) {
                        var19.method2385(Statics.field2795[var20], Statics.field2792[var20][this.field2790[var20]]);
                    }
                    if (this.field2790[var20] < Statics.field2136[var20].length) {
                        var19.method2385(Statics.field247[var20], Statics.field2136[var20][this.field2790[var20]]);
                    }
                }
                var9 = var19.method2393(64, 850, -30, -50, -30);
                field2798.method3603(var9, var5);
                this.field2794 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class132 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4809(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4786(var9, arg3);
        } else {
            var21 = arg0.method4786(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ic.i(I)Ldg;")
    public class126 method4023() {
        if (this.field2789 != -1) {
            return class286.method3973(this.field2789).method4760();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2796[var2];
            if (var3 >= 256 && var3 < 512 && !class275.method3062(var3 - 256).method4453()) {
                var1 = true;
            }
            if (var3 >= 512 && !class284.method660(var3 - 512).method4680(this.field2791)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class126[] var4 = new class126[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2796[var6];
            if (var7 >= 256 && var7 < 512) {
                class126 var8 = class275.method3062(var7 - 256).method4451();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class126 var9 = class284.method660(var7 - 512).method4676(this.field2791);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class126 var10 = new class126(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2790[var11] < Statics.field2792[var11].length) {
                var10.method2385(Statics.field2795[var11], Statics.field2792[var11][this.field2790[var11]]);
            }
            if (this.field2790[var11] < Statics.field2136[var11].length) {
                var10.method2385(Statics.field247[var11], Statics.field2136[var11][this.field2790[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ic.u(I)I")
    public int method4024() {
        return this.field2789 == -1 ? (this.field2796[11] << 5) + (this.field2796[8] << 10) + (this.field2796[0] << 15) + (this.field2790[4] << 20) + (this.field2790[0] << 25) + this.field2796[1] : 305419896 + class286.method3973(this.field2789).field3708;
    }

    @ObfuscatedName("fh.x(S)V")
    public static void method3033() {
        field2798.method3604();
    }
}
