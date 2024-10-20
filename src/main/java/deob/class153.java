package deob;

@ObfuscatedName("eo")
public abstract class class153 {

    @ObfuscatedName("eo.b")
    public int field2549;

    @ObfuscatedName("eo.c")
    public int[] field2542;

    @ObfuscatedName("eo.j")
    public int[] field2548;

    @ObfuscatedName("eo.i")
    public class169 field2544;

    @ObfuscatedName("eo.k")
    public int[] field2556;

    @ObfuscatedName("eo.q")
    public int[] field2546;

    @ObfuscatedName("eo.t")
    public int[] field2547;

    @ObfuscatedName("eo.v")
    public int[][] field2557;

    @ObfuscatedName("eo.y")
    public int[][] field2543;

    @ObfuscatedName("eo.w")
    public class169[] field2550;

    @ObfuscatedName("eo.g")
    public Object[] field2541;

    @ObfuscatedName("eo.s")
    public Object[][] field2545;

    @ObfuscatedName("eo.n")
    public static class122 field2553 = new class122();

    @ObfuscatedName("eo.x")
    public int field2554;

    @ObfuscatedName("eo.o")
    public boolean field2555;

    @ObfuscatedName("eo.l")
    public boolean field2552;

    @ObfuscatedName("eo.u")
    public static int field2551 = 0;

    public class153(boolean arg0, boolean arg1) {
        this.field2555 = arg0;
        this.field2552 = arg1;
    }

