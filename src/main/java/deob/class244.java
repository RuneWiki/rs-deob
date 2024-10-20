package deob;

@ObfuscatedName("ic")
public abstract class class244 {

    @ObfuscatedName("ic.k")
    public int field3161;

    @ObfuscatedName("ic.s")
    public int[] field3162;

    @ObfuscatedName("ic.t")
    public int[] field3163;

    @ObfuscatedName("ic.i")
    public class345 field3170;

    @ObfuscatedName("ic.o")
    public int[] field3165;

    @ObfuscatedName("ic.x")
    public int[] field3166;

    @ObfuscatedName("ic.w")
    public int[] field3167;

    @ObfuscatedName("ic.g")
    public int[][] field3168;

    @ObfuscatedName("ic.m")
    public int[][] field3164;

    @ObfuscatedName("ic.n")
    public class345[] field3169;

    @ObfuscatedName("ic.d")
    public Object[] field3171;

    @ObfuscatedName("ic.h")
    public Object[][] field3173;

    @ObfuscatedName("ic.a")
    public static class344 field3160 = new class344();

    @ObfuscatedName("ic.q")
    public int field3172;

    @ObfuscatedName("ic.c")
    public boolean field3175;

    @ObfuscatedName("ic.f")
    public boolean field3176;

    @ObfuscatedName("ic.y")
    public static int field3177 = 0;

    public class244(boolean arg0, boolean arg1) {
        this.field3175 = arg0;
        this.field3176 = arg1;
    }

