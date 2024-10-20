package deob;

@ObfuscatedName("aq")
public class class40 extends class174 {

    @ObfuscatedName("aq.e")
    public static class170 field994 = new class170(64);

    @ObfuscatedName("aq.l")
    public static class170 field970 = new class170(50);

    @ObfuscatedName("aq.d")
    public static class170 field971 = new class170(100);

    @ObfuscatedName("aq.k")
    public int field972;

    @ObfuscatedName("aq.u")
    public int field1000;

    @ObfuscatedName("aq.o")
    public String field974 = "null";

    @ObfuscatedName("aq.g")
    public short[] field975;

    @ObfuscatedName("aq.s")
    public short[] field976;

    @ObfuscatedName("aq.b")
    public short[] field980;

    @ObfuscatedName("aq.v")
    public short[] field978;

    @ObfuscatedName("aq.j")
    public int field979 = 2000;

    @ObfuscatedName("aq.q")
    public int field983 = 0;

    @ObfuscatedName("aq.a")
    public int field981 = 0;

    @ObfuscatedName("aq.c")
    public int field1003 = 0;

    @ObfuscatedName("aq.m")
    public int field1012 = 0;

    @ObfuscatedName("aq.z")
    public int field984 = 0;

    @ObfuscatedName("aq.w")
    public int field985 = 0;

    @ObfuscatedName("aq.h")
    public int field966 = 1;

    @ObfuscatedName("aq.y")
    public boolean field987 = false;

    @ObfuscatedName("aq.x")
    public String[] field969 = new String[] { null, null, class135.field2304, null, null };

    @ObfuscatedName("aq.p")
    public String[] field989 = new String[] { null, null, null, null, class135.field2092 };

    @ObfuscatedName("aq.i")
    public int field991 = -1;

    @ObfuscatedName("aq.aa")
    public int field967 = -1;

    @ObfuscatedName("aq.ax")
    public int field988 = 0;

    @ObfuscatedName("aq.ad")
    public int field993 = -1;

    @ObfuscatedName("aq.af")
    public int field1011 = -1;

    @ObfuscatedName("aq.ai")
    public int field995 = 0;

    @ObfuscatedName("aq.ag")
    public int field999 = -1;

    @ObfuscatedName("aq.an")
    public int field997 = -1;

    @ObfuscatedName("aq.ac")
    public int field998 = -1;

    @ObfuscatedName("aq.al")
    public int field973 = -1;

    @ObfuscatedName("aq.at")
    public int field977 = -1;

    @ObfuscatedName("aq.ah")
    public int field1001 = -1;

    @ObfuscatedName("aq.am")
    public int[] field1002;

    @ObfuscatedName("aq.ab")
    public int[] field996;

    @ObfuscatedName("aq.aq")
    public int field1004 = -1;

    @ObfuscatedName("aq.ap")
    public int field1005 = -1;

    @ObfuscatedName("aq.ar")
    public int field1006 = 128;

    @ObfuscatedName("aq.as")
    public int field1007 = 128;

    @ObfuscatedName("aq.az")
    public int field1008 = 128;

    @ObfuscatedName("aq.aw")
    public int field992 = 0;

    @ObfuscatedName("aq.av")
    public int field1010 = 0;

    @ObfuscatedName("aq.ay")
    public int field986 = 0;

