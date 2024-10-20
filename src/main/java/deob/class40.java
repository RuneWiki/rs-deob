package deob;

@ObfuscatedName("aj")
public class class40 extends class174 {

    @ObfuscatedName("aj.r")
    public static class170 field1001 = new class170(64);

    @ObfuscatedName("aj.p")
    public static class170 field1023 = new class170(50);

    @ObfuscatedName("aj.n")
    public static class170 field1003 = new class170(100);

    @ObfuscatedName("aj.l")
    public int field1005;

    @ObfuscatedName("aj.t")
    public int field1006;

    @ObfuscatedName("aj.q")
    public String field1007 = "null";

    @ObfuscatedName("aj.c")
    public short[] field1008;

    @ObfuscatedName("aj.z")
    public short[] field1009;

    @ObfuscatedName("aj.s")
    public short[] field1015;

    @ObfuscatedName("aj.h")
    public short[] field1030;

    @ObfuscatedName("aj.f")
    public int field1012 = 2000;

    @ObfuscatedName("aj.w")
    public int field1020 = 0;

    @ObfuscatedName("aj.d")
    public int field1014 = 0;

    @ObfuscatedName("aj.y")
    public int field1027 = 0;

    @ObfuscatedName("aj.g")
    public int field1016 = 0;

    @ObfuscatedName("aj.v")
    public int field1017 = 0;

    @ObfuscatedName("aj.b")
    public int field1018 = 0;

    @ObfuscatedName("aj.j")
    public int field1036 = 1;

    @ObfuscatedName("aj.m")
    public boolean field1037 = false;

    @ObfuscatedName("aj.k")
    public String[] field1021 = new String[] { null, null, class134.field2102, null, null };

    @ObfuscatedName("aj.u")
    public String[] field1010 = new String[] { null, null, null, null, class134.field2075 };

    @ObfuscatedName("aj.i")
    public int field1035 = -1;

    @ObfuscatedName("aj.ah")
    public int field1024 = -1;

    @ObfuscatedName("aj.ag")
    public int field1025 = 0;

    @ObfuscatedName("aj.ay")
    public int field1026 = -1;

    @ObfuscatedName("aj.as")
    public int field1002 = -1;

    @ObfuscatedName("aj.aq")
    public int field1000 = 0;

    @ObfuscatedName("aj.am")
    public int field1029 = -1;

    @ObfuscatedName("aj.an")
    public int field1013 = -1;

    @ObfuscatedName("aj.av")
    public int field1031 = -1;

    @ObfuscatedName("aj.at")
    public int field1032 = -1;

    @ObfuscatedName("aj.ap")
    public int field1033 = -1;

    @ObfuscatedName("aj.ae")
    public int field1034 = -1;

    @ObfuscatedName("aj.af")
    public int[] field1028;

    @ObfuscatedName("aj.ai")
    public int[] field998;

    @ObfuscatedName("aj.aj")
    public int field1038 = -1;

    @ObfuscatedName("aj.ax")
    public int field1022 = -1;

    @ObfuscatedName("aj.ak")
    public int field1039 = 128;

    @ObfuscatedName("aj.az")
    public int field1019 = 128;

    @ObfuscatedName("aj.aa")
    public int field1041 = 128;

    @ObfuscatedName("aj.au")
    public int field1042 = 0;

    @ObfuscatedName("aj.ar")
    public int field1040 = 0;

    @ObfuscatedName("aj.ao")
    public int field1044 = 0;

    @ObfuscatedName("u.a(II)Laj;")
    public static class40 method248(int arg0) {
        class40 var1 = (class40) field1001.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1011.method2961(10, arg0);
        class40 var3 = new class40();
        var3.field1005 = arg0;
        if (var2 != null) {
            var3.method835(new class127(var2));
        }
        var3.method834();
        if (var3.field1022 != -1) {
            var3.method837(method248(var3.field1022), method248(var3.field1038));
        }
        if (!Statics.field1043 && var3.field1037) {
            var3.field1007 = class134.field2263;
            var3.field1021 = null;
            var3.field1010 = null;
            var3.field1044 = 0;
        }
        field1001.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.x(I)V")
    public void method834() {
    }

    @ObfuscatedName("aj.e(Ldy;I)V")
    public void method835(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method850(arg0, var2);
        }
    }

