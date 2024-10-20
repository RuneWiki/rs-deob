package deob;

@ObfuscatedName("jk")
public abstract class class262 {

    @ObfuscatedName("jk.z")
    public int field3371;

    @ObfuscatedName("jk.n")
    public int[] field3385;

    @ObfuscatedName("jk.r")
    public int[] field3370;

    @ObfuscatedName("jk.e")
    public class211 field3388;

    @ObfuscatedName("jk.y")
    public int[] field3375;

    @ObfuscatedName("jk.k")
    public int[] field3376;

    @ObfuscatedName("jk.s")
    public int[] field3377;

    @ObfuscatedName("jk.p")
    public int[][] field3378;

    @ObfuscatedName("jk.x")
    public int[][] field3379;

    @ObfuscatedName("jk.m")
    public class211[] field3382;

    @ObfuscatedName("jk.h")
    public Object[] field3381;

    @ObfuscatedName("jk.t")
    public Object[][] field3374;

    @ObfuscatedName("jk.i")
    public static class188 field3383 = new class188();

    @ObfuscatedName("jk.u")
    public int field3384;

    @ObfuscatedName("jk.q")
    public boolean field3380;

    @ObfuscatedName("jk.v")
    public boolean field3386;

    @ObfuscatedName("jk.f")
    public static int field3387 = 0;

    public class262(boolean arg0, boolean arg1) {
        this.field3380 = arg0;
        this.field3386 = arg1;
    }

