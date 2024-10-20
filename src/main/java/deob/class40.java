package deob;

@ObfuscatedName("ao")
public class class40 extends class204 {

    @ObfuscatedName("ao.a")
    public static class193 field880 = new class193(64);

    @ObfuscatedName("ao.i")
    public static class193 field883 = new class193(50);

    @ObfuscatedName("ao.f")
    public int field897;

    @ObfuscatedName("ao.m")
    public String field885 = "null";

    @ObfuscatedName("ao.o")
    public int field886 = 1;

    @ObfuscatedName("ao.h")
    public int[] field887;

    @ObfuscatedName("ao.n")
    public int[] field895;

    @ObfuscatedName("ao.k")
    public int field889 = -1;

    @ObfuscatedName("ao.r")
    public int field890 = -1;

    @ObfuscatedName("ao.b")
    public int field891 = -1;

    @ObfuscatedName("ao.q")
    public int field907 = -1;

    @ObfuscatedName("ao.u")
    public int field888 = -1;

    @ObfuscatedName("ao.g")
    public int field894 = -1;

    @ObfuscatedName("ao.y")
    public int field908 = -1;

    @ObfuscatedName("ao.s")
    public short[] field913;

    @ObfuscatedName("ao.d")
    public short[] field893;

    @ObfuscatedName("ao.z")
    public short[] field898;

    @ObfuscatedName("ao.p")
    public short[] field899;

    @ObfuscatedName("ao.w")
    public String[] field900 = new String[5];

    @ObfuscatedName("ao.t")
    public boolean field901 = true;

    @ObfuscatedName("ao.c")
    public int field902 = -1;

    @ObfuscatedName("ao.x")
    public int field903 = 128;

    @ObfuscatedName("ao.e")
    public int field882 = 128;

    @ObfuscatedName("ao.v")
    public boolean field905 = false;

    @ObfuscatedName("ao.ab")
    public int field896 = 0;

    @ObfuscatedName("ao.ak")
    public int field906 = 0;

    @ObfuscatedName("ao.am")
    public int field904 = -1;

    @ObfuscatedName("ao.aw")
    public int field909 = 32;

    @ObfuscatedName("ao.az")
    public int[] field910;

    @ObfuscatedName("ao.ac")
    public int field911 = -1;

    @ObfuscatedName("ao.ax")
    public int field912 = -1;

    @ObfuscatedName("ao.ai")
    public boolean field884 = true;

    @ObfuscatedName("ao.ar")
    public boolean field892 = true;

    @ObfuscatedName("ao.aa")
    public boolean field915 = false;

    @ObfuscatedName("ao.as")
    public int field916 = 30;

    @ObfuscatedName("g.j(Lff;Lff;I)V")
    public static void method160(class167 arg0, class167 arg1) {
        Statics.field914 = arg0;
        Statics.field881 = arg1;
    }

