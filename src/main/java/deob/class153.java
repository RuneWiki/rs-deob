package deob;

@ObfuscatedName("eu")
public abstract class class153 {

    @ObfuscatedName("eu.p")
    public int field2509;

    @ObfuscatedName("eu.e")
    public int[] field2512;

    @ObfuscatedName("eu.a")
    public int[] field2516;

    @ObfuscatedName("eu.h")
    public class169 field2511;

    @ObfuscatedName("eu.y")
    public int[] field2520;

    @ObfuscatedName("eu.j")
    public int[] field2513;

    @ObfuscatedName("eu.l")
    public int[] field2514;

    @ObfuscatedName("eu.f")
    public int[][] field2508;

    @ObfuscatedName("eu.n")
    public int[][] field2524;

    @ObfuscatedName("eu.k")
    public class169[] field2517;

    @ObfuscatedName("eu.q")
    public Object[] field2518;

    @ObfuscatedName("eu.w")
    public Object[][] field2519;

    @ObfuscatedName("eu.v")
    public static class122 field2521 = new class122();

    @ObfuscatedName("eu.z")
    public int field2515;

    @ObfuscatedName("eu.m")
    public boolean field2522;

    @ObfuscatedName("eu.r")
    public boolean field2523;

    @ObfuscatedName("eu.u")
    public static int field2510 = 0;

    public class153(boolean arg0, boolean arg1) {
        this.field2522 = arg0;
        this.field2523 = arg1;
    }

