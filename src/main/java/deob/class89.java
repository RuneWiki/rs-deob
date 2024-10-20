package deob;

@ObfuscatedName("co")
public final class class89 extends class91 {

    @ObfuscatedName("co.a")
    public class486 field1108;

    @ObfuscatedName("co.f")
    public class300 field1109;

    @ObfuscatedName("co.c")
    public int field1092 = -1;

    @ObfuscatedName("co.x")
    public int field1091 = -1;

    @ObfuscatedName("co.j")
    public String[] field1095 = new String[3];

    @ObfuscatedName("co.y")
    public int field1103;

    @ObfuscatedName("co.d")
    public int field1110;

    @ObfuscatedName("co.n")
    public int field1098;

    @ObfuscatedName("co.r")
    public int field1099;

    @ObfuscatedName("co.l")
    public int field1100;

    @ObfuscatedName("co.s")
    public int field1096;

    @ObfuscatedName("co.p")
    public int field1102;

    @ObfuscatedName("co.b")
    public int field1101;

    @ObfuscatedName("co.o")
    public class221 field1104;

    @ObfuscatedName("co.u")
    public int field1105;

    @ObfuscatedName("co.z")
    public int field1106;

    @ObfuscatedName("co.t")
    public int field1107;

    @ObfuscatedName("co.w")
    public int field1097;

    @ObfuscatedName("co.m")
    public boolean field1093;

    @ObfuscatedName("co.q")
    public int field1119;

    @ObfuscatedName("co.i")
    public boolean field1111;

    @ObfuscatedName("co.e")
    public int field1112;

    @ObfuscatedName("co.g")
    public int field1113;

    @ObfuscatedName("co.k")
    public class396 field1114;

    @ObfuscatedName("co.v")
    public class396 field1115;

    @ObfuscatedName("co.aj")
    public class396 field1116;

    @ObfuscatedName("co.ah")
    public boolean field1117;

    @ObfuscatedName("co.ao")
    public int field1118;

    @ObfuscatedName("co.ac")
    public int field1090;

