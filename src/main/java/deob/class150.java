package deob;

@ObfuscatedName("ew")
public abstract class class150 {

    @ObfuscatedName("ew.c")
    public int field2465;

    @ObfuscatedName("ew.j")
    public int[] field2458;

    @ObfuscatedName("ew.f")
    public int[] field2451;

    @ObfuscatedName("ew.y")
    public class167 field2452;

    @ObfuscatedName("ew.x")
    public int[] field2453;

    @ObfuscatedName("ew.e")
    public int[] field2454;

    @ObfuscatedName("ew.m")
    public int[] field2449;

    @ObfuscatedName("ew.s")
    public int[][] field2456;

    @ObfuscatedName("ew.p")
    public int[][] field2455;

    @ObfuscatedName("ew.w")
    public class167[] field2462;

    @ObfuscatedName("ew.r")
    public Object[] field2459;

    @ObfuscatedName("ew.n")
    public Object[][] field2460;

    @ObfuscatedName("ew.b")
    public static class121 field2461 = new class121();

    @ObfuscatedName("ew.z")
    public int field2457;

    @ObfuscatedName("ew.h")
    public boolean field2450;

    @ObfuscatedName("ew.q")
    public boolean field2464;

    @ObfuscatedName("ew.l")
    public static int field2463 = 0;

    public class150(boolean arg0, boolean arg1) {
        this.field2450 = arg0;
        this.field2464 = arg1;
    }

