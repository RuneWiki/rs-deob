package deob;

@ObfuscatedName("iv")
public abstract class class248 {

    @ObfuscatedName("iv.m")
    public int field3174;

    @ObfuscatedName("iv.q")
    public int[] field3175;

    @ObfuscatedName("iv.b")
    public int[] field3176;

    @ObfuscatedName("iv.f")
    public class199 field3177;

    @ObfuscatedName("iv.n")
    public int[] field3178;

    @ObfuscatedName("iv.h")
    public int[] field3179;

    @ObfuscatedName("iv.x")
    public int[] field3182;

    @ObfuscatedName("iv.j")
    public int[][] field3190;

    @ObfuscatedName("iv.a")
    public int[][] field3173;

    @ObfuscatedName("iv.l")
    public class199[] field3183;

    @ObfuscatedName("iv.d")
    public Object[] field3184;

    @ObfuscatedName("iv.s")
    public Object[][] field3185;

    @ObfuscatedName("iv.p")
    public static class176 field3186 = new class176();

    @ObfuscatedName("iv.g")
    public int field3181;

    @ObfuscatedName("iv.y")
    public boolean field3188;

    @ObfuscatedName("iv.c")
    public boolean field3191;

    @ObfuscatedName("iv.e")
    public static int field3180 = 0;

    public class248(boolean arg0, boolean arg1) {
        this.field3188 = arg0;
        this.field3191 = arg1;
    }

