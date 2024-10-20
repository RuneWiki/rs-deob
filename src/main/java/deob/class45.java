package deob;

@ObfuscatedName("au")
public class class45 extends class181 {

    @ObfuscatedName("au.h")
    public static class171 field1012 = new class171(64);

    @ObfuscatedName("au.r")
    public static class171 field1013 = new class171(50);

    @ObfuscatedName("au.e")
    public static class171 field1014 = new class171(100);

    @ObfuscatedName("au.b")
    public int field1031;

    @ObfuscatedName("au.n")
    public int field1017;

    @ObfuscatedName("au.a")
    public String field1026 = "null";

    @ObfuscatedName("au.q")
    public short[] field1034;

    @ObfuscatedName("au.i")
    public short[] field1020;

    @ObfuscatedName("au.f")
    public short[] field1016;

    @ObfuscatedName("au.o")
    public short[] field1022;

    @ObfuscatedName("au.t")
    public int field1047 = 2000;

    @ObfuscatedName("au.c")
    public int field1024 = 0;

    @ObfuscatedName("au.d")
    public int field1025 = 0;

    @ObfuscatedName("au.g")
    public int field1029 = 0;

    @ObfuscatedName("au.s")
    public int field1027 = 0;

    @ObfuscatedName("au.m")
    public int field1009 = 0;

    @ObfuscatedName("au.v")
    public int field1053 = 0;

    @ObfuscatedName("au.u")
    public int field1030 = 1;

    @ObfuscatedName("au.p")
    public boolean field1021 = false;

    @ObfuscatedName("au.l")
    public String[] field1032 = new String[] { null, null, class142.field2301, null, null };

    @ObfuscatedName("au.w")
    public String[] field1033 = new String[] { null, null, null, null, class142.field2157 };

    @ObfuscatedName("au.x")
    public int field1048 = -1;

    @ObfuscatedName("au.aj")
    public int field1035 = -1;

    @ObfuscatedName("au.al")
    public int field1036 = 0;

    @ObfuscatedName("au.af")
    public int field1037 = -1;

    @ObfuscatedName("au.ai")
    public int field1038 = -1;

    @ObfuscatedName("au.ak")
    public int field1039 = 0;

    @ObfuscatedName("au.ae")
    public int field1040 = -1;

    @ObfuscatedName("au.ag")
    public int field1055 = -1;

    @ObfuscatedName("au.ar")
    public int field1042 = -1;

    @ObfuscatedName("au.an")
    public int field1018 = -1;

    @ObfuscatedName("au.av")
    public int field1044 = -1;

    @ObfuscatedName("au.aw")
    public int field1045 = -1;

    @ObfuscatedName("au.aq")
    public int[] field1046;

    @ObfuscatedName("au.ad")
    public int[] field1028;

    @ObfuscatedName("au.at")
    public int field1015 = -1;

    @ObfuscatedName("au.aa")
    public int field1049 = -1;

    @ObfuscatedName("au.ay")
    public int field1050 = 128;

    @ObfuscatedName("au.am")
    public int field1051 = 128;

    @ObfuscatedName("au.az")
    public int field1043 = 128;

    @ObfuscatedName("au.au")
    public int field1041 = 0;

    @ObfuscatedName("au.ac")
    public int field1054 = 0;

    @ObfuscatedName("au.ab")
    public int field1019 = 0;

