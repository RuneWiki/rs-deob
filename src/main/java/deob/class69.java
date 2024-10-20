package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;

@ObfuscatedName("bc")
public class class69 {

    @ObfuscatedName("bc.s")
    public static int field851 = 0;

    @ObfuscatedName("bc.m")
    public static int field860 = field851 + 202;

    @ObfuscatedName("bc.f")
    public static int field862 = 10;

    @ObfuscatedName("bc.h")
    public static String field863 = "";

    @ObfuscatedName("bc.ax")
    public static int field867 = -1;

    @ObfuscatedName("bc.au")
    public static int field866 = 1;

    @ObfuscatedName("bc.ao")
    public static int field853 = 0;

    @ObfuscatedName("bc.aa")
    public static String field868 = "";

    @ObfuscatedName("bc.ay")
    public static String field883 = "";

    @ObfuscatedName("bc.bg")
    public static String field870 = "";

    @ObfuscatedName("bc.bl")
    public static String field871 = "";

    @ObfuscatedName("bc.bx")
    public static String field854 = "";

    @ObfuscatedName("bc.bd")
    public static String field873 = "";

    @ObfuscatedName("bc.br")
    public static boolean field874 = false;

    @ObfuscatedName("bc.bj")
    public static boolean field861 = false;

    @ObfuscatedName("bc.bu")
    public static boolean field876 = true;

    @ObfuscatedName("bc.bz")
    public static int field849 = 0;

    @ObfuscatedName("bc.bc")
    public static String field878 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("bc.bi")
    public static String field879 = "1234567890";

    @ObfuscatedName("bc.bp")
    public static boolean field880 = false;

    @ObfuscatedName("bc.cq")
    public static int field881 = -1;

    @ObfuscatedName("bc.ck")
    public static int field882 = 0;

    @ObfuscatedName("bc.ci")
    public static int field865 = 0;

    @ObfuscatedName("bc.cn")
    public static long field877;

    @ObfuscatedName("bc.ct")
    public static long field885;

    @ObfuscatedName("bc.cd")
    public static String[] field886;

    @ObfuscatedName("bc.cj")
    public static String[] field872;

    static {
        new DecimalFormat("##0.00");
        new class112();
        field877 = -1L;
        field885 = -1L;
        field886 = new String[] { "title.jpg" };
        field872 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
    }

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.i(I)I")
    public static int method1040() {
        return field886.length + field872.length;
    }

    @ObfuscatedName("dp.w(Lko;Lko;ZII)V")
    public static void method2390(class290 arg0, class290 arg1, boolean arg2, int arg3) {
        if (!Statics.field850) {
            if (arg3 == 0) {
                method2787(arg2);
            } else {
                method4653(arg3);
            }
            class410.method6523();
            byte[] var4 = arg0.method4762("title.jpg", "");
            Object var5 = null;
            class414 var11;
            label61: {
                try {
                    BufferedImage var6 = ImageIO.read(new ByteArrayInputStream(var4));
                    int var7 = var6.getWidth();
                    int var8 = var6.getHeight();
                    int[] var9 = new int[var7 * var8];
                    PixelGrabber var10 = new PixelGrabber(var6, 0, 0, var7, var8, var9, 0, var7);
                    var10.grabPixels();
                    var11 = new class414(var9, var7, var8);
                    break label61;
                } catch (IOException var23) {
                } catch (InterruptedException var24) {
                }
                var11 = new class414(0, 0);
            }
            Statics.field1986 = var11;
            Statics.field1531 = Statics.field1986.method6664();
            int var14 = client.field464;
            if ((var14 & 0x20000000) != 0) {
                Statics.field72 = class415.method1882(arg1, "logo_deadman_mode", "");
            } else if ((var14 & 0x40000000) == 0) {
                Statics.field72 = class415.method1882(arg1, "logo", "");
            } else {
                Statics.field72 = class415.method1882(arg1, "logo_seasonal_mode", "");
            }
            Statics.field887 = class415.method1882(arg1, "titlebox", "");
            Statics.field884 = class415.method1882(arg1, "titlebutton", "");
            Statics.field855 = class415.method1882(arg1, "titlebutton_large", "");
            Statics.field160 = class415.method1882(arg1, "play_now_text", "");
            class415.method1882(arg1, "titlebutton_wide42,1", "");
            Statics.field852 = class415.method6158(arg1, "runes", "");
            Statics.field1614 = class415.method6158(arg1, "title_mute", "");
            Statics.field1576 = class415.method1882(arg1, "options_radio_buttons,0", "");
            Statics.field869 = class415.method1882(arg1, "options_radio_buttons,4", "");
            Statics.field27 = class415.method1882(arg1, "options_radio_buttons,2", "");
            Statics.field3951 = class415.method1882(arg1, "options_radio_buttons,6", "");
            Statics.field3909 = Statics.field1576.field4387;
            Statics.field1327 = Statics.field1576.field4388;
            Statics.field857 = new class87(Statics.field852);
            if (arg2) {
                field854 = "";
                field873 = "";
            }
            Statics.field430 = 0;
            Statics.field973 = "";
            field876 = true;
            field880 = false;
            if (Statics.field4363.field1186) {
                class248.field2923 = 1;
                Statics.field1471 = null;
                Statics.field4377 = -1;
                Statics.field3668 = -1;
                Statics.field2925 = 0;
                Statics.field975 = false;
                Statics.field2926 = 2;
            } else {
                class288 var15 = Statics.field1270;
                int var16 = var15.method4759("scape main");
                int var17 = var15.method4760(var16, "");
                class248.field2923 = 1;
                Statics.field1471 = var15;
                Statics.field4377 = var16;
                Statics.field3668 = var17;
                Statics.field2925 = 255;
                Statics.field975 = false;
                Statics.field2926 = 2;
            }
            if (Statics.field3716 != null) {
                try {
                    class401 var18 = new class401(4);
                    var18.method6223(3);
                    var18.method6225(0);
                    Statics.field3716.method2642(var18.field4302, 0, 4);
                } catch (IOException var22) {
                    try {
                        Statics.field3716.method2613();
                    } catch (Exception var21) {
                    }
                    class291.field3722++;
                    Statics.field3716 = null;
                }
            }
            Statics.field850 = true;
            field851 = (Statics.field184 - 765) / 2;
            field860 = field851 + 202;
            Statics.field875 = field860 + 180;
            Statics.field1986.method6643(field851, 0);
            Statics.field1531.method6643(field851 + 382, 0);
            Statics.field72.method6611(field851 + 382 - Statics.field72.field4387 / 2, 18);
        } else if (arg3 == 4) {
            method4653(4);
        }
    }

    @ObfuscatedName("kg.s(S)V")
    public static void method4698() {
        if (!Statics.field850) {
            return;
        }
        Statics.field887 = null;
        Statics.field884 = null;
        Statics.field852 = null;
        Statics.field1986 = null;
        Statics.field1531 = null;
        Statics.field72 = null;
        Statics.field1614 = null;
        Statics.field1576 = null;
        Statics.field27 = null;
        Statics.field3211 = null;
        Statics.field1313 = null;
        Statics.field416 = null;
        Statics.field135 = null;
        Statics.field55 = null;
        Statics.field857.method2077();
        class248.field2923 = 1;
        Statics.field1471 = null;
        Statics.field4377 = -1;
        Statics.field3668 = -1;
        Statics.field2925 = 0;
        Statics.field975 = false;
        Statics.field2926 = 2;
        if (Statics.field3716 != null) {
            try {
                class401 var0 = new class401(4);
                var0.method6223(2);
                var0.method6225(0);
                Statics.field3716.method2642(var0.field4302, 0, 4);
            } catch (IOException var4) {
                try {
                    Statics.field3716.method2613();
                } catch (Exception var3) {
                }
                class291.field3722++;
                Statics.field3716 = null;
            }
        }
        Statics.field850 = false;
    }

