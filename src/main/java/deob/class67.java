package deob;

@ObfuscatedName("bd")
public final class class67 extends class70 {

    @ObfuscatedName("bd.s")
    public class283 field591;

    @ObfuscatedName("bd.j")
    public class215 field590;

    @ObfuscatedName("bd.i")
    public int field610 = -1;

    @ObfuscatedName("bd.k")
    public int field613 = -1;

    @ObfuscatedName("bd.n")
    public String[] field601 = new String[3];

    @ObfuscatedName("bd.t")
    public int field595;

    @ObfuscatedName("bd.q")
    public int field618;

    @ObfuscatedName("bd.x")
    public int field596;

    @ObfuscatedName("bd.d")
    public int field593;

    @ObfuscatedName("bd.f")
    public int field599;

    @ObfuscatedName("bd.c")
    public int field600;

    @ObfuscatedName("bd.r")
    public int field592;

    @ObfuscatedName("bd.y")
    public int field602;

    @ObfuscatedName("bd.p")
    public class128 field603;

    @ObfuscatedName("bd.b")
    public int field604;

    @ObfuscatedName("bd.g")
    public int field605;

    @ObfuscatedName("bd.e")
    public int field617;

    @ObfuscatedName("bd.z")
    public int field607;

    @ObfuscatedName("bd.a")
    public boolean field608;

    @ObfuscatedName("bd.w")
    public int field609;

    @ObfuscatedName("bd.l")
    public boolean field589;

    @ObfuscatedName("bd.h")
    public int field611;

    @ObfuscatedName("bd.v")
    public int field612;

    @ObfuscatedName("bd.m")
    public class281 field594;

    @ObfuscatedName("bd.o")
    public class281 field614;

    @ObfuscatedName("bd.av")
    public boolean field615;

    @ObfuscatedName("bd.am")
    public int field616;

    @ObfuscatedName("bd.ai")
    public int field597;

