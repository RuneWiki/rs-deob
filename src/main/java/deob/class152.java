package deob;

@ObfuscatedName("eb")
public abstract class class152 {

    @ObfuscatedName("eb.a")
    public int field2513;

    @ObfuscatedName("eb.x")
    public int[] field2497;

    @ObfuscatedName("eb.e")
    public int[] field2498;

    @ObfuscatedName("eb.r")
    public class169 field2506;

    @ObfuscatedName("eb.p")
    public int[] field2501;

    @ObfuscatedName("eb.n")
    public int[] field2499;

    @ObfuscatedName("eb.o")
    public int[] field2502;

    @ObfuscatedName("eb.l")
    public int[][] field2503;

    @ObfuscatedName("eb.t")
    public int[][] field2504;

    @ObfuscatedName("eb.q")
    public class169[] field2505;

    @ObfuscatedName("eb.c")
    public Object[] field2500;

    @ObfuscatedName("eb.z")
    public Object[][] field2496;

    @ObfuscatedName("eb.s")
    public static class122 field2508 = new class122();

    @ObfuscatedName("eb.h")
    public int field2507;

    @ObfuscatedName("eb.f")
    public boolean field2510;

    @ObfuscatedName("eb.w")
    public boolean field2511;

    @ObfuscatedName("eb.d")
    public static int field2512 = 0;

    public class152(boolean arg0, boolean arg1) {
        this.field2510 = arg0;
        this.field2511 = arg1;
    }

