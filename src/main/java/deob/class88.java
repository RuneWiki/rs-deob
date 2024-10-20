package deob;

@ObfuscatedName("cl")
public final class class88 extends class91 {

    @ObfuscatedName("cl.f")
    public class497 field1115;

    @ObfuscatedName("cl.w")
    public class307 field1107;

    @ObfuscatedName("cl.v")
    public int field1108 = -1;

    @ObfuscatedName("cl.s")
    public int field1109 = -1;

    @ObfuscatedName("cl.j")
    public String[] field1111 = new String[3];

    @ObfuscatedName("cl.i")
    public int field1112;

    @ObfuscatedName("cl.n")
    public int field1119;

    @ObfuscatedName("cl.l")
    public int field1114;

    @ObfuscatedName("cl.k")
    public int field1132;

    @ObfuscatedName("cl.c")
    public int field1123;

    @ObfuscatedName("cl.r")
    public int field1118;

    @ObfuscatedName("cl.b")
    public int field1122;

    @ObfuscatedName("cl.m")
    public int field1124;

    @ObfuscatedName("cl.t")
    public class228 field1120;

    @ObfuscatedName("cl.h")
    public int field1121;

    @ObfuscatedName("cl.p")
    public int field1131;

    @ObfuscatedName("cl.o")
    public int field1106;

    @ObfuscatedName("cl.u")
    public int field1116;

    @ObfuscatedName("cl.x")
    public boolean field1113;

    @ObfuscatedName("cl.a")
    public int field1126;

    @ObfuscatedName("cl.q")
    public boolean field1127;

    @ObfuscatedName("cl.d")
    public int field1128;

    @ObfuscatedName("cl.e")
    public int field1129;

    @ObfuscatedName("cl.g")
    public class406 field1130;

    @ObfuscatedName("cl.y")
    public class406 field1117;

    @ObfuscatedName("cl.af")
    public class406 field1125;

    @ObfuscatedName("cl.aa")
    public boolean field1133;

    @ObfuscatedName("cl.ai")
    public int field1134;

    @ObfuscatedName("cl.ag")
    public int field1135;

