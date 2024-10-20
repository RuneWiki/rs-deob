package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ai")
public class class33 {

    @ObfuscatedName("ai.h")
    public static int[] field717 = new int[5];

    @ObfuscatedName("ai.p")
    public static int[][] field722 = new int[5][5000];

    @ObfuscatedName("ai.j")
    public static int[] field723 = new int[1000];

    @ObfuscatedName("ai.i")
    public static String[] field724 = new String[1000];

    @ObfuscatedName("ai.u")
    public static int field729 = 0;

    @ObfuscatedName("ai.l")
    public static class13[] field726 = new class13[50];

    @ObfuscatedName("ai.b")
    public static Calendar field727 = Calendar.getInstance();

    @ObfuscatedName("ai.w")
    public static final String[] field728 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.x(Lx;IB)V")
    public static void method2543(class1 arg0, int arg1) {
        Object[] var2 = arg0.field15;
        int var3 = (Integer) var2[0];
        class20 var4 = class20.method1888(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field525;
        int[] var9 = var4.field534;
        byte var10 = -1;
        field729 = 0;
        try {
            Statics.field719 = new int[var4.field528];
            int var11 = 0;
            Statics.field725 = new String[var4.field529];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2662;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2543;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2662;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2543;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field10;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field8;
                    }
                    Statics.field719[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field9;
                    }
                    Statics.field725[var12++] = var15;
                }
            }
            int var16 = 0;
            label2667: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var461 = var8[var7];
                if (var461 < 100) {
                    if (var461 == 0) {
                        field723[var5++] = var9[var7];
                        continue;
                    }
                    if (var461 == 1) {
                        int var17 = var9[var7];
                        field723[var5++] = class157.field2672[var17];
                        continue;
                    }
                    if (var461 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class157.field2672[var18] = field723[var5];
                        client.method151(var18);
                        continue;
                    }
                    if (var461 == 3) {
                        field724[var6++] = var4.field524[var7];
                        continue;
                    }
                    if (var461 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var461 == 7) {
                        var5 -= 2;
                        if (field723[var5 + 1] != field723[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 8) {
                        var5 -= 2;
                        if (field723[var5 + 1] == field723[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 9) {
                        var5 -= 2;
                        if (field723[var5] < field723[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 10) {
                        var5 -= 2;
                        if (field723[var5] > field723[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 21) {
                        if (field729 == 0) {
                            return;
                        }
                        class13 var19 = field726[--field729];
                        var4 = var19.field187;
                        var8 = var4.field525;
                        var9 = var4.field534;
                        var7 = var19.field179;
                        Statics.field719 = var19.field181;
                        Statics.field725 = var19.field182;
                        continue;
                    }
                    if (var461 == 25) {
                        int var20 = var9[var7];
                        field723[var5++] = class157.method2401(var20);
                        continue;
                    }
                    if (var461 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field723[var5];
                        class43 var23 = class43.method118(var21);
                        int var24 = var23.field984;
                        int var25 = var23.field986;
                        int var26 = var23.field987;
                        int var27 = class157.field2673[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class157.field2672[var24] = class157.field2672[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var461 == 31) {
                        var5 -= 2;
                        if (field723[var5] <= field723[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 32) {
                        var5 -= 2;
                        if (field723[var5] >= field723[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 33) {
                        field723[var5++] = Statics.field719[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var461 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field719[var10001] = field723[var5];
                        continue;
                    }
                    if (var461 == 35) {
                        field724[var6++] = Statics.field725[var9[var7]];
                        continue;
                    }
                    if (var461 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field725[var10001] = field724[var6];
                        continue;
                    }
                    if (var461 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String var30 = class211.method3171(field724, var6, var29);
                        field724[var6++] = var30;
                        continue;
                    }
                    if (var461 == 38) {
                        var5--;
                        continue;
                    }
                    if (var461 == 39) {
                        var6--;
                        continue;
                    }
                    if (var461 == 40) {
                        int var31 = var9[var7];
                        class20 var32 = class20.method1888(var31);
                        int[] var33 = new int[var32.field528];
                        String[] var34 = new String[var32.field529];
                        for (int var35 = 0; var35 < var32.field530; var35++) {
                            var33[var35] = field723[var5 - var32.field530 + var35];
                        }
                        for (int var36 = 0; var36 < var32.field531; var36++) {
                            var34[var36] = field724[var6 - var32.field531 + var36];
                        }
                        var5 -= var32.field530;
                        var6 -= var32.field531;
                        class13 var37 = new class13();
                        var37.field187 = var4;
                        var37.field179 = var7;
                        var37.field181 = Statics.field719;
                        var37.field182 = Statics.field725;
                        field726[++field729 - 1] = var37;
                        var4 = var32;
                        var8 = var32.field525;
                        var9 = var32.field534;
                        var7 = -1;
                        Statics.field719 = var33;
                        Statics.field725 = var34;
                        continue;
                    }
                    if (var461 == 42) {
                        field723[var5++] = client.field454[var9[var7]];
                        continue;
                    }
                    if (var461 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field454[var10001] = field723[var5];
                        continue;
                    }
                    if (var461 == 44) {
                        int var38 = var9[var7] >> 16;
                        int var39 = var9[var7] & 0xFFFF;
                        var5--;
                        int var40 = field723[var5];
                        if (var40 >= 0 && var40 <= 5000) {
                            field717[var38] = var40;
                            byte var41 = -1;
                            if (var39 == 105) {
                                var41 = 0;
                            }
                            int var42 = 0;
                            while (true) {
                                if (var42 >= var40) {
                                    continue label2667;
                                }
                                field722[var38][var42] = var41;
                                var42++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 45) {
                        int var43 = var9[var7];
                        var5--;
                        int var44 = field723[var5];
                        if (var44 >= 0 && var44 < field717[var43]) {
                            field723[var5++] = field722[var43][var44];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 46) {
                        int var45 = var9[var7];
                        var5 -= 2;
                        int var46 = field723[var5];
                        if (var46 >= 0 && var46 < field717[var45]) {
                            field722[var45][var46] = field723[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 47) {
                        String var47 = client.field480[var9[var7]];
                        if (var47 == null) {
                            var47 = "null";
                        }
                        field724[var6++] = var47;
                        continue;
                    }
                    if (var461 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field480[var10001] = field724[var6];
                        continue;
                    }
                }
                boolean var48;
                if (var9[var7] == 1) {
                    var48 = true;
                } else {
                    var48 = false;
                }
                if (var461 < 1000) {
                    if (var461 == 100) {
                        var5 -= 3;
                        int var49 = field723[var5];
                        int var50 = field723[var5 + 1];
                        int var51 = field723[var5 + 2];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class155 var52 = class155.method2386(var49);
                        if (var52.field2652 == null) {
                            var52.field2652 = new class155[var51 + 1];
                        }
                        if (var52.field2652.length <= var51) {
                            class155[] var53 = new class155[var51 + 1];
                            for (int var54 = 0; var54 < var52.field2652.length; var54++) {
                                var53[var54] = var52.field2652[var54];
                            }
                            var52.field2652 = var53;
                        }
                        if (var51 > 0 && var52.field2652[var51 - 1] == null) {
                            throw new RuntimeException("" + (var51 - 1));
                        }
                        class155 var55 = new class155();
                        var55.field2559 = var50;
                        var55.field2531 = var55.field2662 = var52.field2662;
                        var55.field2543 = var51;
                        var55.field2541 = true;
                        var52.field2652[var51] = var55;
                        if (var48) {
                            Statics.field700 = var55;
                        } else {
                            Statics.field639 = var55;
                        }
                        client.method2391(var52);
                        continue;
                    }
                    if (var461 == 101) {
                        class155 var56 = var48 ? Statics.field700 : Statics.field639;
                        class155 var57 = class155.method2386(var56.field2662);
                        var57.field2652[var56.field2543] = null;
                        client.method2391(var57);
                        continue;
                    }
                    if (var461 == 102) {
                        var5--;
                        class155 var58 = class155.method2386(field723[var5]);
                        var58.field2652 = null;
                        client.method2391(var58);
                        continue;
                    }
                    if (var461 == 200) {
                        var5 -= 2;
                        int var59 = field723[var5];
                        int var60 = field723[var5 + 1];
                        class155 var61 = class155.method599(var59, var60);
                        if (var61 != null && var60 != -1) {
                            field723[var5++] = 1;
                            if (var48) {
                                Statics.field700 = var61;
                            } else {
                                Statics.field639 = var61;
                            }
                            continue;
                        }
                        field723[var5++] = 0;
                        continue;
                    }
                } else if (!(var461 < 1000 || var461 >= 1100) || !(var461 < 2000 || var461 >= 2100)) {
                    class155 var62;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var5--;
                        var62 = class155.method2386(field723[var5]);
                    } else {
                        var62 = var48 ? Statics.field700 : Statics.field639;
                    }
                    if (var461 == 1000) {
                        var5 -= 2;
                        var62.field2638 = field723[var5];
                        var62.field2547 = field723[var5 + 1];
                        client.method2391(var62);
                        continue;
                    }
                    if (var461 == 1001) {
                        var5 -= 2;
                        var62.field2550 = field723[var5];
                        var62.field2551 = field723[var5 + 1];
                        client.method2391(var62);
                        continue;
                    }
                    if (var461 == 1003) {
                        var5--;
                        boolean var63 = field723[var5] == 1;
                        if (var62.field2553 != var63) {
                            var62.field2553 = var63;
                            client.method2391(var62);
                        }
                        continue;
                    }
                } else if (var461 >= 1100 && var461 < 1200 || var461 >= 2100 && var461 < 2200) {
                    class155 var64;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var5--;
                        var64 = class155.method2386(field723[var5]);
                    } else {
                        var64 = var48 ? Statics.field700 : Statics.field639;
                    }
                    if (var461 == 1100) {
                        var5 -= 2;
                        var64.field2554 = field723[var5];
                        if (var64.field2554 > var64.field2556 - var64.field2550) {
                            var64.field2554 = var64.field2556 - var64.field2550;
                        }
                        if (var64.field2554 < 0) {
                            var64.field2554 = 0;
                        }
                        var64.field2555 = field723[var5 + 1];
                        if (var64.field2555 > var64.field2557 - var64.field2551) {
                            var64.field2555 = var64.field2557 - var64.field2551;
                        }
                        if (var64.field2555 < 0) {
                            var64.field2555 = 0;
                        }
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1101) {
                        var5--;
                        var64.field2558 = field723[var5];
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1102) {
                        var5--;
                        var64.field2562 = field723[var5] == 1;
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1103) {
                        var5--;
                        var64.field2563 = field723[var5];
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1104) {
                        var5--;
                        var64.field2564 = field723[var5];
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1105) {
                        var5--;
                        var64.field2600 = field723[var5];
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1106) {
                        var5--;
                        var64.field2567 = field723[var5];
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1107) {
                        var5--;
                        var64.field2574 = field723[var5] == 1;
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1108) {
                        var64.field2573 = 1;
                        var5--;
                        var64.field2597 = field723[var5];
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1109) {
                        var5 -= 6;
                        var64.field2579 = field723[var5];
                        var64.field2580 = field723[var5 + 1];
                        var64.field2612 = field723[var5 + 2];
                        var64.field2582 = field723[var5 + 3];
                        var64.field2583 = field723[var5 + 4];
                        var64.field2594 = field723[var5 + 5];
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1110) {
                        var5--;
                        int var65 = field723[var5];
                        if (var64.field2577 != var65) {
                            var64.field2577 = var65;
                            var64.field2650 = 0;
                            var64.field2651 = 0;
                            client.method2391(var64);
                        }
                        continue;
                    }
                    if (var461 == 1111) {
                        var5--;
                        var64.field2586 = field723[var5] == 1;
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1112) {
                        var6--;
                        String var66 = field724[var6];
                        if (!var66.equals(var64.field2589)) {
                            var64.field2589 = var66;
                            client.method2391(var64);
                        }
                        continue;
                    }
                    if (var461 == 1113) {
                        var5--;
                        var64.field2588 = field723[var5];
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1114) {
                        var5 -= 3;
                        var64.field2592 = field723[var5];
                        var64.field2552 = field723[var5 + 1];
                        var64.field2611 = field723[var5 + 2];
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1115) {
                        var5--;
                        var64.field2635 = field723[var5] == 1;
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1116) {
                        var5--;
                        var64.field2569 = field723[var5];
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1117) {
                        var5--;
                        var64.field2570 = field723[var5];
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1118) {
                        var5--;
                        var64.field2571 = field723[var5] == 1;
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1119) {
                        var5--;
                        var64.field2572 = field723[var5] == 1;
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1120) {
                        var5 -= 2;
                        var64.field2556 = field723[var5];
                        var64.field2557 = field723[var5 + 1];
                        client.method2391(var64);
                        continue;
                    }
                    if (var461 == 1121) {
                        int var67 = var64.field2662;
                        int var68 = var64.field2543;
                        client.field279.method2364(228);
                        client.field279.method2157(var68);
                        client.field279.method2168(var67);
                        client.field424 = var64;
                        client.method2391(var64);
                        continue;
                    }
                } else if (!(var461 < 1200 || var461 >= 1300) || !(var461 < 2200 || var461 >= 2300)) {
                    class155 var69;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var5--;
                        var69 = class155.method2386(field723[var5]);
                    } else {
                        var69 = var48 ? Statics.field700 : Statics.field639;
                    }
                    client.method2391(var69);
                    if (var461 == 1200 || var461 == 1205 || var461 == 1212) {
                        var5 -= 2;
                        int var70 = field723[var5];
                        int var71 = field723[var5 + 1];
                        var69.field2648 = var70;
                        var69.field2649 = var71;
                        class46 var72 = class46.method1975(var70);
                        var69.field2612 = var72.field1037;
                        var69.field2582 = var72.field1048;
                        var69.field2583 = var72.field1028;
                        var69.field2579 = var72.field1040;
                        var69.field2580 = var72.field1052;
                        var69.field2594 = var72.field1021;
                        if (var461 == 1205) {
                            var69.field2532 = 0;
                        } else if (var461 == 1212 | var72.field1042 == 1) {
                            var69.field2532 = 1;
                        } else {
                            var69.field2532 = 2;
                        }
                        if (var69.field2550 > 0) {
                            var69.field2594 = var69.field2594 * 32 / var69.field2550;
                        }
                        continue;
                    }
                    if (var461 == 1201) {
                        var69.field2573 = 2;
                        var5--;
                        var69.field2597 = field723[var5];
                        continue;
                    }
                    if (var461 == 1202) {
                        var69.field2573 = 3;
                        var69.field2597 = Statics.field163.field29.method2937();
                        continue;
                    }
                } else if ((var461 < 1300 || var461 >= 1400) && (var461 < 2300 || var461 >= 2400)) {
                    if (var461 >= 1400 && var461 < 1500 || var461 >= 2400 && var461 < 2500) {
                        class155 var77;
                        if (var461 >= 2000) {
                            var461 -= 1000;
                            var5--;
                            var77 = class155.method2386(field723[var5]);
                        } else {
                            var77 = var48 ? Statics.field700 : Statics.field639;
                        }
                        var6--;
                        String var78 = field724[var6];
                        int[] var79 = null;
                        if (var78.length() > 0 && var78.charAt(var78.length() - 1) == 'Y') {
                            var5--;
                            int var80 = field723[var5];
                            if (var80 > 0) {
                                var79 = new int[var80];
                                while (var80-- > 0) {
                                    var5--;
                                    var79[var80] = field723[var5];
                                }
                            }
                            var78 = var78.substring(0, var78.length() - 1);
                        }
                        Object[] var81 = new Object[var78.length() + 1];
                        for (int var82 = var81.length - 1; var82 >= 1; var82--) {
                            if (var78.charAt(var82 - 1) == 's') {
                                var6--;
                                var81[var82] = field724[var6];
                            } else {
                                var5--;
                                var81[var82] = Integer.valueOf(field723[var5]);
                            }
                        }
                        var5--;
                        int var83 = field723[var5];
                        if (var83 == -1) {
                            var81 = null;
                        } else {
                            var81[0] = Integer.valueOf(var83);
                        }
                        if (var461 == 1400) {
                            var77.field2646 = var81;
                        }
                        if (var461 == 1401) {
                            var77.field2614 = var81;
                        }
                        if (var461 == 1402) {
                            var77.field2613 = var81;
                        }
                        if (var461 == 1403) {
                            var77.field2605 = var81;
                        }
                        if (var461 == 1404) {
                            var77.field2617 = var81;
                        }
                        if (var461 == 1405) {
                            var77.field2618 = var81;
                        }
                        if (var461 == 1406) {
                            var77.field2658 = var81;
                        }
                        if (var461 == 1407) {
                            var77.field2622 = var81;
                            var77.field2623 = var79;
                        }
                        if (var461 == 1408) {
                            var77.field2628 = var81;
                        }
                        if (var461 == 1409) {
                            var77.field2629 = var81;
                        }
                        if (var461 == 1410) {
                            var77.field2536 = var81;
                        }
                        if (var461 == 1411) {
                            var77.field2655 = var81;
                        }
                        if (var461 == 1412) {
                            var77.field2616 = var81;
                        }
                        if (var461 == 1414) {
                            var77.field2624 = var81;
                            var77.field2625 = var79;
                        }
                        if (var461 == 1415) {
                            var77.field2540 = var81;
                            var77.field2627 = var79;
                        }
                        if (var461 == 1416) {
                            var77.field2620 = var81;
                        }
                        if (var461 == 1417) {
                            var77.field2595 = var81;
                        }
                        if (var461 == 1418) {
                            var77.field2631 = var81;
                        }
                        if (var461 == 1419) {
                            var77.field2591 = var81;
                        }
                        if (var461 == 1420) {
                            var77.field2633 = var81;
                        }
                        if (var461 == 1421) {
                            var77.field2634 = var81;
                        }
                        if (var461 == 1422) {
                            var77.field2593 = var81;
                        }
                        if (var461 == 1423) {
                            var77.field2653 = var81;
                        }
                        if (var461 == 1424) {
                            var77.field2637 = var81;
                        }
                        if (var461 == 1425) {
                            var77.field2575 = var81;
                        }
                        if (var461 == 1426) {
                            var77.field2643 = var81;
                        }
                        var77.field2609 = true;
                        continue;
                    }
                    if (var461 < 1600) {
                        class155 var84 = var48 ? Statics.field700 : Statics.field639;
                        if (var461 == 1500) {
                            field723[var5++] = var84.field2638;
                            continue;
                        }
                        if (var461 == 1501) {
                            field723[var5++] = var84.field2547;
                            continue;
                        }
                        if (var461 == 1502) {
                            field723[var5++] = var84.field2550;
                            continue;
                        }
                        if (var461 == 1503) {
                            field723[var5++] = var84.field2551;
                            continue;
                        }
                        if (var461 == 1504) {
                            field723[var5++] = var84.field2553 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 1505) {
                            field723[var5++] = var84.field2531;
                            continue;
                        }
                    } else if (var461 < 1700) {
                        class155 var85 = var48 ? Statics.field700 : Statics.field639;
                        if (var461 == 1600) {
                            field723[var5++] = var85.field2554;
                            continue;
                        }
                        if (var461 == 1601) {
                            field723[var5++] = var85.field2555;
                            continue;
                        }
                        if (var461 == 1602) {
                            field724[var6++] = var85.field2589;
                            continue;
                        }
                        if (var461 == 1603) {
                            field723[var5++] = var85.field2556;
                            continue;
                        }
                        if (var461 == 1604) {
                            field723[var5++] = var85.field2557;
                            continue;
                        }
                        if (var461 == 1605) {
                            field723[var5++] = var85.field2594;
                            continue;
                        }
                        if (var461 == 1606) {
                            field723[var5++] = var85.field2612;
                            continue;
                        }
                        if (var461 == 1607) {
                            field723[var5++] = var85.field2583;
                            continue;
                        }
                        if (var461 == 1608) {
                            field723[var5++] = var85.field2582;
                            continue;
                        }
                    } else if (var461 < 1800) {
                        class155 var86 = var48 ? Statics.field700 : Statics.field639;
                        if (var461 == 1700) {
                            field723[var5++] = var86.field2648;
                            continue;
                        }
                        if (var461 == 1701) {
                            if (var86.field2648 == -1) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = var86.field2649;
                            }
                            continue;
                        }
                        if (var461 == 1702) {
                            field723[var5++] = var86.field2543;
                            continue;
                        }
                    } else if (var461 < 1900) {
                        class155 var87 = var48 ? Statics.field700 : Statics.field639;
                        if (var461 == 1800) {
                            int[] var88 = field723;
                            int var89 = var5++;
                            int var90 = client.method25(var87);
                            int var91 = var90 >> 11 & 0x3F;
                            var88[var89] = var91;
                            continue;
                        }
                        if (var461 == 1801) {
                            var5--;
                            int var92 = field723[var5];
                            int var462 = var92 - 1;
                            if (var87.field2603 != null && var462 < var87.field2603.length && var87.field2603[var462] != null) {
                                field724[var6++] = var87.field2603[var462];
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var461 == 1802) {
                            if (var87.field2602 == null) {
                                field724[var6++] = "";
                            } else {
                                field724[var6++] = var87.field2602;
                            }
                            continue;
                        }
                    } else if (var461 < 2600) {
                        var5--;
                        class155 var93 = class155.method2386(field723[var5]);
                        if (var461 == 2500) {
                            field723[var5++] = var93.field2638;
                            continue;
                        }
                        if (var461 == 2501) {
                            field723[var5++] = var93.field2547;
                            continue;
                        }
                        if (var461 == 2502) {
                            field723[var5++] = var93.field2550;
                            continue;
                        }
                        if (var461 == 2503) {
                            field723[var5++] = var93.field2551;
                            continue;
                        }
                        if (var461 == 2504) {
                            field723[var5++] = var93.field2553 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 2505) {
                            field723[var5++] = var93.field2531;
                            continue;
                        }
                    } else if (var461 < 2700) {
                        var5--;
                        class155 var94 = class155.method2386(field723[var5]);
                        if (var461 == 2600) {
                            field723[var5++] = var94.field2554;
                            continue;
                        }
                        if (var461 == 2601) {
                            field723[var5++] = var94.field2555;
                            continue;
                        }
                        if (var461 == 2602) {
                            field724[var6++] = var94.field2589;
                            continue;
                        }
                        if (var461 == 2603) {
                            field723[var5++] = var94.field2556;
                            continue;
                        }
                        if (var461 == 2604) {
                            field723[var5++] = var94.field2557;
                            continue;
                        }
                        if (var461 == 2605) {
                            field723[var5++] = var94.field2594;
                            continue;
                        }
                        if (var461 == 2606) {
                            field723[var5++] = var94.field2612;
                            continue;
                        }
                        if (var461 == 2607) {
                            field723[var5++] = var94.field2583;
                            continue;
                        }
                        if (var461 == 2608) {
                            field723[var5++] = var94.field2582;
                            continue;
                        }
                    } else if (var461 < 2800) {
                        if (var461 == 2700) {
                            var5--;
                            class155 var95 = class155.method2386(field723[var5]);
                            field723[var5++] = var95.field2648;
                            continue;
                        }
                        if (var461 == 2701) {
                            var5--;
                            class155 var96 = class155.method2386(field723[var5]);
                            if (var96.field2648 == -1) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = var96.field2649;
                            }
                            continue;
                        }
                        if (var461 == 2702) {
                            var5--;
                            int var97 = field723[var5];
                            class4 var98 = (class4) client.field396.method3214((long) var97);
                            if (var98 == null) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var461 < 2900) {
                        var5--;
                        class155 var99 = class155.method2386(field723[var5]);
                        if (var461 == 2800) {
                            int[] var100 = field723;
                            int var101 = var5++;
                            int var102 = client.method25(var99);
                            int var103 = var102 >> 11 & 0x3F;
                            var100[var101] = var103;
                            continue;
                        }
                        if (var461 == 2801) {
                            var5--;
                            int var104 = field723[var5];
                            int var463 = var104 - 1;
                            if (var99.field2603 != null && var463 < var99.field2603.length && var99.field2603[var463] != null) {
                                field724[var6++] = var99.field2603[var463];
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var461 == 2802) {
                            if (var99.field2602 == null) {
                                field724[var6++] = "";
                            } else {
                                field724[var6++] = var99.field2602;
                            }
                            continue;
                        }
                    } else if (var461 < 3200) {
                        if (var461 == 3100) {
                            var6--;
                            String var105 = field724[var6];
                            class10.method2806(0, "", var105);
                            continue;
                        }
                        if (var461 == 3101) {
                            var5 -= 2;
                            client.method1099(Statics.field163, field723[var5], field723[var5 + 1]);
                            continue;
                        }
                        if (var461 == 3103) {
                            client.method923();
                            continue;
                        }
                        if (var461 == 3104) {
                            var6--;
                            String var106 = field724[var6];
                            int var107 = 0;
                            boolean var108 = class211.method1794(var106, 10, true);
                            if (var108) {
                                int var109 = class211.method88(var106, 10, true);
                                var107 = var109;
                            }
                            client.field279.method2364(31);
                            client.field279.method2233(var107);
                            continue;
                        }
                        if (var461 == 3105) {
                            var6--;
                            String var110 = field724[var6];
                            client.field279.method2364(223);
                            client.field279.method2113(var110.length() + 1);
                            client.field279.method2212(var110);
                            continue;
                        }
                        if (var461 == 3106) {
                            var6--;
                            String var111 = field724[var6];
                            client.field279.method2364(182);
                            client.field279.method2113(var111.length() + 1);
                            client.field279.method2212(var111);
                            continue;
                        }
                        if (var461 == 3107) {
                            var5--;
                            int var112 = field723[var5];
                            var6--;
                            String var113 = field724[var6];
                            boolean var114 = false;
                            for (int var115 = 0; var115 < client.field359; var115++) {
                                class3 var116 = client.field358[client.field360[var115]];
                                if (var116 != null && var116.field39 != null && var116.field39.equalsIgnoreCase(var113)) {
                                    if (var112 == 1) {
                                        client.field279.method2364(44);
                                        client.field279.method2158(client.field360[var115]);
                                        client.field279.method2149(0);
                                    } else if (var112 == 4) {
                                        client.field279.method2364(181);
                                        client.field279.method2150(0);
                                        client.field279.method2157(client.field360[var115]);
                                    } else if (var112 == 6) {
                                        client.field279.method2364(65);
                                        client.field279.method2149(0);
                                        client.field279.method2158(client.field360[var115]);
                                    } else if (var112 == 7) {
                                        client.field279.method2364(220);
                                        client.field279.method2149(0);
                                        client.field279.method2157(client.field360[var115]);
                                    }
                                    var114 = true;
                                    break;
                                }
                            }
                            if (!var114) {
                                class10.method2806(4, "", class145.field2238 + var113);
                            }
                            continue;
                        }
                        if (var461 == 3108) {
                            var5 -= 3;
                            int var117 = field723[var5];
                            int var118 = field723[var5 + 1];
                            int var119 = field723[var5 + 2];
                            class155 var120 = class155.method2386(var119);
                            client.method120(var120, var117, var118);
                            continue;
                        }
                        if (var461 == 3109) {
                            var5 -= 2;
                            int var121 = field723[var5];
                            int var122 = field723[var5 + 1];
                            class155 var123 = var48 ? Statics.field700 : Statics.field639;
                            client.method120(var123, var121, var122);
                            continue;
                        }
                        if (var461 == 3110) {
                            var5--;
                            Statics.field1896 = field723[var5] == 1;
                            continue;
                        }
                        if (var461 == 3111) {
                            field723[var5++] = Statics.field140.field128 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3112) {
                            var5--;
                            Statics.field140.field128 = field723[var5] == 1;
                            class9.method62();
                            continue;
                        }
                        if (var461 == 3113) {
                            var6--;
                            String var124 = field724[var6];
                            var5--;
                            boolean var125 = field723[var5] == 1;
                            class127.method2494(var124, var125, "openjs", false);
                            continue;
                        }
                        if (var461 == 3115) {
                            var5--;
                            int var126 = field723[var5];
                            client.field279.method2364(77);
                            client.field279.method2114(var126);
                            continue;
                        }
                    } else if (var461 < 3300) {
                        if (var461 == 3200) {
                            var5 -= 3;
                            int var127 = field723[var5];
                            int var128 = field723[var5 + 1];
                            int var129 = field723[var5 + 2];
                            if (client.field475 != 0 && var128 != 0 && client.field320 < 50) {
                                client.field481[client.field320] = var127;
                                client.field295[client.field320] = var128;
                                client.field483[client.field320] = var129;
                                client.field485[client.field320] = null;
                                client.field484[client.field320] = 0;
                                client.field320++;
                            }
                            continue;
                        }
                        if (var461 == 3201) {
                            var5--;
                            int var130 = field723[var5];
                            if (var130 == -1 && !client.field477) {
                                class164.method2904();
                            } else if (var130 != -1 && client.field476 != var130 && client.field294 != 0 && !client.field477) {
                                class164.method141(2, Statics.field2800, var130, 0, client.field294, false);
                            }
                            client.field476 = var130;
                            continue;
                        }
                        if (var461 == 3202) {
                            var5 -= 2;
                            int var131 = field723[var5];
                            int var10000 = field723[var5 + 1];
                            if (client.field294 != 0 && var131 != -1) {
                                class164.method2618(Statics.field1988, var131, 0, client.field294, false);
                                client.field477 = true;
                            }
                            continue;
                        }
                    } else if (var461 < 3400) {
                        if (var461 == 3300) {
                            field723[var5++] = client.field348;
                            continue;
                        }
                        if (var461 == 3301) {
                            var5 -= 2;
                            int var133 = field723[var5];
                            int var134 = field723[var5 + 1];
                            int[] var135 = field723;
                            int var136 = var5++;
                            class14 var137 = (class14) class14.field190.method3214((long) var133);
                            int var138;
                            if (var137 == null) {
                                var138 = -1;
                            } else if (var134 >= 0 && var134 < var137.field195.length) {
                                var138 = var137.field195[var134];
                            } else {
                                var138 = -1;
                            }
                            var135[var136] = var138;
                            continue;
                        }
                        if (var461 == 3302) {
                            var5 -= 2;
                            int var139 = field723[var5];
                            int var140 = field723[var5 + 1];
                            int[] var141 = field723;
                            int var142 = var5++;
                            class14 var143 = (class14) class14.field190.method3214((long) var139);
                            int var144;
                            if (var143 == null) {
                                var144 = 0;
                            } else if (var140 >= 0 && var140 < var143.field189.length) {
                                var144 = var143.field189[var140];
                            } else {
                                var144 = 0;
                            }
                            var141[var142] = var144;
                            continue;
                        }
                        if (var461 == 3303) {
                            var5 -= 2;
                            int var145 = field723[var5];
                            int var146 = field723[var5 + 1];
                            int[] var147 = field723;
                            int var148 = var5++;
                            class14 var149 = (class14) class14.field190.method3214((long) var145);
                            int var150;
                            if (var149 == null) {
                                var150 = 0;
                            } else if (var146 == -1) {
                                var150 = 0;
                            } else {
                                int var151 = 0;
                                for (int var152 = 0; var152 < var149.field189.length; var152++) {
                                    if (var149.field195[var152] == var146) {
                                        var151 += var149.field189[var152];
                                    }
                                }
                                var150 = var151;
                            }
                            var147[var148] = var150;
                            continue;
                        }
                        if (var461 == 3304) {
                            var5--;
                            int var153 = field723[var5];
                            field723[var5++] = class45.method79(var153).field1012;
                            continue;
                        }
                        if (var461 == 3305) {
                            var5--;
                            int var154 = field723[var5];
                            field723[var5++] = client.field377[var154];
                            continue;
                        }
                        if (var461 == 3306) {
                            var5--;
                            int var155 = field723[var5];
                            field723[var5++] = client.field378[var155];
                            continue;
                        }
                        if (var461 == 3307) {
                            var5--;
                            int var156 = field723[var5];
                            field723[var5++] = client.field379[var156];
                            continue;
                        }
                        if (var461 == 3308) {
                            int var157 = Statics.field1880;
                            int var158 = (Statics.field163.field747 >> 7) + Statics.field521;
                            int var159 = (Statics.field163.field749 >> 7) + Statics.field1071;
                            field723[var5++] = (var157 << 28) + (var158 << 14) + var159;
                            continue;
                        }
                        if (var461 == 3309) {
                            var5--;
                            int var160 = field723[var5];
                            field723[var5++] = var160 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var461 == 3310) {
                            var5--;
                            int var161 = field723[var5];
                            field723[var5++] = var161 >> 28;
                            continue;
                        }
                        if (var461 == 3311) {
                            var5--;
                            int var162 = field723[var5];
                            field723[var5++] = var162 & 0x3FFF;
                            continue;
                        }
                        if (var461 == 3312) {
                            field723[var5++] = client.field243 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3313) {
                            var5 -= 2;
                            int var163 = field723[var5] + 32768;
                            int var164 = field723[var5 + 1];
                            int[] var165 = field723;
                            int var166 = var5++;
                            class14 var167 = (class14) class14.field190.method3214((long) var163);
                            int var168;
                            if (var167 == null) {
                                var168 = -1;
                            } else if (var164 >= 0 && var164 < var167.field195.length) {
                                var168 = var167.field195[var164];
                            } else {
                                var168 = -1;
                            }
                            var165[var166] = var168;
                            continue;
                        }
                        if (var461 == 3314) {
                            var5 -= 2;
                            int var169 = field723[var5] + 32768;
                            int var170 = field723[var5 + 1];
                            int[] var171 = field723;
                            int var172 = var5++;
                            class14 var173 = (class14) class14.field190.method3214((long) var169);
                            int var174;
                            if (var173 == null) {
                                var174 = 0;
                            } else if (var170 >= 0 && var170 < var173.field189.length) {
                                var174 = var173.field189[var170];
                            } else {
                                var174 = 0;
                            }
                            var171[var172] = var174;
                            continue;
                        }
                        if (var461 == 3315) {
                            var5 -= 2;
                            int var175 = field723[var5] + 32768;
                            int var176 = field723[var5 + 1];
                            int[] var177 = field723;
                            int var178 = var5++;
                            class14 var179 = (class14) class14.field190.method3214((long) var175);
                            int var180;
                            if (var179 == null) {
                                var180 = 0;
                            } else if (var176 == -1) {
                                var180 = 0;
                            } else {
                                int var181 = 0;
                                for (int var182 = 0; var182 < var179.field189.length; var182++) {
                                    if (var179.field195[var182] == var176) {
                                        var181 += var179.field189[var182];
                                    }
                                }
                                var180 = var181;
                            }
                            var177[var178] = var180;
                            continue;
                        }
                        if (var461 == 3316) {
                            if (client.field407 >= 2) {
                                field723[var5++] = client.field407;
                            } else {
                                field723[var5++] = 0;
                            }
                            continue;
                        }
                        if (var461 == 3317) {
                            field723[var5++] = client.field255;
                            continue;
                        }
                        if (var461 == 3318) {
                            field723[var5++] = client.field238;
                            continue;
                        }
                        if (var461 == 3321) {
                            field723[var5++] = client.field425;
                            continue;
                        }
                        if (var461 == 3322) {
                            field723[var5++] = client.field406;
                            continue;
                        }
                        if (var461 == 3323) {
                            if (client.field409) {
                                field723[var5++] = 1;
                            } else {
                                field723[var5++] = 0;
                            }
                            continue;
                        }
                        if (var461 == 3324) {
                            field723[var5++] = client.field239;
                            continue;
                        }
                    } else if (var461 < 3500) {
                        if (var461 == 3400) {
                            var5 -= 2;
                            int var183 = field723[var5];
                            int var184 = field723[var5 + 1];
                            class44 var185 = class44.method529(var183);
                            if (var185.field997 != 's') {
                            }
                            for (int var186 = 0; var186 < var185.field1002; var186++) {
                                if (var185.field1003[var186] == var184) {
                                    field724[var6++] = var185.field1005[var186];
                                    var185 = null;
                                    break;
                                }
                            }
                            if (var185 != null) {
                                field724[var6++] = var185.field1000;
                            }
                            continue;
                        }
                        if (var461 == 3408) {
                            var5 -= 4;
                            int var187 = field723[var5];
                            int var188 = field723[var5 + 1];
                            int var189 = field723[var5 + 2];
                            int var190 = field723[var5 + 3];
                            class44 var191 = class44.method529(var189);
                            if (var191.field999 == var187 && var191.field997 == var188) {
                                for (int var192 = 0; var192 < var191.field1002; var192++) {
                                    if (var191.field1003[var192] == var190) {
                                        if (var188 == 115) {
                                            field724[var6++] = var191.field1005[var192];
                                        } else {
                                            field723[var5++] = var191.field1010[var192];
                                        }
                                        var191 = null;
                                        break;
                                    }
                                }
                                if (var191 != null) {
                                    if (var188 == 115) {
                                        field724[var6++] = var191.field1000;
                                    } else {
                                        field723[var5++] = var191.field998;
                                    }
                                }
                                continue;
                            }
                            if (var188 == 115) {
                                field724[var6++] = "null";
                            } else {
                                field723[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var461 < 3700) {
                        if (var461 == 3600) {
                            if (client.field474 == 0) {
                                field723[var5++] = -2;
                            } else if (client.field474 == 1) {
                                field723[var5++] = -1;
                            } else {
                                field723[var5++] = client.field492;
                            }
                            continue;
                        }
                        if (var461 == 3601) {
                            var5--;
                            int var193 = field723[var5];
                            if (client.field474 == 2 && var193 < client.field492) {
                                field724[var6++] = client.field494[var193].field220;
                                field724[var6++] = client.field494[var193].field217;
                                continue;
                            }
                            field724[var6++] = "";
                            field724[var6++] = "";
                            continue;
                        }
                        if (var461 == 3602) {
                            var5--;
                            int var194 = field723[var5];
                            if (client.field474 == 2 && var194 < client.field492) {
                                field723[var5++] = client.field494[var194].field216;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3603) {
                            var5--;
                            int var195 = field723[var5];
                            if (client.field474 == 2 && var195 < client.field492) {
                                field723[var5++] = client.field494[var195].field214;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3604) {
                            var6--;
                            String var196 = field724[var6];
                            var5--;
                            int var197 = field723[var5];
                            client.method1444(var196, var197);
                            continue;
                        }
                        if (var461 == 3605) {
                            var6--;
                            String var198 = field724[var6];
                            if (var198 == null) {
                                continue;
                            }
                            if ((client.field492 < 200 || client.field365 == 1) && client.field492 < 400) {
                                String var199 = class212.method546(var198, Statics.field1901);
                                if (var199 == null) {
                                    continue;
                                }
                                for (int var200 = 0; var200 < client.field492; var200++) {
                                    class16 var201 = client.field494[var200];
                                    String var202 = class212.method546(var201.field220, Statics.field1901);
                                    if (var202 != null && var202.equals(var199)) {
                                        class10.method2806(30, "", var198 + class145.field2327);
                                        continue label2667;
                                    }
                                    if (var201.field217 != null) {
                                        String var203 = class212.method546(var201.field217, Statics.field1901);
                                        if (var203 != null && var203.equals(var199)) {
                                            class10.method2806(30, "", var198 + class145.field2327);
                                            continue label2667;
                                        }
                                    }
                                }
                                for (int var204 = 0; var204 < client.field496; var204++) {
                                    class8 var205 = client.field463[var204];
                                    String var206 = class212.method546(var205.field120, Statics.field1901);
                                    if (var206 != null && var206.equals(var199)) {
                                        class10.method2806(30, "", class145.field2379 + var198 + class145.field2279);
                                        continue label2667;
                                    }
                                    if (var205.field121 != null) {
                                        String var207 = class212.method546(var205.field121, Statics.field1901);
                                        if (var207 != null && var207.equals(var199)) {
                                            class10.method2806(30, "", class145.field2379 + var198 + class145.field2279);
                                            continue label2667;
                                        }
                                    }
                                }
                                if (class212.method546(Statics.field163.field39, Statics.field1901).equals(var199)) {
                                    class10.method2806(30, "", class145.field2330);
                                } else {
                                    client.field279.method2364(168);
                                    class111 var208 = client.field279;
                                    int var209 = var198.length() + 1;
                                    var208.method2113(var209);
                                    client.field279.method2212(var198);
                                }
                                continue;
                            }
                            class10.method2806(30, "", class145.field2326);
                            continue;
                        }
                        if (var461 == 3606) {
                            var6--;
                            String var210 = field724[var6];
                            client.method2328(var210);
                            continue;
                        }
                        if (var461 == 3607) {
                            var6--;
                            String var211 = field724[var6];
                            if (var211 == null) {
                                continue;
                            }
                            if ((client.field496 < 100 || client.field365 == 1) && client.field496 < 400) {
                                String var212 = class212.method546(var211, Statics.field1901);
                                if (var212 == null) {
                                    continue;
                                }
                                for (int var213 = 0; var213 < client.field496; var213++) {
                                    class8 var214 = client.field463[var213];
                                    String var215 = class212.method546(var214.field120, Statics.field1901);
                                    if (var215 != null && var215.equals(var212)) {
                                        class10.method2806(31, "", var211 + class145.field2329);
                                        continue label2667;
                                    }
                                    if (var214.field121 != null) {
                                        String var216 = class212.method546(var214.field121, Statics.field1901);
                                        if (var216 != null && var216.equals(var212)) {
                                            class10.method2806(31, "", var211 + class145.field2329);
                                            continue label2667;
                                        }
                                    }
                                }
                                for (int var217 = 0; var217 < client.field492; var217++) {
                                    class16 var218 = client.field494[var217];
                                    String var219 = class212.method546(var218.field220, Statics.field1901);
                                    if (var219 != null && var219.equals(var212)) {
                                        class10.method2806(31, "", class145.field2334 + var211 + class145.field2373);
                                        continue label2667;
                                    }
                                    if (var218.field217 != null) {
                                        String var220 = class212.method546(var218.field217, Statics.field1901);
                                        if (var220 != null && var220.equals(var212)) {
                                            class10.method2806(31, "", class145.field2334 + var211 + class145.field2373);
                                            continue label2667;
                                        }
                                    }
                                }
                                if (class212.method546(Statics.field163.field39, Statics.field1901).equals(var212)) {
                                    class10.method2806(31, "", class145.field2331);
                                } else {
                                    client.field279.method2364(125);
                                    class111 var221 = client.field279;
                                    int var222 = var211.length() + 1;
                                    var221.method2113(var222);
                                    client.field279.method2212(var211);
                                }
                                continue;
                            }
                            class10.method2806(31, "", class145.field2328);
                            continue;
                        }
                        if (var461 == 3608) {
                            var6--;
                            String var223 = field724[var6];
                            client.method714(var223);
                            continue;
                        }
                        if (var461 == 3609) {
                            var6--;
                            String var224 = field724[var6];
                            class140[] var225 = new class140[] { class140.field2113, class140.field2116, class140.field2109, class140.field2111, class140.field2117 };
                            class140[] var226 = var225;
                            for (int var227 = 0; var227 < var226.length; var227++) {
                                class140 var228 = var226[var227];
                                if (var228.field2115 != -1) {
                                    int var230 = var228.field2115;
                                    String var231 = "<img=" + var230 + ">";
                                    if (var224.startsWith(var231)) {
                                        var224 = var224.substring(6 + Integer.toString(var228.field2115).length());
                                        break;
                                    }
                                }
                            }
                            field723[var5++] = client.method26(var224, false) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3611) {
                            if (client.field464 == null) {
                                field724[var6++] = "";
                            } else {
                                field724[var6++] = class210.method768(client.field464);
                            }
                            continue;
                        }
                        if (var461 == 3612) {
                            if (client.field464 == null) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = Statics.field1076;
                            }
                            continue;
                        }
                        if (var461 == 3613) {
                            var5--;
                            int var232 = field723[var5];
                            if (client.field464 != null && var232 < Statics.field1076) {
                                field724[var6++] = Statics.field57[var232].field565;
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var461 == 3614) {
                            var5--;
                            int var233 = field723[var5];
                            if (client.field464 != null && var233 < Statics.field1076) {
                                field723[var5++] = Statics.field57[var233].field562;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3615) {
                            var5--;
                            int var234 = field723[var5];
                            if (client.field464 != null && var234 < Statics.field1076) {
                                field723[var5++] = Statics.field57[var234].field563;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3616) {
                            field723[var5++] = Statics.field1;
                            continue;
                        }
                        if (var461 == 3617) {
                            var6--;
                            String var235 = field724[var6];
                            client.method2434(var235);
                            continue;
                        }
                        if (var461 == 3618) {
                            field723[var5++] = Statics.field2044;
                            continue;
                        }
                        if (var461 == 3619) {
                            var6--;
                            String var236 = field724[var6];
                            if (!var236.equals("")) {
                                client.field279.method2364(132);
                                class111 var237 = client.field279;
                                int var238 = var236.length() + 1;
                                var237.method2113(var238);
                                client.field279.method2212(var236);
                            }
                            continue;
                        }
                        if (var461 == 3620) {
                            client.method536();
                            continue;
                        }
                        if (var461 == 3621) {
                            if (client.field474 == 0) {
                                field723[var5++] = -1;
                            } else {
                                field723[var5++] = client.field496;
                            }
                            continue;
                        }
                        if (var461 == 3622) {
                            var5--;
                            int var239 = field723[var5];
                            if (client.field474 != 0 && var239 < client.field496) {
                                field724[var6++] = client.field463[var239].field120;
                                field724[var6++] = client.field463[var239].field121;
                                continue;
                            }
                            field724[var6++] = "";
                            field724[var6++] = "";
                            continue;
                        }
                        if (var461 == 3623) {
                            String var240;
                            label2441: {
                                var6--;
                                var240 = field724[var6];
                                String var242 = "<img=0>";
                                if (!var240.startsWith(var242)) {
                                    String var244 = "<img=1>";
                                    if (!var240.startsWith(var244)) {
                                        break label2441;
                                    }
                                }
                                var240 = var240.substring(7);
                            }
                            field723[var5++] = client.method21(var240) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3624) {
                            var5--;
                            int var245 = field723[var5];
                            if (Statics.field57 != null && var245 < Statics.field1076 && Statics.field57[var245].field565.equalsIgnoreCase(Statics.field163.field39)) {
                                field723[var5++] = 1;
                                continue;
                            }
                            field723[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3625) {
                            if (client.field465 == null) {
                                field724[var6++] = "";
                            } else {
                                field724[var6++] = class210.method768(client.field465);
                            }
                            continue;
                        }
                    } else if (var461 < 4000) {
                        if (var461 == 3903) {
                            var5--;
                            int var246 = field723[var5];
                            field723[var5++] = client.field501[var246].method3451();
                            continue;
                        }
                        if (var461 == 3904) {
                            var5--;
                            int var247 = field723[var5];
                            field723[var5++] = client.field501[var247].field2937;
                            continue;
                        }
                        if (var461 == 3905) {
                            var5--;
                            int var248 = field723[var5];
                            field723[var5++] = client.field501[var248].field2938;
                            continue;
                        }
                        if (var461 == 3906) {
                            var5--;
                            int var249 = field723[var5];
                            field723[var5++] = client.field501[var249].field2939;
                            continue;
                        }
                        if (var461 == 3907) {
                            var5--;
                            int var250 = field723[var5];
                            field723[var5++] = client.field501[var250].field2936;
                            continue;
                        }
                        if (var461 == 3908) {
                            var5--;
                            int var251 = field723[var5];
                            field723[var5++] = client.field501[var251].field2941;
                            continue;
                        }
                        if (var461 == 3910) {
                            var5--;
                            int var252 = field723[var5];
                            int var253 = client.field501[var252].method3450();
                            field723[var5++] = var253 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3911) {
                            var5--;
                            int var254 = field723[var5];
                            int var255 = client.field501[var254].method3450();
                            field723[var5++] = var255 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3912) {
                            var5--;
                            int var256 = field723[var5];
                            int var257 = client.field501[var256].method3450();
                            field723[var5++] = var257 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3913) {
                            var5--;
                            int var258 = field723[var5];
                            int var259 = client.field501[var258].method3450();
                            field723[var5++] = var259 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3914) {
                            var5--;
                            boolean var260 = field723[var5] == 1;
                            if (Statics.field1810 != null) {
                                Statics.field1810.method3463(class202.field2945, var260);
                            }
                            continue;
                        }
                        if (var461 == 3915) {
                            var5--;
                            boolean var261 = field723[var5] == 1;
                            if (Statics.field1810 != null) {
                                Statics.field1810.method3463(class202.field2942, var261);
                            }
                            continue;
                        }
                        if (var461 == 3916) {
                            var5 -= 2;
                            boolean var262 = field723[var5] == 1;
                            boolean var263 = field723[var5 + 1] == 1;
                            if (Statics.field1810 != null) {
                                Statics.field1810.method3463(new class19(var263), var262);
                            }
                            continue;
                        }
                        if (var461 == 3917) {
                            var5--;
                            boolean var264 = field723[var5] == 1;
                            if (Statics.field1810 != null) {
                                Statics.field1810.method3463(class202.field2944, var264);
                            }
                            continue;
                        }
                        if (var461 == 3918) {
                            var5--;
                            boolean var265 = field723[var5] == 1;
                            if (Statics.field1810 != null) {
                                Statics.field1810.method3463(class202.field2946, var265);
                            }
                            continue;
                        }
                        if (var461 == 3919) {
                            field723[var5++] = Statics.field1810 == null ? 0 : Statics.field1810.field2943.size();
                            continue;
                        }
                        if (var461 == 3920) {
                            var5--;
                            int var266 = field723[var5];
                            class195 var267 = (class195) Statics.field1810.field2943.get(var266);
                            field723[var5++] = var267.field2908;
                            continue;
                        }
                        if (var461 == 3921) {
                            var5--;
                            int var268 = field723[var5];
                            class195 var269 = (class195) Statics.field1810.field2943.get(var268);
                            field724[var6++] = var269.method3393();
                            continue;
                        }
                        if (var461 == 3922) {
                            var5--;
                            int var270 = field723[var5];
                            class195 var271 = (class195) Statics.field1810.field2943.get(var270);
                            field724[var6++] = var271.method3392();
                            continue;
                        }
                        if (var461 == 3923) {
                            var5--;
                            int var272 = field723[var5];
                            class195 var273 = (class195) Statics.field1810.field2943.get(var272);
                            long var274 = class104.method27() - Statics.field2144 - var273.field2909;
                            int var276 = (int) (var274 / 3600000L);
                            int var277 = (int) ((var274 - (long) (var276 * 3600000)) / 60000L);
                            int var278 = (int) ((var274 - (long) (var276 * 3600000) - (long) (var277 * 60000)) / 1000L);
                            String var279 = var276 + ":" + var277 / 10 + var277 % 10 + ":" + var278 / 10 + var278 % 10;
                            field724[var6++] = var279;
                            continue;
                        }
                        if (var461 == 3924) {
                            var5--;
                            int var280 = field723[var5];
                            class195 var281 = (class195) Statics.field1810.field2943.get(var280);
                            field723[var5++] = var281.field2910.field2939;
                            continue;
                        }
                        if (var461 == 3925) {
                            var5--;
                            int var282 = field723[var5];
                            class195 var283 = (class195) Statics.field1810.field2943.get(var282);
                            field723[var5++] = var283.field2910.field2938;
                            continue;
                        }
                        if (var461 == 3926) {
                            var5--;
                            int var284 = field723[var5];
                            class195 var285 = (class195) Statics.field1810.field2943.get(var284);
                            field723[var5++] = var285.field2910.field2937;
                            continue;
                        }
                    } else if (var461 < 4100) {
                        if (var461 == 4000) {
                            var5 -= 2;
                            int var286 = field723[var5];
                            int var287 = field723[var5 + 1];
                            field723[var5++] = var286 + var287;
                            continue;
                        }
                        if (var461 == 4001) {
                            var5 -= 2;
                            int var288 = field723[var5];
                            int var289 = field723[var5 + 1];
                            field723[var5++] = var288 - var289;
                            continue;
                        }
                        if (var461 == 4002) {
                            var5 -= 2;
                            int var290 = field723[var5];
                            int var291 = field723[var5 + 1];
                            field723[var5++] = var290 * var291;
                            continue;
                        }
                        if (var461 == 4003) {
                            var5 -= 2;
                            int var292 = field723[var5];
                            int var293 = field723[var5 + 1];
                            field723[var5++] = var292 / var293;
                            continue;
                        }
                        if (var461 == 4004) {
                            var5--;
                            int var294 = field723[var5];
                            field723[var5++] = (int) (Math.random() * (double) var294);
                            continue;
                        }
                        if (var461 == 4005) {
                            var5--;
                            int var295 = field723[var5];
                            field723[var5++] = (int) (Math.random() * (double) (var295 + 1));
                            continue;
                        }
                        if (var461 == 4006) {
                            var5 -= 5;
                            int var296 = field723[var5];
                            int var297 = field723[var5 + 1];
                            int var298 = field723[var5 + 2];
                            int var299 = field723[var5 + 3];
                            int var300 = field723[var5 + 4];
                            field723[var5++] = (var297 - var296) * (var300 - var298) / (var299 - var298) + var296;
                            continue;
                        }
                        if (var461 == 4007) {
                            var5 -= 2;
                            int var301 = field723[var5];
                            int var302 = field723[var5 + 1];
                            field723[var5++] = var301 * var302 / 100 + var301;
                            continue;
                        }
                        if (var461 == 4008) {
                            var5 -= 2;
                            int var303 = field723[var5];
                            int var304 = field723[var5 + 1];
                            field723[var5++] = var303 | 0x1 << var304;
                            continue;
                        }
                        if (var461 == 4009) {
                            var5 -= 2;
                            int var305 = field723[var5];
                            int var306 = field723[var5 + 1];
                            field723[var5++] = var305 & -1 - (0x1 << var306);
                            continue;
                        }
                        if (var461 == 4010) {
                            var5 -= 2;
                            int var307 = field723[var5];
                            int var308 = field723[var5 + 1];
                            field723[var5++] = (var307 & 0x1 << var308) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var461 == 4011) {
                            var5 -= 2;
                            int var309 = field723[var5];
                            int var310 = field723[var5 + 1];
                            field723[var5++] = var309 % var310;
                            continue;
                        }
                        if (var461 == 4012) {
                            var5 -= 2;
                            int var311 = field723[var5];
                            int var312 = field723[var5 + 1];
                            if (var311 == 0) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = (int) Math.pow((double) var311, (double) var312);
                            }
                            continue;
                        }
                        if (var461 == 4013) {
                            var5 -= 2;
                            int var313 = field723[var5];
                            int var314 = field723[var5 + 1];
                            if (var313 == 0) {
                                field723[var5++] = 0;
                            } else if (var314 == 0) {
                                field723[var5++] = Integer.MAX_VALUE;
                            } else {
                                field723[var5++] = (int) Math.pow((double) var313, 1.0D / (double) var314);
                            }
                            continue;
                        }
                        if (var461 == 4014) {
                            var5 -= 2;
                            int var315 = field723[var5];
                            int var316 = field723[var5 + 1];
                            field723[var5++] = var315 & var316;
                            continue;
                        }
                        if (var461 == 4015) {
                            var5 -= 2;
                            int var317 = field723[var5];
                            int var318 = field723[var5 + 1];
                            field723[var5++] = var317 | var318;
                            continue;
                        }
                    } else if (var461 < 4200) {
                        if (var461 == 4100) {
                            var6--;
                            String var319 = field724[var6];
                            var5--;
                            int var320 = field723[var5];
                            field724[var6++] = var319 + var320;
                            continue;
                        }
                        if (var461 == 4101) {
                            var6 -= 2;
                            String var321 = field724[var6];
                            String var322 = field724[var6 + 1];
                            field724[var6++] = var321 + var322;
                            continue;
                        }
                        if (var461 == 4102) {
                            var6--;
                            String var323 = field724[var6];
                            var5--;
                            int var324 = field723[var5];
                            field724[var6++] = var323 + class211.method1331(var324, true);
                            continue;
                        }
                        if (var461 == 4103) {
                            var6--;
                            String var325 = field724[var6];
                            field724[var6++] = var325.toLowerCase();
                            continue;
                        }
                        if (var461 == 4104) {
                            var5--;
                            int var326 = field723[var5];
                            long var327 = ((long) var326 + 11745L) * 86400000L;
                            field727.setTime(new Date(var327));
                            int var329 = field727.get(5);
                            int var330 = field727.get(2);
                            int var331 = field727.get(1);
                            field724[var6++] = var329 + "-" + field728[var330] + "-" + var331;
                            continue;
                        }
                        if (var461 == 4105) {
                            var6 -= 2;
                            String var332 = field724[var6];
                            String var333 = field724[var6 + 1];
                            if (Statics.field163.field29 != null && Statics.field163.field29.field2686) {
                                field724[var6++] = var333;
                                continue;
                            }
                            field724[var6++] = var332;
                            continue;
                        }
                        if (var461 == 4106) {
                            var5--;
                            int var334 = field723[var5];
                            field724[var6++] = Integer.toString(var334);
                            continue;
                        }
                        if (var461 == 4107) {
                            var6 -= 2;
                            int[] var335 = field723;
                            int var336 = var5++;
                            String var337 = field724[var6];
                            String var338 = field724[var6 + 1];
                            int var339 = client.field245;
                            int var340 = var337.length();
                            int var341 = var338.length();
                            int var342 = 0;
                            int var343 = 0;
                            char var344 = 0;
                            char var345 = 0;
                            int var346;
                            label2508: while (true) {
                                if (var342 - var344 >= var340 && var343 - var345 >= var341) {
                                    int var355 = Math.min(var340, var341);
                                    for (int var356 = 0; var356 < var355; var356++) {
                                        char var359 = var337.charAt(var356);
                                        char var360 = var338.charAt(var356);
                                        if (var359 != var360 && Character.toUpperCase(var359) != Character.toUpperCase(var360)) {
                                            char var361 = Character.toLowerCase(var359);
                                            char var362 = Character.toLowerCase(var360);
                                            if (var361 != var362) {
                                                var346 = class214.method2823(var361, var339) - class214.method2823(var362, var339);
                                                break label2508;
                                            }
                                        }
                                    }
                                    int var363 = var340 - var341;
                                    if (var363 == 0) {
                                        for (int var364 = 0; var364 < var355; var364++) {
                                            char var365 = var337.charAt(var364);
                                            char var366 = var338.charAt(var364);
                                            if (var365 != var366) {
                                                var346 = class214.method2823(var365, var339) - class214.method2823(var366, var339);
                                                break label2508;
                                            }
                                        }
                                        var346 = 0;
                                    } else {
                                        var346 = var363;
                                    }
                                    break;
                                }
                                if (var342 - var344 >= var340) {
                                    var346 = -1;
                                    break;
                                }
                                if (var343 - var345 >= var341) {
                                    var346 = 1;
                                    break;
                                }
                                char var347;
                                if (var344 == 0) {
                                    var347 = var337.charAt(var342++);
                                } else {
                                    var347 = var344;
                                    boolean var348 = false;
                                }
                                char var349;
                                if (var345 == 0) {
                                    var349 = var338.charAt(var343++);
                                } else {
                                    var349 = var345;
                                    boolean var350 = false;
                                }
                                var344 = class214.method604(var347);
                                var345 = class214.method604(var349);
                                char var351 = class214.method1620(var347, var339);
                                char var352 = class214.method1620(var349, var339);
                                if (var351 != var352 && Character.toUpperCase(var351) != Character.toUpperCase(var352)) {
                                    char var353 = Character.toLowerCase(var351);
                                    char var354 = Character.toLowerCase(var352);
                                    if (var353 != var354) {
                                        var346 = class214.method2823(var353, var339) - class214.method2823(var354, var339);
                                        break;
                                    }
                                }
                            }
                            var335[var336] = class211.method135(var346);
                            continue;
                        }
                        if (var461 == 4108) {
                            var6--;
                            String var367 = field724[var6];
                            var5 -= 2;
                            int var368 = field723[var5];
                            int var369 = field723[var5 + 1];
                            byte[] var370 = Statics.field585.method2751(var369, 0);
                            class205 var371 = new class205(var370);
                            field723[var5++] = var371.method3507(var367, var368);
                            continue;
                        }
                        if (var461 == 4109) {
                            var6--;
                            String var372 = field724[var6];
                            var5 -= 2;
                            int var373 = field723[var5];
                            int var374 = field723[var5 + 1];
                            byte[] var375 = Statics.field585.method2751(var374, 0);
                            class205 var376 = new class205(var375);
                            field723[var5++] = var376.method3468(var372, var373);
                            continue;
                        }
                        if (var461 == 4110) {
                            var6 -= 2;
                            String var377 = field724[var6];
                            String var378 = field724[var6 + 1];
                            var5--;
                            if (field723[var5] == 1) {
                                field724[var6++] = var377;
                            } else {
                                field724[var6++] = var378;
                            }
                            continue;
                        }
                        if (var461 == 4111) {
                            var6--;
                            String var379 = field724[var6];
                            field724[var6++] = class204.method3502(var379);
                            continue;
                        }
                        if (var461 == 4112) {
                            var6--;
                            String var380 = field724[var6];
                            var5--;
                            int var381 = field723[var5];
                            field724[var6++] = var380 + (char) var381;
                            continue;
                        }
                        if (var461 == 4113) {
                            var5--;
                            int var382 = field723[var5];
                            int[] var383 = field723;
                            int var384 = var5++;
                            char var385 = (char) var382;
                            boolean var386;
                            if (var385 >= ' ' && var385 <= '~') {
                                var386 = true;
                            } else if (var385 >= 160 && var385 <= 255) {
                                var386 = true;
                            } else if (var385 == 8364 || var385 == 338 || var385 == 8212 || var385 == 339 || var385 == 376) {
                                var386 = true;
                            } else {
                                var386 = false;
                            }
                            var383[var384] = var386 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4114) {
                            var5--;
                            int var387 = field723[var5];
                            field723[var5++] = class211.method2719((char) var387) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4115) {
                            var5--;
                            int var388 = field723[var5];
                            field723[var5++] = class211.method85((char) var388) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4116) {
                            var5--;
                            int var389 = field723[var5];
                            int[] var390 = field723;
                            int var391 = var5++;
                            char var392 = (char) var389;
                            boolean var393 = var392 >= '0' && var392 <= '9';
                            var390[var391] = var393 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4117) {
                            var6--;
                            String var394 = field724[var6];
                            if (var394 == null) {
                                field723[var5++] = 0;
                            } else {
                                field723[var5++] = var394.length();
                            }
                            continue;
                        }
                        if (var461 == 4118) {
                            var6--;
                            String var395 = field724[var6];
                            var5 -= 2;
                            int var396 = field723[var5];
                            int var397 = field723[var5 + 1];
                            field724[var6++] = var395.substring(var396, var397);
                            continue;
                        }
                        if (var461 == 4119) {
                            var6--;
                            String var398 = field724[var6];
                            StringBuilder var399 = new StringBuilder(var398.length());
                            boolean var400 = false;
                            for (int var401 = 0; var401 < var398.length(); var401++) {
                                char var402 = var398.charAt(var401);
                                if (var402 == '<') {
                                    var400 = true;
                                } else if (var402 == '>') {
                                    var400 = false;
                                } else if (!var400) {
                                    var399.append(var402);
                                }
                            }
                            field724[var6++] = var399.toString();
                            continue;
                        }
                        if (var461 == 4120) {
                            var6--;
                            String var403 = field724[var6];
                            var5--;
                            int var404 = field723[var5];
                            field723[var5++] = var403.indexOf(var404);
                            continue;
                        }
                        if (var461 == 4121) {
                            var6 -= 2;
                            String var405 = field724[var6];
                            String var406 = field724[var6 + 1];
                            var5--;
                            int var407 = field723[var5];
                            field723[var5++] = var405.indexOf(var406, var407);
                            continue;
                        }
                    } else if (var461 < 4300) {
                        if (var461 == 4200) {
                            var5--;
                            int var408 = field723[var5];
                            field724[var6++] = class46.method1975(var408).field1031;
                            continue;
                        }
                        if (var461 == 4201) {
                            var5 -= 2;
                            int var409 = field723[var5];
                            int var410 = field723[var5 + 1];
                            class46 var411 = class46.method1975(var409);
                            if (var410 >= 1 && var410 <= 5 && var411.field1045[var410 - 1] != null) {
                                field724[var6++] = var411.field1045[var410 - 1];
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var461 == 4202) {
                            var5 -= 2;
                            int var412 = field723[var5];
                            int var413 = field723[var5 + 1];
                            class46 var414 = class46.method1975(var412);
                            if (var413 >= 1 && var413 <= 5 && var414.field1046[var413 - 1] != null) {
                                field724[var6++] = var414.field1046[var413 - 1];
                                continue;
                            }
                            field724[var6++] = "";
                            continue;
                        }
                        if (var461 == 4203) {
                            var5--;
                            int var415 = field723[var5];
                            field723[var5++] = class46.method1975(var415).field1043;
                            continue;
                        }
                        if (var461 == 4204) {
                            var5--;
                            int var416 = field723[var5];
                            field723[var5++] = class46.method1975(var416).field1042 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4205) {
                            var5--;
                            int var417 = field723[var5];
                            class46 var418 = class46.method1975(var417);
                            if (var418.field1062 == -1 && var418.field1064 >= 0) {
                                field723[var5++] = var418.field1064;
                                continue;
                            }
                            field723[var5++] = var417;
                            continue;
                        }
                        if (var461 == 4206) {
                            var5--;
                            int var419 = field723[var5];
                            class46 var420 = class46.method1975(var419);
                            if (var420.field1062 >= 0 && var420.field1064 >= 0) {
                                field723[var5++] = var420.field1064;
                                continue;
                            }
                            field723[var5++] = var419;
                            continue;
                        }
                        if (var461 == 4207) {
                            var5--;
                            int var421 = field723[var5];
                            field723[var5++] = class46.method1975(var421).field1044 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4210) {
                            var6--;
                            String var422 = field724[var6];
                            var5--;
                            int var423 = field723[var5];
                            client.method2474(var422, var423 == 1);
                            field723[var5++] = Statics.field223;
                            continue;
                        }
                        if (var461 == 4211) {
                            if (Statics.field1912 != null && Statics.field515 < Statics.field223) {
                                field723[var5++] = Statics.field1912[++Statics.field515 - 1] & 0xFFFF;
                                continue;
                            }
                            field723[var5++] = -1;
                            continue;
                        }
                        if (var461 == 4212) {
                            Statics.field515 = 0;
                            continue;
                        }
                    } else if (var461 < 5100) {
                        if (var461 == 5000) {
                            field723[var5++] = client.field418;
                            continue;
                        }
                        if (var461 == 5001) {
                            var5 -= 3;
                            client.field418 = field723[var5];
                            Statics.field146 = class119.method2435(field723[var5 + 1]);
                            if (Statics.field146 == null) {
                                Statics.field146 = class119.field1913;
                            }
                            client.field456 = field723[var5 + 2];
                            client.field279.method2364(87);
                            client.field279.method2113(client.field418);
                            client.field279.method2113(Statics.field146.field1915);
                            client.field279.method2113(client.field456);
                            continue;
                        }
                        if (var461 == 5002) {
                            var6--;
                            String var424 = field724[var6];
                            var5 -= 2;
                            int var425 = field723[var5];
                            int var426 = field723[var5 + 1];
                            client.field279.method2364(52);
                            class111 var427 = client.field279;
                            int var428 = var424.length() + 1;
                            var427.method2113(var428 + 2);
                            client.field279.method2212(var424);
                            client.field279.method2113(var425 - 1);
                            client.field279.method2113(var426);
                            continue;
                        }
                        if (var461 == 5003) {
                            var5 -= 2;
                            int var429 = field723[var5];
                            int var430 = field723[var5 + 1];
                            class25 var431 = (class25) class10.field143.get(var429);
                            class32 var432 = var431.method522(var430);
                            if (var432 == null) {
                                field723[var5++] = -1;
                                field723[var5++] = 0;
                                field724[var6++] = "";
                                field724[var6++] = "";
                                field724[var6++] = "";
                            } else {
                                field723[var5++] = var432.field714;
                                field723[var5++] = var432.field712;
                                field724[var6++] = var432.field705 == null ? "" : var432.field705;
                                field724[var6++] = var432.field708 == null ? "" : var432.field708;
                                field724[var6++] = var432.field709 == null ? "" : var432.field709;
                            }
                            continue;
                        }
                        if (var461 == 5004) {
                            var5--;
                            int var434 = field723[var5];
                            class32 var435 = class10.method1884(var434);
                            if (var435 == null) {
                                field723[var5++] = -1;
                                field723[var5++] = 0;
                                field724[var6++] = "";
                                field724[var6++] = "";
                                field724[var6++] = "";
                            } else {
                                field723[var5++] = var435.field707;
                                field723[var5++] = var435.field712;
                                field724[var6++] = var435.field705 == null ? "" : var435.field705;
                                field724[var6++] = var435.field708 == null ? "" : var435.field708;
                                field724[var6++] = var435.field709 == null ? "" : var435.field709;
                            }
                            continue;
                        }
                        if (var461 == 5005) {
                            if (Statics.field146 == null) {
                                field723[var5++] = -1;
                            } else {
                                field723[var5++] = Statics.field146.field1915;
                            }
                            continue;
                        }
                        if (var461 == 5008) {
                            var6--;
                            String var436 = field724[var6];
                            var5--;
                            int var437 = field723[var5];
                            String var438 = var436.toLowerCase();
                            byte var439 = 0;
                            if (var438.startsWith(class145.field2336)) {
                                var439 = 0;
                                var436 = var436.substring(class145.field2336.length());
                            } else if (var438.startsWith(class145.field2338)) {
                                var439 = 1;
                                var436 = var436.substring(class145.field2338.length());
                            } else if (var438.startsWith(class145.field2340)) {
                                var439 = 2;
                                var436 = var436.substring(class145.field2340.length());
                            } else if (var438.startsWith(class145.field2342)) {
                                var439 = 3;
                                var436 = var436.substring(class145.field2342.length());
                            } else if (var438.startsWith(class145.field2282)) {
                                var439 = 4;
                                var436 = var436.substring(class145.field2282.length());
                            } else if (var438.startsWith(class145.field2346)) {
                                var439 = 5;
                                var436 = var436.substring(class145.field2346.length());
                            } else if (var438.startsWith(class145.field2348)) {
                                var439 = 6;
                                var436 = var436.substring(class145.field2348.length());
                            } else if (var438.startsWith(class145.field2350)) {
                                var439 = 7;
                                var436 = var436.substring(class145.field2350.length());
                            } else if (var438.startsWith(class145.field2352)) {
                                var439 = 8;
                                var436 = var436.substring(class145.field2352.length());
                            } else if (var438.startsWith(class145.field2357)) {
                                var439 = 9;
                                var436 = var436.substring(class145.field2357.length());
                            } else if (var438.startsWith(class145.field2356)) {
                                var439 = 10;
                                var436 = var436.substring(class145.field2356.length());
                            } else if (var438.startsWith(class145.field2358)) {
                                var439 = 11;
                                var436 = var436.substring(class145.field2358.length());
                            } else if (client.field245 != 0) {
                                if (var438.startsWith(class145.field2337)) {
                                    var439 = 0;
                                    var436 = var436.substring(class145.field2337.length());
                                } else if (var438.startsWith(class145.field2290)) {
                                    var439 = 1;
                                    var436 = var436.substring(class145.field2290.length());
                                } else if (var438.startsWith(class145.field2341)) {
                                    var439 = 2;
                                    var436 = var436.substring(class145.field2341.length());
                                } else if (var438.startsWith(class145.field2343)) {
                                    var439 = 3;
                                    var436 = var436.substring(class145.field2343.length());
                                } else if (var438.startsWith(class145.field2345)) {
                                    var439 = 4;
                                    var436 = var436.substring(class145.field2345.length());
                                } else if (var438.startsWith(class145.field2347)) {
                                    var439 = 5;
                                    var436 = var436.substring(class145.field2347.length());
                                } else if (var438.startsWith(class145.field2181)) {
                                    var439 = 6;
                                    var436 = var436.substring(class145.field2181.length());
                                } else if (var438.startsWith(class145.field2288)) {
                                    var439 = 7;
                                    var436 = var436.substring(class145.field2288.length());
                                } else if (var438.startsWith(class145.field2244)) {
                                    var439 = 8;
                                    var436 = var436.substring(class145.field2244.length());
                                } else if (var438.startsWith(class145.field2355)) {
                                    var439 = 9;
                                    var436 = var436.substring(class145.field2355.length());
                                } else if (var438.startsWith(class145.field2221)) {
                                    var439 = 10;
                                    var436 = var436.substring(class145.field2221.length());
                                } else if (var438.startsWith(class145.field2359)) {
                                    var439 = 11;
                                    var436 = var436.substring(class145.field2359.length());
                                }
                            }
                            String var440 = var436.toLowerCase();
                            byte var441 = 0;
                            if (var440.startsWith(class145.field2360)) {
                                var441 = 1;
                                var436 = var436.substring(class145.field2360.length());
                            } else if (var440.startsWith(class145.field2335)) {
                                var441 = 2;
                                var436 = var436.substring(class145.field2335.length());
                            } else if (var440.startsWith(class145.field2364)) {
                                var441 = 3;
                                var436 = var436.substring(class145.field2364.length());
                            } else if (var440.startsWith(class145.field2249)) {
                                var441 = 4;
                                var436 = var436.substring(class145.field2249.length());
                            } else if (var440.startsWith(class145.field2368)) {
                                var441 = 5;
                                var436 = var436.substring(class145.field2368.length());
                            } else if (client.field245 != 0) {
                                if (var440.startsWith(class145.field2361)) {
                                    var441 = 1;
                                    var436 = var436.substring(class145.field2361.length());
                                } else if (var440.startsWith(class145.field2229)) {
                                    var441 = 2;
                                    var436 = var436.substring(class145.field2229.length());
                                } else if (var440.startsWith(class145.field2365)) {
                                    var441 = 3;
                                    var436 = var436.substring(class145.field2365.length());
                                } else if (var440.startsWith(class145.field2367)) {
                                    var441 = 4;
                                    var436 = var436.substring(class145.field2367.length());
                                } else if (var440.startsWith(class145.field2383)) {
                                    var441 = 5;
                                    var436 = var436.substring(class145.field2383.length());
                                }
                            }
                            client.field279.method2364(255);
                            client.field279.method2113(0);
                            int var442 = client.field279.field1841;
                            client.field279.method2113(var437);
                            client.field279.method2113(var439);
                            client.field279.method2113(var441);
                            class203.method601(client.field279, var436);
                            client.field279.method2124(client.field279.field1841 - var442);
                            continue;
                        }
                        if (var461 == 5009) {
                            var6 -= 2;
                            String var443 = field724[var6];
                            String var444 = field724[var6 + 1];
                            client.field279.method2364(144);
                            client.field279.method2114(0);
                            int var445 = client.field279.field1841;
                            client.field279.method2212(var443);
                            class203.method601(client.field279, var444);
                            client.field279.method2123(client.field279.field1841 - var445);
                            continue;
                        }
                        if (var461 == 5015) {
                            String var446;
                            if (Statics.field163 == null || Statics.field163.field39 == null) {
                                var446 = "";
                            } else {
                                var446 = Statics.field163.field39;
                            }
                            field724[var6++] = var446;
                            continue;
                        }
                        if (var461 == 5016) {
                            field723[var5++] = client.field456;
                            continue;
                        }
                        if (var461 == 5017) {
                            var5--;
                            int var447 = field723[var5];
                            field723[var5++] = class10.method80(var447);
                            continue;
                        }
                        if (var461 == 5018) {
                            var5--;
                            int var448 = field723[var5];
                            field723[var5++] = class10.method538(var448);
                            continue;
                        }
                        if (var461 == 5019) {
                            var5--;
                            int var449 = field723[var5];
                            int[] var450 = field723;
                            int var451 = var5++;
                            class32 var452 = (class32) class10.field141.method3233((long) var449);
                            int var453;
                            if (var452 == null) {
                                var453 = -1;
                            } else if (class10.field142.field2866 == var452.field2871) {
                                var453 = -1;
                            } else {
                                var453 = ((class32) var452.field2871).field714;
                            }
                            var450[var451] = var453;
                            continue;
                        }
                        if (var461 == 5020) {
                            var6--;
                            String var454 = field724[var6];
                            client.method150(var454);
                            continue;
                        }
                        if (var461 == 5021) {
                            var6--;
                            client.field457 = field724[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var461 == 5022) {
                            field724[var6++] = client.field457;
                            continue;
                        }
                    }
                } else {
                    class155 var73;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var5--;
                        var73 = class155.method2386(field723[var5]);
                    } else {
                        var73 = var48 ? Statics.field700 : Statics.field639;
                    }
                    if (var461 == 1300) {
                        var5--;
                        int var74 = field723[var5] - 1;
                        if (var74 >= 0 && var74 <= 9) {
                            var6--;
                            var73.method2865(var74, field724[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var461 == 1301) {
                        var5 -= 2;
                        int var75 = field723[var5];
                        int var76 = field723[var5 + 1];
                        var73.field2604 = class155.method599(var75, var76);
                        continue;
                    }
                    if (var461 == 1302) {
                        var5--;
                        var73.field2596 = field723[var5] == 1;
                        continue;
                    }
                    if (var461 == 1303) {
                        var5--;
                        var73.field2578 = field723[var5];
                        continue;
                    }
                    if (var461 == 1304) {
                        var5--;
                        var73.field2606 = field723[var5];
                        continue;
                    }
                    if (var461 == 1305) {
                        var6--;
                        var73.field2602 = field724[var6];
                        continue;
                    }
                    if (var461 == 1306) {
                        var6--;
                        var73.field2608 = field724[var6];
                        continue;
                    }
                    if (var461 == 1307) {
                        var73.field2603 = null;
                        continue;
                    }
                }
                if (var461 >= 5600 || var461 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var455 = field723[var5];
                int var456 = field723[var5 + 1];
                if (!client.field486) {
                    client.field271 = var455;
                    client.field404 = var456;
                }
            }
        } catch (Exception var460) {
            StringBuilder var458 = new StringBuilder(30);
            var458.append("").append(var4.field2882).append(" ");
            for (int var459 = field729 - 1; var459 >= 0; var459--) {
                var458.append("").append(field726[var459].field187.field2882).append(" ");
            }
            var458.append("").append(var10);
            class137.method483(var458.toString(), var460);
        }
    }

    @ObfuscatedName("dy.v(II)V")
    public static void method2559(int arg0) {
        if (arg0 == -1 || !class155.method512(arg0)) {
            return;
        }
        class155[] var1 = Statics.field2533[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class155 var3 = var1[var2];
            if (var3.field2610 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field15 = var3.field2610;
                method2543(var4, 2000000);
            }
        }
    }
}
