package deob;

@ObfuscatedName("ev")
public abstract class class152 {

    @ObfuscatedName("ev.a")
    public int field2506;

    @ObfuscatedName("ev.r")
    public int[] field2496;

    @ObfuscatedName("ev.u")
    public int[] field2495;

    @ObfuscatedName("ev.t")
    public class169 field2512;

    @ObfuscatedName("ev.k")
    public int[] field2499;

    @ObfuscatedName("ev.x")
    public int[] field2503;

    @ObfuscatedName("ev.v")
    public int[] field2501;

    @ObfuscatedName("ev.g")
    public int[][] field2507;

    @ObfuscatedName("ev.n")
    public int[][] field2498;

    @ObfuscatedName("ev.q")
    public class169[] field2497;

    @ObfuscatedName("ev.i")
    public Object[] field2505;

    @ObfuscatedName("ev.p")
    public Object[][] field2502;

    @ObfuscatedName("ev.e")
    public static class122 field2504 = new class122();

    @ObfuscatedName("ev.o")
    public int field2508;

    @ObfuscatedName("ev.j")
    public boolean field2509;

    @ObfuscatedName("ev.s")
    public boolean field2510;

    @ObfuscatedName("ev.b")
    public static int field2511 = 0;

    public class152(boolean arg0, boolean arg1) {
        this.field2509 = arg0;
        this.field2510 = arg1;
    }

