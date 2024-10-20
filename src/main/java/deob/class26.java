package deob;

import java.awt.Graphics;

@ObfuscatedName("z")
public class class26 {

    @ObfuscatedName("z.q")
    public static int[] field634 = new int[256];

    @ObfuscatedName("z.c")
    public static int field635 = 0;

    @ObfuscatedName("z.b")
    public static int field636 = 0;

    @ObfuscatedName("z.e")
    public static int field639 = 0;

    @ObfuscatedName("z.z")
    public static int field640 = 0;

    @ObfuscatedName("z.az")
    public static int field659 = 0;

    @ObfuscatedName("z.av")
    public static int field642 = 0;

    @ObfuscatedName("z.ay")
    public static int field657 = 10;

    @ObfuscatedName("z.ah")
    public static String field644 = "";

    @ObfuscatedName("z.ao")
    public static int field650 = 0;

    @ObfuscatedName("z.aj")
    public static String field646 = "";

    @ObfuscatedName("z.ad")
    public static String field647 = "";

    @ObfuscatedName("z.ai")
    public static String field648 = "";

    @ObfuscatedName("z.af")
    public static String field643 = "";

    @ObfuscatedName("z.am")
    public static String field652 = "";

    @ObfuscatedName("z.aq")
    public static int field651 = 0;

    @ObfuscatedName("z.ar")
    public static String field641 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("z.au")
    public static boolean field653 = false;

    @ObfuscatedName("z.ax")
    public static int field645 = 0;

