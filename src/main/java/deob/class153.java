package deob;

@ObfuscatedName("ew")
public abstract class class153 {

    @ObfuscatedName("ew.j")
    public int field2529;

    @ObfuscatedName("ew.f")
    public int[] field2509;

    @ObfuscatedName("ew.o")
    public int[] field2510;

    @ObfuscatedName("ew.h")
    public class169 field2512;

    @ObfuscatedName("ew.u")
    public int[] field2511;

    @ObfuscatedName("ew.a")
    public int[] field2526;

    @ObfuscatedName("ew.q")
    public int[] field2514;

    @ObfuscatedName("ew.t")
    public int[][] field2515;

    @ObfuscatedName("ew.n")
    public int[][] field2516;

    @ObfuscatedName("ew.i")
    public class169[] field2524;

    @ObfuscatedName("ew.c")
    public Object[] field2508;

    @ObfuscatedName("ew.b")
    public Object[][] field2519;

    @ObfuscatedName("ew.m")
    public static class122 field2518 = new class122();

    @ObfuscatedName("ew.g")
    public int field2521;

    @ObfuscatedName("ew.x")
    public boolean field2522;

    @ObfuscatedName("ew.r")
    public boolean field2523;

    @ObfuscatedName("ew.s")
    public static int field2517 = 0;

    public class153(boolean arg0, boolean arg1) {
        this.field2522 = arg0;
        this.field2523 = arg1;
    }

