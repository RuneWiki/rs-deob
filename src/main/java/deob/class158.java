package deob;

@ObfuscatedName("fi")
public abstract class class158 {

    @ObfuscatedName("fi.n")
    public int field2564;

    @ObfuscatedName("fi.g")
    public int[] field2565;

    @ObfuscatedName("fi.a")
    public int[] field2567;

    @ObfuscatedName("fi.m")
    public class183 field2581;

    @ObfuscatedName("fi.s")
    public int[] field2568;

    @ObfuscatedName("fi.j")
    public int[] field2569;

    @ObfuscatedName("fi.f")
    public int[] field2570;

    @ObfuscatedName("fi.b")
    public int[][] field2571;

    @ObfuscatedName("fi.t")
    public int[][] field2566;

    @ObfuscatedName("fi.i")
    public class183[] field2573;

    @ObfuscatedName("fi.c")
    public Object[] field2574;

    @ObfuscatedName("fi.k")
    public Object[][] field2575;

    @ObfuscatedName("fi.x")
    public static class108 field2577 = new class108();

    @ObfuscatedName("fi.e")
    public int field2572;

    @ObfuscatedName("fi.q")
    public boolean field2578;

    @ObfuscatedName("fi.o")
    public boolean field2579;

    @ObfuscatedName("fi.r")
    public static int field2580 = 0;

    public class158(boolean arg0, boolean arg1) {
        this.field2578 = arg0;
        this.field2579 = arg1;
    }

