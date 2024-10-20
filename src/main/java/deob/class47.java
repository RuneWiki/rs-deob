package deob;

@ObfuscatedName("aj")
public class class47 extends class195 {

    @ObfuscatedName("aj.m")
    public static class184 field1045 = new class184(64);

    @ObfuscatedName("aj.a")
    public static class184 field1046 = new class184(50);

    @ObfuscatedName("aj.h")
    public static class184 field1047 = new class184(200);

    @ObfuscatedName("aj.u")
    public int field1048;

    @ObfuscatedName("aj.q")
    public int field1049;

    @ObfuscatedName("aj.k")
    public String field1077 = "null";

    @ObfuscatedName("aj.x")
    public short[] field1051;

    @ObfuscatedName("aj.r")
    public short[] field1052;

    @ObfuscatedName("aj.j")
    public short[] field1053;

    @ObfuscatedName("aj.s")
    public short[] field1054;

    @ObfuscatedName("aj.v")
    public int field1055 = 2000;

    @ObfuscatedName("aj.c")
    public int field1056 = 0;

    @ObfuscatedName("aj.p")
    public int field1057 = 0;

    @ObfuscatedName("aj.o")
    public int field1058 = 0;

    @ObfuscatedName("aj.b")
    public int field1059 = 0;

    @ObfuscatedName("aj.t")
    public int field1050 = 0;

    @ObfuscatedName("aj.w")
    public int field1084 = 0;

    @ObfuscatedName("aj.i")
    public int field1062 = 1;

    @ObfuscatedName("aj.ad")
    public boolean field1072 = false;

    @ObfuscatedName("aj.ak")
    public String[] field1043 = new String[] { null, null, class148.field2453, null, null };

    @ObfuscatedName("aj.ae")
    public String[] field1065 = new String[] { null, null, null, null, class148.field2206 };

    @ObfuscatedName("aj.ax")
    public int field1066 = -1;

    @ObfuscatedName("aj.al")
    public int field1041 = -1;

    @ObfuscatedName("aj.ar")
    public int field1068 = 0;

    @ObfuscatedName("aj.as")
    public int field1069 = -1;

    @ObfuscatedName("aj.ab")
    public int field1079 = -1;

    @ObfuscatedName("aj.ao")
    public int field1071 = 0;

    @ObfuscatedName("aj.ac")
    public int field1040 = -1;

    @ObfuscatedName("aj.az")
    public int field1073 = -1;

    @ObfuscatedName("aj.at")
    public int field1074 = -1;

    @ObfuscatedName("aj.aa")
    public int field1075 = -1;

    @ObfuscatedName("aj.an")
    public int field1076 = -1;

    @ObfuscatedName("aj.aw")
    public int field1092 = -1;

    @ObfuscatedName("aj.ai")
    public int[] field1078;

    @ObfuscatedName("aj.ah")
    public int[] field1064;

    @ObfuscatedName("aj.aq")
    public int field1060 = -1;

    @ObfuscatedName("aj.ay")
    public int field1081 = -1;

    @ObfuscatedName("aj.am")
    public int field1063 = 128;

    @ObfuscatedName("aj.aj")
    public int field1080 = 128;

    @ObfuscatedName("aj.ag")
    public int field1082 = 128;

    @ObfuscatedName("aj.ap")
    public int field1067 = 0;

    @ObfuscatedName("aj.af")
    public int field1061 = 0;

    @ObfuscatedName("aj.au")
    public int field1087 = 0;

    @ObfuscatedName("aj.av")
    public boolean field1088 = false;

    @ObfuscatedName("aj.bs")
    public int field1089 = -1;

    @ObfuscatedName("aj.bo")
    public int field1090 = -1;

