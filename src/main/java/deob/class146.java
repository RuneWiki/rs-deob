package deob;

@ObfuscatedName("er")
public abstract class class146 {

    @ObfuscatedName("er.i")
    public int field2445;

    @ObfuscatedName("er.c")
    public int[] field2459;

    @ObfuscatedName("er.h")
    public int[] field2446;

    @ObfuscatedName("er.v")
    public class170 field2448;

    @ObfuscatedName("er.q")
    public int[] field2451;

    @ObfuscatedName("er.s")
    public int[] field2450;

    @ObfuscatedName("er.g")
    public int[] field2449;

    @ObfuscatedName("er.u")
    public int[][] field2452;

    @ObfuscatedName("er.d")
    public int[][] field2453;

    @ObfuscatedName("er.y")
    public class170[] field2454;

    @ObfuscatedName("er.e")
    public Object[] field2455;

    @ObfuscatedName("er.l")
    public Object[][] field2456;

    @ObfuscatedName("er.o")
    public static class104 field2457 = new class104();

    @ObfuscatedName("er.w")
    public int field2458;

    @ObfuscatedName("er.t")
    public boolean field2447;

    @ObfuscatedName("er.z")
    public boolean field2460;

    @ObfuscatedName("er.b")
    public static int field2461 = 0;

    public class146(boolean arg0, boolean arg1) {
        this.field2447 = arg0;
        this.field2460 = arg1;
    }

