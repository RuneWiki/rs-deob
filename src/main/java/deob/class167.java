package deob;

@ObfuscatedName("fp")
public class class167 {

    @ObfuscatedName("fp.b")
    public int[] field2170;

    @ObfuscatedName("fp.e")
    public int[] field2165;

    @ObfuscatedName("fp.c")
    public boolean field2167;

    @ObfuscatedName("fp.l")
    public int field2171;

    @ObfuscatedName("fp.y")
    public long field2174;

    @ObfuscatedName("fp.j")
    public long field2169;

    @ObfuscatedName("fp.k")
    public static final int[] field2172 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fp.f")
    public static class125 field2173 = new class125(260);

    @ObfuscatedName("fp.b([I[IZIB)V")
    public void method2996(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3109; var6++) {
                    class193 var7 = class193.method270(var6);
                    if (var7 != null && !var7.field2835 && (arg2 ? 7 : 0) + var5 == var7.field2828) {
                        arg0[field2172[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2170 = arg0;
        this.field2165 = arg1;
        this.field2167 = arg2;
        this.field2171 = arg3;
        this.method3001();
    }

    @ObfuscatedName("fp.e(IZI)V")
    public void method3005(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2167) {
            return;
        }
        int var3 = this.field2170[field2172[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class193 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3109) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3109 - 1;
                }
            }
            var4 = class193.method270(var3);
        } while (var4 == null || var4.field2835 || arg0 + (this.field2167 ? 7 : 0) != var4.field2828);
        this.field2170[field2172[arg0]] = var3 + 256;
        this.method3001();
    }

    @ObfuscatedName("fp.c(IZI)V")
    public void method2998(int arg0, boolean arg1) {
        int var3 = this.field2165[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2168[arg0].length) {
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
                    var3 = Statics.field2168[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2165[arg0] = var3;
        this.method3001();
    }

    @ObfuscatedName("fp.l(ZI)V")
    public void method2999(boolean arg0) {
        if (this.field2167 != arg0) {
            this.method2996((int[]) null, this.field2165, arg0, -1);
        }
    }

    @ObfuscatedName("fp.y(Lec;I)V")
    public void method3000(class154 arg0) {
        arg0.method2780(this.field2167 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2170[field2172[var2]];
            if (var3 == 0) {
                arg0.method2780(-1);
            } else {
                arg0.method2780(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2780(this.field2165[var4]);
        }
    }

    @ObfuscatedName("fp.j(I)V")
    public void method3001() {
        long var1 = this.field2174;
        int var3 = this.field2170[5];
        int var4 = this.field2170[9];
        this.field2170[5] = var4;
        this.field2170[9] = var3;
        this.field2174 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2174 <<= 0x4;
            if (this.field2170[var5] >= 256) {
                this.field2174 += (long) (this.field2170[var5] - 256);
            }
        }
        if (this.field2170[0] >= 256) {
            this.field2174 += (long) (this.field2170[0] - 256 >> 4);
        }
        if (this.field2170[1] >= 256) {
            this.field2174 += (long) (this.field2170[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2174 <<= 0x3;
            this.field2174 += (long) this.field2165[var6];
        }
        this.field2174 <<= 0x1;
        this.field2174 += (long) (this.field2167 ? 1 : 0);
        this.field2170[5] = var3;
        this.field2170[9] = var4;
        if (var1 != 0L && this.field2174 != var1) {
            field2173.method2247(var1);
        }
    }

    @ObfuscatedName("fp.t(Lgn;ILgn;IB)Lco;")
    public class83 method3021(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field2171 != -1) {
            return class200.method3376(this.field2171).method3541(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2174;
        int[] var7 = this.field2170;
        if (arg0 != null && (arg0.field3073 >= 0 || arg0.field3074 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2170[var8];
            }
            if (arg0.field3073 >= 0) {
                var5 += (long) (arg0.field3073 - this.field2170[5] << 40);
                var7[5] = arg0.field3073;
            }
            if (arg0.field3074 >= 0) {
                var5 += (long) (arg0.field3074 - this.field2170[3] << 48);
                var7[3] = arg0.field3074;
            }
        }
        class83 var9 = (class83) field2173.method2246(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class193.method270(var12 - 256).method3336()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class199.method751(var12 - 512).method3512(this.field2167)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2169 != -1L) {
                    var9 = (class83) field2173.method2246(this.field2169);
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
                        class77 var17 = class193.method270(var16 - 256).method3337();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = class199.method751(var16 - 512).method3494(this.field2167);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2165[var20] < Statics.field2168[var20].length) {
                        var19.method1480(Statics.field2166[var20], Statics.field2168[var20][this.field2165[var20]]);
                    }
                    if (this.field2165[var20] < Statics.field1303[var20].length) {
                        var19.method1480(Statics.field142[var20], Statics.field1303[var20][this.field2165[var20]]);
                    }
                }
                var9 = var19.method1457(64, 850, -30, -50, -30);
                field2173.method2250(var9, var5);
                this.field2169 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3583(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3582(var9, arg3);
        } else {
            var21 = arg0.method3582(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fp.k(B)Lbr;")
    public class77 method3026() {
        if (this.field2171 != -1) {
            return class200.method3376(this.field2171).method3542();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2170[var2];
            if (var3 >= 256 && var3 < 512 && !class193.method270(var3 - 256).method3338()) {
                var1 = true;
            }
            if (var3 >= 512 && !class199.method751(var3 - 512).method3511(this.field2167)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class77[] var4 = new class77[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2170[var6];
            if (var7 >= 256 && var7 < 512) {
                class77 var8 = class193.method270(var7 - 256).method3339();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = class199.method751(var7 - 512).method3496(this.field2167);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2165[var11] < Statics.field2168[var11].length) {
                var10.method1480(Statics.field2166[var11], Statics.field2168[var11][this.field2165[var11]]);
            }
            if (this.field2165[var11] < Statics.field1303[var11].length) {
                var10.method1480(Statics.field142[var11], Statics.field1303[var11][this.field2165[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fp.f(B)I")
    public int method3012() {
        return this.field2171 == -1 ? (this.field2170[11] << 5) + (this.field2170[8] << 10) + (this.field2170[0] << 15) + (this.field2165[0] << 25) + (this.field2165[4] << 20) + this.field2170[1] : 305419896 + class200.method3376(this.field2171).field3028;
    }
}
