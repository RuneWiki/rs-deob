package deob;

@ObfuscatedName("aw")
public class class42 extends class208 {

    @ObfuscatedName("aw.f")
    public static class197 field904 = new class197(64);

    @ObfuscatedName("aw.c")
    public static class197 field897 = new class197(50);

    @ObfuscatedName("aw.v")
    public int field898;

    @ObfuscatedName("aw.j")
    public String field914 = "null";

    @ObfuscatedName("aw.m")
    public int field900 = 1;

    @ObfuscatedName("aw.y")
    public int[] field895;

    @ObfuscatedName("aw.u")
    public int[] field913;

    @ObfuscatedName("aw.h")
    public int field903 = -1;

    @ObfuscatedName("aw.l")
    public int field902 = -1;

    @ObfuscatedName("aw.b")
    public int field923 = -1;

    @ObfuscatedName("aw.g")
    public int field906 = -1;

    @ObfuscatedName("aw.e")
    public int field907 = -1;

    @ObfuscatedName("aw.p")
    public int field908 = -1;

    @ObfuscatedName("aw.s")
    public int field909 = -1;

    @ObfuscatedName("aw.w")
    public short[] field910;

    @ObfuscatedName("aw.i")
    public short[] field911;

    @ObfuscatedName("aw.r")
    public short[] field912;

    @ObfuscatedName("aw.a")
    public short[] field905;

    @ObfuscatedName("aw.n")
    public String[] field916 = new String[5];

    @ObfuscatedName("aw.z")
    public boolean field915 = true;

    @ObfuscatedName("aw.x")
    public int field899 = -1;

    @ObfuscatedName("aw.d")
    public int field896 = 128;

    @ObfuscatedName("aw.t")
    public int field918 = 128;

    @ObfuscatedName("aw.o")
    public boolean field932 = false;

    @ObfuscatedName("aw.aq")
    public int field920 = 0;

    @ObfuscatedName("aw.al")
    public int field921 = 0;

    @ObfuscatedName("aw.av")
    public int field929 = -1;

    @ObfuscatedName("aw.ad")
    public int field919 = 32;

    @ObfuscatedName("aw.at")
    public int[] field924;

    @ObfuscatedName("aw.aj")
    public int field925 = -1;

    @ObfuscatedName("aw.am")
    public int field922 = -1;

    @ObfuscatedName("aw.ay")
    public boolean field927 = true;

    @ObfuscatedName("aw.ag")
    public boolean field928 = true;

    @ObfuscatedName("aw.aa")
    public boolean field901 = false;

    @ObfuscatedName("w.k(Lfo;Lfo;I)V")
    public static void method161(class171 arg0, class171 arg1) {
        Statics.field917 = arg0;
        Statics.field585 = arg1;
    }

    @ObfuscatedName("db.q(II)Law;")
    public static class42 method2307(int arg0) {
        class42 var1 = (class42) field904.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field917.method3097(9, arg0);
        class42 var3 = new class42();
        var3.field898 = arg0;
        if (var2 != null) {
            var3.method763(new class123(var2));
        }
        var3.method768();
        field904.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.f(I)V")
    public void method768() {
    }

    @ObfuscatedName("aw.c(Lde;B)V")
    public void method763(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method764(arg0, var2);
        }
    }

