package deob;

@ObfuscatedName("w")
public final class class3 extends class38 {

    @ObfuscatedName("w.g")
    public String field52;

    @ObfuscatedName("w.b")
    public class179 field41;

    @ObfuscatedName("w.w")
    public int field57 = -1;

    @ObfuscatedName("w.d")
    public int field43 = -1;

    @ObfuscatedName("w.l")
    public String[] field49 = new String[3];

    @ObfuscatedName("w.m")
    public int field62;

    @ObfuscatedName("w.p")
    public int field46;

    @ObfuscatedName("w.u")
    public int field47;

    @ObfuscatedName("w.c")
    public int field48;

    @ObfuscatedName("w.v")
    public int field64;

    @ObfuscatedName("w.o")
    public int field44;

    @ObfuscatedName("w.n")
    public int field51;

    @ObfuscatedName("w.k")
    public int field60;

    @ObfuscatedName("w.f")
    public class105 field53;

    @ObfuscatedName("w.x")
    public int field54;

    @ObfuscatedName("w.j")
    public int field55;

    @ObfuscatedName("w.r")
    public int field50;

    @ObfuscatedName("w.y")
    public int field45;

    @ObfuscatedName("w.t")
    public boolean field58;

    @ObfuscatedName("w.a")
    public int field59;

    @ObfuscatedName("w.s")
    public boolean field56;

    @ObfuscatedName("w.e")
    public int field61;

    @ObfuscatedName("w.q")
    public int field40;

    @ObfuscatedName("w.i")
    public boolean field63;

    @ObfuscatedName("w.h")
    public int field42;

