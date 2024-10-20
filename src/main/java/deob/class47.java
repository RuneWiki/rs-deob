package deob;

@ObfuscatedName("az")
public class class47 extends class195 {

    @ObfuscatedName("az.c")
    public static class184 field1062 = new class184(64);

    @ObfuscatedName("az.f")
    public static class184 field1038 = new class184(50);

    @ObfuscatedName("az.s")
    public static class184 field1039 = new class184(200);

    @ObfuscatedName("az.y")
    public int field1049;

    @ObfuscatedName("az.b")
    public int field1057;

    @ObfuscatedName("az.v")
    public String field1037 = "null";

    @ObfuscatedName("az.z")
    public short[] field1043;

    @ObfuscatedName("az.u")
    public short[] field1044;

    @ObfuscatedName("az.g")
    public short[] field1041;

    @ObfuscatedName("az.k")
    public short[] field1046;

    @ObfuscatedName("az.o")
    public int field1048 = 2000;

    @ObfuscatedName("az.a")
    public int field1045 = 0;

    @ObfuscatedName("az.p")
    public int field1032 = 0;

    @ObfuscatedName("az.t")
    public int field1042 = 0;

    @ObfuscatedName("az.x")
    public int field1051 = 0;

    @ObfuscatedName("az.d")
    public int field1052 = 0;

    @ObfuscatedName("az.j")
    public int field1076 = 0;

    @ObfuscatedName("az.r")
    public int field1054 = 1;

    @ObfuscatedName("az.at")
    public boolean field1055 = false;

    @ObfuscatedName("az.av")
    public String[] field1056 = new String[] { null, null, class148.field2202, null, null };

    @ObfuscatedName("az.ar")
    public String[] field1047 = new String[] { null, null, null, null, class148.field2294 };

    @ObfuscatedName("az.aq")
    public int field1058 = -1;

    @ObfuscatedName("az.as")
    public int field1059 = -1;

    @ObfuscatedName("az.ad")
    public int field1064 = 0;

    @ObfuscatedName("az.ap")
    public int field1061 = -1;

    @ObfuscatedName("az.an")
    public int field1084 = -1;

    @ObfuscatedName("az.au")
    public int field1053 = 0;

    @ObfuscatedName("az.aw")
    public int field1040 = -1;

    @ObfuscatedName("az.ag")
    public int field1065 = -1;

    @ObfuscatedName("az.ah")
    public int field1066 = -1;

    @ObfuscatedName("az.ao")
    public int field1067 = -1;

    @ObfuscatedName("az.ac")
    public int field1068 = -1;

    @ObfuscatedName("az.af")
    public int field1069 = -1;

    @ObfuscatedName("az.ab")
    public int[] field1070;

    @ObfuscatedName("az.ai")
    public int[] field1071;

    @ObfuscatedName("az.ay")
    public int field1072 = -1;

    @ObfuscatedName("az.ak")
    public int field1073 = -1;

    @ObfuscatedName("az.aj")
    public int field1036 = 128;

    @ObfuscatedName("az.az")
    public int field1075 = 128;

    @ObfuscatedName("az.am")
    public int field1031 = 128;

    @ObfuscatedName("az.ax")
    public int field1077 = 0;

    @ObfuscatedName("az.al")
    public int field1078 = 0;

    @ObfuscatedName("az.aa")
    public int field1079 = 0;

    @ObfuscatedName("az.ae")
    public boolean field1080 = false;

    @ObfuscatedName("az.bj")
    public int field1081 = -1;

    @ObfuscatedName("az.bg")
    public int field1033 = -1;

