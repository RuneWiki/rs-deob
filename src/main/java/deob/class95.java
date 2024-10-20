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

@ObfuscatedName("cp")
public class class95 {

    @ObfuscatedName("cp.x")
    public static int field1189 = 0;

    @ObfuscatedName("cp.r")
    public static int field1186 = field1189 + 202;

    @ObfuscatedName("cp.g")
    public static int field1188 = 10;

    @ObfuscatedName("cp.s")
    public static String field1190 = "";

    @ObfuscatedName("cp.ag")
    public static int field1200 = -1;

    @ObfuscatedName("cp.ae")
    public static int field1191 = 1;

    @ObfuscatedName("cp.aq")
    public static int field1192 = 0;

    @ObfuscatedName("cp.ah")
    public static String field1202 = "";

    @ObfuscatedName("cp.am")
    public static String field1194 = "";

    @ObfuscatedName("cp.aa")
    public static String field1195 = "";

    @ObfuscatedName("cp.ao")
    public static String field1196 = "";

    @ObfuscatedName("cp.ab")
    public static String field1197 = "";

    @ObfuscatedName("cp.aw")
    public static String field1198 = "";

    @ObfuscatedName("cp.ar")
    public static boolean field1193 = false;

    @ObfuscatedName("cp.az")
    public static boolean field1181 = false;

    @ObfuscatedName("cp.by")
    public static boolean field1201 = true;

    @ObfuscatedName("cp.bs")
    public static int field1182 = 0;

    @ObfuscatedName("cp.br")
    public static String field1203 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cp.bl")
    public static String field1206 = "1234567890";

    @ObfuscatedName("cp.bf")
    public static boolean field1199 = false;

    @ObfuscatedName("cp.bw")
    public static int field1207 = -1;

    @ObfuscatedName("cp.bo")
    public static int field1183 = 0;

    @ObfuscatedName("cp.bj")
    public static int field1208 = 0;

    @ObfuscatedName("cp.bt")
    public static long field1209;

    @ObfuscatedName("cp.bb")
    public static long field1210;

    static {
        new DecimalFormat("##0.00");
        new class172();
        field1209 = -1L;
        field1210 = -1L;
    }

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.h(I)I")
    public static int method2137() {
        return 12;
    }

    @ObfuscatedName("bi.v(Lib;Lib;ZII)V")
    public static void method1087(class245 arg0, class245 arg1, boolean arg2, int arg3) {
        if (!Statics.field1205) {
            field1192 = arg3;
            class332.method5577();
            byte[] var4 = arg0.method3855("title.jpg", "");
            Statics.field125 = class59.method263(var4);
            Statics.field2565 = Statics.field125.method5750();
            int var5 = client.field647;
            if ((var5 & 0x20000000) != 0) {
                Statics.field2572 = class337.method715(arg1, "logo_deadman_mode", "");
            } else if ((var5 & 0x40000000) == 0) {
                Statics.field2572 = class337.method715(arg1, "logo", "");
            } else {
                Statics.field2572 = class337.method715(arg1, "logo_seasonal_mode", "");
            }
            Statics.field382 = class337.method715(arg1, "titlebox", "");
            Statics.field1184 = class337.method715(arg1, "titlebutton", "");
            Statics.field4051 = class337.method1967(arg1, "runes", "");
            Statics.field1185 = class337.method1967(arg1, "title_mute", "");
            Statics.field2514 = class337.method715(arg1, "options_radio_buttons,0", "");
            Statics.field4102 = class337.method715(arg1, "options_radio_buttons,4", "");
            Statics.field544 = class337.method715(arg1, "options_radio_buttons,2", "");
            Statics.field2409 = class337.method715(arg1, "options_radio_buttons,6", "");
            Statics.field1072 = Statics.field2514.field3906;
            Statics.field1261 = Statics.field2514.field3910;
            Statics.field2 = new class82(Statics.field4051);
            if (arg2) {
                field1197 = "";
                field1198 = "";
            }
            Statics.field314 = 0;
            Statics.field529 = "";
            field1201 = true;
            field1199 = false;
            if (Statics.field3618.field1064) {
                class207.method1099(2);
            } else {
                class207.method275(2, Statics.field2521, "scape main", "", 255, false);
            }
            class248.method2372(false);
            Statics.field1205 = true;
            field1189 = (Statics.field3639 - 765) / 2;
            field1186 = field1189 + 202;
            Statics.field1187 = field1186 + 180;
            Statics.field125.method5691(field1189, 0);
            Statics.field2565.method5691(field1189 + 382, 0);
            Statics.field2572.method5658(field1189 + 382 - Statics.field2572.field3906 / 2, 18);
        } else if (arg3 == 4) {
            field1192 = 4;
        }
    }

    @ObfuscatedName("gw.w(I)Ljava/lang/String;")
    public static String method3376() {
        String var6;
        if (Statics.field3618.field1054) {
            String var0 = field1197;
            int var1 = var0.length();
            char[] var2 = new char[var1];
            for (int var3 = 0; var3 < var1; var3++) {
                var2[var3] = '*';
            }
            String var4 = new String(var2);
            var6 = var4;
        } else {
            var6 = field1197;
        }
        return var6;
    }

    @ObfuscatedName("hx.t(I)V")
    public static void method3659() {
        if (field1197 != null && field1197.length() > 0) {
            return;
        }
        if (Statics.field3618.field1051 == null) {
            client.field685 = false;
        } else {
            field1197 = Statics.field3618.field1051;
            client.field685 = true;
        }
    }

    @ObfuscatedName("cr.j(I)V")
    public static void method1966() {
        if (!Statics.field1205) {
            return;
        }
        Statics.field382 = null;
        Statics.field1184 = null;
        Statics.field4051 = null;
        Statics.field125 = null;
        Statics.field2565 = null;
        Statics.field2572 = null;
        Statics.field1185 = null;
        Statics.field2514 = null;
        Statics.field544 = null;
        Statics.field3698 = null;
        Statics.field1158 = null;
        Statics.field169 = null;
        Statics.field4077 = null;
        Statics.field43 = null;
        Statics.field2.method1729();
        class207.method1099(2);
        class248.method2372(true);
        Statics.field1205 = false;
    }

