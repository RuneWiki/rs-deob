package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Random;

@ObfuscatedName("cr")
public class class86 {

    @ObfuscatedName("cr.b")
    public static int field1176 = 0;

    @ObfuscatedName("cr.s")
    public static int field1182 = field1176 + 202;

    @ObfuscatedName("cr.m")
    public static int field1183 = 10;

    @ObfuscatedName("cr.v")
    public static String field1194 = "";

    @ObfuscatedName("cr.ai")
    public static int field1186 = -1;

    @ObfuscatedName("cr.aw")
    public static int field1187 = 1;

    @ObfuscatedName("cr.ar")
    public static int field1188 = 0;

    @ObfuscatedName("cr.av")
    public static String field1201 = "";

    @ObfuscatedName("cr.aq")
    public static String field1190 = "";

    @ObfuscatedName("cr.ac")
    public static String field1184 = "";

    @ObfuscatedName("cr.az")
    public static String field1192 = "";

    @ObfuscatedName("cr.at")
    public static String field1193 = "";

    @ObfuscatedName("cr.ae")
    public static String field1175 = "";

    @ObfuscatedName("cr.au")
    public static boolean field1174 = false;

    @ObfuscatedName("cr.as")
    public static boolean field1196 = false;

    @ObfuscatedName("cr.bo")
    public static boolean field1197 = true;

    @ObfuscatedName("cr.bx")
    public static int field1205 = 0;

    @ObfuscatedName("cr.bu")
    public static String field1199 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cr.bd")
    public static String field1200 = "1234567890";

    @ObfuscatedName("cr.bj")
    public static boolean field1185 = false;

    @ObfuscatedName("cr.bg")
    public static int field1179 = -1;

    @ObfuscatedName("cr.bw")
    public static int field1204 = 0;

    @ObfuscatedName("cr.be")
    public static int field1178 = 0;

    @ObfuscatedName("cr.bl")
    public static long field1206;

    @ObfuscatedName("cr.bp")
    public static long field1207;

    static {
        new DecimalFormat("##0.00");
        new class163();
        field1206 = -1L;
        field1207 = -1L;
    }

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.u(Lhf;Lhf;ZII)V")
    public static void method441(class234 arg0, class234 arg1, boolean arg2, int arg3) {
        if (!Statics.field1195) {
            field1188 = arg3;
            class321.method5592();
            byte[] var4 = arg0.method3864("title.jpg", "");
            Statics.field2502 = class50.method963(var4);
            Statics.field3842 = Statics.field2502.method5680();
            if ((client.field796 & 0x20000000) != 0) {
                Statics.field1455 = class326.method5408(arg1, "logo_deadman_mode", "");
            } else if ((client.field796 & 0x40000000) == 0) {
                Statics.field1455 = class326.method5408(arg1, "logo", "");
            } else {
                Statics.field1455 = class326.method5408(arg1, "logo_seasonal_mode", "");
            }
            Statics.field1177 = class326.method5408(arg1, "titlebox", "");
            Statics.field1189 = class326.method5408(arg1, "titlebutton", "");
            int var5 = arg1.method3917("runes");
            int var6 = arg1.method3901(var5, "");
            class324[] var7;
            if (class326.method1850(arg1, var5, var6)) {
                var7 = class326.method3052();
            } else {
                var7 = null;
            }
            Statics.field3313 = var7;
            int var9 = arg1.method3917("title_mute");
            int var10 = arg1.method3901(var9, "");
            class324[] var11;
            if (class326.method1850(arg1, var9, var10)) {
                var11 = class326.method3052();
            } else {
                var11 = null;
            }
            Statics.field1191 = var11;
            Statics.field565 = class326.method5408(arg1, "options_radio_buttons,0", "");
            Statics.field1180 = class326.method5408(arg1, "options_radio_buttons,4", "");
            Statics.field2533 = class326.method5408(arg1, "options_radio_buttons,2", "");
            Statics.field3316 = class326.method5408(arg1, "options_radio_buttons,6", "");
            Statics.field1116 = Statics.field565.field3863;
            Statics.field349 = Statics.field565.field3862;
            Statics.field1296 = new class73(Statics.field3313);
            if (arg2) {
                field1193 = "";
                field1175 = "";
            }
            Statics.field2396 = 0;
            Statics.field148 = "";
            field1197 = true;
            field1185 = false;
            if (Statics.field1978.field1048) {
                class198.method3069(2);
            } else {
                class236 var13 = Statics.field162;
                int var14 = var13.method3917("scape main");
                int var15 = var13.method3901(var14, "");
                class198.method1639(2, var13, var14, var15, 255, false);
            }
            if (Statics.field3187 != null) {
                try {
                    class300 var16 = new class300(4);
                    var16.method5290(3);
                    var16.method5323(0);
                    Statics.field3187.method3250(var16.field3708, 0, 4);
                } catch (IOException var20) {
                    try {
                        Statics.field3187.method3243();
                    } catch (Exception var19) {
                    }
                    class237.field3190++;
                    Statics.field3187 = null;
                }
            }
            Statics.field1195 = true;
            field1176 = (Statics.field1873 - 765) / 2;
            field1182 = field1176 + 202;
            Statics.field638 = field1182 + 180;
            Statics.field2502.method5689(field1176, 0);
            Statics.field3842.method5689(field1176 + 382, 0);
            Statics.field1455.method5660(field1176 + 382 - Statics.field1455.field3863 / 2, 18);
        } else if (arg3 == 4) {
            field1188 = 4;
        }
    }

