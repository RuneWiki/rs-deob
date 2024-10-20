package deob;

import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("s")
public class class26 {

    @ObfuscatedName("s.i")
    public static int[] field649 = new int[256];

    @ObfuscatedName("s.q")
    public static int field660 = 0;

    @ObfuscatedName("s.c")
    public static int field650 = 0;

    @ObfuscatedName("s.p")
    public static int field651 = 0;

    @ObfuscatedName("s.s")
    public static int field653 = 0;

    @ObfuscatedName("s.ag")
    public static int field670 = 0;

    @ObfuscatedName("s.ad")
    public static int field655 = 0;

    @ObfuscatedName("s.ak")
    public static int field656 = 10;

    @ObfuscatedName("s.ai")
    public static String field652 = "";

    @ObfuscatedName("s.ac")
    public static int field657 = 0;

    @ObfuscatedName("s.as")
    public static String field659 = "";

    @ObfuscatedName("s.ar")
    public static String field654 = "";

    @ObfuscatedName("s.an")
    public static String field661 = "";

    @ObfuscatedName("s.ah")
    public static String field662 = "";

    @ObfuscatedName("s.ax")
    public static String field663 = "";

    @ObfuscatedName("s.ae")
    public static int field664 = 0;

    @ObfuscatedName("s.ao")
    public static String field665 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("s.ap")
    public static boolean field666 = false;

    @ObfuscatedName("s.al")
    public static int field667 = 0;

