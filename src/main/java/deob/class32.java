package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ak")
public class class32 {

    @ObfuscatedName("ak.w")
    public static int[] field737 = new int[5];

    @ObfuscatedName("ak.r")
    public static int[][] field733 = new int[5][5000];

    @ObfuscatedName("ak.l")
    public static int[] field734 = new int[1000];

    @ObfuscatedName("ak.s")
    public static String[] field735 = new String[1000];

    @ObfuscatedName("ak.f")
    public static int field736 = 0;

    @ObfuscatedName("ak.x")
    public static class13[] field738 = new class13[50];

    @ObfuscatedName("ak.u")
    public static Calendar field729 = Calendar.getInstance();

    @ObfuscatedName("ak.v")
    public static final String[] field739 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.e(Le;II)V")
    public static void method701(class1 arg0, int arg1) {
        Object[] var2 = arg0.field9;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method654(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field544;
        int[] var9 = var4.field540;
        byte var10 = -1;
        field736 = 0;
        try {
            Statics.field708 = new int[var4.field542];
            int var11 = 0;
            Statics.field731 = new String[var4.field549];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2521;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2522;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field5 == null ? -1 : arg0.field5.field2521;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field5 == null ? -1 : arg0.field5.field2522;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field2;
                    }
                    Statics.field708[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field4;
                    }
                    Statics.field731[var12++] = var15;
                }
            }
            int var16 = 0;
            label2592: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var429 = var8[var7];
                if (var429 < 100) {
                    if (var429 == 0) {
                        field734[var5++] = var9[var7];
                        continue;
                    }
                    if (var429 == 1) {
                        int var17 = var9[var7];
                        field734[var5++] = class154.field2647[var17];
                        continue;
                    }
                    if (var429 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class154.field2647[var18] = field734[var5];
                        client.method140(var18);
                        continue;
                    }
                    if (var429 == 3) {
                        field735[var6++] = var4.field541[var7];
                        continue;
                    }
                    if (var429 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var429 == 7) {
                        var5 -= 2;
                        if (field734[var5 + 1] != field734[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var429 == 8) {
                        var5 -= 2;
                        if (field734[var5 + 1] == field734[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var429 == 9) {
                        var5 -= 2;
                        if (field734[var5] < field734[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var429 == 10) {
                        var5 -= 2;
                        if (field734[var5] > field734[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var429 == 21) {
                        if (field736 == 0) {
                            return;
                        }
                        class13 var19 = field738[--field736];
                        var4 = var19.field192;
                        var8 = var4.field544;
                        var9 = var4.field540;
                        var7 = var19.field193;
                        Statics.field708 = var19.field189;
                        Statics.field731 = var19.field191;
                        continue;
                    }
                    if (var429 == 25) {
                        int var20 = var9[var7];
                        field734[var5++] = class154.method597(var20);
                        continue;
                    }
                    if (var429 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field734[var5];
                        class42 var23 = class42.method74(var21);
                        int var24 = var23.field988;
                        int var25 = var23.field991;
                        int var26 = var23.field990;
                        int var27 = class154.field2649[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class154.field2647[var24] = class154.field2647[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var429 == 31) {
                        var5 -= 2;
                        if (field734[var5] <= field734[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var429 == 32) {
                        var5 -= 2;
                        if (field734[var5] >= field734[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var429 == 33) {
                        field734[var5++] = Statics.field708[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var429 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field708[var10001] = field734[var5];
                        continue;
                    }
                    if (var429 == 35) {
                        field735[var6++] = Statics.field731[var9[var7]];
                        continue;
                    }
                    if (var429 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field731[var10001] = field735[var6];
                        continue;
                    }
                    if (var429 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field735;
                        String var31;
                        if (var29 == 0) {
                            var31 = "";
                        } else if (var29 == 1) {
                            String var32 = var30[var6];
                            if (var32 == null) {
                                var31 = "null";
                            } else {
                                var31 = var32.toString();
                            }
                        } else {
                            int var33 = var6 + var29;
                            int var34 = 0;
                            for (int var35 = var6; var35 < var33; var35++) {
                                String var36 = var30[var35];
                                if (var36 == null) {
                                    var34 += 4;
                                } else {
                                    var34 += var36.length();
                                }
                            }
                            StringBuilder var37 = new StringBuilder(var34);
                            for (int var38 = var6; var38 < var33; var38++) {
                                String var39 = var30[var38];
                                if (var39 == null) {
                                    var37.append("null");
                                } else {
                                    var37.append(var39);
                                }
                            }
                            var31 = var37.toString();
                        }
                        field735[var6++] = var31;
                        continue;
                    }
                    if (var429 == 38) {
                        var5--;
                        continue;
                    }
                    if (var429 == 39) {
                        var6--;
                        continue;
                    }
                    if (var429 == 40) {
                        int var41 = var9[var7];
                        class19 var42 = class19.method654(var41);
                        int[] var43 = new int[var42.field542];
                        String[] var44 = new String[var42.field549];
                        for (int var45 = 0; var45 < var42.field548; var45++) {
                            var43[var45] = field734[var5 - var42.field548 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field538; var46++) {
                            var44[var46] = field735[var6 - var42.field538 + var46];
                        }
                        var5 -= var42.field548;
                        var6 -= var42.field538;
                        class13 var47 = new class13();
                        var47.field192 = var4;
                        var47.field193 = var7;
                        var47.field189 = Statics.field708;
                        var47.field191 = Statics.field731;
                        field738[++field736 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field544;
                        var9 = var42.field540;
                        var7 = -1;
                        Statics.field708 = var43;
                        Statics.field731 = var44;
                        continue;
                    }
                    if (var429 == 42) {
                        field734[var5++] = client.field483[var9[var7]];
                        continue;
                    }
                    if (var429 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field483[var10001] = field734[var5];
                        continue;
                    }
                    if (var429 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field734[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field737[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label2592;
                                }
                                field733[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var429 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field734[var5];
                        if (var54 >= 0 && var54 < field737[var53]) {
                            field734[var5++] = field733[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var429 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field734[var5];
                        if (var56 >= 0 && var56 < field737[var55]) {
                            field733[var55][var56] = field734[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var429 == 47) {
                        String var57 = client.field461[var9[var7]];
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field735[var6++] = var57;
                        continue;
                    }
                    if (var429 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field461[var10001] = field735[var6];
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var429 < 1000) {
                    if (var429 == 100) {
                        var5 -= 3;
                        int var59 = field734[var5];
                        int var60 = field734[var5 + 1];
                        int var61 = field734[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class152 var62 = class152.method1829(var59);
                        if (var62.field2629 == null) {
                            var62.field2629 = new class152[var61 + 1];
                        }
                        if (var62.field2629.length <= var61) {
                            class152[] var63 = new class152[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2629.length; var64++) {
                                var63[var64] = var62.field2629[var64];
                            }
                            var62.field2629 = var63;
                        }
                        if (var61 > 0 && var62.field2629[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class152 var65 = new class152();
                        var65.field2523 = var60;
                        var65.field2532 = var65.field2521 = var62.field2521;
                        var65.field2522 = var61;
                        var65.field2520 = true;
                        var62.field2629[var61] = var65;
                        if (var58) {
                            Statics.field2472 = var65;
                        } else {
                            Statics.field194 = var65;
                        }
                        client.method3375(var62);
                        continue;
                    }
                    if (var429 == 101) {
                        class152 var66 = var58 ? Statics.field2472 : Statics.field194;
                        class152 var67 = class152.method1829(var66.field2521);
                        var67.field2629[var66.field2522] = null;
                        client.method3375(var67);
                        continue;
                    }
                    if (var429 == 102) {
                        var5--;
                        class152 var68 = class152.method1829(field734[var5]);
                        var68.field2629 = null;
                        client.method3375(var68);
                        continue;
                    }
                    if (var429 == 200) {
                        var5 -= 2;
                        int var69 = field734[var5];
                        int var70 = field734[var5 + 1];
                        class152 var71 = class152.method1320(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field734[var5++] = 1;
                            if (var58) {
                                Statics.field2472 = var71;
                            } else {
                                Statics.field194 = var71;
                            }
                            continue;
                        }
                        field734[var5++] = 0;
                        continue;
                    }
                } else if (!(var429 < 1000 || var429 >= 1100) || !(var429 < 2000 || var429 >= 2100)) {
                    class152 var72;
                    if (var429 >= 2000) {
                        var429 -= 1000;
                        var5--;
                        var72 = class152.method1829(field734[var5]);
                    } else {
                        var72 = var58 ? Statics.field2472 : Statics.field194;
                    }
                    if (var429 == 1000) {
                        var5 -= 2;
                        var72.field2526 = field734[var5];
                        var72.field2527 = field734[var5 + 1];
                        client.method3375(var72);
                        continue;
                    }
                    if (var429 == 1001) {
                        var5 -= 2;
                        var72.field2530 = field734[var5];
                        var72.field2531 = field734[var5 + 1];
                        client.method3375(var72);
                        continue;
                    }
                    if (var429 == 1003) {
                        var5--;
                        boolean var73 = field734[var5] == 1;
                        if (var72.field2533 != var73) {
                            var72.field2533 = var73;
                            client.method3375(var72);
                        }
                        continue;
                    }
                } else if (var429 >= 1100 && var429 < 1200 || var429 >= 2100 && var429 < 2200) {
                    class152 var74;
                    if (var429 >= 2000) {
                        var429 -= 1000;
                        var5--;
                        var74 = class152.method1829(field734[var5]);
                    } else {
                        var74 = var58 ? Statics.field2472 : Statics.field194;
                    }
                    if (var429 == 1100) {
                        var5 -= 2;
                        var74.field2534 = field734[var5];
                        if (var74.field2534 > var74.field2536 - var74.field2530) {
                            var74.field2534 = var74.field2536 - var74.field2530;
                        }
                        if (var74.field2534 < 0) {
                            var74.field2534 = 0;
                        }
                        var74.field2558 = field734[var5 + 1];
                        if (var74.field2558 > var74.field2512 - var74.field2531) {
                            var74.field2558 = var74.field2512 - var74.field2531;
                        }
                        if (var74.field2558 < 0) {
                            var74.field2558 = 0;
                        }
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1101) {
                        var5--;
                        var74.field2540 = field734[var5];
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1102) {
                        var5--;
                        var74.field2542 = field734[var5] == 1;
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1103) {
                        var5--;
                        var74.field2543 = field734[var5];
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1104) {
                        var5--;
                        var74.field2550 = field734[var5];
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1105) {
                        var5--;
                        var74.field2545 = field734[var5];
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1106) {
                        var5--;
                        var74.field2547 = field734[var5];
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1107) {
                        var5--;
                        var74.field2583 = field734[var5] == 1;
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1108) {
                        var74.field2553 = 1;
                        var5--;
                        var74.field2607 = field734[var5];
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1109) {
                        var5 -= 6;
                        var74.field2624 = field734[var5];
                        var74.field2560 = field734[var5 + 1];
                        var74.field2582 = field734[var5 + 2];
                        var74.field2597 = field734[var5 + 3];
                        var74.field2563 = field734[var5 + 4];
                        var74.field2519 = field734[var5 + 5];
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1110) {
                        var5--;
                        int var75 = field734[var5];
                        if (var74.field2557 != var75) {
                            var74.field2557 = var75;
                            var74.field2620 = 0;
                            var74.field2628 = 0;
                            client.method3375(var74);
                        }
                        continue;
                    }
                    if (var429 == 1111) {
                        var5--;
                        var74.field2538 = field734[var5] == 1;
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1112) {
                        var6--;
                        String var76 = field735[var6];
                        if (!var76.equals(var74.field2568)) {
                            var74.field2568 = var76;
                            client.method3375(var74);
                        }
                        continue;
                    }
                    if (var429 == 1113) {
                        var5--;
                        var74.field2567 = field734[var5];
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1114) {
                        var5 -= 3;
                        var74.field2559 = field734[var5];
                        var74.field2572 = field734[var5 + 1];
                        var74.field2570 = field734[var5 + 2];
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1115) {
                        var5--;
                        var74.field2515 = field734[var5] == 1;
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1116) {
                        var5--;
                        var74.field2549 = field734[var5];
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1117) {
                        var5--;
                        var74.field2548 = field734[var5];
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1118) {
                        var5--;
                        var74.field2551 = field734[var5] == 1;
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1119) {
                        var5--;
                        var74.field2564 = field734[var5] == 1;
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1120) {
                        var5 -= 2;
                        var74.field2536 = field734[var5];
                        var74.field2512 = field734[var5 + 1];
                        client.method3375(var74);
                        continue;
                    }
                    if (var429 == 1121) {
                        client.method31(var74.field2521, var74.field2522);
                        client.field306 = var74;
                        client.method3375(var74);
                        continue;
                    }
                } else if (var429 >= 1200 && var429 < 1300 || var429 >= 2200 && var429 < 2300) {
                    class152 var77;
                    if (var429 >= 2000) {
                        var429 -= 1000;
                        var5--;
                        var77 = class152.method1829(field734[var5]);
                    } else {
                        var77 = var58 ? Statics.field2472 : Statics.field194;
                    }
                    client.method3375(var77);
                    if (var429 == 1200) {
                        var5 -= 2;
                        int var78 = field734[var5];
                        int var79 = field734[var5 + 1];
                        var77.field2625 = var78;
                        var77.field2626 = var79;
                        class45 var80 = class45.method1729(var78);
                        var77.field2582 = var80.field1032;
                        var77.field2597 = var80.field1037;
                        var77.field2563 = var80.field1038;
                        var77.field2624 = var80.field1062;
                        var77.field2560 = var80.field1040;
                        var77.field2519 = var80.field1035;
                        if (var77.field2530 > 0) {
                            var77.field2519 = var77.field2519 * 32 / var77.field2530;
                        }
                        continue;
                    }
                    if (var429 == 1201) {
                        var77.field2553 = 2;
                        var5--;
                        var77.field2607 = field734[var5];
                        continue;
                    }
                    if (var429 == 1202) {
                        var77.field2553 = 3;
                        var77.field2607 = Statics.field24.field33.method2853();
                        continue;
                    }
                } else if ((var429 < 1300 || var429 >= 1400) && (var429 < 2300 || var429 >= 2400)) {
                    if (var429 >= 1400 && var429 < 1500 || var429 >= 2400 && var429 < 2500) {
                        class152 var85;
                        if (var429 >= 2000) {
                            var429 -= 1000;
                            var5--;
                            var85 = class152.method1829(field734[var5]);
                        } else {
                            var85 = var58 ? Statics.field2472 : Statics.field194;
                        }
                        var6--;
                        String var86 = field735[var6];
                        int[] var87 = null;
                        if (var86.length() > 0 && var86.charAt(var86.length() - 1) == 'Y') {
                            var5--;
                            int var88 = field734[var5];
                            if (var88 > 0) {
                                var87 = new int[var88];
                                while (var88-- > 0) {
                                    var5--;
                                    var87[var88] = field734[var5];
                                }
                            }
                            var86 = var86.substring(0, var86.length() - 1);
                        }
                        Object[] var89 = new Object[var86.length() + 1];
                        for (int var90 = var89.length - 1; var90 >= 1; var90--) {
                            if (var86.charAt(var90 - 1) == 's') {
                                var6--;
                                var89[var90] = field735[var6];
                            } else {
                                var5--;
                                var89[var90] = Integer.valueOf(field734[var5]);
                            }
                        }
                        var5--;
                        int var91 = field734[var5];
                        if (var91 == -1) {
                            var89 = null;
                        } else {
                            var89[0] = Integer.valueOf(var91);
                        }
                        if (var429 == 1400) {
                            var85.field2590 = var89;
                        }
                        if (var429 == 1401) {
                            var85.field2593 = var89;
                        }
                        if (var429 == 1402) {
                            var85.field2592 = var89;
                        }
                        if (var429 == 1403) {
                            var85.field2594 = var89;
                        }
                        if (var429 == 1404) {
                            var85.field2561 = var89;
                        }
                        if (var429 == 1405) {
                            var85.field2630 = var89;
                        }
                        if (var429 == 1406) {
                            var85.field2514 = var89;
                        }
                        if (var429 == 1407) {
                            var85.field2601 = var89;
                            var85.field2602 = var87;
                        }
                        if (var429 == 1408) {
                            var85.field2606 = var89;
                        }
                        if (var429 == 1409) {
                            var85.field2569 = var89;
                        }
                        if (var429 == 1410) {
                            var85.field2598 = var89;
                        }
                        if (var429 == 1411) {
                            var85.field2608 = var89;
                        }
                        if (var429 == 1412) {
                            var85.field2510 = var89;
                        }
                        if (var429 == 1414) {
                            var85.field2622 = var89;
                            var85.field2571 = var87;
                        }
                        if (var429 == 1415) {
                            var85.field2605 = var89;
                            var85.field2617 = var87;
                        }
                        if (var429 == 1416) {
                            var85.field2599 = var89;
                        }
                        if (var429 == 1417) {
                            var85.field2609 = var89;
                        }
                        if (var429 == 1418) {
                            var85.field2610 = var89;
                        }
                        if (var429 == 1419) {
                            var85.field2611 = var89;
                        }
                        if (var429 == 1420) {
                            var85.field2612 = var89;
                        }
                        if (var429 == 1421) {
                            var85.field2613 = var89;
                        }
                        if (var429 == 1422) {
                            var85.field2634 = var89;
                        }
                        if (var429 == 1423) {
                            var85.field2615 = var89;
                        }
                        if (var429 == 1424) {
                            var85.field2616 = var89;
                        }
                        var85.field2524 = true;
                        continue;
                    }
                    if (var429 < 1600) {
                        class152 var92 = var58 ? Statics.field2472 : Statics.field194;
                        if (var429 == 1500) {
                            field734[var5++] = var92.field2526;
                            continue;
                        }
                        if (var429 == 1501) {
                            field734[var5++] = var92.field2527;
                            continue;
                        }
                        if (var429 == 1502) {
                            field734[var5++] = var92.field2530;
                            continue;
                        }
                        if (var429 == 1503) {
                            field734[var5++] = var92.field2531;
                            continue;
                        }
                        if (var429 == 1504) {
                            field734[var5++] = var92.field2533 ? 1 : 0;
                            continue;
                        }
                        if (var429 == 1505) {
                            field734[var5++] = var92.field2532;
                            continue;
                        }
                    } else if (var429 < 1700) {
                        class152 var93 = var58 ? Statics.field2472 : Statics.field194;
                        if (var429 == 1600) {
                            field734[var5++] = var93.field2534;
                            continue;
                        }
                        if (var429 == 1601) {
                            field734[var5++] = var93.field2558;
                            continue;
                        }
                        if (var429 == 1602) {
                            field735[var6++] = var93.field2568;
                            continue;
                        }
                        if (var429 == 1603) {
                            field734[var5++] = var93.field2536;
                            continue;
                        }
                        if (var429 == 1604) {
                            field734[var5++] = var93.field2512;
                            continue;
                        }
                        if (var429 == 1605) {
                            field734[var5++] = var93.field2519;
                            continue;
                        }
                        if (var429 == 1606) {
                            field734[var5++] = var93.field2582;
                            continue;
                        }
                        if (var429 == 1607) {
                            field734[var5++] = var93.field2563;
                            continue;
                        }
                        if (var429 == 1608) {
                            field734[var5++] = var93.field2597;
                            continue;
                        }
                    } else if (var429 < 1800) {
                        class152 var94 = var58 ? Statics.field2472 : Statics.field194;
                        if (var429 == 1700) {
                            field734[var5++] = var94.field2625;
                            continue;
                        }
                        if (var429 == 1701) {
                            if (var94.field2625 == -1) {
                                field734[var5++] = 0;
                            } else {
                                field734[var5++] = var94.field2626;
                            }
                            continue;
                        }
                        if (var429 == 1702) {
                            field734[var5++] = var94.field2522;
                            continue;
                        }
                    } else if (var429 < 1900) {
                        class152 var95 = var58 ? Statics.field2472 : Statics.field194;
                        if (var429 == 1800) {
                            field734[var5++] = class156.method2617(Statics.method488(var95));
                            continue;
                        }
                        if (var429 == 1801) {
                            var5--;
                            int var96 = field734[var5];
                            int var430 = var96 - 1;
                            if (var95.field2618 != null && var430 < var95.field2618.length && var95.field2618[var430] != null) {
                                field735[var6++] = var95.field2618[var430];
                                continue;
                            }
                            field735[var6++] = "";
                            continue;
                        }
                        if (var429 == 1802) {
                            if (var95.field2554 == null) {
                                field735[var6++] = "";
                            } else {
                                field735[var6++] = var95.field2554;
                            }
                            continue;
                        }
                    } else if (var429 < 2600) {
                        var5--;
                        class152 var97 = class152.method1829(field734[var5]);
                        if (var429 == 2500) {
                            field734[var5++] = var97.field2526;
                            continue;
                        }
                        if (var429 == 2501) {
                            field734[var5++] = var97.field2527;
                            continue;
                        }
                        if (var429 == 2502) {
                            field734[var5++] = var97.field2530;
                            continue;
                        }
                        if (var429 == 2503) {
                            field734[var5++] = var97.field2531;
                            continue;
                        }
                        if (var429 == 2504) {
                            field734[var5++] = var97.field2533 ? 1 : 0;
                            continue;
                        }
                        if (var429 == 2505) {
                            field734[var5++] = var97.field2532;
                            continue;
                        }
                    } else if (var429 < 2700) {
                        var5--;
                        class152 var98 = class152.method1829(field734[var5]);
                        if (var429 == 2600) {
                            field734[var5++] = var98.field2534;
                            continue;
                        }
                        if (var429 == 2601) {
                            field734[var5++] = var98.field2558;
                            continue;
                        }
                        if (var429 == 2602) {
                            field735[var6++] = var98.field2568;
                            continue;
                        }
                        if (var429 == 2603) {
                            field734[var5++] = var98.field2536;
                            continue;
                        }
                        if (var429 == 2604) {
                            field734[var5++] = var98.field2512;
                            continue;
                        }
                        if (var429 == 2605) {
                            field734[var5++] = var98.field2519;
                            continue;
                        }
                        if (var429 == 2606) {
                            field734[var5++] = var98.field2582;
                            continue;
                        }
                        if (var429 == 2607) {
                            field734[var5++] = var98.field2563;
                            continue;
                        }
                        if (var429 == 2608) {
                            field734[var5++] = var98.field2597;
                            continue;
                        }
                    } else if (var429 < 2800) {
                        if (var429 == 2700) {
                            var5--;
                            class152 var99 = class152.method1829(field734[var5]);
                            field734[var5++] = var99.field2625;
                            continue;
                        }
                        if (var429 == 2701) {
                            var5--;
                            class152 var100 = class152.method1829(field734[var5]);
                            if (var100.field2625 == -1) {
                                field734[var5++] = 0;
                            } else {
                                field734[var5++] = var100.field2626;
                            }
                            continue;
                        }
                        if (var429 == 2702) {
                            var5--;
                            int var101 = field734[var5];
                            class4 var102 = (class4) client.field426.method3092((long) var101);
                            if (var102 == null) {
                                field734[var5++] = 0;
                            } else {
                                field734[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var429 < 2900) {
                        var5--;
                        class152 var103 = class152.method1829(field734[var5]);
                        if (var429 == 2800) {
                            field734[var5++] = class156.method2617(Statics.method488(var103));
                            continue;
                        }
                        if (var429 == 2801) {
                            var5--;
                            int var104 = field734[var5];
                            int var431 = var104 - 1;
                            if (var103.field2618 != null && var431 < var103.field2618.length && var103.field2618[var431] != null) {
                                field735[var6++] = var103.field2618[var431];
                                continue;
                            }
                            field735[var6++] = "";
                            continue;
                        }
                        if (var429 == 2802) {
                            if (var103.field2554 == null) {
                                field735[var6++] = "";
                            } else {
                                field735[var6++] = var103.field2554;
                            }
                            continue;
                        }
                    } else if (var429 < 3200) {
                        if (var429 == 3100) {
                            var6--;
                            String var105 = field735[var6];
                            class10.method1313(0, "", var105);
                            continue;
                        }
                        if (var429 == 3101) {
                            var5 -= 2;
                            Statics.method502(Statics.field24, field734[var5], field734[var5 + 1]);
                            continue;
                        }
                        if (var429 == 3103) {
                            client.field386.method2319(175);
                            for (class4 var106 = (class4) client.field426.method3096(); var106 != null; var106 = (class4) client.field426.method3093()) {
                                if (var106.field59 == 0 || var106.field59 == 3) {
                                    client.method2603(var106, true);
                                }
                            }
                            if (client.field306 != null) {
                                client.method3375(client.field306);
                                client.field306 = null;
                            }
                            continue;
                        }
                        if (var429 == 3104) {
                            var6--;
                            String var107 = field735[var6];
                            int var108 = 0;
                            if (class199.method3410(var107)) {
                                var108 = class199.method486(var107);
                            }
                            client.field386.method2319(107);
                            client.field386.method2054(var108);
                            continue;
                        }
                        if (var429 == 3105) {
                            var6--;
                            String var109 = field735[var6];
                            client.field386.method2319(46);
                            client.field386.method2051(var109.length() + 1);
                            client.field386.method2056(var109);
                            continue;
                        }
                        if (var429 == 3106) {
                            var6--;
                            String var110 = field735[var6];
                            client.field386.method2319(120);
                            client.field386.method2051(var110.length() + 1);
                            client.field386.method2056(var110);
                            continue;
                        }
                        if (var429 == 3107) {
                            var5--;
                            int var111 = field734[var5];
                            var6--;
                            String var112 = field735[var6];
                            boolean var113 = false;
                            for (int var114 = 0; var114 < client.field289; var114++) {
                                class3 var115 = client.field445[client.field385[var114]];
                                if (var115 != null && var115.field46 != null && var115.field46.equalsIgnoreCase(var112)) {
                                    if (var111 == 1) {
                                        client.field386.method2319(212);
                                        client.field386.method2220(0);
                                        client.field386.method2097(client.field385[var114]);
                                    } else if (var111 == 4) {
                                        client.field386.method2319(52);
                                        client.field386.method2097(client.field385[var114]);
                                        client.field386.method2192(0);
                                    } else if (var111 == 6) {
                                        client.field386.method2319(84);
                                        client.field386.method2052(client.field385[var114]);
                                        client.field386.method2192(0);
                                    } else if (var111 == 7) {
                                        client.field386.method2319(192);
                                        client.field386.method2052(client.field385[var114]);
                                        client.field386.method2051(0);
                                    }
                                    var113 = true;
                                    break;
                                }
                            }
                            if (!var113) {
                                class10.method1313(4, "", class142.field2290 + var112);
                            }
                            continue;
                        }
                        if (var429 == 3108) {
                            var5 -= 3;
                            int var116 = field734[var5];
                            int var117 = field734[var5 + 1];
                            int var118 = field734[var5 + 2];
                            class152 var119 = class152.method1829(var118);
                            client.method3218(var119, var116, var117);
                            continue;
                        }
                        if (var429 == 3109) {
                            var5 -= 2;
                            int var120 = field734[var5];
                            int var121 = field734[var5 + 1];
                            class152 var122 = var58 ? Statics.field2472 : Statics.field194;
                            client.method3218(var122, var120, var121);
                            continue;
                        }
                        if (var429 == 3110) {
                            var5--;
                            Statics.field1666 = field734[var5] == 1;
                            continue;
                        }
                        if (var429 == 3111) {
                            field734[var5++] = Statics.field92.field148 ? 1 : 0;
                            continue;
                        }
                        if (var429 == 3112) {
                            var5--;
                            Statics.field92.field148 = field734[var5] == 1;
                            class9.method819();
                            continue;
                        }
                        if (var429 == 3113) {
                            var6--;
                            String var123 = field735[var6];
                            var5--;
                            boolean var124 = field734[var5] == 1;
                            class125.method2615(var123, var124, false);
                            continue;
                        }
                    } else if (var429 < 3300) {
                        if (var429 == 3200) {
                            var5 -= 3;
                            client.method2718(field734[var5], field734[var5 + 1], field734[var5 + 2]);
                            continue;
                        }
                        if (var429 == 3201) {
                            var5--;
                            client.method2620(field734[var5]);
                            continue;
                        }
                        if (var429 == 3202) {
                            var5 -= 2;
                            int var125 = field734[var5];
                            int var10000 = field734[var5 + 1];
                            if (client.field496 != 0 && var125 != -1) {
                                class161.method1920(Statics.field56, var125, 0, client.field496, false);
                                client.field498 = true;
                            }
                            continue;
                        }
                    } else if (var429 < 3400) {
                        if (var429 == 3300) {
                            field734[var5++] = client.field318;
                            continue;
                        }
                        if (var429 == 3301) {
                            var5 -= 2;
                            int var127 = field734[var5];
                            int var128 = field734[var5 + 1];
                            field734[var5++] = class14.method2498(var127, var128);
                            continue;
                        }
                        if (var429 == 3302) {
                            var5 -= 2;
                            int var129 = field734[var5];
                            int var130 = field734[var5 + 1];
                            int[] var131 = field734;
                            int var132 = var5++;
                            class14 var133 = (class14) class14.field199.method3092((long) var129);
                            int var134;
                            if (var133 == null) {
                                var134 = 0;
                            } else if (var130 >= 0 && var130 < var133.field200.length) {
                                var134 = var133.field200[var130];
                            } else {
                                var134 = 0;
                            }
                            var131[var132] = var134;
                            continue;
                        }
                        if (var429 == 3303) {
                            var5 -= 2;
                            int var135 = field734[var5];
                            int var136 = field734[var5 + 1];
                            int[] var137 = field734;
                            int var138 = var5++;
                            class14 var139 = (class14) class14.field199.method3092((long) var135);
                            int var140;
                            if (var139 == null) {
                                var140 = 0;
                            } else if (var136 == -1) {
                                var140 = 0;
                            } else {
                                int var141 = 0;
                                for (int var142 = 0; var142 < var139.field200.length; var142++) {
                                    if (var139.field198[var142] == var136) {
                                        var141 += var139.field200[var142];
                                    }
                                }
                                var140 = var141;
                            }
                            var137[var138] = var140;
                            continue;
                        }
                        if (var429 == 3304) {
                            var5--;
                            int var143 = field734[var5];
                            field734[var5++] = class44.method2394(var143).field1017;
                            continue;
                        }
                        if (var429 == 3305) {
                            var5--;
                            int var144 = field734[var5];
                            field734[var5++] = client.field402[var144];
                            continue;
                        }
                        if (var429 == 3306) {
                            var5--;
                            int var145 = field734[var5];
                            field734[var5++] = client.field288[var145];
                            continue;
                        }
                        if (var429 == 3307) {
                            var5--;
                            int var146 = field734[var5];
                            field734[var5++] = client.field404[var146];
                            continue;
                        }
                        if (var429 == 3308) {
                            int var147 = Statics.field1896;
                            int var148 = (Statics.field24.field777 >> 7) + Statics.field1075;
                            int var149 = (Statics.field24.field744 >> 7) + Statics.field1673;
                            field734[var5++] = (var147 << 28) + (var148 << 14) + var149;
                            continue;
                        }
                        if (var429 == 3309) {
                            var5--;
                            int var150 = field734[var5];
                            field734[var5++] = var150 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var429 == 3310) {
                            var5--;
                            int var151 = field734[var5];
                            field734[var5++] = var151 >> 28;
                            continue;
                        }
                        if (var429 == 3311) {
                            var5--;
                            int var152 = field734[var5];
                            field734[var5++] = var152 & 0x3FFF;
                            continue;
                        }
                        if (var429 == 3312) {
                            field734[var5++] = client.field501 ? 1 : 0;
                            continue;
                        }
                        if (var429 == 3313) {
                            var5 -= 2;
                            int var153 = field734[var5] + 32768;
                            int var154 = field734[var5 + 1];
                            field734[var5++] = class14.method2498(var153, var154);
                            continue;
                        }
                        if (var429 == 3314) {
                            var5 -= 2;
                            int var155 = field734[var5] + 32768;
                            int var156 = field734[var5 + 1];
                            int[] var157 = field734;
                            int var158 = var5++;
                            class14 var159 = (class14) class14.field199.method3092((long) var155);
                            int var160;
                            if (var159 == null) {
                                var160 = 0;
                            } else if (var156 >= 0 && var156 < var159.field200.length) {
                                var160 = var159.field200[var156];
                            } else {
                                var160 = 0;
                            }
                            var157[var158] = var160;
                            continue;
                        }
                        if (var429 == 3315) {
                            var5 -= 2;
                            int var161 = field734[var5] + 32768;
                            int var162 = field734[var5 + 1];
                            int[] var163 = field734;
                            int var164 = var5++;
                            class14 var165 = (class14) class14.field199.method3092((long) var161);
                            int var166;
                            if (var165 == null) {
                                var166 = 0;
                            } else if (var162 == -1) {
                                var166 = 0;
                            } else {
                                int var167 = 0;
                                for (int var168 = 0; var168 < var165.field200.length; var168++) {
                                    if (var165.field198[var168] == var162) {
                                        var167 += var165.field200[var168];
                                    }
                                }
                                var166 = var167;
                            }
                            var163[var164] = var166;
                            continue;
                        }
                        if (var429 == 3316) {
                            if (client.field432 >= 2) {
                                field734[var5++] = client.field432;
                            } else {
                                field734[var5++] = 0;
                            }
                            continue;
                        }
                        if (var429 == 3317) {
                            field734[var5++] = client.field283;
                            continue;
                        }
                        if (var429 == 3318) {
                            field734[var5++] = client.field336;
                            continue;
                        }
                        if (var429 == 3321) {
                            field734[var5++] = client.field430;
                            continue;
                        }
                        if (var429 == 3322) {
                            field734[var5++] = client.field431;
                            continue;
                        }
                        if (var429 == 3323) {
                            if (client.field434) {
                                field734[var5++] = 1;
                            } else {
                                field734[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var429 < 3500) {
                        if (var429 == 3400) {
                            var5 -= 2;
                            int var169 = field734[var5];
                            int var170 = field734[var5 + 1];
                            class43 var171 = class43.method125(var169);
                            if (var171.field1002 != 's') {
                            }
                            for (int var172 = 0; var172 < var171.field1005; var172++) {
                                if (var171.field1011[var172] == var170) {
                                    field735[var6++] = var171.field1008[var172];
                                    var171 = null;
                                    break;
                                }
                            }
                            if (var171 != null) {
                                field735[var6++] = var171.field1006;
                            }
                            continue;
                        }
                        if (var429 == 3408) {
                            var5 -= 4;
                            int var173 = field734[var5];
                            int var174 = field734[var5 + 1];
                            int var175 = field734[var5 + 2];
                            int var176 = field734[var5 + 3];
                            class43 var177 = class43.method125(var175);
                            if (var177.field1001 == var173 && var177.field1002 == var174) {
                                for (int var178 = 0; var178 < var177.field1005; var178++) {
                                    if (var177.field1011[var178] == var176) {
                                        if (var174 == 115) {
                                            field735[var6++] = var177.field1008[var178];
                                        } else {
                                            field734[var5++] = var177.field1007[var178];
                                        }
                                        var177 = null;
                                        break;
                                    }
                                }
                                if (var177 != null) {
                                    if (var174 == 115) {
                                        field735[var6++] = var177.field1006;
                                    } else {
                                        field734[var5++] = var177.field1003;
                                    }
                                }
                                continue;
                            }
                            if (var174 == 115) {
                                field735[var6++] = "null";
                            } else {
                                field734[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var429 < 3700) {
                        if (var429 == 3600) {
                            if (client.field292 == 0) {
                                field734[var5++] = -2;
                            } else if (client.field292 == 1) {
                                field734[var5++] = -1;
                            } else {
                                field734[var5++] = client.field513;
                            }
                            continue;
                        }
                        if (var429 == 3601) {
                            var5--;
                            int var179 = field734[var5];
                            if (client.field292 == 2 && var179 < client.field513) {
                                field735[var6++] = client.field515[var179].field246;
                                field735[var6++] = client.field515[var179].field236;
                                continue;
                            }
                            field735[var6++] = "";
                            field735[var6++] = "";
                            continue;
                        }
                        if (var429 == 3602) {
                            var5--;
                            int var180 = field734[var5];
                            if (client.field292 == 2 && var180 < client.field513) {
                                field734[var5++] = client.field515[var180].field232;
                                continue;
                            }
                            field734[var5++] = 0;
                            continue;
                        }
                        if (var429 == 3603) {
                            var5--;
                            int var181 = field734[var5];
                            if (client.field292 == 2 && var181 < client.field513) {
                                field734[var5++] = client.field515[var181].field233;
                                continue;
                            }
                            field734[var5++] = 0;
                            continue;
                        }
                        if (var429 == 3604) {
                            var6--;
                            String var182 = field735[var6];
                            var5--;
                            int var183 = field734[var5];
                            client.method99(var182, var183);
                            continue;
                        }
                        if (var429 == 3605) {
                            var6--;
                            String var184 = field735[var6];
                            if (var184 == null) {
                                continue;
                            }
                            if ((client.field513 < 200 || client.field317 == 1) && client.field513 < 400) {
                                String var185 = class200.method1827(var184, Statics.field270);
                                if (var185 == null) {
                                    continue;
                                }
                                for (int var186 = 0; var186 < client.field513; var186++) {
                                    class16 var187 = client.field515[var186];
                                    String var188 = class200.method1827(var187.field246, Statics.field270);
                                    if (var188 != null && var188.equals(var185)) {
                                        class10.method1313(30, "", var184 + class142.field2143);
                                        continue label2592;
                                    }
                                    if (var187.field236 != null) {
                                        String var189 = class200.method1827(var187.field236, Statics.field270);
                                        if (var189 != null && var189.equals(var185)) {
                                            class10.method1313(30, "", var184 + class142.field2143);
                                            continue label2592;
                                        }
                                    }
                                }
                                for (int var190 = 0; var190 < client.field517; var190++) {
                                    class8 var191 = client.field518[var190];
                                    String var192 = class200.method1827(var191.field129, Statics.field270);
                                    if (var192 != null && var192.equals(var185)) {
                                        class10.method1313(30, "", class142.field2255 + var184 + class142.field2170);
                                        continue label2592;
                                    }
                                    if (var191.field133 != null) {
                                        String var193 = class200.method1827(var191.field133, Statics.field270);
                                        if (var193 != null && var193.equals(var185)) {
                                            class10.method1313(30, "", class142.field2255 + var184 + class142.field2170);
                                            continue label2592;
                                        }
                                    }
                                }
                                if (class200.method1827(Statics.field24.field46, Statics.field270).equals(var185)) {
                                    class10.method1313(30, "", class142.field2235);
                                } else {
                                    client.field386.method2319(95);
                                    client.field386.method2051(Statics.method830(var184));
                                    client.field386.method2056(var184);
                                }
                                continue;
                            }
                            class10.method1313(30, "", class142.field2282);
                            continue;
                        }
                        if (var429 == 3606) {
                            var6--;
                            String var194 = field735[var6];
                            if (var194 == null) {
                                continue;
                            }
                            String var195 = class200.method1827(var194, Statics.field270);
                            if (var195 == null) {
                                continue;
                            }
                            int var196 = 0;
                            while (true) {
                                if (var196 >= client.field513) {
                                    continue label2592;
                                }
                                class16 var197 = client.field515[var196];
                                String var198 = var197.field246;
                                String var199 = class200.method1827(var198, Statics.field270);
                                boolean var200;
                                if (var194 == null || var198 == null) {
                                    var200 = false;
                                } else if (var194.startsWith("#") || var198.startsWith("#")) {
                                    var200 = var194.equals(var198);
                                } else {
                                    var200 = var195.equals(var199);
                                }
                                if (var200) {
                                    client.field513--;
                                    for (int var201 = var196; var201 < client.field513; var201++) {
                                        client.field515[var201] = client.field515[var201 + 1];
                                    }
                                    client.field457 = client.field449;
                                    client.field386.method2319(5);
                                    client.field386.method2051(Statics.method830(var194));
                                    client.field386.method2056(var194);
                                    continue label2592;
                                }
                                var196++;
                            }
                        }
                        if (var429 == 3607) {
                            var6--;
                            String var202 = field735[var6];
                            if (var202 == null) {
                                continue;
                            }
                            if ((client.field517 < 100 || client.field317 == 1) && client.field517 < 400) {
                                String var203 = class200.method1827(var202, Statics.field270);
                                if (var203 == null) {
                                    continue;
                                }
                                for (int var204 = 0; var204 < client.field517; var204++) {
                                    class8 var205 = client.field518[var204];
                                    String var206 = class200.method1827(var205.field129, Statics.field270);
                                    if (var206 != null && var206.equals(var203)) {
                                        class10.method1313(31, "", var202 + class142.field2310);
                                        continue label2592;
                                    }
                                    if (var205.field133 != null) {
                                        String var207 = class200.method1827(var205.field133, Statics.field270);
                                        if (var207 != null && var207.equals(var203)) {
                                            class10.method1313(31, "", var202 + class142.field2310);
                                            continue label2592;
                                        }
                                    }
                                }
                                for (int var208 = 0; var208 < client.field513; var208++) {
                                    class16 var209 = client.field515[var208];
                                    String var210 = class200.method1827(var209.field246, Statics.field270);
                                    if (var210 != null && var210.equals(var203)) {
                                        class10.method1313(31, "", class142.field2186 + var202 + class142.field2316);
                                        continue label2592;
                                    }
                                    if (var209.field236 != null) {
                                        String var211 = class200.method1827(var209.field236, Statics.field270);
                                        if (var211 != null && var211.equals(var203)) {
                                            class10.method1313(31, "", class142.field2186 + var202 + class142.field2316);
                                            continue label2592;
                                        }
                                    }
                                }
                                if (class200.method1827(Statics.field24.field46, Statics.field270).equals(var203)) {
                                    class10.method1313(31, "", class142.field2312);
                                } else {
                                    client.field386.method2319(213);
                                    client.field386.method2051(Statics.method830(var202));
                                    client.field386.method2056(var202);
                                }
                                continue;
                            }
                            class10.method1313(31, "", class142.field2309);
                            continue;
                        }
                        if (var429 == 3608) {
                            var6--;
                            String var212 = field735[var6];
                            client.method2366(var212);
                            continue;
                        }
                        if (var429 == 3609) {
                            var6--;
                            String var213 = field735[var6];
                            if (var213.startsWith(class2.method2502(0)) || var213.startsWith(class2.method2502(1))) {
                                var213 = var213.substring(7);
                            }
                            field734[var5++] = client.method673(var213, false) ? 1 : 0;
                            continue;
                        }
                        if (var429 == 3611) {
                            if (client.field523 == null) {
                                field735[var6++] = "";
                                continue;
                            }
                            String[] var214 = field735;
                            int var215 = var6++;
                            String var216 = client.field523;
                            long var217 = 0L;
                            int var219 = var216.length();
                            for (int var220 = 0; var220 < var219; var220++) {
                                var217 *= 37L;
                                char var221 = var216.charAt(var220);
                                if (var221 >= 'A' && var221 <= 'Z') {
                                    var217 += (long) (var221 + 1 - 65);
                                } else if (var221 >= 'a' && var221 <= 'z') {
                                    var217 += (long) (var221 + 1 - 97);
                                } else if (var221 >= '0' && var221 <= '9') {
                                    var217 += (long) (var221 + 27 - 48);
                                }
                                if (var217 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var217 % 37L == 0L && var217 != 0L) {
                                var217 /= 37L;
                            }
                            String var224 = class198.method824(var217);
                            if (var224 == null) {
                                var224 = "";
                            }
                            var214[var215] = var224;
                            continue;
                        }
                        if (var429 == 3612) {
                            if (client.field523 == null) {
                                field734[var5++] = 0;
                            } else {
                                field734[var5++] = Statics.field584;
                            }
                            continue;
                        }
                        if (var429 == 3613) {
                            var5--;
                            int var226 = field734[var5];
                            if (client.field523 != null && var226 < Statics.field584) {
                                field735[var6++] = Statics.field533[var226].field570;
                                continue;
                            }
                            field735[var6++] = "";
                            continue;
                        }
                        if (var429 == 3614) {
                            var5--;
                            int var227 = field734[var5];
                            if (client.field523 != null && var227 < Statics.field584) {
                                field734[var5++] = Statics.field533[var227].field575;
                                continue;
                            }
                            field734[var5++] = 0;
                            continue;
                        }
                        if (var429 == 3615) {
                            var5--;
                            int var228 = field734[var5];
                            if (client.field523 != null && var228 < Statics.field584) {
                                field734[var5++] = Statics.field533[var228].field572;
                                continue;
                            }
                            field734[var5++] = 0;
                            continue;
                        }
                        if (var429 == 3616) {
                            field734[var5++] = Statics.field2888;
                            continue;
                        }
                        if (var429 == 3617) {
                            var6--;
                            String var229 = field735[var6];
                            client.method489(var229);
                            continue;
                        }
                        if (var429 == 3618) {
                            field734[var5++] = Statics.field579;
                            continue;
                        }
                        if (var429 == 3619) {
                            var6--;
                            String var230 = field735[var6];
                            client.method1909(var230);
                            continue;
                        }
                        if (var429 == 3620) {
                            client.method66();
                            continue;
                        }
                        if (var429 == 3621) {
                            if (client.field292 == 0) {
                                field734[var5++] = -1;
                            } else {
                                field734[var5++] = client.field517;
                            }
                            continue;
                        }
                        if (var429 == 3622) {
                            var5--;
                            int var231 = field734[var5];
                            if (client.field292 != 0 && var231 < client.field517) {
                                field735[var6++] = client.field518[var231].field129;
                                field735[var6++] = client.field518[var231].field133;
                                continue;
                            }
                            field735[var6++] = "";
                            field735[var6++] = "";
                            continue;
                        }
                        if (var429 == 3623) {
                            var6--;
                            String var232 = field735[var6];
                            if (var232.startsWith(class2.method2502(0)) || var232.startsWith(class2.method2502(1))) {
                                var232 = var232.substring(7);
                            }
                            field734[var5++] = client.method1828(var232) ? 1 : 0;
                            continue;
                        }
                        if (var429 == 3624) {
                            var5--;
                            int var233 = field734[var5];
                            if (Statics.field533 != null && var233 < Statics.field584 && Statics.field533[var233].field570.equalsIgnoreCase(Statics.field24.field46)) {
                                field734[var5++] = 1;
                                continue;
                            }
                            field734[var5++] = 0;
                            continue;
                        }
                        if (var429 == 3625) {
                            if (client.field487 == null) {
                                field735[var6++] = "";
                                continue;
                            }
                            String[] var234 = field735;
                            int var235 = var6++;
                            String var236 = client.field487;
                            long var237 = 0L;
                            int var239 = var236.length();
                            for (int var240 = 0; var240 < var239; var240++) {
                                var237 *= 37L;
                                char var241 = var236.charAt(var240);
                                if (var241 >= 'A' && var241 <= 'Z') {
                                    var237 += (long) (var241 + 1 - 65);
                                } else if (var241 >= 'a' && var241 <= 'z') {
                                    var237 += (long) (var241 + 1 - 97);
                                } else if (var241 >= '0' && var241 <= '9') {
                                    var237 += (long) (var241 + 27 - 48);
                                }
                                if (var237 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var237 % 37L == 0L && var237 != 0L) {
                                var237 /= 37L;
                            }
                            String var244 = class198.method824(var237);
                            if (var244 == null) {
                                var244 = "";
                            }
                            var234[var235] = var244;
                            continue;
                        }
                    } else if (var429 < 4100) {
                        if (var429 == 4000) {
                            var5 -= 2;
                            int var246 = field734[var5];
                            int var247 = field734[var5 + 1];
                            field734[var5++] = var246 + var247;
                            continue;
                        }
                        if (var429 == 4001) {
                            var5 -= 2;
                            int var248 = field734[var5];
                            int var249 = field734[var5 + 1];
                            field734[var5++] = var248 - var249;
                            continue;
                        }
                        if (var429 == 4002) {
                            var5 -= 2;
                            int var250 = field734[var5];
                            int var251 = field734[var5 + 1];
                            field734[var5++] = var250 * var251;
                            continue;
                        }
                        if (var429 == 4003) {
                            var5 -= 2;
                            int var252 = field734[var5];
                            int var253 = field734[var5 + 1];
                            field734[var5++] = var252 / var253;
                            continue;
                        }
                        if (var429 == 4004) {
                            var5--;
                            int var254 = field734[var5];
                            field734[var5++] = (int) (Math.random() * (double) var254);
                            continue;
                        }
                        if (var429 == 4005) {
                            var5--;
                            int var255 = field734[var5];
                            field734[var5++] = (int) (Math.random() * (double) (var255 + 1));
                            continue;
                        }
                        if (var429 == 4006) {
                            var5 -= 5;
                            int var256 = field734[var5];
                            int var257 = field734[var5 + 1];
                            int var258 = field734[var5 + 2];
                            int var259 = field734[var5 + 3];
                            int var260 = field734[var5 + 4];
                            field734[var5++] = (var257 - var256) * (var260 - var258) / (var259 - var258) + var256;
                            continue;
                        }
                        if (var429 == 4007) {
                            var5 -= 2;
                            int var261 = field734[var5];
                            int var262 = field734[var5 + 1];
                            field734[var5++] = var261 * var262 / 100 + var261;
                            continue;
                        }
                        if (var429 == 4008) {
                            var5 -= 2;
                            int var263 = field734[var5];
                            int var264 = field734[var5 + 1];
                            field734[var5++] = var263 | 0x1 << var264;
                            continue;
                        }
                        if (var429 == 4009) {
                            var5 -= 2;
                            int var265 = field734[var5];
                            int var266 = field734[var5 + 1];
                            field734[var5++] = var265 & -1 - (0x1 << var266);
                            continue;
                        }
                        if (var429 == 4010) {
                            var5 -= 2;
                            int var267 = field734[var5];
                            int var268 = field734[var5 + 1];
                            field734[var5++] = (var267 & 0x1 << var268) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var429 == 4011) {
                            var5 -= 2;
                            int var269 = field734[var5];
                            int var270 = field734[var5 + 1];
                            field734[var5++] = var269 % var270;
                            continue;
                        }
                        if (var429 == 4012) {
                            var5 -= 2;
                            int var271 = field734[var5];
                            int var272 = field734[var5 + 1];
                            if (var271 == 0) {
                                field734[var5++] = 0;
                            } else {
                                field734[var5++] = (int) Math.pow((double) var271, (double) var272);
                            }
                            continue;
                        }
                        if (var429 == 4013) {
                            var5 -= 2;
                            int var273 = field734[var5];
                            int var274 = field734[var5 + 1];
                            if (var273 == 0) {
                                field734[var5++] = 0;
                            } else if (var274 == 0) {
                                field734[var5++] = Integer.MAX_VALUE;
                            } else {
                                field734[var5++] = (int) Math.pow((double) var273, 1.0D / (double) var274);
                            }
                            continue;
                        }
                        if (var429 == 4014) {
                            var5 -= 2;
                            int var275 = field734[var5];
                            int var276 = field734[var5 + 1];
                            field734[var5++] = var275 & var276;
                            continue;
                        }
                        if (var429 == 4015) {
                            var5 -= 2;
                            int var277 = field734[var5];
                            int var278 = field734[var5 + 1];
                            field734[var5++] = var277 | var278;
                            continue;
                        }
                    } else if (var429 < 4200) {
                        if (var429 == 4100) {
                            var6--;
                            String var279 = field735[var6];
                            var5--;
                            int var280 = field734[var5];
                            field735[var6++] = var279 + var280;
                            continue;
                        }
                        if (var429 == 4101) {
                            var6 -= 2;
                            String var281 = field735[var6];
                            String var282 = field735[var6 + 1];
                            field735[var6++] = var281 + var282;
                            continue;
                        }
                        if (var429 == 4102) {
                            var6--;
                            String var283 = field735[var6];
                            var5--;
                            int var284 = field734[var5];
                            String[] var285 = field735;
                            int var286 = var6++;
                            String var288;
                            if (var284 < 0) {
                                var288 = Integer.toString(var284);
                            } else {
                                int var289 = var284;
                                String var290;
                                if (var284 < 0) {
                                    var290 = Integer.toString(var284, 10);
                                } else {
                                    int var291 = 2;
                                    int var292 = var284 / 10;
                                    while (var292 != 0) {
                                        var292 /= 10;
                                        var291++;
                                    }
                                    char[] var293 = new char[var291];
                                    var293[0] = '+';
                                    for (int var294 = var291 - 1; var294 > 0; var294--) {
                                        int var295 = var289;
                                        var289 /= 10;
                                        int var296 = var295 - var289 * 10;
                                        if (var296 >= 10) {
                                            var293[var294] = (char) (var296 + 87);
                                        } else {
                                            var293[var294] = (char) (var296 + 48);
                                        }
                                    }
                                    var290 = new String(var293);
                                }
                                var288 = var290;
                            }
                            var285[var286] = var283 + var288;
                            continue;
                        }
                        if (var429 == 4103) {
                            var6--;
                            String var297 = field735[var6];
                            field735[var6++] = var297.toLowerCase();
                            continue;
                        }
                        if (var429 == 4104) {
                            var5--;
                            int var298 = field734[var5];
                            long var299 = ((long) var298 + 11745L) * 86400000L;
                            field729.setTime(new Date(var299));
                            int var301 = field729.get(5);
                            int var302 = field729.get(2);
                            int var303 = field729.get(1);
                            field735[var6++] = var301 + "-" + field739[var302] + "-" + var303;
                            continue;
                        }
                        if (var429 == 4105) {
                            var6 -= 2;
                            String var304 = field735[var6];
                            String var305 = field735[var6 + 1];
                            if (Statics.field24.field33 != null && Statics.field24.field33.field2661) {
                                field735[var6++] = var305;
                                continue;
                            }
                            field735[var6++] = var304;
                            continue;
                        }
                        if (var429 == 4106) {
                            var5--;
                            int var306 = field734[var5];
                            field735[var6++] = Integer.toString(var306);
                            continue;
                        }
                        if (var429 == 4107) {
                            var6 -= 2;
                            int[] var307 = field734;
                            int var308 = var5++;
                            String var309 = field735[var6];
                            String var310 = field735[var6 + 1];
                            int var311 = client.field273;
                            int var312 = var309.length();
                            int var313 = var310.length();
                            int var314 = 0;
                            int var315 = 0;
                            char var316 = 0;
                            char var317 = 0;
                            int var318;
                            label2455: while (true) {
                                if (var314 - var316 >= var312 && var315 - var317 >= var313) {
                                    int var327 = Math.min(var312, var313);
                                    for (int var328 = 0; var328 < var327; var328++) {
                                        char var331 = var309.charAt(var328);
                                        char var332 = var310.charAt(var328);
                                        if (var331 != var332 && Character.toUpperCase(var331) != Character.toUpperCase(var332)) {
                                            char var333 = Character.toLowerCase(var331);
                                            char var334 = Character.toLowerCase(var332);
                                            if (var333 != var334) {
                                                var318 = class202.method1810(var333, var311) - class202.method1810(var334, var311);
                                                break label2455;
                                            }
                                        }
                                    }
                                    int var335 = var312 - var313;
                                    if (var335 == 0) {
                                        for (int var336 = 0; var336 < var327; var336++) {
                                            char var337 = var309.charAt(var336);
                                            char var338 = var310.charAt(var336);
                                            if (var337 != var338) {
                                                var318 = class202.method1810(var337, var311) - class202.method1810(var338, var311);
                                                break label2455;
                                            }
                                        }
                                        var318 = 0;
                                    } else {
                                        var318 = var335;
                                    }
                                    break;
                                }
                                if (var314 - var316 >= var312) {
                                    var318 = -1;
                                    break;
                                }
                                if (var315 - var317 >= var313) {
                                    var318 = 1;
                                    break;
                                }
                                char var319;
                                if (var316 == 0) {
                                    var319 = var309.charAt(var314++);
                                } else {
                                    var319 = var316;
                                    boolean var320 = false;
                                }
                                char var321;
                                if (var317 == 0) {
                                    var321 = var310.charAt(var315++);
                                } else {
                                    var321 = var317;
                                    boolean var322 = false;
                                }
                                var316 = class202.method2825(var319);
                                var317 = class202.method2825(var321);
                                char var323 = class202.method2636(var319, var311);
                                char var324 = class202.method2636(var321, var311);
                                if (var323 != var324 && Character.toUpperCase(var323) != Character.toUpperCase(var324)) {
                                    char var325 = Character.toLowerCase(var323);
                                    char var326 = Character.toLowerCase(var324);
                                    if (var325 != var326) {
                                        var318 = class202.method1810(var325, var311) - class202.method1810(var326, var311);
                                        break;
                                    }
                                }
                            }
                            var307[var308] = class199.method1385(var318);
                            continue;
                        }
                        if (var429 == 4108) {
                            var6--;
                            String var339 = field735[var6];
                            var5 -= 2;
                            int var340 = field734[var5];
                            int var341 = field734[var5 + 1];
                            byte[] var342 = Statics.field605.method2709(var341, 0);
                            class193 var343 = new class193(var342);
                            field734[var5++] = var343.method3259(var339, var340);
                            continue;
                        }
                        if (var429 == 4109) {
                            var6--;
                            String var344 = field735[var6];
                            var5 -= 2;
                            int var345 = field734[var5];
                            int var346 = field734[var5 + 1];
                            byte[] var347 = Statics.field605.method2709(var346, 0);
                            class193 var348 = new class193(var347);
                            field734[var5++] = var348.method3326(var344, var345);
                            continue;
                        }
                        if (var429 == 4110) {
                            var6 -= 2;
                            String var349 = field735[var6];
                            String var350 = field735[var6 + 1];
                            var5--;
                            if (field734[var5] == 1) {
                                field735[var6++] = var349;
                            } else {
                                field735[var6++] = var350;
                            }
                            continue;
                        }
                        if (var429 == 4111) {
                            var6--;
                            String var351 = field735[var6];
                            field735[var6++] = class192.method3280(var351);
                            continue;
                        }
                        if (var429 == 4112) {
                            var6--;
                            String var352 = field735[var6];
                            var5--;
                            int var353 = field734[var5];
                            field735[var6++] = var352 + (char) var353;
                            continue;
                        }
                        if (var429 == 4113) {
                            var5--;
                            int var354 = field734[var5];
                            field734[var5++] = class199.method2501((char) var354) ? 1 : 0;
                            continue;
                        }
                        if (var429 == 4114) {
                            var5--;
                            int var355 = field734[var5];
                            field734[var5++] = class199.method64((char) var355) ? 1 : 0;
                            continue;
                        }
                        if (var429 == 4115) {
                            var5--;
                            int var356 = field734[var5];
                            field734[var5++] = class199.method2870((char) var356) ? 1 : 0;
                            continue;
                        }
                        if (var429 == 4116) {
                            var5--;
                            int var357 = field734[var5];
                            int[] var358 = field734;
                            int var359 = var5++;
                            char var360 = (char) var357;
                            boolean var361 = var360 >= '0' && var360 <= '9';
                            var358[var359] = var361 ? 1 : 0;
                            continue;
                        }
                        if (var429 == 4117) {
                            var6--;
                            String var362 = field735[var6];
                            if (var362 == null) {
                                field734[var5++] = 0;
                            } else {
                                field734[var5++] = var362.length();
                            }
                            continue;
                        }
                        if (var429 == 4118) {
                            var6--;
                            String var363 = field735[var6];
                            var5 -= 2;
                            int var364 = field734[var5];
                            int var365 = field734[var5 + 1];
                            field735[var6++] = var363.substring(var364, var365);
                            continue;
                        }
                        if (var429 == 4119) {
                            var6--;
                            String var366 = field735[var6];
                            StringBuilder var367 = new StringBuilder(var366.length());
                            boolean var368 = false;
                            for (int var369 = 0; var369 < var366.length(); var369++) {
                                char var370 = var366.charAt(var369);
                                if (var370 == '<') {
                                    var368 = true;
                                } else if (var370 == '>') {
                                    var368 = false;
                                } else if (!var368) {
                                    var367.append(var370);
                                }
                            }
                            field735[var6++] = var367.toString();
                            continue;
                        }
                        if (var429 == 4120) {
                            var6--;
                            String var371 = field735[var6];
                            var5--;
                            int var372 = field734[var5];
                            field734[var5++] = var371.indexOf(var372);
                            continue;
                        }
                        if (var429 == 4121) {
                            var6 -= 2;
                            String var373 = field735[var6];
                            String var374 = field735[var6 + 1];
                            var5--;
                            int var375 = field734[var5];
                            field734[var5++] = var373.indexOf(var374, var375);
                            continue;
                        }
                    } else if (var429 < 4300) {
                        if (var429 == 4200) {
                            var5--;
                            int var376 = field734[var5];
                            field735[var6++] = class45.method1729(var376).field1022;
                            continue;
                        }
                        if (var429 == 4201) {
                            var5 -= 2;
                            int var377 = field734[var5];
                            int var378 = field734[var5 + 1];
                            class45 var379 = class45.method1729(var377);
                            if (var378 >= 1 && var378 <= 5 && var379.field1044[var378 - 1] != null) {
                                field735[var6++] = var379.field1044[var378 - 1];
                                continue;
                            }
                            field735[var6++] = "";
                            continue;
                        }
                        if (var429 == 4202) {
                            var5 -= 2;
                            int var380 = field734[var5];
                            int var381 = field734[var5 + 1];
                            class45 var382 = class45.method1729(var380);
                            if (var381 >= 1 && var381 <= 5 && var382.field1045[var381 - 1] != null) {
                                field735[var6++] = var382.field1045[var381 - 1];
                                continue;
                            }
                            field735[var6++] = "";
                            continue;
                        }
                        if (var429 == 4203) {
                            var5--;
                            int var383 = field734[var5];
                            field734[var5++] = class45.method1729(var383).field1042;
                            continue;
                        }
                        if (var429 == 4204) {
                            var5--;
                            int var384 = field734[var5];
                            field734[var5++] = class45.method1729(var384).field1043 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var429 == 4205) {
                            var5--;
                            int var385 = field734[var5];
                            class45 var386 = class45.method1729(var385);
                            if (var386.field1061 == -1 && var386.field1060 >= 0) {
                                field734[var5++] = var386.field1060;
                                continue;
                            }
                            field734[var5++] = var385;
                            continue;
                        }
                        if (var429 == 4206) {
                            var5--;
                            int var387 = field734[var5];
                            class45 var388 = class45.method1729(var387);
                            if (var388.field1061 >= 0 && var388.field1060 >= 0) {
                                field734[var5++] = var388.field1060;
                                continue;
                            }
                            field734[var5++] = var387;
                            continue;
                        }
                        if (var429 == 4207) {
                            var5--;
                            int var389 = field734[var5];
                            field734[var5++] = class45.method1729(var389).field1058 ? 1 : 0;
                            continue;
                        }
                    } else if (var429 < 5100) {
                        if (var429 == 5000) {
                            field734[var5++] = client.field478;
                            continue;
                        }
                        if (var429 == 5001) {
                            var5 -= 3;
                            client.field478 = field734[var5];
                            Statics.field182 = class117.method3(field734[var5 + 1]);
                            if (Statics.field182 == null) {
                                Statics.field182 = class117.field1904;
                            }
                            client.field479 = field734[var5 + 2];
                            client.field386.method2319(63);
                            client.field386.method2051(client.field478);
                            client.field386.method2051(Statics.field182.field1907);
                            client.field386.method2051(client.field479);
                            continue;
                        }
                        if (var429 == 5002) {
                            var6--;
                            String var390 = field735[var6];
                            var5 -= 2;
                            int var391 = field734[var5];
                            int var392 = field734[var5 + 1];
                            client.field386.method2319(195);
                            client.field386.method2051(Statics.method830(var390) + 2);
                            client.field386.method2056(var390);
                            client.field386.method2051(var391 - 1);
                            client.field386.method2051(var392);
                            continue;
                        }
                        if (var429 == 5003) {
                            var5 -= 2;
                            int var393 = field734[var5];
                            int var394 = field734[var5 + 1];
                            class24 var395 = (class24) class10.field156.get(var393);
                            class31 var396 = var395.method508(var394);
                            if (var396 == null) {
                                field734[var5++] = -1;
                                field734[var5++] = 0;
                                field735[var6++] = "";
                                field735[var6++] = "";
                                field735[var6++] = "";
                            } else {
                                field734[var5++] = var396.field727;
                                field734[var5++] = var396.field717;
                                field735[var6++] = var396.field719 == null ? "" : var396.field719;
                                field735[var6++] = var396.field723 == null ? "" : var396.field723;
                                field735[var6++] = var396.field721 == null ? "" : var396.field721;
                            }
                            continue;
                        }
                        if (var429 == 5004) {
                            var5--;
                            int var398 = field734[var5];
                            class31 var399 = class10.method2331(var398);
                            if (var399 == null) {
                                field734[var5++] = -1;
                                field734[var5++] = 0;
                                field735[var6++] = "";
                                field735[var6++] = "";
                                field735[var6++] = "";
                            } else {
                                field734[var5++] = var399.field718;
                                field734[var5++] = var399.field717;
                                field735[var6++] = var399.field719 == null ? "" : var399.field719;
                                field735[var6++] = var399.field723 == null ? "" : var399.field723;
                                field735[var6++] = var399.field721 == null ? "" : var399.field721;
                            }
                            continue;
                        }
                        if (var429 == 5005) {
                            if (Statics.field182 == null) {
                                field734[var5++] = -1;
                            } else {
                                field734[var5++] = Statics.field182.field1907;
                            }
                            continue;
                        }
                        if (var429 == 5008) {
                            var6--;
                            String var400 = field735[var6];
                            var5--;
                            int var401 = field734[var5];
                            String var402 = var400.toLowerCase();
                            byte var403 = 0;
                            if (var402.startsWith(class142.field2317)) {
                                var403 = 0;
                                var400 = var400.substring(class142.field2317.length());
                            } else if (var402.startsWith(class142.field2355)) {
                                var403 = 1;
                                var400 = var400.substring(class142.field2355.length());
                            } else if (var402.startsWith(class142.field2384)) {
                                var403 = 2;
                                var400 = var400.substring(class142.field2384.length());
                            } else if (var402.startsWith(class142.field2263)) {
                                var403 = 3;
                                var400 = var400.substring(class142.field2263.length());
                            } else if (var402.startsWith(class142.field2325)) {
                                var403 = 4;
                                var400 = var400.substring(class142.field2325.length());
                            } else if (var402.startsWith(class142.field2327)) {
                                var403 = 5;
                                var400 = var400.substring(class142.field2327.length());
                            } else if (var402.startsWith(class142.field2329)) {
                                var403 = 6;
                                var400 = var400.substring(class142.field2329.length());
                            } else if (var402.startsWith(class142.field2331)) {
                                var403 = 7;
                                var400 = var400.substring(class142.field2331.length());
                            } else if (var402.startsWith(class142.field2333)) {
                                var403 = 8;
                                var400 = var400.substring(class142.field2333.length());
                            } else if (var402.startsWith(class142.field2353)) {
                                var403 = 9;
                                var400 = var400.substring(class142.field2353.length());
                            } else if (var402.startsWith(class142.field2337)) {
                                var403 = 10;
                                var400 = var400.substring(class142.field2337.length());
                            } else if (var402.startsWith(class142.field2339)) {
                                var403 = 11;
                                var400 = var400.substring(class142.field2339.length());
                            } else if (client.field273 != 0) {
                                if (var402.startsWith(class142.field2318)) {
                                    var403 = 0;
                                    var400 = var400.substring(class142.field2318.length());
                                } else if (var402.startsWith(class142.field2320)) {
                                    var403 = 1;
                                    var400 = var400.substring(class142.field2320.length());
                                } else if (var402.startsWith(class142.field2322)) {
                                    var403 = 2;
                                    var400 = var400.substring(class142.field2322.length());
                                } else if (var402.startsWith(class142.field2324)) {
                                    var403 = 3;
                                    var400 = var400.substring(class142.field2324.length());
                                } else if (var402.startsWith(class142.field2326)) {
                                    var403 = 4;
                                    var400 = var400.substring(class142.field2326.length());
                                } else if (var402.startsWith(class142.field2328)) {
                                    var403 = 5;
                                    var400 = var400.substring(class142.field2328.length());
                                } else if (var402.startsWith(class142.field2330)) {
                                    var403 = 6;
                                    var400 = var400.substring(class142.field2330.length());
                                } else if (var402.startsWith(class142.field2332)) {
                                    var403 = 7;
                                    var400 = var400.substring(class142.field2332.length());
                                } else if (var402.startsWith(class142.field2334)) {
                                    var403 = 8;
                                    var400 = var400.substring(class142.field2334.length());
                                } else if (var402.startsWith(class142.field2336)) {
                                    var403 = 9;
                                    var400 = var400.substring(class142.field2336.length());
                                } else if (var402.startsWith(class142.field2338)) {
                                    var403 = 10;
                                    var400 = var400.substring(class142.field2338.length());
                                } else if (var402.startsWith(class142.field2340)) {
                                    var403 = 11;
                                    var400 = var400.substring(class142.field2340.length());
                                }
                            }
                            String var404 = var400.toLowerCase();
                            byte var405 = 0;
                            if (var404.startsWith(class142.field2341)) {
                                var405 = 1;
                                var400 = var400.substring(class142.field2341.length());
                            } else if (var404.startsWith(class142.field2343)) {
                                var405 = 2;
                                var400 = var400.substring(class142.field2343.length());
                            } else if (var404.startsWith(class142.field2345)) {
                                var405 = 3;
                                var400 = var400.substring(class142.field2345.length());
                            } else if (var404.startsWith(class142.field2307)) {
                                var405 = 4;
                                var400 = var400.substring(class142.field2307.length());
                            } else if (var404.startsWith(class142.field2349)) {
                                var405 = 5;
                                var400 = var400.substring(class142.field2349.length());
                            } else if (client.field273 != 0) {
                                if (var404.startsWith(class142.field2342)) {
                                    var405 = 1;
                                    var400 = var400.substring(class142.field2342.length());
                                } else if (var404.startsWith(class142.field2344)) {
                                    var405 = 2;
                                    var400 = var400.substring(class142.field2344.length());
                                } else if (var404.startsWith(class142.field2346)) {
                                    var405 = 3;
                                    var400 = var400.substring(class142.field2346.length());
                                } else if (var404.startsWith(class142.field2348)) {
                                    var405 = 4;
                                    var400 = var400.substring(class142.field2348.length());
                                } else if (var404.startsWith(class142.field2180)) {
                                    var405 = 5;
                                    var400 = var400.substring(class142.field2180.length());
                                }
                            }
                            client.field386.method2319(251);
                            client.field386.method2051(0);
                            int var406 = client.field386.field1841;
                            client.field386.method2051(var401);
                            client.field386.method2051(var403);
                            client.field386.method2051(var405);
                            class191.method2767(client.field386, var400);
                            client.field386.method2093(client.field386.field1841 - var406);
                            continue;
                        }
                        if (var429 == 5009) {
                            var6 -= 2;
                            String var407 = field735[var6];
                            String var408 = field735[var6 + 1];
                            client.field386.method2319(189);
                            client.field386.method2052(0);
                            int var409 = client.field386.field1841;
                            client.field386.method2056(var407);
                            class191.method2767(client.field386, var408);
                            client.field386.method2154(client.field386.field1841 - var409);
                            continue;
                        }
                        if (var429 == 5015) {
                            String var410;
                            if (Statics.field24 == null || Statics.field24.field46 == null) {
                                var410 = "";
                            } else {
                                var410 = Statics.field24.field46;
                            }
                            field735[var6++] = var410;
                            continue;
                        }
                        if (var429 == 5016) {
                            field734[var5++] = client.field479;
                            continue;
                        }
                        if (var429 == 5017) {
                            var5--;
                            int var411 = field734[var5];
                            field734[var5++] = class10.method117(var411);
                            continue;
                        }
                        if (var429 == 5018) {
                            var5--;
                            int var412 = field734[var5];
                            int[] var413 = field734;
                            int var414 = var5++;
                            class31 var415 = (class31) class10.field154.method3109((long) var412);
                            int var416;
                            if (var415 == null) {
                                var416 = -1;
                            } else if (class10.field152.field2858 == var415.field2862) {
                                var416 = -1;
                            } else {
                                var416 = ((class31) var415.field2862).field727;
                            }
                            var413[var414] = var416;
                            continue;
                        }
                        if (var429 == 5019) {
                            var5--;
                            int var417 = field734[var5];
                            int[] var418 = field734;
                            int var419 = var5++;
                            class31 var420 = (class31) class10.field154.method3109((long) var417);
                            int var421;
                            if (var420 == null) {
                                var421 = -1;
                            } else if (class10.field152.field2858 == var420.field2863) {
                                var421 = -1;
                            } else {
                                var421 = ((class31) var420.field2863).field727;
                            }
                            var418[var419] = var421;
                            continue;
                        }
                        if (var429 == 5020) {
                            var6--;
                            String var422 = field735[var6];
                            client.method17(var422);
                            continue;
                        }
                    }
                } else {
                    class152 var81;
                    if (var429 >= 2000) {
                        var429 -= 1000;
                        var5--;
                        var81 = class152.method1829(field734[var5]);
                    } else {
                        var81 = var58 ? Statics.field2472 : Statics.field194;
                    }
                    if (var429 == 1300) {
                        var5--;
                        int var82 = field734[var5] - 1;
                        if (var82 >= 0 && var82 <= 9) {
                            var6--;
                            var81.method2778(var82, field735[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var429 == 1301) {
                        var5 -= 2;
                        int var83 = field734[var5];
                        int var84 = field734[var5 + 1];
                        var81.field2562 = class152.method1320(var83, var84);
                        continue;
                    }
                    if (var429 == 1302) {
                        var5--;
                        var81.field2586 = field734[var5] == 1;
                        continue;
                    }
                    if (var429 == 1303) {
                        var5--;
                        var81.field2584 = field734[var5];
                        continue;
                    }
                    if (var429 == 1304) {
                        var5--;
                        var81.field2585 = field734[var5];
                        continue;
                    }
                    if (var429 == 1305) {
                        var6--;
                        var81.field2554 = field735[var6];
                        continue;
                    }
                    if (var429 == 1306) {
                        var6--;
                        var81.field2587 = field735[var6];
                        continue;
                    }
                    if (var429 == 1307) {
                        var81.field2618 = null;
                        continue;
                    }
                }
                if (var429 >= 5600 || var429 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var423 = field734[var5];
                int var424 = field734[var5 + 1];
                if (!client.field488) {
                    client.field499 = var423;
                    client.field348 = var424;
                }
            }
        } catch (Exception var428) {
            StringBuilder var426 = new StringBuilder(30);
            var426.append("").append(var4.field2874).append(" ");
            for (int var427 = field736 - 1; var427 >= 0; var427--) {
                var426.append("").append(field738[var427].field192.field2874).append(" ");
            }
            var426.append("").append(var10);
            class135.method1996(var426.toString(), var428);
        }
    }

    @ObfuscatedName("ao.o(IB)V")
    public static void method579(int arg0) {
        if (arg0 == -1 || !class152.method2621(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2639[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3.field2589 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field9 = var3.field2589;
                method701(var4, 2000000);
            }
        }
    }
}
