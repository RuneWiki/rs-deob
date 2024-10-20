package deob;

@ObfuscatedName("ij")
public abstract class class254 {

    @ObfuscatedName("ij.h")
    public int field3225;

    @ObfuscatedName("ij.l")
    public int[] field3226;

    @ObfuscatedName("ij.g")
    public int[] field3227;

    @ObfuscatedName("ij.b")
    public class206 field3230;

    @ObfuscatedName("ij.a")
    public int[] field3237;

    @ObfuscatedName("ij.c")
    public int[] field3224;

    @ObfuscatedName("ij.z")
    public int[] field3231;

    @ObfuscatedName("ij.j")
    public int[][] field3232;

    @ObfuscatedName("ij.d")
    public int[][] field3233;

    @ObfuscatedName("ij.t")
    public class206[] field3238;

    @ObfuscatedName("ij.f")
    public Object[] field3235;

    @ObfuscatedName("ij.i")
    public Object[][] field3236;

    @ObfuscatedName("ij.m")
    public static class183 field3228 = new class183();

    @ObfuscatedName("ij.v")
    public int field3240;

    @ObfuscatedName("ij.r")
    public boolean field3239;

    @ObfuscatedName("ij.x")
    public boolean field3229;

    @ObfuscatedName("ij.y")
    public static int field3241 = 0;

    public class254(boolean arg0, boolean arg1) {
        this.field3239 = arg0;
        this.field3229 = arg1;
    }

