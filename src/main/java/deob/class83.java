package deob;

@ObfuscatedName("co")
public final class class83 extends class85 {

    @ObfuscatedName("co.n")
    public class421 field1070;

    @ObfuscatedName("co.c")
    public class260 field1064;

    @ObfuscatedName("co.m")
    public int field1050 = -1;

    @ObfuscatedName("co.k")
    public int field1052 = -1;

    @ObfuscatedName("co.g")
    public String[] field1060 = new String[3];

    @ObfuscatedName("co.z")
    public int field1049;

    @ObfuscatedName("co.a")
    public int field1055;

    @ObfuscatedName("co.u")
    public int field1056;

    @ObfuscatedName("co.e")
    public int field1057;

    @ObfuscatedName("co.l")
    public int field1058;

    @ObfuscatedName("co.y")
    public int field1059;

    @ObfuscatedName("co.v")
    public int field1077;

    @ObfuscatedName("co.f")
    public int field1061;

    @ObfuscatedName("co.s")
    public class220 field1062;

    @ObfuscatedName("co.h")
    public int field1063;

    @ObfuscatedName("co.d")
    public int field1054;

    @ObfuscatedName("co.q")
    public int field1065;

    @ObfuscatedName("co.j")
    public int field1066;

    @ObfuscatedName("co.x")
    public boolean field1051;

    @ObfuscatedName("co.b")
    public int field1073;

    @ObfuscatedName("co.t")
    public boolean field1069;

    @ObfuscatedName("co.r")
    public int field1067;

    @ObfuscatedName("co.p")
    public int field1071;

    @ObfuscatedName("co.w")
    public class342 field1053;

    @ObfuscatedName("co.i")
    public class342 field1068;

    @ObfuscatedName("co.aq")
    public class342 field1074;

    @ObfuscatedName("co.ad")
    public boolean field1075;

    @ObfuscatedName("co.al")
    public int field1076;

    @ObfuscatedName("co.aa")
    public int field1048;

