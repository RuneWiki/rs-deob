package deob;

@ObfuscatedName("ag")
public class class46 extends class187 {

    @ObfuscatedName("ag.p")
    public static class176 field1008 = new class176(64);

    @ObfuscatedName("ag.y")
    public static class176 field1009 = new class176(50);

    @ObfuscatedName("ag.m")
    public static class176 field1041 = new class176(100);

    @ObfuscatedName("ag.c")
    public int field1046;

    @ObfuscatedName("ag.r")
    public int field1013;

    @ObfuscatedName("ag.s")
    public String field1022 = "null";

    @ObfuscatedName("ag.n")
    public short[] field1018;

    @ObfuscatedName("ag.q")
    public short[] field1016;

    @ObfuscatedName("ag.e")
    public short[] field1017;

    @ObfuscatedName("ag.d")
    public short[] field1014;

    @ObfuscatedName("ag.b")
    public int field1048 = 2000;

    @ObfuscatedName("ag.a")
    public int field1028 = 0;

    @ObfuscatedName("ag.i")
    public int field1021 = 0;

    @ObfuscatedName("ag.w")
    public int field1019 = 0;

    @ObfuscatedName("ag.x")
    public int field1023 = 0;

    @ObfuscatedName("ag.h")
    public int field1052 = 0;

    @ObfuscatedName("ag.z")
    public int field1025 = 0;

    @ObfuscatedName("ag.u")
    public int field1026 = 1;

    @ObfuscatedName("ag.ad")
    public boolean field1042 = false;

    @ObfuscatedName("ag.ah")
    public String[] field1031 = new String[] { null, null, class147.field2359, null, null };

    @ObfuscatedName("ag.ao")
    public String[] field1027 = new String[] { null, null, null, null, class147.field2163 };

    @ObfuscatedName("ag.as")
    public int field1030 = -1;

    @ObfuscatedName("ag.at")
    public int field1045 = -1;

    @ObfuscatedName("ag.ai")
    public int field1032 = 0;

    @ObfuscatedName("ag.aj")
    public int field1010 = -1;

    @ObfuscatedName("ag.aq")
    public int field1034 = -1;

    @ObfuscatedName("ag.an")
    public int field1035 = 0;

    @ObfuscatedName("ag.ac")
    public int field1036 = -1;

    @ObfuscatedName("ag.ap")
    public int field1037 = -1;

    @ObfuscatedName("ag.az")
    public int field1038 = -1;

    @ObfuscatedName("ag.ax")
    public int field1039 = -1;

    @ObfuscatedName("ag.al")
    public int field1040 = -1;

    @ObfuscatedName("ag.am")
    public int field1024 = -1;

    @ObfuscatedName("ag.av")
    public int[] field1020;

    @ObfuscatedName("ag.ar")
    public int[] field1043;

    @ObfuscatedName("ag.ak")
    public int field1044 = -1;

    @ObfuscatedName("ag.aw")
    public int field1050 = -1;

    @ObfuscatedName("ag.ag")
    public int field1033 = 128;

    @ObfuscatedName("ag.ay")
    public int field1047 = 128;

    @ObfuscatedName("ag.af")
    public int field1029 = 128;

    @ObfuscatedName("ag.au")
    public int field1049 = 0;

    @ObfuscatedName("ag.aa")
    public int field1003 = 0;

    @ObfuscatedName("ag.ab")
    public int field1051 = 0;

    @ObfuscatedName("ag.ae")
    public boolean field1012 = false;

    @ObfuscatedName("ax.v(Lem;Lem;ZLgh;I)V")
    public static void method735(class151 arg0, class151 arg1, boolean arg2, class207 arg3) {
        Statics.field1006 = arg0;
        Statics.field1007 = arg1;
        Statics.field698 = arg2;
        Statics.field142 = Statics.field1006.method2794(10);
        Statics.field1011 = arg3;
    }

