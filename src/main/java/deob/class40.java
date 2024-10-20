package deob;

@ObfuscatedName("ae")
public class class40 extends class174 {

    @ObfuscatedName("ae.o")
    public static class170 field996 = new class170(64);

    @ObfuscatedName("ae.p")
    public static class170 field985 = new class170(50);

    @ObfuscatedName("ae.x")
    public static class170 field986 = new class170(100);

    @ObfuscatedName("ae.r")
    public int field981;

    @ObfuscatedName("ae.z")
    public int field987;

    @ObfuscatedName("ae.n")
    public String field989 = "null";

    @ObfuscatedName("ae.j")
    public short[] field1020;

    @ObfuscatedName("ae.b")
    public short[] field991;

    @ObfuscatedName("ae.t")
    public short[] field992;

    @ObfuscatedName("ae.q")
    public short[] field993;

    @ObfuscatedName("ae.e")
    public int field994 = 2000;

    @ObfuscatedName("ae.l")
    public int field1026 = 0;

    @ObfuscatedName("ae.u")
    public int field1022 = 0;

    @ObfuscatedName("ae.m")
    public int field997 = 0;

    @ObfuscatedName("ae.a")
    public int field998 = 0;

    @ObfuscatedName("ae.f")
    public int field988 = 0;

    @ObfuscatedName("ae.y")
    public int field1016 = 0;

    @ObfuscatedName("ae.v")
    public int field1001 = 1;

    @ObfuscatedName("ae.w")
    public boolean field1002 = false;

    @ObfuscatedName("ae.d")
    public String[] field1003 = new String[] { null, null, class135.field2174, null, null };

    @ObfuscatedName("ae.i")
    public String[] field1014 = new String[] { null, null, null, null, class135.field2091 };

    @ObfuscatedName("ae.c")
    public int field1005 = -1;

    @ObfuscatedName("ae.af")
    public int field1006 = -1;

    @ObfuscatedName("ae.aq")
    public int field1007 = 0;

    @ObfuscatedName("ae.at")
    public int field1000 = -1;

    @ObfuscatedName("ae.aw")
    public int field984 = -1;

    @ObfuscatedName("ae.ax")
    public int field1010 = 0;

    @ObfuscatedName("ae.ak")
    public int field999 = -1;

    @ObfuscatedName("ae.ar")
    public int field1012 = -1;

    @ObfuscatedName("ae.az")
    public int field1013 = -1;

    @ObfuscatedName("ae.ai")
    public int field1019 = -1;

    @ObfuscatedName("ae.aj")
    public int field1015 = -1;

    @ObfuscatedName("ae.ap")
    public int field1028 = -1;

    @ObfuscatedName("ae.av")
    public int[] field1017;

    @ObfuscatedName("ae.ad")
    public int[] field1018;

    @ObfuscatedName("ae.ae")
    public int field1011 = -1;

    @ObfuscatedName("ae.ah")
    public int field1004 = -1;

    @ObfuscatedName("ae.am")
    public int field1021 = 128;

    @ObfuscatedName("ae.ay")
    public int field995 = 128;

    @ObfuscatedName("ae.ag")
    public int field1023 = 128;

    @ObfuscatedName("ae.al")
    public int field1024 = 0;

    @ObfuscatedName("ae.an")
    public int field1025 = 0;

    @ObfuscatedName("ae.aa")
    public int field1009 = 0;

