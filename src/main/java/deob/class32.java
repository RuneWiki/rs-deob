package deob;

import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("af")
public class class32 {

    @ObfuscatedName("af.h")
    public static int field708 = 0;

    @ObfuscatedName("af.e")
    public static int field718 = field708 + 202;

    @ObfuscatedName("af.u")
    public static int[] field720 = new int[256];

    @ObfuscatedName("af.j")
    public static int field722 = 0;

    @ObfuscatedName("af.z")
    public static int field723 = 0;

    @ObfuscatedName("af.aw")
    public static int field714 = 0;

    @ObfuscatedName("af.az")
    public static int field727 = 0;

    @ObfuscatedName("af.at")
    public static int field728 = 0;

    @ObfuscatedName("af.af")
    public static int field713 = 0;

    @ObfuscatedName("af.ax")
    public static int field730 = 10;

    @ObfuscatedName("af.ac")
    public static String field731 = "";

    @ObfuscatedName("af.am")
    public static int field732 = 0;

    @ObfuscatedName("af.ao")
    public static String field729 = "";

    @ObfuscatedName("af.ad")
    public static String field734 = "";

    @ObfuscatedName("af.ak")
    public static String field735 = "";

    @ObfuscatedName("af.au")
    public static String field736 = "";

    @ObfuscatedName("af.aa")
    public static String field737 = "";

    @ObfuscatedName("af.ai")
    public static class159 field738 = class159.field2573;

    @ObfuscatedName("af.as")
    public static boolean field721 = true;

    @ObfuscatedName("af.ap")
    public static int field747 = 0;

    @ObfuscatedName("af.ag")
    public static String field746 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("af.ab")
    public static String field742 = "1234567890";

    @ObfuscatedName("af.ae")
    public static boolean field741 = false;

    @ObfuscatedName("af.bx")
    public static int field744 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.c(I)I")
    public static int method719() {
        return 8;
    }

