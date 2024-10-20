package deob;

@ObfuscatedName("ag")
public class class40 extends class204 {

    @ObfuscatedName("ag.i")
    public static class193 field926 = new class193(64);

    @ObfuscatedName("ag.q")
    public static class193 field891 = new class193(50);

    @ObfuscatedName("ag.p")
    public int field892;

    @ObfuscatedName("ag.c")
    public String field922 = "null";

    @ObfuscatedName("ag.f")
    public int field894 = 1;

    @ObfuscatedName("ag.y")
    public int[] field895;

    @ObfuscatedName("ag.w")
    public int[] field918;

    @ObfuscatedName("ag.l")
    public int field897 = -1;

    @ObfuscatedName("ag.v")
    public int field899 = -1;

    @ObfuscatedName("ag.k")
    public int field912 = -1;

    @ObfuscatedName("ag.o")
    public int field893 = -1;

    @ObfuscatedName("ag.u")
    public int field901 = -1;

    @ObfuscatedName("ag.s")
    public int field902 = -1;

    @ObfuscatedName("ag.g")
    public int field903 = -1;

    @ObfuscatedName("ag.x")
    public short[] field904;

    @ObfuscatedName("ag.a")
    public short[] field905;

    @ObfuscatedName("ag.t")
    public short[] field906;

    @ObfuscatedName("ag.z")
    public short[] field907;

    @ObfuscatedName("ag.r")
    public String[] field908 = new String[5];

    @ObfuscatedName("ag.d")
    public boolean field909 = true;

    @ObfuscatedName("ag.n")
    public int field910 = -1;

    @ObfuscatedName("ag.j")
    public int field915 = 128;

    @ObfuscatedName("ag.b")
    public int field921 = 128;

    @ObfuscatedName("ag.e")
    public boolean field913 = false;

    @ObfuscatedName("ag.ai")
    public int field914 = 0;

    @ObfuscatedName("ag.ao")
    public int field911 = 0;

    @ObfuscatedName("ag.af")
    public int field916 = -1;

    @ObfuscatedName("ag.ab")
    public int field900 = 32;

    @ObfuscatedName("ag.ax")
    public int[] field898;

    @ObfuscatedName("ag.ap")
    public int field919 = -1;

    @ObfuscatedName("ag.as")
    public int field920 = -1;

    @ObfuscatedName("ag.av")
    public boolean field889 = true;

    @ObfuscatedName("ag.am")
    public boolean field888 = true;

    @ObfuscatedName("ag.aa")
    public boolean field890 = false;

    @ObfuscatedName("ag.aq")
    public int field924 = 30;

