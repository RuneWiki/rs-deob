package deob;

@ObfuscatedName("ec")
public abstract class class146 {

    @ObfuscatedName("ec.g")
    public int field2468;

    @ObfuscatedName("ec.v")
    public int[] field2452;

    @ObfuscatedName("ec.z")
    public int[] field2463;

    @ObfuscatedName("ec.h")
    public class170 field2454;

    @ObfuscatedName("ec.k")
    public int[] field2455;

    @ObfuscatedName("ec.l")
    public int[] field2456;

    @ObfuscatedName("ec.e")
    public int[] field2451;

    @ObfuscatedName("ec.j")
    public int[][] field2462;

    @ObfuscatedName("ec.n")
    public int[][] field2464;

    @ObfuscatedName("ec.f")
    public class170[] field2460;

    @ObfuscatedName("ec.a")
    public Object[] field2461;

    @ObfuscatedName("ec.i")
    public Object[][] field2469;

    @ObfuscatedName("ec.y")
    public static class104 field2458 = new class104();

    @ObfuscatedName("ec.p")
    public int field2457;

    @ObfuscatedName("ec.q")
    public boolean field2465;

    @ObfuscatedName("ec.t")
    public boolean field2466;

    @ObfuscatedName("ec.r")
    public static int field2467 = 0;

    public class146(boolean arg0, boolean arg1) {
        this.field2465 = arg0;
        this.field2466 = arg1;
    }

