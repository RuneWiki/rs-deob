package deob;

@ObfuscatedName("bk")
public final class class76 extends class79 {

    @ObfuscatedName("bk.n")
    public class294 field630;

    @ObfuscatedName("bk.v")
    public class224 field629;

    @ObfuscatedName("bk.d")
    public int field652 = -1;

    @ObfuscatedName("bk.c")
    public int field631 = -1;

    @ObfuscatedName("bk.h")
    public String[] field654 = new String[3];

    @ObfuscatedName("bk.z")
    public int field633;

    @ObfuscatedName("bk.e")
    public int field634;

    @ObfuscatedName("bk.q")
    public int field648;

    @ObfuscatedName("bk.l")
    public int field639;

    @ObfuscatedName("bk.s")
    public int field635;

    @ObfuscatedName("bk.b")
    public int field638;

    @ObfuscatedName("bk.a")
    public int field644;

    @ObfuscatedName("bk.w")
    public int field640;

    @ObfuscatedName("bk.k")
    public class137 field636;

    @ObfuscatedName("bk.i")
    public int field642;

    @ObfuscatedName("bk.x")
    public int field643;

    @ObfuscatedName("bk.f")
    public int field641;

    @ObfuscatedName("bk.g")
    public int field645;

    @ObfuscatedName("bk.u")
    public boolean field646;

    @ObfuscatedName("bk.t")
    public int field647;

    @ObfuscatedName("bk.p")
    public boolean field649;

    @ObfuscatedName("bk.m")
    public int field650;

    @ObfuscatedName("bk.r")
    public int field637;

    @ObfuscatedName("bk.o")
    public class292 field651;

    @ObfuscatedName("bk.j")
    public class292 field632;

    @ObfuscatedName("bk.ay")
    public boolean field653;

    @ObfuscatedName("bk.am")
    public int field628;

    @ObfuscatedName("bk.ag")
    public int field655;

