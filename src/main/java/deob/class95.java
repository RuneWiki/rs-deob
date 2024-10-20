package deob;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DecimalFormat;

@ObfuscatedName("cy")
public class class95 {

    @ObfuscatedName("cy.k")
    public static int field1192 = 0;

    @ObfuscatedName("cy.l")
    public static int field1216 = field1192 + 202;

    @ObfuscatedName("cy.o")
    public static int field1199 = 10;

    @ObfuscatedName("cy.c")
    public static String field1198 = "";

    @ObfuscatedName("cy.ap")
    public static int field1202 = -1;

    @ObfuscatedName("cy.af")
    public static int field1219 = 1;

    @ObfuscatedName("cy.am")
    public static int field1205 = 0;

    @ObfuscatedName("cy.au")
    public static String field1204 = "";

    @ObfuscatedName("cy.ao")
    public static String field1207 = "";

    @ObfuscatedName("cy.aq")
    public static String field1193 = "";

    @ObfuscatedName("cy.av")
    public static String field1209 = "";

    @ObfuscatedName("cy.ak")
    public static String field1221 = "";

    @ObfuscatedName("cy.aa")
    public static String field1211 = "";

    @ObfuscatedName("cy.ah")
    public static boolean field1208 = false;

    @ObfuscatedName("cy.ag")
    public static boolean field1213 = false;

    @ObfuscatedName("cy.bc")
    public static boolean field1215 = true;

    @ObfuscatedName("cy.bo")
    public static int field1210 = 0;

    @ObfuscatedName("cy.bd")
    public static String field1217 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cy.bk")
    public static String field1218 = "1234567890";

    @ObfuscatedName("cy.be")
    public static boolean field1220 = false;

    @ObfuscatedName("cy.bx")
    public static int field1200 = -1;

    @ObfuscatedName("cy.bz")
    public static int field1190 = 0;

    @ObfuscatedName("cy.bs")
    public static int field1223 = 0;

    @ObfuscatedName("cy.bm")
    public static long field1224;

    @ObfuscatedName("cy.bb")
    public static long field1225;

