package deob;

@ObfuscatedName("iw")
public abstract class class245 {

    @ObfuscatedName("iw.b")
    public int field3158;

    @ObfuscatedName("iw.l")
    public int[] field3159;

    @ObfuscatedName("iw.m")
    public int[] field3160;

    @ObfuscatedName("iw.z")
    public class346 field3169;

    @ObfuscatedName("iw.q")
    public int[] field3162;

    @ObfuscatedName("iw.k")
    public int[] field3163;

    @ObfuscatedName("iw.c")
    public int[] field3173;

    @ObfuscatedName("iw.u")
    public int[][] field3165;

    @ObfuscatedName("iw.t")
    public int[][] field3166;

    @ObfuscatedName("iw.e")
    public class346[] field3167;

    @ObfuscatedName("iw.o")
    public Object[] field3168;

    @ObfuscatedName("iw.n")
    public Object[][] field3170;

    @ObfuscatedName("iw.x")
    public static class345 field3157 = new class345();

    @ObfuscatedName("iw.p")
    public int field3171;

    @ObfuscatedName("iw.r")
    public boolean field3172;

    @ObfuscatedName("iw.y")
    public boolean field3164;

    @ObfuscatedName("iw.s")
    public static int field3174 = 0;

    public class245(boolean arg0, boolean arg1) {
        this.field3172 = arg0;
        this.field3164 = arg1;
    }

