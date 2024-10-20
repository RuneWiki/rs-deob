package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aw")
public class class32 {

    @ObfuscatedName("aw.d")
    public static int[] field717 = new int[5];

    @ObfuscatedName("aw.q")
    public static int[][] field718 = new int[5][5000];

    @ObfuscatedName("aw.m")
    public static int[] field719 = new int[1000];

    @ObfuscatedName("aw.a")
    public static String[] field720 = new String[1000];

    @ObfuscatedName("aw.w")
    public static int field714 = 0;

    @ObfuscatedName("aw.e")
    public static class13[] field723 = new class13[50];

    @ObfuscatedName("aw.z")
    public static Calendar field724 = Calendar.getInstance();

    @ObfuscatedName("aw.j")
    public static final String[] field729 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.n(Ln;II)V")
    public static void method2843(class1 arg0, int arg1) {
        Object[] var2 = arg0.field12;
        int var3 = (Integer) var2[0];
        class19 var4 = Statics.method83(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field539;
        int[] var9 = var4.field540;
        byte var10 = -1;
        field714 = 0;
        try {
            Statics.field716 = new int[var4.field544];
            int var11 = 0;
            Statics.field65 = new String[var4.field542];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2641;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field13;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2584;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2641;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2584;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field716[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field65[var12++] = var15;
                }
            }
            int var16 = 0;
            label2445: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var424 = var8[var7];
                if (var424 < 100) {
                    if (var424 == 0) {
                        field719[var5++] = var9[var7];
                        continue;
                    }
                    if (var424 == 1) {
                        int var17 = var9[var7];
                        field719[var5++] = class155.field2663[var17];
                        continue;
                    }
                    if (var424 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class155.field2663[var18] = field719[var5];
                        client.method29(var18);
                        continue;
                    }
                    if (var424 == 3) {
                        field720[var6++] = var4.field538[var7];
                        continue;
                    }
                    if (var424 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var424 == 7) {
                        var5 -= 2;
                        if (field719[var5 + 1] != field719[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var424 == 8) {
                        var5 -= 2;
                        if (field719[var5 + 1] == field719[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var424 == 9) {
                        var5 -= 2;
                        if (field719[var5] < field719[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var424 == 10) {
                        var5 -= 2;
                        if (field719[var5] > field719[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var424 == 21) {
                        if (field714 == 0) {
                            return;
                        }
                        class13 var19 = field723[--field714];
                        var4 = var19.field200;
                        var8 = var4.field539;
                        var9 = var4.field540;
                        var7 = var19.field199;
                        Statics.field716 = var19.field204;
                        Statics.field65 = var19.field201;
                        continue;
                    }
                    if (var424 == 25) {
                        int var20 = var9[var7];
                        field719[var5++] = class155.method2650(var20);
                        continue;
                    }
                    if (var424 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field719[var5];
                        class42 var23 = (class42) class42.field974.method3115((long) var21);
                        class42 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field975.method2738(14, var21);
                            class42 var26 = new class42();
                            if (var25 != null) {
                                var26.method819(new class107(var25));
                            }
                            class42.field974.method3117(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field976;
                        int var29 = var24.field973;
                        int var30 = var24.field977;
                        int var31 = class155.field2667[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class155.field2663[var28] = class155.field2663[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var424 == 31) {
                        var5 -= 2;
                        if (field719[var5] <= field719[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var424 == 32) {
                        var5 -= 2;
                        if (field719[var5] >= field719[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var424 == 33) {
                        field719[var5++] = Statics.field716[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var424 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field716[var10001] = field719[var5];
                        continue;
                    }
                    if (var424 == 35) {
                        field720[var6++] = Statics.field65[var9[var7]];
                        continue;
                    }
                    if (var424 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field65[var10001] = field720[var6];
                        continue;
                    }
                    if (var424 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String[] var34 = field720;
                        String var35;
                        if (var33 == 0) {
                            var35 = "";
                        } else if (var33 == 1) {
                            String var36 = var34[var6];
                            if (var36 == null) {
                                var35 = "null";
                            } else {
                                var35 = var36.toString();
                            }
                        } else {
                            int var37 = var6 + var33;
                            int var38 = 0;
                            for (int var39 = var6; var39 < var37; var39++) {
                                String var40 = var34[var39];
                                if (var40 == null) {
                                    var38 += 4;
                                } else {
                                    var38 += var40.length();
                                }
                            }
                            StringBuilder var41 = new StringBuilder(var38);
                            for (int var42 = var6; var42 < var37; var42++) {
                                String var43 = var34[var42];
                                if (var43 == null) {
                                    var41.append("null");
                                } else {
                                    var41.append(var43);
                                }
                            }
                            var35 = var41.toString();
                        }
                        field720[var6++] = var35;
                        continue;
                    }
                    if (var424 == 38) {
                        var5--;
                        continue;
                    }
                    if (var424 == 39) {
                        var6--;
                        continue;
                    }
                    if (var424 == 40) {
                        int var45 = var9[var7];
                        class19 var46 = Statics.method83(var45);
                        int[] var47 = new int[var46.field544];
                        String[] var48 = new String[var46.field542];
                        for (int var49 = 0; var49 < var46.field551; var49++) {
                            var47[var49] = field719[var5 - var46.field551 + var49];
                        }
                        for (int var50 = 0; var50 < var46.field545; var50++) {
                            var48[var50] = field720[var6 - var46.field545 + var50];
                        }
                        var5 -= var46.field551;
                        var6 -= var46.field545;
                        class13 var51 = new class13();
                        var51.field200 = var4;
                        var51.field199 = var7;
                        var51.field204 = Statics.field716;
                        var51.field201 = Statics.field65;
                        field723[++field714 - 1] = var51;
                        var4 = var46;
                        var8 = var46.field539;
                        var9 = var46.field540;
                        var7 = -1;
                        Statics.field716 = var47;
                        Statics.field65 = var48;
                        continue;
                    }
                    if (var424 == 42) {
                        field719[var5++] = client.field455[var9[var7]];
                        continue;
                    }
                    if (var424 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field455[var10001] = field719[var5];
                        continue;
                    }
                    if (var424 == 44) {
                        int var52 = var9[var7] >> 16;
                        int var53 = var9[var7] & 0xFFFF;
                        var5--;
                        int var54 = field719[var5];
                        if (var54 >= 0 && var54 <= 5000) {
                            field717[var52] = var54;
                            byte var55 = -1;
                            if (var53 == 105) {
                                var55 = 0;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54) {
                                    continue label2445;
                                }
                                field718[var52][var56] = var55;
                                var56++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var424 == 45) {
                        int var57 = var9[var7];
                        var5--;
                        int var58 = field719[var5];
                        if (var58 >= 0 && var58 < field717[var57]) {
                            field719[var5++] = field718[var57][var58];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var424 == 46) {
                        int var59 = var9[var7];
                        var5 -= 2;
                        int var60 = field719[var5];
                        if (var60 >= 0 && var60 < field717[var59]) {
                            field718[var59][var60] = field719[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var424 == 47) {
                        String var61 = client.field456[var9[var7]];
                        if (var61 == null) {
                            var61 = "null";
                        }
                        field720[var6++] = var61;
                        continue;
                    }
                    if (var424 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field456[var10001] = field720[var6];
                        continue;
                    }
                }
                boolean var62;
                if (var9[var7] == 1) {
                    var62 = true;
                } else {
                    var62 = false;
                }
                if (var424 < 1000) {
                    if (var424 == 100) {
                        var5 -= 3;
                        int var63 = field719[var5];
                        int var64 = field719[var5 + 1];
                        int var65 = field719[var5 + 2];
                        if (var64 == 0) {
                            throw new RuntimeException();
                        }
                        class153 var66 = class153.method1974(var63);
                        if (var66.field2640 == null) {
                            var66.field2640 = new class153[var65 + 1];
                        }
                        if (var66.field2640.length <= var65) {
                            class153[] var67 = new class153[var65 + 1];
                            for (int var68 = 0; var68 < var66.field2640.length; var68++) {
                                var67[var68] = var66.field2640[var68];
                            }
                            var66.field2640 = var67;
                        }
                        if (var65 > 0 && var66.field2640[var65 - 1] == null) {
                            throw new RuntimeException("" + (var65 - 1));
                        }
                        class153 var69 = new class153();
                        var69.field2534 = var64;
                        var69.field2543 = var69.field2641 = var66.field2641;
                        var69.field2584 = var65;
                        var69.field2531 = true;
                        var66.field2640[var65] = var69;
                        if (var62) {
                            Statics.field722 = var69;
                        } else {
                            Statics.field637 = var69;
                        }
                        client.method2750(var66);
                        continue;
                    }
                    if (var424 == 101) {
                        class153 var70 = var62 ? Statics.field722 : Statics.field637;
                        class153 var71 = class153.method1974(var70.field2641);
                        var71.field2640[var70.field2584] = null;
                        client.method2750(var71);
                        continue;
                    }
                    if (var424 == 102) {
                        var5--;
                        class153 var72 = class153.method1974(field719[var5]);
                        var72.field2640 = null;
                        client.method2750(var72);
                        continue;
                    }
                    if (var424 == 200) {
                        var5 -= 2;
                        int var73 = field719[var5];
                        int var74 = field719[var5 + 1];
                        class153 var75 = class153.method1781(var73, var74);
                        if (var75 != null && var74 != -1) {
                            field719[var5++] = 1;
                            if (var62) {
                                Statics.field722 = var75;
                            } else {
                                Statics.field637 = var75;
                            }
                            continue;
                        }
                        field719[var5++] = 0;
                        continue;
                    }
                } else if (!(var424 < 1000 || var424 >= 1100) || !(var424 < 2000 || var424 >= 2100)) {
                    class153 var76;
                    if (var424 >= 2000) {
                        var424 -= 1000;
                        var5--;
                        var76 = class153.method1974(field719[var5]);
                    } else {
                        var76 = var62 ? Statics.field722 : Statics.field637;
                    }
                    if (var424 == 1000) {
                        var5 -= 2;
                        var76.field2537 = field719[var5];
                        var76.field2538 = field719[var5 + 1];
                        client.method2750(var76);
                        continue;
                    }
                    if (var424 == 1001) {
                        var5 -= 2;
                        var76.field2541 = field719[var5];
                        var76.field2542 = field719[var5 + 1];
                        client.method2750(var76);
                        continue;
                    }
                    if (var424 == 1003) {
                        var5--;
                        boolean var77 = field719[var5] == 1;
                        if (var76.field2544 != var77) {
                            var76.field2544 = var77;
                            client.method2750(var76);
                        }
                        continue;
                    }
                } else if (var424 >= 1100 && var424 < 1200 || var424 >= 2100 && var424 < 2200) {
                    class153 var78;
                    if (var424 >= 2000) {
                        var424 -= 1000;
                        var5--;
                        var78 = class153.method1974(field719[var5]);
                    } else {
                        var78 = var62 ? Statics.field722 : Statics.field637;
                    }
                    if (var424 == 1100) {
                        var5 -= 2;
                        var78.field2582 = field719[var5];
                        if (var78.field2582 > var78.field2547 - var78.field2541) {
                            var78.field2582 = var78.field2547 - var78.field2541;
                        }
                        if (var78.field2582 < 0) {
                            var78.field2582 = 0;
                        }
                        var78.field2536 = field719[var5 + 1];
                        if (var78.field2536 > var78.field2548 - var78.field2542) {
                            var78.field2536 = var78.field2548 - var78.field2542;
                        }
                        if (var78.field2536 < 0) {
                            var78.field2536 = 0;
                        }
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1101) {
                        var5--;
                        var78.field2603 = field719[var5];
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1102) {
                        var5--;
                        var78.field2614 = field719[var5] == 1;
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1103) {
                        var5--;
                        var78.field2550 = field719[var5];
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1104) {
                        var5--;
                        var78.field2583 = field719[var5];
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1105) {
                        var5--;
                        var78.field2556 = field719[var5];
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1106) {
                        var5--;
                        var78.field2558 = field719[var5];
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1107) {
                        var5--;
                        var78.field2549 = field719[var5] == 1;
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1108) {
                        var78.field2564 = 1;
                        var5--;
                        var78.field2563 = field719[var5];
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1109) {
                        var5 -= 6;
                        var78.field2570 = field719[var5];
                        var78.field2522 = field719[var5 + 1];
                        var78.field2546 = field719[var5 + 2];
                        var78.field2573 = field719[var5 + 3];
                        var78.field2580 = field719[var5 + 4];
                        var78.field2572 = field719[var5 + 5];
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1110) {
                        var5--;
                        int var79 = field719[var5];
                        if (var78.field2568 != var79) {
                            var78.field2568 = var79;
                            var78.field2638 = 0;
                            var78.field2639 = 0;
                            client.method2750(var78);
                        }
                        continue;
                    }
                    if (var424 == 1111) {
                        var5--;
                        var78.field2577 = field719[var5] == 1;
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1112) {
                        var6--;
                        String var80 = field720[var6];
                        if (!var80.equals(var78.field2579)) {
                            var78.field2579 = var80;
                            client.method2750(var78);
                        }
                        continue;
                    }
                    if (var424 == 1113) {
                        var5--;
                        var78.field2578 = field719[var5];
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1114) {
                        var5 -= 3;
                        var78.field2647 = field719[var5];
                        var78.field2571 = field719[var5 + 1];
                        var78.field2581 = field719[var5 + 2];
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1115) {
                        var5--;
                        var78.field2600 = field719[var5] == 1;
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1116) {
                        var5--;
                        var78.field2595 = field719[var5];
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1117) {
                        var5--;
                        var78.field2561 = field719[var5];
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1118) {
                        var5--;
                        var78.field2610 = field719[var5] == 1;
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1119) {
                        var5--;
                        var78.field2637 = field719[var5] == 1;
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1120) {
                        var5 -= 2;
                        var78.field2547 = field719[var5];
                        var78.field2548 = field719[var5 + 1];
                        client.method2750(var78);
                        continue;
                    }
                    if (var424 == 1121) {
                        client.method99(var78.field2641, var78.field2584);
                        client.field424 = var78;
                        client.method2750(var78);
                        continue;
                    }
                } else if (var424 >= 1200 && var424 < 1300 || var424 >= 2200 && var424 < 2300) {
                    class153 var81;
                    if (var424 >= 2000) {
                        var424 -= 1000;
                        var5--;
                        var81 = class153.method1974(field719[var5]);
                    } else {
                        var81 = var62 ? Statics.field722 : Statics.field637;
                    }
                    client.method2750(var81);
                    if (var424 == 1200) {
                        var5 -= 2;
                        int var82 = field719[var5];
                        int var83 = field719[var5 + 1];
                        var81.field2636 = var82;
                        var81.field2597 = var83;
                        class45 var84 = class45.method1982(var82);
                        var81.field2546 = var84.field1020;
                        var81.field2573 = var84.field1021;
                        var81.field2580 = var84.field1022;
                        var81.field2570 = var84.field1023;
                        var81.field2522 = var84.field1006;
                        var81.field2572 = var84.field1019;
                        if (var81.field2541 > 0) {
                            var81.field2572 = var81.field2572 * 32 / var81.field2541;
                        }
                        continue;
                    }
                    if (var424 == 1201) {
                        var81.field2564 = 2;
                        var5--;
                        var81.field2563 = field719[var5];
                        continue;
                    }
                    if (var424 == 1202) {
                        var81.field2564 = 3;
                        var81.field2563 = Statics.field1751.field58.method2875();
                        continue;
                    }
                } else if ((var424 < 1300 || var424 >= 1400) && (var424 < 2300 || var424 >= 2400)) {
                    if (var424 >= 1400 && var424 < 1500 || var424 >= 2400 && var424 < 2500) {
                        class153 var89;
                        if (var424 >= 2000) {
                            var424 -= 1000;
                            var5--;
                            var89 = class153.method1974(field719[var5]);
                        } else {
                            var89 = var62 ? Statics.field722 : Statics.field637;
                        }
                        var6--;
                        String var90 = field720[var6];
                        int[] var91 = null;
                        if (var90.length() > 0 && var90.charAt(var90.length() - 1) == 'Y') {
                            var5--;
                            int var92 = field719[var5];
                            if (var92 > 0) {
                                var91 = new int[var92];
                                while (var92-- > 0) {
                                    var5--;
                                    var91[var92] = field719[var5];
                                }
                            }
                            var90 = var90.substring(0, var90.length() - 1);
                        }
                        Object[] var93 = new Object[var90.length() + 1];
                        for (int var94 = var93.length - 1; var94 >= 1; var94--) {
                            if (var90.charAt(var94 - 1) == 's') {
                                var6--;
                                var93[var94] = field720[var6];
                            } else {
                                var5--;
                                var93[var94] = Integer.valueOf(field719[var5]);
                            }
                        }
                        var5--;
                        int var95 = field719[var5];
                        if (var95 == -1) {
                            var93 = null;
                        } else {
                            var93[0] = Integer.valueOf(var95);
                        }
                        if (var424 == 1400) {
                            var89.field2601 = var93;
                        }
                        if (var424 == 1401) {
                            var89.field2566 = var93;
                        }
                        if (var424 == 1402) {
                            var89.field2569 = var93;
                        }
                        if (var424 == 1403) {
                            var89.field2627 = var93;
                        }
                        if (var424 == 1404) {
                            var89.field2607 = var93;
                        }
                        if (var424 == 1405) {
                            var89.field2553 = var93;
                        }
                        if (var424 == 1406) {
                            var89.field2611 = var93;
                        }
                        if (var424 == 1407) {
                            var89.field2533 = var93;
                            var89.field2613 = var91;
                        }
                        if (var424 == 1408) {
                            var89.field2598 = var93;
                        }
                        if (var424 == 1409) {
                            var89.field2619 = var93;
                        }
                        if (var424 == 1410) {
                            var89.field2609 = var93;
                        }
                        if (var424 == 1411) {
                            var89.field2602 = var93;
                        }
                        if (var424 == 1412) {
                            var89.field2606 = var93;
                        }
                        if (var424 == 1414) {
                            var89.field2526 = var93;
                            var89.field2615 = var91;
                        }
                        if (var424 == 1415) {
                            var89.field2616 = var93;
                            var89.field2617 = var91;
                        }
                        if (var424 == 1416) {
                            var89.field2532 = var93;
                        }
                        if (var424 == 1417) {
                            var89.field2620 = var93;
                        }
                        if (var424 == 1418) {
                            var89.field2523 = var93;
                        }
                        if (var424 == 1419) {
                            var89.field2622 = var93;
                        }
                        if (var424 == 1420) {
                            var89.field2623 = var93;
                        }
                        if (var424 == 1421) {
                            var89.field2624 = var93;
                        }
                        if (var424 == 1422) {
                            var89.field2625 = var93;
                        }
                        if (var424 == 1423) {
                            var89.field2626 = var93;
                        }
                        if (var424 == 1424) {
                            var89.field2574 = var93;
                        }
                        var89.field2599 = true;
                        continue;
                    }
                    if (var424 < 1600) {
                        class153 var96 = var62 ? Statics.field722 : Statics.field637;
                        if (var424 == 1500) {
                            field719[var5++] = var96.field2537;
                            continue;
                        }
                        if (var424 == 1501) {
                            field719[var5++] = var96.field2538;
                            continue;
                        }
                        if (var424 == 1502) {
                            field719[var5++] = var96.field2541;
                            continue;
                        }
                        if (var424 == 1503) {
                            field719[var5++] = var96.field2542;
                            continue;
                        }
                        if (var424 == 1504) {
                            field719[var5++] = var96.field2544 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 1505) {
                            field719[var5++] = var96.field2543;
                            continue;
                        }
                    } else if (var424 < 1700) {
                        class153 var97 = var62 ? Statics.field722 : Statics.field637;
                        if (var424 == 1600) {
                            field719[var5++] = var97.field2582;
                            continue;
                        }
                        if (var424 == 1601) {
                            field719[var5++] = var97.field2536;
                            continue;
                        }
                        if (var424 == 1602) {
                            field720[var6++] = var97.field2579;
                            continue;
                        }
                        if (var424 == 1603) {
                            field719[var5++] = var97.field2547;
                            continue;
                        }
                        if (var424 == 1604) {
                            field719[var5++] = var97.field2548;
                            continue;
                        }
                        if (var424 == 1605) {
                            field719[var5++] = var97.field2572;
                            continue;
                        }
                        if (var424 == 1606) {
                            field719[var5++] = var97.field2546;
                            continue;
                        }
                        if (var424 == 1607) {
                            field719[var5++] = var97.field2580;
                            continue;
                        }
                        if (var424 == 1608) {
                            field719[var5++] = var97.field2573;
                            continue;
                        }
                    } else if (var424 < 1800) {
                        class153 var98 = var62 ? Statics.field722 : Statics.field637;
                        if (var424 == 1700) {
                            field719[var5++] = var98.field2636;
                            continue;
                        }
                        if (var424 == 1701) {
                            if (var98.field2636 == -1) {
                                field719[var5++] = 0;
                            } else {
                                field719[var5++] = var98.field2597;
                            }
                            continue;
                        }
                        if (var424 == 1702) {
                            field719[var5++] = var98.field2584;
                            continue;
                        }
                    } else if (var424 < 1900) {
                        class153 var99 = var62 ? Statics.field722 : Statics.field637;
                        if (var424 == 1800) {
                            int[] var100 = field719;
                            int var101 = var5++;
                            int var102 = client.method3(var99);
                            int var103 = var102 >> 11 & 0x3F;
                            var100[var101] = var103;
                            continue;
                        }
                        if (var424 == 1801) {
                            var5--;
                            int var104 = field719[var5];
                            int var425 = var104 - 1;
                            if (var99.field2605 != null && var425 < var99.field2605.length && var99.field2605[var425] != null) {
                                field720[var6++] = var99.field2605[var425];
                                continue;
                            }
                            field720[var6++] = "";
                            continue;
                        }
                        if (var424 == 1802) {
                            if (var99.field2592 == null) {
                                field720[var6++] = "";
                            } else {
                                field720[var6++] = var99.field2592;
                            }
                            continue;
                        }
                    } else if (var424 < 2600) {
                        var5--;
                        class153 var105 = class153.method1974(field719[var5]);
                        if (var424 == 2500) {
                            field719[var5++] = var105.field2537;
                            continue;
                        }
                        if (var424 == 2501) {
                            field719[var5++] = var105.field2538;
                            continue;
                        }
                        if (var424 == 2502) {
                            field719[var5++] = var105.field2541;
                            continue;
                        }
                        if (var424 == 2503) {
                            field719[var5++] = var105.field2542;
                            continue;
                        }
                        if (var424 == 2504) {
                            field719[var5++] = var105.field2544 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 2505) {
                            field719[var5++] = var105.field2543;
                            continue;
                        }
                    } else if (var424 < 2700) {
                        var5--;
                        class153 var106 = class153.method1974(field719[var5]);
                        if (var424 == 2600) {
                            field719[var5++] = var106.field2582;
                            continue;
                        }
                        if (var424 == 2601) {
                            field719[var5++] = var106.field2536;
                            continue;
                        }
                        if (var424 == 2602) {
                            field720[var6++] = var106.field2579;
                            continue;
                        }
                        if (var424 == 2603) {
                            field719[var5++] = var106.field2547;
                            continue;
                        }
                        if (var424 == 2604) {
                            field719[var5++] = var106.field2548;
                            continue;
                        }
                        if (var424 == 2605) {
                            field719[var5++] = var106.field2572;
                            continue;
                        }
                        if (var424 == 2606) {
                            field719[var5++] = var106.field2546;
                            continue;
                        }
                        if (var424 == 2607) {
                            field719[var5++] = var106.field2580;
                            continue;
                        }
                        if (var424 == 2608) {
                            field719[var5++] = var106.field2573;
                            continue;
                        }
                    } else if (var424 < 2800) {
                        if (var424 == 2700) {
                            var5--;
                            class153 var107 = class153.method1974(field719[var5]);
                            field719[var5++] = var107.field2636;
                            continue;
                        }
                        if (var424 == 2701) {
                            var5--;
                            class153 var108 = class153.method1974(field719[var5]);
                            if (var108.field2636 == -1) {
                                field719[var5++] = 0;
                            } else {
                                field719[var5++] = var108.field2597;
                            }
                            continue;
                        }
                        if (var424 == 2702) {
                            var5--;
                            int var109 = field719[var5];
                            class4 var110 = (class4) client.field351.method3149((long) var109);
                            if (var110 == null) {
                                field719[var5++] = 0;
                            } else {
                                field719[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var424 < 2900) {
                        var5--;
                        class153 var111 = class153.method1974(field719[var5]);
                        if (var424 == 2800) {
                            int[] var112 = field719;
                            int var113 = var5++;
                            int var114 = client.method3(var111);
                            int var115 = var114 >> 11 & 0x3F;
                            var112[var113] = var115;
                            continue;
                        }
                        if (var424 == 2801) {
                            var5--;
                            int var116 = field719[var5];
                            int var426 = var116 - 1;
                            if (var111.field2605 != null && var426 < var111.field2605.length && var111.field2605[var426] != null) {
                                field720[var6++] = var111.field2605[var426];
                                continue;
                            }
                            field720[var6++] = "";
                            continue;
                        }
                        if (var424 == 2802) {
                            if (var111.field2592 == null) {
                                field720[var6++] = "";
                            } else {
                                field720[var6++] = var111.field2592;
                            }
                            continue;
                        }
                    } else if (var424 < 3200) {
                        if (var424 == 3100) {
                            var6--;
                            String var117 = field720[var6];
                            class10.method2769(0, "", var117);
                            continue;
                        }
                        if (var424 == 3101) {
                            var5 -= 2;
                            client.method2646(Statics.field1751, field719[var5], field719[var5 + 1]);
                            continue;
                        }
                        if (var424 == 3103) {
                            client.field301.method2355(48);
                            for (class4 var118 = (class4) client.field351.method3153(); var118 != null; var118 = (class4) client.field351.method3151()) {
                                if (var118.field70 == 0 || var118.field70 == 3) {
                                    client.method589(var118, true);
                                }
                            }
                            if (client.field424 != null) {
                                client.method2750(client.field424);
                                client.field424 = null;
                            }
                            continue;
                        }
                        if (var424 == 3104) {
                            var6--;
                            String var119 = field720[var6];
                            int var120 = 0;
                            if (class200.method2356(var119)) {
                                int var121 = class200.method584(var119, 10, true);
                                var120 = var121;
                            }
                            client.field301.method2355(50);
                            client.field301.method2127(var120);
                            continue;
                        }
                        if (var424 == 3105) {
                            var6--;
                            String var122 = field720[var6];
                            client.field301.method2355(111);
                            client.field301.method2124(var122.length() + 1);
                            client.field301.method2176(var122);
                            continue;
                        }
                        if (var424 == 3106) {
                            var6--;
                            String var123 = field720[var6];
                            client.field301.method2355(114);
                            client.field301.method2124(var123.length() + 1);
                            client.field301.method2176(var123);
                            continue;
                        }
                        if (var424 == 3107) {
                            var5--;
                            int var124 = field719[var5];
                            var6--;
                            String var125 = field720[var6];
                            client.method2652(var124, var125);
                            continue;
                        }
                        if (var424 == 3108) {
                            var5 -= 3;
                            int var126 = field719[var5];
                            int var127 = field719[var5 + 1];
                            int var128 = field719[var5 + 2];
                            class153 var129 = class153.method1974(var128);
                            client.method522(var129, var126, var127);
                            continue;
                        }
                        if (var424 == 3109) {
                            var5 -= 2;
                            int var130 = field719[var5];
                            int var131 = field719[var5 + 1];
                            class153 var132 = var62 ? Statics.field722 : Statics.field637;
                            client.method522(var132, var130, var131);
                            continue;
                        }
                        if (var424 == 3110) {
                            var5--;
                            Statics.field285 = field719[var5] == 1;
                            continue;
                        }
                        if (var424 == 3111) {
                            field719[var5++] = Statics.field2430.field140 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 3112) {
                            var5--;
                            Statics.field2430.field140 = field719[var5] == 1;
                            Statics.method910();
                            continue;
                        }
                        if (var424 == 3113) {
                            var6--;
                            String var133 = field720[var6];
                            var5--;
                            boolean var134 = field719[var5] == 1;
                            class125.method1320(var133, var134, "openjs", false);
                            continue;
                        }
                    } else if (var424 < 3300) {
                        if (var424 == 3200) {
                            var5 -= 3;
                            int var135 = field719[var5];
                            int var136 = field719[var5 + 1];
                            int var137 = field719[var5 + 2];
                            if (client.field435 != 0 && var136 != 0 && client.field322 < 50) {
                                client.field498[client.field322] = var135;
                                client.field388[client.field322] = var136;
                                client.field500[client.field322] = var137;
                                client.field344[client.field322] = null;
                                client.field470[client.field322] = 0;
                                client.field322++;
                            }
                            continue;
                        }
                        if (var424 == 3201) {
                            var5--;
                            int var138 = field719[var5];
                            if (var138 == -1 && !client.field288) {
                                class162.method2782();
                            } else if (var138 != -1 && client.field493 != var138 && client.field418 != 0 && !client.field288) {
                                class162.method1606(2, Statics.field154, var138, 0, client.field418, false);
                            }
                            client.field493 = var138;
                            continue;
                        }
                        if (var424 == 3202) {
                            var5 -= 2;
                            client.method145(field719[var5], field719[var5 + 1]);
                            continue;
                        }
                    } else if (var424 < 3400) {
                        if (var424 == 3300) {
                            field719[var5++] = client.field440;
                            continue;
                        }
                        if (var424 == 3301) {
                            var5 -= 2;
                            int var139 = field719[var5];
                            int var140 = field719[var5 + 1];
                            int[] var141 = field719;
                            int var142 = var5++;
                            class14 var143 = (class14) class14.field209.method3149((long) var139);
                            int var144;
                            if (var143 == null) {
                                var144 = -1;
                            } else if (var140 >= 0 && var140 < var143.field208.length) {
                                var144 = var143.field208[var140];
                            } else {
                                var144 = -1;
                            }
                            var141[var142] = var144;
                            continue;
                        }
                        if (var424 == 3302) {
                            var5 -= 2;
                            int var145 = field719[var5];
                            int var146 = field719[var5 + 1];
                            field719[var5++] = class14.method2498(var145, var146);
                            continue;
                        }
                        if (var424 == 3303) {
                            var5 -= 2;
                            int var147 = field719[var5];
                            int var148 = field719[var5 + 1];
                            int[] var149 = field719;
                            int var150 = var5++;
                            class14 var151 = (class14) class14.field209.method3149((long) var147);
                            int var152;
                            if (var151 == null) {
                                var152 = 0;
                            } else if (var148 == -1) {
                                var152 = 0;
                            } else {
                                int var153 = 0;
                                for (int var154 = 0; var154 < var151.field210.length; var154++) {
                                    if (var151.field208[var154] == var148) {
                                        var153 += var151.field210[var154];
                                    }
                                }
                                var152 = var153;
                            }
                            var149[var150] = var152;
                            continue;
                        }
                        if (var424 == 3304) {
                            var5--;
                            int var155 = field719[var5];
                            int[] var156 = field719;
                            int var157 = var5++;
                            class44 var158 = (class44) class44.field1003.method3115((long) var155);
                            class44 var159;
                            if (var158 == null) {
                                byte[] var160 = Statics.field1000.method2738(5, var155);
                                class44 var161 = new class44();
                                if (var160 != null) {
                                    var161.method837(new class107(var160));
                                }
                                class44.field1003.method3117(var161, (long) var155);
                                var159 = var161;
                            } else {
                                var159 = var158;
                            }
                            var156[var157] = var159.field998;
                            continue;
                        }
                        if (var424 == 3305) {
                            var5--;
                            int var162 = field719[var5];
                            field719[var5++] = client.field397[var162];
                            continue;
                        }
                        if (var424 == 3306) {
                            var5--;
                            int var163 = field719[var5];
                            field719[var5++] = client.field398[var163];
                            continue;
                        }
                        if (var424 == 3307) {
                            var5--;
                            int var164 = field719[var5];
                            field719[var5++] = client.field443[var164];
                            continue;
                        }
                        if (var424 == 3308) {
                            int var165 = Statics.field83;
                            int var166 = (Statics.field1751.field772 >> 7) + Statics.field1791;
                            int var167 = (Statics.field1751.field732 >> 7) + Statics.field1002;
                            field719[var5++] = (var165 << 28) + (var166 << 14) + var167;
                            continue;
                        }
                        if (var424 == 3309) {
                            var5--;
                            int var168 = field719[var5];
                            field719[var5++] = var168 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var424 == 3310) {
                            var5--;
                            int var169 = field719[var5];
                            field719[var5++] = var169 >> 28;
                            continue;
                        }
                        if (var424 == 3311) {
                            var5--;
                            int var170 = field719[var5];
                            field719[var5++] = var170 & 0x3FFF;
                            continue;
                        }
                        if (var424 == 3312) {
                            field719[var5++] = client.field261 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 3313) {
                            var5 -= 2;
                            int var171 = field719[var5] + 32768;
                            int var172 = field719[var5 + 1];
                            int[] var173 = field719;
                            int var174 = var5++;
                            class14 var175 = (class14) class14.field209.method3149((long) var171);
                            int var176;
                            if (var175 == null) {
                                var176 = -1;
                            } else if (var172 >= 0 && var172 < var175.field208.length) {
                                var176 = var175.field208[var172];
                            } else {
                                var176 = -1;
                            }
                            var173[var174] = var176;
                            continue;
                        }
                        if (var424 == 3314) {
                            var5 -= 2;
                            int var177 = field719[var5] + 32768;
                            int var178 = field719[var5 + 1];
                            field719[var5++] = class14.method2498(var177, var178);
                            continue;
                        }
                        if (var424 == 3315) {
                            var5 -= 2;
                            int var179 = field719[var5] + 32768;
                            int var180 = field719[var5 + 1];
                            int[] var181 = field719;
                            int var182 = var5++;
                            class14 var183 = (class14) class14.field209.method3149((long) var179);
                            int var184;
                            if (var183 == null) {
                                var184 = 0;
                            } else if (var180 == -1) {
                                var184 = 0;
                            } else {
                                int var185 = 0;
                                for (int var186 = 0; var186 < var183.field210.length; var186++) {
                                    if (var183.field208[var186] == var180) {
                                        var185 += var183.field210[var186];
                                    }
                                }
                                var184 = var185;
                            }
                            var181[var182] = var184;
                            continue;
                        }
                        if (var424 == 3316) {
                            if (client.field427 >= 2) {
                                field719[var5++] = client.field427;
                            } else {
                                field719[var5++] = 0;
                            }
                            continue;
                        }
                        if (var424 == 3317) {
                            field719[var5++] = client.field274;
                            continue;
                        }
                        if (var424 == 3318) {
                            field719[var5++] = client.field257;
                            continue;
                        }
                        if (var424 == 3321) {
                            field719[var5++] = client.field425;
                            continue;
                        }
                        if (var424 == 3322) {
                            field719[var5++] = client.field436;
                            continue;
                        }
                        if (var424 == 3323) {
                            if (client.field429) {
                                field719[var5++] = 1;
                            } else {
                                field719[var5++] = 0;
                            }
                            continue;
                        }
                        if (var424 == 3324) {
                            field719[var5++] = client.field258;
                            continue;
                        }
                    } else if (var424 < 3500) {
                        if (var424 == 3400) {
                            var5 -= 2;
                            int var187 = field719[var5];
                            int var188 = field719[var5 + 1];
                            class43 var189 = (class43) class43.field983.method3115((long) var187);
                            class43 var190;
                            if (var189 == null) {
                                byte[] var191 = Statics.field991.method2738(8, var187);
                                class43 var192 = new class43();
                                if (var191 != null) {
                                    var192.method826(new class107(var191));
                                }
                                class43.field983.method3117(var192, (long) var187);
                                var190 = var192;
                            } else {
                                var190 = var189;
                            }
                            class43 var193 = var190;
                            if (var190.field986 != 's') {
                            }
                            for (int var194 = 0; var194 < var193.field985; var194++) {
                                if (var193.field990[var194] == var188) {
                                    field720[var6++] = var193.field992[var194];
                                    var193 = null;
                                    break;
                                }
                            }
                            if (var193 != null) {
                                field720[var6++] = var193.field987;
                            }
                            continue;
                        }
                        if (var424 == 3408) {
                            var5 -= 4;
                            int var195 = field719[var5];
                            int var196 = field719[var5 + 1];
                            int var197 = field719[var5 + 2];
                            int var198 = field719[var5 + 3];
                            class43 var199 = (class43) class43.field983.method3115((long) var197);
                            class43 var200;
                            if (var199 == null) {
                                byte[] var201 = Statics.field991.method2738(8, var197);
                                class43 var202 = new class43();
                                if (var201 != null) {
                                    var202.method826(new class107(var201));
                                }
                                class43.field983.method3117(var202, (long) var197);
                                var200 = var202;
                            } else {
                                var200 = var199;
                            }
                            class43 var203 = var200;
                            if (var200.field993 == var195 && var200.field986 == var196) {
                                for (int var204 = 0; var204 < var203.field985; var204++) {
                                    if (var203.field990[var204] == var198) {
                                        if (var196 == 115) {
                                            field720[var6++] = var203.field992[var204];
                                        } else {
                                            field719[var5++] = var203.field989[var204];
                                        }
                                        var203 = null;
                                        break;
                                    }
                                }
                                if (var203 != null) {
                                    if (var196 == 115) {
                                        field720[var6++] = var203.field987;
                                    } else {
                                        field719[var5++] = var203.field988;
                                    }
                                }
                                continue;
                            }
                            if (var196 == 115) {
                                field720[var6++] = "null";
                            } else {
                                field719[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var424 < 3700) {
                        if (var424 == 3600) {
                            if (client.field302 == 0) {
                                field719[var5++] = -2;
                            } else if (client.field302 == 1) {
                                field719[var5++] = -1;
                            } else {
                                field719[var5++] = client.field509;
                            }
                            continue;
                        }
                        if (var424 == 3601) {
                            var5--;
                            int var205 = field719[var5];
                            if (client.field302 == 2 && var205 < client.field509) {
                                field720[var6++] = client.field511[var205].field232;
                                field720[var6++] = client.field511[var205].field236;
                                continue;
                            }
                            field720[var6++] = "";
                            field720[var6++] = "";
                            continue;
                        }
                        if (var424 == 3602) {
                            var5--;
                            int var206 = field719[var5];
                            if (client.field302 == 2 && var206 < client.field509) {
                                field719[var5++] = client.field511[var206].field233;
                                continue;
                            }
                            field719[var5++] = 0;
                            continue;
                        }
                        if (var424 == 3603) {
                            var5--;
                            int var207 = field719[var5];
                            if (client.field302 == 2 && var207 < client.field509) {
                                field719[var5++] = client.field511[var207].field234;
                                continue;
                            }
                            field719[var5++] = 0;
                            continue;
                        }
                        if (var424 == 3604) {
                            var6--;
                            String var208 = field720[var6];
                            var5--;
                            int var209 = field719[var5];
                            client.method24(var208, var209);
                            continue;
                        }
                        if (var424 == 3605) {
                            var6--;
                            String var210 = field720[var6];
                            client.method154(var210);
                            continue;
                        }
                        if (var424 == 3606) {
                            var6--;
                            String var211 = field720[var6];
                            client.method2501(var211);
                            continue;
                        }
                        if (var424 == 3607) {
                            var6--;
                            String var212 = field720[var6];
                            if (var212 == null) {
                                continue;
                            }
                            if ((client.field513 < 100 || client.field314 == 1) && client.field513 < 400) {
                                String var213 = class201.method1341(var212, Statics.field153);
                                if (var213 == null) {
                                    continue;
                                }
                                for (int var214 = 0; var214 < client.field513; var214++) {
                                    class8 var215 = client.field514[var214];
                                    String var216 = class201.method1341(var215.field137, Statics.field153);
                                    if (var216 != null && var216.equals(var213)) {
                                        class10.method2769(31, "", var212 + class143.field2261);
                                        continue label2445;
                                    }
                                    if (var215.field133 != null) {
                                        String var217 = class201.method1341(var215.field133, Statics.field153);
                                        if (var217 != null && var217.equals(var213)) {
                                            class10.method2769(31, "", var212 + class143.field2261);
                                            continue label2445;
                                        }
                                    }
                                }
                                for (int var218 = 0; var218 < client.field509; var218++) {
                                    class16 var219 = client.field511[var218];
                                    String var220 = class201.method1341(var219.field232, Statics.field153);
                                    if (var220 != null && var220.equals(var213)) {
                                        class10.method2769(31, "", class143.field2315 + var212 + class143.field2208);
                                        continue label2445;
                                    }
                                    if (var219.field236 != null) {
                                        String var221 = class201.method1341(var219.field236, Statics.field153);
                                        if (var221 != null && var221.equals(var213)) {
                                            class10.method2769(31, "", class143.field2315 + var212 + class143.field2208);
                                            continue label2445;
                                        }
                                    }
                                }
                                if (class201.method1341(Statics.field1751.field53, Statics.field153).equals(var213)) {
                                    class10.method2769(31, "", class143.field2312);
                                } else {
                                    client.field301.method2355(182);
                                    class110 var222 = client.field301;
                                    int var223 = var212.length() + 1;
                                    var222.method2124(var223);
                                    client.field301.method2176(var212);
                                }
                                continue;
                            }
                            class10.method2769(31, "", class143.field2309);
                            continue;
                        }
                        if (var424 == 3608) {
                            var6--;
                            String var224 = field720[var6];
                            client.method2499(var224);
                            continue;
                        }
                        if (var424 == 3609) {
                            var6--;
                            String var225 = field720[var6];
                            class138[] var226 = class138.method1607();
                            for (int var227 = 0; var227 < var226.length; var227++) {
                                class138 var228 = var226[var227];
                                if (var228.field2098 != -1) {
                                    int var230 = var228.field2098;
                                    String var231 = "<img=" + var230 + ">";
                                    if (var225.startsWith(var231)) {
                                        var225 = var225.substring(6 + Integer.toString(var228.field2098).length());
                                        break;
                                    }
                                }
                            }
                            field719[var5++] = client.method2450(var225, false) ? 1 : 0;
                            continue;
                        }
                        if (var424 == 3611) {
                            if (client.field494 == null) {
                                field720[var6++] = "";
                            } else {
                                field720[var6++] = class199.method2654(client.field494);
                            }
                            continue;
                        }
                        if (var424 == 3612) {
                            if (client.field494 == null) {
                                field719[var5++] = 0;
                            } else {
                                field719[var5++] = Statics.field2090;
                            }
                            continue;
                        }
                        if (var424 == 3613) {
                            var5--;
                            int var232 = field719[var5];
                            if (client.field494 != null && var232 < Statics.field2090) {
                                field720[var6++] = Statics.field1794[var232].field574;
                                continue;
                            }
                            field720[var6++] = "";
                            continue;
                        }
                        if (var424 == 3614) {
                            var5--;
                            int var233 = field719[var5];
                            if (client.field494 != null && var233 < Statics.field2090) {
                                field719[var5++] = Statics.field1794[var233].field575;
                                continue;
                            }
                            field719[var5++] = 0;
                            continue;
                        }
                        if (var424 == 3615) {
                            var5--;
                            int var234 = field719[var5];
                            if (client.field494 != null && var234 < Statics.field2090) {
                                field719[var5++] = Statics.field1794[var234].field576;
                                continue;
                            }
                            field719[var5++] = 0;
                            continue;
                        }
                        if (var424 == 3616) {
                            field719[var5++] = Statics.field1976;
                            continue;
                        }
                        if (var424 == 3617) {
                            var6--;
                            String var235 = field720[var6];
                            client.method1878(var235);
                            continue;
                        }
                        if (var424 == 3618) {
                            field719[var5++] = Statics.field11;
                            continue;
                        }
                        if (var424 == 3619) {
                            var6--;
                            String var236 = field720[var6];
                            client.method2641(var236);
                            continue;
                        }
                        if (var424 == 3620) {
                            client.method2502();
                            continue;
                        }
                        if (var424 == 3621) {
                            if (client.field302 == 0) {
                                field719[var5++] = -1;
                            } else {
                                field719[var5++] = client.field513;
                            }
                            continue;
                        }
                        if (var424 == 3622) {
                            var5--;
                            int var237 = field719[var5];
                            if (client.field302 != 0 && var237 < client.field513) {
                                field720[var6++] = client.field514[var237].field137;
                                field720[var6++] = client.field514[var237].field133;
                                continue;
                            }
                            field720[var6++] = "";
                            field720[var6++] = "";
                            continue;
                        }
                        if (var424 == 3623) {
                            String var238;
                            label2229: {
                                var6--;
                                var238 = field720[var6];
                                String var240 = "<img=0>";
                                if (!var238.startsWith(var240)) {
                                    String var242 = "<img=1>";
                                    if (!var238.startsWith(var242)) {
                                        break label2229;
                                    }
                                }
                                var238 = var238.substring(7);
                            }
                            field719[var5++] = client.method699(var238) ? 1 : 0;
                            continue;
                        }
                        if (var424 == 3624) {
                            var5--;
                            int var243 = field719[var5];
                            if (Statics.field1794 != null && var243 < Statics.field2090 && Statics.field1794[var243].field574.equalsIgnoreCase(Statics.field1751.field53)) {
                                field719[var5++] = 1;
                                continue;
                            }
                            field719[var5++] = 0;
                            continue;
                        }
                        if (var424 == 3625) {
                            if (client.field483 == null) {
                                field720[var6++] = "";
                            } else {
                                field720[var6++] = class199.method2654(client.field483);
                            }
                            continue;
                        }
                    } else if (var424 < 4100) {
                        if (var424 == 4000) {
                            var5 -= 2;
                            int var244 = field719[var5];
                            int var245 = field719[var5 + 1];
                            field719[var5++] = var244 + var245;
                            continue;
                        }
                        if (var424 == 4001) {
                            var5 -= 2;
                            int var246 = field719[var5];
                            int var247 = field719[var5 + 1];
                            field719[var5++] = var246 - var247;
                            continue;
                        }
                        if (var424 == 4002) {
                            var5 -= 2;
                            int var248 = field719[var5];
                            int var249 = field719[var5 + 1];
                            field719[var5++] = var248 * var249;
                            continue;
                        }
                        if (var424 == 4003) {
                            var5 -= 2;
                            int var250 = field719[var5];
                            int var251 = field719[var5 + 1];
                            field719[var5++] = var250 / var251;
                            continue;
                        }
                        if (var424 == 4004) {
                            var5--;
                            int var252 = field719[var5];
                            field719[var5++] = (int) (Math.random() * (double) var252);
                            continue;
                        }
                        if (var424 == 4005) {
                            var5--;
                            int var253 = field719[var5];
                            field719[var5++] = (int) (Math.random() * (double) (var253 + 1));
                            continue;
                        }
                        if (var424 == 4006) {
                            var5 -= 5;
                            int var254 = field719[var5];
                            int var255 = field719[var5 + 1];
                            int var256 = field719[var5 + 2];
                            int var257 = field719[var5 + 3];
                            int var258 = field719[var5 + 4];
                            field719[var5++] = (var255 - var254) * (var258 - var256) / (var257 - var256) + var254;
                            continue;
                        }
                        if (var424 == 4007) {
                            var5 -= 2;
                            int var259 = field719[var5];
                            int var260 = field719[var5 + 1];
                            field719[var5++] = var259 * var260 / 100 + var259;
                            continue;
                        }
                        if (var424 == 4008) {
                            var5 -= 2;
                            int var261 = field719[var5];
                            int var262 = field719[var5 + 1];
                            field719[var5++] = var261 | 0x1 << var262;
                            continue;
                        }
                        if (var424 == 4009) {
                            var5 -= 2;
                            int var263 = field719[var5];
                            int var264 = field719[var5 + 1];
                            field719[var5++] = var263 & -1 - (0x1 << var264);
                            continue;
                        }
                        if (var424 == 4010) {
                            var5 -= 2;
                            int var265 = field719[var5];
                            int var266 = field719[var5 + 1];
                            field719[var5++] = (var265 & 0x1 << var266) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var424 == 4011) {
                            var5 -= 2;
                            int var267 = field719[var5];
                            int var268 = field719[var5 + 1];
                            field719[var5++] = var267 % var268;
                            continue;
                        }
                        if (var424 == 4012) {
                            var5 -= 2;
                            int var269 = field719[var5];
                            int var270 = field719[var5 + 1];
                            if (var269 == 0) {
                                field719[var5++] = 0;
                            } else {
                                field719[var5++] = (int) Math.pow((double) var269, (double) var270);
                            }
                            continue;
                        }
                        if (var424 == 4013) {
                            var5 -= 2;
                            int var271 = field719[var5];
                            int var272 = field719[var5 + 1];
                            if (var271 == 0) {
                                field719[var5++] = 0;
                            } else if (var272 == 0) {
                                field719[var5++] = Integer.MAX_VALUE;
                            } else {
                                field719[var5++] = (int) Math.pow((double) var271, 1.0D / (double) var272);
                            }
                            continue;
                        }
                        if (var424 == 4014) {
                            var5 -= 2;
                            int var273 = field719[var5];
                            int var274 = field719[var5 + 1];
                            field719[var5++] = var273 & var274;
                            continue;
                        }
                        if (var424 == 4015) {
                            var5 -= 2;
                            int var275 = field719[var5];
                            int var276 = field719[var5 + 1];
                            field719[var5++] = var275 | var276;
                            continue;
                        }
                    } else if (var424 < 4200) {
                        if (var424 == 4100) {
                            var6--;
                            String var277 = field720[var6];
                            var5--;
                            int var278 = field719[var5];
                            field720[var6++] = var277 + var278;
                            continue;
                        }
                        if (var424 == 4101) {
                            var6 -= 2;
                            String var279 = field720[var6];
                            String var280 = field720[var6 + 1];
                            field720[var6++] = var279 + var280;
                            continue;
                        }
                        if (var424 == 4102) {
                            var6--;
                            String var281 = field720[var6];
                            var5--;
                            int var282 = field719[var5];
                            String[] var283 = field720;
                            int var284 = var6++;
                            String var286;
                            if (var282 < 0) {
                                var286 = Integer.toString(var282);
                            } else {
                                var286 = class200.method2904(var282, 10, true);
                            }
                            var283[var284] = var281 + var286;
                            continue;
                        }
                        if (var424 == 4103) {
                            var6--;
                            String var287 = field720[var6];
                            field720[var6++] = var287.toLowerCase();
                            continue;
                        }
                        if (var424 == 4104) {
                            var5--;
                            int var288 = field719[var5];
                            long var289 = ((long) var288 + 11745L) * 86400000L;
                            field724.setTime(new Date(var289));
                            int var291 = field724.get(5);
                            int var292 = field724.get(2);
                            int var293 = field724.get(1);
                            field720[var6++] = var291 + "-" + field729[var292] + "-" + var293;
                            continue;
                        }
                        if (var424 == 4105) {
                            var6 -= 2;
                            String var294 = field720[var6];
                            String var295 = field720[var6 + 1];
                            if (Statics.field1751.field58 != null && Statics.field1751.field58.field2679) {
                                field720[var6++] = var295;
                                continue;
                            }
                            field720[var6++] = var294;
                            continue;
                        }
                        if (var424 == 4106) {
                            var5--;
                            int var296 = field719[var5];
                            field720[var6++] = Integer.toString(var296);
                            continue;
                        }
                        if (var424 == 4107) {
                            var6 -= 2;
                            int[] var297 = field719;
                            int var298 = var5++;
                            String var299 = field720[var6];
                            String var300 = field720[var6 + 1];
                            int var301 = client.field263;
                            int var302 = var299.length();
                            int var303 = var300.length();
                            int var304 = 0;
                            int var305 = 0;
                            char var306 = 0;
                            char var307 = 0;
                            int var308;
                            label2296: while (true) {
                                if (var304 - var306 >= var302 && var305 - var307 >= var303) {
                                    int var317 = Math.min(var302, var303);
                                    for (int var318 = 0; var318 < var317; var318++) {
                                        char var321 = var299.charAt(var318);
                                        char var322 = var300.charAt(var318);
                                        if (var321 != var322 && Character.toUpperCase(var321) != Character.toUpperCase(var322)) {
                                            char var323 = Character.toLowerCase(var321);
                                            char var324 = Character.toLowerCase(var322);
                                            if (var323 != var324) {
                                                var308 = class203.method85(var323, var301) - class203.method85(var324, var301);
                                                break label2296;
                                            }
                                        }
                                    }
                                    int var325 = var302 - var303;
                                    if (var325 == 0) {
                                        for (int var326 = 0; var326 < var317; var326++) {
                                            char var327 = var299.charAt(var326);
                                            char var328 = var300.charAt(var326);
                                            if (var327 != var328) {
                                                var308 = class203.method85(var327, var301) - class203.method85(var328, var301);
                                                break label2296;
                                            }
                                        }
                                        var308 = 0;
                                    } else {
                                        var308 = var325;
                                    }
                                    break;
                                }
                                if (var304 - var306 >= var302) {
                                    var308 = -1;
                                    break;
                                }
                                if (var305 - var307 >= var303) {
                                    var308 = 1;
                                    break;
                                }
                                char var309;
                                if (var306 == 0) {
                                    var309 = var299.charAt(var304++);
                                } else {
                                    var309 = var306;
                                    boolean var310 = false;
                                }
                                char var311;
                                if (var307 == 0) {
                                    var311 = var300.charAt(var305++);
                                } else {
                                    var311 = var307;
                                    boolean var312 = false;
                                }
                                var306 = class203.method2545(var309);
                                var307 = class203.method2545(var311);
                                char var313 = class203.method2395(var309, var301);
                                char var314 = class203.method2395(var311, var301);
                                if (var313 != var314 && Character.toUpperCase(var313) != Character.toUpperCase(var314)) {
                                    char var315 = Character.toLowerCase(var313);
                                    char var316 = Character.toLowerCase(var314);
                                    if (var315 != var316) {
                                        var308 = class203.method85(var315, var301) - class203.method85(var316, var301);
                                        break;
                                    }
                                }
                            }
                            var297[var298] = class200.method2752(var308);
                            continue;
                        }
                        if (var424 == 4108) {
                            var6--;
                            String var329 = field720[var6];
                            var5 -= 2;
                            int var330 = field719[var5];
                            int var331 = field719[var5 + 1];
                            byte[] var332 = Statics.field2438.method2738(var331, 0);
                            class194 var333 = new class194(var332);
                            field719[var5++] = var333.method3295(var329, var330);
                            continue;
                        }
                        if (var424 == 4109) {
                            var6--;
                            String var334 = field720[var6];
                            var5 -= 2;
                            int var335 = field719[var5];
                            int var336 = field719[var5 + 1];
                            byte[] var337 = Statics.field2438.method2738(var336, 0);
                            class194 var338 = new class194(var337);
                            field719[var5++] = var338.method3363(var334, var335);
                            continue;
                        }
                        if (var424 == 4110) {
                            var6 -= 2;
                            String var339 = field720[var6];
                            String var340 = field720[var6 + 1];
                            var5--;
                            if (field719[var5] == 1) {
                                field720[var6++] = var339;
                            } else {
                                field720[var6++] = var340;
                            }
                            continue;
                        }
                        if (var424 == 4111) {
                            var6--;
                            String var341 = field720[var6];
                            field720[var6++] = class193.method3303(var341);
                            continue;
                        }
                        if (var424 == 4112) {
                            var6--;
                            String var342 = field720[var6];
                            var5--;
                            int var343 = field719[var5];
                            field720[var6++] = var342 + (char) var343;
                            continue;
                        }
                        if (var424 == 4113) {
                            var5--;
                            int var344 = field719[var5];
                            field719[var5++] = class200.method2590((char) var344) ? 1 : 0;
                            continue;
                        }
                        if (var424 == 4114) {
                            var5--;
                            int var345 = field719[var5];
                            int[] var346 = field719;
                            int var347 = var5++;
                            char var348 = (char) var345;
                            boolean var349 = var348 >= '0' && var348 <= '9' || var348 >= 'A' && var348 <= 'Z' || var348 >= 'a' && var348 <= 'z';
                            var346[var347] = var349 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 4115) {
                            var5--;
                            int var350 = field719[var5];
                            field719[var5++] = class200.method2084((char) var350) ? 1 : 0;
                            continue;
                        }
                        if (var424 == 4116) {
                            var5--;
                            int var351 = field719[var5];
                            field719[var5++] = class200.method1856((char) var351) ? 1 : 0;
                            continue;
                        }
                        if (var424 == 4117) {
                            var6--;
                            String var352 = field720[var6];
                            if (var352 == null) {
                                field719[var5++] = 0;
                            } else {
                                field719[var5++] = var352.length();
                            }
                            continue;
                        }
                        if (var424 == 4118) {
                            var6--;
                            String var353 = field720[var6];
                            var5 -= 2;
                            int var354 = field719[var5];
                            int var355 = field719[var5 + 1];
                            field720[var6++] = var353.substring(var354, var355);
                            continue;
                        }
                        if (var424 == 4119) {
                            var6--;
                            String var356 = field720[var6];
                            StringBuilder var357 = new StringBuilder(var356.length());
                            boolean var358 = false;
                            for (int var359 = 0; var359 < var356.length(); var359++) {
                                char var360 = var356.charAt(var359);
                                if (var360 == '<') {
                                    var358 = true;
                                } else if (var360 == '>') {
                                    var358 = false;
                                } else if (!var358) {
                                    var357.append(var360);
                                }
                            }
                            field720[var6++] = var357.toString();
                            continue;
                        }
                        if (var424 == 4120) {
                            var6--;
                            String var361 = field720[var6];
                            var5--;
                            int var362 = field719[var5];
                            field719[var5++] = var361.indexOf(var362);
                            continue;
                        }
                        if (var424 == 4121) {
                            var6 -= 2;
                            String var363 = field720[var6];
                            String var364 = field720[var6 + 1];
                            var5--;
                            int var365 = field719[var5];
                            field719[var5++] = var363.indexOf(var364, var365);
                            continue;
                        }
                    } else if (var424 < 4300) {
                        if (var424 == 4200) {
                            var5--;
                            int var366 = field719[var5];
                            field720[var6++] = class45.method1982(var366).field1014;
                            continue;
                        }
                        if (var424 == 4201) {
                            var5 -= 2;
                            int var367 = field719[var5];
                            int var368 = field719[var5 + 1];
                            class45 var369 = class45.method1982(var367);
                            if (var368 >= 1 && var368 <= 5 && var369.field1028[var368 - 1] != null) {
                                field720[var6++] = var369.field1028[var368 - 1];
                                continue;
                            }
                            field720[var6++] = "";
                            continue;
                        }
                        if (var424 == 4202) {
                            var5 -= 2;
                            int var370 = field719[var5];
                            int var371 = field719[var5 + 1];
                            class45 var372 = class45.method1982(var370);
                            if (var371 >= 1 && var371 <= 5 && var372.field1029[var371 - 1] != null) {
                                field720[var6++] = var372.field1029[var371 - 1];
                                continue;
                            }
                            field720[var6++] = "";
                            continue;
                        }
                        if (var424 == 4203) {
                            var5--;
                            int var373 = field719[var5];
                            field719[var5++] = class45.method1982(var373).field1026;
                            continue;
                        }
                        if (var424 == 4204) {
                            var5--;
                            int var374 = field719[var5];
                            field719[var5++] = class45.method1982(var374).field1025 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var424 == 4205) {
                            var5--;
                            int var375 = field719[var5];
                            class45 var376 = class45.method1982(var375);
                            if (var376.field1008 == -1 && var376.field1043 >= 0) {
                                field719[var5++] = var376.field1043;
                                continue;
                            }
                            field719[var5++] = var375;
                            continue;
                        }
                        if (var424 == 4206) {
                            var5--;
                            int var377 = field719[var5];
                            class45 var378 = class45.method1982(var377);
                            if (var378.field1008 >= 0 && var378.field1043 >= 0) {
                                field719[var5++] = var378.field1043;
                                continue;
                            }
                            field719[var5++] = var377;
                            continue;
                        }
                        if (var424 == 4207) {
                            var5--;
                            int var379 = field719[var5];
                            field719[var5++] = class45.method1982(var379).field1010 ? 1 : 0;
                            continue;
                        }
                    } else if (var424 < 5100) {
                        if (var424 == 5000) {
                            field719[var5++] = client.field502;
                            continue;
                        }
                        if (var424 == 5001) {
                            var5 -= 3;
                            client.field502 = field719[var5];
                            Statics.field1874 = class117.method1417(field719[var5 + 1]);
                            if (Statics.field1874 == null) {
                                Statics.field1874 = class117.field1895;
                            }
                            client.field367 = field719[var5 + 2];
                            client.field301.method2355(239);
                            client.field301.method2124(client.field502);
                            client.field301.method2124(Statics.field1874.field1894);
                            client.field301.method2124(client.field367);
                            continue;
                        }
                        if (var424 == 5002) {
                            var6--;
                            String var380 = field720[var6];
                            var5 -= 2;
                            int var381 = field719[var5];
                            int var382 = field719[var5 + 1];
                            client.field301.method2355(1);
                            class110 var383 = client.field301;
                            int var384 = var380.length() + 1;
                            var383.method2124(var384 + 2);
                            client.field301.method2176(var380);
                            client.field301.method2124(var381 - 1);
                            client.field301.method2124(var382);
                            continue;
                        }
                        if (var424 == 5003) {
                            var5 -= 2;
                            int var385 = field719[var5];
                            int var386 = field719[var5 + 1];
                            class24 var387 = (class24) class10.field159.get(var385);
                            class31 var388 = var387.method525(var386);
                            if (var388 == null) {
                                field719[var5++] = -1;
                                field719[var5++] = 0;
                                field720[var6++] = "";
                                field720[var6++] = "";
                                field720[var6++] = "";
                            } else {
                                field719[var5++] = var388.field704;
                                field719[var5++] = var388.field705;
                                field720[var6++] = var388.field706 == null ? "" : var388.field706;
                                field720[var6++] = var388.field708 == null ? "" : var388.field708;
                                field720[var6++] = var388.field709 == null ? "" : var388.field709;
                            }
                            continue;
                        }
                        if (var424 == 5004) {
                            var5--;
                            int var390 = field719[var5];
                            class31 var391 = (class31) class10.field163.method3169((long) var390);
                            if (var391 == null) {
                                field719[var5++] = -1;
                                field719[var5++] = 0;
                                field720[var6++] = "";
                                field720[var6++] = "";
                                field720[var6++] = "";
                            } else {
                                field719[var5++] = var391.field710;
                                field719[var5++] = var391.field705;
                                field720[var6++] = var391.field706 == null ? "" : var391.field706;
                                field720[var6++] = var391.field708 == null ? "" : var391.field708;
                                field720[var6++] = var391.field709 == null ? "" : var391.field709;
                            }
                            continue;
                        }
                        if (var424 == 5005) {
                            if (Statics.field1874 == null) {
                                field719[var5++] = -1;
                            } else {
                                field719[var5++] = Statics.field1874.field1894;
                            }
                            continue;
                        }
                        if (var424 == 5008) {
                            var6--;
                            String var393 = field720[var6];
                            var5--;
                            int var394 = field719[var5];
                            String var395 = var393.toLowerCase();
                            byte var396 = 0;
                            if (var395.startsWith(class143.field2317)) {
                                var396 = 0;
                                var393 = var393.substring(class143.field2317.length());
                            } else if (var395.startsWith(class143.field2347)) {
                                var396 = 1;
                                var393 = var393.substring(class143.field2347.length());
                            } else if (var395.startsWith(class143.field2321)) {
                                var396 = 2;
                                var393 = var393.substring(class143.field2321.length());
                            } else if (var395.startsWith(class143.field2323)) {
                                var396 = 3;
                                var393 = var393.substring(class143.field2323.length());
                            } else if (var395.startsWith(class143.field2310)) {
                                var396 = 4;
                                var393 = var393.substring(class143.field2310.length());
                            } else if (var395.startsWith(class143.field2265)) {
                                var396 = 5;
                                var393 = var393.substring(class143.field2265.length());
                            } else if (var395.startsWith(class143.field2199)) {
                                var396 = 6;
                                var393 = var393.substring(class143.field2199.length());
                            } else if (var395.startsWith(class143.field2201)) {
                                var396 = 7;
                                var393 = var393.substring(class143.field2201.length());
                            } else if (var395.startsWith(class143.field2163)) {
                                var396 = 8;
                                var393 = var393.substring(class143.field2163.length());
                            } else if (var395.startsWith(class143.field2335)) {
                                var396 = 9;
                                var393 = var393.substring(class143.field2335.length());
                            } else if (var395.startsWith(class143.field2171)) {
                                var396 = 10;
                                var393 = var393.substring(class143.field2171.length());
                            } else if (var395.startsWith(class143.field2172)) {
                                var396 = 11;
                                var393 = var393.substring(class143.field2172.length());
                            } else if (client.field263 != 0) {
                                if (var395.startsWith(class143.field2150)) {
                                    var396 = 0;
                                    var393 = var393.substring(class143.field2150.length());
                                } else if (var395.startsWith(class143.field2257)) {
                                    var396 = 1;
                                    var393 = var393.substring(class143.field2257.length());
                                } else if (var395.startsWith(class143.field2322)) {
                                    var396 = 2;
                                    var393 = var393.substring(class143.field2322.length());
                                } else if (var395.startsWith(class143.field2324)) {
                                    var396 = 3;
                                    var393 = var393.substring(class143.field2324.length());
                                } else if (var395.startsWith(class143.field2326)) {
                                    var396 = 4;
                                    var393 = var393.substring(class143.field2326.length());
                                } else if (var395.startsWith(class143.field2328)) {
                                    var396 = 5;
                                    var393 = var393.substring(class143.field2328.length());
                                } else if (var395.startsWith(class143.field2330)) {
                                    var396 = 6;
                                    var393 = var393.substring(class143.field2330.length());
                                } else if (var395.startsWith(class143.field2332)) {
                                    var396 = 7;
                                    var393 = var393.substring(class143.field2332.length());
                                } else if (var395.startsWith(class143.field2334)) {
                                    var396 = 8;
                                    var393 = var393.substring(class143.field2334.length());
                                } else if (var395.startsWith(class143.field2336)) {
                                    var396 = 9;
                                    var393 = var393.substring(class143.field2336.length());
                                } else if (var395.startsWith(class143.field2338)) {
                                    var396 = 10;
                                    var393 = var393.substring(class143.field2338.length());
                                } else if (var395.startsWith(class143.field2340)) {
                                    var396 = 11;
                                    var393 = var393.substring(class143.field2340.length());
                                }
                            }
                            String var397 = var393.toLowerCase();
                            byte var398 = 0;
                            if (var397.startsWith(class143.field2341)) {
                                var398 = 1;
                                var393 = var393.substring(class143.field2341.length());
                            } else if (var397.startsWith(class143.field2343)) {
                                var398 = 2;
                                var393 = var393.substring(class143.field2343.length());
                            } else if (var397.startsWith(class143.field2213)) {
                                var398 = 3;
                                var393 = var393.substring(class143.field2213.length());
                            } else if (var397.startsWith(class143.field2353)) {
                                var398 = 4;
                                var393 = var393.substring(class143.field2353.length());
                            } else if (var397.startsWith(class143.field2349)) {
                                var398 = 5;
                                var393 = var393.substring(class143.field2349.length());
                            } else if (client.field263 != 0) {
                                if (var397.startsWith(class143.field2342)) {
                                    var398 = 1;
                                    var393 = var393.substring(class143.field2342.length());
                                } else if (var397.startsWith(class143.field2344)) {
                                    var398 = 2;
                                    var393 = var393.substring(class143.field2344.length());
                                } else if (var397.startsWith(class143.field2346)) {
                                    var398 = 3;
                                    var393 = var393.substring(class143.field2346.length());
                                } else if (var397.startsWith(class143.field2348)) {
                                    var398 = 4;
                                    var393 = var393.substring(class143.field2348.length());
                                } else if (var397.startsWith(class143.field2217)) {
                                    var398 = 5;
                                    var393 = var393.substring(class143.field2217.length());
                                }
                            }
                            client.field301.method2355(72);
                            client.field301.method2124(0);
                            int var399 = client.field301.field1826;
                            client.field301.method2124(var394);
                            client.field301.method2124(var396);
                            client.field301.method2124(var398);
                            class110 var400 = client.field301;
                            int var401 = var400.field1826;
                            byte[] var402 = class202.method2507(var393);
                            var400.method2277(var402.length);
                            var400.field1826 += Statics.field2909.method2073(var402, 0, var402.length, var400.field1829, var400.field1826);
                            client.field301.method2135(client.field301.field1826 - var399);
                            continue;
                        }
                        if (var424 == 5009) {
                            var6 -= 2;
                            String var403 = field720[var6];
                            String var404 = field720[var6 + 1];
                            client.field301.method2355(230);
                            client.field301.method2125(0);
                            int var405 = client.field301.field1826;
                            client.field301.method2176(var403);
                            class110 var406 = client.field301;
                            int var407 = var406.field1826;
                            byte[] var408 = class202.method2507(var404);
                            var406.method2277(var408.length);
                            var406.field1826 += Statics.field2909.method2073(var408, 0, var408.length, var406.field1829, var406.field1826);
                            client.field301.method2134(client.field301.field1826 - var405);
                            continue;
                        }
                        if (var424 == 5015) {
                            String var409;
                            if (Statics.field1751 == null || Statics.field1751.field53 == null) {
                                var409 = "";
                            } else {
                                var409 = Statics.field1751.field53;
                            }
                            field720[var6++] = var409;
                            continue;
                        }
                        if (var424 == 5016) {
                            field719[var5++] = client.field367;
                            continue;
                        }
                        if (var424 == 5017) {
                            var5--;
                            int var410 = field719[var5];
                            field719[var5++] = class10.method2(var410);
                            continue;
                        }
                        if (var424 == 5018) {
                            var5--;
                            int var411 = field719[var5];
                            field719[var5++] = class10.method28(var411);
                            continue;
                        }
                        if (var424 == 5019) {
                            var5--;
                            int var412 = field719[var5];
                            int[] var413 = field719;
                            int var414 = var5++;
                            class31 var415 = (class31) class10.field163.method3169((long) var412);
                            int var416;
                            if (var415 == null) {
                                var416 = -1;
                            } else if (class10.field149.field2872 == var415.field2876) {
                                var416 = -1;
                            } else {
                                var416 = ((class31) var415.field2876).field704;
                            }
                            var413[var414] = var416;
                            continue;
                        }
                        if (var424 == 5020) {
                            var6--;
                            String var417 = field720[var6];
                            if (var417.equalsIgnoreCase("toggleroof")) {
                                Statics.field2430.field140 = !Statics.field2430.field140;
                                Statics.method910();
                                if (Statics.field2430.field140) {
                                    class10.method2769(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method2769(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field427 >= 2) {
                                if (var417.equalsIgnoreCase("fpson")) {
                                    client.field474 = true;
                                }
                                if (var417.equalsIgnoreCase("fpsoff")) {
                                    client.field474 = false;
                                }
                                if (var417.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var417.equalsIgnoreCase("clientdrop")) {
                                    client.method136();
                                }
                                if (var417.equalsIgnoreCase("errortest") && client.field259 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field301.method2355(252);
                            client.field301.method2124(var417.length() + 1);
                            client.field301.method2176(var417);
                            continue;
                        }
                        if (var424 == 5021) {
                            var6--;
                            client.field475 = field720[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var424 == 5022) {
                            field720[var6++] = client.field475;
                            continue;
                        }
                    }
                } else {
                    class153 var85;
                    if (var424 >= 2000) {
                        var424 -= 1000;
                        var5--;
                        var85 = class153.method1974(field719[var5]);
                    } else {
                        var85 = var62 ? Statics.field722 : Statics.field637;
                    }
                    if (var424 == 1300) {
                        var5--;
                        int var86 = field719[var5] - 1;
                        if (var86 >= 0 && var86 <= 9) {
                            var6--;
                            var85.method2831(var86, field720[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var424 == 1301) {
                        var5 -= 2;
                        int var87 = field719[var5];
                        int var88 = field719[var5 + 1];
                        var85.field2594 = class153.method1781(var87, var88);
                        continue;
                    }
                    if (var424 == 1302) {
                        var5--;
                        var85.field2633 = field719[var5] == 1;
                        continue;
                    }
                    if (var424 == 1303) {
                        var5--;
                        var85.field2634 = field719[var5];
                        continue;
                    }
                    if (var424 == 1304) {
                        var5--;
                        var85.field2596 = field719[var5];
                        continue;
                    }
                    if (var424 == 1305) {
                        var6--;
                        var85.field2592 = field720[var6];
                        continue;
                    }
                    if (var424 == 1306) {
                        var6--;
                        var85.field2621 = field720[var6];
                        continue;
                    }
                    if (var424 == 1307) {
                        var85.field2605 = null;
                        continue;
                    }
                }
                if (var424 >= 5600 || var424 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var418 = field719[var5];
                int var419 = field719[var5 + 1];
                if (!client.field503) {
                    client.field501 = var418;
                    client.field343 = var419;
                }
            }
        } catch (Exception var423) {
            StringBuilder var421 = new StringBuilder(30);
            var421.append("").append(var4.field2888).append(" ");
            for (int var422 = field714 - 1; var422 >= 0; var422--) {
                var421.append("").append(field723[var422].field200.field2888).append(" ");
            }
            var421.append("").append(var10);
            Statics.method3084(var421.toString(), var423);
        }
    }

    @ObfuscatedName("l.x(II)V")
    public static void method539(int arg0) {
        if (arg0 == -1 || !class153.method2384(arg0)) {
            return;
        }
        class153[] var1 = Statics.field2545[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3.field2604 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field12 = var3.field2604;
                method2843(var4, 2000000);
            }
        }
    }
}
