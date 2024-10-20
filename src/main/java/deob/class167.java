package deob;

@ObfuscatedName("fm")
public class class167 {

    @ObfuscatedName("fm.b")
    public int[] field2162;

    @ObfuscatedName("fm.l")
    public int[] field2163;

    @ObfuscatedName("fm.i")
    public boolean field2169;

    @ObfuscatedName("fm.t")
    public int field2164;

    @ObfuscatedName("fm.k")
    public long field2165;

    @ObfuscatedName("fm.h")
    public long field2166;

    @ObfuscatedName("fm.x")
    public static final int[] field2171 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fm.z")
    public static class125 field2170 = new class125(260);

    @ObfuscatedName("fm.b([I[IZII)V")
    public void method3035(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2821; var6++) {
                    class193 var7 = class193.method1523(var6);
                    if (var7 != null && !var7.field2830 && var5 + (arg2 ? 7 : 0) == var7.field2823) {
                        arg0[field2171[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2162 = arg0;
        this.field2163 = arg1;
        this.field2169 = arg2;
        this.field2164 = arg3;
        this.method3050();
    }

    @ObfuscatedName("fm.l(IZI)V")
    public void method3047(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2169) {
            return;
        }
        int var3 = this.field2162[field2171[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class193 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2821) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2821 - 1;
                }
            }
            var4 = class193.method1523(var3);
        } while (var4 == null || var4.field2830 || (this.field2169 ? 7 : 0) + arg0 != var4.field2823);
        this.field2162[field2171[arg0]] = var3 + 256;
        this.method3050();
    }

    @ObfuscatedName("fm.i(IZB)V")
    public void method3037(int arg0, boolean arg1) {
        int var3 = this.field2163[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field152[arg0].length) {
                    var3 = 0;
                }
            } while (!class168.method1878(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field152[arg0].length - 1;
                }
            } while (!class168.method1878(arg0, var3));
        }
        this.field2163[arg0] = var3;
        this.method3050();
    }

    @ObfuscatedName("fm.t(ZI)V")
    public void method3038(boolean arg0) {
        if (this.field2169 != arg0) {
            this.method3035((int[]) null, this.field2163, arg0, -1);
        }
    }

    @ObfuscatedName("fm.k(Leg;I)V")
    public void method3039(class154 arg0) {
        arg0.method2832(this.field2169 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2162[field2171[var2]];
            if (var3 == 0) {
                arg0.method2832(-1);
            } else {
                arg0.method2832(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2832(this.field2163[var4]);
        }
    }

    @ObfuscatedName("fm.x(I)V")
    public void method3050() {
        long var1 = this.field2165;
        int var3 = this.field2162[5];
        int var4 = this.field2162[9];
        this.field2162[5] = var4;
        this.field2162[9] = var3;
        this.field2165 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2165 <<= 0x4;
            if (this.field2162[var5] >= 256) {
                this.field2165 += (long) (this.field2162[var5] - 256);
            }
        }
        if (this.field2162[0] >= 256) {
            this.field2165 += (long) (this.field2162[0] - 256 >> 4);
        }
        if (this.field2162[1] >= 256) {
            this.field2165 += (long) (this.field2162[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2165 <<= 0x3;
            this.field2165 += (long) this.field2163[var6];
        }
        this.field2165 <<= 0x1;
        this.field2165 += (long) (this.field2169 ? 1 : 0);
        this.field2162[5] = var3;
        this.field2162[9] = var4;
        if (var1 != 0L && this.field2165 != var1) {
            field2170.method2261(var1);
        }
    }

    @ObfuscatedName("fm.z(Lgb;ILgb;IB)Lcs;")
    public class83 method3048(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field2164 != -1) {
            return class200.method960(this.field2164).method3600(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2165;
        int[] var7 = this.field2162;
        if (arg0 != null && (arg0.field3071 >= 0 || arg0.field3072 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2162[var8];
            }
            if (arg0.field3071 >= 0) {
                var5 += (long) (arg0.field3071 - this.field2162[5] << 40);
                var7[5] = arg0.field3071;
            }
            if (arg0.field3072 >= 0) {
                var5 += (long) (arg0.field3072 - this.field2162[3] << 48);
                var7[3] = arg0.field3072;
            }
        }
        class83 var9 = (class83) field2170.method2256(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class193.method1523(var12 - 256).method3368()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class199.method3070(var12 - 512).method3528(this.field2169)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2166 != -1L) {
                    var9 = (class83) field2170.method2256(this.field2166);
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
                        class77 var17 = class193.method1523(var16 - 256).method3367();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = class199.method3070(var16 - 512).method3529(this.field2169);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2163[var20] < Statics.field152[var20].length) {
                        var19.method1502(Statics.field3213[var20], Statics.field152[var20][this.field2163[var20]]);
                    }
                    if (this.field2163[var20] < Statics.field2168[var20].length) {
                        var19.method1502(Statics.field2167[var20], Statics.field2168[var20][this.field2163[var20]]);
                    }
                }
                var9 = var19.method1467(64, 850, -30, -50, -30);
                field2170.method2258(var9, var5);
                this.field2166 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3676(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3653(var9, arg3);
        } else {
            var21 = arg0.method3653(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fm.p(B)Lbh;")
    public class77 method3042() {
        if (this.field2164 != -1) {
            return class200.method960(this.field2164).method3608();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2162[var2];
            if (var3 >= 256 && var3 < 512 && !class193.method1523(var3 - 256).method3369()) {
                var1 = true;
            }
            if (var3 >= 512 && !class199.method3070(var3 - 512).method3530(this.field2169)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class77[] var4 = new class77[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2162[var6];
            if (var7 >= 256 && var7 < 512) {
                class77 var8 = class193.method1523(var7 - 256).method3370();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = class199.method3070(var7 - 512).method3568(this.field2169);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2163[var11] < Statics.field152[var11].length) {
                var10.method1502(Statics.field3213[var11], Statics.field152[var11][this.field2163[var11]]);
            }
            if (this.field2163[var11] < Statics.field2168[var11].length) {
                var10.method1502(Statics.field2167[var11], Statics.field2168[var11][this.field2163[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fm.s(I)I")
    public int method3043() {
        return this.field2164 == -1 ? (this.field2162[11] << 5) + (this.field2162[8] << 10) + (this.field2162[0] << 15) + (this.field2163[4] << 20) + (this.field2163[0] << 25) + this.field2162[1] : 305419896 + class200.method960(this.field2164).field3027;
    }

    @ObfuscatedName("er.o(I)V")
    public static void method2386() {
        field2170.method2257();
    }
}
