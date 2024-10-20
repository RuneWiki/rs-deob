package deob;

@ObfuscatedName("ab")
public class class40 extends class174 {

    @ObfuscatedName("ab.h")
    public static class170 field971 = new class170(64);

    @ObfuscatedName("ab.y")
    public static class170 field1003 = new class170(50);

    @ObfuscatedName("ab.j")
    public static class170 field973 = new class170(100);

    @ObfuscatedName("ab.f")
    public int field1014;

    @ObfuscatedName("ab.n")
    public int field975;

    @ObfuscatedName("ab.k")
    public String field1004 = "null";

    @ObfuscatedName("ab.q")
    public short[] field977;

    @ObfuscatedName("ab.w")
    public short[] field998;

    @ObfuscatedName("ab.v")
    public short[] field979;

    @ObfuscatedName("ab.z")
    public short[] field980;

    @ObfuscatedName("ab.m")
    public int field981 = 2000;

    @ObfuscatedName("ab.r")
    public int field976 = 0;

    @ObfuscatedName("ab.u")
    public int field985 = 0;

    @ObfuscatedName("ab.i")
    public int field984 = 0;

    @ObfuscatedName("ab.x")
    public int field982 = 0;

    @ObfuscatedName("ab.s")
    public int field986 = 0;

    @ObfuscatedName("ab.o")
    public int field987 = 0;

    @ObfuscatedName("ab.g")
    public int field988 = 1;

    @ObfuscatedName("ab.d")
    public boolean field972 = false;

    @ObfuscatedName("ab.t")
    public String[] field990 = new String[] { null, null, class135.field2152, null, null };

    @ObfuscatedName("ab.b")
    public String[] field991 = new String[] { null, null, null, null, class135.field2100 };

    @ObfuscatedName("ab.c")
    public int field969 = -1;

    @ObfuscatedName("ab.aw")
    public int field993 = -1;

    @ObfuscatedName("ab.ap")
    public int field994 = 0;

    @ObfuscatedName("ab.am")
    public int field995 = -1;

    @ObfuscatedName("ab.az")
    public int field996 = -1;

    @ObfuscatedName("ab.ax")
    public int field997 = 0;

    @ObfuscatedName("ab.af")
    public int field978 = -1;

    @ObfuscatedName("ab.aa")
    public int field999 = -1;

    @ObfuscatedName("ab.ag")
    public int field1000 = -1;

    @ObfuscatedName("ab.aj")
    public int field1001 = -1;

    @ObfuscatedName("ab.aq")
    public int field1002 = -1;

    @ObfuscatedName("ab.ah")
    public int field983 = -1;

    @ObfuscatedName("ab.ae")
    public int[] field992;

    @ObfuscatedName("ab.ar")
    public int[] field1005;

    @ObfuscatedName("ab.ab")
    public int field1006 = -1;

    @ObfuscatedName("ab.ay")
    public int field1007 = -1;

    @ObfuscatedName("ab.ac")
    public int field1008 = 128;

    @ObfuscatedName("ab.ad")
    public int field1009 = 128;

    @ObfuscatedName("ab.al")
    public int field1010 = 128;

    @ObfuscatedName("ab.an")
    public int field1011 = 0;

    @ObfuscatedName("ab.at")
    public int field968 = 0;

    @ObfuscatedName("ab.ak")
    public int field1013 = 0;

