package deob;

@ObfuscatedName("hz")
public abstract class class234 {

    @ObfuscatedName("hz.j")
    public int field3105;

    @ObfuscatedName("hz.i")
    public int[] field3107;

    @ObfuscatedName("hz.k")
    public int[] field3104;

    @ObfuscatedName("hz.u")
    public class335 field3108;

    @ObfuscatedName("hz.n")
    public int[] field3109;

    @ObfuscatedName("hz.t")
    public int[] field3110;

    @ObfuscatedName("hz.q")
    public int[] field3106;

    @ObfuscatedName("hz.x")
    public int[][] field3112;

    @ObfuscatedName("hz.d")
    public int[][] field3113;

    @ObfuscatedName("hz.f")
    public class335[] field3117;

    @ObfuscatedName("hz.c")
    public Object[] field3115;

    @ObfuscatedName("hz.r")
    public Object[][] field3116;

    @ObfuscatedName("hz.y")
    public static class334 field3114 = new class334();

    @ObfuscatedName("hz.p")
    public int field3118;

    @ObfuscatedName("hz.b")
    public boolean field3119;

    @ObfuscatedName("hz.g")
    public boolean field3120;

    @ObfuscatedName("hz.e")
    public static int field3121 = 0;

    public class234(boolean arg0, boolean arg1) {
        this.field3119 = arg0;
        this.field3120 = arg1;
    }

