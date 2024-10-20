package deob;

@ObfuscatedName("iz")
public abstract class class255 {

    @ObfuscatedName("iz.s")
    public int field3241;

    @ObfuscatedName("iz.g")
    public int[] field3242;

    @ObfuscatedName("iz.x")
    public int[] field3258;

    @ObfuscatedName("iz.h")
    public class206 field3257;

    @ObfuscatedName("iz.f")
    public int[] field3245;

    @ObfuscatedName("iz.p")
    public int[] field3243;

    @ObfuscatedName("iz.m")
    public int[] field3247;

    @ObfuscatedName("iz.q")
    public int[][] field3248;

    @ObfuscatedName("iz.b")
    public int[][] field3249;

    @ObfuscatedName("iz.n")
    public class206[] field3246;

    @ObfuscatedName("iz.e")
    public Object[] field3251;

    @ObfuscatedName("iz.r")
    public Object[][] field3240;

    @ObfuscatedName("iz.t")
    public static class183 field3254 = new class183();

    @ObfuscatedName("iz.l")
    public int field3244;

    @ObfuscatedName("iz.o")
    public boolean field3255;

    @ObfuscatedName("iz.u")
    public boolean field3256;

    @ObfuscatedName("iz.y")
    public static int field3252 = 0;

    public class255(boolean arg0, boolean arg1) {
        this.field3255 = arg0;
        this.field3256 = arg1;
    }

