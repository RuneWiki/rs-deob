package deob;

@ObfuscatedName("eg")
public abstract class class152 {

    @ObfuscatedName("eg.i")
    public int field2519;

    @ObfuscatedName("eg.w")
    public int[] field2516;

    @ObfuscatedName("eg.f")
    public int[] field2502;

    @ObfuscatedName("eg.e")
    public class169 field2503;

    @ObfuscatedName("eg.t")
    public int[] field2504;

    @ObfuscatedName("eg.d")
    public int[] field2510;

    @ObfuscatedName("eg.p")
    public int[] field2513;

    @ObfuscatedName("eg.k")
    public int[][] field2507;

    @ObfuscatedName("eg.r")
    public int[][] field2501;

    @ObfuscatedName("eg.l")
    public class169[] field2509;

    @ObfuscatedName("eg.a")
    public Object[] field2500;

    @ObfuscatedName("eg.z")
    public Object[][] field2511;

    @ObfuscatedName("eg.s")
    public static class122 field2512 = new class122();

    @ObfuscatedName("eg.m")
    public int field2505;

    @ObfuscatedName("eg.u")
    public boolean field2514;

    @ObfuscatedName("eg.g")
    public boolean field2515;

    @ObfuscatedName("eg.o")
    public static int field2508 = 0;

    public class152(boolean arg0, boolean arg1) {
        this.field2514 = arg0;
        this.field2515 = arg1;
    }

