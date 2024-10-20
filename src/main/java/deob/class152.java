package deob;

@ObfuscatedName("ef")
public abstract class class152 {

    @ObfuscatedName("ef.i")
    public int field2518;

    @ObfuscatedName("ef.p")
    public int[] field2523;

    @ObfuscatedName("ef.a")
    public int[] field2512;

    @ObfuscatedName("ef.l")
    public class169 field2514;

    @ObfuscatedName("ef.q")
    public int[] field2515;

    @ObfuscatedName("ef.b")
    public int[] field2531;

    @ObfuscatedName("ef.u")
    public int[] field2517;

    @ObfuscatedName("ef.d")
    public int[][] field2516;

    @ObfuscatedName("ef.m")
    public int[][] field2519;

    @ObfuscatedName("ef.v")
    public class169[] field2520;

    @ObfuscatedName("ef.j")
    public Object[] field2521;

    @ObfuscatedName("ef.f")
    public Object[][] field2522;

    @ObfuscatedName("ef.h")
    public static class122 field2513 = new class122();

    @ObfuscatedName("ef.o")
    public int field2524;

    @ObfuscatedName("ef.z")
    public boolean field2525;

    @ObfuscatedName("ef.k")
    public boolean field2526;

    @ObfuscatedName("ef.y")
    public static int field2527 = 0;

    public class152(boolean arg0, boolean arg1) {
        this.field2525 = arg0;
        this.field2526 = arg1;
    }

