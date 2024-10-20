package deob;

@ObfuscatedName("p")
public final class class3 extends class38 {

    @ObfuscatedName("p.s")
    public String field60;

    @ObfuscatedName("p.j")
    public class180 field35;

    @ObfuscatedName("p.p")
    public int field36 = -1;

    @ObfuscatedName("p.x")
    public int field50 = -1;

    @ObfuscatedName("p.u")
    public String[] field51 = new String[3];

    @ObfuscatedName("p.o")
    public int field40;

    @ObfuscatedName("p.b")
    public int field41;

    @ObfuscatedName("p.k")
    public int field42;

    @ObfuscatedName("p.c")
    public int field52;

    @ObfuscatedName("p.l")
    public int field57;

    @ObfuscatedName("p.t")
    public int field45;

    @ObfuscatedName("p.i")
    public int field46;

    @ObfuscatedName("p.r")
    public int field47;

    @ObfuscatedName("p.m")
    public class106 field55;

    @ObfuscatedName("p.e")
    public int field49;

    @ObfuscatedName("p.h")
    public int field39;

    @ObfuscatedName("p.z")
    public int field48;

    @ObfuscatedName("p.a")
    public int field34;

    @ObfuscatedName("p.w")
    public boolean field53;

    @ObfuscatedName("p.g")
    public int field54;

    @ObfuscatedName("p.y")
    public boolean field59;

    @ObfuscatedName("p.f")
    public int field56;

    @ObfuscatedName("p.q")
    public int field43;

    @ObfuscatedName("p.n")
    public boolean field37;

    @ObfuscatedName("p.v")
    public int field38;