    @ObfuscatedName("ij.n([BB)V")
    public void method4511(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class190.field2422[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field3240 = var5;
        class190 var8 = new class190(method3174(arg0));
        int var9 = var8.method3511();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method3562();
        }
        int var10 = var8.method3511();
        if (var9 >= 7) {
            this.field3225 = var8.method3527();
        } else {
            this.field3225 = var8.method3513();
        }
        int var11 = 0;
        int var12 = -1;
        this.field3226 = new int[this.field3225];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field3225; var13++) {
                this.field3226[var13] = var11 += var8.method3527();
                if (this.field3226[var13] > var12) {
                    var12 = this.field3226[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field3225; var14++) {
                this.field3226[var14] = var11 += var8.method3513();
                if (this.field3226[var14] > var12) {
                    var12 = this.field3226[var14];
                }
            }
        }
        this.field3237 = new int[var12 + 1];
        this.field3224 = new int[var12 + 1];
        this.field3231 = new int[var12 + 1];
        this.field3232 = new int[var12 + 1][];
        this.field3235 = new Object[var12 + 1];
        this.field3236 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field3227 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field3225; var15++) {
                this.field3227[this.field3226[var15]] = var8.method3562();
            }
            this.field3230 = new class206(this.field3227);
        }
        for (int var16 = 0; var16 < this.field3225; var16++) {
            this.field3237[this.field3226[var16]] = var8.method3562();
        }
        for (int var17 = 0; var17 < this.field3225; var17++) {
            this.field3224[this.field3226[var17]] = var8.method3562();
        }
        for (int var18 = 0; var18 < this.field3225; var18++) {
            this.field3231[this.field3226[var18]] = var8.method3513();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field3225; var19++) {
                int var20 = this.field3226[var19];
                int var21 = this.field3231[var20];
                int var22 = 0;
                int var23 = -1;
                this.field3232[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field3232[var20][var24] = var22 += var8.method3527();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field3236[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field3225; var26++) {
                int var27 = this.field3226[var26];
                int var28 = this.field3231[var27];
                int var29 = 0;
                int var30 = -1;
                this.field3232[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field3232[var27][var31] = var29 += var8.method3513();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field3236[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field3233 = new int[var12 + 1][];
        this.field3238 = new class206[var12 + 1];
        for (int var33 = 0; var33 < this.field3225; var33++) {
            int var34 = this.field3226[var33];
            int var35 = this.field3231[var34];
            this.field3233[var34] = new int[this.field3236[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field3233[var34][this.field3232[var34][var36]] = var8.method3562();
            }
            this.field3238[var34] = new class206(this.field3233[var34]);
        }
    }

    @ObfuscatedName("ij.h(II)V")
    public void method4526(int arg0) {
    }

    @ObfuscatedName("ij.l(III)[B")
    public byte[] method4494(int arg0, int arg1) {
        return this.method4455(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ij.g(II[II)[B")
    public byte[] method4455(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3236.length || this.field3236[arg0] == null || arg1 < 0 || arg1 >= this.field3236[arg0].length) {
            return null;
        }
        if (this.field3236[arg0][arg1] == null) {
            boolean var4 = this.method4471(arg0, arg2);
            if (!var4) {
                this.method4464(arg0);
                boolean var5 = this.method4471(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class194.method3079(this.field3236[arg0][arg1], false);
        if (this.field3229) {
            this.field3236[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ij.b(III)Z")
    public boolean method4456(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3236.length || this.field3236[arg0] == null || arg1 < 0 || arg1 >= this.field3236[arg0].length) {
            return false;
        } else if (this.field3236[arg0][arg1] != null) {
            return true;
        } else if (this.field3235[arg0] == null) {
            this.method4464(arg0);
            return this.field3235[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ij.a(II)Z")
    public boolean method4457(int arg0) {
        if (this.field3236.length == 1) {
            return this.method4456(0, arg0);
        } else if (this.field3236[arg0].length == 1) {
            return this.method4456(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ij.c(IS)Z")
    public boolean method4458(int arg0) {
        if (this.field3235[arg0] == null) {
            this.method4464(arg0);
            return this.field3235[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ij.z(I)Z")
    public boolean method4498() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3226.length; var2++) {
            int var3 = this.field3226[var2];
            if (this.field3235[var3] == null) {
                this.method4464(var3);
                if (this.field3235[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ij.j(II)I")
    public int method4541(int arg0) {
        return this.field3235[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ij.d(IB)[B")
    public byte[] method4470(int arg0) {
        if (this.field3236.length == 1) {
            return this.method4494(0, arg0);
        } else if (this.field3236[arg0].length == 1) {
            return this.method4494(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ij.i(IIB)[B")
    public byte[] method4462(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3236.length || this.field3236[arg0] == null || arg1 < 0 || arg1 >= this.field3236[arg0].length) {
            return null;
        }
        if (this.field3236[arg0][arg1] == null) {
            boolean var3 = this.method4471(arg0, (int[]) null);
            if (!var3) {
                this.method4464(arg0);
                boolean var4 = this.method4471(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class194.method3079(this.field3236[arg0][arg1], false);
    }

    @ObfuscatedName("ij.m(II)[B")
    public byte[] method4474(int arg0) {
        if (this.field3236.length == 1) {
            return this.method4462(0, arg0);
        } else if (this.field3236[arg0].length == 1) {
            return this.method4462(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ij.v(IB)V")
    public void method4464(int arg0) {
    }

    @ObfuscatedName("ij.r(IB)[I")
    public int[] method4465(int arg0) {
        return arg0 >= 0 && arg0 < this.field3232.length ? this.field3232[arg0] : null;
    }

    @ObfuscatedName("ij.x(II)I")
    public int method4466(int arg0) {
        return this.field3236[arg0].length;
    }

    @ObfuscatedName("ij.y(B)I")
    public int method4467() {
        return this.field3236.length;
    }

    @ObfuscatedName("ij.p(B)V")
    public void method4453() {
        for (int var1 = 0; var1 < this.field3235.length; var1++) {
            this.field3235[var1] = null;
        }
    }

    @ObfuscatedName("ij.k(IB)V")
    public void method4508(int arg0) {
        for (int var2 = 0; var2 < this.field3236[arg0].length; var2++) {
            this.field3236[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ij.o(B)V")
    public void method4460() {
        for (int var1 = 0; var1 < this.field3236.length; var1++) {
            if (this.field3236[var1] != null) {
                for (int var2 = 0; var2 < this.field3236[var1].length; var2++) {
                    this.field3236[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ij.s(I[II)Z")
    public boolean method4471(int arg0, int[] arg1) {
        if (this.field3235[arg0] == null) {
            return false;
        }
        int var3 = this.field3231[arg0];
        int[] var4 = this.field3232[arg0];
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
            var8 = class194.method3079(this.field3235[arg0], true);
            class190 var9 = new class190(var8);
            var9.method3533(arg1, 5, var9.field2424.length);
        } else {
            var8 = class194.method3079(this.field3235[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3174(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class190.field2422[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class190.field2422[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class160.method3800(var42, var20 + var24 + "," + this.field3237[arg0] + "," + this.field3240);
        }
        if (this.field3239) {
            this.field3235[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class190 var30 = new class190(var10);
            int[] var31 = new int[var3];
            var30.field2423 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method3562();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field2423 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method3562();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field3229) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class194.method945(var35[var41], false);
                }
            }
        } else if (this.field3229) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class194.method945(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ij.u(Ljava/lang/String;B)I")
    public int method4472(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3230.method3886(class311.method3244(var2));
    }

    @ObfuscatedName("ij.aa(ILjava/lang/String;I)I")
    public int method4473(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3238[arg0].method3886(class311.method3244(var3));
    }

    @ObfuscatedName("ij.ai(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4517(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3230.method3886(class311.method3244(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3238[var5].method3886(class311.method3244(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ij.ag(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4475(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3230.method3886(class311.method3244(var3));
        int var6 = this.field3238[var5].method3886(class311.method3244(var4));
        return this.method4494(var5, var6);
    }

    @ObfuscatedName("ij.at(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4528(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3230.method3886(class311.method3244(var3));
        int var6 = this.field3238[var5].method3886(class311.method3244(var4));
        return this.method4456(var5, var6);
    }

    @ObfuscatedName("ij.ad(Ljava/lang/String;I)Z")
    public boolean method4477(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3230.method3886(class311.method3244(var2));
        return this.method4458(var3);
    }

    @ObfuscatedName("ij.as(Ljava/lang/String;B)V")
    public void method4478(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3230.method3886(class311.method3244(var2));
        if (var3 >= 0) {
            this.method4526(var3);
        }
    }

    @ObfuscatedName("ij.ac(Ljava/lang/String;I)I")
    public int method4479(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3230.method3886(class311.method3244(var2));
        return this.method4541(var3);
    }

    @ObfuscatedName("eq.an([BI)[B")
    public static final byte[] method3174(byte[] arg0) {
        class190 var1 = new class190(arg0);
        int var2 = var1.method3511();
        int var3 = var1.method3562();
        if (var3 < 0 || !(field3241 == 0 || var3 <= field3241)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3523(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3562();
            if (var5 < 0 || field3241 != 0 && var5 > field3241) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class184.method3448(var6, var5, arg0, var3, 9);
            } else {
                field3228.method3445(var1, var6);
            }
            return var6;
        }
    }
}
