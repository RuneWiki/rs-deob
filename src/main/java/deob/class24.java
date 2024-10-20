package deob;

@ObfuscatedName("t")
public final class class24 extends class28 {

    @ObfuscatedName("t.p")
    public String field264;

    @ObfuscatedName("t.g")
    public class167 field240;

    @ObfuscatedName("t.x")
    public int field241 = -1;

    @ObfuscatedName("t.q")
    public int field242 = -1;

    @ObfuscatedName("t.k")
    public String[] field243 = new String[3];

    @ObfuscatedName("t.j")
    public int field244;

    @ObfuscatedName("t.s")
    public int field245;

    @ObfuscatedName("t.o")
    public int field239;

    @ObfuscatedName("t.a")
    public int field255;

    @ObfuscatedName("t.c")
    public int field248;

    @ObfuscatedName("t.m")
    public int field249;

    @ObfuscatedName("t.h")
    public int field262;

    @ObfuscatedName("t.r")
    public int field251;

    @ObfuscatedName("t.u")
    public class83 field252;

    @ObfuscatedName("t.i")
    public int field253;

    @ObfuscatedName("t.z")
    public int field259;

    @ObfuscatedName("t.n")
    public int field265;

    @ObfuscatedName("t.w")
    public int field256;

    @ObfuscatedName("t.y")
    public boolean field257;

    @ObfuscatedName("t.v")
    public int field258;

    @ObfuscatedName("t.f")
    public boolean field267;

    @ObfuscatedName("t.l")
    public int field260;

    @ObfuscatedName("t.t")
    public int field261;

    @ObfuscatedName("t.b")
    public boolean field263;

    @ObfuscatedName("t.e")
    public int field246;