    @ObfuscatedName("jk.d([BI)V")
    public void method4271(byte[] arg0) {
        this.field3384 = class195.method3496(arg0, arg0.length);
        class195 var2 = new class195(method984(arg0));
        int var3 = var2.method3330();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method3264();
        }
        int var4 = var2.method3330();
        if (var3 >= 7) {
            this.field3371 = var2.method3476();
        } else {
            this.field3371 = var2.method3269();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3385 = new int[this.field3371];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3371; var7++) {
                this.field3385[var7] = var5 += var2.method3476();
                if (this.field3385[var7] > var6) {
                    var6 = this.field3385[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3371; var8++) {
                this.field3385[var8] = var5 += var2.method3269();
                if (this.field3385[var8] > var6) {
                    var6 = this.field3385[var8];
                }
            }
        }
        this.field3375 = new int[var6 + 1];
        this.field3376 = new int[var6 + 1];
        this.field3377 = new int[var6 + 1];
        this.field3378 = new int[var6 + 1][];
        this.field3381 = new Object[var6 + 1];
        this.field3374 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3370 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3371; var9++) {
                this.field3370[this.field3385[var9]] = var2.method3264();
            }
            this.field3388 = new class211(this.field3370);
        }
        for (int var10 = 0; var10 < this.field3371; var10++) {
            this.field3375[this.field3385[var10]] = var2.method3264();
        }
        for (int var11 = 0; var11 < this.field3371; var11++) {
            this.field3376[this.field3385[var11]] = var2.method3264();
        }
        for (int var12 = 0; var12 < this.field3371; var12++) {
            this.field3377[this.field3385[var12]] = var2.method3269();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3371; var13++) {
                int var14 = this.field3385[var13];
                int var15 = this.field3377[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3378[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3378[var14][var18] = var16 += var2.method3476();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3374[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3371; var20++) {
                int var21 = this.field3385[var20];
                int var22 = this.field3377[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3378[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3378[var21][var25] = var23 += var2.method3269();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3374[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3379 = new int[var6 + 1][];
        this.field3382 = new class211[var6 + 1];
        for (int var27 = 0; var27 < this.field3371; var27++) {
            int var28 = this.field3385[var27];
            int var29 = this.field3377[var28];
            this.field3379[var28] = new int[this.field3374[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3379[var28][this.field3378[var28][var30]] = var2.method3264();
            }
            this.field3382[var28] = new class211(this.field3379[var28]);
        }
    }

    @ObfuscatedName("jk.z(IS)V")
    public void method4304(int arg0) {
    }

    @ObfuscatedName("jk.n(IIB)[B")
    public byte[] method4273(int arg0, int arg1) {
        return this.method4348(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("jk.r(II[II)[B")
    public byte[] method4348(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3374.length || this.field3374[arg0] == null || arg1 < 0 || arg1 >= this.field3374[arg0].length) {
            return null;
        }
        if (this.field3374[arg0][arg1] == null) {
            boolean var4 = this.method4301(arg0, arg2);
            if (!var4) {
                this.method4283(arg0);
                boolean var5 = this.method4301(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class199.method3096(this.field3374[arg0][arg1], false);
        if (this.field3386) {
            this.field3374[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("jk.e(IIB)Z")
    public boolean method4275(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3374.length || this.field3374[arg0] == null || arg1 < 0 || arg1 >= this.field3374[arg0].length) {
            return false;
        } else if (this.field3374[arg0][arg1] != null) {
            return true;
        } else if (this.field3381[arg0] == null) {
            this.method4283(arg0);
            return this.field3381[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jk.y(IB)Z")
    public boolean method4274(int arg0) {
        if (this.field3374.length == 1) {
            return this.method4275(0, arg0);
        } else if (this.field3374[arg0].length == 1) {
            return this.method4275(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jk.k(II)Z")
    public boolean method4308(int arg0) {
        if (this.field3381[arg0] == null) {
            this.method4283(arg0);
            return this.field3381[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jk.s(I)Z")
    public boolean method4278() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3385.length; var2++) {
            int var3 = this.field3385[var2];
            if (this.field3381[var3] == null) {
                this.method4283(var3);
                if (this.field3381[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("jk.x(IB)I")
    public int method4279(int arg0) {
        return this.field3381[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("jk.h(IB)[B")
    public byte[] method4280(int arg0) {
        if (this.field3374.length == 1) {
            return this.method4273(0, arg0);
        } else if (this.field3374[arg0].length == 1) {
            return this.method4273(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jk.t(IIB)[B")
    public byte[] method4321(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3374.length || this.field3374[arg0] == null || arg1 < 0 || arg1 >= this.field3374[arg0].length) {
            return null;
        }
        if (this.field3374[arg0][arg1] == null) {
            boolean var3 = this.method4301(arg0, (int[]) null);
            if (!var3) {
                this.method4283(arg0);
                boolean var4 = this.method4301(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class199.method3096(this.field3374[arg0][arg1], false);
    }

    @ObfuscatedName("jk.i(IB)[B")
    public byte[] method4282(int arg0) {
        if (this.field3374.length == 1) {
            return this.method4321(0, arg0);
        } else if (this.field3374[arg0].length == 1) {
            return this.method4321(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jk.u(II)V")
    public void method4283(int arg0) {
    }

    @ObfuscatedName("jk.q(II)[I")
    public int[] method4364(int arg0) {
        return this.field3378[arg0];
    }

    @ObfuscatedName("jk.v(IS)I")
    public int method4285(int arg0) {
        return this.field3374[arg0].length;
    }

    @ObfuscatedName("jk.f(I)I")
    public int method4311() {
        return this.field3374.length;
    }

    @ObfuscatedName("jk.b(I)V")
    public void method4287() {
        for (int var1 = 0; var1 < this.field3381.length; var1++) {
            this.field3381[var1] = null;
        }
    }

    @ObfuscatedName("jk.c(II)V")
    public void method4288(int arg0) {
        for (int var2 = 0; var2 < this.field3374[arg0].length; var2++) {
            this.field3374[arg0][var2] = null;
        }
    }

    @ObfuscatedName("jk.w(I)V")
    public void method4296() {
        for (int var1 = 0; var1 < this.field3374.length; var1++) {
            if (this.field3374[var1] != null) {
                for (int var2 = 0; var2 < this.field3374[var1].length; var2++) {
                    this.field3374[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("jk.o(I[II)Z")
    public boolean method4301(int arg0, int[] arg1) {
        if (this.field3381[arg0] == null) {
            return false;
        }
        int var3 = this.field3377[arg0];
        int[] var4 = this.field3378[arg0];
        Object[] var5 = this.field3374[arg0];
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
            var8 = class199.method3096(this.field3381[arg0], true);
            class195 var9 = new class195(var8);
            var9.method3280(arg1, 5, var9.field2569.length);
        } else {
            var8 = class199.method3096(this.field3381[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method984(var8);
        } catch (RuntimeException var27) {
            throw class165.method4098(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class195.method3496(var8, var8.length) + "," + class195.method3496(var8, var8.length - 2) + "," + this.field3375[arg0] + "," + this.field3384);
        }
        if (this.field3380) {
            this.field3381[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class195 var15 = new class195(var10);
            int[] var16 = new int[var3];
            var15.field2568 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method3264();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2568 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method3264();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3386) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class199.method3158(var20[var26], false);
                }
            }
        } else if (this.field3386) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class199.method3158(var10, false);
        }
        return true;
    }

    @ObfuscatedName("jk.a(Ljava/lang/String;I)I")
    public int method4290(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3388.method3682(class319.method4903(var2));
    }

    @ObfuscatedName("jk.ak(ILjava/lang/String;S)I")
    public int method4292(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3382[arg0].method3682(class319.method4903(var3));
    }

    @ObfuscatedName("jk.ap(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4293(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3388.method3682(class319.method4903(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3382[var5].method3682(class319.method4903(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("jk.ac(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method4294(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3388.method3682(class319.method4903(var3));
        int var6 = this.field3382[var5].method3682(class319.method4903(var4));
        return this.method4273(var5, var6);
    }

    @ObfuscatedName("jk.aw(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4335(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3388.method3682(class319.method4903(var3));
        int var6 = this.field3382[var5].method3682(class319.method4903(var4));
        return this.method4275(var5, var6);
    }

    @ObfuscatedName("jk.as(Ljava/lang/String;B)Z")
    public boolean method4358(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3388.method3682(class319.method4903(var2));
        return this.method4308(var3);
    }

    @ObfuscatedName("jk.au(Ljava/lang/String;B)V")
    public void method4297(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3388.method3682(class319.method4903(var2));
        if (var3 >= 0) {
            this.method4304(var3);
        }
    }

    @ObfuscatedName("jk.al(Ljava/lang/String;I)I")
    public int method4298(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3388.method3682(class319.method4903(var2));
        return this.method4279(var3);
    }

    @ObfuscatedName("bi.af([BI)[B")
    public static final byte[] method984(byte[] arg0) {
        class195 var1 = new class195(arg0);
        int var2 = var1.method3330();
        int var3 = var1.method3264();
        if (var3 < 0 || !(field3387 == 0 || var3 <= field3387)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3327(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3264();
            if (var5 < 0 || field3387 != 0 && var5 > field3387) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class189.method3194(var6, var5, arg0, var3, 9);
            } else {
                field3383.method3191(var1, var6);
            }
            return var6;
        }
    }
}
