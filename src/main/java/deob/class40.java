package deob;

@ObfuscatedName("ac")
public class class40 extends class205 {

    @ObfuscatedName("ac.g")
    public static class194 field880 = new class194(64);

    @ObfuscatedName("ac.h")
    public static class194 field881 = new class194(50);

    @ObfuscatedName("ac.z")
    public int field912;

    @ObfuscatedName("ac.r")
    public String field886 = "null";

    @ObfuscatedName("ac.f")
    public int field882 = 1;

    @ObfuscatedName("ac.s")
    public int[] field885;

    @ObfuscatedName("ac.d")
    public int[] field883;

    @ObfuscatedName("ac.l")
    public int field887 = -1;

    @ObfuscatedName("ac.y")
    public int field878 = -1;

    @ObfuscatedName("ac.p")
    public int field889 = -1;

    @ObfuscatedName("ac.k")
    public int field899 = -1;

    @ObfuscatedName("ac.o")
    public int field891 = -1;

    @ObfuscatedName("ac.b")
    public int field890 = -1;

    @ObfuscatedName("ac.j")
    public int field904 = -1;

    @ObfuscatedName("ac.a")
    public short[] field894;

    @ObfuscatedName("ac.u")
    public short[] field895;

    @ObfuscatedName("ac.c")
    public short[] field896;

    @ObfuscatedName("ac.n")
    public short[] field897;

    @ObfuscatedName("ac.q")
    public String[] field893 = new String[5];

    @ObfuscatedName("ac.x")
    public boolean field884 = true;

    @ObfuscatedName("ac.v")
    public int field900 = -1;

    @ObfuscatedName("ac.m")
    public int field901 = 128;

    @ObfuscatedName("ac.w")
    public int field902 = 128;

    @ObfuscatedName("ac.e")
    public boolean field903 = false;

    @ObfuscatedName("ac.ad")
    public int field888 = 0;

    @ObfuscatedName("ac.as")
    public int field905 = 0;

    @ObfuscatedName("ac.ag")
    public int field892 = -1;

    @ObfuscatedName("ac.al")
    public int field898 = 32;

    @ObfuscatedName("ac.av")
    public int[] field908;

    @ObfuscatedName("ac.ar")
    public int field909 = -1;

    @ObfuscatedName("ac.ay")
    public int field910 = -1;

    @ObfuscatedName("ac.aq")
    public boolean field911 = true;

    @ObfuscatedName("ac.ai")
    public boolean field907 = true;

    @ObfuscatedName("ac.an")
    public boolean field913 = false;

    @ObfuscatedName("ac.aw")
    public int field914 = 30;

    @ObfuscatedName("fj.t(Lfp;Lfp;I)V")
    public static void method2927(class168 arg0, class168 arg1) {
        Statics.field906 = arg0;
        Statics.field879 = arg1;
    }

