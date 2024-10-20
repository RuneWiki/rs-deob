package deob;

@ObfuscatedName("hz")
public abstract class class234 {

    @ObfuscatedName("hz.x")
    public int field3105;

    @ObfuscatedName("hz.t")
    public int[] field3106;

    @ObfuscatedName("hz.g")
    public int[] field3107;

    @ObfuscatedName("hz.l")
    public class335 field3108;

    @ObfuscatedName("hz.u")
    public int[] field3109;

    @ObfuscatedName("hz.j")
    public int[] field3112;

    @ObfuscatedName("hz.v")
    public int[] field3111;

    @ObfuscatedName("hz.d")
    public int[][] field3104;

    @ObfuscatedName("hz.z")
    public int[][] field3119;

    @ObfuscatedName("hz.n")
    public class335[] field3114;

    @ObfuscatedName("hz.h")
    public Object[] field3116;

    @ObfuscatedName("hz.f")
    public Object[][] field3115;

    @ObfuscatedName("hz.s")
    public static class334 field3117 = new class334();

    @ObfuscatedName("hz.p")
    public int field3118;

    @ObfuscatedName("hz.e")
    public boolean field3110;

    @ObfuscatedName("hz.i")
    public boolean field3120;

    @ObfuscatedName("hz.q")
    public static int field3121 = 0;

    public class234(boolean arg0, boolean arg1) {
        this.field3110 = arg0;
        this.field3120 = arg1;
    }

