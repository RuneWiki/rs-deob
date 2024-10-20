package deob;

@ObfuscatedName("ab")
public class class46 extends class185 {

    @ObfuscatedName("ab.l")
    public static class174 field1017 = new class174(64);

    @ObfuscatedName("ab.n")
    public static class174 field1018 = new class174(50);

    @ObfuscatedName("ab.d")
    public static class174 field1019 = new class174(100);

    @ObfuscatedName("ab.y")
    public int field1020;

    @ObfuscatedName("ab.p")
    public int field1021;

    @ObfuscatedName("ab.i")
    public String field1022 = "null";

    @ObfuscatedName("ab.s")
    public short[] field1023;

    @ObfuscatedName("ab.f")
    public short[] field1024;

    @ObfuscatedName("ab.u")
    public short[] field1025;

    @ObfuscatedName("ab.v")
    public short[] field1064;

    @ObfuscatedName("ab.r")
    public int field1027 = 2000;

    @ObfuscatedName("ab.q")
    public int field1028 = 0;

    @ObfuscatedName("ab.x")
    public int field1031 = 0;

    @ObfuscatedName("ab.t")
    public int field1030 = 0;

    @ObfuscatedName("ab.e")
    public int field1062 = 0;

    @ObfuscatedName("ab.m")
    public int field1032 = 0;

    @ObfuscatedName("ab.o")
    public int field1026 = 0;

    @ObfuscatedName("ab.a")
    public int field1061 = 1;

    @ObfuscatedName("ab.am")
    public boolean field1035 = false;

    @ObfuscatedName("ab.ac")
    public String[] field1036 = new String[] { null, null, class145.field2149, null, null };

    @ObfuscatedName("ab.ap")
    public String[] field1029 = new String[] { null, null, null, null, class145.field2150 };

    @ObfuscatedName("ab.aq")
    public int field1060 = -1;

    @ObfuscatedName("ab.az")
    public int field1039 = -1;

    @ObfuscatedName("ab.ae")
    public int field1040 = 0;

    @ObfuscatedName("ab.at")
    public int field1052 = -1;

    @ObfuscatedName("ab.as")
    public int field1034 = -1;

    @ObfuscatedName("ab.aj")
    public int field1043 = 0;

    @ObfuscatedName("ab.an")
    public int field1050 = -1;

    @ObfuscatedName("ab.al")
    public int field1045 = -1;

    @ObfuscatedName("ab.ag")
    public int field1033 = -1;

    @ObfuscatedName("ab.ah")
    public int field1054 = -1;

    @ObfuscatedName("ab.ar")
    public int field1048 = -1;

    @ObfuscatedName("ab.aa")
    public int field1049 = -1;

    @ObfuscatedName("ab.ax")
    public int[] field1042;

    @ObfuscatedName("ab.ay")
    public int[] field1051;

    @ObfuscatedName("ab.ao")
    public int field1044 = -1;

    @ObfuscatedName("ab.ad")
    public int field1053 = -1;

    @ObfuscatedName("ab.ab")
    public int field1046 = 128;

    @ObfuscatedName("ab.af")
    public int field1055 = 128;

    @ObfuscatedName("ab.aw")
    public int field1056 = 128;

    @ObfuscatedName("ab.ai")
    public int field1057 = 0;

    @ObfuscatedName("ab.ak")
    public int field1058 = 0;

    @ObfuscatedName("ab.au")
    public int field1059 = 0;

    @ObfuscatedName("ab.av")
    public boolean field1037 = false;

