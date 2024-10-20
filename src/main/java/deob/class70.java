package deob;

@ObfuscatedName("bb")
public final class class70 extends class72 {

    @ObfuscatedName("bb.s")
    public class406 field980;

    @ObfuscatedName("bb.t")
    public class247 field979;

    @ObfuscatedName("bb.v")
    public int field996 = -1;

    @ObfuscatedName("bb.j")
    public int field992 = -1;

    @ObfuscatedName("bb.n")
    public String[] field982 = new String[3];

    @ObfuscatedName("bb.w")
    public int field991;

    @ObfuscatedName("bb.f")
    public int field1007;

    @ObfuscatedName("bb.o")
    public int field985;

    @ObfuscatedName("bb.x")
    public int field986;

    @ObfuscatedName("bb.r")
    public int field987;

    @ObfuscatedName("bb.p")
    public int field983;

    @ObfuscatedName("bb.h")
    public int field984;

    @ObfuscatedName("bb.k")
    public int field990;

    @ObfuscatedName("bb.a")
    public class207 field981;

    @ObfuscatedName("bb.q")
    public int field978;

    @ObfuscatedName("bb.u")
    public int field993;

    @ObfuscatedName("bb.e")
    public int field994;

    @ObfuscatedName("bb.c")
    public int field989;

    @ObfuscatedName("bb.i")
    public boolean field995;

    @ObfuscatedName("bb.m")
    public int field997;

    @ObfuscatedName("bb.b")
    public boolean field998;

    @ObfuscatedName("bb.z")
    public int field999;

    @ObfuscatedName("bb.d")
    public int field1000;

    @ObfuscatedName("bb.y")
    public class329 field1001;

    @ObfuscatedName("bb.g")
    public class329 field1002;

    @ObfuscatedName("bb.ae")
    public class329 field1003;

    @ObfuscatedName("bb.am")
    public boolean field1004;

    @ObfuscatedName("bb.al")
    public int field1005;

    @ObfuscatedName("bb.aq")
    public int field1006;

