package deob;

@ObfuscatedName("ic")
public abstract class class244 {

    @ObfuscatedName("ic.o")
    public int field3165;

    @ObfuscatedName("ic.q")
    public int[] field3167;

    @ObfuscatedName("ic.j")
    public int[] field3164;

    @ObfuscatedName("ic.p")
    public class345 field3180;

    @ObfuscatedName("ic.g")
    public int[] field3166;

    @ObfuscatedName("ic.n")
    public int[] field3174;

    @ObfuscatedName("ic.u")
    public int[] field3168;

    @ObfuscatedName("ic.a")
    public int[][] field3169;

    @ObfuscatedName("ic.z")
    public int[][] field3170;

    @ObfuscatedName("ic.w")
    public class345[] field3177;

    @ObfuscatedName("ic.y")
    public Object[] field3163;

    @ObfuscatedName("ic.c")
    public Object[][] field3173;

    @ObfuscatedName("ic.h")
    public static class344 field3161 = new class344();

    @ObfuscatedName("ic.k")
    public int field3171;

    @ObfuscatedName("ic.r")
    public boolean field3176;

    @ObfuscatedName("ic.s")
    public boolean field3179;

    @ObfuscatedName("ic.v")
    public static int field3178 = 0;

    public class244(boolean arg0, boolean arg1) {
        this.field3176 = arg0;
        this.field3179 = arg1;
    }