    static {
        new DecimalFormat("##0.00");
        new class172();
        field1224 = -1L;
        field1225 = -1L;
    }

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.x(Liy;Liy;I)I")
    public static int method1965(class244 arg0, class244 arg1) {
        int var2 = 0;
        if (arg0.method3886("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3886("logo", "")) {
            var2++;
        }
        if (arg1.method3886("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3886("logo_seasonal_mode", "")) {
            var2++;
        }
        if (arg1.method3886("titlebox", "")) {
            var2++;
        }
        if (arg1.method3886("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3886("runes", "")) {
            var2++;
        }
        if (arg1.method3886("title_mute", "")) {
            var2++;
        }
        if (arg1.method3886("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3886("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method3886("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method3886("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method3886("sl_back", "");
        arg1.method3886("sl_flags", "");
        arg1.method3886("sl_arrows", "");
        arg1.method3886("sl_stars", "");
        arg1.method3886("sl_button", "");
        return var2;
    }

    @ObfuscatedName("z.m(I)I")
    public static int method75() {
        return 12;
    }

    @ObfuscatedName("ks.k(Liy;Liy;ZII)V")
    public static void method4920(class244 arg0, class244 arg1, boolean arg2, int arg3) {
        if (!Statics.field1206) {
            field1205 = arg3;
            class331.method5603();
            byte[] var4 = arg0.method3868("title.jpg", "");
            Statics.field1194 = class59.method3428(var4);
            Statics.field2502 = Statics.field1194.method5721();
            if ((client.field682 & 0x20000000) != 0) {
                Statics.field19 = class336.method78(arg1, "logo_deadman_mode", "");
            } else if ((client.field682 & 0x40000000) == 0) {
                Statics.field19 = class336.method78(arg1, "logo", "");
            } else {
                Statics.field19 = class336.method78(arg1, "logo_seasonal_mode", "");
            }
            Statics.field1879 = class336.method78(arg1, "titlebox", "");
            Statics.field675 = class336.method78(arg1, "titlebutton", "");
            int var5 = arg1.method3885("runes");
            int var6 = arg1.method3878(var5, "");
            class334[] var7;
            if (class336.method3218(arg1, var5, var6)) {
                var7 = class336.method3843();
            } else {
                var7 = null;
            }
            Statics.field1191 = var7;
            Statics.field3785 = class336.method4854(arg1, "title_mute", "");
            Statics.field22 = class336.method78(arg1, "options_radio_buttons,0", "");
            Statics.field161 = class336.method78(arg1, "options_radio_buttons,4", "");
            Statics.field1195 = class336.method78(arg1, "options_radio_buttons,2", "");
            Statics.field1196 = class336.method78(arg1, "options_radio_buttons,6", "");
            Statics.field159 = Statics.field22.field3884;
            Statics.field2516 = Statics.field22.field3886;
            Statics.field2028 = new class82(Statics.field1191);
            if (arg2) {
                field1221 = "";
                field1211 = "";
            }
            Statics.field1142 = 0;
            Statics.field2026 = "";
            field1215 = true;
            field1220 = false;
            if (Statics.field677.field1079) {
                class207.field2407 = 1;
                Statics.field2408 = null;
                Statics.field2409 = -1;
                Statics.field2414 = -1;
                Statics.field2515 = 0;
                Statics.field107 = false;
                Statics.field1188 = 2;
            } else {
                class207.method389(2, Statics.field329, "scape main", "", 255, false);
            }
            if (Statics.field3181 != null) {
                try {
                    class310 var9 = new class310(4);
                    var9.method5121(3);
                    var9.method5178(0);
                    Statics.field3181.method3293(var9.field3710, 0, 4);
                } catch (IOException var13) {
                    try {
                        Statics.field3181.method3285();
                    } catch (Exception var12) {
                    }
                    class247.field3184++;
                    Statics.field3181 = null;
                }
            }
            Statics.field1206 = true;
            field1192 = (Statics.field278 - 765) / 2;
            field1216 = field1192 + 202;
            Statics.field1332 = field1216 + 180;
            Statics.field1194.method5729(field1192, 0);
            Statics.field2502.method5729(field1192 + 382, 0);
            Statics.field19.method5717(field1192 + 382 - Statics.field19.field3884 / 2, 18);
        } else if (arg3 == 4) {
            field1205 = 4;
        }
    }

    @ObfuscatedName("ko.d(I)Ljava/lang/String;")
    public static String method4889() {
        String var6;
        if (Statics.field677.field1076) {
            String var0 = field1221;
            int var1 = var0.length();
            char[] var2 = new char[var1];
            for (int var3 = 0; var3 < var1; var3++) {
                var2[var3] = '*';
            }
            String var4 = new String(var2);
            var6 = var4;
        } else {
            var6 = field1221;
        }
        return var6;
    }

    @ObfuscatedName("hq.w(I)V")
    public static void method3665() {
        if (!Statics.field1206) {
            return;
        }
        Statics.field1879 = null;
        Statics.field675 = null;
        Statics.field1191 = null;
        Statics.field1194 = null;
        Statics.field2502 = null;
        Statics.field19 = null;
        Statics.field3785 = null;
        Statics.field22 = null;
        Statics.field1195 = null;
        Statics.field589 = null;
        Statics.field80 = null;
        Statics.field247 = null;
        Statics.field4065 = null;
        Statics.field573 = null;
        Statics.field2028.method1727();
        class207.field2407 = 1;
        Statics.field2408 = null;
        Statics.field2409 = -1;
        Statics.field2414 = -1;
        Statics.field2515 = 0;
        Statics.field107 = false;
        Statics.field1188 = 2;
        if (Statics.field3181 != null) {
            try {
                class310 var0 = new class310(4);
                var0.method5121(2);
                var0.method5178(0);
                Statics.field3181.method3293(var0.field3710, 0, 4);
            } catch (IOException var4) {
                try {
                    Statics.field3181.method3285();
                } catch (Exception var3) {
                }
                class247.field3184++;
                Statics.field3181 = null;
            }
        }
        Statics.field1206 = false;
    }

    @ObfuscatedName("ka.v(B)V")
    public static void method4959() {
        if (client.field717 && field1221 != null && field1221.length() > 0) {
            field1210 = 1;
        } else {
            field1210 = 0;
        }
    }

    @ObfuscatedName("o.q(Lbr;I)V")
    public static void method211(class63 arg0) {
        if (field1220) {
            while (true) {
                if (!class55.method225()) {
                    if (class64.field525 != 1 && (Statics.field2507 || class64.field525 != 4)) {
                        break;
                    }
                    int var1 = field1192 + 280;
                    if (class64.field526 >= var1 && class64.field526 <= var1 + 14 && class64.field521 >= 4 && class64.field521 <= 18) {
                        Statics.method312(0, 0);
                        break;
                    }
                    if (class64.field526 >= var1 + 15 && class64.field526 <= var1 + 80 && class64.field521 >= 4 && class64.field521 <= 18) {
                        Statics.method312(0, 1);
                        break;
                    }
                    int var2 = field1192 + 390;
                    if (class64.field526 >= var2 && class64.field526 <= var2 + 14 && class64.field521 >= 4 && class64.field521 <= 18) {
                        Statics.method312(1, 0);
                        break;
                    }
                    if (class64.field526 >= var2 + 15 && class64.field526 <= var2 + 80 && class64.field521 >= 4 && class64.field521 <= 18) {
                        Statics.method312(1, 1);
                        break;
                    }
                    int var3 = field1192 + 500;
                    if (class64.field526 >= var3 && class64.field526 <= var3 + 14 && class64.field521 >= 4 && class64.field521 <= 18) {
                        Statics.method312(2, 0);
                        break;
                    }
                    if (class64.field526 >= var3 + 15 && class64.field526 <= var3 + 80 && class64.field521 >= 4 && class64.field521 <= 18) {
                        Statics.method312(2, 1);
                        break;
                    }
                    int var4 = field1192 + 610;
                    if (class64.field526 >= var4 && class64.field526 <= var4 + 14 && class64.field521 >= 4 && class64.field521 <= 18) {
                        Statics.method312(3, 0);
                        break;
                    }
                    if (class64.field526 >= var4 + 15 && class64.field526 <= var4 + 80 && class64.field521 >= 4 && class64.field521 <= 18) {
                        Statics.method312(3, 1);
                        break;
                    }
                    if (class64.field526 >= field1192 + 708 && class64.field521 >= 4 && class64.field526 <= field1192 + 708 + 50 && class64.field521 <= 20) {
                        field1220 = false;
                        Statics.field1194.method5729(field1192, 0);
                        Statics.field2502.method5729(field1192 + 382, 0);
                        Statics.field19.method5717(field1192 + 382 - Statics.field19.field3884 / 2, 18);
                        break;
                    }
                    if (field1200 == -1) {
                        if (field1190 > 0 && Statics.field1180 != null && class64.field526 >= 0 && class64.field526 <= Statics.field1180.field3884 && class64.field521 >= Statics.field2526 / 2 - 50 && class64.field521 <= Statics.field2526 / 2 + 50) {
                            field1190--;
                        }
                        if (field1190 < field1223 && Statics.field3309 != null && class64.field526 >= Statics.field278 - Statics.field3309.field3884 - 5 && class64.field526 <= Statics.field278 && class64.field521 >= Statics.field2526 / 2 - 50 && class64.field521 <= Statics.field2526 / 2 + 50) {
                            field1190++;
                        }
                    } else {
                        class81 var5 = Statics.field3838[field1200];
                        method3227(var5);
                        field1220 = false;
                        Statics.field1194.method5729(field1192, 0);
                        Statics.field2502.method5729(field1192 + 382, 0);
                        Statics.field19.method5717(field1192 + 382 - Statics.field19.field3884 / 2, 18);
                    }
                    break;
                }
                if (Statics.field17 == 13) {
                    method1939();
                    break;
                }
                if (Statics.field17 == 96) {
                    if (field1190 > 0 && Statics.field1180 != null) {
                        field1190--;
                    }
                } else if (Statics.field17 == 97 && field1190 < field1223 && Statics.field3309 != null) {
                    field1190++;
                }
            }
            return;
        }
        if ((class64.field525 == 1 || !Statics.field2507 && class64.field525 == 4) && class64.field526 >= field1192 + 765 - 50 && class64.field521 >= 453) {
            Statics.field677.field1079 = !Statics.field677.field1079;
            class83.method437();
            if (Statics.field677.field1079) {
                class207.method1323();
            } else {
                class207.method2190(Statics.field329, "scape main", "", 255, false);
            }
        }
        if (client.field688 == 5) {
            return;
        }
        if (field1224 == -1L) {
            field1224 = Statics.method3668() + 1000L;
        }
        long var6 = Statics.method3668();
        boolean var8;
        if (client.field952 == null || client.field953 >= client.field952.size()) {
            var8 = true;
        } else {
            while (true) {
                if (client.field953 >= client.field952.size()) {
                    var8 = true;
                    break;
                }
                class68 var9 = (class68) client.field952.get(client.field953);
                if (!var9.method1097()) {
                    var8 = false;
                    break;
                }
                client.field953++;
            }
        }
        if (var8 && field1225 == -1L) {
            field1225 = var6;
            if (field1225 > field1224) {
                field1224 = field1225;
            }
        }
        if (client.field688 != 10 && client.field688 != 11) {
            return;
        }
        if (Statics.field3598 == class200.field2359) {
            if (class64.field525 == 1 || !Statics.field2507 && class64.field525 == 4) {
                int var10 = field1192 + 5;
                short var11 = 463;
                byte var12 = 100;
                byte var13 = 35;
                if (class64.field526 >= var10 && class64.field526 <= var10 + var12 && class64.field521 >= var11 && class64.field521 <= var11 + var13) {
                    if (class81.method3426()) {
                        field1220 = true;
                        field1190 = 0;
                        field1223 = 0;
                    }
                    return;
                }
            }
            if (Statics.field2319 != null && class81.method3426()) {
                field1220 = true;
                field1190 = 0;
                field1223 = 0;
            }
        }
        int var14 = class64.field525;
        int var15 = class64.field526;
        int var16 = class64.field521;
        if (var14 == 0) {
            var15 = class64.field518;
            var16 = class64.field519;
        }
        if (!Statics.field2507 && var14 == 4) {
            var14 = 1;
        }
        if (field1205 == 0) {
            boolean var17 = false;
            while (class55.method225()) {
                if (Statics.field17 == 84) {
                    var17 = true;
                }
            }
            int var18 = Statics.field1332 - 80;
            short var19 = 291;
            if (var14 == 1 && var15 >= var18 - 75 && var15 <= var18 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20) {
                class61.method2135(client.method582("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var20 = Statics.field1332 + 80;
            if (var14 == 1 && var15 >= var20 - 75 && var15 <= var20 + 75 && var16 >= var19 - 20 && var16 <= var19 + 20 || var17) {
                if ((client.field682 & 0x2000000) != 0) {
                    field1204 = "";
                    field1207 = class234.field2853;
                    field1193 = class234.field2949;
                    field1209 = class234.field2987;
                    field1205 = 1;
                    method4959();
                } else if ((client.field682 & 0x4) != 0) {
                    if ((client.field682 & 0x400) == 0) {
                        field1207 = class234.field2976;
                        field1193 = class234.field2865;
                        field1209 = class234.field2978;
                    } else {
                        field1207 = class234.field2966;
                        field1193 = class234.field2983;
                        field1209 = class234.field2984;
                    }
                    field1204 = class234.field2975;
                    field1205 = 1;
                    method4959();
                } else if ((client.field682 & 0x400) == 0) {
                    method4319(false);
                } else {
                    field1207 = class234.field2979;
                    field1193 = class234.field2980;
                    field1209 = class234.field2981;
                    field1204 = class234.field2975;
                    field1205 = 1;
                    method4959();
                }
            }
        } else if (field1205 == 1) {
            while (true) {
                if (!class55.method225()) {
                    int var21 = Statics.field1332 - 80;
                    short var22 = 321;
                    if (var14 == 1 && var15 >= var21 - 75 && var15 <= var21 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                        method4319(false);
                    }
                    int var23 = Statics.field1332 + 80;
                    if (var14 == 1 && var15 >= var23 - 75 && var15 <= var23 + 75 && var16 >= var22 - 20 && var16 <= var22 + 20) {
                        field1205 = 0;
                    }
                    break;
                }
                if (Statics.field17 == 84) {
                    method4319(false);
                } else if (Statics.field17 == 13) {
                    field1205 = 0;
                }
            }
        } else if (field1205 == 2) {
            short var24 = 201;
            int var90 = var24 + 52;
            if (var14 == 1 && var16 >= var90 - 12 && var16 < var90 + 2) {
                field1210 = 0;
            }
            var90 += 15;
            if (var14 == 1 && var16 >= var90 - 12 && var16 < var90 + 2) {
                field1210 = 1;
            }
            var90 += 15;
            short var25 = 361;
            if (Statics.field316 != null) {
                int var26 = Statics.field316.field3856 / 2;
                if (var14 == 1 && var15 >= Statics.field316.field3858 - var26 && var15 <= Statics.field316.field3858 + var26 && var16 >= var25 - 15 && var16 < var25) {
                    switch(field1219) {
                        case 1:
                            method1684(class234.field3024, class234.field3025, class234.field3026);
                            field1205 = 5;
                            return;
                        case 2:
                            class61.method2135("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var27 = Statics.field1332 - 80;
            short var28 = 321;
            if (var14 == 1 && var15 >= var27 - 75 && var15 <= var27 + 75 && var16 >= var28 - 20 && var16 <= var28 + 20) {
                field1221 = field1221.trim();
                if (field1221.length() == 0) {
                    method1684(class234.field2877, class234.field3057, class234.field2879);
                    return;
                }
                if (field1211.length() == 0) {
                    method1684(class234.field2880, class234.field2881, class234.field2882);
                    return;
                }
                method1684(class234.field3015, class234.field2991, class234.field2992);
                client.method1937(false);
                client.method1137(20);
                return;
            }
            int var29 = field1216 + 180 + 80;
            if (var14 == 1 && var15 >= var29 - 75 && var15 <= var29 + 75 && var16 >= var28 - 20 && var16 <= var28 + 20) {
                field1205 = 0;
                field1221 = "";
                field1211 = "";
                Statics.field1142 = 0;
                Statics.field2026 = "";
                field1215 = true;
            }
            int var30 = Statics.field1332 + -117;
            short var31 = 277;
            field1208 = var15 >= var30 && var15 < Statics.field159 + var30 && var16 >= var31 && var16 < Statics.field2516 + var31;
            if (var14 == 1 && field1208) {
                client.field717 = !client.field717;
                if (!client.field717 && Statics.field677.field1081 != null) {
                    Statics.field677.field1081 = null;
                    class83.method437();
                }
            }
            int var32 = Statics.field1332 + 24;
            short var33 = 277;
            field1213 = var15 >= var32 && var15 < Statics.field159 + var32 && var16 >= var33 && var16 < Statics.field2516 + var33;
            if (var14 == 1 && field1213) {
                Statics.field677.field1076 = !Statics.field677.field1076;
                if (!Statics.field677.field1076) {
                    field1221 = "";
                    Statics.field677.field1081 = null;
                    method4959();
                }
                class83.method437();
            }
            while (true) {
                Transferable var39;
                int var40;
                do {
                    while (true) {
                        label900: do {
                            while (true) {
                                while (class55.method225()) {
                                    if (Statics.field17 == 13) {
                                        field1205 = 0;
                                        field1221 = "";
                                        field1211 = "";
                                        Statics.field1142 = 0;
                                        Statics.field2026 = "";
                                        field1215 = true;
                                    } else {
                                        if (field1210 != 0) {
                                            continue label900;
                                        }
                                        char var34 = Statics.field2532;
                                        for (int var35 = 0; var35 < field1217.length() && var34 != field1217.charAt(var35); var35++) {
                                        }
                                        if (Statics.field17 == 85 && field1221.length() > 0) {
                                            field1221 = field1221.substring(0, field1221.length() - 1);
                                        }
                                        if (Statics.field17 == 84 || Statics.field17 == 80) {
                                            field1210 = 1;
                                        }
                                        char var36 = Statics.field2532;
                                        boolean var37 = field1217.indexOf(var36) != -1;
                                        if (var37 && field1221.length() < 320) {
                                            field1221 = field1221 + Statics.field2532;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field1210 != 1);
                        if (Statics.field17 == 85 && field1211.length() > 0) {
                            field1211 = field1211.substring(0, field1211.length() - 1);
                        } else if (Statics.field17 == 84 || Statics.field17 == 80) {
                            field1210 = 0;
                            if (Statics.field17 == 84) {
                                field1221 = field1221.trim();
                                if (field1221.length() == 0) {
                                    method1684(class234.field2877, class234.field3057, class234.field2879);
                                    return;
                                }
                                if (field1211.length() == 0) {
                                    method1684(class234.field2880, class234.field2881, class234.field2882);
                                    return;
                                }
                                method1684(class234.field3015, class234.field2991, class234.field2992);
                                client.method1937(false);
                                client.method1137(20);
                                return;
                            }
                        }
                        if ((class55.field427[82] || class55.field427[87]) && Statics.field17 == 67) {
                            Clipboard var38 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var39 = var38.getContents(Statics.field319);
                            var40 = 20 - field1211.length();
                            break;
                        }
                        char var51 = Statics.field2532;
                        boolean var52;
                        if ((var51 < ' ' || var51 >= 127) && (var51 <= 127 || var51 >= 160) && (var51 <= 160 || var51 > 255)) {
                            label1100: {
                                if (var51 != 0) {
                                    char[] var53 = class298.field3642;
                                    for (int var54 = 0; var54 < var53.length; var54++) {
                                        char var55 = var53[var54];
                                        if (var51 == var55) {
                                            var52 = true;
                                            break label1100;
                                        }
                                    }
                                }
                                var52 = false;
                            }
                        } else {
                            var52 = true;
                        }
                        if (var52) {
                            char var56 = Statics.field2532;
                            boolean var57 = field1217.indexOf(var56) != -1;
                            if (var57 && field1211.length() < 20) {
                                field1211 = field1211 + Statics.field2532;
                            }
                        }
                    }
                } while (var40 <= 0);
                try {
                    String var41 = (String) var39.getTransferData(DataFlavor.stringFlavor);
                    int var42 = Math.min(var40, var41.length());
                    for (int var43 = 0; var43 < var42; var43++) {
                        char var44 = var41.charAt(var43);
                        boolean var45;
                        if ((var44 < ' ' || var44 >= 127) && (var44 <= 127 || var44 >= 160) && (var44 <= 160 || var44 > 255)) {
                            label1103: {
                                if (var44 != 0) {
                                    char[] var46 = class298.field3642;
                                    for (int var47 = 0; var47 < var46.length; var47++) {
                                        char var48 = var46[var47];
                                        if (var44 == var48) {
                                            var45 = true;
                                            break label1103;
                                        }
                                    }
                                }
                                var45 = false;
                            }
                        } else {
                            var45 = true;
                        }
                        if (!var45 || !method361(var41.charAt(var43))) {
                            field1205 = 3;
                            return;
                        }
                    }
                    field1211 = field1211 + var41.substring(0, var42);
                } catch (UnsupportedFlavorException var88) {
                } catch (IOException var89) {
                }
            }
        } else if (field1205 == 3) {
            int var58 = field1216 + 180;
            short var59 = 276;
            if (var14 == 1 && var15 >= var58 - 75 && var15 <= var58 + 75 && var16 >= var59 - 20 && var16 <= var59 + 20) {
                method4319(false);
            }
            int var60 = field1216 + 180;
            short var61 = 326;
            if (var14 == 1 && var15 >= var60 - 75 && var15 <= var60 + 75 && var16 >= var61 - 20 && var16 <= var61 + 20) {
                method1684(class234.field3024, class234.field3025, class234.field3026);
                field1205 = 5;
                return;
            }
        } else if (field1205 == 4) {
            int var62 = field1216 + 180 - 80;
            short var63 = 321;
            if (var14 == 1 && var15 >= var62 - 75 && var15 <= var62 + 75 && var16 >= var63 - 20 && var16 <= var63 + 20) {
                Statics.field2026.trim();
                if (Statics.field2026.length() != 6) {
                    method1684(class234.field2796, class234.field2797, class234.field2798);
                    return;
                }
                Statics.field1142 = Integer.parseInt(Statics.field2026);
                Statics.field2026 = "";
                client.method1937(true);
                method1684(class234.field3015, class234.field2991, class234.field2992);
                client.method1137(20);
                return;
            }
            if (var14 == 1 && var15 >= field1216 + 180 - 9 && var15 <= field1216 + 180 + 130 && var16 >= 263 && var16 <= 296) {
                field1215 = !field1215;
            }
            if (var14 == 1 && var15 >= field1216 + 180 - 34 && var15 <= field1216 + 180 + 34 && var16 >= 351 && var16 <= 363) {
                class61.method2135(client.method582("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var64 = field1216 + 180 + 80;
            if (var14 == 1 && var15 >= var64 - 75 && var15 <= var64 + 75 && var16 >= var63 - 20 && var16 <= var63 + 20) {
                field1205 = 0;
                field1221 = "";
                field1211 = "";
                Statics.field1142 = 0;
                Statics.field2026 = "";
            }
            while (class55.method225()) {
                boolean var65 = false;
                for (int var66 = 0; var66 < field1218.length(); var66++) {
                    if (Statics.field2532 == field1218.charAt(var66)) {
                        var65 = true;
                        break;
                    }
                }
                if (Statics.field17 == 13) {
                    field1205 = 0;
                    field1221 = "";
                    field1211 = "";
                    Statics.field1142 = 0;
                    Statics.field2026 = "";
                } else {
                    if (Statics.field17 == 85 && Statics.field2026.length() > 0) {
                        Statics.field2026 = Statics.field2026.substring(0, Statics.field2026.length() - 1);
                    }
                    if (Statics.field17 == 84) {
                        Statics.field2026.trim();
                        if (Statics.field2026.length() != 6) {
                            method1684(class234.field2796, class234.field2797, class234.field2798);
                            return;
                        }
                        Statics.field1142 = Integer.parseInt(Statics.field2026);
                        Statics.field2026 = "";
                        client.method1937(true);
                        method1684(class234.field3015, class234.field2991, class234.field2992);
                        client.method1137(20);
                        return;
                    }
                    if (var65 && Statics.field2026.length() < 6) {
                        Statics.field2026 = Statics.field2026 + Statics.field2532;
                    }
                }
            }
        } else if (field1205 == 5) {
            int var67 = field1216 + 180 - 80;
            short var68 = 321;
            if (var14 == 1 && var15 >= var67 - 75 && var15 <= var67 + 75 && var16 >= var68 - 20 && var16 <= var68 + 20) {
                Statics.method731();
                return;
            }
            int var69 = field1216 + 180 + 80;
            if (var14 == 1 && var15 >= var69 - 75 && var15 <= var69 + 75 && var16 >= var68 - 20 && var16 <= var68 + 20) {
                method4319(true);
            }
            short var70 = 361;
            if (Statics.field2496 != null) {
                int var71 = Statics.field2496.field3856 / 2;
                if (var14 == 1 && var15 >= Statics.field2496.field3858 - var71 && var15 <= Statics.field2496.field3858 + var71 && var16 >= var70 - 15 && var16 < var70) {
                    class61.method2135(client.method582("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class55.method225()) {
                boolean var72 = false;
                for (int var73 = 0; var73 < field1217.length(); var73++) {
                    if (Statics.field2532 == field1217.charAt(var73)) {
                        var72 = true;
                        break;
                    }
                }
                if (Statics.field17 == 13) {
                    method4319(true);
                } else {
                    if (Statics.field17 == 85 && field1221.length() > 0) {
                        field1221 = field1221.substring(0, field1221.length() - 1);
                    }
                    if (Statics.field17 == 84) {
                        Statics.method731();
                        return;
                    }
                    if (var72 && field1221.length() < 320) {
                        field1221 = field1221 + Statics.field2532;
                    }
                }
            }
        } else if (field1205 == 6) {
            while (true) {
                do {
                    if (!class55.method225()) {
                        short var74 = 321;
                        if (var14 == 1 && var16 >= var74 - 20 && var16 <= var74 + 20) {
                            method4319(true);
                        }
                        return;
                    }
                } while (Statics.field17 != 84 && Statics.field17 != 13);
                method4319(true);
            }
        } else if (field1205 == 7) {
            int var75 = field1216 + 180 - 80;
            short var76 = 321;
            if (var14 == 1 && var15 >= var75 - 75 && var15 <= var75 + 75 && var16 >= var76 - 20 && var16 <= var76 + 20) {
                class61.method2135(client.method582("secure", true) + "m=dob/set_dob.ws", true, false);
                method1684(class234.field3021, class234.field3022, class234.field3023);
                field1205 = 6;
                return;
            }
            int var77 = field1216 + 180 + 80;
            if (var14 == 1 && var15 >= var77 - 75 && var15 <= var77 + 75 && var16 >= var76 - 20 && var16 <= var76 + 20) {
                method4319(true);
            }
        } else if (field1205 == 8) {
            int var78 = field1216 + 180 - 80;
            short var79 = 321;
            if (var14 == 1 && var15 >= var78 - 75 && var15 <= var78 + 75 && var16 >= var79 - 20 && var16 <= var79 + 20) {
                class61.method2135("https://www.jagex.com/terms/privacy", true, false);
                method1684(class234.field3021, class234.field3022, class234.field3023);
                field1205 = 6;
                return;
            }
            int var80 = field1216 + 180 + 80;
            if (var14 == 1 && var15 >= var80 - 75 && var15 <= var80 + 75 && var16 >= var79 - 20 && var16 <= var79 + 20) {
                method4319(true);
            }
        } else if (field1205 == 12) {
            String var81 = "";
            switch(field1202) {
                case 0:
                    var81 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var81 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method4319(false);
            }
            int var82 = field1216 + 180;
            short var83 = 276;
            if (var14 == 1 && var15 >= var82 - 75 && var15 <= var82 + 75 && var16 >= var83 - 20 && var16 <= var83 + 20) {
                class61.method2135(var81, true, false);
                method1684(class234.field3021, class234.field3022, class234.field3023);
                field1205 = 6;
                return;
            }
            int var84 = field1216 + 180;
            short var85 = 326;
            if (var14 == 1 && var15 >= var84 - 75 && var15 <= var84 + 75 && var16 >= var85 - 20 && var16 <= var85 + 20) {
                method4319(false);
            }
        } else if (field1205 == 24) {
            int var86 = field1216 + 180;
            short var87 = 301;
            if (var14 == 1 && var15 >= var86 - 75 && var15 <= var86 + 75 && var16 >= var87 - 20 && var16 <= var87 + 20) {
                method4319(false);
            }
        }
    }

    @ObfuscatedName("at.z(CI)Z")
    public static boolean method361(char arg0) {
        return field1217.indexOf(arg0) != -1;
    }

    @ObfuscatedName("jw.t(ZI)V")
    public static void method4319(boolean arg0) {
        field1207 = class234.field3052;
        field1193 = class234.field2802;
        field1209 = class234.field2836;
        field1205 = 2;
        if (arg0) {
            field1211 = "";
        }
        if (field1221 == null || field1221.length() <= 0) {
            if (Statics.field677.field1081 == null) {
                client.field717 = false;
            } else {
                field1221 = Statics.field677.field1081;
                client.field717 = true;
            }
        }
        method4959();
    }

    @ObfuscatedName("bn.s(Lkx;Lkx;Lkx;I)V")
    public static void method1133(class305 arg0, class305 arg1, class305 arg2) {
        field1192 = (Statics.field278 - 765) / 2;
        field1216 = field1192 + 202;
        Statics.field1332 = field1216 + 180;
        if (field1220) {
            if (Statics.field589 == null) {
                Statics.field589 = class336.method4115(Statics.field2718, "sl_back", "");
            }
            if (Statics.field80 == null) {
                class246 var3 = Statics.field2718;
                int var4 = var3.method3885("sl_flags");
                int var5 = var3.method3878(var4, "");
                class334[] var6;
                if (class336.method3218(var3, var4, var5)) {
                    var6 = class336.method3843();
                } else {
                    var6 = null;
                }
                Statics.field80 = var6;
            }
            if (Statics.field247 == null) {
                class246 var8 = Statics.field2718;
                int var9 = var8.method3885("sl_arrows");
                int var10 = var8.method3878(var9, "");
                class334[] var11;
                if (class336.method3218(var8, var9, var10)) {
                    var11 = class336.method3843();
                } else {
                    var11 = null;
                }
                Statics.field247 = var11;
            }
            if (Statics.field4065 == null) {
                class246 var13 = Statics.field2718;
                int var14 = var13.method3885("sl_stars");
                int var15 = var13.method3878(var14, "");
                class334[] var16;
                if (class336.method3218(var13, var14, var15)) {
                    var16 = class336.method3843();
                } else {
                    var16 = null;
                }
                Statics.field4065 = var16;
            }
            if (Statics.field1180 == null) {
                Statics.field1180 = class336.method78(Statics.field2718, "leftarrow", "");
            }
            if (Statics.field3309 == null) {
                Statics.field3309 = class336.method78(Statics.field2718, "rightarrow", "");
            }
            class331.method5606(field1192, 23, 765, 480, 0);
            class331.method5607(field1192, 0, 125, 23, 12425273, 9135624);
            class331.method5607(field1192 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4990(class234.field3049, field1192 + 62, 15, 0, -1);
            if (Statics.field4065 != null) {
                Statics.field4065[1].method5717(field1192 + 140, 1);
                arg1.method4987(class234.field3050, field1192 + 152, 10, 16777215, -1);
                Statics.field4065[0].method5717(field1192 + 140, 12);
                arg1.method4987(class234.field3051, field1192 + 152, 21, 16777215, -1);
            }
            if (Statics.field247 != null) {
                int var18 = field1192 + 280;
                if (class81.field1048[0] == 0 && class81.field1049[0] == 0) {
                    Statics.field247[2].method5717(var18, 4);
                } else {
                    Statics.field247[0].method5717(var18, 4);
                }
                if (class81.field1048[0] == 0 && class81.field1049[0] == 1) {
                    Statics.field247[3].method5717(var18 + 15, 4);
                } else {
                    Statics.field247[1].method5717(var18 + 15, 4);
                }
                arg0.method4987(class234.field2917, var18 + 32, 17, 16777215, -1);
                int var19 = field1192 + 390;
                if (class81.field1048[0] == 1 && class81.field1049[0] == 0) {
                    Statics.field247[2].method5717(var19, 4);
                } else {
                    Statics.field247[0].method5717(var19, 4);
                }
                if (class81.field1048[0] == 1 && class81.field1049[0] == 1) {
                    Statics.field247[3].method5717(var19 + 15, 4);
                } else {
                    Statics.field247[1].method5717(var19 + 15, 4);
                }
                arg0.method4987(class234.field3053, var19 + 32, 17, 16777215, -1);
                int var20 = field1192 + 500;
                if (class81.field1048[0] == 2 && class81.field1049[0] == 0) {
                    Statics.field247[2].method5717(var20, 4);
                } else {
                    Statics.field247[0].method5717(var20, 4);
                }
                if (class81.field1048[0] == 2 && class81.field1049[0] == 1) {
                    Statics.field247[3].method5717(var20 + 15, 4);
                } else {
                    Statics.field247[1].method5717(var20 + 15, 4);
                }
                arg0.method4987(class234.field2924, var20 + 32, 17, 16777215, -1);
                int var21 = field1192 + 610;
                if (class81.field1048[0] == 3 && class81.field1049[0] == 0) {
                    Statics.field247[2].method5717(var21, 4);
                } else {
                    Statics.field247[0].method5717(var21, 4);
                }
                if (class81.field1048[0] == 3 && class81.field1049[0] == 1) {
                    Statics.field247[3].method5717(var21 + 15, 4);
                } else {
                    Statics.field247[1].method5717(var21 + 15, 4);
                }
                arg0.method4987(class234.field3055, var21 + 32, 17, 16777215, -1);
            }
            class331.method5606(field1192 + 708, 4, 50, 16, 0);
            arg1.method4990(class234.field3006, field1192 + 708 + 25, 16, 16777215, -1);
            field1200 = -1;
            if (Statics.field589 != null) {
                byte var22 = 88;
                byte var23 = 19;
                int var24 = 765 / (var22 + 1) - 1;
                int var25 = 480 / (var23 + 1);
                int var26;
                int var27;
                do {
                    var26 = var25;
                    var27 = var24;
                    if ((var24 - 1) * var25 >= class81.field1045) {
                        var24--;
                    }
                    if ((var25 - 1) * var24 >= class81.field1045) {
                        var25--;
                    }
                    if ((var25 - 1) * var24 >= class81.field1045) {
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
                int var32 = (class81.field1045 + var25 - 1) / var25;
                field1223 = var32 - var24;
                if (Statics.field1180 != null && field1190 > 0) {
                    Statics.field1180.method5717(8, Statics.field2526 / 2 - Statics.field1180.field3886 / 2);
                }
                if (Statics.field3309 != null && field1190 < field1223) {
                    Statics.field3309.method5717(Statics.field278 - Statics.field3309.field3884 - 8, Statics.field2526 / 2 - Statics.field3309.field3886 / 2);
                }
                int var33 = var31 + 23;
                int var34 = field1192 + var30;
                int var35 = 0;
                boolean var36 = false;
                int var37 = field1190;
                for (int var38 = var25 * var37; var38 < class81.field1045 && var37 - field1190 < var24; var38++) {
                    class81 var39 = Statics.field3838[var38];
                    boolean var40 = true;
                    String var41 = Integer.toString(var39.field1051);
                    if (var39.field1051 == -1) {
                        var41 = class234.field3056;
                        var40 = false;
                    } else if (var39.field1051 > 1980) {
                        var41 = class234.field2891;
                        var40 = false;
                    }
                    int var42 = 0;
                    byte var43;
                    if (var39.method1691()) {
                        if (var39.method1718()) {
                            var43 = 7;
                        } else {
                            var43 = 6;
                        }
                    } else if (var39.method1690()) {
                        var42 = 16711680;
                        if (var39.method1718()) {
                            var43 = 5;
                        } else {
                            var43 = 4;
                        }
                    } else if (var39.method1697()) {
                        if (var39.method1718()) {
                            var43 = 9;
                        } else {
                            var43 = 8;
                        }
                    } else if (var39.method1688()) {
                        if (var39.method1718()) {
                            var43 = 3;
                        } else {
                            var43 = 2;
                        }
                    } else if (var39.method1718()) {
                        var43 = 1;
                    } else {
                        var43 = 0;
                    }
                    if (class64.field518 >= var34 && class64.field519 >= var33 && class64.field518 < var22 + var34 && class64.field519 < var23 + var33 && var40) {
                        field1200 = var38;
                        Statics.field589[var43].method5793(var34, var33, 128, 16777215);
                        var36 = true;
                    } else {
                        Statics.field589[var43].method5729(var34, var33);
                    }
                    if (Statics.field80 != null) {
                        Statics.field80[(var39.method1718() ? 8 : 0) + var39.field1054].method5717(var34 + 29, var33);
                    }
                    arg0.method4990(Integer.toString(var39.field1041), var34 + 15, var23 / 2 + var33 + 5, var42, -1);
                    arg1.method4990(var41, var34 + 60, var23 / 2 + var33 + 5, 268435455, -1);
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
                    int var44 = arg1.method4982(Statics.field3838[field1200].field1053) + 6;
                    int var45 = arg1.field3683 + 8;
                    int var46 = class64.field519 + 25;
                    if (var45 + var46 > 480) {
                        var46 = class64.field519 - 25 - var45;
                    }
                    class331.method5606(class64.field518 - var44 / 2, var46, var44, var45, 16777120);
                    class331.method5691(class64.field518 - var44 / 2, var46, var44, var45, 0);
                    arg1.method4990(Statics.field3838[field1200].field1053, class64.field518, arg1.field3683 + var46 + 4, 0, -1);
                }
            }
            Statics.field2412.method846(0, 0);
            return;
        }
        Statics.field1194.method5729(field1192, 0);
        Statics.field2502.method5729(field1192 + 382, 0);
        Statics.field19.method5717(field1192 + 382 - Statics.field19.field3884 / 2, 18);
        if (client.field688 == 0 || client.field688 == 5) {
            byte var47 = 20;
            arg0.method4990(class234.field2971, field1216 + 180, 245 - var47, 16777215, -1);
            int var48 = 253 - var47;
            class331.method5691(field1216 + 180 - 152, var48, 304, 34, 9179409);
            class331.method5691(field1216 + 180 - 151, var48 + 1, 302, 32, 0);
            class331.method5606(field1216 + 180 - 150, var48 + 2, field1199 * 3, 30, 9179409);
            class331.method5606(field1199 * 3 + (field1216 + 180 - 150), var48 + 2, 300 - field1199 * 3, 30, 0);
            arg0.method4990(field1198, field1216 + 180, 276 - var47, 16777215, -1);
        }
        if (client.field688 == 20) {
            Statics.field1879.method5717(field1216 + 180 - Statics.field1879.field3884 / 2, 271 - Statics.field1879.field3886 / 2);
            short var49 = 201;
            arg0.method4990(field1207, field1216 + 180, var49, 16776960, 0);
            int var148 = var49 + 15;
            arg0.method4990(field1193, field1216 + 180, var148, 16776960, 0);
            int var149 = var148 + 15;
            arg0.method4990(field1209, field1216 + 180, var149, 16776960, 0);
            int var150 = var149 + 15;
            int var151 = var150 + 7;
            if (field1205 != 4) {
                arg0.method4987(class234.field2999, field1216 + 180 - 110, var151, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = method4889(); arg0.method4982(var51) > var50; var51 = var51.substring(0, var51.length() - 1)) {
                }
                arg0.method4987(class306.method4986(var51), field1216 + 180 - 70, var151, 16777215, 0);
                var148 = var151 + 15;
                String var52 = field1211;
                int var53 = var52.length();
                char[] var54 = new char[var53];
                for (int var55 = 0; var55 < var53; var55++) {
                    var54[var55] = '*';
                }
                String var56 = new String(var54);
                String var58;
                for (var58 = var56; arg0.method4982(var58) > var50; var58 = var58.substring(1)) {
                }
                arg0.method4987(class234.field3000 + var58, field1216 + 180 - 108, var148, 16777215, 0);
                var148 += 15;
            }
        }
        if (client.field688 == 10 || client.field688 == 11) {
            Statics.field1879.method5717(field1216, 171);
            if (field1205 == 0) {
                short var59 = 251;
                arg0.method4990(class234.field3002, field1216 + 180, var59, 16776960, 0);
                int var152 = var59 + 30;
                int var60 = field1216 + 180 - 80;
                short var61 = 291;
                Statics.field675.method5717(var60 - 73, var61 - 20);
                arg0.method4995(class234.field3003, var60 - 73, var61 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var62 = field1216 + 180 + 80;
                Statics.field675.method5717(var62 - 73, var61 - 20);
                arg0.method4995(class234.field3004, var62 - 73, var61 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1205 == 1) {
                arg0.method4990(field1204, field1216 + 180, 201, 16776960, 0);
                short var63 = 236;
                arg0.method4990(field1207, field1216 + 180, var63, 16777215, 0);
                int var153 = var63 + 15;
                arg0.method4990(field1193, field1216 + 180, var153, 16777215, 0);
                int var154 = var153 + 15;
                arg0.method4990(field1209, field1216 + 180, var154, 16777215, 0);
                int var155 = var154 + 15;
                int var64 = field1216 + 180 - 80;
                short var65 = 321;
                Statics.field675.method5717(var64 - 73, var65 - 20);
                arg0.method4990(class234.field2851, var64, var65 + 5, 16777215, 0);
                int var66 = field1216 + 180 + 80;
                Statics.field675.method5717(var66 - 73, var65 - 20);
                arg0.method4990(class234.field3006, var66, var65 + 5, 16777215, 0);
            } else if (field1205 == 2) {
                short var67 = 201;
                arg0.method4990(field1207, Statics.field1332, var67, 16776960, 0);
                int var156 = var67 + 15;
                arg0.method4990(field1193, Statics.field1332, var156, 16776960, 0);
                int var157 = var156 + 15;
                arg0.method4990(field1209, Statics.field1332, var157, 16776960, 0);
                int var158 = var157 + 15;
                int var159 = var158 + 7;
                arg0.method4987(class234.field2999, Statics.field1332 - 110, var159, 16777215, 0);
                short var68 = 200;
                String var69;
                for (var69 = method4889(); arg0.method4982(var69) > var68; var69 = var69.substring(1)) {
                }
                arg0.method4987(class306.method4986(var69) + (field1210 == 0 & client.field690 % 40 < 20 ? class91.method4912(16776960) + class91.field1164 : ""), Statics.field1332 - 70, var159, 16777215, 0);
                var156 = var159 + 15;
                String var70 = field1211;
                int var71 = var70.length();
                char[] var72 = new char[var71];
                for (int var73 = 0; var73 < var71; var73++) {
                    var72[var73] = '*';
                }
                String var74 = new String(var72);
                String var76;
                for (var76 = var74; arg0.method4982(var76) > var68; var76 = var76.substring(1)) {
                }
                arg0.method4987(class234.field3000 + var76 + (field1210 == 1 & client.field690 % 40 < 20 ? class91.method4912(16776960) + class91.field1164 : ""), Statics.field1332 - 108, var156, 16777215, 0);
                var156 += 15;
                short var77 = 277;
                int var78 = Statics.field1332 + -117;
                boolean var79 = client.field717;
                boolean var80 = field1208;
                class334 var81 = var79 ? (var80 ? Statics.field1196 : Statics.field1195) : (var80 ? Statics.field161 : Statics.field22);
                var81.method5717(var78, var77);
                int var83 = var81.field3884 + 5 + var78;
                arg1.method4987(class234.field2784, var83, var77 + 13, 16776960, 0);
                int var84 = Statics.field1332 + 24;
                boolean var85 = Statics.field677.field1076;
                boolean var86 = field1213;
                class334 var87 = var85 ? (var86 ? Statics.field1196 : Statics.field1195) : (var86 ? Statics.field161 : Statics.field22);
                var87.method5717(var84, var77);
                int var89 = var87.field3884 + 5 + var84;
                arg1.method4987(class234.field3012, var89, var77 + 13, 16776960, 0);
                int var160 = var77 + 15;
                int var90 = Statics.field1332 - 80;
                short var91 = 321;
                Statics.field675.method5717(var90 - 73, var91 - 20);
                arg0.method4990(class234.field3005, var90, var91 + 5, 16777215, 0);
                int var92 = Statics.field1332 + 80;
                Statics.field675.method5717(var92 - 73, var91 - 20);
                arg0.method4990(class234.field3006, var92, var91 + 5, 16777215, 0);
                short var93 = 357;
                switch(field1219) {
                    case 2:
                        Statics.field634 = class234.field2863;
                        break;
                    default:
                        Statics.field634 = class234.field3018;
                }
                Statics.field316 = new class329(Statics.field1332, var93, arg1.method4982(Statics.field634), 11);
                Statics.field2496 = new class329(Statics.field1332, var93, arg1.method4982(class234.field3045), 11);
                arg1.method4990(Statics.field634, Statics.field1332, var93, 16777215, 0);
            } else if (field1205 == 3) {
                short var94 = 201;
                arg0.method4990(class234.field2905, field1216 + 180, var94, 16776960, 0);
                int var161 = var94 + 20;
                arg1.method4990(class234.field3010, field1216 + 180, var161, 16776960, 0);
                int var162 = var161 + 15;
                arg1.method4990(class234.field3011, field1216 + 180, var162, 16776960, 0);
                int var163 = var162 + 15;
                int var95 = field1216 + 180;
                short var96 = 276;
                Statics.field675.method5717(var95 - 73, var96 - 20);
                arg2.method4990(class234.field3020, var95, var96 + 5, 16777215, 0);
                int var97 = field1216 + 180;
                short var98 = 326;
                Statics.field675.method5717(var97 - 73, var98 - 20);
                arg2.method4990(class234.field3013, var97, var98 + 5, 16777215, 0);
            } else if (field1205 == 4) {
                arg0.method4990(class234.field2988, field1216 + 180, 201, 16776960, 0);
                short var99 = 236;
                arg0.method4990(field1207, field1216 + 180, var99, 16777215, 0);
                int var164 = var99 + 15;
                arg0.method4990(field1193, field1216 + 180, var164, 16777215, 0);
                int var165 = var164 + 15;
                arg0.method4990(field1209, field1216 + 180, var165, 16777215, 0);
                int var166 = var165 + 15;
                String var101 = class234.field3001;
                String var102 = Statics.field2026;
                int var103 = var102.length();
                char[] var104 = new char[var103];
                for (int var105 = 0; var105 < var103; var105++) {
                    var104[var105] = '*';
                }
                String var106 = new String(var104);
                arg0.method4987(var101 + var106 + (client.field690 % 40 < 20 ? class91.method4912(16776960) + class91.field1164 : ""), field1216 + 180 - 108, var166, 16777215, 0);
                var164 = var166 - 8;
                arg0.method4987(class234.field2766, field1216 + 180 - 9, var164, 16776960, 0);
                var164 += 15;
                arg0.method4987(class234.field2767, field1216 + 180 - 9, var164, 16776960, 0);
                int var108 = field1216 + 180 - 9 + arg0.method4982(class234.field2767) + 15;
                int var109 = var164 - arg0.field3683;
                class334 var110;
                if (field1215) {
                    var110 = Statics.field1195;
                } else {
                    var110 = Statics.field22;
                }
                var110.method5717(var108, var109);
                var164 += 15;
                int var111 = field1216 + 180 - 80;
                short var112 = 321;
                Statics.field675.method5717(var111 - 73, var112 - 20);
                arg0.method4990(class234.field2851, var111, var112 + 5, 16777215, 0);
                int var113 = field1216 + 180 + 80;
                Statics.field675.method5717(var113 - 73, var112 - 20);
                arg0.method4990(class234.field3006, var113, var112 + 5, 16777215, 0);
                arg1.method4990(class234.field2989, field1216 + 180, var112 + 36, 255, 0);
            } else if (field1205 == 5) {
                arg0.method4990(class234.field3037, field1216 + 180, 201, 16776960, 0);
                short var114 = 221;
                arg2.method4990(field1207, field1216 + 180, var114, 16776960, 0);
                int var167 = var114 + 15;
                arg2.method4990(field1193, field1216 + 180, var167, 16776960, 0);
                int var168 = var167 + 15;
                arg2.method4990(field1209, field1216 + 180, var168, 16776960, 0);
                int var169 = var168 + 15;
                int var170 = var169 + 14;
                arg0.method4987(class234.field2986, field1216 + 180 - 145, var170, 16777215, 0);
                short var115 = 174;
                String var116;
                for (var116 = method4889(); arg0.method4982(var116) > var115; var116 = var116.substring(1)) {
                }
                arg0.method4987(class306.method4986(var116) + (client.field690 % 40 < 20 ? class91.method4912(16776960) + class91.field1164 : ""), field1216 + 180 - 34, var170, 16777215, 0);
                var167 = var170 + 15;
                int var117 = field1216 + 180 - 80;
                short var118 = 321;
                Statics.field675.method5717(var117 - 73, var118 - 20);
                arg0.method4990(class234.field3016, var117, var118 + 5, 16777215, 0);
                int var119 = field1216 + 180 + 80;
                Statics.field675.method5717(var119 - 73, var118 - 20);
                arg0.method4990(class234.field3017, var119, var118 + 5, 16777215, 0);
                short var120 = 356;
                arg1.method4990(class234.field3045, Statics.field1332, var120, 268435455, 0);
            } else if (field1205 == 6) {
                short var121 = 201;
                arg0.method4990(field1207, field1216 + 180, var121, 16776960, 0);
                int var171 = var121 + 15;
                arg0.method4990(field1193, field1216 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                arg0.method4990(field1209, field1216 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                int var122 = field1216 + 180;
                short var123 = 321;
                Statics.field675.method5717(var122 - 73, var123 - 20);
                arg0.method4990(class234.field3017, var122, var123 + 5, 16777215, 0);
            } else if (field1205 == 7) {
                short var124 = 216;
                arg0.method4990(class234.field3007, field1216 + 180, var124, 16776960, 0);
                int var174 = var124 + 15;
                arg2.method4990(class234.field2934, field1216 + 180, var174, 16776960, 0);
                int var175 = var174 + 15;
                arg2.method4990(class234.field3047, field1216 + 180, var175, 16776960, 0);
                int var176 = var175 + 15;
                int var125 = field1216 + 180 - 80;
                short var126 = 321;
                Statics.field675.method5717(var125 - 73, var126 - 20);
                arg0.method4990(class234.field2780, var125, var126 + 5, 16777215, 0);
                int var127 = field1216 + 180 + 80;
                Statics.field675.method5717(var127 - 73, var126 - 20);
                arg0.method4990(class234.field3017, var127, var126 + 5, 16777215, 0);
            } else if (field1205 == 8) {
                short var128 = 216;
                arg0.method4990(class234.field2895, field1216 + 180, var128, 16776960, 0);
                int var177 = var128 + 15;
                arg2.method4990(class234.field2896, field1216 + 180, var177, 16776960, 0);
                int var178 = var177 + 15;
                arg2.method4990(class234.field2897, field1216 + 180, var178, 16776960, 0);
                int var179 = var178 + 15;
                int var129 = field1216 + 180 - 80;
                short var130 = 321;
                Statics.field675.method5717(var129 - 73, var130 - 20);
                arg0.method4990(class234.field2898, var129, var130 + 5, 16777215, 0);
                int var131 = field1216 + 180 + 80;
                Statics.field675.method5717(var131 - 73, var130 - 20);
                arg0.method4990(class234.field3017, var131, var130 + 5, 16777215, 0);
            } else if (field1205 == 12) {
                short var132 = 201;
                String var133 = "";
                String var134 = "";
                String var135 = "";
                switch(field1202) {
                    case 0:
                        var133 = class234.field2916;
                        var134 = class234.field2812;
                        var135 = class234.field2994;
                        break;
                    case 1:
                        var133 = class234.field2850;
                        var134 = class234.field2915;
                        var135 = class234.field2852;
                        break;
                    default:
                        method4319(false);
                }
                arg0.method4990(var133, field1216 + 180, var132, 16776960, 0);
                int var180 = var132 + 15;
                arg2.method4990(var134, field1216 + 180, var180, 16776960, 0);
                int var181 = var180 + 15;
                arg2.method4990(var135, field1216 + 180, var181, 16776960, 0);
                int var182 = var181 + 15;
                int var136 = field1216 + 180;
                short var137 = 276;
                Statics.field675.method5717(var136 - 73, var137 - 20);
                arg0.method4990(class234.field2795, var136, var137 + 5, 16777215, 0);
                int var138 = field1216 + 180;
                short var139 = 326;
                Statics.field675.method5717(var138 - 73, var139 - 20);
                arg0.method4990(class234.field3017, var138, var139 + 5, 16777215, 0);
            } else if (field1205 == 24) {
                short var140 = 221;
                arg0.method4990(field1207, field1216 + 180, var140, 16777215, 0);
                int var183 = var140 + 15;
                arg0.method4990(field1193, field1216 + 180, var183, 16777215, 0);
                int var184 = var183 + 15;
                arg0.method4990(field1209, field1216 + 180, var184, 16777215, 0);
                int var185 = var184 + 15;
                int var141 = field1216 + 180;
                short var142 = 301;
                Statics.field675.method5717(var141 - 73, var142 - 20);
                arg0.method4990(class234.field2761, var141, var142 + 5, 16777215, 0);
            }
        }
        if (client.field688 >= 10) {
            int[] var143 = new int[4];
            class331.method5601(var143);
            class331.method5599(field1192, 0, field1192 + 765, Statics.field2526);
            Statics.field2028.method1750(field1192 - 22, client.field690);
            Statics.field2028.method1750(field1192 + 765 + 22 - 128, client.field690);
            class331.method5602(var143);
        }
        Statics.field3785[Statics.field677.field1079 ? 1 : 0].method5717(field1192 + 765 - 40, 463);
        if (client.field688 <= 5 || Statics.field3598 != class200.field2359) {
            return;
        }
        if (Statics.field573 == null) {
            Statics.field573 = class336.method78(Statics.field2718, "sl_button", "");
            return;
        }
        int var144 = field1192 + 5;
        short var145 = 463;
        byte var146 = 100;
        byte var147 = 35;
        Statics.field573.method5717(var144, var145);
        arg0.method4990(class234.field2926 + " " + client.field681, var146 / 2 + var144, var147 / 2 + var145 - 2, 16777215, 0);
        if (Statics.field2319 == null) {
            arg1.method4990(class234.field3059, var146 / 2 + var144, var147 / 2 + var145 + 12, 16777215, 0);
        } else {
            arg1.method4990(class234.field2860, var146 / 2 + var144, var147 / 2 + var145 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("cc.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1684(String arg0, String arg1, String arg2) {
        field1207 = arg0;
        field1193 = arg1;
        field1209 = arg2;
    }

    @ObfuscatedName("fp.n(Lch;S)V")
    public static void method3227(class81 arg0) {
        if (arg0.method1718() != client.field684) {
            client.field684 = arg0.method1718();
            class265.method1098(arg0.method1718());
        }
        Statics.field1306 = arg0.field1052;
        client.field681 = arg0.field1041;
        client.field682 = arg0.field1050;
        Statics.field158 = client.field683 == 0 ? 43594 : arg0.field1041 + 40000;
        Statics.field121 = client.field683 == 0 ? 443 : arg0.field1041 + 50000;
        Statics.field3575 = Statics.field158;
    }

    @ObfuscatedName("aq.u(II)V")
    public static void method573(int arg0) {
        field1205 = 12;
        field1202 = arg0;
    }

    @ObfuscatedName("cg.h(I)V")
    public static void method1939() {
        field1220 = false;
        Statics.field1194.method5729(field1192, 0);
        Statics.field2502.method5729(field1192 + 382, 0);
        Statics.field19.method5717(field1192 + 382 - Statics.field19.field3884 / 2, 18);
    }

    @ObfuscatedName("du.g(B)V")
    public static void method2192() {
        field1205 = 24;
        method1684(class234.field2906, class234.field2997, class234.field2998);
    }
}