    @ObfuscatedName("hz.s([BB)V")
    public void method3763(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class300.field3705[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field3118 = var5;
        class300 var8 = new class300(method1103(arg0));
        int var9 = var8.method5179();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method5056();
        }
        int var10 = var8.method5179();
        if (var9 >= 7) {
            this.field3105 = var8.method5067();
        } else {
            this.field3105 = var8.method5054();
        }
        int var11 = 0;
        int var12 = -1;
        this.field3107 = new int[this.field3105];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field3105; var13++) {
                this.field3107[var13] = var11 += var8.method5067();
                if (this.field3107[var13] > var12) {
                    var12 = this.field3107[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field3105; var14++) {
                this.field3107[var14] = var11 += var8.method5054();
                if (this.field3107[var14] > var12) {
                    var12 = this.field3107[var14];
                }
            }
        }
        this.field3109 = new int[var12 + 1];
        this.field3110 = new int[var12 + 1];
        this.field3106 = new int[var12 + 1];
        this.field3112 = new int[var12 + 1][];
        this.field3115 = new Object[var12 + 1];
        this.field3116 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field3104 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field3105; var15++) {
                this.field3104[this.field3107[var15]] = var8.method5056();
            }
            this.field3108 = new class335(this.field3104);
        }
        for (int var16 = 0; var16 < this.field3105; var16++) {
            this.field3109[this.field3107[var16]] = var8.method5056();
        }
        for (int var17 = 0; var17 < this.field3105; var17++) {
            this.field3110[this.field3107[var17]] = var8.method5056();
        }
        for (int var18 = 0; var18 < this.field3105; var18++) {
            this.field3106[this.field3107[var18]] = var8.method5054();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field3105; var19++) {
                int var20 = this.field3107[var19];
                int var21 = this.field3106[var20];
                int var22 = 0;
                int var23 = -1;
                this.field3112[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field3112[var20][var24] = var22 += var8.method5067();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field3116[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field3105; var26++) {
                int var27 = this.field3107[var26];
                int var28 = this.field3106[var27];
                int var29 = 0;
                int var30 = -1;
                this.field3112[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field3112[var27][var31] = var29 += var8.method5054();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field3116[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field3113 = new int[var12 + 1][];
        this.field3117 = new class335[var12 + 1];
        for (int var33 = 0; var33 < this.field3105; var33++) {
            int var34 = this.field3107[var33];
            int var35 = this.field3106[var34];
            this.field3113[var34] = new int[this.field3116[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field3113[var34][this.field3112[var34][var36]] = var8.method5056();
            }
            this.field3117[var34] = new class335(this.field3113[var34]);
        }
    }

    @ObfuscatedName("hz.j(II)V")
    public void method3764(int arg0) {
    }

    @ObfuscatedName("hz.i(IIB)[B")
    public byte[] method3790(int arg0, int arg1) {
        return this.method3766(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("hz.k(II[II)[B")
    public byte[] method3766(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3116.length || this.field3116[arg0] == null || arg1 < 0 || arg1 >= this.field3116[arg0].length) {
            return null;
        }
        if (this.field3116[arg0][arg1] == null) {
            boolean var4 = this.method3819(arg0, arg2);
            if (!var4) {
                this.method3774(arg0);
                boolean var5 = this.method3819(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class206.method637(this.field3116[arg0][arg1], false);
        if (this.field3120) {
            this.field3116[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("hz.u(III)Z")
    public boolean method3845(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3116.length || this.field3116[arg0] == null || arg1 < 0 || arg1 >= this.field3116[arg0].length) {
            return false;
        } else if (this.field3116[arg0][arg1] != null) {
            return true;
        } else if (this.field3115[arg0] == null) {
            this.method3774(arg0);
            return this.field3115[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hz.n(II)Z")
    public boolean method3768(int arg0) {
        if (this.field3116.length == 1) {
            return this.method3845(0, arg0);
        } else if (this.field3116[arg0].length == 1) {
            return this.method3845(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hz.t(IS)Z")
    public boolean method3769(int arg0) {
        if (this.field3115[arg0] == null) {
            this.method3774(arg0);
            return this.field3115[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hz.q(I)Z")
    public boolean method3815() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3107.length; var2++) {
            int var3 = this.field3107[var2];
            if (this.field3115[var3] == null) {
                this.method3774(var3);
                if (this.field3115[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("hz.x(II)I")
    public int method3771(int arg0) {
        return this.field3115[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("hz.d(II)[B")
    public byte[] method3831(int arg0) {
        if (this.field3116.length == 1) {
            return this.method3790(0, arg0);
        } else if (this.field3116[arg0].length == 1) {
            return this.method3790(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hz.f(IIB)[B")
    public byte[] method3856(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3116.length || this.field3116[arg0] == null || arg1 < 0 || arg1 >= this.field3116[arg0].length) {
            return null;
        }
        if (this.field3116[arg0][arg1] == null) {
            boolean var3 = this.method3819(arg0, (int[]) null);
            if (!var3) {
                this.method3774(arg0);
                boolean var4 = this.method3819(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class206.method637(this.field3116[arg0][arg1], false);
    }

    @ObfuscatedName("hz.c(II)[B")
    public byte[] method3860(int arg0) {
        if (this.field3116.length == 1) {
            return this.method3856(0, arg0);
        } else if (this.field3116[arg0].length == 1) {
            return this.method3856(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hz.r(II)V")
    public void method3774(int arg0) {
    }

    @ObfuscatedName("hz.y(II)[I")
    public int[] method3770(int arg0) {
        return arg0 >= 0 && arg0 < this.field3112.length ? this.field3112[arg0] : null;
    }

    @ObfuscatedName("hz.p(II)I")
    public int method3776(int arg0) {
        return this.field3116[arg0].length;
    }

    @ObfuscatedName("hz.g(B)I")
    public int method3777() {
        return this.field3116.length;
    }

    @ObfuscatedName("hz.e(S)V")
    public void method3778() {
        for (int var1 = 0; var1 < this.field3115.length; var1++) {
            this.field3115[var1] = null;
        }
    }

    @ObfuscatedName("hz.z(IB)V")
    public void method3772(int arg0) {
        for (int var2 = 0; var2 < this.field3116[arg0].length; var2++) {
            this.field3116[arg0][var2] = null;
        }
    }

    @ObfuscatedName("hz.w(I)V")
    public void method3780() {
        for (int var1 = 0; var1 < this.field3116.length; var1++) {
            if (this.field3116[var1] != null) {
                for (int var2 = 0; var2 < this.field3116[var1].length; var2++) {
                    this.field3116[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("hz.l(I[II)Z")
    public boolean method3819(int arg0, int[] arg1) {
        if (this.field3115[arg0] == null) {
            return false;
        }
        int var3 = this.field3106[arg0];
        int[] var4 = this.field3112[arg0];
        Object[] var5 = this.field3116[arg0];
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
            var8 = class206.method637(this.field3115[arg0], true);
            class300 var9 = new class300(var8);
            var9.method5073(arg1, 5, var9.field3701.length);
        } else {
            var8 = class206.method637(this.field3115[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1103(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class300.field3705[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class300.field3705[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class341.method3381(var42, var20 + var24 + "," + this.field3109[arg0] + "," + this.field3118);
        }
        if (this.field3119) {
            this.field3115[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class300 var30 = new class300(var10);
            int[] var31 = new int[var3];
            var30.field3704 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method5056();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field3704 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method5056();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field3120) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class206.method3022(var35[var41], false);
                }
            }
        } else if (this.field3120) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class206.method3022(var10, false);
        }
        return true;
    }

    @ObfuscatedName("hz.h(Ljava/lang/String;B)I")
    public int method3775(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3108.method5981(class291.method2086(var2));
    }

    @ObfuscatedName("hz.v(ILjava/lang/String;I)I")
    public int method3786(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3117[arg0].method5981(class291.method2086(var3));
    }

    @ObfuscatedName("hz.m(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3784(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3108.method5981(class291.method2086(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3117[var5].method5981(class291.method2086(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("hz.o(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3785(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3108.method5981(class291.method2086(var3));
        int var6 = this.field3117[var5].method5981(class291.method2086(var4));
        return this.method3790(var5, var6);
    }

    @ObfuscatedName("hz.av(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3781(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3108.method5981(class291.method2086(var3));
        int var6 = this.field3117[var5].method5981(class291.method2086(var4));
        return this.method3845(var5, var6);
    }

    @ObfuscatedName("hz.am(Ljava/lang/String;B)Z")
    public boolean method3858(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3108.method5981(class291.method2086(var2));
        return this.method3769(var3);
    }

    @ObfuscatedName("hz.ai(Ljava/lang/String;B)V")
    public void method3836(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3108.method5981(class291.method2086(var2));
        if (var3 >= 0) {
            this.method3764(var3);
        }
    }

    @ObfuscatedName("hz.af(Ljava/lang/String;B)I")
    public int method3789(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3108.method5981(class291.method2086(var2));
        return this.method3771(var3);
    }

    @ObfuscatedName("bd.az([BB)[B")
    public static final byte[] method1103(byte[] arg0) {
        class300 var1 = new class300(arg0);
        int var2 = var1.method5179();
        int var3 = var1.method5056();
        if (var3 < 0 || !(field3121 == 0 || var3 <= field3121)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5063(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5056();
            if (var5 < 0 || field3121 != 0 && var5 > field3121) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class304.method5310(var6, var5, arg0, var3, 9);
            } else {
                field3114.method5974(var1, var6);
            }
            return var6;
        }
    }
}
