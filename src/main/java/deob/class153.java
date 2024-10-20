package deob;

@ObfuscatedName("eo")
public abstract class class153 {

    @ObfuscatedName("eo.f")
    public int field2516;

    @ObfuscatedName("eo.t")
    public int[] field2510;

    @ObfuscatedName("eo.n")
    public int[] field2511;

    @ObfuscatedName("eo.e")
    public class169 field2526;

    @ObfuscatedName("eo.l")
    public int[] field2513;

    @ObfuscatedName("eo.d")
    public int[] field2514;

    @ObfuscatedName("eo.r")
    public int[] field2521;

    @ObfuscatedName("eo.k")
    public int[][] field2519;

    @ObfuscatedName("eo.u")
    public int[][] field2517;

    @ObfuscatedName("eo.o")
    public class169[] field2518;

    @ObfuscatedName("eo.g")
    public Object[] field2509;

    @ObfuscatedName("eo.s")
    public Object[][] field2520;

    @ObfuscatedName("eo.b")
    public static class122 field2523 = new class122();

    @ObfuscatedName("eo.v")
    public int field2512;

    @ObfuscatedName("eo.j")
    public boolean field2522;

    @ObfuscatedName("eo.q")
    public boolean field2524;

    @ObfuscatedName("eo.a")
    public static int field2525 = 0;

    public class153(boolean arg0, boolean arg1) {
        this.field2522 = arg0;
        this.field2524 = arg1;
    }

