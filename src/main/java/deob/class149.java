package deob;

@ObfuscatedName("ey")
public abstract class class149 {

    @ObfuscatedName("ey.x")
    public int field2471;

    @ObfuscatedName("ey.v")
    public int[] field2456;

    @ObfuscatedName("ey.m")
    public int[] field2457;

    @ObfuscatedName("ey.e")
    public class173 field2458;

    @ObfuscatedName("ey.h")
    public int[] field2467;

    @ObfuscatedName("ey.p")
    public int[] field2460;

    @ObfuscatedName("ey.j")
    public int[] field2461;

    @ObfuscatedName("ey.i")
    public int[][] field2462;

    @ObfuscatedName("ey.u")
    public int[][] field2463;

    @ObfuscatedName("ey.l")
    public class173[] field2464;

    @ObfuscatedName("ey.k")
    public Object[] field2465;

    @ObfuscatedName("ey.q")
    public Object[][] field2466;

    @ObfuscatedName("ey.b")
    public static class105 field2455 = new class105();

    @ObfuscatedName("ey.w")
    public int field2473;

    @ObfuscatedName("ey.g")
    public boolean field2459;

    @ObfuscatedName("ey.s")
    public boolean field2470;

    @ObfuscatedName("ey.c")
    public static int field2469 = 0;

    public class149(boolean arg0, boolean arg1) {
        this.field2459 = arg0;
        this.field2470 = arg1;
    }

