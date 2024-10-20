package deob;

@ObfuscatedName("ac")
public class class40 extends class204 {

    @ObfuscatedName("ac.i")
    public static class193 field897 = new class193(64);

    @ObfuscatedName("ac.d")
    public static class193 field906 = new class193(50);

    @ObfuscatedName("ac.o")
    public int field877;

    @ObfuscatedName("ac.c")
    public String field882 = "null";

    @ObfuscatedName("ac.p")
    public int field883 = 1;

    @ObfuscatedName("ac.j")
    public int[] field884;

    @ObfuscatedName("ac.a")
    public int[] field885;

    @ObfuscatedName("ac.y")
    public int field888 = -1;

    @ObfuscatedName("ac.h")
    public int field887 = -1;

    @ObfuscatedName("ac.z")
    public int field893 = -1;

    @ObfuscatedName("ac.w")
    public int field889 = -1;

    @ObfuscatedName("ac.l")
    public int field895 = -1;

    @ObfuscatedName("ac.q")
    public int field891 = -1;

    @ObfuscatedName("ac.x")
    public int field892 = -1;

    @ObfuscatedName("ac.s")
    public short[] field896;

    @ObfuscatedName("ac.n")
    public short[] field880;

    @ObfuscatedName("ac.u")
    public short[] field910;

    @ObfuscatedName("ac.m")
    public short[] field904;

    @ObfuscatedName("ac.e")
    public String[] field878 = new String[5];

    @ObfuscatedName("ac.k")
    public boolean field898 = true;

    @ObfuscatedName("ac.r")
    public int field899 = -1;

    @ObfuscatedName("ac.b")
    public int field900 = 128;

    @ObfuscatedName("ac.t")
    public int field901 = 128;

    @ObfuscatedName("ac.g")
    public boolean field902 = false;

    @ObfuscatedName("ac.af")
    public int field903 = 0;

    @ObfuscatedName("ac.ad")
    public int field894 = 0;

    @ObfuscatedName("ac.ak")
    public int field905 = -1;

    @ObfuscatedName("ac.ai")
    public int field911 = 32;

    @ObfuscatedName("ac.au")
    public int[] field907;

    @ObfuscatedName("ac.ar")
    public int field908 = -1;

    @ObfuscatedName("ac.aw")
    public int field909 = -1;

    @ObfuscatedName("ac.at")
    public boolean field881 = true;

    @ObfuscatedName("ac.al")
    public boolean field890 = true;

    @ObfuscatedName("ac.aj")
    public boolean field912 = false;

    @ObfuscatedName("ac.ag")
    public int field913 = 30;

