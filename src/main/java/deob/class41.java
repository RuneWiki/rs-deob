package deob;

@ObfuscatedName("aq")
public class class41 extends class176 {

    @ObfuscatedName("aq.l")
    public static class172 field990 = new class172(64);

    @ObfuscatedName("aq.s")
    public static class172 field991 = new class172(50);

    @ObfuscatedName("aq.d")
    public static class172 field992 = new class172(100);

    @ObfuscatedName("aq.u")
    public int field1008;

    @ObfuscatedName("aq.q")
    public int field1014;

    @ObfuscatedName("aq.o")
    public String field993 = "null";

    @ObfuscatedName("aq.v")
    public short[] field1009;

    @ObfuscatedName("aq.m")
    public short[] field1023;

    @ObfuscatedName("aq.x")
    public short[] field1011;

    @ObfuscatedName("aq.w")
    public short[] field999;

    @ObfuscatedName("aq.p")
    public int field1000 = 2000;

    @ObfuscatedName("aq.z")
    public int field1001 = 0;

    @ObfuscatedName("aq.h")
    public int field1002 = 0;

    @ObfuscatedName("aq.a")
    public int field995 = 0;

    @ObfuscatedName("aq.c")
    public int field1004 = 0;

    @ObfuscatedName("aq.k")
    public int field1005 = 0;

    @ObfuscatedName("aq.n")
    public int field1006 = 0;

    @ObfuscatedName("aq.t")
    public int field1007 = 1;

    @ObfuscatedName("aq.y")
    public boolean field1025 = false;

    @ObfuscatedName("aq.g")
    public String[] field1021 = new String[] { null, null, class137.field2123, null, null };

    @ObfuscatedName("aq.f")
    public String[] field1010 = new String[] { null, null, null, null, class137.field2124 };

    @ObfuscatedName("aq.j")
    public int field997 = -1;

    @ObfuscatedName("aq.af")
    public int field988 = -1;

    @ObfuscatedName("aq.ar")
    public int field1033 = 0;

    @ObfuscatedName("aq.ax")
    public int field987 = -1;

    @ObfuscatedName("aq.at")
    public int field1015 = -1;

    @ObfuscatedName("aq.ah")
    public int field1016 = 0;

    @ObfuscatedName("aq.ap")
    public int field1017 = -1;

    @ObfuscatedName("aq.ay")
    public int field1018 = -1;

    @ObfuscatedName("aq.ag")
    public int field1019 = -1;

    @ObfuscatedName("aq.ai")
    public int field1020 = -1;

    @ObfuscatedName("aq.aw")
    public int field994 = -1;

    @ObfuscatedName("aq.am")
    public int field1022 = -1;

    @ObfuscatedName("aq.an")
    public int[] field998;

    @ObfuscatedName("aq.as")
    public int[] field1024;

    @ObfuscatedName("aq.au")
    public int field996 = -1;

    @ObfuscatedName("aq.aq")
    public int field1026 = -1;

    @ObfuscatedName("aq.ac")
    public int field1029 = 128;

    @ObfuscatedName("aq.ae")
    public int field1028 = 128;

    @ObfuscatedName("aq.ad")
    public int field1027 = 128;

    @ObfuscatedName("aq.ao")
    public int field1030 = 0;

    @ObfuscatedName("aq.aj")
    public int field1031 = 0;

    @ObfuscatedName("aq.aa")
    public int field1032 = 0;

    @ObfuscatedName("ai.i(Leg;Leg;ZLga;B)V")
    public static void method754(class155 arg0, class155 arg1, boolean arg2, class185 arg3) {
        Statics.field1003 = arg0;
        Statics.field1012 = arg1;
        Statics.field1013 = arg2;
        Statics.field1003.method3084(10);
        Statics.field743 = arg3;
    }

