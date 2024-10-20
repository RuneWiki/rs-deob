package deob;

@ObfuscatedName("ad")
public class class41 extends class176 {

    @ObfuscatedName("ad.q")
    public static class172 field998 = new class172(64);

    @ObfuscatedName("ad.j")
    public static class172 field999 = new class172(50);

    @ObfuscatedName("ad.z")
    public static class172 field1009 = new class172(100);

    @ObfuscatedName("ad.w")
    public int field1024;

    @ObfuscatedName("ad.a")
    public int field1002;

    @ObfuscatedName("ad.d")
    public String field1020 = "null";

    @ObfuscatedName("ad.u")
    public short[] field1004;

    @ObfuscatedName("ad.p")
    public short[] field1005;

    @ObfuscatedName("ad.t")
    public short[] field1038;

    @ObfuscatedName("ad.g")
    public short[] field1007;

    @ObfuscatedName("ad.o")
    public int field1008 = 2000;

    @ObfuscatedName("ad.x")
    public int field1025 = 0;

    @ObfuscatedName("ad.c")
    public int field1010 = 0;

    @ObfuscatedName("ad.b")
    public int field1011 = 0;

    @ObfuscatedName("ad.f")
    public int field1012 = 0;

    @ObfuscatedName("ad.s")
    public int field1013 = 0;

    @ObfuscatedName("ad.y")
    public int field1014 = 0;

    @ObfuscatedName("ad.r")
    public int field1015 = 1;

    @ObfuscatedName("ad.l")
    public boolean field1016 = false;

    @ObfuscatedName("ad.n")
    public String[] field996 = new String[] { null, null, class137.field2129, null, null };

    @ObfuscatedName("ad.h")
    public String[] field1003 = new String[] { null, null, null, null, class137.field2109 };

    @ObfuscatedName("ad.v")
    public int field1019 = -1;

    @ObfuscatedName("ad.ax")
    public int field1033 = -1;

    @ObfuscatedName("ad.ao")
    public int field1021 = 0;

    @ObfuscatedName("ad.al")
    public int field1022 = -1;

    @ObfuscatedName("ad.ap")
    public int field1041 = -1;

    @ObfuscatedName("ad.ak")
    public int field995 = 0;

    @ObfuscatedName("ad.aw")
    public int field1018 = -1;

    @ObfuscatedName("ad.av")
    public int field1026 = -1;

    @ObfuscatedName("ad.ah")
    public int field1001 = -1;

    @ObfuscatedName("ad.ae")
    public int field1028 = -1;

    @ObfuscatedName("ad.am")
    public int field1039 = -1;

    @ObfuscatedName("ad.aq")
    public int field997 = -1;

    @ObfuscatedName("ad.ai")
    public int[] field1031;

    @ObfuscatedName("ad.an")
    public int[] field1006;

    @ObfuscatedName("ad.aa")
    public int field1030 = -1;

    @ObfuscatedName("ad.ad")
    public int field1034 = -1;

    @ObfuscatedName("ad.az")
    public int field1035 = 128;

    @ObfuscatedName("ad.ar")
    public int field1036 = 128;

    @ObfuscatedName("ad.at")
    public int field1037 = 128;

    @ObfuscatedName("ad.af")
    public int field1023 = 0;

    @ObfuscatedName("ad.ay")
    public int field1027 = 0;

    @ObfuscatedName("ad.as")
    public int field1040 = 0;

    @ObfuscatedName("er.e(Lea;Lea;ZLgs;I)V")
    public static void method2983(class155 arg0, class155 arg1, boolean arg2, class185 arg3) {
        Statics.field1029 = arg0;
        Statics.field1000 = arg1;
        Statics.field1017 = arg2;
        Statics.field1029.method3019(10);
        Statics.field1457 = arg3;
    }

