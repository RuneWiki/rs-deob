package deob;

@ObfuscatedName("ak")
public class class46 extends class187 {

    @ObfuscatedName("ak.e")
    public static class176 field1016 = new class176(64);

    @ObfuscatedName("ak.n")
    public static class176 field1040 = new class176(50);

    @ObfuscatedName("ak.s")
    public static class176 field1018 = new class176(100);

    @ObfuscatedName("ak.f")
    public int field1019;

    @ObfuscatedName("ak.d")
    public int field1062;

    @ObfuscatedName("ak.x")
    public String field1024 = "null";

    @ObfuscatedName("ak.o")
    public short[] field1022;

    @ObfuscatedName("ak.q")
    public short[] field1034;

    @ObfuscatedName("ak.t")
    public short[] field1020;

    @ObfuscatedName("ak.h")
    public short[] field1025;

    @ObfuscatedName("ak.u")
    public int field1026 = 2000;

    @ObfuscatedName("ak.j")
    public int field1027 = 0;

    @ObfuscatedName("ak.g")
    public int field1028 = 0;

    @ObfuscatedName("ak.y")
    public int field1033 = 0;

    @ObfuscatedName("ak.p")
    public int field1030 = 0;

    @ObfuscatedName("ak.r")
    public int field1011 = 0;

    @ObfuscatedName("ak.z")
    public int field1032 = 0;

    @ObfuscatedName("ak.c")
    public int field1048 = 1;

    @ObfuscatedName("ak.an")
    public boolean field1014 = false;

    @ObfuscatedName("ak.as")
    public String[] field1037 = new String[] { null, null, class147.field2316, null, null };

    @ObfuscatedName("ak.ah")
    public String[] field1036 = new String[] { null, null, null, null, class147.field2183 };

    @ObfuscatedName("ak.ar")
    public int field1063 = -1;

    @ObfuscatedName("ak.ae")
    public int field1038 = -1;

    @ObfuscatedName("ak.av")
    public int field1039 = 0;

    @ObfuscatedName("ak.al")
    public int field1056 = -1;

    @ObfuscatedName("ak.aq")
    public int field1041 = -1;

    @ObfuscatedName("ak.am")
    public int field1035 = 0;

    @ObfuscatedName("ak.ax")
    public int field1043 = -1;

    @ObfuscatedName("ak.az")
    public int field1044 = -1;

    @ObfuscatedName("ak.ai")
    public int field1021 = -1;

    @ObfuscatedName("ak.aa")
    public int field1046 = -1;

    @ObfuscatedName("ak.at")
    public int field1047 = -1;

    @ObfuscatedName("ak.aw")
    public int field1017 = -1;

    @ObfuscatedName("ak.ao")
    public int[] field1049;

    @ObfuscatedName("ak.ag")
    public int[] field1050;

    @ObfuscatedName("ak.ad")
    public int field1051 = -1;

    @ObfuscatedName("ak.au")
    public int field1052 = -1;

    @ObfuscatedName("ak.ak")
    public int field1053 = 128;

    @ObfuscatedName("ak.aj")
    public int field1054 = 128;

    @ObfuscatedName("ak.af")
    public int field1055 = 128;

    @ObfuscatedName("ak.ab")
    public int field1042 = 0;

    @ObfuscatedName("ak.ac")
    public int field1057 = 0;

    @ObfuscatedName("ak.ap")
    public int field1058 = 0;

    @ObfuscatedName("ak.ay")
    public boolean field1023 = false;

    @ObfuscatedName("l.a(Lek;Lek;ZLgm;I)V")
    public static void method35(class151 arg0, class151 arg1, boolean arg2, class207 arg3) {
        Statics.field1045 = arg0;
        Statics.field1015 = arg1;
        Statics.field2523 = arg2;
        Statics.field2951 = Statics.field1045.method2806(10);
        Statics.field998 = arg3;
    }

