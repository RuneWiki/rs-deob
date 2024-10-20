package deob;

@ObfuscatedName("cz")
public final class class85 extends class87 {

    @ObfuscatedName("cz.v")
    public class459 field1073;

    @ObfuscatedName("cz.c")
    public class293 field1089;

    @ObfuscatedName("cz.i")
    public int field1070 = -1;

    @ObfuscatedName("cz.f")
    public int field1097 = -1;

    @ObfuscatedName("cz.n")
    public String[] field1094 = new String[3];

    @ObfuscatedName("cz.s")
    public int field1076;

    @ObfuscatedName("cz.l")
    public int field1077;

    @ObfuscatedName("cz.q")
    public int field1075;

    @ObfuscatedName("cz.o")
    public int field1079;

    @ObfuscatedName("cz.r")
    public int field1080;

    @ObfuscatedName("cz.p")
    public int field1081;

    @ObfuscatedName("cz.w")
    public int field1082;

    @ObfuscatedName("cz.k")
    public int field1083;

    @ObfuscatedName("cz.d")
    public class241 field1084;

    @ObfuscatedName("cz.m")
    public int field1088;

    @ObfuscatedName("cz.u")
    public int field1086;

    @ObfuscatedName("cz.t")
    public int field1087;

    @ObfuscatedName("cz.g")
    public int field1072;

    @ObfuscatedName("cz.x")
    public boolean field1074;

    @ObfuscatedName("cz.a")
    public int field1090;

    @ObfuscatedName("cz.y")
    public boolean field1085;

    @ObfuscatedName("cz.j")
    public int field1092;

    @ObfuscatedName("cz.e")
    public int field1093;

    @ObfuscatedName("cz.z")
    public class376 field1078;

    @ObfuscatedName("cz.h")
    public class376 field1095;

    @ObfuscatedName("cz.ae")
    public class376 field1096;

    @ObfuscatedName("cz.aq")
    public boolean field1071;

    @ObfuscatedName("cz.aw")
    public int field1098;

    @ObfuscatedName("cz.am")
    public int field1099;

