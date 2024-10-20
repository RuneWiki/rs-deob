package deob;

@ObfuscatedName("if")
public abstract class class236 {

    @ObfuscatedName("if.a")
    public int field3221;

    @ObfuscatedName("if.j")
    public int[] field3215;

    @ObfuscatedName("if.n")
    public int[] field3216;

    @ObfuscatedName("if.r")
    public class188 field3217;

    @ObfuscatedName("if.v")
    public int[] field3214;

    @ObfuscatedName("if.e")
    public int[] field3219;

    @ObfuscatedName("if.l")
    public int[] field3220;

    @ObfuscatedName("if.s")
    public int[][] field3224;

    @ObfuscatedName("if.w")
    public int[][] field3223;

    @ObfuscatedName("if.p")
    public class188[] field3222;

    @ObfuscatedName("if.m")
    public Object[] field3229;

    @ObfuscatedName("if.u")
    public Object[][] field3225;

    @ObfuscatedName("if.g")
    public static class167 field3226 = new class167();

    @ObfuscatedName("if.k")
    public int field3218;

    @ObfuscatedName("if.t")
    public boolean field3228;

    @ObfuscatedName("if.c")
    public boolean field3227;

    @ObfuscatedName("if.o")
    public static int field3230 = 0;

    public class236(boolean arg0, boolean arg1) {
        this.field3228 = arg0;
        this.field3227 = arg1;
    }