    @ObfuscatedName("g.l(II)Lao;")
    public static class40 method159(int arg0) {
        class40 var1 = (class40) field880.method3466((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field914.method3005(9, arg0);
        class40 var3 = new class40();
        var3.field897 = arg0;
        if (var2 != null) {
            var3.method759(new class119(var2));
        }
        var3.method751();
        field880.method3468(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.a(I)V")
    public void method751() {
    }

    @ObfuscatedName("ao.i(Ldc;I)V")
    public void method759(class119 arg0) {
        while (true) {
            int var2 = arg0.method2316();
            if (var2 == 0) {
                return;
            }
            this.method780(arg0, var2);
        }
    }

    @ObfuscatedName("ao.f(Ldc;II)V")
    public void method780(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2316();
            this.field887 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field887[var4] = arg0.method2318();
            }
        } else if (arg1 == 2) {
            this.field885 = arg0.method2324();
        } else if (arg1 == 12) {
            this.field886 = arg0.method2316();
        } else if (arg1 == 13) {
            this.field889 = arg0.method2318();
        } else if (arg1 == 14) {
            this.field907 = arg0.method2318();
        } else if (arg1 == 15) {
            this.field890 = arg0.method2318();
        } else if (arg1 == 16) {
            this.field891 = arg0.method2318();
        } else if (arg1 == 17) {
            this.field907 = arg0.method2318();
            this.field888 = arg0.method2318();
            this.field894 = arg0.method2318();
            this.field908 = arg0.method2318();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field900[arg1 - 30] = arg0.method2324();
            if (this.field900[arg1 - 30].equalsIgnoreCase(class157.field2318)) {
                this.field900[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2316();
            this.field913 = new short[var5];
            this.field893 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field913[var6] = (short) arg0.method2318();
                this.field893[var6] = (short) arg0.method2318();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2316();
            this.field898 = new short[var7];
            this.field899 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field898[var8] = (short) arg0.method2318();
                this.field899[var8] = (short) arg0.method2318();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2316();
            this.field895 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field895[var10] = arg0.method2318();
            }
        } else if (arg1 == 93) {
            this.field901 = false;
        } else if (arg1 == 95) {
            this.field902 = arg0.method2318();
        } else if (arg1 == 97) {
            this.field903 = arg0.method2318();
        } else if (arg1 == 98) {
            this.field882 = arg0.method2318();
        } else if (arg1 == 99) {
            this.field905 = true;
        } else if (arg1 == 100) {
            this.field896 = arg0.method2317();
        } else if (arg1 == 101) {
            this.field906 = arg0.method2317() * 5;
        } else if (arg1 == 102) {
            this.field904 = arg0.method2318();
        } else if (arg1 == 103) {
            this.field909 = arg0.method2318();
        } else if (arg1 == 106) {
            this.field911 = arg0.method2318();
            if (this.field911 == 65535) {
                this.field911 = -1;
            }
            this.field912 = arg0.method2318();
            if (this.field912 == 65535) {
                this.field912 = -1;
            }
            int var11 = arg0.method2316();
            this.field910 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field910[var12] = arg0.method2318();
                if (this.field910[var12] == 65535) {
                    this.field910[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field884 = false;
        } else if (arg1 == 109) {
            this.field892 = false;
        } else if (arg1 == 111) {
            this.field915 = true;
        } else if (arg1 == 112) {
            this.field916 = arg0.method2316();
        }
    }

    @ObfuscatedName("ao.m(Lal;ILal;IB)Ldd;")
    public final class105 method754(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field910 != null) {
            class40 var5 = this.method774();
            return var5 == null ? null : var5.method754(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field883.method3466((long) this.field897);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field887.length; var8++) {
                if (!Statics.field881.method3007(this.field887[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field887.length];
            for (int var10 = 0; var10 < this.field887.length; var10++) {
                var9[var10] = class100.method2109(Statics.field881, this.field887[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field913 != null) {
                for (int var12 = 0; var12 < this.field913.length; var12++) {
                    var11.method2061(this.field913[var12], this.field893[var12]);
                }
            }
            if (this.field898 != null) {
                for (int var13 = 0; var13 < this.field898.length; var13++) {
                    var11.method2055(this.field898[var13], this.field899[var13]);
                }
            }
            var6 = var11.method2041(this.field896 + 64, this.field906 + 850, -30, -50, -30);
            field883.method3468(var6, (long) this.field897);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method855(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method851(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2183(true);
        } else {
            var14 = arg2.method851(var6, arg3);
        }
        if (this.field903 != 128 || this.field882 != 128) {
            var14.method2180(this.field903, this.field882, this.field903);
        }
        return var14;
    }

    @ObfuscatedName("ao.o(I)Lcb;")
    public final class100 method755() {
        if (this.field910 != null) {
            class40 var1 = this.method774();
            return var1 == null ? null : var1.method755();
        } else if (this.field895 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field895.length; var3++) {
                if (!Statics.field881.method3007(this.field895[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field895.length];
            for (int var5 = 0; var5 < this.field895.length; var5++) {
                var4[var5] = class100.method2109(Statics.field881, this.field895[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field913 != null) {
                for (int var7 = 0; var7 < this.field913.length; var7++) {
                    var6.method2061(this.field913[var7], this.field893[var7]);
                }
            }
            if (this.field898 != null) {
                for (int var8 = 0; var8 < this.field898.length; var8++) {
                    var6.method2055(this.field898[var8], this.field899[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ao.h(B)Lao;")
    public final class40 method774() {
        int var1 = -1;
        if (this.field911 != -1) {
            var1 = class176.method2248(this.field911);
        } else if (this.field912 != -1) {
            var1 = class176.field2907[this.field912];
        }
        return var1 < 0 || var1 >= this.field910.length || this.field910[var1] == -1 ? null : method159(this.field910[var1]);
    }

    @ObfuscatedName("ao.n(I)Z")
    public boolean method757() {
        if (this.field910 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field911 != -1) {
            var1 = class176.method2248(this.field911);
        } else if (this.field912 != -1) {
            var1 = class176.field2907[this.field912];
        }
        return var1 >= 0 && var1 < this.field910.length && this.field910[var1] != -1;
    }

    @ObfuscatedName("f.k(B)V")
    public static void method38() {
        field880.method3475();
        field883.method3475();
    }
}
