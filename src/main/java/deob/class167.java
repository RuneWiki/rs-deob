package deob;

@ObfuscatedName("fw")
public class class167 {

    @ObfuscatedName("fw.u")
    public int[] field2158;

    @ObfuscatedName("fw.x")
    public int[] field2161;

    @ObfuscatedName("fw.i")
    public boolean field2154;

    @ObfuscatedName("fw.a")
    public int field2152;

    @ObfuscatedName("fw.f")
    public long field2156;

    @ObfuscatedName("fw.c")
    public long field2157;

    @ObfuscatedName("fw.t")
    public static final int[] field2159 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fw.m")
    public static class125 field2160 = new class125(260);

    @ObfuscatedName("fw.u([I[IZII)V")
    public void method2922(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2094; var6++) {
                    class193 var7 = class193.method2951(var6);
                    if (var7 != null && !var7.field2808 && var5 + (arg2 ? 7 : 0) == var7.field2804) {
                        arg0[field2159[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2158 = arg0;
        this.field2161 = arg1;
        this.field2154 = arg2;
        this.field2152 = arg3;
        this.method2927();
    }

    @ObfuscatedName("fw.x(IZI)V")
    public void method2923(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2154) {
            return;
        }
        int var3 = this.field2158[field2159[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class193 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2094) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2094 - 1;
                }
            }
            var4 = class193.method2951(var3);
        } while (var4 == null || var4.field2808 || var4.field2804 != arg0 + (this.field2154 ? 7 : 0));
        this.field2158[field2159[arg0]] = var3 + 256;
        this.method2927();
    }

    @ObfuscatedName("fw.i(IZI)V")
    public void method2924(int arg0, boolean arg1) {
        int var3 = this.field2161[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field3230[arg0].length) {
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
                    var3 = Statics.field3230[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2161[arg0] = var3;
        this.method2927();
    }

    @ObfuscatedName("fw.a(ZI)V")
    public void method2958(boolean arg0) {
        if (this.field2154 != arg0) {
            this.method2922((int[]) null, this.field2161, arg0, -1);
        }
    }

    @ObfuscatedName("fw.c(Len;I)V")
    public void method2926(class154 arg0) {
        arg0.method2573(this.field2154 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2158[field2159[var2]];
            if (var3 == 0) {
                arg0.method2573(-1);
            } else {
                arg0.method2573(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2573(this.field2161[var4]);
        }
    }

    @ObfuscatedName("fw.g(B)V")
    public void method2927() {
        long var1 = this.field2156;
        int var3 = this.field2158[5];
        int var4 = this.field2158[9];
        this.field2158[5] = var4;
        this.field2158[9] = var3;
        this.field2156 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2156 <<= 0x4;
            if (this.field2158[var5] >= 256) {
                this.field2156 += (long) (this.field2158[var5] - 256);
            }
        }
        if (this.field2158[0] >= 256) {
            this.field2156 += (long) (this.field2158[0] - 256 >> 4);
        }
        if (this.field2158[1] >= 256) {
            this.field2156 += (long) (this.field2158[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2156 <<= 0x3;
            this.field2156 += (long) this.field2161[var6];
        }
        this.field2156 <<= 0x1;
        this.field2156 += (long) (this.field2154 ? 1 : 0);
        this.field2158[5] = var3;
        this.field2158[9] = var4;
        if (var1 != 0L && this.field2156 != var1) {
            field2160.method2177(var1);
        }
    }

    @ObfuscatedName("fw.z(Lgg;ILgg;IB)Lcs;")
    public class83 method2955(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field2152 != -1) {
            return class200.method614(this.field2152).method3494(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2156;
        int[] var7 = this.field2158;
        if (arg0 != null && (arg0.field3039 >= 0 || arg0.field3051 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2158[var8];
            }
            if (arg0.field3039 >= 0) {
                var5 += (long) (arg0.field3039 - this.field2158[5] << 40);
                var7[5] = arg0.field3039;
            }
            if (arg0.field3051 >= 0) {
                var5 += (long) (arg0.field3051 - this.field2158[3] << 48);
                var7[3] = arg0.field3051;
            }
        }
        class83 var9 = (class83) field2160.method2186(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class193.method2951(var12 - 256).method3276()) {
                    var10 = true;
                }
                if (var12 >= 512 && !Statics.method1768(var12 - 512).method3435(this.field2154)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2157 != -1L) {
                    var9 = (class83) field2160.method2186(this.field2157);
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
                        class77 var17 = class193.method2951(var16 - 256).method3277();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = Statics.method1768(var16 - 512).method3436(this.field2154);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2161[var20] < Statics.field3230[var20].length) {
                        var19.method1357(Statics.field2099[var20], Statics.field3230[var20][this.field2161[var20]]);
                    }
                    if (this.field2161[var20] < Statics.field666[var20].length) {
                        var19.method1357(Statics.field2162[var20], Statics.field666[var20][this.field2161[var20]]);
                    }
                }
                var9 = var19.method1416(64, 850, -30, -50, -30);
                field2160.method2179(var9, var5);
                this.field2157 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3548(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3557(var9, arg3);
        } else {
            var21 = arg0.method3557(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fw.t(I)Lbc;")
    public class77 method2929() {
        if (this.field2152 != -1) {
            return class200.method614(this.field2152).method3497();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2158[var2];
            if (var3 >= 256 && var3 < 512 && !class193.method2951(var3 - 256).method3278()) {
                var1 = true;
            }
            if (var3 >= 512 && !Statics.method1768(var3 - 512).method3437(this.field2154)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class77[] var4 = new class77[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2158[var6];
            if (var7 >= 256 && var7 < 512) {
                class77 var8 = class193.method2951(var7 - 256).method3279();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = Statics.method1768(var7 - 512).method3483(this.field2154);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2161[var11] < Statics.field3230[var11].length) {
                var10.method1357(Statics.field2099[var11], Statics.field3230[var11][this.field2161[var11]]);
            }
            if (this.field2161[var11] < Statics.field666[var11].length) {
                var10.method1357(Statics.field2162[var11], Statics.field666[var11][this.field2161[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fw.m(I)I")
    public int method2928() {
        return this.field2152 == -1 ? (this.field2158[11] << 5) + (this.field2158[8] << 10) + (this.field2158[0] << 15) + (this.field2161[0] << 25) + (this.field2161[4] << 20) + this.field2158[1] : 305419896 + class200.method614(this.field2152).field2991;
    }

    @ObfuscatedName("bh.q(I)V")
    public static void method1292() {
        field2160.method2176();
    }
}
