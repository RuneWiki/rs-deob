package deob;

@ObfuscatedName("ad")
public class class47 extends class194 {

    @ObfuscatedName("ad.r")
    public static class183 field995 = new class183(64);

    @ObfuscatedName("ad.f")
    public static class183 field1023 = new class183(50);

    @ObfuscatedName("ad.g")
    public static class183 field997 = new class183(100);

    @ObfuscatedName("ad.h")
    public int field998;

    @ObfuscatedName("ad.s")
    public int field999;

    @ObfuscatedName("ad.j")
    public String field1000 = "null";

    @ObfuscatedName("ad.m")
    public short[] field1001;

    @ObfuscatedName("ad.t")
    public short[] field1002;

    @ObfuscatedName("ad.z")
    public short[] field1003;

    @ObfuscatedName("ad.y")
    public short[] field1014;

    @ObfuscatedName("ad.q")
    public int field1005 = 2000;

    @ObfuscatedName("ad.d")
    public int field1006 = 0;

    @ObfuscatedName("ad.b")
    public int field1007 = 0;

    @ObfuscatedName("ad.x")
    public int field1008 = 0;

    @ObfuscatedName("ad.n")
    public int field1009 = 0;

    @ObfuscatedName("ad.v")
    public int field1028 = 0;

    @ObfuscatedName("ad.p")
    public int field1032 = 0;

    @ObfuscatedName("ad.k")
    public int field1012 = 1;

    @ObfuscatedName("ad.ax")
    public boolean field1004 = false;

    @ObfuscatedName("ad.ap")
    public String[] field1018 = new String[] { null, null, class148.field2283, null, null };

    @ObfuscatedName("ad.ao")
    public String[] field1015 = new String[] { null, null, null, null, class148.field2161 };

    @ObfuscatedName("ad.ai")
    public int field1016 = -1;

    @ObfuscatedName("ad.aw")
    public int field1017 = -1;

    @ObfuscatedName("ad.am")
    public int field994 = 0;

    @ObfuscatedName("ad.au")
    public int field1019 = -1;

    @ObfuscatedName("ad.ae")
    public int field1043 = -1;

    @ObfuscatedName("ad.ab")
    public int field1021 = 0;

    @ObfuscatedName("ad.av")
    public int field1022 = -1;

    @ObfuscatedName("ad.ay")
    public int field991 = -1;

    @ObfuscatedName("ad.ag")
    public int field1024 = -1;

    @ObfuscatedName("ad.aj")
    public int field1020 = -1;

    @ObfuscatedName("ad.ah")
    public int field1026 = -1;

    @ObfuscatedName("ad.at")
    public int field1027 = -1;

    @ObfuscatedName("ad.al")
    public int[] field1033;

    @ObfuscatedName("ad.ak")
    public int[] field1029;

    @ObfuscatedName("ad.ar")
    public int field1030 = -1;

    @ObfuscatedName("ad.aq")
    public int field1031 = -1;

    @ObfuscatedName("ad.ac")
    public int field1042 = 128;

    @ObfuscatedName("ad.ad")
    public int field1034 = 128;

    @ObfuscatedName("ad.an")
    public int field996 = 128;

    @ObfuscatedName("ad.az")
    public int field1035 = 0;

    @ObfuscatedName("ad.af")
    public int field1036 = 0;

    @ObfuscatedName("ad.as")
    public int field1037 = 0;

    @ObfuscatedName("ad.aa")
    public boolean field1038 = false;

    @ObfuscatedName("ad.bl")
    public int field1039 = -1;

    @ObfuscatedName("ad.bk")
    public int field1040 = -1;