    @ObfuscatedName("aw.v(Lde;IB)V")
    public void method764(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2427();
            this.field895 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field895[var4] = arg0.method2547();
            }
        } else if (arg1 == 2) {
            this.field914 = arg0.method2435();
        } else if (arg1 == 12) {
            this.field900 = arg0.method2427();
        } else if (arg1 == 13) {
            this.field903 = arg0.method2547();
        } else if (arg1 == 14) {
            this.field906 = arg0.method2547();
        } else if (arg1 == 15) {
            this.field902 = arg0.method2547();
        } else if (arg1 == 16) {
            this.field923 = arg0.method2547();
        } else if (arg1 == 17) {
            this.field906 = arg0.method2547();
            this.field907 = arg0.method2547();
            this.field908 = arg0.method2547();
            this.field909 = arg0.method2547();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field916[arg1 - 30] = arg0.method2435();
            if (this.field916[arg1 - 30].equalsIgnoreCase(class161.field2547)) {
                this.field916[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2427();
            this.field910 = new short[var5];
            this.field911 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field910[var6] = (short) arg0.method2547();
                this.field911[var6] = (short) arg0.method2547();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2427();
            this.field912 = new short[var7];
            this.field905 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field912[var8] = (short) arg0.method2547();
                this.field905[var8] = (short) arg0.method2547();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2427();
            this.field913 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field913[var10] = arg0.method2547();
            }
        } else if (arg1 == 93) {
            this.field915 = false;
        } else if (arg1 == 95) {
            this.field899 = arg0.method2547();
        } else if (arg1 == 97) {
            this.field896 = arg0.method2547();
        } else if (arg1 == 98) {
            this.field918 = arg0.method2547();
        } else if (arg1 == 99) {
            this.field932 = true;
        } else if (arg1 == 100) {
            this.field920 = arg0.method2428();
        } else if (arg1 == 101) {
            this.field921 = arg0.method2428() * 5;
        } else if (arg1 == 102) {
            this.field929 = arg0.method2547();
        } else if (arg1 == 103) {
            this.field919 = arg0.method2547();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field925 = arg0.method2547();
            if (this.field925 == 65535) {
                this.field925 = -1;
            }
            this.field922 = arg0.method2547();
            if (this.field922 == 65535) {
                this.field922 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2547();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2427();
            this.field924 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field924[var13] = arg0.method2547();
                if (this.field924[var13] == 65535) {
                    this.field924[var13] = -1;
                }
            }
            this.field924[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field927 = false;
        } else if (arg1 == 109) {
            this.field928 = false;
        } else if (arg1 == 111) {
            this.field901 = true;
        }
    }

    @ObfuscatedName("aw.j(Lan;ILan;II)Ldj;")
    public final class109 method774(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field924 != null) {
            class42 var5 = this.method767();
            return var5 == null ? null : var5.method774(arg0, arg1, arg2, arg3);
        }
        class109 var6 = (class109) field897.method3535((long) this.field898);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field895.length; var8++) {
                if (!Statics.field585.method3074(this.field895[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class104[] var9 = new class104[this.field895.length];
            for (int var10 = 0; var10 < this.field895.length; var10++) {
                var9[var10] = class104.method2141(Statics.field585, this.field895[var10], 0);
            }
            class104 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class104(var9, var9.length);
            }
            if (this.field910 != null) {
                for (int var12 = 0; var12 < this.field910.length; var12++) {
                    var11.method2152(this.field910[var12], this.field911[var12]);
                }
            }
            if (this.field912 != null) {
                for (int var13 = 0; var13 < this.field912.length; var13++) {
                    var11.method2153(this.field912[var13], this.field905[var13]);
                }
            }
            var6 = var11.method2160(this.field920 + 64, this.field921 + 850, -30, -50, -30);
            field897.method3537(var6, (long) this.field898);
        }
        class109 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method883(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method864(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2266(true);
        } else {
            var14 = arg2.method864(var6, arg3);
        }
        if (this.field896 != 128 || this.field918 != 128) {
            var14.method2243(this.field896, this.field918, this.field896);
        }
        return var14;
    }

    @ObfuscatedName("aw.m(I)Lcr;")
    public final class104 method766() {
        if (this.field924 != null) {
            class42 var1 = this.method767();
            return var1 == null ? null : var1.method766();
        } else if (this.field913 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field913.length; var3++) {
                if (!Statics.field585.method3074(this.field913[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class104[] var4 = new class104[this.field913.length];
            for (int var5 = 0; var5 < this.field913.length; var5++) {
                var4[var5] = class104.method2141(Statics.field585, this.field913[var5], 0);
            }
            class104 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class104(var4, var4.length);
            }
            if (this.field910 != null) {
                for (int var7 = 0; var7 < this.field910.length; var7++) {
                    var6.method2152(this.field910[var7], this.field911[var7]);
                }
            }
            if (this.field912 != null) {
                for (int var8 = 0; var8 < this.field912.length; var8++) {
                    var6.method2153(this.field912[var8], this.field905[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aw.y(I)Law;")
    public final class42 method767() {
        int var1 = -1;
        if (this.field925 != -1) {
            var1 = class180.method3744(this.field925);
        } else if (this.field922 != -1) {
            var1 = class180.field2953[this.field922];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field924.length - 1) {
            var2 = this.field924[var1];
        } else {
            var2 = this.field924[this.field924.length - 1];
        }
        return var2 == -1 ? null : method2307(var2);
    }

    @ObfuscatedName("aw.u(I)Z")
    public boolean method789() {
        if (this.field924 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field925 != -1) {
            var1 = class180.method3744(this.field925);
        } else if (this.field922 != -1) {
            var1 = class180.field2953[this.field922];
        }
        if (var1 >= 0 && var1 < this.field924.length) {
            return this.field924[var1] != -1;
        } else {
            return this.field924[this.field924.length - 1] != -1;
        }
    }
}