    public class67() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field601[var1] = "";
        }
        this.field595 = 0;
        this.field618 = 0;
        this.field593 = 0;
        this.field599 = 0;
        this.field608 = false;
        this.field609 = 0;
        this.field589 = false;
        this.field594 = class281.field3594;
        this.field614 = class281.field3594;
        this.field615 = false;
    }

    @ObfuscatedName("bd.s(Lky;B)V")
    public final void method1061(class300 arg0) {
        arg0.field3704 = 0;
        int var2 = arg0.method5179();
        this.field610 = arg0.method5034();
        this.field613 = arg0.method5034();
        int var3 = -1;
        this.field609 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5179();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5179();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5054();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class255.method144(var4[var5] - 512).field3399;
                    if (var8 != 0) {
                        this.field609 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5179();
            if (var11 < 0 || var11 >= Statics.field3652[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field917 = arg0.method5054();
        if (this.field917 == 65535) {
            this.field917 = -1;
        }
        this.field970 = arg0.method5054();
        if (this.field970 == 65535) {
            this.field970 = -1;
        }
        this.field978 = this.field970;
        this.field929 = arg0.method5054();
        if (this.field929 == 65535) {
            this.field929 = -1;
        }
        this.field933 = arg0.method5054();
        if (this.field933 == 65535) {
            this.field933 = -1;
        }
        this.field928 = arg0.method5054();
        if (this.field928 == 65535) {
            this.field928 = -1;
        }
        this.field926 = arg0.method5054();
        if (this.field926 == 65535) {
            this.field926 = -1;
        }
        this.field930 = arg0.method5054();
        if (this.field930 == 65535) {
            this.field930 = -1;
        }
        this.field591 = new class283(arg0.method5150(), Statics.field3649);
        this.method1063();
        this.method1093();
        if (Statics.field177 == this) {
            Statics.field4044 = this.field591.method4767();
        }
        this.field595 = arg0.method5179();
        this.field618 = arg0.method5054();
        this.field589 = arg0.method5179() == 1;
        if (client.field627 == 0 && client.field793 >= 2) {
            this.field589 = false;
        }
        if (this.field590 == null) {
            this.field590 = new class215();
        }
        this.field590.method3665(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bd.j(B)Z")
    public boolean method1062() {
        if (class281.field3594 == this.field594) {
            this.method1094();
        }
        return class281.field3595 == this.field594;
    }

    @ObfuscatedName("bd.i(I)V")
    public void method1063() {
        this.field594 = class281.field3594;
    }

    @ObfuscatedName("bd.k(I)V")
    public void method1094() {
        this.field594 = Statics.field265.method1680(this.field591) ? class281.field3595 : class281.field3593;
    }

    @ObfuscatedName("bd.u(I)Z")
    public boolean method1080() {
        if (class281.field3594 == this.field614) {
            this.method1065();
        }
        return class281.field3595 == this.field614;
    }

    @ObfuscatedName("bd.n(I)V")
    public void method1093() {
        this.field614 = class281.field3594;
    }

    @ObfuscatedName("bd.t(I)V")
    public void method1065() {
        this.field614 = Statics.field902 != null && Statics.field902.method4673(this.field591) ? class281.field3595 : class281.field3593;
    }

    @ObfuscatedName("bd.q(I)I")
    public int method1068() {
        return this.field590 == null || this.field590.field2521 == -1 ? 1 : class257.method2739(this.field590.field2521).field3451;
    }

    @ObfuscatedName("bd.x(I)Ldo;")
    public final class128 method1064() {
        if (this.field590 == null) {
            return null;
        }
        class259 var1 = this.field924 != -1 && this.field954 == 0 ? Statics.method3725(this.field924) : null;
        class259 var2 = this.field980 == -1 || this.field608 || this.field980 == this.field917 && var1 != null ? null : Statics.method3725(this.field980);
        class128 var3 = this.field590.method3661(var1, this.field952, var2, this.field949);
        if (var3 == null) {
            return null;
        }
        var3.method2627();
        this.field969 = var3.field1851;
        if (!this.field608 && this.field956 != -1 && this.field923 != -1) {
            class128 var4 = class244.method1579(this.field956).method4011(this.field923);
            if (var4 != null) {
                var4.method2638(0, -this.field960, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (!this.field608 && this.field603 != null) {
            if (client.field635 >= this.field599) {
                this.field603 = null;
            }
            if (client.field635 >= this.field593 && client.field635 < this.field599) {
                class128 var6 = this.field603;
                var6.method2638(this.field600 - this.field957, this.field592 - this.field596, this.field602 - this.field918);
                if (this.field932 == 512) {
                    var6.method2668();
                    var6.method2668();
                    var6.method2668();
                } else if (this.field932 == 1024) {
                    var6.method2668();
                    var6.method2668();
                } else if (this.field932 == 1536) {
                    var6.method2668();
                }
                class128[] var7 = new class128[] { var3, var6 };
                var3 = new class128(var7, 2);
                if (this.field932 == 512) {
                    var6.method2668();
                } else if (this.field932 == 1024) {
                    var6.method2668();
                    var6.method2668();
                } else if (this.field932 == 1536) {
                    var6.method2668();
                    var6.method2668();
                    var6.method2668();
                }
                var6.method2638(this.field957 - this.field600, this.field596 - this.field592, this.field918 - this.field602);
            }
        }
        var3.field1676 = true;
        return var3;
    }

    @ObfuscatedName("bd.d(IIBI)V")
    public final void method1067(int arg0, int arg1, byte arg2) {
        if (this.field924 != -1 && Statics.method3725(this.field924).field3506 == 1) {
            this.field924 = -1;
        }
        this.field947 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1071(arg0, arg1);
        } else if (this.field975[0] >= 0 && this.field975[0] < 104 && this.field945[0] >= 0 && this.field945[0] < 104) {
            if (arg2 == 2) {
                class67 var4 = this;
                int var5 = this.field975[0];
                int var6 = this.field945[0];
                int var7 = this.method1068();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method1068();
                    class175 var9 = client.method478(arg0, arg1);
                    class173 var10 = client.field892[this.field611];
                    int[] var11 = client.field698;
                    int[] var12 = client.field899;
                    int var13 = 0;
                    label707: while (true) {
                        if (var13 >= 128) {
                            boolean var30;
                            if (var8 == 1) {
                                int var15 = var5;
                                int var16 = var6;
                                byte var17 = 64;
                                byte var18 = 64;
                                int var19 = var5 - var17;
                                int var20 = var6 - var18;
                                class174.field2072[var17][var18] = 99;
                                class174.field2079[var17][var18] = 0;
                                byte var21 = 0;
                                int var22 = 0;
                                class174.field2073[var21] = var5;
                                int var94 = var21 + 1;
                                class174.field2070[var21] = var6;
                                int[][] var23 = var10.field2065;
                                boolean var28;
                                while (true) {
                                    if (var94 == var22) {
                                        Statics.field2074 = var15;
                                        Statics.field2071 = var16;
                                        var28 = false;
                                        break;
                                    }
                                    var15 = class174.field2073[var22];
                                    var16 = class174.field2070[var22];
                                    var22 = var22 + 1 & 0xFFF;
                                    int var24 = var15 - var19;
                                    int var25 = var16 - var20;
                                    int var26 = var15 - var10.field2054;
                                    int var27 = var16 - var10.field2068;
                                    if (var9.method1053(1, var15, var16, var10)) {
                                        Statics.field2074 = var15;
                                        Statics.field2071 = var16;
                                        var28 = true;
                                        break;
                                    }
                                    int var29 = class174.field2079[var24][var25] + 1;
                                    if (var24 > 0 && class174.field2072[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0) {
                                        class174.field2073[var94] = var15 - 1;
                                        class174.field2070[var94] = var16;
                                        var94 = var94 + 1 & 0xFFF;
                                        class174.field2072[var24 - 1][var25] = 2;
                                        class174.field2079[var24 - 1][var25] = var29;
                                    }
                                    if (var24 < 127 && class174.field2072[var24 + 1][var25] == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0) {
                                        class174.field2073[var94] = var15 + 1;
                                        class174.field2070[var94] = var16;
                                        var94 = var94 + 1 & 0xFFF;
                                        class174.field2072[var24 + 1][var25] = 8;
                                        class174.field2079[var24 + 1][var25] = var29;
                                    }
                                    if (var25 > 0 && class174.field2072[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                                        class174.field2073[var94] = var15;
                                        class174.field2070[var94] = var16 - 1;
                                        var94 = var94 + 1 & 0xFFF;
                                        class174.field2072[var24][var25 - 1] = 1;
                                        class174.field2079[var24][var25 - 1] = var29;
                                    }
                                    if (var25 < 127 && class174.field2072[var24][var25 + 1] == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                                        class174.field2073[var94] = var15;
                                        class174.field2070[var94] = var16 + 1;
                                        var94 = var94 + 1 & 0xFFF;
                                        class174.field2072[var24][var25 + 1] = 4;
                                        class174.field2079[var24][var25 + 1] = var29;
                                    }
                                    if (var24 > 0 && var25 > 0 && class174.field2072[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                                        class174.field2073[var94] = var15 - 1;
                                        class174.field2070[var94] = var16 - 1;
                                        var94 = var94 + 1 & 0xFFF;
                                        class174.field2072[var24 - 1][var25 - 1] = 3;
                                        class174.field2079[var24 - 1][var25 - 1] = var29;
                                    }
                                    if (var24 < 127 && var25 > 0 && class174.field2072[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                                        class174.field2073[var94] = var15 + 1;
                                        class174.field2070[var94] = var16 - 1;
                                        var94 = var94 + 1 & 0xFFF;
                                        class174.field2072[var24 + 1][var25 - 1] = 9;
                                        class174.field2079[var24 + 1][var25 - 1] = var29;
                                    }
                                    if (var24 > 0 && var25 < 127 && class174.field2072[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                                        class174.field2073[var94] = var15 - 1;
                                        class174.field2070[var94] = var16 + 1;
                                        var94 = var94 + 1 & 0xFFF;
                                        class174.field2072[var24 - 1][var25 + 1] = 6;
                                        class174.field2079[var24 - 1][var25 + 1] = var29;
                                    }
                                    if (var24 < 127 && var25 < 127 && class174.field2072[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 1] & 0x12401E0) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                                        class174.field2073[var94] = var15 + 1;
                                        class174.field2070[var94] = var16 + 1;
                                        var94 = var94 + 1 & 0xFFF;
                                        class174.field2072[var24 + 1][var25 + 1] = 12;
                                        class174.field2079[var24 + 1][var25 + 1] = var29;
                                    }
                                }
                                var30 = var28;
                            } else if (var8 == 2) {
                                int var31 = var5;
                                int var32 = var6;
                                byte var33 = 64;
                                byte var34 = 64;
                                int var35 = var5 - var33;
                                int var36 = var6 - var34;
                                class174.field2072[var33][var34] = 99;
                                class174.field2079[var33][var34] = 0;
                                byte var37 = 0;
                                int var38 = 0;
                                class174.field2073[var37] = var5;
                                int var95 = var37 + 1;
                                class174.field2070[var37] = var6;
                                int[][] var39 = var10.field2065;
                                boolean var44;
                                while (true) {
                                    if (var95 == var38) {
                                        Statics.field2074 = var31;
                                        Statics.field2071 = var32;
                                        var44 = false;
                                        break;
                                    }
                                    var31 = class174.field2073[var38];
                                    var32 = class174.field2070[var38];
                                    var38 = var38 + 1 & 0xFFF;
                                    int var40 = var31 - var35;
                                    int var41 = var32 - var36;
                                    int var42 = var31 - var10.field2054;
                                    int var43 = var32 - var10.field2068;
                                    if (var9.method1053(2, var31, var32, var10)) {
                                        Statics.field2074 = var31;
                                        Statics.field2071 = var32;
                                        var44 = true;
                                        break;
                                    }
                                    int var45 = class174.field2079[var40][var41] + 1;
                                    if (var40 > 0 && class174.field2072[var40 - 1][var41] == 0 && (var39[var42 - 1][var43] & 0x124010E) == 0 && (var39[var42 - 1][var43 + 1] & 0x1240138) == 0) {
                                        class174.field2073[var95] = var31 - 1;
                                        class174.field2070[var95] = var32;
                                        var95 = var95 + 1 & 0xFFF;
                                        class174.field2072[var40 - 1][var41] = 2;
                                        class174.field2079[var40 - 1][var41] = var45;
                                    }
                                    if (var40 < 126 && class174.field2072[var40 + 1][var41] == 0 && (var39[var42 + 2][var43] & 0x1240183) == 0 && (var39[var42 + 2][var43 + 1] & 0x12401E0) == 0) {
                                        class174.field2073[var95] = var31 + 1;
                                        class174.field2070[var95] = var32;
                                        var95 = var95 + 1 & 0xFFF;
                                        class174.field2072[var40 + 1][var41] = 8;
                                        class174.field2079[var40 + 1][var41] = var45;
                                    }
                                    if (var41 > 0 && class174.field2072[var40][var41 - 1] == 0 && (var39[var42][var43 - 1] & 0x124010E) == 0 && (var39[var42 + 1][var43 - 1] & 0x1240183) == 0) {
                                        class174.field2073[var95] = var31;
                                        class174.field2070[var95] = var32 - 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class174.field2072[var40][var41 - 1] = 1;
                                        class174.field2079[var40][var41 - 1] = var45;
                                    }
                                    if (var41 < 126 && class174.field2072[var40][var41 + 1] == 0 && (var39[var42][var43 + 2] & 0x1240138) == 0 && (var39[var42 + 1][var43 + 2] & 0x12401E0) == 0) {
                                        class174.field2073[var95] = var31;
                                        class174.field2070[var95] = var32 + 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class174.field2072[var40][var41 + 1] = 4;
                                        class174.field2079[var40][var41 + 1] = var45;
                                    }
                                    if (var40 > 0 && var41 > 0 && class174.field2072[var40 - 1][var41 - 1] == 0 && (var39[var42 - 1][var43] & 0x124013E) == 0 && (var39[var42 - 1][var43 - 1] & 0x124010E) == 0 && (var39[var42][var43 - 1] & 0x124018F) == 0) {
                                        class174.field2073[var95] = var31 - 1;
                                        class174.field2070[var95] = var32 - 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class174.field2072[var40 - 1][var41 - 1] = 3;
                                        class174.field2079[var40 - 1][var41 - 1] = var45;
                                    }
                                    if (var40 < 126 && var41 > 0 && class174.field2072[var40 + 1][var41 - 1] == 0 && (var39[var42 + 1][var43 - 1] & 0x124018F) == 0 && (var39[var42 + 2][var43 - 1] & 0x1240183) == 0 && (var39[var42 + 2][var43] & 0x12401E3) == 0) {
                                        class174.field2073[var95] = var31 + 1;
                                        class174.field2070[var95] = var32 - 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class174.field2072[var40 + 1][var41 - 1] = 9;
                                        class174.field2079[var40 + 1][var41 - 1] = var45;
                                    }
                                    if (var40 > 0 && var41 < 126 && class174.field2072[var40 - 1][var41 + 1] == 0 && (var39[var42 - 1][var43 + 1] & 0x124013E) == 0 && (var39[var42 - 1][var43 + 2] & 0x1240138) == 0 && (var39[var42][var43 + 2] & 0x12401F8) == 0) {
                                        class174.field2073[var95] = var31 - 1;
                                        class174.field2070[var95] = var32 + 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class174.field2072[var40 - 1][var41 + 1] = 6;
                                        class174.field2079[var40 - 1][var41 + 1] = var45;
                                    }
                                    if (var40 < 126 && var41 < 126 && class174.field2072[var40 + 1][var41 + 1] == 0 && (var39[var42 + 1][var43 + 2] & 0x12401F8) == 0 && (var39[var42 + 2][var43 + 2] & 0x12401E0) == 0 && (var39[var42 + 2][var43 + 1] & 0x12401E3) == 0) {
                                        class174.field2073[var95] = var31 + 1;
                                        class174.field2070[var95] = var32 + 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class174.field2072[var40 + 1][var41 + 1] = 12;
                                        class174.field2079[var40 + 1][var41 + 1] = var45;
                                    }
                                }
                                var30 = var44;
                            } else {
                                int var46 = var5;
                                int var47 = var6;
                                byte var48 = 64;
                                byte var49 = 64;
                                int var50 = var5 - var48;
                                int var51 = var6 - var49;
                                class174.field2072[var48][var49] = 99;
                                class174.field2079[var48][var49] = 0;
                                byte var52 = 0;
                                int var53 = 0;
                                class174.field2073[var52] = var5;
                                int var96 = var52 + 1;
                                class174.field2070[var52] = var6;
                                int[][] var54 = var10.field2065;
                                boolean var59;
                                label677: while (true) {
                                    label675: while (true) {
                                        int var55;
                                        int var56;
                                        int var57;
                                        int var58;
                                        int var60;
                                        do {
                                            do {
                                                do {
                                                    label652: do {
                                                        if (var96 == var53) {
                                                            Statics.field2074 = var46;
                                                            Statics.field2071 = var47;
                                                            var59 = false;
                                                            break label677;
                                                        }
                                                        var46 = class174.field2073[var53];
                                                        var47 = class174.field2070[var53];
                                                        var53 = var53 + 1 & 0xFFF;
                                                        var55 = var46 - var50;
                                                        var56 = var47 - var51;
                                                        var57 = var46 - var10.field2054;
                                                        var58 = var47 - var10.field2068;
                                                        if (var9.method1053(var8, var46, var47, var10)) {
                                                            Statics.field2074 = var46;
                                                            Statics.field2071 = var47;
                                                            var59 = true;
                                                            break label677;
                                                        }
                                                        var60 = class174.field2079[var55][var56] + 1;
                                                        if (var55 > 0 && class174.field2072[var55 - 1][var56] == 0 && (var54[var57 - 1][var58] & 0x124010E) == 0 && (var54[var57 - 1][var8 + var58 - 1] & 0x1240138) == 0) {
                                                            int var61 = 1;
                                                            while (true) {
                                                                if (var61 >= var8 - 1) {
                                                                    class174.field2073[var96] = var46 - 1;
                                                                    class174.field2070[var96] = var47;
                                                                    var96 = var96 + 1 & 0xFFF;
                                                                    class174.field2072[var55 - 1][var56] = 2;
                                                                    class174.field2079[var55 - 1][var56] = var60;
                                                                    break;
                                                                }
                                                                if ((var54[var57 - 1][var58 + var61] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var61++;
                                                            }
                                                        }
                                                        if (var55 < 128 - var8 && class174.field2072[var55 + 1][var56] == 0 && (var54[var8 + var57][var58] & 0x1240183) == 0 && (var54[var8 + var57][var8 + var58 - 1] & 0x12401E0) == 0) {
                                                            int var62 = 1;
                                                            while (true) {
                                                                if (var62 >= var8 - 1) {
                                                                    class174.field2073[var96] = var46 + 1;
                                                                    class174.field2070[var96] = var47;
                                                                    var96 = var96 + 1 & 0xFFF;
                                                                    class174.field2072[var55 + 1][var56] = 8;
                                                                    class174.field2079[var55 + 1][var56] = var60;
                                                                    break;
                                                                }
                                                                if ((var54[var8 + var57][var58 + var62] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var62++;
                                                            }
                                                        }
                                                        if (var56 > 0 && class174.field2072[var55][var56 - 1] == 0 && (var54[var57][var58 - 1] & 0x124010E) == 0 && (var54[var8 + var57 - 1][var58 - 1] & 0x1240183) == 0) {
                                                            int var63 = 1;
                                                            while (true) {
                                                                if (var63 >= var8 - 1) {
                                                                    class174.field2073[var96] = var46;
                                                                    class174.field2070[var96] = var47 - 1;
                                                                    var96 = var96 + 1 & 0xFFF;
                                                                    class174.field2072[var55][var56 - 1] = 1;
                                                                    class174.field2079[var55][var56 - 1] = var60;
                                                                    break;
                                                                }
                                                                if ((var54[var57 + var63][var58 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var63++;
                                                            }
                                                        }
                                                        if (var56 < 128 - var8 && class174.field2072[var55][var56 + 1] == 0 && (var54[var57][var8 + var58] & 0x1240138) == 0 && (var54[var8 + var57 - 1][var8 + var58] & 0x12401E0) == 0) {
                                                            int var64 = 1;
                                                            while (true) {
                                                                if (var64 >= var8 - 1) {
                                                                    class174.field2073[var96] = var46;
                                                                    class174.field2070[var96] = var47 + 1;
                                                                    var96 = var96 + 1 & 0xFFF;
                                                                    class174.field2072[var55][var56 + 1] = 4;
                                                                    class174.field2079[var55][var56 + 1] = var60;
                                                                    break;
                                                                }
                                                                if ((var54[var57 + var64][var8 + var58] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var64++;
                                                            }
                                                        }
                                                        if (var55 > 0 && var56 > 0 && class174.field2072[var55 - 1][var56 - 1] == 0 && (var54[var57 - 1][var58 - 1] & 0x124010E) == 0) {
                                                            int var65 = 1;
                                                            while (true) {
                                                                if (var65 >= var8) {
                                                                    class174.field2073[var96] = var46 - 1;
                                                                    class174.field2070[var96] = var47 - 1;
                                                                    var96 = var96 + 1 & 0xFFF;
                                                                    class174.field2072[var55 - 1][var56 - 1] = 3;
                                                                    class174.field2079[var55 - 1][var56 - 1] = var60;
                                                                    break;
                                                                }
                                                                if ((var54[var57 - 1][var58 - 1 + var65] & 0x124013E) != 0 || (var54[var57 - 1 + var65][var58 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var65++;
                                                            }
                                                        }
                                                        if (var55 < 128 - var8 && var56 > 0 && class174.field2072[var55 + 1][var56 - 1] == 0 && (var54[var8 + var57][var58 - 1] & 0x1240183) == 0) {
                                                            int var66 = 1;
                                                            while (true) {
                                                                if (var66 >= var8) {
                                                                    class174.field2073[var96] = var46 + 1;
                                                                    class174.field2070[var96] = var47 - 1;
                                                                    var96 = var96 + 1 & 0xFFF;
                                                                    class174.field2072[var55 + 1][var56 - 1] = 9;
                                                                    class174.field2079[var55 + 1][var56 - 1] = var60;
                                                                    break;
                                                                }
                                                                if ((var54[var8 + var57][var58 - 1 + var66] & 0x12401E3) != 0 || (var54[var57 + var66][var58 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var66++;
                                                            }
                                                        }
                                                        if (var55 > 0 && var56 < 128 - var8 && class174.field2072[var55 - 1][var56 + 1] == 0 && (var54[var57 - 1][var8 + var58] & 0x1240138) == 0) {
                                                            for (int var67 = 1; var67 < var8; var67++) {
                                                                if ((var54[var57 - 1][var58 + var67] & 0x124013E) != 0 || (var54[var57 - 1 + var67][var8 + var58] & 0x12401F8) != 0) {
                                                                    continue label652;
                                                                }
                                                            }
                                                            class174.field2073[var96] = var46 - 1;
                                                            class174.field2070[var96] = var47 + 1;
                                                            var96 = var96 + 1 & 0xFFF;
                                                            class174.field2072[var55 - 1][var56 + 1] = 6;
                                                            class174.field2079[var55 - 1][var56 + 1] = var60;
                                                        }
                                                    } while (var55 >= 128 - var8);
                                                } while (var56 >= 128 - var8);
                                            } while (class174.field2072[var55 + 1][var56 + 1] != 0);
                                        } while ((var54[var8 + var57][var8 + var58] & 0x12401E0) != 0);
                                        for (int var68 = 1; var68 < var8; var68++) {
                                            if ((var54[var57 + var68][var8 + var58] & 0x12401F8) != 0 || (var54[var8 + var57][var58 + var68] & 0x12401E3) != 0) {
                                                continue label675;
                                            }
                                        }
                                        class174.field2073[var96] = var46 + 1;
                                        class174.field2070[var96] = var47 + 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class174.field2072[var55 + 1][var56 + 1] = 12;
                                        class174.field2079[var55 + 1][var56 + 1] = var60;
                                    }
                                }
                                var30 = var59;
                            }
                            int var87;
                            label750: {
                                int var69 = var5 - 64;
                                int var70 = var6 - 64;
                                int var71 = Statics.field2074;
                                int var72 = Statics.field2071;
                                if (!var30) {
                                    int var73 = Integer.MAX_VALUE;
                                    int var74 = Integer.MAX_VALUE;
                                    byte var75 = 10;
                                    int var76 = var9.field2086;
                                    int var77 = var9.field2082;
                                    int var78 = var9.field2083;
                                    int var79 = var9.field2081;
                                    for (int var80 = var76 - var75; var80 <= var75 + var76; var80++) {
                                        for (int var81 = var77 - var75; var81 <= var75 + var77; var81++) {
                                            int var82 = var80 - var69;
                                            int var83 = var81 - var70;
                                            if (var82 >= 0 && var83 >= 0 && var82 < 128 && var83 < 128 && class174.field2079[var82][var83] < 100) {
                                                int var84 = 0;
                                                if (var80 < var76) {
                                                    var84 = var76 - var80;
                                                } else if (var80 > var76 + var78 - 1) {
                                                    var84 = var80 - (var76 + var78 - 1);
                                                }
                                                int var85 = 0;
                                                if (var81 < var77) {
                                                    var85 = var77 - var81;
                                                } else if (var81 > var77 + var79 - 1) {
                                                    var85 = var81 - (var77 + var79 - 1);
                                                }
                                                int var86 = var84 * var84 + var85 * var85;
                                                if (var86 < var73 || var73 == var86 && class174.field2079[var82][var83] < var74) {
                                                    var73 = var86;
                                                    var74 = class174.field2079[var82][var83];
                                                    var71 = var80;
                                                    var72 = var81;
                                                }
                                            }
                                        }
                                    }
                                    if (var73 == Integer.MAX_VALUE) {
                                        var87 = -1;
                                        break label750;
                                    }
                                }
                                if (var5 == var71 && var6 == var72) {
                                    var87 = 0;
                                } else {
                                    byte var88 = 0;
                                    class174.field2073[var88] = var71;
                                    int var97 = var88 + 1;
                                    class174.field2070[var88] = var72;
                                    int var89;
                                    int var90 = var89 = class174.field2072[var71 - var69][var72 - var70];
                                    while (var5 != var71 || var6 != var72) {
                                        if (var89 != var90) {
                                            var89 = var90;
                                            class174.field2073[var97] = var71;
                                            class174.field2070[var97++] = var72;
                                        }
                                        if ((var90 & 0x2) != 0) {
                                            var71++;
                                        } else if ((var90 & 0x8) != 0) {
                                            var71--;
                                        }
                                        if ((var90 & 0x1) != 0) {
                                            var72++;
                                        } else if ((var90 & 0x4) != 0) {
                                            var72--;
                                        }
                                        var90 = class174.field2072[var71 - var69][var72 - var70];
                                    }
                                    int var91 = 0;
                                    while (var97-- > 0) {
                                        var11[var91] = class174.field2073[var97];
                                        var12[var91++] = class174.field2070[var97];
                                        if (var91 >= var11.length) {
                                            break;
                                        }
                                    }
                                    var87 = var91;
                                }
                            }
                            int var92 = var87;
                            if (var87 < 1) {
                                break;
                            }
                            int var93 = 0;
                            while (true) {
                                if (var93 >= var92 - 1) {
                                    break label707;
                                }
                                var4.method1072(client.field698[var93], client.field899[var93], (byte) 2);
                                var93++;
                            }
                        }
                        for (int var14 = 0; var14 < 128; var14++) {
                            class174.field2072[var13][var14] = 0;
                            class174.field2079[var13][var14] = 99999999;
                        }
                        var13++;
                    }
                }
            }
            this.method1072(arg0, arg1, arg2);
        } else {
            this.method1071(arg0, arg1);
        }
    }

    @ObfuscatedName("bd.f(III)V")
    public void method1071(int arg0, int arg1) {
        this.field973 = 0;
        this.field948 = 0;
        this.field977 = 0;
        this.field975[0] = arg0;
        this.field945[0] = arg1;
        int var3 = this.method1068();
        this.field957 = this.field975[0] * 128 + var3 * 64;
        this.field918 = this.field945[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bd.c(IIBB)V")
    public final void method1072(int arg0, int arg1, byte arg2) {
        if (this.field973 < 9) {
            this.field973++;
        }
        for (int var4 = this.field973; var4 > 0; var4--) {
            this.field975[var4] = this.field975[var4 - 1];
            this.field945[var4] = this.field945[var4 - 1];
            this.field976[var4] = this.field976[var4 - 1];
        }
        this.field975[0] = arg0;
        this.field945[0] = arg1;
        this.field976[0] = arg2;
    }

    @ObfuscatedName("bd.r(B)Z")
    public final boolean method1073() {
        return this.field590 != null;
    }
}
