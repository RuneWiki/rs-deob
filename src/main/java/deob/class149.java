package deob;

@ObfuscatedName("ei")
public abstract class class149 {

    @ObfuscatedName("ei.g")
    public int field2462;

    @ObfuscatedName("ei.j")
    public int[] field2454;

    @ObfuscatedName("ei.z")
    public int[] field2463;

    @ObfuscatedName("ei.b")
    public class173 field2457;

    @ObfuscatedName("ei.k")
    public int[] field2468;

    @ObfuscatedName("ei.c")
    public int[] field2459;

    @ObfuscatedName("ei.w")
    public int[] field2460;

    @ObfuscatedName("ei.l")
    public int[][] field2458;

    @ObfuscatedName("ei.n")
    public int[][] field2455;

    @ObfuscatedName("ei.d")
    public class173[] field2467;

    @ObfuscatedName("ei.h")
    public Object[] field2464;

    @ObfuscatedName("ei.y")
    public Object[][] field2461;

    @ObfuscatedName("ei.p")
    public static class105 field2466 = new class105();

    @ObfuscatedName("ei.i")
    public int field2465;

    @ObfuscatedName("ei.s")
    public boolean field2456;

    @ObfuscatedName("ei.f")
    public boolean field2469;

    @ObfuscatedName("ei.u")
    public static int field2470 = 0;

    public class149(boolean arg0, boolean arg1) {
        this.field2456 = arg0;
        this.field2469 = arg1;
    }

