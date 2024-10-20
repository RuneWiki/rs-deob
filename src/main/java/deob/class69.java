package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@ObfuscatedName("bc")
public class class69 {

    @ObfuscatedName("bc.w")
    public static int field906 = 0;

    @ObfuscatedName("bc.x")
    public static int field878 = field906 + 202;

    @ObfuscatedName("bc.t")
    public static int field904 = 10;

    @ObfuscatedName("bc.j")
    public static String field881 = "";

    @ObfuscatedName("bc.an")
    public static int field883 = -1;

    @ObfuscatedName("bc.am")
    public static int field876 = 1;

    @ObfuscatedName("bc.ac")
    public static int field885 = 0;

    @ObfuscatedName("bc.bq")
    public static String field874 = "";

    @ObfuscatedName("bc.bn")
    public static String field886 = "";

    @ObfuscatedName("bc.bl")
    public static String field888 = "";

    @ObfuscatedName("bc.bv")
    public static String field889 = "";

    @ObfuscatedName("bc.bu")
    public static String field887 = "";

    @ObfuscatedName("bc.bb")
    public static String field905 = "";

    @ObfuscatedName("bc.bw")
    public static int field892 = 0;

    @ObfuscatedName("bc.bd")
    public static String[] field893 = new String[8];

    @ObfuscatedName("bc.bz")
    public static boolean field869 = false;

    @ObfuscatedName("bc.bo")
    public static boolean field895 = false;

    @ObfuscatedName("bc.be")
    public static boolean field896 = true;

    @ObfuscatedName("bc.bk")
    public static int field897 = 0;

    @ObfuscatedName("bc.bf")
    public static String field898 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("bc.ce")
    public static String field899 = "1234567890";

    @ObfuscatedName("bc.co")
    public static boolean field900 = false;

    @ObfuscatedName("bc.cm")
    public static int field901 = -1;

    @ObfuscatedName("bc.cn")
    public static int field868 = 0;

    @ObfuscatedName("bc.cj")
    public static int field903 = 0;

    @ObfuscatedName("bc.cp")
    public static long field890;

    @ObfuscatedName("bc.cr")
    public static long field911;

    @ObfuscatedName("bc.cs")
    public static String[] field902;

    @ObfuscatedName("bc.cy")
    public static String[] field907;

    static {
        new DecimalFormat("##0.00");
        new class121();
        field890 = -1L;
        field911 = -1L;
        field902 = new String[] { "title.jpg" };
        field907 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
    }

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("np.s(Lls;Lls;ZII)V")
    public static void method5994(class316 arg0, class316 arg1, boolean arg2, int arg3) {
        if (!Statics.field877) {
            if (arg3 == 0) {
                method567(arg2);
            } else {
                method2545(arg3);
            }
            class453.method7241();
            byte[] var4 = arg0.method5198("title.jpg", "");
            Statics.field49 = class29.method2872(var4);
            Statics.field894 = Statics.field49.method7340();
            int var5 = client.field477;
            if ((var5 & 0x20000000) != 0) {
                Statics.field3257 = class458.method2786(arg1, "logo_deadman_mode", "");
            } else if ((var5 & 0x40000000) == 0) {
                Statics.field3257 = class458.method2786(arg1, "logo", "");
            } else {
                Statics.field3257 = class458.method2786(arg1, "logo_seasonal_mode", "");
            }
            Statics.field103 = class458.method2786(arg1, "titlebox", "");
            Statics.field872 = class458.method2786(arg1, "titlebutton", "");
            Statics.field4092 = class458.method2786(arg1, "titlebutton_large", "");
            Statics.field873 = class458.method2786(arg1, "play_now_text", "");
            class458.method2786(arg1, "titlebutton_wide42,1", "");
            Statics.field871 = class458.method6208(arg1, "runes", "");
            Statics.field1761 = class458.method6208(arg1, "title_mute", "");
            Statics.field169 = class458.method2786(arg1, "options_radio_buttons,0", "");
            Statics.field875 = class458.method2786(arg1, "options_radio_buttons,4", "");
            Statics.field1953 = class458.method2786(arg1, "options_radio_buttons,2", "");
            Statics.field128 = class458.method2786(arg1, "options_radio_buttons,6", "");
            Statics.field1246 = Statics.field169.field4790;
            Statics.field1636 = Statics.field169.field4787;
            Statics.field2910 = new class89(Statics.field871);
            if (arg2) {
                field887 = "";
                field905 = "";
                field893 = new String[8];
                field892 = 0;
            }
            Statics.field101 = 0;
            Statics.field147 = "";
            field896 = true;
            field900 = false;
            if (Statics.field4303.method2095()) {
                class274.field3199 = 1;
                Statics.field3995 = null;
                Statics.field1348 = -1;
                Statics.field2613 = -1;
                Statics.field167 = 0;
                Statics.field3203 = false;
                Statics.field1748 = 2;
            } else {
                class314 var6 = Statics.field4701;
                int var7 = var6.method5269("scape main");
                int var8 = var6.method5196(var7, "");
                class274.field3199 = 1;
                Statics.field3995 = var6;
                Statics.field1348 = var7;
                Statics.field2613 = var8;
                Statics.field167 = 255;
                Statics.field3203 = false;
                Statics.field1748 = 2;
            }
            if (Statics.field4034 != null) {
                try {
                    class444 var9 = new class444(4);
                    var9.method6912(3);
                    var9.method6914(0);
                    Statics.field4034.method6112(var9.field4707, 0, 4);
                } catch (IOException var13) {
                    try {
                        Statics.field4034.method6121();
                    } catch (Exception var12) {
                    }
                    class317.field4036++;
                    Statics.field4034 = null;
                }
            }
            Statics.field877 = true;
            field906 = (Statics.field32 - 765) / 2;
            field878 = field906 + 202;
            Statics.field879 = field878 + 180;
            Statics.field49.method7406(field906, 0);
            Statics.field894.method7406(field906 + 382, 0);
            Statics.field3257.method7323(field906 + 382 - Statics.field3257.field4790 / 2, 18);
        } else if (arg3 == 4) {
            method2545(4);
        }
    }

    @ObfuscatedName("fv.w(I)Ljava/lang/String;")
    public static String method3018() {
        return Statics.field4303.method2093() ? class344.method3076(field887) : field887;
    }

    @ObfuscatedName("ae.v(B)V")
    public static void method575() {
        if (client.field524 && field887 != null && field887.length() > 0) {
            field897 = 1;
        } else {
            field897 = 0;
        }
    }

