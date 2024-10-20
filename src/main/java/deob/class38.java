package deob;

@ObfuscatedName("ai")
public class class38 extends class195 {

    @ObfuscatedName("ai.p")
    public static boolean field887 = false;

    @ObfuscatedName("ai.f")
    public static class184 field877 = new class184(64);

    @ObfuscatedName("ai.w")
    public static class184 field878 = new class184(500);

    @ObfuscatedName("ai.t")
    public static class184 field879 = new class184(30);

    @ObfuscatedName("ai.s")
    public static class184 field922 = new class184(30);

    @ObfuscatedName("ai.c")
    public static class95[] field881 = new class95[4];

    @ObfuscatedName("ai.d")
    public int field882;

    @ObfuscatedName("ai.v")
    public int[] field883;

    @ObfuscatedName("ai.m")
    public int[] field885;

    @ObfuscatedName("ai.h")
    public String field912 = "null";

    @ObfuscatedName("ai.n")
    public short[] field911;

    @ObfuscatedName("ai.x")
    public short[] field915;

    @ObfuscatedName("ai.o")
    public short[] field897;

    @ObfuscatedName("ai.r")
    public short[] field891;

    @ObfuscatedName("ai.y")
    public int field890 = 1;

    @ObfuscatedName("ai.i")
    public int field910 = 1;

    @ObfuscatedName("ai.q")
    public int field892 = 2;

    @ObfuscatedName("ai.g")
    public boolean field893 = true;

    @ObfuscatedName("ai.l")
    public int field894 = -1;

    @ObfuscatedName("ai.u")
    public int field875 = -1;

    @ObfuscatedName("ai.j")
    public boolean field896 = false;

    @ObfuscatedName("ai.z")
    public boolean field909 = false;

    @ObfuscatedName("ai.b")
    public int field898 = -1;

    @ObfuscatedName("ai.a")
    public int field899 = 16;

    @ObfuscatedName("ai.ag")
    public int field900 = 0;

    @ObfuscatedName("ai.am")
    public int field901 = 0;

    @ObfuscatedName("ai.aa")
    public String[] field902 = new String[5];

    @ObfuscatedName("ai.az")
    public int field903 = -1;

    @ObfuscatedName("ai.aq")
    public int field904 = -1;

    @ObfuscatedName("ai.ak")
    public boolean field913 = false;

    @ObfuscatedName("ai.ar")
    public boolean field906 = true;

    @ObfuscatedName("ai.al")
    public int field916 = 128;

    @ObfuscatedName("ai.au")
    public int field908 = 128;

    @ObfuscatedName("ai.ao")
    public int field874 = 128;

    @ObfuscatedName("ai.af")
    public int field880 = 0;

    @ObfuscatedName("ai.ai")
    public int field905 = 0;

    @ObfuscatedName("ai.aj")
    public int field917 = 0;

    @ObfuscatedName("ai.aw")
    public boolean field889 = false;

    @ObfuscatedName("ai.ab")
    public boolean field914 = false;

    @ObfuscatedName("ai.ad")
    public int field886 = -1;

    @ObfuscatedName("ai.ae")
    public int[] field895;

    @ObfuscatedName("ai.ay")
    public int field907 = -1;

    @ObfuscatedName("ai.ap")
    public int field918 = -1;

    @ObfuscatedName("ai.av")
    public int field919 = -1;

    @ObfuscatedName("ai.ah")
    public int field920 = 0;

    @ObfuscatedName("ai.at")
    public int field921 = 0;

    @ObfuscatedName("ai.an")
    public int field884 = 0;

    @ObfuscatedName("ai.ac")
    public int[] field923;

