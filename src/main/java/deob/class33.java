package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ac")
public class class33 {

    @ObfuscatedName("ac.f")
    public static int[] field718 = new int[5];

    @ObfuscatedName("ac.l")
    public static int[][] field724 = new int[5][5000];

    @ObfuscatedName("ac.b")
    public static int[] field716 = new int[1000];

    @ObfuscatedName("ac.k")
    public static String[] field717 = new String[1000];

    @ObfuscatedName("ac.g")
    public static int field719 = 0;

    @ObfuscatedName("ac.v")
    public static class13[] field714 = new class13[50];

    @ObfuscatedName("ac.h")
    public static Calendar field721 = Calendar.getInstance();

    @ObfuscatedName("ac.w")
    public static final String[] field722 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.c(Lc;I)V")
    public static void method1613(class1 arg0) {
        method94(arg0, 200000);
    }

    @ObfuscatedName("g.j(Lc;IB)V")
    public static void method94(class1 arg0, int arg1) {
        Object[] var2 = arg0.field8;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method566(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field544;
        int[] var9 = var4.field530;
        byte var10 = -1;
        field719 = 0;
        try {
            Statics.field135 = new int[var4.field534];
            int var11 = 0;
            Statics.field2929 = new String[var4.field535];
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
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2537;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2538;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2537;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2538;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field12;
                    }
                    Statics.field135[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field2929[var12++] = var15;
                }
            }
            int var16 = 0;
            label2905: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var474 = var8[var7];
                if (var474 < 100) {
                    if (var474 == 0) {
                        field716[var5++] = var9[var7];
                        continue;
                    }
                    if (var474 == 1) {
                        int var17 = var9[var7];
                        field716[var5++] = class157.field2671[var17];
                        continue;
                    }
                    if (var474 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class157.field2671[var18] = field716[var5];
                        client.method3396(var18);
                        continue;
                    }
                    if (var474 == 3) {
                        field717[var6++] = var4.field533[var7];
                        continue;
                    }
                    if (var474 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var474 == 7) {
                        var5 -= 2;
                        if (field716[var5 + 1] != field716[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var474 == 8) {
                        var5 -= 2;
                        if (field716[var5 + 1] == field716[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var474 == 9) {
                        var5 -= 2;
                        if (field716[var5] < field716[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var474 == 10) {
                        var5 -= 2;
                        if (field716[var5] > field716[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var474 == 21) {
                        if (field719 == 0) {
                            return;
                        }
                        class13 var19 = field714[--field719];
                        var4 = var19.field190;
                        var8 = var4.field544;
                        var9 = var4.field530;
                        var7 = var19.field191;
                        Statics.field135 = var19.field189;
                        Statics.field2929 = var19.field188;
                        continue;
                    }
                    if (var474 == 25) {
                        int var20 = var9[var7];
                        field716[var5++] = class157.method461(var20);
                        continue;
                    }
                    if (var474 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field716[var5];
                        class43 var23 = (class43) class43.field978.method3178((long) var21);
                        class43 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field983.method2746(14, var21);
                            class43 var26 = new class43();
                            if (var25 != null) {
                                var26.method804(new class108(var25));
                            }
                            class43.field978.method3167(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field979;
                        int var29 = var24.field984;
                        int var30 = var24.field981;
                        int var31 = class157.field2669[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class157.field2671[var28] = class157.field2671[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var474 == 31) {
                        var5 -= 2;
                        if (field716[var5] <= field716[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var474 == 32) {
                        var5 -= 2;
                        if (field716[var5] >= field716[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var474 == 33) {
                        field716[var5++] = Statics.field135[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var474 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field135[var10001] = field716[var5];
                        continue;
                    }
                    if (var474 == 35) {
                        field717[var6++] = Statics.field2929[var9[var7]];
                        continue;
                    }
                    if (var474 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2929[var10001] = field717[var6];
                        continue;
                    }
                    if (var474 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String[] var34 = field717;
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
                        field717[var6++] = var35;
                        continue;
                    }
                    if (var474 == 38) {
                        var5--;
                        continue;
                    }
                    if (var474 == 39) {
                        var6--;
                        continue;
                    }
                    if (var474 == 40) {
                        int var45 = var9[var7];
                        class19 var46 = class19.method566(var45);
                        int[] var47 = new int[var46.field534];
                        String[] var48 = new String[var46.field535];
                        for (int var49 = 0; var49 < var46.field536; var49++) {
                            var47[var49] = field716[var5 - var46.field536 + var49];
                        }
                        for (int var50 = 0; var50 < var46.field537; var50++) {
                            var48[var50] = field717[var6 - var46.field537 + var50];
                        }
                        var5 -= var46.field536;
                        var6 -= var46.field537;
                        class13 var51 = new class13();
                        var51.field190 = var4;
                        var51.field191 = var7;
                        var51.field189 = Statics.field135;
                        var51.field188 = Statics.field2929;
                        field714[++field719 - 1] = var51;
                        var4 = var46;
                        var8 = var46.field544;
                        var9 = var46.field530;
                        var7 = -1;
                        Statics.field135 = var47;
                        Statics.field2929 = var48;
                        continue;
                    }
                    if (var474 == 42) {
                        field716[var5++] = client.field451[var9[var7]];
                        continue;
                    }
                    if (var474 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field451[var10001] = field716[var5];
                        continue;
                    }
                    if (var474 == 44) {
                        int var52 = var9[var7] >> 16;
                        int var53 = var9[var7] & 0xFFFF;
                        var5--;
                        int var54 = field716[var5];
                        if (var54 >= 0 && var54 <= 5000) {
                            field718[var52] = var54;
                            byte var55 = -1;
                            if (var53 == 105) {
                                var55 = 0;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54) {
                                    continue label2905;
                                }
                                field724[var52][var56] = var55;
                                var56++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 45) {
                        int var57 = var9[var7];
                        var5--;
                        int var58 = field716[var5];
                        if (var58 >= 0 && var58 < field718[var57]) {
                            field716[var5++] = field724[var57][var58];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 46) {
                        int var59 = var9[var7];
                        var5 -= 2;
                        int var60 = field716[var5];
                        if (var60 >= 0 && var60 < field718[var59]) {
                            field724[var59][var60] = field716[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 47) {
                        String var61 = client.field452[var9[var7]];
                        if (var61 == null) {
                            var61 = "null";
                        }
                        field717[var6++] = var61;
                        continue;
                    }
                    if (var474 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field452[var10001] = field717[var6];
                        continue;
                    }
                }
                boolean var62;
                if (var9[var7] == 1) {
                    var62 = true;
                } else {
                    var62 = false;
                }
                if (var474 < 1000) {
                    if (var474 == 100) {
                        var5 -= 3;
                        int var63 = field716[var5];
                        int var64 = field716[var5 + 1];
                        int var65 = field716[var5 + 2];
                        if (var64 == 0) {
                            throw new RuntimeException();
                        }
                        class155 var66 = class155.method1876(var63);
                        if (var66.field2648 == null) {
                            var66.field2648 = new class155[var65 + 1];
                        }
                        if (var66.field2648.length <= var65) {
                            class155[] var67 = new class155[var65 + 1];
                            for (int var68 = 0; var68 < var66.field2648.length; var68++) {
                                var67[var68] = var66.field2648[var68];
                            }
                            var66.field2648 = var67;
                        }
                        if (var65 > 0 && var66.field2648[var65 - 1] == null) {
                            throw new RuntimeException("" + (var65 - 1));
                        }
                        class155 var69 = new class155();
                        var69.field2539 = var64;
                        var69.field2548 = var69.field2537 = var66.field2537;
                        var69.field2538 = var65;
                        var69.field2536 = true;
                        var66.field2648[var65] = var69;
                        if (var62) {
                            Statics.field1514 = var69;
                        } else {
                            Statics.field720 = var69;
                        }
                        client.method2073(var66);
                        continue;
                    }
                    if (var474 == 101) {
                        class155 var70 = var62 ? Statics.field1514 : Statics.field720;
                        class155 var71 = class155.method1876(var70.field2537);
                        var71.field2648[var70.field2538] = null;
                        client.method2073(var71);
                        continue;
                    }
                    if (var474 == 102) {
                        var5--;
                        class155 var72 = class155.method1876(field716[var5]);
                        var72.field2648 = null;
                        client.method2073(var72);
                        continue;
                    }
                    if (var474 == 200) {
                        var5 -= 2;
                        int var73 = field716[var5];
                        int var74 = field716[var5 + 1];
                        class155 var75 = class155.method805(var73, var74);
                        if (var75 != null && var74 != -1) {
                            field716[var5++] = 1;
                            if (var62) {
                                Statics.field1514 = var75;
                            } else {
                                Statics.field720 = var75;
                            }
                            continue;
                        }
                        field716[var5++] = 0;
                        continue;
                    }
                } else if (!(var474 < 1000 || var474 >= 1100) || !(var474 < 2000 || var474 >= 2100)) {
                    class155 var76;
                    if (var474 >= 2000) {
                        var474 -= 1000;
                        var5--;
                        var76 = class155.method1876(field716[var5]);
                    } else {
                        var76 = var62 ? Statics.field1514 : Statics.field720;
                    }
                    if (var474 == 1000) {
                        var5 -= 2;
                        var76.field2542 = field716[var5];
                        var76.field2607 = field716[var5 + 1];
                        client.method2073(var76);
                        continue;
                    }
                    if (var474 == 1001) {
                        var5 -= 2;
                        var76.field2546 = field716[var5];
                        var76.field2555 = field716[var5 + 1];
                        client.method2073(var76);
                        continue;
                    }
                    if (var474 == 1003) {
                        var5--;
                        boolean var77 = field716[var5] == 1;
                        if (var76.field2549 != var77) {
                            var76.field2549 = var77;
                            client.method2073(var76);
                        }
                        continue;
                    }
                } else if (var474 >= 1100 && var474 < 1200 || var474 >= 2100 && var474 < 2200) {
                    class155 var78;
                    if (var474 >= 2000) {
                        var474 -= 1000;
                        var5--;
                        var78 = class155.method1876(field716[var5]);
                    } else {
                        var78 = var62 ? Statics.field1514 : Statics.field720;
                    }
                    if (var474 == 1100) {
                        var5 -= 2;
                        var78.field2594 = field716[var5];
                        if (var78.field2594 > var78.field2552 - var78.field2546) {
                            var78.field2594 = var78.field2552 - var78.field2546;
                        }
                        if (var78.field2594 < 0) {
                            var78.field2594 = 0;
                        }
                        var78.field2558 = field716[var5 + 1];
                        if (var78.field2558 > var78.field2553 - var78.field2555) {
                            var78.field2558 = var78.field2553 - var78.field2555;
                        }
                        if (var78.field2558 < 0) {
                            var78.field2558 = 0;
                        }
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1101) {
                        var5--;
                        var78.field2571 = field716[var5];
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1102) {
                        var5--;
                        var78.field2585 = field716[var5] == 1;
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1103) {
                        var5--;
                        var78.field2577 = field716[var5];
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1104) {
                        var5--;
                        var78.field2629 = field716[var5];
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1105) {
                        var5--;
                        var78.field2561 = field716[var5];
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1106) {
                        var5--;
                        var78.field2563 = field716[var5];
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1107) {
                        var5--;
                        var78.field2532 = field716[var5] == 1;
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1108) {
                        var78.field2569 = 1;
                        var5--;
                        var78.field2650 = field716[var5];
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1109) {
                        var5 -= 6;
                        var78.field2575 = field716[var5];
                        var78.field2583 = field716[var5 + 1];
                        var78.field2529 = field716[var5 + 2];
                        var78.field2578 = field716[var5 + 3];
                        var78.field2632 = field716[var5 + 4];
                        var78.field2580 = field716[var5 + 5];
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1110) {
                        var5--;
                        int var79 = field716[var5];
                        if (var78.field2573 != var79) {
                            var78.field2573 = var79;
                            var78.field2564 = 0;
                            var78.field2611 = 0;
                            client.method2073(var78);
                        }
                        continue;
                    }
                    if (var474 == 1111) {
                        var5--;
                        var78.field2582 = field716[var5] == 1;
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1112) {
                        var6--;
                        String var80 = field717[var6];
                        if (!var80.equals(var78.field2596)) {
                            var78.field2596 = var80;
                            client.method2073(var78);
                        }
                        continue;
                    }
                    if (var474 == 1113) {
                        var5--;
                        var78.field2584 = field716[var5];
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1114) {
                        var5 -= 3;
                        var78.field2588 = field716[var5];
                        var78.field2550 = field716[var5 + 1];
                        var78.field2587 = field716[var5 + 2];
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1115) {
                        var5--;
                        var78.field2590 = field716[var5] == 1;
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1116) {
                        var5--;
                        var78.field2565 = field716[var5];
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1117) {
                        var5--;
                        var78.field2566 = field716[var5];
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1118) {
                        var5--;
                        var78.field2567 = field716[var5] == 1;
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1119) {
                        var5--;
                        var78.field2568 = field716[var5] == 1;
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1120) {
                        var5 -= 2;
                        var78.field2552 = field716[var5];
                        var78.field2553 = field716[var5 + 1];
                        client.method2073(var78);
                        continue;
                    }
                    if (var474 == 1121) {
                        int var81 = var78.field2537;
                        int var82 = var78.field2538;
                        client.field486.method2376(159);
                        client.field486.method2121(var82);
                        client.field486.method2174(var81);
                        client.field477 = var78;
                        client.method2073(var78);
                        continue;
                    }
                } else if (var474 >= 1200 && var474 < 1300 || var474 >= 2200 && var474 < 2300) {
                    class155 var83;
                    if (var474 >= 2000) {
                        var474 -= 1000;
                        var5--;
                        var83 = class155.method1876(field716[var5]);
                    } else {
                        var83 = var62 ? Statics.field1514 : Statics.field720;
                    }
                    client.method2073(var83);
                    if (var474 == 1200 || var474 == 1205 || var474 == 1212) {
                        var5 -= 2;
                        int var84 = field716[var5];
                        int var85 = field716[var5 + 1];
                        var83.field2644 = var84;
                        var83.field2645 = var85;
                        class46 var86 = class46.method114(var84);
                        var83.field2529 = var86.field1041;
                        var83.field2578 = var86.field1015;
                        var83.field2632 = var86.field1031;
                        var83.field2575 = var86.field1032;
                        var83.field2583 = var86.field1027;
                        var83.field2580 = var86.field1016;
                        if (var474 == 1205) {
                            var83.field2614 = 0;
                        } else if (var474 == 1212 | var86.field1034 == 1) {
                            var83.field2614 = 1;
                        } else {
                            var83.field2614 = 2;
                        }
                        if (var83.field2546 > 0) {
                            var83.field2580 = var83.field2580 * 32 / var83.field2546;
                        }
                        continue;
                    }
                    if (var474 == 1201) {
                        var83.field2569 = 2;
                        var5--;
                        var83.field2650 = field716[var5];
                        continue;
                    }
                    if (var474 == 1202) {
                        var83.field2569 = 3;
                        var83.field2650 = Statics.field524.field36.method2954();
                        continue;
                    }
                } else if (var474 >= 1300 && var474 < 1400 || var474 >= 2300 && var474 < 2400) {
                    class155 var87;
                    if (var474 >= 2000) {
                        var474 -= 1000;
                        var5--;
                        var87 = class155.method1876(field716[var5]);
                    } else {
                        var87 = var62 ? Statics.field1514 : Statics.field720;
                    }
                    if (var474 == 1300) {
                        var5--;
                        int var88 = field716[var5] - 1;
                        if (var88 >= 0 && var88 <= 9) {
                            var6--;
                            var87.method2884(var88, field717[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var474 == 1301) {
                        var5 -= 2;
                        int var89 = field716[var5];
                        int var90 = field716[var5 + 1];
                        var87.field2600 = class155.method805(var89, var90);
                        continue;
                    }
                    if (var474 == 1302) {
                        var5--;
                        var87.field2603 = field716[var5] == 1;
                        continue;
                    }
                    if (var474 == 1303) {
                        var5--;
                        var87.field2601 = field716[var5];
                        continue;
                    }
                    if (var474 == 1304) {
                        var5--;
                        var87.field2602 = field716[var5];
                        continue;
                    }
                    if (var474 == 1305) {
                        var6--;
                        var87.field2598 = field717[var6];
                        continue;
                    }
                    if (var474 == 1306) {
                        var6--;
                        var87.field2604 = field717[var6];
                        continue;
                    }
                    if (var474 == 1307) {
                        var87.field2599 = null;
                        continue;
                    }
                } else {
                    if (var474 >= 1400 && var474 < 1500 || var474 >= 2400 && var474 < 2500) {
                        class155 var91;
                        if (var474 >= 2000) {
                            var474 -= 1000;
                            var5--;
                            var91 = class155.method1876(field716[var5]);
                        } else {
                            var91 = var62 ? Statics.field1514 : Statics.field720;
                        }
                        var6--;
                        String var92 = field717[var6];
                        int[] var93 = null;
                        if (var92.length() > 0 && var92.charAt(var92.length() - 1) == 'Y') {
                            var5--;
                            int var94 = field716[var5];
                            if (var94 > 0) {
                                var93 = new int[var94];
                                while (var94-- > 0) {
                                    var5--;
                                    var93[var94] = field716[var5];
                                }
                            }
                            var92 = var92.substring(0, var92.length() - 1);
                        }
                        Object[] var95 = new Object[var92.length() + 1];
                        for (int var96 = var95.length - 1; var96 >= 1; var96--) {
                            if (var92.charAt(var96 - 1) == 's') {
                                var6--;
                                var95[var96] = field717[var6];
                            } else {
                                var5--;
                                var95[var96] = Integer.valueOf(field716[var5]);
                            }
                        }
                        var5--;
                        int var97 = field716[var5];
                        if (var97 == -1) {
                            var95 = null;
                        } else {
                            var95[0] = Integer.valueOf(var97);
                        }
                        if (var474 == 1400) {
                            var91.field2657 = var95;
                        }
                        if (var474 == 1401) {
                            var91.field2589 = var95;
                        }
                        if (var474 == 1402) {
                            var91.field2609 = var95;
                        }
                        if (var474 == 1403) {
                            var91.field2615 = var95;
                        }
                        if (var474 == 1404) {
                            var91.field2613 = var95;
                        }
                        if (var474 == 1405) {
                            var91.field2610 = var95;
                        }
                        if (var474 == 1406) {
                            var91.field2617 = var95;
                        }
                        if (var474 == 1407) {
                            var91.field2618 = var95;
                            var91.field2619 = var93;
                        }
                        if (var474 == 1408) {
                            var91.field2624 = var95;
                        }
                        if (var474 == 1409) {
                            var91.field2625 = var95;
                        }
                        if (var474 == 1410) {
                            var91.field2586 = var95;
                        }
                        if (var474 == 1411) {
                            var91.field2608 = var95;
                        }
                        if (var474 == 1412) {
                            var91.field2612 = var95;
                        }
                        if (var474 == 1414) {
                            var91.field2620 = var95;
                            var91.field2628 = var93;
                        }
                        if (var474 == 1415) {
                            var91.field2551 = var95;
                            var91.field2623 = var93;
                        }
                        if (var474 == 1416) {
                            var91.field2574 = var95;
                        }
                        if (var474 == 1417) {
                            var91.field2626 = var95;
                        }
                        if (var474 == 1418) {
                            var91.field2627 = var95;
                        }
                        if (var474 == 1419) {
                            var91.field2605 = var95;
                        }
                        if (var474 == 1420) {
                            var91.field2543 = var95;
                        }
                        if (var474 == 1421) {
                            var91.field2630 = var95;
                        }
                        if (var474 == 1422) {
                            var91.field2570 = var95;
                        }
                        if (var474 == 1423) {
                            var91.field2560 = var95;
                        }
                        if (var474 == 1424) {
                            var91.field2633 = var95;
                        }
                        if (var474 == 1425) {
                            var91.field2634 = var95;
                        }
                        if (var474 == 1426) {
                            var91.field2635 = var95;
                        }
                        var91.field2544 = true;
                        continue;
                    }
                    if (var474 < 1600) {
                        class155 var98 = var62 ? Statics.field1514 : Statics.field720;
                        if (var474 == 1500) {
                            field716[var5++] = var98.field2542;
                            continue;
                        }
                        if (var474 == 1501) {
                            field716[var5++] = var98.field2607;
                            continue;
                        }
                        if (var474 == 1502) {
                            field716[var5++] = var98.field2546;
                            continue;
                        }
                        if (var474 == 1503) {
                            field716[var5++] = var98.field2555;
                            continue;
                        }
                        if (var474 == 1504) {
                            field716[var5++] = var98.field2549 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 1505) {
                            field716[var5++] = var98.field2548;
                            continue;
                        }
                    } else if (var474 < 1700) {
                        class155 var99 = var62 ? Statics.field1514 : Statics.field720;
                        if (var474 == 1600) {
                            field716[var5++] = var99.field2594;
                            continue;
                        }
                        if (var474 == 1601) {
                            field716[var5++] = var99.field2558;
                            continue;
                        }
                        if (var474 == 1602) {
                            field717[var6++] = var99.field2596;
                            continue;
                        }
                        if (var474 == 1603) {
                            field716[var5++] = var99.field2552;
                            continue;
                        }
                        if (var474 == 1604) {
                            field716[var5++] = var99.field2553;
                            continue;
                        }
                        if (var474 == 1605) {
                            field716[var5++] = var99.field2580;
                            continue;
                        }
                        if (var474 == 1606) {
                            field716[var5++] = var99.field2529;
                            continue;
                        }
                        if (var474 == 1607) {
                            field716[var5++] = var99.field2632;
                            continue;
                        }
                        if (var474 == 1608) {
                            field716[var5++] = var99.field2578;
                            continue;
                        }
                    } else if (var474 < 1800) {
                        class155 var100 = var62 ? Statics.field1514 : Statics.field720;
                        if (var474 == 1700) {
                            field716[var5++] = var100.field2644;
                            continue;
                        }
                        if (var474 == 1701) {
                            if (var100.field2644 == -1) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = var100.field2645;
                            }
                            continue;
                        }
                        if (var474 == 1702) {
                            field716[var5++] = var100.field2538;
                            continue;
                        }
                    } else if (var474 < 1900) {
                        class155 var101 = var62 ? Statics.field1514 : Statics.field720;
                        if (var474 == 1800) {
                            int[] var102 = field716;
                            int var103 = var5++;
                            int var104 = client.method137(var101);
                            int var105 = var104 >> 11 & 0x3F;
                            var102[var103] = var105;
                            continue;
                        }
                        if (var474 == 1801) {
                            var5--;
                            int var106 = field716[var5];
                            int var475 = var106 - 1;
                            if (var101.field2599 != null && var475 < var101.field2599.length && var101.field2599[var475] != null) {
                                field717[var6++] = var101.field2599[var475];
                                continue;
                            }
                            field717[var6++] = "";
                            continue;
                        }
                        if (var474 == 1802) {
                            if (var101.field2598 == null) {
                                field717[var6++] = "";
                            } else {
                                field717[var6++] = var101.field2598;
                            }
                            continue;
                        }
                    } else if (var474 < 2600) {
                        var5--;
                        class155 var107 = class155.method1876(field716[var5]);
                        if (var474 == 2500) {
                            field716[var5++] = var107.field2542;
                            continue;
                        }
                        if (var474 == 2501) {
                            field716[var5++] = var107.field2607;
                            continue;
                        }
                        if (var474 == 2502) {
                            field716[var5++] = var107.field2546;
                            continue;
                        }
                        if (var474 == 2503) {
                            field716[var5++] = var107.field2555;
                            continue;
                        }
                        if (var474 == 2504) {
                            field716[var5++] = var107.field2549 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 2505) {
                            field716[var5++] = var107.field2548;
                            continue;
                        }
                    } else if (var474 < 2700) {
                        var5--;
                        class155 var108 = class155.method1876(field716[var5]);
                        if (var474 == 2600) {
                            field716[var5++] = var108.field2594;
                            continue;
                        }
                        if (var474 == 2601) {
                            field716[var5++] = var108.field2558;
                            continue;
                        }
                        if (var474 == 2602) {
                            field717[var6++] = var108.field2596;
                            continue;
                        }
                        if (var474 == 2603) {
                            field716[var5++] = var108.field2552;
                            continue;
                        }
                        if (var474 == 2604) {
                            field716[var5++] = var108.field2553;
                            continue;
                        }
                        if (var474 == 2605) {
                            field716[var5++] = var108.field2580;
                            continue;
                        }
                        if (var474 == 2606) {
                            field716[var5++] = var108.field2529;
                            continue;
                        }
                        if (var474 == 2607) {
                            field716[var5++] = var108.field2632;
                            continue;
                        }
                        if (var474 == 2608) {
                            field716[var5++] = var108.field2578;
                            continue;
                        }
                    } else if (var474 < 2800) {
                        if (var474 == 2700) {
                            var5--;
                            class155 var109 = class155.method1876(field716[var5]);
                            field716[var5++] = var109.field2644;
                            continue;
                        }
                        if (var474 == 2701) {
                            var5--;
                            class155 var110 = class155.method1876(field716[var5]);
                            if (var110.field2644 == -1) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = var110.field2645;
                            }
                            continue;
                        }
                        if (var474 == 2702) {
                            var5--;
                            int var111 = field716[var5];
                            class4 var112 = (class4) client.field462.method3206((long) var111);
                            if (var112 == null) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var474 < 2900) {
                        var5--;
                        class155 var113 = class155.method1876(field716[var5]);
                        if (var474 == 2800) {
                            int[] var114 = field716;
                            int var115 = var5++;
                            int var116 = client.method137(var113);
                            int var117 = var116 >> 11 & 0x3F;
                            var114[var115] = var117;
                            continue;
                        }
                        if (var474 == 2801) {
                            var5--;
                            int var118 = field716[var5];
                            int var476 = var118 - 1;
                            if (var113.field2599 != null && var476 < var113.field2599.length && var113.field2599[var476] != null) {
                                field717[var6++] = var113.field2599[var476];
                                continue;
                            }
                            field717[var6++] = "";
                            continue;
                        }
                        if (var474 == 2802) {
                            if (var113.field2598 == null) {
                                field717[var6++] = "";
                            } else {
                                field717[var6++] = var113.field2598;
                            }
                            continue;
                        }
                    } else if (var474 < 3200) {
                        if (var474 == 3100) {
                            var6--;
                            String var119 = field717[var6];
                            class10.method100(0, "", var119);
                            continue;
                        }
                        if (var474 == 3101) {
                            var5 -= 2;
                            client.method1416(Statics.field524, field716[var5], field716[var5 + 1]);
                            continue;
                        }
                        if (var474 == 3103) {
                            client.field486.method2376(24);
                            for (class4 var120 = (class4) client.field462.method3220(); var120 != null; var120 = (class4) client.field462.method3210()) {
                                if (var120.field60 == 0 || var120.field60 == 3) {
                                    client.method80(var120, true);
                                }
                            }
                            if (client.field477 != null) {
                                client.method2073(client.field477);
                                client.field477 = null;
                            }
                            continue;
                        }
                        if (var474 == 3104) {
                            var6--;
                            String var121 = field717[var6];
                            int var122 = 0;
                            boolean var123 = false;
                            boolean var124 = false;
                            int var125 = 0;
                            int var126 = var121.length();
                            int var127 = 0;
                            boolean var129;
                            while (true) {
                                if (var127 >= var126) {
                                    var129 = var124;
                                    break;
                                }
                                label3153: {
                                    char var128 = var121.charAt(var127);
                                    if (var127 == 0) {
                                        if (var128 == '-') {
                                            var123 = true;
                                            break label3153;
                                        }
                                        if (var128 == '+') {
                                            break label3153;
                                        }
                                    }
                                    int var477;
                                    if (var128 >= '0' && var128 <= '9') {
                                        var477 = var128 - '0';
                                    } else if (var128 >= 'A' && var128 <= 'Z') {
                                        var477 = var128 - '7';
                                    } else {
                                        if (var128 < 'a' || var128 > 'z') {
                                            var129 = false;
                                            break;
                                        }
                                        var477 = var128 - 'W';
                                    }
                                    if (var477 >= 10) {
                                        var129 = false;
                                        break;
                                    }
                                    if (var123) {
                                        var477 = -var477;
                                    }
                                    int var130 = var125 * 10 + var477;
                                    if (var130 / 10 != var125) {
                                        var129 = false;
                                        break;
                                    }
                                    var125 = var130;
                                    var124 = true;
                                }
                                var127++;
                            }
                            if (var129) {
                                int var132 = class211.method2858(var121, 10, true);
                                var122 = var132;
                            }
                            client.field486.method2376(168);
                            client.field486.method2123(var122);
                            continue;
                        }
                        if (var474 == 3105) {
                            var6--;
                            String var133 = field717[var6];
                            client.field486.method2376(243);
                            client.field486.method2120(var133.length() + 1);
                            client.field486.method2125(var133);
                            continue;
                        }
                        if (var474 == 3106) {
                            var6--;
                            String var134 = field717[var6];
                            client.field486.method2376(172);
                            client.field486.method2120(var134.length() + 1);
                            client.field486.method2125(var134);
                            continue;
                        }
                        if (var474 == 3107) {
                            var5--;
                            int var135 = field716[var5];
                            var6--;
                            String var136 = field717[var6];
                            client.method1382(var135, var136);
                            continue;
                        }
                        if (var474 == 3108) {
                            var5 -= 3;
                            int var137 = field716[var5];
                            int var138 = field716[var5 + 1];
                            int var139 = field716[var5 + 2];
                            class155 var140 = class155.method1876(var139);
                            client.method111(var140, var137, var138);
                            continue;
                        }
                        if (var474 == 3109) {
                            var5 -= 2;
                            int var141 = field716[var5];
                            int var142 = field716[var5 + 1];
                            class155 var143 = var62 ? Statics.field1514 : Statics.field720;
                            client.method111(var143, var141, var142);
                            continue;
                        }
                        if (var474 == 3110) {
                            var5--;
                            Statics.field2089 = field716[var5] == 1;
                            continue;
                        }
                        if (var474 == 3111) {
                            field716[var5++] = Statics.field2103.field138 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3112) {
                            var5--;
                            Statics.field2103.field138 = field716[var5] == 1;
                            class9.method669();
                            continue;
                        }
                        if (var474 == 3113) {
                            var6--;
                            String var144 = field717[var6];
                            var5--;
                            boolean var145 = field716[var5] == 1;
                            class127.method1801(var144, var145, "openjs", false);
                            continue;
                        }
                        if (var474 == 3115) {
                            var5--;
                            int var146 = field716[var5];
                            client.field486.method2376(8);
                            client.field486.method2121(var146);
                            continue;
                        }
                    } else if (var474 < 3300) {
                        if (var474 == 3200) {
                            var5 -= 3;
                            int var147 = field716[var5];
                            int var148 = field716[var5 + 1];
                            int var149 = field716[var5 + 2];
                            if (client.field491 != 0 && var148 != 0 && client.field432 < 50) {
                                client.field494[client.field432] = var147;
                                client.field367[client.field432] = var148;
                                client.field496[client.field432] = var149;
                                client.field406[client.field432] = null;
                                client.field497[client.field432] = 0;
                                client.field432++;
                            }
                            continue;
                        }
                        if (var474 == 3201) {
                            var5--;
                            client.method106(field716[var5]);
                            continue;
                        }
                        if (var474 == 3202) {
                            var5 -= 2;
                            client.method2862(field716[var5], field716[var5 + 1]);
                            continue;
                        }
                    } else if (var474 < 3400) {
                        if (var474 == 3300) {
                            field716[var5++] = client.field493;
                            continue;
                        }
                        if (var474 == 3301) {
                            var5 -= 2;
                            int var150 = field716[var5];
                            int var151 = field716[var5 + 1];
                            int[] var152 = field716;
                            int var153 = var5++;
                            class14 var154 = (class14) class14.field194.method3206((long) var150);
                            int var155;
                            if (var154 == null) {
                                var155 = -1;
                            } else if (var151 >= 0 && var151 < var154.field203.length) {
                                var155 = var154.field203[var151];
                            } else {
                                var155 = -1;
                            }
                            var152[var153] = var155;
                            continue;
                        }
                        if (var474 == 3302) {
                            var5 -= 2;
                            int var156 = field716[var5];
                            int var157 = field716[var5 + 1];
                            field716[var5++] = Statics.method2553(var156, var157);
                            continue;
                        }
                        if (var474 == 3303) {
                            var5 -= 2;
                            int var158 = field716[var5];
                            int var159 = field716[var5 + 1];
                            int[] var160 = field716;
                            int var161 = var5++;
                            class14 var162 = (class14) class14.field194.method3206((long) var158);
                            int var163;
                            if (var162 == null) {
                                var163 = 0;
                            } else if (var159 == -1) {
                                var163 = 0;
                            } else {
                                int var164 = 0;
                                for (int var165 = 0; var165 < var162.field196.length; var165++) {
                                    if (var162.field203[var165] == var159) {
                                        var164 += var162.field196[var165];
                                    }
                                }
                                var163 = var164;
                            }
                            var160[var161] = var163;
                            continue;
                        }
                        if (var474 == 3304) {
                            var5--;
                            int var166 = field716[var5];
                            field716[var5++] = class45.method575(var166).field1008;
                            continue;
                        }
                        if (var474 == 3305) {
                            var5--;
                            int var167 = field716[var5];
                            field716[var5++] = client.field391[var167];
                            continue;
                        }
                        if (var474 == 3306) {
                            var5--;
                            int var168 = field716[var5];
                            field716[var5++] = client.field285[var168];
                            continue;
                        }
                        if (var474 == 3307) {
                            var5--;
                            int var169 = field716[var5];
                            field716[var5++] = client.field269[var169];
                            continue;
                        }
                        if (var474 == 3308) {
                            int var170 = Statics.field168;
                            int var171 = (Statics.field524.field780 >> 7) + Statics.field1789;
                            int var172 = (Statics.field524.field727 >> 7) + Statics.field1571;
                            field716[var5++] = (var170 << 28) + (var171 << 14) + var172;
                            continue;
                        }
                        if (var474 == 3309) {
                            var5--;
                            int var173 = field716[var5];
                            field716[var5++] = var173 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var474 == 3310) {
                            var5--;
                            int var174 = field716[var5];
                            field716[var5++] = var174 >> 28;
                            continue;
                        }
                        if (var474 == 3311) {
                            var5--;
                            int var175 = field716[var5];
                            field716[var5++] = var175 & 0x3FFF;
                            continue;
                        }
                        if (var474 == 3312) {
                            field716[var5++] = client.field250 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3313) {
                            var5 -= 2;
                            int var176 = field716[var5] + 32768;
                            int var177 = field716[var5 + 1];
                            int[] var178 = field716;
                            int var179 = var5++;
                            class14 var180 = (class14) class14.field194.method3206((long) var176);
                            int var181;
                            if (var180 == null) {
                                var181 = -1;
                            } else if (var177 >= 0 && var177 < var180.field203.length) {
                                var181 = var180.field203[var177];
                            } else {
                                var181 = -1;
                            }
                            var178[var179] = var181;
                            continue;
                        }
                        if (var474 == 3314) {
                            var5 -= 2;
                            int var182 = field716[var5] + 32768;
                            int var183 = field716[var5 + 1];
                            field716[var5++] = Statics.method2553(var182, var183);
                            continue;
                        }
                        if (var474 == 3315) {
                            var5 -= 2;
                            int var184 = field716[var5] + 32768;
                            int var185 = field716[var5 + 1];
                            int[] var186 = field716;
                            int var187 = var5++;
                            class14 var188 = (class14) class14.field194.method3206((long) var184);
                            int var189;
                            if (var188 == null) {
                                var189 = 0;
                            } else if (var185 == -1) {
                                var189 = 0;
                            } else {
                                int var190 = 0;
                                for (int var191 = 0; var191 < var188.field196.length; var191++) {
                                    if (var188.field203[var191] == var185) {
                                        var190 += var188.field196[var191];
                                    }
                                }
                                var189 = var190;
                            }
                            var186[var187] = var189;
                            continue;
                        }
                        if (var474 == 3316) {
                            if (client.field374 >= 2) {
                                field716[var5++] = client.field374;
                            } else {
                                field716[var5++] = 0;
                            }
                            continue;
                        }
                        if (var474 == 3317) {
                            field716[var5++] = client.field365;
                            continue;
                        }
                        if (var474 == 3318) {
                            field716[var5++] = client.field248;
                            continue;
                        }
                        if (var474 == 3321) {
                            field716[var5++] = client.field419;
                            continue;
                        }
                        if (var474 == 3322) {
                            field716[var5++] = client.field420;
                            continue;
                        }
                        if (var474 == 3323) {
                            if (client.field423) {
                                field716[var5++] = 1;
                            } else {
                                field716[var5++] = 0;
                            }
                            continue;
                        }
                        if (var474 == 3324) {
                            field716[var5++] = client.field249;
                            continue;
                        }
                    } else if (var474 < 3500) {
                        if (var474 == 3400) {
                            var5 -= 2;
                            int var192 = field716[var5];
                            int var193 = field716[var5 + 1];
                            class44 var194 = class44.method3355(var192);
                            if (var194.field995 != 's') {
                            }
                            for (int var195 = 0; var195 < var194.field998; var195++) {
                                if (var194.field1001[var195] == var193) {
                                    field717[var6++] = var194.field994[var195];
                                    var194 = null;
                                    break;
                                }
                            }
                            if (var194 != null) {
                                field717[var6++] = var194.field996;
                            }
                            continue;
                        }
                        if (var474 == 3408) {
                            var5 -= 4;
                            int var196 = field716[var5];
                            int var197 = field716[var5 + 1];
                            int var198 = field716[var5 + 2];
                            int var199 = field716[var5 + 3];
                            class44 var200 = class44.method3355(var198);
                            if (var200.field997 == var196 && var200.field995 == var197) {
                                for (int var201 = 0; var201 < var200.field998; var201++) {
                                    if (var200.field1001[var201] == var199) {
                                        if (var197 == 115) {
                                            field717[var6++] = var200.field994[var201];
                                        } else {
                                            field716[var5++] = var200.field1000[var201];
                                        }
                                        var200 = null;
                                        break;
                                    }
                                }
                                if (var200 != null) {
                                    if (var197 == 115) {
                                        field717[var6++] = var200.field996;
                                    } else {
                                        field716[var5++] = var200.field992;
                                    }
                                }
                                continue;
                            }
                            if (var197 == 115) {
                                field717[var6++] = "null";
                            } else {
                                field716[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var474 < 3700) {
                        if (var474 == 3600) {
                            if (client.field506 == 0) {
                                field716[var5++] = -2;
                            } else if (client.field506 == 1) {
                                field716[var5++] = -1;
                            } else {
                                field716[var5++] = client.field505;
                            }
                            continue;
                        }
                        if (var474 == 3601) {
                            var5--;
                            int var202 = field716[var5];
                            if (client.field506 == 2 && var202 < client.field505) {
                                field717[var6++] = client.field507[var202].field228;
                                field717[var6++] = client.field507[var202].field222;
                                continue;
                            }
                            field717[var6++] = "";
                            field717[var6++] = "";
                            continue;
                        }
                        if (var474 == 3602) {
                            var5--;
                            int var203 = field716[var5];
                            if (client.field506 == 2 && var203 < client.field505) {
                                field716[var5++] = client.field507[var203].field223;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var474 == 3603) {
                            var5--;
                            int var204 = field716[var5];
                            if (client.field506 == 2 && var204 < client.field505) {
                                field716[var5++] = client.field507[var204].field224;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var474 == 3604) {
                            var6--;
                            String var205 = field717[var6];
                            var5--;
                            int var206 = field716[var5];
                            client.method505(var205, var206);
                            continue;
                        }
                        if (var474 == 3605) {
                            var6--;
                            String var207 = field717[var6];
                            client.method1973(var207);
                            continue;
                        }
                        if (var474 == 3606) {
                            var6--;
                            String var208 = field717[var6];
                            if (var208 == null) {
                                continue;
                            }
                            String var209 = class212.method2080(var208, Statics.field253);
                            if (var209 == null) {
                                continue;
                            }
                            int var210 = 0;
                            while (true) {
                                if (var210 >= client.field505) {
                                    continue label2905;
                                }
                                class16 var211 = client.field507[var210];
                                String var212 = var211.field228;
                                String var213 = class212.method2080(var212, Statics.field253);
                                if (class118.method831(var208, var209, var212, var213)) {
                                    client.field505--;
                                    for (int var214 = var210; var214 < client.field505; var214++) {
                                        client.field507[var214] = client.field507[var214 + 1];
                                    }
                                    client.field446 = client.field438;
                                    client.field486.method2376(39);
                                    client.field486.method2120(class108.method97(var208));
                                    client.field486.method2125(var208);
                                    continue label2905;
                                }
                                var210++;
                            }
                        }
                        if (var474 == 3607) {
                            var6--;
                            String var215 = field717[var6];
                            client.method2596(var215, false);
                            continue;
                        }
                        if (var474 == 3608) {
                            var6--;
                            String var216 = field717[var6];
                            client.method2554(var216);
                            continue;
                        }
                        if (var474 == 3609) {
                            var6--;
                            String var217 = field717[var6];
                            class140[] var218 = new class140[] { class140.field2105, class140.field2098, class140.field2102, class140.field2095, class140.field2094 };
                            class140[] var219 = var218;
                            for (int var220 = 0; var220 < var219.length; var220++) {
                                class140 var221 = var219[var220];
                                if (var221.field2100 != -1 && var217.startsWith(class2.method1882(var221.field2100))) {
                                    var217 = var217.substring(6 + Integer.toString(var221.field2100).length());
                                    break;
                                }
                            }
                            field716[var5++] = client.method1878(var217, false) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3611) {
                            if (client.field478 == null) {
                                field717[var6++] = "";
                            } else {
                                String[] var222 = field717;
                                int var223 = var6++;
                                String var224 = client.field478;
                                String var225 = class210.method482(class210.method84(var224));
                                if (var225 == null) {
                                    var225 = "";
                                }
                                var222[var223] = var225;
                            }
                            continue;
                        }
                        if (var474 == 3612) {
                            if (client.field478 == null) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = Statics.field2064;
                            }
                            continue;
                        }
                        if (var474 == 3613) {
                            var5--;
                            int var227 = field716[var5];
                            if (client.field478 != null && var227 < Statics.field2064) {
                                field717[var6++] = Statics.field588[var227].field575;
                                continue;
                            }
                            field717[var6++] = "";
                            continue;
                        }
                        if (var474 == 3614) {
                            var5--;
                            int var228 = field716[var5];
                            if (client.field478 != null && var228 < Statics.field2064) {
                                field716[var5++] = Statics.field588[var228].field570;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var474 == 3615) {
                            var5--;
                            int var229 = field716[var5];
                            if (client.field478 != null && var229 < Statics.field2064) {
                                field716[var5++] = Statics.field588[var229].field571;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var474 == 3616) {
                            field716[var5++] = Statics.field1272;
                            continue;
                        }
                        if (var474 == 3617) {
                            var6--;
                            String var230 = field717[var6];
                            client.method1972(var230);
                            continue;
                        }
                        if (var474 == 3618) {
                            field716[var5++] = Statics.field2525;
                            continue;
                        }
                        if (var474 == 3619) {
                            var6--;
                            String var231 = field717[var6];
                            if (!var231.equals("")) {
                                client.field486.method2376(95);
                                client.field486.method2120(class108.method97(var231));
                                client.field486.method2125(var231);
                            }
                            continue;
                        }
                        if (var474 == 3620) {
                            client.method2436();
                            continue;
                        }
                        if (var474 == 3621) {
                            if (client.field506 == 0) {
                                field716[var5++] = -1;
                            } else {
                                field716[var5++] = client.field509;
                            }
                            continue;
                        }
                        if (var474 == 3622) {
                            var5--;
                            int var232 = field716[var5];
                            if (client.field506 != 0 && var232 < client.field509) {
                                field717[var6++] = client.field260[var232].field131;
                                field717[var6++] = client.field260[var232].field128;
                                continue;
                            }
                            field717[var6++] = "";
                            field717[var6++] = "";
                            continue;
                        }
                        if (var474 == 3623) {
                            var6--;
                            String var233 = field717[var6];
                            if (var233.startsWith(class2.method1882(0)) || var233.startsWith(class2.method1882(1))) {
                                var233 = var233.substring(7);
                            }
                            field716[var5++] = client.method2714(var233) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3624) {
                            var5--;
                            int var234 = field716[var5];
                            if (Statics.field588 != null && var234 < Statics.field2064 && Statics.field588[var234].field575.equalsIgnoreCase(Statics.field524.field51)) {
                                field716[var5++] = 1;
                                continue;
                            }
                            field716[var5++] = 0;
                            continue;
                        }
                        if (var474 == 3625) {
                            if (client.field479 == null) {
                                field717[var6++] = "";
                            } else {
                                String[] var235 = field717;
                                int var236 = var6++;
                                String var237 = client.field479;
                                String var238 = class210.method482(class210.method84(var237));
                                if (var238 == null) {
                                    var238 = "";
                                }
                                var235[var236] = var238;
                            }
                            continue;
                        }
                    } else if (var474 < 4000) {
                        if (var474 == 3903) {
                            var5--;
                            int var240 = field716[var5];
                            field716[var5++] = client.field514[var240].method3408();
                            continue;
                        }
                        if (var474 == 3904) {
                            var5--;
                            int var241 = field716[var5];
                            field716[var5++] = client.field514[var241].field2943;
                            continue;
                        }
                        if (var474 == 3905) {
                            var5--;
                            int var242 = field716[var5];
                            field716[var5++] = client.field514[var242].field2940;
                            continue;
                        }
                        if (var474 == 3906) {
                            var5--;
                            int var243 = field716[var5];
                            field716[var5++] = client.field514[var243].field2941;
                            continue;
                        }
                        if (var474 == 3907) {
                            var5--;
                            int var244 = field716[var5];
                            field716[var5++] = client.field514[var244].field2939;
                            continue;
                        }
                        if (var474 == 3908) {
                            var5--;
                            int var245 = field716[var5];
                            field716[var5++] = client.field514[var245].field2944;
                            continue;
                        }
                        if (var474 == 3910) {
                            var5--;
                            int var246 = field716[var5];
                            int var247 = client.field514[var246].method3407();
                            field716[var5++] = var247 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3911) {
                            var5--;
                            int var248 = field716[var5];
                            int var249 = client.field514[var248].method3407();
                            field716[var5++] = var249 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3912) {
                            var5--;
                            int var250 = field716[var5];
                            int var251 = client.field514[var250].method3407();
                            field716[var5++] = var251 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3913) {
                            var5--;
                            int var252 = field716[var5];
                            int var253 = client.field514[var252].method3407();
                            field716[var5++] = var253 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3914) {
                            var5--;
                            boolean var254 = field716[var5] == 1;
                            if (Statics.field1558 != null) {
                                Statics.field1558.method3425(class202.field2947, var254);
                            }
                            continue;
                        }
                        if (var474 == 3915) {
                            var5--;
                            boolean var255 = field716[var5] == 1;
                            if (Statics.field1558 != null) {
                                Statics.field1558.method3425(class202.field2949, var255);
                            }
                            continue;
                        }
                        if (var474 == 3916) {
                            var5 -= 2;
                            boolean var256 = field716[var5] == 1;
                            boolean var257 = field716[var5 + 1] == 1;
                            if (Statics.field1558 != null) {
                                Statics.field1558.method3425(new class20(var257), var256);
                            }
                            continue;
                        }
                        if (var474 == 3917) {
                            var5--;
                            boolean var258 = field716[var5] == 1;
                            if (Statics.field1558 != null) {
                                Statics.field1558.method3425(class202.field2946, var258);
                            }
                            continue;
                        }
                        if (var474 == 3918) {
                            var5--;
                            boolean var259 = field716[var5] == 1;
                            if (Statics.field1558 != null) {
                                Statics.field1558.method3425(class202.field2948, var259);
                            }
                            continue;
                        }
                        if (var474 == 3919) {
                            field716[var5++] = Statics.field1558 == null ? 0 : Statics.field1558.field2945.size();
                            continue;
                        }
                        if (var474 == 3920) {
                            var5--;
                            int var260 = field716[var5];
                            class195 var261 = (class195) Statics.field1558.field2945.get(var260);
                            field716[var5++] = var261.field2921;
                            continue;
                        }
                        if (var474 == 3921) {
                            var5--;
                            int var262 = field716[var5];
                            class195 var263 = (class195) Statics.field1558.field2945.get(var262);
                            field717[var6++] = var263.method3372();
                            continue;
                        }
                        if (var474 == 3922) {
                            var5--;
                            int var264 = field716[var5];
                            class195 var265 = (class195) Statics.field1558.field2945.get(var264);
                            field717[var6++] = var265.method3369();
                            continue;
                        }
                        if (var474 == 3923) {
                            var5--;
                            int var266 = field716[var5];
                            class195 var267 = (class195) Statics.field1558.field2945.get(var266);
                            long var268 = class104.method1388() - Statics.field789 - var267.field2917;
                            int var270 = (int) (var268 / 3600000L);
                            int var271 = (int) ((var268 - (long) (var270 * 3600000)) / 60000L);
                            int var272 = (int) ((var268 - (long) (var270 * 3600000) - (long) (var271 * 60000)) / 1000L);
                            String var273 = var270 + ":" + var271 / 10 + var271 % 10 + ":" + var272 / 10 + var272 % 10;
                            field717[var6++] = var273;
                            continue;
                        }
                        if (var474 == 3924) {
                            var5--;
                            int var274 = field716[var5];
                            class195 var275 = (class195) Statics.field1558.field2945.get(var274);
                            field716[var5++] = var275.field2919.field2941;
                            continue;
                        }
                        if (var474 == 3925) {
                            var5--;
                            int var276 = field716[var5];
                            class195 var277 = (class195) Statics.field1558.field2945.get(var276);
                            field716[var5++] = var277.field2919.field2940;
                            continue;
                        }
                        if (var474 == 3926) {
                            var5--;
                            int var278 = field716[var5];
                            class195 var279 = (class195) Statics.field1558.field2945.get(var278);
                            field716[var5++] = var279.field2919.field2943;
                            continue;
                        }
                    } else if (var474 < 4100) {
                        if (var474 == 4000) {
                            var5 -= 2;
                            int var280 = field716[var5];
                            int var281 = field716[var5 + 1];
                            field716[var5++] = var280 + var281;
                            continue;
                        }
                        if (var474 == 4001) {
                            var5 -= 2;
                            int var282 = field716[var5];
                            int var283 = field716[var5 + 1];
                            field716[var5++] = var282 - var283;
                            continue;
                        }
                        if (var474 == 4002) {
                            var5 -= 2;
                            int var284 = field716[var5];
                            int var285 = field716[var5 + 1];
                            field716[var5++] = var284 * var285;
                            continue;
                        }
                        if (var474 == 4003) {
                            var5 -= 2;
                            int var286 = field716[var5];
                            int var287 = field716[var5 + 1];
                            field716[var5++] = var286 / var287;
                            continue;
                        }
                        if (var474 == 4004) {
                            var5--;
                            int var288 = field716[var5];
                            field716[var5++] = (int) (Math.random() * (double) var288);
                            continue;
                        }
                        if (var474 == 4005) {
                            var5--;
                            int var289 = field716[var5];
                            field716[var5++] = (int) (Math.random() * (double) (var289 + 1));
                            continue;
                        }
                        if (var474 == 4006) {
                            var5 -= 5;
                            int var290 = field716[var5];
                            int var291 = field716[var5 + 1];
                            int var292 = field716[var5 + 2];
                            int var293 = field716[var5 + 3];
                            int var294 = field716[var5 + 4];
                            field716[var5++] = (var291 - var290) * (var294 - var292) / (var293 - var292) + var290;
                            continue;
                        }
                        if (var474 == 4007) {
                            var5 -= 2;
                            int var295 = field716[var5];
                            int var296 = field716[var5 + 1];
                            field716[var5++] = var295 * var296 / 100 + var295;
                            continue;
                        }
                        if (var474 == 4008) {
                            var5 -= 2;
                            int var297 = field716[var5];
                            int var298 = field716[var5 + 1];
                            field716[var5++] = var297 | 0x1 << var298;
                            continue;
                        }
                        if (var474 == 4009) {
                            var5 -= 2;
                            int var299 = field716[var5];
                            int var300 = field716[var5 + 1];
                            field716[var5++] = var299 & -1 - (0x1 << var300);
                            continue;
                        }
                        if (var474 == 4010) {
                            var5 -= 2;
                            int var301 = field716[var5];
                            int var302 = field716[var5 + 1];
                            field716[var5++] = (var301 & 0x1 << var302) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var474 == 4011) {
                            var5 -= 2;
                            int var303 = field716[var5];
                            int var304 = field716[var5 + 1];
                            field716[var5++] = var303 % var304;
                            continue;
                        }
                        if (var474 == 4012) {
                            var5 -= 2;
                            int var305 = field716[var5];
                            int var306 = field716[var5 + 1];
                            if (var305 == 0) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = (int) Math.pow((double) var305, (double) var306);
                            }
                            continue;
                        }
                        if (var474 == 4013) {
                            var5 -= 2;
                            int var307 = field716[var5];
                            int var308 = field716[var5 + 1];
                            if (var307 == 0) {
                                field716[var5++] = 0;
                            } else if (var308 == 0) {
                                field716[var5++] = Integer.MAX_VALUE;
                            } else {
                                field716[var5++] = (int) Math.pow((double) var307, 1.0D / (double) var308);
                            }
                            continue;
                        }
                        if (var474 == 4014) {
                            var5 -= 2;
                            int var309 = field716[var5];
                            int var310 = field716[var5 + 1];
                            field716[var5++] = var309 & var310;
                            continue;
                        }
                        if (var474 == 4015) {
                            var5 -= 2;
                            int var311 = field716[var5];
                            int var312 = field716[var5 + 1];
                            field716[var5++] = var311 | var312;
                            continue;
                        }
                    } else if (var474 < 4200) {
                        if (var474 == 4100) {
                            var6--;
                            String var313 = field717[var6];
                            var5--;
                            int var314 = field716[var5];
                            field717[var6++] = var313 + var314;
                            continue;
                        }
                        if (var474 == 4101) {
                            var6 -= 2;
                            String var315 = field717[var6];
                            String var316 = field717[var6 + 1];
                            field717[var6++] = var315 + var316;
                            continue;
                        }
                        if (var474 == 4102) {
                            var6--;
                            String var317 = field717[var6];
                            var5--;
                            int var318 = field716[var5];
                            String[] var319 = field717;
                            int var320 = var6++;
                            String var322;
                            if (var318 < 0) {
                                var322 = Integer.toString(var318);
                            } else {
                                var322 = class211.method2990(var318, 10, true);
                            }
                            var319[var320] = var317 + var322;
                            continue;
                        }
                        if (var474 == 4103) {
                            var6--;
                            String var323 = field717[var6];
                            field717[var6++] = var323.toLowerCase();
                            continue;
                        }
                        if (var474 == 4104) {
                            var5--;
                            int var324 = field716[var5];
                            long var325 = ((long) var324 + 11745L) * 86400000L;
                            field721.setTime(new Date(var325));
                            int var327 = field721.get(5);
                            int var328 = field721.get(2);
                            int var329 = field721.get(1);
                            field717[var6++] = var327 + "-" + field722[var328] + "-" + var329;
                            continue;
                        }
                        if (var474 == 4105) {
                            var6 -= 2;
                            String var330 = field717[var6];
                            String var331 = field717[var6 + 1];
                            if (Statics.field524.field36 != null && Statics.field524.field36.field2683) {
                                field717[var6++] = var331;
                                continue;
                            }
                            field717[var6++] = var330;
                            continue;
                        }
                        if (var474 == 4106) {
                            var5--;
                            int var332 = field716[var5];
                            field717[var6++] = Integer.toString(var332);
                            continue;
                        }
                        if (var474 == 4107) {
                            var6 -= 2;
                            int[] var333 = field716;
                            int var334 = var5++;
                            int var335 = class214.method2716(field717[var6], field717[var6 + 1], client.field256);
                            byte var336;
                            if (var335 > 0) {
                                var336 = 1;
                            } else if (var335 < 0) {
                                var336 = -1;
                            } else {
                                var336 = 0;
                            }
                            var333[var334] = var336;
                            continue;
                        }
                        if (var474 == 4108) {
                            var6--;
                            String var337 = field717[var6];
                            var5 -= 2;
                            int var338 = field716[var5];
                            int var339 = field716[var5 + 1];
                            byte[] var340 = Statics.field2052.method2746(var339, 0);
                            class205 var341 = new class205(var340);
                            field716[var5++] = var341.method3442(var337, var338);
                            continue;
                        }
                        if (var474 == 4109) {
                            var6--;
                            String var342 = field717[var6];
                            var5 -= 2;
                            int var343 = field716[var5];
                            int var344 = field716[var5 + 1];
                            byte[] var345 = Statics.field2052.method2746(var344, 0);
                            class205 var346 = new class205(var345);
                            field716[var5++] = var346.method3441(var342, var343);
                            continue;
                        }
                        if (var474 == 4110) {
                            var6 -= 2;
                            String var347 = field717[var6];
                            String var348 = field717[var6 + 1];
                            var5--;
                            if (field716[var5] == 1) {
                                field717[var6++] = var347;
                            } else {
                                field717[var6++] = var348;
                            }
                            continue;
                        }
                        if (var474 == 4111) {
                            var6--;
                            String var349 = field717[var6];
                            field717[var6++] = class204.method3443(var349);
                            continue;
                        }
                        if (var474 == 4112) {
                            var6--;
                            String var350 = field717[var6];
                            var5--;
                            int var351 = field716[var5];
                            field717[var6++] = var350 + (char) var351;
                            continue;
                        }
                        if (var474 == 4113) {
                            var5--;
                            int var352 = field716[var5];
                            field716[var5++] = class211.method3054((char) var352) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4114) {
                            var5--;
                            int var353 = field716[var5];
                            int[] var354 = field716;
                            int var355 = var5++;
                            char var356 = (char) var353;
                            boolean var357 = var356 >= '0' && var356 <= '9' || var356 >= 'A' && var356 <= 'Z' || var356 >= 'a' && var356 <= 'z';
                            var354[var355] = var357 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4115) {
                            var5--;
                            int var358 = field716[var5];
                            int[] var359 = field716;
                            int var360 = var5++;
                            char var361 = (char) var358;
                            boolean var362 = var361 >= 'A' && var361 <= 'Z' || var361 >= 'a' && var361 <= 'z';
                            var359[var360] = var362 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4116) {
                            var5--;
                            int var363 = field716[var5];
                            int[] var364 = field716;
                            int var365 = var5++;
                            char var366 = (char) var363;
                            boolean var367 = var366 >= '0' && var366 <= '9';
                            var364[var365] = var367 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4117) {
                            var6--;
                            String var368 = field717[var6];
                            if (var368 == null) {
                                field716[var5++] = 0;
                            } else {
                                field716[var5++] = var368.length();
                            }
                            continue;
                        }
                        if (var474 == 4118) {
                            var6--;
                            String var369 = field717[var6];
                            var5 -= 2;
                            int var370 = field716[var5];
                            int var371 = field716[var5 + 1];
                            field717[var6++] = var369.substring(var370, var371);
                            continue;
                        }
                        if (var474 == 4119) {
                            var6--;
                            String var372 = field717[var6];
                            StringBuilder var373 = new StringBuilder(var372.length());
                            boolean var374 = false;
                            for (int var375 = 0; var375 < var372.length(); var375++) {
                                char var376 = var372.charAt(var375);
                                if (var376 == '<') {
                                    var374 = true;
                                } else if (var376 == '>') {
                                    var374 = false;
                                } else if (!var374) {
                                    var373.append(var376);
                                }
                            }
                            field717[var6++] = var373.toString();
                            continue;
                        }
                        if (var474 == 4120) {
                            var6--;
                            String var377 = field717[var6];
                            var5--;
                            int var378 = field716[var5];
                            field716[var5++] = var377.indexOf(var378);
                            continue;
                        }
                        if (var474 == 4121) {
                            var6 -= 2;
                            String var379 = field717[var6];
                            String var380 = field717[var6 + 1];
                            var5--;
                            int var381 = field716[var5];
                            field716[var5++] = var379.indexOf(var380, var381);
                            continue;
                        }
                    } else if (var474 < 4300) {
                        if (var474 == 4200) {
                            var5--;
                            int var382 = field716[var5];
                            field717[var6++] = class46.method114(var382).field1026;
                            continue;
                        }
                        if (var474 == 4201) {
                            var5 -= 2;
                            int var383 = field716[var5];
                            int var384 = field716[var5 + 1];
                            class46 var385 = class46.method114(var383);
                            if (var384 >= 1 && var384 <= 5 && var385.field1033[var384 - 1] != null) {
                                field717[var6++] = var385.field1033[var384 - 1];
                                continue;
                            }
                            field717[var6++] = "";
                            continue;
                        }
                        if (var474 == 4202) {
                            var5 -= 2;
                            int var386 = field716[var5];
                            int var387 = field716[var5 + 1];
                            class46 var388 = class46.method114(var386);
                            if (var387 >= 1 && var387 <= 5 && var388.field1038[var387 - 1] != null) {
                                field717[var6++] = var388.field1038[var387 - 1];
                                continue;
                            }
                            field717[var6++] = "";
                            continue;
                        }
                        if (var474 == 4203) {
                            var5--;
                            int var389 = field716[var5];
                            field716[var5++] = class46.method114(var389).field1035;
                            continue;
                        }
                        if (var474 == 4204) {
                            var5--;
                            int var390 = field716[var5];
                            field716[var5++] = class46.method114(var390).field1034 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4205) {
                            var5--;
                            int var391 = field716[var5];
                            class46 var392 = class46.method114(var391);
                            if (var392.field1062 == -1 && var392.field1053 >= 0) {
                                field716[var5++] = var392.field1053;
                                continue;
                            }
                            field716[var5++] = var391;
                            continue;
                        }
                        if (var474 == 4206) {
                            var5--;
                            int var393 = field716[var5];
                            class46 var394 = class46.method114(var393);
                            if (var394.field1062 >= 0 && var394.field1053 >= 0) {
                                field716[var5++] = var394.field1053;
                                continue;
                            }
                            field716[var5++] = var393;
                            continue;
                        }
                        if (var474 == 4207) {
                            var5--;
                            int var395 = field716[var5];
                            field716[var5++] = class46.method114(var395).field1036 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4210) {
                            var6--;
                            String var396 = field717[var6];
                            var5--;
                            int var397 = field716[var5];
                            boolean var399 = var397 == 1;
                            Statics.field144.field2459 = false;
                            String var400 = var396.toLowerCase();
                            short[] var401 = new short[16];
                            int var402 = 0;
                            int var403 = 0;
                            while (true) {
                                if (var403 >= Statics.field1448) {
                                    Statics.field573 = var401;
                                    Statics.field2473 = 0;
                                    Statics.field1068 = var402;
                                    String[] var407 = new String[Statics.field1068];
                                    for (int var408 = 0; var408 < Statics.field1068; var408++) {
                                        var407[var408] = class46.method114(var401[var408]).field1026;
                                    }
                                    short[] var409 = Statics.field573;
                                    class113.method3147(var407, var409, 0, var407.length - 1);
                                    Statics.field144.method2759();
                                    Statics.field144.field2459 = true;
                                    break;
                                }
                                class46 var404 = class46.method114(var403);
                                if ((!var399 || var404.field1037) && var404.field1062 == -1 && var404.field1026.toLowerCase().indexOf(var400) != -1) {
                                    if (var402 >= 250) {
                                        Statics.field1068 = -1;
                                        Statics.field573 = null;
                                        break;
                                    }
                                    if (var402 >= var401.length) {
                                        short[] var405 = new short[var401.length * 2];
                                        for (int var406 = 0; var406 < var402; var406++) {
                                            var405[var406] = var401[var406];
                                        }
                                        var401 = var405;
                                    }
                                    var401[var402++] = (short) var403;
                                }
                                var403++;
                            }
                            field716[var5++] = Statics.field1068;
                            continue;
                        }
                        if (var474 == 4211) {
                            if (Statics.field573 != null && Statics.field2473 < Statics.field1068) {
                                field716[var5++] = Statics.field573[++Statics.field2473 - 1] & 0xFFFF;
                                continue;
                            }
                            field716[var5++] = -1;
                            continue;
                        }
                        if (var474 == 4212) {
                            Statics.field2473 = 0;
                            continue;
                        }
                    } else if (var474 < 5100) {
                        if (var474 == 5000) {
                            field716[var5++] = client.field469;
                            continue;
                        }
                        if (var474 == 5001) {
                            var5 -= 3;
                            client.field469 = field716[var5];
                            int var410 = field716[var5 + 1];
                            class119[] var411 = new class119[] { class119.field1900, class119.field1905, class119.field1911 };
                            class119[] var412 = var411;
                            int var413 = 0;
                            class119 var415;
                            while (true) {
                                if (var413 >= var412.length) {
                                    var415 = null;
                                    break;
                                }
                                class119 var414 = var412[var413];
                                if (var414.field1902 == var410) {
                                    var415 = var414;
                                    break;
                                }
                                var413++;
                            }
                            Statics.field2478 = var415;
                            if (Statics.field2478 == null) {
                                Statics.field2478 = class119.field1900;
                            }
                            client.field470 = field716[var5 + 2];
                            client.field486.method2376(233);
                            client.field486.method2120(client.field469);
                            client.field486.method2120(Statics.field2478.field1902);
                            client.field486.method2120(client.field470);
                            continue;
                        }
                        if (var474 == 5002) {
                            var6--;
                            String var416 = field717[var6];
                            var5 -= 2;
                            int var417 = field716[var5];
                            int var418 = field716[var5 + 1];
                            client.field486.method2376(202);
                            client.field486.method2120(class108.method97(var416) + 2);
                            client.field486.method2125(var416);
                            client.field486.method2120(var417 - 1);
                            client.field486.method2120(var418);
                            continue;
                        }
                        if (var474 == 5003) {
                            var5 -= 2;
                            int var419 = field716[var5];
                            int var420 = field716[var5 + 1];
                            class32 var421 = class10.method2501(var419, var420);
                            if (var421 == null) {
                                field716[var5++] = -1;
                                field716[var5++] = 0;
                                field717[var6++] = "";
                                field717[var6++] = "";
                                field717[var6++] = "";
                            } else {
                                field716[var5++] = var421.field704;
                                field716[var5++] = var421.field705;
                                field717[var6++] = var421.field707 == null ? "" : var421.field707;
                                field717[var6++] = var421.field708 == null ? "" : var421.field708;
                                field717[var6++] = var421.field709 == null ? "" : var421.field709;
                            }
                            continue;
                        }
                        if (var474 == 5004) {
                            var5--;
                            int var422 = field716[var5];
                            class32 var423 = (class32) class10.field148.method3224((long) var422);
                            if (var423 == null) {
                                field716[var5++] = -1;
                                field716[var5++] = 0;
                                field717[var6++] = "";
                                field717[var6++] = "";
                                field717[var6++] = "";
                            } else {
                                field716[var5++] = var423.field706;
                                field716[var5++] = var423.field705;
                                field717[var6++] = var423.field707 == null ? "" : var423.field707;
                                field717[var6++] = var423.field708 == null ? "" : var423.field708;
                                field717[var6++] = var423.field709 == null ? "" : var423.field709;
                            }
                            continue;
                        }
                        if (var474 == 5005) {
                            if (Statics.field2478 == null) {
                                field716[var5++] = -1;
                            } else {
                                field716[var5++] = Statics.field2478.field1902;
                            }
                            continue;
                        }
                        if (var474 == 5008) {
                            var6--;
                            String var425 = field717[var6];
                            var5--;
                            int var426 = field716[var5];
                            String var427 = var425.toLowerCase();
                            byte var428 = 0;
                            if (var427.startsWith(class145.field2326)) {
                                var428 = 0;
                                var425 = var425.substring(class145.field2326.length());
                            } else if (var427.startsWith(class145.field2224)) {
                                var428 = 1;
                                var425 = var425.substring(class145.field2224.length());
                            } else if (var427.startsWith(class145.field2330)) {
                                var428 = 2;
                                var425 = var425.substring(class145.field2330.length());
                            } else if (var427.startsWith(class145.field2332)) {
                                var428 = 3;
                                var425 = var425.substring(class145.field2332.length());
                            } else if (var427.startsWith(class145.field2259)) {
                                var428 = 4;
                                var425 = var425.substring(class145.field2259.length());
                            } else if (var427.startsWith(class145.field2336)) {
                                var428 = 5;
                                var425 = var425.substring(class145.field2336.length());
                            } else if (var427.startsWith(class145.field2370)) {
                                var428 = 6;
                                var425 = var425.substring(class145.field2370.length());
                            } else if (var427.startsWith(class145.field2340)) {
                                var428 = 7;
                                var425 = var425.substring(class145.field2340.length());
                            } else if (var427.startsWith(class145.field2150)) {
                                var428 = 8;
                                var425 = var425.substring(class145.field2150.length());
                            } else if (var427.startsWith(class145.field2344)) {
                                var428 = 9;
                                var425 = var425.substring(class145.field2344.length());
                            } else if (var427.startsWith(class145.field2346)) {
                                var428 = 10;
                                var425 = var425.substring(class145.field2346.length());
                            } else if (var427.startsWith(class145.field2348)) {
                                var428 = 11;
                                var425 = var425.substring(class145.field2348.length());
                            } else if (client.field256 != 0) {
                                if (var427.startsWith(class145.field2327)) {
                                    var428 = 0;
                                    var425 = var425.substring(class145.field2327.length());
                                } else if (var427.startsWith(class145.field2329)) {
                                    var428 = 1;
                                    var425 = var425.substring(class145.field2329.length());
                                } else if (var427.startsWith(class145.field2334)) {
                                    var428 = 2;
                                    var425 = var425.substring(class145.field2334.length());
                                } else if (var427.startsWith(class145.field2333)) {
                                    var428 = 3;
                                    var425 = var425.substring(class145.field2333.length());
                                } else if (var427.startsWith(class145.field2335)) {
                                    var428 = 4;
                                    var425 = var425.substring(class145.field2335.length());
                                } else if (var427.startsWith(class145.field2265)) {
                                    var428 = 5;
                                    var425 = var425.substring(class145.field2265.length());
                                } else if (var427.startsWith(class145.field2339)) {
                                    var428 = 6;
                                    var425 = var425.substring(class145.field2339.length());
                                } else if (var427.startsWith(class145.field2341)) {
                                    var428 = 7;
                                    var425 = var425.substring(class145.field2341.length());
                                } else if (var427.startsWith(class145.field2249)) {
                                    var428 = 8;
                                    var425 = var425.substring(class145.field2249.length());
                                } else if (var427.startsWith(class145.field2220)) {
                                    var428 = 9;
                                    var425 = var425.substring(class145.field2220.length());
                                } else if (var427.startsWith(class145.field2347)) {
                                    var428 = 10;
                                    var425 = var425.substring(class145.field2347.length());
                                } else if (var427.startsWith(class145.field2297)) {
                                    var428 = 11;
                                    var425 = var425.substring(class145.field2297.length());
                                }
                            }
                            String var429 = var425.toLowerCase();
                            byte var430 = 0;
                            if (var429.startsWith(class145.field2354)) {
                                var430 = 1;
                                var425 = var425.substring(class145.field2354.length());
                            } else if (var429.startsWith(class145.field2352)) {
                                var430 = 2;
                                var425 = var425.substring(class145.field2352.length());
                            } else if (var429.startsWith(class145.field2342)) {
                                var430 = 3;
                                var425 = var425.substring(class145.field2342.length());
                            } else if (var429.startsWith(class145.field2356)) {
                                var430 = 4;
                                var425 = var425.substring(class145.field2356.length());
                            } else if (var429.startsWith(class145.field2358)) {
                                var430 = 5;
                                var425 = var425.substring(class145.field2358.length());
                            } else if (client.field256 != 0) {
                                if (var429.startsWith(class145.field2351)) {
                                    var430 = 1;
                                    var425 = var425.substring(class145.field2351.length());
                                } else if (var429.startsWith(class145.field2353)) {
                                    var430 = 2;
                                    var425 = var425.substring(class145.field2353.length());
                                } else if (var429.startsWith(class145.field2221)) {
                                    var430 = 3;
                                    var425 = var425.substring(class145.field2221.length());
                                } else if (var429.startsWith(class145.field2357)) {
                                    var430 = 4;
                                    var425 = var425.substring(class145.field2357.length());
                                } else if (var429.startsWith(class145.field2397)) {
                                    var430 = 5;
                                    var425 = var425.substring(class145.field2397.length());
                                }
                            }
                            client.field486.method2376(161);
                            client.field486.method2120(0);
                            int var431 = client.field486.field1826;
                            client.field486.method2120(var426);
                            client.field486.method2120(var428);
                            client.field486.method2120(var430);
                            class111 var432 = client.field486;
                            int var433 = var432.field1826;
                            int var434 = var425.length();
                            byte[] var435 = new byte[var434];
                            for (int var436 = 0; var436 < var434; var436++) {
                                char var437 = var425.charAt(var436);
                                if (var437 > 0 && var437 < 128 || var437 >= 160 && var437 <= 255) {
                                    var435[var436] = (byte) var437;
                                } else if (var437 == 8364) {
                                    var435[var436] = -128;
                                } else if (var437 == 8218) {
                                    var435[var436] = -126;
                                } else if (var437 == 402) {
                                    var435[var436] = -125;
                                } else if (var437 == 8222) {
                                    var435[var436] = -124;
                                } else if (var437 == 8230) {
                                    var435[var436] = -123;
                                } else if (var437 == 8224) {
                                    var435[var436] = -122;
                                } else if (var437 == 8225) {
                                    var435[var436] = -121;
                                } else if (var437 == 710) {
                                    var435[var436] = -120;
                                } else if (var437 == 8240) {
                                    var435[var436] = -119;
                                } else if (var437 == 352) {
                                    var435[var436] = -118;
                                } else if (var437 == 8249) {
                                    var435[var436] = -117;
                                } else if (var437 == 338) {
                                    var435[var436] = -116;
                                } else if (var437 == 381) {
                                    var435[var436] = -114;
                                } else if (var437 == 8216) {
                                    var435[var436] = -111;
                                } else if (var437 == 8217) {
                                    var435[var436] = -110;
                                } else if (var437 == 8220) {
                                    var435[var436] = -109;
                                } else if (var437 == 8221) {
                                    var435[var436] = -108;
                                } else if (var437 == 8226) {
                                    var435[var436] = -107;
                                } else if (var437 == 8211) {
                                    var435[var436] = -106;
                                } else if (var437 == 8212) {
                                    var435[var436] = -105;
                                } else if (var437 == 732) {
                                    var435[var436] = -104;
                                } else if (var437 == 8482) {
                                    var435[var436] = -103;
                                } else if (var437 == 353) {
                                    var435[var436] = -102;
                                } else if (var437 == 8250) {
                                    var435[var436] = -101;
                                } else if (var437 == 339) {
                                    var435[var436] = -100;
                                } else if (var437 == 382) {
                                    var435[var436] = -98;
                                } else if (var437 == 376) {
                                    var435[var436] = -97;
                                } else {
                                    var435[var436] = 63;
                                }
                            }
                            var432.method2132(var435.length);
                            var432.field1826 += Statics.field2952.method2063(var435, 0, var435.length, var432.field1830, var432.field1826);
                            client.field486.method2255(client.field486.field1826 - var431);
                            continue;
                        }
                        if (var474 == 5009) {
                            var6 -= 2;
                            String var440 = field717[var6];
                            String var441 = field717[var6 + 1];
                            client.field486.method2376(126);
                            client.field486.method2121(0);
                            int var442 = client.field486.field1826;
                            client.field486.method2125(var440);
                            class111 var443 = client.field486;
                            int var444 = var443.field1826;
                            int var445 = var441.length();
                            byte[] var446 = new byte[var445];
                            for (int var447 = 0; var447 < var445; var447++) {
                                char var448 = var441.charAt(var447);
                                if (!(var448 <= 0 || var448 >= 128) || !(var448 < 160 || var448 > 255)) {
                                    var446[var447] = (byte) var448;
                                } else if (var448 == 8364) {
                                    var446[var447] = -128;
                                } else if (var448 == 8218) {
                                    var446[var447] = -126;
                                } else if (var448 == 402) {
                                    var446[var447] = -125;
                                } else if (var448 == 8222) {
                                    var446[var447] = -124;
                                } else if (var448 == 8230) {
                                    var446[var447] = -123;
                                } else if (var448 == 8224) {
                                    var446[var447] = -122;
                                } else if (var448 == 8225) {
                                    var446[var447] = -121;
                                } else if (var448 == 710) {
                                    var446[var447] = -120;
                                } else if (var448 == 8240) {
                                    var446[var447] = -119;
                                } else if (var448 == 352) {
                                    var446[var447] = -118;
                                } else if (var448 == 8249) {
                                    var446[var447] = -117;
                                } else if (var448 == 338) {
                                    var446[var447] = -116;
                                } else if (var448 == 381) {
                                    var446[var447] = -114;
                                } else if (var448 == 8216) {
                                    var446[var447] = -111;
                                } else if (var448 == 8217) {
                                    var446[var447] = -110;
                                } else if (var448 == 8220) {
                                    var446[var447] = -109;
                                } else if (var448 == 8221) {
                                    var446[var447] = -108;
                                } else if (var448 == 8226) {
                                    var446[var447] = -107;
                                } else if (var448 == 8211) {
                                    var446[var447] = -106;
                                } else if (var448 == 8212) {
                                    var446[var447] = -105;
                                } else if (var448 == 732) {
                                    var446[var447] = -104;
                                } else if (var448 == 8482) {
                                    var446[var447] = -103;
                                } else if (var448 == 353) {
                                    var446[var447] = -102;
                                } else if (var448 == 8250) {
                                    var446[var447] = -101;
                                } else if (var448 == 339) {
                                    var446[var447] = -100;
                                } else if (var448 == 382) {
                                    var446[var447] = -98;
                                } else if (var448 == 376) {
                                    var446[var447] = -97;
                                } else {
                                    var446[var447] = 63;
                                }
                            }
                            var443.method2132(var446.length);
                            var443.field1826 += Statics.field2952.method2063(var446, 0, var446.length, var443.field1830, var443.field1826);
                            client.field486.method2129(client.field486.field1826 - var442);
                            continue;
                        }
                        if (var474 == 5015) {
                            String var451;
                            if (Statics.field524 == null || Statics.field524.field51 == null) {
                                var451 = "";
                            } else {
                                var451 = Statics.field524.field51;
                            }
                            field717[var6++] = var451;
                            continue;
                        }
                        if (var474 == 5016) {
                            field716[var5++] = client.field470;
                            continue;
                        }
                        if (var474 == 5017) {
                            var5--;
                            int var452 = field716[var5];
                            int[] var453 = field716;
                            int var454 = var5++;
                            class25 var455 = (class25) class10.field156.get(var452);
                            int var456;
                            if (var455 == null) {
                                var456 = 0;
                            } else {
                                var456 = var455.method512();
                            }
                            var453[var454] = var456;
                            continue;
                        }
                        if (var474 == 5018) {
                            var5--;
                            int var457 = field716[var5];
                            int[] var458 = field716;
                            int var459 = var5++;
                            class32 var460 = (class32) class10.field148.method3224((long) var457);
                            int var461;
                            if (var460 == null) {
                                var461 = -1;
                            } else if (class10.field157.field2871 == var460.field2876) {
                                var461 = -1;
                            } else {
                                var461 = ((class32) var460.field2876).field704;
                            }
                            var458[var459] = var461;
                            continue;
                        }
                        if (var474 == 5019) {
                            var5--;
                            int var462 = field716[var5];
                            int[] var463 = field716;
                            int var464 = var5++;
                            class32 var465 = (class32) class10.field148.method3224((long) var462);
                            int var466;
                            if (var465 == null) {
                                var466 = -1;
                            } else if (class10.field157.field2871 == var465.field2875) {
                                var466 = -1;
                            } else {
                                var466 = ((class32) var465.field2875).field704;
                            }
                            var463[var464] = var466;
                            continue;
                        }
                        if (var474 == 5020) {
                            var6--;
                            String var467 = field717[var6];
                            if (var467.equalsIgnoreCase("toggleroof")) {
                                Statics.field2103.field138 = !Statics.field2103.field138;
                                class9.method669();
                                if (Statics.field2103.field138) {
                                    class10.method100(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method100(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field374 >= 2) {
                                if (var467.equalsIgnoreCase("fpson")) {
                                    client.field266 = true;
                                }
                                if (var467.equalsIgnoreCase("fpsoff")) {
                                    client.field266 = false;
                                }
                                if (var467.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var467.equalsIgnoreCase("clientdrop")) {
                                    client.method2494();
                                }
                                if (var467.equalsIgnoreCase("errortest") && client.field251 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field486.method2376(213);
                            client.field486.method2120(var467.length() + 1);
                            client.field486.method2125(var467);
                            continue;
                        }
                        if (var474 == 5021) {
                            var6--;
                            client.field471 = field717[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var474 == 5022) {
                            field717[var6++] = client.field471;
                            continue;
                        }
                    }
                }
                if (var474 >= 5600 || var474 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var468 = field716[var5];
                int var469 = field716[var5 + 1];
                if (!client.field510) {
                    client.field336 = var468;
                    client.field363 = var469;
                }
            }
        } catch (Exception var473) {
            StringBuilder var471 = new StringBuilder(30);
            var471.append("").append(var4.field2886).append(" ");
            for (int var472 = field719 - 1; var472 >= 0; var472--) {
                var471.append("").append(field714[var472].field190.field2886).append(" ");
            }
            var471.append("").append(var10);
            class137.method880(var471.toString(), var473);
        }
    }

    @ObfuscatedName("ei.y(II)V")
    public static void method2726(int arg0) {
        if (arg0 == -1 || !class155.method128(arg0)) {
            return;
        }
        class155[] var1 = Statics.field2621[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class155 var3 = var1[var2];
            if (var3.field2535 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field8 = var3.field2535;
                method94(var4, 2000000);
            }
        }
    }
}