    @ObfuscatedName("eo.f([BI)V")
    public void method3033(byte[] arg0) {
        this.field2512 = class127.method169(arg0, arg0.length);
        class127 var2 = new class127(method1869(arg0));
        int var3 = var2.method2458();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2463();
        }
        int var4 = var2.method2458();
        if (var3 >= 7) {
            this.field2516 = var2.method2472();
        } else {
            this.field2516 = var2.method2460();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2510 = new int[this.field2516];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2516; var7++) {
                this.field2510[var7] = var5 += var2.method2472();
                if (this.field2510[var7] > var6) {
                    var6 = this.field2510[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2516; var8++) {
                this.field2510[var8] = var5 += var2.method2460();
                if (this.field2510[var8] > var6) {
                    var6 = this.field2510[var8];
                }
            }
        }
        this.field2513 = new int[var6 + 1];
        this.field2514 = new int[var6 + 1];
        this.field2521 = new int[var6 + 1];
        this.field2519 = new int[var6 + 1][];
        this.field2509 = new Object[var6 + 1];
        this.field2520 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2511 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2516; var9++) {
                this.field2511[this.field2510[var9]] = var2.method2463();
            }
            this.field2526 = new class169(this.field2511);
        }
        for (int var10 = 0; var10 < this.field2516; var10++) {
            this.field2513[this.field2510[var10]] = var2.method2463();
        }
        for (int var11 = 0; var11 < this.field2516; var11++) {
            this.field2514[this.field2510[var11]] = var2.method2463();
        }
        for (int var12 = 0; var12 < this.field2516; var12++) {
            this.field2521[this.field2510[var12]] = var2.method2460();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2516; var13++) {
                int var14 = this.field2510[var13];
                int var15 = this.field2521[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2519[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2519[var14][var18] = var16 += var2.method2472();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2520[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2516; var20++) {
                int var21 = this.field2510[var20];
                int var22 = this.field2521[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2519[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2519[var21][var25] = var23 += var2.method2460();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2520[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2517 = new int[var6 + 1][];
        this.field2518 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2516; var27++) {
            int var28 = this.field2510[var27];
            int var29 = this.field2521[var28];
            this.field2517[var28] = new int[this.field2520[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2517[var28][this.field2519[var28][var30]] = var2.method2463();
            }
            this.field2518[var28] = new class169(this.field2517[var28]);
        }
    }

    @ObfuscatedName("eo.t(II)V")
    public void method3083(int arg0) {
    }

    @ObfuscatedName("eo.n(III)[B")
    public byte[] method3035(int arg0, int arg1) {
        return this.method3036(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eo.e(II[II)[B")
    public byte[] method3036(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2520.length || this.field2520[arg0] == null || arg1 < 0 || arg1 >= this.field2520[arg0].length) {
            return null;
        }
        if (this.field2520[arg0][arg1] == null) {
            boolean var4 = this.method3105(arg0, arg2);
            if (!var4) {
                this.method3042(arg0);
                boolean var5 = this.method3105(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method112(this.field2520[arg0][arg1], false);
        if (this.field2524) {
            this.field2520[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eo.l(III)Z")
    public boolean method3103(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2520.length || this.field2520[arg0] == null || arg1 < 0 || arg1 >= this.field2520[arg0].length) {
            return false;
        } else if (this.field2520[arg0][arg1] != null) {
            return true;
        } else if (this.field2509[arg0] == null) {
            this.method3042(arg0);
            return this.field2509[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eo.d(II)Z")
    public boolean method3038(int arg0) {
        if (this.field2509[arg0] == null) {
            this.method3042(arg0);
            return this.field2509[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eo.r(I)Z")
    public boolean method3072() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2510.length; var2++) {
            int var3 = this.field2510[var2];
            if (this.field2509[var3] == null) {
                this.method3042(var3);
                if (this.field2509[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eo.k(II)[B")
    public byte[] method3039(int arg0) {
        if (this.field2520.length == 1) {
            return this.method3035(0, arg0);
        } else if (this.field2520[arg0].length == 1) {
            return this.method3035(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eo.u(IIS)[B")
    public byte[] method3081(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2520.length || this.field2520[arg0] == null || arg1 < 0 || arg1 >= this.field2520[arg0].length) {
            return null;
        }
        if (this.field2520[arg0][arg1] == null) {
            boolean var3 = this.method3105(arg0, (int[]) null);
            if (!var3) {
                this.method3042(arg0);
                boolean var4 = this.method3105(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method112(this.field2520[arg0][arg1], false);
    }

    @ObfuscatedName("eo.o(II)[B")
    public byte[] method3096(int arg0) {
        if (this.field2520.length == 1) {
            return this.method3081(0, arg0);
        } else if (this.field2520[arg0].length == 1) {
            return this.method3081(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eo.g(IB)V")
    public void method3042(int arg0) {
    }

    @ObfuscatedName("eo.s(IS)[I")
    public int[] method3043(int arg0) {
        return this.field2519[arg0];
    }

    @ObfuscatedName("eo.b(II)I")
    public int method3056(int arg0) {
        return this.field2520[arg0].length;
    }

    @ObfuscatedName("eo.v(B)I")
    public int method3045() {
        return this.field2520.length;
    }

    @ObfuscatedName("eo.j(II)V")
    public void method3057(int arg0) {
        for (int var2 = 0; var2 < this.field2520[arg0].length; var2++) {
            this.field2520[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eo.q(B)V")
    public void method3032() {
        for (int var1 = 0; var1 < this.field2520.length; var1++) {
            if (this.field2520[var1] != null) {
                for (int var2 = 0; var2 < this.field2520[var1].length; var2++) {
                    this.field2520[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eo.a(I[II)Z")
    public boolean method3105(int arg0, int[] arg1) {
        if (this.field2509[arg0] == null) {
            return false;
        }
        int var3 = this.field2521[arg0];
        int[] var4 = this.field2519[arg0];
        Object[] var5 = this.field2520[arg0];
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
            var8 = class119.method112(this.field2509[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2497(arg1, 5, var9.field2030.length);
        } else {
            var8 = class119.method112(this.field2509[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1869(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class127.method2198(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class127.method2198(var8, 0, var18);
            throw class80.method2(var35, var17 + var19 + "," + this.field2513[arg0] + "," + this.field2512);
        }
        if (this.field2522) {
            this.field2509[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class127 var23 = new class127(var10);
            int[] var24 = new int[var3];
            var23.field2033 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2463();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2033 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2463();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2524) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class119.method38(var28[var34], false);
                }
            }
        } else if (this.field2524) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method38(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eo.c(Ljava/lang/String;I)I")
    public int method3034(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2526.method3266(class148.method1511(var2));
    }

    @ObfuscatedName("eo.m(ILjava/lang/String;I)I")
    public int method3050(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2518[arg0].method3266(class148.method1511(var3));
    }

    @ObfuscatedName("eo.z(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3051(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2526.method3266(class148.method1511(var3));
        int var6 = this.field2518[var5].method3266(class148.method1511(var4));
        return this.method3035(var5, var6);
    }

    @ObfuscatedName("eo.w(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3052(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2526.method3266(class148.method1511(var3));
        int var6 = this.field2518[var5].method3266(class148.method1511(var4));
        return this.method3103(var5, var6);
    }

    @ObfuscatedName("eo.h(Ljava/lang/String;B)V")
    public void method3053(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2526.method3266(class148.method1511(var2));
        if (var3 >= 0) {
            this.method3083(var3);
        }
    }

    @ObfuscatedName("co.y([BS)[B")
    public static final byte[] method1869(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2458();
        int var3 = var1.method2463();
        if (var3 < 0 || !(field2525 == 0 || var3 <= field2525)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2609(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2463();
            if (var5 < 0 || field2525 != 0 && var5 > field2525) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2407(var6, var5, arg0, var3, 9);
            } else {
                field2523.method2387(var1, var6);
            }
            return var6;
        }
    }
}
