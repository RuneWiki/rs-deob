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
import java.util.Random;

@ObfuscatedName("ca")
public class class95 {

    @ObfuscatedName("ca.q")
    public static int field1203 = 0;

    @ObfuscatedName("ca.e")
    public static int field1218 = field1203 + 202;

    @ObfuscatedName("ca.t")
    public static int field1211 = 10;

    @ObfuscatedName("ca.x")
    public static String field1234 = "";

    @ObfuscatedName("ca.ae")
    public static int field1213 = -1;

    @ObfuscatedName("ca.ab")
    public static int field1214 = 1;

    @ObfuscatedName("ca.as")
    public static int field1215 = 0;

    @ObfuscatedName("ca.ar")
    public static String field1216 = "";

    @ObfuscatedName("ca.ap")
    public static String field1217 = "";

    @ObfuscatedName("ca.al")
    public static String field1235 = "";

    @ObfuscatedName("ca.an")
    public static String field1223 = "";

    @ObfuscatedName("ca.ac")
    public static String field1222 = "";

    @ObfuscatedName("ca.av")
    public static String field1221 = "";

    @ObfuscatedName("ca.ay")
    public static boolean field1210 = false;

    @ObfuscatedName("ca.au")
    public static boolean field1232 = false;

    @ObfuscatedName("ca.bh")
    public static boolean field1224 = true;

    @ObfuscatedName("ca.bg")
    public static int field1225 = 0;

    @ObfuscatedName("ca.be")
    public static String field1226 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ca.bf")
    public static String field1227 = "1234567890";

    @ObfuscatedName("ca.bd")
    public static boolean field1228 = false;

    @ObfuscatedName("ca.bm")
    public static int field1229 = -1;

    @ObfuscatedName("ca.bl")
    public static int field1230 = 0;

    @ObfuscatedName("ca.bv")
    public static int field1231 = 0;

    @ObfuscatedName("ca.bz")
    public static long field1205;

    @ObfuscatedName("ca.bu")
    public static long field1212;

