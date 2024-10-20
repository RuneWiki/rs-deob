package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.Random;

@ObfuscatedName("cj")
public class class95 {

    @ObfuscatedName("cj.l")
    public static int field1209 = 0;

    @ObfuscatedName("cj.w")
    public static int field1216 = field1209 + 202;

    @ObfuscatedName("cj.d")
    public static int field1241 = 10;

    @ObfuscatedName("cj.a")
    public static String field1234 = "";

    @ObfuscatedName("cj.af")
    public static int field1217 = -1;

    @ObfuscatedName("cj.ay")
    public static int field1218 = 1;

    @ObfuscatedName("cj.au")
    public static int field1221 = 0;

    @ObfuscatedName("cj.ai")
    public static String field1222 = "";

    @ObfuscatedName("cj.ax")
    public static String field1223 = "";

    @ObfuscatedName("cj.ag")
    public static String field1225 = "";

    @ObfuscatedName("cj.aq")
    public static String field1243 = "";

    @ObfuscatedName("cj.aw")
    public static String field1226 = "";

    @ObfuscatedName("cj.an")
    public static String field1233 = "";

    @ObfuscatedName("cj.al")
    public static boolean field1231 = false;

    @ObfuscatedName("cj.ap")
    public static boolean field1230 = false;

    @ObfuscatedName("cj.bf")
    public static boolean field1228 = true;

    @ObfuscatedName("cj.bp")
    public static int field1232 = 0;

    @ObfuscatedName("cj.bg")
    public static String field1220 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cj.bc")
    public static String field1236 = "1234567890";

    @ObfuscatedName("cj.bl")
    public static boolean field1240 = false;

    @ObfuscatedName("cj.by")
    public static int field1237 = -1;

    @ObfuscatedName("cj.bq")
    public static int field1238 = 0;

    @ObfuscatedName("cj.bv")
    public static int field1239 = 0;

    @ObfuscatedName("cj.bs")
    public static long field1224;

    @ObfuscatedName("cj.bd")
    public static long field1242;

    static {
        new DecimalFormat("##0.00");
        new class172();
        field1224 = -1L;
        field1242 = -1L;
    }

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cw.f(I)I")
    public static int method1975() {
        return 12;
    }

    @ObfuscatedName("cx.b(Liw;Liw;ZII)V")
    public static void method1955(class245 arg0, class245 arg1, boolean arg2, int arg3) {
        if (!Statics.field1208) {
            field1221 = arg3;
            class332.method5648();
            byte[] var4 = arg0.method3938("title.jpg", "");
            Statics.field1211 = class59.method586(var4);
            Statics.field1212 = Statics.field1211.method5748();
            method3993(arg1, client.field682);
            Statics.field545 = class337.method792(arg1, "titlebox", "");
            Statics.field1210 = class337.method792(arg1, "titlebutton", "");
            int var5 = arg1.method3923("runes");
            int var6 = arg1.method3924(var5, "");
            class335[] var7 = class337.method3244(arg1, var5, var6);
            Statics.field3577 = var7;
            int var8 = arg1.method3923("title_mute");
            int var9 = arg1.method3924(var8, "");
            class335[] var10 = class337.method3244(arg1, var8, var9);
            Statics.field3832 = var10;
            Statics.field1213 = class337.method792(arg1, "options_radio_buttons,0", "");
            Statics.field584 = class337.method792(arg1, "options_radio_buttons,4", "");
            Statics.field1214 = class337.method792(arg1, "options_radio_buttons,2", "");
            Statics.field440 = class337.method792(arg1, "options_radio_buttons,6", "");
            Statics.field2577 = Statics.field1213.field3902;
            Statics.field2781 = Statics.field1213.field3903;
            Statics.field1215 = new class82(Statics.field3577);
            if (arg2) {
                field1226 = "";
                field1233 = "";
            }
            Statics.field2036 = 0;
            Statics.field3347 = "";
            field1228 = true;
            field1240 = false;
            if (Statics.field108.field1082) {
                class207.method2868(2);
            } else {
                class247 var11 = Statics.field644;
                int var12 = var11.method3923("scape main");
                int var13 = var11.method3924(var12, "");
                class207.field2435 = 1;
                Statics.field126 = var11;
                Statics.field1272 = var12;
                Statics.field2433 = var13;
                Statics.field2434 = 255;
                Statics.field2366 = false;
                Statics.field2512 = 2;
            }
            class248.method291(false);
            Statics.field1208 = true;
            field1209 = (Statics.field567 - 765) / 2;
            field1216 = field1209 + 202;
            Statics.field1201 = field1216 + 180;
            Statics.field1211.method5800(field1209, 0);
            Statics.field1212.method5800(field1209 + 382, 0);
            Statics.field1280.method5734(field1209 + 382 - Statics.field1280.field3902 / 2, 18);
        } else if (arg3 == 4) {
            field1221 = 4;
        }
    }

