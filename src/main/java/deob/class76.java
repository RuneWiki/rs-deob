package deob;

@ObfuscatedName("bq")
public final class class76 extends class79 {

    @ObfuscatedName("bq.h")
    public class294 field620;

    @ObfuscatedName("bq.v")
    public class224 field622;

    @ObfuscatedName("bq.x")
    public int field609 = -1;

    @ObfuscatedName("bq.w")
    public int field610 = -1;

    @ObfuscatedName("bq.j")
    public String[] field611 = new String[3];

    @ObfuscatedName("bq.n")
    public int field612;

    @ObfuscatedName("bq.p")
    public int field613;

    @ObfuscatedName("bq.l")
    public int field614;

    @ObfuscatedName("bq.z")
    public int field615;

    @ObfuscatedName("bq.u")
    public int field616;

    @ObfuscatedName("bq.e")
    public int field635;

    @ObfuscatedName("bq.m")
    public int field618;

    @ObfuscatedName("bq.c")
    public int field627;

    @ObfuscatedName("bq.i")
    public class137 field608;

    @ObfuscatedName("bq.f")
    public int field621;

    @ObfuscatedName("bq.a")
    public int field607;

    @ObfuscatedName("bq.b")
    public int field623;

    @ObfuscatedName("bq.y")
    public int field624;

    @ObfuscatedName("bq.r")
    public boolean field625;

    @ObfuscatedName("bq.q")
    public int field617;

    @ObfuscatedName("bq.g")
    public boolean field626;

    @ObfuscatedName("bq.s")
    public int field628;

    @ObfuscatedName("bq.o")
    public int field629;

    @ObfuscatedName("bq.k")
    public class292 field630;

    @ObfuscatedName("bq.d")
    public class292 field619;

    @ObfuscatedName("bq.aj")
    public boolean field632;

    @ObfuscatedName("bq.ax")
    public int field633;

    @ObfuscatedName("bq.ag")
    public int field634;

