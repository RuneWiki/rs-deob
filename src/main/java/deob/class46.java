package deob;

@ObfuscatedName("ap")
public class class46 extends class187 {

    @ObfuscatedName("ap.o")
    public static class176 field1054 = new class176(64);

    @ObfuscatedName("ap.g")
    public static class176 field1018 = new class176(50);

    @ObfuscatedName("ap.z")
    public static class176 field1019 = new class176(100);

    @ObfuscatedName("ap.y")
    public int field1020;

    @ObfuscatedName("ap.w")
    public int field1021;

    @ObfuscatedName("ap.x")
    public String field1012 = "null";

    @ObfuscatedName("ap.v")
    public short[] field1023;

    @ObfuscatedName("ap.q")
    public short[] field1030;

    @ObfuscatedName("ap.f")
    public short[] field1025;

    @ObfuscatedName("ap.s")
    public short[] field1026;

    @ObfuscatedName("ap.a")
    public int field1027 = 2000;

    @ObfuscatedName("ap.m")
    public int field1049 = 0;

    @ObfuscatedName("ap.c")
    public int field1029 = 0;

    @ObfuscatedName("ap.j")
    public int field1059 = 0;

    @ObfuscatedName("ap.d")
    public int field1013 = 0;

    @ObfuscatedName("ap.l")
    public int field1032 = 0;

    @ObfuscatedName("ap.u")
    public int field1022 = 0;

    @ObfuscatedName("ap.r")
    public int field1034 = 1;

    @ObfuscatedName("ap.an")
    public boolean field1035 = false;

    @ObfuscatedName("ap.ao")
    public String[] field1045 = new String[] { null, null, class147.field2176, null, null };

    @ObfuscatedName("ap.ah")
    public String[] field1046 = new String[] { null, null, null, null, class147.field2200 };

    @ObfuscatedName("ap.ai")
    public int field1038 = -1;

    @ObfuscatedName("ap.aa")
    public int field1039 = -1;

    @ObfuscatedName("ap.ag")
    public int field1040 = 0;

    @ObfuscatedName("ap.ar")
    public int field1017 = -1;

    @ObfuscatedName("ap.al")
    public int field1042 = -1;

    @ObfuscatedName("ap.ae")
    public int field1043 = 0;

    @ObfuscatedName("ap.ak")
    public int field1033 = -1;

    @ObfuscatedName("ap.at")
    public int field1037 = -1;

    @ObfuscatedName("ap.am")
    public int field1024 = -1;

    @ObfuscatedName("ap.aw")
    public int field1047 = -1;

    @ObfuscatedName("ap.as")
    public int field1048 = -1;

    @ObfuscatedName("ap.aq")
    public int field1060 = -1;

    @ObfuscatedName("ap.ac")
    public int[] field1050;

    @ObfuscatedName("ap.aj")
    public int[] field1051;

    @ObfuscatedName("ap.av")
    public int field1053 = -1;

    @ObfuscatedName("ap.ax")
    public int field1036 = -1;

    @ObfuscatedName("ap.ap")
    public int field1062 = 128;

    @ObfuscatedName("ap.af")
    public int field1055 = 128;

    @ObfuscatedName("ap.az")
    public int field1041 = 128;

    @ObfuscatedName("ap.ay")
    public int field1057 = 0;

    @ObfuscatedName("ap.au")
    public int field1058 = 0;

    @ObfuscatedName("ap.ab")
    public int field1052 = 0;

    @ObfuscatedName("ap.ad")
    public boolean field1028 = false;

    @ObfuscatedName("r.b(Lex;Lex;ZLgl;I)V")
    public static void method529(class151 arg0, class151 arg1, boolean arg2, class207 arg3) {
        Statics.field1014 = arg0;
        Statics.field72 = arg1;
        Statics.field1015 = arg2;
        Statics.field1016 = Statics.field1014.method2772(10);
        Statics.field2728 = arg3;
    }

