package deob;

@ObfuscatedName("ez")
public abstract class class152 {

    @ObfuscatedName("ez.j")
    public int field2495;

    @ObfuscatedName("ez.r")
    public int[] field2489;

    @ObfuscatedName("ez.v")
    public int[] field2490;

    @ObfuscatedName("ez.p")
    public class169 field2491;

    @ObfuscatedName("ez.e")
    public int[] field2492;

    @ObfuscatedName("ez.d")
    public int[] field2488;

    @ObfuscatedName("ez.y")
    public int[] field2494;

    @ObfuscatedName("ez.x")
    public int[][] field2499;

    @ObfuscatedName("ez.t")
    public int[][] field2496;

    @ObfuscatedName("ez.i")
    public class169[] field2493;

    @ObfuscatedName("ez.z")
    public Object[] field2502;

    @ObfuscatedName("ez.o")
    public Object[][] field2509;

    @ObfuscatedName("ez.u")
    public static class122 field2498 = new class122();

    @ObfuscatedName("ez.f")
    public int field2501;

    @ObfuscatedName("ez.k")
    public boolean field2500;

    @ObfuscatedName("ez.q")
    public boolean field2503;

    @ObfuscatedName("ez.a")
    public static int field2504 = 0;

    public class152(boolean arg0, boolean arg1) {
        this.field2500 = arg0;
        this.field2503 = arg1;
    }

