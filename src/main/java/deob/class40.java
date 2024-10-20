package deob;

@ObfuscatedName("ax")
public class class40 extends class204 {

    @ObfuscatedName("ax.i")
    public static class193 field877 = new class193(64);

    @ObfuscatedName("ax.h")
    public static class193 field878 = new class193(50);

    @ObfuscatedName("ax.q")
    public int field876;

    @ObfuscatedName("ax.u")
    public String field896 = "null";

    @ObfuscatedName("ax.m")
    public int field881 = 1;

    @ObfuscatedName("ax.y")
    public int[] field882;

    @ObfuscatedName("ax.p")
    public int[] field883;

    @ObfuscatedName("ax.t")
    public int field892 = -1;

    @ObfuscatedName("ax.g")
    public int field885 = -1;

    @ObfuscatedName("ax.v")
    public int field886 = -1;

    @ObfuscatedName("ax.l")
    public int field887 = -1;

    @ObfuscatedName("ax.e")
    public int field888 = -1;

    @ObfuscatedName("ax.a")
    public int field895 = -1;

    @ObfuscatedName("ax.w")
    public int field890 = -1;

    @ObfuscatedName("ax.d")
    public short[] field891;

    @ObfuscatedName("ax.z")
    public short[] field884;

    @ObfuscatedName("ax.s")
    public short[] field880;

    @ObfuscatedName("ax.j")
    public short[] field879;

    @ObfuscatedName("ax.b")
    public String[] field904 = new String[5];

    @ObfuscatedName("ax.r")
    public boolean field908 = true;

    @ObfuscatedName("ax.n")
    public int field893 = -1;

    @ObfuscatedName("ax.c")
    public int field898 = 128;

    @ObfuscatedName("ax.k")
    public int field899 = 128;

    @ObfuscatedName("ax.x")
    public boolean field900 = false;

    @ObfuscatedName("ax.ar")
    public int field913 = 0;

    @ObfuscatedName("ax.as")
    public int field902 = 0;

    @ObfuscatedName("ax.ac")
    public int field903 = -1;

    @ObfuscatedName("ax.ah")
    public int field897 = 32;

    @ObfuscatedName("ax.al")
    public int[] field894;

    @ObfuscatedName("ax.am")
    public int field906 = -1;

    @ObfuscatedName("ax.ae")
    public int field907 = -1;

    @ObfuscatedName("ax.ai")
    public boolean field889 = true;

    @ObfuscatedName("ax.aa")
    public boolean field909 = true;

    @ObfuscatedName("ax.ag")
    public boolean field910 = false;

    @ObfuscatedName("ax.an")
    public int field911 = 30;

    @ObfuscatedName("ec.o(Lfd;Lfd;B)V")
    public static void method2705(class167 arg0, class167 arg1) {
        Statics.field905 = arg0;
        Statics.field3149 = arg1;
    }