    @ObfuscatedName("ec.g([BI)V")
    public void method2706(byte[] arg0) {
        this.field2457 = Statics.method914(arg0, arg0.length);
        class107 var2 = new class107(method72(arg0));
        int var3 = var2.method2139();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2144();
        }
        int var4 = var2.method2139();
        if (var3 >= 7) {
            this.field2468 = var2.method2197();
        } else {
            this.field2468 = var2.method2141();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2452 = new int[this.field2468];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2468; var7++) {
                this.field2452[var7] = var5 += var2.method2197();
                if (this.field2452[var7] > var6) {
                    var6 = this.field2452[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2468; var8++) {
                this.field2452[var8] = var5 += var2.method2141();
                if (this.field2452[var8] > var6) {
                    var6 = this.field2452[var8];
                }
            }
        }
        this.field2455 = new int[var6 + 1];
        this.field2456 = new int[var6 + 1];
        this.field2451 = new int[var6 + 1];
        this.field2462 = new int[var6 + 1][];
        this.field2461 = new Object[var6 + 1];
        this.field2469 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2463 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2468; var9++) {
                this.field2463[this.field2452[var9]] = var2.method2144();
            }
            this.field2454 = new class170(this.field2463);
        }
        for (int var10 = 0; var10 < this.field2468; var10++) {
            this.field2455[this.field2452[var10]] = var2.method2144();
        }
        for (int var11 = 0; var11 < this.field2468; var11++) {
            this.field2456[this.field2452[var11]] = var2.method2144();
        }
        for (int var12 = 0; var12 < this.field2468; var12++) {
            this.field2451[this.field2452[var12]] = var2.method2141();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2468; var13++) {
                int var14 = this.field2452[var13];
                int var15 = this.field2451[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2462[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2462[var14][var18] = var16 += var2.method2197();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2469[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2468; var20++) {
                int var21 = this.field2452[var20];
                int var22 = this.field2451[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2462[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2462[var21][var25] = var23 += var2.method2141();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2469[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2464 = new int[var6 + 1][];
        this.field2460 = new class170[var6 + 1];
        for (int var27 = 0; var27 < this.field2468; var27++) {
            int var28 = this.field2452[var27];
            int var29 = this.field2451[var28];
            this.field2464[var28] = new int[this.field2469[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2464[var28][this.field2462[var28][var30]] = var2.method2144();
            }
            this.field2460[var28] = new class170(this.field2464[var28]);
        }
    }

    @ObfuscatedName("ec.v(II)V")
    public void method2707(int arg0) {
    }

    @ObfuscatedName("ec.z(IIB)[B")
    public byte[] method2708(int arg0, int arg1) {
        return this.method2742(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ec.h(II[II)[B")
    public byte[] method2742(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2469.length || this.field2469[arg0] == null || arg1 < 0 || arg1 >= this.field2469[arg0].length) {
            return null;
        }
        if (this.field2469[arg0][arg1] == null) {
            boolean var4 = this.method2722(arg0, arg2);
            if (!var4) {
                this.method2775(arg0);
                boolean var5 = this.method2722(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method1803(this.field2469[arg0][arg1], false);
        if (this.field2466) {
            this.field2469[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ec.k(III)Z")
    public boolean method2710(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2469.length || this.field2469[arg0] == null || arg1 < 0 || arg1 >= this.field2469[arg0].length) {
            return false;
        } else if (this.field2469[arg0][arg1] != null) {
            return true;
        } else if (this.field2461[arg0] == null) {
            this.method2775(arg0);
            return this.field2461[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ec.l(IB)Z")
    public boolean method2705(int arg0) {
        if (this.field2461[arg0] == null) {
            this.method2775(arg0);
            return this.field2461[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ec.e(B)Z")
    public boolean method2723() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2452.length; var2++) {
            int var3 = this.field2452[var2];
            if (this.field2461[var3] == null) {
                this.method2775(var3);
                if (this.field2461[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ec.j(II)[B")
    public byte[] method2713(int arg0) {
        if (this.field2469.length == 1) {
            return this.method2708(0, arg0);
        } else if (this.field2469[arg0].length == 1) {
            return this.method2708(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ec.n(III)[B")
    public byte[] method2714(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2469.length || this.field2469[arg0] == null || arg1 < 0 || arg1 >= this.field2469[arg0].length) {
            return null;
        }
        if (this.field2469[arg0][arg1] == null) {
            boolean var3 = this.method2722(arg0, (int[]) null);
            if (!var3) {
                this.method2775(arg0);
                boolean var4 = this.method2722(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method1803(this.field2469[arg0][arg1], false);
    }

    @ObfuscatedName("ec.f(II)[B")
    public byte[] method2716(int arg0) {
        if (this.field2469.length == 1) {
            return this.method2714(0, arg0);
        } else if (this.field2469[arg0].length == 1) {
            return this.method2714(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ec.a(II)V")
    public void method2775(int arg0) {
    }

    @ObfuscatedName("ec.i(II)[I")
    public int[] method2717(int arg0) {
        return this.field2462[arg0];
    }

    @ObfuscatedName("ec.y(IB)I")
    public int method2718(int arg0) {
        return this.field2469[arg0].length;
    }

    @ObfuscatedName("ec.p(I)I")
    public int method2719() {
        return this.field2469.length;
    }

    @ObfuscatedName("ec.q(IB)V")
    public void method2730(int arg0) {
        for (int var2 = 0; var2 < this.field2469[arg0].length; var2++) {
            this.field2469[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ec.t(I)V")
    public void method2721() {
        for (int var1 = 0; var1 < this.field2469.length; var1++) {
            if (this.field2469[var1] != null) {
                for (int var2 = 0; var2 < this.field2469[var1].length; var2++) {
                    this.field2469[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ec.r(I[II)Z")
    public boolean method2722(int arg0, int[] arg1) {
        if (this.field2461[arg0] == null) {
            return false;
        }
        int var3 = this.field2451[arg0];
        int[] var4 = this.field2462[arg0];
        Object[] var5 = this.field2469[arg0];
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
            var8 = class112.method1803(this.field2461[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2156(arg1, 5, var9.field1840.length);
        } else {
            var8 = class112.method1803(this.field2461[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method72(var8);
        } catch (RuntimeException var27) {
            throw class135.method843(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + Statics.method914(var8, var8.length) + "," + Statics.method914(var8, var8.length - 2) + "," + this.field2455[arg0] + "," + this.field2457);
        }
        if (this.field2465) {
            this.field2461[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class107 var15 = new class107(var10);
            int[] var16 = new int[var3];
            var15.field1839 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2144();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1839 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2144();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2466) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class112.method132(var20[var26], false);
                }
            }
        } else if (this.field2466) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method132(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ec.x(Ljava/lang/String;I)I")
    public int method2709(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2454.method3164(class199.method2547(var2));
    }

    @ObfuscatedName("ec.s(ILjava/lang/String;B)I")
    public int method2724(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2460[arg0].method3164(class199.method2547(var3));
    }

    @ObfuscatedName("ec.d(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2725(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2454.method3164(class199.method2547(var3));
        int var6 = this.field2460[var5].method3164(class199.method2547(var4));
        return this.method2708(var5, var6);
    }

    @ObfuscatedName("ec.m(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2726(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2454.method3164(class199.method2547(var3));
        int var6 = this.field2460[var5].method3164(class199.method2547(var4));
        return this.method2710(var5, var6);
    }

    @ObfuscatedName("ec.o(Ljava/lang/String;I)Z")
    public boolean method2727(String arg0) {
        int var2 = this.method2709("");
        return var2 == -1 ? this.method2726(arg0, "") : this.method2726("", arg0);
    }

    @ObfuscatedName("ec.b(Ljava/lang/String;I)V")
    public void method2728(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2454.method3164(class199.method2547(var2));
        if (var3 >= 0) {
            this.method2707(var3);
        }
    }

    @ObfuscatedName("l.c([BB)[B")
    public static final byte[] method72(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2139();
        int var3 = var1.method2144();
        if (var3 < 0 || !(field2467 == 0 || var3 <= field2467)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2150(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2144();
            if (var5 < 0 || field2467 != 0 && var5 > field2467) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2091(var6, var5, arg0, var3, 9);
            } else {
                field2458.method2085(var1, var6);
            }
            return var6;
        }
    }
}
