package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

@ObfuscatedName("ca")
public class class78 {

    @ObfuscatedName("ca.ag")
    public static int field922 = 0;

    @ObfuscatedName("ca.aw")
    public static int field928 = field922 + 202;

    @ObfuscatedName("ca.af")
    public static int field930 = 10;

    @ObfuscatedName("ca.am")
    public static String field931 = "";

    @ObfuscatedName("ca.bh")
    public static int field932 = -1;

    @ObfuscatedName("ca.bz")
    public static int field933 = 1;

    @ObfuscatedName("ca.cf")
    public static int field934 = 0;

    @ObfuscatedName("ca.cv")
    public static String field938 = "";

    @ObfuscatedName("ca.cl")
    public static String field936 = "";

    @ObfuscatedName("ca.cm")
    public static String field958 = "";

    @ObfuscatedName("ca.cg")
    public static String field948 = "";

    @ObfuscatedName("ca.cu")
    public static String field939 = "";

    @ObfuscatedName("ca.cn")
    public static String field940 = "";

    @ObfuscatedName("ca.co")
    public static int field951 = 0;

    @ObfuscatedName("ca.ch")
    public static String[] field942 = new String[8];

    @ObfuscatedName("ca.cs")
    public static String field949 = "";

    @ObfuscatedName("ca.cb")
    public static boolean field944 = false;

    @ObfuscatedName("ca.cz")
    public static boolean field960 = false;

    @ObfuscatedName("ca.ca")
    public static boolean field925 = true;

    @ObfuscatedName("ca.df")
    public static int field947 = 0;

    @ObfuscatedName("ca.dd")
    public static String field937 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ca.dg")
    public static String field935 = "1234567890";

    @ObfuscatedName("ca.dn")
    public static boolean field920 = false;

    @ObfuscatedName("ca.di")
    public static int field950 = -1;

    @ObfuscatedName("ca.dt")
    public static int field952 = 0;

    @ObfuscatedName("ca.da")
    public static int field953 = 0;

    @ObfuscatedName("ca.dz")
    public static long field954;

    @ObfuscatedName("ca.dc")
    public static long field955;

    @ObfuscatedName("ca.dy")
    public static String[] field956;

    @ObfuscatedName("ca.dw")
    public static String[] field941;

    @ObfuscatedName("ca.dh")
    public static String[] field943;

    static {
        new DecimalFormat("##0.00");
        new class139();
        field954 = -1L;
        field955 = -1L;
        field956 = new String[] { "title.jpg" };
        field941 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field943 = new String[] { "logo_speedrunning" };
    }

    public class78() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jj.aq(Lok;I)I")
    public static int method4205(class388 arg0) {
        int var1 = field956.length + field941.length;
        String[] var2 = field943;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (arg0.method6555(var4) != -1) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("dj.ad(Lok;Lok;ZII)V")
    public static void method2434(class388 arg0, class388 arg1, boolean arg2, int arg3) {
        if (!Statics.field921) {
            if (arg3 == 0) {
                method2845(arg2);
            } else {
                method3187(arg3);
            }
            class557.method9056();
            byte[] var4 = arg0.method6558("title.jpg", "");
            Statics.field924 = class31.method3511(var4);
            Statics.field1968 = Statics.field924.method9155();
            int var5 = client.field771;
            if ((var5 & class543.field5321.method32()) != 0) {
                Statics.field4476 = class562.method6773(arg1, "logo_deadman_mode", "");
            } else if ((var5 & class543.field5348.method32()) != 0) {
                Statics.field4476 = class562.method6773(arg1, "logo_seasonal_mode", "");
            } else if ((var5 & class543.field5326.method32()) == 0) {
                Statics.field4476 = class562.method6773(arg1, "logo", "");
            } else {
                Statics.field4476 = class562.method6773(arg1, "logo_speedrunning", "");
            }
            Statics.field5034 = class562.method6773(arg1, "titlebox", "");
            Statics.field5214 = class562.method6773(arg1, "titlebutton", "");
            Statics.field1507 = class562.method6773(arg1, "titlebutton_large", "");
            Statics.field923 = class562.method6773(arg1, "play_now_text", "");
            class562.method6773(arg1, "titlebutton_wide42,1", "");
            Statics.field2708 = Statics.method8198(arg1, "runes", "");
            Statics.field4730 = Statics.method8198(arg1, "title_mute", "");
            Statics.field1648 = class562.method6773(arg1, "options_radio_buttons,0", "");
            Statics.field946 = class562.method6773(arg1, "options_radio_buttons,4", "");
            Statics.field926 = class562.method6773(arg1, "options_radio_buttons,2", "");
            Statics.field3700 = class562.method6773(arg1, "options_radio_buttons,6", "");
            Statics.field5245 = Statics.field1648.field5451;
            Statics.field59 = Statics.field1648.field5452;
            Statics.field1107 = new class100(Statics.field2708);
            if (arg2) {
                field939 = "";
                field940 = "";
                field942 = new String[8];
                field951 = 0;
            }
            Statics.field21 = 0;
            Statics.field1689 = "";
            field925 = true;
            field920 = false;
            method870();
            class331.method4218();
            client.method3085().method6622(false);
            Statics.field921 = true;
            field922 = (Statics.field890 - 765) / 2;
            field928 = field922 + 202;
            Statics.field929 = field928 + 180;
            Statics.field924.method9197(field922, 0);
            Statics.field1968.method9197(field922 + 382, 0);
            Statics.field4476.method9148(field922 + 382 - Statics.field4476.field5451 / 2, 18);
        } else if (arg3 == 4) {
            method3187(4);
        }
    }

    @ObfuscatedName("ck.ag(ZZB)Lvv;")
    public static class560 method1120(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field3700 : Statics.field926) : (arg1 ? Statics.field946 : Statics.field1648);
    }

    @ObfuscatedName("eq.ak(B)V")
    public static void method2842() {
        if (client.field558 && field939 != null && field939.length() > 0) {
            field947 = 1;
        } else {
            field947 = 0;
        }
    }