    @ObfuscatedName("iz.a([BB)V")
    public void method4420(byte[] arg0) {
        this.field3244 = class190.method1110(arg0, arg0.length);
        class190 var2 = new class190(method1760(arg0));
        int var3 = var2.method3443();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method3460();
        }
        int var4 = var2.method3443();
        if (var3 >= 7) {
            this.field3241 = var2.method3471();
        } else {
            this.field3241 = var2.method3610();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3242 = new int[this.field3241];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3241; var7++) {
                this.field3242[var7] = var5 += var2.method3471();
                if (this.field3242[var7] > var6) {
                    var6 = this.field3242[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3241; var8++) {
                this.field3242[var8] = var5 += var2.method3610();
                if (this.field3242[var8] > var6) {
                    var6 = this.field3242[var8];
                }
            }
        }
        this.field3245 = new int[var6 + 1];
        this.field3243 = new int[var6 + 1];
        this.field3247 = new int[var6 + 1];
        this.field3248 = new int[var6 + 1][];
        this.field3251 = new Object[var6 + 1];
        this.field3240 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3258 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3241; var9++) {
                this.field3258[this.field3242[var9]] = var2.method3460();
            }
            this.field3257 = new class206(this.field3258);
        }
        for (int var10 = 0; var10 < this.field3241; var10++) {
            this.field3245[this.field3242[var10]] = var2.method3460();
        }
        for (int var11 = 0; var11 < this.field3241; var11++) {
            this.field3243[this.field3242[var11]] = var2.method3460();
        }
        for (int var12 = 0; var12 < this.field3241; var12++) {
            this.field3247[this.field3242[var12]] = var2.method3610();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3241; var13++) {
                int var14 = this.field3242[var13];
                int var15 = this.field3247[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3248[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3248[var14][var18] = var16 += var2.method3471();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3240[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3241; var20++) {
                int var21 = this.field3242[var20];
                int var22 = this.field3247[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3248[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3248[var21][var25] = var23 += var2.method3610();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3240[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3249 = new int[var6 + 1][];
        this.field3246 = new class206[var6 + 1];
        for (int var27 = 0; var27 < this.field3241; var27++) {
            int var28 = this.field3242[var27];
            int var29 = this.field3247[var28];
            this.field3249[var28] = new int[this.field3240[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3249[var28][this.field3248[var28][var30]] = var2.method3460();
            }
            this.field3246[var28] = new class206(this.field3249[var28]);
        }
    }

    @ObfuscatedName("iz.s(II)V")
    public void method4421(int arg0) {
    }

    @ObfuscatedName("iz.g(III)[B")
    public byte[] method4422(int arg0, int arg1) {
        return this.method4485(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("iz.x(II[II)[B")
    public byte[] method4485(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3240.length || this.field3240[arg0] == null || arg1 < 0 || arg1 >= this.field3240[arg0].length) {
            return null;
        }
        if (this.field3240[arg0][arg1] == null) {
            boolean var4 = this.method4461(arg0, arg2);
            if (!var4) {
                this.method4432(arg0);
                boolean var5 = this.method4461(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class194.method1094(this.field3240[arg0][arg1], false);
        if (this.field3256) {
            this.field3240[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("iz.h(IIB)Z")
    public boolean method4424(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3240.length || this.field3240[arg0] == null || arg1 < 0 || arg1 >= this.field3240[arg0].length) {
            return false;
        } else if (this.field3240[arg0][arg1] != null) {
            return true;
        } else if (this.field3251[arg0] == null) {
            this.method4432(arg0);
            return this.field3251[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iz.f(II)Z")
    public boolean method4508(int arg0) {
        if (this.field3240.length == 1) {
            return this.method4424(0, arg0);
        } else if (this.field3240[arg0].length == 1) {
            return this.method4424(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iz.p(II)Z")
    public boolean method4466(int arg0) {
        if (this.field3251[arg0] == null) {
            this.method4432(arg0);
            return this.field3251[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iz.m(I)Z")
    public boolean method4427() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3242.length; var2++) {
            int var3 = this.field3242[var2];
            if (this.field3251[var3] == null) {
                this.method4432(var3);
                if (this.field3251[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("iz.q(II)I")
    public int method4428(int arg0) {
        return this.field3251[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("iz.b(II)[B")
    public byte[] method4429(int arg0) {
        if (this.field3240.length == 1) {
            return this.method4422(0, arg0);
        } else if (this.field3240[arg0].length == 1) {
            return this.method4422(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iz.n(III)[B")
    public byte[] method4430(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3240.length || this.field3240[arg0] == null || arg1 < 0 || arg1 >= this.field3240[arg0].length) {
            return null;
        }
        if (this.field3240[arg0][arg1] == null) {
            boolean var3 = this.method4461(arg0, (int[]) null);
            if (!var3) {
                this.method4432(arg0);
                boolean var4 = this.method4461(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class194.method1094(this.field3240[arg0][arg1], false);
    }

    @ObfuscatedName("iz.e(II)[B")
    public byte[] method4431(int arg0) {
        if (this.field3240.length == 1) {
            return this.method4430(0, arg0);
        } else if (this.field3240[arg0].length == 1) {
            return this.method4430(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iz.r(IB)V")
    public void method4432(int arg0) {
    }

    @ObfuscatedName("iz.t(II)[I")
    public int[] method4433(int arg0) {
        return arg0 >= 0 && arg0 < this.field3248.length ? this.field3248[arg0] : null;
    }

    @ObfuscatedName("iz.l(II)I")
    public int method4419(int arg0) {
        return this.field3240[arg0].length;
    }

    @ObfuscatedName("iz.o(I)I")
    public int method4434() {
        return this.field3240.length;
    }

    @ObfuscatedName("iz.u(I)V")
    public void method4505() {
        for (int var1 = 0; var1 < this.field3251.length; var1++) {
            this.field3251[var1] = null;
        }
    }

    @ObfuscatedName("iz.y(IB)V")
    public void method4436(int arg0) {
        for (int var2 = 0; var2 < this.field3240[arg0].length; var2++) {
            this.field3240[arg0][var2] = null;
        }
    }

    @ObfuscatedName("iz.k(I)V")
    public void method4437() {
        for (int var1 = 0; var1 < this.field3240.length; var1++) {
            if (this.field3240[var1] != null) {
                for (int var2 = 0; var2 < this.field3240[var1].length; var2++) {
                    this.field3240[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("iz.v(I[II)Z")
    public boolean method4461(int arg0, int[] arg1) {
        if (this.field3251[arg0] == null) {
            return false;
        }
        int var3 = this.field3247[arg0];
        int[] var4 = this.field3248[arg0];
        Object[] var5 = this.field3240[arg0];
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
            var8 = class194.method1094(this.field3251[arg0], true);
            class190 var9 = new class190(var8);
            var9.method3477(arg1, 5, var9.field2420.length);
        } else {
            var8 = class194.method1094(this.field3251[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1760(var8);
        } catch (RuntimeException var27) {
            throw class160.method4382(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class190.method1110(var8, var8.length) + "," + class190.method1110(var8, var8.length - 2) + "," + this.field3245[arg0] + "," + this.field3244);
        }
        if (this.field3255) {
            this.field3251[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class190 var15 = new class190(var10);
            int[] var16 = new int[var3];
            var15.field2419 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method3460();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2419 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method3460();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3256) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class194.method1658(var20[var26], false);
                }
            }
        } else if (this.field3256) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class194.method1658(var10, false);
        }
        return true;
    }

    @ObfuscatedName("iz.c(Ljava/lang/String;I)I")
    public int method4439(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3257.method3868(class312.method3423(var2));
    }

    @ObfuscatedName("iz.aa(ILjava/lang/String;I)I")
    public int method4444(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3246[arg0].method3868(class312.method3423(var3));
    }

    @ObfuscatedName("iz.ab(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4441(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3257.method3868(class312.method3423(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3246[var5].method3868(class312.method3423(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("iz.ah(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4442(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3257.method3868(class312.method3423(var3));
        int var6 = this.field3246[var5].method3868(class312.method3423(var4));
        return this.method4422(var5, var6);
    }

    @ObfuscatedName("iz.aw(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4443(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3257.method3868(class312.method3423(var3));
        int var6 = this.field3246[var5].method3868(class312.method3423(var4));
        return this.method4424(var5, var6);
    }

    @ObfuscatedName("iz.an(Ljava/lang/String;B)Z")
    public boolean method4464(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3257.method3868(class312.method3423(var2));
        return this.method4466(var3);
    }

    @ObfuscatedName("iz.at(Ljava/lang/String;I)V")
    public void method4445(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3257.method3868(class312.method3423(var2));
        if (var3 >= 0) {
            this.method4421(var3);
        }
    }

    @ObfuscatedName("iz.ae(Ljava/lang/String;B)I")
    public int method4446(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3257.method3868(class312.method3423(var2));
        return this.method4428(var3);
    }

    @ObfuscatedName("bs.av([BB)[B")
    public static final byte[] method1760(byte[] arg0) {
        class190 var1 = new class190(arg0);
        int var2 = var1.method3443();
        int var3 = var1.method3460();
        if (var3 < 0 || !(field3252 == 0 || var3 <= field3252)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3467(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3460();
            if (var5 < 0 || field3252 != 0 && var5 > field3252) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class184.method3399(var6, var5, arg0, var3, 9);
            } else {
                field3254.method3392(var1, var6);
            }
            return var6;
        }
    }
}
