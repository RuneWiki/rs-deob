package deob;

@ObfuscatedName("ac")
public class class40 extends class174 {

    @ObfuscatedName("ac.t")
    public static class170 field993 = new class170(64);

    @ObfuscatedName("ac.f")
    public static class170 field979 = new class170(50);

    @ObfuscatedName("ac.c")
    public static class170 field1004 = new class170(100);

    @ObfuscatedName("ac.s")
    public int field1010;

    @ObfuscatedName("ac.k")
    public int field983;

    @ObfuscatedName("ac.m")
    public String field984 = "null";

    @ObfuscatedName("ac.y")
    public short[] field985;

    @ObfuscatedName("ac.b")
    public short[] field986;

    @ObfuscatedName("ac.l")
    public short[] field987;

    @ObfuscatedName("ac.x")
    public short[] field988;

    @ObfuscatedName("ac.z")
    public int field989 = 2000;

    @ObfuscatedName("ac.r")
    public int field990 = 0;

    @ObfuscatedName("ac.h")
    public int field991 = 0;

    @ObfuscatedName("ac.v")
    public int field992 = 0;

    @ObfuscatedName("ac.u")
    public int field999 = 0;

    @ObfuscatedName("ac.i")
    public int field980 = 0;

    @ObfuscatedName("ac.e")
    public int field982 = 0;

    @ObfuscatedName("ac.n")
    public int field996 = 1;

    @ObfuscatedName("ac.q")
    public boolean field997 = false;

    @ObfuscatedName("ac.w")
    public String[] field1020 = new String[] { null, null, class134.field2079, null, null };

    @ObfuscatedName("ac.o")
    public String[] field998 = new String[] { null, null, null, null, class134.field2271 };

    @ObfuscatedName("ac.j")
    public int field1000 = -1;

    @ObfuscatedName("ac.ae")
    public int field1001 = -1;

    @ObfuscatedName("ac.aq")
    public int field1002 = 0;

    @ObfuscatedName("ac.ap")
    public int field1003 = -1;

    @ObfuscatedName("ac.ah")
    public int field1006 = -1;

    @ObfuscatedName("ac.ax")
    public int field1005 = 0;

    @ObfuscatedName("ac.ai")
    public int field1015 = -1;

    @ObfuscatedName("ac.aa")
    public int field978 = -1;

    @ObfuscatedName("ac.ar")
    public int field975 = -1;

    @ObfuscatedName("ac.ak")
    public int field1009 = -1;

    @ObfuscatedName("ac.al")
    public int field995 = -1;

    @ObfuscatedName("ac.au")
    public int field1011 = -1;

    @ObfuscatedName("ac.aj")
    public int[] field1012;

    @ObfuscatedName("ac.az")
    public int[] field1013;

    @ObfuscatedName("ac.ac")
    public int field1024 = -1;

    @ObfuscatedName("ac.ay")
    public int field994 = -1;

    @ObfuscatedName("ac.as")
    public int field1016 = 128;

    @ObfuscatedName("ac.af")
    public int field1017 = 128;

    @ObfuscatedName("ac.an")
    public int field1018 = 128;

    @ObfuscatedName("ac.am")
    public int field1019 = 0;

    @ObfuscatedName("ac.av")
    public int field1014 = 0;

    @ObfuscatedName("ac.aw")
    public int field1021 = 0;

    @ObfuscatedName("bd.d(Lej;Lej;ZLgc;I)V")
    public static void method1354(class152 arg0, class152 arg1, boolean arg2, class183 arg3) {
        Statics.field1008 = arg0;
        Statics.field976 = arg1;
        Statics.field977 = arg2;
        Statics.field1008.method2943(10);
        Statics.field981 = arg3;
    }

