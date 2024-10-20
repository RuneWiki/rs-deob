package deob;

@ObfuscatedName("bn")
public final class class67 extends class70 {

    @ObfuscatedName("bn.f")
    public class283 field605;

    @ObfuscatedName("bn.i")
    public class215 field595;

    @ObfuscatedName("bn.y")
    public int field614 = -1;

    @ObfuscatedName("bn.w")
    public int field594 = -1;

    @ObfuscatedName("bn.b")
    public String[] field596 = new String[3];

    @ObfuscatedName("bn.e")
    public int field618;

    @ObfuscatedName("bn.x")
    public int field598;

    @ObfuscatedName("bn.a")
    public int field619;

    @ObfuscatedName("bn.d")
    public int field600;

    @ObfuscatedName("bn.c")
    public int field601;

    @ObfuscatedName("bn.o")
    public int field602;

    @ObfuscatedName("bn.v")
    public int field603;

    @ObfuscatedName("bn.k")
    public int field604;

    @ObfuscatedName("bn.s")
    public class128 field593;

    @ObfuscatedName("bn.l")
    public int field606;

    @ObfuscatedName("bn.t")
    public int field607;

    @ObfuscatedName("bn.j")
    public int field608;

    @ObfuscatedName("bn.n")
    public int field609;

    @ObfuscatedName("bn.u")
    public boolean field610;

    @ObfuscatedName("bn.z")
    public int field611;

    @ObfuscatedName("bn.h")
    public boolean field599;

    @ObfuscatedName("bn.m")
    public int field613;

    @ObfuscatedName("bn.g")
    public int field616;

    @ObfuscatedName("bn.r")
    public class281 field615;

    @ObfuscatedName("bn.q")
    public class281 field591;

    @ObfuscatedName("bn.aa")
    public boolean field617;

    @ObfuscatedName("bn.av")
    public int field612;

    @ObfuscatedName("bn.aw")
    public int field592;

