package deob;

@ObfuscatedName("am")
public class class45 extends class182 {

    @ObfuscatedName("am.i")
    public static class171 field1017 = new class171(64);

    @ObfuscatedName("am.t")
    public static class171 field1012 = new class171(50);

    @ObfuscatedName("am.z")
    public static class171 field1013 = new class171(100);

    @ObfuscatedName("am.c")
    public int field1015;

    @ObfuscatedName("am.o")
    public int field1008;

    @ObfuscatedName("am.q")
    public String field1016 = "null";

    @ObfuscatedName("am.w")
    public short[] field1025;

    @ObfuscatedName("am.y")
    public short[] field1035;

    @ObfuscatedName("am.p")
    public short[] field1040;

    @ObfuscatedName("am.m")
    public short[] field1021;

    @ObfuscatedName("am.a")
    public int field1020 = 2000;

    @ObfuscatedName("am.u")
    public int field1023 = 0;

    @ObfuscatedName("am.n")
    public int field1024 = 0;

    @ObfuscatedName("am.x")
    public int field1022 = 0;

    @ObfuscatedName("am.f")
    public int field1043 = 0;

    @ObfuscatedName("am.v")
    public int field1027 = 0;

    @ObfuscatedName("am.s")
    public int field1028 = 0;

    @ObfuscatedName("am.r")
    public int field1029 = 1;

    @ObfuscatedName("am.j")
    public boolean field1030 = false;

    @ObfuscatedName("am.h")
    public String[] field1031 = new String[] { null, null, class142.field2156, null, null };

    @ObfuscatedName("am.d")
    public String[] field1032 = new String[] { null, null, null, null, class142.field2157 };

    @ObfuscatedName("am.l")
    public int field1033 = -1;

    @ObfuscatedName("am.ag")
    public int field1034 = -1;

    @ObfuscatedName("am.au")
    public int field1019 = 0;

    @ObfuscatedName("am.ak")
    public int field1036 = -1;

    @ObfuscatedName("am.aw")
    public int field1037 = -1;

    @ObfuscatedName("am.at")
    public int field1018 = 0;

    @ObfuscatedName("am.ah")
    public int field1039 = -1;

    @ObfuscatedName("am.aj")
    public int field1038 = -1;

    @ObfuscatedName("am.an")
    public int field1050 = -1;

    @ObfuscatedName("am.as")
    public int field1042 = -1;

    @ObfuscatedName("am.ap")
    public int field1057 = -1;

    @ObfuscatedName("am.ai")
    public int field1044 = -1;

    @ObfuscatedName("am.av")
    public int[] field1026;

    @ObfuscatedName("am.ae")
    public int[] field1046;

    @ObfuscatedName("am.ay")
    public int field1047 = -1;

    @ObfuscatedName("am.ab")
    public int field1048 = -1;

    @ObfuscatedName("am.az")
    public int field1049 = 128;

    @ObfuscatedName("am.ad")
    public int field1045 = 128;

    @ObfuscatedName("am.ao")
    public int field1051 = 128;

    @ObfuscatedName("am.am")
    public int field1052 = 0;

    @ObfuscatedName("am.al")
    public int field1053 = 0;

    @ObfuscatedName("am.ac")
    public int field1054 = 0;

