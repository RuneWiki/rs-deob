package deob;

@ObfuscatedName("iy")
public abstract class class236 {

    @ObfuscatedName("iy.i")
    public int field3214;

    @ObfuscatedName("iy.h")
    public int[] field3215;

    @ObfuscatedName("iy.u")
    public int[] field3207;

    @ObfuscatedName("iy.q")
    public class188 field3222;

    @ObfuscatedName("iy.g")
    public int[] field3208;

    @ObfuscatedName("iy.v")
    public int[] field3209;

    @ObfuscatedName("iy.t")
    public int[] field3220;

    @ObfuscatedName("iy.p")
    public int[][] field3211;

    @ObfuscatedName("iy.l")
    public int[][] field3212;

    @ObfuscatedName("iy.a")
    public class188[] field3213;

    @ObfuscatedName("iy.k")
    public Object[] field3210;

    @ObfuscatedName("iy.r")
    public Object[][] field3204;

    @ObfuscatedName("iy.b")
    public static class167 field3216 = new class167();

    @ObfuscatedName("iy.x")
    public int field3217;

    @ObfuscatedName("iy.o")
    public boolean field3218;

    @ObfuscatedName("iy.j")
    public boolean field3206;

    @ObfuscatedName("iy.m")
    public static int field3219 = 0;

    public class236(boolean arg0, boolean arg1) {
        this.field3218 = arg0;
        this.field3206 = arg1;
    }

