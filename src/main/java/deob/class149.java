package deob;

@ObfuscatedName("eo")
public abstract class class149 {

    @ObfuscatedName("eo.l")
    public int field2447;

    @ObfuscatedName("eo.y")
    public int[] field2449;

    @ObfuscatedName("eo.g")
    public int[] field2441;

    @ObfuscatedName("eo.j")
    public class173 field2443;

    @ObfuscatedName("eo.w")
    public int[] field2444;

    @ObfuscatedName("eo.c")
    public int[] field2445;

    @ObfuscatedName("eo.x")
    public int[] field2446;

    @ObfuscatedName("eo.f")
    public int[][] field2450;

    @ObfuscatedName("eo.t")
    public int[][] field2448;

    @ObfuscatedName("eo.n")
    public class173[] field2440;

    @ObfuscatedName("eo.p")
    public Object[] field2454;

    @ObfuscatedName("eo.a")
    public Object[][] field2451;

    @ObfuscatedName("eo.o")
    public static class105 field2452 = new class105();

    @ObfuscatedName("eo.b")
    public int field2453;

    @ObfuscatedName("eo.r")
    public boolean field2442;

    @ObfuscatedName("eo.z")
    public boolean field2455;

    @ObfuscatedName("eo.u")
    public static int field2456 = 0;

    public class149(boolean arg0, boolean arg1) {
        this.field2442 = arg0;
        this.field2455 = arg1;
    }

