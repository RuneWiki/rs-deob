package deob;

@ObfuscatedName("e")
public final class class3 extends class40 {

    @ObfuscatedName("e.i")
    public String field37;

    @ObfuscatedName("e.h")
    public class183 field33;

    @ObfuscatedName("e.e")
    public int field41 = -1;

    @ObfuscatedName("e.g")
    public int field35 = -1;

    @ObfuscatedName("e.u")
    public String[] field44 = new String[3];

    @ObfuscatedName("e.d")
    public int field38;

    @ObfuscatedName("e.l")
    public int field39;

    @ObfuscatedName("e.m")
    public int field40;

    @ObfuscatedName("e.j")
    public int field32;

    @ObfuscatedName("e.y")
    public int field42;

    @ObfuscatedName("e.s")
    public int field60;

    @ObfuscatedName("e.p")
    public int field45;

    @ObfuscatedName("e.v")
    public int field52;

    @ObfuscatedName("e.r")
    public class109 field49;

    @ObfuscatedName("e.c")
    public int field47;

    @ObfuscatedName("e.w")
    public int field48;

    @ObfuscatedName("e.x")
    public int field58;

    @ObfuscatedName("e.k")
    public int field50;

    @ObfuscatedName("e.z")
    public boolean field51;

    @ObfuscatedName("e.q")
    public int field53;

    @ObfuscatedName("e.o")
    public boolean field46;

    @ObfuscatedName("e.f")
    public int field54;

    @ObfuscatedName("e.b")
    public int field55;

    @ObfuscatedName("e.t")
    public boolean field56;

    @ObfuscatedName("e.a")
    public int field57;