    @ObfuscatedName("aj.z(II)Lau;")
    public static class45 method500(int arg0) {
        class45 var1 = (class45) field1012.method3171((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1052.method2739(10, arg0);
        class45 var3 = new class45();
        var3.field1031 = arg0;
        if (var2 != null) {
            var3.method829(new class107(var2));
        }
        var3.method828();
        if (var3.field1049 != -1) {
            var3.method831(method500(var3.field1049), method500(var3.field1015));
        }
        if (!Statics.field1011 && var3.field1021) {
            var3.field1026 = class142.field2280;
            var3.field1032 = null;
            var3.field1033 = null;
            var3.field1019 = 0;
        }
        field1012.method3173(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.y(I)V")
    public void method828() {
    }

    @ObfuscatedName("au.h(Lde;I)V")
    public void method829(class107 arg0) {
        while (true) {
            int var2 = arg0.method2130();
            if (var2 == 0) {
                return;
            }
            this.method830(arg0, var2);
        }
    }

    @ObfuscatedName("au.r(Lde;II)V")
    public void method830(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1017 = arg0.method2132();
        } else if (arg1 == 2) {
            this.field1026 = arg0.method2138();
        } else if (arg1 == 4) {
            this.field1047 = arg0.method2132();
        } else if (arg1 == 5) {
            this.field1024 = arg0.method2132();
        } else if (arg1 == 6) {
            this.field1025 = arg0.method2132();
        } else if (arg1 == 7) {
            this.field1027 = arg0.method2132();
            if (this.field1027 > 32767) {
                this.field1027 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1009 = arg0.method2132();
            if (this.field1009 > 32767) {
                this.field1009 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1053 = 1;
        } else if (arg1 == 12) {
            this.field1030 = arg0.method2135();
        } else if (arg1 == 16) {
            this.field1021 = true;
        } else if (arg1 == 23) {
            this.field1048 = arg0.method2132();
            this.field1036 = arg0.method2130();
        } else if (arg1 == 24) {
            this.field1035 = arg0.method2132();
        } else if (arg1 == 25) {
            this.field1037 = arg0.method2132();
            this.field1039 = arg0.method2130();
        } else if (arg1 == 26) {
            this.field1038 = arg0.method2132();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1032[arg1 - 30] = arg0.method2138();
            if (this.field1032[arg1 - 30].equalsIgnoreCase(class142.field2158)) {
                this.field1032[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1033[arg1 - 35] = arg0.method2138();
        } else if (arg1 == 40) {
            int var3 = arg0.method2130();
            this.field1034 = new short[var3];
            this.field1020 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1034[var4] = (short) arg0.method2132();
                this.field1020[var4] = (short) arg0.method2132();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2130();
            this.field1016 = new short[var5];
            this.field1022 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1016[var6] = (short) arg0.method2132();
                this.field1022[var6] = (short) arg0.method2132();
            }
        } else if (arg1 == 78) {
            this.field1040 = arg0.method2132();
        } else if (arg1 == 79) {
            this.field1055 = arg0.method2132();
        } else if (arg1 == 90) {
            this.field1042 = arg0.method2132();
        } else if (arg1 == 91) {
            this.field1044 = arg0.method2132();
        } else if (arg1 == 92) {
            this.field1018 = arg0.method2132();
        } else if (arg1 == 93) {
            this.field1045 = arg0.method2132();
        } else if (arg1 == 95) {
            this.field1029 = arg0.method2132();
        } else if (arg1 == 97) {
            this.field1015 = arg0.method2132();
        } else if (arg1 == 98) {
            this.field1049 = arg0.method2132();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1046 == null) {
                this.field1046 = new int[10];
                this.field1028 = new int[10];
            }
            this.field1046[arg1 - 100] = arg0.method2132();
            this.field1028[arg1 - 100] = arg0.method2132();
        } else if (arg1 == 110) {
            this.field1050 = arg0.method2132();
        } else if (arg1 == 111) {
            this.field1051 = arg0.method2132();
        } else if (arg1 == 112) {
            this.field1043 = arg0.method2132();
        } else if (arg1 == 113) {
            this.field1041 = arg0.method2131();
        } else if (arg1 == 114) {
            this.field1054 = arg0.method2131();
        } else if (arg1 == 115) {
            this.field1019 = arg0.method2130();
        }
    }

    @ObfuscatedName("au.e(Lau;Lau;I)V")
    public void method831(class45 arg0, class45 arg1) {
        this.field1017 = arg0.field1017;
        this.field1047 = arg0.field1047;
        this.field1024 = arg0.field1024;
        this.field1025 = arg0.field1025;
        this.field1029 = arg0.field1029;
        this.field1027 = arg0.field1027;
        this.field1009 = arg0.field1009;
        this.field1034 = arg0.field1034;
        this.field1020 = arg0.field1020;
        this.field1016 = arg0.field1016;
        this.field1022 = arg0.field1022;
        this.field1026 = arg1.field1026;
        this.field1021 = arg1.field1021;
        this.field1030 = arg1.field1030;
        this.field1053 = 1;
    }

    @ObfuscatedName("au.k(II)Lcx;")
    public final class93 method832(int arg0) {
        if (this.field1046 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1028[var3] && this.field1028[var3] != 0) {
                    var2 = this.field1046[var3];
                }
            }
            if (var2 != -1) {
                return method500(var2).method832(1);
            }
        }
        class93 var4 = class93.method1938(Statics.field1010, this.field1017, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1050 != 128 || this.field1051 != 128 || this.field1043 != 128) {
            var4.method1909(this.field1050, this.field1051, this.field1043);
        }
        if (this.field1034 != null) {
            for (int var5 = 0; var5 < this.field1034.length; var5++) {
                var4.method1906(this.field1034[var5], this.field1020[var5]);
            }
        }
        if (this.field1016 != null) {
            for (int var6 = 0; var6 < this.field1016.length; var6++) {
                var4.method1907(this.field1016[var6], this.field1022[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("au.b(II)Lcl;")
    public final class98 method833(int arg0) {
        if (this.field1046 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1028[var3] && this.field1028[var3] != 0) {
                    var2 = this.field1046[var3];
                }
            }
            if (var2 != -1) {
                return method500(var2).method833(1);
            }
        }
        class98 var4 = (class98) field1013.method3171((long) this.field1031);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1938(Statics.field1010, this.field1017, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1050 != 128 || this.field1051 != 128 || this.field1043 != 128) {
            var5.method1909(this.field1050, this.field1051, this.field1043);
        }
        if (this.field1034 != null) {
            for (int var6 = 0; var6 < this.field1034.length; var6++) {
                var5.method1906(this.field1034[var6], this.field1020[var6]);
            }
        }
        if (this.field1016 != null) {
            for (int var7 = 0; var7 < this.field1016.length; var7++) {
                var5.method1907(this.field1016[var7], this.field1022[var7]);
            }
        }
        class98 var8 = var5.method1914(this.field1041 + 64, this.field1054 * 5 + 768, -50, -10, -50);
        var8.field1711 = true;
        field1013.method3173(var8, (long) this.field1031);
        return var8;
    }

    @ObfuscatedName("au.n(II)Lau;")
    public class45 method850(int arg0) {
        if (this.field1046 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1028[var3] && this.field1028[var3] != 0) {
                    var2 = this.field1046[var3];
                }
            }
            if (var2 != -1) {
                return method500(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("c.a(IIIIZI)Lbq;")
    public static final class72 method155(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1014.method3171(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method500(arg0);
        if (arg1 > 1 && var8.field1046 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1028[var10] && var8.field1028[var10] != 0) {
                    var9 = var8.field1046[var10];
                }
            }
            if (var9 != -1) {
                var8 = method500(var9);
            }
        }
        class98 var11 = var8.method833(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1049 != -1) {
            var12 = method155(var8.field1015, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1318;
        int var14 = Statics.field1321;
        int var15 = Statics.field1317;
        int[] var16 = new int[4];
        class73.method1520(var16);
        class72 var17 = new class72(36, 32);
        class73.method1516(var17.field1307, 36, 32);
        class73.method1522();
        class84.method1791();
        class84.method1794(16, 16);
        class84.field1461 = false;
        int var18 = var8.field1047;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1476[var8.field1024] * var18 >> 16;
        int var20 = class84.field1471[var8.field1024] * var18 >> 16;
        var11.method1988();
        var11.method1999(0, var8.field1025, var8.field1029, var8.field1024, var8.field1027, var8.field1009 + var11.field1354 / 2 + var19, var8.field1009 + var20);
        if (arg2 >= 1) {
            var17.method1448(1);
        }
        if (arg2 >= 2) {
            var17.method1448(16777215);
        }
        if (arg3 != 0) {
            var17.method1493(arg3);
        }
        class73.method1516(var17.field1307, 36, 32);
        if (var8.field1049 != -1) {
            var12.method1510(0, 0);
        }
        if (!arg4 && (var8.field1053 == 1 || arg1 != 1) && arg1 != -1) {
            class191 var21 = Statics.field1023;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class142.field2319 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class142.field2317 + "</col>";
            }
            var21.method3344(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1014.method3173(var17, var5);
        }
        class73.method1516(var13, var14, var15);
        class73.method1551(var16);
        class84.method1791();
        class84.field1461 = true;
        return var17;
    }

    @ObfuscatedName("au.q(ZI)Z")
    public final boolean method835(boolean arg0) {
        int var2 = this.field1048;
        int var3 = this.field1035;
        int var4 = this.field1040;
        if (arg0) {
            var2 = this.field1037;
            var3 = this.field1038;
            var4 = this.field1055;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1010.method2741(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1010.method2741(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1010.method2741(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("au.i(ZI)Lcx;")
    public final class93 method836(boolean arg0) {
        int var2 = this.field1048;
        int var3 = this.field1035;
        int var4 = this.field1040;
        if (arg0) {
            var2 = this.field1037;
            var3 = this.field1038;
            var4 = this.field1055;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1938(Statics.field1010, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1938(Statics.field1010, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1938(Statics.field1010, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1036 != 0) {
            var5.method1905(0, this.field1036, 0);
        }
        if (arg0 && this.field1039 != 0) {
            var5.method1905(0, this.field1039, 0);
        }
        if (this.field1034 != null) {
            for (int var10 = 0; var10 < this.field1034.length; var10++) {
                var5.method1906(this.field1034[var10], this.field1020[var10]);
            }
        }
        if (this.field1016 != null) {
            for (int var11 = 0; var11 < this.field1016.length; var11++) {
                var5.method1907(this.field1016[var11], this.field1022[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("au.f(ZB)Z")
    public final boolean method841(boolean arg0) {
        int var2 = this.field1042;
        int var3 = this.field1018;
        if (arg0) {
            var2 = this.field1044;
            var3 = this.field1045;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1010.method2741(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1010.method2741(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("au.o(ZI)Lcx;")
    public final class93 method834(boolean arg0) {
        int var2 = this.field1042;
        int var3 = this.field1018;
        if (arg0) {
            var2 = this.field1044;
            var3 = this.field1045;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1938(Statics.field1010, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1938(Statics.field1010, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1034 != null) {
            for (int var7 = 0; var7 < this.field1034.length; var7++) {
                var4.method1906(this.field1034[var7], this.field1020[var7]);
            }
        }
        if (this.field1016 != null) {
            for (int var8 = 0; var8 < this.field1016.length; var8++) {
                var4.method1907(this.field1016[var8], this.field1022[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cu.t(I)V")
    public static void method2056() {
        field1012.method3170();
        field1013.method3170();
        field1014.method3170();
    }

    @ObfuscatedName("z.c(B)V")
    public static void method11() {
        field1014.method3170();
    }

    @ObfuscatedName("dn.d(ZB)V")
    public static void method2391(boolean arg0) {
        if (Statics.field1011 != arg0) {
            method2056();
            Statics.field1011 = arg0;
        }
    }
}
