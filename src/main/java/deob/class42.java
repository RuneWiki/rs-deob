package deob;

@ObfuscatedName("ah")
public class class42 extends class208 {

    @ObfuscatedName("ah.e")
    public static class197 field926 = new class197(64);

    @ObfuscatedName("ah.o")
    public static class197 field908 = new class197(50);

    @ObfuscatedName("ah.g")
    public int field909;

    @ObfuscatedName("ah.l")
    public String field921 = "null";

    @ObfuscatedName("ah.j")
    public int field907 = 1;

    @ObfuscatedName("ah.r")
    public int[] field912;

    @ObfuscatedName("ah.x")
    public int[] field917;

    @ObfuscatedName("ah.k")
    public int field914 = -1;

    @ObfuscatedName("ah.v")
    public int field925 = -1;

    @ObfuscatedName("ah.h")
    public int field916 = -1;

    @ObfuscatedName("ah.u")
    public int field932 = -1;

    @ObfuscatedName("ah.y")
    public int field918 = -1;

    @ObfuscatedName("ah.p")
    public int field919 = -1;

    @ObfuscatedName("ah.s")
    public int field920 = -1;

    @ObfuscatedName("ah.f")
    public short[] field906;

    @ObfuscatedName("ah.i")
    public short[] field930;

    @ObfuscatedName("ah.d")
    public short[] field923;

    @ObfuscatedName("ah.t")
    public short[] field924;

    @ObfuscatedName("ah.c")
    public String[] field911 = new String[5];

    @ObfuscatedName("ah.z")
    public boolean field915 = true;

    @ObfuscatedName("ah.n")
    public int field913 = -1;

    @ObfuscatedName("ah.q")
    public int field928 = 128;

    @ObfuscatedName("ah.a")
    public int field922 = 128;

    @ObfuscatedName("ah.b")
    public boolean field910 = false;

    @ObfuscatedName("ah.aj")
    public int field931 = 0;

    @ObfuscatedName("ah.an")
    public int field941 = 0;

    @ObfuscatedName("ah.ap")
    public int field933 = -1;

    @ObfuscatedName("ah.ar")
    public int field934 = 32;

    @ObfuscatedName("ah.ab")
    public int[] field935;

    @ObfuscatedName("ah.ai")
    public int field927 = -1;

    @ObfuscatedName("ah.aa")
    public int field937 = -1;

    @ObfuscatedName("ah.ax")
    public boolean field936 = true;

    @ObfuscatedName("ah.ad")
    public boolean field939 = true;

    @ObfuscatedName("ah.av")
    public boolean field940 = false;

