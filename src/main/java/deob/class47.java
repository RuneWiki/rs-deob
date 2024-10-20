package deob;

@ObfuscatedName("ad")
public class class47 extends class195 {

    @ObfuscatedName("ad.d")
    public static class184 field1025 = new class184(64);

    @ObfuscatedName("ad.j")
    public static class184 field1059 = new class184(50);

    @ObfuscatedName("ad.x")
    public static class184 field1031 = new class184(200);

    @ObfuscatedName("ad.a")
    public int field1029;

    @ObfuscatedName("ad.l")
    public int field1063;

    @ObfuscatedName("ad.h")
    public String field1034 = "null";

    @ObfuscatedName("ad.c")
    public short[] field1032;

    @ObfuscatedName("ad.u")
    public short[] field1033;

    @ObfuscatedName("ad.r")
    public short[] field1047;

    @ObfuscatedName("ad.k")
    public short[] field1026;

    @ObfuscatedName("ad.w")
    public int field1038 = 2000;

    @ObfuscatedName("ad.q")
    public int field1020 = 0;

    @ObfuscatedName("ad.g")
    public int field1050 = 0;

    @ObfuscatedName("ad.z")
    public int field1039 = 0;

    @ObfuscatedName("ad.m")
    public int field1040 = 0;

    @ObfuscatedName("ad.y")
    public int field1024 = 0;

    @ObfuscatedName("ad.n")
    public int field1042 = 0;

    @ObfuscatedName("ad.s")
    public int field1043 = 1;

    @ObfuscatedName("ad.ac")
    public boolean field1044 = false;

    @ObfuscatedName("ad.au")
    public String[] field1045 = new String[] { null, null, class148.field2330, null, null };

    @ObfuscatedName("ad.ap")
    public String[] field1060 = new String[] { null, null, null, null, class148.field2188 };

    @ObfuscatedName("ad.ah")
    public int field1061 = -1;

    @ObfuscatedName("ad.ae")
    public int field1048 = -1;

    @ObfuscatedName("ad.ag")
    public int field1049 = 0;

    @ObfuscatedName("ad.as")
    public int field1046 = -1;

    @ObfuscatedName("ad.at")
    public int field1051 = -1;

    @ObfuscatedName("ad.aw")
    public int field1041 = 0;

    @ObfuscatedName("ad.ay")
    public int field1053 = -1;

    @ObfuscatedName("ad.ao")
    public int field1054 = -1;

    @ObfuscatedName("ad.al")
    public int field1055 = -1;

    @ObfuscatedName("ad.ab")
    public int field1056 = -1;

    @ObfuscatedName("ad.aj")
    public int field1057 = -1;

    @ObfuscatedName("ad.ak")
    public int field1058 = -1;

    @ObfuscatedName("ad.ar")
    public int[] field1065;

    @ObfuscatedName("ad.ai")
    public int[] field1052;

    @ObfuscatedName("ad.ax")
    public int field1035 = -1;

    @ObfuscatedName("ad.az")
    public int field1062 = -1;

    @ObfuscatedName("ad.aq")
    public int field1030 = 128;

    @ObfuscatedName("ad.ad")
    public int field1036 = 128;

    @ObfuscatedName("ad.af")
    public int field1064 = 128;

    @ObfuscatedName("ad.aa")
    public int field1066 = 0;

    @ObfuscatedName("ad.av")
    public int field1067 = 0;

    @ObfuscatedName("ad.an")
    public int field1068 = 0;

    @ObfuscatedName("ad.am")
    public boolean field1069 = false;

    @ObfuscatedName("ad.bt")
    public int field1070 = -1;

    @ObfuscatedName("ad.br")
    public int field1071 = -1;

    @ObfuscatedName("ae.t(Lfj;Lfj;ZLhq;B)V")
    public static void method640(class158 arg0, class158 arg1, boolean arg2, class215 arg3) {
        Statics.field1022 = arg0;
        Statics.field1023 = arg1;
        Statics.field1027 = arg2;
        Statics.field2586 = Statics.field1022.method2891(10);
        Statics.field1028 = arg3;
    }

