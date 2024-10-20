package deob;

@ObfuscatedName("iy")
public abstract class class244 {

    @ObfuscatedName("iy.m")
    public int field3129;

    @ObfuscatedName("iy.k")
    public int[] field3138;

    @ObfuscatedName("iy.d")
    public int[] field3131;

    @ObfuscatedName("iy.w")
    public class345 field3132;

    @ObfuscatedName("iy.v")
    public int[] field3130;

    @ObfuscatedName("iy.q")
    public int[] field3134;

    @ObfuscatedName("iy.z")
    public int[] field3135;

    @ObfuscatedName("iy.t")
    public int[][] field3136;

    @ObfuscatedName("iy.e")
    public int[][] field3128;

    @ObfuscatedName("iy.s")
    public class345[] field3137;

    @ObfuscatedName("iy.p")
    public Object[] field3139;

    @ObfuscatedName("iy.n")
    public Object[][] field3147;

    @ObfuscatedName("iy.u")
    public static class344 field3141 = new class344();

    @ObfuscatedName("iy.h")
    public int field3142;

    @ObfuscatedName("iy.g")
    public boolean field3143;

    @ObfuscatedName("iy.i")
    public boolean field3133;

    @ObfuscatedName("iy.a")
    public static int field3144 = 0;

    public class244(boolean arg0, boolean arg1) {
        this.field3143 = arg0;
        this.field3133 = arg1;
    }

