package deob;

@ObfuscatedName("ar")
public class class38 extends class195 {

    @ObfuscatedName("ar.n")
    public static boolean field925 = false;

    @ObfuscatedName("ar.m")
    public static class184 field891 = new class184(64);

    @ObfuscatedName("ar.s")
    public static class184 field892 = new class184(500);

    @ObfuscatedName("ar.j")
    public static class184 field900 = new class184(30);

    @ObfuscatedName("ar.f")
    public static class184 field894 = new class184(30);

    @ObfuscatedName("ar.b")
    public static class95[] field895 = new class95[4];

    @ObfuscatedName("ar.t")
    public int field896;

    @ObfuscatedName("ar.i")
    public int[] field897;

    @ObfuscatedName("ar.c")
    public int[] field926;

    @ObfuscatedName("ar.k")
    public String field899 = "null";

    @ObfuscatedName("ar.x")
    public short[] field906;

    @ObfuscatedName("ar.e")
    public short[] field901;

    @ObfuscatedName("ar.q")
    public short[] field902;

    @ObfuscatedName("ar.o")
    public short[] field916;

    @ObfuscatedName("ar.r")
    public int field904 = 1;

    @ObfuscatedName("ar.v")
    public int field905 = 1;

    @ObfuscatedName("ar.h")
    public int field934 = 2;

    @ObfuscatedName("ar.p")
    public boolean field936 = true;

    @ObfuscatedName("ar.y")
    public int field903 = -1;

    @ObfuscatedName("ar.z")
    public int field909 = -1;

    @ObfuscatedName("ar.u")
    public boolean field910 = false;

    @ObfuscatedName("ar.w")
    public boolean field913 = false;

    @ObfuscatedName("ar.d")
    public int field908 = -1;

    @ObfuscatedName("ar.l")
    public int field912 = 16;

    @ObfuscatedName("ar.aj")
    public int field914 = 0;

    @ObfuscatedName("ar.aq")
    public int field920 = 0;

    @ObfuscatedName("ar.al")
    public String[] field898 = new String[5];

    @ObfuscatedName("ar.az")
    public int field918 = -1;

    @ObfuscatedName("ar.ah")
    public int field911 = -1;

    @ObfuscatedName("ar.ag")
    public boolean field919 = false;

    @ObfuscatedName("ar.ad")
    public boolean field927 = true;

    @ObfuscatedName("ar.ao")
    public int field921 = 128;

    @ObfuscatedName("ar.am")
    public int field917 = 128;

    @ObfuscatedName("ar.ax")
    public int field923 = 128;

    @ObfuscatedName("ar.at")
    public int field924 = 0;

    @ObfuscatedName("ar.ar")
    public int field915 = 0;

    @ObfuscatedName("ar.ai")
    public int field893 = 0;

    @ObfuscatedName("ar.aw")
    public boolean field922 = false;

    @ObfuscatedName("ar.ak")
    public boolean field928 = false;

    @ObfuscatedName("ar.an")
    public int field929 = -1;

    @ObfuscatedName("ar.av")
    public int[] field930;

    @ObfuscatedName("ar.af")
    public int field931 = -1;

    @ObfuscatedName("ar.ae")
    public int field932 = -1;

    @ObfuscatedName("ar.au")
    public int field933 = -1;

    @ObfuscatedName("ar.aa")
    public int field888 = 0;

    @ObfuscatedName("ar.ay")
    public int field935 = 0;

    @ObfuscatedName("ar.ac")
    public int field907 = 0;

    @ObfuscatedName("ar.ab")
    public int[] field937;

    @ObfuscatedName("p.n(Lfi;Lfi;ZI)V")
    public static void method499(class158 arg0, class158 arg1, boolean arg2) {
        Statics.field889 = arg0;
        Statics.field890 = arg1;
        field925 = arg2;
    }

