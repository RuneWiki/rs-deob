package deob;

@ObfuscatedName("gj")
public abstract class class183 {

    @ObfuscatedName("gj.q")
    public int field2723;

    @ObfuscatedName("gj.d")
    public int[] field2726;

    @ObfuscatedName("gj.h")
    public int[] field2710;

    @ObfuscatedName("gj.p")
    public class123 field2712;

    @ObfuscatedName("gj.j")
    public int[] field2713;

    @ObfuscatedName("gj.n")
    public int[] field2714;

    @ObfuscatedName("gj.r")
    public int[] field2718;

    @ObfuscatedName("gj.c")
    public int[][] field2716;

    @ObfuscatedName("gj.i")
    public int[][] field2711;

    @ObfuscatedName("gj.o")
    public class123[] field2709;

    @ObfuscatedName("gj.m")
    public Object[] field2719;

    @ObfuscatedName("gj.s")
    public Object[][] field2720;

    @ObfuscatedName("gj.u")
    public static class147 field2721 = new class147();

    @ObfuscatedName("gj.b")
    public int field2722;

    @ObfuscatedName("gj.v")
    public boolean field2715;

    @ObfuscatedName("gj.f")
    public boolean field2724;

    @ObfuscatedName("gj.z")
    public static int field2727 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2715 = arg0;
        this.field2724 = arg1;
    }

    @ObfuscatedName("gj.q([BI)V")
    public void method3114(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class154.field2097[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2722 = var5;
        class154 var8 = new class154(method189(arg0));
        int var9 = var8.method2666();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2798();
        }
        int var10 = var8.method2666();
        if (var9 >= 7) {
            this.field2723 = var8.method2680();
        } else {
            this.field2723 = var8.method2668();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2726 = new int[this.field2723];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2723; var13++) {
                this.field2726[var13] = var11 += var8.method2680();
                if (this.field2726[var13] > var12) {
                    var12 = this.field2726[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2723; var14++) {
                this.field2726[var14] = var11 += var8.method2668();
                if (this.field2726[var14] > var12) {
                    var12 = this.field2726[var14];
                }
            }
        }
        this.field2713 = new int[var12 + 1];
        this.field2714 = new int[var12 + 1];
        this.field2718 = new int[var12 + 1];
        this.field2716 = new int[var12 + 1][];
        this.field2719 = new Object[var12 + 1];
        this.field2720 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2710 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2723; var15++) {
                this.field2710[this.field2726[var15]] = var8.method2798();
            }
            this.field2712 = new class123(this.field2710);
        }
        for (int var16 = 0; var16 < this.field2723; var16++) {
            this.field2713[this.field2726[var16]] = var8.method2798();
        }
        for (int var17 = 0; var17 < this.field2723; var17++) {
            this.field2714[this.field2726[var17]] = var8.method2798();
        }
        for (int var18 = 0; var18 < this.field2723; var18++) {
            this.field2718[this.field2726[var18]] = var8.method2668();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2723; var19++) {
                int var20 = this.field2726[var19];
                int var21 = this.field2718[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2716[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2716[var20][var24] = var22 += var8.method2680();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2720[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2723; var26++) {
                int var27 = this.field2726[var26];
                int var28 = this.field2718[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2716[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2716[var27][var31] = var29 += var8.method2668();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2720[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2711 = new int[var12 + 1][];
        this.field2709 = new class123[var12 + 1];
        for (int var33 = 0; var33 < this.field2723; var33++) {
            int var34 = this.field2726[var33];
            int var35 = this.field2718[var34];
            this.field2711[var34] = new int[this.field2720[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2711[var34][this.field2716[var34][var36]] = var8.method2798();
            }
            this.field2709[var34] = new class123(this.field2711[var34]);
        }
    }

    @ObfuscatedName("gj.d(II)V")
    public void method3115(int arg0) {
    }

    @ObfuscatedName("gj.h(III)[B")
    public byte[] method3133(int arg0, int arg1) {
        return this.method3180(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gj.p(II[II)[B")
    public byte[] method3180(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2720.length || this.field2720[arg0] == null || arg1 < 0 || arg1 >= this.field2720[arg0].length) {
            return null;
        }
        if (this.field2720[arg0][arg1] == null) {
            boolean var4 = this.method3130(arg0, arg2);
            if (!var4) {
                this.method3124(arg0);
                boolean var5 = this.method3130(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class157.method903(this.field2720[arg0][arg1], false);
        if (this.field2724) {
            this.field2720[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gj.j(III)Z")
    public boolean method3189(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2720.length || this.field2720[arg0] == null || arg1 < 0 || arg1 >= this.field2720[arg0].length) {
            return false;
        } else if (this.field2720[arg0][arg1] != null) {
            return true;
        } else if (this.field2719[arg0] == null) {
            this.method3124(arg0);
            return this.field2719[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gj.n(II)Z")
    public boolean method3119(int arg0) {
        if (this.field2719[arg0] == null) {
            this.method3124(arg0);
            return this.field2719[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gj.c(B)Z")
    public boolean method3120() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2726.length; var2++) {
            int var3 = this.field2726[var2];
            if (this.field2719[var3] == null) {
                this.method3124(var3);
                if (this.field2719[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gj.o(II)[B")
    public byte[] method3121(int arg0) {
        if (this.field2720.length == 1) {
            return this.method3133(0, arg0);
        } else if (this.field2720[arg0].length == 1) {
            return this.method3133(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gj.s(III)[B")
    public byte[] method3178(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2720.length || this.field2720[arg0] == null || arg1 < 0 || arg1 >= this.field2720[arg0].length) {
            return null;
        }
        if (this.field2720[arg0][arg1] == null) {
            boolean var3 = this.method3130(arg0, (int[]) null);
            if (!var3) {
                this.method3124(arg0);
                boolean var4 = this.method3130(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class157.method903(this.field2720[arg0][arg1], false);
    }

    @ObfuscatedName("gj.u(II)[B")
    public byte[] method3123(int arg0) {
        if (this.field2720.length == 1) {
            return this.method3178(0, arg0);
        } else if (this.field2720[arg0].length == 1) {
            return this.method3178(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gj.b(II)V")
    public void method3124(int arg0) {
    }

    @ObfuscatedName("gj.v(II)[I")
    public int[] method3125(int arg0) {
        return this.field2716[arg0];
    }

    @ObfuscatedName("gj.f(II)I")
    public int method3126(int arg0) {
        return this.field2720[arg0].length;
    }

    @ObfuscatedName("gj.z(I)I")
    public int method3127() {
        return this.field2720.length;
    }

    @ObfuscatedName("gj.t(IB)V")
    public void method3128(int arg0) {
        for (int var2 = 0; var2 < this.field2720[arg0].length; var2++) {
            this.field2720[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gj.y(I)V")
    public void method3129() {
        for (int var1 = 0; var1 < this.field2720.length; var1++) {
            if (this.field2720[var1] != null) {
                for (int var2 = 0; var2 < this.field2720[var1].length; var2++) {
                    this.field2720[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gj.w(I[II)Z")
    public boolean method3130(int arg0, int[] arg1) {
        if (this.field2719[arg0] == null) {
            return false;
        }
        int var3 = this.field2718[arg0];
        int[] var4 = this.field2716[arg0];
        Object[] var5 = this.field2720[arg0];
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
            var8 = class157.method903(this.field2719[arg0], true);
            class154 var9 = new class154(var8);
            var9.method2686(arg1, 5, var9.field2092.length);
        } else {
            var8 = class157.method903(this.field2719[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method189(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class154.field2097[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class154.field2097[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class102.method14(var42, var20 + var24 + "," + this.field2713[arg0] + "," + this.field2722);
        }
        if (this.field2715) {
            this.field2719[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class154 var30 = new class154(var10);
            int[] var31 = new int[var3];
            var30.field2091 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method2798();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field2091 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method2798();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field2724) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class157.method206(var35[var41], false);
                }
            }
        } else if (this.field2724) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class157.method206(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gj.a(Ljava/lang/String;I)I")
    public int method3148(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2712.method2237(class208.method160(var2));
    }

    @ObfuscatedName("gj.k(ILjava/lang/String;I)I")
    public int method3132(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2709[arg0].method2237(class208.method160(var3));
    }

    @ObfuscatedName("gj.l(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3151(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2712.method2237(class208.method160(var3));
        int var6 = this.field2709[var5].method2237(class208.method160(var4));
        return this.method3133(var5, var6);
    }

    @ObfuscatedName("gj.x(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3134(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2712.method2237(class208.method160(var3));
        int var6 = this.field2709[var5].method2237(class208.method160(var4));
        return this.method3189(var5, var6);
    }

    @ObfuscatedName("gj.g(Ljava/lang/String;I)Z")
    public boolean method3135(String arg0) {
        int var2 = this.method3148("");
        return var2 == -1 ? this.method3134(arg0, "") : this.method3134("", arg0);
    }

    @ObfuscatedName("gj.e(Ljava/lang/String;I)V")
    public void method3136(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2712.method2237(class208.method160(var2));
        if (var3 >= 0) {
            this.method3115(var3);
        }
    }

    @ObfuscatedName("z.ae([BB)[B")
    public static final byte[] method189(byte[] arg0) {
        class154 var1 = new class154(arg0);
        int var2 = var1.method2666();
        int var3 = var1.method2798();
        if (var3 < 0 || !(field2727 == 0 || var3 <= field2727)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2843(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2798();
            if (var5 < 0 || field2727 != 0 && var5 > field2727) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class148.method2602(var6, var5, arg0, var3, 9);
            } else {
                field2721.method2596(var1, var6);
            }
            return var6;
        }
    }
}
