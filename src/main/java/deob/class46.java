package deob;

@ObfuscatedName("af")
public class class46 extends class185 {

    @ObfuscatedName("af.i")
    public static class174 field1026 = new class174(64);

    @ObfuscatedName("af.u")
    public static class174 field1027 = new class174(50);

    @ObfuscatedName("af.l")
    public static class174 field1036 = new class174(100);

    @ObfuscatedName("af.q")
    public int field1029;

    @ObfuscatedName("af.b")
    public int field1065;

    @ObfuscatedName("af.w")
    public String field1031 = "null";

    @ObfuscatedName("af.g")
    public short[] field1032;

    @ObfuscatedName("af.s")
    public short[] field1067;

    @ObfuscatedName("af.c")
    public short[] field1022;

    @ObfuscatedName("af.r")
    public short[] field1035;

    @ObfuscatedName("af.f")
    public int field1021 = 2000;

    @ObfuscatedName("af.t")
    public int field1037 = 0;

    @ObfuscatedName("af.o")
    public int field1048 = 0;

    @ObfuscatedName("af.z")
    public int field1028 = 0;

    @ObfuscatedName("af.d")
    public int field1040 = 0;

    @ObfuscatedName("af.y")
    public int field1052 = 0;

    @ObfuscatedName("af.a")
    public int field1042 = 0;

    @ObfuscatedName("af.n")
    public int field1043 = 1;

    @ObfuscatedName("af.ae")
    public boolean field1044 = false;

    @ObfuscatedName("af.ay")
    public String[] field1045 = new String[] { null, null, class145.field2161, null, null };

    @ObfuscatedName("af.ac")
    public String[] field1046 = new String[] { null, null, null, null, class145.field2162 };

    @ObfuscatedName("af.ag")
    public int field1047 = -1;

    @ObfuscatedName("af.am")
    public int field1038 = -1;

    @ObfuscatedName("af.au")
    public int field1049 = 0;

    @ObfuscatedName("af.ai")
    public int field1050 = -1;

    @ObfuscatedName("af.ab")
    public int field1051 = -1;

    @ObfuscatedName("af.az")
    public int field1039 = 0;

    @ObfuscatedName("af.as")
    public int field1053 = -1;

    @ObfuscatedName("af.ah")
    public int field1033 = -1;

    @ObfuscatedName("af.aw")
    public int field1055 = -1;

    @ObfuscatedName("af.ar")
    public int field1056 = -1;

    @ObfuscatedName("af.at")
    public int field1057 = -1;

    @ObfuscatedName("af.ap")
    public int field1058 = -1;

    @ObfuscatedName("af.ak")
    public int[] field1059;

    @ObfuscatedName("af.aa")
    public int[] field1060;

    @ObfuscatedName("af.av")
    public int field1064 = -1;

    @ObfuscatedName("af.al")
    public int field1062 = -1;

    @ObfuscatedName("af.af")
    public int field1063 = 128;

    @ObfuscatedName("af.aj")
    public int field1054 = 128;

    @ObfuscatedName("af.ao")
    public int field1061 = 128;

    @ObfuscatedName("af.an")
    public int field1066 = 0;

    @ObfuscatedName("af.ad")
    public int field1041 = 0;

    @ObfuscatedName("af.aq")
    public int field1068 = 0;

    @ObfuscatedName("af.ax")
    public boolean field1069 = false;

