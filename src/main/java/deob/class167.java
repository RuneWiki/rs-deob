package deob;

@ObfuscatedName("fa")
public abstract class class167 {

    @ObfuscatedName("fa.j")
    public int field2668;

    @ObfuscatedName("fa.m")
    public int[] field2656;

    @ObfuscatedName("fa.f")
    public int[] field2657;

    @ObfuscatedName("fa.l")
    public class192 field2658;

    @ObfuscatedName("fa.u")
    public int[] field2659;

    @ObfuscatedName("fa.a")
    public int[] field2660;

    @ObfuscatedName("fa.h")
    public int[] field2661;

    @ObfuscatedName("fa.i")
    public int[][] field2667;

    @ObfuscatedName("fa.t")
    public int[][] field2663;

    @ObfuscatedName("fa.k")
    public class192[] field2664;

    @ObfuscatedName("fa.s")
    public Object[] field2671;

    @ObfuscatedName("fa.w")
    public Object[][] field2665;

    @ObfuscatedName("fa.e")
    public static class116 field2666 = new class116();

    @ObfuscatedName("fa.z")
    public int field2662;

    @ObfuscatedName("fa.p")
    public boolean field2669;

    @ObfuscatedName("fa.r")
    public boolean field2670;

    @ObfuscatedName("fa.g")
    public static int field2655 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2669 = arg0;
        this.field2670 = arg1;
    }

    @ObfuscatedName("fa.j([BI)V")
    public void method3132(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class119.method135(arg0, 0, var2);
        this.field2662 = var3;
        class119 var4 = new class119(method669(arg0));
        int var5 = var4.method2372();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2377();
        }
        int var6 = var4.method2372();
        if (var5 >= 7) {
            this.field2668 = var4.method2429();
        } else {
            this.field2668 = var4.method2374();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2656 = new int[this.field2668];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2668; var9++) {
                this.field2656[var9] = var7 += var4.method2429();
                if (this.field2656[var9] > var8) {
                    var8 = this.field2656[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2668; var10++) {
                this.field2656[var10] = var7 += var4.method2374();
                if (this.field2656[var10] > var8) {
                    var8 = this.field2656[var10];
                }
            }
        }
        this.field2659 = new int[var8 + 1];
        this.field2660 = new int[var8 + 1];
        this.field2661 = new int[var8 + 1];
        this.field2667 = new int[var8 + 1][];
        this.field2671 = new Object[var8 + 1];
        this.field2665 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2657 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2668; var11++) {
                this.field2657[this.field2656[var11]] = var4.method2377();
            }
            this.field2658 = new class192(this.field2657);
        }
        for (int var12 = 0; var12 < this.field2668; var12++) {
            this.field2659[this.field2656[var12]] = var4.method2377();
        }
        for (int var13 = 0; var13 < this.field2668; var13++) {
            this.field2660[this.field2656[var13]] = var4.method2377();
        }
        for (int var14 = 0; var14 < this.field2668; var14++) {
            this.field2661[this.field2656[var14]] = var4.method2374();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2668; var15++) {
                int var16 = this.field2656[var15];
                int var17 = this.field2661[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2667[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2667[var16][var20] = var18 += var4.method2429();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2665[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2668; var22++) {
                int var23 = this.field2656[var22];
                int var24 = this.field2661[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2667[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2667[var23][var27] = var25 += var4.method2374();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2665[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2663 = new int[var8 + 1][];
        this.field2664 = new class192[var8 + 1];
        for (int var29 = 0; var29 < this.field2668; var29++) {
            int var30 = this.field2656[var29];
            int var31 = this.field2661[var30];
            this.field2663[var30] = new int[this.field2665[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2663[var30][this.field2667[var30][var32]] = var4.method2377();
            }
            this.field2664[var30] = new class192(this.field2663[var30]);
        }
    }

    @ObfuscatedName("fa.m(II)V")
    public void method3104(int arg0) {
    }

    @ObfuscatedName("fa.f(IIB)[B")
    public byte[] method3124(int arg0, int arg1) {
        return this.method3109(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fa.l(II[II)[B")
    public byte[] method3109(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2665.length || this.field2665[arg0] == null || arg1 < 0 || arg1 >= this.field2665[arg0].length) {
            return null;
        }
        if (this.field2665[arg0][arg1] == null) {
            boolean var4 = this.method3098(arg0, arg2);
            if (!var4) {
                this.method3092(arg0);
                boolean var5 = this.method3098(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method115(this.field2665[arg0][arg1], false);
        if (this.field2670) {
            this.field2665[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fa.u(III)Z")
    public boolean method3086(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2665.length || this.field2665[arg0] == null || arg1 < 0 || arg1 >= this.field2665[arg0].length) {
            return false;
        } else if (this.field2665[arg0][arg1] != null) {
            return true;
        } else if (this.field2671[arg0] == null) {
            this.method3092(arg0);
            return this.field2671[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fa.a(II)Z")
    public boolean method3087(int arg0) {
        if (this.field2671[arg0] == null) {
            this.method3092(arg0);
            return this.field2671[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fa.h(I)Z")
    public boolean method3088() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2656.length; var2++) {
            int var3 = this.field2656[var2];
            if (this.field2671[var3] == null) {
                this.method3092(var3);
                if (this.field2671[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fa.i(IB)[B")
    public byte[] method3110(int arg0) {
        if (this.field2665.length == 1) {
            return this.method3124(0, arg0);
        } else if (this.field2665[arg0].length == 1) {
            return this.method3124(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fa.t(IIB)[B")
    public byte[] method3090(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2665.length || this.field2665[arg0] == null || arg1 < 0 || arg1 >= this.field2665[arg0].length) {
            return null;
        }
        if (this.field2665[arg0][arg1] == null) {
            boolean var3 = this.method3098(arg0, (int[]) null);
            if (!var3) {
                this.method3092(arg0);
                boolean var4 = this.method3098(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method115(this.field2665[arg0][arg1], false);
    }

    @ObfuscatedName("fa.k(II)[B")
    public byte[] method3091(int arg0) {
        if (this.field2665.length == 1) {
            return this.method3090(0, arg0);
        } else if (this.field2665[arg0].length == 1) {
            return this.method3090(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fa.s(II)V")
    public void method3092(int arg0) {
    }

    @ObfuscatedName("fa.w(II)[I")
    public int[] method3093(int arg0) {
        return this.field2667[arg0];
    }

    @ObfuscatedName("fa.e(II)I")
    public int method3094(int arg0) {
        return this.field2665[arg0].length;
    }

    @ObfuscatedName("fa.z(I)I")
    public int method3133() {
        return this.field2665.length;
    }

    @ObfuscatedName("fa.p(II)V")
    public void method3096(int arg0) {
        for (int var2 = 0; var2 < this.field2665[arg0].length; var2++) {
            this.field2665[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fa.r(B)V")
    public void method3097() {
        for (int var1 = 0; var1 < this.field2665.length; var1++) {
            if (this.field2665[var1] != null) {
                for (int var2 = 0; var2 < this.field2665[var1].length; var2++) {
                    this.field2665[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fa.g(I[IB)Z")
    public boolean method3098(int arg0, int[] arg1) {
        if (this.field2671[arg0] == null) {
            return false;
        }
        int var3 = this.field2661[arg0];
        int[] var4 = this.field2667[arg0];
        Object[] var5 = this.field2665[arg0];
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
            var8 = class125.method115(this.field2671[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2390(arg1, 5, var9.field1981.length);
        } else {
            var8 = class125.method115(this.field2671[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method669(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class119.method135(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class119.method135(var8, 0, var18);
            throw class148.method945(var35, var17 + var19 + "," + this.field2659[arg0] + "," + this.field2662);
        }
        if (this.field2669) {
            this.field2671[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class119 var23 = new class119(var10);
            int[] var24 = new int[var3];
            var23.field1982 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2377();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1982 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2377();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2670) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class125.method924(var28[var34], false);
                }
            }
        } else if (this.field2670) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method924(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fa.n(Ljava/lang/String;B)I")
    public int method3099(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2658.method3537(class163.method910(var2));
    }

    @ObfuscatedName("fa.y(ILjava/lang/String;B)I")
    public int method3095(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2664[arg0].method3537(class163.method910(var3));
    }

    @ObfuscatedName("fa.v(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3101(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2658.method3537(class163.method910(var3));
        int var6 = this.field2664[var5].method3537(class163.method910(var4));
        return this.method3124(var5, var6);
    }

    @ObfuscatedName("fa.q(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3102(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2658.method3537(class163.method910(var3));
        int var6 = this.field2664[var5].method3537(class163.method910(var4));
        return this.method3086(var5, var6);
    }

    @ObfuscatedName("fa.x(Ljava/lang/String;B)Z")
    public boolean method3103(String arg0) {
        int var2 = this.method3099("");
        return var2 == -1 ? this.method3102(arg0, "") : this.method3102("", arg0);
    }

    @ObfuscatedName("fa.d(Ljava/lang/String;I)V")
    public void method3166(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2658.method3537(class163.method910(var2));
        if (var3 >= 0) {
            this.method3104(var3);
        }
    }

    @ObfuscatedName("aa.o([BI)[B")
    public static final byte[] method669(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2372();
        int var3 = var1.method2377();
        if (var3 < 0 || !(field2655 == 0 || var3 <= field2655)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2382(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2377();
            if (var5 < 0 || field2655 != 0 && var5 > field2655) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2314(var6, var5, arg0, var3, 9);
            } else {
                field2666.method2305(var1, var6);
            }
            return var6;
        }
    }
}
