package deob;

@ObfuscatedName("ey")
public abstract class class153 {

    @ObfuscatedName("ey.c")
    public int field2543;

    @ObfuscatedName("ey.q")
    public int[] field2528;

    @ObfuscatedName("ey.y")
    public int[] field2529;

    @ObfuscatedName("ey.v")
    public class169 field2535;

    @ObfuscatedName("ey.g")
    public int[] field2531;

    @ObfuscatedName("ey.x")
    public int[] field2532;

    @ObfuscatedName("ey.u")
    public int[] field2533;

    @ObfuscatedName("ey.l")
    public int[][] field2534;

    @ObfuscatedName("ey.a")
    public int[][] field2537;

    @ObfuscatedName("ey.h")
    public class169[] field2536;

    @ObfuscatedName("ey.t")
    public Object[] field2538;

    @ObfuscatedName("ey.m")
    public Object[][] field2544;

    @ObfuscatedName("ey.s")
    public static class122 field2527 = new class122();

    @ObfuscatedName("ey.j")
    public int field2540;

    @ObfuscatedName("ey.b")
    public boolean field2541;

    @ObfuscatedName("ey.n")
    public boolean field2542;

    @ObfuscatedName("ey.z")
    public static int field2539 = 0;

    public class153(boolean arg0, boolean arg1) {
        this.field2541 = arg0;
        this.field2542 = arg1;
    }

