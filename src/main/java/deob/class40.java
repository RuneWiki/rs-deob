package deob;

@ObfuscatedName("aq")
public class class40 extends class174 {

    @ObfuscatedName("aq.e")
    public static class170 field984 = new class170(64);

    @ObfuscatedName("aq.t")
    public static class170 field1025 = new class170(50);

    @ObfuscatedName("aq.d")
    public static class170 field1022 = new class170(100);

    @ObfuscatedName("aq.k")
    public int field987;

    @ObfuscatedName("aq.r")
    public int field988;

    @ObfuscatedName("aq.l")
    public String field989 = "null";

    @ObfuscatedName("aq.a")
    public short[] field990;

    @ObfuscatedName("aq.z")
    public short[] field1005;

    @ObfuscatedName("aq.s")
    public short[] field1026;

    @ObfuscatedName("aq.m")
    public short[] field993;

    @ObfuscatedName("aq.u")
    public int field994 = 2000;

    @ObfuscatedName("aq.g")
    public int field995 = 0;

    @ObfuscatedName("aq.o")
    public int field986 = 0;

    @ObfuscatedName("aq.v")
    public int field997 = 0;

    @ObfuscatedName("aq.j")
    public int field998 = 0;

    @ObfuscatedName("aq.n")
    public int field999 = 0;

    @ObfuscatedName("aq.q")
    public int field1000 = 0;

    @ObfuscatedName("aq.c")
    public int field996 = 1;

    @ObfuscatedName("aq.h")
    public boolean field1020 = false;

    @ObfuscatedName("aq.b")
    public String[] field1001 = new String[] { null, null, class134.field2102, null, null };

    @ObfuscatedName("aq.y")
    public String[] field1004 = new String[] { null, null, null, null, class134.field2216 };

    @ObfuscatedName("aq.x")
    public int field983 = -1;

    @ObfuscatedName("aq.ao")
    public int field992 = -1;

    @ObfuscatedName("aq.ae")
    public int field981 = 0;

    @ObfuscatedName("aq.aa")
    public int field1008 = -1;

    @ObfuscatedName("aq.ah")
    public int field1009 = -1;

    @ObfuscatedName("aq.aw")
    public int field1010 = 0;

    @ObfuscatedName("aq.an")
    public int field985 = -1;

    @ObfuscatedName("aq.av")
    public int field1012 = -1;

    @ObfuscatedName("aq.ak")
    public int field991 = -1;

    @ObfuscatedName("aq.ax")
    public int field1014 = -1;

    @ObfuscatedName("aq.ab")
    public int field1015 = -1;

    @ObfuscatedName("aq.af")
    public int field1003 = -1;

    @ObfuscatedName("aq.ai")
    public int[] field1017;

    @ObfuscatedName("aq.at")
    public int[] field1018;

    @ObfuscatedName("aq.aq")
    public int field1019 = -1;

    @ObfuscatedName("aq.ac")
    public int field1016 = -1;

    @ObfuscatedName("aq.al")
    public int field1021 = 128;

    @ObfuscatedName("aq.ag")
    public int field1006 = 128;

    @ObfuscatedName("aq.ap")
    public int field1023 = 128;

    @ObfuscatedName("aq.am")
    public int field1024 = 0;

    @ObfuscatedName("aq.as")
    public int field1002 = 0;

    @ObfuscatedName("aq.aj")
    public int field1007 = 0;

