package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Random;

@ObfuscatedName("cq")
public class class79 {

    @ObfuscatedName("cq.m")
    public static int field1105 = 0;

    @ObfuscatedName("cq.e")
    public static int field1118 = field1105 + 202;

    @ObfuscatedName("cq.i")
    public static int[] field1129 = new int[256];

    @ObfuscatedName("cq.o")
    public static int field1115 = 0;

    @ObfuscatedName("cq.ai")
    public static int field1139 = 0;

    @ObfuscatedName("cq.an")
    public static int field1117 = 0;

    @ObfuscatedName("cq.as")
    public static int field1104 = 0;

    @ObfuscatedName("cq.aw")
    public static int field1119 = 0;

    @ObfuscatedName("cq.ag")
    public static int field1120 = 0;

    @ObfuscatedName("cq.ah")
    public static int field1121 = 10;

    @ObfuscatedName("cq.az")
    public static String field1122 = "";

    @ObfuscatedName("cq.af")
    public static int field1136 = 0;

    @ObfuscatedName("cq.am")
    public static String field1112 = "";

    @ObfuscatedName("cq.aq")
    public static String field1125 = "";

    @ObfuscatedName("cq.aj")
    public static String field1126 = "";

    @ObfuscatedName("cq.ae")
    public static String field1140 = "";

    @ObfuscatedName("cq.au")
    public static String field1128 = "";

    @ObfuscatedName("cq.av")
    public static String field1144 = "";

    @ObfuscatedName("cq.ab")
    public static boolean field1130 = false;

    @ObfuscatedName("cq.bo")
    public static boolean field1134 = false;

    @ObfuscatedName("cq.bx")
    public static boolean field1132 = false;

    @ObfuscatedName("cq.bk")
    public static boolean field1133 = true;

    @ObfuscatedName("cq.bn")
    public static int field1127 = 0;

    @ObfuscatedName("cq.bp")
    public static String field1135 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cq.bu")
    public static String field1131 = "1234567890";

    @ObfuscatedName("cq.bl")
    public static boolean field1137 = false;

    @ObfuscatedName("cq.bw")
    public static int field1138 = -1;

    @ObfuscatedName("cq.bv")
    public static long field1107;

    @ObfuscatedName("cq.bf")
    public static long field1142;

    static {
        new DecimalFormat("##0.00");
        new class149();
        field1107 = -1L;
        field1142 = -1L;
    }

