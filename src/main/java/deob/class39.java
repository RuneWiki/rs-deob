package deob;

@ObfuscatedName("af")
public class class39 extends class173 {

    @ObfuscatedName("af.h")
    public static class169 field982 = new class169(64);

    @ObfuscatedName("af.v")
    public static class169 field979 = new class169(50);

    @ObfuscatedName("af.k")
    public static class169 field980 = new class169(100);

    @ObfuscatedName("af.n")
    public int field981;

    @ObfuscatedName("af.c")
    public int field985;

    @ObfuscatedName("af.o")
    public String field984 = "null";

    @ObfuscatedName("af.u")
    public short[] field1006;

    @ObfuscatedName("af.z")
    public short[] field986;

    @ObfuscatedName("af.e")
    public short[] field987;

    @ObfuscatedName("af.l")
    public short[] field988;

    @ObfuscatedName("af.m")
    public int field1002 = 2000;

    @ObfuscatedName("af.s")
    public int field990 = 0;

    @ObfuscatedName("af.i")
    public int field991 = 0;

    @ObfuscatedName("af.y")
    public int field983 = 0;

    @ObfuscatedName("af.d")
    public int field993 = 0;

    @ObfuscatedName("af.f")
    public int field994 = 0;

    @ObfuscatedName("af.a")
    public int field995 = 0;

    @ObfuscatedName("af.x")
    public int field999 = 1;

    @ObfuscatedName("af.r")
    public boolean field997 = false;

    @ObfuscatedName("af.t")
    public String[] field998 = new String[] { null, null, class133.field2095, null, null };

    @ObfuscatedName("af.b")
    public String[] field992 = new String[] { null, null, null, null, class133.field2092 };

    @ObfuscatedName("af.q")
    public int field1000 = -1;

    @ObfuscatedName("af.ae")
    public int field1001 = -1;

    @ObfuscatedName("af.at")
    public int field976 = 0;

    @ObfuscatedName("af.aj")
    public int field1003 = -1;

    @ObfuscatedName("af.aq")
    public int field1004 = -1;

    @ObfuscatedName("af.ac")
    public int field1005 = 0;

    @ObfuscatedName("af.az")
    public int field989 = -1;

    @ObfuscatedName("af.ao")
    public int field1007 = -1;

    @ObfuscatedName("af.am")
    public int field1008 = -1;

    @ObfuscatedName("af.ad")
    public int field1009 = -1;

    @ObfuscatedName("af.an")
    public int field1010 = -1;

    @ObfuscatedName("af.al")
    public int field1011 = -1;

    @ObfuscatedName("af.ab")
    public int[] field1012;

    @ObfuscatedName("af.af")
    public int[] field1013;

    @ObfuscatedName("af.ap")
    public int field1014 = -1;

    @ObfuscatedName("af.as")
    public int field996 = -1;

    @ObfuscatedName("af.av")
    public int field978 = 128;

    @ObfuscatedName("af.ay")
    public int field1017 = 128;

    @ObfuscatedName("af.ah")
    public int field1018 = 128;

    @ObfuscatedName("af.aa")
    public int field1019 = 0;

    @ObfuscatedName("af.ag")
    public int field1020 = 0;

    @ObfuscatedName("af.au")
    public int field1021 = 0;

