package deob;

@ObfuscatedName("ag")
public class class42 extends class174 {

    @ObfuscatedName("ag.g")
    public static class167 field980 = new class167(64);

    @ObfuscatedName("ag.r")
    public static class167 field981 = new class167(50);

    @ObfuscatedName("ag.i")
    public static class167 field1016 = new class167(100);

    @ObfuscatedName("ag.a")
    public int field984;

    @ObfuscatedName("ag.w")
    public int field977;

    @ObfuscatedName("ag.u")
    public String field985 = "null";

    @ObfuscatedName("ag.d")
    public short[] field987;

    @ObfuscatedName("ag.t")
    public short[] field988;

    @ObfuscatedName("ag.j")
    public short[] field989;

    @ObfuscatedName("ag.q")
    public short[] field990;

    @ObfuscatedName("ag.p")
    public int field991 = 2000;

    @ObfuscatedName("ag.v")
    public int field992 = 0;

    @ObfuscatedName("ag.n")
    public int field995 = 0;

    @ObfuscatedName("ag.l")
    public int field994 = 0;

    @ObfuscatedName("ag.c")
    public int field1015 = 0;

    @ObfuscatedName("ag.b")
    public int field996 = 0;

    @ObfuscatedName("ag.s")
    public int field997 = 0;

    @ObfuscatedName("ag.o")
    public int field999 = 1;

    @ObfuscatedName("ag.h")
    public boolean field982 = false;

    @ObfuscatedName("ag.x")
    public String[] field1000 = new String[] { null, null, class139.field2122, null, null };

    @ObfuscatedName("ag.e")
    public String[] field1001 = new String[] { null, null, null, null, class139.field2170 };

    @ObfuscatedName("ag.z")
    public int field1002 = -1;

    @ObfuscatedName("ag.az")
    public int field1003 = -1;

    @ObfuscatedName("ag.av")
    public int field1004 = 0;

    @ObfuscatedName("ag.ay")
    public int field1014 = -1;

    @ObfuscatedName("ag.ah")
    public int field1006 = -1;

    @ObfuscatedName("ag.ao")
    public int field1007 = 0;

    @ObfuscatedName("ag.aj")
    public int field986 = -1;

    @ObfuscatedName("ag.ad")
    public int field1009 = -1;

    @ObfuscatedName("ag.ai")
    public int field1010 = -1;

    @ObfuscatedName("ag.af")
    public int field1011 = -1;

    @ObfuscatedName("ag.am")
    public int field1005 = -1;

    @ObfuscatedName("ag.aq")
    public int field1008 = -1;

    @ObfuscatedName("ag.ar")
    public int[] field1024;

    @ObfuscatedName("ag.an")
    public int[] field1012;

    @ObfuscatedName("ag.au")
    public int field1013 = -1;

    @ObfuscatedName("ag.aa")
    public int field979 = -1;

    @ObfuscatedName("ag.ag")
    public int field1018 = 128;

    @ObfuscatedName("ag.al")
    public int field1019 = 128;

    @ObfuscatedName("ag.ap")
    public int field1020 = 128;

    @ObfuscatedName("ag.ac")
    public int field1021 = 0;

    @ObfuscatedName("ag.ak")
    public int field1017 = 0;

    @ObfuscatedName("ag.ax")
    public int field1023 = 0;

