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

@ObfuscatedName("ba")
public class class69 {

    @ObfuscatedName("ba.q")
    public static int field901 = 0;

    @ObfuscatedName("ba.b")
    public static int field897 = field901 + 202;

    @ObfuscatedName("ba.o")
    public static int field904 = 10;

    @ObfuscatedName("ba.m")
    public static String field899 = "";

    @ObfuscatedName("ba.ah")
    public static int field898 = -1;

    @ObfuscatedName("ba.av")
    public static int field903 = 1;

    @ObfuscatedName("ba.ay")
    public static int field890 = 0;

    @ObfuscatedName("ba.as")
    public static String field905 = "";

    @ObfuscatedName("ba.be")
    public static String field906 = "";

    @ObfuscatedName("ba.bz")
    public static String field907 = "";

    @ObfuscatedName("ba.bp")
    public static String field908 = "";

    @ObfuscatedName("ba.bf")
    public static String field909 = "";

    @ObfuscatedName("ba.bg")
    public static String field910 = "";

    @ObfuscatedName("ba.bn")
    public static int field911 = 0;

    @ObfuscatedName("ba.bq")
    public static String[] field912 = new String[8];

    @ObfuscatedName("ba.bw")
    public static boolean field913 = false;

    @ObfuscatedName("ba.bi")
    public static boolean field914 = false;

    @ObfuscatedName("ba.bm")
    public static boolean field896 = true;

    @ObfuscatedName("ba.by")
    public static int field916 = 0;

    @ObfuscatedName("ba.bj")
    public static String field892 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ba.bd")
    public static String field893 = "1234567890";

    @ObfuscatedName("ba.cq")
    public static boolean field919 = false;

    @ObfuscatedName("ba.cp")
    public static int field920 = -1;

    @ObfuscatedName("ba.cf")
    public static int field921 = 0;

    @ObfuscatedName("ba.cv")
    public static int field922 = 0;

    @ObfuscatedName("ba.co")
    public static long field924;

    @ObfuscatedName("ba.cz")
    public static long field926;

    @ObfuscatedName("ba.cu")
    public static String[] field925;

    @ObfuscatedName("ba.ce")
    public static String[] field917;

    static {
        new DecimalFormat("##0.00");
        new class121();
        field924 = -1L;
        field926 = -1L;
        field925 = new String[] { "title.jpg" };
        field917 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
    }

