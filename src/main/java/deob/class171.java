package deob;

@ObfuscatedName("fo")
public abstract class class171 {

    @ObfuscatedName("fo.k")
    public int field2730;

    @ObfuscatedName("fo.q")
    public int[] field2722;

    @ObfuscatedName("fo.f")
    public int[] field2718;

    @ObfuscatedName("fo.c")
    public class196 field2720;

    @ObfuscatedName("fo.v")
    public int[] field2721;

    @ObfuscatedName("fo.j")
    public int[] field2723;

    @ObfuscatedName("fo.m")
    public int[] field2717;

    @ObfuscatedName("fo.y")
    public int[][] field2724;

    @ObfuscatedName("fo.u")
    public int[][] field2725;

    @ObfuscatedName("fo.h")
    public class196[] field2726;

    @ObfuscatedName("fo.l")
    public Object[] field2727;

    @ObfuscatedName("fo.b")
    public Object[][] field2731;

    @ObfuscatedName("fo.g")
    public static class120 field2729 = new class120();

    @ObfuscatedName("fo.e")
    public int field2719;

    @ObfuscatedName("fo.p")
    public boolean field2728;

    @ObfuscatedName("fo.s")
    public boolean field2732;

    @ObfuscatedName("fo.w")
    public static int field2733 = 0;

    public class171(boolean arg0, boolean arg1) {
        this.field2728 = arg0;
        this.field2732 = arg1;
    }