    @ObfuscatedName("ez.j([BI)V")
    public void method2957(byte[] arg0) {
        this.field2501 = class127.method2385(arg0, arg0.length);
        class127 var2 = new class127(method121(arg0));
        int var3 = var2.method2441();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2446();
        }
        int var4 = var2.method2441();
        if (var3 >= 7) {
            this.field2495 = var2.method2455();
        } else {
            this.field2495 = var2.method2609();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2489 = new int[this.field2495];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2495; var7++) {
                this.field2489[var7] = var5 += var2.method2455();
                if (this.field2489[var7] > var6) {
                    var6 = this.field2489[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2495; var8++) {
                this.field2489[var8] = var5 += var2.method2609();
                if (this.field2489[var8] > var6) {
                    var6 = this.field2489[var8];
                }
            }
        }
        this.field2492 = new int[var6 + 1];
        this.field2488 = new int[var6 + 1];
        this.field2494 = new int[var6 + 1];
        this.field2499 = new int[var6 + 1][];
        this.field2502 = new Object[var6 + 1];
        this.field2509 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2490 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2495; var9++) {
                this.field2490[this.field2489[var9]] = var2.method2446();
            }
            this.field2491 = new class169(this.field2490);
        }
        for (int var10 = 0; var10 < this.field2495; var10++) {
            this.field2492[this.field2489[var10]] = var2.method2446();
        }
        for (int var11 = 0; var11 < this.field2495; var11++) {
            this.field2488[this.field2489[var11]] = var2.method2446();
        }
        for (int var12 = 0; var12 < this.field2495; var12++) {
            this.field2494[this.field2489[var12]] = var2.method2609();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2495; var13++) {
                int var14 = this.field2489[var13];
                int var15 = this.field2494[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2499[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2499[var14][var18] = var16 += var2.method2455();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2509[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2495; var20++) {
                int var21 = this.field2489[var20];
                int var22 = this.field2494[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2499[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2499[var21][var25] = var23 += var2.method2609();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2509[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2496 = new int[var6 + 1][];
        this.field2493 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2495; var27++) {
            int var28 = this.field2489[var27];
            int var29 = this.field2494[var28];
            this.field2496[var28] = new int[this.field2509[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2496[var28][this.field2499[var28][var30]] = var2.method2446();
            }
            this.field2493[var28] = new class169(this.field2496[var28]);
        }
    }

    @ObfuscatedName("ez.r(II)V")
    public void method2990(int arg0) {
    }

    @ObfuscatedName("ez.v(IIB)[B")
    public byte[] method3016(int arg0, int arg1) {
        return this.method2987(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ez.p(II[II)[B")
    public byte[] method2987(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2509.length || this.field2509[arg0] == null || arg1 < 0 || arg1 >= this.field2509[arg0].length) {
            return null;
        }
        if (this.field2509[arg0][arg1] == null) {
            boolean var4 = this.method2973(arg0, arg2);
            if (!var4) {
                this.method2967(arg0);
                boolean var5 = this.method2973(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method162(this.field2509[arg0][arg1], false);
        if (this.field2503) {
            this.field2509[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ez.e(III)Z")
    public boolean method2959(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2509.length || this.field2509[arg0] == null || arg1 < 0 || arg1 >= this.field2509[arg0].length) {
            return false;
        } else if (this.field2509[arg0][arg1] != null) {
            return true;
        } else if (this.field2502[arg0] == null) {
            this.method2967(arg0);
            return this.field2502[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ez.d(II)Z")
    public boolean method2962(int arg0) {
        if (this.field2502[arg0] == null) {
            this.method2967(arg0);
            return this.field2502[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ez.y(B)Z")
    public boolean method2963() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2489.length; var2++) {
            int var3 = this.field2489[var2];
            if (this.field2502[var3] == null) {
                this.method2967(var3);
                if (this.field2502[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ez.x(IB)[B")
    public byte[] method2964(int arg0) {
        if (this.field2509.length == 1) {
            return this.method3016(0, arg0);
        } else if (this.field2509[arg0].length == 1) {
            return this.method3016(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ez.t(IIB)[B")
    public byte[] method2965(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2509.length || this.field2509[arg0] == null || arg1 < 0 || arg1 >= this.field2509[arg0].length) {
            return null;
        }
        if (this.field2509[arg0][arg1] == null) {
            boolean var3 = this.method2973(arg0, (int[]) null);
            if (!var3) {
                this.method2967(arg0);
                boolean var4 = this.method2973(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method162(this.field2509[arg0][arg1], false);
    }

    @ObfuscatedName("ez.i(IB)[B")
    public byte[] method3032(int arg0) {
        if (this.field2509.length == 1) {
            return this.method2965(0, arg0);
        } else if (this.field2509[arg0].length == 1) {
            return this.method2965(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ez.z(II)V")
    public void method2967(int arg0) {
    }

    @ObfuscatedName("ez.o(II)[I")
    public int[] method2968(int arg0) {
        return this.field2499[arg0];
    }

    @ObfuscatedName("ez.u(II)I")
    public int method2969(int arg0) {
        return this.field2509[arg0].length;
    }

    @ObfuscatedName("ez.f(I)I")
    public int method2988() {
        return this.field2509.length;
    }

    @ObfuscatedName("ez.k(II)V")
    public void method2971(int arg0) {
        for (int var2 = 0; var2 < this.field2509[arg0].length; var2++) {
            this.field2509[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ez.q(I)V")
    public void method2992() {
        for (int var1 = 0; var1 < this.field2509.length; var1++) {
            if (this.field2509[var1] != null) {
                for (int var2 = 0; var2 < this.field2509[var1].length; var2++) {
                    this.field2509[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ez.a(I[II)Z")
    public boolean method2973(int arg0, int[] arg1) {
        if (this.field2502[arg0] == null) {
            return false;
        }
        int var3 = this.field2494[arg0];
        int[] var4 = this.field2499[arg0];
        Object[] var5 = this.field2509[arg0];
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
            var8 = class119.method162(this.field2502[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2604(arg1, 5, var9.field2025.length);
        } else {
            var8 = class119.method162(this.field2502[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method121(var8);
        } catch (RuntimeException var31) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class127.method1235(var8, 0, var14);
            throw class80.method2209(var31, var13 + var15 + "," + class127.method2385(var8, var8.length - 2) + "," + this.field2492[arg0] + "," + this.field2501);
        }
        if (this.field2500) {
            this.field2502[arg0] = null;
        }
        if (var3 > 1) {
            int var16 = var10.length;
            int var32 = var16 - 1;
            int var17 = var10[var32] & 0xFF;
            int var18 = var32 - var3 * var17 * 4;
            class127 var19 = new class127(var10);
            int[] var20 = new int[var3];
            var19.field2022 = var18;
            for (int var21 = 0; var21 < var17; var21++) {
                int var22 = 0;
                for (int var23 = 0; var23 < var3; var23++) {
                    var22 += var19.method2446();
                    var20[var23] += var22;
                }
            }
            byte[][] var24 = new byte[var3][];
            for (int var25 = 0; var25 < var3; var25++) {
                var24[var25] = new byte[var20[var25]];
                var20[var25] = 0;
            }
            var19.field2022 = var18;
            int var26 = 0;
            for (int var27 = 0; var27 < var17; var27++) {
                int var28 = 0;
                for (int var29 = 0; var29 < var3; var29++) {
                    var28 += var19.method2446();
                    System.arraycopy(var10, var26, var24[var29], var20[var29], var28);
                    var20[var29] += var28;
                    var26 += var28;
                }
            }
            for (int var30 = 0; var30 < var3; var30++) {
                if (this.field2503) {
                    var5[var4[var30]] = var24[var30];
                } else {
                    var5[var4[var30]] = class119.method12(var24[var30], false);
                }
            }
        } else if (this.field2503) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method12(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ez.w(Ljava/lang/String;B)I")
    public int method2974(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2491.method3251(class147.method2038(var2));
    }

    @ObfuscatedName("ez.g(ILjava/lang/String;I)I")
    public int method2975(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2493[arg0].method3251(class147.method2038(var3));
    }

    @ObfuscatedName("ez.l(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2976(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2491.method3251(class147.method2038(var3));
        int var6 = this.field2493[var5].method3251(class147.method2038(var4));
        return this.method3016(var5, var6);
    }

    @ObfuscatedName("ez.m(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2977(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2491.method3251(class147.method2038(var3));
        int var6 = this.field2493[var5].method3251(class147.method2038(var4));
        return this.method2959(var5, var6);
    }

    @ObfuscatedName("ez.b(Ljava/lang/String;I)V")
    public void method2978(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2491.method3251(class147.method2038(var2));
        if (var3 >= 0) {
            this.method2990(var3);
        }
    }

    @ObfuscatedName("i.h([BI)[B")
    public static final byte[] method121(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2441();
        int var3 = var1.method2446();
        if (var3 < 0 || !(field2504 == 0 || var3 <= field2504)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2497(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2446();
            if (var5 < 0 || field2504 != 0 && var5 > field2504) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2387(var6, var5, arg0, var3, 9);
            } else {
                field2498.method2382(var1, var6);
            }
            return var6;
        }
    }
}
