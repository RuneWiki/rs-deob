package deob;

@ObfuscatedName("iq")
public abstract class class236 {

    @ObfuscatedName("iq.i")
    public int field3231;

    @ObfuscatedName("iq.w")
    public int[] field3240;

    @ObfuscatedName("iq.a")
    public int[] field3229;

    @ObfuscatedName("iq.t")
    public class188 field3225;

    @ObfuscatedName("iq.s")
    public int[] field3226;

    @ObfuscatedName("iq.r")
    public int[] field3227;

    @ObfuscatedName("iq.v")
    public int[] field3228;

    @ObfuscatedName("iq.y")
    public int[][] field3235;

    @ObfuscatedName("iq.j")
    public int[][] field3223;

    @ObfuscatedName("iq.k")
    public class188[] field3224;

    @ObfuscatedName("iq.e")
    public Object[] field3236;

    @ObfuscatedName("iq.o")
    public Object[][] field3233;

    @ObfuscatedName("iq.z")
    public static class167 field3234 = new class167();

    @ObfuscatedName("iq.l")
    public int field3232;

    @ObfuscatedName("iq.c")
    public boolean field3230;

    @ObfuscatedName("iq.m")
    public boolean field3237;

    @ObfuscatedName("iq.b")
    public static int field3238 = 0;

    public class236(boolean arg0, boolean arg1) {
        this.field3230 = arg0;
        this.field3237 = arg1;
    }