    @ObfuscatedName("v.k(Lek;I)V")
    public static void method564(class144 arg0) {
        if (!field741) {
            if ((class140.field2122 == 1 || !Statics.field208 && class140.field2122 == 4) && class140.field2123 >= field708 + 765 - 50 && class140.field2117 >= 453) {
                Statics.field2046.field134 = !Statics.field2046.field134;
                class9.method1993();
                if (Statics.field2046.field134) {
                    class183.method2591();
                } else {
                    class183.method179(Statics.field24, "scape main", "", 255, false);
                }
            }
            if (client.field379 != 5) {
                field728++;
                if (client.field379 == 10 || client.field379 == 11) {
                    if (client.field279 == 0) {
                        if (class140.field2122 == 1 || !Statics.field208 && class140.field2122 == 4) {
                            int var6 = field708 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class140.field2123 >= var6 && class140.field2123 <= var6 + var8 && class140.field2117 >= var7 && class140.field2117 <= var7 + var9) {
                                method640();
                                return;
                            }
                        }
                        if (Statics.field789 != null) {
                            method640();
                        }
                    }
                    int var10 = class140.field2122;
                    int var11 = class140.field2123;
                    int var12 = class140.field2117;
                    if (!Statics.field208 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field732 == 0) {
                        int var13 = field718 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            class138.method837(client.method919("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var15 = field718 + 180 + 80;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field486 & 0x4) != 0) {
                                if ((client.field486 & 0x400) == 0) {
                                    field729 = class157.field2501;
                                    field734 = class157.field2359;
                                    field735 = class157.field2503;
                                } else {
                                    field729 = class157.field2487;
                                    field734 = class157.field2508;
                                    field735 = class157.field2407;
                                }
                                field732 = 1;
                                field747 = 0;
                            } else if ((client.field486 & 0x400) == 0) {
                                field729 = class157.field2444;
                                field734 = class157.field2498;
                                field735 = class157.field2382;
                                field732 = 2;
                                field747 = 0;
                            } else {
                                field729 = class157.field2504;
                                field734 = class157.field2505;
                                field735 = class157.field2497;
                                field732 = 1;
                                field747 = 0;
                            }
                        }
                    } else if (field732 == 1) {
                        while (Statics.method2752()) {
                            if (Statics.field2230 == 84) {
                                field729 = class157.field2444;
                                field734 = class157.field2498;
                                field735 = class157.field2382;
                                field732 = 2;
                                field747 = 0;
                            } else if (Statics.field2230 == 13) {
                                field732 = 0;
                            }
                        }
                        int var16 = field718 + 180 - 80;
                        short var17 = 321;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field729 = class157.field2444;
                            field734 = class157.field2498;
                            field735 = class157.field2382;
                            field732 = 2;
                            field747 = 0;
                        }
                        int var18 = field718 + 180 + 80;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field732 = 0;
                        }
                    } else if (field732 == 2) {
                        short var19 = 231;
                        int var37 = var19 + 30;
                        if (var10 == 1 && var12 >= var37 - 15 && var12 < var37) {
                            field747 = 0;
                        }
                        var37 += 15;
                        if (var10 == 1 && var12 >= var37 - 15 && var12 < var37) {
                            field747 = 1;
                        }
                        var37 += 15;
                        short var20 = 361;
                        if (var10 == 1 && var12 >= var20 - 15 && var12 < var20) {
                            method2973(class157.field2379, class157.field2529, class157.field2530);
                            field732 = 5;
                            return;
                        }
                        int var21 = field718 + 180 - 80;
                        short var22 = 321;
                        if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field736 = field736.trim();
                            if (field736.length() == 0) {
                                method2973(class157.field2292, class157.field2404, class157.field2410);
                                return;
                            }
                            if (field737.length() == 0) {
                                method2973(class157.field2458, class157.field2557, class157.field2408);
                                return;
                            }
                            method2973(class157.field2512, class157.field2399, class157.field2514);
                            field738 = Statics.field2046.field136.containsKey(class163.method106(field736)) ? class159.field2574 : class159.field2573;
                            client.method145(20);
                            return;
                        }
                        int var23 = field718 + 180 + 80;
                        if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field732 = 0;
                            field736 = "";
                            field737 = "";
                            Statics.field2220 = 0;
                            Statics.field1095 = "";
                            field721 = true;
                        }
                        while (true) {
                            while (Statics.method2752()) {
                                boolean var24 = false;
                                for (int var25 = 0; var25 < field746.length(); var25++) {
                                    if (Statics.field167 == field746.charAt(var25)) {
                                        var24 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2230 == 13) {
                                    field732 = 0;
                                    field736 = "";
                                    field737 = "";
                                    Statics.field2220 = 0;
                                    Statics.field1095 = "";
                                    field721 = true;
                                } else if (field747 == 0) {
                                    if (Statics.field2230 == 85 && field736.length() > 0) {
                                        field736 = field736.substring(0, field736.length() - 1);
                                    }
                                    if (Statics.field2230 == 84 || Statics.field2230 == 80) {
                                        field747 = 1;
                                    }
                                    if (var24 && field736.length() < 320) {
                                        field736 = field736 + Statics.field167;
                                    }
                                } else if (field747 == 1) {
                                    if (Statics.field2230 == 85 && field737.length() > 0) {
                                        field737 = field737.substring(0, field737.length() - 1);
                                    }
                                    if (Statics.field2230 == 84 || Statics.field2230 == 80) {
                                        field747 = 0;
                                    }
                                    if (Statics.field2230 == 84) {
                                        field736 = field736.trim();
                                        if (field736.length() == 0) {
                                            method2973(class157.field2292, class157.field2404, class157.field2410);
                                            return;
                                        }
                                        if (field737.length() == 0) {
                                            method2973(class157.field2458, class157.field2557, class157.field2408);
                                            return;
                                        }
                                        method2973(class157.field2512, class157.field2399, class157.field2514);
                                        field738 = Statics.field2046.field136.containsKey(class163.method106(field736)) ? class159.field2574 : class159.field2573;
                                        client.method145(20);
                                        return;
                                    }
                                    if (var24 && field737.length() < 20) {
                                        field737 = field737 + Statics.field167;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field732 == 4) {
                        int var26 = field718 + 180 - 80;
                        short var27 = 321;
                        if (var10 == 1 && var11 >= var26 - 75 && var11 <= var26 + 75 && var12 >= var27 - 20 && var12 <= var27 + 20) {
                            Statics.field1095.trim();
                            if (Statics.field1095.length() != 6) {
                                method2973(class157.field2319, class157.field2467, class157.field2321);
                                return;
                            }
                            Statics.field2220 = Integer.parseInt(Statics.field1095);
                            Statics.field1095 = "";
                            field738 = field721 ? class159.field2579 : class159.field2572;
                            method2973(class157.field2512, class157.field2399, class157.field2514);
                            client.method145(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field718 + 180 - 9 && var11 <= field718 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field721 = !field721;
                        }
                        if (var10 == 1 && var11 >= field718 + 180 - 34 && var11 <= field718 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            class138.method837(client.method919("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var28 = field718 + 180 + 80;
                        if (var10 == 1 && var11 >= var28 - 75 && var11 <= var28 + 75 && var12 >= var27 - 20 && var12 <= var27 + 20) {
                            field732 = 0;
                            field736 = "";
                            field737 = "";
                            Statics.field2220 = 0;
                            Statics.field1095 = "";
                        }
                        while (Statics.method2752()) {
                            boolean var29 = false;
                            for (int var30 = 0; var30 < field742.length(); var30++) {
                                if (Statics.field167 == field742.charAt(var30)) {
                                    var29 = true;
                                    break;
                                }
                            }
                            if (Statics.field2230 == 13) {
                                field732 = 0;
                                field736 = "";
                                field737 = "";
                                Statics.field2220 = 0;
                                Statics.field1095 = "";
                            } else {
                                if (Statics.field2230 == 85 && Statics.field1095.length() > 0) {
                                    Statics.field1095 = Statics.field1095.substring(0, Statics.field1095.length() - 1);
                                }
                                if (Statics.field2230 == 84) {
                                    Statics.field1095.trim();
                                    if (Statics.field1095.length() != 6) {
                                        method2973(class157.field2319, class157.field2467, class157.field2321);
                                        return;
                                    }
                                    Statics.field2220 = Integer.parseInt(Statics.field1095);
                                    Statics.field1095 = "";
                                    field738 = field721 ? class159.field2579 : class159.field2572;
                                    method2973(class157.field2512, class157.field2399, class157.field2514);
                                    client.method145(20);
                                    return;
                                }
                                if (var29 && Statics.field1095.length() < 6) {
                                    Statics.field1095 = Statics.field1095 + Statics.field167;
                                }
                            }
                        }
                    } else if (field732 == 5) {
                        int var31 = field718 + 180 - 80;
                        short var32 = 321;
                        if (var10 == 1 && var11 >= var31 - 75 && var11 <= var31 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            method693();
                            return;
                        }
                        int var33 = field718 + 180 + 80;
                        if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            field729 = class157.field2444;
                            field734 = class157.field2498;
                            field735 = class157.field2382;
                            field732 = 2;
                            field747 = 0;
                            field737 = "";
                        }
                        while (Statics.method2752()) {
                            boolean var34 = false;
                            for (int var35 = 0; var35 < field746.length(); var35++) {
                                if (Statics.field167 == field746.charAt(var35)) {
                                    var34 = true;
                                    break;
                                }
                            }
                            if (Statics.field2230 == 13) {
                                field729 = class157.field2444;
                                field734 = class157.field2498;
                                field735 = class157.field2382;
                                field732 = 2;
                                field747 = 0;
                                field737 = "";
                            } else {
                                if (Statics.field2230 == 85 && field736.length() > 0) {
                                    field736 = field736.substring(0, field736.length() - 1);
                                }
                                if (Statics.field2230 == 84) {
                                    method693();
                                    return;
                                }
                                if (var34 && field736.length() < 320) {
                                    field736 = field736 + Statics.field167;
                                }
                            }
                        }
                    } else if (field732 == 6) {
                        while (true) {
                            do {
                                if (!Statics.method2752()) {
                                    short var36 = 321;
                                    if (var10 == 1 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                                        field729 = class157.field2444;
                                        field734 = class157.field2498;
                                        field735 = class157.field2382;
                                        field732 = 2;
                                        field747 = 0;
                                        field737 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2230 != 84 && Statics.field2230 != 13);
                            field729 = class157.field2444;
                            field734 = class157.field2498;
                            field735 = class157.field2382;
                            field732 = 2;
                            field747 = 0;
                            field737 = "";
                        }
                    }
                }
            }
        } else if (class140.field2122 == 1 || !Statics.field208 && class140.field2122 == 4) {
            int var1 = field708 + 280;
            if (class140.field2123 >= var1 && class140.field2123 <= var1 + 14 && class140.field2117 >= 4 && class140.field2117 <= 18) {
                class26.method1981(0, 0);
            } else if (class140.field2123 >= var1 + 15 && class140.field2123 <= var1 + 80 && class140.field2117 >= 4 && class140.field2117 <= 18) {
                class26.method1981(0, 1);
            } else {
                int var2 = field708 + 390;
                if (class140.field2123 >= var2 && class140.field2123 <= var2 + 14 && class140.field2117 >= 4 && class140.field2117 <= 18) {
                    class26.method1981(1, 0);
                } else if (class140.field2123 >= var2 + 15 && class140.field2123 <= var2 + 80 && class140.field2117 >= 4 && class140.field2117 <= 18) {
                    class26.method1981(1, 1);
                } else {
                    int var3 = field708 + 500;
                    if (class140.field2123 >= var3 && class140.field2123 <= var3 + 14 && class140.field2117 >= 4 && class140.field2117 <= 18) {
                        class26.method1981(2, 0);
                    } else if (class140.field2123 >= var3 + 15 && class140.field2123 <= var3 + 80 && class140.field2117 >= 4 && class140.field2117 <= 18) {
                        class26.method1981(2, 1);
                    } else {
                        int var4 = field708 + 610;
                        if (class140.field2123 >= var4 && class140.field2123 <= var4 + 14 && class140.field2117 >= 4 && class140.field2117 <= 18) {
                            class26.method1981(3, 0);
                        } else if (class140.field2123 >= var4 + 15 && class140.field2123 <= var4 + 80 && class140.field2117 >= 4 && class140.field2117 <= 18) {
                            class26.method1981(3, 1);
                        } else if (class140.field2123 >= field708 + 708 && class140.field2117 >= 4 && class140.field2123 <= field708 + 708 + 50 && class140.field2117 <= 20) {
                            field741 = false;
                            Statics.field711.method1615(field708, 0);
                            Statics.field712.method1615(field708 + 382, 0);
                            Statics.field750.method1706(field708 + 382 - Statics.field750.field1410 / 2, 18);
                        } else if (field744 != -1) {
                            class26 var5 = Statics.field645[field744];
                            method617(var5);
                            field741 = false;
                            Statics.field711.method1615(field708, 0);
                            Statics.field712.method1615(field708 + 382, 0);
                            Statics.field750.method1706(field708 + 382 - Statics.field750.field1410 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.t(I)V")
    public static void method693() {
        field736 = field736.trim();
        if (field736.length() == 0) {
            method2973(class157.field2379, class157.field2529, class157.field2530);
            return;
        }
        long var0 = class10.method1175();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field736;
            Random var4 = new Random();
            class119 var5 = new class119(128);
            class119 var6 = new class119(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2276(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2484(var4.nextInt());
            }
            var5.method2484(var7[0]);
            var5.method2484(var7[1]);
            var5.method2281(var0);
            var5.method2281(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2484(var4.nextInt());
            }
            var5.method2311(class10.field145, class10.field147);
            var6.method2276(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2484(var4.nextInt());
            }
            var6.method2281(var4.nextLong());
            var6.method2365(var4.nextLong());
            class149.method2643(var6);
            var6.method2281(var4.nextLong());
            var6.method2311(class10.field145, class10.field147);
            int var11 = class119.method224(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class119 var12 = new class119(var11);
            var12.method2282(var3);
            var12.field1955 = var11;
            var12.method2307(var7);
            class119 var13 = new class119(var12.field1955 + var6.field1955 + var5.field1955 + 5);
            var13.method2276(2);
            var13.method2276(var5.field1955);
            var13.method2285(var5.field1956, 0, var5.field1955);
            var13.method2276(var6.field1955);
            var13.method2285(var6.field1956, 0, var6.field1955);
            var13.method2451(var12.field1955);
            var13.method2285(var12.field1956, 0, var12.field1955);
            byte[] var14 = var13.field1956;
            String var15 = class161.method2903(var14, 0, var14.length);
            String var16 = var15;
            byte var23;
            try {
                URL var17 = new URL(client.method919("services", false) + "m=accountappeal/login.ws");
                URLConnection var18 = var17.openConnection();
                var18.setDoInput(true);
                var18.setDoOutput(true);
                var18.setConnectTimeout(5000);
                OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream());
                var19.write("data2=" + class226.method2078(var16) + "&dest=" + class226.method2078("passwordchoice.ws"));
                var19.flush();
                InputStream var20 = var18.getInputStream();
                class119 var21 = new class119(new byte[1000]);
                while (true) {
                    int var22 = var20.read(var21.field1956, var21.field1955, 1000 - var21.field1955);
                    if (var22 == -1) {
                        var19.close();
                        var20.close();
                        String var24 = new String(var21.field1956);
                        if (var24.startsWith("OFFLINE")) {
                            var23 = 4;
                        } else if (var24.startsWith("WRONG")) {
                            var23 = 7;
                        } else if (var24.startsWith("RELOAD")) {
                            var23 = 3;
                        } else if (var24.startsWith("Not permitted for social network accounts.")) {
                            var23 = 6;
                        } else {
                            var21.method2308(var7);
                            while (var21.field1955 > 0 && var21.field1956[var21.field1955 - 1] == 0) {
                                var21.field1955--;
                            }
                            String var25 = new String(var21.field1956, 0, var21.field1955);
                            if (class10.method2612(var25)) {
                                class138.method837(var25, true, false);
                                var23 = 2;
                            } else {
                                var23 = 5;
                            }
                        }
                        break;
                    }
                    var21.field1955 += var22;
                    if (var21.field1955 >= 1000) {
                        var23 = 5;
                        break;
                    }
                }
            } catch (Throwable var27) {
                var27.printStackTrace();
                var23 = 5;
            }
            var2 = var23;
        }
        switch(var2) {
            case 2:
                method2973(class157.field2531, class157.field2520, class157.field2533);
                field732 = 6;
                break;
            case 3:
                method2973(class157.field2534, class157.field2360, class157.field2536);
                break;
            case 4:
                method2973(class157.field2437, class157.field2516, class157.field2539);
                break;
            case 5:
                method2973(class157.field2540, class157.field2445, class157.field2542);
                break;
            case 6:
                method2973(class157.field2543, class157.field2544, class157.field2385);
                break;
            case 7:
                method2973(class157.field2507, class157.field2547, class157.field2548);
        }
    }

    @ObfuscatedName("ap.g(Lhf;Lhf;Lhf;ZI)V")
    public static void method909(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field708 = (Statics.field1604 - client.field448 * 765) / 2;
            field718 = field708 + 202;
        }
        if (field741) {
            if (Statics.field1532 == null) {
                Statics.field1532 = class77.method186(Statics.field2154, "sl_back", "");
            }
            if (Statics.field580 == null) {
                Statics.field580 = class77.method706(Statics.field2154, "sl_flags", "");
            }
            if (Statics.field164 == null) {
                Statics.field164 = class77.method706(Statics.field2154, "sl_arrows", "");
            }
            if (Statics.field2255 == null) {
                Statics.field2255 = class77.method706(Statics.field2154, "sl_stars", "");
            }
            class80.method1661(field708, 23, 765, 480, 0);
            class80.method1700(field708, 0, 125, 23, 12425273, 9135624);
            class80.method1700(field708 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3739(class157.field2549, field708 + 62, 15, 0, -1);
            if (Statics.field2255 != null) {
                Statics.field2255[1].method1706(field708 + 140, 1);
                arg1.method3737(class157.field2377, field708 + 152, 10, 16777215, -1);
                Statics.field2255[0].method1706(field708 + 140, 12);
                arg1.method3737(class157.field2551, field708 + 152, 21, 16777215, -1);
            }
            if (Statics.field164 != null) {
                int var4 = field708 + 280;
                if (class26.field634[0] == 0 && class26.field635[0] == 0) {
                    Statics.field164[2].method1706(var4, 4);
                } else {
                    Statics.field164[0].method1706(var4, 4);
                }
                if (class26.field634[0] == 0 && class26.field635[0] == 1) {
                    Statics.field164[3].method1706(var4 + 15, 4);
                } else {
                    Statics.field164[1].method1706(var4 + 15, 4);
                }
                arg0.method3737(class157.field2326, var4 + 32, 17, 16777215, -1);
                int var5 = field708 + 390;
                if (class26.field634[0] == 1 && class26.field635[0] == 0) {
                    Statics.field164[2].method1706(var5, 4);
                } else {
                    Statics.field164[0].method1706(var5, 4);
                }
                if (class26.field634[0] == 1 && class26.field635[0] == 1) {
                    Statics.field164[3].method1706(var5 + 15, 4);
                } else {
                    Statics.field164[1].method1706(var5 + 15, 4);
                }
                arg0.method3737(class157.field2553, var5 + 32, 17, 16777215, -1);
                int var6 = field708 + 500;
                if (class26.field634[0] == 2 && class26.field635[0] == 0) {
                    Statics.field164[2].method1706(var6, 4);
                } else {
                    Statics.field164[0].method1706(var6, 4);
                }
                if (class26.field634[0] == 2 && class26.field635[0] == 1) {
                    Statics.field164[3].method1706(var6 + 15, 4);
                } else {
                    Statics.field164[1].method1706(var6 + 15, 4);
                }
                arg0.method3737(class157.field2554, var6 + 32, 17, 16777215, -1);
                int var7 = field708 + 610;
                if (class26.field634[0] == 3 && class26.field635[0] == 0) {
                    Statics.field164[2].method1706(var7, 4);
                } else {
                    Statics.field164[0].method1706(var7, 4);
                }
                if (class26.field634[0] == 3 && class26.field635[0] == 1) {
                    Statics.field164[3].method1706(var7 + 15, 4);
                } else {
                    Statics.field164[1].method1706(var7 + 15, 4);
                }
                arg0.method3737(class157.field2443, var7 + 32, 17, 16777215, -1);
            }
            class80.method1661(field708 + 708, 4, 50, 16, 0);
            arg1.method3739(class157.field2522, field708 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field486 & var9;
            for (int var11 = 0; var11 < class26.field631; var11++) {
                class26 var12 = Statics.field645[var11];
                if ((var12.field643 & var9) == var10 || (var12.field643 & var9) == 0) {
                    var8++;
                }
            }
            field744 = -1;
            if (Statics.field1532 != null) {
                byte var13 = 88;
                byte var14 = 19;
                int var15 = 765 / (var13 + 1);
                int var16 = 480 / (var14 + 1);
                int var17;
                int var18;
                do {
                    var17 = var16;
                    var18 = var15;
                    if ((var15 - 1) * var16 >= var8) {
                        var15--;
                    }
                    if ((var16 - 1) * var15 >= var8) {
                        var16--;
                    }
                    if ((var16 - 1) * var15 >= var8) {
                        var16--;
                    }
                } while (var16 != var17 || var15 != var18);
                int var19 = (765 - var13 * var15) / (var15 + 1);
                if (var19 > 5) {
                    var19 = 5;
                }
                int var20 = (480 - var14 * var16) / (var16 + 1);
                if (var20 > 5) {
                    var20 = 5;
                }
                int var21 = (765 - var13 * var15 - (var15 - 1) * var19) / 2;
                int var22 = (480 - var14 * var16 - (var16 - 1) * var20) / 2;
                int var23 = var22 + 23;
                int var24 = field708 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class26.field631; var27++) {
                    class26 var28 = Statics.field645[var27];
                    if ((var28.field643 & var9) == var10 || (var28.field643 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field637);
                        if (var28.field637 == -1) {
                            var30 = class157.field2556;
                            var29 = false;
                        } else if (var28.field637 > 1980) {
                            var30 = class157.field2366;
                            var29 = false;
                        }
                        byte var31;
                        if (var28.method595()) {
                            if (var28.method585()) {
                                var31 = 3;
                            } else {
                                var31 = 2;
                            }
                        } else if (var28.method585()) {
                            var31 = 1;
                        } else {
                            var31 = 0;
                        }
                        if (class140.field2116 >= var24 && class140.field2120 >= var23 && class140.field2116 < var13 + var24 && class140.field2120 < var14 + var23 && var29) {
                            field744 = var27;
                            Statics.field1532[var31].method1606(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field1532[var31].method1615(var24, var23);
                        }
                        if (Statics.field580 != null) {
                            Statics.field580[(var28.method585() ? 8 : 0) + var28.field640].method1706(var24 + 29, var23);
                        }
                        arg0.method3739(Integer.toString(var28.field628), var24 + 15, var14 / 2 + var23 + 5, 0, -1);
                        arg1.method3739(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
                        var23 += var14 + var20;
                        var25++;
                        if (var25 >= var16) {
                            var23 = var22 + 23;
                            var24 += var13 + var19;
                            var25 = 0;
                        }
                    }
                }
                if (var26) {
                    int var32 = arg1.method3732(Statics.field645[field744].field639) + 6;
                    int var33 = arg1.field3165 + 8;
                    class80.method1661(class140.field2116 - var32 / 2, class140.field2120 + 20 + 5, var32, var33, 16777120);
                    class80.method1683(class140.field2116 - var32 / 2, class140.field2120 + 20 + 5, var32, var33, 0);
                    arg1.method3739(Statics.field645[field744].field639, class140.field2116, class140.field2120 + 20 + 5 + arg1.field3165 + 4, 0, -1);
                }
            }
            try {
                Graphics var34 = Statics.field1839.getGraphics();
                Statics.field211.method1486(var34, 0, 0);
            } catch (Exception var78) {
                Statics.field1839.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field711.method1615(field708, 0);
            Statics.field712.method1615(field708 + 382, 0);
            Statics.field750.method1706(field708 + 382 - Statics.field750.field1410 / 2, 18);
        }
        if (client.field379 == 0 || client.field379 == 5) {
            byte var36 = 20;
            arg0.method3739(class157.field2496, field718 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class80.method1683(field718 + 180 - 152, var37, 304, 34, 9179409);
            class80.method1683(field718 + 180 - 151, var37 + 1, 302, 32, 0);
            class80.method1661(field718 + 180 - 150, var37 + 2, field730 * 3, 30, 9179409);
            class80.method1661(field730 * 3 + (field718 + 180 - 150), var37 + 2, 300 - field730 * 3, 30, 0);
            arg0.method3739(field731, field718 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field379 == 20) {
            Statics.field726.method1706(field718 + 180 - Statics.field726.field1410 / 2, 271 - Statics.field726.field1408 / 2);
            short var38 = 211;
            arg0.method3739(field729, field718 + 180, var38, 16776960, 0);
            int var80 = var38 + 15;
            arg0.method3739(field734, field718 + 180, var80, 16776960, 0);
            int var81 = var80 + 15;
            arg0.method3739(field735, field718 + 180, var81, 16776960, 0);
            int var82 = var81 + 15;
            int var83 = var82 + 10;
            if (field732 != 4) {
                arg0.method3737(class157.field2515, field718 + 180 - 110, var83, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field736; arg0.method3732(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method3737(class223.method3736(var40), field718 + 180 - 70, var83, 16777215, 0);
                var80 = var83 + 15;
                arg0.method3737(class157.field2332 + class163.method723(field737), field718 + 180 - 108, var80, 16777215, 0);
                var80 += 15;
            }
        }
        if (client.field379 == 10 || client.field379 == 11) {
            Statics.field726.method1706(field718, 171);
            if (field732 == 0) {
                short var41 = 251;
                arg0.method3739(class157.field2518, field718 + 180, var41, 16776960, 0);
                int var84 = var41 + 30;
                int var42 = field718 + 180 - 80;
                short var43 = 291;
                Statics.field710.method1706(var42 - 73, var43 - 20);
                arg0.method3799(class157.field2333, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field718 + 180 + 80;
                Statics.field710.method1706(var44 - 73, var43 - 20);
                arg0.method3799(class157.field2339, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field732 == 1) {
                arg0.method3739(class157.field2500, field718 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3739(field729, field718 + 180, var45, 16777215, 0);
                int var85 = var45 + 15;
                arg0.method3739(field734, field718 + 180, var85, 16777215, 0);
                int var86 = var85 + 15;
                arg0.method3739(field735, field718 + 180, var86, 16777215, 0);
                int var87 = var86 + 15;
                int var46 = field718 + 180 - 80;
                short var47 = 321;
                Statics.field710.method1706(var46 - 73, var47 - 20);
                arg0.method3739(class157.field2291, var46, var47 + 5, 16777215, 0);
                int var48 = field718 + 180 + 80;
                Statics.field710.method1706(var48 - 73, var47 - 20);
                arg0.method3739(class157.field2522, var48, var47 + 5, 16777215, 0);
            } else if (field732 == 2) {
                short var49 = 211;
                arg0.method3739(field729, field718 + 180, var49, 16776960, 0);
                int var88 = var49 + 15;
                arg0.method3739(field734, field718 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                arg0.method3739(field735, field718 + 180, var89, 16776960, 0);
                int var90 = var89 + 15;
                int var91 = var90 + 10;
                arg0.method3737(class157.field2515, field718 + 180 - 110, var91, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field736; arg0.method3732(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3737(class223.method3736(var51) + (field747 == 0 & client.field285 % 40 < 20 ? class2.method22(16776960) + class2.field25 : ""), field718 + 180 - 70, var91, 16777215, 0);
                var88 = var91 + 15;
                arg0.method3737(class157.field2332 + class163.method723(field737) + (field747 == 1 & client.field285 % 40 < 20 ? class2.method22(16776960) + class2.field25 : ""), field718 + 180 - 108, var88, 16777215, 0);
                var88 += 15;
                int var52 = field718 + 180 - 80;
                short var53 = 321;
                Statics.field710.method1706(var52 - 73, var53 - 20);
                arg0.method3739(class157.field2471, var52, var53 + 5, 16777215, 0);
                int var54 = field718 + 180 + 80;
                Statics.field710.method1706(var54 - 73, var53 - 20);
                arg0.method3739(class157.field2522, var54, var53 + 5, 16777215, 0);
                short var55 = 357;
                arg1.method3739(class157.field2523, field718 + 180, var55, 16776960, 0);
            } else if (field732 == 4) {
                arg0.method3739(class157.field2510, field718 + 180, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3739(field729, field718 + 180, var56, 16777215, 0);
                int var92 = var56 + 15;
                arg0.method3739(field734, field718 + 180, var92, 16777215, 0);
                int var93 = var92 + 15;
                arg0.method3739(field735, field718 + 180, var93, 16777215, 0);
                int var94 = var93 + 15;
                arg0.method3737(class157.field2517 + class163.method723(Statics.field1095) + (client.field285 % 40 < 20 ? class2.method22(16776960) + class2.field25 : ""), field718 + 180 - 108, var94, 16777215, 0);
                int var95 = var94 - 8;
                arg0.method3737(class157.field2293, field718 + 180 - 9, var95, 16776960, 0);
                int var96 = var95 + 15;
                arg0.method3737(class157.field2294, field718 + 180 - 9, var96, 16776960, 0);
                int var57 = field718 + 180 - 9 + arg0.method3732(class157.field2294) + 15;
                int var58 = var96 - arg0.field3165;
                class81 var59;
                if (field721) {
                    var59 = Statics.field715;
                } else {
                    var59 = Statics.field739;
                }
                var59.method1706(var57, var58);
                var92 = var96 + 15;
                int var60 = field718 + 180 - 80;
                short var61 = 321;
                Statics.field710.method1706(var60 - 73, var61 - 20);
                arg0.method3739(class157.field2291, var60, var61 + 5, 16777215, 0);
                int var62 = field718 + 180 + 80;
                Statics.field710.method1706(var62 - 73, var61 - 20);
                arg0.method3739(class157.field2522, var62, var61 + 5, 16777215, 0);
                arg1.method3739(class157.field2511, field718 + 180, var61 + 36, 255, 0);
            } else if (field732 == 5) {
                arg0.method3739(class157.field2439, field718 + 180, 201, 16776960, 0);
                short var63 = 221;
                arg2.method3739(field729, field718 + 180, var63, 16776960, 0);
                int var97 = var63 + 15;
                arg2.method3739(field734, field718 + 180, var97, 16776960, 0);
                int var98 = var97 + 15;
                arg2.method3739(field735, field718 + 180, var98, 16776960, 0);
                int var99 = var98 + 15;
                int var100 = var99 + 14;
                arg0.method3737(class157.field2525, field718 + 180 - 145, var100, 16777215, 0);
                short var64 = 174;
                String var65;
                for (var65 = field736; arg0.method3732(var65) > var64; var65 = var65.substring(1)) {
                }
                arg0.method3737(class223.method3736(var65) + (client.field285 % 40 < 20 ? class2.method22(16776960) + class2.field25 : ""), field718 + 180 - 34, var100, 16777215, 0);
                var97 = var100 + 15;
                int var66 = field718 + 180 - 80;
                short var67 = 321;
                Statics.field710.method1706(var66 - 73, var67 - 20);
                arg0.method3739(class157.field2513, var66, var67 + 5, 16777215, 0);
                int var68 = field718 + 180 + 80;
                Statics.field710.method1706(var68 - 73, var67 - 20);
                arg0.method3739(class157.field2527, var68, var67 + 5, 16777215, 0);
            } else if (field732 == 6) {
                short var69 = 211;
                arg0.method3739(field729, field718 + 180, var69, 16776960, 0);
                int var101 = var69 + 15;
                arg0.method3739(field734, field718 + 180, var101, 16776960, 0);
                int var102 = var101 + 15;
                arg0.method3739(field735, field718 + 180, var102, 16776960, 0);
                int var103 = var102 + 15;
                int var70 = field718 + 180;
                short var71 = 321;
                Statics.field710.method1706(var70 - 73, var71 - 20);
                arg0.method3739(class157.field2527, var70, var71 + 5, 16777215, 0);
            }
        }
        if (field728 > 0) {
            Statics.method3358(field728);
            field728 = 0;
        }
        Statics.method2201();
        Statics.field2988[Statics.field2046.field134 ? 1 : 0].method1706(field708 + 765 - 40, 463);
        if (client.field379 > 5 && client.field279 == 0) {
            if (Statics.field203 == null) {
                Statics.field203 = class77.method871(Statics.field2154, "sl_button", "");
            } else {
                int var72 = field708 + 5;
                short var73 = 463;
                byte var74 = 100;
                byte var75 = 35;
                Statics.field203.method1706(var72, var73);
                arg0.method3739(class157.field2451 + " " + client.field273, var74 / 2 + var72, var75 / 2 + var73 - 2, 16777215, 0);
                if (Statics.field789 == null) {
                    arg1.method3739(class157.field2303, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                } else {
                    arg1.method3739(class157.field2558, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var76 = Statics.field1839.getGraphics();
            Statics.field211.method1486(var76, 0, 0);
        } catch (Exception var79) {
            Statics.field1839.repaint();
        }
    }

    @ObfuscatedName("fn.o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2973(String arg0, String arg1, String arg2) {
        field729 = arg0;
        field734 = arg1;
        field735 = arg2;
    }

    @ObfuscatedName("dr.i(Lcp;B)V")
    public static final void method2206(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field706.length; var2++) {
            Statics.field706[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field706[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field2697[var8] = (Statics.field706[var8 - 1] + Statics.field706[var8 + 1] + Statics.field706[var8 - 128] + Statics.field706[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field706;
            Statics.field706 = Statics.field2697;
            Statics.field2697 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1408; var11++) {
            for (int var12 = 0; var12 < arg0.field1410; var12++) {
                if (arg0.field1409[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1407;
                    int var14 = var11 + 16 + arg0.field1405;
                    int var15 = (var14 << 7) + var13;
                    Statics.field706[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("f.m(IIII)I")
    public static final int method152(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("aj.y(Lp;I)V")
    public static void method617(class26 arg0) {
        if (arg0.method585() != client.field454) {
            client.field454 = arg0.method585();
            boolean var1 = arg0.method585();
            if (Statics.field1106 != var1) {
                class52.method176();
                Statics.field1106 = var1;
            }
        }
        Statics.field660 = arg0.field636;
        client.field273 = arg0.field628;
        client.field486 = arg0.field643;
        Statics.field787 = client.field301 == 0 ? 43594 : arg0.field628 + 40000;
        Statics.field20 = client.field301 == 0 ? 443 : arg0.field628 + 50000;
        Statics.field2896 = Statics.field787;
    }

    @ObfuscatedName("az.q(I)V")
    public static void method640() {
        if (class26.method572()) {
            field741 = true;
        }
    }
}