    @ObfuscatedName("ae.i(II)Laq;")
    public static class40 method548(int arg0) {
        class40 var1 = (class40) field984.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1013.method2970(10, arg0);
        class40 var3 = new class40();
        var3.field987 = arg0;
        if (var2 != null) {
            var3.method833(new class127(var2));
        }
        var3.method832();
        if (var3.field1016 != -1) {
            var3.method869(method548(var3.field1016), method548(var3.field1019));
        }
        if (!Statics.field1011 && var3.field1020) {
            var3.field989 = class134.field2249;
            var3.field1001 = null;
            var3.field1004 = null;
            var3.field1007 = 0;
        }
        field984.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.w(I)V")
    public void method832() {
    }

    @ObfuscatedName("aq.f(Ldz;I)V")
    public void method833(class127 arg0) {
        while (true) {
            int var2 = arg0.method2472();
            if (var2 == 0) {
                return;
            }
            this.method834(arg0, var2);
        }
    }

    @ObfuscatedName("aq.e(Ldz;IB)V")
    public void method834(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field988 = arg0.method2615();
        } else if (arg1 == 2) {
            this.field989 = arg0.method2460();
        } else if (arg1 == 4) {
            this.field994 = arg0.method2615();
        } else if (arg1 == 5) {
            this.field995 = arg0.method2615();
        } else if (arg1 == 6) {
            this.field986 = arg0.method2615();
        } else if (arg1 == 7) {
            this.field998 = arg0.method2615();
            if (this.field998 > 32767) {
                this.field998 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field999 = arg0.method2615();
            if (this.field999 > 32767) {
                this.field999 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1000 = 1;
        } else if (arg1 == 12) {
            this.field996 = arg0.method2457();
        } else if (arg1 == 16) {
            this.field1020 = true;
        } else if (arg1 == 23) {
            this.field983 = arg0.method2615();
            this.field981 = arg0.method2472();
        } else if (arg1 == 24) {
            this.field992 = arg0.method2615();
        } else if (arg1 == 25) {
            this.field1008 = arg0.method2615();
            this.field1010 = arg0.method2472();
        } else if (arg1 == 26) {
            this.field1009 = arg0.method2615();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1001[arg1 - 30] = arg0.method2460();
            if (this.field1001[arg1 - 30].equalsIgnoreCase(class134.field2123)) {
                this.field1001[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1004[arg1 - 35] = arg0.method2460();
        } else if (arg1 == 40) {
            int var3 = arg0.method2472();
            this.field990 = new short[var3];
            this.field1005 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field990[var4] = (short) arg0.method2615();
                this.field1005[var4] = (short) arg0.method2615();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2472();
            this.field1026 = new short[var5];
            this.field993 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1026[var6] = (short) arg0.method2615();
                this.field993[var6] = (short) arg0.method2615();
            }
        } else if (arg1 == 78) {
            this.field985 = arg0.method2615();
        } else if (arg1 == 79) {
            this.field1012 = arg0.method2615();
        } else if (arg1 == 90) {
            this.field991 = arg0.method2615();
        } else if (arg1 == 91) {
            this.field1015 = arg0.method2615();
        } else if (arg1 == 92) {
            this.field1014 = arg0.method2615();
        } else if (arg1 == 93) {
            this.field1003 = arg0.method2615();
        } else if (arg1 == 95) {
            this.field997 = arg0.method2615();
        } else if (arg1 == 97) {
            this.field1019 = arg0.method2615();
        } else if (arg1 == 98) {
            this.field1016 = arg0.method2615();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1017 == null) {
                this.field1017 = new int[10];
                this.field1018 = new int[10];
            }
            this.field1017[arg1 - 100] = arg0.method2615();
            this.field1018[arg1 - 100] = arg0.method2615();
        } else if (arg1 == 110) {
            this.field1021 = arg0.method2615();
        } else if (arg1 == 111) {
            this.field1006 = arg0.method2615();
        } else if (arg1 == 112) {
            this.field1023 = arg0.method2615();
        } else if (arg1 == 113) {
            this.field1024 = arg0.method2453();
        } else if (arg1 == 114) {
            this.field1002 = arg0.method2453();
        } else if (arg1 == 115) {
            this.field1007 = arg0.method2472();
        }
    }

    @ObfuscatedName("aq.t(Laq;Laq;I)V")
    public void method869(class40 arg0, class40 arg1) {
        this.field988 = arg0.field988;
        this.field994 = arg0.field994;
        this.field995 = arg0.field995;
        this.field986 = arg0.field986;
        this.field997 = arg0.field997;
        this.field998 = arg0.field998;
        this.field999 = arg0.field999;
        this.field990 = arg0.field990;
        this.field1005 = arg0.field1005;
        this.field1026 = arg0.field1026;
        this.field993 = arg0.field993;
        this.field989 = arg1.field989;
        this.field1020 = arg1.field1020;
        this.field996 = arg1.field996;
        this.field1000 = 1;
    }

    @ObfuscatedName("aq.d(II)Lco;")
    public final class101 method853(int arg0) {
        if (this.field1017 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1018[var3] && this.field1018[var3] != 0) {
                    var2 = this.field1017[var3];
                }
            }
            if (var2 != -1) {
                return method548(var2).method853(1);
            }
        }
        class101 var4 = class101.method2052(Statics.field982, this.field988, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1021 != 128 || this.field1006 != 128 || this.field1023 != 128) {
            var4.method2117(this.field1021, this.field1006, this.field1023);
        }
        if (this.field990 != null) {
            for (int var5 = 0; var5 < this.field990.length; var5++) {
                var4.method2064(this.field990[var5], this.field1005[var5]);
            }
        }
        if (this.field1026 != null) {
            for (int var6 = 0; var6 < this.field1026.length; var6++) {
                var4.method2066(this.field1026[var6], this.field993[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aq.p(II)Ldb;")
    public final class112 method863(int arg0) {
        if (this.field1017 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1018[var3] && this.field1018[var3] != 0) {
                    var2 = this.field1017[var3];
                }
            }
            if (var2 != -1) {
                return method548(var2).method863(1);
            }
        }
        class112 var4 = (class112) field1025.method3235((long) this.field987);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2052(Statics.field982, this.field988, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1021 != 128 || this.field1006 != 128 || this.field1023 != 128) {
            var5.method2117(this.field1021, this.field1006, this.field1023);
        }
        if (this.field990 != null) {
            for (int var6 = 0; var6 < this.field990.length; var6++) {
                var5.method2064(this.field990[var6], this.field1005[var6]);
            }
        }
        if (this.field1026 != null) {
            for (int var7 = 0; var7 < this.field1026.length; var7++) {
                var5.method2066(this.field1026[var7], this.field993[var7]);
            }
        }
        class112 var8 = var5.method2112(this.field1024 + 64, this.field1002 * 5 + 768, -50, -10, -50);
        var8.field1889 = true;
        field1025.method3234(var8, (long) this.field987);
        return var8;
    }

    @ObfuscatedName("aq.k(IB)Laq;")
    public class40 method838(int arg0) {
        if (this.field1017 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1018[var3] && this.field1018[var3] != 0) {
                    var2 = this.field1017[var3];
                }
            }
            if (var2 != -1) {
                return method548(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("bl.r(IIIIZB)Lcx;")
    public static final class86 method1523(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field1022.method3235(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method548(arg0);
        if (arg1 > 1 && var8.field1017 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1018[var10] && var8.field1018[var10] != 0) {
                    var9 = var8.field1017[var10];
                }
            }
            if (var9 != -1) {
                var8 = method548(var9);
            }
        }
        class112 var11 = var8.method863(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1016 != -1) {
            var12 = method1523(var8.field1019, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1484;
        int var14 = Statics.field1486;
        int var15 = Statics.field1485;
        int[] var16 = new int[4];
        class89.method1789(var16);
        class86 var17 = new class86(36, 32);
        class89.method1785(var17.field1471, 36, 32);
        class89.method1791();
        class104.method2182();
        class104.method2133(16, 16);
        class104.field1767 = false;
        int var18 = var8.field994;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1787[var8.field995] * var18 >> 16;
        int var20 = class104.field1788[var8.field995] * var18 >> 16;
        var11.method2244();
        var11.method2256(0, var8.field986, var8.field997, var8.field995, var8.field998, var8.field999 + var11.field1548 / 2 + var19, var8.field999 + var20);
        if (arg2 >= 1) {
            var17.method1678(1);
        }
        if (arg2 >= 2) {
            var17.method1678(16777215);
        }
        if (arg3 != 0) {
            var17.method1679(arg3);
        }
        class89.method1785(var17.field1471, 36, 32);
        if (var8.field1016 != -1) {
            var12.method1700(0, 0);
        }
        if (!arg4 && (var8.field1000 == 1 || arg1 != 1) && arg1 != -1) {
            class183 var21 = Statics.field189;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class134.field2246 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class134.field2160 + "</col>";
            }
            var21.method3385(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1022.method3234(var17, var5);
        }
        class89.method1785(var13, var14, var15);
        class89.method1790(var16);
        class104.method2182();
        class104.field1767 = true;
        return var17;
    }

    @ObfuscatedName("aq.l(ZB)Z")
    public final boolean method839(boolean arg0) {
        int var2 = this.field983;
        int var3 = this.field992;
        int var4 = this.field985;
        if (arg0) {
            var2 = this.field1008;
            var3 = this.field1009;
            var4 = this.field1012;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field982.method2972(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field982.method2972(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field982.method2972(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aq.a(ZI)Lco;")
    public final class101 method837(boolean arg0) {
        int var2 = this.field983;
        int var3 = this.field992;
        int var4 = this.field985;
        if (arg0) {
            var2 = this.field1008;
            var3 = this.field1009;
            var4 = this.field1012;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2052(Statics.field982, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2052(Statics.field982, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2052(Statics.field982, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field981 != 0) {
            var5.method2053(0, this.field981, 0);
        }
        if (arg0 && this.field1010 != 0) {
            var5.method2053(0, this.field1010, 0);
        }
        if (this.field990 != null) {
            for (int var10 = 0; var10 < this.field990.length; var10++) {
                var5.method2064(this.field990[var10], this.field1005[var10]);
            }
        }
        if (this.field1026 != null) {
            for (int var11 = 0; var11 < this.field1026.length; var11++) {
                var5.method2066(this.field1026[var11], this.field993[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aq.z(ZI)Z")
    public final boolean method841(boolean arg0) {
        int var2 = this.field991;
        int var3 = this.field1014;
        if (arg0) {
            var2 = this.field1015;
            var3 = this.field1003;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field982.method2972(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field982.method2972(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aq.s(ZI)Lco;")
    public final class101 method842(boolean arg0) {
        int var2 = this.field991;
        int var3 = this.field1014;
        if (arg0) {
            var2 = this.field1015;
            var3 = this.field1003;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2052(Statics.field982, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2052(Statics.field982, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field990 != null) {
            for (int var7 = 0; var7 < this.field990.length; var7++) {
                var4.method2064(this.field990[var7], this.field1005[var7]);
            }
        }
        if (this.field1026 != null) {
            for (int var8 = 0; var8 < this.field1026.length; var8++) {
                var4.method2066(this.field1026[var8], this.field993[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("o.m(ZI)V")
    public static void method168(boolean arg0) {
        if (Statics.field1011 != arg0) {
            field984.method3243();
            field1025.method3243();
            field1022.method3243();
            Statics.field1011 = arg0;
        }
    }
}
