package deob;

@ObfuscatedName("fd")
public abstract class class158 {

    @ObfuscatedName("fd.n")
    public int field2580;

    @ObfuscatedName("fd.w")
    public int[] field2583;

    @ObfuscatedName("fd.i")
    public int[] field2575;

    @ObfuscatedName("fd.e")
    public class183 field2576;

    @ObfuscatedName("fd.h")
    public int[] field2577;

    @ObfuscatedName("fd.q")
    public int[] field2574;

    @ObfuscatedName("fd.l")
    public int[] field2579;

    @ObfuscatedName("fd.c")
    public int[][] field2581;

    @ObfuscatedName("fd.f")
    public int[][] field2585;

    @ObfuscatedName("fd.s")
    public class183[] field2582;

    @ObfuscatedName("fd.m")
    public Object[] field2588;

    @ObfuscatedName("fd.y")
    public Object[][] field2584;

    @ObfuscatedName("fd.b")
    public static class108 field2586 = new class108();

    @ObfuscatedName("fd.v")
    public int field2578;

    @ObfuscatedName("fd.z")
    public boolean field2587;

    @ObfuscatedName("fd.u")
    public boolean field2573;

    @ObfuscatedName("fd.g")
    public static int field2589 = 0;

    public class158(boolean arg0, boolean arg1) {
        this.field2587 = arg0;
        this.field2573 = arg1;
    }

