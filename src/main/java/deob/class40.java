package deob;

@ObfuscatedName("af")
public class class40 extends class174 {

    @ObfuscatedName("af.r")
    public static class170 field979 = new class170(64);

    @ObfuscatedName("af.n")
    public static class170 field980 = new class170(50);

    @ObfuscatedName("af.i")
    public static class170 field981 = new class170(100);

    @ObfuscatedName("af.w")
    public int field982;

    @ObfuscatedName("af.d")
    public int field983;

    @ObfuscatedName("af.t")
    public String field984 = "null";

    @ObfuscatedName("af.f")
    public short[] field1012;

    @ObfuscatedName("af.b")
    public short[] field986;

    @ObfuscatedName("af.z")
    public short[] field1003;

    @ObfuscatedName("af.l")
    public short[] field988;

    @ObfuscatedName("af.e")
    public int field1009 = 2000;

    @ObfuscatedName("af.p")
    public int field990 = 0;

    @ObfuscatedName("af.o")
    public int field991 = 0;

    @ObfuscatedName("af.h")
    public int field992 = 0;

    @ObfuscatedName("af.j")
    public int field993 = 0;

    @ObfuscatedName("af.x")
    public int field994 = 0;

    @ObfuscatedName("af.k")
    public int field995 = 0;

    @ObfuscatedName("af.a")
    public int field996 = 1;

    @ObfuscatedName("af.y")
    public boolean field1004 = false;

    @ObfuscatedName("af.q")
    public String[] field998 = new String[] { null, null, class134.field2161, null, null };

    @ObfuscatedName("af.c")
    public String[] field999 = new String[] { null, null, null, null, class134.field2192 };

    @ObfuscatedName("af.u")
    public int field1000 = -1;

    @ObfuscatedName("af.ah")
    public int field1006 = -1;

    @ObfuscatedName("af.az")
    public int field1002 = 0;

    @ObfuscatedName("af.au")
    public int field1011 = -1;

    @ObfuscatedName("af.ae")
    public int field1020 = -1;

    @ObfuscatedName("af.aa")
    public int field1005 = 0;

    @ObfuscatedName("af.av")
    public int field1013 = -1;

    @ObfuscatedName("af.aq")
    public int field987 = -1;

    @ObfuscatedName("af.ak")
    public int field1008 = -1;

    @ObfuscatedName("af.ad")
    public int field976 = -1;

    @ObfuscatedName("af.at")
    public int field1010 = -1;

    @ObfuscatedName("af.an")
    public int field1016 = -1;

    @ObfuscatedName("af.aw")
    public int[] field997;

    @ObfuscatedName("af.am")
    public int[] field989;

    @ObfuscatedName("af.af")
    public int field1014 = -1;

    @ObfuscatedName("af.as")
    public int field985 = -1;

    @ObfuscatedName("af.ao")
    public int field1001 = 128;

    @ObfuscatedName("af.ab")
    public int field1017 = 128;

    @ObfuscatedName("af.ay")
    public int field1018 = 128;

    @ObfuscatedName("af.ar")
    public int field1019 = 0;

    @ObfuscatedName("af.aj")
    public int field1007 = 0;

    @ObfuscatedName("af.ai")
    public int field1021 = 0;

