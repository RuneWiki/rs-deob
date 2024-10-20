package deob;

@ObfuscatedName("fs")
public abstract class class158 {

    @ObfuscatedName("fs.n")
    public int field2574;

    @ObfuscatedName("fs.d")
    public int[] field2583;

    @ObfuscatedName("fs.z")
    public int[] field2564;

    @ObfuscatedName("fs.y")
    public class183 field2569;

    @ObfuscatedName("fs.e")
    public int[] field2582;

    @ObfuscatedName("fs.g")
    public int[] field2567;

    @ObfuscatedName("fs.f")
    public int[] field2568;

    @ObfuscatedName("fs.m")
    public int[][] field2573;

    @ObfuscatedName("fs.a")
    public int[][] field2576;

    @ObfuscatedName("fs.h")
    public class183[] field2571;

    @ObfuscatedName("fs.l")
    public Object[] field2572;

    @ObfuscatedName("fs.u")
    public Object[][] field2562;

    @ObfuscatedName("fs.q")
    public static class108 field2577 = new class108();

    @ObfuscatedName("fs.k")
    public int field2575;

    @ObfuscatedName("fs.x")
    public boolean field2566;

    @ObfuscatedName("fs.r")
    public boolean field2570;

    @ObfuscatedName("fs.j")
    public static int field2578 = 0;

    public class158(boolean arg0, boolean arg1) {
        this.field2566 = arg0;
        this.field2570 = arg1;
    }

