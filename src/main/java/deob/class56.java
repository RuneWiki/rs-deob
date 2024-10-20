package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DecimalFormat;

@ObfuscatedName("by")
public class class56 {

    @ObfuscatedName("by.v")
    public static int field825 = 0;

    @ObfuscatedName("by.i")
    public static int field817 = field825 + 202;

    @ObfuscatedName("by.b")
    public static int field806 = 10;

    @ObfuscatedName("by.z")
    public static String field807 = "";

    @ObfuscatedName("by.al")
    public static int field805 = -1;

    @ObfuscatedName("by.ab")
    public static int field810 = 1;

    @ObfuscatedName("by.as")
    public static int field812 = 0;

    @ObfuscatedName("by.ao")
    public static String field799 = "";

    @ObfuscatedName("by.az")
    public static String field823 = "";

    @ObfuscatedName("by.ak")
    public static String field814 = "";

    @ObfuscatedName("by.aj")
    public static String field816 = "";

    @ObfuscatedName("by.at")
    public static String field809 = "";

    @ObfuscatedName("by.af")
    public static String field818 = "";

    @ObfuscatedName("by.ad")
    public static boolean field830 = false;

    @ObfuscatedName("by.ac")
    public static boolean field820 = false;

    @ObfuscatedName("by.bk")
    public static boolean field821 = true;

    @ObfuscatedName("by.br")
    public static int field822 = 0;

    @ObfuscatedName("by.by")
    public static String field811 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("by.bv")
    public static String field824 = "1234567890";

    @ObfuscatedName("by.bd")
    public static boolean field800 = false;

    @ObfuscatedName("by.bj")
    public static int field826 = -1;

    @ObfuscatedName("by.bq")
    public static int field827 = 0;

    @ObfuscatedName("by.bn")
    public static int field828 = 0;

    @ObfuscatedName("by.bs")
    public static long field829;

    @ObfuscatedName("by.bx")
    public static long field813;

    static {
        new DecimalFormat("##0.00");
        new class99();
        field829 = -1L;
        field813 = -1L;
    }

    public class56() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("if.s(Ljy;Ljy;ZII)V")
    public static void method4151(class277 arg0, class277 arg1, boolean arg2, int arg3) {
        if (!Statics.field798) {
            field812 = arg3;
            class394.method6268();
            byte[] var4 = arg0.method4478("title.jpg", "");
            Statics.field815 = class16.method1834(var4);
            Statics.field803 = Statics.field815.method6367();
            int var5 = client.field406;
            if ((var5 & 0x20000000) != 0) {
                Statics.field1229 = class399.method2219(arg1, "logo_deadman_mode", "");
            } else if ((var5 & 0x40000000) == 0) {
                Statics.field1229 = class399.method2219(arg1, "logo", "");
            } else {
                Statics.field1229 = class399.method2219(arg1, "logo_seasonal_mode", "");
            }
            Statics.field3760 = class399.method2219(arg1, "titlebox", "");
            Statics.field801 = class399.method2219(arg1, "titlebutton", "");
            int var6 = arg1.method4474("runes");
            int var7 = arg1.method4476(var6, "");
            class397[] var8 = Statics.method2333(arg1, var6, var7);
            Statics.field797 = var8;
            int var9 = arg1.method4474("title_mute");
            int var10 = arg1.method4476(var9, "");
            class397[] var11 = Statics.method2333(arg1, var9, var10);
            Statics.field1486 = var11;
            Statics.field397 = class399.method2219(arg1, "options_radio_buttons,0", "");
            Statics.field1240 = class399.method2219(arg1, "options_radio_buttons,4", "");
            Statics.field2014 = class399.method2219(arg1, "options_radio_buttons,2", "");
            Statics.field3920 = class399.method2219(arg1, "options_radio_buttons,6", "");
            Statics.field1387 = Statics.field397.field4263;
            Statics.field705 = Statics.field397.field4264;
            Statics.field16 = new class74(Statics.field797);
            if (arg2) {
                field809 = "";
                field818 = "";
            }
            Statics.field3640 = 0;
            Statics.field1615 = "";
            field821 = true;
            field800 = false;
            if (Statics.field308.field1114) {
                class235.field2819 = 1;
                Statics.field2820 = null;
                Statics.field2822 = -1;
                Statics.field1264 = -1;
                Statics.field1612 = 0;
                Statics.field1598 = false;
                Statics.field1439 = 2;
            } else {
                class235.method2556(2, Statics.field1326, "scape main", "", 255, false);
            }
            if (Statics.field3614 != null) {
                try {
                    class385 var12 = new class385(4);
                    var12.method5941(3);
                    var12.method6121(0);
                    Statics.field3614.method2342(var12.field4184, 0, 4);
                } catch (IOException var16) {
                    try {
                        Statics.field3614.method2335();
                    } catch (Exception var15) {
                    }
                    class278.field3605++;
                    Statics.field3614 = null;
                }
            }
            Statics.field798 = true;
            field825 = (Statics.field971 - 765) / 2;
            field817 = field825 + 202;
            Statics.field1932 = field817 + 180;
            Statics.field815.method6445(field825, 0);
            Statics.field803.method6445(field825 + 382, 0);
            Statics.field1229.method6348(field825 + 382 - Statics.field1229.field4263 / 2, 18);
        } else if (arg3 == 4) {
            field812 = 4;
        }
    }

