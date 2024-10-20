package deob;

@ObfuscatedName("an")
public class class52 extends class204 {

    @ObfuscatedName("an.m")
    public static class193 field1099 = new class193(64);

    @ObfuscatedName("an.p")
    public static class193 field1123 = new class193(50);

    @ObfuscatedName("an.h")
    public static class193 field1133 = new class193(200);

    @ObfuscatedName("an.g")
    public int field1103;

    @ObfuscatedName("an.b")
    public int field1119;

    @ObfuscatedName("an.f")
    public String field1105 = "null";

    @ObfuscatedName("an.y")
    public short[] field1106;

    @ObfuscatedName("an.z")
    public short[] field1107;

    @ObfuscatedName("an.t")
    public short[] field1108;

    @ObfuscatedName("an.o")
    public short[] field1109;

    @ObfuscatedName("an.r")
    public int field1093 = 2000;

    @ObfuscatedName("an.u")
    public int field1104 = 0;

    @ObfuscatedName("an.v")
    public int field1134 = 0;

    @ObfuscatedName("an.a")
    public int field1117 = 0;

    @ObfuscatedName("an.c")
    public int field1114 = 0;

    @ObfuscatedName("an.l")
    public int field1111 = 0;

    @ObfuscatedName("an.x")
    public int field1116 = 0;

    @ObfuscatedName("an.w")
    public int field1113 = 1;

    @ObfuscatedName("an.aq")
    public boolean field1118 = false;

    @ObfuscatedName("an.az")
    public String[] field1110 = new String[] { null, null, class157.field2295, null, null };

    @ObfuscatedName("an.ab")
    public String[] field1098 = new String[] { null, null, null, null, class157.field2296 };

    @ObfuscatedName("an.ac")
    public int field1121 = -1;

    @ObfuscatedName("an.ad")
    public int field1122 = -1;

    @ObfuscatedName("an.av")
    public int field1143 = 0;

    @ObfuscatedName("an.ar")
    public int field1101 = -1;

    @ObfuscatedName("an.al")
    public int field1125 = -1;

    @ObfuscatedName("an.aj")
    public int field1126 = 0;

    @ObfuscatedName("an.au")
    public int field1127 = -1;

    @ObfuscatedName("an.aw")
    public int field1128 = -1;

    @ObfuscatedName("an.ax")
    public int field1129 = -1;

    @ObfuscatedName("an.ap")
    public int field1130 = -1;

    @ObfuscatedName("an.af")
    public int field1131 = -1;

    @ObfuscatedName("an.ag")
    public int field1132 = -1;

    @ObfuscatedName("an.ah")
    public int[] field1142;

    @ObfuscatedName("an.at")
    public int[] field1146;

    @ObfuscatedName("an.ak")
    public int field1135 = -1;

    @ObfuscatedName("an.ay")
    public int field1136 = -1;

    @ObfuscatedName("an.ai")
    public int field1137 = 128;

    @ObfuscatedName("an.am")
    public int field1138 = 128;

    @ObfuscatedName("an.ao")
    public int field1139 = 128;

    @ObfuscatedName("an.as")
    public int field1100 = 0;

    @ObfuscatedName("an.aa")
    public int field1141 = 0;

    @ObfuscatedName("an.ae")
    public int field1115 = 0;

    @ObfuscatedName("an.an")
    public boolean field1112 = false;

    @ObfuscatedName("an.bd")
    public int field1144 = -1;

    @ObfuscatedName("an.by")
    public int field1145 = -1;