    @ObfuscatedName("d.m(II)Lag;")
    public static class42 method124(int arg0) {
        class42 var1 = (class42) field980.method3137((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1026.method2725(10, arg0);
        class42 var3 = new class42();
        var3.field984 = arg0;
        if (var2 != null) {
            var3.method799(new class104(var2));
        }
        var3.method798();
        if (var3.field979 != -1) {
            var3.method801(method124(var3.field979), method124(var3.field1013));
        }
        if (!Statics.field993 && var3.field982) {
            var3.field985 = class139.field2345;
            var3.field1000 = null;
            var3.field1001 = null;
            var3.field1023 = 0;
        }
        field980.method3130(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.k(B)V")
    public void method798() {
    }

    @ObfuscatedName("ag.y(Lcb;B)V")
    public void method799(class104 arg0) {
        while (true) {
            int var2 = arg0.method2190();
            if (var2 == 0) {
                return;
            }
            this.method800(arg0, var2);
        }
    }

    @ObfuscatedName("ag.g(Lcb;IS)V")
    public void method800(class104 arg0, int arg1) {
        if (arg1 == 1) {
            this.field977 = arg0.method2132();
        } else if (arg1 == 2) {
            this.field985 = arg0.method2138();
        } else if (arg1 == 4) {
            this.field991 = arg0.method2132();
        } else if (arg1 == 5) {
            this.field992 = arg0.method2132();
        } else if (arg1 == 6) {
            this.field995 = arg0.method2132();
        } else if (arg1 == 7) {
            this.field1015 = arg0.method2132();
            if (this.field1015 > 32767) {
                this.field1015 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field996 = arg0.method2132();
            if (this.field996 > 32767) {
                this.field996 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field997 = 1;
        } else if (arg1 == 12) {
            this.field999 = arg0.method2135();
        } else if (arg1 == 16) {
            this.field982 = true;
        } else if (arg1 == 23) {
            this.field1002 = arg0.method2132();
            this.field1004 = arg0.method2190();
        } else if (arg1 == 24) {
            this.field1003 = arg0.method2132();
        } else if (arg1 == 25) {
            this.field1014 = arg0.method2132();
            this.field1007 = arg0.method2190();
        } else if (arg1 == 26) {
            this.field1006 = arg0.method2132();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1000[arg1 - 30] = arg0.method2138();
            if (this.field1000[arg1 - 30].equalsIgnoreCase(class139.field2124)) {
                this.field1000[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1001[arg1 - 35] = arg0.method2138();
        } else if (arg1 == 40) {
            int var3 = arg0.method2190();
            this.field987 = new short[var3];
            this.field988 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field987[var4] = (short) arg0.method2132();
                this.field988[var4] = (short) arg0.method2132();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2190();
            this.field989 = new short[var5];
            this.field990 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field989[var6] = (short) arg0.method2132();
                this.field990[var6] = (short) arg0.method2132();
            }
        } else if (arg1 == 78) {
            this.field986 = arg0.method2132();
        } else if (arg1 == 79) {
            this.field1009 = arg0.method2132();
        } else if (arg1 == 90) {
            this.field1010 = arg0.method2132();
        } else if (arg1 == 91) {
            this.field1005 = arg0.method2132();
        } else if (arg1 == 92) {
            this.field1011 = arg0.method2132();
        } else if (arg1 == 93) {
            this.field1008 = arg0.method2132();
        } else if (arg1 == 95) {
            this.field994 = arg0.method2132();
        } else if (arg1 == 97) {
            this.field1013 = arg0.method2132();
        } else if (arg1 == 98) {
            this.field979 = arg0.method2132();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1024 == null) {
                this.field1024 = new int[10];
                this.field1012 = new int[10];
            }
            this.field1024[arg1 - 100] = arg0.method2132();
            this.field1012[arg1 - 100] = arg0.method2132();
        } else if (arg1 == 110) {
            this.field1018 = arg0.method2132();
        } else if (arg1 == 111) {
            this.field1019 = arg0.method2132();
        } else if (arg1 == 112) {
            this.field1020 = arg0.method2132();
        } else if (arg1 == 113) {
            this.field1021 = arg0.method2159();
        } else if (arg1 == 114) {
            this.field1017 = arg0.method2159() * 5;
        } else if (arg1 == 115) {
            this.field1023 = arg0.method2190();
        }
    }

    @ObfuscatedName("ag.r(Lag;Lag;I)V")
    public void method801(class42 arg0, class42 arg1) {
        this.field977 = arg0.field977;
        this.field991 = arg0.field991;
        this.field992 = arg0.field992;
        this.field995 = arg0.field995;
        this.field994 = arg0.field994;
        this.field1015 = arg0.field1015;
        this.field996 = arg0.field996;
        this.field987 = arg0.field987;
        this.field988 = arg0.field988;
        this.field989 = arg0.field989;
        this.field990 = arg0.field990;
        this.field985 = arg1.field985;
        this.field982 = arg1.field982;
        this.field999 = arg1.field999;
        this.field997 = 1;
    }

    @ObfuscatedName("ag.i(IB)Lck;")
    public final class90 method850(int arg0) {
        if (this.field1024 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1012[var3] && this.field1012[var3] != 0) {
                    var2 = this.field1024[var3];
                }
            }
            if (var2 != -1) {
                return method124(var2).method850(1);
            }
        }
        class90 var4 = class90.method1944(Statics.field978, this.field977, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1018 != 128 || this.field1019 != 128 || this.field1020 != 128) {
            var4.method1921(this.field1018, this.field1019, this.field1020);
        }
        if (this.field987 != null) {
            for (int var5 = 0; var5 < this.field987.length; var5++) {
                var4.method1957(this.field987[var5], this.field988[var5]);
            }
        }
        if (this.field989 != null) {
            for (int var6 = 0; var6 < this.field989.length; var6++) {
                var4.method1910(this.field989[var6], this.field990[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ag.f(II)Lcl;")
    public final class95 method803(int arg0) {
        if (this.field1024 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1012[var3] && this.field1012[var3] != 0) {
                    var2 = this.field1024[var3];
                }
            }
            if (var2 != -1) {
                return method124(var2).method803(1);
            }
        }
        class95 var4 = (class95) field981.method3137((long) this.field984);
        if (var4 != null) {
            return var4;
        }
        class90 var5 = class90.method1944(Statics.field978, this.field977, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1018 != 128 || this.field1019 != 128 || this.field1020 != 128) {
            var5.method1921(this.field1018, this.field1019, this.field1020);
        }
        if (this.field987 != null) {
            for (int var6 = 0; var6 < this.field987.length; var6++) {
                var5.method1957(this.field987[var6], this.field988[var6]);
            }
        }
        if (this.field989 != null) {
            for (int var7 = 0; var7 < this.field989.length; var7++) {
                var5.method1910(this.field989[var7], this.field990[var7]);
            }
        }
        class95 var8 = var5.method1872(this.field1021 + 64, this.field1017 + 768, -50, -10, -50);
        var8.field1667 = true;
        field981.method3130(var8, (long) this.field984);
        return var8;
    }

    @ObfuscatedName("ag.a(IB)Lag;")
    public class42 method804(int arg0) {
        if (this.field1024 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1012[var3] && this.field1012[var3] != 0) {
                    var2 = this.field1024[var3];
                }
            }
            if (var2 != -1) {
                return method124(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("q.w(IIIIZI)Lbb;")
    public static final class69 method146(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class69 var7 = (class69) field1016.method3137(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class42 var8 = method124(arg0);
        if (arg1 > 1 && var8.field1024 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1012[var10] && var8.field1012[var10] != 0) {
                    var9 = var8.field1024[var10];
                }
            }
            if (var9 != -1) {
                var8 = method124(var9);
            }
        }
        class95 var11 = var8.method803(1);
        if (var11 == null) {
            return null;
        }
        class69 var12 = null;
        if (var8.field979 != -1) {
            var12 = method146(var8.field1013, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1278;
        int var14 = Statics.field1277;
        int var15 = Statics.field1276;
        int[] var16 = new int[4];
        class70.method1491(var16);
        class69 var17 = new class69(36, 32);
        class70.method1518(var17.field1265, 36, 32);
        class70.method1493();
        class81.method1764();
        class81.method1767(16, 16);
        class81.field1429 = false;
        int var18 = var8.field991;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class81.field1448[var8.field992] * var18 >> 16;
        int var20 = class81.field1449[var8.field992] * var18 >> 16;
        var11.method1975();
        var11.method2004(0, var8.field995, var8.field994, var8.field992, var8.field1015, var8.field996 + var11.field1315 / 2 + var19, var8.field996 + var20);
        if (arg2 >= 1) {
            var17.method1445(1);
        }
        if (arg2 >= 2) {
            var17.method1445(16777215);
        }
        if (arg3 != 0) {
            var17.method1394(arg3);
        }
        class70.method1518(var17.field1265, 36, 32);
        if (var8.field979 != -1) {
            var12.method1431(0, 0);
        }
        if (!arg4 && (var8.field997 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field983.method3277(method1968(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1016.method3130(var17, var5);
        }
        class70.method1518(var13, var14, var15);
        class70.method1492(var16);
        class81.method1764();
        class81.field1429 = true;
        return var17;
    }

    @ObfuscatedName("ca.u(II)Ljava/lang/String;")
    public static final String method1968(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class139.field2274 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class139.field2272 + "</col>";
        }
    }

    @ObfuscatedName("ag.d(ZI)Z")
    public final boolean method805(boolean arg0) {
        int var2 = this.field1002;
        int var3 = this.field1003;
        int var4 = this.field986;
        if (arg0) {
            var2 = this.field1014;
            var3 = this.field1006;
            var4 = this.field1009;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field978.method2754(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field978.method2754(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field978.method2754(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ag.t(ZI)Lck;")
    public final class90 method806(boolean arg0) {
        int var2 = this.field1002;
        int var3 = this.field1003;
        int var4 = this.field986;
        if (arg0) {
            var2 = this.field1014;
            var3 = this.field1006;
            var4 = this.field1009;
        }
        if (var2 == -1) {
            return null;
        }
        class90 var5 = class90.method1944(Statics.field978, var2, 0);
        if (var3 != -1) {
            class90 var6 = class90.method1944(Statics.field978, var3, 0);
            if (var4 == -1) {
                class90[] var9 = new class90[] { var5, var6 };
                var5 = new class90(var9, 2);
            } else {
                class90 var7 = class90.method1944(Statics.field978, var4, 0);
                class90[] var8 = new class90[] { var5, var6, var7 };
                var5 = new class90(var8, 3);
            }
        }
        if (!arg0 && this.field1004 != 0) {
            var5.method1886(0, this.field1004, 0);
        }
        if (arg0 && this.field1007 != 0) {
            var5.method1886(0, this.field1007, 0);
        }
        if (this.field987 != null) {
            for (int var10 = 0; var10 < this.field987.length; var10++) {
                var5.method1957(this.field987[var10], this.field988[var10]);
            }
        }
        if (this.field989 != null) {
            for (int var11 = 0; var11 < this.field989.length; var11++) {
                var5.method1910(this.field989[var11], this.field990[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ag.j(ZB)Z")
    public final boolean method807(boolean arg0) {
        int var2 = this.field1010;
        int var3 = this.field1011;
        if (arg0) {
            var2 = this.field1005;
            var3 = this.field1008;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field978.method2754(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field978.method2754(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ag.q(ZI)Lck;")
    public final class90 method835(boolean arg0) {
        int var2 = this.field1010;
        int var3 = this.field1011;
        if (arg0) {
            var2 = this.field1005;
            var3 = this.field1008;
        }
        if (var2 == -1) {
            return null;
        }
        class90 var4 = class90.method1944(Statics.field978, var2, 0);
        if (var3 != -1) {
            class90 var5 = class90.method1944(Statics.field978, var3, 0);
            class90[] var6 = new class90[] { var4, var5 };
            var4 = new class90(var6, 2);
        }
        if (this.field987 != null) {
            for (int var7 = 0; var7 < this.field987.length; var7++) {
                var4.method1957(this.field987[var7], this.field988[var7]);
            }
        }
        if (this.field989 != null) {
            for (int var8 = 0; var8 < this.field989.length; var8++) {
                var4.method1910(this.field989[var8], this.field990[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cb.p(B)V")
    public static void method2329() {
        field980.method3134();
        field981.method3134();
        field1016.method3134();
    }

    @ObfuscatedName("al.v(ZI)V")
    public static void method868(boolean arg0) {
        if (Statics.field993 != arg0) {
            method2329();
            Statics.field993 = arg0;
        }
    }
}
