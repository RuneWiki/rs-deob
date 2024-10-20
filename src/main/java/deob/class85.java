package deob;

@ObfuscatedName("ca")
public final class class85 extends class87 {

    @ObfuscatedName("ca.o")
    public class461 field1100;

    @ObfuscatedName("ca.q")
    public class293 field1113;

    @ObfuscatedName("ca.l")
    public int field1095 = -1;

    @ObfuscatedName("ca.k")
    public int field1098 = -1;

    @ObfuscatedName("ca.m")
    public String[] field1124 = new String[3];

    @ObfuscatedName("ca.p")
    public int field1114;

    @ObfuscatedName("ca.s")
    public int field1122;

    @ObfuscatedName("ca.r")
    public int field1102;

    @ObfuscatedName("ca.v")
    public int field1121;

    @ObfuscatedName("ca.y")
    public int field1104;

    @ObfuscatedName("ca.c")
    public int field1105;

    @ObfuscatedName("ca.w")
    public int field1106;

    @ObfuscatedName("ca.b")
    public int field1107;

    @ObfuscatedName("ca.t")
    public class212 field1108;

    @ObfuscatedName("ca.g")
    public int field1109;

    @ObfuscatedName("ca.x")
    public int field1110;

    @ObfuscatedName("ca.n")
    public int field1111;

    @ObfuscatedName("ca.e")
    public int field1118;

    @ObfuscatedName("ca.h")
    public boolean field1099;

    @ObfuscatedName("ca.f")
    public int field1112;

    @ObfuscatedName("ca.d")
    public boolean field1115;

    @ObfuscatedName("ca.j")
    public int field1116;

    @ObfuscatedName("ca.z")
    public int field1117;

    @ObfuscatedName("ca.i")
    public class377 field1097;

    @ObfuscatedName("ca.u")
    public class377 field1119;

    @ObfuscatedName("ca.ag")
    public class377 field1120;

    @ObfuscatedName("ca.ar")
    public boolean field1096;

    @ObfuscatedName("ca.am")
    public int field1101;

    @ObfuscatedName("ca.ac")
    public int field1123;