    @ObfuscatedName("iv.w([BI)V")
    public void method4307(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class183.method4226(arg0, 0, var2);
        this.field3181 = var3;
        class183 var4 = new class183(method3195(arg0));
        int var5 = var4.method3436();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method3267();
        }
        int var6 = var4.method3436();
        if (var5 >= 7) {
            this.field3174 = var4.method3278();
        } else {
            this.field3174 = var4.method3268();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3175 = new int[this.field3174];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3174; var9++) {
                this.field3175[var9] = var7 += var4.method3278();
                if (this.field3175[var9] > var8) {
                    var8 = this.field3175[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3174; var10++) {
                this.field3175[var10] = var7 += var4.method3268();
                if (this.field3175[var10] > var8) {
                    var8 = this.field3175[var10];
                }
            }
        }
        this.field3178 = new int[var8 + 1];
        this.field3179 = new int[var8 + 1];
        this.field3182 = new int[var8 + 1];
        this.field3190 = new int[var8 + 1][];
        this.field3184 = new Object[var8 + 1];
        this.field3185 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3176 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3174; var11++) {
                this.field3176[this.field3175[var11]] = var4.method3267();
            }
            this.field3177 = new class199(this.field3176);
        }
        for (int var12 = 0; var12 < this.field3174; var12++) {
            this.field3178[this.field3175[var12]] = var4.method3267();
        }
        for (int var13 = 0; var13 < this.field3174; var13++) {
            this.field3179[this.field3175[var13]] = var4.method3267();
        }
        for (int var14 = 0; var14 < this.field3174; var14++) {
            this.field3182[this.field3175[var14]] = var4.method3268();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3174; var15++) {
                int var16 = this.field3175[var15];
                int var17 = this.field3182[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3190[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3190[var16][var20] = var18 += var4.method3278();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3185[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3174; var22++) {
                int var23 = this.field3175[var22];
                int var24 = this.field3182[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3190[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3190[var23][var27] = var25 += var4.method3268();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3185[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3173 = new int[var8 + 1][];
        this.field3183 = new class199[var8 + 1];
        for (int var29 = 0; var29 < this.field3174; var29++) {
            int var30 = this.field3175[var29];
            int var31 = this.field3182[var30];
            this.field3173[var30] = new int[this.field3185[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3173[var30][this.field3190[var30][var32]] = var4.method3267();
            }
            this.field3183[var30] = new class199(this.field3173[var30]);
        }
    }

    @ObfuscatedName("iv.m(IB)V")
    public void method4249(int arg0) {
    }

    @ObfuscatedName("iv.q(IIS)[B")
    public byte[] method4250(int arg0, int arg1) {
        return this.method4251(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("iv.x(II[II)[B")
    public byte[] method4251(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3185.length || this.field3185[arg0] == null || arg1 < 0 || arg1 >= this.field3185[arg0].length) {
            return null;
        }
        if (this.field3185[arg0][arg1] == null) {
            boolean var4 = this.method4334(arg0, arg2);
            if (!var4) {
                this.method4260(arg0);
                boolean var5 = this.method4334(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class187.method457(this.field3185[arg0][arg1], false);
        if (this.field3191) {
            this.field3185[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("iv.j(III)Z")
    public boolean method4332(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3185.length || this.field3185[arg0] == null || arg1 < 0 || arg1 >= this.field3185[arg0].length) {
            return false;
        } else if (this.field3185[arg0][arg1] != null) {
            return true;
        } else if (this.field3184[arg0] == null) {
            this.method4260(arg0);
            return this.field3184[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iv.a(IB)Z")
    public boolean method4253(int arg0) {
        if (this.field3185.length == 1) {
            return this.method4332(0, arg0);
        } else if (this.field3185[arg0].length == 1) {
            return this.method4332(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iv.l(IB)Z")
    public boolean method4263(int arg0) {
        if (this.field3184[arg0] == null) {
            this.method4260(arg0);
            return this.field3184[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iv.d(S)Z")
    public boolean method4255() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3175.length; var2++) {
            int var3 = this.field3175[var2];
            if (this.field3184[var3] == null) {
                this.method4260(var3);
                if (this.field3184[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("iv.s(IB)I")
    public int method4316(int arg0) {
        return this.field3184[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("iv.p(II)[B")
    public byte[] method4342(int arg0) {
        if (this.field3185.length == 1) {
            return this.method4250(0, arg0);
        } else if (this.field3185[arg0].length == 1) {
            return this.method4250(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iv.g(IIB)[B")
    public byte[] method4258(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3185.length || this.field3185[arg0] == null || arg1 < 0 || arg1 >= this.field3185[arg0].length) {
            return null;
        }
        if (this.field3185[arg0][arg1] == null) {
            boolean var3 = this.method4334(arg0, (int[]) null);
            if (!var3) {
                this.method4260(arg0);
                boolean var4 = this.method4334(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class187.method457(this.field3185[arg0][arg1], false);
    }

    @ObfuscatedName("iv.y(II)[B")
    public byte[] method4264(int arg0) {
        if (this.field3185.length == 1) {
            return this.method4258(0, arg0);
        } else if (this.field3185[arg0].length == 1) {
            return this.method4258(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iv.c(II)V")
    public void method4260(int arg0) {
    }

    @ObfuscatedName("iv.e(II)[I")
    public int[] method4272(int arg0) {
        return this.field3190[arg0];
    }

    @ObfuscatedName("iv.t(II)I")
    public int method4262(int arg0) {
        return this.field3185[arg0].length;
    }

    @ObfuscatedName("iv.u(I)I")
    public int method4269() {
        return this.field3185.length;
    }

    @ObfuscatedName("iv.i(I)V")
    public void method4286() {
        for (int var1 = 0; var1 < this.field3184.length; var1++) {
            this.field3184[var1] = null;
        }
    }

    @ObfuscatedName("iv.r(IB)V")
    public void method4283(int arg0) {
        for (int var2 = 0; var2 < this.field3185[arg0].length; var2++) {
            this.field3185[arg0][var2] = null;
        }
    }

    @ObfuscatedName("iv.v(I)V")
    public void method4266() {
        for (int var1 = 0; var1 < this.field3185.length; var1++) {
            if (this.field3185[var1] != null) {
                for (int var2 = 0; var2 < this.field3185[var1].length; var2++) {
                    this.field3185[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("iv.o(I[II)Z")
    public boolean method4334(int arg0, int[] arg1) {
        if (this.field3184[arg0] == null) {
            return false;
        }
        int var3 = this.field3182[arg0];
        int[] var4 = this.field3190[arg0];
        Object[] var5 = this.field3185[arg0];
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
            var8 = class187.method457(this.field3184[arg0], true);
            class183 var9 = new class183(var8);
            var9.method3284(arg1, 5, var9.field2366.length);
        } else {
            var8 = class187.method457(this.field3184[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3195(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class183.method4226(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class183.method4226(var8, 0, var18);
            throw class153.method13(var35, var17 + var19 + "," + this.field3178[arg0] + "," + this.field3181);
        }
        if (this.field3188) {
            this.field3184[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class183 var23 = new class183(var10);
            int[] var24 = new int[var3];
            var23.field2360 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method3267();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2360 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method3267();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field3191) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class187.method2683(var28[var34], false);
                }
            }
        } else if (this.field3191) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class187.method2683(var10, false);
        }
        return true;
    }

    @ObfuscatedName("iv.ai(Ljava/lang/String;S)I")
    public int method4268(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3177.method3696(class306.method2402(var2));
    }

    @ObfuscatedName("iv.at(ILjava/lang/String;I)I")
    public int method4317(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3183[arg0].method3696(class306.method2402(var3));
    }

    @ObfuscatedName("iv.ad(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4313(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3177.method3696(class306.method2402(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3183[var5].method3696(class306.method2402(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("iv.ac(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4271(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3177.method3696(class306.method2402(var3));
        int var6 = this.field3183[var5].method3696(class306.method2402(var4));
        return this.method4250(var5, var6);
    }

    @ObfuscatedName("iv.ay(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4312(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3177.method3696(class306.method2402(var3));
        int var6 = this.field3183[var5].method3696(class306.method2402(var4));
        return this.method4332(var5, var6);
    }

    @ObfuscatedName("iv.an(Ljava/lang/String;B)Z")
    public boolean method4337(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3177.method3696(class306.method2402(var2));
        return this.method4263(var3);
    }

    @ObfuscatedName("iv.as(Ljava/lang/String;I)V")
    public void method4274(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3177.method3696(class306.method2402(var2));
        if (var3 >= 0) {
            this.method4249(var3);
        }
    }

    @ObfuscatedName("iv.aw(Ljava/lang/String;B)I")
    public int method4275(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3177.method3696(class306.method2402(var2));
        return this.method4316(var3);
    }

    @ObfuscatedName("fl.ag([BB)[B")
    public static final byte[] method3195(byte[] arg0) {
        class183 var1 = new class183(arg0);
        int var2 = var1.method3436();
        int var3 = var1.method3267();
        if (var3 < 0 || !(field3180 == 0 || var3 <= field3180)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3274(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3267();
            if (var5 < 0 || field3180 != 0 && var5 > field3180) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class177.method3197(var6, var5, arg0, var3, 9);
            } else {
                field3186.method3193(var1, var6);
            }
            return var6;
        }
    }
}