    @ObfuscatedName("ba.p(II)Laf;")
    public static class39 method1244(int arg0) {
        class39 var1 = (class39) field982.method3214((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2462.method2973(10, arg0);
        class39 var3 = new class39();
        var3.field981 = arg0;
        if (var2 != null) {
            var3.method801(new class126(var2));
        }
        var3.method800();
        if (var3.field996 != -1) {
            var3.method803(method1244(var3.field996), method1244(var3.field1014));
        }
        if (!Statics.field1015 && var3.field997) {
            var3.field984 = class133.field2130;
            var3.field998 = null;
            var3.field992 = null;
            var3.field1021 = 0;
        }
        field982.method3223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.j(I)V")
    public void method800() {
    }

    @ObfuscatedName("af.w(Ldv;I)V")
    public void method801(class126 arg0) {
        while (true) {
            int var2 = arg0.method2544();
            if (var2 == 0) {
                return;
            }
            this.method816(arg0, var2);
        }
    }

    @ObfuscatedName("af.h(Ldv;IB)V")
    public void method816(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field985 = arg0.method2489();
        } else if (arg1 == 2) {
            this.field984 = arg0.method2383();
        } else if (arg1 == 4) {
            this.field1002 = arg0.method2489();
        } else if (arg1 == 5) {
            this.field990 = arg0.method2489();
        } else if (arg1 == 6) {
            this.field991 = arg0.method2489();
        } else if (arg1 == 7) {
            this.field993 = arg0.method2489();
            if (this.field993 > 32767) {
                this.field993 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field994 = arg0.method2489();
            if (this.field994 > 32767) {
                this.field994 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field995 = 1;
        } else if (arg1 == 12) {
            this.field999 = arg0.method2380();
        } else if (arg1 == 16) {
            this.field997 = true;
        } else if (arg1 == 23) {
            this.field1000 = arg0.method2489();
            this.field976 = arg0.method2544();
        } else if (arg1 == 24) {
            this.field1001 = arg0.method2489();
        } else if (arg1 == 25) {
            this.field1003 = arg0.method2489();
            this.field1005 = arg0.method2544();
        } else if (arg1 == 26) {
            this.field1004 = arg0.method2489();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field998[arg1 - 30] = arg0.method2383();
            if (this.field998[arg1 - 30].equalsIgnoreCase(class133.field2140)) {
                this.field998[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field992[arg1 - 35] = arg0.method2383();
        } else if (arg1 == 40) {
            int var3 = arg0.method2544();
            this.field1006 = new short[var3];
            this.field986 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1006[var4] = (short) arg0.method2489();
                this.field986[var4] = (short) arg0.method2489();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2544();
            this.field987 = new short[var5];
            this.field988 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field987[var6] = (short) arg0.method2489();
                this.field988[var6] = (short) arg0.method2489();
            }
        } else if (arg1 == 78) {
            this.field989 = arg0.method2489();
        } else if (arg1 == 79) {
            this.field1007 = arg0.method2489();
        } else if (arg1 == 90) {
            this.field1008 = arg0.method2489();
        } else if (arg1 == 91) {
            this.field1010 = arg0.method2489();
        } else if (arg1 == 92) {
            this.field1009 = arg0.method2489();
        } else if (arg1 == 93) {
            this.field1011 = arg0.method2489();
        } else if (arg1 == 95) {
            this.field983 = arg0.method2489();
        } else if (arg1 == 97) {
            this.field1014 = arg0.method2489();
        } else if (arg1 == 98) {
            this.field996 = arg0.method2489();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1012 == null) {
                this.field1012 = new int[10];
                this.field1013 = new int[10];
            }
            this.field1012[arg1 - 100] = arg0.method2489();
            this.field1013[arg1 - 100] = arg0.method2489();
        } else if (arg1 == 110) {
            this.field978 = arg0.method2489();
        } else if (arg1 == 111) {
            this.field1017 = arg0.method2489();
        } else if (arg1 == 112) {
            this.field1018 = arg0.method2489();
        } else if (arg1 == 113) {
            this.field1019 = arg0.method2376();
        } else if (arg1 == 114) {
            this.field1020 = arg0.method2376() * 5;
        } else if (arg1 == 115) {
            this.field1021 = arg0.method2544();
        }
    }

    @ObfuscatedName("af.v(Laf;Laf;I)V")
    public void method803(class39 arg0, class39 arg1) {
        this.field985 = arg0.field985;
        this.field1002 = arg0.field1002;
        this.field990 = arg0.field990;
        this.field991 = arg0.field991;
        this.field983 = arg0.field983;
        this.field993 = arg0.field993;
        this.field994 = arg0.field994;
        this.field1006 = arg0.field1006;
        this.field986 = arg0.field986;
        this.field987 = arg0.field987;
        this.field988 = arg0.field988;
        this.field984 = arg1.field984;
        this.field997 = arg1.field997;
        this.field999 = arg1.field999;
        this.field995 = 1;
    }

    @ObfuscatedName("af.k(II)Lcu;")
    public final class100 method804(int arg0) {
        if (this.field1012 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1013[var3] && this.field1013[var3] != 0) {
                    var2 = this.field1012[var3];
                }
            }
            if (var2 != -1) {
                return method1244(var2).method804(1);
            }
        }
        class100 var4 = class100.method1997(Statics.field1016, this.field985, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field978 != 128 || this.field1017 != 128 || this.field1018 != 128) {
            var4.method2013(this.field978, this.field1017, this.field1018);
        }
        if (this.field1006 != null) {
            for (int var5 = 0; var5 < this.field1006.length; var5++) {
                var4.method2010(this.field1006[var5], this.field986[var5]);
            }
        }
        if (this.field987 != null) {
            for (int var6 = 0; var6 < this.field987.length; var6++) {
                var4.method2011(this.field987[var6], this.field988[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("af.g(II)Ldm;")
    public final class111 method827(int arg0) {
        if (this.field1012 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1013[var3] && this.field1013[var3] != 0) {
                    var2 = this.field1012[var3];
                }
            }
            if (var2 != -1) {
                return method1244(var2).method827(1);
            }
        }
        class111 var4 = (class111) field979.method3214((long) this.field981);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method1997(Statics.field1016, this.field985, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field978 != 128 || this.field1017 != 128 || this.field1018 != 128) {
            var5.method2013(this.field978, this.field1017, this.field1018);
        }
        if (this.field1006 != null) {
            for (int var6 = 0; var6 < this.field1006.length; var6++) {
                var5.method2010(this.field1006[var6], this.field986[var6]);
            }
        }
        if (this.field987 != null) {
            for (int var7 = 0; var7 < this.field987.length; var7++) {
                var5.method2011(this.field987[var7], this.field988[var7]);
            }
        }
        class111 var8 = var5.method2042(this.field1019 + 64, this.field1020 + 768, -50, -10, -50);
        var8.field1891 = true;
        field979.method3223(var8, (long) this.field981);
        return var8;
    }

    @ObfuscatedName("af.n(II)Laf;")
    public class39 method806(int arg0) {
        if (this.field1012 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1013[var3] && this.field1013[var3] != 0) {
                    var2 = this.field1012[var3];
                }
            }
            if (var2 != -1) {
                return method1244(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("l.c(IIIIZI)Lct;")
    public static final class85 method137(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class85 var7 = (class85) field980.method3214(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class39 var8 = method1244(arg0);
        if (arg1 > 1 && var8.field1012 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1013[var10] && var8.field1013[var10] != 0) {
                    var9 = var8.field1012[var10];
                }
            }
            if (var9 != -1) {
                var8 = method1244(var9);
            }
        }
        class111 var11 = var8.method827(1);
        if (var11 == null) {
            return null;
        }
        class85 var12 = null;
        if (var8.field996 != -1) {
            var12 = method137(var8.field1014, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1493;
        int var14 = Statics.field1497;
        int var15 = Statics.field1494;
        int[] var16 = new int[4];
        class88.method1757(var16);
        class85 var17 = new class85(36, 32);
        class88.method1770(var17.field1475, 36, 32);
        class88.method1783();
        class103.method2130();
        class103.method2086(16, 16);
        class103.field1768 = false;
        int var18 = var8.field1002;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class103.field1790[var8.field990] * var18 >> 16;
        int var20 = class103.field1787[var8.field990] * var18 >> 16;
        var11.method2184();
        var11.method2210(0, var8.field991, var8.field983, var8.field990, var8.field993, var8.field994 + var11.field1558 / 2 + var19, var8.field994 + var20);
        if (arg2 >= 1) {
            var17.method1656(1);
        }
        if (arg2 >= 2) {
            var17.method1656(16777215);
        }
        if (arg3 != 0) {
            var17.method1686(arg3);
        }
        class88.method1770(var17.field1475, 36, 32);
        if (var8.field996 != -1) {
            var12.method1660(0, 0);
        }
        if (!arg4 && (var8.field995 == 1 || arg1 != 1) && arg1 != -1) {
            class182 var21 = Statics.field977;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class133.field2245 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class133.field2243 + "</col>";
            }
            var21.method3411(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field980.method3223(var17, var5);
        }
        class88.method1770(var13, var14, var15);
        class88.method1793(var16);
        class103.method2130();
        class103.field1768 = true;
        return var17;
    }

    @ObfuscatedName("af.o(ZI)Z")
    public final boolean method807(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field1001;
        int var4 = this.field989;
        if (arg0) {
            var2 = this.field1003;
            var3 = this.field1004;
            var4 = this.field1007;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1016.method2915(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1016.method2915(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1016.method2915(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("af.u(ZI)Lcu;")
    public final class100 method808(boolean arg0) {
        int var2 = this.field1000;
        int var3 = this.field1001;
        int var4 = this.field989;
        if (arg0) {
            var2 = this.field1003;
            var3 = this.field1004;
            var4 = this.field1007;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method1997(Statics.field1016, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method1997(Statics.field1016, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method1997(Statics.field1016, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field976 != 0) {
            var5.method2009(0, this.field976, 0);
        }
        if (arg0 && this.field1005 != 0) {
            var5.method2009(0, this.field1005, 0);
        }
        if (this.field1006 != null) {
            for (int var10 = 0; var10 < this.field1006.length; var10++) {
                var5.method2010(this.field1006[var10], this.field986[var10]);
            }
        }
        if (this.field987 != null) {
            for (int var11 = 0; var11 < this.field987.length; var11++) {
                var5.method2011(this.field987[var11], this.field988[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("af.z(ZI)Z")
    public final boolean method809(boolean arg0) {
        int var2 = this.field1008;
        int var3 = this.field1009;
        if (arg0) {
            var2 = this.field1010;
            var3 = this.field1011;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1016.method2915(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1016.method2915(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("af.e(ZI)Lcu;")
    public final class100 method818(boolean arg0) {
        int var2 = this.field1008;
        int var3 = this.field1009;
        if (arg0) {
            var2 = this.field1010;
            var3 = this.field1011;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method1997(Statics.field1016, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method1997(Statics.field1016, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1006 != null) {
            for (int var7 = 0; var7 < this.field1006.length; var7++) {
                var4.method2010(this.field1006[var7], this.field986[var7]);
            }
        }
        if (this.field987 != null) {
            for (int var8 = 0; var8 < this.field987.length; var8++) {
                var4.method2011(this.field987[var8], this.field988[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("s.l(I)V")
    public static void method149() {
        field980.method3217();
    }
}
