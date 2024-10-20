package deob;

@ObfuscatedName("ia")
public abstract class class237 {

    @ObfuscatedName("ia.j")
    public int field3204;

    @ObfuscatedName("ia.h")
    public int[] field3208;

    @ObfuscatedName("ia.f")
    public int[] field3218;

    @ObfuscatedName("ia.p")
    public class189 field3206;

    @ObfuscatedName("ia.x")
    public int[] field3214;

    @ObfuscatedName("ia.g")
    public int[] field3207;

    @ObfuscatedName("ia.c")
    public int[] field3205;

    @ObfuscatedName("ia.l")
    public int[][] field3209;

    @ObfuscatedName("ia.w")
    public int[][] field3210;

    @ObfuscatedName("ia.b")
    public class189[] field3202;

    @ObfuscatedName("ia.o")
    public Object[] field3212;

    @ObfuscatedName("ia.m")
    public Object[][] field3213;

    @ObfuscatedName("ia.i")
    public static class168 field3203 = new class168();

    @ObfuscatedName("ia.s")
    public int field3215;

    @ObfuscatedName("ia.r")
    public boolean field3216;

    @ObfuscatedName("ia.e")
    public boolean field3217;

    @ObfuscatedName("ia.a")
    public static int field3211 = 0;

    public class237(boolean arg0, boolean arg1) {
        this.field3216 = arg0;
        this.field3217 = arg1;
    }

