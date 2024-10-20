package deob;

@ObfuscatedName("fh")
public abstract class class161 {

    @ObfuscatedName("fh.j")
    public int field2610;

    @ObfuscatedName("fh.y")
    public int[] field2595;

    @ObfuscatedName("fh.z")
    public int[] field2596;

    @ObfuscatedName("fh.l")
    public class186 field2597;

    @ObfuscatedName("fh.w")
    public int[] field2598;

    @ObfuscatedName("fh.d")
    public int[] field2599;

    @ObfuscatedName("fh.f")
    public int[] field2600;

    @ObfuscatedName("fh.i")
    public int[][] field2601;

    @ObfuscatedName("fh.a")
    public int[][] field2602;

    @ObfuscatedName("fh.o")
    public class186[] field2603;

    @ObfuscatedName("fh.u")
    public Object[] field2604;

    @ObfuscatedName("fh.m")
    public Object[][] field2605;

    @ObfuscatedName("fh.e")
    public static class111 field2594 = new class111();

    @ObfuscatedName("fh.v")
    public int field2607;

    @ObfuscatedName("fh.r")
    public boolean field2609;

    @ObfuscatedName("fh.t")
    public boolean field2612;

    @ObfuscatedName("fh.g")
    public static int field2606 = 0;

    public class161(boolean arg0, boolean arg1) {
        this.field2609 = arg0;
        this.field2612 = arg1;
    }

