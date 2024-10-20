package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("e")
public class class9 {

    @ObfuscatedName("e.e")
    public static boolean field131 = false;

    @ObfuscatedName("e.m")
    public static int[] field133 = new int[256];

    @ObfuscatedName("e.z")
    public static int field141 = 0;

    @ObfuscatedName("e.o")
    public static int field159 = 0;

    @ObfuscatedName("e.p")
    public static int field155 = 0;

    @ObfuscatedName("e.ak")
    public static int field144 = 0;

    @ObfuscatedName("e.ap")
    public static int field146 = 0;

    @ObfuscatedName("e.ai")
    public static int field166 = 0;

    @ObfuscatedName("e.ae")
    public static int field148 = 10;

    @ObfuscatedName("e.ad")
    public static String field149 = "";

    @ObfuscatedName("e.am")
    public static int field139 = 0;

    @ObfuscatedName("e.ah")
    public static String field151 = "";

    @ObfuscatedName("e.au")
    public static String field152 = "";

    @ObfuscatedName("e.ac")
    public static String field153 = "";

    @ObfuscatedName("e.at")
    public static String field154 = "";

    @ObfuscatedName("e.aq")
    public static String field126 = "";

    @ObfuscatedName("e.ar")
    public static int field156 = 0;

    @ObfuscatedName("e.aa")
    public static String field150 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("e.ax")
    public static boolean field160 = false;

    @ObfuscatedName("e.af")
    public static int field157 = 0;

    @ObfuscatedName("e.ba")
    public static int[] field165 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("e.bj")
    public static int[] field137 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("e.bs")
    public static int field145 = -1;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cl.t(Ljava/awt/Component;Lcy;Lcy;B)V")
    public static void method898(Component arg0, class86 arg1, class86 arg2) {
        if (Statics.field1209) {
            return;
        }
        class164.method2580();
        byte[] var3 = arg1.method1037("title.jpg", "");
        Statics.field128 = new class170(var3, arg0);
        Statics.field129 = Statics.field128.method2654();
        Statics.field1502 = class39.method759(arg2, "logo", "");
        Statics.field142 = class39.method759(arg2, "titlebox", "");
        Statics.field1154 = class39.method759(arg2, "titlebutton", "");
        Statics.field127 = class39.method1478(arg2, "runes", "");
        Statics.field130 = class39.method1478(arg2, "title_mute", "");
        Statics.field147 = new int[256];
        for (int var4 = 0; var4 < 64; var4++) {
            Statics.field147[var4] = var4 * 262144;
        }
        for (int var5 = 0; var5 < 64; var5++) {
            Statics.field147[var5 + 64] = var5 * 1024 + 16711680;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            Statics.field147[var6 + 128] = var6 * 4 + 16776960;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            Statics.field147[var7 + 192] = 16777215;
        }
        Statics.field140 = new int[256];
        for (int var8 = 0; var8 < 64; var8++) {
            Statics.field140[var8] = var8 * 1024;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            Statics.field140[var9 + 64] = var9 * 4 + 65280;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            Statics.field140[var10 + 128] = var10 * 262144 + 65535;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            Statics.field140[var11 + 192] = 16777215;
        }
        Statics.field1103 = new int[256];
        for (int var12 = 0; var12 < 64; var12++) {
            Statics.field1103[var12] = var12 * 4;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            Statics.field1103[var13 + 64] = var13 * 262144 + 255;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            Statics.field1103[var14 + 128] = var14 * 1024 + 16711935;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            Statics.field1103[var15 + 192] = 16777215;
        }
        Statics.field138 = new int[256];
        Statics.field143 = new int[32768];
        Statics.field797 = new int[32768];
        method48((class171) null);
        Statics.field1150 = new int[32768];
        Statics.field711 = new int[32768];
        field139 = 0;
        field154 = "";
        field126 = "";
        field160 = false;
        if (client.field2164 == 0) {
            field131 = true;
        } else {
            field131 = false;
        }
        if (field131) {
            class78.method1010(2);
        } else {
            class120 var16 = Statics.field1095;
            int var17 = var16.method1022("scape main");
            int var18 = var16.method1071(var17, "");
            class78.method2641(2, var16, var17, var18, 255, false);
        }
        Statics.method1112(false);
        Statics.field1209 = true;
        Statics.field128.method2663(0, 0);
        Statics.field129.method2663(382, 0);
        Statics.field1502.method2736(382 - Statics.field1502.field2513 / 2, 18);
    }