    @ObfuscatedName("p.ab")
    public int field58;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field51[var1] = "";
        }
        this.field40 = 0;
        this.field41 = 0;
        this.field52 = 0;
        this.field57 = 0;
        this.field53 = false;
        this.field54 = 0;
        this.field59 = false;
        this.field37 = false;
    }

    @ObfuscatedName("p.s(Lds;I)V")
    public final void method12(class120 arg0) {
        arg0.field2006 = 0;
        int var2 = arg0.method2338();
        this.field36 = arg0.method2339();
        this.field50 = arg0.method2339();
        int var3 = -1;
        this.field54 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2338();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2338();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2430();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method126(var4[var5] - 512).field1154;
                    if (var8 != 0) {
                        this.field54 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2338();
            if (var11 < 0 || var11 >= Statics.field2674[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field818 = arg0.method2430();
        if (this.field818 == 65535) {
            this.field818 = -1;
        }
        this.field861 = arg0.method2430();
        if (this.field861 == 65535) {
            this.field861 = -1;
        }
        this.field840 = this.field861;
        this.field821 = arg0.method2430();
        if (this.field821 == 65535) {
            this.field821 = -1;
        }
        this.field822 = arg0.method2430();
        if (this.field822 == 65535) {
            this.field822 = -1;
        }
        this.field848 = arg0.method2430();
        if (this.field848 == 65535) {
            this.field848 = -1;
        }
        this.field856 = arg0.method2430();
        if (this.field856 == 65535) {
            this.field856 = -1;
        }
        this.field851 = arg0.method2430();
        if (this.field851 == 65535) {
            this.field851 = -1;
        }
        this.field60 = arg0.method2346();
        if (Statics.field1882 == this) {
            Statics.field2234 = this.field60;
        }
        this.field40 = arg0.method2338();
        this.field41 = arg0.method2430();
        this.field59 = arg0.method2338() == 1;
        if (client.field282 == 0 && client.field518 >= 2) {
            this.field59 = false;
        }
        if (this.field35 == null) {
            this.field35 = new class180();
        }
        this.field35.method3228(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("p.j(I)I")
    public int method21() {
        return this.field35 == null || this.field35.field2935 == -1 ? 1 : class40.method2038(this.field35.field2935).field888;
    }

    @ObfuscatedName("p.p(B)Ldh;")
    public final class106 method14() {
        if (this.field35 == null) {
            return null;
        }
        class43 var1 = this.field844 != -1 && this.field852 == 0 ? class43.method43(this.field844) : null;
        class43 var2 = this.field841 == -1 || this.field53 || this.field841 == this.field818 && var1 != null ? null : class43.method43(this.field841);
        class106 var3 = this.field35.method3234(var1, this.field845, var2, this.field862);
        if (var3 == null) {
            return null;
        }
        var3.method2145();
        this.field817 = var3.field1466;
        if (!this.field53 && this.field849 != -1 && this.field850 != -1) {
            class106 var4 = class44.method3263(this.field849).method859(this.field850);
            if (var4 != null) {
                var4.method2155(0, -this.field860, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (!this.field53 && this.field55 != null) {
            if (client.field336 >= this.field57) {
                this.field55 = null;
            }
            if (client.field336 >= this.field52 && client.field336 < this.field57) {
                class106 var6 = this.field55;
                var6.method2155(this.field45 - this.field824, this.field46 - this.field42, this.field47 - this.field814);
                if (this.field863 == 512) {
                    var6.method2151();
                    var6.method2151();
                    var6.method2151();
                } else if (this.field863 == 1024) {
                    var6.method2151();
                    var6.method2151();
                } else if (this.field863 == 1536) {
                    var6.method2151();
                }
                class106[] var7 = new class106[] { var3, var6 };
                var3 = new class106(var7, 2);
                if (this.field863 == 512) {
                    var6.method2151();
                } else if (this.field863 == 1024) {
                    var6.method2151();
                    var6.method2151();
                } else if (this.field863 == 1536) {
                    var6.method2151();
                    var6.method2151();
                    var6.method2151();
                }
                var6.method2155(this.field824 - this.field45, this.field42 - this.field46, this.field814 - this.field47);
            }
        }
        var3.field1835 = true;
        return var3;
    }

    @ObfuscatedName("p.x(IIBB)V")
    public final void method32(int arg0, int arg1, byte arg2) {
        if (this.field844 != -1 && class43.method43(this.field844).field1002 == 1) {
            this.field844 = -1;
        }
        this.field825 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method16(arg0, arg1);
        } else if (this.field867[0] >= 0 && this.field867[0] < 104 && this.field864[0] >= 0 && this.field864[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field867[0];
                int var6 = this.field864[0];
                int var7 = this.method21();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method21();
                    client.field434.field1890 = arg0;
                    client.field434.field1899 = arg1;
                    client.field434.field1892 = 1;
                    client.field434.field1893 = 1;
                    class11 var9 = client.field434;
                    class11 var10 = var9;
                    class109 var11 = client.field341[this.field56];
                    int[] var12 = client.field498;
                    int[] var13 = client.field561;
                    int var14 = 0;
                    label339: while (true) {
                        if (var14 >= 128) {
                            boolean var16;
                            if (var8 == 1) {
                                var16 = class107.method1026(var5, var6, var9, var11);
                            } else if (var8 == 2) {
                                int var17 = var5;
                                int var18 = var6;
                                byte var19 = 64;
                                byte var20 = 64;
                                int var21 = var5 - var19;
                                int var22 = var6 - var20;
                                class107.field1877[var19][var20] = 99;
                                class107.field1889[var19][var20] = 0;
                                byte var23 = 0;
                                int var24 = 0;
                                class107.field1881[var23] = var5;
                                int var57 = var23 + 1;
                                class107.field1887[var23] = var6;
                                int[][] var25 = var11.field1912;
                                boolean var30;
                                while (true) {
                                    if (var57 == var24) {
                                        Statics.field2909 = var17;
                                        Statics.field1876 = var18;
                                        var30 = false;
                                        break;
                                    }
                                    var17 = class107.field1881[var24];
                                    var18 = class107.field1887[var24];
                                    var24 = var24 + 1 & 0xFFF;
                                    int var26 = var17 - var21;
                                    int var27 = var18 - var22;
                                    int var28 = var17 - var11.field1908;
                                    int var29 = var18 - var11.field1909;
                                    if (var10.method130(2, var17, var18, var11)) {
                                        Statics.field2909 = var17;
                                        Statics.field1876 = var18;
                                        var30 = true;
                                        break;
                                    }
                                    int var31 = class107.field1889[var26][var27] + 1;
                                    if (var26 > 0 && class107.field1877[var26 - 1][var27] == 0 && (var25[var28 - 1][var29] & 0x124010E) == 0 && (var25[var28 - 1][var29 + 1] & 0x1240138) == 0) {
                                        class107.field1881[var57] = var17 - 1;
                                        class107.field1887[var57] = var18;
                                        var57 = var57 + 1 & 0xFFF;
                                        class107.field1877[var26 - 1][var27] = 2;
                                        class107.field1889[var26 - 1][var27] = var31;
                                    }
                                    if (var26 < 126 && class107.field1877[var26 + 1][var27] == 0 && (var25[var28 + 2][var29] & 0x1240183) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E0) == 0) {
                                        class107.field1881[var57] = var17 + 1;
                                        class107.field1887[var57] = var18;
                                        var57 = var57 + 1 & 0xFFF;
                                        class107.field1877[var26 + 1][var27] = 8;
                                        class107.field1889[var26 + 1][var27] = var31;
                                    }
                                    if (var27 > 0 && class107.field1877[var26][var27 - 1] == 0 && (var25[var28][var29 - 1] & 0x124010E) == 0 && (var25[var28 + 1][var29 - 1] & 0x1240183) == 0) {
                                        class107.field1881[var57] = var17;
                                        class107.field1887[var57] = var18 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class107.field1877[var26][var27 - 1] = 1;
                                        class107.field1889[var26][var27 - 1] = var31;
                                    }
                                    if (var27 < 126 && class107.field1877[var26][var27 + 1] == 0 && (var25[var28][var29 + 2] & 0x1240138) == 0 && (var25[var28 + 1][var29 + 2] & 0x12401E0) == 0) {
                                        class107.field1881[var57] = var17;
                                        class107.field1887[var57] = var18 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class107.field1877[var26][var27 + 1] = 4;
                                        class107.field1889[var26][var27 + 1] = var31;
                                    }
                                    if (var26 > 0 && var27 > 0 && class107.field1877[var26 - 1][var27 - 1] == 0 && (var25[var28 - 1][var29] & 0x124013E) == 0 && (var25[var28 - 1][var29 - 1] & 0x124010E) == 0 && (var25[var28][var29 - 1] & 0x124018F) == 0) {
                                        class107.field1881[var57] = var17 - 1;
                                        class107.field1887[var57] = var18 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class107.field1877[var26 - 1][var27 - 1] = 3;
                                        class107.field1889[var26 - 1][var27 - 1] = var31;
                                    }
                                    if (var26 < 126 && var27 > 0 && class107.field1877[var26 + 1][var27 - 1] == 0 && (var25[var28 + 1][var29 - 1] & 0x124018F) == 0 && (var25[var28 + 2][var29 - 1] & 0x1240183) == 0 && (var25[var28 + 2][var29] & 0x12401E3) == 0) {
                                        class107.field1881[var57] = var17 + 1;
                                        class107.field1887[var57] = var18 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class107.field1877[var26 + 1][var27 - 1] = 9;
                                        class107.field1889[var26 + 1][var27 - 1] = var31;
                                    }
                                    if (var26 > 0 && var27 < 126 && class107.field1877[var26 - 1][var27 + 1] == 0 && (var25[var28 - 1][var29 + 1] & 0x124013E) == 0 && (var25[var28 - 1][var29 + 2] & 0x1240138) == 0 && (var25[var28][var29 + 2] & 0x12401F8) == 0) {
                                        class107.field1881[var57] = var17 - 1;
                                        class107.field1887[var57] = var18 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class107.field1877[var26 - 1][var27 + 1] = 6;
                                        class107.field1889[var26 - 1][var27 + 1] = var31;
                                    }
                                    if (var26 < 126 && var27 < 126 && class107.field1877[var26 + 1][var27 + 1] == 0 && (var25[var28 + 1][var29 + 2] & 0x12401F8) == 0 && (var25[var28 + 2][var29 + 2] & 0x12401E0) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E3) == 0) {
                                        class107.field1881[var57] = var17 + 1;
                                        class107.field1887[var57] = var18 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class107.field1877[var26 + 1][var27 + 1] = 12;
                                        class107.field1889[var26 + 1][var27 + 1] = var31;
                                    }
                                }
                                var16 = var30;
                            } else {
                                var16 = class107.method2902(var5, var6, var8, var9, var11);
                            }
                            int var50;
                            label362: {
                                int var32 = var5 - 64;
                                int var33 = var6 - 64;
                                int var34 = Statics.field2909;
                                int var35 = Statics.field1876;
                                if (!var16) {
                                    int var36 = Integer.MAX_VALUE;
                                    int var37 = Integer.MAX_VALUE;
                                    byte var38 = 10;
                                    int var39 = var10.field1890;
                                    int var40 = var10.field1899;
                                    int var41 = var10.field1892;
                                    int var42 = var10.field1893;
                                    for (int var43 = var39 - var38; var43 <= var38 + var39; var43++) {
                                        for (int var44 = var40 - var38; var44 <= var38 + var40; var44++) {
                                            int var45 = var43 - var32;
                                            int var46 = var44 - var33;
                                            if (var45 >= 0 && var46 >= 0 && var45 < 128 && var46 < 128 && class107.field1889[var45][var46] < 100) {
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
                                                if (var49 < var36 || var36 == var49 && class107.field1889[var45][var46] < var37) {
                                                    var36 = var49;
                                                    var37 = class107.field1889[var45][var46];
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
                                    class107.field1881[var51] = var34;
                                    int var58 = var51 + 1;
                                    class107.field1887[var51] = var35;
                                    int var52;
                                    int var53 = var52 = class107.field1877[var34 - var32][var35 - var33];
                                    while (var5 != var34 || var6 != var35) {
                                        if (var52 != var53) {
                                            var52 = var53;
                                            class107.field1881[var58] = var34;
                                            class107.field1887[var58++] = var35;
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
                                        var53 = class107.field1877[var34 - var32][var35 - var33];
                                    }
                                    int var54 = 0;
                                    while (var58-- > 0) {
                                        var12[var54] = class107.field1881[var58];
                                        var13[var54++] = class107.field1887[var58];
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
                                var4.method17(client.field498[var56], client.field561[var56], (byte) 2);
                                var56++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class107.field1877[var14][var15] = 0;
                            class107.field1889[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method17(arg0, arg1, arg2);
        } else {
            this.method16(arg0, arg1);
        }
    }

    @ObfuscatedName("p.d(III)V")
    public void method16(int arg0, int arg1) {
        this.field842 = 0;
        this.field871 = 0;
        this.field870 = 0;
        this.field867[0] = arg0;
        this.field864[0] = arg1;
        int var3 = this.method21();
        this.field824 = this.field867[0] * 128 + var3 * 64;
        this.field814 = this.field864[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("p.u(IIBI)V")
    public final void method17(int arg0, int arg1, byte arg2) {
        if (this.field842 < 9) {
            this.field842++;
        }
        for (int var4 = this.field842; var4 > 0; var4--) {
            this.field867[var4] = this.field867[var4 - 1];
            this.field864[var4] = this.field864[var4 - 1];
            this.field869[var4] = this.field869[var4 - 1];
        }
        this.field867[0] = arg0;
        this.field864[0] = arg1;
        this.field869[0] = arg2;
    }

    @ObfuscatedName("p.o(I)Z")
    public final boolean method18() {
        return this.field35 != null;
    }
}
