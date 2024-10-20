package deob;

@ObfuscatedName("af")
public class class40 extends class174 {

    @ObfuscatedName("af.d")
    public static class170 field1018 = new class170(64);

    @ObfuscatedName("af.b")
    public static class170 field1041 = new class170(50);

    @ObfuscatedName("af.i")
    public static class170 field1026 = new class170(100);

    @ObfuscatedName("af.y")
    public int field1011;

    @ObfuscatedName("af.u")
    public int field1006;

    @ObfuscatedName("af.z")
    public String field1036 = "null";

    @ObfuscatedName("af.j")
    public short[] field1014;

    @ObfuscatedName("af.h")
    public short[] field1015;

    @ObfuscatedName("af.x")
    public short[] field1023;

    @ObfuscatedName("af.q")
    public short[] field1017;

    @ObfuscatedName("af.w")
    public int field1040 = 2000;

    @ObfuscatedName("af.k")
    public int field1019 = 0;

    @ObfuscatedName("af.o")
    public int field1020 = 0;

    @ObfuscatedName("af.f")
    public int field1021 = 0;

    @ObfuscatedName("af.r")
    public int field1022 = 0;

    @ObfuscatedName("af.s")
    public int field1035 = 0;

    @ObfuscatedName("af.g")
    public int field1024 = 0;

    @ObfuscatedName("af.m")
    public int field1025 = 1;

    @ObfuscatedName("af.a")
    public boolean field1009 = false;

    @ObfuscatedName("af.n")
    public String[] field1027 = new String[] { null, null, class134.field2173, null, null };

    @ObfuscatedName("af.v")
    public String[] field1028 = new String[] { null, null, null, null, class134.field2325 };

    @ObfuscatedName("af.e")
    public int field1051 = -1;

    @ObfuscatedName("af.ar")
    public int field1030 = -1;

    @ObfuscatedName("af.ak")
    public int field1031 = 0;

    @ObfuscatedName("af.ap")
    public int field1032 = -1;

    @ObfuscatedName("af.aa")
    public int field1033 = -1;

    @ObfuscatedName("af.av")
    public int field1034 = 0;

    @ObfuscatedName("af.aq")
    public int field1013 = -1;

    @ObfuscatedName("af.an")
    public int field1008 = -1;

    @ObfuscatedName("af.al")
    public int field1037 = -1;

    @ObfuscatedName("af.ax")
    public int field1038 = -1;

    @ObfuscatedName("af.as")
    public int field1039 = -1;

    @ObfuscatedName("af.ah")
    public int field1045 = -1;

    @ObfuscatedName("af.ae")
    public int[] field1046;

    @ObfuscatedName("af.ac")
    public int[] field1042;

    @ObfuscatedName("af.af")
    public int field1043 = -1;

    @ObfuscatedName("af.aj")
    public int field1044 = -1;

    @ObfuscatedName("af.ao")
    public int field1047 = 128;

    @ObfuscatedName("af.au")
    public int field1052 = 128;

    @ObfuscatedName("af.at")
    public int field1055 = 128;

    @ObfuscatedName("af.az")
    public int field1048 = 0;

    @ObfuscatedName("af.ag")
    public int field1010 = 0;

    @ObfuscatedName("af.am")
    public int field1050 = 0;