    @ObfuscatedName("fo.k([BS)V")
    public void method3070(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class123.method2689(arg0, 0, var2);
        this.field2719 = var3;
        class123 var4 = new class123(method2118(arg0));
        int var5 = var4.method2427();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2432();
        }
        int var6 = var4.method2427();
        if (var5 >= 7) {
            this.field2730 = var4.method2441();
        } else {
            this.field2730 = var4.method2547();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2722 = new int[this.field2730];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2730; var9++) {
                this.field2722[var9] = var7 += var4.method2441();
                if (this.field2722[var9] > var8) {
                    var8 = this.field2722[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2730; var10++) {
                this.field2722[var10] = var7 += var4.method2547();
                if (this.field2722[var10] > var8) {
                    var8 = this.field2722[var10];
                }
            }
        }
        this.field2721 = new int[var8 + 1];
        this.field2723 = new int[var8 + 1];
        this.field2717 = new int[var8 + 1];
        this.field2724 = new int[var8 + 1][];
        this.field2727 = new Object[var8 + 1];
        this.field2731 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2718 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2730; var11++) {
                this.field2718[this.field2722[var11]] = var4.method2432();
            }
            this.field2720 = new class196(this.field2718);
        }
        for (int var12 = 0; var12 < this.field2730; var12++) {
            this.field2721[this.field2722[var12]] = var4.method2432();
        }
        for (int var13 = 0; var13 < this.field2730; var13++) {
            this.field2723[this.field2722[var13]] = var4.method2432();
        }
        for (int var14 = 0; var14 < this.field2730; var14++) {
            this.field2717[this.field2722[var14]] = var4.method2547();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2730; var15++) {
                int var16 = this.field2722[var15];
                int var17 = this.field2717[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2724[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2724[var16][var20] = var18 += var4.method2441();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2731[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2730; var22++) {
                int var23 = this.field2722[var22];
                int var24 = this.field2717[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2724[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2724[var23][var27] = var25 += var4.method2547();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2731[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2725 = new int[var8 + 1][];
        this.field2726 = new class196[var8 + 1];
        for (int var29 = 0; var29 < this.field2730; var29++) {
            int var30 = this.field2722[var29];
            int var31 = this.field2717[var30];
            this.field2725[var30] = new int[this.field2731[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2725[var30][this.field2724[var30][var32]] = var4.method2432();
            }
            this.field2726[var30] = new class196(this.field2725[var30]);
        }
    }

    @ObfuscatedName("fo.q(II)V")
    public void method3071(int arg0) {
    }

    @ObfuscatedName("fo.f(IIB)[B")
    public byte[] method3097(int arg0, int arg1) {
        return this.method3073(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fo.c(II[II)[B")
    public byte[] method3073(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2731.length || this.field2731[arg0] == null || arg1 < 0 || arg1 >= this.field2731[arg0].length) {
            return null;
        }
        if (this.field2731[arg0][arg1] == null) {
            boolean var4 = this.method3086(arg0, arg2);
            if (!var4) {
                this.method3155(arg0);
                boolean var5 = this.method3086(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class129.method1234(this.field2731[arg0][arg1], false);
        if (this.field2732) {
            this.field2731[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fo.v(III)Z")
    public boolean method3074(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2731.length || this.field2731[arg0] == null || arg1 < 0 || arg1 >= this.field2731[arg0].length) {
            return false;
        } else if (this.field2731[arg0][arg1] != null) {
            return true;
        } else if (this.field2727[arg0] == null) {
            this.method3155(arg0);
            return this.field2727[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fo.j(IB)Z")
    public boolean method3088(int arg0) {
        if (this.field2727[arg0] == null) {
            this.method3155(arg0);
            return this.field2727[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fo.m(I)Z")
    public boolean method3076() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2722.length; var2++) {
            int var3 = this.field2722[var2];
            if (this.field2727[var3] == null) {
                this.method3155(var3);
                if (this.field2727[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fo.y(IB)[B")
    public byte[] method3102(int arg0) {
        if (this.field2731.length == 1) {
            return this.method3097(0, arg0);
        } else if (this.field2731[arg0].length == 1) {
            return this.method3097(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fo.u(IIB)[B")
    public byte[] method3078(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2731.length || this.field2731[arg0] == null || arg1 < 0 || arg1 >= this.field2731[arg0].length) {
            return null;
        }
        if (this.field2731[arg0][arg1] == null) {
            boolean var3 = this.method3086(arg0, (int[]) null);
            if (!var3) {
                this.method3155(arg0);
                boolean var4 = this.method3086(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class129.method1234(this.field2731[arg0][arg1], false);
    }

    @ObfuscatedName("fo.h(IB)[B")
    public byte[] method3079(int arg0) {
        if (this.field2731.length == 1) {
            return this.method3078(0, arg0);
        } else if (this.field2731[arg0].length == 1) {
            return this.method3078(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fo.l(II)V")
    public void method3155(int arg0) {
    }

    @ObfuscatedName("fo.b(IS)[I")
    public int[] method3081(int arg0) {
        return this.field2724[arg0];
    }

    @ObfuscatedName("fo.g(II)I")
    public int method3082(int arg0) {
        return this.field2731[arg0].length;
    }

    @ObfuscatedName("fo.e(B)I")
    public int method3083() {
        return this.field2731.length;
    }

    @ObfuscatedName("fo.p(II)V")
    public void method3084(int arg0) {
        for (int var2 = 0; var2 < this.field2731[arg0].length; var2++) {
            this.field2731[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fo.s(I)V")
    public void method3129() {
        for (int var1 = 0; var1 < this.field2731.length; var1++) {
            if (this.field2731[var1] != null) {
                for (int var2 = 0; var2 < this.field2731[var1].length; var2++) {
                    this.field2731[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fo.w(I[IB)Z")
    public boolean method3086(int arg0, int[] arg1) {
        if (this.field2727[arg0] == null) {
            return false;
        }
        int var3 = this.field2717[arg0];
        int[] var4 = this.field2724[arg0];
        Object[] var5 = this.field2731[arg0];
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
            var8 = class129.method1234(this.field2727[arg0], true);
            class123 var9 = new class123(var8);
            var9.method2447(arg1, 5, var9.field2054.length);
        } else {
            var8 = class129.method1234(this.field2727[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2118(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class123.method2689(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class123.method2689(var8, 0, var17);
            throw class152.method1235(var34, var16 + var18 + "," + this.field2721[arg0] + "," + this.field2719);
        }
        if (this.field2728) {
            this.field2727[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class123 var22 = new class123(var10);
            int[] var23 = new int[var3];
            var22.field2060 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2432();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2060 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2432();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2732) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class129.method967(var27[var33], false);
                }
            }
        } else if (this.field2732) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class129.method967(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fo.i(Ljava/lang/String;I)I")
    public int method3119(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2720.method3532(class167.method660(var2));
    }

    @ObfuscatedName("fo.r(ILjava/lang/String;I)I")
    public int method3117(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2726[arg0].method3532(class167.method660(var3));
    }

    @ObfuscatedName("fo.a(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3089(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2720.method3532(class167.method660(var3));
        int var6 = this.field2726[var5].method3532(class167.method660(var4));
        return this.method3097(var5, var6);
    }

    @ObfuscatedName("fo.n(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3143(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2720.method3532(class167.method660(var3));
        int var6 = this.field2726[var5].method3532(class167.method660(var4));
        return this.method3074(var5, var6);
    }

    @ObfuscatedName("fo.z(Ljava/lang/String;B)Z")
    public boolean method3091(String arg0) {
        int var2 = this.method3119("");
        return var2 == -1 ? this.method3143(arg0, "") : this.method3143("", arg0);
    }

    @ObfuscatedName("fo.x(Ljava/lang/String;I)V")
    public void method3092(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2720.method3532(class167.method660(var2));
        if (var3 >= 0) {
            this.method3071(var3);
        }
    }

    @ObfuscatedName("cw.d([BI)[B")
    public static final byte[] method2118(byte[] arg0) {
        class123 var1 = new class123(arg0);
        int var2 = var1.method2427();
        int var3 = var1.method2432();
        if (var3 < 0 || !(field2733 == 0 || var3 <= field2733)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2438(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2432();
            if (var5 < 0 || field2733 != 0 && var5 > field2733) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class121.method2382(var6, var5, arg0, var3, 9);
            } else {
                field2729.method2374(var1, var6);
            }
            return var6;
        }
    }
}