    @ObfuscatedName("ia.j([BI)V")
    public void method3829(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class175.method2806(arg0, 0, var2);
        this.field3215 = var3;
        class175 var4 = new class175(method2836(arg0));
        int var5 = var4.method2903();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2908();
        }
        int var6 = var4.method2903();
        if (var5 >= 7) {
            this.field3204 = var4.method2917();
        } else {
            this.field3204 = var4.method3023();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3208 = new int[this.field3204];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3204; var9++) {
                this.field3208[var9] = var7 += var4.method2917();
                if (this.field3208[var9] > var8) {
                    var8 = this.field3208[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3204; var10++) {
                this.field3208[var10] = var7 += var4.method3023();
                if (this.field3208[var10] > var8) {
                    var8 = this.field3208[var10];
                }
            }
        }
        this.field3214 = new int[var8 + 1];
        this.field3207 = new int[var8 + 1];
        this.field3205 = new int[var8 + 1];
        this.field3209 = new int[var8 + 1][];
        this.field3212 = new Object[var8 + 1];
        this.field3213 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3218 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3204; var11++) {
                this.field3218[this.field3208[var11]] = var4.method2908();
            }
            this.field3206 = new class189(this.field3218);
        }
        for (int var12 = 0; var12 < this.field3204; var12++) {
            this.field3214[this.field3208[var12]] = var4.method2908();
        }
        for (int var13 = 0; var13 < this.field3204; var13++) {
            this.field3207[this.field3208[var13]] = var4.method2908();
        }
        for (int var14 = 0; var14 < this.field3204; var14++) {
            this.field3205[this.field3208[var14]] = var4.method3023();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3204; var15++) {
                int var16 = this.field3208[var15];
                int var17 = this.field3205[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3209[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3209[var16][var20] = var18 += var4.method2917();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3213[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3204; var22++) {
                int var23 = this.field3208[var22];
                int var24 = this.field3205[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3209[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3209[var23][var27] = var25 += var4.method3023();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3213[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3210 = new int[var8 + 1][];
        this.field3202 = new class189[var8 + 1];
        for (int var29 = 0; var29 < this.field3204; var29++) {
            int var30 = this.field3208[var29];
            int var31 = this.field3205[var30];
            this.field3210[var30] = new int[this.field3213[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3210[var30][this.field3209[var30][var32]] = var4.method2908();
            }
            this.field3202[var30] = new class189(this.field3210[var30]);
        }
    }

    @ObfuscatedName("ia.h(II)V")
    public void method3772(int arg0) {
    }

    @ObfuscatedName("ia.f(III)[B")
    public byte[] method3773(int arg0, int arg1) {
        return this.method3774(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ia.p(II[IB)[B")
    public byte[] method3774(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3213.length || this.field3213[arg0] == null || arg1 < 0 || arg1 >= this.field3213[arg0].length) {
            return null;
        }
        if (this.field3213[arg0][arg1] == null) {
            boolean var4 = this.method3815(arg0, arg2);
            if (!var4) {
                this.method3814(arg0);
                boolean var5 = this.method3815(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class178.method1573(this.field3213[arg0][arg1], false);
        if (this.field3217) {
            this.field3213[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ia.x(III)Z")
    public boolean method3775(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3213.length || this.field3213[arg0] == null || arg1 < 0 || arg1 >= this.field3213[arg0].length) {
            return false;
        } else if (this.field3213[arg0][arg1] != null) {
            return true;
        } else if (this.field3212[arg0] == null) {
            this.method3814(arg0);
            return this.field3212[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ia.g(IB)Z")
    public boolean method3776(int arg0) {
        if (this.field3212[arg0] == null) {
            this.method3814(arg0);
            return this.field3212[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ia.c(I)Z")
    public boolean method3777() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3208.length; var2++) {
            int var3 = this.field3208[var2];
            if (this.field3212[var3] == null) {
                this.method3814(var3);
                if (this.field3212[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ia.l(IS)I")
    public int method3778(int arg0) {
        return this.field3212[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ia.w(II)[B")
    public byte[] method3779(int arg0) {
        if (this.field3213.length == 1) {
            return this.method3773(0, arg0);
        } else if (this.field3213[arg0].length == 1) {
            return this.method3773(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ia.b(III)[B")
    public byte[] method3780(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3213.length || this.field3213[arg0] == null || arg1 < 0 || arg1 >= this.field3213[arg0].length) {
            return null;
        }
        if (this.field3213[arg0][arg1] == null) {
            boolean var3 = this.method3815(arg0, (int[]) null);
            if (!var3) {
                this.method3814(arg0);
                boolean var4 = this.method3815(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class178.method1573(this.field3213[arg0][arg1], false);
    }

    @ObfuscatedName("ia.o(II)[B")
    public byte[] method3781(int arg0) {
        if (this.field3213.length == 1) {
            return this.method3780(0, arg0);
        } else if (this.field3213[arg0].length == 1) {
            return this.method3780(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ia.m(II)V")
    public void method3814(int arg0) {
    }

    @ObfuscatedName("ia.e(II)[I")
    public int[] method3783(int arg0) {
        return this.field3209[arg0];
    }

    @ObfuscatedName("ia.a(II)I")
    public int method3784(int arg0) {
        return this.field3213[arg0].length;
    }

    @ObfuscatedName("ia.v(I)I")
    public int method3785() {
        return this.field3213.length;
    }

    @ObfuscatedName("ia.t(IS)V")
    public void method3786(int arg0) {
        for (int var2 = 0; var2 < this.field3213[arg0].length; var2++) {
            this.field3213[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ia.y(I)V")
    public void method3770() {
        for (int var1 = 0; var1 < this.field3213.length; var1++) {
            if (this.field3213[var1] != null) {
                for (int var2 = 0; var2 < this.field3213[var1].length; var2++) {
                    this.field3213[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ia.u(I[II)Z")
    public boolean method3815(int arg0, int[] arg1) {
        if (this.field3212[arg0] == null) {
            return false;
        }
        int var3 = this.field3205[arg0];
        int[] var4 = this.field3209[arg0];
        Object[] var5 = this.field3213[arg0];
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
            var8 = class178.method1573(this.field3212[arg0], true);
            class175 var9 = new class175(var8);
            var9.method2923(arg1, 5, var9.field2390.length);
        } else {
            var8 = class178.method1573(this.field3212[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2836(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class175.method2806(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class175.method2806(var8, 0, var18);
            throw class154.method2677(var35, var17 + var19 + "," + this.field3214[arg0] + "," + this.field3215);
        }
        if (this.field3216) {
            this.field3212[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class175 var23 = new class175(var10);
            int[] var24 = new int[var3];
            var23.field2394 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2908();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2394 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2908();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field3217) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class178.method1483(var28[var34], false);
                }
            }
        } else if (this.field3217) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class178.method1483(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ia.n(Ljava/lang/String;I)I")
    public int method3789(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3206.method3251(class272.method63(var2));
    }

    @ObfuscatedName("ia.d(ILjava/lang/String;I)I")
    public int method3826(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3202[arg0].method3251(class272.method63(var3));
    }

    @ObfuscatedName("ia.ax(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3851(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3206.method3251(class272.method63(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3202[var5].method3251(class272.method63(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ia.ao(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3866(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3206.method3251(class272.method63(var3));
        int var6 = this.field3202[var5].method3251(class272.method63(var4));
        return this.method3773(var5, var6);
    }

    @ObfuscatedName("ia.an(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method3793(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3206.method3251(class272.method63(var3));
        int var6 = this.field3202[var5].method3251(class272.method63(var4));
        return this.method3775(var5, var6);
    }

    @ObfuscatedName("ia.ar(Ljava/lang/String;B)Z")
    public boolean method3794(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3206.method3251(class272.method63(var2));
        return this.method3776(var3);
    }

    @ObfuscatedName("ia.ag(Ljava/lang/String;I)V")
    public void method3795(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3206.method3251(class272.method63(var2));
        if (var3 >= 0) {
            this.method3772(var3);
        }
    }

    @ObfuscatedName("ia.av(Ljava/lang/String;B)I")
    public int method3796(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3206.method3251(class272.method63(var2));
        return this.method3778(var3);
    }

    @ObfuscatedName("fp.ab([BB)[B")
    public static final byte[] method2836(byte[] arg0) {
        class175 var1 = new class175(arg0);
        int var2 = var1.method2903();
        int var3 = var1.method2908();
        if (var3 < 0 || !(field3211 == 0 || var3 <= field3211)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3052(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2908();
            if (var5 < 0 || field3211 != 0 && var5 > field3211) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class169.method2838(var6, var5, arg0, var3, 9);
            } else {
                field3203.method2833(var1, var6);
            }
            return var6;
        }
    }
}
