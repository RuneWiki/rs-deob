package deob;

@ObfuscatedName("ak")
public class class45 extends class183 {

    @ObfuscatedName("ak.e")
    public static class172 field1009 = new class172(64);

    @ObfuscatedName("ak.w")
    public static class172 field1010 = new class172(50);

    @ObfuscatedName("ak.m")
    public static class172 field1011 = new class172(100);

    @ObfuscatedName("ak.j")
    public int field1038;

    @ObfuscatedName("ak.o")
    public int field1013;

    @ObfuscatedName("ak.h")
    public String field1026 = "null";

    @ObfuscatedName("ak.b")
    public short[] field1015;

    @ObfuscatedName("ak.r")
    public short[] field1016;

    @ObfuscatedName("ak.l")
    public short[] field1017;

    @ObfuscatedName("ak.x")
    public short[] field1018;

    @ObfuscatedName("ak.q")
    public int field1031 = 2000;

    @ObfuscatedName("ak.t")
    public int field1020 = 0;

    @ObfuscatedName("ak.y")
    public int field1021 = 0;

    @ObfuscatedName("ak.d")
    public int field1008 = 0;

    @ObfuscatedName("ak.z")
    public int field1023 = 0;

    @ObfuscatedName("ak.n")
    public int field1024 = 0;

    @ObfuscatedName("ak.v")
    public int field1025 = 0;

    @ObfuscatedName("ak.f")
    public int field1044 = 1;

    @ObfuscatedName("ak.a")
    public boolean field1027 = false;

    @ObfuscatedName("ak.p")
    public String[] field1028 = new String[] { null, null, class143.field2171, null, null };

    @ObfuscatedName("ak.s")
    public String[] field1019 = new String[] { null, null, null, null, class143.field2294 };

    @ObfuscatedName("ak.c")
    public int field1022 = -1;

    @ObfuscatedName("ak.ar")
    public int field1055 = -1;

    @ObfuscatedName("ak.ac")
    public int field1032 = 0;

    @ObfuscatedName("ak.ah")
    public int field1033 = -1;

    @ObfuscatedName("ak.ap")
    public int field1034 = -1;

    @ObfuscatedName("ak.aj")
    public int field1035 = 0;

    @ObfuscatedName("ak.as")
    public int field1036 = -1;

    @ObfuscatedName("ak.aa")
    public int field1030 = -1;

    @ObfuscatedName("ak.am")
    public int field1042 = -1;

    @ObfuscatedName("ak.ae")
    public int field1039 = -1;

    @ObfuscatedName("ak.ai")
    public int field1040 = -1;

    @ObfuscatedName("ak.ay")
    public int field1041 = -1;

    @ObfuscatedName("ak.ax")
    public int[] field1049;

    @ObfuscatedName("ak.au")
    public int[] field1043;

    @ObfuscatedName("ak.az")
    public int field1006 = -1;

    @ObfuscatedName("ak.aw")
    public int field1045 = -1;

    @ObfuscatedName("ak.ag")
    public int field1046 = 128;

    @ObfuscatedName("ak.ao")
    public int field1007 = 128;

    @ObfuscatedName("ak.aq")
    public int field1048 = 128;

    @ObfuscatedName("ak.ak")
    public int field1012 = 0;

    @ObfuscatedName("ak.al")
    public int field1047 = 0;

    @ObfuscatedName("ak.at")
    public int field1051 = 0;

    @ObfuscatedName("o.g(Leo;Leo;ZLge;I)V")
    public static void method113(class147 arg0, class147 arg1, boolean arg2, class194 arg3) {
        Statics.field1029 = arg0;
        Statics.field1037 = arg1;
        Statics.field1014 = arg2;
        Statics.field1029.method2681(10);
        Statics.field160 = arg3;
    }

    @ObfuscatedName("ak.k(B)V")
    public void method851() {
    }

    @ObfuscatedName("ak.e(Ldk;I)V")
    public void method826(class107 arg0) {
        while (true) {
            int var2 = arg0.method2092();
            if (var2 == 0) {
                return;
            }
            this.method824(arg0, var2);
        }
    }

