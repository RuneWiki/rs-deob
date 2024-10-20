package deob;

@ObfuscatedName("gj")
public abstract class class183 {

    @ObfuscatedName("gj.n")
    public int field2715;

    @ObfuscatedName("gj.d")
    public int[] field2709;

    @ObfuscatedName("gj.m")
    public int[] field2710;

    @ObfuscatedName("gj.h")
    public class123 field2711;

    @ObfuscatedName("gj.w")
    public int[] field2712;

    @ObfuscatedName("gj.r")
    public int[] field2708;

    @ObfuscatedName("gj.c")
    public int[] field2714;

    @ObfuscatedName("gj.p")
    public int[][] field2719;

    @ObfuscatedName("gj.g")
    public int[][] field2725;

    @ObfuscatedName("gj.z")
    public class123[] field2717;

    @ObfuscatedName("gj.q")
    public Object[] field2718;

    @ObfuscatedName("gj.l")
    public Object[][] field2723;

    @ObfuscatedName("gj.y")
    public static class154 field2716 = new class154();

    @ObfuscatedName("gj.e")
    public int field2721;

    @ObfuscatedName("gj.x")
    public boolean field2722;

    @ObfuscatedName("gj.f")
    public boolean field2720;

    @ObfuscatedName("gj.s")
    public static int field2724 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2722 = arg0;
        this.field2720 = arg1;
    }

    @ObfuscatedName("gj.n([BB)V")
    public void method3091(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class161.field2286[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2721 = var5;
        class161 var8 = new class161(method51(arg0));
        int var9 = var8.method2823();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2785();
        }
        int var10 = var8.method2823();
        if (var9 >= 7) {
            this.field2715 = var8.method2794();
        } else {
            this.field2715 = var8.method2887();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2709 = new int[this.field2715];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2715; var13++) {
                this.field2709[var13] = var11 += var8.method2794();
                if (this.field2709[var13] > var12) {
                    var12 = this.field2709[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2715; var14++) {
                this.field2709[var14] = var11 += var8.method2887();
                if (this.field2709[var14] > var12) {
                    var12 = this.field2709[var14];
                }
            }
        }
        this.field2712 = new int[var12 + 1];
        this.field2708 = new int[var12 + 1];
        this.field2714 = new int[var12 + 1];
        this.field2719 = new int[var12 + 1][];
        this.field2718 = new Object[var12 + 1];
        this.field2723 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2710 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2715; var15++) {
                this.field2710[this.field2709[var15]] = var8.method2785();
            }
            this.field2711 = new class123(this.field2710);
        }
        for (int var16 = 0; var16 < this.field2715; var16++) {
            this.field2712[this.field2709[var16]] = var8.method2785();
        }
        for (int var17 = 0; var17 < this.field2715; var17++) {
            this.field2708[this.field2709[var17]] = var8.method2785();
        }
        for (int var18 = 0; var18 < this.field2715; var18++) {
            this.field2714[this.field2709[var18]] = var8.method2887();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2715; var19++) {
                int var20 = this.field2709[var19];
                int var21 = this.field2714[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2719[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2719[var20][var24] = var22 += var8.method2794();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2723[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2715; var26++) {
                int var27 = this.field2709[var26];
                int var28 = this.field2714[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2719[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2719[var27][var31] = var29 += var8.method2887();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2723[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2725 = new int[var12 + 1][];
        this.field2717 = new class123[var12 + 1];
        for (int var33 = 0; var33 < this.field2715; var33++) {
            int var34 = this.field2709[var33];
            int var35 = this.field2714[var34];
            this.field2725[var34] = new int[this.field2723[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2725[var34][this.field2719[var34][var36]] = var8.method2785();
            }
            this.field2717[var34] = new class123(this.field2725[var34]);
        }
    }

    @ObfuscatedName("gj.d(II)V")
    public void method3092(int arg0) {
    }

    @ObfuscatedName("gj.m(III)[B")
    public byte[] method3093(int arg0, int arg1) {
        return this.method3094(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gj.h(II[II)[B")
    public byte[] method3094(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2723.length || this.field2723[arg0] == null || arg1 < 0 || arg1 >= this.field2723[arg0].length) {
            return null;
        }
        if (this.field2723[arg0][arg1] == null) {
            boolean var4 = this.method3151(arg0, arg2);
            if (!var4) {
                this.method3123(arg0);
                boolean var5 = this.method3151(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class164.method865(this.field2723[arg0][arg1], false);
        if (this.field2720) {
            this.field2723[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gj.w(III)Z")
    public boolean method3111(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2723.length || this.field2723[arg0] == null || arg1 < 0 || arg1 >= this.field2723[arg0].length) {
            return false;
        } else if (this.field2723[arg0][arg1] != null) {
            return true;
        } else if (this.field2718[arg0] == null) {
            this.method3123(arg0);
            return this.field2718[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gj.r(II)Z")
    public boolean method3096(int arg0) {
        if (this.field2718[arg0] == null) {
            this.method3123(arg0);
            return this.field2718[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gj.c(S)Z")
    public boolean method3158() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2709.length; var2++) {
            int var3 = this.field2709[var2];
            if (this.field2718[var3] == null) {
                this.method3123(var3);
                if (this.field2718[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gj.z(II)[B")
    public byte[] method3098(int arg0) {
        if (this.field2723.length == 1) {
            return this.method3093(0, arg0);
        } else if (this.field2723[arg0].length == 1) {
            return this.method3093(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gj.q(IIB)[B")
    public byte[] method3099(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2723.length || this.field2723[arg0] == null || arg1 < 0 || arg1 >= this.field2723[arg0].length) {
            return null;
        }
        if (this.field2723[arg0][arg1] == null) {
            boolean var3 = this.method3151(arg0, (int[]) null);
            if (!var3) {
                this.method3123(arg0);
                boolean var4 = this.method3151(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class164.method865(this.field2723[arg0][arg1], false);
    }

    @ObfuscatedName("gj.l(II)[B")
    public byte[] method3100(int arg0) {
        if (this.field2723.length == 1) {
            return this.method3099(0, arg0);
        } else if (this.field2723[arg0].length == 1) {
            return this.method3099(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gj.y(II)V")
    public void method3123(int arg0) {
    }

    @ObfuscatedName("gj.e(II)[I")
    public int[] method3102(int arg0) {
        return this.field2719[arg0];
    }

    @ObfuscatedName("gj.x(II)I")
    public int method3103(int arg0) {
        return this.field2723[arg0].length;
    }

    @ObfuscatedName("gj.f(I)I")
    public int method3124() {
        return this.field2723.length;
    }

    @ObfuscatedName("gj.s(II)V")
    public void method3118(int arg0) {
        for (int var2 = 0; var2 < this.field2723[arg0].length; var2++) {
            this.field2723[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gj.o(B)V")
    public void method3106() {
        for (int var1 = 0; var1 < this.field2723.length; var1++) {
            if (this.field2723[var1] != null) {
                for (int var2 = 0; var2 < this.field2723[var1].length; var2++) {
                    this.field2723[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gj.i(I[II)Z")
    public boolean method3151(int arg0, int[] arg1) {
        if (this.field2718[arg0] == null) {
            return false;
        }
        int var3 = this.field2714[arg0];
        int[] var4 = this.field2719[arg0];
        Object[] var5 = this.field2723[arg0];
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
            var8 = class164.method865(this.field2718[arg0], true);
            class161 var9 = new class161(var8);
            var9.method2769(arg1, 5, var9.field2291.length);
        } else {
            var8 = class164.method865(this.field2718[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method51(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class161.field2286[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class161.field2286[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class102.method3229(var43, var21 + var25 + "," + this.field2712[arg0] + "," + this.field2721);
        }
        if (this.field2722) {
            this.field2718[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class161 var31 = new class161(var10);
            int[] var32 = new int[var3];
            var31.field2285 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2785();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field2285 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2785();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field2720) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class164.method1394(var36[var42], false);
                }
            }
        } else if (this.field2720) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class164.method1394(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gj.a(Ljava/lang/String;B)I")
    public int method3114(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2711.method2205(class208.method3256(var2));
    }

    @ObfuscatedName("gj.b(ILjava/lang/String;B)I")
    public int method3109(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2717[arg0].method2205(class208.method3256(var3));
    }

    @ObfuscatedName("gj.j(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3110(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2711.method2205(class208.method3256(var3));
        int var6 = this.field2717[var5].method2205(class208.method3256(var4));
        return this.method3093(var5, var6);
    }

    @ObfuscatedName("gj.k(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3135(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2711.method2205(class208.method3256(var3));
        int var6 = this.field2717[var5].method2205(class208.method3256(var4));
        return this.method3111(var5, var6);
    }

    @ObfuscatedName("gj.v(Ljava/lang/String;I)Z")
    public boolean method3112(String arg0) {
        int var2 = this.method3114("");
        return var2 == -1 ? this.method3135(arg0, "") : this.method3135("", arg0);
    }

    @ObfuscatedName("gj.u(Ljava/lang/String;I)V")
    public void method3148(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2711.method2205(class208.method3256(var2));
        if (var3 >= 0) {
            this.method3092(var3);
        }
    }

    @ObfuscatedName("w.t([BI)[B")
    public static final byte[] method51(byte[] arg0) {
        class161 var1 = new class161(arg0);
        int var2 = var1.method2823();
        int var3 = var1.method2785();
        if (var3 < 0 || !(field2724 == 0 || var3 <= field2724)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2833(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2785();
            if (var5 < 0 || field2724 != 0 && var5 > field2724) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class155.method2738(var6, var5, arg0, var3, 9);
            } else {
                field2716.method2715(var1, var6);
            }
            return var6;
        }
    }
}
