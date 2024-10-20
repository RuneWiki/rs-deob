package deob;

@ObfuscatedName("er")
public abstract class class151 {

    @ObfuscatedName("er.p")
    public int field2512;

    @ObfuscatedName("er.j")
    public int[] field2498;

    @ObfuscatedName("er.w")
    public int[] field2499;

    @ObfuscatedName("er.h")
    public class168 field2500;

    @ObfuscatedName("er.v")
    public int[] field2497;

    @ObfuscatedName("er.k")
    public int[] field2513;

    @ObfuscatedName("er.g")
    public int[] field2507;

    @ObfuscatedName("er.n")
    public int[][] field2504;

    @ObfuscatedName("er.c")
    public int[][] field2505;

    @ObfuscatedName("er.o")
    public class168[] field2506;

    @ObfuscatedName("er.u")
    public Object[] field2510;

    @ObfuscatedName("er.z")
    public Object[][] field2508;

    @ObfuscatedName("er.e")
    public static class121 field2503 = new class121();

    @ObfuscatedName("er.l")
    public int field2502;

    @ObfuscatedName("er.m")
    public boolean field2511;

    @ObfuscatedName("er.s")
    public boolean field2501;

    @ObfuscatedName("er.i")
    public static int field2509 = 0;

    public class151(boolean arg0, boolean arg1) {
        this.field2511 = arg0;
        this.field2501 = arg1;
    }