    @ObfuscatedName("bt.b(II)Laq;")
    public static class41 method1342(int arg0) {
        class41 var1 = (class41) field990.method3277((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1003.method3043(10, arg0);
        class41 var3 = new class41();
        var3.field1008 = arg0;
        if (var2 != null) {
            var3.method849(new class128(var2));
        }
        var3.method829();
        if (var3.field1026 != -1) {
            var3.method881(method1342(var3.field1026), method1342(var3.field996));
        }
        if (!Statics.field1013 && var3.field1025) {
            var3.field993 = class137.field2191;
            var3.field1021 = null;
            var3.field1010 = null;
            var3.field1032 = 0;
        }
        field990.method3281(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.r(I)V")
    public void method829() {
    }

    @ObfuscatedName("aq.l(Lds;I)V")
    public void method849(class128 arg0) {
        while (true) {
            int var2 = arg0.method2531();
            if (var2 == 0) {
                return;
            }
            this.method831(arg0, var2);
        }
    }

    @ObfuscatedName("aq.s(Lds;II)V")
    public void method831(class128 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1014 = arg0.method2473();
        } else if (arg1 == 2) {
            this.field993 = arg0.method2618();
        } else if (arg1 == 4) {
            this.field1000 = arg0.method2473();
        } else if (arg1 == 5) {
            this.field1001 = arg0.method2473();
        } else if (arg1 == 6) {
            this.field1002 = arg0.method2473();
        } else if (arg1 == 7) {
            this.field1004 = arg0.method2473();
            if (this.field1004 > 32767) {
                this.field1004 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1005 = arg0.method2473();
            if (this.field1005 > 32767) {
                this.field1005 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1006 = 1;
        } else if (arg1 == 12) {
            this.field1007 = arg0.method2468();
        } else if (arg1 == 16) {
            this.field1025 = true;
        } else if (arg1 == 23) {
            this.field997 = arg0.method2473();
            this.field1033 = arg0.method2531();
        } else if (arg1 == 24) {
            this.field988 = arg0.method2473();
        } else if (arg1 == 25) {
            this.field987 = arg0.method2473();
            this.field1016 = arg0.method2531();
        } else if (arg1 == 26) {
            this.field1015 = arg0.method2473();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1021[arg1 - 30] = arg0.method2618();
            if (this.field1021[arg1 - 30].equalsIgnoreCase(class137.field2125)) {
                this.field1021[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1010[arg1 - 35] = arg0.method2618();
        } else if (arg1 == 40) {
            int var3 = arg0.method2531();
            this.field1009 = new short[var3];
            this.field1023 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1009[var4] = (short) arg0.method2473();
                this.field1023[var4] = (short) arg0.method2473();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2531();
            this.field1011 = new short[var5];
            this.field999 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1011[var6] = (short) arg0.method2473();
                this.field999[var6] = (short) arg0.method2473();
            }
        } else if (arg1 == 78) {
            this.field1017 = arg0.method2473();
        } else if (arg1 == 79) {
            this.field1018 = arg0.method2473();
        } else if (arg1 == 90) {
            this.field1019 = arg0.method2473();
        } else if (arg1 == 91) {
            this.field994 = arg0.method2473();
        } else if (arg1 == 92) {
            this.field1020 = arg0.method2473();
        } else if (arg1 == 93) {
            this.field1022 = arg0.method2473();
        } else if (arg1 == 95) {
            this.field995 = arg0.method2473();
        } else if (arg1 == 97) {
            this.field996 = arg0.method2473();
        } else if (arg1 == 98) {
            this.field1026 = arg0.method2473();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field998 == null) {
                this.field998 = new int[10];
                this.field1024 = new int[10];
            }
            this.field998[arg1 - 100] = arg0.method2473();
            this.field1024[arg1 - 100] = arg0.method2473();
        } else if (arg1 == 110) {
            this.field1029 = arg0.method2473();
        } else if (arg1 == 111) {
            this.field1028 = arg0.method2473();
        } else if (arg1 == 112) {
            this.field1027 = arg0.method2473();
        } else if (arg1 == 113) {
            this.field1030 = arg0.method2464();
        } else if (arg1 == 114) {
            this.field1031 = arg0.method2464();
        } else if (arg1 == 115) {
            this.field1032 = arg0.method2531();
        }
    }

    @ObfuscatedName("aq.d(Laq;Laq;B)V")
    public void method881(class41 arg0, class41 arg1) {
        this.field1014 = arg0.field1014;
        this.field1000 = arg0.field1000;
        this.field1001 = arg0.field1001;
        this.field1002 = arg0.field1002;
        this.field995 = arg0.field995;
        this.field1004 = arg0.field1004;
        this.field1005 = arg0.field1005;
        this.field1009 = arg0.field1009;
        this.field1023 = arg0.field1023;
        this.field1011 = arg0.field1011;
        this.field999 = arg0.field999;
        this.field993 = arg1.field993;
        this.field1025 = arg1.field1025;
        this.field1007 = arg1.field1007;
        this.field1006 = 1;
    }

    @ObfuscatedName("aq.e(II)Lco;")
    public final class102 method855(int arg0) {
        if (this.field998 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1024[var3] && this.field1024[var3] != 0) {
                    var2 = this.field998[var3];
                }
            }
            if (var2 != -1) {
                return method1342(var2).method855(1);
            }
        }
        class102 var4 = class102.method2056(Statics.field1012, this.field1014, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1029 != 128 || this.field1028 != 128 || this.field1027 != 128) {
            var4.method2072(this.field1029, this.field1028, this.field1027);
        }
        if (this.field1009 != null) {
            for (int var5 = 0; var5 < this.field1009.length; var5++) {
                var4.method2099(this.field1009[var5], this.field1023[var5]);
            }
        }
        if (this.field1011 != null) {
            for (int var6 = 0; var6 < this.field1011.length; var6++) {
                var4.method2075(this.field1011[var6], this.field999[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aq.u(II)Ldt;")
    public final class113 method872(int arg0) {
        if (this.field998 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1024[var3] && this.field1024[var3] != 0) {
                    var2 = this.field998[var3];
                }
            }
            if (var2 != -1) {
                return method1342(var2).method872(1);
            }
        }
        class113 var4 = (class113) field991.method3277((long) this.field1008);
        if (var4 != null) {
            return var4;
        }
        class102 var5 = class102.method2056(Statics.field1012, this.field1014, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1029 != 128 || this.field1028 != 128 || this.field1027 != 128) {
            var5.method2072(this.field1029, this.field1028, this.field1027);
        }
        if (this.field1009 != null) {
            for (int var6 = 0; var6 < this.field1009.length; var6++) {
                var5.method2099(this.field1009[var6], this.field1023[var6]);
            }
        }
        if (this.field1011 != null) {
            for (int var7 = 0; var7 < this.field1011.length; var7++) {
                var5.method2075(this.field1011[var7], this.field999[var7]);
            }
        }
        class113 var8 = var5.method2076(this.field1030 + 64, this.field1031 * 5 + 768, -50, -10, -50);
        var8.field1888 = true;
        field991.method3281(var8, (long) this.field1008);
        return var8;
    }

    @ObfuscatedName("aq.q(II)Laq;")
    public class41 method835(int arg0) {
        if (this.field998 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1024[var3] && this.field1024[var3] != 0) {
                    var2 = this.field998[var3];
                }
            }
            if (var2 != -1) {
                return method1342(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("t.o(IIIIZI)Lcz;")
    public static final class87 method234(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class87 var7 = (class87) field992.method3277(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class41 var8 = method1342(arg0);
        if (arg1 > 1 && var8.field998 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1024[var10] && var8.field1024[var10] != 0) {
                    var9 = var8.field998[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1342(var9);
            }
        }
        class113 var11 = var8.method872(1);
        if (var11 == null) {
            return null;
        }
        class87 var12 = null;
        if (var8.field1026 != -1) {
            var12 = method234(var8.field996, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1508;
        int var14 = Statics.field1506;
        int var15 = Statics.field1507;
        int[] var16 = new int[4];
        class90.method1839(var16);
        class87 var17 = new class87(36, 32);
        class90.method1796(var17.field1484, 36, 32);
        class90.method1802();
        class105.method2139();
        class105.method2160(16, 16);
        class105.field1774 = false;
        int var18 = var8.field1000;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class105.field1794[var8.field1001] * var18 >> 16;
        int var20 = class105.field1795[var8.field1001] * var18 >> 16;
        var11.method2271();
        var11.method2315(0, var8.field1002, var8.field995, var8.field1001, var8.field1004, var8.field1005 + var11.field1564 / 2 + var19, var8.field1005 + var20);
        if (arg2 >= 1) {
            var17.method1694(1);
        }
        if (arg2 >= 2) {
            var17.method1694(16777215);
        }
        if (arg3 != 0) {
            var17.method1695(arg3);
        }
        class90.method1796(var17.field1484, 36, 32);
        if (var8.field1026 != -1) {
            var12.method1747(0, 0);
        }
        if (!arg4 && (var8.field1006 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field743.method3398(method237(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field992.method3281(var17, var5);
        }
        class90.method1796(var13, var14, var15);
        class90.method1801(var16);
        class105.method2139();
        class105.field1774 = true;
        return var17;
    }

    @ObfuscatedName("y.v(II)Ljava/lang/String;")
    public static final String method237(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class137.field2275 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class137.field2273 + "</col>";
        }
    }

    @ObfuscatedName("aq.m(ZI)Z")
    public final boolean method836(boolean arg0) {
        int var2 = this.field997;
        int var3 = this.field988;
        int var4 = this.field1017;
        if (arg0) {
            var2 = this.field987;
            var3 = this.field1015;
            var4 = this.field1018;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1012.method3045(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1012.method3045(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1012.method3045(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aq.x(ZS)Lco;")
    public final class102 method837(boolean arg0) {
        int var2 = this.field997;
        int var3 = this.field988;
        int var4 = this.field1017;
        if (arg0) {
            var2 = this.field987;
            var3 = this.field1015;
            var4 = this.field1018;
        }
        if (var2 == -1) {
            return null;
        }
        class102 var5 = class102.method2056(Statics.field1012, var2, 0);
        if (var3 != -1) {
            class102 var6 = class102.method2056(Statics.field1012, var3, 0);
            if (var4 == -1) {
                class102[] var9 = new class102[] { var5, var6 };
                var5 = new class102(var9, 2);
            } else {
                class102 var7 = class102.method2056(Statics.field1012, var4, 0);
                class102[] var8 = new class102[] { var5, var6, var7 };
                var5 = new class102(var8, 3);
            }
        }
        if (!arg0 && this.field1033 != 0) {
            var5.method2069(0, this.field1033, 0);
        }
        if (arg0 && this.field1016 != 0) {
            var5.method2069(0, this.field1016, 0);
        }
        if (this.field1009 != null) {
            for (int var10 = 0; var10 < this.field1009.length; var10++) {
                var5.method2099(this.field1009[var10], this.field1023[var10]);
            }
        }
        if (this.field1011 != null) {
            for (int var11 = 0; var11 < this.field1011.length; var11++) {
                var5.method2075(this.field1011[var11], this.field999[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aq.w(ZI)Z")
    public final boolean method838(boolean arg0) {
        int var2 = this.field1019;
        int var3 = this.field1020;
        if (arg0) {
            var2 = this.field994;
            var3 = this.field1022;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1012.method3045(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1012.method3045(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aq.p(ZI)Lco;")
    public final class102 method839(boolean arg0) {
        int var2 = this.field1019;
        int var3 = this.field1020;
        if (arg0) {
            var2 = this.field994;
            var3 = this.field1022;
        }
        if (var2 == -1) {
            return null;
        }
        class102 var4 = class102.method2056(Statics.field1012, var2, 0);
        if (var3 != -1) {
            class102 var5 = class102.method2056(Statics.field1012, var3, 0);
            class102[] var6 = new class102[] { var4, var5 };
            var4 = new class102(var6, 2);
        }
        if (this.field1009 != null) {
            for (int var7 = 0; var7 < this.field1009.length; var7++) {
                var4.method2099(this.field1009[var7], this.field1023[var7]);
            }
        }
        if (this.field1011 != null) {
            for (int var8 = 0; var8 < this.field1011.length; var8++) {
                var4.method2075(this.field1011[var8], this.field999[var8]);
            }
        }
        return var4;
    }
}
