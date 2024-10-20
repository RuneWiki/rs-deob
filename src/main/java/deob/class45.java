package deob;

@ObfuscatedName("ag")
public class class45 extends class183 {

    @ObfuscatedName("ag.g")
    public static class172 field992 = new class172(64);

    @ObfuscatedName("ag.h")
    public static class172 field993 = new class172(50);

    @ObfuscatedName("ag.l")
    public static class172 field994 = new class172(100);

    @ObfuscatedName("ag.u")
    public int field996;

    @ObfuscatedName("ag.j")
    public int field997;

    @ObfuscatedName("ag.c")
    public String field998 = "null";

    @ObfuscatedName("ag.d")
    public short[] field999;

    @ObfuscatedName("ag.v")
    public short[] field1027;

    @ObfuscatedName("ag.n")
    public short[] field1001;

    @ObfuscatedName("ag.z")
    public short[] field1002;

    @ObfuscatedName("ag.a")
    public int field1019 = 2000;

    @ObfuscatedName("ag.t")
    public int field1004 = 0;

    @ObfuscatedName("ag.p")
    public int field1010 = 0;

    @ObfuscatedName("ag.i")
    public int field1029 = 0;

    @ObfuscatedName("ag.r")
    public int field1030 = 0;

    @ObfuscatedName("ag.w")
    public int field1008 = 0;

    @ObfuscatedName("ag.b")
    public int field991 = 0;

    @ObfuscatedName("ag.x")
    public int field989 = 1;

    @ObfuscatedName("ag.q")
    public boolean field1011 = false;

    @ObfuscatedName("ag.o")
    public String[] field1012 = new String[] { null, null, class143.field2166, null, null };

    @ObfuscatedName("ag.m")
    public String[] field1000 = new String[] { null, null, null, null, class143.field2167 };

    @ObfuscatedName("ag.f")
    public int field1014 = -1;

    @ObfuscatedName("ag.ab")
    public int field1015 = -1;

    @ObfuscatedName("ag.al")
    public int field1016 = 0;

    @ObfuscatedName("ag.an")
    public int field1017 = -1;

    @ObfuscatedName("ag.aw")
    public int field1018 = -1;

    @ObfuscatedName("ag.ar")
    public int field1006 = 0;

    @ObfuscatedName("ag.ai")
    public int field1020 = -1;

    @ObfuscatedName("ag.aj")
    public int field1021 = -1;

    @ObfuscatedName("ag.ao")
    public int field990 = -1;

    @ObfuscatedName("ag.ap")
    public int field1023 = -1;

    @ObfuscatedName("ag.as")
    public int field1024 = -1;

    @ObfuscatedName("ag.au")
    public int field1025 = -1;

    @ObfuscatedName("ag.ac")
    public int[] field1026;

    @ObfuscatedName("ag.ay")
    public int[] field1028;

    @ObfuscatedName("ag.av")
    public int field1007 = -1;

    @ObfuscatedName("ag.ak")
    public int field1005 = -1;

    @ObfuscatedName("ag.ae")
    public int field1009 = 128;

    @ObfuscatedName("ag.at")
    public int field1034 = 128;

    @ObfuscatedName("ag.az")
    public int field1032 = 128;

    @ObfuscatedName("ag.ag")
    public int field1033 = 0;

    @ObfuscatedName("ag.af")
    public int field1031 = 0;

    @ObfuscatedName("ag.am")
    public int field1035 = 0;

    @ObfuscatedName("bi.k(Lei;Lei;ZLgn;B)V")
    public static void method1422(class147 arg0, class147 arg1, boolean arg2, class194 arg3) {
        Statics.field1022 = arg0;
        Statics.field1003 = arg1;
        Statics.field1013 = arg2;
        Statics.field1022.method2739(10);
        Statics.field995 = arg3;
    }