    @ObfuscatedName("gk.d(IB)Laj;")
    public static class47 method3569(int arg0) {
        class47 var1 = (class47) field1045.method3411((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1042.method2948(10, arg0);
        class47 var3 = new class47();
        var3.field1048 = arg0;
        if (var2 != null) {
            var3.method896(new class111(var2));
        }
        var3.method895();
        if (var3.field1081 != -1) {
            var3.method909(method3569(var3.field1081), method3569(var3.field1060));
        }
        if (var3.field1090 != -1) {
            var3.method899(method3569(var3.field1090), method3569(var3.field1089));
        }
        if (!Statics.field2598 && var3.field1072) {
            var3.field1077 = class148.field2335;
            var3.field1088 = false;
            var3.field1043 = null;
            var3.field1065 = null;
            var3.field1087 = 0;
        }
        field1045.method3420(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.z(I)V")
    public void method895() {
    }

    @ObfuscatedName("aj.y(Ldl;B)V")
    public void method896(class111 arg0) {
        while (true) {
            int var2 = arg0.method2228();
            if (var2 == 0) {
                return;
            }
            this.method917(arg0, var2);
        }
    }

    @ObfuscatedName("aj.e(Ldl;II)V")
    public void method917(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1049 = arg0.method2231();
        } else if (arg1 == 2) {
            this.field1077 = arg0.method2290();
        } else if (arg1 == 4) {
            this.field1055 = arg0.method2231();
        } else if (arg1 == 5) {
            this.field1056 = arg0.method2231();
        } else if (arg1 == 6) {
            this.field1057 = arg0.method2231();
        } else if (arg1 == 7) {
            this.field1059 = arg0.method2231();
            if (this.field1059 > 32767) {
                this.field1059 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1050 = arg0.method2231();
            if (this.field1050 > 32767) {
                this.field1050 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1084 = 1;
        } else if (arg1 == 12) {
            this.field1062 = arg0.method2233();
        } else if (arg1 == 16) {
            this.field1072 = true;
        } else if (arg1 == 23) {
            this.field1066 = arg0.method2231();
            this.field1068 = arg0.method2228();
        } else if (arg1 == 24) {
            this.field1041 = arg0.method2231();
        } else if (arg1 == 25) {
            this.field1069 = arg0.method2231();
            this.field1071 = arg0.method2228();
        } else if (arg1 == 26) {
            this.field1079 = arg0.method2231();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1043[arg1 - 30] = arg0.method2290();
            if (this.field1043[arg1 - 30].equalsIgnoreCase(class148.field2257)) {
                this.field1043[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1065[arg1 - 35] = arg0.method2290();
        } else if (arg1 == 40) {
            int var3 = arg0.method2228();
            this.field1051 = new short[var3];
            this.field1052 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1051[var4] = (short) arg0.method2231();
                this.field1052[var4] = (short) arg0.method2231();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2228();
            this.field1053 = new short[var5];
            this.field1054 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1053[var6] = (short) arg0.method2231();
                this.field1054[var6] = (short) arg0.method2231();
            }
        } else if (arg1 == 65) {
            this.field1088 = true;
        } else if (arg1 == 78) {
            this.field1040 = arg0.method2231();
        } else if (arg1 == 79) {
            this.field1073 = arg0.method2231();
        } else if (arg1 == 90) {
            this.field1074 = arg0.method2231();
        } else if (arg1 == 91) {
            this.field1076 = arg0.method2231();
        } else if (arg1 == 92) {
            this.field1075 = arg0.method2231();
        } else if (arg1 == 93) {
            this.field1092 = arg0.method2231();
        } else if (arg1 == 95) {
            this.field1058 = arg0.method2231();
        } else if (arg1 == 97) {
            this.field1060 = arg0.method2231();
        } else if (arg1 == 98) {
            this.field1081 = arg0.method2231();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1078 == null) {
                this.field1078 = new int[10];
                this.field1064 = new int[10];
            }
            this.field1078[arg1 - 100] = arg0.method2231();
            this.field1064[arg1 - 100] = arg0.method2231();
        } else if (arg1 == 110) {
            this.field1063 = arg0.method2231();
        } else if (arg1 == 111) {
            this.field1080 = arg0.method2231();
        } else if (arg1 == 112) {
            this.field1082 = arg0.method2231();
        } else if (arg1 == 113) {
            this.field1067 = arg0.method2409();
        } else if (arg1 == 114) {
            this.field1061 = arg0.method2409() * 5;
        } else if (arg1 == 115) {
            this.field1087 = arg0.method2228();
        } else if (arg1 == 139) {
            this.field1089 = arg0.method2231();
        } else if (arg1 == 140) {
            this.field1090 = arg0.method2231();
        }
    }

    @ObfuscatedName("aj.g(Laj;Laj;I)V")
    public void method909(class47 arg0, class47 arg1) {
        this.field1049 = arg0.field1049;
        this.field1055 = arg0.field1055;
        this.field1056 = arg0.field1056;
        this.field1057 = arg0.field1057;
        this.field1058 = arg0.field1058;
        this.field1059 = arg0.field1059;
        this.field1050 = arg0.field1050;
        this.field1051 = arg0.field1051;
        this.field1052 = arg0.field1052;
        this.field1053 = arg0.field1053;
        this.field1054 = arg0.field1054;
        this.field1077 = arg1.field1077;
        this.field1072 = arg1.field1072;
        this.field1062 = arg1.field1062;
        this.field1084 = 1;
    }

    @ObfuscatedName("aj.f(Laj;Laj;I)V")
    public void method899(class47 arg0, class47 arg1) {
        this.field1049 = arg0.field1049;
        this.field1055 = arg0.field1055;
        this.field1056 = arg0.field1056;
        this.field1057 = arg0.field1057;
        this.field1058 = arg0.field1058;
        this.field1059 = arg0.field1059;
        this.field1050 = arg0.field1050;
        this.field1051 = arg1.field1051;
        this.field1052 = arg1.field1052;
        this.field1053 = arg1.field1053;
        this.field1054 = arg1.field1054;
        this.field1077 = arg1.field1077;
        this.field1072 = arg1.field1072;
        this.field1084 = arg1.field1084;
        this.field1066 = arg1.field1066;
        this.field1041 = arg1.field1041;
        this.field1040 = arg1.field1040;
        this.field1069 = arg1.field1069;
        this.field1079 = arg1.field1079;
        this.field1073 = arg1.field1073;
        this.field1074 = arg1.field1074;
        this.field1075 = arg1.field1075;
        this.field1076 = arg1.field1076;
        this.field1092 = arg1.field1092;
        this.field1087 = arg1.field1087;
        this.field1043 = arg1.field1043;
        this.field1065 = new String[5];
        if (arg1.field1065 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1065[var3] = arg1.field1065[var3];
            }
        }
        this.field1065[4] = class148.field2211;
        this.field1062 = 0;
    }

    @ObfuscatedName("aj.m(II)Lcy;")
    public final class95 method900(int arg0) {
        if (this.field1078 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1064[var3] && this.field1064[var3] != 0) {
                    var2 = this.field1078[var3];
                }
            }
            if (var2 != -1) {
                return method3569(var2).method900(1);
            }
        }
        class95 var4 = class95.method1969(Statics.field1085, this.field1049, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1063 != 128 || this.field1080 != 128 || this.field1082 != 128) {
            var4.method1985(this.field1063, this.field1080, this.field1082);
        }
        if (this.field1051 != null) {
            for (int var5 = 0; var5 < this.field1051.length; var5++) {
                var4.method2001(this.field1051[var5], this.field1052[var5]);
            }
        }
        if (this.field1053 != null) {
            for (int var6 = 0; var6 < this.field1053.length; var6++) {
                var4.method2000(this.field1053[var6], this.field1054[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aj.a(II)Lcg;")
    public final class100 method901(int arg0) {
        if (this.field1078 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1064[var3] && this.field1064[var3] != 0) {
                    var2 = this.field1078[var3];
                }
            }
            if (var2 != -1) {
                return method3569(var2).method901(1);
            }
        }
        class100 var4 = (class100) field1046.method3411((long) this.field1048);
        if (var4 != null) {
            return var4;
        }
        class95 var5 = class95.method1969(Statics.field1085, this.field1049, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1063 != 128 || this.field1080 != 128 || this.field1082 != 128) {
            var5.method1985(this.field1063, this.field1080, this.field1082);
        }
        if (this.field1051 != null) {
            for (int var6 = 0; var6 < this.field1051.length; var6++) {
                var5.method2001(this.field1051[var6], this.field1052[var6]);
            }
        }
        if (this.field1053 != null) {
            for (int var7 = 0; var7 < this.field1053.length; var7++) {
                var5.method2000(this.field1053[var7], this.field1054[var7]);
            }
        }
        class100 var8 = var5.method1994(this.field1067 + 64, this.field1061 + 768, -50, -10, -50);
        var8.field1764 = true;
        field1046.method3420(var8, (long) this.field1048);
        return var8;
    }

    @ObfuscatedName("aj.h(II)Laj;")
    public class47 method902(int arg0) {
        if (this.field1078 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1064[var3] && this.field1064[var3] != 0) {
                    var2 = this.field1078[var3];
                }
            }
            if (var2 != -1) {
                return method3569(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("u.l(IIIIIZB)Lbx;")
    public static final class74 method136(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class74 var8 = (class74) field1047.method3411(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class47 var9 = method3569(arg0);
        if (arg1 > 1 && var9.field1078 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1064[var11] && var9.field1064[var11] != 0) {
                    var10 = var9.field1078[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3569(var10);
            }
        }
        class100 var12 = var9.method901(1);
        if (var12 == null) {
            return null;
        }
        class74 var13 = null;
        if (var9.field1081 != -1) {
            var13 = method136(var9.field1060, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1090 != -1) {
            var13 = method136(var9.field1089, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1353;
        int var15 = Statics.field1348;
        int var16 = Statics.field1349;
        int[] var17 = new int[4];
        class75.method1589(var17);
        class74 var18 = new class74(36, 32);
        class75.method1597(var18.field1338, 36, 32);
        class75.method1616();
        class86.method1896();
        class86.method1876(16, 16);
        class86.field1495 = false;
        int var19 = var9.field1055;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class86.field1515[var9.field1056] * var19 >> 16;
        int var21 = class86.field1516[var9.field1056] * var19 >> 16;
        var12.method2072();
        var12.method2084(0, var9.field1057, var9.field1058, var9.field1056, var9.field1059, var9.field1050 + var12.field1388 / 2 + var20, var9.field1050 + var21);
        if (var9.field1090 != -1) {
            var13.method1516(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1532(1);
        }
        if (arg2 >= 2) {
            var18.method1532(16777215);
        }
        if (arg3 != 0) {
            var18.method1507(arg3);
        }
        class75.method1597(var18.field1338, 36, 32);
        if (var9.field1081 != -1) {
            var13.method1516(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1084 == 1) {
            class215 var22 = Statics.field920;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class148.field2369 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class148.field2443 + "</col>";
            }
            var22.method3660(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1047.method3420(var18, var6);
        }
        class75.method1597(var14, var15, var16);
        class75.method1590(var17);
        class86.method1896();
        class86.field1495 = true;
        return var18;
    }

    @ObfuscatedName("aj.u(ZI)Z")
    public final boolean method949(boolean arg0) {
        int var2 = this.field1066;
        int var3 = this.field1041;
        int var4 = this.field1040;
        if (arg0) {
            var2 = this.field1069;
            var3 = this.field1079;
            var4 = this.field1073;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1085.method2950(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1085.method2950(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1085.method2950(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aj.q(ZI)Lcy;")
    public final class95 method938(boolean arg0) {
        int var2 = this.field1066;
        int var3 = this.field1041;
        int var4 = this.field1040;
        if (arg0) {
            var2 = this.field1069;
            var3 = this.field1079;
            var4 = this.field1073;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var5 = class95.method1969(Statics.field1085, var2, 0);
        if (var3 != -1) {
            class95 var6 = class95.method1969(Statics.field1085, var3, 0);
            if (var4 == -1) {
                class95[] var9 = new class95[] { var5, var6 };
                var5 = new class95(var9, 2);
            } else {
                class95 var7 = class95.method1969(Statics.field1085, var4, 0);
                class95[] var8 = new class95[] { var5, var6, var7 };
                var5 = new class95(var8, 3);
            }
        }
        if (!arg0 && this.field1068 != 0) {
            var5.method1981(0, this.field1068, 0);
        }
        if (arg0 && this.field1071 != 0) {
            var5.method1981(0, this.field1071, 0);
        }
        if (this.field1051 != null) {
            for (int var10 = 0; var10 < this.field1051.length; var10++) {
                var5.method2001(this.field1051[var10], this.field1052[var10]);
            }
        }
        if (this.field1053 != null) {
            for (int var11 = 0; var11 < this.field1053.length; var11++) {
                var5.method2000(this.field1053[var11], this.field1054[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aj.k(ZI)Z")
    public final boolean method904(boolean arg0) {
        int var2 = this.field1074;
        int var3 = this.field1075;
        if (arg0) {
            var2 = this.field1076;
            var3 = this.field1092;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1085.method2950(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1085.method2950(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aj.x(ZB)Lcy;")
    public final class95 method898(boolean arg0) {
        int var2 = this.field1074;
        int var3 = this.field1075;
        if (arg0) {
            var2 = this.field1076;
            var3 = this.field1092;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var4 = class95.method1969(Statics.field1085, var2, 0);
        if (var3 != -1) {
            class95 var5 = class95.method1969(Statics.field1085, var3, 0);
            class95[] var6 = new class95[] { var4, var5 };
            var4 = new class95(var6, 2);
        }
        if (this.field1051 != null) {
            for (int var7 = 0; var7 < this.field1051.length; var7++) {
                var4.method2001(this.field1051[var7], this.field1052[var7]);
            }
        }
        if (this.field1053 != null) {
            for (int var8 = 0; var8 < this.field1053.length; var8++) {
                var4.method2000(this.field1053[var8], this.field1054[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("dn.r(I)V")
    public static void method2513() {
        field1045.method3412();
        field1046.method3412();
        field1047.method3412();
    }

    @ObfuscatedName("w.s(ZB)V")
    public static void method587(boolean arg0) {
        if (Statics.field2598 != arg0) {
            method2513();
            Statics.field2598 = arg0;
        }
    }
}