    @ObfuscatedName("ei.g([BB)V")
    public void method2658(byte[] arg0) {
        this.field2465 = class108.method516(arg0, arg0.length);
        class108 var2 = new class108(method2419(arg0));
        int var3 = var2.method2083();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2117();
        }
        int var4 = var2.method2083();
        if (var3 >= 7) {
            this.field2462 = var2.method2154();
        } else {
            this.field2462 = var2.method2263();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2454 = new int[this.field2462];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2462; var7++) {
                this.field2454[var7] = var5 += var2.method2154();
                if (this.field2454[var7] > var6) {
                    var6 = this.field2454[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2462; var8++) {
                this.field2454[var8] = var5 += var2.method2263();
                if (this.field2454[var8] > var6) {
                    var6 = this.field2454[var8];
                }
            }
        }
        this.field2468 = new int[var6 + 1];
        this.field2459 = new int[var6 + 1];
        this.field2460 = new int[var6 + 1];
        this.field2458 = new int[var6 + 1][];
        this.field2464 = new Object[var6 + 1];
        this.field2461 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2463 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2462; var9++) {
                this.field2463[this.field2454[var9]] = var2.method2117();
            }
            this.field2457 = new class173(this.field2463);
        }
        for (int var10 = 0; var10 < this.field2462; var10++) {
            this.field2468[this.field2454[var10]] = var2.method2117();
        }
        for (int var11 = 0; var11 < this.field2462; var11++) {
            this.field2459[this.field2454[var11]] = var2.method2117();
        }
        for (int var12 = 0; var12 < this.field2462; var12++) {
            this.field2460[this.field2454[var12]] = var2.method2263();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2462; var13++) {
                int var14 = this.field2454[var13];
                int var15 = this.field2460[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2458[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2458[var14][var18] = var16 += var2.method2154();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2461[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2462; var20++) {
                int var21 = this.field2454[var20];
                int var22 = this.field2460[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2458[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2458[var21][var25] = var23 += var2.method2263();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2461[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2455 = new int[var6 + 1][];
        this.field2467 = new class173[var6 + 1];
        for (int var27 = 0; var27 < this.field2462; var27++) {
            int var28 = this.field2454[var27];
            int var29 = this.field2460[var28];
            this.field2455[var28] = new int[this.field2461[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2455[var28][this.field2458[var28][var30]] = var2.method2117();
            }
            this.field2467[var28] = new class173(this.field2455[var28]);
        }
    }

    @ObfuscatedName("ei.j(II)V")
    public void method2659(int arg0) {
    }

    @ObfuscatedName("ei.z(III)[B")
    public byte[] method2660(int arg0, int arg1) {
        return this.method2661(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ei.b(II[II)[B")
    public byte[] method2661(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2461.length || this.field2461[arg0] == null || arg1 < 0 || arg1 >= this.field2461[arg0].length) {
            return null;
        }
        if (this.field2461[arg0][arg1] == null) {
            boolean var4 = this.method2692(arg0, arg2);
            if (!var4) {
                this.method2668(arg0);
                boolean var5 = this.method2692(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class114.method1356(this.field2461[arg0][arg1], false);
        if (this.field2469) {
            this.field2461[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ei.k(IIB)Z")
    public boolean method2712(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2461.length || this.field2461[arg0] == null || arg1 < 0 || arg1 >= this.field2461[arg0].length) {
            return false;
        } else if (this.field2461[arg0][arg1] != null) {
            return true;
        } else if (this.field2464[arg0] == null) {
            this.method2668(arg0);
            return this.field2464[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ei.c(IB)Z")
    public boolean method2663(int arg0) {
        if (this.field2464[arg0] == null) {
            this.method2668(arg0);
            return this.field2464[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ei.w(B)Z")
    public boolean method2664() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2454.length; var2++) {
            int var3 = this.field2454[var2];
            if (this.field2464[var3] == null) {
                this.method2668(var3);
                if (this.field2464[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ei.l(II)[B")
    public byte[] method2665(int arg0) {
        if (this.field2461.length == 1) {
            return this.method2660(0, arg0);
        } else if (this.field2461[arg0].length == 1) {
            return this.method2660(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ei.n(III)[B")
    public byte[] method2666(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2461.length || this.field2461[arg0] == null || arg1 < 0 || arg1 >= this.field2461[arg0].length) {
            return null;
        }
        if (this.field2461[arg0][arg1] == null) {
            boolean var3 = this.method2692(arg0, (int[]) null);
            if (!var3) {
                this.method2668(arg0);
                boolean var4 = this.method2692(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class114.method1356(this.field2461[arg0][arg1], false);
    }

    @ObfuscatedName("ei.d(II)[B")
    public byte[] method2713(int arg0) {
        if (this.field2461.length == 1) {
            return this.method2666(0, arg0);
        } else if (this.field2461[arg0].length == 1) {
            return this.method2666(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ei.h(IB)V")
    public void method2668(int arg0) {
    }

    @ObfuscatedName("ei.y(IB)[I")
    public int[] method2675(int arg0) {
        return this.field2458[arg0];
    }

    @ObfuscatedName("ei.p(IS)I")
    public int method2688(int arg0) {
        return this.field2461[arg0].length;
    }

    @ObfuscatedName("ei.i(I)I")
    public int method2671() {
        return this.field2461.length;
    }

    @ObfuscatedName("ei.s(II)V")
    public void method2672(int arg0) {
        for (int var2 = 0; var2 < this.field2461[arg0].length; var2++) {
            this.field2461[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ei.f(B)V")
    public void method2696() {
        for (int var1 = 0; var1 < this.field2461.length; var1++) {
            if (this.field2461[var1] != null) {
                for (int var2 = 0; var2 < this.field2461[var1].length; var2++) {
                    this.field2461[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ei.u(I[IB)Z")
    public boolean method2692(int arg0, int[] arg1) {
        if (this.field2464[arg0] == null) {
            return false;
        }
        int var3 = this.field2460[arg0];
        int[] var4 = this.field2458[arg0];
        Object[] var5 = this.field2461[arg0];
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
            var8 = class114.method1356(this.field2464[arg0], true);
            class108 var9 = new class108(var8);
            var9.method2100(arg1, 5, var9.field1828.length);
        } else {
            var8 = class114.method1356(this.field2464[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2419(var8);
        } catch (RuntimeException var31) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class108.method516(var8, var8.length) + ",";
            int var14 = var8.length - 2;
            int var15 = class108.method2629(var8, 0, var14);
            throw class137.method1351(var31, var13 + var15 + "," + this.field2468[arg0] + "," + this.field2465);
        }
        if (this.field2456) {
            this.field2464[arg0] = null;
        }
        if (var3 > 1) {
            int var16 = var10.length;
            int var32 = var16 - 1;
            int var17 = var10[var32] & 0xFF;
            int var18 = var32 - var3 * var17 * 4;
            class108 var19 = new class108(var10);
            int[] var20 = new int[var3];
            var19.field1824 = var18;
            for (int var21 = 0; var21 < var17; var21++) {
                int var22 = 0;
                for (int var23 = 0; var23 < var3; var23++) {
                    var22 += var19.method2117();
                    var20[var23] += var22;
                }
            }
            byte[][] var24 = new byte[var3][];
            for (int var25 = 0; var25 < var3; var25++) {
                var24[var25] = new byte[var20[var25]];
                var20[var25] = 0;
            }
            var19.field1824 = var18;
            int var26 = 0;
            for (int var27 = 0; var27 < var17; var27++) {
                int var28 = 0;
                for (int var29 = 0; var29 < var3; var29++) {
                    var28 += var19.method2117();
                    System.arraycopy(var10, var26, var24[var29], var20[var29], var28);
                    var20[var29] += var28;
                    var26 += var28;
                }
            }
            for (int var30 = 0; var30 < var3; var30++) {
                if (this.field2469) {
                    var5[var4[var30]] = var24[var30];
                } else {
                    var5[var4[var30]] = class114.method157(var24[var30], false);
                }
            }
        } else if (this.field2469) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class114.method157(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ei.v(Ljava/lang/String;I)I")
    public int method2723(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2457.method3093(class211.method2844(var2));
    }

    @ObfuscatedName("ei.r(ILjava/lang/String;I)I")
    public int method2676(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2467[arg0].method3093(class211.method2844(var3));
    }

    @ObfuscatedName("ei.q(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2677(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2457.method3093(class211.method2844(var3));
        int var6 = this.field2467[var5].method3093(class211.method2844(var4));
        return this.method2660(var5, var6);
    }

    @ObfuscatedName("ei.x(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method2678(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2457.method3093(class211.method2844(var3));
        int var6 = this.field2467[var5].method3093(class211.method2844(var4));
        return this.method2712(var5, var6);
    }

    @ObfuscatedName("ei.t(Ljava/lang/String;I)Z")
    public boolean method2674(String arg0) {
        int var2 = this.method2723("");
        return var2 == -1 ? this.method2678(arg0, "") : this.method2678("", arg0);
    }

    @ObfuscatedName("ei.e(Ljava/lang/String;B)V")
    public void method2680(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2457.method3093(class211.method2844(var2));
        if (var3 >= 0) {
            this.method2659(var3);
        }
    }

    @ObfuscatedName("dp.m([BI)[B")
    public static final byte[] method2419(byte[] arg0) {
        class108 var1 = new class108(arg0);
        int var2 = var1.method2083();
        int var3 = var1.method2117();
        if (var3 < 0 || !(field2470 == 0 || var3 <= field2470)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2094(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2117();
            if (var5 < 0 || field2470 != 0 && var5 > field2470) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class106.method2031(var6, var5, arg0, var3, 9);
            } else {
                field2466.method2027(var1, var6);
            }
            return var6;
        }
    }
}
