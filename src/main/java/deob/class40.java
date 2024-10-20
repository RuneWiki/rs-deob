package deob;

@ObfuscatedName("aa")
public class class40 extends class204 {

    @ObfuscatedName("aa.k")
    public static class193 field885 = new class193(64);

    @ObfuscatedName("aa.t")
    public static class193 field886 = new class193(50);

    @ObfuscatedName("aa.g")
    public int field919;

    @ObfuscatedName("aa.o")
    public String field888 = "null";

    @ObfuscatedName("aa.i")
    public int field890 = 1;

    @ObfuscatedName("aa.w")
    public int[] field895;

    @ObfuscatedName("aa.m")
    public int[] field891;

    @ObfuscatedName("aa.r")
    public int field914 = -1;

    @ObfuscatedName("aa.y")
    public int field893 = -1;

    @ObfuscatedName("aa.q")
    public int field894 = -1;

    @ObfuscatedName("aa.f")
    public int field887 = -1;

    @ObfuscatedName("aa.x")
    public int field905 = -1;

    @ObfuscatedName("aa.d")
    public int field897 = -1;

    @ObfuscatedName("aa.e")
    public int field898 = -1;

    @ObfuscatedName("aa.l")
    public short[] field899;

    @ObfuscatedName("aa.u")
    public short[] field900;

    @ObfuscatedName("aa.a")
    public short[] field901;

    @ObfuscatedName("aa.b")
    public short[] field902;

    @ObfuscatedName("aa.s")
    public String[] field903 = new String[5];

    @ObfuscatedName("aa.v")
    public boolean field904 = true;

    @ObfuscatedName("aa.j")
    public int field921 = -1;

    @ObfuscatedName("aa.z")
    public int field906 = 128;

    @ObfuscatedName("aa.n")
    public int field896 = 128;

    @ObfuscatedName("aa.p")
    public boolean field889 = false;

    @ObfuscatedName("aa.aj")
    public int field909 = 0;

    @ObfuscatedName("aa.aq")
    public int field910 = 0;

    @ObfuscatedName("aa.aw")
    public int field911 = -1;

    @ObfuscatedName("aa.az")
    public int field912 = 32;

    @ObfuscatedName("aa.at")
    public int[] field884;

    @ObfuscatedName("aa.af")
    public int field913 = -1;

    @ObfuscatedName("aa.ax")
    public int field915 = -1;

    @ObfuscatedName("aa.ac")
    public boolean field916 = true;

    @ObfuscatedName("aa.am")
    public boolean field917 = true;

    @ObfuscatedName("aa.ao")
    public boolean field907 = false;

    @ObfuscatedName("aa.ad")
    public int field918 = 30;

    @ObfuscatedName("bl.c(Lfj;Lfj;B)V")
    public static void method1481(class167 arg0, class167 arg1) {
        Statics.field908 = arg0;
        Statics.field892 = arg1;
    }

    @ObfuscatedName("aa.k(I)V")
    public void method743() {
    }