    public class89() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1095[var1] = "";
        }
        this.field1103 = 0;
        this.field1110 = 0;
        this.field1099 = 0;
        this.field1100 = 0;
        this.field1093 = false;
        this.field1119 = 0;
        this.field1111 = false;
        this.field1114 = class396.field4500;
        this.field1115 = class396.field4500;
        this.field1116 = class396.field4500;
        this.field1117 = false;
    }

    @ObfuscatedName("co.a(Lqr;B)V")
    public final void method2166(class464 arg0) {
        arg0.field4864 = 0;
        int var2 = arg0.method7735();
        int var3 = -1;
        this.field1092 = arg0.method7881();
        this.field1091 = arg0.method7881();
        int var4 = -1;
        this.field1119 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method7735();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method7735();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method7716();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class195.method5052(var5[var6] - 512).field2185;
                    if (var9 != 0) {
                        this.field1119 = var9;
                    }
                }
            }
        }
        int[] var10 = new int[5];
        for (int var11 = 0; var11 < 5; var11++) {
            int var12 = arg0.method7735();
            if (var12 < 0 || var12 >= Statics.field194[var11].length) {
                var12 = 0;
            }
            var10[var11] = var12;
        }
        this.field1159 = arg0.method7716();
        if (this.field1159 == 65535) {
            this.field1159 = -1;
        }
        this.field1144 = arg0.method7716();
        if (this.field1144 == 65535) {
            this.field1144 = -1;
        }
        this.field1142 = this.field1144;
        this.field1146 = arg0.method7716();
        if (this.field1146 == 65535) {
            this.field1146 = -1;
        }
        this.field1147 = arg0.method7716();
        if (this.field1147 == 65535) {
            this.field1147 = -1;
        }
        this.field1148 = arg0.method7716();
        if (this.field1148 == 65535) {
            this.field1148 = -1;
        }
        this.field1149 = arg0.method7716();
        if (this.field1149 == 65535) {
            this.field1149 = -1;
        }
        this.field1150 = arg0.method7716();
        if (this.field1150 == 65535) {
            this.field1150 = -1;
        }
        this.field1108 = new class486(arg0.method7725(), Statics.field2682);
        this.method2168();
        this.method2173();
        this.method2171();
        if (Statics.field3404 == this) {
            Statics.field5022 = this.field1108.method8298();
        }
        this.field1103 = arg0.method7735();
        this.field1110 = arg0.method7716();
        this.field1111 = arg0.method7735() == 1;
        if (client.field769 == 0 && client.field608 >= 2) {
            this.field1111 = false;
        }
        class175[] var13 = null;
        boolean var14 = false;
        int var15 = arg0.method7716();
        boolean var16 = (var15 >> 15 & 0x1) == 1;
        if (var15 > 0 && var15 != 32768) {
            var13 = new class175[12];
            for (int var17 = 0; var17 < 12; var17++) {
                int var18 = var15 >> 12 - var17 & 0x1;
                if (var18 == 1) {
                    int var21 = var5[var17] - 512;
                    int var22 = arg0.method7735();
                    boolean var23 = (var22 & 0x1) != 0;
                    boolean var24 = (var22 & 0x2) != 0;
                    class175 var25 = new class175(var21);
                    if (var23) {
                        int var26 = arg0.method7735();
                        int[] var27 = new int[] { var26 & 0xF, var26 >> 4 & 0xF };
                        boolean var28 = var25.field1859 != null && var25.field1859.length == var27.length;
                        for (int var29 = 0; var29 < 2; var29++) {
                            if (var27[var29] != 15) {
                                short var30 = (short) arg0.method7716();
                                if (var28) {
                                    var25.field1859[var27[var29]] = var30;
                                }
                            }
                        }
                    }
                    if (var24) {
                        int var31 = arg0.method7735();
                        int[] var32 = new int[] { var31 & 0xF, var31 >> 4 & 0xF };
                        boolean var33 = var25.field1856 != null && var25.field1856.length == var32.length;
                        for (int var34 = 0; var34 < 2; var34++) {
                            if (var32[var34] != 15) {
                                short var35 = (short) arg0.method7716();
                                if (var33) {
                                    var25.field1856[var32[var34]] = var35;
                                }
                            }
                        }
                    }
                    var13[var17] = var25;
                }
            }
        }
        for (int var37 = 0; var37 < 3; var37++) {
            this.field1095[var37] = arg0.method7725();
        }
        if (client.field790 > 208) {
            var3 = arg0.method7735();
        }
        if (this.field1109 == null) {
            this.field1109 = new class300();
        }
        this.field1109.method5183(var5, var13, var16, var10, var2, var4, var3);
    }

    @ObfuscatedName("co.c(B)Z")
    public boolean method2167() {
        if (class396.field4500 == this.field1114) {
            this.method2169();
        }
        return class396.field4497 == this.field1114;
    }

    @ObfuscatedName("co.x(B)V")
    public void method2168() {
        this.field1114 = class396.field4500;
    }

    @ObfuscatedName("co.h(I)V")
    public void method2169() {
        this.field1114 = Statics.field2726.method1706(this.field1108) ? class396.field4497 : class396.field4498;
    }

    @ObfuscatedName("co.j(I)Z")
    public boolean method2196() {
        if (class396.field4500 == this.field1115) {
            this.method2172();
        }
        return class396.field4497 == this.field1115;
    }

    @ObfuscatedName("co.n(I)V")
    public void method2173() {
        this.field1115 = class396.field4500;
    }

    @ObfuscatedName("co.r(I)V")
    public void method2172() {
        this.field1115 = Statics.field889 != null && Statics.field889.method6823(this.field1108) ? class396.field4497 : class396.field4498;
    }

    @ObfuscatedName("co.l(I)V")
    public void method2170() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field596[var1] != null && client.field596[var1].method2876(this.field1108.method8298()) != -1 && var1 != 2) {
                this.field1116 = class396.field4497;
                return;
            }
        }
        this.field1116 = class396.field4498;
    }

    @ObfuscatedName("co.s(B)V")
    public void method2171() {
        this.field1116 = class396.field4500;
    }

    @ObfuscatedName("co.p(I)Z")
    public boolean method2208() {
        if (class396.field4500 == this.field1116) {
            this.method2170();
        }
        return class396.field4497 == this.field1116;
    }

    @ObfuscatedName("co.b(B)I")
    public int method2176() {
        return this.field1109 == null || this.field1109.field3425 == -1 ? 1 : class185.method3209(this.field1109.field3425).field1961;
    }

    @ObfuscatedName("co.f(I)Lha;")
    public final class221 method1929() {
        if (this.field1109 == null) {
            return null;
        }
        class197 var1 = this.field1188 != -1 && this.field1140 == 0 ? class197.method3143(this.field1188) : null;
        class197 var2 = this.field1175 == -1 || this.field1093 || this.field1175 == this.field1159 && var1 != null ? null : class197.method3143(this.field1175);
        class221 var3 = this.field1109.method5189(var1, this.field1180, var2, this.field1176);
        if (var3 == null) {
            return null;
        }
        var3.method4232();
        this.field1145 = var3.field2521;
        int var4 = var3.field2622;
        if (!this.field1093 && this.field1184 != -1 && this.field1192 != -1) {
            class221 var5 = class187.method710(this.field1184).method3279(this.field1192);
            if (var5 != null) {
                var5.method4174(0, -this.field1160, 0);
                class221[] var6 = new class221[] { var3, var5 };
                var3 = new class221(var6, 2);
            }
        }
        if (!this.field1093 && this.field1104 != null) {
            if (client.field503 >= this.field1100) {
                this.field1104 = null;
            }
            if (client.field503 >= this.field1099 && client.field503 < this.field1100) {
                class221 var7 = this.field1104;
                var7.method4174(this.field1096 - this.field1163, this.field1102 - this.field1098, this.field1101 - this.field1138);
                if (this.field1196 == 512) {
                    var7.method4247();
                    var7.method4247();
                    var7.method4247();
                } else if (this.field1196 == 1024) {
                    var7.method4247();
                    var7.method4247();
                } else if (this.field1196 == 1536) {
                    var7.method4247();
                }
                class221[] var8 = new class221[] { var3, var7 };
                var3 = new class221(var8, 2);
                if (this.field1196 == 512) {
                    var7.method4247();
                } else if (this.field1196 == 1024) {
                    var7.method4247();
                    var7.method4247();
                } else if (this.field1196 == 1536) {
                    var7.method4247();
                    var7.method4247();
                    var7.method4247();
                }
                var7.method4174(this.field1163 - this.field1096, this.field1098 - this.field1102, this.field1138 - this.field1101);
            }
        }
        var3.field2620 = true;
        if (this.field1203 == 0 || client.field503 < this.field1198 || client.field503 >= this.field1199) {
            var3.field2667 = 0;
        } else {
            var3.field2653 = this.field1200;
            var3.field2630 = this.field1201;
            var3.field2666 = this.field1186;
            var3.field2667 = this.field1203;
            var3.field2668 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("co.o(IILgo;I)V")
    public final void method2195(int arg0, int arg1, class203 arg2) {
        if (this.field1188 != -1 && class197.method3143(this.field1188).field2212 == 1) {
            this.field1188 = -1;
        }
        this.field1204 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2178(arg0, arg1);
        } else if (this.field1197[0] >= 0 && this.field1197[0] < 104 && this.field1209[0] >= 0 && this.field1209[0] < 104) {
            if (class203.field2285 == arg2) {
                class89 var4 = this;
                class203 var5 = class203.field2285;
                int var6 = this.field1197[0];
                int var7 = this.field1209[0];
                int var8 = this.method2176();
                if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && arg0 >= var8 && arg0 < 104 - var8 && arg1 >= var8 && arg1 < 104 - var8) {
                    int var9 = this.method2176();
                    client.field791.field2278 = arg0;
                    client.field791.field2276 = arg1;
                    client.field791.field2280 = 1;
                    client.field791.field2281 = 1;
                    class63 var10 = client.field791;
                    class63 var11 = var10;
                    class201 var12 = client.field742[this.field1112];
                    int[] var13 = client.field694;
                    int[] var14 = client.field793;
                    int var15 = 0;
                    label440: while (true) {
                        if (var15 >= 128) {
                            boolean var32;
                            if (var9 == 1) {
                                int var17 = var6;
                                int var18 = var7;
                                byte var19 = 64;
                                byte var20 = 64;
                                int var21 = var6 - var19;
                                int var22 = var7 - var20;
                                class204.field2296[var19][var20] = 99;
                                class204.field2293[var19][var20] = 0;
                                byte var23 = 0;
                                int var24 = 0;
                                class204.field2290[var23] = var6;
                                int var73 = var23 + 1;
                                class204.field2294[var23] = var7;
                                int[][] var25 = var12.field2273;
                                boolean var30;
                                while (true) {
                                    if (var73 == var24) {
                                        Statics.field2292 = var17;
                                        Statics.field2295 = var18;
                                        var30 = false;
                                        break;
                                    }
                                    var17 = class204.field2290[var24];
                                    var18 = class204.field2294[var24];
                                    var24 = var24 + 1 & 0xFFF;
                                    int var26 = var17 - var21;
                                    int var27 = var18 - var22;
                                    int var28 = var17 - var12.field2265;
                                    int var29 = var18 - var12.field2270;
                                    if (var11.method1105(1, var17, var18, var12)) {
                                        Statics.field2292 = var17;
                                        Statics.field2295 = var18;
                                        var30 = true;
                                        break;
                                    }
                                    int var31 = class204.field2293[var26][var27] + 1;
                                    if (var26 > 0 && class204.field2296[var26 - 1][var27] == 0 && (var25[var28 - 1][var29] & 0x1240108) == 0) {
                                        class204.field2290[var73] = var17 - 1;
                                        class204.field2294[var73] = var18;
                                        var73 = var73 + 1 & 0xFFF;
                                        class204.field2296[var26 - 1][var27] = 2;
                                        class204.field2293[var26 - 1][var27] = var31;
                                    }
                                    if (var26 < 127 && class204.field2296[var26 + 1][var27] == 0 && (var25[var28 + 1][var29] & 0x1240180) == 0) {
                                        class204.field2290[var73] = var17 + 1;
                                        class204.field2294[var73] = var18;
                                        var73 = var73 + 1 & 0xFFF;
                                        class204.field2296[var26 + 1][var27] = 8;
                                        class204.field2293[var26 + 1][var27] = var31;
                                    }
                                    if (var27 > 0 && class204.field2296[var26][var27 - 1] == 0 && (var25[var28][var29 - 1] & 0x1240102) == 0) {
                                        class204.field2290[var73] = var17;
                                        class204.field2294[var73] = var18 - 1;
                                        var73 = var73 + 1 & 0xFFF;
                                        class204.field2296[var26][var27 - 1] = 1;
                                        class204.field2293[var26][var27 - 1] = var31;
                                    }
                                    if (var27 < 127 && class204.field2296[var26][var27 + 1] == 0 && (var25[var28][var29 + 1] & 0x1240120) == 0) {
                                        class204.field2290[var73] = var17;
                                        class204.field2294[var73] = var18 + 1;
                                        var73 = var73 + 1 & 0xFFF;
                                        class204.field2296[var26][var27 + 1] = 4;
                                        class204.field2293[var26][var27 + 1] = var31;
                                    }
                                    if (var26 > 0 && var27 > 0 && class204.field2296[var26 - 1][var27 - 1] == 0 && (var25[var28 - 1][var29 - 1] & 0x124010E) == 0 && (var25[var28 - 1][var29] & 0x1240108) == 0 && (var25[var28][var29 - 1] & 0x1240102) == 0) {
                                        class204.field2290[var73] = var17 - 1;
                                        class204.field2294[var73] = var18 - 1;
                                        var73 = var73 + 1 & 0xFFF;
                                        class204.field2296[var26 - 1][var27 - 1] = 3;
                                        class204.field2293[var26 - 1][var27 - 1] = var31;
                                    }
                                    if (var26 < 127 && var27 > 0 && class204.field2296[var26 + 1][var27 - 1] == 0 && (var25[var28 + 1][var29 - 1] & 0x1240183) == 0 && (var25[var28 + 1][var29] & 0x1240180) == 0 && (var25[var28][var29 - 1] & 0x1240102) == 0) {
                                        class204.field2290[var73] = var17 + 1;
                                        class204.field2294[var73] = var18 - 1;
                                        var73 = var73 + 1 & 0xFFF;
                                        class204.field2296[var26 + 1][var27 - 1] = 9;
                                        class204.field2293[var26 + 1][var27 - 1] = var31;
                                    }
                                    if (var26 > 0 && var27 < 127 && class204.field2296[var26 - 1][var27 + 1] == 0 && (var25[var28 - 1][var29 + 1] & 0x1240138) == 0 && (var25[var28 - 1][var29] & 0x1240108) == 0 && (var25[var28][var29 + 1] & 0x1240120) == 0) {
                                        class204.field2290[var73] = var17 - 1;
                                        class204.field2294[var73] = var18 + 1;
                                        var73 = var73 + 1 & 0xFFF;
                                        class204.field2296[var26 - 1][var27 + 1] = 6;
                                        class204.field2293[var26 - 1][var27 + 1] = var31;
                                    }
                                    if (var26 < 127 && var27 < 127 && class204.field2296[var26 + 1][var27 + 1] == 0 && (var25[var28 + 1][var29 + 1] & 0x12401E0) == 0 && (var25[var28 + 1][var29] & 0x1240180) == 0 && (var25[var28][var29 + 1] & 0x1240120) == 0) {
                                        class204.field2290[var73] = var17 + 1;
                                        class204.field2294[var73] = var18 + 1;
                                        var73 = var73 + 1 & 0xFFF;
                                        class204.field2296[var26 + 1][var27 + 1] = 12;
                                        class204.field2293[var26 + 1][var27 + 1] = var31;
                                    }
                                }
                                var32 = var30;
                            } else if (var9 == 2) {
                                int var33 = var6;
                                int var34 = var7;
                                byte var35 = 64;
                                byte var36 = 64;
                                int var37 = var6 - var35;
                                int var38 = var7 - var36;
                                class204.field2296[var35][var36] = 99;
                                class204.field2293[var35][var36] = 0;
                                byte var39 = 0;
                                int var40 = 0;
                                class204.field2290[var39] = var6;
                                int var74 = var39 + 1;
                                class204.field2294[var39] = var7;
                                int[][] var41 = var12.field2273;
                                boolean var46;
                                while (true) {
                                    if (var74 == var40) {
                                        Statics.field2292 = var33;
                                        Statics.field2295 = var34;
                                        var46 = false;
                                        break;
                                    }
                                    var33 = class204.field2290[var40];
                                    var34 = class204.field2294[var40];
                                    var40 = var40 + 1 & 0xFFF;
                                    int var42 = var33 - var37;
                                    int var43 = var34 - var38;
                                    int var44 = var33 - var12.field2265;
                                    int var45 = var34 - var12.field2270;
                                    if (var11.method1105(2, var33, var34, var12)) {
                                        Statics.field2292 = var33;
                                        Statics.field2295 = var34;
                                        var46 = true;
                                        break;
                                    }
                                    int var47 = class204.field2293[var42][var43] + 1;
                                    if (var42 > 0 && class204.field2296[var42 - 1][var43] == 0 && (var41[var44 - 1][var45] & 0x124010E) == 0 && (var41[var44 - 1][var45 + 1] & 0x1240138) == 0) {
                                        class204.field2290[var74] = var33 - 1;
                                        class204.field2294[var74] = var34;
                                        var74 = var74 + 1 & 0xFFF;
                                        class204.field2296[var42 - 1][var43] = 2;
                                        class204.field2293[var42 - 1][var43] = var47;
                                    }
                                    if (var42 < 126 && class204.field2296[var42 + 1][var43] == 0 && (var41[var44 + 2][var45] & 0x1240183) == 0 && (var41[var44 + 2][var45 + 1] & 0x12401E0) == 0) {
                                        class204.field2290[var74] = var33 + 1;
                                        class204.field2294[var74] = var34;
                                        var74 = var74 + 1 & 0xFFF;
                                        class204.field2296[var42 + 1][var43] = 8;
                                        class204.field2293[var42 + 1][var43] = var47;
                                    }
                                    if (var43 > 0 && class204.field2296[var42][var43 - 1] == 0 && (var41[var44][var45 - 1] & 0x124010E) == 0 && (var41[var44 + 1][var45 - 1] & 0x1240183) == 0) {
                                        class204.field2290[var74] = var33;
                                        class204.field2294[var74] = var34 - 1;
                                        var74 = var74 + 1 & 0xFFF;
                                        class204.field2296[var42][var43 - 1] = 1;
                                        class204.field2293[var42][var43 - 1] = var47;
                                    }
                                    if (var43 < 126 && class204.field2296[var42][var43 + 1] == 0 && (var41[var44][var45 + 2] & 0x1240138) == 0 && (var41[var44 + 1][var45 + 2] & 0x12401E0) == 0) {
                                        class204.field2290[var74] = var33;
                                        class204.field2294[var74] = var34 + 1;
                                        var74 = var74 + 1 & 0xFFF;
                                        class204.field2296[var42][var43 + 1] = 4;
                                        class204.field2293[var42][var43 + 1] = var47;
                                    }
                                    if (var42 > 0 && var43 > 0 && class204.field2296[var42 - 1][var43 - 1] == 0 && (var41[var44 - 1][var45] & 0x124013E) == 0 && (var41[var44 - 1][var45 - 1] & 0x124010E) == 0 && (var41[var44][var45 - 1] & 0x124018F) == 0) {
                                        class204.field2290[var74] = var33 - 1;
                                        class204.field2294[var74] = var34 - 1;
                                        var74 = var74 + 1 & 0xFFF;
                                        class204.field2296[var42 - 1][var43 - 1] = 3;
                                        class204.field2293[var42 - 1][var43 - 1] = var47;
                                    }
                                    if (var42 < 126 && var43 > 0 && class204.field2296[var42 + 1][var43 - 1] == 0 && (var41[var44 + 1][var45 - 1] & 0x124018F) == 0 && (var41[var44 + 2][var45 - 1] & 0x1240183) == 0 && (var41[var44 + 2][var45] & 0x12401E3) == 0) {
                                        class204.field2290[var74] = var33 + 1;
                                        class204.field2294[var74] = var34 - 1;
                                        var74 = var74 + 1 & 0xFFF;
                                        class204.field2296[var42 + 1][var43 - 1] = 9;
                                        class204.field2293[var42 + 1][var43 - 1] = var47;
                                    }
                                    if (var42 > 0 && var43 < 126 && class204.field2296[var42 - 1][var43 + 1] == 0 && (var41[var44 - 1][var45 + 1] & 0x124013E) == 0 && (var41[var44 - 1][var45 + 2] & 0x1240138) == 0 && (var41[var44][var45 + 2] & 0x12401F8) == 0) {
                                        class204.field2290[var74] = var33 - 1;
                                        class204.field2294[var74] = var34 + 1;
                                        var74 = var74 + 1 & 0xFFF;
                                        class204.field2296[var42 - 1][var43 + 1] = 6;
                                        class204.field2293[var42 - 1][var43 + 1] = var47;
                                    }
                                    if (var42 < 126 && var43 < 126 && class204.field2296[var42 + 1][var43 + 1] == 0 && (var41[var44 + 1][var45 + 2] & 0x12401F8) == 0 && (var41[var44 + 2][var45 + 2] & 0x12401E0) == 0 && (var41[var44 + 2][var45 + 1] & 0x12401E3) == 0) {
                                        class204.field2290[var74] = var33 + 1;
                                        class204.field2294[var74] = var34 + 1;
                                        var74 = var74 + 1 & 0xFFF;
                                        class204.field2296[var42 + 1][var43 + 1] = 12;
                                        class204.field2293[var42 + 1][var43 + 1] = var47;
                                    }
                                }
                                var32 = var46;
                            } else {
                                var32 = class204.method497(var6, var7, var9, var10, var12);
                            }
                            int var66;
                            label465: {
                                int var48 = var6 - 64;
                                int var49 = var7 - 64;
                                int var50 = Statics.field2292;
                                int var51 = Statics.field2295;
                                if (!var32) {
                                    int var52 = Integer.MAX_VALUE;
                                    int var53 = Integer.MAX_VALUE;
                                    byte var54 = 10;
                                    int var55 = var11.field2278;
                                    int var56 = var11.field2276;
                                    int var57 = var11.field2280;
                                    int var58 = var11.field2281;
                                    for (int var59 = var55 - var54; var59 <= var54 + var55; var59++) {
                                        for (int var60 = var56 - var54; var60 <= var54 + var56; var60++) {
                                            int var61 = var59 - var48;
                                            int var62 = var60 - var49;
                                            if (var61 >= 0 && var62 >= 0 && var61 < 128 && var62 < 128 && class204.field2293[var61][var62] < 100) {
                                                int var63 = 0;
                                                if (var59 < var55) {
                                                    var63 = var55 - var59;
                                                } else if (var59 > var55 + var57 - 1) {
                                                    var63 = var59 - (var55 + var57 - 1);
                                                }
                                                int var64 = 0;
                                                if (var60 < var56) {
                                                    var64 = var56 - var60;
                                                } else if (var60 > var56 + var58 - 1) {
                                                    var64 = var60 - (var56 + var58 - 1);
                                                }
                                                int var65 = var63 * var63 + var64 * var64;
                                                if (var65 < var52 || var52 == var65 && class204.field2293[var61][var62] < var53) {
                                                    var52 = var65;
                                                    var53 = class204.field2293[var61][var62];
                                                    var50 = var59;
                                                    var51 = var60;
                                                }
                                            }
                                        }
                                    }
                                    if (var52 == Integer.MAX_VALUE) {
                                        var66 = -1;
                                        break label465;
                                    }
                                }
                                if (var6 == var50 && var7 == var51) {
                                    var13[0] = var50;
                                    var14[0] = var51;
                                    var66 = 0;
                                } else {
                                    byte var67 = 0;
                                    class204.field2290[var67] = var50;
                                    int var75 = var67 + 1;
                                    class204.field2294[var67] = var51;
                                    int var68;
                                    int var69 = var68 = class204.field2296[var50 - var48][var51 - var49];
                                    while (var6 != var50 || var7 != var51) {
                                        if (var68 != var69) {
                                            var68 = var69;
                                            class204.field2290[var75] = var50;
                                            class204.field2294[var75++] = var51;
                                        }
                                        if ((var69 & 0x2) != 0) {
                                            var50++;
                                        } else if ((var69 & 0x8) != 0) {
                                            var50--;
                                        }
                                        if ((var69 & 0x1) != 0) {
                                            var51++;
                                        } else if ((var69 & 0x4) != 0) {
                                            var51--;
                                        }
                                        var69 = class204.field2296[var50 - var48][var51 - var49];
                                    }
                                    int var70 = 0;
                                    while (var75-- > 0) {
                                        var13[var70] = class204.field2290[var75];
                                        var14[var70++] = class204.field2294[var75];
                                        if (var70 >= var13.length) {
                                            break;
                                        }
                                    }
                                    var66 = var70;
                                }
                            }
                            int var71 = var66;
                            if (var66 < 1) {
                                break;
                            }
                            int var72 = 0;
                            while (true) {
                                if (var72 >= var71 - 1) {
                                    break label440;
                                }
                                var4.method2174(client.field694[var72], client.field793[var72], var5);
                                var72++;
                            }
                        }
                        for (int var16 = 0; var16 < 128; var16++) {
                            class204.field2296[var15][var16] = 0;
                            class204.field2293[var15][var16] = 99999999;
                        }
                        var15++;
                    }
                }
            }
            this.method2174(arg0, arg1, arg2);
        } else {
            this.method2178(arg0, arg1);
        }
    }

    @ObfuscatedName("co.u(III)V")
    public void method2178(int arg0, int arg1) {
        this.field1207 = 0;
        this.field1212 = 0;
        this.field1173 = 0;
        this.field1197[0] = arg0;
        this.field1209[0] = arg1;
        int var3 = this.method2176();
        this.field1163 = this.field1197[0] * 128 + var3 * 64;
        this.field1138 = this.field1209[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("co.z(IILgo;I)V")
    public final void method2174(int arg0, int arg1, class203 arg2) {
        if (this.field1207 < 9) {
            this.field1207++;
        }
        for (int var4 = this.field1207; var4 > 0; var4--) {
            this.field1197[var4] = this.field1197[var4 - 1];
            this.field1209[var4] = this.field1209[var4 - 1];
            this.field1139[var4] = this.field1139[var4 - 1];
        }
        this.field1197[0] = arg0;
        this.field1209[0] = arg1;
        this.field1139[0] = arg2;
    }

    @ObfuscatedName("co.t(I)Z")
    public final boolean method2165() {
        return this.field1109 != null;
    }
}
