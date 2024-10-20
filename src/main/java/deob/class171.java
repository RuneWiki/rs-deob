package deob;

@ObfuscatedName("fj")
public abstract class class171 {

    @ObfuscatedName("fj.f")
    public int field2710;

    @ObfuscatedName("fj.e")
    public int[] field2704;

    @ObfuscatedName("fj.n")
    public int[] field2718;

    @ObfuscatedName("fj.t")
    public class196 field2707;

    @ObfuscatedName("fj.v")
    public int[] field2715;

    @ObfuscatedName("fj.b")
    public int[] field2709;

    @ObfuscatedName("fj.m")
    public int[] field2713;

    @ObfuscatedName("fj.k")
    public int[][] field2711;

    @ObfuscatedName("fj.c")
    public int[][] field2712;

    @ObfuscatedName("fj.w")
    public class196[] field2708;

    @ObfuscatedName("fj.l")
    public Object[] field2714;

    @ObfuscatedName("fj.h")
    public Object[][] field2706;

    @ObfuscatedName("fj.i")
    public static class120 field2716 = new class120();

    @ObfuscatedName("fj.u")
    public int field2717;

    @ObfuscatedName("fj.x")
    public boolean field2705;

    @ObfuscatedName("fj.d")
    public boolean field2719;

    @ObfuscatedName("fj.o")
    public static int field2720 = 0;

    public class171(boolean arg0, boolean arg1) {
        this.field2705 = arg0;
        this.field2719 = arg1;
    }

