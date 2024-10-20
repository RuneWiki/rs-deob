package deob;

@ObfuscatedName("fd")
public abstract class class158 {

    @ObfuscatedName("fd.n")
    public int field2588;

    @ObfuscatedName("fd.o")
    public int[] field2571;

    @ObfuscatedName("fd.a")
    public int[] field2591;

    @ObfuscatedName("fd.w")
    public class183 field2573;

    @ObfuscatedName("fd.m")
    public int[] field2574;

    @ObfuscatedName("fd.h")
    public int[] field2575;

    @ObfuscatedName("fd.i")
    public int[] field2583;

    @ObfuscatedName("fd.r")
    public int[][] field2570;

    @ObfuscatedName("fd.l")
    public int[][] field2589;

    @ObfuscatedName("fd.f")
    public class183[] field2579;

    @ObfuscatedName("fd.e")
    public Object[] field2580;

    @ObfuscatedName("fd.z")
    public Object[][] field2581;

    @ObfuscatedName("fd.v")
    public static class108 field2582 = new class108();

    @ObfuscatedName("fd.x")
    public int field2578;

    @ObfuscatedName("fd.q")
    public boolean field2584;

    @ObfuscatedName("fd.b")
    public boolean field2585;

    @ObfuscatedName("fd.u")
    public static int field2586 = 0;

    public class158(boolean arg0, boolean arg1) {
        this.field2584 = arg0;
        this.field2585 = arg1;
    }

