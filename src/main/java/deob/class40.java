package deob;

@ObfuscatedName("ar")
public class class40 extends class204 {

    @ObfuscatedName("ar.f")
    public static class193 field884 = new class193(64);

    @ObfuscatedName("ar.s")
    public static class193 field885 = new class193(50);

    @ObfuscatedName("ar.y")
    public int field912;

    @ObfuscatedName("ar.e")
    public String field887 = "null";

    @ObfuscatedName("ar.g")
    public int field882 = 1;

    @ObfuscatedName("ar.m")
    public int[] field889;

    @ObfuscatedName("ar.j")
    public int[] field883;

    @ObfuscatedName("ar.n")
    public int field891 = -1;

    @ObfuscatedName("ar.l")
    public int field892 = -1;

    @ObfuscatedName("ar.h")
    public int field893 = -1;

    @ObfuscatedName("ar.i")
    public int field894 = -1;

    @ObfuscatedName("ar.v")
    public int field895 = -1;

    @ObfuscatedName("ar.z")
    public int field905 = -1;

    @ObfuscatedName("ar.u")
    public int field915 = -1;

    @ObfuscatedName("ar.t")
    public short[] field898;

    @ObfuscatedName("ar.b")
    public short[] field899;

    @ObfuscatedName("ar.c")
    public short[] field900;

    @ObfuscatedName("ar.x")
    public short[] field901;

    @ObfuscatedName("ar.d")
    public String[] field902 = new String[5];

    @ObfuscatedName("ar.p")
    public boolean field903 = true;

    @ObfuscatedName("ar.q")
    public int field919 = -1;

    @ObfuscatedName("ar.w")
    public int field886 = 128;

    @ObfuscatedName("ar.k")
    public int field906 = 128;

    @ObfuscatedName("ar.o")
    public boolean field904 = false;

    @ObfuscatedName("ar.ad")
    public int field908 = 0;

    @ObfuscatedName("ar.at")
    public int field920 = 0;

    @ObfuscatedName("ar.aw")
    public int field917 = -1;

    @ObfuscatedName("ar.ax")
    public int field911 = 32;

    @ObfuscatedName("ar.ak")
    public int[] field910;

    @ObfuscatedName("ar.ah")
    public int field913 = -1;

    @ObfuscatedName("ar.ac")
    public int field914 = -1;

    @ObfuscatedName("ar.as")
    public boolean field890 = true;

    @ObfuscatedName("ar.ao")
    public boolean field916 = true;

    @ObfuscatedName("ar.am")
    public boolean field921 = false;

    @ObfuscatedName("ar.ai")
    public int field896 = 30;

    @ObfuscatedName("m.a(Lfz;Lfz;I)V")
    public static void method113(class167 arg0, class167 arg1) {
        Statics.field909 = arg0;
        Statics.field907 = arg1;
    }