    public class76() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field611[var1] = "";
        }
        this.field612 = 0;
        this.field613 = 0;
        this.field615 = 0;
        this.field616 = 0;
        this.field625 = false;
        this.field617 = 0;
        this.field626 = false;
        this.field630 = class292.field3654;
        this.field619 = class292.field3654;
        this.field632 = false;
    }

    @ObfuscatedName("bq.h(Lkj;B)V")
    public final void method1213(class311 arg0) {
        arg0.field3752 = 0;
        int var2 = arg0.method5274();
        this.field609 = arg0.method5148();
        this.field610 = arg0.method5148();
        int var3 = -1;
        this.field617 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5274();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5274();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5342();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class266.method1102(var4[var5] - 512).field3483;
                    if (var8 != 0) {
                        this.field617 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5274();
            if (var11 < 0 || var11 >= Statics.field367[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field944 = arg0.method5342();
        if (this.field944 == 65535) {
            this.field944 = -1;
        }
        this.field945 = arg0.method5342();
        if (this.field945 == 65535) {
            this.field945 = -1;
        }
        this.field946 = this.field945;
        this.field947 = arg0.method5342();
        if (this.field947 == 65535) {
            this.field947 = -1;
        }
        this.field948 = arg0.method5342();
        if (this.field948 == 65535) {
            this.field948 = -1;
        }
        this.field949 = arg0.method5342();
        if (this.field949 == 65535) {
            this.field949 = -1;
        }
        this.field950 = arg0.method5342();
        if (this.field950 == 65535) {
            this.field950 = -1;
        }
        this.field943 = arg0.method5342();
        if (this.field943 == 65535) {
            this.field943 = -1;
        }
        this.field620 = new class294(arg0.method5202(), Statics.field93);
        this.method1184();
        this.method1188();
        if (Statics.field2563 == this) {
            Statics.field4083 = this.field620.method4821();
        }
        this.field612 = arg0.method5274();
        this.field613 = arg0.method5342();
        this.field626 = arg0.method5274() == 1;
        if (client.field648 == 0 && client.field776 >= 2) {
            this.field626 = false;
        }
        if (this.field622 == null) {
            this.field622 = new class224();
        }
        this.field622.method3691(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bq.v(I)Z")
    public boolean method1210() {
        if (class292.field3654 == this.field630) {
            this.method1186();
        }
        return class292.field3653 == this.field630;
    }

    @ObfuscatedName("bq.x(I)V")
    public void method1184() {
        this.field630 = class292.field3654;
    }

    @ObfuscatedName("bq.w(I)V")
    public void method1186() {
        this.field630 = Statics.field2037.method1785(this.field620) ? class292.field3653 : class292.field3655;
    }

    @ObfuscatedName("bq.t(B)Z")
    public boolean method1209() {
        if (class292.field3654 == this.field619) {
            this.method1191();
        }
        return class292.field3653 == this.field619;
    }

    @ObfuscatedName("bq.j(I)V")
    public void method1188() {
        this.field619 = class292.field3654;
    }

    @ObfuscatedName("bq.n(I)V")
    public void method1191() {
        this.field619 = Statics.field245 != null && Statics.field245.method4733(this.field620) ? class292.field3653 : class292.field3655;
    }

    @ObfuscatedName("bq.p(B)I")
    public int method1190() {
        return this.field622 == null || this.field622.field2554 == -1 ? 1 : class268.method250(this.field622.field2554).field3501;
    }

    @ObfuscatedName("bq.l(I)Leh;")
    public final class137 method1198() {
        if (this.field622 == null) {
            return null;
        }
        class270 var1 = this.field971 != -1 && this.field938 == 0 ? class270.method4174(this.field971) : null;
        class270 var2 = this.field968 == -1 || this.field625 || this.field968 == this.field944 && var1 != null ? null : class270.method4174(this.field968);
        class137 var3 = this.field622.method3697(var1, this.field972, var2, this.field965);
        if (var3 == null) {
            return null;
        }
        var3.method2744();
        this.field989 = var3.field1895;
        if (!this.field625 && this.field976 != -1 && this.field977 != -1) {
            class137 var4 = class255.method2025(this.field976).method4075(this.field977);
            if (var4 != null) {
                var4.method2721(0, -this.field980, 0);
                class137[] var5 = new class137[] { var3, var4 };
                var3 = new class137(var5, 2);
            }
        }
        if (!this.field625 && this.field608 != null) {
            if (client.field656 >= this.field616) {
                this.field608 = null;
            }
            if (client.field656 >= this.field615 && client.field656 < this.field616) {
                class137 var6 = this.field608;
                var6.method2721(this.field635 - this.field991, this.field618 - this.field614, this.field627 - this.field939);
                if (this.field990 == 512) {
                    var6.method2743();
                    var6.method2743();
                    var6.method2743();
                } else if (this.field990 == 1024) {
                    var6.method2743();
                    var6.method2743();
                } else if (this.field990 == 1536) {
                    var6.method2743();
                }
                class137[] var7 = new class137[] { var3, var6 };
                var3 = new class137(var7, 2);
                if (this.field990 == 512) {
                    var6.method2743();
                } else if (this.field990 == 1024) {
                    var6.method2743();
                    var6.method2743();
                } else if (this.field990 == 1536) {
                    var6.method2743();
                    var6.method2743();
                    var6.method2743();
                }
                var6.method2721(this.field991 - this.field635, this.field614 - this.field618, this.field939 - this.field627);
            }
        }
        var3.field1711 = true;
        return var3;
    }

    @ObfuscatedName("bq.z(IIBI)V")
    public final void method1192(int arg0, int arg1, byte arg2) {
        if (this.field971 != -1 && class270.method4174(this.field971).field3556 == 1) {
            this.field971 = -1;
        }
        this.field960 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1193(arg0, arg1);
        } else if (this.field994[0] >= 0 && this.field994[0] < 104 && this.field969[0] >= 0 && this.field969[0] < 104) {
            if (arg2 == 2) {
                class76 var4 = this;
                int var5 = this.field994[0];
                int var6 = this.field969[0];
                int var7 = this.method1190();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method1190();
                    client.field920.field2126 = arg0;
                    client.field920.field2124 = arg1;
                    client.field920.field2123 = 1;
                    client.field920.field2128 = 1;
                    class75 var9 = client.field920;
                    class75 var10 = var9;
                    class182 var11 = client.field832[this.field628];
                    int[] var12 = client.field921;
                    int[] var13 = client.field922;
                    int var14 = 0;
                    label570: while (true) {
                        if (var14 >= 128) {
                            boolean var31;
                            if (var8 == 1) {
                                int var16 = var5;
                                int var17 = var6;
                                byte var18 = 64;
                                byte var19 = 64;
                                int var20 = var5 - var18;
                                int var21 = var6 - var19;
                                class183.field2112[var18][var19] = 99;
                                class183.field2115[var18][var19] = 0;
                                byte var22 = 0;
                                int var23 = 0;
                                class183.field2119[var22] = var5;
                                int var80 = var22 + 1;
                                class183.field2120[var22] = var6;
                                int[][] var24 = var11.field2108;
                                boolean var29;
                                while (true) {
                                    if (var80 == var23) {
                                        Statics.field2116 = var16;
                                        Statics.field2122 = var17;
                                        var29 = false;
                                        break;
                                    }
                                    var16 = class183.field2119[var23];
                                    var17 = class183.field2120[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    int var25 = var16 - var20;
                                    int var26 = var17 - var21;
                                    int var27 = var16 - var11.field2104;
                                    int var28 = var17 - var11.field2105;
                                    if (var10.method1177(1, var16, var17, var11)) {
                                        Statics.field2116 = var16;
                                        Statics.field2122 = var17;
                                        var29 = true;
                                        break;
                                    }
                                    int var30 = class183.field2115[var25][var26] + 1;
                                    if (var25 > 0 && class183.field2112[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0) {
                                        class183.field2119[var80] = var16 - 1;
                                        class183.field2120[var80] = var17;
                                        var80 = var80 + 1 & 0xFFF;
                                        class183.field2112[var25 - 1][var26] = 2;
                                        class183.field2115[var25 - 1][var26] = var30;
                                    }
                                    if (var25 < 127 && class183.field2112[var25 + 1][var26] == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0) {
                                        class183.field2119[var80] = var16 + 1;
                                        class183.field2120[var80] = var17;
                                        var80 = var80 + 1 & 0xFFF;
                                        class183.field2112[var25 + 1][var26] = 8;
                                        class183.field2115[var25 + 1][var26] = var30;
                                    }
                                    if (var26 > 0 && class183.field2112[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class183.field2119[var80] = var16;
                                        class183.field2120[var80] = var17 - 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class183.field2112[var25][var26 - 1] = 1;
                                        class183.field2115[var25][var26 - 1] = var30;
                                    }
                                    if (var26 < 127 && class183.field2112[var25][var26 + 1] == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class183.field2119[var80] = var16;
                                        class183.field2120[var80] = var17 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class183.field2112[var25][var26 + 1] = 4;
                                        class183.field2115[var25][var26 + 1] = var30;
                                    }
                                    if (var25 > 0 && var26 > 0 && class183.field2112[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class183.field2119[var80] = var16 - 1;
                                        class183.field2120[var80] = var17 - 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class183.field2112[var25 - 1][var26 - 1] = 3;
                                        class183.field2115[var25 - 1][var26 - 1] = var30;
                                    }
                                    if (var25 < 127 && var26 > 0 && class183.field2112[var25 + 1][var26 - 1] == 0 && (var24[var27 + 1][var28 - 1] & 0x1240183) == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class183.field2119[var80] = var16 + 1;
                                        class183.field2120[var80] = var17 - 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class183.field2112[var25 + 1][var26 - 1] = 9;
                                        class183.field2115[var25 + 1][var26 - 1] = var30;
                                    }
                                    if (var25 > 0 && var26 < 127 && class183.field2112[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var28 + 1] & 0x1240138) == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class183.field2119[var80] = var16 - 1;
                                        class183.field2120[var80] = var17 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class183.field2112[var25 - 1][var26 + 1] = 6;
                                        class183.field2115[var25 - 1][var26 + 1] = var30;
                                    }
                                    if (var25 < 127 && var26 < 127 && class183.field2112[var25 + 1][var26 + 1] == 0 && (var24[var27 + 1][var28 + 1] & 0x12401E0) == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class183.field2119[var80] = var16 + 1;
                                        class183.field2120[var80] = var17 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class183.field2112[var25 + 1][var26 + 1] = 12;
                                        class183.field2115[var25 + 1][var26 + 1] = var30;
                                    }
                                }
                                var31 = var29;
                            } else if (var8 == 2) {
                                var31 = class183.method3799(var5, var6, var9, var11);
                            } else {
                                int var32 = var5;
                                int var33 = var6;
                                byte var34 = 64;
                                byte var35 = 64;
                                int var36 = var5 - var34;
                                int var37 = var6 - var35;
                                class183.field2112[var34][var35] = 99;
                                class183.field2115[var34][var35] = 0;
                                byte var38 = 0;
                                int var39 = 0;
                                class183.field2119[var38] = var5;
                                int var81 = var38 + 1;
                                class183.field2120[var38] = var6;
                                int[][] var40 = var11.field2108;
                                boolean var45;
                                label548: while (true) {
                                    label546: while (true) {
                                        int var41;
                                        int var42;
                                        int var43;
                                        int var44;
                                        int var46;
                                        do {
                                            do {
                                                do {
                                                    label523: do {
                                                        if (var81 == var39) {
                                                            Statics.field2116 = var32;
                                                            Statics.field2122 = var33;
                                                            var45 = false;
                                                            break label548;
                                                        }
                                                        var32 = class183.field2119[var39];
                                                        var33 = class183.field2120[var39];
                                                        var39 = var39 + 1 & 0xFFF;
                                                        var41 = var32 - var36;
                                                        var42 = var33 - var37;
                                                        var43 = var32 - var11.field2104;
                                                        var44 = var33 - var11.field2105;
                                                        if (var10.method1177(var8, var32, var33, var11)) {
                                                            Statics.field2116 = var32;
                                                            Statics.field2122 = var33;
                                                            var45 = true;
                                                            break label548;
                                                        }
                                                        var46 = class183.field2115[var41][var42] + 1;
                                                        if (var41 > 0 && class183.field2112[var41 - 1][var42] == 0 && (var40[var43 - 1][var44] & 0x124010E) == 0 && (var40[var43 - 1][var8 + var44 - 1] & 0x1240138) == 0) {
                                                            int var47 = 1;
                                                            while (true) {
                                                                if (var47 >= var8 - 1) {
                                                                    class183.field2119[var81] = var32 - 1;
                                                                    class183.field2120[var81] = var33;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class183.field2112[var41 - 1][var42] = 2;
                                                                    class183.field2115[var41 - 1][var42] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 - 1][var44 + var47] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var47++;
                                                            }
                                                        }
                                                        if (var41 < 128 - var8 && class183.field2112[var41 + 1][var42] == 0 && (var40[var8 + var43][var44] & 0x1240183) == 0 && (var40[var8 + var43][var8 + var44 - 1] & 0x12401E0) == 0) {
                                                            int var48 = 1;
                                                            while (true) {
                                                                if (var48 >= var8 - 1) {
                                                                    class183.field2119[var81] = var32 + 1;
                                                                    class183.field2120[var81] = var33;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class183.field2112[var41 + 1][var42] = 8;
                                                                    class183.field2115[var41 + 1][var42] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var8 + var43][var44 + var48] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var48++;
                                                            }
                                                        }
                                                        if (var42 > 0 && class183.field2112[var41][var42 - 1] == 0 && (var40[var43][var44 - 1] & 0x124010E) == 0 && (var40[var8 + var43 - 1][var44 - 1] & 0x1240183) == 0) {
                                                            int var49 = 1;
                                                            while (true) {
                                                                if (var49 >= var8 - 1) {
                                                                    class183.field2119[var81] = var32;
                                                                    class183.field2120[var81] = var33 - 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class183.field2112[var41][var42 - 1] = 1;
                                                                    class183.field2115[var41][var42 - 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 + var49][var44 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var49++;
                                                            }
                                                        }
                                                        if (var42 < 128 - var8 && class183.field2112[var41][var42 + 1] == 0 && (var40[var43][var8 + var44] & 0x1240138) == 0 && (var40[var8 + var43 - 1][var8 + var44] & 0x12401E0) == 0) {
                                                            int var50 = 1;
                                                            while (true) {
                                                                if (var50 >= var8 - 1) {
                                                                    class183.field2119[var81] = var32;
                                                                    class183.field2120[var81] = var33 + 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class183.field2112[var41][var42 + 1] = 4;
                                                                    class183.field2115[var41][var42 + 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 + var50][var8 + var44] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var50++;
                                                            }
                                                        }
                                                        if (var41 > 0 && var42 > 0 && class183.field2112[var41 - 1][var42 - 1] == 0 && (var40[var43 - 1][var44 - 1] & 0x124010E) == 0) {
                                                            int var51 = 1;
                                                            while (true) {
                                                                if (var51 >= var8) {
                                                                    class183.field2119[var81] = var32 - 1;
                                                                    class183.field2120[var81] = var33 - 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class183.field2112[var41 - 1][var42 - 1] = 3;
                                                                    class183.field2115[var41 - 1][var42 - 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 - 1][var44 - 1 + var51] & 0x124013E) != 0 || (var40[var43 - 1 + var51][var44 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var51++;
                                                            }
                                                        }
                                                        if (var41 < 128 - var8 && var42 > 0 && class183.field2112[var41 + 1][var42 - 1] == 0 && (var40[var8 + var43][var44 - 1] & 0x1240183) == 0) {
                                                            int var52 = 1;
                                                            while (true) {
                                                                if (var52 >= var8) {
                                                                    class183.field2119[var81] = var32 + 1;
                                                                    class183.field2120[var81] = var33 - 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class183.field2112[var41 + 1][var42 - 1] = 9;
                                                                    class183.field2115[var41 + 1][var42 - 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var8 + var43][var44 - 1 + var52] & 0x12401E3) != 0 || (var40[var43 + var52][var44 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var52++;
                                                            }
                                                        }
                                                        if (var41 > 0 && var42 < 128 - var8 && class183.field2112[var41 - 1][var42 + 1] == 0 && (var40[var43 - 1][var8 + var44] & 0x1240138) == 0) {
                                                            for (int var53 = 1; var53 < var8; var53++) {
                                                                if ((var40[var43 - 1][var44 + var53] & 0x124013E) != 0 || (var40[var43 - 1 + var53][var8 + var44] & 0x12401F8) != 0) {
                                                                    continue label523;
                                                                }
                                                            }
                                                            class183.field2119[var81] = var32 - 1;
                                                            class183.field2120[var81] = var33 + 1;
                                                            var81 = var81 + 1 & 0xFFF;
                                                            class183.field2112[var41 - 1][var42 + 1] = 6;
                                                            class183.field2115[var41 - 1][var42 + 1] = var46;
                                                        }
                                                    } while (var41 >= 128 - var8);
                                                } while (var42 >= 128 - var8);
                                            } while (class183.field2112[var41 + 1][var42 + 1] != 0);
                                        } while ((var40[var8 + var43][var8 + var44] & 0x12401E0) != 0);
                                        for (int var54 = 1; var54 < var8; var54++) {
                                            if ((var40[var43 + var54][var8 + var44] & 0x12401F8) != 0 || (var40[var8 + var43][var44 + var54] & 0x12401E3) != 0) {
                                                continue label546;
                                            }
                                        }
                                        class183.field2119[var81] = var32 + 1;
                                        class183.field2120[var81] = var33 + 1;
                                        var81 = var81 + 1 & 0xFFF;
                                        class183.field2112[var41 + 1][var42 + 1] = 12;
                                        class183.field2115[var41 + 1][var42 + 1] = var46;
                                    }
                                }
                                var31 = var45;
                            }
                            int var73;
                            label611: {
                                int var55 = var5 - 64;
                                int var56 = var6 - 64;
                                int var57 = Statics.field2116;
                                int var58 = Statics.field2122;
                                if (!var31) {
                                    int var59 = Integer.MAX_VALUE;
                                    int var60 = Integer.MAX_VALUE;
                                    byte var61 = 10;
                                    int var62 = var10.field2126;
                                    int var63 = var10.field2124;
                                    int var64 = var10.field2123;
                                    int var65 = var10.field2128;
                                    for (int var66 = var62 - var61; var66 <= var61 + var62; var66++) {
                                        for (int var67 = var63 - var61; var67 <= var61 + var63; var67++) {
                                            int var68 = var66 - var55;
                                            int var69 = var67 - var56;
                                            if (var68 >= 0 && var69 >= 0 && var68 < 128 && var69 < 128 && class183.field2115[var68][var69] < 100) {
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
                                                if (var72 < var59 || var59 == var72 && class183.field2115[var68][var69] < var60) {
                                                    var59 = var72;
                                                    var60 = class183.field2115[var68][var69];
                                                    var57 = var66;
                                                    var58 = var67;
                                                }
                                            }
                                        }
                                    }
                                    if (var59 == Integer.MAX_VALUE) {
                                        var73 = -1;
                                        break label611;
                                    }
                                }
                                if (var5 == var57 && var6 == var58) {
                                    var73 = 0;
                                } else {
                                    byte var74 = 0;
                                    class183.field2119[var74] = var57;
                                    int var82 = var74 + 1;
                                    class183.field2120[var74] = var58;
                                    int var75;
                                    int var76 = var75 = class183.field2112[var57 - var55][var58 - var56];
                                    while (var5 != var57 || var6 != var58) {
                                        if (var75 != var76) {
                                            var75 = var76;
                                            class183.field2119[var82] = var57;
                                            class183.field2120[var82++] = var58;
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
                                        var76 = class183.field2112[var57 - var55][var58 - var56];
                                    }
                                    int var77 = 0;
                                    while (var82-- > 0) {
                                        var12[var77] = class183.field2119[var82];
                                        var13[var77++] = class183.field2120[var82];
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
                                    break label570;
                                }
                                var4.method1194(client.field921[var79], client.field922[var79], (byte) 2);
                                var79++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class183.field2112[var14][var15] = 0;
                            class183.field2115[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method1194(arg0, arg1, arg2);
        } else {
            this.method1193(arg0, arg1);
        }
    }

    @ObfuscatedName("bq.u(III)V")
    public void method1193(int arg0, int arg1) {
        this.field986 = 0;
        this.field997 = 0;
        this.field964 = 0;
        this.field994[0] = arg0;
        this.field969[0] = arg1;
        int var3 = this.method1190();
        this.field991 = this.field994[0] * 128 + var3 * 64;
        this.field939 = this.field969[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bq.e(IIBI)V")
    public final void method1194(int arg0, int arg1, byte arg2) {
        if (this.field986 < 9) {
            this.field986++;
        }
        for (int var4 = this.field986; var4 > 0; var4--) {
            this.field994[var4] = this.field994[var4 - 1];
            this.field969[var4] = this.field969[var4 - 1];
            this.field996[var4] = this.field996[var4 - 1];
        }
        this.field994[0] = arg0;
        this.field969[0] = arg1;
        this.field996[0] = arg2;
    }

    @ObfuscatedName("bq.m(I)Z")
    public final boolean method1195() {
        return this.field622 != null;
    }
}
