package deob;

@ObfuscatedName("fd")
public abstract class class158 {

    @ObfuscatedName("fd.y")
    public int field2597;

    @ObfuscatedName("fd.k")
    public int[] field2579;

    @ObfuscatedName("fd.g")
    public int[] field2580;

    @ObfuscatedName("fd.n")
    public class183 field2581;

    @ObfuscatedName("fd.t")
    public int[] field2598;

    @ObfuscatedName("fd.e")
    public int[] field2583;

    @ObfuscatedName("fd.q")
    public int[] field2584;

    @ObfuscatedName("fd.z")
    public int[][] field2589;

    @ObfuscatedName("fd.v")
    public int[][] field2586;

    @ObfuscatedName("fd.b")
    public class183[] field2587;

    @ObfuscatedName("fd.f")
    public Object[] field2592;

    @ObfuscatedName("fd.i")
    public Object[][] field2588;

    @ObfuscatedName("fd.w")
    public static class108 field2590 = new class108();

    @ObfuscatedName("fd.l")
    public int field2591;

    @ObfuscatedName("fd.j")
    public boolean field2585;

    @ObfuscatedName("fd.s")
    public boolean field2578;

    @ObfuscatedName("fd.r")
    public static int field2594 = 0;

    public class158(boolean arg0, boolean arg1) {
        this.field2585 = arg0;
        this.field2578 = arg1;
    }

