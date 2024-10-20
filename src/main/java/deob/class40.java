package deob;

@ObfuscatedName("ah")
public class class40 extends class174 {

    @ObfuscatedName("ah.l")
    public static class170 field990 = new class170(64);

    @ObfuscatedName("ah.q")
    public static class170 field991 = new class170(50);

    @ObfuscatedName("ah.b")
    public static class170 field992 = new class170(100);

    @ObfuscatedName("ah.d")
    public int field994;

    @ObfuscatedName("ah.m")
    public int field1019;

    @ObfuscatedName("ah.v")
    public String field996 = "null";

    @ObfuscatedName("ah.j")
    public short[] field997;

    @ObfuscatedName("ah.f")
    public short[] field998;

    @ObfuscatedName("ah.h")
    public short[] field1020;

    @ObfuscatedName("ah.o")
    public short[] field1000;

    @ObfuscatedName("ah.z")
    public int field1026 = 2000;

    @ObfuscatedName("ah.k")
    public int field1002 = 0;

    @ObfuscatedName("ah.y")
    public int field1003 = 0;

    @ObfuscatedName("ah.g")
    public int field1030 = 0;

    @ObfuscatedName("ah.e")
    public int field1005 = 0;

    @ObfuscatedName("ah.s")
    public int field1006 = 0;

    @ObfuscatedName("ah.t")
    public int field1007 = 0;

    @ObfuscatedName("ah.r")
    public int field1010 = 1;

    @ObfuscatedName("ah.w")
    public boolean field1009 = false;

    @ObfuscatedName("ah.x")
    public String[] field1015 = new String[] { null, null, class134.field2087, null, null };

    @ObfuscatedName("ah.n")
    public String[] field1011 = new String[] { null, null, null, null, class134.field2213 };

    @ObfuscatedName("ah.c")
    public int field1012 = -1;

    @ObfuscatedName("ah.az")
    public int field1013 = -1;

    @ObfuscatedName("ah.ax")
    public int field1014 = 0;

    @ObfuscatedName("ah.aq")
    public int field1004 = -1;

    @ObfuscatedName("ah.ap")
    public int field1001 = -1;

    @ObfuscatedName("ah.aa")
    public int field1017 = 0;

    @ObfuscatedName("ah.ai")
    public int field1018 = -1;

    @ObfuscatedName("ah.ar")
    public int field1008 = -1;

    @ObfuscatedName("ah.ag")
    public int field993 = -1;

    @ObfuscatedName("ah.as")
    public int field1024 = -1;

    @ObfuscatedName("ah.ak")
    public int field1022 = -1;

    @ObfuscatedName("ah.al")
    public int field1021 = -1;

    @ObfuscatedName("ah.am")
    public int[] field1023;

    @ObfuscatedName("ah.ao")
    public int[] field1025;

    @ObfuscatedName("ah.ah")
    public int field995 = -1;

    @ObfuscatedName("ah.aw")
    public int field1033 = -1;

    @ObfuscatedName("ah.av")
    public int field1028 = 128;

    @ObfuscatedName("ah.au")
    public int field1029 = 128;

    @ObfuscatedName("ah.af")
    public int field988 = 128;

    @ObfuscatedName("ah.ab")
    public int field1031 = 0;

    @ObfuscatedName("ah.aj")
    public int field1032 = 0;

    @ObfuscatedName("ah.ac")
    public int field999 = 0;

    @ObfuscatedName("cx.i(Lef;Lef;ZLgi;I)V")
    public static void method1975(class152 arg0, class152 arg1, boolean arg2, class183 arg3) {
        Statics.field1027 = arg0;
        Statics.field1276 = arg1;
        Statics.field989 = arg2;
        Statics.field1027.method2945(10);
        Statics.field1016 = arg3;
    }

    @ObfuscatedName("q.p(II)Lah;")
    public static class40 method44(int arg0) {
        class40 var1 = (class40) field990.method3223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1027.method2932(10, arg0);
        class40 var3 = new class40();
        var3.field994 = arg0;
        if (var2 != null) {
            var3.method813(new class127(var2));
        }
        var3.method832();
        if (var3.field1033 != -1) {
            var3.method815(method44(var3.field1033), method44(var3.field995));
        }
        if (!Statics.field989 && var3.field1009) {
            var3.field996 = class134.field2124;
            var3.field1015 = null;
            var3.field1011 = null;
            var3.field999 = 0;
        }
        field990.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.a(I)V")
    public void method832() {
    }

    @ObfuscatedName("ah.l(Ldn;S)V")
    public void method813(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method842(arg0, var2);
        }
    }

