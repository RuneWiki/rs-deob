package deob;

@ObfuscatedName("in")
public abstract class class236 {

    @ObfuscatedName("in.e")
    public int field3191;

    @ObfuscatedName("in.o")
    public int[] field3190;

    @ObfuscatedName("in.m")
    public int[] field3200;

    @ObfuscatedName("in.g")
    public class188 field3189;

    @ObfuscatedName("in.d")
    public int[] field3193;

    @ObfuscatedName("in.b")
    public int[] field3195;

    @ObfuscatedName("in.k")
    public int[] field3187;

    @ObfuscatedName("in.f")
    public int[][] field3192;

    @ObfuscatedName("in.j")
    public int[][] field3194;

    @ObfuscatedName("in.q")
    public class188[] field3196;

    @ObfuscatedName("in.h")
    public Object[] field3188;

    @ObfuscatedName("in.i")
    public Object[][] field3197;

    @ObfuscatedName("in.s")
    public static class167 field3198 = new class167();

    @ObfuscatedName("in.n")
    public int field3199;

    @ObfuscatedName("in.c")
    public boolean field3186;

    @ObfuscatedName("in.v")
    public boolean field3201;

    @ObfuscatedName("in.u")
    public static int field3202 = 0;

    public class236(boolean arg0, boolean arg1) {
        this.field3186 = arg0;
        this.field3201 = arg1;
    }

