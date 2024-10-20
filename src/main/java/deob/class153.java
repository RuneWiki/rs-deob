package deob;

@ObfuscatedName("ej")
public abstract class class153 {

    @ObfuscatedName("ej.b")
    public int field2526;

    @ObfuscatedName("ej.e")
    public int[] field2519;

    @ObfuscatedName("ej.g")
    public int[] field2529;

    @ObfuscatedName("ej.o")
    public class169 field2521;

    @ObfuscatedName("ej.a")
    public int[] field2522;

    @ObfuscatedName("ej.h")
    public int[] field2523;

    @ObfuscatedName("ej.j")
    public int[] field2524;

    @ObfuscatedName("ej.f")
    public int[][] field2525;

    @ObfuscatedName("ej.q")
    public int[][] field2534;

    @ObfuscatedName("ej.l")
    public class169[] field2527;

    @ObfuscatedName("ej.d")
    public Object[] field2528;

    @ObfuscatedName("ej.z")
    public Object[][] field2518;

    @ObfuscatedName("ej.n")
    public static class122 field2530 = new class122();

    @ObfuscatedName("ej.t")
    public int field2531;

    @ObfuscatedName("ej.w")
    public boolean field2532;

    @ObfuscatedName("ej.r")
    public boolean field2533;

    @ObfuscatedName("ej.x")
    public static int field2537 = 0;

    public class153(boolean arg0, boolean arg1) {
        this.field2532 = arg0;
        this.field2533 = arg1;
    }