    @ObfuscatedName("kj.t(ZZI)Lof;")
    public static class397 method4686(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field3920 : Statics.field2014) : (arg1 ? Statics.field1240 : Statics.field397);
    }

    @ObfuscatedName("de.v(S)Ljava/lang/String;")
    public static String method2130() {
        return Statics.field308.field1117 ? class306.method172(field809) : field809;
    }

    @ObfuscatedName("ce.j(I)V")
    public static void method1895() {
        if (field809 != null && field809.length() > 0) {
            return;
        }
        if (Statics.field308.field1123 == null) {
            client.field443 = false;
        } else {
            field809 = Statics.field308.field1123;
            client.field443 = true;
        }
    }

    @ObfuscatedName("em.l(Lc;B)V")
    public static void method2688(class19 arg0) {
        if (field800) {
            while (true) {
                if (!class11.method5125()) {
                    if (class20.field149 != 1 && (Statics.field3777 || class20.field149 != 4)) {
                        break;
                    }
                    int var1 = field825 + 280;
                    if (class20.field150 >= var1 && class20.field150 <= var1 + 14 && class20.field151 >= 4 && class20.field151 <= 18) {
                        class48.method4678(0, 0);
                        break;
                    }
                    if (class20.field150 >= var1 + 15 && class20.field150 <= var1 + 80 && class20.field151 >= 4 && class20.field151 <= 18) {
                        class48.method4678(0, 1);
                        break;
                    }
                    int var2 = field825 + 390;
                    if (class20.field150 >= var2 && class20.field150 <= var2 + 14 && class20.field151 >= 4 && class20.field151 <= 18) {
                        class48.method4678(1, 0);
                        break;
                    }
                    if (class20.field150 >= var2 + 15 && class20.field150 <= var2 + 80 && class20.field151 >= 4 && class20.field151 <= 18) {
                        class48.method4678(1, 1);
                        break;
                    }
                    int var3 = field825 + 500;
                    if (class20.field150 >= var3 && class20.field150 <= var3 + 14 && class20.field151 >= 4 && class20.field151 <= 18) {
                        class48.method4678(2, 0);
                        break;
                    }
                    if (class20.field150 >= var3 + 15 && class20.field150 <= var3 + 80 && class20.field151 >= 4 && class20.field151 <= 18) {
                        class48.method4678(2, 1);
                        break;
                    }
                    int var4 = field825 + 610;
                    if (class20.field150 >= var4 && class20.field150 <= var4 + 14 && class20.field151 >= 4 && class20.field151 <= 18) {
                        class48.method4678(3, 0);
                        break;
                    }
                    if (class20.field150 >= var4 + 15 && class20.field150 <= var4 + 80 && class20.field151 >= 4 && class20.field151 <= 18) {
                        class48.method4678(3, 1);
                        break;
                    }
                    if (class20.field150 >= field825 + 708 && class20.field151 >= 4 && class20.field150 <= field825 + 708 + 50 && class20.field151 <= 20) {
                        method2216();
                        break;
                    }
                    if (field826 == -1) {
                        if (field827 > 0 && Statics.field1520 != null && class20.field150 >= 0 && class20.field150 <= Statics.field1520.field4263 && class20.field151 >= Statics.field687 / 2 - 50 && class20.field151 <= Statics.field687 / 2 + 50) {
                            field827--;
                        }
                        if (field827 < field828 && Statics.field1257 != null && class20.field150 >= Statics.field971 - Statics.field1257.field4263 - 5 && class20.field150 <= Statics.field971 && class20.field151 >= Statics.field687 / 2 - 50 && class20.field151 <= Statics.field687 / 2 + 50) {
                            field827++;
                        }
                    } else {
                        class48 var5 = Statics.field86[field826];
                        method2760(var5);
                        method2216();
                    }
                    break;
                }
                if (Statics.field1418 == 13) {
                    method2216();
                    break;
                }
                if (Statics.field1418 == 96) {
                    if (field827 > 0 && Statics.field1520 != null) {
                        field827--;
                    }
                } else if (Statics.field1418 == 97 && field827 < field828 && Statics.field1257 != null) {
                    field827++;
                }
            }
            return;
        }
        if ((class20.field149 == 1 || !Statics.field3777 && class20.field149 == 4) && class20.field150 >= field825 + 765 - 50 && class20.field151 >= 453) {
            Statics.field308.field1114 = !Statics.field308.field1114;
            class76.method2370();
            if (Statics.field308.field1114) {
                class235.method1634();
            } else {
                class275 var6 = Statics.field1326;
                int var7 = var6.method4474("scape main");
                int var8 = var6.method4476(var7, "");
                class235.method1910(var6, var7, var8, 255, false);
            }
        }
        if (client.field413 == 5) {
            return;
        }
        if (field829 == -1L) {
            field829 = class382.method2013() + 1000L;
        }
        long var9 = class382.method2013();
        if (client.method169() && field813 == -1L) {
            field813 = var9;
            if (field813 > field829) {
                field829 = field813;
            }
        }
        if (client.field413 != 10 && client.field413 != 11) {
            return;
        }
        if (Statics.field3644 == class292.field3694) {
            if (class20.field149 == 1 || !Statics.field3777 && class20.field149 == 4) {
                int var11 = field825 + 5;
                short var12 = 463;
                byte var13 = 100;
                byte var14 = 35;
                if (class20.field150 >= var11 && class20.field150 <= var11 + var13 && class20.field151 >= var12 && class20.field151 <= var12 + var14) {
                    if (class48.method4398()) {
                        field800 = true;
                        field827 = 0;
                        field828 = 0;
                    }
                    return;
                }
            }
            if (Statics.field1135 != null && class48.method4398()) {
                field800 = true;
                field827 = 0;
                field828 = 0;
            }
        }
        int var15 = class20.field149;
        int var16 = class20.field150;
        int var17 = class20.field151;
        if (var15 == 0) {
            var16 = class20.field142;
            var17 = class20.field145;
        }
        if (!Statics.field3777 && var15 == 4) {
            var15 = 1;
        }
        if (field812 == 0) {
            boolean var18 = false;
            while (class11.method5125()) {
                if (Statics.field1418 == 84) {
                    var18 = true;
                }
            }
            int var19 = Statics.field1932 - 80;
            short var20 = 291;
            if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                Statics.method2388(client.method2055("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var21 = Statics.field1932 + 80;
            if (var15 == 1 && var16 >= var21 - 75 && var16 <= var21 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20 || var18) {
                if ((client.field406 & 0x2000000) != 0) {
                    field799 = "";
                    field823 = class270.field3454;
                    field814 = class270.field3274;
                    field816 = class270.field3456;
                    field812 = 1;
                    if (client.field443 && field809 != null && field809.length() > 0) {
                        field822 = 1;
                    } else {
                        field822 = 0;
                    }
                } else if ((client.field406 & 0x4) != 0) {
                    if ((client.field406 & 0x400) == 0) {
                        field823 = class270.field3445;
                        field814 = class270.field3470;
                        field816 = class270.field3447;
                    } else {
                        field823 = class270.field3451;
                        field814 = class270.field3452;
                        field816 = class270.field3453;
                    }
                    field799 = class270.field3301;
                    field812 = 1;
                    if (client.field443 && field809 != null && field809.length() > 0) {
                        field822 = 1;
                    } else {
                        field822 = 0;
                    }
                } else if ((client.field406 & 0x400) == 0) {
                    method2127(false);
                } else {
                    field823 = class270.field3448;
                    field814 = class270.field3449;
                    field816 = class270.field3308;
                    field799 = class270.field3301;
                    field812 = 1;
                    if (client.field443 && field809 != null && field809.length() > 0) {
                        field822 = 1;
                    } else {
                        field822 = 0;
                    }
                }
            }
        } else if (field812 == 1) {
            while (true) {
                if (!class11.method5125()) {
                    int var22 = Statics.field1932 - 80;
                    short var23 = 321;
                    if (var15 == 1 && var16 >= var22 - 75 && var16 <= var22 + 75 && var17 >= var23 - 20 && var17 <= var23 + 20) {
                        method2127(false);
                    }
                    int var24 = Statics.field1932 + 80;
                    if (var15 == 1 && var16 >= var24 - 75 && var16 <= var24 + 75 && var17 >= var23 - 20 && var17 <= var23 + 20) {
                        field812 = 0;
                    }
                    break;
                }
                if (Statics.field1418 == 84) {
                    method2127(false);
                } else if (Statics.field1418 == 13) {
                    field812 = 0;
                }
            }
        } else if (field812 == 2) {
            short var25 = 201;
            int var91 = var25 + 52;
            if (var15 == 1 && var17 >= var91 - 12 && var17 < var91 + 2) {
                field822 = 0;
            }
            var91 += 15;
            if (var15 == 1 && var17 >= var91 - 12 && var17 < var91 + 2) {
                field822 = 1;
            }
            var91 += 15;
            short var26 = 361;
            if (Statics.field128 != null) {
                int var27 = Statics.field128.field3923 / 2;
                if (var15 == 1 && var16 >= Statics.field128.field3925 - var27 && var16 <= Statics.field128.field3925 + var27 && var17 >= var26 - 15 && var17 < var26) {
                    switch(field810) {
                        case 1:
                            method1294(class270.field3514, class270.field3494, class270.field3495);
                            field812 = 5;
                            return;
                        case 2:
                            Statics.method2388("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var28 = Statics.field1932 - 80;
            short var29 = 321;
            if (var15 == 1 && var16 >= var28 - 75 && var16 <= var28 + 75 && var17 >= var29 - 20 && var17 <= var29 + 20) {
                field809 = field809.trim();
                if (field809.length() == 0) {
                    method1294(class270.field3260, class270.field3347, class270.field3239);
                    return;
                }
                if (field818.length() == 0) {
                    method1294(class270.field3377, class270.field3350, class270.field3351);
                    return;
                }
                method1294(class270.field3459, class270.field3460, class270.field3461);
                client.method1490(false);
                client.method159(20);
                return;
            }
            int var30 = field817 + 180 + 80;
            if (var15 == 1 && var16 >= var30 - 75 && var16 <= var30 + 75 && var17 >= var29 - 20 && var17 <= var29 + 20) {
                field812 = 0;
                field809 = "";
                field818 = "";
                Statics.field3640 = 0;
                Statics.field1615 = "";
                field821 = true;
            }
            int var31 = Statics.field1932 + -117;
            short var32 = 277;
            field830 = var16 >= var31 && var16 < Statics.field1387 + var31 && var17 >= var32 && var17 < Statics.field705 + var32;
            if (var15 == 1 && field830) {
                client.field443 = !client.field443;
                if (!client.field443 && Statics.field308.field1123 != null) {
                    Statics.field308.field1123 = null;
                    class76.method2370();
                }
            }
            int var33 = Statics.field1932 + 24;
            short var34 = 277;
            field820 = var16 >= var33 && var16 < Statics.field1387 + var33 && var17 >= var34 && var17 < Statics.field705 + var34;
            if (var15 == 1 && field820) {
                Statics.field308.field1117 = !Statics.field308.field1117;
                if (!Statics.field308.field1117) {
                    field809 = "";
                    Statics.field308.field1123 = null;
                    if (client.field443 && field809 != null && field809.length() > 0) {
                        field822 = 1;
                    } else {
                        field822 = 0;
                    }
                }
                class76.method2370();
            }
            label996: while (true) {
                Transferable var38;
                int var39;
                do {
                    while (true) {
                        label910: do {
                            while (true) {
                                while (class11.method5125()) {
                                    if (Statics.field1418 == 13) {
                                        field812 = 0;
                                        field809 = "";
                                        field818 = "";
                                        Statics.field3640 = 0;
                                        Statics.field1615 = "";
                                        field821 = true;
                                    } else {
                                        if (field822 != 0) {
                                            continue label910;
                                        }
                                        Statics.method3258(Statics.field1450);
                                        if (Statics.field1418 == 85 && field809.length() > 0) {
                                            field809 = field809.substring(0, field809.length() - 1);
                                        }
                                        if (Statics.field1418 == 84 || Statics.field1418 == 80) {
                                            field822 = 1;
                                        }
                                        char var35 = Statics.field1450;
                                        boolean var36 = field811.indexOf(var35) != -1;
                                        if (var36 && field809.length() < 320) {
                                            field809 = field809 + Statics.field1450;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field822 != 1);
                        if (Statics.field1418 == 85 && field818.length() > 0) {
                            field818 = field818.substring(0, field818.length() - 1);
                        } else if (Statics.field1418 == 84 || Statics.field1418 == 80) {
                            field822 = 0;
                            if (Statics.field1418 == 84) {
                                field809 = field809.trim();
                                if (field809.length() == 0) {
                                    method1294(class270.field3260, class270.field3347, class270.field3239);
                                    return;
                                }
                                if (field818.length() == 0) {
                                    method1294(class270.field3377, class270.field3350, class270.field3351);
                                    return;
                                }
                                method1294(class270.field3459, class270.field3460, class270.field3461);
                                client.method1490(false);
                                client.method159(20);
                                return;
                            }
                        }
                        if ((class11.field46[82] || class11.field46[87]) && Statics.field1418 == 67) {
                            Clipboard var37 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var38 = var37.getContents(Statics.field874);
                            var39 = 20 - field818.length();
                            break;
                        }
                        char var52 = Statics.field1450;
                        boolean var53;
                        if (var52 >= ' ' && var52 < 127 || var52 > 127 && var52 < 160 || var52 > 160 && var52 <= 255) {
                            var53 = true;
                        } else {
                            label1138: {
                                if (var52 != 0) {
                                    char[] var54 = class304.field3755;
                                    for (int var55 = 0; var55 < var54.length; var55++) {
                                        char var56 = var54[var55];
                                        if (var52 == var56) {
                                            var53 = true;
                                            break label1138;
                                        }
                                    }
                                }
                                var53 = false;
                            }
                        }
                        if (var53) {
                            char var57 = Statics.field1450;
                            boolean var58 = field811.indexOf(var57) != -1;
                            if (var58 && field818.length() < 20) {
                                field818 = field818 + Statics.field1450;
                            }
                        }
                    }
                } while (var39 <= 0);
                try {
                    String var40 = (String) var38.getTransferData(DataFlavor.stringFlavor);
                    int var41 = Math.min(var39, var40.length());
                    int var42 = 0;
                    while (true) {
                        if (var42 >= var41) {
                            field818 = field818 + var40.substring(0, var41);
                            continue label996;
                        }
                        char var43 = var40.charAt(var42);
                        boolean var44;
                        if (var43 >= ' ' && var43 < 127 || var43 > 127 && var43 < 160 || var43 > 160 && var43 <= 255) {
                            var44 = true;
                        } else {
                            label1139: {
                                if (var43 != 0) {
                                    char[] var45 = class304.field3755;
                                    for (int var46 = 0; var46 < var45.length; var46++) {
                                        char var47 = var45[var46];
                                        if (var43 == var47) {
                                            var44 = true;
                                            break label1139;
                                        }
                                    }
                                }
                                var44 = false;
                            }
                        }
                        if (!var44) {
                            break;
                        }
                        char var48 = var40.charAt(var42);
                        boolean var49 = field811.indexOf(var48) != -1;
                        if (!var49) {
                            break;
                        }
                        var42++;
                    }
                    field812 = 3;
                    return;
                } catch (UnsupportedFlavorException var89) {
                } catch (IOException var90) {
                }
            }
        } else if (field812 == 3) {
            int var59 = field817 + 180;
            short var60 = 276;
            if (var15 == 1 && var16 >= var59 - 75 && var16 <= var59 + 75 && var17 >= var60 - 20 && var17 <= var60 + 20) {
                method2127(false);
            }
            int var61 = field817 + 180;
            short var62 = 326;
            if (var15 == 1 && var16 >= var61 - 75 && var16 <= var61 + 75 && var17 >= var62 - 20 && var17 <= var62 + 20) {
                method1294(class270.field3514, class270.field3494, class270.field3495);
                field812 = 5;
                return;
            }
        } else if (field812 == 4) {
            int var63 = field817 + 180 - 80;
            short var64 = 321;
            if (var15 == 1 && var16 >= var63 - 75 && var16 <= var63 + 75 && var17 >= var64 - 20 && var17 <= var64 + 20) {
                Statics.field1615.trim();
                if (Statics.field1615.length() != 6) {
                    method1294(class270.field3265, class270.field3266, class270.field3485);
                    return;
                }
                Statics.field3640 = Integer.parseInt(Statics.field1615);
                Statics.field1615 = "";
                client.method1490(true);
                method1294(class270.field3459, class270.field3460, class270.field3461);
                client.method159(20);
                return;
            }
            if (var15 == 1 && var16 >= field817 + 180 - 9 && var16 <= field817 + 180 + 130 && var17 >= 263 && var17 <= 296) {
                field821 = !field821;
            }
            if (var15 == 1 && var16 >= field817 + 180 - 34 && var16 <= field817 + 180 + 34 && var17 >= 351 && var17 <= 363) {
                Statics.method2388(client.method2055("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var65 = field817 + 180 + 80;
            if (var15 == 1 && var16 >= var65 - 75 && var16 <= var65 + 75 && var17 >= var64 - 20 && var17 <= var64 + 20) {
                field812 = 0;
                field809 = "";
                field818 = "";
                Statics.field3640 = 0;
                Statics.field1615 = "";
            }
            while (class11.method5125()) {
                boolean var66 = false;
                for (int var67 = 0; var67 < field824.length(); var67++) {
                    if (Statics.field1450 == field824.charAt(var67)) {
                        var66 = true;
                        break;
                    }
                }
                if (Statics.field1418 == 13) {
                    field812 = 0;
                    field809 = "";
                    field818 = "";
                    Statics.field3640 = 0;
                    Statics.field1615 = "";
                } else {
                    if (Statics.field1418 == 85 && Statics.field1615.length() > 0) {
                        Statics.field1615 = Statics.field1615.substring(0, Statics.field1615.length() - 1);
                    }
                    if (Statics.field1418 == 84) {
                        Statics.field1615.trim();
                        if (Statics.field1615.length() != 6) {
                            method1294(class270.field3265, class270.field3266, class270.field3485);
                            return;
                        }
                        Statics.field3640 = Integer.parseInt(Statics.field1615);
                        Statics.field1615 = "";
                        client.method1490(true);
                        method1294(class270.field3459, class270.field3460, class270.field3461);
                        client.method159(20);
                        return;
                    }
                    if (var66 && Statics.field1615.length() < 6) {
                        Statics.field1615 = Statics.field1615 + Statics.field1450;
                    }
                }
            }
        } else if (field812 == 5) {
            int var68 = field817 + 180 - 80;
            short var69 = 321;
            if (var15 == 1 && var16 >= var68 - 75 && var16 <= var68 + 75 && var17 >= var69 - 20 && var17 <= var69 + 20) {
                Statics.method4681();
                return;
            }
            int var70 = field817 + 180 + 80;
            if (var15 == 1 && var16 >= var70 - 75 && var16 <= var70 + 75 && var17 >= var69 - 20 && var17 <= var69 + 20) {
                method2127(true);
            }
            short var71 = 361;
            if (Statics.field3767 != null) {
                int var72 = Statics.field3767.field3923 / 2;
                if (var15 == 1 && var16 >= Statics.field3767.field3925 - var72 && var16 <= Statics.field3767.field3925 + var72 && var17 >= var71 - 15 && var17 < var71) {
                    Statics.method2388(client.method2055("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class11.method5125()) {
                boolean var73 = false;
                for (int var74 = 0; var74 < field811.length(); var74++) {
                    if (Statics.field1450 == field811.charAt(var74)) {
                        var73 = true;
                        break;
                    }
                }
                if (Statics.field1418 == 13) {
                    method2127(true);
                } else {
                    if (Statics.field1418 == 85 && field809.length() > 0) {
                        field809 = field809.substring(0, field809.length() - 1);
                    }
                    if (Statics.field1418 == 84) {
                        Statics.method4681();
                        return;
                    }
                    if (var73 && field809.length() < 320) {
                        field809 = field809 + Statics.field1450;
                    }
                }
            }
        } else if (field812 == 6) {
            while (true) {
                do {
                    if (!class11.method5125()) {
                        short var75 = 321;
                        if (var15 == 1 && var17 >= var75 - 20 && var17 <= var75 + 20) {
                            method2127(true);
                        }
                        return;
                    }
                } while (Statics.field1418 != 84 && Statics.field1418 != 13);
                method2127(true);
            }
        } else if (field812 == 7) {
            int var76 = field817 + 180 - 80;
            short var77 = 321;
            if (var15 == 1 && var16 >= var76 - 75 && var16 <= var76 + 75 && var17 >= var77 - 20 && var17 <= var77 + 20) {
                Statics.method2388(client.method2055("secure", true) + "m=dob/set_dob.ws", true, false);
                method1294(class270.field3490, class270.field3491, class270.field3493);
                field812 = 6;
                return;
            }
            int var78 = field817 + 180 + 80;
            if (var15 == 1 && var16 >= var78 - 75 && var16 <= var78 + 75 && var17 >= var77 - 20 && var17 <= var77 + 20) {
                method2127(true);
            }
        } else if (field812 == 8) {
            int var79 = field817 + 180 - 80;
            short var80 = 321;
            if (var15 == 1 && var16 >= var79 - 75 && var16 <= var79 + 75 && var17 >= var80 - 20 && var17 <= var80 + 20) {
                Statics.method2388("https://www.jagex.com/terms/privacy", true, false);
                method1294(class270.field3490, class270.field3491, class270.field3493);
                field812 = 6;
                return;
            }
            int var81 = field817 + 180 + 80;
            if (var15 == 1 && var16 >= var81 - 75 && var16 <= var81 + 75 && var17 >= var80 - 20 && var17 <= var80 + 20) {
                method2127(true);
            }
        } else if (field812 == 12) {
            String var82 = "";
            switch(field805) {
                case 0:
                    var82 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var82 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method2127(false);
            }
            int var83 = field817 + 180;
            short var84 = 276;
            if (var15 == 1 && var16 >= var83 - 75 && var16 <= var83 + 75 && var17 >= var84 - 20 && var17 <= var84 + 20) {
                Statics.method2388(var82, true, false);
                method1294(class270.field3490, class270.field3491, class270.field3493);
                field812 = 6;
                return;
            }
            int var85 = field817 + 180;
            short var86 = 326;
            if (var15 == 1 && var16 >= var85 - 75 && var16 <= var85 + 75 && var17 >= var86 - 20 && var17 <= var86 + 20) {
                method2127(false);
            }
        } else if (field812 == 24) {
            int var87 = field817 + 180;
            short var88 = 301;
            if (var15 == 1 && var16 >= var87 - 75 && var16 <= var87 + 75 && var17 >= var88 - 20 && var17 <= var88 + 20) {
                method2127(false);
            }
        }
    }

    @ObfuscatedName("de.w(ZI)V")
    public static void method2127(boolean arg0) {
        field823 = class270.field3441;
        field814 = class270.field3335;
        field816 = class270.field3444;
        field812 = 2;
        if (arg0) {
            field818 = "";
        }
        method1895();
        if (client.field443 && field809 != null && field809.length() > 0) {
            field822 = 1;
        } else {
            field822 = 0;
        }
    }

    @ObfuscatedName("kj.o(Lkt;Lkt;Lkt;B)V")
    public static void method4691(class302 arg0, class302 arg1, class302 arg2) {
        field825 = (Statics.field971 - 765) / 2;
        field817 = field825 + 202;
        Statics.field1932 = field817 + 180;
        if (field800) {
            method1557(arg0, arg1);
            return;
        }
        Statics.field815.method6445(field825, 0);
        Statics.field803.method6445(field825 + 382, 0);
        Statics.field1229.method6348(field825 + 382 - Statics.field1229.field4263 / 2, 18);
        if (client.field413 == 0 || client.field413 == 5) {
            byte var3 = 20;
            arg0.method4955(class270.field3440, field817 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class394.method6299(field817 + 180 - 152, var4, 304, 34, 9179409);
            class394.method6299(field817 + 180 - 151, var4 + 1, 302, 32, 0);
            class394.method6272(field817 + 180 - 150, var4 + 2, field806 * 3, 30, 9179409);
            class394.method6272(field806 * 3 + (field817 + 180 - 150), var4 + 2, 300 - field806 * 3, 30, 0);
            arg0.method4955(field807, field817 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field413 == 20) {
            Statics.field3760.method6348(field817 + 180 - Statics.field3760.field4263 / 2, 271 - Statics.field3760.field4264 / 2);
            short var5 = 201;
            arg0.method4955(field823, field817 + 180, var5, 16776960, 0);
            int var78 = var5 + 15;
            arg0.method4955(field814, field817 + 180, var78, 16776960, 0);
            int var79 = var78 + 15;
            arg0.method4955(field816, field817 + 180, var79, 16776960, 0);
            int var80 = var79 + 15;
            int var81 = var80 + 7;
            if (field812 != 4) {
                arg0.method4891(class270.field3475, field817 + 180 - 110, var81, 16777215, 0);
                short var6 = 200;
                String var7;
                for (var7 = method2130(); arg0.method4887(var7) > var6; var7 = var7.substring(0, var7.length() - 1)) {
                }
                arg0.method4891(class303.method4948(var7), field817 + 180 - 70, var81, 16777215, 0);
                var78 = var81 + 15;
                String var8;
                for (var8 = class306.method172(field818); arg0.method4887(var8) > var6; var8 = var8.substring(1)) {
                }
                arg0.method4891(class270.field3466 + var8, field817 + 180 - 108, var78, 16777215, 0);
                var78 += 15;
            }
        }
        if (client.field413 == 10 || client.field413 == 11) {
            Statics.field3760.method6348(field817, 171);
            if (field812 == 0) {
                short var9 = 251;
                arg0.method4955(class270.field3304, field817 + 180, var9, 16776960, 0);
                int var82 = var9 + 30;
                int var10 = field817 + 180 - 80;
                short var11 = 291;
                Statics.field801.method6348(var10 - 73, var11 - 20);
                arg0.method4895(class270.field3472, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field817 + 180 + 80;
                Statics.field801.method6348(var12 - 73, var11 - 20);
                arg0.method4895(class270.field3473, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field812 == 1) {
                arg0.method4955(field799, field817 + 180, 201, 16776960, 0);
                short var13 = 236;
                arg0.method4955(field823, field817 + 180, var13, 16777215, 0);
                int var83 = var13 + 15;
                arg0.method4955(field814, field817 + 180, var83, 16777215, 0);
                int var84 = var83 + 15;
                arg0.method4955(field816, field817 + 180, var84, 16777215, 0);
                int var85 = var84 + 15;
                int var14 = field817 + 180 - 80;
                short var15 = 321;
                Statics.field801.method6348(var14 - 73, var15 - 20);
                arg0.method4955(class270.field3232, var14, var15 + 5, 16777215, 0);
                int var16 = field817 + 180 + 80;
                Statics.field801.method6348(var16 - 73, var15 - 20);
                arg0.method4955(class270.field3479, var16, var15 + 5, 16777215, 0);
            } else if (field812 == 2) {
                short var17 = 201;
                arg0.method4955(field823, Statics.field1932, var17, 16776960, 0);
                int var86 = var17 + 15;
                arg0.method4955(field814, Statics.field1932, var86, 16776960, 0);
                int var87 = var86 + 15;
                arg0.method4955(field816, Statics.field1932, var87, 16776960, 0);
                int var88 = var87 + 15;
                int var89 = var88 + 7;
                arg0.method4891(class270.field3475, Statics.field1932 - 110, var89, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = method2130(); arg0.method4887(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method4891(class303.method4948(var19) + (field822 == 0 & client.field452 % 40 < 20 ? class79.method786(16776960) + class79.field1138 : ""), Statics.field1932 - 70, var89, 16777215, 0);
                var86 = var89 + 15;
                String var20;
                for (var20 = class306.method172(field818); arg0.method4887(var20) > var18; var20 = var20.substring(1)) {
                }
                arg0.method4891(class270.field3466 + var20 + (field822 == 1 & client.field452 % 40 < 20 ? class79.method786(16776960) + class79.field1138 : ""), Statics.field1932 - 108, var86, 16777215, 0);
                var86 += 15;
                short var21 = 277;
                int var22 = Statics.field1932 + -117;
                class397 var23 = method4686(client.field443, field830);
                var23.method6348(var22, var21);
                int var24 = var23.field4263 + 5 + var22;
                arg1.method4891(class270.field3476, var24, var21 + 13, 16776960, 0);
                int var25 = Statics.field1932 + 24;
                class397 var26 = method4686(Statics.field308.field1117, field820);
                var26.method6348(var25, var21);
                int var27 = var26.field4263 + 5 + var25;
                arg1.method4891(class270.field3477, var27, var21 + 13, 16776960, 0);
                int var90 = var21 + 15;
                int var28 = Statics.field1932 - 80;
                short var29 = 321;
                Statics.field801.method6348(var28 - 73, var29 - 20);
                arg0.method4955(class270.field3474, var28, var29 + 5, 16777215, 0);
                int var30 = Statics.field1932 + 80;
                Statics.field801.method6348(var30 - 73, var29 - 20);
                arg0.method4955(class270.field3479, var30, var29 + 5, 16777215, 0);
                short var31 = 357;
                switch(field810) {
                    case 2:
                        Statics.field704 = class270.field3489;
                        break;
                    default:
                        Statics.field704 = class270.field3457;
                }
                Statics.field128 = new class337(Statics.field1932, var31, arg1.method4887(Statics.field704), 11);
                Statics.field3767 = new class337(Statics.field1932, var31, arg1.method4887(class270.field3488), 11);
                arg1.method4955(Statics.field704, Statics.field1932, var31, 16777215, 0);
            } else if (field812 == 3) {
                short var32 = 201;
                arg0.method4955(class270.field3478, field817 + 180, var32, 16776960, 0);
                int var91 = var32 + 20;
                arg1.method4955(class270.field3428, field817 + 180, var91, 16776960, 0);
                int var92 = var91 + 15;
                arg1.method4955(class270.field3480, field817 + 180, var92, 16776960, 0);
                int var93 = var92 + 15;
                int var33 = field817 + 180;
                short var34 = 276;
                Statics.field801.method6348(var33 - 73, var34 - 20);
                arg2.method4955(class270.field3336, var33, var34 + 5, 16777215, 0);
                int var35 = field817 + 180;
                short var36 = 326;
                Statics.field801.method6348(var35 - 73, var36 - 20);
                arg2.method4955(class270.field3482, var35, var36 + 5, 16777215, 0);
            } else if (field812 == 4) {
                arg0.method4955(class270.field3515, field817 + 180, 201, 16776960, 0);
                short var37 = 236;
                arg0.method4955(field823, field817 + 180, var37, 16777215, 0);
                int var94 = var37 + 15;
                arg0.method4955(field814, field817 + 180, var94, 16777215, 0);
                int var95 = var94 + 15;
                arg0.method4955(field816, field817 + 180, var95, 16777215, 0);
                int var96 = var95 + 15;
                arg0.method4891(class270.field3442 + class306.method172(Statics.field1615) + (client.field452 % 40 < 20 ? class79.method786(16776960) + class79.field1138 : ""), field817 + 180 - 108, var96, 16777215, 0);
                int var97 = var96 - 8;
                arg0.method4891(class270.field3235, field817 + 180 - 9, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg0.method4891(class270.field3236, field817 + 180 - 9, var98, 16776960, 0);
                int var38 = field817 + 180 - 9 + arg0.method4887(class270.field3236) + 15;
                int var39 = var98 - arg0.field3738;
                class397 var40;
                if (field821) {
                    var40 = Statics.field2014;
                } else {
                    var40 = Statics.field397;
                }
                var40.method6348(var38, var39);
                var94 = var98 + 15;
                int var41 = field817 + 180 - 80;
                short var42 = 321;
                Statics.field801.method6348(var41 - 73, var42 - 20);
                arg0.method4955(class270.field3232, var41, var42 + 5, 16777215, 0);
                int var43 = field817 + 180 + 80;
                Statics.field801.method6348(var43 - 73, var42 - 20);
                arg0.method4955(class270.field3479, var43, var42 + 5, 16777215, 0);
                arg1.method4955(class270.field3458, field817 + 180, var42 + 36, 255, 0);
            } else if (field812 == 5) {
                arg0.method4955(class270.field3483, field817 + 180, 201, 16776960, 0);
                short var44 = 221;
                arg2.method4955(field823, field817 + 180, var44, 16776960, 0);
                int var99 = var44 + 15;
                arg2.method4955(field814, field817 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg2.method4955(field816, field817 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var102 = var101 + 14;
                arg0.method4891(class270.field3244, field817 + 180 - 145, var102, 16777215, 0);
                short var45 = 174;
                String var46;
                for (var46 = method2130(); arg0.method4887(var46) > var45; var46 = var46.substring(1)) {
                }
                arg0.method4891(class303.method4948(var46) + (client.field452 % 40 < 20 ? class79.method786(16776960) + class79.field1138 : ""), field817 + 180 - 34, var102, 16777215, 0);
                var99 = var102 + 15;
                int var47 = field817 + 180 - 80;
                short var48 = 321;
                Statics.field801.method6348(var47 - 73, var48 - 20);
                arg0.method4955(class270.field3443, var47, var48 + 5, 16777215, 0);
                int var49 = field817 + 180 + 80;
                Statics.field801.method6348(var49 - 73, var48 - 20);
                arg0.method4955(class270.field3486, var49, var48 + 5, 16777215, 0);
                short var50 = 356;
                arg1.method4955(class270.field3488, Statics.field1932, var50, 268435455, 0);
            } else if (field812 == 6) {
                short var51 = 201;
                arg0.method4955(field823, field817 + 180, var51, 16776960, 0);
                int var103 = var51 + 15;
                arg0.method4955(field814, field817 + 180, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg0.method4955(field816, field817 + 180, var104, 16776960, 0);
                int var105 = var104 + 15;
                int var52 = field817 + 180;
                short var53 = 321;
                Statics.field801.method6348(var52 - 73, var53 - 20);
                arg0.method4955(class270.field3486, var52, var53 + 5, 16777215, 0);
            } else if (field812 == 7) {
                short var54 = 216;
                arg0.method4955(class270.field3332, field817 + 180, var54, 16776960, 0);
                int var106 = var54 + 15;
                arg2.method4955(class270.field3252, field817 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                arg2.method4955(class270.field3516, field817 + 180, var107, 16776960, 0);
                int var108 = var107 + 15;
                int var55 = field817 + 180 - 80;
                short var56 = 321;
                Statics.field801.method6348(var55 - 73, var56 - 20);
                arg0.method4955(class270.field3435, var55, var56 + 5, 16777215, 0);
                int var57 = field817 + 180 + 80;
                Statics.field801.method6348(var57 - 73, var56 - 20);
                arg0.method4955(class270.field3486, var57, var56 + 5, 16777215, 0);
            } else if (field812 == 8) {
                short var58 = 216;
                arg0.method4955(class270.field3511, field817 + 180, var58, 16776960, 0);
                int var109 = var58 + 15;
                arg2.method4955(class270.field3481, field817 + 180, var109, 16776960, 0);
                int var110 = var109 + 15;
                arg2.method4955(class270.field3366, field817 + 180, var110, 16776960, 0);
                int var111 = var110 + 15;
                int var59 = field817 + 180 - 80;
                short var60 = 321;
                Statics.field801.method6348(var59 - 73, var60 - 20);
                arg0.method4955(class270.field3367, var59, var60 + 5, 16777215, 0);
                int var61 = field817 + 180 + 80;
                Statics.field801.method6348(var61 - 73, var60 - 20);
                arg0.method4955(class270.field3486, var61, var60 + 5, 16777215, 0);
            } else if (field812 == 12) {
                short var62 = 201;
                String var63 = "";
                String var64 = "";
                String var65 = "";
                switch(field805) {
                    case 0:
                        var63 = class270.field3280;
                        var64 = class270.field3299;
                        var65 = class270.field3282;
                        break;
                    case 1:
                        var63 = class270.field3319;
                        var64 = class270.field3468;
                        var65 = class270.field3321;
                        break;
                    default:
                        method2127(false);
                }
                arg0.method4955(var63, field817 + 180, var62, 16776960, 0);
                int var112 = var62 + 15;
                arg2.method4955(var64, field817 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                arg2.method4955(var65, field817 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                int var66 = field817 + 180;
                short var67 = 276;
                Statics.field801.method6348(var66 - 73, var67 - 20);
                arg0.method4955(class270.field3504, var66, var67 + 5, 16777215, 0);
                int var68 = field817 + 180;
                short var69 = 326;
                Statics.field801.method6348(var68 - 73, var69 - 20);
                arg0.method4955(class270.field3486, var68, var69 + 5, 16777215, 0);
            } else if (field812 == 24) {
                short var70 = 221;
                arg0.method4955(field823, field817 + 180, var70, 16777215, 0);
                int var115 = var70 + 15;
                arg0.method4955(field814, field817 + 180, var115, 16777215, 0);
                int var116 = var115 + 15;
                arg0.method4955(field816, field817 + 180, var116, 16777215, 0);
                int var117 = var116 + 15;
                int var71 = field817 + 180;
                short var72 = 301;
                Statics.field801.method6348(var71 - 73, var72 - 20);
                arg0.method4955(class270.field3230, var71, var72 + 5, 16777215, 0);
            }
        }
        if (client.field413 >= 10) {
            int[] var73 = new int[4];
            class394.method6266(var73);
            class394.method6286(field825, 0, field825 + 765, Statics.field687);
            Statics.field16.method1799(field825 - 22, client.field452);
            Statics.field16.method1799(field825 + 765 + 22 - 128, client.field452);
            class394.method6267(var73);
        }
        Statics.field1486[Statics.field308.field1114 ? 1 : 0].method6348(field825 + 765 - 40, 463);
        if (client.field413 <= 5 || Statics.field3644 != class292.field3694) {
            return;
        }
        if (Statics.field2847 == null) {
            Statics.field2847 = class399.method2219(Statics.field3536, "sl_button", "");
            return;
        }
        int var74 = field825 + 5;
        short var75 = 463;
        byte var76 = 100;
        byte var77 = 35;
        Statics.field2847.method6348(var74, var75);
        arg0.method4955(class270.field3395 + " " + client.field405, var76 / 2 + var74, var77 / 2 + var75 - 2, 16777215, 0);
        if (Statics.field1135 == null) {
            arg1.method4955(class270.field3528, var76 / 2 + var74, var77 / 2 + var75 + 12, 16777215, 0);
        } else {
            arg1.method4955(class270.field3527, var76 / 2 + var74, var77 / 2 + var75 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("client.x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1294(String arg0, String arg1, String arg2) {
        field823 = arg0;
        field814 = arg1;
        field816 = arg2;
    }

    @ObfuscatedName("aw.r(Lkt;Lkt;I)V")
    public static void method1557(class302 arg0, class302 arg1) {
        if (Statics.field2127 == null) {
            Statics.field2127 = class399.method1642(Statics.field3536, "sl_back", "");
        }
        if (Statics.field770 == null) {
            class275 var2 = Statics.field3536;
            int var3 = var2.method4474("sl_flags");
            int var4 = var2.method4476(var3, "");
            class397[] var5 = Statics.method2333(var2, var3, var4);
            Statics.field770 = var5;
        }
        if (Statics.field392 == null) {
            class275 var6 = Statics.field3536;
            int var7 = var6.method4474("sl_arrows");
            int var8 = var6.method4476(var7, "");
            class397[] var9 = Statics.method2333(var6, var7, var8);
            Statics.field392 = var9;
        }
        if (Statics.field897 == null) {
            class275 var10 = Statics.field3536;
            int var11 = var10.method4474("sl_stars");
            int var12 = var10.method4476(var11, "");
            class397[] var13 = Statics.method2333(var10, var11, var12);
            Statics.field897 = var13;
        }
        if (Statics.field1520 == null) {
            Statics.field1520 = class399.method2219(Statics.field3536, "leftarrow", "");
        }
        if (Statics.field1257 == null) {
            Statics.field1257 = class399.method2219(Statics.field3536, "rightarrow", "");
        }
        class394.method6272(field825, 23, 765, 480, 0);
        class394.method6273(field825, 0, 125, 23, 12425273, 9135624);
        class394.method6273(field825 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4955(class270.field3518, field825 + 62, 15, 0, -1);
        if (Statics.field897 != null) {
            Statics.field897[1].method6348(field825 + 140, 1);
            arg1.method4891(class270.field3289, field825 + 152, 10, 16777215, -1);
            Statics.field897[0].method6348(field825 + 140, 12);
            arg1.method4891(class270.field3520, field825 + 152, 21, 16777215, -1);
        }
        if (Statics.field392 != null) {
            int var14 = field825 + 280;
            if (class48.field696[0] == 0 && class48.field695[0] == 0) {
                Statics.field392[2].method6348(var14, 4);
            } else {
                Statics.field392[0].method6348(var14, 4);
            }
            if (class48.field696[0] == 0 && class48.field695[0] == 1) {
                Statics.field392[3].method6348(var14 + 15, 4);
            } else {
                Statics.field392[1].method6348(var14 + 15, 4);
            }
            arg0.method4891(class270.field3521, var14 + 32, 17, 16777215, -1);
            int var15 = field825 + 390;
            if (class48.field696[0] == 1 && class48.field695[0] == 0) {
                Statics.field392[2].method6348(var15, 4);
            } else {
                Statics.field392[0].method6348(var15, 4);
            }
            if (class48.field696[0] == 1 && class48.field695[0] == 1) {
                Statics.field392[3].method6348(var15 + 15, 4);
            } else {
                Statics.field392[1].method6348(var15 + 15, 4);
            }
            arg0.method4891(class270.field3349, var15 + 32, 17, 16777215, -1);
            int var16 = field825 + 500;
            if (class48.field696[0] == 2 && class48.field695[0] == 0) {
                Statics.field392[2].method6348(var16, 4);
            } else {
                Statics.field392[0].method6348(var16, 4);
            }
            if (class48.field696[0] == 2 && class48.field695[0] == 1) {
                Statics.field392[3].method6348(var16 + 15, 4);
            } else {
                Statics.field392[1].method6348(var16 + 15, 4);
            }
            arg0.method4891(class270.field3523, var16 + 32, 17, 16777215, -1);
            int var17 = field825 + 610;
            if (class48.field696[0] == 3 && class48.field695[0] == 0) {
                Statics.field392[2].method6348(var17, 4);
            } else {
                Statics.field392[0].method6348(var17, 4);
            }
            if (class48.field696[0] == 3 && class48.field695[0] == 1) {
                Statics.field392[3].method6348(var17 + 15, 4);
            } else {
                Statics.field392[1].method6348(var17 + 15, 4);
            }
            arg0.method4891(class270.field3524, var17 + 32, 17, 16777215, -1);
        }
        class394.method6272(field825 + 708, 4, 50, 16, 0);
        arg1.method4955(class270.field3479, field825 + 708 + 25, 16, 16777215, -1);
        field826 = -1;
        if (Statics.field2127 != null) {
            byte var18 = 88;
            byte var19 = 19;
            int var20 = 765 / (var18 + 1) - 1;
            int var21 = 480 / (var19 + 1);
            int var22;
            int var23;
            do {
                var22 = var21;
                var23 = var20;
                if ((var20 - 1) * var21 >= class48.field692) {
                    var20--;
                }
                if ((var21 - 1) * var20 >= class48.field692) {
                    var21--;
                }
                if ((var21 - 1) * var20 >= class48.field692) {
                    var21--;
                }
            } while (var21 != var22 || var20 != var23);
            int var24 = (765 - var18 * var20) / (var20 + 1);
            if (var24 > 5) {
                var24 = 5;
            }
            int var25 = (480 - var19 * var21) / (var21 + 1);
            if (var25 > 5) {
                var25 = 5;
            }
            int var26 = (765 - var18 * var20 - (var20 - 1) * var24) / 2;
            int var27 = (480 - var19 * var21 - (var21 - 1) * var25) / 2;
            int var28 = (class48.field692 + var21 - 1) / var21;
            field828 = var28 - var20;
            if (Statics.field1520 != null && field827 > 0) {
                Statics.field1520.method6348(8, Statics.field687 / 2 - Statics.field1520.field4264 / 2);
            }
            if (Statics.field1257 != null && field827 < field828) {
                Statics.field1257.method6348(Statics.field971 - Statics.field1257.field4263 - 8, Statics.field687 / 2 - Statics.field1257.field4264 / 2);
            }
            int var29 = var27 + 23;
            int var30 = field825 + var26;
            int var31 = 0;
            boolean var32 = false;
            int var33 = field827;
            for (int var34 = var21 * var33; var34 < class48.field692 && var33 - field827 < var20; var34++) {
                class48 var35 = Statics.field86[var34];
                boolean var36 = true;
                String var37 = Integer.toString(var35.field699);
                if (var35.field699 == -1) {
                    var37 = class270.field3270;
                    var36 = false;
                } else if (var35.field699 > 1980) {
                    var37 = class270.field3526;
                    var36 = false;
                }
                int var38 = 0;
                byte var39;
                if (var35.method1312()) {
                    if (var35.method1296()) {
                        var39 = 7;
                    } else {
                        var39 = 6;
                    }
                } else if (var35.method1300()) {
                    var38 = 16711680;
                    if (var35.method1296()) {
                        var39 = 5;
                    } else {
                        var39 = 4;
                    }
                } else if (var35.method1319()) {
                    if (var35.method1296()) {
                        var39 = 9;
                    } else {
                        var39 = 8;
                    }
                } else if (var35.method1298()) {
                    if (var35.method1296()) {
                        var39 = 3;
                    } else {
                        var39 = 2;
                    }
                } else if (var35.method1296()) {
                    var39 = 1;
                } else {
                    var39 = 0;
                }
                if (class20.field142 >= var30 && class20.field145 >= var29 && class20.field142 < var18 + var30 && class20.field145 < var19 + var29 && var36) {
                    field826 = var34;
                    Statics.field2127[var39].method6382(var30, var29, 128, 16777215);
                    var32 = true;
                } else {
                    Statics.field2127[var39].method6445(var30, var29);
                }
                if (Statics.field770 != null) {
                    Statics.field770[(var35.method1296() ? 8 : 0) + var35.field702].method6348(var30 + 29, var29);
                }
                arg0.method4955(Integer.toString(var35.field697), var30 + 15, var19 / 2 + var29 + 5, var38, -1);
                arg1.method4955(var37, var30 + 60, var19 / 2 + var29 + 5, 268435455, -1);
                var29 += var19 + var25;
                var31++;
                if (var31 >= var21) {
                    var29 = var27 + 23;
                    var30 += var18 + var24;
                    var31 = 0;
                    var33++;
                }
            }
            if (var32) {
                int var40 = arg1.method4887(Statics.field86[field826].field690) + 6;
                int var41 = arg1.field3738 + 8;
                int var42 = class20.field145 + 25;
                if (var41 + var42 > 480) {
                    var42 = class20.field145 - 25 - var41;
                }
                class394.method6272(class20.field142 - var40 / 2, var42, var40, var41, 16777120);
                class394.method6299(class20.field142 - var40 / 2, var42, var40, var41, 0);
                arg1.method4955(Statics.field86[field826].field690, class20.field142, arg1.field3738 + var42 + 4, 0, -1);
            }
        }
        Statics.field3194.method176(0, 0);
    }

    @ObfuscatedName("fh.p(Lag;B)V")
    public static void method2760(class48 arg0) {
        if (arg0.method1296() != client.field562) {
            client.field562 = arg0.method1296();
            class157.method2573(arg0.method1296());
        }
        if (client.field406 != arg0.field700) {
            class275 var1 = Statics.field3536;
            int var2 = arg0.field700;
            if ((var2 & 0x20000000) != 0) {
                Statics.field1229 = class399.method2219(var1, "logo_deadman_mode", "");
            } else if ((var2 & 0x40000000) == 0) {
                Statics.field1229 = class399.method2219(var1, "logo", "");
            } else {
                Statics.field1229 = class399.method2219(var1, "logo_seasonal_mode", "");
            }
        }
        Statics.field2918 = arg0.field701;
        client.field405 = arg0.field697;
        client.field406 = arg0.field700;
        Statics.field1982 = client.field407 == 0 ? 43594 : arg0.field697 + 40000;
        Statics.field7 = client.field407 == 0 ? 443 : arg0.field697 + 50000;
        Statics.field3679 = Statics.field1982;
    }

    @ObfuscatedName("dj.h(I)V")
    public static void method2216() {
        field800 = false;
        Statics.field815.method6445(field825, 0);
        Statics.field803.method6445(field825 + 382, 0);
        Statics.field1229.method6348(field825 + 382 - Statics.field1229.field4263 / 2, 18);
    }

    @ObfuscatedName("lp.k(B)V")
    public static void method5307() {
        field812 = 24;
        method1294(class270.field3462, class270.field3327, class270.field3464);
    }

    @ObfuscatedName("id.a(B)V")
    public static void method4361() {
        field812 = 24;
        method1294(class270.field3292, class270.field3264, class270.field3467);
    }
}