    @ObfuscatedName("hz.c([BI)V")
    public void method3823(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class300.field3693[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field3118 = var5;
        class300 var8 = new class300(method3205(arg0));
        int var9 = var8.method5103();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method5208();
        }
        int var10 = var8.method5103();
        if (var9 >= 7) {
            this.field3105 = var8.method5119();
        } else {
            this.field3105 = var8.method5304();
        }
        int var11 = 0;
        int var12 = -1;
        this.field3106 = new int[this.field3105];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field3105; var13++) {
                this.field3106[var13] = var11 += var8.method5119();
                if (this.field3106[var13] > var12) {
                    var12 = this.field3106[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field3105; var14++) {
                this.field3106[var14] = var11 += var8.method5304();
                if (this.field3106[var14] > var12) {
                    var12 = this.field3106[var14];
                }
            }
        }
        this.field3109 = new int[var12 + 1];
        this.field3112 = new int[var12 + 1];
        this.field3111 = new int[var12 + 1];
        this.field3104 = new int[var12 + 1][];
        this.field3116 = new Object[var12 + 1];
        this.field3115 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field3107 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field3105; var15++) {
                this.field3107[this.field3106[var15]] = var8.method5208();
            }
            this.field3108 = new class335(this.field3107);
        }
        for (int var16 = 0; var16 < this.field3105; var16++) {
            this.field3109[this.field3106[var16]] = var8.method5208();
        }
        for (int var17 = 0; var17 < this.field3105; var17++) {
            this.field3112[this.field3106[var17]] = var8.method5208();
        }
        for (int var18 = 0; var18 < this.field3105; var18++) {
            this.field3111[this.field3106[var18]] = var8.method5304();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field3105; var19++) {
                int var20 = this.field3106[var19];
                int var21 = this.field3111[var20];
                int var22 = 0;
                int var23 = -1;
                this.field3104[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field3104[var20][var24] = var22 += var8.method5119();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field3115[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field3105; var26++) {
                int var27 = this.field3106[var26];
                int var28 = this.field3111[var27];
                int var29 = 0;
                int var30 = -1;
                this.field3104[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field3104[var27][var31] = var29 += var8.method5304();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field3115[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field3119 = new int[var12 + 1][];
        this.field3114 = new class335[var12 + 1];
        for (int var33 = 0; var33 < this.field3105; var33++) {
            int var34 = this.field3106[var33];
            int var35 = this.field3111[var34];
            this.field3119[var34] = new int[this.field3115[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field3119[var34][this.field3104[var34][var36]] = var8.method5208();
            }
            this.field3114[var34] = new class335(this.field3119[var34]);
        }
    }

    @ObfuscatedName("hz.x(II)V")
    public void method3824(int arg0) {
    }

    @ObfuscatedName("hz.t(III)[B")
    public byte[] method3825(int arg0, int arg1) {
        return this.method3833(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("hz.g(II[II)[B")
    public byte[] method3833(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3115.length || this.field3115[arg0] == null || arg1 < 0 || arg1 >= this.field3115[arg0].length) {
            return null;
        }
        if (this.field3115[arg0][arg1] == null) {
            boolean var4 = this.method3842(arg0, arg2);
            if (!var4) {
                this.method3919(arg0);
                boolean var5 = this.method3842(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class206.method3190(this.field3115[arg0][arg1], false);
        if (this.field3120) {
            this.field3115[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("hz.l(IIB)Z")
    public boolean method3827(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3115.length || this.field3115[arg0] == null || arg1 < 0 || arg1 >= this.field3115[arg0].length) {
            return false;
        } else if (this.field3115[arg0][arg1] != null) {
            return true;
        } else if (this.field3116[arg0] == null) {
            this.method3919(arg0);
            return this.field3116[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hz.u(IB)Z")
    public boolean method3828(int arg0) {
        if (this.field3115.length == 1) {
            return this.method3827(0, arg0);
        } else if (this.field3115[arg0].length == 1) {
            return this.method3827(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hz.j(II)Z")
    public boolean method3874(int arg0) {
        if (this.field3116[arg0] == null) {
            this.method3919(arg0);
            return this.field3116[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hz.v(B)Z")
    public boolean method3830() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3106.length; var2++) {
            int var3 = this.field3106[var2];
            if (this.field3116[var3] == null) {
                this.method3919(var3);
                if (this.field3116[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("hz.d(II)I")
    public int method3831(int arg0) {
        return this.field3116[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("hz.z(II)[B")
    public byte[] method3832(int arg0) {
        if (this.field3115.length == 1) {
            return this.method3825(0, arg0);
        } else if (this.field3115[arg0].length == 1) {
            return this.method3825(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hz.s(III)[B")
    public byte[] method3838(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3115.length || this.field3115[arg0] == null || arg1 < 0 || arg1 >= this.field3115[arg0].length) {
            return null;
        }
        if (this.field3115[arg0][arg1] == null) {
            boolean var3 = this.method3842(arg0, (int[]) null);
            if (!var3) {
                this.method3919(arg0);
                boolean var4 = this.method3842(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class206.method3190(this.field3115[arg0][arg1], false);
    }

    @ObfuscatedName("hz.p(II)[B")
    public byte[] method3834(int arg0) {
        if (this.field3115.length == 1) {
            return this.method3838(0, arg0);
        } else if (this.field3115[arg0].length == 1) {
            return this.method3838(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hz.e(II)V")
    public void method3919(int arg0) {
    }

    @ObfuscatedName("hz.i(IB)[I")
    public int[] method3836(int arg0) {
        return arg0 >= 0 && arg0 < this.field3104.length ? this.field3104[arg0] : null;
    }

    @ObfuscatedName("hz.q(II)I")
    public int method3837(int arg0) {
        return this.field3115[arg0].length;
    }

    @ObfuscatedName("hz.r(B)I")
    public int method3826() {
        return this.field3115.length;
    }

    @ObfuscatedName("hz.k(I)V")
    public void method3880() {
        for (int var1 = 0; var1 < this.field3116.length; var1++) {
            this.field3116[var1] = null;
        }
    }

    @ObfuscatedName("hz.w(IB)V")
    public void method3840(int arg0) {
        for (int var2 = 0; var2 < this.field3115[arg0].length; var2++) {
            this.field3115[arg0][var2] = null;
        }
    }

    @ObfuscatedName("hz.m(I)V")
    public void method3841() {
        for (int var1 = 0; var1 < this.field3115.length; var1++) {
            if (this.field3115[var1] != null) {
                for (int var2 = 0; var2 < this.field3115[var1].length; var2++) {
                    this.field3115[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("hz.o(I[II)Z")
    public boolean method3842(int arg0, int[] arg1) {
        if (this.field3116[arg0] == null) {
            return false;
        }
        int var3 = this.field3111[arg0];
        int[] var4 = this.field3104[arg0];
        Object[] var5 = this.field3115[arg0];
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
            var8 = class206.method3190(this.field3116[arg0], true);
            class300 var9 = new class300(var8);
            var9.method5125(arg1, 5, var9.field3694.length);
        } else {
            var8 = class206.method3190(this.field3116[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3205(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class300.field3693[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class300.field3693[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class341.method3928(var42, var20 + var24 + "," + this.field3109[arg0] + "," + this.field3118);
        }
        if (this.field3110) {
            this.field3116[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class300 var30 = new class300(var10);
            int[] var31 = new int[var3];
            var30.field3696 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method5208();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field3696 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method5208();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field3120) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class206.method3126(var35[var41], false);
                }
            }
        } else if (this.field3120) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class206.method3126(var10, false);
        }
        return true;
    }

    @ObfuscatedName("hz.a(Ljava/lang/String;I)I")
    public int method3843(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3108.method6050(class291.method3960(var2));
    }

    @ObfuscatedName("hz.b(ILjava/lang/String;I)I")
    public int method3865(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3114[arg0].method6050(class291.method3960(var3));
    }

    @ObfuscatedName("hz.ag(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3845(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3108.method6050(class291.method3960(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3114[var5].method6050(class291.method3960(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("hz.at(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3895(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3108.method6050(class291.method3960(var3));
        int var6 = this.field3114[var5].method6050(class291.method3960(var4));
        return this.method3825(var5, var6);
    }

    @ObfuscatedName("hz.ao(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3829(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3108.method6050(class291.method3960(var3));
        int var6 = this.field3114[var5].method6050(class291.method3960(var4));
        return this.method3827(var5, var6);
    }

    @ObfuscatedName("hz.av(Ljava/lang/String;B)Z")
    public boolean method3881(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3108.method6050(class291.method3960(var2));
        return this.method3874(var3);
    }

    @ObfuscatedName("hz.an(Ljava/lang/String;I)V")
    public void method3849(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3108.method6050(class291.method3960(var2));
        if (var3 >= 0) {
            this.method3824(var3);
        }
    }

    @ObfuscatedName("hz.al(Ljava/lang/String;I)I")
    public int method3866(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3108.method6050(class291.method3960(var2));
        return this.method3831(var3);
    }

    @ObfuscatedName("fq.as([BI)[B")
    public static final byte[] method3205(byte[] arg0) {
        class300 var1 = new class300(arg0);
        int var2 = var1.method5103();
        int var3 = var1.method5208();
        if (var3 < 0 || !(field3121 == 0 || var3 <= field3121)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5115(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5208();
            if (var5 < 0 || field3121 != 0 && var5 > field3121) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class304.method5390(var6, var5, arg0, var3, 9);
            } else {
                field3117.method6043(var1, var6);
            }
            return var6;
        }
    }
}
