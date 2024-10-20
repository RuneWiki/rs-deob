package deob;

@ObfuscatedName("er")
public abstract class class152 {

    @ObfuscatedName("er.i")
    public int field2501;

    @ObfuscatedName("er.v")
    public int[] field2504;

    @ObfuscatedName("er.m")
    public int[] field2499;

    @ObfuscatedName("er.j")
    public class169 field2500;

    @ObfuscatedName("er.o")
    public int[] field2502;

    @ObfuscatedName("er.l")
    public int[] field2497;

    @ObfuscatedName("er.g")
    public int[] field2498;

    @ObfuscatedName("er.w")
    public int[][] field2505;

    @ObfuscatedName("er.c")
    public int[][] field2515;

    @ObfuscatedName("er.z")
    public class169[] field2506;

    @ObfuscatedName("er.f")
    public Object[] field2507;

    @ObfuscatedName("er.a")
    public Object[][] field2508;

    @ObfuscatedName("er.d")
    public static class122 field2509 = new class122();

    @ObfuscatedName("er.e")
    public int field2510;

    @ObfuscatedName("er.y")
    public boolean field2511;

    @ObfuscatedName("er.k")
    public boolean field2512;

    @ObfuscatedName("er.h")
    public static int field2513 = 0;

    public class152(boolean arg0, boolean arg1) {
        this.field2511 = arg0;
        this.field2512 = arg1;
    }