    @ObfuscatedName("o.g(II)Lac;")
    public static class40 method211(int arg0) {
        class40 var1 = (class40) field993.method3210((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1008.method2958(10, arg0);
        class40 var3 = new class40();
        var3.field1010 = arg0;
        if (var2 != null) {
            var3.method814(new class127(var2));
        }
        var3.method811();
        if (var3.field994 != -1) {
            var3.method838(method211(var3.field994), method211(var3.field1024));
        }
        if (!Statics.field977 && var3.field997) {
            var3.field984 = class134.field2102;
            var3.field1020 = null;
            var3.field998 = null;
            var3.field1021 = 0;
        }
        field993.method3221(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.a(B)V")
    public void method811() {
    }

    @ObfuscatedName("ac.t(Ldo;S)V")
    public void method814(class127 arg0) {
        while (true) {
            int var2 = arg0.method2509();
            if (var2 == 0) {
                return;
            }
            this.method813(arg0, var2);
        }
    }

    @ObfuscatedName("ac.f(Ldo;II)V")
    public void method813(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field983 = arg0.method2512();
        } else if (arg1 == 2) {
            this.field984 = arg0.method2408();
        } else if (arg1 == 4) {
            this.field989 = arg0.method2512();
        } else if (arg1 == 5) {
            this.field990 = arg0.method2512();
        } else if (arg1 == 6) {
            this.field991 = arg0.method2512();
        } else if (arg1 == 7) {
            this.field999 = arg0.method2512();
            if (this.field999 > 32767) {
                this.field999 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field980 = arg0.method2512();
            if (this.field980 > 32767) {
                this.field980 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field982 = 1;
        } else if (arg1 == 12) {
            this.field996 = arg0.method2405();
        } else if (arg1 == 16) {
            this.field997 = true;
        } else if (arg1 == 23) {
            this.field1000 = arg0.method2512();
            this.field1002 = arg0.method2509();
        } else if (arg1 == 24) {
            this.field1001 = arg0.method2512();
        } else if (arg1 == 25) {
            this.field1003 = arg0.method2512();
            this.field1005 = arg0.method2509();
        } else if (arg1 == 26) {
            this.field1006 = arg0.method2512();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1020[arg1 - 30] = arg0.method2408();
            if (this.field1020[arg1 - 30].equalsIgnoreCase(class134.field2081)) {
                this.field1020[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field998[arg1 - 35] = arg0.method2408();
        } else if (arg1 == 40) {
            int var3 = arg0.method2509();
            this.field985 = new short[var3];
            this.field986 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field985[var4] = (short) arg0.method2512();
                this.field986[var4] = (short) arg0.method2512();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2509();
            this.field987 = new short[var5];
            this.field988 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field987[var6] = (short) arg0.method2512();
                this.field988[var6] = (short) arg0.method2512();
            }
        } else if (arg1 == 78) {
            this.field1015 = arg0.method2512();
        } else if (arg1 == 79) {
            this.field978 = arg0.method2512();
        } else if (arg1 == 90) {
            this.field975 = arg0.method2512();
        } else if (arg1 == 91) {
            this.field995 = arg0.method2512();
        } else if (arg1 == 92) {
            this.field1009 = arg0.method2512();
        } else if (arg1 == 93) {
            this.field1011 = arg0.method2512();
        } else if (arg1 == 95) {
            this.field992 = arg0.method2512();
        } else if (arg1 == 97) {
            this.field1024 = arg0.method2512();
        } else if (arg1 == 98) {
            this.field994 = arg0.method2512();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1012 == null) {
                this.field1012 = new int[10];
                this.field1013 = new int[10];
            }
            this.field1012[arg1 - 100] = arg0.method2512();
            this.field1013[arg1 - 100] = arg0.method2512();
        } else if (arg1 == 110) {
            this.field1016 = arg0.method2512();
        } else if (arg1 == 111) {
            this.field1017 = arg0.method2512();
        } else if (arg1 == 112) {
            this.field1018 = arg0.method2512();
        } else if (arg1 == 113) {
            this.field1019 = arg0.method2500();
        } else if (arg1 == 114) {
            this.field1014 = arg0.method2500() * 5;
        } else if (arg1 == 115) {
            this.field1021 = arg0.method2509();
        }
    }

    @ObfuscatedName("ac.c(Lac;Lac;I)V")
    public void method838(class40 arg0, class40 arg1) {
        this.field983 = arg0.field983;
        this.field989 = arg0.field989;
        this.field990 = arg0.field990;
        this.field991 = arg0.field991;
        this.field992 = arg0.field992;
        this.field999 = arg0.field999;
        this.field980 = arg0.field980;
        this.field985 = arg0.field985;
        this.field986 = arg0.field986;
        this.field987 = arg0.field987;
        this.field988 = arg0.field988;
        this.field984 = arg1.field984;
        this.field997 = arg1.field997;
        this.field996 = arg1.field996;
        this.field982 = 1;
    }

    @ObfuscatedName("ac.p(II)Lcr;")
    public final class101 method815(int arg0) {
        if (this.field1012 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1013[var3] && this.field1013[var3] != 0) {
                    var2 = this.field1012[var3];
                }
            }
            if (var2 != -1) {
                return method211(var2).method815(1);
            }
        }
        class101 var4 = class101.method2016(Statics.field976, this.field983, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1016 != 128 || this.field1017 != 128 || this.field1018 != 128) {
            var4.method2019(this.field1016, this.field1017, this.field1018);
        }
        if (this.field985 != null) {
            for (int var5 = 0; var5 < this.field985.length; var5++) {
                var4.method2035(this.field985[var5], this.field986[var5]);
            }
        }
        if (this.field987 != null) {
            for (int var6 = 0; var6 < this.field987.length; var6++) {
                var4.method2017(this.field987[var6], this.field988[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ac.s(II)Ldd;")
    public final class112 method816(int arg0) {
        if (this.field1012 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1013[var3] && this.field1013[var3] != 0) {
                    var2 = this.field1012[var3];
                }
            }
            if (var2 != -1) {
                return method211(var2).method816(1);
            }
        }
        class112 var4 = (class112) field979.method3210((long) this.field1010);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2016(Statics.field976, this.field983, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1016 != 128 || this.field1017 != 128 || this.field1018 != 128) {
            var5.method2019(this.field1016, this.field1017, this.field1018);
        }
        if (this.field985 != null) {
            for (int var6 = 0; var6 < this.field985.length; var6++) {
                var5.method2035(this.field985[var6], this.field986[var6]);
            }
        }
        if (this.field987 != null) {
            for (int var7 = 0; var7 < this.field987.length; var7++) {
                var5.method2017(this.field987[var7], this.field988[var7]);
            }
        }
        class112 var8 = var5.method2013(this.field1019 + 64, this.field1014 + 768, -50, -10, -50);
        var8.field1913 = true;
        field979.method3221(var8, (long) this.field1010);
        return var8;
    }

    @ObfuscatedName("ac.k(II)Lac;")
    public class40 method817(int arg0) {
        if (this.field1012 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1013[var3] && this.field1013[var3] != 0) {
                    var2 = this.field1012[var3];
                }
            }
            if (var2 != -1) {
                return method211(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("t.m(IIIIZI)Lcv;")
    public static final class86 method38(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field1004.method3210(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method211(arg0);
        if (arg1 > 1 && var8.field1012 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1013[var10] && var8.field1013[var10] != 0) {
                    var9 = var8.field1012[var10];
                }
            }
            if (var9 != -1) {
                var8 = method211(var9);
            }
        }
        class112 var11 = var8.method816(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field994 != -1) {
            var12 = method38(var8.field1024, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1485;
        int var14 = Statics.field1481;
        int var15 = Statics.field1479;
        int[] var16 = new int[4];
        class89.method1742(var16);
        class86 var17 = new class86(36, 32);
        class89.method1739(var17.field1463, 36, 32);
        class89.method1744();
        class104.method2087();
        class104.method2090(16, 16);
        class104.field1756 = false;
        int var18 = var8.field989;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1776[var8.field990] * var18 >> 16;
        int var20 = class104.field1771[var8.field990] * var18 >> 16;
        var11.method2190();
        var11.method2202(0, var8.field991, var8.field992, var8.field990, var8.field999, var8.field980 + var11.field1545 / 2 + var19, var8.field980 + var20);
        if (arg2 >= 1) {
            var17.method1656(1);
        }
        if (arg2 >= 2) {
            var17.method1656(16777215);
        }
        if (arg3 != 0) {
            var17.method1638(arg3);
        }
        class89.method1739(var17.field1463, 36, 32);
        if (var8.field994 != -1) {
            var12.method1646(0, 0);
        }
        if (!arg4 && (var8.field982 == 1 || arg1 != 1) && arg1 != -1) {
            class183 var21 = Statics.field981;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class134.field2233 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class134.field2231 + "</col>";
            }
            var21.method3348(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1004.method3221(var17, var5);
        }
        class89.method1739(var13, var14, var15);
        class89.method1743(var16);
        class104.method2087();
        class104.field1756 = true;
        return var17;
    }

    @ObfuscatedName("ac.y(ZB)Z")
    public final boolean method818(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field1001;
        int var4 = this.field1015;
        if (arg0) {
            var2 = this.field1003;
            var3 = this.field1006;
            var4 = this.field978;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field976.method2999(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field976.method2999(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field976.method2999(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ac.b(ZB)Lcr;")
    public final class101 method819(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field1001;
        int var4 = this.field1015;
        if (arg0) {
            var2 = this.field1003;
            var3 = this.field1006;
            var4 = this.field978;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2016(Statics.field976, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2016(Statics.field976, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2016(Statics.field976, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1002 != 0) {
            var5.method2015(0, this.field1002, 0);
        }
        if (arg0 && this.field1005 != 0) {
            var5.method2015(0, this.field1005, 0);
        }
        if (this.field985 != null) {
            for (int var10 = 0; var10 < this.field985.length; var10++) {
                var5.method2035(this.field985[var10], this.field986[var10]);
            }
        }
        if (this.field987 != null) {
            for (int var11 = 0; var11 < this.field987.length; var11++) {
                var5.method2017(this.field987[var11], this.field988[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ac.l(ZS)Z")
    public final boolean method820(boolean arg0) {
        int var2 = this.field975;
        int var3 = this.field1009;
        if (arg0) {
            var2 = this.field995;
            var3 = this.field1011;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field976.method2999(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field976.method2999(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ac.x(ZI)Lcr;")
    public final class101 method821(boolean arg0) {
        int var2 = this.field975;
        int var3 = this.field1009;
        if (arg0) {
            var2 = this.field995;
            var3 = this.field1011;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2016(Statics.field976, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2016(Statics.field976, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field985 != null) {
            for (int var7 = 0; var7 < this.field985.length; var7++) {
                var4.method2035(this.field985[var7], this.field986[var7]);
            }
        }
        if (this.field987 != null) {
            for (int var8 = 0; var8 < this.field987.length; var8++) {
                var4.method2017(this.field987[var8], this.field988[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("o.z(B)V")
    public static void method214() {
        field993.method3209();
        field979.method3209();
        field1004.method3209();
    }
}
