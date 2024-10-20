package deob;

@ObfuscatedName("ir")
public abstract class class248 {

    @ObfuscatedName("ir.w")
    public int field3172;

    @ObfuscatedName("ir.s")
    public int[] field3162;

    @ObfuscatedName("ir.l")
    public int[] field3161;

    @ObfuscatedName("ir.u")
    public class199 field3164;

    @ObfuscatedName("ir.q")
    public int[] field3165;

    @ObfuscatedName("ir.k")
    public int[] field3163;

    @ObfuscatedName("ir.i")
    public int[] field3167;

    @ObfuscatedName("ir.x")
    public int[][] field3168;

    @ObfuscatedName("ir.e")
    public int[][] field3169;

    @ObfuscatedName("ir.p")
    public class199[] field3174;

    @ObfuscatedName("ir.b")
    public Object[] field3166;

    @ObfuscatedName("ir.n")
    public Object[][] field3170;

    @ObfuscatedName("ir.f")
    public static class176 field3173 = new class176();

    @ObfuscatedName("ir.g")
    public int field3176;

    @ObfuscatedName("ir.m")
    public boolean field3175;

    @ObfuscatedName("ir.r")
    public boolean field3171;

    @ObfuscatedName("ir.t")
    public static int field3177 = 0;

    public class248(boolean arg0, boolean arg1) {
        this.field3175 = arg0;
        this.field3171 = arg1;
    }