    @ObfuscatedName("eg.i([BB)V")
    public void method2968(byte[] arg0) {
        this.field2505 = class127.method1408(arg0, arg0.length);
        class127 var2 = new class127(method2395(arg0));
        int var3 = var2.method2472();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2457();
        }
        int var4 = var2.method2472();
        if (var3 >= 7) {
            this.field2519 = var2.method2487();
        } else {
            this.field2519 = var2.method2615();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2516 = new int[this.field2519];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2519; var7++) {
                this.field2516[var7] = var5 += var2.method2487();
                if (this.field2516[var7] > var6) {
                    var6 = this.field2516[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2519; var8++) {
                this.field2516[var8] = var5 += var2.method2615();
                if (this.field2516[var8] > var6) {
                    var6 = this.field2516[var8];
                }
            }
        }
        this.field2504 = new int[var6 + 1];
        this.field2510 = new int[var6 + 1];
        this.field2513 = new int[var6 + 1];
        this.field2507 = new int[var6 + 1][];
        this.field2500 = new Object[var6 + 1];
        this.field2511 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2502 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2519; var9++) {
                this.field2502[this.field2516[var9]] = var2.method2457();
            }
            this.field2503 = new class169(this.field2502);
        }
        for (int var10 = 0; var10 < this.field2519; var10++) {
            this.field2504[this.field2516[var10]] = var2.method2457();
        }
        for (int var11 = 0; var11 < this.field2519; var11++) {
            this.field2510[this.field2516[var11]] = var2.method2457();
        }
        for (int var12 = 0; var12 < this.field2519; var12++) {
            this.field2513[this.field2516[var12]] = var2.method2615();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2519; var13++) {
                int var14 = this.field2516[var13];
                int var15 = this.field2513[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2507[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2507[var14][var18] = var16 += var2.method2487();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2511[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2519; var20++) {
                int var21 = this.field2516[var20];
                int var22 = this.field2513[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2507[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2507[var21][var25] = var23 += var2.method2615();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2511[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2501 = new int[var6 + 1][];
        this.field2509 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2519; var27++) {
            int var28 = this.field2516[var27];
            int var29 = this.field2513[var28];
            this.field2501[var28] = new int[this.field2511[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2501[var28][this.field2507[var28][var30]] = var2.method2457();
            }
            this.field2509[var28] = new class169(this.field2501[var28]);
        }
    }

    @ObfuscatedName("eg.w(II)V")
    public void method2993(int arg0) {
    }

    @ObfuscatedName("eg.f(III)[B")
    public byte[] method2970(int arg0, int arg1) {
        return this.method2971(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eg.e(II[IB)[B")
    public byte[] method2971(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2511.length || this.field2511[arg0] == null || arg1 < 0 || arg1 >= this.field2511[arg0].length) {
            return null;
        }
        if (this.field2511[arg0][arg1] == null) {
            boolean var4 = this.method2984(arg0, arg2);
            if (!var4) {
                this.method2978(arg0);
                boolean var5 = this.method2984(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = Statics.method57(this.field2511[arg0][arg1], false);
        if (this.field2515) {
            this.field2511[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eg.t(III)Z")
    public boolean method2972(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2511.length || this.field2511[arg0] == null || arg1 < 0 || arg1 >= this.field2511[arg0].length) {
            return false;
        } else if (this.field2511[arg0][arg1] != null) {
            return true;
        } else if (this.field2500[arg0] == null) {
            this.method2978(arg0);
            return this.field2500[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.d(II)Z")
    public boolean method2973(int arg0) {
        if (this.field2500[arg0] == null) {
            this.method2978(arg0);
            return this.field2500[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.p(I)Z")
    public boolean method2974() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2516.length; var2++) {
            int var3 = this.field2516[var2];
            if (this.field2500[var3] == null) {
                this.method2978(var3);
                if (this.field2500[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eg.k(II)[B")
    public byte[] method2975(int arg0) {
        if (this.field2511.length == 1) {
            return this.method2970(0, arg0);
        } else if (this.field2511[arg0].length == 1) {
            return this.method2970(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eg.r(IIS)[B")
    public byte[] method2976(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2511.length || this.field2511[arg0] == null || arg1 < 0 || arg1 >= this.field2511[arg0].length) {
            return null;
        }
        if (this.field2511[arg0][arg1] == null) {
            boolean var3 = this.method2984(arg0, (int[]) null);
            if (!var3) {
                this.method2978(arg0);
                boolean var4 = this.method2984(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return Statics.method57(this.field2511[arg0][arg1], false);
    }

    @ObfuscatedName("eg.l(II)[B")
    public byte[] method2999(int arg0) {
        if (this.field2511.length == 1) {
            return this.method2976(0, arg0);
        } else if (this.field2511[arg0].length == 1) {
            return this.method2976(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eg.a(II)V")
    public void method2978(int arg0) {
    }

    @ObfuscatedName("eg.z(II)[I")
    public int[] method3014(int arg0) {
        return this.field2507[arg0];
    }

    @ObfuscatedName("eg.s(II)I")
    public int method2980(int arg0) {
        return this.field2511[arg0].length;
    }

    @ObfuscatedName("eg.m(B)I")
    public int method3030() {
        return this.field2511.length;
    }

    @ObfuscatedName("eg.u(II)V")
    public void method2982(int arg0) {
        for (int var2 = 0; var2 < this.field2511[arg0].length; var2++) {
            this.field2511[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eg.g(S)V")
    public void method2983() {
        for (int var1 = 0; var1 < this.field2511.length; var1++) {
            if (this.field2511[var1] != null) {
                for (int var2 = 0; var2 < this.field2511[var1].length; var2++) {
                    this.field2511[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eg.o(I[IB)Z")
    public boolean method2984(int arg0, int[] arg1) {
        if (this.field2500[arg0] == null) {
            return false;
        }
        int var3 = this.field2513[arg0];
        int[] var4 = this.field2507[arg0];
        Object[] var5 = this.field2511[arg0];
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
            var8 = Statics.method57(this.field2500[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2469(arg1, 5, var9.field2049.length);
        } else {
            var8 = Statics.method57(this.field2500[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2395(var8);
        } catch (RuntimeException var27) {
            throw class80.method108(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class127.method1408(var8, var8.length) + "," + class127.method1408(var8, var8.length - 2) + "," + this.field2504[arg0] + "," + this.field2505);
        }
        if (this.field2514) {
            this.field2500[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class127 var15 = new class127(var10);
            int[] var16 = new int[var3];
            var15.field2045 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2457();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2045 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2457();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2515) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class119.method2350(var20[var26], false);
                }
            }
        } else if (this.field2515) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method2350(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eg.v(Ljava/lang/String;I)I")
    public int method2985(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2503.method3232(class147.method1355(var2));
    }

    @ObfuscatedName("eg.j(ILjava/lang/String;B)I")
    public int method3004(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2509[arg0].method3232(class147.method1355(var3));
    }

    @ObfuscatedName("eg.n(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3029(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2503.method3232(class147.method1355(var3));
        int var6 = this.field2509[var5].method3232(class147.method1355(var4));
        return this.method2970(var5, var6);
    }

    @ObfuscatedName("eg.q(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2988(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2503.method3232(class147.method1355(var3));
        int var6 = this.field2509[var5].method3232(class147.method1355(var4));
        return this.method2972(var5, var6);
    }

    @ObfuscatedName("eg.c(Ljava/lang/String;B)V")
    public void method2997(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2503.method3232(class147.method1355(var2));
        if (var3 >= 0) {
            this.method2993(var3);
        }
    }

    @ObfuscatedName("dh.h([BI)[B")
    public static final byte[] method2395(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2472();
        int var3 = var1.method2457();
        if (var3 < 0 || !(field2508 == 0 || var3 <= field2508)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2463(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2457();
            if (var5 < 0 || field2508 != 0 && var5 > field2508) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2400(var6, var5, arg0, var3, 9);
            } else {
                field2512.method2396(var1, var6);
            }
            return var6;
        }
    }
}