    @ObfuscatedName("aj.r(Ldy;IB)V")
    public void method850(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1006 = arg0.method2413();
        } else if (arg1 == 2) {
            this.field1007 = arg0.method2564();
        } else if (arg1 == 4) {
            this.field1012 = arg0.method2413();
        } else if (arg1 == 5) {
            this.field1020 = arg0.method2413();
        } else if (arg1 == 6) {
            this.field1014 = arg0.method2413();
        } else if (arg1 == 7) {
            this.field1016 = arg0.method2413();
            if (this.field1016 > 32767) {
                this.field1016 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1017 = arg0.method2413();
            if (this.field1017 > 32767) {
                this.field1017 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1018 = 1;
        } else if (arg1 == 12) {
            this.field1036 = arg0.method2416();
        } else if (arg1 == 16) {
            this.field1037 = true;
        } else if (arg1 == 23) {
            this.field1035 = arg0.method2413();
            this.field1025 = arg0.method2411();
        } else if (arg1 == 24) {
            this.field1024 = arg0.method2413();
        } else if (arg1 == 25) {
            this.field1026 = arg0.method2413();
            this.field1000 = arg0.method2411();
        } else if (arg1 == 26) {
            this.field1002 = arg0.method2413();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1021[arg1 - 30] = arg0.method2564();
            if (this.field1021[arg1 - 30].equalsIgnoreCase(class134.field2076)) {
                this.field1021[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1010[arg1 - 35] = arg0.method2564();
        } else if (arg1 == 40) {
            int var3 = arg0.method2411();
            this.field1008 = new short[var3];
            this.field1009 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1008[var4] = (short) arg0.method2413();
                this.field1009[var4] = (short) arg0.method2413();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2411();
            this.field1015 = new short[var5];
            this.field1030 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1015[var6] = (short) arg0.method2413();
                this.field1030[var6] = (short) arg0.method2413();
            }
        } else if (arg1 == 78) {
            this.field1029 = arg0.method2413();
        } else if (arg1 == 79) {
            this.field1013 = arg0.method2413();
        } else if (arg1 == 90) {
            this.field1031 = arg0.method2413();
        } else if (arg1 == 91) {
            this.field1033 = arg0.method2413();
        } else if (arg1 == 92) {
            this.field1032 = arg0.method2413();
        } else if (arg1 == 93) {
            this.field1034 = arg0.method2413();
        } else if (arg1 == 95) {
            this.field1027 = arg0.method2413();
        } else if (arg1 == 97) {
            this.field1038 = arg0.method2413();
        } else if (arg1 == 98) {
            this.field1022 = arg0.method2413();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1028 == null) {
                this.field1028 = new int[10];
                this.field998 = new int[10];
            }
            this.field1028[arg1 - 100] = arg0.method2413();
            this.field998[arg1 - 100] = arg0.method2413();
        } else if (arg1 == 110) {
            this.field1039 = arg0.method2413();
        } else if (arg1 == 111) {
            this.field1019 = arg0.method2413();
        } else if (arg1 == 112) {
            this.field1041 = arg0.method2413();
        } else if (arg1 == 113) {
            this.field1042 = arg0.method2412();
        } else if (arg1 == 114) {
            this.field1040 = arg0.method2412() * 5;
        } else if (arg1 == 115) {
            this.field1044 = arg0.method2411();
        }
    }

    @ObfuscatedName("aj.p(Laj;Laj;B)V")
    public void method837(class40 arg0, class40 arg1) {
        this.field1006 = arg0.field1006;
        this.field1012 = arg0.field1012;
        this.field1020 = arg0.field1020;
        this.field1014 = arg0.field1014;
        this.field1027 = arg0.field1027;
        this.field1016 = arg0.field1016;
        this.field1017 = arg0.field1017;
        this.field1008 = arg0.field1008;
        this.field1009 = arg0.field1009;
        this.field1015 = arg0.field1015;
        this.field1030 = arg0.field1030;
        this.field1007 = arg1.field1007;
        this.field1037 = arg1.field1037;
        this.field1036 = arg1.field1036;
        this.field1018 = 1;
    }

    @ObfuscatedName("aj.n(II)Lcc;")
    public final class101 method838(int arg0) {
        if (this.field1028 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field998[var3] && this.field998[var3] != 0) {
                    var2 = this.field1028[var3];
                }
            }
            if (var2 != -1) {
                return method248(var2).method838(1);
            }
        }
        class101 var4 = class101.method1989(Statics.field999, this.field1006, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1039 != 128 || this.field1019 != 128 || this.field1041 != 128) {
            var4.method2035(this.field1039, this.field1019, this.field1041);
        }
        if (this.field1008 != null) {
            for (int var5 = 0; var5 < this.field1008.length; var5++) {
                var4.method2002(this.field1008[var5], this.field1009[var5]);
            }
        }
        if (this.field1015 != null) {
            for (int var6 = 0; var6 < this.field1015.length; var6++) {
                var4.method2021(this.field1015[var6], this.field1030[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aj.o(II)Ldd;")
    public final class112 method839(int arg0) {
        if (this.field1028 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field998[var3] && this.field998[var3] != 0) {
                    var2 = this.field1028[var3];
                }
            }
            if (var2 != -1) {
                return method248(var2).method839(1);
            }
        }
        class112 var4 = (class112) field1023.method3196((long) this.field1005);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method1989(Statics.field999, this.field1006, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1039 != 128 || this.field1019 != 128 || this.field1041 != 128) {
            var5.method2035(this.field1039, this.field1019, this.field1041);
        }
        if (this.field1008 != null) {
            for (int var6 = 0; var6 < this.field1008.length; var6++) {
                var5.method2002(this.field1008[var6], this.field1009[var6]);
            }
        }
        if (this.field1015 != null) {
            for (int var7 = 0; var7 < this.field1015.length; var7++) {
                var5.method2021(this.field1015[var7], this.field1030[var7]);
            }
        }
        class112 var8 = var5.method2010(this.field1042 + 64, this.field1040 + 768, -50, -10, -50);
        var8.field1879 = true;
        field1023.method3193(var8, (long) this.field1005);
        return var8;
    }

    @ObfuscatedName("aj.l(IB)Laj;")
    public class40 method855(int arg0) {
        if (this.field1028 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field998[var3] && this.field998[var3] != 0) {
                    var2 = this.field1028[var3];
                }
            }
            if (var2 != -1) {
                return method248(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("e.t(IIIIZI)Lcj;")
    public static final class86 method23(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field1003.method3196(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method248(arg0);
        if (arg1 > 1 && var8.field1028 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field998[var10] && var8.field998[var10] != 0) {
                    var9 = var8.field1028[var10];
                }
            }
            if (var9 != -1) {
                var8 = method248(var9);
            }
        }
        class112 var11 = var8.method839(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1022 != -1) {
            var12 = method23(var8.field1038, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1494;
        int var14 = Statics.field1492;
        int var15 = Statics.field1493;
        int[] var16 = new int[4];
        class89.method1742(var16);
        class86 var17 = new class86(36, 32);
        class89.method1738(var17.field1479, 36, 32);
        class89.method1744();
        class104.method2069();
        class104.method2068(16, 16);
        class104.field1776 = false;
        int var18 = var8.field1012;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1785[var8.field1020] * var18 >> 16;
        int var20 = class104.field1786[var8.field1020] * var18 >> 16;
        var11.method2184();
        var11.method2195(0, var8.field1014, var8.field1027, var8.field1020, var8.field1016, var8.field1017 + var11.field1549 / 2 + var19, var8.field1017 + var20);
        if (arg2 >= 1) {
            var17.method1660(1);
        }
        if (arg2 >= 2) {
            var17.method1660(16777215);
        }
        if (arg3 != 0) {
            var17.method1642(arg3);
        }
        class89.method1738(var17.field1479, 36, 32);
        if (var8.field1022 != -1) {
            var12.method1645(0, 0);
        }
        if (!arg4 && (var8.field1018 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field1004.method3378(method1987(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1003.method3193(var17, var5);
        }
        class89.method1738(var13, var14, var15);
        class89.method1791(var16);
        class104.method2069();
        class104.field1776 = true;
        return var17;
    }

    @ObfuscatedName("cg.q(II)Ljava/lang/String;")
    public static final String method1987(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class134.field2228 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class134.field2166 + "</col>";
        }
    }

    @ObfuscatedName("aj.c(ZI)Z")
    public final boolean method840(boolean arg0) {
        int var2 = this.field1035;
        int var3 = this.field1024;
        int var4 = this.field1029;
        if (arg0) {
            var2 = this.field1026;
            var3 = this.field1002;
            var4 = this.field1013;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field999.method2939(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field999.method2939(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field999.method2939(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aj.z(ZI)Lcc;")
    public final class101 method870(boolean arg0) {
        int var2 = this.field1035;
        int var3 = this.field1024;
        int var4 = this.field1029;
        if (arg0) {
            var2 = this.field1026;
            var3 = this.field1002;
            var4 = this.field1013;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method1989(Statics.field999, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method1989(Statics.field999, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method1989(Statics.field999, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1025 != 0) {
            var5.method1994(0, this.field1025, 0);
        }
        if (arg0 && this.field1000 != 0) {
            var5.method1994(0, this.field1000, 0);
        }
        if (this.field1008 != null) {
            for (int var10 = 0; var10 < this.field1008.length; var10++) {
                var5.method2002(this.field1008[var10], this.field1009[var10]);
            }
        }
        if (this.field1015 != null) {
            for (int var11 = 0; var11 < this.field1015.length; var11++) {
                var5.method2021(this.field1015[var11], this.field1030[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aj.s(ZI)Z")
    public final boolean method842(boolean arg0) {
        int var2 = this.field1031;
        int var3 = this.field1032;
        if (arg0) {
            var2 = this.field1033;
            var3 = this.field1034;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field999.method2939(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field999.method2939(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aj.h(ZB)Lcc;")
    public final class101 method843(boolean arg0) {
        int var2 = this.field1031;
        int var3 = this.field1032;
        if (arg0) {
            var2 = this.field1033;
            var3 = this.field1034;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method1989(Statics.field999, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method1989(Statics.field999, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1008 != null) {
            for (int var7 = 0; var7 < this.field1008.length; var7++) {
                var4.method2002(this.field1008[var7], this.field1009[var7]);
            }
        }
        if (this.field1015 != null) {
            for (int var8 = 0; var8 < this.field1015.length; var8++) {
                var4.method2021(this.field1015[var8], this.field1030[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ci.f(S)V")
    public static void method1813() {
        field1003.method3192();
    }

    @ObfuscatedName("aq.w(ZB)V")
    public static void method637(boolean arg0) {
        if (Statics.field1043 != arg0) {
            field1001.method3192();
            field1023.method3192();
            field1003.method3192();
            Statics.field1043 = arg0;
        }
    }
}
