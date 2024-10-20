package deob;

@ObfuscatedName("jf")
public abstract class class262 {

    @ObfuscatedName("jf.k")
    public int field3378;

    @ObfuscatedName("jf.t")
    public int[] field3379;

    @ObfuscatedName("jf.d")
    public int[] field3377;

    @ObfuscatedName("jf.h")
    public class211 field3382;

    @ObfuscatedName("jf.m")
    public int[] field3385;

    @ObfuscatedName("jf.z")
    public int[] field3390;

    @ObfuscatedName("jf.i")
    public int[] field3384;

    @ObfuscatedName("jf.u")
    public int[][] field3393;

    @ObfuscatedName("jf.x")
    public int[][] field3386;

    @ObfuscatedName("jf.y")
    public class211[] field3383;

    @ObfuscatedName("jf.a")
    public Object[] field3388;

    @ObfuscatedName("jf.w")
    public Object[][] field3389;

    @ObfuscatedName("jf.n")
    public static class188 field3380 = new class188();

    @ObfuscatedName("jf.l")
    public int field3387;

    @ObfuscatedName("jf.s")
    public boolean field3392;

    @ObfuscatedName("jf.v")
    public boolean field3381;

    @ObfuscatedName("jf.q")
    public static int field3394 = 0;

    public class262(boolean arg0, boolean arg1) {
        this.field3392 = arg0;
        this.field3381 = arg1;
    }

