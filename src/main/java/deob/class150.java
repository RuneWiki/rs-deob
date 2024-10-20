package deob;

@ObfuscatedName("eh")
public abstract class class150 {

    @ObfuscatedName("eh.j")
    public int field2461;

    @ObfuscatedName("eh.y")
    public int[] field2444;

    @ObfuscatedName("eh.x")
    public int[] field2445;

    @ObfuscatedName("eh.z")
    public class167 field2459;

    @ObfuscatedName("eh.c")
    public int[] field2447;

    @ObfuscatedName("eh.e")
    public int[] field2448;

    @ObfuscatedName("eh.s")
    public int[] field2449;

    @ObfuscatedName("eh.i")
    public int[][] field2457;

    @ObfuscatedName("eh.g")
    public int[][] field2446;

    @ObfuscatedName("eh.q")
    public class167[] field2451;

    @ObfuscatedName("eh.w")
    public Object[] field2453;

    @ObfuscatedName("eh.k")
    public Object[][] field2454;

    @ObfuscatedName("eh.v")
    public static class121 field2455 = new class121();

    @ObfuscatedName("eh.o")
    public int field2456;

    @ObfuscatedName("eh.m")
    public boolean field2443;

    @ObfuscatedName("eh.u")
    public boolean field2458;

    @ObfuscatedName("eh.r")
    public static int field2450 = 0;

    public class150(boolean arg0, boolean arg1) {
        this.field2443 = arg0;
        this.field2458 = arg1;
    }

