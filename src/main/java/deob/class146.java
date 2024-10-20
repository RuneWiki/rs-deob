package deob;

@ObfuscatedName("eg")
public abstract class class146 {

    @ObfuscatedName("eg.t")
    public int field2439;

    @ObfuscatedName("eg.s")
    public int[] field2452;

    @ObfuscatedName("eg.f")
    public int[] field2438;

    @ObfuscatedName("eg.e")
    public class170 field2437;

    @ObfuscatedName("eg.d")
    public int[] field2444;

    @ObfuscatedName("eg.n")
    public int[] field2440;

    @ObfuscatedName("eg.v")
    public int[] field2450;

    @ObfuscatedName("eg.z")
    public int[][] field2442;

    @ObfuscatedName("eg.j")
    public int[][] field2443;

    @ObfuscatedName("eg.u")
    public class170[] field2436;

    @ObfuscatedName("eg.g")
    public Object[] field2445;

    @ObfuscatedName("eg.a")
    public Object[][] field2446;

    @ObfuscatedName("eg.c")
    public static class104 field2447 = new class104();

    @ObfuscatedName("eg.w")
    public int field2448;

    @ObfuscatedName("eg.l")
    public boolean field2449;

    @ObfuscatedName("eg.q")
    public boolean field2454;

    @ObfuscatedName("eg.x")
    public static int field2451 = 0;

    public class146(boolean arg0, boolean arg1) {
        this.field2449 = arg0;
        this.field2454 = arg1;
    }