    public class85() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1124[var1] = "";
        }
        this.field1114 = 0;
        this.field1122 = 0;
        this.field1121 = 0;
        this.field1104 = 0;
        this.field1099 = false;
        this.field1112 = 0;
        this.field1115 = false;
        this.field1097 = class377.field4338;
        this.field1119 = class377.field4338;
        this.field1120 = class377.field4338;
        this.field1096 = false;
    }

    @ObfuscatedName("ca.o(Lpx;I)V")
    public final void method1995(class440 arg0) {
        arg0.field4678 = 0;
        int var2 = arg0.method7071();
        this.field1095 = arg0.method7034();
        this.field1098 = arg0.method7034();
        int var3 = -1;
        this.field1112 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method7071();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method7071();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method7082();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class189.method2903(var4[var5] - 512).field2164;
                    if (var8 != 0) {
                        this.field1112 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method7071();
            if (var11 < 0 || var11 >= Statics.field4470[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1145 = arg0.method7082();
        if (this.field1145 == 65535) {
            this.field1145 = -1;
        }
        this.field1202 = arg0.method7082();
        if (this.field1202 == 65535) {
            this.field1202 = -1;
        }
        this.field1137 = this.field1202;
        this.field1146 = arg0.method7082();
        if (this.field1146 == 65535) {
            this.field1146 = -1;
        }
        this.field1147 = arg0.method7082();
        if (this.field1147 == 65535) {
            this.field1147 = -1;
        }
        this.field1148 = arg0.method7082();
        if (this.field1148 == 65535) {
            this.field1148 = -1;
        }
        this.field1149 = arg0.method7082();
        if (this.field1149 == 65535) {
            this.field1149 = -1;
        }
        this.field1150 = arg0.method7082();
        if (this.field1150 == 65535) {
            this.field1150 = -1;
        }
        this.field1100 = new class461(arg0.method7044(), Statics.field4426);
        this.method1997();
        this.method1999();
        this.method2003();
        if (Statics.field2657 == this) {
            Statics.field4814 = this.field1100.method7492();
        }
        this.field1114 = arg0.method7071();
        this.field1122 = arg0.method7082();
        this.field1115 = arg0.method7071() == 1;
        if (client.field597 == 0 && client.field664 >= 2) {
            this.field1115 = false;
        }
        class169[] var12 = null;
        boolean var13 = false;
        int var14 = arg0.method7082();
        boolean var15 = (var14 >> 15 & 0x1) == 1;
        if (var14 > 0 && var14 != 32768) {
            var12 = new class169[12];
            for (int var16 = 0; var16 < 12; var16++) {
                int var17 = var14 >> 12 - var16 & 0x1;
                if (var17 == 1) {
                    var12[var16] = class169.method2645(var4[var16] - 512, arg0);
                }
            }
        }
        if (arg0.field4678 < arg0.field4679.length) {
            for (int var18 = 0; var18 < 3; var18++) {
                this.field1124[var18] = arg0.method7044();
            }
        }
        if (this.field1113 == null) {
            this.field1113 = new class293();
        }
        this.field1113.method4936(var4, var12, var15, var9, var2 == 1, var3);
    }

    @ObfuscatedName("ca.l(I)Z")
    public boolean method1996() {
        if (class377.field4338 == this.field1097) {
            this.method1998();
        }
        return class377.field4337 == this.field1097;
    }

    @ObfuscatedName("ca.k(B)V")
    public void method1997() {
        this.field1097 = class377.field4338;
    }

    @ObfuscatedName("ca.r(I)V")
    public void method1998() {
        this.field1097 = Statics.field4350.method1583(this.field1100) ? class377.field4337 : class377.field4339;
    }

    @ObfuscatedName("ca.v(I)Z")
    public boolean method2028() {
        if (class377.field4338 == this.field1119) {
            this.method2042();
        }
        return class377.field4337 == this.field1119;
    }

    @ObfuscatedName("ca.y(B)V")
    public void method1999() {
        this.field1119 = class377.field4338;
    }

    @ObfuscatedName("ca.c(I)V")
    public void method2042() {
        this.field1119 = Statics.field303 != null && Statics.field303.method6029(this.field1100) ? class377.field4337 : class377.field4339;
    }

    @ObfuscatedName("ca.w(I)V")
    public void method2001() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field724[var1] != null && client.field724[var1].method2685(this.field1100.method7492()) != -1 && var1 != 2) {
                this.field1120 = class377.field4337;
                return;
            }
        }
        this.field1120 = class377.field4339;
    }

    @ObfuscatedName("ca.b(I)V")
    public void method2003() {
        this.field1120 = class377.field4338;
    }

    @ObfuscatedName("ca.t(I)Z")
    public boolean method2018() {
        if (class377.field4338 == this.field1120) {
            this.method2001();
        }
        return class377.field4337 == this.field1120;
    }

    @ObfuscatedName("ca.g(I)I")
    public int method2004() {
        return this.field1113 == null || this.field1113.field3362 == -1 ? 1 : class179.method4396(this.field1113.field3362).field1950;
    }

    @ObfuscatedName("ca.q(I)Lhv;")
    public final class212 method1774() {
        if (this.field1113 == null) {
            return null;
        }
        class191 var1 = this.field1212 != -1 && this.field1181 == 0 ? class191.method2497(this.field1212) : null;
        class191 var2 = this.field1175 == -1 || this.field1099 || this.field1175 == this.field1145 && var1 != null ? null : class191.method2497(this.field1175);
        class212 var3 = this.field1113.method4943(var1, this.field1179, var2, this.field1176);
        if (var3 == null) {
            return null;
        }
        var3.method3946();
        this.field1196 = var3.field2487;
        if (!this.field1099 && this.field1207 != -1 && this.field1210 != -1) {
            class212 var4 = class181.method2676(this.field1207).method3155(this.field1210);
            if (var4 != null) {
                var4.method3970(0, -this.field1152, 0);
                class212[] var5 = new class212[] { var3, var4 };
                var3 = new class212(var5, 2);
            }
        }
        if (!this.field1099 && this.field1108 != null) {
            if (client.field631 >= this.field1104) {
                this.field1108 = null;
            }
            if (client.field631 >= this.field1121 && client.field631 < this.field1104) {
                class212 var6 = this.field1108;
                var6.method3970(this.field1105 - this.field1182, this.field1106 - this.field1102, this.field1107 - this.field1138);
                if (this.field1203 == 512) {
                    var6.method3958();
                    var6.method3958();
                    var6.method3958();
                } else if (this.field1203 == 1024) {
                    var6.method3958();
                    var6.method3958();
                } else if (this.field1203 == 1536) {
                    var6.method3958();
                }
                class212[] var7 = new class212[] { var3, var6 };
                var3 = new class212(var7, 2);
                if (this.field1203 == 512) {
                    var6.method3958();
                } else if (this.field1203 == 1024) {
                    var6.method3958();
                    var6.method3958();
                } else if (this.field1203 == 1536) {
                    var6.method3958();
                    var6.method3958();
                    var6.method3958();
                }
                var6.method3970(this.field1182 - this.field1105, this.field1102 - this.field1106, this.field1138 - this.field1107);
            }
        }
        var3.field2624 = true;
        if (this.field1141 == 0 || client.field631 < this.field1197 || client.field631 >= this.field1198) {
            var3.field2625 = 0;
        } else {
            var3.field2622 = this.field1144;
            var3.field2623 = this.field1200;
            var3.field2619 = this.field1154;
            var3.field2625 = this.field1141;
        }
        return var3;
    }

    @ObfuscatedName("ca.x(IILgd;I)V")
    public final void method2006(int arg0, int arg1, class194 arg2) {
        if (this.field1212 != -1 && class191.method2497(this.field1212).field2207 == 1) {
            this.field1212 = -1;
        }
        this.field1173 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2007(arg0, arg1);
        } else if (this.field1194[0] >= 0 && this.field1194[0] < 104 && this.field1208[0] >= 0 && this.field1208[0] < 104) {
            if (class194.field2249 == arg2) {
                client.method2405(this, arg0, arg1, class194.field2249);
            }
            this.method2008(arg0, arg1, arg2);
        } else {
            this.method2007(arg0, arg1);
        }
    }

    @ObfuscatedName("ca.n(III)V")
    public void method2007(int arg0, int arg1) {
        this.field1206 = 0;
        this.field1201 = 0;
        this.field1195 = 0;
        this.field1194[0] = arg0;
        this.field1208[0] = arg1;
        int var3 = this.method2004();
        this.field1182 = this.field1194[0] * 128 + var3 * 64;
        this.field1138 = this.field1208[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("ca.e(IILgd;I)V")
    public final void method2008(int arg0, int arg1, class194 arg2) {
        if (this.field1206 < 9) {
            this.field1206++;
        }
        for (int var4 = this.field1206; var4 > 0; var4--) {
            this.field1194[var4] = this.field1194[var4 - 1];
            this.field1208[var4] = this.field1208[var4 - 1];
            this.field1164[var4] = this.field1164[var4 - 1];
        }
        this.field1194[0] = arg0;
        this.field1208[0] = arg1;
        this.field1164[0] = arg2;
    }

    @ObfuscatedName("ca.h(B)Z")
    public final boolean method2009() {
        return this.field1113 != null;
    }
}
