package deob;

@ObfuscatedName("fd")
public class class169 {

    @ObfuscatedName("fd.q")
    public int[] field2755;

    @ObfuscatedName("fd.s")
    public int[] field2753;

    @ObfuscatedName("fd.h")
    public boolean field2754;

    @ObfuscatedName("fd.e")
    public int field2763;

    @ObfuscatedName("fd.n")
    public long field2752;

    @ObfuscatedName("fd.t")
    public long field2757;

    @ObfuscatedName("fd.p")
    public static final int[] field2761 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fd.u")
    public static class183 field2762 = new class183(260);

    @ObfuscatedName("fd.q([I[IZII)V")
    public void method3032(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field961; var6++) {
                    class42 var7 = class42.method2425(var6);
                    if (var7 != null && !var7.field956 && (arg2 ? 7 : 0) + var5 == var7.field954) {
                        arg0[field2761[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2755 = arg0;
        this.field2753 = arg1;
        this.field2754 = arg2;
        this.field2763 = arg3;
        this.method3019();
    }

    @ObfuscatedName("fd.s(IZI)V")
    public void method3015(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2754) {
            return;
        }
        int var3 = this.field2755[field2761[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class42 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field961) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field961 - 1;
                }
            }
            var4 = class42.method2425(var3);
        } while (var4 == null || var4.field956 || var4.field954 != arg0 + (this.field2754 ? 7 : 0));
        this.field2755[field2761[arg0]] = var3 + 256;
        this.method3019();
    }

    @ObfuscatedName("fd.h(IZB)V")
    public void method3016(int arg0, boolean arg1) {
        int var3 = this.field2753[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2758[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 == 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2758[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2753[arg0] = var3;
        this.method3019();
    }

    @ObfuscatedName("fd.e(ZB)V")
    public void method3017(boolean arg0) {
        if (this.field2754 != arg0) {
            this.method3032((int[]) null, this.field2753, arg0, -1);
        }
    }

    @ObfuscatedName("fd.n(Ldx;I)V")
    public void method3018(class111 arg0) {
        arg0.method2133(this.field2754 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2755[field2761[var2]];
            if (var3 == 0) {
                arg0.method2133(-1);
            } else {
                arg0.method2133(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2133(this.field2753[var4]);
        }
    }

    @ObfuscatedName("fd.t(B)V")
    public void method3019() {
        long var1 = this.field2752;
        int var3 = this.field2755[5];
        int var4 = this.field2755[9];
        this.field2755[5] = var4;
        this.field2755[9] = var3;
        this.field2752 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2752 <<= 0x4;
            if (this.field2755[var5] >= 256) {
                this.field2752 += (long) (this.field2755[var5] - 256);
            }
        }
        if (this.field2755[0] >= 256) {
            this.field2752 += (long) (this.field2755[0] - 256 >> 4);
        }
        if (this.field2755[1] >= 256) {
            this.field2752 += (long) (this.field2755[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2752 <<= 0x3;
            this.field2752 += (long) this.field2753[var6];
        }
        this.field2752 <<= 0x1;
        this.field2752 += (long) (this.field2754 ? 1 : 0);
        this.field2755[5] = var3;
        this.field2755[9] = var4;
        if (var1 != 0L && this.field2752 != var1) {
            field2762.method3244(var1);
        }
    }

    @ObfuscatedName("fd.l(Las;ILas;IB)Lch;")
    public class100 method3020(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field2763 != -1) {
            return class37.method1870(this.field2763).method642(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2752;
        int[] var7 = this.field2755;
        if (arg0 != null && (arg0.field923 >= 0 || arg0.field927 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2755[var8];
            }
            if (arg0.field923 >= 0) {
                var5 += (long) (arg0.field923 - this.field2755[5] << 40);
                var7[5] = arg0.field923;
            }
            if (arg0.field927 >= 0) {
                var5 += (long) (arg0.field927 - this.field2755[3] << 48);
                var7[3] = arg0.field927;
            }
        }
        class100 var9 = (class100) field2762.method3243(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class42.method2425(var12 - 256).method790()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class47.method832(var12 - 512).method859(this.field2754)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2757 != -1L) {
                    var9 = (class100) field2762.method3243(this.field2757);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class95[] var13 = new class95[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class95 var17 = class42.method2425(var16 - 256).method778();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class95 var18 = class47.method832(var16 - 512).method852(this.field2754);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class95 var19 = new class95(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2753[var20] < Statics.field2758[var20].length) {
                        var19.method1912(Statics.field2756[var20], Statics.field2758[var20][this.field2753[var20]]);
                    }
                    if (this.field2753[var20] < Statics.field807[var20].length) {
                        var19.method1912(Statics.field2760[var20], Statics.field807[var20][this.field2753[var20]]);
                    }
                }
                var9 = var19.method1965(64, 850, -30, -50, -30);
                field2762.method3253(var9, var5);
                this.field2757 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class100 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method728(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method725(var9, arg3);
        } else {
            var21 = arg0.method725(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fd.m(S)Lcl;")
    public class95 method3021() {
        if (this.field2763 != -1) {
            return class37.method1870(this.field2763).method653();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2755[var2];
            if (var3 >= 256 && var3 < 512 && !class42.method2425(var3 - 256).method791()) {
                var1 = true;
            }
            if (var3 >= 512 && !class47.method832(var3 - 512).method862(this.field2754)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class95[] var4 = new class95[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2755[var6];
            if (var7 >= 256 && var7 < 512) {
                class95 var8 = class42.method2425(var7 - 256).method774();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class95 var9 = class47.method832(var7 - 512).method887(this.field2754);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class95 var10 = new class95(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2753[var11] < Statics.field2758[var11].length) {
                var10.method1912(Statics.field2756[var11], Statics.field2758[var11][this.field2753[var11]]);
            }
            if (this.field2753[var11] < Statics.field807[var11].length) {
                var10.method1912(Statics.field2760[var11], Statics.field807[var11][this.field2753[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fd.o(I)I")
    public int method3029() {
        return this.field2763 == -1 ? (this.field2755[11] << 5) + (this.field2755[8] << 10) + (this.field2755[0] << 15) + (this.field2753[0] << 25) + (this.field2753[4] << 20) + this.field2755[1] : 305419896 + class37.method1870(this.field2763).field813;
    }
}
