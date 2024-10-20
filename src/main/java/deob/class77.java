package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bo")
public class class77 {

    @ObfuscatedName("bo.i")
    public static int[] field1088 = new int[5];

    @ObfuscatedName("bo.g")
    public static int[][] field1084 = new int[5][5000];

    @ObfuscatedName("bo.d")
    public static int[] field1090 = new int[1000];

    @ObfuscatedName("bo.j")
    public static String[] field1097 = new String[1000];

    @ObfuscatedName("bo.p")
    public static int field1087 = 0;

    @ObfuscatedName("bo.h")
    public static class57[] field1092 = new class57[50];

    @ObfuscatedName("bo.x")
    public static Calendar field1091 = Calendar.getInstance();

    @ObfuscatedName("bo.w")
    public static final String[] field1094 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bo.q")
    public static boolean field1095 = false;

    @ObfuscatedName("bo.z")
    public static boolean field1096 = false;

    @ObfuscatedName("bo.y")
    public static int field1089 = 0;

    @ObfuscatedName("bo.s")
    public static final double field1098 = Math.log(2.0D);

    public class77() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.c(Lbw;I)V")
    public static void method46(class63 arg0) {
        method506(arg0, 500000);
    }

    @ObfuscatedName("au.t(Lbw;IB)V")
    public static void method506(class63 arg0, int arg1) {
        Object[] var2 = arg0.field585;
        class93 var4;
        if (class295.method4852(arg0.field572)) {
            Statics.field135 = (class42) var2[0];
            class243 var3 = class243.method3377(Statics.field135.field366);
            var4 = class93.method3430(arg0.field572, var3.field3214, var3.field3215);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class93.method3160(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field3841 = 0;
        Statics.field604 = 0;
        int var6 = -1;
        int[] var7 = var4.field1267;
        int[] var8 = var4.field1274;
        byte var9 = -1;
        field1087 = 0;
        field1095 = false;
        try {
            Statics.field1085 = new int[var4.field1270];
            int var10 = 0;
            Statics.field1086 = new String[var4.field1271];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field582;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field576;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field574 == null ? -1 : arg0.field574.field2573;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field580;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field574 == null ? -1 : arg0.field574.field2574;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field578 == null ? -1 : arg0.field578.field2573;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field578 == null ? -1 : arg0.field578.field2574;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field579;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field575;
                    }
                    Statics.field1085[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field581;
                    }
                    Statics.field1086[var11++] = var14;
                }
            }
            int var15 = 0;
            field1089 = arg0.field583;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1274[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method1665(var53, var4, var43);
                    switch(var44) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var53 == 0) {
                    field1090[++Statics.field3841 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1090[++Statics.field3841 - 1] = class213.field2534[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class213.field2534[var17] = field1090[--Statics.field3841];
                    client.method3360(var17);
                } else if (var53 == 3) {
                    field1097[++Statics.field604 - 1] = var4.field1268[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field3841 -= 2;
                    if (field1090[Statics.field3841] != field1090[Statics.field3841 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field3841 -= 2;
                    if (field1090[Statics.field3841] == field1090[Statics.field3841 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field3841 -= 2;
                    if (field1090[Statics.field3841] < field1090[Statics.field3841 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field3841 -= 2;
                    if (field1090[Statics.field3841] > field1090[Statics.field3841 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1087 == 0) {
                        return;
                    }
                    class57 var18 = field1092[--field1087];
                    var4 = var18.field523;
                    var7 = var4.field1267;
                    var8 = var4.field1274;
                    var6 = var18.field524;
                    Statics.field1085 = var18.field525;
                    Statics.field1086 = var18.field526;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1090[++Statics.field3841 - 1] = Statics.method122(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class213.method3635(var20, field1090[--Statics.field3841]);
                } else if (var53 == 31) {
                    Statics.field3841 -= 2;
                    if (field1090[Statics.field3841] <= field1090[Statics.field3841 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field3841 -= 2;
                    if (field1090[Statics.field3841] >= field1090[Statics.field3841 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1090[++Statics.field3841 - 1] = Statics.field1085[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field1085[var8[var6]] = field1090[--Statics.field3841];
                } else if (var53 == 35) {
                    field1097[++Statics.field604 - 1] = Statics.field1086[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field1086[var8[var6]] = field1097[--Statics.field604];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field604 -= var21;
                    String var22 = class292.method4919(field1097, Statics.field604, var21);
                    field1097[++Statics.field604 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field3841--;
                } else if (var53 == 39) {
                    Statics.field604--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class93 var24 = class93.method3160(var23);
                    int[] var25 = new int[var24.field1270];
                    String[] var26 = new String[var24.field1271];
                    for (int var27 = 0; var27 < var24.field1272; var27++) {
                        var25[var27] = field1090[Statics.field3841 - var24.field1272 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1273; var28++) {
                        var26[var28] = field1097[Statics.field604 - var24.field1273 + var28];
                    }
                    Statics.field3841 -= var24.field1272;
                    Statics.field604 -= var24.field1273;
                    class57 var29 = new class57();
                    var29.field523 = var4;
                    var29.field524 = var6;
                    var29.field525 = Statics.field1085;
                    var29.field526 = Statics.field1086;
                    field1092[++field1087 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1267;
                    var8 = var24.field1274;
                    var6 = -1;
                    Statics.field1085 = var25;
                    Statics.field1086 = var26;
                } else if (var53 == 42) {
                    field1090[++Statics.field3841 - 1] = Statics.field2408.method2052(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field2408.method2014(var8[var6], field1090[--Statics.field3841]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1090[--Statics.field3841];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1088[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1084[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1090[--Statics.field3841];
                    if (var36 < 0 || var36 >= field1088[var35]) {
                        throw new RuntimeException();
                    }
                    field1090[++Statics.field3841 - 1] = field1084[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field3841 -= 2;
                    int var38 = field1090[Statics.field3841];
                    if (var38 < 0 || var38 >= field1088[var37]) {
                        throw new RuntimeException();
                    }
                    field1084[var37][var38] = field1090[Statics.field3841 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field2408.method2027(var8[var6]);
                    if (var39 == null) {
                        var39 = class225.field2775;
                    }
                    field1097[++Statics.field604 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field2408.method2018(var8[var6], field1097[--Statics.field604]);
                } else if (var53 == 49) {
                    String var40 = Statics.field2408.method2017(var8[var6]);
                    field1097[++Statics.field604 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field2408.method2016(var8[var6], field1097[--Statics.field604]);
                } else if (var53 == 60) {
                    class317 var41 = var4.field1266[var8[var6]];
                    class180 var42 = (class180) var41.method5510((long) field1090[--Statics.field3841]);
                    if (var42 != null) {
                        var6 += var42.field2112;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2115).append(" ");
            for (int var47 = field1087 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1092[var47].field523.field2115).append(" ");
            }
            var46.append("").append(var9);
            Statics.method3817(var46.toString(), var51);
        } finally {
            if (field1095) {
                field1096 = true;
                client.method701();
                field1096 = false;
                field1095 = false;
            }
        }
    }

    @ObfuscatedName("bz.o(ILce;ZI)I")
    public static int method1665(int arg0, class93 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method585(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1925(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method21(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2011(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method3259(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method1153(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method3376(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method4803(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method4416(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method155(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method664(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1925(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method21(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2011(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method3259(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method1153(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method3293(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method2773(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return Statics.method1044(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method2008(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method664(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method3192(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method3072(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method1977(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method3814(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method3612(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method4228(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method2570(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method5472(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3724(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method1638(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method1589(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method1750(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method223(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method2152(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method535(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method3097(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aw.e(ILce;ZI)I")
    public static int method585(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field3841 -= 3;
            int var3 = field1090[Statics.field3841];
            int var4 = field1090[Statics.field3841 + 1];
            int var5 = field1090[Statics.field3841 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class218 var6 = class218.method3666(var3);
            if (var6.field2699 == null) {
                var6.field2699 = new class218[var5 + 1];
            }
            if (var6.field2699.length <= var5) {
                class218[] var7 = new class218[var5 + 1];
                for (int var8 = 0; var8 < var6.field2699.length; var8++) {
                    var7[var8] = var6.field2699[var8];
                }
                var6.field2699 = var7;
            }
            if (var5 > 0 && var6.field2699[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class218 var9 = new class218();
            var9.field2575 = var4;
            var9.field2592 = var9.field2573 = var6.field2573;
            var9.field2574 = var5;
            var9.field2572 = true;
            var6.field2699[var5] = var9;
            if (arg2) {
                Statics.field2332 = var9;
            } else {
                Statics.field2445 = var9;
            }
            client.method4409(var6);
            return 1;
        } else if (arg0 == 101) {
            class218 var10 = arg2 ? Statics.field2332 : Statics.field2445;
            class218 var11 = class218.method3666(var10.field2573);
            var11.field2699[var10.field2574] = null;
            client.method4409(var11);
            return 1;
        } else if (arg0 == 102) {
            class218 var12 = class218.method3666(field1090[--Statics.field3841]);
            var12.field2699 = null;
            client.method4409(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field3841 -= 2;
            int var13 = field1090[Statics.field3841];
            int var14 = field1090[Statics.field3841 + 1];
            class218 var15 = Statics.method3658(var13, var14);
            if (var15 == null || var14 == -1) {
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = 1;
                if (arg2) {
                    Statics.field2332 = var15;
                } else {
                    Statics.field2445 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class218 var16 = class218.method3666(field1090[--Statics.field3841]);
            if (var16 == null) {
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = 1;
                if (arg2) {
                    Statics.field2332 = var16;
                } else {
                    Statics.field2445 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.i(ILce;ZI)I")
    public static int method1925(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1090[--Statics.field3841];
            var4 = class218.method3666(var3);
        } else {
            var4 = arg2 ? Statics.field2332 : Statics.field2445;
        }
        if (arg0 == 1000) {
            Statics.field3841 -= 4;
            var4.field2582 = field1090[Statics.field3841];
            var4.field2715 = field1090[Statics.field3841 + 1];
            var4.field2578 = field1090[Statics.field3841 + 2];
            var4.field2579 = field1090[Statics.field3841 + 3];
            client.method4409(var4);
            Statics.field3618.method1407(var4);
            if (var3 != -1 && var4.field2575 == 0) {
                client.method267(Statics.field248[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field3841 -= 4;
            var4.field2584 = field1090[Statics.field3841];
            var4.field2643 = field1090[Statics.field3841 + 1];
            var4.field2580 = field1090[Statics.field3841 + 2];
            var4.field2581 = field1090[Statics.field3841 + 3];
            client.method4409(var4);
            Statics.field3618.method1407(var4);
            if (var3 != -1 && var4.field2575 == 0) {
                client.method267(Statics.field248[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1090[--Statics.field3841] == 1;
            if (var4.field2679 != var5) {
                var4.field2679 = var5;
                client.method4409(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2713 = field1090[--Statics.field3841] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2682 = field1090[--Statics.field3841] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("o.g(ILce;ZB)I")
    public static int method21(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1090[--Statics.field3841];
            var4 = class218.method3666(var3);
        } else {
            var4 = arg2 ? Statics.field2332 : Statics.field2445;
        }
        if (arg0 == 1100) {
            Statics.field3841 -= 2;
            var4.field2594 = field1090[Statics.field3841];
            if (var4.field2594 > var4.field2596 - var4.field2619) {
                var4.field2594 = var4.field2596 - var4.field2619;
            }
            if (var4.field2594 < 0) {
                var4.field2594 = 0;
            }
            var4.field2622 = field1090[Statics.field3841 + 1];
            if (var4.field2622 > var4.field2597 - var4.field2589) {
                var4.field2622 = var4.field2597 - var4.field2589;
            }
            if (var4.field2622 < 0) {
                var4.field2622 = 0;
            }
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2601 = field1090[--Statics.field3841];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2602 = field1090[--Statics.field3841] == 1;
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2604 = field1090[--Statics.field3841];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2652 = field1090[--Statics.field3841];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2608 = field1090[--Statics.field3841];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2610 = field1090[--Statics.field3841];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2611 = field1090[--Statics.field3841] == 1;
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2616 = 1;
            var4.field2617 = field1090[--Statics.field3841];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field3841 -= 6;
            var4.field2645 = field1090[Statics.field3841];
            var4.field2623 = field1090[Statics.field3841 + 1];
            var4.field2624 = field1090[Statics.field3841 + 2];
            var4.field2625 = field1090[Statics.field3841 + 3];
            var4.field2588 = field1090[Statics.field3841 + 4];
            var4.field2627 = field1090[Statics.field3841 + 5];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1090[--Statics.field3841];
            if (var4.field2620 != var5) {
                var4.field2620 = var5;
                var4.field2701 = 0;
                var4.field2702 = 0;
                client.method4409(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2630 = field1090[--Statics.field3841] == 1;
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1097[--Statics.field604];
            if (!var6.equals(var4.field2634)) {
                var4.field2634 = var6;
                client.method4409(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2633 = field1090[--Statics.field3841];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field3841 -= 3;
            var4.field2637 = field1090[Statics.field3841];
            var4.field2638 = field1090[Statics.field3841 + 1];
            var4.field2636 = field1090[Statics.field3841 + 2];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2639 = field1090[--Statics.field3841] == 1;
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2612 = field1090[--Statics.field3841];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2613 = field1090[--Statics.field3841];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2614 = field1090[--Statics.field3841] == 1;
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2691 = field1090[--Statics.field3841] == 1;
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field3841 -= 2;
            var4.field2596 = field1090[Statics.field3841];
            var4.field2597 = field1090[Statics.field3841 + 1];
            client.method4409(var4);
            if (var3 != -1 && var4.field2575 == 0) {
                client.method267(Statics.field248[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method576(var4.field2573, var4.field2574);
            client.field813 = var4;
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2609 = field1090[--Statics.field3841];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2599 = field1090[--Statics.field3841];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2605 = field1090[--Statics.field3841];
            client.method4409(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1090[--Statics.field3841];
            class324 var8 = (class324) class196.method222(class324.method1685(), var7);
            if (var8 != null) {
                var4.field2603 = var8;
                client.method4409(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1090[--Statics.field3841] == 1;
            var4.field2607 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1090[--Statics.field3841] == 1;
            var4.field2631 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cz.d(ILce;ZB)I")
    public static int method2011(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method3666(field1090[--Statics.field3841]);
        } else {
            var3 = arg2 ? Statics.field2332 : Statics.field2445;
        }
        client.method4409(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field3841 -= 2;
            int var4 = field1090[Statics.field3841];
            int var5 = field1090[Statics.field3841 + 1];
            var3.field2626 = var4;
            var3.field2700 = var5;
            class256 var6 = class256.method4164(var4);
            var3.field2624 = var6.field3450;
            var3.field2625 = var6.field3414;
            var3.field2588 = var6.field3438;
            var3.field2645 = var6.field3416;
            var3.field2623 = var6.field3417;
            var3.field2627 = var6.field3432;
            if (arg0 == 1205) {
                var3.field2632 = 0;
            } else if (arg0 == 1212 | var6.field3418 == 1) {
                var3.field2632 = 1;
            } else {
                var3.field2632 = 2;
            }
            if (var3.field2628 > 0) {
                var3.field2627 = var3.field2627 * 32 / var3.field2628;
            } else if (var3.field2584 > 0) {
                var3.field2627 = var3.field2627 * 32 / var3.field2584;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2616 = 2;
            var3.field2617 = field1090[--Statics.field3841];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2616 = 3;
            var3.field2617 = Statics.field2392.field612.method3696();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fm.l(ILce;ZI)I")
    public static int method3259(int arg0, class93 arg1, boolean arg2) {
        boolean var3 = true;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class218.method3666(field1090[--Statics.field3841]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field2332 : Statics.field2445;
        }
        if (arg0 == 1300) {
            int var5 = field1090[--Statics.field3841] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method3776(var5, field1097[--Statics.field604]);
                return 1;
            } else {
                Statics.field604--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field3841 -= 2;
            int var6 = field1090[Statics.field3841];
            int var7 = field1090[Statics.field3841 + 1];
            var4.field2654 = Statics.method3658(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2708 = field1090[--Statics.field3841] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2655 = field1090[--Statics.field3841];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2656 = field1090[--Statics.field3841];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2593 = field1097[--Statics.field604];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2648 = field1097[--Statics.field604];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2653 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2714 = field1090[--Statics.field3841] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field3841--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field3841 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field1090[Statics.field3841 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field1090[Statics.field3841 + var10];
                        var9[var10 / 2] = (byte) field1090[Statics.field3841 + var10 + 1];
                    }
                }
            } else {
                Statics.field3841 -= 2;
                var8 = new byte[] { (byte) field1090[Statics.field3841] };
                var9 = new byte[] { (byte) field1090[Statics.field3841 + 1] };
            }
            int var11 = field1090[--Statics.field3841] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method4882(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field3841 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field1090[Statics.field3841] };
            byte[] var14 = new byte[] { (byte) field1090[Statics.field3841 + 1] };
            method4882(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field3841 -= 3;
            int var15 = field1090[Statics.field3841] - 1;
            int var16 = field1090[Statics.field3841 + 1];
            int var17 = field1090[Statics.field3841 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method55(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field1090[--Statics.field3841];
            int var20 = field1090[--Statics.field3841];
            method55(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field3841--;
            int var21 = field1090[Statics.field3841] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method3408(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method3408(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jl.j(Lhn;I[B[BI)V")
    public static final void method4882(class218 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2703 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2703 = new byte[11][];
            arg0.field2649 = new byte[11][];
            arg0.field2650 = new int[11];
            arg0.field2561 = new int[11];
        }
        arg0.field2703[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2647 = false;
            for (int var4 = 0; var4 < arg0.field2703.length; var4++) {
                if (arg0.field2703[var4] != null) {
                    arg0.field2647 = true;
                    break;
                }
            }
        } else {
            arg0.field2647 = true;
        }
        arg0.field2649[arg1] = arg3;
    }

    @ObfuscatedName("g.m(Lhn;IIII)V")
    public static final void method55(class218 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2650 == null) {
            throw new RuntimeException();
        }
        arg0.field2650[arg1] = arg2;
        arg0.field2561[arg1] = arg3;
    }

    @ObfuscatedName("gp.p(Lhn;II)V")
    public static final void method3408(class218 arg0, int arg1) {
        if (arg0.field2703 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2712 == null) {
            arg0.field2712 = new int[arg0.field2703.length];
        }
        arg0.field2712[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ba.h(ILce;ZI)I")
    public static int method1153(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method3666(field1090[--Statics.field3841]);
        } else {
            var3 = arg2 ? Statics.field2332 : Statics.field2445;
        }
        String var4 = field1097[--Statics.field604];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1090[--Statics.field3841];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1090[--Statics.field3841];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1097[--Statics.field604];
            } else {
                var7[var8] = Integer.valueOf(field1090[--Statics.field3841]);
            }
        }
        int var9 = field1090[--Statics.field3841];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2684 = var7;
        } else if (arg0 == 1401) {
            var3.field2664 = var7;
        } else if (arg0 == 1402) {
            var3.field2663 = var7;
        } else if (arg0 == 1403) {
            var3.field2665 = var7;
        } else if (arg0 == 1404) {
            var3.field2667 = var7;
        } else if (arg0 == 1405) {
            var3.field2668 = var7;
        } else if (arg0 == 1406) {
            var3.field2661 = var7;
        } else if (arg0 == 1407) {
            var3.field2673 = var7;
            var3.field2576 = var5;
        } else if (arg0 == 1408) {
            var3.field2678 = var7;
        } else if (arg0 == 1409) {
            var3.field2621 = var7;
        } else if (arg0 == 1410) {
            var3.field2687 = var7;
        } else if (arg0 == 1411) {
            var3.field2583 = var7;
        } else if (arg0 == 1412) {
            var3.field2644 = var7;
        } else if (arg0 == 1414) {
            var3.field2674 = var7;
            var3.field2566 = var5;
        } else if (arg0 == 1415) {
            var3.field2676 = var7;
            var3.field2686 = var5;
        } else if (arg0 == 1416) {
            var3.field2658 = var7;
        } else if (arg0 == 1417) {
            var3.field2680 = var7;
        } else if (arg0 == 1418) {
            var3.field2681 = var7;
        } else if (arg0 == 1419) {
            var3.field2606 = var7;
        } else if (arg0 == 1420) {
            var3.field2683 = var7;
        } else if (arg0 == 1421) {
            var3.field2595 = var7;
        } else if (arg0 == 1422) {
            var3.field2685 = var7;
        } else if (arg0 == 1423) {
            var3.field2711 = var7;
        } else if (arg0 == 1424) {
            var3.field2670 = var7;
        } else if (arg0 == 1425) {
            var3.field2689 = var7;
        } else if (arg0 == 1426) {
            var3.field2675 = var7;
        } else if (arg0 == 1427) {
            var3.field2677 = var7;
        } else {
            return 2;
        }
        var3.field2659 = true;
        return 1;
    }

    @ObfuscatedName("gs.v(ILce;ZI)I")
    public static int method3376(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field2332 : Statics.field2445;
        if (arg0 == 1500) {
            field1090[++Statics.field3841 - 1] = var3.field2586;
            return 1;
        } else if (arg0 == 1501) {
            field1090[++Statics.field3841 - 1] = var3.field2672;
            return 1;
        } else if (arg0 == 1502) {
            field1090[++Statics.field3841 - 1] = var3.field2619;
            return 1;
        } else if (arg0 == 1503) {
            field1090[++Statics.field3841 - 1] = var3.field2589;
            return 1;
        } else if (arg0 == 1504) {
            field1090[++Statics.field3841 - 1] = var3.field2679 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1090[++Statics.field3841 - 1] = var3.field2592;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jm.n(ILce;ZI)I")
    public static int method4803(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field2332 : Statics.field2445;
        if (arg0 == 1600) {
            field1090[++Statics.field3841 - 1] = var3.field2594;
            return 1;
        } else if (arg0 == 1601) {
            field1090[++Statics.field3841 - 1] = var3.field2622;
            return 1;
        } else if (arg0 == 1602) {
            field1097[++Statics.field604 - 1] = var3.field2634;
            return 1;
        } else if (arg0 == 1603) {
            field1090[++Statics.field3841 - 1] = var3.field2596;
            return 1;
        } else if (arg0 == 1604) {
            field1090[++Statics.field3841 - 1] = var3.field2597;
            return 1;
        } else if (arg0 == 1605) {
            field1090[++Statics.field3841 - 1] = var3.field2627;
            return 1;
        } else if (arg0 == 1606) {
            field1090[++Statics.field3841 - 1] = var3.field2624;
            return 1;
        } else if (arg0 == 1607) {
            field1090[++Statics.field3841 - 1] = var3.field2588;
            return 1;
        } else if (arg0 == 1608) {
            field1090[++Statics.field3841 - 1] = var3.field2625;
            return 1;
        } else if (arg0 == 1609) {
            field1090[++Statics.field3841 - 1] = var3.field2604;
            return 1;
        } else if (arg0 == 1610) {
            field1090[++Statics.field3841 - 1] = var3.field2605;
            return 1;
        } else if (arg0 == 1611) {
            field1090[++Statics.field3841 - 1] = var3.field2601;
            return 1;
        } else if (arg0 == 1612) {
            field1090[++Statics.field3841 - 1] = var3.field2599;
            return 1;
        } else if (arg0 == 1613) {
            field1090[++Statics.field3841 - 1] = var3.field2603.method33();
            return 1;
        } else if (arg0 == 1614) {
            field1090[++Statics.field3841 - 1] = var3.field2631 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iz.x(ILce;ZI)I")
    public static int method4416(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field2332 : Statics.field2445;
        if (arg0 == 1700) {
            field1090[++Statics.field3841 - 1] = var3.field2626;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2626 == -1) {
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = var3.field2700;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1090[++Statics.field3841 - 1] = var3.field2574;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("w.w(ILce;ZI)I")
    public static int method155(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field2332 : Statics.field2445;
        if (arg0 == 1800) {
            field1090[++Statics.field3841 - 1] = class219.method1927(client.method188(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1090[--Statics.field3841];
            int var5 = var4 - 1;
            if (var3.field2653 == null || var5 >= var3.field2653.length || var3.field2653[var5] == null) {
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1097[++Statics.field604 - 1] = var3.field2653[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2593 == null) {
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1097[++Statics.field604 - 1] = var3.field2593;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ad.q(ILce;ZB)I")
    public static int method664(int arg0, class93 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method3666(field1090[--Statics.field3841]);
        } else {
            var3 = arg2 ? Statics.field2332 : Statics.field2445;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1089 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2677 == null) {
            return 0;
        } else {
            class63 var4 = new class63();
            var4.field574 = var3;
            var4.field585 = var3.field2677;
            var4.field583 = field1089 + 1;
            client.field846.method4545(var4);
            return 1;
        }
    }

    @ObfuscatedName("fe.z(ILce;ZI)I")
    public static int method3293(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method3666(field1090[--Statics.field3841]);
        if (arg0 == 2500) {
            field1090[++Statics.field3841 - 1] = var3.field2586;
            return 1;
        } else if (arg0 == 2501) {
            field1090[++Statics.field3841 - 1] = var3.field2672;
            return 1;
        } else if (arg0 == 2502) {
            field1090[++Statics.field3841 - 1] = var3.field2619;
            return 1;
        } else if (arg0 == 2503) {
            field1090[++Statics.field3841 - 1] = var3.field2589;
            return 1;
        } else if (arg0 == 2504) {
            field1090[++Statics.field3841 - 1] = var3.field2679 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1090[++Statics.field3841 - 1] = var3.field2592;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("da.y(ILce;ZI)I")
    public static int method2773(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method3666(field1090[--Statics.field3841]);
        if (arg0 == 2600) {
            field1090[++Statics.field3841 - 1] = var3.field2594;
            return 1;
        } else if (arg0 == 2601) {
            field1090[++Statics.field3841 - 1] = var3.field2622;
            return 1;
        } else if (arg0 == 2602) {
            field1097[++Statics.field604 - 1] = var3.field2634;
            return 1;
        } else if (arg0 == 2603) {
            field1090[++Statics.field3841 - 1] = var3.field2596;
            return 1;
        } else if (arg0 == 2604) {
            field1090[++Statics.field3841 - 1] = var3.field2597;
            return 1;
        } else if (arg0 == 2605) {
            field1090[++Statics.field3841 - 1] = var3.field2627;
            return 1;
        } else if (arg0 == 2606) {
            field1090[++Statics.field3841 - 1] = var3.field2624;
            return 1;
        } else if (arg0 == 2607) {
            field1090[++Statics.field3841 - 1] = var3.field2588;
            return 1;
        } else if (arg0 == 2608) {
            field1090[++Statics.field3841 - 1] = var3.field2625;
            return 1;
        } else if (arg0 == 2609) {
            field1090[++Statics.field3841 - 1] = var3.field2604;
            return 1;
        } else if (arg0 == 2610) {
            field1090[++Statics.field3841 - 1] = var3.field2605;
            return 1;
        } else if (arg0 == 2611) {
            field1090[++Statics.field3841 - 1] = var3.field2601;
            return 1;
        } else if (arg0 == 2612) {
            field1090[++Statics.field3841 - 1] = var3.field2599;
            return 1;
        } else if (arg0 == 2613) {
            field1090[++Statics.field3841 - 1] = var3.field2603.method33();
            return 1;
        } else if (arg0 == 2614) {
            field1090[++Statics.field3841 - 1] = var3.field2631 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cz.a(ILce;ZI)I")
    public static int method2008(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method3666(field1090[--Statics.field3841]);
        if (arg0 == 2800) {
            field1090[++Statics.field3841 - 1] = class219.method1927(client.method188(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1090[--Statics.field3841];
            int var5 = var4 - 1;
            if (var3.field2653 == null || var5 >= var3.field2653.length || var3.field2653[var5] == null) {
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1097[++Statics.field604 - 1] = var3.field2653[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2593 == null) {
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1097[++Statics.field604 - 1] = var3.field2593;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fl.u(ILce;ZB)I")
    public static int method3192(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1097[--Statics.field604];
            class92.method1681(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field3841 -= 2;
            client.method1043(Statics.field2392, field1090[Statics.field3841], field1090[Statics.field3841 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1096) {
                field1095 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1097[--Statics.field604];
            int var5 = 0;
            if (class292.method4169(var4)) {
                var5 = Statics.method4020(var4);
            }
            class188 var6 = class188.method2887(class184.field2252, client.field693.field1298);
            var6.field2335.method5306(var5);
            client.field693.method2109(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1097[--Statics.field604];
            class188 var8 = class188.method2887(class184.field2281, client.field693.field1298);
            var8.field2335.method5272(var7.length() + 1);
            var8.field2335.method5310(var7);
            client.field693.method2109(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1097[--Statics.field604];
            class188 var10 = class188.method2887(class184.field2204, client.field693.field1298);
            var10.field2335.method5272(var9.length() + 1);
            var10.field2335.method5310(var9);
            client.field693.method2109(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1090[--Statics.field3841];
            String var12 = field1097[--Statics.field604];
            Statics.method1056(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field3841 -= 3;
            int var13 = field1090[Statics.field3841];
            int var14 = field1090[Statics.field3841 + 1];
            int var15 = field1090[Statics.field3841 + 2];
            class218 var16 = class218.method3666(var15);
            Statics.method3816(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field3841 -= 2;
            int var17 = field1090[Statics.field3841];
            int var18 = field1090[Statics.field3841 + 1];
            class218 var19 = arg2 ? Statics.field2332 : Statics.field2445;
            Statics.method3816(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field540 = field1090[--Statics.field3841] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1090[++Statics.field3841 - 1] = Statics.field221.field1049 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field221.field1049 = field1090[--Statics.field3841] == 1;
            class74.method586();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1097[--Statics.field604];
            boolean var21 = field1090[--Statics.field3841] == 1;
            class52.method3723(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1090[--Statics.field3841];
            class188 var23 = class188.method2887(class184.field2278, client.field693.field1298);
            var23.field2335.method5114(var22);
            client.field693.method2109(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1090[--Statics.field3841];
            Statics.field604 -= 2;
            String var25 = field1097[Statics.field604];
            String var26 = field1097[Statics.field604 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class188 var27 = class188.method2887(class184.field2234, client.field693.field1298);
                var27.field2335.method5114(1 + class301.method4819(var25) + class301.method4819(var26));
                var27.field2335.method5310(var25);
                var27.field2335.method5155(var24);
                var27.field2335.method5310(var26);
                client.field693.method2109(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field789 = field1090[--Statics.field3841] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field794 = field1090[--Statics.field3841] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field765 = field1090[--Statics.field3841] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1090[--Statics.field3841] == 1) {
                client.field766 |= 0x1;
            } else {
                client.field766 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1090[--Statics.field3841] == 1) {
                client.field766 |= 0x2;
            } else {
                client.field766 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1090[--Statics.field3841] == 1) {
                client.field766 |= 0x4;
            } else {
                client.field766 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1090[--Statics.field3841] == 1) {
                client.field766 |= 0x8;
            } else {
                client.field766 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field766 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field751 = field1090[--Statics.field3841] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field745 = field1090[--Statics.field3841] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method1762(field1090[--Statics.field3841] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1090[++Statics.field3841 - 1] = client.method1097() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field3841 -= 2;
            client.field769 = field1090[Statics.field3841];
            client.field727 = field1090[Statics.field3841 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field3841 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field3841--;
            return 1;
        } else if (arg0 == 3132) {
            field1090[++Statics.field3841 - 1] = Statics.field3615;
            field1090[++Statics.field3841 - 1] = Statics.field345;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field3841--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field3841 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field809 = 3;
            client.field665 = field1090[--Statics.field3841];
            return 1;
        } else if (arg0 == 3137) {
            client.field809 = 2;
            client.field665 = field1090[--Statics.field3841];
            return 1;
        } else if (arg0 == 3138) {
            client.field809 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field809 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field809 = 3;
            client.field665 = arg2 ? Statics.field2332.field2573 : Statics.field2445.field2573;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1090[--Statics.field3841] == 1;
            Statics.field221.field1051 = var28;
            class74.method586();
            return 1;
        } else if (arg0 == 3142) {
            field1090[++Statics.field3841 - 1] = Statics.field221.field1051 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1090[--Statics.field3841] == 1;
            client.field685 = var29;
            if (!var29) {
                Statics.field221.field1047 = "";
                class74.method586();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1090[++Statics.field3841 - 1] = client.field685 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1090[--Statics.field3841] == 1;
            if (Statics.field221.field1046 == var30) {
                Statics.field221.field1046 = !var30;
                class74.method586();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1090[++Statics.field3841 - 1] = Statics.field221.field1046 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1090[++Statics.field3841 - 1] = class86.field1170;
            return 1;
        } else if (arg0 == 3154) {
            field1090[++Statics.field3841 - 1] = client.method150();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field604--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field3841 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field3841--;
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field3841--;
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field604--;
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field3841--;
            field1097[++Statics.field604 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field3841--;
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field3841 -= 2;
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field3841 -= 2;
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field3841 -= 2;
            field1097[++Statics.field604 - 1] = "";
            field1097[++Statics.field604 - 1] = "";
            field1097[++Statics.field604 - 1] = "";
            field1097[++Statics.field604 - 1] = "";
            field1097[++Statics.field604 - 1] = "";
            field1097[++Statics.field604 - 1] = "";
            field1097[++Statics.field604 - 1] = "";
            field1097[++Statics.field604 - 1] = "";
            field1097[++Statics.field604 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field3841--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field3841--;
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field3841--;
            return 1;
        } else if (arg0 == 3175) {
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field604--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field604--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("en.ae(ILce;ZI)I")
    public static int method3072(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field3841 -= 3;
            client.method531(field1090[Statics.field3841], field1090[Statics.field3841 + 1], field1090[Statics.field3841 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method5418(field1090[--Statics.field3841]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field3841 -= 2;
            client.method721(field1090[Statics.field3841], field1090[Statics.field3841 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cm.af(ILce;ZI)I")
    public static int method1977(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1090[++Statics.field3841 - 1] = client.field656;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field3841 -= 2;
            int var3 = field1090[Statics.field3841];
            int var4 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = class60.method3667(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field3841 -= 2;
            int var5 = field1090[Statics.field3841];
            int var6 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = Statics.method3202(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field3841 -= 2;
            int var7 = field1090[Statics.field3841];
            int var8 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = class60.method279(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = class241.method4094(var9).field3203;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = client.field778[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = client.field800[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = client.field780[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field2055;
            int var14 = (Statics.field2392.field983 >> 7) + Statics.field1262;
            int var15 = (Statics.field2392.field940 >> 7) + Statics.field2367;
            field1090[++Statics.field3841 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1090[++Statics.field3841 - 1] = client.field695 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field3841 -= 2;
            int var19 = field1090[Statics.field3841] + 32768;
            int var20 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = class60.method3667(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field3841 -= 2;
            int var21 = field1090[Statics.field3841] + 32768;
            int var22 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = Statics.method3202(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field3841 -= 2;
            int var23 = field1090[Statics.field3841] + 32768;
            int var24 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = class60.method279(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field684 >= 2) {
                field1090[++Statics.field3841 - 1] = client.field684;
            } else {
                field1090[++Statics.field3841 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1090[++Statics.field3841 - 1] = client.field663;
            return 1;
        } else if (arg0 == 3318) {
            field1090[++Statics.field3841 - 1] = client.field646;
            return 1;
        } else if (arg0 == 3321) {
            field1090[++Statics.field3841 - 1] = client.field737;
            return 1;
        } else if (arg0 == 3322) {
            field1090[++Statics.field3841 - 1] = client.field903;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field818) {
                field1090[++Statics.field3841 - 1] = 1;
            } else {
                field1090[++Statics.field3841 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1090[++Statics.field3841 - 1] = client.field774;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field3841 -= 4;
            int var25 = field1090[Statics.field3841];
            int var26 = field1090[Statics.field3841 + 1];
            int var27 = field1090[Statics.field3841 + 2];
            int var28 = field1090[Statics.field3841 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1090[++Statics.field3841 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hy.az(ILce;ZI)I")
    public static int method3814(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field3841 -= 2;
            int var3 = field1090[Statics.field3841];
            int var4 = field1090[Statics.field3841 + 1];
            class253 var5 = class253.method3077(var3);
            if (var5.field3313 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3319; var6++) {
                if (var5.field3311[var6] == var4) {
                    field1097[++Statics.field604 - 1] = var5.field3316[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1097[++Statics.field604 - 1] = var5.field3314;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field3841 -= 4;
            int var7 = field1090[Statics.field3841];
            int var8 = field1090[Statics.field3841 + 1];
            int var9 = field1090[Statics.field3841 + 2];
            int var10 = field1090[Statics.field3841 + 3];
            class253 var11 = class253.method3077(var9);
            if (var11.field3312 != var7 || var11.field3313 != var8) {
                if (var8 == 115) {
                    field1097[++Statics.field604 - 1] = class225.field2775;
                } else {
                    field1090[++Statics.field3841 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3319; var12++) {
                if (var11.field3311[var12] == var10) {
                    if (var8 == 115) {
                        field1097[++Statics.field604 - 1] = var11.field3316[var12];
                    } else {
                        field1090[++Statics.field3841 - 1] = var11.field3318[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1097[++Statics.field604 - 1] = var11.field3314;
                } else {
                    field1090[++Statics.field3841 - 1] = var11.field3320;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1090[--Statics.field3841];
            class253 var14 = class253.method3077(var13);
            field1090[++Statics.field3841 - 1] = var14.method4236();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gr.ax(ILce;ZI)I")
    public static int method3612(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field415.field1064 == 0) {
                field1090[++Statics.field3841 - 1] = -2;
            } else if (Statics.field415.field1064 == 1) {
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = Statics.field415.field1055.method4787();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1090[--Statics.field3841];
            if (Statics.field415.method1687() && var3 >= 0 && var3 < Statics.field415.field1055.method4787()) {
                class285 var4 = (class285) Statics.field415.field1055.method4743(var3);
                field1097[++Statics.field604 - 1] = var4.method4690();
                field1097[++Statics.field604 - 1] = var4.method4709();
            } else {
                field1097[++Statics.field604 - 1] = "";
                field1097[++Statics.field604 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1090[--Statics.field3841];
            if (Statics.field415.method1687() && var5 >= 0 && var5 < Statics.field415.field1055.method4787()) {
                field1090[++Statics.field3841 - 1] = ((class280) Statics.field415.field1055.method4743(var5)).field3600;
            } else {
                field1090[++Statics.field3841 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1090[--Statics.field3841];
            if (Statics.field415.method1687() && var6 >= 0 && var6 < Statics.field415.field1055.method4787()) {
                field1090[++Statics.field3841 - 1] = ((class280) Statics.field415.field1055.method4743(var6)).field3602;
            } else {
                field1090[++Statics.field3841 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1097[--Statics.field604];
            int var8 = field1090[--Statics.field3841];
            class75.method5386(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1097[--Statics.field604];
            Statics.field415.method1694(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1097[--Statics.field604];
            Statics.field415.method1698(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1097[--Statics.field604];
            Statics.field415.method1696(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field1097[--Statics.field604];
            Statics.field415.method1699(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field1097[--Statics.field604];
            String var14 = client.method1060(var13);
            field1090[++Statics.field3841 - 1] = Statics.field415.method1686(new class284(var14, Statics.field2390), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field568 == null) {
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1097[++Statics.field604 - 1] = Statics.field568.field3625;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field568 == null) {
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = Statics.field568.method4787();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field1090[--Statics.field3841];
            if (Statics.field568 == null || var15 >= Statics.field568.method4787()) {
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1097[++Statics.field604 - 1] = Statics.field568.method4743(var15).method4689().method4829();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field1090[--Statics.field3841];
            if (Statics.field568 == null || var16 >= Statics.field568.method4787()) {
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = ((class280) Statics.field568.method4743(var16)).method4811();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field1090[--Statics.field3841];
            if (Statics.field568 == null || var17 >= Statics.field568.method4787()) {
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = ((class280) Statics.field568.method4743(var17)).field3602;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1090[++Statics.field3841 - 1] = Statics.field568 == null ? 0 : Statics.field568.field3627;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field1097[--Statics.field604];
            client.method507(var18);
            return 1;
        } else if (arg0 == 3618) {
            field1090[++Statics.field3841 - 1] = Statics.field568 == null ? 0 : Statics.field568.field3622;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field1097[--Statics.field604];
            client.method139(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method1923();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field415.method1687()) {
                field1090[++Statics.field3841 - 1] = Statics.field415.field1059.method4787();
            } else {
                field1090[++Statics.field3841 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field1090[--Statics.field3841];
            if (Statics.field415.method1687() && var20 >= 0 && var20 < Statics.field415.field1059.method4787()) {
                class279 var21 = (class279) Statics.field415.field1059.method4743(var20);
                field1097[++Statics.field604 - 1] = var21.method4690();
                field1097[++Statics.field604 - 1] = var21.method4709();
            } else {
                field1097[++Statics.field604 - 1] = "";
                field1097[++Statics.field604 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field1097[--Statics.field604];
            String var23 = client.method1060(var22);
            field1090[++Statics.field3841 - 1] = Statics.field415.method1693(new class284(var23, Statics.field2390)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field1090[--Statics.field3841];
            if (Statics.field568 == null || var24 >= Statics.field568.method4787() || !Statics.field568.method4743(var24).method4689().equals(Statics.field2392.field626)) {
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field568 == null || Statics.field568.field3623 == null) {
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1097[++Statics.field604 - 1] = Statics.field568.field3623;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field1090[--Statics.field3841];
            if (Statics.field568 == null || var25 >= Statics.field568.method4787() || !((class274) Statics.field568.method4743(var25)).method4685()) {
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field1090[--Statics.field3841];
            if (Statics.field568 == null || var26 >= Statics.field568.method4787() || !((class274) Statics.field568.method4743(var26)).method4672()) {
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field415.field1055.method4754();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1055.method4752(new class315(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1055.method4752(new class316(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1055.method4752(new class158(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1055.method4752(new class152(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1055.method4752(new class157(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1055.method4752(new class160(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1055.method4752(new class156(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1055.method4752(new class154(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1055.method4752(new class153(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1055.method4752(new class155(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field415.field1055.method4744();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field415.field1059.method4754();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1059.method4752(new class315(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1059.method4752(new class316(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field415.field1059.method4744();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field568 != null) {
                Statics.field568.method4754();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field1090[--Statics.field3841] == 1;
            if (Statics.field568 != null) {
                Statics.field568.method4752(new class315(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field1090[--Statics.field3841] == 1;
            if (Statics.field568 != null) {
                Statics.field568.method4752(new class316(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field1090[--Statics.field3841] == 1;
            if (Statics.field568 != null) {
                Statics.field568.method4752(new class158(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field1090[--Statics.field3841] == 1;
            if (Statics.field568 != null) {
                Statics.field568.method4752(new class152(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field1090[--Statics.field3841] == 1;
            if (Statics.field568 != null) {
                Statics.field568.method4752(new class157(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field1090[--Statics.field3841] == 1;
            if (Statics.field568 != null) {
                Statics.field568.method4752(new class160(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field1090[--Statics.field3841] == 1;
            if (Statics.field568 != null) {
                Statics.field568.method4752(new class156(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field1090[--Statics.field3841] == 1;
            if (Statics.field568 != null) {
                Statics.field568.method4752(new class154(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field1090[--Statics.field3841] == 1;
            if (Statics.field568 != null) {
                Statics.field568.method4752(new class153(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field1090[--Statics.field3841] == 1;
            if (Statics.field568 != null) {
                Statics.field568.method4752(new class155(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field568 != null) {
                Statics.field568.method4744();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field1090[--Statics.field3841] == 1;
            Statics.field415.field1055.method4752(new class159(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field1090[--Statics.field3841] == 1;
            if (Statics.field568 != null) {
                Statics.field568.method4752(new class159(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("it.aj(ILce;ZI)I")
    public static int method4228(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = client.field914[var3].method104();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = client.field914[var4].field59;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = client.field914[var5].field56;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = client.field914[var6].field58;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = client.field914[var7].field57;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = client.field914[var8].field60;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1090[--Statics.field3841];
            int var10 = client.field914[var9].method90();
            field1090[++Statics.field3841 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1090[--Statics.field3841];
            int var12 = client.field914[var11].method90();
            field1090[++Statics.field3841 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1090[--Statics.field3841];
            int var14 = client.field914[var13].method90();
            field1090[++Statics.field3841 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1090[--Statics.field3841];
            int var16 = client.field914[var15].method90();
            field1090[++Statics.field3841 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1090[--Statics.field3841] == 1;
            if (Statics.field937 != null) {
                Statics.field937.method59(class7.field33, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1090[--Statics.field3841] == 1;
            if (Statics.field937 != null) {
                Statics.field937.method59(class7.field34, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field3841 -= 2;
            boolean var19 = field1090[Statics.field3841] == 1;
            boolean var20 = field1090[Statics.field3841 + 1] == 1;
            if (Statics.field937 != null) {
                client.field915.field643 = var20;
                Statics.field937.method59(client.field915, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1090[--Statics.field3841] == 1;
            if (Statics.field937 != null) {
                Statics.field937.method59(class7.field37, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1090[--Statics.field3841] == 1;
            if (Statics.field937 != null) {
                Statics.field937.method59(class7.field36, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1090[++Statics.field3841 - 1] = Statics.field937 == null ? 0 : Statics.field937.field32.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1090[--Statics.field3841];
            class8 var24 = (class8) Statics.field937.field32.get(var23);
            field1090[++Statics.field3841 - 1] = var24.field41;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1090[--Statics.field3841];
            class8 var26 = (class8) Statics.field937.field32.get(var25);
            field1097[++Statics.field604 - 1] = var26.method75();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1090[--Statics.field3841];
            class8 var28 = (class8) Statics.field937.field32.get(var27);
            field1097[++Statics.field604 - 1] = var28.method69();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1090[--Statics.field3841];
            class8 var30 = (class8) Statics.field937.field32.get(var29);
            long var31 = Statics.method184() - Statics.field275 - var30.field42;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1097[++Statics.field604 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1090[--Statics.field3841];
            class8 var38 = (class8) Statics.field937.field32.get(var37);
            field1090[++Statics.field3841 - 1] = var38.field45.field58;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1090[--Statics.field3841];
            class8 var40 = (class8) Statics.field937.field32.get(var39);
            field1090[++Statics.field3841 - 1] = var40.field45.field56;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1090[--Statics.field3841];
            class8 var42 = (class8) Statics.field937.field32.get(var41);
            field1090[++Statics.field3841 - 1] = var42.field45.field59;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dk.au(ILce;ZB)I")
    public static int method2570(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field3841 -= 2;
            int var3 = field1090[Statics.field3841];
            int var4 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field3841 -= 2;
            int var5 = field1090[Statics.field3841];
            int var6 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field3841 -= 2;
            int var7 = field1090[Statics.field3841];
            int var8 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field3841 -= 2;
            int var9 = field1090[Statics.field3841];
            int var10 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field3841 -= 5;
            int var13 = field1090[Statics.field3841];
            int var14 = field1090[Statics.field3841 + 1];
            int var15 = field1090[Statics.field3841 + 2];
            int var16 = field1090[Statics.field3841 + 3];
            int var17 = field1090[Statics.field3841 + 4];
            field1090[++Statics.field3841 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field3841 -= 2;
            int var18 = field1090[Statics.field3841];
            int var19 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field3841 -= 2;
            int var20 = field1090[Statics.field3841];
            int var21 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field3841 -= 2;
            int var22 = field1090[Statics.field3841];
            int var23 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field3841 -= 2;
            int var24 = field1090[Statics.field3841];
            int var25 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field3841 -= 2;
            int var26 = field1090[Statics.field3841];
            int var27 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field3841 -= 2;
            int var28 = field1090[Statics.field3841];
            int var29 = field1090[Statics.field3841 + 1];
            if (var28 == 0) {
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field3841 -= 2;
            int var30 = field1090[Statics.field3841];
            int var31 = field1090[Statics.field3841 + 1];
            if (var30 == 0) {
                field1090[++Statics.field3841 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1090[++Statics.field3841 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1090[++Statics.field3841 - 1] = var30;
                    break;
                case 2:
                    field1090[++Statics.field3841 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1090[++Statics.field3841 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1090[++Statics.field3841 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1090[++Statics.field3841 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field3841 -= 2;
            int var32 = field1090[Statics.field3841];
            int var33 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field3841 -= 2;
            int var34 = field1090[Statics.field3841];
            int var35 = field1090[Statics.field3841 + 1];
            field1090[++Statics.field3841 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field3841 -= 3;
            long var36 = (long) field1090[Statics.field3841];
            long var38 = (long) field1090[Statics.field3841 + 1];
            long var40 = (long) field1090[Statics.field3841 + 2];
            field1090[++Statics.field3841 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lj.ay(ILce;ZB)I")
    public static int method5472(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1097[--Statics.field604];
            int var4 = field1090[--Statics.field3841];
            field1097[++Statics.field604 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field604 -= 2;
            String var5 = field1097[Statics.field604];
            String var6 = field1097[Statics.field604 + 1];
            field1097[++Statics.field604 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1097[--Statics.field604];
            int var8 = field1090[--Statics.field3841];
            field1097[++Statics.field604 - 1] = var7 + class292.method1025(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1097[--Statics.field604];
            field1097[++Statics.field604 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1090[--Statics.field3841];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1091.setTime(new Date(var11));
            int var13 = field1091.get(5);
            int var14 = field1091.get(2);
            int var15 = field1091.get(1);
            field1097[++Statics.field604 - 1] = var13 + "-" + field1094[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field604 -= 2;
            String var16 = field1097[Statics.field604];
            String var17 = field1097[Statics.field604 + 1];
            if (Statics.field2392.field612 != null && Statics.field2392.field612.field2542) {
                field1097[++Statics.field604 - 1] = var17;
            } else {
                field1097[++Statics.field604 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1090[--Statics.field3841];
            field1097[++Statics.field604 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field604 -= 2;
            field1090[++Statics.field3841 - 1] = class292.method591(class288.method1570(field1097[Statics.field604], field1097[Statics.field604 + 1], Statics.field3632));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1097[--Statics.field604];
            Statics.field3841 -= 2;
            int var20 = field1090[Statics.field3841];
            int var21 = field1090[Statics.field3841 + 1];
            byte[] var22 = Statics.field500.method3845(var21, 0);
            class296 var23 = new class296(var22);
            field1090[++Statics.field3841 - 1] = var23.method5022(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1097[--Statics.field604];
            Statics.field3841 -= 2;
            int var25 = field1090[Statics.field3841];
            int var26 = field1090[Statics.field3841 + 1];
            byte[] var27 = Statics.field500.method3845(var26, 0);
            class296 var28 = new class296(var27);
            field1090[++Statics.field3841 - 1] = var28.method5065(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field604 -= 2;
            String var29 = field1097[Statics.field604];
            String var30 = field1097[Statics.field604 + 1];
            if (field1090[--Statics.field3841] == 1) {
                field1097[++Statics.field604 - 1] = var29;
            } else {
                field1097[++Statics.field604 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1097[--Statics.field604];
            field1097[++Statics.field604 - 1] = class297.method4981(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1097[--Statics.field604];
            int var33 = field1090[--Statics.field3841];
            field1097[++Statics.field604 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = class292.method3810((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = class292.method3830((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = class292.method4881((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = class292.method147((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1097[--Statics.field604];
            if (var38 == null) {
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1097[--Statics.field604];
            Statics.field3841 -= 2;
            int var40 = field1090[Statics.field3841];
            int var41 = field1090[Statics.field3841 + 1];
            field1097[++Statics.field604 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1097[--Statics.field604];
            StringBuilder var43 = new StringBuilder(var42.length());
            boolean var44 = false;
            for (int var45 = 0; var45 < var42.length(); var45++) {
                char var46 = var42.charAt(var45);
                if (var46 == '<') {
                    var44 = true;
                } else if (var46 == '>') {
                    var44 = false;
                } else if (!var44) {
                    var43.append(var46);
                }
            }
            field1097[++Statics.field604 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1097[--Statics.field604];
            int var48 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field604 -= 2;
            String var49 = field1097[Statics.field604];
            String var50 = field1097[Statics.field604 + 1];
            int var51 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1097[--Statics.field604];
            field1097[++Statics.field604 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hl.aa(ILce;ZI)I")
    public static int method3724(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1090[--Statics.field3841];
            field1097[++Statics.field604 - 1] = class256.method4164(var3).field3407;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field3841 -= 2;
            int var4 = field1090[Statics.field3841];
            int var5 = field1090[Statics.field3841 + 1];
            class256 var6 = class256.method4164(var4);
            if (var5 < 1 || var5 > 5 || var6.field3421[var5 - 1] == null) {
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1097[++Statics.field604 - 1] = var6.field3421[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field3841 -= 2;
            int var7 = field1090[Statics.field3841];
            int var8 = field1090[Statics.field3841 + 1];
            class256 var9 = class256.method4164(var7);
            if (var8 < 1 || var8 > 5 || var9.field3422[var8 - 1] == null) {
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1097[++Statics.field604 - 1] = var9.field3422[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = class256.method4164(var10).field3428;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = class256.method4164(var11).field3418 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1090[--Statics.field3841];
            class256 var13 = class256.method4164(var12);
            if (var13.field3405 == -1 && var13.field3409 >= 0) {
                field1090[++Statics.field3841 - 1] = var13.field3409;
            } else {
                field1090[++Statics.field3841 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1090[--Statics.field3841];
            class256 var15 = class256.method4164(var14);
            if (var15.field3405 >= 0 && var15.field3409 >= 0) {
                field1090[++Statics.field3841 - 1] = var15.field3409;
            } else {
                field1090[++Statics.field3841 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = class256.method4164(var16).field3420 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1090[--Statics.field3841];
            class256 var18 = class256.method4164(var17);
            if (var18.field3451 == -1 && var18.field3437 >= 0) {
                field1090[++Statics.field3841 - 1] = var18.field3437;
            } else {
                field1090[++Statics.field3841 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1090[--Statics.field3841];
            class256 var20 = class256.method4164(var19);
            if (var20.field3451 >= 0 && var20.field3437 >= 0) {
                field1090[++Statics.field3841 - 1] = var20.field3437;
            } else {
                field1090[++Statics.field3841 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1097[--Statics.field604];
            int var22 = field1090[--Statics.field3841];
            client.method659(var21, var22 == 1);
            field1090[++Statics.field3841 - 1] = Statics.field2003;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field115 == null || Statics.field2500 >= Statics.field2003) {
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = Statics.field115[++Statics.field2500 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field2500 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.aq(ILce;ZI)I")
    public static int method1638(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1090[++Statics.field3841 - 1] = client.field863;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field3841 -= 3;
            client.field863 = field1090[Statics.field3841];
            Statics.field173 = class311.method3162(field1090[Statics.field3841 + 1]);
            if (Statics.field173 == null) {
                Statics.field173 = class311.field3791;
            }
            client.field891 = field1090[Statics.field3841 + 2];
            class188 var3 = class188.method2887(class184.field2284, client.field693.field1298);
            var3.field2335.method5272(client.field863);
            var3.field2335.method5272(Statics.field173.field3788);
            var3.field2335.method5272(client.field891);
            client.field693.method2109(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1097[--Statics.field604];
            Statics.field3841 -= 2;
            int var5 = field1090[Statics.field3841];
            int var6 = field1090[Statics.field3841 + 1];
            class188 var7 = class188.method2887(class184.field2272, client.field693.field1298);
            var7.field2335.method5272(class301.method4819(var4) + 2);
            var7.field2335.method5310(var4);
            var7.field2335.method5272(var5 - 1);
            var7.field2335.method5272(var6);
            client.field693.method2109(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field3841 -= 2;
            int var8 = field1090[Statics.field3841];
            int var9 = field1090[Statics.field3841 + 1];
            class65 var10 = class92.method262(var8, var9);
            if (var10 == null) {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = 0;
                field1097[++Statics.field604 - 1] = "";
                field1097[++Statics.field604 - 1] = "";
                field1097[++Statics.field604 - 1] = "";
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = var10.field601;
                field1090[++Statics.field3841 - 1] = var10.field596;
                field1097[++Statics.field604 - 1] = var10.field606 == null ? "" : var10.field606;
                field1097[++Statics.field604 - 1] = var10.field602 == null ? "" : var10.field602;
                field1097[++Statics.field604 - 1] = var10.field603 == null ? "" : var10.field603;
                field1090[++Statics.field3841 - 1] = var10.method1070() ? 1 : (var10.method1071() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1090[--Statics.field3841];
            class65 var12 = class92.method668(var11);
            if (var12 == null) {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = 0;
                field1097[++Statics.field604 - 1] = "";
                field1097[++Statics.field604 - 1] = "";
                field1097[++Statics.field604 - 1] = "";
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = var12.field597;
                field1090[++Statics.field3841 - 1] = var12.field596;
                field1097[++Statics.field604 - 1] = var12.field606 == null ? "" : var12.field606;
                field1097[++Statics.field604 - 1] = var12.field602 == null ? "" : var12.field602;
                field1097[++Statics.field604 - 1] = var12.field603 == null ? "" : var12.field603;
                field1090[++Statics.field3841 - 1] = var12.method1070() ? 1 : (var12.method1071() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field173 == null) {
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = Statics.field173.field3788;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1097[--Statics.field604];
            int var14 = field1090[--Statics.field3841];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class225.field2786)) {
                var16 = 0;
                var13 = var13.substring(class225.field2786.length());
            } else if (var15.startsWith(class225.field2949)) {
                var16 = 1;
                var13 = var13.substring(class225.field2949.length());
            } else if (var15.startsWith(class225.field2951)) {
                var16 = 2;
                var13 = var13.substring(class225.field2951.length());
            } else if (var15.startsWith(class225.field2953)) {
                var16 = 3;
                var13 = var13.substring(class225.field2953.length());
            } else if (var15.startsWith(class225.field2898)) {
                var16 = 4;
                var13 = var13.substring(class225.field2898.length());
            } else if (var15.startsWith(class225.field3047)) {
                var16 = 5;
                var13 = var13.substring(class225.field3047.length());
            } else if (var15.startsWith(class225.field2959)) {
                var16 = 6;
                var13 = var13.substring(class225.field2959.length());
            } else if (var15.startsWith(class225.field2961)) {
                var16 = 7;
                var13 = var13.substring(class225.field2961.length());
            } else if (var15.startsWith(class225.field2963)) {
                var16 = 8;
                var13 = var13.substring(class225.field2963.length());
            } else if (var15.startsWith(class225.field2980)) {
                var16 = 9;
                var13 = var13.substring(class225.field2980.length());
            } else if (var15.startsWith(class225.field2967)) {
                var16 = 10;
                var13 = var13.substring(class225.field2967.length());
            } else if (var15.startsWith(class225.field2857)) {
                var16 = 11;
                var13 = var13.substring(class225.field2857.length());
            } else if (Statics.field3632 != class191.field2364) {
                if (var15.startsWith(class225.field2948)) {
                    var16 = 0;
                    var13 = var13.substring(class225.field2948.length());
                } else if (var15.startsWith(class225.field2937)) {
                    var16 = 1;
                    var13 = var13.substring(class225.field2937.length());
                } else if (var15.startsWith(class225.field2847)) {
                    var16 = 2;
                    var13 = var13.substring(class225.field2847.length());
                } else if (var15.startsWith(class225.field2918)) {
                    var16 = 3;
                    var13 = var13.substring(class225.field2918.length());
                } else if (var15.startsWith(class225.field2767)) {
                    var16 = 4;
                    var13 = var13.substring(class225.field2767.length());
                } else if (var15.startsWith(class225.field2958)) {
                    var16 = 5;
                    var13 = var13.substring(class225.field2958.length());
                } else if (var15.startsWith(class225.field3034)) {
                    var16 = 6;
                    var13 = var13.substring(class225.field3034.length());
                } else if (var15.startsWith(class225.field2962)) {
                    var16 = 7;
                    var13 = var13.substring(class225.field2962.length());
                } else if (var15.startsWith(class225.field2812)) {
                    var16 = 8;
                    var13 = var13.substring(class225.field2812.length());
                } else if (var15.startsWith(class225.field2966)) {
                    var16 = 9;
                    var13 = var13.substring(class225.field2966.length());
                } else if (var15.startsWith(class225.field2968)) {
                    var16 = 10;
                    var13 = var13.substring(class225.field2968.length());
                } else if (var15.startsWith(class225.field2970)) {
                    var16 = 11;
                    var13 = var13.substring(class225.field2970.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class225.field2992)) {
                var18 = 1;
                var13 = var13.substring(class225.field2992.length());
            } else if (var17.startsWith(class225.field2973)) {
                var18 = 2;
                var13 = var13.substring(class225.field2973.length());
            } else if (var17.startsWith(class225.field2975)) {
                var18 = 3;
                var13 = var13.substring(class225.field2975.length());
            } else if (var17.startsWith(class225.field2828)) {
                var18 = 4;
                var13 = var13.substring(class225.field2828.length());
            } else if (var17.startsWith(class225.field2979)) {
                var18 = 5;
                var13 = var13.substring(class225.field2979.length());
            } else if (Statics.field3632 != class191.field2364) {
                if (var17.startsWith(class225.field2965)) {
                    var18 = 1;
                    var13 = var13.substring(class225.field2965.length());
                } else if (var17.startsWith(class225.field2974)) {
                    var18 = 2;
                    var13 = var13.substring(class225.field2974.length());
                } else if (var17.startsWith(class225.field2907)) {
                    var18 = 3;
                    var13 = var13.substring(class225.field2907.length());
                } else if (var17.startsWith(class225.field2978)) {
                    var18 = 4;
                    var13 = var13.substring(class225.field2978.length());
                } else if (var17.startsWith(class225.field2866)) {
                    var18 = 5;
                    var13 = var13.substring(class225.field2866.length());
                }
            }
            class188 var19 = class188.method2887(class184.field2264, client.field693.field1298);
            var19.field2335.method5272(0);
            int var20 = var19.field2335.field3707;
            var19.field2335.method5272(var14);
            var19.field2335.method5272(var16);
            var19.field2335.method5272(var18);
            class211.method84(var19.field2335, var13);
            var19.field2335.method5190(var19.field2335.field3707 - var20);
            client.field693.method2109(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field604 -= 2;
            String var21 = field1097[Statics.field604];
            String var22 = field1097[Statics.field604 + 1];
            class188 var23 = class188.method2887(class184.field2242, client.field693.field1298);
            var23.field2335.method5114(0);
            int var24 = var23.field2335.field3707;
            var23.field2335.method5310(var21);
            class211.method84(var23.field2335, var22);
            var23.field2335.method5147(var23.field2335.field3707 - var24);
            client.field693.method2109(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field2392 == null || Statics.field2392.field626 == null) {
                var25 = "";
            } else {
                var25 = Statics.field2392.field626.method4829();
            }
            field1097[++Statics.field604 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1090[++Statics.field3841 - 1] = client.field891;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = class92.method748(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = class92.method146(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = class92.method4377(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1097[--Statics.field604];
            client.method3994(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field781 = field1097[--Statics.field604].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1097[++Statics.field604 - 1] = client.field781;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1097[--Statics.field604];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.as(ILce;ZI)I")
    public static int method1589(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1090[++Statics.field3841 - 1] = client.method4856();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1090[--Statics.field3841];
            if (var3 == 1 || var3 == 2) {
                client.method2798(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1090[++Statics.field3841 - 1] = Statics.field221.field1043;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1090[--Statics.field3841];
            if (var4 == 1 || var4 == 2) {
                Statics.field221.field1043 = var4;
                class74.method586();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field3841--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bu.ak(ILce;ZB)I")
    public static int method1750(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field3841 -= 2;
            int var3 = field1090[Statics.field3841];
            int var4 = field1090[Statics.field3841 + 1];
            if (!client.field671) {
                client.field715 = var3;
                client.field717 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1090[++Statics.field3841 - 1] = client.field715;
            return 1;
        } else if (arg0 == 5506) {
            field1090[++Statics.field3841 - 1] = client.field717;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1090[--Statics.field3841];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field777 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1090[++Statics.field3841 - 1] = client.field777;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.ac(ILce;ZI)I")
    public static int method223(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field694 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.aw(II)I")
    public static int method77(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("fp.ar(IB)I")
    public static int method3200(int arg0) {
        return (int) ((Math.log((double) arg0) / field1098 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("cc.av(ILce;ZI)I")
    public static int method2152(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field3841 -= 2;
            client.field909 = (short) method77(field1090[Statics.field3841]);
            if (client.field909 <= 0) {
                client.field909 = 256;
            }
            client.field898 = (short) method77(field1090[Statics.field3841 + 1]);
            if (client.field898 <= 0) {
                client.field898 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field3841 -= 2;
            client.field899 = (short) field1090[Statics.field3841];
            if (client.field899 <= 0) {
                client.field899 = 256;
            }
            client.field900 = (short) field1090[Statics.field3841 + 1];
            if (client.field900 <= 0) {
                client.field900 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field3841 -= 4;
            client.field901 = (short) field1090[Statics.field3841];
            if (client.field901 <= 0) {
                client.field901 = 1;
            }
            client.field674 = (short) field1090[Statics.field3841 + 1];
            if (client.field674 <= 0) {
                client.field674 = 32767;
            } else if (client.field674 < client.field901) {
                client.field674 = client.field901;
            }
            client.field820 = (short) field1090[Statics.field3841 + 2];
            if (client.field820 <= 0) {
                client.field820 = 1;
            }
            client.field904 = (short) field1090[Statics.field3841 + 3];
            if (client.field904 <= 0) {
                client.field904 = 32767;
            } else if (client.field904 < client.field820) {
                client.field904 = client.field820;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field660 == null) {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                client.method110(0, 0, client.field660.field2619, client.field660.field2589, false);
                field1090[++Statics.field3841 - 1] = client.field907;
                field1090[++Statics.field3841 - 1] = client.field908;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1090[++Statics.field3841 - 1] = client.field899;
            field1090[++Statics.field3841 - 1] = client.field900;
            return 1;
        } else if (arg0 == 6205) {
            field1090[++Statics.field3841 - 1] = method3200(client.field909);
            field1090[++Statics.field3841 - 1] = method3200(client.field898);
            return 1;
        } else if (arg0 == 6220) {
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1090[++Statics.field3841 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1090[++Statics.field3841 - 1] = Statics.field3615;
            return 1;
        } else if (arg0 == 6223) {
            field1090[++Statics.field3841 - 1] = Statics.field345;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("as.al(ILce;ZB)I")
    public static int method535(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1090[++Statics.field3841 - 1] = class72.method3170() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class72 var3 = class72.method533();
            if (var3 == null) {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = 0;
                field1097[++Statics.field604 - 1] = "";
                field1090[++Statics.field3841 - 1] = 0;
                field1090[++Statics.field3841 - 1] = 0;
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1090[++Statics.field3841 - 1] = var3.field1014;
                field1090[++Statics.field3841 - 1] = var3.field1017;
                field1097[++Statics.field604 - 1] = var3.field1009;
                field1090[++Statics.field3841 - 1] = var3.field1019;
                field1090[++Statics.field3841 - 1] = var3.field1016;
                field1097[++Statics.field604 - 1] = var3.field1020;
            }
            return 1;
        } else if (arg0 == 6502) {
            class72 var4 = class72.method5471();
            if (var4 == null) {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = 0;
                field1097[++Statics.field604 - 1] = "";
                field1090[++Statics.field3841 - 1] = 0;
                field1090[++Statics.field3841 - 1] = 0;
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1090[++Statics.field3841 - 1] = var4.field1014;
                field1090[++Statics.field3841 - 1] = var4.field1017;
                field1097[++Statics.field604 - 1] = var4.field1009;
                field1090[++Statics.field3841 - 1] = var4.field1019;
                field1090[++Statics.field3841 - 1] = var4.field1016;
                field1097[++Statics.field604 - 1] = var4.field1020;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1090[--Statics.field3841];
            class72 var6 = null;
            for (int var7 = 0; var7 < class72.field1006; var7++) {
                if (Statics.field1313[var7].field1014 == var5) {
                    var6 = Statics.field1313[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = 0;
                field1097[++Statics.field604 - 1] = "";
                field1090[++Statics.field3841 - 1] = 0;
                field1090[++Statics.field3841 - 1] = 0;
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1090[++Statics.field3841 - 1] = var6.field1014;
                field1090[++Statics.field3841 - 1] = var6.field1017;
                field1097[++Statics.field604 - 1] = var6.field1009;
                field1090[++Statics.field3841 - 1] = var6.field1019;
                field1090[++Statics.field3841 - 1] = var6.field1016;
                field1097[++Statics.field604 - 1] = var6.field1020;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field3841 -= 4;
            int var8 = field1090[Statics.field3841];
            boolean var9 = field1090[Statics.field3841 + 1] == 1;
            int var10 = field1090[Statics.field3841 + 2];
            boolean var11 = field1090[Statics.field3841 + 3] == 1;
            class72.method283(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1090[--Statics.field3841];
            if (var12 >= 0 && var12 < class72.field1006) {
                class72 var13 = Statics.field1313[var12];
                field1090[++Statics.field3841 - 1] = var13.field1014;
                field1090[++Statics.field3841 - 1] = var13.field1017;
                field1097[++Statics.field604 - 1] = var13.field1009;
                field1090[++Statics.field3841 - 1] = var13.field1019;
                field1090[++Statics.field3841 - 1] = var13.field1016;
                field1097[++Statics.field604 - 1] = var13.field1020;
            } else {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = 0;
                field1097[++Statics.field604 - 1] = "";
                field1090[++Statics.field3841 - 1] = 0;
                field1090[++Statics.field3841 - 1] = 0;
                field1097[++Statics.field604 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field850 = field1090[--Statics.field3841] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field3841 -= 2;
            int var14 = field1090[Statics.field3841];
            int var15 = field1090[Statics.field3841 + 1];
            class251 var16 = class251.method3375(var15);
            if (var16.method4185()) {
                field1097[++Statics.field604 - 1] = class258.method3989(var14).method4410(var15, var16.field3300);
            } else {
                field1090[++Statics.field3841 - 1] = class258.method3989(var14).method4390(var15, var16.field3301);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field3841 -= 2;
            int var17 = field1090[Statics.field3841];
            int var18 = field1090[Statics.field3841 + 1];
            class251 var19 = class251.method3375(var18);
            if (var19.method4185()) {
                field1097[++Statics.field604 - 1] = class255.method3070(var17).method4284(var18, var19.field3300);
            } else {
                field1090[++Statics.field3841 - 1] = class255.method3070(var17).method4283(var18, var19.field3301);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field3841 -= 2;
            int var20 = field1090[Statics.field3841];
            int var21 = field1090[Statics.field3841 + 1];
            class251 var22 = class251.method3375(var21);
            if (var22.method4185()) {
                field1097[++Statics.field604 - 1] = class256.method4164(var20).method4347(var21, var22.field3300);
            } else {
                field1090[++Statics.field3841 - 1] = class256.method4164(var20).method4336(var21, var22.field3301);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field3841 -= 2;
            int var23 = field1090[Statics.field3841];
            int var24 = field1090[Statics.field3841 + 1];
            class251 var25 = class251.method3375(var24);
            if (var25.method4185()) {
                field1097[++Statics.field604 - 1] = class252.method4964(var23).method4204(var24, var25.field3300);
            } else {
                field1090[++Statics.field3841 - 1] = class252.method4964(var23).method4208(var24, var25.field3301);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1090[++Statics.field3841 - 1] = client.field653 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1090[++Statics.field3841 - 1] = client.field652 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field604--;
            Statics.field3841--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field604--;
            Statics.field3841--;
            return 1;
        } else if (arg0 == 6524) {
            field1090[++Statics.field3841 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1090[++Statics.field3841 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1090[++Statics.field3841 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eg.ad(ILce;ZI)I")
    public static int method3097(int arg0, class93 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field2055;
            int var4 = (Statics.field2392.field983 >> 7) + Statics.field1262;
            int var5 = (Statics.field2392.field940 >> 7) + Statics.field2367;
            client.method111().method5870(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1090[--Statics.field3841];
            String var7 = "";
            class27 var8 = client.method111().method5888(var6);
            if (var8 != null) {
                var7 = var8.method298();
            }
            field1097[++Statics.field604 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1090[--Statics.field3841];
            client.method111().method5871(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1090[++Statics.field3841 - 1] = client.method111().method5858();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1090[--Statics.field3841];
            client.method111().method5914(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1090[++Statics.field3841 - 1] = client.method111().method5981() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class214 var11 = new class214(field1090[--Statics.field3841]);
            client.method111().method5889(var11.field2539, var11.field2537);
            return 1;
        } else if (arg0 == 6607) {
            class214 var12 = new class214(field1090[--Statics.field3841]);
            client.method111().method5890(var12.field2539, var12.field2537);
            return 1;
        } else if (arg0 == 6608) {
            class214 var13 = new class214(field1090[--Statics.field3841]);
            client.method111().method5891(var13.field2538, var13.field2539, var13.field2537);
            return 1;
        } else if (arg0 == 6609) {
            class214 var14 = new class214(field1090[--Statics.field3841]);
            client.method111().method5892(var14.field2538, var14.field2539, var14.field2537);
            return 1;
        } else if (arg0 == 6610) {
            field1090[++Statics.field3841 - 1] = client.method111().method5893();
            field1090[++Statics.field3841 - 1] = client.method111().method5894();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1090[--Statics.field3841];
            class27 var16 = client.method111().method5888(var15);
            if (var16 == null) {
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = var16.method308().method3676();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1090[--Statics.field3841];
            class27 var18 = client.method111().method5888(var17);
            if (var18 == null) {
                field1090[++Statics.field3841 - 1] = 0;
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = (var18.method302() - var18.method301() + 1) * 64;
                field1090[++Statics.field3841 - 1] = (var18.method304() - var18.method303() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1090[--Statics.field3841];
            class27 var20 = client.method111().method5888(var19);
            if (var20 == null) {
                field1090[++Statics.field3841 - 1] = 0;
                field1090[++Statics.field3841 - 1] = 0;
                field1090[++Statics.field3841 - 1] = 0;
                field1090[++Statics.field3841 - 1] = 0;
            } else {
                field1090[++Statics.field3841 - 1] = var20.method301() * 64;
                field1090[++Statics.field3841 - 1] = var20.method303() * 64;
                field1090[++Statics.field3841 - 1] = var20.method302() * 64 + 64 - 1;
                field1090[++Statics.field3841 - 1] = var20.method304() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1090[--Statics.field3841];
            class27 var22 = client.method111().method5888(var21);
            if (var22 == null) {
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = var22.method300();
            }
            return 1;
        } else if (arg0 == 6615) {
            class214 var23 = client.method111().method5895();
            if (var23 == null) {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = var23.field2539;
                field1090[++Statics.field3841 - 1] = var23.field2537;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1090[++Statics.field3841 - 1] = client.method111().method5882();
            return 1;
        } else if (arg0 == 6617) {
            class214 var24 = new class214(field1090[--Statics.field3841]);
            class27 var25 = client.method111().method5873();
            if (var25 == null) {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method292(var24.field2538, var24.field2539, var24.field2537);
            if (var26 == null) {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = var26[0];
                field1090[++Statics.field3841 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class214 var27 = new class214(field1090[--Statics.field3841]);
            class27 var28 = client.method111().method5873();
            if (var28 == null) {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = -1;
                return 1;
            }
            class214 var29 = var28.method358(var27.field2539, var27.field2537);
            if (var29 == null) {
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = var29.method3676();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field3841 -= 2;
            int var30 = field1090[Statics.field3841];
            class214 var31 = new class214(field1090[Statics.field3841 + 1]);
            method607(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field3841 -= 2;
            int var32 = field1090[Statics.field3841];
            class214 var33 = new class214(field1090[Statics.field3841 + 1]);
            method607(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field3841 -= 2;
            int var34 = field1090[Statics.field3841];
            class214 var35 = new class214(field1090[Statics.field3841 + 1]);
            class27 var36 = client.method111().method5888(var34);
            if (var36 == null) {
                field1090[++Statics.field3841 - 1] = 0;
                return 1;
            } else {
                field1090[++Statics.field3841 - 1] = var36.method290(var35.field2538, var35.field2539, var35.field2537) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1090[++Statics.field3841 - 1] = client.method111().method5896();
            field1090[++Statics.field3841 - 1] = client.method111().method5897();
            return 1;
        } else if (arg0 == 6623) {
            class214 var37 = new class214(field1090[--Statics.field3841]);
            class27 var38 = client.method111().method5968(var37.field2538, var37.field2539, var37.field2537);
            if (var38 == null) {
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = var38.method338();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method111().method5898(field1090[--Statics.field3841]);
            return 1;
        } else if (arg0 == 6625) {
            client.method111().method5899();
            return 1;
        } else if (arg0 == 6626) {
            client.method111().method5900(field1090[--Statics.field3841]);
            return 1;
        } else if (arg0 == 6627) {
            client.method111().method5901();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1090[--Statics.field3841] == 1;
            client.method111().method5902(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1090[--Statics.field3841];
            client.method111().method5903(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1090[--Statics.field3841];
            client.method111().method5884(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method111().method5881();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1090[--Statics.field3841] == 1;
            client.method111().method5936(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field3841 -= 2;
            int var43 = field1090[Statics.field3841];
            boolean var44 = field1090[Statics.field3841 + 1] == 1;
            client.method111().method5907(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field3841 -= 2;
            int var45 = field1090[Statics.field3841];
            boolean var46 = field1090[Statics.field3841 + 1] == 1;
            client.method111().method5885(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1090[++Statics.field3841 - 1] = client.method111().method5866() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = client.method111().method5872(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1090[--Statics.field3841];
            field1090[++Statics.field3841 - 1] = client.method111().method5911(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field3841 -= 2;
            int var49 = field1090[Statics.field3841];
            class214 var50 = new class214(field1090[Statics.field3841 + 1]);
            class214 var51 = client.method111().method5910(var49, var50);
            if (var51 == null) {
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = var51.method3676();
            }
            return 1;
        } else if (arg0 == 6639) {
            class35 var52 = client.method111().method5916();
            if (var52 == null) {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = var52.method180();
                field1090[++Statics.field3841 - 1] = var52.field306.method3676();
            }
            return 1;
        } else if (arg0 == 6640) {
            class35 var53 = client.method111().method5864();
            if (var53 == null) {
                field1090[++Statics.field3841 - 1] = -1;
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = var53.method180();
                field1090[++Statics.field3841 - 1] = var53.field306.method3676();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1090[--Statics.field3841];
            class243 var55 = class243.method3377(var54);
            if (var55.field3213 == null) {
                field1097[++Statics.field604 - 1] = "";
            } else {
                field1097[++Statics.field604 - 1] = var55.field3213;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1090[--Statics.field3841];
            class243 var57 = class243.method3377(var56);
            field1090[++Statics.field3841 - 1] = var57.field3217;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1090[--Statics.field3841];
            class243 var59 = class243.method3377(var58);
            if (var59 == null) {
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = var59.field3215;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1090[--Statics.field3841];
            class243 var61 = class243.method3377(var60);
            if (var61 == null) {
                field1090[++Statics.field3841 - 1] = -1;
            } else {
                field1090[++Statics.field3841 - 1] = var61.field3226;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1090[++Statics.field3841 - 1] = Statics.field135.field366;
            return 1;
        } else if (arg0 == 6698) {
            field1090[++Statics.field3841 - 1] = Statics.field135.field360.method3676();
            return 1;
        } else if (arg0 == 6699) {
            field1090[++Statics.field3841 - 1] = Statics.field135.field361.method3676();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.am(II)V")
    public static void method176(int arg0) {
        if (arg0 == -1 || !class218.method1013(arg0)) {
            return;
        }
        class218[] var1 = Statics.field248[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3.field2660 != null) {
                class63 var4 = new class63();
                var4.field574 = var3;
                var4.field585 = var3.field2660;
                method506(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("ar.ao(ILhj;ZB)V")
    public static void method607(int arg0, class214 arg1, boolean arg2) {
        class27 var3 = client.method111().method5888(arg0);
        int var4 = Statics.field2392.field614;
        int var5 = (Statics.field2392.field983 >> 7) + Statics.field1262;
        int var6 = (Statics.field2392.field940 >> 7) + Statics.field2367;
        class214 var7 = new class214(var4, var5, var6);
        client.method111().method5876(var3, var7, arg1, arg2);
    }
}