    @ObfuscatedName("au.g(II)Lar;")
    public static class38 method879(int arg0) {
        class38 var1 = (class38) field891.method3388((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field889.method2929(6, arg0);
        class38 var3 = new class38();
        var3.field896 = arg0;
        if (var2 != null) {
            var3.method684(new class111(var2));
        }
        var3.method688();
        if (var3.field928) {
            var3.field934 = 0;
            var3.field936 = false;
        }
        field891.method3396(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.a(I)V")
    public void method688() {
        if (this.field903 == -1) {
            this.field903 = 0;
            if (this.field897 != null && (this.field926 == null || this.field926[0] == 10)) {
                this.field903 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field898[var1] != null) {
                    this.field903 = 1;
                }
            }
        }
        if (this.field929 == -1) {
            this.field929 = this.field934 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ar.m(Ldp;I)V")
    public void method684(class111 arg0) {
        while (true) {
            int var2 = arg0.method2211();
            if (var2 == 0) {
                return;
            }
            this.method685(arg0, var2);
        }
    }

    @ObfuscatedName("ar.s(Ldp;II)V")
    public void method685(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2211();
            if (var3 > 0) {
                if (this.field897 == null || field925) {
                    this.field926 = new int[var3];
                    this.field897 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field897[var4] = arg0.method2395();
                        this.field926[var4] = arg0.method2211();
                    }
                } else {
                    arg0.field1896 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field899 = arg0.method2223();
        } else if (arg1 == 5) {
            int var5 = arg0.method2211();
            if (var5 > 0) {
                if (this.field897 == null || field925) {
                    this.field926 = null;
                    this.field897 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field897[var6] = arg0.method2395();
                    }
                } else {
                    arg0.field1896 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field904 = arg0.method2211();
        } else if (arg1 == 15) {
            this.field905 = arg0.method2211();
        } else if (arg1 == 17) {
            this.field934 = 0;
            this.field936 = false;
        } else if (arg1 == 18) {
            this.field936 = false;
        } else if (arg1 == 19) {
            this.field903 = arg0.method2211();
        } else if (arg1 == 21) {
            this.field909 = 0;
        } else if (arg1 == 22) {
            this.field910 = true;
        } else if (arg1 == 23) {
            this.field913 = true;
        } else if (arg1 == 24) {
            this.field908 = arg0.method2395();
            if (this.field908 == 65535) {
                this.field908 = -1;
            }
        } else if (arg1 == 27) {
            this.field934 = 1;
        } else if (arg1 == 28) {
            this.field912 = arg0.method2211();
        } else if (arg1 == 29) {
            this.field914 = arg0.method2217();
        } else if (arg1 == 39) {
            this.field920 = arg0.method2217() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field898[arg1 - 30] = arg0.method2223();
            if (this.field898[arg1 - 30].equalsIgnoreCase(class148.field2204)) {
                this.field898[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2211();
            this.field906 = new short[var7];
            this.field901 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field906[var8] = (short) arg0.method2395();
                this.field901[var8] = (short) arg0.method2395();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2211();
            this.field902 = new short[var9];
            this.field916 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field902[var10] = (short) arg0.method2395();
                this.field916[var10] = (short) arg0.method2395();
            }
        } else if (arg1 == 60) {
            this.field918 = arg0.method2395();
        } else if (arg1 == 62) {
            this.field919 = true;
        } else if (arg1 == 64) {
            this.field927 = false;
        } else if (arg1 == 65) {
            this.field921 = arg0.method2395();
        } else if (arg1 == 66) {
            this.field917 = arg0.method2395();
        } else if (arg1 == 67) {
            this.field923 = arg0.method2395();
        } else if (arg1 == 68) {
            this.field911 = arg0.method2395();
        } else if (arg1 == 69) {
            arg0.method2211();
        } else if (arg1 == 70) {
            this.field924 = arg0.method2389();
        } else if (arg1 == 71) {
            this.field915 = arg0.method2389();
        } else if (arg1 == 72) {
            this.field893 = arg0.method2389();
        } else if (arg1 == 73) {
            this.field922 = true;
        } else if (arg1 == 74) {
            this.field928 = true;
        } else if (arg1 == 75) {
            this.field929 = arg0.method2211();
        } else if (arg1 == 77) {
            this.field931 = arg0.method2395();
            if (this.field931 == 65535) {
                this.field931 = -1;
            }
            this.field932 = arg0.method2395();
            if (this.field932 == 65535) {
                this.field932 = -1;
            }
            int var11 = arg0.method2211();
            this.field930 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field930[var12] = arg0.method2395();
                if (this.field930[var12] == 65535) {
                    this.field930[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field933 = arg0.method2395();
            this.field888 = arg0.method2211();
        } else if (arg1 == 79) {
            this.field935 = arg0.method2395();
            this.field907 = arg0.method2395();
            this.field888 = arg0.method2211();
            int var13 = arg0.method2211();
            this.field937 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field937[var14] = arg0.method2395();
            }
        } else if (arg1 == 81) {
            this.field909 = arg0.method2211() * 256;
        }
    }

    @ObfuscatedName("ar.j(IB)Z")
    public final boolean method686(int arg0) {
        if (this.field926 != null) {
            for (int var4 = 0; var4 < this.field926.length; var4++) {
                if (this.field926[var4] == arg0) {
                    return Statics.field890.method2987(this.field897[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field897 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field897.length; var3++) {
                var2 &= Statics.field890.method2987(this.field897[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ar.f(I)Z")
    public final boolean method687() {
        if (this.field897 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field897.length; var2++) {
            var1 &= Statics.field890.method2987(this.field897[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ar.b(II[[IIIII)Lcj;")
    public final class80 method700(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field926 == null) {
            var7 = (long) ((this.field896 << 10) + arg1);
        } else {
            var7 = (long) ((this.field896 << 10) + (arg0 << 3) + arg1);
        }
        class80 var9 = (class80) field900.method3388(var7);
        if (var9 == null) {
            class95 var10 = this.method691(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field910) {
                var10.field1668 = (short) (this.field914 + 64);
                var10.field1669 = (short) (this.field920 + 768);
                var10.method1978();
                var9 = var10;
            } else {
                var9 = var10.method1982(this.field914 + 64, this.field920 + 768, -50, -10, -50);
            }
            field900.method3396(var9, var7);
        }
        if (this.field910) {
            var9 = ((class95) var9).method1967();
        }
        if (this.field909 >= 0) {
            if (var9 instanceof class100) {
                var9 = ((class100) var9).method2081(arg2, arg3, arg4, arg5, true, this.field909);
            } else if (var9 instanceof class95) {
                var9 = ((class95) var9).method2015(arg2, arg3, arg4, arg5, true, this.field909);
            }
        }
        return var9;
    }

    @ObfuscatedName("ar.t(II[[IIIIB)Lcs;")
    public final class100 method689(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field926 == null) {
            var7 = (long) ((this.field896 << 10) + arg1);
        } else {
            var7 = (long) ((this.field896 << 10) + (arg0 << 3) + arg1);
        }
        class100 var9 = (class100) field894.method3388(var7);
        if (var9 == null) {
            class95 var10 = this.method691(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1982(this.field914 + 64, this.field920 + 768, -50, -10, -50);
            field894.method3396(var9, var7);
        }
        if (this.field909 >= 0) {
            var9 = var9.method2081(arg2, arg3, arg4, arg5, true, this.field909);
        }
        return var9;
    }

    @ObfuscatedName("ar.i(II[[IIIILaw;II)Lcs;")
    public final class100 method694(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class40 arg6, int arg7) {
        long var9;
        if (this.field926 == null) {
            var9 = (long) ((this.field896 << 10) + arg1);
        } else {
            var9 = (long) ((this.field896 << 10) + (arg0 << 3) + arg1);
        }
        class100 var11 = (class100) field894.method3388(var9);
        if (var11 == null) {
            class95 var12 = this.method691(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1982(this.field914 + 64, this.field920 + 768, -50, -10, -50);
            field894.method3396(var11, var9);
        }
        if (arg6 == null && this.field909 == -1) {
            return var11;
        }
        class100 var13;
        if (arg6 == null) {
            var13 = var11.method2058(true);
        } else {
            var13 = arg6.method747(var11, arg7, arg1);
        }
        if (this.field909 >= 0) {
            var13 = var13.method2081(arg2, arg3, arg4, arg5, false, this.field909);
        }
        return var13;
    }

    @ObfuscatedName("ar.c(III)Lci;")
    public final class95 method691(int arg0, int arg1) {
        class95 var3 = null;
        if (this.field926 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field897 == null) {
                return null;
            }
            boolean var4 = this.field919;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field897.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field897[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class95) field892.method3388((long) var7);
                if (var3 == null) {
                    var3 = class95.method2011(Statics.field890, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1961();
                    }
                    field892.method3396(var3, (long) var7);
                }
                if (var5 > 1) {
                    field895[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class95(field895, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field926.length; var9++) {
                if (this.field926[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field897[var8];
            boolean var11 = this.field919 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class95) field892.method3388((long) var10);
            if (var3 == null) {
                var3 = class95.method2011(Statics.field890, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1961();
                }
                field892.method3396(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field921 == 128 && this.field917 == 128 && this.field923 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field924 == 0 && this.field915 == 0 && this.field893 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class95 var14 = new class95(var3, arg1 == 0 && !var12 && !var13, this.field906 == null, this.field902 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1973(256);
            var14.method1974(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1970();
        } else if (var15 == 2) {
            var14.method1971();
        } else if (var15 == 3) {
            var14.method2021();
        }
        if (this.field906 != null) {
            for (int var16 = 0; var16 < this.field906.length; var16++) {
                var14.method1991(this.field906[var16], this.field901[var16]);
            }
        }
        if (this.field902 != null) {
            for (int var17 = 0; var17 < this.field902.length; var17++) {
                var14.method2030(this.field902[var17], this.field916[var17]);
            }
        }
        if (var12) {
            var14.method2020(this.field921, this.field917, this.field923);
        }
        if (var13) {
            var14.method1974(this.field924, this.field915, this.field893);
        }
        return var14;
    }

    @ObfuscatedName("ar.k(I)Lar;")
    public final class38 method692() {
        int var1 = -1;
        if (this.field931 != -1) {
            var1 = Statics.method110(this.field931);
        } else if (this.field932 != -1) {
            var1 = class167.field2796[this.field932];
        }
        return var1 < 0 || var1 >= this.field930.length || this.field930[var1] == -1 ? null : method879(this.field930[var1]);
    }

    @ObfuscatedName("ad.x(I)V")
    public static void method619() {
        field891.method3398();
        field892.method3398();
        field900.method3398();
        field894.method3398();
    }

    @ObfuscatedName("ar.e(B)Z")
    public boolean method693() {
        if (this.field930 == null) {
            return this.field933 != -1 || this.field937 != null;
        }
        for (int var1 = 0; var1 < this.field930.length; var1++) {
            if (this.field930[var1] != -1) {
                class38 var2 = method879(this.field930[var1]);
                if (var2.field933 != -1 || var2.field937 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