    @ObfuscatedName("fi.n([BB)V")
    public void method2907(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class111.method128(arg0, 0, var2);
        this.field2572 = var3;
        class111 var4 = new class111(method2897(arg0));
        int var5 = var4.method2211();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2366();
        }
        int var6 = var4.method2211();
        if (var5 >= 7) {
            this.field2564 = var4.method2232();
        } else {
            this.field2564 = var4.method2395();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2565 = new int[this.field2564];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2564; var9++) {
                this.field2565[var9] = var7 += var4.method2232();
                if (this.field2565[var9] > var8) {
                    var8 = this.field2565[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2564; var10++) {
                this.field2565[var10] = var7 += var4.method2395();
                if (this.field2565[var10] > var8) {
                    var8 = this.field2565[var10];
                }
            }
        }
        this.field2568 = new int[var8 + 1];
        this.field2569 = new int[var8 + 1];
        this.field2570 = new int[var8 + 1];
        this.field2571 = new int[var8 + 1][];
        this.field2574 = new Object[var8 + 1];
        this.field2575 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2567 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2564; var11++) {
                this.field2567[this.field2565[var11]] = var4.method2366();
            }
            this.field2581 = new class183(this.field2567);
        }
        for (int var12 = 0; var12 < this.field2564; var12++) {
            this.field2568[this.field2565[var12]] = var4.method2366();
        }
        for (int var13 = 0; var13 < this.field2564; var13++) {
            this.field2569[this.field2565[var13]] = var4.method2366();
        }
        for (int var14 = 0; var14 < this.field2564; var14++) {
            this.field2570[this.field2565[var14]] = var4.method2395();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2564; var15++) {
                int var16 = this.field2565[var15];
                int var17 = this.field2570[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2571[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2571[var16][var20] = var18 += var4.method2232();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2575[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2564; var22++) {
                int var23 = this.field2565[var22];
                int var24 = this.field2570[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2571[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2571[var23][var27] = var25 += var4.method2395();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2575[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2566 = new int[var8 + 1][];
        this.field2573 = new class183[var8 + 1];
        for (int var29 = 0; var29 < this.field2564; var29++) {
            int var30 = this.field2565[var29];
            int var31 = this.field2570[var30];
            this.field2566[var30] = new int[this.field2575[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2566[var30][this.field2571[var30][var32]] = var4.method2366();
            }
            this.field2573[var30] = new class183(this.field2566[var30]);
        }
    }

    @ObfuscatedName("fi.g(II)V")
    public void method2908(int arg0) {
    }

    @ObfuscatedName("fi.a(III)[B")
    public byte[] method2929(int arg0, int arg1) {
        return this.method2928(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fi.m(II[II)[B")
    public byte[] method2928(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2575.length || this.field2575[arg0] == null || arg1 < 0 || arg1 >= this.field2575[arg0].length) {
            return null;
        }
        if (this.field2575[arg0][arg1] == null) {
            boolean var4 = this.method2923(arg0, arg2);
            if (!var4) {
                this.method2966(arg0);
                boolean var5 = this.method2923(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class117.method529(this.field2575[arg0][arg1], false);
        if (this.field2579) {
            this.field2575[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fi.s(IIB)Z")
    public boolean method2987(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2575.length || this.field2575[arg0] == null || arg1 < 0 || arg1 >= this.field2575[arg0].length) {
            return false;
        } else if (this.field2575[arg0][arg1] != null) {
            return true;
        } else if (this.field2574[arg0] == null) {
            this.method2966(arg0);
            return this.field2574[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fi.j(IB)Z")
    public boolean method2912(int arg0) {
        if (this.field2574[arg0] == null) {
            this.method2966(arg0);
            return this.field2574[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fi.f(B)Z")
    public boolean method2913() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2565.length; var2++) {
            int var3 = this.field2565[var2];
            if (this.field2574[var3] == null) {
                this.method2966(var3);
                if (this.field2574[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fi.b(II)[B")
    public byte[] method2914(int arg0) {
        if (this.field2575.length == 1) {
            return this.method2929(0, arg0);
        } else if (this.field2575[arg0].length == 1) {
            return this.method2929(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fi.t(IIB)[B")
    public byte[] method2915(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2575.length || this.field2575[arg0] == null || arg1 < 0 || arg1 >= this.field2575[arg0].length) {
            return null;
        }
        if (this.field2575[arg0][arg1] == null) {
            boolean var3 = this.method2923(arg0, (int[]) null);
            if (!var3) {
                this.method2966(arg0);
                boolean var4 = this.method2923(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class117.method529(this.field2575[arg0][arg1], false);
    }

    @ObfuscatedName("fi.i(II)[B")
    public byte[] method2916(int arg0) {
        if (this.field2575.length == 1) {
            return this.method2915(0, arg0);
        } else if (this.field2575[arg0].length == 1) {
            return this.method2915(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fi.c(IB)V")
    public void method2966(int arg0) {
    }

    @ObfuscatedName("fi.k(II)[I")
    public int[] method2918(int arg0) {
        return this.field2571[arg0];
    }

    @ObfuscatedName("fi.x(II)I")
    public int method2919(int arg0) {
        return this.field2575[arg0].length;
    }

    @ObfuscatedName("fi.e(I)I")
    public int method2973() {
        return this.field2575.length;
    }

    @ObfuscatedName("fi.q(II)V")
    public void method2931(int arg0) {
        for (int var2 = 0; var2 < this.field2575[arg0].length; var2++) {
            this.field2575[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fi.o(I)V")
    public void method2922() {
        for (int var1 = 0; var1 < this.field2575.length; var1++) {
            if (this.field2575[var1] != null) {
                for (int var2 = 0; var2 < this.field2575[var1].length; var2++) {
                    this.field2575[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fi.r(I[II)Z")
    public boolean method2923(int arg0, int[] arg1) {
        if (this.field2574[arg0] == null) {
            return false;
        }
        int var3 = this.field2570[arg0];
        int[] var4 = this.field2571[arg0];
        Object[] var5 = this.field2575[arg0];
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
            var8 = class117.method529(this.field2574[arg0], true);
            class111 var9 = new class111(var8);
            var9.method2306(arg1, 5, var9.field1904.length);
        } else {
            var8 = class117.method529(this.field2574[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2897(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class111.method128(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class111.method128(var8, 0, var18);
            throw class140.method3088(var35, var17 + var19 + "," + this.field2568[arg0] + "," + this.field2572);
        }
        if (this.field2578) {
            this.field2574[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class111 var23 = new class111(var10);
            int[] var24 = new int[var3];
            var23.field1896 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2366();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1896 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2366();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2579) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class117.method1416(var28[var34], false);
                }
            }
        } else if (this.field2579) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class117.method1416(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fi.v(Ljava/lang/String;B)I")
    public int method2924(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2581.method3382(class154.method2816(var2));
    }

    @ObfuscatedName("fi.h(ILjava/lang/String;I)I")
    public int method2935(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2573[arg0].method3382(class154.method2816(var3));
    }

    @ObfuscatedName("fi.p(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2911(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2581.method3382(class154.method2816(var3));
        int var6 = this.field2573[var5].method3382(class154.method2816(var4));
        return this.method2929(var5, var6);
    }

    @ObfuscatedName("fi.y(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2926(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2581.method3382(class154.method2816(var3));
        int var6 = this.field2573[var5].method3382(class154.method2816(var4));
        return this.method2987(var5, var6);
    }

    @ObfuscatedName("fi.z(Ljava/lang/String;B)Z")
    public boolean method2927(String arg0) {
        int var2 = this.method2924("");
        return var2 == -1 ? this.method2926(arg0, "") : this.method2926("", arg0);
    }

    @ObfuscatedName("fi.u(Ljava/lang/String;I)V")
    public void method2982(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2581.method3382(class154.method2816(var2));
        if (var3 >= 0) {
            this.method2908(var3);
        }
    }

    @ObfuscatedName("ef.w([BS)[B")
    public static final byte[] method2897(byte[] arg0) {
        class111 var1 = new class111(arg0);
        int var2 = var1.method2211();
        int var3 = var1.method2366();
        if (var3 < 0 || !(field2580 == 0 || var3 <= field2580)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2226(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2366();
            if (var5 < 0 || field2580 != 0 && var5 > field2580) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class109.method2166(var6, var5, arg0, var3, 9);
            } else {
                field2577.method2159(var1, var6);
            }
            return var6;
        }
    }
}