    @ObfuscatedName("cu.x(II)Laf;")
    public static class46 method1975(int arg0) {
        class46 var1 = (class46) field1026.method3186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1023.method2751(10, arg0);
        class46 var3 = new class46();
        var3.field1029 = arg0;
        if (var2 != null) {
            var3.method867(new class108(var2));
        }
        var3.method866();
        if (var3.field1062 != -1) {
            var3.method869(method1975(var3.field1062), method1975(var3.field1064));
        }
        if (!Statics.field1025 && var3.field1044) {
            var3.field1031 = class145.field2366;
            var3.field1069 = false;
            var3.field1045 = null;
            var3.field1046 = null;
            var3.field1068 = 0;
        }
        field1026.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.v(I)V")
    public void method866() {
    }

    @ObfuscatedName("af.m(Ldm;I)V")
    public void method867(class108 arg0) {
        while (true) {
            int var2 = arg0.method2299();
            if (var2 == 0) {
                return;
            }
            this.method868(arg0, var2);
        }
    }

    @ObfuscatedName("af.e(Ldm;II)V")
    public void method868(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1065 = arg0.method2129();
        } else if (arg1 == 2) {
            this.field1031 = arg0.method2270();
        } else if (arg1 == 4) {
            this.field1021 = arg0.method2129();
        } else if (arg1 == 5) {
            this.field1037 = arg0.method2129();
        } else if (arg1 == 6) {
            this.field1048 = arg0.method2129();
        } else if (arg1 == 7) {
            this.field1040 = arg0.method2129();
            if (this.field1040 > 32767) {
                this.field1040 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1052 = arg0.method2129();
            if (this.field1052 > 32767) {
                this.field1052 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1042 = 1;
        } else if (arg1 == 12) {
            this.field1043 = arg0.method2132();
        } else if (arg1 == 16) {
            this.field1044 = true;
        } else if (arg1 == 23) {
            this.field1047 = arg0.method2129();
            this.field1049 = arg0.method2299();
        } else if (arg1 == 24) {
            this.field1038 = arg0.method2129();
        } else if (arg1 == 25) {
            this.field1050 = arg0.method2129();
            this.field1039 = arg0.method2299();
        } else if (arg1 == 26) {
            this.field1051 = arg0.method2129();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1045[arg1 - 30] = arg0.method2270();
            if (this.field1045[arg1 - 30].equalsIgnoreCase(class145.field2164)) {
                this.field1045[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1046[arg1 - 35] = arg0.method2270();
        } else if (arg1 == 40) {
            int var3 = arg0.method2299();
            this.field1032 = new short[var3];
            this.field1067 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1032[var4] = (short) arg0.method2129();
                this.field1067[var4] = (short) arg0.method2129();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2299();
            this.field1022 = new short[var5];
            this.field1035 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1022[var6] = (short) arg0.method2129();
                this.field1035[var6] = (short) arg0.method2129();
            }
        } else if (arg1 == 65) {
            this.field1069 = true;
        } else if (arg1 == 78) {
            this.field1053 = arg0.method2129();
        } else if (arg1 == 79) {
            this.field1033 = arg0.method2129();
        } else if (arg1 == 90) {
            this.field1055 = arg0.method2129();
        } else if (arg1 == 91) {
            this.field1057 = arg0.method2129();
        } else if (arg1 == 92) {
            this.field1056 = arg0.method2129();
        } else if (arg1 == 93) {
            this.field1058 = arg0.method2129();
        } else if (arg1 == 95) {
            this.field1028 = arg0.method2129();
        } else if (arg1 == 97) {
            this.field1064 = arg0.method2129();
        } else if (arg1 == 98) {
            this.field1062 = arg0.method2129();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1059 == null) {
                this.field1059 = new int[10];
                this.field1060 = new int[10];
            }
            this.field1059[arg1 - 100] = arg0.method2129();
            this.field1060[arg1 - 100] = arg0.method2129();
        } else if (arg1 == 110) {
            this.field1063 = arg0.method2129();
        } else if (arg1 == 111) {
            this.field1054 = arg0.method2129();
        } else if (arg1 == 112) {
            this.field1061 = arg0.method2129();
        } else if (arg1 == 113) {
            this.field1066 = arg0.method2128();
        } else if (arg1 == 114) {
            this.field1041 = arg0.method2128();
        } else if (arg1 == 115) {
            this.field1068 = arg0.method2299();
        }
    }

    @ObfuscatedName("af.h(Laf;Laf;I)V")
    public void method869(class46 arg0, class46 arg1) {
        this.field1065 = arg0.field1065;
        this.field1021 = arg0.field1021;
        this.field1037 = arg0.field1037;
        this.field1048 = arg0.field1048;
        this.field1028 = arg0.field1028;
        this.field1040 = arg0.field1040;
        this.field1052 = arg0.field1052;
        this.field1032 = arg0.field1032;
        this.field1067 = arg0.field1067;
        this.field1022 = arg0.field1022;
        this.field1035 = arg0.field1035;
        this.field1031 = arg1.field1031;
        this.field1044 = arg1.field1044;
        this.field1043 = arg1.field1043;
        this.field1042 = 1;
    }

    @ObfuscatedName("af.p(II)Lcs;")
    public final class94 method890(int arg0) {
        if (this.field1059 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1060[var3] && this.field1060[var3] != 0) {
                    var2 = this.field1059[var3];
                }
            }
            if (var2 != -1) {
                return method1975(var2).method890(1);
            }
        }
        class94 var4 = class94.method1892(Statics.field1034, this.field1065, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1063 != 128 || this.field1054 != 128 || this.field1061 != 128) {
            var4.method1961(this.field1063, this.field1054, this.field1061);
        }
        if (this.field1032 != null) {
            for (int var5 = 0; var5 < this.field1032.length; var5++) {
                var4.method1948(this.field1032[var5], this.field1067[var5]);
            }
        }
        if (this.field1022 != null) {
            for (int var6 = 0; var6 < this.field1022.length; var6++) {
                var4.method1906(this.field1022[var6], this.field1035[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("af.j(IB)Lck;")
    public final class99 method899(int arg0) {
        if (this.field1059 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1060[var3] && this.field1060[var3] != 0) {
                    var2 = this.field1059[var3];
                }
            }
            if (var2 != -1) {
                return method1975(var2).method899(1);
            }
        }
        class99 var4 = (class99) field1027.method3186((long) this.field1029);
        if (var4 != null) {
            return var4;
        }
        class94 var5 = class94.method1892(Statics.field1034, this.field1065, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1063 != 128 || this.field1054 != 128 || this.field1061 != 128) {
            var5.method1961(this.field1063, this.field1054, this.field1061);
        }
        if (this.field1032 != null) {
            for (int var6 = 0; var6 < this.field1032.length; var6++) {
                var5.method1948(this.field1032[var6], this.field1067[var6]);
            }
        }
        if (this.field1022 != null) {
            for (int var7 = 0; var7 < this.field1022.length; var7++) {
                var5.method1906(this.field1022[var7], this.field1035[var7]);
            }
        }
        class99 var8 = var5.method1941(this.field1066 + 64, this.field1041 * 5 + 768, -50, -10, -50);
        var8.field1724 = true;
        field1027.method3183(var8, (long) this.field1029);
        return var8;
    }

    @ObfuscatedName("af.i(IB)Laf;")
    public class46 method876(int arg0) {
        if (this.field1059 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1060[var3] && this.field1060[var3] != 0) {
                    var2 = this.field1059[var3];
                }
            }
            if (var2 != -1) {
                return method1975(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("a.u(IIIIIZB)Lbu;")
    public static final class73 method534(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class73 var8 = (class73) field1036.method3186(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class46 var9 = method1975(arg0);
        if (arg1 > 1 && var9.field1059 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1060[var11] && var9.field1060[var11] != 0) {
                    var10 = var9.field1059[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1975(var10);
            }
        }
        class99 var12 = var9.method899(1);
        if (var12 == null) {
            return null;
        }
        class73 var13 = null;
        if (var9.field1062 != -1) {
            var13 = method534(var9.field1064, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1318;
        int var15 = Statics.field1315;
        int var16 = Statics.field1314;
        int[] var17 = new int[4];
        class74.method1556(var17);
        class73 var18 = new class73(36, 32);
        class74.method1536(var18.field1307, 36, 32);
        class74.method1542();
        class85.method1796();
        class85.method1799(16, 16);
        class85.field1467 = false;
        int var19 = var9.field1021;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1482[var9.field1037] * var19 >> 16;
        int var21 = class85.field1474[var9.field1037] * var19 >> 16;
        var12.method1982();
        var12.method1992(0, var9.field1048, var9.field1028, var9.field1037, var9.field1040, var9.field1052 + var12.field1354 / 2 + var20, var9.field1052 + var21);
        if (arg2 >= 1) {
            var18.method1459(1);
        }
        if (arg2 >= 2) {
            var18.method1459(16777215);
        }
        if (arg3 != 0) {
            var18.method1477(arg3);
        }
        class74.method1536(var18.field1307, 36, 32);
        if (var9.field1062 != -1) {
            var13.method1467(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1042 == 1) {
            Statics.field988.method3477(method470(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1036.method3183(var18, var6);
        }
        class74.method1536(var14, var15, var16);
        class74.method1587(var17);
        class85.method1796();
        class85.field1467 = true;
        return var18;
    }

    @ObfuscatedName("r.l(IB)Ljava/lang/String;")
    public static final String method470(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class145.field2324 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class145.field2322 + "</col>";
        }
    }

    @ObfuscatedName("af.k(ZB)Z")
    public final boolean method873(boolean arg0) {
        int var2 = this.field1047;
        int var3 = this.field1038;
        int var4 = this.field1053;
        if (arg0) {
            var2 = this.field1050;
            var3 = this.field1051;
            var4 = this.field1033;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1034.method2728(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1034.method2728(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1034.method2728(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("af.q(ZI)Lcs;")
    public final class94 method870(boolean arg0) {
        int var2 = this.field1047;
        int var3 = this.field1038;
        int var4 = this.field1053;
        if (arg0) {
            var2 = this.field1050;
            var3 = this.field1051;
            var4 = this.field1033;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var5 = class94.method1892(Statics.field1034, var2, 0);
        if (var3 != -1) {
            class94 var6 = class94.method1892(Statics.field1034, var3, 0);
            if (var4 == -1) {
                class94[] var9 = new class94[] { var5, var6 };
                var5 = new class94(var9, 2);
            } else {
                class94 var7 = class94.method1892(Statics.field1034, var4, 0);
                class94[] var8 = new class94[] { var5, var6, var7 };
                var5 = new class94(var8, 3);
            }
        }
        if (!arg0 && this.field1049 != 0) {
            var5.method1904(0, this.field1049, 0);
        }
        if (arg0 && this.field1039 != 0) {
            var5.method1904(0, this.field1039, 0);
        }
        if (this.field1032 != null) {
            for (int var10 = 0; var10 < this.field1032.length; var10++) {
                var5.method1948(this.field1032[var10], this.field1067[var10]);
            }
        }
        if (this.field1022 != null) {
            for (int var11 = 0; var11 < this.field1022.length; var11++) {
                var5.method1906(this.field1022[var11], this.field1035[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("af.b(ZI)Z")
    public final boolean method883(boolean arg0) {
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
        if (!Statics.field1034.method2728(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1034.method2728(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("af.w(ZB)Lcs;")
    public final class94 method871(boolean arg0) {
        int var2 = this.field1055;
        int var3 = this.field1056;
        if (arg0) {
            var2 = this.field1057;
            var3 = this.field1058;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var4 = class94.method1892(Statics.field1034, var2, 0);
        if (var3 != -1) {
            class94 var5 = class94.method1892(Statics.field1034, var3, 0);
            class94[] var6 = new class94[] { var4, var5 };
            var4 = new class94(var6, 2);
        }
        if (this.field1032 != null) {
            for (int var7 = 0; var7 < this.field1032.length; var7++) {
                var4.method1948(this.field1032[var7], this.field1067[var7]);
            }
        }
        if (this.field1022 != null) {
            for (int var8 = 0; var8 < this.field1022.length; var8++) {
                var4.method1906(this.field1022[var8], this.field1035[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cd.g(ZI)V")
    public static void method2071(boolean arg0) {
        if (Statics.field1025 != arg0) {
            field1026.method3181();
            field1027.method3181();
            field1036.method3181();
            Statics.field1025 = arg0;
        }
    }
}