    @ObfuscatedName("t.ai")
    public int field266;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field243[var1] = "";
        }
        this.field244 = 0;
        this.field245 = 0;
        this.field255 = 0;
        this.field248 = 0;
        this.field257 = false;
        this.field258 = 0;
        this.field267 = false;
        this.field263 = false;
    }

    @ObfuscatedName("t.p(Lev;I)V")
    public final void method221(class154 arg0) {
        arg0.field2098 = 0;
        int var2 = arg0.method2593();
        this.field241 = arg0.method2631();
        this.field242 = arg0.method2631();
        int var3 = -1;
        this.field258 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2593();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2593();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2595();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class199.method713(var4[var5] - 512).field2947;
                    if (var8 != 0) {
                        this.field258 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2593();
            if (var11 < 0 || var11 >= Statics.field2172[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field598 = arg0.method2595();
        if (this.field598 == 65535) {
            this.field598 = -1;
        }
        this.field599 = arg0.method2595();
        if (this.field599 == 65535) {
            this.field599 = -1;
        }
        this.field600 = this.field599;
        this.field601 = arg0.method2595();
        if (this.field601 == 65535) {
            this.field601 = -1;
        }
        this.field602 = arg0.method2595();
        if (this.field602 == 65535) {
            this.field602 = -1;
        }
        this.field603 = arg0.method2595();
        if (this.field603 == 65535) {
            this.field603 = -1;
        }
        this.field604 = arg0.method2595();
        if (this.field604 == 65535) {
            this.field604 = -1;
        }
        this.field605 = arg0.method2595();
        if (this.field605 == 65535) {
            this.field605 = -1;
        }
        this.field264 = arg0.method2625();
        if (Statics.field169 == this) {
            Statics.field1654 = this.field264;
        }
        this.field244 = arg0.method2593();
        this.field245 = arg0.method2595();
        this.field267 = arg0.method2593() == 1;
        if (client.field425 == 0 && client.field328 >= 2) {
            this.field267 = false;
        }
        if (this.field240 == null) {
            this.field240 = new class167();
        }
        this.field240.method2923(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("t.g(I)I")
    public int method222() {
        return this.field240 == null || this.field240.field2175 == -1 ? 1 : class200.method1450(this.field240.field2175).field3000;
    }

    @ObfuscatedName("t.x(I)Lcw;")
    public final class83 method223() {
        if (this.field240 == null) {
            return null;
        }
        class202 var1 = this.field625 != -1 && this.field633 == 0 ? class202.method2533(this.field625) : null;
        class202 var2 = this.field618 == -1 || this.field257 || this.field618 == this.field598 && var1 != null ? null : class202.method2533(this.field618);
        class83 var3 = this.field240.method2893(var1, this.field615, var2, this.field623);
        if (var3 == null) {
            return null;
        }
        var3.method1504();
        this.field643 = var3.field1544;
        if (!this.field257 && this.field629 != -1 && this.field631 != -1) {
            class83 var4 = class191.method1354(this.field629).method3209(this.field631);
            if (var4 != null) {
                var4.method1492(0, -this.field634, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field257 && this.field252 != null) {
            if (client.field289 >= this.field248) {
                this.field252 = null;
            }
            if (client.field289 >= this.field255 && client.field289 < this.field248) {
                class83 var6 = this.field252;
                var6.method1492(this.field249 - this.field622, this.field262 - this.field239, this.field251 - this.field639);
                if (this.field644 == 512) {
                    var6.method1470();
                    var6.method1470();
                    var6.method1470();
                } else if (this.field644 == 1024) {
                    var6.method1470();
                    var6.method1470();
                } else if (this.field644 == 1536) {
                    var6.method1470();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field644 == 512) {
                    var6.method1470();
                } else if (this.field644 == 1024) {
                    var6.method1470();
                    var6.method1470();
                } else if (this.field644 == 1536) {
                    var6.method1470();
                    var6.method1470();
                    var6.method1470();
                }
                var6.method1492(this.field622 - this.field249, this.field239 - this.field262, this.field639 - this.field251);
            }
        }
        var3.field1381 = true;
        return var3;
    }

    @ObfuscatedName("t.q(IIBI)V")
    public final void method248(int arg0, int arg1, byte arg2) {
        if (this.field625 != -1 && class202.method2533(this.field625).field3062 == 1) {
            this.field625 = -1;
        }
        this.field621 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method225(arg0, arg1);
        } else if (this.field636[0] >= 0 && this.field636[0] < 104 && this.field630[0] >= 0 && this.field630[0] < 104) {
            if (arg2 == 2) {
                class24 var4 = this;
                int var5 = this.field636[0];
                int var6 = this.field630[0];
                int var7 = this.method222();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method222();
                    client.field557.field1859 = arg0;
                    client.field557.field1857 = arg1;
                    client.field557.field1858 = 1;
                    client.field557.field1861 = 1;
                    class23 var9 = client.field557;
                    class23 var10 = var9;
                    class118 var11 = client.field339[this.field260];
                    int[] var12 = client.field558;
                    int[] var13 = client.field559;
                    int var14 = 0;
                    label339: while (true) {
                        if (var14 >= 128) {
                            boolean var16;
                            if (var8 == 1) {
                                var16 = class119.method3180(var5, var6, var9, var11);
                            } else if (var8 == 2) {
                                int var17 = var5;
                                int var18 = var6;
                                byte var19 = 64;
                                byte var20 = 64;
                                int var21 = var5 - var19;
                                int var22 = var6 - var20;
                                class119.field1848[var19][var20] = 99;
                                class119.field1849[var19][var20] = 0;
                                byte var23 = 0;
                                int var24 = 0;
                                class119.field1850[var23] = var5;
                                int var57 = var23 + 1;
                                class119.field1851[var23] = var6;
                                int[][] var25 = var11.field1840;
                                boolean var30;
                                while (true) {
                                    if (var57 == var24) {
                                        Statics.field2040 = var17;
                                        Statics.field209 = var18;
                                        var30 = false;
                                        break;
                                    }
                                    var17 = class119.field1850[var24];
                                    var18 = class119.field1851[var24];
                                    var24 = var24 + 1 & 0xFFF;
                                    int var26 = var17 - var21;
                                    int var27 = var18 - var22;
                                    int var28 = var17 - var11.field1830;
                                    int var29 = var18 - var11.field1827;
                                    if (var10.method209(2, var17, var18, var11)) {
                                        Statics.field2040 = var17;
                                        Statics.field209 = var18;
                                        var30 = true;
                                        break;
                                    }
                                    int var31 = class119.field1849[var26][var27] + 1;
                                    if (var26 > 0 && class119.field1848[var26 - 1][var27] == 0 && (var25[var28 - 1][var29] & 0x124010E) == 0 && (var25[var28 - 1][var29 + 1] & 0x1240138) == 0) {
                                        class119.field1850[var57] = var17 - 1;
                                        class119.field1851[var57] = var18;
                                        var57 = var57 + 1 & 0xFFF;
                                        class119.field1848[var26 - 1][var27] = 2;
                                        class119.field1849[var26 - 1][var27] = var31;
                                    }
                                    if (var26 < 126 && class119.field1848[var26 + 1][var27] == 0 && (var25[var28 + 2][var29] & 0x1240183) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E0) == 0) {
                                        class119.field1850[var57] = var17 + 1;
                                        class119.field1851[var57] = var18;
                                        var57 = var57 + 1 & 0xFFF;
                                        class119.field1848[var26 + 1][var27] = 8;
                                        class119.field1849[var26 + 1][var27] = var31;
                                    }
                                    if (var27 > 0 && class119.field1848[var26][var27 - 1] == 0 && (var25[var28][var29 - 1] & 0x124010E) == 0 && (var25[var28 + 1][var29 - 1] & 0x1240183) == 0) {
                                        class119.field1850[var57] = var17;
                                        class119.field1851[var57] = var18 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class119.field1848[var26][var27 - 1] = 1;
                                        class119.field1849[var26][var27 - 1] = var31;
                                    }
                                    if (var27 < 126 && class119.field1848[var26][var27 + 1] == 0 && (var25[var28][var29 + 2] & 0x1240138) == 0 && (var25[var28 + 1][var29 + 2] & 0x12401E0) == 0) {
                                        class119.field1850[var57] = var17;
                                        class119.field1851[var57] = var18 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class119.field1848[var26][var27 + 1] = 4;
                                        class119.field1849[var26][var27 + 1] = var31;
                                    }
                                    if (var26 > 0 && var27 > 0 && class119.field1848[var26 - 1][var27 - 1] == 0 && (var25[var28 - 1][var29] & 0x124013E) == 0 && (var25[var28 - 1][var29 - 1] & 0x124010E) == 0 && (var25[var28][var29 - 1] & 0x124018F) == 0) {
                                        class119.field1850[var57] = var17 - 1;
                                        class119.field1851[var57] = var18 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class119.field1848[var26 - 1][var27 - 1] = 3;
                                        class119.field1849[var26 - 1][var27 - 1] = var31;
                                    }
                                    if (var26 < 126 && var27 > 0 && class119.field1848[var26 + 1][var27 - 1] == 0 && (var25[var28 + 1][var29 - 1] & 0x124018F) == 0 && (var25[var28 + 2][var29 - 1] & 0x1240183) == 0 && (var25[var28 + 2][var29] & 0x12401E3) == 0) {
                                        class119.field1850[var57] = var17 + 1;
                                        class119.field1851[var57] = var18 - 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class119.field1848[var26 + 1][var27 - 1] = 9;
                                        class119.field1849[var26 + 1][var27 - 1] = var31;
                                    }
                                    if (var26 > 0 && var27 < 126 && class119.field1848[var26 - 1][var27 + 1] == 0 && (var25[var28 - 1][var29 + 1] & 0x124013E) == 0 && (var25[var28 - 1][var29 + 2] & 0x1240138) == 0 && (var25[var28][var29 + 2] & 0x12401F8) == 0) {
                                        class119.field1850[var57] = var17 - 1;
                                        class119.field1851[var57] = var18 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class119.field1848[var26 - 1][var27 + 1] = 6;
                                        class119.field1849[var26 - 1][var27 + 1] = var31;
                                    }
                                    if (var26 < 126 && var27 < 126 && class119.field1848[var26 + 1][var27 + 1] == 0 && (var25[var28 + 1][var29 + 2] & 0x12401F8) == 0 && (var25[var28 + 2][var29 + 2] & 0x12401E0) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E3) == 0) {
                                        class119.field1850[var57] = var17 + 1;
                                        class119.field1851[var57] = var18 + 1;
                                        var57 = var57 + 1 & 0xFFF;
                                        class119.field1848[var26 + 1][var27 + 1] = 12;
                                        class119.field1849[var26 + 1][var27 + 1] = var31;
                                    }
                                }
                                var16 = var30;
                            } else {
                                var16 = class119.method1327(var5, var6, var8, var9, var11);
                            }
                            int var50;
                            label362: {
                                int var32 = var5 - 64;
                                int var33 = var6 - 64;
                                int var34 = Statics.field2040;
                                int var35 = Statics.field209;
                                if (!var16) {
                                    int var36 = Integer.MAX_VALUE;
                                    int var37 = Integer.MAX_VALUE;
                                    byte var38 = 10;
                                    int var39 = var10.field1859;
                                    int var40 = var10.field1857;
                                    int var41 = var10.field1858;
                                    int var42 = var10.field1861;
                                    for (int var43 = var39 - var38; var43 <= var38 + var39; var43++) {
                                        for (int var44 = var40 - var38; var44 <= var38 + var40; var44++) {
                                            int var45 = var43 - var32;
                                            int var46 = var44 - var33;
                                            if (var45 >= 0 && var46 >= 0 && var45 < 128 && var46 < 128 && class119.field1849[var45][var46] < 100) {
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
                                                if (var49 < var36 || var36 == var49 && class119.field1849[var45][var46] < var37) {
                                                    var36 = var49;
                                                    var37 = class119.field1849[var45][var46];
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
                                    class119.field1850[var51] = var34;
                                    int var58 = var51 + 1;
                                    class119.field1851[var51] = var35;
                                    int var52;
                                    int var53 = var52 = class119.field1848[var34 - var32][var35 - var33];
                                    while (var5 != var34 || var6 != var35) {
                                        if (var52 != var53) {
                                            var52 = var53;
                                            class119.field1850[var58] = var34;
                                            class119.field1851[var58++] = var35;
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
                                        var53 = class119.field1848[var34 - var32][var35 - var33];
                                    }
                                    int var54 = 0;
                                    while (var58-- > 0) {
                                        var12[var54] = class119.field1850[var58];
                                        var13[var54++] = class119.field1851[var58];
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
                                var4.method229(client.field558[var56], client.field559[var56], (byte) 2);
                                var56++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class119.field1848[var14][var15] = 0;
                            class119.field1849[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method229(arg0, arg1, arg2);
        } else {
            this.method225(arg0, arg1);
        }
    }

    @ObfuscatedName("t.d(III)V")
    public void method225(int arg0, int arg1) {
        this.field647 = 0;
        this.field652 = 0;
        this.field628 = 0;
        this.field636[0] = arg0;
        this.field630[0] = arg1;
        int var3 = this.method222();
        this.field622 = this.field636[0] * 128 + var3 * 64;
        this.field639 = this.field630[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("t.k(IIBB)V")
    public final void method229(int arg0, int arg1, byte arg2) {
        if (this.field647 < 9) {
            this.field647++;
        }
        for (int var4 = this.field647; var4 > 0; var4--) {
            this.field636[var4] = this.field636[var4 - 1];
            this.field630[var4] = this.field630[var4 - 1];
            this.field650[var4] = this.field650[var4 - 1];
        }
        this.field636[0] = arg0;
        this.field630[0] = arg1;
        this.field650[0] = arg2;
    }

    @ObfuscatedName("t.j(B)Z")
    public final boolean method227() {
        return this.field240 != null;
    }
}
