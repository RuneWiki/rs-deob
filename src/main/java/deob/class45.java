package deob;

@ObfuscatedName("ai")
public class class45 extends class182 {

    @ObfuscatedName("ai.g")
    public static class171 field994 = new class171(64);

    @ObfuscatedName("ai.x")
    public static class171 field996 = new class171(50);

    @ObfuscatedName("ai.b")
    public static class171 field997 = new class171(100);

    @ObfuscatedName("ai.l")
    public int field1003;

    @ObfuscatedName("ai.m")
    public int field999;

    @ObfuscatedName("ai.u")
    public String field1000 = "null";

    @ObfuscatedName("ai.s")
    public short[] field1001;

    @ObfuscatedName("ai.f")
    public short[] field995;

    @ObfuscatedName("ai.p")
    public short[] field1017;

    @ObfuscatedName("ai.w")
    public short[] field1018;

    @ObfuscatedName("ai.y")
    public int field1005 = 2000;

    @ObfuscatedName("ai.h")
    public int field998 = 0;

    @ObfuscatedName("ai.j")
    public int field1039 = 0;

    @ObfuscatedName("ai.c")
    public int field1008 = 0;

    @ObfuscatedName("ai.d")
    public int field1009 = 0;

    @ObfuscatedName("ai.a")
    public int field1010 = 0;

    @ObfuscatedName("ai.o")
    public int field1011 = 0;

    @ObfuscatedName("ai.r")
    public int field1028 = 1;

    @ObfuscatedName("ai.t")
    public boolean field1038 = false;

    @ObfuscatedName("ai.k")
    public String[] field1014 = new String[] { null, null, class142.field2135, null, null };

    @ObfuscatedName("ai.n")
    public String[] field1015 = new String[] { null, null, null, null, class142.field2136 };

    @ObfuscatedName("ai.z")
    public int field1016 = -1;

    @ObfuscatedName("ai.av")
    public int field1041 = -1;

    @ObfuscatedName("ai.ao")
    public int field1036 = 0;

    @ObfuscatedName("ai.am")
    public int field1012 = -1;

    @ObfuscatedName("ai.ac")
    public int field1020 = -1;

    @ObfuscatedName("ai.ak")
    public int field1021 = 0;

    @ObfuscatedName("ai.ag")
    public int field1022 = -1;

    @ObfuscatedName("ai.ap")
    public int field1023 = -1;

    @ObfuscatedName("ai.ah")
    public int field1024 = -1;

    @ObfuscatedName("ai.an")
    public int field1025 = -1;

    @ObfuscatedName("ai.ay")
    public int field1026 = -1;

    @ObfuscatedName("ai.af")
    public int field1027 = -1;

    @ObfuscatedName("ai.aq")
    public int[] field1004;

    @ObfuscatedName("ai.aj")
    public int[] field1029;

    @ObfuscatedName("ai.at")
    public int field1019 = -1;

    @ObfuscatedName("ai.aw")
    public int field1031 = -1;

    @ObfuscatedName("ai.ar")
    public int field1032 = 128;

    @ObfuscatedName("ai.az")
    public int field1013 = 128;

    @ObfuscatedName("ai.au")
    public int field1034 = 128;

    @ObfuscatedName("ai.ai")
    public int field1035 = 0;

    @ObfuscatedName("ai.ad")
    public int field1006 = 0;

    @ObfuscatedName("ai.al")
    public int field1037 = 0;

    @ObfuscatedName("aq.e(Les;Les;ZLgy;I)V")
    public static void method715(class146 arg0, class146 arg1, boolean arg2, class193 arg3) {
        Statics.field911 = arg0;
        Statics.field1033 = arg1;
        Statics.field76 = arg2;
        Statics.field911.method2705(10);
        Statics.field2955 = arg3;
    }