    @ObfuscatedName("in.e([BI)V")
    public void method3827(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class174.field2371[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field3199 = var5;
        class174 var8 = new class174(method307(arg0));
        int var9 = var8.method2891();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2896();
        }
        int var10 = var8.method2891();
        if (var9 >= 7) {
            this.field3191 = var8.method2905();
        } else {
            this.field3191 = var8.method2930();
        }
        int var11 = 0;
        int var12 = -1;
        this.field3190 = new int[this.field3191];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field3191; var13++) {
                this.field3190[var13] = var11 += var8.method2905();
                if (this.field3190[var13] > var12) {
                    var12 = this.field3190[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field3191; var14++) {
                this.field3190[var14] = var11 += var8.method2930();
                if (this.field3190[var14] > var12) {
                    var12 = this.field3190[var14];
                }
            }
        }
        this.field3193 = new int[var12 + 1];
        this.field3195 = new int[var12 + 1];
        this.field3187 = new int[var12 + 1];
        this.field3192 = new int[var12 + 1][];
        this.field3188 = new Object[var12 + 1];
        this.field3197 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field3200 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field3191; var15++) {
                this.field3200[this.field3190[var15]] = var8.method2896();
            }
            this.field3189 = new class188(this.field3200);
        }
        for (int var16 = 0; var16 < this.field3191; var16++) {
            this.field3193[this.field3190[var16]] = var8.method2896();
        }
        for (int var17 = 0; var17 < this.field3191; var17++) {
            this.field3195[this.field3190[var17]] = var8.method2896();
        }
        for (int var18 = 0; var18 < this.field3191; var18++) {
            this.field3187[this.field3190[var18]] = var8.method2930();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field3191; var19++) {
                int var20 = this.field3190[var19];
                int var21 = this.field3187[var20];
                int var22 = 0;
                int var23 = -1;
                this.field3192[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field3192[var20][var24] = var22 += var8.method2905();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field3197[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field3191; var26++) {
                int var27 = this.field3190[var26];
                int var28 = this.field3187[var27];
                int var29 = 0;
                int var30 = -1;
                this.field3192[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field3192[var27][var31] = var29 += var8.method2930();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field3197[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field3194 = new int[var12 + 1][];
        this.field3196 = new class188[var12 + 1];
        for (int var33 = 0; var33 < this.field3191; var33++) {
            int var34 = this.field3190[var33];
            int var35 = this.field3187[var34];
            this.field3194[var34] = new int[this.field3197[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field3194[var34][this.field3192[var34][var36]] = var8.method2896();
            }
            this.field3196[var34] = new class188(this.field3194[var34]);
        }
    }

    @ObfuscatedName("in.o(II)V")
    public void method3759(int arg0) {
    }

    @ObfuscatedName("in.m(III)[B")
    public byte[] method3760(int arg0, int arg1) {
        return this.method3830(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("in.g(II[II)[B")
    public byte[] method3830(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3197.length || this.field3197[arg0] == null || arg1 < 0 || arg1 >= this.field3197[arg0].length) {
            return null;
        }
        if (this.field3197[arg0][arg1] == null) {
            boolean var4 = this.method3775(arg0, arg2);
            if (!var4) {
                this.method3823(arg0);
                boolean var5 = this.method3775(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class177.method227(this.field3197[arg0][arg1], false);
        if (this.field3201) {
            this.field3197[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("in.d(III)Z")
    public boolean method3798(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3197.length || this.field3197[arg0] == null || arg1 < 0 || arg1 >= this.field3197[arg0].length) {
            return false;
        } else if (this.field3197[arg0][arg1] != null) {
            return true;
        } else if (this.field3188[arg0] == null) {
            this.method3823(arg0);
            return this.field3188[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("in.b(II)Z")
    public boolean method3763(int arg0) {
        if (this.field3188[arg0] == null) {
            this.method3823(arg0);
            return this.field3188[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("in.k(B)Z")
    public boolean method3770() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3190.length; var2++) {
            int var3 = this.field3190[var2];
            if (this.field3188[var3] == null) {
                this.method3823(var3);
                if (this.field3188[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("in.q(II)I")
    public int method3765(int arg0) {
        return this.field3188[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("in.h(II)[B")
    public byte[] method3797(int arg0) {
        if (this.field3197.length == 1) {
            return this.method3760(0, arg0);
        } else if (this.field3197[arg0].length == 1) {
            return this.method3760(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("in.i(III)[B")
    public byte[] method3767(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3197.length || this.field3197[arg0] == null || arg1 < 0 || arg1 >= this.field3197[arg0].length) {
            return null;
        }
        if (this.field3197[arg0][arg1] == null) {
            boolean var3 = this.method3775(arg0, (int[]) null);
            if (!var3) {
                this.method3823(arg0);
                boolean var4 = this.method3775(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class177.method227(this.field3197[arg0][arg1], false);
    }

    @ObfuscatedName("in.s(II)[B")
    public byte[] method3828(int arg0) {
        if (this.field3197.length == 1) {
            return this.method3767(0, arg0);
        } else if (this.field3197[arg0].length == 1) {
            return this.method3767(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("in.n(IB)V")
    public void method3823(int arg0) {
    }

    @ObfuscatedName("in.c(II)[I")
    public int[] method3790(int arg0) {
        return this.field3192[arg0];
    }

    @ObfuscatedName("in.v(II)I")
    public int method3771(int arg0) {
        return this.field3197[arg0].length;
    }

    @ObfuscatedName("in.u(I)I")
    public int method3772() {
        return this.field3197.length;
    }

    @ObfuscatedName("in.w(II)V")
    public void method3773(int arg0) {
        for (int var2 = 0; var2 < this.field3197[arg0].length; var2++) {
            this.field3197[arg0][var2] = null;
        }
    }

    @ObfuscatedName("in.p(I)V")
    public void method3774() {
        for (int var1 = 0; var1 < this.field3197.length; var1++) {
            if (this.field3197[var1] != null) {
                for (int var2 = 0; var2 < this.field3197[var1].length; var2++) {
                    this.field3197[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("in.l(I[IB)Z")
    public boolean method3775(int arg0, int[] arg1) {
        if (this.field3188[arg0] == null) {
            return false;
        }
        int var3 = this.field3187[arg0];
        int[] var4 = this.field3192[arg0];
        Object[] var5 = this.field3197[arg0];
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
            var8 = class177.method227(this.field3188[arg0], true);
            class174 var9 = new class174(var8);
            var9.method2962(arg1, 5, var9.field2373.length);
        } else {
            var8 = class177.method227(this.field3188[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method307(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class174.field2371[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class174.field2371[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class153.method2675(var43, var21 + var25 + "," + this.field3193[arg0] + "," + this.field3199);
        }
        if (this.field3186) {
            this.field3188[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class174 var31 = new class174(var10);
            int[] var32 = new int[var3];
            var31.field2370 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2896();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field2370 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2896();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field3201) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class177.method1906(var36[var42], false);
                }
            }
        } else if (this.field3201) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class177.method1906(var10, false);
        }
        return true;
    }

    @ObfuscatedName("in.x(Ljava/lang/String;I)I")
    public int method3776(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3189.method3237(class271.method539(var2));
    }

    @ObfuscatedName("in.r(ILjava/lang/String;I)I")
    public int method3777(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3196[arg0].method3237(class271.method539(var3));
    }

    @ObfuscatedName("in.t(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3778(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3189.method3237(class271.method539(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3196[var5].method3237(class271.method539(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("in.a(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3785(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3189.method3237(class271.method539(var3));
        int var6 = this.field3196[var5].method3237(class271.method539(var4));
        return this.method3760(var5, var6);
    }

    @ObfuscatedName("in.ad(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3780(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3189.method3237(class271.method539(var3));
        int var6 = this.field3196[var5].method3237(class271.method539(var4));
        return this.method3798(var5, var6);
    }

    @ObfuscatedName("in.ay(Ljava/lang/String;I)Z")
    public boolean method3781(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3189.method3237(class271.method539(var2));
        return this.method3763(var3);
    }

    @ObfuscatedName("in.am(Ljava/lang/String;I)V")
    public void method3782(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3189.method3237(class271.method539(var2));
        if (var3 >= 0) {
            this.method3759(var3);
        }
    }

    @ObfuscatedName("in.ae(Ljava/lang/String;I)I")
    public int method3819(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3189.method3237(class271.method539(var2));
        return this.method3765(var3);
    }

    @ObfuscatedName("ai.az([BB)[B")
    public static final byte[] method307(byte[] arg0) {
        class174 var1 = new class174(arg0);
        int var2 = var1.method2891();
        int var3 = var1.method2896();
        if (var3 < 0 || !(field3202 == 0 || var3 <= field3202)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2902(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2896();
            if (var5 < 0 || field3202 != 0 && var5 > field3202) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class168.method2848(var6, var5, arg0, var3, 9);
            } else {
                field3198.method2831(var1, var6);
            }
            return var6;
        }
    }
}