    @ObfuscatedName("ic.z([BI)V")
    public void method3871(byte[] arg0) {
        this.field3172 = class310.method964(arg0, arg0.length);
        class310 var2 = new class310(method751(arg0));
        int var3 = var2.method5193();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method5270();
        }
        int var4 = var2.method5193();
        if (var3 >= 7) {
            this.field3161 = var2.method5242();
        } else {
            this.field3161 = var2.method5195();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3162 = new int[this.field3161];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3161; var7++) {
                this.field3162[var7] = var5 += var2.method5242();
                if (this.field3162[var7] > var6) {
                    var6 = this.field3162[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3161; var8++) {
                this.field3162[var8] = var5 += var2.method5195();
                if (this.field3162[var8] > var6) {
                    var6 = this.field3162[var8];
                }
            }
        }
        this.field3165 = new int[var6 + 1];
        this.field3166 = new int[var6 + 1];
        this.field3167 = new int[var6 + 1];
        this.field3168 = new int[var6 + 1][];
        this.field3171 = new Object[var6 + 1];
        this.field3173 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3163 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3161; var9++) {
                this.field3163[this.field3162[var9]] = var2.method5270();
            }
            this.field3170 = new class345(this.field3163);
        }
        for (int var10 = 0; var10 < this.field3161; var10++) {
            this.field3165[this.field3162[var10]] = var2.method5270();
        }
        for (int var11 = 0; var11 < this.field3161; var11++) {
            this.field3166[this.field3162[var11]] = var2.method5270();
        }
        for (int var12 = 0; var12 < this.field3161; var12++) {
            this.field3167[this.field3162[var12]] = var2.method5195();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3161; var13++) {
                int var14 = this.field3162[var13];
                int var15 = this.field3167[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3168[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3168[var14][var18] = var16 += var2.method5242();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3173[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3161; var20++) {
                int var21 = this.field3162[var20];
                int var22 = this.field3167[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3168[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3168[var21][var25] = var23 += var2.method5195();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3173[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3164 = new int[var6 + 1][];
        this.field3169 = new class345[var6 + 1];
        for (int var27 = 0; var27 < this.field3161; var27++) {
            int var28 = this.field3162[var27];
            int var29 = this.field3167[var28];
            this.field3164[var28] = new int[this.field3173[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3164[var28][this.field3168[var28][var30]] = var2.method5270();
            }
            this.field3169[var28] = new class345(this.field3164[var28]);
        }
    }

    @ObfuscatedName("ic.k(II)V")
    public void method3872(int arg0) {
    }

    @ObfuscatedName("ic.s(III)[B")
    public byte[] method3873(int arg0, int arg1) {
        return this.method3874(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ic.t(II[II)[B")
    public byte[] method3874(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3173.length || this.field3173[arg0] == null || arg1 < 0 || arg1 >= this.field3173[arg0].length) {
            return null;
        }
        if (this.field3173[arg0][arg1] == null) {
            boolean var4 = this.method3889(arg0, arg2);
            if (!var4) {
                this.method3882(arg0);
                boolean var5 = this.method3889(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class215.method2137(this.field3173[arg0][arg1], false);
        if (this.field3176) {
            this.field3173[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ic.i(IIB)Z")
    public boolean method3883(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3173.length || this.field3173[arg0] == null || arg1 < 0 || arg1 >= this.field3173[arg0].length) {
            return false;
        } else if (this.field3173[arg0][arg1] != null) {
            return true;
        } else if (this.field3171[arg0] == null) {
            this.method3882(arg0);
            return this.field3171[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ic.o(IB)Z")
    public boolean method3887(int arg0) {
        if (this.field3173.length == 1) {
            return this.method3883(0, arg0);
        } else if (this.field3173[arg0].length == 1) {
            return this.method3883(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ic.x(II)Z")
    public boolean method3876(int arg0) {
        if (this.field3171[arg0] == null) {
            this.method3882(arg0);
            return this.field3171[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ic.w(I)Z")
    public boolean method3877() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3162.length; var2++) {
            int var3 = this.field3162[var2];
            if (this.field3171[var3] == null) {
                this.method3882(var3);
                if (this.field3171[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ic.g(II)I")
    public int method3878(int arg0) {
        return this.field3171[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ic.m(II)[B")
    public byte[] method3879(int arg0) {
        if (this.field3173.length == 1) {
            return this.method3873(0, arg0);
        } else if (this.field3173[arg0].length == 1) {
            return this.method3873(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ic.n(III)[B")
    public byte[] method3918(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3173.length || this.field3173[arg0] == null || arg1 < 0 || arg1 >= this.field3173[arg0].length) {
            return null;
        }
        if (this.field3173[arg0][arg1] == null) {
            boolean var3 = this.method3889(arg0, (int[]) null);
            if (!var3) {
                this.method3882(arg0);
                boolean var4 = this.method3889(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class215.method2137(this.field3173[arg0][arg1], false);
    }

    @ObfuscatedName("ic.d(IB)[B")
    public byte[] method3928(int arg0) {
        if (this.field3173.length == 1) {
            return this.method3918(0, arg0);
        } else if (this.field3173[arg0].length == 1) {
            return this.method3918(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ic.h(II)V")
    public void method3882(int arg0) {
    }

    @ObfuscatedName("ic.a(IB)[I")
    public int[] method3952(int arg0) {
        return arg0 >= 0 && arg0 < this.field3168.length ? this.field3168[arg0] : null;
    }

    @ObfuscatedName("ic.q(II)I")
    public int method3884(int arg0) {
        return this.field3173[arg0].length;
    }

    @ObfuscatedName("ic.c(I)I")
    public int method3885() {
        return this.field3173.length;
    }

    @ObfuscatedName("ic.j(I)V")
    public void method3943() {
        for (int var1 = 0; var1 < this.field3171.length; var1++) {
            this.field3171[var1] = null;
        }
    }

    @ObfuscatedName("ic.r(II)V")
    public void method3961(int arg0) {
        for (int var2 = 0; var2 < this.field3173[arg0].length; var2++) {
            this.field3173[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ic.u(B)V")
    public void method3888() {
        for (int var1 = 0; var1 < this.field3173.length; var1++) {
            if (this.field3173[var1] != null) {
                for (int var2 = 0; var2 < this.field3173[var1].length; var2++) {
                    this.field3173[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ic.p(I[II)Z")
    public boolean method3889(int arg0, int[] arg1) {
        if (this.field3171[arg0] == null) {
            return false;
        }
        int var3 = this.field3167[arg0];
        int[] var4 = this.field3168[arg0];
        Object[] var5 = this.field3173[arg0];
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
            var8 = class215.method2137(this.field3171[arg0], true);
            class310 var9 = new class310(var8);
            var9.method5281(arg1, 5, var9.field3731.length);
        } else {
            var8 = class215.method2137(this.field3171[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method751(var8);
        } catch (RuntimeException var27) {
            throw class351.method233(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class310.method964(var8, var8.length) + "," + class310.method964(var8, var8.length - 2) + "," + this.field3165[arg0] + "," + this.field3172);
        }
        if (this.field3175) {
            this.field3171[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class310 var15 = new class310(var10);
            int[] var16 = new int[var3];
            var15.field3734 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method5270();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field3734 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method5270();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3176) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class215.method1964(var20[var26], false);
                }
            }
        } else if (this.field3176) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class215.method1964(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ic.b(Ljava/lang/String;I)I")
    public int method3909(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3170.method6144(class301.method4729(var2));
    }

    @ObfuscatedName("ic.l(ILjava/lang/String;B)I")
    public int method3927(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3169[arg0].method6144(class301.method4729(var3));
    }

    @ObfuscatedName("ic.e(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3892(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3170.method6144(class301.method4729(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3169[var5].method6144(class301.method4729(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ic.ab(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3893(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3170.method6144(class301.method4729(var3));
        int var6 = this.field3169[var5].method6144(class301.method4729(var4));
        return this.method3873(var5, var6);
    }

    @ObfuscatedName("ic.ag(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3895(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3170.method6144(class301.method4729(var3));
        int var6 = this.field3169[var5].method6144(class301.method4729(var4));
        return this.method3883(var5, var6);
    }

    @ObfuscatedName("ic.ao(Ljava/lang/String;I)Z")
    public boolean method3903(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3170.method6144(class301.method4729(var2));
        return this.method3876(var3);
    }

    @ObfuscatedName("ic.ae(Ljava/lang/String;I)V")
    public void method3896(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3170.method6144(class301.method4729(var2));
        if (var3 >= 0) {
            this.method3872(var3);
        }
    }

    @ObfuscatedName("ic.ap(Ljava/lang/String;I)I")
    public int method3897(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3170.method6144(class301.method4729(var2));
        return this.method3878(var3);
    }

    @ObfuscatedName("bj.au([BI)[B")
    public static final byte[] method751(byte[] arg0) {
        class310 var1 = new class310(arg0);
        int var2 = var1.method5193();
        int var3 = var1.method5270();
        if (var3 < 0 || !(field3177 == 0 || var3 <= field3177)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5205(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5270();
            if (var5 < 0 || field3177 != 0 && var5 > field3177) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class314.method5470(var6, var5, arg0, var3, 9);
            } else {
                field3160.method6139(var1, var6);
            }
            return var6;
        }
    }
}