    @ObfuscatedName("p.w(II)Laz;")
    public static class47 method496(int arg0) {
        class47 var1 = (class47) field1062.method3315((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1074.method2859(10, arg0);
        class47 var3 = new class47();
        var3.field1049 = arg0;
        if (var2 != null) {
            var3.method924(new class111(var2));
        }
        var3.method914();
        if (var3.field1073 != -1) {
            var3.method897(method496(var3.field1073), method496(var3.field1072));
        }
        if (var3.field1033 != -1) {
            var3.method898(method496(var3.field1033), method496(var3.field1081));
        }
        if (!Statics.field1035 && var3.field1055) {
            var3.field1037 = class148.field2344;
            var3.field1080 = false;
            var3.field1056 = null;
            var3.field1047 = null;
            var3.field1079 = 0;
        }
        field1062.method3317(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.i(I)V")
    public void method914() {
    }

    @ObfuscatedName("az.e(Ldo;I)V")
    public void method924(class111 arg0) {
        while (true) {
            int var2 = arg0.method2155();
            if (var2 == 0) {
                return;
            }
            this.method896(arg0, var2);
        }
    }

    @ObfuscatedName("az.h(Ldo;II)V")
    public void method896(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1057 = arg0.method2157();
        } else if (arg1 == 2) {
            this.field1037 = arg0.method2163();
        } else if (arg1 == 4) {
            this.field1048 = arg0.method2157();
        } else if (arg1 == 5) {
            this.field1045 = arg0.method2157();
        } else if (arg1 == 6) {
            this.field1032 = arg0.method2157();
        } else if (arg1 == 7) {
            this.field1051 = arg0.method2157();
            if (this.field1051 > 32767) {
                this.field1051 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1052 = arg0.method2157();
            if (this.field1052 > 32767) {
                this.field1052 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1076 = 1;
        } else if (arg1 == 12) {
            this.field1054 = arg0.method2160();
        } else if (arg1 == 16) {
            this.field1055 = true;
        } else if (arg1 == 23) {
            this.field1058 = arg0.method2157();
            this.field1064 = arg0.method2155();
        } else if (arg1 == 24) {
            this.field1059 = arg0.method2157();
        } else if (arg1 == 25) {
            this.field1061 = arg0.method2157();
            this.field1053 = arg0.method2155();
        } else if (arg1 == 26) {
            this.field1084 = arg0.method2157();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1056[arg1 - 30] = arg0.method2163();
            if (this.field1056[arg1 - 30].equalsIgnoreCase(class148.field2204)) {
                this.field1056[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1047[arg1 - 35] = arg0.method2163();
        } else if (arg1 == 40) {
            int var3 = arg0.method2155();
            this.field1043 = new short[var3];
            this.field1044 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1043[var4] = (short) arg0.method2157();
                this.field1044[var4] = (short) arg0.method2157();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2155();
            this.field1041 = new short[var5];
            this.field1046 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1041[var6] = (short) arg0.method2157();
                this.field1046[var6] = (short) arg0.method2157();
            }
        } else if (arg1 == 65) {
            this.field1080 = true;
        } else if (arg1 == 78) {
            this.field1040 = arg0.method2157();
        } else if (arg1 == 79) {
            this.field1065 = arg0.method2157();
        } else if (arg1 == 90) {
            this.field1066 = arg0.method2157();
        } else if (arg1 == 91) {
            this.field1068 = arg0.method2157();
        } else if (arg1 == 92) {
            this.field1067 = arg0.method2157();
        } else if (arg1 == 93) {
            this.field1069 = arg0.method2157();
        } else if (arg1 == 95) {
            this.field1042 = arg0.method2157();
        } else if (arg1 == 97) {
            this.field1072 = arg0.method2157();
        } else if (arg1 == 98) {
            this.field1073 = arg0.method2157();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1070 == null) {
                this.field1070 = new int[10];
                this.field1071 = new int[10];
            }
            this.field1070[arg1 - 100] = arg0.method2157();
            this.field1071[arg1 - 100] = arg0.method2157();
        } else if (arg1 == 110) {
            this.field1036 = arg0.method2157();
        } else if (arg1 == 111) {
            this.field1075 = arg0.method2157();
        } else if (arg1 == 112) {
            this.field1031 = arg0.method2157();
        } else if (arg1 == 113) {
            this.field1077 = arg0.method2173();
        } else if (arg1 == 114) {
            this.field1078 = arg0.method2173();
        } else if (arg1 == 115) {
            this.field1079 = arg0.method2155();
        } else if (arg1 == 139) {
            this.field1081 = arg0.method2157();
        } else if (arg1 == 140) {
            this.field1033 = arg0.method2157();
        }
    }

    @ObfuscatedName("az.q(Laz;Laz;B)V")
    public void method897(class47 arg0, class47 arg1) {
        this.field1057 = arg0.field1057;
        this.field1048 = arg0.field1048;
        this.field1045 = arg0.field1045;
        this.field1032 = arg0.field1032;
        this.field1042 = arg0.field1042;
        this.field1051 = arg0.field1051;
        this.field1052 = arg0.field1052;
        this.field1043 = arg0.field1043;
        this.field1044 = arg0.field1044;
        this.field1041 = arg0.field1041;
        this.field1046 = arg0.field1046;
        this.field1037 = arg1.field1037;
        this.field1055 = arg1.field1055;
        this.field1054 = arg1.field1054;
        this.field1076 = 1;
    }

    @ObfuscatedName("az.l(Laz;Laz;B)V")
    public void method898(class47 arg0, class47 arg1) {
        this.field1057 = arg0.field1057;
        this.field1048 = arg0.field1048;
        this.field1045 = arg0.field1045;
        this.field1032 = arg0.field1032;
        this.field1042 = arg0.field1042;
        this.field1051 = arg0.field1051;
        this.field1052 = arg0.field1052;
        this.field1043 = arg1.field1043;
        this.field1044 = arg1.field1044;
        this.field1041 = arg1.field1041;
        this.field1046 = arg1.field1046;
        this.field1037 = arg1.field1037;
        this.field1055 = arg1.field1055;
        this.field1076 = arg1.field1076;
        this.field1058 = arg1.field1058;
        this.field1059 = arg1.field1059;
        this.field1040 = arg1.field1040;
        this.field1061 = arg1.field1061;
        this.field1084 = arg1.field1084;
        this.field1065 = arg1.field1065;
        this.field1066 = arg1.field1066;
        this.field1067 = arg1.field1067;
        this.field1068 = arg1.field1068;
        this.field1069 = arg1.field1069;
        this.field1079 = arg1.field1079;
        this.field1056 = arg1.field1056;
        this.field1047 = new String[5];
        if (arg1.field1047 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1047[var3] = arg1.field1047[var3];
            }
        }
        this.field1047[4] = class148.field2208;
        this.field1054 = 0;
    }

    @ObfuscatedName("az.c(II)Lce;")
    public final class95 method899(int arg0) {
        if (this.field1070 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1071[var3] && this.field1071[var3] != 0) {
                    var2 = this.field1070[var3];
                }
            }
            if (var2 != -1) {
                return method496(var2).method899(1);
            }
        }
        class95 var4 = class95.method1905(Statics.field1063, this.field1057, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1036 != 128 || this.field1075 != 128 || this.field1031 != 128) {
            var4.method1922(this.field1036, this.field1075, this.field1031);
        }
        if (this.field1043 != null) {
            for (int var5 = 0; var5 < this.field1043.length; var5++) {
                var4.method1919(this.field1043[var5], this.field1044[var5]);
            }
        }
        if (this.field1041 != null) {
            for (int var6 = 0; var6 < this.field1041.length; var6++) {
                var4.method1920(this.field1041[var6], this.field1046[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("az.f(IB)Lcw;")
    public final class100 method919(int arg0) {
        if (this.field1070 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1071[var3] && this.field1071[var3] != 0) {
                    var2 = this.field1070[var3];
                }
            }
            if (var2 != -1) {
                return method496(var2).method919(1);
            }
        }
        class100 var4 = (class100) field1038.method3315((long) this.field1049);
        if (var4 != null) {
            return var4;
        }
        class95 var5 = class95.method1905(Statics.field1063, this.field1057, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1036 != 128 || this.field1075 != 128 || this.field1031 != 128) {
            var5.method1922(this.field1036, this.field1075, this.field1031);
        }
        if (this.field1043 != null) {
            for (int var6 = 0; var6 < this.field1043.length; var6++) {
                var5.method1919(this.field1043[var6], this.field1044[var6]);
            }
        }
        if (this.field1041 != null) {
            for (int var7 = 0; var7 < this.field1041.length; var7++) {
                var5.method1920(this.field1041[var7], this.field1046[var7]);
            }
        }
        class100 var8 = var5.method1982(this.field1077 + 64, this.field1078 * 5 + 768, -50, -10, -50);
        var8.field1730 = true;
        field1038.method3317(var8, (long) this.field1049);
        return var8;
    }

    @ObfuscatedName("az.s(II)Laz;")
    public class47 method938(int arg0) {
        if (this.field1070 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1071[var3] && this.field1071[var3] != 0) {
                    var2 = this.field1070[var3];
                }
            }
            if (var2 != -1) {
                return method496(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("n.m(IIIIIZS)Lbl;")
    public static final class74 method1(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class74 var8 = (class74) field1039.method3315(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class47 var9 = method496(arg0);
        if (arg1 > 1 && var9.field1070 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1071[var11] && var9.field1071[var11] != 0) {
                    var10 = var9.field1070[var11];
                }
            }
            if (var10 != -1) {
                var9 = method496(var10);
            }
        }
        class100 var12 = var9.method919(1);
        if (var12 == null) {
            return null;
        }
        class74 var13 = null;
        if (var9.field1073 != -1) {
            var13 = method1(var9.field1072, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1033 != -1) {
            var13 = method1(var9.field1081, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1345;
        int var15 = Statics.field1341;
        int var16 = Statics.field1342;
        int[] var17 = new int[4];
        class75.method1539(var17);
        class74 var18 = new class74(36, 32);
        class75.method1533(var18.field1337, 36, 32);
        class75.method1532();
        class86.method1806();
        class86.method1809(16, 16);
        class86.field1492 = false;
        int var19 = var9.field1048;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class86.field1512[var9.field1045] * var19 >> 16;
        int var21 = class86.field1513[var9.field1045] * var19 >> 16;
        var12.method2001();
        var12.method2021(0, var9.field1032, var9.field1042, var9.field1045, var9.field1051, var9.field1052 + var12.field1383 / 2 + var20, var9.field1052 + var21);
        if (var9.field1033 != -1) {
            var13.method1467(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1513(1);
        }
        if (arg2 >= 2) {
            var18.method1513(16777215);
        }
        if (arg3 != 0) {
            var18.method1461(arg3);
        }
        class75.method1533(var18.field1337, 36, 32);
        if (var9.field1073 != -1) {
            var13.method1467(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1076 == 1) {
            Statics.field1090.method3592(method874(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1039.method3317(var18, var6);
        }
        class75.method1533(var14, var15, var16);
        class75.method1588(var17);
        class86.method1806();
        class86.field1492 = true;
        return var18;
    }

    @ObfuscatedName("ay.y(II)Ljava/lang/String;")
    public static final String method874(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class148.field2366 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class148.field2364 + "</col>";
        }
    }

    @ObfuscatedName("az.b(ZB)Z")
    public final boolean method915(boolean arg0) {
        int var2 = this.field1058;
        int var3 = this.field1059;
        int var4 = this.field1040;
        if (arg0) {
            var2 = this.field1061;
            var3 = this.field1084;
            var4 = this.field1065;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1063.method2861(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1063.method2861(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1063.method2861(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("az.v(ZI)Lce;")
    public final class95 method903(boolean arg0) {
        int var2 = this.field1058;
        int var3 = this.field1059;
        int var4 = this.field1040;
        if (arg0) {
            var2 = this.field1061;
            var3 = this.field1084;
            var4 = this.field1065;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var5 = class95.method1905(Statics.field1063, var2, 0);
        if (var3 != -1) {
            class95 var6 = class95.method1905(Statics.field1063, var3, 0);
            if (var4 == -1) {
                class95[] var9 = new class95[] { var5, var6 };
                var5 = new class95(var9, 2);
            } else {
                class95 var7 = class95.method1905(Statics.field1063, var4, 0);
                class95[] var8 = new class95[] { var5, var6, var7 };
                var5 = new class95(var8, 3);
            }
        }
        if (!arg0 && this.field1064 != 0) {
            var5.method1964(0, this.field1064, 0);
        }
        if (arg0 && this.field1053 != 0) {
            var5.method1964(0, this.field1053, 0);
        }
        if (this.field1043 != null) {
            for (int var10 = 0; var10 < this.field1043.length; var10++) {
                var5.method1919(this.field1043[var10], this.field1044[var10]);
            }
        }
        if (this.field1041 != null) {
            for (int var11 = 0; var11 < this.field1041.length; var11++) {
                var5.method1920(this.field1041[var11], this.field1046[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("az.z(ZI)Z")
    public final boolean method904(boolean arg0) {
        int var2 = this.field1066;
        int var3 = this.field1067;
        if (arg0) {
            var2 = this.field1068;
            var3 = this.field1069;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1063.method2861(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1063.method2861(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("az.u(ZI)Lce;")
    public final class95 method905(boolean arg0) {
        int var2 = this.field1066;
        int var3 = this.field1067;
        if (arg0) {
            var2 = this.field1068;
            var3 = this.field1069;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var4 = class95.method1905(Statics.field1063, var2, 0);
        if (var3 != -1) {
            class95 var5 = class95.method1905(Statics.field1063, var3, 0);
            class95[] var6 = new class95[] { var4, var5 };
            var4 = new class95(var6, 2);
        }
        if (this.field1043 != null) {
            for (int var7 = 0; var7 < this.field1043.length; var7++) {
                var4.method1919(this.field1043[var7], this.field1044[var7]);
            }
        }
        if (this.field1041 != null) {
            for (int var8 = 0; var8 < this.field1041.length; var8++) {
                var4.method1920(this.field1041[var8], this.field1046[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("el.g(B)V")
    public static void method2658() {
        field1039.method3319();
    }

    @ObfuscatedName("t.k(ZI)V")
    public static void method507(boolean arg0) {
        if (Statics.field1035 != arg0) {
            field1062.method3319();
            field1038.method3319();
            field1039.method3319();
            Statics.field1035 = arg0;
        }
    }
}
