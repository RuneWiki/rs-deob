package deob;

@ObfuscatedName("aa")
public class class45 extends class181 {

    @ObfuscatedName("aa.y")
    public static class171 field980 = new class171(64);

    @ObfuscatedName("aa.i")
    public static class171 field981 = new class171(50);

    @ObfuscatedName("aa.b")
    public static class171 field982 = new class171(100);

    @ObfuscatedName("aa.q")
    public int field984;

    @ObfuscatedName("aa.p")
    public int field985;

    @ObfuscatedName("aa.h")
    public String field986 = "null";

    @ObfuscatedName("aa.r")
    public short[] field1011;

    @ObfuscatedName("aa.o")
    public short[] field988;

    @ObfuscatedName("aa.f")
    public short[] field989;

    @ObfuscatedName("aa.u")
    public short[] field991;

    @ObfuscatedName("aa.c")
    public int field979 = 2000;

    @ObfuscatedName("aa.l")
    public int field987 = 0;

    @ObfuscatedName("aa.w")
    public int field993 = 0;

    @ObfuscatedName("aa.x")
    public int field994 = 0;

    @ObfuscatedName("aa.t")
    public int field995 = 0;

    @ObfuscatedName("aa.k")
    public int field996 = 0;

    @ObfuscatedName("aa.e")
    public int field997 = 0;

    @ObfuscatedName("aa.v")
    public int field1027 = 1;

    @ObfuscatedName("aa.n")
    public boolean field990 = false;

    @ObfuscatedName("aa.d")
    public String[] field1000 = new String[] { null, null, class142.field2211, null, null };

    @ObfuscatedName("aa.m")
    public String[] field1001 = new String[] { null, null, null, null, class142.field2133 };

    @ObfuscatedName("aa.g")
    public int field1002 = -1;

    @ObfuscatedName("aa.aq")
    public int field1018 = -1;

    @ObfuscatedName("aa.ao")
    public int field1004 = 0;

    @ObfuscatedName("aa.af")
    public int field1005 = -1;

    @ObfuscatedName("aa.ag")
    public int field1021 = -1;

    @ObfuscatedName("aa.ad")
    public int field1007 = 0;

    @ObfuscatedName("aa.ak")
    public int field1009 = -1;

    @ObfuscatedName("aa.aj")
    public int field1019 = -1;

    @ObfuscatedName("aa.as")
    public int field1008 = -1;

    @ObfuscatedName("aa.al")
    public int field983 = -1;

    @ObfuscatedName("aa.ai")
    public int field1012 = -1;

    @ObfuscatedName("aa.az")
    public int field999 = -1;

    @ObfuscatedName("aa.aw")
    public int[] field1010;

    @ObfuscatedName("aa.ay")
    public int[] field1015;

    @ObfuscatedName("aa.au")
    public int field1016 = -1;

    @ObfuscatedName("aa.ar")
    public int field1017 = -1;

    @ObfuscatedName("aa.ap")
    public int field978 = 128;

    @ObfuscatedName("aa.an")
    public int field1006 = 128;

    @ObfuscatedName("aa.ae")
    public int field1020 = 128;

    @ObfuscatedName("aa.aa")
    public int field1024 = 0;

    @ObfuscatedName("aa.ax")
    public int field1022 = 0;

    @ObfuscatedName("aa.am")
    public int field1003 = 0;