    @ObfuscatedName("fe.c(Lab;Lmg;I)V")
    public static void method3045(class32 arg0, class350 arg1) {
        if (field900) {
            while (true) {
                if (!class24.method3180()) {
                    if (class33.field227 != 1 && (Statics.field4383 || class33.field227 != 4)) {
                        break;
                    }
                    int var2 = field906 + 280;
                    if (class33.field219 >= var2 && class33.field219 <= var2 + 14 && class33.field230 >= 4 && class33.field230 <= 18) {
                        class61.method4944(0, 0);
                        break;
                    }
                    if (class33.field219 >= var2 + 15 && class33.field219 <= var2 + 80 && class33.field230 >= 4 && class33.field230 <= 18) {
                        class61.method4944(0, 1);
                        break;
                    }
                    int var3 = field906 + 390;
                    if (class33.field219 >= var3 && class33.field219 <= var3 + 14 && class33.field230 >= 4 && class33.field230 <= 18) {
                        class61.method4944(1, 0);
                        break;
                    }
                    if (class33.field219 >= var3 + 15 && class33.field219 <= var3 + 80 && class33.field230 >= 4 && class33.field230 <= 18) {
                        class61.method4944(1, 1);
                        break;
                    }
                    int var4 = field906 + 500;
                    if (class33.field219 >= var4 && class33.field219 <= var4 + 14 && class33.field230 >= 4 && class33.field230 <= 18) {
                        class61.method4944(2, 0);
                        break;
                    }
                    if (class33.field219 >= var4 + 15 && class33.field219 <= var4 + 80 && class33.field230 >= 4 && class33.field230 <= 18) {
                        class61.method4944(2, 1);
                        break;
                    }
                    int var5 = field906 + 610;
                    if (class33.field219 >= var5 && class33.field219 <= var5 + 14 && class33.field230 >= 4 && class33.field230 <= 18) {
                        class61.method4944(3, 0);
                        break;
                    }
                    if (class33.field219 >= var5 + 15 && class33.field219 <= var5 + 80 && class33.field230 >= 4 && class33.field230 <= 18) {
                        class61.method4944(3, 1);
                        break;
                    }
                    if (class33.field219 >= field906 + 708 && class33.field230 >= 4 && class33.field219 <= field906 + 708 + 50 && class33.field230 <= 20) {
                        method2749();
                        break;
                    }
                    if (field901 == -1) {
                        if (field868 > 0 && Statics.field91 != null && class33.field219 >= 0 && class33.field219 <= Statics.field91.field4790 && class33.field230 >= Statics.field2650 / 2 - 50 && class33.field230 <= Statics.field2650 / 2 + 50) {
                            field868--;
                        }
                        if (field868 < field903 && Statics.field77 != null && class33.field219 >= Statics.field32 - Statics.field77.field4790 - 5 && class33.field219 <= Statics.field32 && class33.field230 >= Statics.field2650 / 2 - 50 && class33.field230 <= Statics.field2650 / 2 + 50) {
                            field868++;
                        }
                    } else {
                        class61 var6 = Statics.field775[field901];
                        method4481(var6);
                        method2749();
                    }
                    break;
                }
                if (Statics.field1654 == 13) {
                    method2749();
                    break;
                }
                if (Statics.field1654 == 96) {
                    if (field868 > 0 && Statics.field91 != null) {
                        field868--;
                    }
                } else if (Statics.field1654 == 97 && field868 < field903 && Statics.field77 != null) {
                    field868++;
                }
            }
            return;
        }
        if ((class33.field227 == 1 || !Statics.field4383 && class33.field227 == 4) && class33.field219 >= field906 + 765 - 50 && class33.field230 >= 453) {
            Statics.field4303.method2094(!Statics.field4303.method2095());
            if (Statics.field4303.method2095()) {
                class274.method2997();
            } else {
                class274.method3883(Statics.field4701, "scape main", "", 255, false);
            }
        }
        if (client.field505 == 5) {
            return;
        }
        if (field890 == -1L) {
            field890 = class270.method3146() + 1000L;
        }
        long var7 = class270.method3146();
        boolean var9;
        if (client.field767 == null || client.field768 >= client.field767.size()) {
            var9 = true;
        } else {
            while (true) {
                if (client.field768 >= client.field767.size()) {
                    var9 = true;
                    break;
                }
                class77 var10 = (class77) client.field767.get(client.field768);
                if (!var10.method1933()) {
                    var9 = false;
                    break;
                }
                client.field768++;
            }
        }
        if (var9 && field911 == -1L) {
            field911 = var7;
            if (field911 > field890) {
                field890 = field911;
            }
        }
        if (client.field505 != 10 && client.field505 != 11) {
            return;
        }
        if (Statics.field1773 == class331.field4099) {
            if (class33.field227 == 1 || !Statics.field4383 && class33.field227 == 4) {
                int var11 = field906 + 5;
                short var12 = 463;
                byte var13 = 100;
                byte var14 = 35;
                if (class33.field219 >= var11 && class33.field219 <= var11 + var13 && class33.field230 >= var12 && class33.field230 <= var12 + var14) {
                    if (class61.method19()) {
                        field900 = true;
                        field868 = 0;
                        field903 = 0;
                    }
                    return;
                }
            }
            if (Statics.field2909 != null && class61.method19()) {
                field900 = true;
                field868 = 0;
                field903 = 0;
            }
        }
        int var15 = class33.field227;
        int var16 = class33.field219;
        int var17 = class33.field230;
        if (var15 == 0) {
            var16 = class33.field220;
            var17 = class33.field228;
        }
        if (!Statics.field4383 && var15 == 4) {
            var15 = 1;
        }
        if (field885 == 0) {
            boolean var18 = false;
            while (class24.method3180()) {
                if (Statics.field1654 == 84) {
                    var18 = true;
                }
            }
            int var19 = Statics.field879 - 80;
            short var20 = 291;
            if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                class30.method6381(Statics.method5412("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var21 = Statics.field879 + 80;
            if (var15 == 1 && var16 >= var21 - 75 && var16 <= var21 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20 || var18) {
                if ((client.field477 & 0x2000000) != 0) {
                    field874 = "";
                    field886 = class309.field3775;
                    field888 = class309.field3911;
                    field889 = class309.field3855;
                    method2545(1);
                    method575();
                } else if ((client.field477 & 0x4) != 0) {
                    if ((client.field477 & 0x400) == 0) {
                        field886 = class309.field3844;
                        field888 = class309.field3845;
                        field889 = class309.field3783;
                    } else {
                        field886 = class309.field3897;
                        field888 = class309.field3887;
                        field889 = class309.field3861;
                    }
                    field874 = class309.field3843;
                    method2545(1);
                    method575();
                } else if ((client.field477 & 0x400) == 0) {
                    method45(false);
                } else {
                    field886 = class309.field3820;
                    field888 = class309.field3848;
                    field889 = class309.field3849;
                    field874 = class309.field3843;
                    method2545(1);
                    method575();
                }
            }
        } else if (field885 == 1) {
            while (true) {
                if (!class24.method3180()) {
                    int var22 = Statics.field879 - 80;
                    short var23 = 321;
                    if (var15 == 1 && var16 >= var22 - 75 && var16 <= var22 + 75 && var17 >= var23 - 20 && var17 <= var23 + 20) {
                        method45(false);
                    }
                    int var24 = Statics.field879 + 80;
                    if (var15 == 1 && var16 >= var24 - 75 && var16 <= var24 + 75 && var17 >= var23 - 20 && var17 <= var23 + 20) {
                        method2545(0);
                    }
                    break;
                }
                if (Statics.field1654 == 84) {
                    method45(false);
                } else if (Statics.field1654 == 13) {
                    method2545(0);
                }
            }
        } else if (field885 == 2) {
            short var25 = 201;
            int var132 = var25 + 52;
            if (var15 == 1 && var17 >= var132 - 12 && var17 < var132 + 2) {
                field897 = 0;
            }
            var132 += 15;
            if (var15 == 1 && var17 >= var132 - 12 && var17 < var132 + 2) {
                field897 = 1;
            }
            var132 += 15;
            short var26 = 361;
            if (Statics.field61 != null) {
                int var27 = Statics.field61.field4382 / 2;
                if (var15 == 1 && var16 >= Statics.field61.field4378 - var27 && var16 <= Statics.field61.field4378 + var27 && var17 >= var26 - 15 && var17 < var26) {
                    switch(field876) {
                        case 1:
                            method3352(class309.field3872, class309.field3893, class309.field3894);
                            method2545(5);
                            return;
                        case 2:
                            class30.method6381("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var28 = Statics.field879 - 80;
            short var29 = 321;
            if (var15 == 1 && var16 >= var28 - 75 && var16 <= var28 + 75 && var17 >= var29 - 20 && var17 <= var29 + 20) {
                field887 = field887.trim();
                if (field887.length() == 0) {
                    method3352(class309.field3736, class309.field3737, class309.field3738);
                    return;
                }
                if (field905.length() == 0) {
                    method3352(class309.field3739, class309.field3740, class309.field3741);
                    return;
                }
                method3352(class309.field3705, class309.field3744, class309.field3860);
                client.method3051(false);
                client.method20(20);
                return;
            }
            int var30 = field878 + 180 + 80;
            if (var15 == 1 && var16 >= var30 - 75 && var16 <= var30 + 75 && var17 >= var29 - 20 && var17 <= var29 + 20) {
                method2545(0);
                field887 = "";
                field905 = "";
                Statics.field101 = 0;
                Statics.field147 = "";
                field896 = true;
            }
            int var31 = Statics.field879 + -117;
            short var32 = 277;
            field869 = var16 >= var31 && var16 < Statics.field1246 + var31 && var17 >= var32 && var17 < Statics.field1636 + var32;
            if (var15 == 1 && field869) {
                client.field524 = !client.field524;
                if (!client.field524 && Statics.field4303.method2109() != null) {
                    Statics.field4303.method2150((String) null);
                }
            }
            int var33 = Statics.field879 + 24;
            short var34 = 277;
            field895 = var16 >= var33 && var16 < Statics.field1246 + var33 && var17 >= var34 && var17 < Statics.field1636 + var34;
            if (var15 == 1 && field895) {
                Statics.field4303.method2092(!Statics.field4303.method2093());
                if (!Statics.field4303.method2093()) {
                    field887 = "";
                    Statics.field4303.method2150((String) null);
                    method575();
                }
            }
            while (true) {
                Transferable var38;
                int var39;
                do {
                    while (true) {
                        label1145: do {
                            while (true) {
                                while (class24.method3180()) {
                                    if (Statics.field1654 == 13) {
                                        method2545(0);
                                        field887 = "";
                                        field905 = "";
                                        Statics.field101 = 0;
                                        Statics.field147 = "";
                                        field896 = true;
                                    } else {
                                        if (field897 != 0) {
                                            continue label1145;
                                        }
                                        char var35 = Statics.field2637;
                                        for (int var36 = 0; var36 < field898.length() && var35 != field898.charAt(var36); var36++) {
                                        }
                                        if (Statics.field1654 == 85 && field887.length() > 0) {
                                            field887 = field887.substring(0, field887.length() - 1);
                                        }
                                        if (Statics.field1654 == 84 || Statics.field1654 == 80) {
                                            field897 = 1;
                                        }
                                        if (method4445(Statics.field2637) && field887.length() < 320) {
                                            field887 = field887 + Statics.field2637;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field897 != 1);
                        if (Statics.field1654 == 85 && field905.length() > 0) {
                            field905 = field905.substring(0, field905.length() - 1);
                        } else if (Statics.field1654 == 84 || Statics.field1654 == 80) {
                            field897 = 0;
                            if (Statics.field1654 == 84) {
                                field887 = field887.trim();
                                if (field887.length() == 0) {
                                    method3352(class309.field3736, class309.field3737, class309.field3738);
                                    return;
                                }
                                if (field905.length() == 0) {
                                    method3352(class309.field3739, class309.field3740, class309.field3741);
                                    return;
                                }
                                method3352(class309.field3705, class309.field3744, class309.field3860);
                                client.method3051(false);
                                client.method20(20);
                                return;
                            }
                        }
                        if ((class24.field135[82] || class24.field135[87]) && Statics.field1654 == 67) {
                            Clipboard var37 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var38 = var37.getContents(Statics.field3295);
                            var39 = 20 - field905.length();
                            break;
                        }
                        char var50 = Statics.field2637;
                        boolean var51;
                        if (var50 >= ' ' && var50 < 127 || var50 > 127 && var50 < 160 || var50 > 160 && var50 <= 255) {
                            var51 = true;
                        } else {
                            label1383: {
                                if (var50 != 0) {
                                    char[] var52 = class342.field4143;
                                    for (int var53 = 0; var53 < var52.length; var53++) {
                                        char var54 = var52[var53];
                                        if (var50 == var54) {
                                            var51 = true;
                                            break label1383;
                                        }
                                    }
                                }
                                var51 = false;
                            }
                        }
                        if (var51 && method4445(Statics.field2637) && field905.length() < 20) {
                            field905 = field905 + Statics.field2637;
                        }
                    }
                } while (var39 <= 0);
                try {
                    String var40 = (String) var38.getTransferData(DataFlavor.stringFlavor);
                    int var41 = Math.min(var39, var40.length());
                    for (int var42 = 0; var42 < var41; var42++) {
                        char var43 = var40.charAt(var42);
                        boolean var44;
                        if (var43 >= ' ' && var43 < 127 || var43 > 127 && var43 < 160 || var43 > 160 && var43 <= 255) {
                            var44 = true;
                        } else {
                            label1384: {
                                if (var43 != 0) {
                                    char[] var45 = class342.field4143;
                                    for (int var46 = 0; var46 < var45.length; var46++) {
                                        char var47 = var45[var46];
                                        if (var43 == var47) {
                                            var44 = true;
                                            break label1384;
                                        }
                                    }
                                }
                                var44 = false;
                            }
                        }
                        if (!var44 || !method4445(var40.charAt(var42))) {
                            method2545(3);
                            return;
                        }
                    }
                    field905 = field905 + var40.substring(0, var41);
                } catch (UnsupportedFlavorException var130) {
                } catch (IOException var131) {
                }
            }
        } else if (field885 == 3) {
            int var55 = field878 + 180;
            short var56 = 276;
            if (var15 == 1 && var16 >= var55 - 75 && var16 <= var55 + 75 && var17 >= var56 - 20 && var17 <= var56 + 20) {
                method567(false);
            }
            int var57 = field878 + 180;
            short var58 = 326;
            if (var15 == 1 && var16 >= var57 - 75 && var16 <= var57 + 75 && var17 >= var58 - 20 && var17 <= var58 + 20) {
                method3352(class309.field3872, class309.field3893, class309.field3894);
                method2545(5);
                return;
            }
        } else if (field885 == 4) {
            int var59 = field878 + 180 - 80;
            short var60 = 321;
            if (var15 == 1 && var16 >= var59 - 75 && var16 <= var59 + 75 && var17 >= var60 - 20 && var17 <= var60 + 20) {
                Statics.field147.trim();
                if (Statics.field147.length() != 6) {
                    method3352(class309.field3617, class309.field3656, class309.field3657);
                    return;
                }
                Statics.field101 = Integer.parseInt(Statics.field147);
                Statics.field147 = "";
                client.method3051(true);
                method3352(class309.field3705, class309.field3744, class309.field3860);
                client.method20(20);
                return;
            }
            if (var15 == 1 && var16 >= field878 + 180 - 9 && var16 <= field878 + 180 + 130 && var17 >= 263 && var17 <= 296) {
                field896 = !field896;
            }
            if (var15 == 1 && var16 >= field878 + 180 - 34 && var16 <= field878 + 180 + 34 && var17 >= 351 && var17 <= 363) {
                class30.method6381(Statics.method5412("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var61 = field878 + 180 + 80;
            if (var15 == 1 && var16 >= var61 - 75 && var16 <= var61 + 75 && var17 >= var60 - 20 && var17 <= var60 + 20) {
                method2545(0);
                field887 = "";
                field905 = "";
                Statics.field101 = 0;
                Statics.field147 = "";
            }
            while (class24.method3180()) {
                boolean var62 = false;
                for (int var63 = 0; var63 < field899.length(); var63++) {
                    if (Statics.field2637 == field899.charAt(var63)) {
                        var62 = true;
                        break;
                    }
                }
                if (Statics.field1654 == 13) {
                    method2545(0);
                    field887 = "";
                    field905 = "";
                    Statics.field101 = 0;
                    Statics.field147 = "";
                } else {
                    if (Statics.field1654 == 85 && Statics.field147.length() > 0) {
                        Statics.field147 = Statics.field147.substring(0, Statics.field147.length() - 1);
                    }
                    if (Statics.field1654 == 84) {
                        Statics.field147.trim();
                        if (Statics.field147.length() != 6) {
                            method3352(class309.field3617, class309.field3656, class309.field3657);
                            return;
                        }
                        Statics.field101 = Integer.parseInt(Statics.field147);
                        Statics.field147 = "";
                        client.method3051(true);
                        method3352(class309.field3705, class309.field3744, class309.field3860);
                        client.method20(20);
                        return;
                    }
                    if (var62 && Statics.field147.length() < 6) {
                        Statics.field147 = Statics.field147 + Statics.field2637;
                    }
                }
            }
        } else if (field885 == 5) {
            int var64 = field878 + 180 - 80;
            short var65 = 321;
            if (var15 == 1 && var16 >= var64 - 75 && var16 <= var64 + 75 && var17 >= var65 - 20 && var17 <= var65 + 20) {
                method2423();
                return;
            }
            int var66 = field878 + 180 + 80;
            if (var15 == 1 && var16 >= var66 - 75 && var16 <= var66 + 75 && var17 >= var65 - 20 && var17 <= var65 + 20) {
                method45(true);
            }
            short var67 = 361;
            if (Statics.field1347 != null) {
                int var68 = Statics.field1347.field4382 / 2;
                if (var15 == 1 && var16 >= Statics.field1347.field4378 - var68 && var16 <= Statics.field1347.field4378 + var68 && var17 >= var67 - 15 && var17 < var67) {
                    class30.method6381(Statics.method5412("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class24.method3180()) {
                boolean var69 = false;
                for (int var70 = 0; var70 < field898.length(); var70++) {
                    if (Statics.field2637 == field898.charAt(var70)) {
                        var69 = true;
                        break;
                    }
                }
                if (Statics.field1654 == 13) {
                    method45(true);
                } else {
                    if (Statics.field1654 == 85 && field887.length() > 0) {
                        field887 = field887.substring(0, field887.length() - 1);
                    }
                    if (Statics.field1654 == 84) {
                        method2423();
                        return;
                    }
                    if (var69 && field887.length() < 320) {
                        field887 = field887 + Statics.field2637;
                    }
                }
            }
        } else if (field885 == 6) {
            while (true) {
                do {
                    if (!class24.method3180()) {
                        short var71 = 321;
                        if (var15 == 1 && var17 >= var71 - 20 && var17 <= var71 + 20) {
                            method45(true);
                        }
                        return;
                    }
                } while (Statics.field1654 != 84 && Statics.field1654 != 13);
                method45(true);
            }
        } else if (field885 == 7) {
            if (Statics.field1067 && !client.field552) {
                int var72 = Statics.field879 - 150;
                int var73 = var72 + 240 + 25 + 40;
                short var74 = 231;
                int var75 = var74 + 40;
                if (var15 == 1 && var16 >= var72 && var16 <= var73 && var17 >= var74 && var17 <= var75) {
                    field892 = method4439(var72, var16);
                }
                int var76 = field878 + 180 - 80;
                short var77 = 321;
                if (var15 == 1 && var16 >= var76 - 75 && var16 <= var76 + 75 && var17 >= var77 - 20 && var17 <= var77 + 20) {
                    boolean var80;
                    label1040: {
                        Date var78;
                        try {
                            var78 = method5976();
                        } catch (ParseException var129) {
                            method2545(7);
                            method3352("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                            var80 = false;
                            break label1040;
                        }
                        if (var78 == null) {
                            var80 = false;
                        } else {
                            Calendar var81 = Calendar.getInstance();
                            var81.set(1, var81.get(1) - 13);
                            var81.set(5, var81.get(5) + 1);
                            var81.set(11, 0);
                            var81.set(12, 0);
                            var81.set(13, 0);
                            var81.set(14, 0);
                            Date var82 = var81.getTime();
                            boolean var83 = var78.before(var82);
                            boolean var85 = method2660(var78);
                            if (var85) {
                                if (var83) {
                                    Statics.field4380 = (int) (var78.getTime() / 86400000L - 11745L);
                                } else {
                                    Statics.field4380 = 8388607;
                                }
                                var80 = true;
                            } else {
                                method2545(7);
                                method3352("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var80 = false;
                            }
                        }
                    }
                    if (var80) {
                        client.method20(50);
                        return;
                    }
                }
                int var87 = field878 + 180 + 80;
                if (var15 == 1 && var16 >= var87 - 75 && var16 <= var87 + 75 && var17 >= var77 - 20 && var17 <= var77 + 20) {
                    field893 = new String[8];
                    method45(true);
                }
                while (class24.method3180()) {
                    if (Statics.field1654 == 101) {
                        field893[field892] = null;
                    }
                    if (Statics.field1654 == 85) {
                        if (field893[field892] == null && field892 > 0) {
                            field892--;
                        }
                        field893[field892] = null;
                    }
                    if (Statics.field2637 >= '0' && Statics.field2637 <= '9') {
                        field893[field892] = "" + Statics.field2637;
                        if (field892 < 7) {
                            field892++;
                        }
                    }
                    if (Statics.field1654 == 84) {
                        boolean var90;
                        label976: {
                            Date var88;
                            try {
                                var88 = method5976();
                            } catch (ParseException var128) {
                                method2545(7);
                                method3352("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                var90 = false;
                                break label976;
                            }
                            if (var88 == null) {
                                var90 = false;
                            } else {
                                Calendar var91 = Calendar.getInstance();
                                var91.set(1, var91.get(1) - 13);
                                var91.set(5, var91.get(5) + 1);
                                var91.set(11, 0);
                                var91.set(12, 0);
                                var91.set(13, 0);
                                var91.set(14, 0);
                                Date var92 = var91.getTime();
                                boolean var93 = var88.before(var92);
                                boolean var95 = method2660(var88);
                                if (var95) {
                                    if (var93) {
                                        Statics.field4380 = (int) (var88.getTime() / 86400000L - 11745L);
                                    } else {
                                        Statics.field4380 = 8388607;
                                    }
                                    var90 = true;
                                } else {
                                    method2545(7);
                                    method3352("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var90 = false;
                                }
                            }
                        }
                        if (var90) {
                            client.method20(50);
                        }
                        return;
                    }
                }
            } else {
                int var97 = field878 + 180 - 80;
                short var98 = 321;
                if (var15 == 1 && var16 >= var97 - 75 && var16 <= var97 + 75 && var17 >= var98 - 20 && var17 <= var98 + 20) {
                    class30.method6381(Statics.method5412("secure", true) + "m=dob/set_dob.ws", true, false);
                    method3352(class309.field3889, class309.field3864, class309.field3891);
                    method2545(6);
                    return;
                }
                int var99 = field878 + 180 + 80;
                if (var15 == 1 && var16 >= var99 - 75 && var16 <= var99 + 75 && var17 >= var98 - 20 && var17 <= var98 + 20) {
                    method45(true);
                }
            }
        } else if (field885 == 8) {
            int var100 = field878 + 180 - 80;
            short var101 = 321;
            if (var15 == 1 && var16 >= var100 - 75 && var16 <= var100 + 75 && var17 >= var101 - 20 && var17 <= var101 + 20) {
                class30.method6381("https://www.jagex.com/terms/privacy", true, false);
                method3352(class309.field3889, class309.field3864, class309.field3891);
                method2545(6);
                return;
            }
            int var102 = field878 + 180 + 80;
            if (var15 == 1 && var16 >= var102 - 75 && var16 <= var102 + 75 && var17 >= var101 - 20 && var17 <= var101 + 20) {
                method45(true);
            }
        } else if (field885 == 9) {
            int var103 = field878 + 180;
            short var104 = 311;
            if (Statics.field1654 == 84 || Statics.field1654 == 13 || var15 == 1 && var16 >= var103 - 75 && var16 <= var103 + 75 && var17 >= var104 - 20 && var17 <= var104 + 20) {
                method567(false);
            }
        } else if (field885 == 10) {
            int var105 = field878 + 180;
            short var106 = 209;
            if (Statics.field1654 == 84 || var15 == 1 && var16 >= var105 - 109 && var16 <= var105 + 109 && var17 >= var106 && var17 <= var106 + 68) {
                method3352(class309.field3705, class309.field3744, class309.field3860);
                client.field513 = class448.field4758;
                client.method3051(false);
                client.method20(20);
            }
        } else if (field885 == 12) {
            int var107 = Statics.field879;
            short var108 = 233;
            class385 var109 = arg1.method5756(0, 30, class309.field3921, var107, var108);
            class385 var110 = arg1.method5756(32, 32, class309.field3921, var107, var108);
            class385 var111 = arg1.method5756(70, 34, class309.field3921, var107, var108);
            int var133 = var108 + 17;
            class385 var112 = arg1.method5756(0, 34, class309.field3922, var107, var133);
            if (var15 == 1) {
                if (var109.method6193(var16, var17)) {
                    class30.method6381("https://www.jagex.com/terms", true, false);
                } else if (var110.method6193(var16, var17)) {
                    class30.method6381("https://www.jagex.com/terms/privacy", true, false);
                } else if (var111.method6193(var16, var17) || var112.method6193(var16, var17)) {
                    class30.method6381("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var113 = Statics.field879 - 80;
            short var114 = 311;
            if (var15 == 1 && var16 >= var113 - 75 && var16 <= var113 + 75 && var17 >= var114 - 20 && var17 <= var114 + 20) {
                client.method11();
                method567(true);
            }
            int var115 = Statics.field879 + 80;
            if (var15 == 1 && var16 >= var115 - 75 && var16 <= var115 + 75 && var17 >= var114 - 20 && var17 <= var114 + 20) {
                field885 = 13;
            }
        } else if (field885 == 13) {
            int var116 = Statics.field879;
            short var117 = 321;
            if (var15 == 1 && var16 >= var116 - 75 && var16 <= var116 + 75 && var17 >= var117 - 20 && var17 <= var117 + 20) {
                method567(true);
            }
        } else if (field885 == 14) {
            String var118 = "";
            switch(field883) {
                case 0:
                    var118 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var118 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                case 2:
                    var118 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method45(false);
            }
            int var119 = field878 + 180;
            short var120 = 276;
            if (var15 == 1 && var16 >= var119 - 75 && var16 <= var119 + 75 && var17 >= var120 - 20 && var17 <= var120 + 20) {
                class30.method6381(var118, true, false);
                method3352(class309.field3889, class309.field3864, class309.field3891);
                method2545(6);
                return;
            }
            int var121 = field878 + 180;
            short var122 = 326;
            if (var15 == 1 && var16 >= var121 - 75 && var16 <= var121 + 75 && var17 >= var122 - 20 && var17 <= var122 + 20) {
                method45(false);
            }
        } else if (field885 == 24) {
            int var123 = field878 + 180;
            short var124 = 301;
            if (var15 == 1 && var16 >= var123 - 75 && var16 <= var123 + 75 && var17 >= var124 - 20 && var17 <= var124 + 20) {
                method567(false);
            }
        } else if (field885 == 26) {
            int var125 = field878 + 180 - 80;
            short var126 = 321;
            if (var15 == 1 && var16 >= var125 - 75 && var16 <= var125 + 75 && var17 >= var126 - 20 && var17 <= var126 + 20) {
                class30.method6381(Statics.method5412("secure", true) + "m=dob/set_dob.ws", true, false);
                method3352(class309.field3889, class309.field3864, class309.field3891);
                method2545(6);
                return;
            }
            int var127 = field878 + 180 + 80;
            if (var15 == 1 && var16 >= var127 - 75 && var16 <= var127 + 75 && var17 >= var126 - 20 && var17 <= var126 + 20) {
                method45(true);
            }
        }
    }

    @ObfuscatedName("ej.q(Ljava/util/Date;I)Z")
    public static boolean method2660(Date arg0) {
        Date var1 = method2428();
        return arg0.after(var1);
    }

    @ObfuscatedName("di.i(B)Ljava/util/Date;")
    public static Date method2428() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("nl.k(B)Ljava/util/Date;")
    public static Date method5976() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field893;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method2545(7);
                method3352("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("hd.o(III)I")
    public static int method4439(int arg0, int arg1) {
        for (int var2 = 0; var2 < 8; var2++) {
            if (arg1 <= arg0 + 30) {
                return var2;
            }
            int var3 = arg0 + 30;
            arg0 = var3 + (var2 == 1 || var2 == 3 ? 20 : 5);
        }
        return 0;
    }

    @ObfuscatedName("hi.n(CI)Z")
    public static boolean method4445(char arg0) {
        return field898.indexOf(arg0) != -1;
    }

    @ObfuscatedName("i.d(ZB)V")
    public static void method45(boolean arg0) {
        if (Statics.field3295.method1010() || Statics.field3295.method1011()) {
            method2545(10);
            return;
        }
        field886 = class309.field3840;
        field888 = class309.field3841;
        field889 = class309.field3824;
        method2545(2);
        if (arg0) {
            field905 = "";
        }
        if (field887 == null || field887.length() <= 0) {
            if (Statics.field4303.method2109() == null) {
                client.field524 = false;
            } else {
                field887 = Statics.field4303.method2109();
                client.field524 = true;
            }
        }
        method575();
    }

    @ObfuscatedName("au.a(ZI)V")
    public static void method567(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field4303.method2111() >= client.field481;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field3295.method1010() || Statics.field3295.method1011()) {
            var1 = 10;
        }
        method2545(var1);
        if (arg0) {
            field887 = "";
            field905 = "";
            Statics.field101 = 0;
            Statics.field147 = "";
        }
        if (field887 == null || field887.length() <= 0) {
            if (Statics.field4303.method2109() == null) {
                client.field524 = false;
            } else {
                field887 = Statics.field4303.method2109();
                client.field524 = true;
            }
        }
        method575();
    }

    @ObfuscatedName("di.m(I)V")
    public static void method2423() {
        field887 = field887.trim();
        if (field887.length() == 0) {
            method3352(class309.field3872, class309.field3893, class309.field3894);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(Statics.method5412("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class444 var4 = new class444(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field4707, var4.field4708, 1000 - var4.field4708);
                if (var5 == -1) {
                    var4.field4708 = 0;
                    long var8 = var4.method6935();
                    var6 = var8;
                    break;
                }
                var4.field4708 += var5;
                if (var4.field4708 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var14) {
            var6 = 0L;
        }
        int var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            var13 = class66.method4436(var6, field887);
        }
        switch(var13) {
            case 2:
                method3352(class309.field3895, class309.field3688, class309.field3763);
                method2545(6);
                break;
            case 3:
                method3352(class309.field3800, class309.field3842, class309.field3898);
                break;
            case 4:
                method3352(class309.field3901, class309.field3900, class309.field3640);
                break;
            case 5:
                method3352(class309.field3904, class309.field3905, class309.field3906);
                break;
            case 6:
                method3352(class309.field3907, class309.field3712, class309.field3909);
                break;
            case 7:
                method3352(class309.field3794, class309.field3833, class309.field3912);
        }
    }

    @ObfuscatedName("kh.u(Lmg;Lmg;Lmg;B)V")
    public static void method4930(class350 arg0, class350 arg1, class350 arg2) {
        field906 = (Statics.field32 - 765) / 2;
        field878 = field906 + 202;
        Statics.field879 = field878 + 180;
        if (field900) {
            method5312(arg0, arg1);
            return;
        }
        Statics.field49.method7406(field906, 0);
        Statics.field894.method7406(field906 + 382, 0);
        Statics.field3257.method7323(field906 + 382 - Statics.field3257.field4790 / 2, 18);
        if (client.field505 == 0 || client.field505 == 5) {
            byte var3 = 20;
            arg0.method5719(class309.field3839, field878 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class453.method7261(field878 + 180 - 152, var4, 304, 34, 9179409);
            class453.method7261(field878 + 180 - 151, var4 + 1, 302, 32, 0);
            class453.method7245(field878 + 180 - 150, var4 + 2, field904 * 3, 30, 9179409);
            class453.method7245(field904 * 3 + (field878 + 180 - 150), var4 + 2, 300 - field904 * 3, 30, 0);
            arg0.method5719(field881, field878 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field505 == 20) {
            Statics.field103.method7323(field878 + 180 - Statics.field103.field4790 / 2, 271 - Statics.field103.field4787 / 2);
            short var5 = 201;
            arg0.method5719(field886, field878 + 180, var5, 16776960, 0);
            int var106 = var5 + 15;
            arg0.method5719(field888, field878 + 180, var106, 16776960, 0);
            int var107 = var106 + 15;
            arg0.method5719(field889, field878 + 180, var107, 16776960, 0);
            int var108 = var107 + 15;
            int var109 = var108 + 7;
            if (field885 != 4 && field885 != 10) {
                arg0.method5725(class309.field3678, field878 + 180 - 110, var109, 16777215, 0);
                short var6 = 200;
                String var7;
                for (var7 = method3018(); arg0.method5716(var7) > var6; var7 = var7.substring(0, var7.length() - 1)) {
                }
                arg0.method5725(class351.method5714(var7), field878 + 180 - 70, var109, 16777215, 0);
                var106 = var109 + 15;
                String var8;
                for (var8 = class344.method3076(field905); arg0.method5716(var8) > var6; var8 = var8.substring(1)) {
                }
                arg0.method5725(class309.field3752 + var8, field878 + 180 - 108, var106, 16777215, 0);
                var106 += 15;
            }
        }
        if (client.field505 == 10 || client.field505 == 11 || client.field505 == 50) {
            Statics.field103.method7323(field878, 171);
            if (field885 == 0) {
                short var9 = 251;
                arg0.method5719(class309.field3870, field878 + 180, var9, 16776960, 0);
                int var110 = var9 + 30;
                int var10 = field878 + 180 - 80;
                short var11 = 291;
                Statics.field872.method7323(var10 - 73, var11 - 20);
                arg0.method5774(class309.field3871, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field878 + 180 + 80;
                Statics.field872.method7323(var12 - 73, var11 - 20);
                arg0.method5774(class309.field3774, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field885 == 1) {
                arg0.method5719(field874, field878 + 180, 201, 16776960, 0);
                short var13 = 236;
                arg0.method5719(field886, field878 + 180, var13, 16777215, 0);
                int var111 = var13 + 15;
                arg0.method5719(field888, field878 + 180, var111, 16777215, 0);
                int var112 = var111 + 15;
                arg0.method5719(field889, field878 + 180, var112, 16777215, 0);
                int var113 = var112 + 15;
                int var14 = field878 + 180 - 80;
                short var15 = 321;
                Statics.field872.method7323(var14 - 73, var15 - 20);
                arg0.method5719(class309.field3622, var14, var15 + 5, 16777215, 0);
                int var16 = field878 + 180 + 80;
                Statics.field872.method7323(var16 - 73, var15 - 20);
                arg0.method5719(class309.field3874, var16, var15 + 5, 16777215, 0);
            } else if (field885 == 2) {
                short var17 = 201;
                arg0.method5719(field886, Statics.field879, var17, 16776960, 0);
                int var114 = var17 + 15;
                arg0.method5719(field888, Statics.field879, var114, 16776960, 0);
                int var115 = var114 + 15;
                arg0.method5719(field889, Statics.field879, var115, 16776960, 0);
                int var116 = var115 + 15;
                int var117 = var116 + 7;
                arg0.method5725(class309.field3678, Statics.field879 - 110, var117, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = method3018(); arg0.method5716(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method5725(class351.method5714(var19) + (field897 == 0 & client.field487 % 40 < 20 ? class93.method2932(16776960) + class93.field1276 : ""), Statics.field879 - 70, var117, 16777215, 0);
                var114 = var117 + 15;
                String var20;
                for (var20 = class344.method3076(field905); arg0.method5716(var20) > var18; var20 = var20.substring(1)) {
                }
                arg0.method5725(class309.field3752 + var20 + (field897 == 1 & client.field487 % 40 < 20 ? class93.method2932(16776960) + class93.field1276 : ""), Statics.field879 - 108, var114, 16777215, 0);
                var114 += 15;
                short var21 = 277;
                int var22 = Statics.field879 + -117;
                class456 var23 = Statics.method1754(client.field524, field869);
                var23.method7323(var22, var21);
                int var24 = var23.field4790 + 5 + var22;
                arg1.method5725(class309.field3886, var24, var21 + 13, 16776960, 0);
                int var25 = Statics.field879 + 24;
                class456 var26 = Statics.method1754(Statics.field4303.method2093(), field895);
                var26.method7323(var25, var21);
                int var27 = var26.field4790 + 5 + var25;
                arg1.method5725(class309.field3791, var27, var21 + 13, 16776960, 0);
                int var118 = var21 + 15;
                int var28 = Statics.field879 - 80;
                short var29 = 321;
                Statics.field872.method7323(var28 - 73, var29 - 20);
                arg0.method5719(class309.field3873, var28, var29 + 5, 16777215, 0);
                int var30 = Statics.field879 + 80;
                Statics.field872.method7323(var30 - 73, var29 - 20);
                arg0.method5719(class309.field3874, var30, var29 + 5, 16777215, 0);
                short var31 = 357;
                switch(field876) {
                    case 2:
                        Statics.field1651 = class309.field3888;
                        break;
                    default:
                        Statics.field1651 = class309.field3770;
                }
                Statics.field61 = new class385(Statics.field879, var31, arg1.method5716(Statics.field1651), 11);
                Statics.field1347 = new class385(Statics.field879, var31, arg1.method5716(class309.field3890), 11);
                arg1.method5719(Statics.field1651, Statics.field879, var31, 16777215, 0);
            } else if (field885 == 3) {
                short var32 = 201;
                arg0.method5719(class309.field3818, field878 + 180, var32, 16776960, 0);
                int var119 = var32 + 20;
                arg1.method5719(class309.field3719, field878 + 180, var119, 16776960, 0);
                int var120 = var119 + 15;
                arg1.method5719(class309.field3879, field878 + 180, var120, 16776960, 0);
                int var121 = var120 + 15;
                int var33 = field878 + 180;
                short var34 = 276;
                Statics.field872.method7323(var33 - 73, var34 - 20);
                arg2.method5719(class309.field3880, var33, var34 + 5, 16777215, 0);
                int var35 = field878 + 180;
                short var36 = 326;
                Statics.field872.method7323(var35 - 73, var36 - 20);
                arg2.method5719(class309.field3637, var35, var36 + 5, 16777215, 0);
            } else if (field885 == 4) {
                arg0.method5719(class309.field3856, field878 + 180, 201, 16776960, 0);
                short var37 = 236;
                arg0.method5719(field886, field878 + 180, var37, 16777215, 0);
                int var122 = var37 + 15;
                arg0.method5719(field888, field878 + 180, var122, 16777215, 0);
                int var123 = var122 + 15;
                arg0.method5719(field889, field878 + 180, var123, 16777215, 0);
                int var124 = var123 + 15;
                String var39 = class309.field3869;
                String var40 = Statics.field147;
                String var41 = class344.method4350('*', var40.length());
                arg0.method5725(var39 + var41 + (client.field487 % 40 < 20 ? class93.method2932(16776960) + class93.field1276 : ""), field878 + 180 - 108, var124, 16777215, 0);
                int var125 = var124 - 8;
                arg0.method5725(class309.field3625, field878 + 180 - 9, var125, 16776960, 0);
                int var126 = var125 + 15;
                arg0.method5725(class309.field3626, field878 + 180 - 9, var126, 16776960, 0);
                int var42 = field878 + 180 - 9 + arg0.method5716(class309.field3626) + 15;
                int var43 = var126 - arg0.field4184;
                class456 var44;
                if (field896) {
                    var44 = Statics.field1953;
                } else {
                    var44 = Statics.field169;
                }
                var44.method7323(var42, var43);
                var122 = var126 + 15;
                int var45 = field878 + 180 - 80;
                short var46 = 321;
                Statics.field872.method7323(var45 - 73, var46 - 20);
                arg0.method5719(class309.field3622, var45, var46 + 5, 16777215, 0);
                int var47 = field878 + 180 + 80;
                Statics.field872.method7323(var47 - 73, var46 - 20);
                arg0.method5719(class309.field3874, var47, var46 + 5, 16777215, 0);
                arg1.method5719(class309.field3857, field878 + 180, var46 + 36, 255, 0);
            } else if (field885 == 5) {
                arg0.method5719(class309.field3920, field878 + 180, 201, 16776960, 0);
                short var48 = 221;
                arg2.method5719(field886, field878 + 180, var48, 16776960, 0);
                int var127 = var48 + 15;
                arg2.method5719(field888, field878 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                arg2.method5719(field889, field878 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                int var130 = var129 + 14;
                arg0.method5725(class309.field3883, field878 + 180 - 145, var130, 16777215, 0);
                short var49 = 174;
                String var50;
                for (var50 = method3018(); arg0.method5716(var50) > var49; var50 = var50.substring(1)) {
                }
                arg0.method5725(class351.method5714(var50) + (client.field487 % 40 < 20 ? class93.method2932(16776960) + class93.field1276 : ""), field878 + 180 - 34, var130, 16777215, 0);
                var127 = var130 + 15;
                int var51 = field878 + 180 - 80;
                short var52 = 321;
                Statics.field872.method7323(var51 - 73, var52 - 20);
                arg0.method5719(class309.field3884, var51, var52 + 5, 16777215, 0);
                int var53 = field878 + 180 + 80;
                Statics.field872.method7323(var53 - 73, var52 - 20);
                arg0.method5719(class309.field3885, var53, var52 + 5, 16777215, 0);
                short var54 = 356;
                arg1.method5719(class309.field3890, Statics.field879, var54, 268435455, 0);
            } else if (field885 == 6) {
                short var55 = 201;
                arg0.method5719(field886, field878 + 180, var55, 16776960, 0);
                int var131 = var55 + 15;
                arg0.method5719(field888, field878 + 180, var131, 16776960, 0);
                int var132 = var131 + 15;
                arg0.method5719(field889, field878 + 180, var132, 16776960, 0);
                int var133 = var132 + 15;
                int var56 = field878 + 180;
                short var57 = 321;
                Statics.field872.method7323(var56 - 73, var57 - 20);
                arg0.method5719(class309.field3885, var56, var57 + 5, 16777215, 0);
            } else if (field885 == 7) {
                if (Statics.field1067 && !client.field552) {
                    short var58 = 201;
                    arg0.method5719(field886, Statics.field879, var58, 16776960, 0);
                    int var134 = var58 + 15;
                    arg0.method5719(field888, Statics.field879, var134, 16776960, 0);
                    int var135 = var134 + 15;
                    arg0.method5719(field889, Statics.field879, var135, 16776960, 0);
                    int var59 = Statics.field879 - 150;
                    int var136 = var135 + 10;
                    for (int var60 = 0; var60 < 8; var60++) {
                        Statics.field872.method7325(var59, var136, 30, 40);
                        boolean var61 = field892 == var60 & client.field487 % 40 < 20;
                        arg0.method5725((field893[var60] == null ? "" : field893[var60]) + (var61 ? class93.method2932(16776960) + class93.field1276 : ""), var59 + 10, var136 + 27, 16777215, 0);
                        if (var60 == 1 || var60 == 3) {
                            var59 += 50;
                            arg0.method5725(class351.method5714("/"), var59 - 13, var136 + 27, 16777215, 0);
                        } else {
                            var59 += 35;
                        }
                    }
                    int var62 = Statics.field879 - 80;
                    short var63 = 321;
                    Statics.field872.method7323(var62 - 73, var63 - 20);
                    arg0.method5719("Submit", var62, var63 + 5, 16777215, 0);
                    int var64 = Statics.field879 + 80;
                    Statics.field872.method7323(var64 - 73, var63 - 20);
                    arg0.method5719(class309.field3874, var64, var63 + 5, 16777215, 0);
                } else {
                    short var65 = 216;
                    arg0.method5719(class309.field3913, field878 + 180, var65, 16776960, 0);
                    int var137 = var65 + 15;
                    arg2.method5719(class309.field3937, field878 + 180, var137, 16776960, 0);
                    int var138 = var137 + 15;
                    arg2.method5719(class309.field3915, field878 + 180, var138, 16776960, 0);
                    int var139 = var138 + 15;
                    int var66 = field878 + 180 - 80;
                    short var67 = 321;
                    Statics.field872.method7323(var66 - 73, var67 - 20);
                    arg0.method5719(class309.field3748, var66, var67 + 5, 16777215, 0);
                    int var68 = field878 + 180 + 80;
                    Statics.field872.method7323(var68 - 73, var67 - 20);
                    arg0.method5719(class309.field3885, var68, var67 + 5, 16777215, 0);
                }
            } else if (field885 == 8) {
                short var69 = 216;
                arg0.method5719(class309.field3754, field878 + 180, var69, 16776960, 0);
                int var140 = var69 + 15;
                arg2.method5719(class309.field3847, field878 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg2.method5719(class309.field3756, field878 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var70 = field878 + 180 - 80;
                short var71 = 321;
                Statics.field872.method7323(var70 - 73, var71 - 20);
                arg0.method5719(class309.field3757, var70, var71 + 5, 16777215, 0);
                int var72 = field878 + 180 + 80;
                Statics.field872.method7323(var72 - 73, var71 - 20);
                arg0.method5719(class309.field3885, var72, var71 + 5, 16777215, 0);
            } else if (field885 == 9) {
                short var73 = 221;
                arg0.method5719(field886, field878 + 180, var73, 16776960, 0);
                int var143 = var73 + 25;
                arg0.method5719(field888, field878 + 180, var143, 16776960, 0);
                int var144 = var143 + 25;
                arg0.method5719(field889, field878 + 180, var144, 16776960, 0);
                int var74 = field878 + 180;
                short var75 = 311;
                Statics.field872.method7323(var74 - 73, var75 - 20);
                arg0.method5719(class309.field3880, var74, var75 + 5, 16777215, 0);
            } else if (field885 == 10) {
                int var76 = field878 + 180;
                short var77 = 209;
                arg0.method5719(class309.field3870, field878 + 180, var77, 16776960, 0);
                int var145 = var77 + 20;
                Statics.field4092.method7323(var76 - 109, var145);
                Statics.field873.method7323(var76 - 48, var145 + 18);
            } else if (field885 == 12) {
                int var78 = Statics.field879;
                short var79 = 216;
                arg2.method5719(class309.field3628, var78, var79, 16777215, 0);
                int var146 = var79 + 17;
                arg2.method5719(class309.field3921, var78, var146, 16777215, 0);
                int var147 = var146 + 17;
                arg2.method5719(class309.field3922, var78, var147, 16777215, 0);
                int var148 = var147 + 17;
                arg2.method5719(class309.field3923, var78, var148, 16777215, 0);
                int var80 = Statics.field879 - 80;
                short var81 = 311;
                Statics.field872.method7323(var80 - 73, var81 - 20);
                arg0.method5719(class309.field3814, var80, var81 + 5, 16777215, 0);
                int var82 = Statics.field879 + 80;
                Statics.field872.method7323(var82 - 73, var81 - 20);
                arg0.method5719(class309.field3927, var82, var81 + 5, 16777215, 0);
            } else if (field885 == 13) {
                short var83 = 231;
                arg2.method5719(class309.field3924, field878 + 180, var83, 16777215, 0);
                int var149 = var83 + 20;
                arg2.method5719(class309.field3925, field878 + 180, var149, 16777215, 0);
                int var84 = field878 + 180;
                short var85 = 311;
                Statics.field872.method7323(var84 - 73, var85 - 20);
                arg0.method5719(class309.field3885, var84, var85 + 5, 16777215, 0);
            } else if (field885 == 14) {
                short var86 = 201;
                String var87 = "";
                String var88 = "";
                String var89 = "";
                switch(field883) {
                    case 0:
                        var87 = class309.field3670;
                        var88 = class309.field3825;
                        var89 = class309.field3672;
                        break;
                    case 1:
                        var87 = class309.field3709;
                        var88 = class309.field3743;
                        var89 = class309.field3711;
                        break;
                    case 2:
                        var87 = class309.field3784;
                        var88 = class309.field3746;
                        var89 = class309.field3747;
                        break;
                    default:
                        method45(false);
                }
                arg0.method5719(var87, field878 + 180, var86, 16776960, 0);
                int var150 = var86 + 20;
                arg0.method5719(var88, field878 + 180, var150, 16776960, 0);
                int var151 = var150 + 20;
                arg0.method5719(var89, field878 + 180, var151, 16776960, 0);
                int var90 = field878 + 180;
                short var91 = 276;
                Statics.field872.method7323(var90 - 73, var91 - 20);
                arg0.method5719(class309.field3654, var90, var91 + 5, 16777215, 0);
                int var92 = field878 + 180;
                short var93 = 326;
                Statics.field872.method7323(var92 - 73, var93 - 20);
                arg0.method5719(class309.field3885, var92, var93 + 5, 16777215, 0);
            } else if (field885 == 24) {
                short var94 = 221;
                arg0.method5719(field886, field878 + 180, var94, 16777215, 0);
                int var152 = var94 + 15;
                arg0.method5719(field888, field878 + 180, var152, 16777215, 0);
                int var153 = var152 + 15;
                arg0.method5719(field889, field878 + 180, var153, 16777215, 0);
                int var154 = var153 + 15;
                int var95 = field878 + 180;
                short var96 = 301;
                Statics.field872.method7323(var95 - 73, var96 - 20);
                arg0.method5719(class309.field3850, var95, var96 + 5, 16777215, 0);
            } else if (field885 == 26) {
                short var97 = 216;
                arg0.method5719(class309.field3913, field878 + 180, var97, 16776960, 0);
                int var155 = var97 + 15;
                arg2.method5719(class309.field3937, field878 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg2.method5719(class309.field3915, field878 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                int var98 = field878 + 180 - 80;
                short var99 = 321;
                Statics.field872.method7323(var98 - 73, var99 - 20);
                arg0.method5719(class309.field3748, var98, var99 + 5, 16777215, 0);
                int var100 = field878 + 180 + 80;
                Statics.field872.method7323(var100 - 73, var99 - 20);
                arg0.method5719(class309.field3885, var100, var99 + 5, 16777215, 0);
            }
        }
        if (client.field505 >= 10) {
            int[] var101 = new int[4];
            class453.method7240(var101);
            class453.method7238(field906, 0, field906 + 765, Statics.field2650);
            Statics.field2910.method2056(field906 - 22, client.field487);
            Statics.field2910.method2056(field906 + 765 + 22 - 128, client.field487);
            class453.method7250(var101);
        }
        Statics.field1761[Statics.field4303.method2095() ? 1 : 0].method7323(field906 + 765 - 40, 463);
        if (client.field505 <= 5 || Statics.field1773 != class331.field4099) {
            return;
        }
        if (Statics.field4065 == null) {
            Statics.field4065 = class458.method2786(Statics.field3562, "sl_button", "");
            return;
        }
        int var102 = field906 + 5;
        short var103 = 463;
        byte var104 = 100;
        byte var105 = 35;
        Statics.field4065.method7323(var102, var103);
        arg0.method5719(class309.field3892 + " " + client.field476, var104 / 2 + var102, var105 / 2 + var103 - 2, 16777215, 0);
        if (Statics.field2909 == null) {
            arg1.method5719(class309.field3938, var104 / 2 + var102, var105 / 2 + var103 + 12, 16777215, 0);
        } else {
            arg1.method5719(class309.field3859, var104 / 2 + var102, var105 / 2 + var103 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("gb.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method3352(String arg0, String arg1, String arg2) {
        field886 = arg0;
        field888 = arg1;
        field889 = arg2;
    }

    @ObfuscatedName("lf.z(Lmg;Lmg;I)V")
    public static void method5312(class350 arg0, class350 arg1) {
        if (Statics.field4404 == null) {
            Statics.field4404 = class458.method3476(Statics.field3562, "sl_back", "");
        }
        if (Statics.field4037 == null) {
            Statics.field4037 = class458.method6208(Statics.field3562, "sl_flags", "");
        }
        if (Statics.field300 == null) {
            Statics.field300 = class458.method6208(Statics.field3562, "sl_arrows", "");
        }
        if (Statics.field1993 == null) {
            Statics.field1993 = class458.method6208(Statics.field3562, "sl_stars", "");
        }
        if (Statics.field91 == null) {
            Statics.field91 = class458.method2786(Statics.field3562, "leftarrow", "");
        }
        if (Statics.field77 == null) {
            Statics.field77 = class458.method2786(Statics.field3562, "rightarrow", "");
        }
        class453.method7245(field906, 23, 765, 480, 0);
        class453.method7295(field906, 0, 125, 23, 12425273, 9135624);
        class453.method7295(field906 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5719(class309.field3928, field906 + 62, 15, 0, -1);
        if (Statics.field1993 != null) {
            Statics.field1993[1].method7323(field906 + 140, 1);
            arg1.method5725(class309.field3929, field906 + 152, 10, 16777215, -1);
            Statics.field1993[0].method7323(field906 + 140, 12);
            arg1.method5725(class309.field3930, field906 + 152, 21, 16777215, -1);
        }
        if (Statics.field300 != null) {
            int var2 = field906 + 280;
            if (class61.field779[0] == 0 && class61.field778[0] == 0) {
                Statics.field300[2].method7323(var2, 4);
            } else {
                Statics.field300[0].method7323(var2, 4);
            }
            if (class61.field779[0] == 0 && class61.field778[0] == 1) {
                Statics.field300[3].method7323(var2 + 15, 4);
            } else {
                Statics.field300[1].method7323(var2 + 15, 4);
            }
            arg0.method5725(class309.field3798, var2 + 32, 17, 16777215, -1);
            int var3 = field906 + 390;
            if (class61.field779[0] == 1 && class61.field778[0] == 0) {
                Statics.field300[2].method7323(var3, 4);
            } else {
                Statics.field300[0].method7323(var3, 4);
            }
            if (class61.field779[0] == 1 && class61.field778[0] == 1) {
                Statics.field300[3].method7323(var3 + 15, 4);
            } else {
                Statics.field300[1].method7323(var3 + 15, 4);
            }
            arg0.method5725(class309.field3802, var3 + 32, 17, 16777215, -1);
            int var4 = field906 + 500;
            if (class61.field779[0] == 2 && class61.field778[0] == 0) {
                Statics.field300[2].method7323(var4, 4);
            } else {
                Statics.field300[0].method7323(var4, 4);
            }
            if (class61.field779[0] == 2 && class61.field778[0] == 1) {
                Statics.field300[3].method7323(var4 + 15, 4);
            } else {
                Statics.field300[1].method7323(var4 + 15, 4);
            }
            arg0.method5725(class309.field3933, var4 + 32, 17, 16777215, -1);
            int var5 = field906 + 610;
            if (class61.field779[0] == 3 && class61.field778[0] == 0) {
                Statics.field300[2].method7323(var5, 4);
            } else {
                Statics.field300[0].method7323(var5, 4);
            }
            if (class61.field779[0] == 3 && class61.field778[0] == 1) {
                Statics.field300[3].method7323(var5 + 15, 4);
            } else {
                Statics.field300[1].method7323(var5 + 15, 4);
            }
            arg0.method5725(class309.field3934, var5 + 32, 17, 16777215, -1);
        }
        class453.method7245(field906 + 708, 4, 50, 16, 0);
        arg1.method5719(class309.field3874, field906 + 708 + 25, 16, 16777215, -1);
        field901 = -1;
        if (Statics.field4404 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1) - 1;
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class61.field773) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class61.field773) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class61.field773) {
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
            int var16 = (class61.field773 + var9 - 1) / var9;
            field903 = var16 - var8;
            if (Statics.field91 != null && field868 > 0) {
                Statics.field91.method7323(8, Statics.field2650 / 2 - Statics.field91.field4787 / 2);
            }
            if (Statics.field77 != null && field868 < field903) {
                Statics.field77.method7323(Statics.field32 - Statics.field77.field4790 - 8, Statics.field2650 / 2 - Statics.field77.field4787 / 2);
            }
            int var17 = var15 + 23;
            int var18 = field906 + var14;
            int var19 = 0;
            boolean var20 = false;
            int var21 = field868;
            for (int var22 = var9 * var21; var22 < class61.field773 && var21 - field868 < var8; var22++) {
                class61 var23 = Statics.field775[var22];
                boolean var24 = true;
                String var25 = Integer.toString(var23.field782);
                if (var23.field782 == -1) {
                    var25 = class309.field3935;
                    var24 = false;
                } else if (var23.field782 > 1980) {
                    var25 = class309.field3936;
                    var24 = false;
                }
                int var26 = 0;
                byte var27;
                if (var23.method1502()) {
                    if (var23.method1482()) {
                        var27 = 7;
                    } else {
                        var27 = 6;
                    }
                } else if (var23.method1486()) {
                    var26 = 16711680;
                    if (var23.method1482()) {
                        var27 = 5;
                    } else {
                        var27 = 4;
                    }
                } else if (var23.method1488()) {
                    if (var23.method1482()) {
                        var27 = 9;
                    } else {
                        var27 = 8;
                    }
                } else if (var23.method1487()) {
                    if (var23.method1482()) {
                        var27 = 3;
                    } else {
                        var27 = 2;
                    }
                } else if (var23.method1482()) {
                    var27 = 1;
                } else {
                    var27 = 0;
                }
                if (class33.field220 >= var18 && class33.field228 >= var17 && class33.field220 < var6 + var18 && class33.field228 < var7 + var17 && var24) {
                    field901 = var22;
                    Statics.field4404[var27].method7394(var18, var17, 128, 16777215);
                    var20 = true;
                } else {
                    Statics.field4404[var27].method7406(var18, var17);
                }
                if (Statics.field4037 != null) {
                    Statics.field4037[(var23.method1482() ? 8 : 0) + var23.field785].method7323(var18 + 29, var17);
                }
                arg0.method5719(Integer.toString(var23.field780), var18 + 15, var7 / 2 + var17 + 5, var26, -1);
                arg1.method5719(var25, var18 + 60, var7 / 2 + var17 + 5, 268435455, -1);
                var17 += var7 + var13;
                var19++;
                if (var19 >= var9) {
                    var17 = var15 + 23;
                    var18 += var6 + var12;
                    var19 = 0;
                    var21++;
                }
            }
            if (var20) {
                int var28 = arg1.method5716(Statics.field775[field901].field784) + 6;
                int var29 = arg1.field4184 + 8;
                int var30 = class33.field228 + 25;
                if (var29 + var30 > 480) {
                    var30 = class33.field228 - 25 - var29;
                }
                class453.method7245(class33.field220 - var28 / 2, var30, var28, var29, 16777120);
                class453.method7261(class33.field220 - var28 / 2, var30, var28, var29, 0);
                arg1.method5719(Statics.field775[field901].field784, class33.field220, arg1.field4184 + var30 + 4, 0, -1);
            }
        }
        Statics.field1490.method390(0, 0);
    }

    @ObfuscatedName("ig.r(Lbd;I)V")
    public static void method4481(class61 arg0) {
        if (arg0.method1482() != client.field479) {
            client.field479 = arg0.method1482();
            boolean var1 = arg0.method1482();
            if (Statics.field1021 != var1) {
                class188.method2590();
                Statics.field1021 = var1;
            }
        }
        if (client.field477 != arg0.field781) {
            class314 var2 = Statics.field3562;
            int var3 = arg0.field781;
            if ((var3 & 0x20000000) != 0) {
                Statics.field3257 = class458.method2786(var2, "logo_deadman_mode", "");
            } else if ((var3 & 0x40000000) == 0) {
                Statics.field3257 = class458.method2786(var2, "logo", "");
            } else {
                Statics.field3257 = class458.method2786(var2, "logo_seasonal_mode", "");
            }
        }
        Statics.field67 = arg0.field783;
        client.field476 = arg0.field780;
        client.field477 = arg0.field781;
        Statics.field2281 = client.field662 == 0 ? 43594 : arg0.field780 + 40000;
        Statics.field1738 = client.field662 == 0 ? 443 : arg0.field780 + 50000;
        Statics.field2685 = Statics.field2281;
    }

    @ObfuscatedName("eg.y(B)V")
    public static void method2749() {
        field900 = false;
        Statics.field49.method7406(field906, 0);
        Statics.field894.method7406(field906 + 382, 0);
        Statics.field3257.method7323(field906 + 382 - Statics.field3257.field4790 / 2, 18);
    }

    @ObfuscatedName("u.p(I)V")
    public static void method160() {
        method2545(24);
        method3352(class309.field3651, class309.field3862, class309.field3863);
    }

    @ObfuscatedName("dg.e(II)V")
    public static void method2545(int arg0) {
        if (field885 != arg0) {
            field885 = arg0;
        }
    }
}