    @ObfuscatedName("eo.b([BB)V")
    public void method2962(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class127.method65(arg0, 0, var2);
        this.field2554 = var3;
        class127 var4 = new class127(method537(arg0));
        int var5 = var4.method2416();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2455();
        }
        int var6 = var4.method2416();
        if (var5 >= 7) {
            this.field2549 = var4.method2439();
        } else {
            this.field2549 = var4.method2394();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2542 = new int[this.field2549];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2549; var9++) {
                this.field2542[var9] = var7 += var4.method2439();
                if (this.field2542[var9] > var8) {
                    var8 = this.field2542[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2549; var10++) {
                this.field2542[var10] = var7 += var4.method2394();
                if (this.field2542[var10] > var8) {
                    var8 = this.field2542[var10];
                }
            }
        }
        this.field2556 = new int[var8 + 1];
        this.field2546 = new int[var8 + 1];
        this.field2547 = new int[var8 + 1];
        this.field2557 = new int[var8 + 1][];
        this.field2541 = new Object[var8 + 1];
        this.field2545 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2548 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2549; var11++) {
                this.field2548[this.field2542[var11]] = var4.method2455();
            }
            this.field2544 = new class169(this.field2548);
        }
        for (int var12 = 0; var12 < this.field2549; var12++) {
            this.field2556[this.field2542[var12]] = var4.method2455();
        }
        for (int var13 = 0; var13 < this.field2549; var13++) {
            this.field2546[this.field2542[var13]] = var4.method2455();
        }
        for (int var14 = 0; var14 < this.field2549; var14++) {
            this.field2547[this.field2542[var14]] = var4.method2394();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2549; var15++) {
                int var16 = this.field2542[var15];
                int var17 = this.field2547[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2557[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2557[var16][var20] = var18 += var4.method2439();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2545[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2549; var22++) {
                int var23 = this.field2542[var22];
                int var24 = this.field2547[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2557[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2557[var23][var27] = var25 += var4.method2394();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2545[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2543 = new int[var8 + 1][];
        this.field2550 = new class169[var8 + 1];
        for (int var29 = 0; var29 < this.field2549; var29++) {
            int var30 = this.field2542[var29];
            int var31 = this.field2547[var30];
            this.field2543[var30] = new int[this.field2545[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2543[var30][this.field2557[var30][var32]] = var4.method2455();
            }
            this.field2550[var30] = new class169(this.field2543[var30]);
        }
    }

    @ObfuscatedName("eo.c(IB)V")
    public void method2963(int arg0) {
    }

    @ObfuscatedName("eo.j(III)[B")
    public byte[] method2964(int arg0, int arg1) {
        return this.method2985(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eo.i(II[IB)[B")
    public byte[] method2985(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2545.length || this.field2545[arg0] == null || arg1 < 0 || arg1 >= this.field2545[arg0].length) {
            return null;
        }
        if (this.field2545[arg0][arg1] == null) {
            boolean var4 = this.method2977(arg0, arg2);
            if (!var4) {
                this.method2971(arg0);
                boolean var5 = this.method2977(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method670(this.field2545[arg0][arg1], false);
        if (this.field2552) {
            this.field2545[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eo.k(IIS)Z")
    public boolean method3032(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2545.length || this.field2545[arg0] == null || arg1 < 0 || arg1 >= this.field2545[arg0].length) {
            return false;
        } else if (this.field2545[arg0][arg1] != null) {
            return true;
        } else if (this.field2541[arg0] == null) {
            this.method2971(arg0);
            return this.field2541[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eo.q(II)Z")
    public boolean method2966(int arg0) {
        if (this.field2541[arg0] == null) {
            this.method2971(arg0);
            return this.field2541[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eo.t(I)Z")
    public boolean method2967() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2542.length; var2++) {
            int var3 = this.field2542[var2];
            if (this.field2541[var3] == null) {
                this.method2971(var3);
                if (this.field2541[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eo.v(IB)[B")
    public byte[] method3023(int arg0) {
        if (this.field2545.length == 1) {
            return this.method2964(0, arg0);
        } else if (this.field2545[arg0].length == 1) {
            return this.method2964(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eo.y(III)[B")
    public byte[] method2969(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2545.length || this.field2545[arg0] == null || arg1 < 0 || arg1 >= this.field2545[arg0].length) {
            return null;
        }
        if (this.field2545[arg0][arg1] == null) {
            boolean var3 = this.method2977(arg0, (int[]) null);
            if (!var3) {
                this.method2971(arg0);
                boolean var4 = this.method2977(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method670(this.field2545[arg0][arg1], false);
    }

    @ObfuscatedName("eo.w(IB)[B")
    public byte[] method3034(int arg0) {
        if (this.field2545.length == 1) {
            return this.method2969(0, arg0);
        } else if (this.field2545[arg0].length == 1) {
            return this.method2969(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eo.g(II)V")
    public void method2971(int arg0) {
    }

    @ObfuscatedName("eo.s(IS)[I")
    public int[] method2999(int arg0) {
        return this.field2557[arg0];
    }

    @ObfuscatedName("eo.n(II)I")
    public int method2973(int arg0) {
        return this.field2545[arg0].length;
    }

    @ObfuscatedName("eo.x(B)I")
    public int method3021() {
        return this.field2545.length;
    }

    @ObfuscatedName("eo.o(II)V")
    public void method2975(int arg0) {
        for (int var2 = 0; var2 < this.field2545[arg0].length; var2++) {
            this.field2545[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eo.l(S)V")
    public void method2976() {
        for (int var1 = 0; var1 < this.field2545.length; var1++) {
            if (this.field2545[var1] != null) {
                for (int var2 = 0; var2 < this.field2545[var1].length; var2++) {
                    this.field2545[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eo.u(I[IB)Z")
    public boolean method2977(int arg0, int[] arg1) {
        if (this.field2541[arg0] == null) {
            return false;
        }
        int var3 = this.field2547[arg0];
        int[] var4 = this.field2557[arg0];
        Object[] var5 = this.field2545[arg0];
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
            var8 = class119.method670(this.field2541[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2413(arg1, 5, var9.field2056.length);
        } else {
            var8 = class119.method670(this.field2541[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method537(var8);
        } catch (RuntimeException var39) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class127.method65(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = -1;
            for (int var20 = 0; var20 < var18; var20++) {
                var19 = var19 >>> 8 ^ class127.field2053[(var19 ^ var8[var20]) & 0xFF];
            }
            int var21 = ~var19;
            throw class80.method2670(var39, var17 + var21 + "," + this.field2556[arg0] + "," + this.field2554);
        }
        if (this.field2555) {
            this.field2541[arg0] = null;
        }
        if (var3 > 1) {
            int var24 = var10.length;
            int var40 = var24 - 1;
            int var25 = var10[var40] & 0xFF;
            int var26 = var40 - var3 * var25 * 4;
            class127 var27 = new class127(var10);
            int[] var28 = new int[var3];
            var27.field2051 = var26;
            for (int var29 = 0; var29 < var25; var29++) {
                int var30 = 0;
                for (int var31 = 0; var31 < var3; var31++) {
                    var30 += var27.method2455();
                    var28[var31] += var30;
                }
            }
            byte[][] var32 = new byte[var3][];
            for (int var33 = 0; var33 < var3; var33++) {
                var32[var33] = new byte[var28[var33]];
                var28[var33] = 0;
            }
            var27.field2051 = var26;
            int var34 = 0;
            for (int var35 = 0; var35 < var25; var35++) {
                int var36 = 0;
                for (int var37 = 0; var37 < var3; var37++) {
                    var36 += var27.method2455();
                    System.arraycopy(var10, var34, var32[var37], var28[var37], var36);
                    var28[var37] += var36;
                    var34 += var36;
                }
            }
            for (int var38 = 0; var38 < var3; var38++) {
                if (this.field2552) {
                    var5[var4[var38]] = var32[var38];
                } else {
                    var5[var4[var38]] = class119.method2149(var32[var38], false);
                }
            }
        } else if (this.field2552) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method2149(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eo.z(Ljava/lang/String;I)I")
    public int method2978(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2544.method3185(class148.method31(var2));
    }

    @ObfuscatedName("eo.d(ILjava/lang/String;I)I")
    public int method2979(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2550[arg0].method3185(class148.method31(var3));
    }

    @ObfuscatedName("eo.m(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3031(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2544.method3185(class148.method31(var3));
        int var6 = this.field2550[var5].method3185(class148.method31(var4));
        return this.method2964(var5, var6);
    }

    @ObfuscatedName("eo.f(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2981(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2544.method3185(class148.method31(var3));
        int var6 = this.field2550[var5].method3185(class148.method31(var4));
        return this.method3032(var5, var6);
    }

    @ObfuscatedName("eo.a(Ljava/lang/String;I)V")
    public void method2982(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2544.method3185(class148.method31(var2));
        if (var3 >= 0) {
            this.method2963(var3);
        }
    }

    @ObfuscatedName("client.h([BB)[B")
    public static final byte[] method537(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2416();
        int var3 = var1.method2455();
        if (var3 < 0 || !(field2551 == 0 || var3 <= field2551)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2407(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2455();
            if (var5 < 0 || field2551 != 0 && var5 > field2551) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2339(var6, var5, arg0, var3, 9);
            } else {
                field2553.method2335(var1, var6);
            }
            return var6;
        }
    }
}