    @ObfuscatedName("er.i([BI)V")
    public void method3039(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class127.field2040[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2510 = var5;
        class127 var8 = new class127(method1380(arg0));
        int var9 = var8.method2491();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2668();
        }
        int var10 = var8.method2491();
        if (var9 >= 7) {
            this.field2501 = var8.method2504();
        } else {
            this.field2501 = var8.method2493();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2504 = new int[this.field2501];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2501; var13++) {
                this.field2504[var13] = var11 += var8.method2504();
                if (this.field2504[var13] > var12) {
                    var12 = this.field2504[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2501; var14++) {
                this.field2504[var14] = var11 += var8.method2493();
                if (this.field2504[var14] > var12) {
                    var12 = this.field2504[var14];
                }
            }
        }
        this.field2502 = new int[var12 + 1];
        this.field2497 = new int[var12 + 1];
        this.field2498 = new int[var12 + 1];
        this.field2505 = new int[var12 + 1][];
        this.field2507 = new Object[var12 + 1];
        this.field2508 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2499 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2501; var15++) {
                this.field2499[this.field2504[var15]] = var8.method2668();
            }
            this.field2500 = new class169(this.field2499);
        }
        for (int var16 = 0; var16 < this.field2501; var16++) {
            this.field2502[this.field2504[var16]] = var8.method2668();
        }
        for (int var17 = 0; var17 < this.field2501; var17++) {
            this.field2497[this.field2504[var17]] = var8.method2668();
        }
        for (int var18 = 0; var18 < this.field2501; var18++) {
            this.field2498[this.field2504[var18]] = var8.method2493();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2501; var19++) {
                int var20 = this.field2504[var19];
                int var21 = this.field2498[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2505[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2505[var20][var24] = var22 += var8.method2504();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2508[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2501; var26++) {
                int var27 = this.field2504[var26];
                int var28 = this.field2498[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2505[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2505[var27][var31] = var29 += var8.method2493();
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
        this.field2515 = new int[var12 + 1][];
        this.field2506 = new class169[var12 + 1];
        for (int var33 = 0; var33 < this.field2501; var33++) {
            int var34 = this.field2504[var33];
            int var35 = this.field2498[var34];
            this.field2515[var34] = new int[this.field2508[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2515[var34][this.field2505[var34][var36]] = var8.method2668();
            }
            this.field2506[var34] = new class169(this.field2515[var34]);
        }
    }

    @ObfuscatedName("er.v(II)V")
    public void method3031(int arg0) {
    }

    @ObfuscatedName("er.m(IIB)[B")
    public byte[] method3032(int arg0, int arg1) {
        return this.method3033(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("er.j(II[IB)[B")
    public byte[] method3033(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2508.length || this.field2508[arg0] == null || arg1 < 0 || arg1 >= this.field2508[arg0].length) {
            return null;
        }
        if (this.field2508[arg0][arg1] == null) {
            boolean var4 = this.method3046(arg0, arg2);
            if (!var4) {
                this.method3040(arg0);
                boolean var5 = this.method3046(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method49(this.field2508[arg0][arg1], false);
        if (this.field2512) {
            this.field2508[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("er.o(IIB)Z")
    public boolean method3105(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2508.length || this.field2508[arg0] == null || arg1 < 0 || arg1 >= this.field2508[arg0].length) {
            return false;
        } else if (this.field2508[arg0][arg1] != null) {
            return true;
        } else if (this.field2507[arg0] == null) {
            this.method3040(arg0);
            return this.field2507[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("er.l(II)Z")
    public boolean method3035(int arg0) {
        if (this.field2507[arg0] == null) {
            this.method3040(arg0);
            return this.field2507[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("er.g(I)Z")
    public boolean method3036() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2504.length; var2++) {
            int var3 = this.field2504[var2];
            if (this.field2507[var3] == null) {
                this.method3040(var3);
                if (this.field2507[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("er.w(II)[B")
    public byte[] method3037(int arg0) {
        if (this.field2508.length == 1) {
            return this.method3032(0, arg0);
        } else if (this.field2508[arg0].length == 1) {
            return this.method3032(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("er.c(III)[B")
    public byte[] method3050(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2508.length || this.field2508[arg0] == null || arg1 < 0 || arg1 >= this.field2508[arg0].length) {
            return null;
        }
        if (this.field2508[arg0][arg1] == null) {
            boolean var3 = this.method3046(arg0, (int[]) null);
            if (!var3) {
                this.method3040(arg0);
                boolean var4 = this.method3046(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method49(this.field2508[arg0][arg1], false);
    }

    @ObfuscatedName("er.z(II)[B")
    public byte[] method3049(int arg0) {
        if (this.field2508.length == 1) {
            return this.method3050(0, arg0);
        } else if (this.field2508[arg0].length == 1) {
            return this.method3050(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("er.f(IB)V")
    public void method3040(int arg0) {
    }

    @ObfuscatedName("er.a(II)[I")
    public int[] method3041(int arg0) {
        return this.field2505[arg0];
    }

    @ObfuscatedName("er.d(IB)I")
    public int method3088(int arg0) {
        return this.field2508[arg0].length;
    }

    @ObfuscatedName("er.e(I)I")
    public int method3043() {
        return this.field2508.length;
    }

    @ObfuscatedName("er.y(II)V")
    public void method3044(int arg0) {
        for (int var2 = 0; var2 < this.field2508[arg0].length; var2++) {
            this.field2508[arg0][var2] = null;
        }
    }

    @ObfuscatedName("er.k(I)V")
    public void method3045() {
        for (int var1 = 0; var1 < this.field2508.length; var1++) {
            if (this.field2508[var1] != null) {
                for (int var2 = 0; var2 < this.field2508[var1].length; var2++) {
                    this.field2508[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("er.h(I[IB)Z")
    public boolean method3046(int arg0, int[] arg1) {
        if (this.field2507[arg0] == null) {
            return false;
        }
        int var3 = this.field2498[arg0];
        int[] var4 = this.field2505[arg0];
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
            var8 = class119.method49(this.field2507[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2565(arg1, 5, var9.field2041.length);
        } else {
            var8 = class119.method49(this.field2507[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1380(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class127.field2040[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class127.field2040[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class80.method1419(var43, var21 + var25 + "," + this.field2502[arg0] + "," + this.field2510);
        }
        if (this.field2511) {
            this.field2507[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class127 var31 = new class127(var10);
            int[] var32 = new int[var3];
            var31.field2039 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2668();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field2039 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2668();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field2512) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class119.method841(var36[var42], false);
                }
            }
        } else if (this.field2512) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method841(var10, false);
        }
        return true;
    }

    @ObfuscatedName("er.x(Ljava/lang/String;I)I")
    public int method3047(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2500.method3304(class147.method2968(var2));
    }

    @ObfuscatedName("er.b(ILjava/lang/String;I)I")
    public int method3048(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2506[arg0].method3304(class147.method2968(var3));
    }

    @ObfuscatedName("er.n(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3093(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2500.method3304(class147.method2968(var3));
        int var6 = this.field2506[var5].method3304(class147.method2968(var4));
        return this.method3032(var5, var6);
    }

    @ObfuscatedName("er.q(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3074(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2500.method3304(class147.method2968(var3));
        int var6 = this.field2506[var5].method3304(class147.method2968(var4));
        return this.method3105(var5, var6);
    }

    @ObfuscatedName("er.r(Ljava/lang/String;B)V")
    public void method3051(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2500.method3304(class147.method2968(var2));
        if (var3 >= 0) {
            this.method3031(var3);
        }
    }

    @ObfuscatedName("bl.u([BB)[B")
    public static final byte[] method1380(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2491();
        int var3 = var1.method2668();
        if (var3 < 0 || !(field2513 == 0 || var3 <= field2513)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2647(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2668();
            if (var5 < 0 || field2513 != 0 && var5 > field2513) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2448(var6, var5, arg0, var3, 9);
            } else {
                field2509.method2428(var1, var6);
            }
            return var6;
        }
    }
}