    @ObfuscatedName("w.r(II)Lar;")
    public static class40 method586(int arg0) {
        class40 var1 = (class40) field884.method3507((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field909.method3025(9, arg0);
        class40 var3 = new class40();
        var3.field912 = arg0;
        if (var2 != null) {
            var3.method771(new class119(var2));
        }
        var3.method764();
        field884.method3509(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.f(B)V")
    public void method764() {
    }

    @ObfuscatedName("ar.s(Lds;I)V")
    public void method771(class119 arg0) {
        while (true) {
            int var2 = arg0.method2412();
            if (var2 == 0) {
                return;
            }
            this.method746(arg0, var2);
        }
    }

    @ObfuscatedName("ar.y(Lds;II)V")
    public void method746(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2412();
            this.field889 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field889[var4] = arg0.method2347();
            }
        } else if (arg1 == 2) {
            this.field887 = arg0.method2353();
        } else if (arg1 == 12) {
            this.field882 = arg0.method2412();
        } else if (arg1 == 13) {
            this.field891 = arg0.method2347();
        } else if (arg1 == 14) {
            this.field894 = arg0.method2347();
        } else if (arg1 == 15) {
            this.field892 = arg0.method2347();
        } else if (arg1 == 16) {
            this.field893 = arg0.method2347();
        } else if (arg1 == 17) {
            this.field894 = arg0.method2347();
            this.field895 = arg0.method2347();
            this.field905 = arg0.method2347();
            this.field915 = arg0.method2347();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field902[arg1 - 30] = arg0.method2353();
            if (this.field902[arg1 - 30].equalsIgnoreCase(class157.field2296)) {
                this.field902[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2412();
            this.field898 = new short[var5];
            this.field899 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field898[var6] = (short) arg0.method2347();
                this.field899[var6] = (short) arg0.method2347();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2412();
            this.field900 = new short[var7];
            this.field901 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field900[var8] = (short) arg0.method2347();
                this.field901[var8] = (short) arg0.method2347();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2412();
            this.field883 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field883[var10] = arg0.method2347();
            }
        } else if (arg1 == 93) {
            this.field903 = false;
        } else if (arg1 == 95) {
            this.field919 = arg0.method2347();
        } else if (arg1 == 97) {
            this.field886 = arg0.method2347();
        } else if (arg1 == 98) {
            this.field906 = arg0.method2347();
        } else if (arg1 == 99) {
            this.field904 = true;
        } else if (arg1 == 100) {
            this.field908 = arg0.method2540();
        } else if (arg1 == 101) {
            this.field920 = arg0.method2540();
        } else if (arg1 == 102) {
            this.field917 = arg0.method2347();
        } else if (arg1 == 103) {
            this.field911 = arg0.method2347();
        } else if (arg1 == 106) {
            this.field913 = arg0.method2347();
            if (this.field913 == 65535) {
                this.field913 = -1;
            }
            this.field914 = arg0.method2347();
            if (this.field914 == 65535) {
                this.field914 = -1;
            }
            int var11 = arg0.method2412();
            this.field910 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field910[var12] = arg0.method2347();
                if (this.field910[var12] == 65535) {
                    this.field910[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field890 = false;
        } else if (arg1 == 109) {
            this.field916 = false;
        } else if (arg1 == 111) {
            this.field921 = true;
        } else if (arg1 == 112) {
            this.field896 = arg0.method2412();
        }
    }

    @ObfuscatedName("ar.e(Lan;ILan;IB)Ldn;")
    public final class105 method747(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field910 != null) {
            class40 var5 = this.method749();
            return var5 == null ? null : var5.method747(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field885.method3507((long) this.field912);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field889.length; var8++) {
                if (!Statics.field907.method3027(this.field889[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field889.length];
            for (int var10 = 0; var10 < this.field889.length; var10++) {
                var9[var10] = class100.method2066(Statics.field907, this.field889[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field898 != null) {
                for (int var12 = 0; var12 < this.field898.length; var12++) {
                    var11.method2101(this.field898[var12], this.field899[var12]);
                }
            }
            if (this.field900 != null) {
                for (int var13 = 0; var13 < this.field900.length; var13++) {
                    var11.method2121(this.field900[var13], this.field901[var13]);
                }
            }
            var6 = var11.method2086(this.field908 + 64, this.field920 * 5 + 850, -30, -50, -30);
            field885.method3509(var6, (long) this.field912);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method878(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method848(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2194(true);
        } else {
            var14 = arg2.method848(var6, arg3);
        }
        if (this.field886 != 128 || this.field906 != 128) {
            var14.method2167(this.field886, this.field906, this.field886);
        }
        return var14;
    }

    @ObfuscatedName("ar.g(I)Lch;")
    public final class100 method745() {
        if (this.field910 != null) {
            class40 var1 = this.method749();
            return var1 == null ? null : var1.method745();
        } else if (this.field883 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field883.length; var3++) {
                if (!Statics.field907.method3027(this.field883[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field883.length];
            for (int var5 = 0; var5 < this.field883.length; var5++) {
                var4[var5] = class100.method2066(Statics.field907, this.field883[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field898 != null) {
                for (int var7 = 0; var7 < this.field898.length; var7++) {
                    var6.method2101(this.field898[var7], this.field899[var7]);
                }
            }
            if (this.field900 != null) {
                for (int var8 = 0; var8 < this.field900.length; var8++) {
                    var6.method2121(this.field900[var8], this.field901[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ar.m(I)Lar;")
    public final class40 method749() {
        int var1 = -1;
        if (this.field913 != -1) {
            var1 = class176.method2646(this.field913);
        } else if (this.field914 != -1) {
            var1 = class176.field2891[this.field914];
        }
        return var1 < 0 || var1 >= this.field910.length || this.field910[var1] == -1 ? null : method586(this.field910[var1]);
    }

    @ObfuscatedName("ar.j(I)Z")
    public boolean method750() {
        if (this.field910 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field913 != -1) {
            var1 = class176.method2646(this.field913);
        } else if (this.field914 != -1) {
            var1 = class176.field2891[this.field914];
        }
        return var1 >= 0 && var1 < this.field910.length && this.field910[var1] != -1;
    }
}