    @ObfuscatedName("i.v(II)Lai;")
    public static class45 method28(int arg0) {
        class45 var1 = (class45) field994.method3136((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field911.method2695(10, arg0);
        class45 var3 = new class45();
        var3.field1003 = arg0;
        if (var2 != null) {
            var3.method825(new class107(var2));
        }
        var3.method822();
        if (var3.field1031 != -1) {
            var3.method827(method28(var3.field1031), method28(var3.field1019));
        }
        if (!Statics.field76 && var3.field1038) {
            var3.field1000 = class142.field2278;
            var3.field1014 = null;
            var3.field1015 = null;
            var3.field1037 = 0;
        }
        field994.method3127(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.i(I)V")
    public void method822() {
    }

    @ObfuscatedName("ai.g(Ldk;I)V")
    public void method825(class107 arg0) {
        while (true) {
            int var2 = arg0.method2226();
            if (var2 == 0) {
                return;
            }
            this.method824(arg0, var2);
        }
    }

    @ObfuscatedName("ai.x(Ldk;IB)V")
    public void method824(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field999 = arg0.method2152();
        } else if (arg1 == 2) {
            this.field1000 = arg0.method2124();
        } else if (arg1 == 4) {
            this.field1005 = arg0.method2152();
        } else if (arg1 == 5) {
            this.field998 = arg0.method2152();
        } else if (arg1 == 6) {
            this.field1039 = arg0.method2152();
        } else if (arg1 == 7) {
            this.field1009 = arg0.method2152();
            if (this.field1009 > 32767) {
                this.field1009 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1010 = arg0.method2152();
            if (this.field1010 > 32767) {
                this.field1010 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1011 = 1;
        } else if (arg1 == 12) {
            this.field1028 = arg0.method2121();
        } else if (arg1 == 16) {
            this.field1038 = true;
        } else if (arg1 == 23) {
            this.field1016 = arg0.method2152();
            this.field1036 = arg0.method2226();
        } else if (arg1 == 24) {
            this.field1041 = arg0.method2152();
        } else if (arg1 == 25) {
            this.field1012 = arg0.method2152();
            this.field1021 = arg0.method2226();
        } else if (arg1 == 26) {
            this.field1020 = arg0.method2152();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1014[arg1 - 30] = arg0.method2124();
            if (this.field1014[arg1 - 30].equalsIgnoreCase(class142.field2372)) {
                this.field1014[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1015[arg1 - 35] = arg0.method2124();
        } else if (arg1 == 40) {
            int var3 = arg0.method2226();
            this.field1001 = new short[var3];
            this.field995 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1001[var4] = (short) arg0.method2152();
                this.field995[var4] = (short) arg0.method2152();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2226();
            this.field1017 = new short[var5];
            this.field1018 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1017[var6] = (short) arg0.method2152();
                this.field1018[var6] = (short) arg0.method2152();
            }
        } else if (arg1 == 78) {
            this.field1022 = arg0.method2152();
        } else if (arg1 == 79) {
            this.field1023 = arg0.method2152();
        } else if (arg1 == 90) {
            this.field1024 = arg0.method2152();
        } else if (arg1 == 91) {
            this.field1026 = arg0.method2152();
        } else if (arg1 == 92) {
            this.field1025 = arg0.method2152();
        } else if (arg1 == 93) {
            this.field1027 = arg0.method2152();
        } else if (arg1 == 95) {
            this.field1008 = arg0.method2152();
        } else if (arg1 == 97) {
            this.field1019 = arg0.method2152();
        } else if (arg1 == 98) {
            this.field1031 = arg0.method2152();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1004 == null) {
                this.field1004 = new int[10];
                this.field1029 = new int[10];
            }
            this.field1004[arg1 - 100] = arg0.method2152();
            this.field1029[arg1 - 100] = arg0.method2152();
        } else if (arg1 == 110) {
            this.field1032 = arg0.method2152();
        } else if (arg1 == 111) {
            this.field1013 = arg0.method2152();
        } else if (arg1 == 112) {
            this.field1034 = arg0.method2152();
        } else if (arg1 == 113) {
            this.field1035 = arg0.method2292();
        } else if (arg1 == 114) {
            this.field1006 = arg0.method2292() * 5;
        } else if (arg1 == 115) {
            this.field1037 = arg0.method2226();
        }
    }

    @ObfuscatedName("ai.b(Lai;Lai;B)V")
    public void method827(class45 arg0, class45 arg1) {
        this.field999 = arg0.field999;
        this.field1005 = arg0.field1005;
        this.field998 = arg0.field998;
        this.field1039 = arg0.field1039;
        this.field1008 = arg0.field1008;
        this.field1009 = arg0.field1009;
        this.field1010 = arg0.field1010;
        this.field1001 = arg0.field1001;
        this.field995 = arg0.field995;
        this.field1017 = arg0.field1017;
        this.field1018 = arg0.field1018;
        this.field1000 = arg1.field1000;
        this.field1038 = arg1.field1038;
        this.field1028 = arg1.field1028;
        this.field1011 = 1;
    }

    @ObfuscatedName("ai.q(II)Lcr;")
    public final class93 method826(int arg0) {
        if (this.field1004 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1029[var3] && this.field1029[var3] != 0) {
                    var2 = this.field1004[var3];
                }
            }
            if (var2 != -1) {
                return method28(var2).method826(1);
            }
        }
        class93 var4 = class93.method1877(Statics.field1033, this.field999, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1032 != 128 || this.field1013 != 128 || this.field1034 != 128) {
            var4.method1892(this.field1032, this.field1013, this.field1034);
        }
        if (this.field1001 != null) {
            for (int var5 = 0; var5 < this.field1001.length; var5++) {
                var4.method1890(this.field1001[var5], this.field995[var5]);
            }
        }
        if (this.field1017 != null) {
            for (int var6 = 0; var6 < this.field1017.length; var6++) {
                var4.method1883(this.field1017[var6], this.field1018[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ai.l(IB)Lcz;")
    public final class98 method846(int arg0) {
        if (this.field1004 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1029[var3] && this.field1029[var3] != 0) {
                    var2 = this.field1004[var3];
                }
            }
            if (var2 != -1) {
                return method28(var2).method846(1);
            }
        }
        class98 var4 = (class98) field996.method3136((long) this.field1003);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1877(Statics.field1033, this.field999, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1032 != 128 || this.field1013 != 128 || this.field1034 != 128) {
            var5.method1892(this.field1032, this.field1013, this.field1034);
        }
        if (this.field1001 != null) {
            for (int var6 = 0; var6 < this.field1001.length; var6++) {
                var5.method1890(this.field1001[var6], this.field995[var6]);
            }
        }
        if (this.field1017 != null) {
            for (int var7 = 0; var7 < this.field1017.length; var7++) {
                var5.method1883(this.field1017[var7], this.field1018[var7]);
            }
        }
        class98 var8 = var5.method1897(this.field1035 + 64, this.field1006 + 768, -50, -10, -50);
        var8.field1717 = true;
        field996.method3127(var8, (long) this.field1003);
        return var8;
    }

    @ObfuscatedName("ai.m(IB)Lai;")
    public class45 method828(int arg0) {
        if (this.field1004 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1029[var3] && this.field1029[var3] != 0) {
                    var2 = this.field1004[var3];
                }
            }
            if (var2 != -1) {
                return method28(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ag.u(IIIIZI)Lbe;")
    public static final class72 method564(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field997.method3136(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method28(arg0);
        if (arg1 > 1 && var8.field1004 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1029[var10] && var8.field1029[var10] != 0) {
                    var9 = var8.field1004[var10];
                }
            }
            if (var9 != -1) {
                var8 = method28(var9);
            }
        }
        class98 var11 = var8.method846(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1031 != -1) {
            var12 = method564(var8.field1019, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1313;
        int var14 = Statics.field1311;
        int var15 = Statics.field1310;
        int[] var16 = new int[4];
        class73.method1511(var16);
        class72 var17 = new class72(36, 32);
        class73.method1516(var17.field1300, 36, 32);
        class73.method1513();
        class84.method1826();
        class84.method1780(16, 16);
        class84.field1460 = false;
        int var18 = var8.field1005;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1480[var8.field998] * var18 >> 16;
        int var20 = class84.field1464[var8.field998] * var18 >> 16;
        var11.method1969();
        var11.method2034(0, var8.field1039, var8.field1008, var8.field998, var8.field1009, var8.field1010 + var11.field1349 / 2 + var19, var8.field1010 + var20);
        if (arg2 >= 1) {
            var17.method1417(1);
        }
        if (arg2 >= 2) {
            var17.method1417(16777215);
        }
        if (arg3 != 0) {
            var17.method1488(arg3);
        }
        class73.method1516(var17.field1300, 36, 32);
        if (var8.field1031 != -1) {
            var12.method1429(0, 0);
        }
        if (!arg4 && (var8.field1011 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field2955.method3308(method552(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field997.method3127(var17, var5);
        }
        class73.method1516(var13, var14, var15);
        class73.method1512(var16);
        class84.method1826();
        class84.field1460 = true;
        return var17;
    }

    @ObfuscatedName("am.s(II)Ljava/lang/String;")
    public static final String method552(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class142.field2308 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class142.field2296 + "</col>";
        }
    }

    @ObfuscatedName("ai.f(ZB)Z")
    public final boolean method829(boolean arg0) {
        int var2 = this.field1016;
        int var3 = this.field1041;
        int var4 = this.field1022;
        if (arg0) {
            var2 = this.field1012;
            var3 = this.field1020;
            var4 = this.field1023;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1033.method2697(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1033.method2697(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1033.method2697(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ai.p(ZI)Lcr;")
    public final class93 method830(boolean arg0) {
        int var2 = this.field1016;
        int var3 = this.field1041;
        int var4 = this.field1022;
        if (arg0) {
            var2 = this.field1012;
            var3 = this.field1020;
            var4 = this.field1023;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1877(Statics.field1033, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1877(Statics.field1033, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1877(Statics.field1033, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1036 != 0) {
            var5.method1889(0, this.field1036, 0);
        }
        if (arg0 && this.field1021 != 0) {
            var5.method1889(0, this.field1021, 0);
        }
        if (this.field1001 != null) {
            for (int var10 = 0; var10 < this.field1001.length; var10++) {
                var5.method1890(this.field1001[var10], this.field995[var10]);
            }
        }
        if (this.field1017 != null) {
            for (int var11 = 0; var11 < this.field1017.length; var11++) {
                var5.method1883(this.field1017[var11], this.field1018[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ai.w(ZI)Z")
    public final boolean method865(boolean arg0) {
        int var2 = this.field1024;
        int var3 = this.field1025;
        if (arg0) {
            var2 = this.field1026;
            var3 = this.field1027;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1033.method2697(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1033.method2697(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ai.y(ZI)Lcr;")
    public final class93 method832(boolean arg0) {
        int var2 = this.field1024;
        int var3 = this.field1025;
        if (arg0) {
            var2 = this.field1026;
            var3 = this.field1027;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1877(Statics.field1033, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1877(Statics.field1033, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1001 != null) {
            for (int var7 = 0; var7 < this.field1001.length; var7++) {
                var4.method1890(this.field1001[var7], this.field995[var7]);
            }
        }
        if (this.field1017 != null) {
            for (int var8 = 0; var8 < this.field1017.length; var8++) {
                var4.method1883(this.field1017[var8], this.field1018[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("n.h(B)V")
    public static void method510() {
        field994.method3128();
        field996.method3128();
        field997.method3128();
    }
}
