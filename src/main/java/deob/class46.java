package deob;

@ObfuscatedName("ay")
public class class46 extends class185 {

    @ObfuscatedName("ay.f")
    public static class174 field1006 = new class174(64);

    @ObfuscatedName("ay.t")
    public static class174 field1010 = new class174(50);

    @ObfuscatedName("ay.n")
    public static class174 field1009 = new class174(100);

    @ObfuscatedName("ay.a")
    public int field1004;

    @ObfuscatedName("ay.o")
    public int field1026;

    @ObfuscatedName("ay.b")
    public String field1014 = "null";

    @ObfuscatedName("ay.r")
    public short[] field1051;

    @ObfuscatedName("ay.z")
    public short[] field1013;

    @ObfuscatedName("ay.u")
    public short[] field1008;

    @ObfuscatedName("ay.s")
    public short[] field1015;

    @ObfuscatedName("ay.i")
    public int field1012 = 2000;

    @ObfuscatedName("ay.e")
    public int field1017 = 0;

    @ObfuscatedName("ay.h")
    public int field1018 = 0;

    @ObfuscatedName("ay.k")
    public int field1019 = 0;

    @ObfuscatedName("ay.v")
    public int field1020 = 0;

    @ObfuscatedName("ay.m")
    public int field1021 = 0;

    @ObfuscatedName("ay.d")
    public int field1022 = 0;

    @ObfuscatedName("ay.q")
    public int field1023 = 1;

    @ObfuscatedName("ay.ak")
    public boolean field1024 = false;

    @ObfuscatedName("ay.ah")
    public String[] field1025 = new String[] { null, null, class145.field2138, null, null };

    @ObfuscatedName("ay.an")
    public String[] field1003 = new String[] { null, null, null, null, class145.field2234 };

    @ObfuscatedName("ay.aw")
    public int field1027 = -1;

    @ObfuscatedName("ay.az")
    public int field1028 = -1;

    @ObfuscatedName("ay.ad")
    public int field1029 = 0;

    @ObfuscatedName("ay.ag")
    public int field1030 = -1;

    @ObfuscatedName("ay.aa")
    public int field1046 = -1;

    @ObfuscatedName("ay.au")
    public int field1031 = 0;

    @ObfuscatedName("ay.aq")
    public int field1007 = -1;

    @ObfuscatedName("ay.am")
    public int field1034 = -1;

    @ObfuscatedName("ay.ax")
    public int field1035 = -1;

    @ObfuscatedName("ay.af")
    public int field1036 = -1;

    @ObfuscatedName("ay.av")
    public int field1042 = -1;

    @ObfuscatedName("ay.ao")
    public int field1038 = -1;

    @ObfuscatedName("ay.al")
    public int[] field1039;

    @ObfuscatedName("ay.aj")
    public int[] field1040;

    @ObfuscatedName("ay.ae")
    public int field1033 = -1;

    @ObfuscatedName("ay.ai")
    public int field1016 = -1;

    @ObfuscatedName("ay.ay")
    public int field1043 = 128;

    @ObfuscatedName("ay.ab")
    public int field1044 = 128;

    @ObfuscatedName("ay.ar")
    public int field1032 = 128;

    @ObfuscatedName("ay.as")
    public int field1001 = 0;

    @ObfuscatedName("ay.at")
    public int field1047 = 0;

    @ObfuscatedName("ay.ac")
    public int field1048 = 0;

    @ObfuscatedName("ay.ap")
    public boolean field1045 = false;

    @ObfuscatedName("s.l(Leo;Leo;ZLgx;I)V")
    public static void method456(class149 arg0, class149 arg1, boolean arg2, class205 arg3) {
        Statics.field1037 = arg0;
        Statics.field1745 = arg1;
        Statics.field1011 = arg2;
        Statics.field1005 = Statics.field1037.method2799(10);
        Statics.field1930 = arg3;
    }