    @ObfuscatedName("n.g(II)Laf;")
    public static class40 method41(int arg0) {
        class40 var1 = (class40) field979.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1015.method2968(10, arg0);
        class40 var3 = new class40();
        var3.field982 = arg0;
        if (var2 != null) {
            var3.method843(new class127(var2));
        }
        var3.method818();
        if (var3.field985 != -1) {
            var3.method820(method41(var3.field985), method41(var3.field1014));
        }
        if (!Statics.field978 && var3.field1004) {
            var3.field984 = class134.field2182;
            var3.field998 = null;
            var3.field999 = null;
            var3.field1021 = 0;
        }
        field979.method3249(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.m(I)V")
    public void method818() {
    }

    @ObfuscatedName("af.v(Ldr;I)V")
    public void method843(class127 arg0) {
        while (true) {
            int var2 = arg0.method2414();
            if (var2 == 0) {
                return;
            }
            this.method828(arg0, var2);
        }
    }

    @ObfuscatedName("af.r(Ldr;IB)V")
    public void method828(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field983 = arg0.method2416();
        } else if (arg1 == 2) {
            this.field984 = arg0.method2422();
        } else if (arg1 == 4) {
            this.field1009 = arg0.method2416();
        } else if (arg1 == 5) {
            this.field990 = arg0.method2416();
        } else if (arg1 == 6) {
            this.field991 = arg0.method2416();
        } else if (arg1 == 7) {
            this.field993 = arg0.method2416();
            if (this.field993 > 32767) {
                this.field993 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field994 = arg0.method2416();
            if (this.field994 > 32767) {
                this.field994 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field995 = 1;
        } else if (arg1 == 12) {
            this.field996 = arg0.method2430();
        } else if (arg1 == 16) {
            this.field1004 = true;
        } else if (arg1 == 23) {
            this.field1000 = arg0.method2416();
            this.field1002 = arg0.method2414();
        } else if (arg1 == 24) {
            this.field1006 = arg0.method2416();
        } else if (arg1 == 25) {
            this.field1011 = arg0.method2416();
            this.field1005 = arg0.method2414();
        } else if (arg1 == 26) {
            this.field1020 = arg0.method2416();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field998[arg1 - 30] = arg0.method2422();
            if (this.field998[arg1 - 30].equalsIgnoreCase(class134.field2070)) {
                this.field998[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field999[arg1 - 35] = arg0.method2422();
        } else if (arg1 == 40) {
            int var3 = arg0.method2414();
            this.field1012 = new short[var3];
            this.field986 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1012[var4] = (short) arg0.method2416();
                this.field986[var4] = (short) arg0.method2416();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2414();
            this.field1003 = new short[var5];
            this.field988 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1003[var6] = (short) arg0.method2416();
                this.field988[var6] = (short) arg0.method2416();
            }
        } else if (arg1 == 78) {
            this.field1013 = arg0.method2416();
        } else if (arg1 == 79) {
            this.field987 = arg0.method2416();
        } else if (arg1 == 90) {
            this.field1008 = arg0.method2416();
        } else if (arg1 == 91) {
            this.field1010 = arg0.method2416();
        } else if (arg1 == 92) {
            this.field976 = arg0.method2416();
        } else if (arg1 == 93) {
            this.field1016 = arg0.method2416();
        } else if (arg1 == 95) {
            this.field992 = arg0.method2416();
        } else if (arg1 == 97) {
            this.field1014 = arg0.method2416();
        } else if (arg1 == 98) {
            this.field985 = arg0.method2416();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field997 == null) {
                this.field997 = new int[10];
                this.field989 = new int[10];
            }
            this.field997[arg1 - 100] = arg0.method2416();
            this.field989[arg1 - 100] = arg0.method2416();
        } else if (arg1 == 110) {
            this.field1001 = arg0.method2416();
        } else if (arg1 == 111) {
            this.field1017 = arg0.method2416();
        } else if (arg1 == 112) {
            this.field1018 = arg0.method2416();
        } else if (arg1 == 113) {
            this.field1019 = arg0.method2415();
        } else if (arg1 == 114) {
            this.field1007 = arg0.method2415();
        } else if (arg1 == 115) {
            this.field1021 = arg0.method2414();
        }
    }

    @ObfuscatedName("af.n(Laf;Laf;I)V")
    public void method820(class40 arg0, class40 arg1) {
        this.field983 = arg0.field983;
        this.field1009 = arg0.field1009;
        this.field990 = arg0.field990;
        this.field991 = arg0.field991;
        this.field992 = arg0.field992;
        this.field993 = arg0.field993;
        this.field994 = arg0.field994;
        this.field1012 = arg0.field1012;
        this.field986 = arg0.field986;
        this.field1003 = arg0.field1003;
        this.field988 = arg0.field988;
        this.field984 = arg1.field984;
        this.field1004 = arg1.field1004;
        this.field996 = arg1.field996;
        this.field995 = 1;
    }

    @ObfuscatedName("af.i(II)Lck;")
    public final class101 method854(int arg0) {
        if (this.field997 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field989[var3] && this.field989[var3] != 0) {
                    var2 = this.field997[var3];
                }
            }
            if (var2 != -1) {
                return method41(var2).method854(1);
            }
        }
        class101 var4 = class101.method2086(Statics.field977, this.field983, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1001 != 128 || this.field1017 != 128 || this.field1018 != 128) {
            var4.method2034(this.field1001, this.field1017, this.field1018);
        }
        if (this.field1012 != null) {
            for (int var5 = 0; var5 < this.field1012.length; var5++) {
                var4.method2031(this.field1012[var5], this.field986[var5]);
            }
        }
        if (this.field1003 != null) {
            for (int var6 = 0; var6 < this.field1003.length; var6++) {
                var4.method2042(this.field1003[var6], this.field988[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("af.s(II)Ldf;")
    public final class112 method822(int arg0) {
        if (this.field997 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field989[var3] && this.field989[var3] != 0) {
                    var2 = this.field997[var3];
                }
            }
            if (var2 != -1) {
                return method41(var2).method822(1);
            }
        }
        class112 var4 = (class112) field980.method3245((long) this.field982);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2086(Statics.field977, this.field983, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1001 != 128 || this.field1017 != 128 || this.field1018 != 128) {
            var5.method2034(this.field1001, this.field1017, this.field1018);
        }
        if (this.field1012 != null) {
            for (int var6 = 0; var6 < this.field1012.length; var6++) {
                var5.method2031(this.field1012[var6], this.field986[var6]);
            }
        }
        if (this.field1003 != null) {
            for (int var7 = 0; var7 < this.field1003.length; var7++) {
                var5.method2042(this.field1003[var7], this.field988[var7]);
            }
        }
        class112 var8 = var5.method2039(this.field1019 + 64, this.field1007 * 5 + 768, -50, -10, -50);
        var8.field1848 = true;
        field980.method3249(var8, (long) this.field982);
        return var8;
    }

    @ObfuscatedName("af.w(IB)Laf;")
    public class40 method823(int arg0) {
        if (this.field997 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field989[var3] && this.field989[var3] != 0) {
                    var2 = this.field997[var3];
                }
            }
            if (var2 != -1) {
                return method41(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("l.d(IIIIZI)Lcu;")
    public static final class86 method122(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field981.method3245(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method41(arg0);
        if (arg1 > 1 && var8.field997 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field989[var10] && var8.field989[var10] != 0) {
                    var9 = var8.field997[var10];
                }
            }
            if (var9 != -1) {
                var8 = method41(var9);
            }
        }
        class112 var11 = var8.method822(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field985 != -1) {
            var12 = method122(var8.field1014, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1489;
        int var14 = Statics.field1486;
        int var15 = Statics.field1487;
        int[] var16 = new int[4];
        class89.method1767(var16);
        class86 var17 = new class86(36, 32);
        class89.method1807(var17.field1470, 36, 32);
        class89.method1778();
        class104.method2098();
        class104.method2099(16, 16);
        class104.field1758 = false;
        int var18 = var8.field1009;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1778[var8.field990] * var18 >> 16;
        int var20 = class104.field1779[var8.field990] * var18 >> 16;
        var11.method2270();
        var11.method2218(0, var8.field991, var8.field992, var8.field990, var8.field993, var8.field994 + var11.field1549 / 2 + var19, var8.field994 + var20);
        if (arg2 >= 1) {
            var17.method1736(1);
        }
        if (arg2 >= 2) {
            var17.method1736(16777215);
        }
        if (arg3 != 0) {
            var17.method1729(arg3);
        }
        class89.method1807(var17.field1470, 36, 32);
        if (var8.field985 != -1) {
            var12.method1663(0, 0);
        }
        if (!arg4 && (var8.field995 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field733.method3390(method27(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field981.method3249(var17, var5);
        }
        class89.method1807(var13, var14, var15);
        class89.method1770(var16);
        class104.method2098();
        class104.field1758 = true;
        return var17;
    }

    @ObfuscatedName("v.t(II)Ljava/lang/String;")
    public static final String method27(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class134.field2087 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class134.field2151 + "</col>";
        }
    }

    @ObfuscatedName("af.f(ZI)Z")
    public final boolean method824(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field1006;
        int var4 = this.field1013;
        if (arg0) {
            var2 = this.field1011;
            var3 = this.field1020;
            var4 = this.field987;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field977.method2970(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field977.method2970(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field977.method2970(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("af.b(ZI)Lck;")
    public final class101 method825(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field1006;
        int var4 = this.field1013;
        if (arg0) {
            var2 = this.field1011;
            var3 = this.field1020;
            var4 = this.field987;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2086(Statics.field977, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2086(Statics.field977, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2086(Statics.field977, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1002 != 0) {
            var5.method2030(0, this.field1002, 0);
        }
        if (arg0 && this.field1005 != 0) {
            var5.method2030(0, this.field1005, 0);
        }
        if (this.field1012 != null) {
            for (int var10 = 0; var10 < this.field1012.length; var10++) {
                var5.method2031(this.field1012[var10], this.field986[var10]);
            }
        }
        if (this.field1003 != null) {
            for (int var11 = 0; var11 < this.field1003.length; var11++) {
                var5.method2042(this.field1003[var11], this.field988[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("af.z(ZI)Z")
    public final boolean method826(boolean arg0) {
        int var2 = this.field1008;
        int var3 = this.field976;
        if (arg0) {
            var2 = this.field1010;
            var3 = this.field1016;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field977.method2970(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field977.method2970(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("af.l(ZI)Lck;")
    public final class101 method827(boolean arg0) {
        int var2 = this.field1008;
        int var3 = this.field976;
        if (arg0) {
            var2 = this.field1010;
            var3 = this.field1016;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2086(Statics.field977, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2086(Statics.field977, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1012 != null) {
            for (int var7 = 0; var7 < this.field1012.length; var7++) {
                var4.method2031(this.field1012[var7], this.field986[var7]);
            }
        }
        if (this.field1003 != null) {
            for (int var8 = 0; var8 < this.field1003.length; var8++) {
                var4.method2042(this.field1003[var8], this.field988[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("y.e(I)V")
    public static void method190() {
        field981.method3251();
    }
}