    @ObfuscatedName("w.m(II)Lah;")
    public static class42 method8(int arg0) {
        class42 var1 = (class42) field926.method3556((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field929.method3086(9, arg0);
        class42 var3 = new class42();
        var3.field909 = arg0;
        if (var2 != null) {
            var3.method759(new class123(var2));
        }
        var3.method758();
        field926.method3562(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.w(I)V")
    public void method758() {
    }

    @ObfuscatedName("ah.e(Ldj;I)V")
    public void method759(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method760(arg0, var2);
        }
    }

    @ObfuscatedName("ah.o(Ldj;II)V")
    public void method760(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2398();
            this.field912 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field912[var4] = arg0.method2548();
            }
        } else if (arg1 == 2) {
            this.field921 = arg0.method2422();
        } else if (arg1 == 12) {
            this.field907 = arg0.method2398();
        } else if (arg1 == 13) {
            this.field914 = arg0.method2548();
        } else if (arg1 == 14) {
            this.field932 = arg0.method2548();
        } else if (arg1 == 15) {
            this.field925 = arg0.method2548();
        } else if (arg1 == 16) {
            this.field916 = arg0.method2548();
        } else if (arg1 == 17) {
            this.field932 = arg0.method2548();
            this.field918 = arg0.method2548();
            this.field919 = arg0.method2548();
            this.field920 = arg0.method2548();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field911[arg1 - 30] = arg0.method2422();
            if (this.field911[arg1 - 30].equalsIgnoreCase(class161.field2372)) {
                this.field911[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2398();
            this.field906 = new short[var5];
            this.field930 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field906[var6] = (short) arg0.method2548();
                this.field930[var6] = (short) arg0.method2548();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2398();
            this.field923 = new short[var7];
            this.field924 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field923[var8] = (short) arg0.method2548();
                this.field924[var8] = (short) arg0.method2548();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2398();
            this.field917 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field917[var10] = arg0.method2548();
            }
        } else if (arg1 == 93) {
            this.field915 = false;
        } else if (arg1 == 95) {
            this.field913 = arg0.method2548();
        } else if (arg1 == 97) {
            this.field928 = arg0.method2548();
        } else if (arg1 == 98) {
            this.field922 = arg0.method2548();
        } else if (arg1 == 99) {
            this.field910 = true;
        } else if (arg1 == 100) {
            this.field931 = arg0.method2415();
        } else if (arg1 == 101) {
            this.field941 = arg0.method2415();
        } else if (arg1 == 102) {
            this.field933 = arg0.method2548();
        } else if (arg1 == 103) {
            this.field934 = arg0.method2548();
        } else if (arg1 == 106) {
            this.field927 = arg0.method2548();
            if (this.field927 == 65535) {
                this.field927 = -1;
            }
            this.field937 = arg0.method2548();
            if (this.field937 == 65535) {
                this.field937 = -1;
            }
            int var11 = arg0.method2398();
            this.field935 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field935[var12] = arg0.method2548();
                if (this.field935[var12] == 65535) {
                    this.field935[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field936 = false;
        } else if (arg1 == 109) {
            this.field939 = false;
        } else if (arg1 == 111) {
            this.field940 = true;
        }
    }

    @ObfuscatedName("ah.g(Lac;ILac;II)Ldg;")
    public final class109 method761(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field935 != null) {
            class42 var5 = this.method763();
            return var5 == null ? null : var5.method761(arg0, arg1, arg2, arg3);
        }
        class109 var6 = (class109) field908.method3556((long) this.field909);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field912.length; var8++) {
                if (!Statics.field905.method3141(this.field912[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class104[] var9 = new class104[this.field912.length];
            for (int var10 = 0; var10 < this.field912.length; var10++) {
                var9[var10] = class104.method2177(Statics.field905, this.field912[var10], 0);
            }
            class104 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class104(var9, var9.length);
            }
            if (this.field906 != null) {
                for (int var12 = 0; var12 < this.field906.length; var12++) {
                    var11.method2171(this.field906[var12], this.field930[var12]);
                }
            }
            if (this.field923 != null) {
                for (int var13 = 0; var13 < this.field923.length; var13++) {
                    var11.method2152(this.field923[var13], this.field924[var13]);
                }
            }
            var6 = var11.method2159(this.field931 + 64, this.field941 * 5 + 850, -30, -50, -30);
            field908.method3562(var6, (long) this.field909);
        }
        class109 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method872(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method876(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2222(true);
        } else {
            var14 = arg2.method876(var6, arg3);
        }
        if (this.field928 != 128 || this.field922 != 128) {
            var14.method2245(this.field928, this.field922, this.field928);
        }
        return var14;
    }

    @ObfuscatedName("ah.l(I)Lcj;")
    public final class104 method780() {
        if (this.field935 != null) {
            class42 var1 = this.method763();
            return var1 == null ? null : var1.method780();
        } else if (this.field917 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field917.length; var3++) {
                if (!Statics.field905.method3141(this.field917[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class104[] var4 = new class104[this.field917.length];
            for (int var5 = 0; var5 < this.field917.length; var5++) {
                var4[var5] = class104.method2177(Statics.field905, this.field917[var5], 0);
            }
            class104 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class104(var4, var4.length);
            }
            if (this.field906 != null) {
                for (int var7 = 0; var7 < this.field906.length; var7++) {
                    var6.method2171(this.field906[var7], this.field930[var7]);
                }
            }
            if (this.field923 != null) {
                for (int var8 = 0; var8 < this.field923.length; var8++) {
                    var6.method2152(this.field923[var8], this.field924[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ah.j(I)Lah;")
    public final class42 method763() {
        int var1 = -1;
        if (this.field927 != -1) {
            var1 = class180.method145(this.field927);
        } else if (this.field937 != -1) {
            var1 = class180.field2950[this.field937];
        }
        return var1 < 0 || var1 >= this.field935.length || this.field935[var1] == -1 ? null : method8(this.field935[var1]);
    }

    @ObfuscatedName("ah.r(I)Z")
    public boolean method764() {
        if (this.field935 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field927 != -1) {
            var1 = class180.method145(this.field927);
        } else if (this.field937 != -1) {
            var1 = class180.field2950[this.field937];
        }
        return var1 >= 0 && var1 < this.field935.length && this.field935[var1] != -1;
    }

    @ObfuscatedName("ad.x(I)V")
    public static void method709() {
        field926.method3553();
        field908.method3553();
    }
}
