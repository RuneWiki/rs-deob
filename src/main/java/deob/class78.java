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

@ObfuscatedName("ca")
public class class78 {

    @ObfuscatedName("ca.ak")
    public static int field927 = 0;

    @ObfuscatedName("ca.aq")
    public static int field934 = field927 + 202;

    @ObfuscatedName("ca.at")
    public static int field935 = 10;

    @ObfuscatedName("ca.af")
    public static String field936 = "";

    @ObfuscatedName("ca.bl")
    public static int field938 = -1;

    @ObfuscatedName("ca.bx")
    public static int field939 = 1;

    @ObfuscatedName("ca.ce")
    public static int field944 = 0;

    @ObfuscatedName("ca.cu")
    public static String field941 = "";

    @ObfuscatedName("ca.cw")
    public static String field931 = "";

    @ObfuscatedName("ca.co")
    public static String field943 = "";

    @ObfuscatedName("ca.cc")
    public static String field958 = "";

    @ObfuscatedName("ca.cg")
    public static String field961 = "";

    @ObfuscatedName("ca.cq")
    public static String field946 = "";

    @ObfuscatedName("ca.cz")
    public static int field947 = 0;

    @ObfuscatedName("ca.cp")
    public static String[] field948 = new String[8];

    @ObfuscatedName("ca.cs")
    public static String field929 = "";

    @ObfuscatedName("ca.cd")
    public static boolean field950 = false;

    @ObfuscatedName("ca.ct")
    public static boolean field925 = false;

    @ObfuscatedName("ca.ca")
    public static boolean field952 = true;

    @ObfuscatedName("ca.dv")
    public static int field953 = 0;

    @ObfuscatedName("ca.dm")
    public static String field954 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ca.ds")
    public static String field926 = "1234567890";

    @ObfuscatedName("ca.dg")
    public static boolean field955 = false;

    @ObfuscatedName("ca.dp")
    public static int field957 = -1;

    @ObfuscatedName("ca.do")
    public static int field965 = 0;

    @ObfuscatedName("ca.dh")
    public static int field959 = 0;

    @ObfuscatedName("ca.du")
    public static long field960;

    @ObfuscatedName("ca.dr")
    public static long field956;

    @ObfuscatedName("ca.dw")
    public static String[] field940;

    @ObfuscatedName("ca.di")
    public static String[] field963;

    @ObfuscatedName("ca.dt")
    public static String[] field962;

