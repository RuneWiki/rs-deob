package deob;

@ObfuscatedName("af")
public class class45 extends class182 {

    @ObfuscatedName("af.h")
    public static class171 field1007 = new class171(64);

    @ObfuscatedName("af.k")
    public static class171 field1018 = new class171(50);

    @ObfuscatedName("af.l")
    public static class171 field1009 = new class171(100);

    @ObfuscatedName("af.j")
    public int field1047;

    @ObfuscatedName("af.n")
    public int field1012;

    @ObfuscatedName("af.f")
    public String field1017 = "null";

    @ObfuscatedName("af.a")
    public short[] field1014;

    @ObfuscatedName("af.i")
    public short[] field1015;

    @ObfuscatedName("af.y")
    public short[] field1016;

    @ObfuscatedName("af.p")
    public short[] field1032;

    @ObfuscatedName("af.q")
    public int field1019 = 2000;

    @ObfuscatedName("af.t")
    public int field1008 = 0;

    @ObfuscatedName("af.r")
    public int field1020 = 0;

    @ObfuscatedName("af.x")
    public int field1021 = 0;

    @ObfuscatedName("af.s")
    public int field1036 = 0;

    @ObfuscatedName("af.d")
    public int field1023 = 0;

    @ObfuscatedName("af.m")
    public int field1024 = 0;

    @ObfuscatedName("af.o")
    public int field1011 = 1;

    @ObfuscatedName("af.b")
    public boolean field1026 = false;

    @ObfuscatedName("af.c")
    public String[] field1027 = new String[] { null, null, class142.field2177, null, null };

    @ObfuscatedName("af.w")
    public String[] field1028 = new String[] { null, null, null, null, class142.field2158 };

    @ObfuscatedName("af.u")
    public int field1029 = -1;

    @ObfuscatedName("af.ac")
    public int field1030 = -1;

    @ObfuscatedName("af.ap")
    public int field1022 = 0;

    @ObfuscatedName("af.ai")
    public int field1044 = -1;

    @ObfuscatedName("af.as")
    public int field1033 = -1;

    @ObfuscatedName("af.aa")
    public int field1034 = 0;

    @ObfuscatedName("af.aq")
    public int field1035 = -1;

    @ObfuscatedName("af.aw")
    public int field1042 = -1;

    @ObfuscatedName("af.am")
    public int field1037 = -1;

    @ObfuscatedName("af.av")
    public int field1038 = -1;

    @ObfuscatedName("af.an")
    public int field1039 = -1;

    @ObfuscatedName("af.at")
    public int field1040 = -1;

    @ObfuscatedName("af.ao")
    public int[] field1041;

    @ObfuscatedName("af.ag")
    public int[] field1025;

    @ObfuscatedName("af.ax")
    public int field1043 = -1;

    @ObfuscatedName("af.ay")
    public int field1046 = -1;

    @ObfuscatedName("af.ab")
    public int field1045 = 128;

    @ObfuscatedName("af.al")
    public int field1004 = 128;

    @ObfuscatedName("af.ae")
    public int field1013 = 128;

    @ObfuscatedName("af.af")
    public int field1048 = 0;

    @ObfuscatedName("af.aj")
    public int field1049 = 0;

    @ObfuscatedName("af.ah")
    public int field1050 = 0;

