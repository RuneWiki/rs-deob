package deob;

@ObfuscatedName("ah")
public class class38 extends class195 {

    @ObfuscatedName("ah.n")
    public static boolean field918 = false;

    @ObfuscatedName("ah.e")
    public static class184 field898 = new class184(64);

    @ObfuscatedName("ah.h")
    public static class184 field870 = new class184(500);

    @ObfuscatedName("ah.q")
    public static class184 field897 = new class184(30);

    @ObfuscatedName("ah.l")
    public static class184 field872 = new class184(30);

    @ObfuscatedName("ah.c")
    public static class95[] field894 = new class95[4];

    @ObfuscatedName("ah.f")
    public int field887;

    @ObfuscatedName("ah.s")
    public int[] field875;

    @ObfuscatedName("ah.m")
    public int[] field876;

    @ObfuscatedName("ah.y")
    public String field877 = "null";

    @ObfuscatedName("ah.b")
    public short[] field885;

    @ObfuscatedName("ah.v")
    public short[] field878;

    @ObfuscatedName("ah.z")
    public short[] field880;

    @ObfuscatedName("ah.u")
    public short[] field874;

    @ObfuscatedName("ah.g")
    public int field882 = 1;

    @ObfuscatedName("ah.k")
    public int field905 = 1;

    @ObfuscatedName("ah.o")
    public int field884 = 2;

    @ObfuscatedName("ah.a")
    public boolean field908 = true;

    @ObfuscatedName("ah.p")
    public int field916 = -1;

    @ObfuscatedName("ah.t")
    public int field891 = -1;

    @ObfuscatedName("ah.x")
    public boolean field888 = false;

    @ObfuscatedName("ah.d")
    public boolean field869 = false;

    @ObfuscatedName("ah.j")
    public int field890 = -1;

    @ObfuscatedName("ah.r")
    public int field886 = 16;

    @ObfuscatedName("ah.at")
    public int field892 = 0;

    @ObfuscatedName("ah.av")
    public int field893 = 0;

    @ObfuscatedName("ah.ar")
    public String[] field883 = new String[5];

    @ObfuscatedName("ah.aq")
    public int field895 = -1;

    @ObfuscatedName("ah.as")
    public int field896 = -1;

    @ObfuscatedName("ah.ad")
    public boolean field866 = false;

    @ObfuscatedName("ah.ap")
    public boolean field879 = true;

    @ObfuscatedName("ah.an")
    public int field881 = 128;

    @ObfuscatedName("ah.au")
    public int field873 = 128;

    @ObfuscatedName("ah.aw")
    public int field901 = 128;

    @ObfuscatedName("ah.ag")
    public int field902 = 0;

    @ObfuscatedName("ah.ah")
    public int field903 = 0;

    @ObfuscatedName("ah.ao")
    public int field904 = 0;

    @ObfuscatedName("ah.ac")
    public boolean field900 = false;

    @ObfuscatedName("ah.af")
    public boolean field906 = false;

    @ObfuscatedName("ah.ab")
    public int field907 = -1;

    @ObfuscatedName("ah.ai")
    public int[] field889;

    @ObfuscatedName("ah.ay")
    public int field909 = -1;

    @ObfuscatedName("ah.ak")
    public int field910 = -1;

    @ObfuscatedName("ah.aj")
    public int field911 = -1;

    @ObfuscatedName("ah.az")
    public int field912 = 0;

    @ObfuscatedName("ah.am")
    public int field913 = 0;

    @ObfuscatedName("ah.ax")
    public int field914 = 0;

    @ObfuscatedName("ah.al")
    public int[] field915;