    @ObfuscatedName("fm.f(II)Lax;")
    public static class40 method3100(int arg0) {
        class40 var1 = (class40) field877.method3456((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field905.method3030(9, arg0);
        class40 var3 = new class40();
        var3.field876 = arg0;
        if (var2 != null) {
            var3.method734(new class119(var2));
        }
        var3.method732();
        field877.method3451(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.i(I)V")
    public void method732() {
    }

    @ObfuscatedName("ax.h(Ldc;B)V")
    public void method734(class119 arg0) {
        while (true) {
            int var2 = arg0.method2290();
            if (var2 == 0) {
                return;
            }
            this.method742(arg0, var2);
        }
    }

    @ObfuscatedName("ax.q(Ldc;IB)V")
    public void method742(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2290();
            this.field882 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field882[var4] = arg0.method2292();
            }
        } else if (arg1 == 2) {
            this.field896 = arg0.method2344();
        } else if (arg1 == 12) {
            this.field881 = arg0.method2290();
        } else if (arg1 == 13) {
            this.field892 = arg0.method2292();
        } else if (arg1 == 14) {
            this.field887 = arg0.method2292();
        } else if (arg1 == 15) {
            this.field885 = arg0.method2292();
        } else if (arg1 == 16) {
            this.field886 = arg0.method2292();
        } else if (arg1 == 17) {
            this.field887 = arg0.method2292();
            this.field888 = arg0.method2292();
            this.field895 = arg0.method2292();
            this.field890 = arg0.method2292();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field904[arg1 - 30] = arg0.method2344();
            if (this.field904[arg1 - 30].equalsIgnoreCase(class157.field2301)) {
                this.field904[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2290();
            this.field891 = new short[var5];
            this.field884 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field891[var6] = (short) arg0.method2292();
                this.field884[var6] = (short) arg0.method2292();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2290();
            this.field880 = new short[var7];
            this.field879 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field880[var8] = (short) arg0.method2292();
                this.field879[var8] = (short) arg0.method2292();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2290();
            this.field883 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field883[var10] = arg0.method2292();
            }
        } else if (arg1 == 93) {
            this.field908 = false;
        } else if (arg1 == 95) {
            this.field893 = arg0.method2292();
        } else if (arg1 == 97) {
            this.field898 = arg0.method2292();
        } else if (arg1 == 98) {
            this.field899 = arg0.method2292();
        } else if (arg1 == 99) {
            this.field900 = true;
        } else if (arg1 == 100) {
            this.field913 = arg0.method2435();
        } else if (arg1 == 101) {
            this.field902 = arg0.method2435();
        } else if (arg1 == 102) {
            this.field903 = arg0.method2292();
        } else if (arg1 == 103) {
            this.field897 = arg0.method2292();
        } else if (arg1 == 106) {
            this.field906 = arg0.method2292();
            if (this.field906 == 65535) {
                this.field906 = -1;
            }
            this.field907 = arg0.method2292();
            if (this.field907 == 65535) {
                this.field907 = -1;
            }
            int var11 = arg0.method2290();
            this.field894 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field894[var12] = arg0.method2292();
                if (this.field894[var12] == 65535) {
                    this.field894[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field889 = false;
        } else if (arg1 == 109) {
            this.field909 = false;
        } else if (arg1 == 111) {
            this.field910 = true;
        } else if (arg1 == 112) {
            this.field911 = arg0.method2290();
        }
    }

    @ObfuscatedName("ax.u(Lau;ILau;II)Ldm;")
    public final class105 method738(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field894 != null) {
            class40 var5 = this.method735();
            return var5 == null ? null : var5.method738(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field878.method3456((long) this.field876);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field882.length; var8++) {
                if (!Statics.field3149.method2976(this.field882[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field882.length];
            for (int var10 = 0; var10 < this.field882.length; var10++) {
                var9[var10] = class100.method2000(Statics.field3149, this.field882[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field891 != null) {
                for (int var12 = 0; var12 < this.field891.length; var12++) {
                    var11.method2013(this.field891[var12], this.field884[var12]);
                }
            }
            if (this.field880 != null) {
                for (int var13 = 0; var13 < this.field880.length; var13++) {
                    var11.method2014(this.field880[var13], this.field879[var13]);
                }
            }
            var6 = var11.method2036(this.field913 + 64, this.field902 * 5 + 850, -30, -50, -30);
            field878.method3451(var6, (long) this.field876);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method812(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method817(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2090(true);
        } else {
            var14 = arg2.method817(var6, arg3);
        }
        if (this.field898 != 128 || this.field899 != 128) {
            var14.method2161(this.field898, this.field899, this.field898);
        }
        return var14;
    }

    @ObfuscatedName("ax.m(S)Lck;")
    public final class100 method737() {
        if (this.field894 != null) {
            class40 var1 = this.method735();
            return var1 == null ? null : var1.method737();
        } else if (this.field883 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field883.length; var3++) {
                if (!Statics.field3149.method2976(this.field883[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field883.length];
            for (int var5 = 0; var5 < this.field883.length; var5++) {
                var4[var5] = class100.method2000(Statics.field3149, this.field883[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field891 != null) {
                for (int var7 = 0; var7 < this.field891.length; var7++) {
                    var6.method2013(this.field891[var7], this.field884[var7]);
                }
            }
            if (this.field880 != null) {
                for (int var8 = 0; var8 < this.field880.length; var8++) {
                    var6.method2014(this.field880[var8], this.field879[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ax.y(I)Lax;")
    public final class40 method735() {
        int var1 = -1;
        if (this.field906 != -1) {
            var1 = class176.method701(this.field906);
        } else if (this.field907 != -1) {
            var1 = class176.field2901[this.field907];
        }
        return var1 < 0 || var1 >= this.field894.length || this.field894[var1] == -1 ? null : method3100(this.field894[var1]);
    }

    @ObfuscatedName("ax.p(I)Z")
    public boolean method748() {
        if (this.field894 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field906 != -1) {
            var1 = class176.method701(this.field906);
        } else if (this.field907 != -1) {
            var1 = class176.field2901[this.field907];
        }
        return var1 >= 0 && var1 < this.field894.length && this.field894[var1] != -1;
    }
}