    @ObfuscatedName("ao.g(II)Laf;")
    public static class45 method744(int arg0) {
        class45 var1 = (class45) field1007.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1031.method2708(10, arg0);
        class45 var3 = new class45();
        var3.field1047 = arg0;
        if (var2 != null) {
            var3.method872(new class107(var2));
        }
        var3.method879();
        if (var3.field1046 != -1) {
            var3.method913(method744(var3.field1046), method744(var3.field1043));
        }
        if (!Statics.field1006 && var3.field1026) {
            var3.field1017 = class142.field2295;
            var3.field1027 = null;
            var3.field1028 = null;
            var3.field1050 = 0;
        }
        field1007.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.v(B)V")
    public void method879() {
    }

    @ObfuscatedName("af.z(Ldm;B)V")
    public void method872(class107 arg0) {
        while (true) {
            int var2 = arg0.method2139();
            if (var2 == 0) {
                return;
            }
            this.method884(arg0, var2);
        }
    }

    @ObfuscatedName("af.h(Ldm;II)V")
    public void method884(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1012 = arg0.method2141();
        } else if (arg1 == 2) {
            this.field1017 = arg0.method2147();
        } else if (arg1 == 4) {
            this.field1019 = arg0.method2141();
        } else if (arg1 == 5) {
            this.field1008 = arg0.method2141();
        } else if (arg1 == 6) {
            this.field1020 = arg0.method2141();
        } else if (arg1 == 7) {
            this.field1036 = arg0.method2141();
            if (this.field1036 > 32767) {
                this.field1036 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1023 = arg0.method2141();
            if (this.field1023 > 32767) {
                this.field1023 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1024 = 1;
        } else if (arg1 == 12) {
            this.field1011 = arg0.method2144();
        } else if (arg1 == 16) {
            this.field1026 = true;
        } else if (arg1 == 23) {
            this.field1029 = arg0.method2141();
            this.field1022 = arg0.method2139();
        } else if (arg1 == 24) {
            this.field1030 = arg0.method2141();
        } else if (arg1 == 25) {
            this.field1044 = arg0.method2141();
            this.field1034 = arg0.method2139();
        } else if (arg1 == 26) {
            this.field1033 = arg0.method2141();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1027[arg1 - 30] = arg0.method2147();
            if (this.field1027[arg1 - 30].equalsIgnoreCase(class142.field2207)) {
                this.field1027[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1028[arg1 - 35] = arg0.method2147();
        } else if (arg1 == 40) {
            int var3 = arg0.method2139();
            this.field1014 = new short[var3];
            this.field1015 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1014[var4] = (short) arg0.method2141();
                this.field1015[var4] = (short) arg0.method2141();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2139();
            this.field1016 = new short[var5];
            this.field1032 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1016[var6] = (short) arg0.method2141();
                this.field1032[var6] = (short) arg0.method2141();
            }
        } else if (arg1 == 78) {
            this.field1035 = arg0.method2141();
        } else if (arg1 == 79) {
            this.field1042 = arg0.method2141();
        } else if (arg1 == 90) {
            this.field1037 = arg0.method2141();
        } else if (arg1 == 91) {
            this.field1039 = arg0.method2141();
        } else if (arg1 == 92) {
            this.field1038 = arg0.method2141();
        } else if (arg1 == 93) {
            this.field1040 = arg0.method2141();
        } else if (arg1 == 95) {
            this.field1021 = arg0.method2141();
        } else if (arg1 == 97) {
            this.field1043 = arg0.method2141();
        } else if (arg1 == 98) {
            this.field1046 = arg0.method2141();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1041 == null) {
                this.field1041 = new int[10];
                this.field1025 = new int[10];
            }
            this.field1041[arg1 - 100] = arg0.method2141();
            this.field1025[arg1 - 100] = arg0.method2141();
        } else if (arg1 == 110) {
            this.field1045 = arg0.method2141();
        } else if (arg1 == 111) {
            this.field1004 = arg0.method2141();
        } else if (arg1 == 112) {
            this.field1013 = arg0.method2141();
        } else if (arg1 == 113) {
            this.field1048 = arg0.method2140();
        } else if (arg1 == 114) {
            this.field1049 = arg0.method2140();
        } else if (arg1 == 115) {
            this.field1050 = arg0.method2139();
        }
    }

    @ObfuscatedName("af.k(Laf;Laf;I)V")
    public void method913(class45 arg0, class45 arg1) {
        this.field1012 = arg0.field1012;
        this.field1019 = arg0.field1019;
        this.field1008 = arg0.field1008;
        this.field1020 = arg0.field1020;
        this.field1021 = arg0.field1021;
        this.field1036 = arg0.field1036;
        this.field1023 = arg0.field1023;
        this.field1014 = arg0.field1014;
        this.field1015 = arg0.field1015;
        this.field1016 = arg0.field1016;
        this.field1032 = arg0.field1032;
        this.field1017 = arg1.field1017;
        this.field1026 = arg1.field1026;
        this.field1011 = arg1.field1011;
        this.field1024 = 1;
    }

    @ObfuscatedName("af.l(II)Lcv;")
    public final class93 method866(int arg0) {
        if (this.field1041 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1025[var3] && this.field1025[var3] != 0) {
                    var2 = this.field1041[var3];
                }
            }
            if (var2 != -1) {
                return method744(var2).method866(1);
            }
        }
        class93 var4 = class93.method1903(Statics.field1005, this.field1012, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1045 != 128 || this.field1004 != 128 || this.field1013 != 128) {
            var4.method1919(this.field1045, this.field1004, this.field1013);
        }
        if (this.field1014 != null) {
            for (int var5 = 0; var5 < this.field1014.length; var5++) {
                var4.method1916(this.field1014[var5], this.field1015[var5]);
            }
        }
        if (this.field1016 != null) {
            for (int var6 = 0; var6 < this.field1016.length; var6++) {
                var4.method1917(this.field1016[var6], this.field1032[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("af.e(IB)Lce;")
    public final class98 method867(int arg0) {
        if (this.field1041 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1025[var3] && this.field1025[var3] != 0) {
                    var2 = this.field1041[var3];
                }
            }
            if (var2 != -1) {
                return method744(var2).method867(1);
            }
        }
        class98 var4 = (class98) field1018.method3166((long) this.field1047);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1903(Statics.field1005, this.field1012, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1045 != 128 || this.field1004 != 128 || this.field1013 != 128) {
            var5.method1919(this.field1045, this.field1004, this.field1013);
        }
        if (this.field1014 != null) {
            for (int var6 = 0; var6 < this.field1014.length; var6++) {
                var5.method1916(this.field1014[var6], this.field1015[var6]);
            }
        }
        if (this.field1016 != null) {
            for (int var7 = 0; var7 < this.field1016.length; var7++) {
                var5.method1917(this.field1016[var7], this.field1032[var7]);
            }
        }
        class98 var8 = var5.method1963(this.field1048 + 64, this.field1049 * 5 + 768, -50, -10, -50);
        var8.field1716 = true;
        field1018.method3167(var8, (long) this.field1047);
        return var8;
    }

    @ObfuscatedName("af.j(II)Laf;")
    public class45 method916(int arg0) {
        if (this.field1041 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1025[var3] && this.field1025[var3] != 0) {
                    var2 = this.field1041[var3];
                }
            }
            if (var2 != -1) {
                return method744(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("aq.n(IIIIZI)Lbk;")
    public static final class72 method590(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1009.method3166(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method744(arg0);
        if (arg1 > 1 && var8.field1041 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1025[var10] && var8.field1025[var10] != 0) {
                    var9 = var8.field1041[var10];
                }
            }
            if (var9 != -1) {
                var8 = method744(var9);
            }
        }
        class98 var11 = var8.method867(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1046 != -1) {
            var12 = method590(var8.field1043, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1309;
        int var14 = Statics.field1308;
        int var15 = Statics.field1307;
        int[] var16 = new int[4];
        class73.method1536(var16);
        class72 var17 = new class72(36, 32);
        class73.method1565(var17.field1305, 36, 32);
        class73.method1538();
        class84.method1856();
        class84.method1812(16, 16);
        class84.field1479 = false;
        int var18 = var8.field1019;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1471[var8.field1008] * var18 >> 16;
        int var20 = class84.field1476[var8.field1008] * var18 >> 16;
        var11.method2003();
        var11.method2064(0, var8.field1020, var8.field1021, var8.field1008, var8.field1036, var8.field1023 + var11.field1351 / 2 + var19, var8.field1023 + var20);
        if (arg2 >= 1) {
            var17.method1452(1);
        }
        if (arg2 >= 2) {
            var17.method1452(16777215);
        }
        if (arg3 != 0) {
            var17.method1516(arg3);
        }
        class73.method1565(var17.field1305, 36, 32);
        if (var8.field1046 != -1) {
            var12.method1448(0, 0);
        }
        if (!arg4 && (var8.field1024 == 1 || arg1 != 1) && arg1 != -1) {
            class193 var21 = Statics.field1010;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class142.field2172 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class142.field2318 + "</col>";
            }
            var21.method3356(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1009.method3167(var17, var5);
        }
        class73.method1565(var13, var14, var15);
        class73.method1589(var16);
        class84.method1856();
        class84.field1479 = true;
        return var17;
    }

    @ObfuscatedName("af.f(ZI)Z")
    public final boolean method893(boolean arg0) {
        int var2 = this.field1029;
        int var3 = this.field1030;
        int var4 = this.field1035;
        if (arg0) {
            var2 = this.field1044;
            var3 = this.field1033;
            var4 = this.field1042;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1005.method2710(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1005.method2710(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1005.method2710(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("af.a(ZB)Lcv;")
    public final class93 method870(boolean arg0) {
        int var2 = this.field1029;
        int var3 = this.field1030;
        int var4 = this.field1035;
        if (arg0) {
            var2 = this.field1044;
            var3 = this.field1033;
            var4 = this.field1042;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1903(Statics.field1005, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1903(Statics.field1005, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1903(Statics.field1005, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1022 != 0) {
            var5.method1915(0, this.field1022, 0);
        }
        if (arg0 && this.field1034 != 0) {
            var5.method1915(0, this.field1034, 0);
        }
        if (this.field1014 != null) {
            for (int var10 = 0; var10 < this.field1014.length; var10++) {
                var5.method1916(this.field1014[var10], this.field1015[var10]);
            }
        }
        if (this.field1016 != null) {
            for (int var11 = 0; var11 < this.field1016.length; var11++) {
                var5.method1917(this.field1016[var11], this.field1032[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("af.i(ZB)Z")
    public final boolean method871(boolean arg0) {
        int var2 = this.field1037;
        int var3 = this.field1038;
        if (arg0) {
            var2 = this.field1039;
            var3 = this.field1040;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1005.method2710(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1005.method2710(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("af.y(ZI)Lcv;")
    public final class93 method877(boolean arg0) {
        int var2 = this.field1037;
        int var3 = this.field1038;
        if (arg0) {
            var2 = this.field1039;
            var3 = this.field1040;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1903(Statics.field1005, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1903(Statics.field1005, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1014 != null) {
            for (int var7 = 0; var7 < this.field1014.length; var7++) {
                var4.method1916(this.field1014[var7], this.field1015[var7]);
            }
        }
        if (this.field1016 != null) {
            for (int var8 = 0; var8 < this.field1016.length; var8++) {
                var4.method1917(this.field1016[var8], this.field1032[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cn.p(B)V")
    public static void method1900() {
        field1007.method3176();
        field1018.method3176();
        field1009.method3176();
    }

    @ObfuscatedName("cz.q(ZI)V")
    public static void method1891(boolean arg0) {
        if (Statics.field1006 != arg0) {
            method1900();
            Statics.field1006 = arg0;
        }
    }
}
