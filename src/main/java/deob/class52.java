package deob;

@ObfuscatedName("as")
public class class52 extends class204 {

    @ObfuscatedName("as.w")
    public static class193 field1108 = new class193(64);

    @ObfuscatedName("as.y")
    public static class193 field1109 = new class193(50);

    @ObfuscatedName("as.o")
    public static class193 field1110 = new class193(200);

    @ObfuscatedName("as.e")
    public int field1111;

    @ObfuscatedName("as.v")
    public int field1116;

    @ObfuscatedName("as.p")
    public String field1113 = "null";

    @ObfuscatedName("as.m")
    public short[] field1114;

    @ObfuscatedName("as.b")
    public short[] field1117;

    @ObfuscatedName("as.s")
    public short[] field1136;

    @ObfuscatedName("as.x")
    public short[] field1115;

    @ObfuscatedName("as.z")
    public int field1118 = 2000;

    @ObfuscatedName("as.d")
    public int field1119 = 0;

    @ObfuscatedName("as.a")
    public int field1130 = 0;

    @ObfuscatedName("as.t")
    public int field1146 = 0;

    @ObfuscatedName("as.k")
    public int field1122 = 0;

    @ObfuscatedName("as.f")
    public int field1123 = 0;

    @ObfuscatedName("as.g")
    public int field1124 = 0;

    @ObfuscatedName("as.i")
    public int field1125 = 1;

    @ObfuscatedName("as.ah")
    public boolean field1126 = false;

    @ObfuscatedName("as.ag")
    public String[] field1127 = new String[] { null, null, class157.field2492, null, null };

    @ObfuscatedName("as.ac")
    public String[] field1128 = new String[] { null, null, null, null, class157.field2301 };

    @ObfuscatedName("as.al")
    public int field1139 = -1;

    @ObfuscatedName("as.aj")
    public int field1134 = -1;

    @ObfuscatedName("as.at")
    public int field1131 = 0;

    @ObfuscatedName("as.ap")
    public int field1129 = -1;

    @ObfuscatedName("as.aa")
    public int field1133 = -1;

    @ObfuscatedName("as.ak")
    public int field1153 = 0;

    @ObfuscatedName("as.an")
    public int field1120 = -1;

    @ObfuscatedName("as.au")
    public int field1150 = -1;

    @ObfuscatedName("as.ai")
    public int field1137 = -1;

    @ObfuscatedName("as.az")
    public int field1138 = -1;

    @ObfuscatedName("as.ao")
    public int field1121 = -1;

    @ObfuscatedName("as.av")
    public int field1140 = -1;

    @ObfuscatedName("as.ad")
    public int[] field1141;

    @ObfuscatedName("as.af")
    public int[] field1142;

    @ObfuscatedName("as.ax")
    public int field1143 = -1;

    @ObfuscatedName("as.ae")
    public int field1144 = -1;

    @ObfuscatedName("as.aw")
    public int field1145 = 128;

    @ObfuscatedName("as.ay")
    public int field1103 = 128;

    @ObfuscatedName("as.ab")
    public int field1112 = 128;

    @ObfuscatedName("as.ar")
    public int field1148 = 0;

    @ObfuscatedName("as.am")
    public int field1149 = 0;

    @ObfuscatedName("as.aq")
    public int field1135 = 0;

    @ObfuscatedName("as.as")
    public boolean field1151 = false;

    @ObfuscatedName("as.bn")
    public int field1152 = -1;

    @ObfuscatedName("as.bd")
    public int field1147 = -1;