    public class67() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field596[var1] = "";
        }
        this.field618 = 0;
        this.field598 = 0;
        this.field600 = 0;
        this.field601 = 0;
        this.field610 = false;
        this.field611 = 0;
        this.field599 = false;
        this.field615 = class281.field3597;
        this.field591 = class281.field3597;
        this.field617 = false;
    }

    @ObfuscatedName("bn.f(Lkq;B)V")
    public final void method1092(class300 arg0) {
        arg0.field3703 = 0;
        int var2 = arg0.method5110();
        this.field614 = arg0.method5297();
        this.field594 = arg0.method5297();
        int var3 = -1;
        this.field611 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5110();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5110();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5112();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = Statics.method3278(var4[var5] - 512).field3405;
                    if (var8 != 0) {
                        this.field611 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5110();
            if (var11 < 0 || var11 >= Statics.field270[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field928 = arg0.method5112();
        if (this.field928 == 65535) {
            this.field928 = -1;
        }
        this.field929 = arg0.method5112();
        if (this.field929 == 65535) {
            this.field929 = -1;
        }
        this.field976 = this.field929;
        this.field960 = arg0.method5112();
        if (this.field960 == 65535) {
            this.field960 = -1;
        }
        this.field963 = arg0.method5112();
        if (this.field963 == 65535) {
            this.field963 = -1;
        }
        this.field933 = arg0.method5112();
        if (this.field933 == 65535) {
            this.field933 = -1;
        }
        this.field934 = arg0.method5112();
        if (this.field934 == 65535) {
            this.field934 = -1;
        }
        this.field935 = arg0.method5112();
        if (this.field935 == 65535) {
            this.field935 = -1;
        }
        this.field605 = new class283(arg0.method5119(), Statics.field2325);
        this.method1095();
        this.method1098();
        if (Statics.field585 == this) {
            Statics.field4042 = this.field605.method4822();
        }
        this.field618 = arg0.method5110();
        this.field598 = arg0.method5112();
        this.field599 = arg0.method5110() == 1;
        if (client.field631 == 0 && client.field798 >= 2) {
            this.field599 = false;
        }
        if (this.field595 == null) {
            this.field595 = new class215();
        }
        this.field595.method3631(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bn.i(I)Z")
    public boolean method1094() {
        if (class281.field3597 == this.field615) {
            this.method1096();
        }
        return class281.field3596 == this.field615;
    }

    @ObfuscatedName("bn.y(I)V")
    public void method1095() {
        this.field615 = class281.field3597;
    }

    @ObfuscatedName("bn.w(I)V")
    public void method1096() {
        this.field615 = Statics.field586.method1680(this.field605) ? class281.field3596 : class281.field3598;
    }

    @ObfuscatedName("bn.p(B)Z")
    public boolean method1097() {
        if (class281.field3597 == this.field591) {
            this.method1099();
        }
        return class281.field3596 == this.field591;
    }

    @ObfuscatedName("bn.b(B)V")
    public void method1098() {
        this.field591 = class281.field3597;
    }

    @ObfuscatedName("bn.e(I)V")
    public void method1099() {
        this.field591 = Statics.field2499 != null && Statics.field2499.method4720(this.field605) ? class281.field3596 : class281.field3598;
    }

    @ObfuscatedName("bn.x(I)I")
    public int method1123() {
        return this.field595 == null || this.field595.field2523 == -1 ? 1 : class257.method4706(this.field595.field2523).field3435;
    }

    @ObfuscatedName("bn.a(I)Ldw;")
    public final class128 method1101() {
        if (this.field595 == null) {
            return null;
        }
        class259 var1 = this.field955 != -1 && this.field958 == 0 ? class259.method209(this.field955) : null;
        class259 var2 = this.field952 == -1 || this.field610 || this.field952 == this.field928 && var1 != null ? null : class259.method209(this.field952);
        class128 var3 = this.field595.method3624(var1, this.field956, var2, this.field953);
        if (var3 == null) {
            return null;
        }
        var3.method2691();
        this.field973 = var3.field1850;
        if (!this.field610 && this.field982 != -1 && this.field954 != -1) {
            class128 var4 = class244.method3267(this.field982).method4025(this.field954);
            if (var4 != null) {
                var4.method2646(0, -this.field964, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (!this.field610 && this.field593 != null) {
            if (client.field641 >= this.field601) {
                this.field593 = null;
            }
            if (client.field641 >= this.field600 && client.field641 < this.field601) {
                class128 var6 = this.field593;
                var6.method2646(this.field602 - this.field937, this.field603 - this.field619, this.field604 - this.field923);
                if (this.field974 == 512) {
                    var6.method2663();
                    var6.method2663();
                    var6.method2663();
                } else if (this.field974 == 1024) {
                    var6.method2663();
                    var6.method2663();
                } else if (this.field974 == 1536) {
                    var6.method2663();
                }
                class128[] var7 = new class128[] { var3, var6 };
                var3 = new class128(var7, 2);
                if (this.field974 == 512) {
                    var6.method2663();
                } else if (this.field974 == 1024) {
                    var6.method2663();
                    var6.method2663();
                } else if (this.field974 == 1536) {
                    var6.method2663();
                    var6.method2663();
                    var6.method2663();
                }
                var6.method2646(this.field937 - this.field602, this.field619 - this.field603, this.field923 - this.field604);
            }
        }
        var3.field1670 = true;
        return var3;
    }

    @ObfuscatedName("bn.d(IIBI)V")
    public final void method1120(int arg0, int arg1, byte arg2) {
        if (this.field955 != -1 && class259.method209(this.field955).field3494 == 1) {
            this.field955 = -1;
        }
        this.field961 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1103(arg0, arg1);
        } else if (this.field978[0] >= 0 && this.field978[0] < 104 && this.field979[0] >= 0 && this.field979[0] < 104) {
            if (arg2 == 2) {
                class67 var4 = this;
                int var5 = this.field978[0];
                int var6 = this.field979[0];
                int var7 = this.method1123();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method1123();
                    client.field903.field2085 = arg0;
                    client.field903.field2084 = arg1;
                    client.field903.field2083 = 1;
                    client.field903.field2086 = 1;
                    class66 var9 = client.field903;
                    class66 var10 = var9;
                    class173 var11 = client.field687[this.field613];
                    int[] var12 = client.field904;
                    int[] var13 = client.field731;
                    int var14 = 0;
                    label606: while (true) {
                        if (var14 >= 128) {
                            boolean var16;
                            if (var8 == 1) {
                                var16 = class174.method138(var5, var6, var9, var11);
                            } else if (var8 == 2) {
                                int var17 = var5;
                                int var18 = var6;
                                byte var19 = 64;
                                byte var20 = 64;
                                int var21 = var5 - var19;
                                int var22 = var6 - var20;
                                class174.field2074[var19][var20] = 99;
                                class174.field2072[var19][var20] = 0;
                                byte var23 = 0;
                                int var24 = 0;
                                class174.field2079[var23] = var5;
                                int var80 = var23 + 1;
                                class174.field2077[var23] = var6;
                                int[][] var25 = var11.field2068;
                                boolean var30;
                                while (true) {
                                    if (var80 == var24) {
                                        Statics.field3525 = var17;
                                        Statics.field2073 = var18;
                                        var30 = false;
                                        break;
                                    }
                                    var17 = class174.field2079[var24];
                                    var18 = class174.field2077[var24];
                                    var24 = var24 + 1 & 0xFFF;
                                    int var26 = var17 - var21;
                                    int var27 = var18 - var22;
                                    int var28 = var17 - var11.field2064;
                                    int var29 = var18 - var11.field2065;
                                    if (var10.method1086(2, var17, var18, var11)) {
                                        Statics.field3525 = var17;
                                        Statics.field2073 = var18;
                                        var30 = true;
                                        break;
                                    }
                                    int var31 = class174.field2072[var26][var27] + 1;
                                    if (var26 > 0 && class174.field2074[var26 - 1][var27] == 0 && (var25[var28 - 1][var29] & 0x124010E) == 0 && (var25[var28 - 1][var29 + 1] & 0x1240138) == 0) {
                                        class174.field2079[var80] = var17 - 1;
                                        class174.field2077[var80] = var18;
                                        var80 = var80 + 1 & 0xFFF;
                                        class174.field2074[var26 - 1][var27] = 2;
                                        class174.field2072[var26 - 1][var27] = var31;
                                    }
                                    if (var26 < 126 && class174.field2074[var26 + 1][var27] == 0 && (var25[var28 + 2][var29] & 0x1240183) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E0) == 0) {
                                        class174.field2079[var80] = var17 + 1;
                                        class174.field2077[var80] = var18;
                                        var80 = var80 + 1 & 0xFFF;
                                        class174.field2074[var26 + 1][var27] = 8;
                                        class174.field2072[var26 + 1][var27] = var31;
                                    }
                                    if (var27 > 0 && class174.field2074[var26][var27 - 1] == 0 && (var25[var28][var29 - 1] & 0x124010E) == 0 && (var25[var28 + 1][var29 - 1] & 0x1240183) == 0) {
                                        class174.field2079[var80] = var17;
                                        class174.field2077[var80] = var18 - 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class174.field2074[var26][var27 - 1] = 1;
                                        class174.field2072[var26][var27 - 1] = var31;
                                    }
                                    if (var27 < 126 && class174.field2074[var26][var27 + 1] == 0 && (var25[var28][var29 + 2] & 0x1240138) == 0 && (var25[var28 + 1][var29 + 2] & 0x12401E0) == 0) {
                                        class174.field2079[var80] = var17;
                                        class174.field2077[var80] = var18 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class174.field2074[var26][var27 + 1] = 4;
                                        class174.field2072[var26][var27 + 1] = var31;
                                    }
                                    if (var26 > 0 && var27 > 0 && class174.field2074[var26 - 1][var27 - 1] == 0 && (var25[var28 - 1][var29] & 0x124013E) == 0 && (var25[var28 - 1][var29 - 1] & 0x124010E) == 0 && (var25[var28][var29 - 1] & 0x124018F) == 0) {
                                        class174.field2079[var80] = var17 - 1;
                                        class174.field2077[var80] = var18 - 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class174.field2074[var26 - 1][var27 - 1] = 3;
                                        class174.field2072[var26 - 1][var27 - 1] = var31;
                                    }
                                    if (var26 < 126 && var27 > 0 && class174.field2074[var26 + 1][var27 - 1] == 0 && (var25[var28 + 1][var29 - 1] & 0x124018F) == 0 && (var25[var28 + 2][var29 - 1] & 0x1240183) == 0 && (var25[var28 + 2][var29] & 0x12401E3) == 0) {
                                        class174.field2079[var80] = var17 + 1;
                                        class174.field2077[var80] = var18 - 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class174.field2074[var26 + 1][var27 - 1] = 9;
                                        class174.field2072[var26 + 1][var27 - 1] = var31;
                                    }
                                    if (var26 > 0 && var27 < 126 && class174.field2074[var26 - 1][var27 + 1] == 0 && (var25[var28 - 1][var29 + 1] & 0x124013E) == 0 && (var25[var28 - 1][var29 + 2] & 0x1240138) == 0 && (var25[var28][var29 + 2] & 0x12401F8) == 0) {
                                        class174.field2079[var80] = var17 - 1;
                                        class174.field2077[var80] = var18 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class174.field2074[var26 - 1][var27 + 1] = 6;
                                        class174.field2072[var26 - 1][var27 + 1] = var31;
                                    }
                                    if (var26 < 126 && var27 < 126 && class174.field2074[var26 + 1][var27 + 1] == 0 && (var25[var28 + 1][var29 + 2] & 0x12401F8) == 0 && (var25[var28 + 2][var29 + 2] & 0x12401E0) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E3) == 0) {
                                        class174.field2079[var80] = var17 + 1;
                                        class174.field2077[var80] = var18 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class174.field2074[var26 + 1][var27 + 1] = 12;
                                        class174.field2072[var26 + 1][var27 + 1] = var31;
                                    }
                                }
                                var16 = var30;
                            } else {
                                int var32 = var5;
                                int var33 = var6;
                                byte var34 = 64;
                                byte var35 = 64;
                                int var36 = var5 - var34;
                                int var37 = var6 - var35;
                                class174.field2074[var34][var35] = 99;
                                class174.field2072[var34][var35] = 0;
                                byte var38 = 0;
                                int var39 = 0;
                                class174.field2079[var38] = var5;
                                int var81 = var38 + 1;
                                class174.field2077[var38] = var6;
                                int[][] var40 = var11.field2068;
                                boolean var45;
                                label584: while (true) {
                                    label582: while (true) {
                                        int var41;
                                        int var42;
                                        int var43;
                                        int var44;
                                        int var46;
                                        do {
                                            do {
                                                do {
                                                    label559: do {
                                                        if (var81 == var39) {
                                                            Statics.field3525 = var32;
                                                            Statics.field2073 = var33;
                                                            var45 = false;
                                                            break label584;
                                                        }
                                                        var32 = class174.field2079[var39];
                                                        var33 = class174.field2077[var39];
                                                        var39 = var39 + 1 & 0xFFF;
                                                        var41 = var32 - var36;
                                                        var42 = var33 - var37;
                                                        var43 = var32 - var11.field2064;
                                                        var44 = var33 - var11.field2065;
                                                        if (var10.method1086(var8, var32, var33, var11)) {
                                                            Statics.field3525 = var32;
                                                            Statics.field2073 = var33;
                                                            var45 = true;
                                                            break label584;
                                                        }
                                                        var46 = class174.field2072[var41][var42] + 1;
                                                        if (var41 > 0 && class174.field2074[var41 - 1][var42] == 0 && (var40[var43 - 1][var44] & 0x124010E) == 0 && (var40[var43 - 1][var8 + var44 - 1] & 0x1240138) == 0) {
                                                            int var47 = 1;
                                                            while (true) {
                                                                if (var47 >= var8 - 1) {
                                                                    class174.field2079[var81] = var32 - 1;
                                                                    class174.field2077[var81] = var33;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class174.field2074[var41 - 1][var42] = 2;
                                                                    class174.field2072[var41 - 1][var42] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 - 1][var44 + var47] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var47++;
                                                            }
                                                        }
                                                        if (var41 < 128 - var8 && class174.field2074[var41 + 1][var42] == 0 && (var40[var8 + var43][var44] & 0x1240183) == 0 && (var40[var8 + var43][var8 + var44 - 1] & 0x12401E0) == 0) {
                                                            int var48 = 1;
                                                            while (true) {
                                                                if (var48 >= var8 - 1) {
                                                                    class174.field2079[var81] = var32 + 1;
                                                                    class174.field2077[var81] = var33;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class174.field2074[var41 + 1][var42] = 8;
                                                                    class174.field2072[var41 + 1][var42] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var8 + var43][var44 + var48] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var48++;
                                                            }
                                                        }
                                                        if (var42 > 0 && class174.field2074[var41][var42 - 1] == 0 && (var40[var43][var44 - 1] & 0x124010E) == 0 && (var40[var8 + var43 - 1][var44 - 1] & 0x1240183) == 0) {
                                                            int var49 = 1;
                                                            while (true) {
                                                                if (var49 >= var8 - 1) {
                                                                    class174.field2079[var81] = var32;
                                                                    class174.field2077[var81] = var33 - 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class174.field2074[var41][var42 - 1] = 1;
                                                                    class174.field2072[var41][var42 - 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 + var49][var44 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var49++;
                                                            }
                                                        }
                                                        if (var42 < 128 - var8 && class174.field2074[var41][var42 + 1] == 0 && (var40[var43][var8 + var44] & 0x1240138) == 0 && (var40[var8 + var43 - 1][var8 + var44] & 0x12401E0) == 0) {
                                                            int var50 = 1;
                                                            while (true) {
                                                                if (var50 >= var8 - 1) {
                                                                    class174.field2079[var81] = var32;
                                                                    class174.field2077[var81] = var33 + 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class174.field2074[var41][var42 + 1] = 4;
                                                                    class174.field2072[var41][var42 + 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 + var50][var8 + var44] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var50++;
                                                            }
                                                        }
                                                        if (var41 > 0 && var42 > 0 && class174.field2074[var41 - 1][var42 - 1] == 0 && (var40[var43 - 1][var44 - 1] & 0x124010E) == 0) {
                                                            int var51 = 1;
                                                            while (true) {
                                                                if (var51 >= var8) {
                                                                    class174.field2079[var81] = var32 - 1;
                                                                    class174.field2077[var81] = var33 - 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class174.field2074[var41 - 1][var42 - 1] = 3;
                                                                    class174.field2072[var41 - 1][var42 - 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 - 1][var44 - 1 + var51] & 0x124013E) != 0 || (var40[var43 - 1 + var51][var44 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var51++;
                                                            }
                                                        }
                                                        if (var41 < 128 - var8 && var42 > 0 && class174.field2074[var41 + 1][var42 - 1] == 0 && (var40[var8 + var43][var44 - 1] & 0x1240183) == 0) {
                                                            int var52 = 1;
                                                            while (true) {
                                                                if (var52 >= var8) {
                                                                    class174.field2079[var81] = var32 + 1;
                                                                    class174.field2077[var81] = var33 - 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class174.field2074[var41 + 1][var42 - 1] = 9;
                                                                    class174.field2072[var41 + 1][var42 - 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var8 + var43][var44 - 1 + var52] & 0x12401E3) != 0 || (var40[var43 + var52][var44 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var52++;
                                                            }
                                                        }
                                                        if (var41 > 0 && var42 < 128 - var8 && class174.field2074[var41 - 1][var42 + 1] == 0 && (var40[var43 - 1][var8 + var44] & 0x1240138) == 0) {
                                                            for (int var53 = 1; var53 < var8; var53++) {
                                                                if ((var40[var43 - 1][var44 + var53] & 0x124013E) != 0 || (var40[var43 - 1 + var53][var8 + var44] & 0x12401F8) != 0) {
                                                                    continue label559;
                                                                }
                                                            }
                                                            class174.field2079[var81] = var32 - 1;
                                                            class174.field2077[var81] = var33 + 1;
                                                            var81 = var81 + 1 & 0xFFF;
                                                            class174.field2074[var41 - 1][var42 + 1] = 6;
                                                            class174.field2072[var41 - 1][var42 + 1] = var46;
                                                        }
                                                    } while (var41 >= 128 - var8);
                                                } while (var42 >= 128 - var8);
                                            } while (class174.field2074[var41 + 1][var42 + 1] != 0);
                                        } while ((var40[var8 + var43][var8 + var44] & 0x12401E0) != 0);
                                        for (int var54 = 1; var54 < var8; var54++) {
                                            if ((var40[var43 + var54][var8 + var44] & 0x12401F8) != 0 || (var40[var8 + var43][var44 + var54] & 0x12401E3) != 0) {
                                                continue label582;
                                            }
                                        }
                                        class174.field2079[var81] = var32 + 1;
                                        class174.field2077[var81] = var33 + 1;
                                        var81 = var81 + 1 & 0xFFF;
                                        class174.field2074[var41 + 1][var42 + 1] = 12;
                                        class174.field2072[var41 + 1][var42 + 1] = var46;
                                    }
                                }
                                var16 = var45;
                            }
                            int var73;
                            label647: {
                                int var55 = var5 - 64;
                                int var56 = var6 - 64;
                                int var57 = Statics.field3525;
                                int var58 = Statics.field2073;
                                if (!var16) {
                                    int var59 = Integer.MAX_VALUE;
                                    int var60 = Integer.MAX_VALUE;
                                    byte var61 = 10;
                                    int var62 = var10.field2085;
                                    int var63 = var10.field2084;
                                    int var64 = var10.field2083;
                                    int var65 = var10.field2086;
                                    for (int var66 = var62 - var61; var66 <= var61 + var62; var66++) {
                                        for (int var67 = var63 - var61; var67 <= var61 + var63; var67++) {
                                            int var68 = var66 - var55;
                                            int var69 = var67 - var56;
                                            if (var68 >= 0 && var69 >= 0 && var68 < 128 && var69 < 128 && class174.field2072[var68][var69] < 100) {
                                                int var70 = 0;
                                                if (var66 < var62) {
                                                    var70 = var62 - var66;
                                                } else if (var66 > var62 + var64 - 1) {
                                                    var70 = var66 - (var62 + var64 - 1);
                                                }
                                                int var71 = 0;
                                                if (var67 < var63) {
                                                    var71 = var63 - var67;
                                                } else if (var67 > var63 + var65 - 1) {
                                                    var71 = var67 - (var63 + var65 - 1);
                                                }
                                                int var72 = var70 * var70 + var71 * var71;
                                                if (var72 < var59 || var59 == var72 && class174.field2072[var68][var69] < var60) {
                                                    var59 = var72;
                                                    var60 = class174.field2072[var68][var69];
                                                    var57 = var66;
                                                    var58 = var67;
                                                }
                                            }
                                        }
                                    }
                                    if (var59 == Integer.MAX_VALUE) {
                                        var73 = -1;
                                        break label647;
                                    }
                                }
                                if (var5 == var57 && var6 == var58) {
                                    var73 = 0;
                                } else {
                                    byte var74 = 0;
                                    class174.field2079[var74] = var57;
                                    int var82 = var74 + 1;
                                    class174.field2077[var74] = var58;
                                    int var75;
                                    int var76 = var75 = class174.field2074[var57 - var55][var58 - var56];
                                    while (var5 != var57 || var6 != var58) {
                                        if (var75 != var76) {
                                            var75 = var76;
                                            class174.field2079[var82] = var57;
                                            class174.field2077[var82++] = var58;
                                        }
                                        if ((var76 & 0x2) != 0) {
                                            var57++;
                                        } else if ((var76 & 0x8) != 0) {
                                            var57--;
                                        }
                                        if ((var76 & 0x1) != 0) {
                                            var58++;
                                        } else if ((var76 & 0x4) != 0) {
                                            var58--;
                                        }
                                        var76 = class174.field2074[var57 - var55][var58 - var56];
                                    }
                                    int var77 = 0;
                                    while (var82-- > 0) {
                                        var12[var77] = class174.field2079[var82];
                                        var13[var77++] = class174.field2077[var82];
                                        if (var77 >= var12.length) {
                                            break;
                                        }
                                    }
                                    var73 = var77;
                                }
                            }
                            int var78 = var73;
                            if (var73 < 1) {
                                break;
                            }
                            int var79 = 0;
                            while (true) {
                                if (var79 >= var78 - 1) {
                                    break label606;
                                }
                                var4.method1105(client.field904[var79], client.field731[var79], (byte) 2);
                                var79++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class174.field2074[var14][var15] = 0;
                            class174.field2072[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method1105(arg0, arg1, arg2);
        } else {
            this.method1103(arg0, arg1);
        }
    }

    @ObfuscatedName("bn.c(IIB)V")
    public void method1103(int arg0, int arg1) {
        this.field977 = 0;
        this.field927 = 0;
        this.field981 = 0;
        this.field978[0] = arg0;
        this.field979[0] = arg1;
        int var3 = this.method1123();
        this.field937 = this.field978[0] * 128 + var3 * 64;
        this.field923 = this.field979[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bn.o(IIBI)V")
    public final void method1105(int arg0, int arg1, byte arg2) {
        if (this.field977 < 9) {
            this.field977++;
        }
        for (int var4 = this.field977; var4 > 0; var4--) {
            this.field978[var4] = this.field978[var4 - 1];
            this.field979[var4] = this.field979[var4 - 1];
            this.field931[var4] = this.field931[var4 - 1];
        }
        this.field978[0] = arg0;
        this.field979[0] = arg1;
        this.field931[0] = arg2;
    }

    @ObfuscatedName("bn.l(S)Z")
    public final boolean method1108() {
        return this.field595 != null;
    }
}