    @ObfuscatedName("aq.n(II)Lah;")
    public static class38 method595(int arg0) {
        class38 var1 = (class38) field898.method3315((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field867.method2859(6, arg0);
        class38 var3 = new class38();
        var3.field887 = arg0;
        if (var2 != null) {
            var3.method676(new class111(var2));
        }
        var3.method675();
        if (var3.field906) {
            var3.field884 = 0;
            var3.field908 = false;
        }
        field898.method3317(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.w(B)V")
    public void method675() {
        if (this.field916 == -1) {
            this.field916 = 0;
            if (this.field875 != null && (this.field876 == null || this.field876[0] == 10)) {
                this.field916 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field883[var1] != null) {
                    this.field916 = 1;
                }
            }
        }
        if (this.field907 == -1) {
            this.field907 = this.field884 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ah.i(Ldo;I)V")
    public void method676(class111 arg0) {
        while (true) {
            int var2 = arg0.method2155();
            if (var2 == 0) {
                return;
            }
            this.method677(arg0, var2);
        }
    }

    @ObfuscatedName("ah.e(Ldo;II)V")
    public void method677(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2155();
            if (var3 > 0) {
                if (this.field875 == null || field918) {
                    this.field876 = new int[var3];
                    this.field875 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field875[var4] = arg0.method2157();
                        this.field876[var4] = arg0.method2155();
                    }
                } else {
                    arg0.field1888 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field877 = arg0.method2163();
        } else if (arg1 == 5) {
            int var5 = arg0.method2155();
            if (var5 > 0) {
                if (this.field875 == null || field918) {
                    this.field876 = null;
                    this.field875 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field875[var6] = arg0.method2157();
                    }
                } else {
                    arg0.field1888 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field882 = arg0.method2155();
        } else if (arg1 == 15) {
            this.field905 = arg0.method2155();
        } else if (arg1 == 17) {
            this.field884 = 0;
            this.field908 = false;
        } else if (arg1 == 18) {
            this.field908 = false;
        } else if (arg1 == 19) {
            this.field916 = arg0.method2155();
        } else if (arg1 == 21) {
            this.field891 = 0;
        } else if (arg1 == 22) {
            this.field888 = true;
        } else if (arg1 == 23) {
            this.field869 = true;
        } else if (arg1 == 24) {
            this.field890 = arg0.method2157();
            if (this.field890 == 65535) {
                this.field890 = -1;
            }
        } else if (arg1 == 27) {
            this.field884 = 1;
        } else if (arg1 == 28) {
            this.field886 = arg0.method2155();
        } else if (arg1 == 29) {
            this.field892 = arg0.method2173();
        } else if (arg1 == 39) {
            this.field893 = arg0.method2173() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field883[arg1 - 30] = arg0.method2163();
            if (this.field883[arg1 - 30].equalsIgnoreCase(class148.field2204)) {
                this.field883[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2155();
            this.field885 = new short[var7];
            this.field878 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field885[var8] = (short) arg0.method2157();
                this.field878[var8] = (short) arg0.method2157();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2155();
            this.field880 = new short[var9];
            this.field874 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field880[var10] = (short) arg0.method2157();
                this.field874[var10] = (short) arg0.method2157();
            }
        } else if (arg1 == 60) {
            this.field895 = arg0.method2157();
        } else if (arg1 == 62) {
            this.field866 = true;
        } else if (arg1 == 64) {
            this.field879 = false;
        } else if (arg1 == 65) {
            this.field881 = arg0.method2157();
        } else if (arg1 == 66) {
            this.field873 = arg0.method2157();
        } else if (arg1 == 67) {
            this.field901 = arg0.method2157();
        } else if (arg1 == 68) {
            this.field896 = arg0.method2157();
        } else if (arg1 == 69) {
            arg0.method2155();
        } else if (arg1 == 70) {
            this.field902 = arg0.method2166();
        } else if (arg1 == 71) {
            this.field903 = arg0.method2166();
        } else if (arg1 == 72) {
            this.field904 = arg0.method2166();
        } else if (arg1 == 73) {
            this.field900 = true;
        } else if (arg1 == 74) {
            this.field906 = true;
        } else if (arg1 == 75) {
            this.field907 = arg0.method2155();
        } else if (arg1 == 77) {
            this.field909 = arg0.method2157();
            if (this.field909 == 65535) {
                this.field909 = -1;
            }
            this.field910 = arg0.method2157();
            if (this.field910 == 65535) {
                this.field910 = -1;
            }
            int var11 = arg0.method2155();
            this.field889 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field889[var12] = arg0.method2157();
                if (this.field889[var12] == 65535) {
                    this.field889[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field911 = arg0.method2157();
            this.field912 = arg0.method2155();
        } else if (arg1 == 79) {
            this.field913 = arg0.method2157();
            this.field914 = arg0.method2157();
            this.field912 = arg0.method2155();
            int var13 = arg0.method2155();
            this.field915 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field915[var14] = arg0.method2157();
            }
        } else if (arg1 == 81) {
            this.field891 = arg0.method2155() * 256;
        }
    }

    @ObfuscatedName("ah.h(II)Z")
    public final boolean method695(int arg0) {
        if (this.field876 != null) {
            for (int var4 = 0; var4 < this.field876.length; var4++) {
                if (this.field876[var4] == arg0) {
                    return Statics.field868.method2861(this.field875[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field875 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field875.length; var3++) {
                var2 &= Statics.field868.method2861(this.field875[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ah.q(I)Z")
    public final boolean method679() {
        if (this.field875 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field875.length; var2++) {
            var1 &= Statics.field868.method2861(this.field875[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ah.l(II[[IIIII)Lcu;")
    public final class80 method680(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field876 == null) {
            var7 = (long) ((this.field887 << 10) + arg1);
        } else {
            var7 = (long) ((this.field887 << 10) + (arg0 << 3) + arg1);
        }
        class80 var9 = (class80) field897.method3315(var7);
        if (var9 == null) {
            class95 var10 = this.method683(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field888) {
                var10.field1655 = (short) (this.field892 + 64);
                var10.field1632 = (short) (this.field893 + 768);
                var10.method1923();
                var9 = var10;
            } else {
                var9 = var10.method1982(this.field892 + 64, this.field893 + 768, -50, -10, -50);
            }
            field897.method3317(var9, var7);
        }
        if (this.field888) {
            var9 = ((class95) var9).method1981();
        }
        if (this.field891 >= 0) {
            if (var9 instanceof class100) {
                var9 = ((class100) var9).method1999(arg2, arg3, arg4, arg5, true, this.field891);
            } else if (var9 instanceof class95) {
                var9 = ((class95) var9).method1927(arg2, arg3, arg4, arg5, true, this.field891);
            }
        }
        return var9;
    }

    @ObfuscatedName("ah.c(II[[IIIII)Lcw;")
    public final class100 method681(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field876 == null) {
            var7 = (long) ((this.field887 << 10) + arg1);
        } else {
            var7 = (long) ((this.field887 << 10) + (arg0 << 3) + arg1);
        }
        class100 var9 = (class100) field872.method3315(var7);
        if (var9 == null) {
            class95 var10 = this.method683(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1982(this.field892 + 64, this.field893 + 768, -50, -10, -50);
            field872.method3317(var9, var7);
        }
        if (this.field891 >= 0) {
            var9 = var9.method1999(arg2, arg3, arg4, arg5, true, this.field891);
        }
        return var9;
    }

    @ObfuscatedName("ah.f(II[[IIIILac;II)Lcw;")
    public final class100 method682(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class40 arg6, int arg7) {
        long var9;
        if (this.field876 == null) {
            var9 = (long) ((this.field887 << 10) + arg1);
        } else {
            var9 = (long) ((this.field887 << 10) + (arg0 << 3) + arg1);
        }
        class100 var11 = (class100) field872.method3315(var9);
        if (var11 == null) {
            class95 var12 = this.method683(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1982(this.field892 + 64, this.field893 + 768, -50, -10, -50);
            field872.method3317(var11, var9);
        }
        if (arg6 == null && this.field891 == -1) {
            return var11;
        }
        class100 var13;
        if (arg6 == null) {
            var13 = var11.method1998(true);
        } else {
            var13 = arg6.method742(var11, arg7, arg1);
        }
        if (this.field891 >= 0) {
            var13 = var13.method1999(arg2, arg3, arg4, arg5, false, this.field891);
        }
        return var13;
    }

    @ObfuscatedName("ah.s(III)Lce;")
    public final class95 method683(int arg0, int arg1) {
        class95 var3 = null;
        if (this.field876 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field875 == null) {
                return null;
            }
            boolean var4 = this.field866;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field875.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field875[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class95) field870.method3315((long) var7);
                if (var3 == null) {
                    var3 = class95.method1905(Statics.field868, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1921();
                    }
                    field870.method3317(var3, (long) var7);
                }
                if (var5 > 1) {
                    field894[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class95(field894, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field876.length; var9++) {
                if (this.field876[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field875[var8];
            boolean var11 = this.field866 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class95) field870.method3315((long) var10);
            if (var3 == null) {
                var3 = class95.method1905(Statics.field868, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1921();
                }
                field870.method3317(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field881 == 128 && this.field873 == 128 && this.field901 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field902 == 0 && this.field903 == 0 && this.field904 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class95 var14 = new class95(var3, arg1 == 0 && !var12 && !var13, this.field885 == null, this.field880 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1984(256);
            var14.method1964(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1914();
        } else if (var15 == 2) {
            var14.method1966();
        } else if (var15 == 3) {
            var14.method1916();
        }
        if (this.field885 != null) {
            for (int var16 = 0; var16 < this.field885.length; var16++) {
                var14.method1919(this.field885[var16], this.field878[var16]);
            }
        }
        if (this.field880 != null) {
            for (int var17 = 0; var17 < this.field880.length; var17++) {
                var14.method1920(this.field880[var17], this.field874[var17]);
            }
        }
        if (var12) {
            var14.method1922(this.field881, this.field873, this.field901);
        }
        if (var13) {
            var14.method1964(this.field902, this.field903, this.field904);
        }
        return var14;
    }

    @ObfuscatedName("ah.m(I)Lah;")
    public final class38 method684() {
        int var1 = -1;
        if (this.field909 != -1) {
            var1 = class167.method1895(this.field909);
        } else if (this.field910 != -1) {
            var1 = class167.field2805[this.field910];
        }
        return var1 < 0 || var1 >= this.field889.length || this.field889[var1] == -1 ? null : method595(this.field889[var1]);
    }

    @ObfuscatedName("ah.b(I)Z")
    public boolean method687() {
        if (this.field889 == null) {
            return this.field911 != -1 || this.field915 != null;
        }
        for (int var1 = 0; var1 < this.field889.length; var1++) {
            if (this.field889[var1] != -1) {
                class38 var2 = method595(this.field889[var1]);
                if (var2.field911 != -1 || var2.field915 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
