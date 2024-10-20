package deob;

@ObfuscatedName("ai")
public class class47 extends class195 {

    @ObfuscatedName("ai.z")
    public static class184 field1059 = new class184(64);

    @ObfuscatedName("ai.v")
    public static class184 field1045 = new class184(50);

    @ObfuscatedName("ai.b")
    public static class184 field1043 = new class184(200);

    @ObfuscatedName("ai.i")
    public int field1071;

    @ObfuscatedName("ai.w")
    public int field1048;

    @ObfuscatedName("ai.l")
    public String field1049 = "null";

    @ObfuscatedName("ai.j")
    public short[] field1050;

    @ObfuscatedName("ai.s")
    public short[] field1051;

    @ObfuscatedName("ai.r")
    public short[] field1081;

    @ObfuscatedName("ai.h")
    public short[] field1069;

    @ObfuscatedName("ai.x")
    public int field1070 = 2000;

    @ObfuscatedName("ai.m")
    public int field1055 = 0;

    @ObfuscatedName("ai.a")
    public int field1056 = 0;

    @ObfuscatedName("ai.p")
    public int field1057 = 0;

    @ObfuscatedName("ai.c")
    public int field1075 = 0;

    @ObfuscatedName("ai.u")
    public int field1077 = 0;

    @ObfuscatedName("ai.d")
    public int field1060 = 0;

    @ObfuscatedName("ai.o")
    public int field1061 = 1;

    @ObfuscatedName("ai.aj")
    public boolean field1062 = false;

    @ObfuscatedName("ai.au")
    public String[] field1064 = new String[] { null, null, class148.field2223, null, null };

    @ObfuscatedName("ai.ah")
    public String[] field1058 = new String[] { null, null, null, null, class148.field2224 };

    @ObfuscatedName("ai.ab")
    public int field1065 = -1;

    @ObfuscatedName("ai.am")
    public int field1066 = -1;

    @ObfuscatedName("ai.ar")
    public int field1067 = 0;

    @ObfuscatedName("ai.an")
    public int field1068 = -1;

    @ObfuscatedName("ai.az")
    public int field1085 = -1;

    @ObfuscatedName("ai.at")
    public int field1039 = 0;

    @ObfuscatedName("ai.ag")
    public int field1082 = -1;

    @ObfuscatedName("ai.as")
    public int field1072 = -1;

    @ObfuscatedName("ai.ao")
    public int field1073 = -1;

    @ObfuscatedName("ai.af")
    public int field1074 = -1;

    @ObfuscatedName("ai.ay")
    public int field1080 = -1;

    @ObfuscatedName("ai.aq")
    public int field1076 = -1;

    @ObfuscatedName("ai.aw")
    public int[] field1052;

    @ObfuscatedName("ai.al")
    public int[] field1078;

    @ObfuscatedName("ai.ap")
    public int field1079 = -1;

    @ObfuscatedName("ai.ac")
    public int field1054 = -1;

    @ObfuscatedName("ai.av")
    public int field1088 = 128;

    @ObfuscatedName("ai.ai")
    public int field1047 = 128;

    @ObfuscatedName("ai.ax")
    public int field1083 = 128;

    @ObfuscatedName("ai.ae")
    public int field1084 = 0;

    @ObfuscatedName("ai.aa")
    public int field1046 = 0;

    @ObfuscatedName("ai.ak")
    public int field1053 = 0;

    @ObfuscatedName("ai.ad")
    public boolean field1087 = false;

    @ObfuscatedName("ai.bt")
    public int field1086 = -1;

    @ObfuscatedName("ai.bf")
    public int field1089 = -1;

