package deob;

@ObfuscatedName("ih")
public class class247 {

    @ObfuscatedName("ih.s")
    public int[] field2929;

    @ObfuscatedName("ih.t")
    public int[] field2932;

    @ObfuscatedName("ih.v")
    public boolean field2931;

    @ObfuscatedName("ih.j")
    public int field2937;

    @ObfuscatedName("ih.l")
    public long field2934;

    @ObfuscatedName("ih.n")
    public long field2930;

    @ObfuscatedName("ih.w")
    public class138[] field2935;

    @ObfuscatedName("ih.f")
    public boolean field2936 = false;

    @ObfuscatedName("ih.h")
    public static final int[] field2933 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ih.k")
    public static class223 field2938 = new class223(260);

    @ObfuscatedName("ih.s([I[Ler;Z[IZII)V")
    public void method4216(int[] arg0, class138[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field2935 = arg1;
        this.field2936 = arg2;
        this.method4236(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("ih.t([I[IZII)V")
    public void method4236(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1564; var6++) {
                    class143 var7 = class143.method1774(var6);
                    if (var7 != null && !var7.field1573 && var5 + (arg2 ? 7 : 0) == var7.field1566) {
                        arg0[field2933[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2929 = arg0;
        this.field2932 = arg1;
        this.field2931 = arg2;
        this.field2937 = arg3;
        this.method4221();
    }

    @ObfuscatedName("ih.v(IZB)V")
    public void method4229(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2931) {
            return;
        }
        int var3 = this.field2929[field2933[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class143 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1564) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1564 - 1;
                }
            }
            var4 = class143.method1774(var3);
        } while (var4 == null || var4.field1573 || arg0 + (this.field2931 ? 7 : 0) != var4.field1566);
        this.field2929[field2933[arg0]] = var3 + 256;
        this.method4221();
    }

    @ObfuscatedName("ih.j(IZI)V")
    public void method4222(int arg0, boolean arg1) {
        int var3 = this.field2932[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2915[arg0].length) {
                    var3 = 0;
                }
            } while (!class248.method158(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2915[arg0].length - 1;
                }
            } while (!class248.method158(arg0, var3));
        }
        this.field2932[arg0] = var3;
        this.method4221();
    }

    @ObfuscatedName("ih.l(ZI)V")
    public void method4219(boolean arg0) {
        if (this.field2931 != arg0) {
            this.method4236((int[]) null, this.field2932, arg0, -1);
        }
    }

    @ObfuscatedName("ih.n(Lnv;I)V")
    public void method4220(class385 arg0) {
        arg0.method5941(this.field2931 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2929[field2933[var2]];
            if (var3 == 0) {
                arg0.method5941(-1);
            } else {
                arg0.method5941(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5941(this.field2932[var4]);
        }
    }

    @ObfuscatedName("ih.w(I)V")
    public void method4221() {
        long var1 = this.field2934;
        int var3 = this.field2929[5];
        int var4 = this.field2929[9];
        this.field2929[5] = var4;
        this.field2929[9] = var3;
        this.field2934 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2934 <<= 0x4;
            if (this.field2929[var5] >= 256) {
                this.field2934 += (long) (this.field2929[var5] - 256);
            }
        }
        if (this.field2929[0] >= 256) {
            this.field2934 += (long) (this.field2929[0] - 256 >> 4);
        }
        if (this.field2929[1] >= 256) {
            this.field2934 += (long) (this.field2929[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2934 <<= 0x3;
            this.field2934 += (long) this.field2932[var6];
        }
        this.field2934 <<= 0x1;
        this.field2934 += (long) (this.field2931 ? 1 : 0);
        this.field2929[5] = var3;
        this.field2929[9] = var4;
        if (var1 != 0L && this.field2934 != var1 || this.field2936) {
            field2938.method3936(var1);
        }
    }

    @ObfuscatedName("ih.f(Lfz;ILfz;II)Lgl;")
    public class207 method4240(class159 arg0, int arg1, class159 arg2, int arg3) {
        if (this.field2937 != -1) {
            return class148.method2089(this.field2937).method2534(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2934;
        int[] var7 = this.field2929;
        if (arg0 != null && (arg0.field1867 >= 0 || arg0.field1872 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2929[var8];
            }
            if (arg0.field1867 >= 0) {
                var5 += (long) (arg0.field1867 - this.field2929[5] << 40);
                var7[5] = arg0.field1867;
            }
            if (arg0.field1872 >= 0) {
                var5 += (long) (arg0.field1872 - this.field2929[3] << 48);
                var7[3] = arg0.field1872;
            }
        }
        class207 var9 = (class207) field2938.method3927(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class143.method1774(var12 - 256).method2447()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class157.method101(var12 - 512).method2741(this.field2931)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2930 != -1L) {
                    var9 = (class207) field2938.method3927(this.field2930);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class193[] var13 = new class193[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class193 var17 = class143.method1774(var16 - 256).method2469();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class157 var18 = class157.method101(var16 - 512);
                        class193 var19 = var18.method2739(this.field2931);
                        if (var19 != null) {
                            if (this.field2935 != null) {
                                class138 var20 = this.field2935[var15];
                                if (var20 != null) {
                                    if (var20.field1516 != null && var18.field1796 != null && var18.field1797.length == var20.field1516.length) {
                                        for (int var21 = 0; var21 < var18.field1796.length; var21++) {
                                            var19.method3403(var18.field1797[var21], var20.field1516[var21]);
                                        }
                                    }
                                    if (var20.field1519 != null && var18.field1798 != null && var18.field1799.length == var20.field1519.length) {
                                        for (int var22 = 0; var22 < var18.field1798.length; var22++) {
                                            var19.method3370(var18.field1799[var22], var20.field1519[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class193 var23 = new class193(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field2932[var24] < Statics.field2915[var24].length) {
                        var23.method3403(Statics.field3635[var24], Statics.field2915[var24][this.field2932[var24]]);
                    }
                    if (this.field2932[var24] < Statics.field2499[var24].length) {
                        var23.method3403(Statics.field26[var24], Statics.field2499[var24][this.field2932[var24]]);
                    }
                }
                var9 = var23.method3377(64, 850, -30, -50, -30);
                field2938.method3929(var9, var5);
                this.field2930 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class207 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method2822(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method2834(var9, arg3);
        } else {
            var25 = arg0.method2834(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("ih.o(I)Lgz;")
    public class193 method4223() {
        if (this.field2937 != -1) {
            return class148.method2089(this.field2937).method2513();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2929[var2];
            if (var3 >= 256 && var3 < 512 && !class143.method1774(var3 - 256).method2446()) {
                var1 = true;
            }
            if (var3 >= 512 && !class157.method101(var3 - 512).method2740(this.field2931)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class193[] var4 = new class193[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2929[var6];
            if (var7 >= 256 && var7 < 512) {
                class193 var8 = class143.method1774(var7 - 256).method2452();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class193 var9 = class157.method101(var7 - 512).method2728(this.field2931);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class193 var10 = new class193(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2932[var11] < Statics.field2915[var11].length) {
                var10.method3403(Statics.field3635[var11], Statics.field2915[var11][this.field2932[var11]]);
            }
            if (this.field2932[var11] < Statics.field2499[var11].length) {
                var10.method3403(Statics.field26[var11], Statics.field2499[var11][this.field2932[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ih.x(I)I")
    public int method4237() {
        return this.field2937 == -1 ? (this.field2929[11] << 5) + (this.field2929[8] << 10) + (this.field2929[0] << 15) + (this.field2932[0] << 25) + (this.field2932[4] << 20) + this.field2929[1] : 305419896 + class148.method2089(this.field2937).field1627;
    }

    @ObfuscatedName("cn.r(B)V")
    public static void method2014() {
        field2938.method3930();
    }
}