    @ObfuscatedName("dj.e(IB)Lad;")
    public static class47 method2467(int arg0) {
        class47 var1 = (class47) field995.method3302((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1013.method2843(10, arg0);
        class47 var3 = new class47();
        var3.field998 = arg0;
        if (var2 != null) {
            var3.method926(new class111(var2));
        }
        var3.method883();
        if (var3.field1031 != -1) {
            var3.method886(method2467(var3.field1031), method2467(var3.field1030));
        }
        if (var3.field1040 != -1) {
            var3.method887(method2467(var3.field1040), method2467(var3.field1039));
        }
        if (!Statics.field1904 && var3.field1004) {
            var3.field1000 = class148.field2240;
            var3.field1038 = false;
            var3.field1018 = null;
            var3.field1015 = null;
            var3.field1037 = 0;
        }
        field995.method3304(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.a(B)V")
    public void method883() {
    }

    @ObfuscatedName("ad.l(Ldh;I)V")
    public void method926(class111 arg0) {
        while (true) {
            int var2 = arg0.method2176();
            if (var2 == 0) {
                return;
            }
            this.method925(arg0, var2);
        }
    }

    @ObfuscatedName("ad.c(Ldh;IB)V")
    public void method925(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field999 = arg0.method2178();
        } else if (arg1 == 2) {
            this.field1000 = arg0.method2167();
        } else if (arg1 == 4) {
            this.field1005 = arg0.method2178();
        } else if (arg1 == 5) {
            this.field1006 = arg0.method2178();
        } else if (arg1 == 6) {
            this.field1007 = arg0.method2178();
        } else if (arg1 == 7) {
            this.field1009 = arg0.method2178();
            if (this.field1009 > 32767) {
                this.field1009 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1028 = arg0.method2178();
            if (this.field1028 > 32767) {
                this.field1028 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1032 = 1;
        } else if (arg1 == 12) {
            this.field1012 = arg0.method2378();
        } else if (arg1 == 16) {
            this.field1004 = true;
        } else if (arg1 == 23) {
            this.field1016 = arg0.method2178();
            this.field994 = arg0.method2176();
        } else if (arg1 == 24) {
            this.field1017 = arg0.method2178();
        } else if (arg1 == 25) {
            this.field1019 = arg0.method2178();
            this.field1021 = arg0.method2176();
        } else if (arg1 == 26) {
            this.field1043 = arg0.method2178();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1018[arg1 - 30] = arg0.method2167();
            if (this.field1018[arg1 - 30].equalsIgnoreCase(class148.field2162)) {
                this.field1018[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1015[arg1 - 35] = arg0.method2167();
        } else if (arg1 == 40) {
            int var3 = arg0.method2176();
            this.field1001 = new short[var3];
            this.field1002 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1001[var4] = (short) arg0.method2178();
                this.field1002[var4] = (short) arg0.method2178();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2176();
            this.field1003 = new short[var5];
            this.field1014 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1003[var6] = (short) arg0.method2178();
                this.field1014[var6] = (short) arg0.method2178();
            }
        } else if (arg1 == 65) {
            this.field1038 = true;
        } else if (arg1 == 78) {
            this.field1022 = arg0.method2178();
        } else if (arg1 == 79) {
            this.field991 = arg0.method2178();
        } else if (arg1 == 90) {
            this.field1024 = arg0.method2178();
        } else if (arg1 == 91) {
            this.field1026 = arg0.method2178();
        } else if (arg1 == 92) {
            this.field1020 = arg0.method2178();
        } else if (arg1 == 93) {
            this.field1027 = arg0.method2178();
        } else if (arg1 == 95) {
            this.field1008 = arg0.method2178();
        } else if (arg1 == 97) {
            this.field1030 = arg0.method2178();
        } else if (arg1 == 98) {
            this.field1031 = arg0.method2178();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1033 == null) {
                this.field1033 = new int[10];
                this.field1029 = new int[10];
            }
            this.field1033[arg1 - 100] = arg0.method2178();
            this.field1029[arg1 - 100] = arg0.method2178();
        } else if (arg1 == 110) {
            this.field1042 = arg0.method2178();
        } else if (arg1 == 111) {
            this.field1034 = arg0.method2178();
        } else if (arg1 == 112) {
            this.field996 = arg0.method2178();
        } else if (arg1 == 113) {
            this.field1035 = arg0.method2162();
        } else if (arg1 == 114) {
            this.field1036 = arg0.method2162() * 5;
        } else if (arg1 == 115) {
            this.field1037 = arg0.method2176();
        } else if (arg1 == 139) {
            this.field1039 = arg0.method2178();
        } else if (arg1 == 140) {
            this.field1040 = arg0.method2178();
        }
    }

    @ObfuscatedName("ad.u(Lad;Lad;I)V")
    public void method886(class47 arg0, class47 arg1) {
        this.field999 = arg0.field999;
        this.field1005 = arg0.field1005;
        this.field1006 = arg0.field1006;
        this.field1007 = arg0.field1007;
        this.field1008 = arg0.field1008;
        this.field1009 = arg0.field1009;
        this.field1028 = arg0.field1028;
        this.field1001 = arg0.field1001;
        this.field1002 = arg0.field1002;
        this.field1003 = arg0.field1003;
        this.field1014 = arg0.field1014;
        this.field1000 = arg1.field1000;
        this.field1004 = arg1.field1004;
        this.field1012 = arg1.field1012;
        this.field1032 = 1;
    }

    @ObfuscatedName("ad.w(Lad;Lad;I)V")
    public void method887(class47 arg0, class47 arg1) {
        this.field999 = arg0.field999;
        this.field1005 = arg0.field1005;
        this.field1006 = arg0.field1006;
        this.field1007 = arg0.field1007;
        this.field1008 = arg0.field1008;
        this.field1009 = arg0.field1009;
        this.field1028 = arg0.field1028;
        this.field1001 = arg1.field1001;
        this.field1002 = arg1.field1002;
        this.field1003 = arg1.field1003;
        this.field1014 = arg1.field1014;
        this.field1000 = arg1.field1000;
        this.field1004 = arg1.field1004;
        this.field1032 = arg1.field1032;
        this.field1016 = arg1.field1016;
        this.field1017 = arg1.field1017;
        this.field1022 = arg1.field1022;
        this.field1019 = arg1.field1019;
        this.field1043 = arg1.field1043;
        this.field991 = arg1.field991;
        this.field1024 = arg1.field1024;
        this.field1020 = arg1.field1020;
        this.field1026 = arg1.field1026;
        this.field1027 = arg1.field1027;
        this.field1037 = arg1.field1037;
        this.field1018 = arg1.field1018;
        this.field1015 = new String[5];
        if (arg1.field1015 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1015[var3] = arg1.field1015[var3];
            }
        }
        this.field1015[4] = class148.field2166;
        this.field1012 = 0;
    }

    @ObfuscatedName("ad.i(II)Lcr;")
    public final class95 method888(int arg0) {
        if (this.field1033 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1029[var3] && this.field1029[var3] != 0) {
                    var2 = this.field1033[var3];
                }
            }
            if (var2 != -1) {
                return method2467(var2).method888(1);
            }
        }
        class95 var4 = class95.method1937(Statics.field58, this.field999, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1042 != 128 || this.field1034 != 128 || this.field996 != 128) {
            var4.method1953(this.field1042, this.field1034, this.field996);
        }
        if (this.field1001 != null) {
            for (int var5 = 0; var5 < this.field1001.length; var5++) {
                var4.method1936(this.field1001[var5], this.field1002[var5]);
            }
        }
        if (this.field1003 != null) {
            for (int var6 = 0; var6 < this.field1003.length; var6++) {
                var4.method1951(this.field1003[var6], this.field1014[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.r(IB)Lcy;")
    public final class100 method889(int arg0) {
        if (this.field1033 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1029[var3] && this.field1029[var3] != 0) {
                    var2 = this.field1033[var3];
                }
            }
            if (var2 != -1) {
                return method2467(var2).method889(1);
            }
        }
        class100 var4 = (class100) field1023.method3302((long) this.field998);
        if (var4 != null) {
            return var4;
        }
        class95 var5 = class95.method1937(Statics.field58, this.field999, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1042 != 128 || this.field1034 != 128 || this.field996 != 128) {
            var5.method1953(this.field1042, this.field1034, this.field996);
        }
        if (this.field1001 != null) {
            for (int var6 = 0; var6 < this.field1001.length; var6++) {
                var5.method1936(this.field1001[var6], this.field1002[var6]);
            }
        }
        if (this.field1003 != null) {
            for (int var7 = 0; var7 < this.field1003.length; var7++) {
                var5.method1951(this.field1003[var7], this.field1014[var7]);
            }
        }
        class100 var8 = var5.method1957(this.field1035 + 64, this.field1036 + 768, -50, -10, -50);
        var8.field1706 = true;
        field1023.method3304(var8, (long) this.field998);
        return var8;
    }

    @ObfuscatedName("ad.f(II)Lad;")
    public class47 method902(int arg0) {
        if (this.field1033 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1029[var3] && this.field1029[var3] != 0) {
                    var2 = this.field1033[var3];
                }
            }
            if (var2 != -1) {
                return method2467(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("dx.g(IIIIIZI)Lbh;")
    public static final class74 method2510(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class74 var8 = (class74) field997.method3302(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class47 var9 = method2467(arg0);
        if (arg1 > 1 && var9.field1033 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1029[var11] && var9.field1029[var11] != 0) {
                    var10 = var9.field1033[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2467(var10);
            }
        }
        class100 var12 = var9.method889(1);
        if (var12 == null) {
            return null;
        }
        class74 var13 = null;
        if (var9.field1031 != -1) {
            var13 = method2510(var9.field1030, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1040 != -1) {
            var13 = method2510(var9.field1039, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1289;
        int var15 = Statics.field1283;
        int var16 = Statics.field1285;
        int[] var17 = new int[4];
        class75.method1574(var17);
        class74 var18 = new class74(36, 32);
        class75.method1570(var18.field1271, 36, 32);
        class75.method1588();
        class86.method1829();
        class86.method1837(16, 16);
        class86.field1443 = false;
        int var19 = var9.field1005;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class86.field1449[var9.field1006] * var19 >> 16;
        int var21 = class86.field1440[var9.field1006] * var19 >> 16;
        var12.method2051();
        var12.method2032(0, var9.field1007, var9.field1008, var9.field1006, var9.field1009, var9.field1028 + var12.field1324 / 2 + var20, var9.field1028 + var21);
        if (var9.field1040 != -1) {
            var13.method1494(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1486(1);
        }
        if (arg2 >= 2) {
            var18.method1486(16777215);
        }
        if (arg3 != 0) {
            var18.method1487(arg3);
        }
        class75.method1570(var18.field1271, 36, 32);
        if (var9.field1031 != -1) {
            var13.method1494(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1032 == 1) {
            class214 var22 = Statics.field3021;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class148.field2324 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class148.field2322 + "</col>";
            }
            var22.method3622(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field997.method3304(var18, var6);
        }
        class75.method1570(var14, var15, var16);
        class75.method1601(var17);
        class86.method1829();
        class86.field1443 = true;
        return var18;
    }

    @ObfuscatedName("ad.o(ZI)Z")
    public final boolean method934(boolean arg0) {
        int var2 = this.field1016;
        int var3 = this.field1017;
        int var4 = this.field1022;
        if (arg0) {
            var2 = this.field1019;
            var3 = this.field1043;
            var4 = this.field991;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field58.method2856(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field58.method2856(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field58.method2856(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ad.h(ZI)Lcr;")
    public final class95 method905(boolean arg0) {
        int var2 = this.field1016;
        int var3 = this.field1017;
        int var4 = this.field1022;
        if (arg0) {
            var2 = this.field1019;
            var3 = this.field1043;
            var4 = this.field991;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var5 = class95.method1937(Statics.field58, var2, 0);
        if (var3 != -1) {
            class95 var6 = class95.method1937(Statics.field58, var3, 0);
            if (var4 == -1) {
                class95[] var9 = new class95[] { var5, var6 };
                var5 = new class95(var9, 2);
            } else {
                class95 var7 = class95.method1937(Statics.field58, var4, 0);
                class95[] var8 = new class95[] { var5, var6, var7 };
                var5 = new class95(var8, 3);
            }
        }
        if (!arg0 && this.field994 != 0) {
            var5.method1997(0, this.field994, 0);
        }
        if (arg0 && this.field1021 != 0) {
            var5.method1997(0, this.field1021, 0);
        }
        if (this.field1001 != null) {
            for (int var10 = 0; var10 < this.field1001.length; var10++) {
                var5.method1936(this.field1001[var10], this.field1002[var10]);
            }
        }
        if (this.field1003 != null) {
            for (int var11 = 0; var11 < this.field1003.length; var11++) {
                var5.method1951(this.field1003[var11], this.field1014[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ad.s(ZB)Z")
    public final boolean method893(boolean arg0) {
        int var2 = this.field1024;
        int var3 = this.field1020;
        if (arg0) {
            var2 = this.field1026;
            var3 = this.field1027;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field58.method2856(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field58.method2856(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ad.j(ZI)Lcr;")
    public final class95 method894(boolean arg0) {
        int var2 = this.field1024;
        int var3 = this.field1020;
        if (arg0) {
            var2 = this.field1026;
            var3 = this.field1027;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var4 = class95.method1937(Statics.field58, var2, 0);
        if (var3 != -1) {
            class95 var5 = class95.method1937(Statics.field58, var3, 0);
            class95[] var6 = new class95[] { var4, var5 };
            var4 = new class95(var6, 2);
        }
        if (this.field1001 != null) {
            for (int var7 = 0; var7 < this.field1001.length; var7++) {
                var4.method1936(this.field1001[var7], this.field1002[var7]);
            }
        }
        if (this.field1003 != null) {
            for (int var8 = 0; var8 < this.field1003.length; var8++) {
                var4.method1951(this.field1003[var8], this.field1014[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("au.m(B)V")
    public static void method626() {
        field997.method3303();
    }
}