    @ObfuscatedName("ew.c([BB)V")
    public void method2831(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class125.method719(arg0, 0, var2);
        this.field2457 = var3;
        class125 var4 = new class125(method652(arg0));
        int var5 = var4.method2326();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2489();
        }
        int var6 = var4.method2326();
        if (var5 >= 7) {
            this.field2465 = var4.method2340();
        } else {
            this.field2465 = var4.method2328();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2458 = new int[this.field2465];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2465; var9++) {
                this.field2458[var9] = var7 += var4.method2340();
                if (this.field2458[var9] > var8) {
                    var8 = this.field2458[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2465; var10++) {
                this.field2458[var10] = var7 += var4.method2328();
                if (this.field2458[var10] > var8) {
                    var8 = this.field2458[var10];
                }
            }
        }
        this.field2453 = new int[var8 + 1];
        this.field2454 = new int[var8 + 1];
        this.field2449 = new int[var8 + 1];
        this.field2456 = new int[var8 + 1][];
        this.field2459 = new Object[var8 + 1];
        this.field2460 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2451 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2465; var11++) {
                this.field2451[this.field2458[var11]] = var4.method2489();
            }
            this.field2452 = new class167(this.field2451);
        }
        for (int var12 = 0; var12 < this.field2465; var12++) {
            this.field2453[this.field2458[var12]] = var4.method2489();
        }
        for (int var13 = 0; var13 < this.field2465; var13++) {
            this.field2454[this.field2458[var13]] = var4.method2489();
        }
        for (int var14 = 0; var14 < this.field2465; var14++) {
            this.field2449[this.field2458[var14]] = var4.method2328();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2465; var15++) {
                int var16 = this.field2458[var15];
                int var17 = this.field2449[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2456[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2456[var16][var20] = var18 += var4.method2340();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2460[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2465; var22++) {
                int var23 = this.field2458[var22];
                int var24 = this.field2449[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2456[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2456[var23][var27] = var25 += var4.method2328();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2460[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2455 = new int[var8 + 1][];
        this.field2462 = new class167[var8 + 1];
        for (int var29 = 0; var29 < this.field2465; var29++) {
            int var30 = this.field2458[var29];
            int var31 = this.field2449[var30];
            this.field2455[var30] = new int[this.field2460[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2455[var30][this.field2456[var30][var32]] = var4.method2489();
            }
            this.field2462[var30] = new class167(this.field2455[var30]);
        }
    }

    @ObfuscatedName("ew.j(II)V")
    public void method2834(int arg0) {
    }

    @ObfuscatedName("ew.f(IIB)[B")
    public byte[] method2821(int arg0, int arg1) {
        return this.method2832(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ew.y(II[IB)[B")
    public byte[] method2832(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2460.length || this.field2460[arg0] == null || arg1 < 0 || arg1 >= this.field2460[arg0].length) {
            return null;
        }
        if (this.field2460[arg0][arg1] == null) {
            boolean var4 = this.method2835(arg0, arg2);
            if (!var4) {
                this.method2829(arg0);
                boolean var5 = this.method2835(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class118.method2195(this.field2460[arg0][arg1], false);
        if (this.field2464) {
            this.field2460[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ew.x(III)Z")
    public boolean method2823(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2460.length || this.field2460[arg0] == null || arg1 < 0 || arg1 >= this.field2460[arg0].length) {
            return false;
        } else if (this.field2460[arg0][arg1] != null) {
            return true;
        } else if (this.field2459[arg0] == null) {
            this.method2829(arg0);
            return this.field2459[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ew.e(II)Z")
    public boolean method2862(int arg0) {
        if (this.field2459[arg0] == null) {
            this.method2829(arg0);
            return this.field2459[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ew.m(I)Z")
    public boolean method2825() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2458.length; var2++) {
            int var3 = this.field2458[var2];
            if (this.field2459[var3] == null) {
                this.method2829(var3);
                if (this.field2459[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ew.s(II)[B")
    public byte[] method2826(int arg0) {
        if (this.field2460.length == 1) {
            return this.method2821(0, arg0);
        } else if (this.field2460[arg0].length == 1) {
            return this.method2821(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ew.p(III)[B")
    public byte[] method2827(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2460.length || this.field2460[arg0] == null || arg1 < 0 || arg1 >= this.field2460[arg0].length) {
            return null;
        }
        if (this.field2460[arg0][arg1] == null) {
            boolean var3 = this.method2835(arg0, (int[]) null);
            if (!var3) {
                this.method2829(arg0);
                boolean var4 = this.method2835(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class118.method2195(this.field2460[arg0][arg1], false);
    }

    @ObfuscatedName("ew.w(II)[B")
    public byte[] method2828(int arg0) {
        if (this.field2460.length == 1) {
            return this.method2827(0, arg0);
        } else if (this.field2460[arg0].length == 1) {
            return this.method2827(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ew.r(II)V")
    public void method2829(int arg0) {
    }

    @ObfuscatedName("ew.n(II)[I")
    public int[] method2830(int arg0) {
        return this.field2456[arg0];
    }

    @ObfuscatedName("ew.b(IB)I")
    public int method2866(int arg0) {
        return this.field2460[arg0].length;
    }

    @ObfuscatedName("ew.z(I)I")
    public int method2839() {
        return this.field2460.length;
    }

    @ObfuscatedName("ew.h(II)V")
    public void method2833(int arg0) {
        for (int var2 = 0; var2 < this.field2460[arg0].length; var2++) {
            this.field2460[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ew.q(B)V")
    public void method2819() {
        for (int var1 = 0; var1 < this.field2460.length; var1++) {
            if (this.field2460[var1] != null) {
                for (int var2 = 0; var2 < this.field2460[var1].length; var2++) {
                    this.field2460[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ew.l(I[II)Z")
    public boolean method2835(int arg0, int[] arg1) {
        if (this.field2459[arg0] == null) {
            return false;
        }
        int var3 = this.field2449[arg0];
        int[] var4 = this.field2456[arg0];
        Object[] var5 = this.field2460[arg0];
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
            var8 = class118.method2195(this.field2459[arg0], true);
            class125 var9 = new class125(var8);
            var9.method2431(arg1, 5, var9.field2002.length);
        } else {
            var8 = class118.method2195(this.field2459[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method652(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class125.method719(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class125.method719(var8, 0, var18);
            throw class79.method2075(var35, var17 + var19 + "," + this.field2453[arg0] + "," + this.field2457);
        }
        if (this.field2450) {
            this.field2459[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class125 var23 = new class125(var10);
            int[] var24 = new int[var3];
            var23.field2003 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2489();
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
                    var32 += var23.method2489();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2464) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class118.method1297(var28[var34], false);
                }
            }
        } else if (this.field2464) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class118.method1297(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ew.t(Ljava/lang/String;B)I")
    public int method2836(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2452.method3082(class146.method1558(var2));
    }

    @ObfuscatedName("ew.g(ILjava/lang/String;B)I")
    public int method2844(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2462[arg0].method3082(class146.method1558(var3));
    }

    @ObfuscatedName("ew.a(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2850(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2452.method3082(class146.method1558(var3));
        int var6 = this.field2462[var5].method3082(class146.method1558(var4));
        return this.method2821(var5, var6);
    }

    @ObfuscatedName("ew.v(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2822(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2452.method3082(class146.method1558(var3));
        int var6 = this.field2462[var5].method3082(class146.method1558(var4));
        return this.method2823(var5, var6);
    }

    @ObfuscatedName("ew.i(Ljava/lang/String;I)V")
    public void method2856(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2452.method3082(class146.method1558(var2));
        if (var3 >= 0) {
            this.method2834(var3);
        }
    }

    @ObfuscatedName("ae.k([BI)[B")
    public static final byte[] method652(byte[] arg0) {
        class125 var1 = new class125(arg0);
        int var2 = var1.method2326();
        int var3 = var1.method2489();
        if (var3 < 0 || !(field2463 == 0 || var3 <= field2463)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2337(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2489();
            if (var5 < 0 || field2463 != 0 && var5 > field2463) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class122.method2278(var6, var5, arg0, var3, 9);
            } else {
                field2461.method2255(var1, var6);
            }
            return var6;
        }
    }
}
