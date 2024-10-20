package deob;

@ObfuscatedName("cw")
public final class class83 extends class85 {

    @ObfuscatedName("cw.c")
    public class442 field1073;

    @ObfuscatedName("cw.l")
    public class284 field1066;

    @ObfuscatedName("cw.s")
    public int field1092 = -1;

    @ObfuscatedName("cw.e")
    public int field1072 = -1;

    @ObfuscatedName("cw.o")
    public String[] field1070 = new String[3];

    @ObfuscatedName("cw.i")
    public int field1071;

    @ObfuscatedName("cw.w")
    public int field1087;

    @ObfuscatedName("cw.v")
    public int field1082;

    @ObfuscatedName("cw.a")
    public int field1074;

    @ObfuscatedName("cw.y")
    public int field1075;

    @ObfuscatedName("cw.u")
    public int field1076;

    @ObfuscatedName("cw.h")
    public int field1077;

    @ObfuscatedName("cw.q")
    public int field1078;

    @ObfuscatedName("cw.x")
    public class204 field1079;

    @ObfuscatedName("cw.p")
    public int field1067;

    @ObfuscatedName("cw.n")
    public int field1081;

    @ObfuscatedName("cw.m")
    public int field1080;

    @ObfuscatedName("cw.d")
    public int field1083;

    @ObfuscatedName("cw.j")
    public boolean field1065;

    @ObfuscatedName("cw.f")
    public int field1085;

    @ObfuscatedName("cw.g")
    public boolean field1086;

    @ObfuscatedName("cw.t")
    public int field1084;

    @ObfuscatedName("cw.k")
    public int field1088;

    @ObfuscatedName("cw.b")
    public class360 field1089;

    @ObfuscatedName("cw.z")
    public class360 field1094;

    @ObfuscatedName("cw.ap")
    public class360 field1091;

    @ObfuscatedName("cw.af")
    public boolean field1068;

    @ObfuscatedName("cw.ak")
    public int field1093;

    @ObfuscatedName("cw.av")
    public int field1090;

