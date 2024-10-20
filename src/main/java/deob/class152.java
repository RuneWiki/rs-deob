package deob;

@ObfuscatedName("ep")
public abstract class class152 {

    @ObfuscatedName("ep.p")
    public int field2522;

    @ObfuscatedName("ep.i")
    public int[] field2507;

    @ObfuscatedName("ep.o")
    public int[] field2516;

    @ObfuscatedName("ep.n")
    public class169 field2509;

    @ObfuscatedName("ep.l")
    public int[] field2519;

    @ObfuscatedName("ep.v")
    public int[] field2511;

    @ObfuscatedName("ep.g")
    public int[] field2512;

    @ObfuscatedName("ep.x")
    public int[][] field2506;

    @ObfuscatedName("ep.c")
    public int[][] field2514;

    @ObfuscatedName("ep.f")
    public class169[] field2515;

    @ObfuscatedName("ep.r")
    public Object[] field2513;

    @ObfuscatedName("ep.d")
    public Object[][] field2508;

    @ObfuscatedName("ep.a")
    public static class122 field2518 = new class122();

    @ObfuscatedName("ep.q")
    public int field2517;

    @ObfuscatedName("ep.u")
    public boolean field2520;

    @ObfuscatedName("ep.w")
    public boolean field2521;

    @ObfuscatedName("ep.s")
    public static int field2510 = 0;

    public class152(boolean arg0, boolean arg1) {
        this.field2520 = arg0;
        this.field2521 = arg1;
    }

