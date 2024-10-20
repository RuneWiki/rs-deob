package deob;

@ObfuscatedName("is")
public abstract class class236 {

    @ObfuscatedName("is.n")
    public int field3223;

    @ObfuscatedName("is.p")
    public int[] field3217;

    @ObfuscatedName("is.i")
    public int[] field3218;

    @ObfuscatedName("is.j")
    public class188 field3219;

    @ObfuscatedName("is.f")
    public int[] field3220;

    @ObfuscatedName("is.m")
    public int[] field3221;

    @ObfuscatedName("is.c")
    public int[] field3222;

    @ObfuscatedName("is.z")
    public int[][] field3232;

    @ObfuscatedName("is.h")
    public int[][] field3216;

    @ObfuscatedName("is.g")
    public class188[] field3225;

    @ObfuscatedName("is.e")
    public Object[] field3226;

    @ObfuscatedName("is.o")
    public Object[][] field3224;

    @ObfuscatedName("is.x")
    public static class167 field3228 = new class167();

    @ObfuscatedName("is.a")
    public int field3229;

    @ObfuscatedName("is.y")
    public boolean field3227;

    @ObfuscatedName("is.r")
    public boolean field3231;

    @ObfuscatedName("is.b")
    public static int field3230 = 0;

    public class236(boolean arg0, boolean arg1) {
        this.field3227 = arg0;
        this.field3231 = arg1;
    }

