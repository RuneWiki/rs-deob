package deob;

@ObfuscatedName("it")
public abstract class class236 {

    @ObfuscatedName("it.d")
    public int field3226;

    @ObfuscatedName("it.k")
    public int[] field3215;

    @ObfuscatedName("it.e")
    public int[] field3216;

    @ObfuscatedName("it.p")
    public class188 field3217;

    @ObfuscatedName("it.q")
    public int[] field3218;

    @ObfuscatedName("it.s")
    public int[] field3219;

    @ObfuscatedName("it.r")
    public int[] field3227;

    @ObfuscatedName("it.g")
    public int[][] field3221;

    @ObfuscatedName("it.v")
    public int[][] field3224;

    @ObfuscatedName("it.t")
    public class188[] field3223;

    @ObfuscatedName("it.y")
    public Object[] field3222;

    @ObfuscatedName("it.o")
    public Object[][] field3231;

    @ObfuscatedName("it.i")
    public static class167 field3225 = new class167();

    @ObfuscatedName("it.u")
    public int field3220;

    @ObfuscatedName("it.b")
    public boolean field3228;

    @ObfuscatedName("it.f")
    public boolean field3214;

    @ObfuscatedName("it.j")
    public static int field3230 = 0;

    public class236(boolean arg0, boolean arg1) {
        this.field3228 = arg0;
        this.field3214 = arg1;
    }

