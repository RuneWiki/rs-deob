package deob;

@ObfuscatedName("iw")
public abstract class class236 {

    @ObfuscatedName("iw.i")
    public int field3232;

    @ObfuscatedName("iw.c")
    public int[] field3222;

    @ObfuscatedName("iw.e")
    public int[] field3218;

    @ObfuscatedName("iw.v")
    public class188 field3219;

    @ObfuscatedName("iw.b")
    public int[] field3220;

    @ObfuscatedName("iw.y")
    public int[] field3225;

    @ObfuscatedName("iw.h")
    public int[] field3217;

    @ObfuscatedName("iw.x")
    public int[][] field3223;

    @ObfuscatedName("iw.f")
    public int[][] field3224;

    @ObfuscatedName("iw.n")
    public class188[] field3230;

    @ObfuscatedName("iw.a")
    public Object[] field3226;

    @ObfuscatedName("iw.o")
    public Object[][] field3227;

    @ObfuscatedName("iw.z")
    public static class167 field3228 = new class167();

    @ObfuscatedName("iw.q")
    public int field3229;

    @ObfuscatedName("iw.j")
    public boolean field3221;

    @ObfuscatedName("iw.k")
    public boolean field3231;

    @ObfuscatedName("iw.r")
    public static int field3216 = 0;

    public class236(boolean arg0, boolean arg1) {
        this.field3221 = arg0;
        this.field3231 = arg1;
    }

