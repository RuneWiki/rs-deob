package deob;

@ObfuscatedName("al")
public class class40 extends class174 {

    @ObfuscatedName("al.p")
    public static class170 field1023 = new class170(64);

    @ObfuscatedName("al.e")
    public static class170 field982 = new class170(50);

    @ObfuscatedName("al.d")
    public static class170 field983 = new class170(100);

    @ObfuscatedName("al.x")
    public int field984;

    @ObfuscatedName("al.t")
    public int field1022;

    @ObfuscatedName("al.i")
    public String field986 = "null";

    @ObfuscatedName("al.z")
    public short[] field987;

    @ObfuscatedName("al.o")
    public short[] field988;

    @ObfuscatedName("al.u")
    public short[] field989;

    @ObfuscatedName("al.f")
    public short[] field990;

    @ObfuscatedName("al.k")
    public int field991 = 2000;

    @ObfuscatedName("al.q")
    public int field992 = 0;

    @ObfuscatedName("al.a")
    public int field981 = 0;

    @ObfuscatedName("al.w")
    public int field997 = 0;

    @ObfuscatedName("al.g")
    public int field1021 = 0;

    @ObfuscatedName("al.l")
    public int field996 = 0;

    @ObfuscatedName("al.m")
    public int field1000 = 0;

    @ObfuscatedName("al.b")
    public int field998 = 1;

    @ObfuscatedName("al.h")
    public boolean field999 = false;

    @ObfuscatedName("al.n")
    public String[] field1016 = new String[] { null, null, class134.field2072, null, null };

    @ObfuscatedName("al.s")
    public String[] field1014 = new String[] { null, null, null, null, class134.field2149 };

    @ObfuscatedName("al.c")
    public int field1002 = -1;

    @ObfuscatedName("al.am")
    public int field1003 = -1;

    @ObfuscatedName("al.ap")
    public int field1004 = 0;

    @ObfuscatedName("al.au")
    public int field1005 = -1;

    @ObfuscatedName("al.ab")
    public int field1001 = -1;

    @ObfuscatedName("al.ae")
    public int field1007 = 0;

    @ObfuscatedName("al.as")
    public int field1008 = -1;

    @ObfuscatedName("al.av")
    public int field1019 = -1;

    @ObfuscatedName("al.ar")
    public int field994 = -1;

    @ObfuscatedName("al.ad")
    public int field1011 = -1;

    @ObfuscatedName("al.ac")
    public int field1012 = -1;

    @ObfuscatedName("al.ax")
    public int field1013 = -1;

    @ObfuscatedName("al.ao")
    public int[] field978;

    @ObfuscatedName("al.aj")
    public int[] field1015;

    @ObfuscatedName("al.al")
    public int field1010 = -1;

    @ObfuscatedName("al.ak")
    public int field1017 = -1;

    @ObfuscatedName("al.ag")
    public int field1018 = 128;

    @ObfuscatedName("al.ah")
    public int field993 = 128;

    @ObfuscatedName("al.ay")
    public int field1020 = 128;

    @ObfuscatedName("al.an")
    public int field995 = 0;

    @ObfuscatedName("al.aq")
    public int field1009 = 0;

    @ObfuscatedName("al.af")
    public int field985 = 0;