    @ObfuscatedName("u.i(II)Lac;")
    public static class40 method160(int arg0) {
        class40 var1 = (class40) field880.method3453((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field906.method3002(9, arg0);
        class40 var3 = new class40();
        var3.field912 = arg0;
        if (var2 != null) {
            var3.method716(new class120(var2));
        }
        var3.method750();
        field880.method3461(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.g(I)V")
    public void method750() {
    }

    @ObfuscatedName("ac.h(Ldr;I)V")
    public void method716(class120 arg0) {
        while (true) {
            int var2 = arg0.method2334();
            if (var2 == 0) {
                return;
            }
            this.method717(arg0, var2);
        }
    }

    @ObfuscatedName("ac.z(Ldr;IB)V")
    public void method717(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2334();
            this.field885 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field885[var4] = arg0.method2310();
            }
        } else if (arg1 == 2) {
            this.field886 = arg0.method2316();
        } else if (arg1 == 12) {
            this.field882 = arg0.method2334();
        } else if (arg1 == 13) {
            this.field887 = arg0.method2310();
        } else if (arg1 == 14) {
            this.field899 = arg0.method2310();
        } else if (arg1 == 15) {
            this.field878 = arg0.method2310();
        } else if (arg1 == 16) {
            this.field889 = arg0.method2310();
        } else if (arg1 == 17) {
            this.field899 = arg0.method2310();
            this.field891 = arg0.method2310();
            this.field890 = arg0.method2310();
            this.field904 = arg0.method2310();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field893[arg1 - 30] = arg0.method2316();
            if (this.field893[arg1 - 30].equalsIgnoreCase(class158.field2339)) {
                this.field893[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2334();
            this.field894 = new short[var5];
            this.field895 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field894[var6] = (short) arg0.method2310();
                this.field895[var6] = (short) arg0.method2310();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2334();
            this.field896 = new short[var7];
            this.field897 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field896[var8] = (short) arg0.method2310();
                this.field897[var8] = (short) arg0.method2310();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2334();
            this.field883 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field883[var10] = arg0.method2310();
            }
        } else if (arg1 == 93) {
            this.field884 = false;
        } else if (arg1 == 95) {
            this.field900 = arg0.method2310();
        } else if (arg1 == 97) {
            this.field901 = arg0.method2310();
        } else if (arg1 == 98) {
            this.field902 = arg0.method2310();
        } else if (arg1 == 99) {
            this.field903 = true;
        } else if (arg1 == 100) {
            this.field888 = arg0.method2309();
        } else if (arg1 == 101) {
            this.field905 = arg0.method2309();
        } else if (arg1 == 102) {
            this.field892 = arg0.method2310();
        } else if (arg1 == 103) {
            this.field898 = arg0.method2310();
        } else if (arg1 == 106) {
            this.field909 = arg0.method2310();
            if (this.field909 == 65535) {
                this.field909 = -1;
            }
            this.field910 = arg0.method2310();
            if (this.field910 == 65535) {
                this.field910 = -1;
            }
            int var11 = arg0.method2334();
            this.field908 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field908[var12] = arg0.method2310();
                if (this.field908[var12] == 65535) {
                    this.field908[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field911 = false;
        } else if (arg1 == 109) {
            this.field907 = false;
        } else if (arg1 == 111) {
            this.field913 = true;
        } else if (arg1 == 112) {
            this.field914 = arg0.method2334();
        }
    }

    @ObfuscatedName("ac.r(Lah;ILah;IB)Ldk;")
    public final class106 method714(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field908 != null) {
            class40 var5 = this.method720();
            return var5 == null ? null : var5.method714(arg0, arg1, arg2, arg3);
        }
        class106 var6 = (class106) field881.method3453((long) this.field912);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field885.length; var8++) {
                if (!Statics.field879.method3040(this.field885[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field885.length];
            for (int var10 = 0; var10 < this.field885.length; var10++) {
                var9[var10] = class101.method2021(Statics.field879, this.field885[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field894 != null) {
                for (int var12 = 0; var12 < this.field894.length; var12++) {
                    var11.method2050(this.field894[var12], this.field895[var12]);
                }
            }
            if (this.field896 != null) {
                for (int var13 = 0; var13 < this.field896.length; var13++) {
                    var11.method2038(this.field896[var13], this.field897[var13]);
                }
            }
            var6 = var11.method2030(this.field888 + 64, this.field905 * 5 + 850, -30, -50, -30);
            field881.method3461(var6, (long) this.field912);
        }
        class106 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method823(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method816(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2104(true);
        } else {
            var14 = arg2.method816(var6, arg3);
        }
        if (this.field901 != 128 || this.field902 != 128) {
            var14.method2164(this.field901, this.field902, this.field901);
        }
        return var14;
    }

    @ObfuscatedName("ac.f(B)Lca;")
    public final class101 method719() {
        if (this.field908 != null) {
            class40 var1 = this.method720();
            return var1 == null ? null : var1.method719();
        } else if (this.field883 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field883.length; var3++) {
                if (!Statics.field879.method3040(this.field883[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field883.length];
            for (int var5 = 0; var5 < this.field883.length; var5++) {
                var4[var5] = class101.method2021(Statics.field879, this.field883[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field894 != null) {
                for (int var7 = 0; var7 < this.field894.length; var7++) {
                    var6.method2050(this.field894[var7], this.field895[var7]);
                }
            }
            if (this.field896 != null) {
                for (int var8 = 0; var8 < this.field896.length; var8++) {
                    var6.method2038(this.field896[var8], this.field897[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ac.s(B)Lac;")
    public final class40 method720() {
        int var1 = -1;
        if (this.field909 != -1) {
            var1 = class177.method135(this.field909);
        } else if (this.field910 != -1) {
            var1 = class177.field2924[this.field910];
        }
        return var1 < 0 || var1 >= this.field908.length || this.field908[var1] == -1 ? null : method160(this.field908[var1]);
    }

    @ObfuscatedName("ac.d(I)Z")
    public boolean method734() {
        if (this.field908 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field909 != -1) {
            var1 = class177.method135(this.field909);
        } else if (this.field910 != -1) {
            var1 = class177.field2924[this.field910];
        }
        return var1 >= 0 && var1 < this.field908.length && this.field908[var1] != -1;
    }
}