    @ObfuscatedName("fd.n([BI)V")
    public void method2918(byte[] arg0) {
        this.field2578 = class111.method3500(arg0, arg0.length);
        class111 var2 = new class111(Statics.method3099(arg0));
        int var3 = var2.method2155();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2160();
        }
        int var4 = var2.method2155();
        if (var3 >= 7) {
            this.field2580 = var2.method2169();
        } else {
            this.field2580 = var2.method2157();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2583 = new int[this.field2580];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2580; var7++) {
                this.field2583[var7] = var5 += var2.method2169();
                if (this.field2583[var7] > var6) {
                    var6 = this.field2583[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2580; var8++) {
                this.field2583[var8] = var5 += var2.method2157();
                if (this.field2583[var8] > var6) {
                    var6 = this.field2583[var8];
                }
            }
        }
        this.field2577 = new int[var6 + 1];
        this.field2574 = new int[var6 + 1];
        this.field2579 = new int[var6 + 1];
        this.field2581 = new int[var6 + 1][];
        this.field2588 = new Object[var6 + 1];
        this.field2584 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2575 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2580; var9++) {
                this.field2575[this.field2583[var9]] = var2.method2160();
            }
            this.field2576 = new class183(this.field2575);
        }
        for (int var10 = 0; var10 < this.field2580; var10++) {
            this.field2577[this.field2583[var10]] = var2.method2160();
        }
        for (int var11 = 0; var11 < this.field2580; var11++) {
            this.field2574[this.field2583[var11]] = var2.method2160();
        }
        for (int var12 = 0; var12 < this.field2580; var12++) {
            this.field2579[this.field2583[var12]] = var2.method2157();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2580; var13++) {
                int var14 = this.field2583[var13];
                int var15 = this.field2579[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2581[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2581[var14][var18] = var16 += var2.method2169();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2584[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2580; var20++) {
                int var21 = this.field2583[var20];
                int var22 = this.field2579[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2581[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2581[var21][var25] = var23 += var2.method2157();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2584[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2585 = new int[var6 + 1][];
        this.field2582 = new class183[var6 + 1];
        for (int var27 = 0; var27 < this.field2580; var27++) {
            int var28 = this.field2583[var27];
            int var29 = this.field2579[var28];
            this.field2585[var28] = new int[this.field2584[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2585[var28][this.field2581[var28][var30]] = var2.method2160();
            }
            this.field2582[var28] = new class183(this.field2585[var28]);
        }
    }

    @ObfuscatedName("fd.w(II)V")
    public void method2858(int arg0) {
    }

    @ObfuscatedName("fd.i(III)[B")
    public byte[] method2859(int arg0, int arg1) {
        return this.method2866(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fd.e(II[II)[B")
    public byte[] method2866(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2584.length || this.field2584[arg0] == null || arg1 < 0 || arg1 >= this.field2584[arg0].length) {
            return null;
        }
        if (this.field2584[arg0][arg1] == null) {
            boolean var4 = this.method2872(arg0, arg2);
            if (!var4) {
                this.method2910(arg0);
                boolean var5 = this.method2872(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class117.method160(this.field2584[arg0][arg1], false);
        if (this.field2573) {
            this.field2584[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fd.h(IIS)Z")
    public boolean method2861(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2584.length || this.field2584[arg0] == null || arg1 < 0 || arg1 >= this.field2584[arg0].length) {
            return false;
        } else if (this.field2584[arg0][arg1] != null) {
            return true;
        } else if (this.field2588[arg0] == null) {
            this.method2910(arg0);
            return this.field2588[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fd.q(II)Z")
    public boolean method2867(int arg0) {
        if (this.field2588[arg0] == null) {
            this.method2910(arg0);
            return this.field2588[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fd.l(S)Z")
    public boolean method2899() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2583.length; var2++) {
            int var3 = this.field2583[var2];
            if (this.field2588[var3] == null) {
                this.method2910(var3);
                if (this.field2588[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fd.c(II)[B")
    public byte[] method2863(int arg0) {
        if (this.field2584.length == 1) {
            return this.method2859(0, arg0);
        } else if (this.field2584[arg0].length == 1) {
            return this.method2859(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fd.f(III)[B")
    public byte[] method2876(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2584.length || this.field2584[arg0] == null || arg1 < 0 || arg1 >= this.field2584[arg0].length) {
            return null;
        }
        if (this.field2584[arg0][arg1] == null) {
            boolean var3 = this.method2872(arg0, (int[]) null);
            if (!var3) {
                this.method2910(arg0);
                boolean var4 = this.method2872(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class117.method160(this.field2584[arg0][arg1], false);
    }

    @ObfuscatedName("fd.s(II)[B")
    public byte[] method2890(int arg0) {
        if (this.field2584.length == 1) {
            return this.method2876(0, arg0);
        } else if (this.field2584[arg0].length == 1) {
            return this.method2876(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fd.m(IB)V")
    public void method2910(int arg0) {
    }

    @ObfuscatedName("fd.y(II)[I")
    public int[] method2868(int arg0) {
        return this.field2581[arg0];
    }

    @ObfuscatedName("fd.b(II)I")
    public int method2898(int arg0) {
        return this.field2584[arg0].length;
    }

    @ObfuscatedName("fd.v(B)I")
    public int method2869() {
        return this.field2584.length;
    }

    @ObfuscatedName("fd.z(II)V")
    public void method2870(int arg0) {
        for (int var2 = 0; var2 < this.field2584[arg0].length; var2++) {
            this.field2584[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fd.u(I)V")
    public void method2871() {
        for (int var1 = 0; var1 < this.field2584.length; var1++) {
            if (this.field2584[var1] != null) {
                for (int var2 = 0; var2 < this.field2584[var1].length; var2++) {
                    this.field2584[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fd.g(I[IB)Z")
    public boolean method2872(int arg0, int[] arg1) {
        if (this.field2588[arg0] == null) {
            return false;
        }
        int var3 = this.field2579[arg0];
        int[] var4 = this.field2581[arg0];
        Object[] var5 = this.field2584[arg0];
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
            var8 = class117.method160(this.field2588[arg0], true);
            class111 var9 = new class111(var8);
            var9.method2174(arg1, 5, var9.field1886.length);
        } else {
            var8 = class117.method160(this.field2588[arg0], false);
        }
        byte[] var10;
        try {
            var10 = Statics.method3099(var8);
        } catch (RuntimeException var27) {
            throw class140.method2093(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class111.method3500(var8, var8.length) + "," + class111.method3500(var8, var8.length - 2) + "," + this.field2577[arg0] + "," + this.field2578);
        }
        if (this.field2587) {
            this.field2588[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class111 var15 = new class111(var10);
            int[] var16 = new int[var3];
            var15.field1888 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2160();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1888 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2160();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2573) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class117.method640(var20[var26], false);
                }
            }
        } else if (this.field2573) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class117.method640(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fd.k(Ljava/lang/String;B)I")
    public int method2925(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2576.method3313(class154.method2626(var2));
    }

    @ObfuscatedName("fd.o(ILjava/lang/String;B)I")
    public int method2864(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2582[arg0].method3313(class154.method2626(var3));
    }

    @ObfuscatedName("fd.a(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2875(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2576.method3313(class154.method2626(var3));
        int var6 = this.field2582[var5].method3313(class154.method2626(var4));
        return this.method2859(var5, var6);
    }

    @ObfuscatedName("fd.p(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2860(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2576.method3313(class154.method2626(var3));
        int var6 = this.field2582[var5].method3313(class154.method2626(var4));
        return this.method2861(var5, var6);
    }

    @ObfuscatedName("fd.t(Ljava/lang/String;I)Z")
    public boolean method2877(String arg0) {
        int var2 = this.method2925("");
        return var2 == -1 ? this.method2860(arg0, "") : this.method2860("", arg0);
    }

    @ObfuscatedName("fd.x(Ljava/lang/String;B)V")
    public void method2916(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2576.method3313(class154.method2626(var2));
        if (var3 >= 0) {
            this.method2858(var3);
        }
    }
}
