package deob;

@ObfuscatedName("el")
public abstract class class152 {

    @ObfuscatedName("el.y")
    public int field2516;

    @ObfuscatedName("el.m")
    public int[] field2502;

    @ObfuscatedName("el.d")
    public int[] field2501;

    @ObfuscatedName("el.k")
    public class169 field2508;

    @ObfuscatedName("el.n")
    public int[] field2520;

    @ObfuscatedName("el.s")
    public int[] field2504;

    @ObfuscatedName("el.x")
    public int[] field2499;

    @ObfuscatedName("el.b")
    public int[][] field2506;

    @ObfuscatedName("el.j")
    public int[][] field2507;

    @ObfuscatedName("el.p")
    public class169[] field2515;

    @ObfuscatedName("el.l")
    public Object[] field2509;

    @ObfuscatedName("el.i")
    public Object[][] field2510;

    @ObfuscatedName("el.r")
    public static class122 field2511 = new class122();

    @ObfuscatedName("el.o")
    public int field2512;

    @ObfuscatedName("el.c")
    public boolean field2513;

    @ObfuscatedName("el.f")
    public boolean field2514;

    @ObfuscatedName("el.a")
    public static int field2505 = 0;

    public class152(boolean arg0, boolean arg1) {
        this.field2513 = arg0;
        this.field2514 = arg1;
    }