    @ObfuscatedName("jy.p(Lbd;B)V")
    public static void method4450(class63 arg0) {
        if (field1199) {
            while (true) {
                if (!class55.method180()) {
                    if (class64.field484 != 1 && (Statics.field1990 || class64.field484 != 4)) {
                        break;
                    }
                    int var1 = field1189 + 280;
                    if (class64.field490 >= var1 && class64.field490 <= var1 + 14 && class64.field503 >= 4 && class64.field503 <= 18) {
                        class81.method4141(0, 0);
                        break;
                    }
                    if (class64.field490 >= var1 + 15 && class64.field490 <= var1 + 80 && class64.field503 >= 4 && class64.field503 <= 18) {
                        class81.method4141(0, 1);
                        break;
                    }
                    int var2 = field1189 + 390;
                    if (class64.field490 >= var2 && class64.field490 <= var2 + 14 && class64.field503 >= 4 && class64.field503 <= 18) {
                        class81.method4141(1, 0);
                        break;
                    }
                    if (class64.field490 >= var2 + 15 && class64.field490 <= var2 + 80 && class64.field503 >= 4 && class64.field503 <= 18) {
                        class81.method4141(1, 1);
                        break;
                    }
                    int var3 = field1189 + 500;
                    if (class64.field490 >= var3 && class64.field490 <= var3 + 14 && class64.field503 >= 4 && class64.field503 <= 18) {
                        class81.method4141(2, 0);
                        break;
                    }
                    if (class64.field490 >= var3 + 15 && class64.field490 <= var3 + 80 && class64.field503 >= 4 && class64.field503 <= 18) {
                        class81.method4141(2, 1);
                        break;
                    }
                    int var4 = field1189 + 610;
                    if (class64.field490 >= var4 && class64.field490 <= var4 + 14 && class64.field503 >= 4 && class64.field503 <= 18) {
                        class81.method4141(3, 0);
                        break;
                    }
                    if (class64.field490 >= var4 + 15 && class64.field490 <= var4 + 80 && class64.field503 >= 4 && class64.field503 <= 18) {
                        class81.method4141(3, 1);
                        break;
                    }
                    if (class64.field490 >= field1189 + 708 && class64.field503 >= 4 && class64.field490 <= field1189 + 708 + 50 && class64.field503 <= 20) {
                        field1199 = false;
                        Statics.field125.method5691(field1189, 0);
                        Statics.field2565.method5691(field1189 + 382, 0);
                        Statics.field2572.method5658(field1189 + 382 - Statics.field2572.field3906 / 2, 18);
                        break;
                    }
                    if (field1207 == -1) {
                        if (field1183 > 0 && Statics.field3225 != null && class64.field490 >= 0 && class64.field490 <= Statics.field3225.field3906 && class64.field503 >= Statics.field1893 / 2 - 50 && class64.field503 <= Statics.field1893 / 2 + 50) {
                            field1183--;
                        }
                        if (field1183 < field1208 && Statics.field35 != null && class64.field490 >= Statics.field3639 - Statics.field35.field3906 - 5 && class64.field490 <= Statics.field3639 && class64.field503 >= Statics.field1893 / 2 - 50 && class64.field503 <= Statics.field1893 / 2 + 50) {
                            field1183++;
                        }
                    } else {
                        class81 var5 = Statics.field1013[field1207];
                        method1101(var5);
                        field1199 = false;
                        Statics.field125.method5691(field1189, 0);
                        Statics.field2565.method5691(field1189 + 382, 0);
                        Statics.field2572.method5658(field1189 + 382 - Statics.field2572.field3906 / 2, 18);
                    }
                    break;
                }
                if (Statics.field3136 == 13) {
                    field1199 = false;
                    Statics.field125.method5691(field1189, 0);
                    Statics.field2565.method5691(field1189 + 382, 0);
                    Statics.field2572.method5658(field1189 + 382 - Statics.field2572.field3906 / 2, 18);
                    break;
                }
                if (Statics.field3136 == 96) {
                    if (field1183 > 0 && Statics.field3225 != null) {
                        field1183--;
                    }
                } else if (Statics.field3136 == 97 && field1183 < field1208 && Statics.field35 != null) {
                    field1183++;
                }
            }
            return;
        }
        if ((class64.field484 == 1 || !Statics.field1990 && class64.field484 == 4) && class64.field490 >= field1189 + 765 - 50 && class64.field503 >= 453) {
            Statics.field3618.field1064 = !Statics.field3618.field1064;
            class83.method165();
            if (Statics.field3618.field1064) {
                class207.method530();
            } else {
                class247 var6 = Statics.field2521;
                int var7 = var6.method3880("scape main");
                int var8 = var6.method3909(var7, "");
                class207.method1934(var6, var7, var8, 255, false);
            }
        }
        if (client.field654 == 5) {
            return;
        }
        if (field1209 == -1L) {
            field1209 = class308.method4891() + 1000L;
        }
        long var9 = class308.method4891();
        boolean var11;
        if (client.field917 == null || client.field923 >= client.field917.size()) {
            var11 = true;
        } else {
            while (true) {
                if (client.field923 >= client.field917.size()) {
                    var11 = true;
                    break;
                }
                class68 var12 = (class68) client.field917.get(client.field923);
                if (!var12.method1107()) {
                    var11 = false;
                    break;
                }
                client.field923++;
            }
        }
        if (var11 && field1210 == -1L) {
            field1210 = var9;
            if (field1210 > field1209) {
                field1209 = field1210;
            }
        }
        if (client.field654 != 10 && client.field654 != 11) {
            return;
        }
        if (Statics.field373 == class200.field2383) {
            if (class64.field484 == 1 || !Statics.field1990 && class64.field484 == 4) {
                int var13 = field1189 + 5;
                short var14 = 463;
                byte var15 = 100;
                byte var16 = 35;
                if (class64.field490 >= var13 && class64.field490 <= var13 + var15 && class64.field503 >= var14 && class64.field503 <= var14 + var16) {
                    if (class81.method135()) {
                        field1199 = true;
                        field1183 = 0;
                        field1208 = 0;
                    }
                    return;
                }
            }
            if (Statics.field1027 != null && class81.method135()) {
                field1199 = true;
                field1183 = 0;
                field1208 = 0;
            }
        }
        int var17 = class64.field484;
        int var18 = class64.field490;
        int var19 = class64.field503;
        if (var17 == 0) {
            var18 = class64.field493;
            var19 = class64.field500;
        }
        if (!Statics.field1990 && var17 == 4) {
            var17 = 1;
        }
        if (field1192 == 0) {
            boolean var20 = false;
            while (class55.method180()) {
                if (Statics.field3136 == 84) {
                    var20 = true;
                }
            }
            int var21 = Statics.field1187 - 80;
            short var22 = 291;
            if (var17 == 1 && var18 >= var21 - 75 && var18 <= var21 + 75 && var19 >= var22 - 20 && var19 <= var22 + 20) {
                class61.method1978(client.method558("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var23 = Statics.field1187 + 80;
            if (var17 == 1 && var18 >= var23 - 75 && var18 <= var23 + 75 && var19 >= var22 - 20 && var19 <= var22 + 20 || var20) {
                if ((client.field647 & 0x2000000) != 0) {
                    field1202 = "";
                    field1194 = class234.field2847;
                    field1195 = class234.field3017;
                    field1196 = class234.field3014;
                    field1192 = 1;
                    if (client.field685 && field1197 != null && field1197.length() > 0) {
                        field1182 = 1;
                    } else {
                        field1182 = 0;
                    }
                } else if ((client.field647 & 0x4) != 0) {
                    if ((client.field647 & 0x400) == 0) {
                        field1194 = class234.field2973;
                        field1195 = class234.field3004;
                        field1196 = class234.field3005;
                    } else {
                        field1194 = class234.field2941;
                        field1195 = class234.field2986;
                        field1196 = class234.field3011;
                    }
                    field1202 = class234.field3002;
                    field1192 = 1;
                    Statics.method1653();
                } else if ((client.field647 & 0x400) == 0) {
                    method557(false);
                } else {
                    field1194 = class234.field3006;
                    field1195 = class234.field3007;
                    field1196 = class234.field3008;
                    field1202 = class234.field3002;
                    field1192 = 1;
                    Statics.method1653();
                }
            }
        } else if (field1192 == 1) {
            while (true) {
                if (!class55.method180()) {
                    int var24 = Statics.field1187 - 80;
                    short var25 = 321;
                    if (var17 == 1 && var18 >= var24 - 75 && var18 <= var24 + 75 && var19 >= var25 - 20 && var19 <= var25 + 20) {
                        method557(false);
                    }
                    int var26 = Statics.field1187 + 80;
                    if (var17 == 1 && var18 >= var26 - 75 && var18 <= var26 + 75 && var19 >= var25 - 20 && var19 <= var25 + 20) {
                        field1192 = 0;
                    }
                    break;
                }
                if (Statics.field3136 == 84) {
                    method557(false);
                } else if (Statics.field3136 == 13) {
                    field1192 = 0;
                }
            }
        } else if (field1192 == 2) {
            short var27 = 201;
            int var89 = var27 + 52;
            if (var17 == 1 && var19 >= var89 - 12 && var19 < var89 + 2) {
                field1182 = 0;
            }
            var89 += 15;
            if (var17 == 1 && var19 >= var89 - 12 && var19 < var89 + 2) {
                field1182 = 1;
            }
            var89 += 15;
            short var28 = 361;
            if (Statics.field482 != null) {
                int var29 = Statics.field482.field3880 / 2;
                if (var17 == 1 && var18 >= Statics.field482.field3882 - var29 && var18 <= Statics.field482.field3882 + var29 && var19 >= var28 - 15 && var19 < var28) {
                    switch(field1191) {
                        case 1:
                            method966(class234.field2926, class234.field3052, class234.field3053);
                            field1192 = 5;
                            return;
                        case 2:
                            class61.method1978("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var30 = Statics.field1187 - 80;
            short var31 = 321;
            if (var17 == 1 && var18 >= var30 - 75 && var18 <= var30 + 75 && var19 >= var31 - 20 && var19 <= var31 + 20) {
                field1197 = field1197.trim();
                if (field1197.length() == 0) {
                    method966(class234.field2881, class234.field2905, class234.field2906);
                    return;
                }
                if (field1198.length() == 0) {
                    method966(class234.field2866, class234.field2939, class234.field2909);
                    return;
                }
                method966(class234.field3076, class234.field3018, class234.field3019);
                client.method322(false);
                client.method575(20);
                return;
            }
            int var32 = field1186 + 180 + 80;
            if (var17 == 1 && var18 >= var32 - 75 && var18 <= var32 + 75 && var19 >= var31 - 20 && var19 <= var31 + 20) {
                field1192 = 0;
                field1197 = "";
                field1198 = "";
                Statics.field314 = 0;
                Statics.field529 = "";
                field1201 = true;
            }
            int var33 = Statics.field1187 + -117;
            short var34 = 277;
            field1193 = var18 >= var33 && var18 < Statics.field1072 + var33 && var19 >= var34 && var19 < Statics.field1261 + var34;
            if (var17 == 1 && field1193) {
                client.field685 = !client.field685;
                if (!client.field685 && Statics.field3618.field1051 != null) {
                    Statics.field3618.field1051 = null;
                    class83.method165();
                }
            }
            int var35 = Statics.field1187 + 24;
            short var36 = 277;
            field1181 = var18 >= var35 && var18 < Statics.field1072 + var35 && var19 >= var36 && var19 < Statics.field1261 + var36;
            if (var17 == 1 && field1181) {
                Statics.field3618.field1054 = !Statics.field3618.field1054;
                if (!Statics.field3618.field1054) {
                    field1197 = "";
                    Statics.field3618.field1051 = null;
                    Statics.method1653();
                }
                class83.method165();
            }
            while (true) {
                Transferable var40;
                int var41;
                do {
                    while (true) {
                        label899: do {
                            while (true) {
                                while (class55.method180()) {
                                    if (Statics.field3136 == 13) {
                                        field1192 = 0;
                                        field1197 = "";
                                        field1198 = "";
                                        Statics.field314 = 0;
                                        Statics.field529 = "";
                                        field1201 = true;
                                    } else {
                                        if (field1182 != 0) {
                                            continue label899;
                                        }
                                        char var37 = Statics.field201;
                                        for (int var38 = 0; var38 < field1203.length() && var37 != field1203.charAt(var38); var38++) {
                                        }
                                        if (Statics.field3136 == 85 && field1197.length() > 0) {
                                            field1197 = field1197.substring(0, field1197.length() - 1);
                                        }
                                        if (Statics.field3136 == 84 || Statics.field3136 == 80) {
                                            field1182 = 1;
                                        }
                                        if (method1847(Statics.field201) && field1197.length() < 320) {
                                            field1197 = field1197 + Statics.field201;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field1182 != 1);
                        if (Statics.field3136 == 85 && field1198.length() > 0) {
                            field1198 = field1198.substring(0, field1198.length() - 1);
                        } else if (Statics.field3136 == 84 || Statics.field3136 == 80) {
                            field1182 = 0;
                            if (Statics.field3136 == 84) {
                                field1197 = field1197.trim();
                                if (field1197.length() == 0) {
                                    method966(class234.field2881, class234.field2905, class234.field2906);
                                    return;
                                }
                                if (field1198.length() == 0) {
                                    method966(class234.field2866, class234.field2939, class234.field2909);
                                    return;
                                }
                                method966(class234.field3076, class234.field3018, class234.field3019);
                                client.method322(false);
                                client.method575(20);
                                return;
                            }
                        }
                        if ((class55.field417[82] || class55.field417[87]) && Statics.field3136 == 67) {
                            Clipboard var39 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var40 = var39.getContents(Statics.field148);
                            var41 = 20 - field1198.length();
                            break;
                        }
                        char var52 = Statics.field201;
                        boolean var53;
                        if ((var52 < ' ' || var52 >= 127) && (var52 <= 127 || var52 >= 160) && (var52 <= 160 || var52 > 255)) {
                            label1095: {
                                if (var52 != 0) {
                                    char[] var54 = class299.field3689;
                                    for (int var55 = 0; var55 < var54.length; var55++) {
                                        char var56 = var54[var55];
                                        if (var52 == var56) {
                                            var53 = true;
                                            break label1095;
                                        }
                                    }
                                }
                                var53 = false;
                            }
                        } else {
                            var53 = true;
                        }
                        if (var53 && method1847(Statics.field201) && field1198.length() < 20) {
                            field1198 = field1198 + Statics.field201;
                        }
                    }
                } while (var41 <= 0);
                try {
                    String var42 = (String) var40.getTransferData(DataFlavor.stringFlavor);
                    int var43 = Math.min(var41, var42.length());
                    for (int var44 = 0; var44 < var43; var44++) {
                        char var45 = var42.charAt(var44);
                        boolean var46;
                        if ((var45 < ' ' || var45 >= 127) && (var45 <= 127 || var45 >= 160) && (var45 <= 160 || var45 > 255)) {
                            label1098: {
                                if (var45 != 0) {
                                    char[] var47 = class299.field3689;
                                    for (int var48 = 0; var48 < var47.length; var48++) {
                                        char var49 = var47[var48];
                                        if (var45 == var49) {
                                            var46 = true;
                                            break label1098;
                                        }
                                    }
                                }
                                var46 = false;
                            }
                        } else {
                            var46 = true;
                        }
                        if (!var46 || !method1847(var42.charAt(var44))) {
                            field1192 = 3;
                            return;
                        }
                    }
                    field1198 = field1198 + var42.substring(0, var43);
                } catch (UnsupportedFlavorException var87) {
                } catch (IOException var88) {
                }
            }
        } else if (field1192 == 3) {
            int var57 = field1186 + 180;
            short var58 = 276;
            if (var17 == 1 && var18 >= var57 - 75 && var18 <= var57 + 75 && var19 >= var58 - 20 && var19 <= var58 + 20) {
                method557(false);
            }
            int var59 = field1186 + 180;
            short var60 = 326;
            if (var17 == 1 && var18 >= var59 - 75 && var18 <= var59 + 75 && var19 >= var60 - 20 && var19 <= var60 + 20) {
                method966(class234.field2926, class234.field3052, class234.field3053);
                field1192 = 5;
                return;
            }
        } else if (field1192 == 4) {
            int var61 = field1186 + 180 - 80;
            short var62 = 321;
            if (var17 == 1 && var18 >= var61 - 75 && var18 <= var61 + 75 && var19 >= var62 - 20 && var19 <= var62 + 20) {
                Statics.field529.trim();
                if (Statics.field529.length() != 6) {
                    method966(class234.field2823, class234.field2949, class234.field2825);
                    return;
                }
                Statics.field314 = Integer.parseInt(Statics.field529);
                Statics.field529 = "";
                client.method322(true);
                method966(class234.field3076, class234.field3018, class234.field3019);
                client.method575(20);
                return;
            }
            if (var17 == 1 && var18 >= field1186 + 180 - 9 && var18 <= field1186 + 180 + 130 && var19 >= 263 && var19 <= 296) {
                field1201 = !field1201;
            }
            if (var17 == 1 && var18 >= field1186 + 180 - 34 && var18 <= field1186 + 180 + 34 && var19 >= 351 && var19 <= 363) {
                class61.method1978(client.method558("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var63 = field1186 + 180 + 80;
            if (var17 == 1 && var18 >= var63 - 75 && var18 <= var63 + 75 && var19 >= var62 - 20 && var19 <= var62 + 20) {
                field1192 = 0;
                field1197 = "";
                field1198 = "";
                Statics.field314 = 0;
                Statics.field529 = "";
            }
            while (class55.method180()) {
                boolean var64 = false;
                for (int var65 = 0; var65 < field1206.length(); var65++) {
                    if (Statics.field201 == field1206.charAt(var65)) {
                        var64 = true;
                        break;
                    }
                }
                if (Statics.field3136 == 13) {
                    field1192 = 0;
                    field1197 = "";
                    field1198 = "";
                    Statics.field314 = 0;
                    Statics.field529 = "";
                } else {
                    if (Statics.field3136 == 85 && Statics.field529.length() > 0) {
                        Statics.field529 = Statics.field529.substring(0, Statics.field529.length() - 1);
                    }
                    if (Statics.field3136 == 84) {
                        Statics.field529.trim();
                        if (Statics.field529.length() != 6) {
                            method966(class234.field2823, class234.field2949, class234.field2825);
                            return;
                        }
                        Statics.field314 = Integer.parseInt(Statics.field529);
                        Statics.field529 = "";
                        client.method322(true);
                        method966(class234.field3076, class234.field3018, class234.field3019);
                        client.method575(20);
                        return;
                    }
                    if (var64 && Statics.field529.length() < 6) {
                        Statics.field529 = Statics.field529 + Statics.field201;
                    }
                }
            }
        } else if (field1192 == 5) {
            int var66 = field1186 + 180 - 80;
            short var67 = 321;
            if (var17 == 1 && var18 >= var66 - 75 && var18 <= var66 + 75 && var19 >= var67 - 20 && var19 <= var67 + 20) {
                method67();
                return;
            }
            int var68 = field1186 + 180 + 80;
            if (var17 == 1 && var18 >= var68 - 75 && var18 <= var68 + 75 && var19 >= var67 - 20 && var19 <= var67 + 20) {
                method557(true);
            }
            short var69 = 361;
            if (Statics.field644 != null) {
                int var70 = Statics.field644.field3880 / 2;
                if (var17 == 1 && var18 >= Statics.field644.field3882 - var70 && var18 <= Statics.field644.field3882 + var70 && var19 >= var69 - 15 && var19 < var69) {
                    class61.method1978(client.method558("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class55.method180()) {
                boolean var71 = false;
                for (int var72 = 0; var72 < field1203.length(); var72++) {
                    if (Statics.field201 == field1203.charAt(var72)) {
                        var71 = true;
                        break;
                    }
                }
                if (Statics.field3136 == 13) {
                    method557(true);
                } else {
                    if (Statics.field3136 == 85 && field1197.length() > 0) {
                        field1197 = field1197.substring(0, field1197.length() - 1);
                    }
                    if (Statics.field3136 == 84) {
                        method67();
                        return;
                    }
                    if (var71 && field1197.length() < 320) {
                        field1197 = field1197 + Statics.field201;
                    }
                }
            }
        } else if (field1192 == 6) {
            while (true) {
                do {
                    if (!class55.method180()) {
                        short var73 = 321;
                        if (var17 == 1 && var19 >= var73 - 20 && var19 <= var73 + 20) {
                            method557(true);
                        }
                        return;
                    }
                } while (Statics.field3136 != 84 && Statics.field3136 != 13);
                method557(true);
            }
        } else if (field1192 == 7) {
            int var74 = field1186 + 180 - 80;
            short var75 = 321;
            if (var17 == 1 && var18 >= var74 - 75 && var18 <= var74 + 75 && var19 >= var75 - 20 && var19 <= var75 + 20) {
                class61.method1978(client.method558("secure", true) + "m=dob/set_dob.ws", true, false);
                method966(class234.field3048, class234.field3049, class234.field2961);
                field1192 = 6;
                return;
            }
            int var76 = field1186 + 180 + 80;
            if (var17 == 1 && var18 >= var76 - 75 && var18 <= var76 + 75 && var19 >= var75 - 20 && var19 <= var75 + 20) {
                method557(true);
            }
        } else if (field1192 == 8) {
            int var77 = field1186 + 180 - 80;
            short var78 = 321;
            if (var17 == 1 && var18 >= var77 - 75 && var18 <= var77 + 75 && var19 >= var78 - 20 && var19 <= var78 + 20) {
                class61.method1978("https://www.jagex.com/terms/privacy", true, false);
                method966(class234.field3048, class234.field3049, class234.field2961);
                field1192 = 6;
                return;
            }
            int var79 = field1186 + 180 + 80;
            if (var17 == 1 && var18 >= var79 - 75 && var18 <= var79 + 75 && var19 >= var78 - 20 && var19 <= var78 + 20) {
                method557(true);
            }
        } else if (field1192 == 12) {
            String var80 = "";
            switch(field1200) {
                case 0:
                    var80 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var80 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method557(false);
            }
            int var81 = field1186 + 180;
            short var82 = 276;
            if (var17 == 1 && var18 >= var81 - 75 && var18 <= var81 + 75 && var19 >= var82 - 20 && var19 <= var82 + 20) {
                class61.method1978(var80, true, false);
                method966(class234.field3048, class234.field3049, class234.field2961);
                field1192 = 6;
                return;
            }
            int var83 = field1186 + 180;
            short var84 = 326;
            if (var17 == 1 && var18 >= var83 - 75 && var18 <= var83 + 75 && var19 >= var84 - 20 && var19 <= var84 + 20) {
                method557(false);
            }
        } else if (field1192 == 24) {
            int var85 = field1186 + 180;
            short var86 = 301;
            if (var17 == 1 && var18 >= var85 - 75 && var18 <= var85 + 75 && var19 >= var86 - 20 && var19 <= var86 + 20) {
                method557(false);
            }
        }
    }

    @ObfuscatedName("cc.l(CI)Z")
    public static boolean method1847(char arg0) {
        return field1203.indexOf(arg0) != -1;
    }

    @ObfuscatedName("ap.z(ZI)V")
    public static void method557(boolean arg0) {
        field1194 = class234.field2999;
        field1195 = class234.field3000;
        field1196 = class234.field2794;
        field1192 = 2;
        if (arg0) {
            field1198 = "";
        }
        method3659();
        if (client.field685 && field1197 != null && field1197.length() > 0) {
            field1182 = 1;
        } else {
            field1182 = 0;
        }
    }

    @ObfuscatedName("p.u(I)V")
    public static void method67() {
        field1197 = field1197.trim();
        if (field1197.length() == 0) {
            method966(class234.field2926, class234.field3052, class234.field3053);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method558("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class311 var4 = new class311(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field3753, var4.field3752, 1000 - var4.field3752);
                if (var5 == -1) {
                    var4.field3752 = 0;
                    long var8 = var4.method5121();
                    var6 = var8;
                    break;
                }
                var4.field3752 += var5;
                if (var4.field3752 >= 1000) {
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
            var13 = class90.method3417(var6, field1197);
        }
        switch(var13) {
            case 2:
                method966(class234.field3054, class234.field3055, class234.field3056);
                field1192 = 6;
                break;
            case 3:
                method966(class234.field2908, class234.field3058, class234.field3059);
                break;
            case 4:
                method966(class234.field3060, class234.field2845, class234.field3062);
                break;
            case 5:
                method966(class234.field3063, class234.field3064, class234.field3065);
                break;
            case 6:
                method966(class234.field2797, class234.field3067, class234.field2882);
                break;
            case 7:
                method966(class234.field2978, class234.field2827, class234.field3071);
        }
    }

    @ObfuscatedName("bo.e(Lku;Lku;Lku;I)V")
    public static void method1110(class306 arg0, class306 arg1, class306 arg2) {
        field1189 = (Statics.field3639 - 765) / 2;
        field1186 = field1189 + 202;
        Statics.field1187 = field1186 + 180;
        if (field1199) {
            if (Statics.field3698 == null) {
                Statics.field3698 = class337.method4636(Statics.field1292, "sl_back", "");
            }
            if (Statics.field1158 == null) {
                Statics.field1158 = class337.method1967(Statics.field1292, "sl_flags", "");
            }
            if (Statics.field169 == null) {
                Statics.field169 = class337.method1967(Statics.field1292, "sl_arrows", "");
            }
            if (Statics.field4077 == null) {
                Statics.field4077 = class337.method1967(Statics.field1292, "sl_stars", "");
            }
            if (Statics.field3225 == null) {
                Statics.field3225 = class337.method715(Statics.field1292, "leftarrow", "");
            }
            if (Statics.field35 == null) {
                Statics.field35 = class337.method715(Statics.field1292, "rightarrow", "");
            }
            class332.method5581(field1189, 23, 765, 480, 0);
            class332.method5582(field1189, 0, 125, 23, 12425273, 9135624);
            class332.method5582(field1189 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5049(class234.field2930, field1189 + 62, 15, 0, -1);
            if (Statics.field4077 != null) {
                Statics.field4077[1].method5658(field1189 + 140, 1);
                arg1.method4956(class234.field3046, field1189 + 152, 10, 16777215, -1);
                Statics.field4077[0].method5658(field1189 + 140, 12);
                arg1.method4956(class234.field2990, field1189 + 152, 21, 16777215, -1);
            }
            if (Statics.field169 != null) {
                int var3 = field1189 + 280;
                if (class81.field1017[0] == 0 && class81.field1016[0] == 0) {
                    Statics.field169[2].method5658(var3, 4);
                } else {
                    Statics.field169[0].method5658(var3, 4);
                }
                if (class81.field1017[0] == 0 && class81.field1016[0] == 1) {
                    Statics.field169[3].method5658(var3 + 15, 4);
                } else {
                    Statics.field169[1].method5658(var3 + 15, 4);
                }
                arg0.method4956(class234.field3079, var3 + 32, 17, 16777215, -1);
                int var4 = field1189 + 390;
                if (class81.field1017[0] == 1 && class81.field1016[0] == 0) {
                    Statics.field169[2].method5658(var4, 4);
                } else {
                    Statics.field169[0].method5658(var4, 4);
                }
                if (class81.field1017[0] == 1 && class81.field1016[0] == 1) {
                    Statics.field169[3].method5658(var4 + 15, 4);
                } else {
                    Statics.field169[1].method5658(var4 + 15, 4);
                }
                arg0.method4956(class234.field3080, var4 + 32, 17, 16777215, -1);
                int var5 = field1189 + 500;
                if (class81.field1017[0] == 2 && class81.field1016[0] == 0) {
                    Statics.field169[2].method5658(var5, 4);
                } else {
                    Statics.field169[0].method5658(var5, 4);
                }
                if (class81.field1017[0] == 2 && class81.field1016[0] == 1) {
                    Statics.field169[3].method5658(var5 + 15, 4);
                } else {
                    Statics.field169[1].method5658(var5 + 15, 4);
                }
                arg0.method4956(class234.field2811, var5 + 32, 17, 16777215, -1);
                int var6 = field1189 + 610;
                if (class81.field1017[0] == 3 && class81.field1016[0] == 0) {
                    Statics.field169[2].method5658(var6, 4);
                } else {
                    Statics.field169[0].method5658(var6, 4);
                }
                if (class81.field1017[0] == 3 && class81.field1016[0] == 1) {
                    Statics.field169[3].method5658(var6 + 15, 4);
                } else {
                    Statics.field169[1].method5658(var6 + 15, 4);
                }
                arg0.method4956(class234.field3082, var6 + 32, 17, 16777215, -1);
            }
            class332.method5581(field1189 + 708, 4, 50, 16, 0);
            arg1.method5049(class234.field3033, field1189 + 708 + 25, 16, 16777215, -1);
            field1207 = -1;
            if (Statics.field3698 != null) {
                byte var7 = 88;
                byte var8 = 19;
                int var9 = 765 / (var7 + 1) - 1;
                int var10 = 480 / (var8 + 1);
                int var11;
                int var12;
                do {
                    var11 = var10;
                    var12 = var9;
                    if ((var9 - 1) * var10 >= class81.field1018) {
                        var9--;
                    }
                    if ((var10 - 1) * var9 >= class81.field1018) {
                        var10--;
                    }
                    if ((var10 - 1) * var9 >= class81.field1018) {
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
                int var17 = (class81.field1018 + var10 - 1) / var10;
                field1208 = var17 - var9;
                if (Statics.field3225 != null && field1183 > 0) {
                    Statics.field3225.method5658(8, Statics.field1893 / 2 - Statics.field3225.field3910 / 2);
                }
                if (Statics.field35 != null && field1183 < field1208) {
                    Statics.field35.method5658(Statics.field3639 - Statics.field35.field3906 - 8, Statics.field1893 / 2 - Statics.field35.field3910 / 2);
                }
                int var18 = var16 + 23;
                int var19 = field1189 + var15;
                int var20 = 0;
                boolean var21 = false;
                int var22 = field1183;
                for (int var23 = var10 * var22; var23 < class81.field1018 && var22 - field1183 < var9; var23++) {
                    class81 var24 = Statics.field1013[var23];
                    boolean var25 = true;
                    String var26 = Integer.toString(var24.field1021);
                    if (var24.field1021 == -1) {
                        var26 = class234.field2965;
                        var25 = false;
                    } else if (var24.field1021 > 1980) {
                        var26 = class234.field3084;
                        var25 = false;
                    }
                    int var27 = 0;
                    byte var28;
                    if (var24.method1685()) {
                        if (var24.method1680()) {
                            var28 = 7;
                        } else {
                            var28 = 6;
                        }
                    } else if (var24.method1684()) {
                        var27 = 16711680;
                        if (var24.method1680()) {
                            var28 = 5;
                        } else {
                            var28 = 4;
                        }
                    } else if (var24.method1697()) {
                        if (var24.method1680()) {
                            var28 = 9;
                        } else {
                            var28 = 8;
                        }
                    } else if (var24.method1682()) {
                        if (var24.method1680()) {
                            var28 = 3;
                        } else {
                            var28 = 2;
                        }
                    } else if (var24.method1680()) {
                        var28 = 1;
                    } else {
                        var28 = 0;
                    }
                    if (class64.field493 >= var19 && class64.field500 >= var18 && class64.field493 < var7 + var19 && class64.field500 < var8 + var18 && var25) {
                        field1207 = var23;
                        Statics.field3698[var28].method5697(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field3698[var28].method5691(var19, var18);
                    }
                    if (Statics.field1158 != null) {
                        Statics.field1158[(var24.method1680() ? 8 : 0) + var24.field1024].method5658(var19 + 29, var18);
                    }
                    arg0.method5049(Integer.toString(var24.field1019), var19 + 15, var8 / 2 + var18 + 5, var27, -1);
                    arg1.method5049(var26, var19 + 60, var8 / 2 + var18 + 5, 268435455, -1);
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
                    int var29 = arg1.method4961(Statics.field1013[field1207].field1023) + 6;
                    int var30 = arg1.field3728 + 8;
                    int var31 = class64.field500 + 25;
                    if (var30 + var31 > 480) {
                        var31 = class64.field500 - 25 - var30;
                    }
                    class332.method5581(class64.field493 - var29 / 2, var31, var29, var30, 16777120);
                    class332.method5585(class64.field493 - var29 / 2, var31, var29, var30, 0);
                    arg1.method5049(Statics.field1013[field1207].field1023, class64.field493, arg1.field3728 + var31 + 4, 0, -1);
                }
            }
            Statics.field151.method835(0, 0);
            return;
        }
        Statics.field125.method5691(field1189, 0);
        Statics.field2565.method5691(field1189 + 382, 0);
        Statics.field2572.method5658(field1189 + 382 - Statics.field2572.field3906 / 2, 18);
        if (client.field654 == 0 || client.field654 == 5) {
            byte var32 = 20;
            arg0.method5049(class234.field2998, field1186 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class332.method5585(field1186 + 180 - 152, var33, 304, 34, 9179409);
            class332.method5585(field1186 + 180 - 151, var33 + 1, 302, 32, 0);
            class332.method5581(field1186 + 180 - 150, var33 + 2, field1188 * 3, 30, 9179409);
            class332.method5581(field1188 * 3 + (field1186 + 180 - 150), var33 + 2, 300 - field1188 * 3, 30, 0);
            arg0.method5049(field1190, field1186 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field654 == 20) {
            Statics.field382.method5658(field1186 + 180 - Statics.field382.field3906 / 2, 271 - Statics.field382.field3910 / 2);
            short var34 = 201;
            arg0.method5049(field1194, field1186 + 180, var34, 16776960, 0);
            int var127 = var34 + 15;
            arg0.method5049(field1195, field1186 + 180, var127, 16776960, 0);
            int var128 = var127 + 15;
            arg0.method5049(field1196, field1186 + 180, var128, 16776960, 0);
            int var129 = var128 + 15;
            int var130 = var129 + 7;
            if (field1192 != 4) {
                arg0.method4956(class234.field2946, field1186 + 180 - 110, var130, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = method3376(); arg0.method4961(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method4956(class307.method4999(var36), field1186 + 180 - 70, var130, 16777215, 0);
                var127 = var130 + 15;
                String var37 = field1198;
                int var38 = var37.length();
                char[] var39 = new char[var38];
                for (int var40 = 0; var40 < var38; var40++) {
                    var39[var40] = '*';
                }
                String var41 = new String(var39);
                String var43;
                for (var43 = var41; arg0.method4961(var43) > var35; var43 = var43.substring(1)) {
                }
                arg0.method4956(class234.field3027 + var43, field1186 + 180 - 108, var127, 16777215, 0);
                var127 += 15;
            }
        }
        if (client.field654 == 10 || client.field654 == 11) {
            Statics.field382.method5658(field1186, 171);
            if (field1192 == 0) {
                short var44 = 251;
                arg0.method5049(class234.field3029, field1186 + 180, var44, 16776960, 0);
                int var131 = var44 + 30;
                int var45 = field1186 + 180 - 80;
                short var46 = 291;
                Statics.field1184.method5658(var45 - 73, var46 - 20);
                arg0.method4970(class234.field2859, var45 - 73, var46 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var47 = field1186 + 180 + 80;
                Statics.field1184.method5658(var47 - 73, var46 - 20);
                arg0.method4970(class234.field3031, var47 - 73, var46 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1192 == 1) {
                arg0.method5049(field1202, field1186 + 180, 201, 16776960, 0);
                short var48 = 236;
                arg0.method5049(field1194, field1186 + 180, var48, 16777215, 0);
                int var132 = var48 + 15;
                arg0.method5049(field1195, field1186 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                arg0.method5049(field1196, field1186 + 180, var133, 16777215, 0);
                int var134 = var133 + 15;
                int var49 = field1186 + 180 - 80;
                short var50 = 321;
                Statics.field1184.method5658(var49 - 73, var50 - 20);
                arg0.method5049(class234.field2790, var49, var50 + 5, 16777215, 0);
                int var51 = field1186 + 180 + 80;
                Statics.field1184.method5658(var51 - 73, var50 - 20);
                arg0.method5049(class234.field3033, var51, var50 + 5, 16777215, 0);
            } else if (field1192 == 2) {
                short var52 = 201;
                arg0.method5049(field1194, Statics.field1187, var52, 16776960, 0);
                int var135 = var52 + 15;
                arg0.method5049(field1195, Statics.field1187, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg0.method5049(field1196, Statics.field1187, var136, 16776960, 0);
                int var137 = var136 + 15;
                int var138 = var137 + 7;
                arg0.method4956(class234.field2946, Statics.field1187 - 110, var138, 16777215, 0);
                short var53 = 200;
                String var54;
                for (var54 = method3376(); arg0.method4961(var54) > var53; var54 = var54.substring(1)) {
                }
                arg0.method4956(class307.method4999(var54) + (field1182 == 0 & client.field656 % 40 < 20 ? class91.method200(16776960) + class91.field1152 : ""), Statics.field1187 - 70, var138, 16777215, 0);
                var135 = var138 + 15;
                String var55 = field1198;
                int var56 = var55.length();
                char[] var57 = new char[var56];
                for (int var58 = 0; var58 < var56; var58++) {
                    var57[var58] = '*';
                }
                String var59 = new String(var57);
                String var61;
                for (var61 = var59; arg0.method4961(var61) > var53; var61 = var61.substring(1)) {
                }
                arg0.method4956(class234.field3027 + var61 + (field1182 == 1 & client.field656 % 40 < 20 ? class91.method200(16776960) + class91.field1152 : ""), Statics.field1187 - 108, var135, 16777215, 0);
                var135 += 15;
                short var62 = 277;
                int var63 = Statics.field1187 + -117;
                class335 var64 = Statics.method3805(client.field685, field1193);
                var64.method5658(var63, var62);
                int var65 = var64.field3906 + 5 + var63;
                arg1.method4956(class234.field3034, var65, var62 + 13, 16776960, 0);
                int var66 = Statics.field1187 + 24;
                class335 var67 = Statics.method3805(Statics.field3618.field1054, field1181);
                var67.method5658(var66, var62);
                int var68 = var67.field3906 + 5 + var66;
                arg1.method4956(class234.field3061, var68, var62 + 13, 16776960, 0);
                int var139 = var62 + 15;
                int var69 = Statics.field1187 - 80;
                short var70 = 321;
                Statics.field1184.method5658(var69 - 73, var70 - 20);
                arg0.method5049(class234.field3032, var69, var70 + 5, 16777215, 0);
                int var71 = Statics.field1187 + 80;
                Statics.field1184.method5658(var71 - 73, var70 - 20);
                arg0.method5049(class234.field3033, var71, var70 + 5, 16777215, 0);
                short var72 = 357;
                switch(field1191) {
                    case 2:
                        Statics.field108 = class234.field3047;
                        break;
                    default:
                        Statics.field108 = class234.field2798;
                }
                Statics.field482 = new class330(Statics.field1187, var72, arg1.method4961(Statics.field108), 11);
                Statics.field644 = new class330(Statics.field1187, var72, arg1.method4961(class234.field2989), 11);
                arg1.method5049(Statics.field108, Statics.field1187, var72, 16777215, 0);
            } else if (field1192 == 3) {
                short var73 = 201;
                arg0.method5049(class234.field3036, field1186 + 180, var73, 16776960, 0);
                int var140 = var73 + 20;
                arg1.method5049(class234.field3069, field1186 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg1.method5049(class234.field3038, field1186 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var74 = field1186 + 180;
                short var75 = 276;
                Statics.field1184.method5658(var74 - 73, var75 - 20);
                arg2.method5049(class234.field3068, var74, var75 + 5, 16777215, 0);
                int var76 = field1186 + 180;
                short var77 = 326;
                Statics.field1184.method5658(var76 - 73, var77 - 20);
                arg2.method5049(class234.field2862, var76, var77 + 5, 16777215, 0);
            } else if (field1192 == 4) {
                arg0.method5049(class234.field3015, field1186 + 180, 201, 16776960, 0);
                short var78 = 236;
                arg0.method5049(field1194, field1186 + 180, var78, 16777215, 0);
                int var143 = var78 + 15;
                arg0.method5049(field1195, field1186 + 180, var143, 16777215, 0);
                int var144 = var143 + 15;
                arg0.method5049(field1196, field1186 + 180, var144, 16777215, 0);
                int var145 = var144 + 15;
                String var80 = class234.field2838;
                String var81 = Statics.field529;
                int var82 = var81.length();
                char[] var83 = new char[var82];
                for (int var84 = 0; var84 < var82; var84++) {
                    var83[var84] = '*';
                }
                String var85 = new String(var83);
                arg0.method4956(var80 + var85 + (client.field656 % 40 < 20 ? class91.method200(16776960) + class91.field1152 : ""), field1186 + 180 - 108, var145, 16777215, 0);
                var143 = var145 - 8;
                arg0.method4956(class234.field2793, field1186 + 180 - 9, var143, 16776960, 0);
                var143 += 15;
                arg0.method4956(class234.field2925, field1186 + 180 - 9, var143, 16776960, 0);
                int var87 = field1186 + 180 - 9 + arg0.method4961(class234.field2925) + 15;
                int var88 = var143 - arg0.field3728;
                class335 var89;
                if (field1201) {
                    var89 = Statics.field544;
                } else {
                    var89 = Statics.field2514;
                }
                var89.method5658(var87, var88);
                var143 += 15;
                int var90 = field1186 + 180 - 80;
                short var91 = 321;
                Statics.field1184.method5658(var90 - 73, var91 - 20);
                arg0.method5049(class234.field2790, var90, var91 + 5, 16777215, 0);
                int var92 = field1186 + 180 + 80;
                Statics.field1184.method5658(var92 - 73, var91 - 20);
                arg0.method5049(class234.field3033, var92, var91 + 5, 16777215, 0);
                arg1.method5049(class234.field2929, field1186 + 180, var91 + 36, 255, 0);
            } else if (field1192 == 5) {
                arg0.method5049(class234.field3041, field1186 + 180, 201, 16776960, 0);
                short var93 = 221;
                arg2.method5049(field1194, field1186 + 180, var93, 16776960, 0);
                int var146 = var93 + 15;
                arg2.method5049(field1195, field1186 + 180, var146, 16776960, 0);
                int var147 = var146 + 15;
                arg2.method5049(field1196, field1186 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                int var149 = var148 + 14;
                arg0.method4956(class234.field3042, field1186 + 180 - 145, var149, 16777215, 0);
                short var94 = 174;
                String var95;
                for (var95 = method3376(); arg0.method4961(var95) > var94; var95 = var95.substring(1)) {
                }
                arg0.method4956(class307.method4999(var95) + (client.field656 % 40 < 20 ? class91.method200(16776960) + class91.field1152 : ""), field1186 + 180 - 34, var149, 16777215, 0);
                var146 = var149 + 15;
                int var96 = field1186 + 180 - 80;
                short var97 = 321;
                Statics.field1184.method5658(var96 - 73, var97 - 20);
                arg0.method5049(class234.field3070, var96, var97 + 5, 16777215, 0);
                int var98 = field1186 + 180 + 80;
                Statics.field1184.method5658(var98 - 73, var97 - 20);
                arg0.method5049(class234.field2874, var98, var97 + 5, 16777215, 0);
                short var99 = 356;
                arg1.method5049(class234.field2989, Statics.field1187, var99, 268435455, 0);
            } else if (field1192 == 6) {
                short var100 = 201;
                arg0.method5049(field1194, field1186 + 180, var100, 16776960, 0);
                int var150 = var100 + 15;
                arg0.method5049(field1195, field1186 + 180, var150, 16776960, 0);
                int var151 = var150 + 15;
                arg0.method5049(field1196, field1186 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                int var101 = field1186 + 180;
                short var102 = 321;
                Statics.field1184.method5658(var101 - 73, var102 - 20);
                arg0.method5049(class234.field2874, var101, var102 + 5, 16777215, 0);
            } else if (field1192 == 7) {
                short var103 = 216;
                arg0.method5049(class234.field2894, field1186 + 180, var103, 16776960, 0);
                int var153 = var103 + 15;
                arg2.method5049(class234.field3073, field1186 + 180, var153, 16776960, 0);
                int var154 = var153 + 15;
                arg2.method5049(class234.field3074, field1186 + 180, var154, 16776960, 0);
                int var155 = var154 + 15;
                int var104 = field1186 + 180 - 80;
                short var105 = 321;
                Statics.field1184.method5658(var104 - 73, var105 - 20);
                arg0.method5049(class234.field3075, var104, var105 + 5, 16777215, 0);
                int var106 = field1186 + 180 + 80;
                Statics.field1184.method5658(var106 - 73, var105 - 20);
                arg0.method5049(class234.field2874, var106, var105 + 5, 16777215, 0);
            } else if (field1192 == 8) {
                short var107 = 216;
                arg0.method5049(class234.field2922, field1186 + 180, var107, 16776960, 0);
                int var156 = var107 + 15;
                arg2.method5049(class234.field3025, field1186 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                arg2.method5049(class234.field2924, field1186 + 180, var157, 16776960, 0);
                int var158 = var157 + 15;
                int var108 = field1186 + 180 - 80;
                short var109 = 321;
                Statics.field1184.method5658(var108 - 73, var109 - 20);
                arg0.method5049(class234.field2977, var108, var109 + 5, 16777215, 0);
                int var110 = field1186 + 180 + 80;
                Statics.field1184.method5658(var110 - 73, var109 - 20);
                arg0.method5049(class234.field2874, var110, var109 + 5, 16777215, 0);
            } else if (field1192 == 12) {
                short var111 = 201;
                String var112 = "";
                String var113 = "";
                String var114 = "";
                switch(field1200) {
                    case 0:
                        var112 = class234.field2824;
                        var113 = class234.field3012;
                        var114 = class234.field2840;
                        break;
                    case 1:
                        var112 = class234.field2877;
                        var113 = class234.field2878;
                        var114 = class234.field2879;
                        break;
                    default:
                        method557(false);
                }
                arg0.method5049(var112, field1186 + 180, var111, 16776960, 0);
                int var159 = var111 + 15;
                arg2.method5049(var113, field1186 + 180, var159, 16776960, 0);
                int var160 = var159 + 15;
                arg2.method5049(var114, field1186 + 180, var160, 16776960, 0);
                int var161 = var160 + 15;
                int var115 = field1186 + 180;
                short var116 = 276;
                Statics.field1184.method5658(var115 - 73, var116 - 20);
                arg0.method5049(class234.field3003, var115, var116 + 5, 16777215, 0);
                int var117 = field1186 + 180;
                short var118 = 326;
                Statics.field1184.method5658(var117 - 73, var118 - 20);
                arg0.method5049(class234.field2874, var117, var118 + 5, 16777215, 0);
            } else if (field1192 == 24) {
                short var119 = 221;
                arg0.method5049(field1194, field1186 + 180, var119, 16777215, 0);
                int var162 = var119 + 15;
                arg0.method5049(field1195, field1186 + 180, var162, 16777215, 0);
                int var163 = var162 + 15;
                arg0.method5049(field1196, field1186 + 180, var163, 16777215, 0);
                int var164 = var163 + 15;
                int var120 = field1186 + 180;
                short var121 = 301;
                Statics.field1184.method5658(var120 - 73, var121 - 20);
                arg0.method5049(class234.field2788, var120, var121 + 5, 16777215, 0);
            }
        }
        if (client.field654 >= 10) {
            int[] var122 = new int[4];
            class332.method5575(var122);
            class332.method5573(field1189, 0, field1189 + 765, Statics.field1893);
            Statics.field2.method1730(field1189 - 22, client.field656);
            Statics.field2.method1730(field1189 + 765 + 22 - 128, client.field656);
            class332.method5589(var122);
        }
        Statics.field1185[Statics.field3618.field1064 ? 1 : 0].method5658(field1189 + 765 - 40, 463);
        if (client.field654 <= 5 || Statics.field373 != class200.field2383) {
            return;
        }
        if (Statics.field43 == null) {
            Statics.field43 = class337.method715(Statics.field1292, "sl_button", "");
            return;
        }
        int var123 = field1189 + 5;
        short var124 = 463;
        byte var125 = 100;
        byte var126 = 35;
        Statics.field43.method5658(var123, var124);
        arg0.method5049(class234.field2800 + " " + client.field646, var125 / 2 + var123, var126 / 2 + var124 - 2, 16777215, 0);
        if (Statics.field1027 == null) {
            arg1.method5049(class234.field3016, var125 / 2 + var123, var126 / 2 + var124 + 12, 16777215, 0);
        } else {
            arg1.method5049(class234.field3085, var125 / 2 + var123, var126 / 2 + var124 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("bd.m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method966(String arg0, String arg1, String arg2) {
        field1194 = arg0;
        field1195 = arg1;
        field1196 = arg2;
    }

    @ObfuscatedName("bw.c(Lcj;I)V")
    public static void method1101(class81 arg0) {
        if (arg0.method1680() != client.field660) {
            client.field660 = arg0.method1680();
            Statics.method2040(arg0.method1680());
        }
        if (client.field647 != arg0.field1020) {
            class247 var1 = Statics.field1292;
            int var2 = arg0.field1020;
            if ((var2 & 0x20000000) != 0) {
                Statics.field2572 = class337.method715(var1, "logo_deadman_mode", "");
            } else if ((var2 & 0x40000000) == 0) {
                Statics.field2572 = class337.method715(var1, "logo", "");
            } else {
                Statics.field2572 = class337.method715(var1, "logo_seasonal_mode", "");
            }
        }
        Statics.field253 = arg0.field1022;
        client.field646 = arg0.field1019;
        client.field647 = arg0.field1020;
        Statics.field3584 = client.field648 == 0 ? 43594 : arg0.field1019 + 40000;
        Statics.field1267 = client.field648 == 0 ? 443 : arg0.field1019 + 50000;
        Statics.field3149 = Statics.field3584;
    }

    @ObfuscatedName("cv.i(I)V")
    public static void method2120() {
        field1192 = 24;
        method966(class234.field3020, class234.field3021, class234.field2902);
    }
}