    @ObfuscatedName("al.y(IS)Lai;")
    public static class47 method859(int arg0) {
        class47 var1 = (class47) field1059.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1042.method2874(10, arg0);
        class47 var3 = new class47();
        var3.field1071 = arg0;
        if (var2 != null) {
            var3.method920(new class111(var2));
        }
        var3.method898();
        if (var3.field1054 != -1) {
            var3.method901(method859(var3.field1054), method859(var3.field1079));
        }
        if (var3.field1089 != -1) {
            var3.method902(method859(var3.field1089), method859(var3.field1086));
        }
        if (!Statics.field1063 && var3.field1062) {
            var3.field1049 = class148.field2424;
            var3.field1087 = false;
            var3.field1064 = null;
            var3.field1058 = null;
            var3.field1053 = 0;
        }
        field1059.method3340(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.k(I)V")
    public void method898() {
    }

    @ObfuscatedName("ai.g(Ldw;I)V")
    public void method920(class111 arg0) {
        while (true) {
            int var2 = arg0.method2205();
            if (var2 == 0) {
                return;
            }
            this.method937(arg0, var2);
        }
    }

    @ObfuscatedName("ai.n(Ldw;IS)V")
    public void method937(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1048 = arg0.method2339();
        } else if (arg1 == 2) {
            this.field1049 = arg0.method2170();
        } else if (arg1 == 4) {
            this.field1070 = arg0.method2339();
        } else if (arg1 == 5) {
            this.field1055 = arg0.method2339();
        } else if (arg1 == 6) {
            this.field1056 = arg0.method2339();
        } else if (arg1 == 7) {
            this.field1075 = arg0.method2339();
            if (this.field1075 > 32767) {
                this.field1075 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1077 = arg0.method2339();
            if (this.field1077 > 32767) {
                this.field1077 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1060 = 1;
        } else if (arg1 == 12) {
            this.field1061 = arg0.method2165();
        } else if (arg1 == 16) {
            this.field1062 = true;
        } else if (arg1 == 23) {
            this.field1065 = arg0.method2339();
            this.field1067 = arg0.method2205();
        } else if (arg1 == 24) {
            this.field1066 = arg0.method2339();
        } else if (arg1 == 25) {
            this.field1068 = arg0.method2339();
            this.field1039 = arg0.method2205();
        } else if (arg1 == 26) {
            this.field1085 = arg0.method2339();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1064[arg1 - 30] = arg0.method2170();
            if (this.field1064[arg1 - 30].equalsIgnoreCase(class148.field2225)) {
                this.field1064[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1058[arg1 - 35] = arg0.method2170();
        } else if (arg1 == 40) {
            int var3 = arg0.method2205();
            this.field1050 = new short[var3];
            this.field1051 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1050[var4] = (short) arg0.method2339();
                this.field1051[var4] = (short) arg0.method2339();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2205();
            this.field1081 = new short[var5];
            this.field1069 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1081[var6] = (short) arg0.method2339();
                this.field1069[var6] = (short) arg0.method2339();
            }
        } else if (arg1 == 65) {
            this.field1087 = true;
        } else if (arg1 == 78) {
            this.field1082 = arg0.method2339();
        } else if (arg1 == 79) {
            this.field1072 = arg0.method2339();
        } else if (arg1 == 90) {
            this.field1073 = arg0.method2339();
        } else if (arg1 == 91) {
            this.field1080 = arg0.method2339();
        } else if (arg1 == 92) {
            this.field1074 = arg0.method2339();
        } else if (arg1 == 93) {
            this.field1076 = arg0.method2339();
        } else if (arg1 == 95) {
            this.field1057 = arg0.method2339();
        } else if (arg1 == 97) {
            this.field1079 = arg0.method2339();
        } else if (arg1 == 98) {
            this.field1054 = arg0.method2339();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1052 == null) {
                this.field1052 = new int[10];
                this.field1078 = new int[10];
            }
            this.field1052[arg1 - 100] = arg0.method2339();
            this.field1078[arg1 - 100] = arg0.method2339();
        } else if (arg1 == 110) {
            this.field1088 = arg0.method2339();
        } else if (arg1 == 111) {
            this.field1047 = arg0.method2339();
        } else if (arg1 == 112) {
            this.field1083 = arg0.method2339();
        } else if (arg1 == 113) {
            this.field1084 = arg0.method2199();
        } else if (arg1 == 114) {
            this.field1046 = arg0.method2199() * 5;
        } else if (arg1 == 115) {
            this.field1053 = arg0.method2205();
        } else if (arg1 == 139) {
            this.field1086 = arg0.method2339();
        } else if (arg1 == 140) {
            this.field1089 = arg0.method2339();
        }
    }

    @ObfuscatedName("ai.t(Lai;Lai;I)V")
    public void method901(class47 arg0, class47 arg1) {
        this.field1048 = arg0.field1048;
        this.field1070 = arg0.field1070;
        this.field1055 = arg0.field1055;
        this.field1056 = arg0.field1056;
        this.field1057 = arg0.field1057;
        this.field1075 = arg0.field1075;
        this.field1077 = arg0.field1077;
        this.field1050 = arg0.field1050;
        this.field1051 = arg0.field1051;
        this.field1081 = arg0.field1081;
        this.field1069 = arg0.field1069;
        this.field1049 = arg1.field1049;
        this.field1062 = arg1.field1062;
        this.field1061 = arg1.field1061;
        this.field1060 = 1;
    }

    @ObfuscatedName("ai.e(Lai;Lai;I)V")
    public void method902(class47 arg0, class47 arg1) {
        this.field1048 = arg0.field1048;
        this.field1070 = arg0.field1070;
        this.field1055 = arg0.field1055;
        this.field1056 = arg0.field1056;
        this.field1057 = arg0.field1057;
        this.field1075 = arg0.field1075;
        this.field1077 = arg0.field1077;
        this.field1050 = arg1.field1050;
        this.field1051 = arg1.field1051;
        this.field1081 = arg1.field1081;
        this.field1069 = arg1.field1069;
        this.field1049 = arg1.field1049;
        this.field1062 = arg1.field1062;
        this.field1060 = arg1.field1060;
        this.field1065 = arg1.field1065;
        this.field1066 = arg1.field1066;
        this.field1082 = arg1.field1082;
        this.field1068 = arg1.field1068;
        this.field1085 = arg1.field1085;
        this.field1072 = arg1.field1072;
        this.field1073 = arg1.field1073;
        this.field1074 = arg1.field1074;
        this.field1080 = arg1.field1080;
        this.field1076 = arg1.field1076;
        this.field1053 = arg1.field1053;
        this.field1064 = arg1.field1064;
        this.field1058 = new String[5];
        if (arg1.field1058 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1058[var3] = arg1.field1058[var3];
            }
        }
        this.field1058[4] = class148.field2236;
        this.field1061 = 0;
    }

    @ObfuscatedName("ai.q(II)Lcc;")
    public final class95 method903(int arg0) {
        if (this.field1052 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1078[var3] && this.field1078[var3] != 0) {
                    var2 = this.field1052[var3];
                }
            }
            if (var2 != -1) {
                return method859(var2).method903(1);
            }
        }
        class95 var4 = class95.method1900(Statics.field1978, this.field1048, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1088 != 128 || this.field1047 != 128 || this.field1083 != 128) {
            var4.method1899(this.field1088, this.field1047, this.field1083);
        }
        if (this.field1050 != null) {
            for (int var5 = 0; var5 < this.field1050.length; var5++) {
                var4.method1922(this.field1050[var5], this.field1051[var5]);
            }
        }
        if (this.field1081 != null) {
            for (int var6 = 0; var6 < this.field1081.length; var6++) {
                var4.method1915(this.field1081[var6], this.field1069[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ai.z(II)Lch;")
    public final class100 method904(int arg0) {
        if (this.field1052 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1078[var3] && this.field1078[var3] != 0) {
                    var2 = this.field1052[var3];
                }
            }
            if (var2 != -1) {
                return method859(var2).method904(1);
            }
        }
        class100 var4 = (class100) field1045.method3327((long) this.field1071);
        if (var4 != null) {
            return var4;
        }
        class95 var5 = class95.method1900(Statics.field1978, this.field1048, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1088 != 128 || this.field1047 != 128 || this.field1083 != 128) {
            var5.method1899(this.field1088, this.field1047, this.field1083);
        }
        if (this.field1050 != null) {
            for (int var6 = 0; var6 < this.field1050.length; var6++) {
                var5.method1922(this.field1050[var6], this.field1051[var6]);
            }
        }
        if (this.field1081 != null) {
            for (int var7 = 0; var7 < this.field1081.length; var7++) {
                var5.method1915(this.field1081[var7], this.field1069[var7]);
            }
        }
        class100 var8 = var5.method1953(this.field1084 + 64, this.field1046 + 768, -50, -10, -50);
        var8.field1733 = true;
        field1045.method3340(var8, (long) this.field1071);
        return var8;
    }

    @ObfuscatedName("ai.v(II)Lai;")
    public class47 method921(int arg0) {
        if (this.field1052 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1078[var3] && this.field1078[var3] != 0) {
                    var2 = this.field1052[var3];
                }
            }
            if (var2 != -1) {
                return method859(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("as.b(IIIIIZI)Lbb;")
    public static final class74 method706(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class74 var8 = (class74) field1043.method3327(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class47 var9 = method859(arg0);
        if (arg1 > 1 && var9.field1052 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1078[var11] && var9.field1078[var11] != 0) {
                    var10 = var9.field1052[var11];
                }
            }
            if (var10 != -1) {
                var9 = method859(var10);
            }
        }
        class100 var12 = var9.method904(1);
        if (var12 == null) {
            return null;
        }
        class74 var13 = null;
        if (var9.field1054 != -1) {
            var13 = method706(var9.field1079, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1089 != -1) {
            var13 = method706(var9.field1086, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1340;
        int var15 = Statics.field1341;
        int var16 = Statics.field1342;
        int[] var17 = new int[4];
        class75.method1551(var17);
        class74 var18 = new class74(36, 32);
        class75.method1547(var18.field1332, 36, 32);
        class75.method1553();
        class86.method1809();
        class86.method1812(16, 16);
        class86.field1502 = false;
        int var19 = var9.field1070;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class86.field1510[var9.field1055] * var19 >> 16;
        int var21 = class86.field1501[var9.field1055] * var19 >> 16;
        var12.method2000();
        var12.method2012(0, var9.field1056, var9.field1057, var9.field1055, var9.field1075, var9.field1077 + var12.field1383 / 2 + var20, var9.field1077 + var21);
        if (var9.field1089 != -1) {
            var13.method1459(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1455(1);
        }
        if (arg2 >= 2) {
            var18.method1455(16777215);
        }
        if (arg3 != 0) {
            var18.method1456(arg3);
        }
        class75.method1547(var18.field1332, 36, 32);
        if (var9.field1054 != -1) {
            var13.method1459(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1060 == 1) {
            Statics.field1010.method3616(method497(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1043.method3340(var18, var6);
        }
        class75.method1547(var14, var15, var16);
        class75.method1561(var17);
        class86.method1809();
        class86.field1502 = true;
        return var18;
    }

    @ObfuscatedName("m.f(II)Ljava/lang/String;")
    public static final String method497(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class148.field2449 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class148.field2385 + "</col>";
        }
    }

    @ObfuscatedName("ai.i(ZI)Z")
    public final boolean method905(boolean arg0) {
        int var2 = this.field1065;
        int var3 = this.field1066;
        int var4 = this.field1082;
        if (arg0) {
            var2 = this.field1068;
            var3 = this.field1085;
            var4 = this.field1072;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1978.method2876(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1978.method2876(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1978.method2876(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ai.w(ZI)Lcc;")
    public final class95 method943(boolean arg0) {
        int var2 = this.field1065;
        int var3 = this.field1066;
        int var4 = this.field1082;
        if (arg0) {
            var2 = this.field1068;
            var3 = this.field1085;
            var4 = this.field1072;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var5 = class95.method1900(Statics.field1978, var2, 0);
        if (var3 != -1) {
            class95 var6 = class95.method1900(Statics.field1978, var3, 0);
            if (var4 == -1) {
                class95[] var9 = new class95[] { var5, var6 };
                var5 = new class95(var9, 2);
            } else {
                class95 var7 = class95.method1900(Statics.field1978, var4, 0);
                class95[] var8 = new class95[] { var5, var6, var7 };
                var5 = new class95(var8, 3);
            }
        }
        if (!arg0 && this.field1067 != 0) {
            var5.method1913(0, this.field1067, 0);
        }
        if (arg0 && this.field1039 != 0) {
            var5.method1913(0, this.field1039, 0);
        }
        if (this.field1050 != null) {
            for (int var10 = 0; var10 < this.field1050.length; var10++) {
                var5.method1922(this.field1050[var10], this.field1051[var10]);
            }
        }
        if (this.field1081 != null) {
            for (int var11 = 0; var11 < this.field1081.length; var11++) {
                var5.method1915(this.field1081[var11], this.field1069[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ai.l(ZI)Z")
    public final boolean method907(boolean arg0) {
        int var2 = this.field1073;
        int var3 = this.field1074;
        if (arg0) {
            var2 = this.field1080;
            var3 = this.field1076;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1978.method2876(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1978.method2876(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ai.j(ZB)Lcc;")
    public final class95 method932(boolean arg0) {
        int var2 = this.field1073;
        int var3 = this.field1074;
        if (arg0) {
            var2 = this.field1080;
            var3 = this.field1076;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var4 = class95.method1900(Statics.field1978, var2, 0);
        if (var3 != -1) {
            class95 var5 = class95.method1900(Statics.field1978, var3, 0);
            class95[] var6 = new class95[] { var4, var5 };
            var4 = new class95(var6, 2);
        }
        if (this.field1050 != null) {
            for (int var7 = 0; var7 < this.field1050.length; var7++) {
                var4.method1922(this.field1050[var7], this.field1051[var7]);
            }
        }
        if (this.field1081 != null) {
            for (int var8 = 0; var8 < this.field1081.length; var8++) {
                var4.method1915(this.field1081[var8], this.field1069[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("z.s(I)V")
    public static void method80() {
        field1043.method3333();
    }

    @ObfuscatedName("u.r(ZB)V")
    public static void method574(boolean arg0) {
        if (Statics.field1063 != arg0) {
            field1059.method3333();
            field1045.method3333();
            field1043.method3333();
            Statics.field1063 = arg0;
        }
    }
}