    @ObfuscatedName("fj.f([BI)V")
    public void method3087(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class123.field2056[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2717 = var5;
        class123 var8 = new class123(method2997(arg0));
        int var9 = var8.method2522();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2404();
        }
        int var10 = var8.method2522();
        if (var9 >= 7) {
            this.field2710 = var8.method2413();
        } else {
            this.field2710 = var8.method2401();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2704 = new int[this.field2710];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2710; var13++) {
                this.field2704[var13] = var11 += var8.method2413();
                if (this.field2704[var13] > var12) {
                    var12 = this.field2704[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2710; var14++) {
                this.field2704[var14] = var11 += var8.method2401();
                if (this.field2704[var14] > var12) {
                    var12 = this.field2704[var14];
                }
            }
        }
        this.field2715 = new int[var12 + 1];
        this.field2709 = new int[var12 + 1];
        this.field2713 = new int[var12 + 1];
        this.field2711 = new int[var12 + 1][];
        this.field2714 = new Object[var12 + 1];
        this.field2706 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2718 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2710; var15++) {
                this.field2718[this.field2704[var15]] = var8.method2404();
            }
            this.field2707 = new class196(this.field2718);
        }
        for (int var16 = 0; var16 < this.field2710; var16++) {
            this.field2715[this.field2704[var16]] = var8.method2404();
        }
        for (int var17 = 0; var17 < this.field2710; var17++) {
            this.field2709[this.field2704[var17]] = var8.method2404();
        }
        for (int var18 = 0; var18 < this.field2710; var18++) {
            this.field2713[this.field2704[var18]] = var8.method2401();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2710; var19++) {
                int var20 = this.field2704[var19];
                int var21 = this.field2713[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2711[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2711[var20][var24] = var22 += var8.method2413();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2706[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2710; var26++) {
                int var27 = this.field2704[var26];
                int var28 = this.field2713[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2711[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2711[var27][var31] = var29 += var8.method2401();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2706[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2712 = new int[var12 + 1][];
        this.field2708 = new class196[var12 + 1];
        for (int var33 = 0; var33 < this.field2710; var33++) {
            int var34 = this.field2704[var33];
            int var35 = this.field2713[var34];
            this.field2712[var34] = new int[this.field2706[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2712[var34][this.field2711[var34][var36]] = var8.method2404();
            }
            this.field2708[var34] = new class196(this.field2712[var34]);
        }
    }

    @ObfuscatedName("fj.e(II)V")
    public void method3086(int arg0) {
    }

    @ObfuscatedName("fj.n(III)[B")
    public byte[] method3107(int arg0, int arg1) {
        return this.method3121(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fj.t(II[IB)[B")
    public byte[] method3121(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2706.length || this.field2706[arg0] == null || arg1 < 0 || arg1 >= this.field2706[arg0].length) {
            return null;
        }
        if (this.field2706[arg0][arg1] == null) {
            boolean var4 = this.method3101(arg0, arg2);
            if (!var4) {
                this.method3103(arg0);
                boolean var5 = this.method3101(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class129.method44(this.field2706[arg0][arg1], false);
        if (this.field2719) {
            this.field2706[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fj.v(III)Z")
    public boolean method3156(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2706.length || this.field2706[arg0] == null || arg1 < 0 || arg1 >= this.field2706[arg0].length) {
            return false;
        } else if (this.field2706[arg0][arg1] != null) {
            return true;
        } else if (this.field2714[arg0] == null) {
            this.method3103(arg0);
            return this.field2714[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fj.b(IB)Z")
    public boolean method3133(int arg0) {
        if (this.field2714[arg0] == null) {
            this.method3103(arg0);
            return this.field2714[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fj.m(B)Z")
    public boolean method3091() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2704.length; var2++) {
            int var3 = this.field2704[var2];
            if (this.field2714[var3] == null) {
                this.method3103(var3);
                if (this.field2714[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fj.k(IB)[B")
    public byte[] method3092(int arg0) {
        if (this.field2706.length == 1) {
            return this.method3107(0, arg0);
        } else if (this.field2706[arg0].length == 1) {
            return this.method3107(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fj.c(IIS)[B")
    public byte[] method3095(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2706.length || this.field2706[arg0] == null || arg1 < 0 || arg1 >= this.field2706[arg0].length) {
            return null;
        }
        if (this.field2706[arg0][arg1] == null) {
            boolean var3 = this.method3101(arg0, (int[]) null);
            if (!var3) {
                this.method3103(arg0);
                boolean var4 = this.method3101(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class129.method44(this.field2706[arg0][arg1], false);
    }

    @ObfuscatedName("fj.w(IB)[B")
    public byte[] method3120(int arg0) {
        if (this.field2706.length == 1) {
            return this.method3095(0, arg0);
        } else if (this.field2706[arg0].length == 1) {
            return this.method3095(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fj.l(IB)V")
    public void method3103(int arg0) {
    }

    @ObfuscatedName("fj.h(II)[I")
    public int[] method3114(int arg0) {
        return this.field2711[arg0];
    }

    @ObfuscatedName("fj.i(II)I")
    public int method3124(int arg0) {
        return this.field2706[arg0].length;
    }

    @ObfuscatedName("fj.u(I)I")
    public int method3098() {
        return this.field2706.length;
    }

    @ObfuscatedName("fj.x(II)V")
    public void method3099(int arg0) {
        for (int var2 = 0; var2 < this.field2706[arg0].length; var2++) {
            this.field2706[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fj.d(I)V")
    public void method3100() {
        for (int var1 = 0; var1 < this.field2706.length; var1++) {
            if (this.field2706[var1] != null) {
                for (int var2 = 0; var2 < this.field2706[var1].length; var2++) {
                    this.field2706[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fj.o(I[II)Z")
    public boolean method3101(int arg0, int[] arg1) {
        if (this.field2714[arg0] == null) {
            return false;
        }
        int var3 = this.field2713[arg0];
        int[] var4 = this.field2711[arg0];
        Object[] var5 = this.field2706[arg0];
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
            var8 = class129.method44(this.field2714[arg0], true);
            class123 var9 = new class123(var8);
            var9.method2419(arg1, 5, var9.field2053.length);
        } else {
            var8 = class129.method44(this.field2714[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2997(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class123.field2056[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class123.field2056[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class152.method111(var43, var21 + var25 + "," + this.field2715[arg0] + "," + this.field2717);
        }
        if (this.field2705) {
            this.field2714[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class123 var31 = new class123(var10);
            int[] var32 = new int[var3];
            var31.field2052 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2404();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field2052 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2404();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field2719) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class129.method2113(var36[var42], false);
                }
            }
        } else if (this.field2719) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class129.method2113(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fj.j(Ljava/lang/String;B)I")
    public int method3102(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2707.method3565(class167.method673(var2));
    }

    @ObfuscatedName("fj.q(ILjava/lang/String;I)I")
    public int method3164(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2708[arg0].method3565(class167.method673(var3));
    }

    @ObfuscatedName("fj.r(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3088(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2707.method3565(class167.method673(var3));
        int var6 = this.field2708[var5].method3565(class167.method673(var4));
        return this.method3107(var5, var6);
    }

    @ObfuscatedName("fj.a(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3105(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2707.method3565(class167.method673(var3));
        int var6 = this.field2708[var5].method3565(class167.method673(var4));
        return this.method3156(var5, var6);
    }

    @ObfuscatedName("fj.z(Ljava/lang/String;B)Z")
    public boolean method3106(String arg0) {
        int var2 = this.method3102("");
        return var2 == -1 ? this.method3105(arg0, "") : this.method3105("", arg0);
    }

    @ObfuscatedName("fj.p(Ljava/lang/String;I)V")
    public void method3090(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2707.method3565(class167.method673(var2));
        if (var3 >= 0) {
            this.method3086(var3);
        }
    }

    @ObfuscatedName("fo.y([BI)[B")
    public static final byte[] method2997(byte[] arg0) {
        class123 var1 = new class123(arg0);
        int var2 = var1.method2522();
        int var3 = var1.method2404();
        if (var3 < 0 || !(field2720 == 0 || var3 <= field2720)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2564(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2404();
            if (var5 < 0 || field2720 != 0 && var5 > field2720) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class121.method2347(var6, var5, arg0, var3, 9);
            } else {
                field2716.method2344(var1, var6);
            }
            return var6;
        }
    }
}