    static {
        new DecimalFormat("##0.00");
        new class172();
        field1205 = -1L;
        field1212 = -1L;
    }

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ip.m(Lic;Lic;I)I")
    public static int method4011(class244 arg0, class244 arg1) {
        int var2 = 0;
        if (arg0.method3939("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3939("logo", "")) {
            var2++;
        }
        if (arg1.method3939("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3939("logo_seasonal_mode", "")) {
            var2++;
        }
        if (arg1.method3939("titlebox", "")) {
            var2++;
        }
        if (arg1.method3939("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3939("runes", "")) {
            var2++;
        }
        if (arg1.method3939("title_mute", "")) {
            var2++;
        }
        if (arg1.method3939("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3939("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method3939("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method3939("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method3939("sl_back", "");
        arg1.method3939("sl_flags", "");
        arg1.method3939("sl_arrows", "");
        arg1.method3939("sl_stars", "");
        arg1.method3939("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ap.o(Lic;Lic;ZIB)V")
    public static void method464(class244 arg0, class244 arg1, boolean arg2, int arg3) {
        if (!Statics.field104) {
            field1215 = arg3;
            class331.method5682();
            byte[] var4 = arg0.method3951("title.jpg", "");
            Statics.field1209 = class59.method4183(var4);
            Statics.field565 = Statics.field1209.method5790();
            if ((client.field864 & 0x20000000) != 0) {
                Statics.field1220 = class336.method5674(arg1, "logo_deadman_mode", "");
            } else if ((client.field864 & 0x40000000) == 0) {
                Statics.field1220 = class336.method5674(arg1, "logo", "");
            } else {
                Statics.field1220 = class336.method5674(arg1, "logo_seasonal_mode", "");
            }
            Statics.field1148 = class336.method5674(arg1, "titlebox", "");
            Statics.field3694 = class336.method5674(arg1, "titlebutton", "");
            Statics.field1204 = class336.method1615(arg1, "runes", "");
            Statics.field1490 = class336.method1615(arg1, "title_mute", "");
            Statics.field1207 = class336.method5674(arg1, "options_radio_buttons,0", "");
            Statics.field3913 = class336.method5674(arg1, "options_radio_buttons,4", "");
            Statics.field497 = class336.method5674(arg1, "options_radio_buttons,2", "");
            Statics.field598 = class336.method5674(arg1, "options_radio_buttons,6", "");
            Statics.field607 = Statics.field1207.field3886;
            Statics.field1827 = Statics.field1207.field3888;
            Statics.field1208 = new class82(Statics.field1204);
            if (arg2) {
                field1222 = "";
                field1221 = "";
            }
            Statics.field265 = 0;
            Statics.field3621 = "";
            field1224 = true;
            field1228 = false;
            if (Statics.field2108.field1078) {
                class207.field2440 = 1;
                Statics.field2544 = null;
                Statics.field2437 = -1;
                Statics.field2040 = -1;
                Statics.field2442 = 0;
                Statics.field3914 = false;
                Statics.field2443 = 2;
            } else {
                class207.method277(2, Statics.field2005, "scape main", "", 255, false);
            }
            class247.method547(false);
            Statics.field104 = true;
            field1203 = (Statics.field1299 - 765) / 2;
            field1218 = field1203 + 202;
            Statics.field1219 = field1218 + 180;
            Statics.field1209.method5799(field1203, 0);
            Statics.field565.method5799(field1203 + 382, 0);
            Statics.field1220.method5771(field1203 + 382 - Statics.field1220.field3886 / 2, 18);
        } else if (arg3 == 4) {
            field1215 = 4;
        }
    }

    @ObfuscatedName("ed.q(I)Ljava/lang/String;")
    public static String method3096() {
        return Statics.field2108.field1084 ? Statics.method536(field1222) : field1222;
    }

    @ObfuscatedName("x.j(I)V")
    public static void method196() {
        if (client.field711 && field1222 != null && field1222.length() > 0) {
            field1225 = 1;
        } else {
            field1225 = 0;
        }
    }

    @ObfuscatedName("s.p(Lbn;I)V")
    public static void method125(class63 arg0) {
        if (field1228) {
            method1339(arg0);
            return;
        }
        if ((class64.field515 == 1 || !Statics.field556 && class64.field515 == 4) && class64.field505 >= field1203 + 765 - 50 && class64.field504 >= 453) {
            Statics.field2108.field1078 = !Statics.field2108.field1078;
            class83.method3709();
            if (Statics.field2108.field1078) {
                class207.method1954();
            } else {
                class207.method556(Statics.field2005, "scape main", "", 255, false);
            }
        }
        if (client.field714 == 5) {
            return;
        }
        if (field1205 == -1L) {
            field1205 = class307.method3253() + 1000L;
        }
        long var1 = class307.method3253();
        boolean var3;
        if (client.field865 == null || client.field945 >= client.field865.size()) {
            var3 = true;
        } else {
            while (true) {
                if (client.field945 >= client.field865.size()) {
                    var3 = true;
                    break;
                }
                class68 var4 = (class68) client.field865.get(client.field945);
                if (!var4.method1040()) {
                    var3 = false;
                    break;
                }
                client.field945++;
            }
        }
        if (var3 && field1212 == -1L) {
            field1212 = var1;
            if (field1212 > field1205) {
                field1205 = field1212;
            }
        }
        if (client.field714 != 10 && client.field714 != 11) {
            return;
        }
        if (Statics.field1992 == class200.field2386) {
            if (class64.field515 == 1 || !Statics.field556 && class64.field515 == 4) {
                int var5 = field1203 + 5;
                short var6 = 463;
                byte var7 = 100;
                byte var8 = 35;
                if (class64.field505 >= var5 && class64.field505 <= var5 + var7 && class64.field504 >= var6 && class64.field504 <= var6 + var8) {
                    Statics.method514();
                    return;
                }
            }
            if (Statics.field1783 != null) {
                Statics.method514();
            }
        }
        int var9 = class64.field515;
        int var10 = class64.field505;
        int var11 = class64.field504;
        if (var9 == 0) {
            var10 = class64.field508;
            var11 = class64.field498;
        }
        if (!Statics.field556 && var9 == 4) {
            var9 = 1;
        }
        if (field1215 == 0) {
            boolean var12 = false;
            while (class55.method610()) {
                if (Statics.field547 == 84) {
                    var12 = true;
                }
            }
            int var13 = Statics.field1219 - 80;
            short var14 = 291;
            if (var9 == 1 && var10 >= var13 - 75 && var10 <= var13 + 75 && var11 >= var14 - 20 && var11 <= var14 + 20) {
                class61.method279(client.method4238("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var15 = Statics.field1219 + 80;
            if (var9 == 1 && var10 >= var15 - 75 && var10 <= var15 + 75 && var11 >= var14 - 20 && var11 <= var14 + 20 || var12) {
                if ((client.field864 & 0x2000000) != 0) {
                    field1216 = "";
                    field1217 = class234.field3019;
                    field1235 = class234.field3020;
                    field1223 = class234.field3017;
                    field1215 = 1;
                    method196();
                } else if ((client.field864 & 0x4) != 0) {
                    if ((client.field864 & 0x400) == 0) {
                        field1217 = class234.field3074;
                        field1235 = class234.field3011;
                        field1223 = class234.field3012;
                    } else {
                        field1217 = class234.field2794;
                        field1235 = class234.field2856;
                        field1223 = class234.field2972;
                    }
                    field1216 = class234.field3009;
                    field1215 = 1;
                    method196();
                } else if ((client.field864 & 0x400) == 0) {
                    method308(false);
                } else {
                    field1217 = class234.field3013;
                    field1235 = class234.field2819;
                    field1223 = class234.field2791;
                    field1216 = class234.field3009;
                    field1215 = 1;
                    method196();
                }
            }
        } else if (field1215 == 1) {
            while (true) {
                if (!class55.method610()) {
                    int var16 = Statics.field1219 - 80;
                    short var17 = 321;
                    if (var9 == 1 && var10 >= var16 - 75 && var10 <= var16 + 75 && var11 >= var17 - 20 && var11 <= var17 + 20) {
                        method308(false);
                    }
                    int var18 = Statics.field1219 + 80;
                    if (var9 == 1 && var10 >= var18 - 75 && var10 <= var18 + 75 && var11 >= var17 - 20 && var11 <= var17 + 20) {
                        field1215 = 0;
                    }
                    break;
                }
                if (Statics.field547 == 84) {
                    method308(false);
                } else if (Statics.field547 == 13) {
                    field1215 = 0;
                }
            }
        } else if (field1215 == 2) {
            short var19 = 201;
            int var69 = var19 + 52;
            if (var9 == 1 && var11 >= var69 - 12 && var11 < var69 + 2) {
                field1225 = 0;
            }
            var69 += 15;
            if (var9 == 1 && var11 >= var69 - 12 && var11 < var69 + 2) {
                field1225 = 1;
            }
            var69 += 15;
            short var20 = 361;
            if (Statics.field568 != null) {
                int var21 = Statics.field568.field3867 / 2;
                if (var9 == 1 && var10 >= Statics.field568.field3866 - var21 && var10 <= Statics.field568.field3866 + var21 && var11 >= var20 - 15 && var11 < var20) {
                    switch(field1214) {
                        case 1:
                            method3662(class234.field3058, class234.field3059, class234.field3060);
                            field1215 = 5;
                            return;
                        case 2:
                            class61.method279("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var22 = Statics.field1219 - 80;
            short var23 = 321;
            if (var9 == 1 && var10 >= var22 - 75 && var10 <= var22 + 75 && var11 >= var23 - 20 && var11 <= var23 + 20) {
                field1222 = field1222.trim();
                if (field1222.length() == 0) {
                    method3662(class234.field3045, class234.field2795, class234.field2913);
                    return;
                }
                if (field1221.length() == 0) {
                    method3662(class234.field2914, class234.field2915, class234.field2916);
                    return;
                }
                method3662(class234.field3024, class234.field3025, class234.field3026);
                client.method4537(false);
                client.method1727(20);
                return;
            }
            int var24 = field1218 + 180 + 80;
            if (var9 == 1 && var10 >= var24 - 75 && var10 <= var24 + 75 && var11 >= var23 - 20 && var11 <= var23 + 20) {
                field1215 = 0;
                field1222 = "";
                field1221 = "";
                Statics.field265 = 0;
                Statics.field3621 = "";
                field1224 = true;
            }
            int var25 = Statics.field1219 + -117;
            short var26 = 277;
            field1210 = var10 >= var25 && var10 < Statics.field607 + var25 && var11 >= var26 && var11 < Statics.field1827 + var26;
            if (var9 == 1 && field1210) {
                client.field711 = !client.field711;
                if (!client.field711 && Statics.field2108.field1083 != null) {
                    Statics.field2108.field1083 = null;
                    class83.method3709();
                }
            }
            int var27 = Statics.field1219 + 24;
            short var28 = 277;
            field1232 = var10 >= var27 && var10 < Statics.field607 + var27 && var11 >= var28 && var11 < Statics.field1827 + var28;
            if (var9 == 1 && field1232) {
                Statics.field2108.field1084 = !Statics.field2108.field1084;
                if (!Statics.field2108.field1084) {
                    field1222 = "";
                    Statics.field2108.field1083 = null;
                    method196();
                }
                class83.method3709();
            }
            while (true) {
                Transferable var30;
                int var31;
                do {
                    while (true) {
                        label679: do {
                            while (true) {
                                while (class55.method610()) {
                                    if (Statics.field547 == 13) {
                                        field1215 = 0;
                                        field1222 = "";
                                        field1221 = "";
                                        Statics.field265 = 0;
                                        Statics.field3621 = "";
                                        field1224 = true;
                                    } else {
                                        if (field1225 != 0) {
                                            continue label679;
                                        }
                                        method3886(Statics.field443);
                                        if (Statics.field547 == 85 && field1222.length() > 0) {
                                            field1222 = field1222.substring(0, field1222.length() - 1);
                                        }
                                        if (Statics.field547 == 84 || Statics.field547 == 80) {
                                            field1225 = 1;
                                        }
                                        if (method3452(Statics.field443) && field1222.length() < 320) {
                                            field1222 = field1222 + Statics.field443;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field1225 != 1);
                        if (Statics.field547 == 85 && field1221.length() > 0) {
                            field1221 = field1221.substring(0, field1221.length() - 1);
                        } else if (Statics.field547 == 84 || Statics.field547 == 80) {
                            field1225 = 0;
                            if (Statics.field547 == 84) {
                                field1222 = field1222.trim();
                                if (field1222.length() == 0) {
                                    method3662(class234.field3045, class234.field2795, class234.field2913);
                                    return;
                                }
                                if (field1221.length() == 0) {
                                    method3662(class234.field2914, class234.field2915, class234.field2916);
                                    return;
                                }
                                method3662(class234.field3024, class234.field3025, class234.field3026);
                                client.method4537(false);
                                client.method1727(20);
                                return;
                            }
                        }
                        if ((class55.field409[82] || class55.field409[87]) && Statics.field547 == 67) {
                            Clipboard var29 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var30 = var29.getContents(Statics.field170);
                            var31 = 20 - field1221.length();
                            break;
                        }
                        if (class298.method2785(Statics.field443) && method3452(Statics.field443) && field1221.length() < 20) {
                            field1221 = field1221 + Statics.field443;
                        }
                    }
                } while (var31 <= 0);
                try {
                    String var32 = (String) var30.getTransferData(DataFlavor.stringFlavor);
                    int var33 = Math.min(var31, var32.length());
                    for (int var34 = 0; var34 < var33; var34++) {
                        if (!class298.method2785(var32.charAt(var34)) || !method3452(var32.charAt(var34))) {
                            field1215 = 3;
                            return;
                        }
                    }
                    field1221 = field1221 + var32.substring(0, var33);
                } catch (UnsupportedFlavorException var67) {
                } catch (IOException var68) {
                }
            }
        } else if (field1215 == 3) {
            int var37 = field1218 + 180;
            short var38 = 276;
            if (var9 == 1 && var10 >= var37 - 75 && var10 <= var37 + 75 && var11 >= var38 - 20 && var11 <= var38 + 20) {
                method308(false);
            }
            int var39 = field1218 + 180;
            short var40 = 326;
            if (var9 == 1 && var10 >= var39 - 75 && var10 <= var39 + 75 && var11 >= var40 - 20 && var11 <= var40 + 20) {
                method3662(class234.field3058, class234.field3059, class234.field3060);
                field1215 = 5;
                return;
            }
        } else if (field1215 == 4) {
            int var41 = field1218 + 180 - 80;
            short var42 = 321;
            if (var9 == 1 && var10 >= var41 - 75 && var10 <= var41 + 75 && var11 >= var42 - 20 && var11 <= var42 + 20) {
                Statics.field3621.trim();
                if (Statics.field3621.length() != 6) {
                    method3662(class234.field2895, class234.field2831, class234.field2832);
                    return;
                }
                Statics.field265 = Integer.parseInt(Statics.field3621);
                Statics.field3621 = "";
                client.method4537(true);
                method3662(class234.field3024, class234.field3025, class234.field3026);
                client.method1727(20);
                return;
            }
            if (var9 == 1 && var10 >= field1218 + 180 - 9 && var10 <= field1218 + 180 + 130 && var11 >= 263 && var11 <= 296) {
                field1224 = !field1224;
            }
            if (var9 == 1 && var10 >= field1218 + 180 - 34 && var10 <= field1218 + 180 + 34 && var11 >= 351 && var11 <= 363) {
                class61.method279(client.method4238("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var43 = field1218 + 180 + 80;
            if (var9 == 1 && var10 >= var43 - 75 && var10 <= var43 + 75 && var11 >= var42 - 20 && var11 <= var42 + 20) {
                field1215 = 0;
                field1222 = "";
                field1221 = "";
                Statics.field265 = 0;
                Statics.field3621 = "";
            }
            while (class55.method610()) {
                boolean var44 = false;
                for (int var45 = 0; var45 < field1227.length(); var45++) {
                    if (Statics.field443 == field1227.charAt(var45)) {
                        var44 = true;
                        break;
                    }
                }
                if (Statics.field547 == 13) {
                    field1215 = 0;
                    field1222 = "";
                    field1221 = "";
                    Statics.field265 = 0;
                    Statics.field3621 = "";
                } else {
                    if (Statics.field547 == 85 && Statics.field3621.length() > 0) {
                        Statics.field3621 = Statics.field3621.substring(0, Statics.field3621.length() - 1);
                    }
                    if (Statics.field547 == 84) {
                        Statics.field3621.trim();
                        if (Statics.field3621.length() != 6) {
                            method3662(class234.field2895, class234.field2831, class234.field2832);
                            return;
                        }
                        Statics.field265 = Integer.parseInt(Statics.field3621);
                        Statics.field3621 = "";
                        client.method4537(true);
                        method3662(class234.field3024, class234.field3025, class234.field3026);
                        client.method1727(20);
                        return;
                    }
                    if (var44 && Statics.field3621.length() < 6) {
                        Statics.field3621 = Statics.field3621 + Statics.field443;
                    }
                }
            }
        } else if (field1215 == 5) {
            int var46 = field1218 + 180 - 80;
            short var47 = 321;
            if (var9 == 1 && var10 >= var46 - 75 && var10 <= var46 + 75 && var11 >= var47 - 20 && var11 <= var47 + 20) {
                method1952();
                return;
            }
            int var48 = field1218 + 180 + 80;
            if (var9 == 1 && var10 >= var48 - 75 && var10 <= var48 + 75 && var11 >= var47 - 20 && var11 <= var47 + 20) {
                method308(true);
            }
            short var49 = 361;
            if (Statics.field88 != null) {
                int var50 = Statics.field88.field3867 / 2;
                if (var9 == 1 && var10 >= Statics.field88.field3866 - var50 && var10 <= Statics.field88.field3866 + var50 && var11 >= var49 - 15 && var11 < var49) {
                    class61.method279(client.method4238("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class55.method610()) {
                boolean var51 = false;
                for (int var52 = 0; var52 < field1226.length(); var52++) {
                    if (Statics.field443 == field1226.charAt(var52)) {
                        var51 = true;
                        break;
                    }
                }
                if (Statics.field547 == 13) {
                    method308(true);
                } else {
                    if (Statics.field547 == 85 && field1222.length() > 0) {
                        field1222 = field1222.substring(0, field1222.length() - 1);
                    }
                    if (Statics.field547 == 84) {
                        method1952();
                        return;
                    }
                    if (var51 && field1222.length() < 320) {
                        field1222 = field1222 + Statics.field443;
                    }
                }
            }
        } else if (field1215 == 6) {
            while (true) {
                do {
                    if (!class55.method610()) {
                        short var53 = 321;
                        if (var9 == 1 && var11 >= var53 - 20 && var11 <= var53 + 20) {
                            method308(true);
                        }
                        return;
                    }
                } while (Statics.field547 != 84 && Statics.field547 != 13);
                method308(true);
            }
        } else if (field1215 == 7) {
            int var54 = field1218 + 180 - 80;
            short var55 = 321;
            if (var9 == 1 && var10 >= var54 - 75 && var10 <= var54 + 75 && var11 >= var55 - 20 && var11 <= var55 + 20) {
                class61.method279(client.method4238("secure", true) + "m=dob/set_dob.ws", true, false);
                method3662(class234.field3055, class234.field2858, class234.field3057);
                field1215 = 6;
                return;
            }
            int var56 = field1218 + 180 + 80;
            if (var9 == 1 && var10 >= var56 - 75 && var10 <= var56 + 75 && var11 >= var55 - 20 && var11 <= var55 + 20) {
                method308(true);
            }
        } else if (field1215 == 8) {
            int var57 = field1218 + 180 - 80;
            short var58 = 321;
            if (var9 == 1 && var10 >= var57 - 75 && var10 <= var57 + 75 && var11 >= var58 - 20 && var11 <= var58 + 20) {
                class61.method279("https://www.jagex.com/terms/privacy", true, false);
                method3662(class234.field3055, class234.field2858, class234.field3057);
                field1215 = 6;
                return;
            }
            int var59 = field1218 + 180 + 80;
            if (var9 == 1 && var10 >= var59 - 75 && var10 <= var59 + 75 && var11 >= var58 - 20 && var11 <= var58 + 20) {
                method308(true);
            }
        } else if (field1215 == 12) {
            String var60 = "";
            switch(field1213) {
                case 0:
                    var60 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var60 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method308(false);
            }
            int var61 = field1218 + 180;
            short var62 = 276;
            if (var9 == 1 && var10 >= var61 - 75 && var10 <= var61 + 75 && var11 >= var62 - 20 && var11 <= var62 + 20) {
                class61.method279(var60, true, false);
                method3662(class234.field3055, class234.field2858, class234.field3057);
                field1215 = 6;
                return;
            }
            int var63 = field1218 + 180;
            short var64 = 326;
            if (var9 == 1 && var10 >= var63 - 75 && var10 <= var63 + 75 && var11 >= var64 - 20 && var11 <= var64 + 20) {
                method308(false);
            }
        } else if (field1215 == 24) {
            int var65 = field1218 + 180;
            short var66 = 301;
            if (var9 == 1 && var10 >= var65 - 75 && var10 <= var65 + 75 && var11 >= var66 - 20 && var11 <= var66 + 20) {
                method308(false);
            }
        }
    }

    @ObfuscatedName("iq.g(CI)Z")
    public static boolean method3886(char arg0) {
        for (int var1 = 0; var1 < field1226.length(); var1++) {
            if (arg0 == field1226.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ge.n(CB)Z")
    public static boolean method3452(char arg0) {
        return field1226.indexOf(arg0) != -1;
    }

    @ObfuscatedName("ag.u(ZI)V")
    public static void method308(boolean arg0) {
        field1217 = class234.field2829;
        field1235 = class234.field3007;
        field1223 = class234.field3047;
        field1215 = 2;
        if (arg0) {
            field1221 = "";
        }
        if (field1222 == null || field1222.length() <= 0) {
            if (Statics.field2108.field1083 == null) {
                client.field711 = false;
            } else {
                field1222 = Statics.field2108.field1083;
                client.field711 = true;
            }
        }
        method196();
    }

    @ObfuscatedName("cp.a(I)V")
    public static void method1952() {
        field1222 = field1222.trim();
        if (field1222.length() == 0) {
            method3662(class234.field3058, class234.field3059, class234.field3060);
            return;
        }
        long var0 = class90.method695();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field1222;
            Random var4 = new Random();
            class310 var5 = new class310(128);
            class310 var6 = new class310(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method5437(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method5213(var4.nextInt());
            }
            var5.method5213(var7[0]);
            var5.method5213(var7[1]);
            var5.method5310(var0);
            var5.method5310(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method5213(var4.nextInt());
            }
            var5.method5429(class90.field1162, class90.field1164);
            var6.method5437(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method5213(var4.nextInt());
            }
            var6.method5310(var4.nextLong());
            var6.method5214(var4.nextLong());
            if (client.field715 == null) {
                byte[] var11 = new byte[24];
                try {
                    class177.field2072.method6200(0L);
                    class177.field2072.method6199(var11);
                    int var12;
                    for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                    }
                    if (var12 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var59) {
                    for (int var14 = 0; var14 < 24; var14++) {
                        var11[var14] = -1;
                    }
                }
                var6.method5220(var11, 0, var11.length);
            } else {
                var6.method5220(client.field715, 0, client.field715.length);
            }
            var6.method5310(var4.nextLong());
            var6.method5429(class90.field1162, class90.field1164);
            int var17 = Statics.method2147(var3);
            if (var17 % 8 != 0) {
                var17 += 8 - var17 % 8;
            }
            class310 var18 = new class310(var17);
            var18.method5217(var3);
            var18.field3734 = var17;
            var18.method5246(var7);
            class310 var19 = new class310(var18.field3734 + var6.field3734 + var5.field3734 + 5);
            var19.method5437(2);
            var19.method5437(var5.field3734);
            var19.method5220(var5.field3736, 0, var5.field3734);
            var19.method5437(var6.field3734);
            var19.method5220(var6.field3736, 0, var6.field3734);
            var19.method5387(var18.field3734);
            var19.method5220(var18.field3736, 0, var18.field3734);
            byte[] var20 = var19.field3736;
            int var21 = var20.length;
            StringBuilder var22 = new StringBuilder();
            for (int var23 = 0; var23 < var21; var23 += 3) {
                int var24 = var20[var23] & 0xFF;
                var22.append(class300.field3678[var24 >>> 2]);
                if (var23 < var21 - 1) {
                    int var25 = var20[var23 + 1] & 0xFF;
                    var22.append(class300.field3678[(var24 & 0x3) << 4 | var25 >>> 4]);
                    if (var23 < var21 - 2) {
                        int var26 = var20[var23 + 2] & 0xFF;
                        var22.append(class300.field3678[(var25 & 0xF) << 2 | var26 >>> 6]).append(class300.field3678[var26 & 0x3F]);
                    } else {
                        var22.append(class300.field3678[(var25 & 0xF) << 2]).append("=");
                    }
                } else {
                    var22.append(class300.field3678[(var24 & 0x3) << 4]).append("==");
                }
            }
            String var27 = var22.toString();
            String var29 = var27;
            byte var54;
            try {
                URL var30 = new URL(client.method4238("services", false) + "m=accountappeal/login.ws");
                URLConnection var31 = var30.openConnection();
                var31.setDoInput(true);
                var31.setDoOutput(true);
                var31.setConnectTimeout(5000);
                OutputStreamWriter var32 = new OutputStreamWriter(var31.getOutputStream());
                int var34 = var29.length();
                StringBuilder var35 = new StringBuilder(var34);
                for (int var36 = 0; var36 < var34; var36++) {
                    char var37 = var29.charAt(var36);
                    if (!(var37 < 'a' || var37 > 'z') || !(var37 < 'A' || var37 > 'Z') || !(var37 < '0' || var37 > '9') || var37 == '.' || var37 == '-' || var37 == '*' || var37 == '_') {
                        var35.append(var37);
                    } else if (var37 == ' ') {
                        var35.append('+');
                    } else {
                        byte var38 = class298.method3228(var37);
                        var35.append('%');
                        int var39 = var38 >> 4 & 0xF;
                        if (var39 >= 10) {
                            var35.append((char) (var39 + 55));
                        } else {
                            var35.append((char) (var39 + 48));
                        }
                        int var40 = var38 & 0xF;
                        if (var40 >= 10) {
                            var35.append((char) (var40 + 55));
                        } else {
                            var35.append((char) (var40 + 48));
                        }
                    }
                }
                String var41 = var35.toString();
                String var42 = "data2=" + var41 + "&dest=";
                int var43 = "passwordchoice.ws".length();
                StringBuilder var44 = new StringBuilder(var43);
                for (int var45 = 0; var45 < var43; var45++) {
                    char var46 = "passwordchoice.ws".charAt(var45);
                    if (!(var46 < 'a' || var46 > 'z') || !(var46 < 'A' || var46 > 'Z') || !(var46 < '0' || var46 > '9') || var46 == '.' || var46 == '-' || var46 == '*' || var46 == '_') {
                        var44.append(var46);
                    } else if (var46 == ' ') {
                        var44.append('+');
                    } else {
                        byte var47 = class298.method3228(var46);
                        var44.append('%');
                        int var48 = var47 >> 4 & 0xF;
                        if (var48 >= 10) {
                            var44.append((char) (var48 + 55));
                        } else {
                            var44.append((char) (var48 + 48));
                        }
                        int var49 = var47 & 0xF;
                        if (var49 >= 10) {
                            var44.append((char) (var49 + 55));
                        } else {
                            var44.append((char) (var49 + 48));
                        }
                    }
                }
                String var50 = var44.toString();
                var32.write(var42 + var50);
                var32.flush();
                InputStream var51 = var31.getInputStream();
                class310 var52 = new class310(new byte[1000]);
                while (true) {
                    int var53 = var51.read(var52.field3736, var52.field3734, 1000 - var52.field3734);
                    if (var53 == -1) {
                        var32.close();
                        var51.close();
                        String var55 = new String(var52.field3736);
                        if (var55.startsWith("OFFLINE")) {
                            var54 = 4;
                        } else if (var55.startsWith("WRONG")) {
                            var54 = 7;
                        } else if (var55.startsWith("RELOAD")) {
                            var54 = 3;
                        } else if (var55.startsWith("Not permitted for social network accounts.")) {
                            var54 = 6;
                        } else {
                            var52.method5410(var7);
                            while (var52.field3734 > 0 && var52.field3736[var52.field3734 - 1] == 0) {
                                var52.field3734--;
                            }
                            String var56 = new String(var52.field3736, 0, var52.field3734);
                            if (Statics.method175(var56)) {
                                class61.method279(var56, true, false);
                                var54 = 2;
                            } else {
                                var54 = 5;
                            }
                        }
                        break;
                    }
                    var52.field3734 += var53;
                    if (var52.field3734 >= 1000) {
                        var54 = 5;
                        break;
                    }
                }
            } catch (Throwable var58) {
                var58.printStackTrace();
                var54 = 5;
            }
            var2 = var54;
        }
        switch(var2) {
            case 2:
                method3662(class234.field3061, class234.field3062, class234.field3063);
                field1215 = 6;
                break;
            case 3:
                method3662(class234.field3064, class234.field2996, class234.field3066);
                break;
            case 4:
                method3662(class234.field3014, class234.field2918, class234.field3069);
                break;
            case 5:
                method3662(class234.field2930, class234.field3071, class234.field3003);
                break;
            case 6:
                method3662(class234.field3073, class234.field2987, class234.field3075);
                break;
            case 7:
                method3662(class234.field3076, class234.field2932, class234.field3078);
        }
    }

    @ObfuscatedName("ch.z(Lko;Lko;Lko;B)V")
    public static void method1656(class305 arg0, class305 arg1, class305 arg2) {
        field1203 = (Statics.field1299 - 765) / 2;
        field1218 = field1203 + 202;
        Statics.field1219 = field1218 + 180;
        if (field1228) {
            method3437(arg0, arg1);
            return;
        }
        Statics.field1209.method5799(field1203, 0);
        Statics.field565.method5799(field1203 + 382, 0);
        Statics.field1220.method5771(field1203 + 382 - Statics.field1220.field3886 / 2, 18);
        if (client.field714 == 0 || client.field714 == 5) {
            byte var3 = 20;
            arg0.method5073(class234.field3005, field1218 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class331.method5690(field1218 + 180 - 152, var4, 304, 34, 9179409);
            class331.method5690(field1218 + 180 - 151, var4 + 1, 302, 32, 0);
            class331.method5686(field1218 + 180 - 150, var4 + 2, field1211 * 3, 30, 9179409);
            class331.method5686(field1211 * 3 + (field1218 + 180 - 150), var4 + 2, 300 - field1211 * 3, 30, 0);
            arg0.method5073(field1234, field1218 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field714 == 20) {
            Statics.field1148.method5771(field1218 + 180 - Statics.field1148.field3886 / 2, 271 - Statics.field1148.field3888 / 2);
            short var5 = 201;
            arg0.method5073(field1217, field1218 + 180, var5, 16776960, 0);
            int var84 = var5 + 15;
            arg0.method5073(field1235, field1218 + 180, var84, 16776960, 0);
            int var85 = var84 + 15;
            arg0.method5073(field1223, field1218 + 180, var85, 16776960, 0);
            int var86 = var85 + 15;
            int var87 = var86 + 7;
            if (field1215 != 4) {
                arg0.method5070(class234.field3033, field1218 + 180 - 110, var87, 16777215, 0);
                short var6 = 200;
                String var7;
                for (var7 = method3096(); arg0.method5065(var7) > var6; var7 = var7.substring(0, var7.length() - 1)) {
                }
                arg0.method5070(class306.method5069(var7), field1218 + 180 - 70, var87, 16777215, 0);
                var84 = var87 + 15;
                String var8;
                for (var8 = Statics.method536(field1221); arg0.method5065(var8) > var6; var8 = var8.substring(1)) {
                }
                arg0.method5070(class234.field2998 + var8, field1218 + 180 - 108, var84, 16777215, 0);
                var84 += 15;
            }
        }
        if (client.field714 == 10 || client.field714 == 11) {
            Statics.field1148.method5771(field1218, 171);
            if (field1215 == 0) {
                short var9 = 251;
                arg0.method5073(class234.field3036, field1218 + 180, var9, 16776960, 0);
                int var88 = var9 + 30;
                int var10 = field1218 + 180 - 80;
                short var11 = 291;
                Statics.field3694.method5771(var10 - 73, var11 - 20);
                arg0.method5074(class234.field3037, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1218 + 180 + 80;
                Statics.field3694.method5771(var12 - 73, var11 - 20);
                arg0.method5074(class234.field2937, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1215 == 1) {
                arg0.method5073(field1216, field1218 + 180, 201, 16776960, 0);
                short var13 = 236;
                arg0.method5073(field1217, field1218 + 180, var13, 16777215, 0);
                int var89 = var13 + 15;
                arg0.method5073(field1235, field1218 + 180, var89, 16777215, 0);
                int var90 = var89 + 15;
                arg0.method5073(field1223, field1218 + 180, var90, 16777215, 0);
                int var91 = var90 + 15;
                int var14 = field1218 + 180 - 80;
                short var15 = 321;
                Statics.field3694.method5771(var14 - 73, var15 - 20);
                arg0.method5073(class234.field2797, var14, var15 + 5, 16777215, 0);
                int var16 = field1218 + 180 + 80;
                Statics.field3694.method5771(var16 - 73, var15 - 20);
                arg0.method5073(class234.field3040, var16, var15 + 5, 16777215, 0);
            } else if (field1215 == 2) {
                short var17 = 201;
                arg0.method5073(field1217, Statics.field1219, var17, 16776960, 0);
                int var92 = var17 + 15;
                arg0.method5073(field1235, Statics.field1219, var92, 16776960, 0);
                int var93 = var92 + 15;
                arg0.method5073(field1223, Statics.field1219, var93, 16776960, 0);
                int var94 = var93 + 15;
                int var95 = var94 + 7;
                arg0.method5070(class234.field3033, Statics.field1219 - 110, var95, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = method3096(); arg0.method5065(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method5070(class306.method5069(var19) + (field1225 == 0 & client.field671 % 40 < 20 ? class91.method1063(16776960) + class91.field1172 : ""), Statics.field1219 - 70, var95, 16777215, 0);
                var92 = var95 + 15;
                String var20;
                for (var20 = Statics.method536(field1221); arg0.method5065(var20) > var18; var20 = var20.substring(1)) {
                }
                arg0.method5070(class234.field2998 + var20 + (field1225 == 1 & client.field671 % 40 < 20 ? class91.method1063(16776960) + class91.field1172 : ""), Statics.field1219 - 108, var92, 16777215, 0);
                var92 += 15;
                short var21 = 277;
                int var22 = Statics.field1219 + -117;
                boolean var23 = client.field711;
                boolean var24 = field1210;
                class334 var25 = var23 ? (var24 ? Statics.field598 : Statics.field497) : (var24 ? Statics.field3913 : Statics.field1207);
                var25.method5771(var22, var21);
                int var27 = var25.field3886 + 5 + var22;
                arg1.method5070(class234.field3041, var27, var21 + 13, 16776960, 0);
                int var28 = Statics.field1219 + 24;
                boolean var29 = Statics.field2108.field1084;
                boolean var30 = field1232;
                class334 var31 = var29 ? (var30 ? Statics.field598 : Statics.field497) : (var30 ? Statics.field3913 : Statics.field1207);
                var31.method5771(var28, var21);
                int var33 = var31.field3886 + 5 + var28;
                arg1.method5070(class234.field3042, var33, var21 + 13, 16776960, 0);
                int var96 = var21 + 15;
                int var34 = Statics.field1219 - 80;
                short var35 = 321;
                Statics.field3694.method5771(var34 - 73, var35 - 20);
                arg0.method5073(class234.field2966, var34, var35 + 5, 16777215, 0);
                int var36 = Statics.field1219 + 80;
                Statics.field3694.method5771(var36 - 73, var35 - 20);
                arg0.method5073(class234.field3040, var36, var35 + 5, 16777215, 0);
                short var37 = 357;
                switch(field1214) {
                    case 2:
                        Statics.field301 = class234.field3054;
                        break;
                    default:
                        Statics.field301 = class234.field3052;
                }
                Statics.field568 = new class329(Statics.field1219, var37, arg1.method5065(Statics.field301), 11);
                Statics.field88 = new class329(Statics.field1219, var37, arg1.method5065(class234.field3053), 11);
                arg1.method5073(Statics.field301, Statics.field1219, var37, 16777215, 0);
            } else if (field1215 == 3) {
                short var38 = 201;
                arg0.method5073(class234.field3090, field1218 + 180, var38, 16776960, 0);
                int var97 = var38 + 20;
                arg1.method5073(class234.field2887, field1218 + 180, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg1.method5073(class234.field2885, field1218 + 180, var98, 16776960, 0);
                int var99 = var98 + 15;
                int var39 = field1218 + 180;
                short var40 = 276;
                Statics.field3694.method5771(var39 - 73, var40 - 20);
                arg2.method5073(class234.field3046, var39, var40 + 5, 16777215, 0);
                int var41 = field1218 + 180;
                short var42 = 326;
                Statics.field3694.method5771(var41 - 73, var42 - 20);
                arg2.method5073(class234.field2977, var41, var42 + 5, 16777215, 0);
            } else if (field1215 == 4) {
                arg0.method5073(class234.field3021, field1218 + 180, 201, 16776960, 0);
                short var43 = 236;
                arg0.method5073(field1217, field1218 + 180, var43, 16777215, 0);
                int var100 = var43 + 15;
                arg0.method5073(field1235, field1218 + 180, var100, 16777215, 0);
                int var101 = var100 + 15;
                arg0.method5073(field1223, field1218 + 180, var101, 16777215, 0);
                int var102 = var101 + 15;
                arg0.method5070(class234.field2880 + Statics.method536(Statics.field3621) + (client.field671 % 40 < 20 ? class91.method1063(16776960) + class91.field1172 : ""), field1218 + 180 - 108, var102, 16777215, 0);
                int var103 = var102 - 8;
                arg0.method5070(class234.field2800, field1218 + 180 - 9, var103, 16776960, 0);
                int var104 = var103 + 15;
                arg0.method5070(class234.field2801, field1218 + 180 - 9, var104, 16776960, 0);
                int var44 = field1218 + 180 - 9 + arg0.method5065(class234.field2801) + 15;
                int var45 = var104 - arg0.field3720;
                class334 var46;
                if (field1224) {
                    var46 = Statics.field497;
                } else {
                    var46 = Statics.field1207;
                }
                var46.method5771(var44, var45);
                var100 = var104 + 15;
                int var47 = field1218 + 180 - 80;
                short var48 = 321;
                Statics.field3694.method5771(var47 - 73, var48 - 20);
                arg0.method5073(class234.field2797, var47, var48 + 5, 16777215, 0);
                int var49 = field1218 + 180 + 80;
                Statics.field3694.method5771(var49 - 73, var48 - 20);
                arg0.method5073(class234.field3040, var49, var48 + 5, 16777215, 0);
                arg1.method5073(class234.field3023, field1218 + 180, var48 + 36, 255, 0);
            } else if (field1215 == 5) {
                arg0.method5073(class234.field3031, field1218 + 180, 201, 16776960, 0);
                short var50 = 221;
                arg2.method5073(field1217, field1218 + 180, var50, 16776960, 0);
                int var105 = var50 + 15;
                arg2.method5073(field1235, field1218 + 180, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg2.method5073(field1223, field1218 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                int var108 = var107 + 14;
                arg0.method5070(class234.field3049, field1218 + 180 - 145, var108, 16777215, 0);
                short var51 = 174;
                String var52;
                for (var52 = method3096(); arg0.method5065(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method5070(class306.method5069(var52) + (client.field671 % 40 < 20 ? class91.method1063(16776960) + class91.field1172 : ""), field1218 + 180 - 34, var108, 16777215, 0);
                var105 = var108 + 15;
                int var53 = field1218 + 180 - 80;
                short var54 = 321;
                Statics.field3694.method5771(var53 - 73, var54 - 20);
                arg0.method5073(class234.field3050, var53, var54 + 5, 16777215, 0);
                int var55 = field1218 + 180 + 80;
                Statics.field3694.method5771(var55 - 73, var54 - 20);
                arg0.method5073(class234.field3051, var55, var54 + 5, 16777215, 0);
                short var56 = 356;
                arg1.method5073(class234.field3053, Statics.field1219, var56, 268435455, 0);
            } else if (field1215 == 6) {
                short var57 = 201;
                arg0.method5073(field1217, field1218 + 180, var57, 16776960, 0);
                int var109 = var57 + 15;
                arg0.method5073(field1235, field1218 + 180, var109, 16776960, 0);
                int var110 = var109 + 15;
                arg0.method5073(field1223, field1218 + 180, var110, 16776960, 0);
                int var111 = var110 + 15;
                int var58 = field1218 + 180;
                short var59 = 321;
                Statics.field3694.method5771(var58 - 73, var59 - 20);
                arg0.method5073(class234.field3051, var58, var59 + 5, 16777215, 0);
            } else if (field1215 == 7) {
                short var60 = 216;
                arg0.method5073(class234.field3079, field1218 + 180, var60, 16776960, 0);
                int var112 = var60 + 15;
                arg2.method5073(class234.field3080, field1218 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                arg2.method5073(class234.field3081, field1218 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                int var61 = field1218 + 180 - 80;
                short var62 = 321;
                Statics.field3694.method5771(var61 - 73, var62 - 20);
                arg0.method5073(class234.field3084, var61, var62 + 5, 16777215, 0);
                int var63 = field1218 + 180 + 80;
                Statics.field3694.method5771(var63 - 73, var62 - 20);
                arg0.method5073(class234.field3051, var63, var62 + 5, 16777215, 0);
            } else if (field1215 == 8) {
                short var64 = 216;
                arg0.method5073(class234.field2929, field1218 + 180, var64, 16776960, 0);
                int var115 = var64 + 15;
                arg2.method5073(class234.field2862, field1218 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg2.method5073(class234.field3044, field1218 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var65 = field1218 + 180 - 80;
                short var66 = 321;
                Statics.field3694.method5771(var65 - 73, var66 - 20);
                arg0.method5073(class234.field2825, var65, var66 + 5, 16777215, 0);
                int var67 = field1218 + 180 + 80;
                Statics.field3694.method5771(var67 - 73, var66 - 20);
                arg0.method5073(class234.field3051, var67, var66 + 5, 16777215, 0);
            } else if (field1215 == 12) {
                short var68 = 201;
                String var69 = "";
                String var70 = "";
                String var71 = "";
                switch(field1213) {
                    case 0:
                        var69 = class234.field2845;
                        var70 = class234.field2846;
                        var71 = class234.field2847;
                        break;
                    case 1:
                        var69 = class234.field2884;
                        var70 = class234.field2857;
                        var71 = class234.field3056;
                        break;
                    default:
                        method308(false);
                }
                arg0.method5073(var69, field1218 + 180, var68, 16776960, 0);
                int var118 = var68 + 15;
                arg2.method5073(var70, field1218 + 180, var118, 16776960, 0);
                int var119 = var118 + 15;
                arg2.method5073(var71, field1218 + 180, var119, 16776960, 0);
                int var120 = var119 + 15;
                int var72 = field1218 + 180;
                short var73 = 276;
                Statics.field3694.method5771(var72 - 73, var73 - 20);
                arg0.method5073(class234.field2971, var72, var73 + 5, 16777215, 0);
                int var74 = field1218 + 180;
                short var75 = 326;
                Statics.field3694.method5771(var74 - 73, var75 - 20);
                arg0.method5073(class234.field3051, var74, var75 + 5, 16777215, 0);
            } else if (field1215 == 24) {
                short var76 = 221;
                arg0.method5073(field1217, field1218 + 180, var76, 16777215, 0);
                int var121 = var76 + 15;
                arg0.method5073(field1235, field1218 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                arg0.method5073(field1223, field1218 + 180, var122, 16777215, 0);
                int var123 = var122 + 15;
                int var77 = field1218 + 180;
                short var78 = 301;
                Statics.field3694.method5771(var77 - 73, var78 - 20);
                arg0.method5073(class234.field2931, var77, var78 + 5, 16777215, 0);
            }
        }
        if (client.field714 >= 10) {
            int[] var79 = new int[4];
            class331.method5680(var79);
            class331.method5691(field1203, 0, field1203 + 765, Statics.field397);
            Statics.field1208.method1715(field1203 - 22, client.field671);
            Statics.field1208.method1715(field1203 + 765 + 22 - 128, client.field671);
            class331.method5681(var79);
        }
        Statics.field1490[Statics.field2108.field1078 ? 1 : 0].method5771(field1203 + 765 - 40, 463);
        if (client.field714 <= 5 || Statics.field1992 != class200.field2386) {
            return;
        }
        if (Statics.field207 == null) {
            Statics.field207 = class336.method5674(Statics.field77, "sl_button", "");
            return;
        }
        int var80 = field1203 + 5;
        short var81 = 463;
        byte var82 = 100;
        byte var83 = 35;
        Statics.field207.method5771(var80, var81);
        arg0.method5073(class234.field2956 + " " + client.field729, var82 / 2 + var80, var83 / 2 + var81 - 2, 16777215, 0);
        if (Statics.field1783 == null) {
            arg1.method5073(class234.field3093, var82 / 2 + var80, var83 / 2 + var81 + 12, 16777215, 0);
        } else {
            arg1.method5073(class234.field3092, var82 / 2 + var80, var83 / 2 + var81 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("hj.w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3662(String arg0, String arg1, String arg2) {
        field1217 = arg0;
        field1235 = arg1;
        field1223 = arg2;
    }

    @ObfuscatedName("gz.y(Lko;Lko;I)V")
    public static void method3437(class305 arg0, class305 arg1) {
        if (Statics.field1175 == null) {
            class246 var2 = Statics.field77;
            int var3 = var2.method3909("sl_back");
            int var4 = var2.method3910(var3, "");
            class335[] var5 = class336.method3688(var2, var3, var4);
            Statics.field1175 = var5;
        }
        if (Statics.field3271 == null) {
            Statics.field3271 = class336.method1615(Statics.field77, "sl_flags", "");
        }
        if (Statics.field78 == null) {
            Statics.field78 = class336.method1615(Statics.field77, "sl_arrows", "");
        }
        if (Statics.field2750 == null) {
            Statics.field2750 = class336.method1615(Statics.field77, "sl_stars", "");
        }
        if (Statics.field50 == null) {
            Statics.field50 = class336.method5674(Statics.field77, "leftarrow", "");
        }
        if (Statics.field1086 == null) {
            Statics.field1086 = class336.method5674(Statics.field77, "rightarrow", "");
        }
        class331.method5686(field1203, 23, 765, 480, 0);
        class331.method5722(field1203, 0, 125, 23, 12425273, 9135624);
        class331.method5722(field1203 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5073(class234.field3083, field1203 + 62, 15, 0, -1);
        if (Statics.field2750 != null) {
            Statics.field2750[1].method5771(field1203 + 140, 1);
            arg1.method5070(class234.field2860, field1203 + 152, 10, 16777215, -1);
            Statics.field2750[0].method5771(field1203 + 140, 12);
            arg1.method5070(class234.field3085, field1203 + 152, 21, 16777215, -1);
        }
        if (Statics.field78 != null) {
            int var6 = field1203 + 280;
            if (class81.field1046[0] == 0 && class81.field1045[0] == 0) {
                Statics.field78[2].method5771(var6, 4);
            } else {
                Statics.field78[0].method5771(var6, 4);
            }
            if (class81.field1046[0] == 0 && class81.field1045[0] == 1) {
                Statics.field78[3].method5771(var6 + 15, 4);
            } else {
                Statics.field78[1].method5771(var6 + 15, 4);
            }
            arg0.method5070(class234.field3086, var6 + 32, 17, 16777215, -1);
            int var7 = field1203 + 390;
            if (class81.field1046[0] == 1 && class81.field1045[0] == 0) {
                Statics.field78[2].method5771(var7, 4);
            } else {
                Statics.field78[0].method5771(var7, 4);
            }
            if (class81.field1046[0] == 1 && class81.field1045[0] == 1) {
                Statics.field78[3].method5771(var7 + 15, 4);
            } else {
                Statics.field78[1].method5771(var7 + 15, 4);
            }
            arg0.method5070(class234.field3087, var7 + 32, 17, 16777215, -1);
            int var8 = field1203 + 500;
            if (class81.field1046[0] == 2 && class81.field1045[0] == 0) {
                Statics.field78[2].method5771(var8, 4);
            } else {
                Statics.field78[0].method5771(var8, 4);
            }
            if (class81.field1046[0] == 2 && class81.field1045[0] == 1) {
                Statics.field78[3].method5771(var8 + 15, 4);
            } else {
                Statics.field78[1].method5771(var8 + 15, 4);
            }
            arg0.method5070(class234.field3088, var8 + 32, 17, 16777215, -1);
            int var9 = field1203 + 610;
            if (class81.field1046[0] == 3 && class81.field1045[0] == 0) {
                Statics.field78[2].method5771(var9, 4);
            } else {
                Statics.field78[0].method5771(var9, 4);
            }
            if (class81.field1046[0] == 3 && class81.field1045[0] == 1) {
                Statics.field78[3].method5771(var9 + 15, 4);
            } else {
                Statics.field78[1].method5771(var9 + 15, 4);
            }
            arg0.method5070(class234.field3089, var9 + 32, 17, 16777215, -1);
        }
        class331.method5686(field1203 + 708, 4, 50, 16, 0);
        arg1.method5073(class234.field3040, field1203 + 708 + 25, 16, 16777215, -1);
        field1229 = -1;
        if (Statics.field1175 != null) {
            byte var10 = 88;
            byte var11 = 19;
            int var12 = 765 / (var10 + 1) - 1;
            int var13 = 480 / (var11 + 1);
            int var14;
            int var15;
            do {
                var14 = var13;
                var15 = var12;
                if ((var12 - 1) * var13 >= class81.field1043) {
                    var12--;
                }
                if ((var13 - 1) * var12 >= class81.field1043) {
                    var13--;
                }
                if ((var13 - 1) * var12 >= class81.field1043) {
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
            int var20 = (class81.field1043 + var13 - 1) / var13;
            field1231 = var20 - var12;
            if (Statics.field50 != null && field1230 > 0) {
                Statics.field50.method5771(8, Statics.field397 / 2 - Statics.field50.field3888 / 2);
            }
            if (Statics.field1086 != null && field1230 < field1231) {
                Statics.field1086.method5771(Statics.field1299 - Statics.field1086.field3886 - 8, Statics.field397 / 2 - Statics.field1086.field3888 / 2);
            }
            int var21 = var19 + 23;
            int var22 = field1203 + var18;
            int var23 = 0;
            boolean var24 = false;
            int var25 = field1230;
            for (int var26 = var13 * var25; var26 < class81.field1043 && var25 - field1230 < var12; var26++) {
                class81 var27 = Statics.field54[var26];
                boolean var28 = true;
                String var29 = Integer.toString(var27.field1049);
                if (var27.field1049 == -1) {
                    var29 = class234.field2851;
                    var28 = false;
                } else if (var27.field1049 > 1980) {
                    var29 = class234.field3091;
                    var28 = false;
                }
                int var30 = 0;
                byte var31;
                if (var27.method1640()) {
                    if (var27.method1681()) {
                        var31 = 7;
                    } else {
                        var31 = 6;
                    }
                } else if (var27.method1638()) {
                    var30 = 16711680;
                    if (var27.method1681()) {
                        var31 = 5;
                    } else {
                        var31 = 4;
                    }
                } else if (var27.method1641()) {
                    if (var27.method1681()) {
                        var31 = 9;
                    } else {
                        var31 = 8;
                    }
                } else if (var27.method1637()) {
                    if (var27.method1681()) {
                        var31 = 3;
                    } else {
                        var31 = 2;
                    }
                } else if (var27.method1681()) {
                    var31 = 1;
                } else {
                    var31 = 0;
                }
                if (class64.field508 >= var22 && class64.field498 >= var21 && class64.field508 < var10 + var22 && class64.field498 < var11 + var21 && var28) {
                    field1229 = var26;
                    Statics.field1175[var31].method5805(var22, var21, 128, 16777215);
                    var24 = true;
                } else {
                    Statics.field1175[var31].method5799(var22, var21);
                }
                if (Statics.field3271 != null) {
                    Statics.field3271[(var27.method1681() ? 8 : 0) + var27.field1052].method5771(var22 + 29, var21);
                }
                arg0.method5073(Integer.toString(var27.field1047), var22 + 15, var11 / 2 + var21 + 5, var30, -1);
                arg1.method5073(var29, var22 + 60, var11 / 2 + var21 + 5, 268435455, -1);
                var21 += var11 + var17;
                var23++;
                if (var23 >= var13) {
                    var21 = var19 + 23;
                    var22 += var10 + var16;
                    var23 = 0;
                    var25++;
                }
            }
            if (var24) {
                int var32 = arg1.method5065(Statics.field54[field1229].field1051) + 6;
                int var33 = arg1.field3720 + 8;
                int var34 = class64.field498 + 25;
                if (var33 + var34 > 480) {
                    var34 = class64.field498 - 25 - var33;
                }
                class331.method5686(class64.field508 - var32 / 2, var34, var32, var33, 16777120);
                class331.method5690(class64.field508 - var32 / 2, var34, var32, var33, 0);
                arg1.method5073(Statics.field54[field1229].field1051, class64.field508, arg1.field3720 + var34 + 4, 0, -1);
            }
        }
        Statics.field554.method807(0, 0);
    }

    @ObfuscatedName("client.c(Lbn;B)V")
    public static void method1339(class63 arg0) {
        while (class55.method610()) {
            if (Statics.field547 == 13) {
                method322();
                return;
            }
            if (Statics.field547 == 96) {
                if (field1230 > 0 && Statics.field50 != null) {
                    field1230--;
                }
            } else if (Statics.field547 == 97 && field1230 < field1231 && Statics.field1086 != null) {
                field1230++;
            }
        }
        if (class64.field515 != 1 && Statics.field556 || class64.field515 != 4) {
            return;
        }
        int var1 = field1203 + 280;
        if (class64.field505 >= var1 && class64.field505 <= var1 + 14 && class64.field504 >= 4 && class64.field504 <= 18) {
            class81.method1172(0, 0);
            return;
        }
        if (class64.field505 >= var1 + 15 && class64.field505 <= var1 + 80 && class64.field504 >= 4 && class64.field504 <= 18) {
            class81.method1172(0, 1);
            return;
        }
        int var2 = field1203 + 390;
        if (class64.field505 >= var2 && class64.field505 <= var2 + 14 && class64.field504 >= 4 && class64.field504 <= 18) {
            class81.method1172(1, 0);
            return;
        }
        if (class64.field505 >= var2 + 15 && class64.field505 <= var2 + 80 && class64.field504 >= 4 && class64.field504 <= 18) {
            class81.method1172(1, 1);
            return;
        }
        int var3 = field1203 + 500;
        if (class64.field505 >= var3 && class64.field505 <= var3 + 14 && class64.field504 >= 4 && class64.field504 <= 18) {
            class81.method1172(2, 0);
            return;
        }
        if (class64.field505 >= var3 + 15 && class64.field505 <= var3 + 80 && class64.field504 >= 4 && class64.field504 <= 18) {
            class81.method1172(2, 1);
            return;
        }
        int var4 = field1203 + 610;
        if (class64.field505 >= var4 && class64.field505 <= var4 + 14 && class64.field504 >= 4 && class64.field504 <= 18) {
            class81.method1172(3, 0);
            return;
        }
        if (class64.field505 >= var4 + 15 && class64.field505 <= var4 + 80 && class64.field504 >= 4 && class64.field504 <= 18) {
            class81.method1172(3, 1);
            return;
        }
        if (class64.field505 >= field1203 + 708 && class64.field504 >= 4 && class64.field505 <= field1203 + 708 + 50 && class64.field504 <= 20) {
            method322();
            return;
        }
        if (field1229 != -1) {
            class81 var5 = Statics.field54[field1229];
            method4946(var5);
            method322();
            return;
        }
        if (field1230 > 0 && Statics.field50 != null && class64.field505 >= 0 && class64.field505 <= Statics.field50.field3886 && class64.field504 >= Statics.field397 / 2 - 50 && class64.field504 <= Statics.field397 / 2 + 50) {
            field1230--;
        }
        if (field1230 < field1231 && Statics.field1086 != null && class64.field505 >= Statics.field1299 - Statics.field1086.field3886 - 5 && class64.field505 <= Statics.field1299 && class64.field504 >= Statics.field397 / 2 - 50 && class64.field504 <= Statics.field397 / 2 + 50) {
            field1230++;
        }
    }

    @ObfuscatedName("kl.h(Lch;I)V")
    public static void method4946(class81 arg0) {
        if (arg0.method1681() != client.field896) {
            client.field896 = arg0.method1681();
            class265.method4092(arg0.method1681());
        }
        Statics.field2032 = arg0.field1055;
        client.field729 = arg0.field1047;
        client.field864 = arg0.field1048;
        Statics.field1181 = client.field863 == 0 ? 43594 : arg0.field1047 + 40000;
        Statics.field915 = client.field863 == 0 ? 443 : arg0.field1047 + 50000;
        Statics.field277 = Statics.field1181;
    }

    @ObfuscatedName("kx.k(IS)V")
    public static void method4898(int arg0) {
        field1215 = 12;
        field1213 = arg0;
    }

    @ObfuscatedName("am.d(I)V")
    public static void method322() {
        field1228 = false;
        Statics.field1209.method5799(field1203, 0);
        Statics.field565.method5799(field1203 + 382, 0);
        Statics.field1220.method5771(field1203 + 382 - Statics.field1220.field3886 / 2, 18);
    }

    @ObfuscatedName("l.e(I)V")
    public static void method184() {
        field1215 = 24;
        method3662(class234.field2822, class234.field3028, class234.field3032);
    }
}