    @ObfuscatedName("dm.h(II)Lag;")
    public static class40 method2608(int arg0) {
        class40 var1 = (class40) field926.method3472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field896.method3051(9, arg0);
        class40 var3 = new class40();
        var3.field892 = arg0;
        if (var2 != null) {
            var3.method754(new class119(var2));
        }
        var3.method751();
        field926.method3474(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.m(I)V")
    public void method751() {
    }

    @ObfuscatedName("ag.i(Ldp;I)V")
    public void method754(class119 arg0) {
        while (true) {
            int var2 = arg0.method2320();
            if (var2 == 0) {
                return;
            }
            this.method728(arg0, var2);
        }
    }

    @ObfuscatedName("ag.q(Ldp;II)V")
    public void method728(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2320();
            this.field895 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field895[var4] = arg0.method2322();
            }
        } else if (arg1 == 2) {
            this.field922 = arg0.method2350();
        } else if (arg1 == 12) {
            this.field894 = arg0.method2320();
        } else if (arg1 == 13) {
            this.field897 = arg0.method2322();
        } else if (arg1 == 14) {
            this.field893 = arg0.method2322();
        } else if (arg1 == 15) {
            this.field899 = arg0.method2322();
        } else if (arg1 == 16) {
            this.field912 = arg0.method2322();
        } else if (arg1 == 17) {
            this.field893 = arg0.method2322();
            this.field901 = arg0.method2322();
            this.field902 = arg0.method2322();
            this.field903 = arg0.method2322();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field908[arg1 - 30] = arg0.method2350();
            if (this.field908[arg1 - 30].equalsIgnoreCase(class157.field2298)) {
                this.field908[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2320();
            this.field904 = new short[var5];
            this.field905 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field904[var6] = (short) arg0.method2322();
                this.field905[var6] = (short) arg0.method2322();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2320();
            this.field906 = new short[var7];
            this.field907 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field906[var8] = (short) arg0.method2322();
                this.field907[var8] = (short) arg0.method2322();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2320();
            this.field918 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field918[var10] = arg0.method2322();
            }
        } else if (arg1 == 93) {
            this.field909 = false;
        } else if (arg1 == 95) {
            this.field910 = arg0.method2322();
        } else if (arg1 == 97) {
            this.field915 = arg0.method2322();
        } else if (arg1 == 98) {
            this.field921 = arg0.method2322();
        } else if (arg1 == 99) {
            this.field913 = true;
        } else if (arg1 == 100) {
            this.field914 = arg0.method2425();
        } else if (arg1 == 101) {
            this.field911 = arg0.method2425() * 5;
        } else if (arg1 == 102) {
            this.field916 = arg0.method2322();
        } else if (arg1 == 103) {
            this.field900 = arg0.method2322();
        } else if (arg1 == 106) {
            this.field919 = arg0.method2322();
            if (this.field919 == 65535) {
                this.field919 = -1;
            }
            this.field920 = arg0.method2322();
            if (this.field920 == 65535) {
                this.field920 = -1;
            }
            int var11 = arg0.method2320();
            this.field898 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field898[var12] = arg0.method2322();
                if (this.field898[var12] == 65535) {
                    this.field898[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field889 = false;
        } else if (arg1 == 109) {
            this.field888 = false;
        } else if (arg1 == 111) {
            this.field890 = true;
        } else if (arg1 == 112) {
            this.field924 = arg0.method2320();
        }
    }

    @ObfuscatedName("ag.p(Laz;ILaz;IB)Ldb;")
    public final class105 method747(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field898 != null) {
            class40 var5 = this.method731();
            return var5 == null ? null : var5.method747(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field891.method3472((long) this.field892);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field895.length; var8++) {
                if (!Statics.field923.method3080(this.field895[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field895.length];
            for (int var10 = 0; var10 < this.field895.length; var10++) {
                var9[var10] = class100.method2081(Statics.field923, this.field895[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field904 != null) {
                for (int var12 = 0; var12 < this.field904.length; var12++) {
                    var11.method2098(this.field904[var12], this.field905[var12]);
                }
            }
            if (this.field906 != null) {
                for (int var13 = 0; var13 < this.field906.length; var13++) {
                    var11.method2038(this.field906[var13], this.field907[var13]);
                }
            }
            var6 = var11.method2067(this.field914 + 64, this.field911 + 850, -30, -50, -30);
            field891.method3474(var6, (long) this.field892);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method829(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method826(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2118(true);
        } else {
            var14 = arg2.method826(var6, arg3);
        }
        if (this.field915 != 128 || this.field921 != 128) {
            var14.method2131(this.field915, this.field921, this.field915);
        }
        return var14;
    }

    @ObfuscatedName("ag.c(I)Lcl;")
    public final class100 method730() {
        if (this.field898 != null) {
            class40 var1 = this.method731();
            return var1 == null ? null : var1.method730();
        } else if (this.field918 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field918.length; var3++) {
                if (!Statics.field923.method3080(this.field918[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field918.length];
            for (int var5 = 0; var5 < this.field918.length; var5++) {
                var4[var5] = class100.method2081(Statics.field923, this.field918[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field904 != null) {
                for (int var7 = 0; var7 < this.field904.length; var7++) {
                    var6.method2098(this.field904[var7], this.field905[var7]);
                }
            }
            if (this.field906 != null) {
                for (int var8 = 0; var8 < this.field906.length; var8++) {
                    var6.method2038(this.field906[var8], this.field907[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ag.f(I)Lag;")
    public final class40 method731() {
        int var1 = -1;
        if (this.field919 != -1) {
            var1 = class176.method624(this.field919);
        } else if (this.field920 != -1) {
            var1 = class176.field2896[this.field920];
        }
        return var1 < 0 || var1 >= this.field898.length || this.field898[var1] == -1 ? null : method2608(this.field898[var1]);
    }

    @ObfuscatedName("ag.y(I)Z")
    public boolean method727() {
        if (this.field898 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field919 != -1) {
            var1 = class176.method624(this.field919);
        } else if (this.field920 != -1) {
            var1 = class176.field2896[this.field920];
        }
        return var1 >= 0 && var1 < this.field898.length && this.field898[var1] != -1;
    }
}
