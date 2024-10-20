package deob;

@ObfuscatedName("iq")
public abstract class class239 {

    @ObfuscatedName("iq.w")
    public int field3228;

    @ObfuscatedName("iq.o")
    public int[] field3217;

    @ObfuscatedName("iq.x")
    public int[] field3215;

    @ObfuscatedName("iq.k")
    public class191 field3218;

    @ObfuscatedName("iq.f")
    public int[] field3219;

    @ObfuscatedName("iq.i")
    public int[] field3220;

    @ObfuscatedName("iq.j")
    public int[] field3221;

    @ObfuscatedName("iq.m")
    public int[][] field3222;

    @ObfuscatedName("iq.u")
    public int[][] field3223;

    @ObfuscatedName("iq.r")
    public class191[] field3224;

    @ObfuscatedName("iq.v")
    public Object[] field3225;

    @ObfuscatedName("iq.h")
    public Object[][] field3226;

    @ObfuscatedName("iq.a")
    public static class170 field3227 = new class170();

    @ObfuscatedName("iq.p")
    public int field3216;

    @ObfuscatedName("iq.q")
    public boolean field3229;

    @ObfuscatedName("iq.l")
    public boolean field3230;

    @ObfuscatedName("iq.c")
    public static int field3231 = 0;

    public class239(boolean arg0, boolean arg1) {
        this.field3229 = arg0;
        this.field3230 = arg1;
    }