    @ObfuscatedName("fl.l(ZZI)Lle;")
    public static class335 method3300(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field440 : Statics.field1214) : (arg1 ? Statics.field584 : Statics.field1213);
    }

    @ObfuscatedName("hk.m(I)V")
    public static void method3684() {
        if (field1226 != null && field1226.length() > 0) {
            return;
        }
        if (Statics.field108.field1087 == null) {
            client.field719 = false;
        } else {
            field1226 = Statics.field108.field1087;
            client.field719 = true;
        }
    }

    @ObfuscatedName("iw.z(Liw;IS)V")
    public static void method3993(class245 arg0, int arg1) {
        if ((arg1 & 0x20000000) != 0) {
            Statics.field1280 = class337.method792(arg0, "logo_deadman_mode", "");
        } else if ((arg1 & 0x40000000) == 0) {
            Statics.field1280 = class337.method792(arg0, "logo", "");
        } else {
            Statics.field1280 = class337.method792(arg0, "logo_seasonal_mode", "");
        }
    }

    @ObfuscatedName("g.k(CI)Z")
    public static boolean method219(char arg0) {
        for (int var1 = 0; var1 < field1220.length(); var1++) {
            if (arg0 == field1220.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ei.c(CI)Z")
    public static boolean method2947(char arg0) {
        return field1220.indexOf(arg0) != -1;
    }

    @ObfuscatedName("cx.u(ZI)V")
    public static void method1954(boolean arg0) {
        field1223 = class234.field3000;
        field1225 = class234.field3001;
        field1243 = class234.field2791;
        field1221 = 2;
        if (arg0) {
            field1233 = "";
        }
        method3684();
        if (client.field719 && field1226 != null && field1226.length() > 0) {
            field1232 = 1;
        } else {
            field1232 = 0;
        }
    }

    @ObfuscatedName("l.t(B)V")
    public static void method23() {
        field1226 = field1226.trim();
        if (field1226.length() == 0) {
            method197(class234.field3052, class234.field3053, class234.field3054);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method1965("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field3742, var4.field3741, 1000 - var4.field3741);
                if (var5 == -1) {
                    var4.field3741 = 0;
                    long var8 = var4.method5186();
                    var6 = var8;
                    break;
                }
                var4.field3741 += var5;
                if (var4.field3741 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var39) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = field1226;
            Random var15 = new Random();
            class311 var16 = new class311(128);
            class311 var17 = new class311(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method5203(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method5166(var15.nextInt());
            }
            var16.method5166(var18[0]);
            var16.method5166(var18[1]);
            var16.method5168(var6);
            var16.method5168(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method5166(var15.nextInt());
            }
            var16.method5220(class90.field1167, class90.field1168);
            var17.method5203(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method5166(var15.nextInt());
            }
            var17.method5168(var15.nextLong());
            var17.method5361(var15.nextLong());
            client.method3473(var17);
            var17.method5168(var15.nextLong());
            var17.method5220(class90.field1167, class90.field1168);
            int var22 = class311.method3740(var14);
            if (var22 % 8 != 0) {
                var22 += 8 - var22 % 8;
            }
            class311 var23 = new class311(var22);
            var23.method5355(var14);
            var23.field3741 = var22;
            var23.method5344(var18);
            class311 var24 = new class311(var23.field3741 + var17.field3741 + var16.field3741 + 5);
            var24.method5203(2);
            var24.method5203(var16.field3741);
            var24.method5161(var16.field3742, 0, var16.field3741);
            var24.method5203(var17.field3741);
            var24.method5161(var17.field3742, 0, var17.field3741);
            var24.method5164(var23.field3741);
            var24.method5161(var23.field3742, 0, var23.field3741);
            byte[] var25 = var24.field3742;
            String var26 = class301.method4967(var25, 0, var25.length);
            String var27 = var26;
            byte var34;
            try {
                URL var28 = new URL(client.method1965("services", false) + "m=accountappeal/login.ws");
                URLConnection var29 = var28.openConnection();
                var29.setDoInput(true);
                var29.setDoOutput(true);
                var29.setConnectTimeout(5000);
                OutputStreamWriter var30 = new OutputStreamWriter(var29.getOutputStream());
                var30.write("data2=" + class351.method3491(var27) + "&dest=" + class351.method3491("passwordchoice.ws"));
                var30.flush();
                InputStream var31 = var29.getInputStream();
                class311 var32 = new class311(new byte[1000]);
                while (true) {
                    int var33 = var31.read(var32.field3742, var32.field3741, 1000 - var32.field3741);
                    if (var33 == -1) {
                        var30.close();
                        var31.close();
                        String var35 = new String(var32.field3742);
                        if (var35.startsWith("OFFLINE")) {
                            var34 = 4;
                        } else if (var35.startsWith("WRONG")) {
                            var34 = 7;
                        } else if (var35.startsWith("RELOAD")) {
                            var34 = 3;
                        } else if (var35.startsWith("Not permitted for social network accounts.")) {
                            var34 = 6;
                        } else {
                            var32.method5200(var18);
                            while (var32.field3741 > 0 && var32.field3742[var32.field3741 - 1] == 0) {
                                var32.field3741--;
                            }
                            String var36 = new String(var32.field3742, 0, var32.field3741);
                            if (class90.method1687(var36)) {
                                class61.method2948(var36, true, false);
                                var34 = 2;
                            } else {
                                var34 = 5;
                            }
                        }
                        break;
                    }
                    var32.field3741 += var33;
                    if (var32.field3741 >= 1000) {
                        var34 = 5;
                        break;
                    }
                }
            } catch (Throwable var38) {
                var38.printStackTrace();
                var34 = 5;
            }
            var13 = var34;
        }
        switch(var13) {
            case 2:
                method197(class234.field3055, class234.field3056, class234.field3057);
                field1221 = 6;
                break;
            case 3:
                method197(class234.field3058, class234.field3059, class234.field3060);
                break;
            case 4:
                method197(class234.field2823, class234.field3062, class234.field3024);
                break;
            case 5:
                method197(class234.field3064, class234.field3065, class234.field2865);
                break;
            case 6:
                method197(class234.field3076, class234.field2873, class234.field2837);
                break;
            case 7:
                method197(class234.field2838, class234.field2993, class234.field3072);
        }
    }

    @ObfuscatedName("bo.e(Lkq;Lkq;Lkq;B)V")
    public static void method817(class306 arg0, class306 arg1, class306 arg2) {
        field1209 = (Statics.field567 - 765) / 2;
        field1216 = field1209 + 202;
        Statics.field1201 = field1216 + 180;
        if (field1240) {
            if (Statics.field3349 == null) {
                Statics.field3349 = class337.method4268(Statics.field96, "sl_back", "");
            }
            if (Statics.field1915 == null) {
                class247 var3 = Statics.field96;
                int var4 = var3.method3923("sl_flags");
                int var5 = var3.method3924(var4, "");
                class335[] var6 = class337.method3244(var3, var4, var5);
                Statics.field1915 = var6;
            }
            if (Statics.field3688 == null) {
                class247 var7 = Statics.field96;
                int var8 = var7.method3923("sl_arrows");
                int var9 = var7.method3924(var8, "");
                class335[] var10 = class337.method3244(var7, var8, var9);
                Statics.field3688 = var10;
            }
            if (Statics.field1967 == null) {
                class247 var11 = Statics.field96;
                int var12 = var11.method3923("sl_stars");
                int var13 = var11.method3924(var12, "");
                class335[] var14 = class337.method3244(var11, var12, var13);
                Statics.field1967 = var14;
            }
            if (Statics.field3855 == null) {
                Statics.field3855 = class337.method792(Statics.field96, "leftarrow", "");
            }
            if (Statics.field3593 == null) {
                Statics.field3593 = class337.method792(Statics.field96, "rightarrow", "");
            }
            class332.method5652(field1209, 23, 765, 480, 0);
            class332.method5653(field1209, 0, 125, 23, 12425273, 9135624);
            class332.method5653(field1209 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method5036(class234.field2973, field1209 + 62, 15, 0, -1);
            if (Statics.field1967 != null) {
                Statics.field1967[1].method5734(field1209 + 140, 1);
                arg1.method5060(class234.field2984, field1209 + 152, 10, 16777215, -1);
                Statics.field1967[0].method5734(field1209 + 140, 12);
                arg1.method5060(class234.field3079, field1209 + 152, 21, 16777215, -1);
            }
            if (Statics.field3688 != null) {
                int var15 = field1209 + 280;
                if (class81.field1050[0] == 0 && class81.field1048[0] == 0) {
                    Statics.field3688[2].method5734(var15, 4);
                } else {
                    Statics.field3688[0].method5734(var15, 4);
                }
                if (class81.field1050[0] == 0 && class81.field1048[0] == 1) {
                    Statics.field3688[3].method5734(var15 + 15, 4);
                } else {
                    Statics.field3688[1].method5734(var15 + 15, 4);
                }
                arg0.method5060(class234.field3067, var15 + 32, 17, 16777215, -1);
                int var16 = field1209 + 390;
                if (class81.field1050[0] == 1 && class81.field1048[0] == 0) {
                    Statics.field3688[2].method5734(var16, 4);
                } else {
                    Statics.field3688[0].method5734(var16, 4);
                }
                if (class81.field1050[0] == 1 && class81.field1048[0] == 1) {
                    Statics.field3688[3].method5734(var16 + 15, 4);
                } else {
                    Statics.field3688[1].method5734(var16 + 15, 4);
                }
                arg0.method5060(class234.field3081, var16 + 32, 17, 16777215, -1);
                int var17 = field1209 + 500;
                if (class81.field1050[0] == 2 && class81.field1048[0] == 0) {
                    Statics.field3688[2].method5734(var17, 4);
                } else {
                    Statics.field3688[0].method5734(var17, 4);
                }
                if (class81.field1050[0] == 2 && class81.field1048[0] == 1) {
                    Statics.field3688[3].method5734(var17 + 15, 4);
                } else {
                    Statics.field3688[1].method5734(var17 + 15, 4);
                }
                arg0.method5060(class234.field3082, var17 + 32, 17, 16777215, -1);
                int var18 = field1209 + 610;
                if (class81.field1050[0] == 3 && class81.field1048[0] == 0) {
                    Statics.field3688[2].method5734(var18, 4);
                } else {
                    Statics.field3688[0].method5734(var18, 4);
                }
                if (class81.field1050[0] == 3 && class81.field1048[0] == 1) {
                    Statics.field3688[3].method5734(var18 + 15, 4);
                } else {
                    Statics.field3688[1].method5734(var18 + 15, 4);
                }
                arg0.method5060(class234.field3083, var18 + 32, 17, 16777215, -1);
            }
            class332.method5652(field1209 + 708, 4, 50, 16, 0);
            arg1.method5036(class234.field2954, field1209 + 708 + 25, 16, 16777215, -1);
            field1237 = -1;
            if (Statics.field3349 != null) {
                byte var19 = 88;
                byte var20 = 19;
                int var21 = 765 / (var19 + 1) - 1;
                int var22 = 480 / (var20 + 1);
                int var23;
                int var24;
                do {
                    var23 = var22;
                    var24 = var21;
                    if ((var21 - 1) * var22 >= class81.field1046) {
                        var21--;
                    }
                    if ((var22 - 1) * var21 >= class81.field1046) {
                        var22--;
                    }
                    if ((var22 - 1) * var21 >= class81.field1046) {
                        var22--;
                    }
                } while (var22 != var23 || var21 != var24);
                int var25 = (765 - var19 * var21) / (var21 + 1);
                if (var25 > 5) {
                    var25 = 5;
                }
                int var26 = (480 - var20 * var22) / (var22 + 1);
                if (var26 > 5) {
                    var26 = 5;
                }
                int var27 = (765 - var19 * var21 - (var21 - 1) * var25) / 2;
                int var28 = (480 - var20 * var22 - (var22 - 1) * var26) / 2;
                int var29 = (class81.field1046 + var22 - 1) / var22;
                field1239 = var29 - var21;
                if (Statics.field3855 != null && field1238 > 0) {
                    Statics.field3855.method5734(8, Statics.field1150 / 2 - Statics.field3855.field3903 / 2);
                }
                if (Statics.field3593 != null && field1238 < field1239) {
                    Statics.field3593.method5734(Statics.field567 - Statics.field3593.field3902 - 8, Statics.field1150 / 2 - Statics.field3593.field3903 / 2);
                }
                int var30 = var28 + 23;
                int var31 = field1209 + var27;
                int var32 = 0;
                boolean var33 = false;
                int var34 = field1238;
                for (int var35 = var22 * var34; var35 < class81.field1046 && var34 - field1238 < var21; var35++) {
                    class81 var36 = Statics.field3829[var35];
                    boolean var37 = true;
                    String var38 = Integer.toString(var36.field1053);
                    if (var36.field1053 == -1) {
                        var38 = class234.field3084;
                        var37 = false;
                    } else if (var36.field1053 > 1980) {
                        var38 = class234.field3085;
                        var37 = false;
                    }
                    int var39 = 0;
                    byte var40;
                    if (var36.method1696()) {
                        if (var36.method1725()) {
                            var40 = 7;
                        } else {
                            var40 = 6;
                        }
                    } else if (var36.method1695()) {
                        var39 = 16711680;
                        if (var36.method1725()) {
                            var40 = 5;
                        } else {
                            var40 = 4;
                        }
                    } else if (var36.method1697()) {
                        if (var36.method1725()) {
                            var40 = 9;
                        } else {
                            var40 = 8;
                        }
                    } else if (var36.method1693()) {
                        if (var36.method1725()) {
                            var40 = 3;
                        } else {
                            var40 = 2;
                        }
                    } else if (var36.method1725()) {
                        var40 = 1;
                    } else {
                        var40 = 0;
                    }
                    if (class64.field510 >= var31 && class64.field514 >= var30 && class64.field510 < var19 + var31 && class64.field514 < var20 + var30 && var37) {
                        field1237 = var35;
                        Statics.field3349[var40].method5762(var31, var30, 128, 16777215);
                        var33 = true;
                    } else {
                        Statics.field3349[var40].method5800(var31, var30);
                    }
                    if (Statics.field1915 != null) {
                        Statics.field1915[(var36.method1725() ? 8 : 0) + var36.field1044].method5734(var31 + 29, var30);
                    }
                    arg0.method5036(Integer.toString(var36.field1049), var31 + 15, var20 / 2 + var30 + 5, var39, -1);
                    arg1.method5036(var38, var31 + 60, var20 / 2 + var30 + 5, 268435455, -1);
                    var30 += var20 + var26;
                    var32++;
                    if (var32 >= var22) {
                        var30 = var28 + 23;
                        var31 += var19 + var25;
                        var32 = 0;
                        var34++;
                    }
                }
                if (var33) {
                    int var41 = arg1.method5028(Statics.field3829[field1237].field1054) + 6;
                    int var42 = arg1.field3714 + 8;
                    int var43 = class64.field514 + 25;
                    if (var42 + var43 > 480) {
                        var43 = class64.field514 - 25 - var42;
                    }
                    class332.method5652(class64.field510 - var41 / 2, var43, var41, var42, 16777120);
                    class332.method5656(class64.field510 - var41 / 2, var43, var41, var42, 0);
                    arg1.method5036(Statics.field3829[field1237].field1054, class64.field510, arg1.field3714 + var43 + 4, 0, -1);
                }
            }
            Statics.field119.method828(0, 0);
            return;
        }
        Statics.field1211.method5800(field1209, 0);
        Statics.field1212.method5800(field1209 + 382, 0);
        Statics.field1280.method5734(field1209 + 382 - Statics.field1280.field3902 / 2, 18);
        if (client.field689 == 0 || client.field689 == 5) {
            byte var44 = 20;
            arg0.method5036(class234.field2999, field1216 + 180, 245 - var44, 16777215, -1);
            int var45 = 253 - var44;
            class332.method5656(field1216 + 180 - 152, var45, 304, 34, 9179409);
            class332.method5656(field1216 + 180 - 151, var45 + 1, 302, 32, 0);
            class332.method5652(field1216 + 180 - 150, var45 + 2, field1241 * 3, 30, 9179409);
            class332.method5652(field1241 * 3 + (field1216 + 180 - 150), var45 + 2, 300 - field1241 * 3, 30, 0);
            arg0.method5036(field1234, field1216 + 180, 276 - var44, 16777215, -1);
        }
        if (client.field689 == 20) {
            Statics.field545.method5734(field1216 + 180 - Statics.field545.field3902 / 2, 271 - Statics.field545.field3903 / 2);
            short var46 = 201;
            arg0.method5036(field1223, field1216 + 180, var46, 16776960, 0);
            int var122 = var46 + 15;
            arg0.method5036(field1225, field1216 + 180, var122, 16776960, 0);
            int var123 = var122 + 15;
            arg0.method5036(field1243, field1216 + 180, var123, 16776960, 0);
            int var124 = var123 + 15;
            int var125 = var124 + 7;
            if (field1221 != 4) {
                arg0.method5060(class234.field3027, field1216 + 180 - 110, var125, 16777215, 0);
                short var47 = 200;
                String var48 = Statics.field108.field1088 ? class302.method3424(field1226) : field1226;
                String var49;
                for (var49 = var48; arg0.method5028(var49) > var47; var49 = var49.substring(0, var49.length() - 1)) {
                }
                arg0.method5060(class307.method5032(var49), field1216 + 180 - 70, var125, 16777215, 0);
                var122 = var125 + 15;
                String var50;
                for (var50 = class302.method3424(field1233); arg0.method5028(var50) > var47; var50 = var50.substring(1)) {
                }
                arg0.method5060(class234.field3028 + var50, field1216 + 180 - 108, var122, 16777215, 0);
                var122 += 15;
            }
        }
        if (client.field689 == 10 || client.field689 == 11) {
            Statics.field545.method5734(field1216, 171);
            if (field1221 == 0) {
                short var51 = 251;
                arg0.method5036(class234.field3030, field1216 + 180, var51, 16776960, 0);
                int var126 = var51 + 30;
                int var52 = field1216 + 180 - 80;
                short var53 = 291;
                Statics.field1210.method5734(var52 - 73, var53 - 20);
                arg0.method5037(class234.field2833, var52 - 73, var53 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var54 = field1216 + 180 + 80;
                Statics.field1210.method5734(var54 - 73, var53 - 20);
                arg0.method5037(class234.field3046, var54 - 73, var53 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1221 == 1) {
                arg0.method5036(field1222, field1216 + 180, 201, 16776960, 0);
                short var55 = 236;
                arg0.method5036(field1223, field1216 + 180, var55, 16777215, 0);
                int var127 = var55 + 15;
                arg0.method5036(field1225, field1216 + 180, var127, 16777215, 0);
                int var128 = var127 + 15;
                arg0.method5036(field1243, field1216 + 180, var128, 16777215, 0);
                int var129 = var128 + 15;
                int var56 = field1216 + 180 - 80;
                short var57 = 321;
                Statics.field1210.method5734(var56 - 73, var57 - 20);
                arg0.method5036(class234.field3050, var56, var57 + 5, 16777215, 0);
                int var58 = field1216 + 180 + 80;
                Statics.field1210.method5734(var58 - 73, var57 - 20);
                arg0.method5036(class234.field2954, var58, var57 + 5, 16777215, 0);
            } else if (field1221 == 2) {
                short var59 = 201;
                arg0.method5036(field1223, Statics.field1201, var59, 16776960, 0);
                int var130 = var59 + 15;
                arg0.method5036(field1225, Statics.field1201, var130, 16776960, 0);
                int var131 = var130 + 15;
                arg0.method5036(field1243, Statics.field1201, var131, 16776960, 0);
                int var132 = var131 + 15;
                int var133 = var132 + 7;
                arg0.method5060(class234.field3027, Statics.field1201 - 110, var133, 16777215, 0);
                short var60 = 200;
                String var61 = Statics.field108.field1088 ? class302.method3424(field1226) : field1226;
                String var62;
                for (var62 = var61; arg0.method5028(var62) > var60; var62 = var62.substring(1)) {
                }
                arg0.method5060(class307.method5032(var62) + (field1232 == 0 & client.field863 % 40 < 20 ? class91.method1479(16776960) + class91.field1185 : ""), Statics.field1201 - 70, var133, 16777215, 0);
                var130 = var133 + 15;
                String var63;
                for (var63 = class302.method3424(field1233); arg0.method5028(var63) > var60; var63 = var63.substring(1)) {
                }
                arg0.method5060(class234.field3028 + var63 + (field1232 == 1 & client.field863 % 40 < 20 ? class91.method1479(16776960) + class91.field1185 : ""), Statics.field1201 - 108, var130, 16777215, 0);
                var130 += 15;
                short var64 = 277;
                int var65 = Statics.field1201 + -117;
                class335 var66 = method3300(client.field719, field1231);
                var66.method5734(var65, var64);
                int var67 = var66.field3902 + 5 + var65;
                arg1.method5060(class234.field2809, var67, var64 + 13, 16776960, 0);
                int var68 = Statics.field1201 + 24;
                class335 var69 = method3300(Statics.field108.field1088, field1230);
                var69.method5734(var68, var64);
                int var70 = var69.field3902 + 5 + var68;
                arg1.method5060(class234.field3036, var70, var64 + 13, 16776960, 0);
                int var134 = var64 + 15;
                int var71 = Statics.field1201 - 80;
                short var72 = 321;
                Statics.field1210.method5734(var71 - 73, var72 - 20);
                arg0.method5036(class234.field3033, var71, var72 + 5, 16777215, 0);
                int var73 = Statics.field1201 + 80;
                Statics.field1210.method5734(var73 - 73, var72 - 20);
                arg0.method5036(class234.field2954, var73, var72 + 5, 16777215, 0);
                short var74 = 357;
                switch(field1218) {
                    case 2:
                        Statics.field2003 = class234.field3048;
                        break;
                    default:
                        Statics.field2003 = class234.field3063;
                }
                Statics.field1164 = new class330(Statics.field1201, var74, arg1.method5028(Statics.field2003), 11);
                Statics.field1090 = new class330(Statics.field1201, var74, arg1.method5028(class234.field2937), 11);
                arg1.method5036(Statics.field2003, Statics.field1201, var74, 16777215, 0);
            } else if (field1221 == 3) {
                short var75 = 201;
                arg0.method5036(class234.field3037, field1216 + 180, var75, 16776960, 0);
                int var135 = var75 + 20;
                arg1.method5036(class234.field3038, field1216 + 180, var135, 16776960, 0);
                int var136 = var135 + 15;
                arg1.method5036(class234.field2975, field1216 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                int var76 = field1216 + 180;
                short var77 = 276;
                Statics.field1210.method5734(var76 - 73, var77 - 20);
                arg2.method5036(class234.field3040, var76, var77 + 5, 16777215, 0);
                int var78 = field1216 + 180;
                short var79 = 326;
                Statics.field1210.method5734(var78 - 73, var79 - 20);
                arg2.method5036(class234.field2972, var78, var79 + 5, 16777215, 0);
            } else if (field1221 == 4) {
                arg0.method5036(class234.field3016, field1216 + 180, 201, 16776960, 0);
                short var80 = 236;
                arg0.method5036(field1223, field1216 + 180, var80, 16777215, 0);
                int var138 = var80 + 15;
                arg0.method5036(field1225, field1216 + 180, var138, 16777215, 0);
                int var139 = var138 + 15;
                arg0.method5036(field1243, field1216 + 180, var139, 16777215, 0);
                int var140 = var139 + 15;
                arg0.method5060(class234.field3029 + class302.method3424(Statics.field3347) + (client.field863 % 40 < 20 ? class91.method1479(16776960) + class91.field1185 : ""), field1216 + 180 - 108, var140, 16777215, 0);
                int var141 = var140 - 8;
                arg0.method5060(class234.field2794, field1216 + 180 - 9, var141, 16776960, 0);
                int var142 = var141 + 15;
                arg0.method5060(class234.field2795, field1216 + 180 - 9, var142, 16776960, 0);
                int var81 = field1216 + 180 - 9 + arg0.method5028(class234.field2795) + 15;
                int var82 = var142 - arg0.field3714;
                class335 var83;
                if (field1228) {
                    var83 = Statics.field1214;
                } else {
                    var83 = Statics.field1213;
                }
                var83.method5734(var81, var82);
                var138 = var142 + 15;
                int var84 = field1216 + 180 - 80;
                short var85 = 321;
                Statics.field1210.method5734(var84 - 73, var85 - 20);
                arg0.method5036(class234.field3050, var84, var85 + 5, 16777215, 0);
                int var86 = field1216 + 180 + 80;
                Statics.field1210.method5734(var86 - 73, var85 - 20);
                arg0.method5036(class234.field2954, var86, var85 + 5, 16777215, 0);
                arg1.method5036(class234.field3017, field1216 + 180, var85 + 36, 255, 0);
            } else if (field1221 == 5) {
                arg0.method5036(class234.field2817, field1216 + 180, 201, 16776960, 0);
                short var87 = 221;
                arg2.method5036(field1223, field1216 + 180, var87, 16776960, 0);
                int var143 = var87 + 15;
                arg2.method5036(field1225, field1216 + 180, var143, 16776960, 0);
                int var144 = var143 + 15;
                arg2.method5036(field1243, field1216 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                int var146 = var145 + 14;
                arg0.method5060(class234.field2943, field1216 + 180 - 145, var146, 16777215, 0);
                short var88 = 174;
                String var89 = Statics.field108.field1088 ? class302.method3424(field1226) : field1226;
                String var90;
                for (var90 = var89; arg0.method5028(var90) > var88; var90 = var90.substring(1)) {
                }
                arg0.method5060(class307.method5032(var90) + (client.field863 % 40 < 20 ? class91.method1479(16776960) + class91.field1185 : ""), field1216 + 180 - 34, var146, 16777215, 0);
                var143 = var146 + 15;
                int var91 = field1216 + 180 - 80;
                short var92 = 321;
                Statics.field1210.method5734(var91 - 73, var92 - 20);
                arg0.method5036(class234.field3044, var91, var92 + 5, 16777215, 0);
                int var93 = field1216 + 180 + 80;
                Statics.field1210.method5734(var93 - 73, var92 - 20);
                arg0.method5036(class234.field3035, var93, var92 + 5, 16777215, 0);
                short var94 = 356;
                arg1.method5036(class234.field2937, Statics.field1201, var94, 268435455, 0);
            } else if (field1221 == 6) {
                short var95 = 201;
                arg0.method5036(field1223, field1216 + 180, var95, 16776960, 0);
                int var147 = var95 + 15;
                arg0.method5036(field1225, field1216 + 180, var147, 16776960, 0);
                int var148 = var147 + 15;
                arg0.method5036(field1243, field1216 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                int var96 = field1216 + 180;
                short var97 = 321;
                Statics.field1210.method5734(var96 - 73, var97 - 20);
                arg0.method5036(class234.field3035, var96, var97 + 5, 16777215, 0);
            } else if (field1221 == 7) {
                short var98 = 216;
                arg0.method5036(class234.field3073, field1216 + 180, var98, 16776960, 0);
                int var150 = var98 + 15;
                arg2.method5036(class234.field3006, field1216 + 180, var150, 16776960, 0);
                int var151 = var150 + 15;
                arg2.method5036(class234.field3075, field1216 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                int var99 = field1216 + 180 - 80;
                short var100 = 321;
                Statics.field1210.method5734(var99 - 73, var100 - 20);
                arg0.method5036(class234.field2917, var99, var100 + 5, 16777215, 0);
                int var101 = field1216 + 180 + 80;
                Statics.field1210.method5734(var101 - 73, var100 - 20);
                arg0.method5036(class234.field3035, var101, var100 + 5, 16777215, 0);
            } else if (field1221 == 8) {
                short var102 = 216;
                arg0.method5036(class234.field2923, field1216 + 180, var102, 16776960, 0);
                int var153 = var102 + 15;
                arg2.method5036(class234.field2924, field1216 + 180, var153, 16776960, 0);
                int var154 = var153 + 15;
                arg2.method5036(class234.field2925, field1216 + 180, var154, 16776960, 0);
                int var155 = var154 + 15;
                int var103 = field1216 + 180 - 80;
                short var104 = 321;
                Statics.field1210.method5734(var103 - 73, var104 - 20);
                arg0.method5036(class234.field2926, var103, var104 + 5, 16777215, 0);
                int var105 = field1216 + 180 + 80;
                Statics.field1210.method5734(var105 - 73, var104 - 20);
                arg0.method5036(class234.field3035, var105, var104 + 5, 16777215, 0);
            } else if (field1221 == 12) {
                short var106 = 201;
                String var107 = "";
                String var108 = "";
                String var109 = "";
                switch(field1217) {
                    case 0:
                        var107 = class234.field2969;
                        var108 = class234.field2840;
                        var109 = class234.field3045;
                        break;
                    case 1:
                        var107 = class234.field2878;
                        var108 = class234.field3047;
                        var109 = class234.field2880;
                        break;
                    default:
                        method1954(false);
                }
                arg0.method5036(var107, field1216 + 180, var106, 16776960, 0);
                int var156 = var106 + 15;
                arg2.method5036(var108, field1216 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                arg2.method5036(var109, field1216 + 180, var157, 16776960, 0);
                int var158 = var157 + 15;
                int var110 = field1216 + 180;
                short var111 = 276;
                Statics.field1210.method5734(var110 - 73, var111 - 20);
                arg0.method5036(class234.field2807, var110, var111 + 5, 16777215, 0);
                int var112 = field1216 + 180;
                short var113 = 326;
                Statics.field1210.method5734(var112 - 73, var113 - 20);
                arg0.method5036(class234.field3035, var112, var113 + 5, 16777215, 0);
            } else if (field1221 == 24) {
                short var114 = 221;
                arg0.method5036(field1223, field1216 + 180, var114, 16777215, 0);
                int var159 = var114 + 15;
                arg0.method5036(field1225, field1216 + 180, var159, 16777215, 0);
                int var160 = var159 + 15;
                arg0.method5036(field1243, field1216 + 180, var160, 16777215, 0);
                int var161 = var160 + 15;
                int var115 = field1216 + 180;
                short var116 = 301;
                Statics.field1210.method5734(var115 - 73, var116 - 20);
                arg0.method5036(class234.field2789, var115, var116 + 5, 16777215, 0);
            }
        }
        if (client.field689 >= 10) {
            int[] var117 = new int[4];
            class332.method5646(var117);
            class332.method5644(field1209, 0, field1209 + 765, Statics.field1150);
            Statics.field1215.method1735(field1209 - 22, client.field863);
            Statics.field1215.method1735(field1209 + 765 + 22 - 128, client.field863);
            class332.method5647(var117);
        }
        Statics.field3832[Statics.field108.field1082 ? 1 : 0].method5734(field1209 + 765 - 40, 463);
        if (client.field689 <= 5 || Statics.field3691 != class200.field2384) {
            return;
        }
        if (Statics.field524 == null) {
            Statics.field524 = class337.method792(Statics.field96, "sl_button", "");
            return;
        }
        int var118 = field1209 + 5;
        short var119 = 463;
        byte var120 = 100;
        byte var121 = 35;
        Statics.field524.method5734(var118, var119);
        arg0.method5036(class234.field2854 + " " + client.field817, var120 / 2 + var118, var121 / 2 + var119 - 2, 16777215, 0);
        if (Statics.field3214 == null) {
            arg1.method5036(class234.field3087, var120 / 2 + var118, var121 / 2 + var119 + 12, 16777215, 0);
        } else {
            arg1.method5036(class234.field3086, var120 / 2 + var118, var121 / 2 + var119 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("v.o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method197(String arg0, String arg1, String arg2) {
        field1223 = arg0;
        field1225 = arg1;
        field1243 = arg2;
    }

    @ObfuscatedName("hh.n(Lcf;B)V")
    public static void method3703(class81 arg0) {
        if (arg0.method1725() != client.field684) {
            client.field684 = arg0.method1725();
            boolean var1 = arg0.method1725();
            if (Statics.field1473 != var1) {
                class266.method3475();
                Statics.field1473 = var1;
            }
        }
        if (client.field682 != arg0.field1051) {
            method3993(Statics.field96, arg0.field1051);
        }
        Statics.field2027 = arg0.field1055;
        client.field817 = arg0.field1049;
        client.field682 = arg0.field1051;
        Statics.field2559 = client.field871 == 0 ? 43594 : arg0.field1049 + 40000;
        Statics.field2552 = client.field871 == 0 ? 443 : arg0.field1049 + 50000;
        Statics.field301 = Statics.field2559;
    }

    @ObfuscatedName("az.x(IB)V")
    public static void method352(int arg0) {
        field1221 = 12;
        field1217 = arg0;
    }

    @ObfuscatedName("cu.p(B)V")
    public static void method1978() {
        field1221 = 24;
        method197(class234.field2855, class234.field3022, class234.field3023);
    }
}