    @ObfuscatedName("eg.t([BI)V")
    public void method2707(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class107.field1834[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2448 = var5;
        class107 var8 = new class107(method2373(arg0));
        int var9 = var8.method2101();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2106();
        }
        int var10 = var8.method2101();
        if (var9 >= 7) {
            this.field2439 = var8.method2193();
        } else {
            this.field2439 = var8.method2103();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2452 = new int[this.field2439];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2439; var13++) {
                this.field2452[var13] = var11 += var8.method2193();
                if (this.field2452[var13] > var12) {
                    var12 = this.field2452[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2439; var14++) {
                this.field2452[var14] = var11 += var8.method2103();
                if (this.field2452[var14] > var12) {
                    var12 = this.field2452[var14];
                }
            }
        }
        this.field2444 = new int[var12 + 1];
        this.field2440 = new int[var12 + 1];
        this.field2450 = new int[var12 + 1];
        this.field2442 = new int[var12 + 1][];
        this.field2445 = new Object[var12 + 1];
        this.field2446 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2438 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2439; var15++) {
                this.field2438[this.field2452[var15]] = var8.method2106();
            }
            this.field2437 = new class170(this.field2438);
        }
        for (int var16 = 0; var16 < this.field2439; var16++) {
            this.field2444[this.field2452[var16]] = var8.method2106();
        }
        for (int var17 = 0; var17 < this.field2439; var17++) {
            this.field2440[this.field2452[var17]] = var8.method2106();
        }
        for (int var18 = 0; var18 < this.field2439; var18++) {
            this.field2450[this.field2452[var18]] = var8.method2103();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2439; var19++) {
                int var20 = this.field2452[var19];
                int var21 = this.field2450[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2442[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2442[var20][var24] = var22 += var8.method2193();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2446[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2439; var26++) {
                int var27 = this.field2452[var26];
                int var28 = this.field2450[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2442[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2442[var27][var31] = var29 += var8.method2103();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2446[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2443 = new int[var12 + 1][];
        this.field2436 = new class170[var12 + 1];
        for (int var33 = 0; var33 < this.field2439; var33++) {
            int var34 = this.field2452[var33];
            int var35 = this.field2450[var34];
            this.field2443[var34] = new int[this.field2446[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2443[var34][this.field2442[var34][var36]] = var8.method2106();
            }
            this.field2436[var34] = new class170(this.field2443[var34]);
        }
    }

    @ObfuscatedName("eg.s(IB)V")
    public void method2708(int arg0) {
    }

    @ObfuscatedName("eg.f(IIB)[B")
    public byte[] method2709(int arg0, int arg1) {
        return this.method2735(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eg.e(II[II)[B")
    public byte[] method2735(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2446.length || this.field2446[arg0] == null || arg1 < 0 || arg1 >= this.field2446[arg0].length) {
            return null;
        }
        if (this.field2446[arg0][arg1] == null) {
            boolean var4 = this.method2723(arg0, arg2);
            if (!var4) {
                this.method2775(arg0);
                boolean var5 = this.method2723(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method2374(this.field2446[arg0][arg1], false);
        if (this.field2454) {
            this.field2446[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eg.d(IIB)Z")
    public boolean method2740(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2446.length || this.field2446[arg0] == null || arg1 < 0 || arg1 >= this.field2446[arg0].length) {
            return false;
        } else if (this.field2446[arg0][arg1] != null) {
            return true;
        } else if (this.field2445[arg0] == null) {
            this.method2775(arg0);
            return this.field2445[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.n(II)Z")
    public boolean method2731(int arg0) {
        if (this.field2445[arg0] == null) {
            this.method2775(arg0);
            return this.field2445[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.v(I)Z")
    public boolean method2713() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2452.length; var2++) {
            int var3 = this.field2452[var2];
            if (this.field2445[var3] == null) {
                this.method2775(var3);
                if (this.field2445[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eg.z(II)[B")
    public byte[] method2714(int arg0) {
        if (this.field2446.length == 1) {
            return this.method2709(0, arg0);
        } else if (this.field2446[arg0].length == 1) {
            return this.method2709(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eg.j(III)[B")
    public byte[] method2715(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2446.length || this.field2446[arg0] == null || arg1 < 0 || arg1 >= this.field2446[arg0].length) {
            return null;
        }
        if (this.field2446[arg0][arg1] == null) {
            boolean var3 = this.method2723(arg0, (int[]) null);
            if (!var3) {
                this.method2775(arg0);
                boolean var4 = this.method2723(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method2374(this.field2446[arg0][arg1], false);
    }

    @ObfuscatedName("eg.u(II)[B")
    public byte[] method2716(int arg0) {
        if (this.field2446.length == 1) {
            return this.method2715(0, arg0);
        } else if (this.field2446[arg0].length == 1) {
            return this.method2715(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eg.g(IB)V")
    public void method2775(int arg0) {
    }

    @ObfuscatedName("eg.a(II)[I")
    public int[] method2786(int arg0) {
        return this.field2442[arg0];
    }

    @ObfuscatedName("eg.c(II)I")
    public int method2719(int arg0) {
        return this.field2446[arg0].length;
    }

    @ObfuscatedName("eg.w(I)I")
    public int method2734() {
        return this.field2446.length;
    }

    @ObfuscatedName("eg.l(IB)V")
    public void method2721(int arg0) {
        for (int var2 = 0; var2 < this.field2446[arg0].length; var2++) {
            this.field2446[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eg.q(I)V")
    public void method2722() {
        for (int var1 = 0; var1 < this.field2446.length; var1++) {
            if (this.field2446[var1] != null) {
                for (int var2 = 0; var2 < this.field2446[var1].length; var2++) {
                    this.field2446[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eg.x(I[IB)Z")
    public boolean method2723(int arg0, int[] arg1) {
        if (this.field2445[arg0] == null) {
            return false;
        }
        int var3 = this.field2450[arg0];
        int[] var4 = this.field2442[arg0];
        Object[] var5 = this.field2446[arg0];
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
            var8 = class112.method2374(this.field2445[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2306(arg1, 5, var9.field1831.length);
        } else {
            var8 = class112.method2374(this.field2445[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2373(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + Statics.method2863(var8, var8.length) + ",";
            int var14 = var8.length - 2;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class107.field1834[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            throw class135.method486(var35, var13 + var17 + "," + this.field2444[arg0] + "," + this.field2448);
        }
        if (this.field2449) {
            this.field2445[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class107 var23 = new class107(var10);
            int[] var24 = new int[var3];
            var23.field1830 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2106();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1830 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2106();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2454) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class112.method1934(var28[var34], false);
                }
            }
        } else if (this.field2454) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method1934(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eg.p(Ljava/lang/String;I)I")
    public int method2724(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2437.method3166(class199.method591(var2));
    }

    @ObfuscatedName("eg.y(ILjava/lang/String;I)I")
    public int method2725(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2436[arg0].method3166(class199.method591(var3));
    }

    @ObfuscatedName("eg.r(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2726(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2437.method3166(class199.method591(var3));
        int var6 = this.field2436[var5].method3166(class199.method591(var4));
        return this.method2709(var5, var6);
    }

    @ObfuscatedName("eg.k(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2711(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2437.method3166(class199.method591(var3));
        int var6 = this.field2436[var5].method3166(class199.method591(var4));
        return this.method2740(var5, var6);
    }

    @ObfuscatedName("eg.b(Ljava/lang/String;I)Z")
    public boolean method2728(String arg0) {
        int var2 = this.method2724("");
        return var2 == -1 ? this.method2711(arg0, "") : this.method2711("", arg0);
    }

    @ObfuscatedName("eg.h(Ljava/lang/String;I)V")
    public void method2729(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2437.method3166(class199.method591(var2));
        if (var3 >= 0) {
            this.method2708(var3);
        }
    }

    @ObfuscatedName("dh.i([BI)[B")
    public static final byte[] method2373(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2101();
        int var3 = var1.method2106();
        if (var3 < 0 || !(field2451 == 0 || var3 <= field2451)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2112(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2106();
            if (var5 < 0 || field2451 != 0 && var5 > field2451) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2074(var6, var5, arg0, var3, 9);
            } else {
                field2447.method2047(var1, var6);
            }
            return var6;
        }
    }
}