    @ObfuscatedName("l.g(II)Lab;")
    public static class46 method86(int arg0) {
        class46 var1 = (class46) field1017.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1041.method2660(10, arg0);
        class46 var3 = new class46();
        var3.field1020 = arg0;
        if (var2 != null) {
            var3.method853(new class108(var2));
        }
        var3.method821();
        if (var3.field1053 != -1) {
            var3.method813(method86(var3.field1053), method86(var3.field1044));
        }
        if (!Statics.field144 && var3.field1035) {
            var3.field1022 = class145.field2180;
            var3.field1037 = false;
            var3.field1036 = null;
            var3.field1029 = null;
            var3.field1059 = 0;
        }
        field1017.method3099(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.j(I)V")
    public void method821() {
    }

    @ObfuscatedName("ab.z(Ldf;I)V")
    public void method853(class108 arg0) {
        while (true) {
            int var2 = arg0.method2083();
            if (var2 == 0) {
                return;
            }
            this.method812(arg0, var2);
        }
    }

    @ObfuscatedName("ab.b(Ldf;II)V")
    public void method812(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1021 = arg0.method2263();
        } else if (arg1 == 2) {
            this.field1022 = arg0.method2091();
        } else if (arg1 == 4) {
            this.field1027 = arg0.method2263();
        } else if (arg1 == 5) {
            this.field1028 = arg0.method2263();
        } else if (arg1 == 6) {
            this.field1031 = arg0.method2263();
        } else if (arg1 == 7) {
            this.field1062 = arg0.method2263();
            if (this.field1062 > 32767) {
                this.field1062 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1032 = arg0.method2263();
            if (this.field1032 > 32767) {
                this.field1032 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1026 = 1;
        } else if (arg1 == 12) {
            this.field1061 = arg0.method2117();
        } else if (arg1 == 16) {
            this.field1035 = true;
        } else if (arg1 == 23) {
            this.field1060 = arg0.method2263();
            this.field1040 = arg0.method2083();
        } else if (arg1 == 24) {
            this.field1039 = arg0.method2263();
        } else if (arg1 == 25) {
            this.field1052 = arg0.method2263();
            this.field1043 = arg0.method2083();
        } else if (arg1 == 26) {
            this.field1034 = arg0.method2263();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1036[arg1 - 30] = arg0.method2091();
            if (this.field1036[arg1 - 30].equalsIgnoreCase(class145.field2151)) {
                this.field1036[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1029[arg1 - 35] = arg0.method2091();
        } else if (arg1 == 40) {
            int var3 = arg0.method2083();
            this.field1023 = new short[var3];
            this.field1024 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1023[var4] = (short) arg0.method2263();
                this.field1024[var4] = (short) arg0.method2263();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2083();
            this.field1025 = new short[var5];
            this.field1064 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1025[var6] = (short) arg0.method2263();
                this.field1064[var6] = (short) arg0.method2263();
            }
        } else if (arg1 == 65) {
            this.field1037 = true;
        } else if (arg1 == 78) {
            this.field1050 = arg0.method2263();
        } else if (arg1 == 79) {
            this.field1045 = arg0.method2263();
        } else if (arg1 == 90) {
            this.field1033 = arg0.method2263();
        } else if (arg1 == 91) {
            this.field1048 = arg0.method2263();
        } else if (arg1 == 92) {
            this.field1054 = arg0.method2263();
        } else if (arg1 == 93) {
            this.field1049 = arg0.method2263();
        } else if (arg1 == 95) {
            this.field1030 = arg0.method2263();
        } else if (arg1 == 97) {
            this.field1044 = arg0.method2263();
        } else if (arg1 == 98) {
            this.field1053 = arg0.method2263();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1042 == null) {
                this.field1042 = new int[10];
                this.field1051 = new int[10];
            }
            this.field1042[arg1 - 100] = arg0.method2263();
            this.field1051[arg1 - 100] = arg0.method2263();
        } else if (arg1 == 110) {
            this.field1046 = arg0.method2263();
        } else if (arg1 == 111) {
            this.field1055 = arg0.method2263();
        } else if (arg1 == 112) {
            this.field1056 = arg0.method2263();
        } else if (arg1 == 113) {
            this.field1057 = arg0.method2173();
        } else if (arg1 == 114) {
            this.field1058 = arg0.method2173() * 5;
        } else if (arg1 == 115) {
            this.field1059 = arg0.method2083();
        }
    }

    @ObfuscatedName("ab.k(Lab;Lab;I)V")
    public void method813(class46 arg0, class46 arg1) {
        this.field1021 = arg0.field1021;
        this.field1027 = arg0.field1027;
        this.field1028 = arg0.field1028;
        this.field1031 = arg0.field1031;
        this.field1030 = arg0.field1030;
        this.field1062 = arg0.field1062;
        this.field1032 = arg0.field1032;
        this.field1023 = arg0.field1023;
        this.field1024 = arg0.field1024;
        this.field1025 = arg0.field1025;
        this.field1064 = arg0.field1064;
        this.field1022 = arg1.field1022;
        this.field1035 = arg1.field1035;
        this.field1061 = arg1.field1061;
        this.field1026 = 1;
    }

    @ObfuscatedName("ab.c(IB)Lci;")
    public final class94 method837(int arg0) {
        if (this.field1042 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1051[var3] && this.field1051[var3] != 0) {
                    var2 = this.field1042[var3];
                }
            }
            if (var2 != -1) {
                return method86(var2).method837(1);
            }
        }
        class94 var4 = class94.method1848(Statics.field2888, this.field1021, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1046 != 128 || this.field1055 != 128 || this.field1056 != 128) {
            var4.method1863(this.field1046, this.field1055, this.field1056);
        }
        if (this.field1023 != null) {
            for (int var5 = 0; var5 < this.field1023.length; var5++) {
                var4.method1847(this.field1023[var5], this.field1024[var5]);
            }
        }
        if (this.field1025 != null) {
            for (int var6 = 0; var6 < this.field1025.length; var6++) {
                var4.method1861(this.field1025[var6], this.field1064[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ab.w(II)Lcx;")
    public final class99 method815(int arg0) {
        if (this.field1042 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1051[var3] && this.field1051[var3] != 0) {
                    var2 = this.field1042[var3];
                }
            }
            if (var2 != -1) {
                return method86(var2).method815(1);
            }
        }
        class99 var4 = (class99) field1018.method3097((long) this.field1020);
        if (var4 != null) {
            return var4;
        }
        class94 var5 = class94.method1848(Statics.field2888, this.field1021, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1046 != 128 || this.field1055 != 128 || this.field1056 != 128) {
            var5.method1863(this.field1046, this.field1055, this.field1056);
        }
        if (this.field1023 != null) {
            for (int var6 = 0; var6 < this.field1023.length; var6++) {
                var5.method1847(this.field1023[var6], this.field1024[var6]);
            }
        }
        if (this.field1025 != null) {
            for (int var7 = 0; var7 < this.field1025.length; var7++) {
                var5.method1861(this.field1025[var7], this.field1064[var7]);
            }
        }
        class99 var8 = var5.method1917(this.field1057 + 64, this.field1058 + 768, -50, -10, -50);
        var8.field1704 = true;
        field1018.method3099(var8, (long) this.field1020);
        return var8;
    }

    @ObfuscatedName("ab.l(II)Lab;")
    public class46 method816(int arg0) {
        if (this.field1042 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1051[var3] && this.field1051[var3] != 0) {
                    var2 = this.field1042[var3];
                }
            }
            if (var2 != -1) {
                return method86(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("y.n(IIIIIZI)Lbw;")
    public static final class73 method131(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class73 var8 = (class73) field1019.method3097(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class46 var9 = method86(arg0);
        if (arg1 > 1 && var9.field1042 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1051[var11] && var9.field1051[var11] != 0) {
                    var10 = var9.field1042[var11];
                }
            }
            if (var10 != -1) {
                var9 = method86(var10);
            }
        }
        class99 var12 = var9.method815(1);
        if (var12 == null) {
            return null;
        }
        class73 var13 = null;
        if (var9.field1053 != -1) {
            var13 = method131(var9.field1044, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1320;
        int var15 = Statics.field1314;
        int var16 = Statics.field1316;
        int[] var17 = new int[4];
        class74.method1461(var17);
        class73 var18 = new class73(36, 32);
        class74.method1458(var18.field1304, 36, 32);
        class74.method1464();
        class85.method1748();
        class85.method1751(16, 16);
        class85.field1456 = false;
        int var19 = var9.field1027;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1479[var9.field1028] * var19 >> 16;
        int var21 = class85.field1465[var9.field1028] * var19 >> 16;
        var12.method1940();
        var12.method1951(0, var9.field1031, var9.field1030, var9.field1028, var9.field1062, var9.field1032 + var12.field1352 / 2 + var20, var9.field1032 + var21);
        if (arg2 >= 1) {
            var18.method1367(1);
        }
        if (arg2 >= 2) {
            var18.method1367(16777215);
        }
        if (arg3 != 0) {
            var18.method1368(arg3);
        }
        class74.method1458(var18.field1304, 36, 32);
        if (var9.field1053 != -1) {
            var13.method1364(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1026 == 1) {
            class205 var22 = Statics.field1873;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class145.field2388 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class145.field2359 + "</col>";
            }
            var22.method3361(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1019.method3099(var18, var6);
        }
        class74.method1458(var14, var15, var16);
        class74.method1463(var17);
        class85.method1748();
        class85.field1456 = true;
        return var18;
    }

    @ObfuscatedName("ab.d(ZI)Z")
    public final boolean method824(boolean arg0) {
        int var2 = this.field1060;
        int var3 = this.field1039;
        int var4 = this.field1050;
        if (arg0) {
            var2 = this.field1052;
            var3 = this.field1034;
            var4 = this.field1045;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2888.method2712(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2888.method2712(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2888.method2712(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ab.h(ZI)Lci;")
    public final class94 method810(boolean arg0) {
        int var2 = this.field1060;
        int var3 = this.field1039;
        int var4 = this.field1050;
        if (arg0) {
            var2 = this.field1052;
            var3 = this.field1034;
            var4 = this.field1045;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var5 = class94.method1848(Statics.field2888, var2, 0);
        if (var3 != -1) {
            class94 var6 = class94.method1848(Statics.field2888, var3, 0);
            if (var4 == -1) {
                class94[] var9 = new class94[] { var5, var6 };
                var5 = new class94(var9, 2);
            } else {
                class94 var7 = class94.method1848(Statics.field2888, var4, 0);
                class94[] var8 = new class94[] { var5, var6, var7 };
                var5 = new class94(var8, 3);
            }
        }
        if (!arg0 && this.field1040 != 0) {
            var5.method1868(0, this.field1040, 0);
        }
        if (arg0 && this.field1043 != 0) {
            var5.method1868(0, this.field1043, 0);
        }
        if (this.field1023 != null) {
            for (int var10 = 0; var10 < this.field1023.length; var10++) {
                var5.method1847(this.field1023[var10], this.field1024[var10]);
            }
        }
        if (this.field1025 != null) {
            for (int var11 = 0; var11 < this.field1025.length; var11++) {
                var5.method1861(this.field1025[var11], this.field1064[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ab.y(ZI)Z")
    public final boolean method819(boolean arg0) {
        int var2 = this.field1033;
        int var3 = this.field1054;
        if (arg0) {
            var2 = this.field1048;
            var3 = this.field1049;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2888.method2712(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2888.method2712(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ab.p(ZI)Lci;")
    public final class94 method820(boolean arg0) {
        int var2 = this.field1033;
        int var3 = this.field1054;
        if (arg0) {
            var2 = this.field1048;
            var3 = this.field1049;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var4 = class94.method1848(Statics.field2888, var2, 0);
        if (var3 != -1) {
            class94 var5 = class94.method1848(Statics.field2888, var3, 0);
            class94[] var6 = new class94[] { var4, var5 };
            var4 = new class94(var6, 2);
        }
        if (this.field1023 != null) {
            for (int var7 = 0; var7 < this.field1023.length; var7++) {
                var4.method1847(this.field1023[var7], this.field1024[var7]);
            }
        }
        if (this.field1025 != null) {
            for (int var8 = 0; var8 < this.field1025.length; var8++) {
                var4.method1861(this.field1025[var8], this.field1064[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("a.i(I)V")
    public static void method510() {
        field1017.method3100();
        field1018.method3100();
        field1019.method3100();
    }
}