    @ObfuscatedName("er.i([BB)V")
    public void method2798(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class107.field1838[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2458 = var5;
        class107 var8 = new class107(method5(arg0));
        int var9 = var8.method2151();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2156();
        }
        int var10 = var8.method2151();
        if (var9 >= 7) {
            this.field2445 = var8.method2165();
        } else {
            this.field2445 = var8.method2313();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2459 = new int[this.field2445];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2445; var13++) {
                this.field2459[var13] = var11 += var8.method2165();
                if (this.field2459[var13] > var12) {
                    var12 = this.field2459[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2445; var14++) {
                this.field2459[var14] = var11 += var8.method2313();
                if (this.field2459[var14] > var12) {
                    var12 = this.field2459[var14];
                }
            }
        }
        this.field2451 = new int[var12 + 1];
        this.field2450 = new int[var12 + 1];
        this.field2449 = new int[var12 + 1];
        this.field2452 = new int[var12 + 1][];
        this.field2455 = new Object[var12 + 1];
        this.field2456 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2446 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2445; var15++) {
                this.field2446[this.field2459[var15]] = var8.method2156();
            }
            this.field2448 = new class170(this.field2446);
        }
        for (int var16 = 0; var16 < this.field2445; var16++) {
            this.field2451[this.field2459[var16]] = var8.method2156();
        }
        for (int var17 = 0; var17 < this.field2445; var17++) {
            this.field2450[this.field2459[var17]] = var8.method2156();
        }
        for (int var18 = 0; var18 < this.field2445; var18++) {
            this.field2449[this.field2459[var18]] = var8.method2313();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2445; var19++) {
                int var20 = this.field2459[var19];
                int var21 = this.field2449[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2452[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2452[var20][var24] = var22 += var8.method2165();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2456[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2445; var26++) {
                int var27 = this.field2459[var26];
                int var28 = this.field2449[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2452[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2452[var27][var31] = var29 += var8.method2313();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2456[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2453 = new int[var12 + 1][];
        this.field2454 = new class170[var12 + 1];
        for (int var33 = 0; var33 < this.field2445; var33++) {
            int var34 = this.field2459[var33];
            int var35 = this.field2449[var34];
            this.field2453[var34] = new int[this.field2456[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2453[var34][this.field2452[var34][var36]] = var8.method2156();
            }
            this.field2454[var34] = new class170(this.field2453[var34]);
        }
    }

    @ObfuscatedName("er.c(II)V")
    public void method2739(int arg0) {
    }

    @ObfuscatedName("er.h(III)[B")
    public byte[] method2811(int arg0, int arg1) {
        return this.method2741(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("er.v(II[IB)[B")
    public byte[] method2741(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2456.length || this.field2456[arg0] == null || arg1 < 0 || arg1 >= this.field2456[arg0].length) {
            return null;
        }
        if (this.field2456[arg0][arg1] == null) {
            boolean var4 = this.method2754(arg0, arg2);
            if (!var4) {
                this.method2748(arg0);
                boolean var5 = this.method2754(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = Statics.method1426(this.field2456[arg0][arg1], false);
        if (this.field2460) {
            this.field2456[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("er.q(III)Z")
    public boolean method2742(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2456.length || this.field2456[arg0] == null || arg1 < 0 || arg1 >= this.field2456[arg0].length) {
            return false;
        } else if (this.field2456[arg0][arg1] != null) {
            return true;
        } else if (this.field2455[arg0] == null) {
            this.method2748(arg0);
            return this.field2455[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("er.s(II)Z")
    public boolean method2743(int arg0) {
        if (this.field2455[arg0] == null) {
            this.method2748(arg0);
            return this.field2455[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("er.g(I)Z")
    public boolean method2770() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2459.length; var2++) {
            int var3 = this.field2459[var2];
            if (this.field2455[var3] == null) {
                this.method2748(var3);
                if (this.field2455[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("er.u(IB)[B")
    public byte[] method2745(int arg0) {
        if (this.field2456.length == 1) {
            return this.method2811(0, arg0);
        } else if (this.field2456[arg0].length == 1) {
            return this.method2811(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("er.d(III)[B")
    public byte[] method2746(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2456.length || this.field2456[arg0] == null || arg1 < 0 || arg1 >= this.field2456[arg0].length) {
            return null;
        }
        if (this.field2456[arg0][arg1] == null) {
            boolean var3 = this.method2754(arg0, (int[]) null);
            if (!var3) {
                this.method2748(arg0);
                boolean var4 = this.method2754(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return Statics.method1426(this.field2456[arg0][arg1], false);
    }

    @ObfuscatedName("er.y(II)[B")
    public byte[] method2747(int arg0) {
        if (this.field2456.length == 1) {
            return this.method2746(0, arg0);
        } else if (this.field2456[arg0].length == 1) {
            return this.method2746(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("er.e(II)V")
    public void method2748(int arg0) {
    }

    @ObfuscatedName("er.l(II)[I")
    public int[] method2749(int arg0) {
        return this.field2452[arg0];
    }

    @ObfuscatedName("er.o(II)I")
    public int method2750(int arg0) {
        return this.field2456[arg0].length;
    }

    @ObfuscatedName("er.w(S)I")
    public int method2751() {
        return this.field2456.length;
    }

    @ObfuscatedName("er.t(II)V")
    public void method2752(int arg0) {
        for (int var2 = 0; var2 < this.field2456[arg0].length; var2++) {
            this.field2456[arg0][var2] = null;
        }
    }

    @ObfuscatedName("er.z(I)V")
    public void method2753() {
        for (int var1 = 0; var1 < this.field2456.length; var1++) {
            if (this.field2456[var1] != null) {
                for (int var2 = 0; var2 < this.field2456[var1].length; var2++) {
                    this.field2456[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("er.b(I[II)Z")
    public boolean method2754(int arg0, int[] arg1) {
        if (this.field2455[arg0] == null) {
            return false;
        }
        int var3 = this.field2449[arg0];
        int[] var4 = this.field2452[arg0];
        Object[] var5 = this.field2456[arg0];
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
            var8 = Statics.method1426(this.field2455[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2168(arg1, 5, var9.field1841.length);
        } else {
            var8 = Statics.method1426(this.field2455[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method5(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class107.field1838[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class107.field1838[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class135.method571(var42, var20 + var24 + "," + this.field2451[arg0] + "," + this.field2458);
        }
        if (this.field2447) {
            this.field2455[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class107 var30 = new class107(var10);
            int[] var31 = new int[var3];
            var30.field1837 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method2156();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field1837 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method2156();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field2460) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class112.method1001(var35[var41], false);
                }
            }
        } else if (this.field2460) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method1001(var10, false);
        }
        return true;
    }

    @ObfuscatedName("er.a(Ljava/lang/String;I)I")
    public int method2815(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2448.method3182(class199.method121(var2));
    }

    @ObfuscatedName("er.r(ILjava/lang/String;B)I")
    public int method2756(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2454[arg0].method3182(class199.method121(var3));
    }

    @ObfuscatedName("er.m(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2757(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2448.method3182(class199.method121(var3));
        int var6 = this.field2454[var5].method3182(class199.method121(var4));
        return this.method2811(var5, var6);
    }

    @ObfuscatedName("er.f(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2758(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2448.method3182(class199.method121(var3));
        int var6 = this.field2454[var5].method3182(class199.method121(var4));
        return this.method2742(var5, var6);
    }

    @ObfuscatedName("er.k(Ljava/lang/String;I)Z")
    public boolean method2794(String arg0) {
        int var2 = this.method2815("");
        return var2 == -1 ? this.method2758(arg0, "") : this.method2758("", arg0);
    }

    @ObfuscatedName("er.p(Ljava/lang/String;I)V")
    public void method2760(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2448.method3182(class199.method121(var2));
        if (var3 >= 0) {
            this.method2739(var3);
        }
    }

    @ObfuscatedName("i.n([BI)[B")
    public static final byte[] method5(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2151();
        int var3 = var1.method2156();
        if (var3 < 0 || !(field2461 == 0 || var3 <= field2461)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2162(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2156();
            if (var5 < 0 || field2461 != 0 && var5 > field2461) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2108(var6, var5, arg0, var3, 9);
            } else {
                field2457.method2105(var1, var6);
            }
            return var6;
        }
    }
}