    @ObfuscatedName("ah.q(Ldn;II)V")
    public void method842(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1019 = arg0.method2413();
        } else if (arg1 == 2) {
            this.field996 = arg0.method2419();
        } else if (arg1 == 4) {
            this.field1026 = arg0.method2413();
        } else if (arg1 == 5) {
            this.field1002 = arg0.method2413();
        } else if (arg1 == 6) {
            this.field1003 = arg0.method2413();
        } else if (arg1 == 7) {
            this.field1005 = arg0.method2413();
            if (this.field1005 > 32767) {
                this.field1005 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1006 = arg0.method2413();
            if (this.field1006 > 32767) {
                this.field1006 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1007 = 1;
        } else if (arg1 == 12) {
            this.field1010 = arg0.method2416();
        } else if (arg1 == 16) {
            this.field1009 = true;
        } else if (arg1 == 23) {
            this.field1012 = arg0.method2413();
            this.field1014 = arg0.method2411();
        } else if (arg1 == 24) {
            this.field1013 = arg0.method2413();
        } else if (arg1 == 25) {
            this.field1004 = arg0.method2413();
            this.field1017 = arg0.method2411();
        } else if (arg1 == 26) {
            this.field1001 = arg0.method2413();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1015[arg1 - 30] = arg0.method2419();
            if (this.field1015[arg1 - 30].equalsIgnoreCase(class134.field2089)) {
                this.field1015[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1011[arg1 - 35] = arg0.method2419();
        } else if (arg1 == 40) {
            int var3 = arg0.method2411();
            this.field997 = new short[var3];
            this.field998 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field997[var4] = (short) arg0.method2413();
                this.field998[var4] = (short) arg0.method2413();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2411();
            this.field1020 = new short[var5];
            this.field1000 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1020[var6] = (short) arg0.method2413();
                this.field1000[var6] = (short) arg0.method2413();
            }
        } else if (arg1 == 78) {
            this.field1018 = arg0.method2413();
        } else if (arg1 == 79) {
            this.field1008 = arg0.method2413();
        } else if (arg1 == 90) {
            this.field993 = arg0.method2413();
        } else if (arg1 == 91) {
            this.field1022 = arg0.method2413();
        } else if (arg1 == 92) {
            this.field1024 = arg0.method2413();
        } else if (arg1 == 93) {
            this.field1021 = arg0.method2413();
        } else if (arg1 == 95) {
            this.field1030 = arg0.method2413();
        } else if (arg1 == 97) {
            this.field995 = arg0.method2413();
        } else if (arg1 == 98) {
            this.field1033 = arg0.method2413();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1023 == null) {
                this.field1023 = new int[10];
                this.field1025 = new int[10];
            }
            this.field1023[arg1 - 100] = arg0.method2413();
            this.field1025[arg1 - 100] = arg0.method2413();
        } else if (arg1 == 110) {
            this.field1028 = arg0.method2413();
        } else if (arg1 == 111) {
            this.field1029 = arg0.method2413();
        } else if (arg1 == 112) {
            this.field988 = arg0.method2413();
        } else if (arg1 == 113) {
            this.field1031 = arg0.method2475();
        } else if (arg1 == 114) {
            this.field1032 = arg0.method2475();
        } else if (arg1 == 115) {
            this.field999 = arg0.method2411();
        }
    }

    @ObfuscatedName("ah.b(Lah;Lah;I)V")
    public void method815(class40 arg0, class40 arg1) {
        this.field1019 = arg0.field1019;
        this.field1026 = arg0.field1026;
        this.field1002 = arg0.field1002;
        this.field1003 = arg0.field1003;
        this.field1030 = arg0.field1030;
        this.field1005 = arg0.field1005;
        this.field1006 = arg0.field1006;
        this.field997 = arg0.field997;
        this.field998 = arg0.field998;
        this.field1020 = arg0.field1020;
        this.field1000 = arg0.field1000;
        this.field996 = arg1.field996;
        this.field1009 = arg1.field1009;
        this.field1010 = arg1.field1010;
        this.field1007 = 1;
    }

    @ObfuscatedName("ah.u(IS)Lcm;")
    public final class101 method816(int arg0) {
        if (this.field1023 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1025[var3] && this.field1025[var3] != 0) {
                    var2 = this.field1023[var3];
                }
            }
            if (var2 != -1) {
                return method44(var2).method816(1);
            }
        }
        class101 var4 = class101.method2035(Statics.field1276, this.field1019, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1028 != 128 || this.field1029 != 128 || this.field988 != 128) {
            var4.method2018(this.field1028, this.field1029, this.field988);
        }
        if (this.field997 != null) {
            for (int var5 = 0; var5 < this.field997.length; var5++) {
                var4.method1999(this.field997[var5], this.field998[var5]);
            }
        }
        if (this.field1020 != null) {
            for (int var6 = 0; var6 < this.field1020.length; var6++) {
                var4.method2029(this.field1020[var6], this.field1000[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ah.d(II)Ldc;")
    public final class112 method817(int arg0) {
        if (this.field1023 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1025[var3] && this.field1025[var3] != 0) {
                    var2 = this.field1023[var3];
                }
            }
            if (var2 != -1) {
                return method44(var2).method817(1);
            }
        }
        class112 var4 = (class112) field991.method3223((long) this.field994);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2035(Statics.field1276, this.field1019, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1028 != 128 || this.field1029 != 128 || this.field988 != 128) {
            var5.method2018(this.field1028, this.field1029, this.field988);
        }
        if (this.field997 != null) {
            for (int var6 = 0; var6 < this.field997.length; var6++) {
                var5.method1999(this.field997[var6], this.field998[var6]);
            }
        }
        if (this.field1020 != null) {
            for (int var7 = 0; var7 < this.field1020.length; var7++) {
                var5.method2029(this.field1020[var7], this.field1000[var7]);
            }
        }
        class112 var8 = var5.method2006(this.field1031 + 64, this.field1032 * 5 + 768, -50, -10, -50);
        var8.field1892 = true;
        field991.method3225(var8, (long) this.field994);
        return var8;
    }

    @ObfuscatedName("ah.m(II)Lah;")
    public class40 method812(int arg0) {
        if (this.field1023 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1025[var3] && this.field1025[var3] != 0) {
                    var2 = this.field1023[var3];
                }
            }
            if (var2 != -1) {
                return method44(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("p.v(IIIIZI)Lcq;")
    public static final class86 method6(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field992.method3223(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method44(arg0);
        if (arg1 > 1 && var8.field1023 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1025[var10] && var8.field1025[var10] != 0) {
                    var9 = var8.field1023[var10];
                }
            }
            if (var9 != -1) {
                var8 = method44(var9);
            }
        }
        class112 var11 = var8.method817(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1033 != -1) {
            var12 = method6(var8.field995, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1496;
        int var14 = Statics.field1501;
        int var15 = Statics.field1498;
        int[] var16 = new int[4];
        class89.method1716(var16);
        class86 var17 = new class86(36, 32);
        class89.method1720(var17.field1482, 36, 32);
        class89.method1711();
        class104.method2062();
        class104.method2065(16, 16);
        class104.field1779 = false;
        int var18 = var8.field1026;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1789[var8.field1002] * var18 >> 16;
        int var20 = class104.field1781[var8.field1002] * var18 >> 16;
        var11.method2174();
        var11.method2186(0, var8.field1003, var8.field1030, var8.field1002, var8.field1005, var8.field1006 + var11.field1556 / 2 + var19, var8.field1006 + var20);
        if (arg2 >= 1) {
            var17.method1622(1);
        }
        if (arg2 >= 2) {
            var17.method1622(16777215);
        }
        if (arg3 != 0) {
            var17.method1623(arg3);
        }
        class89.method1720(var17.field1482, 36, 32);
        if (var8.field1033 != -1) {
            var12.method1626(0, 0);
        }
        if (!arg4 && (var8.field1007 == 1 || arg1 != 1) && arg1 != -1) {
            class183 var21 = Statics.field1016;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class134.field2241 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class134.field2116 + "</col>";
            }
            var21.method3351(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field992.method3225(var17, var5);
        }
        class89.method1720(var13, var14, var15);
        class89.method1715(var16);
        class104.method2062();
        class104.field1779 = true;
        return var17;
    }

    @ObfuscatedName("ah.j(ZI)Z")
    public final boolean method819(boolean arg0) {
        int var2 = this.field1012;
        int var3 = this.field1013;
        int var4 = this.field1018;
        if (arg0) {
            var2 = this.field1004;
            var3 = this.field1001;
            var4 = this.field1008;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1276.method2937(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1276.method2937(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1276.method2937(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ah.f(ZB)Lcm;")
    public final class101 method856(boolean arg0) {
        int var2 = this.field1012;
        int var3 = this.field1013;
        int var4 = this.field1018;
        if (arg0) {
            var2 = this.field1004;
            var3 = this.field1001;
            var4 = this.field1008;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2035(Statics.field1276, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2035(Statics.field1276, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2035(Statics.field1276, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1014 != 0) {
            var5.method1983(0, this.field1014, 0);
        }
        if (arg0 && this.field1017 != 0) {
            var5.method1983(0, this.field1017, 0);
        }
        if (this.field997 != null) {
            for (int var10 = 0; var10 < this.field997.length; var10++) {
                var5.method1999(this.field997[var10], this.field998[var10]);
            }
        }
        if (this.field1020 != null) {
            for (int var11 = 0; var11 < this.field1020.length; var11++) {
                var5.method2029(this.field1020[var11], this.field1000[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ah.h(ZI)Z")
    public final boolean method821(boolean arg0) {
        int var2 = this.field993;
        int var3 = this.field1024;
        if (arg0) {
            var2 = this.field1022;
            var3 = this.field1021;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1276.method2937(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1276.method2937(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ah.o(ZB)Lcm;")
    public final class101 method822(boolean arg0) {
        int var2 = this.field993;
        int var3 = this.field1024;
        if (arg0) {
            var2 = this.field1022;
            var3 = this.field1021;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2035(Statics.field1276, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2035(Statics.field1276, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field997 != null) {
            for (int var7 = 0; var7 < this.field997.length; var7++) {
                var4.method1999(this.field997[var7], this.field998[var7]);
            }
        }
        if (this.field1020 != null) {
            for (int var8 = 0; var8 < this.field1020.length; var8++) {
                var4.method2029(this.field1020[var8], this.field1000[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("a.z(I)V")
    public static void method16() {
        field992.method3226();
    }
}
