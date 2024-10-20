package deob;

@ObfuscatedName("fz")
public class class167 {

    @ObfuscatedName("fz.s")
    public int[] field2182;

    @ObfuscatedName("fz.c")
    public int[] field2179;

    @ObfuscatedName("fz.f")
    public boolean field2180;

    @ObfuscatedName("fz.h")
    public int field2181;

    @ObfuscatedName("fz.a")
    public long field2186;

    @ObfuscatedName("fz.g")
    public long field2183;

    @ObfuscatedName("fz.r")
    public static final int[] field2178 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fz.n")
    public static class125 field2185 = new class125(260);

    @ObfuscatedName("fz.s([I[IZII)V")
    public void method2852(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2824; var6++) {
                    class193 var7 = class193.method3129(var6);
                    if (var7 != null && !var7.field2833 && var7.field2828 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2178[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2182 = arg0;
        this.field2179 = arg1;
        this.field2180 = arg2;
        this.field2181 = arg3;
        this.method2857();
    }

    @ObfuscatedName("fz.c(IZI)V")
    public void method2853(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2180) {
            return;
        }
        int var3 = this.field2182[field2178[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class193 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2824) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2824 - 1;
                }
            }
            var4 = class193.method3129(var3);
        } while (var4 == null || var4.field2833 || var4.field2828 != (this.field2180 ? 7 : 0) + arg0);
        this.field2182[field2178[arg0]] = var3 + 256;
        this.method2857();
    }

    @ObfuscatedName("fz.f(IZI)V")
    public void method2854(int arg0, boolean arg1) {
        int var3 = this.field2179[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1817[arg0].length) {
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
                    var3 = Statics.field1817[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2179[arg0] = var3;
        this.method2857();
    }

    @ObfuscatedName("fz.g(ZI)V")
    public void method2855(boolean arg0) {
        if (this.field2180 != arg0) {
            this.method2852((int[]) null, this.field2179, arg0, -1);
        }
    }

    @ObfuscatedName("fz.k(Lea;I)V")
    public void method2856(class154 arg0) {
        arg0.method2531(this.field2180 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2182[field2178[var2]];
            if (var3 == 0) {
                arg0.method2531(-1);
            } else {
                arg0.method2531(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2531(this.field2179[var4]);
        }
    }

    @ObfuscatedName("fz.u(B)V")
    public void method2857() {
        long var1 = this.field2186;
        int var3 = this.field2182[5];
        int var4 = this.field2182[9];
        this.field2182[5] = var4;
        this.field2182[9] = var3;
        this.field2186 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2186 <<= 0x4;
            if (this.field2182[var5] >= 256) {
                this.field2186 += (long) (this.field2182[var5] - 256);
            }
        }
        if (this.field2182[0] >= 256) {
            this.field2186 += (long) (this.field2182[0] - 256 >> 4);
        }
        if (this.field2182[1] >= 256) {
            this.field2186 += (long) (this.field2182[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2186 <<= 0x3;
            this.field2186 += (long) this.field2179[var6];
        }
        this.field2186 <<= 0x1;
        this.field2186 += (long) (this.field2180 ? 1 : 0);
        this.field2182[5] = var3;
        this.field2182[9] = var4;
        if (var1 != 0L && this.field2186 != var1) {
            field2185.method2120(var1);
        }
    }

    @ObfuscatedName("fz.b(Lgx;ILgx;IB)Lcz;")
    public class83 method2858(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field2181 != -1) {
            return Statics.method2743(this.field2181).method3388(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2186;
        int[] var7 = this.field2182;
        if (arg0 != null && (arg0.field3058 >= 0 || arg0.field3071 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2182[var8];
            }
            if (arg0.field3058 >= 0) {
                var5 += (long) (arg0.field3058 - this.field2182[5] << 40);
                var7[5] = arg0.field3058;
            }
            if (arg0.field3071 >= 0) {
                var5 += (long) (arg0.field3071 - this.field2182[3] << 48);
                var7[3] = arg0.field3071;
            }
        }
        class83 var9 = (class83) field2185.method2121(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class193.method3129(var12 - 256).method3183()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class199.method699(var12 - 512).method3343(this.field2180)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2183 != -1L) {
                    var9 = (class83) field2185.method2121(this.field2183);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class77[] var13 = new class77[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class77 var17 = class193.method3129(var16 - 256).method3184();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = class199.method699(var16 - 512).method3340(this.field2180);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2179[var20] < Statics.field1817[var20].length) {
                        var19.method1364(Statics.field964[var20], Statics.field1817[var20][this.field2179[var20]]);
                    }
                    if (this.field2179[var20] < Statics.field794[var20].length) {
                        var19.method1364(Statics.field2184[var20], Statics.field794[var20][this.field2179[var20]]);
                    }
                }
                var9 = var19.method1371(64, 850, -30, -50, -30);
                field2185.method2123(var9, var5);
                this.field2183 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3435(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3408(var9, arg3);
        } else {
            var21 = arg0.method3408(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fz.x(B)Lbu;")
    public class77 method2875() {
        if (this.field2181 != -1) {
            return Statics.method2743(this.field2181).method3371();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2182[var2];
            if (var3 >= 256 && var3 < 512 && !class193.method3129(var3 - 256).method3185()) {
                var1 = true;
            }
            if (var3 >= 512 && !class199.method699(var3 - 512).method3356(this.field2180)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class77[] var4 = new class77[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2182[var6];
            if (var7 >= 256 && var7 < 512) {
                class77 var8 = class193.method3129(var7 - 256).method3201();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = class199.method699(var7 - 512).method3334(this.field2180);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2179[var11] < Statics.field1817[var11].length) {
                var10.method1364(Statics.field964[var11], Statics.field1817[var11][this.field2179[var11]]);
            }
            if (this.field2179[var11] < Statics.field794[var11].length) {
                var10.method1364(Statics.field2184[var11], Statics.field794[var11][this.field2179[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fz.r(I)I")
    public int method2861() {
        return this.field2181 == -1 ? (this.field2182[11] << 5) + (this.field2182[8] << 10) + (this.field2182[0] << 15) + (this.field2179[4] << 20) + (this.field2179[0] << 25) + this.field2182[1] : 305419896 + Statics.method2743(this.field2181).field3009;
    }

    @ObfuscatedName("ff.n(I)V")
    public static void method2766() {
        field2185.method2124();
    }
}