    @ObfuscatedName("if.a([BB)V")
    public void method3760(byte[] arg0) {
        this.field3218 = class174.method2171(arg0, arg0.length);
        class174 var2 = new class174(method3729(arg0));
        int var3 = var2.method2871();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2876();
        }
        int var4 = var2.method2871();
        if (var3 >= 7) {
            this.field3221 = var2.method2885();
        } else {
            this.field3221 = var2.method2873();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3215 = new int[this.field3221];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3221; var7++) {
                this.field3215[var7] = var5 += var2.method2885();
                if (this.field3215[var7] > var6) {
                    var6 = this.field3215[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3221; var8++) {
                this.field3215[var8] = var5 += var2.method2873();
                if (this.field3215[var8] > var6) {
                    var6 = this.field3215[var8];
                }
            }
        }
        this.field3214 = new int[var6 + 1];
        this.field3219 = new int[var6 + 1];
        this.field3220 = new int[var6 + 1];
        this.field3224 = new int[var6 + 1][];
        this.field3229 = new Object[var6 + 1];
        this.field3225 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3216 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3221; var9++) {
                this.field3216[this.field3215[var9]] = var2.method2876();
            }
            this.field3217 = new class188(this.field3216);
        }
        for (int var10 = 0; var10 < this.field3221; var10++) {
            this.field3214[this.field3215[var10]] = var2.method2876();
        }
        for (int var11 = 0; var11 < this.field3221; var11++) {
            this.field3219[this.field3215[var11]] = var2.method2876();
        }
        for (int var12 = 0; var12 < this.field3221; var12++) {
            this.field3220[this.field3215[var12]] = var2.method2873();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3221; var13++) {
                int var14 = this.field3215[var13];
                int var15 = this.field3220[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3224[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3224[var14][var18] = var16 += var2.method2885();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3225[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3221; var20++) {
                int var21 = this.field3215[var20];
                int var22 = this.field3220[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3224[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3224[var21][var25] = var23 += var2.method2873();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3225[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3223 = new int[var6 + 1][];
        this.field3222 = new class188[var6 + 1];
        for (int var27 = 0; var27 < this.field3221; var27++) {
            int var28 = this.field3215[var27];
            int var29 = this.field3220[var28];
            this.field3223[var28] = new int[this.field3225[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3223[var28][this.field3224[var28][var30]] = var2.method2876();
            }
            this.field3222[var28] = new class188(this.field3223[var28]);
        }
    }

    @ObfuscatedName("if.j(II)V")
    public void method3811(int arg0) {
    }

    @ObfuscatedName("if.n(IIB)[B")
    public byte[] method3787(int arg0, int arg1) {
        return this.method3763(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("if.r(II[II)[B")
    public byte[] method3763(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3225.length || this.field3225[arg0] == null || arg1 < 0 || arg1 >= this.field3225[arg0].length) {
            return null;
        }
        if (this.field3225[arg0][arg1] == null) {
            boolean var4 = this.method3776(arg0, arg2);
            if (!var4) {
                this.method3771(arg0);
                boolean var5 = this.method3776(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class177.method2671(this.field3225[arg0][arg1], false);
        if (this.field3227) {
            this.field3225[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("if.v(III)Z")
    public boolean method3765(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3225.length || this.field3225[arg0] == null || arg1 < 0 || arg1 >= this.field3225[arg0].length) {
            return false;
        } else if (this.field3225[arg0][arg1] != null) {
            return true;
        } else if (this.field3229[arg0] == null) {
            this.method3771(arg0);
            return this.field3229[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("if.e(II)Z")
    public boolean method3797(int arg0) {
        if (this.field3229[arg0] == null) {
            this.method3771(arg0);
            return this.field3229[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("if.l(S)Z")
    public boolean method3766() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3215.length; var2++) {
            int var3 = this.field3215[var2];
            if (this.field3229[var3] == null) {
                this.method3771(var3);
                if (this.field3229[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("if.s(II)I")
    public int method3767(int arg0) {
        return this.field3229[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("if.w(II)[B")
    public byte[] method3768(int arg0) {
        if (this.field3225.length == 1) {
            return this.method3787(0, arg0);
        } else if (this.field3225[arg0].length == 1) {
            return this.method3787(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("if.p(III)[B")
    public byte[] method3769(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3225.length || this.field3225[arg0] == null || arg1 < 0 || arg1 >= this.field3225[arg0].length) {
            return null;
        }
        if (this.field3225[arg0][arg1] == null) {
            boolean var3 = this.method3776(arg0, (int[]) null);
            if (!var3) {
                this.method3771(arg0);
                boolean var4 = this.method3776(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class177.method2671(this.field3225[arg0][arg1], false);
    }

    @ObfuscatedName("if.m(II)[B")
    public byte[] method3770(int arg0) {
        if (this.field3225.length == 1) {
            return this.method3769(0, arg0);
        } else if (this.field3225[arg0].length == 1) {
            return this.method3769(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("if.u(II)V")
    public void method3771(int arg0) {
    }

    @ObfuscatedName("if.g(IB)[I")
    public int[] method3772(int arg0) {
        return this.field3224[arg0];
    }

    @ObfuscatedName("if.k(IB)I")
    public int method3793(int arg0) {
        return this.field3225[arg0].length;
    }

    @ObfuscatedName("if.c(I)I")
    public int method3833() {
        return this.field3225.length;
    }

    @ObfuscatedName("if.o(II)V")
    public void method3774(int arg0) {
        for (int var2 = 0; var2 < this.field3225[arg0].length; var2++) {
            this.field3225[arg0][var2] = null;
        }
    }

    @ObfuscatedName("if.x(I)V")
    public void method3775() {
        for (int var1 = 0; var1 < this.field3225.length; var1++) {
            if (this.field3225[var1] != null) {
                for (int var2 = 0; var2 < this.field3225[var1].length; var2++) {
                    this.field3225[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("if.h(I[II)Z")
    public boolean method3776(int arg0, int[] arg1) {
        if (this.field3229[arg0] == null) {
            return false;
        }
        int var3 = this.field3220[arg0];
        int[] var4 = this.field3224[arg0];
        Object[] var5 = this.field3225[arg0];
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
            var8 = class177.method2671(this.field3229[arg0], true);
            class174 var9 = new class174(var8);
            var9.method2891(arg1, 5, var9.field2391.length);
        } else {
            var8 = class177.method2671(this.field3229[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3729(var8);
        } catch (RuntimeException var27) {
            throw class153.method1526(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class174.method2171(var8, var8.length) + "," + class174.method2171(var8, var8.length - 2) + "," + this.field3214[arg0] + "," + this.field3218);
        }
        if (this.field3228) {
            this.field3229[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class174 var15 = new class174(var10);
            int[] var16 = new int[var3];
            var15.field2394 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2876();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2394 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2876();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3227) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class177.method1473(var20[var26], false);
                }
            }
        } else if (this.field3227) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class177.method1473(var10, false);
        }
        return true;
    }

    @ObfuscatedName("if.z(Ljava/lang/String;B)I")
    public int method3777(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3217.method3230(class271.method3582(var2));
    }

    @ObfuscatedName("if.i(ILjava/lang/String;I)I")
    public int method3827(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3222[arg0].method3230(class271.method3582(var3));
    }

    @ObfuscatedName("if.d(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3764(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3217.method3230(class271.method3582(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3222[var5].method3230(class271.method3582(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("if.ai(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3796(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3217.method3230(class271.method3582(var3));
        int var6 = this.field3222[var5].method3230(class271.method3582(var4));
        return this.method3787(var5, var6);
    }

    @ObfuscatedName("if.ae(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3781(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3217.method3230(class271.method3582(var3));
        int var6 = this.field3222[var5].method3230(class271.method3582(var4));
        return this.method3765(var5, var6);
    }

    @ObfuscatedName("if.au(Ljava/lang/String;I)Z")
    public boolean method3782(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3217.method3230(class271.method3582(var2));
        return this.method3797(var3);
    }

    @ObfuscatedName("if.ak(Ljava/lang/String;I)V")
    public void method3783(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3217.method3230(class271.method3582(var2));
        if (var3 >= 0) {
            this.method3811(var3);
        }
    }

    @ObfuscatedName("if.ap(Ljava/lang/String;I)I")
    public int method3792(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3217.method3230(class271.method3582(var2));
        return this.method3767(var3);
    }

    @ObfuscatedName("ha.ar([BI)[B")
    public static final byte[] method3729(byte[] arg0) {
        class174 var1 = new class174(arg0);
        int var2 = var1.method2871();
        int var3 = var1.method2876();
        if (var3 < 0 || !(field3230 == 0 || var3 <= field3230)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3054(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2876();
            if (var5 < 0 || field3230 != 0 && var5 > field3230) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class168.method2809(var6, var5, arg0, var3, 9);
            } else {
                field3226.method2802(var1, var6);
            }
            return var6;
        }
    }
}
