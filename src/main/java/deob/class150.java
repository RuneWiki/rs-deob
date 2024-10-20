package deob;

@ObfuscatedName("en")
public abstract class class150 {

    @ObfuscatedName("en.z")
    public int field2434;

    @ObfuscatedName("en.h")
    public int[] field2430;

    @ObfuscatedName("en.c")
    public int[] field2432;

    @ObfuscatedName("en.p")
    public class167 field2429;

    @ObfuscatedName("en.i")
    public int[] field2433;

    @ObfuscatedName("en.v")
    public int[] field2443;

    @ObfuscatedName("en.l")
    public int[] field2435;

    @ObfuscatedName("en.m")
    public int[][] field2436;

    @ObfuscatedName("en.g")
    public int[][] field2448;

    @ObfuscatedName("en.t")
    public class167[] field2438;

    @ObfuscatedName("en.o")
    public Object[] field2439;

    @ObfuscatedName("en.b")
    public Object[][] field2440;

    @ObfuscatedName("en.d")
    public static class121 field2441 = new class121();

    @ObfuscatedName("en.k")
    public int field2442;

    @ObfuscatedName("en.f")
    public boolean field2431;

    @ObfuscatedName("en.e")
    public boolean field2437;

    @ObfuscatedName("en.u")
    public static int field2445 = 0;

    public class150(boolean arg0, boolean arg1) {
        this.field2431 = arg0;
        this.field2437 = arg1;
    }