    @ObfuscatedName("ic.m([BB)V")
    public void method3889(byte[] arg0) {
        this.field3171 = class310.method4500(arg0, arg0.length);
        class310 var2 = new class310(method3731(arg0));
        int var3 = var2.method5227();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method5209();
        }
        int var4 = var2.method5227();
        if (var3 >= 7) {
            this.field3165 = var2.method5243();
        } else {
            this.field3165 = var2.method5283();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3167 = new int[this.field3165];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3165; var7++) {
                this.field3167[var7] = var5 += var2.method5243();
                if (this.field3167[var7] > var6) {
                    var6 = this.field3167[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3165; var8++) {
                this.field3167[var8] = var5 += var2.method5283();
                if (this.field3167[var8] > var6) {
                    var6 = this.field3167[var8];
                }
            }
        }
        this.field3166 = new int[var6 + 1];
        this.field3174 = new int[var6 + 1];
        this.field3168 = new int[var6 + 1];
        this.field3169 = new int[var6 + 1][];
        this.field3163 = new Object[var6 + 1];
        this.field3173 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3164 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3165; var9++) {
                this.field3164[this.field3167[var9]] = var2.method5209();
            }
            this.field3180 = new class345(this.field3164);
        }
        for (int var10 = 0; var10 < this.field3165; var10++) {
            this.field3166[this.field3167[var10]] = var2.method5209();
        }
        for (int var11 = 0; var11 < this.field3165; var11++) {
            this.field3174[this.field3167[var11]] = var2.method5209();
        }
        for (int var12 = 0; var12 < this.field3165; var12++) {
            this.field3168[this.field3167[var12]] = var2.method5283();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3165; var13++) {
                int var14 = this.field3167[var13];
                int var15 = this.field3168[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3169[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3169[var14][var18] = var16 += var2.method5243();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3173[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3165; var20++) {
                int var21 = this.field3167[var20];
                int var22 = this.field3168[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3169[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3169[var21][var25] = var23 += var2.method5283();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3173[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3170 = new int[var6 + 1][];
        this.field3177 = new class345[var6 + 1];
        for (int var27 = 0; var27 < this.field3165; var27++) {
            int var28 = this.field3167[var27];
            int var29 = this.field3168[var28];
            this.field3170[var28] = new int[this.field3173[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3170[var28][this.field3169[var28][var30]] = var2.method5209();
            }
            this.field3177[var28] = new class345(this.field3170[var28]);
        }
    }

    @ObfuscatedName("ic.o(II)V")
    public void method3890(int arg0) {
    }

    @ObfuscatedName("ic.q(III)[B")
    public byte[] method3891(int arg0, int arg1) {
        return this.method3892(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ic.j(II[II)[B")
    public byte[] method3892(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3173.length || this.field3173[arg0] == null || arg1 < 0 || arg1 >= this.field3173[arg0].length) {
            return null;
        }
        if (this.field3173[arg0][arg1] == null) {
            boolean var4 = this.method3908(arg0, arg2);
            if (!var4) {
                this.method3900(arg0);
                boolean var5 = this.method3908(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class215.method4182(this.field3173[arg0][arg1], false);
        if (this.field3179) {
            this.field3173[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ic.p(III)Z")
    public boolean method3893(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3173.length || this.field3173[arg0] == null || arg1 < 0 || arg1 >= this.field3173[arg0].length) {
            return false;
        } else if (this.field3173[arg0][arg1] != null) {
            return true;
        } else if (this.field3163[arg0] == null) {
            this.method3900(arg0);
            return this.field3163[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ic.g(II)Z")
    public boolean method3941(int arg0) {
        if (this.field3173.length == 1) {
            return this.method3893(0, arg0);
        } else if (this.field3173[arg0].length == 1) {
            return this.method3893(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ic.n(II)Z")
    public boolean method3895(int arg0) {
        if (this.field3163[arg0] == null) {
            this.method3900(arg0);
            return this.field3163[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ic.u(B)Z")
    public boolean method3970() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3167.length; var2++) {
            int var3 = this.field3167[var2];
            if (this.field3163[var3] == null) {
                this.method3900(var3);
                if (this.field3163[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ic.a(II)I")
    public int method3897(int arg0) {
        return this.field3163[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ic.z(II)[B")
    public byte[] method3955(int arg0) {
        if (this.field3173.length == 1) {
            return this.method3891(0, arg0);
        } else if (this.field3173[arg0].length == 1) {
            return this.method3891(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ic.w(III)[B")
    public byte[] method3899(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3173.length || this.field3173[arg0] == null || arg1 < 0 || arg1 >= this.field3173[arg0].length) {
            return null;
        }
        if (this.field3173[arg0][arg1] == null) {
            boolean var3 = this.method3908(arg0, (int[]) null);
            if (!var3) {
                this.method3900(arg0);
                boolean var4 = this.method3908(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class215.method4182(this.field3173[arg0][arg1], false);
    }

    @ObfuscatedName("ic.y(II)[B")
    public byte[] method3969(int arg0) {
        if (this.field3173.length == 1) {
            return this.method3899(0, arg0);
        } else if (this.field3173[arg0].length == 1) {
            return this.method3899(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ic.c(II)V")
    public void method3900(int arg0) {
    }

    @ObfuscatedName("ic.h(IB)[I")
    public int[] method3902(int arg0) {
        return arg0 >= 0 && arg0 < this.field3169.length ? this.field3169[arg0] : null;
    }

    @ObfuscatedName("ic.k(II)I")
    public int method3903(int arg0) {
        return this.field3173[arg0].length;
    }

    @ObfuscatedName("ic.r(I)I")
    public int method3945() {
        return this.field3173.length;
    }

    @ObfuscatedName("ic.d(I)V")
    public void method3905() {
        for (int var1 = 0; var1 < this.field3163.length; var1++) {
            this.field3163[var1] = null;
        }
    }

    @ObfuscatedName("ic.e(II)V")
    public void method3946(int arg0) {
        for (int var2 = 0; var2 < this.field3173[arg0].length; var2++) {
            this.field3173[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ic.l(B)V")
    public void method3907() {
        for (int var1 = 0; var1 < this.field3173.length; var1++) {
            if (this.field3173[var1] != null) {
                for (int var2 = 0; var2 < this.field3173[var1].length; var2++) {
                    this.field3173[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ic.t(I[II)Z")
    public boolean method3908(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ic.x(Ljava/lang/String;I)I")
    public int method3909(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3180.method6173(class301.method3697(var2));
    }

    @ObfuscatedName("ic.ah(ILjava/lang/String;I)I")
    public int method3910(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3177[arg0].method6173(class301.method3697(var3));
    }

    @ObfuscatedName("ic.ai(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3981(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3180.method6173(class301.method3697(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3177[var5].method6173(class301.method3697(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ic.ao(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3951(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3180.method6173(class301.method3697(var3));
        int var6 = this.field3177[var5].method6173(class301.method3697(var4));
        return this.method3891(var5, var6);
    }

    @ObfuscatedName("ic.ae(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3939(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3180.method6173(class301.method3697(var3));
        int var6 = this.field3177[var5].method6173(class301.method3697(var4));
        return this.method3893(var5, var6);
    }

    @ObfuscatedName("ic.ax(Ljava/lang/String;B)Z")
    public boolean method3898(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3180.method6173(class301.method3697(var2));
        return this.method3895(var3);
    }

    @ObfuscatedName("ic.ag(Ljava/lang/String;I)V")
    public void method3901(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3180.method6173(class301.method3697(var2));
        if (var3 >= 0) {
            this.method3890(var3);
        }
    }

    @ObfuscatedName("ic.ab(Ljava/lang/String;I)I")
    public int method3915(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3180.method6173(class301.method3697(var2));
        return this.method3897(var3);
    }

    @ObfuscatedName("hg.am([BB)[B")
    public static final byte[] method3731(byte[] arg0) {
        class310 var1 = new class310(arg0);
        int var2 = var1.method5227();
        int var3 = var1.method5209();
        if (var3 < 0 || !(field3178 == 0 || var3 <= field3178)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5239(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5209();
            if (var5 < 0 || field3178 != 0 && var5 > field3178) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class314.method5513(var6, var5, arg0, var3, 9);
            } else {
                field3161.method6169(var1, var6);
            }
            return var6;
        }
    }
}
