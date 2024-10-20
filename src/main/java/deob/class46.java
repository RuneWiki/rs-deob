package deob;

@ObfuscatedName("ae")
public class class46 extends class187 {

    @ObfuscatedName("ae.o")
    public static class176 field993 = new class176(64);

    @ObfuscatedName("ae.k")
    public static class176 field994 = new class176(50);

    @ObfuscatedName("ae.s")
    public static class176 field1015 = new class176(100);

    @ObfuscatedName("ae.m")
    public int field996;

    @ObfuscatedName("ae.w")
    public int field997;

    @ObfuscatedName("ae.q")
    public String field998 = "null";

    @ObfuscatedName("ae.u")
    public short[] field999;

    @ObfuscatedName("ae.e")
    public short[] field1000;

    @ObfuscatedName("ae.b")
    public short[] field1001;

    @ObfuscatedName("ae.g")
    public short[] field1039;

    @ObfuscatedName("ae.j")
    public int field1003 = 2000;

    @ObfuscatedName("ae.a")
    public int field1041 = 0;

    @ObfuscatedName("ae.x")
    public int field1005 = 0;

    @ObfuscatedName("ae.n")
    public int field1006 = 0;

    @ObfuscatedName("ae.v")
    public int field1019 = 0;

    @ObfuscatedName("ae.l")
    public int field1004 = 0;

    @ObfuscatedName("ae.t")
    public int field1009 = 0;

    @ObfuscatedName("ae.i")
    public int field1010 = 1;

    @ObfuscatedName("ae.aw")
    public boolean field1037 = false;

    @ObfuscatedName("ae.ar")
    public String[] field990 = new String[] { null, null, class147.field2164, null, null };

    @ObfuscatedName("ae.af")
    public String[] field1013 = new String[] { null, null, null, null, class147.field2165 };

    @ObfuscatedName("ae.am")
    public int field1027 = -1;

    @ObfuscatedName("ae.ax")
    public int field1011 = -1;

    @ObfuscatedName("ae.av")
    public int field1016 = 0;

    @ObfuscatedName("ae.al")
    public int field1017 = -1;

    @ObfuscatedName("ae.ab")
    public int field1018 = -1;

    @ObfuscatedName("ae.ac")
    public int field1025 = 0;

    @ObfuscatedName("ae.aq")
    public int field1020 = -1;

    @ObfuscatedName("ae.az")
    public int field1021 = -1;

    @ObfuscatedName("ae.ah")
    public int field1022 = -1;

    @ObfuscatedName("ae.at")
    public int field1038 = -1;

    @ObfuscatedName("ae.ap")
    public int field1008 = -1;

    @ObfuscatedName("ae.as")
    public int field1014 = -1;

    @ObfuscatedName("ae.au")
    public int[] field1026;

    @ObfuscatedName("ae.ag")
    public int[] field1029;

    @ObfuscatedName("ae.an")
    public int field1024 = -1;

    @ObfuscatedName("ae.ad")
    public int field1023 = -1;

    @ObfuscatedName("ae.ae")
    public int field1030 = 128;

    @ObfuscatedName("ae.ak")
    public int field1031 = 128;

    @ObfuscatedName("ae.ay")
    public int field1032 = 128;

    @ObfuscatedName("ae.ao")
    public int field1033 = 0;

    @ObfuscatedName("ae.ai")
    public int field1034 = 0;

    @ObfuscatedName("ae.aa")
    public int field1035 = 0;

    @ObfuscatedName("ae.aj")
    public boolean field1028 = false;

    @ObfuscatedName("ae.be")
    public int field1007 = -1;

    @ObfuscatedName("ae.bi")
    public int field989 = -1;

    @ObfuscatedName("ae.y(B)V")
    public void method873() {
    }

    @ObfuscatedName("ae.d(Ldg;I)V")
    public void method874(class110 arg0) {
        while (true) {
            int var2 = arg0.method2309();
            if (var2 == 0) {
                return;
            }
            this.method875(arg0, var2);
        }
    }

