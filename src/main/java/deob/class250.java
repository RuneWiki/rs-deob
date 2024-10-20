package deob;

@ObfuscatedName("iu")
public abstract class class250 {

    @ObfuscatedName("iu.r")
    public int field3225;

    @ObfuscatedName("iu.e")
    public int[] field3226;

    @ObfuscatedName("iu.q")
    public int[] field3239;

    @ObfuscatedName("iu.c")
    public class201 field3228;

    @ObfuscatedName("iu.l")
    public int[] field3229;

    @ObfuscatedName("iu.b")
    public int[] field3230;

    @ObfuscatedName("iu.w")
    public int[] field3231;

    @ObfuscatedName("iu.n")
    public int[][] field3241;

    @ObfuscatedName("iu.i")
    public int[][] field3233;

    @ObfuscatedName("iu.p")
    public class201[] field3234;

    @ObfuscatedName("iu.m")
    public Object[] field3235;

    @ObfuscatedName("iu.d")
    public Object[][] field3236;

    @ObfuscatedName("iu.j")
    public static class178 field3232 = new class178();

    @ObfuscatedName("iu.x")
    public int field3238;

    @ObfuscatedName("iu.v")
    public boolean field3237;

    @ObfuscatedName("iu.h")
    public boolean field3227;

    @ObfuscatedName("iu.f")
    public static int field3224 = 0;

    public class250(boolean arg0, boolean arg1) {
        this.field3237 = arg0;
        this.field3227 = arg1;
    }