    @ObfuscatedName("ej.i(II)Lad;")
    public static class41 method2718(int arg0) {
        class41 var1 = (class41) field998.method3262((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1029.method3069(10, arg0);
        class41 var3 = new class41();
        var3.field1024 = arg0;
        if (var2 != null) {
            var3.method882(new class128(var2));
        }
        var3.method881();
        if (var3.field1034 != -1) {
            var3.method900(method2718(var3.field1034), method2718(var3.field1030));
        }
        if (!Statics.field1017 && var3.field1016) {
            var3.field1020 = class137.field2183;
            var3.field996 = null;
            var3.field1003 = null;
            var3.field1040 = 0;
        }
        field998.method3264(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.k(I)V")
    public void method881() {
    }

    @ObfuscatedName("ad.q(Ldl;I)V")
    public void method882(class128 arg0) {
        while (true) {
            int var2 = arg0.method2548();
            if (var2 == 0) {
                return;
            }
            this.method915(arg0, var2);
        }
    }

    @ObfuscatedName("ad.j(Ldl;II)V")
    public void method915(class128 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1002 = arg0.method2456();
        } else if (arg1 == 2) {
            this.field1020 = arg0.method2559();
        } else if (arg1 == 4) {
            this.field1008 = arg0.method2456();
        } else if (arg1 == 5) {
            this.field1025 = arg0.method2456();
        } else if (arg1 == 6) {
            this.field1010 = arg0.method2456();
        } else if (arg1 == 7) {
            this.field1012 = arg0.method2456();
            if (this.field1012 > 32767) {
                this.field1012 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1013 = arg0.method2456();
            if (this.field1013 > 32767) {
                this.field1013 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1014 = 1;
        } else if (arg1 == 12) {
            this.field1015 = arg0.method2592();
        } else if (arg1 == 16) {
            this.field1016 = true;
        } else if (arg1 == 23) {
            this.field1019 = arg0.method2456();
            this.field1021 = arg0.method2548();
        } else if (arg1 == 24) {
            this.field1033 = arg0.method2456();
        } else if (arg1 == 25) {
            this.field1022 = arg0.method2456();
            this.field995 = arg0.method2548();
        } else if (arg1 == 26) {
            this.field1041 = arg0.method2456();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field996[arg1 - 30] = arg0.method2559();
            if (this.field996[arg1 - 30].equalsIgnoreCase(class137.field2310)) {
                this.field996[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1003[arg1 - 35] = arg0.method2559();
        } else if (arg1 == 40) {
            int var3 = arg0.method2548();
            this.field1004 = new short[var3];
            this.field1005 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1004[var4] = (short) arg0.method2456();
                this.field1005[var4] = (short) arg0.method2456();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2548();
            this.field1038 = new short[var5];
            this.field1007 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1038[var6] = (short) arg0.method2456();
                this.field1007[var6] = (short) arg0.method2456();
            }
        } else if (arg1 == 78) {
            this.field1018 = arg0.method2456();
        } else if (arg1 == 79) {
            this.field1026 = arg0.method2456();
        } else if (arg1 == 90) {
            this.field1001 = arg0.method2456();
        } else if (arg1 == 91) {
            this.field1039 = arg0.method2456();
        } else if (arg1 == 92) {
            this.field1028 = arg0.method2456();
        } else if (arg1 == 93) {
            this.field997 = arg0.method2456();
        } else if (arg1 == 95) {
            this.field1011 = arg0.method2456();
        } else if (arg1 == 97) {
            this.field1030 = arg0.method2456();
        } else if (arg1 == 98) {
            this.field1034 = arg0.method2456();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1031 == null) {
                this.field1031 = new int[10];
                this.field1006 = new int[10];
            }
            this.field1031[arg1 - 100] = arg0.method2456();
            this.field1006[arg1 - 100] = arg0.method2456();
        } else if (arg1 == 110) {
            this.field1035 = arg0.method2456();
        } else if (arg1 == 111) {
            this.field1036 = arg0.method2456();
        } else if (arg1 == 112) {
            this.field1037 = arg0.method2456();
        } else if (arg1 == 113) {
            this.field1023 = arg0.method2455();
        } else if (arg1 == 114) {
            this.field1027 = arg0.method2455();
        } else if (arg1 == 115) {
            this.field1040 = arg0.method2548();
        }
    }

    @ObfuscatedName("ad.z(Lad;Lad;I)V")
    public void method900(class41 arg0, class41 arg1) {
        this.field1002 = arg0.field1002;
        this.field1008 = arg0.field1008;
        this.field1025 = arg0.field1025;
        this.field1010 = arg0.field1010;
        this.field1011 = arg0.field1011;
        this.field1012 = arg0.field1012;
        this.field1013 = arg0.field1013;
        this.field1004 = arg0.field1004;
        this.field1005 = arg0.field1005;
        this.field1038 = arg0.field1038;
        this.field1007 = arg0.field1007;
        this.field1020 = arg1.field1020;
        this.field1016 = arg1.field1016;
        this.field1015 = arg1.field1015;
        this.field1014 = 1;
    }

    @ObfuscatedName("ad.m(IB)Lcq;")
    public final class102 method885(int arg0) {
        if (this.field1031 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1006[var3] && this.field1006[var3] != 0) {
                    var2 = this.field1031[var3];
                }
            }
            if (var2 != -1) {
                return method2718(var2).method885(1);
            }
        }
        class102 var4 = class102.method2051(Statics.field1000, this.field1002, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1035 != 128 || this.field1036 != 128 || this.field1037 != 128) {
            var4.method2065(this.field1035, this.field1036, this.field1037);
        }
        if (this.field1004 != null) {
            for (int var5 = 0; var5 < this.field1004.length; var5++) {
                var4.method2063(this.field1004[var5], this.field1005[var5]);
            }
        }
        if (this.field1038 != null) {
            for (int var6 = 0; var6 < this.field1038.length; var6++) {
                var4.method2104(this.field1038[var6], this.field1007[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.w(IB)Ldo;")
    public final class113 method886(int arg0) {
        if (this.field1031 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1006[var3] && this.field1006[var3] != 0) {
                    var2 = this.field1031[var3];
                }
            }
            if (var2 != -1) {
                return method2718(var2).method886(1);
            }
        }
        class113 var4 = (class113) field999.method3262((long) this.field1024);
        if (var4 != null) {
            return var4;
        }
        class102 var5 = class102.method2051(Statics.field1000, this.field1002, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1035 != 128 || this.field1036 != 128 || this.field1037 != 128) {
            var5.method2065(this.field1035, this.field1036, this.field1037);
        }
        if (this.field1004 != null) {
            for (int var6 = 0; var6 < this.field1004.length; var6++) {
                var5.method2063(this.field1004[var6], this.field1005[var6]);
            }
        }
        if (this.field1038 != null) {
            for (int var7 = 0; var7 < this.field1038.length; var7++) {
                var5.method2104(this.field1038[var7], this.field1007[var7]);
            }
        }
        class113 var8 = var5.method2054(this.field1023 + 64, this.field1027 * 5 + 768, -50, -10, -50);
        var8.field1881 = true;
        field999.method3264(var8, (long) this.field1024);
        return var8;
    }

    @ObfuscatedName("ad.a(II)Lad;")
    public class41 method887(int arg0) {
        if (this.field1031 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1006[var3] && this.field1006[var3] != 0) {
                    var2 = this.field1031[var3];
                }
            }
            if (var2 != -1) {
                return method2718(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("s.d(IIIIZI)Lcw;")
    public static final class87 method198(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class87 var7 = (class87) field1009.method3262(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class41 var8 = method2718(arg0);
        if (arg1 > 1 && var8.field1031 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1006[var10] && var8.field1006[var10] != 0) {
                    var9 = var8.field1031[var10];
                }
            }
            if (var9 != -1) {
                var8 = method2718(var9);
            }
        }
        class113 var11 = var8.method886(1);
        if (var11 == null) {
            return null;
        }
        class87 var12 = null;
        if (var8.field1034 != -1) {
            var12 = method198(var8.field1030, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1481;
        int var14 = Statics.field1480;
        int var15 = Statics.field1482;
        int[] var16 = new int[4];
        class90.method1824(var16);
        class87 var17 = new class87(36, 32);
        class90.method1819(var17.field1462, 36, 32);
        class90.method1826();
        class105.method2133();
        class105.method2136(16, 16);
        class105.field1758 = false;
        int var18 = var8.field1008;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class105.field1755[var8.field1025] * var18 >> 16;
        int var20 = class105.field1765[var8.field1025] * var18 >> 16;
        var11.method2268();
        var11.method2258(0, var8.field1010, var8.field1011, var8.field1025, var8.field1012, var8.field1013 + var11.field1545 / 2 + var19, var8.field1013 + var20);
        if (arg2 >= 1) {
            var17.method1734(1);
        }
        if (arg2 >= 2) {
            var17.method1734(16777215);
        }
        if (arg3 != 0) {
            var17.method1735(arg3);
        }
        class90.method1819(var17.field1462, 36, 32);
        if (var8.field1034 != -1) {
            var12.method1738(0, 0);
        }
        if (!arg4 && (var8.field1014 == 1 || arg1 != 1) && arg1 != -1) {
            class185 var21 = Statics.field1457;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class137.field2260 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class137.field2258 + "</col>";
            }
            var21.method3429(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1009.method3264(var17, var5);
        }
        class90.method1819(var13, var14, var15);
        class90.method1825(var16);
        class105.method2133();
        class105.field1758 = true;
        return var17;
    }

    @ObfuscatedName("ad.u(ZB)Z")
    public final boolean method898(boolean arg0) {
        int var2 = this.field1019;
        int var3 = this.field1033;
        int var4 = this.field1018;
        if (arg0) {
            var2 = this.field1022;
            var3 = this.field1041;
            var4 = this.field1026;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1000.method3022(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1000.method3022(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1000.method3022(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ad.p(ZI)Lcq;")
    public final class102 method888(boolean arg0) {
        int var2 = this.field1019;
        int var3 = this.field1033;
        int var4 = this.field1018;
        if (arg0) {
            var2 = this.field1022;
            var3 = this.field1041;
            var4 = this.field1026;
        }
        if (var2 == -1) {
            return null;
        }
        class102 var5 = class102.method2051(Statics.field1000, var2, 0);
        if (var3 != -1) {
            class102 var6 = class102.method2051(Statics.field1000, var3, 0);
            if (var4 == -1) {
                class102[] var9 = new class102[] { var5, var6 };
                var5 = new class102(var9, 2);
            } else {
                class102 var7 = class102.method2051(Statics.field1000, var4, 0);
                class102[] var8 = new class102[] { var5, var6, var7 };
                var5 = new class102(var8, 3);
            }
        }
        if (!arg0 && this.field1021 != 0) {
            var5.method2077(0, this.field1021, 0);
        }
        if (arg0 && this.field995 != 0) {
            var5.method2077(0, this.field995, 0);
        }
        if (this.field1004 != null) {
            for (int var10 = 0; var10 < this.field1004.length; var10++) {
                var5.method2063(this.field1004[var10], this.field1005[var10]);
            }
        }
        if (this.field1038 != null) {
            for (int var11 = 0; var11 < this.field1038.length; var11++) {
                var5.method2104(this.field1038[var11], this.field1007[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ad.t(ZI)Z")
    public final boolean method920(boolean arg0) {
        int var2 = this.field1001;
        int var3 = this.field1028;
        if (arg0) {
            var2 = this.field1039;
            var3 = this.field997;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1000.method3022(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1000.method3022(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ad.g(ZB)Lcq;")
    public final class102 method889(boolean arg0) {
        int var2 = this.field1001;
        int var3 = this.field1028;
        if (arg0) {
            var2 = this.field1039;
            var3 = this.field997;
        }
        if (var2 == -1) {
            return null;
        }
        class102 var4 = class102.method2051(Statics.field1000, var2, 0);
        if (var3 != -1) {
            class102 var5 = class102.method2051(Statics.field1000, var3, 0);
            class102[] var6 = new class102[] { var4, var5 };
            var4 = new class102(var6, 2);
        }
        if (this.field1004 != null) {
            for (int var7 = 0; var7 < this.field1004.length; var7++) {
                var4.method2063(this.field1004[var7], this.field1005[var7]);
            }
        }
        if (this.field1038 != null) {
            for (int var8 = 0; var8 < this.field1038.length; var8++) {
                var4.method2104(this.field1038[var8], this.field1007[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("u.o(I)V")
    public static void method130() {
        field998.method3265();
        field999.method3265();
        field1009.method3265();
    }

    @ObfuscatedName("w.x(I)V")
    public static void method47() {
        field1009.method3265();
    }
}
