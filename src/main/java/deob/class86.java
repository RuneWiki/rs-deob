package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cc")
public class class86 {

    @ObfuscatedName("cc.n")
    public static int[] field1091 = new int[5];

    @ObfuscatedName("cc.p")
    public static int[][] field1095 = new int[5][5000];

    @ObfuscatedName("cc.l")
    public static int[] field1096 = new int[1000];

    @ObfuscatedName("cc.u")
    public static String[] field1097 = new String[1000];

    @ObfuscatedName("cc.m")
    public static int field1099 = 0;

    @ObfuscatedName("cc.c")
    public static class66[] field1100 = new class66[50];

    @ObfuscatedName("cc.a")
    public static Calendar field1092 = Calendar.getInstance();

    @ObfuscatedName("cc.b")
    public static final String[] field1102 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cc.r")
    public static boolean field1105 = false;

    @ObfuscatedName("cc.q")
    public static boolean field1104 = false;

    @ObfuscatedName("cc.g")
    public static int field1098 = 0;

    @ObfuscatedName("cc.d")
    public static final double field1094 = Math.log(2.0D);

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.h(Lbb;I)V")
    public static void method197(class72 arg0) {
        method1977(arg0, 500000);
    }

    @ObfuscatedName("cw.v(Lbb;II)V")
    public static void method1977(class72 arg0, int arg1) {
        Object[] var2 = arg0.field573;
        class102 var4;
        if (class305.method3963(arg0.field581)) {
            Statics.field1303 = (class51) var2[0];
            class253 var3 = class253.method3211(Statics.field1303.field375);
            var4 = class102.method2023(arg0.field581, var3.field3249, var3.field3253);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class102.method2150(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field3268 = 0;
        Statics.field1106 = 0;
        int var6 = -1;
        int[] var7 = var4.field1301;
        int[] var8 = var4.field1295;
        byte var9 = -1;
        field1099 = 0;
        field1105 = false;
        try {
            Statics.field566 = new int[var4.field1297];
            int var10 = 0;
            Statics.field3666 = new String[var4.field1298];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field571;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field580;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field572 == null ? -1 : arg0.field572.field2587;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field575;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field572 == null ? -1 : arg0.field572.field2588;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field576 == null ? -1 : arg0.field576.field2587;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field576 == null ? -1 : arg0.field576.field2588;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field577;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field578;
                    }
                    Statics.field566[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field579;
                    }
                    Statics.field3666[var11++] = var14;
                }
            }
            int var15 = 0;
            field1098 = arg0.field570;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1295[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = method3107(var53, var4, var43);
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
                    field1096[++Statics.field3268 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    field1096[++Statics.field3268 - 1] = class222.field2542[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class222.field2542[var17] = field1096[--Statics.field3268];
                    client.method2134(var17);
                } else if (var53 == 3) {
                    field1097[++Statics.field1106 - 1] = var4.field1296[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    Statics.field3268 -= 2;
                    if (field1096[Statics.field3268] != field1096[Statics.field3268 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    Statics.field3268 -= 2;
                    if (field1096[Statics.field3268] == field1096[Statics.field3268 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    Statics.field3268 -= 2;
                    if (field1096[Statics.field3268] < field1096[Statics.field3268 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    Statics.field3268 -= 2;
                    if (field1096[Statics.field3268] > field1096[Statics.field3268 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (field1099 == 0) {
                        return;
                    }
                    class66 var18 = field1100[--field1099];
                    var4 = var18.field523;
                    var7 = var4.field1301;
                    var8 = var4.field1295;
                    var6 = var18.field526;
                    Statics.field566 = var18.field524;
                    Statics.field3666 = var18.field525;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    field1096[++Statics.field3268 - 1] = class222.method3680(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    class222.method4122(var20, field1096[--Statics.field3268]);
                } else if (var53 == 31) {
                    Statics.field3268 -= 2;
                    if (field1096[Statics.field3268] <= field1096[Statics.field3268 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    Statics.field3268 -= 2;
                    if (field1096[Statics.field3268] >= field1096[Statics.field3268 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    field1096[++Statics.field3268 - 1] = Statics.field566[var8[var6]];
                } else if (var53 == 34) {
                    Statics.field566[var8[var6]] = field1096[--Statics.field3268];
                } else if (var53 == 35) {
                    field1097[++Statics.field1106 - 1] = Statics.field3666[var8[var6]];
                } else if (var53 == 36) {
                    Statics.field3666[var8[var6]] = field1097[--Statics.field1106];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    Statics.field1106 -= var21;
                    String var22 = class302.method1969(field1097, Statics.field1106, var21);
                    field1097[++Statics.field1106 - 1] = var22;
                } else if (var53 == 38) {
                    Statics.field3268--;
                } else if (var53 == 39) {
                    Statics.field1106--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class102 var24 = class102.method2150(var23);
                    int[] var25 = new int[var24.field1297];
                    String[] var26 = new String[var24.field1298];
                    for (int var27 = 0; var27 < var24.field1299; var27++) {
                        var25[var27] = field1096[Statics.field3268 - var24.field1299 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1293; var28++) {
                        var26[var28] = field1097[Statics.field1106 - var24.field1293 + var28];
                    }
                    Statics.field3268 -= var24.field1299;
                    Statics.field1106 -= var24.field1293;
                    class66 var29 = new class66();
                    var29.field523 = var4;
                    var29.field526 = var6;
                    var29.field524 = Statics.field566;
                    var29.field525 = Statics.field3666;
                    field1100[++field1099 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1301;
                    var8 = var24.field1295;
                    var6 = -1;
                    Statics.field566 = var25;
                    Statics.field3666 = var26;
                } else if (var53 == 42) {
                    field1096[++Statics.field3268 - 1] = Statics.field1271.method2063(var8[var6]);
                } else if (var53 == 43) {
                    Statics.field1271.method2065(var8[var6], field1096[--Statics.field3268]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = field1096[--Statics.field3268];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    field1091[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        field1095[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = field1096[--Statics.field3268];
                    if (var36 < 0 || var36 >= field1091[var35]) {
                        throw new RuntimeException();
                    }
                    field1096[++Statics.field3268 - 1] = field1095[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    Statics.field3268 -= 2;
                    int var38 = field1096[Statics.field3268];
                    if (var38 < 0 || var38 >= field1091[var37]) {
                        throw new RuntimeException();
                    }
                    field1095[var37][var38] = field1096[Statics.field3268 + 1];
                } else if (var53 == 47) {
                    String var39 = Statics.field1271.method2067(var8[var6]);
                    if (var39 == null) {
                        var39 = class234.field2792;
                    }
                    field1097[++Statics.field1106 - 1] = var39;
                } else if (var53 == 48) {
                    Statics.field1271.method2066(var8[var6], field1097[--Statics.field1106]);
                } else if (var53 == 49) {
                    String var40 = Statics.field1271.method2068(var8[var6]);
                    field1097[++Statics.field1106 - 1] = var40;
                } else if (var53 == 50) {
                    Statics.field1271.method2064(var8[var6], field1097[--Statics.field1106]);
                } else if (var53 == 60) {
                    class327 var41 = var4.field1306[var8[var6]];
                    class189 var42 = (class189) var41.method5494((long) field1096[--Statics.field3268]);
                    if (var42 != null) {
                        var6 += var42.field2136;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2138).append(" ");
            for (int var47 = field1099 - 1; var47 >= 0; var47--) {
                var46.append("").append(field1100[var47].field523.field2138).append(" ");
            }
            var46.append("").append(var9);
            class352.method3694(var46.toString(), var51);
        } finally {
            if (field1105) {
                field1104 = true;
                client.method3366();
                field1104 = false;
                field1105 = false;
            }
        }
    }

    @ObfuscatedName("ef.x(ILcs;ZI)I")
    public static int method3107(int arg0, class102 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method3801(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method3410(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method633(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method3203(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return Statics.method1092(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method3413(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method2118(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return Statics.method178(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method4633(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method303(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3116(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method3410(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method633(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method3203(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return Statics.method1092(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method3413(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method199(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method307(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method309(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method300(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3116(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method542(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method223(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return Statics.method3409(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method2620(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return Statics.method1181(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method124(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method544(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method196(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3827(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method4147(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return Statics.method795(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method4091(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method570(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method541(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method4358(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method724(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hb.w(ILcs;ZI)I")
    public static int method3801(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field3268 -= 3;
            int var3 = field1096[Statics.field3268];
            int var4 = field1096[Statics.field3268 + 1];
            int var5 = field1096[Statics.field3268 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class227 var6 = class227.method3345(var3);
            if (var6.field2673 == null) {
                var6.field2673 = new class227[var5 + 1];
            }
            if (var6.field2673.length <= var5) {
                class227[] var7 = new class227[var5 + 1];
                for (int var8 = 0; var8 < var6.field2673.length; var8++) {
                    var7[var8] = var6.field2673[var8];
                }
                var6.field2673 = var7;
            }
            if (var5 > 0 && var6.field2673[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class227 var9 = new class227();
            var9.field2589 = var4;
            var9.field2671 = var9.field2587 = var6.field2587;
            var9.field2588 = var5;
            var9.field2586 = true;
            var6.field2673[var5] = var9;
            if (arg2) {
                Statics.field2562 = var9;
            } else {
                Statics.field3265 = var9;
            }
            client.method3344(var6);
            return 1;
        } else if (arg0 == 101) {
            class227 var10 = arg2 ? Statics.field2562 : Statics.field3265;
            class227 var11 = class227.method3345(var10.field2587);
            var11.field2673[var10.field2588] = null;
            client.method3344(var11);
            return 1;
        } else if (arg0 == 102) {
            class227 var12 = class227.method3345(field1096[--Statics.field3268]);
            var12.field2673 = null;
            client.method3344(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field3268 -= 2;
            int var13 = field1096[Statics.field3268];
            int var14 = field1096[Statics.field3268 + 1];
            class227 var15 = class227.method1975(var13, var14);
            if (var15 == null || var14 == -1) {
                field1096[++Statics.field3268 - 1] = 0;
            } else {
                field1096[++Statics.field3268 - 1] = 1;
                if (arg2) {
                    Statics.field2562 = var15;
                } else {
                    Statics.field3265 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class227 var16 = class227.method3345(field1096[--Statics.field3268]);
            if (var16 == null) {
                field1096[++Statics.field3268 - 1] = 0;
            } else {
                field1096[++Statics.field3268 - 1] = 1;
                if (arg2) {
                    Statics.field2562 = var16;
                } else {
                    Statics.field3265 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gp.t(ILcs;ZS)I")
    public static int method3410(int arg0, class102 arg1, boolean arg2) {
        int var3 = -1;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1096[--Statics.field3268];
            var4 = class227.method3345(var3);
        } else {
            var4 = arg2 ? Statics.field2562 : Statics.field3265;
        }
        if (arg0 == 1000) {
            Statics.field3268 -= 4;
            var4.field2596 = field1096[Statics.field3268];
            var4.field2580 = field1096[Statics.field3268 + 1];
            var4.field2592 = field1096[Statics.field3268 + 2];
            var4.field2693 = field1096[Statics.field3268 + 3];
            client.method3344(var4);
            Statics.field148.method1542(var4);
            if (var3 != -1 && var4.field2589 == 0) {
                client.method1655(Statics.field45[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field3268 -= 4;
            var4.field2598 = field1096[Statics.field3268];
            var4.field2599 = field1096[Statics.field3268 + 1];
            var4.field2594 = field1096[Statics.field3268 + 2];
            var4.field2595 = field1096[Statics.field3268 + 3];
            client.method3344(var4);
            Statics.field148.method1542(var4);
            if (var3 != -1 && var4.field2589 == 0) {
                client.method1655(Statics.field45[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1096[--Statics.field3268] == 1;
            if (var4.field2644 != var5) {
                var4.field2644 = var5;
                client.method3344(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2727 = field1096[--Statics.field3268] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2728 = field1096[--Statics.field3268] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("af.j(ILcs;ZB)I")
    public static int method633(int arg0, class102 arg1, boolean arg2) {
        int var3 = -1;
        class227 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1096[--Statics.field3268];
            var4 = class227.method3345(var3);
        } else {
            var4 = arg2 ? Statics.field2562 : Statics.field3265;
        }
        if (arg0 == 1100) {
            Statics.field3268 -= 2;
            var4.field2608 = field1096[Statics.field3268];
            if (var4.field2608 > var4.field2610 - var4.field2602) {
                var4.field2608 = var4.field2610 - var4.field2602;
            }
            if (var4.field2608 < 0) {
                var4.field2608 = 0;
            }
            var4.field2609 = field1096[Statics.field3268 + 1];
            if (var4.field2609 > var4.field2640 - var4.field2603) {
                var4.field2609 = var4.field2640 - var4.field2603;
            }
            if (var4.field2609 < 0) {
                var4.field2609 = 0;
            }
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2612 = field1096[--Statics.field3268];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2616 = field1096[--Statics.field3268] == 1;
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2653 = field1096[--Statics.field3268];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2620 = field1096[--Statics.field3268];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2622 = field1096[--Statics.field3268];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2628 = field1096[--Statics.field3268];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2625 = field1096[--Statics.field3268] == 1;
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2630 = 1;
            var4.field2688 = field1096[--Statics.field3268];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field3268 -= 6;
            var4.field2636 = field1096[Statics.field3268];
            var4.field2681 = field1096[Statics.field3268 + 1];
            var4.field2584 = field1096[Statics.field3268 + 2];
            var4.field2639 = field1096[Statics.field3268 + 3];
            var4.field2658 = field1096[Statics.field3268 + 4];
            var4.field2641 = field1096[Statics.field3268 + 5];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1096[--Statics.field3268];
            if (var4.field2634 != var5) {
                var4.field2634 = var5;
                var4.field2719 = 0;
                var4.field2716 = 0;
                client.method3344(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2711 = field1096[--Statics.field3268] == 1;
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1097[--Statics.field1106];
            if (!var6.equals(var4.field2648)) {
                var4.field2648 = var6;
                client.method3344(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2647 = field1096[--Statics.field3268];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field3268 -= 3;
            var4.field2651 = field1096[Statics.field3268];
            var4.field2652 = field1096[Statics.field3268 + 1];
            var4.field2664 = field1096[Statics.field3268 + 2];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2694 = field1096[--Statics.field3268] == 1;
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2626 = field1096[--Statics.field3268];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2627 = field1096[--Statics.field3268];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2618 = field1096[--Statics.field3268] == 1;
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2629 = field1096[--Statics.field3268] == 1;
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field3268 -= 2;
            var4.field2610 = field1096[Statics.field3268];
            var4.field2640 = field1096[Statics.field3268 + 1];
            client.method3344(var4);
            if (var3 != -1 && var4.field2589 == 0) {
                client.method1655(Statics.field45[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method2136(var4.field2587, var4.field2588);
            client.field823 = var4;
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2623 = field1096[--Statics.field3268];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2613 = field1096[--Statics.field3268];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2637 = field1096[--Statics.field3268];
            client.method3344(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1096[--Statics.field3268];
            class334 var8 = (class334) class205.method3134(class334.method3308(), var7);
            if (var8 != null) {
                var4.field2617 = var8;
                client.method3344(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1096[--Statics.field3268] == 1;
            var4.field2621 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1096[--Statics.field3268] == 1;
            var4.field2674 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fj.n(ILcs;ZI)I")
    public static int method3203(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method3345(field1096[--Statics.field3268]);
        } else {
            var3 = arg2 ? Statics.field2562 : Statics.field3265;
        }
        client.method3344(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field3268 -= 2;
            int var4 = field1096[Statics.field3268];
            int var5 = field1096[Statics.field3268 + 1];
            var3.field2713 = var4;
            var3.field2714 = var5;
            class266 var6 = class266.method1102(var4);
            var3.field2584 = var6.field3458;
            var3.field2639 = var6.field3452;
            var3.field2658 = var6.field3453;
            var3.field2636 = var6.field3454;
            var3.field2681 = var6.field3473;
            var3.field2641 = var6.field3450;
            if (arg0 == 1205) {
                var3.field2645 = 0;
            } else if (arg0 == 1212 | var6.field3456 == 1) {
                var3.field2645 = 1;
            } else {
                var3.field2645 = 2;
            }
            if (var3.field2642 > 0) {
                var3.field2641 = var3.field2641 * 32 / var3.field2642;
            } else if (var3.field2598 > 0) {
                var3.field2641 = var3.field2641 * 32 / var3.field2598;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2630 = 2;
            var3.field2688 = field1096[--Statics.field3268];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2630 = 3;
            var3.field2688 = Statics.field2563.field622.method3699();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bj.l(Lhe;I[B[BI)V")
    public static final void method1127(class227 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2650 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2650 = new byte[11][];
            arg0.field2638 = new byte[11][];
            arg0.field2680 = new int[11];
            arg0.field2665 = new int[11];
        }
        arg0.field2650[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2591 = false;
            for (int var4 = 0; var4 < arg0.field2650.length; var4++) {
                if (arg0.field2650[var4] != null) {
                    arg0.field2591 = true;
                    break;
                }
            }
        } else {
            arg0.field2591 = true;
        }
        arg0.field2638[arg1] = arg3;
    }

    @ObfuscatedName("bq.z(Lhe;IIII)V")
    public static final void method1182(class227 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2680 == null) {
            throw new RuntimeException();
        }
        arg0.field2680[arg1] = arg2;
        arg0.field2665[arg1] = arg3;
    }

    @ObfuscatedName("r.u(Lhe;II)V")
    public static final void method169(class227 arg0, int arg1) {
        if (arg0.field2650 == null) {
            throw new RuntimeException();
        }
        if (arg0.field2685 == null) {
            arg0.field2685 = new int[arg0.field2650.length];
        }
        arg0.field2685[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("ge.e(ILcs;ZI)I")
    public static int method3413(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method3345(field1096[--Statics.field3268]);
        } else {
            var3 = arg2 ? Statics.field2562 : Statics.field3265;
        }
        String var4 = field1097[--Statics.field1106];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1096[--Statics.field3268];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1096[--Statics.field3268];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1097[--Statics.field1106];
            } else {
                var7[var8] = Integer.valueOf(field1096[--Statics.field3268]);
            }
        }
        int var9 = field1096[--Statics.field3268];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2675 = var7;
        } else if (arg0 == 1401) {
            var3.field2678 = var7;
        } else if (arg0 == 1402) {
            var3.field2677 = var7;
        } else if (arg0 == 1403) {
            var3.field2679 = var7;
        } else if (arg0 == 1404) {
            var3.field2607 = var7;
        } else if (arg0 == 1405) {
            var3.field2593 = var7;
        } else if (arg0 == 1406) {
            var3.field2585 = var7;
        } else if (arg0 == 1407) {
            var3.field2686 = var7;
            var3.field2662 = var5;
        } else if (arg0 == 1408) {
            var3.field2631 = var7;
        } else if (arg0 == 1409) {
            var3.field2614 = var7;
        } else if (arg0 == 1410) {
            var3.field2683 = var7;
        } else if (arg0 == 1411) {
            var3.field2676 = var7;
        } else if (arg0 == 1412) {
            var3.field2619 = var7;
        } else if (arg0 == 1414) {
            var3.field2633 = var7;
            var3.field2689 = var5;
        } else if (arg0 == 1415) {
            var3.field2690 = var7;
            var3.field2691 = var5;
        } else if (arg0 == 1416) {
            var3.field2684 = var7;
        } else if (arg0 == 1417) {
            var3.field2654 = var7;
        } else if (arg0 == 1418) {
            var3.field2582 = var7;
        } else if (arg0 == 1419) {
            var3.field2717 = var7;
        } else if (arg0 == 1420) {
            var3.field2697 = var7;
        } else if (arg0 == 1421) {
            var3.field2698 = var7;
        } else if (arg0 == 1422) {
            var3.field2699 = var7;
        } else if (arg0 == 1423) {
            var3.field2700 = var7;
        } else if (arg0 == 1424) {
            var3.field2611 = var7;
        } else if (arg0 == 1425) {
            var3.field2703 = var7;
        } else if (arg0 == 1426) {
            var3.field2704 = var7;
        } else if (arg0 == 1427) {
            var3.field2702 = var7;
        } else {
            return 2;
        }
        var3.field2576 = true;
        return 1;
    }

    @ObfuscatedName("cv.m(ILcs;ZI)I")
    public static int method2118(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field2562 : Statics.field3265;
        if (arg0 == 1500) {
            field1096[++Statics.field3268 - 1] = var3.field2695;
            return 1;
        } else if (arg0 == 1501) {
            field1096[++Statics.field3268 - 1] = var3.field2601;
            return 1;
        } else if (arg0 == 1502) {
            field1096[++Statics.field3268 - 1] = var3.field2602;
            return 1;
        } else if (arg0 == 1503) {
            field1096[++Statics.field3268 - 1] = var3.field2603;
            return 1;
        } else if (arg0 == 1504) {
            field1096[++Statics.field3268 - 1] = var3.field2644 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1096[++Statics.field3268 - 1] = var3.field2671;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jh.i(ILcs;ZI)I")
    public static int method4633(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field2562 : Statics.field3265;
        if (arg0 == 1700) {
            field1096[++Statics.field3268 - 1] = var3.field2713;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2713 == -1) {
                field1096[++Statics.field3268 - 1] = 0;
            } else {
                field1096[++Statics.field3268 - 1] = var3.field2714;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1096[++Statics.field3268 - 1] = var3.field2588;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("as.f(ILcs;ZI)I")
    public static int method303(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = arg2 ? Statics.field2562 : Statics.field3265;
        if (arg0 == 1800) {
            field1096[++Statics.field3268 - 1] = class228.method3369(client.method3108(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1096[--Statics.field3268];
            int var5 = var4 - 1;
            if (var3.field2663 == null || var5 >= var3.field2663.length || var3.field2663[var5] == null) {
                field1097[++Statics.field1106 - 1] = "";
            } else {
                field1097[++Statics.field1106 - 1] = var3.field2663[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2666 == null) {
                field1097[++Statics.field1106 - 1] = "";
            } else {
                field1097[++Statics.field1106 - 1] = var3.field2666;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ep.y(ILcs;ZI)I")
    public static int method3116(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field1098 >= 10) {
                throw new RuntimeException();
            }
            class227 var8;
            if (arg0 >= 2000) {
                var8 = class227.method3345(field1096[--Statics.field3268]);
            } else {
                var8 = arg2 ? Statics.field2562 : Statics.field3265;
            }
            if (var8.field2702 == null) {
                return 0;
            }
            class72 var9 = new class72();
            var9.field572 = var8;
            var9.field573 = var8.field2702;
            var9.field570 = field1098 + 1;
            client.field848.method4549(var9);
            return 1;
        } else if (arg0 == 1928) {
            class227 var3 = arg2 ? Statics.field2562 : Statics.field3265;
            int var4 = field1096[--Statics.field3268];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            client.method22(var4, var3.field2587, var3.field2588, var3.field2713, "");
            return 1;
        } else if (arg0 == 2928) {
            Statics.field3268 -= 3;
            int var5 = field1096[Statics.field3268];
            int var6 = field1096[Statics.field3268 + 1];
            int var7 = field1096[Statics.field3268 + 2];
            if (var7 < 1 || var7 > 10) {
                throw new RuntimeException();
            }
            client.method22(var7, var5, var6, class227.method3345(var5).field2713, "");
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("s.r(ILcs;ZI)I")
    public static int method199(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method3345(field1096[--Statics.field3268]);
        if (arg0 == 2500) {
            field1096[++Statics.field3268 - 1] = var3.field2695;
            return 1;
        } else if (arg0 == 2501) {
            field1096[++Statics.field3268 - 1] = var3.field2601;
            return 1;
        } else if (arg0 == 2502) {
            field1096[++Statics.field3268 - 1] = var3.field2602;
            return 1;
        } else if (arg0 == 2503) {
            field1096[++Statics.field3268 - 1] = var3.field2603;
            return 1;
        } else if (arg0 == 2504) {
            field1096[++Statics.field3268 - 1] = var3.field2644 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1096[++Statics.field3268 - 1] = var3.field2671;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ae.q(ILcs;ZI)I")
    public static int method307(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method3345(field1096[--Statics.field3268]);
        if (arg0 == 2600) {
            field1096[++Statics.field3268 - 1] = var3.field2608;
            return 1;
        } else if (arg0 == 2601) {
            field1096[++Statics.field3268 - 1] = var3.field2609;
            return 1;
        } else if (arg0 == 2602) {
            field1097[++Statics.field1106 - 1] = var3.field2648;
            return 1;
        } else if (arg0 == 2603) {
            field1096[++Statics.field3268 - 1] = var3.field2610;
            return 1;
        } else if (arg0 == 2604) {
            field1096[++Statics.field3268 - 1] = var3.field2640;
            return 1;
        } else if (arg0 == 2605) {
            field1096[++Statics.field3268 - 1] = var3.field2641;
            return 1;
        } else if (arg0 == 2606) {
            field1096[++Statics.field3268 - 1] = var3.field2584;
            return 1;
        } else if (arg0 == 2607) {
            field1096[++Statics.field3268 - 1] = var3.field2658;
            return 1;
        } else if (arg0 == 2608) {
            field1096[++Statics.field3268 - 1] = var3.field2639;
            return 1;
        } else if (arg0 == 2609) {
            field1096[++Statics.field3268 - 1] = var3.field2653;
            return 1;
        } else if (arg0 == 2610) {
            field1096[++Statics.field3268 - 1] = var3.field2637;
            return 1;
        } else if (arg0 == 2611) {
            field1096[++Statics.field3268 - 1] = var3.field2612;
            return 1;
        } else if (arg0 == 2612) {
            field1096[++Statics.field3268 - 1] = var3.field2613;
            return 1;
        } else if (arg0 == 2613) {
            field1096[++Statics.field3268 - 1] = var3.field2617.method18();
            return 1;
        } else if (arg0 == 2614) {
            field1096[++Statics.field3268 - 1] = var3.field2674 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ae.g(ILcs;ZS)I")
    public static int method309(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class227 var3 = class227.method3345(field1096[--Statics.field3268]);
            field1096[++Statics.field3268 - 1] = var3.field2713;
            return 1;
        } else if (arg0 == 2701) {
            class227 var4 = class227.method3345(field1096[--Statics.field3268]);
            if (var4.field2713 == -1) {
                field1096[++Statics.field3268 - 1] = 0;
            } else {
                field1096[++Statics.field3268 - 1] = var4.field2714;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1096[--Statics.field3268];
            class71 var6 = (class71) client.field834.method5543((long) var5);
            if (var6 == null) {
                field1096[++Statics.field3268 - 1] = 0;
            } else {
                field1096[++Statics.field3268 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1096[++Statics.field3268 - 1] = client.field874;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.o(ILcs;ZI)I")
    public static int method300(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method3345(field1096[--Statics.field3268]);
        if (arg0 == 2800) {
            field1096[++Statics.field3268 - 1] = class228.method3369(client.method3108(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1096[--Statics.field3268];
            int var5 = var4 - 1;
            if (var3.field2663 == null || var5 >= var3.field2663.length || var3.field2663[var5] == null) {
                field1097[++Statics.field1106 - 1] = "";
            } else {
                field1097[++Statics.field1106 - 1] = var3.field2663[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2666 == null) {
                field1097[++Statics.field1106 - 1] = "";
            } else {
                field1097[++Statics.field1106 - 1] = var3.field2666;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ao.an(ILcs;ZI)I")
    public static int method542(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1097[--Statics.field1106];
            Statics.method3809(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field3268 -= 2;
            client.method1089(Statics.field2563, field1096[Statics.field3268], field1096[Statics.field3268 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field1104) {
                field1105 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1097[--Statics.field1106];
            int var5 = 0;
            if (class302.method3829(var4)) {
                var5 = class302.method4635(var4);
            }
            class197 var6 = class197.method1128(class193.field2292, client.field695.field1329);
            var6.field2361.method5123(var5);
            client.field695.method2155(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field1097[--Statics.field1106];
            class197 var8 = class197.method1128(class193.field2246, client.field695.field1329);
            var8.field2361.method5095(var7.length() + 1);
            var8.field2361.method5105(var7);
            client.field695.method2155(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field1097[--Statics.field1106];
            class197 var10 = class197.method1128(class193.field2262, client.field695.field1329);
            var10.field2361.method5095(var9.length() + 1);
            var10.field2361.method5105(var9);
            client.field695.method2155(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field1096[--Statics.field3268];
            String var12 = field1097[--Statics.field1106];
            client.method2701(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field3268 -= 3;
            int var13 = field1096[Statics.field3268];
            int var14 = field1096[Statics.field3268 + 1];
            int var15 = field1096[Statics.field3268 + 2];
            class227 var16 = class227.method3345(var15);
            client.method108(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field3268 -= 2;
            int var17 = field1096[Statics.field3268];
            int var18 = field1096[Statics.field3268 + 1];
            class227 var19 = arg2 ? Statics.field2562 : Statics.field3265;
            client.method108(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1990 = field1096[--Statics.field3268] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1096[++Statics.field3268 - 1] = Statics.field3618.field1053 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field3618.field1053 = field1096[--Statics.field3268] == 1;
            class83.method165();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field1097[--Statics.field1106];
            boolean var21 = field1096[--Statics.field3268] == 1;
            class61.method1978(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field1096[--Statics.field3268];
            class197 var23 = class197.method1128(class193.field2251, client.field695.field1329);
            var23.field2361.method5099(var22);
            client.field695.method2155(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field1096[--Statics.field3268];
            Statics.field1106 -= 2;
            String var25 = field1097[Statics.field1106];
            String var26 = field1097[Statics.field1106 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class197 var27 = class197.method1128(class193.field2271, client.field695.field1329);
                var27.field2361.method5099(1 + class311.method2704(var25) + class311.method2704(var26));
                var27.field2361.method5095(var24);
                var27.field2361.method5105(var25);
                var27.field2361.method5105(var26);
                client.field695.method2155(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field664 = field1096[--Statics.field3268] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field797 = field1096[--Statics.field3268] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field726 = field1096[--Statics.field3268] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1096[--Statics.field3268] == 1) {
                client.field769 |= 0x1;
            } else {
                client.field769 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1096[--Statics.field3268] == 1) {
                client.field769 |= 0x2;
            } else {
                client.field769 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1096[--Statics.field3268] == 1) {
                client.field769 |= 0x4;
            } else {
                client.field769 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1096[--Statics.field3268] == 1) {
                client.field769 |= 0x8;
            } else {
                client.field769 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field769 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field754 = field1096[--Statics.field3268] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field764 = field1096[--Statics.field3268] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method229(field1096[--Statics.field3268] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1096[++Statics.field3268 - 1] = client.method30() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field3268 -= 2;
            client.field729 = field1096[Statics.field3268];
            client.field677 = field1096[Statics.field3268 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field3268 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field3268--;
            return 1;
        } else if (arg0 == 3132) {
            field1096[++Statics.field3268 - 1] = Statics.field3639;
            field1096[++Statics.field3268 - 1] = Statics.field1893;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field3268--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field3268 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field811 = 3;
            client.field812 = field1096[--Statics.field3268];
            return 1;
        } else if (arg0 == 3137) {
            client.field811 = 2;
            client.field812 = field1096[--Statics.field3268];
            return 1;
        } else if (arg0 == 3138) {
            client.field811 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field811 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field811 = 3;
            client.field812 = arg2 ? Statics.field2562.field2587 : Statics.field3265.field2587;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field1096[--Statics.field3268] == 1;
            Statics.field3618.field1054 = var28;
            class83.method165();
            return 1;
        } else if (arg0 == 3142) {
            field1096[++Statics.field3268 - 1] = Statics.field3618.field1054 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field1096[--Statics.field3268] == 1;
            client.field685 = var29;
            if (!var29) {
                Statics.field3618.field1051 = "";
                class83.method165();
            }
            return 1;
        } else if (arg0 == 3144) {
            field1096[++Statics.field3268 - 1] = client.field685 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field1096[--Statics.field3268] == 1;
            if (Statics.field3618.field1064 == var30) {
                Statics.field3618.field1064 = !var30;
                class83.method165();
            }
            return 1;
        } else if (arg0 == 3147) {
            field1096[++Statics.field3268 - 1] = Statics.field3618.field1064 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field1096[++Statics.field3268 - 1] = class95.field1188;
            return 1;
        } else if (arg0 == 3154) {
            field1096[++Statics.field3268 - 1] = client.method110();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1106--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field3268 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field3268--;
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field3268--;
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1106--;
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field3268--;
            field1097[++Statics.field1106 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field3268--;
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field3268 -= 2;
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field3268 -= 2;
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field3268 -= 2;
            field1097[++Statics.field1106 - 1] = "";
            field1097[++Statics.field1106 - 1] = "";
            field1097[++Statics.field1106 - 1] = "";
            field1097[++Statics.field1106 - 1] = "";
            field1097[++Statics.field1106 - 1] = "";
            field1097[++Statics.field1106 - 1] = "";
            field1097[++Statics.field1106 - 1] = "";
            field1097[++Statics.field1106 - 1] = "";
            field1097[++Statics.field1106 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field3268--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field3268--;
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field3268--;
            return 1;
        } else if (arg0 == 3175) {
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1106--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1106--;
            return 1;
        } else if (arg0 == 3181) {
            int var31 = 100 - Math.min(Math.max(field1096[--Statics.field3268], 0), 100);
            client.method554((double) ((float) var31 / 200.0F + 0.5F));
            return 1;
        } else if (arg0 == 3182) {
            float var32 = ((float) Statics.field3618.field1058 - 0.5F) * 200.0F;
            field1096[++Statics.field3268 - 1] = 100 - Math.round(var32);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.aj(ILcs;ZI)I")
    public static int method223(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field3268 -= 3;
            client.method3803(field1096[Statics.field3268], field1096[Statics.field3268 + 1], field1096[Statics.field3268 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method220(field1096[--Statics.field3268]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field3268 -= 2;
            client.method3374(field1096[Statics.field3268], field1096[Statics.field3268 + 1]);
            return 1;
        } else if (arg0 == 3203) {
            int var3 = Math.min(Math.max(field1096[--Statics.field3268], 0), 100);
            client.method704(Math.round((float) var3 * 2.55F));
            return 1;
        } else if (arg0 == 3204) {
            field1096[++Statics.field3268 - 1] = Math.round((float) Statics.field3618.field1057 / 2.55F);
            return 1;
        } else if (arg0 == 3205) {
            int var4 = Math.min(Math.max(field1096[--Statics.field3268], 0), 100);
            client.method574(Math.round((float) var4 * 1.27F));
            return 1;
        } else if (arg0 == 3206) {
            field1096[++Statics.field3268 - 1] = Math.round((float) Statics.field3618.field1060 / 1.27F);
            return 1;
        } else if (arg0 == 3207) {
            int var5 = Math.min(Math.max(field1096[--Statics.field3268], 0), 100);
            client.method3378(Math.round((float) var5 * 1.27F));
            return 1;
        } else if (arg0 == 3208) {
            field1096[++Statics.field3268 - 1] = Math.round((float) Statics.field3618.field1061 / 1.27F);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dz.ag(ILcs;ZI)I")
    public static int method2620(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field3268 -= 2;
            int var3 = field1096[Statics.field3268];
            int var4 = field1096[Statics.field3268 + 1];
            class263 var5 = class263.method3538(var3);
            if (var5.field3343 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3346; var6++) {
                if (var5.field3347[var6] == var4) {
                    field1097[++Statics.field1106 - 1] = var5.field3352[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1097[++Statics.field1106 - 1] = var5.field3344;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field3268 -= 4;
            int var7 = field1096[Statics.field3268];
            int var8 = field1096[Statics.field3268 + 1];
            int var9 = field1096[Statics.field3268 + 2];
            int var10 = field1096[Statics.field3268 + 3];
            class263 var11 = class263.method3538(var9);
            if (var11.field3340 != var7 || var11.field3343 != var8) {
                if (var8 == 115) {
                    field1097[++Statics.field1106 - 1] = class234.field2792;
                } else {
                    field1096[++Statics.field3268 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3346; var12++) {
                if (var11.field3347[var12] == var10) {
                    if (var8 == 115) {
                        field1097[++Statics.field1106 - 1] = var11.field3352[var12];
                    } else {
                        field1096[++Statics.field3268 - 1] = var11.field3348[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1097[++Statics.field1106 - 1] = var11.field3344;
                } else {
                    field1096[++Statics.field3268 - 1] = var11.field3345;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field1096[--Statics.field3268];
            class263 var14 = class263.method3538(var13);
            field1096[++Statics.field3268 - 1] = var14.method4201();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.as(ILcs;ZB)I")
    public static int method124(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = client.field914[var3].method148();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = client.field914[var4].field78;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = client.field914[var5].field80;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = client.field914[var6].field79;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = client.field914[var7].field82;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = client.field914[var8].field83;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1096[--Statics.field3268];
            int var10 = client.field914[var9].method147();
            field1096[++Statics.field3268 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1096[--Statics.field3268];
            int var12 = client.field914[var11].method147();
            field1096[++Statics.field3268 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1096[--Statics.field3268];
            int var14 = client.field914[var13].method147();
            field1096[++Statics.field3268 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1096[--Statics.field3268];
            int var16 = client.field914[var15].method147();
            field1096[++Statics.field3268 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1096[--Statics.field3268] == 1;
            if (Statics.field3635 != null) {
                Statics.field3635.method118(class16.field57, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1096[--Statics.field3268] == 1;
            if (Statics.field3635 != null) {
                Statics.field3635.method118(class16.field59, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field3268 -= 2;
            boolean var19 = field1096[Statics.field3268] == 1;
            boolean var20 = field1096[Statics.field3268 + 1] == 1;
            if (Statics.field3635 != null) {
                client.field803.field640 = var20;
                Statics.field3635.method118(client.field803, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1096[--Statics.field3268] == 1;
            if (Statics.field3635 != null) {
                Statics.field3635.method118(class16.field58, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1096[--Statics.field3268] == 1;
            if (Statics.field3635 != null) {
                Statics.field3635.method118(class16.field60, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1096[++Statics.field3268 - 1] = Statics.field3635 == null ? 0 : Statics.field3635.field61.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1096[--Statics.field3268];
            class17 var24 = (class17) Statics.field3635.field61.get(var23);
            field1096[++Statics.field3268 - 1] = var24.field69;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1096[--Statics.field3268];
            class17 var26 = (class17) Statics.field3635.field61.get(var25);
            field1097[++Statics.field1106 - 1] = var26.method134();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1096[--Statics.field3268];
            class17 var28 = (class17) Statics.field3635.field61.get(var27);
            field1097[++Statics.field1106 - 1] = var28.method129();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1096[--Statics.field3268];
            class17 var30 = (class17) Statics.field3635.field61.get(var29);
            long var31 = class308.method4891() - Statics.field18 - var30.field70;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1097[++Statics.field1106 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1096[--Statics.field3268];
            class17 var38 = (class17) Statics.field3635.field61.get(var37);
            field1096[++Statics.field3268 - 1] = var38.field73.field79;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1096[--Statics.field3268];
            class17 var40 = (class17) Statics.field3635.field61.get(var39);
            field1096[++Statics.field3268 - 1] = var40.field73.field80;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1096[--Statics.field3268];
            class17 var42 = (class17) Statics.field3635.field61.get(var41);
            field1096[++Statics.field3268 - 1] = var42.field73.field78;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ab.ae(ILcs;ZI)I")
    public static int method544(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field3268 -= 2;
            int var3 = field1096[Statics.field3268];
            int var4 = field1096[Statics.field3268 + 1];
            field1096[++Statics.field3268 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field3268 -= 2;
            int var5 = field1096[Statics.field3268];
            int var6 = field1096[Statics.field3268 + 1];
            field1096[++Statics.field3268 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field3268 -= 2;
            int var7 = field1096[Statics.field3268];
            int var8 = field1096[Statics.field3268 + 1];
            field1096[++Statics.field3268 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field3268 -= 2;
            int var9 = field1096[Statics.field3268];
            int var10 = field1096[Statics.field3268 + 1];
            field1096[++Statics.field3268 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field3268 -= 5;
            int var13 = field1096[Statics.field3268];
            int var14 = field1096[Statics.field3268 + 1];
            int var15 = field1096[Statics.field3268 + 2];
            int var16 = field1096[Statics.field3268 + 3];
            int var17 = field1096[Statics.field3268 + 4];
            field1096[++Statics.field3268 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field3268 -= 2;
            int var18 = field1096[Statics.field3268];
            int var19 = field1096[Statics.field3268 + 1];
            field1096[++Statics.field3268 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field3268 -= 2;
            int var20 = field1096[Statics.field3268];
            int var21 = field1096[Statics.field3268 + 1];
            field1096[++Statics.field3268 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field3268 -= 2;
            int var22 = field1096[Statics.field3268];
            int var23 = field1096[Statics.field3268 + 1];
            field1096[++Statics.field3268 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field3268 -= 2;
            int var24 = field1096[Statics.field3268];
            int var25 = field1096[Statics.field3268 + 1];
            field1096[++Statics.field3268 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field3268 -= 2;
            int var26 = field1096[Statics.field3268];
            int var27 = field1096[Statics.field3268 + 1];
            field1096[++Statics.field3268 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field3268 -= 2;
            int var28 = field1096[Statics.field3268];
            int var29 = field1096[Statics.field3268 + 1];
            if (var28 == 0) {
                field1096[++Statics.field3268 - 1] = 0;
            } else {
                field1096[++Statics.field3268 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field3268 -= 2;
            int var30 = field1096[Statics.field3268];
            int var31 = field1096[Statics.field3268 + 1];
            if (var30 == 0) {
                field1096[++Statics.field3268 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1096[++Statics.field3268 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1096[++Statics.field3268 - 1] = var30;
                    break;
                case 2:
                    field1096[++Statics.field3268 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1096[++Statics.field3268 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1096[++Statics.field3268 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1096[++Statics.field3268 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field3268 -= 2;
            int var32 = field1096[Statics.field3268];
            int var33 = field1096[Statics.field3268 + 1];
            field1096[++Statics.field3268 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field3268 -= 2;
            int var34 = field1096[Statics.field3268];
            int var35 = field1096[Statics.field3268 + 1];
            field1096[++Statics.field3268 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field3268 -= 3;
            long var36 = (long) field1096[Statics.field3268];
            long var38 = (long) field1096[Statics.field3268 + 1];
            long var40 = (long) field1096[Statics.field3268 + 2];
            field1096[++Statics.field3268 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g.ac(ILcs;ZI)I")
    public static int method196(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1097[--Statics.field1106];
            int var4 = field1096[--Statics.field3268];
            field1097[++Statics.field1106 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1106 -= 2;
            String var5 = field1097[Statics.field1106];
            String var6 = field1097[Statics.field1106 + 1];
            field1097[++Statics.field1106 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1097[--Statics.field1106];
            int var8 = field1096[--Statics.field3268];
            field1097[++Statics.field1106 - 1] = var7 + class302.method4134(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1097[--Statics.field1106];
            field1097[++Statics.field1106 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1096[--Statics.field3268];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1092.setTime(new Date(var11));
            int var13 = field1092.get(5);
            int var14 = field1092.get(2);
            int var15 = field1092.get(1);
            field1097[++Statics.field1106 - 1] = var13 + "-" + field1102[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1106 -= 2;
            String var16 = field1097[Statics.field1106];
            String var17 = field1097[Statics.field1106 + 1];
            if (Statics.field2563.field622 != null && Statics.field2563.field622.field2553) {
                field1097[++Statics.field1106 - 1] = var17;
            } else {
                field1097[++Statics.field1106 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1096[--Statics.field3268];
            field1097[++Statics.field1106 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1106 -= 2;
            field1096[++Statics.field3268 - 1] = class302.method1726(class298.method3136(field1097[Statics.field1106], field1097[Statics.field1106 + 1], Statics.field373));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field1097[--Statics.field1106];
            Statics.field3268 -= 2;
            int var20 = field1096[Statics.field3268];
            int var21 = field1096[Statics.field3268 + 1];
            byte[] var22 = Statics.field90.method3834(var21, 0);
            class306 var23 = new class306(var22);
            field1096[++Statics.field3268 - 1] = var23.method5011(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field1097[--Statics.field1106];
            Statics.field3268 -= 2;
            int var25 = field1096[Statics.field3268];
            int var26 = field1096[Statics.field3268 + 1];
            byte[] var27 = Statics.field90.method3834(var26, 0);
            class306 var28 = new class306(var27);
            field1096[++Statics.field3268 - 1] = var28.method4963(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1106 -= 2;
            String var29 = field1097[Statics.field1106];
            String var30 = field1097[Statics.field1106 + 1];
            if (field1096[--Statics.field3268] == 1) {
                field1097[++Statics.field1106 - 1] = var29;
            } else {
                field1097[++Statics.field1106 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field1097[--Statics.field1106];
            field1097[++Statics.field1106 - 1] = class307.method4999(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field1097[--Statics.field1106];
            int var33 = field1096[--Statics.field3268];
            field1097[++Statics.field1106 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = class302.method4810((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = class302.method4870((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = class302.method3974((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = class302.method534((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field1097[--Statics.field1106];
            if (var38 == null) {
                field1096[++Statics.field3268 - 1] = 0;
            } else {
                field1096[++Statics.field3268 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field1097[--Statics.field1106];
            Statics.field3268 -= 2;
            int var40 = field1096[Statics.field3268];
            int var41 = field1096[Statics.field3268 + 1];
            field1097[++Statics.field1106 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field1097[--Statics.field1106];
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
            field1097[++Statics.field1106 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field1097[--Statics.field1106];
            int var48 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1106 -= 2;
            String var49 = field1097[Statics.field1106];
            String var50 = field1097[Statics.field1106 + 1];
            int var51 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field1097[--Statics.field1106];
            field1097[++Statics.field1106 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ic.ak(ILcs;ZI)I")
    public static int method3827(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1096[--Statics.field3268];
            field1097[++Statics.field1106 - 1] = class266.method1102(var3).field3445;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field3268 -= 2;
            int var4 = field1096[Statics.field3268];
            int var5 = field1096[Statics.field3268 + 1];
            class266 var6 = class266.method1102(var4);
            if (var5 < 1 || var5 > 5 || var6.field3459[var5 - 1] == null) {
                field1097[++Statics.field1106 - 1] = "";
            } else {
                field1097[++Statics.field1106 - 1] = var6.field3459[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field3268 -= 2;
            int var7 = field1096[Statics.field3268];
            int var8 = field1096[Statics.field3268 + 1];
            class266 var9 = class266.method1102(var7);
            if (var8 < 1 || var8 > 5 || var9.field3460[var8 - 1] == null) {
                field1097[++Statics.field1106 - 1] = "";
            } else {
                field1097[++Statics.field1106 - 1] = var9.field3460[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = class266.method1102(var10).field3478;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = class266.method1102(var11).field3456 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1096[--Statics.field3268];
            class266 var13 = class266.method1102(var12);
            if (var13.field3433 == -1 && var13.field3476 >= 0) {
                field1096[++Statics.field3268 - 1] = var13.field3476;
            } else {
                field1096[++Statics.field3268 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1096[--Statics.field3268];
            class266 var15 = class266.method1102(var14);
            if (var15.field3433 >= 0 && var15.field3476 >= 0) {
                field1096[++Statics.field3268 - 1] = var15.field3476;
            } else {
                field1096[++Statics.field3268 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = class266.method1102(var16).field3442 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1096[--Statics.field3268];
            class266 var18 = class266.method1102(var17);
            if (var18.field3489 == -1 && var18.field3488 >= 0) {
                field1096[++Statics.field3268 - 1] = var18.field3488;
            } else {
                field1096[++Statics.field3268 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1096[--Statics.field3268];
            class266 var20 = class266.method1102(var19);
            if (var20.field3489 >= 0 && var20.field3488 >= 0) {
                field1096[++Statics.field3268 - 1] = var20.field3488;
            } else {
                field1096[++Statics.field3268 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1097[--Statics.field1106];
            int var22 = field1096[--Statics.field3268];
            client.method555(var21, var22 == 1);
            field1096[++Statics.field3268 - 1] = Statics.field2368;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1971 == null || Statics.field3215 >= Statics.field2368) {
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                field1096[++Statics.field3268 - 1] = Statics.field1971[++Statics.field3215 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field3215 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iu.av(ILcs;ZI)I")
    public static int method4147(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1096[++Statics.field3268 - 1] = client.field796;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field3268 -= 3;
            client.field796 = field1096[Statics.field3268];
            Statics.field730 = class321.method719(field1096[Statics.field3268 + 1]);
            if (Statics.field730 == null) {
                Statics.field730 = class321.field3833;
            }
            client.field867 = field1096[Statics.field3268 + 2];
            class197 var3 = class197.method1128(class193.field2309, client.field695.field1329);
            var3.field2361.method5095(client.field796);
            var3.field2361.method5095(Statics.field730.field3836);
            var3.field2361.method5095(client.field867);
            client.field695.method2155(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1097[--Statics.field1106];
            Statics.field3268 -= 2;
            int var5 = field1096[Statics.field3268];
            int var6 = field1096[Statics.field3268 + 1];
            class197 var7 = class197.method1128(class193.field2302, client.field695.field1329);
            var7.field2361.method5095(class311.method2704(var4) + 2);
            var7.field2361.method5105(var4);
            var7.field2361.method5095(var5 - 1);
            var7.field2361.method5095(var6);
            client.field695.method2155(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field3268 -= 2;
            int var8 = field1096[Statics.field3268];
            int var9 = field1096[Statics.field3268 + 1];
            class74 var10 = class101.method3123(var8, var9);
            if (var10 == null) {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = 0;
                field1097[++Statics.field1106 - 1] = "";
                field1097[++Statics.field1106 - 1] = "";
                field1097[++Statics.field1106 - 1] = "";
                field1096[++Statics.field3268 - 1] = 0;
            } else {
                field1096[++Statics.field3268 - 1] = var10.field599;
                field1096[++Statics.field3268 - 1] = var10.field596;
                field1097[++Statics.field1106 - 1] = var10.field598 == null ? "" : var10.field598;
                field1097[++Statics.field1106 - 1] = var10.field595 == null ? "" : var10.field595;
                field1097[++Statics.field1106 - 1] = var10.field603 == null ? "" : var10.field603;
                field1096[++Statics.field3268 - 1] = var10.method1149() ? 1 : (var10.method1152() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1096[--Statics.field3268];
            class74 var12 = class101.method3381(var11);
            if (var12 == null) {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = 0;
                field1097[++Statics.field1106 - 1] = "";
                field1097[++Statics.field1106 - 1] = "";
                field1097[++Statics.field1106 - 1] = "";
                field1096[++Statics.field3268 - 1] = 0;
            } else {
                field1096[++Statics.field3268 - 1] = var12.field597;
                field1096[++Statics.field3268 - 1] = var12.field596;
                field1097[++Statics.field1106 - 1] = var12.field598 == null ? "" : var12.field598;
                field1097[++Statics.field1106 - 1] = var12.field595 == null ? "" : var12.field595;
                field1097[++Statics.field1106 - 1] = var12.field603 == null ? "" : var12.field603;
                field1096[++Statics.field3268 - 1] = var12.method1149() ? 1 : (var12.method1152() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field730 == null) {
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                field1096[++Statics.field3268 - 1] = Statics.field730.field3836;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1097[--Statics.field1106];
            int var14 = field1096[--Statics.field3268];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class234.field2964)) {
                var16 = 0;
                var13 = var13.substring(class234.field2964.length());
            } else if (var15.startsWith(class234.field2966)) {
                var16 = 1;
                var13 = var13.substring(class234.field2966.length());
            } else if (var15.startsWith(class234.field2968)) {
                var16 = 2;
                var13 = var13.substring(class234.field2968.length());
            } else if (var15.startsWith(class234.field2970)) {
                var16 = 3;
                var13 = var13.substring(class234.field2970.length());
            } else if (var15.startsWith(class234.field2913)) {
                var16 = 4;
                var13 = var13.substring(class234.field2913.length());
            } else if (var15.startsWith(class234.field2974)) {
                var16 = 5;
                var13 = var13.substring(class234.field2974.length());
            } else if (var15.startsWith(class234.field2976)) {
                var16 = 6;
                var13 = var13.substring(class234.field2976.length());
            } else if (var15.startsWith(class234.field3051)) {
                var16 = 7;
                var13 = var13.substring(class234.field3051.length());
            } else if (var15.startsWith(class234.field2980)) {
                var16 = 8;
                var13 = var13.substring(class234.field2980.length());
            } else if (var15.startsWith(class234.field2982)) {
                var16 = 9;
                var13 = var13.substring(class234.field2982.length());
            } else if (var15.startsWith(class234.field2984)) {
                var16 = 10;
                var13 = var13.substring(class234.field2984.length());
            } else if (var15.startsWith(class234.field2851)) {
                var16 = 11;
                var13 = var13.substring(class234.field2851.length());
            } else if (Statics.field373 != class200.field2383) {
                if (var15.startsWith(class234.field2987)) {
                    var16 = 0;
                    var13 = var13.substring(class234.field2987.length());
                } else if (var15.startsWith(class234.field2972)) {
                    var16 = 1;
                    var13 = var13.substring(class234.field2972.length());
                } else if (var15.startsWith(class234.field2969)) {
                    var16 = 2;
                    var13 = var13.substring(class234.field2969.length());
                } else if (var15.startsWith(class234.field2817)) {
                    var16 = 3;
                    var13 = var13.substring(class234.field2817.length());
                } else if (var15.startsWith(class234.field3024)) {
                    var16 = 4;
                    var13 = var13.substring(class234.field3024.length());
                } else if (var15.startsWith(class234.field2975)) {
                    var16 = 5;
                    var13 = var13.substring(class234.field2975.length());
                } else if (var15.startsWith(class234.field2962)) {
                    var16 = 6;
                    var13 = var13.substring(class234.field2962.length());
                } else if (var15.startsWith(class234.field2979)) {
                    var16 = 7;
                    var13 = var13.substring(class234.field2979.length());
                } else if (var15.startsWith(class234.field2981)) {
                    var16 = 8;
                    var13 = var13.substring(class234.field2981.length());
                } else if (var15.startsWith(class234.field2903)) {
                    var16 = 9;
                    var13 = var13.substring(class234.field2903.length());
                } else if (var15.startsWith(class234.field2985)) {
                    var16 = 10;
                    var13 = var13.substring(class234.field2985.length());
                } else if (var15.startsWith(class234.field2952)) {
                    var16 = 11;
                    var13 = var13.substring(class234.field2952.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class234.field2839)) {
                var18 = 1;
                var13 = var13.substring(class234.field2839.length());
            } else if (var17.startsWith(class234.field3066)) {
                var18 = 2;
                var13 = var13.substring(class234.field3066.length());
            } else if (var17.startsWith(class234.field2992)) {
                var18 = 3;
                var13 = var13.substring(class234.field2992.length());
            } else if (var17.startsWith(class234.field2994)) {
                var18 = 4;
                var13 = var13.substring(class234.field2994.length());
            } else if (var17.startsWith(class234.field2996)) {
                var18 = 5;
                var13 = var13.substring(class234.field2996.length());
            } else if (Statics.field373 != class200.field2383) {
                if (var17.startsWith(class234.field2958)) {
                    var18 = 1;
                    var13 = var13.substring(class234.field2958.length());
                } else if (var17.startsWith(class234.field2991)) {
                    var18 = 2;
                    var13 = var13.substring(class234.field2991.length());
                } else if (var17.startsWith(class234.field2993)) {
                    var18 = 3;
                    var13 = var13.substring(class234.field2993.length());
                } else if (var17.startsWith(class234.field2995)) {
                    var18 = 4;
                    var13 = var13.substring(class234.field2995.length());
                } else if (var17.startsWith(class234.field2997)) {
                    var18 = 5;
                    var13 = var13.substring(class234.field2997.length());
                }
            }
            class197 var19 = class197.method1128(class193.field2305, client.field695.field1329);
            var19.field2361.method5095(0);
            int var20 = var19.field2361.field3752;
            var19.field2361.method5095(var14);
            var19.field2361.method5095(var16);
            var19.field2361.method5095(var18);
            class220.method3126(var19.field2361, var13);
            var19.field2361.method5310(var19.field2361.field3752 - var20);
            client.field695.method2155(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1106 -= 2;
            String var21 = field1097[Statics.field1106];
            String var22 = field1097[Statics.field1106 + 1];
            class197 var23 = class197.method1128(class193.field2231, client.field695.field1329);
            var23.field2361.method5099(0);
            int var24 = var23.field2361.field3752;
            var23.field2361.method5105(var21);
            class220.method3126(var23.field2361, var22);
            var23.field2361.method5122(var23.field2361.field3752 - var24);
            client.field695.method2155(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field2563 == null || Statics.field2563.field620 == null) {
                var25 = "";
            } else {
                var25 = Statics.field2563.field620.method4821();
            }
            field1097[++Statics.field1106 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1096[++Statics.field3268 - 1] = client.field867;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = class101.method786(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = class101.method3639(var27);
            return 1;
        } else if (arg0 == 5019) {
            int var28 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = class101.method537(var28);
            return 1;
        } else if (arg0 == 5020) {
            String var29 = field1097[--Statics.field1106];
            client.method1098(var29);
            return 1;
        } else if (arg0 == 5021) {
            client.field872 = field1097[--Statics.field1106].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1097[++Statics.field1106 - 1] = client.field872;
            return 1;
        } else if (arg0 == 5023) {
            String var30 = field1097[--Statics.field1106];
            System.out.println(var30);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iw.ah(ILcs;ZI)I")
    public static int method4091(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field3268 -= 2;
            int var3 = field1096[Statics.field3268];
            int var4 = field1096[Statics.field3268 + 1];
            if (!client.field891) {
                client.field778 = var3;
                client.field831 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1096[++Statics.field3268 - 1] = client.field778;
            return 1;
        } else if (arg0 == 5506) {
            field1096[++Statics.field3268 - 1] = client.field831;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1096[--Statics.field3268];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field868 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1096[++Statics.field3268 - 1] = client.field868;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.am(ILcs;ZI)I")
    public static int method570(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field734 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field1106 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field1096[++Statics.field3268 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ci.aa(II)I")
    public static int method1675(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("bc.ao(II)I")
    public static int method1035(int arg0) {
        return (int) ((Math.log((double) arg0) / field1094 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("ao.ab(ILcs;ZI)I")
    public static int method541(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field3268 -= 2;
            client.field897 = (short) method1675(field1096[Statics.field3268]);
            if (client.field897 <= 0) {
                client.field897 = 256;
            }
            client.field898 = (short) method1675(field1096[Statics.field3268 + 1]);
            if (client.field898 <= 0) {
                client.field898 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field3268 -= 2;
            client.field915 = (short) field1096[Statics.field3268];
            if (client.field915 <= 0) {
                client.field915 = 256;
            }
            client.field900 = (short) field1096[Statics.field3268 + 1];
            if (client.field900 <= 0) {
                client.field900 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field3268 -= 4;
            client.field901 = (short) field1096[Statics.field3268];
            if (client.field901 <= 0) {
                client.field901 = 1;
            }
            client.field732 = (short) field1096[Statics.field3268 + 1];
            if (client.field732 <= 0) {
                client.field732 = 32767;
            } else if (client.field732 < client.field901) {
                client.field732 = client.field901;
            }
            client.field829 = (short) field1096[Statics.field3268 + 2];
            if (client.field829 <= 0) {
                client.field829 = 1;
            }
            client.field904 = (short) field1096[Statics.field3268 + 3];
            if (client.field904 <= 0) {
                client.field904 = 32767;
            } else if (client.field904 < client.field829) {
                client.field904 = client.field829;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field870 == null) {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                client.method227(0, 0, client.field870.field2602, client.field870.field2603, false);
                field1096[++Statics.field3268 - 1] = client.field907;
                field1096[++Statics.field3268 - 1] = client.field696;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1096[++Statics.field3268 - 1] = client.field915;
            field1096[++Statics.field3268 - 1] = client.field900;
            return 1;
        } else if (arg0 == 6205) {
            field1096[++Statics.field3268 - 1] = method1035(client.field897);
            field1096[++Statics.field3268 - 1] = method1035(client.field898);
            return 1;
        } else if (arg0 == 6220) {
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field1096[++Statics.field3268 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field1096[++Statics.field3268 - 1] = Statics.field3639;
            return 1;
        } else if (arg0 == 6223) {
            field1096[++Statics.field3268 - 1] = Statics.field1893;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jt.aw(ILcs;ZB)I")
    public static int method4358(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1096[++Statics.field3268 - 1] = class81.method135() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class81 var3 = class81.method3811();
            if (var3 == null) {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = 0;
                field1097[++Statics.field1106 - 1] = "";
                field1096[++Statics.field3268 - 1] = 0;
                field1096[++Statics.field3268 - 1] = 0;
                field1097[++Statics.field1106 - 1] = "";
            } else {
                field1096[++Statics.field3268 - 1] = var3.field1019;
                field1096[++Statics.field3268 - 1] = var3.field1020;
                field1097[++Statics.field1106 - 1] = var3.field1023;
                field1096[++Statics.field3268 - 1] = var3.field1024;
                field1096[++Statics.field3268 - 1] = var3.field1021;
                field1097[++Statics.field1106 - 1] = var3.field1022;
            }
            return 1;
        } else if (arg0 == 6502) {
            class81 var4 = class81.method123();
            if (var4 == null) {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = 0;
                field1097[++Statics.field1106 - 1] = "";
                field1096[++Statics.field3268 - 1] = 0;
                field1096[++Statics.field3268 - 1] = 0;
                field1097[++Statics.field1106 - 1] = "";
            } else {
                field1096[++Statics.field3268 - 1] = var4.field1019;
                field1096[++Statics.field3268 - 1] = var4.field1020;
                field1097[++Statics.field1106 - 1] = var4.field1023;
                field1096[++Statics.field3268 - 1] = var4.field1024;
                field1096[++Statics.field3268 - 1] = var4.field1021;
                field1097[++Statics.field1106 - 1] = var4.field1022;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field1096[--Statics.field3268];
            class81 var6 = null;
            for (int var7 = 0; var7 < class81.field1018; var7++) {
                if (Statics.field1013[var7].field1019 == var5) {
                    var6 = Statics.field1013[var7];
                    break;
                }
            }
            if (var6 == null) {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = 0;
                field1097[++Statics.field1106 - 1] = "";
                field1096[++Statics.field3268 - 1] = 0;
                field1096[++Statics.field3268 - 1] = 0;
                field1097[++Statics.field1106 - 1] = "";
            } else {
                field1096[++Statics.field3268 - 1] = var6.field1019;
                field1096[++Statics.field3268 - 1] = var6.field1020;
                field1097[++Statics.field1106 - 1] = var6.field1023;
                field1096[++Statics.field3268 - 1] = var6.field1024;
                field1096[++Statics.field3268 - 1] = var6.field1021;
                field1097[++Statics.field1106 - 1] = var6.field1022;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field3268 -= 4;
            int var8 = field1096[Statics.field3268];
            boolean var9 = field1096[Statics.field3268 + 1] == 1;
            int var10 = field1096[Statics.field3268 + 2];
            boolean var11 = field1096[Statics.field3268 + 3] == 1;
            class81.method3273(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field1096[--Statics.field3268];
            if (var12 >= 0 && var12 < class81.field1018) {
                class81 var13 = Statics.field1013[var12];
                field1096[++Statics.field3268 - 1] = var13.field1019;
                field1096[++Statics.field3268 - 1] = var13.field1020;
                field1097[++Statics.field1106 - 1] = var13.field1023;
                field1096[++Statics.field3268 - 1] = var13.field1024;
                field1096[++Statics.field3268 - 1] = var13.field1021;
                field1097[++Statics.field1106 - 1] = var13.field1022;
            } else {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = 0;
                field1097[++Statics.field1106 - 1] = "";
                field1096[++Statics.field3268 - 1] = 0;
                field1096[++Statics.field3268 - 1] = 0;
                field1097[++Statics.field1106 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field794 = field1096[--Statics.field3268] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field3268 -= 2;
            int var14 = field1096[Statics.field3268];
            int var15 = field1096[Statics.field3268 + 1];
            class261 var16 = class261.method2148(var15);
            if (var16.method4163()) {
                field1097[++Statics.field1106 - 1] = class268.method250(var14).method4368(var15, var16.field3331);
            } else {
                field1096[++Statics.field3268 - 1] = class268.method250(var14).method4367(var15, var16.field3333);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field3268 -= 2;
            int var17 = field1096[Statics.field3268];
            int var18 = field1096[Statics.field3268 + 1];
            class261 var19 = class261.method2148(var18);
            if (var19.method4163()) {
                field1097[++Statics.field1106 - 1] = class265.method325(var17).method4254(var18, var19.field3331);
            } else {
                field1096[++Statics.field3268 - 1] = class265.method325(var17).method4253(var18, var19.field3333);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field3268 -= 2;
            int var20 = field1096[Statics.field3268];
            int var21 = field1096[Statics.field3268 + 1];
            class261 var22 = class261.method2148(var21);
            if (var22.method4163()) {
                field1097[++Statics.field1106 - 1] = class266.method1102(var20).method4328(var21, var22.field3331);
            } else {
                field1096[++Statics.field3268 - 1] = class266.method1102(var20).method4303(var21, var22.field3333);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field3268 -= 2;
            int var23 = field1096[Statics.field3268];
            int var24 = field1096[Statics.field3268 + 1];
            class261 var25 = class261.method2148(var24);
            if (var25.method4163()) {
                field1097[++Statics.field1106 - 1] = class262.method572(var23).method4181(var24, var25.field3331);
            } else {
                field1096[++Statics.field3268 - 1] = class262.method572(var23).method4180(var24, var25.field3333);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1096[++Statics.field3268 - 1] = client.field653 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field1096[++Statics.field3268 - 1] = client.field651 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1106--;
            Statics.field3268--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1106--;
            Statics.field3268--;
            return 1;
        } else if (arg0 == 6524) {
            field1096[++Statics.field3268 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1096[++Statics.field3268 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1096[++Statics.field3268 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.ap(ILcs;ZI)I")
    public static int method724(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1950;
            int var4 = (Statics.field2563.field991 >> 7) + Statics.field3157;
            int var5 = (Statics.field2563.field939 >> 7) + Statics.field301;
            client.method1672().method5889(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1096[--Statics.field3268];
            String var7 = "";
            class36 var8 = client.method1672().method5907(var6);
            if (var8 != null) {
                var7 = var8.method337();
            }
            field1097[++Statics.field1106 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1096[--Statics.field3268];
            client.method1672().method5986(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1096[++Statics.field3268 - 1] = client.method1672().method6041();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1096[--Statics.field3268];
            client.method1672().method5901(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1096[++Statics.field3268 - 1] = client.method1672().method5935() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class223 var11 = new class223(field1096[--Statics.field3268]);
            client.method1672().method5974(var11.field2547, var11.field2548);
            return 1;
        } else if (arg0 == 6607) {
            class223 var12 = new class223(field1096[--Statics.field3268]);
            client.method1672().method5909(var12.field2547, var12.field2548);
            return 1;
        } else if (arg0 == 6608) {
            class223 var13 = new class223(field1096[--Statics.field3268]);
            client.method1672().method5910(var13.field2550, var13.field2547, var13.field2548);
            return 1;
        } else if (arg0 == 6609) {
            class223 var14 = new class223(field1096[--Statics.field3268]);
            client.method1672().method5911(var14.field2550, var14.field2547, var14.field2548);
            return 1;
        } else if (arg0 == 6610) {
            field1096[++Statics.field3268 - 1] = client.method1672().method5912();
            field1096[++Statics.field3268 - 1] = client.method1672().method5913();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1096[--Statics.field3268];
            class36 var16 = client.method1672().method5907(var15);
            if (var16 == null) {
                field1096[++Statics.field3268 - 1] = 0;
            } else {
                field1096[++Statics.field3268 - 1] = var16.method397().method3675();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1096[--Statics.field3268];
            class36 var18 = client.method1672().method5907(var17);
            if (var18 == null) {
                field1096[++Statics.field3268 - 1] = 0;
                field1096[++Statics.field3268 - 1] = 0;
            } else {
                field1096[++Statics.field3268 - 1] = (var18.method367() - var18.method340() + 1) * 64;
                field1096[++Statics.field3268 - 1] = (var18.method388() - var18.method342() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1096[--Statics.field3268];
            class36 var20 = client.method1672().method5907(var19);
            if (var20 == null) {
                field1096[++Statics.field3268 - 1] = 0;
                field1096[++Statics.field3268 - 1] = 0;
                field1096[++Statics.field3268 - 1] = 0;
                field1096[++Statics.field3268 - 1] = 0;
            } else {
                field1096[++Statics.field3268 - 1] = var20.method340() * 64;
                field1096[++Statics.field3268 - 1] = var20.method342() * 64;
                field1096[++Statics.field3268 - 1] = var20.method367() * 64 + 64 - 1;
                field1096[++Statics.field3268 - 1] = var20.method388() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1096[--Statics.field3268];
            class36 var22 = client.method1672().method5907(var21);
            if (var22 == null) {
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                field1096[++Statics.field3268 - 1] = var22.method399();
            }
            return 1;
        } else if (arg0 == 6615) {
            class223 var23 = client.method1672().method5914();
            if (var23 == null) {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                field1096[++Statics.field3268 - 1] = var23.field2547;
                field1096[++Statics.field3268 - 1] = var23.field2548;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1096[++Statics.field3268 - 1] = client.method1672().method5981();
            return 1;
        } else if (arg0 == 6617) {
            class223 var24 = new class223(field1096[--Statics.field3268]);
            class36 var25 = client.method1672().method5892();
            if (var25 == null) {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method331(var24.field2550, var24.field2547, var24.field2548);
            if (var26 == null) {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                field1096[++Statics.field3268 - 1] = var26[0];
                field1096[++Statics.field3268 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class223 var27 = new class223(field1096[--Statics.field3268]);
            class36 var28 = client.method1672().method5892();
            if (var28 == null) {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = -1;
                return 1;
            }
            class223 var29 = var28.method326(var27.field2547, var27.field2548);
            if (var29 == null) {
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                field1096[++Statics.field3268 - 1] = var29.method3675();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field3268 -= 2;
            int var30 = field1096[Statics.field3268];
            class223 var31 = new class223(field1096[Statics.field3268 + 1]);
            method3414(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field3268 -= 2;
            int var32 = field1096[Statics.field3268];
            class223 var33 = new class223(field1096[Statics.field3268 + 1]);
            method3414(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field3268 -= 2;
            int var34 = field1096[Statics.field3268];
            class223 var35 = new class223(field1096[Statics.field3268 + 1]);
            class36 var36 = client.method1672().method5907(var34);
            if (var36 == null) {
                field1096[++Statics.field3268 - 1] = 0;
                return 1;
            } else {
                field1096[++Statics.field3268 - 1] = var36.method329(var35.field2550, var35.field2547, var35.field2548) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1096[++Statics.field3268 - 1] = client.method1672().method5915();
            field1096[++Statics.field3268 - 1] = client.method1672().method5916();
            return 1;
        } else if (arg0 == 6623) {
            class223 var37 = new class223(field1096[--Statics.field3268]);
            class36 var38 = client.method1672().method6064(var37.field2550, var37.field2547, var37.field2548);
            if (var38 == null) {
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                field1096[++Statics.field3268 - 1] = var38.method334();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1672().method5917(field1096[--Statics.field3268]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1672().method5918();
            return 1;
        } else if (arg0 == 6626) {
            client.method1672().method5955(field1096[--Statics.field3268]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1672().method5920();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1096[--Statics.field3268] == 1;
            client.method1672().method5921(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1096[--Statics.field3268];
            client.method1672().method5898(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1096[--Statics.field3268];
            client.method1672().method5923(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method1672().method5924();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1096[--Statics.field3268] == 1;
            client.method1672().method5926(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field3268 -= 2;
            int var43 = field1096[Statics.field3268];
            boolean var44 = field1096[Statics.field3268 + 1] == 1;
            client.method1672().method5962(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field3268 -= 2;
            int var45 = field1096[Statics.field3268];
            boolean var46 = field1096[Statics.field3268 + 1] == 1;
            client.method1672().method5927(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1096[++Statics.field3268 - 1] = client.method1672().method5950() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = client.method1672().method5919(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1096[--Statics.field3268];
            field1096[++Statics.field3268 - 1] = client.method1672().method5937(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field3268 -= 2;
            int var49 = field1096[Statics.field3268];
            class223 var50 = new class223(field1096[Statics.field3268 + 1]);
            class223 var51 = client.method1672().method5933(var49, var50);
            if (var51 == null) {
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                field1096[++Statics.field3268 - 1] = var51.method3675();
            }
            return 1;
        } else if (arg0 == 6639) {
            class44 var52 = client.method1672().method6017();
            if (var52 == null) {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                field1096[++Statics.field3268 - 1] = var52.method244();
                field1096[++Statics.field3268 - 1] = var52.field322.method3675();
            }
            return 1;
        } else if (arg0 == 6640) {
            class44 var53 = client.method1672().method5936();
            if (var53 == null) {
                field1096[++Statics.field3268 - 1] = -1;
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                field1096[++Statics.field3268 - 1] = var53.method244();
                field1096[++Statics.field3268 - 1] = var53.field322.method3675();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1096[--Statics.field3268];
            class253 var55 = class253.method3211(var54);
            if (var55.field3248 == null) {
                field1097[++Statics.field1106 - 1] = "";
            } else {
                field1097[++Statics.field1106 - 1] = var55.field3248;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1096[--Statics.field3268];
            class253 var57 = class253.method3211(var56);
            field1096[++Statics.field3268 - 1] = var57.field3250;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1096[--Statics.field3268];
            class253 var59 = class253.method3211(var58);
            if (var59 == null) {
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                field1096[++Statics.field3268 - 1] = var59.field3253;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1096[--Statics.field3268];
            class253 var61 = class253.method3211(var60);
            if (var61 == null) {
                field1096[++Statics.field3268 - 1] = -1;
            } else {
                field1096[++Statics.field3268 - 1] = var61.field3246;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1096[++Statics.field3268 - 1] = Statics.field1303.field375;
            return 1;
        } else if (arg0 == 6698) {
            field1096[++Statics.field3268 - 1] = Statics.field1303.field374.method3675();
            return 1;
        } else if (arg0 == 6699) {
            field1096[++Statics.field3268 - 1] = Statics.field1303.field376.method3675();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("is.ad(II)V")
    public static void method4012(int arg0) {
        if (arg0 == -1 || !class227.method545(arg0)) {
            return;
        }
        class227[] var1 = Statics.field45[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class227 var3 = var1[var2];
            if (var3.field2692 != null) {
                class72 var4 = new class72();
                var4.field572 = var3;
                var4.field573 = var3.field2692;
                method1977(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("gl.ai(ILhs;ZB)V")
    public static void method3414(int arg0, class223 arg1, boolean arg2) {
        class36 var3 = client.method1672().method5907(arg0);
        int var4 = Statics.field2563.field628;
        int var5 = (Statics.field2563.field991 >> 7) + Statics.field3157;
        int var6 = (Statics.field2563.field939 >> 7) + Statics.field301;
        class223 var7 = new class223(var4, var5, var6);
        client.method1672().method6004(var3, var7, arg1, arg2);
    }
}
