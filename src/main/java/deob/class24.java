package deob;

@ObfuscatedName("r")
public final class class24 extends class28 {

    @ObfuscatedName("r.o")
    public String field264;

    @ObfuscatedName("r.m")
    public class167 field254;

    @ObfuscatedName("r.b")
    public int field250 = -1;

    @ObfuscatedName("r.g")
    public int field251 = -1;

    @ObfuscatedName("r.v")
    public String[] field249 = new String[3];

    @ObfuscatedName("r.l")
    public int field253;

    @ObfuscatedName("r.c")
    public int field255;

    @ObfuscatedName("r.u")
    public int field256;

    @ObfuscatedName("r.k")
    public int field270;

    @ObfuscatedName("r.z")
    public int field258;

    @ObfuscatedName("r.y")
    public int field259;

    @ObfuscatedName("r.j")
    public int field260;

    @ObfuscatedName("r.f")
    public int field261;

    @ObfuscatedName("r.p")
    public class83 field262;

    @ObfuscatedName("r.i")
    public int field263;

    @ObfuscatedName("r.s")
    public int field248;

    @ObfuscatedName("r.x")
    public int field265;

    @ObfuscatedName("r.d")
    public int field266;

    @ObfuscatedName("r.w")
    public boolean field267;

    @ObfuscatedName("r.n")
    public int field268;

    @ObfuscatedName("r.q")
    public boolean field269;

    @ObfuscatedName("r.t")
    public int field257;

    @ObfuscatedName("r.r")
    public int field274;

    @ObfuscatedName("r.a")
    public boolean field272;

    @ObfuscatedName("r.e")
    public int field273;

