package deob;

@ObfuscatedName("ap")
public class class52 extends class205 {

    @ObfuscatedName("ap.c")
    public static class194 field1080 = new class194(64);

    @ObfuscatedName("ap.l")
    public static class194 field1081 = new class194(50);

    @ObfuscatedName("ap.u")
    public static class194 field1082 = new class194(200);

    @ObfuscatedName("ap.n")
    public int field1093;

    @ObfuscatedName("ap.w")
    public int field1085;

    @ObfuscatedName("ap.z")
    public String field1091 = "null";

    @ObfuscatedName("ap.k")
    public short[] field1087;

    @ObfuscatedName("ap.o")
    public short[] field1105;

    @ObfuscatedName("ap.t")
    public short[] field1089;

    @ObfuscatedName("ap.h")
    public short[] field1122;

    @ObfuscatedName("ap.v")
    public int field1107 = 2000;

    @ObfuscatedName("ap.a")
    public int field1092 = 0;

    @ObfuscatedName("ap.f")
    public int field1084 = 0;

    @ObfuscatedName("ap.q")
    public int field1094 = 0;

    @ObfuscatedName("ap.m")
    public int field1090 = 0;

    @ObfuscatedName("ap.s")
    public int field1096 = 0;

    @ObfuscatedName("ap.i")
    public int field1097 = 0;

    @ObfuscatedName("ap.e")
    public int field1098 = 1;

    @ObfuscatedName("ap.aw")
    public boolean field1099 = false;

    @ObfuscatedName("ap.an")
    public String[] field1100 = new String[] { null, null, class158.field2484, null, null };

    @ObfuscatedName("ap.ag")
    public String[] field1106 = new String[] { null, null, null, null, class158.field2299 };

    @ObfuscatedName("ap.ae")
    public int field1102 = -1;

    @ObfuscatedName("ap.aj")
    public int field1103 = -1;

    @ObfuscatedName("ap.ah")
    public int field1116 = 0;

    @ObfuscatedName("ap.af")
    public int field1083 = -1;

    @ObfuscatedName("ap.az")
    public int field1109 = -1;

    @ObfuscatedName("ap.ax")
    public int field1077 = 0;

    @ObfuscatedName("ap.ac")
    public int field1108 = -1;

    @ObfuscatedName("ap.ar")
    public int field1095 = -1;

    @ObfuscatedName("ap.aq")
    public int field1110 = -1;

    @ObfuscatedName("ap.aa")
    public int field1088 = -1;

    @ObfuscatedName("ap.ay")
    public int field1112 = -1;

    @ObfuscatedName("ap.as")
    public int field1101 = -1;

    @ObfuscatedName("ap.ak")
    public int[] field1114;

    @ObfuscatedName("ap.au")
    public int[] field1126;

    @ObfuscatedName("ap.av")
    public int field1113 = -1;

    @ObfuscatedName("ap.at")
    public int field1117 = -1;

    @ObfuscatedName("ap.am")
    public int field1118 = 128;

    @ObfuscatedName("ap.ab")
    public int field1119 = 128;

    @ObfuscatedName("ap.ai")
    public int field1120 = 128;

    @ObfuscatedName("ap.ad")
    public int field1121 = 0;

    @ObfuscatedName("ap.ao")
    public int field1104 = 0;

    @ObfuscatedName("ap.al")
    public int field1123 = 0;

    @ObfuscatedName("ap.ap")
    public boolean field1124 = false;

    @ObfuscatedName("ap.bc")
    public int field1111 = -1;

    @ObfuscatedName("ap.bj")
    public int field1086 = -1;

    @ObfuscatedName("ap.bs")
    public int field1127 = -1;

    @ObfuscatedName("ap.be")
    public int field1128 = -1;