    @ObfuscatedName("c.y(II)Lag;")
    public static class45 method114(int arg0) {
        class45 var1 = (class45) field992.method3202((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1022.method2729(10, arg0);
        class45 var3 = new class45();
        var3.field996 = arg0;
        if (var2 != null) {
            var3.method836(new class107(var2));
        }
        var3.method835();
        if (var3.field1005 != -1) {
            var3.method838(method114(var3.field1005), method114(var3.field1007));
        }
        if (!Statics.field1013 && var3.field1011) {
            var3.field998 = class143.field2296;
            var3.field1012 = null;
            var3.field1000 = null;
            var3.field1035 = 0;
        }
        field992.method3204(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.s(I)V")
    public void method835() {
    }

    @ObfuscatedName("ag.g(Ldy;S)V")
    public void method836(class107 arg0) {
        while (true) {
            int var2 = arg0.method2138();
            if (var2 == 0) {
                return;
            }
            this.method837(arg0, var2);
        }
    }

    @ObfuscatedName("ag.h(Ldy;II)V")
    public void method837(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field997 = arg0.method2239();
        } else if (arg1 == 2) {
            this.field998 = arg0.method2146();
        } else if (arg1 == 4) {
            this.field1019 = arg0.method2239();
        } else if (arg1 == 5) {
            this.field1004 = arg0.method2239();
        } else if (arg1 == 6) {
            this.field1010 = arg0.method2239();
        } else if (arg1 == 7) {
            this.field1030 = arg0.method2239();
            if (this.field1030 > 32767) {
                this.field1030 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1008 = arg0.method2239();
            if (this.field1008 > 32767) {
                this.field1008 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field991 = 1;
        } else if (arg1 == 12) {
            this.field989 = arg0.method2143();
        } else if (arg1 == 16) {
            this.field1011 = true;
        } else if (arg1 == 23) {
            this.field1014 = arg0.method2239();
            this.field1016 = arg0.method2138();
        } else if (arg1 == 24) {
            this.field1015 = arg0.method2239();
        } else if (arg1 == 25) {
            this.field1017 = arg0.method2239();
            this.field1006 = arg0.method2138();
        } else if (arg1 == 26) {
            this.field1018 = arg0.method2239();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1012[arg1 - 30] = arg0.method2146();
            if (this.field1012[arg1 - 30].equalsIgnoreCase(class143.field2221)) {
                this.field1012[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1000[arg1 - 35] = arg0.method2146();
        } else if (arg1 == 40) {
            int var3 = arg0.method2138();
            this.field999 = new short[var3];
            this.field1027 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field999[var4] = (short) arg0.method2239();
                this.field1027[var4] = (short) arg0.method2239();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2138();
            this.field1001 = new short[var5];
            this.field1002 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1001[var6] = (short) arg0.method2239();
                this.field1002[var6] = (short) arg0.method2239();
            }
        } else if (arg1 == 78) {
            this.field1020 = arg0.method2239();
        } else if (arg1 == 79) {
            this.field1021 = arg0.method2239();
        } else if (arg1 == 90) {
            this.field990 = arg0.method2239();
        } else if (arg1 == 91) {
            this.field1024 = arg0.method2239();
        } else if (arg1 == 92) {
            this.field1023 = arg0.method2239();
        } else if (arg1 == 93) {
            this.field1025 = arg0.method2239();
        } else if (arg1 == 95) {
            this.field1029 = arg0.method2239();
        } else if (arg1 == 97) {
            this.field1007 = arg0.method2239();
        } else if (arg1 == 98) {
            this.field1005 = arg0.method2239();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1026 == null) {
                this.field1026 = new int[10];
                this.field1028 = new int[10];
            }
            this.field1026[arg1 - 100] = arg0.method2239();
            this.field1028[arg1 - 100] = arg0.method2239();
        } else if (arg1 == 110) {
            this.field1009 = arg0.method2239();
        } else if (arg1 == 111) {
            this.field1034 = arg0.method2239();
        } else if (arg1 == 112) {
            this.field1032 = arg0.method2239();
        } else if (arg1 == 113) {
            this.field1033 = arg0.method2139();
        } else if (arg1 == 114) {
            this.field1031 = arg0.method2139();
        } else if (arg1 == 115) {
            this.field1035 = arg0.method2138();
        }
    }

    @ObfuscatedName("ag.l(Lag;Lag;I)V")
    public void method838(class45 arg0, class45 arg1) {
        this.field997 = arg0.field997;
        this.field1019 = arg0.field1019;
        this.field1004 = arg0.field1004;
        this.field1010 = arg0.field1010;
        this.field1029 = arg0.field1029;
        this.field1030 = arg0.field1030;
        this.field1008 = arg0.field1008;
        this.field999 = arg0.field999;
        this.field1027 = arg0.field1027;
        this.field1001 = arg0.field1001;
        this.field1002 = arg0.field1002;
        this.field998 = arg1.field998;
        this.field1011 = arg1.field1011;
        this.field989 = arg1.field989;
        this.field991 = 1;
    }

    @ObfuscatedName("ag.e(II)Lcf;")
    public final class93 method839(int arg0) {
        if (this.field1026 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1028[var3] && this.field1028[var3] != 0) {
                    var2 = this.field1026[var3];
                }
            }
            if (var2 != -1) {
                return method114(var2).method839(1);
            }
        }
        class93 var4 = class93.method1891(Statics.field1003, this.field997, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1009 != 128 || this.field1034 != 128 || this.field1032 != 128) {
            var4.method1908(this.field1009, this.field1034, this.field1032);
        }
        if (this.field999 != null) {
            for (int var5 = 0; var5 < this.field999.length; var5++) {
                var4.method1905(this.field999[var5], this.field1027[var5]);
            }
        }
        if (this.field1001 != null) {
            for (int var6 = 0; var6 < this.field1001.length; var6++) {
                var4.method1956(this.field1001[var6], this.field1002[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ag.u(II)Lck;")
    public final class98 method840(int arg0) {
        if (this.field1026 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1028[var3] && this.field1028[var3] != 0) {
                    var2 = this.field1026[var3];
                }
            }
            if (var2 != -1) {
                return method114(var2).method840(1);
            }
        }
        class98 var4 = (class98) field993.method3202((long) this.field996);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1891(Statics.field1003, this.field997, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1009 != 128 || this.field1034 != 128 || this.field1032 != 128) {
            var5.method1908(this.field1009, this.field1034, this.field1032);
        }
        if (this.field999 != null) {
            for (int var6 = 0; var6 < this.field999.length; var6++) {
                var5.method1905(this.field999[var6], this.field1027[var6]);
            }
        }
        if (this.field1001 != null) {
            for (int var7 = 0; var7 < this.field1001.length; var7++) {
                var5.method1956(this.field1001[var7], this.field1002[var7]);
            }
        }
        class98 var8 = var5.method1913(this.field1033 + 64, this.field1031 * 5 + 768, -50, -10, -50);
        var8.field1724 = true;
        field993.method3204(var8, (long) this.field996);
        return var8;
    }

    @ObfuscatedName("ag.j(IB)Lag;")
    public class45 method848(int arg0) {
        if (this.field1026 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1028[var3] && this.field1028[var3] != 0) {
                    var2 = this.field1026[var3];
                }
            }
            if (var2 != -1) {
                return method114(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ap.c(IIIIZB)Lbb;")
    public static final class72 method593(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field994.method3202(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method114(arg0);
        if (arg1 > 1 && var8.field1026 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1028[var10] && var8.field1028[var10] != 0) {
                    var9 = var8.field1026[var10];
                }
            }
            if (var9 != -1) {
                var8 = method114(var9);
            }
        }
        class98 var11 = var8.method840(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1005 != -1) {
            var12 = method593(var8.field1007, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1298;
        int var14 = Statics.field1294;
        int var15 = Statics.field1295;
        int[] var16 = new int[4];
        class73.method1514(var16);
        class72 var17 = new class72(36, 32);
        class73.method1559(var17.field1288, 36, 32);
        class73.method1561();
        class84.method1800();
        class84.method1849(16, 16);
        class84.field1452 = false;
        int var18 = var8.field1019;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1435[var8.field1004] * var18 >> 16;
        int var20 = class84.field1457[var8.field1004] * var18 >> 16;
        var11.method1991();
        var11.method1994(0, var8.field1010, var8.field1029, var8.field1004, var8.field1030, var8.field1008 + var11.field1332 / 2 + var19, var8.field1008 + var20);
        if (arg2 >= 1) {
            var17.method1435(1);
        }
        if (arg2 >= 2) {
            var17.method1435(16777215);
        }
        if (arg3 != 0) {
            var17.method1436(arg3);
        }
        class73.method1559(var17.field1288, 36, 32);
        if (var8.field1005 != -1) {
            var12.method1439(0, 0);
        }
        if (!arg4 && (var8.field991 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field995.method3405(method513(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field994.method3204(var17, var5);
        }
        class73.method1559(var13, var14, var15);
        class73.method1515(var16);
        class84.method1800();
        class84.field1452 = true;
        return var17;
    }

    @ObfuscatedName("al.d(IB)Ljava/lang/String;")
    public static final String method513(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class143.field2329 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class143.field2327 + "</col>";
        }
    }

    @ObfuscatedName("ag.v(ZI)Z")
    public final boolean method863(boolean arg0) {
        int var2 = this.field1014;
        int var3 = this.field1015;
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
        if (!Statics.field1003.method2731(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1003.method2731(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1003.method2731(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ag.n(ZB)Lcf;")
    public final class93 method864(boolean arg0) {
        int var2 = this.field1014;
        int var3 = this.field1015;
        int var4 = this.field1020;
        if (arg0) {
            var2 = this.field1017;
            var3 = this.field1018;
            var4 = this.field1021;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1891(Statics.field1003, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1891(Statics.field1003, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1891(Statics.field1003, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1016 != 0) {
            var5.method1904(0, this.field1016, 0);
        }
        if (arg0 && this.field1006 != 0) {
            var5.method1904(0, this.field1006, 0);
        }
        if (this.field999 != null) {
            for (int var10 = 0; var10 < this.field999.length; var10++) {
                var5.method1905(this.field999[var10], this.field1027[var10]);
            }
        }
        if (this.field1001 != null) {
            for (int var11 = 0; var11 < this.field1001.length; var11++) {
                var5.method1956(this.field1001[var11], this.field1002[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ag.z(ZB)Z")
    public final boolean method844(boolean arg0) {
        int var2 = this.field990;
        int var3 = this.field1023;
        if (arg0) {
            var2 = this.field1024;
            var3 = this.field1025;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1003.method2731(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1003.method2731(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ag.a(ZI)Lcf;")
    public final class93 method842(boolean arg0) {
        int var2 = this.field990;
        int var3 = this.field1023;
        if (arg0) {
            var2 = this.field1024;
            var3 = this.field1025;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1891(Statics.field1003, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1891(Statics.field1003, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field999 != null) {
            for (int var7 = 0; var7 < this.field999.length; var7++) {
                var4.method1905(this.field999[var7], this.field1027[var7]);
            }
        }
        if (this.field1001 != null) {
            for (int var8 = 0; var8 < this.field1001.length; var8++) {
                var4.method1956(this.field1001[var8], this.field1002[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("az.t(I)V")
    public static void method821() {
        field992.method3210();
        field993.method3210();
        field994.method3210();
    }

    @ObfuscatedName("j.p(I)V")
    public static void method92() {
        field994.method3210();
    }
}
