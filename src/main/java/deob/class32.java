package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("af")
public class class32 {

    @ObfuscatedName("af.q")
    public static int[] field720 = new int[5];

    @ObfuscatedName("af.s")
    public static int[][] field728 = new int[5][5000];

    @ObfuscatedName("af.g")
    public static int[] field736 = new int[1000];

    @ObfuscatedName("af.u")
    public static String[] field721 = new String[1000];

    @ObfuscatedName("af.d")
    public static int field734 = 0;

    @ObfuscatedName("af.y")
    public static class13[] field717 = new class13[50];

    @ObfuscatedName("af.o")
    public static Calendar field726 = Calendar.getInstance();

    @ObfuscatedName("af.w")
    public static final String[] field727 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ge.i(Li;I)V")
    public static void method3536(class1 arg0) {
        method2848(arg0, 200000);
    }

    @ObfuscatedName("eu.c(Li;II)V")
    public static void method2848(class1 arg0, int arg1) {
        Object[] var2 = arg0.field17;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method162(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field534;
        int[] var9 = var4.field535;
        byte var10 = -1;
        field734 = 0;
        try {
            Statics.field718 = new int[var4.field537];
            int var11 = 0;
            Statics.field719 = new String[var4.field547];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field3;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field5 == null ? -1 : arg0.field5.field2531;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field5 == null ? -1 : arg0.field5.field2532;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2531;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2532;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1;
                    }
                    Statics.field718[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field12;
                    }
                    Statics.field719[var12++] = var15;
                }
            }
            int var16 = 0;
            label2564: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var422 = var8[var7];
                if (var422 < 100) {
                    if (var422 == 0) {
                        field736[var5++] = var9[var7];
                        continue;
                    }
                    if (var422 == 1) {
                        int var17 = var9[var7];
                        field736[var5++] = class154.field2661[var17];
                        continue;
                    }
                    if (var422 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class154.field2661[var18] = field736[var5];
                        client.method612(var18);
                        continue;
                    }
                    if (var422 == 3) {
                        field721[var6++] = var4.field536[var7];
                        continue;
                    }
                    if (var422 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var422 == 7) {
                        var5 -= 2;
                        if (field736[var5 + 1] != field736[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var422 == 8) {
                        var5 -= 2;
                        if (field736[var5 + 1] == field736[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var422 == 9) {
                        var5 -= 2;
                        if (field736[var5] < field736[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var422 == 10) {
                        var5 -= 2;
                        if (field736[var5] > field736[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var422 == 21) {
                        if (field734 == 0) {
                            return;
                        }
                        class13 var19 = field717[--field734];
                        var4 = var19.field196;
                        var8 = var4.field534;
                        var9 = var4.field535;
                        var7 = var19.field199;
                        Statics.field718 = var19.field195;
                        Statics.field719 = var19.field203;
                        continue;
                    }
                    if (var422 == 25) {
                        int var20 = var9[var7];
                        field736[var5++] = class154.method711(var20);
                        continue;
                    }
                    if (var422 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class154.method2000(var21, field736[var5]);
                        continue;
                    }
                    if (var422 == 31) {
                        var5 -= 2;
                        if (field736[var5] <= field736[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var422 == 32) {
                        var5 -= 2;
                        if (field736[var5] >= field736[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var422 == 33) {
                        field736[var5++] = Statics.field718[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var422 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field718[var10001] = field736[var5];
                        continue;
                    }
                    if (var422 == 35) {
                        field721[var6++] = Statics.field719[var9[var7]];
                        continue;
                    }
                    if (var422 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field719[var10001] = field721[var6];
                        continue;
                    }
                    if (var422 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class199.method2847(field721, var6, var22);
                        field721[var6++] = var23;
                        continue;
                    }
                    if (var422 == 38) {
                        var5--;
                        continue;
                    }
                    if (var422 == 39) {
                        var6--;
                        continue;
                    }
                    if (var422 == 40) {
                        int var24 = var9[var7];
                        class19 var25 = class19.method162(var24);
                        int[] var26 = new int[var25.field537];
                        String[] var27 = new String[var25.field547];
                        for (int var28 = 0; var28 < var25.field539; var28++) {
                            var26[var28] = field736[var5 - var25.field539 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field542; var29++) {
                            var27[var29] = field721[var6 - var25.field542 + var29];
                        }
                        var5 -= var25.field539;
                        var6 -= var25.field542;
                        class13 var30 = new class13();
                        var30.field196 = var4;
                        var30.field199 = var7;
                        var30.field195 = Statics.field718;
                        var30.field203 = Statics.field719;
                        field717[++field734 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field534;
                        var9 = var25.field535;
                        var7 = -1;
                        Statics.field718 = var26;
                        Statics.field719 = var27;
                        continue;
                    }
                    if (var422 == 42) {
                        field736[var5++] = client.field456[var9[var7]];
                        continue;
                    }
                    if (var422 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field456[var10001] = field736[var5];
                        continue;
                    }
                    if (var422 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field736[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field720[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2564;
                                }
                                field728[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var422 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field736[var5];
                        if (var37 >= 0 && var37 < field720[var36]) {
                            field736[var5++] = field728[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var422 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field736[var5];
                        if (var39 >= 0 && var39 < field720[var38]) {
                            field728[var38][var39] = field736[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var422 == 47) {
                        String var40 = client.field457[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field721[var6++] = var40;
                        continue;
                    }
                    if (var422 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field457[var10001] = field721[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var422 < 1000) {
                    if (var422 == 100) {
                        var5 -= 3;
                        int var42 = field736[var5];
                        int var43 = field736[var5 + 1];
                        int var44 = field736[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class152 var45 = class152.method1027(var42);
                        if (var45.field2639 == null) {
                            var45.field2639 = new class152[var44 + 1];
                        }
                        if (var45.field2639.length <= var44) {
                            class152[] var46 = new class152[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2639.length; var47++) {
                                var46[var47] = var45.field2639[var47];
                            }
                            var45.field2639 = var46;
                        }
                        if (var44 > 0 && var45.field2639[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class152 var48 = new class152();
                        var48.field2612 = var43;
                        var48.field2527 = var48.field2531 = var45.field2531;
                        var48.field2532 = var44;
                        var48.field2530 = true;
                        var45.field2639[var44] = var48;
                        if (var41) {
                            Statics.field1870 = var48;
                        } else {
                            Statics.field2476 = var48;
                        }
                        client.method465(var45);
                        continue;
                    }
                    if (var422 == 101) {
                        class152 var49 = var41 ? Statics.field1870 : Statics.field2476;
                        class152 var50 = class152.method1027(var49.field2531);
                        var50.field2639[var49.field2532] = null;
                        client.method465(var50);
                        continue;
                    }
                    if (var422 == 102) {
                        var5--;
                        class152 var51 = class152.method1027(field736[var5]);
                        var51.field2639 = null;
                        client.method465(var51);
                        continue;
                    }
                    if (var422 == 200) {
                        var5 -= 2;
                        int var52 = field736[var5];
                        int var53 = field736[var5 + 1];
                        class152 var54 = Statics.method899(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field736[var5++] = 1;
                            if (var41) {
                                Statics.field1870 = var54;
                            } else {
                                Statics.field2476 = var54;
                            }
                            continue;
                        }
                        field736[var5++] = 0;
                        continue;
                    }
                } else if (var422 >= 1000 && var422 < 1100 || var422 >= 2000 && var422 < 2100) {
                    class152 var55;
                    if (var422 >= 2000) {
                        var422 -= 1000;
                        var5--;
                        var55 = class152.method1027(field736[var5]);
                    } else {
                        var55 = var41 ? Statics.field1870 : Statics.field2476;
                    }
                    if (var422 == 1000) {
                        var5 -= 2;
                        var55.field2558 = field736[var5];
                        var55.field2571 = field736[var5 + 1];
                        client.method465(var55);
                        continue;
                    }
                    if (var422 == 1001) {
                        var5 -= 2;
                        var55.field2535 = field736[var5];
                        var55.field2601 = field736[var5 + 1];
                        client.method465(var55);
                        continue;
                    }
                    if (var422 == 1003) {
                        var5--;
                        boolean var56 = field736[var5] == 1;
                        if (var55.field2562 != var56) {
                            var55.field2562 = var56;
                            client.method465(var55);
                        }
                        continue;
                    }
                } else if (var422 >= 1100 && var422 < 1200 || var422 >= 2100 && var422 < 2200) {
                    class152 var57;
                    if (var422 >= 2000) {
                        var422 -= 1000;
                        var5--;
                        var57 = class152.method1027(field736[var5]);
                    } else {
                        var57 = var41 ? Statics.field1870 : Statics.field2476;
                    }
                    if (var422 == 1100) {
                        var5 -= 2;
                        var57.field2544 = field736[var5];
                        if (var57.field2544 > var57.field2567 - var57.field2535) {
                            var57.field2544 = var57.field2567 - var57.field2535;
                        }
                        if (var57.field2544 < 0) {
                            var57.field2544 = 0;
                        }
                        var57.field2545 = field736[var5 + 1];
                        if (var57.field2545 > var57.field2547 - var57.field2601) {
                            var57.field2545 = var57.field2547 - var57.field2601;
                        }
                        if (var57.field2545 < 0) {
                            var57.field2545 = 0;
                        }
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1101) {
                        var5--;
                        var57.field2553 = field736[var5];
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1102) {
                        var5--;
                        var57.field2552 = field736[var5] == 1;
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1103) {
                        var5--;
                        var57.field2626 = field736[var5];
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1104) {
                        var5--;
                        var57.field2554 = field736[var5];
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1105) {
                        var5--;
                        var57.field2555 = field736[var5];
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1106) {
                        var5--;
                        var57.field2622 = field736[var5];
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1107) {
                        var5--;
                        var57.field2540 = field736[var5] == 1;
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1108) {
                        var57.field2563 = 1;
                        var5--;
                        var57.field2564 = field736[var5];
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1109) {
                        var5 -= 6;
                        var57.field2541 = field736[var5];
                        var57.field2570 = field736[var5 + 1];
                        var57.field2636 = field736[var5 + 2];
                        var57.field2543 = field736[var5 + 3];
                        var57.field2537 = field736[var5 + 4];
                        var57.field2574 = field736[var5 + 5];
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1110) {
                        var5--;
                        int var58 = field736[var5];
                        if (var57.field2600 != var58) {
                            var57.field2600 = var58;
                            var57.field2637 = 0;
                            var57.field2529 = 0;
                            client.method465(var57);
                        }
                        continue;
                    }
                    if (var422 == 1111) {
                        var5--;
                        var57.field2576 = field736[var5] == 1;
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1112) {
                        var6--;
                        String var59 = field721[var6];
                        if (!var59.equals(var57.field2578)) {
                            var57.field2578 = var59;
                            client.method465(var57);
                        }
                        continue;
                    }
                    if (var422 == 1113) {
                        var5--;
                        var57.field2577 = field736[var5];
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1114) {
                        var5 -= 3;
                        var57.field2581 = field736[var5];
                        var57.field2582 = field736[var5 + 1];
                        var57.field2551 = field736[var5 + 2];
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1115) {
                        var5--;
                        var57.field2583 = field736[var5] == 1;
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1116) {
                        var5--;
                        var57.field2559 = field736[var5];
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1117) {
                        var5--;
                        var57.field2560 = field736[var5];
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1118) {
                        var5--;
                        var57.field2561 = field736[var5] == 1;
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1119) {
                        var5--;
                        var57.field2597 = field736[var5] == 1;
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1120) {
                        var5 -= 2;
                        var57.field2567 = field736[var5];
                        var57.field2547 = field736[var5 + 1];
                        client.method465(var57);
                        continue;
                    }
                    if (var422 == 1121) {
                        int var60 = var57.field2531;
                        int var61 = var57.field2532;
                        client.field302.method2386(48);
                        client.field302.method2140(var60);
                        client.field302.method2181(var61);
                        client.field334 = var57;
                        client.method465(var57);
                        continue;
                    }
                } else if (!(var422 < 1200 || var422 >= 1300) || !(var422 < 2200 || var422 >= 2300)) {
                    class152 var62;
                    if (var422 >= 2000) {
                        var422 -= 1000;
                        var5--;
                        var62 = class152.method1027(field736[var5]);
                    } else {
                        var62 = var41 ? Statics.field1870 : Statics.field2476;
                    }
                    client.method465(var62);
                    if (var422 == 1200) {
                        var5 -= 2;
                        int var63 = field736[var5];
                        int var64 = field736[var5 + 1];
                        var62.field2635 = var63;
                        var62.field2619 = var64;
                        class45 var65 = class45.method2547(var63);
                        var62.field2636 = var65.field1027;
                        var62.field2543 = var65.field1014;
                        var62.field2537 = var65.field1029;
                        var62.field2541 = var65.field1019;
                        var62.field2570 = var65.field1031;
                        var62.field2574 = var65.field1012;
                        if (var62.field2535 > 0) {
                            var62.field2574 = var62.field2574 * 32 / var62.field2535;
                        }
                        continue;
                    }
                    if (var422 == 1201) {
                        var62.field2563 = 2;
                        var5--;
                        var62.field2564 = field736[var5];
                        continue;
                    }
                    if (var422 == 1202) {
                        var62.field2563 = 3;
                        var62.field2564 = Statics.field1667.field47.method2954();
                        continue;
                    }
                } else if (var422 >= 1300 && var422 < 1400 || var422 >= 2300 && var422 < 2400) {
                    class152 var66;
                    if (var422 >= 2000) {
                        var422 -= 1000;
                        var5--;
                        var66 = class152.method1027(field736[var5]);
                    } else {
                        var66 = var41 ? Statics.field1870 : Statics.field2476;
                    }
                    if (var422 == 1300) {
                        var5--;
                        int var67 = field736[var5] - 1;
                        if (var67 >= 0 && var67 <= 9) {
                            var6--;
                            var66.method2883(var67, field721[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var422 == 1301) {
                        var5 -= 2;
                        int var68 = field736[var5];
                        int var69 = field736[var5 + 1];
                        var66.field2593 = Statics.method899(var68, var69);
                        continue;
                    }
                    if (var422 == 1302) {
                        var5--;
                        var66.field2596 = field736[var5] == 1;
                        continue;
                    }
                    if (var422 == 1303) {
                        var5--;
                        var66.field2594 = field736[var5];
                        continue;
                    }
                    if (var422 == 1304) {
                        var5--;
                        var66.field2534 = field736[var5];
                        continue;
                    }
                    if (var422 == 1305) {
                        var6--;
                        var66.field2644 = field721[var6];
                        continue;
                    }
                    if (var422 == 1306) {
                        var6--;
                        var66.field2573 = field721[var6];
                        continue;
                    }
                    if (var422 == 1307) {
                        var66.field2592 = null;
                        continue;
                    }
                } else {
                    if (var422 >= 1400 && var422 < 1500 || var422 >= 2400 && var422 < 2500) {
                        class152 var70;
                        if (var422 >= 2000) {
                            var422 -= 1000;
                            var5--;
                            var70 = class152.method1027(field736[var5]);
                        } else {
                            var70 = var41 ? Statics.field1870 : Statics.field2476;
                        }
                        var6--;
                        String var71 = field721[var6];
                        int[] var72 = null;
                        if (var71.length() > 0 && var71.charAt(var71.length() - 1) == 'Y') {
                            var5--;
                            int var73 = field736[var5];
                            if (var73 > 0) {
                                var72 = new int[var73];
                                while (var73-- > 0) {
                                    var5--;
                                    var72[var73] = field736[var5];
                                }
                            }
                            var71 = var71.substring(0, var71.length() - 1);
                        }
                        Object[] var74 = new Object[var71.length() + 1];
                        for (int var75 = var74.length - 1; var75 >= 1; var75--) {
                            if (var71.charAt(var75 - 1) == 's') {
                                var6--;
                                var74[var75] = field721[var6];
                            } else {
                                var5--;
                                var74[var75] = Integer.valueOf(field736[var5]);
                            }
                        }
                        var5--;
                        int var76 = field736[var5];
                        if (var76 == -1) {
                            var74 = null;
                        } else {
                            var74[0] = Integer.valueOf(var76);
                        }
                        if (var422 == 1400) {
                            var70.field2627 = var74;
                        }
                        if (var422 == 1401) {
                            var70.field2542 = var74;
                        }
                        if (var422 == 1402) {
                            var70.field2602 = var74;
                        }
                        if (var422 == 1403) {
                            var70.field2604 = var74;
                        }
                        if (var422 == 1404) {
                            var70.field2595 = var74;
                        }
                        if (var422 == 1405) {
                            var70.field2607 = var74;
                        }
                        if (var422 == 1406) {
                            var70.field2610 = var74;
                        }
                        if (var422 == 1407) {
                            var70.field2611 = var74;
                            var70.field2634 = var72;
                        }
                        if (var422 == 1408) {
                            var70.field2617 = var74;
                        }
                        if (var422 == 1409) {
                            var70.field2618 = var74;
                        }
                        if (var422 == 1410) {
                            var70.field2566 = var74;
                        }
                        if (var422 == 1411) {
                            var70.field2603 = var74;
                        }
                        if (var422 == 1412) {
                            var70.field2605 = var74;
                        }
                        if (var422 == 1414) {
                            var70.field2613 = var74;
                            var70.field2646 = var72;
                        }
                        if (var422 == 1415) {
                            var70.field2615 = var74;
                            var70.field2580 = var72;
                        }
                        if (var422 == 1416) {
                            var70.field2609 = var74;
                        }
                        if (var422 == 1417) {
                            var70.field2556 = var74;
                        }
                        if (var422 == 1418) {
                            var70.field2533 = var74;
                        }
                        if (var422 == 1419) {
                            var70.field2620 = var74;
                        }
                        if (var422 == 1420) {
                            var70.field2606 = var74;
                        }
                        if (var422 == 1421) {
                            var70.field2623 = var74;
                        }
                        if (var422 == 1422) {
                            var70.field2624 = var74;
                        }
                        if (var422 == 1423) {
                            var70.field2625 = var74;
                        }
                        if (var422 == 1424) {
                            var70.field2546 = var74;
                        }
                        var70.field2598 = true;
                        continue;
                    }
                    if (var422 < 1600) {
                        class152 var77 = var41 ? Statics.field1870 : Statics.field2476;
                        if (var422 == 1500) {
                            field736[var5++] = var77.field2558;
                            continue;
                        }
                        if (var422 == 1501) {
                            field736[var5++] = var77.field2571;
                            continue;
                        }
                        if (var422 == 1502) {
                            field736[var5++] = var77.field2535;
                            continue;
                        }
                        if (var422 == 1503) {
                            field736[var5++] = var77.field2601;
                            continue;
                        }
                        if (var422 == 1504) {
                            field736[var5++] = var77.field2562 ? 1 : 0;
                            continue;
                        }
                        if (var422 == 1505) {
                            field736[var5++] = var77.field2527;
                            continue;
                        }
                    } else if (var422 < 1700) {
                        class152 var78 = var41 ? Statics.field1870 : Statics.field2476;
                        if (var422 == 1600) {
                            field736[var5++] = var78.field2544;
                            continue;
                        }
                        if (var422 == 1601) {
                            field736[var5++] = var78.field2545;
                            continue;
                        }
                        if (var422 == 1602) {
                            field721[var6++] = var78.field2578;
                            continue;
                        }
                        if (var422 == 1603) {
                            field736[var5++] = var78.field2567;
                            continue;
                        }
                        if (var422 == 1604) {
                            field736[var5++] = var78.field2547;
                            continue;
                        }
                        if (var422 == 1605) {
                            field736[var5++] = var78.field2574;
                            continue;
                        }
                        if (var422 == 1606) {
                            field736[var5++] = var78.field2636;
                            continue;
                        }
                        if (var422 == 1607) {
                            field736[var5++] = var78.field2537;
                            continue;
                        }
                        if (var422 == 1608) {
                            field736[var5++] = var78.field2543;
                            continue;
                        }
                    } else if (var422 < 1800) {
                        class152 var79 = var41 ? Statics.field1870 : Statics.field2476;
                        if (var422 == 1700) {
                            field736[var5++] = var79.field2635;
                            continue;
                        }
                        if (var422 == 1701) {
                            if (var79.field2635 == -1) {
                                field736[var5++] = 0;
                            } else {
                                field736[var5++] = var79.field2619;
                            }
                            continue;
                        }
                        if (var422 == 1702) {
                            field736[var5++] = var79.field2532;
                            continue;
                        }
                    } else if (var422 < 1900) {
                        class152 var80 = var41 ? Statics.field1870 : Statics.field2476;
                        if (var422 == 1800) {
                            field736[var5++] = class156.method1791(client.method533(var80));
                            continue;
                        }
                        if (var422 == 1801) {
                            var5--;
                            int var81 = field736[var5];
                            int var423 = var81 - 1;
                            if (var80.field2592 != null && var423 < var80.field2592.length && var80.field2592[var423] != null) {
                                field721[var6++] = var80.field2592[var423];
                                continue;
                            }
                            field721[var6++] = "";
                            continue;
                        }
                        if (var422 == 1802) {
                            if (var80.field2644 == null) {
                                field721[var6++] = "";
                            } else {
                                field721[var6++] = var80.field2644;
                            }
                            continue;
                        }
                    } else if (var422 < 2600) {
                        var5--;
                        class152 var82 = class152.method1027(field736[var5]);
                        if (var422 == 2500) {
                            field736[var5++] = var82.field2558;
                            continue;
                        }
                        if (var422 == 2501) {
                            field736[var5++] = var82.field2571;
                            continue;
                        }
                        if (var422 == 2502) {
                            field736[var5++] = var82.field2535;
                            continue;
                        }
                        if (var422 == 2503) {
                            field736[var5++] = var82.field2601;
                            continue;
                        }
                        if (var422 == 2504) {
                            field736[var5++] = var82.field2562 ? 1 : 0;
                            continue;
                        }
                        if (var422 == 2505) {
                            field736[var5++] = var82.field2527;
                            continue;
                        }
                    } else if (var422 < 2700) {
                        var5--;
                        class152 var83 = class152.method1027(field736[var5]);
                        if (var422 == 2600) {
                            field736[var5++] = var83.field2544;
                            continue;
                        }
                        if (var422 == 2601) {
                            field736[var5++] = var83.field2545;
                            continue;
                        }
                        if (var422 == 2602) {
                            field721[var6++] = var83.field2578;
                            continue;
                        }
                        if (var422 == 2603) {
                            field736[var5++] = var83.field2567;
                            continue;
                        }
                        if (var422 == 2604) {
                            field736[var5++] = var83.field2547;
                            continue;
                        }
                        if (var422 == 2605) {
                            field736[var5++] = var83.field2574;
                            continue;
                        }
                        if (var422 == 2606) {
                            field736[var5++] = var83.field2636;
                            continue;
                        }
                        if (var422 == 2607) {
                            field736[var5++] = var83.field2537;
                            continue;
                        }
                        if (var422 == 2608) {
                            field736[var5++] = var83.field2543;
                            continue;
                        }
                    } else if (var422 < 2800) {
                        if (var422 == 2700) {
                            var5--;
                            class152 var84 = class152.method1027(field736[var5]);
                            field736[var5++] = var84.field2635;
                            continue;
                        }
                        if (var422 == 2701) {
                            var5--;
                            class152 var85 = class152.method1027(field736[var5]);
                            if (var85.field2635 == -1) {
                                field736[var5++] = 0;
                            } else {
                                field736[var5++] = var85.field2619;
                            }
                            continue;
                        }
                        if (var422 == 2702) {
                            var5--;
                            int var86 = field736[var5];
                            class4 var87 = (class4) client.field371.method3218((long) var86);
                            if (var87 == null) {
                                field736[var5++] = 0;
                            } else {
                                field736[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var422 < 2900) {
                        var5--;
                        class152 var88 = class152.method1027(field736[var5]);
                        if (var422 == 2800) {
                            field736[var5++] = class156.method1791(client.method533(var88));
                            continue;
                        }
                        if (var422 == 2801) {
                            var5--;
                            int var89 = field736[var5];
                            int var424 = var89 - 1;
                            if (var88.field2592 != null && var424 < var88.field2592.length && var88.field2592[var424] != null) {
                                field721[var6++] = var88.field2592[var424];
                                continue;
                            }
                            field721[var6++] = "";
                            continue;
                        }
                        if (var422 == 2802) {
                            if (var88.field2644 == null) {
                                field721[var6++] = "";
                            } else {
                                field721[var6++] = var88.field2644;
                            }
                            continue;
                        }
                    } else if (var422 < 3200) {
                        if (var422 == 3100) {
                            var6--;
                            String var90 = field721[var6];
                            class10.method566(0, "", var90);
                            continue;
                        }
                        if (var422 == 3101) {
                            var5 -= 2;
                            Statics.method28(Statics.field1667, field736[var5], field736[var5 + 1]);
                            continue;
                        }
                        if (var422 == 3103) {
                            client.field302.method2386(150);
                            for (class4 var91 = (class4) client.field371.method3220(); var91 != null; var91 = (class4) client.field371.method3221()) {
                                if (var91.field63 == 0 || var91.field63 == 3) {
                                    client.method1792(var91, true);
                                }
                            }
                            if (client.field334 != null) {
                                client.method465(client.field334);
                                client.field334 = null;
                            }
                            continue;
                        }
                        if (var422 == 3104) {
                            var6--;
                            String var92 = field721[var6];
                            int var93 = 0;
                            if (class199.method30(var92)) {
                                var93 = class199.method2988(var92);
                            }
                            client.field302.method2386(41);
                            client.field302.method2140(var93);
                            continue;
                        }
                        if (var422 == 3105) {
                            var6--;
                            String var94 = field721[var6];
                            client.field302.method2386(83);
                            client.field302.method2137(var94.length() + 1);
                            client.field302.method2148(var94);
                            continue;
                        }
                        if (var422 == 3106) {
                            var6--;
                            String var95 = field721[var6];
                            client.field302.method2386(144);
                            client.field302.method2137(var95.length() + 1);
                            client.field302.method2148(var95);
                            continue;
                        }
                        if (var422 == 3107) {
                            var5--;
                            int var96 = field736[var5];
                            var6--;
                            String var97 = field721[var6];
                            client.method2434(var96, var97);
                            continue;
                        }
                        if (var422 == 3108) {
                            var5 -= 3;
                            int var98 = field736[var5];
                            int var99 = field736[var5 + 1];
                            int var100 = field736[var5 + 2];
                            class152 var101 = class152.method1027(var100);
                            client.method1437(var101, var98, var99);
                            continue;
                        }
                        if (var422 == 3109) {
                            var5 -= 2;
                            int var102 = field736[var5];
                            int var103 = field736[var5 + 1];
                            class152 var104 = var41 ? Statics.field1870 : Statics.field2476;
                            client.method1437(var104, var102, var103);
                            continue;
                        }
                        if (var422 == 3110) {
                            var5--;
                            Statics.field346 = field736[var5] == 1;
                            continue;
                        }
                        if (var422 == 3111) {
                            field736[var5++] = Statics.field1357.field146 ? 1 : 0;
                            continue;
                        }
                        if (var422 == 3112) {
                            var5--;
                            Statics.field1357.field146 = field736[var5] == 1;
                            class9.method2552();
                            continue;
                        }
                        if (var422 == 3113) {
                            var6--;
                            String var105 = field721[var6];
                            var5--;
                            boolean var106 = field736[var5] == 1;
                            class125.method502(var105, var106, "openjs", false);
                            continue;
                        }
                    } else if (var422 < 3300) {
                        if (var422 == 3200) {
                            var5 -= 3;
                            client.method469(field736[var5], field736[var5 + 1], field736[var5 + 2]);
                            continue;
                        }
                        if (var422 == 3201) {
                            var5--;
                            int var107 = field736[var5];
                            if (var107 == -1 && !client.field495) {
                                class161.method1028();
                            } else if (var107 != -1 && client.field494 != var107 && client.field256 != 0 && !client.field495) {
                                class147 var108 = Statics.field2899;
                                int var109 = client.field256;
                                class161.field2710 = 1;
                                Statics.field1805 = var108;
                                Statics.field1978 = var107;
                                Statics.field2714 = 0;
                                Statics.field2715 = var109;
                                Statics.field1822 = false;
                                Statics.field68 = 2;
                            }
                            client.field494 = var107;
                            continue;
                        }
                        if (var422 == 3202) {
                            var5 -= 2;
                            client.method165(field736[var5], field736[var5 + 1]);
                            continue;
                        }
                    } else if (var422 < 3400) {
                        if (var422 == 3300) {
                            field736[var5++] = client.field269;
                            continue;
                        }
                        if (var422 == 3301) {
                            var5 -= 2;
                            int var110 = field736[var5];
                            int var111 = field736[var5 + 1];
                            field736[var5++] = class14.method1424(var110, var111);
                            continue;
                        }
                        if (var422 == 3302) {
                            var5 -= 2;
                            int var112 = field736[var5];
                            int var113 = field736[var5 + 1];
                            int[] var114 = field736;
                            int var115 = var5++;
                            class14 var116 = (class14) class14.field209.method3218((long) var112);
                            int var117;
                            if (var116 == null) {
                                var117 = 0;
                            } else if (var113 >= 0 && var113 < var116.field206.length) {
                                var117 = var116.field206[var113];
                            } else {
                                var117 = 0;
                            }
                            var114[var115] = var117;
                            continue;
                        }
                        if (var422 == 3303) {
                            var5 -= 2;
                            int var118 = field736[var5];
                            int var119 = field736[var5 + 1];
                            int[] var120 = field736;
                            int var121 = var5++;
                            class14 var122 = (class14) class14.field209.method3218((long) var118);
                            int var123;
                            if (var122 == null) {
                                var123 = 0;
                            } else if (var119 == -1) {
                                var123 = 0;
                            } else {
                                int var124 = 0;
                                for (int var125 = 0; var125 < var122.field206.length; var125++) {
                                    if (var122.field207[var125] == var119) {
                                        var124 += var122.field206[var125];
                                    }
                                }
                                var123 = var124;
                            }
                            var120[var121] = var123;
                            continue;
                        }
                        if (var422 == 3304) {
                            var5--;
                            int var126 = field736[var5];
                            int[] var127 = field736;
                            int var128 = var5++;
                            class44 var129 = (class44) class44.field1004.method3185((long) var126);
                            class44 var130;
                            if (var129 == null) {
                                byte[] var131 = Statics.field1009.method2811(5, var126);
                                class44 var132 = new class44();
                                if (var131 != null) {
                                    var132.method841(new class107(var131));
                                }
                                class44.field1004.method3186(var132, (long) var126);
                                var130 = var132;
                            } else {
                                var130 = var129;
                            }
                            var127[var128] = var130.field1010;
                            continue;
                        }
                        if (var422 == 3305) {
                            var5--;
                            int var133 = field736[var5];
                            field736[var5++] = client.field398[var133];
                            continue;
                        }
                        if (var422 == 3306) {
                            var5--;
                            int var134 = field736[var5];
                            field736[var5++] = client.field399[var134];
                            continue;
                        }
                        if (var422 == 3307) {
                            var5--;
                            int var135 = field736[var5];
                            field736[var5++] = client.field330[var135];
                            continue;
                        }
                        if (var422 == 3308) {
                            int var136 = Statics.field2643;
                            int var137 = (Statics.field1667.field744 >> 7) + Statics.field197;
                            int var138 = (Statics.field1667.field738 >> 7) + Statics.field1905;
                            field736[var5++] = (var136 << 28) + (var137 << 14) + var138;
                            continue;
                        }
                        if (var422 == 3309) {
                            var5--;
                            int var139 = field736[var5];
                            field736[var5++] = var139 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var422 == 3310) {
                            var5--;
                            int var140 = field736[var5];
                            field736[var5++] = var140 >> 28;
                            continue;
                        }
                        if (var422 == 3311) {
                            var5--;
                            int var141 = field736[var5];
                            field736[var5++] = var141 & 0x3FFF;
                            continue;
                        }
                        if (var422 == 3312) {
                            field736[var5++] = client.field263 ? 1 : 0;
                            continue;
                        }
                        if (var422 == 3313) {
                            var5 -= 2;
                            int var142 = field736[var5] + 32768;
                            int var143 = field736[var5 + 1];
                            field736[var5++] = class14.method1424(var142, var143);
                            continue;
                        }
                        if (var422 == 3314) {
                            var5 -= 2;
                            int var144 = field736[var5] + 32768;
                            int var145 = field736[var5 + 1];
                            int[] var146 = field736;
                            int var147 = var5++;
                            class14 var148 = (class14) class14.field209.method3218((long) var144);
                            int var149;
                            if (var148 == null) {
                                var149 = 0;
                            } else if (var145 >= 0 && var145 < var148.field206.length) {
                                var149 = var148.field206[var145];
                            } else {
                                var149 = 0;
                            }
                            var146[var147] = var149;
                            continue;
                        }
                        if (var422 == 3315) {
                            var5 -= 2;
                            int var150 = field736[var5] + 32768;
                            int var151 = field736[var5 + 1];
                            int[] var152 = field736;
                            int var153 = var5++;
                            class14 var154 = (class14) class14.field209.method3218((long) var150);
                            int var155;
                            if (var154 == null) {
                                var155 = 0;
                            } else if (var151 == -1) {
                                var155 = 0;
                            } else {
                                int var156 = 0;
                                for (int var157 = 0; var157 < var154.field206.length; var157++) {
                                    if (var154.field207[var157] == var151) {
                                        var156 += var154.field206[var157];
                                    }
                                }
                                var155 = var156;
                            }
                            var152[var153] = var155;
                            continue;
                        }
                        if (var422 == 3316) {
                            if (client.field428 >= 2) {
                                field736[var5++] = client.field428;
                            } else {
                                field736[var5++] = 0;
                            }
                            continue;
                        }
                        if (var422 == 3317) {
                            field736[var5++] = client.field277;
                            continue;
                        }
                        if (var422 == 3318) {
                            field736[var5++] = client.field403;
                            continue;
                        }
                        if (var422 == 3321) {
                            field736[var5++] = client.field426;
                            continue;
                        }
                        if (var422 == 3322) {
                            field736[var5++] = client.field427;
                            continue;
                        }
                        if (var422 == 3323) {
                            if (client.field419) {
                                field736[var5++] = 1;
                            } else {
                                field736[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var422 < 3500) {
                        if (var422 == 3400) {
                            var5 -= 2;
                            int var158 = field736[var5];
                            int var159 = field736[var5 + 1];
                            class43 var160 = (class43) class43.field991.method3185((long) var158);
                            class43 var161;
                            if (var160 == null) {
                                byte[] var162 = Statics.field995.method2811(8, var158);
                                class43 var163 = new class43();
                                if (var162 != null) {
                                    var163.method834(new class107(var162));
                                }
                                class43.field991.method3186(var163, (long) var158);
                                var161 = var163;
                            } else {
                                var161 = var160;
                            }
                            class43 var164 = var161;
                            if (var161.field993 != 's') {
                            }
                            for (int var165 = 0; var165 < var164.field997; var165++) {
                                if (var164.field998[var165] == var159) {
                                    field721[var6++] = var164.field999[var165];
                                    var164 = null;
                                    break;
                                }
                            }
                            if (var164 != null) {
                                field721[var6++] = var164.field994;
                            }
                            continue;
                        }
                        if (var422 == 3408) {
                            var5 -= 4;
                            int var166 = field736[var5];
                            int var167 = field736[var5 + 1];
                            int var168 = field736[var5 + 2];
                            int var169 = field736[var5 + 3];
                            class43 var170 = (class43) class43.field991.method3185((long) var168);
                            class43 var171;
                            if (var170 == null) {
                                byte[] var172 = Statics.field995.method2811(8, var168);
                                class43 var173 = new class43();
                                if (var172 != null) {
                                    var173.method834(new class107(var172));
                                }
                                class43.field991.method3186(var173, (long) var168);
                                var171 = var173;
                            } else {
                                var171 = var170;
                            }
                            class43 var174 = var171;
                            if (var171.field990 == var166 && var171.field993 == var167) {
                                for (int var175 = 0; var175 < var174.field997; var175++) {
                                    if (var174.field998[var175] == var169) {
                                        if (var167 == 115) {
                                            field721[var6++] = var174.field999[var175];
                                        } else {
                                            field736[var5++] = var174.field996[var175];
                                        }
                                        var174 = null;
                                        break;
                                    }
                                }
                                if (var174 != null) {
                                    if (var167 == 115) {
                                        field721[var6++] = var174.field994;
                                    } else {
                                        field736[var5++] = var174.field992;
                                    }
                                }
                                continue;
                            }
                            if (var167 == 115) {
                                field721[var6++] = "null";
                            } else {
                                field736[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var422 < 3700) {
                        if (var422 == 3600) {
                            if (client.field511 == 0) {
                                field736[var5++] = -2;
                            } else if (client.field511 == 1) {
                                field736[var5++] = -1;
                            } else {
                                field736[var5++] = client.field510;
                            }
                            continue;
                        }
                        if (var422 == 3601) {
                            var5--;
                            int var176 = field736[var5];
                            if (client.field511 == 2 && var176 < client.field510) {
                                field721[var6++] = client.field512[var176].field237;
                                field721[var6++] = client.field512[var176].field232;
                                continue;
                            }
                            field721[var6++] = "";
                            field721[var6++] = "";
                            continue;
                        }
                        if (var422 == 3602) {
                            var5--;
                            int var177 = field736[var5];
                            if (client.field511 == 2 && var177 < client.field510) {
                                field736[var5++] = client.field512[var177].field233;
                                continue;
                            }
                            field736[var5++] = 0;
                            continue;
                        }
                        if (var422 == 3603) {
                            var5--;
                            int var178 = field736[var5];
                            if (client.field511 == 2 && var178 < client.field510) {
                                field736[var5++] = client.field512[var178].field239;
                                continue;
                            }
                            field736[var5++] = 0;
                            continue;
                        }
                        if (var422 == 3604) {
                            var6--;
                            String var179 = field721[var6];
                            var5--;
                            int var180 = field736[var5];
                            client.method1985(var179, var180);
                            continue;
                        }
                        if (var422 == 3605) {
                            var6--;
                            String var181 = field721[var6];
                            if (var181 == null) {
                                continue;
                            }
                            if ((client.field510 < 200 || client.field480 == 1) && client.field510 < 400) {
                                String var182 = class200.method575(var181, Statics.field262);
                                if (var182 == null) {
                                    continue;
                                }
                                for (int var183 = 0; var183 < client.field510; var183++) {
                                    class16 var184 = client.field512[var183];
                                    String var185 = class200.method575(var184.field237, Statics.field262);
                                    if (var185 != null && var185.equals(var182)) {
                                        class10.method566(30, "", var181 + class142.field2308);
                                        continue label2564;
                                    }
                                    if (var184.field232 != null) {
                                        String var186 = class200.method575(var184.field232, Statics.field262);
                                        if (var186 != null && var186.equals(var182)) {
                                            class10.method566(30, "", var181 + class142.field2308);
                                            continue label2564;
                                        }
                                    }
                                }
                                for (int var187 = 0; var187 < client.field498; var187++) {
                                    class8 var188 = client.field400[var187];
                                    String var189 = class200.method575(var188.field138, Statics.field262);
                                    if (var189 != null && var189.equals(var182)) {
                                        class10.method566(30, "", class142.field2313 + var181 + class142.field2382);
                                        continue label2564;
                                    }
                                    if (var188.field139 != null) {
                                        String var190 = class200.method575(var188.field139, Statics.field262);
                                        if (var190 != null && var190.equals(var182)) {
                                            class10.method566(30, "", class142.field2313 + var181 + class142.field2382);
                                            continue label2564;
                                        }
                                    }
                                }
                                if (class200.method575(Statics.field1667.field42, Statics.field262).equals(var182)) {
                                    class10.method566(30, "", class142.field2311);
                                } else {
                                    client.field302.method2386(247);
                                    client.field302.method2137(Statics.method1625(var181));
                                    client.field302.method2148(var181);
                                }
                                continue;
                            }
                            class10.method566(30, "", class142.field2259);
                            continue;
                        }
                        if (var422 == 3606) {
                            var6--;
                            String var191 = field721[var6];
                            if (var191 == null) {
                                continue;
                            }
                            String var192 = class200.method575(var191, Statics.field262);
                            if (var192 == null) {
                                continue;
                            }
                            int var193 = 0;
                            while (true) {
                                if (var193 >= client.field510) {
                                    continue label2564;
                                }
                                class16 var194 = client.field512[var193];
                                String var195 = var194.field237;
                                String var196 = class200.method575(var195, Statics.field262);
                                if (Statics.method849(var191, var192, var195, var196)) {
                                    client.field510--;
                                    for (int var197 = var193; var197 < client.field510; var197++) {
                                        client.field512[var197] = client.field512[var197 + 1];
                                    }
                                    client.field453 = client.field439;
                                    client.field302.method2386(193);
                                    client.field302.method2137(Statics.method1625(var191));
                                    client.field302.method2148(var191);
                                    continue label2564;
                                }
                                var193++;
                            }
                        }
                        if (var422 == 3607) {
                            var6--;
                            String var198 = field721[var6];
                            if (var198 == null) {
                                continue;
                            }
                            if ((client.field498 < 100 || client.field480 == 1) && client.field498 < 400) {
                                String var199 = class200.method575(var198, Statics.field262);
                                if (var199 == null) {
                                    continue;
                                }
                                for (int var200 = 0; var200 < client.field498; var200++) {
                                    class8 var201 = client.field400[var200];
                                    String var202 = class200.method575(var201.field138, Statics.field262);
                                    if (var202 != null && var202.equals(var199)) {
                                        class10.method566(31, "", var198 + class142.field2314);
                                        continue label2564;
                                    }
                                    if (var201.field139 != null) {
                                        String var203 = class200.method575(var201.field139, Statics.field262);
                                        if (var203 != null && var203.equals(var199)) {
                                            class10.method566(31, "", var198 + class142.field2314);
                                            continue label2564;
                                        }
                                    }
                                }
                                for (int var204 = 0; var204 < client.field510; var204++) {
                                    class16 var205 = client.field512[var204];
                                    String var206 = class200.method575(var205.field237, Statics.field262);
                                    if (var206 != null && var206.equals(var199)) {
                                        class10.method566(31, "", class142.field2223 + var198 + class142.field2316);
                                        continue label2564;
                                    }
                                    if (var205.field232 != null) {
                                        String var207 = class200.method575(var205.field232, Statics.field262);
                                        if (var207 != null && var207.equals(var199)) {
                                            class10.method566(31, "", class142.field2223 + var198 + class142.field2316);
                                            continue label2564;
                                        }
                                    }
                                }
                                if (class200.method575(Statics.field1667.field42, Statics.field262).equals(var199)) {
                                    class10.method566(31, "", class142.field2312);
                                } else {
                                    client.field302.method2386(190);
                                    client.field302.method2137(Statics.method1625(var198));
                                    client.field302.method2148(var198);
                                }
                                continue;
                            }
                            class10.method566(31, "", class142.field2249);
                            continue;
                        }
                        if (var422 == 3608) {
                            var6--;
                            String var208 = field721[var6];
                            client.method501(var208);
                            continue;
                        }
                        if (var422 == 3609) {
                            var6--;
                            String var209 = field721[var6];
                            if (var209.startsWith(class2.method2085(0)) || var209.startsWith(class2.method2085(1))) {
                                var209 = var209.substring(7);
                            }
                            field736[var5++] = client.method2997(var209, false) ? 1 : 0;
                            continue;
                        }
                        if (var422 == 3611) {
                            if (client.field313 == null) {
                                field721[var6++] = "";
                            } else {
                                field721[var6++] = class198.method2616(client.field313);
                            }
                            continue;
                        }
                        if (var422 == 3612) {
                            if (client.field313 == null) {
                                field736[var5++] = 0;
                            } else {
                                field736[var5++] = Statics.field529;
                            }
                            continue;
                        }
                        if (var422 == 3613) {
                            var5--;
                            int var210 = field736[var5];
                            if (client.field313 != null && var210 < Statics.field529) {
                                field721[var6++] = Statics.field59[var210].field578;
                                continue;
                            }
                            field721[var6++] = "";
                            continue;
                        }
                        if (var422 == 3614) {
                            var5--;
                            int var211 = field736[var5];
                            if (client.field313 != null && var211 < Statics.field529) {
                                field736[var5++] = Statics.field59[var211].field573;
                                continue;
                            }
                            field736[var5++] = 0;
                            continue;
                        }
                        if (var422 == 3615) {
                            var5--;
                            int var212 = field736[var5];
                            if (client.field313 != null && var212 < Statics.field529) {
                                field736[var5++] = Statics.field59[var212].field577;
                                continue;
                            }
                            field736[var5++] = 0;
                            continue;
                        }
                        if (var422 == 3616) {
                            field736[var5++] = Statics.field198;
                            continue;
                        }
                        if (var422 == 3617) {
                            var6--;
                            String var213 = field721[var6];
                            client.method1881(var213);
                            continue;
                        }
                        if (var422 == 3618) {
                            field736[var5++] = Statics.field558;
                            continue;
                        }
                        if (var422 == 3619) {
                            var6--;
                            String var214 = field721[var6];
                            if (!var214.equals("")) {
                                client.field302.method2386(222);
                                client.field302.method2137(Statics.method1625(var214));
                                client.field302.method2148(var214);
                            }
                            continue;
                        }
                        if (var422 == 3620) {
                            client.field302.method2386(222);
                            client.field302.method2137(0);
                            continue;
                        }
                        if (var422 == 3621) {
                            if (client.field511 == 0) {
                                field736[var5++] = -1;
                            } else {
                                field736[var5++] = client.field498;
                            }
                            continue;
                        }
                        if (var422 == 3622) {
                            var5--;
                            int var215 = field736[var5];
                            if (client.field511 != 0 && var215 < client.field498) {
                                field721[var6++] = client.field400[var215].field138;
                                field721[var6++] = client.field400[var215].field139;
                                continue;
                            }
                            field721[var6++] = "";
                            field721[var6++] = "";
                            continue;
                        }
                        if (var422 == 3623) {
                            var6--;
                            String var216 = field721[var6];
                            if (var216.startsWith(class2.method2085(0)) || var216.startsWith(class2.method2085(1))) {
                                var216 = var216.substring(7);
                            }
                            field736[var5++] = client.method85(var216) ? 1 : 0;
                            continue;
                        }
                        if (var422 == 3624) {
                            var5--;
                            int var217 = field736[var5];
                            if (Statics.field59 != null && var217 < Statics.field529 && Statics.field59[var217].field578.equalsIgnoreCase(Statics.field1667.field42)) {
                                field736[var5++] = 1;
                                continue;
                            }
                            field736[var5++] = 0;
                            continue;
                        }
                        if (var422 == 3625) {
                            if (client.field483 == null) {
                                field721[var6++] = "";
                                continue;
                            }
                            String[] var218 = field721;
                            int var219 = var6++;
                            String var220 = client.field483;
                            long var221 = 0L;
                            int var223 = var220.length();
                            for (int var224 = 0; var224 < var223; var224++) {
                                var221 *= 37L;
                                char var225 = var220.charAt(var224);
                                if (var225 >= 'A' && var225 <= 'Z') {
                                    var221 += (long) (var225 + 1 - 65);
                                } else if (var225 >= 'a' && var225 <= 'z') {
                                    var221 += (long) (var225 + 1 - 97);
                                } else if (var225 >= '0' && var225 <= '9') {
                                    var221 += (long) (var225 + 27 - 48);
                                }
                                if (var221 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var221 % 37L == 0L && var221 != 0L) {
                                var221 /= 37L;
                            }
                            String var228 = class198.method1899(var221);
                            if (var228 == null) {
                                var228 = "";
                            }
                            var218[var219] = var228;
                            continue;
                        }
                    } else if (var422 < 4100) {
                        if (var422 == 4000) {
                            var5 -= 2;
                            int var230 = field736[var5];
                            int var231 = field736[var5 + 1];
                            field736[var5++] = var230 + var231;
                            continue;
                        }
                        if (var422 == 4001) {
                            var5 -= 2;
                            int var232 = field736[var5];
                            int var233 = field736[var5 + 1];
                            field736[var5++] = var232 - var233;
                            continue;
                        }
                        if (var422 == 4002) {
                            var5 -= 2;
                            int var234 = field736[var5];
                            int var235 = field736[var5 + 1];
                            field736[var5++] = var234 * var235;
                            continue;
                        }
                        if (var422 == 4003) {
                            var5 -= 2;
                            int var236 = field736[var5];
                            int var237 = field736[var5 + 1];
                            field736[var5++] = var236 / var237;
                            continue;
                        }
                        if (var422 == 4004) {
                            var5--;
                            int var238 = field736[var5];
                            field736[var5++] = (int) (Math.random() * (double) var238);
                            continue;
                        }
                        if (var422 == 4005) {
                            var5--;
                            int var239 = field736[var5];
                            field736[var5++] = (int) (Math.random() * (double) (var239 + 1));
                            continue;
                        }
                        if (var422 == 4006) {
                            var5 -= 5;
                            int var240 = field736[var5];
                            int var241 = field736[var5 + 1];
                            int var242 = field736[var5 + 2];
                            int var243 = field736[var5 + 3];
                            int var244 = field736[var5 + 4];
                            field736[var5++] = (var241 - var240) * (var244 - var242) / (var243 - var242) + var240;
                            continue;
                        }
                        if (var422 == 4007) {
                            var5 -= 2;
                            int var245 = field736[var5];
                            int var246 = field736[var5 + 1];
                            field736[var5++] = var245 * var246 / 100 + var245;
                            continue;
                        }
                        if (var422 == 4008) {
                            var5 -= 2;
                            int var247 = field736[var5];
                            int var248 = field736[var5 + 1];
                            field736[var5++] = var247 | 0x1 << var248;
                            continue;
                        }
                        if (var422 == 4009) {
                            var5 -= 2;
                            int var249 = field736[var5];
                            int var250 = field736[var5 + 1];
                            field736[var5++] = var249 & -1 - (0x1 << var250);
                            continue;
                        }
                        if (var422 == 4010) {
                            var5 -= 2;
                            int var251 = field736[var5];
                            int var252 = field736[var5 + 1];
                            field736[var5++] = (var251 & 0x1 << var252) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var422 == 4011) {
                            var5 -= 2;
                            int var253 = field736[var5];
                            int var254 = field736[var5 + 1];
                            field736[var5++] = var253 % var254;
                            continue;
                        }
                        if (var422 == 4012) {
                            var5 -= 2;
                            int var255 = field736[var5];
                            int var256 = field736[var5 + 1];
                            if (var255 == 0) {
                                field736[var5++] = 0;
                            } else {
                                field736[var5++] = (int) Math.pow((double) var255, (double) var256);
                            }
                            continue;
                        }
                        if (var422 == 4013) {
                            var5 -= 2;
                            int var257 = field736[var5];
                            int var258 = field736[var5 + 1];
                            if (var257 == 0) {
                                field736[var5++] = 0;
                            } else if (var258 == 0) {
                                field736[var5++] = Integer.MAX_VALUE;
                            } else {
                                field736[var5++] = (int) Math.pow((double) var257, 1.0D / (double) var258);
                            }
                            continue;
                        }
                        if (var422 == 4014) {
                            var5 -= 2;
                            int var259 = field736[var5];
                            int var260 = field736[var5 + 1];
                            field736[var5++] = var259 & var260;
                            continue;
                        }
                        if (var422 == 4015) {
                            var5 -= 2;
                            int var261 = field736[var5];
                            int var262 = field736[var5 + 1];
                            field736[var5++] = var261 | var262;
                            continue;
                        }
                    } else if (var422 < 4200) {
                        if (var422 == 4100) {
                            var6--;
                            String var263 = field721[var6];
                            var5--;
                            int var264 = field736[var5];
                            field721[var6++] = var263 + var264;
                            continue;
                        }
                        if (var422 == 4101) {
                            var6 -= 2;
                            String var265 = field721[var6];
                            String var266 = field721[var6 + 1];
                            field721[var6++] = var265 + var266;
                            continue;
                        }
                        if (var422 == 4102) {
                            var6--;
                            String var267 = field721[var6];
                            var5--;
                            int var268 = field736[var5];
                            String[] var269 = field721;
                            int var270 = var6++;
                            String var272;
                            if (var268 < 0) {
                                var272 = Integer.toString(var268);
                            } else {
                                int var273 = var268;
                                String var274;
                                if (var268 < 0) {
                                    var274 = Integer.toString(var268, 10);
                                } else {
                                    int var275 = 2;
                                    int var276 = var268 / 10;
                                    while (var276 != 0) {
                                        var276 /= 10;
                                        var275++;
                                    }
                                    char[] var277 = new char[var275];
                                    var277[0] = '+';
                                    for (int var278 = var275 - 1; var278 > 0; var278--) {
                                        int var279 = var273;
                                        var273 /= 10;
                                        int var280 = var279 - var273 * 10;
                                        if (var280 >= 10) {
                                            var277[var278] = (char) (var280 + 87);
                                        } else {
                                            var277[var278] = (char) (var280 + 48);
                                        }
                                    }
                                    var274 = new String(var277);
                                }
                                var272 = var274;
                            }
                            var269[var270] = var267 + var272;
                            continue;
                        }
                        if (var422 == 4103) {
                            var6--;
                            String var281 = field721[var6];
                            field721[var6++] = var281.toLowerCase();
                            continue;
                        }
                        if (var422 == 4104) {
                            var5--;
                            int var282 = field736[var5];
                            long var283 = ((long) var282 + 11745L) * 86400000L;
                            field726.setTime(new Date(var283));
                            int var285 = field726.get(5);
                            int var286 = field726.get(2);
                            int var287 = field726.get(1);
                            field721[var6++] = var285 + "-" + field727[var286] + "-" + var287;
                            continue;
                        }
                        if (var422 == 4105) {
                            var6 -= 2;
                            String var288 = field721[var6];
                            String var289 = field721[var6 + 1];
                            if (Statics.field1667.field47 != null && Statics.field1667.field47.field2671) {
                                field721[var6++] = var289;
                                continue;
                            }
                            field721[var6++] = var288;
                            continue;
                        }
                        if (var422 == 4106) {
                            var5--;
                            int var290 = field736[var5];
                            field721[var6++] = Integer.toString(var290);
                            continue;
                        }
                        if (var422 == 4107) {
                            var6 -= 2;
                            int[] var291 = field736;
                            int var292 = var5++;
                            String var293 = field721[var6];
                            String var294 = field721[var6 + 1];
                            int var295 = client.field265;
                            int var296 = var293.length();
                            int var297 = var294.length();
                            int var298 = 0;
                            int var299 = 0;
                            char var300 = 0;
                            char var301 = 0;
                            int var302;
                            label2413: while (true) {
                                if (var298 - var300 >= var296 && var299 - var301 >= var297) {
                                    int var311 = Math.min(var296, var297);
                                    for (int var312 = 0; var312 < var311; var312++) {
                                        char var315 = var293.charAt(var312);
                                        char var316 = var294.charAt(var312);
                                        if (var315 != var316 && Character.toUpperCase(var315) != Character.toUpperCase(var316)) {
                                            char var317 = Character.toLowerCase(var315);
                                            char var318 = Character.toLowerCase(var316);
                                            if (var317 != var318) {
                                                var302 = class202.method3180(var317, var295) - class202.method3180(var318, var295);
                                                break label2413;
                                            }
                                        }
                                    }
                                    int var319 = var296 - var297;
                                    if (var319 == 0) {
                                        for (int var320 = 0; var320 < var311; var320++) {
                                            char var321 = var293.charAt(var320);
                                            char var322 = var294.charAt(var320);
                                            if (var321 != var322) {
                                                var302 = class202.method3180(var321, var295) - class202.method3180(var322, var295);
                                                break label2413;
                                            }
                                        }
                                        var302 = 0;
                                    } else {
                                        var302 = var319;
                                    }
                                    break;
                                }
                                if (var298 - var300 >= var296) {
                                    var302 = -1;
                                    break;
                                }
                                if (var299 - var301 >= var297) {
                                    var302 = 1;
                                    break;
                                }
                                char var303;
                                if (var300 == 0) {
                                    var303 = var293.charAt(var298++);
                                } else {
                                    var303 = var300;
                                    boolean var304 = false;
                                }
                                char var305;
                                if (var301 == 0) {
                                    var305 = var294.charAt(var299++);
                                } else {
                                    var305 = var301;
                                    boolean var306 = false;
                                }
                                var300 = class202.method2097(var303);
                                var301 = class202.method2097(var305);
                                char var307 = class202.method2088(var303, var295);
                                char var308 = class202.method2088(var305, var295);
                                if (var307 != var308 && Character.toUpperCase(var307) != Character.toUpperCase(var308)) {
                                    char var309 = Character.toLowerCase(var307);
                                    char var310 = Character.toLowerCase(var308);
                                    if (var309 != var310) {
                                        var302 = class202.method3180(var309, var295) - class202.method3180(var310, var295);
                                        break;
                                    }
                                }
                            }
                            byte var324;
                            if (var302 > 0) {
                                var324 = 1;
                            } else if (var302 < 0) {
                                var324 = -1;
                            } else {
                                var324 = 0;
                            }
                            var291[var292] = var324;
                            continue;
                        }
                        if (var422 == 4108) {
                            var6--;
                            String var325 = field721[var6];
                            var5 -= 2;
                            int var326 = field736[var5];
                            int var327 = field736[var5 + 1];
                            byte[] var328 = Statics.field1809.method2811(var327, 0);
                            class193 var329 = new class193(var328);
                            field736[var5++] = var329.method3394(var325, var326);
                            continue;
                        }
                        if (var422 == 4109) {
                            var6--;
                            String var330 = field721[var6];
                            var5 -= 2;
                            int var331 = field736[var5];
                            int var332 = field736[var5 + 1];
                            byte[] var333 = Statics.field1809.method2811(var332, 0);
                            class193 var334 = new class193(var333);
                            field736[var5++] = var334.method3359(var330, var331);
                            continue;
                        }
                        if (var422 == 4110) {
                            var6 -= 2;
                            String var335 = field721[var6];
                            String var336 = field721[var6 + 1];
                            var5--;
                            if (field736[var5] == 1) {
                                field721[var6++] = var335;
                            } else {
                                field721[var6++] = var336;
                            }
                            continue;
                        }
                        if (var422 == 4111) {
                            var6--;
                            String var337 = field721[var6];
                            field721[var6++] = class192.method3356(var337);
                            continue;
                        }
                        if (var422 == 4112) {
                            var6--;
                            String var338 = field721[var6];
                            var5--;
                            int var339 = field736[var5];
                            field721[var6++] = var338 + (char) var339;
                            continue;
                        }
                        if (var422 == 4113) {
                            var5--;
                            int var340 = field736[var5];
                            field736[var5++] = class199.method2175((char) var340) ? 1 : 0;
                            continue;
                        }
                        if (var422 == 4114) {
                            var5--;
                            int var341 = field736[var5];
                            field736[var5++] = class199.method3068((char) var341) ? 1 : 0;
                            continue;
                        }
                        if (var422 == 4115) {
                            var5--;
                            int var342 = field736[var5];
                            int[] var343 = field736;
                            int var344 = var5++;
                            char var345 = (char) var342;
                            boolean var346 = var345 >= 'A' && var345 <= 'Z' || var345 >= 'a' && var345 <= 'z';
                            var343[var344] = var346 ? 1 : 0;
                            continue;
                        }
                        if (var422 == 4116) {
                            var5--;
                            int var347 = field736[var5];
                            field736[var5++] = class199.method2916((char) var347) ? 1 : 0;
                            continue;
                        }
                        if (var422 == 4117) {
                            var6--;
                            String var348 = field721[var6];
                            if (var348 == null) {
                                field736[var5++] = 0;
                            } else {
                                field736[var5++] = var348.length();
                            }
                            continue;
                        }
                        if (var422 == 4118) {
                            var6--;
                            String var349 = field721[var6];
                            var5 -= 2;
                            int var350 = field736[var5];
                            int var351 = field736[var5 + 1];
                            field721[var6++] = var349.substring(var350, var351);
                            continue;
                        }
                        if (var422 == 4119) {
                            var6--;
                            String var352 = field721[var6];
                            StringBuilder var353 = new StringBuilder(var352.length());
                            boolean var354 = false;
                            for (int var355 = 0; var355 < var352.length(); var355++) {
                                char var356 = var352.charAt(var355);
                                if (var356 == '<') {
                                    var354 = true;
                                } else if (var356 == '>') {
                                    var354 = false;
                                } else if (!var354) {
                                    var353.append(var356);
                                }
                            }
                            field721[var6++] = var353.toString();
                            continue;
                        }
                        if (var422 == 4120) {
                            var6--;
                            String var357 = field721[var6];
                            var5--;
                            int var358 = field736[var5];
                            field736[var5++] = var357.indexOf(var358);
                            continue;
                        }
                        if (var422 == 4121) {
                            var6 -= 2;
                            String var359 = field721[var6];
                            String var360 = field721[var6 + 1];
                            var5--;
                            int var361 = field736[var5];
                            field736[var5++] = var359.indexOf(var360, var361);
                            continue;
                        }
                    } else if (var422 < 4300) {
                        if (var422 == 4200) {
                            var5--;
                            int var362 = field736[var5];
                            field721[var6++] = class45.method2547(var362).field1021;
                            continue;
                        }
                        if (var422 == 4201) {
                            var5 -= 2;
                            int var363 = field736[var5];
                            int var364 = field736[var5 + 1];
                            class45 var365 = class45.method2547(var363);
                            if (var364 >= 1 && var364 <= 5 && var365.field1032[var364 - 1] != null) {
                                field721[var6++] = var365.field1032[var364 - 1];
                                continue;
                            }
                            field721[var6++] = "";
                            continue;
                        }
                        if (var422 == 4202) {
                            var5 -= 2;
                            int var366 = field736[var5];
                            int var367 = field736[var5 + 1];
                            class45 var368 = class45.method2547(var366);
                            if (var367 >= 1 && var367 <= 5 && var368.field1036[var367 - 1] != null) {
                                field721[var6++] = var368.field1036[var367 - 1];
                                continue;
                            }
                            field721[var6++] = "";
                            continue;
                        }
                        if (var422 == 4203) {
                            var5--;
                            int var369 = field736[var5];
                            field736[var5++] = class45.method2547(var369).field1030;
                            continue;
                        }
                        if (var422 == 4204) {
                            var5--;
                            int var370 = field736[var5];
                            field736[var5++] = class45.method2547(var370).field1028 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var422 == 4205) {
                            var5--;
                            int var371 = field736[var5];
                            class45 var372 = class45.method2547(var371);
                            if (var372.field1052 == -1 && var372.field1051 >= 0) {
                                field736[var5++] = var372.field1051;
                                continue;
                            }
                            field736[var5++] = var371;
                            continue;
                        }
                        if (var422 == 4206) {
                            var5--;
                            int var373 = field736[var5];
                            class45 var374 = class45.method2547(var373);
                            if (var374.field1052 >= 0 && var374.field1051 >= 0) {
                                field736[var5++] = var374.field1051;
                                continue;
                            }
                            field736[var5++] = var373;
                            continue;
                        }
                        if (var422 == 4207) {
                            var5--;
                            int var375 = field736[var5];
                            field736[var5++] = class45.method2547(var375).field1024 ? 1 : 0;
                            continue;
                        }
                    } else if (var422 < 5100) {
                        if (var422 == 5000) {
                            field736[var5++] = client.field474;
                            continue;
                        }
                        if (var422 == 5001) {
                            var5 -= 3;
                            client.field474 = field736[var5];
                            int var376 = field736[var5 + 1];
                            class117[] var377 = class117.method2720();
                            int var378 = 0;
                            class117 var380;
                            while (true) {
                                if (var378 >= var377.length) {
                                    var380 = null;
                                    break;
                                }
                                class117 var379 = var377[var378];
                                if (var379.field1904 == var376) {
                                    var380 = var379;
                                    break;
                                }
                                var378++;
                            }
                            Statics.field570 = var380;
                            if (Statics.field570 == null) {
                                Statics.field570 = class117.field1899;
                            }
                            client.field475 = field736[var5 + 2];
                            client.field302.method2386(95);
                            client.field302.method2137(client.field474);
                            client.field302.method2137(Statics.field570.field1904);
                            client.field302.method2137(client.field475);
                            continue;
                        }
                        if (var422 == 5002) {
                            var6--;
                            String var381 = field721[var6];
                            var5 -= 2;
                            int var382 = field736[var5];
                            int var383 = field736[var5 + 1];
                            client.field302.method2386(97);
                            client.field302.method2137(Statics.method1625(var381) + 2);
                            client.field302.method2148(var381);
                            client.field302.method2137(var382 - 1);
                            client.field302.method2137(var383);
                            continue;
                        }
                        if (var422 == 5003) {
                            var5 -= 2;
                            int var384 = field736[var5];
                            int var385 = field736[var5 + 1];
                            class31 var386 = class10.method81(var384, var385);
                            if (var386 == null) {
                                field736[var5++] = -1;
                                field736[var5++] = 0;
                                field721[var6++] = "";
                                field721[var6++] = "";
                                field721[var6++] = "";
                            } else {
                                field736[var5++] = var386.field716;
                                field736[var5++] = var386.field710;
                                field721[var6++] = var386.field714 == null ? "" : var386.field714;
                                field721[var6++] = var386.field713 == null ? "" : var386.field713;
                                field721[var6++] = var386.field712 == null ? "" : var386.field712;
                            }
                            continue;
                        }
                        if (var422 == 5004) {
                            var5--;
                            int var387 = field736[var5];
                            class31 var388 = class10.method2709(var387);
                            if (var388 == null) {
                                field736[var5++] = -1;
                                field736[var5++] = 0;
                                field721[var6++] = "";
                                field721[var6++] = "";
                                field721[var6++] = "";
                            } else {
                                field736[var5++] = var388.field711;
                                field736[var5++] = var388.field710;
                                field721[var6++] = var388.field714 == null ? "" : var388.field714;
                                field721[var6++] = var388.field713 == null ? "" : var388.field713;
                                field721[var6++] = var388.field712 == null ? "" : var388.field712;
                            }
                            continue;
                        }
                        if (var422 == 5005) {
                            if (Statics.field570 == null) {
                                field736[var5++] = -1;
                            } else {
                                field736[var5++] = Statics.field570.field1904;
                            }
                            continue;
                        }
                        if (var422 == 5008) {
                            var6--;
                            String var389 = field721[var6];
                            var5--;
                            int var390 = field736[var5];
                            String var391 = var389.toLowerCase();
                            byte var392 = 0;
                            if (var391.startsWith(class142.field2317)) {
                                var392 = 0;
                                var389 = var389.substring(class142.field2317.length());
                            } else if (var391.startsWith(class142.field2319)) {
                                var392 = 1;
                                var389 = var389.substring(class142.field2319.length());
                            } else if (var391.startsWith(class142.field2321)) {
                                var392 = 2;
                                var389 = var389.substring(class142.field2321.length());
                            } else if (var391.startsWith(class142.field2323)) {
                                var392 = 3;
                                var389 = var389.substring(class142.field2323.length());
                            } else if (var391.startsWith(class142.field2325)) {
                                var392 = 4;
                                var389 = var389.substring(class142.field2325.length());
                            } else if (var391.startsWith(class142.field2327)) {
                                var392 = 5;
                                var389 = var389.substring(class142.field2327.length());
                            } else if (var391.startsWith(class142.field2329)) {
                                var392 = 6;
                                var389 = var389.substring(class142.field2329.length());
                            } else if (var391.startsWith(class142.field2381)) {
                                var392 = 7;
                                var389 = var389.substring(class142.field2381.length());
                            } else if (var391.startsWith(class142.field2333)) {
                                var392 = 8;
                                var389 = var389.substring(class142.field2333.length());
                            } else if (var391.startsWith(class142.field2335)) {
                                var392 = 9;
                                var389 = var389.substring(class142.field2335.length());
                            } else if (var391.startsWith(class142.field2337)) {
                                var392 = 10;
                                var389 = var389.substring(class142.field2337.length());
                            } else if (var391.startsWith(class142.field2295)) {
                                var392 = 11;
                                var389 = var389.substring(class142.field2295.length());
                            } else if (client.field265 != 0) {
                                if (var391.startsWith(class142.field2318)) {
                                    var392 = 0;
                                    var389 = var389.substring(class142.field2318.length());
                                } else if (var391.startsWith(class142.field2169)) {
                                    var392 = 1;
                                    var389 = var389.substring(class142.field2169.length());
                                } else if (var391.startsWith(class142.field2322)) {
                                    var392 = 2;
                                    var389 = var389.substring(class142.field2322.length());
                                } else if (var391.startsWith(class142.field2324)) {
                                    var392 = 3;
                                    var389 = var389.substring(class142.field2324.length());
                                } else if (var391.startsWith(class142.field2165)) {
                                    var392 = 4;
                                    var389 = var389.substring(class142.field2165.length());
                                } else if (var391.startsWith(class142.field2328)) {
                                    var392 = 5;
                                    var389 = var389.substring(class142.field2328.length());
                                } else if (var391.startsWith(class142.field2330)) {
                                    var392 = 6;
                                    var389 = var389.substring(class142.field2330.length());
                                } else if (var391.startsWith(class142.field2283)) {
                                    var392 = 7;
                                    var389 = var389.substring(class142.field2283.length());
                                } else if (var391.startsWith(class142.field2334)) {
                                    var392 = 8;
                                    var389 = var389.substring(class142.field2334.length());
                                } else if (var391.startsWith(class142.field2336)) {
                                    var392 = 9;
                                    var389 = var389.substring(class142.field2336.length());
                                } else if (var391.startsWith(class142.field2338)) {
                                    var392 = 10;
                                    var389 = var389.substring(class142.field2338.length());
                                } else if (var391.startsWith(class142.field2202)) {
                                    var392 = 11;
                                    var389 = var389.substring(class142.field2202.length());
                                }
                            }
                            String var393 = var389.toLowerCase();
                            byte var394 = 0;
                            if (var393.startsWith(class142.field2341)) {
                                var394 = 1;
                                var389 = var389.substring(class142.field2341.length());
                            } else if (var393.startsWith(class142.field2343)) {
                                var394 = 2;
                                var389 = var389.substring(class142.field2343.length());
                            } else if (var393.startsWith(class142.field2345)) {
                                var394 = 3;
                                var389 = var389.substring(class142.field2345.length());
                            } else if (var393.startsWith(class142.field2151)) {
                                var394 = 4;
                                var389 = var389.substring(class142.field2151.length());
                            } else if (var393.startsWith(class142.field2221)) {
                                var394 = 5;
                                var389 = var389.substring(class142.field2221.length());
                            } else if (client.field265 != 0) {
                                if (var393.startsWith(class142.field2342)) {
                                    var394 = 1;
                                    var389 = var389.substring(class142.field2342.length());
                                } else if (var393.startsWith(class142.field2344)) {
                                    var394 = 2;
                                    var389 = var389.substring(class142.field2344.length());
                                } else if (var393.startsWith(class142.field2346)) {
                                    var394 = 3;
                                    var389 = var389.substring(class142.field2346.length());
                                } else if (var393.startsWith(class142.field2366)) {
                                    var394 = 4;
                                    var389 = var389.substring(class142.field2366.length());
                                } else if (var393.startsWith(class142.field2350)) {
                                    var394 = 5;
                                    var389 = var389.substring(class142.field2350.length());
                                }
                            }
                            client.field302.method2386(139);
                            client.field302.method2137(0);
                            int var395 = client.field302.field1837;
                            client.field302.method2137(var390);
                            client.field302.method2137(var392);
                            client.field302.method2137(var394);
                            class191.method578(client.field302, var389);
                            client.field302.method2275(client.field302.field1837 - var395);
                            continue;
                        }
                        if (var422 == 5009) {
                            var6 -= 2;
                            String var396 = field721[var6];
                            String var397 = field721[var6 + 1];
                            client.field302.method2386(121);
                            client.field302.method2235(0);
                            int var398 = client.field302.field1837;
                            client.field302.method2148(var396);
                            class191.method578(client.field302, var397);
                            client.field302.method2147(client.field302.field1837 - var398);
                            continue;
                        }
                        if (var422 == 5015) {
                            String var399;
                            if (Statics.field1667 == null || Statics.field1667.field42 == null) {
                                var399 = "";
                            } else {
                                var399 = Statics.field1667.field42;
                            }
                            field721[var6++] = var399;
                            continue;
                        }
                        if (var422 == 5016) {
                            field736[var5++] = client.field475;
                            continue;
                        }
                        if (var422 == 5017) {
                            var5--;
                            int var400 = field736[var5];
                            int[] var401 = field736;
                            int var402 = var5++;
                            class24 var403 = (class24) class10.field165.get(var400);
                            int var404;
                            if (var403 == null) {
                                var404 = 0;
                            } else {
                                var404 = var403.method507();
                            }
                            var401[var402] = var404;
                            continue;
                        }
                        if (var422 == 5018) {
                            var5--;
                            int var405 = field736[var5];
                            int[] var406 = field736;
                            int var407 = var5++;
                            class31 var408 = (class31) class10.field160.method3237((long) var405);
                            int var409;
                            if (var408 == null) {
                                var409 = -1;
                            } else if (class10.field161.field2855 == var408.field2859) {
                                var409 = -1;
                            } else {
                                var409 = ((class31) var408.field2859).field716;
                            }
                            var406[var407] = var409;
                            continue;
                        }
                        if (var422 == 5019) {
                            var5--;
                            int var410 = field736[var5];
                            int[] var411 = field736;
                            int var412 = var5++;
                            class31 var413 = (class31) class10.field160.method3237((long) var410);
                            int var414;
                            if (var413 == null) {
                                var414 = -1;
                            } else if (class10.field161.field2855 == var413.field2860) {
                                var414 = -1;
                            } else {
                                var414 = ((class31) var413.field2860).field716;
                            }
                            var411[var412] = var414;
                            continue;
                        }
                        if (var422 == 5020) {
                            var6--;
                            String var415 = field721[var6];
                            if (var415.equalsIgnoreCase("toggleroof")) {
                                Statics.field1357.field146 = !Statics.field1357.field146;
                                class9.method2552();
                                if (Statics.field1357.field146) {
                                    class10.method566(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method566(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field428 >= 2) {
                                if (var415.equalsIgnoreCase("fpson")) {
                                    client.field310 = true;
                                }
                                if (var415.equalsIgnoreCase("fpsoff")) {
                                    client.field310 = false;
                                }
                                if (var415.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var415.equalsIgnoreCase("clientdrop")) {
                                    client.method634();
                                }
                                if (var415.equalsIgnoreCase("errortest") && client.field260 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field302.method2386(242);
                            client.field302.method2137(var415.length() + 1);
                            client.field302.method2148(var415);
                            continue;
                        }
                    }
                }
                if (var422 >= 5600 || var422 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var416 = field736[var5];
                int var417 = field736[var5 + 1];
                if (!client.field504) {
                    client.field343 = var416;
                    client.field344 = var417;
                }
            }
        } catch (Exception var421) {
            StringBuilder var419 = new StringBuilder(30);
            var419.append("").append(var4.field2871).append(" ");
            for (int var420 = field734 - 1; var420 >= 0; var420--) {
                var419.append("").append(field717[var420].field196.field2871).append(" ");
            }
            var419.append("").append(var10);
            class135.method2595(var419.toString(), var421);
        }
    }

    @ObfuscatedName("cs.h(IB)V")
    public static void method1987(int arg0) {
        if (arg0 == -1 || !class152.method525(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2584[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3.field2599 != null) {
                class1 var4 = new class1();
                var4.field5 = var3;
                var4.field17 = var3.field2599;
                method2848(var4, 2000000);
            }
        }
    }
}