    @ObfuscatedName("ak.w(Ldk;II)V")
    public void method824(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1013 = arg0.method2094();
        } else if (arg1 == 2) {
            this.field1026 = arg0.method2251();
        } else if (arg1 == 4) {
            this.field1031 = arg0.method2094();
        } else if (arg1 == 5) {
            this.field1020 = arg0.method2094();
        } else if (arg1 == 6) {
            this.field1021 = arg0.method2094();
        } else if (arg1 == 7) {
            this.field1023 = arg0.method2094();
            if (this.field1023 > 32767) {
                this.field1023 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1024 = arg0.method2094();
            if (this.field1024 > 32767) {
                this.field1024 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1025 = 1;
        } else if (arg1 == 12) {
            this.field1044 = arg0.method2112();
        } else if (arg1 == 16) {
            this.field1027 = true;
        } else if (arg1 == 23) {
            this.field1022 = arg0.method2094();
            this.field1032 = arg0.method2092();
        } else if (arg1 == 24) {
            this.field1055 = arg0.method2094();
        } else if (arg1 == 25) {
            this.field1033 = arg0.method2094();
            this.field1035 = arg0.method2092();
        } else if (arg1 == 26) {
            this.field1034 = arg0.method2094();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1028[arg1 - 30] = arg0.method2251();
            if (this.field1028[arg1 - 30].equalsIgnoreCase(class143.field2173)) {
                this.field1028[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1019[arg1 - 35] = arg0.method2251();
        } else if (arg1 == 40) {
            int var3 = arg0.method2092();
            this.field1015 = new short[var3];
            this.field1016 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1015[var4] = (short) arg0.method2094();
                this.field1016[var4] = (short) arg0.method2094();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2092();
            this.field1017 = new short[var5];
            this.field1018 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1017[var6] = (short) arg0.method2094();
                this.field1018[var6] = (short) arg0.method2094();
            }
        } else if (arg1 == 78) {
            this.field1036 = arg0.method2094();
        } else if (arg1 == 79) {
            this.field1030 = arg0.method2094();
        } else if (arg1 == 90) {
            this.field1042 = arg0.method2094();
        } else if (arg1 == 91) {
            this.field1040 = arg0.method2094();
        } else if (arg1 == 92) {
            this.field1039 = arg0.method2094();
        } else if (arg1 == 93) {
            this.field1041 = arg0.method2094();
        } else if (arg1 == 95) {
            this.field1008 = arg0.method2094();
        } else if (arg1 == 97) {
            this.field1006 = arg0.method2094();
        } else if (arg1 == 98) {
            this.field1045 = arg0.method2094();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1049 == null) {
                this.field1049 = new int[10];
                this.field1043 = new int[10];
            }
            this.field1049[arg1 - 100] = arg0.method2094();
            this.field1043[arg1 - 100] = arg0.method2094();
        } else if (arg1 == 110) {
            this.field1046 = arg0.method2094();
        } else if (arg1 == 111) {
            this.field1007 = arg0.method2094();
        } else if (arg1 == 112) {
            this.field1048 = arg0.method2094();
        } else if (arg1 == 113) {
            this.field1012 = arg0.method2117();
        } else if (arg1 == 114) {
            this.field1047 = arg0.method2117() * 5;
        } else if (arg1 == 115) {
            this.field1051 = arg0.method2092();
        }
    }

    @ObfuscatedName("ak.m(Lak;Lak;I)V")
    public void method828(class45 arg0, class45 arg1) {
        this.field1013 = arg0.field1013;
        this.field1031 = arg0.field1031;
        this.field1020 = arg0.field1020;
        this.field1021 = arg0.field1021;
        this.field1008 = arg0.field1008;
        this.field1023 = arg0.field1023;
        this.field1024 = arg0.field1024;
        this.field1015 = arg0.field1015;
        this.field1016 = arg0.field1016;
        this.field1017 = arg0.field1017;
        this.field1018 = arg0.field1018;
        this.field1026 = arg1.field1026;
        this.field1027 = arg1.field1027;
        this.field1044 = arg1.field1044;
        this.field1025 = 1;
    }

    @ObfuscatedName("ak.u(II)Lcr;")
    public final class93 method829(int arg0) {
        if (this.field1049 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1043[var3] && this.field1043[var3] != 0) {
                    var2 = this.field1049[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method2406(var2).method829(1);
            }
        }
        class93 var4 = class93.method1903(Statics.field1037, this.field1013, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1046 != 128 || this.field1007 != 128 || this.field1048 != 128) {
            var4.method1876(this.field1046, this.field1007, this.field1048);
        }
        if (this.field1015 != null) {
            for (int var5 = 0; var5 < this.field1015.length; var5++) {
                var4.method1873(this.field1015[var5], this.field1016[var5]);
            }
        }
        if (this.field1017 != null) {
            for (int var6 = 0; var6 < this.field1017.length; var6++) {
                var4.method1874(this.field1017[var6], this.field1018[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ak.j(IB)Lce;")
    public final class98 method830(int arg0) {
        if (this.field1049 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1043[var3] && this.field1043[var3] != 0) {
                    var2 = this.field1049[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method2406(var2).method830(1);
            }
        }
        class98 var4 = (class98) field1010.method3135((long) this.field1038);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1903(Statics.field1037, this.field1013, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1046 != 128 || this.field1007 != 128 || this.field1048 != 128) {
            var5.method1876(this.field1046, this.field1007, this.field1048);
        }
        if (this.field1015 != null) {
            for (int var6 = 0; var6 < this.field1015.length; var6++) {
                var5.method1873(this.field1015[var6], this.field1016[var6]);
            }
        }
        if (this.field1017 != null) {
            for (int var7 = 0; var7 < this.field1017.length; var7++) {
                var5.method1874(this.field1017[var7], this.field1018[var7]);
            }
        }
        class98 var8 = var5.method1881(this.field1012 + 64, this.field1047 + 768, -50, -10, -50);
        var8.field1721 = true;
        field1010.method3140(var8, (long) this.field1038);
        return var8;
    }

    @ObfuscatedName("ak.o(IB)Lak;")
    public class45 method831(int arg0) {
        if (this.field1049 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1043[var3] && this.field1043[var3] != 0) {
                    var2 = this.field1049[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method2406(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ak.b(ZI)Z")
    public final boolean method832(boolean arg0) {
        int var2 = this.field1022;
        int var3 = this.field1055;
        int var4 = this.field1036;
        if (arg0) {
            var2 = this.field1033;
            var3 = this.field1034;
            var4 = this.field1030;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1037.method2724(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1037.method2724(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1037.method2724(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ak.r(ZI)Lcr;")
    public final class93 method833(boolean arg0) {
        int var2 = this.field1022;
        int var3 = this.field1055;
        int var4 = this.field1036;
        if (arg0) {
            var2 = this.field1033;
            var3 = this.field1034;
            var4 = this.field1030;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1903(Statics.field1037, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1903(Statics.field1037, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1903(Statics.field1037, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1032 != 0) {
            var5.method1865(0, this.field1032, 0);
        }
        if (arg0 && this.field1035 != 0) {
            var5.method1865(0, this.field1035, 0);
        }
        if (this.field1015 != null) {
            for (int var10 = 0; var10 < this.field1015.length; var10++) {
                var5.method1873(this.field1015[var10], this.field1016[var10]);
            }
        }
        if (this.field1017 != null) {
            for (int var11 = 0; var11 < this.field1017.length; var11++) {
                var5.method1874(this.field1017[var11], this.field1018[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ak.l(ZI)Z")
    public final boolean method834(boolean arg0) {
        int var2 = this.field1042;
        int var3 = this.field1039;
        if (arg0) {
            var2 = this.field1040;
            var3 = this.field1041;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1037.method2724(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1037.method2724(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ak.x(ZB)Lcr;")
    public final class93 method835(boolean arg0) {
        int var2 = this.field1042;
        int var3 = this.field1039;
        if (arg0) {
            var2 = this.field1040;
            var3 = this.field1041;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1903(Statics.field1037, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1903(Statics.field1037, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1015 != null) {
            for (int var7 = 0; var7 < this.field1015.length; var7++) {
                var4.method1873(this.field1015[var7], this.field1016[var7]);
            }
        }
        if (this.field1017 != null) {
            for (int var8 = 0; var8 < this.field1017.length; var8++) {
                var4.method1874(this.field1017[var8], this.field1018[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ai.q(B)V")
    public static void method660() {
        field1011.method3138();
    }

    @ObfuscatedName("ae.t(ZI)V")
    public static void method600(boolean arg0) {
        if (Statics.field1014 != arg0) {
            field1009.method3138();
            field1010.method3138();
            field1011.method3138();
            Statics.field1014 = arg0;
        }
    }
}