    @ObfuscatedName("ae.c(Ldg;II)V")
    public void method875(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field997 = arg0.method2243();
        } else if (arg1 == 2) {
            this.field998 = arg0.method2132();
        } else if (arg1 == 4) {
            this.field1003 = arg0.method2243();
        } else if (arg1 == 5) {
            this.field1041 = arg0.method2243();
        } else if (arg1 == 6) {
            this.field1005 = arg0.method2243();
        } else if (arg1 == 7) {
            this.field1019 = arg0.method2243();
            if (this.field1019 > 32767) {
                this.field1019 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1004 = arg0.method2243();
            if (this.field1004 > 32767) {
                this.field1004 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1009 = 1;
        } else if (arg1 == 12) {
            this.field1010 = arg0.method2164();
        } else if (arg1 == 16) {
            this.field1037 = true;
        } else if (arg1 == 23) {
            this.field1027 = arg0.method2243();
            this.field1016 = arg0.method2309();
        } else if (arg1 == 24) {
            this.field1011 = arg0.method2243();
        } else if (arg1 == 25) {
            this.field1017 = arg0.method2243();
            this.field1025 = arg0.method2309();
        } else if (arg1 == 26) {
            this.field1018 = arg0.method2243();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field990[arg1 - 30] = arg0.method2132();
            if (this.field990[arg1 - 30].equalsIgnoreCase(class147.field2166)) {
                this.field990[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1013[arg1 - 35] = arg0.method2132();
        } else if (arg1 == 40) {
            int var3 = arg0.method2309();
            this.field999 = new short[var3];
            this.field1000 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field999[var4] = (short) arg0.method2243();
                this.field1000[var4] = (short) arg0.method2243();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2309();
            this.field1001 = new short[var5];
            this.field1039 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1001[var6] = (short) arg0.method2243();
                this.field1039[var6] = (short) arg0.method2243();
            }
        } else if (arg1 == 65) {
            this.field1028 = true;
        } else if (arg1 == 78) {
            this.field1020 = arg0.method2243();
        } else if (arg1 == 79) {
            this.field1021 = arg0.method2243();
        } else if (arg1 == 90) {
            this.field1022 = arg0.method2243();
        } else if (arg1 == 91) {
            this.field1008 = arg0.method2243();
        } else if (arg1 == 92) {
            this.field1038 = arg0.method2243();
        } else if (arg1 == 93) {
            this.field1014 = arg0.method2243();
        } else if (arg1 == 95) {
            this.field1006 = arg0.method2243();
        } else if (arg1 == 97) {
            this.field1024 = arg0.method2243();
        } else if (arg1 == 98) {
            this.field1023 = arg0.method2243();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1026 == null) {
                this.field1026 = new int[10];
                this.field1029 = new int[10];
            }
            this.field1026[arg1 - 100] = arg0.method2243();
            this.field1029[arg1 - 100] = arg0.method2243();
        } else if (arg1 == 110) {
            this.field1030 = arg0.method2243();
        } else if (arg1 == 111) {
            this.field1031 = arg0.method2243();
        } else if (arg1 == 112) {
            this.field1032 = arg0.method2243();
        } else if (arg1 == 113) {
            this.field1033 = arg0.method2125();
        } else if (arg1 == 114) {
            this.field1034 = arg0.method2125();
        } else if (arg1 == 115) {
            this.field1035 = arg0.method2309();
        } else if (arg1 == 139) {
            this.field1007 = arg0.method2243();
        } else if (arg1 == 140) {
            this.field989 = arg0.method2243();
        }
    }

    @ObfuscatedName("ae.r(Lae;Lae;B)V")
    public void method876(class46 arg0, class46 arg1) {
        this.field997 = arg0.field997;
        this.field1003 = arg0.field1003;
        this.field1041 = arg0.field1041;
        this.field1005 = arg0.field1005;
        this.field1006 = arg0.field1006;
        this.field1019 = arg0.field1019;
        this.field1004 = arg0.field1004;
        this.field999 = arg0.field999;
        this.field1000 = arg0.field1000;
        this.field1001 = arg0.field1001;
        this.field1039 = arg0.field1039;
        this.field998 = arg1.field998;
        this.field1037 = arg1.field1037;
        this.field1010 = arg1.field1010;
        this.field1009 = 1;
    }

    @ObfuscatedName("ae.f(Lae;Lae;B)V")
    public void method883(class46 arg0, class46 arg1) {
        this.field997 = arg0.field997;
        this.field1003 = arg0.field1003;
        this.field1041 = arg0.field1041;
        this.field1005 = arg0.field1005;
        this.field1006 = arg0.field1006;
        this.field1019 = arg0.field1019;
        this.field1004 = arg0.field1004;
        this.field999 = arg1.field999;
        this.field1000 = arg1.field1000;
        this.field1001 = arg1.field1001;
        this.field1039 = arg1.field1039;
        this.field998 = arg1.field998;
        this.field1037 = arg1.field1037;
        this.field1009 = arg1.field1009;
        this.field1027 = arg1.field1027;
        this.field1011 = arg1.field1011;
        this.field1020 = arg1.field1020;
        this.field1017 = arg1.field1017;
        this.field1018 = arg1.field1018;
        this.field1021 = arg1.field1021;
        this.field1022 = arg1.field1022;
        this.field1038 = arg1.field1038;
        this.field1008 = arg1.field1008;
        this.field1014 = arg1.field1014;
        this.field1035 = arg1.field1035;
        this.field990 = arg1.field990;
        this.field1013 = new String[5];
        if (arg1.field1013 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1013[var3] = arg1.field1013[var3];
            }
        }
        this.field1013[4] = class147.field2170;
        this.field1010 = 0;
    }