    public class83() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1060[var1] = "";
        }
        this.field1049 = 0;
        this.field1055 = 0;
        this.field1057 = 0;
        this.field1058 = 0;
        this.field1051 = false;
        this.field1073 = 0;
        this.field1069 = false;
        this.field1053 = class342.field3967;
        this.field1068 = class342.field3967;
        this.field1074 = class342.field3967;
        this.field1075 = false;
    }

    @ObfuscatedName("co.n(Lot;B)V")
    public final void method1986(class400 arg0) {
        arg0.field4272 = 0;
        int var2 = arg0.method6217();
        this.field1050 = arg0.method6218();
        this.field1052 = arg0.method6218();
        int var3 = -1;
        this.field1073 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method6217();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method6217();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method6219();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class170.method1776(var4[var5] - 512).field1921;
                    if (var8 != 0) {
                        this.field1073 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method6217();
            if (var11 < 0 || var11 >= Statics.field55[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1099 = arg0.method6219();
        if (this.field1099 == 65535) {
            this.field1099 = -1;
        }
        this.field1123 = arg0.method6219();
        if (this.field1123 == 65535) {
            this.field1123 = -1;
        }
        this.field1101 = this.field1123;
        this.field1121 = arg0.method6219();
        if (this.field1121 == 65535) {
            this.field1121 = -1;
        }
        this.field1103 = arg0.method6219();
        if (this.field1103 == 65535) {
            this.field1103 = -1;
        }
        this.field1104 = arg0.method6219();
        if (this.field1104 == 65535) {
            this.field1104 = -1;
        }
        this.field1105 = arg0.method6219();
        if (this.field1105 == 65535) {
            this.field1105 = -1;
        }
        this.field1106 = arg0.method6219();
        if (this.field1106 == 65535) {
            this.field1106 = -1;
        }
        this.field1070 = new class421(arg0.method6226(), Statics.field310);
        this.method1960();
        this.method1961();
        this.method2005();
        if (Statics.field1485 == this) {
            Statics.field4412 = this.field1070.method6800();
        }
        this.field1049 = arg0.method6217();
        this.field1055 = arg0.method6219();
        this.field1069 = arg0.method6217() == 1;
        if (client.field483 == 0 && client.field658 >= 2) {
            this.field1069 = false;
        }
        class151[] var12 = null;
        boolean var13 = false;
        if (arg0.field4272 < arg0.field4271.length) {
            int var14 = arg0.method6219();
            var13 = (var14 >> 15 & 0x1) == 1;
            if (var14 > 0 && var14 != 32768) {
                var12 = new class151[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var14 >> 12 - var15 & 0x1;
                    if (var16 == 1) {
                        int var19 = var4[var15] - 512;
                        int var20 = arg0.method6217();
                        boolean var21 = (var20 & 0x1) != 0;
                        boolean var22 = (var20 & 0x2) != 0;
                        class151 var23 = new class151(var19);
                        if (var21) {
                            int var24 = arg0.method6217();
                            int[] var25 = new int[] { var24 & 0xF, var24 >> 4 & 0xF };
                            boolean var26 = var23.field1601 != null && var23.field1601.length == var25.length;
                            for (int var27 = 0; var27 < 2; var27++) {
                                if (var25[var27] != 15) {
                                    short var28 = (short) arg0.method6219();
                                    if (var26) {
                                        var23.field1601[var25[var27]] = var28;
                                    }
                                }
                            }
                        }
                        if (var22) {
                            int var29 = arg0.method6217();
                            int[] var30 = new int[] { var29 & 0xF, var29 >> 4 & 0xF };
                            boolean var31 = var23.field1600 != null && var23.field1600.length == var30.length;
                            for (int var32 = 0; var32 < 2; var32++) {
                                if (var30[var32] != 15) {
                                    short var33 = (short) arg0.method6219();
                                    if (var31) {
                                        var23.field1600[var30[var32]] = var33;
                                    }
                                }
                            }
                        }
                        var12[var15] = var23;
                    }
                }
            }
        }
        if (this.field1064 == null) {
            this.field1064 = new class260();
        }
        this.field1064.method4477(var4, var12, var13, var9, var2 == 1, var3);
    }

    @ObfuscatedName("co.m(B)Z")
    public boolean method1957() {
        if (class342.field3967 == this.field1053) {
            this.method1959();
        }
        return class342.field3969 == this.field1053;
    }

    @ObfuscatedName("co.k(B)V")
    public void method1960() {
        this.field1053 = class342.field3967;
    }

    @ObfuscatedName("co.z(I)V")
    public void method1959() {
        this.field1053 = Statics.field100.method1579(this.field1070) ? class342.field3969 : class342.field3968;
    }

    @ObfuscatedName("co.a(I)Z")
    public boolean method1996() {
        if (class342.field3967 == this.field1068) {
            this.method1962();
        }
        return class342.field3969 == this.field1068;
    }

    @ObfuscatedName("co.u(I)V")
    public void method1961() {
        this.field1068 = class342.field3967;
    }

    @ObfuscatedName("co.e(B)V")
    public void method1962() {
        this.field1068 = Statics.field1010 != null && Statics.field1010.method5489(this.field1070) ? class342.field3969 : class342.field3968;
    }

    @ObfuscatedName("co.l(I)V")
    public void method1963() {
        this.field1074 = client.field718[0] == null || client.field718[0].method2385(this.field1070.method6800()) == -1 ? class342.field3968 : class342.field3969;
    }

    @ObfuscatedName("co.y(I)V")
    public void method2005() {
        this.field1074 = class342.field3967;
    }

    @ObfuscatedName("co.v(I)Z")
    public boolean method1958() {
        if (class342.field3967 == this.field1074) {
            this.method1963();
        }
        return class342.field3969 == this.field1074;
    }

    @ObfuscatedName("co.f(I)I")
    public int method2004() {
        return this.field1064 == null || this.field1064.field3024 == -1 ? 1 : class161.method1950(this.field1064.field3024).field1711;
    }

    @ObfuscatedName("co.c(B)Lhg;")
    public final class220 method1766() {
        if (this.field1064 == null) {
            return null;
        }
        class172 var1 = this.field1130 != -1 && this.field1129 == 0 ? class172.method269(this.field1130) : null;
        class172 var2 = this.field1143 == -1 || this.field1051 || this.field1143 == this.field1099 && var1 != null ? null : class172.method269(this.field1143);
        class220 var3 = this.field1064.method4483(var1, this.field1127, var2, this.field1124);
        if (var3 == null) {
            return null;
        }
        var3.method4018();
        this.field1113 = var3.field2429;
        if (!this.field1051 && this.field1131 != -1 && this.field1132 != -1) {
            class220 var4 = class163.method2520(this.field1131).method2749(this.field1132);
            if (var4 != null) {
                var4.method4029(0, -this.field1135, 0);
                class220[] var5 = new class220[] { var3, var4 };
                var3 = new class220(var5, 2);
            }
        }
        if (!this.field1051 && this.field1062 != null) {
            if (client.field744 >= this.field1058) {
                this.field1062 = null;
            }
            if (client.field744 >= this.field1057 && client.field744 < this.field1058) {
                class220 var6 = this.field1062;
                var6.method4029(this.field1059 - this.field1119, this.field1077 - this.field1056, this.field1061 - this.field1096);
                if (this.field1145 == 512) {
                    var6.method4049();
                    var6.method4049();
                    var6.method4049();
                } else if (this.field1145 == 1024) {
                    var6.method4049();
                    var6.method4049();
                } else if (this.field1145 == 1536) {
                    var6.method4049();
                }
                class220[] var7 = new class220[] { var3, var6 };
                var3 = new class220(var7, 2);
                if (this.field1145 == 512) {
                    var6.method4049();
                } else if (this.field1145 == 1024) {
                    var6.method4049();
                    var6.method4049();
                } else if (this.field1145 == 1536) {
                    var6.method4049();
                    var6.method4049();
                    var6.method4049();
                }
                var6.method4029(this.field1119 - this.field1059, this.field1056 - this.field1077, this.field1096 - this.field1061);
            }
        }
        var3.field2520 = true;
        return var3;
    }

    @ObfuscatedName("co.s(IIBB)V")
    public final void method1966(int arg0, int arg1, byte arg2) {
        if (this.field1130 != -1 && class172.method269(this.field1130).field1961 == 1) {
            this.field1130 = -1;
        }
        this.field1097 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1967(arg0, arg1);
        } else if (this.field1126[0] >= 0 && this.field1126[0] < 104 && this.field1150[0] >= 0 && this.field1150[0] < 104) {
            if (arg2 == 2) {
                class83 var4 = this;
                int var5 = this.field1126[0];
                int var6 = this.field1150[0];
                int var7 = this.method2004();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method2004();
                    client.field766.field1980 = arg0;
                    client.field766.field1982 = arg1;
                    client.field766.field1981 = 1;
                    client.field766.field1979 = 1;
                    class59 var11 = client.field766;
                    int var12 = class175.method3602(var5, var6, var10, var11, client.field695[this.field1067], true, client.field515, client.field768);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method1968(client.field515[var13], client.field768[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method1968(arg0, arg1, arg2);
        } else {
            this.method1967(arg0, arg1);
        }
    }

    @ObfuscatedName("co.h(IIB)V")
    public void method1967(int arg0, int arg1) {
        this.field1148 = 0;
        this.field1153 = 0;
        this.field1152 = 0;
        this.field1126[0] = arg0;
        this.field1150[0] = arg1;
        int var3 = this.method2004();
        this.field1119 = this.field1126[0] * 128 + var3 * 64;
        this.field1096 = this.field1150[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("co.d(IIBI)V")
    public final void method1968(int arg0, int arg1, byte arg2) {
        if (this.field1148 < 9) {
            this.field1148++;
        }
        for (int var4 = this.field1148; var4 > 0; var4--) {
            this.field1126[var4] = this.field1126[var4 - 1];
            this.field1150[var4] = this.field1150[var4 - 1];
            this.field1151[var4] = this.field1151[var4 - 1];
        }
        this.field1126[0] = arg0;
        this.field1150[0] = arg1;
        this.field1151[0] = arg2;
    }

    @ObfuscatedName("co.q(I)Z")
    public final boolean method1993() {
        return this.field1064 != null;
    }
}