    @ObfuscatedName("dx.e(II)Lap;")
    public static class46 method2398(int arg0) {
        class46 var1 = (class46) field1054.method3218((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1014.method2761(10, arg0);
        class46 var3 = new class46();
        var3.field1020 = arg0;
        if (var2 != null) {
            var3.method851(new class110(var2));
        }
        var3.method861();
        if (var3.field1036 != -1) {
            var3.method862(method2398(var3.field1036), method2398(var3.field1053));
        }
        if (!Statics.field1015 && var3.field1035) {
            var3.field1012 = class147.field2294;
            var3.field1028 = false;
            var3.field1045 = null;
            var3.field1046 = null;
            var3.field1052 = 0;
        }
        field1054.method3220(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.i(B)V")
    public void method861() {
    }

    @ObfuscatedName("ap.k(Ldc;I)V")
    public void method851(class110 arg0) {
        while (true) {
            int var2 = arg0.method2142();
            if (var2 == 0) {
                return;
            }
            this.method852(arg0, var2);
        }
    }

    @ObfuscatedName("ap.h(Ldc;II)V")
    public void method852(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1021 = arg0.method2292();
        } else if (arg1 == 2) {
            this.field1012 = arg0.method2150();
        } else if (arg1 == 4) {
            this.field1027 = arg0.method2292();
        } else if (arg1 == 5) {
            this.field1049 = arg0.method2292();
        } else if (arg1 == 6) {
            this.field1029 = arg0.method2292();
        } else if (arg1 == 7) {
            this.field1013 = arg0.method2292();
            if (this.field1013 > 32767) {
                this.field1013 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1032 = arg0.method2292();
            if (this.field1032 > 32767) {
                this.field1032 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1022 = 1;
        } else if (arg1 == 12) {
            this.field1034 = arg0.method2195();
        } else if (arg1 == 16) {
            this.field1035 = true;
        } else if (arg1 == 23) {
            this.field1038 = arg0.method2292();
            this.field1040 = arg0.method2142();
        } else if (arg1 == 24) {
            this.field1039 = arg0.method2292();
        } else if (arg1 == 25) {
            this.field1017 = arg0.method2292();
            this.field1043 = arg0.method2142();
        } else if (arg1 == 26) {
            this.field1042 = arg0.method2292();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1045[arg1 - 30] = arg0.method2150();
            if (this.field1045[arg1 - 30].equalsIgnoreCase(class147.field2178)) {
                this.field1045[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1046[arg1 - 35] = arg0.method2150();
        } else if (arg1 == 40) {
            int var3 = arg0.method2142();
            this.field1023 = new short[var3];
            this.field1030 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1023[var4] = (short) arg0.method2292();
                this.field1030[var4] = (short) arg0.method2292();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2142();
            this.field1025 = new short[var5];
            this.field1026 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1025[var6] = (short) arg0.method2292();
                this.field1026[var6] = (short) arg0.method2292();
            }
        } else if (arg1 == 65) {
            this.field1028 = true;
        } else if (arg1 == 78) {
            this.field1033 = arg0.method2292();
        } else if (arg1 == 79) {
            this.field1037 = arg0.method2292();
        } else if (arg1 == 90) {
            this.field1024 = arg0.method2292();
        } else if (arg1 == 91) {
            this.field1048 = arg0.method2292();
        } else if (arg1 == 92) {
            this.field1047 = arg0.method2292();
        } else if (arg1 == 93) {
            this.field1060 = arg0.method2292();
        } else if (arg1 == 95) {
            this.field1059 = arg0.method2292();
        } else if (arg1 == 97) {
            this.field1053 = arg0.method2292();
        } else if (arg1 == 98) {
            this.field1036 = arg0.method2292();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1050 == null) {
                this.field1050 = new int[10];
                this.field1051 = new int[10];
            }
            this.field1050[arg1 - 100] = arg0.method2292();
            this.field1051[arg1 - 100] = arg0.method2292();
        } else if (arg1 == 110) {
            this.field1062 = arg0.method2292();
        } else if (arg1 == 111) {
            this.field1055 = arg0.method2292();
        } else if (arg1 == 112) {
            this.field1041 = arg0.method2292();
        } else if (arg1 == 113) {
            this.field1057 = arg0.method2294();
        } else if (arg1 == 114) {
            this.field1058 = arg0.method2294() * 5;
        } else if (arg1 == 115) {
            this.field1052 = arg0.method2142();
        }
    }

    @ObfuscatedName("ap.p(Lap;Lap;I)V")
    public void method862(class46 arg0, class46 arg1) {
        this.field1021 = arg0.field1021;
        this.field1027 = arg0.field1027;
        this.field1049 = arg0.field1049;
        this.field1029 = arg0.field1029;
        this.field1059 = arg0.field1059;
        this.field1013 = arg0.field1013;
        this.field1032 = arg0.field1032;
        this.field1023 = arg0.field1023;
        this.field1030 = arg0.field1030;
        this.field1025 = arg0.field1025;
        this.field1026 = arg0.field1026;
        this.field1012 = arg1.field1012;
        this.field1035 = arg1.field1035;
        this.field1034 = arg1.field1034;
        this.field1022 = 1;
    }

    @ObfuscatedName("ap.n(IB)Lcs;")
    public final class94 method863(int arg0) {
        if (this.field1050 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1051[var3] && this.field1051[var3] != 0) {
                    var2 = this.field1050[var3];
                }
            }
            if (var2 != -1) {
                return method2398(var2).method863(1);
            }
        }
        class94 var4 = class94.method1874(Statics.field72, this.field1021, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1062 != 128 || this.field1055 != 128 || this.field1041 != 128) {
            var4.method1890(this.field1062, this.field1055, this.field1041);
        }
        if (this.field1023 != null) {
            for (int var5 = 0; var5 < this.field1023.length; var5++) {
                var4.method1879(this.field1023[var5], this.field1030[var5]);
            }
        }
        if (this.field1025 != null) {
            for (int var6 = 0; var6 < this.field1025.length; var6++) {
                var4.method1892(this.field1025[var6], this.field1026[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ap.o(IB)Lcr;")
    public final class99 method855(int arg0) {
        if (this.field1050 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1051[var3] && this.field1051[var3] != 0) {
                    var2 = this.field1050[var3];
                }
            }
            if (var2 != -1) {
                return method2398(var2).method855(1);
            }
        }
        class99 var4 = (class99) field1018.method3218((long) this.field1020);
        if (var4 != null) {
            return var4;
        }
        class94 var5 = class94.method1874(Statics.field72, this.field1021, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1062 != 128 || this.field1055 != 128 || this.field1041 != 128) {
            var5.method1890(this.field1062, this.field1055, this.field1041);
        }
        if (this.field1023 != null) {
            for (int var6 = 0; var6 < this.field1023.length; var6++) {
                var5.method1879(this.field1023[var6], this.field1030[var6]);
            }
        }
        if (this.field1025 != null) {
            for (int var7 = 0; var7 < this.field1025.length; var7++) {
                var5.method1892(this.field1025[var7], this.field1026[var7]);
            }
        }
        class99 var8 = var5.method1940(this.field1057 + 64, this.field1058 + 768, -50, -10, -50);
        var8.field1724 = true;
        field1018.method3220(var8, (long) this.field1020);
        return var8;
    }

    @ObfuscatedName("ap.g(IS)Lap;")
    public class46 method859(int arg0) {
        if (this.field1050 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1051[var3] && this.field1051[var3] != 0) {
                    var2 = this.field1050[var3];
                }
            }
            if (var2 != -1) {
                return method2398(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("x.z(IIIIIZB)Lby;")
    public static final class73 method143(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class73 var8 = (class73) field1019.method3218(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class46 var9 = method2398(arg0);
        if (arg1 > 1 && var9.field1050 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1051[var11] && var9.field1051[var11] != 0) {
                    var10 = var9.field1050[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2398(var10);
            }
        }
        class99 var12 = var9.method855(1);
        if (var12 == null) {
            return null;
        }
        class73 var13 = null;
        if (var9.field1036 != -1) {
            var13 = method143(var9.field1053, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1319;
        int var15 = Statics.field1316;
        int var16 = Statics.field1317;
        int[] var17 = new int[4];
        class74.method1509(var17);
        class73 var18 = new class73(36, 32);
        class74.method1505(var18.field1307, 36, 32);
        class74.method1517();
        class85.method1771();
        class85.method1800(16, 16);
        class85.field1474 = false;
        int var19 = var9.field1027;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1483[var9.field1049] * var19 >> 16;
        int var21 = class85.field1469[var9.field1049] * var19 >> 16;
        var12.method1976();
        var12.method1987(0, var9.field1029, var9.field1059, var9.field1049, var9.field1013, var9.field1032 + var12.field1354 / 2 + var20, var9.field1032 + var21);
        if (arg2 >= 1) {
            var18.method1416(1);
        }
        if (arg2 >= 2) {
            var18.method1416(16777215);
        }
        if (arg3 != 0) {
            var18.method1417(arg3);
        }
        class74.method1505(var18.field1307, 36, 32);
        if (var9.field1036 != -1) {
            var13.method1484(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1022 == 1) {
            class207 var22 = Statics.field2728;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class147.field2339 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class147.field2337 + "</col>";
            }
            var22.method3500(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1019.method3220(var18, var6);
        }
        class74.method1505(var14, var15, var16);
        class74.method1538(var17);
        class85.method1771();
        class85.field1474 = true;
        return var18;
    }

    @ObfuscatedName("ap.t(ZI)Z")
    public final boolean method857(boolean arg0) {
        int var2 = this.field1038;
        int var3 = this.field1039;
        int var4 = this.field1033;
        if (arg0) {
            var2 = this.field1017;
            var3 = this.field1042;
            var4 = this.field1037;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field72.method2824(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field72.method2824(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field72.method2824(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ap.y(ZI)Lcs;")
    public final class94 method858(boolean arg0) {
        int var2 = this.field1038;
        int var3 = this.field1039;
        int var4 = this.field1033;
        if (arg0) {
            var2 = this.field1017;
            var3 = this.field1042;
            var4 = this.field1037;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var5 = class94.method1874(Statics.field72, var2, 0);
        if (var3 != -1) {
            class94 var6 = class94.method1874(Statics.field72, var3, 0);
            if (var4 == -1) {
                class94[] var9 = new class94[] { var5, var6 };
                var5 = new class94(var9, 2);
            } else {
                class94 var7 = class94.method1874(Statics.field72, var4, 0);
                class94[] var8 = new class94[] { var5, var6, var7 };
                var5 = new class94(var8, 3);
            }
        }
        if (!arg0 && this.field1040 != 0) {
            var5.method1932(0, this.field1040, 0);
        }
        if (arg0 && this.field1043 != 0) {
            var5.method1932(0, this.field1043, 0);
        }
        if (this.field1023 != null) {
            for (int var10 = 0; var10 < this.field1023.length; var10++) {
                var5.method1879(this.field1023[var10], this.field1030[var10]);
            }
        }
        if (this.field1025 != null) {
            for (int var11 = 0; var11 < this.field1025.length; var11++) {
                var5.method1892(this.field1025[var11], this.field1026[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ap.w(ZI)Z")
    public final boolean method887(boolean arg0) {
        int var2 = this.field1024;
        int var3 = this.field1047;
        if (arg0) {
            var2 = this.field1048;
            var3 = this.field1060;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field72.method2824(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field72.method2824(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ap.x(ZI)Lcs;")
    public final class94 method860(boolean arg0) {
        int var2 = this.field1024;
        int var3 = this.field1047;
        if (arg0) {
            var2 = this.field1048;
            var3 = this.field1060;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var4 = class94.method1874(Statics.field72, var2, 0);
        if (var3 != -1) {
            class94 var5 = class94.method1874(Statics.field72, var3, 0);
            class94[] var6 = new class94[] { var4, var5 };
            var4 = new class94(var6, 2);
        }
        if (this.field1023 != null) {
            for (int var7 = 0; var7 < this.field1023.length; var7++) {
                var4.method1879(this.field1023[var7], this.field1030[var7]);
            }
        }
        if (this.field1025 != null) {
            for (int var8 = 0; var8 < this.field1025.length; var8++) {
                var4.method1892(this.field1025[var8], this.field1026[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gz.v(I)V")
    public static void method3485() {
        field1054.method3231();
        field1018.method3231();
        field1019.method3231();
    }
}
