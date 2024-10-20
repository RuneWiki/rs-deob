package deob;

@ObfuscatedName("eo")
public abstract class class152 {

    @ObfuscatedName("eo.g")
    public int field2495;

    @ObfuscatedName("eo.m")
    public int[] field2491;

    @ObfuscatedName("eo.v")
    public int[] field2492;

    @ObfuscatedName("eo.r")
    public class169 field2506;

    @ObfuscatedName("eo.n")
    public int[] field2503;

    @ObfuscatedName("eo.i")
    public int[] field2498;

    @ObfuscatedName("eo.s")
    public int[] field2490;

    @ObfuscatedName("eo.w")
    public int[][] field2497;

    @ObfuscatedName("eo.d")
    public int[][] field2493;

    @ObfuscatedName("eo.t")
    public class169[] field2499;

    @ObfuscatedName("eo.f")
    public Object[] field2500;

    @ObfuscatedName("eo.b")
    public Object[][] field2501;

    @ObfuscatedName("eo.z")
    public static class122 field2502 = new class122();

    @ObfuscatedName("eo.l")
    public int field2509;

    @ObfuscatedName("eo.e")
    public boolean field2504;

    @ObfuscatedName("eo.p")
    public boolean field2505;

    @ObfuscatedName("eo.o")
    public static int field2496 = 0;

    public class152(boolean arg0, boolean arg1) {
        this.field2504 = arg0;
        this.field2505 = arg1;
    }