    public class79() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.w(Liv;Liv;ZII)V")
    public static void method1712(class248 arg0, class248 arg1, boolean arg2, int arg3) {
        if (!Statics.field1123) {
            field1136 = arg3;
            class315.method5332();
            byte[] var4 = arg0.method4271("title.jpg", "");
            Statics.field1108 = class44.method4467(var4);
            Statics.field225 = Statics.field1108.method5513();
            if ((client.field727 & 0x20000000) == 0) {
                Statics.field1109 = class320.method893(arg1, "logo", "");
            } else {
                Statics.field1109 = class320.method893(arg1, "logo_deadman_mode", "");
            }
            Statics.field1106 = class320.method893(arg1, "titlebox", "");
            Statics.field1114 = class320.method893(arg1, "titlebutton", "");
            Statics.field2417 = class320.method4864(arg1, "runes", "");
            Statics.field503 = class320.method4864(arg1, "title_mute", "");
            Statics.field1110 = class320.method893(arg1, "options_radio_buttons,0", "");
            Statics.field945 = class320.method893(arg1, "options_radio_buttons,4", "");
            Statics.field1111 = class320.method893(arg1, "options_radio_buttons,2", "");
            Statics.field2364 = class320.method893(arg1, "options_radio_buttons,6", "");
            Statics.field1882 = Statics.field1110.field3787;
            Statics.field1029 = Statics.field1110.field3788;
            Statics.field5 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field5[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field5[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field5[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field5[var8 + 192] = 16777215;
            }
            Statics.field1179 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1179[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1179[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1179[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1179[var12 + 192] = 16777215;
            }
            Statics.field1229 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1229[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1229[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1229[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1229[var16 + 192] = 16777215;
            }
            Statics.field377 = new int[256];
            Statics.field52 = new int[32768];
            Statics.field1207 = new int[32768];
            method699((class318) null);
            Statics.field3702 = new int[32768];
            Statics.field3570 = new int[32768];
            if (arg2) {
                field1128 = "";
                field1144 = "";
            }
            Statics.field550 = 0;
            Statics.field415 = "";
            field1133 = true;
            field1137 = false;
            if (Statics.field469.field983) {
                class218.method3595(2);
            } else {
                class250 var17 = Statics.field437;
                int var18 = var17.method4268("scape main");
                int var19 = var17.method4317(var18, "");
                class218.method3153(2, var17, var18, var19, 255, false);
            }
            class251.method140(false);
            Statics.field1123 = true;
            field1105 = (Statics.field71 - 765) / 2;
            field1118 = field1105 + 202;
            Statics.field1113 = field1118 + 180;
            Statics.field1108.method5450(field1105, 0);
            Statics.field225.method5450(field1105 + 382, 0);
            Statics.field1109.method5430(field1105 + 382 - Statics.field1109.field3787 / 2, 18);
        } else if (arg3 == 4) {
            field1136 = 4;
        }
    }

    @ObfuscatedName("f.m(ZZB)Llh;")
    public static class318 method55(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field2364 : Statics.field1111) : (arg1 ? Statics.field945 : Statics.field1110);
    }

    @ObfuscatedName("bk.q(B)Ljava/lang/String;")
    public static String method994() {
        return Statics.field469.field978 ? class306.method2379(field1128) : field1128;
    }

    @ObfuscatedName("ef.x(I)V")
    public static void method2877() {
        if (field1128 != null && field1128.length() > 0) {
            return;
        }
        if (Statics.field469.field981 == null) {
            field1130 = false;
        } else {
            field1128 = Statics.field469.field981;
            field1130 = true;
        }
    }

    @ObfuscatedName("ju.j(I)V")
    public static void method4859() {
        if (field1130 && field1128 != null && field1128.length() > 0) {
            field1127 = 1;
        } else {
            field1127 = 0;
        }
    }

    @ObfuscatedName("av.a(Laa;I)V")
    public static void method728(class48 arg0) {
        if (field1137) {
            method2970(arg0);
            return;
        }
        if ((class49.field432 == 1 || !Statics.field58 && class49.field432 == 4) && class49.field433 >= field1105 + 765 - 50 && class49.field438 >= 453) {
            Statics.field469.field983 = !Statics.field469.field983;
            class67.method4621();
            if (Statics.field469.field983) {
                class218.method630();
            } else {
                class218.method2490(Statics.field437, "scape main", "", 255, false);
            }
        }
        if (client.field612 == 5) {
            return;
        }
        if (field1107 == -1L) {
            field1107 = class185.method3151() + 1000L;
        }
        long var1 = class185.method3151();
        boolean var4;
        if (client.field787 == null || client.field862 >= client.field787.size()) {
            var4 = true;
        } else {
            while (true) {
                if (client.field862 >= client.field787.size()) {
                    var4 = true;
                    break;
                }
                class53 var3 = (class53) client.field787.get(client.field862);
                if (!var3.method974()) {
                    var4 = false;
                    break;
                }
                client.field862++;
            }
        }
        if (var4 && field1142 == -1L) {
            field1142 = var1;
            if (field1142 > field1107) {
                field1107 = field1142;
            }
        }
        field1119++;
        if (client.field612 != 10 && client.field612 != 11) {
            return;
        }
        if (client.field600 == 0) {
            if (class49.field432 == 1 || !Statics.field58 && class49.field432 == 4) {
                int var5 = field1105 + 5;
                short var6 = 463;
                byte var7 = 100;
                byte var8 = 35;
                if (class49.field433 >= var5 && class49.field433 <= var5 + var7 && class49.field438 >= var6 && class49.field438 <= var6 + var8) {
                    if (class66.method4358()) {
                        field1137 = true;
                    }
                    return;
                }
            }
            if (Statics.field960 != null && class66.method4358()) {
                field1137 = true;
            }
        }
        int var9 = class49.field432;
        int var10 = class49.field433;
        int var11 = class49.field438;
        if (var9 == 0) {
            var10 = class49.field426;
            var11 = class49.field418;
        }
        if (!Statics.field58 && var9 == 4) {
            var9 = 1;
        }
        if (field1136 == 0) {
            boolean var12 = false;
            while (class40.method2047()) {
                if (Statics.field1814 == 84) {
                    var12 = true;
                }
            }
            int var13 = Statics.field1113 - 80;
            short var14 = 291;
            if (var9 == 1 && var10 >= var13 - 75 && var10 <= var13 + 75 && var11 >= var14 - 20 && var11 <= var14 + 20) {
                String var15 = client.method2338("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class46.method522(var15, true, "openjs", false);
            }
            int var16 = Statics.field1113 + 80;
            if (var9 == 1 && var10 >= var16 - 75 && var10 <= var16 + 75 && var11 >= var14 - 20 && var11 <= var14 + 20 || var12) {
                if ((client.field727 & 0x2000000) != 0) {
                    field1112 = "";
                    field1125 = class238.field2887;
                    field1126 = class238.field2993;
                    field1140 = class238.field3084;
                    field1136 = 1;
                    method4859();
                } else if ((client.field727 & 0x4) != 0) {
                    if ((client.field727 & 0x400) == 0) {
                        field1125 = class238.field3030;
                        field1126 = class238.field3031;
                        field1140 = class238.field3032;
                    } else {
                        field1125 = class238.field2813;
                        field1126 = class238.field2986;
                        field1140 = class238.field3038;
                    }
                    field1112 = class238.field2840;
                    field1136 = 1;
                    method4859();
                } else if ((client.field727 & 0x400) == 0) {
                    method4241(false);
                } else {
                    field1125 = class238.field3033;
                    field1126 = class238.field3029;
                    field1140 = class238.field3035;
                    field1112 = class238.field2840;
                    field1136 = 1;
                    method4859();
                }
            }
        } else if (field1136 == 1) {
            while (class40.method2047()) {
                if (Statics.field1814 == 84) {
                    method4241(false);
                } else if (Statics.field1814 == 13) {
                    field1136 = 0;
                }
            }
            int var17 = Statics.field1113 - 80;
            short var18 = 321;
            if (var9 == 1 && var10 >= var17 - 75 && var10 <= var17 + 75 && var11 >= var18 - 20 && var11 <= var18 + 20) {
                method4241(false);
            }
            int var19 = Statics.field1113 + 80;
            if (var9 == 1 && var10 >= var19 - 75 && var10 <= var19 + 75 && var11 >= var18 - 20 && var11 <= var18 + 20) {
                field1136 = 0;
            }
        } else if (field1136 == 2) {
            short var20 = 201;
            int var54 = var20 + 52;
            if (var9 == 1 && var11 >= var54 - 12 && var11 < var54 + 2) {
                field1127 = 0;
            }
            var54 += 15;
            if (var9 == 1 && var11 >= var54 - 12 && var11 < var54 + 2) {
                field1127 = 1;
            }
            var54 += 15;
            short var21 = 361;
            if (var9 == 1 && var11 >= var21 - 15 && var11 < var21) {
                method2135(class238.field3070, class238.field3071, class238.field2888);
                field1136 = 5;
                return;
            }
            int var22 = Statics.field1113 - 80;
            short var23 = 321;
            if (var9 == 1 && var10 >= var22 - 75 && var10 <= var22 + 75 && var11 >= var23 - 20 && var11 <= var23 + 20) {
                field1128 = field1128.trim();
                if (field1128.length() == 0) {
                    method2135(class238.field2931, class238.field3015, class238.field2933);
                    return;
                }
                if (field1144.length() == 0) {
                    method2135(class238.field3011, class238.field2935, class238.field2936);
                    return;
                }
                method2135(class238.field2927, class238.field2959, class238.field3046);
                client.method670(false);
                Statics.method2138(20);
                return;
            }
            int var24 = field1118 + 180 + 80;
            if (var9 == 1 && var10 >= var24 - 75 && var10 <= var24 + 75 && var11 >= var23 - 20 && var11 <= var23 + 20) {
                field1136 = 0;
                field1128 = "";
                field1144 = "";
                Statics.field550 = 0;
                Statics.field415 = "";
                field1133 = true;
            }
            int var25 = Statics.field1113 + -117;
            short var26 = 277;
            field1134 = var10 >= var25 && var10 < Statics.field1882 + var25 && var11 >= var26 && var11 < Statics.field1029 + var26;
            if (var9 == 1 && field1134) {
                field1130 = !field1130;
                if (!field1130 && Statics.field469.field981 != null) {
                    Statics.field469.field981 = null;
                    class67.method4621();
                }
            }
            int var27 = Statics.field1113 + 24;
            short var28 = 277;
            field1132 = var10 >= var27 && var10 < Statics.field1882 + var27 && var11 >= var28 && var11 < Statics.field1029 + var28;
            if (var9 == 1 && field1132) {
                Statics.field469.field978 = !Statics.field469.field978;
                if (!Statics.field469.field978) {
                    field1128 = "";
                    Statics.field469.field981 = null;
                    method4859();
                }
                class67.method4621();
            }
            while (true) {
                while (class40.method2047()) {
                    boolean var29 = false;
                    for (int var30 = 0; var30 < field1135.length(); var30++) {
                        if (Statics.field1847 == field1135.charAt(var30)) {
                            var29 = true;
                            break;
                        }
                    }
                    if (Statics.field1814 == 13) {
                        field1136 = 0;
                        field1128 = "";
                        field1144 = "";
                        Statics.field550 = 0;
                        Statics.field415 = "";
                        field1133 = true;
                    } else if (field1127 == 0) {
                        if (Statics.field1814 == 85 && field1128.length() > 0) {
                            field1128 = field1128.substring(0, field1128.length() - 1);
                        }
                        if (Statics.field1814 == 84 || Statics.field1814 == 80) {
                            field1127 = 1;
                        }
                        if (var29 && field1128.length() < 320) {
                            field1128 = field1128 + Statics.field1847;
                        }
                    } else if (field1127 == 1) {
                        if (Statics.field1814 == 85 && field1144.length() > 0) {
                            field1144 = field1144.substring(0, field1144.length() - 1);
                        }
                        if (Statics.field1814 == 84 || Statics.field1814 == 80) {
                            field1127 = 0;
                        }
                        if (Statics.field1814 == 84) {
                            field1128 = field1128.trim();
                            if (field1128.length() == 0) {
                                method2135(class238.field2931, class238.field3015, class238.field2933);
                                return;
                            }
                            if (field1144.length() == 0) {
                                method2135(class238.field3011, class238.field2935, class238.field2936);
                                return;
                            }
                            method2135(class238.field2927, class238.field2959, class238.field3046);
                            client.method670(false);
                            Statics.method2138(20);
                            return;
                        }
                        if (var29 && field1144.length() < 20) {
                            field1144 = field1144 + Statics.field1847;
                        }
                    }
                }
                return;
            }
        } else if (field1136 == 3) {
            int var31 = field1118 + 180;
            short var32 = 276;
            if (var9 == 1 && var10 >= var31 - 75 && var10 <= var31 + 75 && var11 >= var32 - 20 && var11 <= var32 + 20) {
                method4241(false);
            }
            int var33 = field1118 + 180;
            short var34 = 326;
            if (var9 == 1 && var10 >= var33 - 75 && var10 <= var33 + 75 && var11 >= var34 - 20 && var11 <= var34 + 20) {
                method2135(class238.field3070, class238.field3071, class238.field2888);
                field1136 = 5;
                return;
            }
        } else if (field1136 == 4) {
            int var35 = field1118 + 180 - 80;
            short var36 = 321;
            if (var9 == 1 && var10 >= var35 - 75 && var10 <= var35 + 75 && var11 >= var36 - 20 && var11 <= var36 + 20) {
                Statics.field415.trim();
                if (Statics.field415.length() != 6) {
                    method2135(class238.field2850, class238.field2851, class238.field2852);
                    return;
                }
                Statics.field550 = Integer.parseInt(Statics.field415);
                Statics.field415 = "";
                client.method670(true);
                method2135(class238.field2927, class238.field2959, class238.field3046);
                Statics.method2138(20);
                return;
            }
            if (var9 == 1 && var10 >= field1118 + 180 - 9 && var10 <= field1118 + 180 + 130 && var11 >= 263 && var11 <= 296) {
                field1133 = !field1133;
            }
            if (var9 == 1 && var10 >= field1118 + 180 - 34 && var10 <= field1118 + 180 + 34 && var11 >= 351 && var11 <= 363) {
                String var37 = client.method2338("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class46.method522(var37, true, "openjs", false);
            }
            int var38 = field1118 + 180 + 80;
            if (var9 == 1 && var10 >= var38 - 75 && var10 <= var38 + 75 && var11 >= var36 - 20 && var11 <= var36 + 20) {
                field1136 = 0;
                field1128 = "";
                field1144 = "";
                Statics.field550 = 0;
                Statics.field415 = "";
            }
            while (class40.method2047()) {
                boolean var39 = false;
                for (int var40 = 0; var40 < field1131.length(); var40++) {
                    if (Statics.field1847 == field1131.charAt(var40)) {
                        var39 = true;
                        break;
                    }
                }
                if (Statics.field1814 == 13) {
                    field1136 = 0;
                    field1128 = "";
                    field1144 = "";
                    Statics.field550 = 0;
                    Statics.field415 = "";
                } else {
                    if (Statics.field1814 == 85 && Statics.field415.length() > 0) {
                        Statics.field415 = Statics.field415.substring(0, Statics.field415.length() - 1);
                    }
                    if (Statics.field1814 == 84) {
                        Statics.field415.trim();
                        if (Statics.field415.length() != 6) {
                            method2135(class238.field2850, class238.field2851, class238.field2852);
                            return;
                        }
                        Statics.field550 = Integer.parseInt(Statics.field415);
                        Statics.field415 = "";
                        client.method670(true);
                        method2135(class238.field2927, class238.field2959, class238.field3046);
                        Statics.method2138(20);
                        return;
                    }
                    if (var39 && Statics.field415.length() < 6) {
                        Statics.field415 = Statics.field415 + Statics.field1847;
                    }
                }
            }
        } else if (field1136 == 5) {
            int var41 = field1118 + 180 - 80;
            short var42 = 321;
            if (var9 == 1 && var10 >= var41 - 75 && var10 <= var41 + 75 && var11 >= var42 - 20 && var11 <= var42 + 20) {
                method1033();
                return;
            }
            int var43 = field1118 + 180 + 80;
            if (var9 == 1 && var10 >= var43 - 75 && var10 <= var43 + 75 && var11 >= var42 - 20 && var11 <= var42 + 20) {
                method4241(true);
            }
            while (class40.method2047()) {
                boolean var44 = false;
                for (int var45 = 0; var45 < field1135.length(); var45++) {
                    if (Statics.field1847 == field1135.charAt(var45)) {
                        var44 = true;
                        break;
                    }
                }
                if (Statics.field1814 == 13) {
                    method4241(true);
                } else {
                    if (Statics.field1814 == 85 && field1128.length() > 0) {
                        field1128 = field1128.substring(0, field1128.length() - 1);
                    }
                    if (Statics.field1814 == 84) {
                        method1033();
                        return;
                    }
                    if (var44 && field1128.length() < 320) {
                        field1128 = field1128 + Statics.field1847;
                    }
                }
            }
        } else if (field1136 == 6) {
            while (true) {
                do {
                    if (!class40.method2047()) {
                        short var46 = 321;
                        if (var9 == 1 && var11 >= var46 - 20 && var11 <= var46 + 20) {
                            method4241(true);
                        }
                        return;
                    }
                } while (Statics.field1814 != 84 && Statics.field1814 != 13);
                method4241(true);
            }
        } else if (field1136 == 7) {
            int var47 = field1118 + 180 - 80;
            short var48 = 321;
            if (var9 == 1 && var10 >= var47 - 75 && var10 <= var47 + 75 && var11 >= var48 - 20 && var11 <= var48 + 20) {
                String var49 = client.method2338("secure", true) + "m=weblogin/loginform.ws?mod=dob&ssl=1&expired=0&dest=set_dob.ws";
                class46.method522(var49, true, "openjs", false);
                method2135(class238.field3067, class238.field3068, class238.field3069);
                field1136 = 6;
                return;
            }
            int var50 = field1118 + 180 + 80;
            if (var9 == 1 && var10 >= var50 - 75 && var10 <= var50 + 75 && var11 >= var48 - 20 && var11 <= var48 + 20) {
                method4241(true);
            }
        } else if (field1136 == 8) {
            int var51 = field1118 + 180 - 80;
            short var52 = 321;
            if (var9 == 1 && var10 >= var51 - 75 && var10 <= var51 + 75 && var11 >= var52 - 20 && var11 <= var52 + 20) {
                class46.method522("https://www.jagex.com/terms/privacy/#eight", true, "openjs", false);
                method2135(class238.field3067, class238.field3068, class238.field3069);
                field1136 = 6;
                return;
            }
            int var53 = field1118 + 180 + 80;
            if (var9 == 1 && var10 >= var53 - 75 && var10 <= var53 + 75 && var11 >= var52 - 20 && var11 <= var52 + 20) {
                method4241(true);
            }
        }
    }

    @ObfuscatedName("iu.l(ZI)V")
    public static void method4241(boolean arg0) {
        field1125 = class238.field2972;
        field1126 = class238.field2954;
        field1140 = class238.field2841;
        field1136 = 2;
        if (arg0) {
            field1144 = "";
        }
        method2877();
        method4859();
    }

    @ObfuscatedName("bp.d(B)V")
    public static void method1033() {
        field1128 = field1128.trim();
        if (field1128.length() == 0) {
            method2135(class238.field3070, class238.field3071, class238.field2888);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2338("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class183 var4 = new class183(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2366, var4.field2360, 1000 - var4.field2360);
                if (var5 == -1) {
                    var4.field2360 = 0;
                    long var8 = var4.method3486();
                    var6 = var8;
                    break;
                }
                var4.field2360 += var5;
                if (var4.field2360 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var41) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field1128;
            Random var15 = new Random();
            class183 var16 = new class183(128);
            class183 var17 = new class183(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method3246(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method3249(var15.nextInt());
            }
            var16.method3249(var18[0]);
            var16.method3249(var18[1]);
            var16.method3251(var6);
            var16.method3251(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method3249(var15.nextInt());
            }
            var16.method3295(class74.field1063, class74.field1061);
            var17.method3246(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method3249(var15.nextInt());
            }
            var17.method3251(var15.nextLong());
            var17.method3340(var15.nextLong());
            if (client.field719 == null) {
                byte[] var22 = class156.method4147();
                var17.method3322(var22, 0, var22.length);
            } else {
                var17.method3322(client.field719, 0, client.field719.length);
            }
            var17.method3251(var15.nextLong());
            var17.method3295(class74.field1063, class74.field1061);
            int var23 = class183.method124(var14);
            if (var23 % 8 != 0) {
                var23 += 8 - var23 % 8;
            }
            class183 var24 = new class183(var23);
            var24.method3243(var14);
            var24.field2360 = var23;
            var24.method3281(var18);
            class183 var25 = new class183(var24.field2360 + var17.field2360 + var16.field2360 + 5);
            var25.method3246(2);
            var25.method3246(var16.field2360);
            var25.method3322(var16.field2366, 0, var16.field2360);
            var25.method3246(var17.field2360);
            var25.method3322(var17.field2366, 0, var17.field2360);
            var25.method3296(var24.field2360);
            var25.method3322(var24.field2366, 0, var24.field2360);
            String var26 = class305.method2867(var25.field2366);
            byte var33;
            try {
                URL var27 = new URL(client.method2338("services", false) + "m=accountappeal/login.ws");
                URLConnection var28 = var27.openConnection();
                var28.setDoInput(true);
                var28.setDoOutput(true);
                var28.setConnectTimeout(5000);
                OutputStreamWriter var29 = new OutputStreamWriter(var28.getOutputStream());
                var29.write("data2=" + class326.method3160(var26) + "&dest=" + class326.method3160("passwordchoice.ws"));
                var29.flush();
                InputStream var30 = var28.getInputStream();
                class183 var31 = new class183(new byte[1000]);
                while (true) {
                    int var32 = var30.read(var31.field2366, var31.field2360, 1000 - var31.field2360);
                    if (var32 == -1) {
                        var29.close();
                        var30.close();
                        String var34 = new String(var31.field2366);
                        if (var34.startsWith("OFFLINE")) {
                            var33 = 4;
                        } else if (var34.startsWith("WRONG")) {
                            var33 = 7;
                        } else if (var34.startsWith("RELOAD")) {
                            var33 = 3;
                        } else if (var34.startsWith("Not permitted for social network accounts.")) {
                            var33 = 6;
                        } else {
                            var31.method3282(var18);
                            while (var31.field2360 > 0 && var31.field2366[var31.field2360 - 1] == 0) {
                                var31.field2360--;
                            }
                            String var35 = new String(var31.field2366, 0, var31.field2360);
                            boolean var36;
                            if (var35 == null) {
                                var36 = false;
                            } else {
                                label104: {
                                    try {
                                        new URL(var35);
                                    } catch (MalformedURLException var39) {
                                        var36 = false;
                                        break label104;
                                    }
                                    var36 = true;
                                }
                            }
                            if (var36) {
                                class46.method982(var35, true, false);
                                var33 = 2;
                            } else {
                                var33 = 5;
                            }
                        }
                        break;
                    }
                    var31.field2360 += var32;
                    if (var31.field2360 >= 1000) {
                        var33 = 5;
                        break;
                    }
                }
            } catch (Throwable var40) {
                var40.printStackTrace();
                var33 = 5;
            }
            var13 = var33;
        }
        switch(var13) {
            case 2:
                method2135(class238.field2929, class238.field3074, class238.field2833);
                field1136 = 6;
                break;
            case 3:
                method2135(class238.field3076, class238.field2903, class238.field3078);
                break;
            case 4:
                method2135(class238.field3026, class238.field3080, class238.field3081);
                break;
            case 5:
                method2135(class238.field2882, class238.field3083, class238.field2897);
                break;
            case 6:
                method2135(class238.field3085, class238.field3023, class238.field3087);
                break;
            case 7:
                method2135(class238.field3088, class238.field3089, class238.field2865);
        }
    }

    @ObfuscatedName("as.s(Lkr;Lkr;Lkr;ZB)V")
    public static void method529(class299 arg0, class299 arg1, class299 arg2, boolean arg3) {
        if (arg3) {
            field1105 = (Statics.field71 - 765) / 2;
            field1118 = field1105 + 202;
            Statics.field1113 = field1118 + 180;
        }
        if (field1137) {
            method1819(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1108.method5450(field1105, 0);
            Statics.field225.method5450(field1105 + 382, 0);
            Statics.field1109.method5430(field1105 + 382 - Statics.field1109.field3787 / 2, 18);
        }
        if (client.field612 == 0 || client.field612 == 5) {
            byte var4 = 20;
            arg0.method5134(class238.field3025, field1118 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class315.method5343(field1118 + 180 - 152, var5, 304, 34, 9179409);
            class315.method5343(field1118 + 180 - 151, var5 + 1, 302, 32, 0);
            class315.method5400(field1118 + 180 - 150, var5 + 2, field1121 * 3, 30, 9179409);
            class315.method5400(field1121 * 3 + (field1118 + 180 - 150), var5 + 2, 300 - field1121 * 3, 30, 0);
            arg0.method5134(field1122, field1118 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field612 == 20) {
            Statics.field1106.method5430(field1118 + 180 - Statics.field1106.field3787 / 2, 271 - Statics.field1106.field3788 / 2);
            short var6 = 201;
            arg0.method5134(field1125, field1118 + 180, var6, 16776960, 0);
            int var64 = var6 + 15;
            arg0.method5134(field1126, field1118 + 180, var64, 16776960, 0);
            int var65 = var64 + 15;
            arg0.method5134(field1140, field1118 + 180, var65, 16776960, 0);
            int var66 = var65 + 15;
            int var67 = var66 + 7;
            if (field1136 != 4) {
                arg0.method5114(class238.field3047, field1118 + 180 - 110, var67, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = method994(); arg0.method5109(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method5114(class300.method5208(var8), field1118 + 180 - 70, var67, 16777215, 0);
                var64 = var67 + 15;
                arg0.method5114(class238.field3048 + class306.method2379(field1144), field1118 + 180 - 108, var64, 16777215, 0);
                var64 += 15;
            }
        }
        if (client.field612 == 10 || client.field612 == 11) {
            Statics.field1106.method5430(field1118, 171);
            if (field1136 == 0) {
                short var9 = 251;
                arg0.method5134(class238.field3050, field1118 + 180, var9, 16776960, 0);
                int var68 = var9 + 30;
                int var10 = field1118 + 180 - 80;
                short var11 = 291;
                Statics.field1114.method5430(var10 - 73, var11 - 20);
                arg0.method5162(class238.field3039, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1118 + 180 + 80;
                Statics.field1114.method5430(var12 - 73, var11 - 20);
                arg0.method5162(class238.field3052, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1136 == 1) {
                arg0.method5134(field1112, field1118 + 180, 201, 16776960, 0);
                short var13 = 236;
                arg0.method5134(field1125, field1118 + 180, var13, 16777215, 0);
                int var69 = var13 + 15;
                arg0.method5134(field1126, field1118 + 180, var69, 16777215, 0);
                int var70 = var69 + 15;
                arg0.method5134(field1140, field1118 + 180, var70, 16777215, 0);
                int var71 = var70 + 15;
                int var14 = field1118 + 180 - 80;
                short var15 = 321;
                Statics.field1114.method5430(var14 - 73, var15 - 20);
                arg0.method5134(class238.field2819, var14, var15 + 5, 16777215, 0);
                int var16 = field1118 + 180 + 80;
                Statics.field1114.method5430(var16 - 73, var15 - 20);
                arg0.method5134(class238.field3051, var16, var15 + 5, 16777215, 0);
            } else if (field1136 == 2) {
                short var17 = 201;
                arg0.method5134(field1125, Statics.field1113, var17, 16776960, 0);
                int var72 = var17 + 15;
                arg0.method5134(field1126, Statics.field1113, var72, 16776960, 0);
                int var73 = var72 + 15;
                arg0.method5134(field1140, Statics.field1113, var73, 16776960, 0);
                int var74 = var73 + 15;
                int var75 = var74 + 7;
                arg0.method5114(class238.field3047, Statics.field1113 - 110, var75, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = method994(); arg0.method5109(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method5114(class300.method5208(var19) + (field1127 == 0 & client.field680 % 40 < 20 ? class75.method969(16776960) + class75.field1071 : ""), Statics.field1113 - 70, var75, 16777215, 0);
                var72 = var75 + 15;
                arg0.method5114(class238.field3048 + class306.method2379(field1144) + (field1127 == 1 & client.field680 % 40 < 20 ? class75.method969(16776960) + class75.field1071 : ""), Statics.field1113 - 108, var72, 16777215, 0);
                var72 += 15;
                short var20 = 277;
                int var21 = Statics.field1113 + -117;
                class318 var22 = method55(field1130, field1134);
                var22.method5430(var21, var20);
                int var23 = var22.field3787 + 5 + var21;
                arg1.method5114(class238.field3055, var23, var20 + 13, 16776960, 0);
                int var24 = Statics.field1113 + 24;
                class318 var25 = method55(Statics.field469.field978, field1132);
                var25.method5430(var24, var20);
                int var26 = var25.field3787 + 5 + var24;
                arg1.method5114(class238.field3056, var26, var20 + 13, 16776960, 0);
                int var76 = var20 + 15;
                int var27 = Statics.field1113 - 80;
                short var28 = 321;
                Statics.field1114.method5430(var27 - 73, var28 - 20);
                arg0.method5134(class238.field2941, var27, var28 + 5, 16777215, 0);
                int var29 = Statics.field1113 + 80;
                Statics.field1114.method5430(var29 - 73, var28 - 20);
                arg0.method5134(class238.field3051, var29, var28 + 5, 16777215, 0);
                short var30 = 357;
                arg1.method5134(class238.field3062, Statics.field1113, var30, 16776960, 0);
            } else if (field1136 == 3) {
                short var31 = 201;
                arg0.method5134(class238.field3058, field1118 + 180, var31, 16776960, 0);
                int var77 = var31 + 20;
                arg1.method5134(class238.field3063, field1118 + 180, var77, 16776960, 0);
                int var78 = var77 + 15;
                arg1.method5134(class238.field3059, field1118 + 180, var78, 16776960, 0);
                int var79 = var78 + 15;
                int var32 = field1118 + 180;
                short var33 = 276;
                Statics.field1114.method5430(var32 - 73, var33 - 20);
                arg2.method5134(class238.field3079, var32, var33 + 5, 16777215, 0);
                int var34 = field1118 + 180;
                short var35 = 326;
                Statics.field1114.method5430(var34 - 73, var35 - 20);
                arg2.method5134(class238.field3061, var34, var35 + 5, 16777215, 0);
            } else if (field1136 == 4) {
                arg0.method5134(class238.field3044, field1118 + 180, 201, 16776960, 0);
                short var36 = 236;
                arg0.method5134(field1125, field1118 + 180, var36, 16777215, 0);
                int var80 = var36 + 15;
                arg0.method5134(field1126, field1118 + 180, var80, 16777215, 0);
                int var81 = var80 + 15;
                arg0.method5134(field1140, field1118 + 180, var81, 16777215, 0);
                int var82 = var81 + 15;
                arg0.method5114(class238.field3049 + class306.method2379(Statics.field415) + (client.field680 % 40 < 20 ? class75.method969(16776960) + class75.field1071 : ""), field1118 + 180 - 108, var82, 16777215, 0);
                int var83 = var82 - 8;
                arg0.method5114(class238.field2997, field1118 + 180 - 9, var83, 16776960, 0);
                int var84 = var83 + 15;
                arg0.method5114(class238.field3105, field1118 + 180 - 9, var84, 16776960, 0);
                int var37 = field1118 + 180 - 9 + arg0.method5109(class238.field3105) + 15;
                int var38 = var84 - arg0.field3714;
                class318 var39;
                if (field1133) {
                    var39 = Statics.field1111;
                } else {
                    var39 = Statics.field1110;
                }
                var39.method5430(var37, var38);
                var80 = var84 + 15;
                int var40 = field1118 + 180 - 80;
                short var41 = 321;
                Statics.field1114.method5430(var40 - 73, var41 - 20);
                arg0.method5134(class238.field2819, var40, var41 + 5, 16777215, 0);
                int var42 = field1118 + 180 + 80;
                Statics.field1114.method5430(var42 - 73, var41 - 20);
                arg0.method5134(class238.field3051, var42, var41 + 5, 16777215, 0);
                arg1.method5134(class238.field3027, field1118 + 180, var41 + 36, 255, 0);
            } else if (field1136 == 5) {
                arg0.method5134(class238.field2961, field1118 + 180, 201, 16776960, 0);
                short var43 = 221;
                arg2.method5134(field1125, field1118 + 180, var43, 16776960, 0);
                int var85 = var43 + 15;
                arg2.method5134(field1126, field1118 + 180, var85, 16776960, 0);
                int var86 = var85 + 15;
                arg2.method5134(field1140, field1118 + 180, var86, 16776960, 0);
                int var87 = var86 + 15;
                int var88 = var87 + 14;
                arg0.method5114(class238.field3064, field1118 + 180 - 145, var88, 16777215, 0);
                short var44 = 174;
                String var45;
                for (var45 = method994(); arg0.method5109(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method5114(class300.method5208(var45) + (client.field680 % 40 < 20 ? class75.method969(16776960) + class75.field1071 : ""), field1118 + 180 - 34, var88, 16777215, 0);
                var85 = var88 + 15;
                int var46 = field1118 + 180 - 80;
                short var47 = 321;
                Statics.field1114.method5430(var46 - 73, var47 - 20);
                arg0.method5134(class238.field3043, var46, var47 + 5, 16777215, 0);
                int var48 = field1118 + 180 + 80;
                Statics.field1114.method5430(var48 - 73, var47 - 20);
                arg0.method5134(class238.field3066, var48, var47 + 5, 16777215, 0);
            } else if (field1136 == 6) {
                short var49 = 201;
                arg0.method5134(field1125, field1118 + 180, var49, 16776960, 0);
                int var89 = var49 + 15;
                arg0.method5134(field1126, field1118 + 180, var89, 16776960, 0);
                int var90 = var89 + 15;
                arg0.method5134(field1140, field1118 + 180, var90, 16776960, 0);
                int var91 = var90 + 15;
                int var50 = field1118 + 180;
                short var51 = 321;
                Statics.field1114.method5430(var50 - 73, var51 - 20);
                arg0.method5134(class238.field3066, var50, var51 + 5, 16777215, 0);
            } else if (field1136 == 7) {
                short var52 = 216;
                arg0.method5134(class238.field3091, field1118 + 180, var52, 16776960, 0);
                int var92 = var52 + 15;
                arg2.method5134(class238.field3092, field1118 + 180, var92, 16776960, 0);
                int var93 = var92 + 15;
                arg2.method5134(class238.field2953, field1118 + 180, var93, 16776960, 0);
                int var94 = var93 + 15;
                int var53 = field1118 + 180 - 80;
                short var54 = 321;
                Statics.field1114.method5430(var53 - 73, var54 - 20);
                arg0.method5134(class238.field2885, var53, var54 + 5, 16777215, 0);
                int var55 = field1118 + 180 + 80;
                Statics.field1114.method5430(var55 - 73, var54 - 20);
                arg0.method5134(class238.field3066, var55, var54 + 5, 16777215, 0);
            } else if (field1136 == 8) {
                short var56 = 216;
                arg0.method5134(class238.field2949, field1118 + 180, var56, 16776960, 0);
                int var95 = var56 + 15;
                arg2.method5134(class238.field3100, field1118 + 180, var95, 16776960, 0);
                int var96 = var95 + 15;
                arg2.method5134(class238.field2951, field1118 + 180, var96, 16776960, 0);
                int var97 = var96 + 15;
                int var57 = field1118 + 180 - 80;
                short var58 = 321;
                Statics.field1114.method5430(var57 - 73, var58 - 20);
                arg0.method5134(class238.field3077, var57, var58 + 5, 16777215, 0);
                int var59 = field1118 + 180 + 80;
                Statics.field1114.method5430(var59 - 73, var58 - 20);
                arg0.method5134(class238.field3066, var59, var58 + 5, 16777215, 0);
            }
        }
        if (field1119 > 0) {
            method700(field1119);
            field1119 = 0;
        }
        method1014();
        Statics.field503[Statics.field469.field983 ? 1 : 0].method5430(field1105 + 765 - 40, 463);
        if (client.field612 <= 5 || client.field600 != 0) {
            return;
        }
        if (Statics.field1845 == null) {
            Statics.field1845 = class320.method893(Statics.field554, "sl_button", "");
            return;
        }
        int var60 = field1105 + 5;
        short var61 = 463;
        byte var62 = 100;
        byte var63 = 35;
        Statics.field1845.method5430(var60, var61);
        arg0.method5134(class238.field2980 + " " + client.field677, var62 / 2 + var60, var63 / 2 + var61 - 2, 16777215, 0);
        if (Statics.field960 == null) {
            arg1.method5134(class238.field2824, var62 / 2 + var60, var63 / 2 + var61 + 12, 16777215, 0);
        } else {
            arg1.method5134(class238.field2912, var62 / 2 + var60, var63 / 2 + var61 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("cx.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2135(String arg0, String arg1, String arg2) {
        field1125 = arg0;
        field1126 = arg1;
        field1140 = arg2;
    }

    @ObfuscatedName("ae.g(Llh;I)V")
    public static final void method699(class318 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field52.length; var2++) {
            Statics.field52[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field52[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1207[var8] = (Statics.field52[var8 - 1] + Statics.field52[var8 + 1] + Statics.field52[var8 - 128] + Statics.field52[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field52;
            Statics.field52 = Statics.field1207;
            Statics.field1207 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3788; var11++) {
            for (int var12 = 0; var12 < arg0.field3787; var12++) {
                if (arg0.field3786[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3785;
                    int var14 = var11 + 16 + arg0.field3790;
                    int var15 = (var14 << 7) + var13;
                    Statics.field52[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ae.y(II)V")
    public static final void method700(int arg0) {
        short var1 = 256;
        field1117 += arg0 * 128;
        if (field1117 > Statics.field52.length) {
            field1117 -= Statics.field52.length;
            int var2 = (int) (Math.random() * 12.0D);
            method699(Statics.field2417[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field3702[var3 + var4] - Statics.field52[field1117 + var3 & Statics.field52.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field3702[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field3702[var9 + var10] = 255;
                } else {
                    Statics.field3702[var9 + var10] = 0;
                }
            }
        }
        if (field1115 > 0) {
            field1115 -= arg0 * 4;
        }
        if (field1139 > 0) {
            field1139 -= arg0 * 4;
        }
        if (field1115 == 0 && field1139 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1115 = 1024;
            }
            if (var12 == 1) {
                field1139 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1129[var13] = field1129[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1129[var14] = (int) (Math.sin((double) field1120 / 14.0D) * 16.0D + Math.sin((double) field1120 / 15.0D) * 14.0D + Math.sin((double) field1120 / 16.0D) * 12.0D);
            field1120++;
        }
        field1104 += arg0 * 2073076273;
        int var15 = ((client.field680 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1104 * 997353892; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field3702[(var18 << 7) + var17] = 192;
        }
        field1104 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field3702[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field3702[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field3570[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field3570[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field3570[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field3702[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("ay.c(IIII)I")
    public static final int method514(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("bn.e(S)V")
    public static final void method1014() {
        short var0 = 256;
        if (field1115 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1115 > 768) {
                    Statics.field377[var1] = method514(Statics.field5[var1], Statics.field1179[var1], 1024 - field1115);
                } else if (field1115 > 256) {
                    Statics.field377[var1] = Statics.field1179[var1];
                } else {
                    Statics.field377[var1] = method514(Statics.field1179[var1], Statics.field5[var1], 256 - field1115);
                }
            }
        } else if (field1139 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1139 > 768) {
                    Statics.field377[var2] = method514(Statics.field5[var2], Statics.field1229[var2], 1024 - field1139);
                } else if (field1139 > 256) {
                    Statics.field377[var2] = Statics.field1229[var2];
                } else {
                    Statics.field377[var2] = method514(Statics.field1229[var2], Statics.field5[var2], 256 - field1139);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field377[var3] = Statics.field5[var3];
            }
        }
        class315.method5328(field1105, 9, field1105 + 128, var0 + 7);
        Statics.field1108.method5450(field1105, 0);
        class315.method5327();
        int var4 = 0;
        int var5 = field1105 + Statics.field456.field3775 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1129[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field3702[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field377[var10];
                    int var14 = Statics.field456.field3774[var5];
                    Statics.field456.field3774[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field456.field3775 + var8 - 128;
        }
        class315.method5328(field1105 + 765 - 128, 9, field1105 + 765, var0 + 7);
        Statics.field225.method5450(field1105 + 382, 0);
        class315.method5327();
        int var15 = 0;
        int var16 = field1105 + Statics.field456.field3775 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1129[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field3702[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field377[var22];
                    int var26 = Statics.field456.field3774[var20];
                    Statics.field456.field3774[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field456.field3775 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("cw.t(Lkr;Lkr;B)V")
    public static void method1819(class299 arg0, class299 arg1) {
        if (Statics.field470 == null) {
            Statics.field470 = class320.method621(Statics.field554, "sl_back", "");
        }
        if (Statics.field105 == null) {
            Statics.field105 = class320.method4864(Statics.field554, "sl_flags", "");
        }
        if (Statics.field2399 == null) {
            Statics.field2399 = class320.method4864(Statics.field554, "sl_arrows", "");
        }
        if (Statics.field62 == null) {
            Statics.field62 = class320.method4864(Statics.field554, "sl_stars", "");
        }
        class315.method5400(field1105, 23, 765, 480, 0);
        class315.method5376(field1105, 0, 125, 23, 12425273, 9135624);
        class315.method5376(field1105 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method5134(class238.field3095, field1105 + 62, 15, 0, -1);
        if (Statics.field62 != null) {
            Statics.field62[1].method5430(field1105 + 140, 1);
            arg1.method5114(class238.field3096, field1105 + 152, 10, 16777215, -1);
            Statics.field62[0].method5430(field1105 + 140, 12);
            arg1.method5114(class238.field3097, field1105 + 152, 21, 16777215, -1);
        }
        if (Statics.field2399 != null) {
            int var2 = field1105 + 280;
            if (class66.field959[0] == 0 && class66.field970[0] == 0) {
                Statics.field2399[2].method5430(var2, 4);
            } else {
                Statics.field2399[0].method5430(var2, 4);
            }
            if (class66.field959[0] == 0 && class66.field970[0] == 1) {
                Statics.field2399[3].method5430(var2 + 15, 4);
            } else {
                Statics.field2399[1].method5430(var2 + 15, 4);
            }
            arg0.method5114(class238.field2934, var2 + 32, 17, 16777215, -1);
            int var3 = field1105 + 390;
            if (class66.field959[0] == 1 && class66.field970[0] == 0) {
                Statics.field2399[2].method5430(var3, 4);
            } else {
                Statics.field2399[0].method5430(var3, 4);
            }
            if (class66.field959[0] == 1 && class66.field970[0] == 1) {
                Statics.field2399[3].method5430(var3 + 15, 4);
            } else {
                Statics.field2399[1].method5430(var3 + 15, 4);
            }
            arg0.method5114(class238.field2906, var3 + 32, 17, 16777215, -1);
            int var4 = field1105 + 500;
            if (class66.field959[0] == 2 && class66.field970[0] == 0) {
                Statics.field2399[2].method5430(var4, 4);
            } else {
                Statics.field2399[0].method5430(var4, 4);
            }
            if (class66.field959[0] == 2 && class66.field970[0] == 1) {
                Statics.field2399[3].method5430(var4 + 15, 4);
            } else {
                Statics.field2399[1].method5430(var4 + 15, 4);
            }
            arg0.method5114(class238.field2995, var4 + 32, 17, 16777215, -1);
            int var5 = field1105 + 610;
            if (class66.field959[0] == 3 && class66.field970[0] == 0) {
                Statics.field2399[2].method5430(var5, 4);
            } else {
                Statics.field2399[0].method5430(var5, 4);
            }
            if (class66.field959[0] == 3 && class66.field970[0] == 1) {
                Statics.field2399[3].method5430(var5 + 15, 4);
            } else {
                Statics.field2399[1].method5430(var5 + 15, 4);
            }
            arg0.method5114(class238.field3101, var5 + 32, 17, 16777215, -1);
        }
        class315.method5400(field1105 + 708, 4, 50, 16, 0);
        arg1.method5134(class238.field3051, field1105 + 708 + 25, 16, 16777215, -1);
        field1138 = -1;
        if (Statics.field470 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class66.field956) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class66.field956) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class66.field956) {
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
            int var16 = var15 + 23;
            int var17 = field1105 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class66.field956; var20++) {
                class66 var21 = Statics.field1915[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field958);
                if (var21.field958 == -1) {
                    var23 = class238.field3102;
                    var22 = false;
                } else if (var21.field958 > 1980) {
                    var23 = class238.field2925;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1491()) {
                    if (var21.method1487()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1523()) {
                    var24 = 16711680;
                    if (var21.method1487()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1489()) {
                    if (var21.method1487()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1487()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class49.field426 >= var17 && class49.field418 >= var16 && class49.field426 < var6 + var17 && class49.field418 < var7 + var16 && var22) {
                    field1138 = var20;
                    Statics.field470[var25].method5473(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field470[var25].method5450(var17, var16);
                }
                if (Statics.field105 != null) {
                    Statics.field105[(var21.method1487() ? 8 : 0) + var21.field953].method5430(var17 + 29, var16);
                }
                arg0.method5134(Integer.toString(var21.field961), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method5134(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method5109(Statics.field1915[field1138].field965) + 6;
                int var27 = arg1.field3714 + 8;
                class315.method5400(class49.field426 - var26 / 2, class49.field418 + 20 + 5, var26, var27, 16777120);
                class315.method5343(class49.field426 - var26 / 2, class49.field418 + 20 + 5, var26, var27, 0);
                arg1.method5134(Statics.field1915[field1138].field965, class49.field426, class49.field418 + 20 + 5 + arg1.field3714 + 4, 0, -1);
            }
        }
        Statics.field456.method731(0, 0);
    }

    @ObfuscatedName("en.u(Laa;I)V")
    public static void method2970(class48 arg0) {
        if (class49.field432 != 1 && Statics.field58 || class49.field432 != 4) {
            return;
        }
        int var1 = field1105 + 280;
        if (class49.field433 >= var1 && class49.field433 <= var1 + 14 && class49.field438 >= 4 && class49.field438 <= 18) {
            class66.method285(0, 0);
            return;
        }
        if (class49.field433 >= var1 + 15 && class49.field433 <= var1 + 80 && class49.field438 >= 4 && class49.field438 <= 18) {
            class66.method285(0, 1);
            return;
        }
        int var2 = field1105 + 390;
        if (class49.field433 >= var2 && class49.field433 <= var2 + 14 && class49.field438 >= 4 && class49.field438 <= 18) {
            class66.method285(1, 0);
            return;
        }
        if (class49.field433 >= var2 + 15 && class49.field433 <= var2 + 80 && class49.field438 >= 4 && class49.field438 <= 18) {
            class66.method285(1, 1);
            return;
        }
        int var3 = field1105 + 500;
        if (class49.field433 >= var3 && class49.field433 <= var3 + 14 && class49.field438 >= 4 && class49.field438 <= 18) {
            class66.method285(2, 0);
            return;
        }
        if (class49.field433 >= var3 + 15 && class49.field433 <= var3 + 80 && class49.field438 >= 4 && class49.field438 <= 18) {
            class66.method285(2, 1);
            return;
        }
        int var4 = field1105 + 610;
        if (class49.field433 >= var4 && class49.field433 <= var4 + 14 && class49.field438 >= 4 && class49.field438 <= 18) {
            class66.method285(3, 0);
            return;
        }
        if (class49.field433 >= var4 + 15 && class49.field433 <= var4 + 80 && class49.field438 >= 4 && class49.field438 <= 18) {
            class66.method285(3, 1);
            return;
        }
        if (class49.field433 >= field1105 + 708 && class49.field438 >= 4 && class49.field433 <= field1105 + 708 + 50 && class49.field438 <= 20) {
            field1137 = false;
            Statics.field1108.method5450(field1105, 0);
            Statics.field225.method5450(field1105 + 382, 0);
            Statics.field1109.method5430(field1105 + 382 - Statics.field1109.field3787 / 2, 18);
            return;
        }
        if (field1138 == -1) {
            return;
        }
        class66 var5 = Statics.field1915[field1138];
        method5066(var5);
        field1137 = false;
        Statics.field1108.method5450(field1105, 0);
        Statics.field225.method5450(field1105 + 382, 0);
        Statics.field1109.method5430(field1105 + 382 - Statics.field1109.field3787 / 2, 18);
        return;
    }

    @ObfuscatedName("kf.i(Lbb;I)V")
    public static void method5066(class66 arg0) {
        if (arg0.method1487() != client.field629) {
            client.field629 = arg0.method1487();
            boolean var1 = arg0.method1487();
            if (Statics.field32 != var1) {
                class270.method281();
                Statics.field32 = var1;
            }
        }
        Statics.field2 = arg0.field964;
        client.field677 = arg0.field961;
        client.field727 = arg0.field962;
        Statics.field2112 = client.field597 == 0 ? 43594 : arg0.field961 + 40000;
        Statics.field102 = client.field597 == 0 ? 443 : arg0.field961 + 50000;
        Statics.field92 = Statics.field2112;
    }
}