    @ObfuscatedName("er.p([BI)V")
    public void method2911(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class126.field2041[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2502 = var5;
        class126 var8 = new class126(Statics.method1357(arg0));
        int var9 = var8.method2544();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2380();
        }
        int var10 = var8.method2544();
        if (var9 >= 7) {
            this.field2512 = var8.method2389();
        } else {
            this.field2512 = var8.method2489();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2498 = new int[this.field2512];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2512; var13++) {
                this.field2498[var13] = var11 += var8.method2389();
                if (this.field2498[var13] > var12) {
                    var12 = this.field2498[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2512; var14++) {
                this.field2498[var14] = var11 += var8.method2489();
                if (this.field2498[var14] > var12) {
                    var12 = this.field2498[var14];
                }
            }
        }
        this.field2497 = new int[var12 + 1];
        this.field2513 = new int[var12 + 1];
        this.field2507 = new int[var12 + 1];
        this.field2504 = new int[var12 + 1][];
        this.field2510 = new Object[var12 + 1];
        this.field2508 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2499 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2512; var15++) {
                this.field2499[this.field2498[var15]] = var8.method2380();
            }
            this.field2500 = new class168(this.field2499);
        }
        for (int var16 = 0; var16 < this.field2512; var16++) {
            this.field2497[this.field2498[var16]] = var8.method2380();
        }
        for (int var17 = 0; var17 < this.field2512; var17++) {
            this.field2513[this.field2498[var17]] = var8.method2380();
        }
        for (int var18 = 0; var18 < this.field2512; var18++) {
            this.field2507[this.field2498[var18]] = var8.method2489();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2512; var19++) {
                int var20 = this.field2498[var19];
                int var21 = this.field2507[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2504[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2504[var20][var24] = var22 += var8.method2389();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2508[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2512; var26++) {
                int var27 = this.field2498[var26];
                int var28 = this.field2507[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2504[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2504[var27][var31] = var29 += var8.method2489();
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
        this.field2505 = new int[var12 + 1][];
        this.field2506 = new class168[var12 + 1];
        for (int var33 = 0; var33 < this.field2512; var33++) {
            int var34 = this.field2498[var33];
            int var35 = this.field2507[var34];
            this.field2505[var34] = new int[this.field2508[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2505[var34][this.field2504[var34][var36]] = var8.method2380();
            }
            this.field2506[var34] = new class168(this.field2505[var34]);
        }
    }

    @ObfuscatedName("er.j(IB)V")
    public void method2912(int arg0) {
    }

    @ObfuscatedName("er.w(IIB)[B")
    public byte[] method2973(int arg0, int arg1) {
        return this.method2934(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("er.h(II[II)[B")
    public byte[] method2934(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2508.length || this.field2508[arg0] == null || arg1 < 0 || arg1 >= this.field2508[arg0].length) {
            return null;
        }
        if (this.field2508[arg0][arg1] == null) {
            boolean var4 = this.method2927(arg0, arg2);
            if (!var4) {
                this.method2921(arg0);
                boolean var5 = this.method2927(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class118.method34(this.field2508[arg0][arg1], false);
        if (this.field2501) {
            this.field2508[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("er.v(III)Z")
    public boolean method2915(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2508.length || this.field2508[arg0] == null || arg1 < 0 || arg1 >= this.field2508[arg0].length) {
            return false;
        } else if (this.field2508[arg0][arg1] != null) {
            return true;
        } else if (this.field2510[arg0] == null) {
            this.method2921(arg0);
            return this.field2510[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("er.k(IB)Z")
    public boolean method2916(int arg0) {
        if (this.field2510[arg0] == null) {
            this.method2921(arg0);
            return this.field2510[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("er.g(I)Z")
    public boolean method2917() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2498.length; var2++) {
            int var3 = this.field2498[var2];
            if (this.field2510[var3] == null) {
                this.method2921(var3);
                if (this.field2510[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("er.n(IS)[B")
    public byte[] method2918(int arg0) {
        if (this.field2508.length == 1) {
            return this.method2973(0, arg0);
        } else if (this.field2508[arg0].length == 1) {
            return this.method2973(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("er.c(IIB)[B")
    public byte[] method2919(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2508.length || this.field2508[arg0] == null || arg1 < 0 || arg1 >= this.field2508[arg0].length) {
            return null;
        }
        if (this.field2508[arg0][arg1] == null) {
            boolean var3 = this.method2927(arg0, (int[]) null);
            if (!var3) {
                this.method2921(arg0);
                boolean var4 = this.method2927(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class118.method34(this.field2508[arg0][arg1], false);
    }

    @ObfuscatedName("er.o(II)[B")
    public byte[] method2920(int arg0) {
        if (this.field2508.length == 1) {
            return this.method2919(0, arg0);
        } else if (this.field2508[arg0].length == 1) {
            return this.method2919(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("er.u(II)V")
    public void method2921(int arg0) {
    }

    @ObfuscatedName("er.z(IS)[I")
    public int[] method2972(int arg0) {
        return this.field2504[arg0];
    }

    @ObfuscatedName("er.e(II)I")
    public int method2923(int arg0) {
        return this.field2508[arg0].length;
    }

    @ObfuscatedName("er.l(B)I")
    public int method2924() {
        return this.field2508.length;
    }

    @ObfuscatedName("er.m(IB)V")
    public void method2976(int arg0) {
        for (int var2 = 0; var2 < this.field2508[arg0].length; var2++) {
            this.field2508[arg0][var2] = null;
        }
    }

    @ObfuscatedName("er.s(I)V")
    public void method2926() {
        for (int var1 = 0; var1 < this.field2508.length; var1++) {
            if (this.field2508[var1] != null) {
                for (int var2 = 0; var2 < this.field2508[var1].length; var2++) {
                    this.field2508[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("er.i(I[IB)Z")
    public boolean method2927(int arg0, int[] arg1) {
        if (this.field2510[arg0] == null) {
            return false;
        }
        int var3 = this.field2507[arg0];
        int[] var4 = this.field2504[arg0];
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
            var8 = class118.method34(this.field2510[arg0], true);
            class126 var9 = new class126(var8);
            var9.method2392(arg1, 5, var9.field2047.length);
        } else {
            var8 = class118.method34(this.field2510[arg0], false);
        }
        byte[] var10;
        try {
            var10 = Statics.method1357(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class126.field2041[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class126.field2041[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class79.method1367(var42, var20 + var24 + "," + this.field2497[arg0] + "," + this.field2502);
        }
        if (this.field2511) {
            this.field2510[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class126 var30 = new class126(var10);
            int[] var31 = new int[var3];
            var30.field2043 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method2380();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field2043 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method2380();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field2501) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class118.method597(var35[var41], false);
                }
            }
        } else if (this.field2501) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class118.method597(var10, false);
        }
        return true;
    }

    @ObfuscatedName("er.y(Ljava/lang/String;I)I")
    public int method2936(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2500.method3210(class146.method2357(var2));
    }

    @ObfuscatedName("er.d(ILjava/lang/String;I)I")
    public int method2929(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2506[arg0].method3210(class146.method2357(var3));
    }

    @ObfuscatedName("er.f(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2930(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2500.method3210(class146.method2357(var3));
        int var6 = this.field2506[var5].method3210(class146.method2357(var4));
        return this.method2973(var5, var6);
    }

    @ObfuscatedName("er.a(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2931(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2500.method3210(class146.method2357(var3));
        int var6 = this.field2506[var5].method3210(class146.method2357(var4));
        return this.method2915(var5, var6);
    }

    @ObfuscatedName("er.x(Ljava/lang/String;B)V")
    public void method2932(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2500.method3210(class146.method2357(var2));
        if (var3 >= 0) {
            this.method2912(var3);
        }
    }
}