    @ObfuscatedName("ev.a([BI)V")
    public void method2941(byte[] arg0) {
        this.field2508 = class126.method148(arg0, arg0.length);
        class126 var2 = new class126(method759(arg0));
        int var3 = var2.method2481();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2383();
        }
        int var4 = var2.method2481();
        if (var3 >= 7) {
            this.field2506 = var2.method2392();
        } else {
            this.field2506 = var2.method2373();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2496 = new int[this.field2506];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2506; var7++) {
                this.field2496[var7] = var5 += var2.method2392();
                if (this.field2496[var7] > var6) {
                    var6 = this.field2496[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2506; var8++) {
                this.field2496[var8] = var5 += var2.method2373();
                if (this.field2496[var8] > var6) {
                    var6 = this.field2496[var8];
                }
            }
        }
        this.field2499 = new int[var6 + 1];
        this.field2503 = new int[var6 + 1];
        this.field2501 = new int[var6 + 1];
        this.field2507 = new int[var6 + 1][];
        this.field2505 = new Object[var6 + 1];
        this.field2502 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2495 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2506; var9++) {
                this.field2495[this.field2496[var9]] = var2.method2383();
            }
            this.field2512 = new class169(this.field2495);
        }
        for (int var10 = 0; var10 < this.field2506; var10++) {
            this.field2499[this.field2496[var10]] = var2.method2383();
        }
        for (int var11 = 0; var11 < this.field2506; var11++) {
            this.field2503[this.field2496[var11]] = var2.method2383();
        }
        for (int var12 = 0; var12 < this.field2506; var12++) {
            this.field2501[this.field2496[var12]] = var2.method2373();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2506; var13++) {
                int var14 = this.field2496[var13];
                int var15 = this.field2501[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2507[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2507[var14][var18] = var16 += var2.method2392();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2502[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2506; var20++) {
                int var21 = this.field2496[var20];
                int var22 = this.field2501[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2507[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2507[var21][var25] = var23 += var2.method2373();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2502[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2498 = new int[var6 + 1][];
        this.field2497 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2506; var27++) {
            int var28 = this.field2496[var27];
            int var29 = this.field2501[var28];
            this.field2498[var28] = new int[this.field2502[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2498[var28][this.field2507[var28][var30]] = var2.method2383();
            }
            this.field2497[var28] = new class169(this.field2498[var28]);
        }
    }

    @ObfuscatedName("ev.r(IB)V")
    public void method2942(int arg0) {
    }

    @ObfuscatedName("ev.u(III)[B")
    public byte[] method2943(int arg0, int arg1) {
        return this.method2951(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ev.t(II[IB)[B")
    public byte[] method2951(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2502.length || this.field2502[arg0] == null || arg1 < 0 || arg1 >= this.field2502[arg0].length) {
            return null;
        }
        if (this.field2502[arg0][arg1] == null) {
            boolean var4 = this.method2957(arg0, arg2);
            if (!var4) {
                this.method2977(arg0);
                boolean var5 = this.method2957(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method50(this.field2502[arg0][arg1], false);
        if (this.field2510) {
            this.field2502[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ev.k(III)Z")
    public boolean method2945(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2502.length || this.field2502[arg0] == null || arg1 < 0 || arg1 >= this.field2502[arg0].length) {
            return false;
        } else if (this.field2502[arg0][arg1] != null) {
            return true;
        } else if (this.field2505[arg0] == null) {
            this.method2977(arg0);
            return this.field2505[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ev.x(IB)Z")
    public boolean method2983(int arg0) {
        if (this.field2505[arg0] == null) {
            this.method2977(arg0);
            return this.field2505[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ev.v(I)Z")
    public boolean method2947() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2496.length; var2++) {
            int var3 = this.field2496[var2];
            if (this.field2505[var3] == null) {
                this.method2977(var3);
                if (this.field2505[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ev.g(II)[B")
    public byte[] method2948(int arg0) {
        if (this.field2502.length == 1) {
            return this.method2943(0, arg0);
        } else if (this.field2502[arg0].length == 1) {
            return this.method2943(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ev.n(IIB)[B")
    public byte[] method2949(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2502.length || this.field2502[arg0] == null || arg1 < 0 || arg1 >= this.field2502[arg0].length) {
            return null;
        }
        if (this.field2502[arg0][arg1] == null) {
            boolean var3 = this.method2957(arg0, (int[]) null);
            if (!var3) {
                this.method2977(arg0);
                boolean var4 = this.method2957(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method50(this.field2502[arg0][arg1], false);
    }

    @ObfuscatedName("ev.q(IB)[B")
    public byte[] method2950(int arg0) {
        if (this.field2502.length == 1) {
            return this.method2949(0, arg0);
        } else if (this.field2502[arg0].length == 1) {
            return this.method2949(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ev.i(IB)V")
    public void method2977(int arg0) {
    }

    @ObfuscatedName("ev.p(II)[I")
    public int[] method2960(int arg0) {
        return this.field2507[arg0];
    }

    @ObfuscatedName("ev.e(II)I")
    public int method2962(int arg0) {
        return this.field2502[arg0].length;
    }

    @ObfuscatedName("ev.o(I)I")
    public int method2954() {
        return this.field2502.length;
    }

    @ObfuscatedName("ev.j(II)V")
    public void method2959(int arg0) {
        for (int var2 = 0; var2 < this.field2502[arg0].length; var2++) {
            this.field2502[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ev.s(S)V")
    public void method2980() {
        for (int var1 = 0; var1 < this.field2502.length; var1++) {
            if (this.field2502[var1] != null) {
                for (int var2 = 0; var2 < this.field2502[var1].length; var2++) {
                    this.field2502[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ev.b(I[IB)Z")
    public boolean method2957(int arg0, int[] arg1) {
        if (this.field2505[arg0] == null) {
            return false;
        }
        int var3 = this.field2501[arg0];
        int[] var4 = this.field2507[arg0];
        Object[] var5 = this.field2502[arg0];
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
            var8 = class119.method50(this.field2505[arg0], true);
            class126 var9 = new class126(var8);
            var9.method2395(arg1, 5, var9.field2015.length);
        } else {
            var8 = class119.method50(this.field2505[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method759(var8);
        } catch (RuntimeException var27) {
            throw class80.method183(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class126.method148(var8, var8.length) + "," + class126.method148(var8, var8.length - 2) + "," + this.field2499[arg0] + "," + this.field2508);
        }
        if (this.field2509) {
            this.field2505[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class126 var15 = new class126(var10);
            int[] var16 = new int[var3];
            var15.field2016 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2383();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2016 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2383();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2510) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class119.method2294(var20[var26], false);
                }
            }
        } else if (this.field2510) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method2294(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ev.c(Ljava/lang/String;B)I")
    public int method2958(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2512.method3206(class147.method1512(var2));
    }

    @ObfuscatedName("ev.m(ILjava/lang/String;I)I")
    public int method3006(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2497[arg0].method3206(class147.method1512(var3));
    }

    @ObfuscatedName("ev.z(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2973(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2512.method3206(class147.method1512(var3));
        int var6 = this.field2497[var5].method3206(class147.method1512(var4));
        return this.method2943(var5, var6);
    }

    @ObfuscatedName("ev.h(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2961(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2512.method3206(class147.method1512(var3));
        int var6 = this.field2497[var5].method3206(class147.method1512(var4));
        return this.method2945(var5, var6);
    }

    @ObfuscatedName("ev.f(Ljava/lang/String;B)V")
    public void method2940(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2512.method3206(class147.method1512(var2));
        if (var3 >= 0) {
            this.method2942(var3);
        }
    }

    @ObfuscatedName("ak.w([BI)[B")
    public static final byte[] method759(byte[] arg0) {
        class126 var1 = new class126(arg0);
        int var2 = var1.method2481();
        int var3 = var1.method2383();
        if (var3 < 0 || !(field2511 == 0 || var3 <= field2511)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2575(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2383();
            if (var5 < 0 || field2511 != 0 && var5 > field2511) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2329(var6, var5, arg0, var3, 9);
            } else {
                field2504.method2324(var1, var6);
            }
            return var6;
        }
    }
}