    @ObfuscatedName("aa.v(II)Lak;")
    public static class46 method740(int arg0) {
        class46 var1 = (class46) field1016.method3181((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1045.method2731(10, arg0);
        class46 var3 = new class46();
        var3.field1019 = arg0;
        if (var2 != null) {
            var3.method897(new class110(var2));
        }
        var3.method862();
        if (var3.field1052 != -1) {
            var3.method866(method740(var3.field1052), method740(var3.field1051));
        }
        if (!Statics.field2523 && var3.field1014) {
            var3.field1024 = class147.field2262;
            var3.field1023 = false;
            var3.field1037 = null;
            var3.field1036 = null;
            var3.field1058 = 0;
        }
        field1016.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.i(I)V")
    public void method862() {
    }

    @ObfuscatedName("ak.b(Ldi;I)V")
    public void method897(class110 arg0) {
        while (true) {
            int var2 = arg0.method2199();
            if (var2 == 0) {
                return;
            }
            this.method874(arg0, var2);
        }
    }

    @ObfuscatedName("ak.l(Ldi;II)V")
    public void method874(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1062 = arg0.method2282();
        } else if (arg1 == 2) {
            this.field1024 = arg0.method2139();
        } else if (arg1 == 4) {
            this.field1026 = arg0.method2282();
        } else if (arg1 == 5) {
            this.field1027 = arg0.method2282();
        } else if (arg1 == 6) {
            this.field1028 = arg0.method2282();
        } else if (arg1 == 7) {
            this.field1030 = arg0.method2282();
            if (this.field1030 > 32767) {
                this.field1030 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1011 = arg0.method2282();
            if (this.field1011 > 32767) {
                this.field1011 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1032 = 1;
        } else if (arg1 == 12) {
            this.field1048 = arg0.method2136();
        } else if (arg1 == 16) {
            this.field1014 = true;
        } else if (arg1 == 23) {
            this.field1063 = arg0.method2282();
            this.field1039 = arg0.method2199();
        } else if (arg1 == 24) {
            this.field1038 = arg0.method2282();
        } else if (arg1 == 25) {
            this.field1056 = arg0.method2282();
            this.field1035 = arg0.method2199();
        } else if (arg1 == 26) {
            this.field1041 = arg0.method2282();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1037[arg1 - 30] = arg0.method2139();
            if (this.field1037[arg1 - 30].equalsIgnoreCase(class147.field2290)) {
                this.field1037[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1036[arg1 - 35] = arg0.method2139();
        } else if (arg1 == 40) {
            int var3 = arg0.method2199();
            this.field1022 = new short[var3];
            this.field1034 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1022[var4] = (short) arg0.method2282();
                this.field1034[var4] = (short) arg0.method2282();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2199();
            this.field1020 = new short[var5];
            this.field1025 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1020[var6] = (short) arg0.method2282();
                this.field1025[var6] = (short) arg0.method2282();
            }
        } else if (arg1 == 65) {
            this.field1023 = true;
        } else if (arg1 == 78) {
            this.field1043 = arg0.method2282();
        } else if (arg1 == 79) {
            this.field1044 = arg0.method2282();
        } else if (arg1 == 90) {
            this.field1021 = arg0.method2282();
        } else if (arg1 == 91) {
            this.field1047 = arg0.method2282();
        } else if (arg1 == 92) {
            this.field1046 = arg0.method2282();
        } else if (arg1 == 93) {
            this.field1017 = arg0.method2282();
        } else if (arg1 == 95) {
            this.field1033 = arg0.method2282();
        } else if (arg1 == 97) {
            this.field1051 = arg0.method2282();
        } else if (arg1 == 98) {
            this.field1052 = arg0.method2282();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1049 == null) {
                this.field1049 = new int[10];
                this.field1050 = new int[10];
            }
            this.field1049[arg1 - 100] = arg0.method2282();
            this.field1050[arg1 - 100] = arg0.method2282();
        } else if (arg1 == 110) {
            this.field1053 = arg0.method2282();
        } else if (arg1 == 111) {
            this.field1054 = arg0.method2282();
        } else if (arg1 == 112) {
            this.field1055 = arg0.method2282();
        } else if (arg1 == 113) {
            this.field1042 = arg0.method2132();
        } else if (arg1 == 114) {
            this.field1057 = arg0.method2132() * 5;
        } else if (arg1 == 115) {
            this.field1058 = arg0.method2199();
        }
    }

    @ObfuscatedName("ak.m(Lak;Lak;I)V")
    public void method866(class46 arg0, class46 arg1) {
        this.field1062 = arg0.field1062;
        this.field1026 = arg0.field1026;
        this.field1027 = arg0.field1027;
        this.field1028 = arg0.field1028;
        this.field1033 = arg0.field1033;
        this.field1030 = arg0.field1030;
        this.field1011 = arg0.field1011;
        this.field1022 = arg0.field1022;
        this.field1034 = arg0.field1034;
        this.field1020 = arg0.field1020;
        this.field1025 = arg0.field1025;
        this.field1024 = arg1.field1024;
        this.field1014 = arg1.field1014;
        this.field1048 = arg1.field1048;
        this.field1032 = 1;
    }

    @ObfuscatedName("ak.w(II)Lcy;")
    public final class94 method884(int arg0) {
        if (this.field1049 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1050[var3] && this.field1050[var3] != 0) {
                    var2 = this.field1049[var3];
                }
            }
            if (var2 != -1) {
                return method740(var2).method884(1);
            }
        }
        class94 var4 = class94.method1882(Statics.field1015, this.field1062, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1053 != 128 || this.field1054 != 128 || this.field1055 != 128) {
            var4.method1913(this.field1053, this.field1054, this.field1055);
        }
        if (this.field1022 != null) {
            for (int var5 = 0; var5 < this.field1022.length; var5++) {
                var4.method1892(this.field1022[var5], this.field1034[var5]);
            }
        }
        if (this.field1020 != null) {
            for (int var6 = 0; var6 < this.field1020.length; var6++) {
                var4.method1907(this.field1020[var6], this.field1025[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ak.e(II)Lcl;")
    public final class99 method868(int arg0) {
        if (this.field1049 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1050[var3] && this.field1050[var3] != 0) {
                    var2 = this.field1049[var3];
                }
            }
            if (var2 != -1) {
                return method740(var2).method868(1);
            }
        }
        class99 var4 = (class99) field1040.method3181((long) this.field1019);
        if (var4 != null) {
            return var4;
        }
        class94 var5 = class94.method1882(Statics.field1015, this.field1062, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1053 != 128 || this.field1054 != 128 || this.field1055 != 128) {
            var5.method1913(this.field1053, this.field1054, this.field1055);
        }
        if (this.field1022 != null) {
            for (int var6 = 0; var6 < this.field1022.length; var6++) {
                var5.method1892(this.field1022[var6], this.field1034[var6]);
            }
        }
        if (this.field1020 != null) {
            for (int var7 = 0; var7 < this.field1020.length; var7++) {
                var5.method1907(this.field1020[var7], this.field1025[var7]);
            }
        }
        class99 var8 = var5.method1879(this.field1042 + 64, this.field1057 + 768, -50, -10, -50);
        var8.field1722 = true;
        field1040.method3183(var8, (long) this.field1019);
        return var8;
    }

    @ObfuscatedName("ak.n(II)Lak;")
    public class46 method869(int arg0) {
        if (this.field1049 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1050[var3] && this.field1050[var3] != 0) {
                    var2 = this.field1049[var3];
                }
            }
            if (var2 != -1) {
                return method740(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("al.s(IIIIIZI)Lba;")
    public static final class73 method609(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class73 var8 = (class73) field1018.method3181(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class46 var9 = method740(arg0);
        if (arg1 > 1 && var9.field1049 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1050[var11] && var9.field1050[var11] != 0) {
                    var10 = var9.field1049[var11];
                }
            }
            if (var10 != -1) {
                var9 = method740(var10);
            }
        }
        class99 var12 = var9.method868(1);
        if (var12 == null) {
            return null;
        }
        class73 var13 = null;
        if (var9.field1052 != -1) {
            var13 = method609(var9.field1051, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1318;
        int var15 = Statics.field1322;
        int var16 = Statics.field1320;
        int[] var17 = new int[4];
        class74.method1516(var17);
        class73 var18 = new class73(36, 32);
        class74.method1512(var18.field1314, 36, 32);
        class74.method1549();
        class85.method1769();
        class85.method1816(16, 16);
        class85.field1473 = false;
        int var19 = var9.field1026;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1482[var9.field1027] * var19 >> 16;
        int var21 = class85.field1483[var9.field1027] * var19 >> 16;
        var12.method1980();
        var12.method1976(0, var9.field1028, var9.field1033, var9.field1027, var9.field1030, var9.field1011 + var12.field1356 / 2 + var20, var9.field1011 + var21);
        if (arg2 >= 1) {
            var18.method1417(1);
        }
        if (arg2 >= 2) {
            var18.method1417(16777215);
        }
        if (arg3 != 0) {
            var18.method1448(arg3);
        }
        class74.method1512(var18.field1314, 36, 32);
        if (var9.field1052 != -1) {
            var13.method1503(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1032 == 1) {
            Statics.field998.method3522(method2384(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1018.method3183(var18, var6);
        }
        class74.method1512(var14, var15, var16);
        class74.method1542(var17);
        class85.method1769();
        class85.field1473 = true;
        return var18;
    }

    @ObfuscatedName("dh.k(II)Ljava/lang/String;")
    public static final String method2384(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class147.field2229 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class147.field2418 + "</col>";
        }
    }

    @ObfuscatedName("ak.f(ZB)Z")
    public final boolean method864(boolean arg0) {
        int var2 = this.field1063;
        int var3 = this.field1038;
        int var4 = this.field1043;
        if (arg0) {
            var2 = this.field1056;
            var3 = this.field1041;
            var4 = this.field1044;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1015.method2733(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1015.method2733(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1015.method2733(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ak.d(ZB)Lcy;")
    public final class94 method871(boolean arg0) {
        int var2 = this.field1063;
        int var3 = this.field1038;
        int var4 = this.field1043;
        if (arg0) {
            var2 = this.field1056;
            var3 = this.field1041;
            var4 = this.field1044;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var5 = class94.method1882(Statics.field1015, var2, 0);
        if (var3 != -1) {
            class94 var6 = class94.method1882(Statics.field1015, var3, 0);
            if (var4 == -1) {
                class94[] var9 = new class94[] { var5, var6 };
                var5 = new class94(var9, 2);
            } else {
                class94 var7 = class94.method1882(Statics.field1015, var4, 0);
                class94[] var8 = new class94[] { var5, var6, var7 };
                var5 = new class94(var8, 3);
            }
        }
        if (!arg0 && this.field1039 != 0) {
            var5.method1933(0, this.field1039, 0);
        }
        if (arg0 && this.field1035 != 0) {
            var5.method1933(0, this.field1035, 0);
        }
        if (this.field1022 != null) {
            for (int var10 = 0; var10 < this.field1022.length; var10++) {
                var5.method1892(this.field1022[var10], this.field1034[var10]);
            }
        }
        if (this.field1020 != null) {
            for (int var11 = 0; var11 < this.field1020.length; var11++) {
                var5.method1907(this.field1020[var11], this.field1025[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ak.x(ZI)Z")
    public final boolean method888(boolean arg0) {
        int var2 = this.field1021;
        int var3 = this.field1046;
        if (arg0) {
            var2 = this.field1047;
            var3 = this.field1017;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1015.method2733(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1015.method2733(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ak.o(ZI)Lcy;")
    public final class94 method873(boolean arg0) {
        int var2 = this.field1021;
        int var3 = this.field1046;
        if (arg0) {
            var2 = this.field1047;
            var3 = this.field1017;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var4 = class94.method1882(Statics.field1015, var2, 0);
        if (var3 != -1) {
            class94 var5 = class94.method1882(Statics.field1015, var3, 0);
            class94[] var6 = new class94[] { var4, var5 };
            var4 = new class94(var6, 2);
        }
        if (this.field1022 != null) {
            for (int var7 = 0; var7 < this.field1022.length; var7++) {
                var4.method1892(this.field1022[var7], this.field1034[var7]);
            }
        }
        if (this.field1020 != null) {
            for (int var8 = 0; var8 < this.field1020.length; var8++) {
                var4.method1907(this.field1020[var8], this.field1025[var8]);
            }
        }
        return var4;
    }
}