    @ObfuscatedName("fd.y([BI)V")
    public void method2885(byte[] arg0) {
        this.field2591 = class111.method1988(arg0, arg0.length);
        class111 var2 = new class111(method1993(arg0));
        int var3 = var2.method2205();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2165();
        }
        int var4 = var2.method2205();
        if (var3 >= 7) {
            this.field2597 = var2.method2174();
        } else {
            this.field2597 = var2.method2339();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2579 = new int[this.field2597];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2597; var7++) {
                this.field2579[var7] = var5 += var2.method2174();
                if (this.field2579[var7] > var6) {
                    var6 = this.field2579[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2597; var8++) {
                this.field2579[var8] = var5 += var2.method2339();
                if (this.field2579[var8] > var6) {
                    var6 = this.field2579[var8];
                }
            }
        }
        this.field2598 = new int[var6 + 1];
        this.field2583 = new int[var6 + 1];
        this.field2584 = new int[var6 + 1];
        this.field2589 = new int[var6 + 1][];
        this.field2592 = new Object[var6 + 1];
        this.field2588 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2580 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2597; var9++) {
                this.field2580[this.field2579[var9]] = var2.method2165();
            }
            this.field2581 = new class183(this.field2580);
        }
        for (int var10 = 0; var10 < this.field2597; var10++) {
            this.field2598[this.field2579[var10]] = var2.method2165();
        }
        for (int var11 = 0; var11 < this.field2597; var11++) {
            this.field2583[this.field2579[var11]] = var2.method2165();
        }
        for (int var12 = 0; var12 < this.field2597; var12++) {
            this.field2584[this.field2579[var12]] = var2.method2339();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2597; var13++) {
                int var14 = this.field2579[var13];
                int var15 = this.field2584[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2589[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2589[var14][var18] = var16 += var2.method2174();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2588[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2597; var20++) {
                int var21 = this.field2579[var20];
                int var22 = this.field2584[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2589[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2589[var21][var25] = var23 += var2.method2339();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2588[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2586 = new int[var6 + 1][];
        this.field2587 = new class183[var6 + 1];
        for (int var27 = 0; var27 < this.field2597; var27++) {
            int var28 = this.field2579[var27];
            int var29 = this.field2584[var28];
            this.field2586[var28] = new int[this.field2588[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2586[var28][this.field2589[var28][var30]] = var2.method2165();
            }
            this.field2587[var28] = new class183(this.field2586[var28]);
        }
    }

    @ObfuscatedName("fd.k(II)V")
    public void method2909(int arg0) {
    }

    @ObfuscatedName("fd.g(IIB)[B")
    public byte[] method2874(int arg0, int arg1) {
        return this.method2945(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fd.n(II[II)[B")
    public byte[] method2945(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2588.length || this.field2588[arg0] == null || arg1 < 0 || arg1 >= this.field2588[arg0].length) {
            return null;
        }
        if (this.field2588[arg0][arg1] == null) {
            boolean var4 = this.method2872(arg0, arg2);
            if (!var4) {
                this.method2910(arg0);
                boolean var5 = this.method2872(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class117.method79(this.field2588[arg0][arg1], false);
        if (this.field2578) {
            this.field2588[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fd.t(III)Z")
    public boolean method2876(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2588.length || this.field2588[arg0] == null || arg1 < 0 || arg1 >= this.field2588[arg0].length) {
            return false;
        } else if (this.field2588[arg0][arg1] != null) {
            return true;
        } else if (this.field2592[arg0] == null) {
            this.method2910(arg0);
            return this.field2592[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fd.e(II)Z")
    public boolean method2930(int arg0) {
        if (this.field2592[arg0] == null) {
            this.method2910(arg0);
            return this.field2592[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fd.q(I)Z")
    public boolean method2931() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2579.length; var2++) {
            int var3 = this.field2579[var2];
            if (this.field2592[var3] == null) {
                this.method2910(var3);
                if (this.field2592[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fd.z(II)[B")
    public byte[] method2925(int arg0) {
        if (this.field2588.length == 1) {
            return this.method2874(0, arg0);
        } else if (this.field2588[arg0].length == 1) {
            return this.method2874(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fd.v(IIB)[B")
    public byte[] method2879(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2588.length || this.field2588[arg0] == null || arg1 < 0 || arg1 >= this.field2588[arg0].length) {
            return null;
        }
        if (this.field2588[arg0][arg1] == null) {
            boolean var3 = this.method2872(arg0, (int[]) null);
            if (!var3) {
                this.method2910(arg0);
                boolean var4 = this.method2872(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class117.method79(this.field2588[arg0][arg1], false);
    }

    @ObfuscatedName("fd.b(II)[B")
    public byte[] method2891(int arg0) {
        if (this.field2588.length == 1) {
            return this.method2879(0, arg0);
        } else if (this.field2588[arg0].length == 1) {
            return this.method2879(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fd.f(II)V")
    public void method2910(int arg0) {
    }

    @ObfuscatedName("fd.i(II)[I")
    public int[] method2882(int arg0) {
        return this.field2589[arg0];
    }

    @ObfuscatedName("fd.w(II)I")
    public int method2883(int arg0) {
        return this.field2588[arg0].length;
    }

    @ObfuscatedName("fd.l(B)I")
    public int method2884() {
        return this.field2588.length;
    }

    @ObfuscatedName("fd.j(II)V")
    public void method2878(int arg0) {
        for (int var2 = 0; var2 < this.field2588[arg0].length; var2++) {
            this.field2588[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fd.s(I)V")
    public void method2875() {
        for (int var1 = 0; var1 < this.field2588.length; var1++) {
            if (this.field2588[var1] != null) {
                for (int var2 = 0; var2 < this.field2588[var1].length; var2++) {
                    this.field2588[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fd.r(I[IB)Z")
    public boolean method2872(int arg0, int[] arg1) {
        if (this.field2592[arg0] == null) {
            return false;
        }
        int var3 = this.field2584[arg0];
        int[] var4 = this.field2589[arg0];
        Object[] var5 = this.field2588[arg0];
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
            var8 = class117.method79(this.field2592[arg0], true);
            class111 var9 = new class111(var8);
            var9.method2179(arg1, 5, var9.field1897.length);
        } else {
            var8 = class117.method79(this.field2592[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1993(var8);
        } catch (RuntimeException var27) {
            throw class140.method2535(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class111.method1988(var8, var8.length) + "," + class111.method1988(var8, var8.length - 2) + "," + this.field2598[arg0] + "," + this.field2591);
        }
        if (this.field2585) {
            this.field2592[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class111 var15 = new class111(var10);
            int[] var16 = new int[var3];
            var15.field1902 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2165();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1902 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2165();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2578) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class117.method1800(var20[var26], false);
                }
            }
        } else if (this.field2578) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class117.method1800(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fd.h(Ljava/lang/String;I)I")
    public int method2888(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2581.method3324(class154.method103(var2));
    }

    @ObfuscatedName("fd.x(ILjava/lang/String;I)I")
    public int method2889(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2587[arg0].method3324(class154.method103(var3));
    }

    @ObfuscatedName("fd.m(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2890(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2581.method3324(class154.method103(var3));
        int var6 = this.field2587[var5].method3324(class154.method103(var4));
        return this.method2874(var5, var6);
    }

    @ObfuscatedName("fd.a(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2919(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2581.method3324(class154.method103(var3));
        int var6 = this.field2587[var5].method3324(class154.method103(var4));
        return this.method2876(var5, var6);
    }

    @ObfuscatedName("fd.p(Ljava/lang/String;S)Z")
    public boolean method2892(String arg0) {
        int var2 = this.method2888("");
        return var2 == -1 ? this.method2919(arg0, "") : this.method2919("", arg0);
    }

    @ObfuscatedName("fd.c(Ljava/lang/String;I)V")
    public void method2901(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2581.method3324(class154.method103(var2));
        if (var3 >= 0) {
            this.method2909(var3);
        }
    }

    @ObfuscatedName("ci.u([BI)[B")
    public static final byte[] method1993(byte[] arg0) {
        class111 var1 = new class111(arg0);
        int var2 = var1.method2205();
        int var3 = var1.method2165();
        if (var3 < 0 || !(field2594 == 0 || var3 <= field2594)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2171(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2165();
            if (var5 < 0 || field2594 != 0 && var5 > field2594) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class109.method2107(var6, var5, arg0, var3, 9);
            } else {
                field2590.method2101(var1, var6);
            }
            return var6;
        }
    }
}
