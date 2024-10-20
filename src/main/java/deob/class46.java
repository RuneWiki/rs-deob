package deob;

@ObfuscatedName("ab")
public class class46 extends class185 {

    @ObfuscatedName("ab.x")
    public static class174 field1070 = new class174(64);

    @ObfuscatedName("ab.g")
    public static class174 field1049 = new class174(50);

    @ObfuscatedName("ab.o")
    public static class174 field1027 = new class174(100);

    @ObfuscatedName("ab.v")
    public int field1066;

    @ObfuscatedName("ab.w")
    public int field1029;

    @ObfuscatedName("ab.t")
    public String field1030 = "null";

    @ObfuscatedName("ab.s")
    public short[] field1031;

    @ObfuscatedName("ab.b")
    public short[] field1032;

    @ObfuscatedName("ab.u")
    public short[] field1033;

    @ObfuscatedName("ab.j")
    public short[] field1034;

    @ObfuscatedName("ab.d")
    public int field1035 = 2000;

    @ObfuscatedName("ab.l")
    public int field1036 = 0;

    @ObfuscatedName("ab.m")
    public int field1055 = 0;

    @ObfuscatedName("ab.q")
    public int field1021 = 0;

    @ObfuscatedName("ab.h")
    public int field1039 = 0;

    @ObfuscatedName("ab.c")
    public int field1040 = 0;

    @ObfuscatedName("ab.z")
    public int field1041 = 0;

    @ObfuscatedName("ab.i")
    public int field1042 = 1;

    @ObfuscatedName("ab.ah")
    public boolean field1043 = false;

    @ObfuscatedName("ab.aj")
    public String[] field1024 = new String[] { null, null, class145.field2171, null, null };

    @ObfuscatedName("ab.ar")
    public String[] field1069 = new String[] { null, null, null, null, class145.field2172 };

    @ObfuscatedName("ab.al")
    public int field1046 = -1;

    @ObfuscatedName("ab.aw")
    public int field1047 = -1;

    @ObfuscatedName("ab.ao")
    public int field1019 = 0;

    @ObfuscatedName("ab.ax")
    public int field1037 = -1;

    @ObfuscatedName("ab.au")
    public int field1050 = -1;

    @ObfuscatedName("ab.av")
    public int field1051 = 0;

    @ObfuscatedName("ab.ae")
    public int field1052 = -1;

    @ObfuscatedName("ab.ak")
    public int field1053 = -1;

    @ObfuscatedName("ab.ay")
    public int field1059 = -1;

    @ObfuscatedName("ab.at")
    public int field1054 = -1;

    @ObfuscatedName("ab.ap")
    public int field1056 = -1;

    @ObfuscatedName("ab.an")
    public int field1057 = -1;

    @ObfuscatedName("ab.ad")
    public int[] field1058;

    @ObfuscatedName("ab.ag")
    public int[] field1038;

    @ObfuscatedName("ab.am")
    public int field1048 = -1;

    @ObfuscatedName("ab.ai")
    public int field1061 = -1;

    @ObfuscatedName("ab.ab")
    public int field1062 = 128;

    @ObfuscatedName("ab.af")
    public int field1063 = 128;

    @ObfuscatedName("ab.ac")
    public int field1064 = 128;

    @ObfuscatedName("ab.aq")
    public int field1044 = 0;

    @ObfuscatedName("ab.as")
    public int field1025 = 0;

    @ObfuscatedName("ab.az")
    public int field1067 = 0;

    @ObfuscatedName("ab.aa")
    public boolean field1068 = false;

    @ObfuscatedName("b.f(Lev;Lev;ZLgc;B)V")
    public static void method171(class149 arg0, class149 arg1, boolean arg2, class205 arg3) {
        Statics.field1022 = arg0;
        Statics.field1023 = arg1;
        Statics.field623 = arg2;
        Statics.field1028 = Statics.field1022.method2773(10);
        Statics.field1592 = arg3;
    }

