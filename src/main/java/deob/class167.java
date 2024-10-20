package deob;

@ObfuscatedName("fy")
public class class167 {

    @ObfuscatedName("fy.q")
    public int[] field2173;

    @ObfuscatedName("fy.d")
    public int[] field2175;

    @ObfuscatedName("fy.h")
    public boolean field2171;

    @ObfuscatedName("fy.p")
    public int field2178;

    @ObfuscatedName("fy.j")
    public long field2172;

    @ObfuscatedName("fy.n")
    public long field2169;

    @ObfuscatedName("fy.m")
    public static final int[] field2176 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fy.s")
    public static class125 field2177 = new class125(260);

    @ObfuscatedName("fy.q([I[IZII)V")
    public void method2993(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3175; var6++) {
                    class193 var7 = class193.method1898(var6);
                    if (var7 != null && !var7.field2829 && (arg2 ? 7 : 0) + var5 == var7.field2822) {
                        arg0[field2176[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2173 = arg0;
        this.field2175 = arg1;
        this.field2171 = arg2;
        this.field2178 = arg3;
        this.method2998();
    }

    @ObfuscatedName("fy.d(IZI)V")
    public void method3006(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2171) {
            return;
        }
        int var3 = this.field2173[field2176[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class193 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3175) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3175 - 1;
                }
            }
            var4 = class193.method1898(var3);
        } while (var4 == null || var4.field2829 || var4.field2822 != arg0 + (this.field2171 ? 7 : 0));
        this.field2173[field2176[arg0]] = var3 + 256;
        this.method2998();
    }

    @ObfuscatedName("fy.h(IZI)V")
    public void method2995(int arg0, boolean arg1) {
        int var3 = this.field2175[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1789[arg0].length) {
                    var3 = 0;
                }
            } while (!class168.method3100(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1789[arg0].length - 1;
                }
            } while (!class168.method3100(arg0, var3));
        }
        this.field2175[arg0] = var3;
        this.method2998();
    }

    @ObfuscatedName("fy.p(ZI)V")
    public void method2996(boolean arg0) {
        if (this.field2171 != arg0) {
            this.method2993((int[]) null, this.field2175, arg0, -1);
        }
    }

    @ObfuscatedName("fy.j(Lel;I)V")
    public void method3013(class154 arg0) {
        arg0.method2751(this.field2171 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2173[field2176[var2]];
            if (var3 == 0) {
                arg0.method2751(-1);
            } else {
                arg0.method2751(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2751(this.field2175[var4]);
        }
    }

    @ObfuscatedName("fy.n(I)V")
    public void method2998() {
        long var1 = this.field2172;
        int var3 = this.field2173[5];
        int var4 = this.field2173[9];
        this.field2173[5] = var4;
        this.field2173[9] = var3;
        this.field2172 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2172 <<= 0x4;
            if (this.field2173[var5] >= 256) {
                this.field2172 += (long) (this.field2173[var5] - 256);
            }
        }
        if (this.field2173[0] >= 256) {
            this.field2172 += (long) (this.field2173[0] - 256 >> 4);
        }
        if (this.field2173[1] >= 256) {
            this.field2172 += (long) (this.field2173[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2172 <<= 0x3;
            this.field2172 += (long) this.field2175[var6];
        }
        this.field2172 <<= 0x1;
        this.field2172 += (long) (this.field2171 ? 1 : 0);
        this.field2173[5] = var3;
        this.field2173[9] = var4;
        if (var1 != 0L && this.field2172 != var1) {
            field2177.method2247(var1);
        }
    }

    @ObfuscatedName("fy.c(Lgf;ILgf;II)Lcf;")
    public class83 method3012(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field2178 != -1) {
            return class200.method175(this.field2178).method3548(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2172;
        int[] var7 = this.field2173;
        if (arg0 != null && (arg0.field3065 >= 0 || arg0.field3061 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2173[var8];
            }
            if (arg0.field3065 >= 0) {
                var5 += (long) (arg0.field3065 - this.field2173[5] << 40);
                var7[5] = arg0.field3065;
            }
            if (arg0.field3061 >= 0) {
                var5 += (long) (arg0.field3061 - this.field2173[3] << 48);
                var7[3] = arg0.field3061;
            }
        }
        class83 var9 = (class83) field2177.method2258(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class193.method1898(var12 - 256).method3306()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class199.method1947(var12 - 512).method3478(this.field2171)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2169 != -1L) {
                    var9 = (class83) field2177.method2258(this.field2169);
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
                        class77 var17 = class193.method1898(var16 - 256).method3313();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = class199.method1947(var16 - 512).method3514(this.field2171);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2175[var20] < Statics.field1789[var20].length) {
                        var19.method1461(Statics.field783[var20], Statics.field1789[var20][this.field2175[var20]]);
                    }
                    if (this.field2175[var20] < Statics.field953[var20].length) {
                        var19.method1461(Statics.field2181[var20], Statics.field953[var20][this.field2175[var20]]);
                    }
                }
                var9 = var19.method1469(64, 850, -30, -50, -30);
                field2177.method2248(var9, var5);
                this.field2169 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3589(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3600(var9, arg3);
        } else {
            var21 = arg0.method3600(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fy.o(I)Lbx;")
    public class77 method3000() {
        if (this.field2178 != -1) {
            return class200.method175(this.field2178).method3547();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2173[var2];
            if (var3 >= 256 && var3 < 512 && !class193.method1898(var3 - 256).method3308()) {
                var1 = true;
            }
            if (var3 >= 512 && !class199.method1947(var3 - 512).method3480(this.field2171)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class77[] var4 = new class77[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2173[var6];
            if (var7 >= 256 && var7 < 512) {
                class77 var8 = class193.method1898(var7 - 256).method3309();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = class199.method1947(var7 - 512).method3492(this.field2171);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2175[var11] < Statics.field1789[var11].length) {
                var10.method1461(Statics.field783[var11], Statics.field1789[var11][this.field2175[var11]]);
            }
            if (this.field2175[var11] < Statics.field953[var11].length) {
                var10.method1461(Statics.field2181[var11], Statics.field953[var11][this.field2175[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fy.s(I)I")
    public int method3001() {
        return this.field2178 == -1 ? (this.field2173[11] << 5) + (this.field2173[8] << 10) + (this.field2173[0] << 15) + (this.field2175[0] << 25) + (this.field2175[4] << 20) + this.field2173[1] : 305419896 + class200.method175(this.field2178).field3009;
    }

    @ObfuscatedName("w.u(I)V")
    public static void method209() {
        field2177.method2249();
    }
}