    @ObfuscatedName("en.z([BI)V")
    public void method2991(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class126.method2028(arg0, 0, var2);
        this.field2442 = var3;
        class126 var4 = new class126(method252(arg0));
        int var5 = var4.method2450();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2467();
        }
        int var6 = var4.method2450();
        if (var5 >= 7) {
            this.field2434 = var4.method2444();
        } else {
            this.field2434 = var4.method2627();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2430 = new int[this.field2434];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2434; var9++) {
                this.field2430[var9] = var7 += var4.method2444();
                if (this.field2430[var9] > var8) {
                    var8 = this.field2430[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2434; var10++) {
                this.field2430[var10] = var7 += var4.method2627();
                if (this.field2430[var10] > var8) {
                    var8 = this.field2430[var10];
                }
            }
        }
        this.field2433 = new int[var8 + 1];
        this.field2443 = new int[var8 + 1];
        this.field2435 = new int[var8 + 1];
        this.field2436 = new int[var8 + 1][];
        this.field2439 = new Object[var8 + 1];
        this.field2440 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2432 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2434; var11++) {
                this.field2432[this.field2430[var11]] = var4.method2467();
            }
            this.field2429 = new class167(this.field2432);
        }
        for (int var12 = 0; var12 < this.field2434; var12++) {
            this.field2433[this.field2430[var12]] = var4.method2467();
        }
        for (int var13 = 0; var13 < this.field2434; var13++) {
            this.field2443[this.field2430[var13]] = var4.method2467();
        }
        for (int var14 = 0; var14 < this.field2434; var14++) {
            this.field2435[this.field2430[var14]] = var4.method2627();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2434; var15++) {
                int var16 = this.field2430[var15];
                int var17 = this.field2435[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2436[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2436[var16][var20] = var18 += var4.method2444();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2440[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2434; var22++) {
                int var23 = this.field2430[var22];
                int var24 = this.field2435[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2436[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2436[var23][var27] = var25 += var4.method2627();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2440[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2448 = new int[var8 + 1][];
        this.field2438 = new class167[var8 + 1];
        for (int var29 = 0; var29 < this.field2434; var29++) {
            int var30 = this.field2430[var29];
            int var31 = this.field2435[var30];
            this.field2448[var30] = new int[this.field2440[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2448[var30][this.field2436[var30][var32]] = var4.method2467();
            }
            this.field2438[var30] = new class167(this.field2448[var30]);
        }
    }

    @ObfuscatedName("en.h(II)V")
    public void method2950(int arg0) {
    }

    @ObfuscatedName("en.c(IIB)[B")
    public byte[] method2951(int arg0, int arg1) {
        return this.method2952(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("en.p(II[II)[B")
    public byte[] method2952(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2440.length || this.field2440[arg0] == null || arg1 < 0 || arg1 >= this.field2440[arg0].length) {
            return null;
        }
        if (this.field2440[arg0][arg1] == null) {
            boolean var4 = this.method3017(arg0, arg2);
            if (!var4) {
                this.method3021(arg0);
                boolean var5 = this.method3017(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class118.method3141(this.field2440[arg0][arg1], false);
        if (this.field2437) {
            this.field2440[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("en.i(IIB)Z")
    public boolean method2995(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2440.length || this.field2440[arg0] == null || arg1 < 0 || arg1 >= this.field2440[arg0].length) {
            return false;
        } else if (this.field2440[arg0][arg1] != null) {
            return true;
        } else if (this.field2439[arg0] == null) {
            this.method3021(arg0);
            return this.field2439[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("en.v(IB)Z")
    public boolean method2954(int arg0) {
        if (this.field2439[arg0] == null) {
            this.method3021(arg0);
            return this.field2439[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("en.l(I)Z")
    public boolean method2948() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2430.length; var2++) {
            int var3 = this.field2430[var2];
            if (this.field2439[var3] == null) {
                this.method3021(var3);
                if (this.field2439[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("en.m(II)[B")
    public byte[] method2956(int arg0) {
        if (this.field2440.length == 1) {
            return this.method2951(0, arg0);
        } else if (this.field2440[arg0].length == 1) {
            return this.method2951(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("en.g(IIB)[B")
    public byte[] method2957(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2440.length || this.field2440[arg0] == null || arg1 < 0 || arg1 >= this.field2440[arg0].length) {
            return null;
        }
        if (this.field2440[arg0][arg1] == null) {
            boolean var3 = this.method3017(arg0, (int[]) null);
            if (!var3) {
                this.method3021(arg0);
                boolean var4 = this.method3017(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class118.method3141(this.field2440[arg0][arg1], false);
    }

    @ObfuscatedName("en.t(IB)[B")
    public byte[] method2958(int arg0) {
        if (this.field2440.length == 1) {
            return this.method2957(0, arg0);
        } else if (this.field2440[arg0].length == 1) {
            return this.method2957(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("en.o(II)V")
    public void method3021(int arg0) {
    }

    @ObfuscatedName("en.b(II)[I")
    public int[] method2964(int arg0) {
        return this.field2436[arg0];
    }

    @ObfuscatedName("en.d(IB)I")
    public int method2961(int arg0) {
        return this.field2440[arg0].length;
    }

    @ObfuscatedName("en.k(B)I")
    public int method2962() {
        return this.field2440.length;
    }

    @ObfuscatedName("en.f(II)V")
    public void method2963(int arg0) {
        for (int var2 = 0; var2 < this.field2440[arg0].length; var2++) {
            this.field2440[arg0][var2] = null;
        }
    }

    @ObfuscatedName("en.e(I)V")
    public void method2973() {
        for (int var1 = 0; var1 < this.field2440.length; var1++) {
            if (this.field2440[var1] != null) {
                for (int var2 = 0; var2 < this.field2440[var1].length; var2++) {
                    this.field2440[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("en.u(I[IB)Z")
    public boolean method3017(int arg0, int[] arg1) {
        if (this.field2439[arg0] == null) {
            return false;
        }
        int var3 = this.field2435[arg0];
        int[] var4 = this.field2436[arg0];
        Object[] var5 = this.field2440[arg0];
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
            var8 = class118.method3141(this.field2439[arg0], true);
            class126 var9 = new class126(var8);
            var9.method2527(arg1, 5, var9.field2007.length);
        } else {
            var8 = class118.method3141(this.field2439[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method252(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class126.method2028(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class126.method2028(var8, 0, var18);
            throw class79.method1356(var35, var17 + var19 + "," + this.field2433[arg0] + "," + this.field2442);
        }
        if (this.field2431) {
            this.field2439[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class126 var23 = new class126(var10);
            int[] var24 = new int[var3];
            var23.field2003 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2467();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2003 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2467();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2437) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class118.method1472(var28[var34], false);
                }
            }
        } else if (this.field2437) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class118.method1472(var10, false);
        }
        return true;
    }

    @ObfuscatedName("en.n(Ljava/lang/String;B)I")
    public int method2966(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2429.method3234(class146.method211(var2));
    }

    @ObfuscatedName("en.q(ILjava/lang/String;I)I")
    public int method2967(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2438[arg0].method3234(class146.method211(var3));
    }

    @ObfuscatedName("en.y(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2968(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2429.method3234(class146.method211(var3));
        int var6 = this.field2438[var5].method3234(class146.method211(var4));
        return this.method2951(var5, var6);
    }

    @ObfuscatedName("en.a(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2969(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2429.method3234(class146.method211(var3));
        int var6 = this.field2438[var5].method3234(class146.method211(var4));
        return this.method2995(var5, var6);
    }

    @ObfuscatedName("en.r(Ljava/lang/String;I)V")
    public void method2970(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2429.method3234(class146.method211(var2));
        if (var3 >= 0) {
            this.method2950(var3);
        }
    }

    @ObfuscatedName("s.x([BB)[B")
    public static final byte[] method252(byte[] arg0) {
        class126 var1 = new class126(arg0);
        int var2 = var1.method2450();
        int var3 = var1.method2467();
        if (var3 < 0 || !(field2445 == 0 || var3 <= field2445)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2461(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2467();
            if (var5 < 0 || field2445 != 0 && var5 > field2445) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class122.method2381(var6, var5, arg0, var3, 9);
            } else {
                field2441.method2375(var1, var6);
            }
            return var6;
        }
    }
}