    @ObfuscatedName("ax.j(II)Lal;")
    public static class40 method789(int arg0) {
        class40 var1 = (class40) field1023.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1006.method3016(10, arg0);
        class40 var3 = new class40();
        var3.field984 = arg0;
        if (var2 != null) {
            var3.method823(new class127(var2));
        }
        var3.method828();
        if (var3.field1017 != -1) {
            var3.method842(method789(var3.field1017), method789(var3.field1010));
        }
        if (!Statics.field980 && var3.field999) {
            var3.field986 = class134.field2205;
            var3.field1016 = null;
            var3.field1014 = null;
            var3.field985 = 0;
        }
        field1023.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.r(S)V")
    public void method828() {
    }

    @ObfuscatedName("al.v(Ldn;I)V")
    public void method823(class127 arg0) {
        while (true) {
            int var2 = arg0.method2441();
            if (var2 == 0) {
                return;
            }
            this.method848(arg0, var2);
        }
    }

    @ObfuscatedName("al.p(Ldn;II)V")
    public void method848(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1022 = arg0.method2609();
        } else if (arg1 == 2) {
            this.field986 = arg0.method2449();
        } else if (arg1 == 4) {
            this.field991 = arg0.method2609();
        } else if (arg1 == 5) {
            this.field992 = arg0.method2609();
        } else if (arg1 == 6) {
            this.field981 = arg0.method2609();
        } else if (arg1 == 7) {
            this.field1021 = arg0.method2609();
            if (this.field1021 > 32767) {
                this.field1021 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field996 = arg0.method2609();
            if (this.field996 > 32767) {
                this.field996 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1000 = 1;
        } else if (arg1 == 12) {
            this.field998 = arg0.method2446();
        } else if (arg1 == 16) {
            this.field999 = true;
        } else if (arg1 == 23) {
            this.field1002 = arg0.method2609();
            this.field1004 = arg0.method2441();
        } else if (arg1 == 24) {
            this.field1003 = arg0.method2609();
        } else if (arg1 == 25) {
            this.field1005 = arg0.method2609();
            this.field1007 = arg0.method2441();
        } else if (arg1 == 26) {
            this.field1001 = arg0.method2609();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1016[arg1 - 30] = arg0.method2449();
            if (this.field1016[arg1 - 30].equalsIgnoreCase(class134.field2073)) {
                this.field1016[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1014[arg1 - 35] = arg0.method2449();
        } else if (arg1 == 40) {
            int var3 = arg0.method2441();
            this.field987 = new short[var3];
            this.field988 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field987[var4] = (short) arg0.method2609();
                this.field988[var4] = (short) arg0.method2609();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2441();
            this.field989 = new short[var5];
            this.field990 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field989[var6] = (short) arg0.method2609();
                this.field990[var6] = (short) arg0.method2609();
            }
        } else if (arg1 == 78) {
            this.field1008 = arg0.method2609();
        } else if (arg1 == 79) {
            this.field1019 = arg0.method2609();
        } else if (arg1 == 90) {
            this.field994 = arg0.method2609();
        } else if (arg1 == 91) {
            this.field1012 = arg0.method2609();
        } else if (arg1 == 92) {
            this.field1011 = arg0.method2609();
        } else if (arg1 == 93) {
            this.field1013 = arg0.method2609();
        } else if (arg1 == 95) {
            this.field997 = arg0.method2609();
        } else if (arg1 == 97) {
            this.field1010 = arg0.method2609();
        } else if (arg1 == 98) {
            this.field1017 = arg0.method2609();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field978 == null) {
                this.field978 = new int[10];
                this.field1015 = new int[10];
            }
            this.field978[arg1 - 100] = arg0.method2609();
            this.field1015[arg1 - 100] = arg0.method2609();
        } else if (arg1 == 110) {
            this.field1018 = arg0.method2609();
        } else if (arg1 == 111) {
            this.field993 = arg0.method2609();
        } else if (arg1 == 112) {
            this.field1020 = arg0.method2609();
        } else if (arg1 == 113) {
            this.field995 = arg0.method2442();
        } else if (arg1 == 114) {
            this.field1009 = arg0.method2442() * 5;
        } else if (arg1 == 115) {
            this.field985 = arg0.method2441();
        }
    }

    @ObfuscatedName("al.e(Lal;Lal;I)V")
    public void method842(class40 arg0, class40 arg1) {
        this.field1022 = arg0.field1022;
        this.field991 = arg0.field991;
        this.field992 = arg0.field992;
        this.field981 = arg0.field981;
        this.field997 = arg0.field997;
        this.field1021 = arg0.field1021;
        this.field996 = arg0.field996;
        this.field987 = arg0.field987;
        this.field988 = arg0.field988;
        this.field989 = arg0.field989;
        this.field990 = arg0.field990;
        this.field986 = arg1.field986;
        this.field999 = arg1.field999;
        this.field998 = arg1.field998;
        this.field1000 = 1;
    }

    @ObfuscatedName("al.d(IB)Lco;")
    public final class101 method818(int arg0) {
        if (this.field978 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1015[var3] && this.field1015[var3] != 0) {
                    var2 = this.field978[var3];
                }
            }
            if (var2 != -1) {
                return method789(var2).method818(1);
            }
        }
        class101 var4 = class101.method2115(Statics.field979, this.field1022, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1018 != 128 || this.field993 != 128 || this.field1020 != 128) {
            var4.method2105(this.field1018, this.field993, this.field1020);
        }
        if (this.field987 != null) {
            for (int var5 = 0; var5 < this.field987.length; var5++) {
                var4.method2062(this.field987[var5], this.field988[var5]);
            }
        }
        if (this.field989 != null) {
            for (int var6 = 0; var6 < this.field989.length; var6++) {
                var4.method2063(this.field989[var6], this.field990[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("al.y(II)Ldt;")
    public final class112 method819(int arg0) {
        if (this.field978 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1015[var3] && this.field1015[var3] != 0) {
                    var2 = this.field978[var3];
                }
            }
            if (var2 != -1) {
                return method789(var2).method819(1);
            }
        }
        class112 var4 = (class112) field982.method3264((long) this.field984);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2115(Statics.field979, this.field1022, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1018 != 128 || this.field993 != 128 || this.field1020 != 128) {
            var5.method2105(this.field1018, this.field993, this.field1020);
        }
        if (this.field987 != null) {
            for (int var6 = 0; var6 < this.field987.length; var6++) {
                var5.method2062(this.field987[var6], this.field988[var6]);
            }
        }
        if (this.field989 != null) {
            for (int var7 = 0; var7 < this.field989.length; var7++) {
                var5.method2063(this.field989[var7], this.field990[var7]);
            }
        }
        class112 var8 = var5.method2073(this.field995 + 64, this.field1009 + 768, -50, -10, -50);
        var8.field1864 = true;
        field982.method3257(var8, (long) this.field984);
        return var8;
    }

    @ObfuscatedName("al.x(II)Lal;")
    public class40 method820(int arg0) {
        if (this.field978 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1015[var3] && this.field1015[var3] != 0) {
                    var2 = this.field978[var3];
                }
            }
            if (var2 != -1) {
                return method789(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ew.t(IIIIZI)Lci;")
    public static final class86 method2942(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field983.method3264(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method789(arg0);
        if (arg1 > 1 && var8.field978 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1015[var10] && var8.field1015[var10] != 0) {
                    var9 = var8.field978[var10];
                }
            }
            if (var9 != -1) {
                var8 = method789(var9);
            }
        }
        class112 var11 = var8.method819(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1017 != -1) {
            var12 = method2942(var8.field1010, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1471;
        int var14 = Statics.field1467;
        int var15 = Statics.field1468;
        int[] var16 = new int[4];
        class89.method1783(var16);
        class86 var17 = new class86(36, 32);
        class89.method1779(var17.field1446, 36, 32);
        class89.method1835();
        class104.method2161();
        class104.method2136(16, 16);
        class104.field1744 = false;
        int var18 = var8.field991;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1749[var8.field992] * var18 >> 16;
        int var20 = class104.field1754[var8.field992] * var18 >> 16;
        var11.method2307();
        var11.method2305(0, var8.field981, var8.field997, var8.field992, var8.field1021, var8.field996 + var11.field1533 / 2 + var19, var8.field996 + var20);
        if (arg2 >= 1) {
            var17.method1679(1);
        }
        if (arg2 >= 2) {
            var17.method1679(16777215);
        }
        if (arg3 != 0) {
            var17.method1680(arg3);
        }
        class89.method1779(var17.field1446, 36, 32);
        if (var8.field1017 != -1) {
            var12.method1684(0, 0);
        }
        if (!arg4 && (var8.field1000 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field362.method3409(method1363(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field983.method3257(var17, var5);
        }
        class89.method1779(var13, var14, var15);
        class89.method1784(var16);
        class104.method2161();
        class104.field1744 = true;
        return var17;
    }

    @ObfuscatedName("bi.i(II)Ljava/lang/String;")
    public static final String method1363(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class134.field2266 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class134.field2224 + "</col>";
        }
    }

    @ObfuscatedName("al.z(ZI)Z")
    public final boolean method821(boolean arg0) {
        int var2 = this.field1002;
        int var3 = this.field1003;
        int var4 = this.field1008;
        if (arg0) {
            var2 = this.field1005;
            var3 = this.field1001;
            var4 = this.field1019;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field979.method2959(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field979.method2959(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field979.method2959(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("al.o(ZI)Lco;")
    public final class101 method822(boolean arg0) {
        int var2 = this.field1002;
        int var3 = this.field1003;
        int var4 = this.field1008;
        if (arg0) {
            var2 = this.field1005;
            var3 = this.field1001;
            var4 = this.field1019;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2115(Statics.field979, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2115(Statics.field979, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2115(Statics.field979, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1004 != 0) {
            var5.method2128(0, this.field1004, 0);
        }
        if (arg0 && this.field1007 != 0) {
            var5.method2128(0, this.field1007, 0);
        }
        if (this.field987 != null) {
            for (int var10 = 0; var10 < this.field987.length; var10++) {
                var5.method2062(this.field987[var10], this.field988[var10]);
            }
        }
        if (this.field989 != null) {
            for (int var11 = 0; var11 < this.field989.length; var11++) {
                var5.method2063(this.field989[var11], this.field990[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("al.u(ZI)Z")
    public final boolean method854(boolean arg0) {
        int var2 = this.field994;
        int var3 = this.field1011;
        if (arg0) {
            var2 = this.field1012;
            var3 = this.field1013;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field979.method2959(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field979.method2959(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("al.f(ZI)Lco;")
    public final class101 method824(boolean arg0) {
        int var2 = this.field994;
        int var3 = this.field1011;
        if (arg0) {
            var2 = this.field1012;
            var3 = this.field1013;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2115(Statics.field979, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2115(Statics.field979, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field987 != null) {
            for (int var7 = 0; var7 < this.field987.length; var7++) {
                var4.method2062(this.field987[var7], this.field988[var7]);
            }
        }
        if (this.field989 != null) {
            for (int var8 = 0; var8 < this.field989.length; var8++) {
                var4.method2063(this.field989[var8], this.field990[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("d.k(B)V")
    public static void method48() {
        field983.method3258();
    }
}