    @ObfuscatedName("eh.j([BB)V")
    public void method2902(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class126.field2021[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2456 = var5;
        class126 var8 = new class126(method2263(arg0));
        int var9 = var8.method2399();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2387();
        }
        int var10 = var8.method2399();
        if (var9 >= 7) {
            this.field2461 = var8.method2534();
        } else {
            this.field2461 = var8.method2405();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2444 = new int[this.field2461];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2461; var13++) {
                this.field2444[var13] = var11 += var8.method2534();
                if (this.field2444[var13] > var12) {
                    var12 = this.field2444[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2461; var14++) {
                this.field2444[var14] = var11 += var8.method2405();
                if (this.field2444[var14] > var12) {
                    var12 = this.field2444[var14];
                }
            }
        }
        this.field2447 = new int[var12 + 1];
        this.field2448 = new int[var12 + 1];
        this.field2449 = new int[var12 + 1];
        this.field2457 = new int[var12 + 1][];
        this.field2453 = new Object[var12 + 1];
        this.field2454 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2445 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2461; var15++) {
                this.field2445[this.field2444[var15]] = var8.method2387();
            }
            this.field2459 = new class167(this.field2445);
        }
        for (int var16 = 0; var16 < this.field2461; var16++) {
            this.field2447[this.field2444[var16]] = var8.method2387();
        }
        for (int var17 = 0; var17 < this.field2461; var17++) {
            this.field2448[this.field2444[var17]] = var8.method2387();
        }
        for (int var18 = 0; var18 < this.field2461; var18++) {
            this.field2449[this.field2444[var18]] = var8.method2405();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2461; var19++) {
                int var20 = this.field2444[var19];
                int var21 = this.field2449[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2457[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2457[var20][var24] = var22 += var8.method2534();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2454[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2461; var26++) {
                int var27 = this.field2444[var26];
                int var28 = this.field2449[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2457[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2457[var27][var31] = var29 += var8.method2405();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2454[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2446 = new int[var12 + 1][];
        this.field2451 = new class167[var12 + 1];
        for (int var33 = 0; var33 < this.field2461; var33++) {
            int var34 = this.field2444[var33];
            int var35 = this.field2449[var34];
            this.field2446[var34] = new int[this.field2454[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2446[var34][this.field2457[var34][var36]] = var8.method2387();
            }
            this.field2451[var34] = new class167(this.field2446[var34]);
        }
    }

    @ObfuscatedName("eh.y(II)V")
    public void method2974(int arg0) {
    }

    @ObfuscatedName("eh.x(III)[B")
    public byte[] method2903(int arg0, int arg1) {
        return this.method2915(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eh.z(II[IB)[B")
    public byte[] method2915(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2454.length || this.field2454[arg0] == null || arg1 < 0 || arg1 >= this.field2454[arg0].length) {
            return null;
        }
        if (this.field2454[arg0][arg1] == null) {
            boolean var4 = this.method2917(arg0, arg2);
            if (!var4) {
                this.method2911(arg0);
                boolean var5 = this.method2917(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class118.method2148(this.field2454[arg0][arg1], false);
        if (this.field2458) {
            this.field2454[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eh.c(III)Z")
    public boolean method2965(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2454.length || this.field2454[arg0] == null || arg1 < 0 || arg1 >= this.field2454[arg0].length) {
            return false;
        } else if (this.field2454[arg0][arg1] != null) {
            return true;
        } else if (this.field2453[arg0] == null) {
            this.method2911(arg0);
            return this.field2453[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eh.e(II)Z")
    public boolean method2906(int arg0) {
        if (this.field2453[arg0] == null) {
            this.method2911(arg0);
            return this.field2453[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eh.s(I)Z")
    public boolean method2938() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2444.length; var2++) {
            int var3 = this.field2444[var2];
            if (this.field2453[var3] == null) {
                this.method2911(var3);
                if (this.field2453[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eh.i(II)[B")
    public byte[] method2908(int arg0) {
        if (this.field2454.length == 1) {
            return this.method2903(0, arg0);
        } else if (this.field2454[arg0].length == 1) {
            return this.method2903(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eh.g(III)[B")
    public byte[] method2909(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2454.length || this.field2454[arg0] == null || arg1 < 0 || arg1 >= this.field2454[arg0].length) {
            return null;
        }
        if (this.field2454[arg0][arg1] == null) {
            boolean var3 = this.method2917(arg0, (int[]) null);
            if (!var3) {
                this.method2911(arg0);
                boolean var4 = this.method2917(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class118.method2148(this.field2454[arg0][arg1], false);
    }

    @ObfuscatedName("eh.q(II)[B")
    public byte[] method2910(int arg0) {
        if (this.field2454.length == 1) {
            return this.method2909(0, arg0);
        } else if (this.field2454[arg0].length == 1) {
            return this.method2909(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eh.w(IB)V")
    public void method2911(int arg0) {
    }

    @ObfuscatedName("eh.k(IB)[I")
    public int[] method2952(int arg0) {
        return this.field2457[arg0];
    }

    @ObfuscatedName("eh.v(IB)I")
    public int method2913(int arg0) {
        return this.field2454[arg0].length;
    }

    @ObfuscatedName("eh.o(I)I")
    public int method2923() {
        return this.field2454.length;
    }

    @ObfuscatedName("eh.m(II)V")
    public void method2901(int arg0) {
        for (int var2 = 0; var2 < this.field2454[arg0].length; var2++) {
            this.field2454[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eh.u(B)V")
    public void method2916() {
        for (int var1 = 0; var1 < this.field2454.length; var1++) {
            if (this.field2454[var1] != null) {
                for (int var2 = 0; var2 < this.field2454[var1].length; var2++) {
                    this.field2454[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eh.r(I[IB)Z")
    public boolean method2917(int arg0, int[] arg1) {
        if (this.field2453[arg0] == null) {
            return false;
        }
        int var3 = this.field2449[arg0];
        int[] var4 = this.field2457[arg0];
        Object[] var5 = this.field2454[arg0];
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
            var8 = class118.method2148(this.field2453[arg0], true);
            class126 var9 = new class126(var8);
            var9.method2423(arg1, 5, var9.field2025.length);
        } else {
            var8 = class118.method2148(this.field2453[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2263(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class126.field2021[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class126.field2021[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class79.method760(var42, var20 + var24 + "," + this.field2447[arg0] + "," + this.field2456);
        }
        if (this.field2443) {
            this.field2453[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class126 var30 = new class126(var10);
            int[] var31 = new int[var3];
            var30.field2020 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method2387();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field2020 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method2387();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field2458) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class118.method2250(var35[var41], false);
                }
            }
        } else if (this.field2458) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class118.method2250(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eh.d(Ljava/lang/String;B)I")
    public int method2918(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2459.method3178(class146.method2781(var2));
    }

    @ObfuscatedName("eh.n(ILjava/lang/String;I)I")
    public int method2907(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2451[arg0].method3178(class146.method2781(var3));
    }

    @ObfuscatedName("eh.b(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2904(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2459.method3178(class146.method2781(var3));
        int var6 = this.field2451[var5].method3178(class146.method2781(var4));
        return this.method2903(var5, var6);
    }

    @ObfuscatedName("eh.p(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2921(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2459.method3178(class146.method2781(var3));
        int var6 = this.field2451[var5].method3178(class146.method2781(var4));
        return this.method2965(var5, var6);
    }

    @ObfuscatedName("eh.t(Ljava/lang/String;I)V")
    public void method2977(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2459.method3178(class146.method2781(var2));
        if (var3 >= 0) {
            this.method2974(var3);
        }
    }

    @ObfuscatedName("dj.l([BI)[B")
    public static final byte[] method2263(byte[] arg0) {
        class126 var1 = new class126(arg0);
        int var2 = var1.method2399();
        int var3 = var1.method2387();
        if (var3 < 0 || !(field2450 == 0 || var3 <= field2450)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2393(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2387();
            if (var5 < 0 || field2450 != 0 && var5 > field2450) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class122.method2320(var6, var5, arg0, var3, 9);
            } else {
                field2455.method2314(var1, var6);
            }
            return var6;
        }
    }
}