    @ObfuscatedName("fh.j([BI)V")
    public void method2977(byte[] arg0) {
        this.field2607 = class114.method990(arg0, arg0.length);
        class114 var2 = new class114(method978(arg0));
        int var3 = var2.method2322();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2327();
        }
        int var4 = var2.method2322();
        if (var3 >= 7) {
            this.field2610 = var2.method2335();
        } else {
            this.field2610 = var2.method2324();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2595 = new int[this.field2610];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2610; var7++) {
                this.field2595[var7] = var5 += var2.method2335();
                if (this.field2595[var7] > var6) {
                    var6 = this.field2595[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2610; var8++) {
                this.field2595[var8] = var5 += var2.method2324();
                if (this.field2595[var8] > var6) {
                    var6 = this.field2595[var8];
                }
            }
        }
        this.field2598 = new int[var6 + 1];
        this.field2599 = new int[var6 + 1];
        this.field2600 = new int[var6 + 1];
        this.field2601 = new int[var6 + 1][];
        this.field2604 = new Object[var6 + 1];
        this.field2605 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2596 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2610; var9++) {
                this.field2596[this.field2595[var9]] = var2.method2327();
            }
            this.field2597 = new class186(this.field2596);
        }
        for (int var10 = 0; var10 < this.field2610; var10++) {
            this.field2598[this.field2595[var10]] = var2.method2327();
        }
        for (int var11 = 0; var11 < this.field2610; var11++) {
            this.field2599[this.field2595[var11]] = var2.method2327();
        }
        for (int var12 = 0; var12 < this.field2610; var12++) {
            this.field2600[this.field2595[var12]] = var2.method2324();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2610; var13++) {
                int var14 = this.field2595[var13];
                int var15 = this.field2600[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2601[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2601[var14][var18] = var16 += var2.method2335();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2605[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2610; var20++) {
                int var21 = this.field2595[var20];
                int var22 = this.field2600[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2601[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2601[var21][var25] = var23 += var2.method2324();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2605[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2602 = new int[var6 + 1][];
        this.field2603 = new class186[var6 + 1];
        for (int var27 = 0; var27 < this.field2610; var27++) {
            int var28 = this.field2595[var27];
            int var29 = this.field2600[var28];
            this.field2602[var28] = new int[this.field2605[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2602[var28][this.field2601[var28][var30]] = var2.method2327();
            }
            this.field2603[var28] = new class186(this.field2602[var28]);
        }
    }

    @ObfuscatedName("fh.y(II)V")
    public void method2978(int arg0) {
    }

    @ObfuscatedName("fh.z(III)[B")
    public byte[] method2995(int arg0, int arg1) {
        return this.method2987(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fh.l(II[II)[B")
    public byte[] method2987(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2605.length || this.field2605[arg0] == null || arg1 < 0 || arg1 >= this.field2605[arg0].length) {
            return null;
        }
        if (this.field2605[arg0][arg1] == null) {
            boolean var4 = this.method3055(arg0, arg2);
            if (!var4) {
                this.method3004(arg0);
                boolean var5 = this.method3055(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class120.method2605(this.field2605[arg0][arg1], false);
        if (this.field2612) {
            this.field2605[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fh.w(IIB)Z")
    public boolean method2981(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2605.length || this.field2605[arg0] == null || arg1 < 0 || arg1 >= this.field2605[arg0].length) {
            return false;
        } else if (this.field2605[arg0][arg1] != null) {
            return true;
        } else if (this.field2604[arg0] == null) {
            this.method3004(arg0);
            return this.field2604[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fh.d(IB)Z")
    public boolean method2993(int arg0) {
        if (this.field2604[arg0] == null) {
            this.method3004(arg0);
            return this.field2604[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fh.f(S)Z")
    public boolean method2983() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2595.length; var2++) {
            int var3 = this.field2595[var2];
            if (this.field2604[var3] == null) {
                this.method3004(var3);
                if (this.field2604[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fh.i(II)[B")
    public byte[] method2984(int arg0) {
        if (this.field2605.length == 1) {
            return this.method2995(0, arg0);
        } else if (this.field2605[arg0].length == 1) {
            return this.method2995(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fh.a(III)[B")
    public byte[] method3000(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2605.length || this.field2605[arg0] == null || arg1 < 0 || arg1 >= this.field2605[arg0].length) {
            return null;
        }
        if (this.field2605[arg0][arg1] == null) {
            boolean var3 = this.method3055(arg0, (int[]) null);
            if (!var3) {
                this.method3004(arg0);
                boolean var4 = this.method3055(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class120.method2605(this.field2605[arg0][arg1], false);
    }

    @ObfuscatedName("fh.o(II)[B")
    public byte[] method2986(int arg0) {
        if (this.field2605.length == 1) {
            return this.method3000(0, arg0);
        } else if (this.field2605[arg0].length == 1) {
            return this.method3000(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fh.u(IS)V")
    public void method3004(int arg0) {
    }

    @ObfuscatedName("fh.m(II)[I")
    public int[] method2988(int arg0) {
        return this.field2601[arg0];
    }

    @ObfuscatedName("fh.e(II)I")
    public int method3008(int arg0) {
        return this.field2605[arg0].length;
    }

    @ObfuscatedName("fh.v(I)I")
    public int method2990() {
        return this.field2605.length;
    }

    @ObfuscatedName("fh.r(II)V")
    public void method2991(int arg0) {
        for (int var2 = 0; var2 < this.field2605[arg0].length; var2++) {
            this.field2605[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fh.t(B)V")
    public void method2985() {
        for (int var1 = 0; var1 < this.field2605.length; var1++) {
            if (this.field2605[var1] != null) {
                for (int var2 = 0; var2 < this.field2605[var1].length; var2++) {
                    this.field2605[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fh.g(I[II)Z")
    public boolean method3055(int arg0, int[] arg1) {
        if (this.field2604[arg0] == null) {
            return false;
        }
        int var3 = this.field2600[arg0];
        int[] var4 = this.field2601[arg0];
        Object[] var5 = this.field2605[arg0];
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
            var8 = class120.method2605(this.field2604[arg0], true);
            class114 var9 = new class114(var8);
            var9.method2358(arg1, 5, var9.field1891.length);
        } else {
            var8 = class120.method2605(this.field2604[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method978(var8);
        } catch (RuntimeException var31) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class114.method990(var8, var8.length) + ",";
            int var14 = var8.length - 2;
            int var15 = class114.method228(var8, 0, var14);
            throw class143.method2071(var31, var13 + var15 + "," + this.field2598[arg0] + "," + this.field2607);
        }
        if (this.field2609) {
            this.field2604[arg0] = null;
        }
        if (var3 > 1) {
            int var16 = var10.length;
            int var32 = var16 - 1;
            int var17 = var10[var32] & 0xFF;
            int var18 = var32 - var3 * var17 * 4;
            class114 var19 = new class114(var10);
            int[] var20 = new int[var3];
            var19.field1894 = var18;
            for (int var21 = 0; var21 < var17; var21++) {
                int var22 = 0;
                for (int var23 = 0; var23 < var3; var23++) {
                    var22 += var19.method2327();
                    var20[var23] += var22;
                }
            }
            byte[][] var24 = new byte[var3][];
            for (int var25 = 0; var25 < var3; var25++) {
                var24[var25] = new byte[var20[var25]];
                var20[var25] = 0;
            }
            var19.field1894 = var18;
            int var26 = 0;
            for (int var27 = 0; var27 < var17; var27++) {
                int var28 = 0;
                for (int var29 = 0; var29 < var3; var29++) {
                    var28 += var19.method2327();
                    System.arraycopy(var10, var26, var24[var29], var20[var29], var28);
                    var20[var29] += var28;
                    var26 += var28;
                }
            }
            for (int var30 = 0; var30 < var3; var30++) {
                if (this.field2612) {
                    var5[var4[var30]] = var24[var30];
                } else {
                    var5[var4[var30]] = class120.method1574(var24[var30], false);
                }
            }
        } else if (this.field2612) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class120.method1574(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fh.s(Ljava/lang/String;I)I")
    public int method2994(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2597.method3430(class157.method1031(var2));
    }

    @ObfuscatedName("fh.n(ILjava/lang/String;I)I")
    public int method3011(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2603[arg0].method3430(class157.method1031(var3));
    }

    @ObfuscatedName("fh.h(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2996(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2597.method3430(class157.method1031(var3));
        int var6 = this.field2603[var5].method3430(class157.method1031(var4));
        return this.method2995(var5, var6);
    }

    @ObfuscatedName("fh.p(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2997(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2597.method3430(class157.method1031(var3));
        int var6 = this.field2603[var5].method3430(class157.method1031(var4));
        return this.method2981(var5, var6);
    }

    @ObfuscatedName("fh.c(Ljava/lang/String;I)Z")
    public boolean method2979(String arg0) {
        int var2 = this.method2994("");
        return var2 == -1 ? this.method2997(arg0, "") : this.method2997("", arg0);
    }

    @ObfuscatedName("fh.x(Ljava/lang/String;I)V")
    public void method3049(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2597.method3430(class157.method1031(var2));
        if (var3 >= 0) {
            this.method2978(var3);
        }
    }

    @ObfuscatedName("as.q([BS)[B")
    public static final byte[] method978(byte[] arg0) {
        class114 var1 = new class114(arg0);
        int var2 = var1.method2322();
        int var3 = var1.method2327();
        if (var3 < 0 || !(field2606 == 0 || var3 <= field2606)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2447(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2327();
            if (var5 < 0 || field2606 != 0 && var5 > field2606) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class112.method2278(var6, var5, arg0, var3, 9);
            } else {
                field2594.method2276(var1, var6);
            }
            return var6;
        }
    }
}