    @ObfuscatedName("el.y([BB)V")
    public void method3072(byte[] arg0) {
        this.field2512 = class127.method685(arg0, arg0.length);
        class127 var2 = new class127(method707(arg0));
        int var3 = var2.method2534();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2628();
        }
        int var4 = var2.method2534();
        if (var3 >= 7) {
            this.field2516 = var2.method2472();
        } else {
            this.field2516 = var2.method2460();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2502 = new int[this.field2516];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2516; var7++) {
                this.field2502[var7] = var5 += var2.method2472();
                if (this.field2502[var7] > var6) {
                    var6 = this.field2502[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2516; var8++) {
                this.field2502[var8] = var5 += var2.method2460();
                if (this.field2502[var8] > var6) {
                    var6 = this.field2502[var8];
                }
            }
        }
        this.field2520 = new int[var6 + 1];
        this.field2504 = new int[var6 + 1];
        this.field2499 = new int[var6 + 1];
        this.field2506 = new int[var6 + 1][];
        this.field2509 = new Object[var6 + 1];
        this.field2510 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2501 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2516; var9++) {
                this.field2501[this.field2502[var9]] = var2.method2628();
            }
            this.field2508 = new class169(this.field2501);
        }
        for (int var10 = 0; var10 < this.field2516; var10++) {
            this.field2520[this.field2502[var10]] = var2.method2628();
        }
        for (int var11 = 0; var11 < this.field2516; var11++) {
            this.field2504[this.field2502[var11]] = var2.method2628();
        }
        for (int var12 = 0; var12 < this.field2516; var12++) {
            this.field2499[this.field2502[var12]] = var2.method2460();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2516; var13++) {
                int var14 = this.field2502[var13];
                int var15 = this.field2499[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2506[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2506[var14][var18] = var16 += var2.method2472();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2510[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2516; var20++) {
                int var21 = this.field2502[var20];
                int var22 = this.field2499[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2506[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2506[var21][var25] = var23 += var2.method2460();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2510[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2507 = new int[var6 + 1][];
        this.field2515 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2516; var27++) {
            int var28 = this.field2502[var27];
            int var29 = this.field2499[var28];
            this.field2507[var28] = new int[this.field2510[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2507[var28][this.field2506[var28][var30]] = var2.method2628();
            }
            this.field2515[var28] = new class169(this.field2507[var28]);
        }
    }

    @ObfuscatedName("el.m(IB)V")
    public void method3043(int arg0) {
    }

    @ObfuscatedName("el.d(III)[B")
    public byte[] method2991(int arg0, int arg1) {
        return this.method3042(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("el.k(II[II)[B")
    public byte[] method3042(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2510.length || this.field2510[arg0] == null || arg1 < 0 || arg1 >= this.field2510[arg0].length) {
            return null;
        }
        if (this.field2510[arg0][arg1] == null) {
            boolean var4 = this.method3005(arg0, arg2);
            if (!var4) {
                this.method2999(arg0);
                boolean var5 = this.method3005(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method1598(this.field2510[arg0][arg1], false);
        if (this.field2514) {
            this.field2510[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("el.n(III)Z")
    public boolean method2993(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2510.length || this.field2510[arg0] == null || arg1 < 0 || arg1 >= this.field2510[arg0].length) {
            return false;
        } else if (this.field2510[arg0][arg1] != null) {
            return true;
        } else if (this.field2509[arg0] == null) {
            this.method2999(arg0);
            return this.field2509[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("el.s(II)Z")
    public boolean method2988(int arg0) {
        if (this.field2509[arg0] == null) {
            this.method2999(arg0);
            return this.field2509[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("el.x(I)Z")
    public boolean method2995() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2502.length; var2++) {
            int var3 = this.field2502[var2];
            if (this.field2509[var3] == null) {
                this.method2999(var3);
                if (this.field2509[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("el.b(II)[B")
    public byte[] method2996(int arg0) {
        if (this.field2510.length == 1) {
            return this.method2991(0, arg0);
        } else if (this.field2510[arg0].length == 1) {
            return this.method2991(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("el.j(III)[B")
    public byte[] method2997(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2510.length || this.field2510[arg0] == null || arg1 < 0 || arg1 >= this.field2510[arg0].length) {
            return null;
        }
        if (this.field2510[arg0][arg1] == null) {
            boolean var3 = this.method3005(arg0, (int[]) null);
            if (!var3) {
                this.method2999(arg0);
                boolean var4 = this.method3005(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method1598(this.field2510[arg0][arg1], false);
    }

    @ObfuscatedName("el.p(IB)[B")
    public byte[] method2998(int arg0) {
        if (this.field2510.length == 1) {
            return this.method2997(0, arg0);
        } else if (this.field2510[arg0].length == 1) {
            return this.method2997(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("el.l(II)V")
    public void method2999(int arg0) {
    }

    @ObfuscatedName("el.i(II)[I")
    public int[] method3033(int arg0) {
        return this.field2506[arg0];
    }

    @ObfuscatedName("el.r(II)I")
    public int method2994(int arg0) {
        return this.field2510[arg0].length;
    }

    @ObfuscatedName("el.o(S)I")
    public int method3015() {
        return this.field2510.length;
    }

    @ObfuscatedName("el.c(II)V")
    public void method3031(int arg0) {
        for (int var2 = 0; var2 < this.field2510[arg0].length; var2++) {
            this.field2510[arg0][var2] = null;
        }
    }

    @ObfuscatedName("el.f(B)V")
    public void method3004() {
        for (int var1 = 0; var1 < this.field2510.length; var1++) {
            if (this.field2510[var1] != null) {
                for (int var2 = 0; var2 < this.field2510[var1].length; var2++) {
                    this.field2510[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("el.a(I[IB)Z")
    public boolean method3005(int arg0, int[] arg1) {
        if (this.field2509[arg0] == null) {
            return false;
        }
        int var3 = this.field2499[arg0];
        int[] var4 = this.field2506[arg0];
        Object[] var5 = this.field2510[arg0];
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
            var8 = class119.method1598(this.field2509[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2596(arg1, 5, var9.field2037.length);
        } else {
            var8 = class119.method1598(this.field2509[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method707(var8);
        } catch (RuntimeException var27) {
            throw class80.method1375(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class127.method685(var8, var8.length) + "," + class127.method685(var8, var8.length - 2) + "," + this.field2520[arg0] + "," + this.field2512);
        }
        if (this.field2513) {
            this.field2509[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class127 var15 = new class127(var10);
            int[] var16 = new int[var3];
            var15.field2036 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2628();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2036 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2628();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2514) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class119.method133(var20[var26], false);
                }
            }
        } else if (this.field2514) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method133(var10, false);
        }
        return true;
    }

    @ObfuscatedName("el.t(Ljava/lang/String;I)I")
    public int method3022(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2508.method3281(class147.method786(var2));
    }

    @ObfuscatedName("el.u(ILjava/lang/String;S)I")
    public int method3007(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2515[arg0].method3281(class147.method786(var3));
    }

    @ObfuscatedName("el.z(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3008(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2508.method3281(class147.method786(var3));
        int var6 = this.field2515[var5].method3281(class147.method786(var4));
        return this.method2991(var5, var6);
    }

    @ObfuscatedName("el.v(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3009(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2508.method3281(class147.method786(var3));
        int var6 = this.field2515[var5].method3281(class147.method786(var4));
        return this.method2993(var5, var6);
    }

    @ObfuscatedName("el.w(Ljava/lang/String;I)V")
    public void method3010(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2508.method3281(class147.method786(var2));
        if (var3 >= 0) {
            this.method3043(var3);
        }
    }

    @ObfuscatedName("am.h([BI)[B")
    public static final byte[] method707(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2534();
        int var3 = var1.method2628();
        if (var3 < 0 || !(field2505 == 0 || var3 <= field2505)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2469(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2628();
            if (var5 < 0 || field2505 != 0 && var5 > field2505) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2409(var6, var5, arg0, var3, 9);
            } else {
                field2511.method2403(var1, var6);
            }
            return var6;
        }
    }
}
