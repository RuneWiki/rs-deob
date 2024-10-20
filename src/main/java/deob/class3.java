package deob;

@ObfuscatedName("k")
public final class class3 extends class38 {

    @ObfuscatedName("k.z")
    public String field37;

    @ObfuscatedName("k.q")
    public class179 field53;

    @ObfuscatedName("k.k")
    public int field40 = -1;

    @ObfuscatedName("k.f")
    public int field38 = -1;

    @ObfuscatedName("k.l")
    public String[] field35 = new String[3];

    @ObfuscatedName("k.r")
    public int field36;

    @ObfuscatedName("k.g")
    public int field31;

    @ObfuscatedName("k.h")
    public int field32;

    @ObfuscatedName("k.n")
    public int field39;

    @ObfuscatedName("k.j")
    public int field51;

    @ObfuscatedName("k.a")
    public int field41;

    @ObfuscatedName("k.b")
    public int field42;

    @ObfuscatedName("k.c")
    public int field43;

    @ObfuscatedName("k.v")
    public class105 field44;

    @ObfuscatedName("k.p")
    public int field45;

    @ObfuscatedName("k.i")
    public int field46;

    @ObfuscatedName("k.t")
    public int field48;

    @ObfuscatedName("k.u")
    public int field54;

    @ObfuscatedName("k.e")
    public boolean field49;

    @ObfuscatedName("k.m")
    public int field50;

    @ObfuscatedName("k.s")
    public boolean field30;

    @ObfuscatedName("k.x")
    public int field52;

    @ObfuscatedName("k.y")
    public int field47;

    @ObfuscatedName("k.w")
    public boolean field56;

    @ObfuscatedName("k.o")
    public int field55;