    @ObfuscatedName("t.b(IS)Lad;")
    public static class47 method2(int arg0) {
        class47 var1 = (class47) field1025.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1022.method2881(10, arg0);
        class47 var3 = new class47();
        var3.field1029 = arg0;
        if (var2 != null) {
            var3.method931(new class111(var2));
        }
        var3.method930();
        if (var3.field1062 != -1) {
            var3.method952(method2(var3.field1062), method2(var3.field1035));
        }
        if (var3.field1071 != -1) {
            var3.method934(method2(var3.field1071), method2(var3.field1070));
        }
        if (!Statics.field1027 && var3.field1044) {
            var3.field1034 = class148.field2310;
            var3.field1069 = false;
            var3.field1045 = null;
            var3.field1060 = null;
            var3.field1068 = 0;
        }
        field1025.method3341(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.p(B)V")
    public void method930() {
    }

    @ObfuscatedName("ad.e(Ldc;I)V")
    public void method931(class111 arg0) {
        while (true) {
            int var2 = arg0.method2172();
            if (var2 == 0) {
                return;
            }
            this.method946(arg0, var2);
        }
    }

    @ObfuscatedName("ad.i(Ldc;II)V")
    public void method946(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1063 = arg0.method2255();
        } else if (arg1 == 2) {
            this.field1034 = arg0.method2180();
        } else if (arg1 == 4) {
            this.field1038 = arg0.method2255();
        } else if (arg1 == 5) {
            this.field1020 = arg0.method2255();
        } else if (arg1 == 6) {
            this.field1050 = arg0.method2255();
        } else if (arg1 == 7) {
            this.field1040 = arg0.method2255();
            if (this.field1040 > 32767) {
                this.field1040 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1024 = arg0.method2255();
            if (this.field1024 > 32767) {
                this.field1024 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1042 = 1;
        } else if (arg1 == 12) {
            this.field1043 = arg0.method2177();
        } else if (arg1 == 16) {
            this.field1044 = true;
        } else if (arg1 == 23) {
            this.field1061 = arg0.method2255();
            this.field1049 = arg0.method2172();
        } else if (arg1 == 24) {
            this.field1048 = arg0.method2255();
        } else if (arg1 == 25) {
            this.field1046 = arg0.method2255();
            this.field1041 = arg0.method2172();
        } else if (arg1 == 26) {
            this.field1051 = arg0.method2255();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1045[arg1 - 30] = arg0.method2180();
            if (this.field1045[arg1 - 30].equalsIgnoreCase(class148.field2189)) {
                this.field1045[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1060[arg1 - 35] = arg0.method2180();
        } else if (arg1 == 40) {
            int var3 = arg0.method2172();
            this.field1032 = new short[var3];
            this.field1033 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1032[var4] = (short) arg0.method2255();
                this.field1033[var4] = (short) arg0.method2255();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2172();
            this.field1047 = new short[var5];
            this.field1026 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1047[var6] = (short) arg0.method2255();
                this.field1026[var6] = (short) arg0.method2255();
            }
        } else if (arg1 == 65) {
            this.field1069 = true;
        } else if (arg1 == 78) {
            this.field1053 = arg0.method2255();
        } else if (arg1 == 79) {
            this.field1054 = arg0.method2255();
        } else if (arg1 == 90) {
            this.field1055 = arg0.method2255();
        } else if (arg1 == 91) {
            this.field1057 = arg0.method2255();
        } else if (arg1 == 92) {
            this.field1056 = arg0.method2255();
        } else if (arg1 == 93) {
            this.field1058 = arg0.method2255();
        } else if (arg1 == 95) {
            this.field1039 = arg0.method2255();
        } else if (arg1 == 97) {
            this.field1035 = arg0.method2255();
        } else if (arg1 == 98) {
            this.field1062 = arg0.method2255();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1065 == null) {
                this.field1065 = new int[10];
                this.field1052 = new int[10];
            }
            this.field1065[arg1 - 100] = arg0.method2255();
            this.field1052[arg1 - 100] = arg0.method2255();
        } else if (arg1 == 110) {
            this.field1030 = arg0.method2255();
        } else if (arg1 == 111) {
            this.field1036 = arg0.method2255();
        } else if (arg1 == 112) {
            this.field1064 = arg0.method2255();
        } else if (arg1 == 113) {
            this.field1066 = arg0.method2358();
        } else if (arg1 == 114) {
            this.field1067 = arg0.method2358() * 5;
        } else if (arg1 == 115) {
            this.field1068 = arg0.method2172();
        } else if (arg1 == 139) {
            this.field1070 = arg0.method2255();
        } else if (arg1 == 140) {
            this.field1071 = arg0.method2255();
        }
    }

    @ObfuscatedName("ad.o(Lad;Lad;B)V")
    public void method952(class47 arg0, class47 arg1) {
        this.field1063 = arg0.field1063;
        this.field1038 = arg0.field1038;
        this.field1020 = arg0.field1020;
        this.field1050 = arg0.field1050;
        this.field1039 = arg0.field1039;
        this.field1040 = arg0.field1040;
        this.field1024 = arg0.field1024;
        this.field1032 = arg0.field1032;
        this.field1033 = arg0.field1033;
        this.field1047 = arg0.field1047;
        this.field1026 = arg0.field1026;
        this.field1034 = arg1.field1034;
        this.field1044 = arg1.field1044;
        this.field1043 = arg1.field1043;
        this.field1042 = 1;
    }

    @ObfuscatedName("ad.f(Lad;Lad;I)V")
    public void method934(class47 arg0, class47 arg1) {
        this.field1063 = arg0.field1063;
        this.field1038 = arg0.field1038;
        this.field1020 = arg0.field1020;
        this.field1050 = arg0.field1050;
        this.field1039 = arg0.field1039;
        this.field1040 = arg0.field1040;
        this.field1024 = arg0.field1024;
        this.field1032 = arg1.field1032;
        this.field1033 = arg1.field1033;
        this.field1047 = arg1.field1047;
        this.field1026 = arg1.field1026;
        this.field1034 = arg1.field1034;
        this.field1044 = arg1.field1044;
        this.field1042 = arg1.field1042;
        this.field1061 = arg1.field1061;
        this.field1048 = arg1.field1048;
        this.field1053 = arg1.field1053;
        this.field1046 = arg1.field1046;
        this.field1051 = arg1.field1051;
        this.field1054 = arg1.field1054;
        this.field1055 = arg1.field1055;
        this.field1056 = arg1.field1056;
        this.field1057 = arg1.field1057;
        this.field1058 = arg1.field1058;
        this.field1068 = arg1.field1068;
        this.field1045 = arg1.field1045;
        this.field1060 = new String[5];
        if (arg1.field1060 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1060[var3] = arg1.field1060[var3];
            }
        }
        this.field1060[4] = class148.field2193;
        this.field1043 = 0;
    }

    @ObfuscatedName("ad.d(II)Lcg;")
    public final class95 method953(int arg0) {
        if (this.field1065 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1052[var3] && this.field1052[var3] != 0) {
                    var2 = this.field1065[var3];
                }
            }
            if (var2 != -1) {
                return method2(var2).method953(1);
            }
        }
        class95 var4 = class95.method1964(Statics.field1023, this.field1063, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1030 != 128 || this.field1036 != 128 || this.field1064 != 128) {
            var4.method1945(this.field1030, this.field1036, this.field1064);
        }
        if (this.field1032 != null) {
            for (int var5 = 0; var5 < this.field1032.length; var5++) {
                var4.method1995(this.field1032[var5], this.field1033[var5]);
            }
        }
        if (this.field1047 != null) {
            for (int var6 = 0; var6 < this.field1047.length; var6++) {
                var4.method1943(this.field1047[var6], this.field1026[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.j(IB)Lcs;")
    public final class100 method935(int arg0) {
        if (this.field1065 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1052[var3] && this.field1052[var3] != 0) {
                    var2 = this.field1065[var3];
                }
            }
            if (var2 != -1) {
                return method2(var2).method935(1);
            }
        }
        class100 var4 = (class100) field1059.method3339((long) this.field1029);
        if (var4 != null) {
            return var4;
        }
        class95 var5 = class95.method1964(Statics.field1023, this.field1063, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1030 != 128 || this.field1036 != 128 || this.field1064 != 128) {
            var5.method1945(this.field1030, this.field1036, this.field1064);
        }
        if (this.field1032 != null) {
            for (int var6 = 0; var6 < this.field1032.length; var6++) {
                var5.method1995(this.field1032[var6], this.field1033[var6]);
            }
        }
        if (this.field1047 != null) {
            for (int var7 = 0; var7 < this.field1047.length; var7++) {
                var5.method1943(this.field1047[var7], this.field1026[var7]);
            }
        }
        class100 var8 = var5.method1950(this.field1066 + 64, this.field1067 + 768, -50, -10, -50);
        var8.field1743 = true;
        field1059.method3341(var8, (long) this.field1029);
        return var8;
    }

    @ObfuscatedName("ad.x(IB)Lad;")
    public class47 method950(int arg0) {
        if (this.field1065 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1052[var3] && this.field1052[var3] != 0) {
                    var2 = this.field1065[var3];
                }
            }
            if (var2 != -1) {
                return method2(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ea.v(IIIIIZI)Lbb;")
    public static final class74 method2657(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class74 var8 = (class74) field1031.method3339(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class47 var9 = method2(arg0);
        if (arg1 > 1 && var9.field1065 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1052[var11] && var9.field1052[var11] != 0) {
                    var10 = var9.field1065[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2(var10);
            }
        }
        class100 var12 = var9.method935(1);
        if (var12 == null) {
            return null;
        }
        class74 var13 = null;
        if (var9.field1062 != -1) {
            var13 = method2657(var9.field1035, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1071 != -1) {
            var13 = method2657(var9.field1070, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1329;
        int var15 = Statics.field1327;
        int var16 = Statics.field1328;
        int[] var17 = new int[4];
        class75.method1576(var17);
        class74 var18 = new class74(36, 32);
        class75.method1583(var18.field1317, 36, 32);
        class75.method1619();
        class86.method1838();
        class86.method1865(16, 16);
        class86.field1501 = false;
        int var19 = var9.field1038;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class86.field1504[var9.field1020] * var19 >> 16;
        int var21 = class86.field1491[var9.field1020] * var19 >> 16;
        var12.method2020();
        var12.method2015(0, var9.field1050, var9.field1039, var9.field1020, var9.field1040, var9.field1024 + var12.field1364 / 2 + var20, var9.field1024 + var21);
        if (var9.field1071 != -1) {
            var13.method1528(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1519(1);
        }
        if (arg2 >= 2) {
            var18.method1519(16777215);
        }
        if (arg3 != 0) {
            var18.method1533(arg3);
        }
        class75.method1583(var18.field1317, 36, 32);
        if (var9.field1062 != -1) {
            var13.method1528(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1042 == 1) {
            class215 var22 = Statics.field1028;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class148.field2227 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class148.field2453 + "</col>";
            }
            var22.method3612(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1031.method3341(var18, var6);
        }
        class75.method1583(var14, var15, var16);
        class75.method1580(var17);
        class86.method1838();
        class86.field1501 = true;
        return var18;
    }

    @ObfuscatedName("ad.a(ZI)Z")
    public final boolean method937(boolean arg0) {
        int var2 = this.field1061;
        int var3 = this.field1048;
        int var4 = this.field1053;
        if (arg0) {
            var2 = this.field1046;
            var3 = this.field1051;
            var4 = this.field1054;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1023.method2953(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1023.method2953(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1023.method2953(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ad.l(ZI)Lcg;")
    public final class95 method967(boolean arg0) {
        int var2 = this.field1061;
        int var3 = this.field1048;
        int var4 = this.field1053;
        if (arg0) {
            var2 = this.field1046;
            var3 = this.field1051;
            var4 = this.field1054;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var5 = class95.method1964(Statics.field1023, var2, 0);
        if (var3 != -1) {
            class95 var6 = class95.method1964(Statics.field1023, var3, 0);
            if (var4 == -1) {
                class95[] var9 = new class95[] { var5, var6 };
                var5 = new class95(var9, 2);
            } else {
                class95 var7 = class95.method1964(Statics.field1023, var4, 0);
                class95[] var8 = new class95[] { var5, var6, var7 };
                var5 = new class95(var8, 3);
            }
        }
        if (!arg0 && this.field1049 != 0) {
            var5.method1941(0, this.field1049, 0);
        }
        if (arg0 && this.field1041 != 0) {
            var5.method1941(0, this.field1041, 0);
        }
        if (this.field1032 != null) {
            for (int var10 = 0; var10 < this.field1032.length; var10++) {
                var5.method1995(this.field1032[var10], this.field1033[var10]);
            }
        }
        if (this.field1047 != null) {
            for (int var11 = 0; var11 < this.field1047.length; var11++) {
                var5.method1943(this.field1047[var11], this.field1026[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ad.h(ZB)Z")
    public final boolean method939(boolean arg0) {
        int var2 = this.field1055;
        int var3 = this.field1056;
        if (arg0) {
            var2 = this.field1057;
            var3 = this.field1058;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1023.method2953(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1023.method2953(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ad.c(ZI)Lcg;")
    public final class95 method941(boolean arg0) {
        int var2 = this.field1055;
        int var3 = this.field1056;
        if (arg0) {
            var2 = this.field1057;
            var3 = this.field1058;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var4 = class95.method1964(Statics.field1023, var2, 0);
        if (var3 != -1) {
            class95 var5 = class95.method1964(Statics.field1023, var3, 0);
            class95[] var6 = new class95[] { var4, var5 };
            var4 = new class95(var6, 2);
        }
        if (this.field1032 != null) {
            for (int var7 = 0; var7 < this.field1032.length; var7++) {
                var4.method1995(this.field1032[var7], this.field1033[var7]);
            }
        }
        if (this.field1047 != null) {
            for (int var8 = 0; var8 < this.field1047.length; var8++) {
                var4.method1943(this.field1047[var8], this.field1026[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cm.u(I)V")
    public static void method1921() {
        field1025.method3342();
        field1059.method3342();
        field1031.method3342();
    }
}