    @ObfuscatedName("fs.n([BS)V")
    public void method2946(byte[] arg0) {
        this.field2575 = class111.method1863(arg0, arg0.length);
        class111 var2 = new class111(method112(arg0));
        int var3 = var2.method2228();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2233();
        }
        int var4 = var2.method2228();
        if (var3 >= 7) {
            this.field2574 = var2.method2272();
        } else {
            this.field2574 = var2.method2231();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2583 = new int[this.field2574];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2574; var7++) {
                this.field2583[var7] = var5 += var2.method2272();
                if (this.field2583[var7] > var6) {
                    var6 = this.field2583[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2574; var8++) {
                this.field2583[var8] = var5 += var2.method2231();
                if (this.field2583[var8] > var6) {
                    var6 = this.field2583[var8];
                }
            }
        }
        this.field2582 = new int[var6 + 1];
        this.field2567 = new int[var6 + 1];
        this.field2568 = new int[var6 + 1];
        this.field2573 = new int[var6 + 1][];
        this.field2572 = new Object[var6 + 1];
        this.field2562 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2564 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2574; var9++) {
                this.field2564[this.field2583[var9]] = var2.method2233();
            }
            this.field2569 = new class183(this.field2564);
        }
        for (int var10 = 0; var10 < this.field2574; var10++) {
            this.field2582[this.field2583[var10]] = var2.method2233();
        }
        for (int var11 = 0; var11 < this.field2574; var11++) {
            this.field2567[this.field2583[var11]] = var2.method2233();
        }
        for (int var12 = 0; var12 < this.field2574; var12++) {
            this.field2568[this.field2583[var12]] = var2.method2231();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2574; var13++) {
                int var14 = this.field2583[var13];
                int var15 = this.field2568[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2573[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2573[var14][var18] = var16 += var2.method2272();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2562[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2574; var20++) {
                int var21 = this.field2583[var20];
                int var22 = this.field2568[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2573[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2573[var21][var25] = var23 += var2.method2231();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2562[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2576 = new int[var6 + 1][];
        this.field2571 = new class183[var6 + 1];
        for (int var27 = 0; var27 < this.field2574; var27++) {
            int var28 = this.field2583[var27];
            int var29 = this.field2568[var28];
            this.field2576[var28] = new int[this.field2562[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2576[var28][this.field2573[var28][var30]] = var2.method2233();
            }
            this.field2571[var28] = new class183(this.field2576[var28]);
        }
    }

    @ObfuscatedName("fs.d(IB)V")
    public void method2947(int arg0) {
    }

    @ObfuscatedName("fs.z(III)[B")
    public byte[] method2948(int arg0, int arg1) {
        return this.method2951(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fs.y(II[II)[B")
    public byte[] method2951(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2562.length || this.field2562[arg0] == null || arg1 < 0 || arg1 >= this.field2562[arg0].length) {
            return null;
        }
        if (this.field2562[arg0][arg1] == null) {
            boolean var4 = this.method2962(arg0, arg2);
            if (!var4) {
                this.method3000(arg0);
                boolean var5 = this.method2962(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class117.method1(this.field2562[arg0][arg1], false);
        if (this.field2570) {
            this.field2562[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fs.e(III)Z")
    public boolean method2950(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2562.length || this.field2562[arg0] == null || arg1 < 0 || arg1 >= this.field2562[arg0].length) {
            return false;
        } else if (this.field2562[arg0][arg1] != null) {
            return true;
        } else if (this.field2572[arg0] == null) {
            this.method3000(arg0);
            return this.field2572[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fs.g(IB)Z")
    public boolean method3024(int arg0) {
        if (this.field2572[arg0] == null) {
            this.method3000(arg0);
            return this.field2572[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fs.f(I)Z")
    public boolean method2952() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2583.length; var2++) {
            int var3 = this.field2583[var2];
            if (this.field2572[var3] == null) {
                this.method3000(var3);
                if (this.field2572[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fs.m(IS)[B")
    public byte[] method2953(int arg0) {
        if (this.field2562.length == 1) {
            return this.method2948(0, arg0);
        } else if (this.field2562[arg0].length == 1) {
            return this.method2948(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fs.a(III)[B")
    public byte[] method3013(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2562.length || this.field2562[arg0] == null || arg1 < 0 || arg1 >= this.field2562[arg0].length) {
            return null;
        }
        if (this.field2562[arg0][arg1] == null) {
            boolean var3 = this.method2962(arg0, (int[]) null);
            if (!var3) {
                this.method3000(arg0);
                boolean var4 = this.method2962(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class117.method1(this.field2562[arg0][arg1], false);
    }

    @ObfuscatedName("fs.h(II)[B")
    public byte[] method3021(int arg0) {
        if (this.field2562.length == 1) {
            return this.method3013(0, arg0);
        } else if (this.field2562[arg0].length == 1) {
            return this.method3013(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fs.l(II)V")
    public void method3000(int arg0) {
    }

    @ObfuscatedName("fs.u(II)[I")
    public int[] method2959(int arg0) {
        return this.field2573[arg0];
    }

    @ObfuscatedName("fs.q(II)I")
    public int method2978(int arg0) {
        return this.field2562[arg0].length;
    }

    @ObfuscatedName("fs.k(S)I")
    public int method2992() {
        return this.field2562.length;
    }

    @ObfuscatedName("fs.x(II)V")
    public void method2949(int arg0) {
        for (int var2 = 0; var2 < this.field2562[arg0].length; var2++) {
            this.field2562[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fs.r(I)V")
    public void method2961() {
        for (int var1 = 0; var1 < this.field2562.length; var1++) {
            if (this.field2562[var1] != null) {
                for (int var2 = 0; var2 < this.field2562[var1].length; var2++) {
                    this.field2562[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fs.j(I[II)Z")
    public boolean method2962(int arg0, int[] arg1) {
        if (this.field2572[arg0] == null) {
            return false;
        }
        int var3 = this.field2568[arg0];
        int[] var4 = this.field2573[arg0];
        Object[] var5 = this.field2562[arg0];
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
            var8 = class117.method1(this.field2572[arg0], true);
            class111 var9 = new class111(var8);
            var9.method2327(arg1, 5, var9.field1888.length);
        } else {
            var8 = class117.method1(this.field2572[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method112(var8);
        } catch (RuntimeException var27) {
            throw class140.method2683(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class111.method1863(var8, var8.length) + "," + class111.method1863(var8, var8.length - 2) + "," + this.field2582[arg0] + "," + this.field2575);
        }
        if (this.field2566) {
            this.field2572[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class111 var15 = new class111(var10);
            int[] var16 = new int[var3];
            var15.field1889 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2233();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1889 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2233();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2570) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class117.method104(var20[var26], false);
                }
            }
        } else if (this.field2570) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class117.method104(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fs.s(Ljava/lang/String;B)I")
    public int method2963(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2569.method3406(class154.method886(var2));
    }

    @ObfuscatedName("fs.v(ILjava/lang/String;B)I")
    public int method2964(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2571[arg0].method3406(class154.method886(var3));
    }

    @ObfuscatedName("fs.c(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2982(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2569.method3406(class154.method886(var3));
        int var6 = this.field2571[var5].method3406(class154.method886(var4));
        return this.method2948(var5, var6);
    }

    @ObfuscatedName("fs.p(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2966(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2569.method3406(class154.method886(var3));
        int var6 = this.field2571[var5].method3406(class154.method886(var4));
        return this.method2950(var5, var6);
    }

    @ObfuscatedName("fs.o(Ljava/lang/String;I)Z")
    public boolean method2967(String arg0) {
        int var2 = this.method2963("");
        return var2 == -1 ? this.method2966(arg0, "") : this.method2966("", arg0);
    }

    @ObfuscatedName("fs.b(Ljava/lang/String;B)V")
    public void method2968(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2569.method3406(class154.method886(var2));
        if (var3 >= 0) {
            this.method2947(var3);
        }
    }

    @ObfuscatedName("h.t([BI)[B")
    public static final byte[] method112(byte[] arg0) {
        class111 var1 = new class111(arg0);
        int var2 = var1.method2228();
        int var3 = var1.method2233();
        if (var3 < 0 || !(field2578 == 0 || var3 <= field2578)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2224(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2233();
            if (var5 < 0 || field2578 != 0 && var5 > field2578) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class109.method2178(var6, var5, arg0, var3, 9);
            } else {
                field2577.method2170(var1, var6);
            }
            return var6;
        }
    }
}
