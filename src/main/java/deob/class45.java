package deob;

@ObfuscatedName("ac")
public class class45 extends class182 {

    @ObfuscatedName("ac.b")
    public static class171 field1024 = new class171(64);

    @ObfuscatedName("ac.w")
    public static class171 field1025 = new class171(50);

    @ObfuscatedName("ac.r")
    public static class171 field1026 = new class171(100);

    @ObfuscatedName("ac.s")
    public int field1028;

    @ObfuscatedName("ac.f")
    public int field1029;

    @ObfuscatedName("ac.x")
    public String field1022 = "null";

    @ObfuscatedName("ac.h")
    public short[] field1031;

    @ObfuscatedName("ac.a")
    public short[] field1056;

    @ObfuscatedName("ac.u")
    public short[] field1033;

    @ObfuscatedName("ac.v")
    public short[] field1034;

    @ObfuscatedName("ac.i")
    public int field1035 = 2000;

    @ObfuscatedName("ac.n")
    public int field1032 = 0;

    @ObfuscatedName("ac.d")
    public int field1037 = 0;

    @ObfuscatedName("ac.k")
    public int field1038 = 0;

    @ObfuscatedName("ac.p")
    public int field1062 = 0;

    @ObfuscatedName("ac.j")
    public int field1040 = 0;

    @ObfuscatedName("ac.z")
    public int field1043 = 0;

    @ObfuscatedName("ac.t")
    public int field1042 = 1;

    @ObfuscatedName("ac.c")
    public boolean field1058 = false;

    @ObfuscatedName("ac.q")
    public String[] field1044 = new String[] { null, null, class142.field2142, null, null };

    @ObfuscatedName("ac.g")
    public String[] field1045 = new String[] { null, null, null, null, class142.field2370 };

    @ObfuscatedName("ac.m")
    public int field1046 = -1;

    @ObfuscatedName("ac.ay")
    public int field1041 = -1;

    @ObfuscatedName("ac.ae")
    public int field1048 = 0;

    @ObfuscatedName("ac.af")
    public int field1047 = -1;

    @ObfuscatedName("ac.ab")
    public int field1050 = -1;

    @ObfuscatedName("ac.ao")
    public int field1039 = 0;

    @ObfuscatedName("ac.ak")
    public int field1052 = -1;

    @ObfuscatedName("ac.ah")
    public int field1036 = -1;

    @ObfuscatedName("ac.ai")
    public int field1030 = -1;

    @ObfuscatedName("ac.al")
    public int field1055 = -1;

    @ObfuscatedName("ac.av")
    public int field1057 = -1;

    @ObfuscatedName("ac.ap")
    public int field1068 = -1;

    @ObfuscatedName("ac.ar")
    public int[] field1023;

    @ObfuscatedName("ac.au")
    public int[] field1059;

    @ObfuscatedName("ac.aq")
    public int field1060 = -1;

    @ObfuscatedName("ac.at")
    public int field1061 = -1;

    @ObfuscatedName("ac.ag")
    public int field1054 = 128;

    @ObfuscatedName("ac.am")
    public int field1053 = 128;

    @ObfuscatedName("ac.aw")
    public int field1021 = 128;

    @ObfuscatedName("ac.ac")
    public int field1065 = 0;

    @ObfuscatedName("ac.as")
    public int field1067 = 0;

    @ObfuscatedName("ac.az")
    public int field1064 = 0;