    public class69() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.c(Llh;Llh;B)I")
    public static int method2095(class315 arg0, class315 arg1) {
        int var2 = 0;
        String[] var3 = field925;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method5331(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field917;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method5331(var8, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("en.v(Llh;Llh;ZIS)V")
    public static void method2809(class315 arg0, class315 arg1, boolean arg2, int arg3) {
        if (!Statics.field918) {
            if (arg3 == 0) {
                method2422(arg2);
            } else {
                method4519(arg3);
            }
            class452.method7347();
            byte[] var4 = arg0.method5319("title.jpg", "");
            Statics.field92 = class29.method3589(var4);
            Statics.field930 = Statics.field92.method7448();
            Statics.method712(arg1, client.field478);
            Statics.field10 = class457.method6791(arg1, "titlebox", "");
            Statics.field19 = class457.method6791(arg1, "titlebutton", "");
            Statics.field915 = class457.method6791(arg1, "titlebutton_large", "");
            Statics.field4285 = class457.method6791(arg1, "play_now_text", "");
            class457.method6791(arg1, "titlebutton_wide42,1", "");
            int var5 = arg1.method5349("runes");
            int var6 = arg1.method5315(var5, "");
            class455[] var7 = class457.method2699(arg1, var5, var6);
            Statics.field3297 = var7;
            int var8 = arg1.method5349("title_mute");
            int var9 = arg1.method5315(var8, "");
            class455[] var10 = class457.method2699(arg1, var8, var9);
            Statics.field1675 = var10;
            Statics.field4158 = class457.method6791(arg1, "options_radio_buttons,0", "");
            Statics.field1428 = class457.method6791(arg1, "options_radio_buttons,4", "");
            Statics.field2760 = class457.method6791(arg1, "options_radio_buttons,2", "");
            Statics.field980 = class457.method6791(arg1, "options_radio_buttons,6", "");
            Statics.field248 = Statics.field4158.field4789;
            Statics.field1065 = Statics.field4158.field4790;
            Statics.field895 = new class89(Statics.field3297);
            if (arg2) {
                field909 = "";
                field910 = "";
                field912 = new String[8];
                field911 = 0;
            }
            Statics.field2847 = 0;
            Statics.field782 = "";
            field896 = true;
            field919 = false;
            if (Statics.field109.method2209()) {
                class273.field3196 = 1;
                Statics.field3195 = null;
                Statics.field3198 = -1;
                Statics.field1715 = -1;
                Statics.field3193 = 0;
                Statics.field62 = false;
                Statics.field3200 = 2;
            } else {
                class313 var11 = Statics.field1516;
                int var12 = var11.method5349("scape main");
                int var13 = var11.method5315(var12, "");
                class273.field3196 = 1;
                Statics.field3195 = var11;
                Statics.field3198 = var12;
                Statics.field1715 = var13;
                Statics.field3193 = 255;
                Statics.field62 = false;
                Statics.field3200 = 2;
            }
            class316.method2568(false);
            Statics.field918 = true;
            field901 = (Statics.field976 - 765) / 2;
            field897 = field901 + 202;
            Statics.field158 = field897 + 180;
            Statics.field92.method7458(field901, 0);
            Statics.field930.method7458(field901 + 382, 0);
            Statics.field902.method7431(field901 + 382 - Statics.field902.field4789 / 2, 18);
        } else if (arg3 == 4) {
            method4519(4);
        }
    }

    @ObfuscatedName("dk.q(I)Ljava/lang/String;")
    public static String method2689() {
        return Statics.field109.method2139() ? class343.method5395(field909) : field909;
    }

    @ObfuscatedName("o.f(I)V")
    public static void method281() {
        if (field909 != null && field909.length() > 0) {
            return;
        }
        if (Statics.field109.method2156() == null) {
            client.field529 = false;
        } else {
            field909 = Statics.field109.method2156();
            client.field529 = true;
        }
    }

    @ObfuscatedName("ao.e(B)V")
    public static void method352() {
        if (client.field529 && field909 != null && field909.length() > 0) {
            field916 = 1;
        } else {
            field916 = 0;
        }
    }

    @ObfuscatedName("h.g(Lap;Lmt;B)V")
    public static void method176(class32 arg0, class349 arg1) {
        if (field919) {
            method2866(arg0);
            return;
        }
        if ((class33.field231 == 1 || !Statics.field1528 && class33.field231 == 4) && class33.field232 >= field901 + 765 - 50 && class33.field233 >= 453) {
            Statics.field109.method2140(!Statics.field109.method2209());
            if (Statics.field109.method2209()) {
                class273.method574();
            } else {
                class313 var2 = Statics.field1516;
                int var3 = var2.method5349("scape main");
                int var4 = var2.method5315(var3, "");
                class273.method2292(var2, var3, var4, 255, false);
            }
        }
        if (client.field487 == 5) {
            return;
        }
        if (field924 == -1L) {
            field924 = class269.method2567() + 1000L;
        }
        long var5 = class269.method2567();
        if (client.method5746() && field926 == -1L) {
            field926 = var5;
            if (field926 > field924) {
                field924 = field926;
            }
        }
        if (client.field487 != 10 && client.field487 != 11) {
            return;
        }
        if (Statics.field1604 == class330.field4093) {
            if (class33.field231 == 1 || !Statics.field1528 && class33.field231 == 4) {
                int var7 = field901 + 5;
                short var8 = 463;
                byte var9 = 100;
                byte var10 = 35;
                if (class33.field232 >= var7 && class33.field232 <= var7 + var9 && class33.field233 >= var8 && class33.field233 <= var8 + var10) {
                    method2608();
                    return;
                }
            }
            if (Statics.field1893 != null) {
                method2608();
            }
        }
        int var11 = class33.field231;
        int var12 = class33.field232;
        int var13 = class33.field233;
        if (var11 == 0) {
            var12 = class33.field223;
            var13 = class33.field225;
        }
        if (!Statics.field1528 && var11 == 4) {
            var11 = 1;
        }
        if (field890 == 0) {
            boolean var14 = false;
            while (class24.method235()) {
                if (Statics.field3197 == 84) {
                    var14 = true;
                }
            }
            int var15 = Statics.field158 - 80;
            short var16 = 291;
            if (var11 == 1 && var12 >= var15 - 75 && var12 <= var15 + 75 && var13 >= var16 - 20 && var13 <= var16 + 20) {
                class30.method4702(client.method5515("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var17 = Statics.field158 + 80;
            if (var11 == 1 && var12 >= var17 - 75 && var12 <= var17 + 75 && var13 >= var16 - 20 && var13 <= var16 + 20 || var14) {
                if ((client.field478 & 0x2000000) != 0) {
                    field905 = "";
                    field906 = class308.field3651;
                    field907 = class308.field3793;
                    field908 = class308.field3855;
                    method4519(1);
                    method352();
                } else if ((client.field478 & 0x4) != 0) {
                    if ((client.field478 & 0x400) == 0) {
                        field906 = class308.field3844;
                        field907 = class308.field3845;
                        field908 = class308.field3661;
                    } else {
                        field906 = class308.field3850;
                        field907 = class308.field3732;
                        field908 = class308.field3852;
                    }
                    field905 = class308.field3843;
                    method4519(1);
                    method352();
                } else if ((client.field478 & 0x400) == 0) {
                    method2729(false);
                } else {
                    field906 = class308.field3869;
                    field907 = class308.field3848;
                    field908 = class308.field3849;
                    field905 = class308.field3843;
                    method4519(1);
                    method352();
                }
            }
        } else if (field890 == 1) {
            while (true) {
                if (!class24.method235()) {
                    int var18 = Statics.field158 - 80;
                    short var19 = 321;
                    if (var11 == 1 && var12 >= var18 - 75 && var12 <= var18 + 75 && var13 >= var19 - 20 && var13 <= var19 + 20) {
                        method2729(false);
                    }
                    int var20 = Statics.field158 + 80;
                    if (var11 == 1 && var12 >= var20 - 75 && var12 <= var20 + 75 && var13 >= var19 - 20 && var13 <= var19 + 20) {
                        method4519(0);
                    }
                    break;
                }
                if (Statics.field3197 == 84) {
                    method2729(false);
                } else if (Statics.field3197 == 13) {
                    method4519(0);
                }
            }
        } else if (field890 == 2) {
            short var21 = 201;
            int var146 = var21 + 52;
            if (var11 == 1 && var13 >= var146 - 12 && var13 < var146 + 2) {
                field916 = 0;
            }
            var146 += 15;
            if (var11 == 1 && var13 >= var146 - 12 && var13 < var146 + 2) {
                field916 = 1;
            }
            var146 += 15;
            short var22 = 361;
            if (Statics.field1023 != null) {
                int var23 = Statics.field1023.field4380 / 2;
                if (var11 == 1 && var12 >= Statics.field1023.field4382 - var23 && var12 <= Statics.field1023.field4382 + var23 && var13 >= var22 - 15 && var13 < var22) {
                    switch(field903) {
                        case 1:
                            method2420(class308.field3626, class308.field3847, class308.field3797);
                            method4519(5);
                            return;
                        case 2:
                            class30.method4702("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var24 = Statics.field158 - 80;
            short var25 = 321;
            if (var11 == 1 && var12 >= var24 - 75 && var12 <= var24 + 75 && var13 >= var25 - 20 && var13 <= var25 + 20) {
                field909 = field909.trim();
                if (field909.length() == 0) {
                    method2420(class308.field3658, class308.field3737, class308.field3928);
                    return;
                }
                if (field910.length() == 0) {
                    method2420(class308.field3739, class308.field3740, class308.field3741);
                    return;
                }
                method2420(class308.field3858, class308.field3859, class308.field3860);
                client.method6189(false);
                client.method2093(20);
                return;
            }
            int var26 = field897 + 180 + 80;
            if (var11 == 1 && var12 >= var26 - 75 && var12 <= var26 + 75 && var13 >= var25 - 20 && var13 <= var25 + 20) {
                method4519(0);
                field909 = "";
                field910 = "";
                Statics.field2847 = 0;
                Statics.field782 = "";
                field896 = true;
            }
            int var27 = Statics.field158 + -117;
            short var28 = 277;
            field913 = var12 >= var27 && var12 < Statics.field248 + var27 && var13 >= var28 && var13 < Statics.field1065 + var28;
            if (var11 == 1 && field913) {
                client.field529 = !client.field529;
                if (!client.field529 && Statics.field109.method2156() != null) {
                    Statics.field109.method2152((String) null);
                }
            }
            int var29 = Statics.field158 + 24;
            short var30 = 277;
            field914 = var12 >= var29 && var12 < Statics.field248 + var29 && var13 >= var30 && var13 < Statics.field1065 + var30;
            if (var11 == 1 && field914) {
                Statics.field109.method2138(!Statics.field109.method2139());
                if (!Statics.field109.method2139()) {
                    field909 = "";
                    Statics.field109.method2152((String) null);
                    method352();
                }
            }
            label1101: while (true) {
                Transferable var36;
                int var37;
                do {
                    while (true) {
                        label1019: do {
                            while (true) {
                                while (class24.method235()) {
                                    if (Statics.field3197 == 13) {
                                        method4519(0);
                                        field909 = "";
                                        field910 = "";
                                        Statics.field2847 = 0;
                                        Statics.field782 = "";
                                        field896 = true;
                                    } else {
                                        if (field916 != 0) {
                                            continue label1019;
                                        }
                                        char var31 = Statics.field1259;
                                        for (int var32 = 0; var32 < field892.length() && var31 != field892.charAt(var32); var32++) {
                                        }
                                        if (Statics.field3197 == 85 && field909.length() > 0) {
                                            field909 = field909.substring(0, field909.length() - 1);
                                        }
                                        if (Statics.field3197 == 84 || Statics.field3197 == 80) {
                                            field916 = 1;
                                        }
                                        char var33 = Statics.field1259;
                                        boolean var34 = field892.indexOf(var33) != -1;
                                        if (var34 && field909.length() < 320) {
                                            field909 = field909 + Statics.field1259;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field916 != 1);
                        if (Statics.field3197 == 85 && field910.length() > 0) {
                            field910 = field910.substring(0, field910.length() - 1);
                        } else if (Statics.field3197 == 84 || Statics.field3197 == 80) {
                            field916 = 0;
                            if (Statics.field3197 == 84) {
                                field909 = field909.trim();
                                if (field909.length() == 0) {
                                    method2420(class308.field3658, class308.field3737, class308.field3928);
                                    return;
                                }
                                if (field910.length() == 0) {
                                    method2420(class308.field3739, class308.field3740, class308.field3741);
                                    return;
                                }
                                method2420(class308.field3858, class308.field3859, class308.field3860);
                                client.method6189(false);
                                client.method2093(20);
                                return;
                            }
                        }
                        if ((class24.field136[82] || class24.field136[87]) && Statics.field3197 == 67) {
                            Clipboard var35 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var36 = var35.getContents(Statics.field4220);
                            var37 = 20 - field910.length();
                            break;
                        }
                        char var50 = Statics.field1259;
                        boolean var51;
                        if ((var50 < ' ' || var50 >= 127) && (var50 <= 127 || var50 >= 160) && (var50 <= 160 || var50 > 255)) {
                            label1222: {
                                if (var50 != 0) {
                                    char[] var52 = class341.field4141;
                                    for (int var53 = 0; var53 < var52.length; var53++) {
                                        char var54 = var52[var53];
                                        if (var50 == var54) {
                                            var51 = true;
                                            break label1222;
                                        }
                                    }
                                }
                                var51 = false;
                            }
                        } else {
                            var51 = true;
                        }
                        if (var51) {
                            char var55 = Statics.field1259;
                            boolean var56 = field892.indexOf(var55) != -1;
                            if (var56 && field910.length() < 20) {
                                field910 = field910 + Statics.field1259;
                            }
                        }
                    }
                } while (var37 <= 0);
                try {
                    String var38 = (String) var36.getTransferData(DataFlavor.stringFlavor);
                    int var39 = Math.min(var37, var38.length());
                    int var40 = 0;
                    while (true) {
                        if (var40 >= var39) {
                            field910 = field910 + var38.substring(0, var39);
                            continue label1101;
                        }
                        char var41 = var38.charAt(var40);
                        boolean var42;
                        if ((var41 < ' ' || var41 >= 127) && (var41 <= 127 || var41 >= 160) && (var41 <= 160 || var41 > 255)) {
                            label1225: {
                                if (var41 != 0) {
                                    char[] var43 = class341.field4141;
                                    for (int var44 = 0; var44 < var43.length; var44++) {
                                        char var45 = var43[var44];
                                        if (var41 == var45) {
                                            var42 = true;
                                            break label1225;
                                        }
                                    }
                                }
                                var42 = false;
                            }
                        } else {
                            var42 = true;
                        }
                        if (!var42) {
                            break;
                        }
                        char var46 = var38.charAt(var40);
                        boolean var47 = field892.indexOf(var46) != -1;
                        if (!var47) {
                            break;
                        }
                        var40++;
                    }
                    method4519(3);
                    return;
                } catch (UnsupportedFlavorException var144) {
                } catch (IOException var145) {
                }
            }
        } else if (field890 == 3) {
            int var57 = field897 + 180;
            short var58 = 276;
            if (var11 == 1 && var12 >= var57 - 75 && var12 <= var57 + 75 && var13 >= var58 - 20 && var13 <= var58 + 20) {
                method2422(false);
            }
            int var59 = field897 + 180;
            short var60 = 326;
            if (var11 == 1 && var12 >= var59 - 75 && var12 <= var59 + 75 && var13 >= var60 - 20 && var13 <= var60 + 20) {
                method2420(class308.field3626, class308.field3847, class308.field3797);
                method4519(5);
                return;
            }
        } else if (field890 == 4) {
            int var61 = field897 + 180 - 80;
            short var62 = 321;
            if (var11 == 1 && var12 >= var61 - 75 && var12 <= var61 + 75 && var13 >= var62 - 20 && var13 <= var62 + 20) {
                Statics.field782.trim();
                if (Statics.field782.length() != 6) {
                    method2420(class308.field3777, class308.field3656, class308.field3657);
                    return;
                }
                Statics.field2847 = Integer.parseInt(Statics.field782);
                Statics.field782 = "";
                client.method6189(true);
                method2420(class308.field3858, class308.field3859, class308.field3860);
                client.method2093(20);
                return;
            }
            if (var11 == 1 && var12 >= field897 + 180 - 9 && var12 <= field897 + 180 + 130 && var13 >= 263 && var13 <= 296) {
                field896 = !field896;
            }
            if (var11 == 1 && var12 >= field897 + 180 - 34 && var12 <= field897 + 180 + 34 && var13 >= 351 && var13 <= 363) {
                class30.method4702(client.method5515("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var63 = field897 + 180 + 80;
            if (var11 == 1 && var12 >= var63 - 75 && var12 <= var63 + 75 && var13 >= var62 - 20 && var13 <= var62 + 20) {
                method4519(0);
                field909 = "";
                field910 = "";
                Statics.field2847 = 0;
                Statics.field782 = "";
            }
            while (class24.method235()) {
                boolean var64 = false;
                for (int var65 = 0; var65 < field893.length(); var65++) {
                    if (Statics.field1259 == field893.charAt(var65)) {
                        var64 = true;
                        break;
                    }
                }
                if (Statics.field3197 == 13) {
                    method4519(0);
                    field909 = "";
                    field910 = "";
                    Statics.field2847 = 0;
                    Statics.field782 = "";
                } else {
                    if (Statics.field3197 == 85 && Statics.field782.length() > 0) {
                        Statics.field782 = Statics.field782.substring(0, Statics.field782.length() - 1);
                    }
                    if (Statics.field3197 == 84) {
                        Statics.field782.trim();
                        if (Statics.field782.length() != 6) {
                            method2420(class308.field3777, class308.field3656, class308.field3657);
                            return;
                        }
                        Statics.field2847 = Integer.parseInt(Statics.field782);
                        Statics.field782 = "";
                        client.method6189(true);
                        method2420(class308.field3858, class308.field3859, class308.field3860);
                        client.method2093(20);
                        return;
                    }
                    if (var64 && Statics.field782.length() < 6) {
                        Statics.field782 = Statics.field782 + Statics.field1259;
                    }
                }
            }
        } else if (field890 == 5) {
            int var66 = field897 + 180 - 80;
            short var67 = 321;
            if (var11 == 1 && var12 >= var66 - 75 && var12 <= var66 + 75 && var13 >= var67 - 20 && var13 <= var67 + 20) {
                field909 = field909.trim();
                if (field909.length() == 0) {
                    method2420(class308.field3626, class308.field3847, class308.field3797);
                } else {
                    long var74;
                    try {
                        URL var68 = new URL(client.method5515("services", false) + "m=accountappeal/login.ws");
                        URLConnection var69 = var68.openConnection();
                        var69.setRequestProperty("connection", "close");
                        var69.setDoInput(true);
                        var69.setDoOutput(true);
                        var69.setConnectTimeout(5000);
                        OutputStreamWriter var70 = new OutputStreamWriter(var69.getOutputStream());
                        var70.write("data1=req");
                        var70.flush();
                        InputStream var71 = var69.getInputStream();
                        class443 var72 = new class443(new byte[1000]);
                        while (true) {
                            int var73 = var71.read(var72.field4701, var72.field4700, 1000 - var72.field4700);
                            if (var73 == -1) {
                                var72.field4700 = 0;
                                long var76 = var72.method7106();
                                var74 = var76;
                                break;
                            }
                            var72.field4700 += var73;
                            if (var72.field4700 >= 1000) {
                                var74 = 0L;
                                break;
                            }
                        }
                    } catch (Exception var142) {
                        var74 = 0L;
                    }
                    int var81;
                    if (var74 == 0L) {
                        var81 = 5;
                    } else {
                        var81 = class66.method4615(var74, field909);
                    }
                    switch(var81) {
                        case 2:
                            method2420(class308.field3895, class308.field3927, class308.field3897);
                            method4519(6);
                            break;
                        case 3:
                            method2420(class308.field3898, class308.field3851, class308.field3900);
                            break;
                        case 4:
                            method2420(class308.field3901, class308.field3902, class308.field3903);
                            break;
                        case 5:
                            method2420(class308.field3917, class308.field3652, class308.field3906);
                            break;
                        case 6:
                            method2420(class308.field3907, class308.field3908, class308.field3695);
                            break;
                        case 7:
                            method2420(class308.field3910, class308.field3846, class308.field3893);
                    }
                }
                return;
            }
            int var82 = field897 + 180 + 80;
            if (var11 == 1 && var12 >= var82 - 75 && var12 <= var82 + 75 && var13 >= var67 - 20 && var13 <= var67 + 20) {
                method2729(true);
            }
            short var83 = 361;
            if (Statics.field295 != null) {
                int var84 = Statics.field295.field4380 / 2;
                if (var11 == 1 && var12 >= Statics.field295.field4382 - var84 && var12 <= Statics.field295.field4382 + var84 && var13 >= var83 - 15 && var13 < var83) {
                    class30.method4702(client.method5515("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class24.method235()) {
                boolean var85 = false;
                for (int var86 = 0; var86 < field892.length(); var86++) {
                    if (Statics.field1259 == field892.charAt(var86)) {
                        var85 = true;
                        break;
                    }
                }
                if (Statics.field3197 == 13) {
                    method2729(true);
                } else {
                    if (Statics.field3197 == 85 && field909.length() > 0) {
                        field909 = field909.substring(0, field909.length() - 1);
                    }
                    if (Statics.field3197 == 84) {
                        field909 = field909.trim();
                        if (field909.length() == 0) {
                            method2420(class308.field3626, class308.field3847, class308.field3797);
                        } else {
                            long var93;
                            try {
                                URL var87 = new URL(client.method5515("services", false) + "m=accountappeal/login.ws");
                                URLConnection var88 = var87.openConnection();
                                var88.setRequestProperty("connection", "close");
                                var88.setDoInput(true);
                                var88.setDoOutput(true);
                                var88.setConnectTimeout(5000);
                                OutputStreamWriter var89 = new OutputStreamWriter(var88.getOutputStream());
                                var89.write("data1=req");
                                var89.flush();
                                InputStream var90 = var88.getInputStream();
                                class443 var91 = new class443(new byte[1000]);
                                while (true) {
                                    int var92 = var90.read(var91.field4701, var91.field4700, 1000 - var91.field4700);
                                    if (var92 == -1) {
                                        var91.field4700 = 0;
                                        long var95 = var91.method7106();
                                        var93 = var95;
                                        break;
                                    }
                                    var91.field4700 += var92;
                                    if (var91.field4700 >= 1000) {
                                        var93 = 0L;
                                        break;
                                    }
                                }
                            } catch (Exception var143) {
                                var93 = 0L;
                            }
                            int var100;
                            if (var93 == 0L) {
                                var100 = 5;
                            } else {
                                var100 = class66.method4615(var93, field909);
                            }
                            switch(var100) {
                                case 2:
                                    method2420(class308.field3895, class308.field3927, class308.field3897);
                                    method4519(6);
                                    break;
                                case 3:
                                    method2420(class308.field3898, class308.field3851, class308.field3900);
                                    break;
                                case 4:
                                    method2420(class308.field3901, class308.field3902, class308.field3903);
                                    break;
                                case 5:
                                    method2420(class308.field3917, class308.field3652, class308.field3906);
                                    break;
                                case 6:
                                    method2420(class308.field3907, class308.field3908, class308.field3695);
                                    break;
                                case 7:
                                    method2420(class308.field3910, class308.field3846, class308.field3893);
                            }
                        }
                        return;
                    }
                    if (var85 && field909.length() < 320) {
                        field909 = field909 + Statics.field1259;
                    }
                }
            }
        } else if (field890 == 6) {
            while (true) {
                do {
                    if (!class24.method235()) {
                        short var101 = 321;
                        if (var11 == 1 && var13 >= var101 - 20 && var13 <= var101 + 20) {
                            method2729(true);
                        }
                        return;
                    }
                } while (Statics.field3197 != 84 && Statics.field3197 != 13);
                method2729(true);
            }
        } else if (field890 == 7) {
            if (Statics.field1822 && !client.field578) {
                int var102 = Statics.field158 - 150;
                int var103 = var102 + 240 + 25 + 40;
                short var104 = 231;
                int var105 = var104 + 40;
                if (var11 == 1 && var12 >= var102 && var12 <= var103 && var13 >= var104 && var13 <= var105) {
                    field911 = method2623(var102, var12);
                }
                int var106 = field897 + 180 - 80;
                short var107 = 321;
                if (var11 == 1 && var12 >= var106 - 75 && var12 <= var106 + 75 && var13 >= var107 - 20 && var13 <= var107 + 20) {
                    boolean var108 = method5474();
                    if (var108) {
                        client.method2093(50);
                        return;
                    }
                }
                int var109 = field897 + 180 + 80;
                if (var11 == 1 && var12 >= var109 - 75 && var12 <= var109 + 75 && var13 >= var107 - 20 && var13 <= var107 + 20) {
                    field912 = new String[8];
                    method2729(true);
                }
                while (class24.method235()) {
                    if (Statics.field3197 == 101) {
                        field912[field911] = null;
                    }
                    if (Statics.field3197 == 85) {
                        if (field912[field911] == null && field911 > 0) {
                            field911--;
                        }
                        field912[field911] = null;
                    }
                    if (Statics.field1259 >= '0' && Statics.field1259 <= '9') {
                        field912[field911] = "" + Statics.field1259;
                        if (field911 < 7) {
                            field911++;
                        }
                    }
                    if (Statics.field3197 == 84) {
                        boolean var110 = method5474();
                        if (var110) {
                            client.method2093(50);
                        }
                        return;
                    }
                }
            } else {
                int var111 = field897 + 180 - 80;
                short var112 = 321;
                if (var11 == 1 && var12 >= var111 - 75 && var12 <= var111 + 75 && var13 >= var112 - 20 && var13 <= var112 + 20) {
                    class30.method4702(client.method5515("secure", true) + "m=dob/set_dob.ws", true, false);
                    method2420(class308.field3889, class308.field3890, class308.field3891);
                    method4519(6);
                    return;
                }
                int var113 = field897 + 180 + 80;
                if (var11 == 1 && var12 >= var113 - 75 && var12 <= var113 + 75 && var13 >= var112 - 20 && var13 <= var112 + 20) {
                    method2729(true);
                }
            }
        } else if (field890 == 8) {
            int var114 = field897 + 180 - 80;
            short var115 = 321;
            if (var11 == 1 && var12 >= var114 - 75 && var12 <= var114 + 75 && var13 >= var115 - 20 && var13 <= var115 + 20) {
                class30.method4702("https://www.jagex.com/terms/privacy", true, false);
                method2420(class308.field3889, class308.field3890, class308.field3891);
                method4519(6);
                return;
            }
            int var116 = field897 + 180 + 80;
            if (var11 == 1 && var12 >= var116 - 75 && var12 <= var116 + 75 && var13 >= var115 - 20 && var13 <= var115 + 20) {
                method2729(true);
            }
        } else if (field890 == 9) {
            int var117 = field897 + 180;
            short var118 = 311;
            if (Statics.field3197 == 84 || Statics.field3197 == 13 || var11 == 1 && var12 >= var117 - 75 && var12 <= var117 + 75 && var13 >= var118 - 20 && var13 <= var118 + 20) {
                method2422(false);
            }
        } else if (field890 == 10) {
            int var119 = field897 + 180;
            short var120 = 209;
            if (Statics.field3197 == 84 || var11 == 1 && var12 >= var119 - 109 && var12 <= var119 + 109 && var13 >= var120 && var13 <= var120 + 68) {
                method2420(class308.field3858, class308.field3859, class308.field3860);
                client.field517 = class447.field4751;
                client.method6189(false);
                client.method2093(20);
            }
        } else if (field890 == 12) {
            int var121 = Statics.field158;
            short var122 = 233;
            class384 var123 = arg1.method5805(0, 30, class308.field3921, var121, var122);
            class384 var124 = arg1.method5805(32, 32, class308.field3921, var121, var122);
            class384 var125 = arg1.method5805(70, 34, class308.field3921, var121, var122);
            int var147 = var122 + 17;
            class384 var126 = arg1.method5805(0, 34, class308.field3922, var121, var147);
            if (var11 == 1) {
                if (var123.method6266(var12, var13)) {
                    class30.method4702("https://www.jagex.com/terms", true, false);
                } else if (var124.method6266(var12, var13)) {
                    class30.method4702("https://www.jagex.com/terms/privacy", true, false);
                } else if (var125.method6266(var12, var13) || var126.method6266(var12, var13)) {
                    class30.method4702("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var127 = Statics.field158 - 80;
            short var128 = 311;
            if (var11 == 1 && var12 >= var127 - 75 && var12 <= var127 + 75 && var13 >= var128 - 20 && var13 <= var128 + 20) {
                Statics.field109.method2199(client.field483);
                method2422(true);
            }
            int var129 = Statics.field158 + 80;
            if (var11 == 1 && var12 >= var129 - 75 && var12 <= var129 + 75 && var13 >= var128 - 20 && var13 <= var128 + 20) {
                field890 = 13;
            }
        } else if (field890 == 13) {
            int var130 = Statics.field158;
            short var131 = 321;
            if (var11 == 1 && var12 >= var130 - 75 && var12 <= var130 + 75 && var13 >= var131 - 20 && var13 <= var131 + 20) {
                method2422(true);
            }
        } else if (field890 == 14) {
            String var132 = "";
            switch(field898) {
                case 0:
                    var132 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var132 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method2729(false);
            }
            int var133 = field897 + 180;
            short var134 = 276;
            if (var11 == 1 && var12 >= var133 - 75 && var12 <= var133 + 75 && var13 >= var134 - 20 && var13 <= var134 + 20) {
                class30.method4702(var132, true, false);
                method2420(class308.field3889, class308.field3890, class308.field3891);
                method4519(6);
                return;
            }
            int var135 = field897 + 180;
            short var136 = 326;
            if (var11 == 1 && var12 >= var135 - 75 && var12 <= var135 + 75 && var13 >= var136 - 20 && var13 <= var136 + 20) {
                method2729(false);
            }
        } else if (field890 == 24) {
            int var137 = field897 + 180;
            short var138 = 301;
            if (var11 == 1 && var12 >= var137 - 75 && var12 <= var137 + 75 && var13 >= var138 - 20 && var13 <= var138 + 20) {
                method2422(false);
            }
        } else if (field890 == 26) {
            int var139 = field897 + 180 - 80;
            short var140 = 321;
            if (var11 == 1 && var12 >= var139 - 75 && var12 <= var139 + 75 && var13 >= var140 - 20 && var13 <= var140 + 20) {
                class30.method4702(client.method5515("secure", true) + "m=dob/set_dob.ws", true, false);
                method2420(class308.field3889, class308.field3890, class308.field3891);
                method4519(6);
                return;
            }
            int var141 = field897 + 180 + 80;
            if (var11 == 1 && var12 >= var141 - 75 && var12 <= var141 + 75 && var13 >= var140 - 20 && var13 <= var140 + 20) {
                method2729(true);
            }
        }
    }

    @ObfuscatedName("ly.w(B)Z")
    public static boolean method5474() {
        Date var0;
        try {
            var0 = method4202();
        } catch (ParseException var9) {
            method1788("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var0 == null) {
            return false;
        }
        Calendar var2 = Calendar.getInstance();
        var2.set(1, var2.get(1) - 13);
        var2.set(5, var2.get(5) + 1);
        var2.set(11, 0);
        var2.set(12, 0);
        var2.set(13, 0);
        var2.set(14, 0);
        Date var3 = var2.getTime();
        boolean var4 = var0.before(var3);
        Date var6 = method6219();
        boolean var7 = var0.after(var6);
        if (!var7) {
            method1788("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var4) {
            Statics.field1892 = (int) (var0.getTime() / 86400000L - 11745L);
        } else {
            Statics.field1892 = 8388607;
        }
        return true;
    }

    @ObfuscatedName("np.y(B)Ljava/util/Date;")
    public static Date method6219() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("bh.i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1788(String arg0, String arg1, String arg2) {
        method4519(7);
        method2420(arg0, arg1, arg2);
    }

    @ObfuscatedName("hb.s(S)Ljava/util/Date;")
    public static Date method4202() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field912;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method1788("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("dt.t(III)I")
    public static int method2623(int arg0, int arg1) {
        for (int var2 = 0; var2 < 8; var2++) {
            if (arg1 <= arg0 + 30) {
                return var2;
            }
            int var3 = arg0 + 30;
            arg0 = var3 + (var2 == 1 || var2 == 3 ? 20 : 5);
        }
        return 0;
    }

    @ObfuscatedName("ea.z(ZI)V")
    public static void method2729(boolean arg0) {
        if (Statics.field4220.method1030() || Statics.field4220.method1031()) {
            method4519(10);
            return;
        }
        field906 = class308.field3840;
        field907 = class308.field3802;
        field908 = class308.field3842;
        method4519(2);
        if (arg0) {
            field910 = "";
        }
        method281();
        method352();
    }

    @ObfuscatedName("cl.r(ZB)V")
    public static void method2422(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field109.method2158() >= client.field483;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field4220.method1030() || Statics.field4220.method1031()) {
            var1 = 10;
        }
        method4519(var1);
        if (arg0) {
            field909 = "";
            field910 = "";
            Statics.field2847 = 0;
            Statics.field782 = "";
        }
        method281();
        method352();
    }

    @ObfuscatedName("gr.u(Lmt;Lmt;Lmt;I)V")
    public static void method3293(class349 arg0, class349 arg1, class349 arg2) {
        field901 = (Statics.field976 - 765) / 2;
        field897 = field901 + 202;
        Statics.field158 = field897 + 180;
        if (field919) {
            if (Statics.field451 == null) {
                class313 var3 = Statics.field3608;
                int var4 = var3.method5349("sl_back");
                int var5 = var3.method5315(var4, "");
                class456[] var6 = class457.method6878(var3, var4, var5);
                Statics.field451 = var6;
            }
            if (Statics.field1561 == null) {
                class313 var7 = Statics.field3608;
                int var8 = var7.method5349("sl_flags");
                int var9 = var7.method5315(var8, "");
                class455[] var10 = class457.method2699(var7, var8, var9);
                Statics.field1561 = var10;
            }
            if (Statics.field805 == null) {
                class313 var11 = Statics.field3608;
                int var12 = var11.method5349("sl_arrows");
                int var13 = var11.method5315(var12, "");
                class455[] var14 = class457.method2699(var11, var12, var13);
                Statics.field805 = var14;
            }
            if (Statics.field2668 == null) {
                class313 var15 = Statics.field3608;
                int var16 = var15.method5349("sl_stars");
                int var17 = var15.method5315(var16, "");
                class455[] var18 = class457.method2699(var15, var16, var17);
                Statics.field2668 = var18;
            }
            if (Statics.field3158 == null) {
                Statics.field3158 = class457.method6791(Statics.field3608, "leftarrow", "");
            }
            if (Statics.field2612 == null) {
                Statics.field2612 = class457.method6791(Statics.field3608, "rightarrow", "");
            }
            class452.method7400(field901, 23, 765, 480, 0);
            class452.method7352(field901, 0, 125, 23, 12425273, 9135624);
            class452.method7352(field901 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5867(class308.field3792, field901 + 62, 15, 0, -1);
            if (Statics.field2668 != null) {
                Statics.field2668[1].method7431(field901 + 140, 1);
                arg1.method5806(class308.field3929, field901 + 152, 10, 16777215, -1);
                Statics.field2668[0].method7431(field901 + 140, 12);
                arg1.method5806(class308.field3621, field901 + 152, 21, 16777215, -1);
            }
            if (Statics.field805 != null) {
                int var19 = field901 + 280;
                if (class61.field788[0] == 0 && class61.field787[0] == 0) {
                    Statics.field805[2].method7431(var19, 4);
                } else {
                    Statics.field805[0].method7431(var19, 4);
                }
                if (class61.field788[0] == 0 && class61.field787[0] == 1) {
                    Statics.field805[3].method7431(var19 + 15, 4);
                } else {
                    Statics.field805[1].method7431(var19 + 15, 4);
                }
                arg0.method5806(class308.field3711, var19 + 32, 17, 16777215, -1);
                int var20 = field901 + 390;
                if (class61.field788[0] == 1 && class61.field787[0] == 0) {
                    Statics.field805[2].method7431(var20, 4);
                } else {
                    Statics.field805[0].method7431(var20, 4);
                }
                if (class61.field788[0] == 1 && class61.field787[0] == 1) {
                    Statics.field805[3].method7431(var20 + 15, 4);
                } else {
                    Statics.field805[1].method7431(var20 + 15, 4);
                }
                arg0.method5806(class308.field3932, var20 + 32, 17, 16777215, -1);
                int var21 = field901 + 500;
                if (class61.field788[0] == 2 && class61.field787[0] == 0) {
                    Statics.field805[2].method7431(var21, 4);
                } else {
                    Statics.field805[0].method7431(var21, 4);
                }
                if (class61.field788[0] == 2 && class61.field787[0] == 1) {
                    Statics.field805[3].method7431(var21 + 15, 4);
                } else {
                    Statics.field805[1].method7431(var21 + 15, 4);
                }
                arg0.method5806(class308.field3933, var21 + 32, 17, 16777215, -1);
                int var22 = field901 + 610;
                if (class61.field788[0] == 3 && class61.field787[0] == 0) {
                    Statics.field805[2].method7431(var22, 4);
                } else {
                    Statics.field805[0].method7431(var22, 4);
                }
                if (class61.field788[0] == 3 && class61.field787[0] == 1) {
                    Statics.field805[3].method7431(var22 + 15, 4);
                } else {
                    Statics.field805[1].method7431(var22 + 15, 4);
                }
                arg0.method5806(class308.field3934, var22 + 32, 17, 16777215, -1);
            }
            class452.method7400(field901 + 708, 4, 50, 16, 0);
            arg1.method5867(class308.field3743, field901 + 708 + 25, 16, 16777215, -1);
            field920 = -1;
            if (Statics.field451 != null) {
                byte var23 = 88;
                byte var24 = 19;
                int var25 = 765 / (var23 + 1) - 1;
                int var26 = 480 / (var24 + 1);
                int var27;
                int var28;
                do {
                    var27 = var26;
                    var28 = var25;
                    if ((var25 - 1) * var26 >= class61.field785) {
                        var25--;
                    }
                    if ((var26 - 1) * var25 >= class61.field785) {
                        var26--;
                    }
                    if ((var26 - 1) * var25 >= class61.field785) {
                        var26--;
                    }
                } while (var26 != var27 || var25 != var28);
                int var29 = (765 - var23 * var25) / (var25 + 1);
                if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = (480 - var24 * var26) / (var26 + 1);
                if (var30 > 5) {
                    var30 = 5;
                }
                int var31 = (765 - var23 * var25 - (var25 - 1) * var29) / 2;
                int var32 = (480 - var24 * var26 - (var26 - 1) * var30) / 2;
                int var33 = (class61.field785 + var26 - 1) / var26;
                field922 = var33 - var25;
                if (Statics.field3158 != null && field921 > 0) {
                    Statics.field3158.method7431(8, Statics.field1028 / 2 - Statics.field3158.field4790 / 2);
                }
                if (Statics.field2612 != null && field921 < field922) {
                    Statics.field2612.method7431(Statics.field976 - Statics.field2612.field4789 - 8, Statics.field1028 / 2 - Statics.field2612.field4790 / 2);
                }
                int var34 = var32 + 23;
                int var35 = field901 + var31;
                int var36 = 0;
                boolean var37 = false;
                int var38 = field921;
                for (int var39 = var26 * var38; var39 < class61.field785 && var38 - field921 < var25; var39++) {
                    class61 var40 = Statics.field4280[var39];
                    boolean var41 = true;
                    String var42 = Integer.toString(var40.field796);
                    if (var40.field796 == -1) {
                        var42 = class308.field3697;
                        var41 = false;
                    } else if (var40.field796 > 1980) {
                        var42 = class308.field3936;
                        var41 = false;
                    }
                    int var43 = 0;
                    byte var44;
                    if (var40.method1507()) {
                        if (var40.method1529()) {
                            var44 = 7;
                        } else {
                            var44 = 6;
                        }
                    } else if (var40.method1506()) {
                        var43 = 16711680;
                        if (var40.method1529()) {
                            var44 = 5;
                        } else {
                            var44 = 4;
                        }
                    } else if (var40.method1508()) {
                        if (var40.method1529()) {
                            var44 = 9;
                        } else {
                            var44 = 8;
                        }
                    } else if (var40.method1501()) {
                        if (var40.method1529()) {
                            var44 = 3;
                        } else {
                            var44 = 2;
                        }
                    } else if (var40.method1529()) {
                        var44 = 1;
                    } else {
                        var44 = 0;
                    }
                    if (class33.field223 >= var35 && class33.field225 >= var34 && class33.field223 < var23 + var35 && class33.field225 < var24 + var34 && var41) {
                        field920 = var39;
                        Statics.field451[var44].method7463(var35, var34, 128, 16777215);
                        var37 = true;
                    } else {
                        Statics.field451[var44].method7458(var35, var34);
                    }
                    if (Statics.field1561 != null) {
                        Statics.field1561[(var40.method1529() ? 8 : 0) + var40.field794].method7431(var35 + 29, var34);
                    }
                    arg0.method5867(Integer.toString(var40.field786), var35 + 15, var24 / 2 + var34 + 5, var43, -1);
                    arg1.method5867(var42, var35 + 60, var24 / 2 + var34 + 5, 268435455, -1);
                    var34 += var24 + var30;
                    var36++;
                    if (var36 >= var26) {
                        var34 = var32 + 23;
                        var35 += var23 + var29;
                        var36 = 0;
                        var38++;
                    }
                }
                if (var37) {
                    int var45 = arg1.method5800(Statics.field4280[field920].field793) + 6;
                    int var46 = arg1.field4182 + 8;
                    int var47 = class33.field225 + 25;
                    if (var46 + var47 > 480) {
                        var47 = class33.field225 - 25 - var46;
                    }
                    class452.method7400(class33.field223 - var45 / 2, var47, var45, var46, 16777120);
                    class452.method7355(class33.field223 - var45 / 2, var47, var45, var46, 0);
                    arg1.method5867(Statics.field4280[field920].field793, class33.field223, arg1.field4182 + var47 + 4, 0, -1);
                }
            }
            Statics.field458.method360(0, 0);
            return;
        }
        Statics.field92.method7458(field901, 0);
        Statics.field930.method7458(field901 + 382, 0);
        Statics.field902.method7431(field901 + 382 - Statics.field902.field4789 / 2, 18);
        if (client.field487 == 0 || client.field487 == 5) {
            byte var48 = 20;
            arg0.method5867(class308.field3839, field897 + 180, 245 - var48, 16777215, -1);
            int var49 = 253 - var48;
            class452.method7355(field897 + 180 - 152, var49, 304, 34, 9179409);
            class452.method7355(field897 + 180 - 151, var49 + 1, 302, 32, 0);
            class452.method7400(field897 + 180 - 150, var49 + 2, field904 * 3, 30, 9179409);
            class452.method7400(field904 * 3 + (field897 + 180 - 150), var49 + 2, 300 - field904 * 3, 30, 0);
            arg0.method5867(field899, field897 + 180, 276 - var48, 16777215, -1);
        }
        if (client.field487 == 20) {
            Statics.field10.method7431(field897 + 180 - Statics.field10.field4789 / 2, 271 - Statics.field10.field4790 / 2);
            short var50 = 201;
            arg0.method5867(field906, field897 + 180, var50, 16776960, 0);
            int var153 = var50 + 15;
            arg0.method5867(field907, field897 + 180, var153, 16776960, 0);
            int var154 = var153 + 15;
            arg0.method5867(field908, field897 + 180, var154, 16776960, 0);
            int var155 = var154 + 15;
            int var156 = var155 + 7;
            if (field890 != 4 && field890 != 10) {
                arg0.method5806(class308.field3867, field897 + 180 - 110, var156, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = method2689(); arg0.method5800(var52) > var51; var52 = var52.substring(0, var52.length() - 1)) {
                }
                arg0.method5806(class350.method5804(var52), field897 + 180 - 70, var156, 16777215, 0);
                var153 = var156 + 15;
                String var53;
                for (var53 = class343.method5395(field910); arg0.method5800(var53) > var51; var53 = var53.substring(1)) {
                }
                arg0.method5806(class308.field3868 + var53, field897 + 180 - 108, var153, 16777215, 0);
                var153 += 15;
            }
        }
        if (client.field487 == 10 || client.field487 == 11 || client.field487 == 50) {
            Statics.field10.method7431(field897, 171);
            if (field890 == 0) {
                short var54 = 251;
                arg0.method5867(class308.field3780, field897 + 180, var54, 16776960, 0);
                int var157 = var54 + 30;
                int var55 = field897 + 180 - 80;
                short var56 = 291;
                Statics.field19.method7431(var55 - 73, var56 - 20);
                arg0.method5810(class308.field3637, var55 - 73, var56 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var57 = field897 + 180 + 80;
                Statics.field19.method7431(var57 - 73, var56 - 20);
                arg0.method5810(class308.field3872, var57 - 73, var56 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field890 == 1) {
                arg0.method5867(field905, field897 + 180, 201, 16776960, 0);
                short var58 = 236;
                arg0.method5867(field906, field897 + 180, var58, 16777215, 0);
                int var158 = var58 + 15;
                arg0.method5867(field907, field897 + 180, var158, 16777215, 0);
                int var159 = var158 + 15;
                arg0.method5867(field908, field897 + 180, var159, 16777215, 0);
                int var160 = var159 + 15;
                int var59 = field897 + 180 - 80;
                short var60 = 321;
                Statics.field19.method7431(var59 - 73, var60 - 20);
                arg0.method5867(class308.field3622, var59, var60 + 5, 16777215, 0);
                int var61 = field897 + 180 + 80;
                Statics.field19.method7431(var61 - 73, var60 - 20);
                arg0.method5867(class308.field3743, var61, var60 + 5, 16777215, 0);
            } else if (field890 == 2) {
                short var62 = 201;
                arg0.method5867(field906, Statics.field158, var62, 16776960, 0);
                int var161 = var62 + 15;
                arg0.method5867(field907, Statics.field158, var161, 16776960, 0);
                int var162 = var161 + 15;
                arg0.method5867(field908, Statics.field158, var162, 16776960, 0);
                int var163 = var162 + 15;
                int var164 = var163 + 7;
                arg0.method5806(class308.field3867, Statics.field158 - 110, var164, 16777215, 0);
                short var63 = 200;
                String var64;
                for (var64 = method2689(); arg0.method5800(var64) > var63; var64 = var64.substring(1)) {
                }
                arg0.method5806(class350.method5804(var64) + (field916 == 0 & client.field552 % 40 < 20 ? class93.method2668(16776960) + class93.field1273 : ""), Statics.field158 - 70, var164, 16777215, 0);
                var161 = var164 + 15;
                String var65;
                for (var65 = class343.method5395(field910); arg0.method5800(var65) > var63; var65 = var65.substring(1)) {
                }
                arg0.method5806(class308.field3868 + var65 + (field916 == 1 & client.field552 % 40 < 20 ? class93.method2668(16776960) + class93.field1273 : ""), Statics.field158 - 108, var161, 16777215, 0);
                var161 += 15;
                short var66 = 277;
                int var67 = Statics.field158 + -117;
                boolean var68 = client.field529;
                boolean var69 = field913;
                class455 var70 = var68 ? (var69 ? Statics.field980 : Statics.field2760) : (var69 ? Statics.field1428 : Statics.field4158);
                var70.method7431(var67, var66);
                int var72 = var70.field4789 + 5 + var67;
                arg1.method5806(class308.field3875, var72, var66 + 13, 16776960, 0);
                int var73 = Statics.field158 + 24;
                boolean var74 = Statics.field109.method2139();
                boolean var75 = field914;
                class455 var76 = var74 ? (var75 ? Statics.field980 : Statics.field2760) : (var75 ? Statics.field1428 : Statics.field4158);
                var76.method7431(var73, var66);
                int var78 = var76.field4789 + 5 + var73;
                arg1.method5806(class308.field3672, var78, var66 + 13, 16776960, 0);
                int var165 = var66 + 15;
                int var79 = Statics.field158 - 80;
                short var80 = 321;
                Statics.field19.method7431(var79 - 73, var80 - 20);
                arg0.method5867(class308.field3873, var79, var80 + 5, 16777215, 0);
                int var81 = Statics.field158 + 80;
                Statics.field19.method7431(var81 - 73, var80 - 20);
                arg0.method5867(class308.field3743, var81, var80 + 5, 16777215, 0);
                short var82 = 357;
                switch(field903) {
                    case 2:
                        Statics.field1300 = class308.field3888;
                        break;
                    default:
                        Statics.field1300 = class308.field3886;
                }
                Statics.field1023 = new class384(Statics.field158, var82, arg1.method5800(Statics.field1300), 11);
                Statics.field295 = new class384(Statics.field158, var82, arg1.method5800(class308.field3887), 11);
                arg1.method5867(Statics.field1300, Statics.field158, var82, 16777215, 0);
            } else if (field890 == 3) {
                short var83 = 201;
                arg0.method5867(class308.field3877, field897 + 180, var83, 16776960, 0);
                int var166 = var83 + 20;
                arg1.method5867(class308.field3878, field897 + 180, var166, 16776960, 0);
                int var167 = var166 + 15;
                arg1.method5867(class308.field3879, field897 + 180, var167, 16776960, 0);
                int var168 = var167 + 15;
                int var84 = field897 + 180;
                short var85 = 276;
                Statics.field19.method7431(var84 - 73, var85 - 20);
                arg2.method5867(class308.field3880, var84, var85 + 5, 16777215, 0);
                int var86 = field897 + 180;
                short var87 = 326;
                Statics.field19.method7431(var86 - 73, var87 - 20);
                arg2.method5867(class308.field3881, var86, var87 + 5, 16777215, 0);
            } else if (field890 == 4) {
                arg0.method5867(class308.field3647, field897 + 180, 201, 16776960, 0);
                short var88 = 236;
                arg0.method5867(field906, field897 + 180, var88, 16777215, 0);
                int var169 = var88 + 15;
                arg0.method5867(field907, field897 + 180, var169, 16777215, 0);
                int var170 = var169 + 15;
                arg0.method5867(field908, field897 + 180, var170, 16777215, 0);
                int var171 = var170 + 15;
                arg0.method5806(class308.field3677 + class343.method5395(Statics.field782) + (client.field552 % 40 < 20 ? class93.method2668(16776960) + class93.field1273 : ""), field897 + 180 - 108, var171, 16777215, 0);
                int var172 = var171 - 8;
                arg0.method5806(class308.field3625, field897 + 180 - 9, var172, 16776960, 0);
                int var173 = var172 + 15;
                arg0.method5806(class308.field3809, field897 + 180 - 9, var173, 16776960, 0);
                int var89 = field897 + 180 - 9 + arg0.method5800(class308.field3809) + 15;
                int var90 = var173 - arg0.field4182;
                class455 var91;
                if (field896) {
                    var91 = Statics.field2760;
                } else {
                    var91 = Statics.field4158;
                }
                var91.method7431(var89, var90);
                var169 = var173 + 15;
                int var92 = field897 + 180 - 80;
                short var93 = 321;
                Statics.field19.method7431(var92 - 73, var93 - 20);
                arg0.method5867(class308.field3622, var92, var93 + 5, 16777215, 0);
                int var94 = field897 + 180 + 80;
                Statics.field19.method7431(var94 - 73, var93 - 20);
                arg0.method5867(class308.field3743, var94, var93 + 5, 16777215, 0);
                arg1.method5867(class308.field3698, field897 + 180, var93 + 36, 255, 0);
            } else if (field890 == 5) {
                arg0.method5867(class308.field3689, field897 + 180, 201, 16776960, 0);
                short var95 = 221;
                arg2.method5867(field906, field897 + 180, var95, 16776960, 0);
                int var174 = var95 + 15;
                arg2.method5867(field907, field897 + 180, var174, 16776960, 0);
                int var175 = var174 + 15;
                arg2.method5867(field908, field897 + 180, var175, 16776960, 0);
                int var176 = var175 + 15;
                int var177 = var176 + 14;
                arg0.method5806(class308.field3883, field897 + 180 - 145, var177, 16777215, 0);
                short var96 = 174;
                String var97;
                for (var97 = method2689(); arg0.method5800(var97) > var96; var97 = var97.substring(1)) {
                }
                arg0.method5806(class350.method5804(var97) + (client.field552 % 40 < 20 ? class93.method2668(16776960) + class93.field1273 : ""), field897 + 180 - 34, var177, 16777215, 0);
                var174 = var177 + 15;
                int var98 = field897 + 180 - 80;
                short var99 = 321;
                Statics.field19.method7431(var98 - 73, var99 - 20);
                arg0.method5867(class308.field3884, var98, var99 + 5, 16777215, 0);
                int var100 = field897 + 180 + 80;
                Statics.field19.method7431(var100 - 73, var99 - 20);
                arg0.method5867(class308.field3736, var100, var99 + 5, 16777215, 0);
                short var101 = 356;
                arg1.method5867(class308.field3887, Statics.field158, var101, 268435455, 0);
            } else if (field890 == 6) {
                short var102 = 201;
                arg0.method5867(field906, field897 + 180, var102, 16776960, 0);
                int var178 = var102 + 15;
                arg0.method5867(field907, field897 + 180, var178, 16776960, 0);
                int var179 = var178 + 15;
                arg0.method5867(field908, field897 + 180, var179, 16776960, 0);
                int var180 = var179 + 15;
                int var103 = field897 + 180;
                short var104 = 321;
                Statics.field19.method7431(var103 - 73, var104 - 20);
                arg0.method5867(class308.field3736, var103, var104 + 5, 16777215, 0);
            } else if (field890 == 7) {
                if (Statics.field1822 && !client.field578) {
                    short var105 = 201;
                    arg0.method5867(field906, Statics.field158, var105, 16776960, 0);
                    int var181 = var105 + 15;
                    arg0.method5867(field907, Statics.field158, var181, 16776960, 0);
                    int var182 = var181 + 15;
                    arg0.method5867(field908, Statics.field158, var182, 16776960, 0);
                    int var106 = Statics.field158 - 150;
                    int var183 = var182 + 10;
                    for (int var107 = 0; var107 < 8; var107++) {
                        Statics.field19.method7433(var106, var183, 30, 40);
                        boolean var108 = field911 == var107 & client.field552 % 40 < 20;
                        arg0.method5806((field912[var107] == null ? "" : field912[var107]) + (var108 ? class93.method2668(16776960) + class93.field1273 : ""), var106 + 10, var183 + 27, 16777215, 0);
                        if (var107 == 1 || var107 == 3) {
                            var106 += 50;
                            arg0.method5806(class350.method5804("/"), var106 - 13, var183 + 27, 16777215, 0);
                        } else {
                            var106 += 35;
                        }
                    }
                    int var109 = Statics.field158 - 80;
                    short var110 = 321;
                    Statics.field19.method7431(var109 - 73, var110 - 20);
                    arg0.method5867("Submit", var109, var110 + 5, 16777215, 0);
                    int var111 = Statics.field158 + 80;
                    Statics.field19.method7431(var111 - 73, var110 - 20);
                    arg0.method5867(class308.field3743, var111, var110 + 5, 16777215, 0);
                } else {
                    short var112 = 216;
                    arg0.method5867(class308.field3896, field897 + 180, var112, 16776960, 0);
                    int var184 = var112 + 15;
                    arg2.method5867(class308.field3644, field897 + 180, var184, 16776960, 0);
                    int var185 = var184 + 15;
                    arg2.method5867(class308.field3857, field897 + 180, var185, 16776960, 0);
                    int var186 = var185 + 15;
                    int var113 = field897 + 180 - 80;
                    short var114 = 321;
                    Statics.field19.method7431(var113 - 73, var114 - 20);
                    arg0.method5867(class308.field3640, var113, var114 + 5, 16777215, 0);
                    int var115 = field897 + 180 + 80;
                    Statics.field19.method7431(var115 - 73, var114 - 20);
                    arg0.method5867(class308.field3736, var115, var114 + 5, 16777215, 0);
                }
            } else if (field890 == 8) {
                short var116 = 216;
                arg0.method5867(class308.field3676, field897 + 180, var116, 16776960, 0);
                int var187 = var116 + 15;
                arg2.method5867(class308.field3755, field897 + 180, var187, 16776960, 0);
                int var188 = var187 + 15;
                arg2.method5867(class308.field3756, field897 + 180, var188, 16776960, 0);
                int var189 = var188 + 15;
                int var117 = field897 + 180 - 80;
                short var118 = 321;
                Statics.field19.method7431(var117 - 73, var118 - 20);
                arg0.method5867(class308.field3757, var117, var118 + 5, 16777215, 0);
                int var119 = field897 + 180 + 80;
                Statics.field19.method7431(var119 - 73, var118 - 20);
                arg0.method5867(class308.field3736, var119, var118 + 5, 16777215, 0);
            } else if (field890 == 9) {
                short var120 = 221;
                arg0.method5867(field906, field897 + 180, var120, 16776960, 0);
                int var190 = var120 + 25;
                arg0.method5867(field907, field897 + 180, var190, 16776960, 0);
                int var191 = var190 + 25;
                arg0.method5867(field908, field897 + 180, var191, 16776960, 0);
                int var121 = field897 + 180;
                short var122 = 311;
                Statics.field19.method7431(var121 - 73, var122 - 20);
                arg0.method5867(class308.field3880, var121, var122 + 5, 16777215, 0);
            } else if (field890 == 10) {
                int var123 = field897 + 180;
                short var124 = 209;
                arg0.method5867(class308.field3780, field897 + 180, var124, 16776960, 0);
                int var192 = var124 + 20;
                Statics.field915.method7431(var123 - 109, var192);
                Statics.field4285.method7431(var123 - 48, var192 + 18);
            } else if (field890 == 12) {
                int var125 = Statics.field158;
                short var126 = 216;
                arg2.method5867(class308.field3920, var125, var126, 16777215, 0);
                int var193 = var126 + 17;
                arg2.method5867(class308.field3921, var125, var193, 16777215, 0);
                int var194 = var193 + 17;
                arg2.method5867(class308.field3922, var125, var194, 16777215, 0);
                int var195 = var194 + 17;
                arg2.method5867(class308.field3915, var125, var195, 16777215, 0);
                int var127 = Statics.field158 - 80;
                short var128 = 311;
                Statics.field19.method7431(var127 - 73, var128 - 20);
                arg0.method5867(class308.field3779, var127, var128 + 5, 16777215, 0);
                int var129 = Statics.field158 + 80;
                Statics.field19.method7431(var129 - 73, var128 - 20);
                arg0.method5867(class308.field3935, var129, var128 + 5, 16777215, 0);
            } else if (field890 == 13) {
                short var130 = 231;
                arg2.method5867(class308.field3924, field897 + 180, var130, 16777215, 0);
                int var196 = var130 + 20;
                arg2.method5867(class308.field3925, field897 + 180, var196, 16777215, 0);
                int var131 = field897 + 180;
                short var132 = 311;
                Statics.field19.method7431(var131 - 73, var132 - 20);
                arg0.method5867(class308.field3736, var131, var132 + 5, 16777215, 0);
            } else if (field890 == 14) {
                short var133 = 201;
                String var134 = "";
                String var135 = "";
                String var136 = "";
                switch(field898) {
                    case 0:
                        var134 = class308.field3670;
                        var135 = class308.field3671;
                        var136 = class308.field3870;
                        break;
                    case 1:
                        var134 = class308.field3709;
                        var135 = class308.field3710;
                        var136 = class308.field3641;
                        break;
                    default:
                        method2729(false);
                }
                arg0.method5867(var134, field897 + 180, var133, 16776960, 0);
                int var197 = var133 + 15;
                arg2.method5867(var135, field897 + 180, var197, 16776960, 0);
                int var198 = var197 + 15;
                arg2.method5867(var136, field897 + 180, var198, 16776960, 0);
                int var199 = var198 + 15;
                int var137 = field897 + 180;
                short var138 = 276;
                Statics.field19.method7431(var137 - 73, var138 - 20);
                arg0.method5867(class308.field3816, var137, var138 + 5, 16777215, 0);
                int var139 = field897 + 180;
                short var140 = 326;
                Statics.field19.method7431(var139 - 73, var140 - 20);
                arg0.method5867(class308.field3736, var139, var140 + 5, 16777215, 0);
            } else if (field890 == 24) {
                short var141 = 221;
                arg0.method5867(field906, field897 + 180, var141, 16777215, 0);
                int var200 = var141 + 15;
                arg0.method5867(field907, field897 + 180, var200, 16777215, 0);
                int var201 = var200 + 15;
                arg0.method5867(field908, field897 + 180, var201, 16777215, 0);
                int var202 = var201 + 15;
                int var142 = field897 + 180;
                short var143 = 301;
                Statics.field19.method7431(var142 - 73, var143 - 20);
                arg0.method5867(class308.field3620, var142, var143 + 5, 16777215, 0);
            } else if (field890 == 26) {
                short var144 = 216;
                arg0.method5867(class308.field3896, field897 + 180, var144, 16776960, 0);
                int var203 = var144 + 15;
                arg2.method5867(class308.field3644, field897 + 180, var203, 16776960, 0);
                int var204 = var203 + 15;
                arg2.method5867(class308.field3857, field897 + 180, var204, 16776960, 0);
                int var205 = var204 + 15;
                int var145 = field897 + 180 - 80;
                short var146 = 321;
                Statics.field19.method7431(var145 - 73, var146 - 20);
                arg0.method5867(class308.field3640, var145, var146 + 5, 16777215, 0);
                int var147 = field897 + 180 + 80;
                Statics.field19.method7431(var147 - 73, var146 - 20);
                arg0.method5867(class308.field3736, var147, var146 + 5, 16777215, 0);
            }
        }
        if (client.field487 >= 10) {
            int[] var148 = new int[4];
            class452.method7407(var148);
            class452.method7402(field901, 0, field901 + 765, Statics.field1028);
            Statics.field895.method2102(field901 - 22, client.field552);
            Statics.field895.method2102(field901 + 765 + 22 - 128, client.field552);
            class452.method7340(var148);
        }
        Statics.field1675[Statics.field109.method2209() ? 1 : 0].method7431(field901 + 765 - 40, 463);
        if (client.field487 <= 5 || Statics.field1604 != class330.field4093) {
            return;
        }
        if (Statics.field1386 == null) {
            Statics.field1386 = class457.method6791(Statics.field3608, "sl_button", "");
            return;
        }
        int var149 = field901 + 5;
        short var150 = 463;
        byte var151 = 100;
        byte var152 = 35;
        Statics.field1386.method7431(var149, var150);
        arg0.method5867(class308.field3794 + " " + client.field697, var151 / 2 + var149, var152 / 2 + var150 - 2, 16777215, 0);
        if (Statics.field1893 == null) {
            arg1.method5867(class308.field3838, var151 / 2 + var149, var152 / 2 + var150 + 12, 16777215, 0);
        } else {
            arg1.method5867(class308.field3937, var151 / 2 + var149, var152 / 2 + var150 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("cl.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2420(String arg0, String arg1, String arg2) {
        field906 = arg0;
        field907 = arg1;
        field908 = arg2;
    }

    @ObfuscatedName("ee.h(Lap;S)V")
    public static void method2866(class32 arg0) {
        while (class24.method235()) {
            if (Statics.field3197 == 13) {
                method1926();
                return;
            }
            if (Statics.field3197 == 96) {
                if (field921 > 0 && Statics.field3158 != null) {
                    field921--;
                }
            } else if (Statics.field3197 == 97 && field921 < field922 && Statics.field2612 != null) {
                field921++;
            }
        }
        if (class33.field231 != 1 && Statics.field1528 || class33.field231 != 4) {
            return;
        }
        int var1 = field901 + 280;
        if (class33.field232 >= var1 && class33.field232 <= var1 + 14 && class33.field233 >= 4 && class33.field233 <= 18) {
            class61.method572(0, 0);
            return;
        }
        if (class33.field232 >= var1 + 15 && class33.field232 <= var1 + 80 && class33.field233 >= 4 && class33.field233 <= 18) {
            class61.method572(0, 1);
            return;
        }
        int var2 = field901 + 390;
        if (class33.field232 >= var2 && class33.field232 <= var2 + 14 && class33.field233 >= 4 && class33.field233 <= 18) {
            class61.method572(1, 0);
            return;
        }
        if (class33.field232 >= var2 + 15 && class33.field232 <= var2 + 80 && class33.field233 >= 4 && class33.field233 <= 18) {
            class61.method572(1, 1);
            return;
        }
        int var3 = field901 + 500;
        if (class33.field232 >= var3 && class33.field232 <= var3 + 14 && class33.field233 >= 4 && class33.field233 <= 18) {
            class61.method572(2, 0);
            return;
        }
        if (class33.field232 >= var3 + 15 && class33.field232 <= var3 + 80 && class33.field233 >= 4 && class33.field233 <= 18) {
            class61.method572(2, 1);
            return;
        }
        int var4 = field901 + 610;
        if (class33.field232 >= var4 && class33.field232 <= var4 + 14 && class33.field233 >= 4 && class33.field233 <= 18) {
            class61.method572(3, 0);
            return;
        }
        if (class33.field232 >= var4 + 15 && class33.field232 <= var4 + 80 && class33.field233 >= 4 && class33.field233 <= 18) {
            class61.method572(3, 1);
            return;
        }
        if (class33.field232 >= field901 + 708 && class33.field233 >= 4 && class33.field232 <= field901 + 708 + 50 && class33.field233 <= 20) {
            method1926();
            return;
        }
        if (field920 != -1) {
            class61 var5 = Statics.field4280[field920];
            method5209(var5);
            method1926();
            return;
        }
        if (field921 > 0 && Statics.field3158 != null && class33.field232 >= 0 && class33.field232 <= Statics.field3158.field4789 && class33.field233 >= Statics.field1028 / 2 - 50 && class33.field233 <= Statics.field1028 / 2 + 50) {
            field921--;
        }
        if (field921 < field922 && Statics.field2612 != null && class33.field232 >= Statics.field976 - Statics.field2612.field4789 - 5 && class33.field232 <= Statics.field976 && class33.field233 >= Statics.field1028 / 2 - 50 && class33.field233 <= Statics.field1028 / 2 + 50) {
            field921++;
        }
    }

    @ObfuscatedName("kh.x(Lbc;I)V")
    public static void method5209(class61 arg0) {
        if (arg0.method1529() != client.field480) {
            client.field480 = arg0.method1529();
            class188.method1026(arg0.method1529());
        }
        if (client.field478 != arg0.field790) {
            Statics.method712(Statics.field3608, arg0.field790);
        }
        Statics.field2011 = arg0.field792;
        client.field697 = arg0.field786;
        client.field478 = arg0.field790;
        Statics.field2288 = client.field479 == 0 ? 43594 : arg0.field786 + 40000;
        Statics.field103 = client.field479 == 0 ? 443 : arg0.field786 + 50000;
        Statics.field518 = Statics.field2288;
    }

    @ObfuscatedName("dq.l(I)V")
    public static void method2608() {
        if (Statics.method2731()) {
            field919 = true;
            field921 = 0;
            field922 = 0;
        }
    }

    @ObfuscatedName("bm.a(B)V")
    public static void method1926() {
        field919 = false;
        Statics.field92.method7458(field901, 0);
        Statics.field930.method7458(field901 + 382, 0);
        Statics.field902.method7431(field901 + 382 - Statics.field902.field4789 / 2, 18);
    }

    @ObfuscatedName("ho.p(II)V")
    public static void method4519(int arg0) {
        if (field890 != arg0) {
            field890 = arg0;
        }
    }
}