    @ObfuscatedName("it.d([BI)V")
    public void method3873(byte[] arg0) {
        this.field3220 = class174.method749(arg0, arg0.length);
        class174 var2 = new class174(method2929(arg0));
        int var3 = var2.method2955();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2960();
        }
        int var4 = var2.method2955();
        if (var3 >= 7) {
            this.field3226 = var2.method3034();
        } else {
            this.field3226 = var2.method3035();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3215 = new int[this.field3226];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3226; var7++) {
                this.field3215[var7] = var5 += var2.method3034();
                if (this.field3215[var7] > var6) {
                    var6 = this.field3215[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3226; var8++) {
                this.field3215[var8] = var5 += var2.method3035();
                if (this.field3215[var8] > var6) {
                    var6 = this.field3215[var8];
                }
            }
        }
        this.field3218 = new int[var6 + 1];
        this.field3219 = new int[var6 + 1];
        this.field3227 = new int[var6 + 1];
        this.field3221 = new int[var6 + 1][];
        this.field3222 = new Object[var6 + 1];
        this.field3231 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3216 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3226; var9++) {
                this.field3216[this.field3215[var9]] = var2.method2960();
            }
            this.field3217 = new class188(this.field3216);
        }
        for (int var10 = 0; var10 < this.field3226; var10++) {
            this.field3218[this.field3215[var10]] = var2.method2960();
        }
        for (int var11 = 0; var11 < this.field3226; var11++) {
            this.field3219[this.field3215[var11]] = var2.method2960();
        }
        for (int var12 = 0; var12 < this.field3226; var12++) {
            this.field3227[this.field3215[var12]] = var2.method3035();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3226; var13++) {
                int var14 = this.field3215[var13];
                int var15 = this.field3227[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3221[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3221[var14][var18] = var16 += var2.method3034();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3231[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3226; var20++) {
                int var21 = this.field3215[var20];
                int var22 = this.field3227[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3221[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3221[var21][var25] = var23 += var2.method3035();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3231[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3224 = new int[var6 + 1][];
        this.field3223 = new class188[var6 + 1];
        for (int var27 = 0; var27 < this.field3226; var27++) {
            int var28 = this.field3215[var27];
            int var29 = this.field3227[var28];
            this.field3224[var28] = new int[this.field3231[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3224[var28][this.field3221[var28][var30]] = var2.method2960();
            }
            this.field3223[var28] = new class188(this.field3224[var28]);
        }
    }

    @ObfuscatedName("it.k(IB)V")
    public void method3874(int arg0) {
    }

    @ObfuscatedName("it.e(IIB)[B")
    public byte[] method3875(int arg0, int arg1) {
        return this.method3876(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("it.p(II[IB)[B")
    public byte[] method3876(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3231.length || this.field3231[arg0] == null || arg1 < 0 || arg1 >= this.field3231[arg0].length) {
            return null;
        }
        if (this.field3231[arg0][arg1] == null) {
            boolean var4 = this.method3890(arg0, arg2);
            if (!var4) {
                this.method3878(arg0);
                boolean var5 = this.method3890(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class177.method456(this.field3231[arg0][arg1], false);
        if (this.field3214) {
            this.field3231[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("it.q(III)Z")
    public boolean method3894(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3231.length || this.field3231[arg0] == null || arg1 < 0 || arg1 >= this.field3231[arg0].length) {
            return false;
        } else if (this.field3231[arg0][arg1] != null) {
            return true;
        } else if (this.field3222[arg0] == null) {
            this.method3878(arg0);
            return this.field3222[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("it.s(II)Z")
    public boolean method3886(int arg0) {
        if (this.field3222[arg0] == null) {
            this.method3878(arg0);
            return this.field3222[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("it.r(I)Z")
    public boolean method3949() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3215.length; var2++) {
            int var3 = this.field3215[var2];
            if (this.field3222[var3] == null) {
                this.method3878(var3);
                if (this.field3222[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("it.g(IB)I")
    public int method3880(int arg0) {
        return this.field3222[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("it.v(IB)[B")
    public byte[] method3881(int arg0) {
        if (this.field3231.length == 1) {
            return this.method3875(0, arg0);
        } else if (this.field3231[arg0].length == 1) {
            return this.method3875(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("it.t(IIB)[B")
    public byte[] method3882(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3231.length || this.field3231[arg0] == null || arg1 < 0 || arg1 >= this.field3231[arg0].length) {
            return null;
        }
        if (this.field3231[arg0][arg1] == null) {
            boolean var3 = this.method3890(arg0, (int[]) null);
            if (!var3) {
                this.method3878(arg0);
                boolean var4 = this.method3890(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class177.method456(this.field3231[arg0][arg1], false);
    }

    @ObfuscatedName("it.y(II)[B")
    public byte[] method3883(int arg0) {
        if (this.field3231.length == 1) {
            return this.method3882(0, arg0);
        } else if (this.field3231[arg0].length == 1) {
            return this.method3882(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("it.o(II)V")
    public void method3878(int arg0) {
    }

    @ObfuscatedName("it.i(IB)[I")
    public int[] method3885(int arg0) {
        return this.field3221[arg0];
    }

    @ObfuscatedName("it.u(IS)I")
    public int method3889(int arg0) {
        return this.field3231[arg0].length;
    }

    @ObfuscatedName("it.x(I)I")
    public int method3887() {
        return this.field3231.length;
    }

    @ObfuscatedName("it.c(II)V")
    public void method3893(int arg0) {
        for (int var2 = 0; var2 < this.field3231[arg0].length; var2++) {
            this.field3231[arg0][var2] = null;
        }
    }

    @ObfuscatedName("it.h(I)V")
    public void method3935() {
        for (int var1 = 0; var1 < this.field3231.length; var1++) {
            if (this.field3231[var1] != null) {
                for (int var2 = 0; var2 < this.field3231[var1].length; var2++) {
                    this.field3231[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("it.a(I[II)Z")
    public boolean method3890(int arg0, int[] arg1) {
        if (this.field3222[arg0] == null) {
            return false;
        }
        int var3 = this.field3227[arg0];
        int[] var4 = this.field3221[arg0];
        Object[] var5 = this.field3231[arg0];
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
            var8 = class177.method456(this.field3222[arg0], true);
            class174 var9 = new class174(var8);
            var9.method2976(arg1, 5, var9.field2409.length);
        } else {
            var8 = class177.method456(this.field3222[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2929(var8);
        } catch (RuntimeException var27) {
            throw class153.method1035(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class174.method749(var8, var8.length) + "," + class174.method749(var8, var8.length - 2) + "," + this.field3218[arg0] + "," + this.field3220);
        }
        if (this.field3228) {
            this.field3222[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class174 var15 = new class174(var10);
            int[] var16 = new int[var3];
            var15.field2405 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2960();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2405 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2960();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3214) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class177.method26(var20[var26], false);
                }
            }
        } else if (this.field3214) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class177.method26(var10, false);
        }
        return true;
    }

    @ObfuscatedName("it.w(Ljava/lang/String;I)I")
    public int method3896(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3217.method3332(class271.method454(var2));
    }

    @ObfuscatedName("it.n(ILjava/lang/String;I)I")
    public int method3892(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3223[arg0].method3332(class271.method454(var3));
    }

    @ObfuscatedName("it.m(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3933(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3217.method3332(class271.method454(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3223[var5].method3332(class271.method454(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("it.ae(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3962(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3217.method3332(class271.method454(var3));
        int var6 = this.field3223[var5].method3332(class271.method454(var4));
        return this.method3875(var5, var6);
    }

    @ObfuscatedName("it.ai(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3895(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3217.method3332(class271.method454(var3));
        int var6 = this.field3223[var5].method3332(class271.method454(var4));
        return this.method3894(var5, var6);
    }

    @ObfuscatedName("it.ah(Ljava/lang/String;I)Z")
    public boolean method3945(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3217.method3332(class271.method454(var2));
        return this.method3886(var3);
    }

    @ObfuscatedName("it.ab(Ljava/lang/String;I)V")
    public void method3925(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3217.method3332(class271.method454(var2));
        if (var3 >= 0) {
            this.method3874(var3);
        }
    }

    @ObfuscatedName("it.ad(Ljava/lang/String;I)I")
    public int method3898(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3217.method3332(class271.method454(var2));
        return this.method3880(var3);
    }

    @ObfuscatedName("fk.ag([BI)[B")
    public static final byte[] method2929(byte[] arg0) {
        class174 var1 = new class174(arg0);
        int var2 = var1.method2955();
        int var3 = var1.method2960();
        if (var3 < 0 || !(field3230 == 0 || var3 <= field3230)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2967(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2960();
            if (var5 < 0 || field3230 != 0 && var5 > field3230) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class168.method2919(var6, var5, arg0, var3, 9);
            } else {
                field3225.method2892(var1, var6);
            }
            return var6;
        }
    }
}