    @ObfuscatedName("r.am")
    public int field252;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field249[var1] = "";
        }
        this.field253 = 0;
        this.field255 = 0;
        this.field270 = 0;
        this.field258 = 0;
        this.field267 = false;
        this.field268 = 0;
        this.field269 = false;
        this.field272 = false;
    }

    @ObfuscatedName("r.o(Lez;I)V")
    public final void method211(class154 arg0) {
        arg0.field2105 = 0;
        int var2 = arg0.method2552();
        this.field250 = arg0.method2553();
        this.field251 = arg0.method2553();
        int var3 = -1;
        this.field268 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2552();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2552();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2554();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class199.method2268(var4[var5] - 512).field2987;
                    if (var8 != 0) {
                        this.field268 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2552();
            if (var11 < 0 || var11 >= Statics.field1868[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field644 = arg0.method2554();
        if (this.field644 == 65535) {
            this.field644 = -1;
        }
        this.field647 = arg0.method2554();
        if (this.field647 == 65535) {
            this.field647 = -1;
        }
        this.field611 = this.field647;
        this.field625 = arg0.method2554();
        if (this.field625 == 65535) {
            this.field625 = -1;
        }
        this.field641 = arg0.method2554();
        if (this.field641 == 65535) {
            this.field641 = -1;
        }
        this.field616 = arg0.method2554();
        if (this.field616 == 65535) {
            this.field616 = -1;
        }
        this.field649 = arg0.method2554();
        if (this.field649 == 65535) {
            this.field649 = -1;
        }
        this.field612 = arg0.method2554();
        if (this.field612 == 65535) {
            this.field612 = -1;
        }
        this.field264 = arg0.method2606();
        if (Statics.field43 == this) {
            Statics.field1650 = this.field264;
        }
        this.field253 = arg0.method2552();
        this.field255 = arg0.method2554();
        this.field269 = arg0.method2552() == 1;
        if (client.field429 == 0 && client.field452 >= 2) {
            this.field269 = false;
        }
        if (this.field254 == null) {
            this.field254 = new class167();
        }
        this.field254.method2875(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("r.m(I)I")
    public int method228() {
        return this.field254 == null || this.field254.field2182 == -1 ? 1 : class200.method635(this.field254.field2182).field3000;
    }

    @ObfuscatedName("r.b(B)Lcy;")
    public final class83 method212() {
        if (this.field254 == null) {
            return null;
        }
        class202 var1 = this.field637 != -1 && this.field646 == 0 ? class202.method658(this.field637) : null;
        class202 var2 = this.field634 == -1 || this.field267 || this.field644 == this.field634 && var1 != null ? null : class202.method658(this.field634);
        class83 var3 = this.field254.method2882(var1, this.field638, var2, this.field631);
        if (var3 == null) {
            return null;
        }
        var3.method1445();
        this.field635 = var3.field1534;
        if (!this.field267 && this.field642 != -1 && this.field643 != -1) {
            class83 var4 = class191.method3446(this.field642).method3188(this.field643);
            if (var4 != null) {
                var4.method1460(0, -this.field655, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field267 && this.field262 != null) {
            if (client.field299 >= this.field258) {
                this.field262 = null;
            }
            if (client.field299 >= this.field270 && client.field299 < this.field258) {
                class83 var6 = this.field262;
                var6.method1460(this.field259 - this.field608, this.field260 - this.field256, this.field261 - this.field605);
                if (this.field656 == 512) {
                    var6.method1456();
                    var6.method1456();
                    var6.method1456();
                } else if (this.field656 == 1024) {
                    var6.method1456();
                    var6.method1456();
                } else if (this.field656 == 1536) {
                    var6.method1456();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field656 == 512) {
                    var6.method1456();
                } else if (this.field656 == 1024) {
                    var6.method1456();
                    var6.method1456();
                } else if (this.field656 == 1536) {
                    var6.method1456();
                    var6.method1456();
                    var6.method1456();
                }
                var6.method1460(this.field608 - this.field259, this.field256 - this.field260, this.field605 - this.field261);
            }
        }
        var3.field1358 = true;
        return var3;
    }

    @ObfuscatedName("r.g(IIBI)V")
    public final void method213(int arg0, int arg1, byte arg2) {
        if (this.field637 != -1 && class202.method658(this.field637).field3063 == 1) {
            this.field637 = -1;
        }
        this.field615 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method214(arg0, arg1);
        } else if (this.field660[0] >= 0 && this.field660[0] < 104 && this.field661[0] >= 0 && this.field661[0] < 104) {
            if (arg2 == 2) {
                class24 var4 = this;
                int var5 = this.field660[0];
                int var6 = this.field661[0];
                int var7 = this.method228();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method228();
                    class120 var9 = client.method674(arg0, arg1);
                    class118 var10 = client.field348[this.field257];
                    int[] var11 = client.field565;
                    int[] var12 = client.field566;
                    int var13 = 0;
                    label303: while (true) {
                        if (var13 >= 128) {
                            boolean var30;
                            if (var8 == 1) {
                                int var15 = var5;
                                int var16 = var6;
                                byte var17 = 64;
                                byte var18 = 64;
                                int var19 = var5 - var17;
                                int var20 = var6 - var18;
                                class119.field1856[var17][var18] = 99;
                                class119.field1857[var17][var18] = 0;
                                byte var21 = 0;
                                int var22 = 0;
                                class119.field1854[var21] = var5;
                                int var56 = var21 + 1;
                                class119.field1860[var21] = var6;
                                int[][] var23 = var10.field1851;
                                boolean var28;
                                while (true) {
                                    if (var56 == var22) {
                                        Statics.field1864 = var15;
                                        Statics.field2198 = var16;
                                        var28 = false;
                                        break;
                                    }
                                    var15 = class119.field1854[var22];
                                    var16 = class119.field1860[var22];
                                    var22 = var22 + 1 & 0xFFF;
                                    int var24 = var15 - var19;
                                    int var25 = var16 - var20;
                                    int var26 = var15 - var10.field1839;
                                    int var27 = var16 - var10.field1850;
                                    if (var9.method205(1, var15, var16, var10)) {
                                        Statics.field1864 = var15;
                                        Statics.field2198 = var16;
                                        var28 = true;
                                        break;
                                    }
                                    int var29 = class119.field1857[var24][var25] + 1;
                                    if (var24 > 0 && class119.field1856[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0) {
                                        class119.field1854[var56] = var15 - 1;
                                        class119.field1860[var56] = var16;
                                        var56 = var56 + 1 & 0xFFF;
                                        class119.field1856[var24 - 1][var25] = 2;
                                        class119.field1857[var24 - 1][var25] = var29;
                                    }
                                    if (var24 < 127 && class119.field1856[var24 + 1][var25] == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0) {
                                        class119.field1854[var56] = var15 + 1;
                                        class119.field1860[var56] = var16;
                                        var56 = var56 + 1 & 0xFFF;
                                        class119.field1856[var24 + 1][var25] = 8;
                                        class119.field1857[var24 + 1][var25] = var29;
                                    }
                                    if (var25 > 0 && class119.field1856[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                                        class119.field1854[var56] = var15;
                                        class119.field1860[var56] = var16 - 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class119.field1856[var24][var25 - 1] = 1;
                                        class119.field1857[var24][var25 - 1] = var29;
                                    }
                                    if (var25 < 127 && class119.field1856[var24][var25 + 1] == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                                        class119.field1854[var56] = var15;
                                        class119.field1860[var56] = var16 + 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class119.field1856[var24][var25 + 1] = 4;
                                        class119.field1857[var24][var25 + 1] = var29;
                                    }
                                    if (var24 > 0 && var25 > 0 && class119.field1856[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                                        class119.field1854[var56] = var15 - 1;
                                        class119.field1860[var56] = var16 - 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class119.field1856[var24 - 1][var25 - 1] = 3;
                                        class119.field1857[var24 - 1][var25 - 1] = var29;
                                    }
                                    if (var24 < 127 && var25 > 0 && class119.field1856[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                                        class119.field1854[var56] = var15 + 1;
                                        class119.field1860[var56] = var16 - 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class119.field1856[var24 + 1][var25 - 1] = 9;
                                        class119.field1857[var24 + 1][var25 - 1] = var29;
                                    }
                                    if (var24 > 0 && var25 < 127 && class119.field1856[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                                        class119.field1854[var56] = var15 - 1;
                                        class119.field1860[var56] = var16 + 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class119.field1856[var24 - 1][var25 + 1] = 6;
                                        class119.field1857[var24 - 1][var25 + 1] = var29;
                                    }
                                    if (var24 < 127 && var25 < 127 && class119.field1856[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 1] & 0x12401E0) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                                        class119.field1854[var56] = var15 + 1;
                                        class119.field1860[var56] = var16 + 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class119.field1856[var24 + 1][var25 + 1] = 12;
                                        class119.field1857[var24 + 1][var25 + 1] = var29;
                                    }
                                }
                                var30 = var28;
                            } else if (var8 == 2) {
                                var30 = class119.method765(var5, var6, var9, var10);
                            } else {
                                var30 = class119.method1087(var5, var6, var8, var9, var10);
                            }
                            int var49;
                            label326: {
                                int var31 = var5 - 64;
                                int var32 = var6 - 64;
                                int var33 = Statics.field1864;
                                int var34 = Statics.field2198;
                                if (!var30) {
                                    int var35 = Integer.MAX_VALUE;
                                    int var36 = Integer.MAX_VALUE;
                                    byte var37 = 10;
                                    int var38 = var9.field1872;
                                    int var39 = var9.field1866;
                                    int var40 = var9.field1867;
                                    int var41 = var9.field1871;
                                    for (int var42 = var38 - var37; var42 <= var37 + var38; var42++) {
                                        for (int var43 = var39 - var37; var43 <= var37 + var39; var43++) {
                                            int var44 = var42 - var31;
                                            int var45 = var43 - var32;
                                            if (var44 >= 0 && var45 >= 0 && var44 < 128 && var45 < 128 && class119.field1857[var44][var45] < 100) {
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
                                                if (var48 < var35 || var35 == var48 && class119.field1857[var44][var45] < var36) {
                                                    var35 = var48;
                                                    var36 = class119.field1857[var44][var45];
                                                    var33 = var42;
                                                    var34 = var43;
                                                }
                                            }
                                        }
                                    }
                                    if (var35 == Integer.MAX_VALUE) {
                                        var49 = -1;
                                        break label326;
                                    }
                                }
                                if (var5 == var33 && var6 == var34) {
                                    var49 = 0;
                                } else {
                                    byte var50 = 0;
                                    class119.field1854[var50] = var33;
                                    int var57 = var50 + 1;
                                    class119.field1860[var50] = var34;
                                    int var51;
                                    int var52 = var51 = class119.field1856[var33 - var31][var34 - var32];
                                    while (var5 != var33 || var6 != var34) {
                                        if (var51 != var52) {
                                            var51 = var52;
                                            class119.field1854[var57] = var33;
                                            class119.field1860[var57++] = var34;
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
                                        var52 = class119.field1856[var33 - var31][var34 - var32];
                                    }
                                    int var53 = 0;
                                    while (var57-- > 0) {
                                        var11[var53] = class119.field1854[var57];
                                        var12[var53++] = class119.field1860[var57];
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
                                    break label303;
                                }
                                var4.method223(client.field565[var55], client.field566[var55], (byte) 2);
                                var55++;
                            }
                        }
                        for (int var14 = 0; var14 < 128; var14++) {
                            class119.field1856[var13][var14] = 0;
                            class119.field1857[var13][var14] = 99999999;
                        }
                        var13++;
                    }
                }
            }
            this.method223(arg0, arg1, arg2);
        } else {
            this.method214(arg0, arg1);
        }
    }

    @ObfuscatedName("r.l(III)V")
    public void method214(int arg0, int arg1) {
        this.field657 = 0;
        this.field664 = 0;
        this.field663 = 0;
        this.field660[0] = arg0;
        this.field661[0] = arg1;
        int var3 = this.method228();
        this.field608 = this.field660[0] * 128 + var3 * 64;
        this.field605 = this.field661[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("r.c(IIBS)V")
    public final void method223(int arg0, int arg1, byte arg2) {
        if (this.field657 < 9) {
            this.field657++;
        }
        for (int var4 = this.field657; var4 > 0; var4--) {
            this.field660[var4] = this.field660[var4 - 1];
            this.field661[var4] = this.field661[var4 - 1];
            this.field662[var4] = this.field662[var4 - 1];
        }
        this.field660[0] = arg0;
        this.field661[0] = arg1;
        this.field662[0] = arg2;
    }

    @ObfuscatedName("r.u(I)Z")
    public final boolean method216() {
        return this.field254 != null;
    }
}
