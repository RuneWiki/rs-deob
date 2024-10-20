package deob;

@ObfuscatedName("ir")
public abstract class class245 {

    @ObfuscatedName("ir.f")
    public int field3204;

    @ObfuscatedName("ir.q")
    public int[] field3219;

    @ObfuscatedName("ir.w")
    public int[] field3224;

    @ObfuscatedName("ir.o")
    public class336 field3203;

    @ObfuscatedName("ir.u")
    public int[] field3208;

    @ObfuscatedName("ir.g")
    public int[] field3207;

    @ObfuscatedName("ir.l")
    public int[] field3206;

    @ObfuscatedName("ir.e")
    public int[][] field3211;

    @ObfuscatedName("ir.x")
    public int[][] field3212;

    @ObfuscatedName("ir.d")
    public class336[] field3213;

    @ObfuscatedName("ir.k")
    public Object[] field3214;

    @ObfuscatedName("ir.n")
    public Object[][] field3210;

    @ObfuscatedName("ir.i")
    public static class195 field3217 = new class195();

    @ObfuscatedName("ir.a")
    public int field3215;

    @ObfuscatedName("ir.z")
    public boolean field3205;

    @ObfuscatedName("ir.j")
    public boolean field3218;

    @ObfuscatedName("ir.s")
    public static int field3220 = 0;

    public class245(boolean arg0, boolean arg1) {
        this.field3205 = arg0;
        this.field3218 = arg1;
    }