    @ObfuscatedName("iw.i([BI)V")
    public void method3767(byte[] arg0) {
        this.field3229 = class174.method2640(arg0, arg0.length);
        class174 var2 = new class174(method156(arg0));
        int var3 = var2.method2870();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2875();
        }
        int var4 = var2.method2870();
        if (var3 >= 7) {
            this.field3232 = var2.method2884();
        } else {
            this.field3232 = var2.method2872();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3222 = new int[this.field3232];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3232; var7++) {
                this.field3222[var7] = var5 += var2.method2884();
                if (this.field3222[var7] > var6) {
                    var6 = this.field3222[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3232; var8++) {
                this.field3222[var8] = var5 += var2.method2872();
                if (this.field3222[var8] > var6) {
                    var6 = this.field3222[var8];
                }
            }
        }
        this.field3220 = new int[var6 + 1];
        this.field3225 = new int[var6 + 1];
        this.field3217 = new int[var6 + 1];
        this.field3223 = new int[var6 + 1][];
        this.field3226 = new Object[var6 + 1];
        this.field3227 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3218 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3232; var9++) {
                this.field3218[this.field3222[var9]] = var2.method2875();
            }
            this.field3219 = new class188(this.field3218);
        }
        for (int var10 = 0; var10 < this.field3232; var10++) {
            this.field3220[this.field3222[var10]] = var2.method2875();
        }
        for (int var11 = 0; var11 < this.field3232; var11++) {
            this.field3225[this.field3222[var11]] = var2.method2875();
        }
        for (int var12 = 0; var12 < this.field3232; var12++) {
            this.field3217[this.field3222[var12]] = var2.method2872();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3232; var13++) {
                int var14 = this.field3222[var13];
                int var15 = this.field3217[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3223[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3223[var14][var18] = var16 += var2.method2884();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3227[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3232; var20++) {
                int var21 = this.field3222[var20];
                int var22 = this.field3217[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3223[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3223[var21][var25] = var23 += var2.method2872();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3227[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3224 = new int[var6 + 1][];
        this.field3230 = new class188[var6 + 1];
        for (int var27 = 0; var27 < this.field3232; var27++) {
            int var28 = this.field3222[var27];
            int var29 = this.field3217[var28];
            this.field3224[var28] = new int[this.field3227[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3224[var28][this.field3223[var28][var30]] = var2.method2875();
            }
            this.field3230[var28] = new class188(this.field3224[var28]);
        }
    }

    @ObfuscatedName("iw.c(II)V")
    public void method3817(int arg0) {
    }

    @ObfuscatedName("iw.e(III)[B")
    public byte[] method3769(int arg0, int arg1) {
        return this.method3770(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("iw.v(II[II)[B")
    public byte[] method3770(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3227.length || this.field3227[arg0] == null || arg1 < 0 || arg1 >= this.field3227[arg0].length) {
            return null;
        }
        if (this.field3227[arg0][arg1] == null) {
            boolean var4 = this.method3854(arg0, arg2);
            if (!var4) {
                this.method3778(arg0);
                boolean var5 = this.method3854(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class177.method2146(this.field3227[arg0][arg1], false);
        if (this.field3231) {
            this.field3227[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("iw.b(III)Z")
    public boolean method3771(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3227.length || this.field3227[arg0] == null || arg1 < 0 || arg1 >= this.field3227[arg0].length) {
            return false;
        } else if (this.field3227[arg0][arg1] != null) {
            return true;
        } else if (this.field3226[arg0] == null) {
            this.method3778(arg0);
            return this.field3226[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iw.y(II)Z")
    public boolean method3772(int arg0) {
        if (this.field3226[arg0] == null) {
            this.method3778(arg0);
            return this.field3226[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iw.h(I)Z")
    public boolean method3773() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3222.length; var2++) {
            int var3 = this.field3222[var2];
            if (this.field3226[var3] == null) {
                this.method3778(var3);
                if (this.field3226[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("iw.x(II)I")
    public int method3774(int arg0) {
        return this.field3226[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("iw.f(II)[B")
    public byte[] method3775(int arg0) {
        if (this.field3227.length == 1) {
            return this.method3769(0, arg0);
        } else if (this.field3227[arg0].length == 1) {
            return this.method3769(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iw.n(III)[B")
    public byte[] method3776(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3227.length || this.field3227[arg0] == null || arg1 < 0 || arg1 >= this.field3227[arg0].length) {
            return null;
        }
        if (this.field3227[arg0][arg1] == null) {
            boolean var3 = this.method3854(arg0, (int[]) null);
            if (!var3) {
                this.method3778(arg0);
                boolean var4 = this.method3854(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class177.method2146(this.field3227[arg0][arg1], false);
    }

    @ObfuscatedName("iw.a(IB)[B")
    public byte[] method3777(int arg0) {
        if (this.field3227.length == 1) {
            return this.method3776(0, arg0);
        } else if (this.field3227[arg0].length == 1) {
            return this.method3776(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iw.o(II)V")
    public void method3778(int arg0) {
    }

    @ObfuscatedName("iw.z(II)[I")
    public int[] method3821(int arg0) {
        return this.field3223[arg0];
    }

    @ObfuscatedName("iw.q(IB)I")
    public int method3847(int arg0) {
        return this.field3227[arg0].length;
    }

    @ObfuscatedName("iw.j(B)I")
    public int method3781() {
        return this.field3227.length;
    }

    @ObfuscatedName("iw.l(IB)V")
    public void method3782(int arg0) {
        for (int var2 = 0; var2 < this.field3227[arg0].length; var2++) {
            this.field3227[arg0][var2] = null;
        }
    }

    @ObfuscatedName("iw.u(I)V")
    public void method3833() {
        for (int var1 = 0; var1 < this.field3227.length; var1++) {
            if (this.field3227[var1] != null) {
                for (int var2 = 0; var2 < this.field3227[var1].length; var2++) {
                    this.field3227[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("iw.t(I[II)Z")
    public boolean method3854(int arg0, int[] arg1) {
        if (this.field3226[arg0] == null) {
            return false;
        }
        int var3 = this.field3217[arg0];
        int[] var4 = this.field3223[arg0];
        Object[] var5 = this.field3227[arg0];
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
            var8 = class177.method2146(this.field3226[arg0], true);
            class174 var9 = new class174(var8);
            var9.method2890(arg1, 5, var9.field2415.length);
        } else {
            var8 = class177.method2146(this.field3226[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method156(var8);
        } catch (RuntimeException var27) {
            throw class153.method973(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class174.method2640(var8, var8.length) + "," + class174.method2640(var8, var8.length - 2) + "," + this.field3220[arg0] + "," + this.field3229);
        }
        if (this.field3221) {
            this.field3226[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class174 var15 = new class174(var10);
            int[] var16 = new int[var3];
            var15.field2407 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2875();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2407 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2875();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3231) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class177.method455(var20[var26], false);
                }
            }
        } else if (this.field3231) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class177.method455(var10, false);
        }
        return true;
    }

    @ObfuscatedName("iw.ad(Ljava/lang/String;S)I")
    public int method3785(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3219.method3211(class271.method2667(var2));
    }

    @ObfuscatedName("iw.ar(ILjava/lang/String;B)I")
    public int method3786(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3230[arg0].method3211(class271.method2667(var3));
    }

    @ObfuscatedName("iw.an(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3836(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3219.method3211(class271.method2667(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3230[var5].method3211(class271.method2667(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("iw.af(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3830(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3219.method3211(class271.method2667(var3));
        int var6 = this.field3230[var5].method3211(class271.method2667(var4));
        return this.method3769(var5, var6);
    }

    @ObfuscatedName("iw.at(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3788(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3219.method3211(class271.method2667(var3));
        int var6 = this.field3230[var5].method3211(class271.method2667(var4));
        return this.method3771(var5, var6);
    }

    @ObfuscatedName("iw.ah(Ljava/lang/String;I)Z")
    public boolean method3789(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3219.method3211(class271.method2667(var2));
        return this.method3772(var3);
    }

    @ObfuscatedName("iw.ai(Ljava/lang/String;S)V")
    public void method3790(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3219.method3211(class271.method2667(var2));
        if (var3 >= 0) {
            this.method3817(var3);
        }
    }

    @ObfuscatedName("iw.aw(Ljava/lang/String;B)I")
    public int method3793(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3219.method3211(class271.method2667(var2));
        return this.method3774(var3);
    }

    @ObfuscatedName("u.al([BB)[B")
    public static final byte[] method156(byte[] arg0) {
        class174 var1 = new class174(arg0);
        int var2 = var1.method2870();
        int var3 = var1.method2875();
        if (var3 < 0 || !(field3216 == 0 || var3 <= field3216)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2881(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2875();
            if (var5 < 0 || field3216 != 0 && var5 > field3216) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class168.method2831(var6, var5, arg0, var3, 9);
            } else {
                field3228.method2810(var1, var6);
            }
            return var6;
        }
    }
}