    @ObfuscatedName("cw.e(II)Lac;")
    public static class45 method1729(int arg0) {
        class45 var1 = (class45) field1024.method3058((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1049.method2709(10, arg0);
        class45 var3 = new class45();
        var3.field1028 = arg0;
        if (var2 != null) {
            var3.method840(new class107(var2));
        }
        var3.method874();
        if (var3.field1061 != -1) {
            var3.method842(method1729(var3.field1061), method1729(var3.field1060));
        }
        if (!Statics.field1051 && var3.field1058) {
            var3.field1022 = class142.field2288;
            var3.field1044 = null;
            var3.field1045 = null;
            var3.field1064 = 0;
        }
        field1024.method3057(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.o(I)V")
    public void method874() {
    }

    @ObfuscatedName("ac.y(Ldl;I)V")
    public void method840(class107 arg0) {
        while (true) {
            int var2 = arg0.method2123();
            if (var2 == 0) {
                return;
            }
            this.method841(arg0, var2);
        }
    }

    @ObfuscatedName("ac.b(Ldl;IB)V")
    public void method841(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1029 = arg0.method2232();
        } else if (arg1 == 2) {
            this.field1022 = arg0.method2073();
        } else if (arg1 == 4) {
            this.field1035 = arg0.method2232();
        } else if (arg1 == 5) {
            this.field1032 = arg0.method2232();
        } else if (arg1 == 6) {
            this.field1037 = arg0.method2232();
        } else if (arg1 == 7) {
            this.field1062 = arg0.method2232();
            if (this.field1062 > 32767) {
                this.field1062 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1040 = arg0.method2232();
            if (this.field1040 > 32767) {
                this.field1040 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1043 = 1;
        } else if (arg1 == 12) {
            this.field1042 = arg0.method2207();
        } else if (arg1 == 16) {
            this.field1058 = true;
        } else if (arg1 == 23) {
            this.field1046 = arg0.method2232();
            this.field1048 = arg0.method2123();
        } else if (arg1 == 24) {
            this.field1041 = arg0.method2232();
        } else if (arg1 == 25) {
            this.field1047 = arg0.method2232();
            this.field1039 = arg0.method2123();
        } else if (arg1 == 26) {
            this.field1050 = arg0.method2232();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1044[arg1 - 30] = arg0.method2073();
            if (this.field1044[arg1 - 30].equalsIgnoreCase(class142.field2145)) {
                this.field1044[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1045[arg1 - 35] = arg0.method2073();
        } else if (arg1 == 40) {
            int var3 = arg0.method2123();
            this.field1031 = new short[var3];
            this.field1056 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1031[var4] = (short) arg0.method2232();
                this.field1056[var4] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2123();
            this.field1033 = new short[var5];
            this.field1034 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1033[var6] = (short) arg0.method2232();
                this.field1034[var6] = (short) arg0.method2232();
            }
        } else if (arg1 == 78) {
            this.field1052 = arg0.method2232();
        } else if (arg1 == 79) {
            this.field1036 = arg0.method2232();
        } else if (arg1 == 90) {
            this.field1030 = arg0.method2232();
        } else if (arg1 == 91) {
            this.field1057 = arg0.method2232();
        } else if (arg1 == 92) {
            this.field1055 = arg0.method2232();
        } else if (arg1 == 93) {
            this.field1068 = arg0.method2232();
        } else if (arg1 == 95) {
            this.field1038 = arg0.method2232();
        } else if (arg1 == 97) {
            this.field1060 = arg0.method2232();
        } else if (arg1 == 98) {
            this.field1061 = arg0.method2232();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1023 == null) {
                this.field1023 = new int[10];
                this.field1059 = new int[10];
            }
            this.field1023[arg1 - 100] = arg0.method2232();
            this.field1059[arg1 - 100] = arg0.method2232();
        } else if (arg1 == 110) {
            this.field1054 = arg0.method2232();
        } else if (arg1 == 111) {
            this.field1053 = arg0.method2232();
        } else if (arg1 == 112) {
            this.field1021 = arg0.method2232();
        } else if (arg1 == 113) {
            this.field1065 = arg0.method2066();
        } else if (arg1 == 114) {
            this.field1067 = arg0.method2066();
        } else if (arg1 == 115) {
            this.field1064 = arg0.method2123();
        }
    }

    @ObfuscatedName("ac.w(Lac;Lac;I)V")
    public void method842(class45 arg0, class45 arg1) {
        this.field1029 = arg0.field1029;
        this.field1035 = arg0.field1035;
        this.field1032 = arg0.field1032;
        this.field1037 = arg0.field1037;
        this.field1038 = arg0.field1038;
        this.field1062 = arg0.field1062;
        this.field1040 = arg0.field1040;
        this.field1031 = arg0.field1031;
        this.field1056 = arg0.field1056;
        this.field1033 = arg0.field1033;
        this.field1034 = arg0.field1034;
        this.field1022 = arg1.field1022;
        this.field1058 = arg1.field1058;
        this.field1042 = arg1.field1042;
        this.field1043 = 1;
    }

    @ObfuscatedName("ac.r(II)Lck;")
    public final class93 method867(int arg0) {
        if (this.field1023 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1059[var3] && this.field1059[var3] != 0) {
                    var2 = this.field1023[var3];
                }
            }
            if (var2 != -1) {
                return method1729(var2).method867(1);
            }
        }
        class93 var4 = class93.method1831(Statics.field1063, this.field1029, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1054 != 128 || this.field1053 != 128 || this.field1021 != 128) {
            var4.method1884(this.field1054, this.field1053, this.field1021);
        }
        if (this.field1031 != null) {
            for (int var5 = 0; var5 < this.field1031.length; var5++) {
                var4.method1868(this.field1031[var5], this.field1056[var5]);
            }
        }
        if (this.field1033 != null) {
            for (int var6 = 0; var6 < this.field1033.length; var6++) {
                var4.method1844(this.field1033[var6], this.field1034[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ac.l(II)Lcd;")
    public final class98 method865(int arg0) {
        if (this.field1023 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1059[var3] && this.field1059[var3] != 0) {
                    var2 = this.field1023[var3];
                }
            }
            if (var2 != -1) {
                return method1729(var2).method865(1);
            }
        }
        class98 var4 = (class98) field1025.method3058((long) this.field1028);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1831(Statics.field1063, this.field1029, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1054 != 128 || this.field1053 != 128 || this.field1021 != 128) {
            var5.method1884(this.field1054, this.field1053, this.field1021);
        }
        if (this.field1031 != null) {
            for (int var6 = 0; var6 < this.field1031.length; var6++) {
                var5.method1868(this.field1031[var6], this.field1056[var6]);
            }
        }
        if (this.field1033 != null) {
            for (int var7 = 0; var7 < this.field1033.length; var7++) {
                var5.method1844(this.field1033[var7], this.field1034[var7]);
            }
        }
        class98 var8 = var5.method1900(this.field1065 + 64, this.field1067 * 5 + 768, -50, -10, -50);
        var8.field1720 = true;
        field1025.method3057(var8, (long) this.field1028);
        return var8;
    }

    @ObfuscatedName("ac.s(II)Lac;")
    public class45 method845(int arg0) {
        if (this.field1023 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1059[var3] && this.field1059[var3] != 0) {
                    var2 = this.field1023[var3];
                }
            }
            if (var2 != -1) {
                return method1729(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("r.f(IIIIZI)Lbg;")
    public static final class72 method62(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1026.method3058(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method1729(arg0);
        if (arg1 > 1 && var8.field1023 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1059[var10] && var8.field1059[var10] != 0) {
                    var9 = var8.field1023[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1729(var9);
            }
        }
        class98 var11 = var8.method865(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1061 != -1) {
            var12 = method62(var8.field1060, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1317;
        int var14 = Statics.field1318;
        int var15 = Statics.field1316;
        int[] var16 = new int[4];
        class73.method1479(var16);
        class72 var17 = new class72(36, 32);
        class73.method1476(var17.field1303, 36, 32);
        class73.method1496();
        class84.method1738();
        class84.method1741(16, 16);
        class84.field1467 = false;
        int var18 = var8.field1035;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1465[var8.field1032] * var18 >> 16;
        int var20 = class84.field1486[var8.field1032] * var18 >> 16;
        var11.method1923();
        var11.method1939(0, var8.field1037, var8.field1038, var8.field1032, var8.field1062, var8.field1040 + var11.field1353 / 2 + var19, var8.field1040 + var20);
        if (arg2 >= 1) {
            var17.method1396(1);
        }
        if (arg2 >= 2) {
            var17.method1396(16777215);
        }
        if (arg3 != 0) {
            var17.method1390(arg3);
        }
        class73.method1476(var17.field1303, 36, 32);
        if (var8.field1061 != -1) {
            var12.method1400(0, 0);
        }
        if (!arg4 && (var8.field1043 == 1 || arg1 != 1) && arg1 != -1) {
            class193 var21 = Statics.field1027;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class142.field2357 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class142.field2303 + "</col>";
            }
            var21.method3239(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1026.method3057(var17, var5);
        }
        class73.method1476(var13, var14, var15);
        class73.method1480(var16);
        class84.method1738();
        class84.field1467 = true;
        return var17;
    }

    @ObfuscatedName("ac.x(ZB)Z")
    public final boolean method846(boolean arg0) {
        int var2 = this.field1046;
        int var3 = this.field1041;
        int var4 = this.field1052;
        if (arg0) {
            var2 = this.field1047;
            var3 = this.field1050;
            var4 = this.field1036;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1063.method2649(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1063.method2649(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1063.method2649(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ac.h(ZI)Lck;")
    public final class93 method847(boolean arg0) {
        int var2 = this.field1046;
        int var3 = this.field1041;
        int var4 = this.field1052;
        if (arg0) {
            var2 = this.field1047;
            var3 = this.field1050;
            var4 = this.field1036;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1831(Statics.field1063, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1831(Statics.field1063, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1831(Statics.field1063, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1048 != 0) {
            var5.method1870(0, this.field1048, 0);
        }
        if (arg0 && this.field1039 != 0) {
            var5.method1870(0, this.field1039, 0);
        }
        if (this.field1031 != null) {
            for (int var10 = 0; var10 < this.field1031.length; var10++) {
                var5.method1868(this.field1031[var10], this.field1056[var10]);
            }
        }
        if (this.field1033 != null) {
            for (int var11 = 0; var11 < this.field1033.length; var11++) {
                var5.method1844(this.field1033[var11], this.field1034[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ac.a(ZB)Z")
    public final boolean method857(boolean arg0) {
        int var2 = this.field1030;
        int var3 = this.field1055;
        if (arg0) {
            var2 = this.field1057;
            var3 = this.field1068;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1063.method2649(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1063.method2649(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ac.u(ZB)Lck;")
    public final class93 method849(boolean arg0) {
        int var2 = this.field1030;
        int var3 = this.field1055;
        if (arg0) {
            var2 = this.field1057;
            var3 = this.field1068;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1831(Statics.field1063, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1831(Statics.field1063, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1031 != null) {
            for (int var7 = 0; var7 < this.field1031.length; var7++) {
                var4.method1868(this.field1031[var7], this.field1056[var7]);
            }
        }
        if (this.field1033 != null) {
            for (int var8 = 0; var8 < this.field1033.length; var8++) {
                var4.method1844(this.field1033[var8], this.field1034[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ba.v(I)V")
    public static void method1387() {
        field1024.method3065();
        field1025.method3065();
        field1026.method3065();
    }
}
