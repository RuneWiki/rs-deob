package deob;

@ObfuscatedName("ai")
public class class40 extends class174 {

    @ObfuscatedName("ai.n")
    public static class170 field1012 = new class170(64);

    @ObfuscatedName("ai.l")
    public static class170 field989 = new class170(50);

    @ObfuscatedName("ai.v")
    public static class170 field990 = new class170(100);

    @ObfuscatedName("ai.x")
    public int field1027;

    @ObfuscatedName("ai.c")
    public int field992;

    @ObfuscatedName("ai.f")
    public String field994 = "null";

    @ObfuscatedName("ai.r")
    public short[] field995;

    @ObfuscatedName("ai.d")
    public short[] field996;

    @ObfuscatedName("ai.a")
    public short[] field997;

    @ObfuscatedName("ai.q")
    public short[] field998;

    @ObfuscatedName("ai.u")
    public int field999 = 2000;

    @ObfuscatedName("ai.w")
    public int field1000 = 0;

    @ObfuscatedName("ai.s")
    public int field1001 = 0;

    @ObfuscatedName("ai.e")
    public int field1002 = 0;

    @ObfuscatedName("ai.b")
    public int field1003 = 0;

    @ObfuscatedName("ai.j")
    public int field1018 = 0;

    @ObfuscatedName("ai.h")
    public int field1005 = 0;

    @ObfuscatedName("ai.m")
    public int field1006 = 1;

    @ObfuscatedName("ai.y")
    public boolean field1007 = false;

    @ObfuscatedName("ai.t")
    public String[] field1008 = new String[] { null, null, class134.field2089, null, null };

    @ObfuscatedName("ai.k")
    public String[] field988 = new String[] { null, null, null, null, class134.field2092 };

    @ObfuscatedName("ai.z")
    public int field1010 = -1;

    @ObfuscatedName("ai.at")
    public int field1011 = -1;

    @ObfuscatedName("ai.ay")
    public int field1022 = 0;

    @ObfuscatedName("ai.ae")
    public int field1004 = -1;

    @ObfuscatedName("ai.af")
    public int field1019 = -1;

    @ObfuscatedName("ai.ao")
    public int field1015 = 0;

    @ObfuscatedName("ai.ad")
    public int field1016 = -1;

    @ObfuscatedName("ai.aj")
    public int field1017 = -1;

    @ObfuscatedName("ai.ah")
    public int field1014 = -1;

    @ObfuscatedName("ai.aq")
    public int field1023 = -1;

    @ObfuscatedName("ai.ar")
    public int field1020 = -1;

    @ObfuscatedName("ai.aa")
    public int field1021 = -1;

    @ObfuscatedName("ai.an")
    public int[] field1024;

    @ObfuscatedName("ai.ab")
    public int[] field1013;

    @ObfuscatedName("ai.ai")
    public int field993 = -1;

    @ObfuscatedName("ai.ac")
    public int field1025 = -1;

    @ObfuscatedName("ai.ak")
    public int field1026 = 128;

    @ObfuscatedName("ai.au")
    public int field1009 = 128;

    @ObfuscatedName("ai.am")
    public int field1028 = 128;

    @ObfuscatedName("ai.ag")
    public int field1029 = 0;

    @ObfuscatedName("ai.al")
    public int field1030 = 0;

    @ObfuscatedName("ai.av")
    public int field1031 = 0;