    @ObfuscatedName("lk.ap(Lbs;Lqh;Lqh;B)V")
    public static void method5181(class35 arg0, class432 arg1, class432 arg2) {
        if (field920) {
            method4619(arg0);
            return;
        }
        if ((class36.field220 == 1 || !Statics.field828 && class36.field220 == 4) && class36.field223 >= field922 + 765 - 50 && class36.field215 >= 453) {
            Statics.field1379.method2447(!Statics.field1379.method2473());
            method870();
            class331.method4218();
        }
        if (client.field512 == 5) {
            return;
        }
        if (field954 == -1L) {
            field954 = class327.method4500() + 1000L;
        }
        long var3 = class327.method4500();
        if (client.method2660() && field955 == -1L) {
            field955 = var3;
            if (field955 > field954) {
                field954 = field955;
            }
        }
        if (client.field512 != 10 && client.field512 != 11) {
            return;
        }
        if (Statics.field1514 == class403.field4627) {
            if (class36.field220 == 1 || !Statics.field828 && class36.field220 == 4) {
                int var5 = field922 + 5;
                short var6 = 463;
                byte var7 = 100;
                byte var8 = 35;
                if (class36.field223 >= var5 && class36.field223 <= var5 + var7 && class36.field215 >= var6 && class36.field215 <= var6 + var8) {
                    method6768();
                    return;
                }
            }
            if (Statics.field1844 != null) {
                method6768();
            }
        }
        int var9 = class36.field220;
        int var10 = class36.field223;
        int var11 = class36.field215;
        if (var9 == 0) {
            var10 = class36.field224;
            var11 = class36.field214;
        }
        if (!Statics.field828 && var9 == 4) {
            var9 = 1;
        }
        class232 var12 = client.method2976();
        if (field934 == 0) {
            boolean var13 = false;
            while (var12.method4034()) {
                if (var12.field2461 == 84) {
                    var13 = true;
                }
            }
            int var14 = Statics.field929 - 80;
            short var15 = 291;
            if (var9 == 1 && var10 >= var14 - 75 && var10 <= var14 + 75 && var11 >= var15 - 20 && var11 <= var15 + 20) {
                class32.method7064(client.method1174("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var16 = Statics.field929 + 80;
            if (var9 == 1 && var10 >= var16 - 75 && var10 <= var16 + 75 && var11 >= var15 - 20 && var11 <= var15 + 20 || var13) {
                method2254();
            }
        } else if (field934 == 1) {
            while (true) {
                if (!var12.method4034()) {
                    int var17 = Statics.field929 - 80;
                    short var18 = 321;
                    if (var9 == 1 && var10 >= var17 - 75 && var10 <= var17 + 75 && var11 >= var18 - 20 && var11 <= var18 + 20) {
                        method3112(false);
                    }
                    int var19 = Statics.field929 + 80;
                    if (var9 == 1 && var10 >= var19 - 75 && var10 <= var19 + 75 && var11 >= var18 - 20 && var11 <= var18 + 20) {
                        method3187(0);
                    }
                    break;
                }
                if (var12.field2461 == 84) {
                    method3112(false);
                } else if (var12.field2461 == 13) {
                    method3187(0);
                }
            }
        } else if (field934 == 2) {
            short var20 = 201;
            int var147 = var20 + 52;
            if (var9 == 1 && var11 >= var147 - 12 && var11 < var147 + 2) {
                field947 = 0;
            }
            var147 += 15;
            if (var9 == 1 && var11 >= var147 - 12 && var11 < var147 + 2) {
                field947 = 1;
            }
            var147 += 15;
            short var21 = 361;
            if (Statics.field2036 != null) {
                int var22 = Statics.field2036.field4686 / 2;
                if (var9 == 1 && var10 >= Statics.field2036.field4688 - var22 && var10 <= Statics.field2036.field4688 + var22 && var11 >= var21 - 15 && var11 < var21) {
                    switch(field933) {
                        case 1:
                            class32.method7064(class379.field4402, true, false);
                            return;
                        case 2:
                            class32.method7064("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var23 = Statics.field929 - 80;
            short var24 = 321;
            if (var9 == 1 && var10 >= var23 - 75 && var10 <= var23 + 75 && var11 >= var24 - 20 && var11 <= var24 + 20) {
                method428();
                return;
            }
            int var25 = field928 + 180 + 80;
            if (var9 == 1 && var10 >= var25 - 75 && var10 <= var25 + 75 && var11 >= var24 - 20 && var11 <= var24 + 20) {
                method3187(0);
                field939 = "";
                field940 = "";
                Statics.field21 = 0;
                Statics.field1689 = "";
                field925 = true;
            }
            int var26 = Statics.field929 + -117;
            short var27 = 277;
            field944 = var10 >= var26 && var10 < Statics.field5245 + var26 && var11 >= var27 && var11 < Statics.field59 + var27;
            if (var9 == 1 && field944) {
                client.field558 = !client.field558;
                if (!client.field558 && Statics.field1379.method2463() != null) {
                    Statics.field1379.method2462((String) null);
                }
            }
            int var28 = Statics.field929 + 24;
            short var29 = 277;
            field960 = var10 >= var28 && var10 < Statics.field5245 + var28 && var11 >= var29 && var11 < Statics.field59 + var29;
            if (var9 == 1 && field960) {
                Statics.field1379.method2501(!Statics.field1379.method2543());
                if (!Statics.field1379.method2543()) {
                    field939 = "";
                    Statics.field1379.method2462((String) null);
                    method2842();
                }
            }
            while (true) {
                Transferable var33;
                int var34;
                do {
                    while (true) {
                        label987: do {
                            while (true) {
                                while (var12.method4034()) {
                                    if (var12.field2461 == 13) {
                                        method3187(0);
                                        field939 = "";
                                        field940 = "";
                                        Statics.field21 = 0;
                                        Statics.field1689 = "";
                                        field925 = true;
                                    } else {
                                        if (field947 != 0) {
                                            continue label987;
                                        }
                                        char var30 = var12.field2460;
                                        for (int var31 = 0; var31 < field937.length() && var30 != field937.charAt(var31); var31++) {
                                        }
                                        if (var12.field2461 == 85 && field939.length() > 0) {
                                            field939 = field939.substring(0, field939.length() - 1);
                                        }
                                        if (var12.field2461 == 84 || var12.field2461 == 80) {
                                            field947 = 1;
                                        }
                                        if (method382(var12.field2460) && field939.length() < 320) {
                                            field939 = field939 + var12.field2460;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field947 != 1);
                        if (var12.field2461 == 85 && field940.length() > 0) {
                            field940 = field940.substring(0, field940.length() - 1);
                        } else if (var12.field2461 == 84 || var12.field2461 == 80) {
                            field947 = 0;
                            if (var12.field2461 == 84) {
                                method428();
                                return;
                            }
                        }
                        if ((var12.method4036(82) || var12.method4036(87)) && var12.field2461 == 67) {
                            Clipboard var32 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var33 = var32.getContents(Statics.field4675);
                            var34 = 20 - field940.length();
                            break;
                        }
                        if (class414.method3814(var12.field2460) && method382(var12.field2460) && field940.length() < 20) {
                            field940 = field940 + var12.field2460;
                        }
                    }
                } while (var34 <= 0);
                try {
                    String var35 = (String) var33.getTransferData(DataFlavor.stringFlavor);
                    int var36 = Math.min(var34, var35.length());
                    for (int var37 = 0; var37 < var36; var37++) {
                        if (!class414.method3814(var35.charAt(var37)) || !method382(var35.charAt(var37))) {
                            method3187(3);
                            return;
                        }
                    }
                    field940 = field940 + var35.substring(0, var36);
                } catch (UnsupportedFlavorException var145) {
                } catch (IOException var146) {
                }
            }
        } else if (field934 == 3) {
            int var40 = field928 + 180;
            short var41 = 241;
            class420 var42 = arg1.method7431(25, class379.field4367.length() - 34, class379.field4367, var40, var41);
            if (var9 == 1 && var42.method7023(var10, var11)) {
                class32.method7064(class379.field4373, true, false);
            }
            int var43 = field928 + 180;
            short var44 = 276;
            if (var9 == 1 && var10 >= var43 - 75 && var10 <= var43 + 75 && var11 >= var44 - 20 && var11 <= var44 + 20) {
                method2845(false);
            }
            int var45 = field928 + 180;
            short var46 = 326;
            if (var9 == 1 && var10 >= var45 - 75 && var10 <= var45 + 75 && var11 >= var46 - 20 && var11 <= var46 + 20) {
                class32.method7064(class379.field4402, true, false);
                return;
            }
        } else if (field934 == 4) {
            int var47 = field928 + 180 - 80;
            short var48 = 321;
            if (var9 == 1 && var10 >= var47 - 75 && var10 <= var47 + 75 && var11 >= var48 - 20 && var11 <= var48 + 20) {
                method4207();
                return;
            }
            if (var9 == 1 && var10 >= field928 + 180 - 9 && var10 <= field928 + 180 + 130 && var11 >= 263 && var11 <= 296) {
                field925 = !field925;
            }
            if (var9 == 1 && var10 >= field928 + 180 - 34 && var10 <= field928 + 180 + 34 && var11 >= 351 && var11 <= 363) {
                class32.method7064(class379.field4402, true, false);
            }
            int var49 = field928 + 180 + 80;
            if (var9 == 1 && var10 >= var49 - 75 && var10 <= var49 + 75 && var11 >= var48 - 20 && var11 <= var48 + 20) {
                method3187(0);
                field939 = "";
                field940 = "";
                Statics.field21 = 0;
                Statics.field1689 = "";
            }
            while (var12.method4034()) {
                boolean var50 = false;
                for (int var51 = 0; var51 < field935.length(); var51++) {
                    if (var12.field2460 == field935.charAt(var51)) {
                        var50 = true;
                        break;
                    }
                }
                if (var12.field2461 == 13) {
                    method3187(0);
                    field939 = "";
                    field940 = "";
                    Statics.field21 = 0;
                    Statics.field1689 = "";
                } else {
                    if (var12.field2461 == 85 && Statics.field1689.length() > 0) {
                        Statics.field1689 = Statics.field1689.substring(0, Statics.field1689.length() - 1);
                    }
                    if (var12.field2461 == 84) {
                        method4207();
                        return;
                    }
                    if (var50 && Statics.field1689.length() < 6) {
                        Statics.field1689 = Statics.field1689 + var12.field2460;
                    }
                }
            }
        } else if (field934 == 5) {
            int var52 = field928 + 180 - 80;
            short var53 = 321;
            if (var9 == 1 && var10 >= var52 - 75 && var10 <= var52 + 75 && var11 >= var53 - 20 && var11 <= var53 + 20) {
                method34();
                return;
            }
            int var54 = field928 + 180 + 80;
            if (var9 == 1 && var10 >= var54 - 75 && var10 <= var54 + 75 && var11 >= var53 - 20 && var11 <= var53 + 20) {
                method3112(true);
            }
            short var55 = 361;
            if (Statics.field2658 != null) {
                int var56 = Statics.field2658.field4686 / 2;
                if (var9 == 1 && var10 >= Statics.field2658.field4688 - var56 && var10 <= Statics.field2658.field4688 + var56 && var11 >= var55 - 15 && var11 < var55) {
                    class32.method7064(client.method1174("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var12.method4034()) {
                boolean var57 = false;
                for (int var58 = 0; var58 < field937.length(); var58++) {
                    if (var12.field2460 == field937.charAt(var58)) {
                        var57 = true;
                        break;
                    }
                }
                if (var12.field2461 == 13) {
                    method3112(true);
                } else {
                    if (var12.field2461 == 85 && field939.length() > 0) {
                        field939 = field939.substring(0, field939.length() - 1);
                    }
                    if (var12.field2461 == 84) {
                        method34();
                        return;
                    }
                    if (var57 && field939.length() < 320) {
                        field939 = field939 + var12.field2460;
                    }
                }
            }
        } else if (field934 == 6) {
            while (true) {
                do {
                    if (!var12.method4034()) {
                        short var59 = 321;
                        if (var9 == 1 && var11 >= var59 - 20 && var11 <= var59 + 20) {
                            method3112(true);
                        }
                        return;
                    }
                } while (var12.field2461 != 84 && var12.field2461 != 13);
                method3112(true);
            }
        } else if (field934 == 7) {
            if (Statics.field1502 && !client.field508) {
                int var60 = Statics.field929 - 150;
                int var61 = var60 + 240 + 25 + 40;
                short var62 = 231;
                int var63 = var62 + 40;
                if (var9 == 1 && var10 >= var60 && var10 <= var61 && var11 >= var62 && var11 <= var63) {
                    int var64 = var60;
                    int var65 = 0;
                    int var66;
                    while (true) {
                        if (var65 >= 8) {
                            var66 = 0;
                            break;
                        }
                        if (var10 <= var64 + 30) {
                            var66 = var65;
                            break;
                        }
                        var64 += 30;
                        var64 += var65 == 1 || var65 == 3 ? 20 : 5;
                        var65++;
                    }
                    field951 = var66;
                }
                int var67 = field928 + 180 - 80;
                short var68 = 321;
                if (var9 == 1 && var10 >= var67 - 75 && var10 <= var67 + 75 && var11 >= var68 - 20 && var11 <= var68 + 20) {
                    boolean var77;
                    label858: {
                        Date var75;
                        try {
                            SimpleDateFormat var69 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                            var69.setLenient(false);
                            StringBuilder var70 = new StringBuilder();
                            String[] var71 = field942;
                            int var72 = 0;
                            Date var74;
                            while (true) {
                                if (var72 >= var71.length) {
                                    var70.append("12");
                                    var74 = var69.parse(var70.toString());
                                    break;
                                }
                                String var73 = var71[var72];
                                if (var73 == null) {
                                    method3187(7);
                                    method3460("Date not valid.", "Please ensure all characters are populated.", "");
                                    var74 = null;
                                    break;
                                }
                                var70.append(var73);
                                var72++;
                            }
                            var75 = var74;
                        } catch (ParseException var144) {
                            method3187(7);
                            method3460("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var77 = false;
                            break label858;
                        }
                        if (var75 == null) {
                            var77 = false;
                        } else {
                            Calendar var78 = Calendar.getInstance();
                            var78.set(1, var78.get(1) - 13);
                            var78.set(5, var78.get(5) + 1);
                            var78.set(11, 0);
                            var78.set(12, 0);
                            var78.set(13, 0);
                            var78.set(14, 0);
                            Date var79 = var78.getTime();
                            boolean var80 = var75.before(var79);
                            Calendar var82 = Calendar.getInstance();
                            var82.set(2, 0);
                            var82.set(5, 1);
                            var82.set(1, 1900);
                            Date var83 = var82.getTime();
                            boolean var85 = var75.after(var83);
                            if (var85) {
                                if (var80) {
                                    Statics.field1813 = (int) (var75.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field1813 = 8388607;
                                }
                                var77 = true;
                            } else {
                                method3187(7);
                                method3460("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var77 = false;
                            }
                        }
                    }
                    if (var77) {
                        client.method3091(50);
                        return;
                    }
                }
                int var88 = field928 + 180 + 80;
                if (var9 == 1 && var10 >= var88 - 75 && var10 <= var88 + 75 && var11 >= var68 - 20 && var11 <= var68 + 20) {
                    field942 = new String[8];
                    method3112(true);
                }
                while (var12.method4034()) {
                    if (var12.field2461 == 101) {
                        field942[field951] = null;
                    }
                    if (var12.field2461 == 85) {
                        if (field942[field951] == null && field951 > 0) {
                            field951--;
                        }
                        field942[field951] = null;
                    }
                    if (var12.field2460 >= '0' && var12.field2460 <= '9') {
                        field942[field951] = "" + var12.field2460;
                        if (field951 < 7) {
                            field951++;
                        }
                    }
                    if (var12.field2461 == 84) {
                        boolean var97;
                        label786: {
                            Date var95;
                            try {
                                SimpleDateFormat var89 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                var89.setLenient(false);
                                StringBuilder var90 = new StringBuilder();
                                String[] var91 = field942;
                                int var92 = 0;
                                while (true) {
                                    Date var94;
                                    if (var92 < var91.length) {
                                        String var93 = var91[var92];
                                        if (var93 != null) {
                                            var90.append(var93);
                                            var92++;
                                            continue;
                                        }
                                        method3187(7);
                                        method3460("Date not valid.", "Please ensure all characters are populated.", "");
                                        var94 = null;
                                    } else {
                                        var90.append("12");
                                        var94 = var89.parse(var90.toString());
                                    }
                                    var95 = var94;
                                    break;
                                }
                            } catch (ParseException var143) {
                                method3187(7);
                                method3460("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var97 = false;
                                break label786;
                            }
                            if (var95 == null) {
                                var97 = false;
                            } else {
                                Calendar var98 = Calendar.getInstance();
                                var98.set(1, var98.get(1) - 13);
                                var98.set(5, var98.get(5) + 1);
                                var98.set(11, 0);
                                var98.set(12, 0);
                                var98.set(13, 0);
                                var98.set(14, 0);
                                Date var99 = var98.getTime();
                                boolean var100 = var95.before(var99);
                                Calendar var102 = Calendar.getInstance();
                                var102.set(2, 0);
                                var102.set(5, 1);
                                var102.set(1, 1900);
                                Date var103 = var102.getTime();
                                boolean var105 = var95.after(var103);
                                if (var105) {
                                    if (var100) {
                                        Statics.field1813 = (int) (var95.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field1813 = 8388607;
                                    }
                                    var97 = true;
                                } else {
                                    method3187(7);
                                    method3460("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var97 = false;
                                }
                            }
                        }
                        if (var97) {
                            client.method3091(50);
                        }
                        return;
                    }
                }
            } else {
                int var108 = field928 + 180 - 80;
                short var109 = 321;
                if (var9 == 1 && var10 >= var108 - 75 && var10 <= var108 + 75 && var11 >= var109 - 20 && var11 <= var109 + 20) {
                    class32.method7064(client.method1174("secure", true) + "m=dob/set_dob.ws", true, false);
                    method3460(class379.field4377, class379.field4378, class379.field4379);
                    method3187(6);
                    return;
                }
                int var110 = field928 + 180 + 80;
                if (var9 == 1 && var10 >= var110 - 75 && var10 <= var110 + 75 && var11 >= var109 - 20 && var11 <= var109 + 20) {
                    method3112(true);
                }
            }
        } else if (field934 == 8) {
            int var111 = field928 + 180 - 80;
            short var112 = 321;
            if (var9 == 1 && var10 >= var111 - 75 && var10 <= var111 + 75 && var11 >= var112 - 20 && var11 <= var112 + 20) {
                class32.method7064("https://www.jagex.com/terms/privacy", true, false);
                method3460(class379.field4377, class379.field4378, class379.field4379);
                method3187(6);
                return;
            }
            int var113 = field928 + 180 + 80;
            if (var9 == 1 && var10 >= var113 - 75 && var10 <= var113 + 75 && var11 >= var112 - 20 && var11 <= var112 + 20) {
                method3112(true);
            }
        } else if (field934 == 9) {
            int var114 = field928 + 180;
            short var115 = 311;
            if (var12.field2461 == 84 || var12.field2461 == 13 || var9 == 1 && var10 >= var114 - 75 && var10 <= var114 + 75 && var11 >= var115 - 20 && var11 <= var115 + 20) {
                method2845(false);
            }
        } else if (field934 == 10) {
            int var116 = field928 + 180;
            short var117 = 209;
            if (var12.field2461 == 84 || var9 == 1 && var10 >= var116 - 109 && var10 <= var116 + 109 && var11 >= var117 && var11 <= var117 + 68) {
                method3460(class379.field4346, class379.field4388, class379.field4348);
                client.field677 = class552.field5418;
                client.method3832(false);
                client.method3091(20);
            }
        } else if (field934 == 12) {
            int var118 = Statics.field929;
            short var119 = 233;
            class420 var120 = arg2.method7431(0, 30, class379.field4409, var118, var119);
            class420 var121 = arg2.method7431(32, 32, class379.field4409, var118, var119);
            class420 var122 = arg2.method7431(70, 34, class379.field4409, var118, var119);
            int var148 = var119 + 17;
            class420 var123 = arg2.method7431(0, 34, class379.field4128, var118, var148);
            if (var9 == 1) {
                if (var120.method7023(var10, var11)) {
                    class32.method7064("https://www.jagex.com/terms", true, false);
                } else if (var121.method7023(var10, var11)) {
                    class32.method7064("https://www.jagex.com/terms/privacy", true, false);
                } else if (var122.method7023(var10, var11) || var123.method7023(var10, var11)) {
                    class32.method7064("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var124 = Statics.field929 - 80;
            short var125 = 311;
            if (var9 == 1 && var10 >= var124 - 75 && var10 <= var124 + 75 && var11 >= var125 - 20 && var11 <= var125 + 20) {
                Statics.field1379.method2464(client.field638);
                method2845(true);
            }
            int var126 = Statics.field929 + 80;
            if (var9 == 1 && var10 >= var126 - 75 && var10 <= var126 + 75 && var11 >= var125 - 20 && var11 <= var125 + 20) {
                field934 = 13;
            }
        } else if (field934 == 13) {
            int var127 = Statics.field929;
            short var128 = 321;
            if (var9 == 1 && var10 >= var127 - 75 && var10 <= var127 + 75 && var11 >= var128 - 20 && var11 <= var128 + 20) {
                method2845(true);
            }
        } else if (field934 == 14) {
            String var129 = "";
            switch(field932) {
                case 0:
                    var129 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var129 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var129 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method3112(false);
            }
            int var130 = field928 + 180;
            short var131 = 276;
            if (var9 == 1 && var10 >= var130 - 75 && var10 <= var130 + 75 && var11 >= var131 - 20 && var11 <= var131 + 20) {
                class32.method7064(var129, true, false);
                method3460(class379.field4377, class379.field4378, class379.field4379);
                method3187(6);
                return;
            }
            int var132 = field928 + 180;
            short var133 = 326;
            if (var9 == 1 && var10 >= var132 - 75 && var10 <= var132 + 75 && var11 >= var133 - 20 && var11 <= var133 + 20) {
                method3112(false);
            }
        } else if (field934 == 24) {
            int var134 = field928 + 180;
            short var135 = 301;
            if (var9 == 1 && var10 >= var134 - 75 && var10 <= var134 + 75 && var11 >= var135 - 20 && var11 <= var135 + 20) {
                method2845(false);
            }
        } else if (field934 == 32) {
            int var136 = field928 + 180 - 80;
            short var137 = 321;
            if (var9 == 1 && var10 >= var136 - 75 && var10 <= var136 + 75 && var11 >= var137 - 20 && var11 <= var137 + 20) {
                class32.method7064(client.method1174("secure", true) + "m=dob/set_dob.ws", true, false);
                method3460(class379.field4377, class379.field4378, class379.field4379);
                method3187(6);
                return;
            }
            int var138 = field928 + 180 + 80;
            if (var9 == 1 && var10 >= var138 - 75 && var10 <= var138 + 75 && var11 >= var137 - 20 && var11 <= var137 + 20) {
                method3112(true);
            }
        } else if (field934 == 33) {
            int var139 = field928 + 180;
            short var140 = 276;
            if (var9 == 1 && var10 >= var139 - 75 && var10 <= var139 + 75 && var11 >= var140 - 20 && var11 <= var140 + 20) {
                class32.method7064(class379.field4373, true, false);
            }
            int var141 = field928 + 180;
            short var142 = 326;
            if (var9 == 1 && var10 >= var141 - 75 && var10 <= var141 + 75 && var11 >= var142 - 20 && var11 <= var142 + 20) {
                method3112(true);
            }
        }
    }

    @ObfuscatedName("jx.an(I)V")
    public static void method4207() {
        Statics.field1689.trim();
        if (Statics.field1689.length() != 6) {
            method3460(class379.field4156, class379.field4157, class379.field4158);
            return;
        }
        Statics.field21 = Integer.parseInt(Statics.field1689);
        Statics.field1689 = "";
        client.method3832(true);
        method3460(class379.field4346, class379.field4388, class379.field4348);
        client.method3091(20);
    }

    @ObfuscatedName("be.aj(I)V")
    public static void method428() {
        field939 = field939.trim();
        if (field939.length() == 0) {
            method3460(class379.field4320, class379.field4347, class379.field4239);
        } else if (field940.length() == 0) {
            method3460(class379.field4240, class379.field4225, class379.field4242);
        } else {
            method3460(class379.field4346, class379.field4388, class379.field4348);
            client.method3832(false);
            client.method3091(20);
        }
    }

    @ObfuscatedName("dm.av(I)V")
    public static void method2254() {
        if ((client.field771 & class543.field5343.method32()) != 0) {
            field938 = "";
            field936 = class379.field4342;
            field958 = class379.field4368;
            field948 = class379.field4344;
            method3187(1);
            method2842();
        } else if ((client.field771 & class543.field5320.method32()) != 0) {
            if ((client.field771 & class543.field5338.method32()) == 0) {
                field936 = class379.field4333;
                field958 = class379.field4334;
                field948 = class379.field4331;
            } else {
                field936 = class379.field4263;
                field958 = class379.field4343;
                field948 = class379.field4341;
            }
            field938 = class379.field4287;
            method3187(1);
            method2842();
        } else if ((client.field771 & class543.field5338.method32()) == 0) {
            method3112(false);
        } else {
            field936 = class379.field4336;
            field958 = class379.field4254;
            field948 = class379.field4338;
            field938 = class379.field4287;
            method3187(1);
            method2842();
        }
    }

    @ObfuscatedName("ar.ab(CB)Z")
    public static boolean method382(char arg0) {
        return field937.indexOf(arg0) != -1;
    }

    @ObfuscatedName("fj.ai(ZI)V")
    public static void method3112(boolean arg0) {
        if (Statics.field4675.method1733() || Statics.field4675.method1215() || Statics.field4675.method1184()) {
            method3187(10);
            return;
        }
        field936 = class379.field4329;
        field958 = class379.field4330;
        field948 = class379.field4241;
        method3187(2);
        if (arg0) {
            field940 = "";
        }
        if (field939 == null || field939.length() <= 0) {
            if (Statics.field1379.method2463() == null) {
                client.field558 = false;
            } else {
                field939 = Statics.field1379.method2463();
                client.field558 = true;
            }
        }
        method2842();
    }

    @ObfuscatedName("er.ae(ZB)V")
    public static void method2845(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field1379.method2465() >= client.field638;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field4675.method1733() || Statics.field4675.method1215() || Statics.field4675.method1184()) {
            var1 = 10;
        }
        method3187(var1);
        if (arg0) {
            field939 = "";
            field940 = "";
            Statics.field21 = 0;
            Statics.field1689 = "";
        }
        if (field939 == null || field939.length() <= 0) {
            if (Statics.field1379.method2463() == null) {
                client.field558 = false;
            } else {
                field939 = Statics.field1379.method2463();
                client.field558 = true;
            }
        }
        method2842();
    }

    @ObfuscatedName("aj.au(B)V")
    public static void method34() {
        field939 = field939.trim();
        if (field939.length() == 0) {
            method3460(class379.field4380, class379.field4369, class379.field4140);
            return;
        }
        long var0 = class75.method1160();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field939;
            Random var4 = new Random();
            class547 var5 = new class547(128);
            class547 var6 = new class547(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method8711(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method8714(var4.nextInt());
            }
            var5.method8714(var7[0]);
            var5.method8714(var7[1]);
            var5.method8936(var0);
            var5.method8936(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method8714(var4.nextInt());
            }
            var5.method8755(class75.field889, class75.field898);
            var6.method8711(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method8714(var4.nextInt());
            }
            var6.method8936(var4.nextLong());
            var6.method8715(var4.nextLong());
            client.method843(var6);
            var6.method8936(var4.nextLong());
            var6.method8755(class75.field889, class75.field898);
            int var11 = class547.method2396(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class547 var12 = new class547(var11);
            var12.method8718(var3);
            var12.field5363 = var11;
            var12.method8751(var7);
            class547 var13 = new class547(var12.field5363 + var6.field5363 + var5.field5363 + 5);
            var13.method8711(2);
            var13.method8711(var5.field5363);
            var13.method8721(var5.field5364, 0, var5.field5363);
            var13.method8711(var6.field5363);
            var13.method8721(var6.field5364, 0, var6.field5363);
            var13.method8712(var12.field5363);
            var13.method8721(var12.field5364, 0, var12.field5363);
            String var14 = class415.method2351(var13.field5364);
            byte var21;
            try {
                URL var15 = new URL(client.method1174("services", false) + "m=accountappeal/login.ws");
                URLConnection var16 = var15.openConnection();
                var16.setDoInput(true);
                var16.setDoOutput(true);
                var16.setConnectTimeout(5000);
                OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
                var17.write("data2=" + class571.method8622(var14) + "&dest=" + class571.method8622("passwordchoice.ws"));
                var17.flush();
                InputStream var18 = var16.getInputStream();
                class547 var19 = new class547(new byte[1000]);
                while (true) {
                    int var20 = var18.read(var19.field5364, var19.field5363, 1000 - var19.field5363);
                    if (var20 == -1) {
                        var17.close();
                        var18.close();
                        String var22 = new String(var19.field5364);
                        if (var22.startsWith("OFFLINE")) {
                            var21 = 4;
                        } else if (var22.startsWith("WRONG")) {
                            var21 = 7;
                        } else if (var22.startsWith("RELOAD")) {
                            var21 = 3;
                        } else if (var22.startsWith("Not permitted for social network accounts.")) {
                            var21 = 6;
                        } else {
                            var19.method8752(var7);
                            while (var19.field5363 > 0 && var19.field5364[var19.field5363 - 1] == 0) {
                                var19.field5363--;
                            }
                            String var23 = new String(var19.field5364, 0, var19.field5363);
                            boolean var24;
                            if (var23 == null) {
                                var24 = false;
                            } else {
                                label89: {
                                    try {
                                        new URL(var23);
                                    } catch (MalformedURLException var27) {
                                        var24 = false;
                                        break label89;
                                    }
                                    var24 = true;
                                }
                            }
                            if (var24) {
                                class32.method7064(var23, true, false);
                                var21 = 2;
                            } else {
                                var21 = 5;
                            }
                        }
                        break;
                    }
                    var19.field5363 += var20;
                    if (var19.field5363 >= 1000) {
                        var21 = 5;
                        break;
                    }
                }
            } catch (Throwable var28) {
                var28.printStackTrace();
                var21 = 5;
            }
            var2 = var21;
        }
        switch(var2) {
            case 2:
                method3460(class379.field4294, class379.field4162, class379.field4385);
                method3187(6);
                break;
            case 3:
                method3460(class379.field4386, class379.field4387, class379.field4243);
                break;
            case 4:
                method3460(class379.field4389, class379.field4403, class379.field4391);
                break;
            case 5:
                method3460(class379.field4266, class379.field4322, class379.field4394);
                break;
            case 6:
                method3460(class379.field4395, class379.field4396, class379.field4237);
                break;
            case 7:
                method3460(class379.field4183, class379.field4399, class379.field4400);
        }
    }

    @ObfuscatedName("fl.ah(Lqh;Lqh;Lqh;B)V")
    public static void method3035(class432 arg0, class432 arg1, class432 arg2) {
        field922 = (Statics.field890 - 765) / 2;
        field928 = field922 + 202;
        Statics.field929 = field928 + 180;
        if (field920) {
            method56(arg0, arg1);
            return;
        }
        Statics.field924.method9197(field922, 0);
        Statics.field1968.method9197(field922 + 382, 0);
        Statics.field4476.method9148(field922 + 382 - Statics.field4476.field5451 / 2, 18);
        if (client.field512 == 0 || client.field512 == 5) {
            byte var3 = 20;
            arg0.method7435(class379.field4328, field928 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class557.method9064(field928 + 180 - 152, var4, 304, 34, 9179409);
            class557.method9064(field928 + 180 - 151, var4 + 1, 302, 32, 0);
            class557.method9060(field928 + 180 - 150, var4 + 2, field930 * 3, 30, 9179409);
            class557.method9060(field930 * 3 + (field928 + 180 - 150), var4 + 2, 300 - field930 * 3, 30, 0);
            arg0.method7435(field931, field928 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field512 == 20) {
            Statics.field5034.method9148(field928 + 180 - Statics.field5034.field5451 / 2, 271 - Statics.field5034.field5452 / 2);
            short var5 = 201;
            arg0.method7435(field936, field928 + 180, var5, 16776960, 0);
            int var151 = var5 + 15;
            arg0.method7435(field958, field928 + 180, var151, 16776960, 0);
            int var152 = var151 + 15;
            arg0.method7435(field948, field928 + 180, var152, 16776960, 0);
            int var153 = var152 + 15;
            int var154 = var153 + 7;
            if (field934 != 4 && field934 != 10) {
                arg0.method7528(class379.field4335, field928 + 180 - 110, var154, 16777215, 0);
                short var6 = 200;
                String var13;
                if (Statics.field1379.method2543()) {
                    String var7 = field939;
                    int var8 = var7.length();
                    char[] var9 = new char[var8];
                    for (int var10 = 0; var10 < var8; var10++) {
                        var9[var10] = '*';
                    }
                    String var11 = new String(var9);
                    var13 = var11;
                } else {
                    var13 = field939;
                }
                String var15;
                for (var15 = var13; arg0.method7427(var15) > var6; var15 = var15.substring(0, var15.length() - 1)) {
                }
                arg0.method7528(class436.method7430(var15), field928 + 180 - 70, var154, 16777215, 0);
                var151 = var154 + 15;
                String var16 = field940;
                int var17 = var16.length();
                char[] var18 = new char[var17];
                for (int var19 = 0; var19 < var17; var19++) {
                    var18[var19] = '*';
                }
                String var20 = new String(var18);
                String var22;
                for (var22 = var20; arg0.method7427(var22) > var6; var22 = var22.substring(1)) {
                }
                arg0.method7528(class379.field4356 + var22, field928 + 180 - 108, var151, 16777215, 0);
                var151 += 15;
            }
        }
        if (client.field512 == 10 || client.field512 == 11 || client.field512 == 50) {
            Statics.field5034.method9148(field928, 171);
            if (field934 == 0) {
                short var23 = 251;
                arg0.method7435(class379.field4358, field928 + 180, var23, 16776960, 0);
                int var155 = var23 + 30;
                int var24 = field928 + 180 - 80;
                short var25 = 291;
                Statics.field5214.method9148(var24 - 73, var25 - 20);
                arg0.method7436(class379.field4318, var24 - 73, var25 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var26 = field928 + 180 + 80;
                Statics.field5214.method9148(var26 - 73, var25 - 20);
                arg0.method7436(class379.field4360, var26 - 73, var25 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field934 == 1) {
                arg0.method7435(field938, field928 + 180, 201, 16776960, 0);
                short var27 = 236;
                arg0.method7435(field936, field928 + 180, var27, 16777215, 0);
                int var156 = var27 + 15;
                arg0.method7435(field958, field928 + 180, var156, 16777215, 0);
                int var157 = var156 + 15;
                arg0.method7435(field948, field928 + 180, var157, 16777215, 0);
                int var158 = var157 + 15;
                int var28 = field928 + 180 - 80;
                short var29 = 321;
                Statics.field5214.method9148(var28 - 73, var29 - 20);
                arg0.method7435(class379.field4123, var28, var29 + 5, 16777215, 0);
                int var30 = field928 + 180 + 80;
                Statics.field5214.method9148(var30 - 73, var29 - 20);
                arg0.method7435(class379.field4223, var30, var29 + 5, 16777215, 0);
            } else if (field934 == 2) {
                short var31 = 201;
                arg0.method7435(field936, Statics.field929, var31, 16776960, 0);
                int var159 = var31 + 15;
                arg0.method7435(field958, Statics.field929, var159, 16776960, 0);
                int var160 = var159 + 15;
                arg0.method7435(field948, Statics.field929, var160, 16776960, 0);
                int var161 = var160 + 15;
                int var162 = var161 + 7;
                arg0.method7528(class379.field4335, Statics.field929 - 110, var162, 16777215, 0);
                short var32 = 200;
                String var39;
                if (Statics.field1379.method2543()) {
                    String var33 = field939;
                    int var34 = var33.length();
                    char[] var35 = new char[var34];
                    for (int var36 = 0; var36 < var34; var36++) {
                        var35[var36] = '*';
                    }
                    String var37 = new String(var35);
                    var39 = var37;
                } else {
                    var39 = field939;
                }
                String var41;
                for (var41 = var39; arg0.method7427(var41) > var32; var41 = var41.substring(1)) {
                }
                arg0.method7528(class436.method7430(var41) + (field947 == 0 & client.field516 % 40 < 20 ? class105.method3400(16776960) + class105.field1356 : ""), Statics.field929 - 70, var162, 16777215, 0);
                var159 = var162 + 15;
                String var42 = field940;
                int var43 = var42.length();
                char[] var44 = new char[var43];
                for (int var45 = 0; var45 < var43; var45++) {
                    var44[var45] = '*';
                }
                String var46 = new String(var44);
                String var48;
                for (var48 = var46; arg0.method7427(var48) > var32; var48 = var48.substring(1)) {
                }
                arg0.method7528(class379.field4356 + var48 + (field947 == 1 & client.field516 % 40 < 20 ? class105.method3400(16776960) + class105.field1356 : ""), Statics.field929 - 108, var159, 16777215, 0);
                var159 += 15;
                short var49 = 277;
                int var50 = Statics.field929 + -117;
                class560 var51 = method1120(client.field558, field944);
                var51.method9148(var50, var49);
                int var52 = var51.field5451 + 5 + var50;
                arg1.method7528(class379.field4363, var52, var49 + 13, 16776960, 0);
                int var53 = Statics.field929 + 24;
                class560 var54 = method1120(Statics.field1379.method2543(), field960);
                var54.method9148(var53, var49);
                int var55 = var54.field5451 + 5 + var53;
                arg1.method7528(class379.field4364, var55, var49 + 13, 16776960, 0);
                int var163 = var49 + 15;
                int var56 = Statics.field929 - 80;
                short var57 = 321;
                Statics.field5214.method9148(var56 - 73, var57 - 20);
                arg0.method7435(class379.field4361, var56, var57 + 5, 16777215, 0);
                int var58 = Statics.field929 + 80;
                Statics.field5214.method9148(var58 - 73, var57 - 20);
                arg0.method7435(class379.field4223, var58, var57 + 5, 16777215, 0);
                short var59 = 357;
                switch(field933) {
                    case 2:
                        Statics.field2657 = class379.field4234;
                        break;
                    default:
                        Statics.field2657 = class379.field4374;
                }
                Statics.field2036 = new class420(Statics.field929, var59, arg1.method7427(Statics.field2657), 11);
                Statics.field2658 = new class420(Statics.field929, var59, arg1.method7427(class379.field4375), 11);
                arg1.method7435(Statics.field2657, Statics.field929, var59, 16777215, 0);
            } else if (field934 == 3) {
                short var60 = 201;
                arg0.method7435(class379.field4365, field928 + 180, var60, 16776960, 0);
                int var164 = var60 + 20;
                arg1.method7435(class379.field4129, field928 + 180, var164, 16776960, 0);
                int var165 = var164 + 20;
                arg1.method7435(class379.field4367, field928 + 180, var165, 16776960, 0);
                int var166 = var165 + 15;
                int var61 = field928 + 180;
                short var62 = 276;
                Statics.field5214.method9148(var61 - 73, var62 - 20);
                arg2.method7435(class379.field4349, var61, var62 + 5, 16777215, 0);
                int var63 = field928 + 180;
                short var64 = 326;
                Statics.field5214.method9148(var63 - 73, var64 - 20);
                arg2.method7435(class379.field4312, var63, var64 + 5, 16777215, 0);
            } else if (field934 == 4) {
                arg0.method7435(class379.field4376, field928 + 180, 201, 16776960, 0);
                short var65 = 236;
                arg0.method7435(field936, field928 + 180, var65, 16777215, 0);
                int var167 = var65 + 15;
                arg0.method7435(field958, field928 + 180, var167, 16777215, 0);
                int var168 = var167 + 15;
                arg0.method7435(field948, field928 + 180, var168, 16777215, 0);
                int var169 = var168 + 15;
                String var67 = class379.field4357;
                String var68 = Statics.field1689;
                int var69 = var68.length();
                char[] var70 = new char[var69];
                for (int var71 = 0; var71 < var69; var71++) {
                    var70[var71] = '*';
                }
                String var72 = new String(var70);
                arg0.method7528(var67 + var72 + (client.field516 % 40 < 20 ? class105.method3400(16776960) + class105.field1356 : ""), field928 + 180 - 108, var169, 16777215, 0);
                var167 = var169 - 8;
                arg0.method7528(class379.field4126, field928 + 180 - 9, var167, 16776960, 0);
                var167 += 15;
                arg0.method7528(class379.field4345, field928 + 180 - 9, var167, 16776960, 0);
                int var74 = field928 + 180 - 9 + arg0.method7427(class379.field4345) + 15;
                int var75 = var167 - arg0.field4768;
                class560 var76;
                if (field925) {
                    var76 = Statics.field926;
                } else {
                    var76 = Statics.field1648;
                }
                var76.method9148(var74, var75);
                var167 += 15;
                int var77 = field928 + 180 - 80;
                short var78 = 321;
                Statics.field5214.method9148(var77 - 73, var78 - 20);
                arg0.method7435(class379.field4123, var77, var78 + 5, 16777215, 0);
                int var79 = field928 + 180 + 80;
                Statics.field5214.method9148(var79 - 73, var78 - 20);
                arg0.method7435(class379.field4223, var79, var78 + 5, 16777215, 0);
                arg1.method7435(class379.field4374, field928 + 180, var78 + 36, 16777215, 0);
            } else if (field934 == 5) {
                arg0.method7435(class379.field4171, field928 + 180, 201, 16776960, 0);
                short var80 = 221;
                arg2.method7435(field936, field928 + 180, var80, 16776960, 0);
                int var170 = var80 + 15;
                arg2.method7435(field958, field928 + 180, var170, 16776960, 0);
                int var171 = var170 + 15;
                arg2.method7435(field948, field928 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                int var173 = var172 + 14;
                arg0.method7528(class379.field4406, field928 + 180 - 145, var173, 16777215, 0);
                short var81 = 174;
                String var88;
                if (Statics.field1379.method2543()) {
                    String var82 = field939;
                    int var83 = var82.length();
                    char[] var84 = new char[var83];
                    for (int var85 = 0; var85 < var83; var85++) {
                        var84[var85] = '*';
                    }
                    String var86 = new String(var84);
                    var88 = var86;
                } else {
                    var88 = field939;
                }
                String var90;
                for (var90 = var88; arg0.method7427(var90) > var81; var90 = var90.substring(1)) {
                }
                arg0.method7528(class436.method7430(var90) + (client.field516 % 40 < 20 ? class105.method3400(16776960) + class105.field1356 : ""), field928 + 180 - 34, var173, 16777215, 0);
                var170 = var173 + 15;
                int var91 = field928 + 180 - 80;
                short var92 = 321;
                Statics.field5214.method9148(var91 - 73, var92 - 20);
                arg0.method7435(class379.field4425, var91, var92 + 5, 16777215, 0);
                int var93 = field928 + 180 + 80;
                Statics.field5214.method9148(var93 - 73, var92 - 20);
                arg0.method7435(class379.field4202, var93, var92 + 5, 16777215, 0);
                short var94 = 356;
                arg1.method7435(class379.field4375, Statics.field929, var94, 268435455, 0);
            } else if (field934 == 6) {
                short var95 = 201;
                arg0.method7435(field936, field928 + 180, var95, 16776960, 0);
                int var174 = var95 + 15;
                arg0.method7435(field958, field928 + 180, var174, 16776960, 0);
                int var175 = var174 + 15;
                arg0.method7435(field948, field928 + 180, var175, 16776960, 0);
                int var176 = var175 + 15;
                int var96 = field928 + 180;
                short var97 = 321;
                Statics.field5214.method9148(var96 - 73, var97 - 20);
                arg0.method7435(class379.field4202, var96, var97 + 5, 16777215, 0);
            } else if (field934 == 7) {
                if (Statics.field1502 && !client.field508) {
                    short var98 = 201;
                    arg0.method7435(field936, Statics.field929, var98, 16776960, 0);
                    int var177 = var98 + 15;
                    arg0.method7435(field958, Statics.field929, var177, 16776960, 0);
                    int var178 = var177 + 15;
                    arg0.method7435(field948, Statics.field929, var178, 16776960, 0);
                    int var99 = Statics.field929 - 150;
                    int var179 = var178 + 10;
                    for (int var100 = 0; var100 < 8; var100++) {
                        Statics.field5214.method9146(var99, var179, 30, 40);
                        boolean var101 = field951 == var100 & client.field516 % 40 < 20;
                        arg0.method7528((field942[var100] == null ? "" : field942[var100]) + (var101 ? class105.method3400(16776960) + class105.field1356 : ""), var99 + 10, var179 + 27, 16777215, 0);
                        if (var100 == 1 || var100 == 3) {
                            var99 += 50;
                            arg0.method7528(class436.method7430("/"), var99 - 13, var179 + 27, 16777215, 0);
                        } else {
                            var99 += 35;
                        }
                    }
                    int var102 = Statics.field929 - 80;
                    short var103 = 321;
                    Statics.field5214.method9148(var102 - 73, var103 - 20);
                    arg0.method7435("Submit", var102, var103 + 5, 16777215, 0);
                    int var104 = Statics.field929 + 80;
                    Statics.field5214.method9148(var104 - 73, var103 - 20);
                    arg0.method7435(class379.field4223, var104, var103 + 5, 16777215, 0);
                } else {
                    short var105 = 216;
                    arg0.method7435(class379.field4401, field928 + 180, var105, 16776960, 0);
                    int var180 = var105 + 15;
                    arg2.method7435(class379.field4372, field928 + 180, var180, 16776960, 0);
                    int var181 = var180 + 15;
                    arg2.method7435(class379.field4153, field928 + 180, var181, 16776960, 0);
                    int var182 = var181 + 15;
                    int var106 = field928 + 180 - 80;
                    short var107 = 321;
                    Statics.field5214.method9148(var106 - 73, var107 - 20);
                    arg0.method7435(class379.field4404, var106, var107 + 5, 16777215, 0);
                    int var108 = field928 + 180 + 80;
                    Statics.field5214.method9148(var108 - 73, var107 - 20);
                    arg0.method7435(class379.field4202, var108, var107 + 5, 16777215, 0);
                }
            } else if (field934 == 8) {
                short var109 = 216;
                arg0.method7435(class379.field4115, field928 + 180, var109, 16776960, 0);
                int var183 = var109 + 15;
                arg2.method7435(class379.field4259, field928 + 180, var183, 16776960, 0);
                int var184 = var183 + 15;
                arg2.method7435(class379.field4260, field928 + 180, var184, 16776960, 0);
                int var185 = var184 + 15;
                int var110 = field928 + 180 - 80;
                short var111 = 321;
                Statics.field5214.method9148(var110 - 73, var111 - 20);
                arg0.method7435(class379.field4261, var110, var111 + 5, 16777215, 0);
                int var112 = field928 + 180 + 80;
                Statics.field5214.method9148(var112 - 73, var111 - 20);
                arg0.method7435(class379.field4202, var112, var111 + 5, 16777215, 0);
            } else if (field934 == 9) {
                short var113 = 221;
                arg0.method7435(field936, field928 + 180, var113, 16776960, 0);
                int var186 = var113 + 25;
                arg0.method7435(field958, field928 + 180, var186, 16776960, 0);
                int var187 = var186 + 25;
                arg0.method7435(field948, field928 + 180, var187, 16776960, 0);
                int var114 = field928 + 180;
                short var115 = 311;
                Statics.field5214.method9148(var114 - 73, var115 - 20);
                arg0.method7435(class379.field4349, var114, var115 + 5, 16777215, 0);
            } else if (field934 == 10) {
                int var116 = field928 + 180;
                short var117 = 209;
                arg0.method7435(class379.field4358, field928 + 180, var117, 16776960, 0);
                int var188 = var117 + 20;
                Statics.field1507.method9148(var116 - 109, var188);
                if (field949.isEmpty()) {
                    Statics.field923.method9148(var116 - 48, var188 + 18);
                } else {
                    Statics.field923.method9148(var116 - 48, var188 + 5);
                    arg0.method7435(field949, var116, var188 + 68 - 15, 16776960, 0);
                }
            } else if (field934 == 12) {
                int var118 = Statics.field929;
                short var119 = 216;
                arg2.method7435(class379.field4408, var118, var119, 16777215, 0);
                int var189 = var119 + 17;
                arg2.method7435(class379.field4409, var118, var189, 16777215, 0);
                int var190 = var189 + 17;
                arg2.method7435(class379.field4128, var118, var190, 16777215, 0);
                int var191 = var190 + 17;
                arg2.method7435(class379.field4411, var118, var191, 16777215, 0);
                int var120 = Statics.field929 - 80;
                short var121 = 311;
                Statics.field5214.method9148(var120 - 73, var121 - 20);
                arg0.method7435(class379.field4414, var120, var121 + 5, 16777215, 0);
                int var122 = Statics.field929 + 80;
                Statics.field5214.method9148(var122 - 73, var121 - 20);
                arg0.method7435(class379.field4415, var122, var121 + 5, 16777215, 0);
            } else if (field934 == 13) {
                short var123 = 231;
                arg2.method7435(class379.field4209, field928 + 180, var123, 16777215, 0);
                int var192 = var123 + 20;
                arg2.method7435(class379.field4413, field928 + 180, var192, 16777215, 0);
                int var124 = field928 + 180;
                short var125 = 311;
                Statics.field5214.method9148(var124 - 73, var125 - 20);
                arg0.method7435(class379.field4202, var124, var125 + 5, 16777215, 0);
            } else if (field934 == 14) {
                short var126 = 201;
                String var127 = "";
                String var128 = "";
                String var129 = "";
                switch(field932) {
                    case 0:
                        var127 = class379.field4198;
                        var128 = class379.field4172;
                        var129 = class379.field4173;
                        break;
                    case 1:
                        var127 = class379.field4210;
                        var128 = class379.field4211;
                        var129 = class379.field4212;
                        break;
                    case 2:
                        var127 = class379.field4246;
                        var128 = class379.field4247;
                        var129 = class379.field4248;
                        break;
                    default:
                        method3112(false);
                }
                arg0.method7435(var127, field928 + 180, var126, 16776960, 0);
                int var193 = var126 + 20;
                arg0.method7435(var128, field928 + 180, var193, 16776960, 0);
                int var194 = var193 + 20;
                arg0.method7435(var129, field928 + 180, var194, 16776960, 0);
                int var130 = field928 + 180;
                short var131 = 276;
                Statics.field5214.method9148(var130 - 73, var131 - 20);
                if (field932 == 1) {
                    arg0.method7435(class379.field4155, var130, var131 + 5, 16777215, 0);
                } else {
                    arg0.method7435(class379.field4154, var130, var131 + 5, 16777215, 0);
                }
                int var132 = field928 + 180;
                short var133 = 326;
                Statics.field5214.method9148(var132 - 73, var133 - 20);
                arg0.method7435(class379.field4202, var132, var133 + 5, 16777215, 0);
            } else if (field934 == 24) {
                short var134 = 221;
                arg0.method7435(field936, field928 + 180, var134, 16777215, 0);
                int var195 = var134 + 15;
                arg0.method7435(field958, field928 + 180, var195, 16777215, 0);
                int var196 = var195 + 15;
                arg0.method7435(field948, field928 + 180, var196, 16777215, 0);
                int var197 = var196 + 15;
                int var135 = field928 + 180;
                short var136 = 301;
                Statics.field5214.method9148(var135 - 73, var136 - 20);
                arg0.method7435(class379.field4118, var135, var136 + 5, 16777215, 0);
            } else if (field934 == 32) {
                short var137 = 216;
                arg0.method7435(class379.field4401, field928 + 180, var137, 16776960, 0);
                int var198 = var137 + 15;
                arg2.method7435(class379.field4372, field928 + 180, var198, 16776960, 0);
                int var199 = var198 + 15;
                arg2.method7435(class379.field4153, field928 + 180, var199, 16776960, 0);
                int var200 = var199 + 15;
                int var138 = field928 + 180 - 80;
                short var139 = 321;
                Statics.field5214.method9148(var138 - 73, var139 - 20);
                arg0.method7435(class379.field4404, var138, var139 + 5, 16777215, 0);
                int var140 = field928 + 180 + 80;
                Statics.field5214.method9148(var140 - 73, var139 - 20);
                arg0.method7435(class379.field4202, var140, var139 + 5, 16777215, 0);
            } else if (field934 == 33) {
                short var141 = 201;
                arg0.method7435(field936, field928 + 180, var141, 16776960, 0);
                int var201 = var141 + 20;
                arg1.method7435(field958, field928 + 180, var201, 16776960, 0);
                int var202 = var201 + 20;
                arg1.method7435(field948, field928 + 180, var202, 16776960, 0);
                int var203 = var202 + 15;
                int var142 = field928 + 180;
                short var143 = 276;
                Statics.field5214.method9148(var142 - 73, var143 - 20);
                arg2.method7435(class379.field4417, var142, var143 + 5, 16777215, 0);
                int var144 = field928 + 180;
                short var145 = 326;
                Statics.field5214.method9148(var144 - 73, var145 - 20);
                arg2.method7435(class379.field4202, var144, var145 + 5, 16777215, 0);
            }
        }
        if (client.field512 >= 10) {
            int[] var146 = new int[4];
            class557.method9054(var146);
            class557.method9105(field922, 0, field922 + 765, Statics.field5);
            Statics.field1107.method2408(field922 - 22, client.field516);
            Statics.field1107.method2408(field922 + 765 + 22 - 128, client.field516);
            class557.method9055(var146);
        }
        Statics.field4730[Statics.field1379.method2473() ? 1 : 0].method9148(field922 + 765 - 40, 463);
        if (client.field512 <= 5 || Statics.field1514 != class403.field4627) {
            return;
        }
        if (Statics.field1450 == null) {
            Statics.field1450 = class562.method6773(Statics.field30, "sl_button", "");
            return;
        }
        int var147 = field922 + 5;
        short var148 = 463;
        byte var149 = 100;
        byte var150 = 35;
        Statics.field1450.method9148(var147, var148);
        arg0.method7435(class379.field4127 + " " + client.field500, var149 / 2 + var147, var150 / 2 + var148 - 2, 16777215, 0);
        if (Statics.field1844 == null) {
            arg1.method7435(class379.field4426, var149 / 2 + var147, var150 / 2 + var148 + 12, 16777215, 0);
        } else {
            arg1.method7435(class379.field4167, var149 / 2 + var147, var150 / 2 + var148 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("hx.az(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3460(String arg0, String arg1, String arg2) {
        field936 = arg0;
        field958 = arg1;
        field948 = arg2;
    }

    @ObfuscatedName("av.ax(Lqh;Lqh;B)V")
    public static void method56(class432 arg0, class432 arg1) {
        if (Statics.field5478 == null) {
            class385 var2 = Statics.field30;
            class561[] var3;
            if (var2.method6544("sl_back", "")) {
                int var4 = var2.method6555("sl_back");
                int var5 = var2.method6609(var4, "");
                var3 = class562.method7834(var2, var4, var5);
            } else {
                var3 = null;
            }
            Statics.field5478 = var3;
        }
        if (Statics.field1367 == null) {
            Statics.field1367 = Statics.method8198(Statics.field30, "sl_flags", "");
        }
        if (Statics.field918 == null) {
            Statics.field918 = Statics.method8198(Statics.field30, "sl_arrows", "");
        }
        if (Statics.field4604 == null) {
            Statics.field4604 = Statics.method8198(Statics.field30, "sl_stars", "");
        }
        if (Statics.field152 == null) {
            Statics.field152 = class562.method6773(Statics.field30, "leftarrow", "");
        }
        if (Statics.field3986 == null) {
            Statics.field3986 = class562.method6773(Statics.field30, "rightarrow", "");
        }
        class557.method9060(field922, 23, 765, 480, 0);
        class557.method9061(field922, 0, 125, 23, 12425273, 9135624);
        class557.method9061(field922 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method7435(class379.field4416, field922 + 62, 15, 0, -1);
        if (Statics.field4604 != null) {
            Statics.field4604[1].method9148(field922 + 140, 1);
            arg1.method7528(class379.field4366, field922 + 152, 10, 16777215, -1);
            Statics.field4604[0].method9148(field922 + 140, 12);
            arg1.method7528(class379.field4418, field922 + 152, 21, 16777215, -1);
        }
        if (Statics.field918 != null) {
            int var6 = field922 + 280;
            if (class70.field818[0] == 0 && class70.field817[0] == 0) {
                Statics.field918[2].method9148(var6, 4);
            } else {
                Statics.field918[0].method9148(var6, 4);
            }
            if (class70.field818[0] == 0 && class70.field817[0] == 1) {
                Statics.field918[3].method9148(var6 + 15, 4);
            } else {
                Statics.field918[1].method9148(var6 + 15, 4);
            }
            arg0.method7528(class379.field4419, var6 + 32, 17, 16777215, -1);
            int var7 = field922 + 390;
            if (class70.field818[0] == 1 && class70.field817[0] == 0) {
                Statics.field918[2].method9148(var7, 4);
            } else {
                Statics.field918[0].method9148(var7, 4);
            }
            if (class70.field818[0] == 1 && class70.field817[0] == 1) {
                Statics.field918[3].method9148(var7 + 15, 4);
            } else {
                Statics.field918[1].method9148(var7 + 15, 4);
            }
            arg0.method7528(class379.field4420, var7 + 32, 17, 16777215, -1);
            int var8 = field922 + 500;
            if (class70.field818[0] == 2 && class70.field817[0] == 0) {
                Statics.field918[2].method9148(var8, 4);
            } else {
                Statics.field918[0].method9148(var8, 4);
            }
            if (class70.field818[0] == 2 && class70.field817[0] == 1) {
                Statics.field918[3].method9148(var8 + 15, 4);
            } else {
                Statics.field918[1].method9148(var8 + 15, 4);
            }
            arg0.method7528(class379.field4421, var8 + 32, 17, 16777215, -1);
            int var9 = field922 + 610;
            if (class70.field818[0] == 3 && class70.field817[0] == 0) {
                Statics.field918[2].method9148(var9, 4);
            } else {
                Statics.field918[0].method9148(var9, 4);
            }
            if (class70.field818[0] == 3 && class70.field817[0] == 1) {
                Statics.field918[3].method9148(var9 + 15, 4);
            } else {
                Statics.field918[1].method9148(var9 + 15, 4);
            }
            arg0.method7528(class379.field4250, var9 + 32, 17, 16777215, -1);
        }
        class557.method9060(field922 + 708, 4, 50, 16, 0);
        arg1.method7435(class379.field4223, field922 + 708 + 25, 16, 16777215, -1);
        field950 = -1;
        if (Statics.field5478 == null) {
            return;
        }
        byte var10 = 88;
        byte var11 = 19;
        int var12 = 765 / (var10 + 1) - 1;
        int var13 = 480 / (var11 + 1);
        int var14;
        int var15;
        do {
            var14 = var13;
            var15 = var12;
            if ((var12 - 1) * var13 >= class70.field815) {
                var12--;
            }
            if ((var13 - 1) * var12 >= class70.field815) {
                var13--;
            }
            if ((var13 - 1) * var12 >= class70.field815) {
                var13--;
            }
        } while (var13 != var14 || var12 != var15);
        int var16 = (765 - var10 * var12) / (var12 + 1);
        if (var16 > 5) {
            var16 = 5;
        }
        int var17 = (480 - var11 * var13) / (var13 + 1);
        if (var17 > 5) {
            var17 = 5;
        }
        int var18 = (765 - var10 * var12 - (var12 - 1) * var16) / 2;
        int var19 = (480 - var11 * var13 - (var13 - 1) * var17) / 2;
        int var20 = (class70.field815 + var13 - 1) / var13;
        field953 = var20 - var12;
        if (Statics.field152 != null && field952 > 0) {
            Statics.field152.method9148(8, Statics.field5 / 2 - Statics.field152.field5452 / 2);
        }
        if (Statics.field3986 != null && field952 < field953) {
            Statics.field3986.method9148(Statics.field890 - Statics.field3986.field5451 - 8, Statics.field5 / 2 - Statics.field3986.field5452 / 2);
        }
        int var21 = var19 + 23;
        int var22 = field922 + var18;
        int var23 = 0;
        boolean var24 = false;
        int var25 = field952;
        for (int var26 = var13 * var25; var26 < class70.field815 && var25 - field952 < var12; var26++) {
            class70 var27 = Statics.field3820[var26];
            boolean var28 = true;
            String var29 = Integer.toString(var27.field821);
            if (var27.field821 == -1) {
                var29 = class379.field4423;
                var28 = false;
            } else if (var27.field821 > 1980) {
                var29 = class379.field4424;
                var28 = false;
            }
            class112 var30 = null;
            int var31 = 0;
            if (var27.method1803()) {
                var30 = var27.method1748() ? class112.field1428 : class112.field1433;
            } else if (var27.method1779()) {
                var30 = var27.method1748() ? class112.field1436 : class112.field1435;
            } else if (var27.method1753()) {
                var31 = 16711680;
                var30 = var27.method1748() ? class112.field1421 : class112.field1427;
            } else if (var27.method1755()) {
                var30 = var27.method1748() ? class112.field1425 : class112.field1429;
            } else if (var27.method1751()) {
                var30 = var27.method1748() ? class112.field1424 : class112.field1423;
            } else if (var27.method1784()) {
                var30 = var27.method1748() ? class112.field1430 : class112.field1431;
            } else if (var27.method1757()) {
                var30 = var27.method1748() ? class112.field1434 : class112.field1438;
            }
            if (var30 == null || var30.field1437 >= Statics.field5478.length) {
                var30 = var27.method1748() ? class112.field1422 : class112.field1432;
            }
            if (class36.field224 >= var22 && class36.field214 >= var21 && class36.field224 < var10 + var22 && class36.field214 < var11 + var21 && var28) {
                field950 = var26;
                Statics.field5478[var30.field1437].method9171(var22, var21, 128, 16777215);
                var24 = true;
            } else {
                Statics.field5478[var30.field1437].method9197(var22, var21);
            }
            if (Statics.field1367 != null) {
                Statics.field1367[(var27.method1748() ? 8 : 0) + var27.field824].method9148(var22 + 29, var21);
            }
            arg0.method7435(Integer.toString(var27.field819), var22 + 15, var11 / 2 + var21 + 5, var31, -1);
            arg1.method7435(var29, var22 + 60, var11 / 2 + var21 + 5, 268435455, -1);
            var21 += var11 + var17;
            var23++;
            if (var23 >= var13) {
                var21 = var19 + 23;
                var22 += var10 + var16;
                var23 = 0;
                var25++;
            }
        }
        if (!var24) {
            return;
        }
        int var32 = arg1.method7427(Statics.field3820[field950].field823) + 6;
        int var33 = arg1.field4768 + 8;
        int var34 = class36.field214 + 25;
        if (var33 + var34 > 480) {
            var34 = class36.field214 - 25 - var33;
        }
        class557.method9060(class36.field224 - var32 / 2, var34, var32, var33, 16777120);
        class557.method9064(class36.field224 - var32 / 2, var34, var32, var33, 0);
        arg1.method7435(Statics.field3820[field950].field823, class36.field224, arg1.field4768 + var34 + 4, 0, -1);
    }

    @ObfuscatedName("kl.ac(Lbs;I)V")
    public static void method4619(class35 arg0) {
        class232 var1 = client.field729;
        class232 var2 = var1;
        while (var2.method4034()) {
            if (var2.field2461 == 13) {
                field920 = false;
                Statics.field924.method9197(field922, 0);
                Statics.field1968.method9197(field922 + 382, 0);
                Statics.field4476.method9148(field922 + 382 - Statics.field4476.field5451 / 2, 18);
                return;
            }
            if (var2.field2461 == 96) {
                if (field952 > 0 && Statics.field152 != null) {
                    field952--;
                }
            } else if (var2.field2461 == 97 && field952 < field953 && Statics.field3986 != null) {
                field952++;
            }
        }
        if (class36.field220 != 1 && Statics.field828 || class36.field220 != 4) {
            return;
        }
        int var3 = field922 + 280;
        if (class36.field223 >= var3 && class36.field223 <= var3 + 14 && class36.field215 >= 4 && class36.field215 <= 18) {
            class70.method2565(0, 0);
            return;
        }
        if (class36.field223 >= var3 + 15 && class36.field223 <= var3 + 80 && class36.field215 >= 4 && class36.field215 <= 18) {
            class70.method2565(0, 1);
            return;
        }
        int var4 = field922 + 390;
        if (class36.field223 >= var4 && class36.field223 <= var4 + 14 && class36.field215 >= 4 && class36.field215 <= 18) {
            class70.method2565(1, 0);
            return;
        }
        if (class36.field223 >= var4 + 15 && class36.field223 <= var4 + 80 && class36.field215 >= 4 && class36.field215 <= 18) {
            class70.method2565(1, 1);
            return;
        }
        int var5 = field922 + 500;
        if (class36.field223 >= var5 && class36.field223 <= var5 + 14 && class36.field215 >= 4 && class36.field215 <= 18) {
            class70.method2565(2, 0);
            return;
        }
        if (class36.field223 >= var5 + 15 && class36.field223 <= var5 + 80 && class36.field215 >= 4 && class36.field215 <= 18) {
            class70.method2565(2, 1);
            return;
        }
        int var6 = field922 + 610;
        if (class36.field223 >= var6 && class36.field223 <= var6 + 14 && class36.field215 >= 4 && class36.field215 <= 18) {
            class70.method2565(3, 0);
            return;
        }
        if (class36.field223 >= var6 + 15 && class36.field223 <= var6 + 80 && class36.field215 >= 4 && class36.field215 <= 18) {
            class70.method2565(3, 1);
            return;
        }
        if (class36.field223 >= field922 + 708 && class36.field215 >= 4 && class36.field223 <= field922 + 708 + 50 && class36.field215 <= 20) {
            field920 = false;
            Statics.field924.method9197(field922, 0);
            Statics.field1968.method9197(field922 + 382, 0);
            Statics.field4476.method9148(field922 + 382 - Statics.field4476.field5451 / 2, 18);
            return;
        }
        if (field950 != -1) {
            class70 var7 = Statics.field3820[field950];
            boolean var8 = class544.method3399(client.field771, class543.field5332);
            boolean var9 = var7.method1779();
            Statics.field10 = var9;
            var7.field820 = var9 ? "beta" : var7.field820;
            method2270(var7);
            field920 = false;
            Statics.field924.method9197(field922, 0);
            Statics.field1968.method9197(field922 + 382, 0);
            Statics.field4476.method9148(field922 + 382 - Statics.field4476.field5451 / 2, 18);
            if (var8 != var9) {
                client.method704();
            }
            return;
        }
        if (field952 > 0 && Statics.field152 != null && class36.field223 >= 0 && class36.field223 <= Statics.field152.field5451 && class36.field215 >= Statics.field5 / 2 - 50 && class36.field215 <= Statics.field5 / 2 + 50) {
            field952--;
        }
        if (field952 < field953 && Statics.field3986 != null && class36.field223 >= Statics.field890 - Statics.field3986.field5451 - 5 && class36.field223 <= Statics.field890 && class36.field215 >= Statics.field5 / 2 - 50 && class36.field215 <= Statics.field5 / 2 + 50) {
            field952++;
        }
    }

    @ObfuscatedName("du.al(Lcw;I)V")
    public static void method2270(class70 arg0) {
        if (arg0.method1748() != client.field503) {
            client.field503 = arg0.method1748();
            boolean var1 = arg0.method1748();
            if (Statics.field2212 != var1) {
                class208.field2214.method5500();
                class208.field2219.method5500();
                class208.field2213.method5500();
                Statics.field2212 = var1;
            }
        }
        if (client.field771 != arg0.field829) {
            class385 var2 = Statics.field30;
            int var3 = arg0.field829;
            if ((var3 & class543.field5321.method32()) != 0) {
                Statics.field4476 = class562.method6773(var2, "logo_deadman_mode", "");
            } else if ((var3 & class543.field5348.method32()) != 0) {
                Statics.field4476 = class562.method6773(var2, "logo_seasonal_mode", "");
            } else if ((var3 & class543.field5326.method32()) == 0) {
                Statics.field4476 = class562.method6773(var2, "logo", "");
            } else {
                Statics.field4476 = class562.method6773(var2, "logo_speedrunning", "");
            }
        }
        Statics.field93 = arg0.field822;
        client.field500 = arg0.field819;
        client.field771 = arg0.field829;
        Statics.field4619 = arg0.field820;
        Statics.field1987 = client.field502 == 0 ? 43594 : arg0.field819 + 40000;
        Statics.field158 = client.field502 == 0 ? 443 : arg0.field819 + 50000;
        Statics.field1833 = Statics.field1987;
    }

    @ObfuscatedName("pe.ay(I)V")
    public static void method6768() {
        if (class70.method6455()) {
            field920 = true;
            field952 = 0;
            field953 = 0;
        }
    }

    @ObfuscatedName("bd.ao(B)V")
    public static void method871() {
        method3187(24);
        method3460(class379.field4149, class379.field4353, class379.field4354);
    }

    @ObfuscatedName("ga.aa(II)V")
    public static void method3187(int arg0) {
        if (field934 != arg0) {
            field934 = arg0;
        }
    }

    @ObfuscatedName("kc.as(Ljava/lang/String;I)V")
    public static void method4848(String arg0) {
        field949 = class526.method3264(arg0);
    }

    @ObfuscatedName("bd.aw(I)V")
    public static void method870() {
        if (Statics.field1379.method2473()) {
            class331.method3026(0, 0);
        } else {
            ArrayList var0 = new ArrayList();
            var0.add(new class343(Statics.field2101, "scape main", "", 255, false));
            class331.method8420(var0, 0, 0, 0, 100, false);
        }
    }

    @ObfuscatedName("ca.at(ILjava/lang/String;I)V")
    public static void method2088(int arg0, String arg1) {
        field931 = arg1;
        field930 = arg0;
    }
}
