package deob;

@ObfuscatedName("fg")
public class class170 {

    @ObfuscatedName("fg.p")
    public int[] field2817;

    @ObfuscatedName("fg.k")
    public int[] field2816;

    @ObfuscatedName("fg.e")
    public boolean field2818;

    @ObfuscatedName("fg.f")
    public int field2815;

    @ObfuscatedName("fg.w")
    public long field2819;

    @ObfuscatedName("fg.t")
    public long field2826;

    @ObfuscatedName("fg.m")
    public static final int[] field2821 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fg.h")
    public static class184 field2822 = new class184(260);

    @ObfuscatedName("fg.p([I[IZII)V")
    public void method3150(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field986; var6++) {
                    class42 var7 = class42.method93(var6);
                    if (var7 != null && !var7.field992 && var7.field990 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2821[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2817 = arg0;
        this.field2816 = arg1;
        this.field2818 = arg2;
        this.field2815 = arg3;
        this.method3136();
    }

    @ObfuscatedName("fg.k(IZI)V")
    public void method3148(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2818) {
            return;
        }
        int var3 = this.field2817[field2821[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class42 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field986) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field986 - 1;
                }
            }
            var4 = class42.method93(var3);
        } while (var4 == null || var4.field992 || (this.field2818 ? 7 : 0) + arg0 != var4.field990);
        this.field2817[field2821[arg0]] = var3 + 256;
        this.method3136();
    }

    @ObfuscatedName("fg.e(IZI)V")
    public void method3133(int arg0, boolean arg1) {
        int var3 = this.field2816[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1302[arg0].length) {
                    var3 = 0;
                }
            } while (!class165.method620(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1302[arg0].length - 1;
                }
            } while (!class165.method620(arg0, var3));
        }
        this.field2816[arg0] = var3;
        this.method3136();
    }

    @ObfuscatedName("fg.f(ZI)V")
    public void method3134(boolean arg0) {
        if (this.field2818 != arg0) {
            this.method3150((int[]) null, this.field2816, arg0, -1);
        }
    }

    @ObfuscatedName("fg.w(Lde;I)V")
    public void method3135(class111 arg0) {
        arg0.method2160(this.field2818 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2817[field2821[var2]];
            if (var3 == 0) {
                arg0.method2160(-1);
            } else {
                arg0.method2160(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2160(this.field2816[var4]);
        }
    }

    @ObfuscatedName("fg.t(B)V")
    public void method3136() {
        long var1 = this.field2819;
        int var3 = this.field2817[5];
        int var4 = this.field2817[9];
        this.field2817[5] = var4;
        this.field2817[9] = var3;
        this.field2819 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2819 <<= 0x4;
            if (this.field2817[var5] >= 256) {
                this.field2819 += (long) (this.field2817[var5] - 256);
            }
        }
        if (this.field2817[0] >= 256) {
            this.field2819 += (long) (this.field2817[0] - 256 >> 4);
        }
        if (this.field2817[1] >= 256) {
            this.field2819 += (long) (this.field2817[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2819 <<= 0x3;
            this.field2819 += (long) this.field2816[var6];
        }
        this.field2819 <<= 0x1;
        this.field2819 += (long) (this.field2818 ? 1 : 0);
        this.field2817[5] = var3;
        this.field2817[9] = var4;
        if (var1 != 0L && this.field2819 != var1) {
            field2822.method3372(var1);
        }
    }

    @ObfuscatedName("fg.s(Law;ILaw;II)Lcm;")
    public class100 method3155(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field2815 != -1) {
            return class37.method143(this.field2815).method660(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2819;
        int[] var7 = this.field2817;
        if (arg0 != null && (arg0.field953 >= 0 || arg0.field954 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2817[var8];
            }
            if (arg0.field953 >= 0) {
                var5 += (long) (arg0.field953 - this.field2817[5] << 40);
                var7[5] = arg0.field953;
            }
            if (arg0.field954 >= 0) {
                var5 += (long) (arg0.field954 - this.field2817[3] << 48);
                var7[3] = arg0.field954;
            }
        }
        class100 var9 = (class100) field2822.method3371(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class42.method93(var12 - 256).method798()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class47.method2450(var12 - 512).method906(this.field2818)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2826 != -1L) {
                    var9 = (class100) field2822.method3371(this.field2826);
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
                        class95 var17 = class42.method93(var16 - 256).method799();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class95 var18 = class47.method2450(var16 - 512).method894(this.field2818);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class95 var19 = new class95(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2816[var20] < Statics.field1302[var20].length) {
                        var19.method1929(Statics.field827[var20], Statics.field1302[var20][this.field2816[var20]]);
                    }
                    if (this.field2816[var20] < Statics.field2132[var20].length) {
                        var19.method1929(Statics.field141[var20], Statics.field2132[var20][this.field2816[var20]]);
                    }
                }
                var9 = var19.method1937(64, 850, -30, -50, -30);
                field2822.method3370(var9, var5);
                this.field2826 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class100 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method745(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method768(var9, arg3);
        } else {
            var21 = arg0.method768(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fg.c(B)Lcv;")
    public class95 method3138() {
        if (this.field2815 != -1) {
            return class37.method143(this.field2815).method661();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2817[var2];
            if (var3 >= 256 && var3 < 512 && !class42.method93(var3 - 256).method800()) {
                var1 = true;
            }
            if (var3 >= 512 && !class47.method2450(var3 - 512).method895(this.field2818)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class95[] var4 = new class95[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2817[var6];
            if (var7 >= 256 && var7 < 512) {
                class95 var8 = class42.method93(var7 - 256).method795();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class95 var9 = class47.method2450(var7 - 512).method896(this.field2818);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class95 var10 = new class95(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2816[var11] < Statics.field1302[var11].length) {
                var10.method1929(Statics.field827[var11], Statics.field1302[var11][this.field2816[var11]]);
            }
            if (this.field2816[var11] < Statics.field2132[var11].length) {
                var10.method1929(Statics.field141[var11], Statics.field2132[var11][this.field2816[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fg.d(I)I")
    public int method3137() {
        return this.field2815 == -1 ? (this.field2817[11] << 5) + (this.field2817[8] << 10) + (this.field2817[0] << 15) + (this.field2816[0] << 25) + (this.field2816[4] << 20) + this.field2817[1] : 305419896 + class37.method143(this.field2815).field852;
    }

    @ObfuscatedName("ez.v(I)V")
    public static void method2830() {
        field2822.method3374();
    }
}