    @ObfuscatedName("ey.x([BI)V")
    public void method2775(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class108.method917(arg0, 0, var2);
        this.field2473 = var3;
        class108 var4 = new class108(method519(arg0));
        int var5 = var4.method2299();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2132();
        }
        int var6 = var4.method2299();
        if (var5 >= 7) {
            this.field2471 = var4.method2141();
        } else {
            this.field2471 = var4.method2129();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2456 = new int[this.field2471];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2471; var9++) {
                this.field2456[var9] = var7 += var4.method2141();
                if (this.field2456[var9] > var8) {
                    var8 = this.field2456[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2471; var10++) {
                this.field2456[var10] = var7 += var4.method2129();
                if (this.field2456[var10] > var8) {
                    var8 = this.field2456[var10];
                }
            }
        }
        this.field2467 = new int[var8 + 1];
        this.field2460 = new int[var8 + 1];
        this.field2461 = new int[var8 + 1];
        this.field2462 = new int[var8 + 1][];
        this.field2465 = new Object[var8 + 1];
        this.field2466 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2457 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2471; var11++) {
                this.field2457[this.field2456[var11]] = var4.method2132();
            }
            this.field2458 = new class173(this.field2457);
        }
        for (int var12 = 0; var12 < this.field2471; var12++) {
            this.field2467[this.field2456[var12]] = var4.method2132();
        }
        for (int var13 = 0; var13 < this.field2471; var13++) {
            this.field2460[this.field2456[var13]] = var4.method2132();
        }
        for (int var14 = 0; var14 < this.field2471; var14++) {
            this.field2461[this.field2456[var14]] = var4.method2129();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2471; var15++) {
                int var16 = this.field2456[var15];
                int var17 = this.field2461[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2462[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2462[var16][var20] = var18 += var4.method2141();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2466[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2471; var22++) {
                int var23 = this.field2456[var22];
                int var24 = this.field2461[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2462[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2462[var23][var27] = var25 += var4.method2129();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2466[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2463 = new int[var8 + 1][];
        this.field2464 = new class173[var8 + 1];
        for (int var29 = 0; var29 < this.field2471; var29++) {
            int var30 = this.field2456[var29];
            int var31 = this.field2461[var30];
            this.field2463[var30] = new int[this.field2466[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2463[var30][this.field2462[var30][var32]] = var4.method2132();
            }
            this.field2464[var30] = new class173(this.field2463[var30]);
        }
    }

    @ObfuscatedName("ey.v(IB)V")
    public void method2730(int arg0) {
    }

    @ObfuscatedName("ey.m(IIB)[B")
    public byte[] method2751(int arg0, int arg1) {
        return this.method2755(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ey.e(II[IB)[B")
    public byte[] method2755(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2466.length || this.field2466[arg0] == null || arg1 < 0 || arg1 >= this.field2466[arg0].length) {
            return null;
        }
        if (this.field2466[arg0][arg1] == null) {
            boolean var4 = this.method2767(arg0, arg2);
            if (!var4) {
                this.method2739(arg0);
                boolean var5 = this.method2767(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class114.method2074(this.field2466[arg0][arg1], false);
        if (this.field2470) {
            this.field2466[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ey.h(IIB)Z")
    public boolean method2728(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2466.length || this.field2466[arg0] == null || arg1 < 0 || arg1 >= this.field2466[arg0].length) {
            return false;
        } else if (this.field2466[arg0][arg1] != null) {
            return true;
        } else if (this.field2465[arg0] == null) {
            this.method2739(arg0);
            return this.field2465[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ey.p(II)Z")
    public boolean method2733(int arg0) {
        if (this.field2465[arg0] == null) {
            this.method2739(arg0);
            return this.field2465[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ey.j(B)Z")
    public boolean method2735() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2456.length; var2++) {
            int var3 = this.field2456[var2];
            if (this.field2465[var3] == null) {
                this.method2739(var3);
                if (this.field2465[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ey.i(II)[B")
    public byte[] method2736(int arg0) {
        if (this.field2466.length == 1) {
            return this.method2751(0, arg0);
        } else if (this.field2466[arg0].length == 1) {
            return this.method2751(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ey.u(III)[B")
    public byte[] method2757(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2466.length || this.field2466[arg0] == null || arg1 < 0 || arg1 >= this.field2466[arg0].length) {
            return null;
        }
        if (this.field2466[arg0][arg1] == null) {
            boolean var3 = this.method2767(arg0, (int[]) null);
            if (!var3) {
                this.method2739(arg0);
                boolean var4 = this.method2767(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class114.method2074(this.field2466[arg0][arg1], false);
    }

    @ObfuscatedName("ey.l(IB)[B")
    public byte[] method2742(int arg0) {
        if (this.field2466.length == 1) {
            return this.method2757(0, arg0);
        } else if (this.field2466[arg0].length == 1) {
            return this.method2757(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ey.k(IB)V")
    public void method2739(int arg0) {
    }

    @ObfuscatedName("ey.q(IB)[I")
    public int[] method2740(int arg0) {
        return this.field2462[arg0];
    }

    @ObfuscatedName("ey.b(IB)I")
    public int method2741(int arg0) {
        return this.field2466[arg0].length;
    }

    @ObfuscatedName("ey.w(I)I")
    public int method2800() {
        return this.field2466.length;
    }

    @ObfuscatedName("ey.g(IB)V")
    public void method2732(int arg0) {
        for (int var2 = 0; var2 < this.field2466[arg0].length; var2++) {
            this.field2466[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ey.s(I)V")
    public void method2744() {
        for (int var1 = 0; var1 < this.field2466.length; var1++) {
            if (this.field2466[var1] != null) {
                for (int var2 = 0; var2 < this.field2466[var1].length; var2++) {
                    this.field2466[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ey.c(I[II)Z")
    public boolean method2767(int arg0, int[] arg1) {
        if (this.field2465[arg0] == null) {
            return false;
        }
        int var3 = this.field2461[arg0];
        int[] var4 = this.field2462[arg0];
        Object[] var5 = this.field2466[arg0];
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            if (var5[var4[var7]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var8;
        if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
            var8 = class114.method2074(this.field2465[arg0], true);
            class108 var9 = new class108(var8);
            var9.method2144(arg1, 5, var9.field1839.length);
        } else {
            var8 = class114.method2074(this.field2465[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method519(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class108.method917(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class108.method917(var8, 0, var17);
            throw Statics.method2477(var34, var16 + var18 + "," + this.field2467[arg0] + "," + this.field2473);
        }
        if (this.field2459) {
            this.field2465[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class108 var22 = new class108(var10);
            int[] var23 = new int[var3];
            var22.field1841 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2132();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field1841 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2132();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2470) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class114.method1357(var27[var33], false);
                }
            }
        } else if (this.field2470) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class114.method1357(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ey.r(Ljava/lang/String;S)I")
    public int method2746(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2458.method3173(class211.method2704(var2));
    }

    @ObfuscatedName("ey.f(ILjava/lang/String;I)I")
    public int method2747(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2464[arg0].method3173(class211.method2704(var3));
    }

    @ObfuscatedName("ey.t(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2748(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2458.method3173(class211.method2704(var3));
        int var6 = this.field2464[var5].method3173(class211.method2704(var4));
        return this.method2751(var5, var6);
    }

    @ObfuscatedName("ey.o(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2749(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2458.method3173(class211.method2704(var3));
        int var6 = this.field2464[var5].method3173(class211.method2704(var4));
        return this.method2728(var5, var6);
    }

    @ObfuscatedName("ey.z(Ljava/lang/String;I)Z")
    public boolean method2750(String arg0) {
        int var2 = this.method2746("");
        return var2 == -1 ? this.method2749(arg0, "") : this.method2749("", arg0);
    }

    @ObfuscatedName("ey.d(Ljava/lang/String;B)V")
    public void method2803(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2458.method3173(class211.method2704(var2));
        if (var3 >= 0) {
            this.method2730(var3);
        }
    }

    @ObfuscatedName("y.y([BI)[B")
    public static final byte[] method519(byte[] arg0) {
        class108 var1 = new class108(arg0);
        int var2 = var1.method2299();
        int var3 = var1.method2132();
        if (var3 < 0 || !(field2469 == 0 || var3 <= field2469)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2315(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2132();
            if (var5 < 0 || field2469 != 0 && var5 > field2469) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class106.method2089(var6, var5, arg0, var3, 9);
            } else {
                field2455.method2078(var1, var6);
            }
            return var6;
        }
    }
}
