package deob;

@ObfuscatedName("az")
public class class42 extends class174 {

    @ObfuscatedName("az.t")
    public static class167 field982 = new class167(64);

    @ObfuscatedName("az.e")
    public static class167 field983 = new class167(50);

    @ObfuscatedName("az.a")
    public static class167 field1011 = new class167(100);

    @ObfuscatedName("az.v")
    public int field985;

    @ObfuscatedName("az.j")
    public int field986;

    @ObfuscatedName("az.k")
    public String field987 = "null";

    @ObfuscatedName("az.g")
    public short[] field992;

    @ObfuscatedName("az.d")
    public short[] field989;

    @ObfuscatedName("az.b")
    public short[] field999;

    @ObfuscatedName("az.i")
    public short[] field1018;

    @ObfuscatedName("az.o")
    public int field1020 = 2000;

    @ObfuscatedName("az.x")
    public int field993 = 0;

    @ObfuscatedName("az.m")
    public int field994 = 0;

    @ObfuscatedName("az.f")
    public int field995 = 0;

    @ObfuscatedName("az.q")
    public int field996 = 0;

    @ObfuscatedName("az.c")
    public int field997 = 0;

    @ObfuscatedName("az.h")
    public int field998 = 0;

    @ObfuscatedName("az.y")
    public int field1019 = 1;

    @ObfuscatedName("az.r")
    public boolean field1000 = false;

    @ObfuscatedName("az.w")
    public String[] field1001 = new String[] { null, null, class139.field2129, null, null };

    @ObfuscatedName("az.p")
    public String[] field1002 = new String[] { null, null, null, null, class139.field2130 };

    @ObfuscatedName("az.s")
    public int field1003 = -1;

    @ObfuscatedName("az.ag")
    public int field1004 = -1;

    @ObfuscatedName("az.ad")
    public int field1005 = 0;

    @ObfuscatedName("az.ak")
    public int field991 = -1;

    @ObfuscatedName("az.ai")
    public int field1007 = -1;

    @ObfuscatedName("az.ac")
    public int field1008 = 0;

    @ObfuscatedName("az.as")
    public int field1009 = -1;

    @ObfuscatedName("az.ar")
    public int field1010 = -1;

    @ObfuscatedName("az.an")
    public int field1017 = -1;

    @ObfuscatedName("az.ah")
    public int field1023 = -1;

    @ObfuscatedName("az.ax")
    public int field1013 = -1;

    @ObfuscatedName("az.ae")
    public int field1021 = -1;

    @ObfuscatedName("az.ao")
    public int[] field1015;

    @ObfuscatedName("az.aj")
    public int[] field1016;

    @ObfuscatedName("az.ap")
    public int field1006 = -1;

    @ObfuscatedName("az.am")
    public int field990 = -1;

    @ObfuscatedName("az.az")
    public int field1012 = 128;

    @ObfuscatedName("az.aa")
    public int field980 = 128;

    @ObfuscatedName("az.ab")
    public int field1022 = 128;

    @ObfuscatedName("az.aw")
    public int field1014 = 0;

    @ObfuscatedName("az.av")
    public int field988 = 0;

    @ObfuscatedName("az.al")
    public int field1024 = 0;

    @ObfuscatedName("b.z(Lel;Lel;ZLgs;B)V")
    public static void method172(class142 arg0, class142 arg1, boolean arg2, class183 arg3) {
        Statics.field984 = arg0;
        Statics.field685 = arg1;
        Statics.field981 = arg2;
        Statics.field984.method2755(10);
        Statics.field184 = arg3;
    }