    @ObfuscatedName("w.ay")
    public int field65;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field49[var1] = "";
        }
        this.field62 = 0;
        this.field46 = 0;
        this.field48 = 0;
        this.field64 = 0;
        this.field58 = false;
        this.field59 = 0;
        this.field56 = false;
        this.field63 = false;
    }

    @ObfuscatedName("w.g(Ldm;I)V")
    public final void method17(class119 arg0) {
        arg0.field1977 = 0;
        int var2 = arg0.method2362();
        this.field57 = arg0.method2391();
        this.field43 = arg0.method2391();
        int var3 = -1;
        this.field59 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2362();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2362();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2376();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method2767(var4[var5] - 512).field1154;
                    if (var8 != 0) {
                        this.field59 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2362();
            if (var11 < 0 || var11 >= Statics.field2905[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field823 = arg0.method2376();
        if (this.field823 == 65535) {
            this.field823 = -1;
        }
        this.field862 = arg0.method2376();
        if (this.field862 == 65535) {
            this.field862 = -1;
        }
        this.field832 = this.field862;
        this.field847 = arg0.method2376();
        if (this.field847 == 65535) {
            this.field847 = -1;
        }
        this.field827 = arg0.method2376();
        if (this.field827 == 65535) {
            this.field827 = -1;
        }
        this.field828 = arg0.method2376();
        if (this.field828 == 65535) {
            this.field828 = -1;
        }
        this.field845 = arg0.method2376();
        if (this.field845 == 65535) {
            this.field845 = -1;
        }
        this.field830 = arg0.method2376();
        if (this.field830 == 65535) {
            this.field830 = -1;
        }
        this.field52 = arg0.method2370();
        if (Statics.field176 == this) {
            Statics.field2043 = this.field52;
        }
        this.field62 = arg0.method2362();
        this.field46 = arg0.method2376();
        this.field56 = arg0.method2362() == 1;
        if (client.field475 == 0 && client.field461 >= 2) {
            this.field56 = false;
        }
        if (this.field41 == null) {
            this.field41 = new class179();
        }
        this.field41.method3283(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("w.b(B)I")
    public int method20() {
        return this.field41 == null || this.field41.field2902 == -1 ? 1 : class40.method140(this.field41.field2902).field894;
    }

    @ObfuscatedName("w.w(I)Ldd;")
    public final class105 method19() {
        if (this.field41 == null) {
            return null;
        }
        class43 var1 = this.field859 != -1 && this.field826 == 0 ? class43.method2054(this.field859) : null;
        class43 var2 = this.field846 == -1 || this.field58 || this.field846 == this.field823 && var1 != null ? null : class43.method2054(this.field846);
        class105 var3 = this.field41.method3306(var1, this.field850, var2, this.field852);
        if (var3 == null) {
            return null;
        }
        var3.method2208();
        this.field867 = var3.field1452;
        if (!this.field58 && this.field854 != -1 && this.field855 != -1) {
            class105 var4 = class44.method2656(this.field854).method917(this.field855);
            if (var4 != null) {
                var4.method2189(0, -this.field858, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field58 && this.field53 != null) {
            if (client.field302 >= this.field64) {
                this.field53 = null;
            }
            if (client.field302 >= this.field48 && client.field302 < this.field64) {
                class105 var6 = this.field53;
                var6.method2189(this.field44 - this.field875, this.field51 - this.field47, this.field60 - this.field819);
                if (this.field868 == 512) {
                    var6.method2185();
                    var6.method2185();
                    var6.method2185();
                } else if (this.field868 == 1024) {
                    var6.method2185();
                    var6.method2185();
                } else if (this.field868 == 1536) {
                    var6.method2185();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field868 == 512) {
                    var6.method2185();
                } else if (this.field868 == 1024) {
                    var6.method2185();
                    var6.method2185();
                } else if (this.field868 == 1536) {
                    var6.method2185();
                    var6.method2185();
                    var6.method2185();
                }
                var6.method2189(this.field875 - this.field44, this.field47 - this.field51, this.field819 - this.field60);
            }
        }
        var3.field1797 = true;
        return var3;
    }

    @ObfuscatedName("w.d(IIBB)V")
    public final void method30(int arg0, int arg1, byte arg2) {
        if (this.field859 != -1 && class43.method2054(this.field859).field1006 == 1) {
            this.field859 = -1;
        }
        this.field824 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method21(arg0, arg1);
        } else if (this.field872[0] >= 0 && this.field872[0] < 104 && this.field873[0] >= 0 && this.field873[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field872[0];
                int var6 = this.field873[0];
                int var7 = this.method20();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method20();
                    class107 var9 = client.method2987(arg0, arg1);
                    class108 var10 = client.field355[this.field61];
                    int[] var11 = client.field574;
                    int[] var12 = client.field429;
                    int var13 = 0;
                    label339: while (true) {
                        if (var13 >= 128) {
                            boolean var15;
                            if (var8 == 1) {
                                var15 = class106.method158(var5, var6, var9, var10);
                            } else if (var8 == 2) {
                                int var16 = var5;
                                int var17 = var6;
                                byte var18 = 64;
                                byte var19 = 64;
                                int var20 = var5 - var18;
                                int var21 = var6 - var19;
                                class106.field1858[var18][var19] = 99;
                                class106.field1850[var18][var19] = 0;
                                byte var22 = 0;
                                int var23 = 0;
                                class106.field1855[var22] = var5;
                                int var56 = var22 + 1;
                                class106.field1849[var22] = var6;
                                int[][] var24 = var10.field1883;
                                boolean var29;
                                while (true) {
                                    if (var56 == var23) {
                                        Statics.field1851 = var16;
                                        Statics.field1847 = var17;
                                        var29 = false;
                                        break;
                                    }
                                    var16 = class106.field1855[var23];
                                    var17 = class106.field1849[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    int var25 = var16 - var20;
                                    int var26 = var17 - var21;
                                    int var27 = var16 - var10.field1879;
                                    int var28 = var17 - var10.field1870;
                                    if (var9.method137(2, var16, var17, var10)) {
                                        Statics.field1851 = var16;
                                        Statics.field1847 = var17;
                                        var29 = true;
                                        break;
                                    }
                                    int var30 = class106.field1850[var25][var26] + 1;
                                    if (var25 > 0 && class106.field1858[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x124010E) == 0 && (var24[var27 - 1][var28 + 1] & 0x1240138) == 0) {
                                        class106.field1855[var56] = var16 - 1;
                                        class106.field1849[var56] = var17;
                                        var56 = var56 + 1 & 0xFFF;
                                        class106.field1858[var25 - 1][var26] = 2;
                                        class106.field1850[var25 - 1][var26] = var30;
                                    }
                                    if (var25 < 126 && class106.field1858[var25 + 1][var26] == 0 && (var24[var27 + 2][var28] & 0x1240183) == 0 && (var24[var27 + 2][var28 + 1] & 0x12401E0) == 0) {
                                        class106.field1855[var56] = var16 + 1;
                                        class106.field1849[var56] = var17;
                                        var56 = var56 + 1 & 0xFFF;
                                        class106.field1858[var25 + 1][var26] = 8;
                                        class106.field1850[var25 + 1][var26] = var30;
                                    }
                                    if (var26 > 0 && class106.field1858[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x124010E) == 0 && (var24[var27 + 1][var28 - 1] & 0x1240183) == 0) {
                                        class106.field1855[var56] = var16;
                                        class106.field1849[var56] = var17 - 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class106.field1858[var25][var26 - 1] = 1;
                                        class106.field1850[var25][var26 - 1] = var30;
                                    }
                                    if (var26 < 126 && class106.field1858[var25][var26 + 1] == 0 && (var24[var27][var28 + 2] & 0x1240138) == 0 && (var24[var27 + 1][var28 + 2] & 0x12401E0) == 0) {
                                        class106.field1855[var56] = var16;
                                        class106.field1849[var56] = var17 + 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class106.field1858[var25][var26 + 1] = 4;
                                        class106.field1850[var25][var26 + 1] = var30;
                                    }
                                    if (var25 > 0 && var26 > 0 && class106.field1858[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28] & 0x124013E) == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0 && (var24[var27][var28 - 1] & 0x124018F) == 0) {
                                        class106.field1855[var56] = var16 - 1;
                                        class106.field1849[var56] = var17 - 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class106.field1858[var25 - 1][var26 - 1] = 3;
                                        class106.field1850[var25 - 1][var26 - 1] = var30;
                                    }
                                    if (var25 < 126 && var26 > 0 && class106.field1858[var25 + 1][var26 - 1] == 0 && (var24[var27 + 1][var28 - 1] & 0x124018F) == 0 && (var24[var27 + 2][var28 - 1] & 0x1240183) == 0 && (var24[var27 + 2][var28] & 0x12401E3) == 0) {
                                        class106.field1855[var56] = var16 + 1;
                                        class106.field1849[var56] = var17 - 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class106.field1858[var25 + 1][var26 - 1] = 9;
                                        class106.field1850[var25 + 1][var26 - 1] = var30;
                                    }
                                    if (var25 > 0 && var26 < 126 && class106.field1858[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var28 + 1] & 0x124013E) == 0 && (var24[var27 - 1][var28 + 2] & 0x1240138) == 0 && (var24[var27][var28 + 2] & 0x12401F8) == 0) {
                                        class106.field1855[var56] = var16 - 1;
                                        class106.field1849[var56] = var17 + 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class106.field1858[var25 - 1][var26 + 1] = 6;
                                        class106.field1850[var25 - 1][var26 + 1] = var30;
                                    }
                                    if (var25 < 126 && var26 < 126 && class106.field1858[var25 + 1][var26 + 1] == 0 && (var24[var27 + 1][var28 + 2] & 0x12401F8) == 0 && (var24[var27 + 2][var28 + 2] & 0x12401E0) == 0 && (var24[var27 + 2][var28 + 1] & 0x12401E3) == 0) {
                                        class106.field1855[var56] = var16 + 1;
                                        class106.field1849[var56] = var17 + 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class106.field1858[var25 + 1][var26 + 1] = 12;
                                        class106.field1850[var25 + 1][var26 + 1] = var30;
                                    }
                                }
                                var15 = var29;
                            } else {
                                var15 = class106.method2667(var5, var6, var8, var9, var10);
                            }
                            int var49;
                            label362: {
                                int var31 = var5 - 64;
                                int var32 = var6 - 64;
                                int var33 = Statics.field1851;
                                int var34 = Statics.field1847;
                                if (!var15) {
                                    int var35 = Integer.MAX_VALUE;
                                    int var36 = Integer.MAX_VALUE;
                                    byte var37 = 10;
                                    int var38 = var9.field1864;
                                    int var39 = var9.field1861;
                                    int var40 = var9.field1868;
                                    int var41 = var9.field1863;
                                    for (int var42 = var38 - var37; var42 <= var37 + var38; var42++) {
                                        for (int var43 = var39 - var37; var43 <= var37 + var39; var43++) {
                                            int var44 = var42 - var31;
                                            int var45 = var43 - var32;
                                            if (var44 >= 0 && var45 >= 0 && var44 < 128 && var45 < 128 && class106.field1850[var44][var45] < 100) {
                                                int var46 = 0;
                                                if (var42 < var38) {
                                                    var46 = var38 - var42;
                                                } else if (var42 > var38 + var40 - 1) {
                                                    var46 = var42 - (var38 + var40 - 1);
                                                }
                                                int var47 = 0;
                                                if (var43 < var39) {
                                                    var47 = var39 - var43;
                                                } else if (var43 > var39 + var41 - 1) {
                                                    var47 = var43 - (var39 + var41 - 1);
                                                }
                                                int var48 = var46 * var46 + var47 * var47;
                                                if (var48 < var35 || var35 == var48 && class106.field1850[var44][var45] < var36) {
                                                    var35 = var48;
                                                    var36 = class106.field1850[var44][var45];
                                                    var33 = var42;
                                                    var34 = var43;
                                                }
                                            }
                                        }
                                    }
                                    if (var35 == Integer.MAX_VALUE) {
                                        var49 = -1;
                                        break label362;
                                    }
                                }
                                if (var5 == var33 && var6 == var34) {
                                    var49 = 0;
                                } else {
                                    byte var50 = 0;
                                    class106.field1855[var50] = var33;
                                    int var57 = var50 + 1;
                                    class106.field1849[var50] = var34;
                                    int var51;
                                    int var52 = var51 = class106.field1858[var33 - var31][var34 - var32];
                                    while (var5 != var33 || var6 != var34) {
                                        if (var51 != var52) {
                                            var51 = var52;
                                            class106.field1855[var57] = var33;
                                            class106.field1849[var57++] = var34;
                                        }
                                        if ((var52 & 0x2) != 0) {
                                            var33++;
                                        } else if ((var52 & 0x8) != 0) {
                                            var33--;
                                        }
                                        if ((var52 & 0x1) != 0) {
                                            var34++;
                                        } else if ((var52 & 0x4) != 0) {
                                            var34--;
                                        }
                                        var52 = class106.field1858[var33 - var31][var34 - var32];
                                    }
                                    int var53 = 0;
                                    while (var57-- > 0) {
                                        var11[var53] = class106.field1855[var57];
                                        var12[var53++] = class106.field1849[var57];
                                        if (var53 >= var11.length) {
                                            break;
                                        }
                                    }
                                    var49 = var53;
                                }
                            }
                            int var54 = var49;
                            if (var49 < 1) {
                                break;
                            }
                            int var55 = 0;
                            while (true) {
                                if (var55 >= var54 - 1) {
                                    break label339;
                                }
                                var4.method22(client.field574[var55], client.field429[var55], (byte) 2);
                                var55++;
                            }
                        }
                        for (int var14 = 0; var14 < 128; var14++) {
                            class106.field1858[var13][var14] = 0;
                            class106.field1850[var13][var14] = 99999999;
                        }
                        var13++;
                    }
                }
            }
            this.method22(arg0, arg1, arg2);
        } else {
            this.method21(arg0, arg1);
        }
    }

    @ObfuscatedName("w.z(III)V")
    public void method21(int arg0, int arg1) {
        this.field871 = 0;
        this.field849 = 0;
        this.field842 = 0;
        this.field872[0] = arg0;
        this.field873[0] = arg1;
        int var3 = this.method20();
        this.field875 = this.field872[0] * 128 + var3 * 64;
        this.field819 = this.field873[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("w.l(IIBI)V")
    public final void method22(int arg0, int arg1, byte arg2) {
        if (this.field871 < 9) {
            this.field871++;
        }
        for (int var4 = this.field871; var4 > 0; var4--) {
            this.field872[var4] = this.field872[var4 - 1];
            this.field873[var4] = this.field873[var4 - 1];
            this.field874[var4] = this.field874[var4 - 1];
        }
        this.field872[0] = arg0;
        this.field873[0] = arg1;
        this.field874[0] = arg2;
    }

    @ObfuscatedName("w.m(I)Z")
    public final boolean method44() {
        return this.field41 != null;
    }
}