    public class83() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1070[var1] = "";
        }
        this.field1071 = 0;
        this.field1087 = 0;
        this.field1074 = 0;
        this.field1075 = 0;
        this.field1065 = false;
        this.field1085 = 0;
        this.field1086 = false;
        this.field1089 = class360.field4177;
        this.field1094 = class360.field4177;
        this.field1091 = class360.field4177;
        this.field1068 = false;
    }

    @ObfuscatedName("cw.c(Lpi;I)V")
    public final void method2009(class421 arg0) {
        arg0.field4512 = 0;
        int var2 = arg0.method6686();
        this.field1092 = arg0.method6664();
        this.field1072 = arg0.method6664();
        int var3 = -1;
        this.field1085 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method6686();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method6686();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method6666();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class181.method1538(var4[var5] - 512).field2035;
                    if (var8 != 0) {
                        this.field1085 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method6686();
            if (var11 < 0 || var11 >= Statics.field9[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1116 = arg0.method6666();
        if (this.field1116 == 65535) {
            this.field1116 = -1;
        }
        this.field1117 = arg0.method6666();
        if (this.field1117 == 65535) {
            this.field1117 = -1;
        }
        this.field1149 = this.field1117;
        this.field1119 = arg0.method6666();
        if (this.field1119 == 65535) {
            this.field1119 = -1;
        }
        this.field1120 = arg0.method6666();
        if (this.field1120 == 65535) {
            this.field1120 = -1;
        }
        this.field1121 = arg0.method6666();
        if (this.field1121 == 65535) {
            this.field1121 = -1;
        }
        this.field1122 = arg0.method6666();
        if (this.field1122 == 65535) {
            this.field1122 = -1;
        }
        this.field1132 = arg0.method6666();
        if (this.field1132 == 65535) {
            this.field1132 = -1;
        }
        this.field1073 = new class442(arg0.method6674(), Statics.field1786);
        this.method2012();
        this.method2006();
        this.method2004();
        if (Statics.field2754 == this) {
            Statics.field4652 = this.field1073.method7231();
        }
        this.field1071 = arg0.method6686();
        this.field1087 = arg0.method6666();
        this.field1086 = arg0.method6686() == 1;
        if (client.field539 == 0 && client.field674 >= 2) {
            this.field1086 = false;
        }
        class161[] var12 = null;
        boolean var13 = false;
        if (arg0.field4512 < arg0.field4511.length) {
            int var14 = arg0.method6666();
            var13 = (var14 >> 15 & 0x1) == 1;
            if (var14 > 0 && var14 != 32768) {
                var12 = new class161[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var14 >> 12 - var15 & 0x1;
                    if (var16 == 1) {
                        var12[var15] = class161.method720(var4[var15] - 512, arg0);
                    }
                }
            }
        }
        if (this.field1066 == null) {
            this.field1066 = new class284();
        }
        this.field1066.method4830(var4, var12, var13, var9, var2 == 1, var3);
    }

    @ObfuscatedName("cw.s(I)Z")
    public boolean method2002() {
        if (class360.field4177 == this.field1089) {
            this.method2037();
        }
        return class360.field4176 == this.field1089;
    }

    @ObfuscatedName("cw.e(I)V")
    public void method2012() {
        this.field1089 = class360.field4177;
    }

    @ObfuscatedName("cw.r(I)V")
    public void method2037() {
        this.field1089 = Statics.field1606.method1583(this.field1073) ? class360.field4176 : class360.field4178;
    }

    @ObfuscatedName("cw.o(I)Z")
    public boolean method2005() {
        if (class360.field4177 == this.field1094) {
            this.method2007();
        }
        return class360.field4176 == this.field1094;
    }

    @ObfuscatedName("cw.a(B)V")
    public void method2006() {
        this.field1094 = class360.field4177;
    }

    @ObfuscatedName("cw.y(I)V")
    public void method2007() {
        this.field1094 = Statics.field888 != null && Statics.field888.method5787(this.field1073) ? class360.field4176 : class360.field4178;
    }

    @ObfuscatedName("cw.u(I)V")
    public void method2008() {
        for (int var1 = 0; var1 < 2; var1++) {
            if (client.field589[var1] != null && client.field589[var1].method2637(this.field1073.method7231()) != -1) {
                this.field1091 = class360.field4176;
                return;
            }
        }
        this.field1091 = class360.field4178;
    }

    @ObfuscatedName("cw.h(I)V")
    public void method2004() {
        this.field1091 = class360.field4177;
    }

    @ObfuscatedName("cw.q(I)Z")
    public boolean method2040() {
        if (class360.field4177 == this.field1091) {
            this.method2008();
        }
        return class360.field4176 == this.field1091;
    }

    @ObfuscatedName("cw.x(B)I")
    public int method2011() {
        return this.field1066 == null || this.field1066.field3238 == -1 ? 1 : class171.method2378(this.field1066.field3238).field1854;
    }

    @ObfuscatedName("cw.l(B)Lgf;")
    public final class204 method1790() {
        if (this.field1066 == null) {
            return null;
        }
        class183 var1 = this.field1144 != -1 && this.field1127 == 0 ? class183.method1980(this.field1144) : null;
        class183 var2 = this.field1141 == -1 || this.field1065 || this.field1141 == this.field1116 && var1 != null ? null : class183.method1980(this.field1141);
        class204 var3 = this.field1066.method4837(var1, this.field1162, var2, this.field1142);
        if (var3 == null) {
            return null;
        }
        var3.method3807();
        this.field1123 = var3.field2372;
        if (!this.field1065 && this.field1155 != -1 && this.field1150 != -1) {
            class204 var4 = class173.method4901(this.field1155).method3009(this.field1150);
            if (var4 != null) {
                var4.method3889(0, -this.field1153, 0);
                class204[] var5 = new class204[] { var3, var4 };
                var3 = new class204(var5, 2);
            }
        }
        if (!this.field1065 && this.field1079 != null) {
            if (client.field682 >= this.field1075) {
                this.field1079 = null;
            }
            if (client.field682 >= this.field1074 && client.field682 < this.field1075) {
                class204 var6 = this.field1079;
                var6.method3889(this.field1076 - this.field1161, this.field1077 - this.field1082, this.field1078 - this.field1152);
                if (this.field1169 == 512) {
                    var6.method3819();
                    var6.method3819();
                    var6.method3819();
                } else if (this.field1169 == 1024) {
                    var6.method3819();
                    var6.method3819();
                } else if (this.field1169 == 1536) {
                    var6.method3819();
                }
                class204[] var7 = new class204[] { var3, var6 };
                var3 = new class204(var7, 2);
                if (this.field1169 == 512) {
                    var6.method3819();
                } else if (this.field1169 == 1024) {
                    var6.method3819();
                    var6.method3819();
                } else if (this.field1169 == 1536) {
                    var6.method3819();
                    var6.method3819();
                    var6.method3819();
                }
                var6.method3889(this.field1161 - this.field1076, this.field1082 - this.field1077, this.field1152 - this.field1078);
            }
        }
        var3.field2498 = true;
        if (this.field1168 == 0 || client.field682 < this.field1163 || client.field682 >= this.field1164) {
            var3.field2491 = 0;
        } else {
            var3.field2509 = this.field1165;
            var3.field2510 = this.field1156;
            var3.field2448 = this.field1167;
            var3.field2491 = this.field1168;
        }
        return var3;
    }

    @ObfuscatedName("cw.p(IILgl;I)V")
    public final void method2018(int arg0, int arg1, class186 arg2) {
        if (this.field1144 != -1 && class183.method1980(this.field1144).field2100 == 1) {
            this.field1144 = -1;
        }
        this.field1139 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2019(arg0, arg1);
        } else if (this.field1173[0] >= 0 && this.field1173[0] < 104 && this.field1147[0] >= 0 && this.field1147[0] < 104) {
            if (class186.field2133 == arg2) {
                client.method2589(this, arg0, arg1, class186.field2133);
            }
            this.method2014(arg0, arg1, arg2);
        } else {
            this.method2019(arg0, arg1);
        }
    }

    @ObfuscatedName("cw.n(IIB)V")
    public void method2019(int arg0, int arg1) {
        this.field1172 = 0;
        this.field1177 = 0;
        this.field1176 = 0;
        this.field1173[0] = arg0;
        this.field1147[0] = arg1;
        int var3 = this.method2011();
        this.field1161 = this.field1173[0] * 128 + var3 * 64;
        this.field1152 = this.field1147[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("cw.m(IILgl;B)V")
    public final void method2014(int arg0, int arg1, class186 arg2) {
        if (this.field1172 < 9) {
            this.field1172++;
        }
        for (int var4 = this.field1172; var4 > 0; var4--) {
            this.field1173[var4] = this.field1173[var4 - 1];
            this.field1147[var4] = this.field1147[var4 - 1];
            this.field1175[var4] = this.field1175[var4 - 1];
        }
        this.field1173[0] = arg0;
        this.field1147[0] = arg1;
        this.field1175[0] = arg2;
    }

    @ObfuscatedName("cw.d(I)Z")
    public final boolean method2015() {
        return this.field1066 != null;
    }
}
