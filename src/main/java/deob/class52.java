package deob;

@ObfuscatedName("af")
public class class52 extends class204 {

    @ObfuscatedName("af.p")
    public static class193 field1095 = new class193(64);

    @ObfuscatedName("af.t")
    public static class193 field1096 = new class193(50);

    @ObfuscatedName("af.w")
    public static class193 field1109 = new class193(200);

    @ObfuscatedName("af.k")
    public int field1098;

    @ObfuscatedName("af.z")
    public int field1099;

    @ObfuscatedName("af.v")
    public String field1113 = "null";

    @ObfuscatedName("af.j")
    public short[] field1117;

    @ObfuscatedName("af.f")
    public short[] field1102;

    @ObfuscatedName("af.c")
    public short[] field1115;

    @ObfuscatedName("af.s")
    public short[] field1104;

    @ObfuscatedName("af.r")
    public int field1105 = 2000;

    @ObfuscatedName("af.u")
    public int field1106 = 0;

    @ObfuscatedName("af.a")
    public int field1134 = 0;

    @ObfuscatedName("af.h")
    public int field1108 = 0;

    @ObfuscatedName("af.y")
    public int field1131 = 0;

    @ObfuscatedName("af.d")
    public int field1110 = 0;

    @ObfuscatedName("af.n")
    public int field1111 = 0;

    @ObfuscatedName("af.i")
    public int field1112 = 1;

    @ObfuscatedName("af.ad")
    public boolean field1101 = false;

    @ObfuscatedName("af.aq")
    public String[] field1114 = new String[] { null, null, class157.field2298, null, null };

    @ObfuscatedName("af.ak")
    public String[] field1125 = new String[] { null, null, null, null, class157.field2299 };

    @ObfuscatedName("af.au")
    public int field1116 = -1;

    @ObfuscatedName("af.ao")
    public int field1130 = -1;

    @ObfuscatedName("af.am")
    public int field1103 = 0;

    @ObfuscatedName("af.ah")
    public int field1119 = -1;

    @ObfuscatedName("af.aj")
    public int field1093 = -1;

    @ObfuscatedName("af.ar")
    public int field1121 = 0;

    @ObfuscatedName("af.ae")
    public int field1122 = -1;

    @ObfuscatedName("af.al")
    public int field1123 = -1;

    @ObfuscatedName("af.ay")
    public int field1124 = -1;

    @ObfuscatedName("af.ag")
    public int field1136 = -1;

    @ObfuscatedName("af.ab")
    public int field1126 = -1;

    @ObfuscatedName("af.ac")
    public int field1120 = -1;

    @ObfuscatedName("af.az")
    public int[] field1128;

    @ObfuscatedName("af.as")
    public int[] field1129;

    @ObfuscatedName("af.ai")
    public int field1094 = -1;

    @ObfuscatedName("af.an")
    public int field1100 = -1;

    @ObfuscatedName("af.ap")
    public int field1132 = 128;

    @ObfuscatedName("af.aa")
    public int field1133 = 128;

    @ObfuscatedName("af.ax")
    public int field1127 = 128;

    @ObfuscatedName("af.av")
    public int field1135 = 0;

    @ObfuscatedName("af.at")
    public int field1138 = 0;

    @ObfuscatedName("af.aw")
    public int field1092 = 0;

    @ObfuscatedName("af.af")
    public boolean field1107 = false;

    @ObfuscatedName("af.bz")
    public int field1139 = -1;

    @ObfuscatedName("af.bb")
    public int field1140 = -1;