    @ObfuscatedName("aa.n(II)Las;")
    public static class52 method724(int arg0) {
        class52 var1 = (class52) field1108.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1105.method3094(10, arg0);
        class52 var3 = new class52();
        var3.field1111 = arg0;
        if (var2 != null) {
            var3.method1023(new class119(var2));
        }
        var3.method1022();
        if (var3.field1144 != -1) {
            var3.method1025(method724(var3.field1144), method724(var3.field1143));
        }
        if (var3.field1147 != -1) {
            var3.method1071(method724(var3.field1147), method724(var3.field1152));
        }
        if (!Statics.field1107 && var3.field1126) {
            var3.field1113 = class157.field2394;
            var3.field1151 = false;
            var3.field1127 = null;
            var3.field1128 = null;
            var3.field1135 = 0;
        }
        field1108.method3488(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.q(I)V")
    public void method1022() {
    }

    @ObfuscatedName("as.c(Ldc;I)V")
    public void method1023(class119 arg0) {
        while (true) {
            int var2 = arg0.method2360();
            if (var2 == 0) {
                return;
            }
            this.method1024(arg0, var2);
        }
    }

    @ObfuscatedName("as.l(Ldc;IS)V")
    public void method1024(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1116 = arg0.method2430();
        } else if (arg1 == 2) {
            this.field1113 = arg0.method2368();
        } else if (arg1 == 4) {
            this.field1118 = arg0.method2430();
        } else if (arg1 == 5) {
            this.field1119 = arg0.method2430();
        } else if (arg1 == 6) {
            this.field1130 = arg0.method2430();
        } else if (arg1 == 7) {
            this.field1122 = arg0.method2430();
            if (this.field1122 > 32767) {
                this.field1122 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1123 = arg0.method2430();
            if (this.field1123 > 32767) {
                this.field1123 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1124 = 1;
        } else if (arg1 == 12) {
            this.field1125 = arg0.method2365();
        } else if (arg1 == 16) {
            this.field1126 = true;
        } else if (arg1 == 23) {
            this.field1139 = arg0.method2430();
            this.field1131 = arg0.method2360();
        } else if (arg1 == 24) {
            this.field1134 = arg0.method2430();
        } else if (arg1 == 25) {
            this.field1129 = arg0.method2430();
            this.field1153 = arg0.method2360();
        } else if (arg1 == 26) {
            this.field1133 = arg0.method2430();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1127[arg1 - 30] = arg0.method2368();
            if (this.field1127[arg1 - 30].equalsIgnoreCase(class157.field2302)) {
                this.field1127[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1128[arg1 - 35] = arg0.method2368();
        } else if (arg1 == 40) {
            int var3 = arg0.method2360();
            this.field1114 = new short[var3];
            this.field1117 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1114[var4] = (short) arg0.method2430();
                this.field1117[var4] = (short) arg0.method2430();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2360();
            this.field1136 = new short[var5];
            this.field1115 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1136[var6] = (short) arg0.method2430();
                this.field1115[var6] = (short) arg0.method2430();
            }
        } else if (arg1 == 65) {
            this.field1151 = true;
        } else if (arg1 == 78) {
            this.field1120 = arg0.method2430();
        } else if (arg1 == 79) {
            this.field1150 = arg0.method2430();
        } else if (arg1 == 90) {
            this.field1137 = arg0.method2430();
        } else if (arg1 == 91) {
            this.field1121 = arg0.method2430();
        } else if (arg1 == 92) {
            this.field1138 = arg0.method2430();
        } else if (arg1 == 93) {
            this.field1140 = arg0.method2430();
        } else if (arg1 == 95) {
            this.field1146 = arg0.method2430();
        } else if (arg1 == 97) {
            this.field1143 = arg0.method2430();
        } else if (arg1 == 98) {
            this.field1144 = arg0.method2430();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1141 == null) {
                this.field1141 = new int[10];
                this.field1142 = new int[10];
            }
            this.field1141[arg1 - 100] = arg0.method2430();
            this.field1142[arg1 - 100] = arg0.method2430();
        } else if (arg1 == 110) {
            this.field1145 = arg0.method2430();
        } else if (arg1 == 111) {
            this.field1103 = arg0.method2430();
        } else if (arg1 == 112) {
            this.field1112 = arg0.method2430();
        } else if (arg1 == 113) {
            this.field1148 = arg0.method2512();
        } else if (arg1 == 114) {
            this.field1149 = arg0.method2512();
        } else if (arg1 == 115) {
            this.field1135 = arg0.method2360();
        } else if (arg1 == 139) {
            this.field1152 = arg0.method2430();
        } else if (arg1 == 140) {
            this.field1147 = arg0.method2430();
        }
    }

    @ObfuscatedName("as.r(Las;Las;B)V")
    public void method1025(class52 arg0, class52 arg1) {
        this.field1116 = arg0.field1116;
        this.field1118 = arg0.field1118;
        this.field1119 = arg0.field1119;
        this.field1130 = arg0.field1130;
        this.field1146 = arg0.field1146;
        this.field1122 = arg0.field1122;
        this.field1123 = arg0.field1123;
        this.field1114 = arg0.field1114;
        this.field1117 = arg0.field1117;
        this.field1136 = arg0.field1136;
        this.field1115 = arg0.field1115;
        this.field1113 = arg1.field1113;
        this.field1126 = arg1.field1126;
        this.field1125 = arg1.field1125;
        this.field1124 = 1;
    }

    @ObfuscatedName("as.u(Las;Las;B)V")
    public void method1071(class52 arg0, class52 arg1) {
        this.field1116 = arg0.field1116;
        this.field1118 = arg0.field1118;
        this.field1119 = arg0.field1119;
        this.field1130 = arg0.field1130;
        this.field1146 = arg0.field1146;
        this.field1122 = arg0.field1122;
        this.field1123 = arg0.field1123;
        this.field1114 = arg1.field1114;
        this.field1117 = arg1.field1117;
        this.field1136 = arg1.field1136;
        this.field1115 = arg1.field1115;
        this.field1113 = arg1.field1113;
        this.field1126 = arg1.field1126;
        this.field1124 = arg1.field1124;
        this.field1139 = arg1.field1139;
        this.field1134 = arg1.field1134;
        this.field1120 = arg1.field1120;
        this.field1129 = arg1.field1129;
        this.field1133 = arg1.field1133;
        this.field1150 = arg1.field1150;
        this.field1137 = arg1.field1137;
        this.field1138 = arg1.field1138;
        this.field1121 = arg1.field1121;
        this.field1140 = arg1.field1140;
        this.field1135 = arg1.field1135;
        this.field1127 = arg1.field1127;
        this.field1128 = new String[5];
        if (arg1.field1128 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1128[var3] = arg1.field1128[var3];
            }
        }
        this.field1128[4] = class157.field2522;
        this.field1125 = 0;
    }

    @ObfuscatedName("as.j(II)Lcg;")
    public final class100 method1027(int arg0) {
        if (this.field1141 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1142[var3] && this.field1142[var3] != 0) {
                    var2 = this.field1141[var3];
                }
            }
            if (var2 != -1) {
                return method724(var2).method1027(1);
            }
        }
        class100 var4 = class100.method2075(Statics.field1132, this.field1116, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1145 != 128 || this.field1103 != 128 || this.field1112 != 128) {
            var4.method2088(this.field1145, this.field1103, this.field1112);
        }
        if (this.field1114 != null) {
            for (int var5 = 0; var5 < this.field1114.length; var5++) {
                var4.method2085(this.field1114[var5], this.field1117[var5]);
            }
        }
        if (this.field1136 != null) {
            for (int var6 = 0; var6 < this.field1136.length; var6++) {
                var4.method2124(this.field1136[var6], this.field1115[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("as.w(II)Ldt;")
    public final class105 method1070(int arg0) {
        if (this.field1141 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1142[var3] && this.field1142[var3] != 0) {
                    var2 = this.field1141[var3];
                }
            }
            if (var2 != -1) {
                return method724(var2).method1070(1);
            }
        }
        class105 var4 = (class105) field1109.method3475((long) this.field1111);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2075(Statics.field1132, this.field1116, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1145 != 128 || this.field1103 != 128 || this.field1112 != 128) {
            var5.method2088(this.field1145, this.field1103, this.field1112);
        }
        if (this.field1114 != null) {
            for (int var6 = 0; var6 < this.field1114.length; var6++) {
                var5.method2085(this.field1114[var6], this.field1117[var6]);
            }
        }
        if (this.field1136 != null) {
            for (int var7 = 0; var7 < this.field1136.length; var7++) {
                var5.method2124(this.field1136[var7], this.field1115[var7]);
            }
        }
        class105 var8 = var5.method2079(this.field1148 + 64, this.field1149 * 5 + 768, -50, -10, -50);
        var8.field1815 = true;
        field1109.method3488(var8, (long) this.field1111);
        return var8;
    }

    @ObfuscatedName("as.y(IB)Las;")
    public class52 method1029(int arg0) {
        if (this.field1141 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1142[var3] && this.field1142[var3] != 0) {
                    var2 = this.field1141[var3];
                }
            }
            if (var2 != -1) {
                return method724(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("m.h(II)Ljava/lang/String;")
    public static final String method164(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class157.field2427 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class157.field2543 + "</col>";
        }
    }

    @ObfuscatedName("as.e(ZI)Z")
    public final boolean method1049(boolean arg0) {
        int var2 = this.field1139;
        int var3 = this.field1134;
        int var4 = this.field1120;
        if (arg0) {
            var2 = this.field1129;
            var3 = this.field1133;
            var4 = this.field1150;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1132.method3022(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1132.method3022(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1132.method3022(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("as.v(ZI)Lcg;")
    public final class100 method1052(boolean arg0) {
        int var2 = this.field1139;
        int var3 = this.field1134;
        int var4 = this.field1120;
        if (arg0) {
            var2 = this.field1129;
            var3 = this.field1133;
            var4 = this.field1150;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2075(Statics.field1132, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2075(Statics.field1132, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2075(Statics.field1132, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1131 != 0) {
            var5.method2071(0, this.field1131, 0);
        }
        if (arg0 && this.field1153 != 0) {
            var5.method2071(0, this.field1153, 0);
        }
        if (this.field1114 != null) {
            for (int var10 = 0; var10 < this.field1114.length; var10++) {
                var5.method2085(this.field1114[var10], this.field1117[var10]);
            }
        }
        if (this.field1136 != null) {
            for (int var11 = 0; var11 < this.field1136.length; var11++) {
                var5.method2124(this.field1136[var11], this.field1115[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("as.p(ZI)Z")
    public final boolean method1031(boolean arg0) {
        int var2 = this.field1137;
        int var3 = this.field1138;
        if (arg0) {
            var2 = this.field1121;
            var3 = this.field1140;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1132.method3022(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1132.method3022(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("as.m(ZI)Lcg;")
    public final class100 method1064(boolean arg0) {
        int var2 = this.field1137;
        int var3 = this.field1138;
        if (arg0) {
            var2 = this.field1121;
            var3 = this.field1140;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2075(Statics.field1132, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2075(Statics.field1132, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1114 != null) {
            for (int var7 = 0; var7 < this.field1114.length; var7++) {
                var4.method2085(this.field1114[var7], this.field1117[var7]);
            }
        }
        if (this.field1136 != null) {
            for (int var8 = 0; var8 < this.field1136.length; var8++) {
                var4.method2124(this.field1136[var8], this.field1115[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("an.b(I)V")
    public static void method737() {
        field1110.method3479();
    }

    @ObfuscatedName("x.s(ZB)V")
    public static void method191(boolean arg0) {
        if (Statics.field1107 != arg0) {
            field1108.method3479();
            field1109.method3479();
            field1110.method3479();
            Statics.field1107 = arg0;
        }
    }
}