    @ObfuscatedName("iy.i([BI)V")
    public void method3834(byte[] arg0) {
        this.field3217 = class174.method3818(arg0, arg0.length);
        class174 var2 = new class174(method151(arg0));
        int var3 = var2.method2930();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2927();
        }
        int var4 = var2.method2930();
        if (var3 >= 7) {
            this.field3214 = var2.method3122();
        } else {
            this.field3214 = var2.method2932();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3215 = new int[this.field3214];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3214; var7++) {
                this.field3215[var7] = var5 += var2.method3122();
                if (this.field3215[var7] > var6) {
                    var6 = this.field3215[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3214; var8++) {
                this.field3215[var8] = var5 += var2.method2932();
                if (this.field3215[var8] > var6) {
                    var6 = this.field3215[var8];
                }
            }
        }
        this.field3208 = new int[var6 + 1];
        this.field3209 = new int[var6 + 1];
        this.field3220 = new int[var6 + 1];
        this.field3211 = new int[var6 + 1][];
        this.field3210 = new Object[var6 + 1];
        this.field3204 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3207 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3214; var9++) {
                this.field3207[this.field3215[var9]] = var2.method2927();
            }
            this.field3222 = new class188(this.field3207);
        }
        for (int var10 = 0; var10 < this.field3214; var10++) {
            this.field3208[this.field3215[var10]] = var2.method2927();
        }
        for (int var11 = 0; var11 < this.field3214; var11++) {
            this.field3209[this.field3215[var11]] = var2.method2927();
        }
        for (int var12 = 0; var12 < this.field3214; var12++) {
            this.field3220[this.field3215[var12]] = var2.method2932();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3214; var13++) {
                int var14 = this.field3215[var13];
                int var15 = this.field3220[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3211[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3211[var14][var18] = var16 += var2.method3122();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3204[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3214; var20++) {
                int var21 = this.field3215[var20];
                int var22 = this.field3220[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3211[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3211[var21][var25] = var23 += var2.method2932();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3204[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3212 = new int[var6 + 1][];
        this.field3213 = new class188[var6 + 1];
        for (int var27 = 0; var27 < this.field3214; var27++) {
            int var28 = this.field3215[var27];
            int var29 = this.field3220[var28];
            this.field3212[var28] = new int[this.field3204[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3212[var28][this.field3211[var28][var30]] = var2.method2927();
            }
            this.field3213[var28] = new class188(this.field3212[var28]);
        }
    }

    @ObfuscatedName("iy.h(IB)V")
    public void method3835(int arg0) {
    }

    @ObfuscatedName("iy.u(IIB)[B")
    public byte[] method3836(int arg0, int arg1) {
        return this.method3837(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("iy.q(II[II)[B")
    public byte[] method3837(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3204.length || this.field3204[arg0] == null || arg1 < 0 || arg1 >= this.field3204[arg0].length) {
            return null;
        }
        if (this.field3204[arg0][arg1] == null) {
            boolean var4 = this.method3857(arg0, arg2);
            if (!var4) {
                this.method3844(arg0);
                boolean var5 = this.method3857(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = Statics.method2807(this.field3204[arg0][arg1], false);
        if (this.field3206) {
            this.field3204[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("iy.g(III)Z")
    public boolean method3838(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3204.length || this.field3204[arg0] == null || arg1 < 0 || arg1 >= this.field3204[arg0].length) {
            return false;
        } else if (this.field3204[arg0][arg1] != null) {
            return true;
        } else if (this.field3210[arg0] == null) {
            this.method3844(arg0);
            return this.field3210[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iy.v(II)Z")
    public boolean method3879(int arg0) {
        if (this.field3210[arg0] == null) {
            this.method3844(arg0);
            return this.field3210[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iy.t(B)Z")
    public boolean method3840() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3215.length; var2++) {
            int var3 = this.field3215[var2];
            if (this.field3210[var3] == null) {
                this.method3844(var3);
                if (this.field3210[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("iy.p(II)I")
    public int method3862(int arg0) {
        return this.field3210[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("iy.l(II)[B")
    public byte[] method3842(int arg0) {
        if (this.field3204.length == 1) {
            return this.method3836(0, arg0);
        } else if (this.field3204[arg0].length == 1) {
            return this.method3836(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iy.a(III)[B")
    public byte[] method3927(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3204.length || this.field3204[arg0] == null || arg1 < 0 || arg1 >= this.field3204[arg0].length) {
            return null;
        }
        if (this.field3204[arg0][arg1] == null) {
            boolean var3 = this.method3857(arg0, (int[]) null);
            if (!var3) {
                this.method3844(arg0);
                boolean var4 = this.method3857(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return Statics.method2807(this.field3204[arg0][arg1], false);
    }

    @ObfuscatedName("iy.k(IB)[B")
    public byte[] method3843(int arg0) {
        if (this.field3204.length == 1) {
            return this.method3927(0, arg0);
        } else if (this.field3204[arg0].length == 1) {
            return this.method3927(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iy.b(II)V")
    public void method3844(int arg0) {
    }

    @ObfuscatedName("iy.x(IB)[I")
    public int[] method3845(int arg0) {
        return this.field3211[arg0];
    }

    @ObfuscatedName("iy.o(II)I")
    public int method3846(int arg0) {
        return this.field3204[arg0].length;
    }

    @ObfuscatedName("iy.j(B)I")
    public int method3885() {
        return this.field3204.length;
    }

    @ObfuscatedName("iy.m(II)V")
    public void method3848(int arg0) {
        for (int var2 = 0; var2 < this.field3204[arg0].length; var2++) {
            this.field3204[arg0][var2] = null;
        }
    }

    @ObfuscatedName("iy.s(I)V")
    public void method3849() {
        for (int var1 = 0; var1 < this.field3204.length; var1++) {
            if (this.field3204[var1] != null) {
                for (int var2 = 0; var2 < this.field3204[var1].length; var2++) {
                    this.field3204[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("iy.n(I[IS)Z")
    public boolean method3857(int arg0, int[] arg1) {
        if (this.field3210[arg0] == null) {
            return false;
        }
        int var3 = this.field3220[arg0];
        int[] var4 = this.field3211[arg0];
        Object[] var5 = this.field3204[arg0];
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
            var8 = Statics.method2807(this.field3210[arg0], true);
            class174 var9 = new class174(var8);
            var9.method3044(arg1, 5, var9.field2387.length);
        } else {
            var8 = Statics.method2807(this.field3210[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method151(var8);
        } catch (RuntimeException var27) {
            throw class153.method237(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class174.method3818(var8, var8.length) + "," + class174.method3818(var8, var8.length - 2) + "," + this.field3208[arg0] + "," + this.field3217);
        }
        if (this.field3218) {
            this.field3210[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class174 var15 = new class174(var10);
            int[] var16 = new int[var3];
            var15.field2384 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2927();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2384 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2927();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3206) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class177.method488(var20[var26], false);
                }
            }
        } else if (this.field3206) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class177.method488(var10, false);
        }
        return true;
    }

    @ObfuscatedName("iy.y(Ljava/lang/String;B)I")
    public int method3851(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3222.method3294(class271.method2151(var2));
    }

    @ObfuscatedName("iy.w(ILjava/lang/String;I)I")
    public int method3852(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3213[arg0].method3294(class271.method2151(var3));
    }

    @ObfuscatedName("iy.f(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3853(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3222.method3294(class271.method2151(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3213[var5].method3294(class271.method2151(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("iy.c(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3854(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3222.method3294(class271.method2151(var3));
        int var6 = this.field3213[var5].method3294(class271.method2151(var4));
        return this.method3836(var5, var6);
    }

    @ObfuscatedName("iy.z(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method3855(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3222.method3294(class271.method2151(var3));
        int var6 = this.field3213[var5].method3294(class271.method2151(var4));
        return this.method3838(var5, var6);
    }

    @ObfuscatedName("iy.ay(Ljava/lang/String;B)Z")
    public boolean method3887(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3222.method3294(class271.method2151(var2));
        return this.method3879(var3);
    }

    @ObfuscatedName("iy.ah(Ljava/lang/String;I)V")
    public void method3897(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3222.method3294(class271.method2151(var2));
        if (var3 >= 0) {
            this.method3835(var3);
        }
    }

    @ObfuscatedName("iy.az(Ljava/lang/String;I)I")
    public int method3858(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3222.method3294(class271.method2151(var2));
        return this.method3862(var3);
    }

    @ObfuscatedName("w.ac([BI)[B")
    public static final byte[] method151(byte[] arg0) {
        class174 var1 = new class174(arg0);
        int var2 = var1.method2930();
        int var3 = var1.method2927();
        if (var3 < 0 || !(field3219 == 0 || var3 <= field3219)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2941(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2927();
            if (var5 < 0 || field3219 != 0 && var5 > field3219) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class168.method2889(var6, var5, arg0, var3, 9);
            } else {
                field3216.method2858(var1, var6);
            }
            return var6;
        }
    }
}
