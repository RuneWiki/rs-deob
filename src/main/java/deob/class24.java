package deob;

@ObfuscatedName("o")
public final class class24 extends class28 {

    @ObfuscatedName("o.d")
    public String field266;

    @ObfuscatedName("o.c")
    public class169 field237;

    @ObfuscatedName("o.n")
    public int field238 = -1;

    @ObfuscatedName("o.q")
    public int field239 = -1;

    @ObfuscatedName("o.p")
    public String[] field244 = new String[3];

    @ObfuscatedName("o.u")
    public int field241;

    @ObfuscatedName("o.z")
    public int field242;

    @ObfuscatedName("o.l")
    public int field263;

    @ObfuscatedName("o.v")
    public int field260;

    @ObfuscatedName("o.g")
    public int field259;

    @ObfuscatedName("o.w")
    public int field246;

    @ObfuscatedName("o.r")
    public int field240;

    @ObfuscatedName("o.s")
    public int field248;

    @ObfuscatedName("o.k")
    public class83 field249;

    @ObfuscatedName("o.e")
    public int field250;

    @ObfuscatedName("o.j")
    public int field253;

    @ObfuscatedName("o.i")
    public int field252;

    @ObfuscatedName("o.a")
    public int field255;

    @ObfuscatedName("o.x")
    public boolean field254;

    @ObfuscatedName("o.h")
    public int field251;

    @ObfuscatedName("o.b")
    public boolean field264;

    @ObfuscatedName("o.f")
    public int field257;

    @ObfuscatedName("o.o")
    public int field258;

    @ObfuscatedName("o.m")
    public boolean field256;

    @ObfuscatedName("o.y")
    public int field247;