    @ObfuscatedName("ef.i([BI)V")
    public void method2933(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class127.method30(arg0, 0, var2);
        this.field2524 = var3;
        class127 var4 = new class127(method145(arg0));
        int var5 = var4.method2411();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2416();
        }
        int var6 = var4.method2411();
        if (var5 >= 7) {
            this.field2518 = var4.method2489();
        } else {
            this.field2518 = var4.method2413();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2523 = new int[this.field2518];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2518; var9++) {
                this.field2523[var9] = var7 += var4.method2489();
                if (this.field2523[var9] > var8) {
                    var8 = this.field2523[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2518; var10++) {
                this.field2523[var10] = var7 += var4.method2413();
                if (this.field2523[var10] > var8) {
                    var8 = this.field2523[var10];
                }
            }
        }
        this.field2515 = new int[var8 + 1];
        this.field2531 = new int[var8 + 1];
        this.field2517 = new int[var8 + 1];
        this.field2516 = new int[var8 + 1][];
        this.field2521 = new Object[var8 + 1];
        this.field2522 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2512 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2518; var11++) {
                this.field2512[this.field2523[var11]] = var4.method2416();
            }
            this.field2514 = new class169(this.field2512);
        }
        for (int var12 = 0; var12 < this.field2518; var12++) {
            this.field2515[this.field2523[var12]] = var4.method2416();
        }
        for (int var13 = 0; var13 < this.field2518; var13++) {
            this.field2531[this.field2523[var13]] = var4.method2416();
        }
        for (int var14 = 0; var14 < this.field2518; var14++) {
            this.field2517[this.field2523[var14]] = var4.method2413();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2518; var15++) {
                int var16 = this.field2523[var15];
                int var17 = this.field2517[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2516[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2516[var16][var20] = var18 += var4.method2489();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2522[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2518; var22++) {
                int var23 = this.field2523[var22];
                int var24 = this.field2517[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2516[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2516[var23][var27] = var25 += var4.method2413();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2522[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2519 = new int[var8 + 1][];
        this.field2520 = new class169[var8 + 1];
        for (int var29 = 0; var29 < this.field2518; var29++) {
            int var30 = this.field2523[var29];
            int var31 = this.field2517[var30];
            this.field2519[var30] = new int[this.field2522[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2519[var30][this.field2516[var30][var32]] = var4.method2416();
            }
            this.field2520[var30] = new class169(this.field2519[var30]);
        }
    }

    @ObfuscatedName("ef.p(II)V")
    public void method2979(int arg0) {
    }

    @ObfuscatedName("ef.a(III)[B")
    public byte[] method2932(int arg0, int arg1) {
        return this.method2936(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ef.l(II[II)[B")
    public byte[] method2936(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2522.length || this.field2522[arg0] == null || arg1 < 0 || arg1 >= this.field2522[arg0].length) {
            return null;
        }
        if (this.field2522[arg0][arg1] == null) {
            boolean var4 = this.method2949(arg0, arg2);
            if (!var4) {
                this.method2943(arg0);
                boolean var5 = this.method2949(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method2647(this.field2522[arg0][arg1], false);
        if (this.field2526) {
            this.field2522[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ef.q(IIB)Z")
    public boolean method2937(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2522.length || this.field2522[arg0] == null || arg1 < 0 || arg1 >= this.field2522[arg0].length) {
            return false;
        } else if (this.field2522[arg0][arg1] != null) {
            return true;
        } else if (this.field2521[arg0] == null) {
            this.method2943(arg0);
            return this.field2521[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ef.b(II)Z")
    public boolean method2938(int arg0) {
        if (this.field2521[arg0] == null) {
            this.method2943(arg0);
            return this.field2521[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ef.u(B)Z")
    public boolean method3013() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2523.length; var2++) {
            int var3 = this.field2523[var2];
            if (this.field2521[var3] == null) {
                this.method2943(var3);
                if (this.field2521[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ef.d(II)[B")
    public byte[] method2940(int arg0) {
        if (this.field2522.length == 1) {
            return this.method2932(0, arg0);
        } else if (this.field2522[arg0].length == 1) {
            return this.method2932(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ef.m(III)[B")
    public byte[] method2948(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2522.length || this.field2522[arg0] == null || arg1 < 0 || arg1 >= this.field2522[arg0].length) {
            return null;
        }
        if (this.field2522[arg0][arg1] == null) {
            boolean var3 = this.method2949(arg0, (int[]) null);
            if (!var3) {
                this.method2943(arg0);
                boolean var4 = this.method2949(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method2647(this.field2522[arg0][arg1], false);
    }

    @ObfuscatedName("ef.v(II)[B")
    public byte[] method2942(int arg0) {
        if (this.field2522.length == 1) {
            return this.method2948(0, arg0);
        } else if (this.field2522[arg0].length == 1) {
            return this.method2948(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ef.j(II)V")
    public void method2943(int arg0) {
    }

    @ObfuscatedName("ef.f(IB)[I")
    public int[] method2944(int arg0) {
        return this.field2516[arg0];
    }

    @ObfuscatedName("ef.h(II)I")
    public int method2945(int arg0) {
        return this.field2522[arg0].length;
    }

    @ObfuscatedName("ef.o(I)I")
    public int method2964() {
        return this.field2522.length;
    }

    @ObfuscatedName("ef.z(IB)V")
    public void method2947(int arg0) {
        for (int var2 = 0; var2 < this.field2522[arg0].length; var2++) {
            this.field2522[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ef.k(B)V")
    public void method2982() {
        for (int var1 = 0; var1 < this.field2522.length; var1++) {
            if (this.field2522[var1] != null) {
                for (int var2 = 0; var2 < this.field2522[var1].length; var2++) {
                    this.field2522[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ef.y(I[IB)Z")
    public boolean method2949(int arg0, int[] arg1) {
        if (this.field2521[arg0] == null) {
            return false;
        }
        int var3 = this.field2517[arg0];
        int[] var4 = this.field2516[arg0];
        Object[] var5 = this.field2522[arg0];
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
            var8 = class119.method2647(this.field2521[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2428(arg1, 5, var9.field2039.length);
        } else {
            var8 = class119.method2647(this.field2521[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method145(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class127.method30(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class127.method30(var8, 0, var17);
            throw class80.method541(var34, var16 + var18 + "," + this.field2515[arg0] + "," + this.field2524);
        }
        if (this.field2525) {
            this.field2521[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class127 var22 = new class127(var10);
            int[] var23 = new int[var3];
            var22.field2037 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2416();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2037 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2416();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2526) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class119.method1328(var27[var33], false);
                }
            }
        } else if (this.field2526) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method1328(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ef.g(Ljava/lang/String;B)I")
    public int method3012(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2514.method3220(class147.method1784(var2));
    }

    @ObfuscatedName("ef.e(ILjava/lang/String;S)I")
    public int method2951(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2520[arg0].method3220(class147.method1784(var3));
    }

    @ObfuscatedName("ef.s(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2963(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2514.method3220(class147.method1784(var3));
        int var6 = this.field2520[var5].method3220(class147.method1784(var4));
        return this.method2932(var5, var6);
    }

    @ObfuscatedName("ef.t(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2953(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2514.method3220(class147.method1784(var3));
        int var6 = this.field2520[var5].method3220(class147.method1784(var4));
        return this.method2937(var5, var6);
    }

    @ObfuscatedName("ef.r(Ljava/lang/String;I)V")
    public void method2941(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2514.method3220(class147.method1784(var2));
        if (var3 >= 0) {
            this.method2979(var3);
        }
    }

    @ObfuscatedName("z.w([BI)[B")
    public static final byte[] method145(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2411();
        int var3 = var1.method2416();
        if (var3 < 0 || !(field2527 == 0 || var3 <= field2527)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2597(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2416();
            if (var5 < 0 || field2527 != 0 && var5 > field2527) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2342(var6, var5, arg0, var3, 9);
            } else {
                field2513.method2339(var1, var6);
            }
            return var6;
        }
    }
}
