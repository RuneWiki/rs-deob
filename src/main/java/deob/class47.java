package deob;

@ObfuscatedName("ad")
public class class47 extends class195 {

    @ObfuscatedName("ad.o")
    public static class184 field1034 = new class184(64);

    @ObfuscatedName("ad.m")
    public static class184 field1086 = new class184(50);

    @ObfuscatedName("ad.q")
    public static class184 field1036 = new class184(200);

    @ObfuscatedName("ad.n")
    public int field1038;

    @ObfuscatedName("ad.z")
    public int field1037;

    @ObfuscatedName("ad.r")
    public String field1040 = "null";

    @ObfuscatedName("ad.i")
    public short[] field1041;

    @ObfuscatedName("ad.s")
    public short[] field1031;

    @ObfuscatedName("ad.c")
    public short[] field1029;

    @ObfuscatedName("ad.t")
    public short[] field1044;

    @ObfuscatedName("ad.h")
    public int field1065 = 2000;

    @ObfuscatedName("ad.w")
    public int field1043 = 0;

    @ObfuscatedName("ad.g")
    public int field1047 = 0;

    @ObfuscatedName("ad.f")
    public int field1048 = 0;

    @ObfuscatedName("ad.y")
    public int field1056 = 0;

    @ObfuscatedName("ad.j")
    public int field1050 = 0;

    @ObfuscatedName("ad.x")
    public int field1051 = 0;

    @ObfuscatedName("ad.d")
    public int field1049 = 1;

    @ObfuscatedName("ad.ax")
    public boolean field1053 = false;

    @ObfuscatedName("ad.ag")
    public String[] field1060 = new String[] { null, null, class148.field2339, null, null };

    @ObfuscatedName("ad.ai")
    public String[] field1055 = new String[] { null, null, null, null, class148.field2202 };

    @ObfuscatedName("ad.ar")
    public int field1076 = -1;

    @ObfuscatedName("ad.aw")
    public int field1073 = -1;

    @ObfuscatedName("ad.ac")
    public int field1058 = 0;

    @ObfuscatedName("ad.ap")
    public int field1059 = -1;

    @ObfuscatedName("ad.al")
    public int field1052 = -1;

    @ObfuscatedName("ad.ak")
    public int field1061 = 0;

    @ObfuscatedName("ad.at")
    public int field1062 = -1;

    @ObfuscatedName("ad.au")
    public int field1063 = -1;

    @ObfuscatedName("ad.am")
    public int field1064 = -1;

    @ObfuscatedName("ad.aa")
    public int field1039 = -1;

    @ObfuscatedName("ad.az")
    public int field1035 = -1;

    @ObfuscatedName("ad.ae")
    public int field1067 = -1;

    @ObfuscatedName("ad.ah")
    public int[] field1068;

    @ObfuscatedName("ad.an")
    public int[] field1069;

    @ObfuscatedName("ad.aq")
    public int field1070 = -1;

    @ObfuscatedName("ad.as")
    public int field1057 = -1;

    @ObfuscatedName("ad.ay")
    public int field1072 = 128;

    @ObfuscatedName("ad.ad")
    public int field1046 = 128;

    @ObfuscatedName("ad.af")
    public int field1074 = 128;

    @ObfuscatedName("ad.ab")
    public int field1075 = 0;

    @ObfuscatedName("ad.av")
    public int field1045 = 0;

    @ObfuscatedName("ad.ao")
    public int field1077 = 0;

    @ObfuscatedName("ad.aj")
    public boolean field1078 = false;

    @ObfuscatedName("ad.bj")
    public int field1079 = -1;

    @ObfuscatedName("ad.bv")
    public int field1080 = -1;

