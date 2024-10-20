package deob;

@ObfuscatedName("fx")
public abstract class class167 {

    @ObfuscatedName("fx.f")
    public int field2664;

    @ObfuscatedName("fx.s")
    public int[] field2662;

    @ObfuscatedName("fx.q")
    public int[] field2654;

    @ObfuscatedName("fx.g")
    public class192 field2653;

    @ObfuscatedName("fx.m")
    public int[] field2656;

    @ObfuscatedName("fx.t")
    public int[] field2652;

    @ObfuscatedName("fx.j")
    public int[] field2658;

    @ObfuscatedName("fx.n")
    public int[][] field2666;

    @ObfuscatedName("fx.l")
    public int[][] field2660;

    @ObfuscatedName("fx.i")
    public class192[] field2661;

    @ObfuscatedName("fx.w")
    public Object[] field2655;

    @ObfuscatedName("fx.v")
    public Object[][] field2663;

    @ObfuscatedName("fx.o")
    public static class116 field2659 = new class116();

    @ObfuscatedName("fx.p")
    public int field2665;

    @ObfuscatedName("fx.b")
    public boolean field2657;

    @ObfuscatedName("fx.z")
    public boolean field2667;

    @ObfuscatedName("fx.k")
    public static int field2668 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2657 = arg0;
        this.field2667 = arg1;
    }

    @ObfuscatedName("fx.f([BI)V")
    public void method3036(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class119.method817(arg0, 0, var2);
        this.field2665 = var3;
        class119 var4 = new class119(method2156(arg0));
        int var5 = var4.method2363();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2368();
        }
        int var6 = var4.method2363();
        if (var5 >= 7) {
            this.field2664 = var4.method2377();
        } else {
            this.field2664 = var4.method2353();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2662 = new int[this.field2664];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2664; var9++) {
                this.field2662[var9] = var7 += var4.method2377();
                if (this.field2662[var9] > var8) {
                    var8 = this.field2662[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2664; var10++) {
                this.field2662[var10] = var7 += var4.method2353();
                if (this.field2662[var10] > var8) {
                    var8 = this.field2662[var10];
                }
            }
        }
        this.field2656 = new int[var8 + 1];
        this.field2652 = new int[var8 + 1];
        this.field2658 = new int[var8 + 1];
        this.field2666 = new int[var8 + 1][];
        this.field2655 = new Object[var8 + 1];
        this.field2663 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2654 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2664; var11++) {
                this.field2654[this.field2662[var11]] = var4.method2368();
            }
            this.field2653 = new class192(this.field2654);
        }
        for (int var12 = 0; var12 < this.field2664; var12++) {
            this.field2656[this.field2662[var12]] = var4.method2368();
        }
        for (int var13 = 0; var13 < this.field2664; var13++) {
            this.field2652[this.field2662[var13]] = var4.method2368();
        }
        for (int var14 = 0; var14 < this.field2664; var14++) {
            this.field2658[this.field2662[var14]] = var4.method2353();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2664; var15++) {
                int var16 = this.field2662[var15];
                int var17 = this.field2658[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2666[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2666[var16][var20] = var18 += var4.method2377();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2663[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2664; var22++) {
                int var23 = this.field2662[var22];
                int var24 = this.field2658[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2666[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2666[var23][var27] = var25 += var4.method2353();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2663[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2660 = new int[var8 + 1][];
        this.field2661 = new class192[var8 + 1];
        for (int var29 = 0; var29 < this.field2664; var29++) {
            int var30 = this.field2662[var29];
            int var31 = this.field2658[var30];
            this.field2660[var30] = new int[this.field2663[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2660[var30][this.field2666[var30][var32]] = var4.method2368();
            }
            this.field2661[var30] = new class192(this.field2660[var30]);
        }
    }

    @ObfuscatedName("fx.s(IB)V")
    public void method3037(int arg0) {
    }

    @ObfuscatedName("fx.q(III)[B")
    public byte[] method3038(int arg0, int arg1) {
        return this.method3104(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fx.g(II[II)[B")
    public byte[] method3104(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2663.length || this.field2663[arg0] == null || arg1 < 0 || arg1 >= this.field2663[arg0].length) {
            return null;
        }
        if (this.field2663[arg0][arg1] == null) {
            boolean var4 = this.method3053(arg0, arg2);
            if (!var4) {
                this.method3098(arg0);
                boolean var5 = this.method3053(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method832(this.field2663[arg0][arg1], false);
        if (this.field2667) {
            this.field2663[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fx.m(IIB)Z")
    public boolean method3061(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2663.length || this.field2663[arg0] == null || arg1 < 0 || arg1 >= this.field2663[arg0].length) {
            return false;
        } else if (this.field2663[arg0][arg1] != null) {
            return true;
        } else if (this.field2655[arg0] == null) {
            this.method3098(arg0);
            return this.field2655[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fx.t(IB)Z")
    public boolean method3041(int arg0) {
        if (this.field2655[arg0] == null) {
            this.method3098(arg0);
            return this.field2655[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fx.j(I)Z")
    public boolean method3042() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2662.length; var2++) {
            int var3 = this.field2662[var2];
            if (this.field2655[var3] == null) {
                this.method3098(var3);
                if (this.field2655[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fx.n(II)[B")
    public byte[] method3043(int arg0) {
        if (this.field2663.length == 1) {
            return this.method3038(0, arg0);
        } else if (this.field2663[arg0].length == 1) {
            return this.method3038(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fx.l(IIB)[B")
    public byte[] method3044(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2663.length || this.field2663[arg0] == null || arg1 < 0 || arg1 >= this.field2663[arg0].length) {
            return null;
        }
        if (this.field2663[arg0][arg1] == null) {
            boolean var3 = this.method3053(arg0, (int[]) null);
            if (!var3) {
                this.method3098(arg0);
                boolean var4 = this.method3053(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method832(this.field2663[arg0][arg1], false);
    }

    @ObfuscatedName("fx.i(IB)[B")
    public byte[] method3045(int arg0) {
        if (this.field2663.length == 1) {
            return this.method3044(0, arg0);
        } else if (this.field2663[arg0].length == 1) {
            return this.method3044(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fx.w(II)V")
    public void method3098(int arg0) {
    }

    @ObfuscatedName("fx.v(II)[I")
    public int[] method3046(int arg0) {
        return this.field2666[arg0];
    }

    @ObfuscatedName("fx.o(II)I")
    public int method3047(int arg0) {
        return this.field2663[arg0].length;
    }

    @ObfuscatedName("fx.p(I)I")
    public int method3119() {
        return this.field2663.length;
    }

    @ObfuscatedName("fx.b(II)V")
    public void method3055(int arg0) {
        for (int var2 = 0; var2 < this.field2663[arg0].length; var2++) {
            this.field2663[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fx.z(I)V")
    public void method3049() {
        for (int var1 = 0; var1 < this.field2663.length; var1++) {
            if (this.field2663[var1] != null) {
                for (int var2 = 0; var2 < this.field2663[var1].length; var2++) {
                    this.field2663[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fx.k(I[IB)Z")
    public boolean method3053(int arg0, int[] arg1) {
        if (this.field2655[arg0] == null) {
            return false;
        }
        int var3 = this.field2658[arg0];
        int[] var4 = this.field2666[arg0];
        Object[] var5 = this.field2663[arg0];
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
            var8 = class125.method832(this.field2655[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2382(arg1, 5, var9.field2000.length);
        } else {
            var8 = class125.method832(this.field2655[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2156(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class119.method817(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class119.method817(var8, 0, var18);
            throw class148.method2285(var35, var17 + var19 + "," + this.field2656[arg0] + "," + this.field2665);
        }
        if (this.field2657) {
            this.field2655[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class119 var23 = new class119(var10);
            int[] var24 = new int[var3];
            var23.field1994 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2368();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1994 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2368();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2667) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class125.method739(var28[var34], false);
                }
            }
        } else if (this.field2667) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method739(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fx.r(Ljava/lang/String;B)I")
    public int method3052(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2653.method3493(Statics.method2822(var2));
    }

    @ObfuscatedName("fx.d(ILjava/lang/String;B)I")
    public int method3048(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2661[arg0].method3493(Statics.method2822(var3));
    }

    @ObfuscatedName("fx.u(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3054(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2653.method3493(Statics.method2822(var3));
        int var6 = this.field2661[var5].method3493(Statics.method2822(var4));
        return this.method3038(var5, var6);
    }

    @ObfuscatedName("fx.a(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3116(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2653.method3493(Statics.method2822(var3));
        int var6 = this.field2661[var5].method3493(Statics.method2822(var4));
        return this.method3061(var5, var6);
    }

    @ObfuscatedName("fx.x(Ljava/lang/String;B)Z")
    public boolean method3056(String arg0) {
        int var2 = this.method3052("");
        return var2 == -1 ? this.method3116(arg0, "") : this.method3116("", arg0);
    }

    @ObfuscatedName("fx.y(Ljava/lang/String;I)V")
    public void method3057(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2653.method3493(Statics.method2822(var2));
        if (var3 >= 0) {
            this.method3037(var3);
        }
    }

    @ObfuscatedName("cz.c([BI)[B")
    public static final byte[] method2156(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2363();
        int var3 = var1.method2368();
        if (var3 < 0 || !(field2668 == 0 || var3 <= field2668)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2477(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2368();
            if (var5 < 0 || field2668 != 0 && var5 > field2668) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2311(var6, var5, arg0, var3, 9);
            } else {
                field2659.method2306(var1, var6);
            }
            return var6;
        }
    }
}