    @ObfuscatedName("ew.j([BI)V")
    public void method3025(byte[] arg0) {
        this.field2521 = class127.method6(arg0, arg0.length);
        class127 var2 = new class127(method1421(arg0));
        int var3 = var2.method2464();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2508();
        }
        int var4 = var2.method2464();
        if (var3 >= 7) {
            this.field2529 = var2.method2478();
        } else {
            this.field2529 = var2.method2582();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2509 = new int[this.field2529];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2529; var7++) {
                this.field2509[var7] = var5 += var2.method2478();
                if (this.field2509[var7] > var6) {
                    var6 = this.field2509[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2529; var8++) {
                this.field2509[var8] = var5 += var2.method2582();
                if (this.field2509[var8] > var6) {
                    var6 = this.field2509[var8];
                }
            }
        }
        this.field2511 = new int[var6 + 1];
        this.field2526 = new int[var6 + 1];
        this.field2514 = new int[var6 + 1];
        this.field2515 = new int[var6 + 1][];
        this.field2508 = new Object[var6 + 1];
        this.field2519 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2510 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2529; var9++) {
                this.field2510[this.field2509[var9]] = var2.method2508();
            }
            this.field2512 = new class169(this.field2510);
        }
        for (int var10 = 0; var10 < this.field2529; var10++) {
            this.field2511[this.field2509[var10]] = var2.method2508();
        }
        for (int var11 = 0; var11 < this.field2529; var11++) {
            this.field2526[this.field2509[var11]] = var2.method2508();
        }
        for (int var12 = 0; var12 < this.field2529; var12++) {
            this.field2514[this.field2509[var12]] = var2.method2582();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2529; var13++) {
                int var14 = this.field2509[var13];
                int var15 = this.field2514[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2515[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2515[var14][var18] = var16 += var2.method2478();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2519[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2529; var20++) {
                int var21 = this.field2509[var20];
                int var22 = this.field2514[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2515[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2515[var21][var25] = var23 += var2.method2582();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2519[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2516 = new int[var6 + 1][];
        this.field2524 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2529; var27++) {
            int var28 = this.field2509[var27];
            int var29 = this.field2514[var28];
            this.field2516[var28] = new int[this.field2519[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2516[var28][this.field2515[var28][var30]] = var2.method2508();
            }
            this.field2524[var28] = new class169(this.field2516[var28]);
        }
    }

    @ObfuscatedName("ew.f(IB)V")
    public void method3026(int arg0) {
    }

    @ObfuscatedName("ew.o(IIB)[B")
    public byte[] method3027(int arg0, int arg1) {
        return this.method3028(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ew.h(II[IB)[B")
    public byte[] method3028(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2519.length || this.field2519[arg0] == null || arg1 < 0 || arg1 >= this.field2519[arg0].length) {
            return null;
        }
        if (this.field2519[arg0][arg1] == null) {
            boolean var4 = this.method3041(arg0, arg2);
            if (!var4) {
                this.method3068(arg0);
                boolean var5 = this.method3041(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method558(this.field2519[arg0][arg1], false);
        if (this.field2523) {
            this.field2519[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ew.u(IIB)Z")
    public boolean method3083(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2519.length || this.field2519[arg0] == null || arg1 < 0 || arg1 >= this.field2519[arg0].length) {
            return false;
        } else if (this.field2519[arg0][arg1] != null) {
            return true;
        } else if (this.field2508[arg0] == null) {
            this.method3068(arg0);
            return this.field2508[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ew.a(II)Z")
    public boolean method3030(int arg0) {
        if (this.field2508[arg0] == null) {
            this.method3068(arg0);
            return this.field2508[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ew.q(B)Z")
    public boolean method3031() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2509.length; var2++) {
            int var3 = this.field2509[var2];
            if (this.field2508[var3] == null) {
                this.method3068(var3);
                if (this.field2508[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ew.t(II)[B")
    public byte[] method3032(int arg0) {
        if (this.field2519.length == 1) {
            return this.method3027(0, arg0);
        } else if (this.field2519[arg0].length == 1) {
            return this.method3027(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ew.n(III)[B")
    public byte[] method3084(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2519.length || this.field2519[arg0] == null || arg1 < 0 || arg1 >= this.field2519[arg0].length) {
            return null;
        }
        if (this.field2519[arg0][arg1] == null) {
            boolean var3 = this.method3041(arg0, (int[]) null);
            if (!var3) {
                this.method3068(arg0);
                boolean var4 = this.method3041(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method558(this.field2519[arg0][arg1], false);
    }

    @ObfuscatedName("ew.i(II)[B")
    public byte[] method3034(int arg0) {
        if (this.field2519.length == 1) {
            return this.method3084(0, arg0);
        } else if (this.field2519[arg0].length == 1) {
            return this.method3084(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ew.c(II)V")
    public void method3068(int arg0) {
    }

    @ObfuscatedName("ew.b(II)[I")
    public int[] method3036(int arg0) {
        return this.field2515[arg0];
    }

    @ObfuscatedName("ew.m(II)I")
    public int method3037(int arg0) {
        return this.field2519[arg0].length;
    }

    @ObfuscatedName("ew.g(B)I")
    public int method3081() {
        return this.field2519.length;
    }

    @ObfuscatedName("ew.x(IB)V")
    public void method3093(int arg0) {
        for (int var2 = 0; var2 < this.field2519[arg0].length; var2++) {
            this.field2519[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ew.r(B)V")
    public void method3040() {
        for (int var1 = 0; var1 < this.field2519.length; var1++) {
            if (this.field2519[var1] != null) {
                for (int var2 = 0; var2 < this.field2519[var1].length; var2++) {
                    this.field2519[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ew.s(I[II)Z")
    public boolean method3041(int arg0, int[] arg1) {
        if (this.field2508[arg0] == null) {
            return false;
        }
        int var3 = this.field2514[arg0];
        int[] var4 = this.field2515[arg0];
        Object[] var5 = this.field2519[arg0];
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
            var8 = class119.method558(this.field2508[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2481(arg1, 5, var9.field2037.length);
        } else {
            var8 = class119.method558(this.field2508[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1421(var8);
        } catch (RuntimeException var31) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class127.method6(var8, var8.length) + ",";
            int var14 = var8.length - 2;
            int var15 = class127.method820(var8, 0, var14);
            throw class80.method1485(var31, var13 + var15 + "," + this.field2511[arg0] + "," + this.field2521);
        }
        if (this.field2522) {
            this.field2508[arg0] = null;
        }
        if (var3 > 1) {
            int var16 = var10.length;
            int var32 = var16 - 1;
            int var17 = var10[var32] & 0xFF;
            int var18 = var32 - var3 * var17 * 4;
            class127 var19 = new class127(var10);
            int[] var20 = new int[var3];
            var19.field2035 = var18;
            for (int var21 = 0; var21 < var17; var21++) {
                int var22 = 0;
                for (int var23 = 0; var23 < var3; var23++) {
                    var22 += var19.method2508();
                    var20[var23] += var22;
                }
            }
            byte[][] var24 = new byte[var3][];
            for (int var25 = 0; var25 < var3; var25++) {
                var24[var25] = new byte[var20[var25]];
                var20[var25] = 0;
            }
            var19.field2035 = var18;
            int var26 = 0;
            for (int var27 = 0; var27 < var17; var27++) {
                int var28 = 0;
                for (int var29 = 0; var29 < var3; var29++) {
                    var28 += var19.method2508();
                    System.arraycopy(var10, var26, var24[var29], var20[var29], var28);
                    var20[var29] += var28;
                    var26 += var28;
                }
            }
            for (int var30 = 0; var30 < var3; var30++) {
                if (this.field2523) {
                    var5[var4[var30]] = var24[var30];
                } else {
                    var5[var4[var30]] = class119.method1665(var24[var30], false);
                }
            }
        } else if (this.field2523) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method1665(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ew.l(Ljava/lang/String;B)I")
    public int method3074(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2512.method3253(class148.method2396(var2));
    }

    @ObfuscatedName("ew.k(ILjava/lang/String;B)I")
    public int method3038(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2524[arg0].method3253(class148.method2396(var3));
    }

    @ObfuscatedName("ew.w(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3044(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2512.method3253(class148.method2396(var3));
        int var6 = this.field2524[var5].method3253(class148.method2396(var4));
        return this.method3027(var5, var6);
    }

    @ObfuscatedName("ew.z(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3029(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2512.method3253(class148.method2396(var3));
        int var6 = this.field2524[var5].method3253(class148.method2396(var4));
        return this.method3083(var5, var6);
    }

    @ObfuscatedName("ew.p(Ljava/lang/String;I)V")
    public void method3045(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2512.method3253(class148.method2396(var2));
        if (var3 >= 0) {
            this.method3026(var3);
        }
    }

    @ObfuscatedName("bj.v([BI)[B")
    public static final byte[] method1421(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2464();
        int var3 = var1.method2508();
        if (var3 < 0 || !(field2517 == 0 || var3 <= field2517)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2475(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2508();
            if (var5 < 0 || field2517 != 0 && var5 > field2517) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2411(var6, var5, arg0, var3, 9);
            } else {
                field2518.method2399(var1, var6);
            }
            return var6;
        }
    }
}
