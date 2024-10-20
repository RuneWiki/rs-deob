package deob;

@ObfuscatedName("fn")
public abstract class class167 {

    @ObfuscatedName("fn.d")
    public int field2658;

    @ObfuscatedName("fn.p")
    public int[] field2652;

    @ObfuscatedName("fn.v")
    public int[] field2645;

    @ObfuscatedName("fn.l")
    public class192 field2646;

    @ObfuscatedName("fn.y")
    public int[] field2647;

    @ObfuscatedName("fn.w")
    public int[] field2656;

    @ObfuscatedName("fn.u")
    public int[] field2651;

    @ObfuscatedName("fn.a")
    public int[][] field2650;

    @ObfuscatedName("fn.e")
    public int[][] field2655;

    @ObfuscatedName("fn.b")
    public class192[] field2643;

    @ObfuscatedName("fn.o")
    public Object[] field2653;

    @ObfuscatedName("fn.m")
    public Object[][] field2654;

    @ObfuscatedName("fn.x")
    public static class116 field2648 = new class116();

    @ObfuscatedName("fn.k")
    public int field2644;

    @ObfuscatedName("fn.n")
    public boolean field2657;

    @ObfuscatedName("fn.j")
    public boolean field2649;

    @ObfuscatedName("fn.t")
    public static int field2659 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2657 = arg0;
        this.field2649 = arg1;
    }

    @ObfuscatedName("fn.d([BI)V")
    public void method3093(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = Statics.method2233(arg0, 0, var2);
        this.field2644 = var3;
        class119 var4 = new class119(method838(arg0));
        int var5 = var4.method2357();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2362();
        }
        int var6 = var4.method2357();
        if (var5 >= 7) {
            this.field2658 = var4.method2430();
        } else {
            this.field2658 = var4.method2359();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2652 = new int[this.field2658];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2658; var9++) {
                this.field2652[var9] = var7 += var4.method2430();
                if (this.field2652[var9] > var8) {
                    var8 = this.field2652[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2658; var10++) {
                this.field2652[var10] = var7 += var4.method2359();
                if (this.field2652[var10] > var8) {
                    var8 = this.field2652[var10];
                }
            }
        }
        this.field2647 = new int[var8 + 1];
        this.field2656 = new int[var8 + 1];
        this.field2651 = new int[var8 + 1];
        this.field2650 = new int[var8 + 1][];
        this.field2653 = new Object[var8 + 1];
        this.field2654 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2645 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2658; var11++) {
                this.field2645[this.field2652[var11]] = var4.method2362();
            }
            this.field2646 = new class192(this.field2645);
        }
        for (int var12 = 0; var12 < this.field2658; var12++) {
            this.field2647[this.field2652[var12]] = var4.method2362();
        }
        for (int var13 = 0; var13 < this.field2658; var13++) {
            this.field2656[this.field2652[var13]] = var4.method2362();
        }
        for (int var14 = 0; var14 < this.field2658; var14++) {
            this.field2651[this.field2652[var14]] = var4.method2359();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2658; var15++) {
                int var16 = this.field2652[var15];
                int var17 = this.field2651[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2650[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2650[var16][var20] = var18 += var4.method2430();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2654[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2658; var22++) {
                int var23 = this.field2652[var22];
                int var24 = this.field2651[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2650[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2650[var23][var27] = var25 += var4.method2359();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2654[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2655 = new int[var8 + 1][];
        this.field2643 = new class192[var8 + 1];
        for (int var29 = 0; var29 < this.field2658; var29++) {
            int var30 = this.field2652[var29];
            int var31 = this.field2651[var30];
            this.field2655[var30] = new int[this.field2654[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2655[var30][this.field2650[var30][var32]] = var4.method2362();
            }
            this.field2643[var30] = new class192(this.field2655[var30]);
        }
    }

    @ObfuscatedName("fn.p(IB)V")
    public void method3090(int arg0) {
    }

    @ObfuscatedName("fn.v(III)[B")
    public byte[] method3134(int arg0, int arg1) {
        return this.method3092(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fn.l(II[II)[B")
    public byte[] method3092(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2654.length || this.field2654[arg0] == null || arg1 < 0 || arg1 >= this.field2654[arg0].length) {
            return null;
        }
        if (this.field2654[arg0][arg1] == null) {
            boolean var4 = this.method3105(arg0, arg2);
            if (!var4) {
                this.method3099(arg0);
                boolean var5 = this.method3105(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method624(this.field2654[arg0][arg1], false);
        if (this.field2649) {
            this.field2654[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fn.y(IIB)Z")
    public boolean method3113(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2654.length || this.field2654[arg0] == null || arg1 < 0 || arg1 >= this.field2654[arg0].length) {
            return false;
        } else if (this.field2654[arg0][arg1] != null) {
            return true;
        } else if (this.field2653[arg0] == null) {
            this.method3099(arg0);
            return this.field2653[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fn.w(II)Z")
    public boolean method3160(int arg0) {
        if (this.field2653[arg0] == null) {
            this.method3099(arg0);
            return this.field2653[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fn.u(S)Z")
    public boolean method3095() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2652.length; var2++) {
            int var3 = this.field2652[var2];
            if (this.field2653[var3] == null) {
                this.method3099(var3);
                if (this.field2653[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fn.a(II)[B")
    public byte[] method3096(int arg0) {
        if (this.field2654.length == 1) {
            return this.method3134(0, arg0);
        } else if (this.field2654[arg0].length == 1) {
            return this.method3134(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fn.e(III)[B")
    public byte[] method3119(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2654.length || this.field2654[arg0] == null || arg1 < 0 || arg1 >= this.field2654[arg0].length) {
            return null;
        }
        if (this.field2654[arg0][arg1] == null) {
            boolean var3 = this.method3105(arg0, (int[]) null);
            if (!var3) {
                this.method3099(arg0);
                boolean var4 = this.method3105(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method624(this.field2654[arg0][arg1], false);
    }

    @ObfuscatedName("fn.b(IB)[B")
    public byte[] method3135(int arg0) {
        if (this.field2654.length == 1) {
            return this.method3119(0, arg0);
        } else if (this.field2654[arg0].length == 1) {
            return this.method3119(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fn.o(II)V")
    public void method3099(int arg0) {
    }

    @ObfuscatedName("fn.m(IB)[I")
    public int[] method3144(int arg0) {
        return this.field2650[arg0];
    }

    @ObfuscatedName("fn.x(II)I")
    public int method3101(int arg0) {
        return this.field2654[arg0].length;
    }

    @ObfuscatedName("fn.k(I)I")
    public int method3164() {
        return this.field2654.length;
    }

    @ObfuscatedName("fn.n(II)V")
    public void method3161(int arg0) {
        for (int var2 = 0; var2 < this.field2654[arg0].length; var2++) {
            this.field2654[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fn.j(B)V")
    public void method3104() {
        for (int var1 = 0; var1 < this.field2654.length; var1++) {
            if (this.field2654[var1] != null) {
                for (int var2 = 0; var2 < this.field2654[var1].length; var2++) {
                    this.field2654[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fn.t(I[II)Z")
    public boolean method3105(int arg0, int[] arg1) {
        if (this.field2653[arg0] == null) {
            return false;
        }
        int var3 = this.field2651[arg0];
        int[] var4 = this.field2650[arg0];
        Object[] var5 = this.field2654[arg0];
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
            var8 = class125.method624(this.field2653[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2376(arg1, 5, var9.field1973.length);
        } else {
            var8 = class125.method624(this.field2653[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method838(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = Statics.method2233(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = Statics.method2233(var8, 0, var18);
            throw Statics.method10(var35, var17 + var19 + "," + this.field2647[arg0] + "," + this.field2644);
        }
        if (this.field2657) {
            this.field2653[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class119 var23 = new class119(var10);
            int[] var24 = new int[var3];
            var23.field1966 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2362();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1966 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2362();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2649) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class125.method576(var28[var34], false);
                }
            }
        } else if (this.field2649) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method576(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fn.z(Ljava/lang/String;I)I")
    public int method3106(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2646.method3549(class163.method871(var2));
    }

    @ObfuscatedName("fn.h(ILjava/lang/String;I)I")
    public int method3107(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2643[arg0].method3549(class163.method871(var3));
    }

    @ObfuscatedName("fn.i(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3114(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2646.method3549(class163.method871(var3));
        int var6 = this.field2643[var5].method3549(class163.method871(var4));
        return this.method3134(var5, var6);
    }

    @ObfuscatedName("fn.q(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3109(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2646.method3549(class163.method871(var3));
        int var6 = this.field2643[var5].method3549(class163.method871(var4));
        return this.method3113(var5, var6);
    }

    @ObfuscatedName("fn.r(Ljava/lang/String;B)Z")
    public boolean method3110(String arg0) {
        int var2 = this.method3106("");
        return var2 == -1 ? this.method3109(arg0, "") : this.method3109("", arg0);
    }

    @ObfuscatedName("fn.s(Ljava/lang/String;B)V")
    public void method3111(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2646.method3549(class163.method871(var2));
        if (var3 >= 0) {
            this.method3090(var3);
        }
    }

    @ObfuscatedName("aq.g([BI)[B")
    public static final byte[] method838(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2357();
        int var3 = var1.method2362();
        if (var3 < 0 || !(field2659 == 0 || var3 <= field2659)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2400(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2362();
            if (var5 < 0 || field2659 != 0 && var5 > field2659) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2304(var6, var5, arg0, var3, 9);
            } else {
                field2648.method2298(var1, var6);
            }
            return var6;
        }
    }
}