    @ObfuscatedName("fq.n(I)V")
    public static void method2891() {
        if (!Statics.field1209) {
            return;
        }
        Statics.field142 = null;
        Statics.field1154 = null;
        Statics.field127 = null;
        Statics.field128 = null;
        Statics.field129 = null;
        Statics.field1502 = null;
        Statics.field130 = null;
        Statics.field810 = null;
        Statics.field2489 = null;
        Statics.field216 = null;
        Statics.field344 = null;
        Statics.field1506 = null;
        Statics.field147 = null;
        Statics.field140 = null;
        Statics.field1103 = null;
        Statics.field138 = null;
        Statics.field143 = null;
        Statics.field797 = null;
        Statics.field1150 = null;
        Statics.field711 = null;
        class78.method1010(2);
        Statics.method1112(true);
        Statics.field1209 = false;
    }

    @ObfuscatedName("ad.q(Ldk;I)V")
    public static void method398(class111 arg0) {
        if (!field160) {
            if (class36.field481 == 1 && class36.field489 >= 715 && class36.field494 >= 453) {
                field131 = !field131;
                if (field131) {
                    Statics.field1110.method2263();
                    class78.field1109 = 1;
                    Statics.field1106 = null;
                } else {
                    class120 var9 = Statics.field1095;
                    int var10 = var9.method1022("scape main");
                    int var11 = var9.method1071(var10, "");
                    class78.method370(var9, var10, var11, 255, false);
                }
            }
            if (client.field2078 != 5) {
                field146++;
                if (client.field2078 == 10) {
                    if (client.field1913 == 0) {
                        if (class36.field481 == 1) {
                            byte var12 = 5;
                            short var13 = 463;
                            byte var14 = 100;
                            byte var15 = 35;
                            if (class36.field489 >= var12 && class36.field489 <= var12 + var14 && class36.field494 >= var13 && class36.field494 <= var13 + var15) {
                                method273();
                                return;
                            }
                        }
                        if (Statics.field824 != null) {
                            method273();
                        }
                    }
                    int var16 = class36.field481;
                    int var17 = class36.field489;
                    int var18 = class36.field494;
                    if (field139 == 0) {
                        short var19 = 302;
                        short var20 = 291;
                        if (var16 == 1 && var17 >= var19 - 75 && var17 <= var19 + 75 && var18 >= var20 - 20 && var18 <= var20 + 20) {
                            field139 = 3;
                            field156 = 0;
                        }
                        short var21 = 462;
                        if (var16 == 1 && var17 >= var21 - 75 && var17 <= var21 + 75 && var18 >= var20 - 20 && var18 <= var20 + 20) {
                            field151 = class74.field1060;
                            field152 = class74.field1061;
                            field153 = class74.field1052;
                            field139 = 2;
                            field156 = 0;
                        }
                    } else if (field139 == 2) {
                        short var22 = 231;
                        int var35 = var22 + 30;
                        if (var16 == 1 && var18 >= var35 - 15 && var18 < var35) {
                            field156 = 0;
                        }
                        var35 += 15;
                        if (var16 == 1 && var18 >= var35 - 15 && var18 < var35) {
                            field156 = 1;
                        }
                        var35 += 15;
                        short var23 = 302;
                        short var24 = 321;
                        if (var16 == 1 && var17 >= var23 - 75 && var17 <= var23 + 75 && var18 >= var24 - 20 && var18 <= var24 + 20) {
                            field154 = field154.trim();
                            if (field154.length() == 0) {
                                method1466(class74.field921, class74.field973, class74.field974);
                                return;
                            }
                            if (field126.length() == 0) {
                                method1466(class74.field975, class74.field876, class74.field970);
                                return;
                            }
                            method1466(class74.field1063, class74.field1064, class74.field1065);
                            client.method882(20);
                            return;
                        }
                        short var25 = 462;
                        if (var16 == 1 && var17 >= var25 - 75 && var17 <= var25 + 75 && var18 >= var24 - 20 && var18 <= var24 + 20) {
                            field139 = 0;
                            field154 = "";
                            field126 = "";
                        }
                        while (true) {
                            while (true) {
                                class35 var26 = class35.field455;
                                boolean var27;
                                synchronized (class35.field455) {
                                    if (class35.field476 == class35.field474) {
                                        var27 = false;
                                    } else {
                                        Statics.field186 = class35.field473[class35.field474];
                                        Statics.field198 = class35.field419[class35.field474];
                                        class35.field474 = class35.field474 + 1 & 0x7F;
                                        var27 = true;
                                    }
                                }
                                if (!var27) {
                                    return;
                                }
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field150.length(); var30++) {
                                    if (Statics.field198 == field150.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (field156 == 0) {
                                    if (Statics.field186 == 85 && field154.length() > 0) {
                                        field154 = field154.substring(0, field154.length() - 1);
                                    }
                                    if (Statics.field186 == 84 || Statics.field186 == 80) {
                                        field156 = 1;
                                    }
                                    if (var29 && field154.length() < 320) {
                                        field154 = field154 + Statics.field198;
                                    }
                                } else if (field156 == 1) {
                                    if (Statics.field186 == 85 && field126.length() > 0) {
                                        field126 = field126.substring(0, field126.length() - 1);
                                    }
                                    if (Statics.field186 == 84 || Statics.field186 == 80) {
                                        field156 = 0;
                                    }
                                    if (client.field2175 == 2 && Statics.field186 == 84) {
                                        field154 = field154.trim();
                                        if (field154.length() == 0) {
                                            method1466(class74.field921, class74.field973, class74.field974);
                                            return;
                                        }
                                        if (field126.length() == 0) {
                                            method1466(class74.field975, class74.field876, class74.field970);
                                            return;
                                        }
                                        method1466(class74.field1063, class74.field1064, class74.field1065);
                                        client.method882(20);
                                        return;
                                    }
                                    if (var29 && field126.length() < 20) {
                                        field126 = field126 + Statics.field198;
                                    }
                                }
                            }
                        }
                    } else if (field139 == 3) {
                        short var31 = 382;
                        short var32 = 321;
                        if (var16 == 1 && var17 >= var31 - 75 && var17 <= var31 + 75 && var18 >= var32 - 20 && var18 <= var32 + 20) {
                            field139 = 0;
                        }
                    }
                }
            }
        } else if (class36.field481 == 1) {
            short var1 = 280;
            if (class36.field489 >= var1 && class36.field489 <= var1 + 14 && class36.field494 >= 4 && class36.field494 <= 18) {
                method253(0, 0);
            } else if (class36.field489 >= var1 + 15 && class36.field489 <= var1 + 80 && class36.field494 >= 4 && class36.field494 <= 18) {
                method253(0, 1);
            } else {
                short var2 = 390;
                if (class36.field489 >= var2 && class36.field489 <= var2 + 14 && class36.field494 >= 4 && class36.field494 <= 18) {
                    method253(1, 0);
                } else if (class36.field489 >= var2 + 15 && class36.field489 <= var2 + 80 && class36.field494 >= 4 && class36.field494 <= 18) {
                    method253(1, 1);
                } else {
                    short var3 = 500;
                    if (class36.field489 >= var3 && class36.field489 <= var3 + 14 && class36.field494 >= 4 && class36.field494 <= 18) {
                        method253(2, 0);
                    } else if (class36.field489 >= var3 + 15 && class36.field489 <= var3 + 80 && class36.field494 >= 4 && class36.field494 <= 18) {
                        method253(2, 1);
                    } else {
                        short var4 = 610;
                        if (class36.field489 >= var4 && class36.field489 <= var4 + 14 && class36.field494 >= 4 && class36.field494 <= 18) {
                            method253(3, 0);
                        } else if (class36.field489 >= var4 + 15 && class36.field489 <= var4 + 80 && class36.field494 >= 4 && class36.field494 <= 18) {
                            method253(3, 1);
                        } else if (class36.field489 >= 708 && class36.field494 >= 4 && class36.field489 <= 758 && class36.field494 <= 20) {
                            field160 = false;
                            Statics.field128.method2663(0, 0);
                            Statics.field129.method2663(382, 0);
                            Statics.field1502.method2736(382 - Statics.field1502.field2513 / 2, 18);
                        } else if (field145 != -1) {
                            class5 var5 = Statics.field537[field145];
                            if (client.field1911 == var5.field51) {
                                Statics.field44 = var5.field48;
                                client.field2010 = var5.field46;
                                Statics.field734 = client.field2175 == 0 ? 43594 : var5.field46 + 40000;
                                Statics.field119 = client.field2175 == 0 ? 443 : var5.field46 + 50000;
                                Statics.field849 = Statics.field734;
                                field160 = false;
                                Statics.field128.method2663(0, 0);
                                Statics.field129.method2663(382, 0);
                                Statics.field1502.method2736(382 - Statics.field1502.field2513 / 2, 18);
                            } else {
                                String var6 = "";
                                if (client.field2175 != 0) {
                                    var6 = ":" + (var5.field46 + 7000);
                                }
                                String var7 = "http://" + var5.field48 + var6 + "/j" + client.field1914;
                                try {
                                    arg0.getAppletContext().showDocument(new URL(var7), "_self");
                                } catch (Exception var33) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cd.h(Lfa;Lfa;I)V")
    public static void method970(class181 arg0, class181 arg1) {
        if (!field160) {
            if (client.field2078 == 0 || client.field2078 == 5) {
                byte var25 = 20;
                arg0.method2881(class74.field980, 382, 245 - var25, 16777215, -1);
                int var26 = 253 - var25;
                class164.method2584(230, var26, 304, 34, 9179409);
                class164.method2584(231, var26 + 1, 302, 32, 0);
                class164.method2582(232, var26 + 2, field148 * 3, 30, 9179409);
                class164.method2582(field148 * 3 + 232, var26 + 2, 300 - field148 * 3, 30, 0);
                arg0.method2881(field149, 382, 276 - var25, 16777215, -1);
            }
            if (client.field2078 == 20) {
                Statics.field142.method2736(382 - Statics.field142.field2513 / 2, 271 - Statics.field142.field2515 / 2);
                short var27 = 211;
                arg0.method2881(field151, 382, var27, 16776960, 0);
                int var67 = var27 + 15;
                arg0.method2881(field152, 382, var67, 16776960, 0);
                int var68 = var67 + 15;
                arg0.method2881(field153, 382, var68, 16776960, 0);
                int var69 = var68 + 15;
                int var70 = var69 + 10;
                arg0.method2876(class74.field1044, 272, var70, 16777215, 0);
                short var28 = 200;
                String var29;
                for (var29 = field154; arg0.method2802(var29) > var28; var29 = var29.substring(0, var29.length() - 1)) {
                }
                arg0.method2876(class173.method2806(var29), 312, var70, 16777215, 0);
                var67 = var70 + 15;
                String var31 = class74.field1067;
                String var32 = field126;
                int var33 = var32.length();
                char[] var34 = new char[var33];
                for (int var35 = 0; var35 < var33; var35++) {
                    var34[var35] = '*';
                }
                String var36 = new String(var34);
                arg0.method2876(var31 + var36, 274, var67, 16777215, 0);
                var67 += 15;
            }
            if (client.field2078 == 10) {
                Statics.field142.method2736(202, 171);
                if (field139 == 0) {
                    short var38 = 251;
                    arg0.method2881(class74.field1032, 382, var38, 16776960, 0);
                    int var71 = var38 + 30;
                    short var39 = 302;
                    short var40 = 291;
                    Statics.field1154.method2736(var39 - 73, var40 - 20);
                    arg0.method2810(class74.field1069, var39 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    short var41 = 462;
                    Statics.field1154.method2736(var41 - 73, var40 - 20);
                    arg0.method2810(class74.field1070, var41 - 73, var40 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (field139 == 2) {
                    short var42 = 211;
                    arg0.method2881(field151, 382, var42, 16776960, 0);
                    int var72 = var42 + 15;
                    arg0.method2881(field152, 382, var72, 16776960, 0);
                    int var73 = var72 + 15;
                    arg0.method2881(field153, 382, var73, 16776960, 0);
                    int var74 = var73 + 15;
                    int var75 = var74 + 10;
                    arg0.method2876(class74.field1044, 272, var75, 16777215, 0);
                    short var43 = 200;
                    String var44;
                    for (var44 = field154; arg0.method2802(var44) > var43; var44 = var44.substring(1)) {
                    }
                    arg0.method2876(class173.method2806(var44) + (field156 == 0 & client.field1917 % 40 < 20 ? class1.method47(16776960) + class1.field4 : ""), 312, var75, 16777215, 0);
                    var72 = var75 + 15;
                    String var46 = class74.field1067;
                    String var47 = field126;
                    int var48 = var47.length();
                    char[] var49 = new char[var48];
                    for (int var50 = 0; var50 < var48; var50++) {
                        var49[var50] = '*';
                    }
                    String var51 = new String(var49);
                    arg0.method2876(var46 + var51 + (field156 == 1 & client.field1917 % 40 < 20 ? class1.method47(16776960) + class1.field4 : ""), 274, var72, 16777215, 0);
                    var72 += 15;
                    short var53 = 302;
                    short var54 = 321;
                    Statics.field1154.method2736(var53 - 73, var54 - 20);
                    arg0.method2881(class74.field1071, var53, var54 + 5, 16777215, 0);
                    short var55 = 462;
                    Statics.field1154.method2736(var55 - 73, var54 - 20);
                    arg0.method2881(class74.field984, var55, var54 + 5, 16777215, 0);
                } else if (field139 == 3) {
                    arg0.method2881(class74.field1073, 382, 211, 16776960, 0);
                    short var56 = 236;
                    arg0.method2881(class74.field1074, 382, var56, 16777215, 0);
                    int var76 = var56 + 15;
                    arg0.method2881(class74.field1075, 382, var76, 16777215, 0);
                    int var77 = var76 + 15;
                    arg0.method2881(class74.field1076, 382, var77, 16777215, 0);
                    int var78 = var77 + 15;
                    arg0.method2881(class74.field1077, 382, var78, 16777215, 0);
                    int var79 = var78 + 15;
                    short var57 = 382;
                    short var58 = 321;
                    Statics.field1154.method2736(var57 - 73, var58 - 20);
                    arg0.method2881(class74.field984, var57, var58 + 5, 16777215, 0);
                }
            }
            if (field146 > 0) {
                method954(field146);
                field146 = 0;
            }
            method1209();
            Statics.field130[field131 ? 1 : 0].method2736(725, 463);
            if (client.field2078 > 5 && client.field1913 == 0) {
                if (Statics.field1506 == null) {
                    Statics.field1506 = class39.method759(Statics.field52, "sl_button", "");
                } else {
                    byte var59 = 5;
                    short var60 = 463;
                    byte var61 = 100;
                    byte var62 = 35;
                    Statics.field1506.method2736(var59, var60);
                    arg0.method2881(class74.field1014 + " " + client.field2010, var61 / 2 + var59, var62 / 2 + var60 - 2, 16777215, 0);
                    if (Statics.field824 == null) {
                        arg1.method2881(class74.field924, var61 / 2 + var59, var62 / 2 + var60 + 12, 16777215, 0);
                    } else {
                        arg1.method2881(class74.field1087, var61 / 2 + var59, var62 / 2 + var60 + 12, 16777215, 0);
                    }
                }
            }
            try {
                Graphics var63 = Statics.field1094.getGraphics();
                Statics.field1475.method526(var63, 0, 0);
            } catch (Exception var66) {
                Statics.field1094.repaint();
            }
            return;
        }
        if (Statics.field810 == null) {
            Statics.field810 = class39.method887(Statics.field52, "sl_back", "");
        }
        if (Statics.field2489 == null) {
            Statics.field2489 = class39.method1478(Statics.field52, "sl_flags", "");
        }
        if (Statics.field216 == null) {
            Statics.field216 = class39.method1478(Statics.field52, "sl_arrows", "");
        }
        if (Statics.field344 == null) {
            Statics.field344 = class39.method1478(Statics.field52, "sl_stars", "");
        }
        class164.method2582(0, 23, 765, 480, 0);
        class164.method2583(0, 0, 125, 23, 12425273, 9135624);
        class164.method2583(125, 0, 640, 23, 5197647, 2697513);
        arg0.method2881(class74.field958, 62, 15, 0, -1);
        if (Statics.field344 != null) {
            Statics.field344[1].method2736(140, 1);
            arg1.method2876(class74.field1079, 152, 10, 16777215, -1);
            Statics.field344[0].method2736(140, 12);
            arg1.method2876(class74.field1080, 152, 21, 16777215, -1);
        }
        if (Statics.field216 != null) {
            short var2 = 280;
            if (field165[0] == 0 && field137[0] == 0) {
                Statics.field216[2].method2736(var2, 4);
            } else {
                Statics.field216[0].method2736(var2, 4);
            }
            if (field165[0] == 0 && field137[0] == 1) {
                Statics.field216[3].method2736(var2 + 15, 4);
            } else {
                Statics.field216[1].method2736(var2 + 15, 4);
            }
            arg0.method2876(class74.field1062, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field165[0] == 1 && field137[0] == 0) {
                Statics.field216[2].method2736(var3, 4);
            } else {
                Statics.field216[0].method2736(var3, 4);
            }
            if (field165[0] == 1 && field137[0] == 1) {
                Statics.field216[3].method2736(var3 + 15, 4);
            } else {
                Statics.field216[1].method2736(var3 + 15, 4);
            }
            arg0.method2876(class74.field1082, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field165[0] == 2 && field137[0] == 0) {
                Statics.field216[2].method2736(var4, 4);
            } else {
                Statics.field216[0].method2736(var4, 4);
            }
            if (field165[0] == 2 && field137[0] == 1) {
                Statics.field216[3].method2736(var4 + 15, 4);
            } else {
                Statics.field216[1].method2736(var4 + 15, 4);
            }
            arg0.method2876(class74.field1008, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field165[0] == 3 && field137[0] == 0) {
                Statics.field216[2].method2736(var5, 4);
            } else {
                Statics.field216[0].method2736(var5, 4);
            }
            if (field165[0] == 3 && field137[0] == 1) {
                Statics.field216[3].method2736(var5 + 15, 4);
            } else {
                Statics.field216[1].method2736(var5 + 15, 4);
            }
            arg0.method2876(class74.field1084, var5 + 32, 17, 16777215, -1);
        }
        class164.method2582(708, 4, 50, 16, 0);
        arg1.method2881(class74.field984, 733, 16, 16777215, -1);
        field145 = -1;
        if (Statics.field810 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field157) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field157) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field157) {
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
            for (int var19 = 0; var19 < field157; var19++) {
                class5 var20 = Statics.field537[var19];
                boolean var21 = true;
                String var22 = Integer.toString(var20.field49);
                if (var20.field49 == -1) {
                    var22 = class74.field883;
                    var21 = false;
                } else if (var20.field49 > 1980) {
                    var22 = class74.field1086;
                    var21 = false;
                }
                if (class36.field486 >= var17 && class36.field487 >= var16 && class36.field486 < var6 + var17 && class36.field487 < var7 + var16 && var21) {
                    field145 = var19;
                    Statics.field810[var20.field51 ? 1 : 0].method2669(var17, var16, 128, 16777215);
                } else {
                    Statics.field810[var20.field51 ? 1 : 0].method2663(var17, var16);
                }
                if (Statics.field2489 != null) {
                    Statics.field2489[var20.field47 + (var20.field51 ? 8 : 0)].method2736(var17 + 29, var16);
                }
                arg0.method2881(Integer.toString(var20.field46), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method2881(var22, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
        }
        try {
            Graphics var23 = Statics.field1094.getGraphics();
            Statics.field1475.method526(var23, 0, 0);
        } catch (Exception var65) {
            Statics.field1094.repaint();
        }
    }

    @ObfuscatedName("dv.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1466(String arg0, String arg1, String arg2) {
        field151 = arg0;
        field152 = arg1;
        field153 = arg2;
    }

    @ObfuscatedName("h.r(Lfc;B)V")
    public static final void method48(class171 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field143.length; var2++) {
            Statics.field143[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field143[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field797[var8] = (Statics.field143[var8 - 1] + Statics.field143[var8 + 1] + Statics.field143[var8 - 128] + Statics.field143[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field143;
            Statics.field143 = Statics.field797;
            Statics.field797 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field2515; var11++) {
            for (int var12 = 0; var12 < arg0.field2513; var12++) {
                if (arg0.field2512[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field2516;
                    int var14 = var11 + 16 + arg0.field2517;
                    int var15 = (var14 << 7) + var13;
                    Statics.field143[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("cb.l(II)V")
    public static final void method954(int arg0) {
        short var1 = 256;
        field155 += arg0 * 128;
        if (field155 > Statics.field143.length) {
            field155 -= Statics.field143.length;
            int var2 = (int) (Math.random() * 12.0D);
            method48(Statics.field127[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1150[var3 + var4] - Statics.field143[field155 + var3 & Statics.field143.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1150[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1150[var9 + var10] = 255;
                } else {
                    Statics.field1150[var9 + var10] = 0;
                }
            }
        }
        if (field141 > 0) {
            field141 -= arg0 * 4;
        }
        if (field159 > 0) {
            field159 -= arg0 * 4;
        }
        if (field141 == 0 && field159 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field141 = 1024;
            }
            if (var12 == 1) {
                field159 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field133[var13] = field133[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field133[var14] = (int) (Math.sin((double) field166 / 14.0D) * 16.0D + Math.sin((double) field166 / 15.0D) * 14.0D + Math.sin((double) field166 / 16.0D) * 12.0D);
            field166++;
        }
        field144 += arg0 * -558809293;
        int var15 = ((client.field1917 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field144 * -1915564532; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1150[(var18 << 7) + var17] = 192;
        }
        field144 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1150[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1150[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field711[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field711[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field711[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1150[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dv.i(IIIB)I")
    public static final int method1467(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("cg.e(I)V")
    public static final void method1209() {
        short var0 = 256;
        if (field141 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field141 > 768) {
                    Statics.field138[var1] = method1467(Statics.field147[var1], Statics.field140[var1], 1024 - field141);
                } else if (field141 > 256) {
                    Statics.field138[var1] = Statics.field140[var1];
                } else {
                    Statics.field138[var1] = method1467(Statics.field140[var1], Statics.field147[var1], 256 - field141);
                }
            }
        } else if (field159 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field159 > 768) {
                    Statics.field138[var2] = method1467(Statics.field147[var2], Statics.field1103[var2], 1024 - field159);
                } else if (field159 > 256) {
                    Statics.field138[var2] = Statics.field1103[var2];
                } else {
                    Statics.field138[var2] = method1467(Statics.field1103[var2], Statics.field147[var2], 256 - field159);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field138[var3] = Statics.field147[var3];
            }
        }
        class164.method2576(0, 9, 128, var0 + 7);
        Statics.field128.method2663(0, 0);
        class164.method2575();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field133[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1150[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field138[var10];
                    int var14 = Statics.field1475.field533[var5];
                    Statics.field1475.field533[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class164.method2576(637, 9, 765, var0 + 7);
        Statics.field129.method2663(382, 0);
        class164.method2575();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field133[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1150[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field138[var22];
                    int var26 = Statics.field1475.field533[var20];
                    Statics.field1475.field533[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("z.a(I)V")
    public static void method273() {
        try {
            if (Statics.field824 == null) {
                Statics.field824 = new class11(Statics.field1519, new URL(Statics.field807));
            } else {
                byte[] var0 = Statics.field824.method103();
                if (var0 != null) {
                    class135 var1 = new class135(var0);
                    field157 = var1.method1725();
                    Statics.field537 = new class5[field157];
                    int var2 = 0;
                    while (var2 < field157) {
                        class5 var3 = Statics.field537[var2] = new class5();
                        int var4 = var1.method1725();
                        var3.field46 = var4 & 0x7FFF;
                        var3.field51 = (var4 & 0x8000) != 0;
                        var3.field48 = var1.method1716();
                        var3.field47 = var1.method1571();
                        var3.field49 = var1.method1687();
                        var3.field50 = var2++;
                    }
                    method12(Statics.field537, 0, Statics.field537.length - 1, field165, field137);
                    field160 = true;
                    Statics.field824 = null;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            Statics.field824 = null;
        }
    }

    @ObfuscatedName("d.g(III)V")
    public static void method253(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field165[var5] != arg0) {
                var2[var4] = field165[var5];
                var3[var4] = field137[var5];
                var4++;
            }
        }
        field165 = var2;
        field137 = var3;
        method12(Statics.field537, 0, Statics.field537.length - 1, field165, field137);
    }

    @ObfuscatedName("n.w([Lk;II[I[II)V")
    public static void method12(class5[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class5 var8 = arg0[var7];
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
                        var11 = arg0[var6].field50;
                        var12 = var8.field50;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field49;
                        var12 = var8.field49;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].field51 ? 1 : 0;
                        var12 = var8.field51 ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field46;
                        var12 = var8.field46;
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
                        var15 = arg0[var5].field50;
                        var16 = var8.field50;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field49;
                        var16 = var8.field49;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].field51 ? 1 : 0;
                        var16 = var8.field51 ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field46;
                        var16 = var8.field46;
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
                class5 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method12(arg0, arg1, var6, arg3, arg4);
        method12(arg0, var6 + 1, arg2, arg3, arg4);
    }
}