    @ObfuscatedName("ir.z([BB)V")
    public void method4244(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class183.method3507(arg0, 0, var2);
        this.field3176 = var3;
        class183 var4 = new class183(method833(arg0));
        int var5 = var4.method3247();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method3374();
        }
        int var6 = var4.method3247();
        if (var5 >= 7) {
            this.field3172 = var4.method3314();
        } else {
            this.field3172 = var4.method3253();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3162 = new int[this.field3172];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3172; var9++) {
                this.field3162[var9] = var7 += var4.method3314();
                if (this.field3162[var9] > var8) {
                    var8 = this.field3162[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3172; var10++) {
                this.field3162[var10] = var7 += var4.method3253();
                if (this.field3162[var10] > var8) {
                    var8 = this.field3162[var10];
                }
            }
        }
        this.field3165 = new int[var8 + 1];
        this.field3163 = new int[var8 + 1];
        this.field3167 = new int[var8 + 1];
        this.field3168 = new int[var8 + 1][];
        this.field3166 = new Object[var8 + 1];
        this.field3170 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3161 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3172; var11++) {
                this.field3161[this.field3162[var11]] = var4.method3374();
            }
            this.field3164 = new class199(this.field3161);
        }
        for (int var12 = 0; var12 < this.field3172; var12++) {
            this.field3165[this.field3162[var12]] = var4.method3374();
        }
        for (int var13 = 0; var13 < this.field3172; var13++) {
            this.field3163[this.field3162[var13]] = var4.method3374();
        }
        for (int var14 = 0; var14 < this.field3172; var14++) {
            this.field3167[this.field3162[var14]] = var4.method3253();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3172; var15++) {
                int var16 = this.field3162[var15];
                int var17 = this.field3167[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3168[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3168[var16][var20] = var18 += var4.method3314();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3170[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3172; var22++) {
                int var23 = this.field3162[var22];
                int var24 = this.field3167[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3168[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3168[var23][var27] = var25 += var4.method3253();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3170[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3169 = new int[var8 + 1][];
        this.field3174 = new class199[var8 + 1];
        for (int var29 = 0; var29 < this.field3172; var29++) {
            int var30 = this.field3162[var29];
            int var31 = this.field3167[var30];
            this.field3169[var30] = new int[this.field3170[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3169[var30][this.field3168[var30][var32]] = var4.method3374();
            }
            this.field3174[var30] = new class199(this.field3169[var30]);
        }
    }

    @ObfuscatedName("ir.w(IB)V")
    public void method4245(int arg0) {
    }

    @ObfuscatedName("ir.s(III)[B")
    public byte[] method4247(int arg0, int arg1) {
        return this.method4250(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ir.l(II[IB)[B")
    public byte[] method4250(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3170.length || this.field3170[arg0] == null || arg1 < 0 || arg1 >= this.field3170[arg0].length) {
            return null;
        }
        if (this.field3170[arg0][arg1] == null) {
            boolean var4 = this.method4315(arg0, arg2);
            if (!var4) {
                this.method4322(arg0);
                boolean var5 = this.method4315(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class187.method2055(this.field3170[arg0][arg1], false);
        if (this.field3171) {
            this.field3170[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ir.u(IIB)Z")
    public boolean method4318(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3170.length || this.field3170[arg0] == null || arg1 < 0 || arg1 >= this.field3170[arg0].length) {
            return false;
        } else if (this.field3170[arg0][arg1] != null) {
            return true;
        } else if (this.field3166[arg0] == null) {
            this.method4322(arg0);
            return this.field3166[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ir.q(IB)Z")
    public boolean method4249(int arg0) {
        if (this.field3170.length == 1) {
            return this.method4318(0, arg0);
        } else if (this.field3170[arg0].length == 1) {
            return this.method4318(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ir.i(IB)Z")
    public boolean method4329(int arg0) {
        if (this.field3166[arg0] == null) {
            this.method4322(arg0);
            return this.field3166[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ir.x(I)Z")
    public boolean method4251() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3162.length; var2++) {
            int var3 = this.field3162[var2];
            if (this.field3166[var3] == null) {
                this.method4322(var3);
                if (this.field3166[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ir.e(IB)I")
    public int method4252(int arg0) {
        return this.field3166[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ir.p(II)[B")
    public byte[] method4311(int arg0) {
        if (this.field3170.length == 1) {
            return this.method4247(0, arg0);
        } else if (this.field3170[arg0].length == 1) {
            return this.method4247(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ir.b(III)[B")
    public byte[] method4298(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3170.length || this.field3170[arg0] == null || arg1 < 0 || arg1 >= this.field3170[arg0].length) {
            return null;
        }
        if (this.field3170[arg0][arg1] == null) {
            boolean var3 = this.method4315(arg0, (int[]) null);
            if (!var3) {
                this.method4322(arg0);
                boolean var4 = this.method4315(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class187.method2055(this.field3170[arg0][arg1], false);
    }

    @ObfuscatedName("ir.n(IS)[B")
    public byte[] method4248(int arg0) {
        if (this.field3170.length == 1) {
            return this.method4298(0, arg0);
        } else if (this.field3170[arg0].length == 1) {
            return this.method4298(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ir.f(IB)V")
    public void method4322(int arg0) {
    }

    @ObfuscatedName("ir.g(II)[I")
    public int[] method4290(int arg0) {
        return this.field3168[arg0];
    }

    @ObfuscatedName("ir.m(II)I")
    public int method4258(int arg0) {
        return this.field3170[arg0].length;
    }

    @ObfuscatedName("ir.r(I)I")
    public int method4259() {
        return this.field3170.length;
    }

    @ObfuscatedName("ir.t(B)V")
    public void method4324() {
        for (int var1 = 0; var1 < this.field3166.length; var1++) {
            this.field3166[var1] = null;
        }
    }

    @ObfuscatedName("ir.o(IB)V")
    public void method4261(int arg0) {
        for (int var2 = 0; var2 < this.field3170[arg0].length; var2++) {
            this.field3170[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ir.y(I)V")
    public void method4262() {
        for (int var1 = 0; var1 < this.field3170.length; var1++) {
            if (this.field3170[var1] != null) {
                for (int var2 = 0; var2 < this.field3170[var1].length; var2++) {
                    this.field3170[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ir.a(I[IB)Z")
    public boolean method4315(int arg0, int[] arg1) {
        if (this.field3166[arg0] == null) {
            return false;
        }
        int var3 = this.field3167[arg0];
        int[] var4 = this.field3168[arg0];
        Object[] var5 = this.field3170[arg0];
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
            var8 = class187.method2055(this.field3166[arg0], true);
            class183 var9 = new class183(var8);
            var9.method3273(arg1, 5, var9.field2339.length);
        } else {
            var8 = class187.method2055(this.field3166[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method833(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class183.method3507(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class183.method3507(var8, 0, var17);
            throw class153.method2039(var34, var16 + var18 + "," + this.field3165[arg0] + "," + this.field3176);
        }
        if (this.field3175) {
            this.field3166[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class183 var22 = new class183(var10);
            int[] var23 = new int[var3];
            var22.field2340 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method3374();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2340 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method3374();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field3171) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class187.method3064(var27[var33], false);
                }
            }
        } else if (this.field3171) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class187.method3064(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ir.c(Ljava/lang/String;I)I")
    public int method4264(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3164.method3659(class306.method4846(var2));
    }

    @ObfuscatedName("ir.v(ILjava/lang/String;I)I")
    public int method4265(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3174[arg0].method3659(class306.method4846(var3));
    }

    @ObfuscatedName("ir.af(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4266(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3164.method3659(class306.method4846(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3174[var5].method3659(class306.method4846(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ir.ah(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4306(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3164.method3659(class306.method4846(var3));
        int var6 = this.field3174[var5].method3659(class306.method4846(var4));
        return this.method4247(var5, var6);
    }

    @ObfuscatedName("ir.ab(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4268(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3164.method3659(class306.method4846(var3));
        int var6 = this.field3174[var5].method3659(class306.method4846(var4));
        return this.method4318(var5, var6);
    }

    @ObfuscatedName("ir.aw(Ljava/lang/String;I)Z")
    public boolean method4326(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3164.method3659(class306.method4846(var2));
        return this.method4329(var3);
    }

    @ObfuscatedName("ir.ak(Ljava/lang/String;I)V")
    public void method4270(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3164.method3659(class306.method4846(var2));
        if (var3 >= 0) {
            this.method4245(var3);
        }
    }

    @ObfuscatedName("ir.as(Ljava/lang/String;I)I")
    public int method4309(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3164.method3659(class306.method4846(var2));
        return this.method4252(var3);
    }

    @ObfuscatedName("aj.an([BI)[B")
    public static final byte[] method833(byte[] arg0) {
        class183 var1 = new class183(arg0);
        int var2 = var1.method3247();
        int var3 = var1.method3374();
        if (var3 < 0 || !(field3177 == 0 || var3 <= field3177)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3242(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3374();
            if (var5 < 0 || field3177 != 0 && var5 > field3177) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class177.method3192(var6, var5, arg0, var3, 9);
            } else {
                field3173.method3186(var1, var6);
            }
            return var6;
        }
    }
}
