package deob;

@ObfuscatedName("em")
public abstract class class154 {

    @ObfuscatedName("em.l")
    public int field2539;

    @ObfuscatedName("em.b")
    public int[] field2526;

    @ObfuscatedName("em.o")
    public int[] field2522;

    @ObfuscatedName("em.w")
    public class170 field2523;

    @ObfuscatedName("em.r")
    public int[] field2524;

    @ObfuscatedName("em.k")
    public int[] field2525;

    @ObfuscatedName("em.z")
    public int[] field2535;

    @ObfuscatedName("em.g")
    public int[][] field2538;

    @ObfuscatedName("em.n")
    public int[][] field2528;

    @ObfuscatedName("em.j")
    public class170[] field2529;

    @ObfuscatedName("em.c")
    public Object[] field2530;

    @ObfuscatedName("em.m")
    public Object[][] field2527;

    @ObfuscatedName("em.a")
    public static class122 field2532 = new class122();

    @ObfuscatedName("em.e")
    public int field2533;

    @ObfuscatedName("em.q")
    public boolean field2534;

    @ObfuscatedName("em.y")
    public boolean field2531;

    @ObfuscatedName("em.v")
    public static int field2536 = 0;

    public class154(boolean arg0, boolean arg1) {
        this.field2534 = arg0;
        this.field2531 = arg1;
    }

