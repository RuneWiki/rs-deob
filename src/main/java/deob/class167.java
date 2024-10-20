package deob;

@ObfuscatedName("fe")
public class class167 {

    @ObfuscatedName("fe.f")
    public int[] field2198;

    @ObfuscatedName("fe.i")
    public int[] field2186;

    @ObfuscatedName("fe.u")
    public boolean field2187;

    @ObfuscatedName("fe.h")
    public int field2188;

    @ObfuscatedName("fe.r")
    public long field2193;

    @ObfuscatedName("fe.o")
    public long field2190;

    @ObfuscatedName("fe.j")
    public static final int[] field2197 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fe.s")
    public static class125 field2194 = new class125(260);

    @ObfuscatedName("fe.f([I[IZIB)V")
    public void method3020(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2832; var6++) {
                    class193 var7 = class193.method2005(var6);
                    if (var7 != null && !var7.field2839 && var7.field2829 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2197[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2198 = arg0;
        this.field2186 = arg1;
        this.field2187 = arg2;
        this.field2188 = arg3;
        this.method2994();
    }

    @ObfuscatedName("fe.i(IZI)V")
    public void method3017(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2187) {
            return;
        }
        int var3 = this.field2198[field2197[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class193 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2832) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2832 - 1;
                }
            }
            var4 = class193.method2005(var3);
        } while (var4 == null || var4.field2839 || arg0 + (this.field2187 ? 7 : 0) != var4.field2829);
        this.field2198[field2197[arg0]] = var3 + 256;
        this.method2994();
    }

    @ObfuscatedName("fe.u(IZB)V")
    public void method2991(int arg0, boolean arg1) {
        int var3 = this.field2186[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2192[arg0].length) {
                    var3 = 0;
                }
            } while (!class168.method562(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2192[arg0].length - 1;
                }
            } while (!class168.method562(arg0, var3));
        }
        this.field2186[arg0] = var3;
        this.method2994();
    }

    @ObfuscatedName("fe.r(ZI)V")
    public void method2992(boolean arg0) {
        if (this.field2187 != arg0) {
            this.method3020((int[]) null, this.field2186, arg0, -1);
        }
    }

    @ObfuscatedName("fe.o(Leo;I)V")
    public void method2993(class154 arg0) {
        arg0.method2651(this.field2187 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2198[field2197[var2]];
            if (var3 == 0) {
                arg0.method2651(-1);
            } else {
                arg0.method2651(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2651(this.field2186[var4]);
        }
    }

    @ObfuscatedName("fe.l(I)V")
    public void method2994() {
        long var1 = this.field2193;
        int var3 = this.field2198[5];
        int var4 = this.field2198[9];
        this.field2198[5] = var4;
        this.field2198[9] = var3;
        this.field2193 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2193 <<= 0x4;
            if (this.field2198[var5] >= 256) {
                this.field2193 += (long) (this.field2198[var5] - 256);
            }
        }
        if (this.field2198[0] >= 256) {
            this.field2193 += (long) (this.field2198[0] - 256 >> 4);
        }
        if (this.field2198[1] >= 256) {
            this.field2193 += (long) (this.field2198[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2193 <<= 0x3;
            this.field2193 += (long) this.field2186[var6];
        }
        this.field2193 <<= 0x1;
        this.field2193 += (long) (this.field2187 ? 1 : 0);
        this.field2198[5] = var3;
        this.field2198[9] = var4;
        if (var1 != 0L && this.field2193 != var1) {
            field2194.method2242(var1);
        }
    }

    @ObfuscatedName("fe.n(Lgl;ILgl;II)Lce;")
    public class83 method2995(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field2188 != -1) {
            return class200.method168(this.field2188).method3515(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2193;
        int[] var7 = this.field2198;
        if (arg0 != null && (arg0.field3069 >= 0 || arg0.field3070 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2198[var8];
            }
            if (arg0.field3069 >= 0) {
                var5 += (long) (arg0.field3069 - this.field2198[5] << 40);
                var7[5] = arg0.field3069;
            }
            if (arg0.field3070 >= 0) {
                var5 += (long) (arg0.field3070 - this.field2198[3] << 48);
                var7[3] = arg0.field3070;
            }
        }
        class83 var9 = (class83) field2194.method2240(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class193.method2005(var12 - 256).method3328()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class199.method3402(var12 - 512).method3476(this.field2187)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2190 != -1L) {
                    var9 = (class83) field2194.method2240(this.field2190);
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
                        class77 var17 = class193.method2005(var16 - 256).method3343();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = class199.method3402(var16 - 512).method3464(this.field2187);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2186[var20] < Statics.field2192[var20].length) {
                        var19.method1422(Statics.field2191[var20], Statics.field2192[var20][this.field2186[var20]]);
                    }
                    if (this.field2186[var20] < Statics.field1322[var20].length) {
                        var19.method1422(Statics.field1447[var20], Statics.field1322[var20][this.field2186[var20]]);
                    }
                }
                var9 = var19.method1437(64, 850, -30, -50, -30);
                field2194.method2246(var9, var5);
                this.field2190 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3568(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3565(var9, arg3);
        } else {
            var21 = arg0.method3565(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fe.m(I)Lbp;")
    public class77 method2998() {
        if (this.field2188 != -1) {
            return class200.method168(this.field2188).method3516();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2198[var2];
            if (var3 >= 256 && var3 < 512 && !class193.method2005(var3 - 256).method3330()) {
                var1 = true;
            }
            if (var3 >= 512 && !class199.method3402(var3 - 512).method3473(this.field2187)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class77[] var4 = new class77[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2198[var6];
            if (var7 >= 256 && var7 < 512) {
                class77 var8 = class193.method2005(var7 - 256).method3331();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = class199.method3402(var7 - 512).method3466(this.field2187);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2186[var11] < Statics.field2192[var11].length) {
                var10.method1422(Statics.field2191[var11], Statics.field2192[var11][this.field2186[var11]]);
            }
            if (this.field2186[var11] < Statics.field1322[var11].length) {
                var10.method1422(Statics.field1447[var11], Statics.field1322[var11][this.field2186[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fe.w(S)I")
    public int method2997() {
        return this.field2188 == -1 ? (this.field2198[11] << 5) + (this.field2198[8] << 10) + (this.field2198[0] << 15) + (this.field2186[4] << 20) + (this.field2186[0] << 25) + this.field2198[1] : 305419896 + class200.method168(this.field2188).field3010;
    }

    @ObfuscatedName("bt.j(I)V")
    public static void method1405() {
        field2194.method2244();
    }
}