    @ObfuscatedName("aj.b(II)Lad;")
    public static class47 method1037(int arg0) {
        class47 var1 = (class47) field1034.method3254((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1071.method2819(10, arg0);
        class47 var3 = new class47();
        var3.field1038 = arg0;
        if (var2 != null) {
            var3.method894(new class111(var2));
        }
        var3.method905();
        if (var3.field1057 != -1) {
            var3.method876(method1037(var3.field1057), method1037(var3.field1070));
        }
        if (var3.field1080 != -1) {
            var3.method895(method1037(var3.field1080), method1037(var3.field1079));
        }
        if (!Statics.field1032 && var3.field1053) {
            var3.field1040 = class148.field2270;
            var3.field1078 = false;
            var3.field1060 = null;
            var3.field1055 = null;
            var3.field1077 = 0;
        }
        field1034.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.e(I)V")
    public void method905() {
    }

    @ObfuscatedName("ad.a(Ldj;I)V")
    public void method894(class111 arg0) {
        while (true) {
            int var2 = arg0.method2127();
            if (var2 == 0) {
                return;
            }
            this.method875(arg0, var2);
        }
    }

    @ObfuscatedName("ad.k(Ldj;IS)V")
    public void method875(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1037 = arg0.method2129();
        } else if (arg1 == 2) {
            this.field1040 = arg0.method2166();
        } else if (arg1 == 4) {
            this.field1065 = arg0.method2129();
        } else if (arg1 == 5) {
            this.field1043 = arg0.method2129();
        } else if (arg1 == 6) {
            this.field1047 = arg0.method2129();
        } else if (arg1 == 7) {
            this.field1056 = arg0.method2129();
            if (this.field1056 > 32767) {
                this.field1056 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1050 = arg0.method2129();
            if (this.field1050 > 32767) {
                this.field1050 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1051 = 1;
        } else if (arg1 == 12) {
            this.field1049 = arg0.method2194();
        } else if (arg1 == 16) {
            this.field1053 = true;
        } else if (arg1 == 23) {
            this.field1076 = arg0.method2129();
            this.field1058 = arg0.method2127();
        } else if (arg1 == 24) {
            this.field1073 = arg0.method2129();
        } else if (arg1 == 25) {
            this.field1059 = arg0.method2129();
            this.field1061 = arg0.method2127();
        } else if (arg1 == 26) {
            this.field1052 = arg0.method2129();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1060[arg1 - 30] = arg0.method2166();
            if (this.field1060[arg1 - 30].equalsIgnoreCase(class148.field2239)) {
                this.field1060[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1055[arg1 - 35] = arg0.method2166();
        } else if (arg1 == 40) {
            int var3 = arg0.method2127();
            this.field1041 = new short[var3];
            this.field1031 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1041[var4] = (short) arg0.method2129();
                this.field1031[var4] = (short) arg0.method2129();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2127();
            this.field1029 = new short[var5];
            this.field1044 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1029[var6] = (short) arg0.method2129();
                this.field1044[var6] = (short) arg0.method2129();
            }
        } else if (arg1 == 65) {
            this.field1078 = true;
        } else if (arg1 == 78) {
            this.field1062 = arg0.method2129();
        } else if (arg1 == 79) {
            this.field1063 = arg0.method2129();
        } else if (arg1 == 90) {
            this.field1064 = arg0.method2129();
        } else if (arg1 == 91) {
            this.field1035 = arg0.method2129();
        } else if (arg1 == 92) {
            this.field1039 = arg0.method2129();
        } else if (arg1 == 93) {
            this.field1067 = arg0.method2129();
        } else if (arg1 == 95) {
            this.field1048 = arg0.method2129();
        } else if (arg1 == 97) {
            this.field1070 = arg0.method2129();
        } else if (arg1 == 98) {
            this.field1057 = arg0.method2129();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1068 == null) {
                this.field1068 = new int[10];
                this.field1069 = new int[10];
            }
            this.field1068[arg1 - 100] = arg0.method2129();
            this.field1069[arg1 - 100] = arg0.method2129();
        } else if (arg1 == 110) {
            this.field1072 = arg0.method2129();
        } else if (arg1 == 111) {
            this.field1046 = arg0.method2129();
        } else if (arg1 == 112) {
            this.field1074 = arg0.method2129();
        } else if (arg1 == 113) {
            this.field1075 = arg0.method2267();
        } else if (arg1 == 114) {
            this.field1045 = arg0.method2267();
        } else if (arg1 == 115) {
            this.field1077 = arg0.method2127();
        } else if (arg1 == 139) {
            this.field1079 = arg0.method2129();
        } else if (arg1 == 140) {
            this.field1080 = arg0.method2129();
        }
    }

    @ObfuscatedName("ad.p(Lad;Lad;I)V")
    public void method876(class47 arg0, class47 arg1) {
        this.field1037 = arg0.field1037;
        this.field1065 = arg0.field1065;
        this.field1043 = arg0.field1043;
        this.field1047 = arg0.field1047;
        this.field1048 = arg0.field1048;
        this.field1056 = arg0.field1056;
        this.field1050 = arg0.field1050;
        this.field1041 = arg0.field1041;
        this.field1031 = arg0.field1031;
        this.field1029 = arg0.field1029;
        this.field1044 = arg0.field1044;
        this.field1040 = arg1.field1040;
        this.field1053 = arg1.field1053;
        this.field1049 = arg1.field1049;
        this.field1051 = 1;
    }

    @ObfuscatedName("ad.l(Lad;Lad;I)V")
    public void method895(class47 arg0, class47 arg1) {
        this.field1037 = arg0.field1037;
        this.field1065 = arg0.field1065;
        this.field1043 = arg0.field1043;
        this.field1047 = arg0.field1047;
        this.field1048 = arg0.field1048;
        this.field1056 = arg0.field1056;
        this.field1050 = arg0.field1050;
        this.field1041 = arg1.field1041;
        this.field1031 = arg1.field1031;
        this.field1029 = arg1.field1029;
        this.field1044 = arg1.field1044;
        this.field1040 = arg1.field1040;
        this.field1053 = arg1.field1053;
        this.field1051 = arg1.field1051;
        this.field1076 = arg1.field1076;
        this.field1073 = arg1.field1073;
        this.field1062 = arg1.field1062;
        this.field1059 = arg1.field1059;
        this.field1052 = arg1.field1052;
        this.field1063 = arg1.field1063;
        this.field1064 = arg1.field1064;
        this.field1039 = arg1.field1039;
        this.field1035 = arg1.field1035;
        this.field1067 = arg1.field1067;
        this.field1077 = arg1.field1077;
        this.field1060 = arg1.field1060;
        this.field1055 = new String[5];
        if (arg1.field1055 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1055[var3] = arg1.field1055[var3];
            }
        }
        this.field1055[4] = class148.field2207;
        this.field1049 = 0;
    }

    @ObfuscatedName("ad.u(IB)Lcc;")
    public final class95 method878(int arg0) {
        if (this.field1068 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1069[var3] && this.field1069[var3] != 0) {
                    var2 = this.field1068[var3];
                }
            }
            if (var2 != -1) {
                return method1037(var2).method878(1);
            }
        }
        class95 var4 = class95.method1878(Statics.field2941, this.field1037, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1072 != 128 || this.field1046 != 128 || this.field1074 != 128) {
            var4.method1893(this.field1072, this.field1046, this.field1074);
        }
        if (this.field1041 != null) {
            for (int var5 = 0; var5 < this.field1041.length; var5++) {
                var4.method1877(this.field1041[var5], this.field1031[var5]);
            }
        }
        if (this.field1029 != null) {
            for (int var6 = 0; var6 < this.field1029.length; var6++) {
                var4.method1891(this.field1029[var6], this.field1044[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.o(II)Lcx;")
    public final class100 method909(int arg0) {
        if (this.field1068 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1069[var3] && this.field1069[var3] != 0) {
                    var2 = this.field1068[var3];
                }
            }
            if (var2 != -1) {
                return method1037(var2).method909(1);
            }
        }
        class100 var4 = (class100) field1086.method3254((long) this.field1038);
        if (var4 != null) {
            return var4;
        }
        class95 var5 = class95.method1878(Statics.field2941, this.field1037, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1072 != 128 || this.field1046 != 128 || this.field1074 != 128) {
            var5.method1893(this.field1072, this.field1046, this.field1074);
        }
        if (this.field1041 != null) {
            for (int var6 = 0; var6 < this.field1041.length; var6++) {
                var5.method1877(this.field1041[var6], this.field1031[var6]);
            }
        }
        if (this.field1029 != null) {
            for (int var7 = 0; var7 < this.field1029.length; var7++) {
                var5.method1891(this.field1029[var7], this.field1044[var7]);
            }
        }
        class100 var8 = var5.method1898(this.field1075 + 64, this.field1045 * 5 + 768, -50, -10, -50);
        var8.field1770 = true;
        field1086.method3256(var8, (long) this.field1038);
        return var8;
    }

    @ObfuscatedName("ad.m(II)Lad;")
    public class47 method879(int arg0) {
        if (this.field1068 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1069[var3] && this.field1069[var3] != 0) {
                    var2 = this.field1068[var3];
                }
            }
            if (var2 != -1) {
                return method1037(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cj.q(IIIIIZB)Lbf;")
    public static final class74 method2058(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class74 var8 = (class74) field1036.method3254(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class47 var9 = method1037(arg0);
        if (arg1 > 1 && var9.field1068 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1069[var11] && var9.field1069[var11] != 0) {
                    var10 = var9.field1068[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1037(var10);
            }
        }
        class100 var12 = var9.method909(1);
        if (var12 == null) {
            return null;
        }
        class74 var13 = null;
        if (var9.field1057 != -1) {
            var13 = method2058(var9.field1070, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1080 != -1) {
            var13 = method2058(var9.field1079, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1349;
        int var15 = Statics.field1343;
        int var16 = Statics.field1345;
        int[] var17 = new int[4];
        class75.method1501(var17);
        class74 var18 = new class74(36, 32);
        class75.method1556(var18.field1340, 36, 32);
        class75.method1530();
        class86.method1825();
        class86.method1780(16, 16);
        class86.field1509 = false;
        int var19 = var9.field1065;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class86.field1515[var9.field1043] * var19 >> 16;
        int var21 = class86.field1516[var9.field1043] * var19 >> 16;
        var12.method1974();
        var12.method1982(0, var9.field1047, var9.field1048, var9.field1043, var9.field1056, var9.field1050 + var12.field1384 / 2 + var20, var9.field1050 + var21);
        if (var9.field1080 != -1) {
            var13.method1415(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1411(1);
        }
        if (arg2 >= 2) {
            var18.method1411(16777215);
        }
        if (arg3 != 0) {
            var18.method1412(arg3);
        }
        class75.method1556(var18.field1340, 36, 32);
        if (var9.field1057 != -1) {
            var13.method1415(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1051 == 1) {
            Statics.field1066.method3588(method1(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1036.method3256(var18, var6);
        }
        class75.method1556(var14, var15, var16);
        class75.method1496(var17);
        class86.method1825();
        class86.field1509 = true;
        return var18;
    }

    @ObfuscatedName("b.v(IB)Ljava/lang/String;")
    public static final String method1(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class148.field2266 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class148.field2363 + "</col>";
        }
    }

    @ObfuscatedName("ad.n(ZI)Z")
    public final boolean method880(boolean arg0) {
        int var2 = this.field1076;
        int var3 = this.field1073;
        int var4 = this.field1062;
        if (arg0) {
            var2 = this.field1059;
            var3 = this.field1052;
            var4 = this.field1063;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2941.method2821(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2941.method2821(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2941.method2821(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ad.z(ZI)Lcc;")
    public final class95 method881(boolean arg0) {
        int var2 = this.field1076;
        int var3 = this.field1073;
        int var4 = this.field1062;
        if (arg0) {
            var2 = this.field1059;
            var3 = this.field1052;
            var4 = this.field1063;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var5 = class95.method1878(Statics.field2941, var2, 0);
        if (var3 != -1) {
            class95 var6 = class95.method1878(Statics.field2941, var3, 0);
            if (var4 == -1) {
                class95[] var9 = new class95[] { var5, var6 };
                var5 = new class95(var9, 2);
            } else {
                class95 var7 = class95.method1878(Statics.field2941, var4, 0);
                class95[] var8 = new class95[] { var5, var6, var7 };
                var5 = new class95(var8, 3);
            }
        }
        if (!arg0 && this.field1058 != 0) {
            var5.method1889(0, this.field1058, 0);
        }
        if (arg0 && this.field1061 != 0) {
            var5.method1889(0, this.field1061, 0);
        }
        if (this.field1041 != null) {
            for (int var10 = 0; var10 < this.field1041.length; var10++) {
                var5.method1877(this.field1041[var10], this.field1031[var10]);
            }
        }
        if (this.field1029 != null) {
            for (int var11 = 0; var11 < this.field1029.length; var11++) {
                var5.method1891(this.field1029[var11], this.field1044[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ad.r(ZI)Z")
    public final boolean method916(boolean arg0) {
        int var2 = this.field1064;
        int var3 = this.field1039;
        if (arg0) {
            var2 = this.field1035;
            var3 = this.field1067;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2941.method2821(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2941.method2821(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ad.i(ZI)Lcc;")
    public final class95 method883(boolean arg0) {
        int var2 = this.field1064;
        int var3 = this.field1039;
        if (arg0) {
            var2 = this.field1035;
            var3 = this.field1067;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var4 = class95.method1878(Statics.field2941, var2, 0);
        if (var3 != -1) {
            class95 var5 = class95.method1878(Statics.field2941, var3, 0);
            class95[] var6 = new class95[] { var4, var5 };
            var4 = new class95(var6, 2);
        }
        if (this.field1041 != null) {
            for (int var7 = 0; var7 < this.field1041.length; var7++) {
                var4.method1877(this.field1041[var7], this.field1031[var7]);
            }
        }
        if (this.field1029 != null) {
            for (int var8 = 0; var8 < this.field1029.length; var8++) {
                var4.method1891(this.field1029[var8], this.field1044[var8]);
            }
        }
        return var4;
    }
}