    @ObfuscatedName("ep.p([BB)V")
    public void method2997(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class127.field2039[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2517 = var5;
        class127 var8 = new class127(method2390(arg0));
        int var9 = var8.method2659();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2551();
        }
        int var10 = var8.method2659();
        if (var9 >= 7) {
            this.field2522 = var8.method2582();
        } else {
            this.field2522 = var8.method2652();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2507 = new int[this.field2522];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2522; var13++) {
                this.field2507[var13] = var11 += var8.method2582();
                if (this.field2507[var13] > var12) {
                    var12 = this.field2507[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2522; var14++) {
                this.field2507[var14] = var11 += var8.method2652();
                if (this.field2507[var14] > var12) {
                    var12 = this.field2507[var14];
                }
            }
        }
        this.field2519 = new int[var12 + 1];
        this.field2511 = new int[var12 + 1];
        this.field2512 = new int[var12 + 1];
        this.field2506 = new int[var12 + 1][];
        this.field2513 = new Object[var12 + 1];
        this.field2508 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2516 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2522; var15++) {
                this.field2516[this.field2507[var15]] = var8.method2551();
            }
            this.field2509 = new class169(this.field2516);
        }
        for (int var16 = 0; var16 < this.field2522; var16++) {
            this.field2519[this.field2507[var16]] = var8.method2551();
        }
        for (int var17 = 0; var17 < this.field2522; var17++) {
            this.field2511[this.field2507[var17]] = var8.method2551();
        }
        for (int var18 = 0; var18 < this.field2522; var18++) {
            this.field2512[this.field2507[var18]] = var8.method2652();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2522; var19++) {
                int var20 = this.field2507[var19];
                int var21 = this.field2512[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2506[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2506[var20][var24] = var22 += var8.method2582();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2508[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2522; var26++) {
                int var27 = this.field2507[var26];
                int var28 = this.field2512[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2506[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2506[var27][var31] = var29 += var8.method2652();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2508[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2514 = new int[var12 + 1][];
        this.field2515 = new class169[var12 + 1];
        for (int var33 = 0; var33 < this.field2522; var33++) {
            int var34 = this.field2507[var33];
            int var35 = this.field2512[var34];
            this.field2514[var34] = new int[this.field2508[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2514[var34][this.field2506[var34][var36]] = var8.method2551();
            }
            this.field2515[var34] = new class169(this.field2514[var34]);
        }
    }

    @ObfuscatedName("ep.i(IS)V")
    public void method3066(int arg0) {
    }

    @ObfuscatedName("ep.o(III)[B")
    public byte[] method3049(int arg0, int arg1) {
        return this.method3000(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ep.n(II[IB)[B")
    public byte[] method3000(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2508.length || this.field2508[arg0] == null || arg1 < 0 || arg1 >= this.field2508[arg0].length) {
            return null;
        }
        if (this.field2508[arg0][arg1] == null) {
            boolean var4 = this.method2996(arg0, arg2);
            if (!var4) {
                this.method3006(arg0);
                boolean var5 = this.method2996(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method1914(this.field2508[arg0][arg1], false);
        if (this.field2521) {
            this.field2508[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ep.l(III)Z")
    public boolean method3038(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2508.length || this.field2508[arg0] == null || arg1 < 0 || arg1 >= this.field2508[arg0].length) {
            return false;
        } else if (this.field2508[arg0][arg1] != null) {
            return true;
        } else if (this.field2513[arg0] == null) {
            this.method3006(arg0);
            return this.field2513[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ep.v(II)Z")
    public boolean method3005(int arg0) {
        if (this.field2513[arg0] == null) {
            this.method3006(arg0);
            return this.field2513[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ep.g(B)Z")
    public boolean method3002() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2507.length; var2++) {
            int var3 = this.field2507[var2];
            if (this.field2513[var3] == null) {
                this.method3006(var3);
                if (this.field2513[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ep.x(IB)[B")
    public byte[] method3070(int arg0) {
        if (this.field2508.length == 1) {
            return this.method3049(0, arg0);
        } else if (this.field2508[arg0].length == 1) {
            return this.method3049(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ep.c(III)[B")
    public byte[] method3004(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2508.length || this.field2508[arg0] == null || arg1 < 0 || arg1 >= this.field2508[arg0].length) {
            return null;
        }
        if (this.field2508[arg0][arg1] == null) {
            boolean var3 = this.method2996(arg0, (int[]) null);
            if (!var3) {
                this.method3006(arg0);
                boolean var4 = this.method2996(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method1914(this.field2508[arg0][arg1], false);
    }

    @ObfuscatedName("ep.f(II)[B")
    public byte[] method3032(int arg0) {
        if (this.field2508.length == 1) {
            return this.method3004(0, arg0);
        } else if (this.field2508[arg0].length == 1) {
            return this.method3004(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ep.r(II)V")
    public void method3006(int arg0) {
    }

    @ObfuscatedName("ep.d(II)[I")
    public int[] method3007(int arg0) {
        return this.field2506[arg0];
    }

    @ObfuscatedName("ep.a(IB)I")
    public int method3008(int arg0) {
        return this.field2508[arg0].length;
    }

    @ObfuscatedName("ep.q(B)I")
    public int method3009() {
        return this.field2508.length;
    }

    @ObfuscatedName("ep.u(IB)V")
    public void method3010(int arg0) {
        for (int var2 = 0; var2 < this.field2508[arg0].length; var2++) {
            this.field2508[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ep.w(I)V")
    public void method3011() {
        for (int var1 = 0; var1 < this.field2508.length; var1++) {
            if (this.field2508[var1] != null) {
                for (int var2 = 0; var2 < this.field2508[var1].length; var2++) {
                    this.field2508[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ep.s(I[II)Z")
    public boolean method2996(int arg0, int[] arg1) {
        if (this.field2513[arg0] == null) {
            return false;
        }
        int var3 = this.field2512[arg0];
        int[] var4 = this.field2506[arg0];
        Object[] var5 = this.field2508[arg0];
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
            var8 = class119.method1914(this.field2513[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2542(arg1, 5, var9.field2037.length);
        } else {
            var8 = class119.method1914(this.field2513[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2390(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class127.field2039[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class127.field2039[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class80.method15(var42, var20 + var24 + "," + this.field2519[arg0] + "," + this.field2517);
        }
        if (this.field2520) {
            this.field2513[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class127 var30 = new class127(var10);
            int[] var31 = new int[var3];
            var30.field2038 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method2551();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field2038 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method2551();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field2521) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class119.method626(var35[var41], false);
                }
            }
        } else if (this.field2521) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method626(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ep.e(Ljava/lang/String;I)I")
    public int method3013(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2509.method3259(class147.method16(var2));
    }

    @ObfuscatedName("ep.b(ILjava/lang/String;B)I")
    public int method3014(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2515[arg0].method3259(class147.method16(var3));
    }

    @ObfuscatedName("ep.j(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3015(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2509.method3259(class147.method16(var3));
        int var6 = this.field2515[var5].method3259(class147.method16(var4));
        return this.method3049(var5, var6);
    }

    @ObfuscatedName("ep.h(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3016(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2509.method3259(class147.method16(var3));
        int var6 = this.field2515[var5].method3259(class147.method16(var4));
        return this.method3038(var5, var6);
    }

    @ObfuscatedName("ep.m(Ljava/lang/String;I)V")
    public void method3017(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2509.method3259(class147.method16(var2));
        if (var3 >= 0) {
            this.method3066(var3);
        }
    }

    @ObfuscatedName("dq.y([BI)[B")
    public static final byte[] method2390(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2659();
        int var3 = var1.method2551();
        if (var3 < 0 || !(field2510 == 0 || var3 <= field2510)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2637(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2551();
            if (var5 < 0 || field2510 != 0 && var5 > field2510) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2431(var6, var5, arg0, var3, 9);
            } else {
                field2518.method2426(var1, var6);
            }
            return var6;
        }
    }
}