    @ObfuscatedName("ey.c([BB)V")
    public void method2914(byte[] arg0) {
        this.field2540 = class127.method793(arg0, arg0.length);
        class127 var2 = new class127(method730(arg0));
        int var3 = var2.method2383();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2323();
        }
        int var4 = var2.method2383();
        if (var3 >= 7) {
            this.field2543 = var2.method2332();
        } else {
            this.field2543 = var2.method2327();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2528 = new int[this.field2543];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2543; var7++) {
                this.field2528[var7] = var5 += var2.method2332();
                if (this.field2528[var7] > var6) {
                    var6 = this.field2528[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2543; var8++) {
                this.field2528[var8] = var5 += var2.method2327();
                if (this.field2528[var8] > var6) {
                    var6 = this.field2528[var8];
                }
            }
        }
        this.field2531 = new int[var6 + 1];
        this.field2532 = new int[var6 + 1];
        this.field2533 = new int[var6 + 1];
        this.field2534 = new int[var6 + 1][];
        this.field2538 = new Object[var6 + 1];
        this.field2544 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2529 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2543; var9++) {
                this.field2529[this.field2528[var9]] = var2.method2323();
            }
            this.field2535 = new class169(this.field2529);
        }
        for (int var10 = 0; var10 < this.field2543; var10++) {
            this.field2531[this.field2528[var10]] = var2.method2323();
        }
        for (int var11 = 0; var11 < this.field2543; var11++) {
            this.field2532[this.field2528[var11]] = var2.method2323();
        }
        for (int var12 = 0; var12 < this.field2543; var12++) {
            this.field2533[this.field2528[var12]] = var2.method2327();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2543; var13++) {
                int var14 = this.field2528[var13];
                int var15 = this.field2533[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2534[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2534[var14][var18] = var16 += var2.method2332();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2544[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2543; var20++) {
                int var21 = this.field2528[var20];
                int var22 = this.field2533[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2534[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2534[var21][var25] = var23 += var2.method2327();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2544[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2537 = new int[var6 + 1][];
        this.field2536 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2543; var27++) {
            int var28 = this.field2528[var27];
            int var29 = this.field2533[var28];
            this.field2537[var28] = new int[this.field2544[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2537[var28][this.field2534[var28][var30]] = var2.method2323();
            }
            this.field2536[var28] = new class169(this.field2537[var28]);
        }
    }

    @ObfuscatedName("ey.q(II)V")
    public void method2885(int arg0) {
    }

    @ObfuscatedName("ey.y(IIB)[B")
    public byte[] method2886(int arg0, int arg1) {
        return this.method2942(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ey.v(II[IB)[B")
    public byte[] method2942(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2544.length || this.field2544[arg0] == null || arg1 < 0 || arg1 >= this.field2544[arg0].length) {
            return null;
        }
        if (this.field2544[arg0][arg1] == null) {
            boolean var4 = this.method2900(arg0, arg2);
            if (!var4) {
                this.method2894(arg0);
                boolean var5 = this.method2900(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method1778(this.field2544[arg0][arg1], false);
        if (this.field2542) {
            this.field2544[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ey.g(IIB)Z")
    public boolean method2888(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2544.length || this.field2544[arg0] == null || arg1 < 0 || arg1 >= this.field2544[arg0].length) {
            return false;
        } else if (this.field2544[arg0][arg1] != null) {
            return true;
        } else if (this.field2538[arg0] == null) {
            this.method2894(arg0);
            return this.field2538[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ey.x(II)Z")
    public boolean method2889(int arg0) {
        if (this.field2538[arg0] == null) {
            this.method2894(arg0);
            return this.field2538[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ey.u(B)Z")
    public boolean method2896() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2528.length; var2++) {
            int var3 = this.field2528[var2];
            if (this.field2538[var3] == null) {
                this.method2894(var3);
                if (this.field2538[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ey.l(II)[B")
    public byte[] method2936(int arg0) {
        if (this.field2544.length == 1) {
            return this.method2886(0, arg0);
        } else if (this.field2544[arg0].length == 1) {
            return this.method2886(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ey.a(IIB)[B")
    public byte[] method2892(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2544.length || this.field2544[arg0] == null || arg1 < 0 || arg1 >= this.field2544[arg0].length) {
            return null;
        }
        if (this.field2544[arg0][arg1] == null) {
            boolean var3 = this.method2900(arg0, (int[]) null);
            if (!var3) {
                this.method2894(arg0);
                boolean var4 = this.method2900(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method1778(this.field2544[arg0][arg1], false);
    }

    @ObfuscatedName("ey.h(II)[B")
    public byte[] method2947(int arg0) {
        if (this.field2544.length == 1) {
            return this.method2892(0, arg0);
        } else if (this.field2544[arg0].length == 1) {
            return this.method2892(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ey.t(II)V")
    public void method2894(int arg0) {
    }

    @ObfuscatedName("ey.m(IB)[I")
    public int[] method2951(int arg0) {
        return this.field2534[arg0];
    }

    @ObfuscatedName("ey.s(IB)I")
    public int method2956(int arg0) {
        return this.field2544[arg0].length;
    }

    @ObfuscatedName("ey.j(B)I")
    public int method2897() {
        return this.field2544.length;
    }

    @ObfuscatedName("ey.b(II)V")
    public void method2911(int arg0) {
        for (int var2 = 0; var2 < this.field2544[arg0].length; var2++) {
            this.field2544[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ey.n(I)V")
    public void method2899() {
        for (int var1 = 0; var1 < this.field2544.length; var1++) {
            if (this.field2544[var1] != null) {
                for (int var2 = 0; var2 < this.field2544[var1].length; var2++) {
                    this.field2544[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ey.z(I[II)Z")
    public boolean method2900(int arg0, int[] arg1) {
        if (this.field2538[arg0] == null) {
            return false;
        }
        int var3 = this.field2533[arg0];
        int[] var4 = this.field2534[arg0];
        Object[] var5 = this.field2544[arg0];
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
            var8 = class119.method1778(this.field2538[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2371(arg1, 5, var9.field2057.length);
        } else {
            var8 = class119.method1778(this.field2538[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method730(var8);
        } catch (RuntimeException var31) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class127.method28(var8, 0, var14);
            throw class80.method1354(var31, var13 + var15 + "," + class127.method793(var8, var8.length - 2) + "," + this.field2531[arg0] + "," + this.field2540);
        }
        if (this.field2541) {
            this.field2538[arg0] = null;
        }
        if (var3 > 1) {
            int var16 = var10.length;
            int var32 = var16 - 1;
            int var17 = var10[var32] & 0xFF;
            int var18 = var32 - var3 * var17 * 4;
            class127 var19 = new class127(var10);
            int[] var20 = new int[var3];
            var19.field2052 = var18;
            for (int var21 = 0; var21 < var17; var21++) {
                int var22 = 0;
                for (int var23 = 0; var23 < var3; var23++) {
                    var22 += var19.method2323();
                    var20[var23] += var22;
                }
            }
            byte[][] var24 = new byte[var3][];
            for (int var25 = 0; var25 < var3; var25++) {
                var24[var25] = new byte[var20[var25]];
                var20[var25] = 0;
            }
            var19.field2052 = var18;
            int var26 = 0;
            for (int var27 = 0; var27 < var17; var27++) {
                int var28 = 0;
                for (int var29 = 0; var29 < var3; var29++) {
                    var28 += var19.method2323();
                    System.arraycopy(var10, var26, var24[var29], var20[var29], var28);
                    var20[var29] += var28;
                    var26 += var28;
                }
            }
            for (int var30 = 0; var30 < var3; var30++) {
                if (this.field2542) {
                    var5[var4[var30]] = var24[var30];
                } else {
                    var5[var4[var30]] = class119.method858(var24[var30], false);
                }
            }
        } else if (this.field2542) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method858(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ey.d(Ljava/lang/String;I)I")
    public int method2901(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2535.method3087(class148.method1954(var2));
    }

    @ObfuscatedName("ey.f(ILjava/lang/String;B)I")
    public int method2948(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2536[arg0].method3087(class148.method1954(var3));
    }

    @ObfuscatedName("ey.o(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2895(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2535.method3087(class148.method1954(var3));
        int var6 = this.field2536[var5].method3087(class148.method1954(var4));
        return this.method2886(var5, var6);
    }

    @ObfuscatedName("ey.r(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2902(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2535.method3087(class148.method1954(var3));
        int var6 = this.field2536[var5].method3087(class148.method1954(var4));
        return this.method2888(var5, var6);
    }

    @ObfuscatedName("ey.k(Ljava/lang/String;B)V")
    public void method2905(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2535.method3087(class148.method1954(var2));
        if (var3 >= 0) {
            this.method2885(var3);
        }
    }

    @ObfuscatedName("ad.w([BB)[B")
    public static final byte[] method730(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2383();
        int var3 = var1.method2323();
        if (var3 < 0 || !(field2539 == 0 || var3 <= field2539)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2329(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2323();
            if (var5 < 0 || field2539 != 0 && var5 > field2539) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2278(var6, var5, arg0, var3, 9);
            } else {
                field2527.method2264(var1, var6);
            }
            return var6;
        }
    }
}