    public class88() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1111[var1] = "";
        }
        this.field1112 = 0;
        this.field1119 = 0;
        this.field1132 = 0;
        this.field1123 = 0;
        this.field1113 = false;
        this.field1126 = 0;
        this.field1127 = false;
        this.field1130 = class406.field4579;
        this.field1117 = class406.field4579;
        this.field1125 = class406.field4579;
        this.field1133 = false;
    }

    @ObfuscatedName("cl.f(Lrd;I)V")
    public final void method2242(class474 arg0) {
        arg0.field4939 = 0;
        int var2 = arg0.method7964();
        int var3 = -1;
        this.field1108 = arg0.method7965();
        this.field1109 = arg0.method7965();
        int var4 = -1;
        this.field1126 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method7964();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method7964();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8032();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class201.method2583(var5[var6] - 512).field2258;
                    if (var9 != 0) {
                        this.field1126 = var9;
                    }
                }
            }
        }
        int[] var10 = new int[5];
        for (int var11 = 0; var11 < 5; var11++) {
            int var12 = arg0.method7964();
            if (var12 < 0 || var12 >= Statics.field1436[var11].length) {
                var12 = 0;
            }
            var10[var11] = var12;
        }
        this.field1166 = arg0.method8032();
        if (this.field1166 == 65535) {
            this.field1166 = -1;
        }
        this.field1217 = arg0.method8032();
        if (this.field1217 == 65535) {
            this.field1217 = -1;
        }
        this.field1168 = this.field1217;
        this.field1223 = arg0.method8032();
        if (this.field1223 == 65535) {
            this.field1223 = -1;
        }
        this.field1183 = arg0.method8032();
        if (this.field1183 == 65535) {
            this.field1183 = -1;
        }
        this.field1203 = arg0.method8032();
        if (this.field1203 == 65535) {
            this.field1203 = -1;
        }
        this.field1172 = arg0.method8032();
        if (this.field1172 == 65535) {
            this.field1172 = -1;
        }
        this.field1235 = arg0.method8032();
        if (this.field1235 == 65535) {
            this.field1235 = -1;
        }
        this.field1115 = new class497(arg0.method7983(), Statics.field3020);
        this.method2289();
        this.method2266();
        this.method2252();
        if (Statics.field4508 == this) {
            Statics.field5092 = this.field1115.method8556();
        }
        this.field1112 = arg0.method7964();
        this.field1119 = arg0.method8032();
        this.field1127 = arg0.method7964() == 1;
        if (client.field499 == 0 && client.field684 >= 2) {
            this.field1127 = false;
        }
        class180[] var13 = null;
        boolean var14 = false;
        int var15 = arg0.method8032();
        boolean var16 = (var15 >> 15 & 0x1) == 1;
        if (var15 > 0 && var15 != 32768) {
            var13 = new class180[12];
            for (int var17 = 0; var17 < 12; var17++) {
                int var18 = var15 >> 12 - var17 & 0x1;
                if (var18 == 1) {
                    var13[var17] = class180.method3509(var5[var17] - 512, arg0);
                }
            }
        }
        for (int var19 = 0; var19 < 3; var19++) {
            this.field1111[var19] = arg0.method7983();
        }
        if (client.field506 > 208) {
            var3 = arg0.method7964();
        }
        if (this.field1107 == null) {
            this.field1107 = new class307();
        }
        this.field1107.method5356(var5, var13, var16, var10, var2, var4, var3);
    }

    @ObfuscatedName("cl.v(B)Z")
    public boolean method2241() {
        if (class406.field4579 == this.field1130) {
            this.method2245();
        }
        return class406.field4580 == this.field1130;
    }

    @ObfuscatedName("cl.s(I)V")
    public void method2289() {
        this.field1130 = class406.field4579;
    }

    @ObfuscatedName("cl.k(I)V")
    public void method2245() {
        this.field1130 = Statics.field1944.method1744(this.field1115) ? class406.field4580 : class406.field4582;
    }

    @ObfuscatedName("cl.c(I)Z")
    public boolean method2246() {
        if (class406.field4579 == this.field1117) {
            this.method2268();
        }
        return class406.field4580 == this.field1117;
    }

    @ObfuscatedName("cl.r(I)V")
    public void method2266() {
        this.field1117 = class406.field4579;
    }

    @ObfuscatedName("cl.b(B)V")
    public void method2268() {
        this.field1117 = Statics.field4903 != null && Statics.field4903.method7053(this.field1115) ? class406.field4580 : class406.field4582;
    }

    @ObfuscatedName("cl.m(I)V")
    public void method2248() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field748[var1] != null && client.field748[var1].method3080(this.field1115.method8556()) != -1 && var1 != 2) {
                this.field1125 = class406.field4580;
                return;
            }
        }
        this.field1125 = class406.field4582;
    }

    @ObfuscatedName("cl.t(I)V")
    public void method2252() {
        this.field1125 = class406.field4579;
    }

    @ObfuscatedName("cl.h(S)Z")
    public boolean method2250() {
        if (class406.field4579 == this.field1125) {
            this.method2248();
        }
        return class406.field4580 == this.field1125;
    }

    @ObfuscatedName("cl.p(I)I")
    public int method2251() {
        return this.field1107 == null || this.field1107.field3485 == -1 ? 1 : class191.method2988(this.field1107.field3485).field2030;
    }

    @ObfuscatedName("cl.w(I)Lhs;")
    public final class228 method1977() {
        if (this.field1107 == null) {
            return null;
        }
        class203 var1 = this.field1224 != -1 && this.field1205 == 0 ? class203.method2227(this.field1224) : null;
        class203 var2 = this.field1198 == -1 || this.field1113 || this.field1198 == this.field1166 && var1 != null ? null : class203.method2227(this.field1198);
        class228 var3 = this.field1107.method5357(var1, this.field1170, var2, this.field1234);
        if (var3 == null) {
            return null;
        }
        var3.method4338();
        this.field1220 = var3.field2609;
        int var4 = var3.field2681;
        if (!this.field1113 && this.field1207 != -1 && this.field1199 != -1) {
            class228 var5 = class193.method2221(this.field1207).method3483(this.field1199);
            if (var5 != null) {
                var5.method4336(0, -this.field1211, 0);
                class228[] var6 = new class228[] { var3, var5 };
                var3 = new class228(var6, 2);
            }
        }
        if (!this.field1113 && this.field1120 != null) {
            if (client.field511 >= this.field1123) {
                this.field1120 = null;
            }
            if (client.field511 >= this.field1132 && client.field511 < this.field1123) {
                class228 var7 = this.field1120;
                var7.method4336(this.field1118 - this.field1204, this.field1122 - this.field1114, this.field1124 - this.field1161);
                if (this.field1227 == 512) {
                    var7.method4350();
                    var7.method4350();
                    var7.method4350();
                } else if (this.field1227 == 1024) {
                    var7.method4350();
                    var7.method4350();
                } else if (this.field1227 == 1536) {
                    var7.method4350();
                }
                class228[] var8 = new class228[] { var3, var7 };
                var3 = new class228(var8, 2);
                if (this.field1227 == 512) {
                    var7.method4350();
                } else if (this.field1227 == 1024) {
                    var7.method4350();
                    var7.method4350();
                } else if (this.field1227 == 1536) {
                    var7.method4350();
                    var7.method4350();
                    var7.method4350();
                }
                var7.method4336(this.field1204 - this.field1118, this.field1114 - this.field1122, this.field1161 - this.field1124);
            }
        }
        var3.field2702 = true;
        if (this.field1226 == 0 || client.field511 < this.field1177 || client.field511 >= this.field1222) {
            var3.field2743 = 0;
        } else {
            var3.field2712 = this.field1181;
            var3.field2741 = this.field1228;
            var3.field2687 = this.field1225;
            var3.field2743 = this.field1226;
            var3.field2744 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("cl.o(IILhz;I)V")
    public final void method2254(int arg0, int arg1, class209 arg2) {
        if (this.field1224 != -1 && class203.method2227(this.field1224).field2302 == 1) {
            this.field1224 = -1;
        }
        this.field1196 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2249(arg0, arg1);
        } else if (this.field1210[0] >= 0 && this.field1210[0] < 104 && this.field1232[0] >= 0 && this.field1232[0] < 104) {
            if (class209.field2363 == arg2) {
                client.method6145(this, arg0, arg1, class209.field2363);
            }
            this.method2280(arg0, arg1, arg2);
        } else {
            this.method2249(arg0, arg1);
        }
    }

    @ObfuscatedName("cl.u(III)V")
    public void method2249(int arg0, int arg1) {
        this.field1230 = 0;
        this.field1231 = 0;
        this.field1176 = 0;
        this.field1210[0] = arg0;
        this.field1232[0] = arg1;
        int var3 = this.method2251();
        this.field1204 = this.field1210[0] * 128 + var3 * 64;
        this.field1161 = this.field1232[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("cl.x(IILhz;I)V")
    public final void method2280(int arg0, int arg1, class209 arg2) {
        if (this.field1230 < 9) {
            this.field1230++;
        }
        for (int var4 = this.field1230; var4 > 0; var4--) {
            this.field1210[var4] = this.field1210[var4 - 1];
            this.field1232[var4] = this.field1232[var4 - 1];
            this.field1233[var4] = this.field1233[var4 - 1];
        }
        this.field1210[0] = arg0;
        this.field1232[0] = arg1;
        this.field1233[0] = arg2;
    }

    @ObfuscatedName("cl.a(I)Z")
    public final boolean method2258() {
        return this.field1107 != null;
    }
}