    public class70() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field982[var1] = "";
        }
        this.field991 = 0;
        this.field1007 = 0;
        this.field986 = 0;
        this.field987 = 0;
        this.field995 = false;
        this.field997 = 0;
        this.field998 = false;
        this.field1001 = class329.field3874;
        this.field1002 = class329.field3874;
        this.field1003 = class329.field3874;
        this.field1004 = false;
    }

    @ObfuscatedName("bb.s(Lnv;B)V")
    public final void method1724(class385 arg0) {
        arg0.field4182 = 0;
        int var2 = arg0.method5958();
        this.field996 = arg0.method5959();
        this.field992 = arg0.method5959();
        int var3 = -1;
        this.field997 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5958();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5958();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method6053();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class157.method101(var4[var5] - 512).field1833;
                    if (var8 != 0) {
                        this.field997 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5958();
            if (var11 < 0 || var11 >= Statics.field2915[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1030 = arg0.method6053();
        if (this.field1030 == 65535) {
            this.field1030 = -1;
        }
        this.field1052 = arg0.method6053();
        if (this.field1052 == 65535) {
            this.field1052 = -1;
        }
        this.field1020 = this.field1052;
        this.field1029 = arg0.method6053();
        if (this.field1029 == 65535) {
            this.field1029 = -1;
        }
        this.field1072 = arg0.method6053();
        if (this.field1072 == 65535) {
            this.field1072 = -1;
        }
        this.field1046 = arg0.method6053();
        if (this.field1046 == 65535) {
            this.field1046 = -1;
        }
        this.field1021 = arg0.method6053();
        if (this.field1021 == 65535) {
            this.field1021 = -1;
        }
        this.field1033 = arg0.method6053();
        if (this.field1033 == 65535) {
            this.field1033 = -1;
        }
        this.field980 = new class406(arg0.method5967(), Statics.field761);
        this.method1726();
        this.method1729();
        this.method1732();
        if (Statics.field140 == this) {
            Statics.field4316 = this.field980.method6520();
        }
        this.field991 = arg0.method5958();
        this.field1007 = arg0.method6053();
        this.field998 = arg0.method5958() == 1;
        if (client.field407 == 0 && client.field577 >= 2) {
            this.field998 = false;
        }
        class138[] var12 = null;
        boolean var13 = false;
        if (arg0.field4182 < arg0.field4184.length) {
            int var14 = arg0.method6053();
            var13 = (var14 >> 15 & 0x1) == 1;
            if (var14 > 0 && var14 != 32768) {
                var12 = new class138[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var14 >> 12 - var15 & 0x1;
                    if (var16 == 1) {
                        int var19 = var4[var15] - 512;
                        int var20 = arg0.method5958();
                        boolean var21 = (var20 & 0x1) != 0;
                        boolean var22 = (var20 & 0x2) != 0;
                        class138 var23 = new class138(var19);
                        if (var21) {
                            int var24 = arg0.method5958();
                            int[] var25 = new int[] { var24 & 0xF, var24 >> 4 & 0xF };
                            boolean var26 = var23.field1516 != null && var23.field1516.length == var25.length;
                            for (int var27 = 0; var27 < 2; var27++) {
                                if (var25[var27] != 15) {
                                    short var28 = (short) arg0.method6053();
                                    if (var26) {
                                        var23.field1516[var25[var27]] = var28;
                                    }
                                }
                            }
                        }
                        if (var22) {
                            int var29 = arg0.method5958();
                            int[] var30 = new int[] { var29 & 0xF, var29 >> 4 & 0xF };
                            boolean var31 = var23.field1519 != null && var23.field1519.length == var30.length;
                            for (int var32 = 0; var32 < 2; var32++) {
                                if (var30[var32] != 15) {
                                    short var33 = (short) arg0.method6053();
                                    if (var31) {
                                        var23.field1519[var30[var32]] = var33;
                                    }
                                }
                            }
                        }
                        var12[var15] = var23;
                    }
                }
            }
        }
        if (this.field979 == null) {
            this.field979 = new class247();
        }
        this.field979.method4216(var4, var12, var13, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bb.v(I)Z")
    public boolean method1725() {
        if (class329.field3874 == this.field1001) {
            this.method1761();
        }
        return class329.field3872 == this.field1001;
    }

    @ObfuscatedName("bb.j(I)V")
    public void method1726() {
        this.field1001 = class329.field3874;
    }

    @ObfuscatedName("bb.l(I)V")
    public void method1761() {
        this.field1001 = Statics.field80.method1340(this.field980) ? class329.field3872 : class329.field3873;
    }

    @ObfuscatedName("bb.n(I)Z")
    public boolean method1728() {
        if (class329.field3874 == this.field1002) {
            this.method1730();
        }
        return class329.field3872 == this.field1002;
    }

    @ObfuscatedName("bb.f(I)V")
    public void method1729() {
        this.field1002 = class329.field3874;
    }

    @ObfuscatedName("bb.o(I)V")
    public void method1730() {
        this.field1002 = Statics.field972 != null && Statics.field972.method5243(this.field980) ? class329.field3872 : class329.field3873;
    }

    @ObfuscatedName("bb.x(I)V")
    public void method1731() {
        this.field1003 = client.field637[0] == null || client.field637[0].method2152(this.field980.method6520()) == -1 ? class329.field3873 : class329.field3872;
    }

    @ObfuscatedName("bb.r(I)V")
    public void method1732() {
        this.field1003 = class329.field3874;
    }

    @ObfuscatedName("bb.p(I)Z")
    public boolean method1733() {
        if (class329.field3874 == this.field1003) {
            this.method1731();
        }
        return class329.field3872 == this.field1003;
    }

    @ObfuscatedName("bb.h(B)I")
    public int method1734() {
        return this.field979 == null || this.field979.field2937 == -1 ? 1 : class148.method2089(this.field979.field2937).field1622;
    }

    @ObfuscatedName("bb.t(I)Lgl;")
    public final class207 method1550() {
        if (this.field979 == null) {
            return null;
        }
        class159 var1 = this.field1053 != -1 && this.field1056 == 0 ? class159.method1334(this.field1053) : null;
        class159 var2 = this.field1050 == -1 || this.field995 || this.field1050 == this.field1030 && var1 != null ? null : class159.method1334(this.field1050);
        class207 var3 = this.field979.method4240(var1, this.field1054, var2, this.field1042);
        if (var3 == null) {
            return null;
        }
        var3.method3772();
        this.field1071 = var3.field2346;
        if (!this.field995 && this.field1058 != -1 && this.field1028 != -1) {
            class207 var4 = class150.method455(this.field1058).method2541(this.field1028);
            if (var4 != null) {
                var4.method3782(0, -this.field1062, 0);
                class207[] var5 = new class207[] { var3, var4 };
                var3 = new class207(var5, 2);
            }
        }
        if (!this.field995 && this.field981 != null) {
            if (client.field452 >= this.field987) {
                this.field981 = null;
            }
            if (client.field452 >= this.field986 && client.field452 < this.field987) {
                class207 var6 = this.field981;
                var6.method3782(this.field983 - this.field1069, this.field984 - this.field985, this.field990 - this.field1059);
                if (this.field1043 == 512) {
                    var6.method3795();
                    var6.method3795();
                    var6.method3795();
                } else if (this.field1043 == 1024) {
                    var6.method3795();
                    var6.method3795();
                } else if (this.field1043 == 1536) {
                    var6.method3795();
                }
                class207[] var7 = new class207[] { var3, var6 };
                var3 = new class207(var7, 2);
                if (this.field1043 == 512) {
                    var6.method3795();
                } else if (this.field1043 == 1024) {
                    var6.method3795();
                    var6.method3795();
                } else if (this.field1043 == 1536) {
                    var6.method3795();
                    var6.method3795();
                    var6.method3795();
                }
                var6.method3782(this.field1069 - this.field983, this.field985 - this.field984, this.field1059 - this.field990);
            }
        }
        var3.field2430 = true;
        return var3;
    }

    @ObfuscatedName("bb.k(IIBI)V")
    public final void method1735(int arg0, int arg1, byte arg2) {
        if (this.field1053 != -1 && class159.method1334(this.field1053).field1860 == 1) {
            this.field1053 = -1;
        }
        this.field1049 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1745(arg0, arg1);
        } else if (this.field1076[0] >= 0 && this.field1076[0] < 104 && this.field1077[0] >= 0 && this.field1077[0] < 104) {
            if (arg2 == 2) {
                class70 var4 = this;
                int var5 = this.field1076[0];
                int var6 = this.field1077[0];
                int var7 = this.method1734();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method1734();
                    client.field494.field1894 = arg0;
                    client.field494.field1892 = arg1;
                    client.field494.field1893 = 1;
                    client.field494.field1891 = 1;
                    class46 var11 = client.field494;
                    int var12 = class162.method2242(var5, var6, var10, var11, client.field465[this.field999], true, client.field684, client.field666);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method1736(client.field684[var13], client.field666[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method1736(arg0, arg1, arg2);
        } else {
            this.method1745(arg0, arg1);
        }
    }

    @ObfuscatedName("bb.a(IIB)V")
    public void method1745(int arg0, int arg1) {
        this.field1027 = 0;
        this.field1067 = 0;
        this.field1079 = 0;
        this.field1076[0] = arg0;
        this.field1077[0] = arg1;
        int var3 = this.method1734();
        this.field1069 = this.field1076[0] * 128 + var3 * 64;
        this.field1059 = this.field1077[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bb.q(IIBI)V")
    public final void method1736(int arg0, int arg1, byte arg2) {
        if (this.field1027 < 9) {
            this.field1027++;
        }
        for (int var4 = this.field1027; var4 > 0; var4--) {
            this.field1076[var4] = this.field1076[var4 - 1];
            this.field1077[var4] = this.field1077[var4 - 1];
            this.field1031[var4] = this.field1031[var4 - 1];
        }
        this.field1076[0] = arg0;
        this.field1077[0] = arg1;
        this.field1031[0] = arg2;
    }

    @ObfuscatedName("bb.u(B)Z")
    public final boolean method1738() {
        return this.field979 != null;
    }
}
