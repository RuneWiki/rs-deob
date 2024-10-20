package deob;

@ObfuscatedName("ii")
public abstract class class237 {

    @ObfuscatedName("ii.i")
    public int field3221;

    @ObfuscatedName("ii.j")
    public int[] field3216;

    @ObfuscatedName("ii.a")
    public int[] field3215;

    @ObfuscatedName("ii.r")
    public class189 field3218;

    @ObfuscatedName("ii.o")
    public int[] field3219;

    @ObfuscatedName("ii.n")
    public int[] field3220;

    @ObfuscatedName("ii.q")
    public int[] field3217;

    @ObfuscatedName("ii.b")
    public int[][] field3222;

    @ObfuscatedName("ii.k")
    public int[][] field3223;

    @ObfuscatedName("ii.s")
    public class189[] field3224;

    @ObfuscatedName("ii.d")
    public Object[] field3225;

    @ObfuscatedName("ii.l")
    public Object[][] field3230;

    @ObfuscatedName("ii.t")
    public static class168 field3227 = new class168();

    @ObfuscatedName("ii.y")
    public int field3228;

    @ObfuscatedName("ii.v")
    public boolean field3229;

    @ObfuscatedName("ii.c")
    public boolean field3226;

    @ObfuscatedName("ii.z")
    public static int field3231 = 0;

    public class237(boolean arg0, boolean arg1) {
        this.field3229 = arg0;
        this.field3226 = arg1;
    }