    @ObfuscatedName("aw.v(II)Lac;")
    public static class40 method706(int arg0) {
        class40 var1 = (class40) field897.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field879.method3082(9, arg0);
        class40 var3 = new class40();
        var3.field877 = arg0;
        if (var2 != null) {
            var3.method747(new class119(var2));
        }
        var3.method765();
        field897.method3502(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.f(I)V")
    public void method765() {
    }

    @ObfuscatedName("ac.i(Ldx;I)V")
    public void method747(class119 arg0) {
        while (true) {
            int var2 = arg0.method2400();
            if (var2 == 0) {
                return;
            }
            this.method748(arg0, var2);
        }
    }

    @ObfuscatedName("ac.d(Ldx;II)V")
    public void method748(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2400();
            this.field884 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field884[var4] = arg0.method2334();
            }
        } else if (arg1 == 2) {
            this.field882 = arg0.method2357();
        } else if (arg1 == 12) {
            this.field883 = arg0.method2400();
        } else if (arg1 == 13) {
            this.field888 = arg0.method2334();
        } else if (arg1 == 14) {
            this.field889 = arg0.method2334();
        } else if (arg1 == 15) {
            this.field887 = arg0.method2334();
        } else if (arg1 == 16) {
            this.field893 = arg0.method2334();
        } else if (arg1 == 17) {
            this.field889 = arg0.method2334();
            this.field895 = arg0.method2334();
            this.field891 = arg0.method2334();
            this.field892 = arg0.method2334();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field878[arg1 - 30] = arg0.method2357();
            if (this.field878[arg1 - 30].equalsIgnoreCase(class157.field2406)) {
                this.field878[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2400();
            this.field896 = new short[var5];
            this.field880 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field896[var6] = (short) arg0.method2334();
                this.field880[var6] = (short) arg0.method2334();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2400();
            this.field910 = new short[var7];
            this.field904 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field910[var8] = (short) arg0.method2334();
                this.field904[var8] = (short) arg0.method2334();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2400();
            this.field885 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field885[var10] = arg0.method2334();
            }
        } else if (arg1 == 93) {
            this.field898 = false;
        } else if (arg1 == 95) {
            this.field899 = arg0.method2334();
        } else if (arg1 == 97) {
            this.field900 = arg0.method2334();
        } else if (arg1 == 98) {
            this.field901 = arg0.method2334();
        } else if (arg1 == 99) {
            this.field902 = true;
        } else if (arg1 == 100) {
            this.field903 = arg0.method2350();
        } else if (arg1 == 101) {
            this.field894 = arg0.method2350() * 5;
        } else if (arg1 == 102) {
            this.field905 = arg0.method2334();
        } else if (arg1 == 103) {
            this.field911 = arg0.method2334();
        } else if (arg1 == 106) {
            this.field908 = arg0.method2334();
            if (this.field908 == 65535) {
                this.field908 = -1;
            }
            this.field909 = arg0.method2334();
            if (this.field909 == 65535) {
                this.field909 = -1;
            }
            int var11 = arg0.method2400();
            this.field907 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field907[var12] = arg0.method2334();
                if (this.field907[var12] == 65535) {
                    this.field907[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field881 = false;
        } else if (arg1 == 109) {
            this.field890 = false;
        } else if (arg1 == 111) {
            this.field912 = true;
        } else if (arg1 == 112) {
            this.field913 = arg0.method2400();
        }
    }

    @ObfuscatedName("ac.o(Lav;ILav;II)Ldq;")
    public final class105 method749(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field907 != null) {
            class40 var5 = this.method751();
            return var5 == null ? null : var5.method749(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field906.method3490((long) this.field877);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field884.length; var8++) {
                if (!Statics.field886.method3070(this.field884[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field884.length];
            for (int var10 = 0; var10 < this.field884.length; var10++) {
                var9[var10] = class100.method2053(Statics.field886, this.field884[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field896 != null) {
                for (int var12 = 0; var12 < this.field896.length; var12++) {
                    var11.method2123(this.field896[var12], this.field880[var12]);
                }
            }
            if (this.field910 != null) {
                for (int var13 = 0; var13 < this.field910.length; var13++) {
                    var11.method2067(this.field910[var13], this.field904[var13]);
                }
            }
            var6 = var11.method2074(this.field903 + 64, this.field894 + 850, -30, -50, -30);
            field906.method3502(var6, (long) this.field877);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method847(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method844(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2156(true);
        } else {
            var14 = arg2.method844(var6, arg3);
        }
        if (this.field900 != 128 || this.field901 != 128) {
            var14.method2170(this.field900, this.field901, this.field900);
        }
        return var14;
    }

    @ObfuscatedName("ac.c(I)Lca;")
    public final class100 method750() {
        if (this.field907 != null) {
            class40 var1 = this.method751();
            return var1 == null ? null : var1.method750();
        } else if (this.field885 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field885.length; var3++) {
                if (!Statics.field886.method3070(this.field885[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field885.length];
            for (int var5 = 0; var5 < this.field885.length; var5++) {
                var4[var5] = class100.method2053(Statics.field886, this.field885[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field896 != null) {
                for (int var7 = 0; var7 < this.field896.length; var7++) {
                    var6.method2123(this.field896[var7], this.field880[var7]);
                }
            }
            if (this.field910 != null) {
                for (int var8 = 0; var8 < this.field910.length; var8++) {
                    var6.method2067(this.field910[var8], this.field904[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ac.p(I)Lac;")
    public final class40 method751() {
        int var1 = -1;
        if (this.field908 != -1) {
            var1 = class176.method542(this.field908);
        } else if (this.field909 != -1) {
            var1 = class176.field2908[this.field909];
        }
        return var1 < 0 || var1 >= this.field907.length || this.field907[var1] == -1 ? null : method706(this.field907[var1]);
    }

    @ObfuscatedName("ac.j(B)Z")
    public boolean method745() {
        if (this.field907 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field908 != -1) {
            var1 = class176.method542(this.field908);
        } else if (this.field909 != -1) {
            var1 = class176.field2908[this.field909];
        }
        return var1 >= 0 && var1 < this.field907.length && this.field907[var1] != -1;
    }
}
