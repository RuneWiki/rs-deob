package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cm")
public class class79 {

    @ObfuscatedName("cm.r")
    public static int[] field956 = new int[5];

    @ObfuscatedName("cm.h")
    public static int[][] field963 = new int[5][5000];

    @ObfuscatedName("cm.d")
    public static int[] field958 = new int[1000];

    @ObfuscatedName("cm.b")
    public static String[] field965 = new String[1000];

    @ObfuscatedName("cm.k")
    public static int field969 = 0;

    @ObfuscatedName("cm.g")
    public static class72[] field961 = new class72[50];

    @ObfuscatedName("cm.p")
    public static Calendar field962 = Calendar.getInstance();

    @ObfuscatedName("cm.c")
    public static final String[] field959 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cm.l")
    public static boolean field964 = false;

    @ObfuscatedName("cm.w")
    public static boolean field952 = false;

    @ObfuscatedName("cm.a")
    public static ArrayList field966 = new ArrayList();

    @ObfuscatedName("cm.aw")
    public static int field967 = 0;

    @ObfuscatedName("cm.ah")
    public static final double field960 = Math.log(2.0D);

    public class79() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.e(Lcs;IIB)V")
    public static void method2146(class96 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1159;
        class87 var5;
        if (Statics.method1033(arg0.field1162)) {
            Statics.field2387 = (class190) var3[0];
            class140 var4 = class140.method4496(Statics.field2387.field2152);
            var5 = class87.method2658(arg0.field1162, var4.field1575, var4.field1580);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class87.method5821(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field1095 = 0;
        Statics.field1452 = 0;
        int var7 = -1;
        int[] var8 = var5.field1073;
        int[] var9 = var5.field1077;
        byte var10 = -1;
        field969 = 0;
        field964 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field2819 = new int[var5.field1074];
            int var13 = 0;
            Statics.field1422 = new String[var5.field1072];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1152;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1160;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1151 == null ? -1 : arg0.field1151.field2960;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1156;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1151 == null ? -1 : arg0.field1151.field3100;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1157 == null ? -1 : arg0.field1157.field2960;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1157 == null ? -1 : arg0.field1157.field3100;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1158;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1154;
                    }
                    Statics.field2819[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1153;
                    }
                    Statics.field1422[var14++] = var17;
                }
            }
            field967 = arg0.field1155;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field1077[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method59(var61, var5, var48);
                    switch(var49) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var61 == 0) {
                    field958[++Statics.field1095 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field958[++Statics.field1095 - 1] = class243.field2924[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class243.field2924[var19] = field958[--Statics.field1095];
                    client.method58(var19);
                } else if (var61 == 3) {
                    field965[++Statics.field1452 - 1] = var5.field1069[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field1095 -= 2;
                    if (field958[Statics.field1095] != field958[Statics.field1095 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field1095 -= 2;
                    if (field958[Statics.field1095] == field958[Statics.field1095 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field1095 -= 2;
                    if (field958[Statics.field1095] < field958[Statics.field1095 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field1095 -= 2;
                    if (field958[Statics.field1095] > field958[Statics.field1095 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field969 == 0) {
                        return;
                    }
                    class72 var21 = field961[--field969];
                    var5 = var21.field586;
                    var8 = var5.field1073;
                    var9 = var5.field1077;
                    var7 = var21.field584;
                    Statics.field2819 = var21.field592;
                    Statics.field1422 = var21.field583;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field958[++Statics.field1095 - 1] = class243.method1005(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class243.method4497(var23, field958[--Statics.field1095]);
                } else if (var61 == 31) {
                    Statics.field1095 -= 2;
                    if (field958[Statics.field1095] <= field958[Statics.field1095 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field1095 -= 2;
                    if (field958[Statics.field1095] >= field958[Statics.field1095 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field958[++Statics.field1095 - 1] = Statics.field2819[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field2819[var9[var7]] = field958[--Statics.field1095];
                } else if (var61 == 35) {
                    field965[++Statics.field1452 - 1] = Statics.field1422[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field1422[var9[var7]] = field965[--Statics.field1452];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field1452 -= var24;
                    String var25 = class305.method1942(field965, Statics.field1452, var24);
                    field965[++Statics.field1452 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field1095--;
                } else if (var61 == 39) {
                    Statics.field1452--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class87 var27 = class87.method5821(var26);
                    int[] var28 = new int[var27.field1074];
                    String[] var29 = new String[var27.field1072];
                    for (int var30 = 0; var30 < var27.field1076; var30++) {
                        var28[var30] = field958[Statics.field1095 - var27.field1076 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field1075; var31++) {
                        var29[var31] = field965[Statics.field1452 - var27.field1075 + var31];
                    }
                    Statics.field1095 -= var27.field1076;
                    Statics.field1452 -= var27.field1075;
                    class72 var32 = new class72();
                    var32.field586 = var5;
                    var32.field584 = var7;
                    var32.field592 = Statics.field2819;
                    var32.field583 = Statics.field1422;
                    field961[++field969 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field1073;
                    var9 = var27.field1077;
                    var7 = -1;
                    Statics.field2819 = var28;
                    Statics.field1422 = var29;
                } else if (var61 == 42) {
                    field958[++Statics.field1095 - 1] = Statics.field170.method2133(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field170.method2159(var9[var7], field958[--Statics.field1095]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field958[--Statics.field1095];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field956[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field963[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field958[--Statics.field1095];
                    if (var39 < 0 || var39 >= field956[var38]) {
                        throw new RuntimeException();
                    }
                    field958[++Statics.field1095 - 1] = field963[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field1095 -= 2;
                    int var41 = field958[Statics.field1095];
                    if (var41 < 0 || var41 >= field956[var40]) {
                        throw new RuntimeException();
                    }
                    field963[var40][var41] = field958[Statics.field1095 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field170.method2131(var9[var7]);
                    if (var42 == null) {
                        var42 = class269.field3238;
                    }
                    field965[++Statics.field1452 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field170.method2130(var9[var7], field965[--Statics.field1452]);
                } else if (var61 == 49) {
                    String var43 = Statics.field170.method2129(var9[var7]);
                    field965[++Statics.field1452 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field170.method2128(var9[var7], field965[--Statics.field1452]);
                } else if (var61 == 60) {
                    class362 var44 = var5.field1078[var9[var7]];
                    class352 var45 = (class352) var44.method5668((long) field958[--Statics.field1095]);
                    if (var45 != null) {
                        var7 += var45.field3934;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field3129.method112(var9[var7]);
                    if (var46 == null) {
                        field958[++Statics.field1095 - 1] = -1;
                    } else {
                        field958[++Statics.field1095 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field75.method5369(var9[var7]);
                    if (var47 == null) {
                        field958[++Statics.field1095 - 1] = -1;
                    } else {
                        field958[++Statics.field1095 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field3937).append(" ");
            for (int var53 = field969 - 1; var53 >= 0; var53--) {
                var52.append("").append(field961[var53].field586.field3937).append(" ");
            }
            var52.append("").append(var10);
            class407.method5131(var52.toString(), var59);
        } finally {
            if (field964) {
                field952 = true;
            }
            while (field966.size() > 0) {
                class107 var56 = (class107) field966.remove(0);
                Statics.method582(var56.method2104(), var56.method2089(), var56.method2096(), var56.method2092(), "");
            }
            if (field952) {
                client.method183();
                field952 = false;
                field964 = false;
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class407.method5131("Warning: Script " + var5.field1070 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("r.v(ILcf;ZI)I")
    public static int method59(int arg0, class87 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method555(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1488(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2396(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method5317(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method1632(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method3790(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method2343(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method66(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method933(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method3155(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3322(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1488(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2396(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method5317(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method1632(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method3790(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method4604(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method1972(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method584(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method2659(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3322(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method1774(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return Statics.method4430(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method4438(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method167(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method2390(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return Statics.method2048(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method2950(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method223(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method4630(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method2549(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method745(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method5820(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method195(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method3283(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method2019(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method2307(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method172(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method62(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method4699(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method364(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method55(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method2251(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method4440(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method3399(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method714(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.y(ILcf;ZI)I")
    public static int method555(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1095 -= 3;
            int var3 = field958[Statics.field1095];
            int var4 = field958[Statics.field1095 + 1];
            int var5 = field958[Statics.field1095 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class248 var6 = class248.method3261(var3);
            if (var6.field3096 == null) {
                var6.field3096 = new class248[var5 + 1];
            }
            if (var6.field3096.length <= var5) {
                class248[] var7 = new class248[var5 + 1];
                for (int var8 = 0; var8 < var6.field3096.length; var8++) {
                    var7[var8] = var6.field3096[var8];
                }
                var6.field3096 = var7;
            }
            if (var5 > 0 && var6.field3096[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class248 var9 = new class248();
            var9.field2963 = var4;
            var9.field2980 = var9.field2960 = var6.field2960;
            var9.field3100 = var5;
            var9.field2955 = true;
            var6.field3096[var5] = var9;
            if (arg2) {
                Statics.field1444 = var9;
            } else {
                Statics.field3836 = var9;
            }
            client.method1837(var6);
            return 1;
        } else if (arg0 == 101) {
            class248 var10 = arg2 ? Statics.field1444 : Statics.field3836;
            class248 var11 = class248.method3261(var10.field2960);
            var11.field3096[var10.field3100] = null;
            client.method1837(var11);
            return 1;
        } else if (arg0 == 102) {
            class248 var12 = class248.method3261(field958[--Statics.field1095]);
            var12.field3096 = null;
            client.method1837(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field1095 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field1095 -= 2;
            int var13 = field958[Statics.field1095];
            int var14 = field958[Statics.field1095 + 1];
            class248 var15 = class248.method165(var13, var14);
            if (var15 == null || var14 == -1) {
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = 1;
                if (arg2) {
                    Statics.field1444 = var15;
                } else {
                    Statics.field3836 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class248 var16 = class248.method3261(field958[--Statics.field1095]);
            if (var16 == null) {
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = 1;
                if (arg2) {
                    Statics.field1444 = var16;
                } else {
                    Statics.field3836 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field958[Statics.field1095 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field958[--Statics.field1095 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.j(ILcf;ZI)I")
    public static int method1488(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class248 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field958[--Statics.field1095];
            var4 = class248.method3261(var3);
        } else {
            var4 = arg2 ? Statics.field1444 : Statics.field3836;
        }
        if (arg0 == 1000) {
            Statics.field1095 -= 4;
            var4.field2970 = field958[Statics.field1095];
            var4.field2954 = field958[Statics.field1095 + 1];
            var4.field3010 = field958[Statics.field1095 + 2];
            var4.field2967 = field958[Statics.field1095 + 3];
            client.method1837(var4);
            Statics.field11.method1064(var4);
            if (var3 != -1 && var4.field2963 == 0) {
                client.method2960(Statics.field613[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1095 -= 4;
            var4.field3063 = field958[Statics.field1095];
            var4.field2979 = field958[Statics.field1095 + 1];
            var4.field2968 = field958[Statics.field1095 + 2];
            var4.field2969 = field958[Statics.field1095 + 3];
            client.method1837(var4);
            Statics.field11.method1064(var4);
            if (var3 != -1 && var4.field2963 == 0) {
                client.method2960(Statics.field613[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field958[--Statics.field1095] == 1;
            if (var4.field2981 != var5) {
                var4.field2981 = var5;
                client.method1837(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3106 = field958[--Statics.field1095] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3107 = field958[--Statics.field1095] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ex.o(ILcf;ZI)I")
    public static int method2396(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class248 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field958[--Statics.field1095];
            var4 = class248.method3261(var3);
        } else {
            var4 = arg2 ? Statics.field1444 : Statics.field3836;
        }
        if (arg0 == 1100) {
            Statics.field1095 -= 2;
            var4.field3067 = field958[Statics.field1095];
            if (var4.field3067 > var4.field3059 - var4.field3080) {
                var4.field3067 = var4.field3059 - var4.field3080;
            }
            if (var4.field3067 < 0) {
                var4.field3067 = 0;
            }
            var4.field2966 = field958[Statics.field1095 + 1];
            if (var4.field2966 > var4.field2985 - var4.field2977) {
                var4.field2966 = var4.field2985 - var4.field2977;
            }
            if (var4.field2966 < 0) {
                var4.field2966 = 0;
            }
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2986 = field958[--Statics.field1095];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2990 = field958[--Statics.field1095] == 1;
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2992 = field958[--Statics.field1095];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2994 = field958[--Statics.field1095];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2996 = field958[--Statics.field1095];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3053 = field958[--Statics.field1095];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2999 = field958[--Statics.field1095] == 1;
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3004 = 1;
            var4.field3005 = field958[--Statics.field1095];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1095 -= 6;
            var4.field3030 = field958[Statics.field1095];
            var4.field3011 = field958[Statics.field1095 + 1];
            var4.field3091 = field958[Statics.field1095 + 2];
            var4.field3003 = field958[Statics.field1095 + 3];
            var4.field3014 = field958[Statics.field1095 + 4];
            var4.field3006 = field958[Statics.field1095 + 5];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field958[--Statics.field1095];
            if (var4.field3008 != var5) {
                var4.field3008 = var5;
                var4.field3043 = 0;
                var4.field3095 = 0;
                client.method1837(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3018 = field958[--Statics.field1095] == 1;
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field965[--Statics.field1452];
            if (!var6.equals(var4.field3022)) {
                var4.field3022 = var6;
                client.method1837(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3013 = field958[--Statics.field1095];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1095 -= 3;
            var4.field3025 = field958[Statics.field1095];
            var4.field3026 = field958[Statics.field1095 + 1];
            var4.field3102 = field958[Statics.field1095 + 2];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3027 = field958[--Statics.field1095] == 1;
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3000 = field958[--Statics.field1095];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3017 = field958[--Statics.field1095];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3019 = field958[--Statics.field1095] == 1;
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2961 = field958[--Statics.field1095] == 1;
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1095 -= 2;
            var4.field3059 = field958[Statics.field1095];
            var4.field2985 = field958[Statics.field1095 + 1];
            client.method1837(var4);
            if (var3 != -1 && var4.field2963 == 0) {
                client.method2960(Statics.field613[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method67(var4.field2960, var4.field3100);
            client.field789 = var4;
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3054 = field958[--Statics.field1095];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2987 = field958[--Statics.field1095];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2993 = field958[--Statics.field1095];
            client.method1837(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field958[--Statics.field1095];
            class395 var8 = (class395) class290.method2391(class395.method4645(), var7);
            if (var8 != null) {
                var4.field2991 = var8;
                client.method1837(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field958[--Statics.field1095] == 1;
            var4.field2995 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field958[--Statics.field1095] == 1;
            var4.field2988 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field1095 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lv.m(ILcf;ZB)I")
    public static int method5317(int arg0, class87 arg1, boolean arg2) {
        class248 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class248.method3261(field958[--Statics.field1095]);
        } else {
            var3 = arg2 ? Statics.field1444 : Statics.field3836;
        }
        client.method1837(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1095 -= 2;
            int var4 = field958[Statics.field1095];
            int var5 = field958[Statics.field1095 + 1];
            var3.field3092 = var4;
            var3.field3093 = var5;
            class156 var6 = class156.method4403(var4);
            var3.field3091 = var6.field1826;
            var3.field3003 = var6.field1827;
            var3.field3014 = var6.field1828;
            var3.field3030 = var6.field1829;
            var3.field3011 = var6.field1830;
            var3.field3006 = var6.field1861;
            if (arg0 == 1205) {
                var3.field3020 = 0;
            } else if (arg0 == 1212 | var6.field1831 == 1) {
                var3.field3020 = 1;
            } else {
                var3.field3020 = 2;
            }
            if (var3.field3012 > 0) {
                var3.field3006 = var3.field3006 * 32 / var3.field3012;
            } else if (var3.field3063 > 0) {
                var3.field3006 = var3.field3006 * 32 / var3.field3063;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3004 = 2;
            var3.field3005 = field958[--Statics.field1095];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3004 = 3;
            var3.field3005 = Statics.field3197.field1176.method4295();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bf.r(ILcf;ZI)I")
    public static int method1632(int arg0, class87 arg1, boolean arg2) {
        boolean var3 = true;
        class248 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class248.method3261(field958[--Statics.field1095]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field1444 : Statics.field3836;
        }
        if (arg0 == 1300) {
            int var5 = field958[--Statics.field1095] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4333(var5, field965[--Statics.field1452]);
                return 1;
            } else {
                Statics.field1452--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1095 -= 2;
            int var6 = field958[Statics.field1095];
            int var7 = field958[Statics.field1095 + 1];
            var4.field2998 = class248.method165(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3094 = field958[--Statics.field1095] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3044 = field958[--Statics.field1095];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2973 = field958[--Statics.field1095];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3041 = field965[--Statics.field1452];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3047 = field965[--Statics.field1452];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3042 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3108 = field958[--Statics.field1095] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field1095 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field958[Statics.field1095 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field958[Statics.field1095 + var10];
                        var9[var10 / 2] = (byte) field958[Statics.field1095 + var10 + 1];
                    }
                }
            } else {
                Statics.field1095 -= 2;
                var8 = new byte[] { (byte) field958[Statics.field1095] };
                var9 = new byte[] { (byte) field958[Statics.field1095 + 1] };
            }
            int var11 = field958[--Statics.field1095] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method2259(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field1095 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field958[Statics.field1095] };
            byte[] var14 = new byte[] { (byte) field958[Statics.field1095 + 1] };
            method2259(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field1095 -= 3;
            int var15 = field958[Statics.field1095] - 1;
            int var16 = field958[Statics.field1095 + 1];
            int var17 = field958[Statics.field1095 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method2358(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field958[--Statics.field1095];
            int var20 = field958[--Statics.field1095];
            method2358(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field1095--;
            int var21 = field958[Statics.field1095] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method197(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method197(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dp.h(Liv;I[B[BI)V")
    public static final void method2259(class248 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3036 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3036 = new byte[11][];
            arg0.field3037 = new byte[11][];
            arg0.field3038 = new int[11];
            arg0.field3039 = new int[11];
        }
        arg0.field3036[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3035 = false;
            for (int var4 = 0; var4 < arg0.field3036.length; var4++) {
                if (arg0.field3036[var4] != null) {
                    arg0.field3035 = true;
                    break;
                }
            }
        } else {
            arg0.field3035 = true;
        }
        arg0.field3037[arg1] = arg3;
    }

    @ObfuscatedName("ej.d(Liv;IIIB)V")
    public static final void method2358(class248 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3038 == null) {
            throw new RuntimeException();
        }
        arg0.field3038[arg1] = arg2;
        arg0.field3039[arg1] = arg3;
    }

    @ObfuscatedName("a.z(Liv;II)V")
    public static final void method197(class248 arg0, int arg1) {
        if (arg0.field3036 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3105 == null) {
            arg0.field3105 = new int[arg0.field3036.length];
        }
        arg0.field3105[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("gr.b(ILcf;ZI)I")
    public static int method3790(int arg0, class87 arg1, boolean arg2) {
        class248 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class248.method3261(field958[--Statics.field1095]);
        } else {
            var3 = arg2 ? Statics.field1444 : Statics.field3836;
        }
        String var4 = field965[--Statics.field1452];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field958[--Statics.field1095];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field958[--Statics.field1095];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field965[--Statics.field1452];
            } else {
                var7[var8] = Integer.valueOf(field958[--Statics.field1095]);
            }
        }
        int var9 = field958[--Statics.field1095];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3050 = var7;
        } else if (arg0 == 1401) {
            var3.field3002 = var7;
        } else if (arg0 == 1402) {
            var3.field3052 = var7;
        } else if (arg0 == 1403) {
            var3.field3064 = var7;
        } else if (arg0 == 1404) {
            var3.field3056 = var7;
        } else if (arg0 == 1405) {
            var3.field3057 = var7;
        } else if (arg0 == 1406) {
            var3.field3060 = var7;
        } else if (arg0 == 1407) {
            var3.field3061 = var7;
            var3.field3062 = var5;
        } else if (arg0 == 1408) {
            var3.field2989 = var7;
        } else if (arg0 == 1409) {
            var3.field3068 = var7;
        } else if (arg0 == 1410) {
            var3.field3073 = var7;
        } else if (arg0 == 1411) {
            var3.field3081 = var7;
        } else if (arg0 == 1412) {
            var3.field3055 = var7;
        } else if (arg0 == 1414) {
            var3.field2983 = var7;
            var3.field3021 = var5;
        } else if (arg0 == 1415) {
            var3.field3065 = var7;
            var3.field3066 = var5;
        } else if (arg0 == 1416) {
            var3.field2964 = var7;
        } else if (arg0 == 1417) {
            var3.field3069 = var7;
        } else if (arg0 == 1418) {
            var3.field3070 = var7;
        } else if (arg0 == 1419) {
            var3.field3071 = var7;
        } else if (arg0 == 1420) {
            var3.field3074 = var7;
        } else if (arg0 == 1421) {
            var3.field3075 = var7;
        } else if (arg0 == 1422) {
            var3.field3016 = var7;
        } else if (arg0 == 1423) {
            var3.field3079 = var7;
        } else if (arg0 == 1424) {
            var3.field2956 = var7;
        } else if (arg0 == 1425) {
            var3.field3082 = var7;
        } else if (arg0 == 1426) {
            var3.field3083 = var7;
        } else if (arg0 == 1427) {
            var3.field3078 = var7;
        } else if (arg0 == 1428) {
            var3.field3076 = var7;
        } else if (arg0 == 1429) {
            var3.field3077 = var7;
        } else if (arg0 == 1430) {
            var3.field3072 = var7;
        } else if (arg0 == 1431) {
            var3.field3001 = var7;
        } else {
            return 2;
        }
        var3.field3048 = true;
        return 1;
    }

    @ObfuscatedName("da.i(ILcf;ZB)I")
    public static int method2343(int arg0, class87 arg1, boolean arg2) {
        class248 var3 = arg2 ? Statics.field1444 : Statics.field3836;
        if (arg0 == 1500) {
            field958[++Statics.field1095 - 1] = var3.field2974;
            return 1;
        } else if (arg0 == 1501) {
            field958[++Statics.field1095 - 1] = var3.field3024;
            return 1;
        } else if (arg0 == 1502) {
            field958[++Statics.field1095 - 1] = var3.field3080;
            return 1;
        } else if (arg0 == 1503) {
            field958[++Statics.field1095 - 1] = var3.field2977;
            return 1;
        } else if (arg0 == 1504) {
            field958[++Statics.field1095 - 1] = var3.field2981 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field958[++Statics.field1095 - 1] = var3.field2980;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.k(ILcf;ZB)I")
    public static int method66(int arg0, class87 arg1, boolean arg2) {
        class248 var3 = arg2 ? Statics.field1444 : Statics.field3836;
        if (arg0 == 1600) {
            field958[++Statics.field1095 - 1] = var3.field3067;
            return 1;
        } else if (arg0 == 1601) {
            field958[++Statics.field1095 - 1] = var3.field2966;
            return 1;
        } else if (arg0 == 1602) {
            field965[++Statics.field1452 - 1] = var3.field3022;
            return 1;
        } else if (arg0 == 1603) {
            field958[++Statics.field1095 - 1] = var3.field3059;
            return 1;
        } else if (arg0 == 1604) {
            field958[++Statics.field1095 - 1] = var3.field2985;
            return 1;
        } else if (arg0 == 1605) {
            field958[++Statics.field1095 - 1] = var3.field3006;
            return 1;
        } else if (arg0 == 1606) {
            field958[++Statics.field1095 - 1] = var3.field3091;
            return 1;
        } else if (arg0 == 1607) {
            field958[++Statics.field1095 - 1] = var3.field3014;
            return 1;
        } else if (arg0 == 1608) {
            field958[++Statics.field1095 - 1] = var3.field3003;
            return 1;
        } else if (arg0 == 1609) {
            field958[++Statics.field1095 - 1] = var3.field2992;
            return 1;
        } else if (arg0 == 1610) {
            field958[++Statics.field1095 - 1] = var3.field2993;
            return 1;
        } else if (arg0 == 1611) {
            field958[++Statics.field1095 - 1] = var3.field2986;
            return 1;
        } else if (arg0 == 1612) {
            field958[++Statics.field1095 - 1] = var3.field2987;
            return 1;
        } else if (arg0 == 1613) {
            field958[++Statics.field1095 - 1] = var3.field2991.method238();
            return 1;
        } else if (arg0 == 1614) {
            field958[++Statics.field1095 - 1] = var3.field2988 ? 1 : 0;
            return 1;
        } else if (arg0 == 1615 || arg0 == 1616) {
            Statics.field1095++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.g(ILcf;ZI)I")
    public static int method933(int arg0, class87 arg1, boolean arg2) {
        class248 var3 = arg2 ? Statics.field1444 : Statics.field3836;
        if (arg0 == 1700) {
            field958[++Statics.field1095 - 1] = var3.field3092;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3092 == -1) {
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = var3.field3093;
            }
            return 1;
        } else if (arg0 == 1702) {
            field958[++Statics.field1095 - 1] = var3.field3100;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fn.t(ILcf;ZI)I")
    public static int method3155(int arg0, class87 arg1, boolean arg2) {
        class248 var3 = arg2 ? Statics.field1444 : Statics.field3836;
        if (arg0 == 1800) {
            field958[++Statics.field1095 - 1] = class249.method3947(client.method188(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field958[--Statics.field1095];
            int var5 = var4 - 1;
            if (var3.field3042 == null || var5 >= var3.field3042.length || var3.field3042[var5] == null) {
                field965[++Statics.field1452 - 1] = "";
            } else {
                field965[++Statics.field1452 - 1] = var3.field3042[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3041 == null) {
                field965[++Statics.field1452 - 1] = "";
            } else {
                field965[++Statics.field1452 - 1] = var3.field3041;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fd.x(ILcf;ZI)I")
    public static int method3322(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field967 >= 10) {
                throw new RuntimeException();
            }
            class248 var10;
            if (arg0 >= 2000) {
                var10 = class248.method3261(field958[--Statics.field1095]);
            } else {
                var10 = arg2 ? Statics.field1444 : Statics.field3836;
            }
            if (var10.field3078 == null) {
                return 0;
            }
            class96 var11 = new class96();
            var11.field1151 = var10;
            var11.field1159 = var10.field3078;
            var11.field1155 = field967 + 1;
            client.field826.method4716(var11);
            return 1;
        } else if (arg0 == 1928) {
            class248 var3 = arg2 ? Statics.field1444 : Statics.field3836;
            int var4 = field958[--Statics.field1095];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class107 var5 = new class107(var4, var3.field2960, var3.field3100, var3.field3092);
            field966.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field1095 -= 3;
            int var6 = field958[Statics.field1095];
            int var7 = field958[Statics.field1095 + 1];
            int var8 = field958[Statics.field1095 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class107 var9 = new class107(var8, var6, var7, class248.method3261(var6).field3092);
            field966.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jb.u(ILcf;ZB)I")
    public static int method4604(int arg0, class87 arg1, boolean arg2) {
        class248 var3 = class248.method3261(field958[--Statics.field1095]);
        if (arg0 == 2500) {
            field958[++Statics.field1095 - 1] = var3.field2974;
            return 1;
        } else if (arg0 == 2501) {
            field958[++Statics.field1095 - 1] = var3.field3024;
            return 1;
        } else if (arg0 == 2502) {
            field958[++Statics.field1095 - 1] = var3.field3080;
            return 1;
        } else if (arg0 == 2503) {
            field958[++Statics.field1095 - 1] = var3.field2977;
            return 1;
        } else if (arg0 == 2504) {
            field958[++Statics.field1095 - 1] = var3.field2981 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field958[++Statics.field1095 - 1] = var3.field2980;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cj.q(ILcf;ZI)I")
    public static int method1972(int arg0, class87 arg1, boolean arg2) {
        class248 var3 = class248.method3261(field958[--Statics.field1095]);
        if (arg0 == 2600) {
            field958[++Statics.field1095 - 1] = var3.field3067;
            return 1;
        } else if (arg0 == 2601) {
            field958[++Statics.field1095 - 1] = var3.field2966;
            return 1;
        } else if (arg0 == 2602) {
            field965[++Statics.field1452 - 1] = var3.field3022;
            return 1;
        } else if (arg0 == 2603) {
            field958[++Statics.field1095 - 1] = var3.field3059;
            return 1;
        } else if (arg0 == 2604) {
            field958[++Statics.field1095 - 1] = var3.field2985;
            return 1;
        } else if (arg0 == 2605) {
            field958[++Statics.field1095 - 1] = var3.field3006;
            return 1;
        } else if (arg0 == 2606) {
            field958[++Statics.field1095 - 1] = var3.field3091;
            return 1;
        } else if (arg0 == 2607) {
            field958[++Statics.field1095 - 1] = var3.field3014;
            return 1;
        } else if (arg0 == 2608) {
            field958[++Statics.field1095 - 1] = var3.field3003;
            return 1;
        } else if (arg0 == 2609) {
            field958[++Statics.field1095 - 1] = var3.field2992;
            return 1;
        } else if (arg0 == 2610) {
            field958[++Statics.field1095 - 1] = var3.field2993;
            return 1;
        } else if (arg0 == 2611) {
            field958[++Statics.field1095 - 1] = var3.field2986;
            return 1;
        } else if (arg0 == 2612) {
            field958[++Statics.field1095 - 1] = var3.field2987;
            return 1;
        } else if (arg0 == 2613) {
            field958[++Statics.field1095 - 1] = var3.field2991.method238();
            return 1;
        } else if (arg0 == 2614) {
            field958[++Statics.field1095 - 1] = var3.field2988 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field1095++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.s(ILcf;ZI)I")
    public static int method584(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class248 var3 = class248.method3261(field958[--Statics.field1095]);
            field958[++Statics.field1095 - 1] = var3.field3092;
            return 1;
        } else if (arg0 == 2701) {
            class248 var4 = class248.method3261(field958[--Statics.field1095]);
            if (var4.field3092 == -1) {
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = var4.field3093;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field958[--Statics.field1095];
            class95 var6 = (class95) client.field796.method5691((long) var5);
            if (var6 == null) {
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field958[++Statics.field1095 - 1] = client.field783;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eh.p(ILcf;ZI)I")
    public static int method2659(int arg0, class87 arg1, boolean arg2) {
        class248 var3 = class248.method3261(field958[--Statics.field1095]);
        if (arg0 == 2800) {
            field958[++Statics.field1095 - 1] = class249.method3947(client.method188(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field958[--Statics.field1095];
            int var5 = var4 - 1;
            if (var3.field3042 == null || var5 >= var3.field3042.length || var3.field3042[var5] == null) {
                field965[++Statics.field1452 - 1] = "";
            } else {
                field965[++Statics.field1452 - 1] = var3.field3042[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3041 == null) {
                field965[++Statics.field1452 - 1] = "";
            } else {
                field965[++Statics.field1452 - 1] = var3.field3041;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.c(ILcf;ZB)I")
    public static int method1774(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field965[--Statics.field1452];
            class112.method2289(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1095 -= 2;
            client.method1542(Statics.field3197, field958[Statics.field1095], field958[Statics.field1095 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field952) {
                field964 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field965[--Statics.field1452];
            int var5 = 0;
            if (class305.method4250(var4)) {
                var5 = class305.method5652(var4);
            }
            class228 var6 = class228.method1927(class226.field2665, client.field669.field1410);
            var6.field2700.method5883(var5);
            client.field669.method2200(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field965[--Statics.field1452];
            class228 var8 = class228.method1927(class226.field2583, client.field669.field1410);
            var8.field2700.method5880(var7.length() + 1);
            var8.field2700.method6068(var7);
            client.field669.method2200(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field965[--Statics.field1452];
            class228 var10 = class228.method1927(class226.field2611, client.field669.field1410);
            var10.field2700.method5880(var9.length() + 1);
            var10.field2700.method6068(var9);
            client.field669.method2200(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field958[--Statics.field1095];
            String var12 = field965[--Statics.field1452];
            client.method5110(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1095 -= 3;
            int var13 = field958[Statics.field1095];
            int var14 = field958[Statics.field1095 + 1];
            int var15 = field958[Statics.field1095 + 2];
            class248 var16 = class248.method3261(var15);
            client.method3404(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1095 -= 2;
            int var17 = field958[Statics.field1095];
            int var18 = field958[Statics.field1095 + 1];
            class248 var19 = arg2 ? Statics.field1444 : Statics.field3836;
            client.method3404(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1450 = field958[--Statics.field1095] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field958[++Statics.field1095 - 1] = Statics.field40.field1321 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field40.field1321 = field958[--Statics.field1095] == 1;
            class103.method2003();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field965[--Statics.field1452];
            boolean var21 = field958[--Statics.field1095] == 1;
            class45.method2107(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field958[--Statics.field1095];
            class228 var23 = class228.method1927(class226.field2623, client.field669.field1410);
            var23.field2700.method5881(var22);
            client.field669.method2200(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field958[--Statics.field1095];
            Statics.field1452 -= 2;
            String var25 = field965[Statics.field1452];
            String var26 = field965[Statics.field1452 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class228 var27 = class228.method1927(class226.field2652, client.field669.field1410);
                var27.field2700.method5881(1 + class384.method376(var25) + class384.method376(var26));
                var27.field2700.method6068(var25);
                var27.field2700.method6068(var26);
                var27.field2700.method5924(var24);
                client.field669.method2200(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field640 = field958[--Statics.field1095] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field771 = field958[--Statics.field1095] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field742 = field958[--Statics.field1095] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field958[--Statics.field1095] == 1) {
                client.field685 |= 0x1;
            } else {
                client.field685 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field958[--Statics.field1095] == 1) {
                client.field685 |= 0x2;
            } else {
                client.field685 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field958[--Statics.field1095] == 1) {
                client.field685 |= 0x4;
            } else {
                client.field685 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field958[--Statics.field1095] == 1) {
                client.field685 |= 0x8;
            } else {
                client.field685 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field685 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field633 = field958[--Statics.field1095] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field875 = field958[--Statics.field1095] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method5643(field958[--Statics.field1095] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field958[++Statics.field1095 - 1] = client.method1997() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field1095 -= 2;
            client.field703 = field958[Statics.field1095];
            client.field704 = field958[Statics.field1095 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field1095 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 3132) {
            field958[++Statics.field1095 - 1] = Statics.field1350;
            field958[++Statics.field1095 - 1] = Statics.field5;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field1095 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field785 = 3;
            client.field695 = field958[--Statics.field1095];
            return 1;
        } else if (arg0 == 3137) {
            client.field785 = 2;
            client.field695 = field958[--Statics.field1095];
            return 1;
        } else if (arg0 == 3138) {
            client.field785 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field785 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field785 = 3;
            client.field695 = arg2 ? Statics.field1444.field2960 : Statics.field3836.field2960;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field958[--Statics.field1095] == 1;
            Statics.field40.field1317 = var28;
            class103.method2003();
            return 1;
        } else if (arg0 == 3142) {
            field958[++Statics.field1095 - 1] = Statics.field40.field1317 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field958[--Statics.field1095] == 1;
            client.field659 = var29;
            if (!var29) {
                Statics.field40.field1319 = "";
                class103.method2003();
            }
            return 1;
        } else if (arg0 == 3144) {
            field958[++Statics.field1095 - 1] = client.field659 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field958[--Statics.field1095] == 1;
            if (Statics.field40.field1315 == var30) {
                Statics.field40.field1315 = !var30;
                class103.method2003();
            }
            return 1;
        } else if (arg0 == 3147) {
            field958[++Statics.field1095 - 1] = Statics.field40.field1315 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field958[++Statics.field1095 - 1] = class84.field1010;
            return 1;
        } else if (arg0 == 3154) {
            field958[++Statics.field1095 - 1] = client.method5646();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1452--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field1095 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field1095--;
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field1095--;
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1452--;
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field1095--;
            field965[++Statics.field1452 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field1095--;
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field1095 -= 2;
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field1095 -= 2;
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field1095 -= 2;
            field965[++Statics.field1452 - 1] = "";
            field965[++Statics.field1452 - 1] = "";
            field965[++Statics.field1452 - 1] = "";
            field965[++Statics.field1452 - 1] = "";
            field965[++Statics.field1452 - 1] = "";
            field965[++Statics.field1452 - 1] = "";
            field965[++Statics.field1452 - 1] = "";
            field965[++Statics.field1452 - 1] = "";
            field965[++Statics.field1452 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field1095--;
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 3175) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1452--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1452--;
            return 1;
        } else if (arg0 == 3181) {
            int var31 = 100 - Math.min(Math.max(field958[--Statics.field1095], 0), 100);
            client.method2290((double) ((float) var31 / 200.0F + 0.5F));
            return 1;
        } else if (arg0 == 3182) {
            float var32 = ((float) Statics.field40.field1313 - 0.5F) * 200.0F;
            field958[++Statics.field1095 - 1] = 100 - Math.round(var32);
            return 1;
        } else if (arg0 == 3183 || arg0 == 3184) {
            Statics.field1095--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jd.l(ILcf;ZI)I")
    public static int method4438(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field958[++Statics.field1095 - 1] = client.field631;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1095 -= 2;
            int var3 = field958[Statics.field1095];
            int var4 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = class93.method335(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1095 -= 2;
            int var5 = field958[Statics.field1095];
            int var6 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = class93.method2511(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1095 -= 2;
            int var7 = field958[Statics.field1095];
            int var8 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = class93.method201(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class138.method4422(var9).field1547;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = client.field755[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = client.field756[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = client.field788[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field438;
            int var14 = (Statics.field3197.field1242 >> 7) + Statics.field127;
            int var15 = (Statics.field3197.field1223 >> 7) + Statics.field2092;
            field958[++Statics.field1095 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field958[++Statics.field1095 - 1] = client.field623 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1095 -= 2;
            int var19 = field958[Statics.field1095] + 32768;
            int var20 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = class93.method335(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1095 -= 2;
            int var21 = field958[Statics.field1095] + 32768;
            int var22 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = class93.method2511(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1095 -= 2;
            int var23 = field958[Statics.field1095] + 32768;
            int var24 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = class93.method201(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field792 >= 2) {
                field958[++Statics.field1095 - 1] = client.field792;
            } else {
                field958[++Statics.field1095 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field958[++Statics.field1095 - 1] = client.field638;
            return 1;
        } else if (arg0 == 3318) {
            field958[++Statics.field1095 - 1] = client.field804;
            return 1;
        } else if (arg0 == 3321) {
            field958[++Statics.field1095 - 1] = client.field728;
            return 1;
        } else if (arg0 == 3322) {
            field958[++Statics.field1095 - 1] = client.field682;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field794) {
                field958[++Statics.field1095 - 1] = 1;
            } else {
                field958[++Statics.field1095 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field958[++Statics.field1095 - 1] = client.field621;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1095 -= 4;
            int var25 = field958[Statics.field1095];
            int var26 = field958[Statics.field1095 + 1];
            int var27 = field958[Statics.field1095 + 2];
            int var28 = field958[Statics.field1095 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field958[++Statics.field1095 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field958[++Statics.field1095 - 1] = client.field844;
            return 1;
        } else if (arg0 == 3327) {
            field958[++Statics.field1095 - 1] = client.field634;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.w(ILcf;ZI)I")
    public static int method167(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1095 -= 2;
            int var3 = field958[Statics.field1095];
            int var4 = field958[Statics.field1095 + 1];
            class145 var5 = class145.method3833(var3);
            if (var5.field1620 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1627; var6++) {
                if (var5.field1626[var6] == var4) {
                    field965[++Statics.field1452 - 1] = var5.field1623[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field965[++Statics.field1452 - 1] = var5.field1624;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1095 -= 4;
            int var7 = field958[Statics.field1095];
            int var8 = field958[Statics.field1095 + 1];
            int var9 = field958[Statics.field1095 + 2];
            int var10 = field958[Statics.field1095 + 3];
            class145 var11 = class145.method3833(var9);
            if (var11.field1622 != var7 || var11.field1620 != var8) {
                if (var8 == 115) {
                    field965[++Statics.field1452 - 1] = class269.field3238;
                } else {
                    field958[++Statics.field1095 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1627; var12++) {
                if (var11.field1626[var12] == var10) {
                    if (var8 == 115) {
                        field965[++Statics.field1452 - 1] = var11.field1623[var12];
                    } else {
                        field958[++Statics.field1095 - 1] = var11.field1629[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field965[++Statics.field1452 - 1] = var11.field1624;
                } else {
                    field958[++Statics.field1095 - 1] = var11.field1625;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field958[--Statics.field1095];
            class145 var14 = class145.method3833(var13);
            field958[++Statics.field1095 - 1] = var14.method2516();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ec.a(ILcf;ZB)I")
    public static int method2390(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class39.method168(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = Statics.method68(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class39.method2475(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fo.ak(ILcf;ZI)I")
    public static int method2950(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field1095--;
            Statics.field1452--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field1095++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.ad(ILcf;ZB)I")
    public static int method223(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field2008 == null) {
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = 1;
                Statics.field3129 = Statics.field2008;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field958[--Statics.field1095];
            if (client.field852[var3] == null) {
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = 1;
                Statics.field3129 = client.field852[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field965[++Statics.field1452 - 1] = Statics.field3129.field85;
            return 1;
        } else if (arg0 == 3803) {
            field958[++Statics.field1095 - 1] = Statics.field3129.field87 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field958[++Statics.field1095 - 1] = Statics.field3129.field88;
            return 1;
        } else if (arg0 == 3805) {
            field958[++Statics.field1095 - 1] = Statics.field3129.field89;
            return 1;
        } else if (arg0 == 3806) {
            field958[++Statics.field1095 - 1] = Statics.field3129.field94;
            return 1;
        } else if (arg0 == 3807) {
            field958[++Statics.field1095 - 1] = Statics.field3129.field91;
            return 1;
        } else if (arg0 == 3809) {
            field958[++Statics.field1095 - 1] = Statics.field3129.field80;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field958[--Statics.field1095];
            field965[++Statics.field1452 - 1] = Statics.field3129.field103[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = Statics.field3129.field92[var5];
            return 1;
        } else if (arg0 == 3812) {
            field958[++Statics.field1095 - 1] = Statics.field3129.field101;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field958[--Statics.field1095];
            field965[++Statics.field1452 - 1] = Statics.field3129.field104[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field1095 -= 3;
            int var7 = field958[Statics.field1095];
            int var8 = field958[Statics.field1095 + 1];
            int var9 = field958[Statics.field1095 + 2];
            field958[++Statics.field1095 - 1] = Statics.field3129.method121(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field958[++Statics.field1095 - 1] = Statics.field3129.field99;
            return 1;
        } else if (arg0 == 3816) {
            field958[++Statics.field1095 - 1] = Statics.field3129.field100;
            return 1;
        } else if (arg0 == 3817) {
            field958[++Statics.field1095 - 1] = Statics.field3129.method147(field965[--Statics.field1452]);
            return 1;
        } else if (arg0 == 3818) {
            field958[Statics.field1095 - 1] = Statics.field3129.method127()[field958[Statics.field1095 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field1095 -= 2;
            int var10 = field958[Statics.field1095];
            int var11 = field958[Statics.field1095 + 1];
            Statics.method3202(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = Statics.field3129.field97[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field1095 -= 3;
                int var13 = field958[Statics.field1095];
                boolean var14 = field958[Statics.field1095 + 1] == 1;
                int var15 = field958[Statics.field1095 + 2];
                client.method4629(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field958[--Statics.field1095];
                field958[++Statics.field1095 - 1] = Statics.field3129.field98[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field1347 == null) {
                    field958[++Statics.field1095 - 1] = 0;
                } else {
                    field958[++Statics.field1095 - 1] = 1;
                    Statics.field2032 = Statics.field1347;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field958[--Statics.field1095];
                if (client.field745[var17] == null) {
                    field958[++Statics.field1095 - 1] = 0;
                } else {
                    field958[++Statics.field1095 - 1] = 1;
                    Statics.field2032 = client.field745[var17];
                    Statics.field172 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field965[++Statics.field1452 - 1] = Statics.field2032.field25;
                return 1;
            } else if (arg0 == 3853) {
                field958[++Statics.field1095 - 1] = Statics.field2032.field29;
                return 1;
            } else if (arg0 == 3854) {
                field958[++Statics.field1095 - 1] = Statics.field2032.field28;
                return 1;
            } else if (arg0 == 3855) {
                field958[++Statics.field1095 - 1] = Statics.field2032.method41();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field958[--Statics.field1095];
                field965[++Statics.field1452 - 1] = ((class10) Statics.field2032.field24.get(var18)).field67;
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field958[--Statics.field1095];
                field958[++Statics.field1095 - 1] = ((class10) Statics.field2032.field24.get(var19)).field71;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field958[--Statics.field1095];
                field958[++Statics.field1095 - 1] = ((class10) Statics.field2032.field24.get(var20)).field65;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field958[--Statics.field1095];
                client.method219(Statics.field172, var21);
                return 1;
            } else if (arg0 == 3860) {
                field958[++Statics.field1095 - 1] = Statics.field2032.method30(field965[--Statics.field1452]);
                return 1;
            } else if (arg0 == 3861) {
                field958[Statics.field1095 - 1] = Statics.field2032.method26()[field958[Statics.field1095 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field958[++Statics.field1095 - 1] = Statics.field75 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("jv.at(ILcf;ZB)I")
    public static int method4630(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = client.field850[var3].method4653();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = client.field850[var4].field3660;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = client.field850[var5].field3656;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = client.field850[var6].field3657;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = client.field850[var7].field3658;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = client.field850[var8].field3659;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field958[--Statics.field1095];
            int var10 = client.field850[var9].method4651();
            field958[++Statics.field1095 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field958[--Statics.field1095];
            int var12 = client.field850[var11].method4651();
            field958[++Statics.field1095 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field958[--Statics.field1095];
            int var14 = client.field850[var13].method4651();
            field958[++Statics.field1095 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field958[--Statics.field1095];
            int var16 = client.field850[var15].method4651();
            field958[++Statics.field1095 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field958[--Statics.field1095] == 1;
            if (Statics.field3228 != null) {
                Statics.field3228.method4605(class278.field3629, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field958[--Statics.field1095] == 1;
            if (Statics.field3228 != null) {
                Statics.field3228.method4605(class278.field3624, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1095 -= 2;
            boolean var19 = field958[Statics.field1095] == 1;
            boolean var20 = field958[Statics.field1095 + 1] == 1;
            if (Statics.field3228 != null) {
                client.field786.field612 = var20;
                Statics.field3228.method4605(client.field786, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field958[--Statics.field1095] == 1;
            if (Statics.field3228 != null) {
                Statics.field3228.method4605(class278.field3627, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field958[--Statics.field1095] == 1;
            if (Statics.field3228 != null) {
                Statics.field3228.method4605(class278.field3628, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field958[++Statics.field1095 - 1] = Statics.field3228 == null ? 0 : Statics.field3228.field3625.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field958[--Statics.field1095];
            class284 var24 = (class284) Statics.field3228.field3625.get(var23);
            field958[++Statics.field1095 - 1] = var24.field3649;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field958[--Statics.field1095];
            class284 var26 = (class284) Statics.field3228.field3625.get(var25);
            field965[++Statics.field1452 - 1] = var26.method4639();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field958[--Statics.field1095];
            class284 var28 = (class284) Statics.field3228.field3625.get(var27);
            field965[++Statics.field1452 - 1] = var28.method4641();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field958[--Statics.field1095];
            class284 var30 = (class284) Statics.field3228.field3625.get(var29);
            long var31 = class381.method4000() - Statics.field2151 - var30.field3648;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field965[++Statics.field1452 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field958[--Statics.field1095];
            class284 var38 = (class284) Statics.field3228.field3625.get(var37);
            field958[++Statics.field1095 - 1] = var38.field3651.field3657;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field958[--Statics.field1095];
            class284 var40 = (class284) Statics.field3228.field3625.get(var39);
            field958[++Statics.field1095 - 1] = var40.field3651.field3656;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field958[--Statics.field1095];
            class284 var42 = (class284) Statics.field3228.field3625.get(var41);
            field958[++Statics.field1095 - 1] = var42.field3651.field3660;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ev.ah(ILcf;ZI)I")
    public static int method2549(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1095 -= 2;
            int var3 = field958[Statics.field1095];
            int var4 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1095 -= 2;
            int var5 = field958[Statics.field1095];
            int var6 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1095 -= 2;
            int var7 = field958[Statics.field1095];
            int var8 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1095 -= 2;
            int var9 = field958[Statics.field1095];
            int var10 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1095 -= 5;
            int var13 = field958[Statics.field1095];
            int var14 = field958[Statics.field1095 + 1];
            int var15 = field958[Statics.field1095 + 2];
            int var16 = field958[Statics.field1095 + 3];
            int var17 = field958[Statics.field1095 + 4];
            field958[++Statics.field1095 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1095 -= 2;
            int var18 = field958[Statics.field1095];
            int var19 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1095 -= 2;
            int var20 = field958[Statics.field1095];
            int var21 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1095 -= 2;
            int var22 = field958[Statics.field1095];
            int var23 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1095 -= 2;
            int var24 = field958[Statics.field1095];
            int var25 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1095 -= 2;
            int var26 = field958[Statics.field1095];
            int var27 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1095 -= 2;
            int var28 = field958[Statics.field1095];
            int var29 = field958[Statics.field1095 + 1];
            if (var28 == 0) {
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1095 -= 2;
            int var30 = field958[Statics.field1095];
            int var31 = field958[Statics.field1095 + 1];
            if (var30 == 0) {
                field958[++Statics.field1095 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field958[++Statics.field1095 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field958[++Statics.field1095 - 1] = var30;
                    break;
                case 2:
                    field958[++Statics.field1095 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field958[++Statics.field1095 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field958[++Statics.field1095 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field958[++Statics.field1095 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1095 -= 2;
            int var32 = field958[Statics.field1095];
            int var33 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1095 -= 2;
            int var34 = field958[Statics.field1095];
            int var35 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1095 -= 3;
            long var36 = (long) field958[Statics.field1095];
            long var38 = (long) field958[Statics.field1095 + 1];
            long var40 = (long) field958[Statics.field1095 + 2];
            field958[++Statics.field1095 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class232.method4439(field958[--Statics.field1095]);
            field958[++Statics.field1095 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field1095 -= 2;
            int var43 = field958[Statics.field1095];
            int var44 = field958[Statics.field1095 + 1];
            field958[++Statics.field1095 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field1095 -= 3;
            int var45 = field958[Statics.field1095];
            int var46 = field958[Statics.field1095 + 1];
            int var47 = field958[Statics.field1095 + 2];
            field958[++Statics.field1095 - 1] = class232.method3321(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field1095 -= 3;
            int var48 = field958[Statics.field1095];
            int var49 = field958[Statics.field1095 + 1];
            int var50 = field958[Statics.field1095 + 2];
            field958[++Statics.field1095 - 1] = class232.method3350(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field1095 -= 3;
            int var51 = field958[Statics.field1095];
            int var52 = field958[Statics.field1095 + 1];
            int var53 = field958[Statics.field1095 + 2];
            int var54 = 31 - var53;
            field958[++Statics.field1095 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field1095 -= 4;
            int var55 = field958[Statics.field1095];
            int var56 = field958[Statics.field1095 + 1];
            int var57 = field958[Statics.field1095 + 2];
            int var58 = field958[Statics.field1095 + 3];
            int var59 = class232.method3350(var55, var57, var58);
            int var60 = class232.method6169(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field958[++Statics.field1095 - 1] = var59 | var56 << var57;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.az(ILcf;ZI)I")
    public static int method745(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field965[--Statics.field1452];
            int var4 = field958[--Statics.field1095];
            field965[++Statics.field1452 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1452 -= 2;
            String var5 = field965[Statics.field1452];
            String var6 = field965[Statics.field1452 + 1];
            field965[++Statics.field1452 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field965[--Statics.field1452];
            int var8 = field958[--Statics.field1095];
            field965[++Statics.field1452 - 1] = var7 + class305.method2482(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field965[--Statics.field1452];
            field965[++Statics.field1452 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field958[--Statics.field1095];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field962.setTime(new Date(var11));
            int var13 = field962.get(5);
            int var14 = field962.get(2);
            int var15 = field962.get(1);
            field965[++Statics.field1452 - 1] = var13 + "-" + field959[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1452 -= 2;
            String var16 = field965[Statics.field1452];
            String var17 = field965[Statics.field1452 + 1];
            if (Statics.field3197.field1176 != null && Statics.field3197.field1176.field2936) {
                field965[++Statics.field1452 - 1] = var17;
            } else {
                field965[++Statics.field1452 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field958[--Statics.field1095];
            field965[++Statics.field1452 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1452 -= 2;
            field958[++Statics.field1095 - 1] = class305.method4443(class306.method4004(field965[Statics.field1452], field965[Statics.field1452 + 1], Statics.field3594));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field965[--Statics.field1452];
            Statics.field1095 -= 2;
            int var20 = field958[Statics.field1095];
            int var21 = field958[Statics.field1095 + 1];
            byte[] var22 = Statics.field615.method4504(var21, 0);
            class301 var23 = new class301(var22);
            field958[++Statics.field1095 - 1] = var23.method4892(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field965[--Statics.field1452];
            Statics.field1095 -= 2;
            int var25 = field958[Statics.field1095];
            int var26 = field958[Statics.field1095 + 1];
            byte[] var27 = Statics.field615.method4504(var26, 0);
            class301 var28 = new class301(var27);
            field958[++Statics.field1095 - 1] = var28.method4935(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1452 -= 2;
            String var29 = field965[Statics.field1452];
            String var30 = field965[Statics.field1452 + 1];
            if (field958[--Statics.field1095] == 1) {
                field965[++Statics.field1452 - 1] = var29;
            } else {
                field965[++Statics.field1452 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field965[--Statics.field1452];
            field965[++Statics.field1452 - 1] = class302.method4893(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field965[--Statics.field1452];
            int var33 = field958[--Statics.field1095];
            field965[++Statics.field1452 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class305.method4426((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class305.method1840((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class305.method2690((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class305.method2088((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field965[--Statics.field1452];
            if (var38 == null) {
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field965[--Statics.field1452];
            Statics.field1095 -= 2;
            int var40 = field958[Statics.field1095];
            int var41 = field958[Statics.field1095 + 1];
            field965[++Statics.field1452 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field965[--Statics.field1452];
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
            field965[++Statics.field1452 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field965[--Statics.field1452];
            int var48 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1452 -= 2;
            String var49 = field965[Statics.field1452];
            String var50 = field965[Statics.field1452 + 1];
            int var51 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field965[--Statics.field1452];
            field965[++Statics.field1452 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ne.ap(ILcf;ZI)I")
    public static int method5820(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field958[--Statics.field1095];
            field965[++Statics.field1452 - 1] = class156.method4403(var3).field1855;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1095 -= 2;
            int var4 = field958[Statics.field1095];
            int var5 = field958[Statics.field1095 + 1];
            class156 var6 = class156.method4403(var4);
            if (var5 < 1 || var5 > 5 || var6.field1834[var5 - 1] == null) {
                field965[++Statics.field1452 - 1] = "";
            } else {
                field965[++Statics.field1452 - 1] = var6.field1834[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1095 -= 2;
            int var7 = field958[Statics.field1095];
            int var8 = field958[Statics.field1095 + 1];
            class156 var9 = class156.method4403(var7);
            if (var8 < 1 || var8 > 5 || var9.field1853[var8 - 1] == null) {
                field965[++Statics.field1452 - 1] = "";
            } else {
                field965[++Statics.field1452 - 1] = var9.field1853[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class156.method4403(var10).field1832;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class156.method4403(var11).field1831 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field958[--Statics.field1095];
            class156 var13 = class156.method4403(var12);
            if (var13.field1854 == -1 && var13.field1821 >= 0) {
                field958[++Statics.field1095 - 1] = var13.field1821;
            } else {
                field958[++Statics.field1095 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field958[--Statics.field1095];
            class156 var15 = class156.method4403(var14);
            if (var15.field1854 >= 0 && var15.field1821 >= 0) {
                field958[++Statics.field1095 - 1] = var15.field1821;
            } else {
                field958[++Statics.field1095 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class156.method4403(var16).field1833 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field958[--Statics.field1095];
            class156 var18 = class156.method4403(var17);
            if (var18.field1864 == -1 && var18.field1863 >= 0) {
                field958[++Statics.field1095 - 1] = var18.field1863;
            } else {
                field958[++Statics.field1095 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field958[--Statics.field1095];
            class156 var20 = class156.method4403(var19);
            if (var20.field1864 >= 0 && var20.field1863 >= 0) {
                field958[++Statics.field1095 - 1] = var20.field1863;
            } else {
                field958[++Statics.field1095 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field965[--Statics.field1452];
            int var22 = field958[--Statics.field1095];
            client.method323(var21, var22 == 1);
            field958[++Statics.field1095 - 1] = Statics.field607;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field33 == null || Statics.field415 >= Statics.field607) {
                field958[++Statics.field1095 - 1] = -1;
            } else {
                field958[++Statics.field1095 - 1] = Statics.field33[++Statics.field415 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field415 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field958[--Statics.field1095];
            int var24 = class156.method4403(var23).method2792();
            if (var24 == -1) {
                field958[++Statics.field1095 - 1] = var24;
            } else {
                field958[++Statics.field1095 - 1] = var24 + 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("a.ag(ILcf;ZI)I")
    public static int method195(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field958[++Statics.field1095 - 1] = client.field843;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1095 -= 3;
            client.field843 = field958[Statics.field1095];
            Statics.field27 = Statics.method4281(field958[Statics.field1095 + 1]);
            if (Statics.field27 == null) {
                Statics.field27 = class335.field3887;
            }
            client.field636 = field958[Statics.field1095 + 2];
            class228 var3 = class228.method1927(class226.field2680, client.field669.field1410);
            var3.field2700.method5880(client.field843);
            var3.field2700.method5880(Statics.field27.field3885);
            var3.field2700.method5880(client.field636);
            client.field669.method2200(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field965[--Statics.field1452];
            Statics.field1095 -= 2;
            int var5 = field958[Statics.field1095];
            int var6 = field958[Statics.field1095 + 1];
            class228 var7 = class228.method1927(class226.field2637, client.field669.field1410);
            var7.field2700.method5880(class384.method376(var4) + 2);
            var7.field2700.method6068(var4);
            var7.field2700.method5880(var5 - 1);
            var7.field2700.method5880(var6);
            client.field669.method2200(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1095 -= 2;
            int var8 = field958[Statics.field1095];
            int var9 = field958[Statics.field1095 + 1];
            class73 var10 = class112.method1486(var8, var9);
            if (var10 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
                field965[++Statics.field1452 - 1] = "";
                field965[++Statics.field1452 - 1] = "";
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = var10.field598;
                field958[++Statics.field1095 - 1] = var10.field595;
                field965[++Statics.field1452 - 1] = var10.field597 == null ? "" : var10.field597;
                field965[++Statics.field1452 - 1] = var10.field601 == null ? "" : var10.field601;
                field965[++Statics.field1452 - 1] = var10.field602 == null ? "" : var10.field602;
                field958[++Statics.field1095 - 1] = var10.method1007() ? 1 : (var10.method1025() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field958[--Statics.field1095];
            class73 var12 = class112.method1487(var11);
            if (var12 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
                field965[++Statics.field1452 - 1] = "";
                field965[++Statics.field1452 - 1] = "";
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = var12.field596;
                field958[++Statics.field1095 - 1] = var12.field595;
                field965[++Statics.field1452 - 1] = var12.field597 == null ? "" : var12.field597;
                field965[++Statics.field1452 - 1] = var12.field601 == null ? "" : var12.field601;
                field965[++Statics.field1452 - 1] = var12.field602 == null ? "" : var12.field602;
                field958[++Statics.field1095 - 1] = var12.method1007() ? 1 : (var12.method1025() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field27 == null) {
                field958[++Statics.field1095 - 1] = -1;
            } else {
                field958[++Statics.field1095 - 1] = Statics.field27.field3885;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field965[--Statics.field1452];
            int var14 = field958[--Statics.field1095];
            class228 var15 = class405.method5390(var14, var13, Statics.field3594, -1);
            client.field669.method2200(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1452 -= 2;
            String var16 = field965[Statics.field1452];
            String var17 = field965[Statics.field1452 + 1];
            class228 var18 = class228.method1927(class226.field2669, client.field669.field1410);
            var18.field2700.method5881(0);
            int var19 = var18.field2700.field4161;
            var18.field2700.method6068(var16);
            class251.method4703(var18.field2700, var17);
            var18.field2700.method5939(var18.field2700.field4161 - var19);
            client.field669.method2200(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field965[--Statics.field1452];
            Statics.field1095 -= 2;
            int var21 = field958[Statics.field1095];
            int var22 = field958[Statics.field1095 + 1];
            class228 var23 = class405.method5390(var21, var20, Statics.field3594, var22);
            client.field669.method2200(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field3197 == null || Statics.field3197.field1175 == null) {
                var24 = "";
            } else {
                var24 = Statics.field3197.field1175.method5264();
            }
            field965[++Statics.field1452 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field958[++Statics.field1095 - 1] = client.field636;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class112.method4587(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class112.method1762(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = class112.method187(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field965[--Statics.field1452];
            client.method326(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field643 = field965[--Statics.field1452].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field965[++Statics.field1452 - 1] = client.field643;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field965[--Statics.field1452];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5024) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 5025) {
            Statics.field1095++;
            return 1;
        } else if (arg0 == 5030) {
            Statics.field1095 -= 2;
            int var30 = field958[Statics.field1095];
            int var31 = field958[Statics.field1095 + 1];
            class73 var32 = class112.method1486(var30, var31);
            if (var32 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
                field965[++Statics.field1452 - 1] = "";
                field965[++Statics.field1452 - 1] = "";
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = var32.field598;
                field958[++Statics.field1095 - 1] = var32.field595;
                field965[++Statics.field1452 - 1] = var32.field597 == null ? "" : var32.field597;
                field965[++Statics.field1452 - 1] = var32.field601 == null ? "" : var32.field601;
                field965[++Statics.field1452 - 1] = var32.field602 == null ? "" : var32.field602;
                field958[++Statics.field1095 - 1] = var32.method1007() ? 1 : (var32.method1025() ? 2 : 0);
                field965[++Statics.field1452 - 1] = "";
                field958[++Statics.field1095 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field958[--Statics.field1095];
            class73 var34 = class112.method1487(var33);
            if (var34 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
                field965[++Statics.field1452 - 1] = "";
                field965[++Statics.field1452 - 1] = "";
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = var34.field596;
                field958[++Statics.field1095 - 1] = var34.field595;
                field965[++Statics.field1452 - 1] = var34.field597 == null ? "" : var34.field597;
                field965[++Statics.field1452 - 1] = var34.field601 == null ? "" : var34.field601;
                field965[++Statics.field1452 - 1] = var34.field602 == null ? "" : var34.field602;
                field958[++Statics.field1095 - 1] = var34.method1007() ? 1 : (var34.method1025() ? 2 : 0);
                field965[++Statics.field1452 - 1] = "";
                field958[++Statics.field1095 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fj.ab(ILcf;ZB)I")
    public static int method3283(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field958[++Statics.field1095 - 1] = client.method4981();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field958[--Statics.field1095];
            if (var3 == 1 || var3 == 2) {
                client.method4421(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field958[++Statics.field1095 - 1] = Statics.field40.field1316;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field958[--Statics.field1095];
            if (var4 == 1 || var4 == 2) {
                Statics.field40.field1316 = var4;
                class103.method2003();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 5311) {
            Statics.field1095 -= 2;
            return 1;
        } else if (arg0 == 5312) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field1452 -= 2;
            Statics.field1095--;
            return 1;
        } else if (arg0 == 5351) {
            Statics.field1452--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.aq(ILcf;ZI)I")
    public static int method2019(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1095 -= 2;
            int var3 = field958[Statics.field1095];
            int var4 = field958[Statics.field1095 + 1];
            if (!client.field879) {
                client.field692 = var3;
                client.field693 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field958[++Statics.field1095 - 1] = client.field692;
            return 1;
        } else if (arg0 == 5506) {
            field958[++Statics.field1095 - 1] = client.field693;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field958[--Statics.field1095];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field699 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field958[++Statics.field1095 - 1] = client.field699;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dj.ae(ILcf;ZI)I")
    public static int method2307(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field670 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field1452 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field958[++Statics.field1095 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bu.ao(II)I")
    public static int method1004(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("u.an(II)I")
    public static int method164(int arg0) {
        return (int) ((Math.log((double) arg0) / field960 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("s.al(ILcf;ZB)I")
    public static int method172(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1095 -= 2;
            client.field877 = (short) method1004(field958[Statics.field1095]);
            if (client.field877 <= 0) {
                client.field877 = 256;
            }
            client.field878 = (short) method1004(field958[Statics.field1095 + 1]);
            if (client.field878 <= 0) {
                client.field878 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1095 -= 2;
            client.field654 = (short) field958[Statics.field1095];
            if (client.field654 <= 0) {
                client.field654 = 256;
            }
            client.field880 = (short) field958[Statics.field1095 + 1];
            if (client.field880 <= 0) {
                client.field880 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1095 -= 4;
            client.field881 = (short) field958[Statics.field1095];
            if (client.field881 <= 0) {
                client.field881 = 1;
            }
            client.field865 = (short) field958[Statics.field1095 + 1];
            if (client.field865 <= 0) {
                client.field865 = 32767;
            } else if (client.field865 < client.field881) {
                client.field865 = client.field881;
            }
            client.field882 = (short) field958[Statics.field1095 + 2];
            if (client.field882 <= 0) {
                client.field882 = 1;
            }
            client.field691 = (short) field958[Statics.field1095 + 3];
            if (client.field691 <= 0) {
                client.field691 = 32767;
            } else if (client.field691 < client.field882) {
                client.field691 = client.field882;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field795 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = -1;
            } else {
                client.method1698(0, 0, client.field795.field3080, client.field795.field2977, false);
                field958[++Statics.field1095 - 1] = client.field887;
                field958[++Statics.field1095 - 1] = client.field888;
            }
            return 1;
        } else if (arg0 == 6204) {
            field958[++Statics.field1095 - 1] = client.field654;
            field958[++Statics.field1095 - 1] = client.field880;
            return 1;
        } else if (arg0 == 6205) {
            field958[++Statics.field1095 - 1] = method164(client.field877);
            field958[++Statics.field1095 - 1] = method164(client.field878);
            return 1;
        } else if (arg0 == 6220) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field958[++Statics.field1095 - 1] = Statics.field1350;
            return 1;
        } else if (arg0 == 6223) {
            field958[++Statics.field1095 - 1] = Statics.field5;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.aj(ILcf;ZI)I")
    public static int method62(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field958[++Statics.field1095 - 1] = class76.method3794() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class76 var3 = class76.method324();
            if (var3 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
                field958[++Statics.field1095 - 1] = 0;
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
            } else {
                field958[++Statics.field1095 - 1] = var3.field913;
                field958[++Statics.field1095 - 1] = var3.field916;
                field965[++Statics.field1452 - 1] = var3.field908;
                field958[++Statics.field1095 - 1] = var3.field918;
                field958[++Statics.field1095 - 1] = var3.field906;
                field965[++Statics.field1452 - 1] = var3.field917;
            }
            return 1;
        } else if (arg0 == 6502) {
            class76 var4 = class76.method1097();
            if (var4 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
                field958[++Statics.field1095 - 1] = 0;
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
            } else {
                field958[++Statics.field1095 - 1] = var4.field913;
                field958[++Statics.field1095 - 1] = var4.field916;
                field965[++Statics.field1452 - 1] = var4.field908;
                field958[++Statics.field1095 - 1] = var4.field918;
                field958[++Statics.field1095 - 1] = var4.field906;
                field965[++Statics.field1452 - 1] = var4.field917;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field958[--Statics.field1095];
            class76 var6 = null;
            for (int var7 = 0; var7 < class76.field910; var7++) {
                if (Statics.field907[var7].field913 == var5) {
                    var6 = Statics.field907[var7];
                    break;
                }
            }
            if (var6 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
                field958[++Statics.field1095 - 1] = 0;
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
            } else {
                field958[++Statics.field1095 - 1] = var6.field913;
                field958[++Statics.field1095 - 1] = var6.field916;
                field965[++Statics.field1452 - 1] = var6.field908;
                field958[++Statics.field1095 - 1] = var6.field918;
                field958[++Statics.field1095 - 1] = var6.field906;
                field965[++Statics.field1452 - 1] = var6.field917;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1095 -= 4;
            int var8 = field958[Statics.field1095];
            boolean var9 = field958[Statics.field1095 + 1] == 1;
            int var10 = field958[Statics.field1095 + 2];
            boolean var11 = field958[Statics.field1095 + 3] == 1;
            class76.method3288(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field958[--Statics.field1095];
            if (var12 >= 0 && var12 < class76.field910) {
                class76 var13 = Statics.field907[var12];
                field958[++Statics.field1095 - 1] = var13.field913;
                field958[++Statics.field1095 - 1] = var13.field916;
                field965[++Statics.field1452 - 1] = var13.field908;
                field958[++Statics.field1095 - 1] = var13.field918;
                field958[++Statics.field1095 - 1] = var13.field906;
                field965[++Statics.field1452 - 1] = var13.field917;
            } else {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
                field958[++Statics.field1095 - 1] = 0;
                field958[++Statics.field1095 - 1] = 0;
                field965[++Statics.field1452 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field835 = field958[--Statics.field1095] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1095 -= 2;
            int var14 = field958[Statics.field1095];
            int var15 = field958[Statics.field1095 + 1];
            class152 var16 = class152.method2294(var15);
            if (var16.method2627()) {
                field965[++Statics.field1452 - 1] = class147.method4374(var14).method2541(var15, var16.field1721);
            } else {
                field958[++Statics.field1095 - 1] = class147.method4374(var14).method2540(var15, var16.field1720);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1095 -= 2;
            int var17 = field958[Statics.field1095];
            int var18 = field958[Statics.field1095 + 1];
            class152 var19 = class152.method2294(var18);
            if (var19.method2627()) {
                field965[++Statics.field1452 - 1] = class155.method1864(var17).method2714(var18, var19.field1721);
            } else {
                field958[++Statics.field1095 - 1] = class155.method1864(var17).method2713(var18, var19.field1720);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1095 -= 2;
            int var20 = field958[Statics.field1095];
            int var21 = field958[Statics.field1095 + 1];
            class152 var22 = class152.method2294(var21);
            if (var22.method2627()) {
                field965[++Statics.field1452 - 1] = class156.method4403(var20).method2771(var21, var22.field1721);
            } else {
                field958[++Statics.field1095 - 1] = class156.method4403(var20).method2770(var21, var22.field1720);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1095 -= 2;
            int var23 = field958[Statics.field1095];
            int var24 = field958[Statics.field1095 + 1];
            class152 var25 = class152.method2294(var24);
            if (var25.method2627()) {
                field965[++Statics.field1452 - 1] = class153.method2292(var23).method2645(var24, var25.field1721);
            } else {
                field958[++Statics.field1095 - 1] = class153.method2292(var23).method2644(var24, var25.field1720);
            }
            return 1;
        } else if (arg0 == 6518) {
            field958[++Statics.field1095 - 1] = client.field627 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field958[++Statics.field1095 - 1] = client.field625 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1452--;
            Statics.field1095--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1452--;
            Statics.field1095--;
            return 1;
        } else if (arg0 == 6524) {
            field958[++Statics.field1095 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field958[++Statics.field1095 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field958[++Statics.field1095 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field958[++Statics.field1095 - 1] = client.field626;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kg.ac(ILcf;ZI)I")
    public static int method4699(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field438;
            int var4 = (Statics.field3197.field1242 >> 7) + Statics.field127;
            int var5 = (Statics.field3197.field1223 >> 7) + Statics.field2092;
            client.method6121().method5604(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field958[--Statics.field1095];
            String var7 = "";
            class167 var8 = client.method6121().method5495(var6);
            if (var8 != null) {
                var7 = var8.method3080();
            }
            field965[++Statics.field1452 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field958[--Statics.field1095];
            client.method6121().method5513(var9);
            return 1;
        } else if (arg0 == 6603) {
            field958[++Statics.field1095 - 1] = client.method6121().method5473();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field958[--Statics.field1095];
            client.method6121().method5470(var10);
            return 1;
        } else if (arg0 == 6605) {
            field958[++Statics.field1095 - 1] = client.method6121().method5492() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class244 var11 = new class244(field958[--Statics.field1095]);
            client.method6121().method5497(var11.field2927, var11.field2928);
            return 1;
        } else if (arg0 == 6607) {
            class244 var12 = new class244(field958[--Statics.field1095]);
            client.method6121().method5510(var12.field2927, var12.field2928);
            return 1;
        } else if (arg0 == 6608) {
            class244 var13 = new class244(field958[--Statics.field1095]);
            client.method6121().method5589(var13.field2929, var13.field2927, var13.field2928);
            return 1;
        } else if (arg0 == 6609) {
            class244 var14 = new class244(field958[--Statics.field1095]);
            client.method6121().method5480(var14.field2929, var14.field2927, var14.field2928);
            return 1;
        } else if (arg0 == 6610) {
            field958[++Statics.field1095 - 1] = client.method6121().method5622();
            field958[++Statics.field1095 - 1] = client.method6121().method5482();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field958[--Statics.field1095];
            class167 var16 = client.method6121().method5495(var15);
            if (var16 == null) {
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = var16.method3076().method4256();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field958[--Statics.field1095];
            class167 var18 = client.method6121().method5495(var17);
            if (var18 == null) {
                field958[++Statics.field1095 - 1] = 0;
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = (var18.method3062() - var18.method3032() + 1) * 64;
                field958[++Statics.field1095 - 1] = (var18.method3035() - var18.method3034() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field958[--Statics.field1095];
            class167 var20 = client.method6121().method5495(var19);
            if (var20 == null) {
                field958[++Statics.field1095 - 1] = 0;
                field958[++Statics.field1095 - 1] = 0;
                field958[++Statics.field1095 - 1] = 0;
                field958[++Statics.field1095 - 1] = 0;
            } else {
                field958[++Statics.field1095 - 1] = var20.method3032() * 64;
                field958[++Statics.field1095 - 1] = var20.method3034() * 64;
                field958[++Statics.field1095 - 1] = var20.method3062() * 64 + 64 - 1;
                field958[++Statics.field1095 - 1] = var20.method3035() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field958[--Statics.field1095];
            class167 var22 = client.method6121().method5495(var21);
            if (var22 == null) {
                field958[++Statics.field1095 - 1] = -1;
            } else {
                field958[++Statics.field1095 - 1] = var22.method3082();
            }
            return 1;
        } else if (arg0 == 6615) {
            class244 var23 = client.method6121().method5483();
            if (var23 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = -1;
            } else {
                field958[++Statics.field1095 - 1] = var23.field2927;
                field958[++Statics.field1095 - 1] = var23.field2928;
            }
            return 1;
        } else if (arg0 == 6616) {
            field958[++Statics.field1095 - 1] = client.method6121().method5460();
            return 1;
        } else if (arg0 == 6617) {
            class244 var24 = new class244(field958[--Statics.field1095]);
            class167 var25 = client.method6121().method5461();
            if (var25 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method3023(var24.field2929, var24.field2927, var24.field2928);
            if (var26 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = -1;
            } else {
                field958[++Statics.field1095 - 1] = var26[0];
                field958[++Statics.field1095 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class244 var27 = new class244(field958[--Statics.field1095]);
            class167 var28 = client.method6121().method5461();
            if (var28 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = -1;
                return 1;
            }
            class244 var29 = var28.method3024(var27.field2927, var27.field2928);
            if (var29 == null) {
                field958[++Statics.field1095 - 1] = -1;
            } else {
                field958[++Statics.field1095 - 1] = var29.method4256();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1095 -= 2;
            int var30 = field958[Statics.field1095];
            class244 var31 = new class244(field958[Statics.field1095 + 1]);
            Statics.method334(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1095 -= 2;
            int var32 = field958[Statics.field1095];
            class244 var33 = new class244(field958[Statics.field1095 + 1]);
            Statics.method334(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1095 -= 2;
            int var34 = field958[Statics.field1095];
            class244 var35 = new class244(field958[Statics.field1095 + 1]);
            class167 var36 = client.method6121().method5495(var34);
            if (var36 == null) {
                field958[++Statics.field1095 - 1] = 0;
                return 1;
            } else {
                field958[++Statics.field1095 - 1] = var36.method3021(var35.field2929, var35.field2927, var35.field2928) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field958[++Statics.field1095 - 1] = client.method6121().method5484();
            field958[++Statics.field1095 - 1] = client.method6121().method5485();
            return 1;
        } else if (arg0 == 6623) {
            class244 var37 = new class244(field958[--Statics.field1095]);
            class167 var38 = client.method6121().method5457(var37.field2929, var37.field2927, var37.field2928);
            if (var38 == null) {
                field958[++Statics.field1095 - 1] = -1;
            } else {
                field958[++Statics.field1095 - 1] = var38.method3026();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method6121().method5452(field958[--Statics.field1095]);
            return 1;
        } else if (arg0 == 6625) {
            client.method6121().method5486();
            return 1;
        } else if (arg0 == 6626) {
            client.method6121().method5487(field958[--Statics.field1095]);
            return 1;
        } else if (arg0 == 6627) {
            client.method6121().method5488();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field958[--Statics.field1095] == 1;
            client.method6121().method5489(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field958[--Statics.field1095];
            client.method6121().method5490(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field958[--Statics.field1095];
            client.method6121().method5541(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method6121().method5631();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field958[--Statics.field1095] == 1;
            client.method6121().method5479(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1095 -= 2;
            int var43 = field958[Statics.field1095];
            boolean var44 = field958[Statics.field1095 + 1] == 1;
            client.method6121().method5494(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1095 -= 2;
            int var45 = field958[Statics.field1095];
            boolean var46 = field958[Statics.field1095 + 1] == 1;
            client.method6121().method5605(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field958[++Statics.field1095 - 1] = client.method6121().method5569() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = client.method6121().method5458(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field958[--Statics.field1095];
            field958[++Statics.field1095 - 1] = client.method6121().method5498(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1095 -= 2;
            int var49 = field958[Statics.field1095];
            class244 var50 = new class244(field958[Statics.field1095 + 1]);
            class244 var51 = client.method6121().method5501(var49, var50);
            if (var51 == null) {
                field958[++Statics.field1095 - 1] = -1;
            } else {
                field958[++Statics.field1095 - 1] = var51.method4256();
            }
            return 1;
        } else if (arg0 == 6639) {
            class185 var52 = client.method6121().method5503();
            if (var52 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = -1;
            } else {
                field958[++Statics.field1095 - 1] = var52.method2967();
                field958[++Statics.field1095 - 1] = var52.field2122.method4256();
            }
            return 1;
        } else if (arg0 == 6640) {
            class185 var53 = client.method6121().method5504();
            if (var53 == null) {
                field958[++Statics.field1095 - 1] = -1;
                field958[++Statics.field1095 - 1] = -1;
            } else {
                field958[++Statics.field1095 - 1] = var53.method2967();
                field958[++Statics.field1095 - 1] = var53.field2122.method4256();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field958[--Statics.field1095];
            class140 var55 = class140.method4496(var54);
            if (var55.field1563 == null) {
                field965[++Statics.field1452 - 1] = "";
            } else {
                field965[++Statics.field1452 - 1] = var55.field1563;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field958[--Statics.field1095];
            class140 var57 = class140.method4496(var56);
            field958[++Statics.field1095 - 1] = var57.field1565;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field958[--Statics.field1095];
            class140 var59 = class140.method4496(var58);
            if (var59 == null) {
                field958[++Statics.field1095 - 1] = -1;
            } else {
                field958[++Statics.field1095 - 1] = var59.field1580;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field958[--Statics.field1095];
            class140 var61 = class140.method4496(var60);
            if (var61 == null) {
                field958[++Statics.field1095 - 1] = -1;
            } else {
                field958[++Statics.field1095 - 1] = var61.field1559;
            }
            return 1;
        } else if (arg0 == 6697) {
            field958[++Statics.field1095 - 1] = Statics.field2387.field2152;
            return 1;
        } else if (arg0 == 6698) {
            field958[++Statics.field1095 - 1] = Statics.field2387.field2148.method4256();
            return 1;
        } else if (arg0 == 6699) {
            field958[++Statics.field1095 - 1] = Statics.field2387.field2149.method4256();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.as(ILcf;ZI)I")
    public static int method364(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6700 || arg0 == 6702 || arg0 == 6704 || arg0 == 6706 || arg0 == 6708) {
            Statics.field1095 -= 2;
            Statics.field1452--;
            return 1;
        } else if (arg0 == 6701 || arg0 == 6703 || arg0 == 6705 || arg0 == 6707 || arg0 == 6709) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 6750) {
            field965[++Statics.field1452 - 1] = "";
            return 1;
        } else if (arg0 == 6751 || arg0 == 6752 || arg0 == 6753) {
            field958[++Statics.field1095 - 1] = -1;
            return 1;
        } else if (arg0 == 6754) {
            int var3 = field958[--Statics.field1095];
            class147 var4 = class147.method4374(var3);
            field965[++Statics.field1452 - 1] = var4 == null ? "" : var4.field1642;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("o.au(ILcf;ZB)I")
    public static int method55(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6800) {
            field965[++Statics.field1452 - 1] = "";
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            field958[++Statics.field1095 - 1] = -1;
            return 1;
        } else if (arg0 == 6850) {
            field965[++Statics.field1452 - 1] = "";
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            field958[++Statics.field1095 - 1] = -1;
            return 1;
        } else if (arg0 == 6853) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dt.ay(ILcf;ZB)I")
    public static int method2251(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 6900) {
            field965[++Statics.field1452 - 1] = "";
            return 1;
        } else if (arg0 == 6950) {
            field958[++Statics.field1095 - 1] = -1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jo.am(ILcf;ZI)I")
    public static int method4440(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field1095 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field1095 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field1095 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field1095 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field1452--;
            Statics.field1095--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field1452--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field1095 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field1095--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gs.aa(ILcf;ZS)I")
    public static int method3399(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field1095++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field1452 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field1095++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field1095++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field1095++;
            return 1;
        } else if (arg0 == 7108) {
            field958[++Statics.field1095 - 1] = client.method554() ? 1 : 0;
            return 1;
        } else if (arg0 == 7110) {
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 7120) {
            Statics.field1095--;
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else if (arg0 == 7121) {
            Statics.field1095 -= 2;
            field958[++Statics.field1095 - 1] = -1;
            return 1;
        } else if (arg0 == 7122) {
            Statics.field1095 -= 2;
            field958[++Statics.field1095 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.ai(ILcf;ZI)I")
    public static int method714(int arg0, class87 arg1, boolean arg2) {
        if (arg0 >= 7200 && arg0 < 7204) {
            Statics.field1095 -= 5;
            field958[++Statics.field1095 - 1] = -1;
            return 1;
        } else if (arg0 == 7204) {
            Statics.field1095 -= 6;
            field958[++Statics.field1095 - 1] = -1;
            return 1;
        } else if (arg0 >= 7205 && arg0 < 7209) {
            field958[Statics.field1095 - 1] = -1;
            return 1;
        } else if (arg0 == 7209) {
            Statics.field1095 -= 2;
            field958[++Statics.field1095 - 1] = -1;
            return 1;
        } else if (arg0 >= 7210 && arg0 < 7214) {
            Statics.field1095--;
            return 1;
        } else if (arg0 == 7214) {
            Statics.field1095 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bu.av(II)V")
    public static void method1006(int arg0) {
        if (arg0 == -1 || !class248.method182(arg0)) {
            return;
        }
        class248[] var1 = Statics.field613[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class248 var3 = var1[var2];
            if (var3.field3049 != null) {
                class96 var4 = new class96();
                var4.field1151 = var3;
                var4.field1159 = var3.field3049;
                method2146(var4, 5000000, 0);
            }
        }
    }
}