    @ObfuscatedName("k.aw")
    public int field33;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field35[var1] = "";
        }
        this.field36 = 0;
        this.field31 = 0;
        this.field39 = 0;
        this.field51 = 0;
        this.field49 = false;
        this.field50 = 0;
        this.field30 = false;
        this.field56 = false;
    }

    @ObfuscatedName("k.z(Lda;I)V")
    public final void method23(class119 arg0) {
        arg0.field1986 = 0;
        int var2 = arg0.method2457();
        this.field40 = arg0.method2423();
        this.field38 = arg0.method2423();
        int var3 = -1;
        this.field50 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2457();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2457();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2415();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method10(var4[var5] - 512).field1148;
                    if (var8 != 0) {
                        this.field50 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2457();
            if (var11 < 0 || var11 >= Statics.field2902[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field805 = arg0.method2415();
        if (this.field805 == 65535) {
            this.field805 = -1;
        }
        this.field806 = arg0.method2415();
        if (this.field806 == 65535) {
            this.field806 = -1;
        }
        this.field807 = this.field806;
        this.field808 = arg0.method2415();
        if (this.field808 == 65535) {
            this.field808 = -1;
        }
        this.field809 = arg0.method2415();
        if (this.field809 == 65535) {
            this.field809 = -1;
        }
        this.field842 = arg0.method2415();
        if (this.field842 == 65535) {
            this.field842 = -1;
        }
        this.field820 = arg0.method2415();
        if (this.field820 == 65535) {
            this.field820 = -1;
        }
        this.field819 = arg0.method2415();
        if (this.field819 == 65535) {
            this.field819 = -1;
        }
        this.field37 = arg0.method2309();
        if (Statics.field859 == this) {
            Statics.field1900 = this.field37;
        }
        this.field36 = arg0.method2457();
        this.field31 = arg0.method2415();
        this.field30 = arg0.method2457() == 1;
        if (client.field468 == 0 && client.field446 >= 2) {
            this.field30 = false;
        }
        if (this.field53 == null) {
            this.field53 = new class179();
        }
        this.field53.method3185(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("k.q(B)I")
    public int method29() {
        return this.field53 == null || this.field53.field2906 == -1 ? 1 : class40.method2177(this.field53.field2906).field878;
    }

    @ObfuscatedName("k.k(I)Ldb;")
    public final class105 method18() {
        if (this.field53 == null) {
            return null;
        }
        class43 var1 = this.field831 != -1 && this.field833 == 0 ? class43.method72(this.field831) : null;
        class43 var2 = this.field828 == -1 || this.field49 || this.field828 == this.field805 && var1 != null ? null : class43.method72(this.field828);
        class105 var3 = this.field53.method3193(var1, this.field852, var2, this.field846);
        if (var3 == null) {
            return null;
        }
        var3.method2106();
        this.field849 = var3.field1453;
        if (!this.field49 && this.field829 != -1 && this.field802 != -1) {
            class105 var4 = class44.method216(this.field829).method860(this.field802);
            if (var4 != null) {
                var4.method2116(0, -this.field840, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field49 && this.field44 != null) {
            if (client.field290 >= this.field51) {
                this.field44 = null;
            }
            if (client.field290 >= this.field39 && client.field290 < this.field51) {
                class105 var6 = this.field44;
                var6.method2116(this.field41 - this.field826, this.field42 - this.field32, this.field43 - this.field801);
                if (this.field850 == 512) {
                    var6.method2112();
                    var6.method2112();
                    var6.method2112();
                } else if (this.field850 == 1024) {
                    var6.method2112();
                    var6.method2112();
                } else if (this.field850 == 1536) {
                    var6.method2112();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field850 == 512) {
                    var6.method2112();
                } else if (this.field850 == 1024) {
                    var6.method2112();
                    var6.method2112();
                } else if (this.field850 == 1536) {
                    var6.method2112();
                    var6.method2112();
                    var6.method2112();
                }
                var6.method2116(this.field826 - this.field41, this.field32 - this.field42, this.field801 - this.field43);
            }
        }
        var3.field1819 = true;
        return var3;
    }

    @ObfuscatedName("k.f(IIBI)V")
    public final void method35(int arg0, int arg1, byte arg2) {
        if (this.field831 != -1 && class43.method72(this.field831).field991 == 1) {
            this.field831 = -1;
        }
        this.field838 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method20(arg0, arg1);
        } else if (this.field854[0] >= 0 && this.field854[0] < 104 && this.field855[0] >= 0 && this.field855[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field854[0];
                int var6 = this.field855[0];
                int var7 = this.method29();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method29();
                    client.field559.field1870 = arg0;
                    client.field559.field1877 = arg1;
                    client.field559.field1871 = 1;
                    client.field559.field1876 = 1;
                    class11 var9 = client.field559;
                    class11 var10 = var9;
                    class108 var11 = client.field341[this.field52];
                    int[] var12 = client.field318;
                    int[] var13 = client.field561;
                    int var14 = 0;
                    label440: while (true) {
                        if (var14 >= 128) {
                            boolean var31;
                            if (var8 == 1) {
                                int var16 = var5;
                                int var17 = var6;
                                byte var18 = 64;
                                byte var19 = 64;
                                int var20 = var5 - var18;
                                int var21 = var6 - var19;
                                class106.field1866[var18][var19] = 99;
                                class106.field1861[var18][var19] = 0;
                                byte var22 = 0;
                                int var23 = 0;
                                class106.field1869[var22] = var5;
                                int var72 = var22 + 1;
                                class106.field1859[var22] = var6;
                                int[][] var24 = var11.field1892;
                                boolean var29;
                                while (true) {
                                    if (var72 == var23) {
                                        Statics.field1862 = var16;
                                        Statics.field1863 = var17;
                                        var29 = false;
                                        break;
                                    }
                                    var16 = class106.field1869[var23];
                                    var17 = class106.field1859[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    int var25 = var16 - var20;
                                    int var26 = var17 - var21;
                                    int var27 = var16 - var11.field1888;
                                    int var28 = var17 - var11.field1889;
                                    if (var10.method134(1, var16, var17, var11)) {
                                        Statics.field1862 = var16;
                                        Statics.field1863 = var17;
                                        var29 = true;
                                        break;
                                    }
                                    int var30 = class106.field1861[var25][var26] + 1;
                                    if (var25 > 0 && class106.field1866[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0) {
                                        class106.field1869[var72] = var16 - 1;
                                        class106.field1859[var72] = var17;
                                        var72 = var72 + 1 & 0xFFF;
                                        class106.field1866[var25 - 1][var26] = 2;
                                        class106.field1861[var25 - 1][var26] = var30;
                                    }
                                    if (var25 < 127 && class106.field1866[var25 + 1][var26] == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0) {
                                        class106.field1869[var72] = var16 + 1;
                                        class106.field1859[var72] = var17;
                                        var72 = var72 + 1 & 0xFFF;
                                        class106.field1866[var25 + 1][var26] = 8;
                                        class106.field1861[var25 + 1][var26] = var30;
                                    }
                                    if (var26 > 0 && class106.field1866[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class106.field1869[var72] = var16;
                                        class106.field1859[var72] = var17 - 1;
                                        var72 = var72 + 1 & 0xFFF;
                                        class106.field1866[var25][var26 - 1] = 1;
                                        class106.field1861[var25][var26 - 1] = var30;
                                    }
                                    if (var26 < 127 && class106.field1866[var25][var26 + 1] == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class106.field1869[var72] = var16;
                                        class106.field1859[var72] = var17 + 1;
                                        var72 = var72 + 1 & 0xFFF;
                                        class106.field1866[var25][var26 + 1] = 4;
                                        class106.field1861[var25][var26 + 1] = var30;
                                    }
                                    if (var25 > 0 && var26 > 0 && class106.field1866[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class106.field1869[var72] = var16 - 1;
                                        class106.field1859[var72] = var17 - 1;
                                        var72 = var72 + 1 & 0xFFF;
                                        class106.field1866[var25 - 1][var26 - 1] = 3;
                                        class106.field1861[var25 - 1][var26 - 1] = var30;
                                    }
                                    if (var25 < 127 && var26 > 0 && class106.field1866[var25 + 1][var26 - 1] == 0 && (var24[var27 + 1][var28 - 1] & 0x1240183) == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class106.field1869[var72] = var16 + 1;
                                        class106.field1859[var72] = var17 - 1;
                                        var72 = var72 + 1 & 0xFFF;
                                        class106.field1866[var25 + 1][var26 - 1] = 9;
                                        class106.field1861[var25 + 1][var26 - 1] = var30;
                                    }
                                    if (var25 > 0 && var26 < 127 && class106.field1866[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var28 + 1] & 0x1240138) == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class106.field1869[var72] = var16 - 1;
                                        class106.field1859[var72] = var17 + 1;
                                        var72 = var72 + 1 & 0xFFF;
                                        class106.field1866[var25 - 1][var26 + 1] = 6;
                                        class106.field1861[var25 - 1][var26 + 1] = var30;
                                    }
                                    if (var25 < 127 && var26 < 127 && class106.field1866[var25 + 1][var26 + 1] == 0 && (var24[var27 + 1][var28 + 1] & 0x12401E0) == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class106.field1869[var72] = var16 + 1;
                                        class106.field1859[var72] = var17 + 1;
                                        var72 = var72 + 1 & 0xFFF;
                                        class106.field1866[var25 + 1][var26 + 1] = 12;
                                        class106.field1861[var25 + 1][var26 + 1] = var30;
                                    }
                                }
                                var31 = var29;
                            } else if (var8 == 2) {
                                int var32 = var5;
                                int var33 = var6;
                                byte var34 = 64;
                                byte var35 = 64;
                                int var36 = var5 - var34;
                                int var37 = var6 - var35;
                                class106.field1866[var34][var35] = 99;
                                class106.field1861[var34][var35] = 0;
                                byte var38 = 0;
                                int var39 = 0;
                                class106.field1869[var38] = var5;
                                int var73 = var38 + 1;
                                class106.field1859[var38] = var6;
                                int[][] var40 = var11.field1892;
                                boolean var45;
                                while (true) {
                                    if (var73 == var39) {
                                        Statics.field1862 = var32;
                                        Statics.field1863 = var33;
                                        var45 = false;
                                        break;
                                    }
                                    var32 = class106.field1869[var39];
                                    var33 = class106.field1859[var39];
                                    var39 = var39 + 1 & 0xFFF;
                                    int var41 = var32 - var36;
                                    int var42 = var33 - var37;
                                    int var43 = var32 - var11.field1888;
                                    int var44 = var33 - var11.field1889;
                                    if (var10.method134(2, var32, var33, var11)) {
                                        Statics.field1862 = var32;
                                        Statics.field1863 = var33;
                                        var45 = true;
                                        break;
                                    }
                                    int var46 = class106.field1861[var41][var42] + 1;
                                    if (var41 > 0 && class106.field1866[var41 - 1][var42] == 0 && (var40[var43 - 1][var44] & 0x124010E) == 0 && (var40[var43 - 1][var44 + 1] & 0x1240138) == 0) {
                                        class106.field1869[var73] = var32 - 1;
                                        class106.field1859[var73] = var33;
                                        var73 = var73 + 1 & 0xFFF;
                                        class106.field1866[var41 - 1][var42] = 2;
                                        class106.field1861[var41 - 1][var42] = var46;
                                    }
                                    if (var41 < 126 && class106.field1866[var41 + 1][var42] == 0 && (var40[var43 + 2][var44] & 0x1240183) == 0 && (var40[var43 + 2][var44 + 1] & 0x12401E0) == 0) {
                                        class106.field1869[var73] = var32 + 1;
                                        class106.field1859[var73] = var33;
                                        var73 = var73 + 1 & 0xFFF;
                                        class106.field1866[var41 + 1][var42] = 8;
                                        class106.field1861[var41 + 1][var42] = var46;
                                    }
                                    if (var42 > 0 && class106.field1866[var41][var42 - 1] == 0 && (var40[var43][var44 - 1] & 0x124010E) == 0 && (var40[var43 + 1][var44 - 1] & 0x1240183) == 0) {
                                        class106.field1869[var73] = var32;
                                        class106.field1859[var73] = var33 - 1;
                                        var73 = var73 + 1 & 0xFFF;
                                        class106.field1866[var41][var42 - 1] = 1;
                                        class106.field1861[var41][var42 - 1] = var46;
                                    }
                                    if (var42 < 126 && class106.field1866[var41][var42 + 1] == 0 && (var40[var43][var44 + 2] & 0x1240138) == 0 && (var40[var43 + 1][var44 + 2] & 0x12401E0) == 0) {
                                        class106.field1869[var73] = var32;
                                        class106.field1859[var73] = var33 + 1;
                                        var73 = var73 + 1 & 0xFFF;
                                        class106.field1866[var41][var42 + 1] = 4;
                                        class106.field1861[var41][var42 + 1] = var46;
                                    }
                                    if (var41 > 0 && var42 > 0 && class106.field1866[var41 - 1][var42 - 1] == 0 && (var40[var43 - 1][var44] & 0x124013E) == 0 && (var40[var43 - 1][var44 - 1] & 0x124010E) == 0 && (var40[var43][var44 - 1] & 0x124018F) == 0) {
                                        class106.field1869[var73] = var32 - 1;
                                        class106.field1859[var73] = var33 - 1;
                                        var73 = var73 + 1 & 0xFFF;
                                        class106.field1866[var41 - 1][var42 - 1] = 3;
                                        class106.field1861[var41 - 1][var42 - 1] = var46;
                                    }
                                    if (var41 < 126 && var42 > 0 && class106.field1866[var41 + 1][var42 - 1] == 0 && (var40[var43 + 1][var44 - 1] & 0x124018F) == 0 && (var40[var43 + 2][var44 - 1] & 0x1240183) == 0 && (var40[var43 + 2][var44] & 0x12401E3) == 0) {
                                        class106.field1869[var73] = var32 + 1;
                                        class106.field1859[var73] = var33 - 1;
                                        var73 = var73 + 1 & 0xFFF;
                                        class106.field1866[var41 + 1][var42 - 1] = 9;
                                        class106.field1861[var41 + 1][var42 - 1] = var46;
                                    }
                                    if (var41 > 0 && var42 < 126 && class106.field1866[var41 - 1][var42 + 1] == 0 && (var40[var43 - 1][var44 + 1] & 0x124013E) == 0 && (var40[var43 - 1][var44 + 2] & 0x1240138) == 0 && (var40[var43][var44 + 2] & 0x12401F8) == 0) {
                                        class106.field1869[var73] = var32 - 1;
                                        class106.field1859[var73] = var33 + 1;
                                        var73 = var73 + 1 & 0xFFF;
                                        class106.field1866[var41 - 1][var42 + 1] = 6;
                                        class106.field1861[var41 - 1][var42 + 1] = var46;
                                    }
                                    if (var41 < 126 && var42 < 126 && class106.field1866[var41 + 1][var42 + 1] == 0 && (var40[var43 + 1][var44 + 2] & 0x12401F8) == 0 && (var40[var43 + 2][var44 + 2] & 0x12401E0) == 0 && (var40[var43 + 2][var44 + 1] & 0x12401E3) == 0) {
                                        class106.field1869[var73] = var32 + 1;
                                        class106.field1859[var73] = var33 + 1;
                                        var73 = var73 + 1 & 0xFFF;
                                        class106.field1866[var41 + 1][var42 + 1] = 12;
                                        class106.field1861[var41 + 1][var42 + 1] = var46;
                                    }
                                }
                                var31 = var45;
                            } else {
                                var31 = class106.method986(var5, var6, var8, var9, var11);
                            }
                            int var65;
                            label465: {
                                int var47 = var5 - 64;
                                int var48 = var6 - 64;
                                int var49 = Statics.field1862;
                                int var50 = Statics.field1863;
                                if (!var31) {
                                    int var51 = Integer.MAX_VALUE;
                                    int var52 = Integer.MAX_VALUE;
                                    byte var53 = 10;
                                    int var54 = var10.field1870;
                                    int var55 = var10.field1877;
                                    int var56 = var10.field1871;
                                    int var57 = var10.field1876;
                                    for (int var58 = var54 - var53; var58 <= var53 + var54; var58++) {
                                        for (int var59 = var55 - var53; var59 <= var53 + var55; var59++) {
                                            int var60 = var58 - var47;
                                            int var61 = var59 - var48;
                                            if (var60 >= 0 && var61 >= 0 && var60 < 128 && var61 < 128 && class106.field1861[var60][var61] < 100) {
                                                int var62 = 0;
                                                if (var58 < var54) {
                                                    var62 = var54 - var58;
                                                } else if (var58 > var54 + var56 - 1) {
                                                    var62 = var58 - (var54 + var56 - 1);
                                                }
                                                int var63 = 0;
                                                if (var59 < var55) {
                                                    var63 = var55 - var59;
                                                } else if (var59 > var55 + var57 - 1) {
                                                    var63 = var59 - (var55 + var57 - 1);
                                                }
                                                int var64 = var62 * var62 + var63 * var63;
                                                if (var64 < var51 || var51 == var64 && class106.field1861[var60][var61] < var52) {
                                                    var51 = var64;
                                                    var52 = class106.field1861[var60][var61];
                                                    var49 = var58;
                                                    var50 = var59;
                                                }
                                            }
                                        }
                                    }
                                    if (var51 == Integer.MAX_VALUE) {
                                        var65 = -1;
                                        break label465;
                                    }
                                }
                                if (var5 == var49 && var6 == var50) {
                                    var65 = 0;
                                } else {
                                    byte var66 = 0;
                                    class106.field1869[var66] = var49;
                                    int var74 = var66 + 1;
                                    class106.field1859[var66] = var50;
                                    int var67;
                                    int var68 = var67 = class106.field1866[var49 - var47][var50 - var48];
                                    while (var5 != var49 || var6 != var50) {
                                        if (var67 != var68) {
                                            var67 = var68;
                                            class106.field1869[var74] = var49;
                                            class106.field1859[var74++] = var50;
                                        }
                                        if ((var68 & 0x2) != 0) {
                                            var49++;
                                        } else if ((var68 & 0x8) != 0) {
                                            var49--;
                                        }
                                        if ((var68 & 0x1) != 0) {
                                            var50++;
                                        } else if ((var68 & 0x4) != 0) {
                                            var50--;
                                        }
                                        var68 = class106.field1866[var49 - var47][var50 - var48];
                                    }
                                    int var69 = 0;
                                    while (var74-- > 0) {
                                        var12[var69] = class106.field1869[var74];
                                        var13[var69++] = class106.field1859[var74];
                                        if (var69 >= var12.length) {
                                            break;
                                        }
                                    }
                                    var65 = var69;
                                }
                            }
                            int var70 = var65;
                            if (var65 < 1) {
                                break;
                            }
                            int var71 = 0;
                            while (true) {
                                if (var71 >= var70 - 1) {
                                    break label440;
                                }
                                var4.method31(client.field318[var71], client.field561[var71], (byte) 2);
                                var71++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class106.field1866[var14][var15] = 0;
                            class106.field1861[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method31(arg0, arg1, arg2);
        } else {
            this.method20(arg0, arg1);
        }
    }

    @ObfuscatedName("k.d(III)V")
    public void method20(int arg0, int arg1) {
        this.field853 = 0;
        this.field858 = 0;
        this.field810 = 0;
        this.field854[0] = arg0;
        this.field855[0] = arg1;
        int var3 = this.method29();
        this.field826 = this.field854[0] * 128 + var3 * 64;
        this.field801 = this.field855[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("k.l(IIBI)V")
    public final void method31(int arg0, int arg1, byte arg2) {
        if (this.field853 < 9) {
            this.field853++;
        }
        for (int var4 = this.field853; var4 > 0; var4--) {
            this.field854[var4] = this.field854[var4 - 1];
            this.field855[var4] = this.field855[var4 - 1];
            this.field856[var4] = this.field856[var4 - 1];
        }
        this.field854[0] = arg0;
        this.field855[0] = arg1;
        this.field856[0] = arg2;
    }

    @ObfuscatedName("k.r(I)Z")
    public final boolean method22() {
        return this.field53 != null;
    }
}
