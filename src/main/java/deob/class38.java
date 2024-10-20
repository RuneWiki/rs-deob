package deob;

@ObfuscatedName("ao")
public class class38 extends class195 {

    @ObfuscatedName("ao.y")
    public static boolean field885 = false;

    @ObfuscatedName("ao.n")
    public static class184 field879 = new class184(64);

    @ObfuscatedName("ao.t")
    public static class184 field874 = new class184(500);

    @ObfuscatedName("ao.e")
    public static class184 field891 = new class184(30);

    @ObfuscatedName("ao.q")
    public static class184 field876 = new class184(30);

    @ObfuscatedName("ao.z")
    public static class95[] field877 = new class95[4];

    @ObfuscatedName("ao.v")
    public int field878;

    @ObfuscatedName("ao.b")
    public int[] field900;

    @ObfuscatedName("ao.f")
    public int[] field892;

    @ObfuscatedName("ao.i")
    public String field881 = "null";

    @ObfuscatedName("ao.w")
    public short[] field873;

    @ObfuscatedName("ao.l")
    public short[] field883;

    @ObfuscatedName("ao.j")
    public short[] field912;

    @ObfuscatedName("ao.s")
    public short[] field918;

    @ObfuscatedName("ao.r")
    public int field886 = 1;

    @ObfuscatedName("ao.h")
    public int field887 = 1;

    @ObfuscatedName("ao.x")
    public int field917 = 2;

    @ObfuscatedName("ao.m")
    public boolean field893 = true;

    @ObfuscatedName("ao.a")
    public int field890 = -1;

    @ObfuscatedName("ao.p")
    public int field875 = -1;

    @ObfuscatedName("ao.c")
    public boolean field903 = false;

    @ObfuscatedName("ao.u")
    public boolean field889 = false;

    @ObfuscatedName("ao.d")
    public int field870 = -1;

    @ObfuscatedName("ao.o")
    public int field895 = 16;

    @ObfuscatedName("ao.aj")
    public int field896 = 0;

    @ObfuscatedName("ao.au")
    public int field897 = 0;

    @ObfuscatedName("ao.ah")
    public String[] field898 = new String[5];

    @ObfuscatedName("ao.ab")
    public int field899 = -1;

    @ObfuscatedName("ao.am")
    public int field907 = -1;

    @ObfuscatedName("ao.ar")
    public boolean field901 = false;

    @ObfuscatedName("ao.an")
    public boolean field902 = true;

    @ObfuscatedName("ao.az")
    public int field880 = 128;

    @ObfuscatedName("ao.at")
    public int field904 = 128;

    @ObfuscatedName("ao.ag")
    public int field905 = 128;

    @ObfuscatedName("ao.as")
    public int field906 = 0;

    @ObfuscatedName("ao.ao")
    public int field910 = 0;

    @ObfuscatedName("ao.af")
    public int field908 = 0;

    @ObfuscatedName("ao.ay")
    public boolean field909 = false;

    @ObfuscatedName("ao.aq")
    public boolean field919 = false;

    @ObfuscatedName("ao.aw")
    public int field911 = -1;

    @ObfuscatedName("ao.al")
    public int[] field894;

    @ObfuscatedName("ao.ap")
    public int field913 = -1;

    @ObfuscatedName("ao.ac")
    public int field914 = -1;

    @ObfuscatedName("ao.av")
    public int field915 = -1;

    @ObfuscatedName("ao.ai")
    public int field916 = 0;

    @ObfuscatedName("ao.ax")
    public int field884 = 0;

    @ObfuscatedName("ao.ae")
    public int field888 = 0;

    @ObfuscatedName("ao.aa")
    public int[] field871;

    @ObfuscatedName("aq.y(Lfd;Lfd;ZI)V")
    public static void method796(class158 arg0, class158 arg1, boolean arg2) {
        Statics.field882 = arg0;
        Statics.field872 = arg1;
        field885 = arg2;
    }