    @ObfuscatedName("aq.l(IB)Laf;")
    public static class52 method646(int arg0) {
        class52 var1 = (class52) field1095.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2895.method3050(10, arg0);
        class52 var3 = new class52();
        var3.field1098 = arg0;
        if (var2 != null) {
            var3.method1026(new class119(var2));
        }
        var3.method1035();
        if (var3.field1100 != -1) {
            var3.method1028(method646(var3.field1100), method646(var3.field1094));
        }
        if (var3.field1140 != -1) {
            var3.method1029(method646(var3.field1140), method646(var3.field1139));
        }
        if (!Statics.field575 && var3.field1101) {
            var3.field1113 = class157.field2519;
            var3.field1107 = false;
            var3.field1114 = null;
            var3.field1125 = null;
            var3.field1092 = 0;
        }
        field1095.method3479(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.e(I)V")
    public void method1035() {
    }

    @ObfuscatedName("af.q(Ldl;B)V")
    public void method1026(class119 arg0) {
        while (true) {
            int var2 = arg0.method2388();
            if (var2 == 0) {
                return;
            }
            this.method1063(arg0, var2);
        }
    }

    @ObfuscatedName("af.o(Ldl;II)V")
    public void method1063(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1099 = arg0.method2440();
        } else if (arg1 == 2) {
            this.field1113 = arg0.method2396();
        } else if (arg1 == 4) {
            this.field1105 = arg0.method2440();
        } else if (arg1 == 5) {
            this.field1106 = arg0.method2440();
        } else if (arg1 == 6) {
            this.field1134 = arg0.method2440();
        } else if (arg1 == 7) {
            this.field1131 = arg0.method2440();
            if (this.field1131 > 32767) {
                this.field1131 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1110 = arg0.method2440();
            if (this.field1110 > 32767) {
                this.field1110 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1111 = 1;
        } else if (arg1 == 12) {
            this.field1112 = arg0.method2393();
        } else if (arg1 == 16) {
            this.field1101 = true;
        } else if (arg1 == 23) {
            this.field1116 = arg0.method2440();
            this.field1103 = arg0.method2388();
        } else if (arg1 == 24) {
            this.field1130 = arg0.method2440();
        } else if (arg1 == 25) {
            this.field1119 = arg0.method2440();
            this.field1121 = arg0.method2388();
        } else if (arg1 == 26) {
            this.field1093 = arg0.method2440();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1114[arg1 - 30] = arg0.method2396();
            if (this.field1114[arg1 - 30].equalsIgnoreCase(class157.field2300)) {
                this.field1114[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1125[arg1 - 35] = arg0.method2396();
        } else if (arg1 == 40) {
            int var3 = arg0.method2388();
            this.field1117 = new short[var3];
            this.field1102 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1117[var4] = (short) arg0.method2440();
                this.field1102[var4] = (short) arg0.method2440();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2388();
            this.field1115 = new short[var5];
            this.field1104 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1115[var6] = (short) arg0.method2440();
                this.field1104[var6] = (short) arg0.method2440();
            }
        } else if (arg1 == 65) {
            this.field1107 = true;
        } else if (arg1 == 78) {
            this.field1122 = arg0.method2440();
        } else if (arg1 == 79) {
            this.field1123 = arg0.method2440();
        } else if (arg1 == 90) {
            this.field1124 = arg0.method2440();
        } else if (arg1 == 91) {
            this.field1126 = arg0.method2440();
        } else if (arg1 == 92) {
            this.field1136 = arg0.method2440();
        } else if (arg1 == 93) {
            this.field1120 = arg0.method2440();
        } else if (arg1 == 95) {
            this.field1108 = arg0.method2440();
        } else if (arg1 == 97) {
            this.field1094 = arg0.method2440();
        } else if (arg1 == 98) {
            this.field1100 = arg0.method2440();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1128 == null) {
                this.field1128 = new int[10];
                this.field1129 = new int[10];
            }
            this.field1128[arg1 - 100] = arg0.method2440();
            this.field1129[arg1 - 100] = arg0.method2440();
        } else if (arg1 == 110) {
            this.field1132 = arg0.method2440();
        } else if (arg1 == 111) {
            this.field1133 = arg0.method2440();
        } else if (arg1 == 112) {
            this.field1127 = arg0.method2440();
        } else if (arg1 == 113) {
            this.field1135 = arg0.method2389();
        } else if (arg1 == 114) {
            this.field1138 = arg0.method2389() * 5;
        } else if (arg1 == 115) {
            this.field1092 = arg0.method2388();
        } else if (arg1 == 139) {
            this.field1139 = arg0.method2440();
        } else if (arg1 == 140) {
            this.field1140 = arg0.method2440();
        }
    }

    @ObfuscatedName("af.g(Laf;Laf;I)V")
    public void method1028(class52 arg0, class52 arg1) {
        this.field1099 = arg0.field1099;
        this.field1105 = arg0.field1105;
        this.field1106 = arg0.field1106;
        this.field1134 = arg0.field1134;
        this.field1108 = arg0.field1108;
        this.field1131 = arg0.field1131;
        this.field1110 = arg0.field1110;
        this.field1117 = arg0.field1117;
        this.field1102 = arg0.field1102;
        this.field1115 = arg0.field1115;
        this.field1104 = arg0.field1104;
        this.field1113 = arg1.field1113;
        this.field1101 = arg1.field1101;
        this.field1112 = arg1.field1112;
        this.field1111 = 1;
    }

    @ObfuscatedName("af.m(Laf;Laf;B)V")
    public void method1029(class52 arg0, class52 arg1) {
        this.field1099 = arg0.field1099;
        this.field1105 = arg0.field1105;
        this.field1106 = arg0.field1106;
        this.field1134 = arg0.field1134;
        this.field1108 = arg0.field1108;
        this.field1131 = arg0.field1131;
        this.field1110 = arg0.field1110;
        this.field1117 = arg1.field1117;
        this.field1102 = arg1.field1102;
        this.field1115 = arg1.field1115;
        this.field1104 = arg1.field1104;
        this.field1113 = arg1.field1113;
        this.field1101 = arg1.field1101;
        this.field1111 = arg1.field1111;
        this.field1116 = arg1.field1116;
        this.field1130 = arg1.field1130;
        this.field1122 = arg1.field1122;
        this.field1119 = arg1.field1119;
        this.field1093 = arg1.field1093;
        this.field1123 = arg1.field1123;
        this.field1124 = arg1.field1124;
        this.field1136 = arg1.field1136;
        this.field1126 = arg1.field1126;
        this.field1120 = arg1.field1120;
        this.field1092 = arg1.field1092;
        this.field1114 = arg1.field1114;
        this.field1125 = new String[5];
        if (arg1.field1125 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1125[var3] = arg1.field1125[var3];
            }
        }
        this.field1125[4] = class157.field2418;
        this.field1112 = 0;
    }

    @ObfuscatedName("af.b(II)Lcm;")
    public final class100 method1030(int arg0) {
        if (this.field1128 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1129[var3] && this.field1129[var3] != 0) {
                    var2 = this.field1128[var3];
                }
            }
            if (var2 != -1) {
                return method646(var2).method1030(1);
            }
        }
        class100 var4 = class100.method2077(Statics.field1118, this.field1099, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1132 != 128 || this.field1133 != 128 || this.field1127 != 128) {
            var4.method2093(this.field1132, this.field1133, this.field1127);
        }
        if (this.field1117 != null) {
            for (int var5 = 0; var5 < this.field1117.length; var5++) {
                var4.method2090(this.field1117[var5], this.field1102[var5]);
            }
        }
        if (this.field1115 != null) {
            for (int var6 = 0; var6 < this.field1115.length; var6++) {
                var4.method2091(this.field1115[var6], this.field1104[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("af.p(II)Ldt;")
    public final class105 method1031(int arg0) {
        if (this.field1128 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1129[var3] && this.field1129[var3] != 0) {
                    var2 = this.field1128[var3];
                }
            }
            if (var2 != -1) {
                return method646(var2).method1031(1);
            }
        }
        class105 var4 = (class105) field1096.method3478((long) this.field1098);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2077(Statics.field1118, this.field1099, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1132 != 128 || this.field1133 != 128 || this.field1127 != 128) {
            var5.method2093(this.field1132, this.field1133, this.field1127);
        }
        if (this.field1117 != null) {
            for (int var6 = 0; var6 < this.field1117.length; var6++) {
                var5.method2090(this.field1117[var6], this.field1102[var6]);
            }
        }
        if (this.field1115 != null) {
            for (int var7 = 0; var7 < this.field1115.length; var7++) {
                var5.method2091(this.field1115[var7], this.field1104[var7]);
            }
        }
        class105 var8 = var5.method2085(this.field1135 + 64, this.field1138 + 768, -50, -10, -50);
        var8.field1813 = true;
        field1096.method3479(var8, (long) this.field1098);
        return var8;
    }

    @ObfuscatedName("af.t(IB)Laf;")
    public class52 method1074(int arg0) {
        if (this.field1128 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1129[var3] && this.field1129[var3] != 0) {
                    var2 = this.field1128[var3];
                }
            }
            if (var2 != -1) {
                return method646(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("s.w(IIIIIZS)Lcr;")
    public static final class79 method185(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1109.method3478(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method646(arg0);
        if (arg1 > 1 && var9.field1128 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1129[var11] && var9.field1129[var11] != 0) {
                    var10 = var9.field1128[var11];
                }
            }
            if (var10 != -1) {
                var9 = method646(var10);
            }
        }
        class105 var12 = var9.method1031(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1100 != -1) {
            var13 = method185(var9.field1094, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1140 != -1) {
            var13 = method185(var9.field1139, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1406;
        int var15 = Statics.field1403;
        int var16 = Statics.field1404;
        int[] var17 = new int[4];
        class80.method1703(var17);
        class79 var18 = new class79(36, 32);
        class80.method1699(var18.field1401, 36, 32);
        class80.method1741();
        class91.method1971();
        class91.method1994(16, 16);
        class91.field1567 = false;
        int var19 = var9.field1105;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1550[var9.field1106] * var19 >> 16;
        int var21 = class91.field1568[var9.field1106] * var19 >> 16;
        var12.method2195();
        var12.method2186(0, var9.field1134, var9.field1108, var9.field1106, var9.field1131, var9.field1110 + var12.field1442 / 2 + var20, var9.field1110 + var21);
        if (var9.field1140 != -1) {
            var13.method1618(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1614(1);
        }
        if (arg2 >= 2) {
            var18.method1614(16777215);
        }
        if (arg3 != 0) {
            var18.method1629(arg3);
        }
        class80.method1699(var18.field1401, 36, 32);
        if (var9.field1100 != -1) {
            var13.method1618(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1111 == 1) {
            Statics.field2637.method3735(method2917(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1109.method3479(var18, var6);
        }
        class80.method1699(var14, var15, var16);
        class80.method1704(var17);
        class91.method1971();
        class91.field1567 = true;
        return var18;
    }

    @ObfuscatedName("eb.x(IB)Ljava/lang/String;")
    public static final String method2917(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class157.field2462 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class157.field2460 + "</col>";
        }
    }

    @ObfuscatedName("af.k(ZB)Z")
    public final boolean method1033(boolean arg0) {
        int var2 = this.field1116;
        int var3 = this.field1130;
        int var4 = this.field1122;
        if (arg0) {
            var2 = this.field1119;
            var3 = this.field1093;
            var4 = this.field1123;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1118.method3088(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1118.method3088(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1118.method3088(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("af.z(ZI)Lcm;")
    public final class100 method1036(boolean arg0) {
        int var2 = this.field1116;
        int var3 = this.field1130;
        int var4 = this.field1122;
        if (arg0) {
            var2 = this.field1119;
            var3 = this.field1093;
            var4 = this.field1123;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2077(Statics.field1118, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2077(Statics.field1118, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2077(Statics.field1118, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1103 != 0) {
            var5.method2089(0, this.field1103, 0);
        }
        if (arg0 && this.field1121 != 0) {
            var5.method2089(0, this.field1121, 0);
        }
        if (this.field1117 != null) {
            for (int var10 = 0; var10 < this.field1117.length; var10++) {
                var5.method2090(this.field1117[var10], this.field1102[var10]);
            }
        }
        if (this.field1115 != null) {
            for (int var11 = 0; var11 < this.field1115.length; var11++) {
                var5.method2091(this.field1115[var11], this.field1104[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("af.v(ZB)Z")
    public final boolean method1077(boolean arg0) {
        int var2 = this.field1124;
        int var3 = this.field1136;
        if (arg0) {
            var2 = this.field1126;
            var3 = this.field1120;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1118.method3088(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1118.method3088(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("af.j(ZS)Lcm;")
    public final class100 method1056(boolean arg0) {
        int var2 = this.field1124;
        int var3 = this.field1136;
        if (arg0) {
            var2 = this.field1126;
            var3 = this.field1120;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2077(Statics.field1118, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2077(Statics.field1118, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1117 != null) {
            for (int var7 = 0; var7 < this.field1117.length; var7++) {
                var4.method2090(this.field1117[var7], this.field1102[var7]);
            }
        }
        if (this.field1115 != null) {
            for (int var8 = 0; var8 < this.field1115.length; var8++) {
                var4.method2091(this.field1115[var8], this.field1104[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("as.f(B)V")
    public static void method895() {
        field1109.method3481();
    }

    @ObfuscatedName("j.c(ZI)V")
    public static void method160(boolean arg0) {
        if (Statics.field575 != arg0) {
            field1095.method3481();
            field1096.method3481();
            field1109.method3481();
            Statics.field575 = arg0;
        }
    }
}