    @ObfuscatedName("o.am")
    public int field261;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field244[var1] = "";
        }
        this.field241 = 0;
        this.field242 = 0;
        this.field260 = 0;
        this.field259 = 0;
        this.field254 = false;
        this.field251 = 0;
        this.field264 = false;
        this.field256 = false;
    }

    @ObfuscatedName("o.d(Ldu;I)V")
    public final void method228(class130 arg0) {
        arg0.field1956 = 0;
        int var2 = arg0.method2379();
        this.field238 = arg0.method2230();
        this.field239 = arg0.method2230();
        int var3 = -1;
        this.field251 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2379();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2379();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2232();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class204.method868(var4[var5] - 512).field2996;
                    if (var8 != 0) {
                        this.field251 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2379();
            if (var11 < 0 || var11 >= Statics.field1762[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field605 = arg0.method2232();
        if (this.field605 == 65535) {
            this.field605 = -1;
        }
        this.field606 = arg0.method2232();
        if (this.field606 == 65535) {
            this.field606 = -1;
        }
        this.field607 = this.field606;
        this.field660 = arg0.method2232();
        if (this.field660 == 65535) {
            this.field660 = -1;
        }
        this.field609 = arg0.method2232();
        if (this.field609 == 65535) {
            this.field609 = -1;
        }
        this.field610 = arg0.method2232();
        if (this.field610 == 65535) {
            this.field610 = -1;
        }
        this.field611 = arg0.method2232();
        if (this.field611 == 65535) {
            this.field611 = -1;
        }
        this.field650 = arg0.method2232();
        if (this.field650 == 65535) {
            this.field650 = -1;
        }
        this.field266 = arg0.method2314();
        if (Statics.field233 == this) {
            Statics.field1649 = this.field266;
        }
        this.field241 = arg0.method2379();
        this.field242 = arg0.method2232();
        this.field264 = arg0.method2379() == 1;
        if (client.field284 == 0 && client.field518 >= 2) {
            this.field264 = false;
        }
        if (this.field237 == null) {
            this.field237 = new class169();
        }
        this.field237.method2946(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("o.c(I)I")
    public int method227() {
        return this.field237 == null || this.field237.field2183 == -1 ? 1 : class205.method3033(this.field237.field2183).field3043;
    }

    @ObfuscatedName("o.n(B)Lcf;")
    public final class83 method230() {
        if (this.field237 == null) {
            return null;
        }
        class207 var1 = this.field627 != -1 && this.field635 == 0 ? class207.method3621(this.field627) : null;
        class207 var2 = this.field625 == -1 || this.field254 || this.field625 == this.field605 && var1 != null ? null : class207.method3621(this.field625);
        class83 var3 = this.field237.method2972(var1, this.field633, var2, this.field621);
        if (var3 == null) {
            return null;
        }
        var3.method1489();
        this.field608 = var3.field1532;
        if (!this.field254 && this.field637 != -1 && this.field638 != -1) {
            class83 var4 = class193.method3249(this.field637).method3265(this.field638);
            if (var4 != null) {
                var4.method1499(0, -this.field623, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field254 && this.field249 != null) {
            if (client.field291 >= this.field259) {
                this.field249 = null;
            }
            if (client.field291 >= this.field260 && client.field291 < this.field259) {
                class83 var6 = this.field249;
                var6.method1499(this.field246 - this.field629, this.field240 - this.field263, this.field248 - this.field601);
                if (this.field651 == 512) {
                    var6.method1513();
                    var6.method1513();
                    var6.method1513();
                } else if (this.field651 == 1024) {
                    var6.method1513();
                    var6.method1513();
                } else if (this.field651 == 1536) {
                    var6.method1513();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field651 == 512) {
                    var6.method1513();
                } else if (this.field651 == 1024) {
                    var6.method1513();
                    var6.method1513();
                } else if (this.field651 == 1536) {
                    var6.method1513();
                    var6.method1513();
                    var6.method1513();
                }
                var6.method1499(this.field629 - this.field246, this.field263 - this.field240, this.field601 - this.field248);
            }
        }
        var3.field1371 = true;
        return var3;
    }

    @ObfuscatedName("o.q(IIBI)V")
    public final void method253(int arg0, int arg1, byte arg2) {
        if (this.field627 != -1 && class207.method3621(this.field627).field3102 == 1) {
            this.field627 = -1;
        }
        this.field628 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method237(arg0, arg1);
        } else if (this.field662[0] >= 0 && this.field662[0] < 104 && this.field656[0] >= 0 && this.field656[0] < 104) {
            if (arg2 == 2) {
                class24 var4 = this;
                int var5 = this.field662[0];
                int var6 = this.field656[0];
                int var7 = this.method227();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method227();
                    client.field566.field1860 = arg0;
                    client.field566.field1863 = arg1;
                    client.field566.field1857 = 1;
                    client.field566.field1855 = 1;
                    class23 var9 = client.field566;
                    class23 var10 = var9;
                    class118 var11 = client.field343[this.field257];
                    int[] var12 = client.field567;
                    int[] var13 = client.field568;
                    int var14 = 0;
                    label469: while (true) {
                        if (var14 >= 128) {
                            boolean var16;
                            if (var8 == 1) {
                                var16 = class119.method735(var5, var6, var9, var11);
                            } else if (var8 == 2) {
                                var16 = class119.method797(var5, var6, var9, var11);
                            } else {
                                int var17 = var5;
                                int var18 = var6;
                                byte var19 = 64;
                                byte var20 = 64;
                                int var21 = var5 - var19;
                                int var22 = var6 - var20;
                                class119.field1846[var19][var20] = 99;
                                class119.field1844[var19][var20] = 0;
                                byte var23 = 0;
                                int var24 = 0;
                                class119.field1847[var23] = var5;
                                int var65 = var23 + 1;
                                class119.field1848[var23] = var6;
                                int[][] var25 = var11.field1838;
                                boolean var30;
                                label455: while (true) {
                                    label453: while (true) {
                                        int var26;
                                        int var27;
                                        int var28;
                                        int var29;
                                        int var31;
                                        do {
                                            do {
                                                do {
                                                    label430: do {
                                                        if (var65 == var24) {
                                                            Statics.field1845 = var17;
                                                            Statics.field1843 = var18;
                                                            var30 = false;
                                                            break label455;
                                                        }
                                                        var17 = class119.field1847[var24];
                                                        var18 = class119.field1848[var24];
                                                        var24 = var24 + 1 & 0xFFF;
                                                        var26 = var17 - var21;
                                                        var27 = var18 - var22;
                                                        var28 = var17 - var11.field1834;
                                                        var29 = var18 - var11.field1840;
                                                        if (var10.method225(var8, var17, var18, var11)) {
                                                            Statics.field1845 = var17;
                                                            Statics.field1843 = var18;
                                                            var30 = true;
                                                            break label455;
                                                        }
                                                        var31 = class119.field1844[var26][var27] + 1;
                                                        if (var26 > 0 && class119.field1846[var26 - 1][var27] == 0 && (var25[var28 - 1][var29] & 0x124010E) == 0 && (var25[var28 - 1][var8 + var29 - 1] & 0x1240138) == 0) {
                                                            int var32 = 1;
                                                            while (true) {
                                                                if (var32 >= var8 - 1) {
                                                                    class119.field1847[var65] = var17 - 1;
                                                                    class119.field1848[var65] = var18;
                                                                    var65 = var65 + 1 & 0xFFF;
                                                                    class119.field1846[var26 - 1][var27] = 2;
                                                                    class119.field1844[var26 - 1][var27] = var31;
                                                                    break;
                                                                }
                                                                if ((var25[var28 - 1][var29 + var32] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var32++;
                                                            }
                                                        }
                                                        if (var26 < 128 - var8 && class119.field1846[var26 + 1][var27] == 0 && (var25[var8 + var28][var29] & 0x1240183) == 0 && (var25[var8 + var28][var8 + var29 - 1] & 0x12401E0) == 0) {
                                                            int var33 = 1;
                                                            while (true) {
                                                                if (var33 >= var8 - 1) {
                                                                    class119.field1847[var65] = var17 + 1;
                                                                    class119.field1848[var65] = var18;
                                                                    var65 = var65 + 1 & 0xFFF;
                                                                    class119.field1846[var26 + 1][var27] = 8;
                                                                    class119.field1844[var26 + 1][var27] = var31;
                                                                    break;
                                                                }
                                                                if ((var25[var8 + var28][var29 + var33] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var33++;
                                                            }
                                                        }
                                                        if (var27 > 0 && class119.field1846[var26][var27 - 1] == 0 && (var25[var28][var29 - 1] & 0x124010E) == 0 && (var25[var8 + var28 - 1][var29 - 1] & 0x1240183) == 0) {
                                                            int var34 = 1;
                                                            while (true) {
                                                                if (var34 >= var8 - 1) {
                                                                    class119.field1847[var65] = var17;
                                                                    class119.field1848[var65] = var18 - 1;
                                                                    var65 = var65 + 1 & 0xFFF;
                                                                    class119.field1846[var26][var27 - 1] = 1;
                                                                    class119.field1844[var26][var27 - 1] = var31;
                                                                    break;
                                                                }
                                                                if ((var25[var28 + var34][var29 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var34++;
                                                            }
                                                        }
                                                        if (var27 < 128 - var8 && class119.field1846[var26][var27 + 1] == 0 && (var25[var28][var8 + var29] & 0x1240138) == 0 && (var25[var8 + var28 - 1][var8 + var29] & 0x12401E0) == 0) {
                                                            int var35 = 1;
                                                            while (true) {
                                                                if (var35 >= var8 - 1) {
                                                                    class119.field1847[var65] = var17;
                                                                    class119.field1848[var65] = var18 + 1;
                                                                    var65 = var65 + 1 & 0xFFF;
                                                                    class119.field1846[var26][var27 + 1] = 4;
                                                                    class119.field1844[var26][var27 + 1] = var31;
                                                                    break;
                                                                }
                                                                if ((var25[var28 + var35][var8 + var29] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var35++;
                                                            }
                                                        }
                                                        if (var26 > 0 && var27 > 0 && class119.field1846[var26 - 1][var27 - 1] == 0 && (var25[var28 - 1][var29 - 1] & 0x124010E) == 0) {
                                                            int var36 = 1;
                                                            while (true) {
                                                                if (var36 >= var8) {
                                                                    class119.field1847[var65] = var17 - 1;
                                                                    class119.field1848[var65] = var18 - 1;
                                                                    var65 = var65 + 1 & 0xFFF;
                                                                    class119.field1846[var26 - 1][var27 - 1] = 3;
                                                                    class119.field1844[var26 - 1][var27 - 1] = var31;
                                                                    break;
                                                                }
                                                                if ((var25[var28 - 1][var29 - 1 + var36] & 0x124013E) != 0 || (var25[var28 - 1 + var36][var29 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var36++;
                                                            }
                                                        }
                                                        if (var26 < 128 - var8 && var27 > 0 && class119.field1846[var26 + 1][var27 - 1] == 0 && (var25[var8 + var28][var29 - 1] & 0x1240183) == 0) {
                                                            int var37 = 1;
                                                            while (true) {
                                                                if (var37 >= var8) {
                                                                    class119.field1847[var65] = var17 + 1;
                                                                    class119.field1848[var65] = var18 - 1;
                                                                    var65 = var65 + 1 & 0xFFF;
                                                                    class119.field1846[var26 + 1][var27 - 1] = 9;
                                                                    class119.field1844[var26 + 1][var27 - 1] = var31;
                                                                    break;
                                                                }
                                                                if ((var25[var8 + var28][var29 - 1 + var37] & 0x12401E3) != 0 || (var25[var28 + var37][var29 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var37++;
                                                            }
                                                        }
                                                        if (var26 > 0 && var27 < 128 - var8 && class119.field1846[var26 - 1][var27 + 1] == 0 && (var25[var28 - 1][var8 + var29] & 0x1240138) == 0) {
                                                            for (int var38 = 1; var38 < var8; var38++) {
                                                                if ((var25[var28 - 1][var29 + var38] & 0x124013E) != 0 || (var25[var28 - 1 + var38][var8 + var29] & 0x12401F8) != 0) {
                                                                    continue label430;
                                                                }
                                                            }
                                                            class119.field1847[var65] = var17 - 1;
                                                            class119.field1848[var65] = var18 + 1;
                                                            var65 = var65 + 1 & 0xFFF;
                                                            class119.field1846[var26 - 1][var27 + 1] = 6;
                                                            class119.field1844[var26 - 1][var27 + 1] = var31;
                                                        }
                                                    } while (var26 >= 128 - var8);
                                                } while (var27 >= 128 - var8);
                                            } while (class119.field1846[var26 + 1][var27 + 1] != 0);
                                        } while ((var25[var8 + var28][var8 + var29] & 0x12401E0) != 0);
                                        for (int var39 = 1; var39 < var8; var39++) {
                                            if ((var25[var28 + var39][var8 + var29] & 0x12401F8) != 0 || (var25[var8 + var28][var29 + var39] & 0x12401E3) != 0) {
                                                continue label453;
                                            }
                                        }
                                        class119.field1847[var65] = var17 + 1;
                                        class119.field1848[var65] = var18 + 1;
                                        var65 = var65 + 1 & 0xFFF;
                                        class119.field1846[var26 + 1][var27 + 1] = 12;
                                        class119.field1844[var26 + 1][var27 + 1] = var31;
                                    }
                                }
                                var16 = var30;
                            }
                            int var58;
                            label508: {
                                int var40 = var5 - 64;
                                int var41 = var6 - 64;
                                int var42 = Statics.field1845;
                                int var43 = Statics.field1843;
                                if (!var16) {
                                    int var44 = Integer.MAX_VALUE;
                                    int var45 = Integer.MAX_VALUE;
                                    byte var46 = 10;
                                    int var47 = var10.field1860;
                                    int var48 = var10.field1863;
                                    int var49 = var10.field1857;
                                    int var50 = var10.field1855;
                                    for (int var51 = var47 - var46; var51 <= var46 + var47; var51++) {
                                        for (int var52 = var48 - var46; var52 <= var46 + var48; var52++) {
                                            int var53 = var51 - var40;
                                            int var54 = var52 - var41;
                                            if (var53 >= 0 && var54 >= 0 && var53 < 128 && var54 < 128 && class119.field1844[var53][var54] < 100) {
                                                int var55 = 0;
                                                if (var51 < var47) {
                                                    var55 = var47 - var51;
                                                } else if (var51 > var47 + var49 - 1) {
                                                    var55 = var51 - (var47 + var49 - 1);
                                                }
                                                int var56 = 0;
                                                if (var52 < var48) {
                                                    var56 = var48 - var52;
                                                } else if (var52 > var48 + var50 - 1) {
                                                    var56 = var52 - (var48 + var50 - 1);
                                                }
                                                int var57 = var55 * var55 + var56 * var56;
                                                if (var57 < var44 || var44 == var57 && class119.field1844[var53][var54] < var45) {
                                                    var44 = var57;
                                                    var45 = class119.field1844[var53][var54];
                                                    var42 = var51;
                                                    var43 = var52;
                                                }
                                            }
                                        }
                                    }
                                    if (var44 == Integer.MAX_VALUE) {
                                        var58 = -1;
                                        break label508;
                                    }
                                }
                                if (var5 == var42 && var6 == var43) {
                                    var58 = 0;
                                } else {
                                    byte var59 = 0;
                                    class119.field1847[var59] = var42;
                                    int var66 = var59 + 1;
                                    class119.field1848[var59] = var43;
                                    int var60;
                                    int var61 = var60 = class119.field1846[var42 - var40][var43 - var41];
                                    while (var5 != var42 || var6 != var43) {
                                        if (var60 != var61) {
                                            var60 = var61;
                                            class119.field1847[var66] = var42;
                                            class119.field1848[var66++] = var43;
                                        }
                                        if ((var61 & 0x2) != 0) {
                                            var42++;
                                        } else if ((var61 & 0x8) != 0) {
                                            var42--;
                                        }
                                        if ((var61 & 0x1) != 0) {
                                            var43++;
                                        } else if ((var61 & 0x4) != 0) {
                                            var43--;
                                        }
                                        var61 = class119.field1846[var42 - var40][var43 - var41];
                                    }
                                    int var62 = 0;
                                    while (var66-- > 0) {
                                        var12[var62] = class119.field1847[var66];
                                        var13[var62++] = class119.field1848[var66];
                                        if (var62 >= var12.length) {
                                            break;
                                        }
                                    }
                                    var58 = var62;
                                }
                            }
                            int var63 = var58;
                            if (var58 < 1) {
                                break;
                            }
                            int var64 = 0;
                            while (true) {
                                if (var64 >= var63 - 1) {
                                    break label469;
                                }
                                var4.method232(client.field567[var64], client.field568[var64], (byte) 2);
                                var64++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class119.field1846[var14][var15] = 0;
                            class119.field1844[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method232(arg0, arg1, arg2);
        } else {
            this.method237(arg0, arg1);
        }
    }

    @ObfuscatedName("o.t(III)V")
    public void method237(int arg0, int arg1) {
        this.field654 = 0;
        this.field659 = 0;
        this.field658 = 0;
        this.field662[0] = arg0;
        this.field656[0] = arg1;
        int var3 = this.method227();
        this.field629 = this.field662[0] * 128 + var3 * 64;
        this.field601 = this.field656[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("o.p(IIBI)V")
    public final void method232(int arg0, int arg1, byte arg2) {
        if (this.field654 < 9) {
            this.field654++;
        }
        for (int var4 = this.field654; var4 > 0; var4--) {
            this.field662[var4] = this.field662[var4 - 1];
            this.field656[var4] = this.field656[var4 - 1];
            this.field619[var4] = this.field619[var4 - 1];
        }
        this.field662[0] = arg0;
        this.field656[0] = arg1;
        this.field619[0] = arg2;
    }

    @ObfuscatedName("o.u(I)Z")
    public final boolean method233() {
        return this.field237 != null;
    }
}