    @ObfuscatedName("ae.z(II)Lch;")
    public final class94 method878(int arg0) {
        if (this.field1026 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1029[var3] && this.field1029[var3] != 0) {
                    var2 = this.field1026[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method607(var2).method878(1);
            }
        }
        class94 var4 = class94.method1903(Statics.field1823, this.field997, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1030 != 128 || this.field1031 != 128 || this.field1032 != 128) {
            var4.method1921(this.field1030, this.field1031, this.field1032);
        }
        if (this.field999 != null) {
            for (int var5 = 0; var5 < this.field999.length; var5++) {
                var4.method1922(this.field999[var5], this.field1000[var5]);
            }
        }
        if (this.field1001 != null) {
            for (int var6 = 0; var6 < this.field1001.length; var6++) {
                var4.method1917(this.field1001[var6], this.field1039[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ae.o(IB)Lcy;")
    public final class99 method879(int arg0) {
        if (this.field1026 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1029[var3] && this.field1029[var3] != 0) {
                    var2 = this.field1026[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method607(var2).method879(1);
            }
        }
        class99 var4 = (class99) field994.method3198((long) this.field996);
        if (var4 != null) {
            return var4;
        }
        class94 var5 = class94.method1903(Statics.field1823, this.field997, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1030 != 128 || this.field1031 != 128 || this.field1032 != 128) {
            var5.method1921(this.field1030, this.field1031, this.field1032);
        }
        if (this.field999 != null) {
            for (int var6 = 0; var6 < this.field999.length; var6++) {
                var5.method1922(this.field999[var6], this.field1000[var6]);
            }
        }
        if (this.field1001 != null) {
            for (int var7 = 0; var7 < this.field1001.length; var7++) {
                var5.method1917(this.field1001[var7], this.field1039[var7]);
            }
        }
        class99 var8 = var5.method1926(this.field1033 + 64, this.field1034 * 5 + 768, -50, -10, -50);
        var8.field1714 = true;
        field994.method3193(var8, (long) this.field996);
        return var8;
    }

    @ObfuscatedName("ae.k(II)Lae;")
    public class46 method880(int arg0) {
        if (this.field1026 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1029[var3] && this.field1029[var3] != 0) {
                    var2 = this.field1026[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method607(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("gm.s(IIIIIZI)Lbq;")
    public static final class73 method3398(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class73 var8 = (class73) field1015.method3198(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class46 var9 = Statics.method607(arg0);
        if (arg1 > 1 && var9.field1026 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1029[var11] && var9.field1029[var11] != 0) {
                    var10 = var9.field1026[var11];
                }
            }
            if (var10 != -1) {
                var9 = Statics.method607(var10);
            }
        }
        class99 var12 = var9.method879(1);
        if (var12 == null) {
            return null;
        }
        class73 var13 = null;
        if (var9.field1023 != -1) {
            var13 = method3398(var9.field1024, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field989 != -1) {
            var13 = method3398(var9.field1007, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1311;
        int var15 = Statics.field1308;
        int var16 = Statics.field1309;
        int[] var17 = new int[4];
        class74.method1536(var17);
        class73 var18 = new class73(36, 32);
        class74.method1532(var18.field1295, 36, 32);
        class74.method1538();
        class85.method1803();
        class85.method1805(16, 16);
        class85.field1462 = false;
        int var19 = var9.field1003;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1470[var9.field1041] * var19 >> 16;
        int var21 = class85.field1483[var9.field1041] * var19 >> 16;
        var12.method1996();
        var12.method2008(0, var9.field1005, var9.field1006, var9.field1041, var9.field1019, var9.field1004 + var12.field1344 / 2 + var20, var9.field1004 + var21);
        if (var9.field989 != -1) {
            var13.method1463(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1459(1);
        }
        if (arg2 >= 2) {
            var18.method1459(16777215);
        }
        if (arg3 != 0) {
            var18.method1460(arg3);
        }
        class74.method1532(var18.field1295, 36, 32);
        if (var9.field1023 != -1) {
            var13.method1463(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1009 == 1) {
            Statics.field1270.method3534(method2052(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1015.method3193(var18, var6);
        }
        class74.method1532(var14, var15, var16);
        class74.method1537(var17);
        class85.method1803();
        class85.field1462 = true;
        return var18;
    }

    @ObfuscatedName("cn.h(II)Ljava/lang/String;")
    public static final String method2052(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class147.field2328 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class147.field2326 + "</col>";
        }
    }

    @ObfuscatedName("ae.m(ZI)Z")
    public final boolean method881(boolean arg0) {
        int var2 = this.field1027;
        int var3 = this.field1011;
        int var4 = this.field1020;
        if (arg0) {
            var2 = this.field1017;
            var3 = this.field1018;
            var4 = this.field1021;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1823.method2783(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1823.method2783(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1823.method2783(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ae.w(ZB)Lch;")
    public final class94 method909(boolean arg0) {
        int var2 = this.field1027;
        int var3 = this.field1011;
        int var4 = this.field1020;
        if (arg0) {
            var2 = this.field1017;
            var3 = this.field1018;
            var4 = this.field1021;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var5 = class94.method1903(Statics.field1823, var2, 0);
        if (var3 != -1) {
            class94 var6 = class94.method1903(Statics.field1823, var3, 0);
            if (var4 == -1) {
                class94[] var9 = new class94[] { var5, var6 };
                var5 = new class94(var9, 2);
            } else {
                class94 var7 = class94.method1903(Statics.field1823, var4, 0);
                class94[] var8 = new class94[] { var5, var6, var7 };
                var5 = new class94(var8, 3);
            }
        }
        if (!arg0 && this.field1016 != 0) {
            var5.method1929(0, this.field1016, 0);
        }
        if (arg0 && this.field1025 != 0) {
            var5.method1929(0, this.field1025, 0);
        }
        if (this.field999 != null) {
            for (int var10 = 0; var10 < this.field999.length; var10++) {
                var5.method1922(this.field999[var10], this.field1000[var10]);
            }
        }
        if (this.field1001 != null) {
            for (int var11 = 0; var11 < this.field1001.length; var11++) {
                var5.method1917(this.field1001[var11], this.field1039[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ae.q(ZI)Z")
    public final boolean method877(boolean arg0) {
        int var2 = this.field1022;
        int var3 = this.field1038;
        if (arg0) {
            var2 = this.field1008;
            var3 = this.field1014;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1823.method2783(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1823.method2783(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ae.u(ZI)Lch;")
    public final class94 method897(boolean arg0) {
        int var2 = this.field1022;
        int var3 = this.field1038;
        if (arg0) {
            var2 = this.field1008;
            var3 = this.field1014;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var4 = class94.method1903(Statics.field1823, var2, 0);
        if (var3 != -1) {
            class94 var5 = class94.method1903(Statics.field1823, var3, 0);
            class94[] var6 = new class94[] { var4, var5 };
            var4 = new class94(var6, 2);
        }
        if (this.field999 != null) {
            for (int var7 = 0; var7 < this.field999.length; var7++) {
                var4.method1922(this.field999[var7], this.field1000[var7]);
            }
        }
        if (this.field1001 != null) {
            for (int var8 = 0; var8 < this.field1001.length; var8++) {
                var4.method1917(this.field1001[var8], this.field1039[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ax.e(I)V")
    public static void method602() {
        field1015.method3190();
    }
}