    @ObfuscatedName("iw.f([BI)V")
    public void method3960(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class311.method58(arg0, 0, var2);
        this.field3171 = var3;
        class311 var4 = new class311(method3249(arg0));
        int var5 = var4.method5276();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method5330();
        }
        int var6 = var4.method5276();
        if (var5 >= 7) {
            this.field3158 = var4.method5196();
        } else {
            this.field3158 = var4.method5163();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3159 = new int[this.field3158];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3158; var9++) {
                this.field3159[var9] = var7 += var4.method5196();
                if (this.field3159[var9] > var8) {
                    var8 = this.field3159[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3158; var10++) {
                this.field3159[var10] = var7 += var4.method5163();
                if (this.field3159[var10] > var8) {
                    var8 = this.field3159[var10];
                }
            }
        }
        this.field3162 = new int[var8 + 1];
        this.field3163 = new int[var8 + 1];
        this.field3173 = new int[var8 + 1];
        this.field3165 = new int[var8 + 1][];
        this.field3168 = new Object[var8 + 1];
        this.field3170 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3160 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3158; var11++) {
                this.field3160[this.field3159[var11]] = var4.method5330();
            }
            this.field3169 = new class346(this.field3160);
        }
        for (int var12 = 0; var12 < this.field3158; var12++) {
            this.field3162[this.field3159[var12]] = var4.method5330();
        }
        for (int var13 = 0; var13 < this.field3158; var13++) {
            this.field3163[this.field3159[var13]] = var4.method5330();
        }
        for (int var14 = 0; var14 < this.field3158; var14++) {
            this.field3173[this.field3159[var14]] = var4.method5163();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3158; var15++) {
                int var16 = this.field3159[var15];
                int var17 = this.field3173[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3165[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3165[var16][var20] = var18 += var4.method5196();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3170[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3158; var22++) {
                int var23 = this.field3159[var22];
                int var24 = this.field3173[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3165[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3165[var23][var27] = var25 += var4.method5163();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3170[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3166 = new int[var8 + 1][];
        this.field3167 = new class346[var8 + 1];
        for (int var29 = 0; var29 < this.field3158; var29++) {
            int var30 = this.field3159[var29];
            int var31 = this.field3173[var30];
            this.field3166[var30] = new int[this.field3170[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3166[var30][this.field3165[var30][var32]] = var4.method5330();
            }
            this.field3167[var30] = new class346(this.field3166[var30]);
        }
    }

    @ObfuscatedName("iw.b(II)V")
    public void method3904(int arg0) {
    }

    @ObfuscatedName("iw.l(III)[B")
    public byte[] method3905(int arg0, int arg1) {
        return this.method3917(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("iw.m(II[II)[B")
    public byte[] method3917(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3170.length || this.field3170[arg0] == null || arg1 < 0 || arg1 >= this.field3170[arg0].length) {
            return null;
        }
        if (this.field3170[arg0][arg1] == null) {
            boolean var4 = this.method3984(arg0, arg2);
            if (!var4) {
                this.method3915(arg0);
                boolean var5 = this.method3984(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class215.method3393(this.field3170[arg0][arg1], false);
        if (this.field3164) {
            this.field3170[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("iw.z(IIB)Z")
    public boolean method3902(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3170.length || this.field3170[arg0] == null || arg1 < 0 || arg1 >= this.field3170[arg0].length) {
            return false;
        } else if (this.field3170[arg0][arg1] != null) {
            return true;
        } else if (this.field3168[arg0] == null) {
            this.method3915(arg0);
            return this.field3168[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iw.q(II)Z")
    public boolean method3908(int arg0) {
        if (this.field3170.length == 1) {
            return this.method3902(0, arg0);
        } else if (this.field3170[arg0].length == 1) {
            return this.method3902(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iw.k(II)Z")
    public boolean method3909(int arg0) {
        if (this.field3168[arg0] == null) {
            this.method3915(arg0);
            return this.field3168[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iw.c(I)Z")
    public boolean method3910() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3159.length; var2++) {
            int var3 = this.field3159[var2];
            if (this.field3168[var3] == null) {
                this.method3915(var3);
                if (this.field3168[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("iw.u(II)I")
    public int method3911(int arg0) {
        return this.field3168[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("iw.t(II)[B")
    public byte[] method3912(int arg0) {
        if (this.field3170.length == 1) {
            return this.method3905(0, arg0);
        } else if (this.field3170[arg0].length == 1) {
            return this.method3905(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iw.e(III)[B")
    public byte[] method3913(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3170.length || this.field3170[arg0] == null || arg1 < 0 || arg1 >= this.field3170[arg0].length) {
            return null;
        }
        if (this.field3170[arg0][arg1] == null) {
            boolean var3 = this.method3984(arg0, (int[]) null);
            if (!var3) {
                this.method3915(arg0);
                boolean var4 = this.method3984(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class215.method3393(this.field3170[arg0][arg1], false);
    }

    @ObfuscatedName("iw.o(II)[B")
    public byte[] method3914(int arg0) {
        if (this.field3170.length == 1) {
            return this.method3913(0, arg0);
        } else if (this.field3170[arg0].length == 1) {
            return this.method3913(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iw.n(II)V")
    public void method3915(int arg0) {
    }

    @ObfuscatedName("iw.x(IS)[I")
    public int[] method3962(int arg0) {
        return arg0 >= 0 && arg0 < this.field3165.length ? this.field3165[arg0] : null;
    }

    @ObfuscatedName("iw.p(IB)I")
    public int method3963(int arg0) {
        return this.field3170[arg0].length;
    }

    @ObfuscatedName("iw.r(I)I")
    public int method3918() {
        return this.field3170.length;
    }

    @ObfuscatedName("iw.y(I)V")
    public void method3919() {
        for (int var1 = 0; var1 < this.field3168.length; var1++) {
            this.field3168[var1] = null;
        }
    }

    @ObfuscatedName("iw.s(II)V")
    public void method3989(int arg0) {
        for (int var2 = 0; var2 < this.field3170[arg0].length; var2++) {
            this.field3170[arg0][var2] = null;
        }
    }

    @ObfuscatedName("iw.j(B)V")
    public void method3935() {
        for (int var1 = 0; var1 < this.field3170.length; var1++) {
            if (this.field3170[var1] != null) {
                for (int var2 = 0; var2 < this.field3170[var1].length; var2++) {
                    this.field3170[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("iw.d(I[II)Z")
    public boolean method3984(int arg0, int[] arg1) {
        if (this.field3168[arg0] == null) {
            return false;
        }
        int var3 = this.field3173[arg0];
        int[] var4 = this.field3165[arg0];
        Object[] var5 = this.field3170[arg0];
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
            var8 = class215.method3393(this.field3168[arg0], true);
            class311 var9 = new class311(var8);
            var9.method5167(arg1, 5, var9.field3742.length);
        } else {
            var8 = class215.method3393(this.field3168[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3249(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class311.method58(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class311.method58(var8, 0, var17);
            throw class352.method2012(var34, var16 + var18 + "," + this.field3162[arg0] + "," + this.field3171);
        }
        if (this.field3172) {
            this.field3168[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class311 var22 = new class311(var10);
            int[] var23 = new int[var3];
            var22.field3741 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method5330();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field3741 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method5330();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field3164) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class215.method3699(var27[var33], false);
                }
            }
        } else if (this.field3164) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class215.method3699(var10, false);
        }
        return true;
    }

    @ObfuscatedName("iw.a(Ljava/lang/String;I)I")
    public int method3923(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3169.method6133(class302.method3145(var2));
    }

    @ObfuscatedName("iw.g(ILjava/lang/String;I)I")
    public int method3924(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3167[arg0].method6133(class302.method3145(var3));
    }

    @ObfuscatedName("iw.h(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3929(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3169.method6133(class302.method3145(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3167[var5].method6133(class302.method3145(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("iw.ab(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3938(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3169.method6133(class302.method3145(var3));
        int var6 = this.field3167[var5].method6133(class302.method3145(var4));
        return this.method3905(var5, var6);
    }

    @ObfuscatedName("iw.ac(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3927(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3169.method6133(class302.method3145(var3));
        int var6 = this.field3167[var5].method6133(class302.method3145(var4));
        return this.method3902(var5, var6);
    }

    @ObfuscatedName("iw.ao(Ljava/lang/String;B)Z")
    public boolean method3928(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3169.method6133(class302.method3145(var2));
        return this.method3909(var3);
    }

    @ObfuscatedName("iw.af(Ljava/lang/String;I)V")
    public void method3922(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3169.method6133(class302.method3145(var2));
        if (var3 >= 0) {
            this.method3904(var3);
        }
    }

    @ObfuscatedName("iw.av(Ljava/lang/String;I)I")
    public int method3951(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3169.method6133(class302.method3145(var2));
        return this.method3911(var3);
    }

    @ObfuscatedName("fk.ar([BI)[B")
    public static final byte[] method3249(byte[] arg0) {
        class311 var1 = new class311(arg0);
        int var2 = var1.method5276();
        int var3 = var1.method5330();
        if (var3 < 0 || !(field3174 == 0 || var3 <= field3174)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5243(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5330();
            if (var5 < 0 || field3174 != 0 && var5 > field3174) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class315.method5454(var6, var5, arg0, var3, 9);
            } else {
                field3157.method6127(var1, var6);
            }
            return var6;
        }
    }
}
