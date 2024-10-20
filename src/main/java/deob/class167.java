package deob;

@ObfuscatedName("fp")
public class class167 {

    @ObfuscatedName("fp.p")
    public int[] field2169;

    @ObfuscatedName("fp.g")
    public int[] field2178;

    @ObfuscatedName("fp.x")
    public boolean field2168;

    @ObfuscatedName("fp.q")
    public int field2175;

    @ObfuscatedName("fp.d")
    public long field2170;

    @ObfuscatedName("fp.k")
    public long field2171;

    @ObfuscatedName("fp.c")
    public static final int[] field2174 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fp.m")
    public static class125 field2167 = new class125(260);

    @ObfuscatedName("fp.p([I[IZII)V")
    public void method2923(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2815; var6++) {
                    class193 var7 = class193.method3160(var6);
                    if (var7 != null && !var7.field2819 && (arg2 ? 7 : 0) + var5 == var7.field2817) {
                        arg0[field2174[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2169 = arg0;
        this.field2178 = arg1;
        this.field2168 = arg2;
        this.field2175 = arg3;
        this.method2892();
    }

    @ObfuscatedName("fp.g(IZI)V")
    public void method2888(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2168) {
            return;
        }
        int var3 = this.field2169[field2174[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class193 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2815) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2815 - 1;
                }
            }
            var4 = class193.method3160(var3);
        } while (var4 == null || var4.field2819 || (this.field2168 ? 7 : 0) + arg0 != var4.field2817);
        this.field2169[field2174[arg0]] = var3 + 256;
        this.method2892();
    }

    @ObfuscatedName("fp.x(IZB)V")
    public void method2889(int arg0, boolean arg1) {
        int var3 = this.field2178[arg0];
        boolean var4;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2172[arg0].length) {
                    var3 = 0;
                }
            } while (!class168.method1798(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2172[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2178[arg0] = var3;
        this.method2892();
    }

    @ObfuscatedName("fp.q(ZB)V")
    public void method2890(boolean arg0) {
        if (this.field2168 != arg0) {
            this.method2923((int[]) null, this.field2178, arg0, -1);
        }
    }

    @ObfuscatedName("fp.d(Lev;I)V")
    public void method2891(class154 arg0) {
        arg0.method2578(this.field2168 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2169[field2174[var2]];
            if (var3 == 0) {
                arg0.method2578(-1);
            } else {
                arg0.method2578(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2578(this.field2178[var4]);
        }
    }

    @ObfuscatedName("fp.k(B)V")
    public void method2892() {
        long var1 = this.field2170;
        int var3 = this.field2169[5];
        int var4 = this.field2169[9];
        this.field2169[5] = var4;
        this.field2169[9] = var3;
        this.field2170 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2170 <<= 0x4;
            if (this.field2169[var5] >= 256) {
                this.field2170 += (long) (this.field2169[var5] - 256);
            }
        }
        if (this.field2169[0] >= 256) {
            this.field2170 += (long) (this.field2169[0] - 256 >> 4);
        }
        if (this.field2169[1] >= 256) {
            this.field2170 += (long) (this.field2169[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2170 <<= 0x3;
            this.field2170 += (long) this.field2178[var6];
        }
        this.field2170 <<= 0x1;
        this.field2170 += (long) (this.field2168 ? 1 : 0);
        this.field2169[5] = var3;
        this.field2169[9] = var4;
        if (var1 != 0L && this.field2170 != var1) {
            field2167.method2171(var1);
        }
    }

    @ObfuscatedName("fp.j(Lgu;ILgu;II)Lcw;")
    public class83 method2893(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field2175 != -1) {
            return class200.method1450(this.field2175).method3460(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2170;
        int[] var7 = this.field2169;
        if (arg0 != null && (arg0.field3060 >= 0 || arg0.field3059 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2169[var8];
            }
            if (arg0.field3060 >= 0) {
                var5 += (long) (arg0.field3060 - this.field2169[5] << 40);
                var7[5] = arg0.field3060;
            }
            if (arg0.field3059 >= 0) {
                var5 += (long) (arg0.field3059 - this.field2169[3] << 48);
                var7[3] = arg0.field3059;
            }
        }
        class83 var9 = (class83) field2167.method2169(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class193.method3160(var12 - 256).method3238()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class199.method713(var12 - 512).method3406(this.field2168)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2171 != -1L) {
                    var9 = (class83) field2167.method2169(this.field2171);
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
                        class77 var17 = class193.method3160(var16 - 256).method3241();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = class199.method713(var16 - 512).method3407(this.field2168);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2178[var20] < Statics.field2172[var20].length) {
                        var19.method1373(Statics.field3230[var20], Statics.field2172[var20][this.field2178[var20]]);
                    }
                    if (this.field2178[var20] < Statics.field684[var20].length) {
                        var19.method1373(Statics.field2173[var20], Statics.field684[var20][this.field2178[var20]]);
                    }
                }
                var9 = var19.method1381(64, 850, -30, -50, -30);
                field2167.method2174(var9, var5);
                this.field2171 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3506(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3528(var9, arg3);
        } else {
            var21 = arg0.method3528(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fp.s(I)Lbz;")
    public class77 method2894() {
        if (this.field2175 != -1) {
            return class200.method1450(this.field2175).method3455();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2169[var2];
            if (var3 >= 256 && var3 < 512 && !class193.method3160(var3 - 256).method3240()) {
                var1 = true;
            }
            if (var3 >= 512 && !class199.method713(var3 - 512).method3429(this.field2168)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class77[] var4 = new class77[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2169[var6];
            if (var7 >= 256 && var7 < 512) {
                class77 var8 = class193.method3160(var7 - 256).method3249();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = class199.method713(var7 - 512).method3409(this.field2168);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2178[var11] < Statics.field2172[var11].length) {
                var10.method1373(Statics.field3230[var11], Statics.field2172[var11][this.field2178[var11]]);
            }
            if (this.field2178[var11] < Statics.field684[var11].length) {
                var10.method1373(Statics.field2173[var11], Statics.field684[var11][this.field2178[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fp.o(I)I")
    public int method2895() {
        return this.field2175 == -1 ? (this.field2169[11] << 5) + (this.field2169[8] << 10) + (this.field2169[0] << 15) + (this.field2178[0] << 25) + (this.field2178[4] << 20) + this.field2169[1] : 305419896 + class200.method1450(this.field2175).field3010;
    }

    @ObfuscatedName("g.a(S)V")
    public static void method18() {
        field2167.method2170();
    }
}
