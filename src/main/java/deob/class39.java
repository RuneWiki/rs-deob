package deob;

@ObfuscatedName("ag")
public class class39 extends class173 {

    @ObfuscatedName("ag.m")
    public static class169 field964 = new class169(64);

    @ObfuscatedName("ag.n")
    public static class169 field1002 = new class169(50);

    @ObfuscatedName("ag.q")
    public static class169 field962 = new class169(100);

    @ObfuscatedName("ag.g")
    public int field967;

    @ObfuscatedName("ag.j")
    public int field968;

    @ObfuscatedName("ag.l")
    public String field969 = "null";

    @ObfuscatedName("ag.w")
    public short[] field973;

    @ObfuscatedName("ag.z")
    public short[] field971;

    @ObfuscatedName("ag.e")
    public short[] field990;

    @ObfuscatedName("ag.b")
    public short[] field970;

    @ObfuscatedName("ag.c")
    public int field974 = 2000;

    @ObfuscatedName("ag.d")
    public int field966 = 0;

    @ObfuscatedName("ag.h")
    public int field976 = 0;

    @ObfuscatedName("ag.i")
    public int field977 = 0;

    @ObfuscatedName("ag.v")
    public int field978 = 0;

    @ObfuscatedName("ag.s")
    public int field965 = 0;

    @ObfuscatedName("ag.f")
    public int field975 = 0;

    @ObfuscatedName("ag.y")
    public int field982 = 1;

    @ObfuscatedName("ag.t")
    public boolean field1001 = false;

    @ObfuscatedName("ag.r")
    public String[] field983 = new String[] { null, null, class133.field2067, null, null };

    @ObfuscatedName("ag.p")
    public String[] field984 = new String[] { null, null, null, null, class133.field2275 };

    @ObfuscatedName("ag.o")
    public int field985 = -1;

    @ObfuscatedName("ag.ax")
    public int field986 = -1;

    @ObfuscatedName("ag.aa")
    public int field987 = 0;

    @ObfuscatedName("ag.af")
    public int field988 = -1;

    @ObfuscatedName("ag.al")
    public int field989 = -1;

    @ObfuscatedName("ag.av")
    public int field979 = 0;

    @ObfuscatedName("ag.ab")
    public int field991 = -1;

    @ObfuscatedName("ag.ad")
    public int field992 = -1;

    @ObfuscatedName("ag.ai")
    public int field993 = -1;

    @ObfuscatedName("ag.ak")
    public int field994 = -1;

    @ObfuscatedName("ag.ao")
    public int field995 = -1;

    @ObfuscatedName("ag.aq")
    public int field996 = -1;

    @ObfuscatedName("ag.aj")
    public int[] field997;

    @ObfuscatedName("ag.ag")
    public int[] field998;

    @ObfuscatedName("ag.ap")
    public int field999 = -1;

    @ObfuscatedName("ag.an")
    public int field1000 = -1;

    @ObfuscatedName("ag.as")
    public int field972 = 128;

    @ObfuscatedName("ag.au")
    public int field980 = 128;

    @ObfuscatedName("ag.ay")
    public int field1003 = 128;

    @ObfuscatedName("ag.ah")
    public int field1004 = 0;

    @ObfuscatedName("ag.aw")
    public int field1005 = 0;

    @ObfuscatedName("ag.ac")
    public int field1006 = 0;

    @ObfuscatedName("aq.u(Leb;Leb;ZLfk;I)V")
    public static void method797(class151 arg0, class151 arg1, boolean arg2, class182 arg3) {
        Statics.field981 = arg0;
        Statics.field963 = arg1;
        Statics.field1257 = arg2;
        Statics.field981.method2975(10);
        Statics.field1912 = arg3;
    }

