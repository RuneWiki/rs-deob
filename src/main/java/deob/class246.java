package deob;

@ObfuscatedName("ih")
public class class246 {

    @ObfuscatedName("ih.f")
    public int[] field2937;

    @ObfuscatedName("ih.e")
    public int[] field2938;

    @ObfuscatedName("ih.v")
    public boolean field2936;

    @ObfuscatedName("ih.y")
    public int field2941;

    @ObfuscatedName("ih.j")
    public long field2939;

    @ObfuscatedName("ih.o")
    public long field2934;

    @ObfuscatedName("ih.m")
    public class137[] field2940;

    @ObfuscatedName("ih.r")
    public boolean field2943 = false;

    @ObfuscatedName("ih.i")
    public static final int[] field2942 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ih.k")
    public static class222 field2935 = new class222(260);

    @ObfuscatedName("ih.f([I[Let;Z[IZII)V")
    public void method4306(int[] arg0, class137[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field2940 = arg1;
        this.field2943 = arg2;
        this.method4301(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("ih.e([I[IZIB)V")
    public void method4301(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1355; var6++) {
                    class142 var7 = class142.method192(var6);
                    if (var7 != null && !var7.field1597 && var7.field1590 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2942[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2937 = arg0;
        this.field2938 = arg1;
        this.field2936 = arg2;
        this.field2941 = arg3;
        this.method4292();
    }

    @ObfuscatedName("ih.v(IZI)V")
    public void method4286(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2936) {
            return;
        }
        int var3 = this.field2937[field2942[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class142 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1355) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1355 - 1;
                }
            }
            var4 = class142.method192(var3);
        } while (var4 == null || var4.field1597 || arg0 + (this.field2936 ? 7 : 0) != var4.field1590);
        this.field2937[field2942[arg0]] = var3 + 256;
        this.method4292();
    }

    @ObfuscatedName("ih.y(IZI)V")
    public void method4289(int arg0, boolean arg1) {
        int var3 = this.field2938[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field569[arg0].length) {
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
                    var3 = Statics.field569[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2938[arg0] = var3;
        this.method4292();
    }

    @ObfuscatedName("ih.j(ZB)V")
    public void method4285(boolean arg0) {
        if (this.field2936 != arg0) {
            this.method4301((int[]) null, this.field2938, arg0, -1);
        }
    }

    @ObfuscatedName("ih.o(Lnt;I)V")
    public void method4291(class384 arg0) {
        arg0.method5880(this.field2936 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2937[field2942[var2]];
            if (var3 == 0) {
                arg0.method5880(-1);
            } else {
                arg0.method5880(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5880(this.field2938[var4]);
        }
    }

    @ObfuscatedName("ih.m(I)V")
    public void method4292() {
        long var1 = this.field2939;
        int var3 = this.field2937[5];
        int var4 = this.field2937[9];
        this.field2937[5] = var4;
        this.field2937[9] = var3;
        this.field2939 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2939 <<= 0x4;
            if (this.field2937[var5] >= 256) {
                this.field2939 += (long) (this.field2937[var5] - 256);
            }
        }
        if (this.field2937[0] >= 256) {
            this.field2939 += (long) (this.field2937[0] - 256 >> 4);
        }
        if (this.field2937[1] >= 256) {
            this.field2939 += (long) (this.field2937[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2939 <<= 0x3;
            this.field2939 += (long) this.field2938[var6];
        }
        this.field2939 <<= 0x1;
        this.field2939 += (long) (this.field2936 ? 1 : 0);
        this.field2937[5] = var3;
        this.field2937[9] = var4;
        if (var1 != 0L && this.field2939 != var1 || this.field2943) {
            field2935.method3991(var1);
        }
    }

    @ObfuscatedName("ih.r(Lfm;ILfm;IB)Lgd;")
    public class206 method4288(class158 arg0, int arg1, class158 arg2, int arg3) {
        if (this.field2941 != -1) {
            return class147.method4374(this.field2941).method2536(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2939;
        int[] var7 = this.field2937;
        if (arg0 != null && (arg0.field1890 >= 0 || arg0.field1892 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2937[var8];
            }
            if (arg0.field1890 >= 0) {
                var5 += (long) (arg0.field1890 - this.field2937[5] << 40);
                var7[5] = arg0.field1890;
            }
            if (arg0.field1892 >= 0) {
                var5 += (long) (arg0.field1892 - this.field2937[3] << 48);
                var7[3] = arg0.field1892;
            }
        }
        class206 var9 = (class206) field2935.method3987(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class142.method192(var12 - 256).method2449()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class156.method4403(var12 - 512).method2766(this.field2936)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2934 != -1L) {
                    var9 = (class206) field2935.method3987(this.field2934);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class192[] var13 = new class192[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class192 var17 = class142.method192(var16 - 256).method2450();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class156 var18 = class156.method4403(var16 - 512);
                        class192 var19 = var18.method2757(this.field2936);
                        if (var19 != null) {
                            if (this.field2940 != null) {
                                class137 var20 = this.field2940[var15];
                                if (var20 != null) {
                                    if (var20.field1543 != null && var18.field1825 != null && var18.field1809.length == var20.field1543.length) {
                                        for (int var21 = 0; var21 < var18.field1825.length; var21++) {
                                            var19.method3420(var18.field1809[var21], var20.field1543[var21]);
                                        }
                                    }
                                    if (var20.field1542 != null && var18.field1823 != null && var18.field1824.length == var20.field1542.length) {
                                        for (int var22 = 0; var22 < var18.field1823.length; var22++) {
                                            var19.method3474(var18.field1824[var22], var20.field1542[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class192 var23 = new class192(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field2938[var24] < Statics.field569[var24].length) {
                        var23.method3420(Statics.field1582[var24], Statics.field569[var24][this.field2938[var24]]);
                    }
                    if (this.field2938[var24] < Statics.field3176[var24].length) {
                        var23.method3420(Statics.field2518[var24], Statics.field3176[var24][this.field2938[var24]]);
                    }
                }
                var9 = var23.method3428(64, 850, -30, -50, -30);
                field2935.method3988(var9, var5);
                this.field2934 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class206 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method2863(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method2858(var9, arg3);
        } else {
            var25 = arg0.method2858(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("ih.h(I)Lga;")
    public class192 method4294() {
        if (this.field2941 != -1) {
            return class147.method4374(this.field2941).method2537();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2937[var2];
            if (var3 >= 256 && var3 < 512 && !class142.method192(var3 - 256).method2451()) {
                var1 = true;
            }
            if (var3 >= 512 && !class156.method4403(var3 - 512).method2789(this.field2936)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class192[] var4 = new class192[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2937[var6];
            if (var7 >= 256 && var7 < 512) {
                class192 var8 = class142.method192(var7 - 256).method2452();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class192 var9 = class156.method4403(var7 - 512).method2769(this.field2936);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class192 var10 = new class192(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2938[var11] < Statics.field569[var11].length) {
                var10.method3420(Statics.field1582[var11], Statics.field569[var11][this.field2938[var11]]);
            }
            if (this.field2938[var11] < Statics.field3176[var11].length) {
                var10.method3420(Statics.field2518[var11], Statics.field3176[var11][this.field2938[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ih.d(I)I")
    public int method4295() {
        return this.field2941 == -1 ? (this.field2937[11] << 5) + (this.field2937[8] << 10) + (this.field2937[0] << 15) + (this.field2938[0] << 25) + (this.field2938[4] << 20) + this.field2937[1] : 305419896 + class147.method4374(this.field2941).field1641;
    }
}
