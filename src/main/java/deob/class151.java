package deob;

@ObfuscatedName("em")
public abstract class class151 {

    @ObfuscatedName("em.v")
    public int field2473;

    @ObfuscatedName("em.t")
    public int[] field2467;

    @ObfuscatedName("em.f")
    public int[] field2468;

    @ObfuscatedName("em.j")
    public class175 field2484;

    @ObfuscatedName("em.l")
    public int[] field2470;

    @ObfuscatedName("em.g")
    public int[] field2480;

    @ObfuscatedName("em.k")
    public int[] field2472;

    @ObfuscatedName("em.p")
    public int[][] field2479;

    @ObfuscatedName("em.y")
    public int[][] field2474;

    @ObfuscatedName("em.m")
    public class175[] field2483;

    @ObfuscatedName("em.o")
    public Object[] field2476;

    @ObfuscatedName("em.c")
    public Object[][] field2477;

    @ObfuscatedName("em.r")
    public static class107 field2478 = new class107();

    @ObfuscatedName("em.s")
    public int field2466;

    @ObfuscatedName("em.n")
    public boolean field2475;

    @ObfuscatedName("em.q")
    public boolean field2469;

    @ObfuscatedName("em.e")
    public static int field2481 = 0;

    public class151(boolean arg0, boolean arg1) {
        this.field2475 = arg0;
        this.field2469 = arg1;
    }