    @ObfuscatedName("em.l([BI)V")
    public void method3027(byte[] arg0) {
        this.field2533 = class127.method1591(arg0, arg0.length);
        class127 var2 = new class127(method2202(arg0));
        int var3 = var2.method2440();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2586();
        }
        int var4 = var2.method2440();
        if (var3 >= 7) {
            this.field2539 = var2.method2525();
        } else {
            this.field2539 = var2.method2442();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2526 = new int[this.field2539];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2539; var7++) {
                this.field2526[var7] = var5 += var2.method2525();
                if (this.field2526[var7] > var6) {
                    var6 = this.field2526[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2539; var8++) {
                this.field2526[var8] = var5 += var2.method2442();
                if (this.field2526[var8] > var6) {
                    var6 = this.field2526[var8];
                }
            }
        }
        this.field2524 = new int[var6 + 1];
        this.field2525 = new int[var6 + 1];
        this.field2535 = new int[var6 + 1];
        this.field2538 = new int[var6 + 1][];
        this.field2530 = new Object[var6 + 1];
        this.field2527 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2522 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2539; var9++) {
                this.field2522[this.field2526[var9]] = var2.method2586();
            }
            this.field2523 = new class170(this.field2522);
        }
        for (int var10 = 0; var10 < this.field2539; var10++) {
            this.field2524[this.field2526[var10]] = var2.method2586();
        }
        for (int var11 = 0; var11 < this.field2539; var11++) {
            this.field2525[this.field2526[var11]] = var2.method2586();
        }
        for (int var12 = 0; var12 < this.field2539; var12++) {
            this.field2535[this.field2526[var12]] = var2.method2442();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2539; var13++) {
                int var14 = this.field2526[var13];
                int var15 = this.field2535[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2538[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2538[var14][var18] = var16 += var2.method2525();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2527[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2539; var20++) {
                int var21 = this.field2526[var20];
                int var22 = this.field2535[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2538[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2538[var21][var25] = var23 += var2.method2442();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2527[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2528 = new int[var6 + 1][];
        this.field2529 = new class170[var6 + 1];
        for (int var27 = 0; var27 < this.field2539; var27++) {
            int var28 = this.field2526[var27];
            int var29 = this.field2535[var28];
            this.field2528[var28] = new int[this.field2527[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2528[var28][this.field2538[var28][var30]] = var2.method2586();
            }
            this.field2529[var28] = new class170(this.field2528[var28]);
        }
    }

    @ObfuscatedName("em.b(IS)V")
    public void method3028(int arg0) {
    }

    @ObfuscatedName("em.o(III)[B")
    public byte[] method3029(int arg0, int arg1) {
        return this.method3065(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("em.w(II[II)[B")
    public byte[] method3065(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2527.length || this.field2527[arg0] == null || arg1 < 0 || arg1 >= this.field2527[arg0].length) {
            return null;
        }
        if (this.field2527[arg0][arg1] == null) {
            boolean var4 = this.method3043(arg0, arg2);
            if (!var4) {
                this.method3037(arg0);
                boolean var5 = this.method3043(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method2199(this.field2527[arg0][arg1], false);
        if (this.field2531) {
            this.field2527[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("em.r(IIS)Z")
    public boolean method3031(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2527.length || this.field2527[arg0] == null || arg1 < 0 || arg1 >= this.field2527[arg0].length) {
            return false;
        } else if (this.field2527[arg0][arg1] != null) {
            return true;
        } else if (this.field2530[arg0] == null) {
            this.method3037(arg0);
            return this.field2530[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("em.k(IB)Z")
    public boolean method3032(int arg0) {
        if (this.field2530[arg0] == null) {
            this.method3037(arg0);
            return this.field2530[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("em.z(B)Z")
    public boolean method3058() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2526.length; var2++) {
            int var3 = this.field2526[var2];
            if (this.field2530[var3] == null) {
                this.method3037(var3);
                if (this.field2530[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("em.g(II)[B")
    public byte[] method3034(int arg0) {
        if (this.field2527.length == 1) {
            return this.method3029(0, arg0);
        } else if (this.field2527[arg0].length == 1) {
            return this.method3029(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("em.n(IIB)[B")
    public byte[] method3084(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2527.length || this.field2527[arg0] == null || arg1 < 0 || arg1 >= this.field2527[arg0].length) {
            return null;
        }
        if (this.field2527[arg0][arg1] == null) {
            boolean var3 = this.method3043(arg0, (int[]) null);
            if (!var3) {
                this.method3037(arg0);
                boolean var4 = this.method3043(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method2199(this.field2527[arg0][arg1], false);
    }

    @ObfuscatedName("em.j(II)[B")
    public byte[] method3036(int arg0) {
        if (this.field2527.length == 1) {
            return this.method3084(0, arg0);
        } else if (this.field2527[arg0].length == 1) {
            return this.method3084(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("em.c(II)V")
    public void method3037(int arg0) {
    }

    @ObfuscatedName("em.m(II)[I")
    public int[] method3038(int arg0) {
        return this.field2538[arg0];
    }

    @ObfuscatedName("em.a(IB)I")
    public int method3074(int arg0) {
        return this.field2527[arg0].length;
    }

    @ObfuscatedName("em.e(B)I")
    public int method3026() {
        return this.field2527.length;
    }

    @ObfuscatedName("em.q(IB)V")
    public void method3067(int arg0) {
        for (int var2 = 0; var2 < this.field2527[arg0].length; var2++) {
            this.field2527[arg0][var2] = null;
        }
    }

    @ObfuscatedName("em.y(B)V")
    public void method3042() {
        for (int var1 = 0; var1 < this.field2527.length; var1++) {
            if (this.field2527[var1] != null) {
                for (int var2 = 0; var2 < this.field2527[var1].length; var2++) {
                    this.field2527[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("em.v(I[IB)Z")
    public boolean method3043(int arg0, int[] arg1) {
        if (this.field2530[arg0] == null) {
            return false;
        }
        int var3 = this.field2535[arg0];
        int[] var4 = this.field2538[arg0];
        Object[] var5 = this.field2527[arg0];
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
            var8 = class119.method2199(this.field2530[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2554(arg1, 5, var9.field2024.length);
        } else {
            var8 = class119.method2199(this.field2530[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2202(var8);
        } catch (RuntimeException var27) {
            throw class80.method7(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class127.method1591(var8, var8.length) + "," + class127.method1591(var8, var8.length - 2) + "," + this.field2524[arg0] + "," + this.field2533);
        }
        if (this.field2534) {
            this.field2530[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class127 var15 = new class127(var10);
            int[] var16 = new int[var3];
            var15.field2022 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2586();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2022 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2586();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2531) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class119.method2204(var20[var26], false);
                }
            }
        } else if (this.field2531) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method2204(var10, false);
        }
        return true;
    }

    @ObfuscatedName("em.s(Ljava/lang/String;B)I")
    public int method3062(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2523.method3249(class149.method2223(var2));
    }

    @ObfuscatedName("em.u(ILjava/lang/String;I)I")
    public int method3044(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2529[arg0].method3249(class149.method2223(var3));
    }

    @ObfuscatedName("em.d(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3046(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2523.method3249(class149.method2223(var3));
        int var6 = this.field2529[var5].method3249(class149.method2223(var4));
        return this.method3029(var5, var6);
    }

    @ObfuscatedName("em.i(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3047(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2523.method3249(class149.method2223(var3));
        int var6 = this.field2529[var5].method3249(class149.method2223(var4));
        return this.method3031(var5, var6);
    }

    @ObfuscatedName("em.p(Ljava/lang/String;B)V")
    public void method3048(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2523.method3249(class149.method2223(var2));
        if (var3 >= 0) {
            this.method3028(var3);
        }
    }

    @ObfuscatedName("dp.h([BI)[B")
    public static final byte[] method2202(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2440();
        int var3 = var1.method2586();
        if (var3 < 0 || !(field2536 == 0 || var3 <= field2536)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2615(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2586();
            if (var5 < 0 || field2536 != 0 && var5 > field2536) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2405(var6, var5, arg0, var3, 9);
            } else {
                field2532.method2372(var1, var6);
            }
            return var6;
        }
    }
}
