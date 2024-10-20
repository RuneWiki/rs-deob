package deob;

@ObfuscatedName("ar")
public class class38 extends class195 {

    @ObfuscatedName("ar.n")
    public static boolean field897 = false;

    @ObfuscatedName("ar.w")
    public static class184 field890 = new class184(64);

    @ObfuscatedName("ar.m")
    public static class184 field891 = new class184(500);

    @ObfuscatedName("ar.h")
    public static class184 field892 = new class184(30);

    @ObfuscatedName("ar.i")
    public static class184 field893 = new class184(30);

    @ObfuscatedName("ar.r")
    public static class95[] field908 = new class95[4];

    @ObfuscatedName("ar.l")
    public int field895;

    @ObfuscatedName("ar.f")
    public int[] field930;

    @ObfuscatedName("ar.e")
    public int[] field903;

    @ObfuscatedName("ar.z")
    public String field898 = "null";

    @ObfuscatedName("ar.v")
    public short[] field899;

    @ObfuscatedName("ar.x")
    public short[] field931;

    @ObfuscatedName("ar.q")
    public short[] field901;

    @ObfuscatedName("ar.b")
    public short[] field902;

    @ObfuscatedName("ar.u")
    public int field907 = 1;

    @ObfuscatedName("ar.t")
    public int field904 = 1;

    @ObfuscatedName("ar.s")
    public int field905 = 2;

    @ObfuscatedName("ar.p")
    public boolean field906 = true;

    @ObfuscatedName("ar.d")
    public int field922 = -1;

    @ObfuscatedName("ar.j")
    public int field926 = -1;

    @ObfuscatedName("ar.k")
    public boolean field909 = false;

    @ObfuscatedName("ar.y")
    public boolean field910 = false;

    @ObfuscatedName("ar.c")
    public int field911 = -1;

    @ObfuscatedName("ar.g")
    public int field921 = 16;

    @ObfuscatedName("ar.av")
    public int field913 = 0;

    @ObfuscatedName("ar.ag")
    public int field915 = 0;

    @ObfuscatedName("ar.aq")
    public String[] field935 = new String[5];

    @ObfuscatedName("ar.an")
    public int field916 = -1;

    @ObfuscatedName("ar.ao")
    public int field917 = -1;

    @ObfuscatedName("ar.aj")
    public boolean field918 = false;

    @ObfuscatedName("ar.ax")
    public boolean field914 = true;

    @ObfuscatedName("ar.ac")
    public int field889 = 128;

    @ObfuscatedName("ar.al")
    public int field927 = 128;

    @ObfuscatedName("ar.au")
    public int field923 = 128;

    @ObfuscatedName("ar.ap")
    public int field937 = 0;

    @ObfuscatedName("ar.ar")
    public int field924 = 0;

    @ObfuscatedName("ar.ah")
    public int field925 = 0;

    @ObfuscatedName("ar.ae")
    public boolean field894 = false;

    @ObfuscatedName("ar.ay")
    public boolean field912 = false;

    @ObfuscatedName("ar.ab")
    public int field928 = -1;

    @ObfuscatedName("ar.at")
    public int[] field929;

    @ObfuscatedName("ar.as")
    public int field900 = -1;

    @ObfuscatedName("ar.af")
    public int field896 = -1;

    @ObfuscatedName("ar.aa")
    public int field932 = -1;

    @ObfuscatedName("ar.ad")
    public int field933 = 0;

    @ObfuscatedName("ar.ai")
    public int field934 = 0;

    @ObfuscatedName("ar.aw")
    public int field920 = 0;

    @ObfuscatedName("ar.ak")
    public int[] field936;