    @ObfuscatedName("iu.g([BB)V")
    public void method4453(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class185.method1859(arg0, 0, var2);
        this.field3238 = var3;
        class185 var4 = new class185(method4400(arg0));
        int var5 = var4.method3679();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method3588();
        }
        int var6 = var4.method3679();
        if (var5 >= 7) {
            this.field3225 = var4.method3481();
        } else {
            this.field3225 = var4.method3467();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3226 = new int[this.field3225];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3225; var9++) {
                this.field3226[var9] = var7 += var4.method3481();
                if (this.field3226[var9] > var8) {
                    var8 = this.field3226[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3225; var10++) {
                this.field3226[var10] = var7 += var4.method3467();
                if (this.field3226[var10] > var8) {
                    var8 = this.field3226[var10];
                }
            }
        }
        this.field3229 = new int[var8 + 1];
        this.field3230 = new int[var8 + 1];
        this.field3231 = new int[var8 + 1];
        this.field3241 = new int[var8 + 1][];
        this.field3235 = new Object[var8 + 1];
        this.field3236 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3239 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3225; var11++) {
                this.field3239[this.field3226[var11]] = var4.method3588();
            }
            this.field3228 = new class201(this.field3239);
        }
        for (int var12 = 0; var12 < this.field3225; var12++) {
            this.field3229[this.field3226[var12]] = var4.method3588();
        }
        for (int var13 = 0; var13 < this.field3225; var13++) {
            this.field3230[this.field3226[var13]] = var4.method3588();
        }
        for (int var14 = 0; var14 < this.field3225; var14++) {
            this.field3231[this.field3226[var14]] = var4.method3467();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3225; var15++) {
                int var16 = this.field3226[var15];
                int var17 = this.field3231[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3241[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3241[var16][var20] = var18 += var4.method3481();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3236[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3225; var22++) {
                int var23 = this.field3226[var22];
                int var24 = this.field3231[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3241[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3241[var23][var27] = var25 += var4.method3467();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3236[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3233 = new int[var8 + 1][];
        this.field3234 = new class201[var8 + 1];
        for (int var29 = 0; var29 < this.field3225; var29++) {
            int var30 = this.field3226[var29];
            int var31 = this.field3231[var30];
            this.field3233[var30] = new int[this.field3236[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3233[var30][this.field3241[var30][var32]] = var4.method3588();
            }
            this.field3234[var30] = new class201(this.field3233[var30]);
        }
    }

    @ObfuscatedName("iu.r(II)V")
    public void method4434(int arg0) {
    }

    @ObfuscatedName("iu.e(III)[B")
    public byte[] method4438(int arg0, int arg1) {
        return this.method4476(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("iu.q(II[II)[B")
    public byte[] method4476(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3236.length || this.field3236[arg0] == null || arg1 < 0 || arg1 >= this.field3236[arg0].length) {
            return null;
        }
        if (this.field3236[arg0][arg1] == null) {
            boolean var4 = this.method4470(arg0, arg2);
            if (!var4) {
                this.method4445(arg0);
                boolean var5 = this.method4470(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class189.method3271(this.field3236[arg0][arg1], false);
        if (this.field3227) {
            this.field3236[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("iu.c(IIB)Z")
    public boolean method4437(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3236.length || this.field3236[arg0] == null || arg1 < 0 || arg1 >= this.field3236[arg0].length) {
            return false;
        } else if (this.field3236[arg0][arg1] != null) {
            return true;
        } else if (this.field3235[arg0] == null) {
            this.method4445(arg0);
            return this.field3235[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iu.i(II)Z")
    public boolean method4436(int arg0) {
        if (this.field3236.length == 1) {
            return this.method4437(0, arg0);
        } else if (this.field3236[arg0].length == 1) {
            return this.method4437(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iu.p(IB)Z")
    public boolean method4439(int arg0) {
        if (this.field3235[arg0] == null) {
            this.method4445(arg0);
            return this.field3235[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iu.m(B)Z")
    public boolean method4511() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3226.length; var2++) {
            int var3 = this.field3226[var2];
            if (this.field3235[var3] == null) {
                this.method4445(var3);
                if (this.field3235[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("iu.d(II)I")
    public int method4466(int arg0) {
        return this.field3235[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("iu.j(IS)[B")
    public byte[] method4442(int arg0) {
        if (this.field3236.length == 1) {
            return this.method4438(0, arg0);
        } else if (this.field3236[arg0].length == 1) {
            return this.method4438(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iu.x(III)[B")
    public byte[] method4443(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3236.length || this.field3236[arg0] == null || arg1 < 0 || arg1 >= this.field3236[arg0].length) {
            return null;
        }
        if (this.field3236[arg0][arg1] == null) {
            boolean var3 = this.method4470(arg0, (int[]) null);
            if (!var3) {
                this.method4445(arg0);
                boolean var4 = this.method4470(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class189.method3271(this.field3236[arg0][arg1], false);
    }

    @ObfuscatedName("iu.v(II)[B")
    public byte[] method4444(int arg0) {
        if (this.field3236.length == 1) {
            return this.method4443(0, arg0);
        } else if (this.field3236[arg0].length == 1) {
            return this.method4443(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iu.h(II)V")
    public void method4445(int arg0) {
    }

    @ObfuscatedName("iu.f(II)[I")
    public int[] method4446(int arg0) {
        return this.field3241[arg0];
    }

    @ObfuscatedName("iu.a(II)I")
    public int method4496(int arg0) {
        return this.field3236[arg0].length;
    }

    @ObfuscatedName("iu.t(B)I")
    public int method4448() {
        return this.field3236.length;
    }

    @ObfuscatedName("iu.k(I)V")
    public void method4449() {
        for (int var1 = 0; var1 < this.field3235.length; var1++) {
            this.field3235[var1] = null;
        }
    }

    @ObfuscatedName("iu.s(II)V")
    public void method4450(int arg0) {
        for (int var2 = 0; var2 < this.field3236[arg0].length; var2++) {
            this.field3236[arg0][var2] = null;
        }
    }

    @ObfuscatedName("iu.y(I)V")
    public void method4451() {
        for (int var1 = 0; var1 < this.field3236.length; var1++) {
            if (this.field3236[var1] != null) {
                for (int var2 = 0; var2 < this.field3236[var1].length; var2++) {
                    this.field3236[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("iu.u(I[IB)Z")
    public boolean method4470(int arg0, int[] arg1) {
        if (this.field3235[arg0] == null) {
            return false;
        }
        int var3 = this.field3231[arg0];
        int[] var4 = this.field3241[arg0];
        Object[] var5 = this.field3236[arg0];
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
            var8 = class189.method3271(this.field3235[arg0], true);
            class185 var9 = new class185(var8);
            var9.method3487(arg1, 5, var9.field2405.length);
        } else {
            var8 = class189.method3271(this.field3235[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method4400(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class185.method1859(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class185.method1859(var8, 0, var18);
            throw class155.method2510(var35, var17 + var19 + "," + this.field3229[arg0] + "," + this.field3238);
        }
        if (this.field3237) {
            this.field3235[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class185 var23 = new class185(var10);
            int[] var24 = new int[var3];
            var23.field2406 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method3588();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2406 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method3588();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field3227) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class189.method311(var28[var34], false);
                }
            }
        } else if (this.field3227) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class189.method311(var10, false);
        }
        return true;
    }

    @ObfuscatedName("iu.o(Ljava/lang/String;I)I")
    public int method4432(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3228.method3867(class308.method1009(var2));
    }

    @ObfuscatedName("iu.af(ILjava/lang/String;I)I")
    public int method4454(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3234[arg0].method3867(class308.method1009(var3));
    }

    @ObfuscatedName("iu.an(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method4455(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3228.method3867(class308.method1009(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3234[var5].method3867(class308.method1009(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("iu.ax(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4456(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3228.method3867(class308.method1009(var3));
        int var6 = this.field3234[var5].method3867(class308.method1009(var4));
        return this.method4438(var5, var6);
    }

    @ObfuscatedName("iu.aw(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4460(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3228.method3867(class308.method1009(var3));
        int var6 = this.field3234[var5].method3867(class308.method1009(var4));
        return this.method4437(var5, var6);
    }

    @ObfuscatedName("iu.ae(Ljava/lang/String;I)Z")
    public boolean method4458(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3228.method3867(class308.method1009(var2));
        return this.method4439(var3);
    }

    @ObfuscatedName("iu.ac(Ljava/lang/String;I)V")
    public void method4435(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3228.method3867(class308.method1009(var2));
        if (var3 >= 0) {
            this.method4434(var3);
        }
    }

    @ObfuscatedName("iu.az(Ljava/lang/String;I)I")
    public int method4452(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3228.method3867(class308.method1009(var2));
        return this.method4466(var3);
    }

    @ObfuscatedName("ir.aj([BI)[B")
    public static final byte[] method4400(byte[] arg0) {
        class185 var1 = new class185(arg0);
        int var2 = var1.method3679();
        int var3 = var1.method3588();
        if (var3 < 0 || !(field3224 == 0 || var3 <= field3224)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3477(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3588();
            if (var5 < 0 || field3224 != 0 && var5 > field3224) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class179.method3400(var6, var5, arg0, var3, 9);
            } else {
                field3232.method3393(var1, var6);
            }
            return var6;
        }
    }
}