    @ObfuscatedName("az.t(IB)Lag;")
    public static class46 method712(int arg0) {
        class46 var1 = (class46) field1008.method3231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1006.method2852(10, arg0);
        class46 var3 = new class46();
        var3.field1046 = arg0;
        if (var2 != null) {
            var3.method880(new class110(var2));
        }
        var3.method857();
        if (var3.field1050 != -1) {
            var3.method860(method712(var3.field1050), method712(var3.field1044));
        }
        if (!Statics.field698 && var3.field1042) {
            var3.field1022 = class147.field2285;
            var3.field1012 = false;
            var3.field1031 = null;
            var3.field1027 = null;
            var3.field1051 = 0;
        }
        field1008.method3228(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.f(I)V")
    public void method857() {
    }

    @ObfuscatedName("ag.j(Ldp;B)V")
    public void method880(class110 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method859(arg0, var2);
        }
    }

    @ObfuscatedName("ag.l(Ldp;IB)V")
    public void method859(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1013 = arg0.method2194();
        } else if (arg1 == 2) {
            this.field1022 = arg0.method2159();
        } else if (arg1 == 4) {
            this.field1048 = arg0.method2194();
        } else if (arg1 == 5) {
            this.field1028 = arg0.method2194();
        } else if (arg1 == 6) {
            this.field1021 = arg0.method2194();
        } else if (arg1 == 7) {
            this.field1023 = arg0.method2194();
            if (this.field1023 > 32767) {
                this.field1023 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1052 = arg0.method2194();
            if (this.field1052 > 32767) {
                this.field1052 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1025 = 1;
        } else if (arg1 == 12) {
            this.field1026 = arg0.method2297();
        } else if (arg1 == 16) {
            this.field1042 = true;
        } else if (arg1 == 23) {
            this.field1030 = arg0.method2194();
            this.field1032 = arg0.method2257();
        } else if (arg1 == 24) {
            this.field1045 = arg0.method2194();
        } else if (arg1 == 25) {
            this.field1010 = arg0.method2194();
            this.field1035 = arg0.method2257();
        } else if (arg1 == 26) {
            this.field1034 = arg0.method2194();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1031[arg1 - 30] = arg0.method2159();
            if (this.field1031[arg1 - 30].equalsIgnoreCase(class147.field2164)) {
                this.field1031[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1027[arg1 - 35] = arg0.method2159();
        } else if (arg1 == 40) {
            int var3 = arg0.method2257();
            this.field1018 = new short[var3];
            this.field1016 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1018[var4] = (short) arg0.method2194();
                this.field1016[var4] = (short) arg0.method2194();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2257();
            this.field1017 = new short[var5];
            this.field1014 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1017[var6] = (short) arg0.method2194();
                this.field1014[var6] = (short) arg0.method2194();
            }
        } else if (arg1 == 65) {
            this.field1012 = true;
        } else if (arg1 == 78) {
            this.field1036 = arg0.method2194();
        } else if (arg1 == 79) {
            this.field1037 = arg0.method2194();
        } else if (arg1 == 90) {
            this.field1038 = arg0.method2194();
        } else if (arg1 == 91) {
            this.field1040 = arg0.method2194();
        } else if (arg1 == 92) {
            this.field1039 = arg0.method2194();
        } else if (arg1 == 93) {
            this.field1024 = arg0.method2194();
        } else if (arg1 == 95) {
            this.field1019 = arg0.method2194();
        } else if (arg1 == 97) {
            this.field1044 = arg0.method2194();
        } else if (arg1 == 98) {
            this.field1050 = arg0.method2194();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1020 == null) {
                this.field1020 = new int[10];
                this.field1043 = new int[10];
            }
            this.field1020[arg1 - 100] = arg0.method2194();
            this.field1043[arg1 - 100] = arg0.method2194();
        } else if (arg1 == 110) {
            this.field1033 = arg0.method2194();
        } else if (arg1 == 111) {
            this.field1047 = arg0.method2194();
        } else if (arg1 == 112) {
            this.field1029 = arg0.method2194();
        } else if (arg1 == 113) {
            this.field1049 = arg0.method2162();
        } else if (arg1 == 114) {
            this.field1003 = arg0.method2162() * 5;
        } else if (arg1 == 115) {
            this.field1051 = arg0.method2257();
        }
    }

    @ObfuscatedName("ag.g(Lag;Lag;I)V")
    public void method860(class46 arg0, class46 arg1) {
        this.field1013 = arg0.field1013;
        this.field1048 = arg0.field1048;
        this.field1028 = arg0.field1028;
        this.field1021 = arg0.field1021;
        this.field1019 = arg0.field1019;
        this.field1023 = arg0.field1023;
        this.field1052 = arg0.field1052;
        this.field1018 = arg0.field1018;
        this.field1016 = arg0.field1016;
        this.field1017 = arg0.field1017;
        this.field1014 = arg0.field1014;
        this.field1022 = arg1.field1022;
        this.field1042 = arg1.field1042;
        this.field1026 = arg1.field1026;
        this.field1025 = 1;
    }

    @ObfuscatedName("ag.k(IB)Lcu;")
    public final class94 method877(int arg0) {
        if (this.field1020 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1043[var3] && this.field1043[var3] != 0) {
                    var2 = this.field1020[var3];
                }
            }
            if (var2 != -1) {
                return method712(var2).method877(1);
            }
        }
        class94 var4 = class94.method1899(Statics.field1007, this.field1013, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1033 != 128 || this.field1047 != 128 || this.field1029 != 128) {
            var4.method1913(this.field1033, this.field1047, this.field1029);
        }
        if (this.field1018 != null) {
            for (int var5 = 0; var5 < this.field1018.length; var5++) {
                var4.method1976(this.field1018[var5], this.field1016[var5]);
            }
        }
        if (this.field1017 != null) {
            for (int var6 = 0; var6 < this.field1017.length; var6++) {
                var4.method1981(this.field1017[var6], this.field1014[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ag.p(IB)Lcy;")
    public final class99 method862(int arg0) {
        if (this.field1020 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1043[var3] && this.field1043[var3] != 0) {
                    var2 = this.field1020[var3];
                }
            }
            if (var2 != -1) {
                return method712(var2).method862(1);
            }
        }
        class99 var4 = (class99) field1009.method3231((long) this.field1046);
        if (var4 != null) {
            return var4;
        }
        class94 var5 = class94.method1899(Statics.field1007, this.field1013, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1033 != 128 || this.field1047 != 128 || this.field1029 != 128) {
            var5.method1913(this.field1033, this.field1047, this.field1029);
        }
        if (this.field1018 != null) {
            for (int var6 = 0; var6 < this.field1018.length; var6++) {
                var5.method1976(this.field1018[var6], this.field1016[var6]);
            }
        }
        if (this.field1017 != null) {
            for (int var7 = 0; var7 < this.field1017.length; var7++) {
                var5.method1981(this.field1017[var7], this.field1014[var7]);
            }
        }
        class99 var8 = var5.method1918(this.field1049 + 64, this.field1003 + 768, -50, -10, -50);
        var8.field1710 = true;
        field1009.method3228(var8, (long) this.field1046);
        return var8;
    }

    @ObfuscatedName("ag.y(IB)Lag;")
    public class46 method863(int arg0) {
        if (this.field1020 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1043[var3] && this.field1043[var3] != 0) {
                    var2 = this.field1020[var3];
                }
            }
            if (var2 != -1) {
                return method712(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("da.m(IIIIIZB)Lbw;")
    public static final class73 method2466(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class73 var8 = (class73) field1041.method3231(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class46 var9 = method712(arg0);
        if (arg1 > 1 && var9.field1020 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1043[var11] && var9.field1043[var11] != 0) {
                    var10 = var9.field1020[var11];
                }
            }
            if (var10 != -1) {
                var9 = method712(var10);
            }
        }
        class99 var12 = var9.method862(1);
        if (var12 == null) {
            return null;
        }
        class73 var13 = null;
        if (var9.field1050 != -1) {
            var13 = method2466(var9.field1044, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1316;
        int var15 = Statics.field1310;
        int var16 = Statics.field1312;
        int[] var17 = new int[4];
        class74.method1518(var17);
        class73 var18 = new class73(36, 32);
        class74.method1512(var18.field1308, 36, 32);
        class74.method1573();
        class85.method1801();
        class85.method1804(16, 16);
        class85.field1462 = false;
        int var19 = var9.field1048;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1468[var9.field1028] * var19 >> 16;
        int var21 = class85.field1483[var9.field1028] * var19 >> 16;
        var12.method2006();
        var12.method2016(0, var9.field1021, var9.field1019, var9.field1028, var9.field1023, var9.field1052 + var12.field1355 / 2 + var20, var9.field1052 + var21);
        if (arg2 >= 1) {
            var18.method1433(1);
        }
        if (arg2 >= 2) {
            var18.method1433(16777215);
        }
        if (arg3 != 0) {
            var18.method1434(arg3);
        }
        class74.method1512(var18.field1308, 36, 32);
        if (var9.field1050 != -1) {
            var13.method1431(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1025 == 1) {
            class207 var22 = Statics.field1011;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class147.field2325 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class147.field2323 + "</col>";
            }
            var22.method3499(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1041.method3228(var18, var6);
        }
        class74.method1512(var14, var15, var16);
        class74.method1517(var17);
        class85.method1801();
        class85.field1462 = true;
        return var18;
    }

    @ObfuscatedName("ag.o(ZI)Z")
    public final boolean method864(boolean arg0) {
        int var2 = this.field1030;
        int var3 = this.field1045;
        int var4 = this.field1036;
        if (arg0) {
            var2 = this.field1010;
            var3 = this.field1034;
            var4 = this.field1037;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1007.method2786(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1007.method2786(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1007.method2786(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ag.c(ZI)Lcu;")
    public final class94 method892(boolean arg0) {
        int var2 = this.field1030;
        int var3 = this.field1045;
        int var4 = this.field1036;
        if (arg0) {
            var2 = this.field1010;
            var3 = this.field1034;
            var4 = this.field1037;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var5 = class94.method1899(Statics.field1007, var2, 0);
        if (var3 != -1) {
            class94 var6 = class94.method1899(Statics.field1007, var3, 0);
            if (var4 == -1) {
                class94[] var9 = new class94[] { var5, var6 };
                var5 = new class94(var9, 2);
            } else {
                class94 var7 = class94.method1899(Statics.field1007, var4, 0);
                class94[] var8 = new class94[] { var5, var6, var7 };
                var5 = new class94(var8, 3);
            }
        }
        if (!arg0 && this.field1032 != 0) {
            var5.method1910(0, this.field1032, 0);
        }
        if (arg0 && this.field1035 != 0) {
            var5.method1910(0, this.field1035, 0);
        }
        if (this.field1018 != null) {
            for (int var10 = 0; var10 < this.field1018.length; var10++) {
                var5.method1976(this.field1018[var10], this.field1016[var10]);
            }
        }
        if (this.field1017 != null) {
            for (int var11 = 0; var11 < this.field1017.length; var11++) {
                var5.method1981(this.field1017[var11], this.field1014[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ag.r(ZI)Z")
    public final boolean method866(boolean arg0) {
        int var2 = this.field1038;
        int var3 = this.field1039;
        if (arg0) {
            var2 = this.field1040;
            var3 = this.field1024;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1007.method2786(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1007.method2786(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ag.s(ZI)Lcu;")
    public final class94 method893(boolean arg0) {
        int var2 = this.field1038;
        int var3 = this.field1039;
        if (arg0) {
            var2 = this.field1040;
            var3 = this.field1024;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var4 = class94.method1899(Statics.field1007, var2, 0);
        if (var3 != -1) {
            class94 var5 = class94.method1899(Statics.field1007, var3, 0);
            class94[] var6 = new class94[] { var4, var5 };
            var4 = new class94(var6, 2);
        }
        if (this.field1018 != null) {
            for (int var7 = 0; var7 < this.field1018.length; var7++) {
                var4.method1976(this.field1018[var7], this.field1016[var7]);
            }
        }
        if (this.field1017 != null) {
            for (int var8 = 0; var8 < this.field1017.length; var8++) {
                var4.method1981(this.field1017[var8], this.field1014[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("f.n(ZI)V")
    public static void method22(boolean arg0) {
        if (Statics.field698 != arg0) {
            field1008.method3229();
            field1009.method3229();
            field1041.method3229();
            Statics.field698 = arg0;
        }
    }
}