    @ObfuscatedName("eb.a([BI)V")
    public void method2999(byte[] arg0) {
        this.field2507 = class127.method547(arg0, arg0.length);
        class127 var2 = new class127(method654(arg0));
        int var3 = var2.method2411();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2416();
        }
        int var4 = var2.method2411();
        if (var3 >= 7) {
            this.field2513 = var2.method2425();
        } else {
            this.field2513 = var2.method2413();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2497 = new int[this.field2513];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2513; var7++) {
                this.field2497[var7] = var5 += var2.method2425();
                if (this.field2497[var7] > var6) {
                    var6 = this.field2497[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2513; var8++) {
                this.field2497[var8] = var5 += var2.method2413();
                if (this.field2497[var8] > var6) {
                    var6 = this.field2497[var8];
                }
            }
        }
        this.field2501 = new int[var6 + 1];
        this.field2499 = new int[var6 + 1];
        this.field2502 = new int[var6 + 1];
        this.field2503 = new int[var6 + 1][];
        this.field2500 = new Object[var6 + 1];
        this.field2496 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2498 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2513; var9++) {
                this.field2498[this.field2497[var9]] = var2.method2416();
            }
            this.field2506 = new class169(this.field2498);
        }
        for (int var10 = 0; var10 < this.field2513; var10++) {
            this.field2501[this.field2497[var10]] = var2.method2416();
        }
        for (int var11 = 0; var11 < this.field2513; var11++) {
            this.field2499[this.field2497[var11]] = var2.method2416();
        }
        for (int var12 = 0; var12 < this.field2513; var12++) {
            this.field2502[this.field2497[var12]] = var2.method2413();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2513; var13++) {
                int var14 = this.field2497[var13];
                int var15 = this.field2502[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2503[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2503[var14][var18] = var16 += var2.method2425();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2496[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2513; var20++) {
                int var21 = this.field2497[var20];
                int var22 = this.field2502[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2503[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2503[var21][var25] = var23 += var2.method2413();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2496[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2504 = new int[var6 + 1][];
        this.field2505 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2513; var27++) {
            int var28 = this.field2497[var27];
            int var29 = this.field2502[var28];
            this.field2504[var28] = new int[this.field2496[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2504[var28][this.field2503[var28][var30]] = var2.method2416();
            }
            this.field2505[var28] = new class169(this.field2504[var28]);
        }
    }

    @ObfuscatedName("eb.x(II)V")
    public void method2936(int arg0) {
    }

    @ObfuscatedName("eb.e(IIB)[B")
    public byte[] method2961(int arg0, int arg1) {
        return this.method2938(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eb.r(II[II)[B")
    public byte[] method2938(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2496.length || this.field2496[arg0] == null || arg1 < 0 || arg1 >= this.field2496[arg0].length) {
            return null;
        }
        if (this.field2496[arg0][arg1] == null) {
            boolean var4 = this.method2951(arg0, arg2);
            if (!var4) {
                this.method2945(arg0);
                boolean var5 = this.method2951(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method2262(this.field2496[arg0][arg1], false);
        if (this.field2511) {
            this.field2496[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eb.p(IIB)Z")
    public boolean method2939(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2496.length || this.field2496[arg0] == null || arg1 < 0 || arg1 >= this.field2496[arg0].length) {
            return false;
        } else if (this.field2496[arg0][arg1] != null) {
            return true;
        } else if (this.field2500[arg0] == null) {
            this.method2945(arg0);
            return this.field2500[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eb.n(II)Z")
    public boolean method2940(int arg0) {
        if (this.field2500[arg0] == null) {
            this.method2945(arg0);
            return this.field2500[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eb.o(I)Z")
    public boolean method2941() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2497.length; var2++) {
            int var3 = this.field2497[var2];
            if (this.field2500[var3] == null) {
                this.method2945(var3);
                if (this.field2500[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eb.l(II)[B")
    public byte[] method2934(int arg0) {
        if (this.field2496.length == 1) {
            return this.method2961(0, arg0);
        } else if (this.field2496[arg0].length == 1) {
            return this.method2961(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eb.t(IIB)[B")
    public byte[] method2976(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2496.length || this.field2496[arg0] == null || arg1 < 0 || arg1 >= this.field2496[arg0].length) {
            return null;
        }
        if (this.field2496[arg0][arg1] == null) {
            boolean var3 = this.method2951(arg0, (int[]) null);
            if (!var3) {
                this.method2945(arg0);
                boolean var4 = this.method2951(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method2262(this.field2496[arg0][arg1], false);
    }

    @ObfuscatedName("eb.q(II)[B")
    public byte[] method2944(int arg0) {
        if (this.field2496.length == 1) {
            return this.method2976(0, arg0);
        } else if (this.field2496[arg0].length == 1) {
            return this.method2976(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eb.c(II)V")
    public void method2945(int arg0) {
    }

    @ObfuscatedName("eb.z(II)[I")
    public int[] method2946(int arg0) {
        return this.field2503[arg0];
    }

    @ObfuscatedName("eb.s(IB)I")
    public int method2947(int arg0) {
        return this.field2496[arg0].length;
    }

    @ObfuscatedName("eb.h(B)I")
    public int method2948() {
        return this.field2496.length;
    }

    @ObfuscatedName("eb.f(II)V")
    public void method2949(int arg0) {
        for (int var2 = 0; var2 < this.field2496[arg0].length; var2++) {
            this.field2496[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eb.w(I)V")
    public void method2950() {
        for (int var1 = 0; var1 < this.field2496.length; var1++) {
            if (this.field2496[var1] != null) {
                for (int var2 = 0; var2 < this.field2496[var1].length; var2++) {
                    this.field2496[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eb.d(I[II)Z")
    public boolean method2951(int arg0, int[] arg1) {
        if (this.field2500[arg0] == null) {
            return false;
        }
        int var3 = this.field2502[arg0];
        int[] var4 = this.field2503[arg0];
        Object[] var5 = this.field2496[arg0];
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
            var8 = class119.method2262(this.field2500[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2441(arg1, 5, var9.field2036.length);
        } else {
            var8 = class119.method2262(this.field2500[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method654(var8);
        } catch (RuntimeException var27) {
            throw class80.method142(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class127.method547(var8, var8.length) + "," + class127.method547(var8, var8.length - 2) + "," + this.field2501[arg0] + "," + this.field2507);
        }
        if (this.field2510) {
            this.field2500[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class127 var15 = new class127(var10);
            int[] var16 = new int[var3];
            var15.field2035 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2416();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2035 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2416();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2511) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class119.method45(var20[var26], false);
                }
            }
        } else if (this.field2511) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method45(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eb.y(Ljava/lang/String;I)I")
    public int method3003(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2506.method3189(class147.method2643(var2));
    }

    @ObfuscatedName("eb.g(ILjava/lang/String;I)I")
    public int method2953(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2505[arg0].method3189(class147.method2643(var3));
    }

    @ObfuscatedName("eb.v(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2972(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2506.method3189(class147.method2643(var3));
        int var6 = this.field2505[var5].method3189(class147.method2643(var4));
        return this.method2961(var5, var6);
    }

    @ObfuscatedName("eb.b(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2955(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2506.method3189(class147.method2643(var3));
        int var6 = this.field2505[var5].method3189(class147.method2643(var4));
        return this.method2939(var5, var6);
    }

    @ObfuscatedName("eb.j(Ljava/lang/String;I)V")
    public void method2954(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2506.method3189(class147.method2643(var2));
        if (var3 >= 0) {
            this.method2936(var3);
        }
    }

    @ObfuscatedName("am.m([BI)[B")
    public static final byte[] method654(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2411();
        int var3 = var1.method2416();
        if (var3 < 0 || !(field2512 == 0 || var3 <= field2512)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2422(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2416();
            if (var5 < 0 || field2512 != 0 && var5 > field2512) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2350(var6, var5, arg0, var3, 9);
            } else {
                field2508.method2348(var1, var6);
            }
            return var6;
        }
    }
}