    @ObfuscatedName("ej.b([BI)V")
    public void method3035(byte[] arg0) {
        this.field2531 = class126.method2018(arg0, arg0.length);
        class126 var2 = new class126(method803(arg0));
        int var3 = var2.method2436();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2439();
        }
        int var4 = var2.method2436();
        if (var3 >= 7) {
            this.field2526 = var2.method2555();
        } else {
            this.field2526 = var2.method2572();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2519 = new int[this.field2526];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2526; var7++) {
                this.field2519[var7] = var5 += var2.method2555();
                if (this.field2519[var7] > var6) {
                    var6 = this.field2519[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2526; var8++) {
                this.field2519[var8] = var5 += var2.method2572();
                if (this.field2519[var8] > var6) {
                    var6 = this.field2519[var8];
                }
            }
        }
        this.field2522 = new int[var6 + 1];
        this.field2523 = new int[var6 + 1];
        this.field2524 = new int[var6 + 1];
        this.field2525 = new int[var6 + 1][];
        this.field2528 = new Object[var6 + 1];
        this.field2518 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2529 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2526; var9++) {
                this.field2529[this.field2519[var9]] = var2.method2439();
            }
            this.field2521 = new class169(this.field2529);
        }
        for (int var10 = 0; var10 < this.field2526; var10++) {
            this.field2522[this.field2519[var10]] = var2.method2439();
        }
        for (int var11 = 0; var11 < this.field2526; var11++) {
            this.field2523[this.field2519[var11]] = var2.method2439();
        }
        for (int var12 = 0; var12 < this.field2526; var12++) {
            this.field2524[this.field2519[var12]] = var2.method2572();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2526; var13++) {
                int var14 = this.field2519[var13];
                int var15 = this.field2524[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2525[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2525[var14][var18] = var16 += var2.method2555();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2518[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2526; var20++) {
                int var21 = this.field2519[var20];
                int var22 = this.field2524[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2525[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2525[var21][var25] = var23 += var2.method2572();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2518[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2534 = new int[var6 + 1][];
        this.field2527 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2526; var27++) {
            int var28 = this.field2519[var27];
            int var29 = this.field2524[var28];
            this.field2534[var28] = new int[this.field2518[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2534[var28][this.field2525[var28][var30]] = var2.method2439();
            }
            this.field2527[var28] = new class169(this.field2534[var28]);
        }
    }

    @ObfuscatedName("ej.e(IB)V")
    public void method3010(int arg0) {
    }

    @ObfuscatedName("ej.g(III)[B")
    public byte[] method3026(int arg0, int arg1) {
        return this.method2997(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ej.o(II[IB)[B")
    public byte[] method2997(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2518.length || this.field2518[arg0] == null || arg1 < 0 || arg1 >= this.field2518[arg0].length) {
            return null;
        }
        if (this.field2518[arg0][arg1] == null) {
            boolean var4 = this.method3062(arg0, arg2);
            if (!var4) {
                this.method3004(arg0);
                boolean var5 = this.method3062(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method1346(this.field2518[arg0][arg1], false);
        if (this.field2533) {
            this.field2518[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ej.a(III)Z")
    public boolean method2998(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2518.length || this.field2518[arg0] == null || arg1 < 0 || arg1 >= this.field2518[arg0].length) {
            return false;
        } else if (this.field2518[arg0][arg1] != null) {
            return true;
        } else if (this.field2528[arg0] == null) {
            this.method3004(arg0);
            return this.field2528[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ej.h(II)Z")
    public boolean method2999(int arg0) {
        if (this.field2528[arg0] == null) {
            this.method3004(arg0);
            return this.field2528[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ej.j(I)Z")
    public boolean method3000() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2519.length; var2++) {
            int var3 = this.field2519[var2];
            if (this.field2528[var3] == null) {
                this.method3004(var3);
                if (this.field2528[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ej.f(IB)[B")
    public byte[] method3037(int arg0) {
        if (this.field2518.length == 1) {
            return this.method3026(0, arg0);
        } else if (this.field2518[arg0].length == 1) {
            return this.method3026(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ej.q(IIB)[B")
    public byte[] method3054(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2518.length || this.field2518[arg0] == null || arg1 < 0 || arg1 >= this.field2518[arg0].length) {
            return null;
        }
        if (this.field2518[arg0][arg1] == null) {
            boolean var3 = this.method3062(arg0, (int[]) null);
            if (!var3) {
                this.method3004(arg0);
                boolean var4 = this.method3062(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method1346(this.field2518[arg0][arg1], false);
    }

    @ObfuscatedName("ej.l(II)[B")
    public byte[] method3044(int arg0) {
        if (this.field2518.length == 1) {
            return this.method3054(0, arg0);
        } else if (this.field2518[arg0].length == 1) {
            return this.method3054(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ej.d(II)V")
    public void method3004(int arg0) {
    }

    @ObfuscatedName("ej.z(II)[I")
    public int[] method3002(int arg0) {
        return this.field2525[arg0];
    }

    @ObfuscatedName("ej.n(II)I")
    public int method3006(int arg0) {
        return this.field2518[arg0].length;
    }

    @ObfuscatedName("ej.t(I)I")
    public int method2996() {
        return this.field2518.length;
    }

    @ObfuscatedName("ej.w(II)V")
    public void method3008(int arg0) {
        for (int var2 = 0; var2 < this.field2518[arg0].length; var2++) {
            this.field2518[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ej.r(I)V")
    public void method3009() {
        for (int var1 = 0; var1 < this.field2518.length; var1++) {
            if (this.field2518[var1] != null) {
                for (int var2 = 0; var2 < this.field2518[var1].length; var2++) {
                    this.field2518[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ej.x(I[II)Z")
    public boolean method3062(int arg0, int[] arg1) {
        if (this.field2528[arg0] == null) {
            return false;
        }
        int var3 = this.field2524[arg0];
        int[] var4 = this.field2525[arg0];
        Object[] var5 = this.field2518[arg0];
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
            var8 = class119.method1346(this.field2528[arg0], true);
            class126 var9 = new class126(var8);
            var9.method2599(arg1, 5, var9.field2026.length);
        } else {
            var8 = class119.method1346(this.field2528[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method803(var8);
        } catch (RuntimeException var27) {
            throw Statics.method137(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class126.method2018(var8, var8.length) + "," + class126.method2018(var8, var8.length - 2) + "," + this.field2522[arg0] + "," + this.field2531);
        }
        if (this.field2532) {
            this.field2528[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class126 var15 = new class126(var10);
            int[] var16 = new int[var3];
            var15.field2027 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2439();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2027 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2439();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2533) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class119.method1331(var20[var26], false);
                }
            }
        } else if (this.field2533) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method1331(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ej.v(Ljava/lang/String;I)I")
    public int method3011(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2521.method3243(class148.method2206(var2));
    }

    @ObfuscatedName("ej.y(ILjava/lang/String;I)I")
    public int method3012(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2527[arg0].method3243(class148.method2206(var3));
    }

    @ObfuscatedName("ej.k(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3013(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2521.method3243(class148.method2206(var3));
        int var6 = this.field2527[var5].method3243(class148.method2206(var4));
        return this.method3026(var5, var6);
    }

    @ObfuscatedName("ej.p(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3014(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2521.method3243(class148.method2206(var3));
        int var6 = this.field2527[var5].method3243(class148.method2206(var4));
        return this.method2998(var5, var6);
    }

    @ObfuscatedName("ej.s(Ljava/lang/String;I)V")
    public void method3015(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2521.method3243(class148.method2206(var2));
        if (var3 >= 0) {
            this.method3010(var3);
        }
    }

    @ObfuscatedName("ay.m([BI)[B")
    public static final byte[] method803(byte[] arg0) {
        class126 var1 = new class126(arg0);
        int var2 = var1.method2436();
        int var3 = var1.method2439();
        if (var3 < 0 || !(field2537 == 0 || var3 <= field2537)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2466(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2439();
            if (var5 < 0 || field2537 != 0 && var5 > field2537) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2380(var6, var5, arg0, var3, 9);
            } else {
                field2530.method2378(var1, var6);
            }
            return var6;
        }
    }
}