    @ObfuscatedName("e.am")
    public int field34;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field44[var1] = "";
        }
        this.field38 = 0;
        this.field39 = 0;
        this.field32 = 0;
        this.field42 = 0;
        this.field51 = false;
        this.field53 = 0;
        this.field46 = false;
        this.field56 = false;
    }

    @ObfuscatedName("e.i(Ldn;I)V")
    public final void method16(class123 arg0) {
        arg0.field2046 = 0;
        int var2 = arg0.method2404();
        this.field41 = arg0.method2405();
        this.field35 = arg0.method2405();
        int var3 = -1;
        this.field53 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2404();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2404();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2406();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class56.method2018(var4[var5] - 512).field1210;
                    if (var8 != 0) {
                        this.field53 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2404();
            if (var11 < 0 || var11 >= Statics.field273[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field886 = arg0.method2406();
        if (this.field886 == 65535) {
            this.field886 = -1;
        }
        this.field863 = arg0.method2406();
        if (this.field863 == 65535) {
            this.field863 = -1;
        }
        this.field843 = this.field863;
        this.field860 = arg0.method2406();
        if (this.field860 == 65535) {
            this.field860 = -1;
        }
        this.field845 = arg0.method2406();
        if (this.field845 == 65535) {
            this.field845 = -1;
        }
        this.field846 = arg0.method2406();
        if (this.field846 == 65535) {
            this.field846 = -1;
        }
        this.field847 = arg0.method2406();
        if (this.field847 == 65535) {
            this.field847 = -1;
        }
        this.field844 = arg0.method2406();
        if (this.field844 == 65535) {
            this.field844 = -1;
        }
        this.field37 = arg0.method2412();
        if (Statics.field2137 == this) {
            Statics.field1957 = this.field37;
        }
        this.field38 = arg0.method2404();
        this.field39 = arg0.method2406();
        this.field46 = arg0.method2404() == 1;
        if (client.field515 == 0 && client.field466 >= 2) {
            this.field46 = false;
        }
        if (this.field33 == null) {
            this.field33 = new class183();
        }
        this.field33.method3298(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("e.h(I)I")
    public int method17() {
        return this.field33 == null || this.field33.field2972 == -1 ? 1 : class42.method187(this.field33.field2972).field911;
    }

    @ObfuscatedName("e.e(I)Ldo;")
    public final class109 method47() {
        if (this.field33 == null) {
            return null;
        }
        class45 var1 = this.field868 != -1 && this.field852 == 0 ? class45.method3523(this.field868) : null;
        class45 var2 = this.field865 == -1 || this.field51 || this.field886 == this.field865 && var1 != null ? null : class45.method3523(this.field865);
        class109 var3 = this.field33.method3304(var1, this.field854, var2, this.field866);
        if (var3 == null) {
            return null;
        }
        var3.method2204();
        this.field871 = var3.field1511;
        if (!this.field51 && this.field873 != -1 && this.field874 != -1) {
            class109 var4 = class46.method895(this.field873).method901(this.field874);
            if (var4 != null) {
                var4.method2214(0, -this.field877, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (!this.field51 && this.field49 != null) {
            if (client.field333 >= this.field42) {
                this.field49 = null;
            }
            if (client.field333 >= this.field32 && client.field333 < this.field42) {
                class109 var6 = this.field49;
                var6.method2214(this.field60 - this.field879, this.field45 - this.field40, this.field52 - this.field837);
                if (this.field887 == 512) {
                    var6.method2210();
                    var6.method2210();
                    var6.method2210();
                } else if (this.field887 == 1024) {
                    var6.method2210();
                    var6.method2210();
                } else if (this.field887 == 1536) {
                    var6.method2210();
                }
                class109[] var7 = new class109[] { var3, var6 };
                var3 = new class109(var7, 2);
                if (this.field887 == 512) {
                    var6.method2210();
                } else if (this.field887 == 1024) {
                    var6.method2210();
                    var6.method2210();
                } else if (this.field887 == 1536) {
                    var6.method2210();
                    var6.method2210();
                    var6.method2210();
                }
                var6.method2214(this.field879 - this.field60, this.field40 - this.field45, this.field837 - this.field52);
            }
        }
        var3.field1882 = true;
        return var3;
    }

    @ObfuscatedName("e.g(IIBI)V")
    public final void method19(int arg0, int arg1, byte arg2) {
        if (this.field868 != -1 && class45.method3523(this.field868).field1024 == 1) {
            this.field868 = -1;
        }
        this.field864 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method20(arg0, arg1);
        } else if (this.field857[0] >= 0 && this.field857[0] < 104 && this.field858[0] >= 0 && this.field858[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field857[0];
                int var6 = this.field858[0];
                int var7 = this.method17();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method17();
                    client.field581.field1933 = arg0;
                    client.field581.field1934 = arg1;
                    client.field581.field1935 = 1;
                    client.field581.field1936 = 1;
                    class11 var9 = client.field581;
                    class11 var10 = var9;
                    class112 var11 = client.field410[this.field54];
                    int[] var12 = client.field582;
                    int[] var13 = client.field583;
                    int var14 = 0;
                    label339: while (true) {
                        if (var14 >= 128) {
                            boolean var16;
                            if (var8 == 1) {
                                var16 = class110.method999(var5, var6, var9, var11);
                            } else if (var8 == 2) {
                                int var17 = var5;
                                int var18 = var6;
                                byte var19 = 64;
                                byte var20 = 64;
                                int var21 = var5 - var19;
                                int var22 = var6 - var20;
                                class110.field1931[var19][var20] = 99;
                                class110.field1925[var19][var20] = 0;
                                byte var23 = 0;
                                int var24 = 0;
                                class110.field1928[var23] = var5;
                                int var57 = var23 + 1;
                                class110.field1929[var23] = var6;
                                int[][] var25 = var11.field1951;
                                boolean var30;
                                while (true) {
                                    if (var57 == var24) {
                                        Statics.field1922 = var17;
                                        Statics.field1924 = var18;
                                        var30 = false;
                                        break;
                                    }
                                    var17 = class110.field1928[var24];
                                    var18 = class110.field1929[var24];
                                    var24 = var24 + 1 & 0xFFF;
                                    int var26 = var17 - var21;
                                    int var27 = var18 - var22;
                                    int var28 = var17 - var11.field1952;
                                    int var29 = var18 - var11.field1948;
                                    if (var10.method125(2, var17, var18, var11)) {
                                        Statics.field1922 = var17;
                                        Statics.field1924 = var18;
                                        var30 = true;
                                        break;
                                    }
                                    int var31 = class110.field1925[var26][var27] + 1;
                                    if (var26 > 0 && class110.field1931[var26 - 1][var27] == 0 && (var25[var28 - 1][var29] & 0x124010E) == 0 && (var25[var28 - 1][var29 + 1] & 0x1240138) == 0) {
                                        class110.field1928[var57] = var17 - 1;
                                        class110.field1929[var57] = var18;
                                        var57 = var57 + 1 & 0xFFF;
                                        class110.field1931[var26 - 1][var27] = 2;
                                        class110.field1925[var26 - 1][var27] = var31;
                                    }
                                    if (var26 < 126 && class110.field1931[var26 + 1][var27] == 0 && (var25[var28 + 2][var29] & 0x1240183) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E0) == 0) {
                                        class110.field1928[var57] = var17 + 1;
                                        class110.field1929[var57] = var18;
                                        var57 = var57 + 1 & 0xFFF;
                                        class110.field1931[var26 + 1][var27] = 8;
                                        class110.field1925[var26 + 1][var27] = var31;
                                    }
                                    if (var27 > 0 && class110.field1931[var26][var27 - 1] == 0 && (var25[var28][var29 - 1] & 0x124010E) == 0 && (var25[var28 + 1][var29 - 1] & 0x1240183) == 0) {
                                        class110.field1928[var57] = var17;
                                        class110.field1929[var57] = var18 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class110.field1931[var26][var27 - 1] = 1;
                                        class110.field1925[var26][var27 - 1] = var31;
                                    }
                                    if (var27 < 126 && class110.field1931[var26][var27 + 1] == 0 && (var25[var28][var29 + 2] & 0x1240138) == 0 && (var25[var28 + 1][var29 + 2] & 0x12401E0) == 0) {
                                        class110.field1928[var57] = var17;
                                        class110.field1929[var57] = var18 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class110.field1931[var26][var27 + 1] = 4;
                                        class110.field1925[var26][var27 + 1] = var31;
                                    }
                                    if (var26 > 0 && var27 > 0 && class110.field1931[var26 - 1][var27 - 1] == 0 && (var25[var28 - 1][var29] & 0x124013E) == 0 && (var25[var28 - 1][var29 - 1] & 0x124010E) == 0 && (var25[var28][var29 - 1] & 0x124018F) == 0) {
                                        class110.field1928[var57] = var17 - 1;
                                        class110.field1929[var57] = var18 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class110.field1931[var26 - 1][var27 - 1] = 3;
                                        class110.field1925[var26 - 1][var27 - 1] = var31;
                                    }
                                    if (var26 < 126 && var27 > 0 && class110.field1931[var26 + 1][var27 - 1] == 0 && (var25[var28 + 1][var29 - 1] & 0x124018F) == 0 && (var25[var28 + 2][var29 - 1] & 0x1240183) == 0 && (var25[var28 + 2][var29] & 0x12401E3) == 0) {
                                        class110.field1928[var57] = var17 + 1;
                                        class110.field1929[var57] = var18 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class110.field1931[var26 + 1][var27 - 1] = 9;
                                        class110.field1925[var26 + 1][var27 - 1] = var31;
                                    }
                                    if (var26 > 0 && var27 < 126 && class110.field1931[var26 - 1][var27 + 1] == 0 && (var25[var28 - 1][var29 + 1] & 0x124013E) == 0 && (var25[var28 - 1][var29 + 2] & 0x1240138) == 0 && (var25[var28][var29 + 2] & 0x12401F8) == 0) {
                                        class110.field1928[var57] = var17 - 1;
                                        class110.field1929[var57] = var18 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class110.field1931[var26 - 1][var27 + 1] = 6;
                                        class110.field1925[var26 - 1][var27 + 1] = var31;
                                    }
                                    if (var26 < 126 && var27 < 126 && class110.field1931[var26 + 1][var27 + 1] == 0 && (var25[var28 + 1][var29 + 2] & 0x12401F8) == 0 && (var25[var28 + 2][var29 + 2] & 0x12401E0) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E3) == 0) {
                                        class110.field1928[var57] = var17 + 1;
                                        class110.field1929[var57] = var18 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class110.field1931[var26 + 1][var27 + 1] = 12;
                                        class110.field1925[var26 + 1][var27 + 1] = var31;
                                    }
                                }
                                var16 = var30;
                            } else {
                                var16 = class110.method743(var5, var6, var8, var9, var11);
                            }
                            int var50;
                            label362: {
                                int var32 = var5 - 64;
                                int var33 = var6 - 64;
                                int var34 = Statics.field1922;
                                int var35 = Statics.field1924;
                                if (!var16) {
                                    int var36 = Integer.MAX_VALUE;
                                    int var37 = Integer.MAX_VALUE;
                                    byte var38 = 10;
                                    int var39 = var10.field1933;
                                    int var40 = var10.field1934;
                                    int var41 = var10.field1935;
                                    int var42 = var10.field1936;
                                    for (int var43 = var39 - var38; var43 <= var38 + var39; var43++) {
                                        for (int var44 = var40 - var38; var44 <= var38 + var40; var44++) {
                                            int var45 = var43 - var32;
                                            int var46 = var44 - var33;
                                            if (var45 >= 0 && var46 >= 0 && var45 < 128 && var46 < 128 && class110.field1925[var45][var46] < 100) {
                                                int var47 = 0;
                                                if (var43 < var39) {
                                                    var47 = var39 - var43;
                                                } else if (var43 > var39 + var41 - 1) {
                                                    var47 = var43 - (var39 + var41 - 1);
                                                }
                                                int var48 = 0;
                                                if (var44 < var40) {
                                                    var48 = var40 - var44;
                                                } else if (var44 > var40 + var42 - 1) {
                                                    var48 = var44 - (var40 + var42 - 1);
                                                }
                                                int var49 = var47 * var47 + var48 * var48;
                                                if (var49 < var36 || var36 == var49 && class110.field1925[var45][var46] < var37) {
                                                    var36 = var49;
                                                    var37 = class110.field1925[var45][var46];
                                                    var34 = var43;
                                                    var35 = var44;
                                                }
                                            }
                                        }
                                    }
                                    if (var36 == Integer.MAX_VALUE) {
                                        var50 = -1;
                                        break label362;
                                    }
                                }
                                if (var5 == var34 && var6 == var35) {
                                    var50 = 0;
                                } else {
                                    byte var51 = 0;
                                    class110.field1928[var51] = var34;
                                    int var58 = var51 + 1;
                                    class110.field1929[var51] = var35;
                                    int var52;
                                    int var53 = var52 = class110.field1931[var34 - var32][var35 - var33];
                                    while (var5 != var34 || var6 != var35) {
                                        if (var52 != var53) {
                                            var52 = var53;
                                            class110.field1928[var58] = var34;
                                            class110.field1929[var58++] = var35;
                                        }
                                        if ((var53 & 0x2) != 0) {
                                            var34++;
                                        } else if ((var53 & 0x8) != 0) {
                                            var34--;
                                        }
                                        if ((var53 & 0x1) != 0) {
                                            var35++;
                                        } else if ((var53 & 0x4) != 0) {
                                            var35--;
                                        }
                                        var53 = class110.field1931[var34 - var32][var35 - var33];
                                    }
                                    int var54 = 0;
                                    while (var58-- > 0) {
                                        var12[var54] = class110.field1928[var58];
                                        var13[var54++] = class110.field1929[var58];
                                        if (var54 >= var12.length) {
                                            break;
                                        }
                                    }
                                    var50 = var54;
                                }
                            }
                            int var55 = var50;
                            if (var50 < 1) {
                                break;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var55 - 1) {
                                    break label339;
                                }
                                var4.method44(client.field582[var56], client.field583[var56], (byte) 2);
                                var56++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class110.field1931[var14][var15] = 0;
                            class110.field1925[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method44(arg0, arg1, arg2);
        } else {
            this.method20(arg0, arg1);
        }
    }

    @ObfuscatedName("e.n(III)V")
    public void method20(int arg0, int arg1) {
        this.field890 = 0;
        this.field895 = 0;
        this.field894 = 0;
        this.field857[0] = arg0;
        this.field858[0] = arg1;
        int var3 = this.method17();
        this.field879 = this.field857[0] * 128 + var3 * 64;
        this.field837 = this.field858[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("e.u(IIBI)V")
    public final void method44(int arg0, int arg1, byte arg2) {
        if (this.field890 < 9) {
            this.field890++;
        }
        for (int var4 = this.field890; var4 > 0; var4--) {
            this.field857[var4] = this.field857[var4 - 1];
            this.field858[var4] = this.field858[var4 - 1];
            this.field851[var4] = this.field851[var4 - 1];
        }
        this.field857[0] = arg0;
        this.field858[0] = arg1;
        this.field851[0] = arg2;
    }

    @ObfuscatedName("e.d(I)Z")
    public final boolean method22() {
        return this.field33 != null;
    }
}