    @ObfuscatedName("iq.w([BB)V")
    public void method3724(byte[] arg0) {
        this.field3216 = class177.method27(arg0, arg0.length);
        class177 var2 = new class177(method993(arg0));
        int var3 = var2.method2931();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2904();
        }
        int var4 = var2.method2931();
        if (var3 >= 7) {
            this.field3228 = var2.method2898();
        } else {
            this.field3228 = var2.method2886();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3217 = new int[this.field3228];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3228; var7++) {
                this.field3217[var7] = var5 += var2.method2898();
                if (this.field3217[var7] > var6) {
                    var6 = this.field3217[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3228; var8++) {
                this.field3217[var8] = var5 += var2.method2886();
                if (this.field3217[var8] > var6) {
                    var6 = this.field3217[var8];
                }
            }
        }
        this.field3219 = new int[var6 + 1];
        this.field3220 = new int[var6 + 1];
        this.field3221 = new int[var6 + 1];
        this.field3222 = new int[var6 + 1][];
        this.field3225 = new Object[var6 + 1];
        this.field3226 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3215 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3228; var9++) {
                this.field3215[this.field3217[var9]] = var2.method2904();
            }
            this.field3218 = new class191(this.field3215);
        }
        for (int var10 = 0; var10 < this.field3228; var10++) {
            this.field3219[this.field3217[var10]] = var2.method2904();
        }
        for (int var11 = 0; var11 < this.field3228; var11++) {
            this.field3220[this.field3217[var11]] = var2.method2904();
        }
        for (int var12 = 0; var12 < this.field3228; var12++) {
            this.field3221[this.field3217[var12]] = var2.method2886();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3228; var13++) {
                int var14 = this.field3217[var13];
                int var15 = this.field3221[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3222[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3222[var14][var18] = var16 += var2.method2898();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3226[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3228; var20++) {
                int var21 = this.field3217[var20];
                int var22 = this.field3221[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3222[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3222[var21][var25] = var23 += var2.method2886();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3226[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3223 = new int[var6 + 1][];
        this.field3224 = new class191[var6 + 1];
        for (int var27 = 0; var27 < this.field3228; var27++) {
            int var28 = this.field3217[var27];
            int var29 = this.field3221[var28];
            this.field3223[var28] = new int[this.field3226[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3223[var28][this.field3222[var28][var30]] = var2.method2904();
            }
            this.field3224[var28] = new class191(this.field3223[var28]);
        }
    }

    @ObfuscatedName("iq.o(II)V")
    public void method3725(int arg0) {
    }

    @ObfuscatedName("iq.x(IIB)[B")
    public byte[] method3754(int arg0, int arg1) {
        return this.method3727(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("iq.k(II[IB)[B")
    public byte[] method3727(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3226.length || this.field3226[arg0] == null || arg1 < 0 || arg1 >= this.field3226[arg0].length) {
            return null;
        }
        if (this.field3226[arg0][arg1] == null) {
            boolean var4 = this.method3741(arg0, arg2);
            if (!var4) {
                this.method3735(arg0);
                boolean var5 = this.method3741(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class180.method1530(this.field3226[arg0][arg1], false);
        if (this.field3230) {
            this.field3226[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("iq.f(III)Z")
    public boolean method3801(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3226.length || this.field3226[arg0] == null || arg1 < 0 || arg1 >= this.field3226[arg0].length) {
            return false;
        } else if (this.field3226[arg0][arg1] != null) {
            return true;
        } else if (this.field3225[arg0] == null) {
            this.method3735(arg0);
            return this.field3225[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iq.i(IS)Z")
    public boolean method3729(int arg0) {
        if (this.field3225[arg0] == null) {
            this.method3735(arg0);
            return this.field3225[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iq.j(I)Z")
    public boolean method3728() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3217.length; var2++) {
            int var3 = this.field3217[var2];
            if (this.field3225[var3] == null) {
                this.method3735(var3);
                if (this.field3225[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("iq.m(II)I")
    public int method3731(int arg0) {
        return this.field3225[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("iq.u(IB)[B")
    public byte[] method3732(int arg0) {
        if (this.field3226.length == 1) {
            return this.method3754(0, arg0);
        } else if (this.field3226[arg0].length == 1) {
            return this.method3754(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iq.h(III)[B")
    public byte[] method3733(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3226.length || this.field3226[arg0] == null || arg1 < 0 || arg1 >= this.field3226[arg0].length) {
            return null;
        }
        if (this.field3226[arg0][arg1] == null) {
            boolean var3 = this.method3741(arg0, (int[]) null);
            if (!var3) {
                this.method3735(arg0);
                boolean var4 = this.method3741(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class180.method1530(this.field3226[arg0][arg1], false);
    }

    @ObfuscatedName("iq.a(IB)[B")
    public byte[] method3752(int arg0) {
        if (this.field3226.length == 1) {
            return this.method3733(0, arg0);
        } else if (this.field3226[arg0].length == 1) {
            return this.method3733(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iq.p(II)V")
    public void method3735(int arg0) {
    }

    @ObfuscatedName("iq.q(IB)[I")
    public int[] method3736(int arg0) {
        return this.field3222[arg0];
    }

    @ObfuscatedName("iq.l(II)I")
    public int method3798(int arg0) {
        return this.field3226[arg0].length;
    }

    @ObfuscatedName("iq.c(I)I")
    public int method3783() {
        return this.field3226.length;
    }

    @ObfuscatedName("iq.n(IB)V")
    public void method3739(int arg0) {
        for (int var2 = 0; var2 < this.field3226[arg0].length; var2++) {
            this.field3226[arg0][var2] = null;
        }
    }

    @ObfuscatedName("iq.z(I)V")
    public void method3740() {
        for (int var1 = 0; var1 < this.field3226.length; var1++) {
            if (this.field3226[var1] != null) {
                for (int var2 = 0; var2 < this.field3226[var1].length; var2++) {
                    this.field3226[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("iq.e(I[II)Z")
    public boolean method3741(int arg0, int[] arg1) {
        if (this.field3225[arg0] == null) {
            return false;
        }
        int var3 = this.field3221[arg0];
        int[] var4 = this.field3222[arg0];
        Object[] var5 = this.field3226[arg0];
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
            var8 = class180.method1530(this.field3225[arg0], true);
            class177 var9 = new class177(var8);
            var9.method3051(arg1, 5, var9.field2419.length);
        } else {
            var8 = class180.method1530(this.field3225[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method993(var8);
        } catch (RuntimeException var27) {
            throw class154.method1900(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class177.method27(var8, var8.length) + "," + class177.method27(var8, var8.length - 2) + "," + this.field3219[arg0] + "," + this.field3216);
        }
        if (this.field3229) {
            this.field3225[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class177 var15 = new class177(var10);
            int[] var16 = new int[var3];
            var15.field2412 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2904();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2412 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2904();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3230) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class180.method1554(var20[var26], false);
                }
            }
        } else if (this.field3230) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class180.method1554(var10, false);
        }
        return true;
    }

    @ObfuscatedName("iq.t(Ljava/lang/String;I)I")
    public int method3742(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3218.method3227(class274.method971(var2));
    }

    @ObfuscatedName("iq.b(ILjava/lang/String;I)I")
    public int method3743(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3224[arg0].method3227(class274.method971(var3));
    }

    @ObfuscatedName("iq.s(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3744(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3218.method3227(class274.method971(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3224[var5].method3227(class274.method971(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("iq.ap(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3745(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3218.method3227(class274.method971(var3));
        int var6 = this.field3224[var5].method3227(class274.method971(var4));
        return this.method3754(var5, var6);
    }

    @ObfuscatedName("iq.ac(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method3723(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3218.method3227(class274.method971(var3));
        int var6 = this.field3224[var5].method3227(class274.method971(var4));
        return this.method3801(var5, var6);
    }

    @ObfuscatedName("iq.af(Ljava/lang/String;I)Z")
    public boolean method3747(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3218.method3227(class274.method971(var2));
        return this.method3729(var3);
    }

    @ObfuscatedName("iq.ai(Ljava/lang/String;I)V")
    public void method3748(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3218.method3227(class274.method971(var2));
        if (var3 >= 0) {
            this.method3725(var3);
        }
    }

    @ObfuscatedName("iq.ad(Ljava/lang/String;I)I")
    public int method3734(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3218.method3227(class274.method971(var2));
        return this.method3731(var3);
    }

    @ObfuscatedName("be.ar([BI)[B")
    public static final byte[] method993(byte[] arg0) {
        class177 var1 = new class177(arg0);
        int var2 = var1.method2931();
        int var3 = var1.method2904();
        if (var3 < 0 || !(field3231 == 0 || var3 <= field3231)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2895(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2904();
            if (var5 < 0 || field3231 != 0 && var5 > field3231) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class171.method2827(var6, var5, arg0, var3, 9);
            } else {
                field3227.method2825(var1, var6);
            }
            return var6;
        }
    }
}