    @ObfuscatedName("jf.o([BS)V")
    public void method4157(byte[] arg0) {
        this.field3387 = class195.method2869(arg0, arg0.length);
        class195 var2 = new class195(method220(arg0));
        int var3 = var2.method3205();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method3254();
        }
        int var4 = var2.method3205();
        if (var3 >= 7) {
            this.field3378 = var2.method3220();
        } else {
            this.field3378 = var2.method3207();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3379 = new int[this.field3378];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3378; var7++) {
                this.field3379[var7] = var5 += var2.method3220();
                if (this.field3379[var7] > var6) {
                    var6 = this.field3379[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3378; var8++) {
                this.field3379[var8] = var5 += var2.method3207();
                if (this.field3379[var8] > var6) {
                    var6 = this.field3379[var8];
                }
            }
        }
        this.field3385 = new int[var6 + 1];
        this.field3390 = new int[var6 + 1];
        this.field3384 = new int[var6 + 1];
        this.field3393 = new int[var6 + 1][];
        this.field3388 = new Object[var6 + 1];
        this.field3389 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3377 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3378; var9++) {
                this.field3377[this.field3379[var9]] = var2.method3254();
            }
            this.field3382 = new class211(this.field3377);
        }
        for (int var10 = 0; var10 < this.field3378; var10++) {
            this.field3385[this.field3379[var10]] = var2.method3254();
        }
        for (int var11 = 0; var11 < this.field3378; var11++) {
            this.field3390[this.field3379[var11]] = var2.method3254();
        }
        for (int var12 = 0; var12 < this.field3378; var12++) {
            this.field3384[this.field3379[var12]] = var2.method3207();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3378; var13++) {
                int var14 = this.field3379[var13];
                int var15 = this.field3384[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3393[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3393[var14][var18] = var16 += var2.method3220();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3389[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3378; var20++) {
                int var21 = this.field3379[var20];
                int var22 = this.field3384[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3393[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3393[var21][var25] = var23 += var2.method3207();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3389[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3386 = new int[var6 + 1][];
        this.field3383 = new class211[var6 + 1];
        for (int var27 = 0; var27 < this.field3378; var27++) {
            int var28 = this.field3379[var27];
            int var29 = this.field3384[var28];
            this.field3386[var28] = new int[this.field3389[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3386[var28][this.field3393[var28][var30]] = var2.method3254();
            }
            this.field3383[var28] = new class211(this.field3386[var28]);
        }
    }

    @ObfuscatedName("jf.k(IB)V")
    public void method4156(int arg0) {
    }

    @ObfuscatedName("jf.t(III)[B")
    public byte[] method4241(int arg0, int arg1) {
        return this.method4158(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("jf.d(II[II)[B")
    public byte[] method4158(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3389.length || this.field3389[arg0] == null || arg1 < 0 || arg1 >= this.field3389[arg0].length) {
            return null;
        }
        if (this.field3389[arg0][arg1] == null) {
            boolean var4 = this.method4174(arg0, arg2);
            if (!var4) {
                this.method4161(arg0);
                boolean var5 = this.method4174(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class199.method265(this.field3389[arg0][arg1], false);
        if (this.field3381) {
            this.field3389[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("jf.h(III)Z")
    public boolean method4159(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3389.length || this.field3389[arg0] == null || arg1 < 0 || arg1 >= this.field3389[arg0].length) {
            return false;
        } else if (this.field3389[arg0][arg1] != null) {
            return true;
        } else if (this.field3388[arg0] == null) {
            this.method4161(arg0);
            return this.field3388[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jf.m(II)Z")
    public boolean method4244(int arg0) {
        if (this.field3389.length == 1) {
            return this.method4159(0, arg0);
        } else if (this.field3389[arg0].length == 1) {
            return this.method4159(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jf.z(II)Z")
    public boolean method4236(int arg0) {
        if (this.field3388[arg0] == null) {
            this.method4161(arg0);
            return this.field3388[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jf.i(I)Z")
    public boolean method4253() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3379.length; var2++) {
            int var3 = this.field3379[var2];
            if (this.field3388[var3] == null) {
                this.method4161(var3);
                if (this.field3388[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("jf.u(II)I")
    public int method4163(int arg0) {
        return this.field3388[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("jf.x(IB)[B")
    public byte[] method4164(int arg0) {
        if (this.field3389.length == 1) {
            return this.method4241(0, arg0);
        } else if (this.field3389[arg0].length == 1) {
            return this.method4241(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jf.y(III)[B")
    public byte[] method4165(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3389.length || this.field3389[arg0] == null || arg1 < 0 || arg1 >= this.field3389[arg0].length) {
            return null;
        }
        if (this.field3389[arg0][arg1] == null) {
            boolean var3 = this.method4174(arg0, (int[]) null);
            if (!var3) {
                this.method4161(arg0);
                boolean var4 = this.method4174(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class199.method265(this.field3389[arg0][arg1], false);
    }

    @ObfuscatedName("jf.a(II)[B")
    public byte[] method4166(int arg0) {
        if (this.field3389.length == 1) {
            return this.method4165(0, arg0);
        } else if (this.field3389[arg0].length == 1) {
            return this.method4165(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jf.v(II)V")
    public void method4161(int arg0) {
    }

    @ObfuscatedName("jf.q(II)[I")
    public int[] method4168(int arg0) {
        return this.field3393[arg0];
    }

    @ObfuscatedName("jf.r(II)I")
    public int method4207(int arg0) {
        return this.field3389[arg0].length;
    }

    @ObfuscatedName("jf.j(I)I")
    public int method4191() {
        return this.field3389.length;
    }

    @ObfuscatedName("jf.b(I)V")
    public void method4195() {
        for (int var1 = 0; var1 < this.field3388.length; var1++) {
            this.field3388[var1] = null;
        }
    }

    @ObfuscatedName("jf.g(IB)V")
    public void method4172(int arg0) {
        for (int var2 = 0; var2 < this.field3389[arg0].length; var2++) {
            this.field3389[arg0][var2] = null;
        }
    }

    @ObfuscatedName("jf.f(I)V")
    public void method4173() {
        for (int var1 = 0; var1 < this.field3389.length; var1++) {
            if (this.field3389[var1] != null) {
                for (int var2 = 0; var2 < this.field3389[var1].length; var2++) {
                    this.field3389[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("jf.p(I[IB)Z")
    public boolean method4174(int arg0, int[] arg1) {
        if (this.field3388[arg0] == null) {
            return false;
        }
        int var3 = this.field3384[arg0];
        int[] var4 = this.field3393[arg0];
        Object[] var5 = this.field3389[arg0];
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
            var8 = class199.method265(this.field3388[arg0], true);
            class195 var9 = new class195(var8);
            var9.method3317(arg1, 5, var9.field2574.length);
        } else {
            var8 = class199.method265(this.field3388[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method220(var8);
        } catch (RuntimeException var27) {
            throw class165.method576(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class195.method2869(var8, var8.length) + "," + class195.method2869(var8, var8.length - 2) + "," + this.field3385[arg0] + "," + this.field3387);
        }
        if (this.field3392) {
            this.field3388[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class195 var15 = new class195(var10);
            int[] var16 = new int[var3];
            var15.field2575 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method3254();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2575 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method3254();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3381) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class199.method921(var20[var26], false);
                }
            }
        } else if (this.field3381) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class199.method921(var10, false);
        }
        return true;
    }

    @ObfuscatedName("jf.e(Ljava/lang/String;I)I")
    public int method4175(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3382.method3588(class319.method2550(var2));
    }

    @ObfuscatedName("jf.c(ILjava/lang/String;I)I")
    public int method4176(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3383[arg0].method3588(class319.method2550(var3));
    }

    @ObfuscatedName("jf.ag(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4228(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3382.method3588(class319.method2550(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3383[var5].method3588(class319.method2550(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("jf.at(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4178(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3382.method3588(class319.method2550(var3));
        int var6 = this.field3383[var5].method3588(class319.method2550(var4));
        return this.method4241(var5, var6);
    }

    @ObfuscatedName("jf.ac(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4179(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3382.method3588(class319.method2550(var3));
        int var6 = this.field3383[var5].method3588(class319.method2550(var4));
        return this.method4159(var5, var6);
    }

    @ObfuscatedName("jf.al(Ljava/lang/String;I)Z")
    public boolean method4180(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3382.method3588(class319.method2550(var2));
        return this.method4236(var3);
    }

    @ObfuscatedName("jf.ah(Ljava/lang/String;I)V")
    public void method4181(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3382.method3588(class319.method2550(var2));
        if (var3 >= 0) {
            this.method4156(var3);
        }
    }

    @ObfuscatedName("jf.af(Ljava/lang/String;B)I")
    public int method4182(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3382.method3588(class319.method2550(var2));
        return this.method4163(var3);
    }

    @ObfuscatedName("ab.aq([BB)[B")
    public static final byte[] method220(byte[] arg0) {
        class195 var1 = new class195(arg0);
        int var2 = var1.method3205();
        int var3 = var1.method3254();
        if (var3 < 0 || !(field3394 == 0 || var3 <= field3394)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3217(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3254();
            if (var5 < 0 || field3394 != 0 && var5 > field3394) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class189.method3161(var6, var5, arg0, var3, 9);
            } else {
                field3380.method3147(var1, var6);
            }
            return var6;
        }
    }
}