    @ObfuscatedName("ir.m([BB)V")
    public void method4154(byte[] arg0) {
        this.field3215 = class202.method2987(arg0, arg0.length);
        class202 var2 = new class202(method4139(arg0));
        int var3 = var2.method3551();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method3620();
        }
        int var4 = var2.method3551();
        if (var3 >= 7) {
            this.field3204 = var2.method3625();
        } else {
            this.field3204 = var2.method3530();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3219 = new int[this.field3204];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3204; var7++) {
                this.field3219[var7] = var5 += var2.method3625();
                if (this.field3219[var7] > var6) {
                    var6 = this.field3219[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3204; var8++) {
                this.field3219[var8] = var5 += var2.method3530();
                if (this.field3219[var8] > var6) {
                    var6 = this.field3219[var8];
                }
            }
        }
        this.field3208 = new int[var6 + 1];
        this.field3207 = new int[var6 + 1];
        this.field3206 = new int[var6 + 1];
        this.field3211 = new int[var6 + 1][];
        this.field3214 = new Object[var6 + 1];
        this.field3210 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3224 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3204; var9++) {
                this.field3224[this.field3219[var9]] = var2.method3620();
            }
            this.field3203 = new class336(this.field3224);
        }
        for (int var10 = 0; var10 < this.field3204; var10++) {
            this.field3208[this.field3219[var10]] = var2.method3620();
        }
        for (int var11 = 0; var11 < this.field3204; var11++) {
            this.field3207[this.field3219[var11]] = var2.method3620();
        }
        for (int var12 = 0; var12 < this.field3204; var12++) {
            this.field3206[this.field3219[var12]] = var2.method3530();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3204; var13++) {
                int var14 = this.field3219[var13];
                int var15 = this.field3206[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3211[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3211[var14][var18] = var16 += var2.method3625();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3210[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3204; var20++) {
                int var21 = this.field3219[var20];
                int var22 = this.field3206[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3211[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3211[var21][var25] = var23 += var2.method3530();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3210[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3212 = new int[var6 + 1][];
        this.field3213 = new class336[var6 + 1];
        for (int var27 = 0; var27 < this.field3204; var27++) {
            int var28 = this.field3219[var27];
            int var29 = this.field3206[var28];
            this.field3212[var28] = new int[this.field3210[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3212[var28][this.field3211[var28][var30]] = var2.method3620();
            }
            this.field3213[var28] = new class336(this.field3212[var28]);
        }
    }

    @ObfuscatedName("ir.f(II)V")
    public void method4203(int arg0) {
    }

    @ObfuscatedName("ir.q(III)[B")
    public byte[] method4156(int arg0, int arg1) {
        return this.method4157(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ir.w(II[II)[B")
    public byte[] method4157(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3210.length || this.field3210[arg0] == null || arg1 < 0 || arg1 >= this.field3210[arg0].length) {
            return null;
        }
        if (this.field3210[arg0][arg1] == null) {
            boolean var4 = this.method4173(arg0, arg2);
            if (!var4) {
                this.method4166(arg0);
                boolean var5 = this.method4173(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class206.method2524(this.field3210[arg0][arg1], false);
        if (this.field3218) {
            this.field3210[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ir.o(III)Z")
    public boolean method4158(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3210.length || this.field3210[arg0] == null || arg1 < 0 || arg1 >= this.field3210[arg0].length) {
            return false;
        } else if (this.field3210[arg0][arg1] != null) {
            return true;
        } else if (this.field3214[arg0] == null) {
            this.method4166(arg0);
            return this.field3214[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ir.u(II)Z")
    public boolean method4159(int arg0) {
        if (this.field3210.length == 1) {
            return this.method4158(0, arg0);
        } else if (this.field3210[arg0].length == 1) {
            return this.method4158(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ir.g(II)Z")
    public boolean method4225(int arg0) {
        if (this.field3214[arg0] == null) {
            this.method4166(arg0);
            return this.field3214[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ir.l(I)Z")
    public boolean method4161() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3219.length; var2++) {
            int var3 = this.field3219[var2];
            if (this.field3214[var3] == null) {
                this.method4166(var3);
                if (this.field3214[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ir.e(II)I")
    public int method4162(int arg0) {
        return this.field3214[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ir.x(IS)[B")
    public byte[] method4195(int arg0) {
        if (this.field3210.length == 1) {
            return this.method4156(0, arg0);
        } else if (this.field3210[arg0].length == 1) {
            return this.method4156(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ir.d(III)[B")
    public byte[] method4164(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3210.length || this.field3210[arg0] == null || arg1 < 0 || arg1 >= this.field3210[arg0].length) {
            return null;
        }
        if (this.field3210[arg0][arg1] == null) {
            boolean var3 = this.method4173(arg0, (int[]) null);
            if (!var3) {
                this.method4166(arg0);
                boolean var4 = this.method4173(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class206.method2524(this.field3210[arg0][arg1], false);
    }

    @ObfuscatedName("ir.a(IB)[B")
    public byte[] method4185(int arg0) {
        if (this.field3210.length == 1) {
            return this.method4164(0, arg0);
        } else if (this.field3210[arg0].length == 1) {
            return this.method4164(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ir.z(II)V")
    public void method4166(int arg0) {
    }

    @ObfuscatedName("ir.j(IB)[I")
    public int[] method4167(int arg0) {
        return arg0 >= 0 && arg0 < this.field3211.length ? this.field3211[arg0] : null;
    }

    @ObfuscatedName("ir.s(II)I")
    public int method4168(int arg0) {
        return this.field3210[arg0].length;
    }

    @ObfuscatedName("ir.t(I)I")
    public int method4205() {
        return this.field3210.length;
    }

    @ObfuscatedName("ir.y(B)V")
    public void method4170() {
        for (int var1 = 0; var1 < this.field3214.length; var1++) {
            this.field3214[var1] = null;
        }
    }

    @ObfuscatedName("ir.h(II)V")
    public void method4171(int arg0) {
        for (int var2 = 0; var2 < this.field3210[arg0].length; var2++) {
            this.field3210[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ir.b(I)V")
    public void method4172() {
        for (int var1 = 0; var1 < this.field3210.length; var1++) {
            if (this.field3210[var1] != null) {
                for (int var2 = 0; var2 < this.field3210[var1].length; var2++) {
                    this.field3210[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ir.c(I[II)Z")
    public boolean method4173(int arg0, int[] arg1) {
        if (this.field3214[arg0] == null) {
            return false;
        }
        int var3 = this.field3206[arg0];
        int[] var4 = this.field3211[arg0];
        Object[] var5 = this.field3210[arg0];
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
            var8 = class206.method2524(this.field3214[arg0], true);
            class202 var9 = new class202(var8);
            var9.method3439(arg1, 5, var9.field2440.length);
        } else {
            var8 = class206.method2524(this.field3214[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method4139(var8);
        } catch (RuntimeException var27) {
            throw class166.method1936(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class202.method2987(var8, var8.length) + "," + class202.method2987(var8, var8.length - 2) + "," + this.field3208[arg0] + "," + this.field3215);
        }
        if (this.field3205) {
            this.field3214[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class202 var15 = new class202(var10);
            int[] var16 = new int[var3];
            var15.field2439 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method3620();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2439 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method3620();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3218) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class206.method1903(var20[var26], false);
                }
            }
        } else if (this.field3218) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class206.method1903(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ir.p(Ljava/lang/String;I)I")
    public int method4174(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3203.method5931(class309.method1532(var2));
    }

    @ObfuscatedName("ir.v(ILjava/lang/String;I)I")
    public int method4175(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3213[arg0].method5931(class309.method1532(var3));
    }

    @ObfuscatedName("ir.ag(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4207(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3203.method5931(class309.method1532(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3213[var5].method5931(class309.method1532(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ir.aq(Ljava/lang/String;Ljava/lang/String;S)[B")
    public byte[] method4163(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3203.method5931(class309.method1532(var3));
        int var6 = this.field3213[var5].method5931(class309.method1532(var4));
        return this.method4156(var5, var6);
    }

    @ObfuscatedName("ir.aj(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4178(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3203.method5931(class309.method1532(var3));
        int var6 = this.field3213[var5].method5931(class309.method1532(var4));
        return this.method4158(var5, var6);
    }

    @ObfuscatedName("ir.av(Ljava/lang/String;I)Z")
    public boolean method4177(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3203.method5931(class309.method1532(var2));
        return this.method4225(var3);
    }

    @ObfuscatedName("ir.ar(Ljava/lang/String;B)V")
    public void method4180(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3203.method5931(class309.method1532(var2));
        if (var3 >= 0) {
            this.method4203(var3);
        }
    }

    @ObfuscatedName("ir.ac(Ljava/lang/String;I)I")
    public int method4242(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3203.method5931(class309.method1532(var2));
        return this.method4162(var3);
    }

    @ObfuscatedName("id.ay([BI)[B")
    public static final byte[] method4139(byte[] arg0) {
        class202 var1 = new class202(arg0);
        int var2 = var1.method3551();
        int var3 = var1.method3620();
        if (var3 < 0 || !(field3220 == 0 || var3 <= field3220)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3429(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3620();
            if (var5 < 0 || field3220 != 0 && var5 > field3220) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class196.method3353(var6, var5, arg0, var3, 9);
            } else {
                field3217.method3347(var1, var6);
            }
            return var6;
        }
    }
}