    @ObfuscatedName("eo.g([BI)V")
    public void method2966(byte[] arg0) {
        this.field2509 = class127.method2284(arg0, arg0.length);
        class127 var2 = new class127(method2813(arg0));
        int var3 = var2.method2414();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2430();
        }
        int var4 = var2.method2414();
        if (var3 >= 7) {
            this.field2495 = var2.method2443();
        } else {
            this.field2495 = var2.method2416();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2491 = new int[this.field2495];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2495; var7++) {
                this.field2491[var7] = var5 += var2.method2443();
                if (this.field2491[var7] > var6) {
                    var6 = this.field2491[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2495; var8++) {
                this.field2491[var8] = var5 += var2.method2416();
                if (this.field2491[var8] > var6) {
                    var6 = this.field2491[var8];
                }
            }
        }
        this.field2503 = new int[var6 + 1];
        this.field2498 = new int[var6 + 1];
        this.field2490 = new int[var6 + 1];
        this.field2497 = new int[var6 + 1][];
        this.field2500 = new Object[var6 + 1];
        this.field2501 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2492 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2495; var9++) {
                this.field2492[this.field2491[var9]] = var2.method2430();
            }
            this.field2506 = new class169(this.field2492);
        }
        for (int var10 = 0; var10 < this.field2495; var10++) {
            this.field2503[this.field2491[var10]] = var2.method2430();
        }
        for (int var11 = 0; var11 < this.field2495; var11++) {
            this.field2498[this.field2491[var11]] = var2.method2430();
        }
        for (int var12 = 0; var12 < this.field2495; var12++) {
            this.field2490[this.field2491[var12]] = var2.method2416();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2495; var13++) {
                int var14 = this.field2491[var13];
                int var15 = this.field2490[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2497[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2497[var14][var18] = var16 += var2.method2443();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2501[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2495; var20++) {
                int var21 = this.field2491[var20];
                int var22 = this.field2490[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2497[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2497[var21][var25] = var23 += var2.method2416();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2501[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2493 = new int[var6 + 1][];
        this.field2499 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2495; var27++) {
            int var28 = this.field2491[var27];
            int var29 = this.field2490[var28];
            this.field2493[var28] = new int[this.field2501[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2493[var28][this.field2497[var28][var30]] = var2.method2430();
            }
            this.field2499[var28] = new class169(this.field2493[var28]);
        }
    }

    @ObfuscatedName("eo.m(II)V")
    public void method3034(int arg0) {
    }

    @ObfuscatedName("eo.v(III)[B")
    public byte[] method2968(int arg0, int arg1) {
        return this.method2969(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eo.r(II[IB)[B")
    public byte[] method2969(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2501.length || this.field2501[arg0] == null || arg1 < 0 || arg1 >= this.field2501[arg0].length) {
            return null;
        }
        if (this.field2501[arg0][arg1] == null) {
            boolean var4 = this.method3035(arg0, arg2);
            if (!var4) {
                this.method2976(arg0);
                boolean var5 = this.method3035(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method97(this.field2501[arg0][arg1], false);
        if (this.field2505) {
            this.field2501[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eo.n(III)Z")
    public boolean method2970(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2501.length || this.field2501[arg0] == null || arg1 < 0 || arg1 >= this.field2501[arg0].length) {
            return false;
        } else if (this.field2501[arg0][arg1] != null) {
            return true;
        } else if (this.field2500[arg0] == null) {
            this.method2976(arg0);
            return this.field2500[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eo.i(IB)Z")
    public boolean method2971(int arg0) {
        if (this.field2500[arg0] == null) {
            this.method2976(arg0);
            return this.field2500[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eo.s(I)Z")
    public boolean method2999() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2491.length; var2++) {
            int var3 = this.field2491[var2];
            if (this.field2500[var3] == null) {
                this.method2976(var3);
                if (this.field2500[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eo.w(II)[B")
    public byte[] method2973(int arg0) {
        if (this.field2501.length == 1) {
            return this.method2968(0, arg0);
        } else if (this.field2501[arg0].length == 1) {
            return this.method2968(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eo.d(III)[B")
    public byte[] method2974(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2501.length || this.field2501[arg0] == null || arg1 < 0 || arg1 >= this.field2501[arg0].length) {
            return null;
        }
        if (this.field2501[arg0][arg1] == null) {
            boolean var3 = this.method3035(arg0, (int[]) null);
            if (!var3) {
                this.method2976(arg0);
                boolean var4 = this.method3035(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method97(this.field2501[arg0][arg1], false);
    }

    @ObfuscatedName("eo.t(IB)[B")
    public byte[] method3010(int arg0) {
        if (this.field2501.length == 1) {
            return this.method2974(0, arg0);
        } else if (this.field2501[arg0].length == 1) {
            return this.method2974(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eo.f(IB)V")
    public void method2976(int arg0) {
    }

    @ObfuscatedName("eo.b(II)[I")
    public int[] method2977(int arg0) {
        return this.field2497[arg0];
    }

    @ObfuscatedName("eo.z(II)I")
    public int method2975(int arg0) {
        return this.field2501[arg0].length;
    }

    @ObfuscatedName("eo.l(I)I")
    public int method2979() {
        return this.field2501.length;
    }

    @ObfuscatedName("eo.e(II)V")
    public void method2980(int arg0) {
        for (int var2 = 0; var2 < this.field2501[arg0].length; var2++) {
            this.field2501[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eo.p(I)V")
    public void method2981() {
        for (int var1 = 0; var1 < this.field2501.length; var1++) {
            if (this.field2501[var1] != null) {
                for (int var2 = 0; var2 < this.field2501[var1].length; var2++) {
                    this.field2501[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eo.o(I[II)Z")
    public boolean method3035(int arg0, int[] arg1) {
        if (this.field2500[arg0] == null) {
            return false;
        }
        int var3 = this.field2490[arg0];
        int[] var4 = this.field2497[arg0];
        Object[] var5 = this.field2501[arg0];
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
            var8 = class119.method97(this.field2500[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2467(arg1, 5, var9.field2028.length);
        } else {
            var8 = class119.method97(this.field2500[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2813(var8);
        } catch (RuntimeException var27) {
            throw Statics.method53(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class127.method2284(var8, var8.length) + "," + class127.method2284(var8, var8.length - 2) + "," + this.field2503[arg0] + "," + this.field2509);
        }
        if (this.field2504) {
            this.field2500[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class127 var15 = new class127(var10);
            int[] var16 = new int[var3];
            var15.field2023 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2430();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2023 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2430();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2505) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class119.method1360(var20[var26], false);
                }
            }
        } else if (this.field2505) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method1360(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eo.h(Ljava/lang/String;I)I")
    public int method3015(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2506.method3238(class147.method237(var2));
    }

    @ObfuscatedName("eo.j(ILjava/lang/String;I)I")
    public int method2984(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2499[arg0].method3238(class147.method237(var3));
    }

    @ObfuscatedName("eo.x(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2985(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2506.method3238(class147.method237(var3));
        int var6 = this.field2499[var5].method3238(class147.method237(var4));
        return this.method2968(var5, var6);
    }

    @ObfuscatedName("eo.k(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2986(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2506.method3238(class147.method237(var3));
        int var6 = this.field2499[var5].method3238(class147.method237(var4));
        return this.method2970(var5, var6);
    }

    @ObfuscatedName("eo.a(Ljava/lang/String;B)V")
    public void method2987(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2506.method3238(class147.method237(var2));
        if (var3 >= 0) {
            this.method3034(var3);
        }
    }

    @ObfuscatedName("el.y([BB)[B")
    public static final byte[] method2813(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2414();
        int var3 = var1.method2430();
        if (var3 < 0 || !(field2496 == 0 || var3 <= field2496)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2425(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2430();
            if (var5 < 0 || field2496 != 0 && var5 > field2496) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2371(var6, var5, arg0, var3, 9);
            } else {
                field2502.method2352(var1, var6);
            }
            return var6;
        }
    }
}