    @ObfuscatedName("dt.k(II)Lam;")
    public static class45 method2458(int arg0) {
        class45 var1 = (class45) field1017.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1009.method2759(10, arg0);
        class45 var3 = new class45();
        var3.field1015 = arg0;
        if (var2 != null) {
            var3.method863(new class107(var2));
        }
        var3.method844();
        if (var3.field1048 != -1) {
            var3.method847(method2458(var3.field1048), method2458(var3.field1047));
        }
        if (!Statics.field1010 && var3.field1030) {
            var3.field1016 = class142.field2235;
            var3.field1031 = null;
            var3.field1032 = null;
            var3.field1054 = 0;
        }
        field1017.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.b(I)V")
    public void method844() {
    }

    @ObfuscatedName("am.e(Ldi;B)V")
    public void method863(class107 arg0) {
        while (true) {
            int var2 = arg0.method2115();
            if (var2 == 0) {
                return;
            }
            this.method846(arg0, var2);
        }
    }

    @ObfuscatedName("am.i(Ldi;IB)V")
    public void method846(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1008 = arg0.method2117();
        } else if (arg1 == 2) {
            this.field1016 = arg0.method2123();
        } else if (arg1 == 4) {
            this.field1020 = arg0.method2117();
        } else if (arg1 == 5) {
            this.field1023 = arg0.method2117();
        } else if (arg1 == 6) {
            this.field1024 = arg0.method2117();
        } else if (arg1 == 7) {
            this.field1043 = arg0.method2117();
            if (this.field1043 > 32767) {
                this.field1043 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1027 = arg0.method2117();
            if (this.field1027 > 32767) {
                this.field1027 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1028 = 1;
        } else if (arg1 == 12) {
            this.field1029 = arg0.method2120();
        } else if (arg1 == 16) {
            this.field1030 = true;
        } else if (arg1 == 23) {
            this.field1033 = arg0.method2117();
            this.field1019 = arg0.method2115();
        } else if (arg1 == 24) {
            this.field1034 = arg0.method2117();
        } else if (arg1 == 25) {
            this.field1036 = arg0.method2117();
            this.field1018 = arg0.method2115();
        } else if (arg1 == 26) {
            this.field1037 = arg0.method2117();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1031[arg1 - 30] = arg0.method2123();
            if (this.field1031[arg1 - 30].equalsIgnoreCase(class142.field2294)) {
                this.field1031[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1032[arg1 - 35] = arg0.method2123();
        } else if (arg1 == 40) {
            int var3 = arg0.method2115();
            this.field1025 = new short[var3];
            this.field1035 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1025[var4] = (short) arg0.method2117();
                this.field1035[var4] = (short) arg0.method2117();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2115();
            this.field1040 = new short[var5];
            this.field1021 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1040[var6] = (short) arg0.method2117();
                this.field1021[var6] = (short) arg0.method2117();
            }
        } else if (arg1 == 78) {
            this.field1039 = arg0.method2117();
        } else if (arg1 == 79) {
            this.field1038 = arg0.method2117();
        } else if (arg1 == 90) {
            this.field1050 = arg0.method2117();
        } else if (arg1 == 91) {
            this.field1057 = arg0.method2117();
        } else if (arg1 == 92) {
            this.field1042 = arg0.method2117();
        } else if (arg1 == 93) {
            this.field1044 = arg0.method2117();
        } else if (arg1 == 95) {
            this.field1022 = arg0.method2117();
        } else if (arg1 == 97) {
            this.field1047 = arg0.method2117();
        } else if (arg1 == 98) {
            this.field1048 = arg0.method2117();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1026 == null) {
                this.field1026 = new int[10];
                this.field1046 = new int[10];
            }
            this.field1026[arg1 - 100] = arg0.method2117();
            this.field1046[arg1 - 100] = arg0.method2117();
        } else if (arg1 == 110) {
            this.field1049 = arg0.method2117();
        } else if (arg1 == 111) {
            this.field1045 = arg0.method2117();
        } else if (arg1 == 112) {
            this.field1051 = arg0.method2117();
        } else if (arg1 == 113) {
            this.field1052 = arg0.method2116();
        } else if (arg1 == 114) {
            this.field1053 = arg0.method2116();
        } else if (arg1 == 115) {
            this.field1054 = arg0.method2115();
        }
    }

    @ObfuscatedName("am.t(Lam;Lam;I)V")
    public void method847(class45 arg0, class45 arg1) {
        this.field1008 = arg0.field1008;
        this.field1020 = arg0.field1020;
        this.field1023 = arg0.field1023;
        this.field1024 = arg0.field1024;
        this.field1022 = arg0.field1022;
        this.field1043 = arg0.field1043;
        this.field1027 = arg0.field1027;
        this.field1025 = arg0.field1025;
        this.field1035 = arg0.field1035;
        this.field1040 = arg0.field1040;
        this.field1021 = arg0.field1021;
        this.field1016 = arg1.field1016;
        this.field1030 = arg1.field1030;
        this.field1029 = arg1.field1029;
        this.field1028 = 1;
    }

    @ObfuscatedName("am.z(II)Lcv;")
    public final class93 method848(int arg0) {
        if (this.field1026 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1046[var3] && this.field1046[var3] != 0) {
                    var2 = this.field1026[var3];
                }
            }
            if (var2 != -1) {
                return method2458(var2).method848(1);
            }
        }
        class93 var4 = class93.method1881(Statics.field1055, this.field1008, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1049 != 128 || this.field1045 != 128 || this.field1051 != 128) {
            var4.method1923(this.field1049, this.field1045, this.field1051);
        }
        if (this.field1025 != null) {
            for (int var5 = 0; var5 < this.field1025.length; var5++) {
                var4.method1895(this.field1025[var5], this.field1035[var5]);
            }
        }
        if (this.field1040 != null) {
            for (int var6 = 0; var6 < this.field1040.length; var6++) {
                var4.method1924(this.field1040[var6], this.field1021[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("am.g(II)Lck;")
    public final class98 method849(int arg0) {
        if (this.field1026 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1046[var3] && this.field1046[var3] != 0) {
                    var2 = this.field1026[var3];
                }
            }
            if (var2 != -1) {
                return method2458(var2).method849(1);
            }
        }
        class98 var4 = (class98) field1012.method3166((long) this.field1015);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1881(Statics.field1055, this.field1008, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1049 != 128 || this.field1045 != 128 || this.field1051 != 128) {
            var5.method1923(this.field1049, this.field1045, this.field1051);
        }
        if (this.field1025 != null) {
            for (int var6 = 0; var6 < this.field1025.length; var6++) {
                var5.method1895(this.field1025[var6], this.field1035[var6]);
            }
        }
        if (this.field1040 != null) {
            for (int var7 = 0; var7 < this.field1040.length; var7++) {
                var5.method1924(this.field1040[var7], this.field1021[var7]);
            }
        }
        class98 var8 = var5.method1902(this.field1052 + 64, this.field1053 * 5 + 768, -50, -10, -50);
        var8.field1712 = true;
        field1012.method3161(var8, (long) this.field1015);
        return var8;
    }

    @ObfuscatedName("am.c(II)Lam;")
    public class45 method850(int arg0) {
        if (this.field1026 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1046[var3] && this.field1046[var3] != 0) {
                    var2 = this.field1026[var3];
                }
            }
            if (var2 != -1) {
                return method2458(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cd.o(IIIIZI)Lbd;")
    public static final class72 method1770(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1013.method3166(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method2458(arg0);
        if (arg1 > 1 && var8.field1026 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1046[var10] && var8.field1046[var10] != 0) {
                    var9 = var8.field1026[var10];
                }
            }
            if (var9 != -1) {
                var8 = method2458(var9);
            }
        }
        class98 var11 = var8.method849(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1048 != -1) {
            var12 = method1770(var8.field1047, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1323;
        int var14 = Statics.field1319;
        int var15 = Statics.field1321;
        int[] var16 = new int[4];
        class73.method1513(var16);
        class72 var17 = new class72(36, 32);
        class73.method1558(var17.field1311, 36, 32);
        class73.method1553();
        class84.method1776();
        class84.method1779(16, 16);
        class84.field1468 = false;
        int var18 = var8.field1020;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1478[var8.field1023] * var18 >> 16;
        int var20 = class84.field1489[var8.field1023] * var18 >> 16;
        var11.method1979();
        var11.method2036(0, var8.field1024, var8.field1022, var8.field1023, var8.field1043, var8.field1027 + var11.field1353 / 2 + var19, var8.field1027 + var20);
        if (arg2 >= 1) {
            var17.method1467(1);
        }
        if (arg2 >= 2) {
            var17.method1467(16777215);
        }
        if (arg3 != 0) {
            var17.method1431(arg3);
        }
        class73.method1558(var17.field1311, 36, 32);
        if (var8.field1048 != -1) {
            var12.method1434(0, 0);
        }
        if (!arg4 && (var8.field1028 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field1014.method3380(method1973(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1013.method3161(var17, var5);
        }
        class73.method1558(var13, var14, var15);
        class73.method1514(var16);
        class84.method1776();
        class84.field1468 = true;
        return var17;
    }

    @ObfuscatedName("cr.q(II)Ljava/lang/String;")
    public static final String method1973(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class142.field2361 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class142.field2329 + "</col>";
        }
    }

    @ObfuscatedName("am.w(ZI)Z")
    public final boolean method851(boolean arg0) {
        int var2 = this.field1033;
        int var3 = this.field1034;
        int var4 = this.field1039;
        if (arg0) {
            var2 = this.field1036;
            var3 = this.field1037;
            var4 = this.field1038;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1055.method2700(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1055.method2700(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1055.method2700(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("am.y(ZI)Lcv;")
    public final class93 method862(boolean arg0) {
        int var2 = this.field1033;
        int var3 = this.field1034;
        int var4 = this.field1039;
        if (arg0) {
            var2 = this.field1036;
            var3 = this.field1037;
            var4 = this.field1038;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1881(Statics.field1055, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1881(Statics.field1055, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1881(Statics.field1055, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1019 != 0) {
            var5.method1894(0, this.field1019, 0);
        }
        if (arg0 && this.field1018 != 0) {
            var5.method1894(0, this.field1018, 0);
        }
        if (this.field1025 != null) {
            for (int var10 = 0; var10 < this.field1025.length; var10++) {
                var5.method1895(this.field1025[var10], this.field1035[var10]);
            }
        }
        if (this.field1040 != null) {
            for (int var11 = 0; var11 < this.field1040.length; var11++) {
                var5.method1924(this.field1040[var11], this.field1021[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("am.p(ZB)Z")
    public final boolean method853(boolean arg0) {
        int var2 = this.field1050;
        int var3 = this.field1042;
        if (arg0) {
            var2 = this.field1057;
            var3 = this.field1044;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1055.method2700(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1055.method2700(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("am.m(ZS)Lcv;")
    public final class93 method854(boolean arg0) {
        int var2 = this.field1050;
        int var3 = this.field1042;
        if (arg0) {
            var2 = this.field1057;
            var3 = this.field1044;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1881(Statics.field1055, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1881(Statics.field1055, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1025 != null) {
            for (int var7 = 0; var7 < this.field1025.length; var7++) {
                var4.method1895(this.field1025[var7], this.field1035[var7]);
            }
        }
        if (this.field1040 != null) {
            for (int var8 = 0; var8 < this.field1040.length; var8++) {
                var4.method1924(this.field1040[var8], this.field1021[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cm.a(ZI)V")
    public static void method1966(boolean arg0) {
        if (Statics.field1010 != arg0) {
            field1017.method3162();
            field1012.method3162();
            field1013.method3162();
            Statics.field1010 = arg0;
        }
    }
}