    @ObfuscatedName("ax.k(II)Lag;")
    public static class39 method525(int arg0) {
        class39 var1 = (class39) field964.method3263((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field981.method2965(10, arg0);
        class39 var3 = new class39();
        var3.field967 = arg0;
        if (var2 != null) {
            var3.method860(new class126(var2));
        }
        var3.method816();
        if (var3.field1000 != -1) {
            var3.method846(method525(var3.field1000), method525(var3.field999));
        }
        if (!Statics.field1257 && var3.field1001) {
            var3.field969 = class133.field2138;
            var3.field983 = null;
            var3.field984 = null;
            var3.field1006 = 0;
        }
        field964.method3260(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.x(B)V")
    public void method816() {
    }

    @ObfuscatedName("ag.m(Ldl;B)V")
    public void method860(class126 arg0) {
        while (true) {
            int var2 = arg0.method2559();
            if (var2 == 0) {
                return;
            }
            this.method814(arg0, var2);
        }
    }

    @ObfuscatedName("ag.n(Ldl;IB)V")
    public void method814(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field968 = arg0.method2450();
        } else if (arg1 == 2) {
            this.field969 = arg0.method2630();
        } else if (arg1 == 4) {
            this.field974 = arg0.method2450();
        } else if (arg1 == 5) {
            this.field966 = arg0.method2450();
        } else if (arg1 == 6) {
            this.field976 = arg0.method2450();
        } else if (arg1 == 7) {
            this.field978 = arg0.method2450();
            if (this.field978 > 32767) {
                this.field978 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field965 = arg0.method2450();
            if (this.field965 > 32767) {
                this.field965 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field975 = 1;
        } else if (arg1 == 12) {
            this.field982 = arg0.method2526();
        } else if (arg1 == 16) {
            this.field1001 = true;
        } else if (arg1 == 23) {
            this.field985 = arg0.method2450();
            this.field987 = arg0.method2559();
        } else if (arg1 == 24) {
            this.field986 = arg0.method2450();
        } else if (arg1 == 25) {
            this.field988 = arg0.method2450();
            this.field979 = arg0.method2559();
        } else if (arg1 == 26) {
            this.field989 = arg0.method2450();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field983[arg1 - 30] = arg0.method2630();
            if (this.field983[arg1 - 30].equalsIgnoreCase(class133.field2227)) {
                this.field983[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field984[arg1 - 35] = arg0.method2630();
        } else if (arg1 == 40) {
            int var3 = arg0.method2559();
            this.field973 = new short[var3];
            this.field971 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field973[var4] = (short) arg0.method2450();
                this.field971[var4] = (short) arg0.method2450();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2559();
            this.field990 = new short[var5];
            this.field970 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field990[var6] = (short) arg0.method2450();
                this.field970[var6] = (short) arg0.method2450();
            }
        } else if (arg1 == 78) {
            this.field991 = arg0.method2450();
        } else if (arg1 == 79) {
            this.field992 = arg0.method2450();
        } else if (arg1 == 90) {
            this.field993 = arg0.method2450();
        } else if (arg1 == 91) {
            this.field995 = arg0.method2450();
        } else if (arg1 == 92) {
            this.field994 = arg0.method2450();
        } else if (arg1 == 93) {
            this.field996 = arg0.method2450();
        } else if (arg1 == 95) {
            this.field977 = arg0.method2450();
        } else if (arg1 == 97) {
            this.field999 = arg0.method2450();
        } else if (arg1 == 98) {
            this.field1000 = arg0.method2450();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field997 == null) {
                this.field997 = new int[10];
                this.field998 = new int[10];
            }
            this.field997[arg1 - 100] = arg0.method2450();
            this.field998[arg1 - 100] = arg0.method2450();
        } else if (arg1 == 110) {
            this.field972 = arg0.method2450();
        } else if (arg1 == 111) {
            this.field980 = arg0.method2450();
        } else if (arg1 == 112) {
            this.field1003 = arg0.method2450();
        } else if (arg1 == 113) {
            this.field1004 = arg0.method2449();
        } else if (arg1 == 114) {
            this.field1005 = arg0.method2449() * 5;
        } else if (arg1 == 115) {
            this.field1006 = arg0.method2559();
        }
    }

    @ObfuscatedName("ag.q(Lag;Lag;I)V")
    public void method846(class39 arg0, class39 arg1) {
        this.field968 = arg0.field968;
        this.field974 = arg0.field974;
        this.field966 = arg0.field966;
        this.field976 = arg0.field976;
        this.field977 = arg0.field977;
        this.field978 = arg0.field978;
        this.field965 = arg0.field965;
        this.field973 = arg0.field973;
        this.field971 = arg0.field971;
        this.field990 = arg0.field990;
        this.field970 = arg0.field970;
        this.field969 = arg1.field969;
        this.field1001 = arg1.field1001;
        this.field982 = arg1.field982;
        this.field975 = 1;
    }

    @ObfuscatedName("ag.a(II)Lcj;")
    public final class100 method839(int arg0) {
        if (this.field997 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field998[var3] && this.field998[var3] != 0) {
                    var2 = this.field997[var3];
                }
            }
            if (var2 != -1) {
                return method525(var2).method839(1);
            }
        }
        class100 var4 = class100.method2044(Statics.field963, this.field968, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field972 != 128 || this.field980 != 128 || this.field1003 != 128) {
            var4.method2059(this.field972, this.field980, this.field1003);
        }
        if (this.field973 != null) {
            for (int var5 = 0; var5 < this.field973.length; var5++) {
                var4.method2107(this.field973[var5], this.field971[var5]);
            }
        }
        if (this.field990 != null) {
            for (int var6 = 0; var6 < this.field990.length; var6++) {
                var4.method2110(this.field990[var6], this.field970[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ag.g(II)Ldd;")
    public final class111 method828(int arg0) {
        if (this.field997 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field998[var3] && this.field998[var3] != 0) {
                    var2 = this.field997[var3];
                }
            }
            if (var2 != -1) {
                return method525(var2).method828(1);
            }
        }
        class111 var4 = (class111) field1002.method3263((long) this.field967);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2044(Statics.field963, this.field968, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field972 != 128 || this.field980 != 128 || this.field1003 != 128) {
            var5.method2059(this.field972, this.field980, this.field1003);
        }
        if (this.field973 != null) {
            for (int var6 = 0; var6 < this.field973.length; var6++) {
                var5.method2107(this.field973[var6], this.field971[var6]);
            }
        }
        if (this.field990 != null) {
            for (int var7 = 0; var7 < this.field990.length; var7++) {
                var5.method2110(this.field990[var7], this.field970[var7]);
            }
        }
        class111 var8 = var5.method2064(this.field1004 + 64, this.field1005 + 768, -50, -10, -50);
        var8.field1863 = true;
        field1002.method3260(var8, (long) this.field967);
        return var8;
    }

    @ObfuscatedName("ag.j(II)Lag;")
    public class39 method818(int arg0) {
        if (this.field997 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field998[var3] && this.field998[var3] != 0) {
                    var2 = this.field997[var3];
                }
            }
            if (var2 != -1) {
                return method525(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ak.l(IIIIZB)Lco;")
    public static final class85 method760(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class85 var7 = (class85) field962.method3263(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class39 var8 = method525(arg0);
        if (arg1 > 1 && var8.field997 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field998[var10] && var8.field998[var10] != 0) {
                    var9 = var8.field997[var10];
                }
            }
            if (var9 != -1) {
                var8 = method525(var9);
            }
        }
        class111 var11 = var8.method828(1);
        if (var11 == null) {
            return null;
        }
        class85 var12 = null;
        if (var8.field1000 != -1) {
            var12 = method760(var8.field999, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1466;
        int var14 = Statics.field1464;
        int var15 = Statics.field1467;
        int[] var16 = new int[4];
        class88.method1793(var16);
        class85 var17 = new class85(36, 32);
        class88.method1796(var17.field1446, 36, 32);
        class88.method1788();
        class103.method2133();
        class103.method2135(16, 16);
        class103.field1752 = false;
        int var18 = var8.field974;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class103.field1761[var8.field966] * var18 >> 16;
        int var20 = class103.field1747[var8.field966] * var18 >> 16;
        var11.method2281();
        var11.method2249(0, var8.field976, var8.field977, var8.field966, var8.field978, var8.field965 + var11.field1525 / 2 + var19, var8.field965 + var20);
        if (arg2 >= 1) {
            var17.method1682(1);
        }
        if (arg2 >= 2) {
            var17.method1682(16777215);
        }
        if (arg3 != 0) {
            var17.method1683(arg3);
        }
        class88.method1796(var17.field1446, 36, 32);
        if (var8.field1000 != -1) {
            var12.method1686(0, 0);
        }
        if (!arg4 && (var8.field975 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field1912.method3438(method1394(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field962.method3260(var17, var5);
        }
        class88.method1796(var13, var14, var15);
        class88.method1794(var16);
        class103.method2133();
        class103.field1752 = true;
        return var17;
    }

    @ObfuscatedName("bk.w(II)Ljava/lang/String;")
    public static final String method1394(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class133.field2220 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class133.field2218 + "</col>";
        }
    }

    @ObfuscatedName("ag.z(ZI)Z")
    public final boolean method819(boolean arg0) {
        int var2 = this.field985;
        int var3 = this.field986;
        int var4 = this.field991;
        if (arg0) {
            var2 = this.field988;
            var3 = this.field989;
            var4 = this.field992;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field963.method3013(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field963.method3013(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field963.method3013(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ag.e(ZI)Lcj;")
    public final class100 method827(boolean arg0) {
        int var2 = this.field985;
        int var3 = this.field986;
        int var4 = this.field991;
        if (arg0) {
            var2 = this.field988;
            var3 = this.field989;
            var4 = this.field992;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2044(Statics.field963, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2044(Statics.field963, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2044(Statics.field963, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field987 != 0) {
            var5.method2106(0, this.field987, 0);
        }
        if (arg0 && this.field979 != 0) {
            var5.method2106(0, this.field979, 0);
        }
        if (this.field973 != null) {
            for (int var10 = 0; var10 < this.field973.length; var10++) {
                var5.method2107(this.field973[var10], this.field971[var10]);
            }
        }
        if (this.field990 != null) {
            for (int var11 = 0; var11 < this.field990.length; var11++) {
                var5.method2110(this.field990[var11], this.field970[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ag.b(ZI)Z")
    public final boolean method858(boolean arg0) {
        int var2 = this.field993;
        int var3 = this.field994;
        if (arg0) {
            var2 = this.field995;
            var3 = this.field996;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field963.method3013(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field963.method3013(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ag.c(ZI)Lcj;")
    public final class100 method820(boolean arg0) {
        int var2 = this.field993;
        int var3 = this.field994;
        if (arg0) {
            var2 = this.field995;
            var3 = this.field996;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2044(Statics.field963, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2044(Statics.field963, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field973 != null) {
            for (int var7 = 0; var7 < this.field973.length; var7++) {
                var4.method2107(this.field973[var7], this.field971[var7]);
            }
        }
        if (this.field990 != null) {
            for (int var8 = 0; var8 < this.field990.length; var8++) {
                var4.method2110(this.field990[var8], this.field970[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("an.d(I)V")
    public static void method881() {
        field962.method3261();
    }
}