    @ObfuscatedName("z.bw")
    public static int[] field655 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("z.ba")
    public static int[] field656 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("z.bk")
    public static int field649 = -1;

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eb.m(Ldq;I)V")
    public static void method2671(class128 arg0) {
        if (field653) {
            method507(arg0);
            return;
        }
        if ((class124.field1972 == 1 || !Statics.field1067 && class124.field1972 == 4) && class124.field1976 >= 715 && class124.field1977 >= 453) {
            Statics.field1858.field146 = !Statics.field1858.field146;
            class9.method165();
            if (Statics.field1858.field146) {
                class157.method515();
            } else {
                class143 var1 = Statics.field1996;
                int var2 = var1.method2757("scape main");
                int var3 = var1.method2715(var2, "");
                class157.method1866(var1, var2, var3, 255, false);
            }
        }
        if (client.field257 == 5) {
            return;
        }
        field659++;
        if (client.field257 != 10) {
            return;
        }
        if (client.field256 == 0) {
            if (class124.field1972 == 1 || !Statics.field1067 && class124.field1972 == 4) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class124.field1976 >= var4 && class124.field1976 <= var4 + var6 && class124.field1977 >= var5 && class124.field1977 <= var5 + var7) {
                    Statics.method2397();
                    return;
                }
            }
            if (Statics.field194 != null) {
                Statics.method2397();
            }
        }
        int var8 = class124.field1972;
        int var9 = class124.field1976;
        int var10 = class124.field1977;
        if (!Statics.field1067 && var8 == 4) {
            var8 = 1;
        }
        if (field650 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                field650 = 3;
                field651 = 0;
            }
            short var13 = 462;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field250 & 0x4) != 0) {
                    if ((client.field250 & 0x400) == 0) {
                        field646 = class139.field2325;
                        field647 = class139.field2233;
                        field648 = class139.field2327;
                    } else {
                        field646 = class139.field2139;
                        field647 = class139.field2247;
                        field648 = class139.field2314;
                    }
                    field650 = 1;
                    field651 = 0;
                } else if ((client.field250 & 0x400) == 0) {
                    field646 = class139.field2321;
                    field647 = class139.field2201;
                    field648 = class139.field2323;
                    field650 = 2;
                    field651 = 0;
                } else {
                    field646 = class139.field2328;
                    field647 = class139.field2202;
                    field648 = class139.field2330;
                    field650 = 1;
                    field651 = 0;
                }
            }
        } else if (field650 == 1) {
            while (class121.method1961()) {
                if (Statics.field1632 == 84) {
                    field646 = class139.field2321;
                    field647 = class139.field2201;
                    field648 = class139.field2323;
                    field650 = 2;
                    field651 = 0;
                } else if (Statics.field1632 == 13) {
                    field650 = 0;
                }
            }
            short var14 = 302;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field646 = class139.field2321;
                field647 = class139.field2201;
                field648 = class139.field2323;
                field650 = 2;
                field651 = 0;
            }
            short var16 = 462;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                field650 = 0;
            }
        } else if (field650 == 2) {
            short var17 = 231;
            int var25 = var17 + 30;
            if (var8 == 1 && var10 >= var25 - 15 && var10 < var25) {
                field651 = 0;
            }
            var25 += 15;
            if (var8 == 1 && var10 >= var25 - 15 && var10 < var25) {
                field651 = 1;
            }
            var25 += 15;
            short var18 = 302;
            short var19 = 321;
            if (var8 == 1 && var9 >= var18 - 75 && var9 <= var18 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                field643 = field643.trim();
                if (field643.length() == 0) {
                    method2611(class139.field2256, class139.field2246, class139.field2317);
                    return;
                }
                if (field652.length() == 0) {
                    method2611(class139.field2236, class139.field2237, class139.field2238);
                    return;
                }
                method2611(class139.field2334, class139.field2335, class139.field2336);
                client.method138(20);
                return;
            }
            short var20 = 462;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var19 - 20 && var10 <= var19 + 20) {
                field650 = 0;
                field643 = "";
                field652 = "";
            }
            while (true) {
                while (class121.method1961()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field641.length(); var22++) {
                        if (Statics.field1621 == field641.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (Statics.field1632 == 13) {
                        field650 = 0;
                        field643 = "";
                        field652 = "";
                    } else if (field651 == 0) {
                        if (Statics.field1632 == 85 && field643.length() > 0) {
                            field643 = field643.substring(0, field643.length() - 1);
                        }
                        if (Statics.field1632 == 84 || Statics.field1632 == 80) {
                            field651 = 1;
                        }
                        if (var21 && field643.length() < 320) {
                            field643 = field643 + Statics.field1621;
                        }
                    } else if (field651 == 1) {
                        if (Statics.field1632 == 85 && field652.length() > 0) {
                            field652 = field652.substring(0, field652.length() - 1);
                        }
                        if (Statics.field1632 == 84 || Statics.field1632 == 80) {
                            field651 = 0;
                        }
                        if (Statics.field1632 == 84) {
                            field643 = field643.trim();
                            if (field643.length() == 0) {
                                method2611(class139.field2256, class139.field2246, class139.field2317);
                                return;
                            }
                            if (field652.length() == 0) {
                                method2611(class139.field2236, class139.field2237, class139.field2238);
                                return;
                            }
                            method2611(class139.field2334, class139.field2335, class139.field2336);
                            client.method138(20);
                            return;
                        }
                        if (var21 && field652.length() < 20) {
                            field652 = field652 + Statics.field1621;
                        }
                    }
                }
                return;
            }
        } else if (field650 == 3) {
            short var23 = 382;
            short var24 = 321;
            if (var8 == 1 && var9 >= var23 - 75 && var9 <= var23 + 75 && var10 >= var24 - 20 && var10 <= var24 + 20) {
                field650 = 0;
            }
        }
    }

    @ObfuscatedName("ai.k(Lgj;Lgj;I)V")
    public static void method668(class183 arg0, class183 arg1) {
        if (field653) {
            if (Statics.field1087 == null) {
                Statics.field1087 = class67.method2948(Statics.field56, "sl_back", "");
            }
            if (Statics.field1036 == null) {
                Statics.field1036 = class67.method24(Statics.field56, "sl_flags", "");
            }
            if (Statics.field545 == null) {
                Statics.field545 = class67.method24(Statics.field56, "sl_arrows", "");
            }
            if (Statics.field137 == null) {
                Statics.field137 = class67.method24(Statics.field56, "sl_stars", "");
            }
            class70.method1495(0, 23, 765, 480, 0);
            class70.method1506(0, 0, 125, 23, 12425273, 9135624);
            class70.method1506(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3271(class139.field2311, 62, 15, 0, -1);
            if (Statics.field137 != null) {
                Statics.field137[1].method1552(140, 1);
                arg1.method3277(class139.field2287, 152, 10, 16777215, -1);
                Statics.field137[0].method1552(140, 12);
                arg1.method3277(class139.field2351, 152, 21, 16777215, -1);
            }
            if (Statics.field545 != null) {
                short var2 = 280;
                if (field655[0] == 0 && field656[0] == 0) {
                    Statics.field545[2].method1552(var2, 4);
                } else {
                    Statics.field545[0].method1552(var2, 4);
                }
                if (field655[0] == 0 && field656[0] == 1) {
                    Statics.field545[3].method1552(var2 + 15, 4);
                } else {
                    Statics.field545[1].method1552(var2 + 15, 4);
                }
                arg0.method3277(class139.field2352, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field655[0] == 1 && field656[0] == 0) {
                    Statics.field545[2].method1552(var3, 4);
                } else {
                    Statics.field545[0].method1552(var3, 4);
                }
                if (field655[0] == 1 && field656[0] == 1) {
                    Statics.field545[3].method1552(var3 + 15, 4);
                } else {
                    Statics.field545[1].method1552(var3 + 15, 4);
                }
                arg0.method3277(class139.field2353, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field655[0] == 2 && field656[0] == 0) {
                    Statics.field545[2].method1552(var4, 4);
                } else {
                    Statics.field545[0].method1552(var4, 4);
                }
                if (field655[0] == 2 && field656[0] == 1) {
                    Statics.field545[3].method1552(var4 + 15, 4);
                } else {
                    Statics.field545[1].method1552(var4 + 15, 4);
                }
                arg0.method3277(class139.field2354, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field655[0] == 3 && field656[0] == 0) {
                    Statics.field545[2].method1552(var5, 4);
                } else {
                    Statics.field545[0].method1552(var5, 4);
                }
                if (field655[0] == 3 && field656[0] == 1) {
                    Statics.field545[3].method1552(var5 + 15, 4);
                } else {
                    Statics.field545[1].method1552(var5 + 15, 4);
                }
                arg0.method3277(class139.field2355, var5 + 32, 17, 16777215, -1);
            }
            class70.method1495(708, 4, 50, 16, 0);
            arg1.method3271(class139.field2190, 733, 16, 16777215, -1);
            field649 = -1;
            if (Statics.field1087 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field645) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field645) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field645) {
                        var9--;
                    }
                } while (var9 != var10 || var8 != var11);
                int var12 = (765 - var6 * var8) / (var8 + 1);
                if (var12 > 5) {
                    var12 = 5;
                }
                int var13 = (480 - var7 * var9) / (var9 + 1);
                if (var13 > 5) {
                    var13 = 5;
                }
                int var14 = (765 - var6 * var8 - (var8 - 1) * var12) / 2;
                int var15 = (480 - var7 * var9 - (var9 - 1) * var13) / 2;
                int var16 = var15 + 23;
                int var17 = var14;
                int var18 = 0;
                boolean var19 = false;
                for (int var20 = 0; var20 < field645; var20++) {
                    class21 var21 = Statics.field515[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field568);
                    if (var21.field568 == -1) {
                        var23 = class139.field2356;
                        var22 = false;
                    } else if (var21.field568 > 1980) {
                        var23 = class139.field2332;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method505()) {
                        if (var21.method501()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method501()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class124.field1969 >= var17 && class124.field1970 >= var16 && class124.field1969 < var6 + var17 && class124.field1970 < var7 + var16 && var22) {
                        field649 = var20;
                        Statics.field1087[var24].method1410(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field1087[var24].method1404(var17, var16);
                    }
                    if (Statics.field1036 != null) {
                        Statics.field1036[(var21.method501() ? 8 : 0) + var21.field574].method1552(var17 + 29, var16);
                    }
                    arg0.method3271(Integer.toString(var21.field577), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3271(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3327(Statics.field515[field649].field570) + 6;
                    int var26 = arg1.field2862 + 8;
                    class70.method1495(class124.field1969 - var25 / 2, class124.field1970 + 20 + 5, var25, var26, 16777120);
                    class70.method1549(class124.field1969 - var25 / 2, class124.field1970 + 20 + 5, var25, var26, 0);
                    arg1.method3271(Statics.field515[field649].field570, class124.field1969, class124.field1970 + 20 + 5 + arg1.field2862 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field591.getGraphics();
                Statics.field2608.method1325(var27, 0, 0);
            } catch (Exception var84) {
                Statics.field591.repaint();
            }
            return;
        }
        if (client.field257 == 0 || client.field257 == 5) {
            byte var29 = 20;
            arg0.method3271(class139.field2295, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class70.method1549(230, var30, 304, 34, 9179409);
            class70.method1549(231, var30 + 1, 302, 32, 0);
            class70.method1495(232, var30 + 2, field657 * 3, 30, 9179409);
            class70.method1495(field657 * 3 + 232, var30 + 2, 300 - field657 * 3, 30, 0);
            arg0.method3271(field644, 382, 276 - var29, 16777215, -1);
        }
        if (client.field257 == 20) {
            Statics.field654.method1552(382 - Statics.field654.field1285 / 2, 271 - Statics.field654.field1288 / 2);
            short var31 = 211;
            arg0.method3271(field646, 382, var31, 16776960, 0);
            int var86 = var31 + 15;
            arg0.method3271(field647, 382, var86, 16776960, 0);
            int var87 = var86 + 15;
            arg0.method3271(field648, 382, var87, 16776960, 0);
            int var88 = var87 + 15;
            int var89 = var88 + 10;
            arg0.method3277(class139.field2337, 272, var89, 16777215, 0);
            short var32 = 200;
            String var33;
            for (var33 = field643; arg0.method3327(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
            }
            arg0.method3277(class182.method3268(var33), 312, var89, 16777215, 0);
            var86 = var89 + 15;
            arg0.method3277(class139.field2338 + class189.method3237(field652), 274, var86, 16777215, 0);
            var86 += 15;
        }
        if (client.field257 == 10) {
            Statics.field654.method1552(202, 171);
            if (field650 == 0) {
                short var34 = 251;
                arg0.method3271(class139.field2329, 382, var34, 16776960, 0);
                int var90 = var34 + 30;
                short var35 = 302;
                short var36 = 291;
                Statics.field628.method1552(var35 - 73, var36 - 20);
                arg0.method3272(class139.field2340, var35 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var37 = 462;
                Statics.field628.method1552(var37 - 73, var36 - 20);
                arg0.method3272(class139.field2341, var37 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field650 == 1) {
                arg0.method3271(class139.field2226, 382, 211, 16776960, 0);
                short var38 = 236;
                arg0.method3271(field646, 382, var38, 16777215, 0);
                int var91 = var38 + 15;
                arg0.method3271(field647, 382, var91, 16777215, 0);
                int var92 = var91 + 15;
                arg0.method3271(field648, 382, var92, 16777215, 0);
                int var93 = var92 + 15;
                short var39 = 302;
                short var40 = 321;
                Statics.field628.method1552(var39 - 73, var40 - 20);
                arg0.method3271(class139.field2127, var39, var40 + 5, 16777215, 0);
                short var41 = 462;
                Statics.field628.method1552(var41 - 73, var40 - 20);
                arg0.method3271(class139.field2190, var41, var40 + 5, 16777215, 0);
            } else if (field650 == 2) {
                short var42 = 211;
                arg0.method3271(field646, 382, var42, 16776960, 0);
                int var94 = var42 + 15;
                arg0.method3271(field647, 382, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg0.method3271(field648, 382, var95, 16776960, 0);
                int var96 = var95 + 15;
                int var97 = var96 + 10;
                arg0.method3277(class139.field2337, 272, var97, 16777215, 0);
                short var43 = 200;
                String var44;
                for (var44 = field643; arg0.method3327(var44) > var43; var44 = var44.substring(1)) {
                }
                arg0.method3277(class182.method3268(var44) + (field651 == 0 & client.field463 % 40 < 20 ? class2.method1581(16776960) + class2.field24 : ""), 312, var97, 16777215, 0);
                var94 = var97 + 15;
                arg0.method3277(class139.field2338 + class189.method3237(field652) + (field651 == 1 & client.field463 % 40 < 20 ? class2.method1581(16776960) + class2.field24 : ""), 274, var94, 16777215, 0);
                var94 += 15;
                short var45 = 302;
                short var46 = 321;
                Statics.field628.method1552(var45 - 73, var46 - 20);
                arg0.method3271(class139.field2342, var45, var46 + 5, 16777215, 0);
                short var47 = 462;
                Statics.field628.method1552(var47 - 73, var46 - 20);
                arg0.method3271(class139.field2190, var47, var46 + 5, 16777215, 0);
            } else if (field650 == 3) {
                arg0.method3271(class139.field2344, 382, 211, 16776960, 0);
                short var48 = 236;
                arg0.method3271(class139.field2135, 382, var48, 16777215, 0);
                int var98 = var48 + 15;
                arg0.method3271(class139.field2273, 382, var98, 16777215, 0);
                int var99 = var98 + 15;
                arg0.method3271(class139.field2200, 382, var99, 16777215, 0);
                int var100 = var99 + 15;
                arg0.method3271(class139.field2348, 382, var100, 16777215, 0);
                int var101 = var100 + 15;
                short var49 = 382;
                short var50 = 321;
                Statics.field628.method1552(var49 - 73, var50 - 20);
                arg0.method3271(class139.field2190, var49, var50 + 5, 16777215, 0);
            }
        }
        if (field659 > 0) {
            int var51 = field659;
            short var52 = 256;
            field639 += var51 * 128;
            if (field639 > Statics.field921.length) {
                field639 -= Statics.field921.length;
                int var53 = (int) (Math.random() * 12.0D);
                method1291(Statics.field2609[var53]);
            }
            int var54 = 0;
            int var55 = var51 * 128;
            int var56 = (var52 - var51) * 128;
            for (int var57 = 0; var57 < var56; var57++) {
                int var58 = Statics.field638[var54 + var55] - Statics.field921[field639 + var54 & Statics.field921.length - 1] * var51 / 6;
                if (var58 < 0) {
                    var58 = 0;
                }
                Statics.field638[var54++] = var58;
            }
            for (int var59 = var52 - var51; var59 < var52; var59++) {
                int var60 = var59 * 128;
                for (int var61 = 0; var61 < 128; var61++) {
                    int var62 = (int) (Math.random() * 100.0D);
                    if (var62 < 50 && var61 > 10 && var61 < 118) {
                        Statics.field638[var60 + var61] = 255;
                    } else {
                        Statics.field638[var60 + var61] = 0;
                    }
                }
            }
            if (field635 > 0) {
                field635 -= var51 * 4;
            }
            if (field636 > 0) {
                field636 -= var51 * 4;
            }
            if (field635 == 0 && field636 == 0) {
                int var63 = (int) (Math.random() * (double) (2000 / var51));
                if (var63 == 0) {
                    field635 = 1024;
                }
                if (var63 == 1) {
                    field636 = 1024;
                }
            }
            for (int var64 = 0; var64 < var52 - var51; var64++) {
                field634[var64] = field634[var51 + var64];
            }
            for (int var65 = var52 - var51; var65 < var52; var65++) {
                field634[var65] = (int) (Math.sin((double) field642 / 14.0D) * 16.0D + Math.sin((double) field642 / 15.0D) * 14.0D + Math.sin((double) field642 / 16.0D) * 12.0D);
                field642++;
            }
            field640 += var51 * 1303431699;
            int var66 = ((client.field463 & 0x1) + var51) / 2;
            if (var66 > 0) {
                for (int var67 = 0; var67 < field640 * -1871164788; var67++) {
                    int var68 = (int) (Math.random() * 124.0D) + 2;
                    int var69 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field638[(var69 << 7) + var68] = 192;
                }
                field640 = 0;
                int var70 = 0;
                label389: while (true) {
                    if (var70 >= var52) {
                        int var74 = 0;
                        while (true) {
                            if (var74 >= 128) {
                                break label389;
                            }
                            int var75 = 0;
                            for (int var76 = -var66; var76 < var52; var76++) {
                                int var77 = var76 * 128;
                                if (var66 + var76 < var52) {
                                    var75 += Statics.field2817[var66 * 128 + var74 + var77];
                                }
                                if (var76 - (var66 + 1) >= 0) {
                                    var75 -= Statics.field2817[var74 + var77 - (var66 + 1) * 128];
                                }
                                if (var76 >= 0) {
                                    Statics.field638[var74 + var77] = var75 / (var66 * 2 + 1);
                                }
                            }
                            var74++;
                        }
                    }
                    int var71 = 0;
                    int var72 = var70 * 128;
                    for (int var73 = -var66; var73 < 128; var73++) {
                        if (var66 + var73 < 128) {
                            var71 += Statics.field638[var72 + var73 + var66];
                        }
                        if (var73 - (var66 + 1) >= 0) {
                            var71 -= Statics.field638[var72 + var73 - (var66 + 1)];
                        }
                        if (var73 >= 0) {
                            Statics.field2817[var72 + var73] = var71 / (var66 * 2 + 1);
                        }
                    }
                    var70++;
                }
            }
            field659 = 0;
        }
        method2296();
        Statics.field153[Statics.field1858.field146 ? 1 : 0].method1552(725, 463);
        if (client.field257 > 5 && client.field256 == 0) {
            if (Statics.field1386 == null) {
                Statics.field1386 = class67.method767(Statics.field56, "sl_button", "");
            } else {
                byte var78 = 5;
                short var79 = 463;
                byte var80 = 100;
                byte var81 = 35;
                Statics.field1386.method1552(var78, var79);
                arg0.method3271(class139.field2275 + " " + client.field249, var80 / 2 + var78, var81 / 2 + var79 - 2, 16777215, 0);
                if (Statics.field194 == null) {
                    arg1.method3271(class139.field2359, var80 / 2 + var78, var81 / 2 + var79 + 12, 16777215, 0);
                } else {
                    arg1.method3271(class139.field2305, var80 / 2 + var78, var81 / 2 + var79 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var82 = Statics.field591.getGraphics();
            Statics.field2608.method1325(var82, 0, 0);
        } catch (Exception var85) {
            Statics.field591.repaint();
        }
    }

    @ObfuscatedName("dq.y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2611(String arg0, String arg1, String arg2) {
        field646 = arg0;
        field647 = arg1;
        field648 = arg2;
    }

    @ObfuscatedName("bp.g(Lbu;B)V")
    public static final void method1291(class71 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field921.length; var2++) {
            Statics.field921[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field921[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field637[var8] = (Statics.field921[var8 - 1] + Statics.field921[var8 + 1] + Statics.field921[var8 - 128] + Statics.field921[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field921;
            Statics.field921 = Statics.field637;
            Statics.field637 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1288; var11++) {
            for (int var12 = 0; var12 < arg0.field1285; var12++) {
                if (arg0.field1286[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1287;
                    int var14 = var11 + 16 + arg0.field1283;
                    int var15 = (var14 << 7) + var13;
                    Statics.field921[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ej.r(IIII)I")
    public static final int method2949(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("cb.i(B)V")
    public static final void method2296() {
        short var0 = 256;
        if (field635 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field635 > 768) {
                    Statics.field135[var1] = method2949(Statics.field1483[var1], Statics.field685[var1], 1024 - field635);
                } else if (field635 > 256) {
                    Statics.field135[var1] = Statics.field685[var1];
                } else {
                    Statics.field135[var1] = method2949(Statics.field685[var1], Statics.field1483[var1], 256 - field635);
                }
            }
        } else if (field636 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field636 > 768) {
                    Statics.field135[var2] = method2949(Statics.field1483[var2], Statics.field187[var2], 1024 - field636);
                } else if (field636 > 256) {
                    Statics.field135[var2] = Statics.field187[var2];
                } else {
                    Statics.field135[var2] = method2949(Statics.field187[var2], Statics.field1483[var2], 256 - field636);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field135[var3] = Statics.field1483[var3];
            }
        }
        class70.method1488(0, 9, 128, var0 + 7);
        Statics.field2905.method1404(0, 0);
        class70.method1536();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field634[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field638[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field135[var10];
                    int var14 = Statics.field2608.field1258[var5];
                    Statics.field2608.field1258[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class70.method1488(637, 9, 765, var0 + 7);
        Statics.field630.method1404(382, 0);
        class70.method1536();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field634[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field638[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field135[var22];
                    int var26 = Statics.field2608.field1258[var20];
                    Statics.field2608.field1258[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("s.f(Ldq;I)V")
    public static void method507(class128 arg0) {
        if (class124.field1972 != 1 && Statics.field1067 || class124.field1972 != 4) {
            return;
        }
        short var1 = 280;
        if (class124.field1976 >= var1 && class124.field1976 <= var1 + 14 && class124.field1977 >= 4 && class124.field1977 <= 18) {
            method512(0, 0);
            return;
        }
        if (class124.field1976 >= var1 + 15 && class124.field1976 <= var1 + 80 && class124.field1977 >= 4 && class124.field1977 <= 18) {
            method512(0, 1);
            return;
        }
        short var2 = 390;
        if (class124.field1976 >= var2 && class124.field1976 <= var2 + 14 && class124.field1977 >= 4 && class124.field1977 <= 18) {
            method512(1, 0);
            return;
        }
        if (class124.field1976 >= var2 + 15 && class124.field1976 <= var2 + 80 && class124.field1977 >= 4 && class124.field1977 <= 18) {
            method512(1, 1);
            return;
        }
        short var3 = 500;
        if (class124.field1976 >= var3 && class124.field1976 <= var3 + 14 && class124.field1977 >= 4 && class124.field1977 <= 18) {
            method512(2, 0);
            return;
        }
        if (class124.field1976 >= var3 + 15 && class124.field1976 <= var3 + 80 && class124.field1977 >= 4 && class124.field1977 <= 18) {
            method512(2, 1);
            return;
        }
        short var4 = 610;
        if (class124.field1976 >= var4 && class124.field1976 <= var4 + 14 && class124.field1977 >= 4 && class124.field1977 <= 18) {
            method512(3, 0);
            return;
        }
        if (class124.field1976 >= var4 + 15 && class124.field1976 <= var4 + 80 && class124.field1977 >= 4 && class124.field1977 <= 18) {
            method512(3, 1);
            return;
        }
        if (class124.field1976 >= 708 && class124.field1977 >= 4 && class124.field1976 <= 758 && class124.field1977 <= 20) {
            field653 = false;
            Statics.field2905.method1404(0, 0);
            Statics.field630.method1404(382, 0);
            Statics.field2105.method1552(382 - Statics.field2105.field1285 / 2, 18);
            return;
        }
        if (field649 == -1) {
            return;
        }
        class21 var5 = Statics.field515[field649];
        method2066(var5);
        field653 = false;
        Statics.field2905.method1404(0, 0);
        Statics.field630.method1404(382, 0);
        Statics.field2105.method1552(382 - Statics.field2105.field1285 / 2, 18);
        return;
    }

    @ObfuscatedName("cf.a(Ls;I)V")
    public static void method2066(class21 arg0) {
        if (arg0.method501() != client.field254) {
            client.field254 = arg0.method501();
            class42.method868(arg0.method501());
        }
        Statics.field853 = arg0.field569;
        client.field249 = arg0.field577;
        client.field250 = arg0.field567;
        Statics.field1643 = client.field371 == 0 ? 43594 : arg0.field577 + 40000;
        Statics.field865 = client.field371 == 0 ? 443 : arg0.field577 + 50000;
        Statics.field528 = Statics.field1643;
    }

    @ObfuscatedName("h.u(III)V")
    public static void method512(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field655[var5] != arg0) {
                var2[var4] = field655[var5];
                var3[var4] = field656[var5];
                var4++;
            }
        }
        field655 = var2;
        field656 = var3;
        method2071(Statics.field515, 0, Statics.field515.length - 1, field655, field656);
    }

    @ObfuscatedName("cf.d([Ls;II[I[II)V")
    public static void method2071(class21[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class21 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field573;
                        var12 = var8.field573;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field568;
                        var12 = var8.field568;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method501() ? 1 : 0;
                        var12 = var8.method501() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field577;
                        var12 = var8.field577;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field573;
                        var16 = var8.field573;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field568;
                        var16 = var8.field568;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method501() ? 1 : 0;
                        var16 = var8.method501() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field577;
                        var16 = var8.field577;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class21 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2071(arg0, arg1, var6, arg3, arg4);
        method2071(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