    @ObfuscatedName("l.z(II)Laa;")
    public static class45 method158(int arg0) {
        class45 var1 = (class45) field980.method3162((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1014.method2705(10, arg0);
        class45 var3 = new class45();
        var3.field984 = arg0;
        if (var2 != null) {
            var3.method830(new class107(var2));
        }
        var3.method876();
        if (var3.field1017 != -1) {
            var3.method829(method158(var3.field1017), method158(var3.field1016));
        }
        if (!Statics.field1023 && var3.field990) {
            var3.field986 = class142.field2132;
            var3.field1000 = null;
            var3.field1001 = null;
            var3.field1003 = 0;
        }
        field980.method3171(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.j(B)V")
    public void method876() {
    }

    @ObfuscatedName("aa.a(Ldq;I)V")
    public void method830(class107 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method837(arg0, var2);
        }
    }

    @ObfuscatedName("aa.y(Ldq;IB)V")
    public void method837(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field985 = arg0.method2239();
        } else if (arg1 == 2) {
            this.field986 = arg0.method2130();
        } else if (arg1 == 4) {
            this.field979 = arg0.method2239();
        } else if (arg1 == 5) {
            this.field987 = arg0.method2239();
        } else if (arg1 == 6) {
            this.field993 = arg0.method2239();
        } else if (arg1 == 7) {
            this.field995 = arg0.method2239();
            if (this.field995 > 32767) {
                this.field995 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field996 = arg0.method2239();
            if (this.field996 > 32767) {
                this.field996 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field997 = 1;
        } else if (arg1 == 12) {
            this.field1027 = arg0.method2127();
        } else if (arg1 == 16) {
            this.field990 = true;
        } else if (arg1 == 23) {
            this.field1002 = arg0.method2239();
            this.field1004 = arg0.method2122();
        } else if (arg1 == 24) {
            this.field1018 = arg0.method2239();
        } else if (arg1 == 25) {
            this.field1005 = arg0.method2239();
            this.field1007 = arg0.method2122();
        } else if (arg1 == 26) {
            this.field1021 = arg0.method2239();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1000[arg1 - 30] = arg0.method2130();
            if (this.field1000[arg1 - 30].equalsIgnoreCase(class142.field2134)) {
                this.field1000[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1001[arg1 - 35] = arg0.method2130();
        } else if (arg1 == 40) {
            int var3 = arg0.method2122();
            this.field1011 = new short[var3];
            this.field988 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1011[var4] = (short) arg0.method2239();
                this.field988[var4] = (short) arg0.method2239();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2122();
            this.field989 = new short[var5];
            this.field991 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field989[var6] = (short) arg0.method2239();
                this.field991[var6] = (short) arg0.method2239();
            }
        } else if (arg1 == 78) {
            this.field1009 = arg0.method2239();
        } else if (arg1 == 79) {
            this.field1019 = arg0.method2239();
        } else if (arg1 == 90) {
            this.field1008 = arg0.method2239();
        } else if (arg1 == 91) {
            this.field1012 = arg0.method2239();
        } else if (arg1 == 92) {
            this.field983 = arg0.method2239();
        } else if (arg1 == 93) {
            this.field999 = arg0.method2239();
        } else if (arg1 == 95) {
            this.field994 = arg0.method2239();
        } else if (arg1 == 97) {
            this.field1016 = arg0.method2239();
        } else if (arg1 == 98) {
            this.field1017 = arg0.method2239();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1010 == null) {
                this.field1010 = new int[10];
                this.field1015 = new int[10];
            }
            this.field1010[arg1 - 100] = arg0.method2239();
            this.field1015[arg1 - 100] = arg0.method2239();
        } else if (arg1 == 110) {
            this.field978 = arg0.method2239();
        } else if (arg1 == 111) {
            this.field1006 = arg0.method2239();
        } else if (arg1 == 112) {
            this.field1020 = arg0.method2239();
        } else if (arg1 == 113) {
            this.field1024 = arg0.method2201();
        } else if (arg1 == 114) {
            this.field1022 = arg0.method2201();
        } else if (arg1 == 115) {
            this.field1003 = arg0.method2122();
        }
    }

    @ObfuscatedName("aa.i(Laa;Laa;I)V")
    public void method829(class45 arg0, class45 arg1) {
        this.field985 = arg0.field985;
        this.field979 = arg0.field979;
        this.field987 = arg0.field987;
        this.field993 = arg0.field993;
        this.field994 = arg0.field994;
        this.field995 = arg0.field995;
        this.field996 = arg0.field996;
        this.field1011 = arg0.field1011;
        this.field988 = arg0.field988;
        this.field989 = arg0.field989;
        this.field991 = arg0.field991;
        this.field986 = arg1.field986;
        this.field990 = arg1.field990;
        this.field1027 = arg1.field1027;
        this.field997 = 1;
    }

    @ObfuscatedName("aa.b(IS)Lcy;")
    public final class93 method831(int arg0) {
        if (this.field1010 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1015[var3] && this.field1015[var3] != 0) {
                    var2 = this.field1010[var3];
                }
            }
            if (var2 != -1) {
                return method158(var2).method831(1);
            }
        }
        class93 var4 = class93.method1883(Statics.field2012, this.field985, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field978 != 128 || this.field1006 != 128 || this.field1020 != 128) {
            var4.method1899(this.field978, this.field1006, this.field1020);
        }
        if (this.field1011 != null) {
            for (int var5 = 0; var5 < this.field1011.length; var5++) {
                var4.method1888(this.field1011[var5], this.field988[var5]);
            }
        }
        if (this.field989 != null) {
            for (int var6 = 0; var6 < this.field989.length; var6++) {
                var4.method1930(this.field989[var6], this.field991[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aa.s(II)Lcu;")
    public final class98 method834(int arg0) {
        if (this.field1010 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1015[var3] && this.field1015[var3] != 0) {
                    var2 = this.field1010[var3];
                }
            }
            if (var2 != -1) {
                return method158(var2).method834(1);
            }
        }
        class98 var4 = (class98) field981.method3162((long) this.field984);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1883(Statics.field2012, this.field985, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field978 != 128 || this.field1006 != 128 || this.field1020 != 128) {
            var5.method1899(this.field978, this.field1006, this.field1020);
        }
        if (this.field1011 != null) {
            for (int var6 = 0; var6 < this.field1011.length; var6++) {
                var5.method1888(this.field1011[var6], this.field988[var6]);
            }
        }
        if (this.field989 != null) {
            for (int var7 = 0; var7 < this.field989.length; var7++) {
                var5.method1930(this.field989[var7], this.field991[var7]);
            }
        }
        class98 var8 = var5.method1897(this.field1024 + 64, this.field1022 * 5 + 768, -50, -10, -50);
        var8.field1700 = true;
        field981.method3171(var8, (long) this.field984);
        return var8;
    }

    @ObfuscatedName("aa.q(II)Laa;")
    public class45 method839(int arg0) {
        if (this.field1010 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1015[var3] && this.field1015[var3] != 0) {
                    var2 = this.field1010[var3];
                }
            }
            if (var2 != -1) {
                return method158(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("j.p(IIIIZI)Lbw;")
    public static final class72 method13(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field982.method3162(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method158(arg0);
        if (arg1 > 1 && var8.field1010 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1015[var10] && var8.field1015[var10] != 0) {
                    var9 = var8.field1010[var10];
                }
            }
            if (var9 != -1) {
                var8 = method158(var9);
            }
        }
        class98 var11 = var8.method834(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1017 != -1) {
            var12 = method13(var8.field1016, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1292;
        int var14 = Statics.field1290;
        int var15 = Statics.field1291;
        int[] var16 = new int[4];
        class73.method1525(var16);
        class72 var17 = new class72(36, 32);
        class73.method1500(var17.field1283, 36, 32);
        class73.method1506();
        class84.method1782();
        class84.method1826(16, 16);
        class84.field1433 = false;
        int var18 = var8.field979;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1447[var8.field987] * var18 >> 16;
        int var20 = class84.field1454[var8.field987] * var18 >> 16;
        var11.method1981();
        var11.method1993(0, var8.field993, var8.field994, var8.field987, var8.field995, var8.field996 + var11.field1328 / 2 + var19, var8.field996 + var20);
        if (arg2 >= 1) {
            var17.method1418(1);
        }
        if (arg2 >= 2) {
            var17.method1418(16777215);
        }
        if (arg3 != 0) {
            var17.method1419(arg3);
        }
        class73.method1500(var17.field1283, 36, 32);
        if (var8.field1017 != -1) {
            var12.method1422(0, 0);
        }
        if (!arg4 && (var8.field997 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field998.method3352(method721(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field982.method3171(var17, var5);
        }
        class73.method1500(var13, var14, var15);
        class73.method1519(var16);
        class84.method1782();
        class84.field1433 = true;
        return var17;
    }

    @ObfuscatedName("aw.h(II)Ljava/lang/String;")
    public static final String method721(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class142.field2345 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class142.field2293 + "</col>";
        }
    }

    @ObfuscatedName("aa.r(ZI)Z")
    public final boolean method836(boolean arg0) {
        int var2 = this.field1002;
        int var3 = this.field1018;
        int var4 = this.field1009;
        if (arg0) {
            var2 = this.field1005;
            var3 = this.field1021;
            var4 = this.field1019;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2012.method2772(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2012.method2772(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2012.method2772(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aa.o(ZI)Lcy;")
    public final class93 method861(boolean arg0) {
        int var2 = this.field1002;
        int var3 = this.field1018;
        int var4 = this.field1009;
        if (arg0) {
            var2 = this.field1005;
            var3 = this.field1021;
            var4 = this.field1019;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1883(Statics.field2012, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1883(Statics.field2012, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1883(Statics.field2012, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1004 != 0) {
            var5.method1896(0, this.field1004, 0);
        }
        if (arg0 && this.field1007 != 0) {
            var5.method1896(0, this.field1007, 0);
        }
        if (this.field1011 != null) {
            for (int var10 = 0; var10 < this.field1011.length; var10++) {
                var5.method1888(this.field1011[var10], this.field988[var10]);
            }
        }
        if (this.field989 != null) {
            for (int var11 = 0; var11 < this.field989.length; var11++) {
                var5.method1930(this.field989[var11], this.field991[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aa.f(ZS)Z")
    public final boolean method838(boolean arg0) {
        int var2 = this.field1008;
        int var3 = this.field983;
        if (arg0) {
            var2 = this.field1012;
            var3 = this.field999;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2012.method2772(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2012.method2772(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aa.u(ZI)Lcy;")
    public final class93 method854(boolean arg0) {
        int var2 = this.field1008;
        int var3 = this.field983;
        if (arg0) {
            var2 = this.field1012;
            var3 = this.field999;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1883(Statics.field2012, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1883(Statics.field2012, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1011 != null) {
            for (int var7 = 0; var7 < this.field1011.length; var7++) {
                var4.method1888(this.field1011[var7], this.field988[var7]);
            }
        }
        if (this.field989 != null) {
            for (int var8 = 0; var8 < this.field989.length; var8++) {
                var4.method1930(this.field989[var8], this.field991[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("an.c(I)V")
    public static void method811() {
        field980.method3164();
        field981.method3164();
        field982.method3164();
    }

    @ObfuscatedName("ai.l(B)V")
    public static void method669() {
        field982.method3164();
    }

    @ObfuscatedName("aq.w(ZI)V")
    public static void method529(boolean arg0) {
        if (Statics.field1023 != arg0) {
            method811();
            Statics.field1023 = arg0;
        }
    }
}