    @ObfuscatedName("eo.l([BB)V")
    public void method2748(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class108.method596(arg0, 0, var2);
        this.field2453 = var3;
        class108 var4 = new class108(method618(arg0));
        int var5 = var4.method2291();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2297();
        }
        int var6 = var4.method2291();
        if (var5 >= 7) {
            this.field2447 = var4.method2174();
        } else {
            this.field2447 = var4.method2163();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2449 = new int[this.field2447];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2447; var9++) {
                this.field2449[var9] = var7 += var4.method2174();
                if (this.field2449[var9] > var8) {
                    var8 = this.field2449[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2447; var10++) {
                this.field2449[var10] = var7 += var4.method2163();
                if (this.field2449[var10] > var8) {
                    var8 = this.field2449[var10];
                }
            }
        }
        this.field2444 = new int[var8 + 1];
        this.field2445 = new int[var8 + 1];
        this.field2446 = new int[var8 + 1];
        this.field2450 = new int[var8 + 1][];
        this.field2454 = new Object[var8 + 1];
        this.field2451 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2441 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2447; var11++) {
                this.field2441[this.field2449[var11]] = var4.method2297();
            }
            this.field2443 = new class173(this.field2441);
        }
        for (int var12 = 0; var12 < this.field2447; var12++) {
            this.field2444[this.field2449[var12]] = var4.method2297();
        }
        for (int var13 = 0; var13 < this.field2447; var13++) {
            this.field2445[this.field2449[var13]] = var4.method2297();
        }
        for (int var14 = 0; var14 < this.field2447; var14++) {
            this.field2446[this.field2449[var14]] = var4.method2163();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2447; var15++) {
                int var16 = this.field2449[var15];
                int var17 = this.field2446[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2450[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2450[var16][var20] = var18 += var4.method2174();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2451[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2447; var22++) {
                int var23 = this.field2449[var22];
                int var24 = this.field2446[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2450[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2450[var23][var27] = var25 += var4.method2163();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2451[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2448 = new int[var8 + 1][];
        this.field2440 = new class173[var8 + 1];
        for (int var29 = 0; var29 < this.field2447; var29++) {
            int var30 = this.field2449[var29];
            int var31 = this.field2446[var30];
            this.field2448[var30] = new int[this.field2451[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2448[var30][this.field2450[var30][var32]] = var4.method2297();
            }
            this.field2440[var30] = new class173(this.field2448[var30]);
        }
    }

    @ObfuscatedName("eo.y(II)V")
    public void method2749(int arg0) {
    }

    @ObfuscatedName("eo.g(III)[B")
    public byte[] method2752(int arg0, int arg1) {
        return this.method2758(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eo.j(II[IB)[B")
    public byte[] method2758(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2451.length || this.field2451[arg0] == null || arg1 < 0 || arg1 >= this.field2451[arg0].length) {
            return null;
        }
        if (this.field2451[arg0][arg1] == null) {
            boolean var4 = this.method2756(arg0, arg2);
            if (!var4) {
                this.method2813(arg0);
                boolean var5 = this.method2756(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class114.method2861(this.field2451[arg0][arg1], false);
        if (this.field2455) {
            this.field2451[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eo.w(III)Z")
    public boolean method2783(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2451.length || this.field2451[arg0] == null || arg1 < 0 || arg1 >= this.field2451[arg0].length) {
            return false;
        } else if (this.field2451[arg0][arg1] != null) {
            return true;
        } else if (this.field2454[arg0] == null) {
            this.method2813(arg0);
            return this.field2454[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eo.c(IS)Z")
    public boolean method2753(int arg0) {
        if (this.field2454[arg0] == null) {
            this.method2813(arg0);
            return this.field2454[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eo.x(I)Z")
    public boolean method2787() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2449.length; var2++) {
            int var3 = this.field2449[var2];
            if (this.field2454[var3] == null) {
                this.method2813(var3);
                if (this.field2454[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eo.f(IB)[B")
    public byte[] method2781(int arg0) {
        if (this.field2451.length == 1) {
            return this.method2752(0, arg0);
        } else if (this.field2451[arg0].length == 1) {
            return this.method2752(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eo.t(III)[B")
    public byte[] method2811(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2451.length || this.field2451[arg0] == null || arg1 < 0 || arg1 >= this.field2451[arg0].length) {
            return null;
        }
        if (this.field2451[arg0][arg1] == null) {
            boolean var3 = this.method2756(arg0, (int[]) null);
            if (!var3) {
                this.method2813(arg0);
                boolean var4 = this.method2756(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class114.method2861(this.field2451[arg0][arg1], false);
    }

    @ObfuscatedName("eo.n(II)[B")
    public byte[] method2809(int arg0) {
        if (this.field2451.length == 1) {
            return this.method2811(0, arg0);
        } else if (this.field2451[arg0].length == 1) {
            return this.method2811(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eo.p(II)V")
    public void method2813(int arg0) {
    }

    @ObfuscatedName("eo.a(IB)[I")
    public int[] method2789(int arg0) {
        return this.field2450[arg0];
    }

    @ObfuscatedName("eo.o(II)I")
    public int method2799(int arg0) {
        return this.field2451[arg0].length;
    }

    @ObfuscatedName("eo.b(I)I")
    public int method2760() {
        return this.field2451.length;
    }

    @ObfuscatedName("eo.r(II)V")
    public void method2761(int arg0) {
        for (int var2 = 0; var2 < this.field2451[arg0].length; var2++) {
            this.field2451[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eo.z(I)V")
    public void method2762() {
        for (int var1 = 0; var1 < this.field2451.length; var1++) {
            if (this.field2451[var1] != null) {
                for (int var2 = 0; var2 < this.field2451[var1].length; var2++) {
                    this.field2451[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eo.u(I[II)Z")
    public boolean method2756(int arg0, int[] arg1) {
        if (this.field2454[arg0] == null) {
            return false;
        }
        int var3 = this.field2446[arg0];
        int[] var4 = this.field2450[arg0];
        Object[] var5 = this.field2451[arg0];
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
            var8 = class114.method2861(this.field2454[arg0], true);
            class108 var9 = new class108(var8);
            var9.method2177(arg1, 5, var9.field1828.length);
        } else {
            var8 = class114.method2861(this.field2454[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method618(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class108.method596(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class108.method596(var8, 0, var18);
            throw class137.method2417(var35, var17 + var19 + "," + this.field2444[arg0] + "," + this.field2453);
        }
        if (this.field2442) {
            this.field2454[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class108 var23 = new class108(var10);
            int[] var24 = new int[var3];
            var23.field1823 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2297();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1823 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2297();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2455) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class114.method3207(var28[var34], false);
                }
            }
        } else if (this.field2455) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class114.method3207(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eo.s(Ljava/lang/String;I)I")
    public int method2764(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2443.method3210(class211.method2939(var2));
    }

    @ObfuscatedName("eo.i(ILjava/lang/String;I)I")
    public int method2765(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2440[arg0].method3210(class211.method2939(var3));
    }

    @ObfuscatedName("eo.e(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2798(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2443.method3210(class211.method2939(var3));
        int var6 = this.field2440[var5].method3210(class211.method2939(var4));
        return this.method2752(var5, var6);
    }

    @ObfuscatedName("eo.h(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2767(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2443.method3210(class211.method2939(var3));
        int var6 = this.field2440[var5].method3210(class211.method2939(var4));
        return this.method2783(var5, var6);
    }

    @ObfuscatedName("eo.k(Ljava/lang/String;I)Z")
    public boolean method2768(String arg0) {
        int var2 = this.method2764("");
        return var2 == -1 ? this.method2767(arg0, "") : this.method2767("", arg0);
    }

    @ObfuscatedName("eo.v(Ljava/lang/String;I)V")
    public void method2769(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2443.method3210(class211.method2939(var2));
        if (var3 >= 0) {
            this.method2749(var3);
        }
    }

    @ObfuscatedName("au.m([BI)[B")
    public static final byte[] method618(byte[] arg0) {
        class108 var1 = new class108(arg0);
        int var2 = var1.method2291();
        int var3 = var1.method2297();
        if (var3 < 0 || !(field2456 == 0 || var3 <= field2456)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2171(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2297();
            if (var5 < 0 || field2456 != 0 && var5 > field2456) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class106.method2128(var6, var5, arg0, var3, 9);
            } else {
                field2452.method2102(var1, var6);
            }
            return var6;
        }
    }
}