    @ObfuscatedName("be.f(ZZB)Llm;")
    public static class324 method1575(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field3316 : Statics.field2533) : (arg1 ? Statics.field1180 : Statics.field565);
    }

    @ObfuscatedName("fg.b(I)Ljava/lang/String;")
    public static String method3315() {
        return Statics.field1978.field1051 ? class291.method3826(field1193) : field1193;
    }

    @ObfuscatedName("jt.g(I)V")
    public static void method4825() {
        if (client.field682 && field1193 != null && field1193.length() > 0) {
            field1205 = 1;
        } else {
            field1205 = 0;
        }
    }

    @ObfuscatedName("gu.p(CI)Z")
    public static boolean method3634(char arg0) {
        for (int var1 = 0; var1 < field1199.length(); var1++) {
            if (arg0 == field1199.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ht.h(ZI)V")
    public static void method3816(boolean arg0) {
        field1190 = class225.field3063;
        field1184 = class225.field3055;
        field1192 = class225.field3020;
        field1188 = 2;
        if (arg0) {
            field1175 = "";
        }
        if (field1193 == null || field1193.length() <= 0) {
            if (Statics.field1978.field1056 == null) {
                client.field682 = false;
            } else {
                field1193 = Statics.field1978.field1056;
                client.field682 = true;
            }
        }
        method4825();
    }

    @ObfuscatedName("bd.y(I)V")
    public static void method1012() {
        field1193 = field1193.trim();
        if (field1193.length() == 0) {
            method2089(class225.field3036, class225.field2839, class225.field3038);
            return;
        }
        long var0 = class81.method1011();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field1193;
            Random var4 = new Random();
            class300 var5 = new class300(128);
            class300 var6 = new class300(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method5290(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method5231(var4.nextInt());
            }
            var5.method5231(var7[0]);
            var5.method5231(var7[1]);
            var5.method5166(var0);
            var5.method5166(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method5231(var4.nextInt());
            }
            var5.method5161(class81.field1130, class81.field1131);
            var6.method5290(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method5231(var4.nextInt());
            }
            var6.method5166(var4.nextLong());
            var6.method5126(var4.nextLong());
            client.method84(var6);
            var6.method5166(var4.nextLong());
            var6.method5161(class81.field1130, class81.field1131);
            int var11 = class300.method3313(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class300 var12 = new class300(var11);
            var12.method5129(var3);
            var12.field3707 = var11;
            var12.method5157(var7);
            class300 var13 = new class300(var12.field3707 + var6.field3707 + var5.field3707 + 5);
            var13.method5290(2);
            var13.method5290(var5.field3707);
            var13.method5132(var5.field3708, 0, var5.field3707);
            var13.method5290(var6.field3707);
            var13.method5132(var6.field3708, 0, var6.field3707);
            var13.method5123(var12.field3707);
            var13.method5132(var12.field3708, 0, var12.field3707);
            String var14 = class290.method3830(var13.field3708);
            byte var39;
            try {
                URL var15 = new URL(client.method5119("services", false) + "m=accountappeal/login.ws");
                URLConnection var16 = var15.openConnection();
                var16.setDoInput(true);
                var16.setDoOutput(true);
                var16.setConnectTimeout(5000);
                OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
                int var19 = var14.length();
                StringBuilder var20 = new StringBuilder(var19);
                for (int var21 = 0; var21 < var19; var21++) {
                    char var22 = var14.charAt(var21);
                    if (!(var22 < 'a' || var22 > 'z') || !(var22 < 'A' || var22 > 'Z') || !(var22 < '0' || var22 > '9') || var22 == '.' || var22 == '-' || var22 == '*' || var22 == '_') {
                        var20.append(var22);
                    } else if (var22 == ' ') {
                        var20.append('+');
                    } else {
                        byte var23 = class288.method3812(var22);
                        var20.append('%');
                        int var24 = var23 >> 4 & 0xF;
                        if (var24 >= 10) {
                            var20.append((char) (var24 + 55));
                        } else {
                            var20.append((char) (var24 + 48));
                        }
                        int var25 = var23 & 0xF;
                        if (var25 >= 10) {
                            var20.append((char) (var25 + 55));
                        } else {
                            var20.append((char) (var25 + 48));
                        }
                    }
                }
                String var26 = var20.toString();
                String var27 = "data2=" + var26 + "&dest=";
                int var28 = "passwordchoice.ws".length();
                StringBuilder var29 = new StringBuilder(var28);
                for (int var30 = 0; var30 < var28; var30++) {
                    char var31 = "passwordchoice.ws".charAt(var30);
                    if (!(var31 < 'a' || var31 > 'z') || !(var31 < 'A' || var31 > 'Z') || !(var31 < '0' || var31 > '9') || var31 == '.' || var31 == '-' || var31 == '*' || var31 == '_') {
                        var29.append(var31);
                    } else if (var31 == ' ') {
                        var29.append('+');
                    } else {
                        byte var32 = class288.method3812(var31);
                        var29.append('%');
                        int var33 = var32 >> 4 & 0xF;
                        if (var33 >= 10) {
                            var29.append((char) (var33 + 55));
                        } else {
                            var29.append((char) (var33 + 48));
                        }
                        int var34 = var32 & 0xF;
                        if (var34 >= 10) {
                            var29.append((char) (var34 + 55));
                        } else {
                            var29.append((char) (var34 + 48));
                        }
                    }
                }
                String var35 = var29.toString();
                var17.write(var27 + var35);
                var17.flush();
                InputStream var36 = var16.getInputStream();
                class300 var37 = new class300(new byte[1000]);
                while (true) {
                    int var38 = var36.read(var37.field3708, var37.field3707, 1000 - var37.field3707);
                    if (var38 == -1) {
                        var17.close();
                        var36.close();
                        String var40 = new String(var37.field3708);
                        if (var40.startsWith("OFFLINE")) {
                            var39 = 4;
                        } else if (var40.startsWith("WRONG")) {
                            var39 = 7;
                        } else if (var40.startsWith("RELOAD")) {
                            var39 = 3;
                        } else if (var40.startsWith("Not permitted for social network accounts.")) {
                            var39 = 6;
                        } else {
                            var37.method5158(var7);
                            while (var37.field3707 > 0 && var37.field3708[var37.field3707 - 1] == 0) {
                                var37.field3707--;
                            }
                            String var41 = new String(var37.field3708, 0, var37.field3707);
                            if (class81.method368(var41)) {
                                class52.method582(var41, true, false);
                                var39 = 2;
                            } else {
                                var39 = 5;
                            }
                        }
                        break;
                    }
                    var37.field3707 += var38;
                    if (var37.field3707 >= 1000) {
                        var39 = 5;
                        break;
                    }
                }
            } catch (Throwable var43) {
                var43.printStackTrace();
                var39 = 5;
            }
            var2 = var39;
        }
        switch(var2) {
            case 2:
                method2089(class225.field2913, class225.field3040, class225.field2787);
                field1188 = 6;
                break;
            case 3:
                method2089(class225.field2849, class225.field3043, class225.field2994);
                break;
            case 4:
                method2089(class225.field3045, class225.field3013, class225.field3047);
                break;
            case 5:
                method2089(class225.field3048, class225.field3049, class225.field3050);
                break;
            case 6:
                method2089(class225.field3051, class225.field3052, class225.field2997);
                break;
            case 7:
                method2089(class225.field3054, class225.field2876, class225.field2853);
        }
    }

    @ObfuscatedName("gj.w(Lky;Lky;Lky;I)V")
    public static void method3337(class295 arg0, class295 arg1, class295 arg2) {
        field1176 = (Statics.field1873 - 765) / 2;
        field1182 = field1176 + 202;
        Statics.field638 = field1182 + 180;
        if (field1185) {
            if (Statics.field361 == null) {
                Statics.field361 = Statics.method5496(Statics.field244, "sl_back", "");
            }
            if (Statics.field544 == null) {
                class236 var3 = Statics.field244;
                int var4 = var3.method3917("sl_flags");
                int var5 = var3.method3901(var4, "");
                class324[] var6;
                if (class326.method1850(var3, var4, var5)) {
                    var6 = class326.method3052();
                } else {
                    var6 = null;
                }
                Statics.field544 = var6;
            }
            if (Statics.field350 == null) {
                class236 var8 = Statics.field244;
                int var9 = var8.method3917("sl_arrows");
                int var10 = var8.method3901(var9, "");
                class324[] var11;
                if (class326.method1850(var8, var9, var10)) {
                    var11 = class326.method3052();
                } else {
                    var11 = null;
                }
                Statics.field350 = var11;
            }
            if (Statics.field1113 == null) {
                class236 var13 = Statics.field244;
                int var14 = var13.method3917("sl_stars");
                int var15 = var13.method3901(var14, "");
                class324[] var16;
                if (class326.method1850(var13, var14, var15)) {
                    var16 = class326.method3052();
                } else {
                    var16 = null;
                }
                Statics.field1113 = var16;
            }
            if (Statics.field2756 == null) {
                Statics.field2756 = class326.method5408(Statics.field244, "leftarrow", "");
            }
            if (Statics.field3280 == null) {
                Statics.field3280 = class326.method5408(Statics.field244, "rightarrow", "");
            }
            class321.method5595(field1176, 23, 765, 480, 0);
            class321.method5590(field1176, 0, 125, 23, 12425273, 9135624);
            class321.method5590(field1176 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4996(class225.field3071, field1176 + 62, 15, 0, -1);
            if (Statics.field1113 != null) {
                Statics.field1113[1].method5660(field1176 + 140, 1);
                arg1.method4993(class225.field3062, field1176 + 152, 10, 16777215, -1);
                Statics.field1113[0].method5660(field1176 + 140, 12);
                arg1.method4993(class225.field3007, field1176 + 152, 21, 16777215, -1);
            }
            if (Statics.field350 != null) {
                int var18 = field1176 + 280;
                if (class72.field1012[0] == 0 && class72.field1009[0] == 0) {
                    Statics.field350[2].method5660(var18, 4);
                } else {
                    Statics.field350[0].method5660(var18, 4);
                }
                if (class72.field1012[0] == 0 && class72.field1009[0] == 1) {
                    Statics.field350[3].method5660(var18 + 15, 4);
                } else {
                    Statics.field350[1].method5660(var18 + 15, 4);
                }
                arg0.method4993(class225.field2774, var18 + 32, 17, 16777215, -1);
                int var19 = field1176 + 390;
                if (class72.field1012[0] == 1 && class72.field1009[0] == 0) {
                    Statics.field350[2].method5660(var19, 4);
                } else {
                    Statics.field350[0].method5660(var19, 4);
                }
                if (class72.field1012[0] == 1 && class72.field1009[0] == 1) {
                    Statics.field350[3].method5660(var19 + 15, 4);
                } else {
                    Statics.field350[1].method5660(var19 + 15, 4);
                }
                arg0.method4993(class225.field3065, var19 + 32, 17, 16777215, -1);
                int var20 = field1176 + 500;
                if (class72.field1012[0] == 2 && class72.field1009[0] == 0) {
                    Statics.field350[2].method5660(var20, 4);
                } else {
                    Statics.field350[0].method5660(var20, 4);
                }
                if (class72.field1012[0] == 2 && class72.field1009[0] == 1) {
                    Statics.field350[3].method5660(var20 + 15, 4);
                } else {
                    Statics.field350[1].method5660(var20 + 15, 4);
                }
                arg0.method4993(class225.field2916, var20 + 32, 17, 16777215, -1);
                int var21 = field1176 + 610;
                if (class72.field1012[0] == 3 && class72.field1009[0] == 0) {
                    Statics.field350[2].method5660(var21, 4);
                } else {
                    Statics.field350[0].method5660(var21, 4);
                }
                if (class72.field1012[0] == 3 && class72.field1009[0] == 1) {
                    Statics.field350[3].method5660(var21 + 15, 4);
                } else {
                    Statics.field350[1].method5660(var21 + 15, 4);
                }
                arg0.method4993(class225.field3067, var21 + 32, 17, 16777215, -1);
            }
            class321.method5595(field1176 + 708, 4, 50, 16, 0);
            arg1.method4996(class225.field2975, field1176 + 708 + 25, 16, 16777215, -1);
            field1179 = -1;
            if (Statics.field361 != null) {
                byte var22 = 88;
                byte var23 = 19;
                int var24 = 765 / (var22 + 1) - 1;
                int var25 = 480 / (var23 + 1);
                int var26;
                int var27;
                do {
                    var26 = var25;
                    var27 = var24;
                    if ((var24 - 1) * var25 >= class72.field1017) {
                        var24--;
                    }
                    if ((var25 - 1) * var24 >= class72.field1017) {
                        var25--;
                    }
                    if ((var25 - 1) * var24 >= class72.field1017) {
                        var25--;
                    }
                } while (var25 != var26 || var24 != var27);
                int var28 = (765 - var22 * var24) / (var24 + 1);
                if (var28 > 5) {
                    var28 = 5;
                }
                int var29 = (480 - var23 * var25) / (var25 + 1);
                if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = (765 - var22 * var24 - (var24 - 1) * var28) / 2;
                int var31 = (480 - var23 * var25 - (var25 - 1) * var29) / 2;
                int var32 = (class72.field1017 + var25 - 1) / var25;
                field1178 = var32 - var24;
                if (Statics.field2756 != null && field1204 > 0) {
                    Statics.field2756.method5660(8, Statics.field310 / 2 - Statics.field2756.field3862 / 2);
                }
                if (Statics.field3280 != null && field1204 < field1178) {
                    Statics.field3280.method5660(Statics.field1873 - Statics.field3280.field3863 - 8, Statics.field310 / 2 - Statics.field3280.field3862 / 2);
                }
                int var33 = var31 + 23;
                int var34 = field1176 + var30;
                int var35 = 0;
                boolean var36 = false;
                int var37 = field1204;
                for (int var38 = var25 * var37; var38 < class72.field1017 && var37 - field1204 < var24; var38++) {
                    class72 var39 = Statics.field2752[var38];
                    boolean var40 = true;
                    String var41 = Integer.toString(var39.field1013);
                    if (var39.field1013 == -1) {
                        var41 = class225.field3068;
                        var40 = false;
                    } else if (var39.field1013 > 1980) {
                        var41 = class225.field2855;
                        var40 = false;
                    }
                    int var42 = 0;
                    byte var43;
                    if (var39.method1607()) {
                        if (var39.method1602()) {
                            var43 = 7;
                        } else {
                            var43 = 6;
                        }
                    } else if (var39.method1606()) {
                        var42 = 16711680;
                        if (var39.method1602()) {
                            var43 = 5;
                        } else {
                            var43 = 4;
                        }
                    } else if (var39.method1608()) {
                        var43 = 8;
                    } else if (var39.method1604()) {
                        if (var39.method1602()) {
                            var43 = 3;
                        } else {
                            var43 = 2;
                        }
                    } else if (var39.method1602()) {
                        var43 = 1;
                    } else {
                        var43 = 0;
                    }
                    if (class55.field473 >= var34 && class55.field483 >= var33 && class55.field473 < var22 + var34 && class55.field483 < var23 + var33 && var40) {
                        field1179 = var38;
                        Statics.field361[var43].method5695(var34, var33, 128, 16777215);
                        var36 = true;
                    } else {
                        Statics.field361[var43].method5689(var34, var33);
                    }
                    if (Statics.field544 != null) {
                        Statics.field544[(var39.method1602() ? 8 : 0) + var39.field1008].method5660(var34 + 29, var33);
                    }
                    arg0.method4996(Integer.toString(var39.field1011), var34 + 15, var23 / 2 + var33 + 5, var42, -1);
                    arg1.method4996(var41, var34 + 60, var23 / 2 + var33 + 5, 268435455, -1);
                    var33 += var23 + var29;
                    var35++;
                    if (var35 >= var25) {
                        var33 = var31 + 23;
                        var34 += var22 + var28;
                        var35 = 0;
                        var37++;
                    }
                }
                if (var36) {
                    int var44 = arg1.method5040(Statics.field2752[field1179].field1016) + 6;
                    int var45 = arg1.field3691 + 8;
                    int var46 = class55.field483 + 25;
                    if (var45 + var46 > 480) {
                        var46 = class55.field483 - 25 - var45;
                    }
                    class321.method5595(class55.field473 - var44 / 2, var46, var44, var45, 16777120);
                    class321.method5596(class55.field473 - var44 / 2, var46, var44, var45, 0);
                    arg1.method4996(Statics.field2752[field1179].field1016, class55.field473, arg1.field3691 + var46 + 4, 0, -1);
                }
            }
            Statics.field2507.method765(0, 0);
            return;
        }
        Statics.field2502.method5689(field1176, 0);
        Statics.field3842.method5689(field1176 + 382, 0);
        Statics.field1455.method5660(field1176 + 382 - Statics.field1455.field3863 / 2, 18);
        if (client.field652 == 0 || client.field652 == 5) {
            byte var47 = 20;
            arg0.method4996(class225.field2983, field1182 + 180, 245 - var47, 16777215, -1);
            int var48 = 253 - var47;
            class321.method5596(field1182 + 180 - 152, var48, 304, 34, 9179409);
            class321.method5596(field1182 + 180 - 151, var48 + 1, 302, 32, 0);
            class321.method5595(field1182 + 180 - 150, var48 + 2, field1183 * 3, 30, 9179409);
            class321.method5595(field1183 * 3 + (field1182 + 180 - 150), var48 + 2, 300 - field1183 * 3, 30, 0);
            arg0.method4996(field1194, field1182 + 180, 276 - var47, 16777215, -1);
        }
        if (client.field652 == 20) {
            Statics.field1177.method5660(field1182 + 180 - Statics.field1177.field3863 / 2, 271 - Statics.field1177.field3862 / 2);
            short var49 = 201;
            arg0.method4996(field1190, field1182 + 180, var49, 16776960, 0);
            int var122 = var49 + 15;
            arg0.method4996(field1184, field1182 + 180, var122, 16776960, 0);
            int var123 = var122 + 15;
            arg0.method4996(field1192, field1182 + 180, var123, 16776960, 0);
            int var124 = var123 + 15;
            int var125 = var124 + 7;
            if (field1188 != 4) {
                arg0.method4993(class225.field3011, field1182 + 180 - 110, var125, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = method3315(); arg0.method5040(var51) > var50; var51 = var51.substring(0, var51.length() - 1)) {
                }
                arg0.method4993(class296.method4992(var51), field1182 + 180 - 70, var125, 16777215, 0);
                var122 = var125 + 15;
                String var52;
                for (var52 = class291.method3826(field1175); arg0.method5040(var52) > var50; var52 = var52.substring(1)) {
                }
                arg0.method4993(class225.field3012 + var52, field1182 + 180 - 108, var122, 16777215, 0);
                var122 += 15;
            }
        }
        if (client.field652 == 10 || client.field652 == 11) {
            Statics.field1177.method5660(field1182, 171);
            if (field1188 == 0) {
                short var53 = 251;
                arg0.method4996(class225.field2857, field1182 + 180, var53, 16776960, 0);
                int var126 = var53 + 30;
                int var54 = field1182 + 180 - 80;
                short var55 = 291;
                Statics.field1189.method5660(var54 - 73, var55 - 20);
                arg0.method4997(class225.field3015, var54 - 73, var55 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var56 = field1182 + 180 + 80;
                Statics.field1189.method5660(var56 - 73, var55 - 20);
                arg0.method4997(class225.field2878, var56 - 73, var55 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1188 == 1) {
                arg0.method4996(field1201, field1182 + 180, 201, 16776960, 0);
                short var57 = 236;
                arg0.method4996(field1190, field1182 + 180, var57, 16777215, 0);
                int var127 = var57 + 15;
                arg0.method4996(field1184, field1182 + 180, var127, 16777215, 0);
                int var128 = var127 + 15;
                arg0.method4996(field1192, field1182 + 180, var128, 16777215, 0);
                int var129 = var128 + 15;
                int var58 = field1182 + 180 - 80;
                short var59 = 321;
                Statics.field1189.method5660(var58 - 73, var59 - 20);
                arg0.method4996(class225.field2775, var58, var59 + 5, 16777215, 0);
                int var60 = field1182 + 180 + 80;
                Statics.field1189.method5660(var60 - 73, var59 - 20);
                arg0.method4996(class225.field2975, var60, var59 + 5, 16777215, 0);
            } else if (field1188 == 2) {
                short var61 = 201;
                arg0.method4996(field1190, Statics.field638, var61, 16776960, 0);
                int var130 = var61 + 15;
                arg0.method4996(field1184, Statics.field638, var130, 16776960, 0);
                int var131 = var130 + 15;
                arg0.method4996(field1192, Statics.field638, var131, 16776960, 0);
                int var132 = var131 + 15;
                int var133 = var132 + 7;
                arg0.method4993(class225.field3011, Statics.field638 - 110, var133, 16777215, 0);
                short var62 = 200;
                String var63;
                for (var63 = method3315(); arg0.method5040(var63) > var62; var63 = var63.substring(1)) {
                }
                arg0.method4993(class296.method4992(var63) + (field1205 == 0 & client.field655 % 40 < 20 ? class82.method3813(16776960) + class82.field1144 : ""), Statics.field638 - 70, var133, 16777215, 0);
                var130 = var133 + 15;
                String var64;
                for (var64 = class291.method3826(field1175); arg0.method5040(var64) > var62; var64 = var64.substring(1)) {
                }
                arg0.method4993(class225.field3012 + var64 + (field1205 == 1 & client.field655 % 40 < 20 ? class82.method3813(16776960) + class82.field1144 : ""), Statics.field638 - 108, var130, 16777215, 0);
                var130 += 15;
                short var65 = 277;
                int var66 = Statics.field638 + -117;
                class324 var67 = method1575(client.field682, field1174);
                var67.method5660(var66, var65);
                int var68 = var67.field3863 + 5 + var66;
                arg1.method4993(class225.field3019, var68, var65 + 13, 16776960, 0);
                int var69 = Statics.field638 + 24;
                class324 var70 = method1575(Statics.field1978.field1051, field1196);
                var70.method5660(var69, var65);
                int var71 = var70.field3863 + 5 + var69;
                arg1.method4993(class225.field3046, var71, var65 + 13, 16776960, 0);
                int var134 = var65 + 15;
                int var72 = Statics.field638 - 80;
                short var73 = 321;
                Statics.field1189.method5660(var72 - 73, var73 - 20);
                arg0.method4996(class225.field3017, var72, var73 + 5, 16777215, 0);
                int var74 = Statics.field638 + 80;
                Statics.field1189.method5660(var74 - 73, var73 - 20);
                arg0.method4996(class225.field2975, var74, var73 + 5, 16777215, 0);
                short var75 = 357;
                switch(field1187) {
                    case 2:
                        Statics.field1053 = class225.field3032;
                        break;
                    default:
                        Statics.field1053 = class225.field3030;
                }
                Statics.field639 = new class319(Statics.field638, var75, arg1.method5040(Statics.field1053), 11);
                Statics.field2343 = new class319(Statics.field638, var75, arg1.method5040(class225.field2817), 11);
                arg1.method4996(Statics.field1053, Statics.field638, var75, 16777215, 0);
            } else if (field1188 == 3) {
                short var76 = 201;
                arg0.method4996(class225.field3021, field1182 + 180, var76, 16776960, 0);
                int var135 = var76 + 20;
                arg1.method4996(class225.field3022, field1182 + 180, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg1.method4996(class225.field3023, field1182 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                int var77 = field1182 + 180;
                short var78 = 276;
                Statics.field1189.method5660(var77 - 73, var78 - 20);
                arg2.method4996(class225.field3024, var77, var78 + 5, 16777215, 0);
                int var79 = field1182 + 180;
                short var80 = 326;
                Statics.field1189.method5660(var79 - 73, var80 - 20);
                arg2.method4996(class225.field3025, var79, var80 + 5, 16777215, 0);
            } else if (field1188 == 4) {
                arg0.method4996(class225.field3000, field1182 + 180, 201, 16776960, 0);
                short var81 = 236;
                arg0.method4996(field1190, field1182 + 180, var81, 16777215, 0);
                int var138 = var81 + 15;
                arg0.method4996(field1184, field1182 + 180, var138, 16777215, 0);
                int var139 = var138 + 15;
                arg0.method4996(field1192, field1182 + 180, var139, 16777215, 0);
                int var140 = var139 + 15;
                arg0.method4993(class225.field2829 + class291.method3826(Statics.field148) + (client.field655 % 40 < 20 ? class82.method3813(16776960) + class82.field1144 : ""), field1182 + 180 - 108, var140, 16777215, 0);
                int var141 = var140 - 8;
                arg0.method4993(class225.field2778, field1182 + 180 - 9, var141, 16776960, 0);
                int var142 = var141 + 15;
                arg0.method4993(class225.field2779, field1182 + 180 - 9, var142, 16776960, 0);
                int var82 = field1182 + 180 - 9 + arg0.method5040(class225.field2779) + 15;
                int var83 = var142 - arg0.field3691;
                class324 var84;
                if (field1197) {
                    var84 = Statics.field2533;
                } else {
                    var84 = Statics.field565;
                }
                var84.method5660(var82, var83);
                var138 = var142 + 15;
                int var85 = field1182 + 180 - 80;
                short var86 = 321;
                Statics.field1189.method5660(var85 - 73, var86 - 20);
                arg0.method4996(class225.field2775, var85, var86 + 5, 16777215, 0);
                int var87 = field1182 + 180 + 80;
                Statics.field1189.method5660(var87 - 73, var86 - 20);
                arg0.method4996(class225.field2975, var87, var86 + 5, 16777215, 0);
                arg1.method4996(class225.field3001, field1182 + 180, var86 + 36, 255, 0);
            } else if (field1188 == 5) {
                arg0.method4996(class225.field3026, field1182 + 180, 201, 16776960, 0);
                short var88 = 221;
                arg2.method4996(field1190, field1182 + 180, var88, 16776960, 0);
                int var143 = var88 + 15;
                arg2.method4996(field1184, field1182 + 180, var143, 16776960, 0);
                int var144 = var143 + 15;
                arg2.method4996(field1192, field1182 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                int var146 = var145 + 14;
                arg0.method4993(class225.field3027, field1182 + 180 - 145, var146, 16777215, 0);
                short var89 = 174;
                String var90;
                for (var90 = method3315(); arg0.method5040(var90) > var89; var90 = var90.substring(1)) {
                }
                arg0.method4993(class296.method4992(var90) + (client.field655 % 40 < 20 ? class82.method3813(16776960) + class82.field1144 : ""), field1182 + 180 - 34, var146, 16777215, 0);
                var143 = var146 + 15;
                int var91 = field1182 + 180 - 80;
                short var92 = 321;
                Statics.field1189.method5660(var91 - 73, var92 - 20);
                arg0.method4996(class225.field3028, var91, var92 + 5, 16777215, 0);
                int var93 = field1182 + 180 + 80;
                Statics.field1189.method5660(var93 - 73, var92 - 20);
                arg0.method4996(class225.field3029, var93, var92 + 5, 16777215, 0);
                short var94 = 356;
                arg1.method4996(class225.field2817, Statics.field638, var94, 268435455, 0);
            } else if (field1188 == 6) {
                short var95 = 201;
                arg0.method4996(field1190, field1182 + 180, var95, 16776960, 0);
                int var147 = var95 + 15;
                arg0.method4996(field1184, field1182 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                arg0.method4996(field1192, field1182 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                int var96 = field1182 + 180;
                short var97 = 321;
                Statics.field1189.method5660(var96 - 73, var97 - 20);
                arg0.method4996(class225.field3029, var96, var97 + 5, 16777215, 0);
            } else if (field1188 == 7) {
                short var98 = 216;
                arg0.method4996(class225.field3057, field1182 + 180, var98, 16776960, 0);
                int var150 = var98 + 15;
                arg2.method4996(class225.field3058, field1182 + 180, var150, 16776960, 0);
                int var151 = var150 + 15;
                arg2.method4996(class225.field3059, field1182 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                int var99 = field1182 + 180 - 80;
                short var100 = 321;
                Statics.field1189.method5660(var99 - 73, var100 - 20);
                arg0.method4996(class225.field3060, var99, var100 + 5, 16777215, 0);
                int var101 = field1182 + 180 + 80;
                Statics.field1189.method5660(var101 - 73, var100 - 20);
                arg0.method4996(class225.field3029, var101, var100 + 5, 16777215, 0);
            } else if (field1188 == 8) {
                short var102 = 216;
                arg0.method4996(class225.field2907, field1182 + 180, var102, 16776960, 0);
                int var153 = var102 + 15;
                arg2.method4996(class225.field3004, field1182 + 180, var153, 16776960, 0);
                int var154 = var153 + 15;
                arg2.method4996(class225.field2909, field1182 + 180, var154, 16776960, 0);
                int var155 = var154 + 15;
                int var103 = field1182 + 180 - 80;
                short var104 = 321;
                Statics.field1189.method5660(var103 - 73, var104 - 20);
                arg0.method4996(class225.field2910, var103, var104 + 5, 16777215, 0);
                int var105 = field1182 + 180 + 80;
                Statics.field1189.method5660(var105 - 73, var104 - 20);
                arg0.method4996(class225.field3029, var105, var104 + 5, 16777215, 0);
            } else if (field1188 == 12) {
                short var106 = 201;
                String var107 = "";
                String var108 = "";
                String var109 = "";
                switch(field1186) {
                    case 0:
                        var107 = class225.field2823;
                        var108 = class225.field2824;
                        var109 = class225.field2825;
                        break;
                    case 1:
                        var107 = class225.field2862;
                        var108 = class225.field2863;
                        var109 = class225.field2808;
                        break;
                    default:
                        method3816(false);
                }
                arg0.method4996(var107, field1182 + 180, var106, 16776960, 0);
                int var156 = var106 + 15;
                arg2.method4996(var108, field1182 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                arg2.method4996(var109, field1182 + 180, var157, 16776960, 0);
                int var158 = var157 + 15;
                int var110 = field1182 + 180;
                short var111 = 276;
                Statics.field1189.method5660(var110 - 73, var111 - 20);
                arg0.method4996(class225.field2807, var110, var111 + 5, 16777215, 0);
                int var112 = field1182 + 180;
                short var113 = 326;
                Statics.field1189.method5660(var112 - 73, var113 - 20);
                arg0.method4996(class225.field3029, var112, var113 + 5, 16777215, 0);
            } else if (field1188 == 24) {
                short var114 = 221;
                arg0.method4996(field1190, field1182 + 180, var114, 16777215, 0);
                int var159 = var114 + 15;
                arg0.method4996(field1184, field1182 + 180, var159, 16777215, 0);
                int var160 = var159 + 15;
                arg0.method4996(field1192, field1182 + 180, var160, 16777215, 0);
                int var161 = var160 + 15;
                int var115 = field1182 + 180;
                short var116 = 301;
                Statics.field1189.method5660(var115 - 73, var116 - 20);
                arg0.method4996(class225.field2773, var115, var116 + 5, 16777215, 0);
            }
        }
        if (client.field652 >= 10) {
            int[] var117 = new int[4];
            class321.method5632(var117);
            class321.method5588(field1176, 0, field1176 + 765, Statics.field310);
            Statics.field1296.method1647(field1176 - 22, client.field655);
            Statics.field1296.method1647(field1176 + 765 + 22 - 128, client.field655);
            class321.method5591(var117);
        }
        Statics.field1191[Statics.field1978.field1048 ? 1 : 0].method5660(field1176 + 765 - 40, 463);
        if (client.field652 <= 5 || Statics.field3299 != class191.field2360) {
            return;
        }
        if (Statics.field365 == null) {
            Statics.field365 = class326.method5408(Statics.field244, "sl_button", "");
            return;
        }
        int var118 = field1176 + 5;
        short var119 = 463;
        byte var120 = 100;
        byte var121 = 35;
        Statics.field365.method5660(var118, var119);
        arg0.method4996(class225.field2938 + " " + client.field645, var120 / 2 + var118, var121 / 2 + var119 - 2, 16777215, 0);
        if (Statics.field642 == null) {
            arg1.method4996(class225.field2850, var120 / 2 + var118, var121 / 2 + var119 + 12, 16777215, 0);
        } else {
            arg1.method4996(class225.field3070, var120 / 2 + var118, var121 / 2 + var119 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("cc.i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method2089(String arg0, String arg1, String arg2) {
        field1190 = arg0;
        field1184 = arg1;
        field1192 = arg2;
    }

    @ObfuscatedName("o.k(Lbp;B)V")
    public static void method149(class72 arg0) {
        if (arg0.method1602() != client.field859) {
            client.field859 = arg0.method1602();
            class255.method537(arg0.method1602());
        }
        Statics.field413 = arg0.field1014;
        client.field645 = arg0.field1011;
        client.field796 = arg0.field1005;
        Statics.field525 = client.field647 == 0 ? 43594 : arg0.field1011 + 40000;
        Statics.field416 = client.field647 == 0 ? 443 : arg0.field1011 + 50000;
        Statics.field129 = Statics.field525;
    }

    @ObfuscatedName("r.x(B)V")
    public static void method167() {
        if (class72.method724()) {
            field1185 = true;
            field1204 = 0;
            field1178 = 0;
        }
    }
}