    @ObfuscatedName("q.k(IS)Lab;")
    public static class46 method515(int arg0) {
        class46 var1 = (class46) field1070.method3207((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1022.method2763(10, arg0);
        class46 var3 = new class46();
        var3.field1066 = arg0;
        if (var2 != null) {
            var3.method928(new class108(var2));
        }
        var3.method885();
        if (var3.field1061 != -1) {
            var3.method906(method515(var3.field1061), method515(var3.field1048));
        }
        if (!Statics.field623 && var3.field1043) {
            var3.field1030 = class145.field2405;
            var3.field1068 = false;
            var3.field1024 = null;
            var3.field1069 = null;
            var3.field1067 = 0;
        }
        field1070.method3209(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.y(S)V")
    public void method885() {
    }

    @ObfuscatedName("ab.e(Ldu;I)V")
    public void method928(class108 arg0) {
        while (true) {
            int var2 = arg0.method2158();
            if (var2 == 0) {
                return;
            }
            this.method887(arg0, var2);
        }
    }

    @ObfuscatedName("ab.r(Ldu;II)V")
    public void method887(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1029 = arg0.method2160();
        } else if (arg1 == 2) {
            this.field1030 = arg0.method2275();
        } else if (arg1 == 4) {
            this.field1035 = arg0.method2160();
        } else if (arg1 == 5) {
            this.field1036 = arg0.method2160();
        } else if (arg1 == 6) {
            this.field1055 = arg0.method2160();
        } else if (arg1 == 7) {
            this.field1039 = arg0.method2160();
            if (this.field1039 > 32767) {
                this.field1039 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1040 = arg0.method2160();
            if (this.field1040 > 32767) {
                this.field1040 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1041 = 1;
        } else if (arg1 == 12) {
            this.field1042 = arg0.method2256();
        } else if (arg1 == 16) {
            this.field1043 = true;
        } else if (arg1 == 23) {
            this.field1046 = arg0.method2160();
            this.field1019 = arg0.method2158();
        } else if (arg1 == 24) {
            this.field1047 = arg0.method2160();
        } else if (arg1 == 25) {
            this.field1037 = arg0.method2160();
            this.field1051 = arg0.method2158();
        } else if (arg1 == 26) {
            this.field1050 = arg0.method2160();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1024[arg1 - 30] = arg0.method2275();
            if (this.field1024[arg1 - 30].equalsIgnoreCase(class145.field2369)) {
                this.field1024[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1069[arg1 - 35] = arg0.method2275();
        } else if (arg1 == 40) {
            int var3 = arg0.method2158();
            this.field1031 = new short[var3];
            this.field1032 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1031[var4] = (short) arg0.method2160();
                this.field1032[var4] = (short) arg0.method2160();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2158();
            this.field1033 = new short[var5];
            this.field1034 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1033[var6] = (short) arg0.method2160();
                this.field1034[var6] = (short) arg0.method2160();
            }
        } else if (arg1 == 65) {
            this.field1068 = true;
        } else if (arg1 == 78) {
            this.field1052 = arg0.method2160();
        } else if (arg1 == 79) {
            this.field1053 = arg0.method2160();
        } else if (arg1 == 90) {
            this.field1059 = arg0.method2160();
        } else if (arg1 == 91) {
            this.field1056 = arg0.method2160();
        } else if (arg1 == 92) {
            this.field1054 = arg0.method2160();
        } else if (arg1 == 93) {
            this.field1057 = arg0.method2160();
        } else if (arg1 == 95) {
            this.field1021 = arg0.method2160();
        } else if (arg1 == 97) {
            this.field1048 = arg0.method2160();
        } else if (arg1 == 98) {
            this.field1061 = arg0.method2160();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1058 == null) {
                this.field1058 = new int[10];
                this.field1038 = new int[10];
            }
            this.field1058[arg1 - 100] = arg0.method2160();
            this.field1038[arg1 - 100] = arg0.method2160();
        } else if (arg1 == 110) {
            this.field1062 = arg0.method2160();
        } else if (arg1 == 111) {
            this.field1063 = arg0.method2160();
        } else if (arg1 == 112) {
            this.field1064 = arg0.method2160();
        } else if (arg1 == 113) {
            this.field1044 = arg0.method2159();
        } else if (arg1 == 114) {
            this.field1025 = arg0.method2159() * 5;
        } else if (arg1 == 115) {
            this.field1067 = arg0.method2158();
        }
    }

    @ObfuscatedName("ab.a(Lab;Lab;I)V")
    public void method906(class46 arg0, class46 arg1) {
        this.field1029 = arg0.field1029;
        this.field1035 = arg0.field1035;
        this.field1036 = arg0.field1036;
        this.field1055 = arg0.field1055;
        this.field1021 = arg0.field1021;
        this.field1039 = arg0.field1039;
        this.field1040 = arg0.field1040;
        this.field1031 = arg0.field1031;
        this.field1032 = arg0.field1032;
        this.field1033 = arg0.field1033;
        this.field1034 = arg0.field1034;
        this.field1030 = arg1.field1030;
        this.field1043 = arg1.field1043;
        this.field1042 = arg1.field1042;
        this.field1041 = 1;
    }

    @ObfuscatedName("ab.n(IB)Lcy;")
    public final class94 method933(int arg0) {
        if (this.field1058 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1038[var3] && this.field1038[var3] != 0) {
                    var2 = this.field1058[var3];
                }
            }
            if (var2 != -1) {
                return method515(var2).method933(1);
            }
        }
        class94 var4 = class94.method1925(Statics.field1023, this.field1029, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1062 != 128 || this.field1063 != 128 || this.field1064 != 128) {
            var4.method1942(this.field1062, this.field1063, this.field1064);
        }
        if (this.field1031 != null) {
            for (int var5 = 0; var5 < this.field1031.length; var5++) {
                var4.method1939(this.field1031[var5], this.field1032[var5]);
            }
        }
        if (this.field1033 != null) {
            for (int var6 = 0; var6 < this.field1033.length; var6++) {
                var4.method1944(this.field1033[var6], this.field1034[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ab.x(IB)Lci;")
    public final class99 method890(int arg0) {
        if (this.field1058 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1038[var3] && this.field1038[var3] != 0) {
                    var2 = this.field1058[var3];
                }
            }
            if (var2 != -1) {
                return method515(var2).method890(1);
            }
        }
        class99 var4 = (class99) field1049.method3207((long) this.field1066);
        if (var4 != null) {
            return var4;
        }
        class94 var5 = class94.method1925(Statics.field1023, this.field1029, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1062 != 128 || this.field1063 != 128 || this.field1064 != 128) {
            var5.method1942(this.field1062, this.field1063, this.field1064);
        }
        if (this.field1031 != null) {
            for (int var6 = 0; var6 < this.field1031.length; var6++) {
                var5.method1939(this.field1031[var6], this.field1032[var6]);
            }
        }
        if (this.field1033 != null) {
            for (int var7 = 0; var7 < this.field1033.length; var7++) {
                var5.method1944(this.field1033[var7], this.field1034[var7]);
            }
        }
        class99 var8 = var5.method1946(this.field1044 + 64, this.field1025 + 768, -50, -10, -50);
        var8.field1732 = true;
        field1049.method3209(var8, (long) this.field1066);
        return var8;
    }

    @ObfuscatedName("ab.g(II)Lab;")
    public class46 method891(int arg0) {
        if (this.field1058 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1038[var3] && this.field1038[var3] != 0) {
                    var2 = this.field1058[var3];
                }
            }
            if (var2 != -1) {
                return method515(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("el.o(IIIIIZB)Lbq;")
    public static final class73 method2749(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg4 == 2) {
            if (arg1 == -1) {
                arg4 = 0;
            } else if (arg1 != 1) {
                arg4 = 1;
            }
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class73 var8 = (class73) field1027.method3207(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class46 var9 = method515(arg0);
        if (arg1 > 1 && var9.field1058 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1038[var11] && var9.field1038[var11] != 0) {
                    var10 = var9.field1058[var11];
                }
            }
            if (var10 != -1) {
                var9 = method515(var10);
            }
        }
        class99 var12 = var9.method890(1);
        if (var12 == null) {
            return null;
        }
        class73 var13 = null;
        if (var9.field1061 != -1) {
            var13 = method2749(var9.field1048, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1325;
        int var15 = Statics.field1326;
        int var16 = Statics.field1329;
        int[] var17 = new int[4];
        class74.method1615(var17);
        class73 var18 = new class73(36, 32);
        class74.method1547(var18.field1316, 36, 32);
        class74.method1573();
        class85.method1820();
        class85.method1823(16, 16);
        class85.field1474 = false;
        int var19 = var9.field1035;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1497[var9.field1036] * var19 >> 16;
        int var21 = class85.field1498[var9.field1036] * var19 >> 16;
        var12.method2024();
        var12.method2025(0, var9.field1055, var9.field1021, var9.field1036, var9.field1039, var9.field1040 + var12.field1365 / 2 + var20, var9.field1040 + var21);
        if (arg2 >= 1) {
            var18.method1520(1);
        }
        if (arg2 >= 2) {
            var18.method1520(16777215);
        }
        if (arg3 != 0) {
            var18.method1467(arg3);
        }
        class74.method1547(var18.field1316, 36, 32);
        if (var9.field1061 != -1) {
            var13.method1470(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1041 == 1) {
            Statics.field1592.method3544(method2448(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1027.method3209(var18, var6);
        }
        class74.method1547(var14, var15, var16);
        class74.method1552(var17);
        class85.method1820();
        class85.field1474 = true;
        return var18;
    }

    @ObfuscatedName("dn.p(II)Ljava/lang/String;")
    public static final String method2448(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class145.field2402 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class145.field2339 + "</col>";
        }
    }

    @ObfuscatedName("ab.v(ZI)Z")
    public final boolean method892(boolean arg0) {
        int var2 = this.field1046;
        int var3 = this.field1047;
        int var4 = this.field1052;
        if (arg0) {
            var2 = this.field1037;
            var3 = this.field1050;
            var4 = this.field1053;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1023.method2807(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1023.method2807(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1023.method2807(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ab.w(ZB)Lcy;")
    public final class94 method893(boolean arg0) {
        int var2 = this.field1046;
        int var3 = this.field1047;
        int var4 = this.field1052;
        if (arg0) {
            var2 = this.field1037;
            var3 = this.field1050;
            var4 = this.field1053;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var5 = class94.method1925(Statics.field1023, var2, 0);
        if (var3 != -1) {
            class94 var6 = class94.method1925(Statics.field1023, var3, 0);
            if (var4 == -1) {
                class94[] var9 = new class94[] { var5, var6 };
                var5 = new class94(var9, 2);
            } else {
                class94 var7 = class94.method1925(Statics.field1023, var4, 0);
                class94[] var8 = new class94[] { var5, var6, var7 };
                var5 = new class94(var8, 3);
            }
        }
        if (!arg0 && this.field1019 != 0) {
            var5.method1938(0, this.field1019, 0);
        }
        if (arg0 && this.field1051 != 0) {
            var5.method1938(0, this.field1051, 0);
        }
        if (this.field1031 != null) {
            for (int var10 = 0; var10 < this.field1031.length; var10++) {
                var5.method1939(this.field1031[var10], this.field1032[var10]);
            }
        }
        if (this.field1033 != null) {
            for (int var11 = 0; var11 < this.field1033.length; var11++) {
                var5.method1944(this.field1033[var11], this.field1034[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ab.t(ZS)Z")
    public final boolean method894(boolean arg0) {
        int var2 = this.field1059;
        int var3 = this.field1054;
        if (arg0) {
            var2 = this.field1056;
            var3 = this.field1057;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1023.method2807(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1023.method2807(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ab.s(ZI)Lcy;")
    public final class94 method895(boolean arg0) {
        int var2 = this.field1059;
        int var3 = this.field1054;
        if (arg0) {
            var2 = this.field1056;
            var3 = this.field1057;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var4 = class94.method1925(Statics.field1023, var2, 0);
        if (var3 != -1) {
            class94 var5 = class94.method1925(Statics.field1023, var3, 0);
            class94[] var6 = new class94[] { var4, var5 };
            var4 = new class94(var6, 2);
        }
        if (this.field1031 != null) {
            for (int var7 = 0; var7 < this.field1031.length; var7++) {
                var4.method1939(this.field1031[var7], this.field1032[var7]);
            }
        }
        if (this.field1033 != null) {
            for (int var8 = 0; var8 < this.field1033.length; var8++) {
                var4.method1944(this.field1033[var8], this.field1034[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("w.b(ZI)V")
    public static void method154(boolean arg0) {
        if (Statics.field623 != arg0) {
            field1070.method3223();
            field1049.method3223();
            field1027.method3223();
            Statics.field623 = arg0;
        }
    }
}