    @ObfuscatedName("z.t(IS)Laf;")
    public static class40 method119(int arg0) {
        class40 var1 = (class40) field1018.method3260((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1946.method2987(10, arg0);
        class40 var3 = new class40();
        var3.field1011 = arg0;
        if (var2 != null) {
            var3.method875(new class127(var2));
        }
        var3.method865();
        if (var3.field1044 != -1) {
            var3.method892(method119(var3.field1044), method119(var3.field1043));
        }
        if (!Statics.field1007 && var3.field1009) {
            var3.field1036 = class134.field2245;
            var3.field1027 = null;
            var3.field1028 = null;
            var3.field1050 = 0;
        }
        field1018.method3261(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.l(B)V")
    public void method865() {
    }

    @ObfuscatedName("af.c(Ldo;I)V")
    public void method875(class127 arg0) {
        while (true) {
            int var2 = arg0.method2438();
            if (var2 == 0) {
                return;
            }
            this.method868(arg0, var2);
        }
    }

    @ObfuscatedName("af.d(Ldo;II)V")
    public void method868(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1006 = arg0.method2440();
        } else if (arg1 == 2) {
            this.field1036 = arg0.method2627();
        } else if (arg1 == 4) {
            this.field1040 = arg0.method2440();
        } else if (arg1 == 5) {
            this.field1019 = arg0.method2440();
        } else if (arg1 == 6) {
            this.field1020 = arg0.method2440();
        } else if (arg1 == 7) {
            this.field1022 = arg0.method2440();
            if (this.field1022 > 32767) {
                this.field1022 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1035 = arg0.method2440();
            if (this.field1035 > 32767) {
                this.field1035 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1024 = 1;
        } else if (arg1 == 12) {
            this.field1025 = arg0.method2448();
        } else if (arg1 == 16) {
            this.field1009 = true;
        } else if (arg1 == 23) {
            this.field1051 = arg0.method2440();
            this.field1031 = arg0.method2438();
        } else if (arg1 == 24) {
            this.field1030 = arg0.method2440();
        } else if (arg1 == 25) {
            this.field1032 = arg0.method2440();
            this.field1034 = arg0.method2438();
        } else if (arg1 == 26) {
            this.field1033 = arg0.method2440();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1027[arg1 - 30] = arg0.method2627();
            if (this.field1027[arg1 - 30].equalsIgnoreCase(class134.field2135)) {
                this.field1027[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1028[arg1 - 35] = arg0.method2627();
        } else if (arg1 == 40) {
            int var3 = arg0.method2438();
            this.field1014 = new short[var3];
            this.field1015 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1014[var4] = (short) arg0.method2440();
                this.field1015[var4] = (short) arg0.method2440();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2438();
            this.field1023 = new short[var5];
            this.field1017 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1023[var6] = (short) arg0.method2440();
                this.field1017[var6] = (short) arg0.method2440();
            }
        } else if (arg1 == 78) {
            this.field1013 = arg0.method2440();
        } else if (arg1 == 79) {
            this.field1008 = arg0.method2440();
        } else if (arg1 == 90) {
            this.field1037 = arg0.method2440();
        } else if (arg1 == 91) {
            this.field1039 = arg0.method2440();
        } else if (arg1 == 92) {
            this.field1038 = arg0.method2440();
        } else if (arg1 == 93) {
            this.field1045 = arg0.method2440();
        } else if (arg1 == 95) {
            this.field1021 = arg0.method2440();
        } else if (arg1 == 97) {
            this.field1043 = arg0.method2440();
        } else if (arg1 == 98) {
            this.field1044 = arg0.method2440();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1046 == null) {
                this.field1046 = new int[10];
                this.field1042 = new int[10];
            }
            this.field1046[arg1 - 100] = arg0.method2440();
            this.field1042[arg1 - 100] = arg0.method2440();
        } else if (arg1 == 110) {
            this.field1047 = arg0.method2440();
        } else if (arg1 == 111) {
            this.field1052 = arg0.method2440();
        } else if (arg1 == 112) {
            this.field1055 = arg0.method2440();
        } else if (arg1 == 113) {
            this.field1048 = arg0.method2629();
        } else if (arg1 == 114) {
            this.field1010 = arg0.method2629();
        } else if (arg1 == 115) {
            this.field1050 = arg0.method2438();
        }
    }

    @ObfuscatedName("af.b(Laf;Laf;I)V")
    public void method892(class40 arg0, class40 arg1) {
        this.field1006 = arg0.field1006;
        this.field1040 = arg0.field1040;
        this.field1019 = arg0.field1019;
        this.field1020 = arg0.field1020;
        this.field1021 = arg0.field1021;
        this.field1022 = arg0.field1022;
        this.field1035 = arg0.field1035;
        this.field1014 = arg0.field1014;
        this.field1015 = arg0.field1015;
        this.field1023 = arg0.field1023;
        this.field1017 = arg0.field1017;
        this.field1036 = arg1.field1036;
        this.field1009 = arg1.field1009;
        this.field1025 = arg1.field1025;
        this.field1024 = 1;
    }

    @ObfuscatedName("af.i(II)Lcc;")
    public final class101 method869(int arg0) {
        if (this.field1046 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1042[var3] && this.field1042[var3] != 0) {
                    var2 = this.field1046[var3];
                }
            }
            if (var2 != -1) {
                return method119(var2).method869(1);
            }
        }
        class101 var4 = class101.method2086(Statics.field1012, this.field1006, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1047 != 128 || this.field1052 != 128 || this.field1055 != 128) {
            var4.method2066(this.field1047, this.field1052, this.field1055);
        }
        if (this.field1014 != null) {
            for (int var5 = 0; var5 < this.field1014.length; var5++) {
                var4.method2063(this.field1014[var5], this.field1015[var5]);
            }
        }
        if (this.field1023 != null) {
            for (int var6 = 0; var6 < this.field1023.length; var6++) {
                var4.method2064(this.field1023[var6], this.field1017[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("af.p(IB)Ldk;")
    public final class112 method886(int arg0) {
        if (this.field1046 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1042[var3] && this.field1042[var3] != 0) {
                    var2 = this.field1046[var3];
                }
            }
            if (var2 != -1) {
                return method119(var2).method886(1);
            }
        }
        class112 var4 = (class112) field1041.method3260((long) this.field1011);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2086(Statics.field1012, this.field1006, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1047 != 128 || this.field1052 != 128 || this.field1055 != 128) {
            var5.method2066(this.field1047, this.field1052, this.field1055);
        }
        if (this.field1014 != null) {
            for (int var6 = 0; var6 < this.field1014.length; var6++) {
                var5.method2063(this.field1014[var6], this.field1015[var6]);
            }
        }
        if (this.field1023 != null) {
            for (int var7 = 0; var7 < this.field1023.length; var7++) {
                var5.method2064(this.field1023[var7], this.field1017[var7]);
            }
        }
        class112 var8 = var5.method2125(this.field1048 + 64, this.field1010 * 5 + 768, -50, -10, -50);
        var8.field1878 = true;
        field1041.method3261(var8, (long) this.field1011);
        return var8;
    }

    @ObfuscatedName("af.y(IB)Laf;")
    public class40 method871(int arg0) {
        if (this.field1046 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1042[var3] && this.field1042[var3] != 0) {
                    var2 = this.field1046[var3];
                }
            }
            if (var2 != -1) {
                return method119(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("c.u(IIIIZI)Lce;")
    public static final class86 method32(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field1026.method3260(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method119(arg0);
        if (arg1 > 1 && var8.field1046 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1042[var10] && var8.field1042[var10] != 0) {
                    var9 = var8.field1046[var10];
                }
            }
            if (var9 != -1) {
                var8 = method119(var9);
            }
        }
        class112 var11 = var8.method886(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1044 != -1) {
            var12 = method32(var8.field1043, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1530;
        int var14 = Statics.field1524;
        int var15 = Statics.field1526;
        int[] var16 = new int[4];
        class89.method1796(var16);
        class86 var17 = new class86(36, 32);
        class89.method1860(var17.field1504, 36, 32);
        class89.method1798();
        class104.method2142();
        class104.method2141(16, 16);
        class104.field1794 = false;
        int var18 = var8.field1040;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1814[var8.field1019] * var18 >> 16;
        int var20 = class104.field1815[var8.field1019] * var18 >> 16;
        var11.method2238();
        var11.method2250(0, var8.field1020, var8.field1021, var8.field1019, var8.field1022, var8.field1035 + var11.field1588 / 2 + var19, var8.field1035 + var20);
        if (arg2 >= 1) {
            var17.method1692(1);
        }
        if (arg2 >= 2) {
            var17.method1692(16777215);
        }
        if (arg3 != 0) {
            var17.method1685(arg3);
        }
        class89.method1860(var17.field1504, 36, 32);
        if (var8.field1044 != -1) {
            var12.method1696(0, 0);
        }
        if (!arg4 && (var8.field1024 == 1 || arg1 != 1) && arg1 != -1) {
            class183 var21 = Statics.field762;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class134.field2253 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class134.field2251 + "</col>";
            }
            var21.method3442(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1026.method3261(var17, var5);
        }
        class89.method1860(var13, var14, var15);
        class89.method1797(var16);
        class104.method2142();
        class104.field1794 = true;
        return var17;
    }

    @ObfuscatedName("af.z(ZI)Z")
    public final boolean method872(boolean arg0) {
        int var2 = this.field1051;
        int var3 = this.field1030;
        int var4 = this.field1013;
        if (arg0) {
            var2 = this.field1032;
            var3 = this.field1033;
            var4 = this.field1008;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1012.method2989(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1012.method2989(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1012.method2989(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("af.j(ZB)Lcc;")
    public final class101 method873(boolean arg0) {
        int var2 = this.field1051;
        int var3 = this.field1030;
        int var4 = this.field1013;
        if (arg0) {
            var2 = this.field1032;
            var3 = this.field1033;
            var4 = this.field1008;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2086(Statics.field1012, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2086(Statics.field1012, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2086(Statics.field1012, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1031 != 0) {
            var5.method2123(0, this.field1031, 0);
        }
        if (arg0 && this.field1034 != 0) {
            var5.method2123(0, this.field1034, 0);
        }
        if (this.field1014 != null) {
            for (int var10 = 0; var10 < this.field1014.length; var10++) {
                var5.method2063(this.field1014[var10], this.field1015[var10]);
            }
        }
        if (this.field1023 != null) {
            for (int var11 = 0; var11 < this.field1023.length; var11++) {
                var5.method2064(this.field1023[var11], this.field1017[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("af.h(ZB)Z")
    public final boolean method900(boolean arg0) {
        int var2 = this.field1037;
        int var3 = this.field1038;
        if (arg0) {
            var2 = this.field1039;
            var3 = this.field1045;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1012.method2989(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1012.method2989(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("af.x(ZI)Lcc;")
    public final class101 method874(boolean arg0) {
        int var2 = this.field1037;
        int var3 = this.field1038;
        if (arg0) {
            var2 = this.field1039;
            var3 = this.field1045;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2086(Statics.field1012, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2086(Statics.field1012, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1014 != null) {
            for (int var7 = 0; var7 < this.field1014.length; var7++) {
                var4.method2063(this.field1014[var7], this.field1015[var7]);
            }
        }
        if (this.field1023 != null) {
            for (int var8 = 0; var8 < this.field1023.length; var8++) {
                var4.method2064(this.field1023[var8], this.field1017[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ac.q(S)V")
    public static void method858() {
        field1018.method3264();
        field1041.method3264();
        field1026.method3264();
    }

    @ObfuscatedName("client.w(I)V")
    public static void method375() {
        field1026.method3264();
    }
}