    @ObfuscatedName("iq.i([BB)V")
    public void method3766(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class174.method195(arg0, 0, var2);
        this.field3232 = var3;
        class174 var4 = new class174(method2784(arg0));
        int var5 = var4.method3061();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2885();
        }
        int var6 = var4.method3061();
        if (var5 >= 7) {
            this.field3231 = var4.method2920();
        } else {
            this.field3231 = var4.method2882();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3240 = new int[this.field3231];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3231; var9++) {
                this.field3240[var9] = var7 += var4.method2920();
                if (this.field3240[var9] > var8) {
                    var8 = this.field3240[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3231; var10++) {
                this.field3240[var10] = var7 += var4.method2882();
                if (this.field3240[var10] > var8) {
                    var8 = this.field3240[var10];
                }
            }
        }
        this.field3226 = new int[var8 + 1];
        this.field3227 = new int[var8 + 1];
        this.field3228 = new int[var8 + 1];
        this.field3235 = new int[var8 + 1][];
        this.field3236 = new Object[var8 + 1];
        this.field3233 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3229 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3231; var11++) {
                this.field3229[this.field3240[var11]] = var4.method2885();
            }
            this.field3225 = new class188(this.field3229);
        }
        for (int var12 = 0; var12 < this.field3231; var12++) {
            this.field3226[this.field3240[var12]] = var4.method2885();
        }
        for (int var13 = 0; var13 < this.field3231; var13++) {
            this.field3227[this.field3240[var13]] = var4.method2885();
        }
        for (int var14 = 0; var14 < this.field3231; var14++) {
            this.field3228[this.field3240[var14]] = var4.method2882();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3231; var15++) {
                int var16 = this.field3240[var15];
                int var17 = this.field3228[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3235[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3235[var16][var20] = var18 += var4.method2920();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3233[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3231; var22++) {
                int var23 = this.field3240[var22];
                int var24 = this.field3228[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3235[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3235[var23][var27] = var25 += var4.method2882();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3233[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3223 = new int[var8 + 1][];
        this.field3224 = new class188[var8 + 1];
        for (int var29 = 0; var29 < this.field3231; var29++) {
            int var30 = this.field3240[var29];
            int var31 = this.field3228[var30];
            this.field3223[var30] = new int[this.field3233[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3223[var30][this.field3235[var30][var32]] = var4.method2885();
            }
            this.field3224[var30] = new class188(this.field3223[var30]);
        }
    }

    @ObfuscatedName("iq.w(II)V")
    public void method3767(int arg0) {
    }

    @ObfuscatedName("iq.a(IIB)[B")
    public byte[] method3768(int arg0, int arg1) {
        return this.method3769(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("iq.t(II[II)[B")
    public byte[] method3769(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3233.length || this.field3233[arg0] == null || arg1 < 0 || arg1 >= this.field3233[arg0].length) {
            return null;
        }
        if (this.field3233[arg0][arg1] == null) {
            boolean var4 = this.method3783(arg0, arg2);
            if (!var4) {
                this.method3850(arg0);
                boolean var5 = this.method3783(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class177.method1025(this.field3233[arg0][arg1], false);
        if (this.field3237) {
            this.field3233[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("iq.s(III)Z")
    public boolean method3770(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3233.length || this.field3233[arg0] == null || arg1 < 0 || arg1 >= this.field3233[arg0].length) {
            return false;
        } else if (this.field3233[arg0][arg1] != null) {
            return true;
        } else if (this.field3236[arg0] == null) {
            this.method3850(arg0);
            return this.field3236[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iq.r(II)Z")
    public boolean method3771(int arg0) {
        if (this.field3236[arg0] == null) {
            this.method3850(arg0);
            return this.field3236[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iq.v(I)Z")
    public boolean method3765() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3240.length; var2++) {
            int var3 = this.field3240[var2];
            if (this.field3236[var3] == null) {
                this.method3850(var3);
                if (this.field3236[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("iq.y(II)I")
    public int method3860(int arg0) {
        return this.field3236[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("iq.j(II)[B")
    public byte[] method3774(int arg0) {
        if (this.field3233.length == 1) {
            return this.method3768(0, arg0);
        } else if (this.field3233[arg0].length == 1) {
            return this.method3768(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iq.k(III)[B")
    public byte[] method3839(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3233.length || this.field3233[arg0] == null || arg1 < 0 || arg1 >= this.field3233[arg0].length) {
            return null;
        }
        if (this.field3233[arg0][arg1] == null) {
            boolean var3 = this.method3783(arg0, (int[]) null);
            if (!var3) {
                this.method3850(arg0);
                boolean var4 = this.method3783(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class177.method1025(this.field3233[arg0][arg1], false);
    }

    @ObfuscatedName("iq.e(II)[B")
    public byte[] method3776(int arg0) {
        if (this.field3233.length == 1) {
            return this.method3839(0, arg0);
        } else if (this.field3233[arg0].length == 1) {
            return this.method3839(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iq.o(IB)V")
    public void method3850(int arg0) {
    }

    @ObfuscatedName("iq.z(II)[I")
    public int[] method3775(int arg0) {
        return this.field3235[arg0];
    }

    @ObfuscatedName("iq.l(II)I")
    public int method3787(int arg0) {
        return this.field3233[arg0].length;
    }

    @ObfuscatedName("iq.c(I)I")
    public int method3790() {
        return this.field3233.length;
    }

    @ObfuscatedName("iq.b(II)V")
    public void method3781(int arg0) {
        for (int var2 = 0; var2 < this.field3233[arg0].length; var2++) {
            this.field3233[arg0][var2] = null;
        }
    }

    @ObfuscatedName("iq.f(I)V")
    public void method3830() {
        for (int var1 = 0; var1 < this.field3233.length; var1++) {
            if (this.field3233[var1] != null) {
                for (int var2 = 0; var2 < this.field3233[var1].length; var2++) {
                    this.field3233[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("iq.n(I[IB)Z")
    public boolean method3783(int arg0, int[] arg1) {
        if (this.field3236[arg0] == null) {
            return false;
        }
        int var3 = this.field3228[arg0];
        int[] var4 = this.field3235[arg0];
        Object[] var5 = this.field3233[arg0];
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
            var8 = class177.method1025(this.field3236[arg0], true);
            class174 var9 = new class174(var8);
            var9.method2899(arg1, 5, var9.field2405.length);
        } else {
            var8 = class177.method1025(this.field3236[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2784(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class174.method195(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class174.method195(var8, 0, var17);
            throw class153.method3659(var34, var16 + var18 + "," + this.field3226[arg0] + "," + this.field3232);
        }
        if (this.field3230) {
            this.field3236[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class174 var22 = new class174(var10);
            int[] var23 = new int[var3];
            var22.field2399 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2885();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2399 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2885();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field3237) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class177.method2441(var27[var33], false);
                }
            }
        } else if (this.field3237) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class177.method2441(var10, false);
        }
        return true;
    }

    @ObfuscatedName("iq.u(Ljava/lang/String;I)I")
    public int method3800(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3225.method3219(class271.method944(var2));
    }

    @ObfuscatedName("iq.p(ILjava/lang/String;B)I")
    public int method3785(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3224[arg0].method3219(class271.method944(var3));
    }

    @ObfuscatedName("iq.q(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3844(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3225.method3219(class271.method944(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3224[var5].method3219(class271.method944(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("iq.d(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3799(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3225.method3219(class271.method944(var3));
        int var6 = this.field3224[var5].method3219(class271.method944(var4));
        return this.method3768(var5, var6);
    }

    @ObfuscatedName("iq.h(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3788(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3225.method3219(class271.method944(var3));
        int var6 = this.field3224[var5].method3219(class271.method944(var4));
        return this.method3770(var5, var6);
    }

    @ObfuscatedName("iq.g(Ljava/lang/String;I)Z")
    public boolean method3789(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3225.method3219(class271.method944(var2));
        return this.method3771(var3);
    }

    @ObfuscatedName("iq.x(Ljava/lang/String;S)V")
    public void method3797(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3225.method3219(class271.method944(var2));
        if (var3 >= 0) {
            this.method3767(var3);
        }
    }

    @ObfuscatedName("iq.ai(Ljava/lang/String;I)I")
    public int method3772(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3225.method3219(class271.method944(var2));
        return this.method3860(var3);
    }

    @ObfuscatedName("fc.an([BI)[B")
    public static final byte[] method2784(byte[] arg0) {
        class174 var1 = new class174(arg0);
        int var2 = var1.method3061();
        int var3 = var1.method2885();
        if (var3 < 0 || !(field3238 == 0 || var3 <= field3238)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2891(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2885();
            if (var5 < 0 || field3238 != 0 && var5 > field3238) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class168.method2812(var6, var5, arg0, var3, 9);
            } else {
                field3234.method2806(var1, var6);
            }
            return var6;
        }
    }
}