    @ObfuscatedName("s.bp")
    public static int[] field642 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("s.bx")
    public static int[] field645 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("s.by")
    public static int field668 = -1;

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.z(Ldb;I)V")
    public static void method185(class128 arg0) {
        if (!field666) {
            if ((class124.field1992 == 1 || !Statics.field2015 && class124.field1992 == 4) && class124.field1993 >= 715 && class124.field1988 >= 453) {
                Statics.field156.field146 = !Statics.field156.field146;
                Statics.method1017();
                if (Statics.field156.field146) {
                    class157.method2917();
                } else {
                    class143 var6 = Statics.field1804;
                    int var7 = var6.method2760("scape main");
                    int var8 = var6.method2761(var7, "");
                    class157.method858(var6, var7, var8, 255, false);
                }
            }
            if (client.field268 != 5) {
                field670++;
                if (client.field268 == 10) {
                    if (client.field301 == 0) {
                        if (class124.field1992 == 1 || !Statics.field2015 && class124.field1992 == 4) {
                            byte var9 = 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class124.field1993 >= var9 && class124.field1993 <= var9 + var11 && class124.field1988 >= var10 && class124.field1988 <= var10 + var12) {
                                method2433();
                                return;
                            }
                        }
                        if (Statics.field956 != null) {
                            method2433();
                        }
                    }
                    int var13 = class124.field1992;
                    int var14 = class124.field1993;
                    int var15 = class124.field1988;
                    if (!Statics.field2015 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field657 == 0) {
                        short var16 = 302;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            field657 = 3;
                            field664 = 0;
                        }
                        short var18 = 462;
                        if (var13 == 1 && var14 >= var18 - 75 && var14 <= var18 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field261 & 0x4) != 0) {
                                if ((client.field261 & 0x400) == 0) {
                                    field659 = class139.field2332;
                                    field654 = class139.field2185;
                                    field661 = class139.field2162;
                                } else {
                                    field659 = class139.field2338;
                                    field654 = class139.field2339;
                                    field661 = class139.field2340;
                                }
                                field657 = 1;
                                field664 = 0;
                            } else if ((client.field261 & 0x400) == 0) {
                                field659 = class139.field2328;
                                field654 = class139.field2178;
                                field661 = class139.field2197;
                                field657 = 2;
                                field664 = 0;
                            } else {
                                field659 = class139.field2335;
                                field654 = class139.field2336;
                                field661 = class139.field2337;
                                field657 = 1;
                                field664 = 0;
                            }
                        }
                    } else if (field657 == 1) {
                        while (true) {
                            class121 var19 = class121.field1933;
                            boolean var20;
                            synchronized (class121.field1933) {
                                if (class121.field1957 == class121.field1955) {
                                    var20 = false;
                                } else {
                                    Statics.field1313 = class121.field1952[class121.field1955];
                                    Statics.field1927 = class121.field1951[class121.field1955];
                                    class121.field1955 = class121.field1955 + 1 & 0x7F;
                                    var20 = true;
                                }
                            }
                            if (!var20) {
                                short var22 = 302;
                                short var23 = 321;
                                if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var23 - 20 && var15 <= var23 + 20) {
                                    field659 = class139.field2328;
                                    field654 = class139.field2178;
                                    field661 = class139.field2197;
                                    field657 = 2;
                                    field664 = 0;
                                }
                                short var24 = 462;
                                if (var13 == 1 && var14 >= var24 - 75 && var14 <= var24 + 75 && var15 >= var23 - 20 && var15 <= var23 + 20) {
                                    field657 = 0;
                                }
                                break;
                            }
                            if (Statics.field1313 == 84) {
                                field659 = class139.field2328;
                                field654 = class139.field2178;
                                field661 = class139.field2197;
                                field657 = 2;
                                field664 = 0;
                            } else if (Statics.field1313 == 13) {
                                field657 = 0;
                            }
                        }
                    } else if (field657 == 2) {
                        short var25 = 231;
                        int var38 = var25 + 30;
                        if (var13 == 1 && var15 >= var38 - 15 && var15 < var38) {
                            field664 = 0;
                        }
                        var38 += 15;
                        if (var13 == 1 && var15 >= var38 - 15 && var15 < var38) {
                            field664 = 1;
                        }
                        var38 += 15;
                        short var26 = 302;
                        short var27 = 321;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field662 = field662.trim();
                            if (field662.length() == 0) {
                                method152(class139.field2240, class139.field2128, class139.field2346);
                                return;
                            }
                            if (field663.length() == 0) {
                                method152(class139.field2243, class139.field2244, class139.field2245);
                                return;
                            }
                            method152(class139.field2318, class139.field2342, class139.field2255);
                            client.method1889(20);
                            return;
                        }
                        short var28 = 462;
                        if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field657 = 0;
                            field662 = "";
                            field663 = "";
                        }
                        while (true) {
                            while (true) {
                                class121 var29 = class121.field1933;
                                boolean var30;
                                synchronized (class121.field1933) {
                                    if (class121.field1957 == class121.field1955) {
                                        var30 = false;
                                    } else {
                                        Statics.field1313 = class121.field1952[class121.field1955];
                                        Statics.field1927 = class121.field1951[class121.field1955];
                                        class121.field1955 = class121.field1955 + 1 & 0x7F;
                                        var30 = true;
                                    }
                                }
                                if (!var30) {
                                    return;
                                }
                                boolean var32 = false;
                                for (int var33 = 0; var33 < field665.length(); var33++) {
                                    if (Statics.field1927 == field665.charAt(var33)) {
                                        var32 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1313 == 13) {
                                    field657 = 0;
                                    field662 = "";
                                    field663 = "";
                                } else if (field664 == 0) {
                                    if (Statics.field1313 == 85 && field662.length() > 0) {
                                        field662 = field662.substring(0, field662.length() - 1);
                                    }
                                    if (Statics.field1313 == 84 || Statics.field1313 == 80) {
                                        field664 = 1;
                                    }
                                    if (var32 && field662.length() < 320) {
                                        field662 = field662 + Statics.field1927;
                                    }
                                } else if (field664 == 1) {
                                    if (Statics.field1313 == 85 && field663.length() > 0) {
                                        field663 = field663.substring(0, field663.length() - 1);
                                    }
                                    if (Statics.field1313 == 84 || Statics.field1313 == 80) {
                                        field664 = 0;
                                    }
                                    if (Statics.field1313 == 84) {
                                        field662 = field662.trim();
                                        if (field662.length() == 0) {
                                            method152(class139.field2240, class139.field2128, class139.field2346);
                                            return;
                                        }
                                        if (field663.length() == 0) {
                                            method152(class139.field2243, class139.field2244, class139.field2245);
                                            return;
                                        }
                                        method152(class139.field2318, class139.field2342, class139.field2255);
                                        client.method1889(20);
                                        return;
                                    }
                                    if (var32 && field663.length() < 20) {
                                        field663 = field663 + Statics.field1927;
                                    }
                                }
                            }
                        }
                    } else if (field657 == 3) {
                        short var34 = 382;
                        short var35 = 321;
                        if (var13 == 1 && var14 >= var34 - 75 && var14 <= var34 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            field657 = 0;
                        }
                    }
                }
            }
        } else if (class124.field1992 == 1 || !Statics.field2015 && class124.field1992 == 4) {
            short var1 = 280;
            if (class124.field1993 >= var1 && class124.field1993 <= var1 + 14 && class124.field1988 >= 4 && class124.field1988 <= 18) {
                method2411(0, 0);
            } else if (class124.field1993 >= var1 + 15 && class124.field1993 <= var1 + 80 && class124.field1988 >= 4 && class124.field1988 <= 18) {
                method2411(0, 1);
            } else {
                short var2 = 390;
                if (class124.field1993 >= var2 && class124.field1993 <= var2 + 14 && class124.field1988 >= 4 && class124.field1988 <= 18) {
                    method2411(1, 0);
                } else if (class124.field1993 >= var2 + 15 && class124.field1993 <= var2 + 80 && class124.field1988 >= 4 && class124.field1988 <= 18) {
                    method2411(1, 1);
                } else {
                    short var3 = 500;
                    if (class124.field1993 >= var3 && class124.field1993 <= var3 + 14 && class124.field1988 >= 4 && class124.field1988 <= 18) {
                        method2411(2, 0);
                    } else if (class124.field1993 >= var3 + 15 && class124.field1993 <= var3 + 80 && class124.field1988 >= 4 && class124.field1988 <= 18) {
                        method2411(2, 1);
                    } else {
                        short var4 = 610;
                        if (class124.field1993 >= var4 && class124.field1993 <= var4 + 14 && class124.field1988 >= 4 && class124.field1988 <= 18) {
                            method2411(3, 0);
                        } else if (class124.field1993 >= var4 + 15 && class124.field1993 <= var4 + 80 && class124.field1988 >= 4 && class124.field1988 <= 18) {
                            method2411(3, 1);
                        } else if (class124.field1993 >= 708 && class124.field1988 >= 4 && class124.field1993 <= 758 && class124.field1988 <= 20) {
                            field666 = false;
                            Statics.field644.method1509(0, 0);
                            Statics.field658.method1509(382, 0);
                            Statics.field671.method1583(382 - Statics.field671.field1287 / 2, 18);
                        } else if (field668 != -1) {
                            class21 var5 = Statics.field2822[field668];
                            method124(var5);
                            field666 = false;
                            Statics.field644.method1509(0, 0);
                            Statics.field658.method1509(382, 0);
                            Statics.field671.method1583(382 - Statics.field671.field1287 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.n(Lgs;Lgs;I)V")
    public static void method2446(class183 arg0, class183 arg1) {
        if (field666) {
            if (Statics.field967 == null) {
                Statics.field967 = class67.method639(Statics.field242, "sl_back", "");
            }
            if (Statics.field161 == null) {
                Statics.field161 = class67.method1310(Statics.field242, "sl_flags", "");
            }
            if (Statics.field2113 == null) {
                Statics.field2113 = class67.method1310(Statics.field242, "sl_arrows", "");
            }
            if (Statics.field610 == null) {
                Statics.field610 = class67.method1310(Statics.field242, "sl_stars", "");
            }
            class70.method1521(0, 23, 765, 480, 0);
            class70.method1522(0, 0, 125, 23, 12425273, 9135624);
            class70.method1522(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3318(class139.field2356, 62, 15, 0, -1);
            if (Statics.field610 != null) {
                Statics.field610[1].method1583(140, 1);
                arg1.method3354(class139.field2357, 152, 10, 16777215, -1);
                Statics.field610[0].method1583(140, 12);
                arg1.method3354(class139.field2358, 152, 21, 16777215, -1);
            }
            if (Statics.field2113 != null) {
                short var2 = 280;
                if (field642[0] == 0 && field645[0] == 0) {
                    Statics.field2113[2].method1583(var2, 4);
                } else {
                    Statics.field2113[0].method1583(var2, 4);
                }
                if (field642[0] == 0 && field645[0] == 1) {
                    Statics.field2113[3].method1583(var2 + 15, 4);
                } else {
                    Statics.field2113[1].method1583(var2 + 15, 4);
                }
                arg0.method3354(class139.field2359, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field642[0] == 1 && field645[0] == 0) {
                    Statics.field2113[2].method1583(var3, 4);
                } else {
                    Statics.field2113[0].method1583(var3, 4);
                }
                if (field642[0] == 1 && field645[0] == 1) {
                    Statics.field2113[3].method1583(var3 + 15, 4);
                } else {
                    Statics.field2113[1].method1583(var3 + 15, 4);
                }
                arg0.method3354(class139.field2360, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field642[0] == 2 && field645[0] == 0) {
                    Statics.field2113[2].method1583(var4, 4);
                } else {
                    Statics.field2113[0].method1583(var4, 4);
                }
                if (field642[0] == 2 && field645[0] == 1) {
                    Statics.field2113[3].method1583(var4 + 15, 4);
                } else {
                    Statics.field2113[1].method1583(var4 + 15, 4);
                }
                arg0.method3354(class139.field2361, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field642[0] == 3 && field645[0] == 0) {
                    Statics.field2113[2].method1583(var5, 4);
                } else {
                    Statics.field2113[0].method1583(var5, 4);
                }
                if (field642[0] == 3 && field645[0] == 1) {
                    Statics.field2113[3].method1583(var5 + 15, 4);
                } else {
                    Statics.field2113[1].method1583(var5 + 15, 4);
                }
                arg0.method3354(class139.field2362, var5 + 32, 17, 16777215, -1);
            }
            class70.method1521(708, 4, 50, 16, 0);
            arg1.method3318(class139.field2161, 733, 16, 16777215, -1);
            field668 = -1;
            if (Statics.field967 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field667) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field667) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field667) {
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
                for (int var20 = 0; var20 < field667; var20++) {
                    class21 var21 = Statics.field2822[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field584);
                    if (var21.field584 == -1) {
                        var23 = class139.field2290;
                        var22 = false;
                    } else if (var21.field584 > 1980) {
                        var23 = class139.field2329;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method530()) {
                        if (var21.method528()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method528()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class124.field1991 >= var17 && class124.field1986 >= var16 && class124.field1991 < var6 + var17 && class124.field1986 < var7 + var16 && var22) {
                        field668 = var20;
                        Statics.field967[var24].method1442(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field967[var24].method1509(var17, var16);
                    }
                    if (Statics.field161 != null) {
                        Statics.field161[(var21.method528() ? 8 : 0) + var21.field589].method1583(var17 + 29, var16);
                    }
                    arg0.method3318(Integer.toString(var21.field587), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3318(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3311(Statics.field2822[field668].field582) + 6;
                    int var26 = arg1.field2851 + 8;
                    class70.method1521(class124.field1991 - var25 / 2, class124.field1986 + 20 + 5, var25, var26, 16777120);
                    class70.method1523(class124.field1991 - var25 / 2, class124.field1986 + 20 + 5, var25, var26, 0);
                    arg1.method3318(Statics.field2822[field668].field582, class124.field1991, class124.field1986 + 20 + 5 + arg1.field2851 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field1915.getGraphics();
                Statics.field1913.method1347(var27, 0, 0);
            } catch (Exception var84) {
                Statics.field1915.repaint();
            }
            return;
        }
        if (client.field268 == 0 || client.field268 == 5) {
            byte var29 = 20;
            arg0.method3318(class139.field2154, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class70.method1523(230, var30, 304, 34, 9179409);
            class70.method1523(231, var30 + 1, 302, 32, 0);
            class70.method1521(232, var30 + 2, field656 * 3, 30, 9179409);
            class70.method1521(field656 * 3 + 232, var30 + 2, 300 - field656 * 3, 30, 0);
            arg0.method3318(field652, 382, 276 - var29, 16777215, -1);
        }
        if (client.field268 == 20) {
            Statics.field641.method1583(382 - Statics.field641.field1287 / 2, 271 - Statics.field641.field1288 / 2);
            short var31 = 211;
            arg0.method3318(field659, 382, var31, 16776960, 0);
            int var86 = var31 + 15;
            arg0.method3318(field654, 382, var86, 16776960, 0);
            int var87 = var86 + 15;
            arg0.method3318(field661, 382, var87, 16776960, 0);
            int var88 = var87 + 15;
            int var89 = var88 + 10;
            arg0.method3354(class139.field2344, 272, var89, 16777215, 0);
            short var32 = 200;
            String var33;
            for (var33 = field662; arg0.method3311(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
            }
            arg0.method3354(class182.method3315(var33), 312, var89, 16777215, 0);
            var86 = var89 + 15;
            arg0.method3354(class139.field2345 + class189.method1381(field663), 274, var86, 16777215, 0);
            var86 += 15;
        }
        if (client.field268 == 10) {
            Statics.field641.method1583(202, 171);
            if (field657 == 0) {
                short var34 = 251;
                arg0.method3318(class139.field2235, 382, var34, 16776960, 0);
                int var90 = var34 + 30;
                short var35 = 302;
                short var36 = 291;
                Statics.field1638.method1583(var35 - 73, var36 - 20);
                arg0.method3319(class139.field2347, var35 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var37 = 462;
                Statics.field1638.method1583(var37 - 73, var36 - 20);
                arg0.method3319(class139.field2348, var37 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field657 == 1) {
                arg0.method3318(class139.field2331, 382, 211, 16776960, 0);
                short var38 = 236;
                arg0.method3318(field659, 382, var38, 16777215, 0);
                int var91 = var38 + 15;
                arg0.method3318(field654, 382, var91, 16777215, 0);
                int var92 = var91 + 15;
                arg0.method3318(field661, 382, var92, 16777215, 0);
                int var93 = var92 + 15;
                short var39 = 302;
                short var40 = 321;
                Statics.field1638.method1583(var39 - 73, var40 - 20);
                arg0.method3318(class139.field2278, var39, var40 + 5, 16777215, 0);
                short var41 = 462;
                Statics.field1638.method1583(var41 - 73, var40 - 20);
                arg0.method3318(class139.field2161, var41, var40 + 5, 16777215, 0);
            } else if (field657 == 2) {
                short var42 = 211;
                arg0.method3318(field659, 382, var42, 16776960, 0);
                int var94 = var42 + 15;
                arg0.method3318(field654, 382, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg0.method3318(field661, 382, var95, 16776960, 0);
                int var96 = var95 + 15;
                int var97 = var96 + 10;
                arg0.method3354(class139.field2344, 272, var97, 16777215, 0);
                short var43 = 200;
                String var44;
                for (var44 = field662; arg0.method3311(var44) > var43; var44 = var44.substring(1)) {
                }
                arg0.method3354(class182.method3315(var44) + (field664 == 0 & client.field270 % 40 < 20 ? class2.method517(16776960) + class2.field18 : ""), 312, var97, 16777215, 0);
                var94 = var97 + 15;
                arg0.method3354(class139.field2345 + class189.method1381(field663) + (field664 == 1 & client.field270 % 40 < 20 ? class2.method517(16776960) + class2.field18 : ""), 274, var94, 16777215, 0);
                var94 += 15;
                short var45 = 302;
                short var46 = 321;
                Statics.field1638.method1583(var45 - 73, var46 - 20);
                arg0.method3318(class139.field2349, var45, var46 + 5, 16777215, 0);
                short var47 = 462;
                Statics.field1638.method1583(var47 - 73, var46 - 20);
                arg0.method3318(class139.field2161, var47, var46 + 5, 16777215, 0);
            } else if (field657 == 3) {
                arg0.method3318(class139.field2351, 382, 211, 16776960, 0);
                short var48 = 236;
                arg0.method3318(class139.field2281, 382, var48, 16777215, 0);
                int var98 = var48 + 15;
                arg0.method3318(class139.field2311, 382, var98, 16777215, 0);
                int var99 = var98 + 15;
                arg0.method3318(class139.field2354, 382, var99, 16777215, 0);
                int var100 = var99 + 15;
                arg0.method3318(class139.field2355, 382, var100, 16777215, 0);
                int var101 = var100 + 15;
                short var49 = 382;
                short var50 = 321;
                Statics.field1638.method1583(var49 - 73, var50 - 20);
                arg0.method3318(class139.field2161, var49, var50 + 5, 16777215, 0);
            }
        }
        if (field670 > 0) {
            int var51 = field670;
            short var52 = 256;
            field651 += var51 * 128;
            if (field651 > Statics.field2774.length) {
                field651 -= Statics.field2774.length;
                int var53 = (int) (Math.random() * 12.0D);
                method2448(Statics.field643[var53]);
            }
            int var54 = 0;
            int var55 = var51 * 128;
            int var56 = (var52 - var51) * 128;
            for (int var57 = 0; var57 < var56; var57++) {
                int var58 = Statics.field206[var54 + var55] - Statics.field2774[field651 + var54 & Statics.field2774.length - 1] * var51 / 6;
                if (var58 < 0) {
                    var58 = 0;
                }
                Statics.field206[var54++] = var58;
            }
            for (int var59 = var52 - var51; var59 < var52; var59++) {
                int var60 = var59 * 128;
                for (int var61 = 0; var61 < 128; var61++) {
                    int var62 = (int) (Math.random() * 100.0D);
                    if (var62 < 50 && var61 > 10 && var61 < 118) {
                        Statics.field206[var60 + var61] = 255;
                    } else {
                        Statics.field206[var60 + var61] = 0;
                    }
                }
            }
            if (field660 > 0) {
                field660 -= var51 * 4;
            }
            if (field650 > 0) {
                field650 -= var51 * 4;
            }
            if (field660 == 0 && field650 == 0) {
                int var63 = (int) (Math.random() * (double) (2000 / var51));
                if (var63 == 0) {
                    field660 = 1024;
                }
                if (var63 == 1) {
                    field650 = 1024;
                }
            }
            for (int var64 = 0; var64 < var52 - var51; var64++) {
                field649[var64] = field649[var51 + var64];
            }
            for (int var65 = var52 - var51; var65 < var52; var65++) {
                field649[var65] = (int) (Math.sin((double) field655 / 14.0D) * 16.0D + Math.sin((double) field655 / 15.0D) * 14.0D + Math.sin((double) field655 / 16.0D) * 12.0D);
                field655++;
            }
            field653 += var51 * 395840587;
            int var66 = ((client.field270 & 0x1) + var51) / 2;
            if (var66 > 0) {
                for (int var67 = 0; var67 < field653 * -1703642452; var67++) {
                    int var68 = (int) (Math.random() * 124.0D) + 2;
                    int var69 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field206[(var69 << 7) + var68] = 192;
                }
                field653 = 0;
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
                                    var75 += Statics.field865[var66 * 128 + var74 + var77];
                                }
                                if (var76 - (var66 + 1) >= 0) {
                                    var75 -= Statics.field865[var74 + var77 - (var66 + 1) * 128];
                                }
                                if (var76 >= 0) {
                                    Statics.field206[var74 + var77] = var75 / (var66 * 2 + 1);
                                }
                            }
                            var74++;
                        }
                    }
                    int var71 = 0;
                    int var72 = var70 * 128;
                    for (int var73 = -var66; var73 < 128; var73++) {
                        if (var66 + var73 < 128) {
                            var71 += Statics.field206[var72 + var73 + var66];
                        }
                        if (var73 - (var66 + 1) >= 0) {
                            var71 -= Statics.field206[var72 + var73 - (var66 + 1)];
                        }
                        if (var73 >= 0) {
                            Statics.field865[var72 + var73] = var71 / (var66 * 2 + 1);
                        }
                    }
                    var70++;
                }
            }
            field670 = 0;
        }
        method3049();
        Statics.field2627[Statics.field156.field146 ? 1 : 0].method1583(725, 463);
        if (client.field268 > 5 && client.field301 == 0) {
            if (Statics.field188 == null) {
                Statics.field188 = class67.method812(Statics.field242, "sl_button", "");
            } else {
                byte var78 = 5;
                short var79 = 463;
                byte var80 = 100;
                byte var81 = 35;
                Statics.field188.method1583(var78, var79);
                arg0.method3318(class139.field2131 + " " + client.field494, var80 / 2 + var78, var81 / 2 + var79 - 2, 16777215, 0);
                if (Statics.field956 == null) {
                    arg1.method3318(class139.field2366, var80 / 2 + var78, var81 / 2 + var79 + 12, 16777215, 0);
                } else {
                    arg1.method3318(class139.field2242, var80 / 2 + var78, var81 / 2 + var79 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var82 = Statics.field1915.getGraphics();
            Statics.field1913.method1347(var82, 0, 0);
        } catch (Exception var85) {
            Statics.field1915.repaint();
        }
    }

    @ObfuscatedName("d.u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method152(String arg0, String arg1, String arg2) {
        field659 = arg0;
        field654 = arg1;
        field661 = arg2;
    }

    @ObfuscatedName("do.t(Lbu;I)V")
    public static final void method2448(class71 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2774.length; var2++) {
            Statics.field2774[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2774[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field646[var8] = (Statics.field2774[var8 - 1] + Statics.field2774[var8 + 1] + Statics.field2774[var8 - 128] + Statics.field2774[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2774;
            Statics.field2774 = Statics.field646;
            Statics.field646 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1288; var11++) {
            for (int var12 = 0; var12 < arg0.field1287; var12++) {
                if (arg0.field1289[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1285;
                    int var14 = var11 + 16 + arg0.field1290;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2774[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("c.e(IIIB)I")
    public static final int method526(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("fn.a(B)V")
    public static final void method3049() {
        short var0 = 256;
        if (field660 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field660 > 768) {
                    Statics.field2882[var1] = method526(Statics.field1534[var1], Statics.field609[var1], 1024 - field660);
                } else if (field660 > 256) {
                    Statics.field2882[var1] = Statics.field609[var1];
                } else {
                    Statics.field2882[var1] = method526(Statics.field609[var1], Statics.field1534[var1], 256 - field660);
                }
            }
        } else if (field650 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field650 > 768) {
                    Statics.field2882[var2] = method526(Statics.field1534[var2], Statics.field2630[var2], 1024 - field650);
                } else if (field650 > 256) {
                    Statics.field2882[var2] = Statics.field2630[var2];
                } else {
                    Statics.field2882[var2] = method526(Statics.field2630[var2], Statics.field1534[var2], 256 - field650);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2882[var3] = Statics.field1534[var3];
            }
        }
        class70.method1515(0, 9, 128, var0 + 7);
        Statics.field644.method1509(0, 0);
        class70.method1545();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field649[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field206[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2882[var10];
                    int var14 = Statics.field1913.field1262[var5];
                    Statics.field1913.field1262[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class70.method1515(637, 9, 765, var0 + 7);
        Statics.field658.method1509(382, 0);
        class70.method1545();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field649[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field206[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2882[var22];
                    int var26 = Statics.field1913.field1262[var20];
                    Statics.field1913.field1262[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("v.l(Lh;S)V")
    public static void method124(class21 arg0) {
        if (arg0.method528() != client.field296) {
            client.field296 = arg0.method528();
            boolean var1 = arg0.method528();
            if (Statics.field981 != var1) {
                class42.method538();
                Statics.field981 = var1;
            }
        }
        Statics.field701 = arg0.field585;
        client.field494 = arg0.field587;
        client.field261 = arg0.field583;
        Statics.field179 = client.field471 == 0 ? 43594 : arg0.field587 + 40000;
        Statics.field2773 = client.field471 == 0 ? 443 : arg0.field587 + 50000;
        Statics.field1876 = Statics.field179;
    }

    @ObfuscatedName("dh.v(I)V")
    public static void method2433() {
        try {
            if (Statics.field956 == null) {
                Statics.field956 = new class16(Statics.field1249, new URL(Statics.field267));
            } else {
                byte[] var0 = Statics.field956.method181();
                if (var0 != null) {
                    class104 var1 = new class104(var0);
                    field667 = var1.method2206();
                    Statics.field2822 = new class21[field667];
                    int var2 = 0;
                    while (var2 < field667) {
                        class21 var3 = Statics.field2822[var2] = new class21();
                        var3.field587 = var1.method2206();
                        var3.field583 = var1.method2130();
                        var3.field585 = var1.method2187();
                        var3.field582 = var1.method2187();
                        var3.field589 = var1.method2257();
                        var3.field584 = var1.method2254();
                        var3.field588 = var2++;
                    }
                    Statics.method175(Statics.field2822, 0, Statics.field2822.length - 1, field642, field645);
                    field666 = true;
                    Statics.field956 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field956 = null;
        }
    }

    @ObfuscatedName("dq.j(IIB)V")
    public static void method2411(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field642[var5] != arg0) {
                var2[var4] = field642[var5];
                var3[var4] = field645[var5];
                var4++;
            }
        }
        field642 = var2;
        field645 = var3;
        Statics.method175(Statics.field2822, 0, Statics.field2822.length - 1, field642, field645);
    }
}
