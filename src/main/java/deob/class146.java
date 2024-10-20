package deob;

@ObfuscatedName("ey")
public abstract class class146 {

    @ObfuscatedName("ey.k")
    public int field2468;

    @ObfuscatedName("ey.b")
    public int[] field2453;

    @ObfuscatedName("ey.e")
    public int[] field2452;

    @ObfuscatedName("ey.i")
    public class170 field2454;

    @ObfuscatedName("ey.t")
    public int[] field2469;

    @ObfuscatedName("ey.z")
    public int[] field2457;

    @ObfuscatedName("ey.g")
    public int[] field2458;

    @ObfuscatedName("ey.c")
    public int[][] field2459;

    @ObfuscatedName("ey.o")
    public int[][] field2460;

    @ObfuscatedName("ey.q")
    public class170[] field2455;

    @ObfuscatedName("ey.w")
    public Object[] field2456;

    @ObfuscatedName("ey.y")
    public Object[][] field2464;

    @ObfuscatedName("ey.p")
    public static class104 field2462 = new class104();

    @ObfuscatedName("ey.m")
    public int field2465;

    @ObfuscatedName("ey.a")
    public boolean field2466;

    @ObfuscatedName("ey.u")
    public boolean field2463;

    @ObfuscatedName("ey.n")
    public static int field2467 = 0;

    public class146(boolean arg0, boolean arg1) {
        this.field2466 = arg0;
        this.field2463 = arg1;
    }