    @ObfuscatedName("eu.p([BB)V")
    public void method3077(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class127.method1887(arg0, 0, var2);
        this.field2515 = var3;
        class127 var4 = new class127(method3(arg0));
        int var5 = var4.method2494();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2617();
        }
        int var6 = var4.method2494();
        if (var5 >= 7) {
            this.field2509 = var4.method2508();
        } else {
            this.field2509 = var4.method2496();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2512 = new int[this.field2509];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2509; var9++) {
                this.field2512[var9] = var7 += var4.method2508();
                if (this.field2512[var9] > var8) {
                    var8 = this.field2512[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2509; var10++) {
                this.field2512[var10] = var7 += var4.method2496();
                if (this.field2512[var10] > var8) {
                    var8 = this.field2512[var10];
                }
            }
        }
        this.field2520 = new int[var8 + 1];
        this.field2513 = new int[var8 + 1];
        this.field2514 = new int[var8 + 1];
        this.field2508 = new int[var8 + 1][];
        this.field2518 = new Object[var8 + 1];
        this.field2519 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2516 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2509; var11++) {
                this.field2516[this.field2512[var11]] = var4.method2617();
            }
            this.field2511 = new class169(this.field2516);
        }
        for (int var12 = 0; var12 < this.field2509; var12++) {
            this.field2520[this.field2512[var12]] = var4.method2617();
        }
        for (int var13 = 0; var13 < this.field2509; var13++) {
            this.field2513[this.field2512[var13]] = var4.method2617();
        }
        for (int var14 = 0; var14 < this.field2509; var14++) {
            this.field2514[this.field2512[var14]] = var4.method2496();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2509; var15++) {
                int var16 = this.field2512[var15];
                int var17 = this.field2514[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2508[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2508[var16][var20] = var18 += var4.method2508();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2519[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2509; var22++) {
                int var23 = this.field2512[var22];
                int var24 = this.field2514[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2508[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2508[var23][var27] = var25 += var4.method2496();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2519[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2524 = new int[var8 + 1][];
        this.field2517 = new class169[var8 + 1];
        for (int var29 = 0; var29 < this.field2509; var29++) {
            int var30 = this.field2512[var29];
            int var31 = this.field2514[var30];
            this.field2524[var30] = new int[this.field2519[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2524[var30][this.field2508[var30][var32]] = var4.method2617();
            }
            this.field2517[var30] = new class169(this.field2524[var30]);
        }
    }

    @ObfuscatedName("eu.e(II)V")
    public void method3047(int arg0) {
    }

    @ObfuscatedName("eu.a(III)[B")
    public byte[] method3048(int arg0, int arg1) {
        return this.method3049(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eu.h(II[II)[B")
    public byte[] method3049(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2519.length || this.field2519[arg0] == null || arg1 < 0 || arg1 >= this.field2519[arg0].length) {
            return null;
        }
        if (this.field2519[arg0][arg1] == null) {
            boolean var4 = this.method3062(arg0, arg2);
            if (!var4) {
                this.method3056(arg0);
                boolean var5 = this.method3062(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method125(this.field2519[arg0][arg1], false);
        if (this.field2523) {
            this.field2519[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eu.y(III)Z")
    public boolean method3050(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2519.length || this.field2519[arg0] == null || arg1 < 0 || arg1 >= this.field2519[arg0].length) {
            return false;
        } else if (this.field2519[arg0][arg1] != null) {
            return true;
        } else if (this.field2518[arg0] == null) {
            this.method3056(arg0);
            return this.field2518[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eu.j(II)Z")
    public boolean method3046(int arg0) {
        if (this.field2518[arg0] == null) {
            this.method3056(arg0);
            return this.field2518[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eu.l(I)Z")
    public boolean method3113() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2512.length; var2++) {
            int var3 = this.field2512[var2];
            if (this.field2518[var3] == null) {
                this.method3056(var3);
                if (this.field2518[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eu.f(IB)[B")
    public byte[] method3053(int arg0) {
        if (this.field2519.length == 1) {
            return this.method3048(0, arg0);
        } else if (this.field2519[arg0].length == 1) {
            return this.method3048(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eu.n(III)[B")
    public byte[] method3054(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2519.length || this.field2519[arg0] == null || arg1 < 0 || arg1 >= this.field2519[arg0].length) {
            return null;
        }
        if (this.field2519[arg0][arg1] == null) {
            boolean var3 = this.method3062(arg0, (int[]) null);
            if (!var3) {
                this.method3056(arg0);
                boolean var4 = this.method3062(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method125(this.field2519[arg0][arg1], false);
    }

    @ObfuscatedName("eu.k(IB)[B")
    public byte[] method3055(int arg0) {
        if (this.field2519.length == 1) {
            return this.method3054(0, arg0);
        } else if (this.field2519[arg0].length == 1) {
            return this.method3054(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eu.q(II)V")
    public void method3056(int arg0) {
    }

    @ObfuscatedName("eu.w(II)[I")
    public int[] method3093(int arg0) {
        return this.field2508[arg0];
    }

    @ObfuscatedName("eu.v(II)I")
    public int method3058(int arg0) {
        return this.field2519[arg0].length;
    }

    @ObfuscatedName("eu.z(B)I")
    public int method3059() {
        return this.field2519.length;
    }

    @ObfuscatedName("eu.m(II)V")
    public void method3060(int arg0) {
        for (int var2 = 0; var2 < this.field2519[arg0].length; var2++) {
            this.field2519[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eu.r(I)V")
    public void method3061() {
        for (int var1 = 0; var1 < this.field2519.length; var1++) {
            if (this.field2519[var1] != null) {
                for (int var2 = 0; var2 < this.field2519[var1].length; var2++) {
                    this.field2519[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eu.u(I[II)Z")
    public boolean method3062(int arg0, int[] arg1) {
        if (this.field2518[arg0] == null) {
            return false;
        }
        int var3 = this.field2514[arg0];
        int[] var4 = this.field2508[arg0];
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
            var8 = class119.method125(this.field2518[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2503(arg1, 5, var9.field2033.length);
        } else {
            var8 = class119.method125(this.field2518[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class127.method1887(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class127.method1887(var8, 0, var18);
            throw class80.method703(var35, var17 + var19 + "," + this.field2520[arg0] + "," + this.field2515);
        }
        if (this.field2522) {
            this.field2518[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class127 var23 = new class127(var10);
            int[] var24 = new int[var3];
            var23.field2029 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2617();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2029 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2617();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2523) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class119.method2249(var28[var34], false);
                }
            }
        } else if (this.field2523) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method2249(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eu.i(Ljava/lang/String;I)I")
    public int method3063(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2511.method3263(class148.method2773(var2));
    }

    @ObfuscatedName("eu.x(ILjava/lang/String;B)I")
    public int method3114(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2517[arg0].method3263(class148.method2773(var3));
    }

    @ObfuscatedName("eu.s(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3065(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2511.method3263(class148.method2773(var3));
        int var6 = this.field2517[var5].method3263(class148.method2773(var4));
        return this.method3048(var5, var6);
    }

    @ObfuscatedName("eu.o(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3066(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2511.method3263(class148.method2773(var3));
        int var6 = this.field2517[var5].method3263(class148.method2773(var4));
        return this.method3050(var5, var6);
    }

    @ObfuscatedName("eu.g(Ljava/lang/String;I)V")
    public void method3067(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2511.method3263(class148.method2773(var2));
        if (var3 >= 0) {
            this.method3047(var3);
        }
    }

    @ObfuscatedName("p.d([BI)[B")
    public static final byte[] method3(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2494();
        int var3 = var1.method2617();
        if (var3 < 0 || !(field2510 == 0 || var3 <= field2510)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2505(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2617();
            if (var5 < 0 || field2510 != 0 && var5 > field2510) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2429(var6, var5, arg0, var3, 9);
            } else {
                field2521.method2421(var1, var6);
            }
            return var6;
        }
    }
}