    @ObfuscatedName("aa.t(Ldf;I)V")
    public void method724(class119 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method725(arg0, var2);
        }
    }

    @ObfuscatedName("aa.g(Ldf;IB)V")
    public void method725(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2291();
            this.field895 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field895[var4] = arg0.method2293();
            }
        } else if (arg1 == 2) {
            this.field888 = arg0.method2299();
        } else if (arg1 == 12) {
            this.field890 = arg0.method2291();
        } else if (arg1 == 13) {
            this.field914 = arg0.method2293();
        } else if (arg1 == 14) {
            this.field887 = arg0.method2293();
        } else if (arg1 == 15) {
            this.field893 = arg0.method2293();
        } else if (arg1 == 16) {
            this.field894 = arg0.method2293();
        } else if (arg1 == 17) {
            this.field887 = arg0.method2293();
            this.field905 = arg0.method2293();
            this.field897 = arg0.method2293();
            this.field898 = arg0.method2293();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field903[arg1 - 30] = arg0.method2299();
            if (this.field903[arg1 - 30].equalsIgnoreCase(class157.field2348)) {
                this.field903[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2291();
            this.field899 = new short[var5];
            this.field900 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field899[var6] = (short) arg0.method2293();
                this.field900[var6] = (short) arg0.method2293();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2291();
            this.field901 = new short[var7];
            this.field902 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field901[var8] = (short) arg0.method2293();
                this.field902[var8] = (short) arg0.method2293();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2291();
            this.field891 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field891[var10] = arg0.method2293();
            }
        } else if (arg1 == 93) {
            this.field904 = false;
        } else if (arg1 == 95) {
            this.field921 = arg0.method2293();
        } else if (arg1 == 97) {
            this.field906 = arg0.method2293();
        } else if (arg1 == 98) {
            this.field896 = arg0.method2293();
        } else if (arg1 == 99) {
            this.field889 = true;
        } else if (arg1 == 100) {
            this.field909 = arg0.method2292();
        } else if (arg1 == 101) {
            this.field910 = arg0.method2292();
        } else if (arg1 == 102) {
            this.field911 = arg0.method2293();
        } else if (arg1 == 103) {
            this.field912 = arg0.method2293();
        } else if (arg1 == 106) {
            this.field913 = arg0.method2293();
            if (this.field913 == 65535) {
                this.field913 = -1;
            }
            this.field915 = arg0.method2293();
            if (this.field915 == 65535) {
                this.field915 = -1;
            }
            int var11 = arg0.method2291();
            this.field884 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field884[var12] = arg0.method2293();
                if (this.field884[var12] == 65535) {
                    this.field884[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field916 = false;
        } else if (arg1 == 109) {
            this.field917 = false;
        } else if (arg1 == 111) {
            this.field907 = true;
        } else if (arg1 == 112) {
            this.field918 = arg0.method2291();
        }
    }

    @ObfuscatedName("aa.o(Lar;ILar;IB)Ldt;")
    public final class105 method742(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field884 != null) {
            class40 var5 = this.method750();
            return var5 == null ? null : var5.method742(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field886.method3485((long) this.field919);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field895.length; var8++) {
                if (!Statics.field892.method2996(this.field895[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field895.length];
            for (int var10 = 0; var10 < this.field895.length; var10++) {
                var9[var10] = class100.method2063(Statics.field892, this.field895[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field899 != null) {
                for (int var12 = 0; var12 < this.field899.length; var12++) {
                    var11.method2019(this.field899[var12], this.field900[var12]);
                }
            }
            if (this.field901 != null) {
                for (int var13 = 0; var13 < this.field901.length; var13++) {
                    var11.method2020(this.field901[var13], this.field902[var13]);
                }
            }
            var6 = var11.method2027(this.field909 + 64, this.field910 * 5 + 850, -30, -50, -30);
            field886.method3487(var6, (long) this.field919);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method822(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method845(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2113(true);
        } else {
            var14 = arg2.method845(var6, arg3);
        }
        if (this.field906 != 128 || this.field896 != 128) {
            var14.method2128(this.field906, this.field896, this.field906);
        }
        return var14;
    }

    @ObfuscatedName("aa.i(I)Lch;")
    public final class100 method727() {
        if (this.field884 != null) {
            class40 var1 = this.method750();
            return var1 == null ? null : var1.method727();
        } else if (this.field891 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field891.length; var3++) {
                if (!Statics.field892.method2996(this.field891[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field891.length];
            for (int var5 = 0; var5 < this.field891.length; var5++) {
                var4[var5] = class100.method2063(Statics.field892, this.field891[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field899 != null) {
                for (int var7 = 0; var7 < this.field899.length; var7++) {
                    var6.method2019(this.field899[var7], this.field900[var7]);
                }
            }
            if (this.field901 != null) {
                for (int var8 = 0; var8 < this.field901.length; var8++) {
                    var6.method2020(this.field901[var8], this.field902[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aa.w(I)Laa;")
    public final class40 method750() {
        int var1 = -1;
        if (this.field913 != -1) {
            var1 = class176.method43(this.field913);
        } else if (this.field915 != -1) {
            var1 = class176.field2887[this.field915];
        }
        return var1 < 0 || var1 >= this.field884.length || this.field884[var1] == -1 ? null : Statics.method618(this.field884[var1]);
    }

    @ObfuscatedName("aa.m(I)Z")
    public boolean method729() {
        if (this.field884 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field913 != -1) {
            var1 = class176.method43(this.field913);
        } else if (this.field915 != -1) {
            var1 = class176.field2887[this.field915];
        }
        return var1 >= 0 && var1 < this.field884.length && this.field884[var1] != -1;
    }
}