    @ObfuscatedName("bs.p(II)Lab;")
    public static class40 method1554(int arg0) {
        class40 var1 = (class40) field971.method3266((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field970.method3048(10, arg0);
        class40 var3 = new class40();
        var3.field1014 = arg0;
        if (var2 != null) {
            var3.method853(new class127(var2));
        }
        var3.method872();
        if (var3.field1007 != -1) {
            var3.method851(method1554(var3.field1007), method1554(var3.field1006));
        }
        if (!Statics.field1012 && var3.field972) {
            var3.field1004 = class135.field2260;
            var3.field990 = null;
            var3.field991 = null;
            var3.field1013 = 0;
        }
        field971.method3268(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.e(I)V")
    public void method872() {
    }

    @ObfuscatedName("ab.a(Ldj;B)V")
    public void method853(class127 arg0) {
        while (true) {
            int var2 = arg0.method2494();
            if (var2 == 0) {
                return;
            }
            this.method876(arg0, var2);
        }
    }

    @ObfuscatedName("ab.h(Ldj;II)V")
    public void method876(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field975 = arg0.method2496();
        } else if (arg1 == 2) {
            this.field1004 = arg0.method2502();
        } else if (arg1 == 4) {
            this.field981 = arg0.method2496();
        } else if (arg1 == 5) {
            this.field976 = arg0.method2496();
        } else if (arg1 == 6) {
            this.field985 = arg0.method2496();
        } else if (arg1 == 7) {
            this.field982 = arg0.method2496();
            if (this.field982 > 32767) {
                this.field982 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field986 = arg0.method2496();
            if (this.field986 > 32767) {
                this.field986 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field987 = 1;
        } else if (arg1 == 12) {
            this.field988 = arg0.method2617();
        } else if (arg1 == 16) {
            this.field972 = true;
        } else if (arg1 == 23) {
            this.field969 = arg0.method2496();
            this.field994 = arg0.method2494();
        } else if (arg1 == 24) {
            this.field993 = arg0.method2496();
        } else if (arg1 == 25) {
            this.field995 = arg0.method2496();
            this.field997 = arg0.method2494();
        } else if (arg1 == 26) {
            this.field996 = arg0.method2496();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field990[arg1 - 30] = arg0.method2502();
            if (this.field990[arg1 - 30].equalsIgnoreCase(class135.field2101)) {
                this.field990[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field991[arg1 - 35] = arg0.method2502();
        } else if (arg1 == 40) {
            int var3 = arg0.method2494();
            this.field977 = new short[var3];
            this.field998 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field977[var4] = (short) arg0.method2496();
                this.field998[var4] = (short) arg0.method2496();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2494();
            this.field979 = new short[var5];
            this.field980 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field979[var6] = (short) arg0.method2496();
                this.field980[var6] = (short) arg0.method2496();
            }
        } else if (arg1 == 78) {
            this.field978 = arg0.method2496();
        } else if (arg1 == 79) {
            this.field999 = arg0.method2496();
        } else if (arg1 == 90) {
            this.field1000 = arg0.method2496();
        } else if (arg1 == 91) {
            this.field1002 = arg0.method2496();
        } else if (arg1 == 92) {
            this.field1001 = arg0.method2496();
        } else if (arg1 == 93) {
            this.field983 = arg0.method2496();
        } else if (arg1 == 95) {
            this.field984 = arg0.method2496();
        } else if (arg1 == 97) {
            this.field1006 = arg0.method2496();
        } else if (arg1 == 98) {
            this.field1007 = arg0.method2496();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field992 == null) {
                this.field992 = new int[10];
                this.field1005 = new int[10];
            }
            this.field992[arg1 - 100] = arg0.method2496();
            this.field1005[arg1 - 100] = arg0.method2496();
        } else if (arg1 == 110) {
            this.field1008 = arg0.method2496();
        } else if (arg1 == 111) {
            this.field1009 = arg0.method2496();
        } else if (arg1 == 112) {
            this.field1010 = arg0.method2496();
        } else if (arg1 == 113) {
            this.field1011 = arg0.method2604();
        } else if (arg1 == 114) {
            this.field968 = arg0.method2604() * 5;
        } else if (arg1 == 115) {
            this.field1013 = arg0.method2494();
        }
    }

    @ObfuscatedName("ab.y(Lab;Lab;I)V")
    public void method851(class40 arg0, class40 arg1) {
        this.field975 = arg0.field975;
        this.field981 = arg0.field981;
        this.field976 = arg0.field976;
        this.field985 = arg0.field985;
        this.field984 = arg0.field984;
        this.field982 = arg0.field982;
        this.field986 = arg0.field986;
        this.field977 = arg0.field977;
        this.field998 = arg0.field998;
        this.field979 = arg0.field979;
        this.field980 = arg0.field980;
        this.field1004 = arg1.field1004;
        this.field972 = arg1.field972;
        this.field988 = arg1.field988;
        this.field987 = 1;
    }

    @ObfuscatedName("ab.j(II)Lch;")
    public final class101 method852(int arg0) {
        if (this.field992 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1005[var3] && this.field1005[var3] != 0) {
                    var2 = this.field992[var3];
                }
            }
            if (var2 != -1) {
                return method1554(var2).method852(1);
            }
        }
        class101 var4 = class101.method2070(Statics.field989, this.field975, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1008 != 128 || this.field1009 != 128 || this.field1010 != 128) {
            var4.method2085(this.field1008, this.field1009, this.field1010);
        }
        if (this.field977 != null) {
            for (int var5 = 0; var5 < this.field977.length; var5++) {
                var4.method2083(this.field977[var5], this.field998[var5]);
            }
        }
        if (this.field979 != null) {
            for (int var6 = 0; var6 < this.field979.length; var6++) {
                var4.method2084(this.field979[var6], this.field980[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ab.l(II)Lds;")
    public final class112 method849(int arg0) {
        if (this.field992 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1005[var3] && this.field1005[var3] != 0) {
                    var2 = this.field992[var3];
                }
            }
            if (var2 != -1) {
                return method1554(var2).method849(1);
            }
        }
        class112 var4 = (class112) field1003.method3266((long) this.field1014);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2070(Statics.field989, this.field975, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1008 != 128 || this.field1009 != 128 || this.field1010 != 128) {
            var5.method2085(this.field1008, this.field1009, this.field1010);
        }
        if (this.field977 != null) {
            for (int var6 = 0; var6 < this.field977.length; var6++) {
                var5.method2083(this.field977[var6], this.field998[var6]);
            }
        }
        if (this.field979 != null) {
            for (int var7 = 0; var7 < this.field979.length; var7++) {
                var5.method2084(this.field979[var7], this.field980[var7]);
            }
        }
        class112 var8 = var5.method2090(this.field1011 + 64, this.field968 + 768, -50, -10, -50);
        var8.field1905 = true;
        field1003.method3268(var8, (long) this.field1014);
        return var8;
    }

    @ObfuscatedName("ab.f(IB)Lab;")
    public class40 method854(int arg0) {
        if (this.field992 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1005[var3] && this.field1005[var3] != 0) {
                    var2 = this.field992[var3];
                }
            }
            if (var2 != -1) {
                return method1554(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("dv.n(IIIIZI)Lct;")
    public static final class86 method2475(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field973.method3266(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method1554(arg0);
        if (arg1 > 1 && var8.field992 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1005[var10] && var8.field1005[var10] != 0) {
                    var9 = var8.field992[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1554(var9);
            }
        }
        class112 var11 = var8.method849(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1007 != -1) {
            var12 = method2475(var8.field1006, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1502;
        int var14 = Statics.field1497;
        int var15 = Statics.field1498;
        int[] var16 = new int[4];
        class89.method1827(var16);
        class86 var17 = new class86(36, 32);
        class89.method1808(var17.field1482, 36, 32);
        class89.method1814();
        class104.method2182();
        class104.method2157(16, 16);
        class104.field1774 = false;
        int var18 = var8.field981;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1780[var8.field976] * var18 >> 16;
        int var20 = class104.field1784[var8.field976] * var18 >> 16;
        var11.method2303();
        var11.method2285(0, var8.field985, var8.field984, var8.field976, var8.field982, var8.field986 + var11.field1554 / 2 + var19, var8.field986 + var20);
        if (arg2 >= 1) {
            var17.method1716(1);
        }
        if (arg2 >= 2) {
            var17.method1716(16777215);
        }
        if (arg3 != 0) {
            var17.method1717(arg3);
        }
        class89.method1808(var17.field1482, 36, 32);
        if (var8.field1007 != -1) {
            var12.method1725(0, 0);
        }
        if (!arg4 && (var8.field987 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field1165.method3405(method2341(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field973.method3268(var17, var5);
        }
        class89.method1808(var13, var14, var15);
        class89.method1822(var16);
        class104.method2182();
        class104.field1774 = true;
        return var17;
    }

    @ObfuscatedName("dc.k(IB)Ljava/lang/String;")
    public static final String method2341(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class135.field2222 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class135.field2251 + "</col>";
        }
    }

    @ObfuscatedName("ab.q(ZB)Z")
    public final boolean method855(boolean arg0) {
        int var2 = this.field969;
        int var3 = this.field993;
        int var4 = this.field978;
        if (arg0) {
            var2 = this.field995;
            var3 = this.field996;
            var4 = this.field999;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field989.method3050(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field989.method3050(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field989.method3050(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ab.w(ZB)Lch;")
    public final class101 method881(boolean arg0) {
        int var2 = this.field969;
        int var3 = this.field993;
        int var4 = this.field978;
        if (arg0) {
            var2 = this.field995;
            var3 = this.field996;
            var4 = this.field999;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2070(Statics.field989, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2070(Statics.field989, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2070(Statics.field989, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field994 != 0) {
            var5.method2082(0, this.field994, 0);
        }
        if (arg0 && this.field997 != 0) {
            var5.method2082(0, this.field997, 0);
        }
        if (this.field977 != null) {
            for (int var10 = 0; var10 < this.field977.length; var10++) {
                var5.method2083(this.field977[var10], this.field998[var10]);
            }
        }
        if (this.field979 != null) {
            for (int var11 = 0; var11 < this.field979.length; var11++) {
                var5.method2084(this.field979[var11], this.field980[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ab.v(ZB)Z")
    public final boolean method857(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field1001;
        if (arg0) {
            var2 = this.field1002;
            var3 = this.field983;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field989.method3050(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field989.method3050(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ab.z(ZI)Lch;")
    public final class101 method858(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field1001;
        if (arg0) {
            var2 = this.field1002;
            var3 = this.field983;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2070(Statics.field989, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2070(Statics.field989, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field977 != null) {
            for (int var7 = 0; var7 < this.field977.length; var7++) {
                var4.method2083(this.field977[var7], this.field998[var7]);
            }
        }
        if (this.field979 != null) {
            for (int var8 = 0; var8 < this.field979.length; var8++) {
                var4.method2084(this.field979[var8], this.field980[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bs.m(I)V")
    public static void method1566() {
        field971.method3269();
        field1003.method3269();
        field973.method3269();
    }

    @ObfuscatedName("c.r(ZI)V")
    public static void method239(boolean arg0) {
        if (Statics.field1012 != arg0) {
            method1566();
            Statics.field1012 = arg0;
        }
    }
}
