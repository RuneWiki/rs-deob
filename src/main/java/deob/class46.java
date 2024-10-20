package deob;

@ObfuscatedName("aq")
public class class46 extends class185 {

    @ObfuscatedName("aq.b")
    public static class174 field1059 = new class174(64);

    @ObfuscatedName("aq.z")
    public static class174 field1030 = new class174(50);

    @ObfuscatedName("aq.w")
    public static class174 field1031 = new class174(100);

    @ObfuscatedName("aq.p")
    public int field1039;

    @ObfuscatedName("aq.n")
    public int field1073;

    @ObfuscatedName("aq.r")
    public String field1034 = "null";

    @ObfuscatedName("aq.s")
    public short[] field1035;

    @ObfuscatedName("aq.f")
    public short[] field1036;

    @ObfuscatedName("aq.c")
    public short[] field1037;

    @ObfuscatedName("aq.t")
    public short[] field1038;

    @ObfuscatedName("aq.i")
    public int field1049 = 2000;

    @ObfuscatedName("aq.u")
    public int field1040 = 0;

    @ObfuscatedName("aq.y")
    public int field1041 = 0;

    @ObfuscatedName("aq.o")
    public int field1070 = 0;

    @ObfuscatedName("aq.m")
    public int field1045 = 0;

    @ObfuscatedName("aq.h")
    public int field1044 = 0;

    @ObfuscatedName("aq.x")
    public int field1033 = 0;

    @ObfuscatedName("aq.d")
    public int field1027 = 1;

    @ObfuscatedName("aq.ac")
    public boolean field1029 = false;

    @ObfuscatedName("aq.ax")
    public String[] field1043 = new String[] { null, null, class145.field2273, null, null };

    @ObfuscatedName("aq.af")
    public String[] field1067 = new String[] { null, null, null, null, class145.field2189 };

    @ObfuscatedName("aq.am")
    public int field1050 = -1;

    @ObfuscatedName("aq.ah")
    public int field1051 = -1;

    @ObfuscatedName("aq.ar")
    public int field1046 = 0;

    @ObfuscatedName("aq.ad")
    public int field1053 = -1;

    @ObfuscatedName("aq.ao")
    public int field1054 = -1;

    @ObfuscatedName("aq.ae")
    public int field1055 = 0;

    @ObfuscatedName("aq.ab")
    public int field1056 = -1;

    @ObfuscatedName("aq.ai")
    public int field1024 = -1;

    @ObfuscatedName("aq.ag")
    public int field1058 = -1;

    @ObfuscatedName("aq.ap")
    public int field1068 = -1;

    @ObfuscatedName("aq.at")
    public int field1060 = -1;

    @ObfuscatedName("aq.az")
    public int field1061 = -1;

    @ObfuscatedName("aq.an")
    public int[] field1062;

    @ObfuscatedName("aq.ay")
    public int[] field1063;

    @ObfuscatedName("aq.aw")
    public int field1064 = -1;

    @ObfuscatedName("aq.ak")
    public int field1065 = -1;

    @ObfuscatedName("aq.aq")
    public int field1066 = 128;

    @ObfuscatedName("aq.aa")
    public int field1048 = 128;

    @ObfuscatedName("aq.aj")
    public int field1047 = 128;

    @ObfuscatedName("aq.au")
    public int field1069 = 0;

    @ObfuscatedName("aq.al")
    public int field1032 = 0;

    @ObfuscatedName("aq.as")
    public int field1071 = 0;

    @ObfuscatedName("aq.av")
    public boolean field1028 = false;

