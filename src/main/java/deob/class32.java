package deob;

import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("al")
public class class32 {

    @ObfuscatedName("al.w")
    public static int field724 = 0;

    @ObfuscatedName("al.n")
    public static int field731 = field724 + 202;

    @ObfuscatedName("al.g")
    public static int[] field732 = new int[256];

    @ObfuscatedName("al.b")
    public static int field734 = 0;

    @ObfuscatedName("al.l")
    public static int field735 = 0;

    @ObfuscatedName("al.ah")
    public static int field723 = 0;

    @ObfuscatedName("al.ay")
    public static int field754 = 0;

    @ObfuscatedName("al.af")
    public static int field738 = 0;

    @ObfuscatedName("al.al")
    public static int field739 = 0;

    @ObfuscatedName("al.ai")
    public static int field747 = 10;

    @ObfuscatedName("al.an")
    public static String field745 = "";

    @ObfuscatedName("al.az")
    public static int field727 = 0;

    @ObfuscatedName("al.ac")
    public static String field743 = "";

    @ObfuscatedName("al.ao")
    public static String field744 = "";

    @ObfuscatedName("al.ax")
    public static String field725 = "";

    @ObfuscatedName("al.at")
    public static String field746 = "";

    @ObfuscatedName("al.ab")
    public static String field750 = "";

    @ObfuscatedName("al.ae")
    public static String field741 = "";

    @ObfuscatedName("al.au")
    public static class160 field740 = class160.field2597;

    @ObfuscatedName("al.aq")
    public static boolean field736 = true;

    @ObfuscatedName("al.ag")
    public static int field751 = 0;

    @ObfuscatedName("al.ap")
    public static String field752 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("al.ak")
    public static String field753 = "1234567890";

    @ObfuscatedName("al.aa")
    public static boolean field749 = false;

    @ObfuscatedName("al.bm")
    public static int field756 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fy.w(I)V")
    public static void method3140() {
        if (!Statics.field737) {
            return;
        }
        Statics.field748 = null;
        Statics.field726 = null;
        Statics.field742 = null;
        Statics.field728 = null;
        Statics.field729 = null;
        Statics.field716 = null;
        Statics.field730 = null;
        Statics.field222 = null;
        Statics.field1972 = null;
        Statics.field1205 = null;
        Statics.field689 = null;
        Statics.field1067 = null;
        Statics.field755 = null;
        Statics.field924 = null;
        Statics.field1020 = null;
        Statics.field700 = null;
        Statics.field733 = null;
        Statics.field787 = null;
        Statics.field1948 = null;
        Statics.field1169 = null;
        Statics.field677 = null;
        Statics.field234 = null;
        class184.method3241(2);
        class172.method832(true);
        Statics.field737 = false;
    }