    @ObfuscatedName("df.n(IB)Lar;")
    public static class38 method2180(int arg0) {
        class38 var1 = (class38) field890.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2568.method2925(6, arg0);
        class38 var3 = new class38();
        var3.field895 = arg0;
        if (var2 != null) {
            var3.method708(new class111(var2));
        }
        var3.method691();
        if (var3.field912) {
            var3.field905 = 0;
            var3.field906 = false;
        }
        field890.method3372(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.o(B)V")
    public void method691() {
        if (this.field922 == -1) {
            this.field922 = 0;
            if (this.field930 != null && (this.field903 == null || this.field903[0] == 10)) {
                this.field922 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field935[var1] != null) {
                    this.field922 = 1;
                }
            }
        }
        if (this.field928 == -1) {
            this.field928 = this.field905 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ar.a(Ldl;B)V")
    public void method708(class111 arg0) {
        while (true) {
            int var2 = arg0.method2234();
            if (var2 == 0) {
                return;
            }
            this.method690(arg0, var2);
        }
    }

    @ObfuscatedName("ar.w(Ldl;II)V")
    public void method690(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2234();
            if (var3 > 0) {
                if (this.field930 == null || field897) {
                    this.field903 = new int[var3];
                    this.field930 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field930[var4] = arg0.method2236();
                        this.field903[var4] = arg0.method2234();
                    }
                } else {
                    arg0.field1890 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field898 = arg0.method2242();
        } else if (arg1 == 5) {
            int var5 = arg0.method2234();
            if (var5 > 0) {
                if (this.field930 == null || field897) {
                    this.field903 = null;
                    this.field930 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field930[var6] = arg0.method2236();
                    }
                } else {
                    arg0.field1890 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field907 = arg0.method2234();
        } else if (arg1 == 15) {
            this.field904 = arg0.method2234();
        } else if (arg1 == 17) {
            this.field905 = 0;
            this.field906 = false;
        } else if (arg1 == 18) {
            this.field906 = false;
        } else if (arg1 == 19) {
            this.field922 = arg0.method2234();
        } else if (arg1 == 21) {
            this.field926 = 0;
        } else if (arg1 == 22) {
            this.field909 = true;
        } else if (arg1 == 23) {
            this.field910 = true;
        } else if (arg1 == 24) {
            this.field911 = arg0.method2236();
            if (this.field911 == 65535) {
                this.field911 = -1;
            }
        } else if (arg1 == 27) {
            this.field905 = 1;
        } else if (arg1 == 28) {
            this.field921 = arg0.method2234();
        } else if (arg1 == 29) {
            this.field913 = arg0.method2235();
        } else if (arg1 == 39) {
            this.field915 = arg0.method2235() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field935[arg1 - 30] = arg0.method2242();
            if (this.field935[arg1 - 30].equalsIgnoreCase(class148.field2214)) {
                this.field935[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2234();
            this.field899 = new short[var7];
            this.field931 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field899[var8] = (short) arg0.method2236();
                this.field931[var8] = (short) arg0.method2236();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2234();
            this.field901 = new short[var9];
            this.field902 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field901[var10] = (short) arg0.method2236();
                this.field902[var10] = (short) arg0.method2236();
            }
        } else if (arg1 == 60) {
            this.field916 = arg0.method2236();
        } else if (arg1 == 62) {
            this.field918 = true;
        } else if (arg1 == 64) {
            this.field914 = false;
        } else if (arg1 == 65) {
            this.field889 = arg0.method2236();
        } else if (arg1 == 66) {
            this.field927 = arg0.method2236();
        } else if (arg1 == 67) {
            this.field923 = arg0.method2236();
        } else if (arg1 == 68) {
            this.field917 = arg0.method2236();
        } else if (arg1 == 69) {
            arg0.method2234();
        } else if (arg1 == 70) {
            this.field937 = arg0.method2237();
        } else if (arg1 == 71) {
            this.field924 = arg0.method2237();
        } else if (arg1 == 72) {
            this.field925 = arg0.method2237();
        } else if (arg1 == 73) {
            this.field894 = true;
        } else if (arg1 == 74) {
            this.field912 = true;
        } else if (arg1 == 75) {
            this.field928 = arg0.method2234();
        } else if (arg1 == 77) {
            this.field900 = arg0.method2236();
            if (this.field900 == 65535) {
                this.field900 = -1;
            }
            this.field896 = arg0.method2236();
            if (this.field896 == 65535) {
                this.field896 = -1;
            }
            int var11 = arg0.method2234();
            this.field929 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field929[var12] = arg0.method2236();
                if (this.field929[var12] == 65535) {
                    this.field929[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field932 = arg0.method2236();
            this.field933 = arg0.method2234();
        } else if (arg1 == 79) {
            this.field934 = arg0.method2236();
            this.field920 = arg0.method2236();
            this.field933 = arg0.method2234();
            int var13 = arg0.method2234();
            this.field936 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field936[var14] = arg0.method2236();
            }
        } else if (arg1 == 81) {
            this.field926 = arg0.method2234() * 256;
        }
    }

    @ObfuscatedName("ar.m(IB)Z")
    public final boolean method727(int arg0) {
        if (this.field903 != null) {
            for (int var4 = 0; var4 < this.field903.length; var4++) {
                if (this.field903[var4] == arg0) {
                    return Statics.field1873.method2995(this.field930[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field930 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field930.length; var3++) {
                var2 &= Statics.field1873.method2995(this.field930[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ar.h(I)Z")
    public final boolean method693() {
        if (this.field930 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field930.length; var2++) {
            var1 &= Statics.field1873.method2995(this.field930[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ar.i(II[[IIIII)Lcn;")
    public final class80 method707(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field903 == null) {
            var7 = (long) ((this.field895 << 10) + arg1);
        } else {
            var7 = (long) ((this.field895 << 10) + (arg0 << 3) + arg1);
        }
        class80 var9 = (class80) field892.method3373(var7);
        if (var9 == null) {
            class95 var10 = this.method695(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field909) {
                var10.field1652 = (short) (this.field913 + 64);
                var10.field1627 = (short) (this.field915 + 768);
                var10.method1989();
                var9 = var10;
            } else {
                var9 = var10.method2033(this.field913 + 64, this.field915 + 768, -50, -10, -50);
            }
            field892.method3372(var9, var7);
        }
        if (this.field909) {
            var9 = ((class95) var9).method1977();
        }
        if (this.field926 >= 0) {
            if (var9 instanceof class100) {
                var9 = ((class100) var9).method2077(arg2, arg3, arg4, arg5, true, this.field926);
            } else if (var9 instanceof class95) {
                var9 = ((class95) var9).method1978(arg2, arg3, arg4, arg5, true, this.field926);
            }
        }
        return var9;
    }

    @ObfuscatedName("ar.r(II[[IIIIS)Lcp;")
    public final class100 method709(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field903 == null) {
            var7 = (long) ((this.field895 << 10) + arg1);
        } else {
            var7 = (long) ((this.field895 << 10) + (arg0 << 3) + arg1);
        }
        class100 var9 = (class100) field893.method3373(var7);
        if (var9 == null) {
            class95 var10 = this.method695(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2033(this.field913 + 64, this.field915 + 768, -50, -10, -50);
            field893.method3372(var9, var7);
        }
        if (this.field926 >= 0) {
            var9 = var9.method2077(arg2, arg3, arg4, arg5, true, this.field926);
        }
        return var9;
    }

    @ObfuscatedName("ar.l(II[[IIIILae;IB)Lcp;")
    public final class100 method694(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class40 arg6, int arg7) {
        long var9;
        if (this.field903 == null) {
            var9 = (long) ((this.field895 << 10) + arg1);
        } else {
            var9 = (long) ((this.field895 << 10) + (arg0 << 3) + arg1);
        }
        class100 var11 = (class100) field893.method3373(var9);
        if (var11 == null) {
            class95 var12 = this.method695(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2033(this.field913 + 64, this.field915 + 768, -50, -10, -50);
            field893.method3372(var11, var9);
        }
        if (arg6 == null && this.field926 == -1) {
            return var11;
        }
        class100 var13;
        if (arg6 == null) {
            var13 = var11.method2078(true);
        } else {
            var13 = arg6.method762(var11, arg7, arg1);
        }
        if (this.field926 >= 0) {
            var13 = var13.method2077(arg2, arg3, arg4, arg5, false, this.field926);
        }
        return var13;
    }

    @ObfuscatedName("ar.f(IIB)Lcz;")
    public final class95 method695(int arg0, int arg1) {
        class95 var3 = null;
        if (this.field903 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field930 == null) {
                return null;
            }
            boolean var4 = this.field918;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field930.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field930[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class95) field891.method3373((long) var7);
                if (var3 == null) {
                    var3 = class95.method2050(Statics.field1873, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1987();
                    }
                    field891.method3372(var3, (long) var7);
                }
                if (var5 > 1) {
                    field908[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class95(field908, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field903.length; var9++) {
                if (this.field903[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field930[var8];
            boolean var11 = this.field918 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class95) field891.method3373((long) var10);
            if (var3 == null) {
                var3 = class95.method2050(Statics.field1873, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1987();
                }
                field891.method3372(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field889 == 128 && this.field927 == 128 && this.field923 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field937 == 0 && this.field924 == 0 && this.field925 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class95 var14 = new class95(var3, arg1 == 0 && !var12 && !var13, this.field899 == null, this.field901 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1983(256);
            var14.method1984(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2013();
        } else if (var15 == 2) {
            var14.method2007();
        } else if (var15 == 3) {
            var14.method1982();
        }
        if (this.field899 != null) {
            for (int var16 = 0; var16 < this.field899.length; var16++) {
                var14.method1985(this.field899[var16], this.field931[var16]);
            }
        }
        if (this.field901 != null) {
            for (int var17 = 0; var17 < this.field901.length; var17++) {
                var14.method1986(this.field901[var17], this.field902[var17]);
            }
        }
        if (var12) {
            var14.method2012(this.field889, this.field927, this.field923);
        }
        if (var13) {
            var14.method1984(this.field937, this.field924, this.field925);
        }
        return var14;
    }

    @ObfuscatedName("ar.e(I)Lar;")
    public final class38 method696() {
        int var1 = -1;
        if (this.field900 != -1) {
            var1 = class167.method792(this.field900);
        } else if (this.field896 != -1) {
            var1 = class167.field2811[this.field896];
        }
        return var1 < 0 || var1 >= this.field929.length || this.field929[var1] == -1 ? null : method2180(this.field929[var1]);
    }

    @ObfuscatedName("ar.z(B)Z")
    public boolean method692() {
        if (this.field929 == null) {
            return this.field932 != -1 || this.field936 != null;
        }
        for (int var1 = 0; var1 < this.field929.length; var1++) {
            if (this.field929[var1] != -1) {
                class38 var2 = method2180(this.field929[var1]);
                if (var2.field932 != -1 || var2.field936 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