    @ObfuscatedName("ac.b(IB)Lap;")
    public static class52 method727(int arg0) {
        class52 var1 = (class52) field1080.method3495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field762.method3037(10, arg0);
        class52 var3 = new class52();
        var3.field1093 = arg0;
        if (var2 != null) {
            var3.method1003(new class120(var2));
        }
        var3.method1008();
        if (var3.field1117 != -1) {
            var3.method1042(method727(var3.field1117), method727(var3.field1113));
        }
        if (var3.field1086 != -1) {
            var3.method1002(method727(var3.field1086), method727(var3.field1111));
        }
        if (var3.field1128 != -1) {
            var3.method1040(method727(var3.field1128), method727(var3.field1127));
        }
        if (!Statics.field158 && var3.field1099) {
            var3.field1091 = class158.field2478;
            var3.field1124 = false;
            var3.field1100 = null;
            var3.field1106 = null;
            var3.field1123 = 0;
        }
        field1080.method3490(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.g(I)V")
    public void method1008() {
    }

    @ObfuscatedName("ap.j(Lds;B)V")
    public void method1003(class120 arg0) {
        while (true) {
            int var2 = arg0.method2344();
            if (var2 == 0) {
                return;
            }
            this.method1001(arg0, var2);
        }
    }

    @ObfuscatedName("ap.d(Lds;II)V")
    public void method1001(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1085 = arg0.method2346();
        } else if (arg1 == 2) {
            this.field1091 = arg0.method2352();
        } else if (arg1 == 4) {
            this.field1107 = arg0.method2346();
        } else if (arg1 == 5) {
            this.field1092 = arg0.method2346();
        } else if (arg1 == 6) {
            this.field1084 = arg0.method2346();
        } else if (arg1 == 7) {
            this.field1090 = arg0.method2346();
            if (this.field1090 > 32767) {
                this.field1090 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1096 = arg0.method2346();
            if (this.field1096 > 32767) {
                this.field1096 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1097 = 1;
        } else if (arg1 == 12) {
            this.field1098 = arg0.method2349();
        } else if (arg1 == 16) {
            this.field1099 = true;
        } else if (arg1 == 23) {
            this.field1102 = arg0.method2346();
            this.field1116 = arg0.method2344();
        } else if (arg1 == 24) {
            this.field1103 = arg0.method2346();
        } else if (arg1 == 25) {
            this.field1083 = arg0.method2346();
            this.field1077 = arg0.method2344();
        } else if (arg1 == 26) {
            this.field1109 = arg0.method2346();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1100[arg1 - 30] = arg0.method2352();
            if (this.field1100[arg1 - 30].equalsIgnoreCase(class158.field2300)) {
                this.field1100[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1106[arg1 - 35] = arg0.method2352();
        } else if (arg1 == 40) {
            int var3 = arg0.method2344();
            this.field1087 = new short[var3];
            this.field1105 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1087[var4] = (short) arg0.method2346();
                this.field1105[var4] = (short) arg0.method2346();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2344();
            this.field1089 = new short[var5];
            this.field1122 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1089[var6] = (short) arg0.method2346();
                this.field1122[var6] = (short) arg0.method2346();
            }
        } else if (arg1 == 65) {
            this.field1124 = true;
        } else if (arg1 == 78) {
            this.field1108 = arg0.method2346();
        } else if (arg1 == 79) {
            this.field1095 = arg0.method2346();
        } else if (arg1 == 90) {
            this.field1110 = arg0.method2346();
        } else if (arg1 == 91) {
            this.field1112 = arg0.method2346();
        } else if (arg1 == 92) {
            this.field1088 = arg0.method2346();
        } else if (arg1 == 93) {
            this.field1101 = arg0.method2346();
        } else if (arg1 == 95) {
            this.field1094 = arg0.method2346();
        } else if (arg1 == 97) {
            this.field1113 = arg0.method2346();
        } else if (arg1 == 98) {
            this.field1117 = arg0.method2346();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1114 == null) {
                this.field1114 = new int[10];
                this.field1126 = new int[10];
            }
            this.field1114[arg1 - 100] = arg0.method2346();
            this.field1126[arg1 - 100] = arg0.method2346();
        } else if (arg1 == 110) {
            this.field1118 = arg0.method2346();
        } else if (arg1 == 111) {
            this.field1119 = arg0.method2346();
        } else if (arg1 == 112) {
            this.field1120 = arg0.method2346();
        } else if (arg1 == 113) {
            this.field1121 = arg0.method2345();
        } else if (arg1 == 114) {
            this.field1104 = arg0.method2345() * 5;
        } else if (arg1 == 115) {
            this.field1123 = arg0.method2344();
        } else if (arg1 == 139) {
            this.field1111 = arg0.method2346();
        } else if (arg1 == 140) {
            this.field1086 = arg0.method2346();
        } else if (arg1 == 148) {
            this.field1127 = arg0.method2346();
        } else if (arg1 == 149) {
            this.field1128 = arg0.method2346();
        }
    }

    @ObfuscatedName("ap.x(Lap;Lap;I)V")
    public void method1042(class52 arg0, class52 arg1) {
        this.field1085 = arg0.field1085;
        this.field1107 = arg0.field1107;
        this.field1092 = arg0.field1092;
        this.field1084 = arg0.field1084;
        this.field1094 = arg0.field1094;
        this.field1090 = arg0.field1090;
        this.field1096 = arg0.field1096;
        this.field1087 = arg0.field1087;
        this.field1105 = arg0.field1105;
        this.field1089 = arg0.field1089;
        this.field1122 = arg0.field1122;
        this.field1091 = arg1.field1091;
        this.field1099 = arg1.field1099;
        this.field1098 = arg1.field1098;
        this.field1097 = 1;
    }

    @ObfuscatedName("ap.y(Lap;Lap;I)V")
    public void method1002(class52 arg0, class52 arg1) {
        this.field1085 = arg0.field1085;
        this.field1107 = arg0.field1107;
        this.field1092 = arg0.field1092;
        this.field1084 = arg0.field1084;
        this.field1094 = arg0.field1094;
        this.field1090 = arg0.field1090;
        this.field1096 = arg0.field1096;
        this.field1087 = arg1.field1087;
        this.field1105 = arg1.field1105;
        this.field1089 = arg1.field1089;
        this.field1122 = arg1.field1122;
        this.field1091 = arg1.field1091;
        this.field1099 = arg1.field1099;
        this.field1097 = arg1.field1097;
        this.field1102 = arg1.field1102;
        this.field1103 = arg1.field1103;
        this.field1108 = arg1.field1108;
        this.field1083 = arg1.field1083;
        this.field1109 = arg1.field1109;
        this.field1095 = arg1.field1095;
        this.field1110 = arg1.field1110;
        this.field1088 = arg1.field1088;
        this.field1112 = arg1.field1112;
        this.field1101 = arg1.field1101;
        this.field1123 = arg1.field1123;
        this.field1100 = arg1.field1100;
        this.field1106 = new String[5];
        if (arg1.field1106 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1106[var3] = arg1.field1106[var3];
            }
        }
        this.field1106[4] = class158.field2340;
        this.field1098 = 0;
    }

    @ObfuscatedName("ap.r(Lap;Lap;B)V")
    public void method1040(class52 arg0, class52 arg1) {
        this.field1085 = arg0.field1085;
        this.field1107 = arg0.field1107;
        this.field1092 = arg0.field1092;
        this.field1084 = arg0.field1084;
        this.field1094 = arg0.field1094;
        this.field1090 = arg0.field1090;
        this.field1096 = arg0.field1096;
        this.field1087 = arg0.field1087;
        this.field1105 = arg0.field1105;
        this.field1089 = arg0.field1089;
        this.field1122 = arg0.field1122;
        this.field1097 = arg0.field1097;
        this.field1091 = arg1.field1091;
        this.field1098 = 0;
        this.field1099 = false;
        this.field1124 = false;
    }

    @ObfuscatedName("ap.c(II)Lch;")
    public final class101 method1004(int arg0) {
        if (this.field1114 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1126[var3] && this.field1126[var3] != 0) {
                    var2 = this.field1114[var3];
                }
            }
            if (var2 != -1) {
                return method727(var2).method1004(1);
            }
        }
        class101 var4 = class101.method2051(Statics.field1074, this.field1085, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1118 != 128 || this.field1119 != 128 || this.field1120 != 128) {
            var4.method2114(this.field1118, this.field1119, this.field1120);
        }
        if (this.field1087 != null) {
            for (int var5 = 0; var5 < this.field1087.length; var5++) {
                var4.method2064(this.field1087[var5], this.field1105[var5]);
            }
        }
        if (this.field1089 != null) {
            for (int var6 = 0; var6 < this.field1089.length; var6++) {
                var4.method2065(this.field1089[var6], this.field1122[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ap.l(II)Ldd;")
    public final class106 method1005(int arg0) {
        if (this.field1114 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1126[var3] && this.field1126[var3] != 0) {
                    var2 = this.field1114[var3];
                }
            }
            if (var2 != -1) {
                return method727(var2).method1005(1);
            }
        }
        class106 var4 = (class106) field1081.method3495((long) this.field1093);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2051(Statics.field1074, this.field1085, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1118 != 128 || this.field1119 != 128 || this.field1120 != 128) {
            var5.method2114(this.field1118, this.field1119, this.field1120);
        }
        if (this.field1087 != null) {
            for (int var6 = 0; var6 < this.field1087.length; var6++) {
                var5.method2064(this.field1087[var6], this.field1105[var6]);
            }
        }
        if (this.field1089 != null) {
            for (int var7 = 0; var7 < this.field1089.length; var7++) {
                var5.method2065(this.field1089[var7], this.field1122[var7]);
            }
        }
        class106 var8 = var5.method2072(this.field1121 + 64, this.field1104 + 768, -50, -10, -50);
        var8.field1812 = true;
        field1081.method3490(var8, (long) this.field1093);
        return var8;
    }

    @ObfuscatedName("ap.u(II)Lap;")
    public class52 method1033(int arg0) {
        if (this.field1114 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1126[var3] && this.field1126[var3] != 0) {
                    var2 = this.field1114[var3];
                }
            }
            if (var2 != -1) {
                return method727(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ay.p(IIIIIZI)Lck;")
    public static final class79 method775(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1082.method3495(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method727(arg0);
        if (arg1 > 1 && var9.field1114 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1126[var11] && var9.field1126[var11] != 0) {
                    var10 = var9.field1114[var11];
                }
            }
            if (var10 != -1) {
                var9 = method727(var10);
            }
        }
        class106 var12 = var9.method1005(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1117 != -1) {
            var13 = method775(var9.field1113, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1086 != -1) {
            var13 = method775(var9.field1111, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1128 != -1) {
            var13 = method775(var9.field1127, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1384;
        int var15 = Statics.field1383;
        int var16 = Statics.field1388;
        int[] var17 = new int[4];
        class80.method1669(var17);
        class79 var18 = new class79(36, 32);
        class80.method1665(var18.field1381, 36, 32);
        class80.method1724();
        class92.method1982();
        class92.method2003(16, 16);
        class92.field1544 = false;
        if (var9.field1128 != -1) {
            var13.method1641(0, 0);
        }
        int var19 = var9.field1107;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class92.field1564[var9.field1092] * var19 >> 16;
        int var21 = class92.field1565[var9.field1092] * var19 >> 16;
        var12.method2164();
        var12.method2156(0, var9.field1084, var9.field1094, var9.field1092, var9.field1090, var9.field1096 + var12.field1437 / 2 + var20, var9.field1096 + var21);
        if (var9.field1086 != -1) {
            var13.method1641(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1657(1);
        }
        if (arg2 >= 2) {
            var18.method1657(16777215);
        }
        if (arg3 != 0) {
            var18.method1585(arg3);
        }
        class80.method1665(var18.field1381, 36, 32);
        if (var9.field1117 != -1) {
            var13.method1641(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1097 == 1) {
            class225 var22 = Statics.field1125;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class158.field2459 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class158.field2488 + "</col>";
            }
            var22.method3764(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1082.method3490(var18, var6);
        }
        class80.method1665(var14, var15, var16);
        class80.method1670(var17);
        class92.method1982();
        class92.field1544 = true;
        return var18;
    }

    @ObfuscatedName("ap.n(ZB)Z")
    public final boolean method1006(boolean arg0) {
        int var2 = this.field1102;
        int var3 = this.field1103;
        int var4 = this.field1108;
        if (arg0) {
            var2 = this.field1083;
            var3 = this.field1109;
            var4 = this.field1095;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1074.method3039(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1074.method3039(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1074.method3039(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ap.w(ZI)Lch;")
    public final class101 method1007(boolean arg0) {
        int var2 = this.field1102;
        int var3 = this.field1103;
        int var4 = this.field1108;
        if (arg0) {
            var2 = this.field1083;
            var3 = this.field1109;
            var4 = this.field1095;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2051(Statics.field1074, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2051(Statics.field1074, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2051(Statics.field1074, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1116 != 0) {
            var5.method2063(0, this.field1116, 0);
        }
        if (arg0 && this.field1077 != 0) {
            var5.method2063(0, this.field1077, 0);
        }
        if (this.field1087 != null) {
            for (int var10 = 0; var10 < this.field1087.length; var10++) {
                var5.method2064(this.field1087[var10], this.field1105[var10]);
            }
        }
        if (this.field1089 != null) {
            for (int var11 = 0; var11 < this.field1089.length; var11++) {
                var5.method2065(this.field1089[var11], this.field1122[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ap.z(ZB)Z")
    public final boolean method1010(boolean arg0) {
        int var2 = this.field1110;
        int var3 = this.field1088;
        if (arg0) {
            var2 = this.field1112;
            var3 = this.field1101;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1074.method3039(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1074.method3039(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ap.k(ZI)Lch;")
    public final class101 method1009(boolean arg0) {
        int var2 = this.field1110;
        int var3 = this.field1088;
        if (arg0) {
            var2 = this.field1112;
            var3 = this.field1101;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2051(Statics.field1074, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2051(Statics.field1074, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1087 != null) {
            for (int var7 = 0; var7 < this.field1087.length; var7++) {
                var4.method2064(this.field1087[var7], this.field1105[var7]);
            }
        }
        if (this.field1089 != null) {
            for (int var8 = 0; var8 < this.field1089.length; var8++) {
                var4.method2065(this.field1089[var8], this.field1122[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aq.o(I)V")
    public static void method745() {
        field1080.method3486();
        field1081.method3486();
        field1082.method3486();
    }

    @ObfuscatedName("ad.t(ZI)V")
    public static void method973(boolean arg0) {
        if (Statics.field158 != arg0) {
            method745();
            Statics.field158 = arg0;
        }
    }
}