    static {
        new DecimalFormat("##0.00");
        new class136();
        field960 = -1L;
        field956 = -1L;
        field940 = new String[] { "title.jpg" };
        field963 = new String[] { "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
        field962 = new String[] { "logo_speedrunning" };
    }

    public class78() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ok.ac(Lom;Lom;B)I")
    public static int method6258(class374 arg0, class374 arg1) {
        int var2 = 0;
        String[] var3 = field940;
        for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = var3[var4];
            if (arg0.method6282(var5, "")) {
                var2++;
            }
        }
        String[] var6 = field963;
        for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (arg1.method6282(var8, "")) {
                var2++;
            }
        }
        String[] var9 = field962;
        for (int var10 = 0; var10 < var9.length; var10++) {
            String var11 = var9[var10];
            if (arg1.method6279(var11) != -1 && arg1.method6282(var11, "")) {
                var2++;
            }
        }
        return var2;
    }

    @ObfuscatedName("dl.al(Lom;Lom;ZIB)V")
    public static void method2229(class374 arg0, class374 arg1, boolean arg2, int arg3) {
        if (!Statics.field945) {
            if (arg3 == 0) {
                method5370(arg2);
            } else {
                method638(arg3);
            }
            class540.method8698();
            byte[] var4 = arg0.method6281("title.jpg", "");
            Statics.field305 = class31.method4487(var4);
            Statics.field951 = Statics.field305.method8811();
            method4517(arg1, client.field520);
            Statics.field942 = class545.method3136(arg1, "titlebox", "");
            Statics.field1965 = class545.method3136(arg1, "titlebutton", "");
            Statics.field930 = class545.method3136(arg1, "titlebutton_large", "");
            Statics.field3942 = class545.method3136(arg1, "play_now_text", "");
            class545.method3136(arg1, "titlebutton_wide42,1", "");
            Statics.field949 = class545.method3313(arg1, "runes", "");
            Statics.field933 = class545.method3313(arg1, "title_mute", "");
            Statics.field5078 = class545.method3136(arg1, "options_radio_buttons,0", "");
            Statics.field3129 = class545.method3136(arg1, "options_radio_buttons,4", "");
            Statics.field5199 = class545.method3136(arg1, "options_radio_buttons,2", "");
            Statics.field1780 = class545.method3136(arg1, "options_radio_buttons,6", "");
            Statics.field2992 = Statics.field5078.field5231;
            Statics.field2026 = Statics.field5078.field5229;
            Statics.field5246 = new class100(Statics.field949);
            if (arg2) {
                field961 = "";
                field946 = "";
                field948 = new String[8];
                field947 = 0;
            }
            Statics.field1296 = 0;
            Statics.field1900 = "";
            field952 = true;
            field955 = false;
            if (Statics.field1106.method2387()) {
                class320.method3819(0, 0);
            } else {
                ArrayList var5 = new ArrayList();
                var5.add(new class332(Statics.field2393, "scape main", "", 255, false));
                class320.method2981(var5, 0, 0, 0, 100, false);
            }
            class320.method7699();
            client.method158().method6352(false);
            Statics.field945 = true;
            field927 = (Statics.field3598 - 765) / 2;
            field934 = field927 + 202;
            Statics.field4388 = field934 + 180;
            Statics.field305.method8821(field927, 0);
            Statics.field951.method8821(field927 + 382, 0);
            Statics.field932.method8786(field927 + 382 - Statics.field932.field5231 / 2, 18);
        } else if (arg3 == 4) {
            method638(4);
        }
    }

    @ObfuscatedName("gi.ak(ZZI)Lun;")
    public static class543 method3089(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field1780 : Statics.field5199) : (arg1 ? Statics.field3129 : Statics.field5078);
    }

    @ObfuscatedName("hd.ax(I)V")
    public static void method3314() {
        if (field961 != null && field961.length() > 0) {
            return;
        }
        if (Statics.field1106.method2460() == null) {
            client.field573 = false;
        } else {
            field961 = Statics.field1106.method2460();
            client.field573 = true;
        }
    }

    @ObfuscatedName("jq.ao(Lom;IB)V")
    public static void method4517(class374 arg0, int arg1) {
        if ((arg1 & class526.field5125.method38()) != 0) {
            Statics.field932 = class545.method3136(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & class526.field5126.method38()) != 0) {
            Statics.field932 = class545.method3136(arg0, "logo_seasonal_mode", "");
        } else if ((arg1 & class526.field5104.method38()) == 0) {
            Statics.field932 = class545.method3136(arg0, "logo", "");
        } else {
            Statics.field932 = class545.method3136(arg0, "logo_speedrunning", "");
        }
    }

    @ObfuscatedName("kk.ah(Lbb;Lpu;Lpu;B)V")
    public static void method5091(class35 arg0, class409 arg1, class409 arg2) {
        if (field955) {
            class227 var3 = client.method5171();
            while (true) {
                if (!var3.method3915()) {
                    if (class36.field242 != 1 && (Statics.field1462 || class36.field242 != 4)) {
                        break;
                    }
                    int var4 = field927 + 280;
                    if (class36.field244 >= var4 && class36.field244 <= var4 + 14 && class36.field248 >= 4 && class36.field248 <= 18) {
                        class69.method671(0, 0);
                        break;
                    }
                    if (class36.field244 >= var4 + 15 && class36.field244 <= var4 + 80 && class36.field248 >= 4 && class36.field248 <= 18) {
                        class69.method671(0, 1);
                        break;
                    }
                    int var5 = field927 + 390;
                    if (class36.field244 >= var5 && class36.field244 <= var5 + 14 && class36.field248 >= 4 && class36.field248 <= 18) {
                        class69.method671(1, 0);
                        break;
                    }
                    if (class36.field244 >= var5 + 15 && class36.field244 <= var5 + 80 && class36.field248 >= 4 && class36.field248 <= 18) {
                        class69.method671(1, 1);
                        break;
                    }
                    int var6 = field927 + 500;
                    if (class36.field244 >= var6 && class36.field244 <= var6 + 14 && class36.field248 >= 4 && class36.field248 <= 18) {
                        class69.method671(2, 0);
                        break;
                    }
                    if (class36.field244 >= var6 + 15 && class36.field244 <= var6 + 80 && class36.field248 >= 4 && class36.field248 <= 18) {
                        class69.method671(2, 1);
                        break;
                    }
                    int var7 = field927 + 610;
                    if (class36.field244 >= var7 && class36.field244 <= var7 + 14 && class36.field248 >= 4 && class36.field248 <= 18) {
                        class69.method671(3, 0);
                        break;
                    }
                    if (class36.field244 >= var7 + 15 && class36.field244 <= var7 + 80 && class36.field248 >= 4 && class36.field248 <= 18) {
                        class69.method671(3, 1);
                        break;
                    }
                    if (class36.field244 >= field927 + 708 && class36.field248 >= 4 && class36.field244 <= field927 + 708 + 50 && class36.field248 <= 20) {
                        field955 = false;
                        Statics.field305.method8821(field927, 0);
                        Statics.field951.method8821(field927 + 382, 0);
                        Statics.field932.method8786(field927 + 382 - Statics.field932.field5231 / 2, 18);
                        break;
                    }
                    if (field957 == -1) {
                        if (field965 > 0 && Statics.field4319 != null && class36.field244 >= 0 && class36.field244 <= Statics.field4319.field5231 && class36.field248 >= Statics.field4908 / 2 - 50 && class36.field248 <= Statics.field4908 / 2 + 50) {
                            field965--;
                        }
                        if (field965 < field959 && Statics.field2426 != null && class36.field244 >= Statics.field3598 - Statics.field2426.field5231 - 5 && class36.field244 <= Statics.field3598 && class36.field248 >= Statics.field4908 / 2 - 50 && class36.field248 <= Statics.field4908 / 2 + 50) {
                            field965++;
                        }
                    } else {
                        class69 var8 = Statics.field1471[field957];
                        if (var8.method1736()) {
                            var8.field834 = "beta";
                        }
                        boolean var9 = false;
                        if (client.field520 != var8.field832) {
                            boolean var10 = (client.field520 & class526.field5113.method38()) != 0;
                            boolean var11 = var8.method1736();
                            if (var10 && !var11 || !var10 && var11) {
                                var9 = true;
                            }
                        }
                        method6507(var8);
                        field955 = false;
                        Statics.field305.method8821(field927, 0);
                        Statics.field951.method8821(field927 + 382, 0);
                        Statics.field932.method8786(field927 + 382 - Statics.field932.field5231 / 2, 18);
                        if (var9) {
                            client.method2961();
                        }
                    }
                    break;
                }
                if (var3.field2387 == 13) {
                    field955 = false;
                    Statics.field305.method8821(field927, 0);
                    Statics.field951.method8821(field927 + 382, 0);
                    Statics.field932.method8786(field927 + 382 - Statics.field932.field5231 / 2, 18);
                    break;
                }
                if (var3.field2387 == 96) {
                    if (field965 > 0 && Statics.field4319 != null) {
                        field965--;
                    }
                } else if (var3.field2387 == 97 && field965 < field959 && Statics.field2426 != null) {
                    field965++;
                }
            }
            return;
        }
        if ((class36.field242 == 1 || !Statics.field1462 && class36.field242 == 4) && class36.field244 >= field927 + 765 - 50 && class36.field248 >= 453) {
            Statics.field1106.method2389(!Statics.field1106.method2387());
            if (Statics.field1106.method2387()) {
                class320.method3819(0, 0);
            } else {
                ArrayList var12 = new ArrayList();
                var12.add(new class332(Statics.field2393, "scape main", "", 255, false));
                class320.method2981(var12, 0, 0, 0, 100, false);
            }
            class320.method7699();
        }
        if (client.field530 == 5) {
            return;
        }
        if (field960 == -1L) {
            field960 = class316.method6401() + 1000L;
        }
        long var13 = class316.method6401();
        if (client.method1857() && field956 == -1L) {
            field956 = var13;
            if (field956 > field960) {
                field960 = field956;
            }
        }
        if (client.field530 != 10 && client.field530 != 11) {
            return;
        }
        if (Statics.field2910 == class389.field4438) {
            if (class36.field242 == 1 || !Statics.field1462 && class36.field242 == 4) {
                int var15 = field927 + 5;
                short var16 = 463;
                byte var17 = 100;
                byte var18 = 35;
                if (class36.field244 >= var15 && class36.field244 <= var15 + var17 && class36.field248 >= var16 && class36.field248 <= var16 + var18) {
                    if (class69.method312()) {
                        field955 = true;
                        field965 = 0;
                        field959 = 0;
                    }
                    return;
                }
            }
            if (Statics.field1104 != null && class69.method312()) {
                field955 = true;
                field965 = 0;
                field959 = 0;
            }
        }
        int var19 = class36.field242;
        int var20 = class36.field244;
        int var21 = class36.field248;
        if (var19 == 0) {
            var20 = class36.field235;
            var21 = class36.field241;
        }
        if (!Statics.field1462 && var19 == 4) {
            var19 = 1;
        }
        class227 var22 = client.method5171();
        if (field944 == 0) {
            boolean var23 = false;
            while (var22.method3915()) {
                if (var22.field2387 == 84) {
                    var23 = true;
                }
            }
            int var24 = Statics.field4388 - 80;
            short var25 = 291;
            if (var19 == 1 && var20 >= var24 - 75 && var20 <= var24 + 75 && var21 >= var25 - 20 && var21 <= var25 + 20) {
                class32.method4708(client.method2216("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var26 = Statics.field4388 + 80;
            if (var19 == 1 && var20 >= var26 - 75 && var20 <= var26 + 75 && var21 >= var25 - 20 && var21 <= var25 + 20 || var23) {
                if ((client.field520 & class526.field5121.method38()) != 0) {
                    field941 = "";
                    field931 = class367.field4161;
                    field943 = class367.field4172;
                    field958 = class367.field4035;
                    method638(1);
                    if (client.field573 && field961 != null && field961.length() > 0) {
                        field953 = 1;
                    } else {
                        field953 = 0;
                    }
                } else if ((client.field520 & class526.field5097.method38()) != 0) {
                    if ((client.field520 & class526.field5106.method38()) == 0) {
                        field931 = class367.field4162;
                        field943 = class367.field4163;
                        field958 = class367.field4195;
                    } else {
                        field931 = class367.field4041;
                        field943 = class367.field4169;
                        field958 = class367.field4170;
                    }
                    field941 = class367.field4023;
                    method638(1);
                    if (client.field573 && field961 != null && field961.length() > 0) {
                        field953 = 1;
                    } else {
                        field953 = 0;
                    }
                } else if ((client.field520 & class526.field5106.method38()) == 0) {
                    method7151(false);
                } else {
                    field931 = class367.field4165;
                    field943 = class367.field4178;
                    field958 = class367.field4167;
                    field941 = class367.field4023;
                    method638(1);
                    if (client.field573 && field961 != null && field961.length() > 0) {
                        field953 = 1;
                    } else {
                        field953 = 0;
                    }
                }
            }
        } else if (field944 == 1) {
            while (true) {
                if (!var22.method3915()) {
                    int var27 = Statics.field4388 - 80;
                    short var28 = 321;
                    if (var19 == 1 && var20 >= var27 - 75 && var20 <= var27 + 75 && var21 >= var28 - 20 && var21 <= var28 + 20) {
                        method7151(false);
                    }
                    int var29 = Statics.field4388 + 80;
                    if (var19 == 1 && var20 >= var29 - 75 && var20 <= var29 + 75 && var21 >= var28 - 20 && var21 <= var28 + 20) {
                        method638(0);
                    }
                    break;
                }
                if (var22.field2387 == 84) {
                    method7151(false);
                } else if (var22.field2387 == 13) {
                    method638(0);
                }
            }
        } else if (field944 == 2) {
            short var30 = 201;
            int var141 = var30 + 52;
            if (var19 == 1 && var21 >= var141 - 12 && var21 < var141 + 2) {
                field953 = 0;
            }
            var141 += 15;
            if (var19 == 1 && var21 >= var141 - 12 && var21 < var141 + 2) {
                field953 = 1;
            }
            var141 += 15;
            short var31 = 361;
            if (Statics.field4846 != null) {
                int var32 = Statics.field4846.field4763 / 2;
                if (var19 == 1 && var20 >= Statics.field4846.field4764 - var32 && var20 <= Statics.field4846.field4764 + var32 && var21 >= var31 - 15 && var21 < var31) {
                    switch(field939) {
                        case 1:
                            class32.method4708(class367.field4258, true, false);
                            return;
                        case 2:
                            class32.method4708("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var33 = Statics.field4388 - 80;
            short var34 = 321;
            if (var19 == 1 && var20 >= var33 - 75 && var20 <= var33 + 75 && var21 >= var34 - 20 && var21 <= var34 + 20) {
                method2990();
                return;
            }
            int var35 = field934 + 180 + 80;
            if (var19 == 1 && var20 >= var35 - 75 && var20 <= var35 + 75 && var21 >= var34 - 20 && var21 <= var34 + 20) {
                method638(0);
                field961 = "";
                field946 = "";
                Statics.field1296 = 0;
                Statics.field1900 = "";
                field952 = true;
            }
            int var36 = Statics.field4388 + -117;
            short var37 = 277;
            field950 = var20 >= var36 && var20 < Statics.field2992 + var36 && var21 >= var37 && var21 < Statics.field2026 + var37;
            if (var19 == 1 && field950) {
                client.field573 = !client.field573;
                if (!client.field573 && Statics.field1106.method2460() != null) {
                    Statics.field1106.method2404((String) null);
                }
            }
            int var38 = Statics.field4388 + 24;
            short var39 = 277;
            field925 = var20 >= var38 && var20 < Statics.field2992 + var38 && var21 >= var39 && var21 < Statics.field2026 + var39;
            if (var19 == 1 && field925) {
                Statics.field1106.method2415(!Statics.field1106.method2388());
                if (!Statics.field1106.method2388()) {
                    field961 = "";
                    Statics.field1106.method2404((String) null);
                    if (client.field573 && field961 != null && field961.length() > 0) {
                        field953 = 1;
                    } else {
                        field953 = 0;
                    }
                }
            }
            label1341: while (true) {
                Transferable var45;
                int var46;
                do {
                    while (true) {
                        label1257: do {
                            while (true) {
                                while (var22.method3915()) {
                                    if (var22.field2387 == 13) {
                                        method638(0);
                                        field961 = "";
                                        field946 = "";
                                        Statics.field1296 = 0;
                                        Statics.field1900 = "";
                                        field952 = true;
                                    } else {
                                        if (field953 != 0) {
                                            continue label1257;
                                        }
                                        char var40 = var22.field2376;
                                        for (int var41 = 0; var41 < field954.length() && var40 != field954.charAt(var41); var41++) {
                                        }
                                        if (var22.field2387 == 85 && field961.length() > 0) {
                                            field961 = field961.substring(0, field961.length() - 1);
                                        }
                                        if (var22.field2387 == 84 || var22.field2387 == 80) {
                                            field953 = 1;
                                        }
                                        char var42 = var22.field2376;
                                        boolean var43 = field954.indexOf(var42) != -1;
                                        if (var43 && field961.length() < 320) {
                                            field961 = field961 + var22.field2376;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (field953 != 1);
                        if (var22.field2387 == 85 && field946.length() > 0) {
                            field946 = field946.substring(0, field946.length() - 1);
                        } else if (var22.field2387 == 84 || var22.field2387 == 80) {
                            field953 = 0;
                            if (var22.field2387 == 84) {
                                field961 = field961.trim();
                                if (field961.length() == 0) {
                                    method5196(class367.field4069, class367.field3966, class367.field4071);
                                    return;
                                }
                                if (field946.length() == 0) {
                                    method5196(class367.field4072, class367.field4073, class367.field4022);
                                    return;
                                }
                                method5196(class367.field4175, class367.field4017, class367.field4111);
                                client.method2807(false);
                                client.method7509(20);
                                return;
                            }
                        }
                        if ((var22.method3924(82) || var22.method3924(87)) && var22.field2387 == 67) {
                            Clipboard var44 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var45 = var44.getContents(Statics.field1743);
                            var46 = 20 - field946.length();
                            break;
                        }
                        char var59 = var22.field2376;
                        boolean var60;
                        if ((var59 < ' ' || var59 >= 127) && (var59 <= 127 || var59 >= 160) && (var59 <= 160 || var59 > 255)) {
                            label1491: {
                                if (var59 != 0) {
                                    char[] var61 = class400.field4475;
                                    for (int var62 = 0; var62 < var61.length; var62++) {
                                        char var63 = var61[var62];
                                        if (var59 == var63) {
                                            var60 = true;
                                            break label1491;
                                        }
                                    }
                                }
                                var60 = false;
                            }
                        } else {
                            var60 = true;
                        }
                        if (var60) {
                            char var64 = var22.field2376;
                            boolean var65 = field954.indexOf(var64) != -1;
                            if (var65 && field946.length() < 20) {
                                field946 = field946 + var22.field2376;
                            }
                        }
                    }
                } while (var46 <= 0);
                try {
                    String var47 = (String) var45.getTransferData(DataFlavor.stringFlavor);
                    int var48 = Math.min(var46, var47.length());
                    int var49 = 0;
                    while (true) {
                        if (var49 >= var48) {
                            field946 = field946 + var47.substring(0, var48);
                            continue label1341;
                        }
                        char var50 = var47.charAt(var49);
                        boolean var51;
                        if (var50 >= ' ' && var50 < 127 || var50 > 127 && var50 < 160 || var50 > 160 && var50 <= 255) {
                            var51 = true;
                        } else {
                            label1513: {
                                if (var50 != 0) {
                                    char[] var52 = class400.field4475;
                                    for (int var53 = 0; var53 < var52.length; var53++) {
                                        char var54 = var52[var53];
                                        if (var50 == var54) {
                                            var51 = true;
                                            break label1513;
                                        }
                                    }
                                }
                                var51 = false;
                            }
                        }
                        if (!var51) {
                            break;
                        }
                        char var55 = var47.charAt(var49);
                        boolean var56 = field954.indexOf(var55) != -1;
                        if (!var56) {
                            break;
                        }
                        var49++;
                    }
                    method638(3);
                    return;
                } catch (UnsupportedFlavorException var139) {
                } catch (IOException var140) {
                }
            }
        } else if (field944 == 3) {
            int var66 = field934 + 180;
            short var67 = 241;
            class461 var68 = arg1.method6970(25, class367.field4138.length() - 34, class367.field4138, var66, var67);
            if (var19 == 1 && var68.method7530(var20, var21)) {
                class32.method4708(class367.field3999, true, false);
            }
            int var69 = field934 + 180;
            short var70 = 276;
            if (var19 == 1 && var20 >= var69 - 75 && var20 <= var69 + 75 && var21 >= var70 - 20 && var21 <= var70 + 20) {
                method5370(false);
            }
            int var71 = field934 + 180;
            short var72 = 326;
            if (var19 == 1 && var20 >= var71 - 75 && var20 <= var71 + 75 && var21 >= var72 - 20 && var21 <= var72 + 20) {
                class32.method4708(class367.field4258, true, false);
                return;
            }
        } else if (field944 == 4) {
            int var73 = field934 + 180 - 80;
            short var74 = 321;
            if (var19 == 1 && var20 >= var73 - 75 && var20 <= var73 + 75 && var21 >= var74 - 20 && var21 <= var74 + 20) {
                Statics.field1900.trim();
                if (Statics.field1900.length() != 6) {
                    method5196(class367.field3988, class367.field3967, class367.field4225);
                    return;
                }
                Statics.field1296 = Integer.parseInt(Statics.field1900);
                Statics.field1900 = "";
                client.method2807(true);
                method5196(class367.field4175, class367.field4017, class367.field4111);
                client.method7509(20);
                return;
            }
            if (var19 == 1 && var20 >= field934 + 180 - 9 && var20 <= field934 + 180 + 130 && var21 >= 263 && var21 <= 296) {
                field952 = !field952;
            }
            if (var19 == 1 && var20 >= field934 + 180 - 34 && var20 <= field934 + 180 + 34 && var21 >= 351 && var21 <= 363) {
                class32.method4708(class367.field4258, true, false);
            }
            int var75 = field934 + 180 + 80;
            if (var19 == 1 && var20 >= var75 - 75 && var20 <= var75 + 75 && var21 >= var74 - 20 && var21 <= var74 + 20) {
                method638(0);
                field961 = "";
                field946 = "";
                Statics.field1296 = 0;
                Statics.field1900 = "";
            }
            while (var22.method3915()) {
                boolean var76 = false;
                for (int var77 = 0; var77 < field926.length(); var77++) {
                    if (var22.field2376 == field926.charAt(var77)) {
                        var76 = true;
                        break;
                    }
                }
                if (var22.field2387 == 13) {
                    method638(0);
                    field961 = "";
                    field946 = "";
                    Statics.field1296 = 0;
                    Statics.field1900 = "";
                } else {
                    if (var22.field2387 == 85 && Statics.field1900.length() > 0) {
                        Statics.field1900 = Statics.field1900.substring(0, Statics.field1900.length() - 1);
                    }
                    if (var22.field2387 == 84) {
                        Statics.field1900.trim();
                        if (Statics.field1900.length() != 6) {
                            method5196(class367.field3988, class367.field3967, class367.field4225);
                            return;
                        }
                        Statics.field1296 = Integer.parseInt(Statics.field1900);
                        Statics.field1900 = "";
                        client.method2807(true);
                        method5196(class367.field4175, class367.field4017, class367.field4111);
                        client.method7509(20);
                        return;
                    }
                    if (var76 && Statics.field1900.length() < 6) {
                        Statics.field1900 = Statics.field1900 + var22.field2376;
                    }
                }
            }
        } else if (field944 == 5) {
            int var78 = field934 + 180 - 80;
            short var79 = 321;
            if (var19 == 1 && var20 >= var78 - 75 && var20 <= var78 + 75 && var21 >= var79 - 20 && var21 <= var79 + 20) {
                field961 = field961.trim();
                if (field961.length() == 0) {
                    method5196(class367.field4126, class367.field4210, class367.field4211);
                } else {
                    long var80 = class75.method40();
                    int var82;
                    if (var80 == 0L) {
                        var82 = 5;
                    } else {
                        var82 = class75.method3269(var80, field961);
                    }
                    switch(var82) {
                        case 2:
                            method5196(class367.field4189, class367.field4025, class367.field4214);
                            method638(6);
                            break;
                        case 3:
                            method5196(class367.field4215, class367.field4216, class367.field4062);
                            break;
                        case 4:
                            method5196(class367.field4157, class367.field4219, class367.field4026);
                            break;
                        case 5:
                            method5196(class367.field4029, class367.field4222, class367.field4223);
                            break;
                        case 6:
                            method5196(class367.field4224, class367.field4173, class367.field4226);
                            break;
                        case 7:
                            method5196(class367.field4121, class367.field4039, class367.field4229);
                    }
                }
                return;
            }
            int var83 = field934 + 180 + 80;
            if (var19 == 1 && var20 >= var83 - 75 && var20 <= var83 + 75 && var21 >= var79 - 20 && var21 <= var79 + 20) {
                method7151(true);
            }
            short var84 = 361;
            if (Statics.field505 != null) {
                int var85 = Statics.field505.field4763 / 2;
                if (var19 == 1 && var20 >= Statics.field505.field4764 - var85 && var20 <= Statics.field505.field4764 + var85 && var21 >= var84 - 15 && var21 < var84) {
                    class32.method4708(client.method2216("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (var22.method3915()) {
                boolean var86 = false;
                for (int var87 = 0; var87 < field954.length(); var87++) {
                    if (var22.field2376 == field954.charAt(var87)) {
                        var86 = true;
                        break;
                    }
                }
                if (var22.field2387 == 13) {
                    method7151(true);
                } else {
                    if (var22.field2387 == 85 && field961.length() > 0) {
                        field961 = field961.substring(0, field961.length() - 1);
                    }
                    if (var22.field2387 == 84) {
                        field961 = field961.trim();
                        if (field961.length() == 0) {
                            method5196(class367.field4126, class367.field4210, class367.field4211);
                        } else {
                            long var88 = class75.method40();
                            int var90;
                            if (var88 == 0L) {
                                var90 = 5;
                            } else {
                                var90 = class75.method3269(var88, field961);
                            }
                            switch(var90) {
                                case 2:
                                    method5196(class367.field4189, class367.field4025, class367.field4214);
                                    method638(6);
                                    break;
                                case 3:
                                    method5196(class367.field4215, class367.field4216, class367.field4062);
                                    break;
                                case 4:
                                    method5196(class367.field4157, class367.field4219, class367.field4026);
                                    break;
                                case 5:
                                    method5196(class367.field4029, class367.field4222, class367.field4223);
                                    break;
                                case 6:
                                    method5196(class367.field4224, class367.field4173, class367.field4226);
                                    break;
                                case 7:
                                    method5196(class367.field4121, class367.field4039, class367.field4229);
                            }
                        }
                        return;
                    }
                    if (var86 && field961.length() < 320) {
                        field961 = field961 + var22.field2376;
                    }
                }
            }
        } else if (field944 == 6) {
            while (true) {
                do {
                    if (!var22.method3915()) {
                        short var91 = 321;
                        if (var19 == 1 && var21 >= var91 - 20 && var21 <= var91 + 20) {
                            method7151(true);
                        }
                        return;
                    }
                } while (var22.field2387 != 84 && var22.field2387 != 13);
                method7151(true);
            }
        } else if (field944 == 7) {
            if (Statics.field3428 && !client.field775) {
                int var92 = Statics.field4388 - 150;
                int var93 = var92 + 240 + 25 + 40;
                short var94 = 231;
                int var95 = var94 + 40;
                if (var19 == 1 && var20 >= var92 && var20 <= var93 && var21 >= var94 && var21 <= var95) {
                    int var96 = var92;
                    int var97 = 0;
                    int var98;
                    while (true) {
                        if (var97 >= 8) {
                            var98 = 0;
                            break;
                        }
                        if (var20 <= var96 + 30) {
                            var98 = var97;
                            break;
                        }
                        var96 += 30;
                        var96 += var97 == 1 || var97 == 3 ? 20 : 5;
                        var97++;
                    }
                    field947 = var98;
                }
                int var99 = field934 + 180 - 80;
                short var100 = 321;
                if (var19 == 1 && var20 >= var99 - 75 && var20 <= var99 + 75 && var21 >= var100 - 20 && var21 <= var100 + 20) {
                    boolean var101 = method3093();
                    if (var101) {
                        client.method7509(50);
                        return;
                    }
                }
                int var102 = field934 + 180 + 80;
                if (var19 == 1 && var20 >= var102 - 75 && var20 <= var102 + 75 && var21 >= var100 - 20 && var21 <= var100 + 20) {
                    field948 = new String[8];
                    method7151(true);
                }
                while (var22.method3915()) {
                    if (var22.field2387 == 101) {
                        field948[field947] = null;
                    }
                    if (var22.field2387 == 85) {
                        if (field948[field947] == null && field947 > 0) {
                            field947--;
                        }
                        field948[field947] = null;
                    }
                    if (var22.field2376 >= '0' && var22.field2376 <= '9') {
                        field948[field947] = "" + var22.field2376;
                        if (field947 < 7) {
                            field947++;
                        }
                    }
                    if (var22.field2387 == 84) {
                        boolean var103 = method3093();
                        if (var103) {
                            client.method7509(50);
                        }
                        return;
                    }
                }
            } else {
                int var104 = field934 + 180 - 80;
                short var105 = 321;
                if (var19 == 1 && var20 >= var104 - 75 && var20 <= var104 + 75 && var21 >= var105 - 20 && var21 <= var105 + 20) {
                    class32.method4708(client.method2216("secure", true) + "m=dob/set_dob.ws", true, false);
                    method5196(class367.field4166, class367.field4207, class367.field4208);
                    method638(6);
                    return;
                }
                int var106 = field934 + 180 + 80;
                if (var19 == 1 && var20 >= var106 - 75 && var20 <= var106 + 75 && var21 >= var105 - 20 && var21 <= var105 + 20) {
                    method7151(true);
                }
            }
        } else if (field944 == 8) {
            int var107 = field934 + 180 - 80;
            short var108 = 321;
            if (var19 == 1 && var20 >= var107 - 75 && var20 <= var107 + 75 && var21 >= var108 - 20 && var21 <= var108 + 20) {
                class32.method4708("https://www.jagex.com/terms/privacy", true, false);
                method5196(class367.field4166, class367.field4207, class367.field4208);
                method638(6);
                return;
            }
            int var109 = field934 + 180 + 80;
            if (var19 == 1 && var20 >= var109 - 75 && var20 <= var109 + 75 && var21 >= var108 - 20 && var21 <= var108 + 20) {
                method7151(true);
            }
        } else if (field944 == 9) {
            int var110 = field934 + 180;
            short var111 = 311;
            if (var22.field2387 == 84 || var22.field2387 == 13 || var19 == 1 && var20 >= var110 - 75 && var20 <= var110 + 75 && var21 >= var111 - 20 && var21 <= var111 + 20) {
                method5370(false);
            }
        } else if (field944 == 10) {
            int var112 = field934 + 180;
            short var113 = 209;
            if (var22.field2387 == 84 || var19 == 1 && var20 >= var112 - 109 && var20 <= var112 + 109 && var21 >= var113 && var21 <= var113 + 68) {
                method5196(class367.field4175, class367.field4017, class367.field4111);
                client.field560 = class535.field5193;
                client.method2807(false);
                client.method7509(20);
            }
        } else if (field944 == 12) {
            int var114 = Statics.field4388;
            short var115 = 233;
            class461 var116 = arg2.method6970(0, 30, class367.field4238, var114, var115);
            class461 var117 = arg2.method6970(32, 32, class367.field4238, var114, var115);
            class461 var118 = arg2.method6970(70, 34, class367.field4238, var114, var115);
            int var142 = var115 + 17;
            class461 var119 = arg2.method6970(0, 34, class367.field4239, var114, var142);
            if (var19 == 1) {
                if (var116.method7530(var20, var21)) {
                    class32.method4708("https://www.jagex.com/terms", true, false);
                } else if (var117.method7530(var20, var21)) {
                    class32.method4708("https://www.jagex.com/terms/privacy", true, false);
                } else if (var118.method7530(var20, var21) || var119.method7530(var20, var21)) {
                    class32.method4708("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                }
            }
            int var120 = Statics.field4388 - 80;
            short var121 = 311;
            if (var19 == 1 && var20 >= var120 - 75 && var20 <= var120 + 75 && var21 >= var121 - 20 && var21 <= var121 + 20) {
                client.method4148();
                method5370(true);
            }
            int var122 = Statics.field4388 + 80;
            if (var19 == 1 && var20 >= var122 - 75 && var20 <= var122 + 75 && var21 >= var121 - 20 && var21 <= var121 + 20) {
                field944 = 13;
            }
        } else if (field944 == 13) {
            int var123 = Statics.field4388;
            short var124 = 321;
            if (var19 == 1 && var20 >= var123 - 75 && var20 <= var123 + 75 && var21 >= var124 - 20 && var21 <= var124 + 20) {
                method5370(true);
            }
        } else if (field944 == 14) {
            String var125 = "";
            switch(field938) {
                case 0:
                    var125 = "https://secure.runescape.com/m=offence-appeal/account-history";
                    break;
                case 1:
                    var125 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                    break;
                case 2:
                    var125 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                    break;
                default:
                    method7151(false);
            }
            int var126 = field934 + 180;
            short var127 = 276;
            if (var19 == 1 && var20 >= var126 - 75 && var20 <= var126 + 75 && var21 >= var127 - 20 && var21 <= var127 + 20) {
                class32.method4708(var125, true, false);
                method5196(class367.field4166, class367.field4207, class367.field4208);
                method638(6);
                return;
            }
            int var128 = field934 + 180;
            short var129 = 326;
            if (var19 == 1 && var20 >= var128 - 75 && var20 <= var128 + 75 && var21 >= var129 - 20 && var21 <= var129 + 20) {
                method7151(false);
            }
        } else if (field944 == 24) {
            int var130 = field934 + 180;
            short var131 = 301;
            if (var19 == 1 && var20 >= var130 - 75 && var20 <= var130 + 75 && var21 >= var131 - 20 && var21 <= var131 + 20) {
                method5370(false);
            }
        } else if (field944 == 32) {
            int var132 = field934 + 180 - 80;
            short var133 = 321;
            if (var19 == 1 && var20 >= var132 - 75 && var20 <= var132 + 75 && var21 >= var133 - 20 && var21 <= var133 + 20) {
                class32.method4708(client.method2216("secure", true) + "m=dob/set_dob.ws", true, false);
                method5196(class367.field4166, class367.field4207, class367.field4208);
                method638(6);
                return;
            }
            int var134 = field934 + 180 + 80;
            if (var19 == 1 && var20 >= var134 - 75 && var20 <= var134 + 75 && var21 >= var133 - 20 && var21 <= var133 + 20) {
                method7151(true);
            }
        } else if (field944 == 33) {
            int var135 = field934 + 180;
            short var136 = 276;
            if (var19 == 1 && var20 >= var135 - 75 && var20 <= var135 + 75 && var21 >= var136 - 20 && var21 <= var136 + 20) {
                class32.method4708(class367.field3999, true, false);
            }
            int var137 = field934 + 180;
            short var138 = 326;
            if (var19 == 1 && var20 >= var137 - 75 && var20 <= var137 + 75 && var21 >= var138 - 20 && var21 <= var138 + 20) {
                method7151(true);
            }
        }
    }

    @ObfuscatedName("ff.ar(I)V")
    public static void method2990() {
        field961 = field961.trim();
        if (field961.length() == 0) {
            method5196(class367.field4069, class367.field3966, class367.field4071);
        } else if (field946.length() == 0) {
            method5196(class367.field4072, class367.field4073, class367.field4022);
        } else {
            method5196(class367.field4175, class367.field4017, class367.field4111);
            client.method2807(false);
            client.method7509(20);
        }
    }

    @ObfuscatedName("gl.ab(I)Z")
    public static boolean method3093() {
        Date var0;
        try {
            var0 = method286();
        } catch (ParseException var7) {
            method276("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
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
        boolean var6 = method4023(var0);
        if (!var6) {
            method276("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
        }
        if (var4) {
            Statics.field1694 = (int) (var0.getTime() / 86400000L - 11745L);
        } else {
            Statics.field1694 = 8388607;
        }
        return true;
    }

    @ObfuscatedName("ip.am(Ljava/util/Date;B)Z")
    public static boolean method4023(Date arg0) {
        Date var1 = method5338();
        return arg0.after(var1);
    }

    @ObfuscatedName("mj.av(B)Ljava/util/Date;")
    public static Date method5338() {
        Calendar var0 = Calendar.getInstance();
        var0.set(2, 0);
        var0.set(5, 1);
        var0.set(1, 1900);
        return var0.getTime();
    }

    @ObfuscatedName("ae.ag(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method276(String arg0, String arg1, String arg2) {
        method638(7);
        method5196(arg0, arg1, arg2);
    }

    @ObfuscatedName("aw.aa(I)Ljava/util/Date;")
    public static Date method286() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = field948;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                method276("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("qr.ap(ZI)V")
    public static void method7151(boolean arg0) {
        if (Statics.field1743.method1674() || Statics.field1743.method1175() || Statics.field1743.method1174()) {
            method638(10);
            return;
        }
        field931 = class367.field4158;
        field943 = class367.field4246;
        field958 = class367.field4008;
        method638(2);
        if (arg0) {
            field946 = "";
        }
        method3314();
        if (client.field573 && field961 != null && field961.length() > 0) {
            field953 = 1;
        } else {
            field953 = 0;
        }
    }

    @ObfuscatedName("mx.ay(ZB)V")
    public static void method5370(boolean arg0) {
        byte var1 = 0;
        boolean var2 = Statics.field1106.method2446() >= client.field718;
        if (!var2) {
            var1 = 12;
        } else if (Statics.field1743.method1674() || Statics.field1743.method1175() || Statics.field1743.method1174()) {
            var1 = 10;
        }
        method638(var1);
        if (arg0) {
            field961 = "";
            field946 = "";
            Statics.field1296 = 0;
            Statics.field1900 = "";
        }
        method3314();
        if (client.field573 && field961 != null && field961.length() > 0) {
            field953 = 1;
        } else {
            field953 = 0;
        }
    }

    @ObfuscatedName("os.as(Lpu;Lpu;Lpu;I)V")
    public static void method6194(class409 arg0, class409 arg1, class409 arg2) {
        field927 = (Statics.field3598 - 765) / 2;
        field934 = field927 + 202;
        Statics.field4388 = field934 + 180;
        if (field955) {
            method6215(arg0, arg1);
            return;
        }
        Statics.field305.method8821(field927, 0);
        Statics.field951.method8821(field927 + 382, 0);
        Statics.field932.method8786(field927 + 382 - Statics.field932.field5231 / 2, 18);
        if (client.field530 == 0 || client.field530 == 5) {
            byte var3 = 20;
            arg0.method6963(class367.field4103, field934 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class540.method8763(field934 + 180 - 152, var4, 304, 34, 9179409);
            class540.method8763(field934 + 180 - 151, var4 + 1, 302, 32, 0);
            class540.method8758(field934 + 180 - 150, var4 + 2, field935 * 3, 30, 9179409);
            class540.method8758(field935 * 3 + (field934 + 180 - 150), var4 + 2, 300 - field935 * 3, 30, 0);
            arg0.method6963(field936, field934 + 180, 276 - var3, 16777215, -1);
        }
        if (client.field530 == 20) {
            Statics.field942.method8786(field934 + 180 - Statics.field942.field5231 / 2, 271 - Statics.field942.field5229 / 2);
            short var5 = 201;
            arg0.method6963(field931, field934 + 180, var5, 16776960, 0);
            int var127 = var5 + 15;
            arg0.method6963(field943, field934 + 180, var127, 16776960, 0);
            int var128 = var127 + 15;
            arg0.method6963(field958, field934 + 180, var128, 16776960, 0);
            int var129 = var128 + 15;
            int var130 = var129 + 7;
            if (field944 != 4 && field944 != 10) {
                arg0.method6954(class367.field4184, field934 + 180 - 110, var130, 16777215, 0);
                short var6 = 200;
                String var9;
                if (Statics.field1106.method2388()) {
                    String var7 = field961;
                    String var8 = class402.method2249('*', var7.length());
                    var9 = var8;
                } else {
                    var9 = field961;
                }
                String var11;
                for (var11 = var9; arg0.method6948(var11) > var6; var11 = var11.substring(0, var11.length() - 1)) {
                }
                arg0.method6954(class413.method6952(var11), field934 + 180 - 70, var130, 16777215, 0);
                var127 = var130 + 15;
                String var12 = field946;
                String var13 = class402.method2249('*', var12.length());
                String var14;
                for (var14 = var13; arg0.method6948(var14) > var6; var14 = var14.substring(1)) {
                }
                arg0.method6954(class367.field3975 + var14, field934 + 180 - 108, var127, 16777215, 0);
                var127 += 15;
            }
        }
        if (client.field530 == 10 || client.field530 == 11 || client.field530 == 50) {
            Statics.field942.method8786(field934, 171);
            if (field944 == 0) {
                short var15 = 251;
                arg0.method6963(class367.field4187, field934 + 180, var15, 16776960, 0);
                int var131 = var15 + 30;
                int var16 = field934 + 180 - 80;
                short var17 = 291;
                Statics.field1965.method8786(var16 - 73, var17 - 20);
                arg0.method6958(class367.field4213, var16 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var18 = field934 + 180 + 80;
                Statics.field1965.method8786(var18 - 73, var17 - 20);
                arg0.method6958(class367.field4228, var18 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field944 == 1) {
                arg0.method6963(field941, field934 + 180, 201, 16776960, 0);
                short var19 = 236;
                arg0.method6963(field931, field934 + 180, var19, 16777215, 0);
                int var132 = var19 + 15;
                arg0.method6963(field943, field934 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                arg0.method6963(field958, field934 + 180, var133, 16777215, 0);
                int var134 = var133 + 15;
                int var20 = field934 + 180 - 80;
                short var21 = 321;
                Statics.field1965.method8786(var20 - 73, var21 - 20);
                arg0.method6963(class367.field3954, var20, var21 + 5, 16777215, 0);
                int var22 = field934 + 180 + 80;
                Statics.field1965.method8786(var22 - 73, var21 - 20);
                arg0.method6963(class367.field4191, var22, var21 + 5, 16777215, 0);
            } else if (field944 == 2) {
                short var23 = 201;
                arg0.method6963(field931, Statics.field4388, var23, 16776960, 0);
                int var135 = var23 + 15;
                arg0.method6963(field943, Statics.field4388, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg0.method6963(field958, Statics.field4388, var136, 16776960, 0);
                int var137 = var136 + 15;
                int var138 = var137 + 7;
                arg0.method6954(class367.field4184, Statics.field4388 - 110, var138, 16777215, 0);
                short var24 = 200;
                String var27;
                if (Statics.field1106.method2388()) {
                    String var25 = field961;
                    String var26 = class402.method2249('*', var25.length());
                    var27 = var26;
                } else {
                    var27 = field961;
                }
                String var29;
                for (var29 = var27; arg0.method6948(var29) > var24; var29 = var29.substring(1)) {
                }
                arg0.method6954(class413.method6952(var29) + (field953 == 0 & client.field533 % 40 < 20 ? class104.method1732(16776960) + class104.field1331 : ""), Statics.field4388 - 70, var138, 16777215, 0);
                var135 = var138 + 15;
                String var30 = field946;
                String var31 = class402.method2249('*', var30.length());
                String var32;
                for (var32 = var31; arg0.method6948(var32) > var24; var32 = var32.substring(1)) {
                }
                arg0.method6954(class367.field3975 + var32 + (field953 == 1 & client.field533 % 40 < 20 ? class104.method1732(16776960) + class104.field1331 : ""), Statics.field4388 - 108, var135, 16777215, 0);
                var135 += 15;
                short var33 = 277;
                int var34 = Statics.field4388 + -117;
                class543 var35 = method3089(client.field573, field950);
                var35.method8786(var34, var33);
                int var36 = var35.field5231 + 5 + var34;
                arg1.method6954(class367.field4192, var36, var33 + 13, 16776960, 0);
                int var37 = Statics.field4388 + 24;
                class543 var38 = method3089(Statics.field1106.method2388(), field925);
                var38.method8786(var37, var33);
                int var39 = var38.field5231 + 5 + var37;
                arg1.method6954(class367.field3993, var39, var33 + 13, 16776960, 0);
                int var139 = var33 + 15;
                int var40 = Statics.field4388 - 80;
                short var41 = 321;
                Statics.field1965.method8786(var40 - 73, var41 - 20);
                arg0.method6963(class367.field4190, var40, var41 + 5, 16777215, 0);
                int var42 = Statics.field4388 + 80;
                Statics.field1965.method8786(var42 - 73, var41 - 20);
                arg0.method6963(class367.field4191, var42, var41 + 5, 16777215, 0);
                short var43 = 357;
                switch(field939) {
                    case 2:
                        Statics.field92 = class367.field3991;
                        break;
                    default:
                        Statics.field92 = class367.field4203;
                }
                Statics.field4846 = new class461(Statics.field4388, var43, arg1.method6948(Statics.field92), 11);
                Statics.field505 = new class461(Statics.field4388, var43, arg1.method6948(class367.field4204), 11);
                arg1.method6963(Statics.field92, Statics.field4388, var43, 16777215, 0);
            } else if (field944 == 3) {
                short var44 = 201;
                arg0.method6963(class367.field3948, field934 + 180, var44, 16776960, 0);
                int var140 = var44 + 20;
                arg1.method6963(class367.field4137, field934 + 180, var140, 16776960, 0);
                int var141 = var140 + 20;
                arg1.method6963(class367.field4138, field934 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var45 = field934 + 180;
                short var46 = 276;
                Statics.field1965.method8786(var45 - 73, var46 - 20);
                arg2.method6963(class367.field4197, var45, var46 + 5, 16777215, 0);
                int var47 = field934 + 180;
                short var48 = 326;
                Statics.field1965.method8786(var47 - 73, var48 - 20);
                arg2.method6963(class367.field4198, var47, var48 + 5, 16777215, 0);
            } else if (field944 == 4) {
                arg0.method6963(class367.field3980, field934 + 180, 201, 16776960, 0);
                short var49 = 236;
                arg0.method6963(field931, field934 + 180, var49, 16777215, 0);
                int var143 = var49 + 15;
                arg0.method6963(field943, field934 + 180, var143, 16777215, 0);
                int var144 = var143 + 15;
                arg0.method6963(field958, field934 + 180, var144, 16777215, 0);
                int var145 = var144 + 15;
                String var51 = class367.field4186;
                String var52 = Statics.field1900;
                String var53 = class402.method2249('*', var52.length());
                arg0.method6954(var51 + var53 + (client.field533 % 40 < 20 ? class104.method1732(16776960) + class104.field1331 : ""), field934 + 180 - 108, var145, 16777215, 0);
                int var146 = var145 - 8;
                arg0.method6954(class367.field4122, field934 + 180 - 9, var146, 16776960, 0);
                int var147 = var146 + 15;
                arg0.method6954(class367.field3958, field934 + 180 - 9, var147, 16776960, 0);
                int var54 = field934 + 180 - 9 + arg0.method6948(class367.field3958) + 15;
                int var55 = var147 - arg0.field4536;
                class543 var56;
                if (field952) {
                    var56 = Statics.field5199;
                } else {
                    var56 = Statics.field5078;
                }
                var56.method8786(var54, var55);
                var143 = var147 + 15;
                int var57 = field934 + 180 - 80;
                short var58 = 321;
                Statics.field1965.method8786(var57 - 73, var58 - 20);
                arg0.method6963(class367.field3954, var57, var58 + 5, 16777215, 0);
                int var59 = field934 + 180 + 80;
                Statics.field1965.method8786(var59 - 73, var58 - 20);
                arg0.method6963(class367.field4191, var59, var58 + 5, 16777215, 0);
                arg1.method6963(class367.field4203, field934 + 180, var58 + 36, 16777215, 0);
            } else if (field944 == 5) {
                arg0.method6963(class367.field4199, field934 + 180, 201, 16776960, 0);
                short var60 = 221;
                arg2.method6963(field931, field934 + 180, var60, 16776960, 0);
                int var148 = var60 + 15;
                arg2.method6963(field943, field934 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                arg2.method6963(field958, field934 + 180, var149, 16776960, 0);
                int var150 = var149 + 15;
                int var151 = var150 + 14;
                arg0.method6954(class367.field4200, field934 + 180 - 145, var151, 16777215, 0);
                short var61 = 174;
                String var64;
                if (Statics.field1106.method2388()) {
                    String var62 = field961;
                    String var63 = class402.method2249('*', var62.length());
                    var64 = var63;
                } else {
                    var64 = field961;
                }
                String var66;
                for (var66 = var64; arg0.method6948(var66) > var61; var66 = var66.substring(1)) {
                }
                arg0.method6954(class413.method6952(var66) + (client.field533 % 40 < 20 ? class104.method1732(16776960) + class104.field1331 : ""), field934 + 180 - 34, var151, 16777215, 0);
                var148 = var151 + 15;
                int var67 = field934 + 180 - 80;
                short var68 = 321;
                Statics.field1965.method8786(var67 - 73, var68 - 20);
                arg0.method6963(class367.field4201, var67, var68 + 5, 16777215, 0);
                int var69 = field934 + 180 + 80;
                Statics.field1965.method8786(var69 - 73, var68 - 20);
                arg0.method6963(class367.field4202, var69, var68 + 5, 16777215, 0);
                short var70 = 356;
                arg1.method6963(class367.field4204, Statics.field4388, var70, 268435455, 0);
            } else if (field944 == 6) {
                short var71 = 201;
                arg0.method6963(field931, field934 + 180, var71, 16776960, 0);
                int var152 = var71 + 15;
                arg0.method6963(field943, field934 + 180, var152, 16776960, 0);
                int var153 = var152 + 15;
                arg0.method6963(field958, field934 + 180, var153, 16776960, 0);
                int var154 = var153 + 15;
                int var72 = field934 + 180;
                short var73 = 321;
                Statics.field1965.method8786(var72 - 73, var73 - 20);
                arg0.method6963(class367.field4202, var72, var73 + 5, 16777215, 0);
            } else if (field944 == 7) {
                if (Statics.field3428 && !client.field775) {
                    short var74 = 201;
                    arg0.method6963(field931, Statics.field4388, var74, 16776960, 0);
                    int var155 = var74 + 15;
                    arg0.method6963(field943, Statics.field4388, var155, 16776960, 0);
                    int var156 = var155 + 15;
                    arg0.method6963(field958, Statics.field4388, var156, 16776960, 0);
                    int var75 = Statics.field4388 - 150;
                    int var157 = var156 + 10;
                    for (int var76 = 0; var76 < 8; var76++) {
                        Statics.field1965.method8804(var75, var157, 30, 40);
                        boolean var77 = field947 == var76 & client.field533 % 40 < 20;
                        arg0.method6954((field948[var76] == null ? "" : field948[var76]) + (var77 ? class104.method1732(16776960) + class104.field1331 : ""), var75 + 10, var157 + 27, 16777215, 0);
                        if (var76 == 1 || var76 == 3) {
                            var75 += 50;
                            arg0.method6954(class413.method6952("/"), var75 - 13, var157 + 27, 16777215, 0);
                        } else {
                            var75 += 35;
                        }
                    }
                    int var78 = Statics.field4388 - 80;
                    short var79 = 321;
                    Statics.field1965.method8786(var78 - 73, var79 - 20);
                    arg0.method6963("Submit", var78, var79 + 5, 16777215, 0);
                    int var80 = Statics.field4388 + 80;
                    Statics.field1965.method8786(var80 - 73, var79 - 20);
                    arg0.method6963(class367.field4191, var80, var79 + 5, 16777215, 0);
                } else {
                    short var81 = 216;
                    arg0.method6963(class367.field4230, field934 + 180, var81, 16776960, 0);
                    int var158 = var81 + 15;
                    arg2.method6963(class367.field4231, field934 + 180, var158, 16776960, 0);
                    int var159 = var158 + 15;
                    arg2.method6963(class367.field4232, field934 + 180, var159, 16776960, 0);
                    int var160 = var159 + 15;
                    int var82 = field934 + 180 - 80;
                    short var83 = 321;
                    Statics.field1965.method8786(var82 - 73, var83 - 20);
                    arg0.method6963(class367.field4233, var82, var83 + 5, 16777215, 0);
                    int var84 = field934 + 180 + 80;
                    Statics.field1965.method8786(var84 - 73, var83 - 20);
                    arg0.method6963(class367.field4202, var84, var83 + 5, 16777215, 0);
                }
            } else if (field944 == 8) {
                short var85 = 216;
                arg0.method6963(class367.field4070, field934 + 180, var85, 16776960, 0);
                int var161 = var85 + 15;
                arg2.method6963(class367.field4088, field934 + 180, var161, 16776960, 0);
                int var162 = var161 + 15;
                arg2.method6963(class367.field4227, field934 + 180, var162, 16776960, 0);
                int var163 = var162 + 15;
                int var86 = field934 + 180 - 80;
                short var87 = 321;
                Statics.field1965.method8786(var86 - 73, var87 - 20);
                arg0.method6963(class367.field4090, var86, var87 + 5, 16777215, 0);
                int var88 = field934 + 180 + 80;
                Statics.field1965.method8786(var88 - 73, var87 - 20);
                arg0.method6963(class367.field4202, var88, var87 + 5, 16777215, 0);
            } else if (field944 == 9) {
                short var89 = 221;
                arg0.method6963(field931, field934 + 180, var89, 16776960, 0);
                int var164 = var89 + 25;
                arg0.method6963(field943, field934 + 180, var164, 16776960, 0);
                int var165 = var164 + 25;
                arg0.method6963(field958, field934 + 180, var165, 16776960, 0);
                int var90 = field934 + 180;
                short var91 = 311;
                Statics.field1965.method8786(var90 - 73, var91 - 20);
                arg0.method6963(class367.field4197, var90, var91 + 5, 16777215, 0);
            } else if (field944 == 10) {
                int var92 = field934 + 180;
                short var93 = 209;
                arg0.method6963(class367.field4187, field934 + 180, var93, 16776960, 0);
                int var166 = var93 + 20;
                Statics.field930.method8786(var92 - 109, var166);
                if (field929.isEmpty()) {
                    Statics.field3942.method8786(var92 - 48, var166 + 18);
                } else {
                    Statics.field3942.method8786(var92 - 48, var166 + 5);
                    arg0.method6963(field929, var92, var166 + 68 - 15, 16776960, 0);
                }
            } else if (field944 == 12) {
                int var94 = Statics.field4388;
                short var95 = 216;
                arg2.method6963(class367.field4237, var94, var95, 16777215, 0);
                int var167 = var95 + 17;
                arg2.method6963(class367.field4238, var94, var167, 16777215, 0);
                int var168 = var167 + 17;
                arg2.method6963(class367.field4239, var94, var168, 16777215, 0);
                int var169 = var168 + 17;
                arg2.method6963(class367.field4240, var94, var169, 16777215, 0);
                int var96 = Statics.field4388 - 80;
                short var97 = 311;
                Statics.field1965.method8786(var96 - 73, var97 - 20);
                arg0.method6963(class367.field4150, var96, var97 + 5, 16777215, 0);
                int var98 = Statics.field4388 + 80;
                Statics.field1965.method8786(var98 - 73, var97 - 20);
                arg0.method6963(class367.field4244, var98, var97 + 5, 16777215, 0);
            } else if (field944 == 13) {
                short var99 = 231;
                arg2.method6963(class367.field4241, field934 + 180, var99, 16777215, 0);
                int var170 = var99 + 20;
                arg2.method6963(class367.field4194, field934 + 180, var170, 16777215, 0);
                int var100 = field934 + 180;
                short var101 = 311;
                Statics.field1965.method8786(var100 - 73, var101 - 20);
                arg0.method6963(class367.field4202, var100, var101 + 5, 16777215, 0);
            } else if (field944 == 14) {
                short var102 = 201;
                String var103 = "";
                String var104 = "";
                String var105 = "";
                switch(field938) {
                    case 0:
                        var103 = class367.field4107;
                        var104 = class367.field3981;
                        var105 = class367.field4005;
                        break;
                    case 1:
                        var103 = class367.field4042;
                        var104 = class367.field4188;
                        var105 = class367.field4044;
                        break;
                    case 2:
                        var103 = class367.field4043;
                        var104 = class367.field4079;
                        var105 = class367.field4001;
                        break;
                    default:
                        method7151(false);
                }
                arg0.method6963(var103, field934 + 180, var102, 16776960, 0);
                int var171 = var102 + 20;
                arg0.method6963(var104, field934 + 180, var171, 16776960, 0);
                int var172 = var171 + 20;
                arg0.method6963(var105, field934 + 180, var172, 16776960, 0);
                int var106 = field934 + 180;
                short var107 = 276;
                Statics.field1965.method8786(var106 - 73, var107 - 20);
                if (field938 == 1) {
                    arg0.method6963(class367.field3987, var106, var107 + 5, 16777215, 0);
                } else {
                    arg0.method6963(class367.field3986, var106, var107 + 5, 16777215, 0);
                }
                int var108 = field934 + 180;
                short var109 = 326;
                Statics.field1965.method8786(var108 - 73, var109 - 20);
                arg0.method6963(class367.field4202, var108, var109 + 5, 16777215, 0);
            } else if (field944 == 24) {
                short var110 = 221;
                arg0.method6963(field931, field934 + 180, var110, 16777215, 0);
                int var173 = var110 + 15;
                arg0.method6963(field943, field934 + 180, var173, 16777215, 0);
                int var174 = var173 + 15;
                arg0.method6963(field958, field934 + 180, var174, 16777215, 0);
                int var175 = var174 + 15;
                int var111 = field934 + 180;
                short var112 = 301;
                Statics.field1965.method8786(var111 - 73, var112 - 20);
                arg0.method6963(class367.field3952, var111, var112 + 5, 16777215, 0);
            } else if (field944 == 32) {
                short var113 = 216;
                arg0.method6963(class367.field4230, field934 + 180, var113, 16776960, 0);
                int var176 = var113 + 15;
                arg2.method6963(class367.field4231, field934 + 180, var176, 16776960, 0);
                int var177 = var176 + 15;
                arg2.method6963(class367.field4232, field934 + 180, var177, 16776960, 0);
                int var178 = var177 + 15;
                int var114 = field934 + 180 - 80;
                short var115 = 321;
                Statics.field1965.method8786(var114 - 73, var115 - 20);
                arg0.method6963(class367.field4233, var114, var115 + 5, 16777215, 0);
                int var116 = field934 + 180 + 80;
                Statics.field1965.method8786(var116 - 73, var115 - 20);
                arg0.method6963(class367.field4202, var116, var115 + 5, 16777215, 0);
            } else if (field944 == 33) {
                short var117 = 201;
                arg0.method6963(field931, field934 + 180, var117, 16776960, 0);
                int var179 = var117 + 20;
                arg1.method6963(field943, field934 + 180, var179, 16776960, 0);
                int var180 = var179 + 20;
                arg1.method6963(field958, field934 + 180, var180, 16776960, 0);
                int var181 = var180 + 15;
                int var118 = field934 + 180;
                short var119 = 276;
                Statics.field1965.method8786(var118 - 73, var119 - 20);
                arg2.method6963(class367.field4256, var118, var119 + 5, 16777215, 0);
                int var120 = field934 + 180;
                short var121 = 326;
                Statics.field1965.method8786(var120 - 73, var121 - 20);
                arg2.method6963(class367.field4202, var120, var121 + 5, 16777215, 0);
            }
        }
        if (client.field530 >= 10) {
            int[] var122 = new int[4];
            class540.method8696(var122);
            class540.method8694(field927, 0, field927 + 765, Statics.field4908);
            Statics.field5246.method2379(field927 - 22, client.field533);
            Statics.field5246.method2379(field927 + 765 + 22 - 128, client.field533);
            class540.method8697(var122);
        }
        Statics.field933[Statics.field1106.method2387() ? 1 : 0].method8786(field927 + 765 - 40, 463);
        if (client.field530 <= 5 || Statics.field2910 != class389.field4438) {
            return;
        }
        if (Statics.field1406 == null) {
            Statics.field1406 = class545.method3136(Statics.field2011, "sl_button", "");
            return;
        }
        int var123 = field927 + 5;
        short var124 = 463;
        byte var125 = 100;
        byte var126 = 35;
        Statics.field1406.method8786(var123, var124);
        arg0.method6963(class367.field4127 + " " + client.field519, var125 / 2 + var123, var126 / 2 + var124 - 2, 16777215, 0);
        if (Statics.field1104 == null) {
            arg1.method6963(class367.field4220, var125 / 2 + var123, var126 / 2 + var124 + 12, 16777215, 0);
        } else {
            arg1.method6963(class367.field3989, var125 / 2 + var123, var126 / 2 + var124 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("ll.aj(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method5196(String arg0, String arg1, String arg2) {
        field931 = arg0;
        field943 = arg1;
        field958 = arg2;
    }

    @ObfuscatedName("ob.an(Lpu;Lpu;I)V")
    public static void method6215(class409 arg0, class409 arg1) {
        if (Statics.field1052 == null) {
            Statics.field1052 = class545.method2695(Statics.field2011, "sl_back", "");
        }
        if (Statics.field1185 == null) {
            Statics.field1185 = class545.method3313(Statics.field2011, "sl_flags", "");
        }
        if (Statics.field2853 == null) {
            Statics.field2853 = class545.method3313(Statics.field2011, "sl_arrows", "");
        }
        if (Statics.field1830 == null) {
            Statics.field1830 = class545.method3313(Statics.field2011, "sl_stars", "");
        }
        if (Statics.field4319 == null) {
            Statics.field4319 = class545.method3136(Statics.field2011, "leftarrow", "");
        }
        if (Statics.field2426 == null) {
            Statics.field2426 = class545.method3136(Statics.field2011, "rightarrow", "");
        }
        class540.method8758(field927, 23, 765, 480, 0);
        class540.method8769(field927, 0, 125, 23, 12425273, 9135624);
        class540.method8769(field927 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method6963(class367.field4245, field927 + 62, 15, 0, -1);
        if (Statics.field1830 != null) {
            Statics.field1830[1].method8786(field927 + 140, 1);
            arg1.method6954(class367.field3959, field927 + 152, 10, 16777215, -1);
            Statics.field1830[0].method8786(field927 + 140, 12);
            arg1.method6954(class367.field4247, field927 + 152, 21, 16777215, -1);
        }
        if (Statics.field2853 != null) {
            int var2 = field927 + 280;
            if (class69.field836[0] == 0 && class69.field831[0] == 0) {
                Statics.field2853[2].method8786(var2, 4);
            } else {
                Statics.field2853[0].method8786(var2, 4);
            }
            if (class69.field836[0] == 0 && class69.field831[0] == 1) {
                Statics.field2853[3].method8786(var2 + 15, 4);
            } else {
                Statics.field2853[1].method8786(var2 + 15, 4);
            }
            arg0.method6954(class367.field4084, var2 + 32, 17, 16777215, -1);
            int var3 = field927 + 390;
            if (class69.field836[0] == 1 && class69.field831[0] == 0) {
                Statics.field2853[2].method8786(var3, 4);
            } else {
                Statics.field2853[0].method8786(var3, 4);
            }
            if (class69.field836[0] == 1 && class69.field831[0] == 1) {
                Statics.field2853[3].method8786(var3 + 15, 4);
            } else {
                Statics.field2853[1].method8786(var3 + 15, 4);
            }
            arg0.method6954(class367.field4249, var3 + 32, 17, 16777215, -1);
            int var4 = field927 + 500;
            if (class69.field836[0] == 2 && class69.field831[0] == 0) {
                Statics.field2853[2].method8786(var4, 4);
            } else {
                Statics.field2853[0].method8786(var4, 4);
            }
            if (class69.field836[0] == 2 && class69.field831[0] == 1) {
                Statics.field2853[3].method8786(var4 + 15, 4);
            } else {
                Statics.field2853[1].method8786(var4 + 15, 4);
            }
            arg0.method6954(class367.field4250, var4 + 32, 17, 16777215, -1);
            int var5 = field927 + 610;
            if (class69.field836[0] == 3 && class69.field831[0] == 0) {
                Statics.field2853[2].method8786(var5, 4);
            } else {
                Statics.field2853[0].method8786(var5, 4);
            }
            if (class69.field836[0] == 3 && class69.field831[0] == 1) {
                Statics.field2853[3].method8786(var5 + 15, 4);
            } else {
                Statics.field2853[1].method8786(var5 + 15, 4);
            }
            arg0.method6954(class367.field4251, var5 + 32, 17, 16777215, -1);
        }
        class540.method8758(field927 + 708, 4, 50, 16, 0);
        arg1.method6963(class367.field4191, field927 + 708 + 25, 16, 16777215, -1);
        field957 = -1;
        if (Statics.field1052 == null) {
            return;
        }
        byte var6 = 88;
        byte var7 = 19;
        int var8 = 765 / (var6 + 1) - 1;
        int var9 = 480 / (var7 + 1);
        int var10;
        int var11;
        do {
            var10 = var9;
            var11 = var8;
            if ((var8 - 1) * var9 >= class69.field829) {
                var8--;
            }
            if ((var9 - 1) * var8 >= class69.field829) {
                var9--;
            }
            if ((var9 - 1) * var8 >= class69.field829) {
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
        int var16 = (class69.field829 + var9 - 1) / var9;
        field959 = var16 - var8;
        if (Statics.field4319 != null && field965 > 0) {
            Statics.field4319.method8786(8, Statics.field4908 / 2 - Statics.field4319.field5229 / 2);
        }
        if (Statics.field2426 != null && field965 < field959) {
            Statics.field2426.method8786(Statics.field3598 - Statics.field2426.field5231 - 8, Statics.field4908 / 2 - Statics.field2426.field5229 / 2);
        }
        int var17 = var15 + 23;
        int var18 = field927 + var14;
        int var19 = 0;
        boolean var20 = false;
        int var21 = field965;
        for (int var22 = var9 * var21; var22 < class69.field829 && var21 - field965 < var8; var22++) {
            class69 var23 = Statics.field1471[var22];
            boolean var24 = true;
            String var25 = Integer.toString(var23.field840);
            if (var23.field840 == -1) {
                var25 = class367.field4252;
                var24 = false;
            } else if (var23.field840 > 1980) {
                var25 = class367.field4253;
                var24 = false;
            }
            class111 var26 = null;
            int var27 = 0;
            if (var23.method1734()) {
                var26 = var23.method1735() ? class111.field1394 : class111.field1393;
            } else if (var23.method1736()) {
                var26 = var23.method1735() ? class111.field1390 : class111.field1405;
            } else if (var23.method1740()) {
                var27 = 16711680;
                var26 = var23.method1735() ? class111.field1387 : class111.field1388;
            } else if (var23.method1742()) {
                var26 = var23.method1735() ? class111.field1391 : class111.field1395;
            } else if (var23.method1762()) {
                var26 = var23.method1735() ? class111.field1403 : class111.field1389;
            } else if (var23.method1743()) {
                var26 = var23.method1735() ? class111.field1398 : class111.field1397;
            } else if (var23.method1744()) {
                var26 = var23.method1735() ? class111.field1400 : class111.field1399;
            }
            if (var26 == null || var26.field1392 >= Statics.field1052.length) {
                var26 = var23.method1735() ? class111.field1402 : class111.field1401;
            }
            if (class36.field235 >= var18 && class36.field241 >= var17 && class36.field235 < var6 + var18 && class36.field241 < var7 + var17 && var24) {
                field957 = var22;
                Statics.field1052[var26.field1392].method8827(var18, var17, 128, 16777215);
                var20 = true;
            } else {
                Statics.field1052[var26.field1392].method8821(var18, var17);
            }
            if (Statics.field1185 != null) {
                Statics.field1185[(var23.method1735() ? 8 : 0) + var23.field838].method8786(var18 + 29, var17);
            }
            arg0.method6963(Integer.toString(var23.field833), var18 + 15, var7 / 2 + var17 + 5, var27, -1);
            arg1.method6963(var25, var18 + 60, var7 / 2 + var17 + 5, 268435455, -1);
            var17 += var7 + var13;
            var19++;
            if (var19 >= var9) {
                var17 = var15 + 23;
                var18 += var6 + var12;
                var19 = 0;
                var21++;
            }
        }
        if (!var20) {
            return;
        }
        int var28 = arg1.method6948(Statics.field1471[field957].field837) + 6;
        int var29 = arg1.field4536 + 8;
        int var30 = class36.field241 + 25;
        if (var29 + var30 > 480) {
            var30 = class36.field241 - 25 - var29;
        }
        class540.method8758(class36.field235 - var28 / 2, var30, var28, var29, 16777120);
        class540.method8763(class36.field235 - var28 / 2, var30, var28, var29, 0);
        arg1.method6963(Statics.field1471[field957].field837, class36.field235, arg1.field4536 + var30 + 4, 0, -1);
    }

    @ObfuscatedName("oa.au(Lcv;B)V")
    public static void method6507(class69 arg0) {
        if (arg0.method1735() != client.field522) {
            client.field522 = arg0.method1735();
            class221.method6160(arg0.method1735());
        }
        if (client.field520 != arg0.field832) {
            method4517(Statics.field2011, arg0.field832);
        }
        Statics.field243 = arg0.field826;
        client.field519 = arg0.field833;
        client.field520 = arg0.field832;
        Statics.field1472 = arg0.field834;
        Statics.field2224 = client.field529 == 0 ? 43594 : arg0.field833 + 40000;
        Statics.field3927 = client.field529 == 0 ? 443 : arg0.field833 + 50000;
        Statics.field1771 = Statics.field2224;
    }

    @ObfuscatedName("bk.ai(II)V")
    public static void method384(int arg0) {
        method638(14);
        field938 = arg0;
    }

    @ObfuscatedName("nx.ae(I)V")
    public static void method5657() {
        method638(24);
        method5196(class367.field4212, class367.field4179, class367.field4180);
    }

    @ObfuscatedName("bb.aw(II)V")
    public static void method638(int arg0) {
        if (field944 != arg0) {
            field944 = arg0;
        }
    }
}