    @ObfuscatedName("dn.n(II)Lan;")
    public static class52 method2651(int arg0) {
        class52 var1 = (class52) field1099.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1095.method3010(10, arg0);
        class52 var3 = new class52();
        var3.field1103 = arg0;
        if (var2 != null) {
            var3.method1005(new class119(var2));
        }
        var3.method994();
        if (var3.field1136 != -1) {
            var3.method993(method2651(var3.field1136), method2651(var3.field1135));
        }
        if (var3.field1145 != -1) {
            var3.method983(method2651(var3.field1145), method2651(var3.field1144));
        }
        if (!Statics.field1124 && var3.field1118) {
            var3.field1105 = class157.field2555;
            var3.field1112 = false;
            var3.field1110 = null;
            var3.field1098 = null;
            var3.field1115 = 0;
        }
        field1099.method3481(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.d(I)V")
    public void method994() {
    }

    @ObfuscatedName("an.s(Ldq;B)V")
    public void method1005(class119 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method989(arg0, var2);
        }
    }

    @ObfuscatedName("an.q(Ldq;II)V")
    public void method989(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1119 = arg0.method2377();
        } else if (arg1 == 2) {
            this.field1105 = arg0.method2492();
        } else if (arg1 == 4) {
            this.field1093 = arg0.method2377();
        } else if (arg1 == 5) {
            this.field1104 = arg0.method2377();
        } else if (arg1 == 6) {
            this.field1134 = arg0.method2377();
        } else if (arg1 == 7) {
            this.field1114 = arg0.method2377();
            if (this.field1114 > 32767) {
                this.field1114 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1111 = arg0.method2377();
            if (this.field1111 > 32767) {
                this.field1111 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1116 = 1;
        } else if (arg1 == 12) {
            this.field1113 = arg0.method2343();
        } else if (arg1 == 16) {
            this.field1118 = true;
        } else if (arg1 == 23) {
            this.field1121 = arg0.method2377();
            this.field1143 = arg0.method2338();
        } else if (arg1 == 24) {
            this.field1122 = arg0.method2377();
        } else if (arg1 == 25) {
            this.field1101 = arg0.method2377();
            this.field1126 = arg0.method2338();
        } else if (arg1 == 26) {
            this.field1125 = arg0.method2377();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1110[arg1 - 30] = arg0.method2492();
            if (this.field1110[arg1 - 30].equalsIgnoreCase(class157.field2512)) {
                this.field1110[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1098[arg1 - 35] = arg0.method2492();
        } else if (arg1 == 40) {
            int var3 = arg0.method2338();
            this.field1106 = new short[var3];
            this.field1107 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1106[var4] = (short) arg0.method2377();
                this.field1107[var4] = (short) arg0.method2377();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2338();
            this.field1108 = new short[var5];
            this.field1109 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1108[var6] = (short) arg0.method2377();
                this.field1109[var6] = (short) arg0.method2377();
            }
        } else if (arg1 == 65) {
            this.field1112 = true;
        } else if (arg1 == 78) {
            this.field1127 = arg0.method2377();
        } else if (arg1 == 79) {
            this.field1128 = arg0.method2377();
        } else if (arg1 == 90) {
            this.field1129 = arg0.method2377();
        } else if (arg1 == 91) {
            this.field1131 = arg0.method2377();
        } else if (arg1 == 92) {
            this.field1130 = arg0.method2377();
        } else if (arg1 == 93) {
            this.field1132 = arg0.method2377();
        } else if (arg1 == 95) {
            this.field1117 = arg0.method2377();
        } else if (arg1 == 97) {
            this.field1135 = arg0.method2377();
        } else if (arg1 == 98) {
            this.field1136 = arg0.method2377();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1142 == null) {
                this.field1142 = new int[10];
                this.field1146 = new int[10];
            }
            this.field1142[arg1 - 100] = arg0.method2377();
            this.field1146[arg1 - 100] = arg0.method2377();
        } else if (arg1 == 110) {
            this.field1137 = arg0.method2377();
        } else if (arg1 == 111) {
            this.field1138 = arg0.method2377();
        } else if (arg1 == 112) {
            this.field1139 = arg0.method2377();
        } else if (arg1 == 113) {
            this.field1100 = arg0.method2330();
        } else if (arg1 == 114) {
            this.field1141 = arg0.method2330() * 5;
        } else if (arg1 == 115) {
            this.field1115 = arg0.method2338();
        } else if (arg1 == 139) {
            this.field1144 = arg0.method2377();
        } else if (arg1 == 140) {
            this.field1145 = arg0.method2377();
        }
    }

    @ObfuscatedName("an.j(Lan;Lan;B)V")
    public void method993(class52 arg0, class52 arg1) {
        this.field1119 = arg0.field1119;
        this.field1093 = arg0.field1093;
        this.field1104 = arg0.field1104;
        this.field1134 = arg0.field1134;
        this.field1117 = arg0.field1117;
        this.field1114 = arg0.field1114;
        this.field1111 = arg0.field1111;
        this.field1106 = arg0.field1106;
        this.field1107 = arg0.field1107;
        this.field1108 = arg0.field1108;
        this.field1109 = arg0.field1109;
        this.field1105 = arg1.field1105;
        this.field1118 = arg1.field1118;
        this.field1113 = arg1.field1113;
        this.field1116 = 1;
    }

    @ObfuscatedName("an.k(Lan;Lan;B)V")
    public void method983(class52 arg0, class52 arg1) {
        this.field1119 = arg0.field1119;
        this.field1093 = arg0.field1093;
        this.field1104 = arg0.field1104;
        this.field1134 = arg0.field1134;
        this.field1117 = arg0.field1117;
        this.field1114 = arg0.field1114;
        this.field1111 = arg0.field1111;
        this.field1106 = arg1.field1106;
        this.field1107 = arg1.field1107;
        this.field1108 = arg1.field1108;
        this.field1109 = arg1.field1109;
        this.field1105 = arg1.field1105;
        this.field1118 = arg1.field1118;
        this.field1116 = arg1.field1116;
        this.field1121 = arg1.field1121;
        this.field1122 = arg1.field1122;
        this.field1127 = arg1.field1127;
        this.field1101 = arg1.field1101;
        this.field1125 = arg1.field1125;
        this.field1128 = arg1.field1128;
        this.field1129 = arg1.field1129;
        this.field1130 = arg1.field1130;
        this.field1131 = arg1.field1131;
        this.field1132 = arg1.field1132;
        this.field1115 = arg1.field1115;
        this.field1110 = arg1.field1110;
        this.field1098 = new String[5];
        if (arg1.field1098 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1098[var3] = arg1.field1098[var3];
            }
        }
        this.field1098[4] = class157.field2301;
        this.field1113 = 0;
    }

    @ObfuscatedName("an.i(II)Lcl;")
    public final class100 method984(int arg0) {
        if (this.field1142 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1146[var3] && this.field1146[var3] != 0) {
                    var2 = this.field1142[var3];
                }
            }
            if (var2 != -1) {
                return method2651(var2).method984(1);
            }
        }
        class100 var4 = class100.method2024(Statics.field1097, this.field1119, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1137 != 128 || this.field1138 != 128 || this.field1139 != 128) {
            var4.method2039(this.field1137, this.field1138, this.field1139);
        }
        if (this.field1106 != null) {
            for (int var5 = 0; var5 < this.field1106.length; var5++) {
                var4.method2060(this.field1106[var5], this.field1107[var5]);
            }
        }
        if (this.field1108 != null) {
            for (int var6 = 0; var6 < this.field1108.length; var6++) {
                var4.method2076(this.field1108[var6], this.field1109[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("an.m(II)Ldb;")
    public final class105 method995(int arg0) {
        if (this.field1142 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1146[var3] && this.field1146[var3] != 0) {
                    var2 = this.field1142[var3];
                }
            }
            if (var2 != -1) {
                return method2651(var2).method995(1);
            }
        }
        class105 var4 = (class105) field1123.method3478((long) this.field1103);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2024(Statics.field1097, this.field1119, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1137 != 128 || this.field1138 != 128 || this.field1139 != 128) {
            var5.method2039(this.field1137, this.field1138, this.field1139);
        }
        if (this.field1106 != null) {
            for (int var6 = 0; var6 < this.field1106.length; var6++) {
                var5.method2060(this.field1106[var6], this.field1107[var6]);
            }
        }
        if (this.field1108 != null) {
            for (int var7 = 0; var7 < this.field1108.length; var7++) {
                var5.method2076(this.field1108[var7], this.field1109[var7]);
            }
        }
        class105 var8 = var5.method2093(this.field1100 + 64, this.field1141 + 768, -50, -10, -50);
        var8.field1802 = true;
        field1123.method3481(var8, (long) this.field1103);
        return var8;
    }

    @ObfuscatedName("an.p(II)Lan;")
    public class52 method986(int arg0) {
        if (this.field1142 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1146[var3] && this.field1146[var3] != 0) {
                    var2 = this.field1142[var3];
                }
            }
            if (var2 != -1) {
                return method2651(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("v.h(IIIIIZI)Lcy;")
    public static final class79 method540(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1133.method3478(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method2651(arg0);
        if (arg1 > 1 && var9.field1142 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1146[var11] && var9.field1146[var11] != 0) {
                    var10 = var9.field1142[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2651(var10);
            }
        }
        class105 var12 = var9.method995(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1136 != -1) {
            var13 = method540(var9.field1135, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1145 != -1) {
            var13 = method540(var9.field1144, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1407;
        int var15 = Statics.field1402;
        int var16 = Statics.field1404;
        int[] var17 = new int[4];
        class80.method1687(var17);
        class79 var18 = new class79(36, 32);
        class80.method1698(var18.field1390, 36, 32);
        class80.method1656();
        class91.method1929();
        class91.method1932(16, 16);
        class91.field1552 = false;
        int var19 = var9.field1093;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1566[var9.field1104] * var19 >> 16;
        int var21 = class91.field1567[var9.field1104] * var19 >> 16;
        var12.method2168();
        var12.method2122(0, var9.field1134, var9.field1117, var9.field1104, var9.field1114, var9.field1111 + var12.field1442 / 2 + var20, var9.field1111 + var21);
        if (var9.field1145 != -1) {
            var13.method1572(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1559(1);
        }
        if (arg2 >= 2) {
            var18.method1559(16777215);
        }
        if (arg3 != 0) {
            var18.method1579(arg3);
        }
        class80.method1698(var18.field1390, 36, 32);
        if (var9.field1136 != -1) {
            var13.method1572(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1116 == 1) {
            class224 var22 = Statics.field1102;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class157.field2459 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class157.field2457 + "</col>";
            }
            var22.method3754(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1133.method3481(var18, var6);
        }
        class80.method1698(var14, var15, var16);
        class80.method1688(var17);
        class91.method1929();
        class91.field1552 = true;
        return var18;
    }

    @ObfuscatedName("an.e(ZI)Z")
    public final boolean method987(boolean arg0) {
        int var2 = this.field1121;
        int var3 = this.field1122;
        int var4 = this.field1127;
        if (arg0) {
            var2 = this.field1101;
            var3 = this.field1125;
            var4 = this.field1128;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1097.method3012(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1097.method3012(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1097.method3012(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("an.g(ZI)Lcl;")
    public final class100 method988(boolean arg0) {
        int var2 = this.field1121;
        int var3 = this.field1122;
        int var4 = this.field1127;
        if (arg0) {
            var2 = this.field1101;
            var3 = this.field1125;
            var4 = this.field1128;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2024(Statics.field1097, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2024(Statics.field1097, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2024(Statics.field1097, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1143 != 0) {
            var5.method2036(0, this.field1143, 0);
        }
        if (arg0 && this.field1126 != 0) {
            var5.method2036(0, this.field1126, 0);
        }
        if (this.field1106 != null) {
            for (int var10 = 0; var10 < this.field1106.length; var10++) {
                var5.method2060(this.field1106[var10], this.field1107[var10]);
            }
        }
        if (this.field1108 != null) {
            for (int var11 = 0; var11 < this.field1108.length; var11++) {
                var5.method2076(this.field1108[var11], this.field1109[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("an.b(ZI)Z")
    public final boolean method990(boolean arg0) {
        int var2 = this.field1129;
        int var3 = this.field1130;
        if (arg0) {
            var2 = this.field1131;
            var3 = this.field1132;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1097.method3012(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1097.method3012(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("an.f(ZI)Lcl;")
    public final class100 method979(boolean arg0) {
        int var2 = this.field1129;
        int var3 = this.field1130;
        if (arg0) {
            var2 = this.field1131;
            var3 = this.field1132;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2024(Statics.field1097, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2024(Statics.field1097, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1106 != null) {
            for (int var7 = 0; var7 < this.field1106.length; var7++) {
                var4.method2060(this.field1106[var7], this.field1107[var7]);
            }
        }
        if (this.field1108 != null) {
            for (int var8 = 0; var8 < this.field1108.length; var8++) {
                var4.method2076(this.field1108[var8], this.field1109[var8]);
            }
        }
        return var4;
    }
}
