package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ak")
public class class32 {

    @ObfuscatedName("ak.n")
    public static int[] field717 = new int[5];

    @ObfuscatedName("ak.s")
    public static int[][] field715 = new int[5][5000];

    @ObfuscatedName("ak.r")
    public static int[] field716 = new int[1000];

    @ObfuscatedName("ak.w")
    public static String[] field725 = new String[1000];

    @ObfuscatedName("ak.u")
    public static int field721 = 0;

    @ObfuscatedName("ak.d")
    public static class13[] field712 = new class13[50];

    @ObfuscatedName("ak.y")
    public static Calendar field720 = Calendar.getInstance();

    @ObfuscatedName("ak.v")
    public static final String[] field714 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.p(Lp;B)V")
    public static void method47(class1 arg0) {
        method483(arg0, 200000);
    }

    @ObfuscatedName("client.g(Lp;II)V")
    public static void method483(class1 arg0, int arg1) {
        Object[] var2 = arg0.field7;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method493(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field529;
        int[] var9 = var4.field530;
        byte var10 = -1;
        field721 = 0;
        try {
            Statics.field713 = new int[var4.field537];
            int var11 = 0;
            Statics.field2935 = new String[var4.field535];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2538;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2539;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field11 == null ? -1 : arg0.field11.field2538;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field11 == null ? -1 : arg0.field11.field2539;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field16;
                    }
                    Statics.field713[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field2935[var12++] = var15;
                }
            }
            int var16 = 0;
            label2374: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var386 = var8[var7];
                if (var386 < 100) {
                    if (var386 == 0) {
                        field716[var5++] = var9[var7];
                        continue;
                    }
                    if (var386 == 1) {
                        int var17 = var9[var7];
                        field716[var5++] = class155.field2662[var17];
                        continue;
                    }
                    if (var386 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class155.field2662[var18] = field716[var5];
                        client.method590(var18);
                        continue;
                    }
                    if (var386 == 3) {
                        field725[var6++] = var4.field531[var7];
                        continue;
                    }
                    if (var386 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var386 == 7) {
                        var5 -= 2;
                        if (field716[var5 + 1] != field716[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var386 == 8) {
                        var5 -= 2;
                        if (field716[var5 + 1] == field716[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var386 == 9) {
                        var5 -= 2;
                        if (field716[var5] < field716[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var386 == 10) {
                        var5 -= 2;
                        if (field716[var5] > field716[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var386 == 21) {
                        if (field721 == 0) {
                            return;
                        }
                        class13 var19 = field712[--field721];
                        var4 = var19.field193;
                        var8 = var4.field529;
                        var9 = var4.field530;
                        var7 = var19.field189;
                        Statics.field713 = var19.field190;
                        Statics.field2935 = var19.field191;
                        continue;
                    }
                    if (var386 == 25) {
                        int var20 = var9[var7];
                        field716[var5++] = class155.method2483(var20);
                        continue;
                    }
                    if (var386 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field716[var5];
                        class42 var23 = (class42) class42.field973.method3225((long) var21);
                        class42 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field970.method2855(14, var21);
                            class42 var26 = new class42();
                            if (var25 != null) {
                                var26.method844(new class107(var25));
                            }
                            class42.field973.method3234(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field980;
                        int var29 = var24.field972;
                        int var30 = var24.field969;
                        int var31 = class155.field2666[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class155.field2662[var28] = class155.field2662[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var386 == 31) {
                        var5 -= 2;
                        if (field716[var5] <= field716[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var386 == 32) {
                        var5 -= 2;
                        if (field716[var5] >= field716[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var386 == 33) {
                        field716[var5++] = Statics.field713[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var386 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field713[var10001] = field716[var5];
                        continue;
                    }
                    if (var386 == 35) {
                        field725[var6++] = Statics.field2935[var9[var7]];
                        continue;
                    }
                    if (var386 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2935[var10001] = field725[var6];
                        continue;
                    }
                    if (var386 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String[] var34 = field725;
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
                        field725[var6++] = var35;
                        continue;
                    }
                    if (var386 == 38) {
                        var5--;
                        continue;
                    }
                    if (var386 == 39) {
                        var6--;
                        continue;
                    }
                    if (var386 == 40) {
                        int var45 = var9[var7];
                        class19 var46 = class19.method493(var45);
                        int[] var47 = new int[var46.field537];
                        String[] var48 = new String[var46.field535];
                        for (int var49 = 0; var49 < var46.field534; var49++) {
                            var47[var49] = field716[var5 - var46.field534 + var49];
                        }
                        for (int var50 = 0; var50 < var46.field533; var50++) {
                            var48[var50] = field725[var6 - var46.field533 + var50];
                        }
                        var5 -= var46.field534;
                        var6 -= var46.field533;
                        class13 var51 = new class13();
                        var51.field193 = var4;
                        var51.field189 = var7;
                        var51.field190 = Statics.field713;
                        var51.field191 = Statics.field2935;
                        field712[++field721 - 1] = var51;
                        var4 = var46;
                        var8 = var46.field529;
                        var9 = var46.field530;
                        var7 = -1;
                        Statics.field713 = var47;
                        Statics.field2935 = var48;
                        continue;
                    }
                    if (var386 == 42) {
                        field716[var5++] = client.field287[var9[var7]];
                        continue;
                    }
                    if (var386 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field287[var10001] = field716[var5];
                        continue;
                    }
                    if (var386 == 44) {
                        int var52 = var9[var7] >> 16;
                        int var53 = var9[var7] & 0xFFFF;
                        var5--;
                        int var54 = field716[var5];
                        if (var54 >= 0 && var54 <= 5000) {
                            field717[var52] = var54;
                            byte var55 = -1;
                            if (var53 == 105) {
                                var55 = 0;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54) {
                                    continue label2374;
                                }
                                field715[var52][var56] = var55;
                                var56++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var386 == 45) {
                        int var57 = var9[var7];
                        var5--;
                        int var58 = field716[var5];
                        if (var58 >= 0 && var58 < field717[var57]) {
                            field716[var5++] = field715[var57][var58];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var386 == 46) {
                        int var59 = var9[var7];
                        var5 -= 2;
                        int var60 = field716[var5];
                        if (var60 >= 0 && var60 < field717[var59]) {
                            field715[var59][var60] = field716[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var386 == 47) {
                        String var61 = client.field455[var9[var7]];
                        if (var61 == null) {
                            var61 = "null";
                        }
                        field725[var6++] = var61;
                        continue;
                    }
                    if (var386 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field455[var10001] = field725[var6];
                        continue;
                    }
                }
                boolean var62;
                if (var9[var7] == 1) {
                    var62 = true;
                } else {
                    var62 = false;
                }
                if (var386 < 1000) {
                    if (var386 == 100) {
                        var5 -= 3;
                        int var63 = field716[var5];
                        int var64 = field716[var5 + 1];
                        int var65 = field716[var5 + 2];
                        if (var64 == 0) {
                            throw new RuntimeException();
                        }
                        class153 var66 = class153.method2577(var63);
                        if (var66.field2632 == null) {
                            var66.field2632 = new class153[var65 + 1];
                        }
                        if (var66.field2632.length <= var65) {
                            class153[] var67 = new class153[var65 + 1];
                            for (int var68 = 0; var68 < var66.field2632.length; var68++) {
                                var67[var68] = var66.field2632[var68];
                            }
                            var66.field2632 = var67;
                        }
                        if (var65 > 0 && var66.field2632[var65 - 1] == null) {
                            throw new RuntimeException("" + (var65 - 1));
                        }
                        class153 var69 = new class153();
                        var69.field2542 = var64;
                        var69.field2549 = var69.field2538 = var66.field2538;
                        var69.field2539 = var65;
                        var69.field2537 = true;
                        var66.field2632[var65] = var69;
                        if (var62) {
                            Statics.field2966 = var69;
                        } else {
                            Statics.field517 = var69;
                        }
                        client.method45(var66);
                        continue;
                    }
                    if (var386 == 101) {
                        class153 var70 = var62 ? Statics.field2966 : Statics.field517;
                        class153 var71 = class153.method2577(var70.field2538);
                        var71.field2632[var70.field2539] = null;
                        client.method45(var71);
                        continue;
                    }
                    if (var386 == 102) {
                        var5--;
                        class153 var72 = class153.method2577(field716[var5]);
                        var72.field2632 = null;
                        client.method45(var72);
                        continue;
                    }
                    if (var386 == 200) {
                        var5 -= 2;
                        int var73 = field716[var5];
                        int var74 = field716[var5 + 1];
                        class153 var75 = class153.method2472(var73, var74);
                        if (var75 != null && var74 != -1) {
                            field716[var5++] = 1;
                            if (var62) {
                                Statics.field2966 = var75;
                            } else {
                                Statics.field517 = var75;
                            }
                            continue;
                        }
                        field716[var5++] = 0;
                        continue;
                    }
                } else if (var386 >= 1000 && var386 < 1100 || var386 >= 2000 && var386 < 2100) {
                    class153 var76;
                    if (var386 >= 2000) {
                        var386 -= 1000;
                        var5--;
                        var76 = class153.method2577(field716[var5]);
                    } else {
                        var76 = var62 ? Statics.field2966 : Statics.field517;
                    }
                    if (var386 == 1000) {
                        var5 -= 2;
                        var76.field2617 = field716[var5];
                        var76.field2544 = field716[var5 + 1];
                        client.method45(var76);
                        continue;
                    }
                    if (var386 == 1001) {
                        var5 -= 2;
                        var76.field2547 = field716[var5];
                        var76.field2648 = field716[var5 + 1];
                        client.method45(var76);
                        continue;
                    }
                    if (var386 == 1003) {
                        var5--;
                        boolean var77 = field716[var5] == 1;
                        if (var76.field2550 != var77) {
                            var76.field2550 = var77;
                            client.method45(var76);
                        }
                        continue;
                    }
                } else if (!(var386 < 1100 || var386 >= 1200) || !(var386 < 2100 || var386 >= 2200)) {
                    class153 var78;
                    if (var386 >= 2000) {
                        var386 -= 1000;
                        var5--;
                        var78 = class153.method2577(field716[var5]);
                    } else {
                        var78 = var62 ? Statics.field2966 : Statics.field517;
                    }
                    if (var386 == 1100) {
                        var5 -= 2;
                        var78.field2551 = field716[var5];
                        if (var78.field2551 > var78.field2553 - var78.field2547) {
                            var78.field2551 = var78.field2553 - var78.field2547;
                        }
                        if (var78.field2551 < 0) {
                            var78.field2551 = 0;
                        }
                        var78.field2552 = field716[var5 + 1];
                        if (var78.field2552 > var78.field2530 - var78.field2648) {
                            var78.field2552 = var78.field2530 - var78.field2648;
                        }
                        if (var78.field2552 < 0) {
                            var78.field2552 = 0;
                        }
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1101) {
                        var5--;
                        var78.field2571 = field716[var5];
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1102) {
                        var5--;
                        var78.field2654 = field716[var5] == 1;
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1103) {
                        var5--;
                        var78.field2560 = field716[var5];
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1104) {
                        var5--;
                        var78.field2561 = field716[var5];
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1105) {
                        var5--;
                        var78.field2546 = field716[var5];
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1106) {
                        var5--;
                        var78.field2604 = field716[var5];
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1107) {
                        var5--;
                        var78.field2564 = field716[var5] == 1;
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1108) {
                        var78.field2570 = 1;
                        var5--;
                        var78.field2555 = field716[var5];
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1109) {
                        var5 -= 6;
                        var78.field2541 = field716[var5];
                        var78.field2577 = field716[var5 + 1];
                        var78.field2578 = field716[var5 + 2];
                        var78.field2548 = field716[var5 + 3];
                        var78.field2576 = field716[var5 + 4];
                        var78.field2613 = field716[var5 + 5];
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1110) {
                        var5--;
                        int var79 = field716[var5];
                        if (var78.field2574 != var79) {
                            var78.field2574 = var79;
                            var78.field2580 = 0;
                            var78.field2645 = 0;
                            client.method45(var78);
                        }
                        continue;
                    }
                    if (var386 == 1111) {
                        var5--;
                        var78.field2623 = field716[var5] == 1;
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1112) {
                        var6--;
                        String var80 = field725[var6];
                        if (!var80.equals(var78.field2543)) {
                            var78.field2543 = var80;
                            client.method45(var78);
                        }
                        continue;
                    }
                    if (var386 == 1113) {
                        var5--;
                        var78.field2655 = field716[var5];
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1114) {
                        var5 -= 3;
                        var78.field2588 = field716[var5];
                        var78.field2616 = field716[var5 + 1];
                        var78.field2587 = field716[var5 + 2];
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1115) {
                        var5--;
                        var78.field2590 = field716[var5] == 1;
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1116) {
                        var5--;
                        var78.field2566 = field716[var5];
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1117) {
                        var5--;
                        var78.field2567 = field716[var5];
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1118) {
                        var5--;
                        var78.field2568 = field716[var5] == 1;
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1119) {
                        var5--;
                        var78.field2569 = field716[var5] == 1;
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1120) {
                        var5 -= 2;
                        var78.field2553 = field716[var5];
                        var78.field2530 = field716[var5 + 1];
                        client.method45(var78);
                        continue;
                    }
                    if (var386 == 1121) {
                        client.method2442(var78.field2538, var78.field2539);
                        client.field423 = var78;
                        client.method45(var78);
                        continue;
                    }
                } else if (var386 >= 1200 && var386 < 1300 || var386 >= 2200 && var386 < 2300) {
                    class153 var81;
                    if (var386 >= 2000) {
                        var386 -= 1000;
                        var5--;
                        var81 = class153.method2577(field716[var5]);
                    } else {
                        var81 = var62 ? Statics.field2966 : Statics.field517;
                    }
                    client.method45(var81);
                    if (var386 == 1200) {
                        var5 -= 2;
                        int var82 = field716[var5];
                        int var83 = field716[var5 + 1];
                        var81.field2642 = var82;
                        var81.field2643 = var83;
                        class45 var84 = class45.method588(var82);
                        var81.field2578 = var84.field1018;
                        var81.field2548 = var84.field1019;
                        var81.field2576 = var84.field1020;
                        var81.field2541 = var84.field1021;
                        var81.field2577 = var84.field1022;
                        var81.field2613 = var84.field1008;
                        if (var81.field2547 > 0) {
                            var81.field2613 = var81.field2613 * 32 / var81.field2547;
                        }
                        continue;
                    }
                    if (var386 == 1201) {
                        var81.field2570 = 2;
                        var5--;
                        var81.field2555 = field716[var5];
                        continue;
                    }
                    if (var386 == 1202) {
                        var81.field2570 = 3;
                        var81.field2555 = Statics.field1248.field47.method2977();
                        continue;
                    }
                } else if ((var386 < 1300 || var386 >= 1400) && (var386 < 2300 || var386 >= 2400)) {
                    if (var386 >= 1400 && var386 < 1500 || var386 >= 2400 && var386 < 2500) {
                        class153 var89;
                        if (var386 >= 2000) {
                            var386 -= 1000;
                            var5--;
                            var89 = class153.method2577(field716[var5]);
                        } else {
                            var89 = var62 ? Statics.field2966 : Statics.field517;
                        }
                        var6--;
                        String var90 = field725[var6];
                        int[] var91 = null;
                        if (var90.length() > 0 && var90.charAt(var90.length() - 1) == 'Y') {
                            var5--;
                            int var92 = field716[var5];
                            if (var92 > 0) {
                                var91 = new int[var92];
                                while (var92-- > 0) {
                                    var5--;
                                    var91[var92] = field716[var5];
                                }
                            }
                            var90 = var90.substring(0, var90.length() - 1);
                        }
                        Object[] var93 = new Object[var90.length() + 1];
                        for (int var94 = var93.length - 1; var94 >= 1; var94--) {
                            if (var90.charAt(var94 - 1) == 's') {
                                var6--;
                                var93[var94] = field725[var6];
                            } else {
                                var5--;
                                var93[var94] = Integer.valueOf(field716[var5]);
                            }
                        }
                        var5--;
                        int var95 = field716[var5];
                        if (var95 == -1) {
                            var93 = null;
                        } else {
                            var93[0] = Integer.valueOf(var95);
                        }
                        if (var386 == 1400) {
                            var89.field2607 = var93;
                        }
                        if (var386 == 1401) {
                            var89.field2610 = var93;
                        }
                        if (var386 == 1402) {
                            var89.field2535 = var93;
                        }
                        if (var386 == 1403) {
                            var89.field2579 = var93;
                        }
                        if (var386 == 1404) {
                            var89.field2638 = var93;
                        }
                        if (var386 == 1405) {
                            var89.field2614 = var93;
                        }
                        if (var386 == 1406) {
                            var89.field2584 = var93;
                        }
                        if (var386 == 1407) {
                            var89.field2618 = var93;
                            var89.field2619 = var91;
                        }
                        if (var386 == 1408) {
                            var89.field2624 = var93;
                        }
                        if (var386 == 1409) {
                            var89.field2606 = var93;
                        }
                        if (var386 == 1410) {
                            var89.field2532 = var93;
                        }
                        if (var386 == 1411) {
                            var89.field2528 = var93;
                        }
                        if (var386 == 1412) {
                            var89.field2612 = var93;
                        }
                        if (var386 == 1414) {
                            var89.field2620 = var93;
                            var89.field2621 = var91;
                        }
                        if (var386 == 1415) {
                            var89.field2622 = var93;
                            var89.field2615 = var91;
                        }
                        if (var386 == 1416) {
                            var89.field2591 = var93;
                        }
                        if (var386 == 1417) {
                            var89.field2626 = var93;
                        }
                        if (var386 == 1418) {
                            var89.field2627 = var93;
                        }
                        if (var386 == 1419) {
                            var89.field2628 = var93;
                        }
                        if (var386 == 1420) {
                            var89.field2629 = var93;
                        }
                        if (var386 == 1421) {
                            var89.field2630 = var93;
                        }
                        if (var386 == 1422) {
                            var89.field2631 = var93;
                        }
                        if (var386 == 1423) {
                            var89.field2646 = var93;
                        }
                        if (var386 == 1424) {
                            var89.field2633 = var93;
                        }
                        var89.field2562 = true;
                        continue;
                    }
                    if (var386 < 1600) {
                        class153 var96 = var62 ? Statics.field2966 : Statics.field517;
                        if (var386 == 1500) {
                            field716[var5++] = var96.field2617;
                            continue;
                        }
                        if (var386 == 1501) {
                            field716[var5++] = var96.field2544;
                            continue;
                        }
                        if (var386 == 1502) {
                            field716[var5++] = var96.field2547;
                            continue;
                        }
                        if (var386 == 1503) {
                            field716[var5++] = var96.field2648;
                            continue;
                        }
                        if (var386 == 1504) {
                            field716[var5++] = var96.field2550 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 1505) {
                            field716[var5++] = var96.field2549;
                            continue;
                        }
                    } else if (var386 < 1700) {
                        class153 var97 = var62 ? Statics.field2966 : Statics.field517;
                        if (var386 == 1600) {
                            field716[var5++] = var97.field2551;
                            continue;
                        }
                        if (var386 == 1601) {
                            field716[var5++] = var97.field2552;
                            continue;
                        }
                        if (var386 == 1602) {
                            field725[var6++] = var97.field2543;
                            continue;
                        }
                        if (var386 == 1603) {
                            field716[var5++] = var97.field2553;
                            continue;
                        }
                        if (var386 == 1604) {
                            field716[var5++] = var97.field2530;
                            continue;
                        }
                        if (var386 == 1605) {
                            field716[var5++] = var97.field2613;
                            continue;
                        }
                        if (var386 == 1606) {
                            field716[var5++] = var97.field2578;
                            continue;
                        }
                        if (var386 == 1607) {
                            field716[var5++] = var97.field2576;
                            continue;
                        }
                        if (var386 == 1608) {
                            field716[var5++] = var97.field2548;
                            continue;
                        }
                    } else if (var386 < 1800) {
                        class153 var98 = var62 ? Statics.field2966 : Statics.field517;
                        if (var386 == 1700) {
                            field716[var5++] = var98.field2642;
                            continue;
                        }
                        if (var386 == 1701) {
                            if (var98.field2642 == -1) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = var98.field2643;
                            }
                            continue;
                        }
                        if (var386 == 1702) {
                            field716[var5++] = var98.field2539;
                            continue;
                        }
                    } else if (var386 < 1900) {
                        class153 var99 = var62 ? Statics.field2966 : Statics.field517;
                        if (var386 == 1800) {
                            int[] var100 = field716;
                            int var101 = var5++;
                            int var102 = client.method708(var99);
                            int var103 = var102 >> 11 & 0x3F;
                            var100[var101] = var103;
                            continue;
                        }
                        if (var386 == 1801) {
                            var5--;
                            int var104 = field716[var5];
                            int var387 = var104 - 1;
                            if (var99.field2599 != null && var387 < var99.field2599.length && var99.field2599[var387] != null) {
                                field725[var6++] = var99.field2599[var387];
                                continue;
                            }
                            field725[var6++] = "";
                            continue;
                        }
                        if (var386 == 1802) {
                            if (var99.field2554 == null) {
                                field725[var6++] = "";
                            } else {
                                field725[var6++] = var99.field2554;
                            }
                            continue;
                        }
                    } else if (var386 < 2600) {
                        var5--;
                        class153 var105 = class153.method2577(field716[var5]);
                        if (var386 == 2500) {
                            field716[var5++] = var105.field2617;
                            continue;
                        }
                        if (var386 == 2501) {
                            field716[var5++] = var105.field2544;
                            continue;
                        }
                        if (var386 == 2502) {
                            field716[var5++] = var105.field2547;
                            continue;
                        }
                        if (var386 == 2503) {
                            field716[var5++] = var105.field2648;
                            continue;
                        }
                        if (var386 == 2504) {
                            field716[var5++] = var105.field2550 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 2505) {
                            field716[var5++] = var105.field2549;
                            continue;
                        }
                    } else if (var386 < 2700) {
                        var5--;
                        class153 var106 = class153.method2577(field716[var5]);
                        if (var386 == 2600) {
                            field716[var5++] = var106.field2551;
                            continue;
                        }
                        if (var386 == 2601) {
                            field716[var5++] = var106.field2552;
                            continue;
                        }
                        if (var386 == 2602) {
                            field725[var6++] = var106.field2543;
                            continue;
                        }
                        if (var386 == 2603) {
                            field716[var5++] = var106.field2553;
                            continue;
                        }
                        if (var386 == 2604) {
                            field716[var5++] = var106.field2530;
                            continue;
                        }
                        if (var386 == 2605) {
                            field716[var5++] = var106.field2613;
                            continue;
                        }
                        if (var386 == 2606) {
                            field716[var5++] = var106.field2578;
                            continue;
                        }
                        if (var386 == 2607) {
                            field716[var5++] = var106.field2576;
                            continue;
                        }
                        if (var386 == 2608) {
                            field716[var5++] = var106.field2548;
                            continue;
                        }
                    } else if (var386 < 2800) {
                        if (var386 == 2700) {
                            var5--;
                            class153 var107 = class153.method2577(field716[var5]);
                            field716[var5++] = var107.field2642;
                            continue;
                        }
                        if (var386 == 2701) {
                            var5--;
                            class153 var108 = class153.method2577(field716[var5]);
                            if (var108.field2642 == -1) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = var108.field2643;
                            }
                            continue;
                        }
                        if (var386 == 2702) {
                            var5--;
                            int var109 = field716[var5];
                            class4 var110 = (class4) client.field420.method3263((long) var109);
                            if (var110 == null) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var386 < 2900) {
                        var5--;
                        class153 var111 = class153.method2577(field716[var5]);
                        if (var386 == 2800) {
                            int[] var112 = field716;
                            int var113 = var5++;
                            int var114 = client.method708(var111);
                            int var115 = var114 >> 11 & 0x3F;
                            var112[var113] = var115;
                            continue;
                        }
                        if (var386 == 2801) {
                            var5--;
                            int var116 = field716[var5];
                            int var388 = var116 - 1;
                            if (var111.field2599 != null && var388 < var111.field2599.length && var111.field2599[var388] != null) {
                                field725[var6++] = var111.field2599[var388];
                                continue;
                            }
                            field725[var6++] = "";
                            continue;
                        }
                        if (var386 == 2802) {
                            if (var111.field2554 == null) {
                                field725[var6++] = "";
                            } else {
                                field725[var6++] = var111.field2554;
                            }
                            continue;
                        }
                    } else if (var386 < 3200) {
                        if (var386 == 3100) {
                            var6--;
                            String var117 = field725[var6];
                            class10.method849(0, "", var117);
                            continue;
                        }
                        if (var386 == 3101) {
                            var5 -= 2;
                            Statics.method3390(Statics.field1248, field716[var5], field716[var5 + 1]);
                            continue;
                        }
                        if (var386 == 3103) {
                            client.field297.method2408(77);
                            for (class4 var118 = (class4) client.field420.method3277(); var118 != null; var118 = (class4) client.field420.method3267()) {
                                if (var118.field62 == 0 || var118.field62 == 3) {
                                    client.method2754(var118, true);
                                }
                            }
                            if (client.field423 != null) {
                                client.method45(client.field423);
                                client.field423 = null;
                            }
                            continue;
                        }
                        if (var386 == 3104) {
                            var6--;
                            String var119 = field725[var6];
                            int var120 = 0;
                            boolean var121 = class200.method554(var119, 10, true);
                            if (var121) {
                                int var122 = class200.method2594(var119, 10, true);
                                var120 = var122;
                            }
                            client.field297.method2408(127);
                            client.field297.method2162(var120);
                            continue;
                        }
                        if (var386 == 3105) {
                            var6--;
                            String var123 = field725[var6];
                            client.field297.method2408(229);
                            client.field297.method2159(var123.length() + 1);
                            client.field297.method2199(var123);
                            continue;
                        }
                        if (var386 == 3106) {
                            var6--;
                            String var124 = field725[var6];
                            client.field297.method2408(210);
                            client.field297.method2159(var124.length() + 1);
                            client.field297.method2199(var124);
                            continue;
                        }
                        if (var386 == 3107) {
                            var5--;
                            int var125 = field716[var5];
                            var6--;
                            String var126 = field725[var6];
                            client.method1048(var125, var126);
                            continue;
                        }
                        if (var386 == 3108) {
                            var5 -= 3;
                            int var127 = field716[var5];
                            int var128 = field716[var5 + 1];
                            int var129 = field716[var5 + 2];
                            class153 var130 = class153.method2577(var129);
                            client.method2776(var130, var127, var128);
                            continue;
                        }
                        if (var386 == 3109) {
                            var5 -= 2;
                            int var131 = field716[var5];
                            int var132 = field716[var5 + 1];
                            class153 var133 = var62 ? Statics.field2966 : Statics.field517;
                            client.method2776(var133, var131, var132);
                            continue;
                        }
                        if (var386 == 3110) {
                            var5--;
                            Statics.field2084 = field716[var5] == 1;
                            continue;
                        }
                        if (var386 == 3111) {
                            field716[var5++] = Statics.field813.field145 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 3112) {
                            var5--;
                            Statics.field813.field145 = field716[var5] == 1;
                            class9.method2015();
                            continue;
                        }
                        if (var386 == 3113) {
                            var6--;
                            String var134 = field725[var6];
                            var5--;
                            boolean var135 = field716[var5] == 1;
                            class125.method39(var134, var135, "openjs", false);
                            continue;
                        }
                    } else if (var386 < 3300) {
                        if (var386 == 3200) {
                            var5 -= 3;
                            client.method734(field716[var5], field716[var5 + 1], field716[var5 + 2]);
                            continue;
                        }
                        if (var386 == 3201) {
                            var5--;
                            int var136 = field716[var5];
                            if (var136 == -1 && !client.field493) {
                                Statics.field697.method3109();
                                class162.field2720 = 1;
                                Statics.field1897 = null;
                            } else if (var136 != -1 && client.field492 != var136 && client.field491 != 0 && !client.field493) {
                                class162.method2769(2, Statics.field195, var136, 0, client.field491, false);
                            }
                            client.field492 = var136;
                            continue;
                        }
                        if (var386 == 3202) {
                            var5 -= 2;
                            int var137 = field716[var5];
                            int var10000 = field716[var5 + 1];
                            if (client.field491 != 0 && var137 != -1) {
                                class162.method2893(Statics.field223, var137, 0, client.field491, false);
                                client.field493 = true;
                            }
                            continue;
                        }
                    } else if (var386 < 3400) {
                        if (var386 == 3300) {
                            field716[var5++] = client.field343;
                            continue;
                        }
                        if (var386 == 3301) {
                            var5 -= 2;
                            int var139 = field716[var5];
                            int var140 = field716[var5 + 1];
                            field716[var5++] = class14.method2027(var139, var140);
                            continue;
                        }
                        if (var386 == 3302) {
                            var5 -= 2;
                            int var141 = field716[var5];
                            int var142 = field716[var5 + 1];
                            int[] var143 = field716;
                            int var144 = var5++;
                            class14 var145 = (class14) class14.field198.method3263((long) var141);
                            int var146;
                            if (var145 == null) {
                                var146 = 0;
                            } else if (var142 >= 0 && var142 < var145.field199.length) {
                                var146 = var145.field199[var142];
                            } else {
                                var146 = 0;
                            }
                            var143[var144] = var146;
                            continue;
                        }
                        if (var386 == 3303) {
                            var5 -= 2;
                            int var147 = field716[var5];
                            int var148 = field716[var5 + 1];
                            field716[var5++] = class14.method1649(var147, var148);
                            continue;
                        }
                        if (var386 == 3304) {
                            var5--;
                            int var149 = field716[var5];
                            int[] var150 = field716;
                            int var151 = var5++;
                            class44 var152 = (class44) class44.field996.method3225((long) var149);
                            class44 var153;
                            if (var152 == null) {
                                byte[] var154 = Statics.field1000.method2855(5, var149);
                                class44 var155 = new class44();
                                if (var154 != null) {
                                    var155.method869(new class107(var154));
                                }
                                class44.field996.method3234(var155, (long) var149);
                                var153 = var155;
                            } else {
                                var153 = var152;
                            }
                            var150[var151] = var153.field998;
                            continue;
                        }
                        if (var386 == 3305) {
                            var5--;
                            int var156 = field716[var5];
                            field716[var5++] = client.field381[var156];
                            continue;
                        }
                        if (var386 == 3306) {
                            var5--;
                            int var157 = field716[var5];
                            field716[var5++] = client.field397[var157];
                            continue;
                        }
                        if (var386 == 3307) {
                            var5--;
                            int var158 = field716[var5];
                            field716[var5++] = client.field323[var158];
                            continue;
                        }
                        if (var386 == 3308) {
                            int var159 = Statics.field243;
                            int var160 = (Statics.field1248.field740 >> 7) + Statics.field1245;
                            int var161 = (Statics.field1248.field730 >> 7) + Statics.field2495;
                            field716[var5++] = (var159 << 28) + (var160 << 14) + var161;
                            continue;
                        }
                        if (var386 == 3309) {
                            var5--;
                            int var162 = field716[var5];
                            field716[var5++] = var162 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var386 == 3310) {
                            var5--;
                            int var163 = field716[var5];
                            field716[var5++] = var163 >> 28;
                            continue;
                        }
                        if (var386 == 3311) {
                            var5--;
                            int var164 = field716[var5];
                            field716[var5++] = var164 & 0x3FFF;
                            continue;
                        }
                        if (var386 == 3312) {
                            field716[var5++] = client.field513 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 3313) {
                            var5 -= 2;
                            int var165 = field716[var5] + 32768;
                            int var166 = field716[var5 + 1];
                            int[] var167 = field716;
                            int var168 = var5++;
                            class14 var169 = (class14) class14.field198.method3263((long) var165);
                            int var170;
                            if (var169 == null) {
                                var170 = -1;
                            } else if (var166 >= 0 && var166 < var169.field202.length) {
                                var170 = var169.field202[var166];
                            } else {
                                var170 = -1;
                            }
                            var167[var168] = var170;
                            continue;
                        }
                        if (var386 == 3314) {
                            var5 -= 2;
                            int var171 = field716[var5] + 32768;
                            int var172 = field716[var5 + 1];
                            int[] var173 = field716;
                            int var174 = var5++;
                            class14 var175 = (class14) class14.field198.method3263((long) var171);
                            int var176;
                            if (var175 == null) {
                                var176 = 0;
                            } else if (var172 >= 0 && var172 < var175.field199.length) {
                                var176 = var175.field199[var172];
                            } else {
                                var176 = 0;
                            }
                            var173[var174] = var176;
                            continue;
                        }
                        if (var386 == 3315) {
                            var5 -= 2;
                            int var177 = field716[var5] + 32768;
                            int var178 = field716[var5 + 1];
                            field716[var5++] = class14.method1649(var177, var178);
                            continue;
                        }
                        if (var386 == 3316) {
                            if (client.field426 >= 2) {
                                field716[var5++] = client.field426;
                            } else {
                                field716[var5++] = 0;
                            }
                            continue;
                        }
                        if (var386 == 3317) {
                            field716[var5++] = client.field272;
                            continue;
                        }
                        if (var386 == 3318) {
                            field716[var5++] = client.field320;
                            continue;
                        }
                        if (var386 == 3321) {
                            field716[var5++] = client.field488;
                            continue;
                        }
                        if (var386 == 3322) {
                            field716[var5++] = client.field425;
                            continue;
                        }
                        if (var386 == 3323) {
                            if (client.field519) {
                                field716[var5++] = 1;
                            } else {
                                field716[var5++] = 0;
                            }
                            continue;
                        }
                        if (var386 == 3324) {
                            field716[var5++] = client.field256;
                            continue;
                        }
                    } else if (var386 < 3500) {
                        if (var386 == 3400) {
                            var5 -= 2;
                            int var179 = field716[var5];
                            int var180 = field716[var5 + 1];
                            class43 var181 = class43.method488(var179);
                            if (var181.field984 != 's') {
                            }
                            for (int var182 = 0; var182 < var181.field987; var182++) {
                                if (var181.field994[var182] == var180) {
                                    field725[var6++] = var181.field990[var182];
                                    var181 = null;
                                    break;
                                }
                            }
                            if (var181 != null) {
                                field725[var6++] = var181.field985;
                            }
                            continue;
                        }
                        if (var386 == 3408) {
                            var5 -= 4;
                            int var183 = field716[var5];
                            int var184 = field716[var5 + 1];
                            int var185 = field716[var5 + 2];
                            int var186 = field716[var5 + 3];
                            class43 var187 = class43.method488(var185);
                            if (var187.field983 == var183 && var187.field984 == var184) {
                                for (int var188 = 0; var188 < var187.field987; var188++) {
                                    if (var187.field994[var188] == var186) {
                                        if (var184 == 115) {
                                            field725[var6++] = var187.field990[var188];
                                        } else {
                                            field716[var5++] = var187.field988[var188];
                                        }
                                        var187 = null;
                                        break;
                                    }
                                }
                                if (var187 != null) {
                                    if (var184 == 115) {
                                        field725[var6++] = var187.field985;
                                    } else {
                                        field716[var5++] = var187.field986;
                                    }
                                }
                                continue;
                            }
                            if (var184 == 115) {
                                field725[var6++] = "null";
                            } else {
                                field716[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var386 < 3700) {
                        if (var386 == 3600) {
                            if (client.field509 == 0) {
                                field716[var5++] = -2;
                            } else if (client.field509 == 1) {
                                field716[var5++] = -1;
                            } else {
                                field716[var5++] = client.field269;
                            }
                            continue;
                        }
                        if (var386 == 3601) {
                            var5--;
                            int var189 = field716[var5];
                            if (client.field509 == 2 && var189 < client.field269) {
                                field725[var6++] = client.field510[var189].field232;
                                field725[var6++] = client.field510[var189].field230;
                                continue;
                            }
                            field725[var6++] = "";
                            field725[var6++] = "";
                            continue;
                        }
                        if (var386 == 3602) {
                            var5--;
                            int var190 = field716[var5];
                            if (client.field509 == 2 && var190 < client.field269) {
                                field716[var5++] = client.field510[var190].field236;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var386 == 3603) {
                            var5--;
                            int var191 = field716[var5];
                            if (client.field509 == 2 && var191 < client.field269) {
                                field716[var5++] = client.field510[var191].field237;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var386 == 3604) {
                            var6--;
                            String var192 = field725[var6];
                            var5--;
                            int var193 = field716[var5];
                            client.method2757(var192, var193);
                            continue;
                        }
                        if (var386 == 3605) {
                            var6--;
                            String var194 = field725[var6];
                            if (var194 == null) {
                                continue;
                            }
                            if ((client.field269 < 200 || client.field383 == 1) && client.field269 < 400) {
                                String var195 = class201.method1115(var194, Statics.field2064);
                                if (var195 == null) {
                                    continue;
                                }
                                for (int var196 = 0; var196 < client.field269; var196++) {
                                    class16 var197 = client.field510[var196];
                                    String var198 = class201.method1115(var197.field232, Statics.field2064);
                                    if (var198 != null && var198.equals(var195)) {
                                        class10.method849(30, "", var194 + class143.field2342);
                                        continue label2374;
                                    }
                                    if (var197.field230 != null) {
                                        String var199 = class201.method1115(var197.field230, Statics.field2064);
                                        if (var199 != null && var199.equals(var195)) {
                                            class10.method849(30, "", var194 + class143.field2342);
                                            continue label2374;
                                        }
                                    }
                                }
                                for (int var200 = 0; var200 < client.field512; var200++) {
                                    class8 var201 = client.field257[var200];
                                    String var202 = class201.method1115(var201.field130, Statics.field2064);
                                    if (var202 != null && var202.equals(var195)) {
                                        class10.method849(30, "", class143.field2319 + var194 + class143.field2308);
                                        continue label2374;
                                    }
                                    if (var201.field140 != null) {
                                        String var203 = class201.method1115(var201.field140, Statics.field2064);
                                        if (var203 != null && var203.equals(var195)) {
                                            class10.method849(30, "", class143.field2319 + var194 + class143.field2308);
                                            continue label2374;
                                        }
                                    }
                                }
                                if (class201.method1115(Statics.field1248.field44, Statics.field2064).equals(var195)) {
                                    class10.method849(30, "", class143.field2296);
                                } else {
                                    client.field297.method2408(51);
                                    class110 var204 = client.field297;
                                    int var205 = var194.length() + 1;
                                    var204.method2159(var205);
                                    client.field297.method2199(var194);
                                }
                                continue;
                            }
                            class10.method849(30, "", class143.field2313);
                            continue;
                        }
                        if (var386 == 3606) {
                            var6--;
                            String var206 = field725[var6];
                            client.method2590(var206);
                            continue;
                        }
                        if (var386 == 3607) {
                            var6--;
                            String var207 = field725[var6];
                            client.method525(var207, false);
                            continue;
                        }
                        if (var386 == 3608) {
                            var6--;
                            String var208 = field725[var6];
                            if (var208 == null) {
                                continue;
                            }
                            String var209 = class201.method1115(var208, Statics.field2064);
                            if (var209 == null) {
                                continue;
                            }
                            int var210 = 0;
                            while (true) {
                                if (var210 >= client.field512) {
                                    continue label2374;
                                }
                                class8 var211 = client.field257[var210];
                                String var212 = var211.field130;
                                String var213 = class201.method1115(var212, Statics.field2064);
                                boolean var214;
                                if (var208 == null || var212 == null) {
                                    var214 = false;
                                } else if (var208.startsWith("#") || var212.startsWith("#")) {
                                    var214 = var208.equals(var212);
                                } else {
                                    var214 = var209.equals(var213);
                                }
                                if (var214) {
                                    client.field512--;
                                    for (int var215 = var210; var215 < client.field512; var215++) {
                                        client.field257[var215] = client.field257[var215 + 1];
                                    }
                                    client.field451 = client.field443;
                                    client.field297.method2408(57);
                                    class110 var216 = client.field297;
                                    int var217 = var208.length() + 1;
                                    var216.method2159(var217);
                                    client.field297.method2199(var208);
                                    continue label2374;
                                }
                                var210++;
                            }
                        }
                        if (var386 == 3609) {
                            var6--;
                            String var218 = field725[var6];
                            class138[] var219 = class138.method107();
                            for (int var220 = 0; var220 < var219.length; var220++) {
                                class138 var221 = var219[var220];
                                if (var221.field2103 != -1) {
                                    int var223 = var221.field2103;
                                    String var224 = "<img=" + var223 + ">";
                                    if (var218.startsWith(var224)) {
                                        var218 = var218.substring(6 + Integer.toString(var221.field2103).length());
                                        break;
                                    }
                                }
                            }
                            field716[var5++] = client.method936(var218, false) ? 1 : 0;
                            continue;
                        }
                        if (var386 == 3611) {
                            if (client.field480 == null) {
                                field725[var6++] = "";
                            } else {
                                field725[var6++] = class199.method1915(client.field480);
                            }
                            continue;
                        }
                        if (var386 == 3612) {
                            if (client.field480 == null) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = Statics.field1290;
                            }
                            continue;
                        }
                        if (var386 == 3613) {
                            var5--;
                            int var225 = field716[var5];
                            if (client.field480 != null && var225 < Statics.field1290) {
                                field725[var6++] = Statics.field1015[var225].field561;
                                continue;
                            }
                            field725[var6++] = "";
                            continue;
                        }
                        if (var386 == 3614) {
                            var5--;
                            int var226 = field716[var5];
                            if (client.field480 != null && var226 < Statics.field1290) {
                                field716[var5++] = Statics.field1015[var226].field559;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var386 == 3615) {
                            var5--;
                            int var227 = field716[var5];
                            if (client.field480 != null && var227 < Statics.field1290) {
                                field716[var5++] = Statics.field1015[var227].field560;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var386 == 3616) {
                            field716[var5++] = Statics.field150;
                            continue;
                        }
                        if (var386 == 3617) {
                            var6--;
                            String var228 = field725[var6];
                            client.method536(var228);
                            continue;
                        }
                        if (var386 == 3618) {
                            field716[var5++] = Statics.field146;
                            continue;
                        }
                        if (var386 == 3619) {
                            var6--;
                            String var229 = field725[var6];
                            if (!var229.equals("")) {
                                client.field297.method2408(10);
                                class110 var230 = client.field297;
                                int var231 = var229.length() + 1;
                                var230.method2159(var231);
                                client.field297.method2199(var229);
                            }
                            continue;
                        }
                        if (var386 == 3620) {
                            client.method147();
                            continue;
                        }
                        if (var386 == 3621) {
                            if (client.field509 == 0) {
                                field716[var5++] = -1;
                            } else {
                                field716[var5++] = client.field512;
                            }
                            continue;
                        }
                        if (var386 == 3622) {
                            var5--;
                            int var232 = field716[var5];
                            if (client.field509 != 0 && var232 < client.field512) {
                                field725[var6++] = client.field257[var232].field130;
                                field725[var6++] = client.field257[var232].field140;
                                continue;
                            }
                            field725[var6++] = "";
                            field725[var6++] = "";
                            continue;
                        }
                        if (var386 == 3623) {
                            String var233;
                            label2186: {
                                var6--;
                                var233 = field725[var6];
                                String var235 = "<img=0>";
                                if (!var233.startsWith(var235)) {
                                    String var237 = "<img=1>";
                                    if (!var233.startsWith(var237)) {
                                        break label2186;
                                    }
                                }
                                var233 = var233.substring(7);
                            }
                            field716[var5++] = client.method514(var233) ? 1 : 0;
                            continue;
                        }
                        if (var386 == 3624) {
                            var5--;
                            int var238 = field716[var5];
                            if (Statics.field1015 != null && var238 < Statics.field1290 && Statics.field1015[var238].field561.equalsIgnoreCase(Statics.field1248.field44)) {
                                field716[var5++] = 1;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var386 == 3625) {
                            if (client.field481 == null) {
                                field725[var6++] = "";
                            } else {
                                field725[var6++] = class199.method1915(client.field481);
                            }
                            continue;
                        }
                    } else if (var386 < 4100) {
                        if (var386 == 4000) {
                            var5 -= 2;
                            int var239 = field716[var5];
                            int var240 = field716[var5 + 1];
                            field716[var5++] = var239 + var240;
                            continue;
                        }
                        if (var386 == 4001) {
                            var5 -= 2;
                            int var241 = field716[var5];
                            int var242 = field716[var5 + 1];
                            field716[var5++] = var241 - var242;
                            continue;
                        }
                        if (var386 == 4002) {
                            var5 -= 2;
                            int var243 = field716[var5];
                            int var244 = field716[var5 + 1];
                            field716[var5++] = var243 * var244;
                            continue;
                        }
                        if (var386 == 4003) {
                            var5 -= 2;
                            int var245 = field716[var5];
                            int var246 = field716[var5 + 1];
                            field716[var5++] = var245 / var246;
                            continue;
                        }
                        if (var386 == 4004) {
                            var5--;
                            int var247 = field716[var5];
                            field716[var5++] = (int) (Math.random() * (double) var247);
                            continue;
                        }
                        if (var386 == 4005) {
                            var5--;
                            int var248 = field716[var5];
                            field716[var5++] = (int) (Math.random() * (double) (var248 + 1));
                            continue;
                        }
                        if (var386 == 4006) {
                            var5 -= 5;
                            int var249 = field716[var5];
                            int var250 = field716[var5 + 1];
                            int var251 = field716[var5 + 2];
                            int var252 = field716[var5 + 3];
                            int var253 = field716[var5 + 4];
                            field716[var5++] = (var250 - var249) * (var253 - var251) / (var252 - var251) + var249;
                            continue;
                        }
                        if (var386 == 4007) {
                            var5 -= 2;
                            int var254 = field716[var5];
                            int var255 = field716[var5 + 1];
                            field716[var5++] = var254 * var255 / 100 + var254;
                            continue;
                        }
                        if (var386 == 4008) {
                            var5 -= 2;
                            int var256 = field716[var5];
                            int var257 = field716[var5 + 1];
                            field716[var5++] = var256 | 0x1 << var257;
                            continue;
                        }
                        if (var386 == 4009) {
                            var5 -= 2;
                            int var258 = field716[var5];
                            int var259 = field716[var5 + 1];
                            field716[var5++] = var258 & -1 - (0x1 << var259);
                            continue;
                        }
                        if (var386 == 4010) {
                            var5 -= 2;
                            int var260 = field716[var5];
                            int var261 = field716[var5 + 1];
                            field716[var5++] = (var260 & 0x1 << var261) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var386 == 4011) {
                            var5 -= 2;
                            int var262 = field716[var5];
                            int var263 = field716[var5 + 1];
                            field716[var5++] = var262 % var263;
                            continue;
                        }
                        if (var386 == 4012) {
                            var5 -= 2;
                            int var264 = field716[var5];
                            int var265 = field716[var5 + 1];
                            if (var264 == 0) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = (int) Math.pow((double) var264, (double) var265);
                            }
                            continue;
                        }
                        if (var386 == 4013) {
                            var5 -= 2;
                            int var266 = field716[var5];
                            int var267 = field716[var5 + 1];
                            if (var266 == 0) {
                                field716[var5++] = 0;
                            } else if (var267 == 0) {
                                field716[var5++] = Integer.MAX_VALUE;
                            } else {
                                field716[var5++] = (int) Math.pow((double) var266, 1.0D / (double) var267);
                            }
                            continue;
                        }
                        if (var386 == 4014) {
                            var5 -= 2;
                            int var268 = field716[var5];
                            int var269 = field716[var5 + 1];
                            field716[var5++] = var268 & var269;
                            continue;
                        }
                        if (var386 == 4015) {
                            var5 -= 2;
                            int var270 = field716[var5];
                            int var271 = field716[var5 + 1];
                            field716[var5++] = var270 | var271;
                            continue;
                        }
                    } else if (var386 < 4200) {
                        if (var386 == 4100) {
                            var6--;
                            String var272 = field725[var6];
                            var5--;
                            int var273 = field716[var5];
                            field725[var6++] = var272 + var273;
                            continue;
                        }
                        if (var386 == 4101) {
                            var6 -= 2;
                            String var274 = field725[var6];
                            String var275 = field725[var6 + 1];
                            field725[var6++] = var274 + var275;
                            continue;
                        }
                        if (var386 == 4102) {
                            var6--;
                            String var276 = field725[var6];
                            var5--;
                            int var277 = field716[var5];
                            field725[var6++] = var276 + class200.method3219(var277, true);
                            continue;
                        }
                        if (var386 == 4103) {
                            var6--;
                            String var278 = field725[var6];
                            field725[var6++] = var278.toLowerCase();
                            continue;
                        }
                        if (var386 == 4104) {
                            var5--;
                            int var279 = field716[var5];
                            long var280 = ((long) var279 + 11745L) * 86400000L;
                            field720.setTime(new Date(var280));
                            int var282 = field720.get(5);
                            int var283 = field720.get(2);
                            int var284 = field720.get(1);
                            field725[var6++] = var282 + "-" + field714[var283] + "-" + var284;
                            continue;
                        }
                        if (var386 == 4105) {
                            var6 -= 2;
                            String var285 = field725[var6];
                            String var286 = field725[var6 + 1];
                            if (Statics.field1248.field47 != null && Statics.field1248.field47.field2681) {
                                field725[var6++] = var286;
                                continue;
                            }
                            field725[var6++] = var285;
                            continue;
                        }
                        if (var386 == 4106) {
                            var5--;
                            int var287 = field716[var5];
                            field725[var6++] = Integer.toString(var287);
                            continue;
                        }
                        if (var386 == 4107) {
                            var6 -= 2;
                            field716[var5++] = class200.method2028(class203.method2113(field725[var6], field725[var6 + 1], client.field261));
                            continue;
                        }
                        if (var386 == 4108) {
                            var6--;
                            String var288 = field725[var6];
                            var5 -= 2;
                            int var289 = field716[var5];
                            int var290 = field716[var5 + 1];
                            byte[] var291 = Statics.field799.method2855(var290, 0);
                            class194 var292 = new class194(var291);
                            field716[var5++] = var292.method3404(var288, var289);
                            continue;
                        }
                        if (var386 == 4109) {
                            var6--;
                            String var293 = field725[var6];
                            var5 -= 2;
                            int var294 = field716[var5];
                            int var295 = field716[var5 + 1];
                            byte[] var296 = Statics.field799.method2855(var295, 0);
                            class194 var297 = new class194(var296);
                            field716[var5++] = var297.method3403(var293, var294);
                            continue;
                        }
                        if (var386 == 4110) {
                            var6 -= 2;
                            String var298 = field725[var6];
                            String var299 = field725[var6 + 1];
                            var5--;
                            if (field716[var5] == 1) {
                                field725[var6++] = var298;
                            } else {
                                field725[var6++] = var299;
                            }
                            continue;
                        }
                        if (var386 == 4111) {
                            var6--;
                            String var300 = field725[var6];
                            field725[var6++] = class193.method3405(var300);
                            continue;
                        }
                        if (var386 == 4112) {
                            var6--;
                            String var301 = field725[var6];
                            var5--;
                            int var302 = field716[var5];
                            field725[var6++] = var301 + (char) var302;
                            continue;
                        }
                        if (var386 == 4113) {
                            var5--;
                            int var303 = field716[var5];
                            field716[var5++] = class200.method2765((char) var303) ? 1 : 0;
                            continue;
                        }
                        if (var386 == 4114) {
                            var5--;
                            int var304 = field716[var5];
                            field716[var5++] = class200.method3220((char) var304) ? 1 : 0;
                            continue;
                        }
                        if (var386 == 4115) {
                            var5--;
                            int var305 = field716[var5];
                            int[] var306 = field716;
                            int var307 = var5++;
                            char var308 = (char) var305;
                            boolean var309 = var308 >= 'A' && var308 <= 'Z' || var308 >= 'a' && var308 <= 'z';
                            var306[var307] = var309 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 4116) {
                            var5--;
                            int var310 = field716[var5];
                            int[] var311 = field716;
                            int var312 = var5++;
                            char var313 = (char) var310;
                            boolean var314 = var313 >= '0' && var313 <= '9';
                            var311[var312] = var314 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 4117) {
                            var6--;
                            String var315 = field725[var6];
                            if (var315 == null) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = var315.length();
                            }
                            continue;
                        }
                        if (var386 == 4118) {
                            var6--;
                            String var316 = field725[var6];
                            var5 -= 2;
                            int var317 = field716[var5];
                            int var318 = field716[var5 + 1];
                            field725[var6++] = var316.substring(var317, var318);
                            continue;
                        }
                        if (var386 == 4119) {
                            var6--;
                            String var319 = field725[var6];
                            StringBuilder var320 = new StringBuilder(var319.length());
                            boolean var321 = false;
                            for (int var322 = 0; var322 < var319.length(); var322++) {
                                char var323 = var319.charAt(var322);
                                if (var323 == '<') {
                                    var321 = true;
                                } else if (var323 == '>') {
                                    var321 = false;
                                } else if (!var321) {
                                    var320.append(var323);
                                }
                            }
                            field725[var6++] = var320.toString();
                            continue;
                        }
                        if (var386 == 4120) {
                            var6--;
                            String var324 = field725[var6];
                            var5--;
                            int var325 = field716[var5];
                            field716[var5++] = var324.indexOf(var325);
                            continue;
                        }
                        if (var386 == 4121) {
                            var6 -= 2;
                            String var326 = field725[var6];
                            String var327 = field725[var6 + 1];
                            var5--;
                            int var328 = field716[var5];
                            field716[var5++] = var326.indexOf(var327, var328);
                            continue;
                        }
                    } else if (var386 < 4300) {
                        if (var386 == 4200) {
                            var5--;
                            int var329 = field716[var5];
                            field725[var6++] = class45.method588(var329).field1012;
                            continue;
                        }
                        if (var386 == 4201) {
                            var5 -= 2;
                            int var330 = field716[var5];
                            int var331 = field716[var5 + 1];
                            class45 var332 = class45.method588(var330);
                            if (var331 >= 1 && var331 <= 5 && var332.field1050[var331 - 1] != null) {
                                field725[var6++] = var332.field1050[var331 - 1];
                                continue;
                            }
                            field725[var6++] = "";
                            continue;
                        }
                        if (var386 == 4202) {
                            var5 -= 2;
                            int var333 = field716[var5];
                            int var334 = field716[var5 + 1];
                            class45 var335 = class45.method588(var333);
                            if (var334 >= 1 && var334 <= 5 && var335.field1027[var334 - 1] != null) {
                                field725[var6++] = var335.field1027[var334 - 1];
                                continue;
                            }
                            field725[var6++] = "";
                            continue;
                        }
                        if (var386 == 4203) {
                            var5--;
                            int var336 = field716[var5];
                            field716[var5++] = class45.method588(var336).field1044;
                            continue;
                        }
                        if (var386 == 4204) {
                            var5--;
                            int var337 = field716[var5];
                            field716[var5++] = class45.method588(var337).field1023 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var386 == 4205) {
                            var5--;
                            int var338 = field716[var5];
                            class45 var339 = class45.method588(var338);
                            if (var339.field1043 == -1 && var339.field1042 >= 0) {
                                field716[var5++] = var339.field1042;
                                continue;
                            }
                            field716[var5++] = var338;
                            continue;
                        }
                        if (var386 == 4206) {
                            var5--;
                            int var340 = field716[var5];
                            class45 var341 = class45.method588(var340);
                            if (var341.field1043 >= 0 && var341.field1042 >= 0) {
                                field716[var5++] = var341.field1042;
                                continue;
                            }
                            field716[var5++] = var340;
                            continue;
                        }
                        if (var386 == 4207) {
                            var5--;
                            int var342 = field716[var5];
                            field716[var5++] = class45.method588(var342).field1025 ? 1 : 0;
                            continue;
                        }
                    } else if (var386 < 5100) {
                        if (var386 == 5000) {
                            field716[var5++] = client.field359;
                            continue;
                        }
                        if (var386 == 5001) {
                            var5 -= 3;
                            client.field359 = field716[var5];
                            int var343 = field716[var5 + 1];
                            class117[] var344 = new class117[] { class117.field1895, class117.field1894, class117.field1896 };
                            class117[] var345 = var344;
                            int var346 = 0;
                            class117 var348;
                            while (true) {
                                if (var346 >= var345.length) {
                                    var348 = null;
                                    break;
                                }
                                class117 var347 = var345[var346];
                                if (var347.field1893 == var343) {
                                    var348 = var347;
                                    break;
                                }
                                var346++;
                            }
                            Statics.field2451 = var348;
                            if (Statics.field2451 == null) {
                                Statics.field2451 = class117.field1896;
                            }
                            client.field304 = field716[var5 + 2];
                            client.field297.method2408(128);
                            client.field297.method2159(client.field359);
                            client.field297.method2159(Statics.field2451.field1893);
                            client.field297.method2159(client.field304);
                            continue;
                        }
                        if (var386 == 5002) {
                            var6--;
                            String var349 = field725[var6];
                            var5 -= 2;
                            int var350 = field716[var5];
                            int var351 = field716[var5 + 1];
                            client.field297.method2408(172);
                            class110 var352 = client.field297;
                            int var353 = var349.length() + 1;
                            var352.method2159(var353 + 2);
                            client.field297.method2199(var349);
                            client.field297.method2159(var350 - 1);
                            client.field297.method2159(var351);
                            continue;
                        }
                        if (var386 == 5003) {
                            var5 -= 2;
                            int var354 = field716[var5];
                            int var355 = field716[var5 + 1];
                            class24 var356 = (class24) class10.field157.get(var354);
                            class31 var357 = var356.method526(var355);
                            if (var357 == null) {
                                field716[var5++] = -1;
                                field716[var5++] = 0;
                                field725[var6++] = "";
                                field725[var6++] = "";
                                field725[var6++] = "";
                            } else {
                                field716[var5++] = var357.field706;
                                field716[var5++] = var357.field703;
                                field725[var6++] = var357.field704 == null ? "" : var357.field704;
                                field725[var6++] = var357.field707 == null ? "" : var357.field707;
                                field725[var6++] = var357.field708 == null ? "" : var357.field708;
                            }
                            continue;
                        }
                        if (var386 == 5004) {
                            var5--;
                            int var359 = field716[var5];
                            class31 var360 = class10.method2953(var359);
                            if (var360 == null) {
                                field716[var5++] = -1;
                                field716[var5++] = 0;
                                field725[var6++] = "";
                                field725[var6++] = "";
                                field725[var6++] = "";
                            } else {
                                field716[var5++] = var360.field705;
                                field716[var5++] = var360.field703;
                                field725[var6++] = var360.field704 == null ? "" : var360.field704;
                                field725[var6++] = var360.field707 == null ? "" : var360.field707;
                                field725[var6++] = var360.field708 == null ? "" : var360.field708;
                            }
                            continue;
                        }
                        if (var386 == 5005) {
                            if (Statics.field2451 == null) {
                                field716[var5++] = -1;
                            } else {
                                field716[var5++] = Statics.field2451.field1893;
                            }
                            continue;
                        }
                        if (var386 == 5008) {
                            var6--;
                            String var361 = field725[var6];
                            var5--;
                            int var362 = field716[var5];
                            String var363 = var361.toLowerCase();
                            byte var364 = 0;
                            if (var363.startsWith(class143.field2182)) {
                                var364 = 0;
                                var361 = var361.substring(class143.field2182.length());
                            } else if (var363.startsWith(class143.field2325)) {
                                var364 = 1;
                                var361 = var361.substring(class143.field2325.length());
                            } else if (var363.startsWith(class143.field2327)) {
                                var364 = 2;
                                var361 = var361.substring(class143.field2327.length());
                            } else if (var363.startsWith(class143.field2150)) {
                                var364 = 3;
                                var361 = var361.substring(class143.field2150.length());
                            } else if (var363.startsWith(class143.field2386)) {
                                var364 = 4;
                                var361 = var361.substring(class143.field2386.length());
                            } else if (var363.startsWith(class143.field2333)) {
                                var364 = 5;
                                var361 = var361.substring(class143.field2333.length());
                            } else if (var363.startsWith(class143.field2245)) {
                                var364 = 6;
                                var361 = var361.substring(class143.field2245.length());
                            } else if (var363.startsWith(class143.field2372)) {
                                var364 = 7;
                                var361 = var361.substring(class143.field2372.length());
                            } else if (var363.startsWith(class143.field2339)) {
                                var364 = 8;
                                var361 = var361.substring(class143.field2339.length());
                            } else if (var363.startsWith(class143.field2341)) {
                                var364 = 9;
                                var361 = var361.substring(class143.field2341.length());
                            } else if (var363.startsWith(class143.field2147)) {
                                var364 = 10;
                                var361 = var361.substring(class143.field2147.length());
                            } else if (var363.startsWith(class143.field2345)) {
                                var364 = 11;
                                var361 = var361.substring(class143.field2345.length());
                            } else if (client.field261 != 0) {
                                if (var363.startsWith(class143.field2324)) {
                                    var364 = 0;
                                    var361 = var361.substring(class143.field2324.length());
                                } else if (var363.startsWith(class143.field2326)) {
                                    var364 = 1;
                                    var361 = var361.substring(class143.field2326.length());
                                } else if (var363.startsWith(class143.field2328)) {
                                    var364 = 2;
                                    var361 = var361.substring(class143.field2328.length());
                                } else if (var363.startsWith(class143.field2197)) {
                                    var364 = 3;
                                    var361 = var361.substring(class143.field2197.length());
                                } else if (var363.startsWith(class143.field2332)) {
                                    var364 = 4;
                                    var361 = var361.substring(class143.field2332.length());
                                } else if (var363.startsWith(class143.field2334)) {
                                    var364 = 5;
                                    var361 = var361.substring(class143.field2334.length());
                                } else if (var363.startsWith(class143.field2336)) {
                                    var364 = 6;
                                    var361 = var361.substring(class143.field2336.length());
                                } else if (var363.startsWith(class143.field2338)) {
                                    var364 = 7;
                                    var361 = var361.substring(class143.field2338.length());
                                } else if (var363.startsWith(class143.field2340)) {
                                    var364 = 8;
                                    var361 = var361.substring(class143.field2340.length());
                                } else if (var363.startsWith(class143.field2329)) {
                                    var364 = 9;
                                    var361 = var361.substring(class143.field2329.length());
                                } else if (var363.startsWith(class143.field2181)) {
                                    var364 = 10;
                                    var361 = var361.substring(class143.field2181.length());
                                } else if (var363.startsWith(class143.field2346)) {
                                    var364 = 11;
                                    var361 = var361.substring(class143.field2346.length());
                                }
                            }
                            String var365 = var361.toLowerCase();
                            byte var366 = 0;
                            if (var365.startsWith(class143.field2292)) {
                                var366 = 1;
                                var361 = var361.substring(class143.field2292.length());
                            } else if (var365.startsWith(class143.field2344)) {
                                var366 = 2;
                                var361 = var361.substring(class143.field2344.length());
                            } else if (var365.startsWith(class143.field2351)) {
                                var366 = 3;
                                var361 = var361.substring(class143.field2351.length());
                            } else if (var365.startsWith(class143.field2353)) {
                                var366 = 4;
                                var361 = var361.substring(class143.field2353.length());
                            } else if (var365.startsWith(class143.field2355)) {
                                var366 = 5;
                                var361 = var361.substring(class143.field2355.length());
                            } else if (client.field261 != 0) {
                                if (var365.startsWith(class143.field2348)) {
                                    var366 = 1;
                                    var361 = var361.substring(class143.field2348.length());
                                } else if (var365.startsWith(class143.field2349)) {
                                    var366 = 2;
                                    var361 = var361.substring(class143.field2349.length());
                                } else if (var365.startsWith(class143.field2352)) {
                                    var366 = 3;
                                    var361 = var361.substring(class143.field2352.length());
                                } else if (var365.startsWith(class143.field2390)) {
                                    var366 = 4;
                                    var361 = var361.substring(class143.field2390.length());
                                } else if (var365.startsWith(class143.field2356)) {
                                    var366 = 5;
                                    var361 = var361.substring(class143.field2356.length());
                                }
                            }
                            client.field297.method2408(2);
                            client.field297.method2159(0);
                            int var367 = client.field297.field1837;
                            client.field297.method2159(var362);
                            client.field297.method2159(var364);
                            client.field297.method2159(var366);
                            class192.method2592(client.field297, var361);
                            client.field297.method2206(client.field297.field1837 - var367);
                            continue;
                        }
                        if (var386 == 5009) {
                            var6 -= 2;
                            String var368 = field725[var6];
                            String var369 = field725[var6 + 1];
                            client.field297.method2408(142);
                            client.field297.method2364(0);
                            int var370 = client.field297.field1837;
                            client.field297.method2199(var368);
                            class192.method2592(client.field297, var369);
                            client.field297.method2169(client.field297.field1837 - var370);
                            continue;
                        }
                        if (var386 == 5015) {
                            String var371;
                            if (Statics.field1248 == null || Statics.field1248.field44 == null) {
                                var371 = "";
                            } else {
                                var371 = Statics.field1248.field44;
                            }
                            field725[var6++] = var371;
                            continue;
                        }
                        if (var386 == 5016) {
                            field716[var5++] = client.field304;
                            continue;
                        }
                        if (var386 == 5017) {
                            var5--;
                            int var372 = field716[var5];
                            int[] var373 = field716;
                            int var374 = var5++;
                            class24 var375 = (class24) class10.field157.get(var372);
                            int var376;
                            if (var375 == null) {
                                var376 = 0;
                            } else {
                                var376 = var375.method527();
                            }
                            var373[var374] = var376;
                            continue;
                        }
                        if (var386 == 5018) {
                            var5--;
                            int var377 = field716[var5];
                            field716[var5++] = class10.method1933(var377);
                            continue;
                        }
                        if (var386 == 5019) {
                            var5--;
                            int var378 = field716[var5];
                            field716[var5++] = class10.method5(var378);
                            continue;
                        }
                        if (var386 == 5020) {
                            var6--;
                            String var379 = field725[var6];
                            if (var379.equalsIgnoreCase("toggleroof")) {
                                Statics.field813.field145 = !Statics.field813.field145;
                                class9.method2015();
                                if (Statics.field813.field145) {
                                    class10.method849(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method849(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field426 >= 2) {
                                if (var379.equalsIgnoreCase("fpson")) {
                                    client.field321 = true;
                                }
                                if (var379.equalsIgnoreCase("fpsoff")) {
                                    client.field321 = false;
                                }
                                if (var379.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var379.equalsIgnoreCase("clientdrop")) {
                                    if (client.field389 > 0) {
                                        client.method2473();
                                    } else {
                                        client.method2490(40);
                                        Statics.field296 = Statics.field1109;
                                        Statics.field1109 = null;
                                    }
                                }
                                if (var379.equalsIgnoreCase("errortest") && client.field418 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field297.method2408(135);
                            client.field297.method2159(var379.length() + 1);
                            client.field297.method2199(var379);
                            continue;
                        }
                    }
                } else {
                    class153 var85;
                    if (var386 >= 2000) {
                        var386 -= 1000;
                        var5--;
                        var85 = class153.method2577(field716[var5]);
                    } else {
                        var85 = var62 ? Statics.field2966 : Statics.field517;
                    }
                    if (var386 == 1300) {
                        var5--;
                        int var86 = field716[var5] - 1;
                        if (var86 >= 0 && var86 <= 9) {
                            var6--;
                            var85.method2934(var86, field725[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var386 == 1301) {
                        var5 -= 2;
                        int var87 = field716[var5];
                        int var88 = field716[var5 + 1];
                        var85.field2600 = class153.method2472(var87, var88);
                        continue;
                    }
                    if (var386 == 1302) {
                        var5--;
                        var85.field2603 = field716[var5] == 1;
                        continue;
                    }
                    if (var386 == 1303) {
                        var5--;
                        var85.field2601 = field716[var5];
                        continue;
                    }
                    if (var386 == 1304) {
                        var5--;
                        var85.field2581 = field716[var5];
                        continue;
                    }
                    if (var386 == 1305) {
                        var6--;
                        var85.field2554 = field725[var6];
                        continue;
                    }
                    if (var386 == 1306) {
                        var6--;
                        var85.field2589 = field725[var6];
                        continue;
                    }
                    if (var386 == 1307) {
                        var85.field2599 = null;
                        continue;
                    }
                }
                if (var386 >= 5600 || var386 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var380 = field716[var5];
                int var381 = field716[var5 + 1];
                if (!client.field502) {
                    client.field340 = var380;
                    client.field396 = var381;
                }
            }
        } catch (Exception var385) {
            StringBuilder var383 = new StringBuilder(30);
            var383.append("").append(var4.field2881).append(" ");
            for (int var384 = field721 - 1; var384 >= 0; var384--) {
                var383.append("").append(field712[var384].field193.field2881).append(" ");
            }
            var383.append("").append(var10);
            class135.method2121(var383.toString(), var385);
        }
    }

    @ObfuscatedName("be.x(II)V")
    public static void method1643(int arg0) {
        if (arg0 == -1 || !class153.method487(arg0)) {
            return;
        }
        class153[] var1 = Statics.field2572[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3.field2585 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field7 = var3.field2585;
                method483(var4, 2000000);
            }
        }
    }
}