    @ObfuscatedName("ey.k([BI)V")
    public void method2721(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class107.field1858[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2465 = var5;
        class107 var8 = new class107(Statics.method1351(arg0));
        int var9 = var8.method2115();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2120();
        }
        int var10 = var8.method2115();
        if (var9 >= 7) {
            this.field2468 = var8.method2129();
        } else {
            this.field2468 = var8.method2117();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2453 = new int[this.field2468];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2468; var13++) {
                this.field2453[var13] = var11 += var8.method2129();
                if (this.field2453[var13] > var12) {
                    var12 = this.field2453[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2468; var14++) {
                this.field2453[var14] = var11 += var8.method2117();
                if (this.field2453[var14] > var12) {
                    var12 = this.field2453[var14];
                }
            }
        }
        this.field2469 = new int[var12 + 1];
        this.field2457 = new int[var12 + 1];
        this.field2458 = new int[var12 + 1];
        this.field2459 = new int[var12 + 1][];
        this.field2456 = new Object[var12 + 1];
        this.field2464 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2452 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2468; var15++) {
                this.field2452[this.field2453[var15]] = var8.method2120();
            }
            this.field2454 = new class170(this.field2452);
        }
        for (int var16 = 0; var16 < this.field2468; var16++) {
            this.field2469[this.field2453[var16]] = var8.method2120();
        }
        for (int var17 = 0; var17 < this.field2468; var17++) {
            this.field2457[this.field2453[var17]] = var8.method2120();
        }
        for (int var18 = 0; var18 < this.field2468; var18++) {
            this.field2458[this.field2453[var18]] = var8.method2117();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2468; var19++) {
                int var20 = this.field2453[var19];
                int var21 = this.field2458[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2459[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2459[var20][var24] = var22 += var8.method2129();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2464[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2468; var26++) {
                int var27 = this.field2453[var26];
                int var28 = this.field2458[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2459[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2459[var27][var31] = var29 += var8.method2117();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2464[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2460 = new int[var12 + 1][];
        this.field2455 = new class170[var12 + 1];
        for (int var33 = 0; var33 < this.field2468; var33++) {
            int var34 = this.field2453[var33];
            int var35 = this.field2458[var34];
            this.field2460[var34] = new int[this.field2464[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2460[var34][this.field2459[var34][var36]] = var8.method2120();
            }
            this.field2455[var34] = new class170(this.field2460[var34]);
        }
    }

    @ObfuscatedName("ey.b(II)V")
    public void method2712(int arg0) {
    }

    @ObfuscatedName("ey.e(III)[B")
    public byte[] method2759(int arg0, int arg1) {
        return this.method2699(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ey.i(II[IS)[B")
    public byte[] method2699(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2464.length || this.field2464[arg0] == null || arg1 < 0 || arg1 >= this.field2464[arg0].length) {
            return null;
        }
        if (this.field2464[arg0][arg1] == null) {
            boolean var4 = this.method2711(arg0, arg2);
            if (!var4) {
                this.method2731(arg0);
                boolean var5 = this.method2711(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method2446(this.field2464[arg0][arg1], false);
        if (this.field2463) {
            this.field2464[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ey.t(III)Z")
    public boolean method2700(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2464.length || this.field2464[arg0] == null || arg1 < 0 || arg1 >= this.field2464[arg0].length) {
            return false;
        } else if (this.field2464[arg0][arg1] != null) {
            return true;
        } else if (this.field2456[arg0] == null) {
            this.method2731(arg0);
            return this.field2456[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ey.z(II)Z")
    public boolean method2701(int arg0) {
        if (this.field2456[arg0] == null) {
            this.method2731(arg0);
            return this.field2456[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ey.g(I)Z")
    public boolean method2702() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2453.length; var2++) {
            int var3 = this.field2453[var2];
            if (this.field2456[var3] == null) {
                this.method2731(var3);
                if (this.field2456[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ey.c(IB)[B")
    public byte[] method2756(int arg0) {
        if (this.field2464.length == 1) {
            return this.method2759(0, arg0);
        } else if (this.field2464[arg0].length == 1) {
            return this.method2759(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ey.o(IIB)[B")
    public byte[] method2704(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2464.length || this.field2464[arg0] == null || arg1 < 0 || arg1 >= this.field2464[arg0].length) {
            return null;
        }
        if (this.field2464[arg0][arg1] == null) {
            boolean var3 = this.method2711(arg0, (int[]) null);
            if (!var3) {
                this.method2731(arg0);
                boolean var4 = this.method2711(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method2446(this.field2464[arg0][arg1], false);
    }

    @ObfuscatedName("ey.q(IB)[B")
    public byte[] method2737(int arg0) {
        if (this.field2464.length == 1) {
            return this.method2704(0, arg0);
        } else if (this.field2464[arg0].length == 1) {
            return this.method2704(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ey.w(II)V")
    public void method2731(int arg0) {
    }

    @ObfuscatedName("ey.y(II)[I")
    public int[] method2705(int arg0) {
        return this.field2459[arg0];
    }

    @ObfuscatedName("ey.p(II)I")
    public int method2723(int arg0) {
        return this.field2464[arg0].length;
    }

    @ObfuscatedName("ey.m(I)I")
    public int method2708() {
        return this.field2464.length;
    }

    @ObfuscatedName("ey.a(IB)V")
    public void method2709(int arg0) {
        for (int var2 = 0; var2 < this.field2464[arg0].length; var2++) {
            this.field2464[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ey.u(I)V")
    public void method2710() {
        for (int var1 = 0; var1 < this.field2464.length; var1++) {
            if (this.field2464[var1] != null) {
                for (int var2 = 0; var2 < this.field2464[var1].length; var2++) {
                    this.field2464[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ey.n(I[IB)Z")
    public boolean method2711(int arg0, int[] arg1) {
        if (this.field2456[arg0] == null) {
            return false;
        }
        int var3 = this.field2458[arg0];
        int[] var4 = this.field2459[arg0];
        Object[] var5 = this.field2464[arg0];
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
            var8 = class112.method2446(this.field2456[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2159(arg1, 5, var9.field1857.length);
        } else {
            var8 = class112.method2446(this.field2456[arg0], false);
        }
        byte[] var10;
        try {
            var10 = Statics.method1351(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class107.field1858[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class107.field1858[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class135.method2561(var43, var21 + var25 + "," + this.field2469[arg0] + "," + this.field2465);
        }
        if (this.field2466) {
            this.field2456[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class107 var31 = new class107(var10);
            int[] var32 = new int[var3];
            var31.field1862 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2120();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field1862 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2120();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field2463) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class112.method2047(var36[var42], false);
                }
            }
        } else if (this.field2463) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method2047(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ey.x(Ljava/lang/String;I)I")
    public int method2728(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2454.method3155(class199.method181(var2));
    }

    @ObfuscatedName("ey.f(ILjava/lang/String;B)I")
    public int method2713(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2455[arg0].method3155(class199.method181(var3));
    }

    @ObfuscatedName("ey.v(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2714(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2454.method3155(class199.method181(var3));
        int var6 = this.field2455[var5].method3155(class199.method181(var4));
        return this.method2759(var5, var6);
    }

    @ObfuscatedName("ey.s(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2715(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2454.method3155(class199.method181(var3));
        int var6 = this.field2455[var5].method3155(class199.method181(var4));
        return this.method2700(var5, var6);
    }

    @ObfuscatedName("ey.r(Ljava/lang/String;B)Z")
    public boolean method2716(String arg0) {
        int var2 = this.method2728("");
        return var2 == -1 ? this.method2715(arg0, "") : this.method2715("", arg0);
    }

    @ObfuscatedName("ey.j(Ljava/lang/String;I)V")
    public void method2717(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2454.method3155(class199.method181(var2));
        if (var3 >= 0) {
            this.method2712(var3);
        }
    }
}