    @ObfuscatedName("em.v([BI)V")
    public void method2782(byte[] arg0) {
        this.field2466 = class110.method1417(arg0, arg0.length);
        class110 var2 = new class110(method148(arg0));
        int var3 = var2.method2257();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2297();
        }
        int var4 = var2.method2257();
        if (var3 >= 7) {
            this.field2473 = var2.method2175();
        } else {
            this.field2473 = var2.method2194();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2467 = new int[this.field2473];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2473; var7++) {
                this.field2467[var7] = var5 += var2.method2175();
                if (this.field2467[var7] > var6) {
                    var6 = this.field2467[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2473; var8++) {
                this.field2467[var8] = var5 += var2.method2194();
                if (this.field2467[var8] > var6) {
                    var6 = this.field2467[var8];
                }
            }
        }
        this.field2470 = new int[var6 + 1];
        this.field2480 = new int[var6 + 1];
        this.field2472 = new int[var6 + 1];
        this.field2479 = new int[var6 + 1][];
        this.field2476 = new Object[var6 + 1];
        this.field2477 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2468 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2473; var9++) {
                this.field2468[this.field2467[var9]] = var2.method2297();
            }
            this.field2484 = new class175(this.field2468);
        }
        for (int var10 = 0; var10 < this.field2473; var10++) {
            this.field2470[this.field2467[var10]] = var2.method2297();
        }
        for (int var11 = 0; var11 < this.field2473; var11++) {
            this.field2480[this.field2467[var11]] = var2.method2297();
        }
        for (int var12 = 0; var12 < this.field2473; var12++) {
            this.field2472[this.field2467[var12]] = var2.method2194();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2473; var13++) {
                int var14 = this.field2467[var13];
                int var15 = this.field2472[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2479[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2479[var14][var18] = var16 += var2.method2175();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2477[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2473; var20++) {
                int var21 = this.field2467[var20];
                int var22 = this.field2472[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2479[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2479[var21][var25] = var23 += var2.method2194();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2477[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2474 = new int[var6 + 1][];
        this.field2483 = new class175[var6 + 1];
        for (int var27 = 0; var27 < this.field2473; var27++) {
            int var28 = this.field2467[var27];
            int var29 = this.field2472[var28];
            this.field2474[var28] = new int[this.field2477[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2474[var28][this.field2479[var28][var30]] = var2.method2297();
            }
            this.field2483[var28] = new class175(this.field2474[var28]);
        }
    }

    @ObfuscatedName("em.t(II)V")
    public void method2783(int arg0) {
    }

    @ObfuscatedName("em.f(III)[B")
    public byte[] method2852(int arg0, int arg1) {
        return this.method2861(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("em.j(II[II)[B")
    public byte[] method2861(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2477.length || this.field2477[arg0] == null || arg1 < 0 || arg1 >= this.field2477[arg0].length) {
            return null;
        }
        if (this.field2477[arg0][arg1] == null) {
            boolean var4 = this.method2798(arg0, arg2);
            if (!var4) {
                this.method2784(arg0);
                boolean var5 = this.method2798(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class116.method2103(this.field2477[arg0][arg1], false);
        if (this.field2469) {
            this.field2477[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("em.l(IIB)Z")
    public boolean method2786(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2477.length || this.field2477[arg0] == null || arg1 < 0 || arg1 >= this.field2477[arg0].length) {
            return false;
        } else if (this.field2477[arg0][arg1] != null) {
            return true;
        } else if (this.field2476[arg0] == null) {
            this.method2784(arg0);
            return this.field2476[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("em.g(II)Z")
    public boolean method2787(int arg0) {
        if (this.field2476[arg0] == null) {
            this.method2784(arg0);
            return this.field2476[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("em.k(I)Z")
    public boolean method2834() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2467.length; var2++) {
            int var3 = this.field2467[var2];
            if (this.field2476[var3] == null) {
                this.method2784(var3);
                if (this.field2476[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("em.p(IB)[B")
    public byte[] method2797(int arg0) {
        if (this.field2477.length == 1) {
            return this.method2852(0, arg0);
        } else if (this.field2477[arg0].length == 1) {
            return this.method2852(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("em.y(IIB)[B")
    public byte[] method2790(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2477.length || this.field2477[arg0] == null || arg1 < 0 || arg1 >= this.field2477[arg0].length) {
            return null;
        }
        if (this.field2477[arg0][arg1] == null) {
            boolean var3 = this.method2798(arg0, (int[]) null);
            if (!var3) {
                this.method2784(arg0);
                boolean var4 = this.method2798(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class116.method2103(this.field2477[arg0][arg1], false);
    }

    @ObfuscatedName("em.m(IB)[B")
    public byte[] method2791(int arg0) {
        if (this.field2477.length == 1) {
            return this.method2790(0, arg0);
        } else if (this.field2477[arg0].length == 1) {
            return this.method2790(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("em.o(II)V")
    public void method2784(int arg0) {
    }

    @ObfuscatedName("em.c(IB)[I")
    public int[] method2793(int arg0) {
        return this.field2479[arg0];
    }

    @ObfuscatedName("em.r(IB)I")
    public int method2794(int arg0) {
        return this.field2477[arg0].length;
    }

    @ObfuscatedName("em.s(I)I")
    public int method2795() {
        return this.field2477.length;
    }

    @ObfuscatedName("em.n(IS)V")
    public void method2796(int arg0) {
        for (int var2 = 0; var2 < this.field2477[arg0].length; var2++) {
            this.field2477[arg0][var2] = null;
        }
    }

    @ObfuscatedName("em.q(B)V")
    public void method2822() {
        for (int var1 = 0; var1 < this.field2477.length; var1++) {
            if (this.field2477[var1] != null) {
                for (int var2 = 0; var2 < this.field2477[var1].length; var2++) {
                    this.field2477[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("em.e(I[II)Z")
    public boolean method2798(int arg0, int[] arg1) {
        if (this.field2476[arg0] == null) {
            return false;
        }
        int var3 = this.field2472[arg0];
        int[] var4 = this.field2479[arg0];
        Object[] var5 = this.field2477[arg0];
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
            var8 = class116.method2103(this.field2476[arg0], true);
            class110 var9 = new class110(var8);
            var9.method2205(arg1, 5, var9.field1853.length);
        } else {
            var8 = class116.method2103(this.field2476[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method148(var8);
        } catch (RuntimeException var27) {
            throw class139.method2746(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class110.method1417(var8, var8.length) + "," + class110.method1417(var8, var8.length - 2) + "," + this.field2470[arg0] + "," + this.field2466);
        }
        if (this.field2475) {
            this.field2476[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class110 var15 = new class110(var10);
            int[] var16 = new int[var3];
            var15.field1847 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2297();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1847 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2297();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2469) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class116.method689(var20[var26], false);
                }
            }
        } else if (this.field2469) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class116.method689(var10, false);
        }
        return true;
    }

    @ObfuscatedName("em.d(Ljava/lang/String;I)I")
    public int method2799(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2484.method3222(class213.method3461(var2));
    }

    @ObfuscatedName("em.b(ILjava/lang/String;I)I")
    public int method2841(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2483[arg0].method3222(class213.method3461(var3));
    }

    @ObfuscatedName("em.a(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2801(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2484.method3222(class213.method3461(var3));
        int var6 = this.field2483[var5].method3222(class213.method3461(var4));
        return this.method2852(var5, var6);
    }

    @ObfuscatedName("em.i(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2802(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2484.method3222(class213.method3461(var3));
        int var6 = this.field2483[var5].method3222(class213.method3461(var4));
        return this.method2786(var5, var6);
    }

    @ObfuscatedName("em.w(Ljava/lang/String;B)Z")
    public boolean method2792(String arg0) {
        int var2 = this.method2799("");
        return var2 == -1 ? this.method2802(arg0, "") : this.method2802("", arg0);
    }

    @ObfuscatedName("em.x(Ljava/lang/String;B)V")
    public void method2811(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2484.method3222(class213.method3461(var2));
        if (var3 >= 0) {
            this.method2783(var3);
        }
    }

    @ObfuscatedName("n.h([BI)[B")
    public static final byte[] method148(byte[] arg0) {
        class110 var1 = new class110(arg0);
        int var2 = var1.method2257();
        int var3 = var1.method2297();
        if (var3 < 0 || !(field2481 == 0 || var3 <= field2481)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2172(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2297();
            if (var5 < 0 || field2481 != 0 && var5 > field2481) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class108.method2107(var6, var5, arg0, var3, 9);
            } else {
                field2478.method2104(var1, var6);
            }
            return var6;
        }
    }
}