    @ObfuscatedName("fn.a(B)V")
    public static void method2898() {
        if (client.field505 && field854 != null && field854.length() > 0) {
            field849 = 1;
        } else {
            field849 = 0;
        }
    }

    @ObfuscatedName("js.o(Lai;Lle;I)V")
    public static void method4649(class32 arg0, class315 arg1) {
        if (field880) {
            method732(arg0);
            return;
        }
        if ((class33.field219 == 1 || !Statics.field455 && class33.field219 == 4) && class33.field220 >= field851 + 765 - 50 && class33.field224 >= 453) {
            Statics.field4363.field1186 = !Statics.field4363.field1186;
            class89.method1836();
            if (Statics.field4363.field1186) {
                class248.method3598();
            } else {
                class288 var2 = Statics.field1270;
                int var3 = var2.method4759("scape main");
                int var4 = var2.method4760(var3, "");
                class248.field2923 = 1;
                Statics.field1471 = var2;
                Statics.field4377 = var3;
                Statics.field3668 = var4;
                Statics.field2925 = 255;
                Statics.field975 = false;
                Statics.field2926 = 10000;
            }
        }
        if (client.field642 == 5) {
            return;
        }
        if (field877 == -1L) {
            field877 = class398.method2381() + 1000L;
        }
        long var5 = class398.method2381();
        if (client.method1547() && field885 == -1L) {
            field885 = var5;
            if (field885 > field877) {
                field877 = field885;
            }
        }
        if (client.field642 != 10 && client.field642 != 11) {
            return;
        }
        if (Statics.field207 == class305.field3788) {
            if (class33.field219 == 1 || !Statics.field455 && class33.field219 == 4) {
                int var7 = field851 + 5;
                short var8 = 463;
                byte var9 = 100;
                byte var10 = 35;
                if (class33.field220 >= var7 && class33.field220 <= var7 + var9 && class33.field224 >= var8 && class33.field224 <= var8 + var10) {
                    if (class61.method4434()) {
                        field880 = true;
                        field882 = 0;
                        field865 = 0;
                    }
                    return;
                }
            }
            if (Statics.field100 != null && class61.method4434()) {
                field880 = true;
                field882 = 0;
                field865 = 0;
            }
        }
        int var11 = class33.field219;
        int var12 = class33.field220;
        int var13 = class33.field224;
        if (var11 == 0) {
            var12 = class33.field212;
            var13 = class33.field221;
        }
        if (!Statics.field455 && var11 == 4) {
            var11 = 1;
        }
        if (field853 == 0) {
            boolean var14 = false;
            while (class24.method2714()) {
                if (Statics.field56 == 84) {
                    var14 = true;
                }
            }
            int var15 = Statics.field875 - 80;
            short var16 = 291;
            if (var11 == 1 && var12 >= var15 - 75 && var12 <= var15 + 75 && var13 >= var16 - 20 && var13 <= var16 + 20) {
                class30.method2146(client.method2130("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var17 = Statics.field875 + 80;
            if (var11 == 1 && var12 >= var17 - 75 && var12 <= var17 + 75 && var13 >= var16 - 20 && var13 <= var16 + 20 || var14) {
                if ((client.field464 & 0x2000000) != 0) {
                    field868 = "";
                    field883 = class283.field3554;
                    field870 = class283.field3555;
                    field871 = class283.field3556;
                    method4653(1);
                    method2898();
                } else if ((client.field464 & 0x4) != 0) {
                    if ((client.field464 & 0x400) == 0) {
                        field883 = class283.field3545;
                        field870 = class283.field3546;
                        field871 = class283.field3551;
                    } else {
                        field883 = class283.field3349;
                        field870 = class283.field3552;
                        field871 = class283.field3466;
                    }
                    field868 = class283.field3544;
                    method4653(1);
                    method2898();
                } else if ((client.field464 & 0x400) == 0) {
                    method15(false);
                } else {
                    field883 = class283.field3508;
                    field870 = class283.field3549;
                    field871 = class283.field3550;
                    field868 = class283.field3544;
                    method4653(1);
                    method2898();
                }
            }
        } else if (field853 == 1) {
            while (true) {
                if (!class24.method2714()) {
                    int var18 = Statics.field875 - 80;
                    short var19 = 321;
                    if (var11 == 1 && var12 >= var18 - 75 && var12 <= var18 + 75 && var13 >= var19 - 20 && var13 <= var19 + 20) {
                        method15(false);
                    }
                    int var20 = Statics.field875 + 80;
                    if (var11 == 1 && var12 >= var20 - 75 && var12 <= var20 + 75 && var13 >= var19 - 20 && var13 <= var19 + 20) {
                        method4653(0);
                    }
                    break;
                }
                if (Statics.field56 == 84) {
                    method15(false);
                } else if (Statics.field56 == 13) {
                    method4653(0);
                }
            }
        } else if (field853 == 2) {
            short var21 = 201;
            int var88 = var21 + 52;
            if (var11 == 1 && var13 >= var88 - 12 && var13 < var88 + 2) {
                field849 = 0;
            }
            var88 += 15;
            if (var11 == 1 && var13 >= var88 - 12 && var13 < var88 + 2) {
                field849 = 1;
            }
            var88 += 15;
            short var22 = 361;
            if (Statics.field1360 != null) {
                int var23 = Statics.field1360.field4022 / 2;
                if (var11 == 1 && var12 >= Statics.field1360.field4021 - var23 && var12 <= Statics.field1360.field4021 + var23 && var13 >= var22 - 15 && var13 < var22) {
                    switch(field866) {
                        case 1:
                            method17(class283.field3593, class283.field3613, class283.field3595);
                            method4653(5);
                            return;
                        case 2:
                            class30.method2146("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var24 = Statics.field875 - 80;
            short var25 = 321;
            if (var11 == 1 && var12 >= var24 - 75 && var12 <= var24 + 75 && var13 >= var25 - 20 && var13 <= var25 + 20) {
                field854 = field854.trim();
                if (field854.length() == 0) {
                    method17(class283.field3582, class283.field3548, class283.field3439);
                    return;
                }
                if (field873.length() == 0) {
                    method17(class283.field3440, class283.field3441, class283.field3442);
                    return;
                }
                method17(class283.field3559, class283.field3594, class283.field3561);
                client.method3264(false);
                client.method3496(20);
                return;
            }
            int var26 = field860 + 180 + 80;
            if (var11 == 1 && var12 >= var26 - 75 && var12 <= var26 + 75 && var13 >= var25 - 20 && var13 <= var25 + 20) {
                method4653(0);
                field854 = "";
                field873 = "";
                Statics.field430 = 0;
                Statics.field973 = "";
                field876 = true;
            }
            int var27 = Statics.field875 + -117;
            short var28 = 277;
            field874 = var12 >= var27 && var12 < Statics.field3909 + var27 && var13 >= var28 && var13 < Statics.field1327 + var28;
            if (var11 == 1 && field874) {
                client.field505 = !client.field505;
                if (!client.field505 && Statics.field4363.field1188 != null) {
                    Statics.field4363.field1188 = null;
                    class89.method1836();
                }
            }
            int var29 = Statics.field875 + 24;
            short var30 = 277;
            field861 = var12 >= var29 && var12 < Statics.field3909 + var29 && var13 >= var30 && var13 < Statics.field1327 + var30;
            if (var11 == 1 && field861) {
                Statics.field4363.field1185 = !Statics.field4363.field1185;
                if (!Statics.field4363.field1185) {
                    field854 = "";
                    Statics.field4363.field1188 = null;
                    method2898();
                }
                class89.method1836();
            }
            while (true) {
                Transferable var34;
                int var35;
                do {
                    while (true) {
                        label796: do {
                            while (true) {
                                while (class24.method2714()) {
                                    if (Statics.field56 == 13) {
                                        method4653(0);
                                        field854 = "";
                                        field873 = "";
                                        Statics.field430 = 0;
                                        Statics.field973 = "";
                                        field876 = true;
                                    } else {
                                        if (field849 != 0) {
                                            continue label796;
                                        }
                                        char var31 = Statics.field3859;
                                        for (int var32 = 0; var32 < field878.length() && var31 != field878.charAt(var32); var32++) {
                                        }
                                        if (Statics.field56 == 85 && field854.length() > 0) {
                                            field854 = field854.substring(0, field854.length() - 1);
                                        }
                                        if (Statics.field56 == 84 || Statics.field56 == 80) {
                                            field849 = 1;
                                        }
                                        if (method1895(Statics.field3859) && field854.length() < 320) {
                                            field854 = field854 + Statics.field3859;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field849 != 1);
                        if (Statics.field56 == 85 && field873.length() > 0) {
                            field873 = field873.substring(0, field873.length() - 1);
                        } else if (Statics.field56 == 84 || Statics.field56 == 80) {
                            field849 = 0;
                            if (Statics.field56 == 84) {
                                field854 = field854.trim();
                                if (field854.length() == 0) {
                                    method17(class283.field3582, class283.field3548, class283.field3439);
                                    return;
                                }
                                if (field873.length() == 0) {
                                    method17(class283.field3440, class283.field3441, class283.field3442);
                                    return;
                                }
                                method17(class283.field3559, class283.field3594, class283.field3561);
                                client.method3264(false);
                                client.method3496(20);
                                return;
                            }
                        }
                        if ((class24.field118[82] || class24.field118[87]) && Statics.field56 == 67) {
                            Clipboard var33 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var34 = var33.getContents(Statics.field983);
                            var35 = 20 - field873.length();
                            break;
                        }
                        if (class317.method4904(Statics.field3859) && method1895(Statics.field3859) && field873.length() < 20) {
                            field873 = field873 + Statics.field3859;
                        }
                    }
                } while (var35 <= 0);
                try {
                    String var36 = (String) var34.getTransferData(DataFlavor.stringFlavor);
                    int var37 = Math.min(var35, var36.length());
                    for (int var38 = 0; var38 < var37; var38++) {
                        if (!class317.method4904(var36.charAt(var38)) || !method1895(var36.charAt(var38))) {
                            method4653(3);
                            return;
                        }
                    }
                    field873 = field873 + var36.substring(0, var37);
                } catch (UnsupportedFlavorException var86) {
                } catch (IOException var87) {
                }
            }
        } else if (field853 == 3) {
            int var41 = field860 + 180;
            short var42 = 276;
            if (var11 == 1 && var12 >= var41 - 75 && var12 <= var41 + 75 && var13 >= var42 - 20 && var13 <= var42 + 20) {
                method2787(false);
            }
            int var43 = field860 + 180;
            short var44 = 326;
            if (var11 == 1 && var12 >= var43 - 75 && var12 <= var43 + 75 && var13 >= var44 - 20 && var13 <= var44 + 20) {
                method17(class283.field3593, class283.field3613, class283.field3595);
                method4653(5);
                return;
            }
        } else if (field853 == 4) {
            int var45 = field860 + 180 - 80;
            short var46 = 321;
            if (var11 == 1 && var12 >= var45 - 75 && var12 <= var45 + 75 && var13 >= var46 - 20 && var13 <= var46 + 20) {
                Statics.field973.trim();
                if (Statics.field973.length() != 6) {
                    method17(class283.field3356, class283.field3377, class283.field3358);
                    return;
                }
                Statics.field430 = Integer.parseInt(Statics.field973);
                Statics.field973 = "";
                client.method3264(true);
                method17(class283.field3559, class283.field3594, class283.field3561);
                client.method3496(20);
                return;
            }
            if (var11 == 1 && var12 >= field860 + 180 - 9 && var12 <= field860 + 180 + 130 && var13 >= 263 && var13 <= 296) {
                field876 = !field876;
            }
            if (var11 == 1 && var12 >= field860 + 180 - 34 && var12 <= field860 + 180 + 34 && var13 >= 351 && var13 <= 363) {
                class30.method2146(client.method2130("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var47 = field860 + 180 + 80;
            if (var11 == 1 && var12 >= var47 - 75 && var12 <= var47 + 75 && var13 >= var46 - 20 && var13 <= var46 + 20) {
                method4653(0);
                field854 = "";
                field873 = "";
                Statics.field430 = 0;
                Statics.field973 = "";
            }
            while (class24.method2714()) {
                boolean var48 = false;
                for (int var49 = 0; var49 < field879.length(); var49++) {
                    if (Statics.field3859 == field879.charAt(var49)) {
                        var48 = true;
                        break;
                    }
                }
                if (Statics.field56 == 13) {
                    method4653(0);
                    field854 = "";
                    field873 = "";
                    Statics.field430 = 0;
                    Statics.field973 = "";
                } else {
                    if (Statics.field56 == 85 && Statics.field973.length() > 0) {
                        Statics.field973 = Statics.field973.substring(0, Statics.field973.length() - 1);
                    }
                    if (Statics.field56 == 84) {
                        Statics.field973.trim();
                        if (Statics.field973.length() != 6) {
                            method17(class283.field3356, class283.field3377, class283.field3358);
                            return;
                        }
                        Statics.field430 = Integer.parseInt(Statics.field973);
                        Statics.field973 = "";
                        client.method3264(true);
                        method17(class283.field3559, class283.field3594, class283.field3561);
                        client.method3496(20);
                        return;
                    }
                    if (var48 && Statics.field973.length() < 6) {
                        Statics.field973 = Statics.field973 + Statics.field3859;
                    }
                }
            }
        } else if (field853 == 5) {
            int var50 = field860 + 180 - 80;
            short var51 = 321;
            if (var11 == 1 && var12 >= var50 - 75 && var12 <= var50 + 75 && var13 >= var51 - 20 && var13 <= var51 + 20) {
                method4025();
                return;
            }
            int var52 = field860 + 180 + 80;
            if (var11 == 1 && var12 >= var52 - 75 && var12 <= var52 + 75 && var13 >= var51 - 20 && var13 <= var51 + 20) {
                method15(true);
            }
            short var53 = 361;
            if (Statics.field999 != null) {
                int var54 = Statics.field999.field4022 / 2;
                if (var11 == 1 && var12 >= Statics.field999.field4021 - var54 && var12 <= Statics.field999.field4021 + var54 && var13 >= var53 - 15 && var13 < var53) {
                    class30.method2146(client.method2130("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class24.method2714()) {
                boolean var55 = false;
                for (int var56 = 0; var56 < field878.length(); var56++) {
                    if (Statics.field3859 == field878.charAt(var56)) {
                        var55 = true;
                        break;
                    }
                }
                if (Statics.field56 == 13) {
                    method15(true);
                } else {
                    if (Statics.field56 == 85 && field854.length() > 0) {
                        field854 = field854.substring(0, field854.length() - 1);
                    }
                    if (Statics.field56 == 84) {
                        method4025();
                        return;
                    }
                    if (var55 && field854.length() < 320) {
                        field854 = field854 + Statics.field3859;
                    }
                }
            }
        } else if (field853 == 6) {
            while (true) {
                do {
                    if (!class24.method2714()) {
                        short var57 = 321;
                        if (var11 == 1 && var13 >= var57 - 20 && var13 <= var57 + 20) {
                            method15(true);
                        }
                        return;
                    }
                } while (Statics.field56 != 84 && Statics.field56 != 13);
                method15(true);
            }
        } else if (field853 == 7) {
            int var58 = field860 + 180 - 80;
            short var59 = 321;
            if (var11 == 1 && var12 >= var58 - 75 && var12 <= var58 + 75 && var13 >= var59 - 20 && var13 <= var59 + 20) {
                class30.method2146(client.method2130("secure", true) + "m=dob/set_dob.ws", true, false);
                method17(class283.field3327, class283.field3444, class283.field3592);
                method4653(6);
                return;
            }
            int var60 = field860 + 180 + 80;
            if (var11 == 1 && var12 >= var60 - 75 && var12 <= var60 + 75 && var13 >= var59 - 20 && var13 <= var59 + 20) {
                method15(true);
            }
        } else if (field853 == 8) {
            int var61 = field860 + 180 - 80;
            short var62 = 321;
            if (var11 == 1 && var12 >= var61 - 75 && var12 <= var61 + 75 && var13 >= var62 - 20 && var13 <= var62 + 20) {
                class30.method2146("https://www.jagex.com/terms/privacy", true, false);
                method17(class283.field3327, class283.field3444, class283.field3592);
                method4653(6);
                return;
            }
            int var63 = field860 + 180 + 80;
            if (var11 == 1 && var12 >= var63 - 75 && var12 <= var63 + 75 && var13 >= var62 - 20 && var13 <= var62 + 20) {
                method15(true);
            }
        } else if (field853 == 9) {
            int var64 = field860 + 180;
            short var65 = 311;
            if (Statics.field56 == 84 || Statics.field56 == 13 || var11 == 1 && var12 >= var64 - 75 && var12 <= var64 + 75 && var13 >= var65 - 20 && var13 <= var65 + 20) {
                method2787(false);
            }
        } else if (field853 == 10) {
            int var66 = field860 + 180;
            short var67 = 209;
            if (Statics.field56 == 84 || var11 == 1 && var12 >= var66 - 109 && var12 <= var66 + 109 && var13 >= var67 && var13 <= var67 + 68) {
                method17(class283.field3559, class283.field3594, class283.field3561);
                client.field501 = class405.field4353;
                client.method3264(false);
                client.method3496(20);
            }
        } else if (field853 == 12) {
            int var68 = Statics.field875;
            short var69 = 233;
            class351 var70 = arg1.method5164(0, 30, class283.field3619, var68, var69);
            class351 var71 = arg1.method5164(32, 32, class283.field3619, var68, var69);
            class351 var72 = arg1.method5164(70, 34, class283.field3619, var68, var69);
            int var89 = var69 + 17;
            class351 var73 = arg1.method5164(0, 34, class283.field3621, var68, var89);
            if (var11 == 1) {
                if (var70.method5662(var12, var13)) {
                    class30.method2146("https://www.jagex.com/terms", true, false);
                } else if (var71.method5662(var12, var13)) {
                    class30.method2146("https://www.jagex.com/terms/privacy", true, false);
                } else if (var72.method5662(var12, var13) || var73.method5662(var12, var13)) {
                    class30.method2146("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var74 = Statics.field875 - 80;
            short var75 = 311;
            if (var11 == 1 && var12 >= var74 - 75 && var12 <= var74 + 75 && var13 >= var75 - 20 && var13 <= var75 + 20) {
                Statics.field4363.field1183 = client.field468;
                class89.method1836();
                method2787(true);
            }
            int var76 = Statics.field875 + 80;
            if (var11 == 1 && var12 >= var76 - 75 && var12 <= var76 + 75 && var13 >= var75 - 20 && var13 <= var75 + 20) {
                field853 = 13;
            }
        } else if (field853 == 13) {
            int var77 = Statics.field875;
            short var78 = 321;
            if (var11 == 1 && var12 >= var77 - 75 && var12 <= var77 + 75 && var13 >= var78 - 20 && var13 <= var78 + 20) {
                method2787(true);
            }
        } else if (field853 == 14) {
            String var79 = "";
            switch(field867) {
                case 0:
                    var79 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var79 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method15(false);
            }
            int var80 = field860 + 180;
            short var81 = 276;
            if (var11 == 1 && var12 >= var80 - 75 && var12 <= var80 + 75 && var13 >= var81 - 20 && var13 <= var81 + 20) {
                class30.method2146(var79, true, false);
                method17(class283.field3327, class283.field3444, class283.field3592);
                method4653(6);
                return;
            }
            int var82 = field860 + 180;
            short var83 = 326;
            if (var11 == 1 && var12 >= var82 - 75 && var12 <= var82 + 75 && var13 >= var83 - 20 && var13 <= var83 + 20) {
                method15(false);
            }
        } else if (field853 == 24) {
            int var84 = field860 + 180;
            short var85 = 301;
            if (var11 == 1 && var12 >= var84 - 75 && var12 <= var84 + 75 && var13 >= var85 - 20 && var13 <= var85 + 20) {
                method2787(false);
            }
        }
    }

    @ObfuscatedName("bn.g(CI)Z")
    public static boolean method1895(char arg0) {
        return field878.indexOf(arg0) != -1;
    }

    @ObfuscatedName("w.e(ZI)V")
    public static void method15(boolean arg0) {
        field883 = class283.field3541;
        field870 = class283.field3411;
        field871 = class283.field3543;
        method4653(2);
        if (arg0) {
            field873 = "";
        }
        if (field854 == null || field854.length() <= 0) {
            if (Statics.field4363.field1188 == null) {
                client.field505 = false;
            } else {
                field854 = Statics.field4363.field1188;
                client.field505 = true;
            }
        }
        method2898();
    }

    @ObfuscatedName("fi.p(ZI)V")
    public static void method2787(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field4363.field1183 >= client.field468;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field983.method1090()) {
            var1 = 10;
        }
        method4653(var1);
        if (arg0) {
            field854 = "";
            field873 = "";
            Statics.field430 = 0;
            Statics.field973 = "";
        }
        if (field854 == null || field854.length() <= 0) {
            if (Statics.field4363.field1188 == null) {
                client.field505 = false;
            } else {
                field854 = Statics.field4363.field1188;
                client.field505 = true;
            }
        }
        method2898();
    }

    @ObfuscatedName("hw.j(B)V")
    public static void method4025() {
        field854 = field854.trim();
        if (field854.length() == 0) {
            method17(class283.field3593, class283.field3613, class283.field3595);
            return;
        }
        long var0 = class66.method780();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class66.method16(var0, field854);
        }
        switch(var2) {
            case 2:
                method17(class283.field3596, class283.field3635, class283.field3598);
                method4653(6);
                break;
            case 3:
                method17(class283.field3599, class283.field3455, class283.field3627);
                break;
            case 4:
                method17(class283.field3325, class283.field3577, class283.field3604);
                break;
            case 5:
                method17(class283.field3605, class283.field3606, class283.field3607);
                break;
            case 6:
                method17(class283.field3384, class283.field3609, class283.field3622);
                break;
            case 7:
                method17(class283.field3336, class283.field3612, class283.field3553);
        }
    }

    @ObfuscatedName("k.b(Lle;Lle;Lle;I)V")
    public static void method107(class315 arg0, class315 arg1, class315 arg2) {
        field851 = (Statics.field184 - 765) / 2;
        field860 = field851 + 202;
        Statics.field875 = field860 + 180;
        if (field880) {
            if (Statics.field3211 == null) {
                class288 var3 = Statics.field458;
                int var4 = var3.method4759("sl_back");
                int var5 = var3.method4760(var4, "");
                class414[] var6 = class415.method304(var3, var4, var5);
                Statics.field3211 = var6;
            }
            if (Statics.field1313 == null) {
                Statics.field1313 = class415.method6158(Statics.field458, "sl_flags", "");
            }
            if (Statics.field416 == null) {
                Statics.field416 = class415.method6158(Statics.field458, "sl_arrows", "");
            }
            if (Statics.field135 == null) {
                Statics.field135 = class415.method6158(Statics.field458, "sl_stars", "");
            }
            if (Statics.field1338 == null) {
                Statics.field1338 = class415.method1882(Statics.field458, "leftarrow", "");
            }
            if (Statics.field1037 == null) {
                Statics.field1037 = class415.method1882(Statics.field458, "rightarrow", "");
            }
            class410.method6580(field851, 23, 765, 480, 0);
            class410.method6546(field851, 0, 125, 23, 12425273, 9135624);
            class410.method6546(field851 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5168(class283.field3320, field851 + 62, 15, 0, -1);
            if (Statics.field135 != null) {
                Statics.field135[1].method6611(field851 + 140, 1);
                arg1.method5165(class283.field3487, field851 + 152, 10, 16777215, -1);
                Statics.field135[0].method6611(field851 + 140, 12);
                arg1.method5165(class283.field3628, field851 + 152, 21, 16777215, -1);
            }
            if (Statics.field416 != null) {
                int var7 = field851 + 280;
                if (class61.field755[0] == 0 && class61.field758[0] == 0) {
                    Statics.field416[2].method6611(var7, 4);
                } else {
                    Statics.field416[0].method6611(var7, 4);
                }
                if (class61.field755[0] == 0 && class61.field758[0] == 1) {
                    Statics.field416[3].method6611(var7 + 15, 4);
                } else {
                    Statics.field416[1].method6611(var7 + 15, 4);
                }
                arg0.method5165(class283.field3590, var7 + 32, 17, 16777215, -1);
                int var8 = field851 + 390;
                if (class61.field755[0] == 1 && class61.field758[0] == 0) {
                    Statics.field416[2].method6611(var8, 4);
                } else {
                    Statics.field416[0].method6611(var8, 4);
                }
                if (class61.field755[0] == 1 && class61.field758[0] == 1) {
                    Statics.field416[3].method6611(var8 + 15, 4);
                } else {
                    Statics.field416[1].method6611(var8 + 15, 4);
                }
                arg0.method5165(class283.field3560, var8 + 32, 17, 16777215, -1);
                int var9 = field851 + 500;
                if (class61.field755[0] == 2 && class61.field758[0] == 0) {
                    Statics.field416[2].method6611(var9, 4);
                } else {
                    Statics.field416[0].method6611(var9, 4);
                }
                if (class61.field755[0] == 2 && class61.field758[0] == 1) {
                    Statics.field416[3].method6611(var9 + 15, 4);
                } else {
                    Statics.field416[1].method6611(var9 + 15, 4);
                }
                arg0.method5165(class283.field3631, var9 + 32, 17, 16777215, -1);
                int var10 = field851 + 610;
                if (class61.field755[0] == 3 && class61.field758[0] == 0) {
                    Statics.field416[2].method6611(var10, 4);
                } else {
                    Statics.field416[0].method6611(var10, 4);
                }
                if (class61.field755[0] == 3 && class61.field758[0] == 1) {
                    Statics.field416[3].method6611(var10 + 15, 4);
                } else {
                    Statics.field416[1].method6611(var10 + 15, 4);
                }
                arg0.method5165(class283.field3630, var10 + 32, 17, 16777215, -1);
            }
            class410.method6580(field851 + 708, 4, 50, 16, 0);
            arg1.method5168(class283.field3567, field851 + 708 + 25, 16, 16777215, -1);
            field881 = -1;
            if (Statics.field3211 != null) {
                byte var11 = 88;
                byte var12 = 19;
                int var13 = 765 / (var11 + 1) - 1;
                int var14 = 480 / (var12 + 1);
                int var15;
                int var16;
                do {
                    var15 = var14;
                    var16 = var13;
                    if ((var13 - 1) * var14 >= class61.field760) {
                        var13--;
                    }
                    if ((var14 - 1) * var13 >= class61.field760) {
                        var14--;
                    }
                    if ((var14 - 1) * var13 >= class61.field760) {
                        var14--;
                    }
                } while (var14 != var15 || var13 != var16);
                int var17 = (765 - var11 * var13) / (var13 + 1);
                if (var17 > 5) {
                    var17 = 5;
                }
                int var18 = (480 - var12 * var14) / (var14 + 1);
                if (var18 > 5) {
                    var18 = 5;
                }
                int var19 = (765 - var11 * var13 - (var13 - 1) * var17) / 2;
                int var20 = (480 - var12 * var14 - (var14 - 1) * var18) / 2;
                int var21 = (class61.field760 + var14 - 1) / var14;
                field865 = var21 - var13;
                if (Statics.field1338 != null && field882 > 0) {
                    Statics.field1338.method6611(8, Statics.field137 / 2 - Statics.field1338.field4388 / 2);
                }
                if (Statics.field1037 != null && field882 < field865) {
                    Statics.field1037.method6611(Statics.field184 - Statics.field1037.field4387 - 8, Statics.field137 / 2 - Statics.field1037.field4388 / 2);
                }
                int var22 = var20 + 23;
                int var23 = field851 + var19;
                int var24 = 0;
                boolean var25 = false;
                int var26 = field882;
                for (int var27 = var14 * var26; var27 < class61.field760 && var26 - field882 < var13; var27++) {
                    class61 var28 = Statics.field2230[var27];
                    boolean var29 = true;
                    String var30 = Integer.toString(var28.field756);
                    if (var28.field756 == -1) {
                        var30 = class283.field3512;
                        var29 = false;
                    } else if (var28.field756 > 1980) {
                        var30 = class283.field3611;
                        var29 = false;
                    }
                    int var31 = 0;
                    byte var32;
                    if (var28.method1555()) {
                        if (var28.method1550()) {
                            var32 = 7;
                        } else {
                            var32 = 6;
                        }
                    } else if (var28.method1554()) {
                        var31 = 16711680;
                        if (var28.method1550()) {
                            var32 = 5;
                        } else {
                            var32 = 4;
                        }
                    } else if (var28.method1556()) {
                        if (var28.method1550()) {
                            var32 = 9;
                        } else {
                            var32 = 8;
                        }
                    } else if (var28.method1584()) {
                        if (var28.method1550()) {
                            var32 = 3;
                        } else {
                            var32 = 2;
                        }
                    } else if (var28.method1550()) {
                        var32 = 1;
                    } else {
                        var32 = 0;
                    }
                    if (class33.field212 >= var23 && class33.field221 >= var22 && class33.field212 < var11 + var23 && class33.field221 < var12 + var22 && var29) {
                        field881 = var27;
                        Statics.field3211[var32].method6649(var23, var22, 128, 16777215);
                        var25 = true;
                    } else {
                        Statics.field3211[var32].method6643(var23, var22);
                    }
                    if (Statics.field1313 != null) {
                        Statics.field1313[(var28.method1550() ? 8 : 0) + var28.field761].method6611(var23 + 29, var22);
                    }
                    arg0.method5168(Integer.toString(var28.field752), var23 + 15, var12 / 2 + var22 + 5, var31, -1);
                    arg1.method5168(var30, var23 + 60, var12 / 2 + var22 + 5, 268435455, -1);
                    var22 += var12 + var18;
                    var24++;
                    if (var24 >= var14) {
                        var22 = var20 + 23;
                        var23 += var11 + var17;
                        var24 = 0;
                        var26++;
                    }
                }
                if (var25) {
                    int var33 = arg1.method5159(Statics.field2230[field881].field757) + 6;
                    int var34 = arg1.field3826 + 8;
                    int var35 = class33.field221 + 25;
                    if (var34 + var35 > 480) {
                        var35 = class33.field221 - 25 - var34;
                    }
                    class410.method6580(class33.field212 - var33 / 2, var35, var33, var34, 16777120);
                    class410.method6530(class33.field212 - var33 / 2, var35, var33, var34, 0);
                    arg1.method5168(Statics.field2230[field881].field757, class33.field212, arg1.field3826 + var35 + 4, 0, -1);
                }
            }
            Statics.field146.method409(0, 0);
            return;
        }
        Statics.field1986.method6643(field851, 0);
        Statics.field1531.method6643(field851 + 382, 0);
        Statics.field72.method6611(field851 + 382 - Statics.field72.field4387 / 2, 18);
        if (client.field642 == 0 || client.field642 == 5) {
            byte var36 = 20;
            arg0.method5168(class283.field3540, field860 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class410.method6530(field860 + 180 - 152, var37, 304, 34, 9179409);
            class410.method6530(field860 + 180 - 151, var37 + 1, 302, 32, 0);
            class410.method6580(field860 + 180 - 150, var37 + 2, field862 * 3, 30, 9179409);
            class410.method6580(field862 * 3 + (field860 + 180 - 150), var37 + 2, 300 - field862 * 3, 30, 0);
            arg0.method5168(field863, field860 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field642 == 20) {
            Statics.field887.method6611(field860 + 180 - Statics.field887.field4387 / 2, 271 - Statics.field887.field4388 / 2);
            short var38 = 201;
            arg0.method5168(field883, field860 + 180, var38, 16776960, 0);
            int var133 = var38 + 15;
            arg0.method5168(field870, field860 + 180, var133, 16776960, 0);
            int var134 = var133 + 15;
            arg0.method5168(field871, field860 + 180, var134, 16776960, 0);
            int var135 = var134 + 15;
            int var136 = var135 + 7;
            if (field853 != 4 && field853 != 10) {
                arg0.method5165(class283.field3462, field860 + 180 - 110, var136, 16777215, 0);
                short var39 = 200;
                String var40 = Statics.field4363.field1185 ? class319.method2400(field854) : field854;
                String var41;
                for (var41 = var40; arg0.method5159(var41) > var39; var41 = var41.substring(0, var41.length() - 1)) {
                }
                arg0.method5165(class316.method5163(var41), field860 + 180 - 70, var136, 16777215, 0);
                var133 = var136 + 15;
                String var42;
                for (var42 = class319.method2400(field873); arg0.method5159(var42) > var39; var42 = var42.substring(1)) {
                }
                arg0.method5165(class283.field3569 + var42, field860 + 180 - 108, var133, 16777215, 0);
                var133 += 15;
            }
        }
        if (client.field642 == 10 || client.field642 == 11) {
            Statics.field887.method6611(field860, 171);
            if (field853 == 0) {
                short var43 = 251;
                arg0.method5168(class283.field3329, field860 + 180, var43, 16776960, 0);
                int var137 = var43 + 30;
                int var44 = field860 + 180 - 80;
                short var45 = 291;
                Statics.field884.method6611(var44 - 73, var45 - 20);
                arg0.method5169(class283.field3572, var44 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var46 = field860 + 180 + 80;
                Statics.field884.method6611(var46 - 73, var45 - 20);
                arg0.method5169(class283.field3353, var46 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field853 == 1) {
                arg0.method5168(field868, field860 + 180, 201, 16776960, 0);
                short var47 = 236;
                arg0.method5168(field883, field860 + 180, var47, 16777215, 0);
                int var138 = var47 + 15;
                arg0.method5168(field870, field860 + 180, var138, 16777215, 0);
                int var139 = var138 + 15;
                arg0.method5168(field871, field860 + 180, var139, 16777215, 0);
                int var140 = var139 + 15;
                int var48 = field860 + 180 - 80;
                short var49 = 321;
                Statics.field884.method6611(var48 - 73, var49 - 20);
                arg0.method5168(class283.field3323, var48, var49 + 5, 16777215, 0);
                int var50 = field860 + 180 + 80;
                Statics.field884.method6611(var50 - 73, var49 - 20);
                arg0.method5168(class283.field3567, var50, var49 + 5, 16777215, 0);
            } else if (field853 == 2) {
                short var51 = 201;
                arg0.method5168(field883, Statics.field875, var51, 16776960, 0);
                int var141 = var51 + 15;
                arg0.method5168(field870, Statics.field875, var141, 16776960, 0);
                int var142 = var141 + 15;
                arg0.method5168(field871, Statics.field875, var142, 16776960, 0);
                int var143 = var142 + 15;
                int var144 = var143 + 7;
                arg0.method5165(class283.field3462, Statics.field875 - 110, var144, 16777215, 0);
                short var52 = 200;
                String var53 = Statics.field4363.field1185 ? class319.method2400(field854) : field854;
                String var54;
                for (var54 = var53; arg0.method5159(var54) > var52; var54 = var54.substring(1)) {
                }
                arg0.method5165(class316.method5163(var54) + (field849 == 0 & client.field555 % 40 < 20 ? class92.method604(16776960) + class92.field1214 : ""), Statics.field875 - 70, var144, 16777215, 0);
                var141 = var144 + 15;
                String var55;
                for (var55 = class319.method2400(field873); arg0.method5159(var55) > var52; var55 = var55.substring(1)) {
                }
                arg0.method5165(class283.field3569 + var55 + (field849 == 1 & client.field555 % 40 < 20 ? class92.method604(16776960) + class92.field1214 : ""), Statics.field875 - 108, var141, 16777215, 0);
                var141 += 15;
                short var56 = 277;
                int var57 = Statics.field875 + -117;
                boolean var58 = client.field505;
                boolean var59 = field874;
                class413 var60 = var58 ? (var59 ? Statics.field3951 : Statics.field27) : (var59 ? Statics.field869 : Statics.field1576);
                var60.method6611(var57, var56);
                int var62 = var60.field4387 + 5 + var57;
                arg1.method5165(class283.field3576, var62, var56 + 13, 16776960, 0);
                int var63 = Statics.field875 + 24;
                boolean var64 = Statics.field4363.field1185;
                boolean var65 = field861;
                class413 var66 = var64 ? (var65 ? Statics.field3951 : Statics.field27) : (var65 ? Statics.field869 : Statics.field1576);
                var66.method6611(var63, var56);
                int var68 = var66.field4387 + 5 + var63;
                arg1.method5165(class283.field3474, var68, var56 + 13, 16776960, 0);
                int var145 = var56 + 15;
                int var69 = Statics.field875 - 80;
                short var70 = 321;
                Statics.field884.method6611(var69 - 73, var70 - 20);
                arg0.method5168(class283.field3574, var69, var70 + 5, 16777215, 0);
                int var71 = Statics.field875 + 80;
                Statics.field884.method6611(var71 - 73, var70 - 20);
                arg0.method5168(class283.field3567, var71, var70 + 5, 16777215, 0);
                short var72 = 357;
                switch(field866) {
                    case 2:
                        Statics.field1341 = class283.field3589;
                        break;
                    default:
                        Statics.field1341 = class283.field3597;
                }
                Statics.field1360 = new class351(Statics.field875, var72, arg1.method5159(Statics.field1341), 11);
                Statics.field999 = new class351(Statics.field875, var72, arg1.method5159(class283.field3505), 11);
                arg1.method5168(Statics.field1341, Statics.field875, var72, 16777215, 0);
            } else if (field853 == 3) {
                short var73 = 201;
                arg0.method5168(class283.field3578, field860 + 180, var73, 16776960, 0);
                int var146 = var73 + 20;
                arg1.method5168(class283.field3503, field860 + 180, var146, 16776960, 0);
                int var147 = var146 + 15;
                arg1.method5168(class283.field3610, field860 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                int var74 = field860 + 180;
                short var75 = 276;
                Statics.field884.method6611(var74 - 73, var75 - 20);
                arg2.method5168(class283.field3581, var74, var75 + 5, 16777215, 0);
                int var76 = field860 + 180;
                short var77 = 326;
                Statics.field884.method6611(var76 - 73, var77 - 20);
                arg2.method5168(class283.field3618, var76, var77 + 5, 16777215, 0);
            } else if (field853 == 4) {
                arg0.method5168(class283.field3531, field860 + 180, 201, 16776960, 0);
                short var78 = 236;
                arg0.method5168(field883, field860 + 180, var78, 16777215, 0);
                int var149 = var78 + 15;
                arg0.method5168(field870, field860 + 180, var149, 16777215, 0);
                int var150 = var149 + 15;
                arg0.method5168(field871, field860 + 180, var150, 16777215, 0);
                int var151 = var150 + 15;
                arg0.method5165(class283.field3570 + class319.method2400(Statics.field973) + (client.field555 % 40 < 20 ? class92.method604(16776960) + class92.field1214 : ""), field860 + 180 - 108, var151, 16777215, 0);
                int var152 = var151 - 8;
                arg0.method5165(class283.field3326, field860 + 180 - 9, var152, 16776960, 0);
                int var153 = var152 + 15;
                arg0.method5165(class283.field3375, field860 + 180 - 9, var153, 16776960, 0);
                int var79 = field860 + 180 - 9 + arg0.method5159(class283.field3375) + 15;
                int var80 = var153 - arg0.field3826;
                class413 var81;
                if (field876) {
                    var81 = Statics.field27;
                } else {
                    var81 = Statics.field1576;
                }
                var81.method6611(var79, var80);
                var149 = var153 + 15;
                int var82 = field860 + 180 - 80;
                short var83 = 321;
                Statics.field884.method6611(var82 - 73, var83 - 20);
                arg0.method5168(class283.field3323, var82, var83 + 5, 16777215, 0);
                int var84 = field860 + 180 + 80;
                Statics.field884.method6611(var84 - 73, var83 - 20);
                arg0.method5168(class283.field3567, var84, var83 + 5, 16777215, 0);
                arg1.method5168(class283.field3558, field860 + 180, var83 + 36, 255, 0);
            } else if (field853 == 5) {
                arg0.method5168(class283.field3583, field860 + 180, 201, 16776960, 0);
                short var85 = 221;
                arg2.method5168(field883, field860 + 180, var85, 16776960, 0);
                int var154 = var85 + 15;
                arg2.method5168(field870, field860 + 180, var154, 16776960, 0);
                int var155 = var154 + 15;
                arg2.method5168(field871, field860 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                int var157 = var156 + 14;
                arg0.method5165(class283.field3579, field860 + 180 - 145, var157, 16777215, 0);
                short var86 = 174;
                String var87 = Statics.field4363.field1185 ? class319.method2400(field854) : field854;
                String var88;
                for (var88 = var87; arg0.method5159(var88) > var86; var88 = var88.substring(1)) {
                }
                arg0.method5165(class316.method5163(var88) + (client.field555 % 40 < 20 ? class92.method604(16776960) + class92.field1214 : ""), field860 + 180 - 34, var157, 16777215, 0);
                var154 = var157 + 15;
                int var89 = field860 + 180 - 80;
                short var90 = 321;
                Statics.field884.method6611(var89 - 73, var90 - 20);
                arg0.method5168(class283.field3467, var89, var90 + 5, 16777215, 0);
                int var91 = field860 + 180 + 80;
                Statics.field884.method6611(var91 - 73, var90 - 20);
                arg0.method5168(class283.field3601, var91, var90 + 5, 16777215, 0);
                short var92 = 356;
                arg1.method5168(class283.field3505, Statics.field875, var92, 268435455, 0);
            } else if (field853 == 6) {
                short var93 = 201;
                arg0.method5168(field883, field860 + 180, var93, 16776960, 0);
                int var158 = var93 + 15;
                arg0.method5168(field870, field860 + 180, var158, 16776960, 0);
                int var159 = var158 + 15;
                arg0.method5168(field871, field860 + 180, var159, 16776960, 0);
                int var160 = var159 + 15;
                int var94 = field860 + 180;
                short var95 = 321;
                Statics.field884.method6611(var94 - 73, var95 - 20);
                arg0.method5168(class283.field3601, var94, var95 + 5, 16777215, 0);
            } else if (field853 == 7) {
                short var96 = 216;
                arg0.method5168(class283.field3456, field860 + 180, var96, 16776960, 0);
                int var161 = var96 + 15;
                arg2.method5168(class283.field3615, field860 + 180, var161, 16776960, 0);
                int var162 = var161 + 15;
                arg2.method5168(class283.field3616, field860 + 180, var162, 16776960, 0);
                int var163 = var162 + 15;
                int var97 = field860 + 180 - 80;
                short var98 = 321;
                Statics.field884.method6611(var97 - 73, var98 - 20);
                arg0.method5168(class283.field3617, var97, var98 + 5, 16777215, 0);
                int var99 = field860 + 180 + 80;
                Statics.field884.method6611(var99 - 73, var98 - 20);
                arg0.method5168(class283.field3601, var99, var98 + 5, 16777215, 0);
            } else if (field853 == 8) {
                short var100 = 216;
                arg0.method5168(class283.field3603, field860 + 180, var100, 16776960, 0);
                int var164 = var100 + 15;
                arg2.method5168(class283.field3372, field860 + 180, var164, 16776960, 0);
                int var165 = var164 + 15;
                arg2.method5168(class283.field3457, field860 + 180, var165, 16776960, 0);
                int var166 = var165 + 15;
                int var101 = field860 + 180 - 80;
                short var102 = 321;
                Statics.field884.method6611(var101 - 73, var102 - 20);
                arg0.method5168(class283.field3557, var101, var102 + 5, 16777215, 0);
                int var103 = field860 + 180 + 80;
                Statics.field884.method6611(var103 - 73, var102 - 20);
                arg0.method5168(class283.field3601, var103, var102 + 5, 16777215, 0);
            } else if (field853 == 9) {
                short var104 = 221;
                arg0.method5168(field883, field860 + 180, var104, 16776960, 0);
                int var167 = var104 + 25;
                arg0.method5168(field870, field860 + 180, var167, 16776960, 0);
                int var168 = var167 + 25;
                arg0.method5168(field871, field860 + 180, var168, 16776960, 0);
                int var105 = field860 + 180;
                short var106 = 311;
                Statics.field884.method6611(var105 - 73, var106 - 20);
                arg0.method5168(class283.field3581, var105, var106 + 5, 16777215, 0);
            } else if (field853 == 10) {
                int var107 = field860 + 180;
                short var108 = 209;
                arg0.method5168(class283.field3329, field860 + 180, var108, 16776960, 0);
                int var169 = var108 + 20;
                Statics.field855.method6611(var107 - 109, var169);
                Statics.field160.method6611(var107 - 48, var169 + 18);
            } else if (field853 == 12) {
                int var109 = Statics.field875;
                short var110 = 216;
                arg2.method5168(class283.field3399, var109, var110, 16777215, 0);
                int var170 = var110 + 17;
                arg2.method5168(class283.field3619, var109, var170, 16777215, 0);
                int var171 = var170 + 17;
                arg2.method5168(class283.field3621, var109, var171, 16777215, 0);
                int var172 = var171 + 17;
                arg2.method5168(class283.field3373, var109, var172, 16777215, 0);
                int var111 = Statics.field875 - 80;
                short var112 = 311;
                Statics.field884.method6611(var111 - 73, var112 - 20);
                arg0.method5168(class283.field3624, var111, var112 + 5, 16777215, 0);
                int var113 = Statics.field875 + 80;
                Statics.field884.method6611(var113 - 73, var112 - 20);
                arg0.method5168(class283.field3625, var113, var112 + 5, 16777215, 0);
            } else if (field853 == 13) {
                short var114 = 231;
                arg2.method5168(class283.field3626, field860 + 180, var114, 16777215, 0);
                int var173 = var114 + 20;
                arg2.method5168(class283.field3623, field860 + 180, var173, 16777215, 0);
                int var115 = field860 + 180;
                short var116 = 311;
                Statics.field884.method6611(var115 - 73, var116 - 20);
                arg0.method5168(class283.field3601, var115, var116 + 5, 16777215, 0);
            } else if (field853 == 14) {
                short var117 = 201;
                String var118 = "";
                String var119 = "";
                String var120 = "";
                switch(field867) {
                    case 0:
                        var118 = class283.field3464;
                        var119 = class283.field3502;
                        var120 = class283.field3632;
                        break;
                    case 1:
                        var118 = class283.field3410;
                        var119 = class283.field3447;
                        var120 = class283.field3412;
                        break;
                    default:
                        method15(false);
                }
                arg0.method5168(var118, field860 + 180, var117, 16776960, 0);
                int var174 = var117 + 15;
                arg2.method5168(var119, field860 + 180, var174, 16776960, 0);
                int var175 = var174 + 15;
                arg2.method5168(var120, field860 + 180, var175, 16776960, 0);
                int var176 = var175 + 15;
                int var121 = field860 + 180;
                short var122 = 276;
                Statics.field884.method6611(var121 - 73, var122 - 20);
                arg0.method5168(class283.field3355, var121, var122 + 5, 16777215, 0);
                int var123 = field860 + 180;
                short var124 = 326;
                Statics.field884.method6611(var123 - 73, var124 - 20);
                arg0.method5168(class283.field3601, var123, var124 + 5, 16777215, 0);
            } else if (field853 == 24) {
                short var125 = 221;
                arg0.method5168(field883, field860 + 180, var125, 16777215, 0);
                int var177 = var125 + 15;
                arg0.method5168(field870, field860 + 180, var177, 16777215, 0);
                int var178 = var177 + 15;
                arg0.method5168(field871, field860 + 180, var178, 16777215, 0);
                int var179 = var178 + 15;
                int var126 = field860 + 180;
                short var127 = 301;
                Statics.field884.method6611(var126 - 73, var127 - 20);
                arg0.method5168(class283.field3568, var126, var127 + 5, 16777215, 0);
            }
        }
        if (client.field642 >= 10) {
            int[] var128 = new int[4];
            class410.method6557(var128);
            class410.method6519(field851, 0, field851 + 765, Statics.field137);
            Statics.field857.method2103(field851 - 22, client.field555);
            Statics.field857.method2103(field851 + 765 + 22 - 128, client.field555);
            class410.method6522(var128);
        }
        Statics.field1614[Statics.field4363.field1186 ? 1 : 0].method6611(field851 + 765 - 40, 463);
        if (client.field642 <= 5 || Statics.field207 != class305.field3788) {
            return;
        }
        if (Statics.field55 == null) {
            Statics.field55 = class415.method1882(Statics.field458, "sl_button", "");
            return;
        }
        int var129 = field851 + 5;
        short var130 = 463;
        byte var131 = 100;
        byte var132 = 35;
        Statics.field55.method6611(var129, var130);
        arg0.method5168(class283.field3495 + " " + client.field463, var131 / 2 + var129, var132 / 2 + var130 - 2, 16777215, 0);
        if (Statics.field100 == null) {
            arg1.method5168(class283.field3629, var131 / 2 + var129, var132 / 2 + var130 + 12, 16777215, 0);
        } else {
            arg1.method5168(class283.field3535, var131 / 2 + var129, var132 / 2 + var130 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("w.x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method17(String arg0, String arg1, String arg2) {
        field883 = arg0;
        field870 = arg1;
        field871 = arg2;
    }

    @ObfuscatedName("ak.y(Lai;I)V")
    public static void method732(class32 arg0) {
        while (class24.method2714()) {
            if (Statics.field56 == 13) {
                method96();
                return;
            }
            if (Statics.field56 == 96) {
                if (field882 > 0 && Statics.field1338 != null) {
                    field882--;
                }
            } else if (Statics.field56 == 97 && field882 < field865 && Statics.field1037 != null) {
                field882++;
            }
        }
        if (class33.field219 != 1 && Statics.field455 || class33.field219 != 4) {
            return;
        }
        int var1 = field851 + 280;
        if (class33.field220 >= var1 && class33.field220 <= var1 + 14 && class33.field224 >= 4 && class33.field224 <= 18) {
            class61.method4678(0, 0);
            return;
        }
        if (class33.field220 >= var1 + 15 && class33.field220 <= var1 + 80 && class33.field224 >= 4 && class33.field224 <= 18) {
            class61.method4678(0, 1);
            return;
        }
        int var2 = field851 + 390;
        if (class33.field220 >= var2 && class33.field220 <= var2 + 14 && class33.field224 >= 4 && class33.field224 <= 18) {
            class61.method4678(1, 0);
            return;
        }
        if (class33.field220 >= var2 + 15 && class33.field220 <= var2 + 80 && class33.field224 >= 4 && class33.field224 <= 18) {
            class61.method4678(1, 1);
            return;
        }
        int var3 = field851 + 500;
        if (class33.field220 >= var3 && class33.field220 <= var3 + 14 && class33.field224 >= 4 && class33.field224 <= 18) {
            class61.method4678(2, 0);
            return;
        }
        if (class33.field220 >= var3 + 15 && class33.field220 <= var3 + 80 && class33.field224 >= 4 && class33.field224 <= 18) {
            class61.method4678(2, 1);
            return;
        }
        int var4 = field851 + 610;
        if (class33.field220 >= var4 && class33.field220 <= var4 + 14 && class33.field224 >= 4 && class33.field224 <= 18) {
            class61.method4678(3, 0);
            return;
        }
        if (class33.field220 >= var4 + 15 && class33.field220 <= var4 + 80 && class33.field224 >= 4 && class33.field224 <= 18) {
            class61.method4678(3, 1);
            return;
        }
        if (class33.field220 >= field851 + 708 && class33.field224 >= 4 && class33.field220 <= field851 + 708 + 50 && class33.field224 <= 20) {
            method96();
            return;
        }
        if (field881 != -1) {
            class61 var5 = Statics.field2230[field881];
            method4377(var5);
            method96();
            return;
        }
        if (field882 > 0 && Statics.field1338 != null && class33.field220 >= 0 && class33.field220 <= Statics.field1338.field4387 && class33.field224 >= Statics.field137 / 2 - 50 && class33.field224 <= Statics.field137 / 2 + 50) {
            field882--;
        }
        if (field882 < field865 && Statics.field1037 != null && class33.field220 >= Statics.field184 - Statics.field1037.field4387 - 5 && class33.field220 <= Statics.field184 && class33.field224 >= Statics.field137 / 2 - 50 && class33.field224 <= Statics.field137 / 2 + 50) {
            field882++;
        }
    }

    @ObfuscatedName("io.k(Lbw;B)V")
    public static void method4377(class61 arg0) {
        if (arg0.method1550() != client.field623) {
            client.field623 = arg0.method1550();
            Statics.method1659(arg0.method1550());
        }
        if (client.field464 != arg0.field754) {
            class288 var1 = Statics.field458;
            int var2 = arg0.field754;
            if ((var2 & 0x20000000) != 0) {
                Statics.field72 = class415.method1882(var1, "logo_deadman_mode", "");
            } else if ((var2 & 0x40000000) == 0) {
                Statics.field72 = class415.method1882(var1, "logo", "");
            } else {
                Statics.field72 = class415.method1882(var1, "logo_seasonal_mode", "");
            }
        }
        Statics.field2114 = arg0.field759;
        client.field463 = arg0.field752;
        client.field464 = arg0.field754;
        Statics.field456 = client.field489 == 0 ? 43594 : arg0.field752 + 40000;
        Statics.field1792 = client.field489 == 0 ? 443 : arg0.field752 + 50000;
        Statics.field1028 = Statics.field456;
    }

    @ObfuscatedName("x.t(B)V")
    public static void method96() {
        field880 = false;
        Statics.field1986.method6643(field851, 0);
        Statics.field1531.method6643(field851 + 382, 0);
        Statics.field72.method6611(field851 + 382 - Statics.field72.field4387 / 2, 18);
    }

    @ObfuscatedName("jm.l(II)V")
    public static void method4653(int arg0) {
        if (field853 != arg0) {
            field853 = arg0;
        }
    }
}