    @ObfuscatedName("dp.n(IB)Laz;")
    public static class42 method2477(int arg0) {
        class42 var1 = (class42) field982.method3183((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field984.method2768(10, arg0);
        class42 var3 = new class42();
        var3.field985 = arg0;
        if (var2 != null) {
            var3.method848(new class104(var2));
        }
        var3.method847();
        if (var3.field990 != -1) {
            var3.method870(method2477(var3.field990), method2477(var3.field1006));
        }
        if (!Statics.field981 && var3.field1000) {
            var3.field987 = class139.field2330;
            var3.field1001 = null;
            var3.field1002 = null;
            var3.field1024 = 0;
        }
        field982.method3185(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.u(I)V")
    public void method847() {
    }

    @ObfuscatedName("az.t(Lcj;I)V")
    public void method848(class104 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method849(arg0, var2);
        }
    }

    @ObfuscatedName("az.e(Lcj;II)V")
    public void method849(class104 arg0, int arg1) {
        if (arg1 == 1) {
            this.field986 = arg0.method2206();
        } else if (arg1 == 2) {
            this.field987 = arg0.method2187();
        } else if (arg1 == 4) {
            this.field1020 = arg0.method2206();
        } else if (arg1 == 5) {
            this.field993 = arg0.method2206();
        } else if (arg1 == 6) {
            this.field994 = arg0.method2206();
        } else if (arg1 == 7) {
            this.field996 = arg0.method2206();
            if (this.field996 > 32767) {
                this.field996 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field997 = arg0.method2206();
            if (this.field997 > 32767) {
                this.field997 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field998 = 1;
        } else if (arg1 == 12) {
            this.field1019 = arg0.method2130();
        } else if (arg1 == 16) {
            this.field1000 = true;
        } else if (arg1 == 23) {
            this.field1003 = arg0.method2206();
            this.field1005 = arg0.method2257();
        } else if (arg1 == 24) {
            this.field1004 = arg0.method2206();
        } else if (arg1 == 25) {
            this.field991 = arg0.method2206();
            this.field1008 = arg0.method2257();
        } else if (arg1 == 26) {
            this.field1007 = arg0.method2206();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1001[arg1 - 30] = arg0.method2187();
            if (this.field1001[arg1 - 30].equalsIgnoreCase(class139.field2248)) {
                this.field1001[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1002[arg1 - 35] = arg0.method2187();
        } else if (arg1 == 40) {
            int var3 = arg0.method2257();
            this.field992 = new short[var3];
            this.field989 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field992[var4] = (short) arg0.method2206();
                this.field989[var4] = (short) arg0.method2206();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2257();
            this.field999 = new short[var5];
            this.field1018 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field999[var6] = (short) arg0.method2206();
                this.field1018[var6] = (short) arg0.method2206();
            }
        } else if (arg1 == 78) {
            this.field1009 = arg0.method2206();
        } else if (arg1 == 79) {
            this.field1010 = arg0.method2206();
        } else if (arg1 == 90) {
            this.field1017 = arg0.method2206();
        } else if (arg1 == 91) {
            this.field1013 = arg0.method2206();
        } else if (arg1 == 92) {
            this.field1023 = arg0.method2206();
        } else if (arg1 == 93) {
            this.field1021 = arg0.method2206();
        } else if (arg1 == 95) {
            this.field995 = arg0.method2206();
        } else if (arg1 == 97) {
            this.field1006 = arg0.method2206();
        } else if (arg1 == 98) {
            this.field990 = arg0.method2206();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1015 == null) {
                this.field1015 = new int[10];
                this.field1016 = new int[10];
            }
            this.field1015[arg1 - 100] = arg0.method2206();
            this.field1016[arg1 - 100] = arg0.method2206();
        } else if (arg1 == 110) {
            this.field1012 = arg0.method2206();
        } else if (arg1 == 111) {
            this.field980 = arg0.method2206();
        } else if (arg1 == 112) {
            this.field1022 = arg0.method2206();
        } else if (arg1 == 113) {
            this.field1014 = arg0.method2237();
        } else if (arg1 == 114) {
            this.field988 = arg0.method2237() * 5;
        } else if (arg1 == 115) {
            this.field1024 = arg0.method2257();
        }
    }

    @ObfuscatedName("az.a(Laz;Laz;I)V")
    public void method870(class42 arg0, class42 arg1) {
        this.field986 = arg0.field986;
        this.field1020 = arg0.field1020;
        this.field993 = arg0.field993;
        this.field994 = arg0.field994;
        this.field995 = arg0.field995;
        this.field996 = arg0.field996;
        this.field997 = arg0.field997;
        this.field992 = arg0.field992;
        this.field989 = arg0.field989;
        this.field999 = arg0.field999;
        this.field1018 = arg0.field1018;
        this.field987 = arg1.field987;
        this.field1000 = arg1.field1000;
        this.field1019 = arg1.field1019;
        this.field998 = 1;
    }

    @ObfuscatedName("az.l(II)Lcv;")
    public final class90 method851(int arg0) {
        if (this.field1015 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1016[var3] && this.field1016[var3] != 0) {
                    var2 = this.field1015[var3];
                }
            }
            if (var2 != -1) {
                return method2477(var2).method851(1);
            }
        }
        class90 var4 = class90.method1964(Statics.field685, this.field986, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1012 != 128 || this.field980 != 128 || this.field1022 != 128) {
            var4.method1899(this.field1012, this.field980, this.field1022);
        }
        if (this.field992 != null) {
            for (int var5 = 0; var5 < this.field992.length; var5++) {
                var4.method1909(this.field992[var5], this.field989[var5]);
            }
        }
        if (this.field999 != null) {
            for (int var6 = 0; var6 < this.field999.length; var6++) {
                var4.method1898(this.field999[var6], this.field1018[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("az.v(IB)Lcp;")
    public final class95 method871(int arg0) {
        if (this.field1015 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1016[var3] && this.field1016[var3] != 0) {
                    var2 = this.field1015[var3];
                }
            }
            if (var2 != -1) {
                return method2477(var2).method871(1);
            }
        }
        class95 var4 = (class95) field983.method3183((long) this.field985);
        if (var4 != null) {
            return var4;
        }
        class90 var5 = class90.method1964(Statics.field685, this.field986, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1012 != 128 || this.field980 != 128 || this.field1022 != 128) {
            var5.method1899(this.field1012, this.field980, this.field1022);
        }
        if (this.field992 != null) {
            for (int var6 = 0; var6 < this.field992.length; var6++) {
                var5.method1909(this.field992[var6], this.field989[var6]);
            }
        }
        if (this.field999 != null) {
            for (int var7 = 0; var7 < this.field999.length; var7++) {
                var5.method1898(this.field999[var7], this.field1018[var7]);
            }
        }
        class95 var8 = var5.method1975(this.field1014 + 64, this.field988 + 768, -50, -10, -50);
        var8.field1692 = true;
        field983.method3185(var8, (long) this.field985);
        return var8;
    }

    @ObfuscatedName("az.j(IS)Laz;")
    public class42 method872(int arg0) {
        if (this.field1015 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1016[var3] && this.field1016[var3] != 0) {
                    var2 = this.field1015[var3];
                }
            }
            if (var2 != -1) {
                return method2477(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("i.k(IIIIZB)Lbb;")
    public static final class69 method174(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class69 var7 = (class69) field1011.method3183(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class42 var8 = method2477(arg0);
        if (arg1 > 1 && var8.field1015 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1016[var10] && var8.field1016[var10] != 0) {
                    var9 = var8.field1015[var10];
                }
            }
            if (var9 != -1) {
                var8 = method2477(var9);
            }
        }
        class95 var11 = var8.method871(1);
        if (var11 == null) {
            return null;
        }
        class69 var12 = null;
        if (var8.field990 != -1) {
            var12 = method174(var8.field1006, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1283;
        int var14 = Statics.field1279;
        int var15 = Statics.field1282;
        int[] var16 = new int[4];
        class70.method1517(var16);
        class69 var17 = new class69(36, 32);
        class70.method1568(var17.field1274, 36, 32);
        class70.method1519();
        class81.method1833();
        class81.method1794(16, 16);
        class81.field1434 = false;
        int var18 = var8.field1020;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class81.field1425[var8.field993] * var18 >> 16;
        int var20 = class81.field1446[var8.field993] * var18 >> 16;
        var11.method2051();
        var11.method2003(0, var8.field994, var8.field995, var8.field993, var8.field996, var8.field997 + var11.field1315 / 2 + var19, var8.field997 + var20);
        if (arg2 >= 1) {
            var17.method1434(1);
        }
        if (arg2 >= 2) {
            var17.method1434(16777215);
        }
        if (arg3 != 0) {
            var17.method1435(arg3);
        }
        class70.method1568(var17.field1274, 36, 32);
        if (var8.field990 != -1) {
            var12.method1500(0, 0);
        }
        if (!arg4 && (var8.field998 == 1 || arg1 != 1) && arg1 != -1) {
            class183 var21 = Statics.field184;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class139.field2153 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class139.field2279 + "</col>";
            }
            var21.method3354(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1011.method3185(var17, var5);
        }
        class70.method1568(var13, var14, var15);
        class70.method1518(var16);
        class81.method1833();
        class81.field1434 = true;
        return var17;
    }

    @ObfuscatedName("az.g(ZB)Z")
    public final boolean method853(boolean arg0) {
        int var2 = this.field1003;
        int var3 = this.field1004;
        int var4 = this.field1009;
        if (arg0) {
            var2 = this.field991;
            var3 = this.field1007;
            var4 = this.field1010;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field685.method2747(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field685.method2747(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field685.method2747(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("az.d(ZB)Lcv;")
    public final class90 method855(boolean arg0) {
        int var2 = this.field1003;
        int var3 = this.field1004;
        int var4 = this.field1009;
        if (arg0) {
            var2 = this.field991;
            var3 = this.field1007;
            var4 = this.field1010;
        }
        if (var2 == -1) {
            return null;
        }
        class90 var5 = class90.method1964(Statics.field685, var2, 0);
        if (var3 != -1) {
            class90 var6 = class90.method1964(Statics.field685, var3, 0);
            if (var4 == -1) {
                class90[] var9 = new class90[] { var5, var6 };
                var5 = new class90(var9, 2);
            } else {
                class90 var7 = class90.method1964(Statics.field685, var4, 0);
                class90[] var8 = new class90[] { var5, var6, var7 };
                var5 = new class90(var8, 3);
            }
        }
        if (!arg0 && this.field1005 != 0) {
            var5.method1908(0, this.field1005, 0);
        }
        if (arg0 && this.field1008 != 0) {
            var5.method1908(0, this.field1008, 0);
        }
        if (this.field992 != null) {
            for (int var10 = 0; var10 < this.field992.length; var10++) {
                var5.method1909(this.field992[var10], this.field989[var10]);
            }
        }
        if (this.field999 != null) {
            for (int var11 = 0; var11 < this.field999.length; var11++) {
                var5.method1898(this.field999[var11], this.field1018[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("az.b(ZI)Z")
    public final boolean method856(boolean arg0) {
        int var2 = this.field1017;
        int var3 = this.field1023;
        if (arg0) {
            var2 = this.field1013;
            var3 = this.field1021;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field685.method2747(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field685.method2747(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("az.i(ZI)Lcv;")
    public final class90 method857(boolean arg0) {
        int var2 = this.field1017;
        int var3 = this.field1023;
        if (arg0) {
            var2 = this.field1013;
            var3 = this.field1021;
        }
        if (var2 == -1) {
            return null;
        }
        class90 var4 = class90.method1964(Statics.field685, var2, 0);
        if (var3 != -1) {
            class90 var5 = class90.method1964(Statics.field685, var3, 0);
            class90[] var6 = new class90[] { var4, var5 };
            var4 = new class90(var6, 2);
        }
        if (this.field992 != null) {
            for (int var7 = 0; var7 < this.field992.length; var7++) {
                var4.method1909(this.field992[var7], this.field989[var7]);
            }
        }
        if (this.field999 != null) {
            for (int var8 = 0; var8 < this.field999.length; var8++) {
                var4.method1898(this.field999[var8], this.field1018[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("y.o(I)V")
    public static void method538() {
        field982.method3193();
        field983.method3193();
        field1011.method3193();
    }

    @ObfuscatedName("k.x(I)V")
    public static void method135() {
        field1011.method3193();
    }
}