    public class85() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1094[var1] = "";
        }
        this.field1076 = 0;
        this.field1077 = 0;
        this.field1079 = 0;
        this.field1080 = 0;
        this.field1074 = false;
        this.field1090 = 0;
        this.field1085 = false;
        this.field1078 = class376.field4271;
        this.field1095 = class376.field4271;
        this.field1096 = class376.field4271;
        this.field1071 = false;
    }

    @ObfuscatedName("cz.v(Lpi;I)V")
    public final void method2015(class438 arg0) {
        arg0.field4621 = 0;
        int var2 = arg0.method6971();
        this.field1070 = arg0.method7093();
        this.field1097 = arg0.method7093();
        int var3 = -1;
        this.field1090 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method6971();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method6971();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method7148();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = Statics.method268(var4[var5] - 512).field2096;
                    if (var8 != 0) {
                        this.field1090 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method6971();
            if (var11 < 0 || var11 >= Statics.field1630[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1121 = arg0.method7148();
        if (this.field1121 == 65535) {
            this.field1121 = -1;
        }
        this.field1141 = arg0.method7148();
        if (this.field1141 == 65535) {
            this.field1141 = -1;
        }
        this.field1119 = this.field1141;
        this.field1134 = arg0.method7148();
        if (this.field1134 == 65535) {
            this.field1134 = -1;
        }
        this.field1147 = arg0.method7148();
        if (this.field1147 == 65535) {
            this.field1147 = -1;
        }
        this.field1126 = arg0.method7148();
        if (this.field1126 == 65535) {
            this.field1126 = -1;
        }
        this.field1127 = arg0.method7148();
        if (this.field1127 == 65535) {
            this.field1127 = -1;
        }
        this.field1128 = arg0.method7148();
        if (this.field1128 == 65535) {
            this.field1128 = -1;
        }
        this.field1073 = new class459(arg0.method6981(), Statics.field1480);
        this.method2016();
        this.method2020();
        this.method2023();
        if (Statics.field4004 == this) {
            Statics.field4756 = this.field1073.method7528();
        }
        this.field1076 = arg0.method6971();
        this.field1077 = arg0.method7148();
        this.field1085 = arg0.method6971() == 1;
        if (client.field494 == 0 && client.field676 >= 2) {
            this.field1085 = false;
        }
        class169[] var12 = null;
        boolean var13 = false;
        if (arg0.field4621 < arg0.field4618.length) {
            int var14 = arg0.method7148();
            var13 = (var14 >> 15 & 0x1) == 1;
            if (var14 > 0 && var14 != 32768) {
                var12 = new class169[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var14 >> 12 - var15 & 0x1;
                    if (var16 == 1) {
                        var12[var15] = class169.method5915(var4[var15] - 512, arg0);
                    }
                }
            }
        }
        if (this.field1089 == null) {
            this.field1089 = new class293();
        }
        this.field1089.method5020(var4, var12, var13, var9, var2 == 1, var3);
    }

    @ObfuscatedName("cz.i(I)Z")
    public boolean method2037() {
        if (class376.field4271 == this.field1078) {
            this.method2018();
        }
        return class376.field4274 == this.field1078;
    }

    @ObfuscatedName("cz.f(I)V")
    public void method2016() {
        this.field1078 = class376.field4271;
    }

    @ObfuscatedName("cz.l(B)V")
    public void method2018() {
        this.field1078 = Statics.field399.method1610(this.field1073) ? class376.field4274 : class376.field4273;
    }

    @ObfuscatedName("cz.q(B)Z")
    public boolean method2027() {
        if (class376.field4271 == this.field1095) {
            this.method2021();
        }
        return class376.field4274 == this.field1095;
    }

    @ObfuscatedName("cz.o(I)V")
    public void method2020() {
        this.field1095 = class376.field4271;
    }

    @ObfuscatedName("cz.r(B)V")
    public void method2021() {
        this.field1095 = Statics.field3004 != null && Statics.field3004.method6131(this.field1073) ? class376.field4274 : class376.field4273;
    }

    @ObfuscatedName("cz.p(I)V")
    public void method2050() {
        for (int var1 = 0; var1 < 3; var1++) {
            if (client.field736[var1] != null && client.field736[var1].method2730(this.field1073.method7528()) != -1 && var1 != 2) {
                this.field1096 = class376.field4274;
                return;
            }
        }
        this.field1096 = class376.field4273;
    }

    @ObfuscatedName("cz.w(I)V")
    public void method2023() {
        this.field1096 = class376.field4271;
    }

    @ObfuscatedName("cz.k(I)Z")
    public boolean method2024() {
        if (class376.field4271 == this.field1096) {
            this.method2050();
        }
        return class376.field4274 == this.field1096;
    }

    @ObfuscatedName("cz.d(B)I")
    public int method2033() {
        return this.field1089 == null || this.field1089.field3297 == -1 ? 1 : class179.method344(this.field1089.field3297).field1905;
    }

    @ObfuscatedName("cz.c(B)Liq;")
    public final class241 method1809() {
        if (this.field1089 == null) {
            return null;
        }
        class191 var1 = this.field1149 != -1 && this.field1152 == 0 ? class191.method3011(this.field1149) : null;
        class191 var2 = this.field1146 == -1 || this.field1074 || this.field1146 == this.field1121 && var1 != null ? null : class191.method3011(this.field1146);
        class241 var3 = this.field1089.method5026(var1, this.field1150, var2, this.field1173);
        if (var3 == null) {
            return null;
        }
        var3.method4539();
        this.field1167 = var3.field2659;
        if (!this.field1074 && this.field1165 != -1 && this.field1157 != -1) {
            class241 var4 = class181.method2196(this.field1165).method3206(this.field1157);
            if (var4 != null) {
                var4.method4505(0, -this.field1158, 0);
                class241[] var5 = new class241[] { var3, var4 };
                var3 = new class241(var5, 2);
            }
        }
        if (!this.field1074 && this.field1084 != null) {
            if (client.field507 >= this.field1080) {
                this.field1084 = null;
            }
            if (client.field507 >= this.field1079 && client.field507 < this.field1080) {
                class241 var6 = this.field1084;
                var6.method4505(this.field1081 - this.field1132, this.field1082 - this.field1075, this.field1083 - this.field1116);
                if (this.field1174 == 512) {
                    var6.method4501();
                    var6.method4501();
                    var6.method4501();
                } else if (this.field1174 == 1024) {
                    var6.method4501();
                    var6.method4501();
                } else if (this.field1174 == 1536) {
                    var6.method4501();
                }
                class241[] var7 = new class241[] { var3, var6 };
                var3 = new class241(var7, 2);
                if (this.field1174 == 512) {
                    var6.method4501();
                } else if (this.field1174 == 1024) {
                    var6.method4501();
                    var6.method4501();
                } else if (this.field1174 == 1536) {
                    var6.method4501();
                    var6.method4501();
                    var6.method4501();
                }
                var6.method4505(this.field1132 - this.field1081, this.field1075 - this.field1082, this.field1116 - this.field1083);
            }
        }
        var3.field2751 = true;
        if (this.field1123 == 0 || client.field507 < this.field1168 || client.field507 >= this.field1169) {
            var3.field2798 = 0;
        } else {
            var3.field2760 = this.field1170;
            var3.field2796 = this.field1115;
            var3.field2735 = this.field1172;
            var3.field2798 = this.field1123;
        }
        return var3;
    }

    @ObfuscatedName("cz.m(IILgm;I)V")
    public final void method2026(int arg0, int arg1, class194 arg2) {
        if (this.field1149 != -1 && class191.method3011(this.field1149).field2159 == 1) {
            this.field1149 = -1;
        }
        this.field1122 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2062(arg0, arg1);
        } else if (this.field1178[0] >= 0 && this.field1178[0] < 104 && this.field1179[0] >= 0 && this.field1179[0] < 104) {
            if (class194.field2188 == arg2) {
                client.method5693(this, arg0, arg1, class194.field2188);
            }
            this.method2028(arg0, arg1, arg2);
        } else {
            this.method2062(arg0, arg1);
        }
    }

    @ObfuscatedName("cz.u(III)V")
    public void method2062(int arg0, int arg1) {
        this.field1177 = 0;
        this.field1171 = 0;
        this.field1180 = 0;
        this.field1178[0] = arg0;
        this.field1179[0] = arg1;
        int var3 = this.method2033();
        this.field1132 = this.field1178[0] * 128 + var3 * 64;
        this.field1116 = this.field1179[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("cz.t(IILgm;B)V")
    public final void method2028(int arg0, int arg1, class194 arg2) {
        if (this.field1177 < 9) {
            this.field1177++;
        }
        for (int var4 = this.field1177; var4 > 0; var4--) {
            this.field1178[var4] = this.field1178[var4 - 1];
            this.field1179[var4] = this.field1179[var4 - 1];
            this.field1124[var4] = this.field1124[var4 - 1];
        }
        this.field1178[0] = arg0;
        this.field1179[0] = arg1;
        this.field1124[0] = arg2;
    }

    @ObfuscatedName("cz.g(I)Z")
    public final boolean method2022() {
        return this.field1089 != null;
    }
}