    public class76() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field654[var1] = "";
        }
        this.field633 = 0;
        this.field634 = 0;
        this.field639 = 0;
        this.field635 = 0;
        this.field646 = false;
        this.field647 = 0;
        this.field649 = false;
        this.field651 = class292.field3651;
        this.field632 = class292.field3651;
        this.field653 = false;
    }

    @ObfuscatedName("bk.n(Lkx;I)V")
    public final void method1225(class311 arg0) {
        arg0.field3747 = 0;
        int var2 = arg0.method5310();
        this.field652 = arg0.method5293();
        this.field631 = arg0.method5293();
        int var3 = -1;
        this.field647 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5310();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5310();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5247();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class266.method4793(var4[var5] - 512).field3482;
                    if (var8 != 0) {
                        this.field647 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5310();
            if (var11 < 0 || var11 >= Statics.field1340[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field973 = arg0.method5247();
        if (this.field973 == 65535) {
            this.field973 = -1;
        }
        this.field1014 = arg0.method5247();
        if (this.field1014 == 65535) {
            this.field1014 = -1;
        }
        this.field961 = this.field1014;
        this.field981 = arg0.method5247();
        if (this.field981 == 65535) {
            this.field981 = -1;
        }
        this.field963 = arg0.method5247();
        if (this.field963 == 65535) {
            this.field963 = -1;
        }
        this.field985 = arg0.method5247();
        if (this.field985 == 65535) {
            this.field985 = -1;
        }
        this.field1012 = arg0.method5247();
        if (this.field1012 == 65535) {
            this.field1012 = -1;
        }
        this.field966 = arg0.method5247();
        if (this.field966 == 65535) {
            this.field966 = -1;
        }
        this.field630 = new class294(arg0.method5465(), Statics.field617);
        this.method1208();
        this.method1181();
        if (Statics.field1986 == this) {
            Statics.field8 = this.field630.method4963();
        }
        this.field633 = arg0.method5310();
        this.field634 = arg0.method5247();
        this.field649 = arg0.method5310() == 1;
        if (client.field664 == 0 && client.field754 >= 2) {
            this.field649 = false;
        }
        if (this.field629 == null) {
            this.field629 = new class224();
        }
        this.field629.method3839(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bk.v(I)Z")
    public boolean method1196() {
        if (class292.field3651 == this.field651) {
            this.method1183();
        }
        return class292.field3650 == this.field651;
    }

    @ObfuscatedName("bk.d(I)V")
    public void method1208() {
        this.field651 = class292.field3651;
    }

    @ObfuscatedName("bk.c(I)V")
    public void method1183() {
        this.field651 = Statics.field574.method1851(this.field630) ? class292.field3650 : class292.field3652;
    }

    @ObfuscatedName("bk.y(I)Z")
    public boolean method1184() {
        if (class292.field3651 == this.field632) {
            this.method1186();
        }
        return class292.field3650 == this.field632;
    }

    @ObfuscatedName("bk.h(B)V")
    public void method1181() {
        this.field632 = class292.field3651;
    }

    @ObfuscatedName("bk.z(B)V")
    public void method1186() {
        this.field632 = Statics.field295 != null && Statics.field295.method4884(this.field630) ? class292.field3650 : class292.field3652;
    }

    @ObfuscatedName("bk.e(I)I")
    public int method1187() {
        return this.field629 == null || this.field629.field2569 == -1 ? 1 : class268.method2020(this.field629.field2569).field3504;
    }

    @ObfuscatedName("bk.q(B)Lef;")
    public final class137 method1214() {
        if (this.field629 == null) {
            return null;
        }
        class270 var1 = this.field998 != -1 && this.field989 == 0 ? Statics.method1124(this.field998) : null;
        class270 var2 = this.field983 == -1 || this.field646 || this.field983 == this.field973 && var1 != null ? null : Statics.method1124(this.field983);
        class137 var3 = this.field629.method3845(var1, this.field996, var2, this.field984);
        if (var3 == null) {
            return null;
        }
        var3.method2793();
        this.field1004 = var3.field1885;
        if (!this.field646 && this.field988 != -1 && this.field992 != -1) {
            class137 var4 = class255.method4871(this.field988).method4216(this.field992);
            if (var4 != null) {
                var4.method2810(0, -this.field995, 0);
                class137[] var5 = new class137[] { var3, var4 };
                var3 = new class137(var5, 2);
            }
        }
        if (!this.field646 && this.field636 != null) {
            if (client.field729 >= this.field635) {
                this.field636 = null;
            }
            if (client.field729 >= this.field639 && client.field729 < this.field635) {
                class137 var6 = this.field636;
                var6.method2810(this.field638 - this.field957, this.field644 - this.field648, this.field640 - this.field954);
                if (this.field1005 == 512) {
                    var6.method2806();
                    var6.method2806();
                    var6.method2806();
                } else if (this.field1005 == 1024) {
                    var6.method2806();
                    var6.method2806();
                } else if (this.field1005 == 1536) {
                    var6.method2806();
                }
                class137[] var7 = new class137[] { var3, var6 };
                var3 = new class137(var7, 2);
                if (this.field1005 == 512) {
                    var6.method2806();
                } else if (this.field1005 == 1024) {
                    var6.method2806();
                    var6.method2806();
                } else if (this.field1005 == 1536) {
                    var6.method2806();
                    var6.method2806();
                    var6.method2806();
                }
                var6.method2810(this.field957 - this.field638, this.field648 - this.field644, this.field954 - this.field640);
            }
        }
        var3.field1697 = true;
        return var3;
    }

    @ObfuscatedName("bk.l(IIBI)V")
    public final void method1189(int arg0, int arg1, byte arg2) {
        if (this.field998 != -1 && Statics.method1124(this.field998).field3566 == 1) {
            this.field998 = -1;
        }
        this.field982 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1190(arg0, arg1);
        } else if (this.field1009[0] >= 0 && this.field1009[0] < 104 && this.field986[0] >= 0 && this.field986[0] < 104) {
            if (arg2 == 2) {
                class76 var4 = this;
                int var5 = this.field1009[0];
                int var6 = this.field986[0];
                int var7 = this.method1187();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method1187();
                    class184 var9 = client.method191(arg0, arg1);
                    class182 var10 = client.field772[this.field650];
                    int[] var11 = client.field709;
                    int[] var12 = client.field860;
                    int var13 = 0;
                    label469: while (true) {
                        if (var13 >= 128) {
                            boolean var15;
                            if (var8 == 1) {
                                var15 = class183.method3751(var5, var6, var9, var10);
                            } else if (var8 == 2) {
                                var15 = class183.method4196(var5, var6, var9, var10);
                            } else {
                                int var16 = var5;
                                int var17 = var6;
                                byte var18 = 64;
                                byte var19 = 64;
                                int var20 = var5 - var18;
                                int var21 = var6 - var19;
                                class183.field2118[var18][var19] = 99;
                                class183.field2116[var18][var19] = 0;
                                byte var22 = 0;
                                int var23 = 0;
                                class183.field2122[var22] = var5;
                                int var64 = var22 + 1;
                                class183.field2123[var22] = var6;
                                int[][] var24 = var10.field2104;
                                boolean var29;
                                label455: while (true) {
                                    label453: while (true) {
                                        int var25;
                                        int var26;
                                        int var27;
                                        int var28;
                                        int var30;
                                        do {
                                            do {
                                                do {
                                                    label430: do {
                                                        if (var64 == var23) {
                                                            Statics.field2119 = var16;
                                                            Statics.field2125 = var17;
                                                            var29 = false;
                                                            break label455;
                                                        }
                                                        var16 = class183.field2122[var23];
                                                        var17 = class183.field2123[var23];
                                                        var23 = var23 + 1 & 0xFFF;
                                                        var25 = var16 - var20;
                                                        var26 = var17 - var21;
                                                        var27 = var16 - var10.field2097;
                                                        var28 = var17 - var10.field2108;
                                                        if (var9.method1167(var8, var16, var17, var10)) {
                                                            Statics.field2119 = var16;
                                                            Statics.field2125 = var17;
                                                            var29 = true;
                                                            break label455;
                                                        }
                                                        var30 = class183.field2116[var25][var26] + 1;
                                                        if (var25 > 0 && class183.field2118[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x124010E) == 0 && (var24[var27 - 1][var8 + var28 - 1] & 0x1240138) == 0) {
                                                            int var31 = 1;
                                                            while (true) {
                                                                if (var31 >= var8 - 1) {
                                                                    class183.field2122[var64] = var16 - 1;
                                                                    class183.field2123[var64] = var17;
                                                                    var64 = var64 + 1 & 0xFFF;
                                                                    class183.field2118[var25 - 1][var26] = 2;
                                                                    class183.field2116[var25 - 1][var26] = var30;
                                                                    break;
                                                                }
                                                                if ((var24[var27 - 1][var28 + var31] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var31++;
                                                            }
                                                        }
                                                        if (var25 < 128 - var8 && class183.field2118[var25 + 1][var26] == 0 && (var24[var8 + var27][var28] & 0x1240183) == 0 && (var24[var8 + var27][var8 + var28 - 1] & 0x12401E0) == 0) {
                                                            int var32 = 1;
                                                            while (true) {
                                                                if (var32 >= var8 - 1) {
                                                                    class183.field2122[var64] = var16 + 1;
                                                                    class183.field2123[var64] = var17;
                                                                    var64 = var64 + 1 & 0xFFF;
                                                                    class183.field2118[var25 + 1][var26] = 8;
                                                                    class183.field2116[var25 + 1][var26] = var30;
                                                                    break;
                                                                }
                                                                if ((var24[var8 + var27][var28 + var32] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var32++;
                                                            }
                                                        }
                                                        if (var26 > 0 && class183.field2118[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x124010E) == 0 && (var24[var8 + var27 - 1][var28 - 1] & 0x1240183) == 0) {
                                                            int var33 = 1;
                                                            while (true) {
                                                                if (var33 >= var8 - 1) {
                                                                    class183.field2122[var64] = var16;
                                                                    class183.field2123[var64] = var17 - 1;
                                                                    var64 = var64 + 1 & 0xFFF;
                                                                    class183.field2118[var25][var26 - 1] = 1;
                                                                    class183.field2116[var25][var26 - 1] = var30;
                                                                    break;
                                                                }
                                                                if ((var24[var27 + var33][var28 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var33++;
                                                            }
                                                        }
                                                        if (var26 < 128 - var8 && class183.field2118[var25][var26 + 1] == 0 && (var24[var27][var8 + var28] & 0x1240138) == 0 && (var24[var8 + var27 - 1][var8 + var28] & 0x12401E0) == 0) {
                                                            int var34 = 1;
                                                            while (true) {
                                                                if (var34 >= var8 - 1) {
                                                                    class183.field2122[var64] = var16;
                                                                    class183.field2123[var64] = var17 + 1;
                                                                    var64 = var64 + 1 & 0xFFF;
                                                                    class183.field2118[var25][var26 + 1] = 4;
                                                                    class183.field2116[var25][var26 + 1] = var30;
                                                                    break;
                                                                }
                                                                if ((var24[var27 + var34][var8 + var28] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var34++;
                                                            }
                                                        }
                                                        if (var25 > 0 && var26 > 0 && class183.field2118[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0) {
                                                            int var35 = 1;
                                                            while (true) {
                                                                if (var35 >= var8) {
                                                                    class183.field2122[var64] = var16 - 1;
                                                                    class183.field2123[var64] = var17 - 1;
                                                                    var64 = var64 + 1 & 0xFFF;
                                                                    class183.field2118[var25 - 1][var26 - 1] = 3;
                                                                    class183.field2116[var25 - 1][var26 - 1] = var30;
                                                                    break;
                                                                }
                                                                if ((var24[var27 - 1][var28 - 1 + var35] & 0x124013E) != 0 || (var24[var27 - 1 + var35][var28 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var35++;
                                                            }
                                                        }
                                                        if (var25 < 128 - var8 && var26 > 0 && class183.field2118[var25 + 1][var26 - 1] == 0 && (var24[var8 + var27][var28 - 1] & 0x1240183) == 0) {
                                                            int var36 = 1;
                                                            while (true) {
                                                                if (var36 >= var8) {
                                                                    class183.field2122[var64] = var16 + 1;
                                                                    class183.field2123[var64] = var17 - 1;
                                                                    var64 = var64 + 1 & 0xFFF;
                                                                    class183.field2118[var25 + 1][var26 - 1] = 9;
                                                                    class183.field2116[var25 + 1][var26 - 1] = var30;
                                                                    break;
                                                                }
                                                                if ((var24[var8 + var27][var28 - 1 + var36] & 0x12401E3) != 0 || (var24[var27 + var36][var28 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var36++;
                                                            }
                                                        }
                                                        if (var25 > 0 && var26 < 128 - var8 && class183.field2118[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var8 + var28] & 0x1240138) == 0) {
                                                            for (int var37 = 1; var37 < var8; var37++) {
                                                                if ((var24[var27 - 1][var28 + var37] & 0x124013E) != 0 || (var24[var27 - 1 + var37][var8 + var28] & 0x12401F8) != 0) {
                                                                    continue label430;
                                                                }
                                                            }
                                                            class183.field2122[var64] = var16 - 1;
                                                            class183.field2123[var64] = var17 + 1;
                                                            var64 = var64 + 1 & 0xFFF;
                                                            class183.field2118[var25 - 1][var26 + 1] = 6;
                                                            class183.field2116[var25 - 1][var26 + 1] = var30;
                                                        }
                                                    } while (var25 >= 128 - var8);
                                                } while (var26 >= 128 - var8);
                                            } while (class183.field2118[var25 + 1][var26 + 1] != 0);
                                        } while ((var24[var8 + var27][var8 + var28] & 0x12401E0) != 0);
                                        for (int var38 = 1; var38 < var8; var38++) {
                                            if ((var24[var27 + var38][var8 + var28] & 0x12401F8) != 0 || (var24[var8 + var27][var28 + var38] & 0x12401E3) != 0) {
                                                continue label453;
                                            }
                                        }
                                        class183.field2122[var64] = var16 + 1;
                                        class183.field2123[var64] = var17 + 1;
                                        var64 = var64 + 1 & 0xFFF;
                                        class183.field2118[var25 + 1][var26 + 1] = 12;
                                        class183.field2116[var25 + 1][var26 + 1] = var30;
                                    }
                                }
                                var15 = var29;
                            }
                            int var57;
                            label508: {
                                int var39 = var5 - 64;
                                int var40 = var6 - 64;
                                int var41 = Statics.field2119;
                                int var42 = Statics.field2125;
                                if (!var15) {
                                    int var43 = Integer.MAX_VALUE;
                                    int var44 = Integer.MAX_VALUE;
                                    byte var45 = 10;
                                    int var46 = var9.field2129;
                                    int var47 = var9.field2128;
                                    int var48 = var9.field2126;
                                    int var49 = var9.field2127;
                                    for (int var50 = var46 - var45; var50 <= var45 + var46; var50++) {
                                        for (int var51 = var47 - var45; var51 <= var45 + var47; var51++) {
                                            int var52 = var50 - var39;
                                            int var53 = var51 - var40;
                                            if (var52 >= 0 && var53 >= 0 && var52 < 128 && var53 < 128 && class183.field2116[var52][var53] < 100) {
                                                int var54 = 0;
                                                if (var50 < var46) {
                                                    var54 = var46 - var50;
                                                } else if (var50 > var46 + var48 - 1) {
                                                    var54 = var50 - (var46 + var48 - 1);
                                                }
                                                int var55 = 0;
                                                if (var51 < var47) {
                                                    var55 = var47 - var51;
                                                } else if (var51 > var47 + var49 - 1) {
                                                    var55 = var51 - (var47 + var49 - 1);
                                                }
                                                int var56 = var54 * var54 + var55 * var55;
                                                if (var56 < var43 || var43 == var56 && class183.field2116[var52][var53] < var44) {
                                                    var43 = var56;
                                                    var44 = class183.field2116[var52][var53];
                                                    var41 = var50;
                                                    var42 = var51;
                                                }
                                            }
                                        }
                                    }
                                    if (var43 == Integer.MAX_VALUE) {
                                        var57 = -1;
                                        break label508;
                                    }
                                }
                                if (var5 == var41 && var6 == var42) {
                                    var57 = 0;
                                } else {
                                    byte var58 = 0;
                                    class183.field2122[var58] = var41;
                                    int var65 = var58 + 1;
                                    class183.field2123[var58] = var42;
                                    int var59;
                                    int var60 = var59 = class183.field2118[var41 - var39][var42 - var40];
                                    while (var5 != var41 || var6 != var42) {
                                        if (var59 != var60) {
                                            var59 = var60;
                                            class183.field2122[var65] = var41;
                                            class183.field2123[var65++] = var42;
                                        }
                                        if ((var60 & 0x2) != 0) {
                                            var41++;
                                        } else if ((var60 & 0x8) != 0) {
                                            var41--;
                                        }
                                        if ((var60 & 0x1) != 0) {
                                            var42++;
                                        } else if ((var60 & 0x4) != 0) {
                                            var42--;
                                        }
                                        var60 = class183.field2118[var41 - var39][var42 - var40];
                                    }
                                    int var61 = 0;
                                    while (var65-- > 0) {
                                        var11[var61] = class183.field2122[var65];
                                        var12[var61++] = class183.field2123[var65];
                                        if (var61 >= var11.length) {
                                            break;
                                        }
                                    }
                                    var57 = var61;
                                }
                            }
                            int var62 = var57;
                            if (var57 < 1) {
                                break;
                            }
                            int var63 = 0;
                            while (true) {
                                if (var63 >= var62 - 1) {
                                    break label469;
                                }
                                var4.method1191(client.field709[var63], client.field860[var63], (byte) 2);
                                var63++;
                            }
                        }
                        for (int var14 = 0; var14 < 128; var14++) {
                            class183.field2118[var13][var14] = 0;
                            class183.field2116[var13][var14] = 99999999;
                        }
                        var13++;
                    }
                }
            }
            this.method1191(arg0, arg1, arg2);
        } else {
            this.method1190(arg0, arg1);
        }
    }

    @ObfuscatedName("bk.s(IIB)V")
    public void method1190(int arg0, int arg1) {
        this.field964 = 0;
        this.field1013 = 0;
        this.field990 = 0;
        this.field1009[0] = arg0;
        this.field986[0] = arg1;
        int var3 = this.method1187();
        this.field957 = this.field1009[0] * 128 + var3 * 64;
        this.field954 = this.field986[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bk.b(IIBI)V")
    public final void method1191(int arg0, int arg1, byte arg2) {
        if (this.field964 < 9) {
            this.field964++;
        }
        for (int var4 = this.field964; var4 > 0; var4--) {
            this.field1009[var4] = this.field1009[var4 - 1];
            this.field986[var4] = this.field986[var4 - 1];
            this.field1011[var4] = this.field1011[var4 - 1];
        }
        this.field1009[0] = arg0;
        this.field986[0] = arg1;
        this.field1011[0] = arg2;
    }

    @ObfuscatedName("bk.a(I)Z")
    public final boolean method1192() {
        return this.field629 != null;
    }
}