    @ObfuscatedName("fd.n([BB)V")
    public void method2923(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class111.method599(arg0, 0, var2);
        this.field2578 = var3;
        class111 var4 = new class111(method2664(arg0));
        int var5 = var4.method2234();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2239();
        }
        int var6 = var4.method2234();
        if (var5 >= 7) {
            this.field2588 = var4.method2248();
        } else {
            this.field2588 = var4.method2236();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2571 = new int[this.field2588];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2588; var9++) {
                this.field2571[var9] = var7 += var4.method2248();
                if (this.field2571[var9] > var8) {
                    var8 = this.field2571[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2588; var10++) {
                this.field2571[var10] = var7 += var4.method2236();
                if (this.field2571[var10] > var8) {
                    var8 = this.field2571[var10];
                }
            }
        }
        this.field2574 = new int[var8 + 1];
        this.field2575 = new int[var8 + 1];
        this.field2583 = new int[var8 + 1];
        this.field2570 = new int[var8 + 1][];
        this.field2580 = new Object[var8 + 1];
        this.field2581 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2591 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2588; var11++) {
                this.field2591[this.field2571[var11]] = var4.method2239();
            }
            this.field2573 = new class183(this.field2591);
        }
        for (int var12 = 0; var12 < this.field2588; var12++) {
            this.field2574[this.field2571[var12]] = var4.method2239();
        }
        for (int var13 = 0; var13 < this.field2588; var13++) {
            this.field2575[this.field2571[var13]] = var4.method2239();
        }
        for (int var14 = 0; var14 < this.field2588; var14++) {
            this.field2583[this.field2571[var14]] = var4.method2236();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2588; var15++) {
                int var16 = this.field2571[var15];
                int var17 = this.field2583[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2570[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2570[var16][var20] = var18 += var4.method2248();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2581[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2588; var22++) {
                int var23 = this.field2571[var22];
                int var24 = this.field2583[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2570[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2570[var23][var27] = var25 += var4.method2236();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2581[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2589 = new int[var8 + 1][];
        this.field2579 = new class183[var8 + 1];
        for (int var29 = 0; var29 < this.field2588; var29++) {
            int var30 = this.field2571[var29];
            int var31 = this.field2583[var30];
            this.field2589[var30] = new int[this.field2581[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2589[var30][this.field2570[var30][var32]] = var4.method2239();
            }
            this.field2579[var30] = new class183(this.field2589[var30]);
        }
    }

    @ObfuscatedName("fd.o(II)V")
    public void method2924(int arg0) {
    }

    @ObfuscatedName("fd.a(IIB)[B")
    public byte[] method2925(int arg0, int arg1) {
        return this.method2926(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fd.w(II[II)[B")
    public byte[] method2926(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2581.length || this.field2581[arg0] == null || arg1 < 0 || arg1 >= this.field2581[arg0].length) {
            return null;
        }
        if (this.field2581[arg0][arg1] == null) {
            boolean var4 = this.method2961(arg0, arg2);
            if (!var4) {
                this.method2932(arg0);
                boolean var5 = this.method2961(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class117.method1105(this.field2581[arg0][arg1], false);
        if (this.field2585) {
            this.field2581[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fd.m(III)Z")
    public boolean method2995(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2581.length || this.field2581[arg0] == null || arg1 < 0 || arg1 >= this.field2581[arg0].length) {
            return false;
        } else if (this.field2581[arg0][arg1] != null) {
            return true;
        } else if (this.field2580[arg0] == null) {
            this.method2932(arg0);
            return this.field2580[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fd.h(II)Z")
    public boolean method2928(int arg0) {
        if (this.field2580[arg0] == null) {
            this.method2932(arg0);
            return this.field2580[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fd.i(B)Z")
    public boolean method2929() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2571.length; var2++) {
            int var3 = this.field2571[var2];
            if (this.field2580[var3] == null) {
                this.method2932(var3);
                if (this.field2580[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fd.r(II)[B")
    public byte[] method2958(int arg0) {
        if (this.field2581.length == 1) {
            return this.method2925(0, arg0);
        } else if (this.field2581[arg0].length == 1) {
            return this.method2925(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fd.l(III)[B")
    public byte[] method2952(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2581.length || this.field2581[arg0] == null || arg1 < 0 || arg1 >= this.field2581[arg0].length) {
            return null;
        }
        if (this.field2581[arg0][arg1] == null) {
            boolean var3 = this.method2961(arg0, (int[]) null);
            if (!var3) {
                this.method2932(arg0);
                boolean var4 = this.method2961(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class117.method1105(this.field2581[arg0][arg1], false);
    }

    @ObfuscatedName("fd.f(IB)[B")
    public byte[] method2931(int arg0) {
        if (this.field2581.length == 1) {
            return this.method2952(0, arg0);
        } else if (this.field2581[arg0].length == 1) {
            return this.method2952(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fd.e(II)V")
    public void method2932(int arg0) {
    }

    @ObfuscatedName("fd.z(II)[I")
    public int[] method2933(int arg0) {
        return this.field2570[arg0];
    }

    @ObfuscatedName("fd.v(II)I")
    public int method2945(int arg0) {
        return this.field2581[arg0].length;
    }

    @ObfuscatedName("fd.x(B)I")
    public int method2934() {
        return this.field2581.length;
    }

    @ObfuscatedName("fd.q(II)V")
    public void method2937(int arg0) {
        for (int var2 = 0; var2 < this.field2581[arg0].length; var2++) {
            this.field2581[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fd.b(I)V")
    public void method2973() {
        for (int var1 = 0; var1 < this.field2581.length; var1++) {
            if (this.field2581[var1] != null) {
                for (int var2 = 0; var2 < this.field2581[var1].length; var2++) {
                    this.field2581[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fd.u(I[IB)Z")
    public boolean method2961(int arg0, int[] arg1) {
        if (this.field2580[arg0] == null) {
            return false;
        }
        int var3 = this.field2583[arg0];
        int[] var4 = this.field2570[arg0];
        Object[] var5 = this.field2581[arg0];
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
            var8 = class117.method1105(this.field2580[arg0], true);
            class111 var9 = new class111(var8);
            var9.method2253(arg1, 5, var9.field1889.length);
        } else {
            var8 = class117.method1105(this.field2580[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2664(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class111.method599(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class111.method599(var8, 0, var17);
            throw class140.method2586(var34, var16 + var18 + "," + this.field2574[arg0] + "," + this.field2578);
        }
        if (this.field2584) {
            this.field2580[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class111 var22 = new class111(var10);
            int[] var23 = new int[var3];
            var22.field1890 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2239();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field1890 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2239();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2585) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class117.method558(var27[var33], false);
                }
            }
        } else if (this.field2585) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class117.method558(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fd.t(Ljava/lang/String;I)I")
    public int method2944(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2573.method3369(class154.method2837(var2));
    }

    @ObfuscatedName("fd.s(ILjava/lang/String;B)I")
    public int method2939(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2579[arg0].method3369(class154.method2837(var3));
    }

    @ObfuscatedName("fd.p(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2940(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2573.method3369(class154.method2837(var3));
        int var6 = this.field2579[var5].method3369(class154.method2837(var4));
        return this.method2925(var5, var6);
    }

    @ObfuscatedName("fd.d(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2941(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2573.method3369(class154.method2837(var3));
        int var6 = this.field2579[var5].method3369(class154.method2837(var4));
        return this.method2995(var5, var6);
    }

    @ObfuscatedName("fd.j(Ljava/lang/String;B)Z")
    public boolean method2942(String arg0) {
        int var2 = this.method2944("");
        return var2 == -1 ? this.method2941(arg0, "") : this.method2941("", arg0);
    }

    @ObfuscatedName("fd.k(Ljava/lang/String;I)V")
    public void method2943(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2573.method3369(class154.method2837(var2));
        if (var3 >= 0) {
            this.method2924(var3);
        }
    }

    @ObfuscatedName("dw.y([BI)[B")
    public static final byte[] method2664(byte[] arg0) {
        class111 var1 = new class111(arg0);
        int var2 = var1.method2234();
        int var3 = var1.method2239();
        if (var3 < 0 || !(field2586 == 0 || var3 <= field2586)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2245(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2239();
            if (var5 < 0 || field2586 != 0 && var5 > field2586) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class109.method2184(var6, var5, arg0, var3, 9);
            } else {
                field2582.method2177(var1, var6);
            }
            return var6;
        }
    }
}