    @ObfuscatedName("q.p(II)Lai;")
    public static class38 method489(int arg0) {
        class38 var1 = (class38) field877.method3371((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field888.method2896(6, arg0);
        class38 var3 = new class38();
        var3.field882 = arg0;
        if (var2 != null) {
            var3.method708(new class111(var2));
        }
        var3.method705();
        if (var3.field914) {
            var3.field892 = 0;
            var3.field893 = false;
        }
        field877.method3370(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.k(I)V")
    public void method705() {
        if (this.field894 == -1) {
            this.field894 = 0;
            if (this.field883 != null && (this.field885 == null || this.field885[0] == 10)) {
                this.field894 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field902[var1] != null) {
                    this.field894 = 1;
                }
            }
        }
        if (this.field886 == -1) {
            this.field886 = this.field892 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.e(Lde;B)V")
    public void method708(class111 arg0) {
        while (true) {
            int var2 = arg0.method2314();
            if (var2 == 0) {
                return;
            }
            this.method719(arg0, var2);
        }
    }

    @ObfuscatedName("ai.f(Lde;IB)V")
    public void method719(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2314();
            if (var3 > 0) {
                if (this.field883 == null || field887) {
                    this.field885 = new int[var3];
                    this.field883 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field883[var4] = arg0.method2177();
                        this.field885[var4] = arg0.method2314();
                    }
                } else {
                    arg0.field1885 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field912 = arg0.method2265();
        } else if (arg1 == 5) {
            int var5 = arg0.method2314();
            if (var5 > 0) {
                if (this.field883 == null || field887) {
                    this.field885 = null;
                    this.field883 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field883[var6] = arg0.method2177();
                    }
                } else {
                    arg0.field1885 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field890 = arg0.method2314();
        } else if (arg1 == 15) {
            this.field910 = arg0.method2314();
        } else if (arg1 == 17) {
            this.field892 = 0;
            this.field893 = false;
        } else if (arg1 == 18) {
            this.field893 = false;
        } else if (arg1 == 19) {
            this.field894 = arg0.method2314();
        } else if (arg1 == 21) {
            this.field875 = 0;
        } else if (arg1 == 22) {
            this.field896 = true;
        } else if (arg1 == 23) {
            this.field909 = true;
        } else if (arg1 == 24) {
            this.field898 = arg0.method2177();
            if (this.field898 == 65535) {
                this.field898 = -1;
            }
        } else if (arg1 == 27) {
            this.field892 = 1;
        } else if (arg1 == 28) {
            this.field899 = arg0.method2314();
        } else if (arg1 == 29) {
            this.field900 = arg0.method2176();
        } else if (arg1 == 39) {
            this.field901 = arg0.method2176();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field902[arg1 - 30] = arg0.method2265();
            if (this.field902[arg1 - 30].equalsIgnoreCase(class148.field2215)) {
                this.field902[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2314();
            this.field911 = new short[var7];
            this.field915 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field911[var8] = (short) arg0.method2177();
                this.field915[var8] = (short) arg0.method2177();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2314();
            this.field897 = new short[var9];
            this.field891 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field897[var10] = (short) arg0.method2177();
                this.field891[var10] = (short) arg0.method2177();
            }
        } else if (arg1 == 60) {
            this.field903 = arg0.method2177();
        } else if (arg1 == 62) {
            this.field913 = true;
        } else if (arg1 == 64) {
            this.field906 = false;
        } else if (arg1 == 65) {
            this.field916 = arg0.method2177();
        } else if (arg1 == 66) {
            this.field908 = arg0.method2177();
        } else if (arg1 == 67) {
            this.field874 = arg0.method2177();
        } else if (arg1 == 68) {
            this.field904 = arg0.method2177();
        } else if (arg1 == 69) {
            arg0.method2314();
        } else if (arg1 == 70) {
            this.field880 = arg0.method2319();
        } else if (arg1 == 71) {
            this.field905 = arg0.method2319();
        } else if (arg1 == 72) {
            this.field917 = arg0.method2319();
        } else if (arg1 == 73) {
            this.field889 = true;
        } else if (arg1 == 74) {
            this.field914 = true;
        } else if (arg1 == 75) {
            this.field886 = arg0.method2314();
        } else if (arg1 == 77) {
            this.field907 = arg0.method2177();
            if (this.field907 == 65535) {
                this.field907 = -1;
            }
            this.field918 = arg0.method2177();
            if (this.field918 == 65535) {
                this.field918 = -1;
            }
            int var11 = arg0.method2314();
            this.field895 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field895[var12] = arg0.method2177();
                if (this.field895[var12] == 65535) {
                    this.field895[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field919 = arg0.method2177();
            this.field920 = arg0.method2314();
        } else if (arg1 == 79) {
            this.field921 = arg0.method2177();
            this.field884 = arg0.method2177();
            this.field920 = arg0.method2314();
            int var13 = arg0.method2314();
            this.field923 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field923[var14] = arg0.method2177();
            }
        } else if (arg1 == 81) {
            this.field875 = arg0.method2314() * 256;
        }
    }

    @ObfuscatedName("ai.w(II)Z")
    public final boolean method704(int arg0) {
        if (this.field885 != null) {
            for (int var4 = 0; var4 < this.field885.length; var4++) {
                if (this.field885[var4] == arg0) {
                    return Statics.field876.method2898(this.field883[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field883 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field883.length; var3++) {
                var2 &= Statics.field876.method2898(this.field883[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.t(B)Z")
    public final boolean method685() {
        if (this.field883 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field883.length; var2++) {
            var1 &= Statics.field876.method2898(this.field883[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.s(II[[IIIII)Lcu;")
    public final class80 method716(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field885 == null) {
            var7 = (long) ((this.field882 << 10) + arg1);
        } else {
            var7 = (long) ((this.field882 << 10) + (arg0 << 3) + arg1);
        }
        class80 var9 = (class80) field879.method3371(var7);
        if (var9 == null) {
            class95 var10 = this.method689(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field896) {
                var10.field1641 = (short) (this.field900 + 64);
                var10.field1660 = (short) (this.field901 * 25 + 768);
                var10.method1933();
                var9 = var10;
            } else {
                var9 = var10.method1937(this.field900 + 64, this.field901 * 25 + 768, -50, -10, -50);
            }
            field879.method3370(var9, var7);
        }
        if (this.field896) {
            var9 = ((class95) var9).method1982();
        }
        if (this.field875 >= 0) {
            if (var9 instanceof class100) {
                var9 = ((class100) var9).method2023(arg2, arg3, arg4, arg5, true, this.field875);
            } else if (var9 instanceof class95) {
                var9 = ((class95) var9).method2000(arg2, arg3, arg4, arg5, true, this.field875);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.c(II[[IIIII)Lcm;")
    public final class100 method697(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field885 == null) {
            var7 = (long) ((this.field882 << 10) + arg1);
        } else {
            var7 = (long) ((this.field882 << 10) + (arg0 << 3) + arg1);
        }
        class100 var9 = (class100) field922.method3371(var7);
        if (var9 == null) {
            class95 var10 = this.method689(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1937(this.field900 + 64, this.field901 * 25 + 768, -50, -10, -50);
            field922.method3370(var9, var7);
        }
        if (this.field875 >= 0) {
            var9 = var9.method2023(arg2, arg3, arg4, arg5, true, this.field875);
        }
        return var9;
    }

    @ObfuscatedName("ai.d(II[[IIIILaw;II)Lcm;")
    public final class100 method688(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class40 arg6, int arg7) {
        long var9;
        if (this.field885 == null) {
            var9 = (long) ((this.field882 << 10) + arg1);
        } else {
            var9 = (long) ((this.field882 << 10) + (arg0 << 3) + arg1);
        }
        class100 var11 = (class100) field922.method3371(var9);
        if (var11 == null) {
            class95 var12 = this.method689(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1937(this.field900 + 64, this.field901 * 25 + 768, -50, -10, -50);
            field922.method3370(var11, var9);
        }
        if (arg6 == null && this.field875 == -1) {
            return var11;
        }
        class100 var13;
        if (arg6 == null) {
            var13 = var11.method2024(true);
        } else {
            var13 = arg6.method759(var11, arg7, arg1);
        }
        if (this.field875 >= 0) {
            var13 = var13.method2023(arg2, arg3, arg4, arg5, false, this.field875);
        }
        return var13;
    }

    @ObfuscatedName("ai.v(III)Lcv;")
    public final class95 method689(int arg0, int arg1) {
        class95 var3 = null;
        if (this.field885 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field883 == null) {
                return null;
            }
            boolean var4 = this.field913;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field883.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field883[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class95) field878.method3371((long) var7);
                if (var3 == null) {
                    var3 = class95.method1916(Statics.field876, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1931();
                    }
                    field878.method3370(var3, (long) var7);
                }
                if (var5 > 1) {
                    field881[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class95(field881, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field885.length; var9++) {
                if (this.field885[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field883[var8];
            boolean var11 = this.field913 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class95) field878.method3371((long) var10);
            if (var3 == null) {
                var3 = class95.method1916(Statics.field876, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1931();
                }
                field878.method3370(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field916 == 128 && this.field908 == 128 && this.field874 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field880 == 0 && this.field905 == 0 && this.field917 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class95 var14 = new class95(var3, arg1 == 0 && !var12 && !var13, this.field911 == null, this.field897 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1927(256);
            var14.method1928(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1991();
        } else if (var15 == 2) {
            var14.method1925();
        } else if (var15 == 3) {
            var14.method1944();
        }
        if (this.field911 != null) {
            for (int var16 = 0; var16 < this.field911.length; var16++) {
                var14.method1929(this.field911[var16], this.field915[var16]);
            }
        }
        if (this.field897 != null) {
            for (int var17 = 0; var17 < this.field897.length; var17++) {
                var14.method1930(this.field897[var17], this.field891[var17]);
            }
        }
        if (var12) {
            var14.method1932(this.field916, this.field908, this.field874);
        }
        if (var13) {
            var14.method1928(this.field880, this.field905, this.field917);
        }
        return var14;
    }

    @ObfuscatedName("ai.m(I)Lai;")
    public final class38 method684() {
        int var1 = -1;
        if (this.field907 != -1) {
            var1 = class167.method2494(this.field907);
        } else if (this.field918 != -1) {
            var1 = class167.field2804[this.field918];
        }
        return var1 < 0 || var1 >= this.field895.length || this.field895[var1] == -1 ? null : method489(this.field895[var1]);
    }

    @ObfuscatedName("ai.h(I)Z")
    public boolean method691() {
        if (this.field895 == null) {
            return this.field919 != -1 || this.field923 != null;
        }
        for (int var1 = 0; var1 < this.field895.length; var1++) {
            if (this.field895[var1] != -1) {
                class38 var2 = method489(this.field895[var1]);
                if (var2.field919 != -1 || var2.field923 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