    @ObfuscatedName("au.d(Let;I)V")
    public static void method925(class145 arg0) {
        if (field749) {
            method2396(arg0);
            return;
        }
        if ((class141.field2158 == 1 || !Statics.field144 && class141.field2158 == 4) && class141.field2161 >= field724 + 765 - 50 && class141.field2160 >= 453) {
            Statics.field2079.field155 = !Statics.field2079.field155;
            class9.method3770();
            if (Statics.field2079.field155) {
                class184.method161();
            } else {
                class184.method731(Statics.field885, "scape main", "", 255, false);
            }
        }
        if (client.field555 == 5) {
            return;
        }
        field738++;
        if (client.field555 != 10 && client.field555 != 11) {
            return;
        }
        if (client.field373 == 0) {
            if (class141.field2158 == 1 || !Statics.field144 && class141.field2158 == 4) {
                int var1 = field724 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class141.field2161 >= var1 && class141.field2161 <= var1 + var3 && class141.field2160 >= var2 && class141.field2160 <= var2 + var4) {
                    if (class26.method1589()) {
                        field749 = true;
                    }
                    return;
                }
            }
            if (Statics.field646 != null && class26.method1589()) {
                field749 = true;
            }
        }
        int var5 = class141.field2158;
        int var6 = class141.field2161;
        int var7 = class141.field2160;
        if (!Statics.field144 && var5 == 4) {
            var5 = 1;
        }
        if (field727 == 0) {
            int var8 = field731 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                String var10 = client.method213("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class139.method665(var10, true, "openjs", false);
            }
            int var11 = field731 + 180 + 80;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field432 & 0x2000000) != 0) {
                    field743 = "";
                    field744 = class158.field2523;
                    field725 = class158.field2569;
                    field746 = class158.field2399;
                    field727 = 1;
                    field751 = 0;
                } else if ((client.field432 & 0x4) != 0) {
                    if ((client.field432 & 0x400) == 0) {
                        field744 = class158.field2514;
                        field725 = class158.field2483;
                        field746 = class158.field2516;
                    } else {
                        field744 = class158.field2520;
                        field725 = class158.field2348;
                        field746 = class158.field2522;
                    }
                    field743 = class158.field2392;
                    field727 = 1;
                    field751 = 0;
                } else if ((client.field432 & 0x400) == 0) {
                    field744 = class158.field2309;
                    field725 = class158.field2511;
                    field746 = class158.field2512;
                    field727 = 2;
                    field751 = 0;
                } else {
                    field744 = class158.field2517;
                    field725 = class158.field2518;
                    field746 = class158.field2519;
                    field743 = class158.field2392;
                    field727 = 1;
                    field751 = 0;
                }
            }
        } else if (field727 == 1) {
            while (class138.method2394()) {
                if (Statics.field278 == 84) {
                    field744 = class158.field2309;
                    field725 = class158.field2511;
                    field746 = class158.field2512;
                    field727 = 2;
                    field751 = 0;
                } else if (Statics.field278 == 13) {
                    field727 = 0;
                }
            }
            int var12 = field731 + 180 - 80;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field744 = class158.field2309;
                field725 = class158.field2511;
                field746 = class158.field2512;
                field727 = 2;
                field751 = 0;
            }
            int var14 = field731 + 180 + 80;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field727 = 0;
            }
        } else if (field727 == 2) {
            short var15 = 231;
            int var38 = var15 + 30;
            if (var5 == 1 && var7 >= var38 - 15 && var7 < var38) {
                field751 = 0;
            }
            var38 += 15;
            if (var5 == 1 && var7 >= var38 - 15 && var7 < var38) {
                field751 = 1;
            }
            var38 += 15;
            short var16 = 361;
            if (var5 == 1 && var7 >= var16 - 15 && var7 < var16) {
                method856(class158.field2550, class158.field2500, class158.field2551);
                field727 = 5;
                return;
            }
            int var17 = field731 + 180 - 80;
            short var18 = 321;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field750 = field750.trim();
                if (field750.length() == 0) {
                    method856(class158.field2416, class158.field2417, class158.field2559);
                    return;
                }
                if (field741.length() == 0) {
                    method856(class158.field2324, class158.field2420, class158.field2421);
                    return;
                }
                method856(class158.field2528, class158.field2440, class158.field2530);
                field740 = Statics.field2079.field151.containsKey(class164.method2390(field750)) ? class160.field2593 : class160.field2597;
                client.method50(20);
                return;
            }
            int var19 = field731 + 180 + 80;
            if (var5 == 1 && var6 >= var19 - 75 && var6 <= var19 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field727 = 0;
                field750 = "";
                field741 = "";
                Statics.field2288 = 0;
                Statics.field654 = "";
                field736 = true;
            }
            while (true) {
                while (class138.method2394()) {
                    boolean var20 = false;
                    for (int var21 = 0; var21 < field752.length(); var21++) {
                        if (Statics.field2129 == field752.charAt(var21)) {
                            var20 = true;
                            break;
                        }
                    }
                    if (Statics.field278 == 13) {
                        field727 = 0;
                        field750 = "";
                        field741 = "";
                        Statics.field2288 = 0;
                        Statics.field654 = "";
                        field736 = true;
                    } else if (field751 == 0) {
                        if (Statics.field278 == 85 && field750.length() > 0) {
                            field750 = field750.substring(0, field750.length() - 1);
                        }
                        if (Statics.field278 == 84 || Statics.field278 == 80) {
                            field751 = 1;
                        }
                        if (var20 && field750.length() < 320) {
                            field750 = field750 + Statics.field2129;
                        }
                    } else if (field751 == 1) {
                        if (Statics.field278 == 85 && field741.length() > 0) {
                            field741 = field741.substring(0, field741.length() - 1);
                        }
                        if (Statics.field278 == 84 || Statics.field278 == 80) {
                            field751 = 0;
                        }
                        if (Statics.field278 == 84) {
                            field750 = field750.trim();
                            if (field750.length() == 0) {
                                method856(class158.field2416, class158.field2417, class158.field2559);
                                return;
                            }
                            if (field741.length() == 0) {
                                method856(class158.field2324, class158.field2420, class158.field2421);
                                return;
                            }
                            method856(class158.field2528, class158.field2440, class158.field2530);
                            field740 = Statics.field2079.field151.containsKey(class164.method2390(field750)) ? class160.field2593 : class160.field2597;
                            client.method50(20);
                            return;
                        }
                        if (var20 && field741.length() < 20) {
                            field741 = field741 + Statics.field2129;
                        }
                    }
                }
                return;
            }
        } else if (field727 == 3) {
            int var22 = field731 + 180;
            short var23 = 276;
            if (var5 == 1 && var6 >= var22 - 75 && var6 <= var22 + 75 && var7 >= var23 - 20 && var7 <= var23 + 20) {
                field744 = class158.field2309;
                field725 = class158.field2511;
                field746 = class158.field2512;
                field727 = 2;
                field751 = 0;
            }
            int var24 = field731 + 180;
            short var25 = 326;
            if (var5 == 1 && var6 >= var24 - 75 && var6 <= var24 + 75 && var7 >= var25 - 20 && var7 <= var25 + 20) {
                method856(class158.field2550, class158.field2500, class158.field2551);
                field727 = 5;
                return;
            }
        } else if (field727 == 4) {
            int var26 = field731 + 180 - 80;
            short var27 = 321;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                Statics.field654.trim();
                if (Statics.field654.length() != 6) {
                    method856(class158.field2335, class158.field2336, class158.field2472);
                    return;
                }
                Statics.field2288 = Integer.parseInt(Statics.field654);
                Statics.field654 = "";
                field740 = field736 ? class160.field2591 : class160.field2592;
                method856(class158.field2528, class158.field2440, class158.field2530);
                client.method50(20);
                return;
            }
            if (var5 == 1 && var6 >= field731 + 180 - 9 && var6 <= field731 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field736 = !field736;
            }
            if (var5 == 1 && var6 >= field731 + 180 - 34 && var6 <= field731 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                String var28 = client.method213("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class139.method665(var28, true, "openjs", false);
            }
            int var29 = field731 + 180 + 80;
            if (var5 == 1 && var6 >= var29 - 75 && var6 <= var29 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                field727 = 0;
                field750 = "";
                field741 = "";
                Statics.field2288 = 0;
                Statics.field654 = "";
            }
            while (class138.method2394()) {
                boolean var30 = false;
                for (int var31 = 0; var31 < field753.length(); var31++) {
                    if (Statics.field2129 == field753.charAt(var31)) {
                        var30 = true;
                        break;
                    }
                }
                if (Statics.field278 == 13) {
                    field727 = 0;
                    field750 = "";
                    field741 = "";
                    Statics.field2288 = 0;
                    Statics.field654 = "";
                } else {
                    if (Statics.field278 == 85 && Statics.field654.length() > 0) {
                        Statics.field654 = Statics.field654.substring(0, Statics.field654.length() - 1);
                    }
                    if (Statics.field278 == 84) {
                        Statics.field654.trim();
                        if (Statics.field654.length() != 6) {
                            method856(class158.field2335, class158.field2336, class158.field2472);
                            return;
                        }
                        Statics.field2288 = Integer.parseInt(Statics.field654);
                        Statics.field654 = "";
                        field740 = field736 ? class160.field2591 : class160.field2592;
                        method856(class158.field2528, class158.field2440, class158.field2530);
                        client.method50(20);
                        return;
                    }
                    if (var30 && Statics.field654.length() < 6) {
                        Statics.field654 = Statics.field654 + Statics.field2129;
                    }
                }
            }
        } else if (field727 == 5) {
            int var32 = field731 + 180 - 80;
            short var33 = 321;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                method2708();
                return;
            }
            int var34 = field731 + 180 + 80;
            if (var5 == 1 && var6 >= var34 - 75 && var6 <= var34 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                field744 = class158.field2309;
                field725 = class158.field2511;
                field746 = class158.field2512;
                field727 = 2;
                field751 = 0;
                field741 = "";
            }
            while (class138.method2394()) {
                boolean var35 = false;
                for (int var36 = 0; var36 < field752.length(); var36++) {
                    if (Statics.field2129 == field752.charAt(var36)) {
                        var35 = true;
                        break;
                    }
                }
                if (Statics.field278 == 13) {
                    field744 = class158.field2309;
                    field725 = class158.field2511;
                    field746 = class158.field2512;
                    field727 = 2;
                    field751 = 0;
                    field741 = "";
                } else {
                    if (Statics.field278 == 85 && field750.length() > 0) {
                        field750 = field750.substring(0, field750.length() - 1);
                    }
                    if (Statics.field278 == 84) {
                        method2708();
                        return;
                    }
                    if (var35 && field750.length() < 320) {
                        field750 = field750 + Statics.field2129;
                    }
                }
            }
        } else if (field727 == 6) {
            while (true) {
                do {
                    if (!class138.method2394()) {
                        short var37 = 321;
                        if (var5 == 1 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                            field744 = class158.field2309;
                            field725 = class158.field2511;
                            field746 = class158.field2512;
                            field727 = 2;
                            field751 = 0;
                            field741 = "";
                        }
                        return;
                    }
                } while (Statics.field278 != 84 && Statics.field278 != 13);
                field744 = class158.field2309;
                field725 = class158.field2511;
                field746 = class158.field2512;
                field727 = 2;
                field751 = 0;
                field741 = "";
            }
        }
    }

    @ObfuscatedName("ds.c(I)V")
    public static void method2708() {
        field750 = field750.trim();
        if (field750.length() == 0) {
            method856(class158.field2550, class158.field2500, class158.field2551);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method213("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class120 var4 = new class120(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field1994, var4.field1993, 1000 - var4.field1993);
                if (var5 == -1) {
                    var4.field1993 = 0;
                    long var8 = var4.method2468();
                    var6 = var8;
                    break;
                }
                var4.field1993 += var5;
                if (var4.field1993 >= 1000) {
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
            var13 = class10.method2355(var6, field750);
        }
        switch(var13) {
            case 2:
                method856(class158.field2552, class158.field2553, class158.field2554);
                field727 = 6;
                break;
            case 3:
                method856(class158.field2431, class158.field2413, class158.field2403);
                break;
            case 4:
                method856(class158.field2558, class158.field2501, class158.field2560);
                break;
            case 5:
                method856(class158.field2307, class158.field2562, class158.field2521);
                break;
            case 6:
                method856(class158.field2564, class158.field2565, class158.field2322);
                break;
            case 7:
                method856(class158.field2567, class158.field2568, class158.field2442);
        }
    }

    @ObfuscatedName("bf.y(Lhr;Lhr;Lhr;ZI)V")
    public static void method1575(class225 arg0, class225 arg1, class225 arg2, boolean arg3) {
        if (arg3) {
            field724 = (Statics.field877 - client.field439 * 765) / 2;
            field731 = field724 + 202;
        }
        if (field749) {
            if (Statics.field1205 == null) {
                Statics.field1205 = class77.method222(Statics.field1769, "sl_back", "");
            }
            if (Statics.field689 == null) {
                Statics.field689 = class77.method1869(Statics.field1769, "sl_flags", "");
            }
            if (Statics.field1067 == null) {
                Statics.field1067 = class77.method1869(Statics.field1769, "sl_arrows", "");
            }
            if (Statics.field755 == null) {
                Statics.field755 = class77.method1869(Statics.field1769, "sl_stars", "");
            }
            class80.method1817(field724, 23, 765, 480, 0);
            class80.method1788(field724, 0, 125, 23, 12425273, 9135624);
            class80.method1788(field724 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3857(class158.field2570, field724 + 62, 15, 0, -1);
            if (Statics.field755 != null) {
                Statics.field755[1].method1850(field724 + 140, 1);
                arg1.method3855(class158.field2508, field724 + 152, 10, 16777215, -1);
                Statics.field755[0].method1850(field724 + 140, 12);
                arg1.method3855(class158.field2572, field724 + 152, 21, 16777215, -1);
            }
            if (Statics.field1067 != null) {
                int var4 = field724 + 280;
                if (class26.field653[0] == 0 && class26.field644[0] == 0) {
                    Statics.field1067[2].method1850(var4, 4);
                } else {
                    Statics.field1067[0].method1850(var4, 4);
                }
                if (class26.field653[0] == 0 && class26.field644[0] == 1) {
                    Statics.field1067[3].method1850(var4 + 15, 4);
                } else {
                    Statics.field1067[1].method1850(var4 + 15, 4);
                }
                arg0.method3855(class158.field2573, var4 + 32, 17, 16777215, -1);
                int var5 = field724 + 390;
                if (class26.field653[0] == 1 && class26.field644[0] == 0) {
                    Statics.field1067[2].method1850(var5, 4);
                } else {
                    Statics.field1067[0].method1850(var5, 4);
                }
                if (class26.field653[0] == 1 && class26.field644[0] == 1) {
                    Statics.field1067[3].method1850(var5 + 15, 4);
                } else {
                    Statics.field1067[1].method1850(var5 + 15, 4);
                }
                arg0.method3855(class158.field2574, var5 + 32, 17, 16777215, -1);
                int var6 = field724 + 500;
                if (class26.field653[0] == 2 && class26.field644[0] == 0) {
                    Statics.field1067[2].method1850(var6, 4);
                } else {
                    Statics.field1067[0].method1850(var6, 4);
                }
                if (class26.field653[0] == 2 && class26.field644[0] == 1) {
                    Statics.field1067[3].method1850(var6 + 15, 4);
                } else {
                    Statics.field1067[1].method1850(var6 + 15, 4);
                }
                arg0.method3855(class158.field2575, var6 + 32, 17, 16777215, -1);
                int var7 = field724 + 610;
                if (class26.field653[0] == 3 && class26.field644[0] == 0) {
                    Statics.field1067[2].method1850(var7, 4);
                } else {
                    Statics.field1067[0].method1850(var7, 4);
                }
                if (class26.field653[0] == 3 && class26.field644[0] == 1) {
                    Statics.field1067[3].method1850(var7 + 15, 4);
                } else {
                    Statics.field1067[1].method1850(var7 + 15, 4);
                }
                arg0.method3855(class158.field2434, var7 + 32, 17, 16777215, -1);
            }
            class80.method1817(field724 + 708, 4, 50, 16, 0);
            arg1.method3857(class158.field2538, field724 + 708 + 25, 16, 16777215, -1);
            field756 = -1;
            if (Statics.field1205 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class26.field651) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class26.field651) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class26.field651) {
                        var11--;
                    }
                } while (var11 != var12 || var10 != var13);
                int var14 = (765 - var8 * var10) / (var10 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (480 - var9 * var11) / (var11 + 1);
                if (var15 > 5) {
                    var15 = 5;
                }
                int var16 = (765 - var8 * var10 - (var10 - 1) * var14) / 2;
                int var17 = (480 - var9 * var11 - (var11 - 1) * var15) / 2;
                int var18 = var17 + 23;
                int var19 = field724 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class26.field651; var22++) {
                    class26 var23 = Statics.field2052[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field649);
                    if (var23.field649 == -1) {
                        var25 = class158.field2577;
                        var24 = false;
                    } else if (var23.field649 > 1980) {
                        var25 = class158.field2580;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method679()) {
                        if (var23.method674()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method701()) {
                        var26 = 16711680;
                        if (var23.method674()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method676()) {
                        if (var23.method674()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method674()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class141.field2152 >= var19 && class141.field2162 >= var18 && class141.field2152 < var8 + var19 && class141.field2162 < var9 + var18 && var24) {
                        field756 = var22;
                        Statics.field1205[var27].method1690(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field1205[var27].method1684(var19, var18);
                    }
                    if (Statics.field689 != null) {
                        Statics.field689[(var23.method674() ? 8 : 0) + var23.field652].method1850(var19 + 29, var18);
                    }
                    arg0.method3857(Integer.toString(var23.field647), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3857(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3850(Statics.field2052[field756].field650) + 6;
                    int var29 = arg1.field3191 + 8;
                    class80.method1817(class141.field2152 - var28 / 2, class141.field2162 + 20 + 5, var28, var29, 16777120);
                    class80.method1829(class141.field2152 - var28 / 2, class141.field2162 + 20 + 5, var28, var29, 0);
                    arg1.method3857(Statics.field2052[field756].field650, class141.field2152, class141.field2162 + 20 + 5 + arg1.field3191 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field2586.getGraphics();
                Statics.field696.method1604(var30, 0, 0);
            } catch (Exception var79) {
                Statics.field2586.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field728.method1684(field724, 0);
            Statics.field729.method1684(field724 + 382, 0);
            Statics.field716.method1850(field724 + 382 - Statics.field716.field1420 / 2, 18);
        }
        if (client.field555 == 0 || client.field555 == 5) {
            byte var32 = 20;
            arg0.method3857(class158.field2456, field731 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class80.method1829(field731 + 180 - 152, var33, 304, 34, 9179409);
            class80.method1829(field731 + 180 - 151, var33 + 1, 302, 32, 0);
            class80.method1817(field731 + 180 - 150, var33 + 2, field747 * 3, 30, 9179409);
            class80.method1817(field747 * 3 + (field731 + 180 - 150), var33 + 2, 300 - field747 * 3, 30, 0);
            arg0.method3857(field745, field731 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field555 == 20) {
            Statics.field748.method1850(field731 + 180 - Statics.field748.field1420 / 2, 271 - Statics.field748.field1421 / 2);
            short var34 = 211;
            arg0.method3857(field744, field731 + 180, var34, 16776960, 0);
            int var81 = var34 + 15;
            arg0.method3857(field725, field731 + 180, var81, 16776960, 0);
            int var82 = var81 + 15;
            arg0.method3857(field746, field731 + 180, var82, 16776960, 0);
            int var83 = var82 + 15;
            int var84 = var83 + 10;
            if (field727 != 4) {
                arg0.method3855(class158.field2429, field731 + 180 - 110, var84, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field750; arg0.method3850(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3855(class224.method3854(var36), field731 + 180 - 70, var84, 16777215, 0);
                var81 = var84 + 15;
                arg0.method3855(class158.field2451 + class164.method194(field741), field731 + 180 - 108, var81, 16777215, 0);
                var81 += 15;
            }
        }
        if (client.field555 == 10 || client.field555 == 11) {
            Statics.field748.method1850(field731, 171);
            if (field727 == 0) {
                short var37 = 251;
                arg0.method3857(class158.field2351, field731 + 180, var37, 16776960, 0);
                int var85 = var37 + 30;
                int var38 = field731 + 180 - 80;
                short var39 = 291;
                Statics.field726.method1850(var38 - 73, var39 - 20);
                arg0.method3858(class158.field2535, var38 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var40 = field731 + 180 + 80;
                Statics.field726.method1850(var40 - 73, var39 - 20);
                arg0.method3858(class158.field2536, var40 - 73, var39 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field727 == 1) {
                arg0.method3857(field743, field731 + 180, 211, 16776960, 0);
                short var41 = 236;
                arg0.method3857(field744, field731 + 180, var41, 16777215, 0);
                int var86 = var41 + 15;
                arg0.method3857(field725, field731 + 180, var86, 16777215, 0);
                int var87 = var86 + 15;
                arg0.method3857(field746, field731 + 180, var87, 16777215, 0);
                int var88 = var87 + 15;
                int var42 = field731 + 180 - 80;
                short var43 = 321;
                Statics.field726.method1850(var42 - 73, var43 - 20);
                arg0.method3857(class158.field2355, var42, var43 + 5, 16777215, 0);
                int var44 = field731 + 180 + 80;
                Statics.field726.method1850(var44 - 73, var43 - 20);
                arg0.method3857(class158.field2538, var44, var43 + 5, 16777215, 0);
            } else if (field727 == 2) {
                short var45 = 211;
                arg0.method3857(field744, field731 + 180, var45, 16776960, 0);
                int var89 = var45 + 15;
                arg0.method3857(field725, field731 + 180, var89, 16776960, 0);
                int var90 = var89 + 15;
                arg0.method3857(field746, field731 + 180, var90, 16776960, 0);
                int var91 = var90 + 15;
                int var92 = var91 + 10;
                arg0.method3855(class158.field2429, field731 + 180 - 110, var92, 16777215, 0);
                short var46 = 200;
                String var47;
                for (var47 = field750; arg0.method3850(var47) > var46; var47 = var47.substring(1)) {
                }
                arg0.method3855(class224.method3854(var47) + (field751 == 0 & client.field307 % 40 < 20 ? class2.method2886(16776960) + class2.field20 : ""), field731 + 180 - 70, var92, 16777215, 0);
                var89 = var92 + 15;
                arg0.method3855(class158.field2451 + class164.method194(field741) + (field751 == 1 & client.field307 % 40 < 20 ? class2.method2886(16776960) + class2.field20 : ""), field731 + 180 - 108, var89, 16777215, 0);
                var89 += 15;
                int var48 = field731 + 180 - 80;
                short var49 = 321;
                Statics.field726.method1850(var48 - 73, var49 - 20);
                arg0.method3857(class158.field2537, var48, var49 + 5, 16777215, 0);
                int var50 = field731 + 180 + 80;
                Statics.field726.method1850(var50 - 73, var49 - 20);
                arg0.method3857(class158.field2538, var50, var49 + 5, 16777215, 0);
                short var51 = 357;
                arg1.method3857(class158.field2544, field731 + 180, var51, 16776960, 0);
            } else if (field727 == 3) {
                short var52 = 201;
                arg0.method3857(class158.field2571, field731 + 180, var52, 16776960, 0);
                int var93 = var52 + 20;
                arg1.method3857(class158.field2540, field731 + 180, var93, 16776960, 0);
                int var94 = var93 + 15;
                arg1.method3857(class158.field2541, field731 + 180, var94, 16776960, 0);
                int var95 = var94 + 15;
                int var53 = field731 + 180;
                short var54 = 276;
                Statics.field726.method1850(var53 - 73, var54 - 20);
                arg2.method3857(class158.field2578, var53, var54 + 5, 16777215, 0);
                int var55 = field731 + 180;
                short var56 = 326;
                Statics.field726.method1850(var55 - 73, var56 - 20);
                arg2.method3857(class158.field2543, var55, var56 + 5, 16777215, 0);
            } else if (field727 == 4) {
                arg0.method3857(class158.field2447, field731 + 180, 211, 16776960, 0);
                short var57 = 236;
                arg0.method3857(field744, field731 + 180, var57, 16777215, 0);
                int var96 = var57 + 15;
                arg0.method3857(field725, field731 + 180, var96, 16777215, 0);
                int var97 = var96 + 15;
                arg0.method3857(field746, field731 + 180, var97, 16777215, 0);
                int var98 = var97 + 15;
                arg0.method3855(class158.field2533 + class164.method194(Statics.field654) + (client.field307 % 40 < 20 ? class2.method2886(16776960) + class2.field20 : ""), field731 + 180 - 108, var98, 16777215, 0);
                int var99 = var98 - 8;
                arg0.method3855(class158.field2526, field731 + 180 - 9, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg0.method3855(class158.field2314, field731 + 180 - 9, var100, 16776960, 0);
                int var58 = field731 + 180 - 9 + arg0.method3850(class158.field2314) + 15;
                int var59 = var100 - arg0.field3191;
                class81 var60;
                if (field736) {
                    var60 = Statics.field1972;
                } else {
                    var60 = Statics.field222;
                }
                var60.method1850(var58, var59);
                var96 = var100 + 15;
                int var61 = field731 + 180 - 80;
                short var62 = 321;
                Statics.field726.method1850(var61 - 73, var62 - 20);
                arg0.method3857(class158.field2355, var61, var62 + 5, 16777215, 0);
                int var63 = field731 + 180 + 80;
                Statics.field726.method1850(var63 - 73, var62 - 20);
                arg0.method3857(class158.field2538, var63, var62 + 5, 16777215, 0);
                arg1.method3857(class158.field2527, field731 + 180, var62 + 36, 255, 0);
            } else if (field727 == 5) {
                arg0.method3857(class158.field2448, field731 + 180, 201, 16776960, 0);
                short var64 = 221;
                arg2.method3857(field744, field731 + 180, var64, 16776960, 0);
                int var101 = var64 + 15;
                arg2.method3857(field725, field731 + 180, var101, 16776960, 0);
                int var102 = var101 + 15;
                arg2.method3857(field746, field731 + 180, var102, 16776960, 0);
                int var103 = var102 + 15;
                int var104 = var103 + 14;
                arg0.method3855(class158.field2546, field731 + 180 - 145, var104, 16777215, 0);
                short var65 = 174;
                String var66;
                for (var66 = field750; arg0.method3850(var66) > var65; var66 = var66.substring(1)) {
                }
                arg0.method3855(class224.method3854(var66) + (client.field307 % 40 < 20 ? class2.method2886(16776960) + class2.field20 : ""), field731 + 180 - 34, var104, 16777215, 0);
                var101 = var104 + 15;
                int var67 = field731 + 180 - 80;
                short var68 = 321;
                Statics.field726.method1850(var67 - 73, var68 - 20);
                arg0.method3857(class158.field2547, var67, var68 + 5, 16777215, 0);
                int var69 = field731 + 180 + 80;
                Statics.field726.method1850(var69 - 73, var68 - 20);
                arg0.method3857(class158.field2548, var69, var68 + 5, 16777215, 0);
            } else if (field727 == 6) {
                short var70 = 211;
                arg0.method3857(field744, field731 + 180, var70, 16776960, 0);
                int var105 = var70 + 15;
                arg0.method3857(field725, field731 + 180, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg0.method3857(field746, field731 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                int var71 = field731 + 180;
                short var72 = 321;
                Statics.field726.method1850(var71 - 73, var72 - 20);
                arg0.method3857(class158.field2548, var71, var72 + 5, 16777215, 0);
            }
        }
        if (field738 > 0) {
            method119(field738);
            field738 = 0;
        }
        method216();
        Statics.field730[Statics.field2079.field155 ? 1 : 0].method1850(field724 + 765 - 40, 463);
        if (client.field555 > 5 && client.field373 == 0) {
            if (Statics.field924 == null) {
                Statics.field924 = class77.method131(Statics.field1769, "sl_button", "");
            } else {
                int var73 = field724 + 5;
                short var74 = 463;
                byte var75 = 100;
                byte var76 = 35;
                Statics.field924.method1850(var73, var74);
                arg0.method3857(class158.field2353 + " " + client.field297, var75 / 2 + var73, var76 / 2 + var74 - 2, 16777215, 0);
                if (Statics.field646 == null) {
                    arg1.method3857(class158.field2531, var75 / 2 + var73, var76 / 2 + var74 + 12, 16777215, 0);
                } else {
                    arg1.method3857(class158.field2579, var75 / 2 + var73, var76 / 2 + var74 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var77 = Statics.field2586.getGraphics();
            Statics.field696.method1604(var77, 0, 0);
        } catch (Exception var80) {
            Statics.field2586.repaint();
        }
    }

    @ObfuscatedName("ab.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method856(String arg0, String arg1, String arg2) {
        field744 = arg0;
        field725 = arg1;
        field746 = arg2;
    }

    @ObfuscatedName("al.r(Lcg;B)V")
    public static final void method762(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1948.length; var2++) {
            Statics.field1948[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1948[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1169[var8] = (Statics.field1948[var8 - 1] + Statics.field1948[var8 + 1] + Statics.field1948[var8 - 128] + Statics.field1948[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1948;
            Statics.field1948 = Statics.field1169;
            Statics.field1169 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1421; var11++) {
            for (int var12 = 0; var12 < arg0.field1420; var12++) {
                if (arg0.field1423[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1422;
                    int var14 = var11 + 16 + arg0.field1425;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1948[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("k.p(II)V")
    public static final void method119(int arg0) {
        short var1 = 256;
        field723 += arg0 * 128;
        if (field723 > Statics.field1948.length) {
            field723 -= Statics.field1948.length;
            int var2 = (int) (Math.random() * 12.0D);
            method762(Statics.field742[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field677[var3 + var4] - Statics.field1948[field723 + var3 & Statics.field1948.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field677[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field677[var9 + var10] = 255;
                } else {
                    Statics.field677[var9 + var10] = 0;
                }
            }
        }
        if (field734 > 0) {
            field734 -= arg0 * 4;
        }
        if (field735 > 0) {
            field735 -= arg0 * 4;
        }
        if (field734 == 0 && field735 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field734 = 1024;
            }
            if (var12 == 1) {
                field735 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field732[var13] = field732[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field732[var14] = (int) (Math.sin((double) field739 / 14.0D) * 16.0D + Math.sin((double) field739 / 15.0D) * 14.0D + Math.sin((double) field739 / 16.0D) * 12.0D);
            field739++;
        }
        field754 += arg0 * -1848958007;
        int var15 = ((client.field307 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field754 * 1603274564; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field677[(var18 << 7) + var17] = 192;
        }
        field754 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field677[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field677[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field234[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field234[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field234[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field677[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("dk.q(IIII)I")
    public static final int method2395(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("g.m(S)V")
    public static final void method216() {
        short var0 = 256;
        if (field734 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field734 > 768) {
                    Statics.field787[var1] = method2395(Statics.field1020[var1], Statics.field700[var1], 1024 - field734);
                } else if (field734 > 256) {
                    Statics.field787[var1] = Statics.field700[var1];
                } else {
                    Statics.field787[var1] = method2395(Statics.field700[var1], Statics.field1020[var1], 256 - field734);
                }
            }
        } else if (field735 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field735 > 768) {
                    Statics.field787[var2] = method2395(Statics.field1020[var2], Statics.field733[var2], 1024 - field735);
                } else if (field735 > 256) {
                    Statics.field787[var2] = Statics.field733[var2];
                } else {
                    Statics.field787[var2] = method2395(Statics.field733[var2], Statics.field1020[var2], 256 - field735);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field787[var3] = Statics.field1020[var3];
            }
        }
        class80.method1777(field724, 9, field724 + 128, var0 + 7);
        Statics.field728.method1684(field724, 0);
        class80.method1776();
        int var4 = 0;
        int var5 = field724 + Statics.field696.field1395 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field732[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field677[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field787[var10];
                    int var14 = Statics.field696.field1394[var5];
                    Statics.field696.field1394[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field696.field1395 + var8 - 128;
        }
        class80.method1777(field724 + 765 - 128, 9, field724 + 765, var0 + 7);
        Statics.field729.method1684(field724 + 382, 0);
        class80.method1776();
        int var15 = 0;
        int var16 = field724 + Statics.field696.field1395 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field732[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field677[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field787[var22];
                    int var26 = Statics.field696.field1394[var20];
                    Statics.field696.field1394[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field696.field1395 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("dp.e(Let;B)V")
    public static void method2396(class145 arg0) {
        if (class141.field2158 != 1 && Statics.field144 || class141.field2158 != 4) {
            return;
        }
        int var1 = field724 + 280;
        if (class141.field2161 >= var1 && class141.field2161 <= var1 + 14 && class141.field2160 >= 4 && class141.field2160 <= 18) {
            class26.method1090(0, 0);
            return;
        }
        if (class141.field2161 >= var1 + 15 && class141.field2161 <= var1 + 80 && class141.field2160 >= 4 && class141.field2160 <= 18) {
            class26.method1090(0, 1);
            return;
        }
        int var2 = field724 + 390;
        if (class141.field2161 >= var2 && class141.field2161 <= var2 + 14 && class141.field2160 >= 4 && class141.field2160 <= 18) {
            class26.method1090(1, 0);
            return;
        }
        if (class141.field2161 >= var2 + 15 && class141.field2161 <= var2 + 80 && class141.field2160 >= 4 && class141.field2160 <= 18) {
            class26.method1090(1, 1);
            return;
        }
        int var3 = field724 + 500;
        if (class141.field2161 >= var3 && class141.field2161 <= var3 + 14 && class141.field2160 >= 4 && class141.field2160 <= 18) {
            class26.method1090(2, 0);
            return;
        }
        if (class141.field2161 >= var3 + 15 && class141.field2161 <= var3 + 80 && class141.field2160 >= 4 && class141.field2160 <= 18) {
            class26.method1090(2, 1);
            return;
        }
        int var4 = field724 + 610;
        if (class141.field2161 >= var4 && class141.field2161 <= var4 + 14 && class141.field2160 >= 4 && class141.field2160 <= 18) {
            class26.method1090(3, 0);
            return;
        }
        if (class141.field2161 >= var4 + 15 && class141.field2161 <= var4 + 80 && class141.field2160 >= 4 && class141.field2160 <= 18) {
            class26.method1090(3, 1);
            return;
        }
        if (class141.field2161 >= field724 + 708 && class141.field2160 >= 4 && class141.field2161 <= field724 + 708 + 50 && class141.field2160 <= 20) {
            field749 = false;
            Statics.field728.method1684(field724, 0);
            Statics.field729.method1684(field724 + 382, 0);
            Statics.field716.method1850(field724 + 382 - Statics.field716.field1420 / 2, 18);
            return;
        }
        if (field756 == -1) {
            return;
        }
        class26 var5 = Statics.field2052[field756];
        method803(var5);
        field749 = false;
        Statics.field728.method1684(field724, 0);
        Statics.field729.method1684(field724 + 382, 0);
        Statics.field716.method1850(field724 + 382 - Statics.field716.field1420 / 2, 18);
        return;
    }

    @ObfuscatedName("ac.x(Lv;B)V")
    public static void method803(class26 arg0) {
        if (arg0.method674() != client.field302) {
            client.field302 = arg0.method674();
            class52.method1875(arg0.method674());
        }
        Statics.field192 = arg0.field656;
        client.field297 = arg0.field647;
        client.field432 = arg0.field648;
        Statics.field681 = client.field353 == 0 ? 43594 : arg0.field647 + 40000;
        Statics.field333 = client.field353 == 0 ? 443 : arg0.field647 + 50000;
        Statics.field1001 = Statics.field681;
    }
}