    @ObfuscatedName("is.n([BI)V")
    public void method3893(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class174.method1924(arg0, 0, var2);
        this.field3229 = var3;
        class174 var4 = new class174(method1375(arg0));
        int var5 = var4.method2925();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method3058();
        }
        int var6 = var4.method2925();
        if (var5 >= 7) {
            this.field3223 = var4.method2941();
        } else {
            this.field3223 = var4.method3065();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3217 = new int[this.field3223];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3223; var9++) {
                this.field3217[var9] = var7 += var4.method2941();
                if (this.field3217[var9] > var8) {
                    var8 = this.field3217[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3223; var10++) {
                this.field3217[var10] = var7 += var4.method3065();
                if (this.field3217[var10] > var8) {
                    var8 = this.field3217[var10];
                }
            }
        }
        this.field3220 = new int[var8 + 1];
        this.field3221 = new int[var8 + 1];
        this.field3222 = new int[var8 + 1];
        this.field3232 = new int[var8 + 1][];
        this.field3226 = new Object[var8 + 1];
        this.field3224 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3218 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3223; var11++) {
                this.field3218[this.field3217[var11]] = var4.method3058();
            }
            this.field3219 = new class188(this.field3218);
        }
        for (int var12 = 0; var12 < this.field3223; var12++) {
            this.field3220[this.field3217[var12]] = var4.method3058();
        }
        for (int var13 = 0; var13 < this.field3223; var13++) {
            this.field3221[this.field3217[var13]] = var4.method3058();
        }
        for (int var14 = 0; var14 < this.field3223; var14++) {
            this.field3222[this.field3217[var14]] = var4.method3065();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3223; var15++) {
                int var16 = this.field3217[var15];
                int var17 = this.field3222[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3232[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3232[var16][var20] = var18 += var4.method2941();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3224[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3223; var22++) {
                int var23 = this.field3217[var22];
                int var24 = this.field3222[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3232[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3232[var23][var27] = var25 += var4.method3065();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3224[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3216 = new int[var8 + 1][];
        this.field3225 = new class188[var8 + 1];
        for (int var29 = 0; var29 < this.field3223; var29++) {
            int var30 = this.field3217[var29];
            int var31 = this.field3222[var30];
            this.field3216[var30] = new int[this.field3224[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3216[var30][this.field3232[var30][var32]] = var4.method3058();
            }
            this.field3225[var30] = new class188(this.field3216[var30]);
        }
    }

    @ObfuscatedName("is.p(II)V")
    public void method3829(int arg0) {
    }

    @ObfuscatedName("is.i(III)[B")
    public byte[] method3880(int arg0, int arg1) {
        return this.method3831(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("is.j(II[II)[B")
    public byte[] method3831(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3224.length || this.field3224[arg0] == null || arg1 < 0 || arg1 >= this.field3224[arg0].length) {
            return null;
        }
        if (this.field3224[arg0][arg1] == null) {
            boolean var4 = this.method3845(arg0, arg2);
            if (!var4) {
                this.method3839(arg0);
                boolean var5 = this.method3845(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class177.method4060(this.field3224[arg0][arg1], false);
        if (this.field3231) {
            this.field3224[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("is.f(III)Z")
    public boolean method3832(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3224.length || this.field3224[arg0] == null || arg1 < 0 || arg1 >= this.field3224[arg0].length) {
            return false;
        } else if (this.field3224[arg0][arg1] != null) {
            return true;
        } else if (this.field3226[arg0] == null) {
            this.method3839(arg0);
            return this.field3226[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("is.m(II)Z")
    public boolean method3833(int arg0) {
        if (this.field3226[arg0] == null) {
            this.method3839(arg0);
            return this.field3226[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("is.c(I)Z")
    public boolean method3902() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3217.length; var2++) {
            int var3 = this.field3217[var2];
            if (this.field3226[var3] == null) {
                this.method3839(var3);
                if (this.field3226[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("is.z(IB)I")
    public int method3835(int arg0) {
        return this.field3226[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("is.h(II)[B")
    public byte[] method3836(int arg0) {
        if (this.field3224.length == 1) {
            return this.method3880(0, arg0);
        } else if (this.field3224[arg0].length == 1) {
            return this.method3880(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("is.g(III)[B")
    public byte[] method3854(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3224.length || this.field3224[arg0] == null || arg1 < 0 || arg1 >= this.field3224[arg0].length) {
            return null;
        }
        if (this.field3224[arg0][arg1] == null) {
            boolean var3 = this.method3845(arg0, (int[]) null);
            if (!var3) {
                this.method3839(arg0);
                boolean var4 = this.method3845(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class177.method4060(this.field3224[arg0][arg1], false);
    }

    @ObfuscatedName("is.e(IB)[B")
    public byte[] method3838(int arg0) {
        if (this.field3224.length == 1) {
            return this.method3854(0, arg0);
        } else if (this.field3224[arg0].length == 1) {
            return this.method3854(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("is.o(II)V")
    public void method3839(int arg0) {
    }

    @ObfuscatedName("is.x(IB)[I")
    public int[] method3861(int arg0) {
        return this.field3232[arg0];
    }

    @ObfuscatedName("is.a(II)I")
    public int method3879(int arg0) {
        return this.field3224[arg0].length;
    }

    @ObfuscatedName("is.y(B)I")
    public int method3920() {
        return this.field3224.length;
    }

    @ObfuscatedName("is.r(IB)V")
    public void method3843(int arg0) {
        for (int var2 = 0; var2 < this.field3224[arg0].length; var2++) {
            this.field3224[arg0][var2] = null;
        }
    }

    @ObfuscatedName("is.b(I)V")
    public void method3844() {
        for (int var1 = 0; var1 < this.field3224.length; var1++) {
            if (this.field3224[var1] != null) {
                for (int var2 = 0; var2 < this.field3224[var1].length; var2++) {
                    this.field3224[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("is.s(I[IB)Z")
    public boolean method3845(int arg0, int[] arg1) {
        if (this.field3226[arg0] == null) {
            return false;
        }
        int var3 = this.field3222[arg0];
        int[] var4 = this.field3232[arg0];
        Object[] var5 = this.field3224[arg0];
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
            var8 = class177.method4060(this.field3226[arg0], true);
            class174 var9 = new class174(var8);
            var9.method2943(arg1, 5, var9.field2401.length);
        } else {
            var8 = class177.method4060(this.field3226[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1375(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class174.method1924(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class174.method1924(var8, 0, var18);
            throw class153.method124(var35, var17 + var19 + "," + this.field3220[arg0] + "," + this.field3229);
        }
        if (this.field3227) {
            this.field3226[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class174 var23 = new class174(var10);
            int[] var24 = new int[var3];
            var23.field2400 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method3058();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2400 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method3058();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field3231) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class177.method685(var28[var34], false);
                }
            }
        } else if (this.field3231) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class177.method685(var10, false);
        }
        return true;
    }

    @ObfuscatedName("is.v(Ljava/lang/String;B)I")
    public int method3846(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3219.method3265(class271.method2752(var2));
    }

    @ObfuscatedName("is.t(ILjava/lang/String;B)I")
    public int method3914(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3225[arg0].method3265(class271.method2752(var3));
    }

    @ObfuscatedName("is.w(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3898(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3219.method3265(class271.method2752(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3225[var5].method3265(class271.method2752(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("is.u(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3849(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3219.method3265(class271.method2752(var3));
        int var6 = this.field3225[var5].method3265(class271.method2752(var4));
        return this.method3880(var5, var6);
    }

    @ObfuscatedName("is.aa(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method3850(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3219.method3265(class271.method2752(var3));
        int var6 = this.field3225[var5].method3265(class271.method2752(var4));
        return this.method3832(var5, var6);
    }

    @ObfuscatedName("is.aw(Ljava/lang/String;B)Z")
    public boolean method3853(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3219.method3265(class271.method2752(var2));
        return this.method3833(var3);
    }

    @ObfuscatedName("is.an(Ljava/lang/String;I)V")
    public void method3852(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3219.method3265(class271.method2752(var2));
        if (var3 >= 0) {
            this.method3829(var3);
        }
    }

    @ObfuscatedName("is.al(Ljava/lang/String;I)I")
    public int method3877(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3219.method3265(class271.method2752(var2));
        return this.method3835(var3);
    }

    @ObfuscatedName("client.at([BB)[B")
    public static final byte[] method1375(byte[] arg0) {
        class174 var1 = new class174(arg0);
        int var2 = var1.method2925();
        int var3 = var1.method3058();
        if (var3 < 0 || !(field3230 == 0 || var3 <= field3230)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3005(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3058();
            if (var5 < 0 || field3230 != 0 && var5 > field3230) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class168.method2849(var6, var5, arg0, var3, 9);
            } else {
                field3228.method2842(var1, var6);
            }
            return var6;
        }
    }
}