    @ObfuscatedName("aj.p(II)Lai;")
    public static class40 method730(int arg0) {
        class40 var1 = (class40) field1012.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field985.method3049(10, arg0);
        class40 var3 = new class40();
        var3.field1027 = arg0;
        if (var2 != null) {
            var3.method857(new class127(var2));
        }
        var3.method856();
        if (var3.field1025 != -1) {
            var3.method859(method730(var3.field1025), method730(var3.field993));
        }
        if (!Statics.field987 && var3.field1007) {
            var3.field994 = class134.field2217;
            var3.field1008 = null;
            var3.field988 = null;
            var3.field1031 = 0;
        }
        field1012.method3269(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.i(B)V")
    public void method856() {
    }

    @ObfuscatedName("ai.o(Ldt;B)V")
    public void method857(class127 arg0) {
        while (true) {
            int var2 = arg0.method2659();
            if (var2 == 0) {
                return;
            }
            this.method858(arg0, var2);
        }
    }

    @ObfuscatedName("ai.n(Ldt;IB)V")
    public void method858(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field992 = arg0.method2652();
        } else if (arg1 == 2) {
            this.field994 = arg0.method2490();
        } else if (arg1 == 4) {
            this.field999 = arg0.method2652();
        } else if (arg1 == 5) {
            this.field1000 = arg0.method2652();
        } else if (arg1 == 6) {
            this.field1001 = arg0.method2652();
        } else if (arg1 == 7) {
            this.field1003 = arg0.method2652();
            if (this.field1003 > 32767) {
                this.field1003 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1018 = arg0.method2652();
            if (this.field1018 > 32767) {
                this.field1018 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1005 = 1;
        } else if (arg1 == 12) {
            this.field1006 = arg0.method2551();
        } else if (arg1 == 16) {
            this.field1007 = true;
        } else if (arg1 == 23) {
            this.field1010 = arg0.method2652();
            this.field1022 = arg0.method2659();
        } else if (arg1 == 24) {
            this.field1011 = arg0.method2652();
        } else if (arg1 == 25) {
            this.field1004 = arg0.method2652();
            this.field1015 = arg0.method2659();
        } else if (arg1 == 26) {
            this.field1019 = arg0.method2652();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1008[arg1 - 30] = arg0.method2490();
            if (this.field1008[arg1 - 30].equalsIgnoreCase(class134.field2091)) {
                this.field1008[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field988[arg1 - 35] = arg0.method2490();
        } else if (arg1 == 40) {
            int var3 = arg0.method2659();
            this.field995 = new short[var3];
            this.field996 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field995[var4] = (short) arg0.method2652();
                this.field996[var4] = (short) arg0.method2652();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2659();
            this.field997 = new short[var5];
            this.field998 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field997[var6] = (short) arg0.method2652();
                this.field998[var6] = (short) arg0.method2652();
            }
        } else if (arg1 == 78) {
            this.field1016 = arg0.method2652();
        } else if (arg1 == 79) {
            this.field1017 = arg0.method2652();
        } else if (arg1 == 90) {
            this.field1014 = arg0.method2652();
        } else if (arg1 == 91) {
            this.field1020 = arg0.method2652();
        } else if (arg1 == 92) {
            this.field1023 = arg0.method2652();
        } else if (arg1 == 93) {
            this.field1021 = arg0.method2652();
        } else if (arg1 == 95) {
            this.field1002 = arg0.method2652();
        } else if (arg1 == 97) {
            this.field993 = arg0.method2652();
        } else if (arg1 == 98) {
            this.field1025 = arg0.method2652();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1024 == null) {
                this.field1024 = new int[10];
                this.field1013 = new int[10];
            }
            this.field1024[arg1 - 100] = arg0.method2652();
            this.field1013[arg1 - 100] = arg0.method2652();
        } else if (arg1 == 110) {
            this.field1026 = arg0.method2652();
        } else if (arg1 == 111) {
            this.field1009 = arg0.method2652();
        } else if (arg1 == 112) {
            this.field1028 = arg0.method2652();
        } else if (arg1 == 113) {
            this.field1029 = arg0.method2656();
        } else if (arg1 == 114) {
            this.field1030 = arg0.method2656() * 5;
        } else if (arg1 == 115) {
            this.field1031 = arg0.method2659();
        }
    }

    @ObfuscatedName("ai.l(Lai;Lai;I)V")
    public void method859(class40 arg0, class40 arg1) {
        this.field992 = arg0.field992;
        this.field999 = arg0.field999;
        this.field1000 = arg0.field1000;
        this.field1001 = arg0.field1001;
        this.field1002 = arg0.field1002;
        this.field1003 = arg0.field1003;
        this.field1018 = arg0.field1018;
        this.field995 = arg0.field995;
        this.field996 = arg0.field996;
        this.field997 = arg0.field997;
        this.field998 = arg0.field998;
        this.field994 = arg1.field994;
        this.field1007 = arg1.field1007;
        this.field1006 = arg1.field1006;
        this.field1005 = 1;
    }

    @ObfuscatedName("ai.v(IB)Lcf;")
    public final class101 method860(int arg0) {
        if (this.field1024 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1013[var3] && this.field1013[var3] != 0) {
                    var2 = this.field1024[var3];
                }
            }
            if (var2 != -1) {
                return method730(var2).method860(1);
            }
        }
        class101 var4 = class101.method2078(Statics.field986, this.field992, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1026 != 128 || this.field1009 != 128 || this.field1028 != 128) {
            var4.method2148(this.field1026, this.field1009, this.field1028);
        }
        if (this.field995 != null) {
            for (int var5 = 0; var5 < this.field995.length; var5++) {
                var4.method2092(this.field995[var5], this.field996[var5]);
            }
        }
        if (this.field997 != null) {
            for (int var6 = 0; var6 < this.field997.length; var6++) {
                var4.method2093(this.field997[var6], this.field998[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ai.g(IB)Ldj;")
    public final class112 method873(int arg0) {
        if (this.field1024 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1013[var3] && this.field1013[var3] != 0) {
                    var2 = this.field1024[var3];
                }
            }
            if (var2 != -1) {
                return method730(var2).method873(1);
            }
        }
        class112 var4 = (class112) field989.method3264((long) this.field1027);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2078(Statics.field986, this.field992, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1026 != 128 || this.field1009 != 128 || this.field1028 != 128) {
            var5.method2148(this.field1026, this.field1009, this.field1028);
        }
        if (this.field995 != null) {
            for (int var6 = 0; var6 < this.field995.length; var6++) {
                var5.method2092(this.field995[var6], this.field996[var6]);
            }
        }
        if (this.field997 != null) {
            for (int var7 = 0; var7 < this.field997.length; var7++) {
                var5.method2093(this.field997[var7], this.field998[var7]);
            }
        }
        class112 var8 = var5.method2099(this.field1029 + 64, this.field1030 + 768, -50, -10, -50);
        var8.field1886 = true;
        field989.method3269(var8, (long) this.field1027);
        return var8;
    }

    @ObfuscatedName("ai.x(II)Lai;")
    public class40 method862(int arg0) {
        if (this.field1024 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1013[var3] && this.field1013[var3] != 0) {
                    var2 = this.field1024[var3];
                }
            }
            if (var2 != -1) {
                return method730(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("i.c(IIIIZI)Lcj;")
    public static final class86 method9(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class86 var7 = (class86) field990.method3264(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class40 var8 = method730(arg0);
        if (arg1 > 1 && var8.field1024 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1013[var10] && var8.field1013[var10] != 0) {
                    var9 = var8.field1024[var10];
                }
            }
            if (var9 != -1) {
                var8 = method730(var9);
            }
        }
        class112 var11 = var8.method873(1);
        if (var11 == null) {
            return null;
        }
        class86 var12 = null;
        if (var8.field1025 != -1) {
            var12 = method9(var8.field993, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1494;
        int var14 = Statics.field1491;
        int var15 = Statics.field1490;
        int[] var16 = new int[4];
        class89.method1877(var16);
        class86 var17 = new class86(36, 32);
        class89.method1839(var17.field1476, 36, 32);
        class89.method1857();
        class104.method2177();
        class104.method2164(16, 16);
        class104.field1773 = false;
        int var18 = var8.field999;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class104.field1790[var8.field1000] * var18 >> 16;
        int var20 = class104.field1791[var8.field1000] * var18 >> 16;
        var11.method2317();
        var11.method2267(0, var8.field1001, var8.field1002, var8.field1000, var8.field1003, var8.field1018 + var11.field1550 / 2 + var19, var8.field1018 + var20);
        if (arg2 >= 1) {
            var17.method1727(1);
        }
        if (arg2 >= 2) {
            var17.method1727(16777215);
        }
        if (arg3 != 0) {
            var17.method1728(arg3);
        }
        class89.method1839(var17.field1476, 36, 32);
        if (var8.field1025 != -1) {
            var12.method1780(0, 0);
        }
        if (!arg4 && (var8.field1005 == 1 || arg1 != 1) && arg1 != -1) {
            class183 var21 = Statics.field991;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class134.field2171 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class134.field2241 + "</col>";
            }
            var21.method3402(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field990.method3269(var17, var5);
        }
        class89.method1839(var13, var14, var15);
        class89.method1844(var16);
        class104.method2177();
        class104.field1773 = true;
        return var17;
    }

    @ObfuscatedName("ai.f(ZI)Z")
    public final boolean method897(boolean arg0) {
        int var2 = this.field1010;
        int var3 = this.field1011;
        int var4 = this.field1016;
        if (arg0) {
            var2 = this.field1004;
            var3 = this.field1019;
            var4 = this.field1017;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field986.method3038(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field986.method3038(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field986.method3038(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ai.r(ZB)Lcf;")
    public final class101 method864(boolean arg0) {
        int var2 = this.field1010;
        int var3 = this.field1011;
        int var4 = this.field1016;
        if (arg0) {
            var2 = this.field1004;
            var3 = this.field1019;
            var4 = this.field1017;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2078(Statics.field986, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2078(Statics.field986, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2078(Statics.field986, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1022 != 0) {
            var5.method2156(0, this.field1022, 0);
        }
        if (arg0 && this.field1015 != 0) {
            var5.method2156(0, this.field1015, 0);
        }
        if (this.field995 != null) {
            for (int var10 = 0; var10 < this.field995.length; var10++) {
                var5.method2092(this.field995[var10], this.field996[var10]);
            }
        }
        if (this.field997 != null) {
            for (int var11 = 0; var11 < this.field997.length; var11++) {
                var5.method2093(this.field997[var11], this.field998[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ai.d(ZI)Z")
    public final boolean method865(boolean arg0) {
        int var2 = this.field1014;
        int var3 = this.field1023;
        if (arg0) {
            var2 = this.field1020;
            var3 = this.field1021;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field986.method3038(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field986.method3038(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ai.a(ZI)Lcf;")
    public final class101 method875(boolean arg0) {
        int var2 = this.field1014;
        int var3 = this.field1023;
        if (arg0) {
            var2 = this.field1020;
            var3 = this.field1021;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2078(Statics.field986, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2078(Statics.field986, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field995 != null) {
            for (int var7 = 0; var7 < this.field995.length; var7++) {
                var4.method2092(this.field995[var7], this.field996[var7]);
            }
        }
        if (this.field997 != null) {
            for (int var8 = 0; var8 < this.field997.length; var8++) {
                var4.method2093(this.field997[var8], this.field998[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ar.q(I)V")
    public static void method813() {
        field1012.method3265();
        field989.method3265();
        field990.method3265();
    }

    @ObfuscatedName("an.u(I)V")
    public static void method843() {
        field990.method3265();
    }
}