    @ObfuscatedName("iy.x([BI)V")
    public void method3867(byte[] arg0) {
        this.field3142 = class310.method195(arg0, arg0.length);
        class310 var2 = new class310(method3667(arg0));
        int var3 = var2.method5137();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method5142();
        }
        int var4 = var2.method5137();
        if (var3 >= 7) {
            this.field3129 = var2.method5341();
        } else {
            this.field3129 = var2.method5139();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3138 = new int[this.field3129];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3129; var7++) {
                this.field3138[var7] = var5 += var2.method5341();
                if (this.field3138[var7] > var6) {
                    var6 = this.field3138[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3129; var8++) {
                this.field3138[var8] = var5 += var2.method5139();
                if (this.field3138[var8] > var6) {
                    var6 = this.field3138[var8];
                }
            }
        }
        this.field3130 = new int[var6 + 1];
        this.field3134 = new int[var6 + 1];
        this.field3135 = new int[var6 + 1];
        this.field3136 = new int[var6 + 1][];
        this.field3139 = new Object[var6 + 1];
        this.field3147 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3131 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3129; var9++) {
                this.field3131[this.field3138[var9]] = var2.method5142();
            }
            this.field3132 = new class345(this.field3131);
        }
        for (int var10 = 0; var10 < this.field3129; var10++) {
            this.field3130[this.field3138[var10]] = var2.method5142();
        }
        for (int var11 = 0; var11 < this.field3129; var11++) {
            this.field3134[this.field3138[var11]] = var2.method5142();
        }
        for (int var12 = 0; var12 < this.field3129; var12++) {
            this.field3135[this.field3138[var12]] = var2.method5139();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3129; var13++) {
                int var14 = this.field3138[var13];
                int var15 = this.field3135[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3136[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3136[var14][var18] = var16 += var2.method5341();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3147[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3129; var20++) {
                int var21 = this.field3138[var20];
                int var22 = this.field3135[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3136[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3136[var21][var25] = var23 += var2.method5139();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3147[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3128 = new int[var6 + 1][];
        this.field3137 = new class345[var6 + 1];
        for (int var27 = 0; var27 < this.field3129; var27++) {
            int var28 = this.field3138[var27];
            int var29 = this.field3135[var28];
            this.field3128[var28] = new int[this.field3147[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3128[var28][this.field3136[var28][var30]] = var2.method5142();
            }
            this.field3137[var28] = new class345(this.field3128[var28]);
        }
    }

    @ObfuscatedName("iy.m(IB)V")
    public void method3900(int arg0) {
    }

    @ObfuscatedName("iy.k(IIB)[B")
    public byte[] method3869(int arg0, int arg1) {
        return this.method3908(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("iy.d(II[II)[B")
    public byte[] method3908(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3147.length || this.field3147[arg0] == null || arg1 < 0 || arg1 >= this.field3147[arg0].length) {
            return null;
        }
        if (this.field3147[arg0][arg1] == null) {
            boolean var4 = this.method3884(arg0, arg2);
            if (!var4) {
                this.method3943(arg0);
                boolean var5 = this.method3884(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class215.method572(this.field3147[arg0][arg1], false);
        if (this.field3133) {
            this.field3147[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("iy.w(III)Z")
    public boolean method3883(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3147.length || this.field3147[arg0] == null || arg1 < 0 || arg1 >= this.field3147[arg0].length) {
            return false;
        } else if (this.field3147[arg0][arg1] != null) {
            return true;
        } else if (this.field3139[arg0] == null) {
            this.method3943(arg0);
            return this.field3139[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iy.v(II)Z")
    public boolean method3872(int arg0) {
        if (this.field3147.length == 1) {
            return this.method3883(0, arg0);
        } else if (this.field3147[arg0].length == 1) {
            return this.method3883(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iy.q(IB)Z")
    public boolean method3895(int arg0) {
        if (this.field3139[arg0] == null) {
            this.method3943(arg0);
            return this.field3139[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iy.z(I)Z")
    public boolean method3874() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3138.length; var2++) {
            int var3 = this.field3138[var2];
            if (this.field3139[var3] == null) {
                this.method3943(var3);
                if (this.field3139[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("iy.t(IB)I")
    public int method3875(int arg0) {
        return this.field3139[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("iy.e(II)[B")
    public byte[] method3876(int arg0) {
        if (this.field3147.length == 1) {
            return this.method3869(0, arg0);
        } else if (this.field3147[arg0].length == 1) {
            return this.method3869(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iy.s(III)[B")
    public byte[] method3877(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3147.length || this.field3147[arg0] == null || arg1 < 0 || arg1 >= this.field3147[arg0].length) {
            return null;
        }
        if (this.field3147[arg0][arg1] == null) {
            boolean var3 = this.method3884(arg0, (int[]) null);
            if (!var3) {
                this.method3943(arg0);
                boolean var4 = this.method3884(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class215.method572(this.field3147[arg0][arg1], false);
    }

    @ObfuscatedName("iy.p(IB)[B")
    public byte[] method3870(int arg0) {
        if (this.field3147.length == 1) {
            return this.method3877(0, arg0);
        } else if (this.field3147[arg0].length == 1) {
            return this.method3877(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iy.n(IB)V")
    public void method3943(int arg0) {
    }

    @ObfuscatedName("iy.u(II)[I")
    public int[] method3879(int arg0) {
        return arg0 >= 0 && arg0 < this.field3136.length ? this.field3136[arg0] : null;
    }

    @ObfuscatedName("iy.h(IB)I")
    public int method3891(int arg0) {
        return this.field3147[arg0].length;
    }

    @ObfuscatedName("iy.g(B)I")
    public int method3880() {
        return this.field3147.length;
    }

    @ObfuscatedName("iy.i(I)V")
    public void method3881() {
        for (int var1 = 0; var1 < this.field3139.length; var1++) {
            this.field3139[var1] = null;
        }
    }

    @ObfuscatedName("iy.a(II)V")
    public void method3882(int arg0) {
        for (int var2 = 0; var2 < this.field3147[arg0].length; var2++) {
            this.field3147[arg0][var2] = null;
        }
    }

    @ObfuscatedName("iy.o(B)V")
    public void method3918() {
        for (int var1 = 0; var1 < this.field3147.length; var1++) {
            if (this.field3147[var1] != null) {
                for (int var2 = 0; var2 < this.field3147[var1].length; var2++) {
                    this.field3147[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("iy.c(I[II)Z")
    public boolean method3884(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("iy.f(Ljava/lang/String;S)I")
    public int method3885(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3132.method6135(class301.method4165(var2));
    }

    @ObfuscatedName("iy.ae(ILjava/lang/String;I)I")
    public int method3878(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3137[arg0].method6135(class301.method4165(var3));
    }

    @ObfuscatedName("iy.an(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3944(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3132.method6135(class301.method4165(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3137[var5].method6135(class301.method4165(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("iy.ai(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3868(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3132.method6135(class301.method4165(var3));
        int var6 = this.field3137[var5].method6135(class301.method4165(var4));
        return this.method3869(var5, var6);
    }

    @ObfuscatedName("iy.ap(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3886(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3132.method6135(class301.method4165(var3));
        int var6 = this.field3137[var5].method6135(class301.method4165(var4));
        return this.method3883(var5, var6);
    }

    @ObfuscatedName("iy.ab(Ljava/lang/String;S)Z")
    public boolean method3890(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3132.method6135(class301.method4165(var2));
        return this.method3895(var3);
    }

    @ObfuscatedName("iy.ar(Ljava/lang/String;I)V")
    public void method3905(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3132.method6135(class301.method4165(var2));
        if (var3 >= 0) {
            this.method3900(var3);
        }
    }

    @ObfuscatedName("iy.af(Ljava/lang/String;B)I")
    public int method3906(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3132.method6135(class301.method4165(var2));
        return this.method3875(var3);
    }

    @ObfuscatedName("hw.at([BI)[B")
    public static final byte[] method3667(byte[] arg0) {
        class310 var1 = new class310(arg0);
        int var2 = var1.method5137();
        int var3 = var1.method5142();
        if (var3 < 0 || !(field3144 == 0 || var3 <= field3144)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5210(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5142();
            if (var5 < 0 || field3144 != 0 && var5 > field3144) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class314.method5421(var6, var5, arg0, var3, 9);
            } else {
                field3141.method6131(var1, var6);
            }
            return var6;
        }
    }
}