    @ObfuscatedName("p.y(II)Lay;")
    public static class46 method137(int arg0) {
        class46 var1 = (class46) field1006.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1037.method2752(10, arg0);
        class46 var3 = new class46();
        var3.field1004 = arg0;
        if (var2 != null) {
            var3.method846(new class108(var2));
        }
        var3.method845();
        if (var3.field1016 != -1) {
            var3.method848(method137(var3.field1016), method137(var3.field1033));
        }
        if (!Statics.field1011 && var3.field1024) {
            var3.field1014 = class145.field2224;
            var3.field1045 = false;
            var3.field1025 = null;
            var3.field1003 = null;
            var3.field1048 = 0;
        }
        field1006.method3211(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.g(I)V")
    public void method845() {
    }

    @ObfuscatedName("ay.j(Ldk;I)V")
    public void method846(class108 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method847(arg0, var2);
        }
    }

    @ObfuscatedName("ay.w(Ldk;IB)V")
    public void method847(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1026 = arg0.method2163();
        } else if (arg1 == 2) {
            this.field1014 = arg0.method2168();
        } else if (arg1 == 4) {
            this.field1012 = arg0.method2163();
        } else if (arg1 == 5) {
            this.field1017 = arg0.method2163();
        } else if (arg1 == 6) {
            this.field1018 = arg0.method2163();
        } else if (arg1 == 7) {
            this.field1020 = arg0.method2163();
            if (this.field1020 > 32767) {
                this.field1020 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1021 = arg0.method2163();
            if (this.field1021 > 32767) {
                this.field1021 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1022 = 1;
        } else if (arg1 == 12) {
            this.field1023 = arg0.method2297();
        } else if (arg1 == 16) {
            this.field1024 = true;
        } else if (arg1 == 23) {
            this.field1027 = arg0.method2163();
            this.field1029 = arg0.method2291();
        } else if (arg1 == 24) {
            this.field1028 = arg0.method2163();
        } else if (arg1 == 25) {
            this.field1030 = arg0.method2163();
            this.field1031 = arg0.method2291();
        } else if (arg1 == 26) {
            this.field1046 = arg0.method2163();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1025[arg1 - 30] = arg0.method2168();
            if (this.field1025[arg1 - 30].equalsIgnoreCase(class145.field2140)) {
                this.field1025[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1003[arg1 - 35] = arg0.method2168();
        } else if (arg1 == 40) {
            int var3 = arg0.method2291();
            this.field1051 = new short[var3];
            this.field1013 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1051[var4] = (short) arg0.method2163();
                this.field1013[var4] = (short) arg0.method2163();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2291();
            this.field1008 = new short[var5];
            this.field1015 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1008[var6] = (short) arg0.method2163();
                this.field1015[var6] = (short) arg0.method2163();
            }
        } else if (arg1 == 65) {
            this.field1045 = true;
        } else if (arg1 == 78) {
            this.field1007 = arg0.method2163();
        } else if (arg1 == 79) {
            this.field1034 = arg0.method2163();
        } else if (arg1 == 90) {
            this.field1035 = arg0.method2163();
        } else if (arg1 == 91) {
            this.field1042 = arg0.method2163();
        } else if (arg1 == 92) {
            this.field1036 = arg0.method2163();
        } else if (arg1 == 93) {
            this.field1038 = arg0.method2163();
        } else if (arg1 == 95) {
            this.field1019 = arg0.method2163();
        } else if (arg1 == 97) {
            this.field1033 = arg0.method2163();
        } else if (arg1 == 98) {
            this.field1016 = arg0.method2163();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1039 == null) {
                this.field1039 = new int[10];
                this.field1040 = new int[10];
            }
            this.field1039[arg1 - 100] = arg0.method2163();
            this.field1040[arg1 - 100] = arg0.method2163();
        } else if (arg1 == 110) {
            this.field1043 = arg0.method2163();
        } else if (arg1 == 111) {
            this.field1044 = arg0.method2163();
        } else if (arg1 == 112) {
            this.field1032 = arg0.method2163();
        } else if (arg1 == 113) {
            this.field1001 = arg0.method2292();
        } else if (arg1 == 114) {
            this.field1047 = arg0.method2292();
        } else if (arg1 == 115) {
            this.field1048 = arg0.method2291();
        }
    }

    @ObfuscatedName("ay.c(Lay;Lay;B)V")
    public void method848(class46 arg0, class46 arg1) {
        this.field1026 = arg0.field1026;
        this.field1012 = arg0.field1012;
        this.field1017 = arg0.field1017;
        this.field1018 = arg0.field1018;
        this.field1019 = arg0.field1019;
        this.field1020 = arg0.field1020;
        this.field1021 = arg0.field1021;
        this.field1051 = arg0.field1051;
        this.field1013 = arg0.field1013;
        this.field1008 = arg0.field1008;
        this.field1015 = arg0.field1015;
        this.field1014 = arg1.field1014;
        this.field1024 = arg1.field1024;
        this.field1023 = arg1.field1023;
        this.field1022 = 1;
    }

    @ObfuscatedName("ay.x(IB)Lcm;")
    public final class94 method890(int arg0) {
        if (this.field1039 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1040[var3] && this.field1040[var3] != 0) {
                    var2 = this.field1039[var3];
                }
            }
            if (var2 != -1) {
                return method137(var2).method890(1);
            }
        }
        class94 var4 = class94.method1902(Statics.field1745, this.field1026, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1043 != 128 || this.field1044 != 128 || this.field1032 != 128) {
            var4.method1894(this.field1043, this.field1044, this.field1032);
        }
        if (this.field1051 != null) {
            for (int var5 = 0; var5 < this.field1051.length; var5++) {
                var4.method1908(this.field1051[var5], this.field1013[var5]);
            }
        }
        if (this.field1008 != null) {
            for (int var6 = 0; var6 < this.field1008.length; var6++) {
                var4.method1899(this.field1008[var6], this.field1015[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ay.f(II)Lck;")
    public final class99 method850(int arg0) {
        if (this.field1039 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1040[var3] && this.field1040[var3] != 0) {
                    var2 = this.field1039[var3];
                }
            }
            if (var2 != -1) {
                return method137(var2).method850(1);
            }
        }
        class99 var4 = (class99) field1010.method3225((long) this.field1004);
        if (var4 != null) {
            return var4;
        }
        class94 var5 = class94.method1902(Statics.field1745, this.field1026, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1043 != 128 || this.field1044 != 128 || this.field1032 != 128) {
            var5.method1894(this.field1043, this.field1044, this.field1032);
        }
        if (this.field1051 != null) {
            for (int var6 = 0; var6 < this.field1051.length; var6++) {
                var5.method1908(this.field1051[var6], this.field1013[var6]);
            }
        }
        if (this.field1008 != null) {
            for (int var7 = 0; var7 < this.field1008.length; var7++) {
                var5.method1899(this.field1008[var7], this.field1015[var7]);
            }
        }
        class99 var8 = var5.method1915(this.field1001 + 64, this.field1047 * 5 + 768, -50, -10, -50);
        var8.field1703 = true;
        field1010.method3211(var8, (long) this.field1004);
        return var8;
    }

    @ObfuscatedName("ay.t(II)Lay;")
    public class46 method851(int arg0) {
        if (this.field1039 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1040[var3] && this.field1040[var3] != 0) {
                    var2 = this.field1039[var3];
                }
            }
            if (var2 != -1) {
                return method137(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("m.n(IIIIIZI)Lbq;")
    public static final class73 method510(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class73 var8 = (class73) field1009.method3225(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class46 var9 = method137(arg0);
        if (arg1 > 1 && var9.field1039 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1040[var11] && var9.field1040[var11] != 0) {
                    var10 = var9.field1039[var11];
                }
            }
            if (var10 != -1) {
                var9 = method137(var10);
            }
        }
        class99 var12 = var9.method850(1);
        if (var12 == null) {
            return null;
        }
        class73 var13 = null;
        if (var9.field1016 != -1) {
            var13 = method510(var9.field1033, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1300;
        int var15 = Statics.field1299;
        int var16 = Statics.field1303;
        int[] var17 = new int[4];
        class74.method1558(var17);
        class73 var18 = new class73(36, 32);
        class74.method1554(var18.field1286, 36, 32);
        class74.method1533();
        class85.method1787();
        class85.method1790(16, 16);
        class85.field1448 = false;
        int var19 = var9.field1012;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1468[var9.field1017] * var19 >> 16;
        int var21 = class85.field1469[var9.field1017] * var19 >> 16;
        var12.method2064();
        var12.method2075(0, var9.field1018, var9.field1019, var9.field1017, var9.field1020, var9.field1021 + var12.field1340 / 2 + var20, var9.field1021 + var21);
        if (arg2 >= 1) {
            var18.method1459(1);
        }
        if (arg2 >= 2) {
            var18.method1459(16777215);
        }
        if (arg3 != 0) {
            var18.method1439(arg3);
        }
        class74.method1554(var18.field1286, 36, 32);
        if (var9.field1016 != -1) {
            var13.method1501(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1022 == 1) {
            Statics.field1930.method3505(method132(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1009.method3211(var18, var6);
        }
        class74.method1554(var14, var15, var16);
        class74.method1532(var17);
        class85.method1787();
        class85.field1448 = true;
        return var18;
    }

    @ObfuscatedName("n.p(II)Ljava/lang/String;")
    public static final String method132(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class145.field2295 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class145.field2250 + "</col>";
        }
    }

    @ObfuscatedName("ay.a(ZI)Z")
    public final boolean method852(boolean arg0) {
        int var2 = this.field1027;
        int var3 = this.field1028;
        int var4 = this.field1007;
        if (arg0) {
            var2 = this.field1030;
            var3 = this.field1046;
            var4 = this.field1034;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1745.method2783(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1745.method2783(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1745.method2783(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ay.o(ZB)Lcm;")
    public final class94 method853(boolean arg0) {
        int var2 = this.field1027;
        int var3 = this.field1028;
        int var4 = this.field1007;
        if (arg0) {
            var2 = this.field1030;
            var3 = this.field1046;
            var4 = this.field1034;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var5 = class94.method1902(Statics.field1745, var2, 0);
        if (var3 != -1) {
            class94 var6 = class94.method1902(Statics.field1745, var3, 0);
            if (var4 == -1) {
                class94[] var9 = new class94[] { var5, var6 };
                var5 = new class94(var9, 2);
            } else {
                class94 var7 = class94.method1902(Statics.field1745, var4, 0);
                class94[] var8 = new class94[] { var5, var6, var7 };
                var5 = new class94(var8, 3);
            }
        }
        if (!arg0 && this.field1029 != 0) {
            var5.method1907(0, this.field1029, 0);
        }
        if (arg0 && this.field1031 != 0) {
            var5.method1907(0, this.field1031, 0);
        }
        if (this.field1051 != null) {
            for (int var10 = 0; var10 < this.field1051.length; var10++) {
                var5.method1908(this.field1051[var10], this.field1013[var10]);
            }
        }
        if (this.field1008 != null) {
            for (int var11 = 0; var11 < this.field1008.length; var11++) {
                var5.method1899(this.field1008[var11], this.field1015[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ay.b(ZI)Z")
    public final boolean method854(boolean arg0) {
        int var2 = this.field1035;
        int var3 = this.field1036;
        if (arg0) {
            var2 = this.field1042;
            var3 = this.field1038;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1745.method2783(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1745.method2783(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ay.r(ZI)Lcm;")
    public final class94 method861(boolean arg0) {
        int var2 = this.field1035;
        int var3 = this.field1036;
        if (arg0) {
            var2 = this.field1042;
            var3 = this.field1038;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var4 = class94.method1902(Statics.field1745, var2, 0);
        if (var3 != -1) {
            class94 var5 = class94.method1902(Statics.field1745, var3, 0);
            class94[] var6 = new class94[] { var4, var5 };
            var4 = new class94(var6, 2);
        }
        if (this.field1051 != null) {
            for (int var7 = 0; var7 < this.field1051.length; var7++) {
                var4.method1908(this.field1051[var7], this.field1013[var7]);
            }
        }
        if (this.field1008 != null) {
            for (int var8 = 0; var8 < this.field1008.length; var8++) {
                var4.method1899(this.field1008[var8], this.field1015[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("f.z(I)V")
    public static void method105() {
        field1006.method3214();
        field1010.method3214();
        field1009.method3214();
    }

    @ObfuscatedName("o.u(I)V")
    public static void method147() {
        field1009.method3214();
    }
}
