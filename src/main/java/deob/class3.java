package deob;

@ObfuscatedName("c")
public final class class3 extends class40 {

    @ObfuscatedName("c.e")
    public String field53;

    @ObfuscatedName("c.l")
    public class183 field54;

    @ObfuscatedName("c.c")
    public int field32 = -1;

    @ObfuscatedName("c.h")
    public int field45 = -1;

    @ObfuscatedName("c.a")
    public String[] field48 = new String[3];

    @ObfuscatedName("c.b")
    public int field36;

    @ObfuscatedName("c.u")
    public int field37;

    @ObfuscatedName("c.o")
    public int field51;

    @ObfuscatedName("c.p")
    public int field39;

    @ObfuscatedName("c.i")
    public int field31;

    @ObfuscatedName("c.q")
    public int field41;

    @ObfuscatedName("c.g")
    public int field44;

    @ObfuscatedName("c.j")
    public int field43;

    @ObfuscatedName("c.w")
    public class109 field42;

    @ObfuscatedName("c.x")
    public int field35;

    @ObfuscatedName("c.f")
    public int field46;

    @ObfuscatedName("c.t")
    public int field47;

    @ObfuscatedName("c.z")
    public int field30;

    @ObfuscatedName("c.y")
    public boolean field49;

    @ObfuscatedName("c.m")
    public int field50;

    @ObfuscatedName("c.v")
    public boolean field52;

    @ObfuscatedName("c.k")
    public int field58;

    @ObfuscatedName("c.n")
    public int field40;

    @ObfuscatedName("c.d")
    public boolean field38;

    @ObfuscatedName("c.s")
    public int field55;

