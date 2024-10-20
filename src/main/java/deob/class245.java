package deob;

@ObfuscatedName("ic")
public class class245 {

    @ObfuscatedName("ic.v")
    public int[] field2930;

    @ObfuscatedName("ic.n")
    public int[] field2935;

    @ObfuscatedName("ic.f")
    public boolean field2931;

    @ObfuscatedName("ic.y")
    public int field2932;

    @ObfuscatedName("ic.p")
    public long field2933;

    @ObfuscatedName("ic.j")
    public long field2934;

    @ObfuscatedName("ic.r")
    public class136[] field2938;

    @ObfuscatedName("ic.b")
    public boolean field2929 = false;

    @ObfuscatedName("ic.o")
    public static final int[] field2937 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ic.c")
    public static class221 field2936 = new class221(260);

    @ObfuscatedName("ic.v([I[Led;Z[IZIB)V")
    public void method4278(int[] arg0, class136[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field2938 = arg1;
        this.field2929 = arg2;
        this.method4260(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("ic.n([I[IZII)V")
    public void method4260(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2521; var6++) {
                    class141 var7 = class141.method2994(var6);
                    if (var7 != null && !var7.field1581 && var7.field1582 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2937[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2930 = arg0;
        this.field2935 = arg1;
        this.field2931 = arg2;
        this.field2932 = arg3;
        this.method4253();
    }

    @ObfuscatedName("ic.f(IZI)V")
    public void method4249(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2931) {
            return;
        }
        int var3 = this.field2930[field2937[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class141 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2521) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2521 - 1;
                }
            }
            var4 = class141.method2994(var3);
        } while (var4 == null || var4.field1581 || (this.field2931 ? 7 : 0) + arg0 != var4.field1582);
        this.field2930[field2937[arg0]] = var3 + 256;
        this.method4253();
    }

    @ObfuscatedName("ic.y(IZI)V")
    public void method4277(int arg0, boolean arg1) {
        int var3 = this.field2935[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field138[arg0].length) {
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
                    var3 = Statics.field138[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2935[arg0] = var3;
        this.method4253();
    }

    @ObfuscatedName("ic.p(ZI)V")
    public void method4251(boolean arg0) {
        if (this.field2931 != arg0) {
            this.method4260((int[]) null, this.field2935, arg0, -1);
        }
    }

    @ObfuscatedName("ic.j(Lnd;I)V")
    public void method4252(class383 arg0) {
        arg0.method6043(this.field2931 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2930[field2937[var2]];
            if (var3 == 0) {
                arg0.method6043(-1);
            } else {
                arg0.method6043(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method6043(this.field2935[var4]);
        }
    }

    @ObfuscatedName("ic.r(I)V")
    public void method4253() {
        long var1 = this.field2933;
        int var3 = this.field2930[5];
        int var4 = this.field2930[9];
        this.field2930[5] = var4;
        this.field2930[9] = var3;
        this.field2933 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2933 <<= 0x4;
            if (this.field2930[var5] >= 256) {
                this.field2933 += (long) (this.field2930[var5] - 256);
            }
        }
        if (this.field2930[0] >= 256) {
            this.field2933 += (long) (this.field2930[0] - 256 >> 4);
        }
        if (this.field2930[1] >= 256) {
            this.field2933 += (long) (this.field2930[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2933 <<= 0x3;
            this.field2933 += (long) this.field2935[var6];
        }
        this.field2933 <<= 0x1;
        this.field2933 += (long) (this.field2931 ? 1 : 0);
        this.field2930[5] = var3;
        this.field2930[9] = var4;
        if (var1 != 0L && this.field2933 != var1 || this.field2929) {
            field2936.method3954(var1);
        }
    }

    @ObfuscatedName("ic.b(Lfl;ILfl;II)Lgr;")
    public class205 method4254(class157 arg0, int arg1, class157 arg2, int arg3) {
        if (this.field2932 != -1) {
            return class146.method2653(this.field2932).method2530(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2933;
        int[] var7 = this.field2930;
        if (arg0 != null && (arg0.field1887 >= 0 || arg0.field1876 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2930[var8];
            }
            if (arg0.field1887 >= 0) {
                var5 += (long) (arg0.field1887 - this.field2930[5] << 40);
                var7[5] = arg0.field1887;
            }
            if (arg0.field1876 >= 0) {
                var5 += (long) (arg0.field1876 - this.field2930[3] << 48);
                var7[3] = arg0.field1876;
            }
        }
        class205 var9 = (class205) field2936.method3948(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class141.method2994(var12 - 256).method2441()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class155.method4399(var12 - 512).method2805(this.field2931)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2934 != -1L) {
                    var9 = (class205) field2936.method3948(this.field2934);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class191[] var13 = new class191[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class191 var17 = class141.method2994(var16 - 256).method2443();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class155 var18 = class155.method4399(var16 - 512);
                        class191 var19 = var18.method2777(this.field2931);
                        if (var19 != null) {
                            if (this.field2938 != null) {
                                class136 var20 = this.field2938[var15];
                                if (var20 != null) {
                                    if (var20.field1538 != null && var18.field1849 != null && var18.field1817.length == var20.field1538.length) {
                                        for (int var21 = 0; var21 < var18.field1849.length; var21++) {
                                            var19.method3414(var18.field1817[var21], var20.field1538[var21]);
                                        }
                                    }
                                    if (var20.field1539 != null && var18.field1818 != null && var18.field1819.length == var20.field1539.length) {
                                        for (int var22 = 0; var22 < var18.field1818.length; var22++) {
                                            var19.method3412(var18.field1819[var22], var20.field1539[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class191 var23 = new class191(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field2935[var24] < Statics.field138[var24].length) {
                        var23.method3414(Statics.field234[var24], Statics.field138[var24][this.field2935[var24]]);
                    }
                    if (this.field2935[var24] < Statics.field1709[var24].length) {
                        var23.method3414(Statics.field1443[var24], Statics.field1709[var24][this.field2935[var24]]);
                    }
                }
                var9 = var23.method3421(64, 850, -30, -50, -30);
                field2936.method3947(var9, var5);
                this.field2934 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class205 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method2902(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method2869(var9, arg3);
        } else {
            var25 = arg0.method2869(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("ic.d(I)Lgm;")
    public class191 method4266() {
        if (this.field2932 != -1) {
            return class146.method2653(this.field2932).method2531();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2930[var2];
            if (var3 >= 256 && var3 < 512 && !class141.method2994(var3 - 256).method2449()) {
                var1 = true;
            }
            if (var3 >= 512 && !class155.method4399(var3 - 512).method2778(this.field2931)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class191[] var4 = new class191[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2930[var6];
            if (var7 >= 256 && var7 < 512) {
                class191 var8 = class141.method2994(var7 - 256).method2445();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class191 var9 = class155.method4399(var7 - 512).method2779(this.field2931);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class191 var10 = new class191(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2935[var11] < Statics.field138[var11].length) {
                var10.method3414(Statics.field234[var11], Statics.field138[var11][this.field2935[var11]]);
            }
            if (this.field2935[var11] < Statics.field1709[var11].length) {
                var10.method3414(Statics.field1443[var11], Statics.field1709[var11][this.field2935[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ic.s(I)I")
    public int method4256() {
        return this.field2932 == -1 ? (this.field2930[11] << 5) + (this.field2930[8] << 10) + (this.field2930[0] << 15) + (this.field2935[4] << 20) + (this.field2935[0] << 25) + this.field2930[1] : 305419896 + class146.method2653(this.field2932).field1635;
    }

    @ObfuscatedName("cs.u(I)V")
    public static void method1824() {
        field2936.method3957();
    }
}
