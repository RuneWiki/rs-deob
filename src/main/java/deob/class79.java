package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@ObfuscatedName("dp")
public class class79 {

    @ObfuscatedName("dp.ag")
    public static int field950 = 0;

    @ObfuscatedName("dp.aj")
    public static int field955 = field950 + 202;

    @ObfuscatedName("dp.aw")
    public static int field953 = 10;

    @ObfuscatedName("dp.an")
    public static String field957 = "";

    @ObfuscatedName("dp.bo")
    public static int field960 = -1;

    @ObfuscatedName("dp.bq")
    public static int field961 = 1;

    @ObfuscatedName("dp.cn")
    public static int field962 = 0;

    @ObfuscatedName("dp.ch")
    public static String field963 = "";

    @ObfuscatedName("dp.cf")
    public static String field964 = "";

    @ObfuscatedName("dp.cu")
    public static String field965 = "";

    @ObfuscatedName("dp.cm")
    public static String field969 = "";

    @ObfuscatedName("dp.cj")
    public static String field967 = "";

    @ObfuscatedName("dp.cx")
    public static String field968 = "";

    @ObfuscatedName("dp.cy")
    public static int field983 = 0;

    @ObfuscatedName("dp.co")
    public static String[] field971 = new String[8];

    @ObfuscatedName("dp.cc")
    public static String field954 = "";

    @ObfuscatedName("dp.cp")
    public static boolean field972 = false;

    @ObfuscatedName("dp.cb")
    public static boolean field973 = false;

    @ObfuscatedName("dp.ck")
    public static boolean field974 = true;

    @ObfuscatedName("dp.dp")
    public static int field966 = 0;

    @ObfuscatedName("dp.df")
    public static String field970 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("dp.dv")
    public static String field975 = "1234567890";

    @ObfuscatedName("dp.dk")
    public static boolean field978 = false;

    @ObfuscatedName("dp.do")
    public static int field979 = -1;

    @ObfuscatedName("dp.dh")
    public static int field959 = 0;

    @ObfuscatedName("dp.dm")
    public static int field980 = 0;

    @ObfuscatedName("dp.di")
    public static long field982;

    @ObfuscatedName("dp.da")
    public static long field958;

    @ObfuscatedName("dp.dz")
    public static String[] field984;

    @ObfuscatedName("dp.dg")
    public static String[] field985;

    @ObfuscatedName("dp.dr")
    public static String[] field986;

    static {
        new DecimalFormat("##0.00");
        new class142();
        field982 = -1L;
        field958 = -1L;
        field984 = new String[] { "title.jpg" };
        field985 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field986 = new String[] { "logo_speedrunning" };
    }