    @ObfuscatedName("m.e(II)Laq;")
    public static class46 method476(int arg0) {
        class46 var1 = (class46) field1059.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field709.method2721(10, arg0);
        class46 var3 = new class46();
        var3.field1039 = arg0;
        if (var2 != null) {
            var3.method839(new class108(var2));
        }
        var3.method837();
        if (var3.field1065 != -1) {
            var3.method841(method476(var3.field1065), method476(var3.field1064));
        }
        if (!Statics.field1042 && var3.field1029) {
            var3.field1034 = class145.field2205;
            var3.field1028 = false;
            var3.field1043 = null;
            var3.field1067 = null;
            var3.field1071 = 0;
        }
        field1059.method3156(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.v(I)V")
    public void method837() {
    }

    @ObfuscatedName("aq.k(Ldd;I)V")
    public void method839(class108 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method840(arg0, var2);
        }
    }

    @ObfuscatedName("aq.g(Ldd;II)V")
    public void method840(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1073 = arg0.method2124();
        } else if (arg1 == 2) {
            this.field1034 = arg0.method2130();
        } else if (arg1 == 4) {
            this.field1049 = arg0.method2124();
        } else if (arg1 == 5) {
            this.field1040 = arg0.method2124();
        } else if (arg1 == 6) {
            this.field1041 = arg0.method2124();
        } else if (arg1 == 7) {
            this.field1045 = arg0.method2124();
            if (this.field1045 > 32767) {
                this.field1045 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1044 = arg0.method2124();
            if (this.field1044 > 32767) {
                this.field1044 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1033 = 1;
        } else if (arg1 == 12) {
            this.field1027 = arg0.method2127();
        } else if (arg1 == 16) {
            this.field1029 = true;
        } else if (arg1 == 23) {
            this.field1050 = arg0.method2124();
            this.field1046 = arg0.method2122();
        } else if (arg1 == 24) {
            this.field1051 = arg0.method2124();
        } else if (arg1 == 25) {
            this.field1053 = arg0.method2124();
            this.field1055 = arg0.method2122();
        } else if (arg1 == 26) {
            this.field1054 = arg0.method2124();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1043[arg1 - 30] = arg0.method2130();
            if (this.field1043[arg1 - 30].equalsIgnoreCase(class145.field2335)) {
                this.field1043[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1067[arg1 - 35] = arg0.method2130();
        } else if (arg1 == 40) {
            int var3 = arg0.method2122();
            this.field1035 = new short[var3];
            this.field1036 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1035[var4] = (short) arg0.method2124();
                this.field1036[var4] = (short) arg0.method2124();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2122();
            this.field1037 = new short[var5];
            this.field1038 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1037[var6] = (short) arg0.method2124();
                this.field1038[var6] = (short) arg0.method2124();
            }
        } else if (arg1 == 65) {
            this.field1028 = true;
        } else if (arg1 == 78) {
            this.field1056 = arg0.method2124();
        } else if (arg1 == 79) {
            this.field1024 = arg0.method2124();
        } else if (arg1 == 90) {
            this.field1058 = arg0.method2124();
        } else if (arg1 == 91) {
            this.field1060 = arg0.method2124();
        } else if (arg1 == 92) {
            this.field1068 = arg0.method2124();
        } else if (arg1 == 93) {
            this.field1061 = arg0.method2124();
        } else if (arg1 == 95) {
            this.field1070 = arg0.method2124();
        } else if (arg1 == 97) {
            this.field1064 = arg0.method2124();
        } else if (arg1 == 98) {
            this.field1065 = arg0.method2124();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1062 == null) {
                this.field1062 = new int[10];
                this.field1063 = new int[10];
            }
            this.field1062[arg1 - 100] = arg0.method2124();
            this.field1063[arg1 - 100] = arg0.method2124();
        } else if (arg1 == 110) {
            this.field1066 = arg0.method2124();
        } else if (arg1 == 111) {
            this.field1048 = arg0.method2124();
        } else if (arg1 == 112) {
            this.field1047 = arg0.method2124();
        } else if (arg1 == 113) {
            this.field1069 = arg0.method2190();
        } else if (arg1 == 114) {
            this.field1032 = arg0.method2190();
        } else if (arg1 == 115) {
            this.field1071 = arg0.method2122();
        }
    }

    @ObfuscatedName("aq.q(Laq;Laq;I)V")
    public void method841(class46 arg0, class46 arg1) {
        this.field1073 = arg0.field1073;
        this.field1049 = arg0.field1049;
        this.field1040 = arg0.field1040;
        this.field1041 = arg0.field1041;
        this.field1070 = arg0.field1070;
        this.field1045 = arg0.field1045;
        this.field1044 = arg0.field1044;
        this.field1035 = arg0.field1035;
        this.field1036 = arg0.field1036;
        this.field1037 = arg0.field1037;
        this.field1038 = arg0.field1038;
        this.field1034 = arg1.field1034;
        this.field1029 = arg1.field1029;
        this.field1027 = arg1.field1027;
        this.field1033 = 1;
    }

    @ObfuscatedName("aq.l(IB)Lcd;")
    public final class94 method842(int arg0) {
        if (this.field1062 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1063[var3] && this.field1063[var3] != 0) {
                    var2 = this.field1062[var3];
                }
            }
            if (var2 != -1) {
                return method476(var2).method842(1);
            }
        }
        class94 var4 = class94.method1890(Statics.field1057, this.field1073, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1066 != 128 || this.field1048 != 128 || this.field1047 != 128) {
            var4.method1904(this.field1066, this.field1048, this.field1047);
        }
        if (this.field1035 != null) {
            for (int var5 = 0; var5 < this.field1035.length; var5++) {
                var4.method1901(this.field1035[var5], this.field1036[var5]);
            }
        }
        if (this.field1037 != null) {
            for (int var6 = 0; var6 < this.field1037.length; var6++) {
                var4.method1902(this.field1037[var6], this.field1038[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aq.a(II)Lcu;")
    public final class99 method843(int arg0) {
        if (this.field1062 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1063[var3] && this.field1063[var3] != 0) {
                    var2 = this.field1062[var3];
                }
            }
            if (var2 != -1) {
                return method476(var2).method843(1);
            }
        }
        class99 var4 = (class99) field1030.method3154((long) this.field1039);
        if (var4 != null) {
            return var4;
        }
        class94 var5 = class94.method1890(Statics.field1057, this.field1073, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1066 != 128 || this.field1048 != 128 || this.field1047 != 128) {
            var5.method1904(this.field1066, this.field1048, this.field1047);
        }
        if (this.field1035 != null) {
            for (int var6 = 0; var6 < this.field1035.length; var6++) {
                var5.method1901(this.field1035[var6], this.field1036[var6]);
            }
        }
        if (this.field1037 != null) {
            for (int var7 = 0; var7 < this.field1037.length; var7++) {
                var5.method1902(this.field1037[var7], this.field1038[var7]);
            }
        }
        class99 var8 = var5.method1909(this.field1069 + 64, this.field1032 * 5 + 768, -50, -10, -50);
        var8.field1731 = true;
        field1030.method3156(var8, (long) this.field1039);
        return var8;
    }

    @ObfuscatedName("aq.b(II)Laq;")
    public class46 method866(int arg0) {
        if (this.field1062 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1063[var3] && this.field1063[var3] != 0) {
                    var2 = this.field1062[var3];
                }
            }
            if (var2 != -1) {
                return method476(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ac.z(IIIIIZI)Lbo;")
    public static final class73 method502(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class73 var8 = (class73) field1031.method3154(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class46 var9 = method476(arg0);
        if (arg1 > 1 && var9.field1062 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1063[var11] && var9.field1063[var11] != 0) {
                    var10 = var9.field1062[var11];
                }
            }
            if (var10 != -1) {
                var9 = method476(var10);
            }
        }
        class99 var12 = var9.method843(1);
        if (var12 == null) {
            return null;
        }
        class73 var13 = null;
        if (var9.field1065 != -1) {
            var13 = method502(var9.field1064, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1335;
        int var15 = Statics.field1331;
        int var16 = Statics.field1336;
        int[] var17 = new int[4];
        class74.method1544(var17);
        class73 var18 = new class73(36, 32);
        class74.method1505(var18.field1325, 36, 32);
        class74.method1531();
        class85.method1779();
        class85.method1786(16, 16);
        class85.field1480 = false;
        int var19 = var9.field1049;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1500[var9.field1040] * var19 >> 16;
        int var21 = class85.field1501[var9.field1040] * var19 >> 16;
        var12.method1967();
        var12.method1992(0, var9.field1041, var9.field1070, var9.field1040, var9.field1045, var9.field1044 + var12.field1369 / 2 + var20, var9.field1044 + var21);
        if (arg2 >= 1) {
            var18.method1431(1);
        }
        if (arg2 >= 2) {
            var18.method1431(16777215);
        }
        if (arg3 != 0) {
            var18.method1432(arg3);
        }
        class74.method1505(var18.field1325, 36, 32);
        if (var9.field1065 != -1) {
            var13.method1435(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1033 == 1) {
            Statics.field66.method3483(method1590(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1031.method3156(var18, var6);
        }
        class74.method1505(var14, var15, var16);
        class74.method1510(var17);
        class85.method1779();
        class85.field1480 = true;
        return var18;
    }

    @ObfuscatedName("bj.w(IB)Ljava/lang/String;")
    public static final String method1590(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class145.field2329 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class145.field2327 + "</col>";
        }
    }

    @ObfuscatedName("aq.j(ZI)Z")
    public final boolean method845(boolean arg0) {
        int var2 = this.field1050;
        int var3 = this.field1051;
        int var4 = this.field1056;
        if (arg0) {
            var2 = this.field1053;
            var3 = this.field1054;
            var4 = this.field1024;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1057.method2767(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1057.method2767(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1057.method2767(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aq.p(ZI)Lcd;")
    public final class94 method846(boolean arg0) {
        int var2 = this.field1050;
        int var3 = this.field1051;
        int var4 = this.field1056;
        if (arg0) {
            var2 = this.field1053;
            var3 = this.field1054;
            var4 = this.field1024;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var5 = class94.method1890(Statics.field1057, var2, 0);
        if (var3 != -1) {
            class94 var6 = class94.method1890(Statics.field1057, var3, 0);
            if (var4 == -1) {
                class94[] var9 = new class94[] { var5, var6 };
                var5 = new class94(var9, 2);
            } else {
                class94 var7 = class94.method1890(Statics.field1057, var4, 0);
                class94[] var8 = new class94[] { var5, var6, var7 };
                var5 = new class94(var8, 3);
            }
        }
        if (!arg0 && this.field1046 != 0) {
            var5.method1900(0, this.field1046, 0);
        }
        if (arg0 && this.field1055 != 0) {
            var5.method1900(0, this.field1055, 0);
        }
        if (this.field1035 != null) {
            for (int var10 = 0; var10 < this.field1035.length; var10++) {
                var5.method1901(this.field1035[var10], this.field1036[var10]);
            }
        }
        if (this.field1037 != null) {
            for (int var11 = 0; var11 < this.field1037.length; var11++) {
                var5.method1902(this.field1037[var11], this.field1038[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aq.n(ZB)Z")
    public final boolean method847(boolean arg0) {
        int var2 = this.field1058;
        int var3 = this.field1068;
        if (arg0) {
            var2 = this.field1060;
            var3 = this.field1061;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1057.method2767(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1057.method2767(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aq.r(ZI)Lcd;")
    public final class94 method848(boolean arg0) {
        int var2 = this.field1058;
        int var3 = this.field1068;
        if (arg0) {
            var2 = this.field1060;
            var3 = this.field1061;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var4 = class94.method1890(Statics.field1057, var2, 0);
        if (var3 != -1) {
            class94 var5 = class94.method1890(Statics.field1057, var3, 0);
            class94[] var6 = new class94[] { var4, var5 };
            var4 = new class94(var6, 2);
        }
        if (this.field1035 != null) {
            for (int var7 = 0; var7 < this.field1035.length; var7++) {
                var4.method1901(this.field1035[var7], this.field1036[var7]);
            }
        }
        if (this.field1037 != null) {
            for (int var8 = 0; var8 < this.field1037.length; var8++) {
                var4.method1902(this.field1037[var8], this.field1038[var8]);
            }
        }
        return var4;
    }
}