    @ObfuscatedName("ii.i([BI)V")
    public void method3851(byte[] arg0) {
        this.field3228 = class175.method1385(arg0, arg0.length);
        class175 var2 = new class175(method3205(arg0));
        int var3 = var2.method2999();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2998();
        }
        int var4 = var2.method2999();
        if (var3 >= 7) {
            this.field3221 = var2.method3078();
        } else {
            this.field3221 = var2.method2995();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3216 = new int[this.field3221];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3221; var7++) {
                this.field3216[var7] = var5 += var2.method3078();
                if (this.field3216[var7] > var6) {
                    var6 = this.field3216[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3221; var8++) {
                this.field3216[var8] = var5 += var2.method2995();
                if (this.field3216[var8] > var6) {
                    var6 = this.field3216[var8];
                }
            }
        }
        this.field3219 = new int[var6 + 1];
        this.field3220 = new int[var6 + 1];
        this.field3217 = new int[var6 + 1];
        this.field3222 = new int[var6 + 1][];
        this.field3225 = new Object[var6 + 1];
        this.field3230 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3215 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3221; var9++) {
                this.field3215[this.field3216[var9]] = var2.method2998();
            }
            this.field3218 = new class189(this.field3215);
        }
        for (int var10 = 0; var10 < this.field3221; var10++) {
            this.field3219[this.field3216[var10]] = var2.method2998();
        }
        for (int var11 = 0; var11 < this.field3221; var11++) {
            this.field3220[this.field3216[var11]] = var2.method2998();
        }
        for (int var12 = 0; var12 < this.field3221; var12++) {
            this.field3217[this.field3216[var12]] = var2.method2995();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3221; var13++) {
                int var14 = this.field3216[var13];
                int var15 = this.field3217[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3222[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3222[var14][var18] = var16 += var2.method3078();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3230[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3221; var20++) {
                int var21 = this.field3216[var20];
                int var22 = this.field3217[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3222[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3222[var21][var25] = var23 += var2.method2995();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3230[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3223 = new int[var6 + 1][];
        this.field3224 = new class189[var6 + 1];
        for (int var27 = 0; var27 < this.field3221; var27++) {
            int var28 = this.field3216[var27];
            int var29 = this.field3217[var28];
            this.field3223[var28] = new int[this.field3230[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3223[var28][this.field3222[var28][var30]] = var2.method2998();
            }
            this.field3224[var28] = new class189(this.field3223[var28]);
        }
    }

    @ObfuscatedName("ii.j(II)V")
    public void method3823(int arg0) {
    }

    @ObfuscatedName("ii.a(IIB)[B")
    public byte[] method3824(int arg0, int arg1) {
        return this.method3825(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ii.r(II[IS)[B")
    public byte[] method3825(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3230.length || this.field3230[arg0] == null || arg1 < 0 || arg1 >= this.field3230[arg0].length) {
            return null;
        }
        if (this.field3230[arg0][arg1] == null) {
            boolean var4 = this.method3839(arg0, arg2);
            if (!var4) {
                this.method3842(arg0);
                boolean var5 = this.method3839(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class178.method2884(this.field3230[arg0][arg1], false);
        if (this.field3226) {
            this.field3230[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ii.o(III)Z")
    public boolean method3826(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3230.length || this.field3230[arg0] == null || arg1 < 0 || arg1 >= this.field3230[arg0].length) {
            return false;
        } else if (this.field3230[arg0][arg1] != null) {
            return true;
        } else if (this.field3225[arg0] == null) {
            this.method3842(arg0);
            return this.field3225[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ii.n(IB)Z")
    public boolean method3853(int arg0) {
        if (this.field3225[arg0] == null) {
            this.method3842(arg0);
            return this.field3225[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ii.q(S)Z")
    public boolean method3828() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3216.length; var2++) {
            int var3 = this.field3216[var2];
            if (this.field3225[var3] == null) {
                this.method3842(var3);
                if (this.field3225[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ii.b(IB)I")
    public int method3845(int arg0) {
        return this.field3225[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ii.k(II)[B")
    public byte[] method3898(int arg0) {
        if (this.field3230.length == 1) {
            return this.method3824(0, arg0);
        } else if (this.field3230[arg0].length == 1) {
            return this.method3824(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ii.s(IIS)[B")
    public byte[] method3831(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3230.length || this.field3230[arg0] == null || arg1 < 0 || arg1 >= this.field3230[arg0].length) {
            return null;
        }
        if (this.field3230[arg0][arg1] == null) {
            boolean var3 = this.method3839(arg0, (int[]) null);
            if (!var3) {
                this.method3842(arg0);
                boolean var4 = this.method3839(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class178.method2884(this.field3230[arg0][arg1], false);
    }

    @ObfuscatedName("ii.d(II)[B")
    public byte[] method3832(int arg0) {
        if (this.field3230.length == 1) {
            return this.method3831(0, arg0);
        } else if (this.field3230[arg0].length == 1) {
            return this.method3831(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ii.l(IB)V")
    public void method3842(int arg0) {
    }

    @ObfuscatedName("ii.c(II)[I")
    public int[] method3890(int arg0) {
        return this.field3222[arg0];
    }

    @ObfuscatedName("ii.u(II)I")
    public int method3835(int arg0) {
        return this.field3230[arg0].length;
    }

    @ObfuscatedName("ii.e(B)I")
    public int method3906() {
        return this.field3230.length;
    }

    @ObfuscatedName("ii.p(II)V")
    public void method3837(int arg0) {
        for (int var2 = 0; var2 < this.field3230[arg0].length; var2++) {
            this.field3230[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ii.m(I)V")
    public void method3838() {
        for (int var1 = 0; var1 < this.field3230.length; var1++) {
            if (this.field3230[var1] != null) {
                for (int var2 = 0; var2 < this.field3230[var1].length; var2++) {
                    this.field3230[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ii.x(I[II)Z")
    public boolean method3839(int arg0, int[] arg1) {
        if (this.field3225[arg0] == null) {
            return false;
        }
        int var3 = this.field3217[arg0];
        int[] var4 = this.field3222[arg0];
        Object[] var5 = this.field3230[arg0];
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
            var8 = class178.method2884(this.field3225[arg0], true);
            class175 var9 = new class175(var8);
            var9.method3014(arg1, 5, var9.field2392.length);
        } else {
            var8 = class178.method2884(this.field3225[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3205(var8);
        } catch (RuntimeException var27) {
            throw class154.method2292(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class175.method1385(var8, var8.length) + "," + class175.method1385(var8, var8.length - 2) + "," + this.field3219[arg0] + "," + this.field3228);
        }
        if (this.field3229) {
            this.field3225[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class175 var15 = new class175(var10);
            int[] var16 = new int[var3];
            var15.field2395 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2998();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2395 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2998();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3226) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class178.method557(var20[var26], false);
                }
            }
        } else if (this.field3226) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class178.method557(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ii.g(Ljava/lang/String;I)I")
    public int method3840(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3218.method3337(class272.method1462(var2));
    }

    @ObfuscatedName("ii.w(ILjava/lang/String;S)I")
    public int method3841(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3224[arg0].method3337(class272.method1462(var3));
    }

    @ObfuscatedName("ii.ar(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3887(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3218.method3337(class272.method1462(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3224[var5].method3337(class272.method1462(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ii.ax(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3843(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3218.method3337(class272.method1462(var3));
        int var6 = this.field3224[var5].method3337(class272.method1462(var4));
        return this.method3824(var5, var6);
    }

    @ObfuscatedName("ii.al(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3844(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3218.method3337(class272.method1462(var3));
        int var6 = this.field3224[var5].method3337(class272.method1462(var4));
        return this.method3826(var5, var6);
    }

    @ObfuscatedName("ii.ag(Ljava/lang/String;I)Z")
    public boolean method3861(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3218.method3337(class272.method1462(var2));
        return this.method3853(var3);
    }

    @ObfuscatedName("ii.ad(Ljava/lang/String;I)V")
    public void method3846(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3218.method3337(class272.method1462(var2));
        if (var3 >= 0) {
            this.method3823(var3);
        }
    }

    @ObfuscatedName("ii.ab(Ljava/lang/String;I)I")
    public int method3847(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3218.method3337(class272.method1462(var2));
        return this.method3845(var3);
    }

    @ObfuscatedName("fm.am([BS)[B")
    public static final byte[] method3205(byte[] arg0) {
        class175 var1 = new class175(arg0);
        int var2 = var1.method2999();
        int var3 = var1.method2998();
        if (var3 < 0 || !(field3231 == 0 || var3 <= field3231)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3005(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2998();
            if (var5 < 0 || field3231 != 0 && var5 > field3231) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class169.method2926(var6, var5, arg0, var3, 9);
            } else {
                field3227.method2920(var1, var6);
            }
            return var6;
        }
    }
}