    public class79() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bj.ac(Lpo;I)I")
    public static int method691(class391 arg0) {
        int var1 = field985.length + field984.length;
        String[] var2 = field986;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (arg0.method6797(var4) != -1) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("de.ae(Lpo;Lpo;Lsn;ZIB)V")
    public static void method2389(class391 arg0, class391 arg1, class488 arg2, boolean arg3, int arg4) {
        if (!Statics.field977) {
            if (arg4 == 0) {
                method3265(arg3);
            } else {
                method1207(arg4);
            }
            class561.method9298();
            byte[] var5 = arg0.method6800("title.jpg", "");
            Statics.field3601 = class31.method2805(var5);
            Statics.field3266 = Statics.field3601.method9411();
            Statics.method3595(arg1, client.field517);
            Statics.field1749 = class566.method8168(arg1, "titlebox", "");
            Statics.field952 = class566.method8168(arg1, "titlebutton", "");
            Statics.field981 = class566.method8168(arg1, "titlebutton_large", "");
            Statics.field949 = class566.method8168(arg1, "play_now_text", "");
            class566.method8168(arg1, "titlebutton_wide42,1", "");
            Statics.field951 = class566.method4103(arg1, "runes", "");
            Statics.field1552 = class566.method4103(arg1, "title_mute", "");
            Statics.field1863 = class566.method8168(arg1, "options_radio_buttons,0", "");
            Statics.field487 = class566.method8168(arg1, "options_radio_buttons,4", "");
            Statics.field4737 = class566.method8168(arg1, "options_radio_buttons,2", "");
            Statics.field21 = class566.method8168(arg1, "options_radio_buttons,6", "");
            Statics.field419 = Statics.field1863.field5503;
            Statics.field3427 = Statics.field1863.field5504;
            Statics.field2977 = new class102(Statics.field951, arg2.field5071);
            if (arg3) {
                field967 = "";
                field968 = "";
                field971 = new String[8];
                field983 = 0;
            }
            Statics.field353 = 0;
            Statics.field4655 = "";
            field974 = true;
            field978 = false;
            if (Statics.field4929.method2632()) {
                class335.method5635(0, 0);
            } else {
                ArrayList var6 = new ArrayList();
                var6.add(new class347(Statics.field1993, "scape main", "", 255, false));
                class335.method3443(var6, 0, 0, 0, 100, false);
            }
            class335.method863();
            class392 var7 = Statics.field5261;
            var7.method6885(false);
            Statics.field977 = true;
            field950 = (Statics.field1721 - 765) / 2;
            field955 = field950 + 202;
            Statics.field4019 = field955 + 180;
            Statics.field3601.method9513(field950, 0);
            Statics.field3266.method9513(field950 + 382, 0);
            Statics.field1515.method9387(field950 + 382 - Statics.field1515.field5503 / 2, 18);
        } else if (arg4 == 4) {
            method1207(4);
        }
    }

    @ObfuscatedName("nb.ag(B)V")
    public static void method6051() {
        if (field967 != null && field967.length() > 0) {
            return;
        }
        if (Statics.field4929.method2627() == null) {
            client.field573 = false;
        } else {
            field967 = Statics.field4929.method2627();
            client.field573 = true;
        }
    }

    @ObfuscatedName("gn.am(I)V")
    public static void method3439() {
        if (!Statics.field977) {
            return;
        }
        Statics.field1749 = null;
        Statics.field952 = null;
        Statics.field951 = null;
        Statics.field3601 = null;
        Statics.field3266 = null;
        Statics.field1515 = null;
        Statics.field1552 = null;
        Statics.field1863 = null;
        Statics.field4737 = null;
        Statics.field8 = null;
        Statics.field79 = null;
        Statics.field3168 = null;
        Statics.field1446 = null;
        Statics.field1637 = null;
        Statics.field2977.method2595();
        class335.method5635(0, 100);
        class392 var0 = Statics.field5261;
        var0.method6885(true);
        Statics.field977 = false;
    }

    @ObfuscatedName("ev.aq(B)V")
    public static void method2816() {
        if (client.field573 && field967 != null && field967.length() > 0) {
            field966 = 1;
        } else {
            field966 = 0;
        }
    }

    @ObfuscatedName("ea.af(Lba;Lqu;Lqu;I)V")
    public static void method2796(class35 arg0, class435 arg1, class435 arg2) {
        if (field978) {
            class270 var3 = client.field664;
            class270 var4 = var3;
            while (true) {
                if (!var4.method5075()) {
                    if (class36.field216 != 1 && (Statics.field1474 || class36.field216 != 4)) {
                        break;
                    }
                    int var5 = field950 + 280;
                    if (class36.field209 >= var5 && class36.field209 <= var5 + 14 && class36.field207 >= 4 && class36.field207 <= 18) {
                        class70.method3268(0, 0);
                        break;
                    }
                    if (class36.field209 >= var5 + 15 && class36.field209 <= var5 + 80 && class36.field207 >= 4 && class36.field207 <= 18) {
                        class70.method3268(0, 1);
                        break;
                    }
                    int var6 = field950 + 390;
                    if (class36.field209 >= var6 && class36.field209 <= var6 + 14 && class36.field207 >= 4 && class36.field207 <= 18) {
                        class70.method3268(1, 0);
                        break;
                    }
                    if (class36.field209 >= var6 + 15 && class36.field209 <= var6 + 80 && class36.field207 >= 4 && class36.field207 <= 18) {
                        class70.method3268(1, 1);
                        break;
                    }
                    int var7 = field950 + 500;
                    if (class36.field209 >= var7 && class36.field209 <= var7 + 14 && class36.field207 >= 4 && class36.field207 <= 18) {
                        class70.method3268(2, 0);
                        break;
                    }
                    if (class36.field209 >= var7 + 15 && class36.field209 <= var7 + 80 && class36.field207 >= 4 && class36.field207 <= 18) {
                        class70.method3268(2, 1);
                        break;
                    }
                    int var8 = field950 + 610;
                    if (class36.field209 >= var8 && class36.field209 <= var8 + 14 && class36.field207 >= 4 && class36.field207 <= 18) {
                        class70.method3268(3, 0);
                        break;
                    }
                    if (class36.field209 >= var8 + 15 && class36.field209 <= var8 + 80 && class36.field207 >= 4 && class36.field207 <= 18) {
                        class70.method3268(3, 1);
                        break;
                    }
                    if (class36.field209 >= field950 + 708 && class36.field207 >= 4 && class36.field209 <= field950 + 708 + 50 && class36.field207 <= 20) {
                        field978 = false;
                        Statics.field3601.method9513(field950, 0);
                        Statics.field3266.method9513(field950 + 382, 0);
                        Statics.field1515.method9387(field950 + 382 - Statics.field1515.field5503 / 2, 18);
                        break;
                    }
                    if (field979 == -1) {
                        if (field959 > 0 && Statics.field1879 != null && class36.field209 >= 0 && class36.field209 <= Statics.field1879.field5503 && class36.field207 >= Statics.field1500 / 2 - 50 && class36.field207 <= Statics.field1500 / 2 + 50) {
                            field959--;
                        }
                        if (field959 < field980 && Statics.field1984 != null && class36.field209 >= Statics.field1721 - Statics.field1984.field5503 - 5 && class36.field209 <= Statics.field1721 && class36.field207 >= Statics.field1500 / 2 - 50 && class36.field207 <= Statics.field1500 / 2 + 50) {
                            field959++;
                        }
                    } else {
                        class70 var9 = Statics.field293[field979];
                        int var10 = client.field517;
                        class546 var11 = class546.field5381;
                        boolean var12 = (var10 & var11.method32()) != 0;
                        boolean var14 = var9.method1836();
                        Statics.field5084 = var14;
                        var9.field835 = var14 ? "beta" : var9.field835;
                        method7466(var9);
                        field978 = false;
                        Statics.field3601.method9513(field950, 0);
                        Statics.field3266.method9513(field950 + 382, 0);
                        Statics.field1515.method9387(field950 + 382 - Statics.field1515.field5503 / 2, 18);
                        if (var12 != var14) {
                            client.method6019();
                        }
                    }
                    break;
                }
                if (var4.field2992 == 13) {
                    field978 = false;
                    Statics.field3601.method9513(field950, 0);
                    Statics.field3266.method9513(field950 + 382, 0);
                    Statics.field1515.method9387(field950 + 382 - Statics.field1515.field5503 / 2, 18);
                    break;
                }
                if (var4.field2992 == 96) {
                    if (field959 > 0 && Statics.field1879 != null) {
                        field959--;
                    }
                } else if (var4.field2992 == 97 && field959 < field980 && Statics.field1984 != null) {
                    field959++;
                }
            }
            return;
        }
        if ((class36.field216 == 1 || !Statics.field1474 && class36.field216 == 4) && class36.field209 >= field950 + 765 - 50 && class36.field207 >= 453) {
            Statics.field4929.method2605(!Statics.field4929.method2632());
            if (Statics.field4929.method2632()) {
                class335.method5635(0, 0);
            } else {
                ArrayList var15 = new ArrayList();
                var15.add(new class347(Statics.field1993, "scape main", "", 255, false));
                class335.method3443(var15, 0, 0, 0, 100, false);
            }
            class335.method863();
        }
        if (client.field528 == 5) {
            return;
        }
        if (field982 == -1L) {
            field982 = class331.method3482() + 1000L;
        }
        long var16 = class331.method3482();
        boolean var18;
        if (client.field607 == null || client.field814 >= client.field607.size()) {
            var18 = true;
        } else {
            while (true) {
                if (client.field814 >= client.field607.size()) {
                    var18 = true;
                    break;
                }
                class87 var19 = (class87) client.field607.get(client.field814);
                if (!var19.method2365()) {
                    var18 = false;
                    break;
                }
                client.field814++;
            }
        }
        if (var18 && field958 == -1L) {
            field958 = var16;
            if (field958 > field982) {
                field982 = field958;
            }
        }
        if (client.field528 != 10 && client.field528 != 11) {
            return;
        }
        if (Statics.field1329 == class406.field4647) {
            if (class36.field216 == 1 || !Statics.field1474 && class36.field216 == 4) {
                int var20 = field950 + 5;
                short var21 = 463;
                byte var22 = 100;
                byte var23 = 35;
                if (class36.field209 >= var20 && class36.field209 <= var20 + var22 && class36.field207 >= var21 && class36.field207 <= var21 + var23) {
                    if (class70.method3386()) {
                        field978 = true;
                        field959 = 0;
                        field980 = 0;
                    }
                    return;
                }
            }
            if (Statics.field2118 != null && class70.method3386()) {
                field978 = true;
                field959 = 0;
                field980 = 0;
            }
        }
        int var24 = class36.field216;
        int var25 = class36.field209;
        int var26 = class36.field207;
        if (var24 == 0) {
            var25 = class36.field217;
            var26 = class36.field210;
        }
        if (!Statics.field1474 && var24 == 4) {
            var24 = 1;
        }
        class270 var27 = client.field664;
        class270 var28 = var27;
        if (field962 == 0) {
            boolean var29 = false;
            while (var28.method5075()) {
                if (var28.field2992 == 84) {
                    var29 = true;
                }
            }
            int var30 = Statics.field4019 - 80;
            short var31 = 291;
            if (var24 == 1 && var25 >= var30 - 75 && var25 <= var30 + 75 && var26 >= var31 - 20 && var26 <= var31 + 20) {
                class32.method3941(client.method6148("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var32 = Statics.field4019 + 80;
            if (var24 == 1 && var25 >= var32 - 75 && var25 <= var32 + 75 && var26 >= var31 - 20 && var26 <= var31 + 20 || var29) {
                method3590();
            }
        } else if (field962 == 1) {
            while (true) {
                if (!var28.method5075()) {
                    int var33 = Statics.field4019 - 80;
                    short var34 = 321;
                    if (var24 == 1 && var25 >= var33 - 75 && var25 <= var33 + 75 && var26 >= var34 - 20 && var26 <= var34 + 20) {
                        method5155(false);
                    }
                    int var35 = Statics.field4019 + 80;
                    if (var24 == 1 && var25 >= var35 - 75 && var25 <= var35 + 75 && var26 >= var34 - 20 && var26 <= var34 + 20) {
                        method1207(0);
                    }
                    break;
                }
                if (var28.field2992 == 84) {
                    method5155(false);
                } else if (var28.field2992 == 13) {
                    method1207(0);
                }
            }
        } else if (field962 == 2) {
            short var36 = 201;
            int var131 = var36 + 52;
            if (var24 == 1 && var26 >= var131 - 12 && var26 < var131 + 2) {
                field966 = 0;
            }
            var131 += 15;
            if (var24 == 1 && var26 >= var131 - 12 && var26 < var131 + 2) {
                field966 = 1;
            }
            var131 += 15;
            short var37 = 361;
            if (Statics.field350 != null) {
                int var38 = Statics.field350.field4711 / 2;
                if (var24 == 1 && var25 >= Statics.field350.field4715 - var38 && var25 <= Statics.field350.field4715 + var38 && var26 >= var37 - 15 && var26 < var37) {
                    switch(field961) {
                        case 1:
                            class32.method3941(class382.field4449, true, false);
                            return;
                        case 2:
                            class32.method3941("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var39 = Statics.field4019 - 80;
            short var40 = 321;
            if (var24 == 1 && var25 >= var39 - 75 && var25 <= var39 + 75 && var26 >= var40 - 20 && var26 <= var40 + 20) {
                method443();
                return;
            }
            int var41 = field955 + 180 + 80;
            if (var24 == 1 && var25 >= var41 - 75 && var25 <= var41 + 75 && var26 >= var40 - 20 && var26 <= var40 + 20) {
                method1207(0);
                field967 = "";
                field968 = "";
                Statics.field353 = 0;
                Statics.field4655 = "";
                field974 = true;
            }
            int var42 = Statics.field4019 + -117;
            short var43 = 277;
            field972 = var25 >= var42 && var25 < Statics.field419 + var42 && var26 >= var43 && var26 < Statics.field3427 + var43;
            if (var24 == 1 && field972) {
                client.field573 = !client.field573;
                if (!client.field573 && Statics.field4929.method2627() != null) {
                    Statics.field4929.method2620((String) null);
                }
            }
            int var44 = Statics.field4019 + 24;
            short var45 = 277;
            field973 = var25 >= var44 && var25 < Statics.field419 + var44 && var26 >= var45 && var26 < Statics.field3427 + var45;
            if (var24 == 1 && field973) {
                Statics.field4929.method2656(!Statics.field4929.method2604());
                if (!Statics.field4929.method2604()) {
                    field967 = "";
                    Statics.field4929.method2620((String) null);
                    method2816();
                }
            }
            label1171: while (true) {
                Transferable var51;
                int var52;
                do {
                    while (true) {
                        label1135: do {
                            while (true) {
                                while (var28.method5075()) {
                                    if (var28.field2992 == 13) {
                                        method1207(0);
                                        field967 = "";
                                        field968 = "";
                                        Statics.field353 = 0;
                                        Statics.field4655 = "";
                                        field974 = true;
                                    } else {
                                        if (field966 != 0) {
                                            continue label1135;
                                        }
                                        char var46 = var28.field2991;
                                        for (int var47 = 0; var47 < field970.length() && var46 != field970.charAt(var47); var47++) {
                                        }
                                        if (var28.field2992 == 85 && field967.length() > 0) {
                                            field967 = field967.substring(0, field967.length() - 1);
                                        }
                                        if (var28.field2992 == 84 || var28.field2992 == 80) {
                                            field966 = 1;
                                        }
                                        char var48 = var28.field2991;
                                        boolean var49 = field970.indexOf(var48) != -1;
                                        if (var49 && field967.length() < 320) {
                                            field967 = field967 + var28.field2991;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field966 != 1);
                        if (var28.field2992 == 85 && field968.length() > 0) {
                            field968 = field968.substring(0, field968.length() - 1);
                        } else if (var28.field2992 == 84 || var28.field2992 == 80) {
                            field966 = 0;
                            if (var28.field2992 == 84) {
                                method443();
                                return;
                            }
                        }
                        if ((var28.method5077(82) || var28.method5077(87)) && var28.field2992 == 67) {
                            Clipboard var50 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var51 = var50.getContents(Statics.field3);
                            var52 = 20 - field968.length();
                            break;
                        }
                        if (class417.method2550(var28.field2991)) {
                            char var60 = var28.field2991;
                            boolean var61 = field970.indexOf(var60) != -1;
                            if (var61 && field968.length() < 20) {
                                field968 = field968 + var28.field2991;
                            }
                        }
                    }
                } while (var52 <= 0);
                try {
                    String var53 = (String) var51.getTransferData(DataFlavor.stringFlavor);
                    int var54 = Math.min(var52, var53.length());
                    int var55 = 0;
                    while (true) {
                        if (var55 >= var54) {
                            field968 = field968 + var53.substring(0, var54);
                            continue label1171;
                        }
                        if (!class417.method2550(var53.charAt(var55))) {
                            break;
                        }
                        char var56 = var53.charAt(var55);
                        boolean var57 = field970.indexOf(var56) != -1;
                        if (!var57) {
                            break;
                        }
                        var55++;
                    }
                    method1207(3);
                    return;
                } catch (UnsupportedFlavorException var129) {
                } catch (IOException var130) {
                }
            }
        } else if (field962 == 3) {
            int var62 = field955 + 180;
            short var63 = 241;
            class423 var64 = arg1.method7661(25, class382.field4336.length() - 34, class382.field4336, var62, var63);
            if (var24 == 1 && var64.method7265(var25, var26)) {
                class32.method3941(class382.field4448, true, false);
            }
            int var65 = field955 + 180;
            short var66 = 276;
            if (var24 == 1 && var25 >= var65 - 75 && var25 <= var65 + 75 && var26 >= var66 - 20 && var26 <= var66 + 20) {
                method3265(false);
            }
            int var67 = field955 + 180;
            short var68 = 326;
            if (var24 == 1 && var25 >= var67 - 75 && var25 <= var67 + 75 && var26 >= var68 - 20 && var26 <= var68 + 20) {
                class32.method3941(class382.field4449, true, false);
                return;
            }
        } else if (field962 == 4) {
            int var69 = field955 + 180 - 80;
            short var70 = 321;
            if (var24 == 1 && var25 >= var69 - 75 && var25 <= var69 + 75 && var26 >= var70 - 20 && var26 <= var70 + 20) {
                Statics.field4655.trim();
                if (Statics.field4655.length() == 6) {
                    Statics.field353 = Integer.parseInt(Statics.field4655);
                    Statics.field4655 = "";
                    client.method3367(true);
                    method2249(class382.field4196, class382.field4339, class382.field4204);
                    client.method7976(20);
                } else {
                    method2249(class382.field4376, class382.field4177, class382.field4162);
                }
                return;
            }
            if (var24 == 1 && var25 >= field955 + 180 - 9 && var25 <= field955 + 180 + 130 && var26 >= 263 && var26 <= 296) {
                field974 = !field974;
            }
            if (var24 == 1 && var25 >= field955 + 180 - 34 && var25 <= field955 + 180 + 34 && var26 >= 351 && var26 <= 363) {
                class32.method3941(class382.field4449, true, false);
            }
            int var71 = field955 + 180 + 80;
            if (var24 == 1 && var25 >= var71 - 75 && var25 <= var71 + 75 && var26 >= var70 - 20 && var26 <= var70 + 20) {
                method1207(0);
                field967 = "";
                field968 = "";
                Statics.field353 = 0;
                Statics.field4655 = "";
            }
            while (var28.method5075()) {
                boolean var72 = false;
                for (int var73 = 0; var73 < field975.length(); var73++) {
                    if (var28.field2991 == field975.charAt(var73)) {
                        var72 = true;
                        break;
                    }
                }
                if (var28.field2992 == 13) {
                    method1207(0);
                    field967 = "";
                    field968 = "";
                    Statics.field353 = 0;
                    Statics.field4655 = "";
                } else {
                    if (var28.field2992 == 85 && Statics.field4655.length() > 0) {
                        Statics.field4655 = Statics.field4655.substring(0, Statics.field4655.length() - 1);
                    }
                    if (var28.field2992 == 84) {
                        Statics.field4655.trim();
                        if (Statics.field4655.length() == 6) {
                            Statics.field353 = Integer.parseInt(Statics.field4655);
                            Statics.field4655 = "";
                            client.method3367(true);
                            method2249(class382.field4196, class382.field4339, class382.field4204);
                            client.method7976(20);
                        } else {
                            method2249(class382.field4376, class382.field4177, class382.field4162);
                        }
                        return;
                    }
                    if (var72 && Statics.field4655.length() < 6) {
                        Statics.field4655 = Statics.field4655 + var28.field2991;
                    }
                }
            }
        } else if (field962 == 5) {
            int var74 = field955 + 180 - 80;
            short var75 = 321;
            if (var24 == 1 && var25 >= var74 - 75 && var25 <= var74 + 75 && var26 >= var75 - 20 && var26 <= var75 + 20) {
                method3030();
                return;
            }
            int var76 = field955 + 180 + 80;
            if (var24 == 1 && var25 >= var76 - 75 && var25 <= var76 + 75 && var26 >= var75 - 20 && var26 <= var75 + 20) {
                method5155(true);
            }
            short var77 = 361;
            if (Statics.field825 != null) {
                int var78 = Statics.field825.field4711 / 2;
                if (var24 == 1 && var25 >= Statics.field825.field4715 - var78 && var25 <= Statics.field825.field4715 + var78 && var26 >= var77 - 15 && var26 < var77) {
                    class32.method3941(client.method6148("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var28.method5075()) {
                boolean var79 = false;
                for (int var80 = 0; var80 < field970.length(); var80++) {
                    if (var28.field2991 == field970.charAt(var80)) {
                        var79 = true;
                        break;
                    }
                }
                if (var28.field2992 == 13) {
                    method5155(true);
                } else {
                    if (var28.field2992 == 85 && field967.length() > 0) {
                        field967 = field967.substring(0, field967.length() - 1);
                    }
                    if (var28.field2992 == 84) {
                        method3030();
                        return;
                    }
                    if (var79 && field967.length() < 320) {
                        field967 = field967 + var28.field2991;
                    }
                }
            }
        } else if (field962 == 6) {
            while (true) {
                do {
                    if (!var28.method5075()) {
                        short var81 = 321;
                        if (var24 == 1 && var26 >= var81 - 20 && var26 <= var81 + 20) {
                            method5155(true);
                        }
                        return;
                    }
                } while (var28.field2992 != 84 && var28.field2992 != 13);
                method5155(true);
            }
        } else if (field962 == 7) {
            if (Statics.field110 && !client.field524) {
                int var82 = Statics.field4019 - 150;
                int var83 = var82 + 240 + 25 + 40;
                short var84 = 231;
                int var85 = var84 + 40;
                if (var24 == 1 && var25 >= var82 && var25 <= var83 && var26 >= var84 && var26 <= var85) {
                    int var86 = var82;
                    int var87 = 0;
                    int var88;
                    while (true) {
                        if (var87 >= 8) {
                            var88 = 0;
                            break;
                        }
                        if (var25 <= var86 + 30) {
                            var88 = var87;
                            break;
                        }
                        var86 += 30;
                        var86 += var87 == 1 || var87 == 3 ? 20 : 5;
                        var87++;
                    }
                    field983 = var88;
                }
                int var89 = field955 + 180 - 80;
                short var90 = 321;
                if (var24 == 1 && var25 >= var89 - 75 && var25 <= var89 + 75 && var26 >= var90 - 20 && var26 <= var90 + 20) {
                    boolean var91 = method3244();
                    if (var91) {
                        client.method7976(50);
                        return;
                    }
                }
                int var92 = field955 + 180 + 80;
                if (var24 == 1 && var25 >= var92 - 75 && var25 <= var92 + 75 && var26 >= var90 - 20 && var26 <= var90 + 20) {
                    field971 = new String[8];
                    method5155(true);
                }
                while (var28.method5075()) {
                    if (var28.field2992 == 101) {
                        field971[field983] = null;
                    }
                    if (var28.field2992 == 85) {
                        if (field971[field983] == null && field983 > 0) {
                            field983--;
                        }
                        field971[field983] = null;
                    }
                    if (var28.field2991 >= '0' && var28.field2991 <= '9') {
                        field971[field983] = "" + var28.field2991;
                        if (field983 < 7) {
                            field983++;
                        }
                    }
                    if (var28.field2992 == 84) {
                        boolean var93 = method3244();
                        if (var93) {
                            client.method7976(50);
                        }
                        return;
                    }
                }
            } else {
                int var94 = field955 + 180 - 80;
                short var95 = 321;
                if (var24 == 1 && var25 >= var94 - 75 && var25 <= var94 + 75 && var26 >= var95 - 20 && var26 <= var95 + 20) {
                    class32.method3941(client.method6148("secure", true) + "m=dob/set_dob.ws", true, false);
                    method2249(class382.field4397, class382.field4398, class382.field4344);
                    method1207(6);
                    return;
                }
                int var96 = field955 + 180 + 80;
                if (var24 == 1 && var25 >= var96 - 75 && var25 <= var96 + 75 && var26 >= var95 - 20 && var26 <= var95 + 20) {
                    method5155(true);
                }
            }
        } else if (field962 == 8) {
            int var97 = field955 + 180 - 80;
            short var98 = 321;
            if (var24 == 1 && var25 >= var97 - 75 && var25 <= var97 + 75 && var26 >= var98 - 20 && var26 <= var98 + 20) {
                class32.method3941("https://www.jagex.com/terms/privacy", true, false);
                method2249(class382.field4397, class382.field4398, class382.field4344);
                method1207(6);
                return;
            }
            int var99 = field955 + 180 + 80;
            if (var24 == 1 && var25 >= var99 - 75 && var25 <= var99 + 75 && var26 >= var98 - 20 && var26 <= var98 + 20) {
                method5155(true);
            }
        } else if (field962 == 9) {
            int var100 = field955 + 180;
            short var101 = 311;
            if (var27.field2992 == 84 || var27.field2992 == 13 || var24 == 1 && var25 >= var100 - 75 && var25 <= var100 + 75 && var26 >= var101 - 20 && var26 <= var101 + 20) {
                method3265(false);
            }
        } else if (field962 == 10) {
            int var102 = field955 + 180;
            short var103 = 209;
            if (var27.field2992 == 84 || var24 == 1 && var25 >= var102 - 109 && var25 <= var102 + 109 && var26 >= var103 && var26 <= var103 + 68) {
                method2249(class382.field4196, class382.field4339, class382.field4204);
                client.field559 = class556.field5468;
                client.method3367(false);
                client.method7976(20);
            }
        } else if (field962 == 12) {
            int var104 = Statics.field4019;
            short var105 = 233;
            class423 var106 = arg2.method7661(0, 30, class382.field4429, var104, var105);
            class423 var107 = arg2.method7661(32, 32, class382.field4429, var104, var105);
            class423 var108 = arg2.method7661(70, 34, class382.field4429, var104, var105);
            int var132 = var105 + 17;
            class423 var109 = arg2.method7661(0, 34, class382.field4430, var104, var132);
            if (var24 == 1) {
                if (var106.method7265(var25, var26)) {
                    class32.method3941("https://www.jagex.com/terms", true, false);
                } else if (var107.method7265(var25, var26)) {
                    class32.method3941("https://www.jagex.com/terms/privacy", true, false);
                } else if (var108.method7265(var25, var26) || var109.method7265(var25, var26)) {
                    class32.method3941("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var110 = Statics.field4019 - 80;
            short var111 = 311;
            if (var24 == 1 && var25 >= var110 - 75 && var25 <= var110 + 75 && var26 >= var111 - 20 && var26 <= var111 + 20) {
                client.method2308();
                method3265(true);
            }
            int var112 = Statics.field4019 + 80;
            if (var24 == 1 && var25 >= var112 - 75 && var25 <= var112 + 75 && var26 >= var111 - 20 && var26 <= var111 + 20) {
                field962 = 13;
            }
        } else if (field962 == 13) {
            int var113 = Statics.field4019;
            short var114 = 321;
            if (var24 == 1 && var25 >= var113 - 75 && var25 <= var113 + 75 && var26 >= var114 - 20 && var26 <= var114 + 20) {
                method3265(true);
            }
        } else if (field962 == 14) {
            String var115 = "";
            switch(field960) {
                case 0:
                    var115 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var115 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var115 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method5155(false);
            }
            int var116 = field955 + 180;
            short var117 = 276;
            if (var24 == 1 && var25 >= var116 - 75 && var25 <= var116 + 75 && var26 >= var117 - 20 && var26 <= var117 + 20) {
                class32.method3941(var115, true, false);
                method2249(class382.field4397, class382.field4398, class382.field4344);
                method1207(6);
                return;
            }
            int var118 = field955 + 180;
            short var119 = 326;
            if (var24 == 1 && var25 >= var118 - 75 && var25 <= var118 + 75 && var26 >= var119 - 20 && var26 <= var119 + 20) {
                method5155(false);
            }
        } else if (field962 == 24) {
            int var120 = field955 + 180;
            short var121 = 301;
            if (var24 == 1 && var25 >= var120 - 75 && var25 <= var120 + 75 && var26 >= var121 - 20 && var26 <= var121 + 20) {
                method3265(false);
            }
        } else if (field962 == 32) {
            int var122 = field955 + 180 - 80;
            short var123 = 321;
            if (var24 == 1 && var25 >= var122 - 75 && var25 <= var122 + 75 && var26 >= var123 - 20 && var26 <= var123 + 20) {
                class32.method3941(client.method6148("secure", true) + "m=dob/set_dob.ws", true, false);
                method2249(class382.field4397, class382.field4398, class382.field4344);
                method1207(6);
                return;
            }
            int var124 = field955 + 180 + 80;
            if (var24 == 1 && var25 >= var124 - 75 && var25 <= var124 + 75 && var26 >= var123 - 20 && var26 <= var123 + 20) {
                method5155(true);
            }
        } else if (field962 == 33) {
            int var125 = field955 + 180;
            short var126 = 276;
            if (var24 == 1 && var25 >= var125 - 75 && var25 <= var125 + 75 && var26 >= var126 - 20 && var26 <= var126 + 20) {
                class32.method3941(class382.field4448, true, false);
            }
            int var127 = field955 + 180;
            short var128 = 326;
            if (var24 == 1 && var25 >= var127 - 75 && var25 <= var127 + 75 && var26 >= var128 - 20 && var26 <= var128 + 20) {
                method5155(true);
            }
        }
    }

    @ObfuscatedName("bf.at(I)V")
    public static void method443() {
        field967 = field967.trim();
        if (field967.length() == 0) {
            method2249(class382.field4257, class382.field4258, class382.field4178);
        } else if (field968.length() == 0) {
            method2249(class382.field4260, class382.field4261, class382.field4262);
        } else {
            method2249(class382.field4196, class382.field4339, class382.field4204);
            client.method3367(false);
            client.method7976(20);
        }
    }

    @ObfuscatedName("hw.au(I)V")
    public static void method3590() {
        if ((client.field517 & class546.field5390.method32()) != 0) {
            field963 = "";
            field964 = class382.field4294;
            field965 = class382.field4217;
            field969 = class382.field4364;
            method1207(1);
            method2816();
        } else if ((client.field517 & class546.field5367.method32()) != 0) {
            if ((client.field517 & class546.field5375.method32()) == 0) {
                field964 = class382.field4353;
                field965 = class382.field4354;
                field969 = class382.field4355;
            } else {
                field964 = class382.field4359;
                field965 = class382.field4360;
                field969 = class382.field4361;
            }
            field963 = class382.field4202;
            method1207(1);
            method2816();
        } else if ((client.field517 & class546.field5375.method32()) == 0) {
            method5155(false);
        } else {
            field964 = class382.field4349;
            field965 = class382.field4423;
            field969 = class382.field4358;
            field963 = class382.field4202;
            method1207(1);
            method2816();
        }
    }

    @ObfuscatedName("fw.ar(I)Z")
    public static boolean method3244() {
        Date var6;
        try {
            SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
            var0.setLenient(false);
            StringBuilder var1 = new StringBuilder();
            String[] var2 = field971;
            int var3 = 0;
            while (true) {
                Date var5;
                if (var3 < var2.length) {
                    String var4 = var2[var3];
                    if (var4 != null) {
                        var1.append(var4);
                        var3++;
                        continue;
                    }
                    method1207(7);
                    method2249("Date not valid.", "Please ensure all characters are populated.", "");
                    var5 = null;
                } else {
                    var1.append("12");
                    var5 = var0.parse(var1.toString());
                }
                var6 = var5;
                break;
            }
        } catch (ParseException var12) {
            method1207(7);
            method2249("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var6 == null) {
            return false;
        }
        boolean var8 = method3651(var6);
        Date var9 = method5235();
        boolean var10 = var6.after(var9);
        if (!var10) {
            method1207(7);
            method2249("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var8) {
            Statics.field1038 = (int) (var6.getTime() / 86400000L - 11745L);
        } else {
            Statics.field1038 = 8388607;
        }
        return true;
    }

    @ObfuscatedName("ke.al(I)Ljava/util/Date;")
    public static Date method5235() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("hq.ad(Ljava/util/Date;B)Z")
    public static boolean method3651(Date arg0) {
        Calendar var1 = Calendar.getInstance();
        var1.set(1, var1.get(1) - 13);
        var1.set(5, var1.get(5) + 1);
        var1.set(11, 0);
        var1.set(12, 0);
        var1.set(13, 0);
        var1.set(14, 0);
        Date var2 = var1.getTime();
        return arg0.before(var2);
    }

    @ObfuscatedName("ks.ah(ZI)V")
    public static void method5155(boolean arg0) {
        if (Statics.field3.method1240() || Statics.field3.method1228() || Statics.field3.method1243()) {
            method1207(10);
            return;
        }
        field964 = class382.field4157;
        field965 = class382.field4445;
        field969 = class382.field4351;
        method1207(2);
        if (arg0) {
            field968 = "";
        }
        method6051();
        method2816();
    }

    @ObfuscatedName("fm.ap(ZI)V")
    public static void method3265(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field4929.method2623() >= client.field521;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field3.method1240() || Statics.field3.method1228() || Statics.field3.method1243()) {
            var1 = 10;
        }
        method1207(var1);
        if (arg0) {
            field967 = "";
            field968 = "";
            Statics.field353 = 0;
            Statics.field4655 = "";
        }
        method6051();
        method2816();
    }

    @ObfuscatedName("er.ab(B)V")
    public static void method3030() {
        field967 = field967.trim();
        if (field967.length() == 0) {
            method2249(class382.field4400, class382.field4401, class382.field4256);
            return;
        }
        long var0 = class76.method4985();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class76.method6990(var0, field967);
        }
        switch(var2) {
            case 2:
                method2249(class382.field4321, class382.field4404, class382.field4188);
                method1207(6);
                break;
            case 3:
                method2249(class382.field4406, class382.field4276, class382.field4408);
                break;
            case 4:
                method2249(class382.field4409, class382.field4328, class382.field4334);
                break;
            case 5:
                method2249(class382.field4352, class382.field4413, class382.field4414);
                break;
            case 6:
                method2249(class382.field4372, class382.field4293, class382.field4417);
                break;
            case 7:
                method2249(class382.field4418, class382.field4419, class382.field4145);
        }
    }

    @ObfuscatedName("ct.az(Lqu;Lqu;Lqu;S)V")
    public static void method1175(class435 arg0, class435 arg1, class435 arg2) {
        field950 = (Statics.field1721 - 765) / 2;
        field955 = field950 + 202;
        Statics.field4019 = field955 + 180;
        if (field978) {
            if (Statics.field8 == null) {
                Statics.field8 = class566.method5136(Statics.field479, "sl_back", "");
            }
            if (Statics.field79 == null) {
                Statics.field79 = class566.method4103(Statics.field479, "sl_flags", "");
            }
            if (Statics.field3168 == null) {
                Statics.field3168 = class566.method4103(Statics.field479, "sl_arrows", "");
            }
            if (Statics.field1446 == null) {
                Statics.field1446 = class566.method4103(Statics.field479, "sl_stars", "");
            }
            if (Statics.field1879 == null) {
                Statics.field1879 = class566.method8168(Statics.field479, "leftarrow", "");
            }
            if (Statics.field1984 == null) {
                Statics.field1984 = class566.method8168(Statics.field479, "rightarrow", "");
            }
            class561.method9302(field950, 23, 765, 480, 0);
            class561.method9303(field950, 0, 125, 23, 12425273, 9135624);
            class561.method9303(field950 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method7758(class382.field4387, field950 + 62, 15, 0, -1);
            if (Statics.field1446 != null) {
                Statics.field1446[1].method9387(field950 + 140, 1);
                arg1.method7662(class382.field4149, field950 + 152, 10, 16777215, -1);
                Statics.field1446[0].method9387(field950 + 140, 12);
                arg1.method7662(class382.field4438, field950 + 152, 21, 16777215, -1);
            }
            if (Statics.field3168 != null) {
                int var3 = field950 + 280;
                if (class70.field826[0] == 0 && class70.field836[0] == 0) {
                    Statics.field3168[2].method9387(var3, 4);
                } else {
                    Statics.field3168[0].method9387(var3, 4);
                }
                if (class70.field826[0] == 0 && class70.field836[0] == 1) {
                    Statics.field3168[3].method9387(var3 + 15, 4);
                } else {
                    Statics.field3168[1].method9387(var3 + 15, 4);
                }
                arg0.method7662(class382.field4439, var3 + 32, 17, 16777215, -1);
                int var4 = field950 + 390;
                if (class70.field826[0] == 1 && class70.field836[0] == 0) {
                    Statics.field3168[2].method9387(var4, 4);
                } else {
                    Statics.field3168[0].method9387(var4, 4);
                }
                if (class70.field826[0] == 1 && class70.field836[0] == 1) {
                    Statics.field3168[3].method9387(var4 + 15, 4);
                } else {
                    Statics.field3168[1].method9387(var4 + 15, 4);
                }
                arg0.method7662(class382.field4440, var4 + 32, 17, 16777215, -1);
                int var5 = field950 + 500;
                if (class70.field826[0] == 2 && class70.field836[0] == 0) {
                    Statics.field3168[2].method9387(var5, 4);
                } else {
                    Statics.field3168[0].method9387(var5, 4);
                }
                if (class70.field826[0] == 2 && class70.field836[0] == 1) {
                    Statics.field3168[3].method9387(var5 + 15, 4);
                } else {
                    Statics.field3168[1].method9387(var5 + 15, 4);
                }
                arg0.method7662(class382.field4441, var5 + 32, 17, 16777215, -1);
                int var6 = field950 + 610;
                if (class70.field826[0] == 3 && class70.field836[0] == 0) {
                    Statics.field3168[2].method9387(var6, 4);
                } else {
                    Statics.field3168[0].method9387(var6, 4);
                }
                if (class70.field826[0] == 3 && class70.field836[0] == 1) {
                    Statics.field3168[3].method9387(var6 + 15, 4);
                } else {
                    Statics.field3168[1].method9387(var6 + 15, 4);
                }
                arg0.method7662(class382.field4442, var6 + 32, 17, 16777215, -1);
            }
            class561.method9302(field950 + 708, 4, 50, 16, 0);
            arg1.method7758(class382.field4305, field950 + 708 + 25, 16, 16777215, -1);
            field979 = -1;
            if (Statics.field8 != null) {
                byte var7 = 88;
                byte var8 = 19;
                int var9 = 765 / (var7 + 1) - 1;
                int var10 = 480 / (var8 + 1);
                int var11;
                int var12;
                do {
                    var11 = var10;
                    var12 = var9;
                    if ((var9 - 1) * var10 >= class70.field824) {
                        var9--;
                    }
                    if ((var10 - 1) * var9 >= class70.field824) {
                        var10--;
                    }
                    if ((var10 - 1) * var9 >= class70.field824) {
                        var10--;
                    }
                } while (var10 != var11 || var9 != var12);
                int var13 = (765 - var7 * var9) / (var9 + 1);
                if (var13 > 5) {
                    var13 = 5;
                }
                int var14 = (480 - var8 * var10) / (var10 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (765 - var7 * var9 - (var9 - 1) * var13) / 2;
                int var16 = (480 - var8 * var10 - (var10 - 1) * var14) / 2;
                int var17 = (class70.field824 + var10 - 1) / var10;
                field980 = var17 - var9;
                if (Statics.field1879 != null && field959 > 0) {
                    Statics.field1879.method9387(8, Statics.field1500 / 2 - Statics.field1879.field5504 / 2);
                }
                if (Statics.field1984 != null && field959 < field980) {
                    Statics.field1984.method9387(Statics.field1721 - Statics.field1984.field5503 - 8, Statics.field1500 / 2 - Statics.field1984.field5504 / 2);
                }
                int var18 = var16 + 23;
                int var19 = field950 + var15;
                int var20 = 0;
                boolean var21 = false;
                int var22 = field959;
                for (int var23 = var10 * var22; var23 < class70.field824 && var22 - field959 < var9; var23++) {
                    class70 var24 = Statics.field293[var23];
                    boolean var25 = true;
                    String var26 = Integer.toString(var24.field830);
                    if (var24.field830 == -1) {
                        var26 = class382.field4443;
                        var25 = false;
                    } else if (var24.field830 > 1980) {
                        var26 = class382.field4304;
                        var25 = false;
                    }
                    class114 var27 = null;
                    int var28 = 0;
                    if (var24.method1830()) {
                        var27 = var24.method1824() ? class114.field1450 : class114.field1449;
                    } else if (var24.method1836()) {
                        var27 = var24.method1824() ? class114.field1458 : class114.field1457;
                    } else if (var24.method1829()) {
                        var28 = 16711680;
                        var27 = var24.method1824() ? class114.field1444 : class114.field1447;
                    } else if (var24.method1848()) {
                        var27 = var24.method1824() ? class114.field1456 : class114.field1443;
                    } else if (var24.method1827()) {
                        var27 = var24.method1824() ? class114.field1448 : class114.field1445;
                    } else if (var24.method1832()) {
                        var27 = var24.method1824() ? class114.field1454 : class114.field1453;
                    } else if (var24.method1833()) {
                        var27 = var24.method1824() ? class114.field1462 : class114.field1452;
                    }
                    if (var27 == null || var27.field1459 >= Statics.field8.length) {
                        var27 = var24.method1824() ? class114.field1451 : class114.field1455;
                    }
                    if (class36.field217 >= var19 && class36.field210 >= var18 && class36.field217 < var7 + var19 && class36.field210 < var8 + var18 && var25) {
                        field979 = var23;
                        Statics.field8[var27.field1459].method9481(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field8[var27.field1459].method9513(var19, var18);
                    }
                    if (Statics.field79 != null) {
                        Statics.field79[(var24.method1824() ? 8 : 0) + var24.field833].method9387(var19 + 29, var18);
                    }
                    arg0.method7758(Integer.toString(var24.field828), var19 + 15, var8 / 2 + var18 + 5, var28, -1);
                    arg1.method7758(var26, var19 + 60, var8 / 2 + var18 + 5, 268435455, -1);
                    var18 += var8 + var14;
                    var20++;
                    if (var20 >= var10) {
                        var18 = var16 + 23;
                        var19 += var7 + var13;
                        var20 = 0;
                        var22++;
                    }
                }
                if (var21) {
                    int var29 = arg1.method7656(Statics.field293[field979].field832) + 6;
                    int var30 = arg1.field4804 + 8;
                    int var31 = class36.field210 + 25;
                    if (var30 + var31 > 480) {
                        var31 = class36.field210 - 25 - var30;
                    }
                    class561.method9302(class36.field217 - var29 / 2, var31, var29, var30, 16777120);
                    class561.method9306(class36.field217 - var29 / 2, var31, var29, var30, 0);
                    arg1.method7758(Statics.field293[field979].field832, class36.field217, arg1.field4804 + var31 + 4, 0, -1);
                }
            }
            return;
        }
        Statics.field3601.method9513(field950, 0);
        Statics.field3266.method9513(field950 + 382, 0);
        Statics.field1515.method9387(field950 + 382 - Statics.field1515.field5503 / 2, 18);
        if (client.field528 == 0 || client.field528 == 5) {
            byte var32 = 20;
            arg0.method7758(class382.field4348, field955 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class561.method9306(field955 + 180 - 152, var33, 304, 34, 9179409);
            class561.method9306(field955 + 180 - 151, var33 + 1, 302, 32, 0);
            class561.method9302(field955 + 180 - 150, var33 + 2, field953 * 3, 30, 9179409);
            class561.method9302(field953 * 3 + (field955 + 180 - 150), var33 + 2, 300 - field953 * 3, 30, 0);
            arg0.method7758(field957, field955 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field528 == 20) {
            Statics.field1749.method9387(field955 + 180 - Statics.field1749.field5503 / 2, 271 - Statics.field1749.field5504 / 2);
            short var34 = 201;
            arg0.method7758(field964, field955 + 180, var34, 16776960, 0);
            int var162 = var34 + 15;
            arg0.method7758(field965, field955 + 180, var162, 16776960, 0);
            int var163 = var162 + 15;
            arg0.method7758(field969, field955 + 180, var163, 16776960, 0);
            int var164 = var163 + 15;
            int var165 = var164 + 7;
            if (field962 != 4 && field962 != 10) {
                arg0.method7662(class382.field4375, field955 + 180 - 110, var165, 16777215, 0);
                short var35 = 200;
                String var38;
                if (Statics.field4929.method2604()) {
                    String var36 = field967;
                    String var37 = class419.method3410('*', var36.length());
                    var38 = var37;
                } else {
                    var38 = field967;
                }
                String var40;
                for (var40 = var38; arg0.method7656(var40) > var35; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method7662(class439.method7660(var40), field955 + 180 - 70, var165, 16777215, 0);
                var162 = var165 + 15;
                String var41 = field968;
                String var42 = class419.method3410('*', var41.length());
                String var43;
                for (var43 = var42; arg0.method7656(var43) > var35; var43 = var43.substring(1)) {
                }
                arg0.method7662(class382.field4347 + var43, field955 + 180 - 108, var162, 16777215, 0);
                var162 += 15;
            }
        }
        if (client.field528 == 10 || client.field528 == 11 || client.field528 == 50) {
            Statics.field1749.method9387(field955, 171);
            if (field962 == 0) {
                short var44 = 251;
                arg0.method7758(class382.field4378, field955 + 180, var44, 16776960, 0);
                int var166 = var44 + 30;
                int var45 = field955 + 180 - 80;
                short var46 = 291;
                Statics.field952.method9387(var45 - 73, var46 - 20);
                arg0.method7665(class382.field4437, var45 - 73, var46 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var47 = field955 + 180 + 80;
                Statics.field952.method9387(var47 - 73, var46 - 20);
                arg0.method7665(class382.field4380, var47 - 73, var46 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field962 == 1) {
                arg0.method7758(field963, field955 + 180, 201, 16776960, 0);
                short var48 = 236;
                arg0.method7758(field964, field955 + 180, var48, 16777215, 0);
                int var167 = var48 + 15;
                arg0.method7758(field965, field955 + 180, var167, 16777215, 0);
                int var168 = var167 + 15;
                arg0.method7758(field969, field955 + 180, var168, 16777215, 0);
                int var169 = var168 + 15;
                int var49 = field955 + 180 - 80;
                short var50 = 321;
                Statics.field952.method9387(var49 - 73, var50 - 20);
                arg0.method7758(class382.field4143, var49, var50 + 5, 16777215, 0);
                int var51 = field955 + 180 + 80;
                Statics.field952.method9387(var51 - 73, var50 - 20);
                arg0.method7758(class382.field4305, var51, var50 + 5, 16777215, 0);
            } else if (field962 == 2) {
                short var52 = 201;
                arg0.method7758(field964, Statics.field4019, var52, 16776960, 0);
                int var170 = var52 + 15;
                arg0.method7758(field965, Statics.field4019, var170, 16776960, 0);
                int var171 = var170 + 15;
                arg0.method7758(field969, Statics.field4019, var171, 16776960, 0);
                int var172 = var171 + 15;
                int var173 = var172 + 7;
                arg0.method7662(class382.field4375, Statics.field4019 - 110, var173, 16777215, 0);
                short var53 = 200;
                String var56;
                if (Statics.field4929.method2604()) {
                    String var54 = field967;
                    String var55 = class419.method3410('*', var54.length());
                    var56 = var55;
                } else {
                    var56 = field967;
                }
                String var58;
                for (var58 = var56; arg0.method7656(var58) > var53; var58 = var58.substring(1)) {
                }
                arg0.method7662(class439.method7660(var58) + (field966 == 0 & client.field609 % 40 < 20 ? class107.method74(16776960) + class107.field1392 : ""), Statics.field4019 - 70, var173, 16777215, 0);
                var170 = var173 + 15;
                String var59 = field968;
                String var60 = class419.method3410('*', var59.length());
                String var61;
                for (var61 = var60; arg0.method7656(var61) > var53; var61 = var61.substring(1)) {
                }
                arg0.method7662(class382.field4347 + var61 + (field966 == 1 & client.field609 % 40 < 20 ? class107.method74(16776960) + class107.field1392 : ""), Statics.field4019 - 108, var170, 16777215, 0);
                var170 += 15;
                short var62 = 277;
                int var63 = Statics.field4019 + -117;
                boolean var64 = client.field573;
                boolean var65 = field972;
                class564 var66 = var64 ? (var65 ? Statics.field21 : Statics.field4737) : (var65 ? Statics.field487 : Statics.field1863);
                var66.method9387(var63, var62);
                int var68 = var66.field5503 + 5 + var63;
                arg1.method7662(class382.field4383, var68, var62 + 13, 16776960, 0);
                int var69 = Statics.field4019 + 24;
                boolean var70 = Statics.field4929.method2604();
                boolean var71 = field973;
                class564 var72 = var70 ? (var71 ? Statics.field21 : Statics.field4737) : (var71 ? Statics.field487 : Statics.field1863);
                var72.method9387(var69, var62);
                int var74 = var72.field5503 + 5 + var69;
                arg1.method7662(class382.field4384, var74, var62 + 13, 16776960, 0);
                int var174 = var62 + 15;
                int var75 = Statics.field4019 - 80;
                short var76 = 321;
                Statics.field952.method9387(var75 - 73, var76 - 20);
                arg0.method7758(class382.field4142, var75, var76 + 5, 16777215, 0);
                int var77 = Statics.field4019 + 80;
                Statics.field952.method9387(var77 - 73, var76 - 20);
                arg0.method7758(class382.field4305, var77, var76 + 5, 16777215, 0);
                short var78 = 357;
                switch(field961) {
                    case 2:
                        Statics.field2382 = class382.field4396;
                        break;
                    default:
                        Statics.field2382 = class382.field4205;
                }
                Statics.field350 = new class423(Statics.field4019, var78, arg1.method7656(Statics.field2382), 11);
                Statics.field825 = new class423(Statics.field4019, var78, arg1.method7656(class382.field4395), 11);
                arg1.method7758(Statics.field2382, Statics.field4019, var78, 16777215, 0);
            } else if (field962 == 3) {
                short var79 = 201;
                arg0.method7758(class382.field4373, field955 + 180, var79, 16776960, 0);
                int var175 = var79 + 20;
                arg1.method7758(class382.field4394, field955 + 180, var175, 16776960, 0);
                int var176 = var175 + 20;
                arg1.method7758(class382.field4336, field955 + 180, var176, 16776960, 0);
                int var177 = var176 + 15;
                int var80 = field955 + 180;
                short var81 = 276;
                Statics.field952.method9387(var80 - 73, var81 - 20);
                arg2.method7758(class382.field4388, var80, var81 + 5, 16777215, 0);
                int var82 = field955 + 180;
                short var83 = 326;
                Statics.field952.method9387(var82 - 73, var83 - 20);
                arg2.method7758(class382.field4389, var82, var83 + 5, 16777215, 0);
            } else if (field962 == 4) {
                arg0.method7758(class382.field4365, field955 + 180, 201, 16776960, 0);
                short var84 = 236;
                arg0.method7758(field964, field955 + 180, var84, 16777215, 0);
                int var178 = var84 + 15;
                arg0.method7758(field965, field955 + 180, var178, 16777215, 0);
                int var179 = var178 + 15;
                arg0.method7758(field969, field955 + 180, var179, 16777215, 0);
                int var180 = var179 + 15;
                String var86 = class382.field4377;
                String var87 = Statics.field4655;
                String var88 = class419.method3410('*', var87.length());
                arg0.method7662(var86 + var88 + (client.field609 % 40 < 20 ? class107.method74(16776960) + class107.field1392 : ""), field955 + 180 - 108, var180, 16777215, 0);
                int var181 = var180 - 8;
                arg0.method7662(class382.field4366, field955 + 180 - 9, var181, 16776960, 0);
                int var182 = var181 + 15;
                arg0.method7662(class382.field4147, field955 + 180 - 9, var182, 16776960, 0);
                int var89 = field955 + 180 - 9 + arg0.method7656(class382.field4147) + 15;
                int var90 = var182 - arg0.field4804;
                class564 var91;
                if (field974) {
                    var91 = Statics.field4737;
                } else {
                    var91 = Statics.field1863;
                }
                var91.method9387(var89, var90);
                var178 = var182 + 15;
                int var92 = field955 + 180 - 80;
                short var93 = 321;
                Statics.field952.method9387(var92 - 73, var93 - 20);
                arg0.method7758(class382.field4143, var92, var93 + 5, 16777215, 0);
                int var94 = field955 + 180 + 80;
                Statics.field952.method9387(var94 - 73, var93 - 20);
                arg0.method7758(class382.field4305, var94, var93 + 5, 16777215, 0);
                arg1.method7758(class382.field4205, field955 + 180, var93 + 36, 16777215, 0);
            } else if (field962 == 5) {
                arg0.method7758(class382.field4207, field955 + 180, 201, 16776960, 0);
                short var95 = 221;
                arg2.method7758(field964, field955 + 180, var95, 16776960, 0);
                int var183 = var95 + 15;
                arg2.method7758(field965, field955 + 180, var183, 16776960, 0);
                int var184 = var183 + 15;
                arg2.method7758(field969, field955 + 180, var184, 16776960, 0);
                int var185 = var184 + 15;
                int var186 = var185 + 14;
                arg0.method7662(class382.field4391, field955 + 180 - 145, var186, 16777215, 0);
                short var96 = 174;
                String var99;
                if (Statics.field4929.method2604()) {
                    String var97 = field967;
                    String var98 = class419.method3410('*', var97.length());
                    var99 = var98;
                } else {
                    var99 = field967;
                }
                String var101;
                for (var101 = var99; arg0.method7656(var101) > var96; var101 = var101.substring(1)) {
                }
                arg0.method7662(class439.method7660(var101) + (client.field609 % 40 < 20 ? class107.method74(16776960) + class107.field1392 : ""), field955 + 180 - 34, var186, 16777215, 0);
                var183 = var186 + 15;
                int var102 = field955 + 180 - 80;
                short var103 = 321;
                Statics.field952.method9387(var102 - 73, var103 - 20);
                arg0.method7758(class382.field4392, var102, var103 + 5, 16777215, 0);
                int var104 = field955 + 180 + 80;
                Statics.field952.method9387(var104 - 73, var103 - 20);
                arg0.method7758(class382.field4412, var104, var103 + 5, 16777215, 0);
                short var105 = 356;
                arg1.method7758(class382.field4395, Statics.field4019, var105, 268435455, 0);
            } else if (field962 == 6) {
                short var106 = 201;
                arg0.method7758(field964, field955 + 180, var106, 16776960, 0);
                int var187 = var106 + 15;
                arg0.method7758(field965, field955 + 180, var187, 16776960, 0);
                int var188 = var187 + 15;
                arg0.method7758(field969, field955 + 180, var188, 16776960, 0);
                int var189 = var188 + 15;
                int var107 = field955 + 180;
                short var108 = 321;
                Statics.field952.method9387(var107 - 73, var108 - 20);
                arg0.method7758(class382.field4412, var107, var108 + 5, 16777215, 0);
            } else if (field962 == 7) {
                if (Statics.field110 && !client.field524) {
                    short var109 = 201;
                    arg0.method7758(field964, Statics.field4019, var109, 16776960, 0);
                    int var190 = var109 + 15;
                    arg0.method7758(field965, Statics.field4019, var190, 16776960, 0);
                    int var191 = var190 + 15;
                    arg0.method7758(field969, Statics.field4019, var191, 16776960, 0);
                    int var110 = Statics.field4019 - 150;
                    int var192 = var191 + 10;
                    for (int var111 = 0; var111 < 8; var111++) {
                        Statics.field952.method9389(var110, var192, 30, 40);
                        boolean var112 = field983 == var111 & client.field609 % 40 < 20;
                        arg0.method7662((field971[var111] == null ? "" : field971[var111]) + (var112 ? class107.method74(16776960) + class107.field1392 : ""), var110 + 10, var192 + 27, 16777215, 0);
                        if (var111 == 1 || var111 == 3) {
                            var110 += 50;
                            arg0.method7662(class439.method7660("/"), var110 - 13, var192 + 27, 16777215, 0);
                        } else {
                            var110 += 35;
                        }
                    }
                    int var113 = Statics.field4019 - 80;
                    short var114 = 321;
                    Statics.field952.method9387(var113 - 73, var114 - 20);
                    arg0.method7758("Submit", var113, var114 + 5, 16777215, 0);
                    int var115 = Statics.field4019 + 80;
                    Statics.field952.method9387(var115 - 73, var114 - 20);
                    arg0.method7758(class382.field4305, var115, var114 + 5, 16777215, 0);
                } else {
                    short var116 = 216;
                    arg0.method7758(class382.field4421, field955 + 180, var116, 16776960, 0);
                    int var193 = var116 + 15;
                    arg2.method7758(class382.field4422, field955 + 180, var193, 16776960, 0);
                    int var194 = var193 + 15;
                    arg2.method7758(class382.field4444, field955 + 180, var194, 16776960, 0);
                    int var195 = var194 + 15;
                    int var117 = field955 + 180 - 80;
                    short var118 = 321;
                    Statics.field952.method9387(var117 - 73, var118 - 20);
                    arg0.method7758(class382.field4363, var117, var118 + 5, 16777215, 0);
                    int var119 = field955 + 180 + 80;
                    Statics.field952.method9387(var119 - 73, var118 - 20);
                    arg0.method7758(class382.field4412, var119, var118 + 5, 16777215, 0);
                }
            } else if (field962 == 8) {
                short var120 = 216;
                arg0.method7758(class382.field4278, field955 + 180, var120, 16776960, 0);
                int var196 = var120 + 15;
                arg2.method7758(class382.field4279, field955 + 180, var196, 16776960, 0);
                int var197 = var196 + 15;
                arg2.method7758(class382.field4280, field955 + 180, var197, 16776960, 0);
                int var198 = var197 + 15;
                int var121 = field955 + 180 - 80;
                short var122 = 321;
                Statics.field952.method9387(var121 - 73, var122 - 20);
                arg0.method7758(class382.field4259, var121, var122 + 5, 16777215, 0);
                int var123 = field955 + 180 + 80;
                Statics.field952.method9387(var123 - 73, var122 - 20);
                arg0.method7758(class382.field4412, var123, var122 + 5, 16777215, 0);
            } else if (field962 == 9) {
                short var124 = 221;
                arg0.method7758(field964, field955 + 180, var124, 16776960, 0);
                int var199 = var124 + 25;
                arg0.method7758(field965, field955 + 180, var199, 16776960, 0);
                int var200 = var199 + 25;
                arg0.method7758(field969, field955 + 180, var200, 16776960, 0);
                int var125 = field955 + 180;
                short var126 = 311;
                Statics.field952.method9387(var125 - 73, var126 - 20);
                arg0.method7758(class382.field4388, var125, var126 + 5, 16777215, 0);
            } else if (field962 == 10) {
                int var127 = field955 + 180;
                short var128 = 209;
                arg0.method7758(class382.field4378, field955 + 180, var128, 16776960, 0);
                int var201 = var128 + 20;
                Statics.field981.method9387(var127 - 109, var201);
                if (field954.isEmpty()) {
                    Statics.field949.method9387(var127 - 48, var201 + 18);
                } else {
                    Statics.field949.method9387(var127 - 48, var201 + 5);
                    arg0.method7758(field954, var127, var201 + 68 - 15, 16776960, 0);
                }
            } else if (field962 == 12) {
                int var129 = Statics.field4019;
                short var130 = 216;
                arg2.method7758(class382.field4428, var129, var130, 16777215, 0);
                int var202 = var130 + 17;
                arg2.method7758(class382.field4429, var129, var202, 16777215, 0);
                int var203 = var202 + 17;
                arg2.method7758(class382.field4430, var129, var203, 16777215, 0);
                int var204 = var203 + 17;
                arg2.method7758(class382.field4431, var129, var204, 16777215, 0);
                int var131 = Statics.field4019 - 80;
                short var132 = 311;
                Statics.field952.method9387(var131 - 73, var132 - 20);
                arg0.method7758(class382.field4210, var131, var132 + 5, 16777215, 0);
                int var133 = Statics.field4019 + 80;
                Statics.field952.method9387(var133 - 73, var132 - 20);
                arg0.method7758(class382.field4435, var133, var132 + 5, 16777215, 0);
            } else if (field962 == 13) {
                short var134 = 231;
                arg2.method7758(class382.field4246, field955 + 180, var134, 16777215, 0);
                int var205 = var134 + 20;
                arg2.method7758(class382.field4433, field955 + 180, var205, 16777215, 0);
                int var135 = field955 + 180;
                short var136 = 311;
                Statics.field952.method9387(var135 - 73, var136 - 20);
                arg0.method7758(class382.field4412, var135, var136 + 5, 16777215, 0);
            } else if (field962 == 14) {
                short var137 = 201;
                String var138 = "";
                String var139 = "";
                String var140 = "";
                switch(field960) {
                    case 0:
                        var138 = class382.field4191;
                        var139 = class382.field4192;
                        var140 = class382.field4393;
                        break;
                    case 1:
                        var138 = class382.field4230;
                        var139 = class382.field4231;
                        var140 = class382.field4232;
                        break;
                    case 2:
                        var138 = class382.field4266;
                        var139 = class382.field4267;
                        var140 = class382.field4268;
                        break;
                    default:
                        method5155(false);
                }
                arg0.method7758(var138, field955 + 180, var137, 16776960, 0);
                int var206 = var137 + 20;
                arg0.method7758(var139, field955 + 180, var206, 16776960, 0);
                int var207 = var206 + 20;
                arg0.method7758(var140, field955 + 180, var207, 16776960, 0);
                int var141 = field955 + 180;
                short var142 = 276;
                Statics.field952.method9387(var141 - 73, var142 - 20);
                if (field960 == 1) {
                    arg0.method7758(class382.field4175, var141, var142 + 5, 16777215, 0);
                } else {
                    arg0.method7758(class382.field4434, var141, var142 + 5, 16777215, 0);
                }
                int var143 = field955 + 180;
                short var144 = 326;
                Statics.field952.method9387(var143 - 73, var144 - 20);
                arg0.method7758(class382.field4412, var143, var144 + 5, 16777215, 0);
            } else if (field962 == 24) {
                short var145 = 221;
                arg0.method7758(field964, field955 + 180, var145, 16777215, 0);
                int var208 = var145 + 15;
                arg0.method7758(field965, field955 + 180, var208, 16777215, 0);
                int var209 = var208 + 15;
                arg0.method7758(field969, field955 + 180, var209, 16777215, 0);
                int var210 = var209 + 15;
                int var146 = field955 + 180;
                short var147 = 301;
                Statics.field952.method9387(var146 - 73, var147 - 20);
                arg0.method7758(class382.field4292, var146, var147 + 5, 16777215, 0);
            } else if (field962 == 32) {
                short var148 = 216;
                arg0.method7758(class382.field4421, field955 + 180, var148, 16776960, 0);
                int var211 = var148 + 15;
                arg2.method7758(class382.field4422, field955 + 180, var211, 16776960, 0);
                int var212 = var211 + 15;
                arg2.method7758(class382.field4444, field955 + 180, var212, 16776960, 0);
                int var213 = var212 + 15;
                int var149 = field955 + 180 - 80;
                short var150 = 321;
                Statics.field952.method9387(var149 - 73, var150 - 20);
                arg0.method7758(class382.field4363, var149, var150 + 5, 16777215, 0);
                int var151 = field955 + 180 + 80;
                Statics.field952.method9387(var151 - 73, var150 - 20);
                arg0.method7758(class382.field4412, var151, var150 + 5, 16777215, 0);
            } else if (field962 == 33) {
                short var152 = 201;
                arg0.method7758(field964, field955 + 180, var152, 16776960, 0);
                int var214 = var152 + 20;
                arg1.method7758(field965, field955 + 180, var214, 16776960, 0);
                int var215 = var214 + 20;
                arg1.method7758(field969, field955 + 180, var215, 16776960, 0);
                int var216 = var215 + 15;
                int var153 = field955 + 180;
                short var154 = 276;
                Statics.field952.method9387(var153 - 73, var154 - 20);
                arg2.method7758(class382.field4447, var153, var154 + 5, 16777215, 0);
                int var155 = field955 + 180;
                short var156 = 326;
                Statics.field952.method9387(var155 - 73, var156 - 20);
                arg2.method7758(class382.field4412, var155, var156 + 5, 16777215, 0);
            }
        }
        if (client.field528 >= 10) {
            int[] var157 = new int[4];
            class561.method9296(var157);
            class561.method9294(field950, 0, field950 + 765, Statics.field1500);
            Statics.field2977.method2561(field950 - 22, client.field609);
            Statics.field2977.method2561(field950 + 765 + 22 - 128, client.field609);
            class561.method9293(var157);
        }
        Statics.field1552[Statics.field4929.method2632() ? 1 : 0].method9387(field950 + 765 - 40, 463);
        if (client.field528 <= 5 || Statics.field1329 != class406.field4647) {
            return;
        }
        if (Statics.field1637 == null) {
            Statics.field1637 = class566.method8168(Statics.field479, "sl_button", "");
            return;
        }
        int var158 = field950 + 5;
        short var159 = 463;
        byte var160 = 100;
        byte var161 = 35;
        Statics.field1637.method9387(var158, var159);
        arg0.method7758(class382.field4318 + " " + client.field516, var160 / 2 + var158, var161 / 2 + var159 - 2, 16777215, 0);
        if (Statics.field2118 == null) {
            arg1.method7758(class382.field4446, var160 / 2 + var158, var161 / 2 + var159 + 12, 16777215, 0);
        } else {
            arg1.method7758(class382.field4410, var160 / 2 + var158, var161 / 2 + var159 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("dp.aa(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2249(String arg0, String arg1, String arg2) {
        field964 = arg0;
        field965 = arg1;
        field969 = arg2;
    }

    @ObfuscatedName("qq.ai(Lcr;I)V")
    public static void method7466(class70 arg0) {
        if (arg0.method1824() != client.field640) {
            client.field640 = arg0.method1824();
            class211.method3729(arg0.method1824());
        }
        if (client.field517 != arg0.field829) {
            Statics.method3595(Statics.field479, arg0.field829);
        }
        Statics.field3421 = arg0.field831;
        client.field516 = arg0.field828;
        client.field517 = arg0.field829;
        Statics.field2383 = arg0.field835;
        Statics.field137 = client.field518 == 0 ? 43594 : arg0.field828 + 40000;
        Statics.field3145 = client.field518 == 0 ? 443 : arg0.field828 + 50000;
        Statics.field1544 = Statics.field137;
    }

    @ObfuscatedName("cw.ao(II)V")
    public static void method1207(int arg0) {
        if (field962 != arg0) {
            field962 = arg0;
        }
    }

    @ObfuscatedName("fm.as(ILjava/lang/String;B)V")
    public static void method3267(int arg0, String arg1) {
        field957 = arg1;
        field953 = arg0;
    }
}