    @ObfuscatedName("bd.g(II)Lae;")
    public static class40 method1333(int arg0) {
        class40 var1 = (class40) field996.method3303((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field990.method3080(10, arg0);
        class40 var3 = new class40();
        var3.field981 = arg0;
        if (var2 != null) {
            var3.method860(new class127(var2));
        }
        var3.method833();
        if (var3.field1004 != -1) {
            var3.method836(method1333(var3.field1004), method1333(var3.field1011));
        }
        if (!Statics.field983 && var3.field1002) {
            var3.field989 = class135.field2321;
            var3.field1003 = null;
            var3.field1014 = null;
            var3.field1009 = 0;
        }
        field996.method3313(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.h(I)V")
    public void method833() {
    }

    @ObfuscatedName("ae.s(Ldw;I)V")
    public void method860(class127 arg0) {
        while (true) {
            int var2 = arg0.method2499();
            if (var2 == 0) {
                return;
            }
            this.method837(arg0, var2);
        }
    }

    @ObfuscatedName("ae.o(Ldw;IB)V")
    public void method837(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field987 = arg0.method2501();
        } else if (arg1 == 2) {
            this.field989 = arg0.method2507();
        } else if (arg1 == 4) {
            this.field994 = arg0.method2501();
        } else if (arg1 == 5) {
            this.field1026 = arg0.method2501();
        } else if (arg1 == 6) {
            this.field1022 = arg0.method2501();
        } else if (arg1 == 7) {
            this.field998 = arg0.method2501();
            if (this.field998 > 32767) {
                this.field998 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field988 = arg0.method2501();
            if (this.field988 > 32767) {
                this.field988 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1016 = 1;
        } else if (arg1 == 12) {
            this.field1001 = arg0.method2548();
        } else if (arg1 == 16) {
            this.field1002 = true;
        } else if (arg1 == 23) {
            this.field1005 = arg0.method2501();
            this.field1007 = arg0.method2499();
        } else if (arg1 == 24) {
            this.field1006 = arg0.method2501();
        } else if (arg1 == 25) {
            this.field1000 = arg0.method2501();
            this.field1010 = arg0.method2499();
        } else if (arg1 == 26) {
            this.field984 = arg0.method2501();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1003[arg1 - 30] = arg0.method2507();
            if (this.field1003[arg1 - 30].equalsIgnoreCase(class135.field2092)) {
                this.field1003[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1014[arg1 - 35] = arg0.method2507();
        } else if (arg1 == 40) {
            int var3 = arg0.method2499();
            this.field1020 = new short[var3];
            this.field991 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1020[var4] = (short) arg0.method2501();
                this.field991[var4] = (short) arg0.method2501();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2499();
            this.field992 = new short[var5];
            this.field993 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field992[var6] = (short) arg0.method2501();
                this.field993[var6] = (short) arg0.method2501();
            }
        } else if (arg1 == 78) {
            this.field999 = arg0.method2501();
        } else if (arg1 == 79) {
            this.field1012 = arg0.method2501();
        } else if (arg1 == 90) {
            this.field1013 = arg0.method2501();
        } else if (arg1 == 91) {
            this.field1015 = arg0.method2501();
        } else if (arg1 == 92) {
            this.field1019 = arg0.method2501();
        } else if (arg1 == 93) {
            this.field1028 = arg0.method2501();
        } else if (arg1 == 95) {
            this.field997 = arg0.method2501();
        } else if (arg1 == 97) {
            this.field1011 = arg0.method2501();
        } else if (arg1 == 98) {
            this.field1004 = arg0.method2501();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1017 == null) {
                this.field1017 = new int[10];
                this.field1018 = new int[10];
            }
            this.field1017[arg1 - 100] = arg0.method2501();
            this.field1018[arg1 - 100] = arg0.method2501();
        } else if (arg1 == 110) {
            this.field1021 = arg0.method2501();
        } else if (arg1 == 111) {
            this.field995 = arg0.method2501();
        } else if (arg1 == 112) {
            this.field1023 = arg0.method2501();
        } else if (arg1 == 113) {
            this.field1024 = arg0.method2500();
        } else if (arg1 == 114) {
            this.field1025 = arg0.method2500() * 5;
        } else if (arg1 == 115) {
            this.field1009 = arg0.method2499();
        }
    }

    @ObfuscatedName("ae.p(Lae;Lae;I)V")
    public void method836(class40 arg0, class40 arg1) {
        this.field987 = arg0.field987;
        this.field994 = arg0.field994;
        this.field1026 = arg0.field1026;
        this.field1022 = arg0.field1022;
        this.field997 = arg0.field997;
        this.field998 = arg0.field998;
        this.field988 = arg0.field988;
        this.field1020 = arg0.field1020;
        this.field991 = arg0.field991;
        this.field992 = arg0.field992;
        this.field993 = arg0.field993;
        this.field989 = arg1.field989;
        this.field1002 = arg1.field1002;
        this.field1001 = arg1.field1001;
        this.field1016 = 1;
    }

    @ObfuscatedName("ae.x(II)Lcz;")
    public final class101 method834(int arg0) {
        if (this.field1017 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1018[var3] && this.field1018[var3] != 0) {
                    var2 = this.field1017[var3];
                }
            }
            if (var2 != -1) {
                return method1333(var2).method834(1);
            }
        }
        class101 var4 = class101.method2085(Statics.field982, this.field987, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1021 != 128 || this.field995 != 128 || this.field1023 != 128) {
            var4.method2093(this.field1021, this.field995, this.field1023);
        }
        if (this.field1020 != null) {
            for (int var5 = 0; var5 < this.field1020.length; var5++) {
                var4.method2097(this.field1020[var5], this.field991[var5]);
            }
        }
        if (this.field992 != null) {
            for (int var6 = 0; var6 < this.field992.length; var6++) {
                var4.method2167(this.field992[var6], this.field993[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ae.k(II)Ldn;")
    public final class112 method851(int arg0) {
        if (this.field1017 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1018[var3] && this.field1018[var3] != 0) {
                    var2 = this.field1017[var3];
                }
            }
            if (var2 != -1) {
                return method1333(var2).method851(1);
            }
        }
        class112 var4 = (class112) field985.method3303((long) this.field981);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2085(Statics.field982, this.field987, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1021 != 128 || this.field995 != 128 || this.field1023 != 128) {
            var5.method2093(this.field1021, this.field995, this.field1023);
        }
        if (this.field1020 != null) {
            for (int var6 = 0; var6 < this.field1020.length; var6++) {
                var5.method2097(this.field1020[var6], this.field991[var6]);
            }
        }
        if (this.field992 != null) {
            for (int var7 = 0; var7 < this.field992.length; var7++) {
                var5.method2167(this.field992[var7], this.field993[var7]);
            }
        }
        class112 var8 = var5.method2104(this.field1024 + 64, this.field1025 + 768, -50, -10, -50);
        var8.field1868 = true;
        field985.method3313(var8, (long) this.field981);
        return var8;
    }

    @ObfuscatedName("ae.r(II)Lae;")
    public class40 method839(int arg0) {
        if (this.field1017 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1018[var3] && this.field1018[var3] != 0) {
                    var2 = this.field1017[var3];
                }
            }
            if (var2 != -1) {
                return method1333(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ci.z(IIIIZI)Lcj;")
    public static final class86 method1707(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field986.method3303(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method1333(arg0);
        if (arg1 > 1 && var8.field1017 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1018[var10] && var8.field1018[var10] != 0) {
                    var9 = var8.field1017[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1333(var9);
            }
        }
        class112 var11 = var8.method851(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1004 != -1) {
            var12 = method1707(var8.field1011, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1476;
        int var14 = Statics.field1477;
        int var15 = Statics.field1478;
        int[] var16 = new int[4];
        class89.method1821(var16);
        class86 var17 = new class86(36, 32);
        class89.method1822(var17.field1464, 36, 32);
        class89.method1869();
        class104.method2173();
        class104.method2177(16, 16);
        class104.field1751 = false;
        int var18 = var8.field994;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1755[var8.field1026] * var18 >> 16;
        int var20 = class104.field1743[var8.field1026] * var18 >> 16;
        var11.method2276();
        var11.method2288(0, var8.field1022, var8.field997, var8.field1026, var8.field998, var8.field988 + var11.field1535 / 2 + var19, var8.field988 + var20);
        if (arg2 >= 1) {
            var17.method1716(1);
        }
        if (arg2 >= 2) {
            var17.method1716(16777215);
        }
        if (arg3 != 0) {
            var17.method1803(arg3);
        }
        class89.method1822(var17.field1464, 36, 32);
        if (var8.field1004 != -1) {
            var12.method1764(0, 0);
        }
        if (!arg4 && (var8.field1016 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field265.method3456(method2782(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field986.method3313(var17, var5);
        }
        class89.method1822(var13, var14, var15);
        class89.method1828(var16);
        class104.method2173();
        class104.field1751 = true;
        return var17;
    }

    @ObfuscatedName("ep.n(IB)Ljava/lang/String;")
    public static final String method2782(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class135.field2110 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class135.field2242 + "</col>";
        }
    }

    @ObfuscatedName("ae.j(ZI)Z")
    public final boolean method840(boolean arg0) {
        int var2 = this.field1005;
        int var3 = this.field1006;
        int var4 = this.field999;
        if (arg0) {
            var2 = this.field1000;
            var3 = this.field984;
            var4 = this.field1012;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field982.method3084(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field982.method3084(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field982.method3084(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ae.b(ZB)Lcz;")
    public final class101 method841(boolean arg0) {
        int var2 = this.field1005;
        int var3 = this.field1006;
        int var4 = this.field999;
        if (arg0) {
            var2 = this.field1000;
            var3 = this.field984;
            var4 = this.field1012;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2085(Statics.field982, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2085(Statics.field982, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2085(Statics.field982, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1007 != 0) {
            var5.method2096(0, this.field1007, 0);
        }
        if (arg0 && this.field1010 != 0) {
            var5.method2096(0, this.field1010, 0);
        }
        if (this.field1020 != null) {
            for (int var10 = 0; var10 < this.field1020.length; var10++) {
                var5.method2097(this.field1020[var10], this.field991[var10]);
            }
        }
        if (this.field992 != null) {
            for (int var11 = 0; var11 < this.field992.length; var11++) {
                var5.method2167(this.field992[var11], this.field993[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ae.t(ZI)Z")
    public final boolean method842(boolean arg0) {
        int var2 = this.field1013;
        int var3 = this.field1019;
        if (arg0) {
            var2 = this.field1015;
            var3 = this.field1028;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field982.method3084(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field982.method3084(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ae.q(ZB)Lcz;")
    public final class101 method870(boolean arg0) {
        int var2 = this.field1013;
        int var3 = this.field1019;
        if (arg0) {
            var2 = this.field1015;
            var3 = this.field1028;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2085(Statics.field982, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2085(Statics.field982, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1020 != null) {
            for (int var7 = 0; var7 < this.field1020.length; var7++) {
                var4.method2097(this.field1020[var7], this.field991[var7]);
            }
        }
        if (this.field992 != null) {
            for (int var8 = 0; var8 < this.field992.length; var8++) {
                var4.method2167(this.field992[var8], this.field993[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("j.e(I)V")
    public static void method119() {
        field996.method3306();
        field985.method3306();
        field986.method3306();
    }

    @ObfuscatedName("aw.l(B)V")
    public static void method591() {
        field986.method3306();
    }
}