    @ObfuscatedName("h.k(II)Lao;")
    public static class38 method167(int arg0) {
        class38 var1 = (class38) field879.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field882.method2874(6, arg0);
        class38 var3 = new class38();
        var3.field878 = arg0;
        if (var2 != null) {
            var3.method709(new class111(var2));
        }
        var3.method708();
        if (var3.field919) {
            var3.field917 = 0;
            var3.field893 = false;
        }
        field879.method3340(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.g(I)V")
    public void method708() {
        if (this.field890 == -1) {
            this.field890 = 0;
            if (this.field900 != null && (this.field892 == null || this.field892[0] == 10)) {
                this.field890 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field898[var1] != null) {
                    this.field890 = 1;
                }
            }
        }
        if (this.field911 == -1) {
            this.field911 = this.field917 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ao.n(Ldw;I)V")
    public void method709(class111 arg0) {
        while (true) {
            int var2 = arg0.method2205();
            if (var2 == 0) {
                return;
            }
            this.method710(arg0, var2);
        }
    }

    @ObfuscatedName("ao.t(Ldw;IS)V")
    public void method710(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2205();
            if (var3 > 0) {
                if (this.field900 == null || field885) {
                    this.field892 = new int[var3];
                    this.field900 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field900[var4] = arg0.method2339();
                        this.field892[var4] = arg0.method2205();
                    }
                } else {
                    arg0.field1902 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field881 = arg0.method2170();
        } else if (arg1 == 5) {
            int var5 = arg0.method2205();
            if (var5 > 0) {
                if (this.field900 == null || field885) {
                    this.field892 = null;
                    this.field900 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field900[var6] = arg0.method2339();
                    }
                } else {
                    arg0.field1902 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field886 = arg0.method2205();
        } else if (arg1 == 15) {
            this.field887 = arg0.method2205();
        } else if (arg1 == 17) {
            this.field917 = 0;
            this.field893 = false;
        } else if (arg1 == 18) {
            this.field893 = false;
        } else if (arg1 == 19) {
            this.field890 = arg0.method2205();
        } else if (arg1 == 21) {
            this.field875 = 0;
        } else if (arg1 == 22) {
            this.field903 = true;
        } else if (arg1 == 23) {
            this.field889 = true;
        } else if (arg1 == 24) {
            this.field870 = arg0.method2339();
            if (this.field870 == 65535) {
                this.field870 = -1;
            }
        } else if (arg1 == 27) {
            this.field917 = 1;
        } else if (arg1 == 28) {
            this.field895 = arg0.method2205();
        } else if (arg1 == 29) {
            this.field896 = arg0.method2199();
        } else if (arg1 == 39) {
            this.field897 = arg0.method2199() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field898[arg1 - 30] = arg0.method2170();
            if (this.field898[arg1 - 30].equalsIgnoreCase(class148.field2225)) {
                this.field898[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2205();
            this.field873 = new short[var7];
            this.field883 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field873[var8] = (short) arg0.method2339();
                this.field883[var8] = (short) arg0.method2339();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2205();
            this.field912 = new short[var9];
            this.field918 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field912[var10] = (short) arg0.method2339();
                this.field918[var10] = (short) arg0.method2339();
            }
        } else if (arg1 == 60) {
            this.field899 = arg0.method2339();
        } else if (arg1 == 62) {
            this.field901 = true;
        } else if (arg1 == 64) {
            this.field902 = false;
        } else if (arg1 == 65) {
            this.field880 = arg0.method2339();
        } else if (arg1 == 66) {
            this.field904 = arg0.method2339();
        } else if (arg1 == 67) {
            this.field905 = arg0.method2339();
        } else if (arg1 == 68) {
            this.field907 = arg0.method2339();
        } else if (arg1 == 69) {
            arg0.method2205();
        } else if (arg1 == 70) {
            this.field906 = arg0.method2163();
        } else if (arg1 == 71) {
            this.field910 = arg0.method2163();
        } else if (arg1 == 72) {
            this.field908 = arg0.method2163();
        } else if (arg1 == 73) {
            this.field909 = true;
        } else if (arg1 == 74) {
            this.field919 = true;
        } else if (arg1 == 75) {
            this.field911 = arg0.method2205();
        } else if (arg1 == 77) {
            this.field913 = arg0.method2339();
            if (this.field913 == 65535) {
                this.field913 = -1;
            }
            this.field914 = arg0.method2339();
            if (this.field914 == 65535) {
                this.field914 = -1;
            }
            int var11 = arg0.method2205();
            this.field894 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field894[var12] = arg0.method2339();
                if (this.field894[var12] == 65535) {
                    this.field894[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field915 = arg0.method2339();
            this.field916 = arg0.method2205();
        } else if (arg1 == 79) {
            this.field884 = arg0.method2339();
            this.field888 = arg0.method2339();
            this.field916 = arg0.method2205();
            int var13 = arg0.method2205();
            this.field871 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field871[var14] = arg0.method2339();
            }
        } else if (arg1 == 81) {
            this.field875 = arg0.method2205() * 256;
        }
    }

    @ObfuscatedName("ao.e(II)Z")
    public final boolean method711(int arg0) {
        if (this.field892 != null) {
            for (int var4 = 0; var4 < this.field892.length; var4++) {
                if (this.field892[var4] == arg0) {
                    return Statics.field872.method2876(this.field900[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field900 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field900.length; var3++) {
                var2 &= Statics.field872.method2876(this.field900[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ao.q(I)Z")
    public final boolean method712() {
        if (this.field900 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field900.length; var2++) {
            var1 &= Statics.field872.method2876(this.field900[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ao.z(II[[IIIIS)Lcr;")
    public final class80 method713(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field892 == null) {
            var7 = (long) ((this.field878 << 10) + arg1);
        } else {
            var7 = (long) ((this.field878 << 10) + (arg0 << 3) + arg1);
        }
        class80 var9 = (class80) field891.method3327(var7);
        if (var9 == null) {
            class95 var10 = this.method716(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field903) {
                var10.field1616 = (short) (this.field896 + 64);
                var10.field1651 = (short) (this.field897 + 768);
                var10.method1907();
                var9 = var10;
            } else {
                var9 = var10.method1953(this.field896 + 64, this.field897 + 768, -50, -10, -50);
            }
            field891.method3340(var9, var7);
        }
        if (this.field903) {
            var9 = ((class95) var9).method1901();
        }
        if (this.field875 >= 0) {
            if (var9 instanceof class100) {
                var9 = ((class100) var9).method1996(arg2, arg3, arg4, arg5, true, this.field875);
            } else if (var9 instanceof class95) {
                var9 = ((class95) var9).method1908(arg2, arg3, arg4, arg5, true, this.field875);
            }
        }
        return var9;
    }

    @ObfuscatedName("ao.v(II[[IIIIB)Lch;")
    public final class100 method714(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field892 == null) {
            var7 = (long) ((this.field878 << 10) + arg1);
        } else {
            var7 = (long) ((this.field878 << 10) + (arg0 << 3) + arg1);
        }
        class100 var9 = (class100) field876.method3327(var7);
        if (var9 == null) {
            class95 var10 = this.method716(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1953(this.field896 + 64, this.field897 + 768, -50, -10, -50);
            field876.method3340(var9, var7);
        }
        if (this.field875 >= 0) {
            var9 = var9.method1996(arg2, arg3, arg4, arg5, true, this.field875);
        }
        return var9;
    }

    @ObfuscatedName("ao.b(II[[IIIILay;II)Lch;")
    public final class100 method715(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class40 arg6, int arg7) {
        long var9;
        if (this.field892 == null) {
            var9 = (long) ((this.field878 << 10) + arg1);
        } else {
            var9 = (long) ((this.field878 << 10) + (arg0 << 3) + arg1);
        }
        class100 var11 = (class100) field876.method3327(var9);
        if (var11 == null) {
            class95 var12 = this.method716(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1953(this.field896 + 64, this.field897 + 768, -50, -10, -50);
            field876.method3340(var11, var9);
        }
        if (arg6 == null && this.field875 == -1) {
            return var11;
        }
        class100 var13;
        if (arg6 == null) {
            var13 = var11.method2003(true);
        } else {
            var13 = arg6.method773(var11, arg7, arg1);
        }
        if (this.field875 >= 0) {
            var13 = var13.method1996(arg2, arg3, arg4, arg5, false, this.field875);
        }
        return var13;
    }

    @ObfuscatedName("ao.f(III)Lcc;")
    public final class95 method716(int arg0, int arg1) {
        class95 var3 = null;
        if (this.field892 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field900 == null) {
                return null;
            }
            boolean var4 = this.field901;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field900.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field900[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class95) field874.method3327((long) var7);
                if (var3 == null) {
                    var3 = class95.method1900(Statics.field872, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1916();
                    }
                    field874.method3340(var3, (long) var7);
                }
                if (var5 > 1) {
                    field877[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class95(field877, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field892.length; var9++) {
                if (this.field892[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field900[var8];
            boolean var11 = this.field901 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class95) field874.method3327((long) var10);
            if (var3 == null) {
                var3 = class95.method1900(Statics.field872, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1916();
                }
                field874.method3340(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field880 == 128 && this.field904 == 128 && this.field905 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field906 == 0 && this.field910 == 0 && this.field908 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class95 var14 = new class95(var3, arg1 == 0 && !var12 && !var13, this.field873 == null, this.field912 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1912(256);
            var14.method1913(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1909();
        } else if (var15 == 2) {
            var14.method1910();
        } else if (var15 == 3) {
            var14.method1940();
        }
        if (this.field873 != null) {
            for (int var16 = 0; var16 < this.field873.length; var16++) {
                var14.method1922(this.field873[var16], this.field883[var16]);
            }
        }
        if (this.field912 != null) {
            for (int var17 = 0; var17 < this.field912.length; var17++) {
                var14.method1915(this.field912[var17], this.field918[var17]);
            }
        }
        if (var12) {
            var14.method1899(this.field880, this.field904, this.field905);
        }
        if (var13) {
            var14.method1913(this.field906, this.field910, this.field908);
        }
        return var14;
    }

    @ObfuscatedName("ao.i(I)Lao;")
    public final class38 method717() {
        int var1 = -1;
        if (this.field913 != -1) {
            var1 = class167.method14(this.field913);
        } else if (this.field914 != -1) {
            var1 = class167.field2816[this.field914];
        }
        return var1 < 0 || var1 >= this.field894.length || this.field894[var1] == -1 ? null : method167(this.field894[var1]);
    }

    @ObfuscatedName("ao.w(I)Z")
    public boolean method736() {
        if (this.field894 == null) {
            return this.field915 != -1 || this.field871 != null;
        }
        for (int var1 = 0; var1 < this.field894.length; var1++) {
            if (this.field894[var1] != -1) {
                class38 var2 = method167(this.field894[var1]);
                if (var2.field915 != -1 || var2.field871 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