    @ObfuscatedName("bu.f(II)Laq;")
    public static class40 method1433(int arg0) {
        class40 var1 = (class40) field994.method3276((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1009.method3035(10, arg0);
        class40 var3 = new class40();
        var3.field972 = arg0;
        if (var2 != null) {
            var3.method826(new class127(var2));
        }
        var3.method821();
        if (var3.field1005 != -1) {
            var3.method824(method1433(var3.field1005), method1433(var3.field1004));
        }
        if (!Statics.field968 && var3.field987) {
            var3.field974 = class135.field2160;
            var3.field969 = null;
            var3.field989 = null;
            var3.field986 = 0;
        }
        field994.method3275(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.t(I)V")
    public void method821() {
    }

    @ObfuscatedName("aq.n(Ldq;B)V")
    public void method826(class127 arg0) {
        while (true) {
            int var2 = arg0.method2458();
            if (var2 == 0) {
                return;
            }
            this.method833(arg0, var2);
        }
    }

    @ObfuscatedName("aq.e(Ldq;II)V")
    public void method833(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1000 = arg0.method2460();
        } else if (arg1 == 2) {
            this.field974 = arg0.method2636();
        } else if (arg1 == 4) {
            this.field979 = arg0.method2460();
        } else if (arg1 == 5) {
            this.field983 = arg0.method2460();
        } else if (arg1 == 6) {
            this.field981 = arg0.method2460();
        } else if (arg1 == 7) {
            this.field1012 = arg0.method2460();
            if (this.field1012 > 32767) {
                this.field1012 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field984 = arg0.method2460();
            if (this.field984 > 32767) {
                this.field984 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field985 = 1;
        } else if (arg1 == 12) {
            this.field966 = arg0.method2463();
        } else if (arg1 == 16) {
            this.field987 = true;
        } else if (arg1 == 23) {
            this.field991 = arg0.method2460();
            this.field988 = arg0.method2458();
        } else if (arg1 == 24) {
            this.field967 = arg0.method2460();
        } else if (arg1 == 25) {
            this.field993 = arg0.method2460();
            this.field995 = arg0.method2458();
        } else if (arg1 == 26) {
            this.field1011 = arg0.method2460();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field969[arg1 - 30] = arg0.method2636();
            if (this.field969[arg1 - 30].equalsIgnoreCase(class135.field2093)) {
                this.field969[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field989[arg1 - 35] = arg0.method2636();
        } else if (arg1 == 40) {
            int var3 = arg0.method2458();
            this.field975 = new short[var3];
            this.field976 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field975[var4] = (short) arg0.method2460();
                this.field976[var4] = (short) arg0.method2460();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2458();
            this.field980 = new short[var5];
            this.field978 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field980[var6] = (short) arg0.method2460();
                this.field978[var6] = (short) arg0.method2460();
            }
        } else if (arg1 == 78) {
            this.field999 = arg0.method2460();
        } else if (arg1 == 79) {
            this.field997 = arg0.method2460();
        } else if (arg1 == 90) {
            this.field998 = arg0.method2460();
        } else if (arg1 == 91) {
            this.field977 = arg0.method2460();
        } else if (arg1 == 92) {
            this.field973 = arg0.method2460();
        } else if (arg1 == 93) {
            this.field1001 = arg0.method2460();
        } else if (arg1 == 95) {
            this.field1003 = arg0.method2460();
        } else if (arg1 == 97) {
            this.field1004 = arg0.method2460();
        } else if (arg1 == 98) {
            this.field1005 = arg0.method2460();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1002 == null) {
                this.field1002 = new int[10];
                this.field996 = new int[10];
            }
            this.field1002[arg1 - 100] = arg0.method2460();
            this.field996[arg1 - 100] = arg0.method2460();
        } else if (arg1 == 110) {
            this.field1006 = arg0.method2460();
        } else if (arg1 == 111) {
            this.field1007 = arg0.method2460();
        } else if (arg1 == 112) {
            this.field1008 = arg0.method2460();
        } else if (arg1 == 113) {
            this.field992 = arg0.method2459();
        } else if (arg1 == 114) {
            this.field1010 = arg0.method2459();
        } else if (arg1 == 115) {
            this.field986 = arg0.method2458();
        }
    }

    @ObfuscatedName("aq.l(Laq;Laq;B)V")
    public void method824(class40 arg0, class40 arg1) {
        this.field1000 = arg0.field1000;
        this.field979 = arg0.field979;
        this.field983 = arg0.field983;
        this.field981 = arg0.field981;
        this.field1003 = arg0.field1003;
        this.field1012 = arg0.field1012;
        this.field984 = arg0.field984;
        this.field975 = arg0.field975;
        this.field976 = arg0.field976;
        this.field980 = arg0.field980;
        this.field978 = arg0.field978;
        this.field974 = arg1.field974;
        this.field987 = arg1.field987;
        this.field966 = arg1.field966;
        this.field985 = 1;
    }

    @ObfuscatedName("aq.d(IB)Lcz;")
    public final class101 method823(int arg0) {
        if (this.field1002 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field996[var3] && this.field996[var3] != 0) {
                    var2 = this.field1002[var3];
                }
            }
            if (var2 != -1) {
                return method1433(var2).method823(1);
            }
        }
        class101 var4 = class101.method2067(Statics.field982, this.field1000, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1006 != 128 || this.field1007 != 128 || this.field1008 != 128) {
            var4.method2074(this.field1006, this.field1007, this.field1008);
        }
        if (this.field975 != null) {
            for (int var5 = 0; var5 < this.field975.length; var5++) {
                var4.method2071(this.field975[var5], this.field976[var5]);
            }
        }
        if (this.field980 != null) {
            for (int var6 = 0; var6 < this.field980.length; var6++) {
                var4.method2079(this.field980[var6], this.field978[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aq.r(II)Ldp;")
    public final class112 method850(int arg0) {
        if (this.field1002 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field996[var3] && this.field996[var3] != 0) {
                    var2 = this.field1002[var3];
                }
            }
            if (var2 != -1) {
                return method1433(var2).method850(1);
            }
        }
        class112 var4 = (class112) field970.method3276((long) this.field972);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2067(Statics.field982, this.field1000, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1006 != 128 || this.field1007 != 128 || this.field1008 != 128) {
            var5.method2074(this.field1006, this.field1007, this.field1008);
        }
        if (this.field975 != null) {
            for (int var6 = 0; var6 < this.field975.length; var6++) {
                var5.method2071(this.field975[var6], this.field976[var6]);
            }
        }
        if (this.field980 != null) {
            for (int var7 = 0; var7 < this.field980.length; var7++) {
                var5.method2079(this.field980[var7], this.field978[var7]);
            }
        }
        class112 var8 = var5.method2112(this.field992 + 64, this.field1010 * 5 + 768, -50, -10, -50);
        var8.field1868 = true;
        field970.method3275(var8, (long) this.field972);
        return var8;
    }

    @ObfuscatedName("aq.k(IB)Laq;")
    public class40 method827(int arg0) {
        if (this.field1002 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field996[var3] && this.field996[var3] != 0) {
                    var2 = this.field1002[var3];
                }
            }
            if (var2 != -1) {
                return method1433(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("t.u(IIIIZI)Lci;")
    public static final class86 method7(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field971.method3276(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method1433(arg0);
        if (arg1 > 1 && var8.field1002 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field996[var10] && var8.field996[var10] != 0) {
                    var9 = var8.field1002[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1433(var9);
            }
        }
        class112 var11 = var8.method850(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1005 != -1) {
            var12 = method7(var8.field1004, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1479;
        int var14 = Statics.field1482;
        int var15 = Statics.field1478;
        int[] var16 = new int[4];
        class89.method1802(var16);
        class86 var17 = new class86(36, 32);
        class89.method1856(var17.field1457, 36, 32);
        class89.method1800();
        class104.method2149();
        class104.method2145(16, 16);
        class104.field1754 = false;
        int var18 = var8.field979;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1774[var8.field983] * var18 >> 16;
        int var20 = class104.field1775[var8.field983] * var18 >> 16;
        var11.method2240();
        var11.method2251(0, var8.field981, var8.field1003, var8.field983, var8.field1012, var8.field984 + var11.field1542 / 2 + var19, var8.field984 + var20);
        if (arg2 >= 1) {
            var17.method1705(1);
        }
        if (arg2 >= 2) {
            var17.method1705(16777215);
        }
        if (arg3 != 0) {
            var17.method1706(arg3);
        }
        class89.method1856(var17.field1457, 36, 32);
        if (var8.field1005 != -1) {
            var12.method1709(0, 0);
        }
        if (!arg4 && (var8.field985 == 1 || arg1 != 1) && arg1 != -1) {
            class183 var21 = Statics.field316;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class135.field2100 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class135.field2243 + "</col>";
            }
            var21.method3404(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field971.method3275(var17, var5);
        }
        class89.method1856(var13, var14, var15);
        class89.method1803(var16);
        class104.method2149();
        class104.field1754 = true;
        return var17;
    }

    @ObfuscatedName("aq.o(ZI)Z")
    public final boolean method854(boolean arg0) {
        int var2 = this.field991;
        int var3 = this.field967;
        int var4 = this.field999;
        if (arg0) {
            var2 = this.field993;
            var3 = this.field1011;
            var4 = this.field997;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field982.method3103(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field982.method3103(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field982.method3103(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aq.g(ZI)Lcz;")
    public final class101 method829(boolean arg0) {
        int var2 = this.field991;
        int var3 = this.field967;
        int var4 = this.field999;
        if (arg0) {
            var2 = this.field993;
            var3 = this.field1011;
            var4 = this.field997;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2067(Statics.field982, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2067(Statics.field982, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2067(Statics.field982, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field988 != 0) {
            var5.method2070(0, this.field988, 0);
        }
        if (arg0 && this.field995 != 0) {
            var5.method2070(0, this.field995, 0);
        }
        if (this.field975 != null) {
            for (int var10 = 0; var10 < this.field975.length; var10++) {
                var5.method2071(this.field975[var10], this.field976[var10]);
            }
        }
        if (this.field980 != null) {
            for (int var11 = 0; var11 < this.field980.length; var11++) {
                var5.method2079(this.field980[var11], this.field978[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aq.s(ZI)Z")
    public final boolean method830(boolean arg0) {
        int var2 = this.field998;
        int var3 = this.field973;
        if (arg0) {
            var2 = this.field977;
            var3 = this.field1001;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field982.method3103(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field982.method3103(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aq.b(ZI)Lcz;")
    public final class101 method831(boolean arg0) {
        int var2 = this.field998;
        int var3 = this.field973;
        if (arg0) {
            var2 = this.field977;
            var3 = this.field1001;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2067(Statics.field982, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2067(Statics.field982, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field975 != null) {
            for (int var7 = 0; var7 < this.field975.length; var7++) {
                var4.method2071(this.field975[var7], this.field976[var7]);
            }
        }
        if (this.field980 != null) {
            for (int var8 = 0; var8 < this.field980.length; var8++) {
                var4.method2079(this.field980[var8], this.field978[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("d.v(B)V")
    public static void method41() {
        field971.method3271();
    }

    @ObfuscatedName("g.j(ZI)V")
    public static void method113(boolean arg0) {
        if (Statics.field968 != arg0) {
            field994.method3271();
            field970.method3271();
            field971.method3271();
            Statics.field968 = arg0;
        }
    }
}