    @ObfuscatedName("c.ah")
    public int field56;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field48[var1] = "";
        }
        this.field36 = 0;
        this.field37 = 0;
        this.field39 = 0;
        this.field31 = 0;
        this.field49 = false;
        this.field50 = 0;
        this.field52 = false;
        this.field38 = false;
    }

    @ObfuscatedName("c.e(Ldd;I)V")
    public final void method23(class123 arg0) {
        arg0.field2062 = 0;
        int var2 = arg0.method2464();
        this.field32 = arg0.method2465();
        this.field45 = arg0.method2465();
        int var3 = -1;
        this.field50 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2464();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2464();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2466();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class56.method104(var4[var5] - 512).field1189;
                    if (var8 != 0) {
                        this.field50 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2464();
            if (var11 < 0 || var11 >= Statics.field917[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field855 = arg0.method2466();
        if (this.field855 == 65535) {
            this.field855 = -1;
        }
        this.field857 = arg0.method2466();
        if (this.field857 == 65535) {
            this.field857 = -1;
        }
        this.field858 = this.field857;
        this.field859 = arg0.method2466();
        if (this.field859 == 65535) {
            this.field859 = -1;
        }
        this.field851 = arg0.method2466();
        if (this.field851 == 65535) {
            this.field851 = -1;
        }
        this.field861 = arg0.method2466();
        if (this.field861 == 65535) {
            this.field861 = -1;
        }
        this.field862 = arg0.method2466();
        if (this.field862 == 65535) {
            this.field862 = -1;
        }
        this.field899 = arg0.method2466();
        if (this.field899 == 65535) {
            this.field899 = -1;
        }
        this.field53 = arg0.method2471();
        if (Statics.field2036 == this) {
            Statics.field3210 = this.field53;
        }
        this.field36 = arg0.method2464();
        this.field37 = arg0.method2466();
        this.field52 = arg0.method2464() == 1;
        if (client.field400 == 0 && client.field440 >= 2) {
            this.field52 = false;
        }
        if (this.field54 == null) {
            this.field54 = new class183();
        }
        this.field54.method3352(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("c.l(B)I")
    public int method8() {
        return this.field54 == null || this.field54.field2959 == -1 ? 1 : class42.method1250(this.field54.field2959).field925;
    }

    @ObfuscatedName("c.c(I)Lds;")
    public final class109 method9() {
        if (this.field54 == null) {
            return null;
        }
        class45 var1 = this.field891 != -1 && this.field905 == 0 ? Statics.method144(this.field891) : null;
        class45 var2 = this.field901 == -1 || this.field49 || this.field901 == this.field855 && var1 != null ? null : Statics.method144(this.field901);
        class109 var3 = this.field54.method3366(var1, this.field866, var2, this.field881);
        if (var3 == null) {
            return null;
        }
        var3.method2248();
        this.field856 = var3.field1530;
        if (!this.field49 && this.field888 != -1 && this.field889 != -1) {
            class109 var4 = class46.method3025(this.field888).method932(this.field889);
            if (var4 != null) {
                var4.method2257(0, -this.field892, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (!this.field49 && this.field42 != null) {
            if (client.field568 >= this.field31) {
                this.field42 = null;
            }
            if (client.field568 >= this.field39 && client.field568 < this.field31) {
                class109 var6 = this.field42;
                var6.method2257(this.field41 - this.field897, this.field44 - this.field51, this.field43 - this.field880);
                if (this.field890 == 512) {
                    var6.method2254();
                    var6.method2254();
                    var6.method2254();
                } else if (this.field890 == 1024) {
                    var6.method2254();
                    var6.method2254();
                } else if (this.field890 == 1536) {
                    var6.method2254();
                }
                class109[] var7 = new class109[] { var3, var6 };
                var3 = new class109(var7, 2);
                if (this.field890 == 512) {
                    var6.method2254();
                } else if (this.field890 == 1024) {
                    var6.method2254();
                    var6.method2254();
                } else if (this.field890 == 1536) {
                    var6.method2254();
                    var6.method2254();
                    var6.method2254();
                }
                var6.method2257(this.field897 - this.field41, this.field51 - this.field44, this.field880 - this.field43);
            }
        }
        var3.field1930 = true;
        return var3;
    }

    @ObfuscatedName("c.h(IIBB)V")
    public final void method10(int arg0, int arg1, byte arg2) {
        if (this.field891 != -1 && Statics.method144(this.field891).field1036 == 1) {
            this.field891 = -1;
        }
        this.field879 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method24(arg0, arg1);
        } else if (this.field886[0] >= 0 && this.field886[0] < 104 && this.field907[0] >= 0 && this.field907[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field886[0];
                int var6 = this.field907[0];
                int var7 = this.method8();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method8();
                    class111 var9 = client.method2372(arg0, arg1);
                    class112 var10 = client.field408[this.field58];
                    int[] var11 = client.field577;
                    int[] var12 = client.field578;
                    int var13 = 0;
                    label570: while (true) {
                        if (var13 >= 128) {
                            boolean var30;
                            if (var8 == 1) {
                                int var15 = var5;
                                int var16 = var6;
                                byte var17 = 64;
                                byte var18 = 64;
                                int var19 = var5 - var17;
                                int var20 = var6 - var18;
                                class110.field1943[var17][var18] = 99;
                                class110.field1944[var17][var18] = 0;
                                byte var21 = 0;
                                int var22 = 0;
                                class110.field1945[var21] = var5;
                                int var79 = var21 + 1;
                                class110.field1946[var21] = var6;
                                int[][] var23 = var10.field1970;
                                boolean var28;
                                while (true) {
                                    if (var79 == var22) {
                                        Statics.field723 = var15;
                                        Statics.field2089 = var16;
                                        var28 = false;
                                        break;
                                    }
                                    var15 = class110.field1945[var22];
                                    var16 = class110.field1946[var22];
                                    var22 = var22 + 1 & 0xFFF;
                                    int var24 = var15 - var19;
                                    int var25 = var16 - var20;
                                    int var26 = var15 - var10.field1966;
                                    int var27 = var16 - var10.field1967;
                                    if (var9.method109(1, var15, var16, var10)) {
                                        Statics.field723 = var15;
                                        Statics.field2089 = var16;
                                        var28 = true;
                                        break;
                                    }
                                    int var29 = class110.field1944[var24][var25] + 1;
                                    if (var24 > 0 && class110.field1943[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0) {
                                        class110.field1945[var79] = var15 - 1;
                                        class110.field1946[var79] = var16;
                                        var79 = var79 + 1 & 0xFFF;
                                        class110.field1943[var24 - 1][var25] = 2;
                                        class110.field1944[var24 - 1][var25] = var29;
                                    }
                                    if (var24 < 127 && class110.field1943[var24 + 1][var25] == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0) {
                                        class110.field1945[var79] = var15 + 1;
                                        class110.field1946[var79] = var16;
                                        var79 = var79 + 1 & 0xFFF;
                                        class110.field1943[var24 + 1][var25] = 8;
                                        class110.field1944[var24 + 1][var25] = var29;
                                    }
                                    if (var25 > 0 && class110.field1943[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                                        class110.field1945[var79] = var15;
                                        class110.field1946[var79] = var16 - 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class110.field1943[var24][var25 - 1] = 1;
                                        class110.field1944[var24][var25 - 1] = var29;
                                    }
                                    if (var25 < 127 && class110.field1943[var24][var25 + 1] == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                                        class110.field1945[var79] = var15;
                                        class110.field1946[var79] = var16 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class110.field1943[var24][var25 + 1] = 4;
                                        class110.field1944[var24][var25 + 1] = var29;
                                    }
                                    if (var24 > 0 && var25 > 0 && class110.field1943[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                                        class110.field1945[var79] = var15 - 1;
                                        class110.field1946[var79] = var16 - 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class110.field1943[var24 - 1][var25 - 1] = 3;
                                        class110.field1944[var24 - 1][var25 - 1] = var29;
                                    }
                                    if (var24 < 127 && var25 > 0 && class110.field1943[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                                        class110.field1945[var79] = var15 + 1;
                                        class110.field1946[var79] = var16 - 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class110.field1943[var24 + 1][var25 - 1] = 9;
                                        class110.field1944[var24 + 1][var25 - 1] = var29;
                                    }
                                    if (var24 > 0 && var25 < 127 && class110.field1943[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                                        class110.field1945[var79] = var15 - 1;
                                        class110.field1946[var79] = var16 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class110.field1943[var24 - 1][var25 + 1] = 6;
                                        class110.field1944[var24 - 1][var25 + 1] = var29;
                                    }
                                    if (var24 < 127 && var25 < 127 && class110.field1943[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 1] & 0x12401E0) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                                        class110.field1945[var79] = var15 + 1;
                                        class110.field1946[var79] = var16 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class110.field1943[var24 + 1][var25 + 1] = 12;
                                        class110.field1944[var24 + 1][var25 + 1] = var29;
                                    }
                                }
                                var30 = var28;
                            } else if (var8 == 2) {
                                var30 = class110.method654(var5, var6, var9, var10);
                            } else {
                                int var31 = var5;
                                int var32 = var6;
                                byte var33 = 64;
                                byte var34 = 64;
                                int var35 = var5 - var33;
                                int var36 = var6 - var34;
                                class110.field1943[var33][var34] = 99;
                                class110.field1944[var33][var34] = 0;
                                byte var37 = 0;
                                int var38 = 0;
                                class110.field1945[var37] = var5;
                                int var80 = var37 + 1;
                                class110.field1946[var37] = var6;
                                int[][] var39 = var10.field1970;
                                boolean var44;
                                label548: while (true) {
                                    label546: while (true) {
                                        int var40;
                                        int var41;
                                        int var42;
                                        int var43;
                                        int var45;
                                        do {
                                            do {
                                                do {
                                                    label523: do {
                                                        if (var80 == var38) {
                                                            Statics.field723 = var31;
                                                            Statics.field2089 = var32;
                                                            var44 = false;
                                                            break label548;
                                                        }
                                                        var31 = class110.field1945[var38];
                                                        var32 = class110.field1946[var38];
                                                        var38 = var38 + 1 & 0xFFF;
                                                        var40 = var31 - var35;
                                                        var41 = var32 - var36;
                                                        var42 = var31 - var10.field1966;
                                                        var43 = var32 - var10.field1967;
                                                        if (var9.method109(var8, var31, var32, var10)) {
                                                            Statics.field723 = var31;
                                                            Statics.field2089 = var32;
                                                            var44 = true;
                                                            break label548;
                                                        }
                                                        var45 = class110.field1944[var40][var41] + 1;
                                                        if (var40 > 0 && class110.field1943[var40 - 1][var41] == 0 && (var39[var42 - 1][var43] & 0x124010E) == 0 && (var39[var42 - 1][var8 + var43 - 1] & 0x1240138) == 0) {
                                                            int var46 = 1;
                                                            while (true) {
                                                                if (var46 >= var8 - 1) {
                                                                    class110.field1945[var80] = var31 - 1;
                                                                    class110.field1946[var80] = var32;
                                                                    var80 = var80 + 1 & 0xFFF;
                                                                    class110.field1943[var40 - 1][var41] = 2;
                                                                    class110.field1944[var40 - 1][var41] = var45;
                                                                    break;
                                                                }
                                                                if ((var39[var42 - 1][var43 + var46] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var46++;
                                                            }
                                                        }
                                                        if (var40 < 128 - var8 && class110.field1943[var40 + 1][var41] == 0 && (var39[var8 + var42][var43] & 0x1240183) == 0 && (var39[var8 + var42][var8 + var43 - 1] & 0x12401E0) == 0) {
                                                            int var47 = 1;
                                                            while (true) {
                                                                if (var47 >= var8 - 1) {
                                                                    class110.field1945[var80] = var31 + 1;
                                                                    class110.field1946[var80] = var32;
                                                                    var80 = var80 + 1 & 0xFFF;
                                                                    class110.field1943[var40 + 1][var41] = 8;
                                                                    class110.field1944[var40 + 1][var41] = var45;
                                                                    break;
                                                                }
                                                                if ((var39[var8 + var42][var43 + var47] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var47++;
                                                            }
                                                        }
                                                        if (var41 > 0 && class110.field1943[var40][var41 - 1] == 0 && (var39[var42][var43 - 1] & 0x124010E) == 0 && (var39[var8 + var42 - 1][var43 - 1] & 0x1240183) == 0) {
                                                            int var48 = 1;
                                                            while (true) {
                                                                if (var48 >= var8 - 1) {
                                                                    class110.field1945[var80] = var31;
                                                                    class110.field1946[var80] = var32 - 1;
                                                                    var80 = var80 + 1 & 0xFFF;
                                                                    class110.field1943[var40][var41 - 1] = 1;
                                                                    class110.field1944[var40][var41 - 1] = var45;
                                                                    break;
                                                                }
                                                                if ((var39[var42 + var48][var43 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var48++;
                                                            }
                                                        }
                                                        if (var41 < 128 - var8 && class110.field1943[var40][var41 + 1] == 0 && (var39[var42][var8 + var43] & 0x1240138) == 0 && (var39[var8 + var42 - 1][var8 + var43] & 0x12401E0) == 0) {
                                                            int var49 = 1;
                                                            while (true) {
                                                                if (var49 >= var8 - 1) {
                                                                    class110.field1945[var80] = var31;
                                                                    class110.field1946[var80] = var32 + 1;
                                                                    var80 = var80 + 1 & 0xFFF;
                                                                    class110.field1943[var40][var41 + 1] = 4;
                                                                    class110.field1944[var40][var41 + 1] = var45;
                                                                    break;
                                                                }
                                                                if ((var39[var42 + var49][var8 + var43] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var49++;
                                                            }
                                                        }
                                                        if (var40 > 0 && var41 > 0 && class110.field1943[var40 - 1][var41 - 1] == 0 && (var39[var42 - 1][var43 - 1] & 0x124010E) == 0) {
                                                            int var50 = 1;
                                                            while (true) {
                                                                if (var50 >= var8) {
                                                                    class110.field1945[var80] = var31 - 1;
                                                                    class110.field1946[var80] = var32 - 1;
                                                                    var80 = var80 + 1 & 0xFFF;
                                                                    class110.field1943[var40 - 1][var41 - 1] = 3;
                                                                    class110.field1944[var40 - 1][var41 - 1] = var45;
                                                                    break;
                                                                }
                                                                if ((var39[var42 - 1][var43 - 1 + var50] & 0x124013E) != 0 || (var39[var42 - 1 + var50][var43 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var50++;
                                                            }
                                                        }
                                                        if (var40 < 128 - var8 && var41 > 0 && class110.field1943[var40 + 1][var41 - 1] == 0 && (var39[var8 + var42][var43 - 1] & 0x1240183) == 0) {
                                                            int var51 = 1;
                                                            while (true) {
                                                                if (var51 >= var8) {
                                                                    class110.field1945[var80] = var31 + 1;
                                                                    class110.field1946[var80] = var32 - 1;
                                                                    var80 = var80 + 1 & 0xFFF;
                                                                    class110.field1943[var40 + 1][var41 - 1] = 9;
                                                                    class110.field1944[var40 + 1][var41 - 1] = var45;
                                                                    break;
                                                                }
                                                                if ((var39[var8 + var42][var43 - 1 + var51] & 0x12401E3) != 0 || (var39[var42 + var51][var43 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var51++;
                                                            }
                                                        }
                                                        if (var40 > 0 && var41 < 128 - var8 && class110.field1943[var40 - 1][var41 + 1] == 0 && (var39[var42 - 1][var8 + var43] & 0x1240138) == 0) {
                                                            for (int var52 = 1; var52 < var8; var52++) {
                                                                if ((var39[var42 - 1][var43 + var52] & 0x124013E) != 0 || (var39[var42 - 1 + var52][var8 + var43] & 0x12401F8) != 0) {
                                                                    continue label523;
                                                                }
                                                            }
                                                            class110.field1945[var80] = var31 - 1;
                                                            class110.field1946[var80] = var32 + 1;
                                                            var80 = var80 + 1 & 0xFFF;
                                                            class110.field1943[var40 - 1][var41 + 1] = 6;
                                                            class110.field1944[var40 - 1][var41 + 1] = var45;
                                                        }
                                                    } while (var40 >= 128 - var8);
                                                } while (var41 >= 128 - var8);
                                            } while (class110.field1943[var40 + 1][var41 + 1] != 0);
                                        } while ((var39[var8 + var42][var8 + var43] & 0x12401E0) != 0);
                                        for (int var53 = 1; var53 < var8; var53++) {
                                            if ((var39[var42 + var53][var8 + var43] & 0x12401F8) != 0 || (var39[var8 + var42][var43 + var53] & 0x12401E3) != 0) {
                                                continue label546;
                                            }
                                        }
                                        class110.field1945[var80] = var31 + 1;
                                        class110.field1946[var80] = var32 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class110.field1943[var40 + 1][var41 + 1] = 12;
                                        class110.field1944[var40 + 1][var41 + 1] = var45;
                                    }
                                }
                                var30 = var44;
                            }
                            int var72;
                            label611: {
                                int var54 = var5 - 64;
                                int var55 = var6 - 64;
                                int var56 = Statics.field723;
                                int var57 = Statics.field2089;
                                if (!var30) {
                                    int var58 = Integer.MAX_VALUE;
                                    int var59 = Integer.MAX_VALUE;
                                    byte var60 = 10;
                                    int var61 = var9.field1953;
                                    int var62 = var9.field1950;
                                    int var63 = var9.field1956;
                                    int var64 = var9.field1952;
                                    for (int var65 = var61 - var60; var65 <= var60 + var61; var65++) {
                                        for (int var66 = var62 - var60; var66 <= var60 + var62; var66++) {
                                            int var67 = var65 - var54;
                                            int var68 = var66 - var55;
                                            if (var67 >= 0 && var68 >= 0 && var67 < 128 && var68 < 128 && class110.field1944[var67][var68] < 100) {
                                                int var69 = 0;
                                                if (var65 < var61) {
                                                    var69 = var61 - var65;
                                                } else if (var65 > var61 + var63 - 1) {
                                                    var69 = var65 - (var61 + var63 - 1);
                                                }
                                                int var70 = 0;
                                                if (var66 < var62) {
                                                    var70 = var62 - var66;
                                                } else if (var66 > var62 + var64 - 1) {
                                                    var70 = var66 - (var62 + var64 - 1);
                                                }
                                                int var71 = var69 * var69 + var70 * var70;
                                                if (var71 < var58 || var58 == var71 && class110.field1944[var67][var68] < var59) {
                                                    var58 = var71;
                                                    var59 = class110.field1944[var67][var68];
                                                    var56 = var65;
                                                    var57 = var66;
                                                }
                                            }
                                        }
                                    }
                                    if (var58 == Integer.MAX_VALUE) {
                                        var72 = -1;
                                        break label611;
                                    }
                                }
                                if (var5 == var56 && var6 == var57) {
                                    var72 = 0;
                                } else {
                                    byte var73 = 0;
                                    class110.field1945[var73] = var56;
                                    int var81 = var73 + 1;
                                    class110.field1946[var73] = var57;
                                    int var74;
                                    int var75 = var74 = class110.field1943[var56 - var54][var57 - var55];
                                    while (var5 != var56 || var6 != var57) {
                                        if (var74 != var75) {
                                            var74 = var75;
                                            class110.field1945[var81] = var56;
                                            class110.field1946[var81++] = var57;
                                        }
                                        if ((var75 & 0x2) != 0) {
                                            var56++;
                                        } else if ((var75 & 0x8) != 0) {
                                            var56--;
                                        }
                                        if ((var75 & 0x1) != 0) {
                                            var57++;
                                        } else if ((var75 & 0x4) != 0) {
                                            var57--;
                                        }
                                        var75 = class110.field1943[var56 - var54][var57 - var55];
                                    }
                                    int var76 = 0;
                                    while (var81-- > 0) {
                                        var11[var76] = class110.field1945[var81];
                                        var12[var76++] = class110.field1946[var81];
                                        if (var76 >= var11.length) {
                                            break;
                                        }
                                    }
                                    var72 = var76;
                                }
                            }
                            int var77 = var72;
                            if (var72 < 1) {
                                break;
                            }
                            int var78 = 0;
                            while (true) {
                                if (var78 >= var77 - 1) {
                                    break label570;
                                }
                                var4.method12(client.field577[var78], client.field578[var78], (byte) 2);
                                var78++;
                            }
                        }
                        for (int var14 = 0; var14 < 128; var14++) {
                            class110.field1943[var13][var14] = 0;
                            class110.field1944[var13][var14] = 99999999;
                        }
                        var13++;
                    }
                }
            }
            this.method12(arg0, arg1, arg2);
        } else {
            this.method24(arg0, arg1);
        }
    }

    @ObfuscatedName("c.r(III)V")
    public void method24(int arg0, int arg1) {
        this.field853 = 0;
        this.field910 = 0;
        this.field909 = 0;
        this.field886[0] = arg0;
        this.field907[0] = arg1;
        int var3 = this.method8();
        this.field897 = this.field886[0] * 128 + var3 * 64;
        this.field880 = this.field907[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("c.a(IIBI)V")
    public final void method12(int arg0, int arg1, byte arg2) {
        if (this.field853 < 9) {
            this.field853++;
        }
        for (int var4 = this.field853; var4 > 0; var4--) {
            this.field886[var4] = this.field886[var4 - 1];
            this.field907[var4] = this.field907[var4 - 1];
            this.field908[var4] = this.field908[var4 - 1];
        }
        this.field886[0] = arg0;
        this.field907[0] = arg1;
        this.field908[0] = arg2;
    }

    @ObfuscatedName("c.b(I)Z")
    public final boolean method16() {
        return this.field54 != null;
    }
}
